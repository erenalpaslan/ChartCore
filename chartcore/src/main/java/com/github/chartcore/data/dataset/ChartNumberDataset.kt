package com.github.chartcore.data.dataset

import com.github.chartcore.common.BorderAlign
import com.github.chartcore.common.BorderJoinStyle
import com.github.chartcore.common.ChartTypes
import com.github.chartcore.common.Dataset

/**
 * Created by erenalpaslan on 27.11.2022
 */
open class ChartNumberDataset(
    private var type: String? = null,
    private var label: String? = null,
    private var data: List<Double> = emptyList(),
    private var backgroundColor: String? = null,
    private var borderAlign: String? = null,
    private var borderColor: String? = null,
    private var borderJoinStyle: String? = null,
    private var borderRadius: Int? = null,
    private var borderWidth: Int? = null,
    private var circumference: Int? = null,
    private var clip: Int? = null,
    private var hoverBackgroundColor: String? = null,
    private var hoverBorderColor: String? = null,
    private var hoverBorderJoinStyle: String? = null,
    private var hoverBorderWidth: Int? = null,
    private var hoverOffset: Int? = null,
    private var offset: Int? = null,
    private var rotation: Int? = null,
    private var spacing: Int? = null,
    private var weight: Int? = null
): Dataset {
    fun type(type: ChartTypes) = apply { this.type = type.type }
    fun label(label: String) = apply { this.label = label }
    fun data(data: List<Double>) = apply { this.data = data }
    fun backgroundColor(backgroundColor: String) = apply { this.backgroundColor = backgroundColor }
    fun borderAlign(align: BorderAlign) = apply { this.borderAlign = align.align }
    fun borderColor(color: String?) = apply { this.borderColor = color }
    fun borderJoinStyle(style: BorderJoinStyle) = apply { this.borderJoinStyle = style.style }
    fun borderRadius(radius: Int) = apply { this.borderRadius = radius }
    fun borderWidth(width: Int) = apply { this.borderWidth = width }
    fun circumference(circumference: Int) = apply { this.circumference = circumference }
    fun clip(clip: Int) = apply { this.clip = clip }
    fun hoverBackgroundColor(color: String) = apply { this.hoverBackgroundColor = color }
    fun hoverBorderColor(color: String) = apply { this.hoverBorderColor = color }
    fun hoverBorderJoinStyle(style: BorderJoinStyle) = apply { this.hoverBorderJoinStyle = style.style }
    fun hoverBorderWidth(width: Int) = apply { this.hoverBorderWidth = width }
    fun hoverOffset(offset: Int) = apply { this.hoverOffset = offset }
    fun offset(offset: Int) = apply { this.offset = offset }
    fun rotation(rotation: Int) = apply { this.rotation = rotation }
    fun spacing(spacing: Int) = apply { this.spacing = spacing }
    fun weight(weight: Int) = apply { this.weight = weight }
}

