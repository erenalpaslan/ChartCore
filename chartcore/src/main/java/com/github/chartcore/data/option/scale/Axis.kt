package com.github.chartcore.data.option.scale

/**
 * Created by erenalpaslan on 14.12.2022
 */
data class Axis(
    private var alignToPixels: Boolean? = null,
    private var backgroundColor: String? = null,
    private var border: Border? = null,
    private var display: Boolean? = null,
    private var grid: Grid? = null,
    private var min: Double? = null,
    private var max: Double? = null,
    private var reverse: Boolean? = null,
    private var ticks: Tick? = null,
) {
    fun alignToPixels(align: Boolean) = apply { this.alignToPixels = align }
    fun backgroundColor(color: String) = apply { this.backgroundColor = color }
    fun display(display: Boolean) = apply { this.display = display }
    fun min(min: Double) = apply { this.min = min }
    fun max(max: Double) = apply { this.max = max }
    fun reverse(reverse: Boolean) = apply { this.reverse = reverse }
    fun border(border: Border) = apply { this.border = border }
    fun grid(grid: Grid) = apply { this.grid = grid }
    fun ticks(tick: Tick) = apply { this.ticks = tick }
}
