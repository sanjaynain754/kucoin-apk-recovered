package com.kubi.kumex.market.tradingArea;

import com.kubi.kumex.data.market.model.AvailableTradeAreaEntity;
import com.kubi.network.retrofit.utils.C19334f;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: DrawerTradingAreaVM.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0004H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/network/retrofit/utils/RetrofitResult;", "", "Lcom/kubi/kumex/data/market/model/AvailableTradeAreaEntity;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kumex.market.tradingArea.DrawerTradingAreaVM$executeAsync$2$result$1", m90122f = "DrawerTradingAreaVM.kt", m90123i = {}, m90124l = {78}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class DrawerTradingAreaVM$executeAsync$2$result$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super C19334f<List<? extends AvailableTradeAreaEntity>>>, Object> {
    int label;
    final /* synthetic */ DrawerTradingAreaVM this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super C19334f<List<? extends AvailableTradeAreaEntity>>> continuation) {
        return invoke2(interfaceC41709m0, (Continuation<? super C19334f<List<AvailableTradeAreaEntity>>>) continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawerTradingAreaVM$executeAsync$2$result$1(DrawerTradingAreaVM drawerTradingAreaVM, Continuation<? super DrawerTradingAreaVM$executeAsync$2$result$1> continuation) {
        super(2, continuation);
        this.this$0 = drawerTradingAreaVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DrawerTradingAreaVM$executeAsync$2$result$1(this.this$0, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC41709m0 interfaceC41709m0, Continuation<? super C19334f<List<AvailableTradeAreaEntity>>> continuation) {
        return ((DrawerTradingAreaVM$executeAsync$2$result$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        DrawerTradingAreaVM drawerTradingAreaVM = this.this$0;
        this.label = 1;
        Object objM34455r = drawerTradingAreaVM.m34455r(this);
        if (objM34455r == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM34455r;
    }
}
