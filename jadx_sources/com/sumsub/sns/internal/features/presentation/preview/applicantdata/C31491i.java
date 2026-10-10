package com.sumsub.sns.internal.features.presentation.preview.applicantdata;

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

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.applicantdata.i */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31491i extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f63889a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C31476A f63890b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31491i(C31476A c31476a, Continuation continuation) {
        super(2, continuation);
        this.f63890b = c31476a;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C31491i c31491i = new C31491i(this.f63890b, continuation);
        c31491i.f63889a = obj;
        return c31491i;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C31491i c31491i = new C31491i(this.f63890b, (Continuation) obj2);
        c31491i.f63889a = (C31494l) obj;
        return c31491i.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String string;
        String string2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C31494l c31494l = (C31494l) this.f63889a;
        InterfaceC41669n interfaceC41669n = this.f63890b.f63860l;
        CharSequence charSequence = c31494l.f63894c;
        if (charSequence != null) {
            string = charSequence.toString();
        } else {
            string = null;
        }
        CharSequence charSequence2 = c31494l.f63895d;
        if (charSequence2 != null) {
            string2 = charSequence2.toString();
        } else {
            string2 = null;
        }
        interfaceC41669n.setValue(new C28799f(0, CollectionsKt.listOf(new C28801h(0, string, string2, c31494l.f63893b)), null, new C28803j()));
        return Unit.INSTANCE;
    }
}
