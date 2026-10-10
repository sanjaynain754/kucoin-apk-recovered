package com.kubi.quotefacade.widgets.gembox;

import android.content.Context;
import androidx.constraintlayout.widget.Group;
import bv.C4705y0;
import com.blankj.utilcode.util.C5303w0;
import com.google.android.material.card.MaterialCardView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.home.api.HomeWidgetCode;
import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.kubi.kucoin.home.p090v2.cards.BaseCardDataV2;
import com.kubi.kucoin.home.p090v2.cards.SimpleStateCardV2;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.quotefacade.R$layout;
import com.kubi.quotefacade.R$mipmap;
import com.kubi.quotefacade.entity.ChanceGemBoxCurrency;
import com.kubi.quotefacade.entity.ChanceGemBoxTextItem;
import com.kubi.resources.C22890g;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ReloadRefreshView;
import com.kubi.resources.widget.bizshimmer.HomeShimmerHalfCard;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.util.C24256n1;
import com.kubi.sdk.util.C24277v;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27023a;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import gf.C37886j;
import gf.C37890n;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p208dr.InterfaceC36952a;
import p402kf.C41014a;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: GemboxWidget.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0013H\u0016J\b\u0010\u001a\u001a\u00020\u0013H\u0014J\b\u0010\u001b\u001a\u00020\u0013H\u0014J\u0010\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001eH\u0014J\u0010\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u0018H\u0002J\u0010\u0010!\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020%H\u0002R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001d\u0010\f\u001a\u0004\u0018\u00010\r8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006&"}, m90084d2 = {"Lcom/kubi/quotefacade/widgets/gembox/GemboxWidget;", "Lcom/kubi/kucoin/home/v2/cards/SimpleStateCardV2;", "Lcom/kubi/quotefacade/widgets/gembox/GemboxWidgetContract$UIState;", "<init>", "()V", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/quotefacade/widgets/gembox/GemboxWidgetVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "getLayout", "", "binding", "Lcom/kubi/quotefacade/databinding/QuoteWidgetGemboxBinding;", "getBinding$QuoteFacadeLib_googleRelease", "()Lcom/kubi/quotefacade/databinding/QuoteWidgetGemboxBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "initView", "", "bindToUI", "data", "Lcom/kubi/kucoin/home/v2/cards/BaseCardDataV2;", "isUpdate", "", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "bindFlowEvent", "bindUIState", "dispatchSingleEvent", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", "showContentOrReload", "showReload", "fillViewData", "Lcom/kubi/quotefacade/entity/ChanceGemBoxCurrency;", "heatIcon", "heat", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nGemboxWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GemboxWidget.kt\ncom/kubi/quotefacade/widgets/gembox/GemboxWidget\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 4 StateEx.kt\ncom/kubi/mvi/state/StateExKt\n*L\n1#1,149:1\n147#2,16:150\n153#3,7:166\n93#4,4:173\n*S KotlinDebug\n*F\n+ 1 GemboxWidget.kt\ncom/kubi/quotefacade/widgets/gembox/GemboxWidget\n*L\n50#1:150,16\n71#1:166,7\n83#1:173,4\n*E\n"})
public final class GemboxWidget extends SimpleStateCardV2<UIState> {

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ KProperty<Object>[] f42860Y = {Reflection.property1(new PropertyReference1Impl(GemboxWidget.class, "binding", "getBinding$QuoteFacadeLib_googleRelease()Lcom/kubi/quotefacade/databinding/QuoteWidgetGemboxBinding;", 0))};

    /* JADX INFO: renamed from: X */
    @NotNull
    public final InterfaceC24293a f42861X = C45681e.m100799e(this, new Function1<GemboxWidget, C4705y0>() { // from class: com.kubi.quotefacade.widgets.gembox.GemboxWidget$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C4705y0 invoke(@NotNull GemboxWidget fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C4705y0.m4722a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C4705y0, Unit>() { // from class: com.kubi.quotefacade.widgets.gembox.GemboxWidget$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C4705y0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4705y0 c4705y0) {
            invoke(c4705y0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: r3 */
    public static final Unit m53558r3(GemboxWidget gemboxWidget, final ChanceGemBoxCurrency chanceGemBoxCurrency) {
        ChanceGemBoxTextItem chanceGemBoxTextItem;
        String strM85579c;
        String strM92642g;
        C4705y0 c4705y0M53564t3 = gemboxWidget.m53564t3();
        if (c4705y0M53564t3 == null) {
            return Unit.INSTANCE;
        }
        gemboxWidget.m53560v3(false);
        Context context = c4705y0M53564t3.getRoot().getContext();
        String heatValue = chanceGemBoxCurrency.getHeatValue();
        String text = null;
        c4705y0M53564t3.f4633d.setImageResource(gemboxWidget.m53565u3(C27039d.m66647g(heatValue != null ? C27041f.m66671k(heatValue) : null)));
        c4705y0M53564t3.f4633d.setScaleX(C5303w0.m6511a() ? -1.0f : 1.0f);
        BaseTextView baseTextView = c4705y0M53564t3.f4638i;
        SymbolInfoEntity symbolInfoEntityM85601B = C37890n.f85269a.m85601B(chanceGemBoxCurrency.getSymbolCode());
        String str = "--";
        baseTextView.setText(C27041f.m66669i(symbolInfoEntityM85601B != null ? symbolInfoEntityM85601B.getBaseCurrencyName() : null, "--"));
        C24277v.m58540e(context, chanceGemBoxCurrency.getIconUrl(), c4705y0M53564t3.f4634e);
        BaseTextView baseTextView2 = c4705y0M53564t3.f4640k;
        BigDecimal changeRate = chanceGemBoxCurrency.getChangeRate();
        if (changeRate != null && (strM92642g = C42180b.m92642g(changeRate, null, null, C41014a.m89951y(changeRate), true, false, false, 19, null)) != null) {
            str = strM92642g;
        }
        baseTextView2.setText(str);
        BaseTextView baseTextView3 = c4705y0M53564t3.f4640k;
        Intrinsics.checkNotNull(context);
        baseTextView3.setTextColor(C22890g.m54279d(context, C27039d.m66647g(chanceGemBoxCurrency.getChangeRate()), 0, 2, null));
        BaseTextView baseTextView4 = c4705y0M53564t3.f4639j;
        BigDecimal price = chanceGemBoxCurrency.getPrice();
        baseTextView4.setText((price == null || (strM85579c = C37886j.m85579c(price, chanceGemBoxCurrency.getSymbolCode(), (124 & 2) != 0 ? RoundingMode.DOWN : RoundingMode.HALF_UP, (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null)) == null) ? null : C42828b.m93917r(strM85579c, chanceGemBoxCurrency.getSymbolCode()));
        List<ChanceGemBoxTextItem> highLightsTextItems = chanceGemBoxCurrency.getHighLightsTextItems();
        if (highLightsTextItems != null && (chanceGemBoxTextItem = (ChanceGemBoxTextItem) CollectionsKt.firstOrNull((List) highLightsTextItems)) != null) {
            text = chanceGemBoxTextItem.getText();
        }
        if (text == null) {
            text = "";
        }
        c4705y0M53564t3.f4641l.setText(text);
        BaseTextView tvTips = c4705y0M53564t3.f4641l;
        Intrinsics.checkNotNullExpressionValue(tvTips, "tvTips");
        C27046k.m66684G(tvTips, text.length() > 0);
        MaterialCardView materialCardViewM4723b = c4705y0M53564t3.getRoot();
        Intrinsics.checkNotNullExpressionValue(materialCardViewM4723b, "getRoot(...)");
        C27046k.m66710y(materialCardViewM4723b, 1000L, new Function0() { // from class: com.kubi.quotefacade.widgets.gembox.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GemboxWidget.m53559s3(chanceGemBoxCurrency);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v3 */
    private final void m53560v3(final boolean z11) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.widgets.gembox.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GemboxWidget.m53561w3(this.f42868b, z11);
            }
        });
    }

    /* JADX INFO: renamed from: x3 */
    public static final Unit m53562x3(C4705y0 c4705y0, GemboxWidget gemboxWidget) {
        c4705y0.f4637h.setLoading(true);
        gemboxWidget.sendIntent(new GemboxWidgetContract$UiIntent.LoadData(true));
        return Unit.INSTANCE;
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    public void dispatchSingleEvent(@NotNull InterfaceC36952a singleEvent) {
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
        super.dispatchSingleEvent(singleEvent);
        if (singleEvent instanceof C22664e) {
            m53560v3(true);
        }
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseCardFragmentV2
    public int getLayout() {
        return R$layout.quote_widget_gembox;
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    @NotNull
    public KClass<GemboxWidgetVM> getVmClass() {
        return Reflection.getOrCreateKotlinClass(GemboxWidgetVM.class);
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2, com.kubi.kucoin.home.p090v2.cards.ICardV2
    /* JADX INFO: renamed from: q */
    public void mo30081q(@NotNull BaseCardDataV2 data, boolean z11) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        Intrinsics.checkNotNullParameter(data, "data");
        super.mo30081q(data, z11);
        C4705y0 c4705y0M53564t3 = m53564t3();
        if (c4705y0M53564t3 != null && (baseTextView2 = c4705y0M53564t3.f4642m) != null) {
            baseTextView2.setText(data.getTitle());
        }
        C4705y0 c4705y0M53564t4 = m53564t3();
        if (c4705y0M53564t4 == null || (baseTextView = c4705y0M53564t4.f4642m) == null) {
            return;
        }
        C24256n1.m58512b(baseTextView);
    }

    /* JADX INFO: renamed from: q3 */
    public final void m53563q3(final ChanceGemBoxCurrency chanceGemBoxCurrency) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.widgets.gembox.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GemboxWidget.m53558r3(this.f42866b, chanceGemBoxCurrency);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: t3 */
    public final C4705y0 m53564t3() {
        return (C4705y0) this.f42861X.getValue(this, f42860Y[0]);
    }

    /* JADX INFO: renamed from: u3 */
    public final int m53565u3(double d11) {
        if (d11 < 1.0d) {
            return R$mipmap.quote_ic_gembox_heat_0;
        }
        if (d11 <= 3.0d) {
            return R$mipmap.quote_ic_gembox_heat_123;
        }
        if (d11 <= 6.0d) {
            return R$mipmap.quote_ic_gembox_heat_456;
        }
        return d11 <= 8.0d ? R$mipmap.quote_ic_gembox_heat_78 : R$mipmap.quote_ic_gembox_heat_910;
    }

    /* JADX INFO: renamed from: s3 */
    public static final Unit m53559s3(ChanceGemBoxCurrency chanceGemBoxCurrency) throws JSONException {
        String jumpLink = chanceGemBoxCurrency.getJumpLink();
        if (jumpLink != null) {
            RouteExKt.m56217H(jumpLink);
        }
        String code = HomeWidgetCode.Gembox.getCode();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("norm_version", "1");
        jSONObject.put(FirebaseAnalytics.Param.CURRENCY, C27041f.m66668h(chanceGemBoxCurrency.getName()));
        Unit unit = Unit.INSTANCE;
        C27023a.m66555b(HomeCardViewHolderProxy.PAGE_ID, code, null, jSONObject, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w3 */
    public static final Unit m53561w3(final GemboxWidget gemboxWidget, boolean z11) {
        final C4705y0 c4705y0M53564t3 = gemboxWidget.m53564t3();
        if (c4705y0M53564t3 == null) {
            return Unit.INSTANCE;
        }
        c4705y0M53564t3.f4636g.m54976c();
        c4705y0M53564t3.f4637h.setLoading(false);
        if (z11) {
            Group groupContent = c4705y0M53564t3.f4632c;
            Intrinsics.checkNotNullExpressionValue(groupContent, "groupContent");
            C27046k.m66703r(groupContent);
            ReloadRefreshView reloadView = c4705y0M53564t3.f4637h;
            Intrinsics.checkNotNullExpressionValue(reloadView, "reloadView");
            C27046k.m66685H(reloadView);
            ReloadRefreshView reloadView2 = c4705y0M53564t3.f4637h;
            Intrinsics.checkNotNullExpressionValue(reloadView2, "reloadView");
            C27046k.m66711z(reloadView2, 0L, new Function0() { // from class: com.kubi.quotefacade.widgets.gembox.c
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GemboxWidget.m53562x3(c4705y0M53564t3, gemboxWidget);
                }
            }, 1, null);
        } else {
            Group groupContent2 = c4705y0M53564t3.f4632c;
            Intrinsics.checkNotNullExpressionValue(groupContent2, "groupContent");
            C27046k.m66685H(groupContent2);
            ReloadRefreshView reloadView3 = c4705y0M53564t3.f4637h;
            Intrinsics.checkNotNullExpressionValue(reloadView3, "reloadView");
            C27046k.m66700o(reloadView3);
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    public void bindFlowEvent() {
        super.bindFlowEvent();
        if (C12573b.f21598a.m23696a()) {
            "com.kubi.home.event.HomeEvent:pullRefresh".length();
        }
        C12572a.m23692a(this, false, new GemboxWidget$bindFlowEvent$$inlined$bindFlowEvent$default$1("com.kubi.home.event.HomeEvent:pullRefresh", null, this));
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    /* JADX INFO: renamed from: i3 */
    public void mo20971i3() {
        super.mo20971i3();
        bindState(new PropertyReference1Impl() { // from class: com.kubi.quotefacade.widgets.gembox.GemboxWidget$bindUIState$1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getData();
            }
        }, new GemboxWidget$bindUIState$2(this, null));
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    public void initView() {
        HomeShimmerHalfCard homeShimmerHalfCard;
        super.initView();
        C4705y0 c4705y0M53564t3 = m53564t3();
        if (c4705y0M53564t3 != null && (homeShimmerHalfCard = c4705y0M53564t3.f4636g) != null) {
            homeShimmerHalfCard.m54977e();
        }
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2, com.kubi.kucoin.home.p090v2.cards.BaseCardFragmentV2
    public void onShow() {
        super.onShow();
        sendIntent(new GemboxWidgetContract$UiIntent.LoadData(false, 1, null));
    }
}
