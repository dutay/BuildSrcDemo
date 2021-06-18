object Versions{
    const val kotlin_stdlib = "1.5.0"
    const val core_ktx = "1.3.1"
    const val appcompat = "1.2.0"
    const val material = "1.2.1"
    const val constraintlayout = "2.0.1"
    const val junit = "4.13.2"
    const val ext_junit = "1.1.2"
    const val espresso_core = "3.3.0"
}


object Libs{
    //系统库
    val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin_stdlib}"
    val core_ktx = "androidx.core:core-ktx:${Versions.core_ktx}"
    val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    val material = "com.google.android.material:material:${Versions.material}"
    val contraintlayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintlayout}"
    val junit = "junit:junit:${Versions.junit}"
    val ext_junit = "androidx.test.ext:junit:${Versions.ext_junit}"
    val espresso_core = "androidx.test.espresso:espresso-core:${Versions.espresso_core}"
}