package com.facebook.react.bridge;

import androidx.annotation.Nullable;
import com.facebook.jni.HybridData;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes45.dex */
@InterfaceC44695a
public class ProxyJavaScriptExecutor extends JavaScriptExecutor {

    @Nullable
    private JavaJSExecutor mJavaJSExecutor;

    public static class Factory implements JavaScriptExecutorFactory {
        private final JavaJSExecutor.Factory mJavaJSExecutorFactory;

        @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
        public JavaScriptExecutor create() throws Exception {
            return new ProxyJavaScriptExecutor(this.mJavaJSExecutorFactory.create());
        }

        @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
        public void startSamplingProfiler() {
            throw new UnsupportedOperationException("Starting sampling profiler not supported on " + toString());
        }

        @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
        public void stopSamplingProfiler(String str) {
            throw new UnsupportedOperationException("Stopping sampling profiler not supported on " + toString());
        }

        public Factory(JavaJSExecutor.Factory factory) {
            this.mJavaJSExecutorFactory = factory;
        }
    }

    private static native HybridData initHybrid(JavaJSExecutor javaJSExecutor);

    @Override // com.facebook.react.bridge.JavaScriptExecutor
    public void close() {
        JavaJSExecutor javaJSExecutor = this.mJavaJSExecutor;
        if (javaJSExecutor != null) {
            javaJSExecutor.close();
            this.mJavaJSExecutor = null;
        }
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutor
    public String getName() {
        return "ProxyJavaScriptExecutor";
    }

    static {
        ReactBridge.staticInit();
    }

    public ProxyJavaScriptExecutor(JavaJSExecutor javaJSExecutor) {
        super(initHybrid(javaJSExecutor));
        this.mJavaJSExecutor = javaJSExecutor;
    }
}
