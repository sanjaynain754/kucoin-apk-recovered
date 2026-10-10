package com.appsflyer.internal;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.appsflyer.AFLogger;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes34.dex */
public final class AFj1qSDK extends AFj1tSDK {
    private final AFd1zSDK getCurrencyIso4217Code;
    final ProviderInfo getMonetizationNetwork;

    public AFj1qSDK(ProviderInfo providerInfo, Runnable runnable, AFd1zSDK aFd1zSDK) {
        super("af_referrer", providerInfo.authority, runnable);
        this.getCurrencyIso4217Code = aFd1zSDK;
        this.getMonetizationNetwork = providerInfo;
    }

    @Override // com.appsflyer.internal.AFj1tSDK
    public final void AFAdRevenueData(final Context context) {
        this.getCurrencyIso4217Code.getMonetizationNetwork().execute(new Runnable() { // from class: com.appsflyer.internal.AFj1qSDK.5
            @Override // java.lang.Runnable
            public final void run() {
                Cursor cursorQuery;
                AFj1qSDK aFj1qSDK = AFj1qSDK.this;
                aFj1qSDK.component4 = System.currentTimeMillis();
                aFj1qSDK.areAllFieldsValid = AFj1tSDK.AFa1ySDK.STARTED;
                aFj1qSDK.addObserver(new AFj1tSDK.C51842());
                StringBuilder sb2 = new StringBuilder("content://");
                sb2.append(AFj1qSDK.this.getMonetizationNetwork.authority);
                sb2.append("/transaction_id");
                Uri uri = Uri.parse(sb2.toString());
                ContentProviderClient contentProviderClientM6008B_ = AFj1qSDK.m6008B_(context, uri);
                try {
                    if (contentProviderClientM6008B_ != null) {
                        StringBuilder sb3 = new StringBuilder("app_id=");
                        sb3.append(context.getPackageName());
                        cursorQuery = contentProviderClientM6008B_.query(uri, null, sb3.toString(), null, null);
                    } else {
                        cursorQuery = null;
                    }
                } catch (RemoteException e11) {
                    AFLogger.INSTANCE.m5975e(AFh1ySDK.PREINSTALL, "Failed to query unstable content providerClient", e11, false, true, false);
                    cursorQuery = null;
                } catch (DeadObjectException e12) {
                    AFLogger.INSTANCE.m5975e(AFh1ySDK.PREINSTALL, "Failed to acquire unstable content providerClient", e12, false, true, false);
                    cursorQuery = null;
                } catch (Throwable th2) {
                    AFLogger.INSTANCE.m5975e(AFh1ySDK.PREINSTALL, "Error to get data from providerClient ", th2, false, true, false);
                    cursorQuery = null;
                } finally {
                    contentProviderClientM6008B_.close();
                }
                if (cursorQuery != null) {
                    int columnIndex = cursorQuery.getColumnIndex(FirebaseAnalytics.Param.TRANSACTION_ID);
                    if (columnIndex == -1) {
                        AFLogger.INSTANCE.m5978w(AFh1ySDK.PREINSTALL, "Wrong column name");
                        AFj1qSDK.this.getMediationNetwork.put("response", "FEATURE_NOT_SUPPORTED");
                    } else {
                        AFj1qSDK.this.getMediationNetwork.put("response", "OK");
                        if (cursorQuery.moveToFirst()) {
                            String string = cursorQuery.getString(columnIndex);
                            cursorQuery.close();
                            if (string != null && !string.isEmpty()) {
                                AFj1qSDK.this.getMediationNetwork.put("referrer", string);
                            }
                        }
                    }
                    cursorQuery.close();
                } else {
                    AFLogger.INSTANCE.m5978w(AFh1ySDK.PREINSTALL, "ContentProvider query failed, got null Cursor");
                    AFj1qSDK.this.getMediationNetwork.put("response", "SERVICE_UNAVAILABLE");
                }
                AFj1qSDK aFj1qSDK2 = AFj1qSDK.this;
                aFj1qSDK2.getMediationNetwork.put("api_ver", Long.valueOf(AFj1jSDK.getCurrencyIso4217Code(context, ((PackageItemInfo) aFj1qSDK2.getMonetizationNetwork).packageName)));
                AFj1qSDK aFj1qSDK3 = AFj1qSDK.this;
                aFj1qSDK3.getMediationNetwork.put("api_ver_name", AFj1jSDK.getMediationNetwork(context, ((PackageItemInfo) aFj1qSDK3.getMonetizationNetwork).packageName));
                AFj1qSDK.this.getRevenue();
            }
        });
    }

    @Nullable
    @VisibleForTesting
    /* JADX INFO: renamed from: B_ */
    public static ContentProviderClient m6008B_(Context context, Uri uri) {
        try {
            return context.getContentResolver().acquireUnstableContentProviderClient(uri);
        } catch (SecurityException e11) {
            AFLogger.INSTANCE.m5975e(AFh1ySDK.PREINSTALL, "Failed to acquire unstable content providerClient due to SecurityException", e11, false, true, false);
            return null;
        } catch (Throwable th2) {
            AFLogger.INSTANCE.m5975e(AFh1ySDK.PREINSTALL, "Failed to acquire unstable content providerClient due to unexpected throwable", th2, false, true, false);
            return null;
        }
    }
}
