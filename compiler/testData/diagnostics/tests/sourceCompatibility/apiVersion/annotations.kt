// !API_VERSION: 1.0
// IGNORE_IF_NEW_INFERENCE_ENABLED

@SinceKotlin("1.1")
annotation class Anno1(val s: String)

annotation class Anno2 @SinceKotlin("1.1") constructor()


@<!API_NOT_AVAILABLE!>Anno1<!>("")
@<!API_NOT_AVAILABLE!>Anno2<!>
fun t1() {}
