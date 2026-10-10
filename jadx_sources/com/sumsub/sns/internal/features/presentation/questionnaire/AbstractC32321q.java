package com.sumsub.sns.internal.features.presentation.questionnaire;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.questionnaire.q */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract /* synthetic */ class AbstractC32321q {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f65847a;

    static {
        int[] iArr = new int[SNSQuestionnaireViewModel$Step.values().length];
        try {
            iArr[SNSQuestionnaireViewModel$Step.INIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SNSQuestionnaireViewModel$Step.CHANGE_PAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SNSQuestionnaireViewModel$Step.PAGE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f65847a = iArr;
    }
}
