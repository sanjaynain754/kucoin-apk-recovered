package com.kubi.quotefacade.favorites;

import com.kubi.data.entity.TradeItemBean;
import com.kubi.quotefacade.entity.FavMarketQuoteEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p414kv.C41988d;
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
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: FavCommonViewModel.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "Lcom/kubi/quotefacade/entity/FavMarketQuoteEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.favorites.FavCommonViewModel$handleFavData$6", m90122f = "FavCommonViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nFavCommonViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FavCommonViewModel.kt\ncom/kubi/quotefacade/favorites/FavCommonViewModel$handleFavData$6\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,364:1\n1563#2:365\n1634#2,3:366\n*S KotlinDebug\n*F\n+ 1 FavCommonViewModel.kt\ncom/kubi/quotefacade/favorites/FavCommonViewModel$handleFavData$6\n*L\n198#1:365\n198#1:366,3\n*E\n"})
public final class FavCommonViewModel$handleFavData$6 extends SuspendLambda implements Function2<List<? extends FavMarketQuoteEntity>, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<TradeItemBean> $resultList;
    final /* synthetic */ C41988d $tradeBeanMapper;
    /* synthetic */ Object L$0;
    int label;

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends FavMarketQuoteEntity> list, Continuation<? super Unit> continuation) {
        return invoke2((List<FavMarketQuoteEntity>) list, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavCommonViewModel$handleFavData$6(C41988d c41988d, List<TradeItemBean> list, Continuation<? super FavCommonViewModel$handleFavData$6> continuation) {
        super(2, continuation);
        this.$tradeBeanMapper = c41988d;
        this.$resultList = list;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FavCommonViewModel$handleFavData$6 favCommonViewModel$handleFavData$6 = new FavCommonViewModel$handleFavData$6(this.$tradeBeanMapper, this.$resultList, continuation);
        favCommonViewModel$handleFavData$6.L$0 = obj;
        return favCommonViewModel$handleFavData$6;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<FavMarketQuoteEntity> list, Continuation<? super Unit> continuation) {
        return ((FavCommonViewModel$handleFavData$6) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        C41988d c41988d = this.$tradeBeanMapper;
        List<TradeItemBean> list2 = this.$resultList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Boxing.boxBoolean(list2.add(c41988d.mo51723a((FavMarketQuoteEntity) it.next()))));
        }
        return Unit.INSTANCE;
    }
}
