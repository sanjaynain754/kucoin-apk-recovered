package io.trtc.tuikit.atomicxcore.impl.message;

import com.tencent.imsdk.p128v2.V2TIMMessage;
import com.tencent.imsdk.p128v2.V2TIMMessageListGetOption;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.trtc.tuikit.atomicxcore.api.message.MessageFetchOption;
import io.trtc.tuikit.atomicxcore.api.message.MessageFilterType;
import io.trtc.tuikit.atomicxcore.api.message.MessageInfo;
import io.trtc.tuikit.atomicxcore.impl.common.AbstractC39504l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlinx.coroutines.AbstractC41586e2;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41729r0;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.message.i0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39839i0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public Ref.ObjectRef f88526a;

    /* JADX INFO: renamed from: b */
    public Ref.ObjectRef f88527b;

    /* JADX INFO: renamed from: c */
    public Object f88528c;

    /* JADX INFO: renamed from: d */
    public int f88529d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f88530e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C39857r0 f88531f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ MessageFetchOption f88532g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C39829d0 f88533h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39839i0(C39857r0 c39857r0, MessageFetchOption messageFetchOption, C39829d0 c39829d0, Continuation continuation) {
        super(2, continuation);
        this.f88531f = c39857r0;
        this.f88532g = messageFetchOption;
        this.f88533h = c39829d0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C39839i0 c39839i0 = new C39839i0(this.f88531f, this.f88532g, this.f88533h, continuation);
        c39839i0.f88530e = obj;
        return c39839i0;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C39839i0) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:83:0x024f  */
    /* JADX WARN: Code duplicated, block: B:89:0x026c  */
    /* JADX WARN: Code duplicated, block: B:91:0x0272  */
    /* JADX WARN: Code duplicated, block: B:94:0x027f  */
    /* JADX WARN: Code duplicated, block: B:98:0x029c A[LOOP:0: B:96:0x0296->B:98:0x029c, LOOP_END] */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x02c9, code lost:
    
        if (kotlinx.coroutines.C41686h.m91049g(r2, r7, r27) == r1) goto L101;
     */
    /* JADX WARN: Type inference failed for: r8v0, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v1, types: [T, java.util.List] */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ref.ObjectRef objectRef;
        Object objMo91198h;
        InterfaceC41709m0 interfaceC41709m0;
        Ref.ObjectRef objectRef2;
        InterfaceC41729r0 interfaceC41729r0;
        Object value;
        Object objMo91198h2;
        Ref.ObjectRef objectRef3;
        Ref.ObjectRef objectRef4;
        Object value2;
        ArrayList arrayList;
        MessageInfo message;
        ArrayList arrayList2;
        Iterator it;
        V2TIMMessage rawMessage;
        String message2;
        String message3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f88529d;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC41709m0 interfaceC41709m1 = (InterfaceC41709m0) this.f88530e;
            Ref.ObjectRef objectRef5 = new Ref.ObjectRef();
            objectRef5.element = CollectionsKt.emptyList();
            objectRef = new Ref.ObjectRef();
            objectRef.element = CollectionsKt.emptyList();
            C39857r0 c39857r0 = this.f88531f;
            MessageFetchOption messageFetchOption = this.f88532g;
            int i12 = C39857r0.f88586n;
            c39857r0.getClass();
            ArrayList arrayList3 = new ArrayList();
            if (messageFetchOption.getFilterType().contains(MessageFilterType.Image)) {
                arrayList3.add(3);
            }
            if (messageFetchOption.getFilterType().contains(MessageFilterType.Video)) {
                arrayList3.add(5);
            }
            V2TIMMessageListGetOption v2TIMMessageListGetOption = new V2TIMMessageListGetOption();
            C39857r0 c39857r1 = this.f88531f;
            MessageFetchOption messageFetchOption2 = this.f88532g;
            String conversationID = c39857r1.f88587a;
            Intrinsics.checkNotNullParameter(conversationID, "conversationID");
            v2TIMMessageListGetOption.setGroupID(StringsKt.startsWith$default(conversationID, TUIConstants.TUIConversation.CONVERSATION_GROUP_PREFIX, false, 2, (Object) null) ? StringsKt.replaceFirst$default(conversationID, TUIConstants.TUIConversation.CONVERSATION_GROUP_PREFIX, "", false, 4, (Object) null) : null);
            String conversationID2 = c39857r1.f88587a;
            Intrinsics.checkNotNullParameter(conversationID2, "conversationID");
            v2TIMMessageListGetOption.setUserID(StringsKt.startsWith$default(conversationID2, TUIConstants.TUIConversation.CONVERSATION_C2C_PREFIX, false, 2, (Object) null) ? StringsKt.replaceFirst$default(conversationID2, TUIConstants.TUIConversation.CONVERSATION_C2C_PREFIX, "", false, 4, (Object) null) : null);
            v2TIMMessageListGetOption.setCount(messageFetchOption2.getPageCount());
            MessageInfo message4 = messageFetchOption2.getMessage();
            if ((message4 != null ? message4.getRawMessage() : null) != null) {
                v2TIMMessageListGetOption.setLastMsg(messageFetchOption2.getMessage().getRawMessage());
            } else {
                v2TIMMessageListGetOption.setLastMsgSeq(messageFetchOption2.getMessageSeq());
            }
            v2TIMMessageListGetOption.setMessageTypeList(arrayList3);
            v2TIMMessageListGetOption.setGetType(!arrayList3.isEmpty() ? 3 : 1);
            InterfaceC41729r0 interfaceC41729r0M91102b = C41696j.m91102b(interfaceC41709m1, null, null, new C39837h0(this.f88531f, v2TIMMessageListGetOption, objectRef5, null), 3, null);
            V2TIMMessageListGetOption v2TIMMessageListGetOption2 = new V2TIMMessageListGetOption();
            C39857r0 c39857r2 = this.f88531f;
            MessageFetchOption messageFetchOption3 = this.f88532g;
            String conversationID3 = c39857r2.f88587a;
            Intrinsics.checkNotNullParameter(conversationID3, "conversationID");
            v2TIMMessageListGetOption2.setGroupID(StringsKt.startsWith$default(conversationID3, TUIConstants.TUIConversation.CONVERSATION_GROUP_PREFIX, false, 2, (Object) null) ? StringsKt.replaceFirst$default(conversationID3, TUIConstants.TUIConversation.CONVERSATION_GROUP_PREFIX, "", false, 4, (Object) null) : null);
            String conversationID4 = c39857r2.f88587a;
            Intrinsics.checkNotNullParameter(conversationID4, "conversationID");
            v2TIMMessageListGetOption2.setUserID(StringsKt.startsWith$default(conversationID4, TUIConstants.TUIConversation.CONVERSATION_C2C_PREFIX, false, 2, (Object) null) ? StringsKt.replaceFirst$default(conversationID4, TUIConstants.TUIConversation.CONVERSATION_C2C_PREFIX, "", false, 4, (Object) null) : null);
            v2TIMMessageListGetOption2.setCount(messageFetchOption3.getPageCount());
            MessageInfo message5 = messageFetchOption3.getMessage();
            if ((message5 != null ? message5.getRawMessage() : null) != null) {
                v2TIMMessageListGetOption2.setLastMsg(messageFetchOption3.getMessage().getRawMessage());
            } else {
                v2TIMMessageListGetOption2.setLastMsgSeq(messageFetchOption3.getMessageSeq());
            }
            v2TIMMessageListGetOption2.setMessageTypeList(arrayList3);
            v2TIMMessageListGetOption2.setGetType(!arrayList3.isEmpty() ? 4 : 2);
            InterfaceC41729r0 interfaceC41729r0M91102b2 = C41696j.m91102b(interfaceC41709m1, null, null, new C39835g0(this.f88531f, v2TIMMessageListGetOption2, objectRef, null), 3, null);
            this.f88530e = interfaceC41709m1;
            this.f88526a = objectRef5;
            this.f88527b = objectRef;
            this.f88528c = interfaceC41729r0M91102b2;
            this.f88529d = 1;
            objMo91198h = interfaceC41729r0M91102b.mo91198h(this);
            if (objMo91198h != coroutine_suspended) {
                interfaceC41709m0 = interfaceC41709m1;
                objectRef2 = objectRef5;
                interfaceC41729r0 = interfaceC41729r0M91102b2;
            }
            return coroutine_suspended;
        }
        if (i11 == 1) {
            interfaceC41729r0 = (InterfaceC41729r0) this.f88528c;
            Ref.ObjectRef objectRef6 = this.f88527b;
            objectRef2 = this.f88526a;
            interfaceC41709m0 = (InterfaceC41709m0) this.f88530e;
            ResultKt.throwOnFailure(obj);
            objectRef = objectRef6;
            objMo91198h = obj;
        } else if (i11 == 2) {
            Object obj2 = this.f88528c;
            Ref.ObjectRef objectRef7 = this.f88527b;
            Ref.ObjectRef objectRef8 = this.f88526a;
            ResultKt.throwOnFailure(obj);
            objectRef4 = objectRef7;
            objectRef3 = objectRef8;
            value = obj2;
            objMo91198h2 = obj;
            value2 = ((Result) objMo91198h2).getValue();
            if (!Result.m103850isFailureimpl(value) && Result.m103850isFailureimpl(value2)) {
                Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(value);
                Throwable thM103847exceptionOrNullimpl2 = Result.m103847exceptionOrNullimpl(value2);
                StringBuilder sb2 = new StringBuilder("Failed to fetch messages from both sides. Older error: ");
                String str = "Unknown";
                if (thM103847exceptionOrNullimpl == null || (message2 = thM103847exceptionOrNullimpl.getMessage()) == null) {
                    message2 = "Unknown";
                }
                sb2.append(message2);
                sb2.append(", Newer error: ");
                if (thM103847exceptionOrNullimpl2 != null && (message3 = thM103847exceptionOrNullimpl2.getMessage()) != null) {
                    str = message3;
                }
                sb2.append(str);
                this.f88533h.onFailure(6005, sb2.toString());
                return Unit.INSTANCE;
            }
            arrayList = new ArrayList();
            if (Result.m103851isSuccessimpl(value)) {
                arrayList.addAll((Collection) objectRef3.element);
            }
            message = this.f88532g.getMessage();
            if (message == null && (rawMessage = message.getRawMessage()) != null) {
                Boxing.boxBoolean(arrayList.add(rawMessage));
            } else if (!arrayList.isEmpty()) {
                arrayList.remove(CollectionsKt.getLastIndex(arrayList));
            }
            if (Result.m103851isSuccessimpl(value2)) {
                arrayList.addAll((Collection) objectRef4.element);
            }
            C39857r0 c39857r3 = this.f88531f;
            int i13 = C39857r0.f88586n;
            c39857r3.getClass();
            arrayList2 = new ArrayList();
            it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(AbstractC39504l.m88244a((V2TIMMessage) it.next()));
            }
            AbstractC41586e2 abstractC41586e2M91393c = C41782z0.m91393c();
            C39833f0 c39833f0 = new C39833f0(this.f88531f, objectRef3, this.f88532g, objectRef4, arrayList2, this.f88533h, null);
            this.f88530e = null;
            this.f88526a = null;
            this.f88527b = null;
            this.f88528c = null;
            this.f88529d = 3;
        } else {
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
        value = ((Result) objMo91198h).getValue();
        this.f88530e = interfaceC41709m0;
        this.f88526a = objectRef2;
        this.f88527b = objectRef;
        this.f88528c = value;
        this.f88529d = 2;
        objMo91198h2 = interfaceC41729r0.mo91198h(this);
        if (objMo91198h2 != coroutine_suspended) {
            objectRef3 = objectRef2;
            objectRef4 = objectRef;
            value2 = ((Result) objMo91198h2).getValue();
            if (!Result.m103850isFailureimpl(value)) {
            }
            arrayList = new ArrayList();
            if (Result.m103851isSuccessimpl(value)) {
                arrayList.addAll((Collection) objectRef3.element);
            }
            message = this.f88532g.getMessage();
            if (message == null) {
                if (!arrayList.isEmpty()) {
                    arrayList.remove(CollectionsKt.getLastIndex(arrayList));
                }
            } else if (!arrayList.isEmpty()) {
                arrayList.remove(CollectionsKt.getLastIndex(arrayList));
            }
            if (Result.m103851isSuccessimpl(value2)) {
                arrayList.addAll((Collection) objectRef4.element);
            }
            C39857r0 c39857r4 = this.f88531f;
            int i14 = C39857r0.f88586n;
            c39857r4.getClass();
            arrayList2 = new ArrayList();
            it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(AbstractC39504l.m88244a((V2TIMMessage) it.next()));
            }
            AbstractC41586e2 abstractC41586e2M91393c2 = C41782z0.m91393c();
            C39833f0 c39833f1 = new C39833f0(this.f88531f, objectRef3, this.f88532g, objectRef4, arrayList2, this.f88533h, null);
            this.f88530e = null;
            this.f88526a = null;
            this.f88527b = null;
            this.f88528c = null;
            this.f88529d = 3;
        }
        return coroutine_suspended;
    }
}
