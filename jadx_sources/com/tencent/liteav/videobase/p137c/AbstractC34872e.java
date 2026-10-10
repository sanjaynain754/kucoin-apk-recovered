package com.tencent.liteav.videobase.p137c;

import android.opengl.GLES20;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.frame.AbstractC34885d;
import com.tencent.liteav.videobase.frame.C34886e;
import com.tencent.liteav.videobase.p135a.C34861a;
import com.tencent.liteav.videobase.utils.OpenGlUtils;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.Arrays;

/* JADX INFO: renamed from: com.tencent.liteav.videobase.c.e */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC34872e extends C34861a {

    /* JADX INFO: renamed from: h */
    protected final GLConstants.ColorSpace f74178h;

    /* JADX INFO: renamed from: i */
    protected final GLConstants.ColorRange f74179i;

    /* JADX INFO: renamed from: j */
    private int f74180j;

    /* JADX INFO: renamed from: k */
    private final int[] f74181k;

    /* JADX INFO: renamed from: l */
    private int f74182l;

    /* JADX INFO: renamed from: m */
    private int f74183m;

    public AbstractC34872e(String str, String str2, GLConstants.ColorRange colorRange, GLConstants.ColorSpace colorSpace) {
        super(str, str2);
        int[] iArr = new int[2];
        this.f74181k = iArr;
        this.f74182l = 0;
        this.f74183m = 0;
        Arrays.fill(iArr, -1);
        this.f74178h = colorSpace == GLConstants.ColorSpace.UNKNOWN ? GLConstants.ColorSpace.BT601 : colorSpace;
        this.f74179i = colorRange == GLConstants.ColorRange.UNKNOWN ? GLConstants.ColorRange.VIDEO_RANGE : colorRange;
    }

    /* JADX INFO: renamed from: e */
    private void m76489e() {
        int i11 = 0;
        while (true) {
            int[] iArr = this.f74181k;
            if (i11 >= iArr.length) {
                return;
            }
            OpenGlUtils.deleteTexture(iArr[i11]);
            this.f74181k[i11] = -1;
            i11++;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m76490a(ByteBuffer byteBuffer, int i11, int i12) {
        if (this.f74182l != i11 || this.f74183m != i12) {
            m76489e();
            this.f74182l = i11;
            this.f74183m = i12;
        }
        OpenGlUtils.loadYuv420DataToTextures(byteBuffer, mo76487d(), i11, i12, this.f74181k);
    }

    /* JADX INFO: renamed from: d */
    public abstract int mo76487d();

    @Override // com.tencent.liteav.videobase.p135a.C34861a
    /* JADX INFO: renamed from: b */
    public void mo76476b(C34886e c34886e) {
        super.mo76476b(c34886e);
        this.f74180j = GLES20.glGetUniformLocation(this.f74108f, "uvTexture");
    }

    @Override // com.tencent.liteav.videobase.p135a.C34861a
    /* JADX INFO: renamed from: c */
    public final void mo76477c() {
        m76489e();
        super.mo76477c();
    }

    @Override // com.tencent.liteav.videobase.p135a.C34861a
    /* JADX INFO: renamed from: a */
    public final void mo76472a(int i11, AbstractC34885d abstractC34885d, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        super.mo76472a(this.f74181k[0], abstractC34885d, floatBuffer, floatBuffer2);
    }

    @Override // com.tencent.liteav.videobase.p135a.C34861a
    /* JADX INFO: renamed from: a */
    public final void mo76470a(int i11) {
        super.mo76470a(i11);
        GLES20.glActiveTexture(33985);
        OpenGlUtils.bindTexture(mo76469a(), this.f74181k[1]);
        GLES20.glUniform1i(this.f74180j, 1);
    }

    public AbstractC34872e(String str, String str2) {
        this(str, str2, GLConstants.ColorRange.VIDEO_RANGE, GLConstants.ColorSpace.BT601);
    }
}
