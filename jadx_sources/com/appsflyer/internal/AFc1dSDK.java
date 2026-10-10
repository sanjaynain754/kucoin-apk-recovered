package com.appsflyer.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Process;
import android.view.View;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import com.tencent.bugly.proguard.C33820nf;
import java.lang.reflect.Constructor;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1dSDK implements AFd1zSDK {
    private static final int getCurrencyIso4217Code = (int) TimeUnit.SECONDS.toMillis(30);
    private ExecutorService AFAdRevenueData;
    private AFf1fSDK AFInAppEventParameterName;
    private AFc1tSDK AFInAppEventType;
    private AFd1ySDK AFKeystoreWrapper;
    private AFj1sSDK AFLogger;
    private AFh1qSDK AFPurchaseDetails;
    private AFi1nSDK afDebugLog;
    private AFa1jSDK afErrorLog;
    private AFe1uSDK afErrorLogForExcManagerOnly;
    private AFa1qSDK afInfoLog;
    private AFf1dSDK afLogForce;
    private AFg1aSDK afRDLog;

    @Nullable
    private AFi1fSDK afVerboseLog;
    private AFd1nSDK areAllFieldsValid;
    private PurchaseHandler component1;
    private AFc1jSDK component2;
    private AFf1iSDK component3;
    private AFc1kSDK component4;
    private AFj1nSDK copy;
    private AFg1pSDK copydefault;

    /* JADX INFO: renamed from: d */
    private AFi1rSDK f6288d;

    /* JADX INFO: renamed from: e */
    private AFi1mSDK f6289e;
    private AFe1nSDK equals;
    private AFa1aSDK force;
    private AFg1xSDK getLevel;
    private ScheduledExecutorService getMediationNetwork;
    private ExecutorService getRevenue;
    private AFh1tSDK hashCode;

    /* JADX INFO: renamed from: i */
    private AFg1wSDK f6290i;
    private AFe1vSDK registerClient;
    private AFd1kSDK toString;
    private AFb1bSDK unregisterClient;

    /* JADX INFO: renamed from: v */
    private AFg1uSDK f6291v;
    private AFc1iSDK values;

    /* JADX INFO: renamed from: w */
    private AFj1eSDK f6292w;
    private String afWarnLog = null;
    public final AFc1fSDK getMonetizationNetwork = new AFc1fSDK();

    /* JADX INFO: loaded from: classes34.dex */
    public static class AFa1uSDK implements ThreadFactory {
        private static final AtomicInteger getCurrencyIso4217Code = new AtomicInteger();
        private final AtomicInteger getMonetizationNetwork = new AtomicInteger();

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            int i11 = getCurrencyIso4217Code.get();
            int iIncrementAndGet = this.getMonetizationNetwork.incrementAndGet();
            StringBuilder sb2 = new StringBuilder("queue-");
            sb2.append(i11);
            sb2.append(C33820nf.f71144W);
            sb2.append(iIncrementAndGet);
            return new Thread(runnable, sb2.toString());
        }

        public AFa1uSDK() {
            getCurrencyIso4217Code.incrementAndGet();
        }
    }

    @NonNull
    private synchronized ExecutorService AFLoggerLogLevel() {
        try {
            if (this.getRevenue == null) {
                this.getRevenue = AFc1oSDK.getMonetizationNetwork();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.getRevenue;
    }

    @NonNull
    private synchronized AFd1nSDK afVerboseLog() {
        try {
            if (this.areAllFieldsValid == null) {
                this.areAllFieldsValid = new AFd1nSDK(new AFd1hSDK(getCurrencyIso4217Code), getMonetizationNetwork());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.areAllFieldsValid;
    }

    @NonNull
    private synchronized ScheduledExecutorService getLevel() {
        try {
            if (this.getMediationNetwork == null) {
                this.getMediationNetwork = AFc1oSDK.AFAdRevenueData();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.getMediationNetwork;
    }

    @NonNull
    private synchronized AFj1eSDK getPurchaseType() {
        try {
            if (this.f6292w == null) {
                this.f6292w = new AFj1eSDK(getCurrencyIso4217Code());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f6292w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    /* JADX INFO: renamed from: valueOf, reason: merged with bridge method [inline-methods] */
    public synchronized AFd1ySDK afErrorLogForExcManagerOnly() {
        try {
            if (this.AFKeystoreWrapper == null) {
                this.AFKeystoreWrapper = new AFd1ySDK(this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.AFKeystoreWrapper;
    }

    @NonNull
    private synchronized AFg1xSDK values() {
        try {
            if (this.getLevel == null) {
                this.getLevel = new AFg1xSDK(AFInAppEventParameterName(), getCurrencyIso4217Code());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.getLevel;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final synchronized AFc1fSDK AFInAppEventParameterName() {
        return this.getMonetizationNetwork;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final synchronized AFc1tSDK AFInAppEventType() {
        try {
            if (this.AFInAppEventType == null) {
                this.AFInAppEventType = new AFc1sSDK(AFInAppEventParameterName(), component4());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.AFInAppEventType;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final synchronized AFf1fSDK AFKeystoreWrapper() {
        try {
            if (this.AFInAppEventParameterName == null) {
                this.AFInAppEventParameterName = new AFf1fSDK(AFInAppEventParameterName(), new AFf1gSDK());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.AFInAppEventParameterName;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final synchronized AFj1sSDK AFLogger() {
        try {
            if (this.AFLogger == null) {
                this.AFLogger = new AFj1sSDK(this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.AFLogger;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final synchronized AFf1iSDK areAllFieldsValid() {
        try {
            if (this.component3 == null) {
                AFf1lSDK aFf1lSDK = new AFf1lSDK(component4());
                this.component3 = new AFf1iSDK(new AFf1pSDK(), getCurrencyIso4217Code(), AFKeystoreWrapper(), aFf1lSDK, new AFd1mSDK(afVerboseLog(), getCurrencyIso4217Code(), AppsFlyerProperties.getInstance(), registerClient(), getPurchaseType(), AFKeystoreWrapper()), new AFf1kSDK(getCurrencyIso4217Code(), aFf1lSDK), equals());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.component3;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final synchronized PurchaseHandler component1() {
        try {
            if (this.component1 == null) {
                this.component1 = new PurchaseHandler(this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.component1;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final synchronized AFh1tSDK component3() {
        try {
            if (this.hashCode == null) {
                this.hashCode = new AFh1tSDK(component4(), getCurrencyIso4217Code());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.hashCode;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final synchronized AFd1kSDK copy() {
        try {
            if (this.toString == null) {
                this.toString = new AFd1oSDK(this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.toString;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    /* JADX INFO: renamed from: e */
    public final synchronized AFa1qSDK mo5947e() {
        try {
            if (this.afInfoLog == null) {
                this.afInfoLog = new AFa1qSDK(this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.afInfoLog;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final synchronized AFe1nSDK equals() {
        try {
            if (this.equals == null) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 6, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>() { // from class: com.appsflyer.internal.AFc1dSDK.2
                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // java.util.concurrent.LinkedBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
                    /* JADX INFO: renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
                    public boolean offer(Runnable runnable) {
                        if (isEmpty()) {
                            return super.offer(runnable);
                        }
                        return false;
                    }
                }, new AFa1uSDK());
                threadPoolExecutor.setRejectedExecutionHandler(new RejectedExecutionHandler() { // from class: com.appsflyer.internal.m
                    @Override // java.util.concurrent.RejectedExecutionHandler
                    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor2) {
                        AFc1dSDK.getCurrencyIso4217Code(runnable, threadPoolExecutor2);
                    }
                });
                this.equals = new AFe1nSDK(threadPoolExecutor);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.equals;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final synchronized AFc1kSDK getCurrencyIso4217Code() {
        try {
            if (this.component4 == null) {
                AFc1fSDK aFc1fSDKAFInAppEventParameterName = AFInAppEventParameterName();
                AFc1pSDK aFc1pSDKComponent4 = component4();
                if (this.values == null) {
                    this.values = new AFc1iSDK();
                }
                this.component4 = new AFc1kSDK(aFc1fSDKAFInAppEventParameterName, aFc1pSDKComponent4, this.values, getMonetizationNetwork());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.component4;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final synchronized ExecutorService getMonetizationNetwork() {
        try {
            if (this.AFAdRevenueData == null) {
                this.AFAdRevenueData = AFc1oSDK.getRevenue();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.AFAdRevenueData;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final synchronized ScheduledExecutorService getRevenue() {
        try {
            if (this.getMediationNetwork == null) {
                this.getMediationNetwork = AFc1oSDK.getCurrencyIso4217Code();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.getMediationNetwork;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final synchronized AFe1vSDK registerClient() {
        try {
            if (this.registerClient == null) {
                this.registerClient = new AFe1vSDK(getCurrencyIso4217Code(), component4());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.registerClient;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    /* JADX INFO: renamed from: w */
    public final synchronized AFa1aSDK mo5950w() {
        try {
            if (this.force == null) {
                this.force = new AFa1cSDK(AFInAppEventParameterName());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.force;
    }

    @NonNull
    private String AFPurchaseDetails() {
        if (this.afWarnLog == null) {
            this.afWarnLog = new AFa1tSDK().getMediationNetwork();
        }
        return this.afWarnLog;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o_ */
    public /* synthetic */ SharedPreferences m5945o_() {
        Context context = this.getMonetizationNetwork.getMonetizationNetwork;
        if (context != null) {
            return AFa1ySDK.m5930d_(context);
        }
        throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final AFd1mSDK AFAdRevenueData() {
        return new AFd1mSDK(afVerboseLog(), getCurrencyIso4217Code(), AppsFlyerProperties.getInstance(), registerClient(), getPurchaseType(), AFKeystoreWrapper());
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final AFf1dSDK afDebugLog() {
        if (this.afLogForce == null) {
            Context context = this.getMonetizationNetwork.getMonetizationNetwork;
            if (context == null) {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
            AFf1bSDK aFf1bSDK = new AFf1bSDK(context, AppsFlyerProperties.getInstance());
            if (this.values == null) {
                this.values = new AFc1iSDK();
            }
            this.afLogForce = new AFf1eSDK(aFf1bSDK, this.values, AppsFlyerProperties.getInstance());
        }
        return this.afLogForce;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @Nullable
    @WorkerThread
    public final AFi1fSDK afErrorLog() {
        try {
            if (this.afVerboseLog == null) {
                try {
                    Object[] objArr = {getCurrencyIso4217Code(), AFInAppEventParameterName(), AFKeystoreWrapper()};
                    Map map = AFi1jSDK.f6302d;
                    Object declaredConstructor = map.get(1847399370);
                    if (declaredConstructor == null) {
                        declaredConstructor = ((Class) AFi1jSDK.getMediationNetwork((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 36 - ExpandableListView.getPackedPositionChild(0L), View.MeasureSpec.makeMeasureSpec(0, 0))).getDeclaredConstructor(AFc1kSDK.class, AFc1fSDK.class, AFf1fSDK.class);
                        map.put(1847399370, declaredConstructor);
                    }
                    this.afVerboseLog = (AFi1fSDK) ((Constructor) declaredConstructor).newInstance(objArr);
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            AFLogger.INSTANCE.m5974e(AFh1ySDK.PLAY_INTEGRITY_API, th3.getMessage() != null ? th3.getMessage() : "", th3, false, false);
        }
        return this.afVerboseLog;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final AFb1bSDK afInfoLog() {
        if (this.unregisterClient == null) {
            ScheduledExecutorService level = getLevel();
            AFa1qSDK aFa1qSDKMo5947e = mo5947e();
            if (this.afDebugLog == null) {
                this.afDebugLog = new AFi1kSDK();
            }
            this.unregisterClient = new AFb1aSDK(level, aFa1qSDKMo5947e, this.afDebugLog);
        }
        return this.unregisterClient;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final AFb1gSDK afLogForce() {
        if (this.values == null) {
            this.values = new AFc1iSDK();
        }
        return new AFb1hSDK(this.values, AFInAppEventParameterName(), AFKeystoreWrapper());
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final AFa1jSDK afWarnLog() {
        if (this.afErrorLog == null) {
            this.afErrorLog = new AFa1kSDK(component4());
        }
        return this.afErrorLog;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final AFg1pSDK component2() {
        if (this.copydefault == null) {
            String strAFPurchaseDetails = AFPurchaseDetails();
            Context context = this.getMonetizationNetwork.getMonetizationNetwork;
            if (context == null) {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
            if (this.f6289e == null) {
                this.f6289e = new AFi1iSDK();
            }
            AFi1mSDK aFi1mSDK = this.f6289e;
            if (this.f6290i == null) {
                this.f6290i = new AFg1sSDK();
            }
            AFg1wSDK aFg1wSDK = this.f6290i;
            if (this.copy == null) {
                Context context2 = this.getMonetizationNetwork.getMonetizationNetwork;
                if (context2 == null) {
                    throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
                }
                this.copy = new AFj1mSDK(context2, AFLoggerLogLevel());
            }
            AFj1nSDK aFj1nSDK = this.copy;
            if (this.f6291v == null) {
                this.f6291v = new AFg1oSDK();
            }
            AFg1uSDK aFg1uSDK = this.f6291v;
            AFh1tSDK aFh1tSDKComponent3 = component3();
            AFc1pSDK aFc1pSDKComponent4 = component4();
            AFc1kSDK currencyIso4217Code = getCurrencyIso4217Code();
            if (this.f6288d == null) {
                Context context3 = this.getMonetizationNetwork.getMonetizationNetwork;
                if (context3 == null) {
                    throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
                }
                this.f6288d = new AFi1rSDK(context3);
            }
            AFi1rSDK aFi1rSDK = this.f6288d;
            AFf1fSDK aFf1fSDKAFKeystoreWrapper = AFKeystoreWrapper();
            AFc1fSDK aFc1fSDKAFInAppEventParameterName = AFInAppEventParameterName();
            AFg1xSDK aFg1xSDKValues = values();
            if (this.values == null) {
                this.values = new AFc1iSDK();
            }
            this.copydefault = new AFg1rSDK(strAFPurchaseDetails, context, aFi1mSDK, aFg1wSDK, aFj1nSDK, aFg1uSDK, aFh1tSDKComponent3, aFc1pSDKComponent4, currencyIso4217Code, aFi1rSDK, aFf1fSDKAFKeystoreWrapper, aFc1fSDKAFInAppEventParameterName, aFg1xSDKValues, this.values);
        }
        return this.copydefault;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final AFc1pSDK component4() {
        if (this.component2 == null) {
            this.component2 = new AFc1jSDK(new AFc1gSDK(new Function0() { // from class: com.appsflyer.internal.n
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.f6346b.m5945o_();
                }
            }));
        }
        return this.component2;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final AFj1nSDK copydefault() {
        if (this.copy == null) {
            Context context = this.getMonetizationNetwork.getMonetizationNetwork;
            if (context == null) {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
            this.copy = new AFj1mSDK(context, AFLoggerLogLevel());
        }
        return this.copy;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    /* JADX INFO: renamed from: d */
    public final AFi1rSDK mo5946d() {
        if (this.f6288d == null) {
            Context context = this.getMonetizationNetwork.getMonetizationNetwork;
            if (context == null) {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
            this.f6288d = new AFi1rSDK(context);
        }
        return this.f6288d;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final AFg1aSDK force() {
        if (this.afRDLog == null) {
            this.afRDLog = new AFh1xSDK(this);
        }
        return this.afRDLog;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final AFe1uSDK getMediationNetwork() {
        if (this.afErrorLogForExcManagerOnly == null) {
            this.afErrorLogForExcManagerOnly = new AFe1uSDK(component4(), AFInAppEventParameterName(), getCurrencyIso4217Code(), getMonetizationNetwork(), component2(), AFKeystoreWrapper(), equals());
        }
        return this.afErrorLogForExcManagerOnly;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    /* JADX INFO: renamed from: i */
    public final AFi1nSDK mo5948i() {
        if (this.afDebugLog == null) {
            this.afDebugLog = new AFi1kSDK();
        }
        return this.afDebugLog;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final AFi1mSDK unregisterClient() {
        if (this.f6289e == null) {
            this.f6289e = new AFi1iSDK();
        }
        return this.f6289e;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    /* JADX INFO: renamed from: v */
    public final AFc1iSDK mo5949v() {
        if (this.values == null) {
            this.values = new AFc1iSDK();
        }
        return this.values;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @Nullable
    public final AFh1qSDK afRDLog() {
        if (AFh1sSDK.getMediationNetwork() && this.AFPurchaseDetails == null) {
            this.AFPurchaseDetails = new AFh1oSDK(getCurrencyIso4217Code(), AFLogger());
        }
        return this.AFPurchaseDetails;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void getCurrencyIso4217Code(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        try {
            threadPoolExecutor.getQueue().put(runnable);
        } catch (InterruptedException e11) {
            AFLogger.afErrorLogForExcManagerOnly("could not create executor for queue", e11);
            Thread.currentThread().interrupt();
        }
    }
}
