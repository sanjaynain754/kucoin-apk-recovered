package com.google.firebase.perf.config;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.FirebaseApp;
import com.google.firebase.StartupTime;
import com.google.firebase.inject.Provider;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.util.Optional;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigValue;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class RemoteConfigManager {
    private static final long FETCH_NEVER_HAPPENED_TIMESTAMP_MS = 0;
    private static final String FIREPERF_FRC_NAMESPACE_NAME = "fireperf";
    private static final long MIN_APP_START_CONFIG_FETCH_DELAY_MS = 5000;
    private static final int RANDOM_APP_START_CONFIG_FETCH_DELAY_MS = 25000;
    private final ConcurrentHashMap<String, FirebaseRemoteConfigValue> allRcConfigMap;
    private final long appStartConfigFetchDelayInMs;
    private final long appStartTimeInMs;
    private final DeviceCacheManager cache;
    private final Executor executor;

    @Nullable
    private FirebaseRemoteConfig firebaseRemoteConfig;
    private long firebaseRemoteConfigLastFetchTimestampMs;

    @Nullable
    private Provider<RemoteConfigComponent> firebaseRemoteConfigProvider;
    private static final AndroidLogger logger = AndroidLogger.getInstance();
    private static final RemoteConfigManager instance = new RemoteConfigManager();
    private static final long TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS = TimeUnit.HOURS.toMillis(12);

    @SuppressLint({"ThreadPoolCreation"})
    private RemoteConfigManager() {
        this(DeviceCacheManager.getInstance(), new ThreadPoolExecutor(0, 1, 0L, TimeUnit.SECONDS, new LinkedBlockingQueue()), null, ((long) new Random().nextInt(25000)) + 5000, getInitialStartupMillis());
    }

    @VisibleForTesting
    public static int getVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    public static RemoteConfigManager getInstance() {
        return instance;
    }

    private boolean hasAppStartConfigFetchDelayElapsed(long j11) {
        return j11 - this.appStartTimeInMs >= this.appStartConfigFetchDelayInMs;
    }

    private boolean hasLastFetchBecomeStale(long j11) {
        return j11 - this.firebaseRemoteConfigLastFetchTimestampMs > TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS;
    }

    public Optional<Boolean> getBoolean(String str) {
        if (str == null) {
            logger.debug("The key to get Remote Config boolean value is null.");
            return Optional.absent();
        }
        FirebaseRemoteConfigValue remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return Optional.m13846of(Boolean.valueOf(remoteConfigValue.asBoolean()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.asString().isEmpty()) {
                    logger.debug("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.asString(), str);
                }
            }
        }
        return Optional.absent();
    }

    public Optional<Double> getDouble(String str) {
        if (str == null) {
            logger.debug("The key to get Remote Config double value is null.");
            return Optional.absent();
        }
        FirebaseRemoteConfigValue remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return Optional.m13846of(Double.valueOf(remoteConfigValue.asDouble()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.asString().isEmpty()) {
                    logger.debug("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.asString(), str);
                }
            }
        }
        return Optional.absent();
    }

    public Optional<Long> getLong(String str) {
        if (str == null) {
            logger.debug("The key to get Remote Config long value is null.");
            return Optional.absent();
        }
        FirebaseRemoteConfigValue remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return Optional.m13846of(Long.valueOf(remoteConfigValue.asLong()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.asString().isEmpty()) {
                    logger.debug("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.asString(), str);
                }
            }
        }
        return Optional.absent();
    }

    public Optional<String> getString(String str) {
        if (str == null) {
            logger.debug("The key to get Remote Config String value is null.");
            return Optional.absent();
        }
        FirebaseRemoteConfigValue remoteConfigValue = getRemoteConfigValue(str);
        return remoteConfigValue != null ? Optional.m13846of(remoteConfigValue.asString()) : Optional.absent();
    }

    public boolean isFirebaseRemoteConfigAvailable() {
        Provider<RemoteConfigComponent> provider;
        RemoteConfigComponent remoteConfigComponent;
        if (this.firebaseRemoteConfig == null && (provider = this.firebaseRemoteConfigProvider) != null && (remoteConfigComponent = provider.get()) != null) {
            this.firebaseRemoteConfig = remoteConfigComponent.get(FIREPERF_FRC_NAMESPACE_NAME);
        }
        return this.firebaseRemoteConfig != null;
    }

    public boolean isLastFetchFailed() {
        FirebaseRemoteConfig firebaseRemoteConfig = this.firebaseRemoteConfig;
        return firebaseRemoteConfig == null || firebaseRemoteConfig.getInfo().getLastFetchStatus() == 1 || this.firebaseRemoteConfig.getInfo().getLastFetchStatus() == 2;
    }

    public void setFirebaseRemoteConfigProvider(@Nullable Provider<RemoteConfigComponent> provider) {
        this.firebaseRemoteConfigProvider = provider;
    }

    @VisibleForTesting
    public void syncConfigValues(Map<String, FirebaseRemoteConfigValue> map) {
        this.allRcConfigMap.putAll(map);
        for (String str : this.allRcConfigMap.keySet()) {
            if (!map.containsKey(str)) {
                this.allRcConfigMap.remove(str);
            }
        }
        ConfigurationConstants.ExperimentTTID experimentTTID = ConfigurationConstants.ExperimentTTID.getInstance();
        FirebaseRemoteConfigValue firebaseRemoteConfigValue = this.allRcConfigMap.get(experimentTTID.getRemoteConfigFlag());
        if (firebaseRemoteConfigValue == null) {
            logger.debug("ExperimentTTID remote config flag does not exist.");
            return;
        }
        try {
            this.cache.setValue(experimentTTID.getDeviceCacheFlag(), firebaseRemoteConfigValue.asBoolean());
        } catch (Exception unused) {
            logger.debug("ExperimentTTID remote config flag has invalid value, expected boolean.");
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m13818a(RemoteConfigManager remoteConfigManager, Exception exc) {
        remoteConfigManager.getClass();
        logger.warn("Call to Remote Config failed: %s. This may cause a degraded experience with Firebase Performance. Please reach out to Firebase Support https://firebase.google.com/support/", exc);
        remoteConfigManager.firebaseRemoteConfigLastFetchTimestampMs = 0L;
    }

    @VisibleForTesting
    public static long getInitialStartupMillis() {
        StartupTime startupTime;
        try {
            startupTime = (StartupTime) FirebaseApp.getInstance().get(StartupTime.class);
        } catch (IllegalStateException unused) {
            logger.debug("Unable to get StartupTime instance.");
            startupTime = null;
        }
        if (startupTime != null) {
            return startupTime.getEpochMillis();
        }
        return System.currentTimeMillis();
    }

    private FirebaseRemoteConfigValue getRemoteConfigValue(String str) {
        triggerRemoteConfigFetchIfNecessary();
        if (isFirebaseRemoteConfigAvailable() && this.allRcConfigMap.containsKey(str)) {
            FirebaseRemoteConfigValue firebaseRemoteConfigValue = this.allRcConfigMap.get(str);
            if (firebaseRemoteConfigValue.getSource() == 2) {
                logger.debug("Fetched value: '%s' for key: '%s' from Firebase Remote Config.", firebaseRemoteConfigValue.asString(), str);
                return firebaseRemoteConfigValue;
            }
            return null;
        }
        return null;
    }

    private boolean shouldFetchAndActivateRemoteConfigValues() {
        long currentSystemTimeMillis = getCurrentSystemTimeMillis();
        if (hasAppStartConfigFetchDelayElapsed(currentSystemTimeMillis) && hasLastFetchBecomeStale(currentSystemTimeMillis)) {
            return true;
        }
        return false;
    }

    private void triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch() {
        this.firebaseRemoteConfigLastFetchTimestampMs = getCurrentSystemTimeMillis();
        this.firebaseRemoteConfig.fetchAndActivate().addOnSuccessListener(this.executor, new OnSuccessListener() { // from class: com.google.firebase.perf.config.b
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                RemoteConfigManager remoteConfigManager = this.f12594a;
                remoteConfigManager.syncConfigValues(remoteConfigManager.firebaseRemoteConfig.getAll());
            }
        }).addOnFailureListener(this.executor, new OnFailureListener() { // from class: com.google.firebase.perf.config.c
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                RemoteConfigManager.m13818a(this.f12595a, exc);
            }
        });
    }

    private void triggerRemoteConfigFetchIfNecessary() {
        if (isFirebaseRemoteConfigAvailable()) {
            if (this.allRcConfigMap.isEmpty()) {
                this.allRcConfigMap.putAll(this.firebaseRemoteConfig.getAll());
            }
            if (shouldFetchAndActivateRemoteConfigValues()) {
                triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch();
            }
        }
    }

    @VisibleForTesting
    public long getCurrentSystemTimeMillis() {
        return System.currentTimeMillis();
    }

    public <T> T getRemoteConfigValueOrDefault(String str, T t11) {
        FirebaseRemoteConfigValue remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                if (t11 instanceof Boolean) {
                    return (T) Boolean.valueOf(remoteConfigValue.asBoolean());
                }
                if (t11 instanceof Double) {
                    return (T) Double.valueOf(remoteConfigValue.asDouble());
                }
                if (!(t11 instanceof Long) && !(t11 instanceof Integer)) {
                    if (t11 instanceof String) {
                        return (T) remoteConfigValue.asString();
                    }
                    T t12 = (T) remoteConfigValue.asString();
                    try {
                        logger.debug("No matching type found for the defaultValue: '%s', using String.", t11);
                        return t12;
                    } catch (IllegalArgumentException unused) {
                        t11 = t12;
                        if (!remoteConfigValue.asString().isEmpty()) {
                            logger.debug("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.asString(), str);
                        }
                        return t11;
                    }
                }
                return (T) Long.valueOf(remoteConfigValue.asLong());
            } catch (IllegalArgumentException unused2) {
            }
        }
        return t11;
    }

    @VisibleForTesting
    public RemoteConfigManager(DeviceCacheManager deviceCacheManager, Executor executor, FirebaseRemoteConfig firebaseRemoteConfig, long j11, long j12) {
        ConcurrentHashMap<String, FirebaseRemoteConfigValue> concurrentHashMap;
        this.firebaseRemoteConfigLastFetchTimestampMs = 0L;
        this.cache = deviceCacheManager;
        this.executor = executor;
        this.firebaseRemoteConfig = firebaseRemoteConfig;
        if (firebaseRemoteConfig == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
        } else {
            concurrentHashMap = new ConcurrentHashMap<>(firebaseRemoteConfig.getAll());
        }
        this.allRcConfigMap = concurrentHashMap;
        this.appStartTimeInMs = j12;
        this.appStartConfigFetchDelayInMs = j11;
    }
}
