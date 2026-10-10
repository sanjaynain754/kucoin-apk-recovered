package com.google.firebase.remoteconfig.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.credentials.provider.CredentialEntry;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.InstallationTokenResult;
import com.google.firebase.remoteconfig.BuildConfig;
import com.google.firebase.remoteconfig.ConfigUpdate;
import com.google.firebase.remoteconfig.ConfigUpdateListener;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class ConfigRealtimeHttpClient {
    private static final String API_KEY_HEADER = "X-Goog-Api-Key";

    @VisibleForTesting
    static final int[] BACKOFF_TIME_DURATIONS_IN_MINUTES = {2, 4, 8, 16, 32, 64, 128, 256};
    private static final Pattern GMP_APP_ID_PATTERN = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");
    private static final String INSTALLATIONS_AUTH_TOKEN_HEADER = "X-Goog-Firebase-Installations-Auth";
    private static final String X_ACCEPT_RESPONSE_STREAMING = "X-Accept-Response-Streaming";
    private static final String X_ANDROID_CERT_HEADER = "X-Android-Cert";
    private static final String X_ANDROID_PACKAGE_HEADER = "X-Android-Package";
    private static final String X_GOOGLE_GFE_CAN_RETRY = "X-Google-GFE-Can-Retry";
    ConfigCacheClient activatedCache;
    private ConfigAutoFetch configAutoFetch;
    private final ConfigFetchHandler configFetchHandler;
    private final Context context;
    private final FirebaseApp firebaseApp;
    private final FirebaseInstallationsApi firebaseInstallations;

    @GuardedBy("this")
    private int httpRetriesRemaining;
    private HttpURLConnection httpURLConnection;

    @GuardedBy("this")
    private final Set<ConfigUpdateListener> listeners;
    private final String namespace;
    private final ScheduledExecutorService scheduledExecutorService;
    private final ConfigSharedPrefsClient sharedPrefsClient;
    private final int ORIGINAL_RETRIES = 8;

    @GuardedBy("this")
    private boolean isHttpConnectionRunning = false;
    private final Random random = new Random();
    private final Clock clock = DefaultClock.getInstance();

    @GuardedBy("this")
    private boolean isRealtimeDisabled = false;
    private boolean isInBackground = false;
    private final Object backgroundLock = new Object();

    private synchronized boolean canMakeHttpStreamConnection() {
        return (this.listeners.isEmpty() || this.isHttpConnectionRunning || this.isRealtimeDisabled || this.isInBackground) ? false : true;
    }

    private synchronized boolean checkAndSetHttpConnectionFlagIfNotRunning() {
        boolean zCanMakeHttpStreamConnection;
        zCanMakeHttpStreamConnection = canMakeHttpStreamConnection();
        if (zCanMakeHttpStreamConnection) {
            setIsHttpConnectionRunning(true);
        }
        return zCanMakeHttpStreamConnection;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void enableBackoff() {
        this.isRealtimeDisabled = true;
    }

    private synchronized void makeRealtimeHttpConnection(long j11) {
        try {
            if (canMakeHttpStreamConnection()) {
                int i11 = this.httpRetriesRemaining;
                if (i11 > 0) {
                    this.httpRetriesRemaining = i11 - 1;
                    this.scheduledExecutorService.schedule(new Runnable() { // from class: com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient.1
                        @Override // java.lang.Runnable
                        public void run() {
                            ConfigRealtimeHttpClient.this.beginRealtimeHttpStream();
                        }
                    }, j11, TimeUnit.MILLISECONDS);
                } else if (!this.isInBackground) {
                    propagateErrors(new FirebaseRemoteConfigClientException("Unable to connect to the server. Check your connection and try again.", FirebaseRemoteConfigException.Code.CONFIG_UPDATE_STREAM_ERROR));
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void propagateErrors(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        Iterator<ConfigUpdateListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onError(firebaseRemoteConfigException);
        }
    }

    private synchronized void resetRetryCount() {
        this.httpRetriesRemaining = 8;
    }

    private synchronized void setIsHttpConnectionRunning(boolean z11) {
        this.isHttpConnectionRunning = z11;
    }

    @SuppressLint({"VisibleForTests"})
    public synchronized void retryHttpConnectionWhenBackoffEnds() {
        makeRealtimeHttpConnection(Math.max(0L, this.sharedPrefsClient.getRealtimeBackoffMetadata().getBackoffEndTime().getTime() - new Date(this.clock.currentTimeMillis()).getTime()));
    }

    @SuppressLint({"VisibleForTests"})
    public synchronized ConfigAutoFetch startAutoFetch(HttpURLConnection httpURLConnection) {
        return new ConfigAutoFetch(httpURLConnection, this.configFetchHandler, this.activatedCache, this.listeners, new ConfigUpdateListener() { // from class: com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient.2
            @Override // com.google.firebase.remoteconfig.ConfigUpdateListener
            public void onError(@NonNull FirebaseRemoteConfigException firebaseRemoteConfigException) {
                ConfigRealtimeHttpClient.this.enableBackoff();
                ConfigRealtimeHttpClient.this.propagateErrors(firebaseRemoteConfigException);
            }

            @Override // com.google.firebase.remoteconfig.ConfigUpdateListener
            public void onUpdate(@NonNull ConfigUpdate configUpdate) {
            }
        }, this.scheduledExecutorService);
    }

    private void closeHttpConnectionInputStream(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e11) {
                Log.d(FirebaseRemoteConfig.TAG, "Error closing connection stream.", e11);
            }
        }
    }

    private JSONObject createRequestBody(String str) {
        HashMap map = new HashMap();
        map.put("project", extractProjectNumberFromAppId(this.firebaseApp.getOptions().getApplicationId()));
        map.put("namespace", this.namespace);
        map.put("lastKnownVersionNumber", Long.toString(this.configFetchHandler.getTemplateVersionNumber()));
        map.put(RemoteConfigConstants.RequestFieldKey.APP_ID, this.firebaseApp.getOptions().getApplicationId());
        map.put(RemoteConfigConstants.RequestFieldKey.SDK_VERSION, BuildConfig.VERSION_NAME);
        map.put(RemoteConfigConstants.RequestFieldKey.INSTANCE_ID, str);
        return new JSONObject(map);
    }

    private static String extractProjectNumberFromAppId(String str) {
        Matcher matcher = GMP_APP_ID_PATTERN.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    private String getFingerprintHashForPackage() {
        try {
            Context context = this.context;
            byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
            if (packageCertificateHashBytes != null) {
                return Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
            }
            Log.e(FirebaseRemoteConfig.TAG, "Could not get fingerprint hash for package: " + this.context.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.i(FirebaseRemoteConfig.TAG, "No such package: " + this.context.getPackageName());
            return null;
        }
    }

    private long getRandomizedBackoffDurationInMillis(int i11) {
        int[] iArr = BACKOFF_TIME_DURATIONS_IN_MINUTES;
        int length = iArr.length;
        if (i11 >= length) {
            i11 = length;
        }
        long millis = TimeUnit.MINUTES.toMillis(iArr[i11 - 1]);
        return (millis / 2) + ((long) this.random.nextInt((int) millis));
    }

    private String getRealtimeURL(String str) {
        return String.format(RemoteConfigConstants.REALTIME_REGEX_URL, extractProjectNumberFromAppId(this.firebaseApp.getOptions().getApplicationId()), str);
    }

    private URL getUrl() {
        try {
            return new URL(getRealtimeURL(this.namespace));
        } catch (MalformedURLException unused) {
            Log.e(FirebaseRemoteConfig.TAG, "URL is malformed");
            return null;
        }
    }

    private boolean isStatusCodeRetryable(int i11) {
        return i11 == 408 || i11 == 429 || i11 == 502 || i11 == 503 || i11 == 504;
    }

    private String parseForbiddenErrorResponseMessage(InputStream inputStream) {
        StringBuilder sb2 = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb2.append(line);
            }
        } catch (IOException unused) {
            if (sb2.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb2.toString();
    }

    private void setCommonRequestHeaders(HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setRequestProperty(INSTALLATIONS_AUTH_TOKEN_HEADER, str);
        httpURLConnection.setRequestProperty(API_KEY_HEADER, this.firebaseApp.getOptions().getApiKey());
        httpURLConnection.setRequestProperty(X_ANDROID_PACKAGE_HEADER, this.context.getPackageName());
        httpURLConnection.setRequestProperty(X_ANDROID_CERT_HEADER, getFingerprintHashForPackage());
        httpURLConnection.setRequestProperty(X_GOOGLE_GFE_CAN_RETRY, "yes");
        httpURLConnection.setRequestProperty(X_ACCEPT_RESPONSE_STREAMING, CredentialEntry.TRUE_STRING);
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
    }

    private void updateBackoffMetadataWithLastFailedStreamConnectionTime(Date date) {
        int numFailedStreams = this.sharedPrefsClient.getRealtimeBackoffMetadata().getNumFailedStreams() + 1;
        this.sharedPrefsClient.setRealtimeBackoffMetadata(numFailedStreams, new Date(date.getTime() + getRandomizedBackoffDurationInMillis(numFailedStreams)));
    }

    @VisibleForTesting
    public void closeRealtimeHttpConnection(InputStream inputStream, InputStream inputStream2) {
        HttpURLConnection httpURLConnection = this.httpURLConnection;
        if (httpURLConnection != null && !this.isInBackground) {
            httpURLConnection.disconnect();
        }
        closeHttpConnectionInputStream(inputStream);
        closeHttpConnectionInputStream(inputStream2);
    }

    @SuppressLint({"VisibleForTests"})
    public Task<HttpURLConnection> createRealtimeConnection() {
        final Task<InstallationTokenResult> token = this.firebaseInstallations.getToken(false);
        final Task<String> id2 = this.firebaseInstallations.getId();
        return Tasks.whenAllComplete((Task<?>[]) new Task[]{token, id2}).continueWithTask(this.scheduledExecutorService, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.k
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return ConfigRealtimeHttpClient.m13872b(this.f12686a, token, id2, task);
            }
        });
    }

    @SuppressLint({"VisibleForTests"})
    public Date getBackoffEndTime() {
        return this.sharedPrefsClient.getRealtimeBackoffMetadata().getBackoffEndTime();
    }

    @SuppressLint({"VisibleForTests"})
    public int getNumberOfFailedStreams() {
        return this.sharedPrefsClient.getRealtimeBackoffMetadata().getNumFailedStreams();
    }

    public void setIsInBackground(boolean z11) {
        HttpURLConnection httpURLConnection;
        synchronized (this.backgroundLock) {
            try {
                this.isInBackground = z11;
                ConfigAutoFetch configAutoFetch = this.configAutoFetch;
                if (configAutoFetch != null) {
                    configAutoFetch.setIsInBackground(z11);
                }
                if (Build.VERSION.SDK_INT >= 26 && z11 && (httpURLConnection = this.httpURLConnection) != null) {
                    httpURLConnection.disconnect();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @SuppressLint({"VisibleForTests"})
    public void setRequestParams(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        httpURLConnection.setRequestMethod("POST");
        setCommonRequestHeaders(httpURLConnection, str2);
        byte[] bytes = createRequestBody(str).toString().getBytes("utf-8");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    public void startHttpConnection() {
        makeRealtimeHttpConnection(0L);
    }

    public ConfigRealtimeHttpClient(FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, ConfigFetchHandler configFetchHandler, ConfigCacheClient configCacheClient, Context context, String str, Set<ConfigUpdateListener> set, ConfigSharedPrefsClient configSharedPrefsClient, ScheduledExecutorService scheduledExecutorService) {
        this.listeners = set;
        this.scheduledExecutorService = scheduledExecutorService;
        this.httpRetriesRemaining = Math.max(8 - configSharedPrefsClient.getRealtimeBackoffMetadata().getNumFailedStreams(), 1);
        this.firebaseApp = firebaseApp;
        this.configFetchHandler = configFetchHandler;
        this.firebaseInstallations = firebaseInstallationsApi;
        this.activatedCache = configCacheClient;
        this.context = context;
        this.namespace = str;
        this.sharedPrefsClient = configSharedPrefsClient;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0091  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c1 A[Catch: all -> 0x0044, TryCatch #1 {all -> 0x0044, blocks: (B:9:0x0030, B:47:0x00bd, B:49:0x00c1, B:50:0x00c5), top: B:88:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00c5 A[Catch: all -> 0x0044, TRY_LEAVE, TryCatch #1 {all -> 0x0044, blocks: (B:9:0x0030, B:47:0x00bd, B:49:0x00c1, B:50:0x00c5), top: B:88:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Task m13871a(ConfigRealtimeHttpClient configRealtimeHttpClient, Task task, Task task2) throws Throwable {
        InputStream errorStream;
        Integer numValueOf;
        Throwable th2;
        InputStream inputStream;
        FirebaseRemoteConfigServerException firebaseRemoteConfigServerException;
        configRealtimeHttpClient.getClass();
        boolean z11 = true;
        try {
            if (task.isSuccessful()) {
                HttpURLConnection httpURLConnection = (HttpURLConnection) task.getResult();
                configRealtimeHttpClient.httpURLConnection = httpURLConnection;
                inputStream = httpURLConnection.getInputStream();
                try {
                    errorStream = configRealtimeHttpClient.httpURLConnection.getErrorStream();
                    try {
                        int responseCode = configRealtimeHttpClient.httpURLConnection.getResponseCode();
                        numValueOf = Integer.valueOf(responseCode);
                        if (responseCode == 200) {
                            try {
                                try {
                                    configRealtimeHttpClient.resetRetryCount();
                                    configRealtimeHttpClient.sharedPrefsClient.resetRealtimeBackoff();
                                    ConfigAutoFetch configAutoFetchStartAutoFetch = configRealtimeHttpClient.startAutoFetch(configRealtimeHttpClient.httpURLConnection);
                                    configRealtimeHttpClient.configAutoFetch = configAutoFetchStartAutoFetch;
                                    configAutoFetchStartAutoFetch.listenForNotifications();
                                } catch (IOException e11) {
                                    e = e11;
                                    if (configRealtimeHttpClient.isInBackground) {
                                        configRealtimeHttpClient.resetRetryCount();
                                    } else {
                                        Log.d(FirebaseRemoteConfig.TAG, "Exception connecting to real-time RC backend. Retrying the connection...", e);
                                    }
                                    configRealtimeHttpClient.closeRealtimeHttpConnection(inputStream, errorStream);
                                    configRealtimeHttpClient.setIsHttpConnectionRunning(false);
                                    if (!configRealtimeHttpClient.isInBackground || (numValueOf != 0 && !configRealtimeHttpClient.isStatusCodeRetryable(numValueOf.intValue()))) {
                                        z11 = false;
                                    }
                                    if (z11) {
                                        configRealtimeHttpClient.updateBackoffMetadataWithLastFailedStreamConnectionTime(new Date(configRealtimeHttpClient.clock.currentTimeMillis()));
                                    }
                                    if (!z11 || numValueOf.intValue() == 200) {
                                        configRealtimeHttpClient.retryHttpConnectionWhenBackoffEnds();
                                    } else {
                                        String forbiddenErrorResponseMessage = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", numValueOf);
                                        if (numValueOf.intValue() == 403) {
                                            forbiddenErrorResponseMessage = configRealtimeHttpClient.parseForbiddenErrorResponseMessage(configRealtimeHttpClient.httpURLConnection.getErrorStream());
                                        }
                                        firebaseRemoteConfigServerException = new FirebaseRemoteConfigServerException(numValueOf.intValue(), forbiddenErrorResponseMessage, FirebaseRemoteConfigException.Code.CONFIG_UPDATE_STREAM_ERROR);
                                    }
                                    configRealtimeHttpClient.httpURLConnection = null;
                                    configRealtimeHttpClient.configAutoFetch = null;
                                    return Tasks.forResult(null);
                                }
                            } catch (Throwable th3) {
                                th2 = th3;
                                configRealtimeHttpClient.closeRealtimeHttpConnection(inputStream, errorStream);
                                configRealtimeHttpClient.setIsHttpConnectionRunning(false);
                                if (configRealtimeHttpClient.isInBackground || (numValueOf != 0 && !configRealtimeHttpClient.isStatusCodeRetryable(numValueOf.intValue()))) {
                                    z11 = false;
                                }
                                if (z11) {
                                    configRealtimeHttpClient.updateBackoffMetadataWithLastFailedStreamConnectionTime(new Date(configRealtimeHttpClient.clock.currentTimeMillis()));
                                }
                                if (!z11 && numValueOf.intValue() != 200) {
                                    String forbiddenErrorResponseMessage2 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", numValueOf);
                                    if (numValueOf.intValue() == 403) {
                                        forbiddenErrorResponseMessage2 = configRealtimeHttpClient.parseForbiddenErrorResponseMessage(configRealtimeHttpClient.httpURLConnection.getErrorStream());
                                    }
                                    configRealtimeHttpClient.propagateErrors(new FirebaseRemoteConfigServerException(numValueOf.intValue(), forbiddenErrorResponseMessage2, FirebaseRemoteConfigException.Code.CONFIG_UPDATE_STREAM_ERROR));
                                } else {
                                    configRealtimeHttpClient.retryHttpConnectionWhenBackoffEnds();
                                }
                                throw th2;
                            }
                        }
                        configRealtimeHttpClient.closeRealtimeHttpConnection(inputStream, errorStream);
                        configRealtimeHttpClient.setIsHttpConnectionRunning(false);
                        if (configRealtimeHttpClient.isInBackground || !configRealtimeHttpClient.isStatusCodeRetryable(responseCode)) {
                            z11 = false;
                        }
                        if (z11) {
                            configRealtimeHttpClient.updateBackoffMetadataWithLastFailedStreamConnectionTime(new Date(configRealtimeHttpClient.clock.currentTimeMillis()));
                        }
                        if (!z11 && responseCode != 200) {
                            String forbiddenErrorResponseMessage3 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", numValueOf);
                            if (responseCode == 403) {
                                forbiddenErrorResponseMessage3 = configRealtimeHttpClient.parseForbiddenErrorResponseMessage(configRealtimeHttpClient.httpURLConnection.getErrorStream());
                            }
                            firebaseRemoteConfigServerException = new FirebaseRemoteConfigServerException(responseCode, forbiddenErrorResponseMessage3, FirebaseRemoteConfigException.Code.CONFIG_UPDATE_STREAM_ERROR);
                            configRealtimeHttpClient.propagateErrors(firebaseRemoteConfigServerException);
                        } else {
                            configRealtimeHttpClient.retryHttpConnectionWhenBackoffEnds();
                        }
                    } catch (IOException e12) {
                        e = e12;
                        numValueOf = 0;
                    } catch (Throwable th4) {
                        numValueOf = 0;
                        th2 = th4;
                    }
                } catch (IOException e13) {
                    e = e13;
                    errorStream = null;
                    numValueOf = errorStream;
                    if (configRealtimeHttpClient.isInBackground) {
                        configRealtimeHttpClient.resetRetryCount();
                    } else {
                        Log.d(FirebaseRemoteConfig.TAG, "Exception connecting to real-time RC backend. Retrying the connection...", e);
                    }
                    configRealtimeHttpClient.closeRealtimeHttpConnection(inputStream, errorStream);
                    configRealtimeHttpClient.setIsHttpConnectionRunning(false);
                    if (!configRealtimeHttpClient.isInBackground) {
                        z11 = false;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        configRealtimeHttpClient.updateBackoffMetadataWithLastFailedStreamConnectionTime(new Date(configRealtimeHttpClient.clock.currentTimeMillis()));
                    }
                    if (!z11) {
                    }
                    configRealtimeHttpClient.retryHttpConnectionWhenBackoffEnds();
                    configRealtimeHttpClient.httpURLConnection = null;
                    configRealtimeHttpClient.configAutoFetch = null;
                    return Tasks.forResult(null);
                } catch (Throwable th5) {
                    numValueOf = 0;
                    th2 = th5;
                    errorStream = null;
                }
                configRealtimeHttpClient.httpURLConnection = null;
                configRealtimeHttpClient.configAutoFetch = null;
                return Tasks.forResult(null);
            }
            throw new IOException(task.getException());
        } catch (IOException e14) {
            e = e14;
            inputStream = null;
            errorStream = null;
        } catch (Throwable th6) {
            errorStream = null;
            numValueOf = 0;
            th2 = th6;
            inputStream = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Task m13872b(ConfigRealtimeHttpClient configRealtimeHttpClient, Task task, Task task2, Task task3) {
        configRealtimeHttpClient.getClass();
        if (!task.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for config update listener connection.", task.getException()));
        }
        if (!task2.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for config update listener connection.", task2.getException()));
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) configRealtimeHttpClient.getUrl().openConnection();
            configRealtimeHttpClient.setRequestParams(httpURLConnection, (String) task2.getResult(), ((InstallationTokenResult) task.getResult()).getToken());
            return Tasks.forResult(httpURLConnection);
        } catch (IOException e11) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Failed to open HTTP stream connection", e11));
        }
    }

    @SuppressLint({"VisibleForTests", "DefaultLocale"})
    public void beginRealtimeHttpStream() {
        if (!checkAndSetHttpConnectionFlagIfNotRunning()) {
            return;
        }
        if (new Date(this.clock.currentTimeMillis()).before(this.sharedPrefsClient.getRealtimeBackoffMetadata().getBackoffEndTime())) {
            retryHttpConnectionWhenBackoffEnds();
        } else {
            final Task<HttpURLConnection> taskCreateRealtimeConnection = createRealtimeConnection();
            Tasks.whenAllComplete((Task<?>[]) new Task[]{taskCreateRealtimeConnection}).continueWith(this.scheduledExecutorService, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.l
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return ConfigRealtimeHttpClient.m13871a(this.f12689a, taskCreateRealtimeConnection, task);
                }
            });
        }
    }
}
