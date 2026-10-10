package com.kubi.kumex.dialog;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.exifinterface.media.ExifInterface;
import com.contrarywind.view.WheelView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.utils.C27100x0;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rtmp.TXVodConstants;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42179a;
import p629t2.InterfaceC44627a;
import p681v2.InterfaceC45364b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import qe0.C43724b;

/* JADX INFO: renamed from: com.kubi.kumex.dialog.m3, reason: from Kotlin metadata */
/* JADX INFO: compiled from: TimeMenuDialog.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0015J\u001a\u0010\u0017\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006J\b\u0010\u001a\u001a\u00020\u0007H\u0002J\u0018\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0 H\u0002J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0 H\u0002J\u001e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001d0 2\u0006\u0010#\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\u001dH\u0002J\u0010\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u000bH\u0002J:\u0010%\u001a\u00020\u00072\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001d2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001d0 2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00070\u0005H\u0002J\b\u0010,\u001a\u00020\u0007H\u0002J\u0014\u0010-\u001a\u00020\u001d*\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u001c\u0010.\u001a\u00020\u0007*\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J4\u0010/\u001a\u00020\u0007\"\b\b\u0000\u00100*\u00020\u0015*\u0002H02\u0017\u00101\u001a\u0013\u0012\u0004\u0012\u0002H0\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b2H\u0002¢\u0006\u0002\u00103J\f\u00104\u001a\u000205*\u00020\u0015H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0011\u0010\r¨\u00066"}, m90084d2 = {"Lcom/kubi/kumex/dialog/TimeMenuDialog;", "Lcom/zyyoona7/popup/EasyPopup;", "context", "Landroid/content/Context;", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lkotlin/Function1;", "Lcom/kubi/kumex/dialog/BaseTime;", "", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "endTime", "Ljava/util/Calendar;", "getEndTime", "()Ljava/util/Calendar;", "endTime$delegate", "Lkotlin/Lazy;", "startTime", "getStartTime", "startTime$delegate", "initViews", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "popup", "showAsDropDown", "anchor", "time", "initListener", "updateTime", "field", "", "value", "getYearData", "", "getMonthData", "getDayData", "year", "month", "initWheelView", "cale", "wheelView", "Lcom/contrarywind/view/WheelView;", "current", "data", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "checkWheelView", "opt", "with", "performAction", ExifInterface.GPS_DIRECTION_TRUE, "func", "Lkotlin/ExtensionFunctionType;", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "isUserAction", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTimeMenuDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeMenuDialog.kt\ncom/kubi/kumex/dialog/TimeMenuDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,332:1\n1#2:333\n*E\n"})
public final class TimeMenuDialog extends C43724b {

    /* JADX INFO: renamed from: D */
    @NotNull
    public final Context f28949D;

    /* JADX INFO: renamed from: E */
    @NotNull
    public final Function1<BaseTime, Unit> f28950E;

    /* JADX INFO: renamed from: F */
    @NotNull
    public final Lazy f28951F;

    /* JADX INFO: renamed from: G */
    @NotNull
    public final Lazy f28952G;

    /* JADX INFO: renamed from: com.kubi.kumex.dialog.m3$a */
    /* JADX INFO: compiled from: TimeMenuDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0015\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010\b¨\u0006\t"}, m90084d2 = {"com/kubi/kumex/dialog/TimeMenuDialog$initWheelView$2", "Lcom/contrarywind/adapter/WheelAdapter;", "", "getItemsCount", "indexOf", "o", "getItem", "index", "(I)Ljava/lang/Integer;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a implements InterfaceC44627a<Integer> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List<Integer> f28953a;

        public a(List<Integer> list) {
            this.f28953a = list;
        }

        @Override // p629t2.InterfaceC44627a
        /* JADX INFO: renamed from: a */
        public int mo33651a() {
            return this.f28953a.size();
        }

        @Override // p629t2.InterfaceC44627a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Integer getItem(int i11) {
            return Integer.valueOf((i11 < 0 || i11 >= this.f28953a.size()) ? 0 : this.f28953a.get(i11).intValue());
        }

        /* JADX INFO: renamed from: c */
        public int m33653c(int i11) {
            return this.f28953a.indexOf(Integer.valueOf(i11));
        }

        @Override // p629t2.InterfaceC44627a
        public /* bridge */ /* synthetic */ int indexOf(Integer num) {
            return m33653c(num.intValue());
        }
    }

    /* JADX INFO: renamed from: F0 */
    public static final Unit m33602F0(TimeMenuDialog timeMenuDialog, int i11) {
        timeMenuDialog.m33631k1(5, i11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U0 */
    public static final Unit m33615U0(TimeMenuDialog timeMenuDialog, int i11) {
        timeMenuDialog.m33631k1(1, i11);
        timeMenuDialog.m33601E0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: V0 */
    public static final Unit m33616V0(TimeMenuDialog timeMenuDialog, int i11) {
        timeMenuDialog.m33631k1(2, i11);
        timeMenuDialog.m33601E0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: W0 */
    public static final Unit m33617W0(TimeMenuDialog timeMenuDialog, int i11) {
        timeMenuDialog.m33631k1(5, i11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z0 */
    private final int m33620Z0(Calendar calendar, int i11) {
        return i11 == 2 ? calendar.get(i11) + 1 : calendar.get(i11);
    }

    /* JADX INFO: renamed from: l1 */
    private final void m33633l1(Calendar calendar, int i11, int i12) {
        if (i11 == 2) {
            calendar.set(i11, i12 - 1);
        } else {
            calendar.set(i11, i12);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TimeMenuDialog(@NotNull Context context, @NotNull Function1<? super BaseTime, Unit> action) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f28949D = context;
        this.f28950E = action;
        this.f28951F = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.dialog.f3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TimeMenuDialog.m33603G0();
            }
        });
        this.f28952G = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.dialog.g3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TimeMenuDialog.m33629j1(this.f28918b);
            }
        });
        m96317a0(-1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(LayoutInflater.from(linearLayout.getContext()).inflate(R$layout.bkumex_dialog_time_menu, (ViewGroup) null), new ViewGroup.LayoutParams(-1, -2));
        View view = new View(linearLayout.getContext());
        view.setBackgroundColor(Color.parseColor("#7f000000"));
        ViewExtKt.m66575f(view, new Function1() { // from class: com.kubi.kumex.dialog.h3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TimeMenuDialog.m33636o0(this.f28925b, (View) obj);
            }
        });
        linearLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
        m96309S(linearLayout);
    }

    /* JADX INFO: renamed from: H0 */
    private final List<Integer> m33604H0(int i11, int i12) {
        ArrayList arrayList = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        int i13 = 1;
        calendar.set(i11, i12, 1);
        Intrinsics.checkNotNull(calendar);
        m33633l1(calendar, 5, 0);
        int iM33620Z0 = m33620Z0(calendar, 5);
        if (1 <= iM33620Z0) {
            while (true) {
                arrayList.add(Integer.valueOf(i13));
                if (i13 == iM33620Z0) {
                    break;
                }
                i13++;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: I0 */
    private final Calendar m33605I0() {
        Object value = this.f28951F.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Calendar) value;
    }

    /* JADX INFO: renamed from: K0 */
    private final Calendar m33606K0() {
        Object value = this.f28952G.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Calendar) value;
    }

    /* JADX INFO: renamed from: L0 */
    private final List<Integer> m33607L0() {
        ArrayList arrayList = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar, "getInstance(...)");
        int iM33620Z0 = m33620Z0(calendar, 1);
        int i11 = TXVodConstants.VOD_PLAY_EVT_SEEK_COMPLETE;
        if (2019 <= iM33620Z0) {
            while (true) {
                arrayList.add(Integer.valueOf(i11));
                if (i11 == iM33620Z0) {
                    break;
                }
                i11++;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: M0 */
    private final void m33608M0() {
        View viewM96292A = m96292A();
        final RadioGroup radioGroup = (RadioGroup) viewM96292A.findViewById(R$id.rangeLayout);
        final RadioGroup radioGroup2 = (RadioGroup) viewM96292A.findViewById(R$id.customLayout);
        RadioButton radioButton = (RadioButton) viewM96292A.findViewById(R$id.start);
        RadioButton radioButton2 = (RadioButton) viewM96292A.findViewById(R$id.end);
        final View viewFindViewById = viewM96292A.findViewById(R$id.wheelLayout);
        final View viewFindViewById2 = viewM96292A.findViewById(R$id.determine);
        radioGroup.check(R$id.sevenDay);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.kubi.kumex.dialog.s2
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup3, int i11) {
                TimeMenuDialog.m33609N0(this.f28983b, radioGroup, radioGroup2, radioGroup3, i11);
            }
        });
        radioButton.setText(C42179a.m92629b(m33606K0().getTime().getTime(), null, false, null, false, 15, null));
        radioButton2.setText(C42179a.m92629b(m33605I0().getTime().getTime(), null, false, null, false, 15, null));
        radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.kubi.kumex.dialog.d3
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup3, int i11) {
                TimeMenuDialog.m33611P0(this.f28899b, radioGroup2, radioGroup, viewFindViewById, viewFindViewById2, radioGroup3, i11);
            }
        });
        m33614T0(m33606K0());
        Intrinsics.checkNotNull(viewFindViewById2);
        ViewExtKt.m66575f(viewFindViewById2, new Function1() { // from class: com.kubi.kumex.dialog.e3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TimeMenuDialog.m33613R0(this.f28909b, (View) obj);
            }
        });
    }

    /* JADX INFO: renamed from: R0 */
    public static final Unit m33613R0(TimeMenuDialog timeMenuDialog, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (timeMenuDialog.m33605I0().getTimeInMillis() <= timeMenuDialog.m33606K0().getTimeInMillis()) {
            ToastCompat.m66437C(R$string.start_time_less_end_time);
        } else if (timeMenuDialog.m33605I0().getTimeInMillis() - timeMenuDialog.m33606K0().getTimeInMillis() > 2592000000L) {
            ToastCompat.m66437C(R$string.time_less_30_days);
        } else {
            timeMenuDialog.f28950E.invoke(new CustomTime(timeMenuDialog.m33606K0().getTimeInMillis(), timeMenuDialog.m33605I0().getTimeInMillis()));
            timeMenuDialog.m96331y();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a1 */
    private final <T extends View> void m33621a1(T t11, Function1<? super T, Unit> function1) {
        t11.setTag(Boolean.TRUE);
        function1.invoke(t11);
        t11.setTag(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: e1 */
    public static final Unit m33624e1(RadioGroup radioGroup) {
        radioGroup.check(R$id.sevenDay);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h1 */
    public static final Unit m33627h1(RadioGroup radioGroup) {
        radioGroup.check(R$id.start);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i1 */
    public static final Unit m33628i1(BaseTime baseTime, RadioGroup radioGroup) {
        radioGroup.check(((RangeTime) baseTime).getF28887a());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k1 */
    private final void m33631k1(int i11, int i12) {
        View viewM96292A = m96292A();
        RadioButton radioButton = (RadioButton) viewM96292A.findViewById(R$id.start);
        RadioButton radioButton2 = (RadioButton) viewM96292A.findViewById(R$id.end);
        if (radioButton.isChecked()) {
            m33633l1(m33606K0(), i11, i12);
            Calendar calendarM33606K0 = m33606K0();
            calendarM33606K0.set(11, 0);
            calendarM33606K0.set(12, 0);
            calendarM33606K0.set(13, 0);
            radioButton.setText(C42179a.m92629b(m33606K0().getTime().getTime(), null, false, null, false, 15, null));
        }
        if (radioButton2.isChecked()) {
            m33633l1(m33605I0(), i11, i12);
            Calendar calendarM33605I0 = m33605I0();
            calendarM33605I0.set(11, 23);
            calendarM33605I0.set(12, 59);
            calendarM33605I0.set(13, 59);
            radioButton2.setText(C42179a.m92629b(m33605I0().getTime().getTime(), null, false, null, false, 15, null));
        }
    }

    /* JADX INFO: renamed from: o0 */
    public static Unit m33636o0(TimeMenuDialog timeMenuDialog, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        timeMenuDialog.m96331y();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J0 */
    public final List<Integer> m33648J0() {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 1; i11 < 13; i11++) {
            arrayList.add(Integer.valueOf(i11));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: S0 */
    public final void m33649S0(WheelView wheelView, int i11, final List<Integer> list, final Function1<? super Integer, Unit> function1) {
        wheelView.setAdapter(new a(list));
        wheelView.setOnItemSelectedListener(new InterfaceC45364b() { // from class: com.kubi.kumex.dialog.c3
            @Override // p681v2.InterfaceC45364b
            /* JADX INFO: renamed from: a */
            public final void mo33596a(int i12) {
                TimeMenuDialog.m33618X0(function1, list, i12);
            }
        });
        wheelView.setCurrentItem(wheelView.getAdapter().indexOf(Integer.valueOf(i11)));
        wheelView.m6991m();
    }

    @Override // qe0.C43724b, qe0.AbstractC43723a
    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: i0 */
    public void mo25306H(@NotNull View view, @Nullable C43724b c43724b) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.mo25306H(view, c43724b);
        m33608M0();
    }

    /* JADX INFO: renamed from: E0 */
    private final void m33601E0() {
        View viewM96292A = m96292A();
        WheelView wheelView = (WheelView) viewM96292A.findViewById(R$id.year);
        WheelView wheelView2 = (WheelView) viewM96292A.findViewById(R$id.month);
        WheelView wheelView3 = (WheelView) viewM96292A.findViewById(R$id.day);
        Object item = wheelView.getAdapter().getItem(wheelView.getCurrentItem());
        Intrinsics.checkNotNull(item, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) item).intValue();
        Object item2 = wheelView2.getAdapter().getItem(wheelView2.getCurrentItem());
        Intrinsics.checkNotNull(item2, "null cannot be cast to non-null type kotlin.Int");
        List<Integer> listM33604H0 = m33604H0(iIntValue, ((Integer) item2).intValue());
        if (listM33604H0.size() == wheelView3.getAdapter().mo33651a() && CollectionsKt.contains(listM33604H0, wheelView3.getAdapter().getItem(wheelView3.getCurrentItem()))) {
            return;
        }
        Intrinsics.checkNotNull(wheelView3);
        Object item3 = wheelView3.getAdapter().getItem(wheelView3.getCurrentItem());
        Intrinsics.checkNotNull(item3, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue2 = ((Integer) item3).intValue();
        Object objMaxOrNull = CollectionsKt.maxOrNull((Iterable<? extends Object>) listM33604H0);
        Intrinsics.checkNotNull(objMaxOrNull);
        m33649S0(wheelView3, Math.min(iIntValue2, ((Number) objMaxOrNull).intValue()), listM33604H0, new Function1() { // from class: com.kubi.kumex.dialog.b3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TimeMenuDialog.m33602F0(this.f28888b, ((Integer) obj).intValue());
            }
        });
    }

    /* JADX INFO: renamed from: G0 */
    public static final Calendar m33603G0() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        return calendar;
    }

    /* JADX INFO: renamed from: N0 */
    public static final void m33609N0(TimeMenuDialog timeMenuDialog, RadioGroup radioGroup, RadioGroup radioGroup2, RadioGroup radioGroup3, int i11) {
        Intrinsics.checkNotNull(radioGroup);
        if (timeMenuDialog.m33619Y0(radioGroup)) {
            timeMenuDialog.f28950E.invoke(new RangeTime(i11));
            timeMenuDialog.m33621a1(radioGroup2, new Function1() { // from class: com.kubi.kumex.dialog.w2
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TimeMenuDialog.m33610O0((RadioGroup) obj);
                }
            });
            timeMenuDialog.m96331y();
        }
    }

    /* JADX INFO: renamed from: O0 */
    public static final Unit m33610O0(RadioGroup radioGroup) {
        radioGroup.clearCheck();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P0 */
    public static final void m33611P0(TimeMenuDialog timeMenuDialog, RadioGroup radioGroup, RadioGroup radioGroup2, View view, View view2, RadioGroup radioGroup3, int i11) {
        boolean z11;
        Intrinsics.checkNotNull(radioGroup);
        if (timeMenuDialog.m33619Y0(radioGroup)) {
            timeMenuDialog.m33621a1(radioGroup2, new Function1() { // from class: com.kubi.kumex.dialog.a3
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TimeMenuDialog.m33612Q0((RadioGroup) obj);
                }
            });
        }
        if (i11 == R$id.start) {
            timeMenuDialog.m33614T0(timeMenuDialog.m33606K0());
        }
        if (i11 == R$id.end) {
            timeMenuDialog.m33614T0(timeMenuDialog.m33605I0());
        }
        Intrinsics.checkNotNull(view);
        boolean z12 = false;
        if (i11 != -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        C27046k.m66684G(view, z11);
        Intrinsics.checkNotNull(view2);
        if (i11 != -1) {
            z12 = true;
        }
        C27046k.m66684G(view2, z12);
    }

    /* JADX INFO: renamed from: Q0 */
    public static final Unit m33612Q0(RadioGroup radioGroup) {
        radioGroup.clearCheck();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: T0 */
    private final void m33614T0(Calendar calendar) {
        View viewM96292A = m96292A();
        View viewFindViewById = viewM96292A.findViewById(R$id.year);
        WheelView wheelView = (WheelView) viewFindViewById;
        wheelView.setCyclic(false);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "apply(...)");
        m33649S0(wheelView, m33620Z0(calendar, 1), m33607L0(), new Function1() { // from class: com.kubi.kumex.dialog.x2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TimeMenuDialog.m33615U0(this.f29009b, ((Integer) obj).intValue());
            }
        });
        View viewFindViewById2 = viewM96292A.findViewById(R$id.month);
        WheelView wheelView2 = (WheelView) viewFindViewById2;
        wheelView2.setCyclic(true);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "apply(...)");
        m33649S0(wheelView2, m33620Z0(calendar, 2), m33648J0(), new Function1() { // from class: com.kubi.kumex.dialog.y2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TimeMenuDialog.m33616V0(this.f29015b, ((Integer) obj).intValue());
            }
        });
        View viewFindViewById3 = viewM96292A.findViewById(R$id.day);
        WheelView wheelView3 = (WheelView) viewFindViewById3;
        wheelView3.setCyclic(true);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "apply(...)");
        m33649S0(wheelView3, m33620Z0(calendar, 5), m33604H0(m33620Z0(calendar, 1), m33620Z0(calendar, 2)), new Function1() { // from class: com.kubi.kumex.dialog.z2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TimeMenuDialog.m33617W0(this.f29020b, ((Integer) obj).intValue());
            }
        });
    }

    /* JADX INFO: renamed from: X0 */
    public static final void m33618X0(Function1 function1, List list, int i11) {
        function1.invoke(list.get(i11));
    }

    /* JADX INFO: renamed from: Y0 */
    private final boolean m33619Y0(View view) {
        Boolean bool;
        Object tag = view.getTag();
        if (tag instanceof Boolean) {
            bool = (Boolean) tag;
        } else {
            bool = null;
        }
        return !Intrinsics.areEqual(bool, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: c1 */
    public static final Unit m33622c1(TimeMenuDialog timeMenuDialog, final BaseTime baseTime) {
        View viewM96292A = timeMenuDialog.m96292A();
        RadioGroup radioGroup = (RadioGroup) viewM96292A.findViewById(R$id.rangeLayout);
        RadioGroup radioGroup2 = (RadioGroup) viewM96292A.findViewById(R$id.customLayout);
        if (baseTime instanceof CustomTime) {
            timeMenuDialog.m33621a1(radioGroup, new Function1() { // from class: com.kubi.kumex.dialog.j3
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TimeMenuDialog.m33626g1((RadioGroup) obj);
                }
            });
            timeMenuDialog.m33621a1(radioGroup2, new Function1() { // from class: com.kubi.kumex.dialog.k3
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TimeMenuDialog.m33627h1((RadioGroup) obj);
                }
            });
        } else if (baseTime instanceof RangeTime) {
            timeMenuDialog.m33621a1(radioGroup, new Function1() { // from class: com.kubi.kumex.dialog.l3
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TimeMenuDialog.m33628i1(baseTime, (RadioGroup) obj);
                }
            });
            timeMenuDialog.m33621a1(radioGroup2, new Function1() { // from class: com.kubi.kumex.dialog.t2
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TimeMenuDialog.m33623d1((RadioGroup) obj);
                }
            });
        } else {
            timeMenuDialog.m33621a1(radioGroup, new Function1() { // from class: com.kubi.kumex.dialog.u2
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TimeMenuDialog.m33624e1((RadioGroup) obj);
                }
            });
            timeMenuDialog.m33621a1(radioGroup2, new Function1() { // from class: com.kubi.kumex.dialog.v2
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TimeMenuDialog.m33625f1((RadioGroup) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d1 */
    public static final Unit m33623d1(RadioGroup radioGroup) {
        radioGroup.clearCheck();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f1 */
    public static final Unit m33625f1(RadioGroup radioGroup) {
        radioGroup.clearCheck();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g1 */
    public static final Unit m33626g1(RadioGroup radioGroup) {
        radioGroup.clearCheck();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j1 */
    public static final Calendar m33629j1(TimeMenuDialog timeMenuDialog) {
        Calendar calendar = Calendar.getInstance(timeMenuDialog.m33605I0().getTimeZone());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.add(5, -29);
        return calendar;
    }

    /* JADX INFO: renamed from: b1 */
    public final void m33650b1(@Nullable View view, @Nullable final BaseTime baseTime) {
        mo54253b0(view);
        C27100x0.m66923d(new Function0() { // from class: com.kubi.kumex.dialog.i3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TimeMenuDialog.m33622c1(this.f28930b, baseTime);
            }
        });
    }
}
