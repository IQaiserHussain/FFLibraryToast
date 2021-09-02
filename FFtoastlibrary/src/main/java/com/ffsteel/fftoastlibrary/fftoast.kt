package com.ffsteel.fftoastlibrary

import android.content.Context
import android.widget.Toast

class fftoast {
    fun showfftoast(toastmessage:String,context:Context){
        Toast.makeText(context,toastmessage,Toast.LENGTH_SHORT).show()
    }
}