package okio;

import androidx.exifinterface.media.ExifInterface;
import java.io.Closeable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.ExceptionsKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.InlineMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Okio.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0007¢\u0006\u0002\b\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0001\u001a\n\u0010\u0003\u001a\u00020\u0005*\u00020\u0006\u001aA\u0010\u0007\u001a\u0002H\b\"\u0010\b\u0000\u0010\t*\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\"\u0004\b\u0001\u0010\b*\u0002H\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u0002H\b0\rH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u000e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000f"}, m90084d2 = {"blackholeSink", "Lokio/Sink;", "blackhole", "buffer", "Lokio/BufferedSink;", "Lokio/BufferedSource;", "Lokio/Source;", "use", "R", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/io/Closeable;", "Lokio/Closeable;", "block", "Lkotlin/Function1;", "(Ljava/io/Closeable;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "okio"}, m90085k = 5, m90086mv = {1, 9, 0}, m90088xi = 48, m90089xs = "okio/Okio")
final /* synthetic */ class Okio__OkioKt {
    @NotNull
    public static final BufferedSource buffer(@NotNull Source source) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        return new buffer(source);
    }

    @JvmName(name = "blackhole")
    @NotNull
    public static final Sink blackhole() {
        return new BlackholeSink();
    }

    @NotNull
    public static final BufferedSink buffer(@NotNull Sink sink) {
        Intrinsics.checkNotNullParameter(sink, "<this>");
        return new buffer(sink);
    }

    public static final <T extends Closeable, R> R use(T t11, @NotNull Function1<? super T, ? extends R> block) throws Throwable {
        R rInvoke;
        Intrinsics.checkNotNullParameter(block, "block");
        Throwable th2 = null;
        try {
            rInvoke = block.invoke(t11);
            InlineMarker.finallyStart(1);
            if (t11 != null) {
                try {
                    t11.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
            InlineMarker.finallyEnd(1);
        } catch (Throwable th4) {
            InlineMarker.finallyStart(1);
            if (t11 != null) {
                try {
                    t11.close();
                } catch (Throwable th5) {
                    ExceptionsKt.addSuppressed(th4, th5);
                }
            }
            InlineMarker.finallyEnd(1);
            th2 = th4;
            rInvoke = null;
        }
        if (th2 != null) {
            throw th2;
        }
        Intrinsics.checkNotNull(rInvoke);
        return rInvoke;
    }
}
