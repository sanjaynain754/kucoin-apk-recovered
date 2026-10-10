package io.trtc.tuikit.atomicxcore.impl.message;

import com.tencent.imsdk.p128v2.V2TIMGroupMemberFullInfo;
import com.tencent.imsdk.p128v2.V2TIMGroupMemberInfo;
import com.tencent.imsdk.p128v2.V2TIMGroupMessageReadMemberList;
import com.tencent.imsdk.p128v2.V2TIMValueCallback;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.contact.GroupMember;
import io.trtc.tuikit.atomicxcore.api.contact.GroupMemberRole;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.message.h */
/* JADX INFO: loaded from: classes61.dex */
public final class C39836h implements V2TIMValueCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CompletionHandler f88516a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f88517b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C39850o f88518c;

    public C39836h(CompletionHandler completionHandler, boolean z11, C39850o c39850o) {
        this.f88516a = completionHandler;
        this.f88517b = z11;
        this.f88518c = c39850o;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onError(int i11, String str) {
        CompletionHandler completionHandler = this.f88516a;
        if (completionHandler != null) {
            if (str == null) {
                str = "";
            }
            completionHandler.onFailure(i11, str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onSuccess(Object obj) {
        ?? EmptyList;
        GroupMember groupMember;
        V2TIMGroupMessageReadMemberList v2TIMGroupMessageReadMemberList = (V2TIMGroupMessageReadMemberList) obj;
        if (v2TIMGroupMessageReadMemberList != null) {
            boolean z11 = this.f88517b;
            C39850o c39850o = this.f88518c;
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
            if (z11) {
                c39850o.f88561b = v2TIMGroupMessageReadMemberList.getNextSeq();
                InterfaceC41669n interfaceC41669n = c39850o.f88569j;
                interfaceC41669n.setValue(CollectionsKt.plus((Collection) interfaceC41669n.getValue(), (Iterable) EmptyList));
                c39850o.f88570k.setValue(Boolean.valueOf(!v2TIMGroupMessageReadMemberList.isFinished()));
            } else {
                c39850o.f88562c = v2TIMGroupMessageReadMemberList.getNextSeq();
                InterfaceC41669n interfaceC41669n2 = c39850o.f88571l;
                interfaceC41669n2.setValue(CollectionsKt.plus((Collection) interfaceC41669n2.getValue(), (Iterable) EmptyList));
                c39850o.f88572m.setValue(Boolean.valueOf(!v2TIMGroupMessageReadMemberList.isFinished()));
            }
        }
        CompletionHandler completionHandler = this.f88516a;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
