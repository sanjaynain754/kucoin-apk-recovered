package com.jumio.android.renderscript;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Toolkit.kt */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ!\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005H\u0086\u0002J)\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0003H\u0086\u0002J \u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u0018"}, m90084d2 = {"Lcom/jumio/android/renderscript/Rgba3dArray;", "", "values", "", "sizeX", "", "sizeY", "sizeZ", "<init>", "([BIII)V", "getValues", "()[B", "getSizeX", "()I", "getSizeY", "getSizeZ", "get", "x", "y", "z", "set", "", "value", "indexOfVector", "jumio-toolkit_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class Rgba3dArray {
    private final int sizeX;
    private final int sizeY;
    private final int sizeZ;

    @NotNull
    private final byte[] values;

    public Rgba3dArray(@NotNull byte[] values, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(values, "values");
        this.values = values;
        this.sizeX = i11;
        this.sizeY = i12;
        this.sizeZ = i13;
        if (values.length < i11 * i12 * i13 * 4) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    private final int indexOfVector(int x11, int y11, int z11) {
        int i11;
        int i12;
        if (x11 < 0 || x11 >= (i11 = this.sizeX)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (y11 < 0 || y11 >= (i12 = this.sizeY)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (z11 < 0 || z11 >= this.sizeZ) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        return ((((z11 * i12) + y11) * i11) + x11) * 4;
    }

    public final int getSizeX() {
        return this.sizeX;
    }

    public final int getSizeY() {
        return this.sizeY;
    }

    public final int getSizeZ() {
        return this.sizeZ;
    }

    @NotNull
    public final byte[] getValues() {
        return this.values;
    }

    public final void set(int x11, int y11, int z11, @NotNull byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (value.length != 4) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int iIndexOfVector = indexOfVector(x11, y11, z11);
        for (int i11 = 0; i11 < 4; i11++) {
            this.values[iIndexOfVector + i11] = value[i11];
        }
    }

    @NotNull
    public final byte[] get(int x11, int y11, int z11) {
        int iIndexOfVector = indexOfVector(x11, y11, z11);
        byte[] bArr = new byte[4];
        for (int i11 = 0; i11 < 4; i11++) {
            bArr[i11] = this.values[iIndexOfVector + i11];
        }
        return bArr;
    }
}
