package com.kubi.kumex.market.p091v2.coinInfo.viewmodel;

import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.market.p091v2.coinInfo.entity.MarketCoinInfo;
import com.kubi.kumex.market.p091v2.coinInfo.entity.TagEntity;
import com.kubi.utils.extensions.C27041f;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41729r0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import th.InterfaceC44980d;

/* JADX INFO: compiled from: MarketCoinInfoViewModel.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kumex.market.v2.coinInfo.viewmodel.MarketCoinInfoViewModel$fetchCoinInfo$1", m90122f = "MarketCoinInfoViewModel.kt", m90123i = {0, 0, 0, 0, 1, 1, 1, 1, 1}, m90124l = {56, 60}, m90125m = "invokeSuspend", m90126n = {"$this$launch", "contract", "spotSymbol", "baseCurrency", "$this$launch", "contract", "spotSymbol", "baseCurrency", "marketCoinInfo"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4"})
public final class MarketCoinInfoViewModel$fetchCoinInfo$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $symbol;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ MarketCoinInfoViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketCoinInfoViewModel$fetchCoinInfo$1(String str, MarketCoinInfoViewModel marketCoinInfoViewModel, Continuation<? super MarketCoinInfoViewModel$fetchCoinInfo$1> continuation) {
        super(2, continuation);
        this.$symbol = str;
        this.this$0 = marketCoinInfoViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MarketCoinInfoViewModel$fetchCoinInfo$1 marketCoinInfoViewModel$fetchCoinInfo$1 = new MarketCoinInfoViewModel$fetchCoinInfo$1(this.$symbol, this.this$0, continuation);
        marketCoinInfoViewModel$fetchCoinInfo$1.L$0 = obj;
        return marketCoinInfoViewModel$fetchCoinInfo$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((MarketCoinInfoViewModel$fetchCoinInfo$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0106 A[Catch: CancellationException -> 0x0046, all -> 0x011d, TryCatch #4 {CancellationException -> 0x0046, all -> 0x011d, blocks: (B:48:0x00ea, B:50:0x00f0, B:53:0x00f7, B:55:0x010f, B:54:0x0106, B:12:0x003e, B:38:0x00b1, B:17:0x004d, B:20:0x0062, B:22:0x0068, B:25:0x006f, B:27:0x007d, B:29:0x0083, B:34:0x008d), top: B:67:0x000f }] */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String strM66677q;
        String string;
        String str;
        ContractEntity contractEntity;
        String baseCurrency;
        String strM66677q2;
        String spotCurrency;
        MarketCoinInfo marketCoinInfo;
        MarketCoinInfo marketCoinInfo2;
        String str2;
        TagEntity tagEntity;
        String marketCap;
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            try {
                if (i11 == 0) {
                    ResultKt.throwOnFailure(obj);
                    ContractEntity contractEntityM99529O = InterfaceC44980d.m99529O(RepositoryServiceLocator.f19236a.m20288g(), this.$symbol, false, 2, null);
                    StringBuilder sb2 = new StringBuilder();
                    if (contractEntityM99529O == null || (spotCurrency = contractEntityM99529O.getSpotCurrency()) == null || (strM66677q = C27041f.m66677q(spotCurrency)) == null) {
                        strM66677q = "";
                    }
                    sb2.append(strM66677q);
                    sb2.append("-USDT");
                    string = sb2.toString();
                    str = (contractEntityM99529O == null || (baseCurrency = contractEntityM99529O.getBaseCurrency()) == null || (strM66677q2 = C27041f.m66677q(baseCurrency)) == null) ? "" : strM66677q2;
                    InterfaceC41729r0 interfaceC41729r0M91102b = C41696j.m91102b(interfaceC41709m0, null, null, new MarketCoinInfoViewModel$fetchCoinInfo$1$marketCoinInfo$1(str, string, null), 3, null);
                    this.L$0 = interfaceC41709m0;
                    this.L$1 = SpillingKt.nullOutSpilledVariable(contractEntityM99529O);
                    this.L$2 = string;
                    this.L$3 = str;
                    this.label = 1;
                    Object objMo91198h = interfaceC41729r0M91102b.mo91198h(this);
                    if (objMo91198h != coroutine_suspended) {
                        contractEntity = contractEntityM99529O;
                        obj = objMo91198h;
                    }
                    return coroutine_suspended;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    marketCoinInfo2 = (MarketCoinInfo) this.L$4;
                    str2 = (String) this.L$3;
                    try {
                        ResultKt.throwOnFailure(obj);
                        tagEntity = (TagEntity) obj;
                    } catch (Throwable unused) {
                        tagEntity = null;
                    }
                    if (marketCoinInfo2 != null || (marketCap = marketCoinInfo2.getMarketCap()) == null || marketCap.length() == 0) {
                        this.this$0.f29757b0.postValue(null);
                    } else {
                        this.this$0.f29757b0.postValue(new MarketCoinInfoWrapper(str2, marketCoinInfo2, tagEntity));
                    }
                    this.this$0.f29751V.postValue(Boxing.boxBoolean(false));
                    return Unit.INSTANCE;
                }
                String str3 = (String) this.L$3;
                String str4 = (String) this.L$2;
                ContractEntity contractEntity2 = (ContractEntity) this.L$1;
                ResultKt.throwOnFailure(obj);
                str = str3;
                string = str4;
                contractEntity = contractEntity2;
                InterfaceC41729r0 interfaceC41729r0M91102b2 = C41696j.m91102b(interfaceC41709m0, null, null, new MarketCoinInfoViewModel$fetchCoinInfo$1$symbolMarketTags$1(string, null), 3, null);
                this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                this.L$1 = SpillingKt.nullOutSpilledVariable(contractEntity);
                this.L$2 = SpillingKt.nullOutSpilledVariable(string);
                this.L$3 = str;
                this.L$4 = marketCoinInfo;
                this.label = 2;
                Object objMo91198h2 = interfaceC41729r0M91102b2.mo91198h(this);
                if (objMo91198h2 != coroutine_suspended) {
                    marketCoinInfo2 = marketCoinInfo;
                    obj = objMo91198h2;
                    str2 = str;
                    tagEntity = (TagEntity) obj;
                    if (marketCoinInfo2 != null) {
                        this.this$0.f29757b0.postValue(null);
                    } else {
                        this.this$0.f29757b0.postValue(null);
                    }
                    this.this$0.f29751V.postValue(Boxing.boxBoolean(false));
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            } catch (Throwable unused2) {
                marketCoinInfo2 = marketCoinInfo;
                str2 = str;
                tagEntity = null;
            }
            marketCoinInfo = (MarketCoinInfo) obj;
        } catch (CancellationException e11) {
            this.this$0.f29753X.postValue(Boxing.boxBoolean(true));
            throw e11;
        } catch (Throwable unused3) {
            this.this$0.f29753X.postValue(Boxing.boxBoolean(true));
        }
    }
}
