package com.tencent.liteav.videobase.p136b;

import com.tencent.liteav.videobase.p135a.C34861a;
import com.tencent.ugc.videobase.chain.TXCGPUImageFilter;

/* JADX INFO: renamed from: com.tencent.liteav.videobase.b.a */
/* JADX INFO: loaded from: classes59.dex */
public final class C34862a extends C34861a {
    public C34862a() {
        super(TXCGPUImageFilter.NO_FILTER_VERTEX_SHADER, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying highp vec2 textureCoordinate;\nuniform samplerExternalOES inputImageTexture;\nvoid main()\n{\n   gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
    }

    @Override // com.tencent.liteav.videobase.p135a.C34861a
    /* JADX INFO: renamed from: a */
    public final int mo76469a() {
        return 36197;
    }
}
