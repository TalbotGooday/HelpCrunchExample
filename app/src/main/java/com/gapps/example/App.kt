package com.gapps.example

import androidx.multidex.MultiDexApplication
import com.helpcrunch.library.core.HelpCrunch
import com.helpcrunch.library.options.HCOptions
import com.helpcrunch.library.options.design.HCTheme

class App : MultiDexApplication() {
	override fun onCreate() {
		super.onCreate()

		HelpCrunch.initialize(
				"ledgers",
				3,
				"a4iBedJfx/VPHn4Hrq9DhzYP0jlFvToTPKZMYnJpqujDl/c4g7qYOMHmryAthGVW2skrCr6qZpaU40X0FX1Lsg==",
				null,
				HCOptions.Builder().setTheme(HCTheme.Builder(R.color.colorPrimaryChat).build()).build()
		)
	}
}