package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m90084d2 = {"com/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State", "", "Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/SNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State;", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "INVALID", "INTERMEDIATE", "OK", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public enum SNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State {
    DEFAULT,
    INVALID,
    INTERMEDIATE,
    OK;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    public static EnumEntries<SNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State> getEntries() {
        return $ENTRIES;
    }
}
