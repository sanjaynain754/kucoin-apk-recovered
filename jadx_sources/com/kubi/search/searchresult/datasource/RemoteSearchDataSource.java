package com.kubi.search.searchresult.datasource;

import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.search.SearchApi;
import com.kubi.search.entity.ExtendEntity;
import com.kubi.search.entity.SearchEntity;
import com.kubi.search.entity.SearchItemData;
import com.kubi.search.entity.SearchItemDepositInfo;
import com.kubi.search.entity.SearchResultWrap;
import com.kubi.search.utils.SearchDurationHelper;
import com.kubi.search.utils.SearchExKt;
import com.kubi.search.utils.SearchTrack;
import com.kubi.utils.extensions.C27041f;
import com.tencent.bugly.proguard.C33820nf;
import gf.C37890n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: RemoteSearchDataSource.kt */
/* JADX INFO: loaded from: classes44.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\nJ\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\fH\u0002J\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\fH\u0002J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\fH\u0002J\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\fH\u0002J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\fH\u0002J\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource;", "", "<init>", "()V", "api", "Lcom/kubi/search/SearchApi;", "doSearch", "Lcom/kubi/search/entity/SearchResultWrap;", "key", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findSpots", "", "Lcom/kubi/search/entity/SearchItemData;", "remoteSpot", "Lcom/kubi/search/entity/SearchEntity;", "findFutures", "remoteFuture", "findEarns", "remoteEarn", "findWeb3", "remoteWeb3", "findAlpha", "remoteAlpha", "findDeposit", "Lcom/kubi/search/entity/SearchItemDepositInfo;", "Companion", "SearchLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRemoteSearchDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteSearchDataSource.kt\ncom/kubi/search/searchresult/datasource/RemoteSearchDataSource\n+ 2 Timing.kt\nkotlin/system/TimingKt\n+ 3 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,170:1\n29#2,2:171\n31#2:176\n25#3:173\n26#3:175\n1#4:174\n1#4:187\n1#4:200\n1#4:213\n1617#5,9:177\n1869#5:186\n1870#5:188\n1626#5:189\n1617#5,9:190\n1869#5:199\n1870#5:201\n1626#5:202\n1617#5,9:203\n1869#5:212\n1870#5:214\n1626#5:215\n1563#5:216\n1634#5,3:217\n1563#5:220\n1634#5,3:221\n295#5,2:224\n*S KotlinDebug\n*F\n+ 1 RemoteSearchDataSource.kt\ncom/kubi/search/searchresult/datasource/RemoteSearchDataSource\n*L\n49#1:171,2\n49#1:176\n87#1:173\n87#1:175\n87#1:174\n116#1:187\n121#1:200\n126#1:213\n116#1:177,9\n116#1:186\n116#1:188\n116#1:189\n121#1:190,9\n121#1:199\n121#1:201\n121#1:202\n126#1:203,9\n126#1:212\n126#1:214\n126#1:215\n131#1:216\n131#1:217,3\n135#1:220\n135#1:221,3\n139#1:224,2\n*E\n"})
public final class RemoteSearchDataSource {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f49052b = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final SearchApi f49053a = (SearchApi) RetrofitFlowExKt.m42820a(SearchApi.class);

    /* JADX INFO: compiled from: RemoteSearchDataSource.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource$Companion;", "", "<init>", "()V", "RESOURCE_TYPE_SPOT", "", "RESOURCE_TYPE_FUTURE", "RESOURCE_TYPE_EARN", "RESOURCE_TYPE_WEB3", "RESOURCE_TYPE_ALPHA", "SearchLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: i */
    public final SearchItemDepositInfo m59494i(List<SearchEntity> list) {
        SearchEntity searchEntity;
        String strM66668h;
        Object next;
        ExtendEntity resourceExtend;
        if (list != null) {
            Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                resourceExtend = ((SearchEntity) next).getResourceExtend();
            } while (!(resourceExtend != null ? Intrinsics.areEqual(resourceExtend.isSupportDeposit(), Boolean.TRUE) : false));
            searchEntity = (SearchEntity) next;
        } else {
            searchEntity = null;
        }
        ExtendEntity resourceExtend2 = searchEntity != null ? searchEntity.getResourceExtend() : null;
        if (resourceExtend2 == null) {
            return null;
        }
        String strM66668h2 = C27041f.m66668h(searchEntity.getResourceId());
        SymbolInfoEntity symbolInfoEntityM85601B = C37890n.f85269a.m85601B(strM66668h2);
        if (symbolInfoEntityM85601B == null || (strM66668h = symbolInfoEntityM85601B.getBaseCurrencyName()) == null) {
            strM66668h = C27041f.m66668h((String) CollectionsKt.firstOrNull(StringsKt.split$default((CharSequence) strM66668h2, new String[]{C33820nf.f71144W}, false, 0, 6, (Object) null)));
        }
        String otcUrl = C24129b.m58030b(SiteVisibleConfigKey.FastTrade) ? resourceExtend2.getOtcUrl() : null;
        String depositUrl = resourceExtend2.getDepositUrl();
        if (depositUrl == null || depositUrl.length() == 0) {
            if (otcUrl == null || otcUrl.length() == 0) {
                return null;
            }
        }
        return new SearchItemDepositInfo(strM66668h, resourceExtend2.getDepositUrl(), otcUrl);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, java.util.List] */
    @Nullable
    /* JADX INFO: renamed from: g */
    public final Object m59492g(@NotNull String str, @NotNull Continuation<? super SearchResultWrap> continuation) throws JSONException {
        RemoteSearchDataSource$doSearch$1 remoteSearchDataSource$doSearch$1;
        Ref.ObjectRef objectRef;
        RemoteSearchDataSource$doSearch$1 remoteSearchDataSource$doSearch$2;
        boolean z11;
        long j11;
        Ref.ObjectRef objectRef2;
        Ref.ObjectRef objectRef3;
        Object obj;
        Ref.ObjectRef objectRef4;
        Ref.ObjectRef objectRef5;
        String str2;
        Ref.ObjectRef objectRef6;
        Ref.ObjectRef objectRef7;
        Ref.BooleanRef booleanRef;
        int i11;
        int i12;
        String str3;
        Ref.ObjectRef objectRef8;
        Ref.ObjectRef objectRef9;
        Ref.ObjectRef objectRef10;
        if (continuation instanceof RemoteSearchDataSource$doSearch$1) {
            remoteSearchDataSource$doSearch$1 = (RemoteSearchDataSource$doSearch$1) continuation;
            int i13 = remoteSearchDataSource$doSearch$1.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                remoteSearchDataSource$doSearch$1.label = i13 - Integer.MIN_VALUE;
            } else {
                remoteSearchDataSource$doSearch$1 = new RemoteSearchDataSource$doSearch$1(this, continuation);
            }
        } else {
            remoteSearchDataSource$doSearch$1 = new RemoteSearchDataSource$doSearch$1(this, continuation);
        }
        RemoteSearchDataSource$doSearch$1 remoteSearchDataSource$doSearch$3 = remoteSearchDataSource$doSearch$1;
        Object obj2 = remoteSearchDataSource$doSearch$3.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i14 = remoteSearchDataSource$doSearch$3.label;
        if (i14 == 0) {
            ResultKt.throwOnFailure(obj2);
            Ref.ObjectRef objectRef11 = new Ref.ObjectRef();
            objectRef11.element = CollectionsKt.emptyList();
            Ref.ObjectRef objectRef12 = new Ref.ObjectRef();
            objectRef12.element = CollectionsKt.emptyList();
            Ref.ObjectRef objectRef13 = new Ref.ObjectRef();
            objectRef13.element = CollectionsKt.emptyList();
            objectRef = new Ref.ObjectRef();
            objectRef.element = CollectionsKt.emptyList();
            Ref.ObjectRef objectRef14 = new Ref.ObjectRef();
            objectRef14.element = CollectionsKt.emptyList();
            Ref.ObjectRef objectRef15 = new Ref.ObjectRef();
            Ref.ObjectRef objectRef16 = new Ref.ObjectRef();
            objectRef16.element = "";
            Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
            remoteSearchDataSource$doSearch$2 = remoteSearchDataSource$doSearch$3;
            long jCurrentTimeMillis = System.currentTimeMillis();
            SearchDurationHelper.f49161a.m59624j(str, "api_start");
            InterfaceC41634e<List<SearchEntity>> interfaceC41634eM59634i = this.f49053a.m59634i(str);
            z11 = false;
            RemoteSearchDataSource$doSearch$loadTime$1$1 remoteSearchDataSource$doSearch$loadTime$1$1 = new RemoteSearchDataSource$doSearch$loadTime$1$1(str, booleanRef2, objectRef16, objectRef15, this, objectRef11, objectRef12, objectRef13, objectRef, objectRef14, null);
            remoteSearchDataSource$doSearch$2.L$0 = str;
            remoteSearchDataSource$doSearch$2.L$1 = objectRef11;
            remoteSearchDataSource$doSearch$2.L$2 = objectRef12;
            remoteSearchDataSource$doSearch$2.L$3 = objectRef13;
            remoteSearchDataSource$doSearch$2.L$4 = objectRef;
            remoteSearchDataSource$doSearch$2.L$5 = objectRef14;
            remoteSearchDataSource$doSearch$2.L$6 = objectRef15;
            remoteSearchDataSource$doSearch$2.L$7 = objectRef16;
            remoteSearchDataSource$doSearch$2.L$8 = booleanRef2;
            remoteSearchDataSource$doSearch$2.I$0 = 0;
            j11 = jCurrentTimeMillis;
            remoteSearchDataSource$doSearch$2.J$0 = j11;
            remoteSearchDataSource$doSearch$2.I$1 = 0;
            remoteSearchDataSource$doSearch$2.label = 1;
            Object objM42825f = RetrofitFlowExKt.m42825f(interfaceC41634eM59634i, false, remoteSearchDataSource$doSearch$loadTime$1$1, remoteSearchDataSource$doSearch$2);
            if (objM42825f != coroutine_suspended) {
                objectRef2 = objectRef12;
                objectRef3 = objectRef14;
                obj = objM42825f;
                objectRef4 = objectRef11;
                objectRef5 = objectRef13;
                str2 = str;
                objectRef6 = objectRef16;
                objectRef7 = objectRef15;
                booleanRef = booleanRef2;
                i11 = 0;
                i12 = 0;
            }
            return coroutine_suspended;
        }
        if (i14 == 1) {
            int i15 = remoteSearchDataSource$doSearch$3.I$1;
            long j12 = remoteSearchDataSource$doSearch$3.J$0;
            int i16 = remoteSearchDataSource$doSearch$3.I$0;
            Ref.BooleanRef booleanRef3 = (Ref.BooleanRef) remoteSearchDataSource$doSearch$3.L$8;
            objectRef6 = (Ref.ObjectRef) remoteSearchDataSource$doSearch$3.L$7;
            Ref.ObjectRef objectRef17 = (Ref.ObjectRef) remoteSearchDataSource$doSearch$3.L$6;
            Ref.ObjectRef objectRef18 = (Ref.ObjectRef) remoteSearchDataSource$doSearch$3.L$5;
            Ref.ObjectRef objectRef19 = (Ref.ObjectRef) remoteSearchDataSource$doSearch$3.L$4;
            objectRef5 = (Ref.ObjectRef) remoteSearchDataSource$doSearch$3.L$3;
            Ref.ObjectRef objectRef20 = (Ref.ObjectRef) remoteSearchDataSource$doSearch$3.L$2;
            Ref.ObjectRef objectRef21 = (Ref.ObjectRef) remoteSearchDataSource$doSearch$3.L$1;
            obj = obj2;
            str2 = (String) remoteSearchDataSource$doSearch$3.L$0;
            ResultKt.throwOnFailure(obj);
            i12 = i15;
            i11 = i16;
            j11 = j12;
            objectRef7 = objectRef17;
            objectRef3 = objectRef18;
            objectRef = objectRef19;
            objectRef4 = objectRef21;
            objectRef2 = objectRef20;
            booleanRef = booleanRef3;
            remoteSearchDataSource$doSearch$2 = remoteSearchDataSource$doSearch$3;
            z11 = false;
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j11 = remoteSearchDataSource$doSearch$3.J$0;
            booleanRef = (Ref.BooleanRef) remoteSearchDataSource$doSearch$3.L$8;
            objectRef8 = (Ref.ObjectRef) remoteSearchDataSource$doSearch$3.L$7;
            objectRef7 = (Ref.ObjectRef) remoteSearchDataSource$doSearch$3.L$6;
            objectRef3 = (Ref.ObjectRef) remoteSearchDataSource$doSearch$3.L$5;
            objectRef9 = (Ref.ObjectRef) remoteSearchDataSource$doSearch$3.L$4;
            objectRef10 = (Ref.ObjectRef) remoteSearchDataSource$doSearch$3.L$3;
            objectRef2 = (Ref.ObjectRef) remoteSearchDataSource$doSearch$3.L$2;
            objectRef4 = (Ref.ObjectRef) remoteSearchDataSource$doSearch$3.L$1;
            String str4 = (String) remoteSearchDataSource$doSearch$3.L$0;
            ResultKt.throwOnFailure(obj2);
            str3 = str4;
        }
        C44128b.m97268l("searchV2", "doSearch[remote], key=" + str3 + ", success=" + booleanRef.element + ", spot=" + ((List) objectRef4.element).size() + ", futures=" + ((List) objectRef2.element).size());
        SearchTrack.f49158a.m59607c(System.currentTimeMillis() - j11, ((List) objectRef4.element).size() + ((List) objectRef2.element).size(), ((List) objectRef4.element).size(), ((List) objectRef2.element).size(), ((List) objectRef10.element).size(), (String) objectRef8.element);
        return new SearchResultWrap(booleanRef.element, str3, (List) objectRef4.element, (List) objectRef2.element, (List) objectRef10.element, (List) objectRef9.element, (SearchItemDepositInfo) objectRef7.element, (List) objectRef3.element);
        if (((C19334f) obj).getThrowable() != null) {
            booleanRef.element = z11;
        }
        remoteSearchDataSource$doSearch$2.L$0 = str2;
        remoteSearchDataSource$doSearch$2.L$1 = objectRef4;
        remoteSearchDataSource$doSearch$2.L$2 = objectRef2;
        remoteSearchDataSource$doSearch$2.L$3 = objectRef5;
        remoteSearchDataSource$doSearch$2.L$4 = objectRef;
        remoteSearchDataSource$doSearch$2.L$5 = objectRef3;
        remoteSearchDataSource$doSearch$2.L$6 = objectRef7;
        remoteSearchDataSource$doSearch$2.L$7 = objectRef6;
        remoteSearchDataSource$doSearch$2.L$8 = booleanRef;
        remoteSearchDataSource$doSearch$2.I$0 = i11;
        remoteSearchDataSource$doSearch$2.J$0 = j11;
        remoteSearchDataSource$doSearch$2.I$1 = i12;
        remoteSearchDataSource$doSearch$2.label = 2;
        if (DelayKt.m90350b(1L, remoteSearchDataSource$doSearch$2) != coroutine_suspended) {
            str3 = str2;
            objectRef8 = objectRef6;
            objectRef9 = objectRef;
            objectRef10 = objectRef5;
            C44128b.m97268l("searchV2", "doSearch[remote], key=" + str3 + ", success=" + booleanRef.element + ", spot=" + ((List) objectRef4.element).size() + ", futures=" + ((List) objectRef2.element).size());
            SearchTrack.f49158a.m59607c(System.currentTimeMillis() - j11, ((List) objectRef4.element).size() + ((List) objectRef2.element).size(), ((List) objectRef4.element).size(), ((List) objectRef2.element).size(), ((List) objectRef10.element).size(), (String) objectRef8.element);
            return new SearchResultWrap(booleanRef.element, str3, (List) objectRef4.element, (List) objectRef2.element, (List) objectRef10.element, (List) objectRef9.element, (SearchItemDepositInfo) objectRef7.element, (List) objectRef3.element);
        }
        return coroutine_suspended;
    }

    /* JADX INFO: renamed from: h */
    public final List<SearchItemData> m59493h(List<SearchEntity> list) {
        ArrayList arrayList;
        if (list != null) {
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(SearchDataConvertor.f49054a.m59499a((SearchEntity) it.next()));
            }
        } else {
            arrayList = null;
        }
        return arrayList == null ? CollectionsKt.emptyList() : arrayList;
    }

    /* JADX INFO: renamed from: k */
    public final List<SearchItemData> m59496k(List<SearchEntity> list) {
        ArrayList arrayList;
        if (!C24129b.m58030b(SiteVisibleConfigKey.Futures)) {
            return CollectionsKt.emptyList();
        }
        if (list != null) {
            arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                SearchItemData searchItemDataM59501c = SearchDataConvertor.f49054a.m59501c((SearchEntity) it.next());
                if (searchItemDataM59501c != null) {
                    arrayList.add(searchItemDataM59501c);
                }
            }
        } else {
            arrayList = null;
        }
        return arrayList == null ? CollectionsKt.emptyList() : arrayList;
    }

    /* JADX INFO: renamed from: l */
    public final List<SearchItemData> m59497l(List<SearchEntity> list) {
        ArrayList arrayList;
        if (list != null) {
            arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                SearchItemData searchItemDataM59502d = SearchDataConvertor.f49054a.m59502d((SearchEntity) it.next());
                if (searchItemDataM59502d != null) {
                    arrayList.add(searchItemDataM59502d);
                }
            }
        } else {
            arrayList = null;
        }
        return arrayList == null ? CollectionsKt.emptyList() : arrayList;
    }

    /* JADX INFO: renamed from: j */
    public final List<SearchItemData> m59495j(List<SearchEntity> list) {
        ArrayList arrayList;
        if (!SearchExKt.m59516J() && C24129b.m58030b(SiteVisibleConfigKey.Financing)) {
            if (list != null) {
                arrayList = new ArrayList();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    SearchItemData searchItemDataM59500b = SearchDataConvertor.f49054a.m59500b((SearchEntity) it.next());
                    if (searchItemDataM59500b != null) {
                        arrayList.add(searchItemDataM59500b);
                    }
                }
            } else {
                arrayList = null;
            }
            if (arrayList == null) {
                return CollectionsKt.emptyList();
            }
            return arrayList;
        }
        return CollectionsKt.emptyList();
    }

    /* JADX INFO: renamed from: m */
    public final List<SearchItemData> m59498m(List<SearchEntity> list) {
        ArrayList arrayList;
        if (!SearchExKt.m59536r()) {
            return CollectionsKt.emptyList();
        }
        if (list != null) {
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(SearchDataConvertor.f49054a.m59503e((SearchEntity) it.next()));
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            return CollectionsKt.emptyList();
        }
        return arrayList;
    }
}
