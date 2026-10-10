package com.sumsub.sns.internal.core.analytics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.analytics.h */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract /* synthetic */ class AbstractC28369h {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f57848a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f57849b;

    static {
        int[] iArr = new int[Domain.values().length];
        try {
            iArr[Domain.Ui.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Domain.Step.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Domain.PrimaryAction.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Domain.Sdk.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f57848a = iArr;
        int[] iArr2 = new int[ControlAction.values().length];
        try {
            iArr2[ControlAction.Seen.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[ControlAction.Checked.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[ControlAction.Unchecked.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[ControlAction.Clicked.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[ControlAction.Changed.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[ControlAction.PermissionsChanged.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
        f57849b = iArr2;
    }
}
