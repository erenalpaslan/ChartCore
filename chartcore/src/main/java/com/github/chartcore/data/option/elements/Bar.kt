package com.github.chartcore.data.option.elements

import com.github.chartcore.common.PointStyle
import com.github.chartcore.common.Skipped

/**
 * Created by erenalpaslan on 13.12.2022
 */
data class Bar(
    private var backgroundColor: String? = null,
    private var borderWidth: Int? = null,
    private var borderColor: String? = null,
    private var borderSkipped: String? = null,
    private var borderRadius: Int? = null,
    private var pointStyle: String? = null
) {
    fun backgroundColor(color: String) = apply { this.backgroundColor = color }
    fun borderWidth(width: Int) = apply { this.borderWidth = width }
    fun borderColor(color: String) = apply { this.borderColor = color }
    fun borderSkipped(borderSkipped: Skipped) = apply { this.borderSkipped = borderSkipped.skipped }
    fun borderRadius(radius: Int) = apply { this.borderRadius = radius }
    fun pointStyle(style: PointStyle) = apply { this.pointStyle = style.style }
}
