package com.tencent.thumbplayer.tcmedia.api;

import android.graphics.SurfaceTexture;
import com.tencent.thumbplayer.tcmedia.adapter.p151a.p153b.C35240c;
import com.tencent.thumbplayer.tcmedia.core.common.TPVideoPacket;
import com.tencent.thumbplayer.tcmedia.core.player.ITPNativePlayerSurfaceCallback;
import com.tencent.thumbplayer.tcmedia.core.player.TPNativePlayerSurface;
import com.tencent.thumbplayer.tcmedia.core.player.TPNativePlayerSurfaceRenderInfo;

/* JADX INFO: loaded from: classes62.dex */
public final class TPSurface extends TPNativePlayerSurface {
    private ITPNativePlayerSurfaceCallback mITPSurfaceCallback;
    private ITPSurfaceListener mPlayerSurfaceListener;

    public final void setSurfaceListener(ITPSurfaceListener iTPSurfaceListener) {
        this.mPlayerSurfaceListener = iTPSurfaceListener;
    }

    public TPSurface(SurfaceTexture surfaceTexture) {
        super(surfaceTexture);
        this.mPlayerSurfaceListener = null;
        ITPNativePlayerSurfaceCallback iTPNativePlayerSurfaceCallback = new ITPNativePlayerSurfaceCallback() { // from class: com.tencent.thumbplayer.tcmedia.api.TPSurface.1
            @Override // com.tencent.thumbplayer.tcmedia.core.player.ITPNativePlayerSurfaceCallback
            public void onFlush() {
                ITPSurfaceListener iTPSurfaceListener = TPSurface.this.mPlayerSurfaceListener;
                if (iTPSurfaceListener != null) {
                    iTPSurfaceListener.onFlush();
                }
            }

            @Override // com.tencent.thumbplayer.tcmedia.core.player.ITPNativePlayerSurfaceCallback
            public void onRenderInfo(TPNativePlayerSurfaceRenderInfo tPNativePlayerSurfaceRenderInfo) {
                ITPSurfaceListener iTPSurfaceListener = TPSurface.this.mPlayerSurfaceListener;
                if (iTPSurfaceListener != null) {
                    iTPSurfaceListener.onRenderInfo(C35240c.m77619a(tPNativePlayerSurfaceRenderInfo));
                }
            }

            @Override // com.tencent.thumbplayer.tcmedia.core.player.ITPNativePlayerSurfaceCallback
            public void onVideoPacket(TPVideoPacket tPVideoPacket) {
                ITPSurfaceListener iTPSurfaceListener = TPSurface.this.mPlayerSurfaceListener;
                if (iTPSurfaceListener != null) {
                    iTPSurfaceListener.onVideoPacket(C35240c.m77621a(tPVideoPacket));
                }
            }
        };
        this.mITPSurfaceCallback = iTPNativePlayerSurfaceCallback;
        super.setTPSurfaceCallback(iTPNativePlayerSurfaceCallback);
    }

    @Override // android.view.Surface
    public final void finalize() throws Throwable {
        super.release();
        super.finalize();
    }
}
