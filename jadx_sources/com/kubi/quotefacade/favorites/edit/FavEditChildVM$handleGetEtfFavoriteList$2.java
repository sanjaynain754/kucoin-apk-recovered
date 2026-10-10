package com.kubi.quotefacade.favorites.edit;

import com.kubi.quotefacade.entity.FavMarketQuoteEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: FavEditChildVM.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "Lcom/kubi/quotefacade/entity/FavMarketQuoteEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.favorites.edit.FavEditChildVM$handleGetEtfFavoriteList$2", m90122f = "FavEditChildVM.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nFavEditChildVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FavEditChildVM.kt\ncom/kubi/quotefacade/favorites/edit/FavEditChildVM$handleGetEtfFavoriteList$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,280:1\n1563#2:281\n1634#2,3:282\n*S KotlinDebug\n*F\n+ 1 FavEditChildVM.kt\ncom/kubi/quotefacade/favorites/edit/FavEditChildVM$handleGetEtfFavoriteList$2\n*L\n144#1:281\n144#1:282,3\n*E\n"})
public final class FavEditChildVM$handleGetEtfFavoriteList$2 extends SuspendLambda implements Function2<List<? extends FavMarketQuoteEntity>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FavEditChildVM this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends FavMarketQuoteEntity> list, Continuation<? super Unit> continuation) {
        return invoke2((List<FavMarketQuoteEntity>) list, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavEditChildVM$handleGetEtfFavoriteList$2(FavEditChildVM favEditChildVM, Continuation<? super FavEditChildVM$handleGetEtfFavoriteList$2> continuation) {
        super(2, continuation);
        this.this$0 = favEditChildVM;
    }

    /* JADX INFO: renamed from: f */
    public static final UIState m51613f(UIState uIState) {
        return UIState.copy$default(uIState, null, new Object(), null, 5, null);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FavEditChildVM$handleGetEtfFavoriteList$2 favEditChildVM$handleGetEtfFavoriteList$2 = new FavEditChildVM$handleGetEtfFavoriteList$2(this.this$0, continuation);
        favEditChildVM$handleGetEtfFavoriteList$2.L$0 = obj;
        return favEditChildVM$handleGetEtfFavoriteList$2;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<FavMarketQuoteEntity> list, Continuation<? super Unit> continuation) {
        return ((FavEditChildVM$handleGetEtfFavoriteList$2) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (list.isEmpty()) {
            Boxing.boxBoolean(this.this$0.updateState(new Function1() { // from class: com.kubi.quotefacade.favorites.edit.r
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return FavEditChildVM$handleGetEtfFavoriteList$2.m51613f((UIState) obj2);
                }
            }));
        } else {
            FavEditChildVM favEditChildVM = this.this$0;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(favEditChildVM.m51611z((FavMarketQuoteEntity) it.next()));
            }
            this.this$0.m51606O(arrayList);
        }
        return Unit.INSTANCE;
    }
}
