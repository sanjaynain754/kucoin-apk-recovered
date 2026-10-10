package com.jumio.core.network;

import androidx.annotation.VisibleForTesting;
import androidx.exifinterface.media.ExifInterface;
import androidx.webkit.ProxyConfig;
import com.facebook.react.animated.InterpolationAnimatedNode;
import com.google.common.net.HttpHeaders;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.jumio.analytics.Analytics;
import com.jumio.analytics.MetaInfo;
import com.jumio.analytics.MobileEvents;
import com.jumio.commons.log.Log;
import com.jumio.commons.log.LogLevel;
import com.jumio.commons.log.LogUtils;
import com.jumio.core.ServiceLocator;
import com.jumio.core.api.BackendManager;
import com.jumio.core.enums.ErrorCase;
import com.jumio.core.error.Error;
import com.jumio.core.interfaces.ConnectionInterface;
import com.jumio.core.models.ApiCallDataModel;
import com.jumio.core.models.BackendModel;
import com.jumio.core.models.SettingsModel;
import com.jumio.core.network.ApiCall;
import com.jumio.core.util.ConnectionChecker;
import com.jumio.core.util.LocaleUtil;
import com.jumio.core.util.LocaleUtilKt;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLException;
import javax.net.ssl.TrustManager;
import jumio.core.AbstractC40634a3;
import jumio.core.C40504A2;
import jumio.core.C40594S3;
import jumio.core.C40596T0;
import jumio.core.C40599T3;
import jumio.core.C40636b;
import jumio.core.InterfaceC40657f;
import jumio.core.RunnableC40647d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.p407io.CloseableKt;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\u00032\u00020\u0004:\u0001BB\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0014J\n\u0010(\u001a\u0004\u0018\u00010)H\u0014J\u0015\u0010*\u001a\u00028\u00002\u0006\u0010+\u001a\u00020\u0015H'¢\u0006\u0002\u0010,J\b\u0010-\u001a\u00020%H'J\u0010\u0010.\u001a\u00020#2\u0006\u0010/\u001a\u000200H$J\r\u00101\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u00102J\u0014\u00103\u001a\u00020\u00122\n\u00104\u001a\u000605j\u0002`6H\u0014J\u0018\u00107\u001a\u000605j\u0002`62\n\u00104\u001a\u000605j\u0002`6H\u0002J-\u00108\u001a\u00028\u00002\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020%2\u0006\u0010<\u001a\u00020'2\u0006\u0010+\u001a\u00020\u0015H\u0002¢\u0006\u0002\u0010=J\u0010\u0010>\u001a\u00020:2\u0006\u0010?\u001a\u00020\u0015H\u0004J\u000f\u0010@\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u00102J\b\u0010A\u001a\u00020\u0015H\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0013R\u0012\u0010\u0014\u001a\u00020\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0015X\u0084\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u0015X\u0094D¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u001fX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u0006C"}, m90084d2 = {"Lcom/jumio/core/network/ApiCall;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/jumio/core/model/Publisher;", "Ljava/util/concurrent/Callable;", "Lcom/jumio/core/network/MonitorableCall;", "apiCallSettings", "Lcom/jumio/core/network/ApiCallSettings;", "apiCallDataModel", "Lcom/jumio/core/models/ApiCallDataModel;", "<init>", "(Lcom/jumio/core/network/ApiCallSettings;Lcom/jumio/core/models/ApiCallDataModel;)V", "getApiCallSettings", "()Lcom/jumio/core/network/ApiCallSettings;", "getApiCallDataModel", "()Lcom/jumio/core/models/ApiCallDataModel;", "locale", "Ljava/util/Locale;", "isDeviceOffline", "", "()Z", "uri", "", "getUri", "()Ljava/lang/String;", "TAG", "getTAG$annotations", "()V", "getTAG", FirebaseAnalytics.Param.METHOD, "getMethod", "headers", "", "getHeaders", "()Ljava/util/Map;", "responseReceived", "", "status", "", "time", "", "additionalAnalyticsDetails", "Lcom/jumio/analytics/MetaInfo;", "parseResponse", "plainTextAnswer", "(Ljava/lang/String;)Ljava/lang/Object;", "prepareRequest", "fillRequest", "outputStream", "Ljava/io/OutputStream;", "execute", "()Ljava/lang/Object;", "checkSilentRetry", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "mapException", "handleHttpResponse", "connection", "Ljava/net/HttpURLConnection;", "httpStatus", "roundTripTime", "(Ljava/net/HttpURLConnection;IJLjava/lang/String;)Ljava/lang/Object;", "createClient", "useUrl", "call", "getCallId", "FireForgetRunnable", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nApiCall.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApiCall.kt\ncom/jumio/core/network/ApiCall\n+ 2 Log.kt\ncom/jumio/commons/log/Log\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,353:1\n34#2:354\n560#3:355\n545#3,6:356\n216#4,2:362\n*S KotlinDebug\n*F\n+ 1 ApiCall.kt\ncom/jumio/core/network/ApiCall\n*L\n133#1:354\n282#1:355\n282#1:356,6\n282#1:362,2\n*E\n"})
public abstract class ApiCall<T> extends AbstractC40634a3 implements Callable<T> {

    /* JADX INFO: renamed from: c */
    public final InterfaceC40657f f14407c;

    /* JADX INFO: renamed from: d */
    public final ApiCallDataModel f14408d;

    /* JADX INFO: renamed from: e */
    public final String f14409e;

    /* JADX INFO: renamed from: f */
    public final String f14410f;

    /* JADX INFO: renamed from: g */
    public final Map f14411g;

    /* JADX INFO: renamed from: a */
    public static final ConnectionInterface m14572a() {
        return new ConnectionChecker();
    }

    @Nullable
    public MetaInfo additionalAnalyticsDetails() {
        return null;
    }

    @NotNull
    public final HttpURLConnection createClient(@NotNull String useUrl) throws Exception {
        Intrinsics.checkNotNullParameter(useUrl, "useUrl");
        URL url = new URL(useUrl);
        if (!url.getProtocol().equals(ProxyConfig.MATCH_HTTPS)) {
            throw new Exception("Only https ApiCalls are supported!");
        }
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
        Intrinsics.checkNotNull(uRLConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnection;
        httpsURLConnection.setSSLSocketFactory(new C40594S3(new TrustManager[]{this.f14407c.getF13696m()}));
        httpsURLConnection.setRequestMethod(getF14410f());
        httpsURLConnection.setUseCaches(false);
        httpsURLConnection.setDoInput(true);
        httpsURLConnection.setDoOutput(!Intrinsics.areEqual("GET", getF14410f()));
        Map<String, String> headers = getHeaders();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : headers.entrySet()) {
            if (!Intrinsics.areEqual(entry.getKey(), "Content-Type")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            httpsURLConnection.setRequestProperty((String) entry2.getKey(), (String) entry2.getValue());
        }
        httpsURLConnection.setRequestProperty("Content-Type", "application/ale");
        httpsURLConnection.setConnectTimeout(this.f14408d.getF14178f());
        httpsURLConnection.setReadTimeout(this.f14408d.getF14178f());
        return httpsURLConnection;
    }

    /* JADX WARN: Code duplicated, block: B:85:0x01e4 A[Catch: all -> 0x01bf, Exception -> 0x01c3, TryCatch #12 {Exception -> 0x01c3, all -> 0x01bf, blocks: (B:61:0x01af, B:74:0x01cc, B:76:0x01d0, B:77:0x01d2, B:83:0x01dc, B:85:0x01e4, B:86:0x01f0), top: B:135:0x00b3 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v23, types: [com.jumio.core.network.EncryptionProvider] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    @Nullable
    public final T execute() throws Exception {
        ?? encryptionProvider;
        double d11;
        getCallId();
        ?? r11 = 0;
        ?? r12 = 0;
        try {
            try {
                if (((BackendModel) this.f14407c.getF13686c().get(BackendModel.class)).checkAndIncreaseCounter(this.f14408d.getCall(), ((SettingsModel) this.f14407c.getF13686c().get(SettingsModel.class)).getThrottlingLimit())) {
                    throw new C40599T3(429, "Throttling limit reached");
                }
                int iPrepareRequest = prepareRequest();
                HttpURLConnection httpURLConnectionCreateClient = createClient(this.f14407c.getF13694k() + getUri());
                try {
                    String string = httpURLConnectionCreateClient.getURL().toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    Log.m14463d(this.f14409e, "Sending request " + string + " with length " + iPrepareRequest);
                    LogLevel logLevel = LogLevel.OFF;
                    long jNanoTime = System.nanoTime();
                    encryptionProvider = this.f14407c.getEncryptionProvider();
                    try {
                        if (encryptionProvider == 0) {
                            publishError(new Error(ErrorCase.OCR_LOADING_FAILED, 0, 0, 6, null));
                            if (!this.f14408d.getF14176d()) {
                                httpURLConnectionCreateClient.disconnect();
                            }
                            return null;
                        }
                        int i11 = 0;
                        try {
                            try {
                                if (!Intrinsics.areEqual(httpURLConnectionCreateClient.getRequestMethod(), "GET")) {
                                    OutputStream outputStream = httpURLConnectionCreateClient.getOutputStream();
                                    Intrinsics.checkNotNullExpressionValue(outputStream, "getOutputStream(...)");
                                    String str = getHeaders().get("Content-Type");
                                    if (str == null) {
                                        str = "application/json";
                                    }
                                    OutputStream outputStreamCreateRequest = encryptionProvider.createRequest(outputStream, iPrepareRequest, str);
                                    try {
                                        fillRequest(outputStreamCreateRequest);
                                        outputStreamCreateRequest.flush();
                                        Unit unit = Unit.INSTANCE;
                                        CloseableKt.closeFinally(outputStreamCreateRequest, null);
                                    } catch (Throwable th2) {
                                        try {
                                            throw th2;
                                        } catch (Throwable th3) {
                                            CloseableKt.closeFinally(outputStreamCreateRequest, th2);
                                            throw th3;
                                        }
                                    }
                                }
                                if (this.f14408d.getF14176d()) {
                                    new Thread(new RunnableC40647d(httpURLConnectionCreateClient, encryptionProvider)).start();
                                    Log.m14463d(this.f14409e, "Started fire&forget call - return with empty response");
                                    T response = parseResponse("");
                                    if (!this.f14408d.getF14176d()) {
                                        responseReceived(0, (long) ((System.nanoTime() - jNanoTime) / 1000000.0d));
                                    }
                                    if (!this.f14408d.getF14176d()) {
                                        httpURLConnectionCreateClient.disconnect();
                                    }
                                    return response;
                                }
                                int responseCode = httpURLConnectionCreateClient.getResponseCode();
                                try {
                                    String str2 = this.f14409e;
                                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                                    Locale locale = Locale.ENGLISH;
                                    String str3 = String.format(locale, "Response was %d, %s", Arrays.copyOf(new Object[]{Integer.valueOf(responseCode), httpURLConnectionCreateClient.getResponseMessage()}, 2));
                                    Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
                                    Log.m14463d(str2, str3);
                                    String str4 = this.f14409e;
                                    long jNanoTime2 = 0;
                                    d11 = 1000000.0d;
                                    try {
                                        String str5 = String.format(locale, "Received response for %s in %d ms", Arrays.copyOf(new Object[]{httpURLConnectionCreateClient.getURL().toString(), 0L}, 2));
                                        Intrinsics.checkNotNullExpressionValue(str5, "format(...)");
                                        Log.m14479v(str4, str5);
                                        if (!this.f14408d.getF14176d()) {
                                            jNanoTime2 = (long) ((System.nanoTime() - jNanoTime) / 1000000.0d);
                                            responseReceived(responseCode, jNanoTime2);
                                        }
                                        try {
                                            T t11 = (T) m14573a(httpURLConnectionCreateClient, responseCode, jNanoTime2, encryptionProvider.getResponse(responseCode == 200 ? httpURLConnectionCreateClient.getInputStream() : httpURLConnectionCreateClient.getErrorStream()));
                                            if (!this.f14408d.getF14176d()) {
                                                httpURLConnectionCreateClient.disconnect();
                                            }
                                            return t11;
                                        } catch (C40599T3 e11) {
                                            if (e11.f90127a == 0) {
                                                e11.f90127a = responseCode;
                                            }
                                            throw e11;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        i11 = responseCode;
                                        if (!this.f14408d.getF14176d()) {
                                            responseReceived(i11, (long) ((System.nanoTime() - jNanoTime) / d11));
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    d11 = 1000000.0d;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                d11 = 1000000.0d;
                                if (!this.f14408d.getF14176d()) {
                                    responseReceived(i11, (long) ((System.nanoTime() - jNanoTime) / d11));
                                }
                                throw th;
                            }
                        } catch (Exception e12) {
                            e = e12;
                        } catch (Throwable th7) {
                            th = th7;
                            r11 = encryptionProvider;
                            if (!this.f14408d.getF14176d()) {
                                r11.disconnect();
                            }
                            throw th;
                        }
                    } catch (Exception e13) {
                        e = e13;
                        r12 = httpURLConnectionCreateClient;
                    } catch (Throwable th8) {
                        th = th8;
                        r11 = httpURLConnectionCreateClient;
                        if (!this.f14408d.getF14176d() && r11 != 0) {
                            r11.disconnect();
                        }
                        throw th;
                    }
                } catch (Exception e14) {
                    e = e14;
                    encryptionProvider = httpURLConnectionCreateClient;
                } catch (Throwable th9) {
                    th = th9;
                    encryptionProvider = httpURLConnectionCreateClient;
                }
                r12 = encryptionProvider;
                if (checkSilentRetry(e)) {
                    T tExecute = execute();
                    if (!this.f14408d.getF14176d() && r12 != 0) {
                        r12.disconnect();
                    }
                    return tExecute;
                }
                Log.printStackTrace(e);
                if ((e instanceof SocketTimeoutException) || (e instanceof C40636b) || (e instanceof C40599T3) || (e instanceof SSLException)) {
                    throw e;
                }
                throw (e instanceof ConnectException ? new C40599T3(900, String.valueOf(e.getMessage())) : new C40504A2(e));
            } catch (Exception e15) {
                e = e15;
            }
        } catch (Throwable th10) {
            th = th10;
        }
    }

    public abstract void fillRequest(@NotNull OutputStream outputStream) throws IOException;

    @NotNull
    public abstract String getUri();

    @VisibleForTesting(otherwise = 4)
    public abstract T parseResponse(@NotNull String plainTextAnswer);

    @VisibleForTesting(otherwise = 4)
    public abstract int prepareRequest() throws Exception;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApiCall(@NotNull InterfaceC40657f apiCallSettings, @NotNull ApiCallDataModel<?> apiCallDataModel) {
        super(apiCallSettings.getF13685b());
        Intrinsics.checkNotNullParameter(apiCallSettings, "apiCallSettings");
        Intrinsics.checkNotNullParameter(apiCallDataModel, "apiCallDataModel");
        this.f14407c = apiCallSettings;
        this.f14408d = apiCallDataModel;
        Locale locale = LocaleUtil.INSTANCE.getLocale(apiCallSettings.getF13684a());
        if (locale == null) {
            locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        }
        this.f14409e = "Network/".concat(getClass().getSimpleName());
        this.f14410f = "POST";
        this.f14411g = MapsKt.mapOf(TuplesKt.m90091to("User-Agent", apiCallSettings.getF13695l()), TuplesKt.m90091to(HttpHeaders.ACCEPT_LANGUAGE, LocaleUtilKt.getBcp47(locale)), TuplesKt.m90091to("Content-Encoding", InterpolationAnimatedNode.EXTRAPOLATE_TYPE_IDENTITY), TuplesKt.m90091to(HttpHeaders.ACCEPT_ENCODING, InterpolationAnimatedNode.EXTRAPOLATE_TYPE_IDENTITY), TuplesKt.m90091to("Accept", "application/json"));
    }

    /* JADX INFO: renamed from: a */
    public final Object m14573a(HttpURLConnection httpURLConnection, int i11, long j11, String str) throws IOException {
        LogUtils logUtils = LogUtils.INSTANCE;
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        logUtils.logServerResponse(simpleName, i11, j11, str);
        if (i11 == 200) {
            Log.m14463d(this.f14409e, "parsing response");
            Log.m14479v(this.f14409e, "Response: " + str);
            return parseResponse(str);
        }
        String responseMessage = httpURLConnection.getResponseMessage();
        try {
            responseMessage = new JSONObject(str).getString("message");
        } catch (Exception e11) {
            Log.printStackTrace(e11);
        }
        Intrinsics.checkNotNull(responseMessage);
        throw new C40599T3(i11, responseMessage);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m14574b() {
        return !((ConnectionInterface) ServiceLocator.INSTANCE.getServiceImplementation(ConnectionInterface.class, new Function0() { // from class: t9.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ApiCall.m14572a();
            }
        })).isConnected(this.f14407c.getF13684a());
    }

    @Override // java.util.concurrent.Callable
    @Nullable
    public T call() throws Exception {
        String str;
        T tExecute;
        Log.m14474i(this.f14409e, "-> call()");
        try {
            if (m14574b()) {
                Log.m14484w(this.f14409e, "Device is offline");
                throw new C40596T0();
            }
            Log.m14479v(this.f14409e, "execute()");
            try {
                tExecute = execute();
            } catch (C40636b e11) {
                Log.m14485w(this.f14409e, "### ALE key update required. Re-execute call", e11);
                tExecute = execute();
            }
            publishResult(tExecute);
            Log.m14474i(this.f14409e, "<- call(success)");
            return tExecute;
        } catch (Exception e12) {
            if (e12 instanceof SocketTimeoutException) {
                str = "<- call(failed timeout)";
            } else {
                str = e12 instanceof C40504A2 ? "<- call(failed network)" : "<- call(failed general error)";
            }
            Log.m14485w(this.f14409e, str, e12);
            if (this.f14408d.getF14177e()) {
                publishResult(null);
            } else {
                publishError(e12);
            }
            return null;
        }
    }

    public boolean checkSilentRetry(@NotNull Exception e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        return false;
    }

    @NotNull
    public final ApiCallDataModel<?> getApiCallDataModel() {
        return this.f14408d;
    }

    @NotNull
    /* JADX INFO: renamed from: getApiCallSettings, reason: from getter */
    public final InterfaceC40657f getF14407c() {
        return this.f14407c;
    }

    @NotNull
    public Map<String, String> getHeaders() {
        return this.f14411g;
    }

    @NotNull
    /* JADX INFO: renamed from: getMethod, reason: from getter */
    public String getF14410f() {
        return this.f14410f;
    }

    @NotNull
    /* JADX INFO: renamed from: getTAG, reason: from getter */
    public final String getF14409e() {
        return this.f14409e;
    }

    public void responseReceived(int status, long time) {
        Analytics.INSTANCE.add(MobileEvents.networkRequest(BackendManager.INSTANCE.requestCode$jumio_core_release(getClass()), status, time, additionalAnalyticsDetails()));
    }

    @NotNull
    public String getCallId() {
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    public static /* synthetic */ void getTAG$annotations() {
    }
}
