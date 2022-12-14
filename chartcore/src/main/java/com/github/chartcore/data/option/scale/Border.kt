package com.github.chartcore.data.option.scale

/**
 * Created by erenalpaslan on 14.12.2022
 */
data class Border(
    private var display: Boolean? = null,
    private var color: String? = null,
    private var width: Int? = null
) {
    fun display(display: Boolean) = apply { this.display = display }
    fun color(color: String) = apply { this.color = color }
    fun width(width: Int) = apply { this.width = width }
}
