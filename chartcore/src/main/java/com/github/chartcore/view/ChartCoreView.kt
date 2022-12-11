package com.github.chartcore.view

import android.annotation.SuppressLint
import android.content.Context
import android.database.Observable
import android.util.AttributeSet
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import com.github.chartcore.common.ChartTypes
import com.github.chartcore.data.chart.ChartCoreModel
import com.github.chartcore.data.dataset.ChartNumberDataset
import com.google.gson.Gson
import kotlin.properties.ObservableProperty


/**
 * Created by erenalpaslan on 27.11.2022
 */
class ChartCoreView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttrs: Int = 0
): WebView(context, attrs, defStyleAttrs) {

    private var coreModel: ChartCoreModel? = null
    private var pageFisnished: Boolean = false
    init {
        initView()
    }

    @SuppressLint("SetJavaScriptEnabled")
    private fun initView() {
        this.setInitialScale(1)
        this.settings.javaScriptEnabled = true
        this.settings.useWideViewPort = true
        this.settings.loadWithOverviewMode = false
        this.settings.builtInZoomControls = true
        this.settings.layoutAlgorithm = WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING
        this.settings.allowUniversalAccessFromFileURLs = true
        this.loadUrl("file:///android_asset/chart.html")
        this.webViewClient = object : WebViewClient() {
            override fun onPageFinished(view: WebView, url: String) {
                pageFisnished = true
                coreModel?.let { draw(it) }
            }
        }
    }

    fun draw(model: ChartCoreModel) {
        this.coreModel = model
        if (pageFisnished) {
            drawChartWithCoreModel(this.coreModel)
        }

    }


    private fun drawChartWithCoreModel(model: ChartCoreModel?) {
        val jsonCoreModel = Gson().toJson(model)
        this.evaluateJavascript("draw('${jsonCoreModel}');") {returnValue ->

        }
    }


}