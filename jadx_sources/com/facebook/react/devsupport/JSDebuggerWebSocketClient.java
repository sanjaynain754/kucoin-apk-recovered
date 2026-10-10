package com.facebook.react.devsupport;

import android.util.JsonReader;
import android.util.JsonToken;
import android.util.JsonWriter;
import androidx.annotation.Nullable;
import com.facebook.react.common.JavascriptException;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import p302h6.C38115a;
import p747x3.C45999a;

/* JADX INFO: loaded from: classes45.dex */
public class JSDebuggerWebSocketClient extends WebSocketListener {
    private static final String TAG = "JSDebuggerWebSocketClient";

    @Nullable
    private JSDebuggerCallback mConnectCallback;

    @Nullable
    private OkHttpClient mHttpClient;

    @Nullable
    private WebSocket mWebSocket;
    private final AtomicInteger mRequestID = new AtomicInteger();
    private final ConcurrentHashMap<Integer, JSDebuggerCallback> mCallbacks = new ConcurrentHashMap<>();

    public interface JSDebuggerCallback {
        void onFailure(Throwable th2);

        void onSuccess(@Nullable String str);
    }

    @Override // okhttp3.WebSocketListener
    public void onClosed(WebSocket webSocket, int i11, String str) {
        this.mWebSocket = null;
    }

    @Override // okhttp3.WebSocketListener
    public void onMessage(@Nullable WebSocket webSocket, String str) {
        Integer numValueOf = null;
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            jsonReader.beginObject();
            String strNextString = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (JsonToken.NULL == jsonReader.peek()) {
                    jsonReader.skipValue();
                } else if ("replyID".equals(strNextName)) {
                    numValueOf = Integer.valueOf(jsonReader.nextInt());
                } else if (DbParams.KEY_CHANNEL_RESULT.equals(strNextName)) {
                    strNextString = jsonReader.nextString();
                } else if (Constants.IPC_BUNDLE_KEY_SEND_ERROR.equals(strNextName)) {
                    String strNextString2 = jsonReader.nextString();
                    abort(strNextString2, new JavascriptException(strNextString2));
                }
            }
            if (numValueOf != null) {
                triggerRequestSuccess(numValueOf.intValue(), strNextString);
            }
        } catch (IOException e11) {
            if (numValueOf != null) {
                triggerRequestFailure(numValueOf.intValue(), e11);
            } else {
                abort("Parsing response message from websocket failed", e11);
            }
        }
    }

    @VisibleForTesting
    public void abort(String str, Throwable th2) {
        C45999a.m101508n(TAG, "Error occurred, shutting down websocket connection: " + str, th2);
        closeQuietly();
        JSDebuggerCallback jSDebuggerCallback = this.mConnectCallback;
        if (jSDebuggerCallback != null) {
            jSDebuggerCallback.onFailure(th2);
            this.mConnectCallback = null;
        }
        Iterator<JSDebuggerCallback> it = this.mCallbacks.values().iterator();
        while (it.hasNext()) {
            it.next().onFailure(th2);
        }
        this.mCallbacks.clear();
    }

    public void closeQuietly() {
        WebSocket webSocket = this.mWebSocket;
        if (webSocket != null) {
            try {
                webSocket.close(1000, "End of session");
            } catch (Exception unused) {
            }
            this.mWebSocket = null;
        }
    }

    public void connect(String str, JSDebuggerCallback jSDebuggerCallback) {
        if (this.mHttpClient != null) {
            throw new IllegalStateException("JSDebuggerWebSocketClient is already initialized.");
        }
        this.mConnectCallback = jSDebuggerCallback;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.mHttpClient = builder.connectTimeout(10L, timeUnit).writeTimeout(10L, timeUnit).readTimeout(0L, TimeUnit.MINUTES).build();
        this.mHttpClient.newWebSocket(new Request.Builder().url(str).build(), this);
    }

    public void executeJSCall(String str, String str2, JSDebuggerCallback jSDebuggerCallback) {
        int andIncrement = this.mRequestID.getAndIncrement();
        this.mCallbacks.put(Integer.valueOf(andIncrement), jSDebuggerCallback);
        try {
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            jsonWriter.beginObject().name("id").value(andIncrement).name(FirebaseAnalytics.Param.METHOD).value(str);
            stringWriter.append((CharSequence) ",\"arguments\":").append((CharSequence) str2);
            jsonWriter.endObject().close();
            sendMessage(andIncrement, stringWriter.toString());
        } catch (IOException e11) {
            triggerRequestFailure(andIncrement, e11);
        }
    }

    public void loadBundle(String str, HashMap<String, String> map, JSDebuggerCallback jSDebuggerCallback) {
        int andIncrement = this.mRequestID.getAndIncrement();
        this.mCallbacks.put(Integer.valueOf(andIncrement), jSDebuggerCallback);
        try {
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriterBeginObject = new JsonWriter(stringWriter).beginObject().name("id").value(andIncrement).name(FirebaseAnalytics.Param.METHOD).value("executeApplicationScript").name("url").value(str).name("inject").beginObject();
            for (String str2 : map.keySet()) {
                jsonWriterBeginObject.name(str2).value(map.get(str2));
            }
            jsonWriterBeginObject.endObject().endObject().close();
            sendMessage(andIncrement, stringWriter.toString());
        } catch (IOException e11) {
            triggerRequestFailure(andIncrement, e11);
        }
    }

    @Override // okhttp3.WebSocketListener
    public void onFailure(WebSocket webSocket, Throwable th2, Response response) {
        abort("Websocket exception", th2);
    }

    @Override // okhttp3.WebSocketListener
    public void onOpen(WebSocket webSocket, Response response) {
        this.mWebSocket = webSocket;
        ((JSDebuggerCallback) C38115a.m86047c(this.mConnectCallback)).onSuccess(null);
        this.mConnectCallback = null;
    }

    public void prepareJSRuntime(JSDebuggerCallback jSDebuggerCallback) {
        int andIncrement = this.mRequestID.getAndIncrement();
        this.mCallbacks.put(Integer.valueOf(andIncrement), jSDebuggerCallback);
        try {
            StringWriter stringWriter = new StringWriter();
            new JsonWriter(stringWriter).beginObject().name("id").value(andIncrement).name(FirebaseAnalytics.Param.METHOD).value("prepareJSRuntime").endObject().close();
            sendMessage(andIncrement, stringWriter.toString());
        } catch (IOException e11) {
            triggerRequestFailure(andIncrement, e11);
        }
    }

    @VisibleForTesting
    public void sendMessage(int i11, String str) {
        WebSocket webSocket = this.mWebSocket;
        if (webSocket == null) {
            triggerRequestFailure(i11, new IllegalStateException("WebSocket connection no longer valid"));
            return;
        }
        try {
            webSocket.send(str);
        } catch (Exception e11) {
            triggerRequestFailure(i11, e11);
        }
    }

    @VisibleForTesting
    public void triggerRequestFailure(int i11, Throwable th2) {
        JSDebuggerCallback jSDebuggerCallback = this.mCallbacks.get(Integer.valueOf(i11));
        if (jSDebuggerCallback != null) {
            this.mCallbacks.remove(Integer.valueOf(i11));
            jSDebuggerCallback.onFailure(th2);
        }
    }

    @VisibleForTesting
    public void triggerRequestSuccess(int i11, @Nullable String str) {
        JSDebuggerCallback jSDebuggerCallback = this.mCallbacks.get(Integer.valueOf(i11));
        if (jSDebuggerCallback != null) {
            this.mCallbacks.remove(Integer.valueOf(i11));
            jSDebuggerCallback.onSuccess(str);
        }
    }
}
