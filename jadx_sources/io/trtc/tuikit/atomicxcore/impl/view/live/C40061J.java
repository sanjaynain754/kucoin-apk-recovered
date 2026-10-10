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

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.live.J */
/* JADX INFO: loaded from: classes61.dex */
public final class C40061J extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f89120a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LiveCoreView f89121b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40061J(LiveCoreView liveCoreView, Continuation continuation) {
        super(2, continuation);
        this.f89121b = liveCoreView;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C40061J c40061j = new C40061J(this.f89121b, continuation);
        c40061j.f89120a = obj;
        return c40061j;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C40061J c40061j = new C40061J(this.f89121b, (Continuation) obj2);
        c40061j.f89120a = (InterfaceC41709m0) obj;
        return c40061j.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C41696j.m91104d((InterfaceC41709m0) this.f89120a, null, null, new C40059I(this.f89121b, null), 3, null);
        return Unit.INSTANCE;
    }
}
