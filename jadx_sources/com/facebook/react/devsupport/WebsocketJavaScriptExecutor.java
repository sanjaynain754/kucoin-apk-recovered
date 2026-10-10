package com.facebook.react.devsupport;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.JavaJSExecutor;
import java.util.HashMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;
import p302h6.C38115a;

/* JADX INFO: loaded from: classes45.dex */
public class WebsocketJavaScriptExecutor implements JavaJSExecutor {
    private static final int CONNECT_RETRY_COUNT = 3;
    private static final long CONNECT_TIMEOUT_MS = 5000;
    private final HashMap<String, String> mInjectedObjects = new HashMap<>();

    @Nullable
    private JSDebuggerWebSocketClient mWebSocketClient;

    public static class JSExecutorCallbackFuture implements JSDebuggerWebSocketClient.JSDebuggerCallback {

        @Nullable
        private Throwable mCause;

        @Nullable
        private String mResponse;
        private final Semaphore mSemaphore;

        private JSExecutorCallbackFuture() {
            this.mSemaphore = new Semaphore(0);
        }

        @Nullable
        public String get() throws Throwable {
            this.mSemaphore.acquire();
            Throwable th2 = this.mCause;
            if (th2 == null) {
                return this.mResponse;
            }
            throw th2;
        }

        @Override // com.facebook.react.devsupport.JSDebuggerWebSocketClient.JSDebuggerCallback
        public void onFailure(Throwable th2) {
            this.mCause = th2;
            this.mSemaphore.release();
        }

        @Override // com.facebook.react.devsupport.JSDebuggerWebSocketClient.JSDebuggerCallback
        public void onSuccess(@Nullable String str) {
            this.mResponse = str;
            this.mSemaphore.release();
        }
    }

    public interface JSExecutorConnectCallback {
        void onFailure(Throwable th2);

        void onSuccess();
    }

    public static class WebsocketExecutorTimeoutException extends Exception {
        public WebsocketExecutorTimeoutException(String str) {
            super(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void connectInternal(String str, final JSExecutorConnectCallback jSExecutorConnectCallback) {
        final JSDebuggerWebSocketClient jSDebuggerWebSocketClient = new JSDebuggerWebSocketClient();
        final Handler handler = new Handler(Looper.getMainLooper());
        jSDebuggerWebSocketClient.connect(str, new JSDebuggerWebSocketClient.JSDebuggerCallback() { // from class: com.facebook.react.devsupport.WebsocketJavaScriptExecutor.2
            private boolean didSendResult = false;

            @Override // com.facebook.react.devsupport.JSDebuggerWebSocketClient.JSDebuggerCallback
            public void onFailure(Throwable th2) {
                handler.removeCallbacksAndMessages(null);
                if (this.didSendResult) {
                    return;
                }
                jSExecutorConnectCallback.onFailure(th2);
                this.didSendResult = true;
            }

            @Override // com.facebook.react.devsupport.JSDebuggerWebSocketClient.JSDebuggerCallback
            public void onSuccess(@Nullable String str2) {
                jSDebuggerWebSocketClient.prepareJSRuntime(new JSDebuggerWebSocketClient.JSDebuggerCallback() { // from class: com.facebook.react.devsupport.WebsocketJavaScriptExecutor.2.1
                    @Override // com.facebook.react.devsupport.JSDebuggerWebSocketClient.JSDebuggerCallback
                    public void onFailure(Throwable th2) {
                        handler.removeCallbacksAndMessages(null);
                        if (C59022.this.didSendResult) {
                            return;
                        }
                        jSExecutorConnectCallback.onFailure(th2);
                        C59022.this.didSendResult = true;
                    }

                    @Override // com.facebook.react.devsupport.JSDebuggerWebSocketClient.JSDebuggerCallback
                    public void onSuccess(@Nullable String str3) {
                        handler.removeCallbacksAndMessages(null);
                        C59022 c59022 = C59022.this;
                        WebsocketJavaScriptExecutor.this.mWebSocketClient = jSDebuggerWebSocketClient;
                        if (C59022.this.didSendResult) {
                            return;
                        }
                        jSExecutorConnectCallback.onSuccess();
                        C59022.this.didSendResult = true;
                    }
                });
            }
        });
        handler.postDelayed(new Runnable() { // from class: com.facebook.react.devsupport.WebsocketJavaScriptExecutor.3
            @Override // java.lang.Runnable
            public void run() {
                jSDebuggerWebSocketClient.closeQuietly();
                jSExecutorConnectCallback.onFailure(new WebsocketExecutorTimeoutException("Timeout while connecting to remote debugger"));
            }
        }, 5000L);
    }

    @Override // com.facebook.react.bridge.JavaJSExecutor
    public void close() {
        JSDebuggerWebSocketClient jSDebuggerWebSocketClient = this.mWebSocketClient;
        if (jSDebuggerWebSocketClient != null) {
            jSDebuggerWebSocketClient.closeQuietly();
        }
    }

    public void connect(final String str, final JSExecutorConnectCallback jSExecutorConnectCallback) {
        final AtomicInteger atomicInteger = new AtomicInteger(3);
        connectInternal(str, new JSExecutorConnectCallback() { // from class: com.facebook.react.devsupport.WebsocketJavaScriptExecutor.1
            @Override // com.facebook.react.devsupport.WebsocketJavaScriptExecutor.JSExecutorConnectCallback
            public void onFailure(Throwable th2) {
                if (atomicInteger.decrementAndGet() <= 0) {
                    jSExecutorConnectCallback.onFailure(th2);
                } else {
                    WebsocketJavaScriptExecutor.this.connectInternal(str, this);
                }
            }

            @Override // com.facebook.react.devsupport.WebsocketJavaScriptExecutor.JSExecutorConnectCallback
            public void onSuccess() {
                jSExecutorConnectCallback.onSuccess();
            }
        });
    }

    @Override // com.facebook.react.bridge.JavaJSExecutor
    @Nullable
    public String executeJSCall(String str, String str2) throws JavaJSExecutor.ProxyExecutorException {
        JSExecutorCallbackFuture jSExecutorCallbackFuture = new JSExecutorCallbackFuture();
        ((JSDebuggerWebSocketClient) C38115a.m86047c(this.mWebSocketClient)).executeJSCall(str, str2, jSExecutorCallbackFuture);
        try {
            return jSExecutorCallbackFuture.get();
        } catch (Throwable th2) {
            throw new JavaJSExecutor.ProxyExecutorException(th2);
        }
    }

    @Override // com.facebook.react.bridge.JavaJSExecutor
    public void loadBundle(String str) throws JavaJSExecutor.ProxyExecutorException {
        JSExecutorCallbackFuture jSExecutorCallbackFuture = new JSExecutorCallbackFuture();
        ((JSDebuggerWebSocketClient) C38115a.m86047c(this.mWebSocketClient)).loadBundle(str, this.mInjectedObjects, jSExecutorCallbackFuture);
        try {
            jSExecutorCallbackFuture.get();
        } catch (Throwable th2) {
            throw new JavaJSExecutor.ProxyExecutorException(th2);
        }
    }

    @Override // com.facebook.react.bridge.JavaJSExecutor
    public void setGlobalVariable(String str, String str2) {
        this.mInjectedObjects.put(str, str2);
    }
}
