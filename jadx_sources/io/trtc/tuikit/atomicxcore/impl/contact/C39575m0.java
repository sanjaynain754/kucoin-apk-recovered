package io.trtc.tuikit.atomicxcore.impl.contact;

import com.tencent.imsdk.p128v2.V2TIMGroupMemberFullInfo;
import com.tencent.imsdk.p128v2.V2TIMValueCallback;
import io.trtc.tuikit.atomicxcore.impl.common.C39497e;
import java.util.List;
import kotlinx.coroutines.C41716o;
import p852kotlin.Result;
import p852kotlin.collections.CollectionsKt;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.contact.m0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39575m0 implements V2TIMValueCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C41716o f87883a;

    public C39575m0(C41716o c41716o) {
        this.f87883a = c41716o;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onError(int i11, String str) {
        C41716o c41716o = this.f87883a;
        Result.Companion companion = Result.INSTANCE;
        AbstractC39552b.m88278a(new C39497e(Integer.valueOf(i11), str), c41716o);
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onSuccess(Object obj) {
        List list = (List) obj;
        C41716o c41716o = this.f87883a;
        Result.Companion companion = Result.INSTANCE;
        c41716o.resumeWith(Result.m103844constructorimpl(list != null ? (V2TIMGroupMemberFullInfo) CollectionsKt.firstOrNull(list) : null));
    }
}
