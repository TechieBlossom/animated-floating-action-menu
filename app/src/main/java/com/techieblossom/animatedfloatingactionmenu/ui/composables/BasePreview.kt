package com.techieblossom.animatedfloatingactionmenu.ui.composables

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import com.techieblossom.animatedfloatingactionmenu.ui.theme.AnimatedFloatingActionMenuTheme

@Composable
fun BasePreview(content: @Composable () -> Unit) {
  AnimatedFloatingActionMenuTheme {
    Surface(color = MaterialTheme.colors.background) {
      content()
    }
  }
}