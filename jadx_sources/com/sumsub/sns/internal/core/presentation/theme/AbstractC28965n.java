package com.sumsub.sns.internal.core.presentation.theme;

import com.sumsub.sns.core.theme.SNSCustomizationFileFormat;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.theme.n */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract /* synthetic */ class AbstractC28965n {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f58873a;

    static {
        int[] iArr = new int[SNSCustomizationFileFormat.values().length];
        try {
            iArr[SNSCustomizationFileFormat.CORDOVA.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SNSCustomizationFileFormat.REACT_NATIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SNSCustomizationFileFormat.FLUTTER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SNSCustomizationFileFormat.NATIVE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f58873a = iArr;
    }
}
