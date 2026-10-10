package androidx.core.util;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;

/* JADX INFO: compiled from: Runnable.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, m90084d2 = {"asRunnable", "Ljava/lang/Runnable;", "Lkotlin/coroutines/Continuation;", "", "core-ktx_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class RunnableKt {
    @NotNull
    public static final Runnable asRunnable(@NotNull Continuation<? super Unit> continuation) {
        return new ContinuationRunnable(continuation);
    }
}
