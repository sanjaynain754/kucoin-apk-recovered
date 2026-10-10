package com.google.firebase.perf.config;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.FirebaseApp;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.util.Optional;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
@VisibleForTesting(otherwise = 3)
public class DeviceCacheManager {
    private static final String PREFS_NAME = "FirebasePerfSharedPrefs";
    private static DeviceCacheManager instance;
    private static final AndroidLogger logger = AndroidLogger.getInstance();
    private final ExecutorService serialExecutor;
    private volatile SharedPreferences sharedPref;

    @VisibleForTesting
    public static void clearInstance() {
        instance = null;
    }

    public synchronized void setContext(final Context context) {
        if (this.sharedPref == null && context != null) {
            this.serialExecutor.execute(new Runnable() { // from class: com.google.firebase.perf.config.a
                @Override // java.lang.Runnable
                public final void run() {
                    DeviceCacheManager.m13817a(this.f12592b, context);
                }
            });
        }
    }

    public boolean setValue(String str, boolean z11) {
        if (str == null) {
            logger.debug("Key is null when setting boolean value on device cache.");
            return false;
        }
        if (this.sharedPref == null) {
            setContext(getFirebaseApplicationContext());
            if (this.sharedPref == null) {
                return false;
            }
        }
        this.sharedPref.edit().putBoolean(str, z11).apply();
        return true;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m13817a(DeviceCacheManager deviceCacheManager, Context context) {
        if (deviceCacheManager.sharedPref != null || context == null) {
            return;
        }
        deviceCacheManager.sharedPref = context.getSharedPreferences("FirebasePerfSharedPrefs", 0);
    }

    @SuppressLint({"ThreadPoolCreation"})
    public static synchronized DeviceCacheManager getInstance() {
        try {
            if (instance == null) {
                instance = new DeviceCacheManager(Executors.newSingleThreadExecutor());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return instance;
    }

    public void clear(String str) {
        if (str == null) {
            logger.debug("Key is null. Cannot clear nullable key");
        } else {
            this.sharedPref.edit().remove(str).apply();
        }
    }

    public boolean containsKey(String str) {
        return (this.sharedPref == null || str == null || !this.sharedPref.contains(str)) ? false : true;
    }

    public Optional<Boolean> getBoolean(String str) {
        if (str == null) {
            logger.debug("Key is null when getting boolean value on device cache.");
            return Optional.absent();
        }
        if (this.sharedPref == null) {
            setContext(getFirebaseApplicationContext());
            if (this.sharedPref == null) {
                return Optional.absent();
            }
        }
        if (!this.sharedPref.contains(str)) {
            return Optional.absent();
        }
        try {
            return Optional.m13846of(Boolean.valueOf(this.sharedPref.getBoolean(str, false)));
        } catch (ClassCastException e11) {
            logger.debug("Key %s from sharedPreferences has type other than long: %s", str, e11.getMessage());
            return Optional.absent();
        }
    }

    public Optional<Double> getDouble(String str) {
        if (str == null) {
            logger.debug("Key is null when getting double value on device cache.");
            return Optional.absent();
        }
        if (this.sharedPref == null) {
            setContext(getFirebaseApplicationContext());
            if (this.sharedPref == null) {
                return Optional.absent();
            }
        }
        if (!this.sharedPref.contains(str)) {
            return Optional.absent();
        }
        try {
            try {
                return Optional.m13846of(Double.valueOf(Double.longBitsToDouble(this.sharedPref.getLong(str, 0L))));
            } catch (ClassCastException unused) {
                return Optional.m13846of(Double.valueOf(Float.valueOf(this.sharedPref.getFloat(str, 0.0f)).doubleValue()));
            }
        } catch (ClassCastException e11) {
            logger.debug("Key %s from sharedPreferences has type other than double: %s", str, e11.getMessage());
            return Optional.absent();
        }
    }

    public Optional<Long> getLong(String str) {
        if (str == null) {
            logger.debug("Key is null when getting long value on device cache.");
            return Optional.absent();
        }
        if (this.sharedPref == null) {
            setContext(getFirebaseApplicationContext());
            if (this.sharedPref == null) {
                return Optional.absent();
            }
        }
        if (!this.sharedPref.contains(str)) {
            return Optional.absent();
        }
        try {
            return Optional.m13846of(Long.valueOf(this.sharedPref.getLong(str, 0L)));
        } catch (ClassCastException e11) {
            logger.debug("Key %s from sharedPreferences has type other than long: %s", str, e11.getMessage());
            return Optional.absent();
        }
    }

    public Optional<String> getString(String str) {
        if (str == null) {
            logger.debug("Key is null when getting String value on device cache.");
            return Optional.absent();
        }
        if (this.sharedPref == null) {
            setContext(getFirebaseApplicationContext());
            if (this.sharedPref == null) {
                return Optional.absent();
            }
        }
        if (!this.sharedPref.contains(str)) {
            return Optional.absent();
        }
        try {
            return Optional.m13846of(this.sharedPref.getString(str, ""));
        } catch (ClassCastException e11) {
            logger.debug("Key %s from sharedPreferences has type other than String: %s", str, e11.getMessage());
            return Optional.absent();
        }
    }

    @VisibleForTesting
    public DeviceCacheManager(ExecutorService executorService) {
        this.serialExecutor = executorService;
    }

    @Nullable
    private Context getFirebaseApplicationContext() {
        try {
            FirebaseApp.getInstance();
            return FirebaseApp.getInstance().getApplicationContext();
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public boolean setValue(String str, String str2) {
        if (str == null) {
            logger.debug("Key is null when setting String value on device cache.");
            return false;
        }
        if (this.sharedPref == null) {
            setContext(getFirebaseApplicationContext());
            if (this.sharedPref == null) {
                return false;
            }
        }
        if (str2 == null) {
            this.sharedPref.edit().remove(str).apply();
            return true;
        }
        this.sharedPref.edit().putString(str, str2).apply();
        return true;
    }

    public boolean setValue(String str, double d11) {
        if (str == null) {
            logger.debug("Key is null when setting double value on device cache.");
            return false;
        }
        if (this.sharedPref == null) {
            setContext(getFirebaseApplicationContext());
            if (this.sharedPref == null) {
                return false;
            }
        }
        this.sharedPref.edit().putLong(str, Double.doubleToRawLongBits(d11)).apply();
        return true;
    }

    public boolean setValue(String str, long j11) {
        if (str == null) {
            logger.debug("Key is null when setting long value on device cache.");
            return false;
        }
        if (this.sharedPref == null) {
            setContext(getFirebaseApplicationContext());
            if (this.sharedPref == null) {
                return false;
            }
        }
        this.sharedPref.edit().putLong(str, j11).apply();
        return true;
    }
}
