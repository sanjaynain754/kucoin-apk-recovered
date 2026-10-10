package androidx.tracing;

import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(29)
final class TraceApi29Impl {
    public static void setCounter(@NonNull String str, int i11) {
        android.os.Trace.setCounter(str, i11);
    }

    private TraceApi29Impl() {
    }

    public static void beginAsyncSection(@NonNull String str, int i11) {
        android.os.Trace.beginAsyncSection(str, i11);
    }

    public static void endAsyncSection(@NonNull String str, int i11) {
        android.os.Trace.endAsyncSection(str, i11);
    }

    @DoNotInline
    public static boolean isEnabled() {
        return android.os.Trace.isEnabled();
    }
}
