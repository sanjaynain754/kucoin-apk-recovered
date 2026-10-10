package androidx.datastore.core;

import androidx.exifinterface.media.ExifInterface;
import org.jetbrains.annotations.NotNull;
import p852kotlin.ExceptionsKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.InlineMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Closeable.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a9\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u0004\b\u0001\u0010\u0001*\u0002H\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u0005H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0007"}, m90084d2 = {"use", "R", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/datastore/core/Closeable;", "block", "Lkotlin/Function1;", "(Landroidx/datastore/core/Closeable;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "datastore-core_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class CloseableKt {
    public static final <T extends Closeable, R> R use(@NotNull T t11, @NotNull Function1<? super T, ? extends R> block) throws Throwable {
        Intrinsics.checkNotNullParameter(t11, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            R rInvoke = block.invoke(t11);
            InlineMarker.finallyStart(1);
            try {
                t11.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
            if (th != null) {
                throw th;
            }
            InlineMarker.finallyEnd(1);
            return rInvoke;
        } catch (Throwable th3) {
            InlineMarker.finallyStart(1);
            try {
                t11.close();
            } catch (Throwable th4) {
                ExceptionsKt.addSuppressed(th3, th4);
            }
            throw th3;
        }
    }
}
