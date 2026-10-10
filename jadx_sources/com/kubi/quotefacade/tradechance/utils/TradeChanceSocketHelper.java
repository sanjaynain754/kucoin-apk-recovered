package com.kubi.quotefacade.tradechance.utils;

import com.kubi.data.entity.WsMarketSnapshotEntity;
import com.kubi.quotefacade.entity.ChanceHotRankEntity;
import com.kubi.quotefacade.entity.ChanceHotRankItem;
import com.kubi.quotefacade.entity.QuoteWSEntity;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.DowngradeExKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p844zu.InterfaceC46926c;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: TradeChanceSocketHelper.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u00050\u000bH\u0086@¢\u0006\u0002\u0010\u000eJ2\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00102\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u000bH\u0086@¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/quotefacade/tradechance/utils/TradeChanceSocketHelper;", "", "<init>", "()V", "subscribeGemBoxPush", "", "wsApi", "Lcom/kubi/quotefacade/api/ITradeChanceApi;", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/quotefacade/entity/ChanceGemBoxEntity;", "onData", "Lkotlin/Function1;", "", "Lcom/kubi/quotefacade/entity/ChanceGemBoxCurrency;", "(Lcom/kubi/quotefacade/api/ITradeChanceApi;Lcom/kubi/quotefacade/entity/ChanceGemBoxEntity;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "subscribeHotRankPush", "Lcom/kubi/quotefacade/entity/ChanceHotRankEntity;", "(Lcom/kubi/quotefacade/api/ITradeChanceApi;Lcom/kubi/quotefacade/entity/ChanceHotRankEntity;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TradeChanceSocketHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final TradeChanceSocketHelper f42694a = new TradeChanceSocketHelper();

    /* JADX INFO: renamed from: com.kubi.quotefacade.tradechance.utils.TradeChanceSocketHelper$a */
    /* JADX INFO: compiled from: TradeChanceSocketHelper.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nTradeChanceSocketHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeChanceSocketHelper.kt\ncom/kubi/quotefacade/tradechance/utils/TradeChanceSocketHelper$subscribeHotRankPush$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,81:1\n1#2:82\n1788#3,4:83\n*S KotlinDebug\n*F\n+ 1 TradeChanceSocketHelper.kt\ncom/kubi/quotefacade/tradechance/utils/TradeChanceSocketHelper$subscribeHotRankPush$3\n*L\n68#1:83,4\n*E\n"})
    public static final class C22580a<T> implements InterfaceC41635f {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ List<ChanceHotRankItem> f42695b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ChanceHotRankEntity f42696c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Function1<ChanceHotRankEntity, Unit> f42697d;

        /* JADX INFO: renamed from: f */
        public static final Unit m53249f(List list, ChanceHotRankEntity chanceHotRankEntity, Function1 function1) {
            int i11 = 0;
            if (list == null || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (C41014a.m89922G(((ChanceHotRankItem) it.next()).getChangeRate(), null, 1, null).compareTo(BigDecimal.ZERO) >= 0 && (i11 = i11 + 1) < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
            }
            int size = list.size() - i11;
            chanceHotRankEntity.setItems(list);
            chanceHotRankEntity.setUpNum(Integer.valueOf(i11));
            chanceHotRankEntity.setDownNum(Integer.valueOf(size));
            function1.invoke(chanceHotRankEntity);
            C22586f.m53265j("[ws]subscribeHotRankPush: items=" + list.size() + ", upNum=" + i11 + ", downNum=" + size);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C22580a(List<ChanceHotRankItem> list, ChanceHotRankEntity chanceHotRankEntity, Function1<? super ChanceHotRankEntity, Unit> function1) {
            this.f42695b = list;
            this.f42696c = chanceHotRankEntity;
            this.f42697d = function1;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object emit(QuoteWSEntity quoteWSEntity, Continuation<? super Unit> continuation) {
            WsMarketSnapshotEntity data;
            T next;
            if (quoteWSEntity != null && (data = quoteWSEntity.getData()) != null) {
                final List<ChanceHotRankItem> list = this.f42695b;
                final ChanceHotRankEntity chanceHotRankEntity = this.f42696c;
                final Function1<ChanceHotRankEntity, Unit> function1 = this.f42697d;
                Iterator<T> it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next = (T) null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.areEqual(((ChanceHotRankItem) next).getName() + "-USDT", data.getSymbolCode()));
                ChanceHotRankItem chanceHotRankItem = next;
                if (chanceHotRankItem != null) {
                    chanceHotRankItem.setPrice(new BigDecimal(String.valueOf(data.getLastTradedPrice())));
                    chanceHotRankItem.setChangeRate(new BigDecimal(String.valueOf(data.getChangeRate())));
                    chanceHotRankItem.setVolValue(new BigDecimal(String.valueOf(data.getVolValue())));
                }
                C22586f.m53261f(0L, new Function0() { // from class: com.kubi.quotefacade.tradechance.utils.d
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TradeChanceSocketHelper.C22580a.m53249f(list, chanceHotRankEntity, function1);
                    }
                }, 1, null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final CharSequence m53246c(ChanceHotRankItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return C27041f.m66668h(it.getName()) + "-USDT";
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00f8, code lost:
    
        if (r9.collect(r10, r1) == r3) goto L31;
     */
    @Nullable
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m53247b(@NotNull InterfaceC46926c interfaceC46926c, @NotNull ChanceHotRankEntity chanceHotRankEntity, @NotNull Function1<? super ChanceHotRankEntity, Unit> function1, @NotNull Continuation<? super Unit> continuation) {
        TradeChanceSocketHelper$subscribeHotRankPush$1 tradeChanceSocketHelper$subscribeHotRankPush$1;
        InterfaceC46926c interfaceC46926c2;
        ChanceHotRankEntity chanceHotRankEntity2;
        Function1<? super ChanceHotRankEntity, Unit> function2;
        if (continuation instanceof TradeChanceSocketHelper$subscribeHotRankPush$1) {
            tradeChanceSocketHelper$subscribeHotRankPush$1 = (TradeChanceSocketHelper$subscribeHotRankPush$1) continuation;
            int i11 = tradeChanceSocketHelper$subscribeHotRankPush$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                tradeChanceSocketHelper$subscribeHotRankPush$1.label = i11 - Integer.MIN_VALUE;
            } else {
                tradeChanceSocketHelper$subscribeHotRankPush$1 = new TradeChanceSocketHelper$subscribeHotRankPush$1(this, continuation);
            }
        } else {
            tradeChanceSocketHelper$subscribeHotRankPush$1 = new TradeChanceSocketHelper$subscribeHotRankPush$1(this, continuation);
        }
        Object obj = tradeChanceSocketHelper$subscribeHotRankPush$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = tradeChanceSocketHelper$subscribeHotRankPush$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            List<ChanceHotRankItem> items = chanceHotRankEntity.getItems();
            if (items == null) {
                items = CollectionsKt.emptyList();
            }
            if (items.isEmpty()) {
                return Unit.INSTANCE;
            }
            interfaceC46926c2 = interfaceC46926c;
            tradeChanceSocketHelper$subscribeHotRankPush$1.L$0 = interfaceC46926c2;
            chanceHotRankEntity2 = chanceHotRankEntity;
            tradeChanceSocketHelper$subscribeHotRankPush$1.L$1 = chanceHotRankEntity2;
            function2 = function1;
            tradeChanceSocketHelper$subscribeHotRankPush$1.L$2 = function2;
            tradeChanceSocketHelper$subscribeHotRankPush$1.label = 1;
            if (DelayKt.m90350b(1000L, tradeChanceSocketHelper$subscribeHotRankPush$1) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            Function1<? super ChanceHotRankEntity, Unit> function3 = (Function1) tradeChanceSocketHelper$subscribeHotRankPush$1.L$2;
            ChanceHotRankEntity chanceHotRankEntity3 = (ChanceHotRankEntity) tradeChanceSocketHelper$subscribeHotRankPush$1.L$1;
            InterfaceC46926c interfaceC46926c3 = (InterfaceC46926c) tradeChanceSocketHelper$subscribeHotRankPush$1.L$0;
            ResultKt.throwOnFailure(obj);
            interfaceC46926c2 = interfaceC46926c3;
            function2 = function3;
            chanceHotRankEntity2 = chanceHotRankEntity3;
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
        List<ChanceHotRankItem> items2 = chanceHotRankEntity2.getItems();
        if (items2 == null) {
            items2 = CollectionsKt.emptyList();
        }
        List mutableList = CollectionsKt.toMutableList((Collection) C27024b.m66558a(items2));
        String strM66668h = C27041f.m66668h(CollectionsKt.joinToString$default(mutableList, ",", null, null, 0, null, new Function1() { // from class: com.kubi.quotefacade.tradechance.utils.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return TradeChanceSocketHelper.m53246c((ChanceHotRankItem) obj2);
            }
        }, 30, null));
        InterfaceC41634e interfaceC41634eM90917h = C41636g.m90917h(interfaceC46926c2.m103388d(DowngradeExKt.m66551u("/market/snapshot_app:%s", new Object[]{strM66668h}, null, 2, null)), new TradeChanceSocketHelper$subscribeHotRankPush$2(null));
        C22580a c22580a = new C22580a(mutableList, chanceHotRankEntity2, function2);
        tradeChanceSocketHelper$subscribeHotRankPush$1.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC46926c2);
        tradeChanceSocketHelper$subscribeHotRankPush$1.L$1 = SpillingKt.nullOutSpilledVariable(chanceHotRankEntity2);
        tradeChanceSocketHelper$subscribeHotRankPush$1.L$2 = SpillingKt.nullOutSpilledVariable(function2);
        tradeChanceSocketHelper$subscribeHotRankPush$1.L$3 = SpillingKt.nullOutSpilledVariable(mutableList);
        tradeChanceSocketHelper$subscribeHotRankPush$1.L$4 = SpillingKt.nullOutSpilledVariable(strM66668h);
        tradeChanceSocketHelper$subscribeHotRankPush$1.label = 2;
    }
}
