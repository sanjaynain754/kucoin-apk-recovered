package com.kubi.kucoin.manager;

import com.tencent.qcloud.tuicore.TUIConstants;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: Add missing generic type declarations: [Entity] */
/* JADX INFO: compiled from: KCSocketProvider.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u0001H\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Entity", "", TUIConstants.TIMPush.NOTIFICATION.ENTITY}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kucoin.manager.KCSocketProvider$collectFromTopics$upstream$3", m90122f = "KCSocketProvider.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class KCSocketProvider$collectFromTopics$upstream$3<Entity> extends SuspendLambda implements Function2<Entity, Continuation<? super Unit>, Object> {
    final /* synthetic */ KCSocketTopicDescriptor<Entity> $descriptor;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ KCSocketProvider<Entity> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KCSocketProvider$collectFromTopics$upstream$3(KCSocketProvider<Entity> kCSocketProvider, KCSocketTopicDescriptor<Entity> kCSocketTopicDescriptor, Continuation<? super KCSocketProvider$collectFromTopics$upstream$3> continuation) {
        super(2, continuation);
        this.this$0 = kCSocketProvider;
        this.$descriptor = kCSocketTopicDescriptor;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        KCSocketProvider$collectFromTopics$upstream$3 kCSocketProvider$collectFromTopics$upstream$3 = new KCSocketProvider$collectFromTopics$upstream$3(this.this$0, this.$descriptor, continuation);
        kCSocketProvider$collectFromTopics$upstream$3.L$0 = obj;
        return kCSocketProvider$collectFromTopics$upstream$3;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Entity entity, Continuation<? super Unit> continuation) {
        return ((KCSocketProvider$collectFromTopics$upstream$3) create(entity, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2 = this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (obj2 == null) {
            return Unit.INSTANCE;
        }
        this.this$0.f28075e.put(this.$descriptor.mo32501d((Entity) obj2), obj2);
        return Unit.INSTANCE;
    }
}
