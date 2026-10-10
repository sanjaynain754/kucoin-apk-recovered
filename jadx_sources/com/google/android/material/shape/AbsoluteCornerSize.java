package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class AbsoluteCornerSize implements CornerSize {
    private final float size;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbsoluteCornerSize) && this.size == ((AbsoluteCornerSize) obj).size;
    }

    @Override // com.google.android.material.shape.CornerSize
    public float getCornerSize(@NonNull RectF rectF) {
        return this.size;
    }

    public float getCornerSize() {
        return this.size;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.size)});
    }

    public String toString() {
        return getCornerSize() + "px";
    }

    public AbsoluteCornerSize(float f11) {
        this.size = f11;
    }
}
