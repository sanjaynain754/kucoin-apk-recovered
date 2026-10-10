package com.sumsub.sns.internal.features.presentation.status;

import android.text.SpannableStringBuilder;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29130i;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.features.presentation.utils.C32649e;
import com.sumsub.sns.internal.log.C33272c;
import java.util.List;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.status.E */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32396E extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public C32403L f66001a;

    /* JADX INFO: renamed from: b */
    public SpannableStringBuilder f66002b;

    /* JADX INFO: renamed from: c */
    public int f66003c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C32403L f66004d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32396E(C32403L c32403l, Continuation continuation) {
        super(2, continuation);
        this.f66004d = c32403l;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C32396E(this.f66004d, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C32396E(this.f66004d, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String strM69770a;
        C32403L c32403l;
        SpannableStringBuilder spannableStringBuilderM71267a;
        SpannableStringBuilder spannableStringBuilder;
        C32403L c32403l2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f66003c;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    spannableStringBuilder = this.f66002b;
                    c32403l2 = this.f66001a;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
            }
            c32403l = c32403l2;
            strM69770a = (String) obj;
            spannableStringBuilderM71267a = spannableStringBuilder;
            C32444q c32444q = new C32444q(spannableStringBuilderM71267a, strM69770a);
            KProperty[] kPropertyArr = C32403L.f66041o;
            c32403l.fireEvent(c32444q);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        C32403L c32403l3 = this.f66004d;
        this.f66003c = 1;
        obj = c32403l3.getStrings(this);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
        List list = ((C29983l) obj).f60249b;
        strM69770a = null;
        if (list != null && !list.isEmpty()) {
            c32403l = this.f66004d;
            spannableStringBuilderM71267a = c32403l.f66048g.m71267a(c32403l.getConfig(), list);
            C32403L c32403l4 = this.f66004d;
            C32649e c32649e = c32403l4.f66048g;
            C29124h config = c32403l4.getConfig();
            c32649e.getClass();
            if (config != null) {
                strM69770a = AbstractC29130i.m69770a("agreements.modalAgreeButtonLabel", config.f59088u);
            }
            if (strM69770a == null) {
                C32403L c32403l5 = this.f66004d;
                this.f66001a = c32403l;
                this.f66002b = spannableStringBuilderM71267a;
                this.f66003c = 2;
                Object string = c32403l5.getString("sns_agreement_action_continue", this);
                if (string != coroutine_suspended) {
                    spannableStringBuilder = spannableStringBuilderM71267a;
                    obj = string;
                    c32403l2 = c32403l;
                    c32403l = c32403l2;
                    strM69770a = (String) obj;
                    spannableStringBuilderM71267a = spannableStringBuilder;
                }
                return coroutine_suspended;
            }
            C32444q c32444q2 = new C32444q(spannableStringBuilderM71267a, strM69770a);
            KProperty[] kPropertyArr2 = C32403L.f66041o;
            c32403l.fireEvent(c32444q2);
            return Unit.INSTANCE;
        }
        C33272c.f67816e.f67810a.mo68955d("SNSApplicantStatusViewModel", "showAgreementBottomSheet: no agreements, proceed to next step", null);
        C32403L c32403l6 = this.f66004d;
        KProperty[] kPropertyArr3 = C32403L.f66041o;
        c32403l6.m71124f();
        return Unit.INSTANCE;
    }
}
