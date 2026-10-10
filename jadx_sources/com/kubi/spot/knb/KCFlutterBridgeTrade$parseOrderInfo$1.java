package com.kubi.spot.knb;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: KCFlutterBridgeTrade.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.spot.knb.KCFlutterBridgeTrade", m90122f = "KCFlutterBridgeTrade.kt", m90123i = {0, 0, 0, 0, 0, 0}, m90124l = {163}, m90125m = "parseOrderInfo", m90126n = {"orderInfo", "this_$iv", "json$iv", "$completion$iv", "$i$a$-runCatching-KCFlutterBridgeTrade$parseOrderInfo$2", "$i$f$fromJsonOrNull"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0", "I$1"})
public final class KCFlutterBridgeTrade$parseOrderInfo$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ KCFlutterBridgeTrade this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KCFlutterBridgeTrade$parseOrderInfo$1(KCFlutterBridgeTrade kCFlutterBridgeTrade, Continuation<? super KCFlutterBridgeTrade$parseOrderInfo$1> continuation) {
        super(continuation);
        this.this$0 = kCFlutterBridgeTrade;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m62153h(null, this);
    }
}
