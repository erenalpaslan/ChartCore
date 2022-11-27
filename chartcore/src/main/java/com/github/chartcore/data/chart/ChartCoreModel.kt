package com.github.chartcore.data.chart

import com.github.chartcore.common.ChartTypes
import com.github.chartcore.common.Dataset
import com.github.chartcore.data.option.ChartOptions

/**
 * Created by erenalpaslan on 27.11.2022
 */
data class ChartCoreModel(
    private var type: String? = null,
    private var datasets: List<Dataset> = emptyList(),
    private var labels: List<String> = emptyList(),
    private var options: ChartOptions? = null
) {
    fun type(type: ChartTypes) = apply { this.type = type.type }
    fun datasets(list: List<Dataset>) = apply { this.datasets = list }
    fun labels(list: List<String>) = apply { this.labels = list }
    fun options(options: ChartOptions) = apply { this.options }
}