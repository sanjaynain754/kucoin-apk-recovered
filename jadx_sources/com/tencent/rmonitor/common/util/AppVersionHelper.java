package com.tencent.rmonitor.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tencent.rmonitor.base.meta.BaseInfo;
import com.tencent.rmonitor.common.logger.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0011\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u0010\u0010\u0014\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u0010\u0010\u0015\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u0012\u0010\u0018\u001a\u00020\u00172\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002J\u0012\u0010\u0019\u001a\u00020\u00172\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002J\u000e\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0004J\u000e\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m90084d2 = {"Lcom/tencent/rmonitor/common/util/AppVersionHelper;", "", "()V", "META_BUGLY_APP_VERSION", "", "META_RDM_UUID", "TAG", RemoteConfigConstants.RequestFieldKey.APP_VERSION, "appVersionFromMeta", "buildNo", "buildNoFromMeta", "hasParseMetadata", "", "hasParsePackageInfo", "manifestVersionCode", "manifestVersionName", "userSetAppVersion", "apkInDebug", "context", "Landroid/content/Context;", "checkAndGetAppVersion", "checkAndGetUuid", "checkAppVersion", "", "parseAppVersionFromPackageInfo", "parseMetaData", "setProductVersion", "productVersion", "setRdmUuid", "rdmUuid", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class AppVersionHelper {

    @NotNull
    public static final String META_BUGLY_APP_VERSION = "BUGLY_APP_VERSION";

    @NotNull
    public static final String META_RDM_UUID = "com.tencent.rdm.uuid";

    @NotNull
    private static final String TAG = "RMonitor_AppVersionHelper";
    private static boolean hasParseMetadata;
    private static boolean hasParsePackageInfo;
    private static boolean userSetAppVersion;

    @NotNull
    public static final AppVersionHelper INSTANCE = new AppVersionHelper();

    @NotNull
    private static String appVersion = "";

    @NotNull
    private static String buildNo = "";

    @NotNull
    private static String manifestVersionName = "";

    @NotNull
    private static String manifestVersionCode = "";

    @NotNull
    private static String appVersionFromMeta = "";

    @NotNull
    private static String buildNoFromMeta = "";

    public final boolean apkInDebug(@Nullable Context context) {
        if (context == null) {
            return false;
        }
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            return (applicationInfo == null || (applicationInfo.flags & 2) == 0) ? false : true;
        } catch (Throwable unused) {
        }
    }

    private final void checkAppVersion() {
        if (userSetAppVersion) {
            Logger.INSTANCE.mo77132i(TAG, "checkAppVersion for userSetVersion is true");
            return;
        }
        String str = appVersion;
        if (str == null || str.length() == 0) {
            Logger.INSTANCE.mo77132i(TAG, "checkAppVersion for versionName is null or empty");
            return;
        }
        char[] charArray = str.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "this as java.lang.String).toCharArray()");
        int i11 = 0;
        for (char c11 : charArray) {
            if (c11 == '.') {
                i11++;
            }
        }
        if (i11 < 3) {
            String str2 = str + '.' + manifestVersionCode;
            Logger.INSTANCE.mo77132i(TAG, "checkAppVersion, old:" + appVersion + ", new: " + str2);
            appVersion = str2;
        }
    }

    private final void parseAppVersionFromPackageInfo(Context context) {
        if (context == null) {
            Logger.INSTANCE.mo77132i(TAG, "parseAppVersionFromPackageInfo for context is null");
            return;
        }
        if (hasParsePackageInfo) {
            return;
        }
        hasParsePackageInfo = true;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            if (packageInfo != null) {
                String str = packageInfo.versionName;
                if (str == null) {
                    str = "";
                } else {
                    Intrinsics.checkNotNullExpressionValue(str, "it.versionName ?: \"\"");
                }
                manifestVersionName = str;
                manifestVersionCode = String.valueOf(packageInfo.versionCode);
            }
        } catch (Throwable th2) {
            Logger.INSTANCE.exception(TAG, th2);
        }
        Logger.INSTANCE.mo77132i(TAG, "parseAppVersionFromPackageInfo, manifestVersionName: " + manifestVersionName + ", manifestVersionCode: " + manifestVersionCode);
    }

    private final void parseMetaData(Context context) {
        String string;
        String string2;
        if (context == null) {
            Logger.INSTANCE.mo77132i(TAG, "parseMetaData fail for context is null");
            return;
        }
        if (hasParseMetadata) {
            return;
        }
        hasParseMetadata = true;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "manager.getApplicationIn…ageManager.GET_META_DATA)");
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null) {
                Object obj = bundle.get("BUGLY_APP_VERSION");
                Object obj2 = applicationInfo.metaData.get("com.tencent.rdm.uuid");
                String str = "";
                if (obj == null || (string = obj.toString()) == null) {
                    string = "";
                }
                appVersionFromMeta = string;
                if (obj2 != null && (string2 = obj2.toString()) != null) {
                    str = string2;
                }
                buildNoFromMeta = str;
            }
        } catch (Throwable th2) {
            Logger.INSTANCE.exception(TAG, th2);
        }
        Logger.INSTANCE.mo77132i(TAG, "parseMetaData, appVersionFromMeta: " + appVersionFromMeta + ", buildNoFromMeta: " + buildNoFromMeta);
    }

    @NotNull
    public final String checkAndGetAppVersion(@Nullable Context context) {
        if (TextUtils.isEmpty(appVersion)) {
            parseAppVersionFromPackageInfo(context);
            if (!TextUtils.isEmpty(manifestVersionName)) {
                appVersion = manifestVersionName;
            }
            parseMetaData(context);
            if (!TextUtils.isEmpty(appVersionFromMeta)) {
                appVersion = appVersionFromMeta;
            }
        }
        checkAppVersion();
        return appVersion;
    }

    @NotNull
    public final String checkAndGetUuid(@Nullable Context context) {
        if (TextUtils.isEmpty(buildNo)) {
            parseMetaData(context);
            if (!TextUtils.isEmpty(buildNoFromMeta)) {
                buildNo = buildNoFromMeta;
            }
        }
        return buildNo;
    }

    public final void setProductVersion(@NotNull String productVersion) {
        Intrinsics.checkNotNullParameter(productVersion, "productVersion");
        Logger.INSTANCE.mo77132i(TAG, "setProductVersion, old:" + appVersion + ", new: " + productVersion);
        if (productVersion.length() != 0) {
            appVersion = productVersion;
            BaseInfo.userMeta.appVersion = productVersion;
            userSetAppVersion = true;
        } else {
            appVersion = "";
            BaseInfo.userMeta.appVersion = "";
            userSetAppVersion = false;
            hasParseMetadata = false;
            hasParsePackageInfo = false;
        }
    }

    public final void setRdmUuid(@NotNull String rdmUuid) {
        Intrinsics.checkNotNullParameter(rdmUuid, "rdmUuid");
        Logger.INSTANCE.mo77132i(TAG, "setRdmUuid, old:" + buildNo + ", new: " + rdmUuid);
        if (rdmUuid.length() != 0) {
            buildNo = rdmUuid;
            BaseInfo.userMeta.buildNumber = rdmUuid;
        } else {
            buildNo = "";
            BaseInfo.userMeta.buildNumber = "";
            hasParseMetadata = false;
        }
    }

    private AppVersionHelper() {
    }
}
