package com.kubi.assets.finance;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.kubi.assets.AssetExKt;
import com.kubi.assets.AssetRemoteConfig;
import com.kubi.assets.R$color;
import com.kubi.assets.R$drawable;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.autoearn.views.AutoEarnEntryView;
import com.kubi.assets.entity.AccountDetailUrl;
import com.kubi.assets.entity.AssetV2OverviewEntity;
import com.kubi.assets.entity.EarnAnalysisUrl;
import com.kubi.assets.entity.EarnBalance;
import com.kubi.assets.entity.FinanceConfig;
import com.kubi.assets.entity.Menu;
import com.kubi.assets.view.AccountInfoHeaderView;
import com.kubi.assets.view.C11273q;
import com.kubi.resources.C22890g;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.sdk.widget.shape.view.ShapeImageView;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import gf.C37885i;
import io.reactivex.functions.Action;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import l10.C42025b;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p637ta.C44811l2;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import rs.AbstractC44173c;
import rs.C44172b;
import w00.C45682f;

/* JADX INFO: compiled from: FinanceHeaderView.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J%\u0010\u001a\u001a\u00020\u0016*\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0002\u0010 J\u0010\u0010!\u001a\u00020\u00162\b\u0010\"\u001a\u0004\u0018\u00010#J\b\u0010$\u001a\u00020\u0016H\u0002J\u001c\u0010%\u001a\u00020\u00112\b\u0010&\u001a\u0004\u0018\u00010\u00112\b\u0010'\u001a\u0004\u0018\u00010\u0011H\u0002J\b\u0010(\u001a\u0004\u0018\u00010)R\u001d\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, m90084d2 = {"Lcom/kubi/assets/finance/FinanceHeaderView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", JAnalysisConstants.EVENT_ATTRIBUTES, "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/kubi/assets/databinding/AssetViewFinanceHeaderBinding;", "getBinding", "()Lcom/kubi/assets/databinding/AssetViewFinanceHeaderBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "fragment", "Lcom/kubi/sdk/BaseFragment;", "accountDetailUrl", "", "earnAnalysisUrl", "getAccountInfoHeader", "Lcom/kubi/assets/view/AccountInfoHeaderView;", "setFragment", "", "bindInfo2View", "assets", "Lcom/kubi/assets/entity/AssetV2OverviewEntity;", "setIconAndBg", "Landroid/widget/ImageView;", "yesterdayIncome", "", "builder", "Lcom/kubi/sdk/widget/shape/builder/ShapeDrawableBuilder;", "(Landroid/widget/ImageView;Ljava/lang/Double;Lcom/kubi/sdk/widget/shape/builder/ShapeDrawableBuilder;)V", "setConfig", "financeConfig", "Lcom/kubi/assets/entity/FinanceConfig;", "initListener", "buildUrl", "jumpType", "jumpUrl", "getAutoEarnEntry", "Lcom/kubi/assets/autoearn/views/AutoEarnEntryView;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFinanceHeaderView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinanceHeaderView.kt\ncom/kubi/assets/finance/FinanceHeaderView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,188:1\n52#2:189\n80#2,7:190\n1#3:197\n774#4:198\n865#4,2:199\n*S KotlinDebug\n*F\n+ 1 FinanceHeaderView.kt\ncom/kubi/assets/finance/FinanceHeaderView\n*L\n51#1:189\n51#1:190,7\n131#1:198\n131#1:199,2\n*E\n"})
public final class FinanceHeaderView extends FrameLayout {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ KProperty<Object>[] f17391f = {Reflection.property1(new PropertyReference1Impl(FinanceHeaderView.class, "binding", "getBinding()Lcom/kubi/assets/databinding/AssetViewFinanceHeaderBinding;", 0))};

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC24293a f17392b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public BaseFragment f17393c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public String f17394d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public String f17395e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public FinanceHeaderView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Code duplicated, block: B:47:0x009d  */
    public final void setConfig(@Nullable FinanceConfig financeConfig) {
        ArrayList arrayList;
        String strM16689f;
        AccountDetailUrl accountDetailUrl;
        String jumpUrl;
        String strM16689f2;
        EarnAnalysisUrl earnAnalysisUrl;
        String jumpUrl2;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        List<Menu> menuList;
        if (financeConfig == null || (menuList = financeConfig.getMenuList()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (Object obj : menuList) {
                Menu menu = (Menu) obj;
                if (menu != null ? Intrinsics.areEqual(menu.isShow(), Boolean.TRUE) : false) {
                    arrayList.add(obj);
                }
            }
        }
        int iM66650j = C27039d.m66650j(arrayList != null ? Integer.valueOf(arrayList.size()) : null);
        if (iM66650j > 0) {
            C44811l2 binding = getBinding();
            if (binding != null && (recyclerView2 = binding.f100371f) != null) {
                recyclerView2.setLayoutManager(new GridLayoutManager(getContext(), iM66650j));
            }
            C44811l2 binding2 = getBinding();
            if (binding2 != null && (recyclerView = binding2.f100371f) != null) {
                recyclerView.setAdapter(new FinanceConfigAdapter(arrayList));
            }
        }
        String str = "";
        if (financeConfig == null || (earnAnalysisUrl = financeConfig.getEarnAnalysisUrl()) == null || (jumpUrl2 = earnAnalysisUrl.getJumpUrl()) == null) {
            strM16689f = "";
        } else {
            if (!(jumpUrl2.length() > 0)) {
                jumpUrl2 = null;
            }
            if (jumpUrl2 == null || (strM16689f = m16689f(financeConfig.getEarnAnalysisUrl().getJumpType(), jumpUrl2)) == null) {
                strM16689f = "";
            }
        }
        this.f17395e = strM16689f;
        if (financeConfig != null && (accountDetailUrl = financeConfig.getAccountDetailUrl()) != null && (jumpUrl = accountDetailUrl.getJumpUrl()) != null) {
            String str2 = jumpUrl.length() > 0 ? jumpUrl : null;
            if (str2 != null && (strM16689f2 = m16689f(financeConfig.getAccountDetailUrl().getJumpType(), str2)) != null) {
                str = strM16689f2;
            }
        }
        this.f17394d = str;
    }

    public /* synthetic */ FinanceHeaderView(Context context, AttributeSet attributeSet, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }

    private final C44811l2 getBinding() {
        return (C44811l2) this.f17392b.getValue(this, f17391f[0]);
    }

    /* JADX INFO: renamed from: h */
    public static final void m16684h(FinanceHeaderView financeHeaderView) {
        String str = EarnUrlConfig.f17409a.m16752b() + "?type=0&dark=true&isBanner=1&loading=2&needLogin=true&lang=" + MultiLanguageManager.f46811g.getLocalString();
        Router router = Router.f46192a;
        String str2 = financeHeaderView.f17394d;
        if (str2 == null || str2.length() == 0) {
            str2 = null;
        }
        if (str2 != null) {
            str = str2;
        }
        router.m56184f(str).m4048k();
        FinanceAnalyticsReporter.f17418a.m16759e();
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m16685i(FinanceHeaderView financeHeaderView) {
        AlertDialogFragmentHelper alertDialogFragmentHelperM54162S4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.earn_yesterday_profit).m54153J4(R$string.earn_yesterday_profit_toast).m54162S4(R$string.confirm, null);
        BaseFragment baseFragment = financeHeaderView.f17393c;
        alertDialogFragmentHelperM54162S4.m54172c5(baseFragment != null ? baseFragment.getChildFragmentManager() : null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m16686j(FinanceHeaderView financeHeaderView) {
        AssetRemoteConfig assetRemoteConfig = AssetRemoteConfig.f18903a;
        if (StringsKt.isBlank(assetRemoteConfig.m19570m())) {
            String str = EarnUrlConfig.f17409a.m16751a() + "?type=0&dark=true&isBanner=1&needLogin=true&loading=2&lang=" + MultiLanguageManager.f46811g.getLocalString();
            Router router = Router.f46192a;
            String str2 = financeHeaderView.f17395e;
            if (str2 == null || str2.length() == 0) {
                str2 = null;
            }
            if (str2 != null) {
                str = str2;
            }
            router.m56184f(str).m4048k();
        } else {
            Router.f46192a.m56184f(assetRemoteConfig.m19570m()).m4048k();
        }
        FinanceAnalyticsReporter.f17418a.m16755a();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m16687k(BaseFragment baseFragment) {
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.kc_finance_total_asset_title).m54153J4(R$string.kc_finance_total_asset_desc).m54162S4(R$string.already_know, null).m54146C4(R$drawable.ic2_close_withcircle_24).m54172c5(baseFragment.getChildFragmentManager());
        return Unit.INSTANCE;
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: e */
    public final void m16688e(@NotNull AssetV2OverviewEntity assets) {
        FinanceHeaderView financeHeaderView;
        ShowHideTextView showHideTextView;
        BigDecimal totalIncome;
        ShowHideTextView showHideTextView2;
        BigDecimal yesterdayIncome;
        ShowHideTextView showHideTextView3;
        TextView textViewM97383c;
        BigDecimal totalIncome2;
        String strM85563b;
        ShapeImageView shapeImageView;
        ShowHideTextView showHideTextView4;
        TextView textViewM97383c2;
        ShowHideTextView showHideTextView5;
        BigDecimal yesterdayIncome2;
        AccountInfoHeaderView accountInfoHeaderView;
        BigDecimal totalValue;
        Intrinsics.checkNotNullParameter(assets, "assets");
        EarnBalance financeAsset = assets.getFinanceAsset();
        if (financeAsset != null) {
            financeAsset.setValuableCurrency(assets.getBaseCurrency());
        }
        C44811l2 binding = getBinding();
        String strM89950x = null;
        if (binding != null && (accountInfoHeaderView = binding.f100367b) != null) {
            accountInfoHeaderView.m19942B(assets, C27041f.m66669i((financeAsset == null || (totalValue = financeAsset.getTotalValue()) == null) ? null : C37885i.m85562a(totalValue, assets.getBaseCurrency(), C11273q.m20046b(assets.getBaseCurrency())), "--"), C27041f.m66669i(financeAsset != null ? financeAsset.getBalancePriceStr() : null, "--"));
        }
        Double dValueOf = (financeAsset == null || (yesterdayIncome2 = financeAsset.getYesterdayIncome()) == null) ? null : Double.valueOf(yesterdayIncome2.doubleValue());
        if (dValueOf != null) {
            double dDoubleValue = dValueOf.doubleValue();
            C44811l2 binding2 = getBinding();
            if (binding2 != null && (showHideTextView5 = binding2.f100377l) != null) {
                showHideTextView5.setTextColor(C22890g.m54279d(C27017c.f54310a.m66513b(), dDoubleValue, 0, 2, null));
            }
            String str = dDoubleValue > 0.0d ? "+" : "";
            C44811l2 binding3 = getBinding();
            if (binding3 != null && (showHideTextView4 = binding3.f100377l) != null && (textViewM97383c2 = C44172b.m97383c(showHideTextView4, new AbstractC44173c.a(0, false, 3, null), false, 2, null)) != null) {
                textViewM97383c2.setText(C42828b.m93906g(C27041f.m66669i(C37885i.m85563b(financeAsset.getYesterdayIncome(), assets.getBaseCurrency(), 0, 2, null), "--"), str, false, false, 2, null));
            }
        }
        C44811l2 binding4 = getBinding();
        if (binding4 == null || (shapeImageView = binding4.f100369d) == null) {
            financeHeaderView = this;
        } else {
            financeHeaderView = this;
            financeHeaderView.m16691l(shapeImageView, dValueOf, shapeImageView.getShapeDrawableBuilder());
        }
        C44811l2 binding5 = financeHeaderView.getBinding();
        if (binding5 != null && (showHideTextView3 = binding5.f100374i) != null && (textViewM97383c = C44172b.m97383c(showHideTextView3, new AbstractC44173c.a(0, false, 3, null), false, 2, null)) != null) {
            textViewM97383c.setText((financeAsset == null || (totalIncome2 = financeAsset.getTotalIncome()) == null || (strM85563b = C37885i.m85563b(totalIncome2, assets.getBaseCurrency(), 0, 2, null)) == null) ? null : C27041f.m66669i(strM85563b, "--"));
        }
        C44811l2 binding6 = financeHeaderView.getBinding();
        if (binding6 != null && (showHideTextView2 = binding6.f100375j) != null) {
            showHideTextView2.setText(C27041f.m66669i((financeAsset == null || (yesterdayIncome = financeAsset.getYesterdayIncome()) == null) ? null : C41014a.m89950x(C41014a.m89940n(yesterdayIncome, assets.getBaseCurrency()), null, null, 0, false, true, false, true, 47, null), "--"));
        }
        C44811l2 binding7 = financeHeaderView.getBinding();
        if (binding7 == null || (showHideTextView = binding7.f100372g) == null) {
            return;
        }
        if (financeAsset != null && (totalIncome = financeAsset.getTotalIncome()) != null) {
            strM89950x = C41014a.m89950x(C41014a.m89940n(totalIncome, assets.getBaseCurrency()), null, null, 0, false, true, false, true, 47, null);
        }
        showHideTextView.setText(C27041f.m66669i(strM89950x, "--"));
    }

    /* JADX INFO: renamed from: f */
    public final String m16689f(String str, String str2) {
        if (str == null || !StringsKt.equals(str, "H5", true)) {
            return C27041f.m66668h(str2);
        }
        return AssetExKt.m15122j(str2) + "&type=0&dark=true&lang=" + MultiLanguageManager.f46811g.getLocalString();
    }

    /* JADX INFO: renamed from: l */
    public final void m16691l(ImageView imageView, Double d11, C42025b c42025b) {
        Pair pairM90091to;
        if (d11 == null) {
            C27017c c27017c = C27017c.f54310a;
            pairM90091to = TuplesKt.m90091to(Integer.valueOf(c27017c.m66512a(R$color.c_icon60)), Integer.valueOf(c27017c.m66512a(R$color.c_cover4)));
        } else if (d11.doubleValue() > 0.0d) {
            int iM54281f = C22890g.m54281f(C27017c.f54310a.m66513b(), true);
            pairM90091to = TuplesKt.m90091to(Integer.valueOf(iM54281f), Integer.valueOf(ColorUtils.setAlphaComponent(iM54281f, 20)));
        } else if (d11.doubleValue() < 0.0d) {
            int iM54281f2 = C22890g.m54281f(C27017c.f54310a.m66513b(), false);
            pairM90091to = TuplesKt.m90091to(Integer.valueOf(iM54281f2), Integer.valueOf(ColorUtils.setAlphaComponent(iM54281f2, 20)));
        } else {
            C27017c c27017c2 = C27017c.f54310a;
            pairM90091to = TuplesKt.m90091to(Integer.valueOf(c27017c2.m66512a(R$color.c_icon60)), Integer.valueOf(c27017c2.m66512a(R$color.c_cover4)));
        }
        C27046k.m66701p(imageView, ((Number) pairM90091to.getFirst()).intValue());
        if (c42025b != null) {
            c42025b.m92151m(((Number) pairM90091to.getSecond()).intValue());
        }
        if (c42025b != null) {
            c42025b.m92143e();
        }
    }

    public final void setFragment(@NotNull final BaseFragment fragment) {
        AccountInfoHeaderView accountInfoHeaderView;
        AccountInfoHeaderView accountInfoHeaderView2;
        AccountInfoHeaderView accountInfoHeaderView3;
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f17393c = fragment;
        C44811l2 binding = getBinding();
        if (binding != null && (accountInfoHeaderView3 = binding.f100367b) != null) {
            accountInfoHeaderView3.mo19955d(fragment, "B9earnAccount");
        }
        C44811l2 binding2 = getBinding();
        if (binding2 != null && (accountInfoHeaderView2 = binding2.f100367b) != null) {
            accountInfoHeaderView2.setDashUnderlineVisible(true);
        }
        C44811l2 binding3 = getBinding();
        if (binding3 == null || (accountInfoHeaderView = binding3.f100367b) == null) {
            return;
        }
        accountInfoHeaderView.setOnTotalAssetClickListener(new Function0() { // from class: com.kubi.assets.finance.z
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FinanceHeaderView.m16687k(fragment);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FinanceHeaderView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f17392b = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C44811l2>() { // from class: com.kubi.assets.finance.FinanceHeaderView$special$$inlined$customViewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C44811l2 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C44811l2.m99143a(C45682f.m100800a(viewGroup));
            }
        });
        LayoutInflater.from(context).inflate(R$layout.asset_view_finance_header, this);
        m16690g();
    }

    /* JADX INFO: renamed from: g */
    public final void m16690g() {
        ShapeImageView shapeImageView;
        FrameLayout frameLayout;
        AccountInfoHeaderView accountInfoHeaderView;
        C44811l2 binding = getBinding();
        if (binding != null && (accountInfoHeaderView = binding.f100367b) != null) {
            AccountInfoHeaderView.m19940y(accountInfoHeaderView, new Action() { // from class: com.kubi.assets.finance.w
                @Override // io.reactivex.functions.Action
                public final void run() {
                    FinanceHeaderView.m16684h(this.f17503b);
                }
            }, null, R$drawable.ic2_history_20, 3, 0, null, false, false, 242, null);
        }
        C44811l2 binding2 = getBinding();
        if (binding2 != null && (frameLayout = binding2.f100378m) != null) {
            C27046k.m66711z(frameLayout, 0L, new Function0() { // from class: com.kubi.assets.finance.x
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FinanceHeaderView.m16685i(this.f17504b);
                }
            }, 1, null);
        }
        C44811l2 binding3 = getBinding();
        if (binding3 != null && (shapeImageView = binding3.f100369d) != null) {
            C27046k.m66711z(shapeImageView, 0L, new Function0() { // from class: com.kubi.assets.finance.y
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FinanceHeaderView.m16686j(this.f17505b);
                }
            }, 1, null);
        }
    }

    @Nullable
    public final AccountInfoHeaderView getAccountInfoHeader() {
        C44811l2 binding = getBinding();
        if (binding != null) {
            return binding.f100367b;
        }
        return null;
    }

    @Nullable
    public final AutoEarnEntryView getAutoEarnEntry() {
        C44811l2 binding = getBinding();
        if (binding != null) {
            return binding.f100368c;
        }
        return null;
    }
}
