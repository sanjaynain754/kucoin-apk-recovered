package com.kubi.permissions.compliance;

import com.kubi.permissions.R$string;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'CAMERA' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: PermissionComplianceManifest.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0014\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B5\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/permissions/compliance/PermissionComplianceManifest;", "", "systemKey", "", "displayName", "", "collectData", "", "supportFeature", "<init>", "(Ljava/lang/String;ILjava/lang/String;ILjava/util/List;Ljava/util/List;)V", "getSystemKey", "()Ljava/lang/String;", "getDisplayName", "()I", "getCollectData", "()Ljava/util/List;", "getSupportFeature", "CAMERA", "POST_NOTIFICATIONS", "ACCESS_COARSE_LOCATION", "READ_EXTERNAL_STORAGE", "WRITE_EXTERNAL_STORAGE", "ACCESS_FINE_LOCATION", "READ_CALENDAR", "WRITE_CALENDAR", "RECORD_AUDIO", "LPermissions_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class PermissionComplianceManifest {
    public static final PermissionComplianceManifest ACCESS_COARSE_LOCATION;
    public static final PermissionComplianceManifest ACCESS_FINE_LOCATION;
    public static final PermissionComplianceManifest CAMERA;
    public static final PermissionComplianceManifest POST_NOTIFICATIONS;
    public static final PermissionComplianceManifest READ_CALENDAR;
    public static final PermissionComplianceManifest READ_EXTERNAL_STORAGE;
    public static final PermissionComplianceManifest RECORD_AUDIO;
    public static final PermissionComplianceManifest WRITE_CALENDAR;
    public static final PermissionComplianceManifest WRITE_EXTERNAL_STORAGE;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ PermissionComplianceManifest[] f40526b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f40527c;

    @NotNull
    private final List<Integer> collectData;
    private final int displayName;

    @NotNull
    private final List<Integer> supportFeature;

    @NotNull
    private final String systemKey;

    static {
        int i11 = R$string.permission_display_name_camera;
        Integer numValueOf = Integer.valueOf(R$string.permission_collect_data_photo);
        int i12 = R$string.permission_collect_data_video;
        ArrayList arrayListArrayListOf = CollectionsKt.arrayListOf(numValueOf, Integer.valueOf(i12));
        int i13 = R$string.permission_support_feature_kyc_identity_verification;
        CAMERA = new PermissionComplianceManifest("CAMERA", 0, "android.permission.CAMERA", i11, arrayListArrayListOf, CollectionsKt.arrayListOf(Integer.valueOf(i13), Integer.valueOf(R$string.permission_support_feature_scan_qrcode_login)));
        POST_NOTIFICATIONS = new PermissionComplianceManifest("POST_NOTIFICATIONS", 1, "android.permission.POST_NOTIFICATIONS", R$string.permission_display_name_post_notifications, CollectionsKt.emptyList(), CollectionsKt.arrayListOf(Integer.valueOf(R$string.permission_support_feature_message_push)));
        ACCESS_COARSE_LOCATION = new PermissionComplianceManifest("ACCESS_COARSE_LOCATION", 2, "android.permission.ACCESS_COARSE_LOCATION", R$string.permission_display_name_access_coarse_location, CollectionsKt.arrayListOf(Integer.valueOf(R$string.permission_collect_data_location)), CollectionsKt.arrayListOf(Integer.valueOf(R$string.permission_support_feature_regional_service)));
        READ_EXTERNAL_STORAGE = new PermissionComplianceManifest("READ_EXTERNAL_STORAGE", 3, "android.permission.READ_EXTERNAL_STORAGE", R$string.permission_display_name_read_external_storage, CollectionsKt.arrayListOf(Integer.valueOf(R$string.permission_collect_data_images), Integer.valueOf(i12)), CollectionsKt.arrayListOf(Integer.valueOf(i13), Integer.valueOf(R$string.permission_support_feature_extract_wallet_address_from_image), Integer.valueOf(R$string.permission_support_feature_p2p_grievances), Integer.valueOf(R$string.permission_support_feature_p2p_merchant_identity_verification)));
        WRITE_EXTERNAL_STORAGE = new PermissionComplianceManifest("WRITE_EXTERNAL_STORAGE", 4, "android.permission.WRITE_EXTERNAL_STORAGE", R$string.permission_display_name_write_external_storage, CollectionsKt.emptyList(), CollectionsKt.arrayListOf(Integer.valueOf(R$string.permission_support_feature_save_share_screenshots)));
        ACCESS_FINE_LOCATION = new PermissionComplianceManifest("ACCESS_FINE_LOCATION", 5, "android.permission.ACCESS_FINE_LOCATION", R$string.permission_display_name_read_fine_location, CollectionsKt.arrayListOf(Integer.valueOf(R$string.permission_collect_data_fine_location)), CollectionsKt.arrayListOf(Integer.valueOf(R$string.permission_support_feature_hardware), Integer.valueOf(R$string.permission_support_feature_coupons)));
        int i14 = R$string.permission_display_name_read_calendar;
        ArrayList arrayListArrayListOf2 = CollectionsKt.arrayListOf(Integer.valueOf(R$string.permission_collect_data_calendar_events));
        int i15 = R$string.permission_support_feature_calendar_events_management;
        READ_CALENDAR = new PermissionComplianceManifest("READ_CALENDAR", 6, "android.permission.READ_CALENDAR", i14, arrayListArrayListOf2, CollectionsKt.arrayListOf(Integer.valueOf(i15)));
        WRITE_CALENDAR = new PermissionComplianceManifest("WRITE_CALENDAR", 7, "android.permission.WRITE_CALENDAR", R$string.permission_display_name_write_calendar, CollectionsKt.emptyList(), CollectionsKt.arrayListOf(Integer.valueOf(i15)));
        RECORD_AUDIO = new PermissionComplianceManifest("RECORD_AUDIO", 8, "android.permission.RECORD_AUDIO", R$string.permission_display_name_media_audio, CollectionsKt.arrayListOf(Integer.valueOf(R$string.permission_collect_data_audio)), CollectionsKt.arrayListOf(Integer.valueOf(R$string.microphone_permission_tip)));
        PermissionComplianceManifest[] permissionComplianceManifestArrM49931a = m49931a();
        f40526b = permissionComplianceManifestArrM49931a;
        f40527c = EnumEntriesKt.enumEntries(permissionComplianceManifestArrM49931a);
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ PermissionComplianceManifest[] m49931a() {
        return new PermissionComplianceManifest[]{CAMERA, POST_NOTIFICATIONS, ACCESS_COARSE_LOCATION, READ_EXTERNAL_STORAGE, WRITE_EXTERNAL_STORAGE, ACCESS_FINE_LOCATION, READ_CALENDAR, WRITE_CALENDAR, RECORD_AUDIO};
    }

    @NotNull
    public static EnumEntries<PermissionComplianceManifest> getEntries() {
        return f40527c;
    }

    public static PermissionComplianceManifest valueOf(String str) {
        return (PermissionComplianceManifest) Enum.valueOf(PermissionComplianceManifest.class, str);
    }

    public static PermissionComplianceManifest[] values() {
        return (PermissionComplianceManifest[]) f40526b.clone();
    }

    @NotNull
    public final List<Integer> getCollectData() {
        return this.collectData;
    }

    public final int getDisplayName() {
        return this.displayName;
    }

    @NotNull
    public final List<Integer> getSupportFeature() {
        return this.supportFeature;
    }

    @NotNull
    public final String getSystemKey() {
        return this.systemKey;
    }

    public PermissionComplianceManifest(String str, int i11, String str2, int i12, List list, List list2) {
        super(str, i11);
        this.systemKey = str2;
        this.displayName = i12;
        this.collectData = list;
        this.supportFeature = list2;
    }
}
