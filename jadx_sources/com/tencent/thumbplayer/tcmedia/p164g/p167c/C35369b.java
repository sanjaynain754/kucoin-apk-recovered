package com.tencent.thumbplayer.tcmedia.p164g.p167c;

import android.graphics.SurfaceTexture;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.g.c.b */
/* JADX INFO: loaded from: classes64.dex */
public final class C35369b extends SurfaceTexture {

    /* JADX INFO: renamed from: a */
    private a f76136a;

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.g.c.b$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo78288a();
    }

    /* JADX INFO: renamed from: a */
    public final void m78287a(a aVar) {
        this.f76136a = aVar;
    }

    public C35369b(int i11) {
        super(i11);
    }

    @Override // android.graphics.SurfaceTexture
    public final void release() {
        super.release();
        a aVar = this.f76136a;
        if (aVar != null) {
            aVar.mo78288a();
        }
    }
}
