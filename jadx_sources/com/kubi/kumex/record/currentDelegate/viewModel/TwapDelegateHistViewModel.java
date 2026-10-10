package com.kubi.kumex.record.currentDelegate.viewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.kubi.kumex.data.trade.model.OrderEntity;
import com.kubi.kumex.data.trade.model.TwapDelegateHistPageEntity;
import com.kubi.kumex.record.currentDelegate.adapter.TodoDelegateItem;
import com.kubi.sdk.BaseViewModel;
import com.kubi.utils.extensions.C27039d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlinx.coroutines.C41696j;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p236em.C37213a;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: TwapDelegateHistViewModel.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*J\u001c\u0010+\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010*J\u0010\u0010-\u001a\u00020(2\u0006\u0010.\u001a\u00020/H\u0002J\u001c\u00100\u001a\u00020(2\b\u00101\u001a\u0004\u0018\u0001022\b\u0010,\u001a\u0004\u0018\u00010*H\u0002J\u0012\u00103\u001a\u00020(2\b\u0010,\u001a\u0004\u0018\u00010*H\u0002J\u0012\u00104\u001a\u00020(2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*J\u001c\u00105\u001a\u00020(2\b\u00106\u001a\u0004\u0018\u00010*2\n\b\u0001\u00107\u001a\u0004\u0018\u00010*J\u0018\u00108\u001a\u00020(2\u0006\u00106\u001a\u00020*2\b\b\u0001\u00107\u001a\u00020*J\u0010\u00109\u001a\u00020(2\b\u00106\u001a\u0004\u0018\u00010*J\u000e\u0010:\u001a\u00020(2\u0006\u00106\u001a\u00020*R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\nR\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\nR\u001a\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\nR\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\nR\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\nR\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\nR\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006;"}, m90084d2 = {"Lcom/kubi/kumex/record/currentDelegate/viewModel/TwapDelegateHistViewModel;", "Lcom/kubi/sdk/BaseViewModel;", "<init>", "()V", "_showLoadDialog", "Landroidx/lifecycle/MutableLiveData;", "", "showLoadDialog", "Landroidx/lifecycle/LiveData;", "getShowLoadDialog", "()Landroidx/lifecycle/LiveData;", "_isPageError", "isPageError", "_isLoadMoreEnable", "isLoadMoreEnable", "_isLoadMoreError", "isLoadMoreError", "_showRefreshing", "showRefreshing", "getShowRefreshing", "_isLoadingMore", "isLoadingMore", "_orders", "", "Lcom/kubi/kumex/record/currentDelegate/adapter/TodoDelegateItem;", "orders", "getOrders", "_isOrdersEmpty", "isOrdersEmpty", "_allRevokeSucceed", "allRevokeSucceed", "getAllRevokeSucceed", "_singleRevokeUiStatus", "Lcom/kubi/kumex/trade/order/viewModel/SingleRevokeUiStatus;", "singleRevokeUiStatus", "getSingleRevokeUiStatus", "loadedRecords", "", "Lcom/kubi/kumex/data/trade/model/OrderEntity;", "fetchMore", "", "symbol", "", "fetchOrders", "orderIdLt", "dealLoadError", "ex", "", "dealLoadSuccess", "records", "Lcom/kubi/kumex/data/trade/model/TwapDelegateHistPageEntity;", "setLoadCompleted", "revokeAllTwapOrders", "pauseOrRestart", "orderId", "orderStatus", "refreshOrderPauseOrRestart", "terminate", "refreshOrderCanceled", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTwapDelegateHistViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TwapDelegateHistViewModel.kt\ncom/kubi/kumex/record/currentDelegate/viewModel/TwapDelegateHistViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,274:1\n1563#2:275\n1634#2,3:276\n1563#2:280\n1634#2,3:281\n1563#2:284\n1634#2,3:285\n1563#2:288\n1634#2,3:289\n1#3:279\n*S KotlinDebug\n*F\n+ 1 TwapDelegateHistViewModel.kt\ncom/kubi/kumex/record/currentDelegate/viewModel/TwapDelegateHistViewModel\n*L\n145#1:275\n145#1:276,3\n155#1:280\n155#1:281,3\n229#1:284\n229#1:285,3\n265#1:288\n265#1:289,3\n*E\n"})
public final class TwapDelegateHistViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final MutableLiveData<Boolean> f30108X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final LiveData<Boolean> f30109Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final MutableLiveData<Boolean> f30110Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final LiveData<Boolean> f30111a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final MutableLiveData<Boolean> f30112b0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final LiveData<Boolean> f30113c0;

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final MutableLiveData<Boolean> f30114d0;

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final LiveData<Boolean> f30115e0;

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public final MutableLiveData<Boolean> f30116f0;

    /* JADX INFO: renamed from: g0 */
    @NotNull
    public final LiveData<Boolean> f30117g0;

    /* JADX INFO: renamed from: h0 */
    @NotNull
    public final MutableLiveData<Boolean> f30118h0;

    /* JADX INFO: renamed from: i0 */
    @NotNull
    public final LiveData<Boolean> f30119i0;

    /* JADX INFO: renamed from: j0 */
    @NotNull
    public final MutableLiveData<List<TodoDelegateItem>> f30120j0;

    /* JADX INFO: renamed from: k0 */
    @NotNull
    public final LiveData<List<TodoDelegateItem>> f30121k0;

    /* JADX INFO: renamed from: l0 */
    @NotNull
    public final MutableLiveData<Boolean> f30122l0;

    /* JADX INFO: renamed from: m0 */
    @NotNull
    public final LiveData<Boolean> f30123m0;

    /* JADX INFO: renamed from: n0 */
    @NotNull
    public final MutableLiveData<Boolean> f30124n0;

    /* JADX INFO: renamed from: o0 */
    @NotNull
    public final LiveData<Boolean> f30125o0;

    /* JADX INFO: renamed from: p0 */
    @NotNull
    public final MutableLiveData<com.kubi.kumex.trade.order.viewModel.a> f30126p0;

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final LiveData<com.kubi.kumex.trade.order.viewModel.a> f30127q0;

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final List<OrderEntity> f30128r0;

    /* JADX INFO: renamed from: O */
    public static final boolean m35588O(String str, OrderEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getId(), str);
    }

    /* JADX INFO: renamed from: A */
    public final void m35599A(@Nullable String str) {
        OrderEntity orderEntity = (OrderEntity) CollectionsKt.lastOrNull((List) this.f30128r0);
        m35600B(str, orderEntity != null ? orderEntity.getId() : null);
    }

    /* JADX INFO: renamed from: B */
    public final void m35600B(@Nullable String str, @Nullable String str2) {
        this.f30116f0.setValue(Boolean.valueOf(str2 == null || str2.length() == 0));
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b().plus(C37213a.m83253c()), null, new TwapDelegateHistViewModel$fetchOrders$1(str, str2, this, null), 2, null);
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public final LiveData<Boolean> m35601C() {
        return this.f30125o0;
    }

    @NotNull
    /* JADX INFO: renamed from: D */
    public final LiveData<List<TodoDelegateItem>> m35602D() {
        return this.f30121k0;
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final LiveData<Boolean> m35603E() {
        return this.f30109Y;
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final LiveData<Boolean> m35604F() {
        return this.f30117g0;
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public final LiveData<com.kubi.kumex.trade.order.viewModel.a> m35605G() {
        return this.f30127q0;
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public final LiveData<Boolean> m35606H() {
        return this.f30113c0;
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public final LiveData<Boolean> m35607I() {
        return this.f30115e0;
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final LiveData<Boolean> m35608J() {
        return this.f30119i0;
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final LiveData<Boolean> m35609K() {
        return this.f30123m0;
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public final LiveData<Boolean> m35610L() {
        return this.f30111a0;
    }

    /* JADX INFO: renamed from: M */
    public final void m35611M(@Nullable String str, @Nullable String str2) {
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            return;
        }
        String str3 = Intrinsics.areEqual(str2, "PAUSED") ? "OPEN" : "PAUSED";
        this.f30108X.setValue(Boolean.TRUE);
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b().plus(C37213a.m83253c()), null, new TwapDelegateHistViewModel$pauseOrRestart$1(this, str, str3, str2, null), 2, null);
    }

    /* JADX INFO: renamed from: N */
    public final void m35612N(@NotNull final String orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        List<OrderEntity> list = this.f30128r0;
        final Function1 function1 = new Function1() { // from class: com.kubi.kumex.record.currentDelegate.viewModel.n
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(TwapDelegateHistViewModel.m35588O(orderId, (OrderEntity) obj));
            }
        };
        list.removeIf(new Predicate() { // from class: com.kubi.kumex.record.currentDelegate.viewModel.o
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return TwapDelegateHistViewModel.m35589P(function1, obj);
            }
        });
        List<OrderEntity> list2 = this.f30128r0;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new TodoDelegateItem.TwapOrderInfo(0L, (OrderEntity) it.next()));
        }
        List<TodoDelegateItem> mutableList = CollectionsKt.toMutableList((Collection) arrayList);
        if (this.f30128r0.isEmpty()) {
            this.f30122l0.setValue(Boolean.TRUE);
            this.f30120j0.setValue(CollectionsKt.listOf(TodoDelegateItem.d.f30004a));
        } else {
            this.f30120j0.setValue(mutableList);
            this.f30122l0.setValue(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m35613Q(@NotNull String orderId, @NotNull String orderStatus) {
        Object next;
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(orderStatus, "orderStatus");
        Iterator<T> it = this.f30128r0.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((OrderEntity) next).getId(), orderId));
        OrderEntity orderEntity = (OrderEntity) next;
        if (orderEntity != null) {
            orderEntity.setStatus((Intrinsics.areEqual(orderStatus, "OPEN") || Intrinsics.areEqual(orderStatus, "TRIGGERING")) ? "PAUSED" : "OPEN");
        }
        List<OrderEntity> list = this.f30128r0;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new TodoDelegateItem.TwapOrderInfo(0L, (OrderEntity) it2.next()));
        }
        this.f30120j0.setValue(arrayList);
    }

    /* JADX INFO: renamed from: R */
    public final void m35614R(@Nullable String str) {
        this.f30108X.setValue(Boolean.TRUE);
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b().plus(C37213a.m83253c()), null, new TwapDelegateHistViewModel$revokeAllTwapOrders$1(this, str, null), 2, null);
    }

    /* JADX INFO: renamed from: S */
    public final void m35615S(String str) {
        if (str == null || str.length() == 0) {
            this.f30116f0.setValue(Boolean.FALSE);
        }
        this.f30118h0.setValue(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: T */
    public final void m35616T(@Nullable String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        this.f30108X.setValue(Boolean.TRUE);
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b().plus(C37213a.m83253c()), null, new TwapDelegateHistViewModel$terminate$1(this, str, null), 2, null);
    }

    /* JADX INFO: renamed from: y */
    public final void m35617y(Throwable th2) {
        if (this.f30128r0.isEmpty()) {
            this.f30110Z.setValue(Boolean.TRUE);
            this.f30120j0.setValue(CollectionsKt.emptyList());
        } else {
            this.f30114d0.setValue(Boolean.TRUE);
        }
        this.f30122l0.setValue(Boolean.valueOf(this.f30128r0.isEmpty()));
    }

    /* JADX INFO: renamed from: z */
    public final void m35618z(TwapDelegateHistPageEntity twapDelegateHistPageEntity, String str) {
        List<TodoDelegateItem> mutableList;
        List<OrderEntity> items;
        if (twapDelegateHistPageEntity == null || (items = twapDelegateHistPageEntity.getItems()) == null || items.isEmpty()) {
            this.f30112b0.setValue(Boolean.FALSE);
            if (this.f30128r0.isEmpty()) {
                mutableList = CollectionsKt.listOf(TodoDelegateItem.d.f30004a);
            } else {
                List<OrderEntity> list = this.f30128r0;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new TodoDelegateItem.TwapOrderInfo(0L, (OrderEntity) it.next()));
                }
                mutableList = CollectionsKt.toMutableList((Collection) arrayList);
                mutableList.add(TodoDelegateItem.e.f30005a);
            }
            this.f30122l0.setValue(Boolean.valueOf(this.f30128r0.isEmpty()));
            this.f30120j0.setValue(mutableList);
            return;
        }
        List<OrderEntity> items2 = twapDelegateHistPageEntity.getItems();
        if (items2 != null) {
            this.f30128r0.addAll(items2);
        }
        List<OrderEntity> list2 = this.f30128r0;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new TodoDelegateItem.TwapOrderInfo(0L, (OrderEntity) it2.next()));
        }
        List<TodoDelegateItem> mutableList2 = CollectionsKt.toMutableList((Collection) arrayList2);
        if (C27039d.m66652l(twapDelegateHistPageEntity.getTotalPage()) <= 1) {
            mutableList2.add(TodoDelegateItem.e.f30005a);
            this.f30112b0.setValue(Boolean.FALSE);
        } else {
            this.f30112b0.setValue(Boolean.TRUE);
        }
        this.f30122l0.setValue(Boolean.FALSE);
        this.f30120j0.setValue(mutableList2);
    }

    public TwapDelegateHistViewModel() {
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        this.f30108X = mutableLiveData;
        this.f30109Y = mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>();
        this.f30110Z = mutableLiveData2;
        this.f30111a0 = mutableLiveData2;
        MutableLiveData<Boolean> mutableLiveData3 = new MutableLiveData<>();
        this.f30112b0 = mutableLiveData3;
        this.f30113c0 = mutableLiveData3;
        MutableLiveData<Boolean> mutableLiveData4 = new MutableLiveData<>();
        this.f30114d0 = mutableLiveData4;
        this.f30115e0 = mutableLiveData4;
        MutableLiveData<Boolean> mutableLiveData5 = new MutableLiveData<>();
        this.f30116f0 = mutableLiveData5;
        this.f30117g0 = mutableLiveData5;
        MutableLiveData<Boolean> mutableLiveData6 = new MutableLiveData<>();
        this.f30118h0 = mutableLiveData6;
        this.f30119i0 = mutableLiveData6;
        MutableLiveData<List<TodoDelegateItem>> mutableLiveData7 = new MutableLiveData<>();
        this.f30120j0 = mutableLiveData7;
        this.f30121k0 = mutableLiveData7;
        MutableLiveData<Boolean> mutableLiveData8 = new MutableLiveData<>();
        this.f30122l0 = mutableLiveData8;
        this.f30123m0 = mutableLiveData8;
        MutableLiveData<Boolean> mutableLiveData9 = new MutableLiveData<>();
        this.f30124n0 = mutableLiveData9;
        this.f30125o0 = mutableLiveData9;
        MutableLiveData<com.kubi.kumex.trade.order.viewModel.a> mutableLiveData10 = new MutableLiveData<>();
        this.f30126p0 = mutableLiveData10;
        this.f30127q0 = mutableLiveData10;
        this.f30128r0 = new ArrayList();
    }

    /* JADX INFO: renamed from: P */
    public static final boolean m35589P(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }
}
