package com.facebook.react.runtime.hermes;

import com.facebook.jni.HybridData;
import com.facebook.jni.annotations.DoNotStrip;
import com.facebook.react.fabric.ReactNativeConfig;
import com.facebook.react.runtime.JSRuntimeFactory;
import com.facebook.soloader.SoLoader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: HermesInstance.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\b¨\u0006\n"}, m90084d2 = {"Lcom/facebook/react/runtime/hermes/HermesInstance;", "Lcom/facebook/react/runtime/JSRuntimeFactory;", "reactNativeConfig", "Lcom/facebook/react/fabric/ReactNativeConfig;", "allocInOldGenBeforeTTI", "", "<init>", "(Lcom/facebook/react/fabric/ReactNativeConfig;Z)V", "()V", "Companion", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class HermesInstance extends JSRuntimeFactory {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: HermesInstance.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\bH\u0085 ¨\u0006\t"}, m90084d2 = {"Lcom/facebook/react/runtime/hermes/HermesInstance$Companion;", "", "<init>", "()V", "initHybrid", "Lcom/facebook/jni/HybridData;", "reactNativeConfig", "allocInOldGenBeforeTTI", "", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @DoNotStrip
        @NotNull
        public final HybridData initHybrid(@Nullable Object reactNativeConfig, boolean allocInOldGenBeforeTTI) {
            return HermesInstance.initHybrid(reactNativeConfig, allocInOldGenBeforeTTI);
        }
    }

    public HermesInstance(@Nullable ReactNativeConfig reactNativeConfig, boolean z11) {
        super(initHybrid(reactNativeConfig, z11));
    }

    @JvmStatic
    @DoNotStrip
    @NotNull
    public static final native HybridData initHybrid(@Nullable Object obj, boolean z11);

    static {
        SoLoader.loadLibrary("hermesinstancejni");
    }

    public HermesInstance() {
        this(null, false);
    }
}
