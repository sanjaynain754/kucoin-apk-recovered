package com.otaliastudios.opengl.draw;

import android.graphics.RectF;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.otaliastudios.opengl.draw.a */
/* JADX INFO: compiled from: Gl2dDrawable.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m90084d2 = {"Lcom/otaliastudios/opengl/draw/a;", "Lcom/otaliastudios/opengl/draw/b;", "<init>", "()V", "Landroid/graphics/RectF;", "Lcom/otaliastudios/opengl/geometry/RectF;", "rect", "", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Landroid/graphics/RectF;)V", "", "f", "I", "b", "()I", "coordsPerVertex", "library_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public abstract class AbstractC27327a extends AbstractC27328b {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final int coordsPerVertex = 2;

    @Override // com.otaliastudios.opengl.draw.AbstractC27328b
    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getCoordsPerVertex() {
        return this.coordsPerVertex;
    }

    /* JADX INFO: renamed from: h */
    public final void m67831h(@NotNull RectF rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        float fMax = -3.4028235E38f;
        float fMin = Float.MAX_VALUE;
        int i11 = 0;
        float fMax2 = -3.4028235E38f;
        float fMin2 = Float.MAX_VALUE;
        while (mo67829d().hasRemaining()) {
            float f11 = mo67829d().get();
            if (i11 % 2 == 0) {
                fMin2 = Math.min(fMin2, f11);
                fMax2 = Math.max(fMax2, f11);
            } else {
                fMax = Math.max(fMax, f11);
                fMin = Math.min(fMin, f11);
            }
            i11++;
        }
        mo67829d().rewind();
        rect.set(fMin2, fMax, fMax2, fMin);
    }
}
