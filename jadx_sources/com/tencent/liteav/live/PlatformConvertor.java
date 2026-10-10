package com.tencent.liteav.live;

import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.videobase.DisplayTarget;
import com.tencent.rtmp.p148ui.TXCloudVideoView;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("liteav")
public class PlatformConvertor {
    private static final String TAG = "PlatformConvertor";

    public static DisplayTarget createDisplayTarget(Object obj) {
        if (obj instanceof DisplayTarget) {
            return (DisplayTarget) obj;
        }
        if (obj instanceof TXCloudVideoView) {
            return new DisplayTarget((TXCloudVideoView) obj);
        }
        if (obj instanceof TextureView) {
            return new DisplayTarget((TextureView) obj);
        }
        if (obj instanceof SurfaceView) {
            return new DisplayTarget((SurfaceView) obj);
        }
        if (obj instanceof Surface) {
            return new DisplayTarget((Surface) obj);
        }
        LiteavLog.m76093w(TAG, "object is unknown. object=".concat(String.valueOf(obj)));
        return null;
    }
}
