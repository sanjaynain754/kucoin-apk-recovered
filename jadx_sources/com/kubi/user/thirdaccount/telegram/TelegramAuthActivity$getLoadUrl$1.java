package com.kubi.user.thirdaccount.telegram;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: TelegramAuthActivity.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.user.thirdaccount.telegram.TelegramAuthActivity", m90122f = "TelegramAuthActivity.kt", m90123i = {}, m90124l = {252}, m90125m = "getLoadUrl", m90126n = {}, m90127s = {})
public final class TelegramAuthActivity$getLoadUrl$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TelegramAuthActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TelegramAuthActivity$getLoadUrl$1(TelegramAuthActivity telegramAuthActivity, Continuation<? super TelegramAuthActivity$getLoadUrl$1> continuation) {
        super(continuation);
        this.this$0 = telegramAuthActivity;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m65808f0(this);
    }
}
