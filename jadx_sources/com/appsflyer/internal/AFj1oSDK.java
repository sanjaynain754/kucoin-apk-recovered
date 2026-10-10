package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1oSDK extends AFi1eSDK {
    private final AFd1zSDK getMonetizationNetwork;

    @Override // com.appsflyer.internal.AFj1tSDK
    public final void AFAdRevenueData(Context context) {
        AFb1rSDK<Map<String, Object>> aFb1rSDK = new AFb1rSDK<Map<String, Object>>(context, this.getMonetizationNetwork.getMonetizationNetwork(), "com.sec.android.app.samsungapps.referrer", "FBA3AF4E7757D9016E953FB3EE4671CA2BD9AF725F9A53D52ED4A38EAAA08901") { // from class: com.appsflyer.internal.AFj1oSDK.5
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.appsflyer.internal.AFb1rSDK
            /* JADX INFO: renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
            public Map<String, Object> getCurrencyIso4217Code() {
                String string;
                Cursor cursorQuery = null;
                try {
                    try {
                        ContentResolver contentResolver = this.getMediationNetwork.getContentResolver();
                        StringBuilder sb2 = new StringBuilder("content://");
                        sb2.append(this.getCurrencyIso4217Code);
                        cursorQuery = contentResolver.query(Uri.parse(sb2.toString()), null, null, null, null);
                        if (cursorQuery == null) {
                            AFj1oSDK.this.getMediationNetwork.put("response", "SERVICE_UNAVAILABLE");
                        } else if (cursorQuery.moveToFirst()) {
                            AFj1oSDK.this.getMediationNetwork.put("response", "OK");
                            m6004E_("referrer", AFj1oSDK.this.getMediationNetwork, cursorQuery);
                            m6003D_("click_ts", AFj1oSDK.this.getMediationNetwork, cursorQuery);
                            m6003D_("install_begin_ts", AFj1oSDK.this.getMediationNetwork, cursorQuery);
                            m6003D_("install_end_ts", AFj1oSDK.this.getMediationNetwork, cursorQuery);
                            m6004E_("organic_keywords", AFj1oSDK.this.getMediationNetwork, cursorQuery);
                            m6004E_("attr_type", AFj1oSDK.this.getMediationNetwork, cursorQuery);
                            HashMap map = new HashMap();
                            int columnIndex = cursorQuery.getColumnIndex("instant");
                            if (columnIndex != -1 && (string = cursorQuery.getString(columnIndex)) != null) {
                                map.put("instant", Boolean.valueOf(Boolean.parseBoolean(string)));
                            }
                            m6003D_("click_server_ts", map, cursorQuery);
                            m6003D_("install_begin_server_ts", map, cursorQuery);
                            m6004E_("install_version", map, cursorQuery);
                            if (!map.isEmpty()) {
                                AFj1oSDK.this.getMediationNetwork.put("custom", map);
                            }
                        } else {
                            AFj1oSDK.this.getMediationNetwork.put("response", "FEATURE_NOT_SUPPORTED");
                        }
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    } catch (Exception e11) {
                        AFj1oSDK.this.getMediationNetwork.put("response", "FEATURE_NOT_SUPPORTED");
                        AFLogger.afErrorLog(e11.getMessage(), e11, false, true);
                        if (0 != 0) {
                        }
                    }
                    String str = ((PackageItemInfo) this.getMediationNetwork.getPackageManager().resolveContentProvider(this.getCurrencyIso4217Code, 128)).packageName;
                    AFj1oSDK.this.getMediationNetwork.put("api_ver", Long.valueOf(AFj1jSDK.getCurrencyIso4217Code(this.getMediationNetwork, str)));
                    AFj1oSDK.this.getMediationNetwork.put("api_ver_name", AFj1jSDK.getMediationNetwork(this.getMediationNetwork, str));
                    AFj1oSDK.this.getRevenue();
                    return AFj1oSDK.this.getMediationNetwork;
                } catch (Throwable th2) {
                    if (0 != 0) {
                        cursorQuery.close();
                    }
                    throw th2;
                }
            }

            /* JADX INFO: renamed from: D_ */
            private static void m6003D_(String str, Map<String, Object> map, Cursor cursor) {
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex != -1) {
                    long j11 = cursor.getLong(columnIndex);
                    if (j11 == 0) {
                        return;
                    }
                    map.put(str, Long.valueOf(j11));
                }
            }

            /* JADX INFO: renamed from: E_ */
            private static void m6004E_(String str, Map<String, Object> map, Cursor cursor) {
                String string;
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex == -1 || (string = cursor.getString(columnIndex)) == null) {
                    return;
                }
                map.put(str, string);
            }
        };
        AFc1pSDK aFc1pSDKComponent4 = this.getMonetizationNetwork.component4();
        AFa1ySDK.getMonetizationNetwork();
        if (AFa1ySDK.getCurrencyIso4217Code(aFc1pSDKComponent4, false) > 0 || !aFb1rSDK.getMonetizationNetwork()) {
            return;
        }
        aFb1rSDK.AFAdRevenueData.execute(aFb1rSDK.getMonetizationNetwork);
        this.component4 = System.currentTimeMillis();
        this.areAllFieldsValid = AFj1tSDK.AFa1ySDK.STARTED;
        addObserver(new AFj1tSDK.C51842());
    }

    public AFj1oSDK(Runnable runnable, AFd1zSDK aFd1zSDK) {
        super("store", "samsung", runnable);
        this.getMonetizationNetwork = aFd1zSDK;
    }
}
