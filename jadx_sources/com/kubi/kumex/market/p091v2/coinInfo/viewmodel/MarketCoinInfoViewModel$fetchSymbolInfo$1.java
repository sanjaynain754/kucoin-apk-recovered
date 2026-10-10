package com.kubi.kumex.market.p091v2.coinInfo.viewmodel;

import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.utils.CoroutineExKt;
import com.kubi.utils.extensions.C27041f;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p236em.C37214b;
import p852kotlin.ExceptionsKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import th.InterfaceC44980d;

/* JADX INFO: compiled from: MarketCoinInfoViewModel.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kumex.market.v2.coinInfo.viewmodel.MarketCoinInfoViewModel$fetchSymbolInfo$1", m90122f = "MarketCoinInfoViewModel.kt", m90123i = {}, m90124l = {82}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class MarketCoinInfoViewModel$fetchSymbolInfo$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $symbol;
    int label;
    final /* synthetic */ MarketCoinInfoViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.kumex.market.v2.coinInfo.viewmodel.MarketCoinInfoViewModel$fetchSymbolInfo$1$1 */
    /* JADX INFO: compiled from: MarketCoinInfoViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, m90084d2 = {"<anonymous>", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.kumex.market.v2.coinInfo.viewmodel.MarketCoinInfoViewModel$fetchSymbolInfo$1$1", m90122f = "MarketCoinInfoViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C164211 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ String $symbol;
        int label;
        final /* synthetic */ MarketCoinInfoViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C164211(String str, MarketCoinInfoViewModel marketCoinInfoViewModel, Continuation<? super C164211> continuation) {
            super(1, continuation);
            this.$symbol = str;
            this.this$0 = marketCoinInfoViewModel;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C164211(this.$symbol, this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C164211) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            String strM66677q;
            SymbolInfoEntity symbolInfoEntity;
            String quoteCurrency;
            String strM66677q2;
            String spotCurrency;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                RepositoryServiceLocator repositoryServiceLocator = RepositoryServiceLocator.f19236a;
                ContractEntity contractEntityM99529O = InterfaceC44980d.m99529O(repositoryServiceLocator.m20288g(), this.$symbol, false, 2, null);
                StringBuilder sb2 = new StringBuilder();
                String str = "";
                if (contractEntityM99529O == null || (spotCurrency = contractEntityM99529O.getSpotCurrency()) == null || (strM66677q = C27041f.m66677q(spotCurrency)) == null) {
                    strM66677q = "";
                }
                sb2.append(strM66677q);
                sb2.append('-');
                if (contractEntityM99529O != null && (quoteCurrency = contractEntityM99529O.getQuoteCurrency()) != null && (strM66677q2 = C27041f.m66677q(quoteCurrency)) != null) {
                    str = strM66677q2;
                }
                sb2.append(str);
                ArrayList<SymbolInfoEntity> arrayListMo24803c = repositoryServiceLocator.m20286e().mo24803c(sb2.toString());
                if (arrayListMo24803c == null || (symbolInfoEntity = (SymbolInfoEntity) CollectionsKt.firstOrNull((List) arrayListMo24803c)) == null) {
                    return null;
                }
                this.this$0.f29755Z.postValue(symbolInfoEntity.getCode());
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketCoinInfoViewModel$fetchSymbolInfo$1(String str, MarketCoinInfoViewModel marketCoinInfoViewModel, Continuation<? super MarketCoinInfoViewModel$fetchSymbolInfo$1> continuation) {
        super(2, continuation);
        this.$symbol = str;
        this.this$0 = marketCoinInfoViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketCoinInfoViewModel$fetchSymbolInfo$1(this.$symbol, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((MarketCoinInfoViewModel$fetchSymbolInfo$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final Unit m35098f(Throwable th2) {
        C37214b.m83255a(th2, ExceptionsKt.stackTraceToString(th2));
        return Unit.INSTANCE;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
            C164211 c164211 = new C164211(this.$symbol, this.this$0, null);
            Function1 function1 = new Function1() { // from class: com.kubi.kumex.market.v2.coinInfo.viewmodel.a
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return MarketCoinInfoViewModel$fetchSymbolInfo$1.m35098f((Throwable) obj2);
                }
            };
            this.label = 1;
            if (CoroutineExKt.m36471a(c164211, function1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
