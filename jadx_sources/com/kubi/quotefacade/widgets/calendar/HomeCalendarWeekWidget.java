package com.kubi.quotefacade.widgets.calendar;

import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bv.C4658c1;
import com.blankj.utilcode.util.C5303w0;
import com.google.android.material.card.MaterialCardView;
import com.kubi.quotefacade.R$drawable;
import com.kubi.quotefacade.R$layout;
import com.kubi.quotefacade.widgets.calendar.entity.HomeCalendarEventDataWrapper;
import com.kubi.quotefacade.widgets.calendar.entity.HomeCalendarEventEntity;
import com.kubi.resources.C22912t;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import io.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import tv.C45075b;
import w00.C45681e;

/* JADX INFO: compiled from: HomeCalendarWeekWidget.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\u0018\u0010\u0017\u001a\u00020\u00152\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019H\u0016J\b\u0010\u001b\u001a\u00020\u0015H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarWeekWidget;", "Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarBaseWidget;", "<init>", "()V", "binding", "Lcom/kubi/quotefacade/databinding/WidgetHomeCalendarWeekBinding;", "getBinding$QuoteFacadeLib_googleRelease", "()Lcom/kubi/quotefacade/databinding/WidgetHomeCalendarWeekBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "curDayListAdapter", "Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;", "Lcom/kubi/quotefacade/widgets/calendar/entity/HomeCalendarEventDataWrapper;", "Lio/chad/library/adapter/base/BaseViewHolder;", "curWeekListAdapter", "curWeekAdapter", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/quotefacade/widgets/calendar/entity/HomeCalendarWeekItemWrapper;", "getLayout", "", "initView", "", "onPullRefresh", "onEventDataUpdate", "dataList", "", "Lcom/kubi/quotefacade/widgets/calendar/entity/HomeCalendarEventEntity;", "updateShowDate", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHomeCalendarWeekWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeCalendarWeekWidget.kt\ncom/kubi/quotefacade/widgets/calendar/HomeCalendarWeekWidget\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,118:1\n147#2,16:119\n1#3:135\n*S KotlinDebug\n*F\n+ 1 HomeCalendarWeekWidget.kt\ncom/kubi/quotefacade/widgets/calendar/HomeCalendarWeekWidget\n*L\n28#1:119,16\n*E\n"})
public class HomeCalendarWeekWidget extends HomeCalendarBaseWidget {

    /* JADX INFO: renamed from: c0 */
    public static final /* synthetic */ KProperty<Object>[] f42778c0 = {Reflection.property1(new PropertyReference1Impl(HomeCalendarWeekWidget.class, "binding", "getBinding$QuoteFacadeLib_googleRelease()Lcom/kubi/quotefacade/databinding/WidgetHomeCalendarWeekBinding;", 0))};

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final InterfaceC24293a f42779Y = C45681e.m100799e(this, new Function1<HomeCalendarWeekWidget, C4658c1>() { // from class: com.kubi.quotefacade.widgets.calendar.HomeCalendarWeekWidget$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C4658c1 invoke(@NotNull HomeCalendarWeekWidget fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C4658c1.m4628a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C4658c1, Unit>() { // from class: com.kubi.quotefacade.widgets.calendar.HomeCalendarWeekWidget$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C4658c1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4658c1 c4658c1) {
            invoke(c4658c1);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: Z */
    @Nullable
    public BaseMultiItemQuickAdapter<HomeCalendarEventDataWrapper, BaseViewHolder> f42780Z;

    /* JADX INFO: renamed from: a0 */
    @Nullable
    public BaseMultiItemQuickAdapter<HomeCalendarEventDataWrapper, BaseViewHolder> f42781a0;

    /* JADX INFO: renamed from: b0 */
    @Nullable
    public BaseQuickAdapter<C45075b, BaseViewHolder> f42782b0;

    @Nullable
    /* JADX INFO: renamed from: K3 */
    public final C4658c1 m53384K3() {
        return (C4658c1) this.f42779Y.getValue(this, f42778c0[0]);
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseCardFragmentV2
    public int getLayout() {
        return R$layout.widget_home_calendar_week;
    }

    @Override // com.kubi.quotefacade.widgets.calendar.HomeCalendarBaseWidget
    public void onEventDataUpdate(@Nullable List<HomeCalendarEventEntity> dataList) {
        BaseMultiItemQuickAdapter<HomeCalendarEventDataWrapper, BaseViewHolder> baseMultiItemQuickAdapter = this.f42780Z;
        C22622n.m53434e(baseMultiItemQuickAdapter != null ? baseMultiItemQuickAdapter.getData() : null);
        BaseMultiItemQuickAdapter<HomeCalendarEventDataWrapper, BaseViewHolder> baseMultiItemQuickAdapter2 = this.f42780Z;
        if (baseMultiItemQuickAdapter2 != null) {
            baseMultiItemQuickAdapter2.replaceData(C22619k.m53417p(dataList, true, 4));
        }
        BaseMultiItemQuickAdapter<HomeCalendarEventDataWrapper, BaseViewHolder> baseMultiItemQuickAdapter3 = this.f42781a0;
        C22622n.m53434e(baseMultiItemQuickAdapter3 != null ? baseMultiItemQuickAdapter3.getData() : null);
        BaseMultiItemQuickAdapter<HomeCalendarEventDataWrapper, BaseViewHolder> baseMultiItemQuickAdapter4 = this.f42781a0;
        if (baseMultiItemQuickAdapter4 != null) {
            baseMultiItemQuickAdapter4.replaceData(C22619k.m53427z(dataList, 0, 2, null));
        }
        BaseQuickAdapter<C45075b, BaseViewHolder> baseQuickAdapter = this.f42782b0;
        if (baseQuickAdapter != null) {
            baseQuickAdapter.replaceData(C22619k.m53407f(dataList));
        }
    }

    /* JADX INFO: renamed from: L3 */
    private final void m53383L3() {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        C4658c1 c4658c1M53384K3 = m53384K3();
        MaterialCardView materialCardViewM4629b = null;
        if (c4658c1M53384K3 != null) {
            baseTextView = c4658c1M53384K3.f4259e;
        } else {
            baseTextView = null;
        }
        C4658c1 c4658c1M53384K4 = m53384K3();
        if (c4658c1M53384K4 != null) {
            baseTextView2 = c4658c1M53384K4.f4260f;
        } else {
            baseTextView2 = null;
        }
        C4658c1 c4658c1M53384K5 = m53384K3();
        if (c4658c1M53384K5 != null) {
            materialCardViewM4629b = c4658c1M53384K5.getRoot();
        }
        C22619k.m53403b(baseTextView, baseTextView2, materialCardViewM4629b, true);
    }

    @Override // com.kubi.quotefacade.widgets.calendar.HomeCalendarBaseWidget
    /* JADX INFO: renamed from: J3 */
    public void mo53371J3() {
        super.mo53371J3();
        m53383L3();
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    public void initView() {
        C4658c1 c4658c1M53384K3;
        View view;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        super.initView();
        m53383L3();
        C4658c1 c4658c1M53384K4 = m53384K3();
        if (c4658c1M53384K4 != null && (recyclerView3 = c4658c1M53384K4.f4256b) != null) {
            C22912t.m54409g(recyclerView3, false);
            recyclerView3.setLayoutManager(new LinearLayoutManager(getContext()));
            BaseMultiItemQuickAdapter<HomeCalendarEventDataWrapper, BaseViewHolder> baseMultiItemQuickAdapterM53369F3 = m53369F3();
            this.f42780Z = baseMultiItemQuickAdapterM53369F3;
            recyclerView3.setAdapter(baseMultiItemQuickAdapterM53369F3);
        }
        C4658c1 c4658c1M53384K5 = m53384K3();
        if (c4658c1M53384K5 != null && (recyclerView2 = c4658c1M53384K5.f4257c) != null) {
            C22912t.m54409g(recyclerView2, false);
            recyclerView2.setLayoutManager(new LinearLayoutManager(getContext()));
            BaseMultiItemQuickAdapter<HomeCalendarEventDataWrapper, BaseViewHolder> baseMultiItemQuickAdapterM53369F4 = m53369F3();
            this.f42781a0 = baseMultiItemQuickAdapterM53369F4;
            recyclerView2.setAdapter(baseMultiItemQuickAdapterM53369F4);
        }
        C4658c1 c4658c1M53384K6 = m53384K3();
        if (c4658c1M53384K6 != null && (recyclerView = c4658c1M53384K6.f4258d) != null) {
            C22912t.m54409g(recyclerView, false);
            recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 7));
            HomeCalendarWeekWidget$initView$3$1 homeCalendarWeekWidget$initView$3$1 = new HomeCalendarWeekWidget$initView$3$1(R$layout.item_home_calendar_week, C22619k.m53408g(null, 1, null));
            this.f42782b0 = homeCalendarWeekWidget$initView$3$1;
            recyclerView.setAdapter(homeCalendarWeekWidget$initView$3$1);
        }
        C22622n.m53431b(true, String.valueOf(hashCode()));
        if (C5303w0.m6511a() && (c4658c1M53384K3 = m53384K3()) != null && (view = c4658c1M53384K3.f4262h) != null) {
            view.setBackgroundResource(R$drawable.home_calendar_week_day_rtl_bg_gradient);
        }
    }
}
