package p761xh;

import android.content.Context;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.blankj.utilcode.util.C5303w0;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.resources.widget.wheel.view.WheelView;
import com.kubi.tradebase.R$color;
import com.kubi.tradebase.R$id;
import com.kubi.tradebase.R$layout;
import com.kubi.tradebase.R$string;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27096v0;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rtmp.TXVodConstants;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import n30.C42725a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p293gx.InterfaceC38055a;
import p350ix.InterfaceC40189b;
import p429lf.C42179a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.ranges.RangesKt;
import p852kotlin.text.StringsKt;
import qe0.C43724b;

/* JADX INFO: renamed from: xh.x0 */
/* JADX INFO: compiled from: SelectTimeOfHistoryPopup.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010%\u001a\u00020\n2\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010\u0001H\u0014J\b\u0010)\u001a\u00020\nH\u0002J\b\u0010*\u001a\u00020+H\u0002J\b\u0010,\u001a\u00020\nH\u0002J\b\u0010-\u001a\u00020\nH\u0002J\u0010\u0010.\u001a\u00020\n2\u0006\u0010/\u001a\u00020\u0016H\u0002JD\u0010.\u001a\u00020\n2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\f\u00104\u001a\b\u0012\u0004\u0012\u000203052\b\b\u0002\u00106\u001a\u00020\u00072\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\n0\tH\u0002J\u0018\u00108\u001a\u00020\n2\u0006\u00109\u001a\u0002032\u0006\u0010:\u001a\u000203H\u0002J\f\u0010;\u001a\u00020\n*\u00020\u0016H\u0002J\b\u0010<\u001a\u00020\nH\u0002J\b\u0010=\u001a\u00020\nH\u0002J\b\u0010>\u001a\u00020\nH\u0002J\b\u0010?\u001a\u00020\nH\u0002J\u000e\u0010@\u001a\b\u0012\u0004\u0012\u00020305H\u0002J\u0016\u0010A\u001a\b\u0012\u0004\u0012\u000203052\u0006\u0010B\u001a\u000203H\u0002J\u001e\u0010C\u001a\b\u0012\u0004\u0012\u000203052\u0006\u0010B\u001a\u0002032\u0006\u0010D\u001a\u000203H\u0002J\u0014\u0010E\u001a\u000203*\u00020\u00162\u0006\u00109\u001a\u000203H\u0002J\u001c\u0010F\u001a\u00020\n*\u00020\u00162\u0006\u00109\u001a\u0002032\u0006\u0010:\u001a\u000203H\u0002J4\u0010G\u001a\u00020\n\"\b\b\u0000\u0010H*\u00020'*\u0002HH2\u0017\u0010I\u001a\u0013\u0012\u0004\u0012\u0002HH\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\bJH\u0002¢\u0006\u0002\u0010KJ\f\u0010L\u001a\u00020\u0007*\u00020'H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082D¢\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001b\u0010\u0018R\u001b\u0010\u001d\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0014\u001a\u0004\b\u001e\u0010\u0018R\u001b\u0010 \u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0014\u001a\u0004\b!\u0010\u0018R\u0014\u0010#\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0018¨\u0006M"}, m90084d2 = {"Lcom/kubi/futures/dialog/pop/SelectTimeOfHistoryPopup;", "Lcom/zyyoona7/popup/EasyPopup;", "context", "Landroid/content/Context;", "lastTime", "Lcom/kubi/futures/dialog/pop/BaseTime;", "isContractDataQuery", "", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lkotlin/Function1;", "", "<init>", "(Landroid/content/Context;Lcom/kubi/futures/dialog/pop/BaseTime;ZLkotlin/jvm/functions/Function1;)V", "tag", "", "binding", "Lcom/kubi/tradebase/databinding/BkumexSelectTimeOfHistoryPopBinding;", "getBinding", "()Lcom/kubi/tradebase/databinding/BkumexSelectTimeOfHistoryPopBinding;", "binding$delegate", "Lkotlin/Lazy;", "maxSelectableTime", "Ljava/util/Calendar;", "getMaxSelectableTime", "()Ljava/util/Calendar;", "maxSelectableTime$delegate", "minSelectableTime", "getMinSelectableTime", "minSelectableTime$delegate", "endTime", "getEndTime", "endTime$delegate", "startTime", "getStartTime", "startTime$delegate", "currentTime", "getCurrentTime", "initViews", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "popup", "initScopeDesc", "buildHistoricalScopeDesc", "", "initClick", "initListener", "initWheelView", "cale", "wheelView", "Lcom/kubi/resources/widget/wheel/view/WheelView;", "current", "", "data", "", "cyclic", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "updateTime", "field", "value", "clampToSelectableRange", "checkWheelView", "checkContractWheelView", "checkLegacyWheelView", "checkDayWheelView", "getYearData", "getMonthData", "year", "getDayData", "month", "opt", "with", "performAction", ExifInterface.GPS_DIRECTION_TRUE, "func", "Lkotlin/ExtensionFunctionType;", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "isUserAction", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C46243x0 extends C43724b {

    /* JADX INFO: renamed from: D */
    @NotNull
    public final InterfaceC46192a f103800D;

    /* JADX INFO: renamed from: E */
    public final boolean f103801E;

    /* JADX INFO: renamed from: F */
    @NotNull
    public final Function1<InterfaceC46192a, Unit> f103802F;

    /* JADX INFO: renamed from: G */
    @NotNull
    public final String f103803G;

    /* JADX INFO: renamed from: H */
    @NotNull
    public final Lazy f103804H;

    /* JADX INFO: renamed from: I */
    @NotNull
    public final Lazy f103805I;

    /* JADX INFO: renamed from: J */
    @NotNull
    public final Lazy f103806J;

    /* JADX INFO: renamed from: K */
    @NotNull
    public final Lazy f103807K;

    /* JADX INFO: renamed from: L */
    @NotNull
    public final Lazy f103808L;

    /* JADX INFO: renamed from: xh.x0$a */
    /* JADX INFO: compiled from: SelectTimeOfHistoryPopup.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0015\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010\b¨\u0006\t"}, m90084d2 = {"com/kubi/futures/dialog/pop/SelectTimeOfHistoryPopup$initWheelView$6", "Lcom/kubi/resources/widget/wheel/adapter/WheelAdapter;", "", "getItemsCount", "indexOf", "o", "getItem", "index", "(I)Ljava/lang/Integer;", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a implements InterfaceC38055a<Integer> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List<Integer> f103809a;

        public a(List<Integer> list) {
            this.f103809a = list;
        }

        @Override // p293gx.InterfaceC38055a
        /* JADX INFO: renamed from: a */
        public int mo85927a() {
            return this.f103809a.size();
        }

        @Override // p293gx.InterfaceC38055a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Integer getItem(int i11) {
            return Integer.valueOf((i11 < 0 || i11 >= this.f103809a.size()) ? 0 : this.f103809a.get(i11).intValue());
        }

        /* JADX INFO: renamed from: c */
        public int m102004c(int i11) {
            return this.f103809a.indexOf(Integer.valueOf(i11));
        }

        @Override // p293gx.InterfaceC38055a
        public /* bridge */ /* synthetic */ int indexOf(Integer num) {
            return m102004c(num.intValue());
        }
    }

    /* JADX INFO: renamed from: M0 */
    public static final Unit m101940M0(C46243x0 c46243x0, int i11) {
        c46243x0.m101981G1(2, i11);
        c46243x0.m101985N0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O0 */
    public static final Unit m101941O0(C46243x0 c46243x0, int i11) {
        c46243x0.m101981G1(5, i11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q0 */
    public static final Unit m101942Q0(C46243x0 c46243x0, int i11) {
        c46243x0.m101981G1(5, i11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w1 */
    public static final Unit m101971w1(C46243x0 c46243x0, int i11) {
        c46243x0.m101981G1(1, i11);
        c46243x0.m101987R0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x1 */
    public static final Unit m101973x1(C46243x0 c46243x0, int i11) {
        c46243x0.m101981G1(2, i11);
        c46243x0.m101987R0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y1 */
    public static final Unit m101975y1(C46243x0 c46243x0, int i11) {
        c46243x0.m101981G1(5, i11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D1 */
    public final int m101979D1(Calendar calendar, int i11) {
        return i11 == 2 ? calendar.get(i11) + 1 : calendar.get(i11);
    }

    /* JADX INFO: renamed from: H1 */
    public final void m101982H1(Calendar calendar, int i11, int i12) {
        if (i11 == 2) {
            calendar.set(i11, i12 - 1);
        } else {
            calendar.set(i11, i12);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C46243x0(@NotNull Context context, @NotNull InterfaceC46192a lastTime, boolean z11, @NotNull Function1<? super InterfaceC46192a, Unit> action) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(lastTime, "lastTime");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f103800D = lastTime;
        this.f103801E = z11;
        this.f103802F = action;
        this.f103803G = "SelectTimeOfHistoryPopup";
        this.f103804H = LazyKt.lazy(new Function0() { // from class: xh.a0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C46243x0.m101939J0(this.f103725b);
            }
        });
        this.f103805I = LazyKt.lazy(new Function0() { // from class: xh.b0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C46243x0.m101929B1();
            }
        });
        this.f103806J = LazyKt.lazy(new Function0() { // from class: xh.c0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C46243x0.m101931C1(this.f103730b);
            }
        });
        this.f103807K = LazyKt.lazy(new Function0() { // from class: xh.d0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C46243x0.m101943T0(this.f103734b);
            }
        });
        this.f103808L = LazyKt.lazy(new Function0() { // from class: xh.e0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C46243x0.m101935F1(this.f103746b);
            }
        });
        m96317a0(-1);
        m96307Q(R$layout.bkumex_select_time_of_history_pop);
    }

    /* JADX INFO: renamed from: j1 */
    public static final Unit m101948j1(RadioGroup performAction) {
        Intrinsics.checkNotNullParameter(performAction, "$this$performAction");
        performAction.clearCheck();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l1 */
    public static final Unit m101952l1(RadioGroup performAction) {
        Intrinsics.checkNotNullParameter(performAction, "$this$performAction");
        performAction.clearCheck();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m1 */
    public static final Unit m101954m1(RadioGroup performAction) {
        Intrinsics.checkNotNullParameter(performAction, "$this$performAction");
        performAction.clearCheck();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n1 */
    public static final Unit m101956n1(RadioGroup performAction) {
        Intrinsics.checkNotNullParameter(performAction, "$this$performAction");
        performAction.check(R$id.start);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o1 */
    public static final Unit m101958o1(C46243x0 c46243x0, RadioGroup performAction) {
        Intrinsics.checkNotNullParameter(performAction, "$this$performAction");
        performAction.check(((C46198c) c46243x0.f103800D).getF103729a());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p1 */
    public static final Unit m101960p1(RadioGroup performAction) {
        Intrinsics.checkNotNullParameter(performAction, "$this$performAction");
        performAction.clearCheck();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q1 */
    public static final Unit m101962q1(RadioGroup performAction) {
        Intrinsics.checkNotNullParameter(performAction, "$this$performAction");
        performAction.check(R$id.threeMonth);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r1 */
    public static final Unit m101964r1(RadioGroup performAction) {
        Intrinsics.checkNotNullParameter(performAction, "$this$performAction");
        performAction.clearCheck();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v1 */
    public static /* synthetic */ void m101969v1(C46243x0 c46243x0, WheelView wheelView, int i11, List list, boolean z11, Function1 function1, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            z11 = list.size() > 1;
        }
        c46243x0.m102001t1(wheelView, i11, list, z11, function1);
    }

    /* JADX INFO: renamed from: E1 */
    public final <T extends View> void m101980E1(T t11, Function1<? super T, Unit> function1) {
        t11.setTag(Boolean.TRUE);
        function1.invoke(t11);
        t11.setTag(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: K0 */
    public final CharSequence m101983K0() {
        C27017c c27017c = C27017c.f54310a;
        String strM66516f = c27017c.m66516f(R$string.stub, new Object[0]);
        String strM66516f2 = c27017c.m66516f(R$string.kumex_historical_scope_time, new Object[0]);
        int i11 = R$string.kumex_historical_scope_desc;
        String strM66516f3 = c27017c.m66516f(i11, strM66516f);
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) strM66516f3, strM66516f, 0, false, 6, (Object) null);
        int iM66512a = c27017c.m66512a(R$color.c_text);
        if (iIndexOf$default < 0) {
            return c27017c.m66516f(i11, strM66516f2);
        }
        C27096v0 c27096v0 = new C27096v0();
        String strSubstring = strM66516f3.substring(0, iIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        C27096v0 c27096v0M66905e = c27096v0.append(strSubstring).m66905e(strM66516f2, iM66512a);
        String strSubstring2 = strM66516f3.substring(iIndexOf$default + strM66516f.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        C27096v0 c27096v0Append = c27096v0M66905e.append(strSubstring2);
        Intrinsics.checkNotNullExpressionValue(c27096v0Append, "append(...)");
        return c27096v0Append;
    }

    /* JADX INFO: renamed from: R0 */
    public final void m101987R0() {
        if (this.f103801E) {
            m101984L0();
        } else {
            m101986P0();
        }
    }

    /* JADX INFO: renamed from: S0 */
    public final void m101988S0(Calendar calendar) {
        if (this.f103801E) {
            if (calendar.getTimeInMillis() < m101994Z0().getTimeInMillis()) {
                calendar.setTimeInMillis(m101994Z0().getTimeInMillis());
            }
            if (calendar.getTimeInMillis() > m101993Y0().getTimeInMillis()) {
                calendar.setTimeInMillis(m101993Y0().getTimeInMillis());
            }
        }
    }

    /* JADX INFO: renamed from: U0 */
    public final C42725a m101989U0() {
        return (C42725a) this.f103804H.getValue();
    }

    /* JADX INFO: renamed from: W0 */
    public final List<Integer> m101991W0(int i11, int i12) {
        ArrayList arrayList = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        int i13 = 1;
        calendar.set(i11, i12, 1);
        Intrinsics.checkNotNull(calendar);
        m101982H1(calendar, 5, 0);
        int iM101979D1 = m101979D1(calendar, 5);
        if (!this.f103801E) {
            if (1 <= iM101979D1) {
                while (true) {
                    arrayList.add(Integer.valueOf(i13));
                    if (i13 == iM101979D1) {
                        break;
                    }
                    i13++;
                }
            }
        } else {
            int iM101979D2 = (i11 == m101979D1(m101994Z0(), 1) && i12 == m101979D1(m101994Z0(), 2)) ? m101979D1(m101994Z0(), 5) : 1;
            if (i11 == m101979D1(m101993Y0(), 1) && i12 == m101979D1(m101993Y0(), 2)) {
                iM101979D1 = m101979D1(m101993Y0(), 5);
            }
            if (iM101979D2 <= iM101979D1) {
                while (true) {
                    arrayList.add(Integer.valueOf(iM101979D2));
                    if (iM101979D2 == iM101979D1) {
                        break;
                    }
                    iM101979D2++;
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: X0 */
    public final Calendar m101992X0() {
        Object value = this.f103807K.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Calendar) value;
    }

    /* JADX INFO: renamed from: Y0 */
    public final Calendar m101993Y0() {
        Object value = this.f103805I.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Calendar) value;
    }

    /* JADX INFO: renamed from: Z0 */
    public final Calendar m101994Z0() {
        Object value = this.f103806J.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Calendar) value;
    }

    /* JADX INFO: renamed from: a1 */
    public final List<Integer> m101995a1(int i11) {
        ArrayList arrayList = new ArrayList();
        if (this.f103801E) {
            int iM101979D1 = m101979D1(m101994Z0(), 1);
            int iM101979D2 = m101979D1(m101993Y0(), 1);
            iM101979D1 = i11 == iM101979D1 ? m101979D1(m101994Z0(), 2) : 1;
            int iM101979D3 = i11 == iM101979D2 ? m101979D1(m101993Y0(), 2) : 12;
            if (iM101979D1 <= iM101979D3) {
                while (true) {
                    arrayList.add(Integer.valueOf(iM101979D1));
                    if (iM101979D1 == iM101979D3) {
                        break;
                    }
                    iM101979D1++;
                }
            }
        } else {
            for (int iM101979D4 = 1; iM101979D4 < 13; iM101979D4++) {
                arrayList.add(Integer.valueOf(iM101979D4));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b1 */
    public final Calendar m101996b1() {
        Object value = this.f103808L.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Calendar) value;
    }

    /* JADX INFO: renamed from: c1 */
    public final List<Integer> m101997c1() {
        ArrayList arrayList = new ArrayList();
        if (!this.f103801E) {
            Calendar calendar = Calendar.getInstance();
            Intrinsics.checkNotNullExpressionValue(calendar, "getInstance(...)");
            int iM101979D1 = m101979D1(calendar, 1);
            int i11 = TXVodConstants.VOD_PLAY_EVT_SEEK_COMPLETE;
            if (2019 <= iM101979D1) {
                while (true) {
                    arrayList.add(Integer.valueOf(i11));
                    if (i11 == iM101979D1) {
                        break;
                    }
                    i11++;
                }
            }
        } else {
            int iM101979D2 = m101979D1(m101994Z0(), 1);
            int iM101979D3 = m101979D1(m101993Y0(), 1);
            if (iM101979D2 <= iM101979D3) {
                while (true) {
                    arrayList.add(Integer.valueOf(iM101979D2));
                    if (iM101979D2 == iM101979D3) {
                        break;
                    }
                    iM101979D2++;
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: B1 */
    public static final Calendar m101929B1() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.set(14, 999);
        return calendar;
    }

    /* JADX INFO: renamed from: C1 */
    public static final Calendar m101931C1(C46243x0 c46243x0) {
        Calendar calendar = Calendar.getInstance(c46243x0.m101993Y0().getTimeZone());
        calendar.setTimeInMillis(c46243x0.m101993Y0().getTimeInMillis());
        calendar.add(2, -6);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar;
    }

    /* JADX INFO: renamed from: F1 */
    public static final Calendar m101935F1(C46243x0 c46243x0) {
        Calendar calendar = Calendar.getInstance(c46243x0.m101992X0().getTimeZone());
        if (c46243x0.f103801E) {
            calendar.setTimeInMillis(c46243x0.m101993Y0().getTimeInMillis());
        }
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.add(5, -29);
        if (c46243x0.f103801E) {
            Intrinsics.checkNotNull(calendar);
            c46243x0.m101988S0(calendar);
        }
        return calendar;
    }

    /* JADX INFO: renamed from: J0 */
    public static final C42725a m101939J0(C46243x0 c46243x0) {
        return C42725a.m93621a(c46243x0.m96292A());
    }

    /* JADX INFO: renamed from: T0 */
    public static final Calendar m101943T0(C46243x0 c46243x0) {
        Calendar calendar = Calendar.getInstance();
        if (c46243x0.f103801E) {
            calendar.setTimeInMillis(c46243x0.m101993Y0().getTimeInMillis());
            return calendar;
        }
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.set(14, 999);
        return calendar;
    }

    /* JADX INFO: renamed from: e1 */
    public static final void m101944e1(C46243x0 c46243x0, View view) {
        c46243x0.m96331y();
    }

    /* JADX INFO: renamed from: f1 */
    public static final Unit m101945f1(C46243x0 c46243x0) {
        c46243x0.m101989U0().f94554b.clearCheck();
        c46243x0.m101989U0().f94559g.check(R$id.threeMonth);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g1 */
    public static final Unit m101946g1(C46243x0 c46243x0) {
        long timeInMillis = c46243x0.m101990V0().getTimeInMillis();
        long timeInMillis2 = c46243x0.m101992X0().getTimeInMillis();
        long timeInMillis3 = c46243x0.m101996b1().getTimeInMillis();
        if (c46243x0.m101989U0().f94560h.isChecked()) {
            c46243x0.f103802F.invoke(new C46198c(R$id.sevenDay));
            c46243x0.m96331y();
        } else if (c46243x0.m101989U0().f94558f.isChecked()) {
            c46243x0.f103802F.invoke(new C46198c(R$id.oneMonth));
            c46243x0.m96331y();
        } else if (c46243x0.m101989U0().f94562j.isChecked()) {
            c46243x0.f103802F.invoke(new C46198c(R$id.threeMonth));
            c46243x0.m96331y();
        } else if (c46243x0.f103801E && timeInMillis3 < c46243x0.m101994Z0().getTimeInMillis()) {
            ToastCompat.m66437C(R$string.failed);
        } else if ((c46243x0.f103801E && timeInMillis2 > c46243x0.m101993Y0().getTimeInMillis()) || (!c46243x0.f103801E && timeInMillis2 > timeInMillis)) {
            ToastCompat.m66437C(R$string.end_time_less_current_time);
        } else if (timeInMillis2 <= timeInMillis3) {
            ToastCompat.m66437C(R$string.start_time_less_end_time);
        } else if (timeInMillis2 - timeInMillis3 > 7776000000L) {
            ToastCompat.m66437C(R$string.time_less_90_days);
        } else {
            c46243x0.f103802F.invoke(new C46195b(timeInMillis3, timeInMillis2));
            c46243x0.m96331y();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i1 */
    public static final void m101947i1(C46243x0 c46243x0, RadioGroup radioGroup, int i11) {
        Intrinsics.checkNotNull(radioGroup);
        if (c46243x0.m101978A1(radioGroup)) {
            c46243x0.m101980E1(c46243x0.m101989U0().f94554b, new Function1() { // from class: xh.f0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C46243x0.m101948j1((RadioGroup) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: k1 */
    public static final void m101950k1(C46243x0 c46243x0, RadioGroup radioGroup, int i11) {
        boolean z11;
        Intrinsics.checkNotNull(radioGroup);
        if (c46243x0.m101978A1(radioGroup)) {
            c46243x0.m101980E1(c46243x0.m101989U0().f94559g, new Function1() { // from class: xh.g0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C46243x0.m101952l1((RadioGroup) obj);
                }
            });
        }
        if (i11 == R$id.start) {
            c46243x0.m102002u1(c46243x0.m101996b1());
        }
        if (i11 == R$id.end) {
            c46243x0.m102002u1(c46243x0.m101992X0());
        }
        ConstraintLayout wheelLayout = c46243x0.m101989U0().f94568p;
        Intrinsics.checkNotNullExpressionValue(wheelLayout, "wheelLayout");
        if (i11 != -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        C27046k.m66684G(wheelLayout, z11);
    }

    /* JADX INFO: renamed from: z1 */
    public static final void m101977z1(Function1 function1, List list, int i11) {
        function1.invoke(list.get(i11));
    }

    /* JADX INFO: renamed from: A1 */
    public final boolean m101978A1(View view) {
        Boolean bool;
        Object tag = view.getTag();
        if (tag instanceof Boolean) {
            bool = (Boolean) tag;
        } else {
            bool = null;
        }
        return !Intrinsics.areEqual(bool, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: G1 */
    public final void m101981G1(int i11, int i12) {
        RadioButton start = m101989U0().f94561i;
        Intrinsics.checkNotNullExpressionValue(start, "start");
        RadioButton end = m101989U0().f94556d;
        Intrinsics.checkNotNullExpressionValue(end, "end");
        if (start.isChecked()) {
            m101982H1(m101996b1(), i11, i12);
            if (this.f103801E) {
                m101988S0(m101996b1());
            }
            start.setText(C42179a.m92629b(m101996b1().getTime().getTime(), null, false, null, false, 15, null));
        }
        if (end.isChecked()) {
            m101982H1(m101992X0(), i11, i12);
            if (this.f103801E) {
                m101988S0(m101992X0());
            }
            end.setText(C42179a.m92629b(m101992X0().getTime().getTime(), null, false, null, false, 15, null));
        }
    }

    /* JADX INFO: renamed from: L0 */
    public final void m101984L0() {
        WheelView year = m101989U0().f94569q;
        Intrinsics.checkNotNullExpressionValue(year, "year");
        WheelView month = m101989U0().f94557e;
        Intrinsics.checkNotNullExpressionValue(month, "month");
        Object item = year.getAdapter().getItem(year.getCurrentItem());
        Intrinsics.checkNotNull(item, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) item).intValue();
        Object item2 = month.getAdapter().getItem(month.getCurrentItem());
        Intrinsics.checkNotNull(item2, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue2 = ((Integer) item2).intValue();
        List<Integer> listM101995a1 = m101995a1(iIntValue);
        if (listM101995a1.isEmpty()) {
            return;
        }
        if (listM101995a1.size() == month.getAdapter().mo85927a() && CollectionsKt.contains(listM101995a1, month.getAdapter().getItem(month.getCurrentItem()))) {
            m101985N0();
        } else {
            m101969v1(this, month, RangesKt.coerceIn(iIntValue2, ((Number) CollectionsKt.first((List) listM101995a1)).intValue(), ((Number) CollectionsKt.last((List) listM101995a1)).intValue()), listM101995a1, false, new Function1() { // from class: xh.l0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C46243x0.m101940M0(this.f103780b, ((Integer) obj).intValue());
                }
            }, 8, null);
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final void m101985N0() {
        WheelView year = m101989U0().f94569q;
        Intrinsics.checkNotNullExpressionValue(year, "year");
        WheelView month = m101989U0().f94557e;
        Intrinsics.checkNotNullExpressionValue(month, "month");
        WheelView day = m101989U0().f94555c;
        Intrinsics.checkNotNullExpressionValue(day, "day");
        Object item = year.getAdapter().getItem(year.getCurrentItem());
        Intrinsics.checkNotNull(item, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) item).intValue();
        Object item2 = month.getAdapter().getItem(month.getCurrentItem());
        Intrinsics.checkNotNull(item2, "null cannot be cast to non-null type kotlin.Int");
        List<Integer> listM101991W0 = m101991W0(iIntValue, ((Integer) item2).intValue());
        if (!listM101991W0.isEmpty()) {
            Object item3 = day.getAdapter().getItem(day.getCurrentItem());
            Intrinsics.checkNotNull(item3, "null cannot be cast to non-null type kotlin.Int");
            Integer num = (Integer) item3;
            int iIntValue2 = num.intValue();
            if (listM101991W0.size() == day.getAdapter().mo85927a() && listM101991W0.contains(num)) {
                return;
            }
            m101969v1(this, day, RangesKt.coerceIn(iIntValue2, ((Number) CollectionsKt.first((List) listM101991W0)).intValue(), ((Number) CollectionsKt.last((List) listM101991W0)).intValue()), listM101991W0, false, new Function1() { // from class: xh.o0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C46243x0.m101941O0(this.f103787b, ((Integer) obj).intValue());
                }
            }, 8, null);
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final void m101986P0() {
        WheelView year = m101989U0().f94569q;
        Intrinsics.checkNotNullExpressionValue(year, "year");
        WheelView month = m101989U0().f94557e;
        Intrinsics.checkNotNullExpressionValue(month, "month");
        WheelView day = m101989U0().f94555c;
        Intrinsics.checkNotNullExpressionValue(day, "day");
        Object item = year.getAdapter().getItem(year.getCurrentItem());
        Intrinsics.checkNotNull(item, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) item).intValue();
        Object item2 = month.getAdapter().getItem(month.getCurrentItem());
        Intrinsics.checkNotNull(item2, "null cannot be cast to non-null type kotlin.Int");
        List<Integer> listM101991W0 = m101991W0(iIntValue, ((Integer) item2).intValue());
        if (listM101991W0.size() == day.getAdapter().mo85927a() && CollectionsKt.contains(listM101991W0, day.getAdapter().getItem(day.getCurrentItem()))) {
            return;
        }
        Object item3 = day.getAdapter().getItem(day.getCurrentItem());
        Intrinsics.checkNotNull(item3, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue2 = ((Integer) item3).intValue();
        Object objMaxOrNull = CollectionsKt.maxOrNull((Iterable<? extends Object>) listM101991W0);
        Intrinsics.checkNotNull(objMaxOrNull);
        m101969v1(this, day, RangesKt.coerceAtMost(iIntValue2, ((Number) objMaxOrNull).intValue()), listM101991W0, false, new Function1() { // from class: xh.n0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C46243x0.m101942Q0(this.f103785b, ((Integer) obj).intValue());
            }
        }, 8, null);
    }

    /* JADX INFO: renamed from: V0 */
    public final Calendar m101990V0() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.set(14, 999);
        Intrinsics.checkNotNullExpressionValue(calendar, "apply(...)");
        return calendar;
    }

    /* JADX INFO: renamed from: d1 */
    public final void m101998d1() {
        m101989U0().f94567o.setOnClickListener(new View.OnClickListener() { // from class: xh.v0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C46243x0.m101944e1(this.f103795b, view);
            }
        });
        KcSecondaryButton tvReset = m101989U0().f94565m;
        Intrinsics.checkNotNullExpressionValue(tvReset, "tvReset");
        C27046k.m66711z(tvReset, 0L, new Function0() { // from class: xh.w0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C46243x0.m101945f1(this.f103797b);
            }
        }, 1, null);
        KcPrimaryButton tvConfirm = m101989U0().f94564l;
        Intrinsics.checkNotNullExpressionValue(tvConfirm, "tvConfirm");
        C27046k.m66711z(tvConfirm, 0L, new Function0() { // from class: xh.z
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C46243x0.m101946g1(this.f103812b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: h1 */
    public final void m101999h1() {
        m101989U0().f94559g.check(R$id.threeMonth);
        m101989U0().f94559g.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: xh.y
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i11) {
                C46243x0.m101947i1(this.f103810b, radioGroup, i11);
            }
        });
        if (this.f103800D instanceof C46195b) {
            m101996b1().setTimeInMillis(((C46195b) this.f103800D).getF103727a());
            m101992X0().setTimeInMillis(((C46195b) this.f103800D).getF103728b());
            if (this.f103801E) {
                m101988S0(m101996b1());
                m101988S0(m101992X0());
            }
        }
        m101989U0().f94561i.setText(C42179a.m92629b(m101996b1().getTime().getTime(), null, false, null, false, 15, null));
        m101989U0().f94556d.setText(C42179a.m92629b(m101992X0().getTime().getTime(), null, false, null, false, 15, null));
        m101989U0().f94554b.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: xh.j0
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i11) {
                C46243x0.m101950k1(this.f103755b, radioGroup, i11);
            }
        });
        InterfaceC46192a interfaceC46192a = this.f103800D;
        if (interfaceC46192a instanceof C46195b) {
            m101980E1(m101989U0().f94559g, new Function1() { // from class: xh.p0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C46243x0.m101954m1((RadioGroup) obj);
                }
            });
            m101980E1(m101989U0().f94554b, new Function1() { // from class: xh.q0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C46243x0.m101956n1((RadioGroup) obj);
                }
            });
        } else if (interfaceC46192a instanceof C46198c) {
            m101980E1(m101989U0().f94559g, new Function1() { // from class: xh.r0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C46243x0.m101958o1(this.f103791b, (RadioGroup) obj);
                }
            });
            m101980E1(m101989U0().f94554b, new Function1() { // from class: xh.s0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C46243x0.m101960p1((RadioGroup) obj);
                }
            });
        } else {
            m101980E1(m101989U0().f94559g, new Function1() { // from class: xh.t0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C46243x0.m101962q1((RadioGroup) obj);
                }
            });
            m101980E1(m101989U0().f94554b, new Function1() { // from class: xh.u0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C46243x0.m101964r1((RadioGroup) obj);
                }
            });
        }
    }

    @Override // qe0.C43724b, qe0.AbstractC43723a
    /* JADX INFO: renamed from: i0 */
    public void mo25306H(@Nullable View view, @Nullable C43724b c43724b) {
        super.mo25306H(view, c43724b);
        m102000s1();
        m101998d1();
        m101999h1();
    }

    /* JADX INFO: renamed from: s1 */
    public final void m102000s1() {
        BaseTextView tvScopeDesc = m101989U0().f94566n;
        Intrinsics.checkNotNullExpressionValue(tvScopeDesc, "tvScopeDesc");
        C27046k.m66684G(tvScopeDesc, this.f103801E);
        if (!this.f103801E) {
            return;
        }
        m101989U0().f94566n.setTextColor(C27017c.f54310a.m66512a(R$color.c_text40));
        m101989U0().f94566n.setText(m101983K0());
    }

    /* JADX INFO: renamed from: t1 */
    public final void m102001t1(WheelView wheelView, int i11, final List<Integer> list, boolean z11, final Function1<? super Integer, Unit> function1) {
        wheelView.setCyclic(z11);
        wheelView.setAdapter(new a(list));
        wheelView.setOnItemSelectedListener(new InterfaceC40189b() { // from class: xh.m0
            @Override // p350ix.InterfaceC40189b
            /* JADX INFO: renamed from: a */
            public final void mo88537a(int i12) {
                C46243x0.m101977z1(function1, list, i12);
            }
        });
        wheelView.setCurrentItem(wheelView.getAdapter().indexOf(Integer.valueOf(i11)));
        wheelView.m55614m();
        wheelView.setLineSpacingMultiplier(1.7f);
        wheelView.setDividerColor(0);
        C27017c c27017c = C27017c.f54310a;
        int i12 = R$color.c_text;
        wheelView.setTextColorCenter(c27017c.m66512a(i12));
        wheelView.setTextColorOut(c27017c.m66512a(i12));
        wheelView.setTextSize(16.0f);
    }

    /* JADX INFO: renamed from: u1 */
    public final void m102002u1(Calendar calendar) {
        int i11;
        WheelView wheelView = m101989U0().f94569q;
        int i12 = 3;
        if (C5303w0.m6511a()) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        wheelView.setGravity(i11);
        Intrinsics.checkNotNullExpressionValue(wheelView, "apply(...)");
        m102001t1(wheelView, m101979D1(calendar, 1), m101997c1(), false, new Function1() { // from class: xh.h0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C46243x0.m101971w1(this.f103750b, ((Integer) obj).intValue());
            }
        });
        WheelView month = m101989U0().f94557e;
        Intrinsics.checkNotNullExpressionValue(month, "month");
        m101969v1(this, month, m101979D1(calendar, 2), m101995a1(m101979D1(calendar, 1)), false, new Function1() { // from class: xh.i0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C46243x0.m101973x1(this.f103752b, ((Integer) obj).intValue());
            }
        }, 8, null);
        WheelView wheelView2 = m101989U0().f94555c;
        if (!C5303w0.m6511a()) {
            i12 = 5;
        }
        wheelView2.setGravity(i12);
        Intrinsics.checkNotNullExpressionValue(wheelView2, "apply(...)");
        m101969v1(this, wheelView2, m101979D1(calendar, 5), m101991W0(m101979D1(calendar, 1), m101979D1(calendar, 2)), false, new Function1() { // from class: xh.k0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C46243x0.m101975y1(this.f103777b, ((Integer) obj).intValue());
            }
        }, 8, null);
    }
}
