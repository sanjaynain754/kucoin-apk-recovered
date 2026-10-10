package qg0;

import kotlinx.coroutines.AbstractC41697j0;
import og0.C43066l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: qg0.j */
/* JADX INFO: compiled from: Dispatcher.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0017¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\f\u0010\u000bJ!\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m90084d2 = {"Lqg0/j;", "Lkotlinx/coroutines/j0;", "<init>", "()V", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "dispatchYield", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "dispatch", "", "parallelism", "", "name", "limitedParallelism", "(ILjava/lang/String;)Lkotlinx/coroutines/j0;", "toString", "()Ljava/lang/String;", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C43739j extends AbstractC41697j0 {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final C43739j f96697b = new C43739j();

    @Override // kotlinx.coroutines.AbstractC41697j0
    public void dispatch(@NotNull CoroutineContext context, @NotNull Runnable block) {
        C43731b.f96681h.m96342L(block, true, false);
    }

    @Override // kotlinx.coroutines.AbstractC41697j0
    public void dispatchYield(@NotNull CoroutineContext context, @NotNull Runnable block) {
        C43731b.f96681h.m96342L(block, true, true);
    }

    @Override // kotlinx.coroutines.AbstractC41697j0
    @NotNull
    /* JADX INFO: renamed from: toString */
    public String getName() {
        return "Dispatchers.IO";
    }

    @Override // kotlinx.coroutines.AbstractC41697j0
    @NotNull
    public AbstractC41697j0 limitedParallelism(int parallelism, @Nullable String name) {
        C43066l.m94607a(parallelism);
        if (parallelism >= C43738i.f96694d) {
            return C43066l.m94608b(this, name);
        }
        return super.limitedParallelism(parallelism, name);
    }
}
