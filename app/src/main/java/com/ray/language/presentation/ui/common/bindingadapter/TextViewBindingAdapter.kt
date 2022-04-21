package com.ray.language.presentation.ui.common.bindingadapter

import android.widget.TextView
import androidx.core.view.isVisible
import androidx.databinding.BindingAdapter
import com.ray.language.common.util.isNotEmpty

@BindingAdapter("visibleOrGone")
fun TextView.visibleOrGone(text: CharSequence?) {
    this.isVisible = text.isNotEmpty
}