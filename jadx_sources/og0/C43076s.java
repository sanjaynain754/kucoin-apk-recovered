package og0;

import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41725q0;
import kotlinx.coroutines.InterfaceC41550b1;
import kotlinx.coroutines.InterfaceC41708m;
import kotlinx.coroutines.InterfaceC41758t0;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: og0.s */
/* JADX INFO: compiled from: NamedDispatcher.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0013\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0017¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J&\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u0018H\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ,\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00162\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e2\u0006\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, m90084d2 = {"Log0/s;", "Lkotlinx/coroutines/j0;", "Lkotlinx/coroutines/t0;", "dispatcher", "", "name", "<init>", "(Lkotlinx/coroutines/j0;Ljava/lang/String;)V", "Lkotlin/coroutines/CoroutineContext;", "context", "", "isDispatchNeeded", "(Lkotlin/coroutines/CoroutineContext;)Z", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "dispatch", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "dispatchYield", "toString", "()Ljava/lang/String;", "", "timeMillis", "Lkotlinx/coroutines/m;", "continuation", "scheduleResumeAfterDelay", "(JLkotlinx/coroutines/m;)V", "Lkotlinx/coroutines/b1;", "invokeOnTimeout", "(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/b1;", "c", "Lkotlinx/coroutines/j0;", "d", "Ljava/lang/String;", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C43076s extends AbstractC41697j0 implements InterfaceC41758t0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC41758t0 f95274b;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final AbstractC41697j0 dispatcher;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final String name;

    @Override // kotlinx.coroutines.AbstractC41697j0
    public void dispatch(@NotNull CoroutineContext context, @NotNull Runnable block) {
        this.dispatcher.dispatch(context, block);
    }

    @Override // kotlinx.coroutines.AbstractC41697j0
    public void dispatchYield(@NotNull CoroutineContext context, @NotNull Runnable block) {
        this.dispatcher.dispatchYield(context, block);
    }

    @Override // kotlinx.coroutines.InterfaceC41758t0
    @NotNull
    public InterfaceC41550b1 invokeOnTimeout(long timeMillis, @NotNull Runnable block, @NotNull CoroutineContext context) {
        return this.f95274b.invokeOnTimeout(timeMillis, block, context);
    }

    @Override // kotlinx.coroutines.AbstractC41697j0
    public boolean isDispatchNeeded(@NotNull CoroutineContext context) {
        return this.dispatcher.isDispatchNeeded(context);
    }

    @Override // kotlinx.coroutines.InterfaceC41758t0
    public void scheduleResumeAfterDelay(long timeMillis, @NotNull InterfaceC41708m<? super Unit> continuation) {
        this.f95274b.scheduleResumeAfterDelay(timeMillis, continuation);
    }

    @Override // kotlinx.coroutines.AbstractC41697j0
    @NotNull
    /* JADX INFO: renamed from: toString, reason: from getter */
    public String getName() {
        return this.name;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C43076s(@NotNull AbstractC41697j0 abstractC41697j0, @NotNull String str) {
        InterfaceC41758t0 interfaceC41758t0;
        if (abstractC41697j0 instanceof InterfaceC41758t0) {
            interfaceC41758t0 = (InterfaceC41758t0) abstractC41697j0;
        } else {
            interfaceC41758t0 = null;
        }
        this.f95274b = interfaceC41758t0 == null ? C41725q0.m91189a() : interfaceC41758t0;
        this.dispatcher = abstractC41697j0;
        this.name = str;
    }
}
