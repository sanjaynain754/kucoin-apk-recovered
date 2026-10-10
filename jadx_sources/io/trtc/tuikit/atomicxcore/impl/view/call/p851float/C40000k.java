package io.trtc.tuikit.atomicxcore.impl.view.call.p851float;

import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.call.float.k */
/* JADX INFO: loaded from: classes61.dex */
public final class C40000k extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f88954a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C40002m f88955b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40000k(C40002m c40002m, Continuation continuation) {
        super(2, continuation);
        this.f88955b = c40002m;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C40000k c40000k = new C40000k(this.f88955b, continuation);
        c40000k.f88954a = obj;
        return c40000k;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C40000k c40000k = new C40000k(this.f88955b, (Continuation) obj2);
        c40000k.f88954a = (InterfaceC41709m0) obj;
        return c40000k.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.f88954a;
        C41696j.m91104d(interfaceC41709m0, null, null, new C39997h(this.f88955b, null), 3, null);
        C41696j.m91104d(interfaceC41709m0, null, null, new C39998i(this.f88955b, null), 3, null);
        C41696j.m91104d(interfaceC41709m0, null, null, new C39999j(this.f88955b, null), 3, null);
        return Unit.INSTANCE;
    }
}
