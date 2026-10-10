package com.facebook.react.modules.websocket;

import androidx.annotation.Nullable;
import androidx.webkit.ProxyConfig;
import com.facebook.fbreact.specs.NativeWebSocketModuleSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.network.CustomClientBuilder;
import com.facebook.react.modules.network.ForwardingCookieHandler;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okio.ByteString;
import p747x3.C45999a;

/* JADX INFO: loaded from: classes45.dex */
@ReactModule(name = NativeWebSocketModuleSpec.NAME)
public final class WebSocketModule extends NativeWebSocketModuleSpec {

    @Nullable
    private static CustomClientBuilder customClientBuilder;
    private final Map<Integer, ContentHandler> mContentHandlers;
    private ForwardingCookieHandler mCookieHandler;
    private final Map<Integer, WebSocket> mWebSocketConnections;

    public interface ContentHandler {
        void onMessage(String str, WritableMap writableMap);

        void onMessage(ByteString byteString, WritableMap writableMap);
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void close(double d11, String str, double d12) {
        int i11 = (int) d12;
        WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i11));
        if (webSocket == null) {
            return;
        }
        try {
            webSocket.close((int) d11, str);
            this.mWebSocketConnections.remove(Integer.valueOf(i11));
            this.mContentHandlers.remove(Integer.valueOf(i11));
        } catch (Exception e11) {
            C45999a.m101508n(ReactConstants.TAG, "Could not close WebSocket connection for id " + i11, e11);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void connect(String str, @Nullable ReadableArray readableArray, @Nullable ReadableMap readableMap, double d11) {
        boolean z11;
        final int i11 = (int) d11;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient.Builder timeout = builder.connectTimeout(10L, timeUnit).writeTimeout(10L, timeUnit).readTimeout(0L, TimeUnit.MINUTES);
        applyCustomBuilder(timeout);
        OkHttpClient okHttpClientBuild = timeout.build();
        Request.Builder builderUrl = new Request.Builder().tag(Integer.valueOf(i11)).url(str);
        String cookie = getCookie(str);
        if (cookie != null) {
            builderUrl.addHeader(HttpHeaders.COOKIE, cookie);
        }
        if (readableMap != null && readableMap.hasKey("headers") && readableMap.getType("headers").equals(ReadableType.Map)) {
            ReadableMap map = readableMap.getMap("headers");
            ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = map.keySetIterator();
            z11 = false;
            while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                if (ReadableType.String.equals(map.getType(strNextKey))) {
                    if (strNextKey.equalsIgnoreCase("origin")) {
                        z11 = true;
                    }
                    builderUrl.addHeader(strNextKey, map.getString(strNextKey));
                } else {
                    C45999a.m101488I(ReactConstants.TAG, "Ignoring: requested " + strNextKey + ", value not a string");
                }
            }
        } else {
            z11 = false;
        }
        if (!z11) {
            builderUrl.addHeader("origin", getDefaultOrigin(str));
        }
        if (readableArray != null && readableArray.size() > 0) {
            StringBuilder sb2 = new StringBuilder("");
            for (int i12 = 0; i12 < readableArray.size(); i12++) {
                String strTrim = readableArray.getString(i12).trim();
                if (!strTrim.isEmpty() && !strTrim.contains(",")) {
                    sb2.append(strTrim);
                    sb2.append(",");
                }
            }
            if (sb2.length() > 0) {
                sb2.replace(sb2.length() - 1, sb2.length(), "");
                builderUrl.addHeader(HttpHeaders.SEC_WEBSOCKET_PROTOCOL, sb2.toString());
            }
        }
        okHttpClientBuild.newWebSocket(builderUrl.build(), new WebSocketListener() { // from class: com.facebook.react.modules.websocket.WebSocketModule.1
            @Override // okhttp3.WebSocketListener
            public void onMessage(WebSocket webSocket, String str2) {
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putInt("id", i11);
                writableMapCreateMap.putString("type", "text");
                ContentHandler contentHandler = (ContentHandler) WebSocketModule.this.mContentHandlers.get(Integer.valueOf(i11));
                if (contentHandler != null) {
                    contentHandler.onMessage(str2, writableMapCreateMap);
                } else {
                    writableMapCreateMap.putString("data", str2);
                }
                WebSocketModule.this.sendEvent("websocketMessage", writableMapCreateMap);
            }

            @Override // okhttp3.WebSocketListener
            public void onFailure(WebSocket webSocket, Throwable th2, Response response) {
                WebSocketModule.this.notifyWebSocketFailed(i11, th2.getMessage());
            }

            @Override // okhttp3.WebSocketListener
            public void onOpen(WebSocket webSocket, Response response) {
                WebSocketModule.this.mWebSocketConnections.put(Integer.valueOf(i11), webSocket);
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putInt("id", i11);
                writableMapCreateMap.putString("protocol", response.header(HttpHeaders.SEC_WEBSOCKET_PROTOCOL, ""));
                WebSocketModule.this.sendEvent("websocketOpen", writableMapCreateMap);
            }

            @Override // okhttp3.WebSocketListener
            public void onClosed(WebSocket webSocket, int i13, String str2) {
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putInt("id", i11);
                writableMapCreateMap.putInt("code", i13);
                writableMapCreateMap.putString("reason", str2);
                WebSocketModule.this.sendEvent("websocketClosed", writableMapCreateMap);
            }

            @Override // okhttp3.WebSocketListener
            public void onClosing(WebSocket webSocket, int i13, String str2) {
                webSocket.close(i13, str2);
            }

            @Override // okhttp3.WebSocketListener
            public void onMessage(WebSocket webSocket, ByteString byteString) {
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putInt("id", i11);
                writableMapCreateMap.putString("type", "binary");
                ContentHandler contentHandler = (ContentHandler) WebSocketModule.this.mContentHandlers.get(Integer.valueOf(i11));
                if (contentHandler != null) {
                    contentHandler.onMessage(byteString, writableMapCreateMap);
                } else {
                    writableMapCreateMap.putString("data", byteString.base64());
                }
                WebSocketModule.this.sendEvent("websocketMessage", writableMapCreateMap);
            }
        });
        okHttpClientBuild.dispatcher().executorService().shutdown();
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void ping(double d11) {
        int i11 = (int) d11;
        WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i11));
        if (webSocket != null) {
            try {
                webSocket.send(ByteString.EMPTY);
                return;
            } catch (Exception e11) {
                notifyWebSocketFailed(i11, e11.getMessage());
                return;
            }
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("id", i11);
        writableMapCreateMap.putString("message", "client is null");
        sendEvent("websocketFailed", writableMapCreateMap);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putInt("id", i11);
        writableMapCreateMap2.putInt("code", 0);
        writableMapCreateMap2.putString("reason", "client is null");
        sendEvent("websocketClosed", writableMapCreateMap2);
        this.mWebSocketConnections.remove(Integer.valueOf(i11));
        this.mContentHandlers.remove(Integer.valueOf(i11));
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void send(String str, double d11) {
        int i11 = (int) d11;
        WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i11));
        if (webSocket != null) {
            try {
                webSocket.send(str);
                return;
            } catch (Exception e11) {
                notifyWebSocketFailed(i11, e11.getMessage());
                return;
            }
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("id", i11);
        writableMapCreateMap.putString("message", "client is null");
        sendEvent("websocketFailed", writableMapCreateMap);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putInt("id", i11);
        writableMapCreateMap2.putInt("code", 0);
        writableMapCreateMap2.putString("reason", "client is null");
        sendEvent("websocketClosed", writableMapCreateMap2);
        this.mWebSocketConnections.remove(Integer.valueOf(i11));
        this.mContentHandlers.remove(Integer.valueOf(i11));
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void sendBinary(String str, double d11) {
        int i11 = (int) d11;
        WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i11));
        if (webSocket != null) {
            try {
                webSocket.send(ByteString.decodeBase64(str));
                return;
            } catch (Exception e11) {
                notifyWebSocketFailed(i11, e11.getMessage());
                return;
            }
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("id", i11);
        writableMapCreateMap.putString("message", "client is null");
        sendEvent("websocketFailed", writableMapCreateMap);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putInt("id", i11);
        writableMapCreateMap2.putInt("code", 0);
        writableMapCreateMap2.putString("reason", "client is null");
        sendEvent("websocketClosed", writableMapCreateMap2);
        this.mWebSocketConnections.remove(Integer.valueOf(i11));
        this.mContentHandlers.remove(Integer.valueOf(i11));
    }

    private static void applyCustomBuilder(OkHttpClient.Builder builder) {
        CustomClientBuilder customClientBuilder2 = customClientBuilder;
        if (customClientBuilder2 != null) {
            customClientBuilder2.apply(builder);
        }
    }

    private String getCookie(String str) {
        try {
            List<String> list = this.mCookieHandler.get(new URI(getDefaultOrigin(str)), new HashMap()).get(HttpHeaders.COOKIE);
            if (list != null && !list.isEmpty()) {
                return list.get(0);
            }
            return null;
        } catch (IOException | URISyntaxException unused) {
            throw new IllegalArgumentException("Unable to get cookie from " + str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0051  */
    private static String getDefaultOrigin(String str) {
        byte b11;
        try {
            String str2 = "";
            URI uri = new URI(str);
            String scheme = uri.getScheme();
            int iHashCode = scheme.hashCode();
            if (iHashCode != 3804) {
                if (iHashCode != 118039) {
                    if (iHashCode != 3213448) {
                        if (iHashCode == 99617003 && scheme.equals(ProxyConfig.MATCH_HTTPS)) {
                            b11 = 3;
                        } else {
                            b11 = -1;
                        }
                    } else if (scheme.equals("http")) {
                        b11 = 2;
                    } else {
                        b11 = -1;
                    }
                } else if (scheme.equals("wss")) {
                    b11 = 0;
                } else {
                    b11 = -1;
                }
            } else if (scheme.equals("ws")) {
                b11 = 1;
            } else {
                b11 = -1;
            }
            if (b11 == 0) {
                str2 = "" + ProxyConfig.MATCH_HTTPS;
            } else if (b11 == 1) {
                str2 = "http";
            } else if (b11 == 2 || b11 == 3) {
                str2 = "" + uri.getScheme();
            }
            return uri.getPort() != -1 ? String.format("%s://%s:%s", str2, uri.getHost(), Integer.valueOf(uri.getPort())) : String.format("%s://%s", str2, uri.getHost());
        } catch (URISyntaxException unused) {
            throw new IllegalArgumentException("Unable to set " + str + " as default origin header");
        }
    }

    public static void setCustomClientBuilder(CustomClientBuilder customClientBuilder2) {
        customClientBuilder = customClientBuilder2;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        Iterator<WebSocket> it = this.mWebSocketConnections.values().iterator();
        while (it.hasNext()) {
            it.next().close(1001, null);
        }
        this.mWebSocketConnections.clear();
        this.mContentHandlers.clear();
    }

    public void setContentHandler(int i11, ContentHandler contentHandler) {
        if (contentHandler != null) {
            this.mContentHandlers.put(Integer.valueOf(i11), contentHandler);
        } else {
            this.mContentHandlers.remove(Integer.valueOf(i11));
        }
    }

    public WebSocketModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mWebSocketConnections = new ConcurrentHashMap();
        this.mContentHandlers = new ConcurrentHashMap();
        this.mCookieHandler = new ForwardingCookieHandler(reactApplicationContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyWebSocketFailed(int i11, String str) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("id", i11);
        writableMapCreateMap.putString("message", str);
        sendEvent("websocketFailed", writableMapCreateMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendEvent(String str, WritableMap writableMap) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        if (reactApplicationContext.hasActiveReactInstance()) {
            reactApplicationContext.emitDeviceEvent(str, writableMap);
        }
    }

    public void sendBinary(ByteString byteString, int i11) {
        WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i11));
        if (webSocket == null) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putInt("id", i11);
            writableMapCreateMap.putString("message", "client is null");
            sendEvent("websocketFailed", writableMapCreateMap);
            WritableMap writableMapCreateMap2 = Arguments.createMap();
            writableMapCreateMap2.putInt("id", i11);
            writableMapCreateMap2.putInt("code", 0);
            writableMapCreateMap2.putString("reason", "client is null");
            sendEvent("websocketClosed", writableMapCreateMap2);
            this.mWebSocketConnections.remove(Integer.valueOf(i11));
            this.mContentHandlers.remove(Integer.valueOf(i11));
            return;
        }
        try {
            webSocket.send(byteString);
        } catch (Exception e11) {
            notifyWebSocketFailed(i11, e11.getMessage());
        }
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void addListener(String str) {
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void removeListeners(double d11) {
    }
}
