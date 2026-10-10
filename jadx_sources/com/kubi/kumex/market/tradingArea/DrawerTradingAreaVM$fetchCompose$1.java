package com.kubi.kumex.market.tradingArea;

import com.tencent.bugly.proguard.C33590cg;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: DrawerTradingAreaVM.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kumex.market.tradingArea.DrawerTradingAreaVM", m90122f = "DrawerTradingAreaVM.kt", m90123i = {1, 2, 2}, m90124l = {42, 46, 56}, m90125m = "fetchCompose", m90126n = {C33590cg.f69440j, C33590cg.f69440j, "index"}, m90127s = {"L$0", "L$0", "I$0"})
public final class DrawerTradingAreaVM$fetchCompose$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DrawerTradingAreaVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawerTradingAreaVM$fetchCompose$1(DrawerTradingAreaVM drawerTradingAreaVM, Continuation<? super DrawerTradingAreaVM$fetchCompose$1> continuation) {
        super(continuation);
        this.this$0 = drawerTradingAreaVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m34454o(this);
    }
}
