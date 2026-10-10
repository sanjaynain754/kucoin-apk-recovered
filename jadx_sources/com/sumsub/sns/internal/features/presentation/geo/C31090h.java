package com.sumsub.sns.internal.features.presentation.geo;

import com.sumsub.sns.core.presentation.base.AbstractC28082W;
import com.sumsub.sns.internal.core.presentation.form.C28799f;
import com.sumsub.sns.internal.core.presentation.form.C28801h;
import com.sumsub.sns.internal.core.presentation.form.C28803j;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.geo.h */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31090h extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f62862a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C31120v0 f62863b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31090h(C31120v0 c31120v0, Continuation continuation) {
        super(2, continuation);
        this.f62863b = c31120v0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C31090h c31090h = new C31090h(this.f62863b, continuation);
        c31090h.f62862a = obj;
        return c31090h;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C31090h c31090h = new C31090h(this.f62863b, (Continuation) obj2);
        c31090h.f62862a = (AbstractC28082W) obj;
        return c31090h.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String string;
        String string2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        AbstractC28082W abstractC28082W = (AbstractC28082W) this.f62862a;
        if (abstractC28082W instanceof C31128z0) {
            InterfaceC41669n interfaceC41669n = this.f62863b.f62935u;
            C31128z0 c31128z0 = (C31128z0) abstractC28082W;
            CharSequence charSequence = c31128z0.f62947a;
            if (charSequence != null) {
                string = charSequence.toString();
            } else {
                string = null;
            }
            CharSequence charSequence2 = c31128z0.f62948b;
            if (charSequence2 != null) {
                string2 = charSequence2.toString();
            } else {
                string2 = null;
            }
            interfaceC41669n.setValue(new C28799f(0, CollectionsKt.listOf(new C28801h(0, string, string2, c31128z0.f62949c)), null, new C28803j()));
        }
        return Unit.INSTANCE;
    }
}
