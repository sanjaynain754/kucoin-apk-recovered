package com.kubi.spot.business.callAuction.mvi;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: CallAuctionViewModel.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.spot.business.callAuction.mvi.CallAuctionViewModel", m90122f = "CallAuctionViewModel.kt", m90123i = {0, 0, 0, 1, 1, 1}, m90124l = {103, 126}, m90125m = "requestGetConfig", m90126n = {"it", "useCountDown", "$i$a$-let-CallAuctionViewModel$requestGetConfig$2", "it", "useCountDown", "$i$a$-let-CallAuctionViewModel$requestGetConfig$2"}, m90127s = {"L$0", "Z$0", "I$0", "L$0", "Z$0", "I$0"})
public final class CallAuctionViewModel$requestGetConfig$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CallAuctionViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallAuctionViewModel$requestGetConfig$1(CallAuctionViewModel callAuctionViewModel, Continuation<? super CallAuctionViewModel$requestGetConfig$1> continuation) {
        super(continuation);
        this.this$0 = callAuctionViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m60545K(false, this);
    }
}
