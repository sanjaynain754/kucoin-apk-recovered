package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.de */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35587de implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoJoiner.C354773 f76937a;

    /* JADX INFO: renamed from: b */
    private final float f76938b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79083a(TXVideoJoiner.C354773 c354773, float f11) {
        return new RunnableC35587de(c354773, f11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoJoiner.this.notifyJoinProgress(this.f76938b);
    }

    private RunnableC35587de(TXVideoJoiner.C354773 c354773, float f11) {
        this.f76937a = c354773;
        this.f76938b = f11;
    }
}
