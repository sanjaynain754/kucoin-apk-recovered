package kotlinx.coroutines;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: kotlinx.coroutines.w2 */
/* JADX INFO: compiled from: Unconfined.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m90084d2 = {"Lkotlinx/coroutines/w2;", "Lkotlinx/coroutines/j0;", "<init>", "()V", "", "parallelism", "", "name", "limitedParallelism", "(ILjava/lang/String;)Lkotlinx/coroutines/j0;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "isDispatchNeeded", "(Lkotlin/coroutines/CoroutineContext;)Z", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "dispatch", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "toString", "()Ljava/lang/String;", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C41772w2 extends AbstractC41697j0 {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final C41772w2 f91877b = new C41772w2();

    @Override // kotlinx.coroutines.AbstractC41697j0
    public boolean isDispatchNeeded(@NotNull CoroutineContext context) {
        return false;
    }

    @Override // kotlinx.coroutines.AbstractC41697j0
    public void dispatch(@NotNull CoroutineContext context, @NotNull Runnable block) {
        C41543a3 c41543a3 = (C41543a3) context.get(C41543a3.INSTANCE);
        if (c41543a3 == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        c41543a3.dispatcherWasUnconfined = true;
    }

    @Override // kotlinx.coroutines.AbstractC41697j0
    @NotNull
    public AbstractC41697j0 limitedParallelism(int parallelism, @Nullable String name) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // kotlinx.coroutines.AbstractC41697j0
    @NotNull
    /* JADX INFO: renamed from: toString */
    public String getName() {
        return "Dispatchers.Unconfined";
    }
}
