package com.kubi.assets.knb;

import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: AssetWeb3BridgeManager.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.knb.AssetWeb3BridgeManager", m90122f = "AssetWeb3BridgeManager.kt", m90123i = {0, 0, 0, 0, 0, 0, 0, 0}, m90124l = {113}, m90125m = "getBtcAddress", m90126n = {TUIConstants.TUIChat.CALL_BACK, "addressTypes", "allAddresses", "$this$forEach$iv", "element$iv", "it", "$i$f$forEach", "$i$a$-forEach-AssetWeb3BridgeManager$getBtcAddress$2"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "L$5", "L$6", "I$0", "I$1"})
public final class AssetWeb3BridgeManager$getBtcAddress$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AssetWeb3BridgeManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetWeb3BridgeManager$getBtcAddress$1(AssetWeb3BridgeManager assetWeb3BridgeManager, Continuation<? super AssetWeb3BridgeManager$getBtcAddress$1> continuation) {
        super(continuation);
        this.this$0 = assetWeb3BridgeManager;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m17510z(null, null, this);
    }
}
