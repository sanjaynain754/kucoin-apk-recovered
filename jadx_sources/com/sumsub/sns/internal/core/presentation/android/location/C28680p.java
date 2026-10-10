package com.sumsub.sns.internal.core.presentation.android.location;

import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.android.location.p */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28680p extends SuspendLambda implements Function3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f58317a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ InterfaceC28673i f58318b;

    public C28680p(Continuation continuation) {
        super(3, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C28680p c28680p = new C28680p((Continuation) obj3);
        c28680p.f58317a = zBooleanValue;
        c28680p.f58318b = (InterfaceC28673i) obj2;
        return c28680p.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        boolean z11 = this.f58317a;
        InterfaceC28673i interfaceC28673i = this.f58318b;
        if (z11 && (interfaceC28673i instanceof C28671g)) {
            return (C28671g) interfaceC28673i;
        }
        return null;
    }
}
