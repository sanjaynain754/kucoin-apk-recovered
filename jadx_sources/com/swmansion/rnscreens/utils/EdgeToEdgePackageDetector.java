package com.swmansion.rnscreens.utils;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: EdgeToEdgePackageDetector.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/swmansion/rnscreens/utils/EdgeToEdgePackageDetector;", "", "<init>", "()V", "ENABLED", "", "getENABLED", "()Z", "react-native-screens_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class EdgeToEdgePackageDetector {
    private static final boolean ENABLED;

    @NotNull
    public static final EdgeToEdgePackageDetector INSTANCE = new EdgeToEdgePackageDetector();

    static {
        boolean z11;
        try {
            Class.forName("com.zoontek.rnedgetoedge.EdgeToEdgePackage");
            z11 = true;
        } catch (ClassNotFoundException unused) {
            z11 = false;
        }
        ENABLED = z11;
    }

    public final boolean getENABLED() {
        return ENABLED;
    }

    private EdgeToEdgePackageDetector() {
    }
}
