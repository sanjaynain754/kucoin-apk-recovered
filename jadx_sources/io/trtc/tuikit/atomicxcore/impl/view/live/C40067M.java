package io.trtc.tuikit.atomicxcore.impl.view.live;

import io.trtc.tuikit.atomicxcore.api.view.LiveCoreView;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.live.M */
/* JADX INFO: loaded from: classes61.dex */
public final class C40067M extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f89131a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LiveCoreView f89132b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40067M(LiveCoreView liveCoreView, Continuation continuation) {
        super(2, continuation);
        this.f89132b = liveCoreView;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C40067M c40067m = new C40067M(this.f89132b, continuation);
        c40067m.f89131a = obj;
        return c40067m;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C40067M c40067m = new C40067M(this.f89132b, (Continuation) obj2);
        c40067m.f89131a = (InterfaceC41709m0) obj;
        return c40067m.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.f89131a;
        C41696j.m91104d(interfaceC41709m0, null, null, new C40063K(this.f89132b, null), 3, null);
        C41696j.m91104d(interfaceC41709m0, null, null, new C40065L(this.f89132b, null), 3, null);
        return Unit.INSTANCE;
    }
}
