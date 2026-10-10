package com.otaliastudios.opengl.geometry;

import android.graphics.PointF;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: IndexedPointF.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lcom/otaliastudios/opengl/geometry/IndexedPointF;", "Landroid/graphics/PointF;", "Lcom/otaliastudios/opengl/geometry/PointF;", "index", "", "x", "", "y", "(IFF)V", "getIndex", "()I", "library_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class IndexedPointF extends PointF {
    private final int index;

    public final int getIndex() {
        return this.index;
    }

    public IndexedPointF(int i11, float f11, float f12) {
        super(f11, f12);
        this.index = i11;
    }
}
