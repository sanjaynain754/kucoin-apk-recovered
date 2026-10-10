package com.kubi.unify.funds;

import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.ViewKt;
import com.kubi.margin.view.DashBoardView;
import com.kubi.resources.CollateralStatusUiHelper;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.sdk.widget.shape.view.ShapeTextView;
import com.kubi.unify.R$color;
import com.kubi.unify.R$drawable;
import com.kubi.unify.R$layout;
import com.kubi.unify.R$string;
import com.kubi.unify.UnifyConstant;
import com.kubi.unify.UnifyGlobalDataManager;
import com.kubi.unify.entity.UnifyAccountOverviewEntity;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.C33820nf;
import f00.C37304a;
import g00.InterfaceC37766r;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l60.C42113h;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Triple;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import w00.C45682f;

/* JADX INFO: compiled from: UnifyAccountRiskRatioView.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 62\u00020\u0001:\u000267B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bJ\b\u0010\u0011\u001a\u00020\u0012H\u0002J\f\u0010\u0013\u001a\u00020\u0012*\u00020\nH\u0002J\f\u0010\u0014\u001a\u00020\u0012*\u00020\nH\u0002J\"\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u0010H\u0002J\u0016\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\u0014\u0010\u001f\u001a\u00020\u0012*\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0014\u0010 \u001a\u00020\u0012*\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\f\u0010!\u001a\u00020\u0012*\u00020\nH\u0002J\u0014\u0010\"\u001a\u00020\u0012*\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0014\u0010#\u001a\u00020\u0012*\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0014\u0010$\u001a\u00020\u0012*\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0014\u0010%\u001a\u00020\u0012*\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u001c\u0010&\u001a\u00020\u0012*\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0016\u0010'\u001a\u00020\u0012*\u00020\n2\b\u0010(\u001a\u0004\u0018\u00010)H\u0002J\u001c\u0010*\u001a\u00020\u0012*\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u000e\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,H\u0002J\u001e\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020-2\f\u00101\u001a\b\u0012\u0004\u0012\u00020-0,H\u0002J\u0014\u00102\u001a\u00020\u0012*\u00020\n2\u0006\u00103\u001a\u00020/H\u0002J\u0012\u00104\u001a\u00020\u00102\b\u00105\u001a\u0004\u0018\u00010)H\u0002R\u001d\u0010\t\u001a\u0004\u0018\u00010\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00068"}, m90084d2 = {"Lcom/kubi/unify/funds/UnifyAccountRiskRatioView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "viewBind", "Lcom/kubi/unify/databinding/ViewUnifyAccountRiskRatioBinding;", "getViewBind", "()Lcom/kubi/unify/databinding/ViewUnifyAccountRiskRatioBinding;", "viewBind$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "currentUsefulMarginCollateralCoins", "", "initView", "", "setupHideLayout", "setupClickListeners", "showInfoDialog", "titleResId", "", "messageResId", "jumpUrl", "bindData", "overviewEntity", "Lcom/kubi/unify/entity/UnifyAccountOverviewEntity;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "setupHoldMargin", "setupAvailableEquity", "bindUsefulMarginStatusIcon", "setupMaintMargin", "setupAdjustedEquity", "setupRiskDashboard", "setupRiskRatioDisplay", "setupLiabilitySection", "setupLiabilityIcon", "totalLiability", "Ljava/math/BigDecimal;", "setupLiabilityClick", "getRiskGradeArray", "", "", "getRiskLevel", "Lcom/kubi/unify/funds/UnifyAccountRiskRatioView$RiskLevel;", "ratio", "riskGradeArray", "applyRiskLevelStyle", "riskLevel", "formatCurrencyValue", "value", "Companion", "RiskLevel", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUnifyAccountRiskRatioView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnifyAccountRiskRatioView.kt\ncom/kubi/unify/funds/UnifyAccountRiskRatioView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,318:1\n52#2:319\n80#2,7:320\n1#3:327\n1563#4:328\n1634#4,3:329\n*S KotlinDebug\n*F\n+ 1 UnifyAccountRiskRatioView.kt\ncom/kubi/unify/funds/UnifyAccountRiskRatioView\n*L\n49#1:319\n49#1:320,7\n269#1:328\n269#1:329,3\n*E\n"})
public final class UnifyAccountRiskRatioView extends FrameLayout {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC24293a f53178b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public String f53179c;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ KProperty<Object>[] f53177e = {Reflection.property1(new PropertyReference1Impl(UnifyAccountRiskRatioView.class, "viewBind", "getViewBind()Lcom/kubi/unify/databinding/ViewUnifyAccountRiskRatioBinding;", 0))};

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Companion f53176d = new Companion(null);

    /* JADX INFO: compiled from: UnifyAccountRiskRatioView.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lcom/kubi/unify/funds/UnifyAccountRiskRatioView$Companion;", "", "<init>", "()V", "DEFAULT_LOW_RISK_THRESHOLD", "", "DEFAULT_HIGH_RISK_THRESHOLD", "MAX_RISK_RATIO", "MIN_RISK_RATIO", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: compiled from: UnifyAccountRiskRatioView.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/unify/funds/UnifyAccountRiskRatioView$RiskLevel;", "", "<init>", "(Ljava/lang/String;I)V", "LOW", "MEDIUM", "HIGH", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public enum RiskLevel {
        LOW,
        MEDIUM,
        HIGH;


        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ EnumEntries f53181c = EnumEntriesKt.enumEntries(m65086a());

        @NotNull
        public static EnumEntries<RiskLevel> getEntries() {
            return f53181c;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UnifyAccountRiskRatioView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: o */
    public final RiskLevel m65081o(double d11, List<Double> list) {
        if (d11 < list.get(0).doubleValue()) {
            return RiskLevel.LOW;
        }
        return d11 < list.get(1).doubleValue() ? RiskLevel.MEDIUM : RiskLevel.HIGH;
    }

    /* JADX INFO: renamed from: com.kubi.unify.funds.UnifyAccountRiskRatioView$a */
    /* JADX INFO: compiled from: UnifyAccountRiskRatioView.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C26526a {
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
    public UnifyAccountRiskRatioView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f53178b = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C42113h>() { // from class: com.kubi.unify.funds.UnifyAccountRiskRatioView$special$$inlined$customViewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C42113h invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C42113h.m92381a(C45682f.m100800a(viewGroup));
            }
        });
        LayoutInflater.from(getContext()).inflate(R$layout.view_unify_account_risk_ratio, this);
        m65082p();
    }

    /* JADX INFO: renamed from: F */
    public static final void m65054F(String str, DialogInterface dialogInterface, int i11) {
        InterfaceC37766r.a.m85190a(C37304a.f82764a, str, null, null, null, null, null, null, 126, null);
    }

    private final List<Double> getRiskGradeArray() {
        String riskGrade = UnifyGlobalDataManager.f53084a.m64884v().getValue().getRiskGrade();
        if (riskGrade == null) {
            riskGrade = "";
        }
        List listSplit$default = StringsKt.split$default((CharSequence) riskGrade, new String[]{","}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSplit$default, 10));
        Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            arrayList.add(Double.valueOf(DowngradeExKt.m66538h((String) it.next(), 0.0d, 1, null)));
        }
        return arrayList.size() == 2 ? arrayList : CollectionsKt.listOf((Object[]) new Double[]{Double.valueOf(0.6d), Double.valueOf(0.8d)});
    }

    private final C42113h getViewBind() {
        return (C42113h) this.f53178b.getValue(this, f53177e[0]);
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m65064m(C42113h c42113h, UnifyAccountRiskRatioView unifyAccountRiskRatioView, int i11, String str) {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(((BaseFragment) ViewKt.findFragment(unifyAccountRiskRatioView)).getChildFragmentManager());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        FragmentManager fragmentManager = (FragmentManager) objM103844constructorimpl;
        if (fragmentManager == null) {
            return Unit.INSTANCE;
        }
        CollateralStatusUiHelper.f43602a.m54272k(fragmentManager, i11, str, "UnifyUsefulMarginCollateralStatusDialog");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m65065s(UnifyAccountRiskRatioView unifyAccountRiskRatioView) {
        unifyAccountRiskRatioView.m65076E(R$string.unify_funds_account_risk_ratio, R$string.unify_funds_account_risk_ratio_desc, UnifyConstant.f53295a.m65223b());
        return Unit.INSTANCE;
    }

    private final void setupClickListeners(C42113h c42113h) {
        DashTextView tvRiskRatio = c42113h.f93535r;
        Intrinsics.checkNotNullExpressionValue(tvRiskRatio, "tvRiskRatio");
        C27046k.m66711z(tvRiskRatio, 0L, new Function0() { // from class: com.kubi.unify.funds.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnifyAccountRiskRatioView.m65065s(this.f53198b);
            }
        }, 1, null);
        DashTextView tvLiability = c42113h.f93530m;
        Intrinsics.checkNotNullExpressionValue(tvLiability, "tvLiability");
        C27046k.m66711z(tvLiability, 0L, new Function0() { // from class: com.kubi.unify.funds.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnifyAccountRiskRatioView.m65066t(this.f53201b);
            }
        }, 1, null);
        DashTextView tvMaintMargin = c42113h.f93532o;
        Intrinsics.checkNotNullExpressionValue(tvMaintMargin, "tvMaintMargin");
        C27046k.m66711z(tvMaintMargin, 0L, new Function0() { // from class: com.kubi.unify.funds.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnifyAccountRiskRatioView.m65067u(this.f53204b);
            }
        }, 1, null);
        DashTextView tvHoldMargin = c42113h.f93528k;
        Intrinsics.checkNotNullExpressionValue(tvHoldMargin, "tvHoldMargin");
        C27046k.m66711z(tvHoldMargin, 0L, new Function0() { // from class: com.kubi.unify.funds.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnifyAccountRiskRatioView.m65068v(this.f53208b);
            }
        }, 1, null);
        DashTextView tvUsefulMargin = c42113h.f93536s;
        Intrinsics.checkNotNullExpressionValue(tvUsefulMargin, "tvUsefulMargin");
        C27046k.m66711z(tvUsefulMargin, 0L, new Function0() { // from class: com.kubi.unify.funds.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnifyAccountRiskRatioView.m65069w(this.f53210b);
            }
        }, 1, null);
        DashTextView tvAdjustedEquity = c42113h.f93525h;
        Intrinsics.checkNotNullExpressionValue(tvAdjustedEquity, "tvAdjustedEquity");
        C27046k.m66711z(tvAdjustedEquity, 0L, new Function0() { // from class: com.kubi.unify.funds.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnifyAccountRiskRatioView.m65070x(this.f53220b);
            }
        }, 1, null);
    }

    private final void setupHideLayout(final C42113h c42113h) {
        FrameLayout hideLayout = c42113h.f93520c;
        Intrinsics.checkNotNullExpressionValue(hideLayout, "hideLayout");
        C27046k.m66711z(hideLayout, 0L, new Function0() { // from class: com.kubi.unify.funds.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnifyAccountRiskRatioView.m65071y(c42113h, this);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: t */
    public static final Unit m65066t(UnifyAccountRiskRatioView unifyAccountRiskRatioView) {
        unifyAccountRiskRatioView.m65076E(R$string.unify_fund_avg_liabilities, R$string.unify_fund_avg_liabilities_desc, UnifyConstant.f53295a.m65225d());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m65067u(UnifyAccountRiskRatioView unifyAccountRiskRatioView) {
        unifyAccountRiskRatioView.m65076E(R$string.unify_maintain_margin, R$string.unify_maintain_margin_desc, UnifyConstant.f53295a.m65227f());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v */
    public static final Unit m65068v(UnifyAccountRiskRatioView unifyAccountRiskRatioView) {
        unifyAccountRiskRatioView.m65076E(R$string.unify_occupany_margin, R$string.unify_occupany_margin_desc, UnifyConstant.f53295a.m65226e());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public static final Unit m65069w(UnifyAccountRiskRatioView unifyAccountRiskRatioView) {
        unifyAccountRiskRatioView.m65076E(R$string.unify_funds_ava_equity, R$string.unify_funds_margin_benefits_desc, UnifyConstant.f53295a.m65229h());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static final Unit m65070x(UnifyAccountRiskRatioView unifyAccountRiskRatioView) {
        unifyAccountRiskRatioView.m65076E(R$string.unify_fund_cross_avl_margin_key, R$string.unify_adjusted_margin_desc, UnifyConstant.f53295a.m65224c());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y */
    public static final Unit m65071y(C42113h c42113h, UnifyAccountRiskRatioView unifyAccountRiskRatioView) {
        Group hideViewGroup = c42113h.f93522e;
        Intrinsics.checkNotNullExpressionValue(hideViewGroup, "hideViewGroup");
        if (C27046k.m66704s(hideViewGroup)) {
            c42113h.f93521d.setImageResource(R$drawable.ic2_arrow_down_16);
            Group hideViewGroup2 = c42113h.f93522e;
            Intrinsics.checkNotNullExpressionValue(hideViewGroup2, "hideViewGroup");
            ViewExtKt.m66577h(hideViewGroup2);
        } else {
            c42113h.f93521d.setImageResource(R$drawable.ic2_arrow_up_16);
            Group hideViewGroup3 = c42113h.f93522e;
            Intrinsics.checkNotNullExpressionValue(hideViewGroup3, "hideViewGroup");
            ViewExtKt.m66594y(hideViewGroup3);
        }
        unifyAccountRiskRatioView.m65079l(c42113h);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B */
    public final void m65073B(C42113h c42113h, UnifyAccountOverviewEntity unifyAccountOverviewEntity) {
        c42113h.f93533p.setText(m65080n(unifyAccountOverviewEntity.getMm()));
    }

    /* JADX INFO: renamed from: E */
    public final void m65076E(int i11, int i12, final String str) {
        AlertDialogFragmentHelper alertDialogFragmentHelperM54153J4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(i11).m54153J4(i12);
        if (str == null || str.length() == 0) {
            alertDialogFragmentHelperM54153J4.m54162S4(R$string.i_already_know, null);
        } else {
            alertDialogFragmentHelperM54153J4.m54162S4(R$string.passkey_guide_mroe, new DialogInterface.OnClickListener() { // from class: com.kubi.unify.funds.h
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i13) {
                    UnifyAccountRiskRatioView.m65054F(str, dialogInterface, i13);
                }
            });
            alertDialogFragmentHelperM54153J4.m54159P4(R$string.i_already_know, null);
        }
        FragmentManager childFragmentManager = ((BaseFragment) ViewKt.findFragment(this)).getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        alertDialogFragmentHelperM54153J4.show(childFragmentManager, "info_dialog_" + i11);
    }

    /* JADX INFO: renamed from: j */
    public final void m65077j(C42113h c42113h, RiskLevel riskLevel) {
        Triple triple;
        int i11 = C26526a.$EnumSwitchMapping$0[riskLevel.ordinal()];
        if (i11 == 1) {
            triple = new Triple(Integer.valueOf(R$string.low_risk), Integer.valueOf(R$color.primary), Integer.valueOf(R$color.primary12));
        } else if (i11 == 2) {
            triple = new Triple(Integer.valueOf(R$string.medium_risk), Integer.valueOf(R$color.complementary), Integer.valueOf(R$color.complementary12));
        } else {
            if (i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            triple = new Triple(Integer.valueOf(R$string.high_risk), Integer.valueOf(R$color.secondary), Integer.valueOf(R$color.secondary12));
        }
        int iIntValue = ((Number) triple.component1()).intValue();
        int iIntValue2 = ((Number) triple.component2()).intValue();
        int iIntValue3 = ((Number) triple.component3()).intValue();
        c42113h.f93527j.setText(iIntValue);
        ShapeTextView shapeTextView = c42113h.f93527j;
        C27017c c27017c = C27017c.f54310a;
        shapeTextView.setTextColor(c27017c.m66512a(iIntValue2));
        c42113h.f93534q.setTextColor(c27017c.m66512a(iIntValue2));
        c42113h.f93527j.getShapeDrawableBuilder().m92151m(c27017c.m66512a(iIntValue3));
        c42113h.f93527j.getShapeDrawableBuilder().m92143e();
    }

    /* JADX INFO: renamed from: k */
    public final void m65078k(@NotNull UnifyAccountOverviewEntity overviewEntity, @NotNull FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(overviewEntity, "overviewEntity");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        C42113h viewBind = getViewBind();
        if (viewBind != null) {
            m65074C(viewBind, overviewEntity);
            m65075D(viewBind, overviewEntity);
            m65083q(viewBind, overviewEntity);
            m65073B(viewBind, overviewEntity);
            m65084r(viewBind, overviewEntity);
            m65085z(viewBind, overviewEntity);
            m65072A(viewBind, overviewEntity, fragmentManager);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m65079l(final C42113h c42113h) {
        String str = this.f53179c;
        Group hideViewGroup = c42113h.f93522e;
        Intrinsics.checkNotNullExpressionValue(hideViewGroup, "hideViewGroup");
        if (!C27046k.m66704s(hideViewGroup)) {
            str = null;
        }
        CollateralStatusUiHelper.f43602a.m54270f(c42113h.f93523f, str != null ? 3 : null, this.f53179c, new Function2() { // from class: com.kubi.unify.funds.i
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return UnifyAccountRiskRatioView.m65064m(c42113h, this, ((Integer) obj).intValue(), (String) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public final String m65080n(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return "--";
        }
        boolean z11 = bigDecimal.compareTo(BigDecimal.ZERO) < 0;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z11 ? C33820nf.f71144W : "");
        BigDecimal bigDecimalAbs = bigDecimal.abs();
        Intrinsics.checkNotNullExpressionValue(bigDecimalAbs, "abs(...)");
        sb2.append(C42828b.m93906g(C42180b.m92647l(C42180b.m92640e(bigDecimalAbs, null, 2, false, false, false, 2, null, 93, null)), "$", false, false, 2, null));
        return sb2.toString();
    }

    /* JADX INFO: renamed from: q */
    public final void m65083q(C42113h c42113h, UnifyAccountOverviewEntity unifyAccountOverviewEntity) {
        c42113h.f93526i.setText(m65080n(unifyAccountOverviewEntity.getAdjustedMargin()));
    }

    /* JADX INFO: renamed from: r */
    public final void m65084r(C42113h c42113h, UnifyAccountOverviewEntity unifyAccountOverviewEntity) {
        c42113h.f93537t.setText(m65080n(unifyAccountOverviewEntity.getAvailableMargin()));
        List<String> collateralCurrencyList = unifyAccountOverviewEntity.getCollateralCurrencyList();
        String strJoinToString$default = null;
        if (collateralCurrencyList != null) {
            List<String> list = !collateralCurrencyList.isEmpty() ? collateralCurrencyList : null;
            if (list != null) {
                strJoinToString$default = CollectionsKt.joinToString$default(list, ",", null, null, 0, null, null, 62, null);
            }
        }
        this.f53179c = strJoinToString$default;
        m65079l(c42113h);
    }

    /* JADX INFO: renamed from: z */
    public final void m65085z(C42113h c42113h, UnifyAccountOverviewEntity unifyAccountOverviewEntity) {
        c42113h.f93529l.setText(m65080n(unifyAccountOverviewEntity.getIm()));
    }

    /* JADX INFO: renamed from: A */
    public final void m65072A(C42113h c42113h, UnifyAccountOverviewEntity unifyAccountOverviewEntity, FragmentManager fragmentManager) {
        c42113h.f93531n.setText(m65080n(unifyAccountOverviewEntity.getTotalLiability()));
    }

    /* JADX INFO: renamed from: C */
    public final void m65074C(C42113h c42113h, UnifyAccountOverviewEntity unifyAccountOverviewEntity) {
        Double dValueOf;
        BigDecimal displayRiskRatio = unifyAccountOverviewEntity.getDisplayRiskRatio();
        if (displayRiskRatio != null) {
            dValueOf = Double.valueOf(displayRiskRatio.doubleValue());
        } else {
            dValueOf = null;
        }
        DashBoardView.m40665d(c42113h.f93519b, C27039d.m66646f(dValueOf), false, 2, null);
        List<Double> riskGradeArray = getRiskGradeArray();
        c42113h.f93519b.setData(CollectionsKt.listOf((Object[]) new Triple[]{new Triple(Double.valueOf(0.0d), riskGradeArray.get(0), Integer.valueOf(R$color.primary)), new Triple(riskGradeArray.get(0), riskGradeArray.get(1), Integer.valueOf(R$color.complementary)), new Triple(riskGradeArray.get(1), Double.valueOf(1.0d), Integer.valueOf(R$color.secondary))}));
    }

    /* JADX INFO: renamed from: D */
    public final void m65075D(C42113h c42113h, UnifyAccountOverviewEntity unifyAccountOverviewEntity) {
        String strM92642g;
        BigDecimal displayRiskRatio = unifyAccountOverviewEntity.getDisplayRiskRatio();
        ShowHideTextView showHideTextView = c42113h.f93534q;
        if (displayRiskRatio != null) {
            strM92642g = C42180b.m92642g(displayRiskRatio, null, RoundingMode.UP, 0, false, true, false, 45, null);
        } else {
            strM92642g = null;
        }
        showHideTextView.setText(C42180b.m92649n(strM92642g));
        m65077j(c42113h, m65081o(C41014a.m89922G(displayRiskRatio, null, 1, null).doubleValue(), getRiskGradeArray()));
    }

    /* JADX INFO: renamed from: p */
    public final void m65082p() {
        C42113h viewBind = getViewBind();
        if (viewBind != null) {
            setupHideLayout(viewBind);
            setupClickListeners(viewBind);
        }
    }
}
