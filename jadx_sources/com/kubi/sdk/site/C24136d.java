package com.kubi.sdk.site;

import com.kubi.utils.storage.StorageType;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import y70.StorageId;

/* JADX INFO: renamed from: com.kubi.sdk.site.d */
/* JADX INFO: compiled from: SiteStorageIds.kt */
/* JADX INFO: loaded from: classes42.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\t\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006\"\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006¨\u0006\r"}, m90084d2 = {"SID_CATEGORY", "", "latestRebirthTimeSid", "Lcom/kubi/utils/storage/StorageId;", "", "getLatestRebirthTimeSid", "()Lcom/kubi/utils/storage/StorageId;", "migrationSiteSid", "getMigrationSiteSid", "needMigrationHomeShowTime", "getNeedMigrationHomeShowTime", "needMigrationShowTime", "getNeedMigrationShowTime", "LSite_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C24136d {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final StorageId<Long> f47903a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final StorageId<String> f47904b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final StorageId<Long> f47905c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final StorageId<Long> f47906d;

    static {
        StorageType storageType = StorageType.Shared;
        f47903a = new StorageId<>("site", "latest_change_time", storageType, false, 8, null);
        f47904b = new StorageId<>("site", "latest_migration_site", storageType, false, 8, null);
        f47905c = new StorageId<>("site", "need_migration_dialog_home", storageType, false, 8, null);
        f47906d = new StorageId<>("site", "need_migration_dialog", storageType, false, 8, null);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final StorageId<Long> m58084a() {
        return f47903a;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final StorageId<Long> m58085b() {
        return f47905c;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final StorageId<Long> m58086c() {
        return f47906d;
    }
}
