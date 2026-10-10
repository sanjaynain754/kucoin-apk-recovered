package io.trtc.tuikit.atomicxcore.impl.login;

import io.trtc.tuikit.atomicxcore.api.login.LoginListener;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.login.d */
/* JADX INFO: loaded from: classes61.dex */
public final class C39792d extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public static final C39792d f88422a = new C39792d();

    public C39792d() {
        super(1);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LoginListener notify = (LoginListener) obj;
        Intrinsics.checkNotNullParameter(notify, "$this$notify");
        notify.onKickedOffline();
        return Unit.INSTANCE;
    }
}
