package com.sumsub.sns.internal.features.presentation.preview.ekyc;

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

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.o */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31719o extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f64425a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C31707h0 f64426b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31719o(C31707h0 c31707h0, Continuation continuation) {
        super(2, continuation);
        this.f64426b = c31707h0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C31719o c31719o = new C31719o(this.f64426b, continuation);
        c31719o.f64425a = obj;
        return c31719o;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C31719o c31719o = new C31719o(this.f64426b, (Continuation) obj2);
        c31719o.f64425a = (AbstractC31514B) obj;
        return c31719o.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String string;
        String string2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        AbstractC31514B abstractC31514B = (AbstractC31514B) this.f64425a;
        if (abstractC31514B instanceof C31732v) {
            InterfaceC41669n interfaceC41669n = this.f64426b.f64359B;
            C31732v c31732v = (C31732v) abstractC31514B;
            CharSequence charSequence = c31732v.f64448a;
            if (charSequence != null) {
                string = charSequence.toString();
            } else {
                string = null;
            }
            CharSequence charSequence2 = c31732v.f64449b;
            if (charSequence2 != null) {
                string2 = charSequence2.toString();
            } else {
                string2 = null;
            }
            interfaceC41669n.setValue(new C28799f(0, CollectionsKt.listOf(new C28801h(0, string, string2, c31732v.f64455h)), null, new C28803j()));
        }
        return Unit.INSTANCE;
    }
}
