package io.trtc.tuikit.atomicxcore.impl.contact;

import com.tencent.imsdk.p128v2.V2TIMGroupMemberFullInfo;
import com.tencent.imsdk.p128v2.V2TIMGroupMemberInfoResult;
import com.tencent.imsdk.p128v2.V2TIMValueCallback;
import io.trtc.tuikit.atomicxcore.impl.common.C39497e;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.C41716o;
import p852kotlin.Result;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.contact.e0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39559e0 implements V2TIMValueCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39531G0 f87852a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C41716o f87853b;

    public C39559e0(C39531G0 c39531g0, C41716o c41716o) {
        this.f87852a = c39531g0;
        this.f87853b = c41716o;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onError(int i11, String str) {
        C41716o c41716o = this.f87853b;
        Result.Companion companion = Result.INSTANCE;
        AbstractC39552b.m88278a(new C39497e(Integer.valueOf(i11), str), c41716o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onSuccess(Object obj) {
        Object objEmptyList;
        List<V2TIMGroupMemberFullInfo> memberInfoList;
        V2TIMGroupMemberInfoResult v2TIMGroupMemberInfoResult = (V2TIMGroupMemberInfoResult) obj;
        if (v2TIMGroupMemberInfoResult == null || (memberInfoList = v2TIMGroupMemberInfoResult.getMemberInfoList()) == null) {
            objEmptyList = CollectionsKt.emptyList();
        } else {
            C39531G0 c39531g0 = this.f87852a;
            objEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(memberInfoList, 10));
            for (V2TIMGroupMemberFullInfo v2TIMGroupMemberFullInfo : memberInfoList) {
                Intrinsics.checkNotNull(v2TIMGroupMemberFullInfo);
                objEmptyList.add(C39531G0.m88255a(c39531g0, v2TIMGroupMemberFullInfo));
            }
        }
        this.f87852a.f87779u = v2TIMGroupMemberInfoResult != null ? v2TIMGroupMemberInfoResult.getNextSeq() : 0L;
        this.f87853b.resumeWith(Result.m103844constructorimpl(objEmptyList));
    }
}
