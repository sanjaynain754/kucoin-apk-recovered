package com.google.firebase.remoteconfig;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.XmlRes;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.abt.AbtException;
import com.google.firebase.abt.FirebaseABTesting;
import com.google.firebase.concurrent.FirebaseExecutors;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler;
import com.google.firebase.remoteconfig.internal.ConfigRealtimeHandler;
import com.google.firebase.remoteconfig.internal.ConfigSharedPrefsClient;
import com.google.firebase.remoteconfig.internal.DefaultsXmlParser;
import com.google.firebase.remoteconfig.internal.rollouts.RolloutsStateSubscriptionsHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseRemoteConfig {
    public static final boolean DEFAULT_VALUE_FOR_BOOLEAN = false;
    public static final byte[] DEFAULT_VALUE_FOR_BYTE_ARRAY = new byte[0];
    public static final double DEFAULT_VALUE_FOR_DOUBLE = 0.0d;
    public static final long DEFAULT_VALUE_FOR_LONG = 0;
    public static final String DEFAULT_VALUE_FOR_STRING = "";
    public static final int LAST_FETCH_STATUS_FAILURE = 1;
    public static final int LAST_FETCH_STATUS_NO_FETCH_YET = 0;
    public static final int LAST_FETCH_STATUS_SUCCESS = -1;
    public static final int LAST_FETCH_STATUS_THROTTLED = 2;
    public static final String TAG = "FirebaseRemoteConfig";
    public static final int VALUE_SOURCE_DEFAULT = 1;
    public static final int VALUE_SOURCE_REMOTE = 2;
    public static final int VALUE_SOURCE_STATIC = 0;
    private final ConfigCacheClient activatedConfigsCache;
    private final ConfigRealtimeHandler configRealtimeHandler;
    private final Context context;
    private final ConfigCacheClient defaultConfigsCache;
    private final Executor executor;
    private final ConfigFetchHandler fetchHandler;
    private final ConfigCacheClient fetchedConfigsCache;

    @Nullable
    private final FirebaseABTesting firebaseAbt;
    private final FirebaseApp firebaseApp;
    private final FirebaseInstallationsApi firebaseInstallations;
    private final ConfigSharedPrefsClient frcSharedPrefs;
    private final ConfigGetParameterHandler getHandler;
    private final RolloutsStateSubscriptionsHandler rolloutsStateSubscriptionsHandler;

    public FirebaseRemoteConfig(Context context, FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, @Nullable FirebaseABTesting firebaseABTesting, Executor executor, ConfigCacheClient configCacheClient, ConfigCacheClient configCacheClient2, ConfigCacheClient configCacheClient3, ConfigFetchHandler configFetchHandler, ConfigGetParameterHandler configGetParameterHandler, ConfigSharedPrefsClient configSharedPrefsClient, ConfigRealtimeHandler configRealtimeHandler, RolloutsStateSubscriptionsHandler rolloutsStateSubscriptionsHandler) {
        this.context = context;
        this.firebaseApp = firebaseApp;
        this.firebaseInstallations = firebaseInstallationsApi;
        this.firebaseAbt = firebaseABTesting;
        this.executor = executor;
        this.fetchedConfigsCache = configCacheClient;
        this.activatedConfigsCache = configCacheClient2;
        this.defaultConfigsCache = configCacheClient3;
        this.fetchHandler = configFetchHandler;
        this.getHandler = configGetParameterHandler;
        this.frcSharedPrefs = configSharedPrefsClient;
        this.configRealtimeHandler = configRealtimeHandler;
        this.rolloutsStateSubscriptionsHandler = rolloutsStateSubscriptionsHandler;
    }

    @NonNull
    public static FirebaseRemoteConfig getInstance() {
        return getInstance(FirebaseApp.getInstance());
    }

    @NonNull
    public Task<Void> fetch() {
        return this.fetchHandler.fetch().onSuccessTask(FirebaseExecutors.directExecutor(), new SuccessContinuation() { // from class: com.google.firebase.remoteconfig.b
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return Tasks.forResult(null);
            }
        });
    }

    @NonNull
    public Task<Void> setDefaultsAsync(@NonNull Map<String, Object> map) {
        HashMap map2 = new HashMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                map2.put(entry.getKey(), new String((byte[]) value));
            } else {
                map2.put(entry.getKey(), value.toString());
            }
        }
        return setDefaultsWithStringsMapAsync(map2);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Void m13849a(FirebaseRemoteConfig firebaseRemoteConfig, FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        firebaseRemoteConfig.frcSharedPrefs.setConfigSettings(firebaseRemoteConfigSettings);
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Void m13851c(FirebaseRemoteConfig firebaseRemoteConfig, CustomSignals customSignals) {
        firebaseRemoteConfig.frcSharedPrefs.setCustomSignals(customSignals.customSignals);
        return null;
    }

    @NonNull
    public static FirebaseRemoteConfig getInstance(@NonNull FirebaseApp firebaseApp) {
        return ((RemoteConfigComponent) firebaseApp.get(RemoteConfigComponent.class)).getDefault();
    }

    private static boolean isFetchedFresh(ConfigContainer configContainer, @Nullable ConfigContainer configContainer2) {
        return configContainer2 == null || !configContainer.getFetchTime().equals(configContainer2.getFetchTime());
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ Void m13858j(FirebaseRemoteConfig firebaseRemoteConfig) {
        firebaseRemoteConfig.activatedConfigsCache.clear();
        firebaseRemoteConfig.fetchedConfigsCache.clear();
        firebaseRemoteConfig.defaultConfigsCache.clear();
        firebaseRemoteConfig.frcSharedPrefs.clear();
        return null;
    }

    @VisibleForTesting
    public static List<Map<String, String>> toExperimentInfoMaps(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            HashMap map = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i11);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
            arrayList.add(map);
        }
        return arrayList;
    }

    @NonNull
    public Task<Boolean> activate() {
        final Task<ConfigContainer> task = this.fetchedConfigsCache.get();
        final Task<ConfigContainer> task2 = this.activatedConfigsCache.get();
        return Tasks.whenAllComplete((Task<?>[]) new Task[]{task, task2}).continueWithTask(this.executor, new Continuation() { // from class: com.google.firebase.remoteconfig.a
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task3) {
                return FirebaseRemoteConfig.m13857i(this.f12648a, task, task2, task3);
            }
        });
    }

    @NonNull
    public ConfigUpdateListenerRegistration addOnConfigUpdateListener(@NonNull ConfigUpdateListener configUpdateListener) {
        return this.configRealtimeHandler.addRealtimeConfigUpdateListener(configUpdateListener);
    }

    @NonNull
    public Task<FirebaseRemoteConfigInfo> ensureInitialized() {
        Task<ConfigContainer> task = this.activatedConfigsCache.get();
        Task<ConfigContainer> task2 = this.defaultConfigsCache.get();
        Task<ConfigContainer> task3 = this.fetchedConfigsCache.get();
        final Task taskCall = Tasks.call(this.executor, new Callable() { // from class: com.google.firebase.remoteconfig.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f12657b.getInfo();
            }
        });
        return Tasks.whenAllComplete((Task<?>[]) new Task[]{task, task2, task3, taskCall, this.firebaseInstallations.getId(), this.firebaseInstallations.getToken(false)}).continueWith(this.executor, new Continuation() { // from class: com.google.firebase.remoteconfig.j
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task4) {
                return FirebaseRemoteConfig.m13853e(taskCall, task4);
            }
        });
    }

    @NonNull
    public Map<String, FirebaseRemoteConfigValue> getAll() {
        return this.getHandler.getAll();
    }

    public boolean getBoolean(@NonNull String str) {
        return this.getHandler.getBoolean(str);
    }

    public double getDouble(@NonNull String str) {
        return this.getHandler.getDouble(str);
    }

    @NonNull
    public FirebaseRemoteConfigInfo getInfo() {
        return this.frcSharedPrefs.getInfo();
    }

    @NonNull
    public Set<String> getKeysByPrefix(@NonNull String str) {
        return this.getHandler.getKeysByPrefix(str);
    }

    public long getLong(@NonNull String str) {
        return this.getHandler.getLong(str);
    }

    public RolloutsStateSubscriptionsHandler getRolloutsStateSubscriptionsHandler() {
        return this.rolloutsStateSubscriptionsHandler;
    }

    @NonNull
    public String getString(@NonNull String str) {
        return this.getHandler.getString(str);
    }

    @NonNull
    public FirebaseRemoteConfigValue getValue(@NonNull String str) {
        return this.getHandler.getValue(str);
    }

    @NonNull
    public Task<Void> reset() {
        return Tasks.call(this.executor, new Callable() { // from class: com.google.firebase.remoteconfig.g
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return FirebaseRemoteConfig.m13858j(this.f12654b);
            }
        });
    }

    public void schedule(Runnable runnable) {
        this.executor.execute(runnable);
    }

    @NonNull
    public Task<Void> setConfigSettingsAsync(@NonNull final FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        return Tasks.call(this.executor, new Callable() { // from class: com.google.firebase.remoteconfig.h
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return FirebaseRemoteConfig.m13849a(this.f12655b, firebaseRemoteConfigSettings);
            }
        });
    }

    public void setConfigUpdateBackgroundState(boolean z11) {
        this.configRealtimeHandler.setBackgroundState(z11);
    }

    @NonNull
    public Task<Void> setCustomSignals(@NonNull final CustomSignals customSignals) {
        return Tasks.call(this.executor, new Callable() { // from class: com.google.firebase.remoteconfig.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return FirebaseRemoteConfig.m13851c(this.f12652b, customSignals);
            }
        });
    }

    public void startLoadingConfigsFromDisk() {
        this.activatedConfigsCache.get();
        this.defaultConfigsCache.get();
        this.fetchedConfigsCache.get();
    }

    @VisibleForTesting
    public void updateAbtWithActivatedExperiments(@NonNull JSONArray jSONArray) {
        if (this.firebaseAbt == null) {
            return;
        }
        try {
            this.firebaseAbt.replaceAllExperiments(toExperimentInfoMaps(jSONArray));
        } catch (AbtException e11) {
            Log.w(TAG, "Could not update ABT experiments.", e11);
        } catch (JSONException e12) {
            Log.e(TAG, "Could not parse ABT experiments from the JSON response.", e12);
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ FirebaseRemoteConfigInfo m13853e(Task task, Task task2) {
        return (FirebaseRemoteConfigInfo) task.getResult();
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ Task m13857i(final FirebaseRemoteConfig firebaseRemoteConfig, Task task, Task task2, Task task3) {
        firebaseRemoteConfig.getClass();
        if (task.isSuccessful() && task.getResult() != null) {
            ConfigContainer configContainer = (ConfigContainer) task.getResult();
            if (task2.isSuccessful() && !isFetchedFresh(configContainer, (ConfigContainer) task2.getResult())) {
                return Tasks.forResult(Boolean.FALSE);
            }
            return firebaseRemoteConfig.activatedConfigsCache.put(configContainer).continueWith(firebaseRemoteConfig.executor, new Continuation() { // from class: com.google.firebase.remoteconfig.d
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task4) {
                    return Boolean.valueOf(this.f12651a.processActivatePutTask(task4));
                }
            });
        }
        return Tasks.forResult(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean processActivatePutTask(Task<ConfigContainer> task) {
        if (task.isSuccessful()) {
            this.fetchedConfigsCache.clear();
            ConfigContainer result = task.getResult();
            if (result != null) {
                updateAbtWithActivatedExperiments(result.getAbtExperiments());
                this.rolloutsStateSubscriptionsHandler.publishActiveRolloutsState(result);
                return true;
            }
            Log.e(TAG, "Activated configs written to disk are null.");
            return true;
        }
        return false;
    }

    private Task<Void> setDefaultsWithStringsMapAsync(Map<String, String> map) {
        try {
            return this.defaultConfigsCache.put(ConfigContainer.newBuilder().replaceConfigsWith(map).build()).onSuccessTask(FirebaseExecutors.directExecutor(), new SuccessContinuation() { // from class: com.google.firebase.remoteconfig.c
                @Override // com.google.android.gms.tasks.SuccessContinuation
                public final Task then(Object obj) {
                    return Tasks.forResult(null);
                }
            });
        } catch (JSONException e11) {
            Log.e(TAG, "The provided defaults map could not be processed.", e11);
            return Tasks.forResult(null);
        }
    }

    @NonNull
    public Task<Boolean> fetchAndActivate() {
        return fetch().onSuccessTask(this.executor, new SuccessContinuation() { // from class: com.google.firebase.remoteconfig.k
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return this.f12699a.activate();
            }
        });
    }

    @NonNull
    public Task<Void> fetch(long j11) {
        return this.fetchHandler.fetch(j11).onSuccessTask(FirebaseExecutors.directExecutor(), new SuccessContinuation() { // from class: com.google.firebase.remoteconfig.e
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return Tasks.forResult(null);
            }
        });
    }

    @NonNull
    public Task<Void> setDefaultsAsync(@XmlRes int i11) {
        return setDefaultsWithStringsMapAsync(DefaultsXmlParser.getDefaultsFromXml(this.context, i11));
    }
}
