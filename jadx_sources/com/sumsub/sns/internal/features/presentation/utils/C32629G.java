package com.sumsub.sns.internal.features.presentation.utils;

import com.sumsub.sns.internal.features.data.model.common.C29054T;
import com.sumsub.sns.internal.log.C33272c;
import java.io.File;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.utils.G */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32629G extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C29054T f66584a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32635M f66585b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32629G(C29054T c29054t, C32635M c32635m, Continuation continuation) {
        super(2, continuation);
        this.f66584a = c29054t;
        this.f66585b = c32635m;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C32629G(this.f66584a, this.f66585b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C32629G(this.f66584a, this.f66585b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Boolean boolBoxBoolean;
        String absolutePath;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        File file = this.f66584a.f58995b;
        if (file != null) {
            boolBoxBoolean = Boxing.boxBoolean(file.delete());
        } else {
            boolBoxBoolean = null;
        }
        File file2 = this.f66584a.f58995b;
        if (file2 != null) {
            absolutePath = file2.getAbsolutePath();
        } else {
            absolutePath = null;
        }
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "deleting " + absolutePath + " success=" + boolBoxBoolean, null);
        return Unit.INSTANCE;
    }
}
