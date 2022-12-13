package com.github.chartcore.data.option.elements

import com.github.chartcore.common.PointStyle

/**
 * Created by erenalpaslan on 13.12.2022
 */
data class Point(
    private var radius: Int? = null,
    private var pointStyle: String? = null,
    private var rotation: Int? = null,
    private var backgroundColor: String? = null,
    private var borderWidth: Int? = null,
    private var borderColor: String? = null,
    private var hitRadius: Int? = null,
    private var hoverRadius: Int? = null,
    private var hoverBorderWidth: Int? = null
) {
    fun radius(radius: Int?) = apply { this.radius = radius }
    fun pointStyle(style: PointStyle) = apply { this.pointStyle = style.style }
    fun rotation(rot: Int) = apply { this.rotation = rot }
    fun backgroundColor(color: String) = apply { this.backgroundColor = color }
    fun borderWidth(width: Int) = apply { this.borderWidth = width }
    fun borderColor(color: String) = apply { this.borderColor = color }
    fun hitRadius(radius: Int) = apply { this.hitRadius = radius }
    fun hoverRadius(radius: Int) = apply { this.hoverRadius = radius }
    fun hoverBorderWidth(width: Int) = apply { this.hoverBorderWidth = width }
}
