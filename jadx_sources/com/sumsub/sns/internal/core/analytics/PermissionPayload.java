package com.sumsub.sns.internal.core.analytics;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\r\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m90084d2 = {"Lcom/sumsub/sns/internal/core/analytics/PermissionPayload;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "CAMERA_PERMISSION", "MICROPHONE_PERMISSION", "LOCATION_PERMISSION", "WRITE_SYSTEM_SETTINGS", "NOTIFICATIONS", "toString", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public enum PermissionPayload {
    CAMERA_PERMISSION("hasCameraPermission"),
    MICROPHONE_PERMISSION("hasMicrophonePermission"),
    LOCATION_PERMISSION("hasLocationPermission"),
    WRITE_SYSTEM_SETTINGS("hasWriteSystemSettingsPermission"),
    NOTIFICATIONS("hasNotificationsEnabled");

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    private final String value;

    @NotNull
    public static EnumEntries<PermissionPayload> getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.value;
    }

    PermissionPayload(String str) {
        this.value = str;
    }
}
