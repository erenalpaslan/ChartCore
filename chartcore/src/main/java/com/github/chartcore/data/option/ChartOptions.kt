package com.github.chartcore.data.option

/**
 * Created by erenalpaslan on 27.11.2022
 */
data class ChartOptions(
    val animations: String? = null,
    val scales: String? = null,
    val plugins: String? = null,
    val devicePixelRatio: Int? = null,
    val elements: String? = null,
    val interaction: String? = null,
    val events: String? = null,
    val layout: String? = null,
    val locale: String? = null,
    val responsive: Boolean = true,
    val maintainAspectRatio: Boolean = true,
    val aspectRatio: String? = null,
    val onResize: String? = null,
    val resizeDelay: String? = null
)
