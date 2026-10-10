package com.facebook.react.bridge;

import com.facebook.jni.HybridClassBase;
import org.jetbrains.annotations.NotNull;
import p633t6.InterfaceC44695a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: NativeMap.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b'\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\u0004\u001a\u00020\u0005H\u0096 ¨\u0006\u0007"}, m90084d2 = {"Lcom/facebook/react/bridge/NativeMap;", "Lcom/facebook/jni/HybridClassBase;", "<init>", "()V", "toString", "", "Companion", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@InterfaceC44695a
public abstract class NativeMap extends HybridClassBase {

    @NotNull
    private static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: NativeMap.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/facebook/react/bridge/NativeMap$Companion;", "", "<init>", "()V", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @NotNull
    public native String toString();

    static {
        ReactBridge.staticInit();
    }
}
