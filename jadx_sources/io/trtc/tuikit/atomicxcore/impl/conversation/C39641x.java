package io.trtc.tuikit.atomicxcore.impl.conversation;

import com.tencent.imsdk.p128v2.V2TIMConversationListFilter;
import com.tencent.imsdk.p128v2.V2TIMManager;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.conversation.ConversationFetchOption;
import io.trtc.tuikit.atomicxcore.api.conversation.ConversationListFilter;
import io.trtc.tuikit.atomicxcore.api.conversation.ConversationMarkType;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.conversation.x */
/* JADX INFO: loaded from: classes61.dex */
public final class C39641x extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f88057a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f88058b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C39606E f88059c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ CompletionHandler f88060d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39641x(C39606E c39606e, CompletionHandler completionHandler, Continuation continuation) {
        super(2, continuation);
        this.f88059c = c39606e;
        this.f88060d = completionHandler;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C39641x c39641x = new C39641x(this.f88059c, this.f88060d, continuation);
        c39641x.f88058b = obj;
        return c39641x;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C39641x) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        ConversationListFilter filter;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f88057a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.f88058b;
            C39617P c39617p = C39617P.f88005a;
            this.f88058b = interfaceC41709m0;
            this.f88057a = 1;
            if (c39617p.m88289a(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        ConversationFetchOption conversationFetchOption = this.f88059c.f87980h;
        if (conversationFetchOption != null && (filter = conversationFetchOption.getFilter()) != null) {
            C39606E c39606e = this.f88059c;
            CompletionHandler completionHandler = this.f88060d;
            c39606e.getClass();
            V2TIMConversationListFilter v2TIMConversationListFilter = new V2TIMConversationListFilter();
            v2TIMConversationListFilter.setConversationType(filter.getType().getValue());
            String conversationGroup = filter.getConversationGroup();
            if (conversationGroup != null) {
                v2TIMConversationListFilter.setConversationGroup(conversationGroup);
            }
            ConversationMarkType markType = filter.getMarkType();
            if (markType != null) {
                v2TIMConversationListFilter.setMarkType(markType.getValue());
            }
            Boolean hasUnreadCount = filter.getHasUnreadCount();
            if (hasUnreadCount != null) {
                v2TIMConversationListFilter.setHasUnreadCount(hasUnreadCount.booleanValue());
            }
            Boolean hasGroupAtInfo = filter.getHasGroupAtInfo();
            if (hasGroupAtInfo != null) {
                v2TIMConversationListFilter.setHasGroupAtInfo(hasGroupAtInfo.booleanValue());
            }
            ConversationListFilter conversationListFilter = c39606e.f87983k;
            if (conversationListFilter != null) {
                c39606e.m88284a(conversationListFilter);
            }
            V2TIMManager.getConversationManager().getUnreadMessageCountByFilter(v2TIMConversationListFilter, new C39642y(c39606e, filter, completionHandler));
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            C39606E c39606e2 = this.f88059c;
            CompletionHandler completionHandler2 = this.f88060d;
            ConversationListFilter conversationListFilter2 = c39606e2.f87983k;
            if (conversationListFilter2 != null) {
                c39606e2.m88284a(conversationListFilter2);
            }
            V2TIMManager.getConversationManager().getTotalUnreadMessageCount(new C39640w(c39606e2, completionHandler2));
        }
        return Unit.INSTANCE;
    }
}
