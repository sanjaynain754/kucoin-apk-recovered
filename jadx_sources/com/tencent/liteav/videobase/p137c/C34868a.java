package com.tencent.liteav.videobase.p137c;

import android.opengl.GLES20;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.frame.C34886e;
import com.tencent.ugc.videobase.chain.TXCGPUImageFilter;

/* JADX INFO: renamed from: com.tencent.liteav.videobase.c.a */
/* JADX INFO: loaded from: classes59.dex */
public final class C34868a extends AbstractC34872e {

    /* JADX INFO: renamed from: j */
    private static final float[] f74168j = {1.1644f, 1.1644f, 1.1644f, 0.0f, -0.3918f, 2.0172f, 1.596f, -0.813f, 0.0f};

    /* JADX INFO: renamed from: k */
    private static final float[] f74169k = {1.0f, 1.0f, 1.0f, 0.0f, -0.3441f, 1.772f, 1.402f, -0.7141f, 0.0f};

    /* JADX INFO: renamed from: l */
    private static final float[] f74170l = {1.1644f, 1.1644f, 1.1644f, 0.0f, -0.2132f, 2.1124f, 1.7927f, -0.5329f, 0.0f};

    /* JADX INFO: renamed from: m */
    private static final float[] f74171m = {1.0f, 1.0f, 1.0f, 0.0f, -0.1873f, 1.8556f, 1.5748f, -0.4681f, 0.0f};

    /* JADX INFO: renamed from: n */
    private static final float[] f74172n = {-0.0627451f, -0.5019608f, -0.5019608f};

    /* JADX INFO: renamed from: o */
    private static final float[] f74173o = {0.0f, -0.5019608f, -0.5019608f};

    /* JADX INFO: renamed from: p */
    private int f74174p;

    /* JADX INFO: renamed from: q */
    private int f74175q;

    /* JADX INFO: renamed from: com.tencent.liteav.videobase.c.a$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f74176a;

        static {
            int[] iArr = new int[GLConstants.ColorRange.values().length];
            f74176a = iArr;
            try {
                iArr[GLConstants.ColorRange.FULL_RANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74176a[GLConstants.ColorRange.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f74176a[GLConstants.ColorRange.VIDEO_RANGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C34868a(GLConstants.ColorRange colorRange, GLConstants.ColorSpace colorSpace) {
        super(TXCGPUImageFilter.NO_FILTER_VERTEX_SHADER, "precision highp float;\nvarying vec2 textureCoordinate;\nuniform sampler2D inputImageTexture;\nuniform sampler2D uvTexture;\nuniform mat3 convertMatrix;\nuniform vec3 offset;\n\nvoid main()\n{\n    highp vec3 yuvColor;\n    highp vec3 rgbColor;\n\n    // Get the YUV values\n    yuvColor.x = texture2D(inputImageTexture, textureCoordinate).r;\n    yuvColor.y = texture2D(uvTexture, vec2(textureCoordinate.x, textureCoordinate.y * 0.5)).r;\n    yuvColor.z = texture2D(uvTexture, vec2(textureCoordinate.x, textureCoordinate.y * 0.5 + 0.5)).r;\n\n    // Do the color transform\n    yuvColor += offset;\n    rgbColor = convertMatrix * yuvColor;\n\n    gl_FragColor = vec4(rgbColor, 1.0);\n}", colorRange, colorSpace);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0054  */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m76486a(C34868a c34868a) {
        float[] fArr;
        GLES20.glUseProgram(c34868a.f74108f);
        GLES20.glUniform3fv(c34868a.f74175q, 1, AnonymousClass1.f74176a[c34868a.f74179i.ordinal()] != 1 ? f74172n : f74173o, 0);
        int i11 = c34868a.f74174p;
        GLConstants.ColorSpace colorSpace = c34868a.f74178h;
        if (colorSpace == null || colorSpace == GLConstants.ColorSpace.UNKNOWN) {
            colorSpace = GLConstants.ColorSpace.BT601;
        }
        GLConstants.ColorRange colorRange = c34868a.f74179i;
        if (colorRange == null || colorRange == GLConstants.ColorRange.UNKNOWN) {
            colorRange = GLConstants.ColorRange.VIDEO_RANGE;
        }
        if (colorSpace == GLConstants.ColorSpace.BT601) {
            if (colorRange == GLConstants.ColorRange.VIDEO_RANGE || colorRange != GLConstants.ColorRange.FULL_RANGE) {
                fArr = f74168j;
            } else {
                fArr = f74169k;
            }
        } else if (colorSpace != GLConstants.ColorSpace.BT709) {
            fArr = f74168j;
        } else if (colorRange == GLConstants.ColorRange.VIDEO_RANGE) {
            fArr = f74170l;
        } else if (colorRange == GLConstants.ColorRange.FULL_RANGE) {
            fArr = f74171m;
        } else {
            fArr = f74168j;
        }
        GLES20.glUniformMatrix3fv(i11, 1, false, fArr, 0);
    }

    @Override // com.tencent.liteav.videobase.p137c.AbstractC34872e
    /* JADX INFO: renamed from: d */
    public final int mo76487d() {
        return 6409;
    }

    @Override // com.tencent.liteav.videobase.p137c.AbstractC34872e, com.tencent.liteav.videobase.p135a.C34861a
    /* JADX INFO: renamed from: b */
    public final void mo76476b(C34886e c34886e) {
        super.mo76476b(c34886e);
        this.f74174p = GLES20.glGetUniformLocation(this.f74108f, "convertMatrix");
        this.f74175q = GLES20.glGetUniformLocation(this.f74108f, TypedValues.CycleType.S_WAVE_OFFSET);
        m76474a(RunnableC34869b.m76488a(this));
    }
}
