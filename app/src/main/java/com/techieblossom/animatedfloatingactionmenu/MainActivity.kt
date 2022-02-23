package com.techieblossom.animatedfloatingactionmenu

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.material.Scaffold
import androidx.compose.runtime.*
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.techieblossom.animatedfloatingactionmenu.ui.composables.PBottomAppBar
import com.techieblossom.animatedfloatingactionmenu.ui.composables.PFloatingBottomActionMenu
import com.techieblossom.animatedfloatingactionmenu.ui.composables.PLazyGrid
import com.techieblossom.animatedfloatingactionmenu.ui.composables.PTopAppBar
import com.techieblossom.animatedfloatingactionmenu.ui.theme.AnimatedFloatingActionMenuTheme

@ExperimentalAnimationApi
@ExperimentalFoundationApi
class MainActivity : ComponentActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      AnimatedFloatingActionMenuTheme {
        MainContent()
      }
    }
  }
}

@ExperimentalAnimationApi
@ExperimentalFoundationApi
@Composable
fun MainContent() {
  Scaffold(
    topBar = { PTopAppBar(title = stringResource(R.string.weird_app)) }) {
    Box {
      var isVisible by remember { mutableStateOf(false) }
      PLazyGrid()
      PFloatingBottomActionMenu(isVisible)
      PBottomAppBar(isVisible) { isVisible = !isVisible }
    }
  }
}

@ExperimentalAnimationApi
@ExperimentalFoundationApi
@Preview
@Composable
fun Preview_MainContent() {
  AnimatedFloatingActionMenuTheme {
    MainContent()
  }
}