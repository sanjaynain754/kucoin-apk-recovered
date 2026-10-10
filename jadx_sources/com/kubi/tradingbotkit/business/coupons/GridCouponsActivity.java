package com.kubi.tradingbotkit.business.coupons;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.jumio.core.constants.ConstantsKt;
import com.kubi.resources.widget.KuCoinRefreshLayout;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.C24346y;
import com.kubi.sdk.ItemCallBack;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.loading.WrapperLoadingView;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.kubi.tradingbotkit.R$drawable;
import com.kubi.tradingbotkit.R$id;
import com.kubi.tradingbotkit.R$layout;
import com.kubi.tradingbotkit.R$string;
import com.kubi.tradingbotkit.business.coupons.adapter.AvailableCouponsProxy;
import com.kubi.tradingbotkit.business.coupons.adapter.CouponsListItemSubTitleProxy;
import com.kubi.tradingbotkit.business.coupons.adapter.UnAvailableCouponsProxy;
import com.kubi.tradingbotkit.business.coupons.viewModel.CouponsDataViewModel;
import com.kubi.tradingbotkit.model.AllCouponsItemModel;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import hb0.InterfaceC38162f;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;
import jb0.InterfaceC40373g;
import kotlinx.coroutines.C41696j;
import l50.C42057a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p40.C43383c;
import p569qq.C43852m;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45678b;

/* JADX INFO: compiled from: GridCouponsActivity.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 H2\u00020\u0001:\u0001HB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u00106\u001a\u0002072\u0006\u00108\u001a\u00020*H\u0002J\u0012\u00109\u001a\u0002072\b\u0010:\u001a\u0004\u0018\u00010;H\u0014J\u000e\u0010<\u001a\u0002072\u0006\u0010=\u001a\u00020\rJ\u0016\u0010>\u001a\u0002072\u0006\u0010?\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020\u000bJ\b\u0010A\u001a\u00020\rH\u0002J\b\u0010B\u001a\u000207H\u0002J\b\u0010C\u001a\u000207H\u0002J\b\u0010D\u001a\u00020EH\u0002J\b\u0010F\u001a\u000207H\u0002J\b\u0010G\u001a\u000207H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\f\u001a\u0004\u0018\u00010\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0012\u001a\u0004\u0018\u00010\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0013\u0010\u000fR\u001d\u0010\u0015\u001a\u0004\u0018\u00010\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0016\u0010\u000fR\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u00198FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u001d\u001a\u0004\u0018\u00010\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0011\u001a\u0004\b\u001e\u0010\u000fR\u001d\u0010 \u001a\u0004\u0018\u00010\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0011\u001a\u0004\b!\u0010\u000fR#\u0010#\u001a\n %*\u0004\u0018\u00010$0$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u0011\u001a\u0004\b&\u0010'R\u001c\u0010)\u001a\u0004\u0018\u00010*X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001b\u0010/\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010\u0011\u001a\u0004\b1\u00102R\u000e\u00104\u001a\u000205X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006I"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/coupons/GridCouponsActivity;", "Lcom/kubi/sdk/BaseActivity;", "<init>", "()V", "viewBinding", "Lcom/kubi/tradingbotkit/databinding/BtradingBotKitActivityGridCouponsBinding;", "getViewBinding", "()Lcom/kubi/tradingbotkit/databinding/BtradingBotKitActivityGridCouponsBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "getLayout", "", "symbol", "", "getSymbol", "()Ljava/lang/String;", "symbol$delegate", "Lkotlin/Lazy;", "quote", "getQuote", "quote$delegate", "templateType", "getTemplateType", "templateType$delegate", "totalInvestments", "Ljava/math/BigDecimal;", "getTotalInvestments", "()Ljava/math/BigDecimal;", "totalInvestments$delegate", "checkCouponsId", "getCheckCouponsId", "checkCouponsId$delegate", "postType", "getPostType", "postType$delegate", "loadingCoupons", "Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "kotlin.jvm.PlatformType", "getLoadingCoupons", "()Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "loadingCoupons$delegate", "checkItem", "Lcom/kubi/tradingbotkit/model/AllCouponsItemModel;", "getCheckItem", "()Lcom/kubi/tradingbotkit/model/AllCouponsItemModel;", "setCheckItem", "(Lcom/kubi/tradingbotkit/model/AllCouponsItemModel;)V", "couponsDataViewModel", "Lcom/kubi/tradingbotkit/business/coupons/viewModel/CouponsDataViewModel;", "getCouponsDataViewModel", "()Lcom/kubi/tradingbotkit/business/coupons/viewModel/CouponsDataViewModel;", "couponsDataViewModel$delegate", "gridCouponsAdapter", "Lcom/kubi/tradingbotkit/business/coupons/adapter/GridCouponsAdapter$Builder;", "changeViewSelect", "", "data", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "trackEventClick", "clickType", "trackEventExpose", "allItemAmount", "messageNumber", "getMessageType", "requestOverView", "clickCollection", "invalidArgument", "", "initView", "observerCollection", "Companion", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nGridCouponsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GridCouponsActivity.kt\ncom/kubi/tradingbotkit/business/coupons/GridCouponsActivity\n+ 2 ActivityViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ActivityViewBindings\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,246:1\n45#2,19:247\n75#3,13:266\n*S KotlinDebug\n*F\n+ 1 GridCouponsActivity.kt\ncom/kubi/tradingbotkit/business/coupons/GridCouponsActivity\n*L\n45#1:247,19\n67#1:266,13\n*E\n"})
public final class GridCouponsActivity extends BaseActivity {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final InterfaceC24293a f52288i = C45678b.m100788b(this, new Function1<C42057a, Unit>() { // from class: com.kubi.tradingbotkit.business.coupons.GridCouponsActivity$special$$inlined$viewBindingActivity$default$1
        public final void invoke(@NotNull C42057a it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C42057a c42057a) {
            invoke(c42057a);
            return Unit.INSTANCE;
        }
    }, new Function1<GridCouponsActivity, C42057a>() { // from class: com.kubi.tradingbotkit.business.coupons.GridCouponsActivity$special$$inlined$viewBindingActivity$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C42057a invoke(@NotNull GridCouponsActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            return C42057a.m92265a(C45678b.m100787a(activity));
        }
    });

    /* JADX INFO: renamed from: j */
    @NotNull
    public final Lazy f52289j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final Lazy f52290k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public final Lazy f52291l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public final Lazy f52292m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public final Lazy f52293n;

    /* JADX INFO: renamed from: o */
    @NotNull
    public final Lazy f52294o;

    /* JADX INFO: renamed from: p */
    @NotNull
    public final Lazy f52295p;

    /* JADX INFO: renamed from: q */
    @Nullable
    public AllCouponsItemModel f52296q;

    /* JADX INFO: renamed from: r */
    @NotNull
    public final Lazy f52297r;

    /* JADX INFO: renamed from: s */
    @NotNull
    public final C43383c.a f52298s;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ KProperty<Object>[] f52287u = {Reflection.property1(new PropertyReference1Impl(GridCouponsActivity.class, "viewBinding", "getViewBinding()Lcom/kubi/tradingbotkit/databinding/BtradingBotKitActivityGridCouponsBinding;", 0))};

    /* JADX INFO: renamed from: t */
    @NotNull
    public static final Companion f52286t = new Companion(null);

    /* JADX INFO: compiled from: GridCouponsActivity.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/coupons/GridCouponsActivity$Companion;", "", "<init>", "()V", "SYMBOL_CODE", "", "QUOTE_CODE", "TEMPLATE_TYPE", "TOTAL_INVESTMENTS", "CHECK_ITEM_ID", "CHECK_ITEM_PERCENT", "CHECK_ITEM_MIN_INVESTMENT", "POST_TYPE", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.tradingbotkit.business.coupons.GridCouponsActivity$a */
    /* JADX INFO: compiled from: GridCouponsActivity.kt */
    @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\n"}, m90084d2 = {"com/kubi/tradingbotkit/business/coupons/GridCouponsActivity$gridCouponsAdapter$1", "Lcom/kubi/sdk/ItemCallBack;", "Lcom/kubi/tradingbotkit/model/AllCouponsItemModel;", TUIConstants.TUIChat.CALL_BACK, "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "pos", "", "data", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26099a implements ItemCallBack<AllCouponsItemModel> {
        public C26099a() {
        }

        @Override // com.kubi.sdk.ItemCallBack
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo24515a(View view, int i11, AllCouponsItemModel data) throws JSONException {
            RecyclerView recyclerView;
            RecyclerView.Adapter adapter;
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(data, "data");
            if (view.getId() == R$id.cl_coupons) {
                GridCouponsActivity.this.m63894Q0(FirebaseAnalytics.Param.COUPON);
                GridCouponsActivity.this.m63896k0(data);
            } else if (view.getId() == R$id.ll_rules) {
                GridCouponsActivity.this.m63894Q0("rules");
                C42057a c42057aM63907z0 = GridCouponsActivity.this.m63907z0();
                if (c42057aM63907z0 == null || (recyclerView = c42057aM63907z0.f92356c) == null || (adapter = recyclerView.getAdapter()) == null) {
                    return;
                }
                adapter.notifyDataSetChanged();
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.tradingbotkit.business.coupons.GridCouponsActivity$b */
    /* JADX INFO: compiled from: GridCouponsActivity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26100b implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f52300b;

        public C26100b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f52300b = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p852kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f52300b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f52300b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public GridCouponsActivity() {
        setPageId("B1chooseCoupon");
        this.f52289j = LazyKt.lazy(new Function0() { // from class: com.kubi.tradingbotkit.business.coupons.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GridCouponsActivity.m63867N0(this.f52315b);
            }
        });
        this.f52290k = LazyKt.lazy(new Function0() { // from class: com.kubi.tradingbotkit.business.coupons.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GridCouponsActivity.m63866L0(this.f52316b);
            }
        });
        this.f52291l = LazyKt.lazy(new Function0() { // from class: com.kubi.tradingbotkit.business.coupons.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GridCouponsActivity.m63868O0(this.f52317b);
            }
        });
        this.f52292m = LazyKt.lazy(new Function0() { // from class: com.kubi.tradingbotkit.business.coupons.l
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GridCouponsActivity.m63869P0(this.f52318b);
            }
        });
        this.f52293n = LazyKt.lazy(new Function0() { // from class: com.kubi.tradingbotkit.business.coupons.m
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GridCouponsActivity.m63887l0(this.f52319b);
            }
        });
        this.f52294o = LazyKt.lazy(new Function0() { // from class: com.kubi.tradingbotkit.business.coupons.n
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GridCouponsActivity.m63865K0(this.f52320b);
            }
        });
        this.f52295p = LazyKt.lazy(new Function0() { // from class: com.kubi.tradingbotkit.business.coupons.o
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GridCouponsActivity.m63860E0(this.f52321b);
            }
        });
        final Function0 function0 = null;
        this.f52297r = new ViewModelLazy(Reflection.getOrCreateKotlinClass(CouponsDataViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.tradingbotkit.business.coupons.GridCouponsActivity$special$$inlined$viewModels$default$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return this.getMViewModelStore();
            }

            {
                super(0);
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.tradingbotkit.business.coupons.GridCouponsActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                return this.getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.tradingbotkit.business.coupons.GridCouponsActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function1 = function0;
                return (function1 == null || (creationExtras = (CreationExtras) function1.invoke()) == null) ? this.getDefaultViewModelCreationExtras() : creationExtras;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.f52298s = C43383c.a.m95555c(C43383c.a.m95555c(C43383c.a.m95555c(new C43383c.a(), 101, CouponsListItemSubTitleProxy.class, null, null, 12, null), 102, AvailableCouponsProxy.class, new C26099a(), null, 8, null), 103, UnAvailableCouponsProxy.class, null, null, 12, null);
    }

    /* JADX INFO: renamed from: B0 */
    public static final void m63859B0(GridCouponsActivity gridCouponsActivity, InterfaceC38162f it) {
        Intrinsics.checkNotNullParameter(it, "it");
        gridCouponsActivity.m63893M0();
    }

    /* JADX INFO: renamed from: G0 */
    public static final Unit m63861G0(GridCouponsActivity gridCouponsActivity, AllCouponsItemModel allCouponsItemModel) {
        if (allCouponsItemModel != null) {
            gridCouponsActivity.f52296q = allCouponsItemModel;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n0 */
    public static final Unit m63889n0(GridCouponsActivity gridCouponsActivity) throws JSONException {
        gridCouponsActivity.m63894Q0("confirm");
        Intent intent = new Intent();
        AllCouponsItemModel allCouponsItemModel = gridCouponsActivity.f52296q;
        intent.putExtra("check_item_id", allCouponsItemModel != null ? allCouponsItemModel.getCouponsId() : null);
        AllCouponsItemModel allCouponsItemModel2 = gridCouponsActivity.f52296q;
        intent.putExtra("check_item_percent", allCouponsItemModel2 != null ? allCouponsItemModel2.getDiscountPercentageShowBd() : null);
        AllCouponsItemModel allCouponsItemModel3 = gridCouponsActivity.f52296q;
        intent.putExtra("check_item_min_investment", allCouponsItemModel3 != null ? allCouponsItemModel3.getMinTotalInvestments() : null);
        gridCouponsActivity.setResult(-1, intent);
        gridCouponsActivity.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o0 */
    public static final Unit m63890o0(GridCouponsActivity gridCouponsActivity) throws JSONException {
        gridCouponsActivity.m63894Q0(ConstantsKt.FACE_CAPTURE_MODE_BACK);
        gridCouponsActivity.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m63894Q0(@NotNull String clickType) throws JSONException {
        Intrinsics.checkNotNullParameter(clickType, "clickType");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("clickPosition", clickType);
        jSONObject.put("messageType", m63901t0());
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a("B1chooseCoupon", "chooseCoupon", "1", jSONObject);
    }

    @Nullable
    /* JADX INFO: renamed from: p0 */
    public final String m63897p0() {
        return (String) this.f52293n.getValue();
    }

    /* JADX INFO: renamed from: q0 */
    public final CouponsDataViewModel m63898q0() {
        return (CouponsDataViewModel) this.f52297r.getValue();
    }

    /* JADX INFO: renamed from: r0 */
    public final int m63899r0() {
        return R$layout.btrading_bot_kit_activity_grid_coupons;
    }

    /* JADX INFO: renamed from: s0 */
    public final WrapperLoadingView m63900s0() {
        return (WrapperLoadingView) this.f52295p.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: u0 */
    public final String m63902u0() {
        return (String) this.f52294o.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: v0 */
    public final String m63903v0() {
        return (String) this.f52290k.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: w0 */
    public final String m63904w0() {
        return (String) this.f52289j.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: x0 */
    public final String m63905x0() {
        return (String) this.f52291l.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: y0 */
    public final BigDecimal m63906y0() {
        return (BigDecimal) this.f52292m.getValue();
    }

    /* JADX INFO: renamed from: z0 */
    public final C42057a m63907z0() {
        return (C42057a) this.f52288i.getValue(this, f52287u[0]);
    }

    /* JADX INFO: renamed from: A0 */
    private final void m63858A0() {
        KuCoinRefreshLayout kuCoinRefreshLayout;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        C42057a c42057aM63907z0 = m63907z0();
        if (c42057aM63907z0 != null && (recyclerView3 = c42057aM63907z0.f92356c) != null) {
            recyclerView3.setItemAnimator(null);
        }
        C42057a c42057aM63907z1 = m63907z0();
        if (c42057aM63907z1 != null && (recyclerView2 = c42057aM63907z1.f92356c) != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(this));
        }
        C42057a c42057aM63907z2 = m63907z0();
        if (c42057aM63907z2 != null && (recyclerView = c42057aM63907z2.f92356c) != null) {
            recyclerView.setAdapter(this.f52298s.m95556a());
        }
        C42057a c42057aM63907z3 = m63907z0();
        if (c42057aM63907z3 != null && (kuCoinRefreshLayout = c42057aM63907z3.f92357d) != null) {
            kuCoinRefreshLayout.setOnRefreshListener(new InterfaceC40373g() { // from class: com.kubi.tradingbotkit.business.coupons.d
                @Override // jb0.InterfaceC40373g
                /* JADX INFO: renamed from: a */
                public final void mo15329a(InterfaceC38162f interfaceC38162f) {
                    GridCouponsActivity.m63859B0(this.f52310b, interfaceC38162f);
                }
            });
        }
    }

    /* JADX INFO: renamed from: E0 */
    public static final WrapperLoadingView m63860E0(GridCouponsActivity gridCouponsActivity) {
        KuCoinRefreshLayout kuCoinRefreshLayout;
        C42057a c42057aM63907z0 = gridCouponsActivity.m63907z0();
        if (c42057aM63907z0 != null) {
            kuCoinRefreshLayout = c42057aM63907z0.f92357d;
        } else {
            kuCoinRefreshLayout = null;
        }
        return WrapperLoadingView.injectView(kuCoinRefreshLayout);
    }

    /* JADX INFO: renamed from: H0 */
    public static final Unit m63862H0(final GridCouponsActivity gridCouponsActivity, CouponsSelectUIState couponsSelectUIState) throws JSONException {
        RecyclerView recyclerView;
        List mutableList;
        KuCoinRefreshLayout kuCoinRefreshLayout;
        gridCouponsActivity.m63895R0(C27039d.m66650j(couponsSelectUIState.getF52307b()), C27039d.m66650j(couponsSelectUIState.getF52308c()));
        C42057a c42057aM63907z0 = gridCouponsActivity.m63907z0();
        if (c42057aM63907z0 != null && (kuCoinRefreshLayout = c42057aM63907z0.f92357d) != null) {
            kuCoinRefreshLayout.setRefreshing(false);
        }
        if (couponsSelectUIState.m63916d() != null) {
            Collection collection = (Collection) couponsSelectUIState.m63916d();
            if (collection != null && !collection.isEmpty()) {
                gridCouponsActivity.m63900s0().showContent();
                C42057a c42057aM63907z1 = gridCouponsActivity.m63907z0();
                if (c42057aM63907z1 != null && (recyclerView = c42057aM63907z1.f92356c) != null) {
                    List list = (List) couponsSelectUIState.m63916d();
                    if (list != null) {
                        mutableList = CollectionsKt.toMutableList((Collection) list);
                    } else {
                        mutableList = null;
                    }
                    C24346y.m59052b(recyclerView, mutableList);
                }
            } else {
                gridCouponsActivity.m63900s0().showEmpty(R$string.kc_tb_coupon_empty, R$drawable.ic2_common_empty, new View.OnClickListener() { // from class: com.kubi.tradingbotkit.business.coupons.g
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        GridCouponsActivity.m63863I0(this.f52313b, view);
                    }
                });
            }
        }
        if (couponsSelectUIState.getF52309d() != null) {
            gridCouponsActivity.m63900s0().showEmpty(R$string.load_failed_click_retry, R$drawable.ic2_common_empty, new View.OnClickListener() { // from class: com.kubi.tradingbotkit.business.coupons.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GridCouponsActivity.m63864J0(this.f52314b, view);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I0 */
    public static final void m63863I0(GridCouponsActivity gridCouponsActivity, View view) {
        gridCouponsActivity.m63900s0().showLoading();
        gridCouponsActivity.m63893M0();
    }

    /* JADX INFO: renamed from: J0 */
    public static final void m63864J0(GridCouponsActivity gridCouponsActivity, View view) {
        gridCouponsActivity.m63900s0().showLoading();
        gridCouponsActivity.m63893M0();
    }

    /* JADX INFO: renamed from: K0 */
    public static final String m63865K0(GridCouponsActivity gridCouponsActivity) {
        Intent intent = gridCouponsActivity.getIntent();
        if (intent != null) {
            return RouteExKt.m56280w(intent, "post_type");
        }
        return null;
    }

    /* JADX INFO: renamed from: L0 */
    public static final String m63866L0(GridCouponsActivity gridCouponsActivity) {
        Intent intent = gridCouponsActivity.getIntent();
        if (intent != null) {
            return RouteExKt.m56280w(intent, "quote_name");
        }
        return null;
    }

    /* JADX INFO: renamed from: N0 */
    public static final String m63867N0(GridCouponsActivity gridCouponsActivity) {
        Intent intent = gridCouponsActivity.getIntent();
        if (intent != null) {
            return RouteExKt.m56280w(intent, "symbol_name");
        }
        return null;
    }

    /* JADX INFO: renamed from: O0 */
    public static final String m63868O0(GridCouponsActivity gridCouponsActivity) {
        Intent intent = gridCouponsActivity.getIntent();
        if (intent != null) {
            return RouteExKt.m56280w(intent, "template_type");
        }
        return null;
    }

    /* JADX INFO: renamed from: P0 */
    public static final BigDecimal m63869P0(GridCouponsActivity gridCouponsActivity) {
        Intent intent = gridCouponsActivity.getIntent();
        if (intent != null) {
            return (BigDecimal) RouteExKt.m56276u(intent, "total_investments");
        }
        return null;
    }

    /* JADX INFO: renamed from: l0 */
    public static final String m63887l0(GridCouponsActivity gridCouponsActivity) {
        Intent intent = gridCouponsActivity.getIntent();
        if (intent != null) {
            return RouteExKt.m56280w(intent, "check_item_id");
        }
        return null;
    }

    /* JADX INFO: renamed from: m0 */
    private final void m63888m0() {
        AppCompatTextView appCompatTextView;
        ImageView imageView;
        C42057a c42057aM63907z0 = m63907z0();
        if (c42057aM63907z0 != null && (imageView = c42057aM63907z0.f92355b) != null) {
            C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.tradingbotkit.business.coupons.e
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GridCouponsActivity.m63890o0(this.f52311b);
                }
            }, 1, null);
        }
        C42057a c42057aM63907z1 = m63907z0();
        if (c42057aM63907z1 != null && (appCompatTextView = c42057aM63907z1.f92358e) != null) {
            C27046k.m66711z(appCompatTextView, 0L, new Function0() { // from class: com.kubi.tradingbotkit.business.coupons.f
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GridCouponsActivity.m63889n0(this.f52312b);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: C0 */
    public final boolean m63891C0() {
        String strM63903v0;
        String strM63905x0;
        String strM63904w0 = m63904w0();
        if (strM63904w0 != null && strM63904w0.length() != 0 && (strM63903v0 = m63903v0()) != null && strM63903v0.length() != 0 && (strM63905x0 = m63905x0()) != null && strM63905x0.length() != 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: F0 */
    public final void m63892F0() {
        m63898q0().m63937B().observe(this, new C26100b(new Function1() { // from class: com.kubi.tradingbotkit.business.coupons.p
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GridCouponsActivity.m63861G0(this.f52322b, (AllCouponsItemModel) obj);
            }
        }));
        m63898q0().m63936A().observe(this, new C26100b(new Function1() { // from class: com.kubi.tradingbotkit.business.coupons.q
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GridCouponsActivity.m63862H0(this.f52323b, (CouponsSelectUIState) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: M0 */
    public final void m63893M0() {
        m63898q0().m63939D(C27041f.m66668h(m63904w0()), C27041f.m66668h(m63903v0()), C27041f.m66668h(m63905x0()), m63906y0(), m63897p0());
    }

    /* JADX INFO: renamed from: R0 */
    public final void m63895R0(int i11, int i12) throws JSONException {
        String strM63901t0 = m63901t0();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("messageType", strM63901t0);
        jSONObject.put("postType", m63902u0());
        jSONObject.put("allItemAmount", i11);
        jSONObject.put("messageNumber", i12);
        Unit unit = Unit.INSTANCE;
        C43852m.m96593e("B1chooseCoupon", "chooseCoupon", "1", jSONObject);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m63896k0(AllCouponsItemModel allCouponsItemModel) {
        AllCouponsItemModel allCouponsItemModel2;
        if (allCouponsItemModel.getIsChecked()) {
            m63898q0().m63937B().setValue(null);
            allCouponsItemModel2 = allCouponsItemModel;
        } else {
            allCouponsItemModel2 = null;
        }
        this.f52296q = allCouponsItemModel2;
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new GridCouponsActivity$changeViewSelect$1(this, allCouponsItemModel, null), 3, null);
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) throws Throwable {
        super.onCreate(savedInstanceState);
        setContentView(m63899r0());
        m63858A0();
        m63892F0();
        m63888m0();
        if (m63891C0()) {
            finish();
        }
        m63893M0();
        m63900s0().showLoading();
    }

    /* JADX INFO: renamed from: t0 */
    public final String m63901t0() {
        if (Intrinsics.areEqual(m63905x0(), "GRID")) {
            return SearchCategory$Companion.SPOT;
        }
        return "contract";
    }
}
