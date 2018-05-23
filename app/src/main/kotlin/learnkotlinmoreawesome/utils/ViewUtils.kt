package learnkotlinmoreawesome.utils

import android.view.View

/**
 * Created by Anirut Teerabut on 5/23/2018.
 */
infix fun View.onClick(function: () -> Unit) {
    setOnClickListener { function() }
}

infix fun String.onClick2(function: () -> Unit) {
    setOf<String>()
}