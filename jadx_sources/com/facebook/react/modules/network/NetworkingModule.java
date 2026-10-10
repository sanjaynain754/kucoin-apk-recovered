package com.facebook.react.modules.network;

import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.fbreact.specs.NativeNetworkingAndroidSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.network.OkHttpCallUtil;
import com.facebook.react.module.annotations.ReactModule;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.kubi.sdk.aspect.NetworkingModuleAspect;
import com.tencent.bugly.proguard.InterfaceC33568bf;
import dh0.C36686b;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.JavaNetCookieJar;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.ByteString;
import okio.GzipSource;
import okio.Okio;
import org.aspectj.lang.InterfaceC43175a;
import org.aspectj.runtime.internal.AbstractC43178a;
import p747x3.C45999a;

/* JADX INFO: loaded from: classes45.dex */
@ReactModule(name = "Networking")
public final class NetworkingModule extends NativeNetworkingAndroidSpec {
    private static final int CHUNK_TIMEOUT_NS = 100000000;
    private static final String CONTENT_ENCODING_HEADER_NAME = "content-encoding";
    private static final String CONTENT_TYPE_HEADER_NAME = "content-type";
    private static final int MAX_CHUNK_SIZE_BETWEEN_FLUSHES = 8192;
    private static final String REQUEST_BODY_KEY_BASE64 = "base64";
    private static final String REQUEST_BODY_KEY_FORMDATA = "formData";
    private static final String REQUEST_BODY_KEY_STRING = "string";
    private static final String REQUEST_BODY_KEY_URI = "uri";
    private static final String TAG = "Networking";
    private static final String USER_AGENT_HEADER_NAME = "user-agent";
    private static /* synthetic */ InterfaceC43175a.a ajc$tjp_0;

    @Nullable
    private static com.facebook.react.modules.network.CustomClientBuilder customClientBuilder;
    private final OkHttpClient mClient;
    private final ForwardingCookieHandler mCookieHandler;
    private final CookieJarContainer mCookieJarContainer;

    @Nullable
    private final String mDefaultUserAgent;
    private final List<RequestBodyHandler> mRequestBodyHandlers;
    private final Set<Integer> mRequestIds;
    private final List<ResponseHandler> mResponseHandlers;
    private boolean mShuttingDown;
    private final List<UriHandler> mUriHandlers;

    public class AjcClosure1 extends AbstractC43178a {
        @Override // org.aspectj.runtime.internal.AbstractC43178a
        public Object run(Object[] objArr) {
            Object[] objArr2 = this.state;
            NetworkingModule.addResponseHandler_aroundBody0((NetworkingModule) objArr2[0], (ResponseHandler) objArr2[1], (InterfaceC43175a) objArr2[2]);
            return null;
        }

        public AjcClosure1(Object[] objArr) {
            super(objArr);
        }
    }

    @Deprecated
    public interface CustomClientBuilder extends com.facebook.react.modules.network.CustomClientBuilder {
    }

    public interface RequestBodyHandler {
        boolean supports(ReadableMap readableMap);

        RequestBody toRequestBody(ReadableMap readableMap, String str);
    }

    public interface ResponseHandler {
        boolean supports(String str);

        WritableMap toResponseData(ResponseBody responseBody) throws IOException;
    }

    public interface UriHandler {
        WritableMap fetch(Uri uri) throws IOException;

        boolean supports(Uri uri, String str);
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext, @Nullable String str, OkHttpClient okHttpClient, @Nullable List<NetworkInterceptorCreator> list) {
        super(reactApplicationContext);
        this.mRequestBodyHandlers = new ArrayList();
        this.mUriHandlers = new ArrayList();
        this.mResponseHandlers = new ArrayList();
        if (list != null) {
            OkHttpClient.Builder builderNewBuilder = okHttpClient.newBuilder();
            Iterator<NetworkInterceptorCreator> it = list.iterator();
            while (it.hasNext()) {
                builderNewBuilder.addNetworkInterceptor(it.next().create());
            }
            okHttpClient = builderNewBuilder.build();
        }
        this.mClient = okHttpClient;
        this.mCookieHandler = new ForwardingCookieHandler(reactApplicationContext);
        this.mCookieJarContainer = (CookieJarContainer) okHttpClient.cookieJar();
        this.mShuttingDown = false;
        this.mDefaultUserAgent = str;
        this.mRequestIds = new HashSet();
    }

    private synchronized void addRequest(int i11) {
        this.mRequestIds.add(Integer.valueOf(i11));
    }

    private synchronized void cancelAllRequests() {
        try {
            Iterator<Integer> it = this.mRequestIds.iterator();
            while (it.hasNext()) {
                cancelRequest(it.next().intValue());
            }
            this.mRequestIds.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Nullable
    private Headers extractHeaders(@Nullable ReadableArray readableArray, @Nullable ReadableMap readableMap) {
        String str;
        if (readableArray == null) {
            return null;
        }
        Headers.Builder builder = new Headers.Builder();
        int size = readableArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            ReadableArray array = readableArray.getArray(i11);
            if (array != null && array.size() == 2) {
                String strStripHeaderName = HeaderUtil.stripHeaderName(array.getString(0));
                String string = array.getString(1);
                if (strStripHeaderName != null && string != null) {
                    builder.addUnsafeNonAscii(strStripHeaderName, string);
                }
            }
            return null;
        }
        if (builder.get(USER_AGENT_HEADER_NAME) == null && (str = this.mDefaultUserAgent) != null) {
            builder.add(USER_AGENT_HEADER_NAME, str);
        }
        if (readableMap == null || !readableMap.hasKey("string")) {
            builder.removeAll(CONTENT_ENCODING_HEADER_NAME);
        }
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void removeRequest(int i11) {
        this.mRequestIds.remove(Integer.valueOf(i11));
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void abortRequest(double d11) {
        int i11 = (int) d11;
        cancelRequest(i11);
        removeRequest(i11);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        this.mShuttingDown = true;
        cancelAllRequests();
        this.mCookieHandler.destroy();
        this.mCookieJarContainer.removeCookieJar();
        this.mRequestBodyHandlers.clear();
        this.mResponseHandlers.clear();
        this.mUriHandlers.clear();
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void sendRequest(String str, String str2, double d11, ReadableArray readableArray, ReadableMap readableMap, String str3, boolean z11, double d12, boolean z12) {
        int i11 = (int) d11;
        try {
            sendRequestInternal(str, str2, i11, readableArray, readableMap, str3, z11, (int) d12, z12);
        } catch (Throwable th2) {
            C45999a.m101508n("Networking", "Failed to send url request: " + str2, th2);
            ResponseUtil.onRequestError(getReactApplicationContextIfActiveOrWarn(), i11, th2.getMessage(), th2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:85:0x0187  */
    public void sendRequestInternal(String str, String str2, final int i11, ReadableArray readableArray, ReadableMap readableMap, final String str3, final boolean z11, int i12, boolean z12) {
        RequestBodyHandler next;
        RequestBody emptyBody;
        final ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        try {
            Uri uri = Uri.parse(str2);
            for (UriHandler uriHandler : this.mUriHandlers) {
                if (uriHandler.supports(uri, str3)) {
                    ResponseUtil.onDataReceived(reactApplicationContextIfActiveOrWarn, i11, uriHandler.fetch(uri));
                    ResponseUtil.onRequestSuccess(reactApplicationContextIfActiveOrWarn, i11);
                    return;
                }
            }
            try {
                Request.Builder builderUrl = new Request.Builder().url(str2);
                if (i11 != 0) {
                    builderUrl.tag(Integer.valueOf(i11));
                }
                OkHttpClient.Builder builderNewBuilder = this.mClient.newBuilder();
                applyCustomBuilder(builderNewBuilder);
                if (!z12) {
                    builderNewBuilder.cookieJar(CookieJar.NO_COOKIES);
                }
                if (z11) {
                    builderNewBuilder.addNetworkInterceptor(new Interceptor() { // from class: com.facebook.react.modules.network.b
                        @Override // okhttp3.Interceptor
                        public final Response intercept(Interceptor.Chain chain) {
                            return this.f9806a.lambda$sendRequestInternal$0(str3, reactApplicationContextIfActiveOrWarn, i11, chain);
                        }
                    });
                }
                if (i12 != this.mClient.callTimeoutMillis()) {
                    builderNewBuilder.callTimeout(i12, TimeUnit.MILLISECONDS);
                }
                OkHttpClient okHttpClientBuild = builderNewBuilder.build();
                Headers headersExtractHeaders = extractHeaders(readableArray, readableMap);
                if (headersExtractHeaders == null) {
                    ResponseUtil.onRequestError(reactApplicationContextIfActiveOrWarn, i11, "Unrecognized headers format", null);
                    return;
                }
                String str4 = headersExtractHeaders.get(CONTENT_TYPE_HEADER_NAME);
                String str5 = headersExtractHeaders.get(CONTENT_ENCODING_HEADER_NAME);
                builderUrl.headers(headersExtractHeaders);
                if (readableMap == null) {
                    next = null;
                    break;
                }
                Iterator<RequestBodyHandler> it = this.mRequestBodyHandlers.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!next.supports(readableMap));
                if (readableMap != null) {
                    Locale locale = Locale.ROOT;
                    if (str.toLowerCase(locale).equals("get") || str.toLowerCase(locale).equals(TtmlNode.TAG_HEAD)) {
                        emptyBody = RequestBodyUtil.getEmptyBody(str);
                    } else if (next != null) {
                        emptyBody = next.toRequestBody(readableMap, str4);
                    } else if (readableMap.hasKey("string")) {
                        if (str4 == null) {
                            ResponseUtil.onRequestError(reactApplicationContextIfActiveOrWarn, i11, "Payload is set but no content-type header specified", null);
                            return;
                        }
                        String string = readableMap.getString("string");
                        MediaType mediaType = MediaType.parse(str4);
                        if (RequestBodyUtil.isGzipEncoding(str5)) {
                            emptyBody = RequestBodyUtil.createGzip(mediaType, string);
                            if (emptyBody == null) {
                                ResponseUtil.onRequestError(reactApplicationContextIfActiveOrWarn, i11, "Failed to gzip request body", null);
                                return;
                            }
                        } else {
                            emptyBody = RequestBody.create(mediaType, string.getBytes(mediaType == null ? StandardCharsets.UTF_8 : mediaType.charset(StandardCharsets.UTF_8)));
                        }
                    } else if (readableMap.hasKey(REQUEST_BODY_KEY_BASE64)) {
                        if (str4 == null) {
                            ResponseUtil.onRequestError(reactApplicationContextIfActiveOrWarn, i11, "Payload is set but no content-type header specified", null);
                            return;
                        }
                        emptyBody = RequestBody.create(MediaType.parse(str4), ByteString.decodeBase64(readableMap.getString(REQUEST_BODY_KEY_BASE64)));
                    } else if (readableMap.hasKey(REQUEST_BODY_KEY_URI)) {
                        if (str4 == null) {
                            ResponseUtil.onRequestError(reactApplicationContextIfActiveOrWarn, i11, "Payload is set but no content-type header specified", null);
                            return;
                        }
                        String string2 = readableMap.getString(REQUEST_BODY_KEY_URI);
                        InputStream fileInputStream = RequestBodyUtil.getFileInputStream(getReactApplicationContext(), string2);
                        if (fileInputStream == null) {
                            ResponseUtil.onRequestError(reactApplicationContextIfActiveOrWarn, i11, "Could not retrieve file for uri " + string2, null);
                            return;
                        }
                        emptyBody = RequestBodyUtil.create(MediaType.parse(str4), fileInputStream);
                    } else if (readableMap.hasKey(REQUEST_BODY_KEY_FORMDATA)) {
                        if (str4 == null) {
                            str4 = ShareTarget.ENCODING_TYPE_MULTIPART;
                        }
                        MultipartBody.Builder builderConstructMultipartBody = constructMultipartBody(readableMap.getArray(REQUEST_BODY_KEY_FORMDATA), str4, i11);
                        if (builderConstructMultipartBody == null) {
                            return;
                        } else {
                            emptyBody = builderConstructMultipartBody.build();
                        }
                    } else {
                        emptyBody = RequestBodyUtil.getEmptyBody(str);
                    }
                } else {
                    emptyBody = RequestBodyUtil.getEmptyBody(str);
                }
                builderUrl.method(str, wrapRequestBodyWithProgressEmitter(emptyBody, i11));
                addRequest(i11);
                FirebasePerfOkHttpClient.enqueue(okHttpClientBuild.newCall(builderUrl.build()), new Callback() { // from class: com.facebook.react.modules.network.NetworkingModule.2
                    @Override // okhttp3.Callback
                    public void onFailure(Call call, IOException iOException) {
                        String message;
                        if (NetworkingModule.this.mShuttingDown) {
                            return;
                        }
                        NetworkingModule.this.removeRequest(i11);
                        if (iOException.getMessage() != null) {
                            message = iOException.getMessage();
                        } else {
                            message = "Error while executing request: " + iOException.getClass().getSimpleName();
                        }
                        ResponseUtil.onRequestError(reactApplicationContextIfActiveOrWarn, i11, message, iOException);
                    }

                    @Override // okhttp3.Callback
                    public void onResponse(Call call, Response response) throws IOException {
                        if (NetworkingModule.this.mShuttingDown) {
                            return;
                        }
                        NetworkingModule.this.removeRequest(i11);
                        ResponseUtil.onResponseReceived(reactApplicationContextIfActiveOrWarn, i11, response.code(), NetworkingModule.translateHeaders(response.headers()), response.request().url().getUrl());
                        try {
                            ResponseBody responseBodyBody = response.body();
                            if ("gzip".equalsIgnoreCase(response.header("Content-Encoding")) && responseBodyBody != null) {
                                GzipSource gzipSource = new GzipSource(responseBodyBody.getSource());
                                String strHeader = response.header("Content-Type");
                                responseBodyBody = ResponseBody.create(strHeader != null ? MediaType.parse(strHeader) : null, -1L, Okio.buffer(gzipSource));
                            }
                            for (ResponseHandler responseHandler : NetworkingModule.this.mResponseHandlers) {
                                if (responseHandler.supports(str3)) {
                                    ResponseUtil.onDataReceived(reactApplicationContextIfActiveOrWarn, i11, responseHandler.toResponseData(responseBodyBody));
                                    ResponseUtil.onRequestSuccess(reactApplicationContextIfActiveOrWarn, i11);
                                    return;
                                }
                            }
                            if (z11 && str3.equals("text")) {
                                NetworkingModule.this.readWithProgress(i11, responseBodyBody);
                                ResponseUtil.onRequestSuccess(reactApplicationContextIfActiveOrWarn, i11);
                                return;
                            }
                            String strString = "";
                            if (str3.equals("text")) {
                                try {
                                    strString = responseBodyBody.string();
                                } catch (IOException e11) {
                                    if (!response.request().method().equalsIgnoreCase("HEAD")) {
                                        ResponseUtil.onRequestError(reactApplicationContextIfActiveOrWarn, i11, e11.getMessage(), e11);
                                    }
                                }
                            } else if (str3.equals(NetworkingModule.REQUEST_BODY_KEY_BASE64)) {
                                strString = Base64.encodeToString(responseBodyBody.bytes(), 2);
                            }
                            ResponseUtil.onDataReceived(reactApplicationContextIfActiveOrWarn, i11, strString);
                            ResponseUtil.onRequestSuccess(reactApplicationContextIfActiveOrWarn, i11);
                        } catch (IOException e12) {
                            ResponseUtil.onRequestError(reactApplicationContextIfActiveOrWarn, i11, e12.getMessage(), e12);
                        }
                    }
                });
            } catch (Exception e11) {
                ResponseUtil.onRequestError(reactApplicationContextIfActiveOrWarn, i11, e11.getMessage(), null);
            }
        } catch (IOException e12) {
            ResponseUtil.onRequestError(reactApplicationContextIfActiveOrWarn, i11, e12.getMessage(), e12);
        }
    }

    public static final /* synthetic */ void addResponseHandler_aroundBody0(NetworkingModule networkingModule, ResponseHandler responseHandler, InterfaceC43175a interfaceC43175a) {
        networkingModule.mResponseHandlers.add(responseHandler);
    }

    private static /* synthetic */ void ajc$preClinit() {
        C36686b c36686b = new C36686b("NetworkingModule.java", NetworkingModule.class);
        ajc$tjp_0 = c36686b.m82128h("method-execution", c36686b.m82127g("1", "addResponseHandler", "com.facebook.react.modules.network.NetworkingModule", "com.facebook.react.modules.network.NetworkingModule$ResponseHandler", "handler", "", "void"), InterfaceC33568bf.f69245q);
    }

    private static void applyCustomBuilder(OkHttpClient.Builder builder) {
        com.facebook.react.modules.network.CustomClientBuilder customClientBuilder2 = customClientBuilder;
        if (customClientBuilder2 != null) {
            customClientBuilder2.apply(builder);
        }
    }

    private void cancelRequest(final int i11) {
        new GuardedAsyncTask<Void, Void>(getReactApplicationContext()) { // from class: com.facebook.react.modules.network.NetworkingModule.4
            @Override // com.facebook.react.bridge.GuardedAsyncTask
            public void doInBackgroundGuarded(Void... voidArr) {
                OkHttpCallUtil.cancelTag(NetworkingModule.this.mClient, Integer.valueOf(i11));
            }
        }.execute(new Void[0]);
    }

    @Nullable
    private MultipartBody.Builder constructMultipartBody(ReadableArray readableArray, String str, int i11) {
        MediaType mediaType;
        MultipartBody.Builder builder = new MultipartBody.Builder();
        builder.setType(MediaType.parse(str));
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        int size = readableArray.size();
        for (int i12 = 0; i12 < size; i12++) {
            ReadableMap map = readableArray.getMap(i12);
            Headers headersExtractHeaders = extractHeaders(map.getArray("headers"), null);
            if (headersExtractHeaders == null) {
                ResponseUtil.onRequestError(reactApplicationContextIfActiveOrWarn, i11, "Missing or invalid header format for FormData part.", null);
                return null;
            }
            String str2 = headersExtractHeaders.get(CONTENT_TYPE_HEADER_NAME);
            if (str2 != null) {
                mediaType = MediaType.parse(str2);
                headersExtractHeaders = headersExtractHeaders.newBuilder().removeAll(CONTENT_TYPE_HEADER_NAME).build();
            } else {
                mediaType = null;
            }
            if (map.hasKey("string")) {
                builder.addPart(headersExtractHeaders, RequestBody.create(mediaType, map.getString("string")));
            } else if (!map.hasKey(REQUEST_BODY_KEY_URI)) {
                ResponseUtil.onRequestError(reactApplicationContextIfActiveOrWarn, i11, "Unrecognized FormData part.", null);
            } else {
                if (mediaType == null) {
                    ResponseUtil.onRequestError(reactApplicationContextIfActiveOrWarn, i11, "Binary FormData part needs a content-type header.", null);
                    return null;
                }
                String string = map.getString(REQUEST_BODY_KEY_URI);
                InputStream fileInputStream = RequestBodyUtil.getFileInputStream(getReactApplicationContext(), string);
                if (fileInputStream == null) {
                    ResponseUtil.onRequestError(reactApplicationContextIfActiveOrWarn, i11, "Could not retrieve file for uri " + string, null);
                    return null;
                }
                builder.addPart(headersExtractHeaders, RequestBodyUtil.create(mediaType, fileInputStream));
            }
        }
        return builder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void readWithProgress(int i11, ResponseBody responseBody) throws IOException {
        long j11;
        long j12;
        long j13;
        ProgressiveStringDecoder progressiveStringDecoder;
        InputStream inputStreamByteStream;
        byte[] bArr;
        ReactApplicationContext reactApplicationContextIfActiveOrWarn;
        long contentLength = -1;
        try {
            try {
                ProgressResponseBody progressResponseBody = (ProgressResponseBody) responseBody;
                j11 = progressResponseBody.totalBytesRead();
                try {
                    contentLength = progressResponseBody.getContentLength();
                    while (true) {
                        int i12 = inputStreamByteStream.read(bArr);
                        if (i12 == -1) {
                            inputStreamByteStream.close();
                            return;
                        } else {
                            int i13 = i11;
                            ResponseUtil.onIncrementalDataReceived(reactApplicationContextIfActiveOrWarn, i13, progressiveStringDecoder.decodeNext(bArr, i12), j13, j12);
                            i11 = i13;
                        }
                    }
                } catch (ClassCastException unused) {
                }
            } catch (ClassCastException unused2) {
                j11 = -1;
            }
            bArr = new byte[8192];
            reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        } catch (Throwable th2) {
            inputStreamByteStream.close();
            throw th2;
        }
        j12 = contentLength;
        j13 = j11;
        progressiveStringDecoder = new ProgressiveStringDecoder(responseBody.get$contentType() == null ? StandardCharsets.UTF_8 : responseBody.get$contentType().charset(StandardCharsets.UTF_8));
        inputStreamByteStream = responseBody.byteStream();
    }

    public static void setCustomClientBuilder(com.facebook.react.modules.network.CustomClientBuilder customClientBuilder2) {
        customClientBuilder = customClientBuilder2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static WritableMap translateHeaders(Headers headers) {
        Bundle bundle = new Bundle();
        for (int i11 = 0; i11 < headers.size(); i11++) {
            String strName = headers.name(i11);
            if (bundle.containsKey(strName)) {
                bundle.putString(strName, bundle.getString(strName) + ", " + headers.value(i11));
            } else {
                bundle.putString(strName, headers.value(i11));
            }
        }
        return Arguments.fromBundle(bundle);
    }

    private RequestBody wrapRequestBodyWithProgressEmitter(RequestBody requestBody, final int i11) {
        if (requestBody == null) {
            return null;
        }
        final ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        return RequestBodyUtil.createProgressRequest(requestBody, new ProgressListener() { // from class: com.facebook.react.modules.network.NetworkingModule.3
            long last = System.nanoTime();

            @Override // com.facebook.react.modules.network.ProgressListener
            public void onProgress(long j11, long j12, boolean z11) {
                long jNanoTime = System.nanoTime();
                if (!z11 && !NetworkingModule.shouldDispatch(jNanoTime, this.last)) {
                    return;
                }
                ResponseUtil.onDataSend(reactApplicationContextIfActiveOrWarn, i11, j11, j12);
                this.last = jNanoTime;
            }
        });
    }

    public void addRequestBodyHandler(RequestBodyHandler requestBodyHandler) {
        this.mRequestBodyHandlers.add(requestBodyHandler);
    }

    public void addResponseHandler(ResponseHandler responseHandler) throws Throwable {
        NetworkingModuleAspect.m56523c().m56524a(new AjcClosure1(new Object[]{this, responseHandler, C36686b.m82123c(ajc$tjp_0, this, this, responseHandler)}).linkClosureAndJoinPoint(69648));
    }

    public void addUriHandler(UriHandler uriHandler) {
        this.mUriHandlers.add(uriHandler);
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    @ReactMethod
    public void clearCookies(com.facebook.react.bridge.Callback callback) {
        this.mCookieHandler.clearCookies(callback);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        this.mCookieJarContainer.setCookieJar(new JavaNetCookieJar(this.mCookieHandler));
    }

    public void removeRequestBodyHandler(RequestBodyHandler requestBodyHandler) {
        this.mRequestBodyHandlers.remove(requestBodyHandler);
    }

    public void removeResponseHandler(ResponseHandler responseHandler) {
        this.mResponseHandlers.remove(responseHandler);
    }

    public void removeUriHandler(UriHandler uriHandler) {
        this.mUriHandlers.remove(uriHandler);
    }

    static {
        ajc$preClinit();
        customClientBuilder = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Response lambda$sendRequestInternal$0(final String str, final ReactApplicationContext reactApplicationContext, final int i11, Interceptor.Chain chain) throws IOException {
        Response responseProceed = chain.proceed(chain.request());
        return responseProceed.newBuilder().body(new ProgressResponseBody(responseProceed.body(), new ProgressListener() { // from class: com.facebook.react.modules.network.NetworkingModule.1
            long last = System.nanoTime();

            @Override // com.facebook.react.modules.network.ProgressListener
            public void onProgress(long j11, long j12, boolean z11) {
                long jNanoTime = System.nanoTime();
                if ((!z11 && !NetworkingModule.shouldDispatch(jNanoTime, this.last)) || str.equals("text")) {
                    return;
                }
                ResponseUtil.onDataReceivedProgress(reactApplicationContext, i11, j11, j12);
                this.last = jNanoTime;
            }
        })).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean shouldDispatch(long j11, long j12) {
        if (j12 + 100000000 < j11) {
            return true;
        }
        return false;
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext, @Nullable String str, OkHttpClient okHttpClient) {
        this(reactApplicationContext, str, okHttpClient, null);
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, null, OkHttpClientProvider.createClient(reactApplicationContext), null);
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext, List<NetworkInterceptorCreator> list) {
        this(reactApplicationContext, null, OkHttpClientProvider.createClient(reactApplicationContext), list);
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext, String str) {
        this(reactApplicationContext, str, OkHttpClientProvider.createClient(reactApplicationContext), null);
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void addListener(String str) {
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void removeListeners(double d11) {
    }
}
