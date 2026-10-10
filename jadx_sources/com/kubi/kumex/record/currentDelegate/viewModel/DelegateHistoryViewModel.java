package com.kubi.kumex.record.currentDelegate.viewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.facebook.react.uimanager.ViewProps;
import com.fasterxml.jackson.databind.node.C6447a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.broker.BrokerConfig;
import com.kubi.broker.MultiBizType;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.futures.history.filter.OrderAssetType;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.trade.model.OrderEntity;
import com.kubi.kumex.record.currentDelegate.adapter.TodoDelegateItem;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.sdk.BaseViewModel;
import com.kubi.sdk.PageEntity;
import com.kubi.utils.FlowableCompat;
import com.kubi.utils.extensions.C27039d;
import fm.C37568c;
import io.reactivex.Flowable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41775x1;
import o00.C42911a;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p203di.C36695c;
import p236em.C37213a;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function4;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import sh0.InterfaceC44418d;
import th.InterfaceC44980d;

/* JADX INFO: compiled from: DelegateHistViewModel.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\n\b\u0002\u00100\u001a\u0004\u0018\u00010/2\u0006\u00101\u001a\u000202J&\u00103\u001a\u00020-2\u0006\u00104\u001a\u0002022\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u00106\u001a\u00020\u0006H\u0002J\u0010\u00107\u001a\u00020-2\u0006\u00108\u001a\u000202H\u0002J\f\u00109\u001a\u00020\u0006*\u000202H\u0002J&\u0010:\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010/2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020/0<J&\u0010=\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010/2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020/0<J-\u0010>\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\b\u0010?\u001a\u0004\u0018\u0001022\f\u0010;\u001a\b\u0012\u0004\u0012\u00020/0<H\u0002¢\u0006\u0002\u0010@J\"\u0010A\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\n\b\u0002\u00100\u001a\u0004\u0018\u00010/2\u0006\u00101\u001a\u000202J\u0094\u0001\u0010B\u001a\u00020-2\u0006\u0010C\u001a\u0002022\u0006\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010/2\u0006\u0010D\u001a\u00020E2e\u0010F\u001aa\b\u0001\u0012\u0013\u0012\u001102¢\u0006\f\bH\u0012\b\bI\u0012\u0004\b\b(C\u0012\u0013\u0012\u00110/¢\u0006\f\bH\u0012\b\bI\u0012\u0004\b\b(.\u0012\u0015\u0012\u0013\u0018\u00010/¢\u0006\f\bH\u0012\b\bI\u0012\u0004\b\b(0\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020E\u0018\u00010K0J\u0012\u0006\u0012\u0004\u0018\u00010L0G¢\u0006\u0002\u0010MJ9\u0010N\u001a\u00020-2\u0006\u0010O\u001a\u0002022\b\u0010P\u001a\u0004\u0018\u00010/2\u000e\u00105\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00192\b\u00106\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0002\u0010QJ\u0014\u0010R\u001a\u00020-2\f\u0010S\u001a\b\u0012\u0004\u0012\u00020-0<J\u001e\u0010T\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019*\b\u0012\u0004\u0012\u00020E0K2\u0006\u00101\u001a\u000202R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\nR\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\nR\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\nR\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\nR\u001a\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\nR\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\nR\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\nR\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\nR\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010&X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001a0)¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+¨\u0006U"}, m90084d2 = {"Lcom/kubi/kumex/record/currentDelegate/viewModel/DelegateHistoryViewModel;", "Lcom/kubi/sdk/BaseViewModel;", "<init>", "()V", "_showLoadDialog", "Landroidx/lifecycle/MutableLiveData;", "", "showLoadDialog", "Landroidx/lifecycle/LiveData;", "getShowLoadDialog", "()Landroidx/lifecycle/LiveData;", "_showRefreshing", "showRefreshing", "getShowRefreshing", "_isLoadingMore", "isLoadingMore", "_isNoMoreData", "isNoMoreData", "_isLoadMoreEnable", "isLoadMoreEnable", "_isError", "isError", "_isLoadMoreError", "isLoadMoreError", "_orders", "", "Lcom/kubi/kumex/record/currentDelegate/adapter/TodoDelegateItem;", "orders", "getOrders", "_isOrdersEmpty", "isOrdersEmpty", "_singleRevokeSuccessFeedBack", "singleRevokeSuccessFeedBack", "getSingleRevokeSuccessFeedBack", "_allRevokeSucceed", "allRevokeSucceed", "getAllRevokeSucceed", "preOrderLoadJob", "Lkotlinx/coroutines/Job;", "preOrderNumLoadJob", "pageData", "Ljava/util/concurrent/CopyOnWriteArrayList;", "getPageData", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "fetchAdvancedOrders", "", "assetType", "", "symbol", "currentPage", "", "deleteRepeatedOrderAndRefreshPageList", "pageIndex", FirebaseAnalytics.Param.ITEMS, "hasMore", "loadingComplete", "page", "isFirstPage", "fetchAdvancedOrderNum", "curFundsTypeGetter", "Lkotlin/Function0;", "fetchBasicOrderNum", "insertOppositeOrdersNumTips", "num", "(Ljava/lang/String;Ljava/lang/Long;Lkotlin/jvm/functions/Function0;)V", "fetchBasicOrders", "revoke", "curLastPage", "order", "Lcom/kubi/kumex/data/trade/model/OrderEntity;", "lastPageOrdersFetcher", "Lkotlin/Function4;", "Lkotlin/ParameterName;", "name", "Lkotlin/coroutines/Continuation;", "Lcom/kubi/sdk/PageEntity;", "", "(JLjava/lang/String;Ljava/lang/String;Lcom/kubi/kumex/data/trade/model/OrderEntity;Lkotlin/jvm/functions/Function4;)V", "dealSingleRevokeSuccess", "lastPageIndex", "revokedOrderId", "(JLjava/lang/String;Ljava/util/List;Ljava/lang/Boolean;)V", "revokeAllOrders", "revokeAllRunnable", ViewProps.TRANSFORM, "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDelegateHistViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DelegateHistViewModel.kt\ncom/kubi/kumex/record/currentDelegate/viewModel/DelegateHistoryViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,496:1\n1869#2,2:497\n808#2,11:499\n808#2,11:510\n1634#2,3:521\n*S KotlinDebug\n*F\n+ 1 DelegateHistViewModel.kt\ncom/kubi/kumex/record/currentDelegate/viewModel/DelegateHistoryViewModel\n*L\n174#1:497,2\n182#1:499,11\n433#1:510,11\n475#1:521,3\n*E\n"})
public final class DelegateHistoryViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final MutableLiveData<Boolean> f30066X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final LiveData<Boolean> f30067Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final MutableLiveData<Boolean> f30068Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final LiveData<Boolean> f30069a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final MutableLiveData<Boolean> f30070b0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final LiveData<Boolean> f30071c0;

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final MutableLiveData<Boolean> f30072d0;

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final LiveData<Boolean> f30073e0;

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public final MutableLiveData<Boolean> f30074f0;

    /* JADX INFO: renamed from: g0 */
    @NotNull
    public final LiveData<Boolean> f30075g0;

    /* JADX INFO: renamed from: h0 */
    @NotNull
    public final MutableLiveData<Boolean> f30076h0;

    /* JADX INFO: renamed from: i0 */
    @NotNull
    public final LiveData<Boolean> f30077i0;

    /* JADX INFO: renamed from: j0 */
    @NotNull
    public final MutableLiveData<Boolean> f30078j0;

    /* JADX INFO: renamed from: k0 */
    @NotNull
    public final LiveData<Boolean> f30079k0;

    /* JADX INFO: renamed from: l0 */
    @NotNull
    public final MutableLiveData<List<TodoDelegateItem>> f30080l0;

    /* JADX INFO: renamed from: m0 */
    @NotNull
    public final LiveData<List<TodoDelegateItem>> f30081m0;

    /* JADX INFO: renamed from: n0 */
    @NotNull
    public final MutableLiveData<Boolean> f30082n0;

    /* JADX INFO: renamed from: o0 */
    @NotNull
    public final LiveData<Boolean> f30083o0;

    /* JADX INFO: renamed from: p0 */
    @NotNull
    public final MutableLiveData<Boolean> f30084p0;

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final LiveData<Boolean> f30085q0;

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final MutableLiveData<Boolean> f30086r0;

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final LiveData<Boolean> f30087s0;

    /* JADX INFO: renamed from: t0 */
    @Nullable
    public InterfaceC41775x1 f30088t0;

    /* JADX INFO: renamed from: u0 */
    @Nullable
    public InterfaceC41775x1 f30089u0;

    /* JADX INFO: renamed from: v0 */
    @NotNull
    public final CopyOnWriteArrayList<TodoDelegateItem> f30090v0;

    /* JADX INFO: renamed from: I */
    public static final boolean m35521I(long j11, String str, TodoDelegateItem todoDelegateItem) {
        if (todoDelegateItem instanceof TodoDelegateItem.b) {
            TodoDelegateItem.b bVar = (TodoDelegateItem.b) todoDelegateItem;
            if (bVar.getPageIndex() == j11 || Intrinsics.areEqual(bVar.getOrderEntity().getId(), str)) {
                return true;
            }
        }
        return todoDelegateItem instanceof TodoDelegateItem.e;
    }

    /* JADX INFO: renamed from: K */
    public static final boolean m35522K(TodoDelegateItem todoDelegateItem, TodoDelegateItem todoDelegateItem2) {
        return (todoDelegateItem2 instanceof TodoDelegateItem.b) && Intrinsics.areEqual(((TodoDelegateItem.b) todoDelegateItem2).getOrderEntity().getId(), ((TodoDelegateItem.b) todoDelegateItem).getOrderEntity().getId());
    }

    /* JADX INFO: renamed from: f0 */
    public static final void m35523f0(DelegateHistoryViewModel delegateHistoryViewModel, Object obj) {
        delegateHistoryViewModel.f30066X.setValue(Boolean.FALSE);
        delegateHistoryViewModel.f30086r0.setValue(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: g0 */
    public static final Unit m35524g0(DelegateHistoryViewModel delegateHistoryViewModel, Throwable th2) {
        delegateHistoryViewModel.f30066X.setValue(Boolean.FALSE);
        Intrinsics.checkNotNull(th2);
        C19331c.m42836c(th2, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i0 */
    public static final Unit m35526i0(DelegateHistoryViewModel delegateHistoryViewModel, InterfaceC44418d interfaceC44418d) {
        delegateHistoryViewModel.f30066X.setValue(Boolean.TRUE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H */
    public final void m35539H(final long j11, final String str, List<TodoDelegateItem> list, Boolean bool) {
        this.f30084p0.postValue(Boolean.TRUE);
        synchronized (this.f30090v0) {
            try {
                CollectionsKt.removeAll((List) this.f30090v0, new Function1() { // from class: com.kubi.kumex.record.currentDelegate.viewModel.g
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(DelegateHistoryViewModel.m35521I(j11, str, (TodoDelegateItem) obj));
                    }
                });
                CopyOnWriteArrayList<TodoDelegateItem> copyOnWriteArrayList = this.f30090v0;
                if (list == null) {
                    list = CollectionsKt.emptyList();
                }
                copyOnWriteArrayList.addAll(list);
                CopyOnWriteArrayList<TodoDelegateItem> copyOnWriteArrayList2 = this.f30090v0;
                ArrayList arrayList = new ArrayList();
                for (Object obj : copyOnWriteArrayList2) {
                    if (obj instanceof TodoDelegateItem.b) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.isEmpty()) {
                    this.f30090v0.add(TodoDelegateItem.d.f30004a);
                    this.f30082n0.postValue(Boolean.TRUE);
                    this.f30074f0.postValue(Boolean.FALSE);
                    this.f30080l0.postValue(this.f30090v0);
                    return;
                }
                MutableLiveData<Boolean> mutableLiveData = this.f30082n0;
                Boolean bool2 = Boolean.FALSE;
                mutableLiveData.postValue(bool2);
                Boolean bool3 = Boolean.TRUE;
                if (Intrinsics.areEqual(bool, bool3)) {
                    this.f30074f0.postValue(bool3);
                } else if (Intrinsics.areEqual(bool, bool2)) {
                    this.f30090v0.add(TodoDelegateItem.e.f30005a);
                    this.f30074f0.postValue(bool2);
                }
                this.f30080l0.postValue(this.f30090v0);
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m35540J(long j11, List<TodoDelegateItem> list, boolean z11) {
        synchronized (this.f30090v0) {
            try {
                if (j11 == 1) {
                    TodoDelegateItem todoDelegateItem = (TodoDelegateItem) CollectionsKt.firstOrNull((List) this.f30090v0);
                    if (todoDelegateItem instanceof TodoDelegateItem.OrderHistoryNumTipsInfo) {
                        list.add(0, todoDelegateItem);
                    }
                    this.f30090v0.clear();
                    this.f30090v0.addAll(list);
                } else {
                    for (final TodoDelegateItem todoDelegateItem2 : list) {
                        if (todoDelegateItem2 instanceof TodoDelegateItem.b) {
                            CollectionsKt.removeAll((List) this.f30090v0, new Function1() { // from class: com.kubi.kumex.record.currentDelegate.viewModel.a
                                @Override // p852kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return Boolean.valueOf(DelegateHistoryViewModel.m35522K(todoDelegateItem2, (TodoDelegateItem) obj));
                                }
                            });
                        }
                    }
                    this.f30090v0.addAll(list);
                }
                CopyOnWriteArrayList<TodoDelegateItem> copyOnWriteArrayList = this.f30090v0;
                ArrayList arrayList = new ArrayList();
                for (Object obj : copyOnWriteArrayList) {
                    if (obj instanceof TodoDelegateItem.b) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.isEmpty()) {
                    this.f30090v0.add(TodoDelegateItem.d.f30004a);
                    this.f30082n0.postValue(Boolean.TRUE);
                    this.f30074f0.postValue(Boolean.FALSE);
                } else {
                    MutableLiveData<Boolean> mutableLiveData = this.f30082n0;
                    Boolean bool = Boolean.FALSE;
                    mutableLiveData.postValue(bool);
                    if (z11) {
                        this.f30074f0.postValue(Boolean.TRUE);
                    } else {
                        this.f30090v0.add(TodoDelegateItem.e.f30005a);
                        this.f30074f0.postValue(bool);
                    }
                }
                this.f30080l0.postValue(this.f30090v0);
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m35541L(@NotNull String assetType, @Nullable String str, @NotNull Function0<String> curFundsTypeGetter) {
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(curFundsTypeGetter, "curFundsTypeGetter");
        InterfaceC41775x1 interfaceC41775x1 = this.f30089u0;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        this.f30089u0 = C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b().plus(C37213a.m83253c()), null, new DelegateHistoryViewModel$fetchAdvancedOrderNum$1(this, assetType, curFundsTypeGetter, str, null), 2, null);
    }

    /* JADX INFO: renamed from: M */
    public final void m35542M(@NotNull String assetType, @Nullable String str, long j11) {
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        InterfaceC41775x1 interfaceC41775x1 = this.f30088t0;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        this.f30088t0 = C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b().plus(C37213a.m83253c()), null, new DelegateHistoryViewModel$fetchAdvancedOrders$1(this, j11, assetType, str, null), 2, null);
    }

    /* JADX INFO: renamed from: N */
    public final void m35543N(@NotNull String assetType, @Nullable String str, @NotNull Function0<String> curFundsTypeGetter) {
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(curFundsTypeGetter, "curFundsTypeGetter");
        InterfaceC41775x1 interfaceC41775x1 = this.f30089u0;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        this.f30089u0 = C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b().plus(C37213a.m83253c()), null, new DelegateHistoryViewModel$fetchBasicOrderNum$1(this, assetType, curFundsTypeGetter, str, null), 2, null);
    }

    /* JADX INFO: renamed from: O */
    public final void m35544O(@NotNull String assetType, @Nullable String str, long j11) {
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        InterfaceC41775x1 interfaceC41775x1 = this.f30088t0;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        this.f30088t0 = C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b().plus(C37213a.m83253c()), null, new DelegateHistoryViewModel$fetchBasicOrders$1(this, j11, assetType, str, null), 2, null);
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public final LiveData<Boolean> m35545P() {
        return this.f30087s0;
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final LiveData<List<TodoDelegateItem>> m35546Q() {
        return this.f30081m0;
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final LiveData<Boolean> m35547R() {
        return this.f30067Y;
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final LiveData<Boolean> m35548S() {
        return this.f30069a0;
    }

    @NotNull
    /* JADX INFO: renamed from: T */
    public final LiveData<Boolean> m35549T() {
        return this.f30085q0;
    }

    /* JADX INFO: renamed from: U */
    public final void m35550U(String str, Long l11, Function0<String> function0) {
        if (BrokerConfig.f19211a.m20201d().mo20229O()) {
            synchronized (this.f30090v0) {
                try {
                    if (Intrinsics.areEqual(str, C36695c.m82166a(function0.invoke()))) {
                        if (l11 != null && l11.longValue() != 0) {
                            TodoDelegateItem.OrderHistoryNumTipsInfo orderHistoryNumTipsInfo = Intrinsics.areEqual(str, OrderAssetType.SelfFunds.getTypeName()) ? new TodoDelegateItem.OrderHistoryNumTipsInfo(l11.longValue(), str, R$string.bkumex_order_hist_view_self) : new TodoDelegateItem.OrderHistoryNumTipsInfo(l11.longValue(), str, R$string.bkumex_order_hist_view_trial);
                            TodoDelegateItem todoDelegateItem = (TodoDelegateItem) CollectionsKt.firstOrNull((List) this.f30090v0);
                            if (todoDelegateItem instanceof TodoDelegateItem.OrderHistoryNumTipsInfo) {
                                this.f30090v0.remove(todoDelegateItem);
                                this.f30090v0.add(0, orderHistoryNumTipsInfo);
                            } else {
                                this.f30090v0.add(0, orderHistoryNumTipsInfo);
                            }
                            this.f30080l0.postValue(this.f30090v0);
                        } else if (CollectionsKt.firstOrNull((List) this.f30090v0) instanceof TodoDelegateItem.OrderHistoryNumTipsInfo) {
                            CollectionsKt.removeFirstOrNull(this.f30090v0);
                            this.f30080l0.postValue(this.f30090v0);
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: V */
    public final LiveData<Boolean> m35551V() {
        return this.f30077i0;
    }

    /* JADX INFO: renamed from: W */
    public final boolean m35552W(long j11) {
        return j11 == 1;
    }

    @NotNull
    /* JADX INFO: renamed from: X */
    public final LiveData<Boolean> m35553X() {
        return this.f30075g0;
    }

    @NotNull
    /* JADX INFO: renamed from: Y */
    public final LiveData<Boolean> m35554Y() {
        return this.f30079k0;
    }

    @NotNull
    /* JADX INFO: renamed from: Z */
    public final LiveData<Boolean> m35555Z() {
        return this.f30071c0;
    }

    @NotNull
    /* JADX INFO: renamed from: a0 */
    public final LiveData<Boolean> m35556a0() {
        return this.f30073e0;
    }

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public final LiveData<Boolean> m35557b0() {
        return this.f30083o0;
    }

    /* JADX INFO: renamed from: d0 */
    public final void m35559d0(long j11, @NotNull String assetType, @Nullable String str, @NotNull OrderEntity order, @NotNull Function4<? super Long, ? super String, ? super String, ? super Continuation<? super PageEntity<OrderEntity>>, ? extends Object> lastPageOrdersFetcher) throws JSONException {
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(order, "order");
        Intrinsics.checkNotNullParameter(lastPageOrdersFetcher, "lastPageOrdersFetcher");
        if (Intrinsics.areEqual(InterfaceC44980d.m99530V(RepositoryServiceLocator.f19236a.m20288g(), null, 1, null), "Paused")) {
            return;
        }
        String strB = com.kubi.kumex.trade.order.viewModel.q.b(order);
        if (strB.length() > 0) {
            String strM36552b = C17060n0.m36552b();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("orderType", strB);
            jSONObject.put("Quantity", C6447a.m11724a(C27039d.m66656p(order.getSize())).toPlainString());
            Unit unit = Unit.INSTANCE;
            C43852m.m96589a(strM36552b, "OrderCancel", "1", jSONObject);
        }
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b().plus(C37213a.m83253c()), null, new DelegateHistoryViewModel$revoke$2(this, order, lastPageOrdersFetcher, j11, assetType, str, null), 2, null);
    }

    /* JADX INFO: renamed from: e0 */
    public final void m35560e0(@NotNull Function0<Unit> revokeAllRunnable) {
        Intrinsics.checkNotNullParameter(revokeAllRunnable, "revokeAllRunnable");
        C43852m.m96591c(C17060n0.m36552b(), "OrderCancelAll", "1", null, 8, null);
        Flowable<Object> flowableObserveOn = FlowableCompat.f54248a.m66386c(revokeAllRunnable).subscribeOn(C42916f.m94127f()).observeOn(C42916f.m94128g());
        final Function1 function1 = new Function1() { // from class: com.kubi.kumex.record.currentDelegate.viewModel.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DelegateHistoryViewModel.m35526i0(this.f30130b, (InterfaceC44418d) obj);
            }
        };
        Flowable<Object> flowableDoOnSubscribe = flowableObserveOn.doOnSubscribe(new Consumer() { // from class: com.kubi.kumex.record.currentDelegate.viewModel.c
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                DelegateHistoryViewModel.m35527j0(function1, obj);
            }
        });
        Consumer<? super Object> consumer = new Consumer() { // from class: com.kubi.kumex.record.currentDelegate.viewModel.d
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                DelegateHistoryViewModel.m35523f0(this.f30132b, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.kumex.record.currentDelegate.viewModel.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DelegateHistoryViewModel.m35524g0(this.f30133b, (Throwable) obj);
            }
        };
        Disposable disposableSubscribe = flowableDoOnSubscribe.subscribe(consumer, new Consumer() { // from class: com.kubi.kumex.record.currentDelegate.viewModel.f
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                DelegateHistoryViewModel.m35525h0(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getF46845W());
    }

    @NotNull
    /* JADX INFO: renamed from: l0 */
    public final List<TodoDelegateItem> m35561l0(@NotNull PageEntity<OrderEntity> pageEntity, long j11) {
        Intrinsics.checkNotNullParameter(pageEntity, "<this>");
        MultiBizType multiBizTypeMo4515x = BrokerConfig.f19211a.m20201d().mo4515x();
        List<OrderEntity> items = pageEntity.getItems();
        ArrayList arrayList = new ArrayList();
        for (OrderEntity orderEntity : items) {
            orderEntity.setMultiBizType(multiBizTypeMo4515x);
            arrayList.add((C37568c.m84640k(orderEntity) || C37568c.m84641l(orderEntity)) ? new TodoDelegateItem.StopOrderInfo(j11, orderEntity) : C37568c.m84646q(orderEntity) ? new TodoDelegateItem.TsoOrderInfo(j11, orderEntity) : new TodoDelegateItem.ActiveOrderInfo(j11, orderEntity));
        }
        return arrayList;
    }

    public DelegateHistoryViewModel() {
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        this.f30066X = mutableLiveData;
        this.f30067Y = mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>();
        this.f30068Z = mutableLiveData2;
        this.f30069a0 = mutableLiveData2;
        MutableLiveData<Boolean> mutableLiveData3 = new MutableLiveData<>();
        this.f30070b0 = mutableLiveData3;
        this.f30071c0 = mutableLiveData3;
        MutableLiveData<Boolean> mutableLiveData4 = new MutableLiveData<>();
        this.f30072d0 = mutableLiveData4;
        this.f30073e0 = mutableLiveData4;
        MutableLiveData<Boolean> mutableLiveData5 = new MutableLiveData<>();
        this.f30074f0 = mutableLiveData5;
        this.f30075g0 = mutableLiveData5;
        MutableLiveData<Boolean> mutableLiveData6 = new MutableLiveData<>();
        this.f30076h0 = mutableLiveData6;
        this.f30077i0 = mutableLiveData6;
        MutableLiveData<Boolean> mutableLiveData7 = new MutableLiveData<>();
        this.f30078j0 = mutableLiveData7;
        this.f30079k0 = mutableLiveData7;
        MutableLiveData<List<TodoDelegateItem>> mutableLiveData8 = new MutableLiveData<>();
        this.f30080l0 = mutableLiveData8;
        this.f30081m0 = mutableLiveData8;
        MutableLiveData<Boolean> mutableLiveData9 = new MutableLiveData<>();
        this.f30082n0 = mutableLiveData9;
        this.f30083o0 = mutableLiveData9;
        MutableLiveData<Boolean> mutableLiveData10 = new MutableLiveData<>();
        this.f30084p0 = mutableLiveData10;
        this.f30085q0 = mutableLiveData10;
        MutableLiveData<Boolean> mutableLiveData11 = new MutableLiveData<>();
        this.f30086r0 = mutableLiveData11;
        this.f30087s0 = mutableLiveData11;
        this.f30090v0 = new CopyOnWriteArrayList<>();
    }

    /* JADX INFO: renamed from: h0 */
    public static final void m35525h0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: j0 */
    public static final void m35527j0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m35558c0(long j11) {
        if (m35552W(j11)) {
            this.f30068Z.postValue(Boolean.FALSE);
        } else {
            this.f30070b0.postValue(Boolean.FALSE);
        }
    }
}
