package com.kubi.search.searchinitial.topsearch;

import com.kubi.event.api.C12572a;
import com.kubi.operation.api.entity.SearchTopicCurrency;
import com.kubi.operation.api.entity.SearchTopicEntity;
import com.kubi.search.entity.SearchRealtimeEntity;
import com.kubi.search.entity.TopSearchEntityWrap;
import com.kubi.search.utils.SearchInitialBiz;
import com.kubi.search.utils.SearchInitialResult;
import com.tencent.bugly.proguard.C33820nf;
import java.util.List;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41729r0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: TopSearchVM.kt */
/* JADX INFO: loaded from: classes44.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.search.searchinitial.topsearch.TopSearchVM$refreshTopicAndRealTimeSearch$1", m90122f = "TopSearchVM.kt", m90123i = {0}, m90124l = {68}, m90125m = "invokeSuspend", m90126n = {"$this$launch"}, m90127s = {"L$0"})
@SourceDebugExtension({"SMAP\nTopSearchVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopSearchVM.kt\ncom/kubi/search/searchinitial/topsearch/TopSearchVM$refreshTopicAndRealTimeSearch$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,103:1\n1#2:104\n*E\n"})
public final class TopSearchVM$refreshTopicAndRealTimeSearch$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TopSearchVM this$0;

    /* JADX INFO: renamed from: com.kubi.search.searchinitial.topsearch.TopSearchVM$refreshTopicAndRealTimeSearch$1$1 */
    /* JADX INFO: compiled from: TopSearchVM.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.search.searchinitial.topsearch.TopSearchVM$refreshTopicAndRealTimeSearch$1$1", m90122f = "TopSearchVM.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C244241 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ SearchTopicEntity $hotTopicEntity;
        final /* synthetic */ boolean $isSameCoin;
        final /* synthetic */ SearchRealtimeEntity $realtimeEntity;
        int label;
        final /* synthetic */ TopSearchVM this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C244241(SearchRealtimeEntity searchRealtimeEntity, boolean z11, SearchTopicEntity searchTopicEntity, TopSearchVM topSearchVM, Continuation<? super C244241> continuation) {
            super(2, continuation);
            this.$realtimeEntity = searchRealtimeEntity;
            this.$isSameCoin = z11;
            this.$hotTopicEntity = searchTopicEntity;
            this.this$0 = topSearchVM;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C244241(this.$realtimeEntity, this.$isSameCoin, this.$hotTopicEntity, this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C244241) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z11;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.m59302t().setValue(new TopSearchEntityWrap(this.$realtimeEntity, this.$isSameCoin, this.$hotTopicEntity));
                SearchInitialBiz searchInitialBiz = SearchInitialBiz.TopSearch;
                if (this.$realtimeEntity == null && this.$hotTopicEntity == null) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                C12572a.m23695d("search_event_init_finish_hasdata", new SearchInitialResult(searchInitialBiz, z11), 0L, 4, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopSearchVM$refreshTopicAndRealTimeSearch$1(TopSearchVM topSearchVM, Continuation<? super TopSearchVM$refreshTopicAndRealTimeSearch$1> continuation) {
        super(2, continuation);
        this.this$0 = topSearchVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TopSearchVM$refreshTopicAndRealTimeSearch$1 topSearchVM$refreshTopicAndRealTimeSearch$1 = new TopSearchVM$refreshTopicAndRealTimeSearch$1(this.this$0, continuation);
        topSearchVM$refreshTopicAndRealTimeSearch$1.L$0 = obj;
        return topSearchVM$refreshTopicAndRealTimeSearch$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((TopSearchVM$refreshTopicAndRealTimeSearch$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM90345a;
        List<SearchTopicCurrency> currencies;
        SearchTopicCurrency searchTopicCurrency;
        String symbol;
        List listSplit$default;
        String str;
        boolean zEquals = false;
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            List listListOf = CollectionsKt.listOf((Object[]) new InterfaceC41729r0[]{C41696j.m91102b(interfaceC41709m0, null, null, new TopSearchVM$refreshTopicAndRealTimeSearch$1$list$1(this.this$0, null), 3, null), C41696j.m91102b(interfaceC41709m0, null, null, new TopSearchVM$refreshTopicAndRealTimeSearch$1$list$2(this.this$0, null), 3, null)});
            this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
            this.label = 1;
            objM90345a = AwaitKt.m90345a(listListOf, this);
            if (objM90345a == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objM90345a = obj;
        }
        List list = (List) objM90345a;
        Object orNull = CollectionsKt.getOrNull(list, 0);
        SearchRealtimeEntity searchRealtimeEntity = orNull instanceof SearchRealtimeEntity ? (SearchRealtimeEntity) orNull : null;
        Object orNull2 = CollectionsKt.getOrNull(list, 1);
        SearchTopicEntity searchTopicEntity = orNull2 instanceof SearchTopicEntity ? (SearchTopicEntity) orNull2 : null;
        if (searchTopicEntity != null && (currencies = searchTopicEntity.getCurrencies()) != null && (searchTopicCurrency = (SearchTopicCurrency) CollectionsKt.firstOrNull((List) currencies)) != null && (symbol = searchTopicCurrency.getSymbol()) != null && (listSplit$default = StringsKt.split$default((CharSequence) symbol, new String[]{C33820nf.f71144W}, false, 0, 6, (Object) null)) != null && (str = (String) CollectionsKt.firstOrNull(listSplit$default)) != null) {
            zEquals = StringsKt.equals(str, searchRealtimeEntity != null ? searchRealtimeEntity.baseCurrencyName() : null, true);
        }
        TopSearchVM topSearchVM = this.this$0;
        topSearchVM.launchOnMain(new C244241(searchRealtimeEntity, zEquals, searchTopicEntity, topSearchVM, null));
        this.this$0.m59306x(searchRealtimeEntity);
        return Unit.INSTANCE;
    }
}
