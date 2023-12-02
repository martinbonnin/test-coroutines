plugins {
  id("org.jetbrains.kotlin.multiplatform").version("1.9.21")
}

kotlin {
  jvm()
  iosArm64()
  
  sourceSets {
    getByName("commonMain") {
      dependencies {

        implementation("org.jetbrains.kotlinx:atomicfu:0.23.1")
        implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.0-RC")
      }
    }
    getByName("jvmTest") {
      dependencies {
        implementation(kotlin("test"))
      }
    }
  }
}