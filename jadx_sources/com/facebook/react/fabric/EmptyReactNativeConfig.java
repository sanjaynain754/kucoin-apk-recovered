package com.facebook.react.fabric;

import com.facebook.jni.HybridData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: EmptyReactNativeConfig.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\u0006\u001a\u00020\u0005H\u0082 J\u0011\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096 J\u0011\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0096 J\u0011\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0096 J\u0011\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\nH\u0096 R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m90084d2 = {"Lcom/facebook/react/fabric/EmptyReactNativeConfig;", "Lcom/facebook/react/fabric/ReactNativeConfig;", "<init>", "()V", "mHybridData", "Lcom/facebook/jni/HybridData;", "initHybrid", "getBool", "", "param", "", "getInt64", "", "getString", "getDouble", "", "Companion", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class EmptyReactNativeConfig implements ReactNativeConfig {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final HybridData mHybridData = initHybrid();

    /* JADX INFO: compiled from: EmptyReactNativeConfig.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/facebook/react/fabric/EmptyReactNativeConfig$Companion;", "", "<init>", "()V", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final native HybridData initHybrid();

    @Override // com.facebook.react.fabric.ReactNativeConfig
    public native boolean getBool(@NotNull String param);

    @Override // com.facebook.react.fabric.ReactNativeConfig
    public native double getDouble(@NotNull String param);

    @Override // com.facebook.react.fabric.ReactNativeConfig
    public native long getInt64(@NotNull String param);

    @Override // com.facebook.react.fabric.ReactNativeConfig
    @NotNull
    public native String getString(@NotNull String param);

    static {
        FabricSoLoader.staticInit();
    }
}
