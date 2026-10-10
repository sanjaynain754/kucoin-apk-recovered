package com.facebook.react.runtime;

import com.facebook.jni.HybridData;
import com.facebook.jni.annotations.DoNotStrip;
import com.facebook.jni.annotations.DoNotStripAny;
import com.facebook.soloader.SoLoader;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: JSCInstance.kt */
/* JADX INFO: loaded from: classes45.dex */
@DoNotStripAny
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m90084d2 = {"Lcom/facebook/react/runtime/JSCInstance;", "Lcom/facebook/react/runtime/JSRuntimeFactory;", "<init>", "()V", "Companion", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class JSCInstance extends JSRuntimeFactory {

    @NotNull
    private static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: JSCInstance.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\u0004\u001a\u00020\u0005H\u0083 ¨\u0006\u0006"}, m90084d2 = {"Lcom/facebook/react/runtime/JSCInstance$Companion;", "", "<init>", "()V", "initHybrid", "Lcom/facebook/jni/HybridData;", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        @DoNotStrip
        public final HybridData initHybrid() {
            return JSCInstance.initHybrid();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @JvmStatic
    @DoNotStrip
    public static final native HybridData initHybrid();

    static {
        SoLoader.loadLibrary("jscinstance");
    }

    public JSCInstance() {
        super(Companion.initHybrid());
    }
}
