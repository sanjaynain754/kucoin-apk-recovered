package com.kubi.assets.knb;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: AssetWeb3BridgeManager.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.knb.AssetWeb3BridgeManager", m90122f = "AssetWeb3BridgeManager.kt", m90123i = {0, 0, 1, 1, 1}, m90124l = {95, 97}, m90125m = "getBtcAddress$handleBtcAddress", m90126n = {"chain", "depositMinSize", "chain", "depositMinSize", "data"}, m90127s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
public final class AssetWeb3BridgeManager$getBtcAddress$handleBtcAddress$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AssetWeb3BridgeManager.m17477A(null, null, this);
    }

    public AssetWeb3BridgeManager$getBtcAddress$handleBtcAddress$1(Continuation<? super AssetWeb3BridgeManager$getBtcAddress$handleBtcAddress$1> continuation) {
        super(continuation);
    }
}
