package com.kubi.assets.bill;

import androidx.lifecycle.ViewModelKt;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.FinanceBillBizType;
import com.kubi.assets.entity.FinanceBillProductCategory;
import com.kubi.sdk.BaseViewModel;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.utils.C27017c;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import kotlinx.coroutines.flow.InterfaceC41678w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: AccountBillCommonViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 -2\u00020\u0001:\u0001-B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J$\u0010\u001a\u001a\u00020\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\bJ\u0006\u0010\"\u001a\u00020\u0017J\u0006\u0010#\u001a\u00020\u0017J4\u0010$\u001a\u00020\u00172,\b\u0002\u0010%\u001a&\u0012\f\u0012\n\u0012\u0004\u0012\u00020(\u0018\u00010'\u0012\f\u0012\n\u0012\u0004\u0012\u00020)\u0018\u00010'\u0012\u0004\u0012\u00020\u0017\u0018\u00010&J\u0010\u0010*\u001a\u00020\u00192\b\u0010+\u001a\u0004\u0018\u00010\u0019J\u0010\u0010,\u001a\u00020\u00192\b\u0010+\u001a\u0004\u0018\u00010\u0019R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\f¨\u0006."}, m90084d2 = {"Lcom/kubi/assets/bill/AccountBillCommonViewModel;", "Lcom/kubi/sdk/BaseViewModel;", "<init>", "()V", "repository", "Lcom/kubi/assets/bill/AccountBillRepository;", "_filterState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/kubi/assets/bill/AccountBillFilterModel;", "filterState", "Lkotlinx/coroutines/flow/StateFlow;", "getFilterState", "()Lkotlinx/coroutines/flow/StateFlow;", "_listState", "Lcom/kubi/assets/bill/AccountBillListState;", "", "listState", "getListState", "_loadingState", "Lcom/kubi/assets/bill/LoadingState;", "loadingState", "getLoadingState", "initFilter", "", "accountType", "", "loadAccountBillList", "refresh", "", "isLoadMore", "pageIndex", "", "updateFilter", "newFilterState", "loadMore", "retry", "loadFinanceOptions", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "", "Lcom/kubi/assets/entity/FinanceBillBizType;", "Lcom/kubi/assets/entity/FinanceBillProductCategory;", "getFinanceBizTypeStr", "name", "getFinanceProductCategories", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAccountBillCommonViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountBillCommonViewModel.kt\ncom/kubi/assets/bill/AccountBillCommonViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,291:1\n230#2,5:292\n230#2,5:297\n1#3:302\n*S KotlinDebug\n*F\n+ 1 AccountBillCommonViewModel.kt\ncom/kubi/assets/bill/AccountBillCommonViewModel\n*L\n55#1:292,5\n70#1:297,5\n*E\n"})
public final class AccountBillCommonViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public static final Companion f16629e0 = new Companion(null);

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public static LinkedHashMap<String, List<FinanceBillBizType>> f16630f0 = new LinkedHashMap<>();

    /* JADX INFO: renamed from: g0 */
    @NotNull
    public static LinkedHashMap<String, List<FinanceBillProductCategory>> f16631g0 = new LinkedHashMap<>();

    /* JADX INFO: renamed from: X */
    @NotNull
    public final AccountBillRepository f16632X = new AccountBillRepository();

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final InterfaceC41669n<AccountBillFilterModel> f16633Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final InterfaceC41678w<AccountBillFilterModel> f16634Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final InterfaceC41669n<AccountBillListState<Object>> f16635a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final InterfaceC41678w<AccountBillListState<Object>> f16636b0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final InterfaceC41669n<LoadingState> f16637c0;

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final InterfaceC41678w<LoadingState> f16638d0;

    /* JADX INFO: compiled from: AccountBillCommonViewModel.kt */
    @Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000RF\u0010\b\u001a.\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\tj\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n`\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010RF\u0010\u0011\u001a.\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\n0\tj\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\n`\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/assets/bill/AccountBillCommonViewModel$Companion;", "", "<init>", "()V", "TAG", "", "PAGE_SIZE", "", "financeBizTypes", "Ljava/util/LinkedHashMap;", "", "Lcom/kubi/assets/entity/FinanceBillBizType;", "Lkotlin/collections/LinkedHashMap;", "getFinanceBizTypes", "()Ljava/util/LinkedHashMap;", "setFinanceBizTypes", "(Ljava/util/LinkedHashMap;)V", "financeProductCategories", "Lcom/kubi/assets/entity/FinanceBillProductCategory;", "getFinanceProductCategories", "setFinanceProductCategories", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void setFinanceBizTypes(@NotNull LinkedHashMap<String, List<FinanceBillBizType>> linkedHashMap) {
            Intrinsics.checkNotNullParameter(linkedHashMap, "<set-?>");
            AccountBillCommonViewModel.f16630f0 = linkedHashMap;
        }

        public final void setFinanceProductCategories(@NotNull LinkedHashMap<String, List<FinanceBillProductCategory>> linkedHashMap) {
            Intrinsics.checkNotNullParameter(linkedHashMap, "<set-?>");
            AccountBillCommonViewModel.f16631g0 = linkedHashMap;
        }

        @NotNull
        public final LinkedHashMap<String, List<FinanceBillBizType>> getFinanceBizTypes() {
            return AccountBillCommonViewModel.f16630f0;
        }

        @NotNull
        public final LinkedHashMap<String, List<FinanceBillProductCategory>> getFinanceProductCategories() {
            return AccountBillCommonViewModel.f16631g0;
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m15553H() {
        m15538E(this, true, false, 0, 6, null);
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m15538E(AccountBillCommonViewModel accountBillCommonViewModel, boolean z11, boolean z12, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z11 = false;
        }
        if ((i12 & 2) != 0) {
            z12 = false;
        }
        if ((i12 & 4) != 0) {
            i11 = 1;
        }
        accountBillCommonViewModel.m15550D(z11, z12, i11);
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final InterfaceC41678w<AccountBillListState<Object>> m15547A() {
        return this.f16636b0;
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public final InterfaceC41678w<LoadingState> m15548B() {
        return this.f16638d0;
    }

    /* JADX INFO: renamed from: C */
    public final void m15549C(@Nullable String str) {
        InterfaceC41669n<AccountBillFilterModel> interfaceC41669n = this.f16633Y;
        while (true) {
            AccountBillFilterModel value = interfaceC41669n.getValue();
            String str2 = str;
            if (interfaceC41669n.compareAndSet(value, AccountBillFilterModel.m15820b(value, null, null, null, null, str2, null, null, 111, null))) {
                return;
            } else {
                str = str2;
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m15550D(boolean z11, boolean z12, int i11) {
        AccountBillListState<Object> value;
        if (z11) {
            InterfaceC41669n<AccountBillListState<Object>> interfaceC41669n = this.f16635a0;
            do {
                value = interfaceC41669n.getValue();
            } while (!interfaceC41669n.compareAndSet(value, AccountBillListState.m15814b(value, null, 0, false, 1, 7, null)));
        }
        C44128b.m97259c(getF46844V(), "loadAccountBillList: refresh: " + z11 + " \nfilterState: " + this.f16633Y.getValue() + " \nlistState: pageIndex: " + this.f16635a0.getValue().getCurrentPage() + " \nsize: " + this.f16635a0.getValue().m15817d().size() + " \nhasMore: " + this.f16635a0.getValue().getHasMore() + " \n");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new AccountBillCommonViewModel$loadAccountBillList$2(this, z11, z12, i11, null), 3, null);
    }

    /* JADX INFO: renamed from: F */
    public final void m15551F(@Nullable Function2<? super List<FinanceBillBizType>, ? super List<FinanceBillProductCategory>, Unit> function2) {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new AccountBillCommonViewModel$loadFinanceOptions$1(MultiLanguageManager.f46811g.getLocalString(), function2, this, null), 3, null);
    }

    /* JADX INFO: renamed from: G */
    public final void m15552G() {
        if (this.f16635a0.getValue().getHasMore() && this.f16637c0.getValue() == LoadingState.IDLE) {
            m15550D(false, true, this.f16635a0.getValue().getCurrentPage() + 1);
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m15554I(@NotNull AccountBillFilterModel newFilterState) {
        Intrinsics.checkNotNullParameter(newFilterState, "newFilterState");
        if (this.f16633Y.getValue().m15829j(newFilterState)) {
            this.f16633Y.setValue(newFilterState);
            m15538E(this, true, false, 0, 6, null);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final InterfaceC41678w<AccountBillFilterModel> m15555x() {
        return this.f16634Z;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final String m15556y(@Nullable String str) {
        Object next;
        String name;
        List<FinanceBillBizType> list = f16630f0.get(MultiLanguageManager.f46811g.getLocalString());
        if (list != null) {
            Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(((FinanceBillBizType) next).getValue(), str));
            FinanceBillBizType financeBillBizType = (FinanceBillBizType) next;
            if (financeBillBizType != null && (name = financeBillBizType.getName()) != null) {
                return name;
            }
        }
        return C27017c.f54310a.m66516f(R$string.type, new Object[0]);
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final String m15557z(@Nullable String str) {
        Object next;
        String name;
        List<FinanceBillProductCategory> list = f16631g0.get(MultiLanguageManager.f46811g.getLocalString());
        if (list != null) {
            Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(((FinanceBillProductCategory) next).getValue(), str));
            FinanceBillProductCategory financeBillProductCategory = (FinanceBillProductCategory) next;
            if (financeBillProductCategory != null && (name = financeBillProductCategory.getName()) != null) {
                return name;
            }
        }
        return C27017c.f54310a.m66516f(R$string.earn_products, new Object[0]);
    }

    public AccountBillCommonViewModel() {
        InterfaceC41669n<AccountBillFilterModel> interfaceC41669nM91009a = C41679x.m91009a(new AccountBillFilterModel(null, null, null, null, null, null, null, 127, null));
        this.f16633Y = interfaceC41669nM91009a;
        this.f16634Z = C41636g.m90907c(interfaceC41669nM91009a);
        InterfaceC41669n<AccountBillListState<Object>> interfaceC41669nM91009a2 = C41679x.m91009a(new AccountBillListState(null, 0, false, 0, 15, null));
        this.f16635a0 = interfaceC41669nM91009a2;
        this.f16636b0 = C41636g.m90907c(interfaceC41669nM91009a2);
        InterfaceC41669n<LoadingState> interfaceC41669nM91009a3 = C41679x.m91009a(LoadingState.IDLE);
        this.f16637c0 = interfaceC41669nM91009a3;
        this.f16638d0 = C41636g.m90907c(interfaceC41669nM91009a3);
    }
}
