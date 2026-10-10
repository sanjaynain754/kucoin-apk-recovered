package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.z2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30662z2 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f61963a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f61964b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30662z2(int i11, Continuation continuation) {
        super(2, continuation);
        this.f61964b = i11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C30662z2 c30662z2 = new C30662z2(this.f61964b, continuation);
        c30662z2.f61963a = obj;
        return c30662z2;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C30662z2 c30662z2 = new C30662z2(this.f61964b, (Continuation) obj2);
        c30662z2.f61963a = (C30627s1) obj;
        return c30662z2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C30622r1 c30622r1;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C30627s1 c30627s1 = (C30627s1) this.f61963a;
        C30622r1 c30622r2 = c30627s1.f61878b;
        if (c30622r2 != null) {
            c30622r1 = new C30622r1(this.f61964b, c30622r2.f61868a);
        } else {
            c30622r1 = null;
        }
        return C30627s1.m70414a(c30627s1, false, c30622r1, 3);
    }
}
