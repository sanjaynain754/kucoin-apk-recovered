package com.facebook.hermes.reactexecutor;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.soloader.SoLoader;
import p393k5.C40910b;

/* JADX INFO: loaded from: classes34.dex */
public class HermesExecutor extends JavaScriptExecutor {

    /* JADX INFO: renamed from: a */
    public static String f8797a;

    private static native HybridData initHybrid(boolean z11, String str, long j11);

    private static native HybridData initHybridDefaultConfig(boolean z11, String str);

    public static void loadLibrary() throws UnsatisfiedLinkError {
        if (f8797a == null) {
            SoLoader.loadLibrary("hermes");
            SoLoader.loadLibrary("hermes_executor");
            f8797a = ReactBuildConfig.DEBUG ? "Debug" : "Release";
        }
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutor
    public String getName() {
        return "HermesExecutor" + f8797a;
    }

    static {
        loadLibrary();
    }

    public HermesExecutor(C40910b c40910b, boolean z11, String str) {
        super(initHybridDefaultConfig(z11, str));
    }
}
