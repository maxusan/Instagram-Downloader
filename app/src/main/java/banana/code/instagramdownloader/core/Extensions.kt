package banana.code.instagramdownloader.core

import androidx.fragment.app.Fragment
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController

fun Fragment.navigate(direction: NavDirections){
    kotlin.runCatching {
        findNavController().navigate(direction)
    }
}

fun Fragment.navigateUp(){
    kotlin.runCatching {
        findNavController().navigateUp()
    }
}