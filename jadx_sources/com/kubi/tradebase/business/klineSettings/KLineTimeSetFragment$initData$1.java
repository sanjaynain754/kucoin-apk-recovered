package com.kubi.tradebase.business.klineSettings;

import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: KLineTimeSetFragment.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.tradebase.business.klineSettings.KLineTimeSetFragment", m90122f = "KLineTimeSetFragment.kt", m90123i = {0, 0, 0, 0, 0, 0}, m90124l = {74}, m90125m = "initData", m90126n = {"data", "$this$forEach$iv", "element$iv", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "$i$f$forEach", "$i$a$-forEach-KLineTimeSetFragment$initData$2"}, m90127s = {"L$0", "L$1", "L$3", "L$4", "I$0", "I$1"})
public final class KLineTimeSetFragment$initData$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ KLineTimeSetFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KLineTimeSetFragment$initData$1(KLineTimeSetFragment kLineTimeSetFragment, Continuation<? super KLineTimeSetFragment$initData$1> continuation) {
        super(continuation);
        this.this$0 = kLineTimeSetFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m63143r3(this);
    }
}
