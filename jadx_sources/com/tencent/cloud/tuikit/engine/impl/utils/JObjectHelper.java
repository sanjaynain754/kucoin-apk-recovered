package com.tencent.cloud.tuikit.engine.impl.utils;

import com.tencent.cloud.tuikit.engine.impl.room.TUIRoomEngineJni;

/* JADX INFO: loaded from: classes59.dex */
public class JObjectHelper {
    public static void freeJObjectByAddress(long j11) {
        TUIRoomEngineJni.freeJObjectByAddress(j11);
    }

    public static long getJObjectAddress(Object obj) {
        return TUIRoomEngineJni.getJObjectAddress(obj);
    }
}
