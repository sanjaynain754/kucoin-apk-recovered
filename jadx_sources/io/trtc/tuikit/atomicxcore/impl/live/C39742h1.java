package io.trtc.tuikit.atomicxcore.impl.live;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.h1 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39742h1 extends Lambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39760n1 f88317a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39742h1(C39760n1 c39760n1) {
        super(2);
        this.f88317a = c39760n1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        TUICommonDefine.Error code = (TUICommonDefine.Error) obj;
        String msg = (String) obj2;
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(msg, "msg");
        C39510r c39510r = this.f88317a.f88351a;
        String message = "Response: login room engine failed code=" + code + ", msg=" + msg;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(2, message);
        return Unit.INSTANCE;
    }
}
