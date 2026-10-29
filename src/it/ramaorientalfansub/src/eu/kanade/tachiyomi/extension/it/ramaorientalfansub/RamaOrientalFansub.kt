package eu.kanade.tachiyomi.extension.it.ramaorientalfansub

import eu.kanade.tachiyomi.multisrc.madara.Madara
import okhttp3.Headers

class RamaOrientalFansub : Madara(
    "RaMa Oriental Fansub",
    "https://ramaorientalfansub.live",
    "it"
) {
    override fun headersBuilder(): Headers.Builder = Headers.Builder()
        .add("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36")
        .add("Referer", baseUrl)
}
