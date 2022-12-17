package com.github.chartcore.data.chart

import com.github.chartcore.common.Dataset

/**
 * Created by erenalpaslan on 11.12.2022
 */
data class ChartData(
    private var labels: List<String> = emptyList(),
    private var datasets: MutableList<Dataset> = mutableListOf()
) {
    fun labels(list: List<String>) = apply { this.labels = list }
    fun addDataset(dataset: Dataset) = apply { this.datasets.add(dataset) }
}