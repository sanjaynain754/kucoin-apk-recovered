package com.kubi.assets.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.AssetExKt;
import com.kubi.assets.AssetRemoteConfig;
import com.kubi.assets.AssetSyncManager;
import com.kubi.assets.IAssetAccountView;
import com.kubi.assets.R$color;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.api.IAssetsCenterService;
import com.kubi.assets.entity.AssetV2OverviewEntity;
import com.kubi.assets.entity.HomeAssetInfo;
import com.kubi.assets.entity.NewOverviewEntity;
import com.kubi.assets.entity.ProfitEventPoint;
import com.kubi.assets.overview.LineChartHelper;
import com.kubi.assets.overview.OverviewAnalyticsReporter;
import com.kubi.assets.setting.AssetV2SettingFragment;
import com.kubi.event.api.C12572a;
import com.kubi.p110rn.Constants;
import com.kubi.resources.C22890g;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.resources.widget.chart.data.DataPoint;
import com.kubi.resources.widget.chart.data.configuration.LineChartConfiguration;
import com.kubi.resources.widget.chart.view.LineChartView;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.base.p113ui.BaseFragmentActivity;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.sdk.widget.shape.layout.ShapeLinearLayout;
import com.kubi.sdk.widget.shape.view.ShapeImageView;
import com.kubi.utils.C27051h;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import gf.C37885i;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import l10.C42025b;
import lb.C42152g;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p311hf.C38184b;
import p402kf.C41014a;
import p402kf.C41016c;
import p479nw.Label;
import p481ny.C42899b;
import p569qq.C43852m;
import p637ta.C44877u5;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
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
import ro.C44128b;
import rs.AbstractC44173c;
import rs.C44172b;
import sa.C44370a;
import w00.C45682f;
import y70.C46392a;

/* JADX INFO: compiled from: AccountInfoHeaderView.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016JZ\u0010\u001e\u001a\u00020\u00112\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010!\u001a\u00020\n2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020#2\b\b\u0002\u0010%\u001a\u00020#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020(J \u0010*\u001a\u00020\u00112\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010+\u001a\u00020\n2\u0006\u0010,\u001a\u00020\nJ\u000e\u0010-\u001a\u00020\u00112\u0006\u0010.\u001a\u00020(J\u0018\u0010/\u001a\u00020\u00112\u0006\u0010+\u001a\u0002002\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ*\u00101\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\n2\u0006\u0010,\u001a\u00020\n2\b\u00102\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0016\u00103\u001a\u00020\u00112\u000e\u00104\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010J\b\u00105\u001a\u0004\u0018\u000106J\u000e\u00107\u001a\u00020\u00112\u0006\u00108\u001a\u00020(J\"\u0010*\u001a\u00020\u00112\b\u00109\u001a\u0004\u0018\u00010\n2\u0006\u0010+\u001a\u00020\n2\u0006\u0010,\u001a\u00020\nH\u0016J\b\u0010:\u001a\u00020\u0019H\u0016J'\u0010;\u001a\u00020\u00112\u000e\u0010<\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010=2\b\u0010>\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0002\u0010?J\b\u0010@\u001a\u0004\u0018\u00010AJ\u0010\u0010B\u001a\u00020\u00112\b\b\u0002\u0010C\u001a\u00020(J\b\u0010D\u001a\u00020#H\u0002J\u001c\u0010E\u001a\u00020\u00112\b\u0010F\u001a\u0004\u0018\u00010G2\b\u0010H\u001a\u0004\u0018\u00010\u000eH\u0007J\u0010\u0010I\u001a\u00020\u00112\u0006\u0010J\u001a\u00020#H\u0002J\u001c\u0010K\u001a\u00020\u00112\b\u0010L\u001a\u0004\u0018\u00010M2\b\u0010H\u001a\u0004\u0018\u00010\u000eH\u0007J\u0016\u0010N\u001a\u00020\u00112\u000e\u0010O\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bJ\u000e\u0010P\u001a\u00020\u00112\u0006\u00108\u001a\u00020(J\u000e\u0010Q\u001a\u00020\u00112\u0006\u00108\u001a\u00020(J\b\u0010R\u001a\u00020\u0011H\u0002J\u0010\u0010S\u001a\u00020\u00112\u0006\u00108\u001a\u00020(H\u0016J\u0012\u0010T\u001a\u00020\u00112\b\u0010U\u001a\u0004\u0018\u00010\nH\u0016J\u0018\u0010V\u001a\u00020\u00112\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0016J\u000e\u0010W\u001a\u00020\u00112\u0006\u0010.\u001a\u00020(R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006X"}, m90084d2 = {"Lcom/kubi/assets/view/AccountInfoHeaderView;", "Landroid/widget/FrameLayout;", "Lcom/kubi/assets/IAssetAccountView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "pageId", "", "fragment", "Lcom/kubi/sdk/BaseFragment;", "assets", "Lcom/kubi/assets/entity/AssetV2OverviewEntity;", "onTotalAssetClickListener", "Lkotlin/Function0;", "", "binding", "Lcom/kubi/assets/databinding/ViewAccountInfoHeaderBinding;", "getBinding", "()Lcom/kubi/assets/databinding/ViewAccountInfoHeaderBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "inflatedView", "Landroid/view/View;", "localPointList", "", "Lcom/kubi/resources/widget/chart/data/DataPoint;", "bindFragmentAndPageId", "bindActionEvent", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lio/reactivex/functions/Action;", "showText", "resId", "", "direction", "subResId", "subAction", "showPadding", "", "tint", "bindAssetsInfoSet", "assetsValue", "assetsValueLegal", "setZeroBalanceImgVisible", "isShow", "updateTotalAssetFromLineChart", "", "bindOptionAssetsInfoSet", FirebaseAnalytics.Param.CURRENCY, "setOnTotalAssetClickListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "getTvTotalAsset", "Lcom/kubi/resources/widget/DashTextView;", "setDashUnderlineVisible", ViewProps.VISIBLE, "baseCurrencyName", "getView", "bindEyesChanged", "consumer", "Lio/reactivex/functions/Consumer;", "initStatus", "(Lio/reactivex/functions/Consumer;Ljava/lang/Boolean;)V", "visibleOtherAndReturn", "Landroid/view/ViewGroup;", "adjustFontSizeIfNeeded", "retry", "calculateAvailableWidth", "bindNewProfitLossView", "newOverviewEntity", "Lcom/kubi/assets/entity/NewOverviewEntity;", "assetOverviewEntity", "setArrow", "color", "bindOldProfitLossView", "oldOverviewEntity", "Lcom/kubi/assets/entity/OldOverviewEntity;", "bindLineChartView", "pointList", "updateChartVisible", "updatePnlVisible", "initListener", "setCopyTradingWalletTagVisible", "setCopyTradingWalletTagAmountText", "text", "setCopyTradingWalletTagOnClick", "showKiaAiBtn", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAccountInfoHeaderView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountInfoHeaderView.kt\ncom/kubi/assets/view/AccountInfoHeaderView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n+ 3 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,673:1\n52#2:674\n80#2,7:675\n136#3:682\n136#3:684\n136#3:685\n136#3:697\n1#4:683\n808#5,11:686\n142#6,8:698\n*S KotlinDebug\n*F\n+ 1 AccountInfoHeaderView.kt\ncom/kubi/assets/view/AccountInfoHeaderView\n*L\n95#1:674\n95#1:675,7\n149#1:682\n180#1:684\n216#1:685\n260#1:697\n257#1:686,11\n309#1:698,8\n*E\n"})
public final class AccountInfoHeaderView extends FrameLayout implements IAssetAccountView {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ KProperty<Object>[] f19064i = {Reflection.property1(new PropertyReference1Impl(AccountInfoHeaderView.class, "binding", "getBinding()Lcom/kubi/assets/databinding/ViewAccountInfoHeaderBinding;", 0))};

    /* JADX INFO: renamed from: b */
    @Nullable
    public String f19065b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public BaseFragment f19066c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public AssetV2OverviewEntity f19067d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public Function0<Unit> f19068e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final InterfaceC24293a f19069f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public View f19070g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public List<DataPoint> f19071h;

    public /* synthetic */ AccountInfoHeaderView(Context context, AttributeSet attributeSet, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: renamed from: F */
    public static final Unit m19911F() {
        C12572a.m23695d("click_mini_line_chart", null, 0L, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m19938v(AccountInfoHeaderView accountInfoHeaderView, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        accountInfoHeaderView.m19956u(z11);
    }

    /* JADX INFO: renamed from: w */
    public static final void m19939w(AccountInfoHeaderView accountInfoHeaderView) {
        accountInfoHeaderView.m19956u(false);
    }

    /* JADX INFO: renamed from: D */
    public final void m19943D(@Nullable List<DataPoint> list) {
        View viewFindViewById;
        ViewStub viewStub;
        if (list == null || !(!list.isEmpty())) {
            View view = this.f19070g;
            LineChartView lineChartView = view != null ? (LineChartView) view.findViewById(R$id.lineChart) : null;
            View view2 = this.f19070g;
            viewFindViewById = view2 != null ? view2.findViewById(R$id.lineChatBg) : null;
            if (lineChartView != null) {
                ViewExtKt.m66577h(lineChartView);
            }
            if (viewFindViewById != null) {
                ViewExtKt.m66577h(viewFindViewById);
            }
        } else {
            if (this.f19070g == null) {
                C44877u5 binding = getBinding();
                this.f19070g = (binding == null || (viewStub = binding.f100980w) == null) ? null : viewStub.inflate();
            }
            View view3 = this.f19070g;
            LineChartView lineChartView2 = view3 != null ? (LineChartView) view3.findViewById(R$id.lineChart) : null;
            View view4 = this.f19070g;
            viewFindViewById = view4 != null ? view4.findViewById(R$id.lineChatBg) : null;
            if (lineChartView2 != null) {
                ViewExtKt.m66594y(lineChartView2);
            }
            if (viewFindViewById != null) {
                ViewExtKt.m66594y(viewFindViewById);
            }
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            final int iM20047c = C11273q.m20047c(context, list);
            final List<Label> listM18899f = LineChartHelper.f18547a.m18899f(5, list);
            if (lineChartView2 != null) {
                lineChartView2.m55117m(new Function1() { // from class: com.kubi.assets.view.h
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AccountInfoHeaderView.m19910E(iM20047c, listM18899f, (LineChartConfiguration) obj);
                    }
                });
                lineChartView2.m55116l(list);
            }
            if (lineChartView2 != null) {
                C27046k.m66711z(lineChartView2, 0L, new Function0() { // from class: com.kubi.assets.view.i
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountInfoHeaderView.m19911F();
                    }
                }, 1, null);
            }
        }
        this.f19071h = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountInfoHeaderView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f19069f = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C44877u5>() { // from class: com.kubi.assets.view.AccountInfoHeaderView$special$$inlined$customViewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C44877u5 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C44877u5.m99278a(C45682f.m100800a(viewGroup));
            }
        });
        LayoutInflater.from(context).inflate(R$layout.view_account_info_header, this);
        m19947L();
    }

    /* JADX INFO: renamed from: A */
    public static final Unit m19908A(Action action) throws Exception {
        if (action != null) {
            action.run();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C */
    public static final Unit m19909C(Consumer consumer, CompoundButton compoundButton, boolean z11) throws Exception {
        Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
        consumer.accept(Boolean.valueOf(z11));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E */
    public static final Unit m19910E(int i11, List list, LineChartConfiguration updateConfig) {
        Intrinsics.checkNotNullParameter(updateConfig, "$this$updateConfig");
        updateConfig.m55089g0(i11);
        updateConfig.m55100r0(false);
        updateConfig.m55098p0(false);
        updateConfig.m55085c0(true);
        updateConfig.m95393r(false);
        updateConfig.m95397v(0.0f);
        updateConfig.m55094l0(0.0f);
        updateConfig.m55097o0(0.0f);
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        updateConfig.m95375D(list);
        updateConfig.m55092j0(4);
        updateConfig.m55102t0(false);
        updateConfig.m95391p(1000L);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H */
    public static final Unit m19912H() {
        C42899b.m94073c(new Function1() { // from class: com.kubi.assets.view.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountInfoHeaderView.m19913I((FragmentActivity) obj);
            }
        });
        OverviewAnalyticsReporter.f18247a.m18418p(ProfitEventPoint.DescriptionHover.getValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I */
    public static final Unit m19913I(FragmentActivity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        IAssetsCenterService iAssetsCenterService = IAssetsCenterService.f16464a.get();
        FragmentManager supportFragmentManager = it.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        IAssetsCenterService.m15330i(iAssetsCenterService, supportFragmentManager, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M */
    public static final Unit m19914M(AccountInfoHeaderView accountInfoHeaderView) {
        String str = accountInfoHeaderView.f19065b;
        if (str != null) {
            C43852m.m96591c(str, "totalAssets", "1", null, 8, null);
        }
        BaseFragment baseFragment = accountInfoHeaderView.f19066c;
        if (baseFragment != null) {
            Context context = accountInfoHeaderView.getContext();
            String string = accountInfoHeaderView.getResources().getString(R$string.assets_setting);
            String name = AssetV2SettingFragment.class.getName();
            C27051h c27051h = new C27051h();
            AssetV2OverviewEntity assetV2OverviewEntity = accountInfoHeaderView.f19067d;
            C27051h c27051hM66721e = c27051h.m66721e("sub_asset_entity", assetV2OverviewEntity != null ? assetV2OverviewEntity.getSubAsset() : null);
            AssetV2OverviewEntity assetV2OverviewEntity2 = accountInfoHeaderView.f19067d;
            Intent intentM56572k0 = BaseFragmentActivity.m56572k0(context, string, name, c27051hM66721e.m66721e("custom_order_entity", assetV2OverviewEntity2 != null ? assetV2OverviewEntity2.getCustomOrderEntity() : null).m66717a());
            Intrinsics.checkNotNullExpressionValue(intentM56572k0, "buildIntent(...)");
            baseFragment.startActivityWithResult(intentM56572k0, new Consumer() { // from class: com.kubi.assets.view.e
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    AccountInfoHeaderView.m19915N((Intent) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P */
    public static final Unit m19917P(AccountInfoHeaderView accountInfoHeaderView) {
        AppCompatCheckBox appCompatCheckBox;
        Function0<Unit> function0 = accountInfoHeaderView.f19068e;
        if (function0 == null) {
            C44877u5 binding = accountInfoHeaderView.getBinding();
            if (binding != null && (appCompatCheckBox = binding.f100959b) != null) {
                appCompatCheckBox.performClick();
            }
        } else if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q */
    public static final Unit m19918Q() {
        IAssetsCenterService.f16464a.get().mo15345k();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: R */
    public static final Unit m19919R() {
        IAssetsCenterService.f16464a.get().mo15345k();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U */
    public static final Unit m19921U() {
        Router.f46192a.m56184f("krn/router").m4038a(Constants.BIZ, "kia").m4038a("entry", "main").m4038a(Constants.COMPONENT, "kucoin_kia_rn").m4038a("needLogin", Boolean.TRUE).m4038a("route", "KiaPage?skillName=asset_analysis&businessIdentify=ASSERT_PNL_ANALYZE&preSpmId=" + C43852m.m96602n("B1overview", "AITradingAnalysis", null, 4, null)).m4048k();
        C43852m.m96591c("B1overview", "AITradingAnalysis", null, null, 12, null);
        return Unit.INSTANCE;
    }

    private final C44877u5 getBinding() {
        return (C44877u5) this.f19069f.getValue(this, f19064i[0]);
    }

    private final void setArrow(int color) {
        ShowHideTextView showHideTextView;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        ShapeImageView shapeImageView;
        ShapeImageView shapeImageView2;
        C42025b shapeDrawableBuilder;
        if (AssetRemoteConfig.f18903a.m19569l()) {
            C44877u5 binding = getBinding();
            if (binding != null && (shapeImageView2 = binding.f100963f) != null && (shapeDrawableBuilder = shapeImageView2.getShapeDrawableBuilder()) != null) {
                shapeDrawableBuilder.m92151m(ColorUtils.setAlphaComponent(color, 20));
                shapeDrawableBuilder.m92143e();
            }
            C44877u5 binding2 = getBinding();
            if (binding2 != null && (shapeImageView = binding2.f100963f) != null) {
                C27046k.m66701p(shapeImageView, color);
            }
            C44877u5 binding3 = getBinding();
            if (binding3 != null && (frameLayout2 = binding3.f100964g) != null) {
                ViewExtKt.m66594y(frameLayout2);
            }
            C44877u5 binding4 = getBinding();
            if (binding4 != null && (frameLayout = binding4.f100964g) != null) {
                C27046k.m66711z(frameLayout, 0L, new Function0() { // from class: com.kubi.assets.view.p
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountInfoHeaderView.m19918Q();
                    }
                }, 1, null);
            }
            C44877u5 binding5 = getBinding();
            if (binding5 == null || (showHideTextView = binding5.f100961d) == null) {
                return;
            }
            C27046k.m66711z(showHideTextView, 0L, new Function0() { // from class: com.kubi.assets.view.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountInfoHeaderView.m19919R();
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m19940y(AccountInfoHeaderView accountInfoHeaderView, Action action, String str, int i11, int i12, int i13, Action action2, boolean z11, boolean z12, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            action = null;
        }
        if ((i14 & 2) != 0) {
            str = "";
        }
        if ((i14 & 4) != 0) {
            i11 = 0;
        }
        if ((i14 & 8) != 0) {
            i12 = GravityCompat.END;
        }
        if ((i14 & 16) != 0) {
            i13 = 0;
        }
        if ((i14 & 32) != 0) {
            action2 = null;
        }
        if ((i14 & 64) != 0) {
            z11 = true;
        }
        if ((i14 & 128) != 0) {
            z12 = true;
        }
        accountInfoHeaderView.m19957x(action, str, i11, i12, i13, action2, z11, z12);
    }

    /* JADX INFO: renamed from: z */
    public static final Unit m19941z(Action action) throws Exception {
        if (action != null) {
            action.run();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B */
    public final void m19942B(@Nullable AssetV2OverviewEntity assetV2OverviewEntity, @NotNull String assetsValue, @NotNull String assetsValueLegal) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        ShowHideTextView showHideTextView;
        String str;
        ShowHideTextView showHideTextView2;
        TextView textViewM97383c;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        ShowHideTextView showHideTextView3;
        String str2;
        ShowHideTextView showHideTextView4;
        TextView textViewM97383c2;
        BaseTextView baseTextView5;
        Intrinsics.checkNotNullParameter(assetsValue, "assetsValue");
        Intrinsics.checkNotNullParameter(assetsValueLegal, "assetsValueLegal");
        this.f19067d = assetV2OverviewEntity;
        if (C46392a.m102322d(C44370a.f98030a.m97869a(), true)) {
            C44877u5 binding = getBinding();
            if (binding != null && (baseTextView5 = binding.f100979v) != null) {
                String baseCurrencyName = assetV2OverviewEntity != null ? assetV2OverviewEntity.getBaseCurrencyName() : null;
                baseTextView5.setText(baseCurrencyName != null ? baseCurrencyName : "");
            }
            C44877u5 binding2 = getBinding();
            if (binding2 != null && (showHideTextView4 = binding2.f100978u) != null && (textViewM97383c2 = C44172b.m97383c(showHideTextView4, new AbstractC44173c.a(0, false, 3, null), false, 2, null)) != null) {
                textViewM97383c2.setText(assetsValue);
            }
            if (Intrinsics.areEqual(assetsValue, "--") && (str2 = this.f19065b) != null) {
                C43852m.m96595g(str2, "errorTips", "TotalAssetNo", null, 8, null);
            }
            C44877u5 binding3 = getBinding();
            if (binding3 != null && (showHideTextView3 = binding3.f100977t) != null) {
                showHideTextView3.setText(assetsValueLegal);
            }
            C44877u5 binding4 = getBinding();
            if (binding4 == null || (baseTextView4 = binding4.f100975r) == null) {
                return;
            }
            ViewExtKt.m66577h(baseTextView4);
            return;
        }
        C44877u5 binding5 = getBinding();
        if (binding5 != null && (baseTextView3 = binding5.f100979v) != null) {
            baseTextView3.setText(C41016c.m89965c());
        }
        C44877u5 binding6 = getBinding();
        if (binding6 != null && (showHideTextView2 = binding6.f100978u) != null && (textViewM97383c = C44172b.m97383c(showHideTextView2, new AbstractC44173c.a(0, false, 3, null), false, 2, null)) != null) {
            textViewM97383c.setText(AssetExKt.m15117e(assetsValueLegal));
        }
        if (Intrinsics.areEqual(assetsValue, "--") && (str = this.f19065b) != null) {
            C43852m.m96595g(str, "errorTips", "TotalAssetNo", null, 8, null);
        }
        C44877u5 binding7 = getBinding();
        if (binding7 != null && (showHideTextView = binding7.f100977t) != null) {
            showHideTextView.setText(C42828b.m93915p(C42828b.m93906g(assetsValue, "≈", false, false, 6, null)));
        }
        C44877u5 binding8 = getBinding();
        if (binding8 != null && (baseTextView2 = binding8.f100975r) != null) {
            ViewExtKt.m66594y(baseTextView2);
        }
        C44877u5 binding9 = getBinding();
        if (binding9 == null || (baseTextView = binding9.f100975r) == null) {
            return;
        }
        String baseCurrencyName2 = assetV2OverviewEntity != null ? assetV2OverviewEntity.getBaseCurrencyName() : null;
        baseTextView.setText(baseCurrencyName2 != null ? baseCurrencyName2 : "");
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: G */
    public final void m19944G(@Nullable NewOverviewEntity newOverviewEntity, @Nullable AssetV2OverviewEntity assetV2OverviewEntity) {
        LinearLayoutCompat linearLayoutCompat;
        C44877u5 binding;
        DashTextView dashTextView;
        ShowHideTextView showHideTextView;
        ShowHideTextView showHideTextView2;
        Double dValueOf;
        ShowHideTextView showHideTextView3;
        String strM92496b;
        ShowHideTextView showHideTextView4;
        ShowHideTextView showHideTextView5;
        String strM92496b2;
        ShowHideTextView showHideTextView6;
        CharSequence text;
        ShowHideTextView showHideTextView7;
        C44877u5 binding2;
        DashTextView dashTextView2;
        LinearLayoutCompat linearLayoutCompat2;
        if (newOverviewEntity == null || !newOverviewEntity.getEnabled()) {
            C44877u5 binding3 = getBinding();
            if (binding3 != null && (linearLayoutCompat = binding3.f100960c) != null) {
                linearLayoutCompat.setVisibility(8);
            }
            AssetSyncManager assetSyncManager = AssetSyncManager.f16327a;
            HomeAssetInfo homeAssetInfoM15157f = assetSyncManager.m15157f();
            homeAssetInfoM15157f.setPnl("");
            assetSyncManager.m15161j(homeAssetInfoM15157f);
        } else {
            C44877u5 binding4 = getBinding();
            if (binding4 != null && (linearLayoutCompat2 = binding4.f100960c) != null) {
                ViewExtKt.m66594y(linearLayoutCompat2);
            }
            AssetRemoteConfig assetRemoteConfig = AssetRemoteConfig.f18903a;
            if (assetRemoteConfig.m19571n() && (binding2 = getBinding()) != null && (dashTextView2 = binding2.f100972o) != null) {
                dashTextView2.setText(AssetSyncManager.f16327a.m15158g());
            }
            Boolean bool = Boolean.TRUE;
            String string = null;
            String str = "--";
            if ((assetV2OverviewEntity != null ? assetV2OverviewEntity.getTotalAssetValue() : null) == null) {
                C44877u5 binding5 = getBinding();
                if (binding5 != null && (showHideTextView7 = binding5.f100961d) != null) {
                    showHideTextView7.setText("--");
                }
            } else if (newOverviewEntity.getHasGetPreTotalAsset()) {
                BigDecimal totalAssetValue = assetV2OverviewEntity.getTotalAssetValue();
                if (totalAssetValue != null) {
                    double dM89940n = C41014a.m89940n(totalAssetValue, assetV2OverviewEntity.getBaseCurrency());
                    BigDecimal preTotal = newOverviewEntity.getPreTotal();
                    dValueOf = Double.valueOf(dM89940n - C27039d.m66646f(preTotal != null ? Double.valueOf(C41014a.m89940n(preTotal, C38184b.f85884a.m86146a())) : null));
                } else {
                    dValueOf = null;
                }
                if (assetRemoteConfig.m19571n()) {
                    C44877u5 binding6 = getBinding();
                    if (binding6 != null && (showHideTextView5 = binding6.f100961d) != null) {
                        if (dValueOf != null && (strM92496b2 = C42152g.m92496b(new BigDecimal(String.valueOf(dValueOf.doubleValue())))) != null) {
                            str = strM92496b2;
                        }
                        showHideTextView5.setText(str);
                    }
                } else {
                    C44877u5 binding7 = getBinding();
                    if (binding7 != null && (showHideTextView3 = binding7.f100961d) != null) {
                        if (dValueOf != null && (strM92496b = C42152g.m92496b(new BigDecimal(String.valueOf(dValueOf.doubleValue())))) != null) {
                            str = strM92496b;
                        }
                        showHideTextView3.setText(C42828b.m93905f(str, '(' + newOverviewEntity.getRangeName() + ')', true, false));
                    }
                }
                boolean z11 = C27039d.m66646f(dValueOf) >= 0.0d;
                Boolean boolValueOf = Boolean.valueOf(z11);
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                int iM54281f = C22890g.m54281f(context, z11);
                OverviewAnalyticsReporter.f18247a.m18418p((z11 ? ProfitEventPoint.Profit : ProfitEventPoint.Loss).getValue());
                C44877u5 binding8 = getBinding();
                if (binding8 != null && (showHideTextView4 = binding8.f100961d) != null) {
                    showHideTextView4.setTextColor(iM54281f);
                }
                setArrow(iM54281f);
                bool = boolValueOf;
            } else {
                C44877u5 binding9 = getBinding();
                if (binding9 != null && (showHideTextView2 = binding9.f100961d) != null) {
                    showHideTextView2.setText(getResources().getString(R$string.kc_assets_pnl_updating));
                }
                C44877u5 binding10 = getBinding();
                if (binding10 != null && (showHideTextView = binding10.f100961d) != null) {
                    Context context2 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    showHideTextView.setTextColor(C27046k.m66699n(context2, R$color.complementary));
                }
                OverviewAnalyticsReporter.f18247a.m18418p(ProfitEventPoint.PnLUpdating.getValue());
                setArrow(getContext().getColor(R$color.c_icon));
                bool = null;
            }
            AssetSyncManager assetSyncManager2 = AssetSyncManager.f16327a;
            HomeAssetInfo homeAssetInfoM15157f2 = assetSyncManager2.m15157f();
            BigDecimal preTotal2 = newOverviewEntity.getPreTotal();
            homeAssetInfoM15157f2.setPreTotal(preTotal2 != null ? preTotal2.toPlainString() : null);
            C44877u5 binding11 = getBinding();
            if (binding11 != null && (showHideTextView6 = binding11.f100961d) != null && (text = showHideTextView6.getText()) != null) {
                string = text.toString();
            }
            homeAssetInfoM15157f2.setPnl(C27041f.m66668h(string));
            homeAssetInfoM15157f2.setPnlTitle(assetSyncManager2.m15158g());
            homeAssetInfoM15157f2.setUp(bool);
            assetSyncManager2.m15161j(homeAssetInfoM15157f2);
        }
        if (this.f19066c == null || (binding = getBinding()) == null || (dashTextView = binding.f100972o) == null) {
            return;
        }
        C27046k.m66711z(dashTextView, 0L, new Function0() { // from class: com.kubi.assets.view.o
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountInfoHeaderView.m19912H();
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: J */
    public final void m19945J(@NotNull String assetsValue, @NotNull String assetsValueLegal, @Nullable String str, @Nullable AssetV2OverviewEntity assetV2OverviewEntity) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        ShowHideTextView showHideTextView;
        String str2;
        ShowHideTextView showHideTextView2;
        TextView textViewM97383c;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        ShowHideTextView showHideTextView3;
        String str3;
        ShowHideTextView showHideTextView4;
        TextView textViewM97383c2;
        BaseTextView baseTextView5;
        Intrinsics.checkNotNullParameter(assetsValue, "assetsValue");
        Intrinsics.checkNotNullParameter(assetsValueLegal, "assetsValueLegal");
        this.f19067d = assetV2OverviewEntity;
        if (C46392a.m102322d(C44370a.f98030a.m97869a(), true)) {
            C44877u5 binding = getBinding();
            if (binding != null && (baseTextView5 = binding.f100979v) != null) {
                if (str == null) {
                    str = "";
                }
                baseTextView5.setText(str);
            }
            C44877u5 binding2 = getBinding();
            if (binding2 != null && (showHideTextView4 = binding2.f100978u) != null && (textViewM97383c2 = C44172b.m97383c(showHideTextView4, new AbstractC44173c.a(0, false, 3, null), false, 2, null)) != null) {
                textViewM97383c2.setText(assetsValue);
            }
            if (Intrinsics.areEqual(assetsValue, "--") && (str3 = this.f19065b) != null) {
                C43852m.m96595g(str3, "errorTips", "TotalAssetNo", null, 8, null);
            }
            C44877u5 binding3 = getBinding();
            if (binding3 != null && (showHideTextView3 = binding3.f100977t) != null) {
                showHideTextView3.setText(assetsValueLegal);
            }
            C44877u5 binding4 = getBinding();
            if (binding4 == null || (baseTextView4 = binding4.f100975r) == null) {
                return;
            }
            ViewExtKt.m66577h(baseTextView4);
            return;
        }
        C44877u5 binding5 = getBinding();
        if (binding5 != null && (baseTextView3 = binding5.f100979v) != null) {
            baseTextView3.setText(C41016c.m89965c());
        }
        C44877u5 binding6 = getBinding();
        if (binding6 != null && (showHideTextView2 = binding6.f100978u) != null && (textViewM97383c = C44172b.m97383c(showHideTextView2, new AbstractC44173c.a(0, false, 3, null), false, 2, null)) != null) {
            textViewM97383c.setText(AssetExKt.m15117e(assetsValueLegal));
        }
        if (Intrinsics.areEqual(assetsValue, "--") && (str2 = this.f19065b) != null) {
            C43852m.m96595g(str2, "errorTips", "TotalAssetNo", null, 8, null);
        }
        C44877u5 binding7 = getBinding();
        if (binding7 != null && (showHideTextView = binding7.f100977t) != null) {
            showHideTextView.setText(C42828b.m93915p(C42828b.m93906g(assetsValue, "≈", false, false, 6, null)));
        }
        C44877u5 binding8 = getBinding();
        if (binding8 != null && (baseTextView2 = binding8.f100975r) != null) {
            ViewExtKt.m66594y(baseTextView2);
        }
        C44877u5 binding9 = getBinding();
        if (binding9 == null || (baseTextView = binding9.f100975r) == null) {
            return;
        }
        if (str == null) {
            str = "";
        }
        baseTextView.setText(str);
    }

    /* JADX INFO: renamed from: V */
    public final void m19949V(boolean z11) {
        List<DataPoint> list;
        List<DataPoint> list2;
        View view = this.f19070g;
        if (view != null) {
            LineChartView lineChartView = view != null ? (LineChartView) view.findViewById(R$id.lineChart) : null;
            View view2 = this.f19070g;
            View viewFindViewById = view2 != null ? view2.findViewById(R$id.lineChatBg) : null;
            boolean z12 = false;
            if (lineChartView != null) {
                AssetExKt.m15138z(lineChartView, z11 && (list2 = this.f19071h) != null && (list2.isEmpty() ^ true));
            }
            if (viewFindViewById != null) {
                if (z11 && (list = this.f19071h) != null && (!list.isEmpty())) {
                    z12 = true;
                }
                AssetExKt.m15138z(viewFindViewById, z12);
            }
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m19950W(boolean z11) {
        LinearLayoutCompat linearLayoutCompat;
        LinearLayoutCompat linearLayoutCompat2;
        if (z11) {
            C44877u5 binding = getBinding();
            if (binding == null || (linearLayoutCompat2 = binding.f100960c) == null) {
                return;
            }
            linearLayoutCompat2.setVisibility(0);
            return;
        }
        C44877u5 binding2 = getBinding();
        if (binding2 == null || (linearLayoutCompat = binding2.f100960c) == null) {
            return;
        }
        linearLayoutCompat.setVisibility(4);
    }

    /* JADX INFO: renamed from: X */
    public final void m19951X(double d11, @Nullable AssetV2OverviewEntity assetV2OverviewEntity) {
        ShowHideTextView showHideTextView;
        TextView textViewM97383c;
        ShowHideTextView showHideTextView2;
        TextView textViewM97383c2;
        ShowHideTextView showHideTextView3;
        ShowHideTextView showHideTextView4;
        TextView textViewM97383c3;
        if (C46392a.m102322d(C44370a.f98030a.m97869a(), true)) {
            C44877u5 binding = getBinding();
            if (binding != null && (showHideTextView4 = binding.f100978u) != null && (textViewM97383c3 = C44172b.m97383c(showHideTextView4, new AbstractC44173c.a(0, false, 3, null), false, 2, null)) != null) {
                textViewM97383c3.setText(C27041f.m66669i(C37885i.m85562a(C41014a.m89916A(new BigDecimal(String.valueOf(d11)), C38184b.f85884a.m86146a(), assetV2OverviewEntity != null ? assetV2OverviewEntity.getBaseCurrency() : null), assetV2OverviewEntity != null ? assetV2OverviewEntity.getBaseCurrency() : null, C11273q.m20046b(assetV2OverviewEntity != null ? assetV2OverviewEntity.getBaseCurrency() : null)), "--"));
            }
            C44877u5 binding2 = getBinding();
            if (binding2 == null || (showHideTextView3 = binding2.f100977t) == null) {
                return;
            }
            showHideTextView3.setText(C27041f.m66669i(C41014a.m89950x(C41014a.m89939m(d11, C38184b.f85884a.m86146a()), null, null, 0, false, true, false, true, 47, null), "--"));
            return;
        }
        C44877u5 binding3 = getBinding();
        if (binding3 != null && (showHideTextView2 = binding3.f100978u) != null && (textViewM97383c2 = C44172b.m97383c(showHideTextView2, new AbstractC44173c.a(0, false, 3, null), false, 2, null)) != null) {
            textViewM97383c2.setText(AssetExKt.m15117e(C27041f.m66669i(C41014a.m89950x(C41014a.m89939m(d11, C38184b.f85884a.m86146a()), null, null, 0, false, true, false, true, 47, null), "--")));
        }
        C44877u5 binding4 = getBinding();
        if (binding4 == null || (showHideTextView = binding4.f100977t) == null || (textViewM97383c = C44172b.m97383c(showHideTextView, new AbstractC44173c.a(0, false, 3, null), false, 2, null)) == null) {
            return;
        }
        textViewM97383c.setText(C42828b.m93915p(C42828b.m93906g(C27041f.m66669i(C37885i.m85562a(C41014a.m89916A(new BigDecimal(String.valueOf(d11)), C38184b.f85884a.m86146a(), assetV2OverviewEntity != null ? assetV2OverviewEntity.getBaseCurrency() : null), assetV2OverviewEntity != null ? assetV2OverviewEntity.getBaseCurrency() : null, C11273q.m20046b(assetV2OverviewEntity != null ? assetV2OverviewEntity.getBaseCurrency() : null)), "--"), "≈", false, false, 6, null)));
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005d  */
    @Override // com.kubi.assets.IAssetAccountView
    /* JADX INFO: renamed from: a */
    public void mo19953a(@Nullable String str, @NotNull String assetsValue, @NotNull String assetsValueLegal) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        ShowHideTextView showHideTextView;
        String str2;
        ShowHideTextView showHideTextView2;
        TextView textViewM97383c;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        ShowHideTextView showHideTextView3;
        String str3;
        ShowHideTextView showHideTextView4;
        TextView textViewM97383c2;
        BaseTextView baseTextView5;
        AssetV2OverviewEntity f18182v;
        FragmentManager childFragmentManager;
        List<Fragment> fragments;
        Fragment parentFragment;
        Intrinsics.checkNotNullParameter(assetsValue, "assetsValue");
        Intrinsics.checkNotNullParameter(assetsValueLegal, "assetsValueLegal");
        if (this.f19067d == null) {
            BaseFragment baseFragment = this.f19066c;
            Fragment parentFragment2 = (baseFragment == null || (parentFragment = baseFragment.getParentFragment()) == null) ? null : parentFragment.getParentFragment();
            BaseFragment baseFragment2 = parentFragment2 instanceof BaseFragment ? (BaseFragment) parentFragment2 : null;
            if (baseFragment2 == null || (childFragmentManager = baseFragment2.getChildFragmentManager()) == null || (fragments = childFragmentManager.getFragments()) == null) {
                f18182v = null;
            } else {
                ArrayList arrayList = new ArrayList();
                for (Object obj : fragments) {
                    if (obj instanceof IAssetV2OverviewEntityGet) {
                        arrayList.add(obj);
                    }
                }
                IAssetV2OverviewEntityGet iAssetV2OverviewEntityGet = (IAssetV2OverviewEntityGet) CollectionsKt.firstOrNull((List) arrayList);
                if (iAssetV2OverviewEntityGet != null) {
                    f18182v = iAssetV2OverviewEntityGet.getF18182V();
                } else {
                    f18182v = null;
                }
            }
            this.f19067d = f18182v;
        }
        if (C46392a.m102322d(C44370a.f98030a.m97869a(), true)) {
            C44877u5 binding = getBinding();
            if (binding != null && (baseTextView5 = binding.f100979v) != null) {
                if (str == null) {
                    str = "";
                }
                baseTextView5.setText(str);
            }
            C44877u5 binding2 = getBinding();
            if (binding2 != null && (showHideTextView4 = binding2.f100978u) != null && (textViewM97383c2 = C44172b.m97383c(showHideTextView4, new AbstractC44173c.a(0, false, 3, null), false, 2, null)) != null) {
                textViewM97383c2.setText(assetsValue);
            }
            if (Intrinsics.areEqual(assetsValue, "--") && (str3 = this.f19065b) != null) {
                C43852m.m96595g(str3, "errorTips", "TotalAssetNo", null, 8, null);
            }
            C44877u5 binding3 = getBinding();
            if (binding3 != null && (showHideTextView3 = binding3.f100977t) != null) {
                showHideTextView3.setText(assetsValueLegal);
            }
            C44877u5 binding4 = getBinding();
            if (binding4 == null || (baseTextView4 = binding4.f100975r) == null) {
                return;
            }
            ViewExtKt.m66577h(baseTextView4);
            return;
        }
        C44877u5 binding5 = getBinding();
        if (binding5 != null && (baseTextView3 = binding5.f100979v) != null) {
            baseTextView3.setText(C41016c.m89965c());
        }
        C44877u5 binding6 = getBinding();
        if (binding6 != null && (showHideTextView2 = binding6.f100978u) != null && (textViewM97383c = C44172b.m97383c(showHideTextView2, new AbstractC44173c.a(0, false, 3, null), false, 2, null)) != null) {
            textViewM97383c.setText(AssetExKt.m15117e(assetsValueLegal));
        }
        if (Intrinsics.areEqual(assetsValue, "--") && (str2 = this.f19065b) != null) {
            C43852m.m96595g(str2, "errorTips", "TotalAssetNo", null, 8, null);
        }
        C44877u5 binding7 = getBinding();
        if (binding7 != null && (showHideTextView = binding7.f100977t) != null) {
            showHideTextView.setText(C42828b.m93915p(C42828b.m93906g(assetsValue, "≈", false, false, 6, null)));
        }
        C44877u5 binding8 = getBinding();
        if (binding8 != null && (baseTextView2 = binding8.f100975r) != null) {
            ViewExtKt.m66594y(baseTextView2);
        }
        C44877u5 binding9 = getBinding();
        if (binding9 == null || (baseTextView = binding9.f100975r) == null) {
            return;
        }
        if (str == null) {
            str = "";
        }
        baseTextView.setText(str);
    }

    @Override // com.kubi.assets.IAssetAccountView
    /* JADX INFO: renamed from: b */
    public void mo19954b(@Nullable final Consumer<Boolean> consumer, @Nullable Boolean bool) {
        C44877u5 binding;
        AppCompatCheckBox appCompatCheckBox;
        C44877u5 binding2;
        AppCompatCheckBox appCompatCheckBox2;
        if (consumer != null && (binding2 = getBinding()) != null && (appCompatCheckBox2 = binding2.f100959b) != null) {
            C27046k.m66708w(appCompatCheckBox2, new Function2() { // from class: com.kubi.assets.view.j
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountInfoHeaderView.m19909C(consumer, (CompoundButton) obj, ((Boolean) obj2).booleanValue());
                }
            });
        }
        if (bool == null || (binding = getBinding()) == null || (appCompatCheckBox = binding.f100959b) == null) {
            return;
        }
        appCompatCheckBox.setChecked(bool.booleanValue());
    }

    @Override // com.kubi.assets.IAssetAccountView
    /* JADX INFO: renamed from: d */
    public void mo19955d(@NotNull BaseFragment fragment, @Nullable String str) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f19066c = fragment;
        this.f19065b = str;
    }

    public final void setOnTotalAssetClickListener(@Nullable Function0<Unit> listener) {
        this.f19068e = listener;
    }

    /* JADX INFO: renamed from: x */
    public final void m19957x(@Nullable final Action action, @NotNull String showText, int i11, int i12, int i13, @Nullable final Action action2, boolean z11, boolean z12) {
        BaseTextView baseTextView;
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        ImageView imageView4;
        BaseTextView baseTextView2;
        C44877u5 binding;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        BaseTextView baseTextView5;
        Intrinsics.checkNotNullParameter(showText, "showText");
        C44877u5 binding2 = getBinding();
        if (binding2 != null && (baseTextView5 = binding2.f100973p) != null) {
            baseTextView5.setText(showText);
        }
        if (z11) {
            C44877u5 binding3 = getBinding();
            if (binding3 != null && (baseTextView4 = binding3.f100973p) != null) {
                C27046k.m66694i(baseTextView4, i11, 0, i12, 2, null);
            }
        } else {
            C44877u5 binding4 = getBinding();
            if (binding4 != null && (baseTextView = binding4.f100973p) != null) {
                C27046k.m66693h(baseTextView, i11, 0, i12);
            }
        }
        if (z12 && (binding = getBinding()) != null && (baseTextView3 = binding.f100973p) != null) {
            C27046k.m66702q(baseTextView3, getResources().getColor(R$color.c_text));
        }
        C44877u5 binding5 = getBinding();
        if (binding5 != null && (baseTextView2 = binding5.f100973p) != null) {
            C27046k.m66710y(baseTextView2, 800L, new Function0() { // from class: com.kubi.assets.view.c
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountInfoHeaderView.m19941z(action);
                }
            });
        }
        if (i13 == 0) {
            C44877u5 binding6 = getBinding();
            if (binding6 == null || (imageView = binding6.f100967j) == null) {
                return;
            }
            imageView.setVisibility(8);
            return;
        }
        C44877u5 binding7 = getBinding();
        if (binding7 != null && (imageView4 = binding7.f100967j) != null) {
            imageView4.setVisibility(0);
        }
        C44877u5 binding8 = getBinding();
        if (binding8 != null && (imageView3 = binding8.f100967j) != null) {
            imageView3.setImageResource(i13);
        }
        C44877u5 binding9 = getBinding();
        if (binding9 == null || (imageView2 = binding9.f100967j) == null) {
            return;
        }
        C27046k.m66711z(imageView2, 0L, new Function0() { // from class: com.kubi.assets.view.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountInfoHeaderView.m19908A(action2);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: O */
    public static final Unit m19916O(AccountInfoHeaderView accountInfoHeaderView) {
        AppCompatCheckBox appCompatCheckBox;
        C44877u5 binding = accountInfoHeaderView.getBinding();
        if (binding != null && (appCompatCheckBox = binding.f100959b) != null) {
            appCompatCheckBox.performClick();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S */
    public static final Unit m19920S(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K */
    public final int m19946K() {
        int measuredWidth;
        int i11;
        ShowHideTextView showHideTextView;
        ViewGroup.LayoutParams layoutParams;
        ShowHideTextView showHideTextView2;
        ViewGroup.LayoutParams layoutParams2;
        BaseTextView baseTextView;
        int width = getWidth();
        C44877u5 binding = getBinding();
        int i12 = 0;
        if (binding != null && (baseTextView = binding.f100979v) != null) {
            baseTextView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            measuredWidth = baseTextView.getMeasuredWidth();
        } else {
            measuredWidth = 0;
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        C44877u5 binding2 = getBinding();
        if (binding2 != null && (showHideTextView2 = binding2.f100978u) != null && (layoutParams2 = showHideTextView2.getLayoutParams()) != null && (layoutParams2 instanceof ConstraintLayout.LayoutParams)) {
            i11 = ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) layoutParams2)).leftMargin;
        } else {
            i11 = 0;
        }
        C44877u5 binding3 = getBinding();
        if (binding3 != null && (showHideTextView = binding3.f100978u) != null && (layoutParams = showHideTextView.getLayoutParams()) != null && (layoutParams instanceof ConstraintLayout.LayoutParams)) {
            i12 = ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) layoutParams)).rightMargin;
        }
        return ((((width - measuredWidth) - paddingLeft) - i11) - i12) - 32;
    }

    /* JADX INFO: renamed from: L */
    public final void m19947L() {
        DashTextView dashTextView;
        LinearLayoutCompat linearLayoutCompat;
        BaseTextView baseTextView;
        C44877u5 binding = getBinding();
        if (binding != null && (baseTextView = binding.f100979v) != null) {
            C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.assets.view.k
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountInfoHeaderView.m19914M(this.f19130b);
                }
            }, 1, null);
        }
        C44877u5 binding2 = getBinding();
        if (binding2 != null && (linearLayoutCompat = binding2.f100971n) != null) {
            C27046k.m66711z(linearLayoutCompat, 0L, new Function0() { // from class: com.kubi.assets.view.l
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountInfoHeaderView.m19916O(this.f19132b);
                }
            }, 1, null);
        }
        C44877u5 binding3 = getBinding();
        if (binding3 != null && (dashTextView = binding3.f100976s) != null) {
            C27046k.m66711z(dashTextView, 0L, new Function0() { // from class: com.kubi.assets.view.m
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountInfoHeaderView.m19917P(this.f19134b);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m19948T(boolean z11) {
        ShapeLinearLayout shapeLinearLayout;
        ShapeLinearLayout shapeLinearLayout2;
        C44877u5 binding = getBinding();
        if (binding != null && (shapeLinearLayout2 = binding.f100970m) != null) {
            AssetExKt.m15138z(shapeLinearLayout2, z11);
        }
        if (z11) {
            C43852m.m96595g("B1overview", "AITradingAnalysis", null, null, 12, null);
        }
        C44877u5 binding2 = getBinding();
        if (binding2 != null && (shapeLinearLayout = binding2.f100970m) != null) {
            C27046k.m66711z(shapeLinearLayout, 0L, new Function0() { // from class: com.kubi.assets.view.f
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountInfoHeaderView.m19921U();
                }
            }, 1, null);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: Y */
    public final ViewGroup m19952Y() {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        C44877u5 binding = getBinding();
        if (binding != null && (frameLayout2 = binding.f100962e) != null) {
            frameLayout2.setVisibility(0);
        }
        C44877u5 binding2 = getBinding();
        if (binding2 != null && (frameLayout = binding2.f100962e) != null) {
            ViewExtKt.m66585p(frameLayout, 0, 0, 0, 0, 11, null);
        }
        C44877u5 binding3 = getBinding();
        if (binding3 != null) {
            return binding3.f100962e;
        }
        return null;
    }

    @Nullable
    public final DashTextView getTvTotalAsset() {
        C44877u5 binding = getBinding();
        if (binding != null) {
            return binding.f100976s;
        }
        return null;
    }

    @Override // com.kubi.assets.IAssetAccountView
    public void setCopyTradingWalletTagAmountText(@Nullable String text) {
        BaseTextView baseTextView;
        C44877u5 binding = getBinding();
        if (binding != null && (baseTextView = binding.f100974q) != null) {
            if (text == null) {
                text = "";
            }
            baseTextView.setText(text);
        }
    }

    @Override // com.kubi.assets.IAssetAccountView
    public void setCopyTradingWalletTagOnClick(@Nullable final Function0<Unit> action) {
        ShapeLinearLayout shapeLinearLayout;
        C44877u5 binding = getBinding();
        if (binding != null && (shapeLinearLayout = binding.f100969l) != null) {
            if (action == null) {
                shapeLinearLayout.setOnClickListener(null);
            } else {
                C27046k.m66710y(shapeLinearLayout, 800L, new Function0() { // from class: com.kubi.assets.view.a
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountInfoHeaderView.m19920S(action);
                    }
                });
            }
        }
    }

    @Override // com.kubi.assets.IAssetAccountView
    public void setCopyTradingWalletTagVisible(boolean visible) {
        ShapeLinearLayout shapeLinearLayout;
        BaseTextView baseTextView;
        ShapeLinearLayout shapeLinearLayout2;
        C44877u5 binding = getBinding();
        if (binding != null && (shapeLinearLayout2 = binding.f100969l) != null) {
            AssetExKt.m15138z(shapeLinearLayout2, visible);
        }
        if (!visible) {
            C44877u5 binding2 = getBinding();
            if (binding2 != null && (baseTextView = binding2.f100974q) != null) {
                baseTextView.setText("");
            }
            C44877u5 binding3 = getBinding();
            if (binding3 != null && (shapeLinearLayout = binding3.f100969l) != null) {
                shapeLinearLayout.setOnClickListener(null);
            }
        }
    }

    public final void setDashUnderlineVisible(boolean visible) {
        DashTextView dashTextView;
        C44877u5 binding = getBinding();
        if (binding != null && (dashTextView = binding.f100976s) != null) {
            dashTextView.setNeedDash(visible);
        }
    }

    public final void setZeroBalanceImgVisible(boolean isShow) {
        BaseTextView baseTextView;
        ImageView imageView;
        AppCompatImageView appCompatImageView;
        C44877u5 binding = getBinding();
        if (binding != null && (appCompatImageView = binding.f100968k) != null) {
            AssetExKt.m15138z(appCompatImageView, isShow);
        }
        C44877u5 binding2 = getBinding();
        if (binding2 != null && (imageView = binding2.f100967j) != null) {
            AssetExKt.m15138z(imageView, !isShow);
        }
        C44877u5 binding3 = getBinding();
        if (binding3 != null && (baseTextView = binding3.f100973p) != null) {
            AssetExKt.m15138z(baseTextView, !isShow);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m19956u(boolean z11) {
        ShowHideTextView showHideTextView;
        BaseTextView baseTextView;
        C44877u5 binding = getBinding();
        if (binding != null && (baseTextView = binding.f100979v) != null) {
            baseTextView.setPaddingRelative(baseTextView.getPaddingStart(), baseTextView.getPaddingTop(), C27040e.m66658b(75), baseTextView.getPaddingBottom());
        }
        C44877u5 binding2 = getBinding();
        if (binding2 != null && (showHideTextView = binding2.f100978u) != null) {
            String string = showHideTextView.getText().toString();
            if (string.length() > 0 && !Intrinsics.areEqual(string, "--") && !StringsKt.contains$default((CharSequence) string, (CharSequence) "******", false, 2, (Object) null)) {
                int iM19946K = m19946K();
                C44128b.m97258b("availableWidth: " + iM19946K);
                float fM20178a = AssetViewHelper.f19192a.m20178a(showHideTextView, string, iM19946K);
                C44128b.m97258b("optimalFontSize: " + fM20178a);
                if (fM20178a != showHideTextView.getTextSize() / showHideTextView.getContext().getResources().getDisplayMetrics().scaledDensity) {
                    showHideTextView.setTextSize(fM20178a);
                    C44128b.m97258b("chage optimalFontSize: " + fM20178a);
                }
                if (iM19946K <= 0 && z11) {
                    postDelayed(new Runnable() { // from class: com.kubi.assets.view.n
                        @Override // java.lang.Runnable
                        public final void run() {
                            AccountInfoHeaderView.m19939w(this.f19136b);
                        }
                    }, 100L);
                }
            }
        }
    }

    @Override // com.kubi.assets.IAssetAccountView
    @NotNull
    public View getView() {
        return this;
    }

    /* JADX INFO: renamed from: N */
    public static final void m19915N(Intent intent) {
    }
}
