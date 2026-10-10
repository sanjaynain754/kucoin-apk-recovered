package com.sumsub.sns.internal.features.data.utils;

import com.sumsub.sns.internal.features.data.model.common.FieldType;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.utils.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract /* synthetic */ class AbstractC30063c {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f60403a;

    static {
        int[] iArr = new int[FieldType.values().length];
        try {
            iArr[FieldType.text.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FieldType.textArea.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[FieldType.phone.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[FieldType.date.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[FieldType.dateTime.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[FieldType.bool.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[FieldType.select.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[FieldType.selectDropdown.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[FieldType.multiSelect.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[FieldType.countrySelect.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[FieldType.countryMultiSelect.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[FieldType.fileAttachment.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[FieldType.multiFileAttachments.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        f60403a = iArr;
    }
}
