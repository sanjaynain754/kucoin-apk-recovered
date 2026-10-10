package jumio.camerax;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.camerax.y */
/* JADX INFO: loaded from: classes61.dex */
public final class C40499y implements LifecycleOwner {

    /* JADX INFO: renamed from: a */
    public final InterfaceC41709m0 f89901a;

    /* JADX INFO: renamed from: b */
    public final LifecycleRegistry f89902b;

    public C40499y(InterfaceC41709m0 mainScope) {
        Intrinsics.checkNotNullParameter(mainScope, "mainScope");
        this.f89901a = mainScope;
        this.f89902b = new LifecycleRegistry(this);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.f89902b;
    }

    /* JADX INFO: renamed from: a */
    public final void m89146a(Lifecycle.State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (AbstractC40497w.f89898a[state.ordinal()] == 1) {
            if (this.f89902b.getState() == Lifecycle.State.INITIALIZED) {
                return;
            }
        } else if (this.f89902b.getState() == Lifecycle.State.DESTROYED) {
            return;
        }
        C41696j.m91104d(this.f89901a, null, null, new C40498x(this, state, null), 3, null);
    }
}
