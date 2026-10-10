package com.kubi.home.message.card;

import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: MessageBoxVM.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.message.card.MessageBoxVM$handleRequestMessageData$1", m90122f = "MessageBoxVM.kt", m90123i = {}, m90124l = {95}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class MessageBoxVM$handleRequestMessageData$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ MessageBoxVM this$0;

    /* JADX INFO: renamed from: com.kubi.home.message.card.MessageBoxVM$handleRequestMessageData$1$1 */
    /* JADX INFO: compiled from: MessageBoxVM.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/home/message/card/MessageBoxData;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.home.message.card.MessageBoxVM$handleRequestMessageData$1$1", m90122f = "MessageBoxVM.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C146681 extends SuspendLambda implements Function2<MessageBoxData, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ MessageBoxVM this$0;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(MessageBoxData messageBoxData, Continuation<? super Unit> continuation) {
            return ((C146681) create(messageBoxData, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C146681(MessageBoxVM messageBoxVM, Continuation<? super C146681> continuation) {
            super(2, continuation);
            this.this$0 = messageBoxVM;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C146681 c146681 = new C146681(this.this$0, continuation);
            c146681.L$0 = obj;
            return c146681;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MessageBoxData messageBoxData = (MessageBoxData) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (messageBoxData == null) {
                messageBoxData = new MessageBoxData(new MessageBoxCardData(null, 1, null));
            }
            this.this$0.m29544s(messageBoxData.getData().getBoxes());
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageBoxVM$handleRequestMessageData$1(MessageBoxVM messageBoxVM, Continuation<? super MessageBoxVM$handleRequestMessageData$1> continuation) {
        super(2, continuation);
        this.this$0 = messageBoxVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MessageBoxVM$handleRequestMessageData$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((MessageBoxVM$handleRequestMessageData$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41634e interfaceC41634eM29551e = MessageApi.m29551e(this.this$0.f25842X, null, 1, null);
            C146681 c146681 = new C146681(this.this$0, null);
            this.label = 1;
            if (RetrofitFlowExKt.m42826g(interfaceC41634eM29551e, false, c146681, this, 1, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
