package com.github.chartcore.view

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.webkit.WebView
import com.github.chartcore.common.ChartTypes
import com.github.chartcore.data.chart.ChartCoreModel
import com.github.chartcore.data.dataset.ChartNumberDataset

/**
 * Created by erenalpaslan on 27.11.2022
 */
class ChartCoreView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttrs: Int = 0
): WebView(context, attrs, defStyleAttrs) {

    init {
        initView()
    }

    private fun initView() {
        val model = ChartCoreModel()
            .type(ChartTypes.DOUGHNUT)
            .datasets(listOf(
                ChartNumberDataset()
            ))

        drawChart(model)
    }

    @SuppressLint("SetJavaScriptEnabled")
    private fun drawChart(model: ChartCoreModel) {
        this.settings.javaScriptEnabled = true
        this.settings.domStorageEnabled = true
        this.settings.builtInZoomControls = true
        this.settings.loadWithOverviewMode = true
        this.settings.useWideViewPort = true
        this.settings.allowUniversalAccessFromFileURLs = true
        this.loadUrl("file:///android_asset/chart.html")
    }


}