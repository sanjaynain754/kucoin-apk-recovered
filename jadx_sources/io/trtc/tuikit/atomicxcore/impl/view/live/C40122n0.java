package io.trtc.tuikit.atomicxcore.impl.view.live;

import io.trtc.tuikit.atomicxcore.api.live.BattleStore;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.live.n0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40122n0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f89246a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C40085V0 f89247b;

    /* JADX INFO: renamed from: c */
    public int f89248c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40122n0(C40085V0 c40085v0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f89247b = c40085v0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f89246a = obj;
        this.f89248c |= Integer.MIN_VALUE;
        return C40085V0.m88472b(this.f89247b, (BattleStore) null, this);
    }
}
