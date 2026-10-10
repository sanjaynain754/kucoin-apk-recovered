package com.jumio.sdk.enums;

import com.jumio.core.data.UploadType;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m90084d2 = {"Lcom/jumio/sdk/enums/JumioScanMode;", "", "<init>", "(Ljava/lang/String;I)V", "BARCODE", "FACE_MANUAL", "MANUAL", "DOCFINDER", "NFC", "FILE", "WEB", UploadType.JUMIO_LIVENESS, "JUMIO_PREMIUM", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum JumioScanMode {
    BARCODE,
    FACE_MANUAL,
    MANUAL,
    DOCFINDER,
    NFC,
    FILE,
    WEB,
    JUMIO_LIVENESS,
    JUMIO_PREMIUM;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    public static EnumEntries<JumioScanMode> getEntries() {
        return $ENTRIES;
    }
}
