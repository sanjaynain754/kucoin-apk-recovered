package com.sumsub.sns.internal.features.presentation.geo;

import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.geo.N */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31058N extends SuspendLambda implements Function3 {

    /* JADX INFO: renamed from: a */
    public int f62787a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ InterfaceC41635f f62788b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f62789c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C31120v0 f62790d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C29983l f62791e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31058N(C29983l c29983l, C31120v0 c31120v0, Continuation continuation) {
        super(3, continuation);
        this.f62790d = c31120v0;
        this.f62791e = c29983l;
    }

    @Override // p852kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C31120v0 c31120v0 = this.f62790d;
        C31058N c31058n = new C31058N(this.f62791e, c31120v0, (Continuation) obj3);
        c31058n.f62788b = (InterfaceC41635f) obj;
        c31058n.f62789c = obj2;
        return c31058n.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f62787a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41635f interfaceC41635f = this.f62788b;
            InterfaceC41634e interfaceC41634eM70577a = C31120v0.m70577a(this.f62790d, this.f62791e, (InterfaceC31123x) this.f62789c);
            this.f62787a = 1;
            if (C41636g.m90878B(interfaceC41635f, interfaceC41634eM70577a, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
