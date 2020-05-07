package com.gapps.example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.helpcrunch.library.core.HelpCrunch
import com.helpcrunch.library.options.HCOptions
import com.helpcrunch.library.options.design.HCTheme
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		open_chat.setOnClickListener { openChat() }
	}

	private fun openChat() {
		HelpCrunch.showChatScreen(this)
	}
}