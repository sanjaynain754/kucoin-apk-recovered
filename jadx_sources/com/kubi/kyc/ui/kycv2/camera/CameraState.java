package com.kubi.kyc.ui.kycv2.camera;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: KycCameraContract.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m90084d2 = {"Lcom/kubi/kyc/ui/kycv2/camera/CameraState;", "", "<init>", "(Ljava/lang/String;I)V", "NOT_READY", "NULL", "READY", "PREVIEW_STOPPED", "ERROR", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum CameraState {
    NOT_READY,
    NULL,
    READY,
    PREVIEW_STOPPED,
    ERROR;


    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f31453c = EnumEntriesKt.enumEntries(m37209a());

    @NotNull
    public static EnumEntries<CameraState> getEntries() {
        return f31453c;
    }
}
