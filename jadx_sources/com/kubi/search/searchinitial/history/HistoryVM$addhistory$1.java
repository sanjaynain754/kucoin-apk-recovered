package com.kubi.search.searchinitial.history;

import com.kubi.search.entity.SearchHistoryBean;
import com.kubi.search.entity.SearchItemData;
import com.kubi.search.utils.SearchKV;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: HistoryVM.kt */
/* JADX INFO: loaded from: classes44.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.search.searchinitial.history.HistoryVM$addhistory$1", m90122f = "HistoryVM.kt", m90123i = {0}, m90124l = {58}, m90125m = "invokeSuspend", m90126n = {"bean"}, m90127s = {"L$0"})
@SourceDebugExtension({"SMAP\nHistoryVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HistoryVM.kt\ncom/kubi/search/searchinitial/history/HistoryVM$addhistory$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,97:1\n827#2:98\n855#2,2:99\n*S KotlinDebug\n*F\n+ 1 HistoryVM.kt\ncom/kubi/search/searchinitial/history/HistoryVM$addhistory$1\n*L\n58#1:98\n58#1:99,2\n*E\n"})
public final class HistoryVM$addhistory$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ SearchItemData $data;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ HistoryVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HistoryVM$addhistory$1(SearchItemData searchItemData, HistoryVM historyVM, Continuation<? super HistoryVM$addhistory$1> continuation) {
        super(2, continuation);
        this.$data = searchItemData;
        this.this$0 = historyVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HistoryVM$addhistory$1(this.$data, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((HistoryVM$addhistory$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        HistoryVM historyVM;
        SearchHistoryBean searchHistoryBean;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                historyVM = (HistoryVM) this.L$1;
                searchHistoryBean = (SearchHistoryBean) this.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            SearchHistoryBean searchHistoryBean2 = new SearchHistoryBean(this.$data.getCategory(), this.$data.getSymbol(), this.$data.getShowSymbol(), this.$data.getBeanEarn(), this.$data.getBeanWeb3());
            HistoryVM historyVM2 = this.this$0;
            SearchKV searchKV = SearchKV.f49147a;
            this.L$0 = searchHistoryBean2;
            this.L$1 = historyVM2;
            this.label = 1;
            Object objM59590b = searchKV.m59590b(this);
            if (objM59590b == coroutine_suspended) {
                return coroutine_suspended;
            }
            historyVM = historyVM2;
            obj = objM59590b;
            searchHistoryBean = searchHistoryBean2;
        }
        List listM59233p = historyVM.m59233p((List) obj);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listM59233p) {
            if (!Intrinsics.areEqual(searchHistoryBean.getSymbol(), ((SearchHistoryBean) obj2).getSymbol())) {
                arrayList.add(obj2);
            }
        }
        List mutableList = CollectionsKt.toMutableList((Collection) arrayList);
        mutableList.add(0, searchHistoryBean);
        List<SearchHistoryBean> listTake = CollectionsKt.take(mutableList, 6);
        SearchKV.f49147a.m59591c(listTake);
        this.this$0.m59236u(listTake);
        return Unit.INSTANCE;
    }
}
