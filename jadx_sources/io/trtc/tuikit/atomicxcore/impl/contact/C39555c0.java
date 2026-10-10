package io.trtc.tuikit.atomicxcore.impl.contact;

import com.tencent.imsdk.p128v2.V2TIMConversation;
import com.tencent.imsdk.p128v2.V2TIMGroupInfo;
import com.tencent.imsdk.p128v2.V2TIMManager;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.contact.GroupJoinOption;
import io.trtc.tuikit.atomicxcore.api.contact.GroupMemberRole;
import io.trtc.tuikit.atomicxcore.api.contact.GroupType;
import io.trtc.tuikit.atomicxcore.impl.common.C39497e;
import kotlinx.coroutines.C41716o;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugProbesKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.contact.c0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39555c0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f87842a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C39531G0 f87843b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ CompletionHandler f87844c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39555c0(C39531G0 c39531g0, CompletionHandler completionHandler, Continuation continuation) {
        super(2, continuation);
        this.f87843b = c39531g0;
        this.f87844c = completionHandler;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C39555c0(this.f87843b, this.f87844c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C39555c0(this.f87843b, this.f87844c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0138, code lost:
    
        if (r9 == r0) goto L44;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z11;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f87842a;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                V2TIMConversation v2TIMConversation = (V2TIMConversation) obj;
                if (v2TIMConversation != null) {
                    this.f87843b.f87767i.setValue(Boxing.boxBoolean(v2TIMConversation.isPinned()));
                }
                CompletionHandler completionHandler = this.f87844c;
                if (completionHandler != null) {
                    completionHandler.onSuccess();
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            String str = this.f87843b.f87759a;
            this.f87842a = 1;
            C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(this), 1);
            c41716o.m91142E();
            V2TIMManager.getGroupManager().getGroupsInfo(CollectionsKt.listOf(str), new C39573l0(c41716o));
            obj = c41716o.m91171w();
            if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            if (obj == coroutine_suspended) {
            }
            return coroutine_suspended;
            V2TIMGroupInfo v2TIMGroupInfo = (V2TIMGroupInfo) obj;
            if (v2TIMGroupInfo != null) {
                C39531G0 c39531g0 = this.f87843b;
                c39531g0.f87781w = v2TIMGroupInfo;
                InterfaceC41669n interfaceC41669n = c39531g0.f87762d;
                String groupName = v2TIMGroupInfo.getGroupName();
                String str2 = "";
                if (groupName == null) {
                    groupName = "";
                } else {
                    Intrinsics.checkNotNull(groupName);
                }
                interfaceC41669n.setValue(groupName);
                InterfaceC41669n interfaceC41669n2 = c39531g0.f87763e;
                String faceUrl = v2TIMGroupInfo.getFaceUrl();
                if (faceUrl == null) {
                    faceUrl = "";
                } else {
                    Intrinsics.checkNotNull(faceUrl);
                }
                interfaceC41669n2.setValue(faceUrl);
                InterfaceC41669n interfaceC41669n3 = c39531g0.f87764f;
                String notification = v2TIMGroupInfo.getNotification();
                if (notification != null) {
                    Intrinsics.checkNotNull(notification);
                    str2 = notification;
                }
                interfaceC41669n3.setValue(str2);
                c39531g0.f87772n.setValue(Boxing.boxInt(v2TIMGroupInfo.getMemberCount()));
                c39531g0.f87770l.setValue(GroupMemberRole.INSTANCE.parse(v2TIMGroupInfo.getRole()));
                InterfaceC41669n interfaceC41669n4 = c39531g0.f87773o;
                GroupJoinOption.Companion companion = GroupJoinOption.INSTANCE;
                interfaceC41669n4.setValue(companion.parse(v2TIMGroupInfo.getGroupAddOpt()));
                c39531g0.f87774p.setValue(companion.parse(v2TIMGroupInfo.getGroupApproveOpt()));
                c39531g0.f87766h.setValue(Boxing.boxBoolean(v2TIMGroupInfo.isAllMuted()));
                InterfaceC41669n interfaceC41669n5 = c39531g0.f87761c;
                GroupType.Companion companion2 = GroupType.INSTANCE;
                String groupType = v2TIMGroupInfo.getGroupType();
                Intrinsics.checkNotNullExpressionValue(groupType, "getGroupType(...)");
                interfaceC41669n5.setValue(companion2.parse(groupType));
                InterfaceC41669n interfaceC41669n6 = c39531g0.f87765g;
                if (v2TIMGroupInfo.getRecvOpt() == 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                interfaceC41669n6.setValue(Boxing.boxBoolean(z11));
            }
            C39531G0 c39531g1 = this.f87843b;
            int i12 = C39531G0.f87756C;
            String str3 = TUIConstants.TUIConversation.CONVERSATION_GROUP_PREFIX + c39531g1.f87759a;
            this.f87842a = 2;
            C41716o c41716o2 = new C41716o(IntrinsicsKt.intercepted(this), 1);
            c41716o2.m91142E();
            V2TIMManager.getConversationManager().getConversation(str3, new C39571k0(c41716o2));
            obj = c41716o2.m91171w();
            if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
        } catch (C39497e e11) {
            CompletionHandler completionHandler2 = this.f87844c;
            if (completionHandler2 != null) {
                completionHandler2.onFailure(e11.f87694a, e11.f87695b);
            }
        }
    }
}
