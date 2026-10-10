package com.kubi.spot.quote.coin;

import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.spot.quote.market.info.CoinWrapEntity;
import com.kubi.spot.quote.market.info.MarketCoinInfo;
import com.kubi.utils.extensions.C27025c;
import e20.InterfaceC37053d;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p402kf.C41016c;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KuCoinCoinViewModel.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.spot.quote.coin.KuCoinCoinViewModel$getInfo$1", m90122f = "KuCoinCoinViewModel.kt", m90123i = {0, 1, 1}, m90124l = {31, 39}, m90125m = "invokeSuspend", m90126n = {"$i$a$-runCatching-KuCoinCoinViewModel$getInfo$1$1", "info", "$i$a$-runCatching-KuCoinCoinViewModel$getInfo$1$1"}, m90127s = {"I$0", "L$1", "I$0"})
public final class KuCoinCoinViewModel$getInfo$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $coin;
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ KuCoinCoinViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KuCoinCoinViewModel$getInfo$1(KuCoinCoinViewModel kuCoinCoinViewModel, String str, Continuation<? super KuCoinCoinViewModel$getInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = kuCoinCoinViewModel;
        this.$coin = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KuCoinCoinViewModel$getInfo$1(this.this$0, this.$coin, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KuCoinCoinViewModel$getInfo$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0146  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b4, code lost:
    
        if (r2 == r9) goto L31;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objM103844constructorimpl;
        KuCoinCoinViewModel kuCoinCoinViewModel;
        Throwable thM103847exceptionOrNullimpl;
        int i11;
        Object objM82912K;
        String str;
        KuCoinCoinViewModel kuCoinCoinViewModel2;
        BaseEntity baseEntity;
        Boolean boolBoxBoolean;
        Object objM82924M;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.label;
        try {
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2) {
                        baseEntity = (BaseEntity) this.L$1;
                        kuCoinCoinViewModel2 = (KuCoinCoinViewModel) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        objM82924M = obj;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    int i13 = this.I$0;
                    String str2 = (String) this.L$1;
                    KuCoinCoinViewModel kuCoinCoinViewModel3 = (KuCoinCoinViewModel) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    str = str2;
                    kuCoinCoinViewModel2 = kuCoinCoinViewModel3;
                    i11 = i13;
                    objM82912K = obj;
                }
                BaseEntity baseEntity2 = (BaseEntity) objM82924M;
                if (baseEntity2.getSuccess()) {
                    kuCoinCoinViewModel2.m62202r().postValue(new CoinWrapEntity((MarketCoinInfo) baseEntity.getData(), (List) baseEntity2.getData()));
                } else {
                    kuCoinCoinViewModel2.m62202r().postValue(new CoinWrapEntity((MarketCoinInfo) baseEntity.getData(), null));
                    C19331c.m42836c(new ApiException(baseEntity2.getCode(), baseEntity2.getMsg(), baseEntity2.getData()), null, 2, null);
                }
                objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
                kuCoinCoinViewModel = this.this$0;
                thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                if (thM103847exceptionOrNullimpl != null) {
                    kuCoinCoinViewModel.m62202r().postValue(null);
                    C19331c.m42836c(thM103847exceptionOrNullimpl, null, 2, null);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            KuCoinCoinViewModel kuCoinCoinViewModel4 = this.this$0;
            String str3 = this.$coin;
            Result.Companion companion = Result.INSTANCE;
            String strM89965c = C41016c.m89965c();
            Intrinsics.checkNotNullExpressionValue(strM89965c, "getCurrentCurrency(...)");
            String localString = MultiLanguageManager.f46811g.getLocalString();
            this.L$0 = kuCoinCoinViewModel4;
            this.L$1 = str3;
            i11 = 0;
            this.I$0 = 0;
            this.label = 1;
            objM82912K = InterfaceC37053d.m82912K(kuCoinCoinViewModel4.m62201q(), str3, str3 + "-USDT", strM89965c, localString, null, this, 16, null);
            if (objM82912K != coroutine_suspended) {
                str = str3;
                kuCoinCoinViewModel2 = kuCoinCoinViewModel4;
            }
            return coroutine_suspended;
            baseEntity = (BaseEntity) objM82912K;
            if (baseEntity.getSuccess()) {
                MarketCoinInfo marketCoinInfo = (MarketCoinInfo) baseEntity.getData();
                if (marketCoinInfo != null) {
                    boolBoxBoolean = Boxing.boxBoolean(marketCoinInfo.isKuCoin());
                } else {
                    boolBoxBoolean = null;
                }
                if (C27025c.m66566d(boolBoxBoolean)) {
                    InterfaceC37053d interfaceC37053dM62201q = kuCoinCoinViewModel2.m62201q();
                    this.L$0 = kuCoinCoinViewModel2;
                    this.L$1 = baseEntity;
                    this.I$0 = i11;
                    this.label = 2;
                    objM82924M = interfaceC37053dM62201q.m82924M(str, this);
                } else {
                    kuCoinCoinViewModel2.m62202r().postValue(new CoinWrapEntity((MarketCoinInfo) baseEntity.getData(), null));
                }
            } else {
                kuCoinCoinViewModel2.m62202r().postValue(null);
                C19331c.m42836c(new ApiException(baseEntity.getCode(), baseEntity.getMsg(), baseEntity.getData()), null, 2, null);
            }
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        kuCoinCoinViewModel = this.this$0;
        thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            kuCoinCoinViewModel.m62202r().postValue(null);
            C19331c.m42836c(thM103847exceptionOrNullimpl, null, 2, null);
        }
        return Unit.INSTANCE;
    }
}
