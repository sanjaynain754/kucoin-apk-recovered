package com.facebook.react.internal.turbomodule.core;

import com.facebook.soloader.SoLoader;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: NativeModuleSoLoader.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m90084d2 = {"Lcom/facebook/react/internal/turbomodule/core/NativeModuleSoLoader;", "", "<init>", "()V", "Companion", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class NativeModuleSoLoader {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static boolean isSoLibraryLoaded;

    /* JADX INFO: compiled from: NativeModuleSoLoader.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/facebook/react/internal/turbomodule/core/NativeModuleSoLoader$Companion;", "", "<init>", "()V", "isSoLibraryLoaded", "", "maybeLoadSoLibrary", "", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final synchronized void maybeLoadSoLibrary() {
            if (!NativeModuleSoLoader.isSoLibraryLoaded) {
                SoLoader.loadLibrary("turbomodulejsijni");
                NativeModuleSoLoader.isSoLibraryLoaded = true;
            }
        }

        private Companion() {
        }
    }

    @JvmStatic
    public static final synchronized void maybeLoadSoLibrary() {
        INSTANCE.maybeLoadSoLibrary();
    }
}
