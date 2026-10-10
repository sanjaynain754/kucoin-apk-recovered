package com.appsflyer.oaid;

import android.content.Context;
import android.os.Build;
import androidx.annotation.Nullable;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.huawei.hms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes34.dex */
public class OaidClient {
    private final Context context;
    private final Logger logger;
    private final long timeout;
    private final TimeUnit unit;

    public static class Info {

        /* JADX INFO: renamed from: id */
        private final String f6365id;
        private final Boolean lat;

        public String getId() {
            return this.f6365id;
        }

        @Nullable
        public Boolean getLat() {
            return this.lat;
        }

        public Info(String str, Boolean bool) {
            this.f6365id = str;
            this.lat = bool;
        }
    }

    public OaidClient(Context context, long j11, TimeUnit timeUnit) {
        Logger logger = Logger.getLogger("AppsFlyerOaid6.9.0");
        this.logger = logger;
        this.context = context;
        this.timeout = j11;
        this.unit = timeUnit;
        logger.setLevel(Level.OFF);
    }

    private static boolean isHuawei() {
        try {
            return Build.BRAND.equalsIgnoreCase(JPushConstants.Manufacturer.HUAWEI) || ((Integer) Class.forName("com.huawei.android.os.BuildEx$VERSION").getDeclaredField("EMUI_SDK_INT").get(null)).intValue() > 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return false;
        }
    }

    @Nullable
    public Info fetch() {
        Info infoFetchMsa;
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (isHuawei()) {
                infoFetchMsa = fetchHuawei();
            } else {
                infoFetchMsa = isMsaAvailableAtRuntime() ? OaidMsaClient.fetchMsa(this.context, this.logger, this.timeout, this.unit) : null;
            }
            this.logger.info("Fetch " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
            return infoFetchMsa;
        } catch (Throwable th2) {
            this.logger.info(th2.getMessage());
            return null;
        }
    }

    private static boolean isMsaAvailableAtRuntime() {
        return true;
    }

    public void setLogging(boolean z11) {
        this.logger.setLevel(z11 ? null : Level.OFF);
    }

    @Nullable
    private Info fetchHuawei() {
        try {
            if (isMsaAvailableAtRuntime()) {
                OaidMsaClient.loadNativeLibrary();
            }
            FutureTask futureTask = new FutureTask(new Callable<Info>() { // from class: com.appsflyer.oaid.OaidClient.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public Info call() throws IOException {
                    AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(OaidClient.this.context);
                    if (advertisingIdInfo == null) {
                        return null;
                    }
                    return new Info(advertisingIdInfo.getId(), Boolean.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled()));
                }
            });
            new Thread(futureTask).start();
            return (Info) futureTask.get(this.timeout, this.unit);
        } catch (Throwable th2) {
            this.logger.info(th2.getMessage());
            return null;
        }
    }

    public OaidClient(Context context) {
        this(context, 1L, TimeUnit.SECONDS);
    }
}
