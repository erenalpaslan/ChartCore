package com.github.chartcore.data.option.scale

/**
 * Created by erenalpaslan on 14.12.2022
 */
data class Tick(
    private var backdropColor: String? = null,
    private var backdropPadding: String? = null, //Padding object https://www.chartjs.org/docs/latest/general/padding.html
    private var display: Boolean? = null,
    private var color: String? = null,
    private var font: String? = null, //Font object https://www.chartjs.org/docs/latest/general/fonts.html
    private var major: String? = null, //Major object https://www.chartjs.org/docs/latest/axes/styling.html#major-tick-configuration
    private var padding: Int? = null,
    private var showLabelBackdrop: Boolean? = null,
    private var textStrokeColor: String? = null,
    private var textStrokeWidth: Int? = null,
    private var z: Int? = null
) {
    
}