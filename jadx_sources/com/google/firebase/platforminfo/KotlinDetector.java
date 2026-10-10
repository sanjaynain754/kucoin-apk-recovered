package com.google.firebase.platforminfo;

import androidx.annotation.Nullable;
import p852kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes.dex */
public final class KotlinDetector {
    @Nullable
    public static String detectVersion() {
        try {
            return KotlinVersion.CURRENT.toString();
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }

    private KotlinDetector() {
    }
}
