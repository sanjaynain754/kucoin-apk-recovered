package com.tencent.ugc.videobase.frame;

import com.tencent.liteav.videobase.base.GLConstants;

/* JADX INFO: loaded from: classes2.dex */
public abstract class GLTexture extends RefCounted {
    public abstract GLConstants.ColorRange getColorRange();

    public abstract GLConstants.ColorSpace getColorSpace();

    public abstract int getHeight();

    public abstract int getId();

    public abstract FrameMetaData getMetaData();

    public abstract int getWidth();

    public abstract void reset();

    public abstract void setColorFormat(GLConstants.ColorRange colorRange, GLConstants.ColorSpace colorSpace);

    public abstract void setMetaData(FrameMetaData frameMetaData);

    public abstract PixelFrame wrap(Object obj);

    public GLTexture(IRecycler<? extends GLTexture> iRecycler) {
        super(iRecycler);
    }
}
