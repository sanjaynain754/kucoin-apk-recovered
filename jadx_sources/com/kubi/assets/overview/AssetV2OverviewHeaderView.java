package com.kubi.assets.overview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import com.kubi.assets.AssetExKt;
import com.kubi.assets.AssetSyncManager;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.assets.dialog.payment.C9835j;
import com.kubi.assets.entity.AssetV2OverviewEntity;
import com.kubi.assets.entity.HomeAssetInfo;
import com.kubi.assets.service.AssetsHelper;
import com.kubi.assets.view.AccountInfoHeaderView;
import com.kubi.assets.view.AssetsHistoryDialog;
import com.kubi.assets.view.C11273q;
import com.kubi.assets.view.VerticalIconTextBtn;
import com.kubi.payment.channel.data.entities.ChannelKycRequest;
import com.kubi.profit.loss.analysis.api.AssetsProfitLossAnalysisManager;
import com.kubi.resources.widget.AlertTipsTextView;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.unify.api.IUnifyAccountService;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import gf.C37885i;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p569qq.C43852m;
import p637ta.C44870t5;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45682f;

/* JADX INFO: compiled from: AssetV2OverviewHeaderView.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\tJ\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J\b\u0010\u001a\u001a\u00020\u0011H\u0002J\u0018\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0014H\u0002R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/assets/overview/AssetV2OverviewHeaderView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "fragment", "Lcom/kubi/sdk/BaseFragment;", "binding", "Lcom/kubi/assets/databinding/OverviewHeaderBinding;", "getBinding", "()Lcom/kubi/assets/databinding/OverviewHeaderBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "bindFragment", "", "assetV2OverviewFragment", "getAccountInfoHeader", "Lcom/kubi/assets/view/AccountInfoHeaderView;", "getRollbackTipView", "Lcom/kubi/resources/widget/AlertTipsTextView;", "bindInfo2View", "asset", "Lcom/kubi/assets/entity/AssetV2OverviewEntity;", "initListener", "bindAssetInfo", "myAssetEntity", "accountInfoHeader", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"ViewConstructor"})
@SourceDebugExtension({"SMAP\nAssetV2OverviewHeaderView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetV2OverviewHeaderView.kt\ncom/kubi/assets/overview/AssetV2OverviewHeaderView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,143:1\n52#2:144\n80#2,7:145\n1#3:152\n*S KotlinDebug\n*F\n+ 1 AssetV2OverviewHeaderView.kt\ncom/kubi/assets/overview/AssetV2OverviewHeaderView\n*L\n43#1:144\n43#1:145,7\n*E\n"})
public final class AssetV2OverviewHeaderView extends FrameLayout {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ KProperty<Object>[] f18200d = {Reflection.property1(new PropertyReference1Impl(AssetV2OverviewHeaderView.class, "binding", "getBinding()Lcom/kubi/assets/databinding/OverviewHeaderBinding;", 0))};

    /* JADX INFO: renamed from: b */
    @Nullable
    public BaseFragment f18201b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final InterfaceC24293a f18202c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetV2OverviewHeaderView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f18202c = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C44870t5>() { // from class: com.kubi.assets.overview.AssetV2OverviewHeaderView$special$$inlined$customViewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C44870t5 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C44870t5.m99264a(C45682f.m100800a(viewGroup));
            }
        });
        LayoutInflater.from(context).inflate(R$layout.overview_header, this);
    }

    private final C44870t5 getBinding() {
        return (C44870t5) this.f18202c.getValue(this, f18200d[0]);
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m18315i() {
        C43852m.m96590b("B1overview", ChannelKycRequest.SCENE_DEPOSIT, "1", TuplesKt.m90091to("norm_version", "1"), TuplesKt.m90091to("after_page_id", "B1depositCoinList"), TuplesKt.m90091to("isABNew", Boolean.valueOf(C9835j.m16374a())));
        AssetsHelper.m19137F(AssetsHelper.f18684a, C43852m.m96601m("B1overview", ChannelKycRequest.SCENE_DEPOSIT, "1"), 0, false, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m18316j() {
        C43852m.m96590b("B1overview", ChannelKycRequest.SCENE_WITHDRAW, "1", TuplesKt.m90091to("after_page_id", "B1depositCoinList"), TuplesKt.m90091to("norm_version", "1"), TuplesKt.m90091to("isABNew", Boolean.valueOf(C9835j.m16374a())));
        AssetsHelper.f18684a.m19159O();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m18317k() {
        C43852m.m96591c("B1overview", "transfer", "1", null, 8, null);
        if (IUnifyAccountService.f53155a.get().mo64979C()) {
            AssetsHelper.m19139N(AssetsHelper.f18684a, "MAIN", "UNIFIED", null, 4, null);
        } else {
            AssetsHelper.m19139N(AssetsHelper.f18684a, null, null, null, 7, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m18318l(AssetV2OverviewHeaderView assetV2OverviewHeaderView) {
        BaseFragment baseFragment = assetV2OverviewHeaderView.f18201b;
        if (baseFragment != null) {
            AssetsHistoryDialog assetsHistoryDialog = new AssetsHistoryDialog();
            FragmentManager childFragmentManager = baseFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            assetsHistoryDialog.show(childFragmentManager, "AssetsHistoryDialog");
        }
        C43852m.m96590b("B1overview", "historyButton", "1", TuplesKt.m90091to("norm_version", "1"));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public final void m18320f(@NotNull BaseFragment assetV2OverviewFragment) {
        AccountInfoHeaderView accountInfoHeaderView;
        Intrinsics.checkNotNullParameter(assetV2OverviewFragment, "assetV2OverviewFragment");
        this.f18201b = assetV2OverviewFragment;
        C44870t5 binding = getBinding();
        if (binding != null && (accountInfoHeaderView = binding.f100904c) != null) {
            accountInfoHeaderView.mo19955d(assetV2OverviewFragment, "B1overview");
        }
        m18322h();
        AssetsProfitLossAnalysisManager.m49939b(AssetsProfitLossAnalysisManager.f40608a, assetV2OverviewFragment, R$id.ProfitLossAnalysisContainer, 0, 4, null);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: g */
    public final void m18321g(@NotNull AssetV2OverviewEntity asset) {
        AccountInfoHeaderView accountInfoHeaderView;
        Intrinsics.checkNotNullParameter(asset, "asset");
        C44870t5 binding = getBinding();
        if (binding != null) {
            AccountInfoHeaderView accountInfoHeader = binding.f100904c;
            Intrinsics.checkNotNullExpressionValue(accountInfoHeader, "accountInfoHeader");
            m18319e(asset, accountInfoHeader);
        }
        C44870t5 binding2 = getBinding();
        if (binding2 == null || (accountInfoHeaderView = binding2.f100904c) == null) {
            return;
        }
        AccountInfoHeaderView.m19938v(accountInfoHeaderView, false, 1, null);
    }

    /* JADX INFO: renamed from: e */
    public final void m18319e(AssetV2OverviewEntity assetV2OverviewEntity, AccountInfoHeaderView accountInfoHeaderView) {
        String strM85562a;
        String strM89950x;
        BigDecimal totalAssetValue = assetV2OverviewEntity.getTotalAssetValue();
        String plainString = null;
        if (totalAssetValue != null) {
            strM85562a = C37885i.m85562a(totalAssetValue, assetV2OverviewEntity.getBaseCurrency(), C11273q.m20046b(assetV2OverviewEntity.getBaseCurrency()));
        } else {
            strM85562a = null;
        }
        String strM66669i = C27041f.m66669i(strM85562a, "--");
        BigDecimal totalAssetValue2 = assetV2OverviewEntity.getTotalAssetValue();
        if (totalAssetValue2 != null) {
            strM89950x = C41014a.m89950x(C41014a.m89940n(totalAssetValue2, assetV2OverviewEntity.getBaseCurrency()), null, null, 0, false, true, false, true, 47, null);
        } else {
            strM89950x = null;
        }
        String strM66669i2 = C27041f.m66669i(strM89950x, "--");
        accountInfoHeaderView.m19942B(assetV2OverviewEntity, strM66669i, strM66669i2);
        AssetSyncManager assetSyncManager = AssetSyncManager.f16327a;
        HomeAssetInfo homeAssetInfoM15157f = assetSyncManager.m15157f();
        BigDecimal totalAssetValue3 = assetV2OverviewEntity.getTotalAssetValue();
        if (totalAssetValue3 != null) {
            plainString = totalAssetValue3.toPlainString();
        }
        homeAssetInfoM15157f.setOriginalTotalAsset(plainString);
        homeAssetInfoM15157f.setTotalAsset(strM66669i);
        homeAssetInfoM15157f.setFiatValue(AssetExKt.m15117e(strM66669i2));
        String baseCurrencyName = assetV2OverviewEntity.getBaseCurrencyName();
        if (baseCurrencyName == null) {
            baseCurrencyName = "";
        }
        homeAssetInfoM15157f.setBalanceCurrency(baseCurrencyName);
        homeAssetInfoM15157f.setTimestamp(assetV2OverviewEntity.getTimestamp());
        assetSyncManager.m15161j(homeAssetInfoM15157f);
    }

    @Nullable
    public final AccountInfoHeaderView getAccountInfoHeader() {
        C44870t5 binding = getBinding();
        if (binding != null) {
            return binding.f100904c;
        }
        return null;
    }

    @Nullable
    public final AlertTipsTextView getRollbackTipView() {
        C44870t5 binding = getBinding();
        if (binding != null) {
            return binding.f100908g;
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final void m18322h() {
        C44870t5 binding = getBinding();
        if (binding != null) {
            VerticalIconTextBtn tvDeposit = binding.f100906e;
            Intrinsics.checkNotNullExpressionValue(tvDeposit, "tvDeposit");
            C27046k.m66711z(tvDeposit, 0L, new Function0() { // from class: com.kubi.assets.overview.l0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetV2OverviewHeaderView.m18315i();
                }
            }, 1, null);
            VerticalIconTextBtn tvWithdraw = binding.f100910i;
            Intrinsics.checkNotNullExpressionValue(tvWithdraw, "tvWithdraw");
            C27046k.m66711z(tvWithdraw, 0L, new Function0() { // from class: com.kubi.assets.overview.m0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetV2OverviewHeaderView.m18316j();
                }
            }, 1, null);
            VerticalIconTextBtn tvTransfer = binding.f100909h;
            Intrinsics.checkNotNullExpressionValue(tvTransfer, "tvTransfer");
            C27046k.m66711z(tvTransfer, 0L, new Function0() { // from class: com.kubi.assets.overview.n0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetV2OverviewHeaderView.m18317k();
                }
            }, 1, null);
            VerticalIconTextBtn tvHistory = binding.f100907f;
            Intrinsics.checkNotNullExpressionValue(tvHistory, "tvHistory");
            C27046k.m66711z(tvHistory, 0L, new Function0() { // from class: com.kubi.assets.overview.o0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetV2OverviewHeaderView.m18318l(this.f18398b);
                }
            }, 1, null);
        }
    }
}
