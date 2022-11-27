package com.github.chartcore.data.dataset

import com.github.chartcore.common.ChartTypes
import com.github.chartcore.common.Dataset

/**
 * Created by erenalpaslan on 27.11.2022
 */
open class ChartPointDataset(
    private var type: String? = null,
    private var label: String? = null,
    private var data: List<Double> = emptyList(),
    private var backgroundColor: String? = null,
): Dataset {
    fun type(type: ChartTypes) = apply { this.type = type.type }
    fun label(label: String) = apply { this.label = label }
    fun data(data: List<Double>) = apply { this.data = data }
    fun backgroundColor(backgroundColor: String) = apply { this.backgroundColor = backgroundColor }
}