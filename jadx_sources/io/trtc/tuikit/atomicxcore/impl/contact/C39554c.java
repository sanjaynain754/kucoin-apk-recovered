package io.trtc.tuikit.atomicxcore.impl.contact;

import com.tencent.imsdk.p128v2.V2TIMFriendOperationResult;
import com.tencent.imsdk.p128v2.V2TIMValueCallback;
import io.trtc.tuikit.atomicxcore.impl.common.C39497e;
import java.util.List;
import kotlinx.coroutines.C41716o;
import p852kotlin.Result;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.contact.c */
/* JADX INFO: loaded from: classes61.dex */
public final class C39554c implements V2TIMValueCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C41716o f87841a;

    public C39554c(C41716o c41716o) {
        this.f87841a = c41716o;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onError(int i11, String str) {
        C41716o c41716o = this.f87841a;
        Result.Companion companion = Result.INSTANCE;
        AbstractC39552b.m88278a(new C39497e(Integer.valueOf(i11), str), c41716o);
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onSuccess(Object obj) {
        List list = (List) obj;
        V2TIMFriendOperationResult v2TIMFriendOperationResult = list != null ? (V2TIMFriendOperationResult) CollectionsKt.firstOrNull(list) : null;
        if (v2TIMFriendOperationResult == null || v2TIMFriendOperationResult.getResultCode() != 0) {
            C41716o c41716o = this.f87841a;
            Result.Companion companion = Result.INSTANCE;
            AbstractC39552b.m88278a(new C39497e(v2TIMFriendOperationResult != null ? Integer.valueOf(v2TIMFriendOperationResult.getResultCode()) : null, v2TIMFriendOperationResult != null ? v2TIMFriendOperationResult.getResultInfo() : null), c41716o);
        } else {
            C41716o c41716o2 = this.f87841a;
            Result.Companion companion2 = Result.INSTANCE;
            c41716o2.resumeWith(Result.m103844constructorimpl(Unit.INSTANCE));
        }
    }
}
