package com.kubi.wallet.p119ui;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: WalletFlutterActivity.kt */
/* JADX INFO: loaded from: classes55.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.wallet.ui.WalletFlutterActivity", m90122f = "WalletFlutterActivity.kt", m90123i = {0, 1}, m90124l = {200, 202}, m90125m = "onFlutterDisplayed", m90126n = {"binding", "binding"}, m90127s = {"L$0", "L$0"})
public final class WalletFlutterActivity$onFlutterDisplayed$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WalletFlutterActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletFlutterActivity$onFlutterDisplayed$1(WalletFlutterActivity walletFlutterActivity, Continuation<? super WalletFlutterActivity$onFlutterDisplayed$1> continuation) {
        super(continuation);
        this.this$0 = walletFlutterActivity;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m66978c0(this);
    }
}
