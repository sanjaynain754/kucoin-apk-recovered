package com.airbnb.lottie.network;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes34.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public enum FileExtension {
    JSON(".json"),
    ZIP(".zip"),
    GZIP(".gz");

    public final String extension;

    public String tempExtension() {
        return ".temp" + this.extension;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.extension;
    }

    FileExtension(String str) {
        this.extension = str;
    }
}
