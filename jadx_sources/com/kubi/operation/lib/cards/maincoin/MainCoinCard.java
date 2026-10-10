package com.kubi.operation.lib.cards.maincoin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.card.MaterialCardView;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.WsMarketSnapshotEntity;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.kucoin.home.cards.BaseCardData;
import com.kubi.kucoin.home.cards.SimpleStateCard;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.operation.lib.R$color;
import com.kubi.operation.lib.R$id;
import com.kubi.operation.lib.R$layout;
import com.kubi.operation.lib.entity.MainCoinDataEntity;
import com.kubi.operation.lib.exception.OperationException;
import com.kubi.operation.lib.utils.C19570t;
import com.kubi.operation.lib.utils.OperationHomeHelper;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.C22890g;
import com.kubi.resources.shimmer.C22911a;
import com.kubi.resources.widget.AutoTextView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.bingoogolapple.bgabanner.BGABanner;
import com.kubi.resources.widget.chart.data.DataPoint;
import com.kubi.resources.widget.chart.data.configuration.LineChartConfiguration;
import com.kubi.resources.widget.chart.view.LineChartView;
import com.kubi.sdk.util.C24277v;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.spot.api.ISpotService;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import gf.C37890n;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p208dr.InterfaceC36952a;
import p213dw.InterfaceC36986b;
import p311hf.C38184b;
import p402kf.C41014a;
import p429lf.C42180b;
import p479nw.Label;
import p479nw.LinearGradientData;
import p569qq.C43846g;
import p569qq.C43852m;
import p701vs.C45630g;
import p701vs.C45633j;
import p701vs.C45635l;
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
import rs.C44172b;
import w00.C45681e;

/* JADX INFO: compiled from: MainCoinCard.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90083d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010\u0014\u001a\u00020\u0015H\u0014J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0015H\u0014J\u0010\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001cH\u0014J\u001a\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e*\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002J\u0016\u0010 \u001a\u00020\u00152\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0007J\u0018\u0010\"\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001fH\u0002J\u001e\u0010%\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020'2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u001eH\u0002J\u0010\u0010*\u001a\u00020\u00152\u0006\u0010$\u001a\u00020+H\u0007J\u0018\u0010,\u001a\u00020-*\u0004\u0018\u00010.2\b\u0010/\u001a\u0004\u0018\u00010-H\u0002J\b\u00100\u001a\u00020\u0015H\u0016J\b\u00101\u001a\u00020\u0015H\u0016J\b\u00102\u001a\u00020\u0015H\u0016J\b\u00103\u001a\u00020\u0015H\u0016R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001d\u0010\f\u001a\u0004\u0018\u00010\r8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00064"}, m90084d2 = {"Lcom/kubi/operation/lib/cards/maincoin/MainCoinCard;", "Lcom/kubi/kucoin/home/cards/SimpleStateCard;", "Lcom/kubi/operation/lib/cards/maincoin/MainCoinCardContract$UIState;", "<init>", "()V", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/operation/lib/cards/maincoin/MainCoinVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "getLayout", "", "binding", "Lcom/kubi/operation/lib/databinding/OperationHomecardMaincoinBinding;", "getBinding$OperationLib_googleRelease", "()Lcom/kubi/operation/lib/databinding/OperationHomecardMaincoinBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "layoutShimmer", "Landroid/view/View;", "initView", "", "bindToUI", "data", "Lcom/kubi/kucoin/home/cards/BaseCardData;", "bindFlowEvent", "dispatchSingleEvent", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", "preCheckPassed", "", "Lcom/kubi/operation/lib/entity/MainCoinDataEntity;", "fillViewData", "remoteDataList", "fillItemView", "Lcom/kubi/operation/lib/databinding/OperationItemMaincoinBinding;", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "lineColor", "context", "Landroid/content/Context;", "dataPointList", "Lcom/kubi/resources/widget/chart/data/DataPoint;", "refreshWsData", "Lcom/kubi/data/entity/WsMarketSnapshotEntity;", "formatPrice", "", "Ljava/math/BigDecimal;", "symbolCode", "onMoveStart", "onMoveStop", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMainCoinCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainCoinCard.kt\ncom/kubi/operation/lib/cards/maincoin/MainCoinCard\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 OperationIssue.kt\ncom/kubi/operation/lib/exception/OperationIssueKt\n*L\n1#1,261:1\n147#2,16:262\n153#3,7:278\n1563#4:285\n1634#4,2:286\n1636#4:289\n774#4:292\n865#4,2:293\n2756#4:295\n1#5:288\n1#5:296\n45#6,2:290\n*S KotlinDebug\n*F\n+ 1 MainCoinCard.kt\ncom/kubi/operation/lib/cards/maincoin/MainCoinCard\n*L\n69#1:262,16\n97#1:278,7\n127#1:285\n127#1:286,2\n127#1:289\n222#1:292\n222#1:293,2\n224#1:295\n224#1:296\n211#1:290,2\n*E\n"})
public final class MainCoinCard extends SimpleStateCard<MainCoinCardContract$UIState> {

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ KProperty<Object>[] f36695Z = {Reflection.property1(new PropertyReference1Impl(MainCoinCard.class, "binding", "getBinding$OperationLib_googleRelease()Lcom/kubi/operation/lib/databinding/OperationHomecardMaincoinBinding;", 0))};

    /* JADX INFO: renamed from: X */
    @NotNull
    public final InterfaceC24293a f36696X = C45681e.m100799e(this, new Function1<MainCoinCard, C45630g>() { // from class: com.kubi.operation.lib.cards.maincoin.MainCoinCard$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C45630g invoke(@NotNull MainCoinCard fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C45630g.m100745a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C45630g, Unit>() { // from class: com.kubi.operation.lib.cards.maincoin.MainCoinCard$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C45630g it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C45630g c45630g) {
            invoke(c45630g);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: Y */
    @Nullable
    public View f36697Y;

    /* JADX INFO: renamed from: q3 */
    public static final Unit m43352q3(final C45633j c45633j, final MainCoinDataEntity mainCoinDataEntity, MainCoinCard mainCoinCard) {
        Context context = c45633j.getRoot().getContext();
        C27100x0.m66923d(new Function0() { // from class: com.kubi.operation.lib.cards.maincoin.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MainCoinCard.m43355t3(c45633j, mainCoinDataEntity);
            }
        });
        c45633j.f102855f.setText(mainCoinDataEntity.getCoinName());
        c45633j.f102855f.setTag(mainCoinDataEntity.getSymbol());
        AutoTextView tvPrice = c45633j.f102856g;
        Intrinsics.checkNotNullExpressionValue(tvPrice, "tvPrice");
        TextView textViewM97383c = C44172b.m97383c(tvPrice, null, false, 3, null);
        String price = mainCoinDataEntity.getPrice();
        textViewM97383c.setText(mainCoinCard.m43360v3(price != null ? C27041f.m66671k(price) : null, mainCoinDataEntity.getSymbol()));
        c45633j.f102859j.setText(mainCoinDataEntity.getTag());
        BigDecimal bigDecimalM66671k = C27041f.m66671k(mainCoinDataEntity.getChangeRate());
        BigDecimal bigDecimalM66671k2 = C27041f.m66671k(mainCoinDataEntity.getVolume24h());
        if (bigDecimalM66671k != null) {
            c45633j.f102858i.setText(C42180b.m92642g(bigDecimalM66671k, null, null, 0, true, false, false, 55, null));
            BaseTextView baseTextView = c45633j.f102858i;
            Intrinsics.checkNotNull(context);
            baseTextView.setTextColor(C22890g.m54279d(context, C27039d.m66647g(bigDecimalM66671k), 0, 2, null));
        } else if (bigDecimalM66671k2 != null) {
            c45633j.f102858i.setText(C41014a.m89931e(bigDecimalM66671k2, false, 1, null));
            c45633j.f102858i.setTextColor(mainCoinCard.getColorRes(R$color.c_text));
        } else {
            c45633j.f102858i.setText("--");
            c45633j.f102858i.setTextColor(mainCoinCard.getColorRes(R$color.c_text));
        }
        c45633j.f102857h.setText(mainCoinDataEntity.getDisplayDataDesc());
        List<DataPoint> formattedTrendList = mainCoinDataEntity.getFormattedTrendList();
        if (formattedTrendList == null || formattedTrendList.isEmpty()) {
            LineChartView lineChart = c45633j.f102854e;
            Intrinsics.checkNotNullExpressionValue(lineChart, "lineChart");
            C27046k.m66700o(lineChart);
        } else {
            LineChartView lineChart2 = c45633j.f102854e;
            Intrinsics.checkNotNullExpressionValue(lineChart2, "lineChart");
            C27046k.m66685H(lineChart2);
            Intrinsics.checkNotNull(context);
            final int iM43362y3 = mainCoinCard.m43362y3(context, formattedTrendList);
            LineChartView lineChartView = c45633j.f102854e;
            lineChartView.m55117m(new Function1() { // from class: com.kubi.operation.lib.cards.maincoin.e
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MainCoinCard.m43353r3(iM43362y3, mainCoinDataEntity, (LineChartConfiguration) obj);
                }
            });
            lineChartView.m55116l(formattedTrendList);
            Intrinsics.checkNotNull(lineChartView);
        }
        ConstraintLayout layoutRoot = c45633j.f102853d;
        Intrinsics.checkNotNullExpressionValue(layoutRoot, "layoutRoot");
        C27046k.m66711z(layoutRoot, 0L, new Function0() { // from class: com.kubi.operation.lib.cards.maincoin.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MainCoinCard.m43354s3(mainCoinDataEntity);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r3 */
    public static final Unit m43353r3(int i11, MainCoinDataEntity mainCoinDataEntity, LineChartConfiguration updateConfig) {
        Intrinsics.checkNotNullParameter(updateConfig, "$this$updateConfig");
        updateConfig.m55089g0(i11);
        updateConfig.m55100r0(true);
        updateConfig.m55088f0(new LinearGradientData(false, 0, ColorUtils.setAlphaComponent(i11, 45), 0, 10, null));
        updateConfig.m55085c0(true);
        updateConfig.m55086d0(false);
        updateConfig.m95391p(200L);
        updateConfig.m95393r(false);
        updateConfig.m95397v(0.0f);
        updateConfig.m55094l0(0.0f);
        updateConfig.m55097o0(0.0f);
        List<Label> yLabels = mainCoinDataEntity.getYLabels();
        if (yLabels == null) {
            yLabels = CollectionsKt.emptyList();
        }
        updateConfig.m95375D(yLabels);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s3 */
    public static final Unit m43354s3(MainCoinDataEntity mainCoinDataEntity) throws JSONException {
        ISpotService iSpotService = ISpotService.f49646a.get();
        String symbol = mainCoinDataEntity.getSymbol();
        OperationHomeHelper operationHomeHelper = OperationHomeHelper.f36890a;
        ISpotService.m59982A(iSpotService, symbol, 0, C43852m.m96602n(operationHomeHelper.m43677c(), "noLoginedCurrency", null, 4, null), null, 8, null);
        OperationHomeHelper.m43673e(operationHomeHelper, "noLoginedCurrency", null, null, mainCoinDataEntity.getCurrency(), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t3 */
    public static final Unit m43355t3(C45633j c45633j, MainCoinDataEntity mainCoinDataEntity) {
        C24277v.m58542g(c45633j.f102851b, mainCoinDataEntity.getIcon());
        return Unit.INSTANCE;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: A3 */
    public final void m43357A3(@NotNull final WsMarketSnapshotEntity entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        C27100x0.m66924e(new Function0() { // from class: com.kubi.operation.lib.cards.maincoin.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MainCoinCard.m43344B3(this.f36703b, entity);
            }
        });
    }

    @Override // com.kubi.kucoin.home.cards.BaseStateCard, com.kubi.kucoin.home.cards.ICard
    /* JADX INFO: renamed from: K1 */
    public void mo28980K1(@NotNull BaseCardData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        super.mo28980K1(data);
        sendIntent(new MainCoinCardContract$UiIntent.LoadData(false, 1, null));
    }

    @Override // com.kubi.kucoin.home.cards.BaseStateCard
    public void dispatchSingleEvent(@NotNull InterfaceC36952a singleEvent) throws JSONException {
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
        super.dispatchSingleEvent(singleEvent);
        if (singleEvent instanceof C19468g) {
            m43359u3(((C19468g) singleEvent).m43374a());
        } else if (singleEvent instanceof C19469h) {
            m43357A3(((C19469h) singleEvent).getF36714a());
        }
    }

    @Override // com.kubi.kucoin.home.cards.BaseCardFragment
    public int getLayout() {
        return R$layout.operation_homecard_maincoin;
    }

    @Override // com.kubi.kucoin.home.cards.BaseStateCard
    @NotNull
    public KClass<MainCoinVM> getVmClass() {
        return Reflection.getOrCreateKotlinClass(MainCoinVM.class);
    }

    /* JADX INFO: renamed from: p3 */
    public final void m43358p3(final C45633j c45633j, final MainCoinDataEntity mainCoinDataEntity) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.operation.lib.cards.maincoin.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MainCoinCard.m43352q3(c45633j, mainCoinDataEntity, this);
            }
        });
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: u3 */
    public final void m43359u3(@NotNull List<MainCoinDataEntity> remoteDataList) throws JSONException {
        FrameLayout frameLayout;
        MaterialCardView materialCardView;
        BGABanner bGABanner;
        Intrinsics.checkNotNullParameter(remoteDataList, "remoteDataList");
        List<MainCoinDataEntity> listM43363z3 = m43363z3(remoteDataList);
        if (listM43363z3 == null) {
            return;
        }
        C45630g c45630gM43361w3 = m43361w3();
        if (c45630gM43361w3 != null && (bGABanner = c45630gM43361w3.f102839b) != null) {
            bGABanner.setAutoPlayAble(listM43363z3.size() != 1);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM43363z3, 10));
            for (MainCoinDataEntity mainCoinDataEntity : listM43363z3) {
                C45633j c45633jM100754c = C45633j.m100754c(LayoutInflater.from(bGABanner.getContext()), bGABanner, false);
                Intrinsics.checkNotNull(c45633jM100754c);
                m43358p3(c45633jM100754c, mainCoinDataEntity);
                arrayList.add(c45633jM100754c.getRoot());
            }
            bGABanner.setData(CollectionsKt.toList(arrayList));
        }
        C45630g c45630gM43361w4 = m43361w3();
        if (c45630gM43361w4 != null && (materialCardView = c45630gM43361w4.f102841d) != null) {
            C27046k.m66685H(materialCardView);
        }
        if (this.f36697Y != null) {
            C45630g c45630gM43361w5 = m43361w3();
            if (c45630gM43361w5 != null && (frameLayout = c45630gM43361w5.f102840c) != null) {
                frameLayout.removeView(this.f36697Y);
            }
            this.f36697Y = null;
        }
        OperationHomeHelper.m43674g(OperationHomeHelper.f36890a, "noLoginedCurrency", null, null, 3, null);
    }

    /* JADX INFO: renamed from: v3 */
    public final String m43360v3(BigDecimal bigDecimal, String str) {
        String strM89933g;
        SymbolInfoEntity symbolInfoEntityM85601B = C37890n.f85269a.m85601B(str);
        String quoteCurrency = symbolInfoEntityM85601B != null ? symbolInfoEntityM85601B.getQuoteCurrency() : null;
        if (quoteCurrency == null) {
            quoteCurrency = "";
        }
        if (quoteCurrency.length() == 0) {
            quoteCurrency = C38184b.f85884a.m86146a();
        }
        return (bigDecimal == null || (strM89933g = C41014a.m89933g(new BigDecimal(String.valueOf(C41014a.m89940n(bigDecimal, quoteCurrency))), null, null, 0, false, false, true, 31, null)) == null) ? "" : strM89933g;
    }

    @Nullable
    /* JADX INFO: renamed from: w3 */
    public final C45630g m43361w3() {
        return (C45630g) this.f36696X.getValue(this, f36695Z[0]);
    }

    /* JADX INFO: renamed from: B3 */
    public static final Unit m43344B3(MainCoinCard mainCoinCard, WsMarketSnapshotEntity wsMarketSnapshotEntity) {
        BGABanner bGABanner;
        Object tag;
        if (mainCoinCard.getView() != null && !mainCoinCard.isDetached() && !mainCoinCard.isRemoving()) {
            C45630g c45630gM43361w3 = mainCoinCard.m43361w3();
            if (c45630gM43361w3 != null && (bGABanner = c45630gM43361w3.f102839b) != null) {
                BigDecimal bigDecimal = new BigDecimal(String.valueOf(wsMarketSnapshotEntity.getLastTradedPrice()));
                List<? extends View> views = bGABanner.getViews();
                if (views != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : views) {
                        TextView textView = (TextView) ((View) obj).findViewById(R$id.tvName);
                        if (textView != null) {
                            tag = textView.getTag();
                        } else {
                            tag = null;
                        }
                        if (Intrinsics.areEqual(tag, wsMarketSnapshotEntity.getSymbolCode())) {
                            arrayList.add(obj);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        TextView textView2 = (TextView) ((View) it.next()).findViewById(R$id.tvPrice);
                        if (textView2 != null) {
                            textView2.setText(mainCoinCard.m43360v3(bigDecimal, wsMarketSnapshotEntity.getSymbolCode()));
                        }
                    }
                }
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x3 */
    public static final Unit m43356x3(MainCoinCard mainCoinCard, FrameLayout frameLayout) {
        C45635l c45635lM100760c = C45635l.m100760c(LayoutInflater.from(mainCoinCard.getContext()), frameLayout, true);
        LinearLayoutCompat root = c45635lM100760c.getRoot();
        mainCoinCard.f36697Y = root;
        if (root != null) {
            ViewExtKt.m66584o(root, 0, 0, 0, 0);
        }
        View v11 = c45635lM100760c.f102876b;
        Intrinsics.checkNotNullExpressionValue(v11, "v1");
        InterfaceC36986b interfaceC36986bM54399d = C22911a.m54399d(v11, null, 1, null);
        if (interfaceC36986bM54399d != null) {
            interfaceC36986bM54399d.mo54393a();
        }
        View v12 = c45635lM100760c.f102877c;
        Intrinsics.checkNotNullExpressionValue(v12, "v2");
        InterfaceC36986b interfaceC36986bM54399d2 = C22911a.m54399d(v12, null, 1, null);
        if (interfaceC36986bM54399d2 != null) {
            interfaceC36986bM54399d2.mo54393a();
        }
        View v13 = c45635lM100760c.f102878d;
        Intrinsics.checkNotNullExpressionValue(v13, "v3");
        InterfaceC36986b interfaceC36986bM54399d3 = C22911a.m54399d(v13, null, 1, null);
        if (interfaceC36986bM54399d3 != null) {
            interfaceC36986bM54399d3.mo54393a();
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.kucoin.home.cards.ICard
    /* JADX INFO: renamed from: P */
    public void mo28981P() {
        C45630g c45630gM43361w3;
        BGABanner bGABanner;
        super.mo28981P();
        if (getView() != null && (c45630gM43361w3 = m43361w3()) != null && (bGABanner = c45630gM43361w3.f102839b) != null) {
            bGABanner.startAutoPlay();
        }
    }

    @Override // com.kubi.kucoin.home.cards.ICard
    /* JADX INFO: renamed from: Q */
    public void mo28982Q() {
        C45630g c45630gM43361w3;
        BGABanner bGABanner;
        super.mo28982Q();
        if (getView() != null && (c45630gM43361w3 = m43361w3()) != null && (bGABanner = c45630gM43361w3.f102839b) != null) {
            bGABanner.stopAutoPlay();
        }
    }

    @Override // com.kubi.kucoin.home.cards.BaseStateCard
    public void bindFlowEvent() {
        super.bindFlowEvent();
        if (C12573b.f21598a.m23696a()) {
            "com.kubi.home.event.HomeEvent:pullRefresh".length();
        }
        C12572a.m23692a(this, false, new MainCoinCard$bindFlowEvent$$inlined$bindFlowEvent$default$1("com.kubi.home.event.HomeEvent:pullRefresh", null, this));
    }

    @Override // com.kubi.kucoin.home.cards.BaseStateCard
    public void initView() {
        final FrameLayout frameLayout;
        MaterialCardView materialCardView;
        MaterialCardView materialCardView2;
        int iM66658b;
        super.initView();
        C45630g c45630gM43361w3 = m43361w3();
        if (c45630gM43361w3 != null && (frameLayout = c45630gM43361w3.f102840c) != null) {
            C27100x0.m66924e(new Function0() { // from class: com.kubi.operation.lib.cards.maincoin.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MainCoinCard.m43356x3(this.f36701b, frameLayout);
                }
            });
            C45630g c45630gM43361w4 = m43361w3();
            if (c45630gM43361w4 != null && (materialCardView2 = c45630gM43361w4.f102841d) != null) {
                if (DayNightThemeManager.f28592a.m33187l()) {
                    iM66658b = 0;
                } else {
                    iM66658b = C27040e.m66658b(1);
                }
                materialCardView2.setStrokeWidth(iM66658b);
            }
            C45630g c45630gM43361w5 = m43361w3();
            if (c45630gM43361w5 != null && (materialCardView = c45630gM43361w5.f102841d) != null) {
                C27046k.m66700o(materialCardView);
            }
        }
    }

    @Override // com.kubi.kucoin.home.cards.BaseStateCard, com.kubi.kucoin.home.cards.BaseCardFragment
    public void onHide() {
        BGABanner bGABanner;
        super.onHide();
        C45630g c45630gM43361w3 = m43361w3();
        if (c45630gM43361w3 != null && (bGABanner = c45630gM43361w3.f102839b) != null) {
            bGABanner.stopAutoPlay();
        }
    }

    @Override // com.kubi.kucoin.home.cards.BaseStateCard, com.kubi.kucoin.home.cards.BaseCardFragment
    public void onShow() {
        BGABanner bGABanner;
        super.onShow();
        C45630g c45630gM43361w3 = m43361w3();
        if (c45630gM43361w3 != null && (bGABanner = c45630gM43361w3.f102839b) != null) {
            bGABanner.startAutoPlay();
        }
    }

    /* JADX INFO: renamed from: y3 */
    public final int m43362y3(Context context, List<DataPoint> list) {
        double value;
        try {
            DataPoint dataPoint = (DataPoint) CollectionsKt.firstOrNull((List) list);
            double value2 = 0.0d;
            if (dataPoint != null) {
                value = dataPoint.getValue();
            } else {
                value = 0.0d;
            }
            DataPoint dataPoint2 = (DataPoint) CollectionsKt.lastOrNull((List) list);
            if (dataPoint2 != null) {
                value2 = dataPoint2.getValue();
            }
            if (value2 < value) {
                return C22890g.m54289n(context);
            }
            return C22890g.m54291p(context);
        } catch (Throwable th2) {
            C43846g.m96568c(new OperationException(th2, "MainCoinCard", false, null, 8, null), null, 2, null);
            return C22890g.m54291p(context);
        }
    }

    /* JADX INFO: renamed from: z3 */
    public final List<MainCoinDataEntity> m43363z3(List<MainCoinDataEntity> list) {
        String code;
        if (getView() == null || isDetached() || isRemoving()) {
            return null;
        }
        if (list.isEmpty()) {
            C19570t.m43669g("[MainCoinCard]dataList isEmpty, remove card");
            BaseCardData f27849u = getF27849U();
            if (f27849u != null && (code = f27849u.getCode()) != null) {
                C19570t.m43664b(code);
            }
            return null;
        }
        return list;
    }
}
