package com.tencent.ugc.videobase.chain;

import com.tencent.ugc.videobase.frame.GLTexture;
import com.tencent.ugc.videobase.frame.GLTexturePool;

/* JADX INFO: loaded from: classes2.dex */
public abstract class GPUInterceptor {
    private boolean mIsInitialized = false;

    public abstract GLTexture intercept(long j11, GLTexture gLTexture);

    public final void initialize(GLTexturePool gLTexturePool) {
        if (this.mIsInitialized) {
            return;
        }
        onInit(gLTexturePool);
        this.mIsInitialized = true;
    }

    public boolean isInitialized() {
        return this.mIsInitialized;
    }

    public final void uninitialize() {
        if (this.mIsInitialized) {
            onUninit();
            this.mIsInitialized = false;
        }
    }

    public void onUninit() {
    }

    public void onInit(GLTexturePool gLTexturePool) {
    }
}
