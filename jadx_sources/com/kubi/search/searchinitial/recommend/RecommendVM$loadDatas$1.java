package com.kubi.search.searchinitial.recommend;

import com.kubi.data.entity.TradeItemBean;
import com.kubi.event.api.C12572a;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.search.entity.ContractTradeItemBean;
import com.kubi.search.entity.ExtendEntity;
import com.kubi.search.entity.FutureEntity;
import com.kubi.search.entity.SearchRecommendEntity;
import com.kubi.search.entity.SearchRecommendWrap;
import com.kubi.search.entity.SpotEntity;
import com.kubi.search.utils.SearchExKt;
import com.kubi.search.utils.SearchInitialBiz;
import com.kubi.search.utils.SearchInitialResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: RecommendVM.kt */
/* JADX INFO: loaded from: classes44.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.search.searchinitial.recommend.RecommendVM$loadDatas$1", m90122f = "RecommendVM.kt", m90123i = {}, m90124l = {56}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nRecommendVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecommendVM.kt\ncom/kubi/search/searchinitial/recommend/RecommendVM$loadDatas$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,94:1\n1563#2:95\n1634#2,3:96\n1563#2:99\n1634#2,3:100\n*S KotlinDebug\n*F\n+ 1 RecommendVM.kt\ncom/kubi/search/searchinitial/recommend/RecommendVM$loadDatas$1\n*L\n57#1:95\n57#1:96,3\n59#1:99\n59#1:100,3\n*E\n"})
public final class RecommendVM$loadDatas$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ RecommendVM this$0;

    /* JADX INFO: renamed from: com.kubi.search.searchinitial.recommend.RecommendVM$loadDatas$1$1 */
    /* JADX INFO: compiled from: RecommendVM.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.search.searchinitial.recommend.RecommendVM$loadDatas$1$1", m90122f = "RecommendVM.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C244091 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<ExtendEntity> $earnList;
        final /* synthetic */ List<ContractTradeItemBean> $futureList;
        final /* synthetic */ List<TradeItemBean> $spotList;
        int label;
        final /* synthetic */ RecommendVM this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C244091(RecommendVM recommendVM, List<? extends TradeItemBean> list, List<ContractTradeItemBean> list2, List<ExtendEntity> list3, Continuation<? super C244091> continuation) {
            super(2, continuation);
            this.this$0 = recommendVM;
            this.$spotList = list;
            this.$futureList = list2;
            this.$earnList = list3;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C244091(this.this$0, this.$spotList, this.$futureList, this.$earnList, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C244091) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z11;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.m59275o().setValue(new SearchRecommendWrap(this.$spotList, this.$futureList, this.$earnList));
                SearchInitialBiz searchInitialBiz = SearchInitialBiz.Recommend;
                if (this.$spotList.isEmpty() && this.$futureList.isEmpty() && this.$earnList.isEmpty()) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                C12572a.m23695d("search_event_init_finish_hasdata", new SearchInitialResult(searchInitialBiz, z11), 0L, 4, null);
                this.this$0.m59278r();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecommendVM$loadDatas$1(RecommendVM recommendVM, Continuation<? super RecommendVM$loadDatas$1> continuation) {
        super(2, continuation);
        this.this$0 = recommendVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RecommendVM$loadDatas$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((RecommendVM$loadDatas$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List<SpotEntity> listEmptyList;
        List listEmptyList2;
        List listEmptyList3;
        List<FutureEntity> listEmptyList4;
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
            InterfaceC41634e<SearchRecommendEntity> interfaceC41634eM59627a = this.this$0.f48951V.m59627a();
            this.label = 1;
            obj = RetrofitFlowExKt.m42830k(interfaceC41634eM59627a, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        SearchRecommendEntity searchRecommendEntity = (SearchRecommendEntity) obj;
        List<ExtendEntity> listEmptyList5 = null;
        if (searchRecommendEntity != null) {
            listEmptyList = searchRecommendEntity.getSpot();
        } else {
            listEmptyList = null;
        }
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List listTake = CollectionsKt.take(listEmptyList, 10);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listTake, 10));
        Iterator it = listTake.iterator();
        while (it.hasNext()) {
            arrayList.add(((SpotEntity) it.next()).toTradeItemBean());
        }
        if (C24129b.m58030b(SiteVisibleConfigKey.Futures)) {
            if (searchRecommendEntity != null) {
                listEmptyList4 = searchRecommendEntity.getFeature();
            } else {
                listEmptyList4 = null;
            }
            if (listEmptyList4 == null) {
                listEmptyList4 = CollectionsKt.emptyList();
            }
            List listTake2 = CollectionsKt.take(listEmptyList4, 5);
            listEmptyList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listTake2, 10));
            Iterator it2 = listTake2.iterator();
            while (it2.hasNext()) {
                listEmptyList2.add(((FutureEntity) it2.next()).toTradeItemBean());
            }
        } else {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        List list = listEmptyList2;
        if (C24129b.m58030b(SiteVisibleConfigKey.Financing) && !SearchExKt.m59516J()) {
            if (searchRecommendEntity != null) {
                listEmptyList5 = searchRecommendEntity.getEarn();
            }
            if (listEmptyList5 == null) {
                listEmptyList5 = CollectionsKt.emptyList();
            }
            listEmptyList3 = CollectionsKt.take(listEmptyList5, 5);
        } else {
            listEmptyList3 = CollectionsKt.emptyList();
        }
        List list2 = listEmptyList3;
        RecommendVM recommendVM = this.this$0;
        recommendVM.launchOnMain(new C244091(recommendVM, arrayList, list, list2, null));
        return Unit.INSTANCE;
    }
}
