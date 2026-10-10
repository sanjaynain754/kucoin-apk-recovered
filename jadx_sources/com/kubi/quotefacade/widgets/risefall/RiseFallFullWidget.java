package com.kubi.quotefacade.widgets.risefall;

import android.content.Context;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.Group;
import bv.C4699v0;
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
import com.kubi.quotefacade.R$color;
import com.kubi.quotefacade.R$font;
import com.kubi.quotefacade.R$layout;
import com.kubi.quotefacade.R$string;
import com.kubi.quotefacade.constant.QuoteMainTab;
import com.kubi.quotefacade.entity.RiseFallDetailEntity;
import com.kubi.quotefacade.entity.RiseFallEntity;
import com.kubi.quotefacade.entity.RiseFallTopCoinEntity;
import com.kubi.quotefacade.entity.RiseFallTopEntity;
import com.kubi.resources.C22890g;
import com.kubi.resources.C22912t;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ReloadRefreshView;
import com.kubi.resources.widget.bizshimmer.HomeShimmerHalfCard;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.spot.api.ISpotService;
import com.kubi.utils.C27096v0;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27023a;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import f00.C37304a;
import g00.InterfaceC37754f;
import gf.C37890n;
import java.math.BigDecimal;
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
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: RiseFallFullWidget.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0013H\u0016J\b\u0010\u001a\u001a\u00020\u0013H\u0014J\b\u0010\u001b\u001a\u00020\u0013H\u0014J\u0010\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001eH\u0014J\u0010\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u0018H\u0002J\u0010\u0010!\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\"H\u0002J\u0018\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020&H\u0002J\u0016\u0010'\u001a\u00020\u0013*\u00020(2\b\u0010)\u001a\u0004\u0018\u00010&H\u0002R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001d\u0010\f\u001a\u0004\u0018\u00010\r8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006*"}, m90084d2 = {"Lcom/kubi/quotefacade/widgets/risefall/RiseFallFullWidget;", "Lcom/kubi/kucoin/home/v2/cards/SimpleStateCardV2;", "Lcom/kubi/quotefacade/widgets/risefall/RiseFallContract$UIState;", "<init>", "()V", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/quotefacade/widgets/risefall/RiseFallWidgetVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "getLayout", "", "binding", "Lcom/kubi/quotefacade/databinding/QuoteWidgetEmotionFullBinding;", "getBinding$QuoteFacadeLib_googleRelease", "()Lcom/kubi/quotefacade/databinding/QuoteWidgetEmotionFullBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "initView", "", "bindToUI", "data", "Lcom/kubi/kucoin/home/v2/cards/BaseCardDataV2;", "isUpdate", "", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "bindFlowEvent", "bindUIState", "dispatchSingleEvent", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", "showContentOrReload", "showReload", "fillViewData", "Lcom/kubi/quotefacade/entity/RiseFallEntity;", "refreshWsRate", "isUp", "changeRate", "Ljava/math/BigDecimal;", "setCoinRate", "Landroid/widget/TextView;", "rate", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRiseFallFullWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RiseFallFullWidget.kt\ncom/kubi/quotefacade/widgets/risefall/RiseFallFullWidget\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 4 StateEx.kt\ncom/kubi/mvi/state/StateExKt\n*L\n1#1,234:1\n147#2,16:235\n153#3,7:251\n93#4,4:258\n*S KotlinDebug\n*F\n+ 1 RiseFallFullWidget.kt\ncom/kubi/quotefacade/widgets/risefall/RiseFallFullWidget\n*L\n70#1:235,16\n90#1:251,7\n102#1:258,4\n*E\n"})
public final class RiseFallFullWidget extends SimpleStateCardV2<UIState> {

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ KProperty<Object>[] f42881Y = {Reflection.property1(new PropertyReference1Impl(RiseFallFullWidget.class, "binding", "getBinding$QuoteFacadeLib_googleRelease()Lcom/kubi/quotefacade/databinding/QuoteWidgetEmotionFullBinding;", 0))};

    /* JADX INFO: renamed from: X */
    @NotNull
    public final InterfaceC24293a f42882X = C45681e.m100799e(this, new Function1<RiseFallFullWidget, C4699v0>() { // from class: com.kubi.quotefacade.widgets.risefall.RiseFallFullWidget$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C4699v0 invoke(@NotNull RiseFallFullWidget fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C4699v0.m4710a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C4699v0, Unit>() { // from class: com.kubi.quotefacade.widgets.risefall.RiseFallFullWidget$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C4699v0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4699v0 c4699v0) {
            invoke(c4699v0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: C3 */
    public static final Unit m53583C3(boolean z11, RiseFallFullWidget riseFallFullWidget, BigDecimal bigDecimal) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        if (z11) {
            C4699v0 c4699v0M53603A3 = riseFallFullWidget.m53603A3();
            if (c4699v0M53603A3 != null && (baseTextView2 = c4699v0M53603A3.f4584q) != null) {
                riseFallFullWidget.m53605D3(baseTextView2, bigDecimal);
            }
        } else {
            C4699v0 c4699v0M53603A4 = riseFallFullWidget.m53603A3();
            if (c4699v0M53603A4 != null && (baseTextView = c4699v0M53603A4.f4582o) != null) {
                riseFallFullWidget.m53605D3(baseTextView, bigDecimal);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F3 */
    private final void m53585F3(final boolean z11) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.widgets.risefall.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RiseFallFullWidget.m53586G3(this.f42892b, z11);
            }
        });
    }

    /* JADX INFO: renamed from: H3 */
    public static final Unit m53587H3(C4699v0 c4699v0, RiseFallFullWidget riseFallFullWidget) {
        c4699v0.f4577j.setLoading(true);
        riseFallFullWidget.sendIntent(RiseFallContract$UiIntent.LoadData.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w3 */
    public static final Unit m53599w3(RiseFallFullWidget riseFallFullWidget, RiseFallEntity riseFallEntity) {
        String strM66668h;
        RiseFallTopCoinEntity klineMetadata;
        String strM66668h2;
        RiseFallTopCoinEntity klineMetadata2;
        RiseFallTopCoinEntity klineMetadata3;
        RiseFallTopCoinEntity klineMetadata4;
        final C4699v0 c4699v0M53603A3 = riseFallFullWidget.m53603A3();
        if (c4699v0M53603A3 == null) {
            return Unit.INSTANCE;
        }
        Context context = c4699v0M53603A3.getRoot().getContext();
        RiseFallDetailEntity raw = riseFallEntity.getRaw();
        if (raw == null) {
            return Unit.INSTANCE;
        }
        riseFallFullWidget.m53585F3(false);
        String string = riseFallFullWidget.getString(R$string.platform_market_emotion_up);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        Integer advancedNum = raw.getAdvancedNum();
        String str = "--";
        String strM66669i = C27041f.m66669i(advancedNum != null ? advancedNum.toString() : null, "--");
        c4699v0M53603A3.f4585r.setText(string + ' ' + strM66669i);
        BaseTextView baseTextView = c4699v0M53603A3.f4585r;
        Intrinsics.checkNotNull(context);
        baseTextView.setTextColor(C22890g.m54291p(context));
        String string2 = riseFallFullWidget.getString(R$string.platform_market_emotion_down);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        Integer declinedNum = raw.getDeclinedNum();
        String strM66669i2 = C27041f.m66669i(declinedNum != null ? declinedNum.toString() : null, "--");
        c4699v0M53603A3.f4579l.setText(string2 + ' ' + strM66669i2);
        c4699v0M53603A3.f4579l.setTextColor(C22890g.m54289n(context));
        c4699v0M53603A3.f4569b.m54927f(Math.abs(C27039d.m66650j(raw.getAdvancedNum())), Math.abs(C27039d.m66650j(raw.getUnchangedNum())), Math.abs(C27039d.m66650j(raw.getDeclinedNum())));
        final RiseFallTopEntity advancedTop1 = raw.getAdvancedTop1();
        BaseTextView baseTextView2 = c4699v0M53603A3.f4583p;
        C37890n c37890n = C37890n.f85269a;
        SymbolInfoEntity symbolInfoEntityM85601B = c37890n.m85601B((advancedTop1 == null || (klineMetadata4 = advancedTop1.getKlineMetadata()) == null) ? null : klineMetadata4.getSymbol());
        if (symbolInfoEntityM85601B == null || (strM66668h = symbolInfoEntityM85601B.getBaseCurrencyName()) == null) {
            strM66668h = C27041f.m66668h((advancedTop1 == null || (klineMetadata = advancedTop1.getKlineMetadata()) == null) ? null : klineMetadata.getCrypto());
        }
        baseTextView2.setText(strM66668h);
        BaseTextView tvTopUpRate = c4699v0M53603A3.f4584q;
        Intrinsics.checkNotNullExpressionValue(tvTopUpRate, "tvTopUpRate");
        riseFallFullWidget.m53605D3(tvTopUpRate, C27041f.m66671k(advancedTop1 != null ? advancedTop1.getRate() : null));
        LinearLayoutCompat layoutTopUp = c4699v0M53603A3.f4576i;
        Intrinsics.checkNotNullExpressionValue(layoutTopUp, "layoutTopUp");
        C27046k.m66710y(layoutTopUp, 1000L, new Function0() { // from class: com.kubi.quotefacade.widgets.risefall.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RiseFallFullWidget.m53601y3(advancedTop1, c4699v0M53603A3);
            }
        });
        final RiseFallTopEntity declinedTop1 = raw.getDeclinedTop1();
        BaseTextView baseTextView3 = c4699v0M53603A3.f4581n;
        SymbolInfoEntity symbolInfoEntityM85601B2 = c37890n.m85601B((declinedTop1 == null || (klineMetadata3 = declinedTop1.getKlineMetadata()) == null) ? null : klineMetadata3.getSymbol());
        if (symbolInfoEntityM85601B2 == null || (strM66668h2 = symbolInfoEntityM85601B2.getBaseCurrencyName()) == null) {
            strM66668h2 = C27041f.m66668h((declinedTop1 == null || (klineMetadata2 = declinedTop1.getKlineMetadata()) == null) ? null : klineMetadata2.getCrypto());
        }
        baseTextView3.setText(strM66668h2);
        BaseTextView tvTopDownRate = c4699v0M53603A3.f4582o;
        Intrinsics.checkNotNullExpressionValue(tvTopDownRate, "tvTopDownRate");
        riseFallFullWidget.m53605D3(tvTopDownRate, C27041f.m66671k(declinedTop1 != null ? declinedTop1.getRate() : null));
        LinearLayoutCompat layoutTopDown = c4699v0M53603A3.f4575h;
        Intrinsics.checkNotNullExpressionValue(layoutTopDown, "layoutTopDown");
        C27046k.m66710y(layoutTopDown, 1000L, new Function0() { // from class: com.kubi.quotefacade.widgets.risefall.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RiseFallFullWidget.m53602z3(declinedTop1, c4699v0M53603A3);
            }
        });
        c4699v0M53603A3.f4573f.setColorFilter(C22890g.m54291p(context));
        c4699v0M53603A3.f4573f.setImageAlpha(102);
        c4699v0M53603A3.f4572e.setColorFilter(C22890g.m54289n(context));
        c4699v0M53603A3.f4572e.setImageAlpha(102);
        BigDecimal bigDecimalM66671k = C27041f.m66671k(raw.getAverageRate());
        if (bigDecimalM66671k != null) {
            String strM93915p = C42828b.m93915p(C42828b.m93911l(C42180b.m92642g(bigDecimalM66671k, null, null, C41014a.m89951y(bigDecimalM66671k), true, false, false, 19, null)));
            if (strM93915p == null) {
                strM93915p = "";
            }
            str = strM93915p;
        }
        C27096v0 c27096v0 = new C27096v0();
        c27096v0.append(riseFallFullWidget.getStringRes(R$string.home_emotion_rate, str));
        c4699v0M53603A3.f4578k.setText(c27096v0);
        HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
        BaseTextView tvAvgMarketChange = c4699v0M53603A3.f4578k;
        Intrinsics.checkNotNullExpressionValue(tvAvgMarketChange, "tvAvgMarketChange");
        highlightTextHelper.m54116a(tvAvgMarketChange, HighlightTextHelper.TextTagEnum.SPAN, C22912t.m54408f(R$font.semi, C22890g.m54279d(context, C27039d.m66647g(bigDecimalM66671k), 0, 2, null)));
        MaterialCardView materialCardViewM4711b = c4699v0M53603A3.getRoot();
        Intrinsics.checkNotNullExpressionValue(materialCardViewM4711b, "getRoot(...)");
        C27046k.m66710y(materialCardViewM4711b, 1000L, new Function0() { // from class: com.kubi.quotefacade.widgets.risefall.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RiseFallFullWidget.m53600x3();
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x3 */
    public static final Unit m53600x3() throws JSONException {
        InterfaceC37754f.a.m85138j(C37304a.f82764a, QuoteMainTab.CHANCE.getType(), "emotion", null, null, null, null, null, 124, null);
        String code = HomeWidgetCode.ChangeDistribution.getCode();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("norm_version", "1");
        Unit unit = Unit.INSTANCE;
        C27023a.m66555b(HomeCardViewHolderProxy.PAGE_ID, code, null, jSONObject, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y3 */
    public static final Unit m53601y3(RiseFallTopEntity riseFallTopEntity, C4699v0 c4699v0) throws JSONException {
        RiseFallTopCoinEntity klineMetadata;
        String symbol;
        if (riseFallTopEntity == null || (klineMetadata = riseFallTopEntity.getKlineMetadata()) == null || (symbol = klineMetadata.getSymbol()) == null) {
            return Unit.INSTANCE;
        }
        ISpotService.m59982A(ISpotService.f49646a.get(), symbol, null, null, null, 14, null);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("norm_version", "1");
        jSONObject.put(FirebaseAnalytics.Param.CURRENCY, c4699v0.f4583p.getText().toString());
        Unit unit = Unit.INSTANCE;
        C27023a.m66555b(HomeCardViewHolderProxy.PAGE_ID, "changeDistributionTopGainer", null, jSONObject, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z3 */
    public static final Unit m53602z3(RiseFallTopEntity riseFallTopEntity, C4699v0 c4699v0) throws JSONException {
        RiseFallTopCoinEntity klineMetadata;
        String symbol;
        if (riseFallTopEntity == null || (klineMetadata = riseFallTopEntity.getKlineMetadata()) == null || (symbol = klineMetadata.getSymbol()) == null) {
            return Unit.INSTANCE;
        }
        ISpotService.m59982A(ISpotService.f49646a.get(), symbol, null, null, null, 14, null);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("norm_version", "1");
        jSONObject.put(FirebaseAnalytics.Param.CURRENCY, c4699v0.f4582o.getText().toString());
        Unit unit = Unit.INSTANCE;
        C27023a.m66555b(HomeCardViewHolderProxy.PAGE_ID, "changeDistributionTopLoser", null, jSONObject, 4, null);
        return Unit.INSTANCE;
    }

    @Nullable
    /* JADX INFO: renamed from: A3 */
    public final C4699v0 m53603A3() {
        return (C4699v0) this.f42882X.getValue(this, f42881Y[0]);
    }

    /* JADX INFO: renamed from: B3 */
    public final void m53604B3(final boolean z11, final BigDecimal bigDecimal) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.widgets.risefall.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RiseFallFullWidget.m53583C3(z11, this, bigDecimal);
            }
        });
    }

    /* JADX INFO: renamed from: D3 */
    public final void m53605D3(final TextView textView, final BigDecimal bigDecimal) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.widgets.risefall.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RiseFallFullWidget.m53584E3(this.f42899b, textView, bigDecimal);
            }
        });
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    public void dispatchSingleEvent(@NotNull InterfaceC36952a singleEvent) {
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
        super.dispatchSingleEvent(singleEvent);
        if (singleEvent instanceof C22675b) {
            m53585F3(true);
        }
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseCardFragmentV2
    public int getLayout() {
        return R$layout.quote_widget_emotion_full;
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    @NotNull
    public KClass<RiseFallWidgetVM> getVmClass() {
        return Reflection.getOrCreateKotlinClass(RiseFallWidgetVM.class);
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2, com.kubi.kucoin.home.p090v2.cards.ICardV2
    /* JADX INFO: renamed from: q */
    public void mo30081q(@NotNull BaseCardDataV2 data, boolean z11) {
        BaseTextView baseTextView;
        Intrinsics.checkNotNullParameter(data, "data");
        super.mo30081q(data, z11);
        C4699v0 c4699v0M53603A3 = m53603A3();
        if (c4699v0M53603A3 == null || (baseTextView = c4699v0M53603A3.f4580m) == null) {
            return;
        }
        baseTextView.setText(data.getTitle());
    }

    /* JADX INFO: renamed from: v3 */
    public final void m53606v3(final RiseFallEntity riseFallEntity) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.widgets.risefall.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RiseFallFullWidget.m53599w3(this.f42894b, riseFallEntity);
            }
        });
    }

    /* JADX INFO: renamed from: E3 */
    public static final Unit m53584E3(RiseFallFullWidget riseFallFullWidget, TextView textView, BigDecimal bigDecimal) {
        MaterialCardView materialCardViewM4711b;
        Context context;
        BigDecimal bigDecimal2;
        String strM93915p;
        C4699v0 c4699v0M53603A3 = riseFallFullWidget.m53603A3();
        if (c4699v0M53603A3 != null && (materialCardViewM4711b = c4699v0M53603A3.getRoot()) != null && (context = materialCardViewM4711b.getContext()) != null) {
            if (bigDecimal != null) {
                bigDecimal2 = bigDecimal;
                strM93915p = C42828b.m93915p(C42828b.m93911l(C42180b.m92642g(bigDecimal2, null, null, C41014a.m89951y(bigDecimal), true, false, false, 19, null)));
                if (strM93915p == null) {
                    strM93915p = "";
                }
            } else {
                bigDecimal2 = bigDecimal;
                strM93915p = "--";
            }
            textView.setText(strM93915p);
            textView.setTextColor(C22890g.m54278c(context, C27039d.m66647g(bigDecimal2), riseFallFullWidget.getColorRes(R$color.c_text40)));
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G3 */
    public static final Unit m53586G3(final RiseFallFullWidget riseFallFullWidget, boolean z11) {
        final C4699v0 c4699v0M53603A3 = riseFallFullWidget.m53603A3();
        if (c4699v0M53603A3 == null) {
            return Unit.INSTANCE;
        }
        c4699v0M53603A3.f4574g.m54976c();
        c4699v0M53603A3.f4577j.setLoading(false);
        if (z11) {
            Group groupContent = c4699v0M53603A3.f4571d;
            Intrinsics.checkNotNullExpressionValue(groupContent, "groupContent");
            C27046k.m66703r(groupContent);
            ReloadRefreshView reloadView = c4699v0M53603A3.f4577j;
            Intrinsics.checkNotNullExpressionValue(reloadView, "reloadView");
            C27046k.m66685H(reloadView);
            ReloadRefreshView reloadView2 = c4699v0M53603A3.f4577j;
            Intrinsics.checkNotNullExpressionValue(reloadView2, "reloadView");
            C27046k.m66711z(reloadView2, 0L, new Function0() { // from class: com.kubi.quotefacade.widgets.risefall.g
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RiseFallFullWidget.m53587H3(c4699v0M53603A3, riseFallFullWidget);
                }
            }, 1, null);
        } else {
            Group groupContent2 = c4699v0M53603A3.f4571d;
            Intrinsics.checkNotNullExpressionValue(groupContent2, "groupContent");
            C27046k.m66685H(groupContent2);
            ReloadRefreshView reloadView3 = c4699v0M53603A3.f4577j;
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
        C12572a.m23692a(this, false, new C22671xf965e63e("com.kubi.home.event.HomeEvent:pullRefresh", null, this));
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    /* JADX INFO: renamed from: i3 */
    public void mo20971i3() {
        super.mo20971i3();
        bindState(new PropertyReference1Impl() { // from class: com.kubi.quotefacade.widgets.risefall.RiseFallFullWidget$bindUIState$1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getData();
            }
        }, new RiseFallFullWidget$bindUIState$2(this, null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.quotefacade.widgets.risefall.RiseFallFullWidget$bindUIState$3
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getRateUp();
            }
        }, new RiseFallFullWidget$bindUIState$4(this, null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.quotefacade.widgets.risefall.RiseFallFullWidget$bindUIState$5
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getRateDown();
            }
        }, new RiseFallFullWidget$bindUIState$6(this, null));
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    public void initView() {
        HomeShimmerHalfCard homeShimmerHalfCard;
        super.initView();
        C4699v0 c4699v0M53603A3 = m53603A3();
        if (c4699v0M53603A3 != null && (homeShimmerHalfCard = c4699v0M53603A3.f4574g) != null) {
            homeShimmerHalfCard.m54977e();
        }
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2, com.kubi.kucoin.home.p090v2.cards.BaseCardFragmentV2
    public void onShow() {
        super.onShow();
        sendIntent(RiseFallContract$UiIntent.LoadData.INSTANCE);
    }
}
