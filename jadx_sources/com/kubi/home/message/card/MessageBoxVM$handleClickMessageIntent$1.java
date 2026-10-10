package com.kubi.home.message.card;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: MessageBoxVM.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.message.card.MessageBoxVM", m90122f = "MessageBoxVM.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {204}, m90125m = "handleClickMessageIntent", m90126n = {"intent", "box", "$this$handleClickMessageIntent_u24lambda_u2412_u24lambda_u2411", "$i$a$-let-MessageBoxVM$handleClickMessageIntent$2", "$i$a$-apply-MessageBoxVM$handleClickMessageIntent$2$2"}, m90127s = {"L$0", "L$1", "L$3", "I$0", "I$1"})
public final class MessageBoxVM$handleClickMessageIntent$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MessageBoxVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageBoxVM$handleClickMessageIntent$1(MessageBoxVM messageBoxVM, Continuation<? super MessageBoxVM$handleClickMessageIntent$1> continuation) {
        super(continuation);
        this.this$0 = messageBoxVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m29541o(null, this);
    }
}
