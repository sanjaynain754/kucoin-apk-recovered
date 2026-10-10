package com.kubi.search.searchresult.datasource;

import com.kubi.search.entity.SearchEntity;
import com.kubi.search.entity.SearchItemData;
import com.kubi.search.entity.SearchItemDepositInfo;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.kubi.search.utils.SearchDurationHelper;
import com.kubi.utils.extensions.C27041f;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.trtc.uikit.livekit.p180kc.data.entity.ClickCardReport;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41729r0;
import o00.C42911a;
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
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: RemoteSearchDataSource.kt */
/* JADX INFO: loaded from: classes44.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", DbParams.KEY_CHANNEL_RESULT, "", "Lcom/kubi/search/entity/SearchEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.search.searchresult.datasource.RemoteSearchDataSource$doSearch$loadTime$1$1", m90122f = "RemoteSearchDataSource.kt", m90123i = {0}, m90124l = {55}, m90125m = "invokeSuspend", m90126n = {DbParams.KEY_CHANNEL_RESULT}, m90127s = {"L$0"})
public final class RemoteSearchDataSource$doSearch$loadTime$1$1 extends SuspendLambda implements Function2<List<? extends SearchEntity>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.ObjectRef<List<SearchItemData>> $alpha;
    final /* synthetic */ Ref.ObjectRef<SearchItemDepositInfo> $depositInfo;
    final /* synthetic */ Ref.ObjectRef<List<SearchItemData>> $earns;
    final /* synthetic */ Ref.ObjectRef<List<SearchItemData>> $futures;
    final /* synthetic */ String $key;
    final /* synthetic */ Ref.ObjectRef<String> $searchResultType;
    final /* synthetic */ Ref.ObjectRef<List<SearchItemData>> $spots;
    final /* synthetic */ Ref.BooleanRef $success;
    final /* synthetic */ Ref.ObjectRef<List<SearchItemData>> $web3;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RemoteSearchDataSource this$0;

    /* JADX INFO: renamed from: com.kubi.search.searchresult.datasource.RemoteSearchDataSource$doSearch$loadTime$1$1$1 */
    /* JADX INFO: compiled from: RemoteSearchDataSource.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.search.searchresult.datasource.RemoteSearchDataSource$doSearch$loadTime$1$1$1", m90122f = "RemoteSearchDataSource.kt", m90123i = {0, 0, 0, 0, 0, 0}, m90124l = {78}, m90125m = "invokeSuspend", m90126n = {"$this$withContext", "remoteSpot", "remoteFuture", "remoteEarn", "remoteWeb3", "remoteAlpha"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
    @SourceDebugExtension({"SMAP\nRemoteSearchDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteSearchDataSource.kt\ncom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,170:1\n1869#2,2:171\n1#3:173\n*S KotlinDebug\n*F\n+ 1 RemoteSearchDataSource.kt\ncom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1\n*L\n61#1:171,2\n*E\n"})
    public static final class C244531 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef<List<SearchItemData>> $alpha;
        final /* synthetic */ Ref.ObjectRef<SearchItemDepositInfo> $depositInfo;
        final /* synthetic */ Ref.ObjectRef<List<SearchItemData>> $earns;
        final /* synthetic */ Ref.ObjectRef<List<SearchItemData>> $futures;
        final /* synthetic */ String $key;
        final /* synthetic */ List<SearchEntity> $result;
        final /* synthetic */ Ref.ObjectRef<List<SearchItemData>> $spots;
        final /* synthetic */ Ref.ObjectRef<List<SearchItemData>> $web3;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        final /* synthetic */ RemoteSearchDataSource this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C244531(List<SearchEntity> list, String str, Ref.ObjectRef<SearchItemDepositInfo> objectRef, RemoteSearchDataSource remoteSearchDataSource, Ref.ObjectRef<List<SearchItemData>> objectRef2, Ref.ObjectRef<List<SearchItemData>> objectRef3, Ref.ObjectRef<List<SearchItemData>> objectRef4, Ref.ObjectRef<List<SearchItemData>> objectRef5, Ref.ObjectRef<List<SearchItemData>> objectRef6, Continuation<? super C244531> continuation) {
            super(2, continuation);
            this.$result = list;
            this.$key = str;
            this.$depositInfo = objectRef;
            this.this$0 = remoteSearchDataSource;
            this.$spots = objectRef2;
            this.$futures = objectRef3;
            this.$earns = objectRef4;
            this.$web3 = objectRef5;
            this.$alpha = objectRef6;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C244531 c244531 = new C244531(this.$result, this.$key, this.$depositInfo, this.this$0, this.$spots, this.$futures, this.$earns, this.$web3, this.$alpha, continuation);
            c244531.L$0 = obj;
            return c244531;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C244531) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i11;
            int i12;
            int i13;
            int i14;
            Object objM90345a;
            String lowerCase;
            T t11;
            T t12;
            T t13;
            T t14;
            List list;
            List list2;
            List list3;
            List list4;
            List list5;
            InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i15 = this.label;
            T t15 = 0;
            if (i15 == 0) {
                ResultKt.throwOnFailure(obj);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                List<SearchEntity> list6 = this.$result;
                if (list6 != null) {
                    for (SearchEntity searchEntity : list6) {
                        String resourceType = searchEntity.getResourceType();
                        if (resourceType != null) {
                            Locale US = Locale.US;
                            Intrinsics.checkNotNullExpressionValue(US, "US");
                            lowerCase = resourceType.toLowerCase(US);
                            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                        } else {
                            lowerCase = null;
                        }
                        if (lowerCase != null) {
                            switch (lowerCase.hashCode()) {
                                case -1263170109:
                                    if (lowerCase.equals(ClickCardReport.ReportData.CARD_TYPE_FUTURE)) {
                                        arrayList2.add(searchEntity);
                                    }
                                    break;
                                case 3105752:
                                    if (lowerCase.equals(SearchCategory$Companion.EARN)) {
                                        arrayList3.add(searchEntity);
                                    }
                                    break;
                                case 3537154:
                                    if (lowerCase.equals(SearchCategory$Companion.SPOT)) {
                                        arrayList.add(searchEntity);
                                    }
                                    break;
                                case 3645279:
                                    if (lowerCase.equals(SearchCategory$Companion.WEB3)) {
                                        arrayList4.add(searchEntity);
                                    }
                                    break;
                                case 92909918:
                                    if (lowerCase.equals("alpha")) {
                                        arrayList5.add(searchEntity);
                                    }
                                    break;
                            }
                        }
                    }
                }
                i11 = 4;
                i12 = 5;
                i13 = 3;
                i14 = 2;
                SearchDurationHelper.f49161a.m59624j(this.$key, "data_classify");
                List listListOf = CollectionsKt.listOf((Object[]) new InterfaceC41729r0[]{C41696j.m91102b(interfaceC41709m0, null, null, new RemoteSearchDataSource$doSearch$loadTime$1$1$1$lists$1(this.this$0, arrayList, null), 3, null), C41696j.m91102b(interfaceC41709m0, null, null, new RemoteSearchDataSource$doSearch$loadTime$1$1$1$lists$2(this.this$0, arrayList2, null), 3, null), C41696j.m91102b(interfaceC41709m0, null, null, new RemoteSearchDataSource$doSearch$loadTime$1$1$1$lists$3(this.this$0, arrayList3, null), 3, null), C41696j.m91102b(interfaceC41709m0, null, null, new RemoteSearchDataSource$doSearch$loadTime$1$1$1$lists$4(this.this$0, arrayList4, null), 3, null), C41696j.m91102b(interfaceC41709m0, null, null, new RemoteSearchDataSource$doSearch$loadTime$1$1$1$lists$5(this.this$0, arrayList, null), 3, null), C41696j.m91102b(interfaceC41709m0, null, null, new RemoteSearchDataSource$doSearch$loadTime$1$1$1$lists$6(this.this$0, arrayList5, null), 3, null)});
                this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                this.L$1 = SpillingKt.nullOutSpilledVariable(arrayList);
                this.L$2 = SpillingKt.nullOutSpilledVariable(arrayList2);
                this.L$3 = SpillingKt.nullOutSpilledVariable(arrayList3);
                this.L$4 = SpillingKt.nullOutSpilledVariable(arrayList4);
                this.L$5 = SpillingKt.nullOutSpilledVariable(arrayList5);
                this.label = 1;
                objM90345a = AwaitKt.m90345a(listListOf, this);
                if (objM90345a == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objM90345a = obj;
                i11 = 4;
                i12 = 5;
                i13 = 3;
                i14 = 2;
            }
            List list7 = (List) objM90345a;
            Object obj2 = list7.get(0);
            if (obj2 instanceof List) {
                list5 = (List) obj2;
            } else {
                t11 = 0;
            }
            if (t11 != 0) {
                t11 = list5;
                this.$spots.element = t11;
            }
            t11 = list5;
            Object obj3 = list7.get(1);
            if (obj3 instanceof List) {
                list4 = (List) obj3;
            } else {
                t12 = 0;
            }
            if (t12 != 0) {
                t12 = list4;
                this.$futures.element = t12;
            }
            t12 = list4;
            Object obj4 = list7.get(i14);
            if (obj4 instanceof List) {
                list3 = (List) obj4;
            } else {
                t13 = 0;
            }
            if (t13 != 0) {
                t13 = list3;
                this.$earns.element = t13;
            }
            t13 = list3;
            Object obj5 = list7.get(i13);
            if (obj5 instanceof List) {
                list2 = (List) obj5;
            } else {
                t14 = 0;
            }
            if (t14 != 0) {
                t14 = list2;
                this.$web3.element = t14;
            }
            t14 = list2;
            Ref.ObjectRef<SearchItemDepositInfo> objectRef = this.$depositInfo;
            Object obj6 = list7.get(i11);
            objectRef.element = obj6 instanceof SearchItemDepositInfo ? (SearchItemDepositInfo) obj6 : 0;
            Object obj7 = list7.get(i12);
            if (obj7 instanceof List) {
                list = (List) obj7;
            }
            if (t15 != 0) {
                t15 = list;
                this.$alpha.element = t15;
            }
            t15 = list;
            SearchDurationHelper.f49161a.m59624j(this.$key, "data_convert");
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteSearchDataSource$doSearch$loadTime$1$1(String str, Ref.BooleanRef booleanRef, Ref.ObjectRef<String> objectRef, Ref.ObjectRef<SearchItemDepositInfo> objectRef2, RemoteSearchDataSource remoteSearchDataSource, Ref.ObjectRef<List<SearchItemData>> objectRef3, Ref.ObjectRef<List<SearchItemData>> objectRef4, Ref.ObjectRef<List<SearchItemData>> objectRef5, Ref.ObjectRef<List<SearchItemData>> objectRef6, Ref.ObjectRef<List<SearchItemData>> objectRef7, Continuation<? super RemoteSearchDataSource$doSearch$loadTime$1$1> continuation) {
        super(2, continuation);
        this.$key = str;
        this.$success = booleanRef;
        this.$searchResultType = objectRef;
        this.$depositInfo = objectRef2;
        this.this$0 = remoteSearchDataSource;
        this.$spots = objectRef3;
        this.$futures = objectRef4;
        this.$earns = objectRef5;
        this.$web3 = objectRef6;
        this.$alpha = objectRef7;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends SearchEntity> list, Continuation<? super Unit> continuation) {
        return invoke2((List<SearchEntity>) list, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RemoteSearchDataSource$doSearch$loadTime$1$1 remoteSearchDataSource$doSearch$loadTime$1$1 = new RemoteSearchDataSource$doSearch$loadTime$1$1(this.$key, this.$success, this.$searchResultType, this.$depositInfo, this.this$0, this.$spots, this.$futures, this.$earns, this.$web3, this.$alpha, continuation);
        remoteSearchDataSource$doSearch$loadTime$1$1.L$0 = obj;
        return remoteSearchDataSource$doSearch$loadTime$1$1;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<SearchEntity> list, Continuation<? super Unit> continuation) {
        return ((RemoteSearchDataSource$doSearch$loadTime$1$1) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [T, java.lang.String] */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SearchEntity searchEntity;
        List list = (List) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            SearchDurationHelper.f49161a.m59624j(this.$key, "api_end");
            this.$success.element = true;
            this.$searchResultType.element = C27041f.m66668h((list == null || (searchEntity = (SearchEntity) CollectionsKt.firstOrNull(list)) == null) ? null : searchEntity.getSearchResultType());
            AbstractC41697j0 abstractC41697j0M94119a = C42911a.m94119a();
            C244531 c244531 = new C244531(list, this.$key, this.$depositInfo, this.this$0, this.$spots, this.$futures, this.$earns, this.$web3, this.$alpha, null);
            this.L$0 = SpillingKt.nullOutSpilledVariable(list);
            this.label = 1;
            if (C41686h.m91049g(abstractC41697j0M94119a, c244531, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
