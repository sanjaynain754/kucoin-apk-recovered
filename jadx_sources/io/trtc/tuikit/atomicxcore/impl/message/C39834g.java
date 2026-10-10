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

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.message.g */
/* JADX INFO: loaded from: classes61.dex */
public final class C39834g implements V2TIMValueCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CompletionHandler f88509a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C39850o f88510b;

    public C39834g(CompletionHandler completionHandler, C39850o c39850o) {
        this.f88509a = completionHandler;
        this.f88510b = c39850o;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onError(int i11, String str) {
        CompletionHandler completionHandler = this.f88509a;
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
        GroupMember groupMember;
        V2TIMGroupMessageReadMemberList v2TIMGroupMessageReadMemberList = (V2TIMGroupMessageReadMemberList) obj;
        if (v2TIMGroupMessageReadMemberList != null) {
            C39850o c39850o = this.f88510b;
            c39850o.f88562c = v2TIMGroupMessageReadMemberList.getNextSeq();
            List<V2TIMGroupMemberInfo> memberInfoList = v2TIMGroupMessageReadMemberList.getMemberInfoList();
            if (memberInfoList != null) {
                Intrinsics.checkNotNull(memberInfoList);
                EmptyList = new ArrayList();
                for (V2TIMGroupMemberInfo v2Member : memberInfoList) {
                    if (v2Member != null) {
                        Intrinsics.checkNotNull(v2Member);
                        Intrinsics.checkNotNullParameter(v2Member, "v2Member");
                        String userID = v2Member.getUserID();
                        Intrinsics.checkNotNullExpressionValue(userID, "getUserID(...)");
                        groupMember = new GroupMember(userID, v2Member.getNickName(), v2Member.getFaceUrl(), v2Member.getNameCard(), null, 0L, 48, null);
                        if (v2Member instanceof V2TIMGroupMemberFullInfo) {
                            V2TIMGroupMemberFullInfo v2TIMGroupMemberFullInfo = (V2TIMGroupMemberFullInfo) v2Member;
                            groupMember.setRole(GroupMemberRole.INSTANCE.parse(v2TIMGroupMemberFullInfo.getRole()));
                            groupMember.setMuteUntil(v2TIMGroupMemberFullInfo.getMuteUntil());
                        } else {
                            groupMember.setRole(GroupMemberRole.MEMBER);
                        }
                    } else {
                        groupMember = null;
                    }
                    if (groupMember != null) {
                        EmptyList.add(groupMember);
                    }
                }
            } else {
                EmptyList = CollectionsKt.emptyList();
            }
            c39850o.f88571l.setValue(EmptyList);
            c39850o.f88572m.setValue(Boolean.valueOf(!v2TIMGroupMessageReadMemberList.isFinished()));
        }
        CompletionHandler completionHandler = this.f88509a;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
