package com.facebook.react.runtime;

import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p633t6.InterfaceC44695a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: BindingsInstaller.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Lcom/facebook/react/runtime/BindingsInstaller;", "", "mHybridData", "Lcom/facebook/jni/HybridData;", "<init>", "(Lcom/facebook/jni/HybridData;)V", "Companion", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public abstract class BindingsInstaller {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Nullable
    @InterfaceC44695a
    private final HybridData mHybridData;

    /* JADX INFO: compiled from: BindingsInstaller.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/facebook/react/runtime/BindingsInstaller$Companion;", "", "<init>", "()V", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        SoLoader.loadLibrary("rninstance");
    }

    public BindingsInstaller(@Nullable HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
