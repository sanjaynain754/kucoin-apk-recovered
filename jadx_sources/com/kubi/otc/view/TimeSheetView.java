package com.kubi.otc.view;

import android.os.Bundle;
import android.view.View;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.contrarywind.view.WheelView;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.otc.view.TimeSheetView;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27046k;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p629t2.InterfaceC44627a;
import p681v2.InterfaceC45364b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: TimeSheetView.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\b\u000b\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0001*B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0001H\u0016J.\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0 2\u0006\u0010!\u001a\u00020\u001eH\u0002J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001e0 H\u0002J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0 H\u0002J\u001e\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001e0 2\u0006\u0010%\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u001eH\u0002J\u0014\u0010'\u001a\u00020\u001e*\u00020\u00062\u0006\u0010!\u001a\u00020\u001eH\u0002J\u001c\u0010(\u001a\u00020\u0016*\u00020\u00062\u0006\u0010!\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020\u001eH\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\bR\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006+"}, m90084d2 = {"Lcom/kubi/otc/view/TimeSheetView;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "Lcom/kubi/resources/dialog/DialogFragmentHelper$InitViewListener;", "<init>", "()V", "endTime", "Ljava/util/Calendar;", "getEndTime", "()Ljava/util/Calendar;", "endTime$delegate", "Lkotlin/Lazy;", "startTime", "getStartTime", "startTime$delegate", "consumer", "Lio/reactivex/functions/Consumer;", "", "getConsumer", "()Lio/reactivex/functions/Consumer;", "setConsumer", "(Lio/reactivex/functions/Consumer;)V", "setupView", "", "viewHolder", "Lio/chad/library/adapter/base/BaseViewHolder;", "dialogFragmentHelper", "initWheelView", "wheelView", "Lcom/contrarywind/view/WheelView;", "current", "", "data", "", "field", "getYearData", "getMonthData", "getDayData", "year", "month", "opt", "with", "value", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTimeSheetView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeSheetView.kt\ncom/kubi/otc/view/TimeSheetView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,139:1\n1#2:140\n*E\n"})
public final class TimeSheetView extends DialogFragmentHelper implements DialogFragmentHelper.InterfaceC22882b {

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public static final Companion f38183t0 = new Companion(null);

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final Lazy f38184q0 = LazyKt.lazy(new Function0() { // from class: mt.f0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TimeSheetView.m45586n4();
        }
    });

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final Lazy f38185r0 = LazyKt.lazy(new Function0() { // from class: mt.g0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TimeSheetView.m45589y4(this.f94351b);
        }
    });

    /* JADX INFO: renamed from: s0 */
    @Nullable
    public Consumer<Long> f38186s0;

    /* JADX INFO: compiled from: TimeSheetView.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/otc/view/TimeSheetView$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/otc/view/TimeSheetView;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final TimeSheetView newInstance() {
            TimeSheetView timeSheetView = new TimeSheetView();
            Bundle bundle = new Bundle();
            bundle.putInt(TtmlNode.TAG_LAYOUT, R$layout.view_wheel_dialog);
            timeSheetView.setArguments(bundle);
            return timeSheetView;
        }
    }

    /* JADX INFO: renamed from: com.kubi.otc.view.TimeSheetView$a */
    /* JADX INFO: compiled from: TimeSheetView.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0015\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010\b¨\u0006\t"}, m90084d2 = {"com/kubi/otc/view/TimeSheetView$initWheelView$1$1", "Lcom/contrarywind/adapter/WheelAdapter;", "", "getItemsCount", "indexOf", "o", "getItem", "index", "(I)Ljava/lang/Integer;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20293a implements InterfaceC44627a<Integer> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List<Integer> f38187a;

        public C20293a(List<Integer> list) {
            this.f38187a = list;
        }

        @Override // p629t2.InterfaceC44627a
        /* JADX INFO: renamed from: a */
        public int mo33651a() {
            return this.f38187a.size();
        }

        @Override // p629t2.InterfaceC44627a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Integer getItem(int i11) {
            return Integer.valueOf((i11 < 0 || i11 >= this.f38187a.size()) ? 0 : this.f38187a.get(i11).intValue());
        }

        /* JADX INFO: renamed from: c */
        public int m45600c(int i11) {
            return this.f38187a.indexOf(Integer.valueOf(i11));
        }

        @Override // p629t2.InterfaceC44627a
        public /* bridge */ /* synthetic */ int indexOf(Integer num) {
            return m45600c(num.intValue());
        }
    }

    /* JADX INFO: renamed from: v4 */
    public final int m45596v4(Calendar calendar, int i11) {
        return i11 == 2 ? calendar.get(i11) + 1 : calendar.get(i11);
    }

    /* JADX INFO: renamed from: z4 */
    public final void m45598z4(Calendar calendar, int i11, int i12) {
        if (i11 == 2) {
            calendar.set(i11, i12 - 1);
        } else {
            calendar.set(i11, i12);
        }
    }

    /* JADX INFO: renamed from: x4 */
    public static final Unit m45588x4(TimeSheetView timeSheetView) throws Exception {
        Consumer<Long> consumer = timeSheetView.f38186s0;
        if (consumer != null) {
            consumer.accept(Long.valueOf(C27039d.m66652l(Long.valueOf(timeSheetView.m45593r4().getTimeInMillis()))));
        }
        timeSheetView.dismiss();
        return Unit.INSTANCE;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper.InterfaceC22882b
    /* JADX INFO: renamed from: b3 */
    public void mo16191b3(@NotNull BaseViewHolder viewHolder, @NotNull DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        View view = viewHolder.getView(R$id.wheel_year);
        WheelView wheelView = (WheelView) view;
        wheelView.setCyclic(false);
        Intrinsics.checkNotNullExpressionValue(view, "apply(...)");
        m45595t4(wheelView, m45596v4(m45593r4(), 1), m45594s4(), 1);
        View view2 = viewHolder.getView(R$id.wheel_month);
        WheelView wheelView2 = (WheelView) view2;
        wheelView2.setCyclic(true);
        Intrinsics.checkNotNullExpressionValue(view2, "apply(...)");
        m45595t4(wheelView2, m45596v4(m45593r4(), 2), m45592q4(), 2);
        View view3 = viewHolder.getView(R$id.wheel_day);
        WheelView wheelView3 = (WheelView) view3;
        wheelView3.setCyclic(true);
        Intrinsics.checkNotNullExpressionValue(view3, "apply(...)");
        m45595t4(wheelView3, m45596v4(m45593r4(), 5), m45590o4(m45596v4(m45593r4(), 1), m45596v4(m45593r4(), 2)), 5);
        View view4 = viewHolder.getView(R$id.tv_ensure);
        Intrinsics.checkNotNullExpressionValue(view4, "getView(...)");
        C27046k.m66711z(view4, 0L, new Function0() { // from class: mt.h0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TimeSheetView.m45588x4(this.f94353b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: o4 */
    public final List<Integer> m45590o4(int i11, int i12) {
        ArrayList arrayList = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        int i13 = 1;
        calendar.set(i11, i12, 1);
        Intrinsics.checkNotNull(calendar);
        m45598z4(calendar, 5, 0);
        int iM45596v4 = m45596v4(calendar, 5);
        if (1 <= iM45596v4) {
            while (true) {
                arrayList.add(Integer.valueOf(i13));
                if (i13 == iM45596v4) {
                    break;
                }
                i13++;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: p4 */
    public final Calendar m45591p4() {
        Object value = this.f38184q0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Calendar) value;
    }

    /* JADX INFO: renamed from: q4 */
    public final List<Integer> m45592q4() {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 1; i11 < 13; i11++) {
            arrayList.add(Integer.valueOf(i11));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: r4 */
    public final Calendar m45593r4() {
        Object value = this.f38185r0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Calendar) value;
    }

    /* JADX INFO: renamed from: s4 */
    public final List<Integer> m45594s4() {
        ArrayList arrayList = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar, "getInstance(...)");
        int iM45596v4 = m45596v4(calendar, 1);
        int i11 = 1900;
        if (1900 <= iM45596v4) {
            while (true) {
                arrayList.add(Integer.valueOf(i11));
                if (i11 == iM45596v4) {
                    break;
                }
                i11++;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: t4 */
    public final void m45595t4(WheelView wheelView, int i11, final List<Integer> list, final int i12) {
        wheelView.setAdapter(new C20293a(list));
        wheelView.setOnItemSelectedListener(new InterfaceC45364b() { // from class: mt.i0
            @Override // p681v2.InterfaceC45364b
            /* JADX INFO: renamed from: a */
            public final void mo33596a(int i13) {
                TimeSheetView.m45587u4(this.f94355a, i12, list, i13);
            }
        });
        wheelView.setCurrentItem(wheelView.getAdapter().indexOf(Integer.valueOf(i11)));
        wheelView.m6991m();
    }

    /* JADX INFO: renamed from: w4 */
    public final void m45597w4(@Nullable Consumer<Long> consumer) {
        this.f38186s0 = consumer;
    }

    public TimeSheetView() {
        m54236e4(this);
    }

    /* JADX INFO: renamed from: n4 */
    public static final Calendar m45586n4() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        return calendar;
    }

    /* JADX INFO: renamed from: u4 */
    public static final void m45587u4(TimeSheetView timeSheetView, int i11, List list, int i12) {
        timeSheetView.m45598z4(timeSheetView.m45593r4(), i11, ((Number) list.get(i12)).intValue());
    }

    /* JADX INFO: renamed from: y4 */
    public static final Calendar m45589y4(TimeSheetView timeSheetView) {
        Calendar calendar = Calendar.getInstance(timeSheetView.m45591p4().getTimeZone());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.add(5, -29);
        return calendar;
    }
}
