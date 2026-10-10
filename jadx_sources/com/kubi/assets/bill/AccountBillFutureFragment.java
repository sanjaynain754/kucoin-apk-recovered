package com.kubi.assets.bill;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.BundleKt;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.assets.R$layout;
import com.kubi.kumex.entity.FundsRecordEntity;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.C23057g1;
import com.kubi.resources.widget.SwipeRefreshRecyclerView;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.tencent.qcloud.tuicore.TUIConstants;
import hb0.InterfaceC38162f;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.reactivex.functions.Action;
import java.util.ArrayList;
import jb0.InterfaceC40373g;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p637ta.C44760f;
import p637ta.C44768g;
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
import w00.C45681e;

/* JADX INFO: compiled from: AccountBillFutureFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 #2\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0017\u001a\u00020\u0015H\u0002J\b\u0010\u0018\u001a\u00020\u0015H\u0002J\b\u0010\u0019\u001a\u00020\u0015H\u0002J\u0016\u0010\u001a\u001a\u00020\u00152\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002J\u0010\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020\u0015H\u0002J\b\u0010\"\u001a\u00020\u0015H\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000¨\u0006$"}, m90084d2 = {"Lcom/kubi/assets/bill/AccountBillFutureFragment;", "Lcom/kubi/assets/bill/AccountBillBaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/assets/databinding/AssetAccountBillFutureFragmentBinding;", "getBinding", "()Lcom/kubi/assets/databinding/AssetAccountBillFutureFragmentBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "accountBillAdapter", "Lcom/kubi/assets/bill/FutureAccountBillAdapter;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initViews", "setupRecyclerView", "observeViewModel", "updateListData", "listState", "Lcom/kubi/assets/bill/AccountBillListState;", "Lcom/kubi/kumex/entity/FundsRecordEntity;", "updateLoadingState", "loadingState", "Lcom/kubi/assets/bill/LoadingState;", "updateErrorState", "resetFilterIcon", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAccountBillFutureFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountBillFutureFragment.kt\ncom/kubi/assets/bill/AccountBillFutureFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,227:1\n147#2,16:228\n*S KotlinDebug\n*F\n+ 1 AccountBillFutureFragment.kt\ncom/kubi/assets/bill/AccountBillFutureFragment\n*L\n47#1:228,16\n*E\n"})
public final class AccountBillFutureFragment extends AccountBillBaseFragment {

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final InterfaceC24293a f16650Y = C45681e.m100799e(this, new Function1<AccountBillFutureFragment, C44768g>() { // from class: com.kubi.assets.bill.AccountBillFutureFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44768g invoke(@NotNull AccountBillFutureFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44768g.m99051a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44768g, Unit>() { // from class: com.kubi.assets.bill.AccountBillFutureFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44768g it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44768g c44768g) {
            invoke(c44768g);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: Z */
    public FutureAccountBillAdapter f16651Z;

    /* JADX INFO: renamed from: b0 */
    public static final /* synthetic */ KProperty<Object>[] f16649b0 = {Reflection.property1(new PropertyReference1Impl(AccountBillFutureFragment.class, "binding", "getBinding()Lcom/kubi/assets/databinding/AssetAccountBillFutureFragmentBinding;", 0))};

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public static final Companion f16648a0 = new Companion(null);

    /* JADX INFO: compiled from: AccountBillFutureFragment.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/assets/bill/AccountBillFutureFragment$Companion;", "", "<init>", "()V", "create", "Lcom/kubi/assets/bill/AccountBillFutureFragment;", "accountType", "", "requestBizType", "bundle", "Landroid/os/Bundle;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ AccountBillFutureFragment create$default(Companion companion, String str, String str2, Bundle bundle, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                bundle = BundleKt.bundleOf();
            }
            return companion.create(str, str2, bundle);
        }

        @NotNull
        public final AccountBillFutureFragment create(@NotNull String accountType, @Nullable String requestBizType, @NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            AccountBillFutureFragment accountBillFutureFragment = new AccountBillFutureFragment();
            Bundle bundleBundleOf = BundleKt.bundleOf(TuplesKt.m90091to("accountType", accountType), TuplesKt.m90091to("requestBizType", requestBizType));
            bundleBundleOf.putAll(bundle);
            accountBillFutureFragment.setArguments(bundleBundleOf);
            return accountBillFutureFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.bill.AccountBillFutureFragment$b */
    /* JADX INFO: compiled from: AccountBillFutureFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/kubi/assets/bill/AccountBillFutureFragment$setupRecyclerView$1$2", "Lio/chad/library/adapter/base/BaseQuickAdapter$RequestLoadMoreListener;", "onLoadMoreRequested", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C9553b implements BaseQuickAdapter.RequestLoadMoreListener {
        public C9553b() {
        }

        @Override // io.chad.library.adapter.base.BaseQuickAdapter.RequestLoadMoreListener
        public void onLoadMoreRequested() {
            AccountBillFutureFragment.this.m15496C3().m15552G();
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.bill.AccountBillFutureFragment$a */
    /* JADX INFO: compiled from: AccountBillFutureFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C9552a {
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

    /* JADX INFO: renamed from: k4 */
    public static final void m15618k4(AccountBillFutureFragment accountBillFutureFragment, InterfaceC38162f it) {
        Intrinsics.checkNotNullParameter(it, "it");
        AccountBillCommonViewModel.m15538E(accountBillFutureFragment.m15496C3(), true, false, 0, 6, null);
    }

    /* JADX INFO: renamed from: l4 */
    public static final void m15619l4(AccountBillFutureFragment accountBillFutureFragment, C44768g c44768g, View view) {
        BaseTextView selectCoin = c44768g.f99944b.f99854b;
        Intrinsics.checkNotNullExpressionValue(selectCoin, "selectCoin");
        accountBillFutureFragment.m15499G3(selectCoin, true);
        accountBillFutureFragment.m15503R3();
    }

    /* JADX INFO: renamed from: m4 */
    public static final void m15620m4(AccountBillFutureFragment accountBillFutureFragment, C44768g c44768g, View view) {
        BaseTextView selectTime = c44768g.f99944b.f99856d;
        Intrinsics.checkNotNullExpressionValue(selectTime, "selectTime");
        accountBillFutureFragment.m15499G3(selectTime, true);
        accountBillFutureFragment.m15501L3();
    }

    /* JADX INFO: renamed from: n4 */
    public static final void m15621n4(final AccountBillFutureFragment accountBillFutureFragment, C44768g c44768g, View view) throws Exception {
        BaseTextView selectType = c44768g.f99944b.f99857e;
        Intrinsics.checkNotNullExpressionValue(selectType, "selectType");
        accountBillFutureFragment.m15499G3(selectType, true);
        FutureAssetFilterHelper futureAssetFilterHelper = FutureAssetFilterHelper.f16700a;
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(accountBillFutureFragment);
        String fundsType = accountBillFutureFragment.m15496C3().m15555x().getValue().getFundsType();
        if (fundsType == null) {
            fundsType = "selfFunds";
        }
        futureAssetFilterHelper.m15760f(lifecycleScope, fundsType, new Action() { // from class: com.kubi.assets.bill.v0
            @Override // io.reactivex.functions.Action
            public final void run() {
                AccountBillFutureFragment.m15622o4(this.f16819b);
            }
        });
    }

    /* JADX INFO: renamed from: p4 */
    public static final void m15623p4(AccountBillFutureFragment accountBillFutureFragment, C44768g c44768g, View view) {
        BaseTextView selectSides = c44768g.f99944b.f99855c;
        Intrinsics.checkNotNullExpressionValue(selectSides, "selectSides");
        accountBillFutureFragment.m15499G3(selectSides, true);
        accountBillFutureFragment.m15504U3();
    }

    /* JADX INFO: renamed from: s4 */
    public static final Unit m15626s4(AccountBillFutureFragment accountBillFutureFragment, FundsRecordEntity item) {
        Intrinsics.checkNotNullParameter(item, "item");
        accountBillFutureFragment.m15497D3(item);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i4 */
    public final C44768g m15631i4() {
        return (C44768g) this.f16650Y.getValue(this, f16649b0[0]);
    }

    @Override // com.kubi.assets.bill.AccountBillBaseFragment, com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.asset_account_bill_future_fragment, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) throws Exception {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.showLoadingView$default(this, 0, 0, 3, null);
        m15617j4();
        m15624q4();
        m15496C3().m15549C(m15494A3());
        AccountBillCommonViewModel.m15538E(m15496C3(), true, false, 0, 6, null);
    }

    /* JADX INFO: renamed from: j4 */
    private final void m15617j4() throws Exception {
        final C44768g c44768gM15631i4 = m15631i4();
        if (c44768gM15631i4 != null) {
            c44768gM15631i4.f99945c.setOnRefreshListener(new InterfaceC40373g() { // from class: com.kubi.assets.bill.q0
                @Override // jb0.InterfaceC40373g
                /* JADX INFO: renamed from: a */
                public final void mo15329a(InterfaceC38162f interfaceC38162f) {
                    AccountBillFutureFragment.m15618k4(this.f16794b, interfaceC38162f);
                }
            });
            c44768gM15631i4.f99944b.f99854b.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.assets.bill.r0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AccountBillFutureFragment.m15619l4(this.f16798b, c44768gM15631i4, view);
                }
            });
            c44768gM15631i4.f99944b.f99856d.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.assets.bill.s0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AccountBillFutureFragment.m15620m4(this.f16804b, c44768gM15631i4, view);
                }
            });
            c44768gM15631i4.f99944b.f99857e.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.assets.bill.t0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) throws Exception {
                    AccountBillFutureFragment.m15621n4(this.f16809b, c44768gM15631i4, view);
                }
            });
            c44768gM15631i4.f99944b.f99855c.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.assets.bill.u0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AccountBillFutureFragment.m15623p4(this.f16814b, c44768gM15631i4, view);
                }
            });
        }
        m15625r4();
        FutureAssetFilterHelper futureAssetFilterHelper = FutureAssetFilterHelper.f16700a;
        FutureAssetFilterHelper.m15755g(futureAssetFilterHelper, LifecycleOwnerKt.getLifecycleScope(this), "selfFunds", null, 4, null);
        FutureAssetFilterHelper.m15755g(futureAssetFilterHelper, LifecycleOwnerKt.getLifecycleScope(this), "trialFunds", null, 4, null);
    }

    /* JADX INFO: renamed from: o4 */
    public static final void m15622o4(AccountBillFutureFragment accountBillFutureFragment) {
        accountBillFutureFragment.m15502O3();
    }

    /* JADX INFO: renamed from: q4 */
    private final void m15624q4() {
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AccountBillFutureFragment$observeViewModel$1(this, null), 3, null);
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AccountBillFutureFragment$observeViewModel$2(this, null), 3, null);
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AccountBillFutureFragment$observeViewModel$3(this, null), 3, null);
    }

    /* JADX INFO: renamed from: r4 */
    private final void m15625r4() {
        SwipeRefreshRecyclerView swipeRefreshRecyclerView;
        RecyclerView recyclerView;
        C44768g c44768gM15631i4 = m15631i4();
        if (c44768gM15631i4 != null && (swipeRefreshRecyclerView = c44768gM15631i4.f99945c) != null && (recyclerView = swipeRefreshRecyclerView.getRecyclerView()) != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            FutureAccountBillAdapter futureAccountBillAdapter = new FutureAccountBillAdapter(new ArrayList());
            this.f16651Z = futureAccountBillAdapter;
            futureAccountBillAdapter.setLoadMoreView(new C23057g1());
            FutureAccountBillAdapter futureAccountBillAdapter2 = this.f16651Z;
            FutureAccountBillAdapter futureAccountBillAdapter3 = null;
            if (futureAccountBillAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("accountBillAdapter");
                futureAccountBillAdapter2 = null;
            }
            recyclerView.setAdapter(futureAccountBillAdapter2);
            FutureAccountBillAdapter futureAccountBillAdapter4 = this.f16651Z;
            if (futureAccountBillAdapter4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("accountBillAdapter");
                futureAccountBillAdapter4 = null;
            }
            futureAccountBillAdapter4.m15749j(new Function1() { // from class: com.kubi.assets.bill.w0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AccountBillFutureFragment.m15626s4(this.f16823b, (FundsRecordEntity) obj);
                }
            });
            FutureAccountBillAdapter futureAccountBillAdapter5 = this.f16651Z;
            if (futureAccountBillAdapter5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("accountBillAdapter");
            } else {
                futureAccountBillAdapter3 = futureAccountBillAdapter5;
            }
            futureAccountBillAdapter3.setOnLoadMoreListener(new C9553b(), recyclerView);
        }
    }

    /* JADX INFO: renamed from: t4 */
    private final void m15627t4() {
        if (m15631i4() != null) {
            if (m15496C3().m15547A().getValue().m15817d().isEmpty()) {
                BaseFragment.showFailView$default(this, 0, 0, new View.OnClickListener() { // from class: com.kubi.assets.bill.p0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        AccountBillFutureFragment.m15628u4(this.f16789b, view);
                    }
                }, 3, (Object) null);
            } else {
                showContentView();
            }
        }
    }

    /* JADX INFO: renamed from: u4 */
    public static final void m15628u4(AccountBillFutureFragment accountBillFutureFragment, View view) {
        accountBillFutureFragment.m15496C3().m15553H();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v4 */
    public final void m15629v4(AccountBillListState<FundsRecordEntity> accountBillListState) {
        if (m15631i4() != null) {
            FutureAccountBillAdapter futureAccountBillAdapter = null;
            if (accountBillListState.m15817d().isEmpty()) {
                FutureAccountBillAdapter futureAccountBillAdapter2 = this.f16651Z;
                if (futureAccountBillAdapter2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("accountBillAdapter");
                    futureAccountBillAdapter2 = null;
                }
                futureAccountBillAdapter2.setEmptyView(R$layout.view_empty);
            }
            FutureAccountBillAdapter futureAccountBillAdapter3 = this.f16651Z;
            if (futureAccountBillAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("accountBillAdapter");
                futureAccountBillAdapter3 = null;
            }
            futureAccountBillAdapter3.setNewData(CollectionsKt.toList(accountBillListState.m15817d()));
            FutureAccountBillAdapter futureAccountBillAdapter4 = this.f16651Z;
            if (futureAccountBillAdapter4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("accountBillAdapter");
            } else {
                futureAccountBillAdapter = futureAccountBillAdapter4;
            }
            futureAccountBillAdapter.setEnableLoadMore(accountBillListState.getHasMore());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w4 */
    public final void m15630w4(LoadingState loadingState) {
        SwipeRefreshRecyclerView swipeRefreshRecyclerView;
        SwipeRefreshRecyclerView swipeRefreshRecyclerView2;
        SwipeRefreshRecyclerView swipeRefreshRecyclerView3;
        if (m15631i4() != null) {
            int i11 = C9552a.$EnumSwitchMapping$0[loadingState.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 == 5) {
                                m15627t4();
                                C44768g c44768gM15631i4 = m15631i4();
                                if (c44768gM15631i4 != null && (swipeRefreshRecyclerView3 = c44768gM15631i4.f99945c) != null) {
                                    swipeRefreshRecyclerView3.setRefreshing(false);
                                    return;
                                }
                                return;
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        showContentView();
                        C44768g c44768gM15631i5 = m15631i4();
                        if (c44768gM15631i5 != null && (swipeRefreshRecyclerView2 = c44768gM15631i5.f99945c) != null) {
                            swipeRefreshRecyclerView2.setRefreshing(false);
                            return;
                        }
                        return;
                    }
                    showContentView();
                    return;
                }
                showContentView();
                C44768g c44768gM15631i6 = m15631i4();
                if (c44768gM15631i6 != null && (swipeRefreshRecyclerView = c44768gM15631i6.f99945c) != null) {
                    swipeRefreshRecyclerView.setRefreshing(true);
                    return;
                }
                return;
            }
            BaseFragment.showLoadingView$default(this, 0, 0, 3, null);
        }
    }

    @Override // com.kubi.assets.bill.AccountBillBaseFragment
    /* JADX INFO: renamed from: F3 */
    public void mo15498F3() {
        C44760f c44760f;
        BaseTextView baseTextView;
        C44760f c44760f2;
        BaseTextView baseTextView2;
        C44760f c44760f3;
        BaseTextView baseTextView3;
        C44760f c44760f4;
        BaseTextView baseTextView4;
        C44768g c44768gM15631i4 = m15631i4();
        if (c44768gM15631i4 != null && (c44760f4 = c44768gM15631i4.f99944b) != null && (baseTextView4 = c44760f4.f99854b) != null) {
            m15499G3(baseTextView4, false);
        }
        C44768g c44768gM15631i5 = m15631i4();
        if (c44768gM15631i5 != null && (c44760f3 = c44768gM15631i5.f99944b) != null && (baseTextView3 = c44760f3.f99856d) != null) {
            m15499G3(baseTextView3, false);
        }
        C44768g c44768gM15631i6 = m15631i4();
        if (c44768gM15631i6 != null && (c44760f2 = c44768gM15631i6.f99944b) != null && (baseTextView2 = c44760f2.f99857e) != null) {
            m15499G3(baseTextView2, false);
        }
        C44768g c44768gM15631i7 = m15631i4();
        if (c44768gM15631i7 != null && (c44760f = c44768gM15631i7.f99944b) != null && (baseTextView = c44760f.f99855c) != null) {
            m15499G3(baseTextView, false);
        }
    }
}
