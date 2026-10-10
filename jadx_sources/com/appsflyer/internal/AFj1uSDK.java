package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyEnum;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1uSDK extends AFi1bSDK {

    @NotNull
    private final ExecutorService getCurrencyIso4217Code;

    @Override // com.appsflyer.internal.AFj1tSDK
    public final void getMonetizationNetwork() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFj1uSDK(@NotNull ExecutorService executorService, @NotNull AFc1kSDK aFc1kSDK, @NotNull Runnable runnable) {
        super("preload", "samsung", aFc1kSDK, runnable);
        Intrinsics.checkNotNullParameter(executorService, "");
        Intrinsics.checkNotNullParameter(aFc1kSDK, "");
        Intrinsics.checkNotNullParameter(runnable, "");
        this.getCurrencyIso4217Code = executorService;
    }

    /* JADX INFO: renamed from: C_ */
    private static boolean m6016C_(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("RESULT");
        if (columnIndex != -1) {
            return Boolean.parseBoolean(cursor.getString(columnIndex));
        }
        AFg1bSDK.d$default(AFLogger.INSTANCE, AFh1ySDK.SAMSUNG_PRELOAD_REFERRER, "No such column", false, 4, null);
        return false;
    }

    private static boolean getMonetizationNetwork(Context context) {
        return context.getPackageManager().resolveContentProvider("com.samsung.android.mapsagent.providers.apptracking", 0) != null;
    }

    @Override // com.appsflyer.internal.AFj1tSDK
    @SuppressLint({"NewApi"})
    public final void AFAdRevenueData(@NotNull final Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (getMediationNetwork(context)) {
            this.getCurrencyIso4217Code.execute(new Runnable() { // from class: com.appsflyer.internal.o0
                @Override // java.lang.Runnable
                public final void run() {
                    AFj1uSDK.getMonetizationNetwork(this.f6349b, context);
                }
            });
        }
    }

    private final boolean getMediationNetwork(Context context) {
        if (!getCurrencyIso4217Code()) {
            AFg1bSDK.d$default(AFLogger.INSTANCE, AFh1ySDK.SAMSUNG_PRELOAD_REFERRER, "Referrer collection disallowed by counter.", false, 4, null);
            return false;
        }
        if (!getMonetizationNetwork(context)) {
            AFg1bSDK.d$default(AFLogger.INSTANCE, AFh1ySDK.SAMSUNG_PRELOAD_REFERRER, "Referrer collection disallowed by missing content provider.", false, 4, null);
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:45:0x0109  */
    /* JADX WARN: Code duplicated, block: B:48:0x011b  */
    /* JADX WARN: Code duplicated, block: B:55:0x0134  */
    /* JADX WARN: Code duplicated, block: B:57:0x0139  */
    public static final void getMonetizationNetwork(AFj1uSDK aFj1uSDK, Context context) {
        Throwable th2;
        ContentProviderClient contentProviderClient;
        Cursor cursorQuery;
        Date revenue;
        Intrinsics.checkNotNullParameter(aFj1uSDK, "");
        Intrinsics.checkNotNullParameter(context, "");
        aFj1uSDK.component4 = System.currentTimeMillis();
        aFj1uSDK.areAllFieldsValid = AFj1tSDK.AFa1ySDK.STARTED;
        aFj1uSDK.addObserver(new AFj1tSDK.C51842());
        Cursor cursor = null;
        lValueOf = null;
        Long lValueOf = null;
        cursor = null;
        try {
            Uri uri = Uri.parse("content://com.samsung.android.mapsagent.providers.apptracking/info");
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uri);
            if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                try {
                    cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, context.getPackageName(), new String[]{"appsflyer001"}, null);
                } catch (Throwable th3) {
                    th2 = th3;
                    contentProviderClient = contentProviderClientAcquireUnstableContentProviderClient;
                    try {
                        AFLogger.INSTANCE.mo5915e(AFh1ySDK.SAMSUNG_PRELOAD_REFERRER, "Error while collecting referrer data", th2, false, false, true, true);
                        if (cursor != null) {
                            cursor.close();
                        }
                        if (contentProviderClient != null) {
                            contentProviderClient.close();
                        }
                        aFj1uSDK.getRevenue();
                    } catch (Throwable th4) {
                        if (cursor != null) {
                            cursor.close();
                        }
                        if (contentProviderClient != null) {
                            contentProviderClient.close();
                            throw th4;
                        }
                        throw th4;
                    }
                }
            } else {
                cursorQuery = null;
            }
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        if (m6016C_(cursorQuery)) {
                            String strM5991P_ = AFj1bSDK.m5991P_(cursorQuery, "INSTALLED_TIME_TEXT");
                            if (strM5991P_ != null && (revenue = AFj1gSDK.getRevenue(strM5991P_, "yy:MM:dd:hh:mm")) != null) {
                                lValueOf = Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(revenue.getTime()));
                            }
                            if (lValueOf != null) {
                                long jLongValue = lValueOf.longValue();
                                Map<String, Object> map = aFj1uSDK.getMediationNetwork;
                                Intrinsics.checkNotNullExpressionValue(map, "");
                                map.put("install_begin_ts", Long.valueOf(jLongValue));
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            String strM5991P_2 = AFj1bSDK.m5991P_(cursorQuery, "MAPS_ID");
                            if (strM5991P_2 != null) {
                                linkedHashMap.put("maps_id", strM5991P_2);
                            }
                            String strM5991P_3 = AFj1bSDK.m5991P_(cursorQuery, "DEVICE_NAME");
                            if (strM5991P_3 != null) {
                                linkedHashMap.put(TPDownloadProxyEnum.USER_DEVICE_MODEL, strM5991P_3);
                            }
                            String strM5991P_4 = AFj1bSDK.m5991P_(cursorQuery, "COUNTRY");
                            if (strM5991P_4 != null) {
                                linkedHashMap.put("country", strM5991P_4);
                            }
                            String strM5991P_5 = AFj1bSDK.m5991P_(cursorQuery, "CAMPAIGN_ID");
                            if (strM5991P_5 != null) {
                                linkedHashMap.put(FirebaseAnalytics.Param.CAMPAIGN_ID, strM5991P_5);
                            }
                            if (!linkedHashMap.isEmpty()) {
                                Map<String, Object> map2 = aFj1uSDK.getMediationNetwork;
                                Intrinsics.checkNotNullExpressionValue(map2, "");
                                map2.put("samsung_custom", linkedHashMap);
                            }
                            Map<String, Object> map3 = aFj1uSDK.getMediationNetwork;
                            Intrinsics.checkNotNullExpressionValue(map3, "");
                            map3.put("api_ver", Long.valueOf(AFj1jSDK.getCurrencyIso4217Code(context, "com.samsung.android.mapsagent")));
                            Map<String, Object> map4 = aFj1uSDK.getMediationNetwork;
                            Intrinsics.checkNotNullExpressionValue(map4, "");
                            map4.put("api_ver_name", AFj1jSDK.getMediationNetwork(context, "com.samsung.android.mapsagent"));
                        } else {
                            AFg1bSDK.i$default(AFLogger.INSTANCE, AFh1ySDK.SAMSUNG_PRELOAD_REFERRER, "App was not installed via Samsung MAPS.", false, 4, null);
                        }
                        cursorQuery.close();
                        if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                            contentProviderClientAcquireUnstableContentProviderClient.close();
                        }
                    } else {
                        AFg1bSDK.d$default(AFLogger.INSTANCE, AFh1ySDK.SAMSUNG_PRELOAD_REFERRER, "Content provider returned no data", false, 4, null);
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                            contentProviderClientAcquireUnstableContentProviderClient.close();
                        }
                    }
                } catch (Throwable th5) {
                    th2 = th5;
                    cursor = cursorQuery;
                    contentProviderClient = contentProviderClientAcquireUnstableContentProviderClient;
                    AFLogger.INSTANCE.mo5915e(AFh1ySDK.SAMSUNG_PRELOAD_REFERRER, "Error while collecting referrer data", th2, false, false, true, true);
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (contentProviderClient != null) {
                        contentProviderClient.close();
                    }
                }
            } else {
                AFg1bSDK.d$default(AFLogger.INSTANCE, AFh1ySDK.SAMSUNG_PRELOAD_REFERRER, "Content provider returned no data", false, 4, null);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                    contentProviderClientAcquireUnstableContentProviderClient.close();
                }
            }
        } catch (Throwable th6) {
            th2 = th6;
            contentProviderClient = null;
        }
        aFj1uSDK.getRevenue();
    }
}
