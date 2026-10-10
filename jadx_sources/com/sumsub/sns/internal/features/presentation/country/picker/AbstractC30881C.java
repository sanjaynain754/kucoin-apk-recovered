package com.sumsub.sns.internal.features.presentation.country.picker;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.country.picker.C */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract /* synthetic */ class AbstractC30881C {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f62383a;

    static {
        int[] iArr = new int[CountryPickerDialog.SelectionMode.values().length];
        try {
            iArr[CountryPickerDialog.SelectionMode.SINGLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CountryPickerDialog.SelectionMode.MULTI.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f62383a = iArr;
    }
}
