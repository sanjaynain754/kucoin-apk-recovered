package com.tencent.liteav.videobase.utils;

import com.tencent.liteav.videobase.frame.PixelFrame;
import java.util.Deque;
import java.util.LinkedList;

/* JADX INFO: renamed from: com.tencent.liteav.videobase.utils.f */
/* JADX INFO: loaded from: classes59.dex */
public final class C34900f {

    /* JADX INFO: renamed from: a */
    public final Deque<PixelFrame> f74322a = new LinkedList();

    /* JADX INFO: renamed from: b */
    public int f74323b = 1;

    /* JADX INFO: renamed from: a */
    public final PixelFrame m76563a() {
        PixelFrame pixelFramePollFirst;
        synchronized (this) {
            pixelFramePollFirst = this.f74322a.pollFirst();
        }
        return pixelFramePollFirst;
    }
}
