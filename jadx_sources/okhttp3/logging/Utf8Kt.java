package okhttp3.logging;

import java.io.EOFException;
import okio.Buffer;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: utf8.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m90084d2 = {"isProbablyUtf8", "", "Lokio/Buffer;", "okhttp-logging-interceptor"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class Utf8Kt {
    public static final boolean isProbablyUtf8(@NotNull Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        try {
            Buffer buffer2 = new Buffer();
            buffer.copyTo(buffer2, 0L, RangesKt.coerceAtMost(buffer.size(), 64L));
            for (int i11 = 0; i11 < 16 && !buffer2.exhausted(); i11++) {
                int utf8CodePoint = buffer2.readUtf8CodePoint();
                if (Character.isISOControl(utf8CodePoint) && !Character.isWhitespace(utf8CodePoint)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
