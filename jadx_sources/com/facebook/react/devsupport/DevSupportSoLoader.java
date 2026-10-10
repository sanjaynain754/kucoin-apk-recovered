package com.facebook.react.devsupport;

import com.facebook.soloader.SoLoader;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;

/* JADX INFO: compiled from: DevSupportSoLoader.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/facebook/react/devsupport/DevSupportSoLoader;", "", "<init>", "()V", "didInit", "", "staticInit", "", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class DevSupportSoLoader {

    @NotNull
    public static final DevSupportSoLoader INSTANCE = new DevSupportSoLoader();
    private static volatile boolean didInit;

    @JvmStatic
    public static final synchronized void staticInit() {
        if (didInit) {
            return;
        }
        SoLoader.loadLibrary("react_devsupportjni");
        didInit = true;
    }

    private DevSupportSoLoader() {
    }
}
