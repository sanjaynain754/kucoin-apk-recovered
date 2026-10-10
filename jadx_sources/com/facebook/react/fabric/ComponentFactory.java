package com.facebook.react.fabric;

import com.facebook.jni.HybridData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: ComponentFactory.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0003¨\u0006\b"}, m90084d2 = {"Lcom/facebook/react/fabric/ComponentFactory;", "", "<init>", "()V", "mHybridData", "Lcom/facebook/jni/HybridData;", "getMHybridData$annotations", "Companion", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class ComponentFactory {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final HybridData mHybridData = Companion.initHybrid();

    /* JADX INFO: compiled from: ComponentFactory.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\u0004\u001a\u00020\u0005H\u0083 ¨\u0006\u0006"}, m90084d2 = {"Lcom/facebook/react/fabric/ComponentFactory$Companion;", "", "<init>", "()V", "initHybrid", "Lcom/facebook/jni/HybridData;", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final HybridData initHybrid() {
            return ComponentFactory.initHybrid();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @JvmStatic
    public static final native HybridData initHybrid();

    static {
        FabricSoLoader.staticInit();
    }

    private static /* synthetic */ void getMHybridData$annotations() {
    }
}
