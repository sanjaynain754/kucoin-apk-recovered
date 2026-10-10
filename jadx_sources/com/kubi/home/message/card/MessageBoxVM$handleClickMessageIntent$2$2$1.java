package com.kubi.home.message.card;

import java.util.ArrayList;
import java.util.List;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: MessageBoxVM.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.message.card.MessageBoxVM$handleClickMessageIntent$2$2$1", m90122f = "MessageBoxVM.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nMessageBoxVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageBoxVM.kt\ncom/kubi/home/message/card/MessageBoxVM$handleClickMessageIntent$2$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,292:1\n774#2:293\n865#2,2:294\n*S KotlinDebug\n*F\n+ 1 MessageBoxVM.kt\ncom/kubi/home/message/card/MessageBoxVM$handleClickMessageIntent$2$2$1\n*L\n205#1:293\n205#1:294,2\n*E\n"})
public final class MessageBoxVM$handleClickMessageIntent$2$2$1 extends SuspendLambda implements Function2<Object, Continuation<? super Unit>, Object> {
    final /* synthetic */ MessageBox $box;
    int label;
    final /* synthetic */ MessageBoxVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageBoxVM$handleClickMessageIntent$2$2$1(MessageBoxVM messageBoxVM, MessageBox messageBox, Continuation<? super MessageBoxVM$handleClickMessageIntent$2$2$1> continuation) {
        super(2, continuation);
        this.this$0 = messageBoxVM;
        this.$box = messageBox;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MessageBoxVM$handleClickMessageIntent$2$2$1(this.this$0, this.$box, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
        return ((MessageBoxVM$handleClickMessageIntent$2$2$1) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            List list = CollectionsKt.toList(((MessageBoxUIState) this.this$0.getState()).getData());
            MessageBox messageBox = this.$box;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (!Intrinsics.areEqual(((MessageBox) obj2).getId(), messageBox.getId())) {
                    arrayList.add(obj2);
                }
            }
            this.this$0.m29544s(arrayList);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
