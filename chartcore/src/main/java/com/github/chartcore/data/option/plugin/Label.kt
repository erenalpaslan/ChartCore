package com.github.chartcore.data.option.plugin

import com.github.chartcore.common.PointStyle

/**
 * Created by erenalpaslan on 12.12.2022
 */
data class Label(
    private var boxWidth: Int? = null,
    private var boxHeight: Int? = null,
    private var color: String? = null,
    private var padding: Int? = null,
    private var pointStyle: String? = null,
    private var usePointStyle: Boolean? = null,
    private var borderRadius: Int? = null,
    private var useBorderRadius: Boolean? = null
) {
    fun boxWidth(width: Int) = apply { this.boxWidth = width }
    fun boxHeight(height: Int) = apply { this.boxHeight = height }
    fun color(color: String) = apply { this.color = color }
    fun padding(padding: Int) = apply { this.padding = padding }
    fun pointStyle(style: PointStyle) = apply {
        this.usePointStyle = true
        this.pointStyle = style.style
    }
    fun borderRadius(radius: Int) = apply {
        this.useBorderRadius = true
        this.borderRadius = radius
    }
}
