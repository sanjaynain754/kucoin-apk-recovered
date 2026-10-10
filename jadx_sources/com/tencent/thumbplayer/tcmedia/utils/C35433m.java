package com.tencent.thumbplayer.tcmedia.utils;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.utils.m */
/* JADX INFO: loaded from: classes64.dex */
public class C35433m extends ReentrantReadWriteLock {

    /* JADX INFO: renamed from: a */
    private Condition f76603a = writeLock().newCondition();
}
