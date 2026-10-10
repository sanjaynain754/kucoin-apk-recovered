package com.kubi.network.api.subscribe.utils;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.network.api.subscribe.utils.c */
/* JADX INFO: compiled from: WsThreadPool.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R$\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0016j\b\u0012\u0004\u0012\u00020\b`\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/network/api/subscribe/utils/c;", "", "", "poolSize", "", "namePrefix", "<init>", "(ILjava/lang/String;)V", "Ljava/util/concurrent/ExecutorService;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Ljava/util/concurrent/ExecutorService;", "I", "getPoolSize", "()I", "b", "Ljava/lang/String;", "getNamePrefix", "()Ljava/lang/String;", "Ljava/util/concurrent/atomic/AtomicInteger;", "c", "Ljava/util/concurrent/atomic/AtomicInteger;", "threadPos", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "d", "Ljava/util/ArrayList;", "threadPool", "network-adapter-subscribe_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C19317c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int poolSize;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String namePrefix;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public AtomicInteger threadPos;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final ArrayList<ExecutorService> threadPool;

    public C19317c(int i11, @NotNull String namePrefix) {
        Intrinsics.checkNotNullParameter(namePrefix, "namePrefix");
        this.poolSize = i11;
        this.namePrefix = namePrefix;
        this.threadPos = new AtomicInteger(0);
        ArrayList<ExecutorService> arrayList = new ArrayList<>();
        for (int i12 = 0; i12 < i11; i12++) {
            arrayList.add(C42917g.m94140f(this.namePrefix + '-' + i12));
        }
        this.threadPool = arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final ExecutorService m42760a() {
        ExecutorService executorService = this.threadPool.get(Math.abs(this.threadPos.getAndIncrement() % this.poolSize));
        Intrinsics.checkNotNullExpressionValue(executorService, "threadPool[abs(threadPos…dIncrement() % poolSize)]");
        return executorService;
    }
}
