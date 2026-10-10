package com.kubi.tradingbotkit.config;

import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.tradingbotkit.entity.GridTradingItemEntity;
import java.util.List;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import u50.C45125a;
import y70.C46392a;

/* JADX INFO: compiled from: TradingBotConfig.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "gridTradingItemList", "", "Lcom/kubi/tradingbotkit/entity/GridTradingItemEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.tradingbotkit.config.TradingBotConfig$saveGridTradingList$2", m90122f = "TradingBotConfig.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nTradingBotConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradingBotConfig.kt\ncom/kubi/tradingbotkit/config/TradingBotConfig$saveGridTradingList$2\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,208:1\n162#2,2:209\n*S KotlinDebug\n*F\n+ 1 TradingBotConfig.kt\ncom/kubi/tradingbotkit/config/TradingBotConfig$saveGridTradingList$2\n*L\n140#1:209,2\n*E\n"})
public final class TradingBotConfig$saveGridTradingList$2 extends SuspendLambda implements Function2<List<? extends GridTradingItemEntity>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;

    public TradingBotConfig$saveGridTradingList$2(Continuation<? super TradingBotConfig$saveGridTradingList$2> continuation) {
        super(2, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends GridTradingItemEntity> list, Continuation<? super Unit> continuation) {
        return invoke2((List<GridTradingItemEntity>) list, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TradingBotConfig$saveGridTradingList$2 tradingBotConfig$saveGridTradingList$2 = new TradingBotConfig$saveGridTradingList$2(continuation);
        tradingBotConfig$saveGridTradingList$2.L$0 = obj;
        return tradingBotConfig$saveGridTradingList$2;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<GridTradingItemEntity> list, Continuation<? super Unit> continuation) {
        return ((TradingBotConfig$saveGridTradingList$2) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (list == null || list.isEmpty()) {
            return Unit.INSTANCE;
        }
        C45125a c45125a = C45125a.f101543a;
        C46392a.m102332o(c45125a.m99750e(c45125a.m99749d(), MultiLanguageManager.f46811g.getLocalString()), list);
        return Unit.INSTANCE;
    }
}
