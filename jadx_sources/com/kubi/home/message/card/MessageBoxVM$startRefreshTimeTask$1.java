package com.kubi.home.message.card;

import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: MessageBoxVM.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.message.card.MessageBoxVM$startRefreshTimeTask$1", m90122f = "MessageBoxVM.kt", m90123i = {0}, m90124l = {71}, m90125m = "invokeSuspend", m90126n = {"$this$launchOnIO"}, m90127s = {"L$0"})
public final class MessageBoxVM$startRefreshTimeTask$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MessageBoxVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageBoxVM$startRefreshTimeTask$1(MessageBoxVM messageBoxVM, Continuation<? super MessageBoxVM$startRefreshTimeTask$1> continuation) {
        super(2, continuation);
        this.this$0 = messageBoxVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MessageBoxVM$startRefreshTimeTask$1 messageBoxVM$startRefreshTimeTask$1 = new MessageBoxVM$startRefreshTimeTask$1(this.this$0, continuation);
        messageBoxVM$startRefreshTimeTask$1.L$0 = obj;
        return messageBoxVM$startRefreshTimeTask$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((MessageBoxVM$startRefreshTimeTask$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b A[RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:12:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x002b
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.L$0
            kotlinx.coroutines.m0 r0 = (kotlinx.coroutines.InterfaceC41709m0) r0
            java.lang.Object r1 = p852kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r6.label
            r3 = 1
            if (r2 == 0) goto L1b
            if (r2 != r3) goto L13
            p852kotlin.ResultKt.throwOnFailure(r7)
            goto L2c
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1b:
            p852kotlin.ResultKt.throwOnFailure(r7)
        L1e:
            r6.L$0 = r0
            r6.label = r3
            r4 = 60000(0xea60, double:2.9644E-319)
            java.lang.Object r7 = kotlinx.coroutines.DelayKt.m90350b(r4, r6)
            if (r7 != r1) goto L2c
            return r1
        L2c:
            com.kubi.home.message.card.MessageBoxVM r7 = r6.this$0
            com.kubi.mvi.state.f r2 = r7.getState()
            com.kubi.home.message.card.MessageBoxContract$MessageBoxUIState r2 = (com.kubi.home.message.card.MessageBoxUIState) r2
            r4 = 0
            com.kubi.home.message.card.MessageBoxContract$MessageBoxUIState r2 = com.kubi.home.message.card.MessageBoxUIState.copy$default(r2, r4, r3, r4)
            java.util.List r2 = r2.getData()
            com.kubi.home.message.card.MessageBoxVM.m29532i(r7, r2)
            java.lang.String r7 = "MessageBox定时刷新事件"
            java.lang.String r2 = dj.C36716a.m82241d(r0)
            p058cj.C4988a.m5286a(r7, r2)
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kubi.home.message.card.MessageBoxVM$startRefreshTimeTask$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
