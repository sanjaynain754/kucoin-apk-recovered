package io.trtc.tuikit.atomicxcore.impl.message;

import com.tencent.imsdk.p128v2.V2TIMGroupMemberFullInfo;
import com.tencent.imsdk.p128v2.V2TIMGroupMemberInfo;
import com.tencent.imsdk.p128v2.V2TIMGroupMessageReadMemberList;
import com.tencent.imsdk.p128v2.V2TIMValueCallback;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.contact.GroupMember;
import io.trtc.tuikit.atomicxcore.api.contact.GroupMemberRole;
import java.util.ArrayList;
import java.util.List;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.message.f */
/* JADX INFO: loaded from: classes61.dex */
public final class C39832f implements V2TIMValueCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CompletionHandler f88501a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C39850o f88502b;

    public C39832f(CompletionHandler completionHandler, C39850o c39850o) {
        this.f88501a = completionHandler;
        this.f88502b = c39850o;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onError(int i11, String str) {
        CompletionHandler completionHandler = this.f88501a;
        if (completionHandler != null) {
            if (str == null) {
                str = "";
            }
            completionHandler.onFailure(i11, str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onSuccess(Object obj) {
        ?? EmptyList;
        V2TIMGroupMessageReadMemberList v2TIMGroupMessageReadMemberList = (V2TIMGroupMessageReadMemberList) obj;
        if (v2TIMGroupMessageReadMemberList != null) {
            C39850o c39850o = this.f88502b;
            c39850o.f88561b = v2TIMGroupMessageReadMemberList.getNextSeq();
            List<V2TIMGroupMemberInfo> memberInfoList = v2TIMGroupMessageReadMemberList.getMemberInfoList();
            if (memberInfoList != null) {
                Intrinsics.checkNotNull(memberInfoList);
                EmptyList = new ArrayList();
                for (V2TIMGroupMemberInfo v2Member : memberInfoList) {
                    GroupMember groupMember = null;
                    if (v2Member == null) {
                        v2Member = null;
                    }
                    if (v2Member != null) {
                        Intrinsics.checkNotNullParameter(v2Member, "v2Member");
                        String userID = v2Member.getUserID();
                        Intrinsics.checkNotNullExpressionValue(userID, "getUserID(...)");
                        GroupMember groupMember2 = new GroupMember(userID, v2Member.getNickName(), v2Member.getFaceUrl(), v2Member.getNameCard(), null, 0L, 48, null);
                        if (v2Member instanceof V2TIMGroupMemberFullInfo) {
                            V2TIMGroupMemberFullInfo v2TIMGroupMemberFullInfo = (V2TIMGroupMemberFullInfo) v2Member;
                            groupMember2.setRole(GroupMemberRole.INSTANCE.parse(v2TIMGroupMemberFullInfo.getRole()));
                            groupMember2.setMuteUntil(v2TIMGroupMemberFullInfo.getMuteUntil());
                        } else {
                            groupMember2.setRole(GroupMemberRole.MEMBER);
                        }
                        groupMember = groupMember2;
                    }
                    if (groupMember != null) {
                        EmptyList.add(groupMember);
                    }
                }
            } else {
                EmptyList = CollectionsKt.emptyList();
            }
            c39850o.f88569j.setValue(EmptyList);
            c39850o.f88570k.setValue(Boolean.valueOf(!v2TIMGroupMessageReadMemberList.isFinished()));
        }
        CompletionHandler completionHandler = this.f88501a;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
