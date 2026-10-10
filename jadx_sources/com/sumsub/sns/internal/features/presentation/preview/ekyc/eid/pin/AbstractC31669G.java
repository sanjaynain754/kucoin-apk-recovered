package com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.pin;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.pin.G */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract /* synthetic */ class AbstractC31669G {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f64275a;

    static {
        int[] iArr = new int[SNSEidPinViewModel$Step.values().length];
        try {
            iArr[SNSEidPinViewModel$Step.ENTER_OLD_PIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SNSEidPinViewModel$Step.ENTER_NEW_PIN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SNSEidPinViewModel$Step.REPEAT_NEW_PIN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SNSEidPinViewModel$Step.TESTING_ENTER_LAST_DIGIT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[SNSEidPinViewModel$Step.ENTER_PIN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[SNSEidPinViewModel$Step.ENTER_PUK.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[SNSEidPinViewModel$Step.ENTER_CAN.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f64275a = iArr;
    }
}
