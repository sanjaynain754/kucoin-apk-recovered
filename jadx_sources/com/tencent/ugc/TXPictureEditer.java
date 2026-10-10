package com.tencent.ugc;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class TXPictureEditer {

    public interface PictureProcessListener {
        void onPictureProcessed(Bitmap bitmap);
    }

    public abstract void processPicture(PictureProcessListener pictureProcessListener);

    public abstract void setCropRect(Rect rect);

    public abstract void setOutputFillMode(int i11);

    public abstract void setOutputRotation(int i11);

    public abstract void setOutputSize(int i11, int i12);

    public abstract void setPasterList(List<TXVideoEditConstants.TXPaster> list);

    public abstract void setPicture(Bitmap bitmap);

    public static TXPictureEditer create(Context context) {
        return new UGCPictureEditerJni(context);
    }

    public static void destroy(TXPictureEditer tXPictureEditer) {
        if (tXPictureEditer instanceof UGCPictureEditerJni) {
            ((UGCPictureEditerJni) tXPictureEditer).destroy();
        }
    }
}
