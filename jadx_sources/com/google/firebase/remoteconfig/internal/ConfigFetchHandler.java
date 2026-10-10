package com.google.firebase.remoteconfig.internal;

import android.text.format.DateUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.InstallationTokenResult;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class ConfigFetchHandler {

    @VisibleForTesting
    static final String FIRST_OPEN_TIME_KEY = "_fot";

    @VisibleForTesting
    static final int HTTP_TOO_MANY_REQUESTS = 429;
    private static final String X_FIREBASE_RC_FETCH_TYPE = "X-Firebase-RC-Fetch-Type";
    private final Provider<AnalyticsConnector> analyticsConnector;
    private final Clock clock;
    private final Map<String, String> customHttpHeaders;
    private final Executor executor;
    private final ConfigCacheClient fetchedConfigsCache;
    private final FirebaseInstallationsApi firebaseInstallations;
    private final ConfigFetchHttpClient frcBackendApiClient;
    private final ConfigSharedPrefsClient frcSharedPrefs;
    private final Random randomGenerator;
    public static final long DEFAULT_MINIMUM_FETCH_INTERVAL_IN_SECONDS = TimeUnit.HOURS.toSeconds(12);

    @VisibleForTesting
    static final int[] BACKOFF_TIME_DURATIONS_IN_MINUTES = {2, 4, 8, 16, 32, 64, 128, 256};

    public static class FetchResponse {
        private final Date fetchTime;
        private final ConfigContainer fetchedConfigs;

        @Nullable
        private final String lastFetchETag;
        private final int status;

        /* JADX INFO: loaded from: classes56.dex */
        @Retention(RetentionPolicy.SOURCE)
        public @interface Status {
            public static final int BACKEND_HAS_NO_UPDATES = 1;
            public static final int BACKEND_UPDATES_FETCHED = 0;
            public static final int LOCAL_STORAGE_USED = 2;
        }

        public static FetchResponse forBackendHasNoUpdates(Date date, ConfigContainer configContainer) {
            return new FetchResponse(date, 1, configContainer, null);
        }

        public static FetchResponse forBackendUpdatesFetched(ConfigContainer configContainer, String str) {
            return new FetchResponse(configContainer.getFetchTime(), 0, configContainer, str);
        }

        public static FetchResponse forLocalStorageUsed(Date date) {
            return new FetchResponse(date, 2, null, null);
        }

        public Date getFetchTime() {
            return this.fetchTime;
        }

        public ConfigContainer getFetchedConfigs() {
            return this.fetchedConfigs;
        }

        @Nullable
        public String getLastFetchETag() {
            return this.lastFetchETag;
        }

        public int getStatus() {
            return this.status;
        }

        private FetchResponse(Date date, int i11, ConfigContainer configContainer, @Nullable String str) {
            this.fetchTime = date;
            this.status = i11;
            this.fetchedConfigs = configContainer;
            this.lastFetchETag = str;
        }
    }

    public enum FetchType {
        BASE("BASE"),
        REALTIME("REALTIME");

        private final String value;

        public String getValue() {
            return this.value;
        }

        FetchType(String str) {
            this.value = str;
        }
    }

    public Task<FetchResponse> fetch() {
        return fetch(this.frcSharedPrefs.getMinimumFetchIntervalInSeconds());
    }

    private boolean areCachedFetchConfigsValid(long j11, Date date) {
        Date lastSuccessfulFetchTime = this.frcSharedPrefs.getLastSuccessfulFetchTime();
        if (lastSuccessfulFetchTime.equals(ConfigSharedPrefsClient.LAST_FETCH_TIME_NO_FETCH_YET)) {
            return false;
        }
        return date.before(new Date(lastSuccessfulFetchTime.getTime() + TimeUnit.SECONDS.toMillis(j11)));
    }

    private String createThrottledMessage(long j11) {
        return String.format("Fetch is throttled. Please wait before calling fetch again: %s", DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(j11)));
    }

    @WorkerThread
    private FetchResponse fetchFromBackend(String str, String str2, Date date, Map<String, String> map) throws FirebaseRemoteConfigException {
        Date date2;
        try {
            date2 = date;
            try {
                FetchResponse fetchResponseFetch = this.frcBackendApiClient.fetch(this.frcBackendApiClient.createHttpURLConnection(), str, str2, getUserProperties(), this.frcSharedPrefs.getLastFetchETag(), map, getFirstOpenTime(), date2, this.frcSharedPrefs.getCustomSignals());
                if (fetchResponseFetch.getFetchedConfigs() != null) {
                    this.frcSharedPrefs.setLastTemplateVersion(fetchResponseFetch.getFetchedConfigs().getTemplateVersionNumber());
                }
                if (fetchResponseFetch.getLastFetchETag() != null) {
                    this.frcSharedPrefs.setLastFetchETag(fetchResponseFetch.getLastFetchETag());
                }
                this.frcSharedPrefs.resetBackoff();
                return fetchResponseFetch;
            } catch (FirebaseRemoteConfigServerException e11) {
                e = e11;
                FirebaseRemoteConfigServerException firebaseRemoteConfigServerException = e;
                ConfigSharedPrefsClient.BackoffMetadata backoffMetadataUpdateAndReturnBackoffMetadata = updateAndReturnBackoffMetadata(firebaseRemoteConfigServerException.getHttpStatusCode(), date2);
                if (shouldThrottle(backoffMetadataUpdateAndReturnBackoffMetadata, firebaseRemoteConfigServerException.getHttpStatusCode())) {
                    throw new FirebaseRemoteConfigFetchThrottledException(backoffMetadataUpdateAndReturnBackoffMetadata.getBackoffEndTime().getTime());
                }
                throw createExceptionWithGenericMessage(firebaseRemoteConfigServerException);
            }
        } catch (FirebaseRemoteConfigServerException e12) {
            e = e12;
            date2 = date;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task<FetchResponse> fetchIfCacheExpiredAndNotThrottled(Task<ConfigContainer> task, long j11, final Map<String, String> map) {
        final ConfigFetchHandler configFetchHandler;
        Task taskContinueWithTask;
        final Date date = new Date(this.clock.currentTimeMillis());
        if (task.isSuccessful() && areCachedFetchConfigsValid(j11, date)) {
            return Tasks.forResult(FetchResponse.forLocalStorageUsed(date));
        }
        Date backoffEndTimeInMillis = getBackoffEndTimeInMillis(date);
        if (backoffEndTimeInMillis != null) {
            taskContinueWithTask = Tasks.forException(new FirebaseRemoteConfigFetchThrottledException(createThrottledMessage(backoffEndTimeInMillis.getTime() - date.getTime()), backoffEndTimeInMillis.getTime()));
            configFetchHandler = this;
        } else {
            final Task<String> id2 = this.firebaseInstallations.getId();
            final Task<InstallationTokenResult> token = this.firebaseInstallations.getToken(false);
            configFetchHandler = this;
            taskContinueWithTask = Tasks.whenAllComplete((Task<?>[]) new Task[]{id2, token}).continueWithTask(this.executor, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.f
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task2) {
                    return ConfigFetchHandler.m13865a(this.f12673a, id2, token, date, map, task2);
                }
            });
        }
        return taskContinueWithTask.continueWithTask(configFetchHandler.executor, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.g
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                return ConfigFetchHandler.m13867c(this.f12678a, date, task2);
            }
        });
    }

    @Nullable
    private Date getBackoffEndTimeInMillis(Date date) {
        Date backoffEndTime = this.frcSharedPrefs.getBackoffMetadata().getBackoffEndTime();
        if (date.before(backoffEndTime)) {
            return backoffEndTime;
        }
        return null;
    }

    @WorkerThread
    private Long getFirstOpenTime() {
        AnalyticsConnector analyticsConnector = this.analyticsConnector.get();
        if (analyticsConnector == null) {
            return null;
        }
        return (Long) analyticsConnector.getUserProperties(true).get(FIRST_OPEN_TIME_KEY);
    }

    private long getRandomizedBackoffDurationInMillis(int i11) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        int[] iArr = BACKOFF_TIME_DURATIONS_IN_MINUTES;
        long millis = timeUnit.toMillis(iArr[Math.min(i11, iArr.length) - 1]);
        return (millis / 2) + ((long) this.randomGenerator.nextInt((int) millis));
    }

    @WorkerThread
    private Map<String, String> getUserProperties() {
        HashMap map = new HashMap();
        AnalyticsConnector analyticsConnector = this.analyticsConnector.get();
        if (analyticsConnector != null) {
            for (Map.Entry<String, Object> entry : analyticsConnector.getUserProperties(false).entrySet()) {
                map.put(entry.getKey(), entry.getValue().toString());
            }
        }
        return map;
    }

    private boolean isThrottleableServerError(int i11) {
        return i11 == HTTP_TOO_MANY_REQUESTS || i11 == 502 || i11 == 503 || i11 == 504;
    }

    private void updateBackoffMetadataWithLastFailedFetchTime(Date date) {
        int numFailedFetches = this.frcSharedPrefs.getBackoffMetadata().getNumFailedFetches() + 1;
        this.frcSharedPrefs.setBackoffMetadata(numFailedFetches, new Date(date.getTime() + getRandomizedBackoffDurationInMillis(numFailedFetches)));
    }

    public Task<FetchResponse> fetch(final long j11) {
        final HashMap map = new HashMap(this.customHttpHeaders);
        map.put(X_FIREBASE_RC_FETCH_TYPE, FetchType.BASE.getValue() + "/1");
        return this.fetchedConfigsCache.get().continueWithTask(this.executor, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.e
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return this.f12670a.fetchIfCacheExpiredAndNotThrottled(task, j11, map);
            }
        });
    }

    public Task<FetchResponse> fetchNowWithTypeAndAttemptNumber(FetchType fetchType, int i11) {
        final HashMap map = new HashMap(this.customHttpHeaders);
        map.put(X_FIREBASE_RC_FETCH_TYPE, fetchType.getValue() + "/" + i11);
        return this.fetchedConfigsCache.get().continueWithTask(this.executor, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.h
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return this.f12680a.fetchIfCacheExpiredAndNotThrottled(task, 0L, map);
            }
        });
    }

    @VisibleForTesting
    public Provider<AnalyticsConnector> getAnalyticsConnector() {
        return this.analyticsConnector;
    }

    public long getTemplateVersionNumber() {
        return this.frcSharedPrefs.getLastTemplateVersion();
    }

    public ConfigFetchHandler(FirebaseInstallationsApi firebaseInstallationsApi, Provider<AnalyticsConnector> provider, Executor executor, Clock clock, Random random, ConfigCacheClient configCacheClient, ConfigFetchHttpClient configFetchHttpClient, ConfigSharedPrefsClient configSharedPrefsClient, Map<String, String> map) {
        this.firebaseInstallations = firebaseInstallationsApi;
        this.analyticsConnector = provider;
        this.executor = executor;
        this.clock = clock;
        this.randomGenerator = random;
        this.fetchedConfigsCache = configCacheClient;
        this.frcBackendApiClient = configFetchHttpClient;
        this.frcSharedPrefs = configSharedPrefsClient;
        this.customHttpHeaders = map;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Task m13865a(ConfigFetchHandler configFetchHandler, Task task, Task task2, Date date, Map map, Task task3) {
        configFetchHandler.getClass();
        if (!task.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for fetch.", task.getException()));
        }
        if (!task2.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for fetch.", task2.getException()));
        }
        return configFetchHandler.fetchFromBackendAndCacheResponse((String) task.getResult(), ((InstallationTokenResult) task2.getResult()).getToken(), date, map);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Task m13867c(ConfigFetchHandler configFetchHandler, Date date, Task task) {
        configFetchHandler.updateLastFetchStatusAndTime(task, date);
        return task;
    }

    private FirebaseRemoteConfigServerException createExceptionWithGenericMessage(FirebaseRemoteConfigServerException firebaseRemoteConfigServerException) throws FirebaseRemoteConfigClientException {
        String str;
        int httpStatusCode = firebaseRemoteConfigServerException.getHttpStatusCode();
        if (httpStatusCode != 401) {
            if (httpStatusCode != 403) {
                if (httpStatusCode != HTTP_TOO_MANY_REQUESTS) {
                    if (httpStatusCode != 500) {
                        switch (httpStatusCode) {
                            case 502:
                            case 503:
                            case 504:
                                str = "The server is unavailable. Please try again later.";
                                break;
                            default:
                                str = "The server returned an unexpected error.";
                                break;
                        }
                    } else {
                        str = "There was an internal server error.";
                    }
                } else {
                    throw new FirebaseRemoteConfigClientException("The throttled response from the server was not handled correctly by the FRC SDK.");
                }
            } else {
                str = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
            }
        } else {
            str = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
        }
        return new FirebaseRemoteConfigServerException(firebaseRemoteConfigServerException.getHttpStatusCode(), "Fetch failed: " + str, firebaseRemoteConfigServerException);
    }

    private Task<FetchResponse> fetchFromBackendAndCacheResponse(String str, String str2, Date date, Map<String, String> map) {
        try {
            final FetchResponse fetchResponseFetchFromBackend = fetchFromBackend(str, str2, date, map);
            if (fetchResponseFetchFromBackend.getStatus() != 0) {
                return Tasks.forResult(fetchResponseFetchFromBackend);
            }
            return this.fetchedConfigsCache.put(fetchResponseFetchFromBackend.getFetchedConfigs()).onSuccessTask(this.executor, new SuccessContinuation() { // from class: com.google.firebase.remoteconfig.internal.i
                @Override // com.google.android.gms.tasks.SuccessContinuation
                public final Task then(Object obj) {
                    return Tasks.forResult(fetchResponseFetchFromBackend);
                }
            });
        } catch (FirebaseRemoteConfigException e11) {
            return Tasks.forException(e11);
        }
    }

    private boolean shouldThrottle(ConfigSharedPrefsClient.BackoffMetadata backoffMetadata, int i11) {
        if (backoffMetadata.getNumFailedFetches() > 1 || i11 == HTTP_TOO_MANY_REQUESTS) {
            return true;
        }
        return false;
    }

    private ConfigSharedPrefsClient.BackoffMetadata updateAndReturnBackoffMetadata(int i11, Date date) {
        if (isThrottleableServerError(i11)) {
            updateBackoffMetadataWithLastFailedFetchTime(date);
        }
        return this.frcSharedPrefs.getBackoffMetadata();
    }

    private void updateLastFetchStatusAndTime(Task<FetchResponse> task, Date date) {
        if (task.isSuccessful()) {
            this.frcSharedPrefs.updateLastFetchAsSuccessfulAt(date);
            return;
        }
        Exception exception = task.getException();
        if (exception == null) {
            return;
        }
        if (exception instanceof FirebaseRemoteConfigFetchThrottledException) {
            this.frcSharedPrefs.updateLastFetchAsThrottled();
        } else {
            this.frcSharedPrefs.updateLastFetchAsFailed();
        }
    }
}
