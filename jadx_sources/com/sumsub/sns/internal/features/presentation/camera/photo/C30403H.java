package com.sumsub.sns.internal.features.presentation.camera.photo;

import com.sumsub.sns.core.presentation.base.C28075O;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.H */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30403H extends SuspendLambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C30736v0 f61169a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C28075O f61170b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30403H(C30736v0 c30736v0, C28075O c28075o, Continuation continuation) {
        super(1, continuation);
        this.f61169a = c30736v0;
        this.f61170b = c28075o;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C30403H(this.f61169a, this.f61170b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C30403H(this.f61169a, this.f61170b, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C30736v0 c30736v0 = this.f61169a;
        C29983l c29983l = this.f61170b.f57271c;
        int i11 = C30736v0.f62087V;
        String strM70441a = c30736v0.m70441a(c29983l, "sns_step_%s_selector_title");
        if (strM70441a == null) {
            return "";
        }
        return strM70441a;
    }
}
