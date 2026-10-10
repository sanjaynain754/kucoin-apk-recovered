package com.kubi.quotefacade.service;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.kubi.p110rn.p111ui.KCBridgeRejecterError;
import com.kubi.quotefacade.entity.CurrencyFilterTransferData;
import com.kubi.utils.C27099x;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import o00.C42911a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: QuoteFacadeService.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.service.QuoteFacadeService$openSymbolToggleDialog$1$1", m90122f = "QuoteFacadeService.kt", m90123i = {0, 0, 0, 0, 0, 0}, m90124l = {TypedValues.AttributesType.TYPE_PIVOT_TARGET}, m90125m = "invokeSuspend", m90126n = {"it", "this_$iv", "json$iv", "$completion$iv", "$i$a$-let-QuoteFacadeService$openSymbolToggleDialog$1$1$1", "$i$f$fromJsonOrNull"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0", "I$1"})
@SourceDebugExtension({"SMAP\nQuoteFacadeService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuoteFacadeService.kt\ncom/kubi/quotefacade/service/QuoteFacadeService$openSymbolToggleDialog$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,314:1\n1#2:315\n196#3,3:316\n*S KotlinDebug\n*F\n+ 1 QuoteFacadeService.kt\ncom/kubi/quotefacade/service/QuoteFacadeService$openSymbolToggleDialog$1$1\n*L\n128#1:316,3\n*E\n"})
public final class QuoteFacadeService$openSymbolToggleDialog$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<CurrencyFilterTransferData, KCBridgeRejecterError, Unit> $callback;
    final /* synthetic */ String $data;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public QuoteFacadeService$openSymbolToggleDialog$1$1(Function2<? super CurrencyFilterTransferData, ? super KCBridgeRejecterError, Unit> function2, String str, Continuation<? super QuoteFacadeService$openSymbolToggleDialog$1$1> continuation) {
        super(2, continuation);
        this.$callback = function2;
        this.$data = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new QuoteFacadeService$openSymbolToggleDialog$1$1(this.$callback, this.$data, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((QuoteFacadeService$openSymbolToggleDialog$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Function2<CurrencyFilterTransferData, KCBridgeRejecterError, Unit> function2;
        CurrencyFilterTransferData currencyFilterTransferData;
        Function2<CurrencyFilterTransferData, KCBridgeRejecterError, Unit> function3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                function3 = (Function2) this.L$4;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            function2 = this.$callback;
            String str = this.$data;
            if (str != null) {
                C27099x c27099x = C27099x.f54458a;
                InterfaceC41634e interfaceC41634eM90890N = C41636g.m90890N(C41636g.m90887K(new C22529x6660315c(str, null)), C42911a.m94120b());
                this.L$0 = SpillingKt.nullOutSpilledVariable(str);
                this.L$1 = SpillingKt.nullOutSpilledVariable(c27099x);
                this.L$2 = SpillingKt.nullOutSpilledVariable(str);
                this.L$3 = SpillingKt.nullOutSpilledVariable(this);
                this.L$4 = function2;
                this.I$0 = 0;
                this.I$1 = 0;
                this.label = 1;
                Object objM90914f0 = C41636g.m90914f0(interfaceC41634eM90890N, this);
                if (objM90914f0 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                function3 = function2;
                obj = objM90914f0;
            } else {
                currencyFilterTransferData = null;
            }
            function2.invoke(currencyFilterTransferData, null);
            return Unit.INSTANCE;
        }
        Function2<CurrencyFilterTransferData, KCBridgeRejecterError, Unit> function4 = function3;
        currencyFilterTransferData = (CurrencyFilterTransferData) obj;
        function2 = function4;
        function2.invoke(currencyFilterTransferData, null);
        return Unit.INSTANCE;
    }
}
