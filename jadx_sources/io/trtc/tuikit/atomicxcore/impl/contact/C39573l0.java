package io.trtc.tuikit.atomicxcore.impl.contact;

import com.tencent.imsdk.p128v2.V2TIMGroupInfoResult;
import com.tencent.imsdk.p128v2.V2TIMValueCallback;
import io.trtc.tuikit.atomicxcore.impl.common.C39497e;
import java.util.List;
import kotlinx.coroutines.C41716o;
import p852kotlin.Result;
import p852kotlin.collections.CollectionsKt;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.contact.l0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39573l0 implements V2TIMValueCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C41716o f87879a;

    public C39573l0(C41716o c41716o) {
        this.f87879a = c41716o;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onError(int i11, String str) {
        C41716o c41716o = this.f87879a;
        Result.Companion companion = Result.INSTANCE;
        AbstractC39552b.m88278a(new C39497e(Integer.valueOf(i11), str), c41716o);
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onSuccess(Object obj) {
        List list = (List) obj;
        V2TIMGroupInfoResult v2TIMGroupInfoResult = list != null ? (V2TIMGroupInfoResult) CollectionsKt.firstOrNull(list) : null;
        if (v2TIMGroupInfoResult == null || v2TIMGroupInfoResult.getResultCode() != 0) {
            C41716o c41716o = this.f87879a;
            Result.Companion companion = Result.INSTANCE;
            AbstractC39552b.m88278a(new C39497e(v2TIMGroupInfoResult != null ? Integer.valueOf(v2TIMGroupInfoResult.getResultCode()) : null, v2TIMGroupInfoResult != null ? v2TIMGroupInfoResult.getResultMessage() : null), c41716o);
        } else {
            C41716o c41716o2 = this.f87879a;
            Result.Companion companion2 = Result.INSTANCE;
            c41716o2.resumeWith(Result.m103844constructorimpl(v2TIMGroupInfoResult.getGroupInfo()));
        }
    }
}
