package com.kubi.assets.bill;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.BundleKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.assets.R$layout;
import com.kubi.assets.entity.AccountDetailEntity;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.C23057g1;
import com.kubi.resources.widget.SwipeRefreshRecyclerView;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.tencent.qcloud.tuicore.TUIConstants;
import hb0.InterfaceC38162f;
import io.chad.library.adapter.base.BaseQuickAdapter;
import java.util.ArrayList;
import jb0.InterfaceC40373g;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p637ta.C44720a;
import p637ta.C44728b;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import ro.C44128b;
import w00.C45681e;

/* JADX INFO: compiled from: AccountBillCommonFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 #2\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0017\u001a\u00020\u0015H\u0002J\b\u0010\u0018\u001a\u00020\u0015H\u0002J\b\u0010\u0019\u001a\u00020\u0015H\u0002J\u0016\u0010\u001a\u001a\u00020\u00152\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002J\u0010\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020\u0015H\u0002J\b\u0010\"\u001a\u00020\u0015H\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000¨\u0006$"}, m90084d2 = {"Lcom/kubi/assets/bill/AccountBillCommonFragment;", "Lcom/kubi/assets/bill/AccountBillBaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/assets/databinding/AssetAccountBillCommonFragmentBinding;", "getBinding", "()Lcom/kubi/assets/databinding/AssetAccountBillCommonFragmentBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "accountBillAdapter", "Lcom/kubi/assets/bill/AccountBillAdapter;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initViews", "setupRecyclerView", "observeViewModel", "updateListData", "listState", "Lcom/kubi/assets/bill/AccountBillListState;", "Lcom/kubi/assets/entity/AccountDetailEntity;", "updateLoadingState", "loadingState", "Lcom/kubi/assets/bill/LoadingState;", "updateErrorState", "resetFilterIcon", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAccountBillCommonFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountBillCommonFragment.kt\ncom/kubi/assets/bill/AccountBillCommonFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,218:1\n147#2,16:219\n*S KotlinDebug\n*F\n+ 1 AccountBillCommonFragment.kt\ncom/kubi/assets/bill/AccountBillCommonFragment\n*L\n44#1:219,16\n*E\n"})
public final class AccountBillCommonFragment extends AccountBillBaseFragment {

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final InterfaceC24293a f16626Y = C45681e.m100799e(this, new Function1<AccountBillCommonFragment, C44720a>() { // from class: com.kubi.assets.bill.AccountBillCommonFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44720a invoke(@NotNull AccountBillCommonFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44720a.m98950a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44720a, Unit>() { // from class: com.kubi.assets.bill.AccountBillCommonFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44720a it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44720a c44720a) {
            invoke(c44720a);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: Z */
    public AccountBillAdapter f16627Z;

    /* JADX INFO: renamed from: b0 */
    public static final /* synthetic */ KProperty<Object>[] f16625b0 = {Reflection.property1(new PropertyReference1Impl(AccountBillCommonFragment.class, "binding", "getBinding()Lcom/kubi/assets/databinding/AssetAccountBillCommonFragmentBinding;", 0))};

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public static final Companion f16624a0 = new Companion(null);

    /* JADX INFO: compiled from: AccountBillCommonFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007¨\u0006\t"}, m90084d2 = {"Lcom/kubi/assets/bill/AccountBillCommonFragment$Companion;", "", "<init>", "()V", "create", "Lcom/kubi/assets/bill/AccountBillCommonFragment;", "accountType", "", "requestBizType", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final AccountBillCommonFragment create(@NotNull String accountType, @Nullable String requestBizType) {
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            AccountBillCommonFragment accountBillCommonFragment = new AccountBillCommonFragment();
            accountBillCommonFragment.setArguments(BundleKt.bundleOf(TuplesKt.m90091to("accountType", accountType), TuplesKt.m90091to("requestBizType", requestBizType)));
            return accountBillCommonFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.bill.AccountBillCommonFragment$b */
    /* JADX INFO: compiled from: AccountBillCommonFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/kubi/assets/bill/AccountBillCommonFragment$setupRecyclerView$1$2", "Lio/chad/library/adapter/base/BaseQuickAdapter$RequestLoadMoreListener;", "onLoadMoreRequested", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C9539b implements BaseQuickAdapter.RequestLoadMoreListener {
        public C9539b() {
        }

        @Override // io.chad.library.adapter.base.BaseQuickAdapter.RequestLoadMoreListener
        public void onLoadMoreRequested() {
            AccountBillCommonFragment.this.m15496C3().m15552G();
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.bill.AccountBillCommonFragment$a */
    /* JADX INFO: compiled from: AccountBillCommonFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C9538a {
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

    /* JADX INFO: renamed from: j4 */
    public static final void m15525j4(AccountBillCommonFragment accountBillCommonFragment, InterfaceC38162f it) {
        Intrinsics.checkNotNullParameter(it, "it");
        AccountBillCommonViewModel.m15538E(accountBillCommonFragment.m15496C3(), true, false, 0, 6, null);
    }

    /* JADX INFO: renamed from: k4 */
    public static final void m15526k4(AccountBillCommonFragment accountBillCommonFragment, C44720a c44720a, View view) {
        BaseTextView selectCoin = c44720a.f99533b.f99593e;
        Intrinsics.checkNotNullExpressionValue(selectCoin, "selectCoin");
        accountBillCommonFragment.m15499G3(selectCoin, true);
        accountBillCommonFragment.m15503R3();
    }

    /* JADX INFO: renamed from: l4 */
    public static final void m15527l4(AccountBillCommonFragment accountBillCommonFragment, C44720a c44720a, View view) {
        BaseTextView selectTime = c44720a.f99533b.f99595g;
        Intrinsics.checkNotNullExpressionValue(selectTime, "selectTime");
        accountBillCommonFragment.m15499G3(selectTime, true);
        accountBillCommonFragment.m15501L3();
    }

    /* JADX INFO: renamed from: m4 */
    public static final void m15528m4(AccountBillCommonFragment accountBillCommonFragment, C44720a c44720a, View view) throws Exception {
        BaseTextView selectType = c44720a.f99533b.f99596h;
        Intrinsics.checkNotNullExpressionValue(selectType, "selectType");
        accountBillCommonFragment.m15499G3(selectType, true);
        accountBillCommonFragment.m15500H3();
    }

    /* JADX INFO: renamed from: n4 */
    public static final void m15529n4(AccountBillCommonFragment accountBillCommonFragment, C44720a c44720a, View view) {
        BaseTextView selectSides = c44720a.f99533b.f99594f;
        Intrinsics.checkNotNullExpressionValue(selectSides, "selectSides");
        accountBillCommonFragment.m15499G3(selectSides, true);
        accountBillCommonFragment.m15504U3();
    }

    /* JADX INFO: renamed from: q4 */
    public static final Unit m15530q4(AccountBillCommonFragment accountBillCommonFragment, AccountDetailEntity item) {
        Intrinsics.checkNotNullParameter(item, "item");
        accountBillCommonFragment.m15497D3(item);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h4 */
    public final C44720a m15532h4() {
        return (C44720a) this.f16626Y.getValue(this, f16625b0[0]);
    }

    @Override // com.kubi.assets.bill.AccountBillBaseFragment, com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.asset_account_bill_common_fragment, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) throws Exception {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.showLoadingView$default(this, 0, 0, 3, null);
        m15524i4();
        m15533o4();
        m15496C3().m15549C(m15494A3());
        AccountBillCommonViewModel.m15538E(m15496C3(), true, false, 0, 6, null);
        if (Intrinsics.areEqual(m15494A3(), "MAIN")) {
            AccountBillSearchCoinDialog.f16656A0.preloadCoinList(LifecycleOwnerKt.getLifecycleScope(this));
        }
        String strM15495B3 = m15495B3();
        if (strM15495B3 != null) {
            C44128b.m97259c(getTAG(), "提前加载biztype: " + strM15495B3);
            BizTypeFilterHelper.m15715f(BizTypeFilterHelper.f16688a, strM15495B3, null, 2, null);
        }
    }

    /* JADX INFO: renamed from: i4 */
    private final void m15524i4() {
        final C44720a c44720aM15532h4 = m15532h4();
        if (c44720aM15532h4 != null) {
            c44720aM15532h4.f99534c.setOnRefreshListener(new InterfaceC40373g() { // from class: com.kubi.assets.bill.q
                @Override // jb0.InterfaceC40373g
                /* JADX INFO: renamed from: a */
                public final void mo15329a(InterfaceC38162f interfaceC38162f) {
                    AccountBillCommonFragment.m15525j4(this.f16793b, interfaceC38162f);
                }
            });
            c44720aM15532h4.f99533b.f99593e.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.assets.bill.r
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AccountBillCommonFragment.m15526k4(this.f16796b, c44720aM15532h4, view);
                }
            });
            c44720aM15532h4.f99533b.f99595g.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.assets.bill.s
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AccountBillCommonFragment.m15527l4(this.f16802b, c44720aM15532h4, view);
                }
            });
            c44720aM15532h4.f99533b.f99596h.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.assets.bill.t
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) throws Exception {
                    AccountBillCommonFragment.m15528m4(this.f16807b, c44720aM15532h4, view);
                }
            });
            c44720aM15532h4.f99533b.f99594f.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.assets.bill.u
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AccountBillCommonFragment.m15529n4(this.f16812b, c44720aM15532h4, view);
                }
            });
        }
        m15534p4();
    }

    /* JADX INFO: renamed from: s4 */
    public static final void m15531s4(AccountBillCommonFragment accountBillCommonFragment, View view) {
        accountBillCommonFragment.m15496C3().m15553H();
    }

    @Override // com.kubi.assets.bill.AccountBillBaseFragment
    /* JADX INFO: renamed from: F3 */
    public void mo15498F3() {
        C44728b c44728b;
        BaseTextView baseTextView;
        C44728b c44728b2;
        BaseTextView baseTextView2;
        C44728b c44728b3;
        BaseTextView baseTextView3;
        C44728b c44728b4;
        BaseTextView baseTextView4;
        C44720a c44720aM15532h4 = m15532h4();
        if (c44720aM15532h4 != null && (c44728b4 = c44720aM15532h4.f99533b) != null && (baseTextView4 = c44728b4.f99593e) != null) {
            m15499G3(baseTextView4, false);
        }
        C44720a c44720aM15532h5 = m15532h4();
        if (c44720aM15532h5 != null && (c44728b3 = c44720aM15532h5.f99533b) != null && (baseTextView3 = c44728b3.f99595g) != null) {
            m15499G3(baseTextView3, false);
        }
        C44720a c44720aM15532h6 = m15532h4();
        if (c44720aM15532h6 != null && (c44728b2 = c44720aM15532h6.f99533b) != null && (baseTextView2 = c44728b2.f99596h) != null) {
            m15499G3(baseTextView2, false);
        }
        C44720a c44720aM15532h7 = m15532h4();
        if (c44720aM15532h7 != null && (c44728b = c44720aM15532h7.f99533b) != null && (baseTextView = c44728b.f99594f) != null) {
            m15499G3(baseTextView, false);
        }
    }

    /* JADX INFO: renamed from: o4 */
    public final void m15533o4() {
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AccountBillCommonFragment$observeViewModel$1(this, null), 3, null);
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AccountBillCommonFragment$observeViewModel$2(this, null), 3, null);
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AccountBillCommonFragment$observeViewModel$3(this, null), 3, null);
    }

    /* JADX INFO: renamed from: p4 */
    public final void m15534p4() {
        SwipeRefreshRecyclerView swipeRefreshRecyclerView;
        RecyclerView recyclerView;
        C44720a c44720aM15532h4 = m15532h4();
        if (c44720aM15532h4 != null && (swipeRefreshRecyclerView = c44720aM15532h4.f99534c) != null && (recyclerView = swipeRefreshRecyclerView.getRecyclerView()) != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            AccountBillAdapter accountBillAdapter = new AccountBillAdapter(new ArrayList());
            this.f16627Z = accountBillAdapter;
            accountBillAdapter.setLoadMoreView(new C23057g1());
            AccountBillAdapter accountBillAdapter2 = this.f16627Z;
            AccountBillAdapter accountBillAdapter3 = null;
            if (accountBillAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("accountBillAdapter");
                accountBillAdapter2 = null;
            }
            recyclerView.setAdapter(accountBillAdapter2);
            AccountBillAdapter accountBillAdapter4 = this.f16627Z;
            if (accountBillAdapter4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("accountBillAdapter");
                accountBillAdapter4 = null;
            }
            accountBillAdapter4.m15467j(new Function1() { // from class: com.kubi.assets.bill.w
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AccountBillCommonFragment.m15530q4(this.f16822b, (AccountDetailEntity) obj);
                }
            });
            AccountBillAdapter accountBillAdapter5 = this.f16627Z;
            if (accountBillAdapter5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("accountBillAdapter");
            } else {
                accountBillAdapter3 = accountBillAdapter5;
            }
            accountBillAdapter3.setOnLoadMoreListener(new C9539b(), recyclerView);
        }
    }

    /* JADX INFO: renamed from: r4 */
    public final void m15535r4() {
        if (m15532h4() != null) {
            if (m15496C3().m15547A().getValue().m15817d().isEmpty()) {
                BaseFragment.showFailView$default(this, 0, 0, new View.OnClickListener() { // from class: com.kubi.assets.bill.v
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        AccountBillCommonFragment.m15531s4(this.f16818b, view);
                    }
                }, 3, (Object) null);
            } else {
                showContentView();
            }
        }
    }

    /* JADX INFO: renamed from: t4 */
    public final void m15536t4(AccountBillListState<AccountDetailEntity> accountBillListState) {
        if (m15532h4() != null) {
            AccountBillAdapter accountBillAdapter = null;
            if (accountBillListState.m15817d().isEmpty()) {
                AccountBillAdapter accountBillAdapter2 = this.f16627Z;
                if (accountBillAdapter2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("accountBillAdapter");
                    accountBillAdapter2 = null;
                }
                accountBillAdapter2.setEmptyView(R$layout.view_empty);
            }
            AccountBillAdapter accountBillAdapter3 = this.f16627Z;
            if (accountBillAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("accountBillAdapter");
                accountBillAdapter3 = null;
            }
            accountBillAdapter3.setNewData(CollectionsKt.toList(accountBillListState.m15817d()));
            AccountBillAdapter accountBillAdapter4 = this.f16627Z;
            if (accountBillAdapter4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("accountBillAdapter");
            } else {
                accountBillAdapter = accountBillAdapter4;
            }
            accountBillAdapter.setEnableLoadMore(accountBillListState.getHasMore());
        }
    }

    /* JADX INFO: renamed from: u4 */
    public final void m15537u4(LoadingState loadingState) {
        SwipeRefreshRecyclerView swipeRefreshRecyclerView;
        SwipeRefreshRecyclerView swipeRefreshRecyclerView2;
        SwipeRefreshRecyclerView swipeRefreshRecyclerView3;
        if (m15532h4() != null) {
            int i11 = C9538a.$EnumSwitchMapping$0[loadingState.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 == 5) {
                                m15535r4();
                                C44720a c44720aM15532h4 = m15532h4();
                                if (c44720aM15532h4 != null && (swipeRefreshRecyclerView3 = c44720aM15532h4.f99534c) != null) {
                                    swipeRefreshRecyclerView3.setRefreshing(false);
                                    return;
                                }
                                return;
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        showContentView();
                        C44720a c44720aM15532h5 = m15532h4();
                        if (c44720aM15532h5 != null && (swipeRefreshRecyclerView2 = c44720aM15532h5.f99534c) != null) {
                            swipeRefreshRecyclerView2.setRefreshing(false);
                            return;
                        }
                        return;
                    }
                    showContentView();
                    return;
                }
                showContentView();
                C44720a c44720aM15532h6 = m15532h4();
                if (c44720aM15532h6 != null && (swipeRefreshRecyclerView = c44720aM15532h6.f99534c) != null) {
                    swipeRefreshRecyclerView.setRefreshing(true);
                    return;
                }
                return;
            }
            BaseFragment.showLoadingView$default(this, 0, 0, 3, null);
        }
    }
}
