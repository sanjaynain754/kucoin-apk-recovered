package com.kubi.quotefacade.widgets.risefall;

import android.content.Context;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.Group;
import bv.C4697u0;
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
import com.kubi.quotefacade.R$layout;
import com.kubi.quotefacade.R$string;
import com.kubi.quotefacade.constant.QuoteMainTab;
import com.kubi.quotefacade.entity.RiseFallDetailEntity;
import com.kubi.quotefacade.entity.RiseFallEntity;
import com.kubi.quotefacade.entity.RiseFallTopCoinEntity;
import com.kubi.quotefacade.entity.RiseFallTopEntity;
import com.kubi.resources.C22890g;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ReloadRefreshView;
import com.kubi.resources.widget.bizshimmer.HomeShimmerHalfCard;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.spot.api.ISpotService;
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

/* JADX INFO: compiled from: RiseFallWidget.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0013H\u0016J\b\u0010\u001a\u001a\u00020\u0013H\u0014J\b\u0010\u001b\u001a\u00020\u0013H\u0014J\u0010\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001eH\u0014J\u0010\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u0018H\u0002J\u0010\u0010!\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\"H\u0002J\u0018\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020&H\u0002J\u0016\u0010'\u001a\u00020\u0013*\u00020(2\b\u0010)\u001a\u0004\u0018\u00010&H\u0002R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001d\u0010\f\u001a\u0004\u0018\u00010\r8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006*"}, m90084d2 = {"Lcom/kubi/quotefacade/widgets/risefall/RiseFallWidget;", "Lcom/kubi/kucoin/home/v2/cards/SimpleStateCardV2;", "Lcom/kubi/quotefacade/widgets/risefall/RiseFallContract$UIState;", "<init>", "()V", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/quotefacade/widgets/risefall/RiseFallWidgetVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "getLayout", "", "binding", "Lcom/kubi/quotefacade/databinding/QuoteWidgetEmotionBinding;", "getBinding$QuoteFacadeLib_googleRelease", "()Lcom/kubi/quotefacade/databinding/QuoteWidgetEmotionBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "initView", "", "bindToUI", "data", "Lcom/kubi/kucoin/home/v2/cards/BaseCardDataV2;", "isUpdate", "", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "bindFlowEvent", "bindUIState", "dispatchSingleEvent", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", "showContentOrReload", "showReload", "fillViewData", "Lcom/kubi/quotefacade/entity/RiseFallEntity;", "refreshWsRate", "isUp", "changeRate", "Ljava/math/BigDecimal;", "setCoinRate", "Landroid/widget/TextView;", "rate", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRiseFallWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RiseFallWidget.kt\ncom/kubi/quotefacade/widgets/risefall/RiseFallWidget\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 4 StateEx.kt\ncom/kubi/mvi/state/StateExKt\n*L\n1#1,188:1\n147#2,16:189\n153#3,7:205\n93#4,4:212\n*S KotlinDebug\n*F\n+ 1 RiseFallWidget.kt\ncom/kubi/quotefacade/widgets/risefall/RiseFallWidget\n*L\n54#1:189,16\n74#1:205,7\n86#1:212,4\n*E\n"})
public final class RiseFallWidget extends SimpleStateCardV2<UIState> {

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ KProperty<Object>[] f42883Y = {Reflection.property1(new PropertyReference1Impl(RiseFallWidget.class, "binding", "getBinding$QuoteFacadeLib_googleRelease()Lcom/kubi/quotefacade/databinding/QuoteWidgetEmotionBinding;", 0))};

    /* JADX INFO: renamed from: X */
    @NotNull
    public final InterfaceC24293a f42884X = C45681e.m100799e(this, new Function1<RiseFallWidget, C4697u0>() { // from class: com.kubi.quotefacade.widgets.risefall.RiseFallWidget$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C4697u0 invoke(@NotNull RiseFallWidget fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C4697u0.m4706a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C4697u0, Unit>() { // from class: com.kubi.quotefacade.widgets.risefall.RiseFallWidget$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C4697u0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4697u0 c4697u0) {
            invoke(c4697u0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B3 */
    public final void m53607B3(final boolean z11, final BigDecimal bigDecimal) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.widgets.risefall.m
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RiseFallWidget.m53608C3(z11, this, bigDecimal);
            }
        });
    }

    /* JADX INFO: renamed from: C3 */
    public static final Unit m53608C3(boolean z11, RiseFallWidget riseFallWidget, BigDecimal bigDecimal) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        if (z11) {
            C4697u0 c4697u0M53630A3 = riseFallWidget.m53630A3();
            if (c4697u0M53630A3 != null && (baseTextView2 = c4697u0M53630A3.f4557n) != null) {
                riseFallWidget.m53609D3(baseTextView2, bigDecimal);
            }
        } else {
            C4697u0 c4697u0M53630A4 = riseFallWidget.m53630A3();
            if (c4697u0M53630A4 != null && (baseTextView = c4697u0M53630A4.f4555l) != null) {
                riseFallWidget.m53609D3(baseTextView, bigDecimal);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D3 */
    private final void m53609D3(final TextView textView, final BigDecimal bigDecimal) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.widgets.risefall.n
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RiseFallWidget.m53610E3(this.f42915b, textView, bigDecimal);
            }
        });
    }

    /* JADX INFO: renamed from: F3 */
    private final void m53611F3(final boolean z11) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.widgets.risefall.l
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RiseFallWidget.m53612G3(this.f42910b, z11);
            }
        });
    }

    /* JADX INFO: renamed from: H3 */
    public static final Unit m53613H3(C4697u0 c4697u0, RiseFallWidget riseFallWidget) {
        c4697u0.f4551h.setLoading(true);
        riseFallWidget.sendIntent(RiseFallContract$UiIntent.LoadData.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v3 */
    public final void m53625v3(final RiseFallEntity riseFallEntity) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.widgets.risefall.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RiseFallWidget.m53626w3(this.f42908b, riseFallEntity);
            }
        });
    }

    /* JADX INFO: renamed from: x3 */
    public static final Unit m53627x3() throws JSONException {
        InterfaceC37754f.a.m85138j(C37304a.f82764a, QuoteMainTab.CHANCE.getType(), "emotion", null, null, null, null, null, 124, null);
        String code = HomeWidgetCode.ChangeDistribution.getCode();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("norm_version", "1");
        Unit unit = Unit.INSTANCE;
        C27023a.m66555b(HomeCardViewHolderProxy.PAGE_ID, code, null, jSONObject, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y3 */
    public static final Unit m53628y3(RiseFallTopEntity riseFallTopEntity, C4697u0 c4697u0) throws JSONException {
        RiseFallTopCoinEntity klineMetadata;
        String symbol;
        if (riseFallTopEntity == null || (klineMetadata = riseFallTopEntity.getKlineMetadata()) == null || (symbol = klineMetadata.getSymbol()) == null) {
            return Unit.INSTANCE;
        }
        ISpotService.m59982A(ISpotService.f49646a.get(), symbol, null, null, null, 14, null);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("norm_version", "1");
        jSONObject.put(FirebaseAnalytics.Param.CURRENCY, c4697u0.f4556m.getText().toString());
        Unit unit = Unit.INSTANCE;
        C27023a.m66555b(HomeCardViewHolderProxy.PAGE_ID, "changeDistributionTopGainer", null, jSONObject, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z3 */
    public static final Unit m53629z3(RiseFallTopEntity riseFallTopEntity, C4697u0 c4697u0) throws JSONException {
        RiseFallTopCoinEntity klineMetadata;
        String symbol;
        if (riseFallTopEntity == null || (klineMetadata = riseFallTopEntity.getKlineMetadata()) == null || (symbol = klineMetadata.getSymbol()) == null) {
            return Unit.INSTANCE;
        }
        ISpotService.m59982A(ISpotService.f49646a.get(), symbol, null, null, null, 14, null);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("norm_version", "1");
        jSONObject.put(FirebaseAnalytics.Param.CURRENCY, c4697u0.f4555l.getText().toString());
        Unit unit = Unit.INSTANCE;
        C27023a.m66555b(HomeCardViewHolderProxy.PAGE_ID, "changeDistributionTopLoser", null, jSONObject, 4, null);
        return Unit.INSTANCE;
    }

    @Nullable
    /* JADX INFO: renamed from: A3 */
    public final C4697u0 m53630A3() {
        return (C4697u0) this.f42884X.getValue(this, f42883Y[0]);
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    public void dispatchSingleEvent(@NotNull InterfaceC36952a singleEvent) {
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
        super.dispatchSingleEvent(singleEvent);
        if (singleEvent instanceof C22675b) {
            m53611F3(true);
        }
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseCardFragmentV2
    public int getLayout() {
        return R$layout.quote_widget_emotion;
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
        C4697u0 c4697u0M53630A3 = m53630A3();
        if (c4697u0M53630A3 == null || (baseTextView = c4697u0M53630A3.f4553j) == null) {
            return;
        }
        baseTextView.setText(data.getTitle());
    }

    /* JADX INFO: renamed from: E3 */
    public static final Unit m53610E3(RiseFallWidget riseFallWidget, TextView textView, BigDecimal bigDecimal) {
        MaterialCardView materialCardViewM4707b;
        Context context;
        BigDecimal bigDecimal2;
        String strM93915p;
        C4697u0 c4697u0M53630A3 = riseFallWidget.m53630A3();
        if (c4697u0M53630A3 != null && (materialCardViewM4707b = c4697u0M53630A3.getRoot()) != null && (context = materialCardViewM4707b.getContext()) != null) {
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
            textView.setTextColor(C22890g.m54278c(context, C27039d.m66647g(bigDecimal2), riseFallWidget.getColorRes(R$color.c_text40)));
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G3 */
    public static final Unit m53612G3(final RiseFallWidget riseFallWidget, boolean z11) {
        final C4697u0 c4697u0M53630A3 = riseFallWidget.m53630A3();
        if (c4697u0M53630A3 == null) {
            return Unit.INSTANCE;
        }
        c4697u0M53630A3.f4548e.m54976c();
        c4697u0M53630A3.f4551h.setLoading(false);
        if (z11) {
            Group groupContent = c4697u0M53630A3.f4547d;
            Intrinsics.checkNotNullExpressionValue(groupContent, "groupContent");
            C27046k.m66703r(groupContent);
            ReloadRefreshView reloadView = c4697u0M53630A3.f4551h;
            Intrinsics.checkNotNullExpressionValue(reloadView, "reloadView");
            C27046k.m66685H(reloadView);
            ReloadRefreshView reloadView2 = c4697u0M53630A3.f4551h;
            Intrinsics.checkNotNullExpressionValue(reloadView2, "reloadView");
            C27046k.m66711z(reloadView2, 0L, new Function0() { // from class: com.kubi.quotefacade.widgets.risefall.r
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RiseFallWidget.m53613H3(c4697u0M53630A3, riseFallWidget);
                }
            }, 1, null);
        } else {
            Group groupContent2 = c4697u0M53630A3.f4547d;
            Intrinsics.checkNotNullExpressionValue(groupContent2, "groupContent");
            C27046k.m66685H(groupContent2);
            ReloadRefreshView reloadView3 = c4697u0M53630A3.f4551h;
            Intrinsics.checkNotNullExpressionValue(reloadView3, "reloadView");
            C27046k.m66700o(reloadView3);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w3 */
    public static final Unit m53626w3(RiseFallWidget riseFallWidget, RiseFallEntity riseFallEntity) {
        String string;
        String string2;
        String symbol;
        String crypto;
        String strM66668h;
        RiseFallTopCoinEntity klineMetadata;
        String rate;
        String symbol2;
        String crypto2;
        String strM66668h2;
        RiseFallTopCoinEntity klineMetadata2;
        RiseFallTopCoinEntity klineMetadata3;
        RiseFallTopCoinEntity klineMetadata4;
        final C4697u0 c4697u0M53630A3 = riseFallWidget.m53630A3();
        if (c4697u0M53630A3 == null) {
            return Unit.INSTANCE;
        }
        Context context = c4697u0M53630A3.getRoot().getContext();
        RiseFallDetailEntity raw = riseFallEntity.getRaw();
        if (raw == null) {
            return Unit.INSTANCE;
        }
        riseFallWidget.m53611F3(false);
        String string3 = riseFallWidget.getString(R$string.platform_market_emotion_up);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        Integer advancedNum = raw.getAdvancedNum();
        String rate2 = null;
        if (advancedNum != null) {
            string = advancedNum.toString();
        } else {
            string = null;
        }
        String strM66669i = C27041f.m66669i(string, "--");
        c4697u0M53630A3.f4558o.setText(string3 + ' ' + strM66669i);
        BaseTextView baseTextView = c4697u0M53630A3.f4558o;
        Intrinsics.checkNotNull(context);
        baseTextView.setTextColor(C22890g.m54291p(context));
        String string4 = riseFallWidget.getString(R$string.platform_market_emotion_down);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        Integer declinedNum = raw.getDeclinedNum();
        if (declinedNum != null) {
            string2 = declinedNum.toString();
        } else {
            string2 = null;
        }
        String strM66669i2 = C27041f.m66669i(string2, "--");
        c4697u0M53630A3.f4552i.setText(string4 + ' ' + strM66669i2);
        c4697u0M53630A3.f4552i.setTextColor(C22890g.m54289n(context));
        c4697u0M53630A3.f4545b.m54927f(Math.abs(C27039d.m66650j(raw.getAdvancedNum())), Math.abs(C27039d.m66650j(raw.getUnchangedNum())), Math.abs(C27039d.m66650j(raw.getDeclinedNum())));
        final RiseFallTopEntity advancedTop1 = raw.getAdvancedTop1();
        BaseTextView baseTextView2 = c4697u0M53630A3.f4556m;
        C37890n c37890n = C37890n.f85269a;
        if (advancedTop1 != null && (klineMetadata4 = advancedTop1.getKlineMetadata()) != null) {
            symbol = klineMetadata4.getSymbol();
        } else {
            symbol = null;
        }
        SymbolInfoEntity symbolInfoEntityM85601B = c37890n.m85601B(symbol);
        if (symbolInfoEntityM85601B == null || (strM66668h = symbolInfoEntityM85601B.getBaseCurrencyName()) == null) {
            if (advancedTop1 != null && (klineMetadata = advancedTop1.getKlineMetadata()) != null) {
                crypto = klineMetadata.getCrypto();
            } else {
                crypto = null;
            }
            strM66668h = C27041f.m66668h(crypto);
        }
        baseTextView2.setText(strM66668h);
        BaseTextView tvTopUpRate = c4697u0M53630A3.f4557n;
        Intrinsics.checkNotNullExpressionValue(tvTopUpRate, "tvTopUpRate");
        if (advancedTop1 != null) {
            rate = advancedTop1.getRate();
        } else {
            rate = null;
        }
        riseFallWidget.m53609D3(tvTopUpRate, C27041f.m66671k(rate));
        LinearLayoutCompat layoutTopUp = c4697u0M53630A3.f4550g;
        Intrinsics.checkNotNullExpressionValue(layoutTopUp, "layoutTopUp");
        C27046k.m66710y(layoutTopUp, 1000L, new Function0() { // from class: com.kubi.quotefacade.widgets.risefall.o
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RiseFallWidget.m53628y3(advancedTop1, c4697u0M53630A3);
            }
        });
        final RiseFallTopEntity declinedTop1 = raw.getDeclinedTop1();
        BaseTextView baseTextView3 = c4697u0M53630A3.f4554k;
        if (declinedTop1 != null && (klineMetadata3 = declinedTop1.getKlineMetadata()) != null) {
            symbol2 = klineMetadata3.getSymbol();
        } else {
            symbol2 = null;
        }
        SymbolInfoEntity symbolInfoEntityM85601B2 = c37890n.m85601B(symbol2);
        if (symbolInfoEntityM85601B2 == null || (strM66668h2 = symbolInfoEntityM85601B2.getBaseCurrencyName()) == null) {
            if (declinedTop1 != null && (klineMetadata2 = declinedTop1.getKlineMetadata()) != null) {
                crypto2 = klineMetadata2.getCrypto();
            } else {
                crypto2 = null;
            }
            strM66668h2 = C27041f.m66668h(crypto2);
        }
        baseTextView3.setText(strM66668h2);
        BaseTextView tvTopDownRate = c4697u0M53630A3.f4555l;
        Intrinsics.checkNotNullExpressionValue(tvTopDownRate, "tvTopDownRate");
        if (declinedTop1 != null) {
            rate2 = declinedTop1.getRate();
        }
        riseFallWidget.m53609D3(tvTopDownRate, C27041f.m66671k(rate2));
        LinearLayoutCompat layoutTopDown = c4697u0M53630A3.f4549f;
        Intrinsics.checkNotNullExpressionValue(layoutTopDown, "layoutTopDown");
        C27046k.m66710y(layoutTopDown, 1000L, new Function0() { // from class: com.kubi.quotefacade.widgets.risefall.p
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RiseFallWidget.m53629z3(declinedTop1, c4697u0M53630A3);
            }
        });
        MaterialCardView materialCardViewM4707b = c4697u0M53630A3.getRoot();
        Intrinsics.checkNotNullExpressionValue(materialCardViewM4707b, "getRoot(...)");
        C27046k.m66710y(materialCardViewM4707b, 1000L, new Function0() { // from class: com.kubi.quotefacade.widgets.risefall.q
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RiseFallWidget.m53627x3();
            }
        });
        return Unit.INSTANCE;
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    public void bindFlowEvent() {
        super.bindFlowEvent();
        if (C12573b.f21598a.m23696a()) {
            "com.kubi.home.event.HomeEvent:pullRefresh".length();
        }
        C12572a.m23692a(this, false, new RiseFallWidget$bindFlowEvent$$inlined$bindFlowEvent$default$1("com.kubi.home.event.HomeEvent:pullRefresh", null, this));
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    /* JADX INFO: renamed from: i3 */
    public void mo20971i3() {
        super.mo20971i3();
        bindState(new PropertyReference1Impl() { // from class: com.kubi.quotefacade.widgets.risefall.RiseFallWidget$bindUIState$1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getData();
            }
        }, new RiseFallWidget$bindUIState$2(this, null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.quotefacade.widgets.risefall.RiseFallWidget$bindUIState$3
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getRateUp();
            }
        }, new RiseFallWidget$bindUIState$4(this, null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.quotefacade.widgets.risefall.RiseFallWidget$bindUIState$5
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getRateDown();
            }
        }, new RiseFallWidget$bindUIState$6(this, null));
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    public void initView() {
        HomeShimmerHalfCard homeShimmerHalfCard;
        super.initView();
        C4697u0 c4697u0M53630A3 = m53630A3();
        if (c4697u0M53630A3 != null && (homeShimmerHalfCard = c4697u0M53630A3.f4548e) != null) {
            homeShimmerHalfCard.m54977e();
        }
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2, com.kubi.kucoin.home.p090v2.cards.BaseCardFragmentV2
    public void onShow() {
        super.onShow();
        sendIntent(RiseFallContract$UiIntent.LoadData.INSTANCE);
    }
}
