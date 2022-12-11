package com.github.chartcorekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.github.chartcore.common.ChartTypes
import com.github.chartcore.data.chart.ChartCoreModel
import com.github.chartcore.data.chart.ChartData
import com.github.chartcore.data.dataset.ChartNumberDataset
import com.github.chartcore.data.option.ChartOptions
import com.github.chartcore.view.ChartCoreView
import com.github.chartcorekotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding: ActivityMainBinding = DataBindingUtil.setContentView(
            this, R.layout.activity_main)


        val model = ChartCoreModel()
            .type(ChartTypes.BAR)
            .data(
                ChartData(
                    listOf(
                        "2019",
                        "2020",
                        "2021",
                        "2022",
                        "2023"
                    ),
                    listOf(
                        ChartNumberDataset()
                            .data(listOf(
                                60.0,
                                50.0,
                                40.0,
                                120.0,
                                2.0
                            ))
                            .label("Acquisitions by year")
                )
            ))


        binding.chartCore.draw(model)

    }
}