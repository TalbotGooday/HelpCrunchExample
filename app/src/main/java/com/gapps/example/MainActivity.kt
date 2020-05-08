package com.gapps.example

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.helpcrunch.library.core.Callback
import com.helpcrunch.library.core.HelpCrunch
import com.helpcrunch.library.core.options.HCOptions
import com.helpcrunch.library.core.options.design.HCTheme
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		open_chat.setOnClickListener { openChat() }

		logout.setOnClickListener { logout() }
	}

	private fun openChat() {
		HelpCrunch.showChatScreen(
				HCOptions.Builder().setTheme(HCTheme.Builder(R.color.colorPrimary, true).build()).build()
		)
	}

	private fun logout() {
		HelpCrunch.logout(object : Callback<Any?>() {
			override fun onSuccess(result: Any?) {
				Toast.makeText(this@MainActivity, "Logged out", Toast.LENGTH_SHORT).show()
			}
		})
	}
}