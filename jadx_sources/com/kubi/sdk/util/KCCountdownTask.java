package com.kubi.sdk.util;

import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.sdk.util.d0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: TimeSyncManager.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0002\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/sdk/util/KCCountdownTask;", "", "id", "", "openTimeMills", "", TUIConstants.TUIChat.CALL_BACK, "Lcom/kubi/sdk/util/CountDownCallback;", "completion", "Lcom/kubi/sdk/util/CountDownFinishCallback;", "<init>", "(IJLcom/kubi/sdk/util/CountDownCallback;Lcom/kubi/sdk/util/CountDownFinishCallback;)V", "getId", "()I", "getOpenTimeMills", "()J", "setOpenTimeMills", "(J)V", "getCallback", "()Lcom/kubi/sdk/util/CountDownCallback;", "setCallback", "(Lcom/kubi/sdk/util/CountDownCallback;)V", "getCompletion", "()Lcom/kubi/sdk/util/CountDownFinishCallback;", "setCompletion", "(Lcom/kubi/sdk/util/CountDownFinishCallback;)V", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KCCountdownTask {

    /* JADX INFO: renamed from: a */
    public final int f48154a;

    /* JADX INFO: renamed from: b */
    public long f48155b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public CountDownCallback f48156c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public CountDownFinishCallback f48157d;

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final CountDownCallback getF48156c() {
        return this.f48156c;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final CountDownFinishCallback getF48157d() {
        return this.f48157d;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getF48155b() {
        return this.f48155b;
    }

    public KCCountdownTask(int i11, long j11, @Nullable CountDownCallback countDownCallback, @Nullable CountDownFinishCallback countDownFinishCallback) {
        this.f48154a = i11;
        this.f48155b = j11;
        this.f48156c = countDownCallback;
        this.f48157d = countDownFinishCallback;
    }
}
