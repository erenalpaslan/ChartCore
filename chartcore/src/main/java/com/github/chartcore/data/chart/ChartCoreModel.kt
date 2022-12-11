package com.github.chartcore.data.chart

import com.github.chartcore.common.ChartTypes
import com.github.chartcore.data.option.ChartOptions

/**
 * Created by erenalpaslan on 27.11.2022
 */
data class ChartCoreModel(
    private var type: String? = null,
    private var data: ChartData? = null,
    private var options: ChartOptions? = null
) {
    fun type(type: ChartTypes) = apply { this.type = type.type }
    fun data(data: ChartData) = apply { this.data = data }
    fun options(options: ChartOptions) = apply { this.options }
}