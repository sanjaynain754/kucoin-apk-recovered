package com.jumio.android.renderscript;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Toolkit.kt */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\t¨\u0006\u0013"}, m90084d2 = {"Lcom/jumio/android/renderscript/LookupTable;", "", "<init>", "()V", "red", "", "getRed", "()[B", "setRed", "([B)V", "green", "getGreen", "setGreen", "blue", "getBlue", "setBlue", "alpha", "getAlpha", "setAlpha", "jumio-toolkit_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class LookupTable {

    @NotNull
    private byte[] alpha;

    @NotNull
    private byte[] blue;

    @NotNull
    private byte[] green;

    @NotNull
    private byte[] red;

    @NotNull
    public final byte[] getAlpha() {
        return this.alpha;
    }

    @NotNull
    public final byte[] getBlue() {
        return this.blue;
    }

    @NotNull
    public final byte[] getGreen() {
        return this.green;
    }

    @NotNull
    public final byte[] getRed() {
        return this.red;
    }

    public final void setAlpha(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<set-?>");
        this.alpha = bArr;
    }

    public final void setBlue(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<set-?>");
        this.blue = bArr;
    }

    public final void setGreen(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<set-?>");
        this.green = bArr;
    }

    public final void setRed(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<set-?>");
        this.red = bArr;
    }

    public LookupTable() {
        byte[] bArr = new byte[256];
        for (int i11 = 0; i11 < 256; i11++) {
            bArr[i11] = (byte) i11;
        }
        this.red = bArr;
        byte[] bArr2 = new byte[256];
        for (int i12 = 0; i12 < 256; i12++) {
            bArr2[i12] = (byte) i12;
        }
        this.green = bArr2;
        byte[] bArr3 = new byte[256];
        for (int i13 = 0; i13 < 256; i13++) {
            bArr3[i13] = (byte) i13;
        }
        this.blue = bArr3;
        byte[] bArr4 = new byte[256];
        for (int i14 = 0; i14 < 256; i14++) {
            bArr4[i14] = (byte) i14;
        }
        this.alpha = bArr4;
    }
}
