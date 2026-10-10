package com.tencent.rtmp.video;

import android.hardware.display.VirtualDisplay;

/* JADX INFO: loaded from: classes56.dex */
public class VirtualDisplayWrapper {
    private VirtualDisplay mVirtualDisplay;

    public void release() {
        VirtualDisplay virtualDisplay = this.mVirtualDisplay;
        if (virtualDisplay != null) {
            virtualDisplay.release();
            this.mVirtualDisplay = null;
        }
    }

    public void resize(int i11, int i12) {
        VirtualDisplay virtualDisplay = this.mVirtualDisplay;
        if (virtualDisplay != null) {
            virtualDisplay.resize(i11, i12, 1);
        }
    }

    public VirtualDisplayWrapper(VirtualDisplay virtualDisplay) {
        this.mVirtualDisplay = virtualDisplay;
    }
}
