package com.kubi.wallet.service;

import androidx.media3.extractor.text.ttml.TtmlNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: WalletLaunchSPI.kt */
/* JADX INFO: loaded from: classes55.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.wallet.service.WalletLaunchSPI", m90122f = "WalletLaunchSPI.kt", m90123i = {0, 0, 0, 0, 0, 0, 0}, m90124l = {64}, m90125m = "showTransition", m90126n = {"activity", "viewStub", TtmlNode.TAG_LAYOUT, "switchLayout", "comparable", "config", "toWallet"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "Z$0"})
public final class WalletLaunchSPI$showTransition$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WalletLaunchSPI this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletLaunchSPI$showTransition$1(WalletLaunchSPI walletLaunchSPI, Continuation<? super WalletLaunchSPI$showTransition$1> continuation) {
        super(continuation);
        this.this$0 = walletLaunchSPI;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo66965h(null, null, false, this);
    }
}
