package com.sumsub.sns.internal.features.data.model.common;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Unknown", "ModuleNotFound", "ModuleMisconfigured", "HardwareUnavailable", "OsVersionUnsupported", "UserSkipped", "UserCanceled", "AccessDataMissing", "AccessDataRejected", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public enum MRTDError {
    Unknown("unknown"),
    ModuleNotFound("moduleNotFound"),
    ModuleMisconfigured("moduleMisconfigured"),
    HardwareUnavailable("hardwareUnavailable"),
    OsVersionUnsupported("osVersionUnsupported"),
    UserSkipped("userSkipped"),
    UserCanceled("userCancelled"),
    AccessDataMissing("accessDataMissing"),
    AccessDataRejected("accessDataRejected");

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    private final String value;

    @NotNull
    public static EnumEntries<MRTDError> getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    MRTDError(String str) {
        this.value = str;
    }
}
