package com.facebook.react.jscexecutor;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.soloader.SoLoader;
import org.jetbrains.annotations.NotNull;
import p633t6.InterfaceC44695a;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: JSCExecutor.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, m90084d2 = {"Lcom/facebook/react/jscexecutor/JSCExecutor;", "Lcom/facebook/react/bridge/JavaScriptExecutor;", "jscConfig", "Lcom/facebook/react/bridge/ReadableNativeMap;", "<init>", "(Lcom/facebook/react/bridge/ReadableNativeMap;)V", "getName", "", "Companion", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@InterfaceC44695a
public final class JSCExecutor extends JavaScriptExecutor {

    @NotNull
    private static final Companion Companion;

    /* JADX INFO: compiled from: JSCExecutor.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0011\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0083 ¨\u0006\n"}, m90084d2 = {"Lcom/facebook/react/jscexecutor/JSCExecutor$Companion;", "", "<init>", "()V", "loadLibrary", "", "initHybrid", "Lcom/facebook/jni/HybridData;", "jscConfig", "Lcom/facebook/react/bridge/ReadableNativeMap;", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final void loadLibrary() throws UnsatisfiedLinkError {
            SoLoader.loadLibrary("jscexecutor");
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final HybridData initHybrid(ReadableNativeMap jscConfig) {
            return JSCExecutor.initHybrid(jscConfig);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @JvmStatic
    public static final native HybridData initHybrid(ReadableNativeMap readableNativeMap);

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        companion.loadLibrary();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JSCExecutor(@NotNull ReadableNativeMap jscConfig) {
        super(Companion.initHybrid(jscConfig));
        Intrinsics.checkNotNullParameter(jscConfig, "jscConfig");
    }

    @JvmStatic
    public static final void loadLibrary() throws UnsatisfiedLinkError {
        Companion.loadLibrary();
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutor
    @NotNull
    public String getName() {
        return "JSCExecutor";
    }
}
