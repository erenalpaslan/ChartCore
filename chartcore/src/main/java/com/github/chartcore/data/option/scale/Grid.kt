package com.github.chartcore.data.option.scale

/**
 * Created by erenalpaslan on 14.12.2022
 */
data class Grid(
    private var circular: Boolean? = null,
    private var color: String? = null,
    private var display: Boolean? = null,
    private var drawOnChartArea: Boolean? = null,
    private var drawTicks: Boolean? = null,
    private var lineWidth: Int? = null,
    private var offset: Boolean? = null,
    private var tickColor: String? = null,
    private var tickLength: Int? = null,
    private var tickWidth: Int? = null,
    private var z: Int? = null
) {
    fun circular(circular: Boolean) = apply { this.circular = circular }
    fun color(color: String) = apply { this.color = color }
    fun display(display: Boolean) = apply { this.display = display }
    fun drawOnChartArea(drawOnChartArea: Boolean) = apply { this.drawOnChartArea = drawOnChartArea }
    fun drawTicks(drawTicks: Boolean) = apply { this.drawTicks = drawTicks }
    fun lineWidth(width: Int) = apply { this.lineWidth = width }
    fun offset(offset: Boolean) = apply { this.offset = offset }
    fun tickColor(color: String) = apply { this.tickColor = color }
    fun tickLength(length: Int) = apply { this.tickLength = length }
    fun tickWidth(width: Int) = apply { this.tickWidth = width }
    fun z(z: Int) = apply { this.z = z }
}
