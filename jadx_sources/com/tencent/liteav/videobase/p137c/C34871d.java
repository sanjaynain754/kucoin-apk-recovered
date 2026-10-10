package com.tencent.liteav.videobase.p137c;

import com.tencent.ugc.videobase.chain.TXCGPUImageFilter;

/* JADX INFO: renamed from: com.tencent.liteav.videobase.c.d */
/* JADX INFO: loaded from: classes59.dex */
public final class C34871d extends AbstractC34872e {
    public C34871d() {
        super(TXCGPUImageFilter.NO_FILTER_VERTEX_SHADER, "varying highp vec2 textureCoordinate;\n\nuniform sampler2D yTexture;\nuniform sampler2D uvTexture;\nmediump mat3 colorConversionMatrix = mat3(       1.164,  1.164, 1.164,\n       1.596, -0.813,   0.0,\n         0.0, -0.392, 2.017\n);\nvoid main()\n{\n    mediump vec3 yuv;\n    lowp vec3 rgb;\n\n    yuv.x = texture2D(yTexture, textureCoordinate).r - (16.0/255.0);\n    yuv.yz = texture2D(uvTexture, textureCoordinate).ra - vec2(0.5, 0.5);\n    rgb = colorConversionMatrix * yuv;\n\n    gl_FragColor = vec4(rgb, 1.0);\n}");
    }

    @Override // com.tencent.liteav.videobase.p137c.AbstractC34872e
    /* JADX INFO: renamed from: d */
    public final int mo76487d() {
        return 6410;
    }
}
