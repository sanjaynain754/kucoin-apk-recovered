package com.tencent.thumbplayer.tcmedia.api;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Looper;
import com.tencent.thumbplayer.tcmedia.api.richmedia.ITPRichMediaAsyncRequester;
import com.tencent.thumbplayer.tcmedia.api.richmedia.ITPRichMediaSynchronizer;
import com.tencent.thumbplayer.tcmedia.p160e.C35352b;
import com.tencent.thumbplayer.tcmedia.p161f.C35355b;
import com.tencent.thumbplayer.tcmedia.p161f.p162a.C35354a;
import com.tencent.thumbplayer.tcmedia.tplayer.C35411b;
import com.tencent.thumbplayer.tcmedia.tplayer.C35413d;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;

/* JADX INFO: loaded from: classes62.dex */
public class TPPlayerFactory {
    private static final String LOG_TAG = "TPPlayerFactory";

    public static ITPPlayer createTPPlayer(Context context) {
        return (ITPPlayer) new C35413d(new C35411b(context)).m78692a();
    }

    public static ITPRichMediaAsyncRequester createRichMediaASyncRequester(Context context) {
        try {
            return new C35354a(context.getApplicationContext());
        } catch (UnsupportedOperationException e11) {
            TPLogUtil.m78797e(LOG_TAG, "Failed to create rich media async requester:" + e11.getMessage());
            return null;
        }
    }

    public static ITPRichMediaSynchronizer createRichMediaSynchronizer(Context context) {
        try {
            return new C35355b(context.getApplicationContext());
        } catch (UnsupportedOperationException e11) {
            TPLogUtil.m78797e(LOG_TAG, "Failed to create rich media synchronizer:" + e11.getMessage());
            return null;
        }
    }

    public static ITPPlayer createTPPlayer(Context context, Looper looper) {
        return (ITPPlayer) new C35413d(new C35411b(context, looper)).m78692a();
    }

    public static TPSurface createTPSurface(SurfaceTexture surfaceTexture) {
        return new TPSurface(surfaceTexture);
    }

    public static ITPPlayer createTPPlayer(Context context, Looper looper, Looper looper2) {
        return (ITPPlayer) new C35413d(new C35411b(context, looper, looper2)).m78692a();
    }

    public static ITPPlayer createTPPlayer(Context context, Looper looper, Looper looper2, C35352b c35352b) {
        return (ITPPlayer) new C35413d(new C35411b(context, looper, looper2, c35352b)).m78692a();
    }

    public static ITPPlayer createTPPlayer(Context context, C35352b c35352b) {
        return (ITPPlayer) new C35413d(new C35411b(context, null, null, c35352b)).m78692a();
    }
}
