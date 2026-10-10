package io.trtc.tuikit.atomicxcore.impl.conversation;

import com.tencent.imsdk.p128v2.V2TIMConversationListFilter;
import io.trtc.tuikit.atomicxcore.api.conversation.ConversationMarkType;
import java.util.List;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.internal.Ref;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.conversation.J */
/* JADX INFO: loaded from: classes61.dex */
public final class C39611J extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public V2TIMConversationListFilter f87993a;

    /* JADX INFO: renamed from: b */
    public List f87994b;

    /* JADX INFO: renamed from: c */
    public Ref.LongRef f87995c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f87996d;

    /* JADX INFO: renamed from: e */
    public int f87997e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39611J(ContinuationImpl continuationImpl) {
        super(continuationImpl);
        C39617P c39617p = C39617P.f88005a;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f87996d = obj;
        this.f87997e |= Integer.MIN_VALUE;
        return C39617P.m88285a((ConversationMarkType) null, this);
    }
}
