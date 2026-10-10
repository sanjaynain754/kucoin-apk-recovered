package com.sumsub.sns.internal.core.domain;

import androidx.datastore.preferences.core.MutablePreferences;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.domain.p */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28594p extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f58206a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f58207b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28594p(String str, Continuation continuation) {
        super(2, continuation);
        this.f58207b = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C28594p c28594p = new C28594p(this.f58207b, continuation);
        c28594p.f58206a = obj;
        return c28594p;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C28594p c28594p = new C28594p(this.f58207b, (Continuation) obj2);
        c28594p.f58206a = (MutablePreferences) obj;
        return c28594p.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ((MutablePreferences) this.f58206a).set(C28598r.f58212d, this.f58207b);
        return Unit.INSTANCE;
    }
}
