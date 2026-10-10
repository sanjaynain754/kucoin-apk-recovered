package com.tencent.liteav.txcplayer;

import android.content.Context;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.thumbplayer.ThumbMediaPlayer;
import java.lang.reflect.Constructor;

/* JADX INFO: renamed from: com.tencent.liteav.txcplayer.f */
/* JADX INFO: loaded from: classes59.dex */
public class C34814f {

    /* JADX INFO: renamed from: a */
    private static final String f73765a = "com.tencent.liteav.txcplayer.f";

    /* JADX INFO: renamed from: b */
    private static ITXVCubePlayer m76241b(Context context) {
        try {
            int i11 = ThumbMediaPlayer.f73667a;
            Constructor declaredConstructor = ThumbMediaPlayer.class.getDeclaredConstructor(Context.class);
            declaredConstructor.setAccessible(true);
            return (ITXVCubePlayer) declaredConstructor.newInstance(context);
        } catch (Exception e11) {
            LiteavLog.m76083e(f73765a, "create thumbplayer exception: " + e11.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static ITXVCubePlayer m76240a(Context context) {
        return m76241b(context);
    }
}
