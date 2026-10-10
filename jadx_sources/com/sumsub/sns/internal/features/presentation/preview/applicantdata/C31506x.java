package com.sumsub.sns.internal.features.presentation.preview.applicantdata;

import com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0;
import com.sumsub.sns.internal.core.presentation.form.model.AbstractC28843f0;
import com.sumsub.sns.internal.core.presentation.form.model.AbstractC28845g0;
import java.util.ArrayList;
import java.util.List;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.applicantdata.x */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31506x extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f63927a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC28841e0 f63928b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31506x(AbstractC28841e0 abstractC28841e0, Continuation continuation) {
        super(2, continuation);
        this.f63928b = abstractC28841e0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C31506x c31506x = new C31506x(this.f63928b, continuation);
        c31506x.f63927a = obj;
        return c31506x;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C31506x c31506x = new C31506x(this.f63928b, (Continuation) obj2);
        c31506x.f63927a = (C31494l) obj;
        return c31506x.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AbstractC28841e0 abstractC28841e0M69657a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C31494l c31494l = (C31494l) this.f63927a;
        List<AbstractC28841e0> list = c31494l.f63893b;
        AbstractC28841e0 abstractC28841e0 = this.f63928b;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (AbstractC28841e0 abstractC28841e1 : list) {
            if (!Intrinsics.areEqual(AbstractC28843f0.m69656a(abstractC28841e1), AbstractC28843f0.m69656a(abstractC28841e0))) {
                abstractC28841e0M69657a = abstractC28841e1;
            } else {
                abstractC28841e0M69657a = null;
            }
            if (abstractC28841e0M69657a == null) {
                abstractC28841e0M69657a = AbstractC28845g0.m69657a(abstractC28841e1, null);
            }
            arrayList.add(abstractC28841e0M69657a);
        }
        return C31494l.m70756a(c31494l, null, arrayList, null, null, null, false, 61);
    }
}
