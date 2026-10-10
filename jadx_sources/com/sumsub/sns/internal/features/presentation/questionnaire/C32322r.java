package com.sumsub.sns.internal.features.presentation.questionnaire;

import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.internal.core.presentation.form.C28801h;
import com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0;
import com.sumsub.sns.internal.core.presentation.form.model.C28823Q;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.features.data.model.common.C29069W2;
import com.sumsub.sns.internal.features.data.model.common.C29110e3;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.features.domain.C30084S;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function4;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.questionnaire.r */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32322r extends SuspendLambda implements Function4 {

    /* JADX INFO: renamed from: a */
    public int f65848a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f65849b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ C30084S f65850c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ boolean f65851d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C32300I f65852e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C29983l f65853f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C32320p f65854g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32322r(C32300I c32300i, C29983l c29983l, C32320p c32320p, Continuation continuation) {
        super(4, continuation);
        this.f65852e = c32300i;
        this.f65853f = c29983l;
        this.f65854g = c32320p;
    }

    @Override // p852kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        C32322r c32322r = new C32322r(this.f65852e, this.f65853f, this.f65854g, (Continuation) obj4);
        c32322r.f65849b = (SNSQuestionnaireViewModel$Step) obj;
        c32322r.f65850c = (C30084S) obj2;
        c32322r.f65851d = zBooleanValue;
        return c32322r.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SNSQuestionnaireViewModel$Step sNSQuestionnaireViewModel$Step;
        boolean z11;
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f65848a;
        boolean z12 = false;
        if (i11 != 0) {
            if (i11 == 1) {
                z11 = this.f65851d;
                sNSQuestionnaireViewModel$Step = (SNSQuestionnaireViewModel$Step) this.f65849b;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            sNSQuestionnaireViewModel$Step = (SNSQuestionnaireViewModel$Step) this.f65849b;
            C30084S c30084s = this.f65850c;
            boolean z13 = this.f65851d;
            if (c30084s != null) {
                int i12 = AbstractC32321q.f65847a[sNSQuestionnaireViewModel$Step.ordinal()];
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 == 3) {
                            C32300I c32300i = this.f65852e;
                            KProperty[] kPropertyArr = C32300I.f65798w;
                            c32300i.m71093i();
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        C32300I c32300i2 = this.f65852e;
                        KProperty[] kPropertyArr2 = C32300I.f65798w;
                        C28801h c28801h = (C28801h) CollectionsKt.getOrNull(c32300i2.m71091g().f58567b, c32300i2.m71089e());
                        if (c28801h == null) {
                            AbstractC28052C.throwError$default(c32300i2, new IllegalStateException("Empty questionnaire"), c32300i2.f65807i, null, 4, null);
                        } else {
                            C29069W2 c29069w2M69741a = C29069W2.m69741a(c32300i2.m71090f(), null, 3);
                            for (AbstractC28841e0 abstractC28841e0 : c28801h.f58573d) {
                                if ((abstractC28841e0 instanceof C28823Q) && (str = ((C28823Q) abstractC28841e0).f58626e) != null && c29069w2M69741a.f59013b.get(str) == null) {
                                    c29069w2M69741a.f59013b.put(str, new C29110e3());
                                }
                            }
                            C28936t c28936t = c32300i2.f65811m;
                            KProperty[] kPropertyArr3 = C32300I.f65798w;
                            KProperty kProperty = kPropertyArr3[2];
                            c28936t.f58834a.set(c28936t.f58835b, c29069w2M69741a);
                            SNSQuestionnaireViewModel$Step sNSQuestionnaireViewModel$Step2 = SNSQuestionnaireViewModel$Step.PAGE;
                            C28936t c28936t2 = c32300i2.f65808j;
                            KProperty kProperty2 = kPropertyArr3[0];
                            c28936t2.f58834a.set(c28936t2.f58835b, sNSQuestionnaireViewModel$Step2);
                        }
                    }
                } else {
                    C32300I c32300i3 = this.f65852e;
                    C29983l c29983l = this.f65853f;
                    this.f65849b = sNSQuestionnaireViewModel$Step;
                    this.f65851d = z13;
                    this.f65848a = 1;
                    KProperty[] kPropertyArr4 = C32300I.f65798w;
                    if (c32300i3.m71085a(c30084s, c29983l, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            z11 = z13;
        }
        C32320p c32320p = this.f65854g;
        C32300I c32300i4 = this.f65852e;
        KProperty[] kPropertyArr5 = C32300I.f65798w;
        int iM71089e = c32300i4.m71089e();
        if (sNSQuestionnaireViewModel$Step == SNSQuestionnaireViewModel$Step.PAGE) {
            z12 = true;
        }
        return new C32320p(iM71089e, z12, z11, c32320p.f65846d);
    }
}
