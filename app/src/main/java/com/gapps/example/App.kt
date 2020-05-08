package com.gapps.example

import androidx.multidex.MultiDexApplication
import com.helpcrunch.library.core.HelpCrunch

class App : MultiDexApplication() {
	override fun onCreate() {
		super.onCreate()

		HelpCrunch.initialize(
				"ledgers",
				3,
				"a4iBedJfx/VPHn4Hrq9DhzYP0jlFvToTPKZMYnJpqujDl/c4g7qYOMHmryAthGVW2skrCr6qZpaU40X0FX1Lsg=="
		)
	}
}