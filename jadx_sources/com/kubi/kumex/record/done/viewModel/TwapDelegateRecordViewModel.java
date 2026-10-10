package com.kubi.kumex.record.done.viewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.kubi.kumex.data.trade.model.OrderEntity;
import com.kubi.kumex.data.trade.model.TwapDelegateHistPageEntity;
import com.kubi.kumex.record.done.adapter.DelegateRecordItem;
import com.kubi.sdk.BaseViewModel;
import com.kubi.utils.extensions.C27039d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.C41696j;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p236em.C37213a;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: TwapDelegateRecordViewModel.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0002\u0010$J\u0010\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020'H\u0002J!\u0010(\u001a\u00020\u001c2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0002\u0010+J\u0017\u0010,\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0002\u0010-R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\tR\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\tR\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\tR\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, m90084d2 = {"Lcom/kubi/kumex/record/done/viewModel/TwapDelegateRecordViewModel;", "Lcom/kubi/sdk/BaseViewModel;", "<init>", "()V", "_isPageError", "Landroidx/lifecycle/MutableLiveData;", "", "isPageError", "Landroidx/lifecycle/LiveData;", "()Landroidx/lifecycle/LiveData;", "_isLoadMoreEnable", "isLoadMoreEnable", "_isLoadMoreError", "isLoadMoreError", "_showRefreshing", "showRefreshing", "getShowRefreshing", "_isLoadingMore", "isLoadingMore", "_orders", "", "Lcom/kubi/kumex/record/done/adapter/DelegateRecordItem;", "orders", "getOrders", "loadedRecords", "", "Lcom/kubi/kumex/data/trade/model/OrderEntity;", "fetchRecords", "", "symbol", "", "currentPage", "", "startTime", "", "endTime", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;)V", "dealLoadError", "ex", "", "dealLoadSuccess", "records", "Lcom/kubi/kumex/data/trade/model/TwapDelegateHistPageEntity;", "(Lcom/kubi/kumex/data/trade/model/TwapDelegateHistPageEntity;Ljava/lang/Integer;)V", "setLoadCompleted", "(Ljava/lang/Integer;)V", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTwapDelegateRecordViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TwapDelegateRecordViewModel.kt\ncom/kubi/kumex/record/done/viewModel/TwapDelegateRecordViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,140:1\n1563#2:141\n1634#2,3:142\n1563#2:146\n1634#2,3:147\n1#3:145\n*S KotlinDebug\n*F\n+ 1 TwapDelegateRecordViewModel.kt\ncom/kubi/kumex/record/done/viewModel/TwapDelegateRecordViewModel\n*L\n114#1:141\n114#1:142,3\n123#1:146\n123#1:147,3\n*E\n"})
public final class TwapDelegateRecordViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final MutableLiveData<Boolean> f30209X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final LiveData<Boolean> f30210Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final MutableLiveData<Boolean> f30211Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final LiveData<Boolean> f30212a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final MutableLiveData<Boolean> f30213b0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final LiveData<Boolean> f30214c0;

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final MutableLiveData<Boolean> f30215d0;

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final LiveData<Boolean> f30216e0;

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public final MutableLiveData<Boolean> f30217f0;

    /* JADX INFO: renamed from: g0 */
    @NotNull
    public final LiveData<Boolean> f30218g0;

    /* JADX INFO: renamed from: h0 */
    @NotNull
    public final MutableLiveData<List<DelegateRecordItem>> f30219h0;

    /* JADX INFO: renamed from: i0 */
    @NotNull
    public final LiveData<List<DelegateRecordItem>> f30220i0;

    /* JADX INFO: renamed from: j0 */
    @NotNull
    public final List<OrderEntity> f30221j0;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public final void m35704t(Throwable th2) {
        if (!this.f30221j0.isEmpty()) {
            this.f30213b0.setValue(Boolean.TRUE);
        } else {
            this.f30209X.setValue(Boolean.TRUE);
            this.f30219h0.setValue(CollectionsKt.emptyList());
        }
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final LiveData<Boolean> m35705A() {
        return this.f30218g0;
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public final LiveData<Boolean> m35706B() {
        return this.f30210Y;
    }

    /* JADX INFO: renamed from: C */
    public final void m35707C(Integer num) {
        if (num == null || num.intValue() == 1) {
            this.f30215d0.setValue(Boolean.FALSE);
        }
        this.f30217f0.setValue(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: u */
    public final void m35708u(TwapDelegateHistPageEntity twapDelegateHistPageEntity, Integer num) {
        List<DelegateRecordItem> mutableList;
        List<OrderEntity> items;
        if (twapDelegateHistPageEntity == null || (items = twapDelegateHistPageEntity.getItems()) == null || items.isEmpty()) {
            this.f30211Z.setValue(Boolean.FALSE);
            if (this.f30221j0.isEmpty()) {
                mutableList = CollectionsKt.listOf(DelegateRecordItem.a.f30186a);
            } else {
                List<OrderEntity> list = this.f30221j0;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new DelegateRecordItem.TwapOrderInfo((OrderEntity) it.next()));
                }
                mutableList = CollectionsKt.toMutableList((Collection) arrayList);
                mutableList.add(DelegateRecordItem.b.f30187a);
            }
            this.f30219h0.setValue(mutableList);
            return;
        }
        List<OrderEntity> items2 = twapDelegateHistPageEntity.getItems();
        if (items2 != null) {
            this.f30221j0.addAll(items2);
        }
        List<OrderEntity> list2 = this.f30221j0;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new DelegateRecordItem.TwapOrderInfo((OrderEntity) it2.next()));
        }
        List<DelegateRecordItem> mutableList2 = CollectionsKt.toMutableList((Collection) arrayList2);
        if (C27039d.m66650j(num) >= C27039d.m66652l(twapDelegateHistPageEntity.getTotalPage())) {
            mutableList2.add(DelegateRecordItem.b.f30187a);
            this.f30211Z.setValue(Boolean.FALSE);
        } else {
            this.f30211Z.setValue(Boolean.TRUE);
        }
        this.f30219h0.setValue(mutableList2);
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final LiveData<List<DelegateRecordItem>> m35710w() {
        return this.f30220i0;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final LiveData<Boolean> m35711x() {
        return this.f30216e0;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final LiveData<Boolean> m35712y() {
        return this.f30212a0;
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final LiveData<Boolean> m35713z() {
        return this.f30214c0;
    }

    public TwapDelegateRecordViewModel() {
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        this.f30209X = mutableLiveData;
        this.f30210Y = mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>();
        this.f30211Z = mutableLiveData2;
        this.f30212a0 = mutableLiveData2;
        MutableLiveData<Boolean> mutableLiveData3 = new MutableLiveData<>();
        this.f30213b0 = mutableLiveData3;
        this.f30214c0 = mutableLiveData3;
        MutableLiveData<Boolean> mutableLiveData4 = new MutableLiveData<>();
        this.f30215d0 = mutableLiveData4;
        this.f30216e0 = mutableLiveData4;
        MutableLiveData<Boolean> mutableLiveData5 = new MutableLiveData<>();
        this.f30217f0 = mutableLiveData5;
        this.f30218g0 = mutableLiveData5;
        MutableLiveData<List<DelegateRecordItem>> mutableLiveData6 = new MutableLiveData<>();
        this.f30219h0 = mutableLiveData6;
        this.f30220i0 = mutableLiveData6;
        this.f30221j0 = new ArrayList();
    }

    /* JADX INFO: renamed from: v */
    public final void m35709v(@Nullable String str, @Nullable Integer num, @Nullable Long l11, @Nullable Long l12) {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b().plus(C37213a.m83253c()), null, new TwapDelegateRecordViewModel$fetchRecords$1(str, l11, l12, num, this, null), 2, null);
    }
}
