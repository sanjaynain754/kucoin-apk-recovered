package com.kubi.kucoin.manager;

import java.util.List;
import java.util.Map;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: KCSocketProvider.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kucoin.manager.KCSocketProvider$subscribeBatch$1", m90122f = "KCSocketProvider.kt", m90123i = {}, m90124l = {131, 132}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class KCSocketProvider$subscribeBatch$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $bufferTime;
    final /* synthetic */ KCSocketTopicDescriptor<Entity> $descriptor;
    final /* synthetic */ Function1<Map<String, ? extends Entity>, Unit> $onData;
    final /* synthetic */ List<String> $topics;
    int label;
    final /* synthetic */ KCSocketProvider<Entity> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KCSocketProvider$subscribeBatch$1(KCSocketProvider<Entity> kCSocketProvider, KCSocketTopicDescriptor<Entity> kCSocketTopicDescriptor, List<String> list, long j11, Function1<? super Map<String, ? extends Entity>, Unit> function1, Continuation<? super KCSocketProvider$subscribeBatch$1> continuation) {
        super(2, continuation);
        this.this$0 = kCSocketProvider;
        this.$descriptor = kCSocketTopicDescriptor;
        this.$topics = list;
        this.$bufferTime = j11;
        this.$onData = function1;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KCSocketProvider$subscribeBatch$1(this.this$0, this.$descriptor, this.$topics, this.$bufferTime, this.$onData, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCSocketProvider$subscribeBatch$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        if (r3.m32511h(r4, r5, r6, r8, r10) == r0) goto L15;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
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
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        KCSocketProvider<Entity> kCSocketProvider = this.this$0;
        KCSocketTopicDescriptor<Entity> kCSocketTopicDescriptor = this.$descriptor;
        this.label = 1;
        if (kCSocketProvider.m32512i(kCSocketTopicDescriptor, this) != coroutine_suspended) {
        }
        return coroutine_suspended;
        KCSocketProvider<Entity> kCSocketProvider2 = this.this$0;
        List<String> list = this.$topics;
        KCSocketTopicDescriptor<Entity> kCSocketTopicDescriptor2 = this.$descriptor;
        long j11 = this.$bufferTime;
        Function1<Map<String, ? extends Entity>, Unit> function1 = this.$onData;
        this.label = 2;
    }
}
