package com.github.chartcorekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.github.chartcorekotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding: ActivityMainBinding = DataBindingUtil.setContentView(
            this, R.layout.activity_main
        )

        val data = mapOf(
            "2019" to 60.0,
            "2020" to 50.0,
            "2021" to 40.0,
            "2022" to 120.0,
            "2023" to 10.0
        )
        /*
        val coreData = ChartData()
            .addDataset(
                ChartNumberDataset()
                    .data(data.values.toList())
                    .label("Acquisitions by year")
                    .offset(10)
            )
            .labels(data.keys.toList())

        val chartOptions = ChartOptions()
            .plugin(
                Plugin()
                    .subtitle(
                        Title()
                            .display(true)
                            .text("Subtitle example")
                            .position(Position.BOTTOM)
                    ).title(
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
            .elements(
                Elements()
                    .line(
                        Line()
                            .tension(0.5f)
                    )
            )

        val chartModel = ChartCoreModel()
            .type(ChartTypes.LINE)
            .data(coreData)
            .options(chartOptions)


        binding.chartCore.draw(chartModel)
        */
    }
}