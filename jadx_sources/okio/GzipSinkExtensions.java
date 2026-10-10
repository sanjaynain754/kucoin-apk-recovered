package okio;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: okio.-GzipSinkExtensions, reason: invalid class name */
/* JADX INFO: compiled from: GzipSink.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0086\b¨\u0006\u0003"}, m90084d2 = {"gzip", "Lokio/GzipSink;", "Lokio/Sink;", "okio"}, m90085k = 2, m90086mv = {1, 9, 0}, m90088xi = 48)
@JvmName(name = "-GzipSinkExtensions")
public final class GzipSinkExtensions {
    @NotNull
    public static final GzipSink gzip(@NotNull Sink sink) {
        Intrinsics.checkNotNullParameter(sink, "<this>");
        return new GzipSink(sink);
    }
}
