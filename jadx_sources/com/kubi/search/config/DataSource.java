package com.kubi.search.config;

import com.kubi.data.entity.TradeItemBean;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.router.core.Router;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.search.SearchApi;
import com.kubi.search.entity.ContractEntity;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.flow.InterfaceC41634e;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.internal.SourceDebugExtension;
import r10.C43901a;
import s10.InterfaceC44267a;

/* JADX INFO: compiled from: DataSource.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012H\u0086@¢\u0006\u0002\u0010\u0013J\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0012H\u0082@¢\u0006\u0002\u0010\u0013R.\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR.\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/search/config/DataSource;", "", "<init>", "()V", "value", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/kubi/data/entity/TradeItemBean;", "spotList", "getSpotList", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/kubi/search/entity/ContractEntity;", "futureList", "getFutureList", "isFirstLoad", "", "api", "Lcom/kubi/search/SearchApi;", "refreshDataSource", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchFuturesData", "SearchLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataSource.kt\ncom/kubi/search/config/DataSource\n+ 2 SearchIssue.kt\ncom/kubi/search/exception/SearchIssueKt\n+ 3 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 4 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,81:1\n51#2:82\n53#2:87\n47#3,4:83\n17#4,2:88\n*S KotlinDebug\n*F\n+ 1 DataSource.kt\ncom/kubi/search/config/DataSource\n*L\n47#1:82\n47#1:87\n47#1:83,4\n72#1:88,2\n*E\n"})
public final class DataSource {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final DataSource f48855a = new DataSource();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static CopyOnWriteArrayList<TradeItemBean> f48856b = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: c */
    @NotNull
    public static CopyOnWriteArrayList<ContractEntity> f48857c = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: d */
    public static boolean f48858d = true;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final SearchApi f48859e = (SearchApi) RetrofitFlowExKt.m42820a(SearchApi.class);

    /* JADX WARN: Code duplicated, block: B:30:0x0088  */
    /* JADX WARN: Code duplicated, block: B:32:0x008d  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ab, code lost:
    
        if (r9 == r0) goto L34;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m59112d(Continuation<? super List<ContractEntity>> continuation) {
        DataSource$fetchFuturesData$1 dataSource$fetchFuturesData$1;
        Object objM56186h;
        int i11;
        Object obj;
        if (continuation instanceof DataSource$fetchFuturesData$1) {
            dataSource$fetchFuturesData$1 = (DataSource$fetchFuturesData$1) continuation;
            int i12 = dataSource$fetchFuturesData$1.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                dataSource$fetchFuturesData$1.label = i12 - Integer.MIN_VALUE;
            } else {
                dataSource$fetchFuturesData$1 = new DataSource$fetchFuturesData$1(this, continuation);
            }
        } else {
            dataSource$fetchFuturesData$1 = new DataSource$fetchFuturesData$1(this, continuation);
        }
        DataSource$fetchFuturesData$1 dataSource$fetchFuturesData$2 = dataSource$fetchFuturesData$1;
        Object objM42826g = dataSource$fetchFuturesData$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = dataSource$fetchFuturesData$2.label;
        if (i13 != 0) {
            if (i13 == 1) {
                i11 = dataSource$fetchFuturesData$2.I$0;
                obj = dataSource$fetchFuturesData$2.L$0;
                ResultKt.throwOnFailure(objM42826g);
            } else {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM42826g);
            }
            List list = (List) ((C19334f) objM42826g).m42846a();
            return list == null ? CollectionsKt.emptyList() : list;
        }
        ResultKt.throwOnFailure(objM42826g);
        objM56186h = Router.f46192a.m56186h(InterfaceC44267a.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            InterfaceC44267a interfaceC44267a = (InterfaceC44267a) objM56186h;
            SearchApi searchApi = f48859e;
            dataSource$fetchFuturesData$2.L$0 = SpillingKt.nullOutSpilledVariable(objM56186h);
            dataSource$fetchFuturesData$2.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC44267a);
            dataSource$fetchFuturesData$2.I$0 = 0;
            dataSource$fetchFuturesData$2.I$1 = 0;
            dataSource$fetchFuturesData$2.label = 1;
            Object objM97686a = interfaceC44267a.m97686a(searchApi, dataSource$fetchFuturesData$2);
            if (objM97686a != coroutine_suspended) {
                obj = objM56186h;
                objM42826g = objM97686a;
                i11 = 0;
            }
        } else {
            i11 = 0;
            if (!C24129b.m58030b(SiteVisibleConfigKey.Futures)) {
                return CollectionsKt.emptyList();
            }
            InterfaceC41634e<List<ContractEntity>> interfaceC41634eM59633h = f48859e.m59633h();
            dataSource$fetchFuturesData$2.L$0 = SpillingKt.nullOutSpilledVariable(objM56186h);
            dataSource$fetchFuturesData$2.L$1 = null;
            dataSource$fetchFuturesData$2.I$0 = i11;
            dataSource$fetchFuturesData$2.I$1 = 0;
            dataSource$fetchFuturesData$2.label = 2;
            objM42826g = RetrofitFlowExKt.m42826g(interfaceC41634eM59633h, false, null, dataSource$fetchFuturesData$2, 2, null);
        }
        return coroutine_suspended;
        List list2 = (List) objM42826g;
        if (list2 != null) {
            return list2;
        }
        objM56186h = obj;
        if (!C24129b.m58030b(SiteVisibleConfigKey.Futures)) {
            return CollectionsKt.emptyList();
        }
        InterfaceC41634e<List<ContractEntity>> interfaceC41634eM59633h2 = f48859e.m59633h();
        dataSource$fetchFuturesData$2.L$0 = SpillingKt.nullOutSpilledVariable(objM56186h);
        dataSource$fetchFuturesData$2.L$1 = null;
        dataSource$fetchFuturesData$2.I$0 = i11;
        dataSource$fetchFuturesData$2.I$1 = 0;
        dataSource$fetchFuturesData$2.label = 2;
        objM42826g = RetrofitFlowExKt.m42826g(interfaceC41634eM59633h2, false, null, dataSource$fetchFuturesData$2, 2, null);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final CopyOnWriteArrayList<ContractEntity> m59113e() {
        return f48857c;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final CopyOnWriteArrayList<TradeItemBean> m59114f() {
        return f48856b;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final Object m59115g(@NotNull Continuation<? super List<? extends Object>> continuation) {
        return C41686h.m91049g(C42911a.m94120b().plus(new C43901a(CoroutineExceptionHandler.INSTANCE)), new DataSource$refreshDataSource$2(null), continuation);
    }
}
