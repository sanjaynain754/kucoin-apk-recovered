package com.appsflyer.internal;

import com.appsflyer.migration.AppsFlyerMigrationHelper;
import p852kotlin.jvm.JvmName;

/* JADX INFO: loaded from: classes.dex */
@JvmName(name = "BranchMigrationManagerUtil")
public final class AFh1sSDK {
    public static final boolean getMediationNetwork() {
        try {
            AppsFlyerMigrationHelper appsFlyerMigrationHelper = AppsFlyerMigrationHelper.INSTANCE;
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
