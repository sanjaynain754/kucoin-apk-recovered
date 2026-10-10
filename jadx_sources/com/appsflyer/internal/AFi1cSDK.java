package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.core.app.NotificationCompat;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.appsflyer.AFLogger;
import com.tencent.thumbplayer.tcmedia.tplayer.plugins.report.TPReportParams;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import p852kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public class AFi1cSDK extends AFi1bSDK {

    @NonNull
    final ExecutorService getCurrencyIso4217Code;
    public final Map<String, Object> getMonetizationNetwork;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFi1cSDK$5 */
    /* JADX INFO: loaded from: classes34.dex */
    public class C51735 implements InstallReferrerStateListener {
        final /* synthetic */ Context val$context;
        final /* synthetic */ InstallReferrerClient val$referrerClient;

        public C51735(InstallReferrerClient installReferrerClient, Context context) {
            this.val$referrerClient = installReferrerClient;
            this.val$context = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onInstallReferrerSetupFinished$0(InstallReferrerClient installReferrerClient, Context context, int i11) {
            AFi1cSDK.this.getMonetizationNetwork(installReferrerClient, context, i11);
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public final void onInstallReferrerServiceDisconnected() {
            AFLogger.INSTANCE.m5971d(AFh1ySDK.REFERRER, "Install Referrer service disconnected");
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public final void onInstallReferrerSetupFinished(final int i11) {
            ExecutorService executorService = AFi1cSDK.this.getCurrencyIso4217Code;
            final InstallReferrerClient installReferrerClient = this.val$referrerClient;
            final Context context = this.val$context;
            executorService.execute(new Runnable() { // from class: com.appsflyer.internal.c0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6310b.lambda$onInstallReferrerSetupFinished$0(installReferrerClient, context, i11);
                }
            });
        }
    }

    private boolean getMonetizationNetwork(@NonNull Context context) {
        if (!getCurrencyIso4217Code()) {
            return false;
        }
        try {
            if (AFj1jSDK.getRevenue(context, "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE")) {
                AFLogger.INSTANCE.m5971d(AFh1ySDK.REFERRER, "Install referrer is allowed");
                return true;
            }
            AFLogger.INSTANCE.m5971d(AFh1ySDK.REFERRER, "Install referrer is not allowed");
            return false;
        } catch (ClassNotFoundException e11) {
            AFLogger.afErrorLogForExcManagerOnly("InstallReferrerClient not found", e11);
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1ySDK aFh1ySDK = AFh1ySDK.REFERRER;
            StringBuilder sb2 = new StringBuilder("Class ");
            sb2.append("com.android.installreferrer.api.InstallReferrerClient");
            sb2.append(" not found");
            aFLogger.m5977v(aFh1ySDK, sb2.toString());
            return false;
        } catch (Throwable th2) {
            AFLogger.INSTANCE.m5972e(AFh1ySDK.REFERRER, "An error occurred while trying to verify manifest : ".concat("com.android.installreferrer.api.InstallReferrerClient"), th2);
            return false;
        }
    }

    public AFi1cSDK(@NonNull Runnable runnable, @NonNull ExecutorService executorService, @NonNull AFc1kSDK aFc1kSDK) {
        super("store", "google", aFc1kSDK, runnable);
        this.getMonetizationNetwork = new HashMap();
        this.getCurrencyIso4217Code = executorService;
    }

    @Override // com.appsflyer.internal.AFj1tSDK
    public final void AFAdRevenueData(Context context) {
        if (!getMonetizationNetwork(context)) {
            return;
        }
        this.component4 = System.currentTimeMillis();
        this.areAllFieldsValid = AFj1tSDK.AFa1ySDK.STARTED;
        addObserver(new AFj1tSDK.C51842());
        try {
            InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(context).build();
            AFLogger.INSTANCE.m5971d(AFh1ySDK.REFERRER, "Connecting to Install Referrer Library...");
            installReferrerClientBuild.startConnection(new C51735(installReferrerClientBuild, context));
        } catch (Throwable th2) {
            AFLogger.INSTANCE.m5972e(AFh1ySDK.REFERRER, "referrerClient -> startConnection", th2);
        }
    }

    @VisibleForTesting
    @WorkerThread
    public final void getMonetizationNetwork(InstallReferrerClient installReferrerClient, Context context, int i11) {
        this.getMonetizationNetwork.put("code", String.valueOf(i11));
        Pair<Long, String> pairAFAdRevenueData = AFj1jSDK.AFAdRevenueData(context, "com.android.vending");
        this.getMediationNetwork.put("api_ver", pairAFAdRevenueData.getFirst());
        this.getMediationNetwork.put("api_ver_name", pairAFAdRevenueData.getSecond());
        if (i11 == -1) {
            AFLogger.INSTANCE.m5978w(AFh1ySDK.REFERRER, "InstallReferrer SERVICE_DISCONNECTED");
            this.getMediationNetwork.put("response", "SERVICE_DISCONNECTED");
        } else if (i11 == 0) {
            this.getMediationNetwork.put("response", "OK");
            try {
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFh1ySDK aFh1ySDK = AFh1ySDK.REFERRER;
                aFLogger.m5971d(aFh1ySDK, "InstallReferrer connected");
                if (installReferrerClient.isReady()) {
                    ReferrerDetails installReferrer = installReferrerClient.getInstallReferrer();
                    String installReferrer2 = installReferrer.getInstallReferrer();
                    if (installReferrer2 != null) {
                        this.getMonetizationNetwork.put(TPReportParams.JSON_KEY_VAL, installReferrer2);
                        this.getMediationNetwork.put("referrer", installReferrer2);
                    }
                    long referrerClickTimestampSeconds = installReferrer.getReferrerClickTimestampSeconds();
                    this.getMonetizationNetwork.put("clk", Long.toString(referrerClickTimestampSeconds));
                    this.getMediationNetwork.put("click_ts", Long.valueOf(referrerClickTimestampSeconds));
                    long installBeginTimestampSeconds = installReferrer.getInstallBeginTimestampSeconds();
                    this.getMonetizationNetwork.put("install", Long.toString(installBeginTimestampSeconds));
                    this.getMediationNetwork.put("install_begin_ts", Long.valueOf(installBeginTimestampSeconds));
                    HashMap map = new HashMap();
                    try {
                        boolean googlePlayInstantParam = installReferrer.getGooglePlayInstantParam();
                        this.getMonetizationNetwork.put("instant", Boolean.valueOf(googlePlayInstantParam));
                        map.put("instant", Boolean.valueOf(googlePlayInstantParam));
                    } catch (NoSuchMethodError e11) {
                        AFLogger.afErrorLogForExcManagerOnly("getGooglePlayInstantParam not exist", e11);
                    }
                    try {
                        map.put("click_server_ts", Long.valueOf(installReferrer.getReferrerClickTimestampServerSeconds()));
                        map.put("install_begin_server_ts", Long.valueOf(installReferrer.getInstallBeginTimestampServerSeconds()));
                        map.put("install_version", installReferrer.getInstallVersion());
                    } catch (NoSuchMethodError e12) {
                        AFLogger.INSTANCE.m5974e(AFh1ySDK.REFERRER, "some method not exist", e12, false, false);
                    }
                    if (!map.isEmpty()) {
                        this.getMediationNetwork.put("google_custom", map);
                    }
                    installReferrerClient.endConnection();
                } else {
                    aFLogger.m5978w(aFh1ySDK, "ReferrerClient: InstallReferrer is not ready");
                    this.getMonetizationNetwork.put(NotificationCompat.CATEGORY_ERROR, "ReferrerClient: InstallReferrer is not ready");
                }
            } catch (Throwable th2) {
                AFLogger aFLogger2 = AFLogger.INSTANCE;
                AFh1ySDK aFh1ySDK2 = AFh1ySDK.REFERRER;
                StringBuilder sb2 = new StringBuilder("Failed to get install referrer: ");
                sb2.append(th2.getMessage());
                aFLogger2.m5978w(aFh1ySDK2, sb2.toString());
                this.getMonetizationNetwork.put(NotificationCompat.CATEGORY_ERROR, th2.getMessage());
                aFLogger2.m5974e(aFh1ySDK2, "Failed to get install referrer", th2, false, false);
            }
        } else if (i11 == 1) {
            this.getMediationNetwork.put("response", "SERVICE_UNAVAILABLE");
            AFLogger.INSTANCE.m5978w(AFh1ySDK.REFERRER, "InstallReferrer not supported");
        } else if (i11 == 2) {
            AFLogger.INSTANCE.m5978w(AFh1ySDK.REFERRER, "InstallReferrer FEATURE_NOT_SUPPORTED");
            this.getMediationNetwork.put("response", "FEATURE_NOT_SUPPORTED");
        } else if (i11 != 3) {
            AFLogger.INSTANCE.m5978w(AFh1ySDK.REFERRER, "responseCode not found.");
        } else {
            AFLogger.INSTANCE.m5978w(AFh1ySDK.REFERRER, "InstallReferrer DEVELOPER_ERROR");
            this.getMediationNetwork.put("response", "DEVELOPER_ERROR");
        }
        AFLogger.INSTANCE.m5971d(AFh1ySDK.REFERRER, "Install Referrer collected locally");
        getRevenue();
    }
}
