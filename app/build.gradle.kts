plugins {
	alias(libs.plugins.android.application)
	alias(libs.plugins.kotlin.android)
	alias(libs.plugins.kotlin.compose)
	alias(libs.plugins.google.android.libraries.mapsplatform.secrets.gradle.plugin)
	alias(libs.plugins.androidx.navigation.safeargs)
}

android {
	namespace = "com.xeroxparc.pokedex"
	compileSdk = 36

	defaultConfig {
		applicationId = "com.xeroxparc.pokedex"
		minSdk = 33
		targetSdk = 36
		versionCode = 1
		versionName = "1.0"

		testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
	}

	buildTypes {
		release {
			isMinifyEnabled = false
			proguardFiles(
				getDefaultProguardFile("proguard-android-optimize.txt"),
				"proguard-rules.pro"
			)
		}
	}
	compileOptions {
		sourceCompatibility = JavaVersion.VERSION_17
		targetCompatibility = JavaVersion.VERSION_17
	}
	kotlinOptions {
		jvmTarget = "17"
	}
	buildFeatures {
		dataBinding = true
		viewBinding = true
		compose = true
		buildConfig = true
	}
}

dependencies {

	implementation(libs.androidx.core.ktx)
	implementation(libs.androidx.lifecycle.runtime.ktx)
	implementation(libs.androidx.lifecycle.viewmodel.compose)
	implementation(libs.androidx.activity.compose)
	implementation(platform(libs.androidx.compose.bom))
	implementation(libs.androidx.ui)
	implementation(libs.androidx.ui.graphics)
	implementation(libs.androidx.ui.tooling.preview)
	implementation(libs.androidx.material3)
	implementation(libs.generativeai)
	testImplementation(libs.junit)
	androidTestImplementation(libs.androidx.junit)
	androidTestImplementation(libs.androidx.espresso.core)
	androidTestImplementation(platform(libs.androidx.compose.bom))
	androidTestImplementation(libs.androidx.ui.test.junit4)
	debugImplementation(libs.androidx.ui.tooling)
	debugImplementation(libs.androidx.ui.test.manifest)

	//...

	implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

	implementation(libs.appcompat)
	implementation(libs.constraintlayout)
	implementation(libs.swiperefreshlayout)
	implementation(libs.constraintlayout) // Note: This is a duplicate from your list, keep or remove as needed

	implementation(libs.lifecycle.viewmodel)
	implementation(libs.lifecycle.livedata)
	implementation(libs.lifecycle.common.java8)

	implementation(libs.material)

	implementation(libs.navigation.fragment)
	implementation(libs.navigation.runtime)
	implementation(libs.navigation.ui)

	implementation(libs.retrofit)
	implementation(libs.retrofit.converter.gson)
	implementation(libs.okhttp.logging.interceptor)

	implementation(libs.room.runtime)
	annotationProcessor(libs.room.compiler)

	implementation(libs.paging.runtime)

	implementation(libs.glide)
	annotationProcessor(libs.glide.compiler)

	implementation(libs.android.gif.drawable)
	implementation(libs.image.slideshow)
}