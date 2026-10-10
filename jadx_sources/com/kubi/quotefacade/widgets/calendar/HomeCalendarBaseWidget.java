package com.kubi.quotefacade.widgets.calendar;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.kucoin.home.p090v2.cards.SimpleStateCardV2;
import com.kubi.mvi.state.AbstractC19291m;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.quotefacade.R$drawable;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.widgets.calendar.entity.HomeCalendarEventDataWrapper;
import com.kubi.quotefacade.widgets.calendar.entity.HomeCalendarEventEntity;
import com.kubi.sdk.util.C24277v;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27046k;
import io.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import tv.C45074a;

/* JADX INFO: compiled from: HomeCalendarBaseWidget.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u000b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH&J\b\u0010\u0014\u001a\u00020\u000bH\u0016J\b\u0010\u0015\u001a\u00020\u000bH\u0014J\b\u0010\u0016\u001a\u00020\u000bH\u0017J\b\u0010\u0017\u001a\u00020\u000bH\u0002J\b\u0010\u0018\u001a\u00020\u000bH\u0014J\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001aJ\u001a\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u000eH\u0002J\u001a\u0010 \u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u000eH\u0002J\u001a\u0010!\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u000eH\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0005\u0010\u0007R\"\u0010\u000f\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00020\u00110\u00108TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\""}, m90084d2 = {"Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarBaseWidget;", "Lcom/kubi/kucoin/home/v2/cards/SimpleStateCardV2;", "Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarWidgetContract$UIState;", "<init>", "()V", "isLargeCard", "", "()Z", "isLargeCard$delegate", "Lkotlin/Lazy;", "onEventDataUpdate", "", "dataList", "", "Lcom/kubi/quotefacade/widgets/calendar/entity/HomeCalendarEventEntity;", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/mvi/state/SingleSimpleStateVM;", "getVmClass", "()Lkotlin/reflect/KClass;", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "bindFlowEvent", "onPullRefresh", "loadData", "bindUIState", "createAdapter", "Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;", "Lcom/kubi/quotefacade/widgets/calendar/entity/HomeCalendarEventDataWrapper;", "Lio/chad/library/adapter/base/BaseViewHolder;", "convertEventItem", "helper", "item", "convertEventData", "convertEmpty", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHomeCalendarBaseWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeCalendarBaseWidget.kt\ncom/kubi/quotefacade/widgets/calendar/HomeCalendarBaseWidget\n+ 2 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n*L\n1#1,145:1\n153#2,7:146\n76#2,7:153\n*S KotlinDebug\n*F\n+ 1 HomeCalendarBaseWidget.kt\ncom/kubi/quotefacade/widgets/calendar/HomeCalendarBaseWidget\n*L\n51#1:146,7\n54#1:153,7\n*E\n"})
public abstract class HomeCalendarBaseWidget extends SimpleStateCardV2<UIState> {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f42770X = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.widgets.calendar.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(HomeCalendarBaseWidget.m53352H3(this.f42786b));
        }
    });

    /* JADX INFO: renamed from: E3 */
    public static final Unit m53351E3(HomeCalendarEventEntity homeCalendarEventEntity, HomeCalendarBaseWidget homeCalendarBaseWidget) throws JSONException {
        C22619k.m53397A(homeCalendarEventEntity != null ? homeCalendarEventEntity.getEventId() : null);
        C22622n.m53435f(homeCalendarBaseWidget.m53370G3(), homeCalendarEventEntity != null ? homeCalendarEventEntity.getTitle() : null, homeCalendarEventEntity != null ? homeCalendarEventEntity.getEventId() : null, homeCalendarEventEntity != null ? homeCalendarEventEntity.getCategoryCode() : null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x3 */
    public static final Unit m53366x3(HomeCalendarBaseWidget homeCalendarBaseWidget) throws JSONException {
        C22619k.m53399C(null, 1, null);
        C22622n.m53436g(homeCalendarBaseWidget.m53370G3(), null, null, null, 14, null);
        return Unit.INSTANCE;
    }

    public abstract void onEventDataUpdate(@Nullable List<HomeCalendarEventEntity> dataList);

    /* JADX INFO: renamed from: A3 */
    public static final Unit m53348A3(HomeCalendarEventEntity homeCalendarEventEntity, HomeCalendarBaseWidget homeCalendarBaseWidget) throws JSONException {
        C22619k.m53398B(homeCalendarEventEntity != null ? homeCalendarEventEntity.getStartTime() : null);
        C22622n.m53436g(homeCalendarBaseWidget.m53370G3(), null, null, null, 14, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D3 */
    public static final Unit m53350D3(BaseViewHolder baseViewHolder, final HomeCalendarEventEntity homeCalendarEventEntity, final HomeCalendarBaseWidget homeCalendarBaseWidget) {
        View itemView = baseViewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.quotefacade.widgets.calendar.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeCalendarBaseWidget.m53351E3(homeCalendarEventEntity, homeCalendarBaseWidget);
            }
        }, 1, null);
        if (homeCalendarEventEntity == null) {
            return Unit.INSTANCE;
        }
        baseViewHolder.setText(R$id.event_name, homeCalendarEventEntity.getEventName());
        baseViewHolder.setText(R$id.event_time, homeCalendarEventEntity.getTimeText());
        ImageView imageView = (ImageView) baseViewHolder.getView(R$id.event_icon);
        if (imageView != null) {
            String icon = homeCalendarEventEntity.getIcon();
            if (icon == null) {
                icon = "";
            }
            C24277v.m58541f(imageView, icon, R$drawable.caleander_default_placeholder);
        }
        C22622n.m53432c(homeCalendarBaseWidget.m53370G3(), homeCalendarEventEntity.getTitle(), homeCalendarEventEntity.getEventId(), homeCalendarEventEntity.getCategoryCode());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H3 */
    public static final boolean m53352H3(HomeCalendarBaseWidget homeCalendarBaseWidget) {
        return homeCalendarBaseWidget instanceof HomeCalendarWeekWidget;
    }

    /* JADX INFO: renamed from: w3 */
    public static final Unit m53365w3(BaseViewHolder baseViewHolder, final HomeCalendarBaseWidget homeCalendarBaseWidget) {
        View itemView = baseViewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.quotefacade.widgets.calendar.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeCalendarBaseWidget.m53366x3(this.f42796b);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z3 */
    public static final Unit m53367z3(BaseViewHolder baseViewHolder, final HomeCalendarEventEntity homeCalendarEventEntity, final HomeCalendarBaseWidget homeCalendarBaseWidget) {
        View itemView = baseViewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.quotefacade.widgets.calendar.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeCalendarBaseWidget.m53348A3(homeCalendarEventEntity, homeCalendarBaseWidget);
            }
        }, 1, null);
        if (homeCalendarEventEntity == null) {
            return Unit.INSTANCE;
        }
        baseViewHolder.setText(R$id.event_date, homeCalendarEventEntity.getDateText());
        baseViewHolder.setText(R$id.event_month, homeCalendarEventEntity.getMonthText());
        View itemView2 = baseViewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
        C27046k.m66711z(itemView2, 0L, new Function0() { // from class: com.kubi.quotefacade.widgets.calendar.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeCalendarBaseWidget.m53349B3(homeCalendarEventEntity);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C3 */
    public final void m53368C3(final BaseViewHolder baseViewHolder, final HomeCalendarEventEntity homeCalendarEventEntity) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.widgets.calendar.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeCalendarBaseWidget.m53350D3(baseViewHolder, homeCalendarEventEntity, this);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: F3 */
    public final BaseMultiItemQuickAdapter<HomeCalendarEventDataWrapper, BaseViewHolder> m53369F3() {
        final ArrayList arrayList = new ArrayList();
        return new BaseMultiItemQuickAdapter<HomeCalendarEventDataWrapper, BaseViewHolder>(arrayList) { // from class: com.kubi.quotefacade.widgets.calendar.HomeCalendarBaseWidget$createAdapter$1
            {
                setHasStableIds(true);
                for (Map.Entry<Integer, Integer> entry : C45074a.m99673a().entrySet()) {
                    addItemType(entry.getKey().intValue(), entry.getValue().intValue());
                }
            }

            @Override // io.chad.library.adapter.base.BaseQuickAdapter
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public void convert(BaseViewHolder baseViewHolder, HomeCalendarEventDataWrapper homeCalendarEventDataWrapper) {
                if (baseViewHolder == null || homeCalendarEventDataWrapper == null || !C45074a.m99673a().containsKey(Integer.valueOf(homeCalendarEventDataWrapper.getF38450c()))) {
                    return;
                }
                int f38450c = homeCalendarEventDataWrapper.getF38450c();
                if (f38450c == 1) {
                    this.f42771i.m53368C3(baseViewHolder, homeCalendarEventDataWrapper.getF42795c());
                    return;
                }
                if (f38450c == 2) {
                    this.f42771i.m53373y3(baseViewHolder, homeCalendarEventDataWrapper.getF42795c());
                } else if (f38450c == 3 || f38450c == 4) {
                    this.f42771i.m53372v3(baseViewHolder, homeCalendarEventDataWrapper.getF42795c());
                }
            }
        };
    }

    /* JADX INFO: renamed from: G3 */
    public final boolean m53370G3() {
        return ((Boolean) this.f42770X.getValue()).booleanValue();
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    @NotNull
    public KClass<? extends AbstractC19291m<UIState>> getVmClass() {
        return Reflection.getOrCreateKotlinClass(HomeCalendarWidgetVM.class);
    }

    /* JADX INFO: renamed from: v3 */
    public final void m53372v3(final BaseViewHolder baseViewHolder, HomeCalendarEventEntity homeCalendarEventEntity) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.widgets.calendar.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeCalendarBaseWidget.m53365w3(baseViewHolder, this);
            }
        });
    }

    /* JADX INFO: renamed from: y3 */
    public final void m53373y3(final BaseViewHolder baseViewHolder, final HomeCalendarEventEntity homeCalendarEventEntity) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.widgets.calendar.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeCalendarBaseWidget.m53367z3(baseViewHolder, homeCalendarEventEntity, this);
            }
        });
    }

    /* JADX INFO: renamed from: B3 */
    public static final Unit m53349B3(HomeCalendarEventEntity homeCalendarEventEntity) {
        C22619k.m53398B(homeCalendarEventEntity.getStartTime());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I3 */
    private final void m53353I3() {
        long jM53409h = C22619k.m53409h();
        sendIntent(new HomeCalendarWidgetContract$UiIntent.LoadData(jM53409h, ((long) 1814400) + jM53409h));
    }

    @CallSuper
    /* JADX INFO: renamed from: J3 */
    public void mo53371J3() {
        m53353I3();
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    public void bindFlowEvent() {
        super.bindFlowEvent();
        C12573b c12573b = C12573b.f21598a;
        if (c12573b.m23696a()) {
            "com.kubi.home.event.HomeEvent:pullRefresh".length();
        }
        C12572a.m23692a(this, false, new C22604x7e26c603("com.kubi.home.event.HomeEvent:pullRefresh", null, this));
        if (c12573b.m23696a()) {
            "com.kubi.home.feed.QuoteEvent:home_calendar_visible_change".length();
        }
        C12572a.m23692a(this, false, new C22605x7e26c604("com.kubi.home.feed.QuoteEvent:home_calendar_visible_change", null));
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    /* JADX INFO: renamed from: i3 */
    public void mo20971i3() {
        super.mo20971i3();
        bindState(new PropertyReference1Impl() { // from class: com.kubi.quotefacade.widgets.calendar.HomeCalendarBaseWidget$bindUIState$1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getDataList();
            }
        }, new HomeCalendarBaseWidget$bindUIState$2(this, null));
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2, com.kubi.kucoin.home.p090v2.cards.BaseCardFragmentV2
    public void onShow() {
        super.onShow();
        m53353I3();
    }
}
