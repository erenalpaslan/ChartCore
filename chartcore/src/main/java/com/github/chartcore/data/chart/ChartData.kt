package com.github.chartcore.data.chart

import com.github.chartcore.common.Dataset

/**
 * Created by erenalpaslan on 11.12.2022
 */
data class ChartData(
    var labels: List<String> = emptyList(),
    val datasets: List<Dataset> = emptyList()
)