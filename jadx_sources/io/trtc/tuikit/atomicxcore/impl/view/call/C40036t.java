package io.trtc.tuikit.atomicxcore.impl.view.call;

import io.trtc.tuikit.atomicxcore.api.call.CallStore;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.call.t */
/* JADX INFO: loaded from: classes61.dex */
public final class C40036t extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f89060a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C40040x f89061b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40036t(C40040x c40040x, Continuation continuation) {
        super(2, continuation);
        this.f89061b = c40040x;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C40036t c40036t = new C40036t(this.f89061b, continuation);
        c40036t.f89060a = obj;
        return c40036t;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C40036t c40036t = new C40036t(this.f89061b, (Continuation) obj2);
        c40036t.f89060a = (InterfaceC41709m0) obj;
        return c40036t.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.f89060a;
        C40040x c40040x = this.f89061b;
        int i11 = C40040x.f89067q;
        c40040x.getClass();
        if (Intrinsics.areEqual(CallStore.INSTANCE.getShared().getObserverState().getSelfInfo().getValue().getId(), c40040x.f89079l.getId())) {
            C41696j.m91104d(interfaceC41709m0, null, null, new C40018n(this.f89061b, null), 3, null);
            C41696j.m91104d(interfaceC41709m0, null, null, new C40019o(this.f89061b, null), 3, null);
            C41696j.m91104d(interfaceC41709m0, null, null, new C40020p(this.f89061b, null), 3, null);
        } else {
            C41696j.m91104d(interfaceC41709m0, null, null, new C40033q(this.f89061b, null), 3, null);
        }
        C41696j.m91104d(interfaceC41709m0, null, null, new C40034r(this.f89061b, null), 3, null);
        C41696j.m91104d(interfaceC41709m0, null, null, new C40035s(this.f89061b, null), 3, null);
        return Unit.INSTANCE;
    }
}
