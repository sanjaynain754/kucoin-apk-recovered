package io.trtc.tuikit.atomicxcore.impl.view.call;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import io.trtc.tuikit.atomicxcore.impl.gift.AbstractC39662a;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.call.w */
/* JADX INFO: loaded from: classes61.dex */
public final class C40039w implements TUICommonDefine.PlayCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C40040x f89066a;

    public C40039w(C40040x c40040x) {
        this.f89066a = c40040x;
    }

    @Override // com.tencent.cloud.tuikit.engine.common.TUICommonDefine.PlayCallback
    public final void onError(String str, int i11, String str2) {
        C39510r c39510r = this.f89066a.f89068a;
        String message = "onError code=" + i11 + " message=" + str2;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(2, message);
    }

    @Override // com.tencent.cloud.tuikit.engine.common.TUICommonDefine.PlayCallback
    public final void onLoading(String str) {
        AbstractC39662a.m88299a("onLoading userId=", str, this.f89066a.f89068a, "message", 0);
    }

    @Override // com.tencent.cloud.tuikit.engine.common.TUICommonDefine.PlayCallback
    public final void onPlaying(String str) {
        AbstractC39662a.m88299a("onPlaying userId=", str, this.f89066a.f89068a, "message", 0);
    }
}
