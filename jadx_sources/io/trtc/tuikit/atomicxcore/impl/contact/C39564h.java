package io.trtc.tuikit.atomicxcore.impl.contact;

import com.tencent.imsdk.p128v2.V2TIMFriendInfo;
import com.tencent.imsdk.p128v2.V2TIMFriendInfoResult;
import com.tencent.imsdk.p128v2.V2TIMManager;
import com.tencent.imsdk.p128v2.V2TIMUserFullInfo;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
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

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.contact.h */
/* JADX INFO: loaded from: classes61.dex */
public final class C39564h extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f87864a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C39586s f87865b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ CompletionHandler f87866c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39564h(C39586s c39586s, CompletionHandler completionHandler, Continuation continuation) {
        super(2, continuation);
        this.f87865b = c39586s;
        this.f87866c = completionHandler;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C39564h(this.f87865b, this.f87866c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C39564h(this.f87865b, this.f87866c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00fa, code lost:
    
        if (r10 == r0) goto L39;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f87864a;
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
                V2TIMFriendInfoResult v2TIMFriendInfoResult = (V2TIMFriendInfoResult) obj;
                if (v2TIMFriendInfoResult != null && v2TIMFriendInfoResult.getResultCode() == 0) {
                    V2TIMFriendInfo friendInfo = v2TIMFriendInfoResult.getFriendInfo();
                    int relation = v2TIMFriendInfoResult.getRelation();
                    if (friendInfo != null && relation == 3) {
                        this.f87865b.f87916i.setValue(Boxing.boxBoolean(true));
                        InterfaceC41669n interfaceC41669n = this.f87865b.f87913f;
                        String friendRemark = friendInfo.getFriendRemark();
                        if (friendRemark == null) {
                            friendRemark = "";
                        }
                        interfaceC41669n.setValue(friendRemark);
                    } else {
                        this.f87865b.f87916i.setValue(Boxing.boxBoolean(false));
                        this.f87865b.f87913f.setValue("");
                    }
                } else {
                    this.f87865b.f87916i.setValue(Boxing.boxBoolean(false));
                    this.f87865b.f87913f.setValue("");
                }
                CompletionHandler completionHandler = this.f87866c;
                if (completionHandler != null) {
                    completionHandler.onSuccess();
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            String str = this.f87865b.f87908a;
            this.f87864a = 1;
            C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(this), 1);
            c41716o.m91142E();
            V2TIMManager.getInstance().getUsersInfo(CollectionsKt.listOf(str), new C39572l(c41716o));
            obj = c41716o.m91171w();
            if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            if (obj == coroutine_suspended) {
            }
            return coroutine_suspended;
            V2TIMUserFullInfo v2TIMUserFullInfo = (V2TIMUserFullInfo) obj;
            C39586s c39586s = this.f87865b;
            int i12 = C39586s.f87907o;
            c39586s.getClass();
            V2TIMManager.getMessageManager().getC2CReceiveMessageOpt(CollectionsKt.listOf(c39586s.f87908a), new C39570k(c39586s));
            C39586s c39586s2 = this.f87865b;
            c39586s2.getClass();
            V2TIMManager.getConversationManager().getConversation(TUIConstants.TUIConversation.CONVERSATION_C2C_PREFIX + c39586s2.f87908a, new C39566i(c39586s2));
            if (v2TIMUserFullInfo != null) {
                C39586s c39586s3 = this.f87865b;
                InterfaceC41669n interfaceC41669n2 = c39586s3.f87910c;
                String nickName = v2TIMUserFullInfo.getNickName();
                if (nickName == null) {
                    nickName = "";
                } else {
                    Intrinsics.checkNotNull(nickName);
                }
                interfaceC41669n2.setValue(nickName);
                InterfaceC41669n interfaceC41669n3 = c39586s3.f87911d;
                String faceUrl = v2TIMUserFullInfo.getFaceUrl();
                if (faceUrl == null) {
                    faceUrl = "";
                } else {
                    Intrinsics.checkNotNull(faceUrl);
                }
                interfaceC41669n3.setValue(faceUrl);
                InterfaceC41669n interfaceC41669n4 = c39586s3.f87912e;
                String selfSignature = v2TIMUserFullInfo.getSelfSignature();
                if (selfSignature == null) {
                    selfSignature = "";
                } else {
                    Intrinsics.checkNotNull(selfSignature);
                }
                interfaceC41669n4.setValue(selfSignature);
            }
            String str2 = this.f87865b.f87908a;
            this.f87864a = 2;
            C41716o c41716o2 = new C41716o(IntrinsicsKt.intercepted(this), 1);
            c41716o2.m91142E();
            V2TIMManager.getFriendshipManager().getFriendsInfo(CollectionsKt.listOf(str2), new C39568j(c41716o2));
            obj = c41716o2.m91171w();
            if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
        } catch (C39497e e11) {
            this.f87865b.f87916i.setValue(Boxing.boxBoolean(false));
            this.f87865b.f87913f.setValue("");
            CompletionHandler completionHandler2 = this.f87866c;
            if (completionHandler2 != null) {
                completionHandler2.onFailure(e11.f87694a, e11.f87695b);
            }
        }
    }
}
