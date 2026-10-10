package com.tencent.liteav.videobase.utils;

import android.content.Intent;
import com.tencent.liteav.base.p130b.C34691a;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.ugc.videobase.utils.MemoryAllocator;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.tencent.liteav.videobase.utils.d */
/* JADX INFO: loaded from: classes59.dex */
public final class C34898d {

    /* JADX INFO: renamed from: a */
    private static final C34691a f74319a = new C34691a(1000);

    /* JADX INFO: renamed from: a */
    public static byte[] m76560a(int i11) {
        try {
            return new byte[i11];
        } catch (OutOfMemoryError e11) {
            m76559a(e11.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static synchronized void m76559a(String str) {
        if (f74319a.m76041a()) {
            LiteavLog.m76083e("MemoryAllocator", "allocate buffer failed with oom error, msg:".concat(String.valueOf(str)));
            C34897c.m76557a().m76558a(new Intent(MemoryAllocator.OUT_OF_MEMORY_ACTION));
        }
    }

    /* JADX INFO: renamed from: b */
    public static ByteBuffer m76561b(int i11) {
        try {
            return ByteBuffer.allocateDirect(i11);
        } catch (OutOfMemoryError e11) {
            m76559a(e11.getMessage());
            return null;
        }
    }
}
