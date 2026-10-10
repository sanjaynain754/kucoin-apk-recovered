package kotlinx.coroutines;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: kotlinx.coroutines.n2 */
/* JADX INFO: compiled from: Builders.common.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0012\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m90084d2 = {"Lkotlinx/coroutines/n2;", "Lkotlinx/coroutines/a;", "", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "", "active", "<init>", "(Lkotlin/coroutines/CoroutineContext;Z)V", "", "exception", "n0", "(Ljava/lang/Throwable;)Z", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public class C41715n2 extends AbstractC41539a<Unit> {
    public C41715n2(@NotNull CoroutineContext coroutineContext, boolean z11) {
        super(coroutineContext, true, z11);
    }

    @Override // kotlinx.coroutines.JobSupport
    /* JADX INFO: renamed from: n0 */
    public boolean mo90429n0(@NotNull Throwable exception) {
        C41701k0.m91111a(getContext(), exception);
        return true;
    }
}
