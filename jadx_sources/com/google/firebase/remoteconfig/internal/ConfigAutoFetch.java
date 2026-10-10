package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.ConfigUpdate;
import com.google.firebase.remoteconfig.ConfigUpdateListener;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes56.dex */
public class ConfigAutoFetch {
    private static final int MAXIMUM_FETCH_ATTEMPTS = 3;
    private static final String REALTIME_DISABLED_KEY = "featureDisabled";
    private static final String TEMPLATE_VERSION_KEY = "latestTemplateVersionNumber";
    private final ConfigCacheClient activatedCache;
    private final ConfigFetchHandler configFetchHandler;

    @GuardedBy("this")
    private final Set<ConfigUpdateListener> eventListeners;
    private final HttpURLConnection httpURLConnection;
    private final ConfigUpdateListener retryCallback;
    private final ScheduledExecutorService scheduledExecutorService;
    private final Random random = new Random();
    private boolean isInBackground = false;

    private synchronized void executeAllListenerCallbacks(ConfigUpdate configUpdate) {
        Iterator<ConfigUpdateListener> it = this.eventListeners.iterator();
        while (it.hasNext()) {
            it.next().onUpdate(configUpdate);
        }
    }

    private synchronized boolean isEventListenersEmpty() {
        return this.eventListeners.isEmpty();
    }

    private synchronized void propagateErrors(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        Iterator<ConfigUpdateListener> it = this.eventListeners.iterator();
        while (it.hasNext()) {
            it.next().onError(firebaseRemoteConfigException);
        }
    }

    @VisibleForTesting
    public synchronized Task<Void> fetchLatestConfig(int i11, final long j11) throws Throwable {
        final int i12 = i11 - 1;
        try {
            try {
                final Task<ConfigFetchHandler.FetchResponse> taskFetchNowWithTypeAndAttemptNumber = this.configFetchHandler.fetchNowWithTypeAndAttemptNumber(ConfigFetchHandler.FetchType.REALTIME, 3 - i12);
                final Task<ConfigContainer> task = this.activatedCache.get();
                return Tasks.whenAllComplete((Task<?>[]) new Task[]{taskFetchNowWithTypeAndAttemptNumber, task}).continueWithTask(this.scheduledExecutorService, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.a
                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object then(Task task2) {
                        return ConfigAutoFetch.m13862a(this.f12659a, taskFetchNowWithTypeAndAttemptNumber, task, j11, i12, task2);
                    }
                });
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    private void autoFetch(final int i11, final long j11) {
        if (i11 == 0) {
            propagateErrors(new FirebaseRemoteConfigServerException("Unable to fetch the latest version of the template.", FirebaseRemoteConfigException.Code.CONFIG_UPDATE_NOT_FETCHED));
        } else {
            this.scheduledExecutorService.schedule(new Runnable() { // from class: com.google.firebase.remoteconfig.internal.ConfigAutoFetch.1
                @Override // java.lang.Runnable
                public void run() throws Throwable {
                    ConfigAutoFetch.this.fetchLatestConfig(i11, j11);
                }
            }, this.random.nextInt(4), TimeUnit.SECONDS);
        }
    }

    private void handleNotifications(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
        loop0: while (true) {
            String andValidateConfigUpdateMessage = "";
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break loop0;
                }
                andValidateConfigUpdateMessage = andValidateConfigUpdateMessage + line;
                if (line.contains("}")) {
                    andValidateConfigUpdateMessage = parseAndValidateConfigUpdateMessage(andValidateConfigUpdateMessage);
                    if (andValidateConfigUpdateMessage.isEmpty()) {
                    }
                }
            }
            try {
                JSONObject jSONObject = new JSONObject(andValidateConfigUpdateMessage);
                if (jSONObject.has(REALTIME_DISABLED_KEY) && jSONObject.getBoolean(REALTIME_DISABLED_KEY)) {
                    this.retryCallback.onError(new FirebaseRemoteConfigServerException("The server is temporarily unavailable. Try again in a few minutes.", FirebaseRemoteConfigException.Code.CONFIG_UPDATE_UNAVAILABLE));
                    break;
                } else {
                    if (isEventListenersEmpty()) {
                        break;
                    }
                    if (jSONObject.has(TEMPLATE_VERSION_KEY)) {
                        long templateVersionNumber = this.configFetchHandler.getTemplateVersionNumber();
                        long j11 = jSONObject.getLong(TEMPLATE_VERSION_KEY);
                        if (j11 > templateVersionNumber) {
                            autoFetch(3, j11);
                        }
                    }
                }
            } catch (JSONException e11) {
                propagateErrors(new FirebaseRemoteConfigClientException("Unable to parse config update message.", e11.getCause(), FirebaseRemoteConfigException.Code.CONFIG_UPDATE_MESSAGE_INVALID));
                Log.e(FirebaseRemoteConfig.TAG, "Unable to parse latest config update message.", e11);
            }
        }
        bufferedReader.close();
    }

    private String parseAndValidateConfigUpdateMessage(String str) {
        int iIndexOf = str.indexOf(123);
        int iLastIndexOf = str.lastIndexOf(125);
        return (iIndexOf < 0 || iLastIndexOf < 0 || iIndexOf >= iLastIndexOf) ? "" : str.substring(iIndexOf, iLastIndexOf + 1);
    }

    @VisibleForTesting
    public void listenForNotifications() {
        HttpURLConnection httpURLConnection = this.httpURLConnection;
        if (httpURLConnection == null) {
            return;
        }
        InputStream inputStream = null;
        try {
            try {
                try {
                    inputStream = httpURLConnection.getInputStream();
                    handleNotifications(inputStream);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (IOException e11) {
                    Log.d(FirebaseRemoteConfig.TAG, "Exception thrown when closing connection stream. Retrying connection...", e11);
                }
            } catch (IOException e12) {
                if (!this.isInBackground) {
                    Log.d(FirebaseRemoteConfig.TAG, "Real-time connection was closed due to an exception.", e12);
                }
                if (inputStream != null) {
                    inputStream.close();
                }
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (IOException e13) {
                    Log.d(FirebaseRemoteConfig.TAG, "Exception thrown when closing connection stream. Retrying connection...", e13);
                }
            }
            throw th2;
        }
    }

    public void setIsInBackground(boolean z11) {
        this.isInBackground = z11;
    }

    public ConfigAutoFetch(HttpURLConnection httpURLConnection, ConfigFetchHandler configFetchHandler, ConfigCacheClient configCacheClient, Set<ConfigUpdateListener> set, ConfigUpdateListener configUpdateListener, ScheduledExecutorService scheduledExecutorService) {
        this.httpURLConnection = httpURLConnection;
        this.configFetchHandler = configFetchHandler;
        this.activatedCache = configCacheClient;
        this.eventListeners = set;
        this.retryCallback = configUpdateListener;
        this.scheduledExecutorService = scheduledExecutorService;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Task m13862a(ConfigAutoFetch configAutoFetch, Task task, Task task2, long j11, int i11, Task task3) throws JSONException {
        configAutoFetch.getClass();
        if (!task.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Failed to auto-fetch config update.", task.getException()));
        }
        if (!task2.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Failed to get activated config for auto-fetch", task2.getException()));
        }
        ConfigFetchHandler.FetchResponse fetchResponse = (ConfigFetchHandler.FetchResponse) task.getResult();
        ConfigContainer configContainerBuild = (ConfigContainer) task2.getResult();
        if (!fetchResponseIsUpToDate(fetchResponse, j11).booleanValue()) {
            Log.d(FirebaseRemoteConfig.TAG, "Fetched template version is the same as SDK's current version. Retrying fetch.");
            configAutoFetch.autoFetch(i11, j11);
            return Tasks.forResult(null);
        }
        if (fetchResponse.getFetchedConfigs() == null) {
            Log.d(FirebaseRemoteConfig.TAG, "The fetch succeeded, but the backend had no updates.");
            return Tasks.forResult(null);
        }
        if (configContainerBuild == null) {
            configContainerBuild = ConfigContainer.newBuilder().build();
        }
        Set<String> changedParams = configContainerBuild.getChangedParams(fetchResponse.getFetchedConfigs());
        if (changedParams.isEmpty()) {
            Log.d(FirebaseRemoteConfig.TAG, "Config was fetched, but no params changed.");
            return Tasks.forResult(null);
        }
        configAutoFetch.executeAllListenerCallbacks(ConfigUpdate.create(changedParams));
        return Tasks.forResult(null);
    }

    private static Boolean fetchResponseIsUpToDate(ConfigFetchHandler.FetchResponse fetchResponse, long j11) {
        boolean z11 = false;
        if (fetchResponse.getFetchedConfigs() != null) {
            if (fetchResponse.getFetchedConfigs().getTemplateVersionNumber() >= j11) {
                z11 = true;
            }
            return Boolean.valueOf(z11);
        }
        if (fetchResponse.getStatus() == 1) {
            z11 = true;
        }
        return Boolean.valueOf(z11);
    }
}
