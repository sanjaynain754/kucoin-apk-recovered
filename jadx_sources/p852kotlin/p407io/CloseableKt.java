package p852kotlin.p407io;

import androidx.exifinterface.media.ExifInterface;
import java.io.Closeable;
import org.jetbrains.annotations.Nullable;
import p852kotlin.ExceptionsKt;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.SinceKotlin;
import p852kotlin.internal.InlineOnly;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.InlineMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Closeable.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u001aH\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u0003\"\u0004\b\u0001\u0010\u0001*\u0002H\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u0005H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u0006\u001a\u0018\u0010\u0007\u001a\u00020\b*\u0004\u0018\u00010\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000b"}, m90084d2 = {"use", "R", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/io/Closeable;", "block", "Lkotlin/Function1;", "(Ljava/io/Closeable;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "closeFinally", "", "cause", "", "kotlin-stdlib"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@JvmName(name = "CloseableKt")
public final class CloseableKt {
    @SinceKotlin(version = "1.1")
    @PublishedApi
    public static final void closeFinally(@Nullable Closeable closeable, @Nullable Throwable th2) {
        if (closeable != null) {
            if (th2 == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th3) {
                ExceptionsKt.addSuppressed(th2, th3);
            }
        }
    }

    @InlineOnly
    private static final <T extends Closeable, R> R use(T t11, Function1<? super T, ? extends R> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            R rInvoke = block.invoke(t11);
            InlineMarker.finallyStart(1);
            closeFinally(t11, null);
            InlineMarker.finallyEnd(1);
            return rInvoke;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                InlineMarker.finallyStart(1);
                closeFinally(t11, th2);
                InlineMarker.finallyEnd(1);
                throw th3;
            }
        }
    }
}
