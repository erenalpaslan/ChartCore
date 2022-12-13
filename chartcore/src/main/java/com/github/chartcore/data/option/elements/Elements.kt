package com.github.chartcore.data.option.elements

/**
 * Created by erenalpaslan on 13.12.2022
 */
data class Elements (
    private var point: Point? = null,
    private var line: Line? = null,
    private var bar: Bar? = null,
    private var arc: Arc? = null
) {
    fun point(point: Point) = apply { this.point = point }
    fun line(line: Line) = apply { this.line = line }
    fun bar(bar: Bar) = apply { this.bar = bar }
    fun arc(arc: Arc) = apply { this.arc = arc }
}