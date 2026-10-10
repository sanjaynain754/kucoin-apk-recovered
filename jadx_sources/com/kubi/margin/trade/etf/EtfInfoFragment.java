package com.kubi.margin.trade.etf;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.data.entity.EtfAssets;
import com.kubi.data.entity.EtfCoinEntity;
import com.kubi.margin.R$string;
import com.kubi.margin.view.ExpandableTextView;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.util.C24277v;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.uikit.livekit.p180kc.data.entity.ClickCardReport;
import gf.C37890n;
import java.math.BigDecimal;
import java.util.List;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p206dp.C36933q;
import p429lf.C42180b;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: EtfInfoFragment.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 #2\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u001a\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0017J\u0012\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010 H\u0002J\b\u0010\"\u001a\u00020\u001dH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012¨\u0006$"}, m90084d2 = {"Lcom/kubi/margin/trade/etf/EtfInfoFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "_binding", "Lcom/kubi/margin/databinding/BmarginFragmentEtfInfoBinding;", "binding", "getBinding", "()Lcom/kubi/margin/databinding/BmarginFragmentEtfInfoBinding;", "vm", "Lcom/kubi/margin/trade/etf/EtfInfoViewModel;", "getVm", "()Lcom/kubi/margin/trade/etf/EtfInfoViewModel;", "vm$delegate", "Lkotlin/Lazy;", "adapter", "Lcom/kubi/margin/trade/etf/EtfInfoAdapter;", "getAdapter", "()Lcom/kubi/margin/trade/etf/EtfInfoAdapter;", "adapter$delegate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "getAssetType", "", "type", "onDestroyView", "Companion", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nEtfInfoFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EtfInfoFragment.kt\ncom/kubi/margin/trade/etf/EtfInfoFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,163:1\n106#2,15:164\n1818#3,4:179\n*S KotlinDebug\n*F\n+ 1 EtfInfoFragment.kt\ncom/kubi/margin/trade/etf/EtfInfoFragment\n*L\n31#1:164,15\n94#1:179,4\n*E\n"})
public final class EtfInfoFragment extends BaseFragment {

    /* JADX INFO: renamed from: X */
    @NotNull
    public static final Companion f33880X = new Companion(null);

    /* JADX INFO: renamed from: U */
    @Nullable
    public C36933q f33881U;

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f33882V;

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f33883W;

    /* JADX INFO: compiled from: EtfInfoFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/margin/trade/etf/EtfInfoFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/margin/trade/etf/EtfInfoFragment;", "coin", "", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nEtfInfoFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EtfInfoFragment.kt\ncom/kubi/margin/trade/etf/EtfInfoFragment$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,163:1\n1#2:164\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final EtfInfoFragment newInstance(@NotNull String coin) {
            Intrinsics.checkNotNullParameter(coin, "coin");
            EtfInfoFragment etfInfoFragment = new EtfInfoFragment();
            Bundle bundle = new Bundle();
            bundle.putString("coin", coin);
            etfInfoFragment.setArguments(bundle);
            return etfInfoFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.margin.trade.etf.EtfInfoFragment$a */
    /* JADX INFO: compiled from: EtfInfoFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C18314a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f33884b;

        public C18314a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f33884b = function;
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
            return this.f33884b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f33884b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: q3 */
    public static final EtfInfoAdapter m40293q3() {
        return new EtfInfoAdapter();
    }

    /* JADX INFO: renamed from: v3 */
    public static final Unit m40294v3(EtfInfoFragment etfInfoFragment) {
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.etf_basket).m54153J4(R$string.etf_basket_tips).m54162S4(R$string.already_know, null).m54172c5(etfInfoFragment.getChildFragmentManager());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w3 */
    public static final Unit m40295w3(EtfInfoFragment etfInfoFragment) {
        AlertDialogFragmentHelper alertDialogFragmentHelperM54167X4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.etf_management_fee_per_day);
        int i11 = R$string.etf_management_fee_per_day_tips;
        EtfCoinEntity value = etfInfoFragment.m40302u3().m40306q().getValue();
        alertDialogFragmentHelperM54167X4.m54156M4(etfInfoFragment.getString(i11, C27041f.m66669i(value != null ? value.getPayManagementFeeTime() : null, "07:45:00(UTC+8)"))).m54162S4(R$string.already_know, null).m54172c5(etfInfoFragment.getChildFragmentManager());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x3 */
    public static final Unit m40296x3(EtfInfoFragment etfInfoFragment) {
        Router.f46192a.m56184f("etf/records").m4038a("coin", etfInfoFragment.m40302u3().m40305p().getValue()).m4038a("needLogin", Boolean.FALSE).m4048k();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y3 */
    public static final Unit m40297y3(EtfInfoFragment etfInfoFragment, String str) {
        C37890n c37890n = C37890n.f85269a;
        Intrinsics.checkNotNull(str);
        CoinInfoEntity coinInfoEntityM85613u = c37890n.m85613u(str);
        C24277v.m58540e(etfInfoFragment.getContext(), coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getIconUrl() : null, etfInfoFragment.m40301t3().f81889j);
        etfInfoFragment.m40302u3().m40303n();
        etfInfoFragment.m40302u3().m40304o();
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.f33881U = C36933q.m82735c(inflater, container, false);
        ScrollView root = m40301t3().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    @SuppressLint({"SetTextI18n"})
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        DashTextView tvBasketLabel = m40301t3().f81892m;
        Intrinsics.checkNotNullExpressionValue(tvBasketLabel, "tvBasketLabel");
        C27046k.m66711z(tvBasketLabel, 0L, new Function0() { // from class: com.kubi.margin.trade.etf.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EtfInfoFragment.m40294v3(this.f33902b);
            }
        }, 1, null);
        DashTextView tvFeeLabel = m40301t3().f81894o;
        Intrinsics.checkNotNullExpressionValue(tvFeeLabel, "tvFeeLabel");
        C27046k.m66711z(tvFeeLabel, 0L, new Function0() { // from class: com.kubi.margin.trade.etf.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EtfInfoFragment.m40295w3(this.f33903b);
            }
        }, 1, null);
        BaseTextView tvMore = m40301t3().f81904y;
        Intrinsics.checkNotNullExpressionValue(tvMore, "tvMore");
        C27046k.m66711z(tvMore, 0L, new Function0() { // from class: com.kubi.margin.trade.etf.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EtfInfoFragment.m40296x3(this.f33904b);
            }
        }, 1, null);
        m40301t3().f81890k.setHasFixedSize(true);
        m40301t3().f81890k.setNestedScrollingEnabled(false);
        m40301t3().f81890k.setAdapter(m40299r3());
        Transformations.distinctUntilChanged(m40302u3().m40305p()).observe(getViewLifecycleOwner(), new C18314a(new Function1() { // from class: com.kubi.margin.trade.etf.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EtfInfoFragment.m40297y3(this.f33905b, (String) obj);
            }
        }));
        m40302u3().m40306q().observe(getViewLifecycleOwner(), new C18314a(new Function1() { // from class: com.kubi.margin.trade.etf.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EtfInfoFragment.m40298z3(this.f33906b, (EtfCoinEntity) obj);
            }
        }));
        m40302u3().m40307r().observe(getViewLifecycleOwner(), new C18314a(new Function1() { // from class: com.kubi.margin.trade.etf.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EtfInfoFragment.m40285A3(this.f33907b, (List) obj);
            }
        }));
        m40302u3().m40308s(getArguments());
    }

    /* JADX INFO: renamed from: r3 */
    public final EtfInfoAdapter m40299r3() {
        return (EtfInfoAdapter) this.f33883W.getValue();
    }

    /* JADX INFO: renamed from: s3 */
    public final String m40300s3(String str) {
        String lowerCase;
        if (str != null) {
            lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = null;
        }
        if (Intrinsics.areEqual(lowerCase, ClickCardReport.ReportData.CARD_TYPE_FUTURE)) {
            String string = getString(R$string.futures);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
        if (!Intrinsics.areEqual(lowerCase, SearchCategory$Companion.SPOT)) {
            return "";
        }
        String string2 = getString(R$string.spot);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    /* JADX INFO: renamed from: t3 */
    public final C36933q m40301t3() {
        C36933q c36933q = this.f33881U;
        Intrinsics.checkNotNull(c36933q);
        return c36933q;
    }

    /* JADX INFO: renamed from: u3 */
    public final EtfInfoViewModel m40302u3() {
        return (EtfInfoViewModel) this.f33882V.getValue();
    }

    public EtfInfoFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.kubi.margin.trade.etf.EtfInfoFragment$special$$inlined$viewModels$default$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final Fragment invoke() {
                return this;
            }

            {
                super(0);
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.margin.trade.etf.EtfInfoFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }

            {
                super(0);
            }
        });
        final Function0 function1 = null;
        this.f33882V = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(EtfInfoViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.margin.trade.etf.EtfInfoFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.margin.trade.etf.EtfInfoFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function2 = function1;
                if (function2 != null && (creationExtras = (CreationExtras) function2.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM103549viewModels$lambda1 = FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103549viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103549viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.margin.trade.etf.EtfInfoFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM103549viewModels$lambda1 = FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103549viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103549viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
        this.f33883W = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.trade.etf.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EtfInfoFragment.m40293q3();
            }
        });
    }

    /* JADX INFO: renamed from: A3 */
    public static final Unit m40285A3(EtfInfoFragment etfInfoFragment, List list) {
        etfInfoFragment.m40299r3().replaceData(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z3 */
    public static final Unit m40298z3(EtfInfoFragment etfInfoFragment, EtfCoinEntity etfCoinEntity) {
        String strM92642g;
        String string;
        int i11;
        String string2;
        String str;
        etfInfoFragment.m40301t3().f81879D.setText(etfCoinEntity.getName());
        etfInfoFragment.m40301t3().f81897r.setText(etfInfoFragment.getString(R$string.tag_more_title, etfCoinEntity.getName()));
        BaseTextView baseTextView = etfInfoFragment.m40301t3().f81891l;
        int i12 = 0;
        String string3 = "";
        for (Object obj : C27024b.m66560c(etfCoinEntity.getAssets())) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            EtfAssets etfAssets = (EtfAssets) obj;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string3);
            if (i12 == 0) {
                str = "";
            } else {
                str = ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE;
            }
            sb2.append(str);
            sb2.append(etfAssets.getAssetSize());
            sb2.append(' ');
            sb2.append(etfAssets.getAssetName());
            sb2.append(' ');
            sb2.append(etfInfoFragment.m40300s3(etfAssets.getAssetType()));
            string3 = sb2.toString();
            i12 = i13;
        }
        baseTextView.setText(string3);
        etfInfoFragment.m40301t3().f81902w.setText(etfCoinEntity.getAssertManagement());
        etfInfoFragment.m40301t3().f81877B.setText(etfCoinEntity.getCurrentCirculation());
        etfInfoFragment.m40301t3().f81900u.setText(etfCoinEntity.getMultiple() + "x/" + etfCoinEntity.getLeverage() + 'x');
        BaseTextView baseTextView2 = etfInfoFragment.m40301t3().f81893n;
        BigDecimal dailyManageFee = etfCoinEntity.getDailyManageFee();
        if (dailyManageFee != null) {
            strM92642g = C42180b.m92642g(dailyManageFee, null, null, 0, false, false, false, 63, null);
        } else {
            strM92642g = null;
        }
        baseTextView2.setText(C42180b.m92649n(strM92642g));
        BaseTextView baseTextView3 = etfInfoFragment.m40301t3().f81905z;
        String rebalanceByTime = etfCoinEntity.getRebalanceByTime();
        if (rebalanceByTime != null && rebalanceByTime.length() != 0) {
            string = etfInfoFragment.getString(R$string.etf_regular_rebalance, etfCoinEntity.getRebalanceByTime());
        } else {
            string = etfInfoFragment.getString(R$string.etf_regular_rebalance_mutiple, etfCoinEntity.getMultiple());
        }
        baseTextView3.setText(string);
        BaseTextView baseTextView4 = etfInfoFragment.m40301t3().f81898s;
        if (StringsKt.equals(etfCoinEntity.getBuyType(), "L", true)) {
            i11 = R$string.etf_short_irregular_rebalance;
        } else {
            i11 = R$string.etf_short_irregular_rebalance;
        }
        baseTextView4.setText(etfInfoFragment.getString(i11, etfCoinEntity.getOriginalCurrency(), etfCoinEntity.getRebalanceByReChangeRate()));
        ExpandableTextView expandableTextView = etfInfoFragment.m40301t3().f81896q;
        StringBuilder sb3 = new StringBuilder();
        if (StringsKt.equals(etfCoinEntity.getBuyType(), "L", true)) {
            string2 = etfInfoFragment.getString(R$string.eft_long_description, etfCoinEntity.getName(), etfCoinEntity.getMultiple(), etfCoinEntity.getOriginalCurrency(), etfCoinEntity.getMultiple(), etfCoinEntity.getOriginalCurrency(), etfCoinEntity.getOriginalCurrency(), etfCoinEntity.getName(), etfCoinEntity.getMultiple());
        } else {
            string2 = etfInfoFragment.getString(R$string.eft_short_description, etfCoinEntity.getName(), etfCoinEntity.getMultiple(), etfCoinEntity.getOriginalCurrency(), etfCoinEntity.getMultiple(), etfCoinEntity.getOriginalCurrency(), etfCoinEntity.getOriginalCurrency(), etfCoinEntity.getName(), etfCoinEntity.getMultiple());
        }
        sb3.append(string2);
        sb3.append('\n');
        sb3.append(etfInfoFragment.getString(R$string.etf_risk_description));
        sb3.append('\n');
        sb3.append(etfInfoFragment.getString(R$string.etf_risk_description1));
        expandableTextView.setText(sb3.toString());
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f33881U = null;
    }
}
