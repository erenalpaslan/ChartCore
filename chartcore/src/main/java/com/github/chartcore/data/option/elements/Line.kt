package com.github.chartcore.data.option.elements

import com.github.chartcore.common.BorderJoinStyle
import com.github.chartcore.common.CubicInterpolationMode
import com.github.chartcore.common.LineCap

/**
 * Created by erenalpaslan on 13.12.2022
 */
data class Line(
    private var tension: Float? = null,
    private var backgroundColor: String? = null,
    private var borderWidth: Int? = null,
    private var borderColor: String? = null,
    private var borderCapStyle: String? = null,
    private var borderJoinStyle: String? = null,
    private var capBezierPoints: Boolean? = null,
    private var cubicInterpolationMode: String? = null,
    private var fill: Boolean? = null,
    private var stepped: Boolean? = null
) {
    fun tension(tension: Float) = apply { this.tension = tension }
    fun backgroundColor(color: String) = apply { this.backgroundColor = color }
    fun borderWidth(width: Int) = apply { this.borderWidth = width }
    fun borderColor(color: String) = apply { this.borderColor = color }
    fun borderCapStyle(cap: LineCap) = apply { this.borderCapStyle = cap.cap }
    fun borderJoinStyle(joinStyle: BorderJoinStyle) = apply { this.borderJoinStyle = joinStyle.style }
    fun capBezierPoints(capBezierPoints: Boolean) = apply { this.capBezierPoints = capBezierPoints }
    fun cubicInterpolationMode(mode: CubicInterpolationMode) = apply { this.cubicInterpolationMode = mode.mode }
    fun fill(fill: Boolean) = apply { this.fill = fill }
    fun stepped(stepped: Boolean) = apply { this.stepped = stepped }
}
