package com.tencent.ugc.videobase.frame;

import com.tencent.ugc.videobase.frame.RefCounted;

/* JADX INFO: loaded from: classes2.dex */
public interface IRecycler<T extends RefCounted> {
    void recycle(T t11);
}
