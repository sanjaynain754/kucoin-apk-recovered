package okhttp3.internal.cache;

import androidx.media3.extractor.text.ttml.TtmlNode;
import java.io.IOException;
import okio.Sink;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: CacheRequest.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m90084d2 = {"Lokhttp3/internal/cache/CacheRequest;", "", "abort", "", TtmlNode.TAG_BODY, "Lokio/Sink;", "okhttp"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface CacheRequest {
    void abort();

    @NotNull
    Sink body() throws IOException;
}
