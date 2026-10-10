package com.sumsub.sns.internal.features.presentation.camera.photo.document;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.L */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract /* synthetic */ class AbstractC30474L {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f61499a;

    static {
        int[] iArr = new int[SNSPhotoDocumentPickerViewModel$AutoCaptureHint$State.values().length];
        try {
            iArr[SNSPhotoDocumentPickerViewModel$AutoCaptureHint$State.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SNSPhotoDocumentPickerViewModel$AutoCaptureHint$State.INVALID.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SNSPhotoDocumentPickerViewModel$AutoCaptureHint$State.INTERMEDIATE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SNSPhotoDocumentPickerViewModel$AutoCaptureHint$State.OK.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f61499a = iArr;
    }
}
