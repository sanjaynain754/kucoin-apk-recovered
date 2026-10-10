package com.kubi.assets.unify;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.StringRes;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentManager;
import com.kubi.assets.AssetExKt;
import com.kubi.assets.AssetRemoteConfig;
import com.kubi.assets.C11351z0;
import com.kubi.assets.R$drawable;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.AssetV2OverviewEntity;
import com.kubi.assets.entity.SpotAccountOverviewEntity;
import com.kubi.assets.entity.UnifiedAccountOverview;
import com.kubi.assets.entity.UnifiedAccountOverviewKt;
import com.kubi.assets.entity.UnifiedOverviewEntity;
import com.kubi.assets.margin.view.MarginPnlHeaderView;
import com.kubi.assets.service.AssetsDepend;
import com.kubi.assets.service.AssetsHelper;
import com.kubi.assets.view.AccountInfoHeaderView;
import com.kubi.assets.view.C11273q;
import com.kubi.assets.view.VerticalIconTextBtn;
import com.kubi.data.entity.UnifiedAssetEntity;
import com.kubi.resources.C22890g;
import com.kubi.resources.CollateralStatusUiHelper;
import com.kubi.resources.InjectExpandableUIBehavior;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.widget.AlertTipsTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.Level;
import com.kubi.resources.widget.LevelIndicatorView;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.router.core.Router;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.unify.api.IUnifyAccountService;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import gf.C37885i;
import java.math.BigDecimal;
import java.util.List;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p637ta.C44791i6;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Pair;
import p852kotlin.Triple;
import p852kotlin.Unit;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.Typography;
import rs.AbstractC44173c;
import rs.C44172b;
import w00.C45682f;

/* JADX INFO: compiled from: UnifyAssetHeaderView.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 72\u00020\u0001:\u000278B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000fJ\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0002J\u0012\u0010\u0018\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\u0012\u0010\u001b\u001a\u00020\u00152\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007J\u0012\u0010\u001b\u001a\u00020\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0007J\u0010\u0010\u001e\u001a\u00020\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dJ\b\u0010\u001f\u001a\u00020\u0015H\u0002J\u0012\u0010 \u001a\u00020\u00152\b\u0010!\u001a\u0004\u0018\u00010\"H\u0007J\u0012\u0010#\u001a\u00020\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J\u0012\u0010$\u001a\u00020\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0003J\u0012\u0010%\u001a\u00020\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J.\u0010&\u001a\u00020\u00152\b\b\u0001\u0010'\u001a\u00020(2\b\b\u0001\u0010)\u001a\u00020(2\u0010\b\u0002\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010+H\u0002J\u001e\u0010,\u001a\u0014\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/0-*\u00020\u001dH\u0002J$\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020305H\u0002J\u0014\u00106\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020305H\u0002R\u001d\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00069"}, m90084d2 = {"Lcom/kubi/assets/unify/UnifyAssetHeaderView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/kubi/assets/databinding/ViewUnifiedAssetsHeaderBinding;", "getBinding", "()Lcom/kubi/assets/databinding/ViewUnifiedAssetsHeaderBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "fragment", "Lcom/kubi/assets/unify/AssetUnifiedFragment;", "assetEntity", "Lcom/kubi/assets/entity/AssetV2OverviewEntity;", "getAccountInfoHeader", "Lcom/kubi/assets/view/AccountInfoHeaderView;", "bindFragment", "", "parentFragment", "initBaseView", "initUnifiedTipUI", "assets", "Ljava/math/BigDecimal;", "bindOverviewInfoData", "data", "Lcom/kubi/assets/entity/UnifiedAccountOverview;", "bindSubHeadInfoData", "initListener", "bindUnifiedPnlData", "overview", "Lcom/kubi/assets/entity/UnifiedOverviewEntity;", "fillLiabilityContent", "fillRiskRateContent", "fillUnrealizedPNLContent", "showTipsDialog", "title", "", "message", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lkotlin/Function0;", "getLevelDisplay", "Lkotlin/Triple;", "", "Lcom/kubi/resources/widget/Level;", "getRiskLevel", "Lcom/kubi/assets/unify/UnifyAssetHeaderView$RiskLevel;", "ratio", "", "riskGradeConfig", "Lkotlin/Pair;", "getRiskGradeLevelConfig", "Companion", "RiskLevel", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUnifyAssetHeaderView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnifyAssetHeaderView.kt\ncom/kubi/assets/unify/UnifyAssetHeaderView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n*L\n1#1,438:1\n52#2:439\n80#2,7:440\n*S KotlinDebug\n*F\n+ 1 UnifyAssetHeaderView.kt\ncom/kubi/assets/unify/UnifyAssetHeaderView\n*L\n61#1:439\n61#1:440,7\n*E\n"})
public final class UnifyAssetHeaderView extends FrameLayout {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC24293a f18939b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public AssetUnifiedFragment f18940c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public AssetV2OverviewEntity f18941d;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ KProperty<Object>[] f18938f = {Reflection.property1(new PropertyReference1Impl(UnifyAssetHeaderView.class, "binding", "getBinding()Lcom/kubi/assets/databinding/ViewUnifiedAssetsHeaderBinding;", 0))};

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Companion f18937e = new Companion(null);

    /* JADX INFO: compiled from: UnifyAssetHeaderView.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/assets/unify/UnifyAssetHeaderView$Companion;", "", "<init>", "()V", "DEFAULT_LOW_RISK_THRESHOLD", "", "DEFAULT_HIGH_RISK_THRESHOLD", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: compiled from: UnifyAssetHeaderView.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/assets/unify/UnifyAssetHeaderView$RiskLevel;", "", "<init>", "(Ljava/lang/String;I)V", "LOW", "MEDIUM", "HIGH", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public enum RiskLevel {
        LOW,
        MEDIUM,
        HIGH;


        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ EnumEntries f18943c = EnumEntriesKt.enumEntries(m19762a());

        @NotNull
        public static EnumEntries<RiskLevel> getEntries() {
            return f18943c;
        }
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: r */
    public final void m19756r(UnifiedAccountOverview unifiedAccountOverview) {
        Level third2;
        ShowHideTextView showHideTextView;
        TextView textViewM97383c;
        ShowHideTextView showHideTextView2;
        ShowHideTextView showHideTextView3;
        LevelIndicatorView levelIndicatorView;
        Triple<String, String, Level> tripleM19758w = unifiedAccountOverview != null ? m19758w(unifiedAccountOverview) : null;
        if (tripleM19758w == null || (third2 = tripleM19758w.getThird()) == null) {
            third2 = Level.a.f44928a;
        }
        C44791i6 binding = getBinding();
        if (binding != null && (levelIndicatorView = binding.f100190u) != null) {
            String string = levelIndicatorView.getContext().getString(R$string.unify_fund_cross_risk_rate_key);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            levelIndicatorView.m54657b(string, true);
            levelIndicatorView.setLevel(third2);
            C27046k.m66711z(levelIndicatorView, 0L, new Function0() { // from class: com.kubi.assets.unify.n0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return UnifyAssetHeaderView.m19745s(this.f19038b);
                }
            }, 1, null);
        }
        C44791i6 binding2 = getBinding();
        if (binding2 != null && (showHideTextView3 = binding2.f100192w) != null) {
            showHideTextView3.setText(C27041f.m66669i(unifiedAccountOverview != null ? UnifiedAccountOverviewKt.formatRiskRatio(unifiedAccountOverview) : null, "--"));
        }
        C44791i6 binding3 = getBinding();
        if (binding3 != null && (showHideTextView2 = binding3.f100191v) != null) {
            showHideTextView2.setTextColor(ContextCompat.getColor(getContext(), third2.mo55374a()));
        }
        C44791i6 binding4 = getBinding();
        if (binding4 == null || (showHideTextView = binding4.f100191v) == null || (textViewM97383c = C44172b.m97383c(showHideTextView, new AbstractC44173c.a(0, false, 3, null), false, 2, null)) == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('(');
        sb2.append(C27041f.m66669i(tripleM19758w != null ? tripleM19758w.getSecond() : null, "--"));
        sb2.append(": ");
        sb2.append(C27041f.m66669i(tripleM19758w != null ? tripleM19758w.getFirst() : null, "--"));
        sb2.append(')');
        textViewM97383c.setText(sb2.toString());
    }

    /* JADX INFO: renamed from: com.kubi.assets.unify.UnifyAssetHeaderView$a */
    /* JADX INFO: compiled from: UnifyAssetHeaderView.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C11137a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RiskLevel.values().length];
            try {
                iArr[RiskLevel.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RiskLevel.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RiskLevel.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnifyAssetHeaderView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f18939b = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C44791i6>() { // from class: com.kubi.assets.unify.UnifyAssetHeaderView$special$$inlined$customViewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C44791i6 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C44791i6.m99100a(C45682f.m100800a(viewGroup));
            }
        });
        LayoutInflater.from(context).inflate(R$layout.view_unified_assets_header, this);
    }

    /* JADX INFO: renamed from: A */
    public static final Unit m19727A(UnifyAssetHeaderView unifyAssetHeaderView) {
        m19732H(unifyAssetHeaderView, R$string.kc_asset_pnl_today_title, R$string.kc_asset_uta_pnl_desc, null, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B */
    public static final Unit m19728B() {
        Router.f46192a.m56184f(C11351z0.m20186a() + C11351z0.m20194i()).m4048k();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C */
    public static final Unit m19729C(UnifyAssetHeaderView unifyAssetHeaderView) {
        FragmentManager childFragmentManager;
        AssetUnifiedFragment assetUnifiedFragment = unifyAssetHeaderView.f18940c;
        if (assetUnifiedFragment != null && (childFragmentManager = assetUnifiedFragment.getChildFragmentManager()) != null) {
            IUnifyAccountService iUnifyAccountService = IUnifyAccountService.f53155a.get();
            Context context = unifyAssetHeaderView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            IUnifyAccountService.m64975g(iUnifyAccountService, context, null, null, childFragmentManager, 6, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D */
    public static final Unit m19730D() {
        AssetsHelper.m19137F(AssetsHelper.f18684a, null, 0, false, 7, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E */
    public static final Unit m19731E() {
        AssetsHelper.m19139N(AssetsHelper.f18684a, null, "UNIFIED", null, 5, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m19732H(UnifyAssetHeaderView unifyAssetHeaderView, int i11, int i12, Function0 function0, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            function0 = null;
        }
        unifyAssetHeaderView.m19749G(i11, i12, function0);
    }

    /* JADX INFO: renamed from: I */
    public static final void m19733I(Function0 function0, DialogInterface dialogInterface, int i11) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    private final C44791i6 getBinding() {
        return (C44791i6) this.f18939b.getValue(this, f18938f[0]);
    }

    private final Pair<Double, Double> getRiskGradeLevelConfig() {
        List<Double> listMo64977A = IUnifyAccountService.f53155a.get().mo64977A();
        return listMo64977A.size() == 2 ? new Pair<>(listMo64977A.get(0), listMo64977A.get(1)) : new Pair<>(Double.valueOf(0.6d), Double.valueOf(0.8d));
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m19744q(UnifyAssetHeaderView unifyAssetHeaderView) {
        m19732H(unifyAssetHeaderView, R$string.unify_fund_avg_liabilities, R$string.unify_fund_avg_liabilities_desc, null, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m19745s(UnifyAssetHeaderView unifyAssetHeaderView) {
        m19732H(unifyAssetHeaderView, R$string.unify_fund_cross_risk_rate_key, R$string.unify_funds_account_risk_ratio_desc, null, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m19746u(UnifyAssetHeaderView unifyAssetHeaderView) {
        m19732H(unifyAssetHeaderView, R$string.unify_fund_cross_unpnl_key, R$string.unify_funds_unpnl_desc, null, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v */
    public static final Unit m19747v(UnifyAssetHeaderView unifyAssetHeaderView) {
        m19732H(unifyAssetHeaderView, R$string.unify_fund_cross_avl_margin_key, R$string.unify_adjusted_margin_desc, null, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F */
    public final void m19748F(BigDecimal bigDecimal) {
        View view;
        AlertTipsTextView alertTipsTextView;
        IUnifyAccountService.Companion companion = IUnifyAccountService.f53155a;
        boolean z11 = companion.get().mo64991e() && !companion.get().mo64979C();
        String string = (bigDecimal == null || bigDecimal.compareTo(BigDecimal.ZERO) != 0) ? getContext().getString(R$string.alert_unify_trading_asset_upgrade) : getContext().getString(R$string.alert_unify_trading_no_asset_upgrade);
        Intrinsics.checkNotNull(string);
        C44791i6 binding = getBinding();
        if (binding != null && (alertTipsTextView = binding.f100194y) != null) {
            AssetExKt.m15138z(alertTipsTextView, z11);
        }
        C44791i6 binding2 = getBinding();
        if (binding2 != null && (view = binding2.f100181l) != null) {
            AssetExKt.m15138z(view, z11);
        }
        C44791i6 binding3 = getBinding();
        AlertTipsTextView alertTipsTextView2 = binding3 != null ? binding3.f100194y : null;
        C44791i6 binding4 = getBinding();
        new InjectExpandableUIBehavior(string, alertTipsTextView2, binding4 != null ? binding4.f100173d : null, 1, ContextCompat.getDrawable(getContext(), R$drawable.ic2_arrow_down_16), ContextCompat.getDrawable(getContext(), R$drawable.ic2_arrow_up_16));
    }

    /* JADX INFO: renamed from: G */
    public final void m19749G(@StringRes int i11, @StringRes int i12, final Function0<Unit> function0) {
        FragmentManager childFragmentManager;
        AssetUnifiedFragment assetUnifiedFragment = this.f18940c;
        if (assetUnifiedFragment == null || (childFragmentManager = assetUnifiedFragment.getChildFragmentManager()) == null) {
            return;
        }
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(i11).m54153J4(i12).m54162S4(R$string.i_already_know, new DialogInterface.OnClickListener() { // from class: com.kubi.assets.unify.r0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i13) {
                UnifyAssetHeaderView.m19733I(function0, dialogInterface, i13);
            }
        }).m54172c5(childFragmentManager);
    }

    /* JADX INFO: renamed from: k */
    public final void m19750k(@NotNull AssetUnifiedFragment parentFragment) {
        Intrinsics.checkNotNullParameter(parentFragment, "parentFragment");
        this.f18940c = parentFragment;
        m19760y(parentFragment);
        m19761z();
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: l */
    public final void m19751l(@Nullable AssetV2OverviewEntity assetV2OverviewEntity) {
        AccountInfoHeaderView accountInfoHeaderView;
        BigDecimal totalBalance;
        BigDecimal bigDecimalAbs;
        BigDecimal totalBalance2;
        String strM85562a;
        String strM93911l;
        this.f18941d = assetV2OverviewEntity;
        UnifiedAssetEntity unifiedAsset = assetV2OverviewEntity != null ? assetV2OverviewEntity.getUnifiedAsset() : null;
        String strM66669i = C27041f.m66669i((unifiedAsset == null || (totalBalance2 = unifiedAsset.getTotalBalance()) == null || (strM85562a = C37885i.m85562a(totalBalance2, assetV2OverviewEntity.getBaseCurrency(), C11273q.m20046b(assetV2OverviewEntity.getBaseCurrency()))) == null || (strM93911l = C42828b.m93911l(strM85562a)) == null) ? null : C42828b.m93915p(strM93911l), "--");
        String strM66669i2 = C27041f.m66669i((unifiedAsset == null || (totalBalance = unifiedAsset.getTotalBalance()) == null || (bigDecimalAbs = totalBalance.abs()) == null) ? null : C41014a.m89950x(C41014a.m89940n(bigDecimalAbs, assetV2OverviewEntity.getBaseCurrency()), null, null, 0, false, true, false, true, 47, null), "--");
        C44791i6 binding = getBinding();
        if (binding != null && (accountInfoHeaderView = binding.f100171b) != null) {
            accountInfoHeaderView.m19942B(assetV2OverviewEntity, strM66669i, strM66669i2);
        }
        m19748F(unifiedAsset != null ? unifiedAsset.getTotalBalance() : null);
        CollateralStatusUiHelper collateralStatusUiHelper = CollateralStatusUiHelper.f43602a;
        C44791i6 binding2 = getBinding();
        AppCompatImageView appCompatImageView = binding2 != null ? binding2.f100172c : null;
        AssetUnifiedFragment assetUnifiedFragment = this.f18940c;
        CollateralStatusUiHelper.m54264g(collateralStatusUiHelper, appCompatImageView, null, assetUnifiedFragment != null ? assetUnifiedFragment.getChildFragmentManager() : null, "UnifiedAssetsAdjustedEqCollateralStatusDialog", null, 16, null);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: m */
    public final void m19752m(@Nullable UnifiedAccountOverview unifiedAccountOverview) {
        AccountInfoHeaderView accountInfoHeaderView;
        BigDecimal equity;
        BigDecimal bigDecimalAbs;
        BigDecimal equity2;
        String strM85562a;
        String strM93911l;
        C44791i6 binding = getBinding();
        if (binding != null && (accountInfoHeaderView = binding.f100171b) != null) {
            accountInfoHeaderView.m19942B(this.f18941d, C27041f.m66669i((unifiedAccountOverview == null || (equity2 = unifiedAccountOverview.getEquity()) == null || (strM85562a = C37885i.m85562a(equity2, unifiedAccountOverview.getCurrency(), C11273q.m20046b(unifiedAccountOverview.getCurrency()))) == null || (strM93911l = C42828b.m93911l(strM85562a)) == null) ? null : C42828b.m93915p(strM93911l), "--"), C27041f.m66669i((unifiedAccountOverview == null || (equity = unifiedAccountOverview.getEquity()) == null || (bigDecimalAbs = equity.abs()) == null) ? null : C41014a.m89950x(C41014a.m89940n(bigDecimalAbs, unifiedAccountOverview.getCurrency()), null, null, 0, false, true, false, true, 47, null), "--"));
        }
        m19748F(unifiedAccountOverview != null ? unifiedAccountOverview.getEquity() : null);
        CollateralStatusUiHelper collateralStatusUiHelper = CollateralStatusUiHelper.f43602a;
        C44791i6 binding2 = getBinding();
        AppCompatImageView appCompatImageView = binding2 != null ? binding2.f100172c : null;
        Integer collateralStatus = unifiedAccountOverview != null ? unifiedAccountOverview.getCollateralStatus() : null;
        AssetUnifiedFragment assetUnifiedFragment = this.f18940c;
        CollateralStatusUiHelper.m54264g(collateralStatusUiHelper, appCompatImageView, collateralStatus, assetUnifiedFragment != null ? assetUnifiedFragment.getChildFragmentManager() : null, "UnifiedAssetsAdjustedEqCollateralStatusDialog", null, 16, null);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: o */
    public final void m19754o(@Nullable UnifiedOverviewEntity unifiedOverviewEntity) {
        MarginPnlHeaderView marginPnlHeaderView;
        MarginPnlHeaderView marginPnlHeaderView2;
        MarginPnlHeaderView marginPnlHeaderView3;
        if (!AssetRemoteConfig.f18903a.m19568k()) {
            C44791i6 binding = getBinding();
            if (binding == null || (marginPnlHeaderView3 = binding.f100168C) == null) {
                return;
            }
            ViewExtKt.m66577h(marginPnlHeaderView3);
            return;
        }
        C44791i6 binding2 = getBinding();
        if (binding2 != null && (marginPnlHeaderView2 = binding2.f100168C) != null) {
            ViewExtKt.m66594y(marginPnlHeaderView2);
        }
        AssetV2OverviewEntity assetV2OverviewEntity = this.f18941d;
        C27041f.m66669i(assetV2OverviewEntity != null ? assetV2OverviewEntity.getBaseCurrency() : null, AssetsDepend.f18689a.m19189j().d0().getBalanceCurrency());
        SpotAccountOverviewEntity spotAccountOverviewEntity = unifiedOverviewEntity != null ? new SpotAccountOverviewEntity(unifiedOverviewEntity.getTotalAssets(), unifiedOverviewEntity.getTodayPnl(), unifiedOverviewEntity.getTodayRoe(), unifiedOverviewEntity.getLast7DaysPnl(), unifiedOverviewEntity.getLast7DaysRoe(), unifiedOverviewEntity.getBaseCurrency(), unifiedOverviewEntity.getBaseFiatCurrency()) : null;
        C44791i6 binding3 = getBinding();
        if (binding3 == null || (marginPnlHeaderView = binding3.f100168C) == null) {
            return;
        }
        marginPnlHeaderView.m18051g(spotAccountOverviewEntity);
    }

    /* JADX INFO: renamed from: t */
    public final void m19757t(UnifiedAccountOverview unifiedAccountOverview) {
        ShowHideTextView showHideTextView;
        BigDecimal adjustedEquity;
        BigDecimal bigDecimalAbs;
        ShowHideTextView showHideTextView2;
        BigDecimal adjustedEquity2;
        String strM85562a;
        String strM93911l;
        ShowHideTextView showHideTextView3;
        BigDecimal unrealisedPnl;
        BigDecimal bigDecimalAbs2;
        ShowHideTextView showHideTextView4;
        BigDecimal unrealisedPnl2;
        String strM85562a2;
        BigDecimal unrealisedPnl3;
        DashTextView dashTextView;
        DashTextView dashTextView2;
        C44791i6 binding = getBinding();
        if (binding != null && (dashTextView2 = binding.f100195z) != null) {
            dashTextView2.setNeedDash(true);
            C27046k.m66711z(dashTextView2, 0L, new Function0() { // from class: com.kubi.assets.unify.o0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return UnifyAssetHeaderView.m19746u(this.f19040b);
                }
            }, 1, null);
        }
        C44791i6 binding2 = getBinding();
        if (binding2 != null && (dashTextView = binding2.f100182m) != null) {
            dashTextView.setNeedDash(true);
            C27046k.m66711z(dashTextView, 0L, new Function0() { // from class: com.kubi.assets.unify.p0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return UnifyAssetHeaderView.m19747v(this.f19042b);
                }
            }, 1, null);
        }
        C44791i6 binding3 = getBinding();
        String strM89950x = null;
        if (binding3 != null && (showHideTextView4 = binding3.f100167B) != null) {
            showHideTextView4.setTextColor(C22890g.m54279d(C27017c.f54310a.m66513b(), C27039d.m66646f((unifiedAccountOverview == null || (unrealisedPnl3 = unifiedAccountOverview.getUnrealisedPnl()) == null) ? null : Double.valueOf(unrealisedPnl3.doubleValue())), 0, 2, null));
            C44172b.m97382b(showHideTextView4, new AbstractC44173c.a(0, false, 3, null), true).setText(C27041f.m66669i((unifiedAccountOverview == null || (unrealisedPnl2 = unifiedAccountOverview.getUnrealisedPnl()) == null || (strM85562a2 = C37885i.m85562a(unrealisedPnl2, unifiedAccountOverview.getCurrency(), C11273q.m20046b(unifiedAccountOverview.getCurrency()))) == null) ? null : C37885i.m85575n(strM85562a2, unifiedAccountOverview.getUnrealisedPnl()), "--"));
        }
        C44791i6 binding4 = getBinding();
        if (binding4 != null && (showHideTextView3 = binding4.f100166A) != null) {
            showHideTextView3.setText(C27041f.m66669i((unifiedAccountOverview == null || (unrealisedPnl = unifiedAccountOverview.getUnrealisedPnl()) == null || (bigDecimalAbs2 = unrealisedPnl.abs()) == null) ? null : C41014a.m89950x(C41014a.m89940n(bigDecimalAbs2, unifiedAccountOverview.getCurrency()), null, null, 0, false, true, false, true, 47, null), "--"));
        }
        C44791i6 binding5 = getBinding();
        if (binding5 != null && (showHideTextView2 = binding5.f100183n) != null) {
            C44172b.m97383c(showHideTextView2, new AbstractC44173c.a(0, false, 3, null), false, 2, null).setText(C27041f.m66669i((unifiedAccountOverview == null || (adjustedEquity2 = unifiedAccountOverview.getAdjustedEquity()) == null || (strM85562a = C37885i.m85562a(adjustedEquity2, unifiedAccountOverview.getCurrency(), C11273q.m20046b(unifiedAccountOverview.getCurrency()))) == null || (strM93911l = C42828b.m93911l(strM85562a)) == null) ? null : C42828b.m93915p(strM93911l), "--"));
        }
        C44791i6 binding6 = getBinding();
        if (binding6 == null || (showHideTextView = binding6.f100184o) == null) {
            return;
        }
        if (unifiedAccountOverview != null && (adjustedEquity = unifiedAccountOverview.getAdjustedEquity()) != null && (bigDecimalAbs = adjustedEquity.abs()) != null) {
            strM89950x = C41014a.m89950x(C41014a.m89940n(bigDecimalAbs, unifiedAccountOverview.getCurrency()), null, null, 0, false, true, false, true, 47, null);
        }
        showHideTextView.setText(C27041f.m66669i(strM89950x, "--"));
    }

    @Nullable
    public final AccountInfoHeaderView getAccountInfoHeader() {
        C44791i6 binding = getBinding();
        if (binding != null) {
            return binding.f100171b;
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public final void m19753n(@Nullable UnifiedAccountOverview unifiedAccountOverview) {
        m19755p(unifiedAccountOverview);
        m19756r(unifiedAccountOverview);
        m19757t(unifiedAccountOverview);
    }

    /* JADX INFO: renamed from: p */
    public final void m19755p(UnifiedAccountOverview unifiedAccountOverview) {
        final UnifyAssetHeaderView unifyAssetHeaderView;
        VerticalIconTextBtn verticalIconTextBtn;
        VerticalIconTextBtn verticalIconTextBtn2;
        VerticalIconTextBtn verticalIconTextBtn3;
        BigDecimal totalLiability;
        ShowHideTextView showHideTextView;
        TextView textViewM97383c;
        String strM89950x;
        BigDecimal totalLiability2;
        BigDecimal bigDecimalAbs;
        ShowHideTextView showHideTextView2;
        TextView textViewM97383c2;
        String strM85562a;
        BigDecimal totalLiability3;
        DashTextView dashTextView;
        C44791i6 binding = getBinding();
        if (binding != null && (dashTextView = binding.f100186q) != null) {
            dashTextView.setNeedDash(true);
            unifyAssetHeaderView = this;
            C27046k.m66711z(dashTextView, 0L, new Function0() { // from class: com.kubi.assets.unify.q0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return UnifyAssetHeaderView.m19744q(this.f19044b);
                }
            }, 1, null);
        } else {
            unifyAssetHeaderView = this;
        }
        C44791i6 binding2 = unifyAssetHeaderView.getBinding();
        Integer numValueOf = null;
        if (binding2 != null && (showHideTextView2 = binding2.f100188s) != null && (textViewM97383c2 = C44172b.m97383c(showHideTextView2, new AbstractC44173c.a(0, false, 3, null), false, 2, null)) != null) {
            if (unifiedAccountOverview != null && (totalLiability3 = unifiedAccountOverview.getTotalLiability()) != null) {
                strM85562a = C37885i.m85562a(totalLiability3, unifiedAccountOverview.getCurrency(), C11273q.m20046b(unifiedAccountOverview.getCurrency()));
            } else {
                strM85562a = null;
            }
            textViewM97383c2.setText(C27041f.m66669i(strM85562a, "--"));
        }
        C44791i6 binding3 = unifyAssetHeaderView.getBinding();
        if (binding3 != null && (showHideTextView = binding3.f100187r) != null && (textViewM97383c = C44172b.m97383c(showHideTextView, new AbstractC44173c.a(0, false, 3, null), false, 2, null)) != null) {
            if (unifiedAccountOverview != null && (totalLiability2 = unifiedAccountOverview.getTotalLiability()) != null && (bigDecimalAbs = totalLiability2.abs()) != null) {
                strM89950x = C41014a.m89950x(C41014a.m89940n(bigDecimalAbs, unifiedAccountOverview.getCurrency()), null, null, 0, false, true, false, false, 111, null);
            } else {
                strM89950x = null;
            }
            textViewM97383c.setText(C27041f.m66669i(strM89950x, "--"));
        }
        if (unifiedAccountOverview != null && (totalLiability = unifiedAccountOverview.getTotalLiability()) != null) {
            numValueOf = Integer.valueOf(totalLiability.compareTo(BigDecimal.ZERO));
        }
        if (C27039d.m66650j(numValueOf) == 0) {
            C44791i6 binding4 = unifyAssetHeaderView.getBinding();
            if (binding4 != null && (verticalIconTextBtn3 = binding4.f100189t) != null) {
                ViewExtKt.m66577h(verticalIconTextBtn3);
            }
        } else {
            C44791i6 binding5 = unifyAssetHeaderView.getBinding();
            if (binding5 != null && (verticalIconTextBtn = binding5.f100189t) != null) {
                ViewExtKt.m66594y(verticalIconTextBtn);
            }
        }
        C44791i6 binding6 = unifyAssetHeaderView.getBinding();
        if (binding6 != null && (verticalIconTextBtn2 = binding6.f100189t) != null) {
            ViewExtKt.m66577h(verticalIconTextBtn2);
        }
    }

    /* JADX INFO: renamed from: w */
    public final Triple<String, String, Level> m19758w(UnifiedAccountOverview unifiedAccountOverview) {
        BigDecimal bigDecimalLimitRiskRatio = UnifiedAccountOverviewKt.limitRiskRatio(unifiedAccountOverview);
        if (bigDecimalLimitRiskRatio != null) {
            double dDoubleValue = bigDecimalLimitRiskRatio.doubleValue();
            Pair<Double, Double> riskGradeLevelConfig = getRiskGradeLevelConfig();
            int i11 = C11137a.$EnumSwitchMapping$0[m19759x(dDoubleValue, riskGradeLevelConfig).ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        return new Triple<>(Typography.greaterOrEqual + C42828b.m93915p(C41014a.m89936j(riskGradeLevelConfig.getSecond(), null, 0, false, false, 7, null)), getContext().getString(R$string.high_risk), Level.c.f44932a);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return new Triple<>(Typography.greaterOrEqual + C42828b.m93915p(C41014a.m89936j(riskGradeLevelConfig.getFirst(), null, 0, false, false, 7, null)), getContext().getString(R$string.medium_risk), Level.d.f44934a);
            }
            return new Triple<>(Typography.less + C42828b.m93915p(C41014a.m89936j(riskGradeLevelConfig.getFirst(), null, 0, false, false, 7, null)), getContext().getString(R$string.low_risk), Level.b.f44930a);
        }
        return new Triple<>("--", "--", Level.a.f44928a);
    }

    /* JADX INFO: renamed from: x */
    public final RiskLevel m19759x(double d11, Pair<Double, Double> pair) {
        if (d11 < pair.getFirst().doubleValue()) {
            return RiskLevel.LOW;
        }
        if (d11 < pair.getSecond().doubleValue()) {
            return RiskLevel.MEDIUM;
        }
        return RiskLevel.HIGH;
    }

    /* JADX INFO: renamed from: y */
    public final void m19760y(AssetUnifiedFragment assetUnifiedFragment) {
        VerticalIconTextBtn verticalIconTextBtn;
        VerticalIconTextBtn verticalIconTextBtn2;
        VerticalIconTextBtn verticalIconTextBtn3;
        AccountInfoHeaderView accountInfoHeaderView;
        C44791i6 binding = getBinding();
        if (binding != null && (accountInfoHeaderView = binding.f100171b) != null) {
            accountInfoHeaderView.mo19955d(assetUnifiedFragment, "B5UnifyTrading");
        }
        C44791i6 binding2 = getBinding();
        if (binding2 != null && (verticalIconTextBtn3 = binding2.f100185p) != null) {
            ViewExtKt.m66594y(verticalIconTextBtn3);
        }
        C44791i6 binding3 = getBinding();
        if (binding3 != null && (verticalIconTextBtn2 = binding3.f100193x) != null) {
            ViewExtKt.m66594y(verticalIconTextBtn2);
        }
        C44791i6 binding4 = getBinding();
        if (binding4 != null && (verticalIconTextBtn = binding4.f100189t) != null) {
            ViewExtKt.m66577h(verticalIconTextBtn);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m19761z() {
        C44791i6 binding = getBinding();
        if (binding != null) {
            MarginPnlHeaderView viewMarginPnl = binding.f100168C;
            Intrinsics.checkNotNullExpressionValue(viewMarginPnl, "viewMarginPnl");
            AssetExKt.m15138z(viewMarginPnl, C11351z0.m20196k());
            binding.f100168C.setTitleClickListener(new Function0() { // from class: com.kubi.assets.unify.s0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return UnifyAssetHeaderView.m19727A(this.f19049b);
                }
            });
            binding.f100168C.setPnlClickListener(new Function0() { // from class: com.kubi.assets.unify.t0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return UnifyAssetHeaderView.m19728B();
                }
            });
            VerticalIconTextBtn tvRepay = binding.f100189t;
            Intrinsics.checkNotNullExpressionValue(tvRepay, "tvRepay");
            C27046k.m66711z(tvRepay, 0L, new Function0() { // from class: com.kubi.assets.unify.u0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return UnifyAssetHeaderView.m19729C(this.f19052b);
                }
            }, 1, null);
            VerticalIconTextBtn tvDeposit = binding.f100185p;
            Intrinsics.checkNotNullExpressionValue(tvDeposit, "tvDeposit");
            C27046k.m66711z(tvDeposit, 0L, new Function0() { // from class: com.kubi.assets.unify.v0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return UnifyAssetHeaderView.m19730D();
                }
            }, 1, null);
            VerticalIconTextBtn tvTransfer = binding.f100193x;
            Intrinsics.checkNotNullExpressionValue(tvTransfer, "tvTransfer");
            C27046k.m66711z(tvTransfer, 0L, new Function0() { // from class: com.kubi.assets.unify.w0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return UnifyAssetHeaderView.m19731E();
                }
            }, 1, null);
        }
    }
}
