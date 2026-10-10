package com.sumsub.sns.internal.features.presentation.error;

import com.sumsub.sns.core.theme.SNSColorElement;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.error.g */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract /* synthetic */ class AbstractC30928g {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f62468a;

    static {
        int[] iArr = new int[SNSColorElement.values().length];
        try {
            iArr[SNSColorElement.BACKGROUND_NEUTRAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SNSColorElement.BACKGROUND_SUCCESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SNSColorElement.BACKGROUND_WARNING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SNSColorElement.BACKGROUND_CRITICAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[SNSColorElement.BACKGROUND_INFO.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f62468a = iArr;
    }
}
