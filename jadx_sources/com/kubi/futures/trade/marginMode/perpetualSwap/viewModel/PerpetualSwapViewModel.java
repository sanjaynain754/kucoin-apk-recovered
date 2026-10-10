package com.kubi.futures.trade.marginMode.perpetualSwap.viewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.kubi.futures.trade.marginMode.perpetualSwap.data.QuoteModel;
import com.kubi.kumex.data.platform.model.SwitchFailedAggregationInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.C41696j;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import p236em.C37213a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: PerpetualSwapViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0006J\u000e\u0010+\u001a\u00020)2\u0006\u0010,\u001a\u00020-J\u001c\u0010.\u001a\u00020)2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u00100\u001a\u00020\u0006J\u0016\u00101\u001a\u00020)2\u0006\u00102\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u0006J\u0016\u00104\u001a\u00020)2\u0006\u00105\u001a\u00020-2\u0006\u0010*\u001a\u00020\u0006J\u001c\u00106\u001a\u00020)2\u0006\u00102\u001a\u00020\u00122\f\u00107\u001a\b\u0012\u0004\u0012\u00020)08J\u0014\u00109\u001a\u00020)2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\tR\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\tR\u001a\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00190\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00190\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\tR\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\tR\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\tR\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\tR\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\t¨\u0006;"}, m90084d2 = {"Lcom/kubi/futures/trade/marginMode/perpetualSwap/viewModel/PerpetualSwapViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "_isLoading", "Landroidx/lifecycle/MutableLiveData;", "", "isLoading", "Landroidx/lifecycle/LiveData;", "()Landroidx/lifecycle/LiveData;", "_dataIsEmpty", "dataIsEmpty", "getDataIsEmpty", "_dataIsError", "dataIsError", "getDataIsError", "_allQuotesDataFromNetwork", "", "Lcom/kubi/futures/trade/marginMode/perpetualSwap/data/QuoteModel;", "allQuotesDataFromNetwork", "getAllQuotesDataFromNetwork", "_searchedQuotes", "searchedQuotes", "getSearchedQuotes", "_selectedQuoteSymbol", "", "selectedQuoteSymbol", "getSelectedQuoteSymbol", "_switchFailedQuoteInfo", "Lcom/kubi/kumex/data/platform/model/SwitchFailedAggregationInfo;", "switchFailedQuoteInfo", "getSwitchFailedQuoteInfo", "_switchSuccess", "switchSuccess", "getSwitchSuccess", "_showCannotSwitchDialog", "showCannotSwitchDialog", "getShowCannotSwitchDialog", "_isAllSelected", "isAllSelected", "fetchAllQuotes", "", "isTrial", "onSearchTextChanged", "searchTextStr", "", "updateSelectedQuotes", "selectQuotes", "isSelected", "addSingleSelected", "quoteModel", "selected", "submitMarginMode", "marginMode", "trySelect", "selectedCallback", "Lkotlin/Function0;", "updateSelectAllButtonStatus", "curDisplayedQuotes", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPerpetualSwapViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PerpetualSwapViewModel.kt\ncom/kubi/futures/trade/marginMode/perpetualSwap/viewModel/PerpetualSwapViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,196:1\n1869#2,2:197\n1740#2,3:199\n774#2:202\n865#2,2:203\n1740#2,3:205\n*S KotlinDebug\n*F\n+ 1 PerpetualSwapViewModel.kt\ncom/kubi/futures/trade/marginMode/perpetualSwap/viewModel/PerpetualSwapViewModel\n*L\n108#1:197,2\n166#1:199,3\n172#1:202\n172#1:203,2\n172#1:205,3\n*E\n"})
public final class PerpetualSwapViewModel extends ViewModel {

    /* JADX INFO: renamed from: V */
    @NotNull
    public final MutableLiveData<Boolean> f23853V;

    /* JADX INFO: renamed from: W */
    @NotNull
    public final LiveData<Boolean> f23854W;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final MutableLiveData<Boolean> f23855X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final LiveData<Boolean> f23856Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final MutableLiveData<Boolean> f23857Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final LiveData<Boolean> f23858a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final MutableLiveData<List<QuoteModel>> f23859b0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final LiveData<List<QuoteModel>> f23860c0;

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final MutableLiveData<List<QuoteModel>> f23861d0;

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final LiveData<List<QuoteModel>> f23862e0;

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public final MutableLiveData<Set<QuoteModel>> f23863f0;

    /* JADX INFO: renamed from: g0 */
    @NotNull
    public final LiveData<Set<QuoteModel>> f23864g0;

    /* JADX INFO: renamed from: h0 */
    @NotNull
    public final MutableLiveData<SwitchFailedAggregationInfo> f23865h0;

    /* JADX INFO: renamed from: i0 */
    @NotNull
    public final LiveData<SwitchFailedAggregationInfo> f23866i0;

    /* JADX INFO: renamed from: j0 */
    @NotNull
    public final MutableLiveData<Boolean> f23867j0;

    /* JADX INFO: renamed from: k0 */
    @NotNull
    public final LiveData<Boolean> f23868k0;

    /* JADX INFO: renamed from: l0 */
    @NotNull
    public final MutableLiveData<Boolean> f23869l0;

    /* JADX INFO: renamed from: m0 */
    @NotNull
    public final LiveData<Boolean> f23870m0;

    /* JADX INFO: renamed from: n0 */
    @NotNull
    public final MutableLiveData<Boolean> f23871n0;

    /* JADX INFO: renamed from: o0 */
    @NotNull
    public final LiveData<Boolean> f23872o0;

    /* JADX INFO: renamed from: A */
    public final void m27103A(@NotNull QuoteModel quoteModel, @NotNull Function0<Unit> selectedCallback) {
        Intrinsics.checkNotNullParameter(quoteModel, "quoteModel");
        Intrinsics.checkNotNullParameter(selectedCallback, "selectedCallback");
        if (quoteModel.getSwitchable()) {
            selectedCallback.invoke();
        } else {
            this.f23869l0.postValue(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m27104B(@NotNull List<QuoteModel> curDisplayedQuotes) {
        Intrinsics.checkNotNullParameter(curDisplayedQuotes, "curDisplayedQuotes");
        boolean z11 = false;
        if (!curDisplayedQuotes.isEmpty() && !curDisplayedQuotes.isEmpty()) {
            Iterator<T> it = curDisplayedQuotes.iterator();
            while (it.hasNext()) {
                if (((QuoteModel) it.next()).getSwitchable()) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : curDisplayedQuotes) {
                        if (((QuoteModel) obj).getSwitchable()) {
                            arrayList.add(obj);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            if (!((QuoteModel) it2.next()).isSelected()) {
                                break;
                            }
                        }
                        z11 = true;
                        break;
                    }
                    z11 = true;
                    break;
                }
            }
        }
        this.f23871n0.setValue(Boolean.valueOf(z11));
    }

    /* JADX INFO: renamed from: C */
    public final void m27105C(@NotNull List<QuoteModel> selectQuotes, boolean z11) {
        Set<QuoteModel> linkedHashSet;
        Intrinsics.checkNotNullParameter(selectQuotes, "selectQuotes");
        Set<QuoteModel> value = this.f23863f0.getValue();
        if (value == null || (linkedHashSet = CollectionsKt.toMutableSet(value)) == null) {
            linkedHashSet = new LinkedHashSet<>();
        }
        for (QuoteModel quoteModel : selectQuotes) {
            if (z11 && quoteModel.getSwitchable()) {
                linkedHashSet.add(quoteModel);
            } else {
                linkedHashSet.remove(quoteModel);
            }
        }
        this.f23863f0.setValue(linkedHashSet);
    }

    /* JADX INFO: renamed from: k */
    public final void m27106k(@NotNull QuoteModel quoteModel, boolean z11) {
        Intrinsics.checkNotNullParameter(quoteModel, "quoteModel");
        m27105C(CollectionsKt.listOf(quoteModel), z11);
    }

    /* JADX INFO: renamed from: n */
    public final void m27107n(boolean z11) {
        this.f23863f0.setValue(SetsKt.emptySet());
        this.f23853V.setValue(Boolean.TRUE);
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b().plus(C37213a.m83254d()), null, new PerpetualSwapViewModel$fetchAllQuotes$1(this, z11, null), 2, null);
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final LiveData<List<QuoteModel>> m27108o() {
        return this.f23860c0;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final LiveData<Boolean> m27109p() {
        return this.f23856Y;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final LiveData<Boolean> m27110q() {
        return this.f23858a0;
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final LiveData<List<QuoteModel>> m27111r() {
        return this.f23862e0;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final LiveData<Set<QuoteModel>> m27112s() {
        return this.f23864g0;
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public final LiveData<Boolean> m27113t() {
        return this.f23870m0;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final LiveData<SwitchFailedAggregationInfo> m27114u() {
        return this.f23866i0;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final LiveData<Boolean> m27115v() {
        return this.f23868k0;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final LiveData<Boolean> m27116w() {
        return this.f23872o0;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final LiveData<Boolean> m27117x() {
        return this.f23854W;
    }

    /* JADX INFO: renamed from: y */
    public final void m27118y(@NotNull String searchTextStr) {
        Intrinsics.checkNotNullParameter(searchTextStr, "searchTextStr");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new PerpetualSwapViewModel$onSearchTextChanged$1(this, searchTextStr, null), 2, null);
    }

    /* JADX INFO: renamed from: z */
    public final void m27119z(@NotNull String marginMode, boolean z11) {
        Intrinsics.checkNotNullParameter(marginMode, "marginMode");
        this.f23853V.setValue(Boolean.TRUE);
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b().plus(C37213a.m83254d()), null, new PerpetualSwapViewModel$submitMarginMode$1(this, marginMode, z11, null), 2, null);
    }

    public PerpetualSwapViewModel() {
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        this.f23853V = mutableLiveData;
        this.f23854W = mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>();
        this.f23855X = mutableLiveData2;
        this.f23856Y = mutableLiveData2;
        MutableLiveData<Boolean> mutableLiveData3 = new MutableLiveData<>();
        this.f23857Z = mutableLiveData3;
        this.f23858a0 = mutableLiveData3;
        MutableLiveData<List<QuoteModel>> mutableLiveData4 = new MutableLiveData<>();
        this.f23859b0 = mutableLiveData4;
        this.f23860c0 = mutableLiveData4;
        MutableLiveData<List<QuoteModel>> mutableLiveData5 = new MutableLiveData<>();
        this.f23861d0 = mutableLiveData5;
        this.f23862e0 = mutableLiveData5;
        MutableLiveData<Set<QuoteModel>> mutableLiveData6 = new MutableLiveData<>();
        this.f23863f0 = mutableLiveData6;
        this.f23864g0 = mutableLiveData6;
        MutableLiveData<SwitchFailedAggregationInfo> mutableLiveData7 = new MutableLiveData<>();
        this.f23865h0 = mutableLiveData7;
        this.f23866i0 = mutableLiveData7;
        MutableLiveData<Boolean> mutableLiveData8 = new MutableLiveData<>();
        this.f23867j0 = mutableLiveData8;
        this.f23868k0 = mutableLiveData8;
        MutableLiveData<Boolean> mutableLiveData9 = new MutableLiveData<>();
        this.f23869l0 = mutableLiveData9;
        this.f23870m0 = mutableLiveData9;
        MutableLiveData<Boolean> mutableLiveData10 = new MutableLiveData<>();
        this.f23871n0 = mutableLiveData10;
        this.f23872o0 = mutableLiveData10;
    }
}
