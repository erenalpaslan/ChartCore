package com.github.chartcorekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.github.chartcore.common.ChartTypes
import com.github.chartcore.common.Position
import com.github.chartcore.common.TextAlign
import com.github.chartcore.data.chart.ChartCoreModel
import com.github.chartcore.data.chart.ChartData
import com.github.chartcore.data.dataset.ChartNumberDataset
import com.github.chartcore.data.option.ChartOptions
import com.github.chartcore.data.option.elements.Arc
import com.github.chartcore.data.option.elements.Elements
import com.github.chartcore.data.option.elements.Line
import com.github.chartcore.data.option.plugin.BackgroundColor
import com.github.chartcore.data.option.plugin.Legend
import com.github.chartcore.data.option.plugin.Plugin
import com.github.chartcore.data.option.plugin.Title
import com.github.chartcore.data.option.plugin.Tooltip
import com.github.chartcorekotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding: ActivityMainBinding = DataBindingUtil.setContentView(
            this, R.layout.activity_main
        )

        val coreData = ChartData()
            .addDataset(
                ChartNumberDataset()
                    .data(
                        listOf(
                            60.0,
                            50.0,
                            40.0,
                            120.0,
                            2.0
                        )
                    )
                    .label("Acquisitions by year")
                    .borderRadius(18)
                    .offset(10)
            )
            .labels(
                listOf(
                    "2019",
                    "2020",
                    "2021",
                    "2022",
                    "2023"
                )
            )

        val model = ChartCoreModel()
            .type(ChartTypes.LINE)
            .data(coreData)
            .options(
                ChartOptions()
                    .plugin(
                        Plugin()
                            .subtitle(
                                Title()
                                    .display(true)
                                    .text("Subtitle example")
                                    .position(Position.BOTTOM)
                            )
                            .title(
                                Title()
                                    .display(true)
                                    .text("Title")
                                    .position(Position.TOP)
                                    .align(TextAlign.CENTER)
                                    .color("red")
                            )
                            .tooltip(
                                Tooltip(false)
                            )
                    )
            )


        binding.chartCore.draw(model)

    }
}