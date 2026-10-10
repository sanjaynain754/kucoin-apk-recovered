package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.database.Cursor;
import android.net.Uri;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.appsflyer.AFLogger;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1wSDK extends AFi1bSDK {
    private final AFd1zSDK getCurrencyIso4217Code;
    private final AFj1vSDK getMonetizationNetwork;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getCurrencyIso4217Code(Context context) {
        this.component4 = System.currentTimeMillis();
        this.areAllFieldsValid = AFj1tSDK.AFa1ySDK.STARTED;
        addObserver(new AFj1tSDK.C51842());
        String str = ((PackageItemInfo) context.getPackageManager().resolveContentProvider("com.huawei.appmarket.commondata", 128)).packageName;
        this.getMediationNetwork.put("api_ver", Long.valueOf(AFj1jSDK.getCurrencyIso4217Code(context, str)));
        this.getMediationNetwork.put("api_ver_name", AFj1jSDK.getMediationNetwork(context, str));
        Cursor cursorQuery = null;
        try {
            cursorQuery = context.getContentResolver().query(Uri.parse("content://com.huawei.appmarket.commondata/item/5"), null, null, new String[]{context.getPackageName()}, null);
            if (cursorQuery == null) {
                this.getMediationNetwork.put("response", "SERVICE_UNAVAILABLE");
            } else if (cursorQuery.moveToFirst()) {
                this.getMediationNetwork.put("response", "OK");
                this.getMediationNetwork.put("referrer", cursorQuery.getString(0));
                this.getMediationNetwork.put("click_ts", Long.valueOf(cursorQuery.getLong(1)));
                this.getMediationNetwork.put("install_end_ts", Long.valueOf(cursorQuery.getLong(2)));
                if (cursorQuery.getColumnCount() > 3) {
                    this.getMediationNetwork.put("install_begin_ts", Long.valueOf(cursorQuery.getLong(3)));
                    HashMap map = new HashMap();
                    String string = cursorQuery.getString(4);
                    if (string != null) {
                        map.put("track_id", string);
                    }
                    map.put("referrer_ex", cursorQuery.getString(5));
                    this.getMediationNetwork.put("huawei_custom", map);
                }
            } else {
                this.getMediationNetwork.put("response", "FEATURE_NOT_SUPPORTED");
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } catch (Throwable th2) {
            try {
                this.getMediationNetwork.put("response", "FEATURE_NOT_SUPPORTED");
                AFLogger.INSTANCE.m5974e(AFh1ySDK.REFERRER, th2.getMessage() != null ? th2.getMessage() : "", th2, false, true);
                if (0 != 0) {
                }
            } catch (Throwable th3) {
                if (0 == 0) {
                    throw th3;
                }
                cursorQuery.close();
                throw th3;
            }
        }
        getRevenue();
    }

    public AFj1wSDK(Runnable runnable, AFd1zSDK aFd1zSDK, AFj1vSDK aFj1vSDK) {
        super("store", JPushConstants.Manufacturer.HUAWEI, aFd1zSDK.getCurrencyIso4217Code(), runnable);
        this.getCurrencyIso4217Code = aFd1zSDK;
        this.getMonetizationNetwork = aFj1vSDK;
    }

    private boolean getRevenue(Context context) {
        if (!getCurrencyIso4217Code()) {
            AFLogger.INSTANCE.m5971d(AFh1ySDK.REFERRER, "Huawei referrer collection disallowed by counter.");
            return false;
        }
        if (!this.getMonetizationNetwork.AFAdRevenueData(context)) {
            AFLogger.INSTANCE.m5971d(AFh1ySDK.REFERRER, "Huawei referrer collection disallowed by missing content provider.");
            return false;
        }
        if (!this.getMonetizationNetwork.getRevenue(context)) {
            AFLogger.INSTANCE.m5971d(AFh1ySDK.REFERRER, "Huawei referrer collection disallowed by invalid content provider.");
            return false;
        }
        return true;
    }

    @Override // com.appsflyer.internal.AFj1tSDK
    public final void AFAdRevenueData(final Context context) {
        if (!getRevenue(context)) {
            return;
        }
        this.getCurrencyIso4217Code.getMonetizationNetwork().execute(new Runnable() { // from class: com.appsflyer.internal.p0
            @Override // java.lang.Runnable
            public final void run() {
                this.f6351b.getCurrencyIso4217Code(context);
            }
        });
    }
}
