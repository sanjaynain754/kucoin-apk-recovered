package com.kubi.home.widgets.banner.full;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.viewpager.widget.ViewPager;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.home.R$color;
import com.kubi.home.R$font;
import com.kubi.home.R$id;
import com.kubi.home.R$layout;
import com.kubi.home.R$mipmap;
import com.kubi.home.api.HomeWidgetCode;
import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.kubi.home.entity.WidgetBannerEntity;
import com.kubi.home.v2.container.p088ui.view.HomeBannerView;
import com.kubi.home.widgets.banner.BannerWidgetContract$UiIntent;
import com.kubi.home.widgets.banner.BannerWidgetVM;
import com.kubi.home.widgets.banner.C15097g;
import com.kubi.home.widgets.banner.UIState;
import com.kubi.kucoin.home.p090v2.cards.SimpleStateCardV2;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.C22912t;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ReloadRefreshView;
import com.kubi.resources.widget.bingoogolapple.bgabanner.BGABanner;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.util.C24275u;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27023a;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import fj.C37557z;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p208dr.InterfaceC36952a;
import p569qq.C43841b;
import p778xy.C46338a;
import p778xy.C46341d;
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

/* JADX INFO: compiled from: BannerFullWidget.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010\u0014\u001a\u00020\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0017\u001a\u00020\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0015H\u0016J\b\u0010\u0019\u001a\u00020\u0015H\u0016J\b\u0010\u001a\u001a\u00020\u0015H\u0016J\b\u0010\u001b\u001a\u00020\u0015H\u0016J\b\u0010\u001c\u001a\u00020\u0015H\u0014J\b\u0010\u001d\u001a\u00020\u0015H\u0014J\u0010\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020 H\u0014J\u0010\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u0013H\u0002J\u0016\u0010#\u001a\u00020\u00152\f\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%H\u0002J\"\u0010'\u001a\u00020\u00152\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010&2\u0006\u0010+\u001a\u00020\u000bH\u0002R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001d\u0010\f\u001a\u0004\u0018\u00010\r8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, m90084d2 = {"Lcom/kubi/home/widgets/banner/full/BannerFullWidget;", "Lcom/kubi/kucoin/home/v2/cards/SimpleStateCardV2;", "Lcom/kubi/home/widgets/banner/BannerWidgetContract$UIState;", "<init>", "()V", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/home/widgets/banner/BannerWidgetVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "getLayout", "", "binding", "Lcom/kubi/home/databinding/HomeWidgetBannerBinding;", "getBinding$HomeLib_googleRelease", "()Lcom/kubi/home/databinding/HomeWidgetBannerBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "isHomeDragMode", "", "initView", "", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "onMoveStart", "onMoveStop", "onEnterDragMode", "onExitDragMode", "bindFlowEvent", "bindUIState", "dispatchSingleEvent", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", "showContentOrReload", "showReload", "fillViewData", "dataList", "", "Lcom/kubi/home/entity/WidgetBannerEntity;", "bindItem", "itemView", "Landroid/view/View;", "model", ViewProps.POSITION, "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBannerFullWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BannerFullWidget.kt\ncom/kubi/home/widgets/banner/full/BannerFullWidget\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 4 StateEx.kt\ncom/kubi/mvi/state/StateExKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,202:1\n147#2,16:203\n153#3,7:219\n93#4,4:226\n1#5:230\n*S KotlinDebug\n*F\n+ 1 BannerFullWidget.kt\ncom/kubi/home/widgets/banner/full/BannerFullWidget\n*L\n55#1:203,16\n109#1:219,7\n121#1:226,4\n*E\n"})
public final class BannerFullWidget extends SimpleStateCardV2<UIState> {

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ KProperty<Object>[] f26696Z = {Reflection.property1(new PropertyReference1Impl(BannerFullWidget.class, "binding", "getBinding$HomeLib_googleRelease()Lcom/kubi/home/databinding/HomeWidgetBannerBinding;", 0))};

    /* JADX INFO: renamed from: X */
    @NotNull
    public final InterfaceC24293a f26697X = C45681e.m100799e(this, new Function1<BannerFullWidget, C37557z>() { // from class: com.kubi.home.widgets.banner.full.BannerFullWidget$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37557z invoke(@NotNull BannerFullWidget fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37557z.m84588a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37557z, Unit>() { // from class: com.kubi.home.widgets.banner.full.BannerFullWidget$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37557z it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37557z c37557z) {
            invoke(c37557z);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: Y */
    public boolean f26698Y;

    /* JADX INFO: renamed from: com.kubi.home.widgets.banner.full.BannerFullWidget$a */
    /* JADX INFO: compiled from: BannerFullWidget.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0005H\u0016¨\u0006\f"}, m90084d2 = {"com/kubi/home/widgets/banner/full/BannerFullWidget$fillViewData$1$3", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "onPageScrolled", "", ViewProps.POSITION, "", "positionOffset", "", "positionOffsetPixels", "onPageSelected", "onPageScrollStateChanged", "state", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15090a implements ViewPager.OnPageChangeListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ List<WidgetBannerEntity> f26699b;

        public C15090a(List<WidgetBannerEntity> list) {
            this.f26699b = list;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int position) throws JSONException {
            List<WidgetBannerEntity> list = this.f26699b;
            WidgetBannerEntity widgetBannerEntity = (WidgetBannerEntity) CollectionsKt.getOrNull(list, position % list.size());
            String code = HomeWidgetCode.Banner.getCode();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("norm_version", "1");
            jSONObject.put("url", C27041f.m66668h(widgetBannerEntity != null ? widgetBannerEntity.getUrl() : null));
            jSONObject.put("title", C27041f.m66668h(widgetBannerEntity != null ? widgetBannerEntity.getTitle() : null));
            Unit unit = Unit.INSTANCE;
            C27023a.m66557d(HomeCardViewHolderProxy.PAGE_ID, code, null, jSONObject, 4, null);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int state) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        }
    }

    /* JADX INFO: renamed from: u3 */
    public static final Unit m31116u3(WidgetBannerEntity widgetBannerEntity) throws JSONException {
        RouteExKt.m56217H(widgetBannerEntity != null ? widgetBannerEntity.getUrl() : null);
        String code = HomeWidgetCode.Banner.getCode();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("norm_version", "1");
        jSONObject.put("url", C27041f.m66668h(widgetBannerEntity != null ? widgetBannerEntity.getUrl() : null));
        jSONObject.put("title", C27041f.m66668h(widgetBannerEntity != null ? widgetBannerEntity.getTitle() : null));
        Unit unit = Unit.INSTANCE;
        C27023a.m66555b(HomeCardViewHolderProxy.PAGE_ID, code, null, jSONObject, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B3 */
    public static final Unit m31105B3(C37557z c37557z, BannerFullWidget bannerFullWidget) {
        c37557z.f83511d.setLoading(true);
        bannerFullWidget.sendIntent(new BannerWidgetContract$UiIntent.LoadData(true));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s3 */
    private final void m31114s3(final View view, final WidgetBannerEntity widgetBannerEntity, int i11) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.home.widgets.banner.full.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BannerFullWidget.m31115t3(this.f26703b, widgetBannerEntity, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v3 */
    public final void m31117v3(final List<WidgetBannerEntity> list) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.home.widgets.banner.full.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BannerFullWidget.m31118w3(this.f26701b, list);
            }
        });
    }

    /* JADX INFO: renamed from: y3 */
    public static final void m31119y3(BannerFullWidget bannerFullWidget, BGABanner bGABanner, View itemView, WidgetBannerEntity widgetBannerEntity, int i11) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        bannerFullWidget.m31114s3(itemView, widgetBannerEntity, i11);
    }

    /* JADX INFO: renamed from: z3 */
    private final void m31120z3(final boolean z11) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.home.widgets.banner.full.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BannerFullWidget.m31104A3(this.f26706b, z11);
            }
        });
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    public void dispatchSingleEvent(@NotNull InterfaceC36952a singleEvent) {
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
        super.dispatchSingleEvent(singleEvent);
        if (singleEvent instanceof C15097g) {
            m31120z3(true);
        }
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseCardFragmentV2
    public int getLayout() {
        return R$layout.home_widget_banner_full;
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    @NotNull
    public KClass<BannerWidgetVM> getVmClass() {
        return Reflection.getOrCreateKotlinClass(BannerWidgetVM.class);
    }

    @Nullable
    /* JADX INFO: renamed from: x3 */
    public final C37557z m31121x3() {
        return (C37557z) this.f26697X.getValue(this, f26696Z[0]);
    }

    /* JADX INFO: renamed from: A3 */
    public static final Unit m31104A3(final BannerFullWidget bannerFullWidget, boolean z11) {
        final C37557z c37557zM31121x3 = bannerFullWidget.m31121x3();
        if (c37557zM31121x3 == null) {
            return Unit.INSTANCE;
        }
        c37557zM31121x3.f83511d.setLoading(false);
        if (z11) {
            HomeBannerView banner = c37557zM31121x3.f83509b;
            Intrinsics.checkNotNullExpressionValue(banner, "banner");
            C27046k.m66703r(banner);
            ReloadRefreshView reloadView = c37557zM31121x3.f83511d;
            Intrinsics.checkNotNullExpressionValue(reloadView, "reloadView");
            C27046k.m66685H(reloadView);
            ReloadRefreshView reloadView2 = c37557zM31121x3.f83511d;
            Intrinsics.checkNotNullExpressionValue(reloadView2, "reloadView");
            C27046k.m66711z(reloadView2, 0L, new Function0() { // from class: com.kubi.home.widgets.banner.full.f
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BannerFullWidget.m31105B3(c37557zM31121x3, bannerFullWidget);
                }
            }, 1, null);
        } else {
            HomeBannerView banner2 = c37557zM31121x3.f83509b;
            Intrinsics.checkNotNullExpressionValue(banner2, "banner");
            C27046k.m66685H(banner2);
            ReloadRefreshView reloadView3 = c37557zM31121x3.f83511d;
            Intrinsics.checkNotNullExpressionValue(reloadView3, "reloadView");
            C27046k.m66700o(reloadView3);
        }
        C43841b.m96557d("event_load_home_banner", "page_load_end", null, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t3 */
    public static final Unit m31115t3(BannerFullWidget bannerFullWidget, final WidgetBannerEntity widgetBannerEntity, View view) {
        String displayImageUrl;
        String title;
        if (bannerFullWidget.getView() != null && !bannerFullWidget.isDetached() && !bannerFullWidget.isRemoving()) {
            String subTitle = null;
            if (widgetBannerEntity != null) {
                displayImageUrl = widgetBannerEntity.getDisplayImageUrl(true);
            } else {
                displayImageUrl = null;
            }
            if (Intrinsics.areEqual(view.getTag(), displayImageUrl)) {
                return Unit.INSTANCE;
            }
            view.setTag(displayImageUrl);
            Drawable drawableM66510d = C27017c.m66510d(C27017c.f54310a, R$mipmap.home_widget_banner_placeholder, null, 2, null);
            C46341d c46341dM102151a = C46338a.m102151a(view.getContext());
            Intrinsics.checkNotNullExpressionValue(c46341dM102151a, "with(...)");
            C24275u.m58535a(c46341dM102151a, displayImageUrl).mo92190c0(drawableM66510d).mo92210n(drawableM66510d).m6594E0((ImageView) view.findViewById(R$id.banner_icon));
            BaseTextView baseTextView = (BaseTextView) view.findViewById(R$id.tv_banner_title);
            if (baseTextView != null) {
                if (widgetBannerEntity != null) {
                    title = widgetBannerEntity.getTitle(true);
                } else {
                    title = null;
                }
                baseTextView.setText(title);
                HighlightTextHelper.f43497a.m54116a(baseTextView, HighlightTextHelper.TextTagEnum.SPAN, C22912t.m54408f(R$font.regular, baseTextView.getContext().getColor(R$color.brandGreen)));
            }
            BaseTextView baseTextView2 = (BaseTextView) view.findViewById(R$id.tv_banner_sub_title);
            if (baseTextView2 != null) {
                if (widgetBannerEntity != null) {
                    subTitle = widgetBannerEntity.getSubTitle(true);
                }
                baseTextView2.setText(subTitle);
                HighlightTextHelper.f43497a.m54116a(baseTextView2, HighlightTextHelper.TextTagEnum.SPAN, C22912t.m54408f(R$font.medium, baseTextView2.getContext().getColor(R$color.brandGreen)));
            }
            C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.home.widgets.banner.full.e
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BannerFullWidget.m31116u3(widgetBannerEntity);
                }
            }, 1, null);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w3 */
    public static final Unit m31118w3(BannerFullWidget bannerFullWidget, List list) {
        boolean z11;
        C37557z c37557zM31121x3 = bannerFullWidget.m31121x3();
        if (c37557zM31121x3 == null) {
            return Unit.INSTANCE;
        }
        boolean z12 = false;
        bannerFullWidget.m31120z3(false);
        HomeBannerView homeBannerView = c37557zM31121x3.f83509b;
        if (list.isEmpty()) {
            homeBannerView = null;
        }
        if (homeBannerView != null) {
            if (list.size() > 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            homeBannerView.setAutoPlayAble(z11);
            if (list.size() > 1) {
                z12 = true;
            }
            homeBannerView.setIndicatorVisibility(z12);
            homeBannerView.setData(R$layout.kucoin_item_home_banner_item_full, (List<? extends Object>) list, (List<String>) null);
        }
        c37557zM31121x3.f83509b.setOnPageChangeListener(new C15090a(list));
        C43841b.m96557d("event_load_home_banner", "page_load_end", null, 4, null);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.ICardV2
    /* JADX INFO: renamed from: P */
    public void mo31093P() {
        C37557z c37557zM31121x3;
        HomeBannerView homeBannerView;
        super.mo31093P();
        if (!this.f26698Y && (c37557zM31121x3 = m31121x3()) != null && (homeBannerView = c37557zM31121x3.f83509b) != null) {
            homeBannerView.startAutoPlay();
        }
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.ICardV2
    /* JADX INFO: renamed from: Q */
    public void mo31094Q() {
        HomeBannerView homeBannerView;
        super.mo31094Q();
        C37557z c37557zM31121x3 = m31121x3();
        if (c37557zM31121x3 != null && (homeBannerView = c37557zM31121x3.f83509b) != null) {
            homeBannerView.stopAutoPlay();
        }
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    public void bindFlowEvent() {
        super.bindFlowEvent();
        if (C12573b.f21598a.m23696a()) {
            "com.kubi.home.event.HomeEvent:pullRefresh".length();
        }
        C12572a.m23692a(this, false, new BannerFullWidget$bindFlowEvent$$inlined$bindFlowEvent$default$1("com.kubi.home.event.HomeEvent:pullRefresh", null, this));
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    /* JADX INFO: renamed from: i3 */
    public void mo20971i3() {
        super.mo20971i3();
        bindState(new PropertyReference1Impl() { // from class: com.kubi.home.widgets.banner.full.BannerFullWidget$bindUIState$1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getDataList();
            }
        }, new BannerFullWidget$bindUIState$2(this, null));
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    public void initView() {
        HomeBannerView homeBannerView;
        HomeBannerView homeBannerView2;
        HomeBannerView homeBannerView3;
        super.initView();
        C37557z c37557zM31121x3 = m31121x3();
        if (c37557zM31121x3 != null && (homeBannerView3 = c37557zM31121x3.f83509b) != null) {
            homeBannerView3.setAdapter(new BGABanner.InterfaceC22979b() { // from class: com.kubi.home.widgets.banner.full.a
                @Override // com.kubi.resources.widget.bingoogolapple.bgabanner.BGABanner.InterfaceC22979b
                /* JADX INFO: renamed from: a */
                public final void mo17775a(BGABanner bGABanner, View view, Object obj, int i11) {
                    BannerFullWidget.m31119y3(this.f26700a, bGABanner, view, (WidgetBannerEntity) obj, i11);
                }
            });
        }
        C37557z c37557zM31121x4 = m31121x3();
        if (c37557zM31121x4 != null && (homeBannerView2 = c37557zM31121x4.f83509b) != null) {
            C22912t.m54422t(homeBannerView2, 14);
        }
        C37557z c37557zM31121x5 = m31121x3();
        if (c37557zM31121x5 != null && (homeBannerView = c37557zM31121x5.f83509b) != null) {
            homeBannerView.m30889a();
        }
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.ICardV2
    /* JADX INFO: renamed from: k0 */
    public void mo30080k0() {
        HomeBannerView homeBannerView;
        HomeBannerView homeBannerView2;
        super.mo30080k0();
        if (getView() != null) {
            this.f26698Y = false;
            C37557z c37557zM31121x3 = m31121x3();
            if (c37557zM31121x3 != null && (homeBannerView2 = c37557zM31121x3.f83509b) != null) {
                homeBannerView2.setEnbaleTouchAutoPlay(true);
            }
            C37557z c37557zM31121x4 = m31121x3();
            if (c37557zM31121x4 != null && (homeBannerView = c37557zM31121x4.f83509b) != null) {
                homeBannerView.startAutoPlay();
            }
        }
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2, com.kubi.kucoin.home.p090v2.cards.BaseCardFragmentV2
    public void onHide() {
        HomeBannerView homeBannerView;
        super.onHide();
        C37557z c37557zM31121x3 = m31121x3();
        if (c37557zM31121x3 != null && (homeBannerView = c37557zM31121x3.f83509b) != null) {
            homeBannerView.stopAutoPlay();
        }
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2, com.kubi.kucoin.home.p090v2.cards.BaseCardFragmentV2
    public void onShow() {
        HomeBannerView homeBannerView;
        super.onShow();
        sendIntent(new BannerWidgetContract$UiIntent.LoadData(false, 1, null));
        C37557z c37557zM31121x3 = m31121x3();
        if (c37557zM31121x3 != null && (homeBannerView = c37557zM31121x3.f83509b) != null) {
            homeBannerView.startAutoPlay();
        }
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.ICardV2
    /* JADX INFO: renamed from: r0 */
    public void mo30082r0() {
        HomeBannerView homeBannerView;
        HomeBannerView homeBannerView2;
        super.mo30082r0();
        if (getView() != null) {
            this.f26698Y = true;
            C37557z c37557zM31121x3 = m31121x3();
            if (c37557zM31121x3 != null && (homeBannerView2 = c37557zM31121x3.f83509b) != null) {
                homeBannerView2.setEnbaleTouchAutoPlay(false);
            }
            C37557z c37557zM31121x4 = m31121x3();
            if (c37557zM31121x4 != null && (homeBannerView = c37557zM31121x4.f83509b) != null) {
                homeBannerView.stopAutoPlay();
            }
        }
    }
}
