package com.sumsub.sns.internal.features.presentation.paymentmethod.upload;

import com.sumsub.sns.internal.features.data.model.common.PhotosAmount;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.paymentmethod.upload.q */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract /* synthetic */ class AbstractC31437q {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f63710a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f63711b;

    static {
        int[] iArr = new int[PhotosAmount.values().length];
        try {
            iArr[PhotosAmount.ONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PhotosAmount.TWO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PhotosAmount.SOME.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f63710a = iArr;
        int[] iArr2 = new int[EnumC31420x33e3abfe.values().length];
        try {
            iArr2[EnumC31420x33e3abfe.UPLOAD_DOCS.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[EnumC31420x33e3abfe.SHOW_SELECTOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f63711b = iArr2;
    }
}
