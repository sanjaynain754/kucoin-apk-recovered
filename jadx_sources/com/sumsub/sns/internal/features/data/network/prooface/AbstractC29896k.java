package com.sumsub.sns.internal.features.data.network.prooface;

import com.sumsub.sns.internal.features.data.model.prooface.LivenessMessageType;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.network.prooface.k */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract /* synthetic */ class AbstractC29896k {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f59997a;

    static {
        int[] iArr = new int[LivenessMessageType.values().length];
        try {
            iArr[LivenessMessageType.livenessSessionStarted.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LivenessMessageType.livenessSessionInProgress.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[LivenessMessageType.livenessSessionCompleted.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[LivenessMessageType.livenessSessionTerminated.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f59997a = iArr;
    }
}
