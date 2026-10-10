package com.kubi.copytrading.widgets;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.ViewPager;
import com.blankj.utilcode.util.C5275i0;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.copytrading.CopyTradingConfig;
import com.kubi.copytrading.R$color;
import com.kubi.copytrading.R$drawable;
import com.kubi.copytrading.R$id;
import com.kubi.copytrading.R$layout;
import com.kubi.copytrading.R$string;
import com.kubi.copytrading.entity.CopyTradingWidgetEntity;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.kubi.kucoin.home.p090v2.cards.SimpleStateCardV2;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.C22890g;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ReloadRefreshView;
import com.kubi.resources.widget.TrendChartView;
import com.kubi.resources.widget.bingoogolapple.bgabanner.BGABanner;
import com.kubi.sdk.util.C24275u;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.shape.view.ShapeTextView;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l10.C42025b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p208dr.InterfaceC36952a;
import p429lf.C42180b;
import p532pc.C43432a;
import p569qq.C43852m;
import p778xy.C46338a;
import p778xy.C46341d;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
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

/* JADX INFO: compiled from: CopyTradingWidget.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u001c\u001a\u00020\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u001fH\u0014J\b\u0010 \u001a\u00020\u001fH\u0016J\u0012\u0010!\u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010\rH\u0002J\u0012\u0010#\u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010\rH\u0002J\u001a\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020&2\b\u0010\"\u001a\u0004\u0018\u00010\rH\u0002J\u001a\u0010'\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020&2\b\u0010\"\u001a\u0004\u0018\u00010\rH\u0002J\u0010\u0010(\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020&H\u0002J\b\u0010)\u001a\u00020\u001fH\u0014J\b\u0010*\u001a\u00020\u001fH\u0014J\u0016\u0010+\u001a\u00020\u001f2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002J\u0010\u0010-\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020\u001dH\u0002J\u0010\u0010/\u001a\u00020\u001f2\u0006\u00100\u001a\u000201H\u0014J\u0010\u00102\u001a\u00020\u001f2\u0006\u00103\u001a\u000204H\u0002R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u000fX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u000fX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u000fX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017¨\u00065"}, m90084d2 = {"Lcom/kubi/copytrading/widgets/CopyTradingWidget;", "Lcom/kubi/kucoin/home/v2/cards/SimpleStateCardV2;", "Lcom/kubi/copytrading/widgets/CopyTradingContract$UIState;", "<init>", "()V", "binding", "Lcom/kubi/copytrading/databinding/BcopytradingUserHomeWidgetBinding;", "getBinding", "()Lcom/kubi/copytrading/databinding/BcopytradingUserHomeWidgetBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "currentWidgets", "", "Lcom/kubi/copytrading/entity/CopyTradingWidgetEntity;", "lastExposedLeadConfigId", "", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/copytrading/widgets/CopyTradingWidgetVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "pageId", "getPageId", "()Ljava/lang/String;", "blockId", "getBlockId", "locationId", "getLocationId", "getLayout", "", "initView", "", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "trackPageClick", "model", "trackPageExpose", "bindItem", "itemView", "Landroid/view/View;", "setBannerItemData", "setStubData", "bindFlowEvent", "bindUIState", "setData", "widgets", "exposeBannerItem", ViewProps.POSITION, "dispatchSingleEvent", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", "showContentOrReload", "showReload", "", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCopyTradingWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CopyTradingWidget.kt\ncom/kubi/copytrading/widgets/CopyTradingWidget\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 6 StateEx.kt\ncom/kubi/mvi/state/StateExKt\n*L\n1#1,279:1\n143#2,20:280\n1563#3:300\n1634#3,3:301\n1#4:304\n153#5,7:305\n93#6,4:312\n*S KotlinDebug\n*F\n+ 1 CopyTradingWidget.kt\ncom/kubi/copytrading/widgets/CopyTradingWidget\n*L\n51#1:280,20\n144#1:300\n144#1:301,3\n197#1:305,7\n257#1:312,4\n*E\n"})
public final class CopyTradingWidget extends SimpleStateCardV2<UIState> {

    /* JADX INFO: renamed from: d0 */
    public static final /* synthetic */ KProperty<Object>[] f19964d0 = {Reflection.property1(new PropertyReference1Impl(CopyTradingWidget.class, "binding", "getBinding()Lcom/kubi/copytrading/databinding/BcopytradingUserHomeWidgetBinding;", 0))};

    /* JADX INFO: renamed from: Z */
    @Nullable
    public String f19967Z;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final InterfaceC24293a f19965X = C45681e.m100799e(this, new Function1<CopyTradingWidget, C43432a>() { // from class: com.kubi.copytrading.widgets.CopyTradingWidget$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C43432a invoke(@NotNull CopyTradingWidget fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C43432a.m95625a(fragment.requireView());
        }
    }, new Function1<C43432a, Unit>() { // from class: com.kubi.copytrading.widgets.CopyTradingWidget$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C43432a it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C43432a c43432a) {
            invoke(c43432a);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public List<CopyTradingWidgetEntity> f19966Y = CollectionsKt.emptyList();

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final String f19968a0 = HomeCardViewHolderProxy.PAGE_ID;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final String f19969b0 = "widget";

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final String f19970c0 = "copyTrading";

    /* JADX INFO: renamed from: com.kubi.copytrading.widgets.CopyTradingWidget$a */
    /* JADX INFO: compiled from: CopyTradingWidget.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/copytrading/widgets/CopyTradingWidget$initView$2", "Landroidx/viewpager/widget/ViewPager$SimpleOnPageChangeListener;", "onPageSelected", "", ViewProps.POSITION, "", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C11569a extends ViewPager.SimpleOnPageChangeListener {
        public C11569a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int position) {
            CopyTradingWidget.this.m20973s3(position);
        }
    }

    /* JADX INFO: renamed from: r3 */
    public static final Unit m20965r3(CopyTradingWidgetEntity copyTradingWidgetEntity, CopyTradingWidget copyTradingWidget) {
        if (TextUtils.isEmpty(copyTradingWidgetEntity != null ? copyTradingWidgetEntity.getLeadConfigId() : null)) {
            CopyTradingConfig.f19710a.m20588B("copyHome");
        } else {
            CopyTradingConfig.f19710a.m20591F(C27041f.m66668h(copyTradingWidgetEntity != null ? copyTradingWidgetEntity.getLeadConfigId() : null));
        }
        copyTradingWidget.m20969A3(copyTradingWidgetEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u3 */
    public static final void m20966u3(CopyTradingWidget copyTradingWidget, BGABanner bGABanner, View itemView, CopyTradingWidgetEntity copyTradingWidgetEntity, int i11) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        copyTradingWidget.m20972q3(itemView, copyTradingWidgetEntity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w3 */
    public final void m20967w3(List<CopyTradingWidgetEntity> list) {
        C43432a c43432aM20974t3 = m20974t3();
        if (c43432aM20974t3 == null) {
            return;
        }
        m20977y3(false);
        if (!list.isEmpty()) {
            this.f19966Y = list;
            this.f19967Z = null;
            c43432aM20974t3.f95885b.setData(R$layout.bcopytrading_user_home_widget_item, list, (List<String>) null);
            Integer numValueOf = Integer.valueOf(c43432aM20974t3.f95885b.getCurrentItem());
            Integer num = numValueOf.intValue() >= 0 ? numValueOf : null;
            m20973s3(num != null ? num.intValue() : 0);
            return;
        }
        List<CopyTradingWidgetEntity> listListOf = CollectionsKt.listOf(new CopyTradingWidgetEntity(getString(R$string.copy_trading_widget_default_name), null, null, CollectionsKt.listOf((Object[]) new BigDecimal[]{new BigDecimal("-15.3693906218"), new BigDecimal("49.5372737582"), new BigDecimal("83.0986869682"), new BigDecimal("118.1875956482"), new BigDecimal("212.3913743882"), new BigDecimal("212.3913743882"), new BigDecimal("258.6611075282"), new BigDecimal("258.6611075282"), new BigDecimal("256.4814841882"), new BigDecimal("263.6896027382"), new BigDecimal("244.4415275482"), new BigDecimal("294.4409134782"), new BigDecimal("297.5206384782")}), null, null, Boolean.FALSE, 54, null));
        this.f19966Y = listListOf;
        this.f19967Z = null;
        c43432aM20974t3.f95885b.setData(R$layout.bcopytrading_user_home_widget_item, listListOf, (List<String>) null);
        Integer numValueOf2 = Integer.valueOf(c43432aM20974t3.f95885b.getCurrentItem());
        Integer num2 = numValueOf2.intValue() >= 0 ? numValueOf2 : null;
        m20973s3(num2 != null ? num2.intValue() : 0);
    }

    /* JADX INFO: renamed from: z3 */
    public static final Unit m20968z3(C43432a c43432a, CopyTradingWidget copyTradingWidget) {
        c43432a.f95888e.setLoading(true);
        copyTradingWidget.sendIntent(new CopyTradingContract$UiIntent.LoadData(false, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A3 */
    public final void m20969A3(CopyTradingWidgetEntity copyTradingWidgetEntity) {
        C43852m.m96590b(this.f19968a0, this.f19969b0, this.f19970c0, TuplesKt.m90091to("contentID", String.valueOf(copyTradingWidgetEntity != null ? copyTradingWidgetEntity.getLeadConfigId() : null)));
    }

    /* JADX INFO: renamed from: B3 */
    public final void m20970B3(CopyTradingWidgetEntity copyTradingWidgetEntity) {
        C43852m.m96594f(this.f19968a0, this.f19969b0, this.f19970c0, TuplesKt.m90091to("contentID", String.valueOf(copyTradingWidgetEntity != null ? copyTradingWidgetEntity.getLeadConfigId() : null)));
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    public void dispatchSingleEvent(@NotNull InterfaceC36952a singleEvent) {
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
        super.dispatchSingleEvent(singleEvent);
        if (singleEvent instanceof C11572a) {
            m20977y3(true);
        }
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseCardFragmentV2
    public int getLayout() {
        return R$layout.bcopytrading_user_home_widget;
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    @NotNull
    public KClass<CopyTradingWidgetVM> getVmClass() {
        return Reflection.getOrCreateKotlinClass(CopyTradingWidgetVM.class);
    }

    /* JADX INFO: renamed from: q3 */
    public final void m20972q3(View view, final CopyTradingWidgetEntity copyTradingWidgetEntity) {
        int color;
        List<Double> listEmptyList;
        String nickName;
        List<BigDecimal> totalPnlDate;
        C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.copytrading.widgets.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CopyTradingWidget.m20965r3(copyTradingWidgetEntity, this);
            }
        }, 1, null);
        String strSubstring = null;
        if (C27025c.m66566d(copyTradingWidgetEntity != null ? copyTradingWidgetEntity.getDefault() : null)) {
            m20975v3(view, copyTradingWidgetEntity);
        } else {
            m20976x3(view);
        }
        ((TextView) view.findViewById(R$id.nickName)).setText(copyTradingWidgetEntity != null ? copyTradingWidgetEntity.getNickName() : null);
        TrendChartView trendChartView = (TrendChartView) view.findViewById(R$id.chartView);
        boolean zM33189n = DayNightThemeManager.f28592a.m33189n();
        Context context = view.getContext();
        boolean z11 = C27039d.m66656p(copyTradingWidgetEntity != null ? copyTradingWidgetEntity.getThirtyDayPnlRatio() : null).compareTo(BigDecimal.ZERO) >= 0;
        Intrinsics.checkNotNull(context);
        int iM54281f = C22890g.m54281f(context, z11);
        if (zM33189n) {
            color = z11 ? context.getResources().getColor(R$color.primary20) : context.getResources().getColor(R$color.secondary20);
        } else {
            color = z11 ? context.getResources().getColor(R$color.secondary20) : context.getResources().getColor(R$color.primary20);
        }
        ((BaseTextView) view.findViewById(R$id.rate)).setTextColor(iM54281f);
        if (copyTradingWidgetEntity == null || (totalPnlDate = copyTradingWidgetEntity.getTotalPnlDate()) == null) {
            listEmptyList = null;
        } else {
            listEmptyList = new ArrayList<>(CollectionsKt.collectionSizeOrDefault(totalPnlDate, 10));
            Iterator<T> it = totalPnlDate.iterator();
            while (it.hasNext()) {
                listEmptyList.add(Double.valueOf(((BigDecimal) it.next()).doubleValue()));
            }
        }
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        trendChartView.m54911a(listEmptyList, iM54281f, color);
        ImageView imageView = (ImageView) view.findViewById(R$id.image);
        ShapeTextView shapeTextView = (ShapeTextView) view.findViewById(R$id.tvAvatar);
        Drawable drawableM66510d = C27017c.m66510d(C27017c.f54310a, R$drawable.bcopytrading_ic_default_avtor, null, 2, null);
        if (!TextUtils.isEmpty(copyTradingWidgetEntity != null ? copyTradingWidgetEntity.getAvatarUrl() : null)) {
            Intrinsics.checkNotNull(shapeTextView);
            ViewExtKt.m66577h(shapeTextView);
            Intrinsics.checkNotNull(imageView);
            ViewExtKt.m66594y(imageView);
            C46341d c46341dM102152b = C46338a.m102152b(imageView);
            Intrinsics.checkNotNullExpressionValue(c46341dM102152b, "with(...)");
            Intrinsics.checkNotNull(C24275u.m58535a(c46341dM102152b, C27041f.m66668h(copyTradingWidgetEntity != null ? copyTradingWidgetEntity.getAvatarUrl() : null)).m102188U0().mo92190c0(drawableM66510d).mo92210n(drawableM66510d).m6594E0(imageView));
            return;
        }
        Intrinsics.checkNotNull(imageView);
        ViewExtKt.m66577h(imageView);
        Intrinsics.checkNotNull(shapeTextView);
        ViewExtKt.m66594y(shapeTextView);
        C42025b shapeDrawableBuilder = shapeTextView.getShapeDrawableBuilder();
        shapeDrawableBuilder.m92152n(ContextCompat.getColor(context, R$color.c_cover12));
        shapeDrawableBuilder.m92153o(C5275i0.m6236a(1.0f));
        shapeDrawableBuilder.m92149k(C5275i0.m6236a(24.0f));
        shapeDrawableBuilder.m92143e();
        if (copyTradingWidgetEntity != null && (nickName = copyTradingWidgetEntity.getNickName()) != null) {
            if (nickName.length() <= 0) {
                nickName = null;
            }
            if (nickName != null) {
                if (nickName.length() >= 2) {
                    strSubstring = nickName.substring(0, 2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                } else {
                    strSubstring = nickName;
                }
            }
        }
        if (strSubstring == null) {
            strSubstring = "";
        }
        shapeTextView.setText(strSubstring);
    }

    /* JADX INFO: renamed from: s3 */
    public final void m20973s3(int i11) {
        CopyTradingWidgetEntity copyTradingWidgetEntity = (CopyTradingWidgetEntity) CollectionsKt.getOrNull(this.f19966Y, i11);
        if (copyTradingWidgetEntity == null) {
            return;
        }
        String leadConfigId = copyTradingWidgetEntity.getLeadConfigId();
        if (Intrinsics.areEqual(this.f19967Z, leadConfigId)) {
            return;
        }
        this.f19967Z = leadConfigId;
        m20970B3(copyTradingWidgetEntity);
    }

    /* JADX INFO: renamed from: t3 */
    public final C43432a m20974t3() {
        return (C43432a) this.f19965X.getValue(this, f19964d0[0]);
    }

    /* JADX INFO: renamed from: v3 */
    public final void m20975v3(View view, CopyTradingWidgetEntity copyTradingWidgetEntity) {
        BigDecimal thirtyDayPnlRatio;
        int i11 = R$id.rate;
        ((BaseTextView) view.findViewById(i11)).setText(C42180b.m92649n((copyTradingWidgetEntity == null || (thirtyDayPnlRatio = copyTradingWidgetEntity.getThirtyDayPnlRatio()) == null) ? null : C42180b.m92642g(thirtyDayPnlRatio, null, null, 0, true, false, true, 23, null)));
        View viewFindViewById = view.findViewById(i11);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ViewExtKt.m66594y(viewFindViewById);
        View viewFindViewById2 = view.findViewById(R$id.rateLabel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        ViewExtKt.m66594y(viewFindViewById2);
        View viewFindViewById3 = view.findViewById(R$id.rateStub);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        C27046k.m66703r(viewFindViewById3);
        View viewFindViewById4 = view.findViewById(R$id.rateLabelStub);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        C27046k.m66703r(viewFindViewById4);
    }

    /* JADX INFO: renamed from: x3 */
    public final void m20976x3(View view) {
        View viewFindViewById = view.findViewById(R$id.rate);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        C27046k.m66703r(viewFindViewById);
        View viewFindViewById2 = view.findViewById(R$id.rateLabel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        C27046k.m66703r(viewFindViewById2);
        View viewFindViewById3 = view.findViewById(R$id.rateStub);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        ViewExtKt.m66594y(viewFindViewById3);
        View viewFindViewById4 = view.findViewById(R$id.rateLabelStub);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        ViewExtKt.m66594y(viewFindViewById4);
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    public void bindFlowEvent() {
        super.bindFlowEvent();
        if (C12573b.f21598a.m23696a()) {
            "com.kubi.home.event.HomeEvent:pullRefresh".length();
        }
        C12572a.m23692a(this, false, new CopyTradingWidget$bindFlowEvent$$inlined$bindFlowEvent$default$1("com.kubi.home.event.HomeEvent:pullRefresh", null, this));
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    /* JADX INFO: renamed from: i3 */
    public void mo20971i3() {
        super.mo20971i3();
        bindState(new PropertyReference1Impl() { // from class: com.kubi.copytrading.widgets.CopyTradingWidget$bindUIState$1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getData();
            }
        }, new CopyTradingWidget$bindUIState$2(this, null));
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    public void initView() {
        super.initView();
        C43432a c43432aM20974t3 = m20974t3();
        if (c43432aM20974t3 == null) {
            return;
        }
        c43432aM20974t3.f95885b.setAdapter(new BGABanner.InterfaceC22979b() { // from class: com.kubi.copytrading.widgets.b
            @Override // com.kubi.resources.widget.bingoogolapple.bgabanner.BGABanner.InterfaceC22979b
            /* JADX INFO: renamed from: a */
            public final void mo17775a(BGABanner bGABanner, View view, Object obj, int i11) {
                CopyTradingWidget.m20966u3(this.f19978a, bGABanner, view, (CopyTradingWidgetEntity) obj, i11);
            }
        });
        c43432aM20974t3.f95885b.setOnPageChangeListener(new C11569a());
        c43432aM20974t3.f95887d.m54977e();
        sendIntent(new CopyTradingContract$UiIntent.LoadData(false, 1, null));
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2, com.kubi.kucoin.home.p090v2.cards.BaseCardFragmentV2
    public void onShow() {
        super.onShow();
        sendIntent(new CopyTradingContract$UiIntent.LoadData(true));
    }

    /* JADX INFO: renamed from: y3 */
    public final void m20977y3(boolean z11) {
        final C43432a c43432aM20974t3 = m20974t3();
        if (c43432aM20974t3 == null) {
            return;
        }
        c43432aM20974t3.f95887d.m54976c();
        c43432aM20974t3.f95888e.setLoading(false);
        if (z11) {
            BGABanner banner = c43432aM20974t3.f95885b;
            Intrinsics.checkNotNullExpressionValue(banner, "banner");
            C27046k.m66703r(banner);
            ReloadRefreshView reloadView = c43432aM20974t3.f95888e;
            Intrinsics.checkNotNullExpressionValue(reloadView, "reloadView");
            C27046k.m66685H(reloadView);
            ReloadRefreshView reloadView2 = c43432aM20974t3.f95888e;
            Intrinsics.checkNotNullExpressionValue(reloadView2, "reloadView");
            C27046k.m66711z(reloadView2, 0L, new Function0() { // from class: com.kubi.copytrading.widgets.c
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CopyTradingWidget.m20968z3(c43432aM20974t3, this);
                }
            }, 1, null);
            return;
        }
        BGABanner banner2 = c43432aM20974t3.f95885b;
        Intrinsics.checkNotNullExpressionValue(banner2, "banner");
        C27046k.m66685H(banner2);
        ReloadRefreshView reloadView3 = c43432aM20974t3.f95888e;
        Intrinsics.checkNotNullExpressionValue(reloadView3, "reloadView");
        C27046k.m66700o(reloadView3);
    }
}
