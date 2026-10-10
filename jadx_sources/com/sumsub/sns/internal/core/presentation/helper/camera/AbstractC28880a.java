package com.sumsub.sns.internal.core.presentation.helper.camera;

import com.sumsub.sns.internal.features.data.model.common.IdentitySide;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.helper.camera.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract /* synthetic */ class AbstractC28880a {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f58724a;

    static {
        int[] iArr = new int[IdentitySide.values().length];
        try {
            iArr[IdentitySide.Front.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[IdentitySide.Back.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f58724a = iArr;
    }
}
