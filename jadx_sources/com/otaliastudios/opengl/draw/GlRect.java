package com.otaliastudios.opengl.draw;

import android.opengl.GLES20;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.nio.FloatBuffer;
import l90.C42139a;
import n90.C42786f;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p90.C43418a;

/* JADX INFO: compiled from: GlRect.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003R&\u0010\u000e\u001a\u00060\u0006j\u0002`\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0011"}, m90084d2 = {"Lcom/otaliastudios/opengl/draw/GlRect;", "Lcom/otaliastudios/opengl/draw/a;", "<init>", "()V", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/nio/FloatBuffer;", "Lcom/otaliastudios/opengl/types/FloatBuffer;", "g", "Ljava/nio/FloatBuffer;", "d", "()Ljava/nio/FloatBuffer;", "setVertexArray", "(Ljava/nio/FloatBuffer;)V", "vertexArray", CmcdData.Factory.STREAMING_FORMAT_HLS, "Companion", "library_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public class GlRect extends AbstractC27327a {

    /* JADX INFO: renamed from: i */
    @Deprecated
    @NotNull
    public static final float[] f55573i = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public FloatBuffer vertexArray;

    @Override // com.otaliastudios.opengl.draw.AbstractC27328b
    /* JADX INFO: renamed from: a */
    public void mo67828a() {
        C42139a.m92478b("glDrawArrays start");
        GLES20.glDrawArrays(C42786f.m93768o(), 0, m67834f());
        C42139a.m92478b("glDrawArrays end");
    }

    @Override // com.otaliastudios.opengl.draw.AbstractC27328b
    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public FloatBuffer getVertexArray() {
        return this.vertexArray;
    }

    public GlRect() {
        float[] fArr = f55573i;
        FloatBuffer floatBufferM95608b = C43418a.m95608b(fArr.length);
        floatBufferM95608b.put(fArr);
        floatBufferM95608b.clear();
        Unit unit = Unit.INSTANCE;
        this.vertexArray = floatBufferM95608b;
    }
}
