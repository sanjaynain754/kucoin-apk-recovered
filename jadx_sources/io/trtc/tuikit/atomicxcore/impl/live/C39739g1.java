package io.trtc.tuikit.atomicxcore.impl.live;

import android.content.Context;
import io.trtc.tuikit.atomicxcore.impl.barrage.AbstractC39465b;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.g1 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39739g1 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39760n1 f88307a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f88308b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f88309c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f88310d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Context f88311e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39739g1(C39760n1 c39760n1, int i11, String str, String str2, Context context) {
        super(0);
        this.f88307a = c39760n1;
        this.f88308b = i11;
        this.f88309c = str;
        this.f88310d = str2;
        this.f88311e = context;
    }

    @Override // p852kotlin.jvm.functions.Function0
    public final Object invoke() {
        AbstractC39465b.m88232a(this.f88307a.f88351a, "Response: login room engine success", "message", 0, "Response: login room engine success");
        this.f88307a.f88353c = new C39736f1(this.f88308b, this.f88309c, this.f88310d, this.f88311e);
        return Unit.INSTANCE;
    }
}
