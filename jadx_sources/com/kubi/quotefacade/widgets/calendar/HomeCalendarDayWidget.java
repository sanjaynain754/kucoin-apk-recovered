package com.kubi.quotefacade.widgets.calendar;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bv.C4655b1;
import com.google.android.material.card.MaterialCardView;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.R$layout;
import com.kubi.quotefacade.widgets.calendar.entity.HomeCalendarEventDataWrapper;
import com.kubi.quotefacade.widgets.calendar.entity.HomeCalendarEventEntity;
import com.kubi.resources.C22912t;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27046k;
import io.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: HomeCalendarDayWidget.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0014J\b\u0010\u0010\u001a\u00020\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\u0018\u0010\u0013\u001a\u00020\u00112\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015H\u0016J\b\u0010\u0017\u001a\u00020\u0011H\u0002J\b\u0010\u0018\u001a\u00020\u0011H\u0002J\b\u0010\u0019\u001a\u00020\u0011H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarDayWidget;", "Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarBaseWidget;", "<init>", "()V", "binding", "Lcom/kubi/quotefacade/databinding/WidgetHomeCalendarDayBinding;", "getBinding$QuoteFacadeLib_googleRelease", "()Lcom/kubi/quotefacade/databinding/WidgetHomeCalendarDayBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "listAdapter", "Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;", "Lcom/kubi/quotefacade/widgets/calendar/entity/HomeCalendarEventDataWrapper;", "Lio/chad/library/adapter/base/BaseViewHolder;", "getLayout", "", "initView", "", "onPullRefresh", "onEventDataUpdate", "dataList", "", "Lcom/kubi/quotefacade/widgets/calendar/entity/HomeCalendarEventEntity;", "updateShowDate", "hideLoading", "showNewTag", "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHomeCalendarDayWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeCalendarDayWidget.kt\ncom/kubi/quotefacade/widgets/calendar/HomeCalendarDayWidget\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,87:1\n147#2,16:88\n1#3:104\n*S KotlinDebug\n*F\n+ 1 HomeCalendarDayWidget.kt\ncom/kubi/quotefacade/widgets/calendar/HomeCalendarDayWidget\n*L\n27#1:88,16\n*E\n"})
public final class HomeCalendarDayWidget extends HomeCalendarBaseWidget {

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final InterfaceC24293a f42774Y = C45681e.m100799e(this, new Function1<HomeCalendarDayWidget, C4655b1>() { // from class: com.kubi.quotefacade.widgets.calendar.HomeCalendarDayWidget$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C4655b1 invoke(@NotNull HomeCalendarDayWidget fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C4655b1.m4622a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C4655b1, Unit>() { // from class: com.kubi.quotefacade.widgets.calendar.HomeCalendarDayWidget$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C4655b1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4655b1 c4655b1) {
            invoke(c4655b1);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: Z */
    @Nullable
    public BaseMultiItemQuickAdapter<HomeCalendarEventDataWrapper, BaseViewHolder> f42775Z;

    /* JADX INFO: renamed from: b0 */
    public static final /* synthetic */ KProperty<Object>[] f42773b0 = {Reflection.property1(new PropertyReference1Impl(HomeCalendarDayWidget.class, "binding", "getBinding$QuoteFacadeLib_googleRelease()Lcom/kubi/quotefacade/databinding/WidgetHomeCalendarDayBinding;", 0))};

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public static final Companion f42772a0 = new Companion(null);

    /* JADX INFO: compiled from: HomeCalendarDayWidget.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarDayWidget$Companion;", "", "<init>", "()V", "TAG", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Nullable
    /* JADX INFO: renamed from: K3 */
    public final C4655b1 m53376K3() {
        return (C4655b1) this.f42774Y.getValue(this, f42773b0[0]);
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseCardFragmentV2
    public int getLayout() {
        return R$layout.widget_home_calendar_day;
    }

    @Override // com.kubi.quotefacade.widgets.calendar.HomeCalendarBaseWidget
    public void onEventDataUpdate(@Nullable List<HomeCalendarEventEntity> dataList) {
        BaseMultiItemQuickAdapter<HomeCalendarEventDataWrapper, BaseViewHolder> baseMultiItemQuickAdapter = this.f42775Z;
        C22622n.m53434e(baseMultiItemQuickAdapter != null ? baseMultiItemQuickAdapter.getData() : null);
        BaseMultiItemQuickAdapter<HomeCalendarEventDataWrapper, BaseViewHolder> baseMultiItemQuickAdapter2 = this.f42775Z;
        if (baseMultiItemQuickAdapter2 != null) {
            baseMultiItemQuickAdapter2.replaceData(C22619k.m53418q(dataList, false, 0, 6, null));
        }
        m53375L3();
    }

    /* JADX INFO: renamed from: L3 */
    private final void m53375L3() {
        ImageView imageView;
        Group group;
        ImageView imageView2;
        C4655b1 c4655b1M53376K3 = m53376K3();
        if (c4655b1M53376K3 != null && (imageView = c4655b1M53376K3.f4235c) != null && imageView.getVisibility() == 0) {
            C4655b1 c4655b1M53376K4 = m53376K3();
            if (c4655b1M53376K4 != null && (imageView2 = c4655b1M53376K4.f4235c) != null) {
                C27046k.m66700o(imageView2);
            }
            C4655b1 c4655b1M53376K5 = m53376K3();
            if (c4655b1M53376K5 != null && (group = c4655b1M53376K5.f4241i) != null) {
                C27046k.m66685H(group);
            }
            m53377M3();
        }
    }

    @Override // com.kubi.quotefacade.widgets.calendar.HomeCalendarBaseWidget
    /* JADX INFO: renamed from: J3 */
    public void mo53371J3() {
        super.mo53371J3();
        m53378N3();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x000d, code lost:
    
        r0 = null;
     */
    /* JADX INFO: renamed from: M3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m53377M3() {
        View viewM4623b;
        ImageView imageView;
        BaseTextView baseTextView;
        C4655b1 c4655b1M53376K3 = m53376K3();
        if (c4655b1M53376K3 != null) {
            viewM4623b = c4655b1M53376K3.getRoot();
            while (viewM4623b != null) {
                if (viewM4623b.findViewById(R$id.home_card_add_bottom_sheet_title_layout) != null) {
                    C4655b1 c4655b1M53376K4 = m53376K3();
                    if (c4655b1M53376K4 != null && (baseTextView = c4655b1M53376K4.f4238f) != null) {
                        C27046k.m66685H(baseTextView);
                    }
                    C4655b1 c4655b1M53376K5 = m53376K3();
                    if (c4655b1M53376K5 != null && (imageView = c4655b1M53376K5.f4236d) != null) {
                        C27046k.m66700o(imageView);
                        return;
                    }
                    return;
                }
                Object parent = viewM4623b.getParent();
                if (!(parent instanceof View)) {
                    viewM4623b = null;
                } else {
                    viewM4623b = (View) parent;
                }
            }
            return;
        }
        viewM4623b = null;
    }

    /* JADX INFO: renamed from: N3 */
    public final void m53378N3() {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        C4655b1 c4655b1M53376K3 = m53376K3();
        MaterialCardView materialCardViewM4623b = null;
        if (c4655b1M53376K3 != null) {
            baseTextView = c4655b1M53376K3.f4239g;
        } else {
            baseTextView = null;
        }
        C4655b1 c4655b1M53376K4 = m53376K3();
        if (c4655b1M53376K4 != null) {
            baseTextView2 = c4655b1M53376K4.f4240h;
        } else {
            baseTextView2 = null;
        }
        C4655b1 c4655b1M53376K5 = m53376K3();
        if (c4655b1M53376K5 != null) {
            materialCardViewM4623b = c4655b1M53376K5.getRoot();
        }
        C22619k.m53403b(baseTextView, baseTextView2, materialCardViewM4623b, false);
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    public void initView() {
        RecyclerView recyclerView;
        super.initView();
        m53378N3();
        C4655b1 c4655b1M53376K3 = m53376K3();
        if (c4655b1M53376K3 != null && (recyclerView = c4655b1M53376K3.f4234b) != null) {
            C22912t.m54409g(recyclerView, false);
            BaseMultiItemQuickAdapter<HomeCalendarEventDataWrapper, BaseViewHolder> baseMultiItemQuickAdapterM53369F3 = m53369F3();
            this.f42775Z = baseMultiItemQuickAdapterM53369F3;
            recyclerView.setAdapter(baseMultiItemQuickAdapterM53369F3);
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        C22622n.m53431b(false, String.valueOf(hashCode()));
    }
}
