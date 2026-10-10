package io.trtc.tuikit.atomicxcore.impl.message;

import com.tencent.imsdk.p128v2.V2TIMValueCallback;
import io.trtc.tuikit.atomicxcore.impl.common.C39497e;
import io.trtc.tuikit.atomicxcore.impl.contact.AbstractC39552b;
import java.util.List;
import kotlinx.coroutines.C41716o;
import p852kotlin.Result;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.message.l0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39845l0 implements V2TIMValueCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C41716o f88553a;

    public C39845l0(C41716o c41716o) {
        this.f88553a = c41716o;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onError(int i11, String str) {
        C41716o c41716o = this.f88553a;
        Result.Companion companion = Result.INSTANCE;
        AbstractC39552b.m88278a(new C39497e(Integer.valueOf(i11), str), c41716o);
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onSuccess(Object obj) {
        List value = (List) obj;
        Intrinsics.checkNotNullParameter(value, "value");
        this.f88553a.resumeWith(Result.m103844constructorimpl(value));
    }
}
