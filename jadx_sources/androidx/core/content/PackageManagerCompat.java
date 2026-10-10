package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.concurrent.futures.ResolvableFuture;
import androidx.core.os.UserManagerCompat;
import com.google.common.util.concurrent.ListenableFuture;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyEnum;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes23.dex */
public final class PackageManagerCompat {

    @SuppressLint({"ActionValue"})
    public static final String ACTION_PERMISSION_REVOCATION_SETTINGS = "android.intent.action.AUTO_REVOKE_PERMISSIONS";

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String LOG_TAG = "PackageManagerCompat";

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface UnusedAppRestrictionsStatus {
    }

    @RequiresApi(30)
    public static class Api30Impl {
        private Api30Impl() {
        }

        public static boolean areUnusedAppRestrictionsEnabled(@NonNull Context context) {
            return !context.getPackageManager().isAutoRevokeWhitelisted();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static boolean areUnusedAppRestrictionsAvailable(@NonNull PackageManager packageManager) {
        int i11 = Build.VERSION.SDK_INT;
        return (i11 >= 30) || ((i11 < 30) && (getPermissionRevocationVerifierApp(packageManager) != null));
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static String getPermissionRevocationVerifierApp(@NonNull PackageManager packageManager) {
        String str = null;
        Iterator<ResolveInfo> it = packageManager.queryIntentActivities(new Intent(ACTION_PERMISSION_REVOCATION_SETTINGS).setData(Uri.fromParts(TPDownloadProxyEnum.DLPARAM_PACKAGE, "com.example", null)), 0).iterator();
        while (it.hasNext()) {
            String str2 = it.next().activityInfo.packageName;
            if (packageManager.checkPermission("android.permission.PACKAGE_VERIFICATION_AGENT", str2) == 0) {
                if (str != null) {
                    return str;
                }
                str = str2;
            }
        }
        return str;
    }

    private PackageManagerCompat() {
    }

    @NonNull
    public static ListenableFuture<Integer> getUnusedAppRestrictionsStatus(@NonNull Context context) {
        ResolvableFuture<Integer> resolvableFutureCreate = ResolvableFuture.create();
        if (!UserManagerCompat.isUserUnlocked(context)) {
            resolvableFutureCreate.set(0);
            Log.e(LOG_TAG, "User is in locked direct boot mode");
            return resolvableFutureCreate;
        }
        if (!areUnusedAppRestrictionsAvailable(context.getPackageManager())) {
            resolvableFutureCreate.set(1);
            return resolvableFutureCreate;
        }
        int i11 = context.getApplicationInfo().targetSdkVersion;
        if (i11 < 30) {
            resolvableFutureCreate.set(0);
            Log.e(LOG_TAG, "Target SDK version below API 30");
            return resolvableFutureCreate;
        }
        int i12 = Build.VERSION.SDK_INT;
        int i13 = 2;
        int i14 = 4;
        if (i12 >= 31) {
            if (Api30Impl.areUnusedAppRestrictionsEnabled(context)) {
                if (i11 >= 31) {
                    i14 = 5;
                }
                resolvableFutureCreate.set(Integer.valueOf(i14));
                return resolvableFutureCreate;
            }
            resolvableFutureCreate.set(2);
            return resolvableFutureCreate;
        }
        if (i12 == 30) {
            if (Api30Impl.areUnusedAppRestrictionsEnabled(context)) {
                i13 = 4;
            }
            resolvableFutureCreate.set(Integer.valueOf(i13));
            return resolvableFutureCreate;
        }
        final UnusedAppRestrictionsBackportServiceConnection unusedAppRestrictionsBackportServiceConnection = new UnusedAppRestrictionsBackportServiceConnection(context);
        resolvableFutureCreate.addListener(new Runnable() { // from class: androidx.core.content.v
            @Override // java.lang.Runnable
            public final void run() {
                unusedAppRestrictionsBackportServiceConnection.disconnectFromService();
            }
        }, Executors.newSingleThreadExecutor());
        unusedAppRestrictionsBackportServiceConnection.connectAndFetchResult(resolvableFutureCreate);
        return resolvableFutureCreate;
    }
}
