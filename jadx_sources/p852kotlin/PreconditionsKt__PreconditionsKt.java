package p852kotlin;

import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.messaging.Constants;
import p852kotlin.internal.InlineOnly;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Preconditions.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u0001\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0087\b\u0082\u0002\b\n\u0006\b\u0000\u001a\u0002\u0010\u0001\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0087\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0000\u001a\u0002\u0010\u0001\u001a/\u0010\u0007\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\u00062\b\u0010\u0002\u001a\u0004\u0018\u0001H\bH\u0087\b\u0082\u0002\n\n\b\b\u0000\u001a\u0004\b\u0003\u0010\u0001¢\u0006\u0002\u0010\t\u001a@\u0010\u0007\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\u00062\b\u0010\u0002\u001a\u0004\u0018\u0001H\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0000\u001a\u0004\b\u0003\u0010\u0001¢\u0006\u0002\u0010\n\u001a\u001c\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0087\b\u0082\u0002\b\n\u0006\b\u0000\u001a\u0002\u0010\u0001\u001a-\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0087\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0000\u001a\u0002\u0010\u0001\u001a/\u0010\f\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\u00062\b\u0010\u0002\u001a\u0004\u0018\u0001H\bH\u0087\b\u0082\u0002\n\n\b\b\u0000\u001a\u0004\b\u0003\u0010\u0001¢\u0006\u0002\u0010\t\u001a@\u0010\f\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\u00062\b\u0010\u0002\u001a\u0004\u0018\u0001H\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0000\u001a\u0004\b\u0003\u0010\u0001¢\u0006\u0002\u0010\n\u001a\u0011\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0006H\u0087\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0010"}, m90084d2 = {"require", "", "value", "", "lazyMessage", "Lkotlin/Function0;", "", "requireNotNull", ExifInterface.GPS_DIRECTION_TRUE, "(Ljava/lang/Object;)Ljava/lang/Object;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "check", "checkNotNull", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "message", "kotlin-stdlib"}, m90085k = 5, m90086mv = {2, 2, 0}, m90088xi = 49, m90089xs = "kotlin/PreconditionsKt")
@SourceDebugExtension({"SMAP\nPreconditions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Preconditions.kt\nkotlin/PreconditionsKt__PreconditionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,146:1\n1#2:147\n*E\n"})
class PreconditionsKt__PreconditionsKt extends PreconditionsKt__AssertionsJVMKt {
    @InlineOnly
    private static final void check(boolean z11) {
        if (!z11) {
            throw new IllegalStateException("Check failed.");
        }
    }

    @InlineOnly
    private static final <T> T checkNotNull(T t11) {
        if (t11 != null) {
            return t11;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @InlineOnly
    private static final void require(boolean z11) {
        if (!z11) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    @InlineOnly
    private static final <T> T requireNotNull(T t11) {
        if (t11 != null) {
            return t11;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @InlineOnly
    private static final void check(boolean z11, Function0<? extends Object> lazyMessage) {
        Intrinsics.checkNotNullParameter(lazyMessage, "lazyMessage");
        if (!z11) {
            throw new IllegalStateException(lazyMessage.invoke().toString());
        }
    }

    @InlineOnly
    private static final <T> T checkNotNull(T t11, Function0<? extends Object> lazyMessage) {
        Intrinsics.checkNotNullParameter(lazyMessage, "lazyMessage");
        if (t11 != null) {
            return t11;
        }
        throw new IllegalStateException(lazyMessage.invoke().toString());
    }

    @InlineOnly
    private static final Void error(Object message) {
        Intrinsics.checkNotNullParameter(message, "message");
        throw new IllegalStateException(message.toString());
    }

    @InlineOnly
    private static final void require(boolean z11, Function0<? extends Object> lazyMessage) {
        Intrinsics.checkNotNullParameter(lazyMessage, "lazyMessage");
        if (!z11) {
            throw new IllegalArgumentException(lazyMessage.invoke().toString());
        }
    }

    @InlineOnly
    private static final <T> T requireNotNull(T t11, Function0<? extends Object> lazyMessage) {
        Intrinsics.checkNotNullParameter(lazyMessage, "lazyMessage");
        if (t11 != null) {
            return t11;
        }
        throw new IllegalArgumentException(lazyMessage.invoke().toString());
    }
}
