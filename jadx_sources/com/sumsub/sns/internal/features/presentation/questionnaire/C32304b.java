package com.sumsub.sns.internal.features.presentation.questionnaire;

import android.os.Bundle;
import com.sumsub.sns.internal.core.common.AbstractC28437b;
import com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.questionnaire.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C32304b extends FunctionReferenceImpl implements Function0 {
    @Override // p852kotlin.jvm.functions.Function0
    public final Object invoke() {
        SNSQuestionnaireFragment sNSQuestionnaireFragment = (SNSQuestionnaireFragment) this.receiver;
        SNSQuestionnaireFragment.Companion companion = SNSQuestionnaireFragment.f65822d;
        Bundle arguments = sNSQuestionnaireFragment.getArguments();
        AbstractC28841e0 abstractC28841e0 = arguments != null ? (AbstractC28841e0) AbstractC28437b.m69320a(arguments, "PENDING_FORM_ITEM", AbstractC28841e0.class, null) : null;
        if (abstractC28841e0 != null) {
            ((C32300I) sNSQuestionnaireFragment.f65823a.getValue()).intent(new C32318n(abstractC28841e0));
        }
        Bundle arguments2 = sNSQuestionnaireFragment.getArguments();
        if (arguments2 != null) {
            arguments2.putParcelable("PENDING_FORM_ITEM", null);
        }
        return Unit.INSTANCE;
    }

    public C32304b(SNSQuestionnaireFragment sNSQuestionnaireFragment) {
        super(0, sNSQuestionnaireFragment, SNSQuestionnaireFragment.class, "openGallery", "openGallery()V", 0);
    }
}
