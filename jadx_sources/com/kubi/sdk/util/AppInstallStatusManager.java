package com.kubi.sdk.util;

import com.kubi.utils.DataMapUtil;
import com.kubi.utils.storage.StorageType;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: renamed from: com.kubi.sdk.util.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: AppInstallStatusManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/sdk/util/AppInstallStatusManager;", "", "<init>", "()V", "CATEGORY", "", "installedSid", "Lcom/kubi/utils/storage/StorageId;", "", "AGREE_PROTOCOL", "value", "isFirstInstall", "()Z", "init", "", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAppInstallStatusManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppInstallStatusManager.kt\ncom/kubi/sdk/util/AppInstallStatusManager\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,42:1\n10#2:43\n126#2,2:44\n136#2:46\n*S KotlinDebug\n*F\n+ 1 AppInstallStatusManager.kt\ncom/kubi/sdk/util/AppInstallStatusManager\n*L\n33#1:43\n34#1:44,2\n38#1:46\n*E\n"})
public final class AppInstallStatusManager {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final AppInstallStatusManager f48140a = new AppInstallStatusManager();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final StorageId<Boolean> f48141b = new StorageId<>("install", "installed", StorageType.Shared, false, 8, null);

    /* JADX INFO: renamed from: c */
    public static boolean f48142c;

    /* JADX INFO: renamed from: a */
    public final void m58375a() {
        boolean zM102322d;
        StorageId<Boolean> storageId = f48141b;
        if (C46392a.m102320b(storageId)) {
            zM102322d = C46392a.m102322d(storageId, false);
        } else {
            C46392a.m102328k(storageId, true);
            zM102322d = DataMapUtil.f54245a.m66370a("AGREE_PROTOCOL", false);
        }
        f48142c = !zM102322d;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m58376b() {
        return f48142c;
    }
}
