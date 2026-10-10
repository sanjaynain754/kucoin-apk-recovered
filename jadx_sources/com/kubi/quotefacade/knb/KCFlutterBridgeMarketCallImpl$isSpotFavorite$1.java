package com.kubi.quotefacade.knb;

import com.kubi.data.entity.TradeItemBean;
import com.kubi.quotefacade.repository.QuoteMarketRepository;
import com.kubi.sdk.protocol.ProtocolException;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCFlutterBridgeMarketCallImpl.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.knb.KCFlutterBridgeMarketCallImpl$isSpotFavorite$1", m90122f = "KCFlutterBridgeMarketCallImpl.kt", m90123i = {}, m90124l = {208}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class KCFlutterBridgeMarketCallImpl$isSpotFavorite$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<Boolean, ProtocolException, Unit> $callback;
    final /* synthetic */ String $symbol;
    int label;
    final /* synthetic */ KCFlutterBridgeMarketCallImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KCFlutterBridgeMarketCallImpl$isSpotFavorite$1(KCFlutterBridgeMarketCallImpl kCFlutterBridgeMarketCallImpl, String str, Function2<? super Boolean, ? super ProtocolException, Unit> function2, Continuation<? super KCFlutterBridgeMarketCallImpl$isSpotFavorite$1> continuation) {
        super(2, continuation);
        this.this$0 = kCFlutterBridgeMarketCallImpl;
        this.$symbol = str;
        this.$callback = function2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KCFlutterBridgeMarketCallImpl$isSpotFavorite$1(this.this$0, this.$symbol, this.$callback, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCFlutterBridgeMarketCallImpl$isSpotFavorite$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0053  */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String symbol;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            QuoteMarketRepository f42152a = this.this$0.getF42152a();
            String str = this.$symbol;
            Integer numBoxInt = Boxing.boxInt(1);
            this.label = 1;
            obj = f42152a.m52979N(str, "", numBoxInt, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        TradeItemBean tradeItemBean = (TradeItemBean) CollectionsKt.firstOrNull((List) obj);
        if (tradeItemBean == null || !tradeItemBean.isFavor()) {
            if (tradeItemBean != null) {
                symbol = tradeItemBean.getSymbol();
            } else {
                symbol = null;
            }
            if (Intrinsics.areEqual(symbol, this.$symbol)) {
                this.$callback.invoke(Boxing.boxBoolean(true), null);
            } else {
                this.$callback.invoke(Boxing.boxBoolean(false), null);
            }
        } else {
            this.$callback.invoke(Boxing.boxBoolean(true), null);
        }
        return Unit.INSTANCE;
    }
}
