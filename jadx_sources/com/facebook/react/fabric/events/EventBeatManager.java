package com.facebook.react.fabric.events;

import android.annotation.SuppressLint;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.fabric.FabricSoLoader;
import com.facebook.react.uimanager.events.BatchEventDispatchedListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p633t6.InterfaceC44695a;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: EventBeatManager.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0013\b\u0017\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u000bH\u0082 J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0016\u0010\u0007\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0003¨\u0006\u000e"}, m90084d2 = {"Lcom/facebook/react/fabric/events/EventBeatManager;", "Lcom/facebook/react/uimanager/events/BatchEventDispatchedListener;", "<init>", "()V", "reactApplicationContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "mHybridData", "Lcom/facebook/jni/HybridData;", "getMHybridData$annotations", "tick", "", "onBatchEventDispatched", "Companion", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SuppressLint({"MissingNativeLoadLibrary"})
@InterfaceC44695a
public final class EventBeatManager implements BatchEventDispatchedListener {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    @InterfaceC44695a
    private final HybridData mHybridData;

    /* JADX INFO: compiled from: EventBeatManager.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\u0004\u001a\u00020\u0005H\u0083 ¨\u0006\u0006"}, m90084d2 = {"Lcom/facebook/react/fabric/events/EventBeatManager$Companion;", "", "<init>", "()V", "initHybrid", "Lcom/facebook/jni/HybridData;", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final HybridData initHybrid() {
            return EventBeatManager.initHybrid();
        }
    }

    public EventBeatManager() {
        this.mHybridData = Companion.initHybrid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @JvmStatic
    public static final native HybridData initHybrid();

    private final native void tick();

    static {
        FabricSoLoader.staticInit();
    }

    @Deprecated(message = "Deprecated on v0.72.0 Use EventBeatManager() instead")
    public EventBeatManager(@Nullable ReactApplicationContext reactApplicationContext) {
        this();
    }

    @Override // com.facebook.react.uimanager.events.BatchEventDispatchedListener
    public void onBatchEventDispatched() {
        tick();
    }

    private static /* synthetic */ void getMHybridData$annotations() {
    }
}
