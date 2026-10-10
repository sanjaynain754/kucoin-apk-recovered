package com.kubi.assets.bill;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.FinanceBillBizType;
import com.kubi.assets.entity.FinanceBillItemEntity;
import com.kubi.assets.entity.FinanceBillProductCategory;
import com.kubi.resources.dialog.BaseDialogFragment;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.C23057g1;
import com.kubi.resources.widget.SwipeRefreshRecyclerView;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.tencent.qcloud.tuicore.TUIConstants;
import hb0.InterfaceC38162f;
import io.chad.library.adapter.base.BaseQuickAdapter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jb0.InterfaceC40373g;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p637ta.C44736c;
import p637ta.C44744d;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import ro.C44128b;
import w00.C45681e;

/* JADX INFO: compiled from: AccountBillFinanceFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 %2\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0017\u001a\u00020\u0015H\u0002J\b\u0010\u0018\u001a\u00020\u0015H\u0002J\b\u0010\u0019\u001a\u00020\u0015H\u0002J\u0016\u0010\u001a\u001a\u00020\u00152\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002J\u0010\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020\u0015H\u0002J\u0006\u0010\"\u001a\u00020\u0015J\b\u0010#\u001a\u00020\u0015H\u0002J\b\u0010$\u001a\u00020\u0015H\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000¨\u0006&"}, m90084d2 = {"Lcom/kubi/assets/bill/AccountBillFinanceFragment;", "Lcom/kubi/assets/bill/AccountBillBaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/assets/databinding/AssetAccountBillFinanceFragmentBinding;", "getBinding", "()Lcom/kubi/assets/databinding/AssetAccountBillFinanceFragmentBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "accountBillAdapter", "Lcom/kubi/assets/bill/FinanceAccountBillAdapter;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initViews", "setupRecyclerView", "observeViewModel", "updateListData", "listState", "Lcom/kubi/assets/bill/AccountBillListState;", "Lcom/kubi/assets/entity/FinanceBillItemEntity;", "updateLoadingState", "loadingState", "Lcom/kubi/assets/bill/LoadingState;", "updateErrorState", "showFinanceBizTypeDialog", "showFinanceCategoryDialog", "resetFilterIcon", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAccountBillFinanceFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountBillFinanceFragment.kt\ncom/kubi/assets/bill/AccountBillFinanceFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,285:1\n147#2,16:286\n1563#3:302\n1634#3,3:303\n1563#3:306\n1634#3,3:307\n*S KotlinDebug\n*F\n+ 1 AccountBillFinanceFragment.kt\ncom/kubi/assets/bill/AccountBillFinanceFragment\n*L\n40#1:286,16\n218#1:302\n218#1:303,3\n255#1:306\n255#1:307,3\n*E\n"})
public final class AccountBillFinanceFragment extends AccountBillBaseFragment {

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final InterfaceC24293a f16644Y = C45681e.m100799e(this, new Function1<AccountBillFinanceFragment, C44744d>() { // from class: com.kubi.assets.bill.AccountBillFinanceFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44744d invoke(@NotNull AccountBillFinanceFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44744d.m99000a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44744d, Unit>() { // from class: com.kubi.assets.bill.AccountBillFinanceFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44744d it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44744d c44744d) {
            invoke(c44744d);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: Z */
    public FinanceAccountBillAdapter f16645Z;

    /* JADX INFO: renamed from: b0 */
    public static final /* synthetic */ KProperty<Object>[] f16643b0 = {Reflection.property1(new PropertyReference1Impl(AccountBillFinanceFragment.class, "binding", "getBinding()Lcom/kubi/assets/databinding/AssetAccountBillFinanceFragmentBinding;", 0))};

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public static final Companion f16642a0 = new Companion(null);

    /* JADX INFO: compiled from: AccountBillFinanceFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007¨\u0006\t"}, m90084d2 = {"Lcom/kubi/assets/bill/AccountBillFinanceFragment$Companion;", "", "<init>", "()V", "create", "Lcom/kubi/assets/bill/AccountBillFinanceFragment;", "accountType", "", "requestBizType", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final AccountBillFinanceFragment create(@NotNull String accountType, @Nullable String requestBizType) {
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            AccountBillFinanceFragment accountBillFinanceFragment = new AccountBillFinanceFragment();
            accountBillFinanceFragment.setArguments(BundleKt.bundleOf(TuplesKt.m90091to("accountType", accountType), TuplesKt.m90091to("requestBizType", requestBizType)));
            return accountBillFinanceFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.bill.AccountBillFinanceFragment$b */
    /* JADX INFO: compiled from: AccountBillFinanceFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/kubi/assets/bill/AccountBillFinanceFragment$setupRecyclerView$1$2", "Lio/chad/library/adapter/base/BaseQuickAdapter$RequestLoadMoreListener;", "onLoadMoreRequested", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C9546b implements BaseQuickAdapter.RequestLoadMoreListener {
        public C9546b() {
        }

        @Override // io.chad.library.adapter.base.BaseQuickAdapter.RequestLoadMoreListener
        public void onLoadMoreRequested() {
            AccountBillFinanceFragment.this.m15496C3().m15552G();
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.bill.AccountBillFinanceFragment$a */
    /* JADX INFO: compiled from: AccountBillFinanceFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C9545a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoadingState.values().length];
            try {
                iArr[LoadingState.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoadingState.REFRESHING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoadingState.LOADING_MORE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LoadingState.IDLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LoadingState.LOAD_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x004e  */
    /* JADX INFO: renamed from: A4 */
    public static final Unit m15563A4(final AccountBillFinanceFragment accountBillFinanceFragment, List list, List list2) {
        List<FilterOptionItem> arrayList;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                FinanceBillBizType financeBillBizType = (FinanceBillBizType) it.next();
                arrayList2.add(new FilterOptionItem(financeBillBizType.getValue(), financeBillBizType.getName(), Intrinsics.areEqual(financeBillBizType.getValue(), accountBillFinanceFragment.m15496C3().m15555x().getValue().getBizType())));
            }
            arrayList = CollectionsKt.toMutableList((Collection) arrayList2);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
        } else {
            arrayList = new ArrayList<>();
        }
        String string = accountBillFinanceFragment.getString(R$string.all);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        arrayList.add(0, new FilterOptionItem(TtmlNode.COMBINE_ALL, string, accountBillFinanceFragment.m15496C3().m15555x().getValue().getBizType() == null));
        FilterOptionDialog.Companion companion = FilterOptionDialog.f16691u0;
        String string2 = accountBillFinanceFragment.getString(R$string.type);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        BaseDialogFragment baseDialogFragmentM54192r3 = companion.create(string2, arrayList).m15736u4(new Function1() { // from class: com.kubi.assets.bill.b0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountBillFinanceFragment.m15564B4(this.f16732b, (String) obj);
            }
        }).m54192r3(new DialogInterface.OnDismissListener() { // from class: com.kubi.assets.bill.c0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                AccountBillFinanceFragment.m15565C4(this.f16737b, dialogInterface);
            }
        });
        FragmentManager childFragmentManager = accountBillFinanceFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        baseDialogFragmentM54192r3.show(childFragmentManager, "BizTypeDialogFragment");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x004e  */
    /* JADX INFO: renamed from: E4 */
    public static final Unit m15566E4(final AccountBillFinanceFragment accountBillFinanceFragment, List list, List list2) {
        List<FilterOptionItem> arrayList;
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                FinanceBillProductCategory financeBillProductCategory = (FinanceBillProductCategory) it.next();
                arrayList2.add(new FilterOptionItem(financeBillProductCategory.getValue(), financeBillProductCategory.getName(), Intrinsics.areEqual(financeBillProductCategory.getValue(), accountBillFinanceFragment.m15496C3().m15555x().getValue().getProductCategory())));
            }
            arrayList = CollectionsKt.toMutableList((Collection) arrayList2);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
        } else {
            arrayList = new ArrayList<>();
        }
        FilterOptionDialog.Companion companion = FilterOptionDialog.f16691u0;
        String string = accountBillFinanceFragment.getString(R$string.type);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        BaseDialogFragment baseDialogFragmentM54192r3 = companion.create(string, arrayList).m15736u4(new Function1() { // from class: com.kubi.assets.bill.d0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountBillFinanceFragment.m15567F4(this.f16741b, (String) obj);
            }
        }).m54192r3(new DialogInterface.OnDismissListener() { // from class: com.kubi.assets.bill.e0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                AccountBillFinanceFragment.m15568G4(this.f16746b, dialogInterface);
            }
        });
        FragmentManager childFragmentManager = accountBillFinanceFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        baseDialogFragmentM54192r3.show(childFragmentManager, "FinanceCategoryDialog");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q4 */
    public static final void m15591q4(AccountBillFinanceFragment accountBillFinanceFragment, InterfaceC38162f it) {
        Intrinsics.checkNotNullParameter(it, "it");
        AccountBillCommonViewModel.m15538E(accountBillFinanceFragment.m15496C3(), true, false, 0, 6, null);
    }

    /* JADX INFO: renamed from: r4 */
    public static final void m15592r4(AccountBillFinanceFragment accountBillFinanceFragment, C44744d c44744d, View view) {
        BaseTextView selectCoin = c44744d.f99717b.f99652b;
        Intrinsics.checkNotNullExpressionValue(selectCoin, "selectCoin");
        accountBillFinanceFragment.m15499G3(selectCoin, true);
        accountBillFinanceFragment.m15503R3();
    }

    /* JADX INFO: renamed from: s4 */
    public static final void m15593s4(AccountBillFinanceFragment accountBillFinanceFragment, C44744d c44744d, View view) {
        BaseTextView selectCoin = c44744d.f99717b.f99652b;
        Intrinsics.checkNotNullExpressionValue(selectCoin, "selectCoin");
        accountBillFinanceFragment.m15499G3(selectCoin, true);
        accountBillFinanceFragment.m15501L3();
    }

    /* JADX INFO: renamed from: t4 */
    public static final void m15594t4(AccountBillFinanceFragment accountBillFinanceFragment, C44744d c44744d, View view) {
        BaseTextView selectType = c44744d.f99717b.f99655e;
        Intrinsics.checkNotNullExpressionValue(selectType, "selectType");
        accountBillFinanceFragment.m15499G3(selectType, true);
        accountBillFinanceFragment.m15602z4();
    }

    /* JADX INFO: renamed from: u4 */
    public static final void m15595u4(AccountBillFinanceFragment accountBillFinanceFragment, C44744d c44744d, View view) {
        BaseTextView selectProductType = c44744d.f99717b.f99653c;
        Intrinsics.checkNotNullExpressionValue(selectProductType, "selectProductType");
        accountBillFinanceFragment.m15499G3(selectProductType, true);
        accountBillFinanceFragment.m15600D4();
    }

    /* JADX INFO: renamed from: y4 */
    public static final Unit m15599y4(AccountBillFinanceFragment accountBillFinanceFragment, FinanceBillItemEntity item) {
        Intrinsics.checkNotNullParameter(item, "item");
        accountBillFinanceFragment.m15497D3(item);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o4 */
    public final C44744d m15601o4() {
        return (C44744d) this.f16644Y.getValue(this, f16643b0[0]);
    }

    @Override // com.kubi.assets.bill.AccountBillBaseFragment, com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.asset_account_bill_finance_fragment, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.showLoadingView$default(this, 0, 0, 3, null);
        m15590p4();
        m15596v4();
        m15496C3().m15549C(m15494A3());
        AccountBillCommonViewModel.m15538E(m15496C3(), true, false, 0, 6, null);
        m15496C3().m15551F(new Function2() { // from class: com.kubi.assets.bill.a0
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AccountBillFinanceFragment.m15597w4(this.f16730b, (List) obj, (List) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: B4 */
    public static final Unit m15564B4(AccountBillFinanceFragment accountBillFinanceFragment, String str) {
        C44128b.m97259c(accountBillFinanceFragment.getTAG(), "bizType: " + str);
        if (Intrinsics.areEqual(str, TtmlNode.COMBINE_ALL)) {
            str = null;
        }
        accountBillFinanceFragment.m15496C3().m15554I(AccountBillFilterModel.m15820b(accountBillFinanceFragment.m15496C3().m15555x().getValue(), null, str, null, null, null, null, null, 125, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C4 */
    public static final void m15565C4(AccountBillFinanceFragment accountBillFinanceFragment, DialogInterface dialogInterface) {
        accountBillFinanceFragment.mo15498F3();
    }

    /* JADX INFO: renamed from: F4 */
    public static final Unit m15567F4(AccountBillFinanceFragment accountBillFinanceFragment, String str) {
        C44128b.m97259c(accountBillFinanceFragment.getTAG(), "type: " + str);
        accountBillFinanceFragment.m15496C3().m15554I(AccountBillFilterModel.m15820b(accountBillFinanceFragment.m15496C3().m15555x().getValue(), null, null, null, null, null, null, str, 63, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G4 */
    public static final void m15568G4(AccountBillFinanceFragment accountBillFinanceFragment, DialogInterface dialogInterface) {
        accountBillFinanceFragment.mo15498F3();
    }

    /* JADX INFO: renamed from: H4 */
    private final void m15569H4() {
        if (m15601o4() != null) {
            if (m15496C3().m15547A().getValue().m15817d().isEmpty()) {
                BaseFragment.showFailView$default(this, 0, 0, new View.OnClickListener() { // from class: com.kubi.assets.bill.k0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        AccountBillFinanceFragment.m15570I4(this.f16774b, view);
                    }
                }, 3, (Object) null);
            } else {
                showContentView();
            }
        }
    }

    /* JADX INFO: renamed from: I4 */
    public static final void m15570I4(AccountBillFinanceFragment accountBillFinanceFragment, View view) {
        accountBillFinanceFragment.m15496C3().m15553H();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J4 */
    public final void m15571J4(AccountBillListState<FinanceBillItemEntity> accountBillListState) {
        if (m15601o4() != null) {
            FinanceAccountBillAdapter financeAccountBillAdapter = null;
            if (accountBillListState.m15817d().isEmpty()) {
                FinanceAccountBillAdapter financeAccountBillAdapter2 = this.f16645Z;
                if (financeAccountBillAdapter2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("accountBillAdapter");
                    financeAccountBillAdapter2 = null;
                }
                financeAccountBillAdapter2.setEmptyView(R$layout.view_empty);
            }
            FinanceAccountBillAdapter financeAccountBillAdapter3 = this.f16645Z;
            if (financeAccountBillAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("accountBillAdapter");
                financeAccountBillAdapter3 = null;
            }
            financeAccountBillAdapter3.setNewData(CollectionsKt.toList(accountBillListState.m15817d()));
            FinanceAccountBillAdapter financeAccountBillAdapter4 = this.f16645Z;
            if (financeAccountBillAdapter4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("accountBillAdapter");
            } else {
                financeAccountBillAdapter = financeAccountBillAdapter4;
            }
            financeAccountBillAdapter.setEnableLoadMore(accountBillListState.getHasMore());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K4 */
    public final void m15572K4(LoadingState loadingState) {
        SwipeRefreshRecyclerView swipeRefreshRecyclerView;
        SwipeRefreshRecyclerView swipeRefreshRecyclerView2;
        SwipeRefreshRecyclerView swipeRefreshRecyclerView3;
        if (m15601o4() != null) {
            int i11 = C9545a.$EnumSwitchMapping$0[loadingState.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 == 5) {
                                m15569H4();
                                C44744d c44744dM15601o4 = m15601o4();
                                if (c44744dM15601o4 != null && (swipeRefreshRecyclerView3 = c44744dM15601o4.f99718c) != null) {
                                    swipeRefreshRecyclerView3.setRefreshing(false);
                                    return;
                                }
                                return;
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        showContentView();
                        C44744d c44744dM15601o5 = m15601o4();
                        if (c44744dM15601o5 != null && (swipeRefreshRecyclerView2 = c44744dM15601o5.f99718c) != null) {
                            swipeRefreshRecyclerView2.setRefreshing(false);
                            return;
                        }
                        return;
                    }
                    showContentView();
                    return;
                }
                showContentView();
                C44744d c44744dM15601o6 = m15601o4();
                if (c44744dM15601o6 != null && (swipeRefreshRecyclerView = c44744dM15601o6.f99718c) != null) {
                    swipeRefreshRecyclerView.setRefreshing(true);
                    return;
                }
                return;
            }
            BaseFragment.showLoadingView$default(this, 0, 0, 3, null);
        }
    }

    /* JADX INFO: renamed from: p4 */
    private final void m15590p4() {
        final C44744d c44744dM15601o4 = m15601o4();
        if (c44744dM15601o4 != null) {
            c44744dM15601o4.f99718c.setOnRefreshListener(new InterfaceC40373g() { // from class: com.kubi.assets.bill.f0
                @Override // jb0.InterfaceC40373g
                /* JADX INFO: renamed from: a */
                public final void mo15329a(InterfaceC38162f interfaceC38162f) {
                    AccountBillFinanceFragment.m15591q4(this.f16749b, interfaceC38162f);
                }
            });
            c44744dM15601o4.f99717b.f99652b.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.assets.bill.g0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AccountBillFinanceFragment.m15592r4(this.f16752b, c44744dM15601o4, view);
                }
            });
            c44744dM15601o4.f99717b.f99654d.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.assets.bill.h0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AccountBillFinanceFragment.m15593s4(this.f16756b, c44744dM15601o4, view);
                }
            });
            c44744dM15601o4.f99717b.f99655e.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.assets.bill.i0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AccountBillFinanceFragment.m15594t4(this.f16762b, c44744dM15601o4, view);
                }
            });
            c44744dM15601o4.f99717b.f99653c.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.assets.bill.j0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AccountBillFinanceFragment.m15595u4(this.f16770b, c44744dM15601o4, view);
                }
            });
        }
        m15598x4();
    }

    /* JADX INFO: renamed from: v4 */
    private final void m15596v4() {
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AccountBillFinanceFragment$observeViewModel$1(this, null), 3, null);
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AccountBillFinanceFragment$observeViewModel$2(this, null), 3, null);
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AccountBillFinanceFragment$observeViewModel$3(this, null), 3, null);
    }

    /* JADX INFO: renamed from: w4 */
    public static final Unit m15597w4(AccountBillFinanceFragment accountBillFinanceFragment, List list, List list2) {
        String value;
        FinanceBillProductCategory financeBillProductCategory;
        if (accountBillFinanceFragment.m15496C3().m15555x().getValue().getProductCategory() == null) {
            AccountBillCommonViewModel accountBillCommonViewModelM15496C3 = accountBillFinanceFragment.m15496C3();
            AccountBillFilterModel value2 = accountBillFinanceFragment.m15496C3().m15555x().getValue();
            if (list2 != null && (financeBillProductCategory = (FinanceBillProductCategory) CollectionsKt.firstOrNull(list2)) != null) {
                value = financeBillProductCategory.getValue();
            } else {
                value = null;
            }
            accountBillCommonViewModelM15496C3.m15554I(AccountBillFilterModel.m15820b(value2, null, null, null, null, null, null, value, 63, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x4 */
    private final void m15598x4() {
        SwipeRefreshRecyclerView swipeRefreshRecyclerView;
        RecyclerView recyclerView;
        C44744d c44744dM15601o4 = m15601o4();
        if (c44744dM15601o4 != null && (swipeRefreshRecyclerView = c44744dM15601o4.f99718c) != null && (recyclerView = swipeRefreshRecyclerView.getRecyclerView()) != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            FinanceAccountBillAdapter financeAccountBillAdapter = new FinanceAccountBillAdapter(new ArrayList());
            this.f16645Z = financeAccountBillAdapter;
            financeAccountBillAdapter.setLoadMoreView(new C23057g1());
            FinanceAccountBillAdapter financeAccountBillAdapter2 = this.f16645Z;
            FinanceAccountBillAdapter financeAccountBillAdapter3 = null;
            if (financeAccountBillAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("accountBillAdapter");
                financeAccountBillAdapter2 = null;
            }
            recyclerView.setAdapter(financeAccountBillAdapter2);
            FinanceAccountBillAdapter financeAccountBillAdapter4 = this.f16645Z;
            if (financeAccountBillAdapter4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("accountBillAdapter");
                financeAccountBillAdapter4 = null;
            }
            financeAccountBillAdapter4.m15745j(new Function1() { // from class: com.kubi.assets.bill.m0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AccountBillFinanceFragment.m15599y4(this.f16780b, (FinanceBillItemEntity) obj);
                }
            });
            FinanceAccountBillAdapter financeAccountBillAdapter5 = this.f16645Z;
            if (financeAccountBillAdapter5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("accountBillAdapter");
            } else {
                financeAccountBillAdapter3 = financeAccountBillAdapter5;
            }
            financeAccountBillAdapter3.setOnLoadMoreListener(new C9546b(), recyclerView);
        }
    }

    /* JADX INFO: renamed from: D4 */
    public final void m15600D4() {
        m15496C3().m15551F(new Function2() { // from class: com.kubi.assets.bill.n0
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AccountBillFinanceFragment.m15566E4(this.f16783b, (List) obj, (List) obj2);
            }
        });
    }

    @Override // com.kubi.assets.bill.AccountBillBaseFragment
    /* JADX INFO: renamed from: F3 */
    public void mo15498F3() {
        C44736c c44736c;
        BaseTextView baseTextView;
        C44736c c44736c2;
        BaseTextView baseTextView2;
        C44736c c44736c3;
        BaseTextView baseTextView3;
        C44736c c44736c4;
        BaseTextView baseTextView4;
        C44744d c44744dM15601o4 = m15601o4();
        if (c44744dM15601o4 != null && (c44736c4 = c44744dM15601o4.f99717b) != null && (baseTextView4 = c44736c4.f99652b) != null) {
            m15499G3(baseTextView4, false);
        }
        C44744d c44744dM15601o5 = m15601o4();
        if (c44744dM15601o5 != null && (c44736c3 = c44744dM15601o5.f99717b) != null && (baseTextView3 = c44736c3.f99654d) != null) {
            m15499G3(baseTextView3, false);
        }
        C44744d c44744dM15601o6 = m15601o4();
        if (c44744dM15601o6 != null && (c44736c2 = c44744dM15601o6.f99717b) != null && (baseTextView2 = c44736c2.f99655e) != null) {
            m15499G3(baseTextView2, false);
        }
        C44744d c44744dM15601o7 = m15601o4();
        if (c44744dM15601o7 != null && (c44736c = c44744dM15601o7.f99717b) != null && (baseTextView = c44736c.f99653c) != null) {
            m15499G3(baseTextView, false);
        }
    }

    /* JADX INFO: renamed from: z4 */
    public final void m15602z4() {
        m15496C3().m15551F(new Function2() { // from class: com.kubi.assets.bill.l0
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AccountBillFinanceFragment.m15563A4(this.f16777b, (List) obj, (List) obj2);
            }
        });
    }
}
