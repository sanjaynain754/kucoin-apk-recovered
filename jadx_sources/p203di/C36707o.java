package p203di;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.PopupWindow;
import androidx.annotation.ColorRes;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.graphics.drawable.DrawableCompat;
import com.kubi.kumex.utils.RotateDrawable;
import com.kubi.tradebase.R$color;
import com.kubi.tradebase.R$id;
import com.kubi.tradebase.R$mipmap;
import com.kubi.tradebase.R$string;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Date;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42179a;
import p761xh.C46195b;
import p761xh.C46198c;
import p761xh.C46243x0;
import p761xh.InterfaceC46192a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: di.o */
/* JADX INFO: compiled from: TimeClickFilter.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\u0013\u001a\u00020\u00122\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011J\u0016\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016J\u0006\u0010\u0018\u001a\u00020\u0016J\u0006\u0010\u0019\u001a\u00020\u0016J\b\u0010\u001a\u001a\u00020\u0012H\u0002J\u0010\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u0007H\u0002J\b\u0010\u001d\u001a\u00020\u0007H\u0002J\f\u0010\u001e\u001a\u00020\u001f*\u00020\u0007H\u0002J\f\u0010 \u001a\u00020\u001f*\u00020\u0007H\u0002J\f\u0010!\u001a\u00020\u001f*\u00020\u0007H\u0002J\u0016\u0010\"\u001a\u00020#*\u00020#2\b\b\u0001\u0010$\u001a\u00020\u001fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, m90084d2 = {"Lcom/kubi/futures/history/filter/TimeClickFilter;", "", "clickView", "Landroidx/appcompat/widget/AppCompatTextView;", "anchorView", "Landroid/view/View;", "isContractDataQuery", "", "<init>", "(Landroidx/appcompat/widget/AppCompatTextView;Landroid/view/View;Z)V", "value", "Lcom/kubi/futures/dialog/pop/BaseTime;", "time", "getTime", "()Lcom/kubi/futures/dialog/pop/BaseTime;", "alreadySelected", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lkotlin/Function0;", "", "initAndRegisterSelectAction", "setTime", "startTime", "", "endTime", "getStartTime", "getEndTime", "performClick", "setTimeShow", "selected", "isThreeMonth", "toAngle", "", "toTriangleColor", "toColor", "drawableTint", "Landroid/graphics/drawable/Drawable;", "colorRes", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C36707o {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final AppCompatTextView f79615a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final View f79616b;

    /* JADX INFO: renamed from: c */
    public final boolean f79617c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public InterfaceC46192a f79618d;

    /* JADX INFO: renamed from: e */
    public boolean f79619e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public Function0<Unit> f79620f;

    public C36707o(@NotNull AppCompatTextView clickView, @NotNull View anchorView, boolean z11) {
        Intrinsics.checkNotNullParameter(clickView, "clickView");
        Intrinsics.checkNotNullParameter(anchorView, "anchorView");
        this.f79615a = clickView;
        this.f79616b = anchorView;
        this.f79617c = z11;
        this.f79618d = new C46198c(R$id.threeMonth);
    }

    /* JADX INFO: renamed from: m */
    public static final void m82206m(C36707o c36707o) {
        c36707o.m82215o(false);
    }

    /* JADX INFO: renamed from: k */
    public final void m82213k() {
        m82215o(true);
        Context context = this.f79616b.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        new C46243x0(context, this.f79618d, this.f79617c, new Function1() { // from class: di.m
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C36707o.m82205l(this.f79613b, (InterfaceC46192a) obj);
            }
        }).m96315Y(new PopupWindow.OnDismissListener() { // from class: di.n
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                C36707o.m82206m(this.f79614b);
            }
        }).mo54253b0(this.f79616b);
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m82205l(C36707o c36707o, InterfaceC46192a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        c36707o.f79619e = true;
        c36707o.f79618d = it;
        Function0<Unit> function0 = c36707o.f79620f;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public final long m82208e() {
        return this.f79618d.getF103728b();
    }

    /* JADX INFO: renamed from: f */
    public final long m82209f() {
        return this.f79618d.getF103727a();
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final InterfaceC46192a getF79618d() {
        return this.f79618d;
    }

    /* JADX INFO: renamed from: h */
    public final void m82211h(@NotNull Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f79620f = action;
        m82215o(false);
        C27046k.m66711z(this.f79615a, 0L, new Function0() { // from class: di.l
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C36707o.m82204i(this.f79612b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m82212j() {
        InterfaceC46192a interfaceC46192a = this.f79618d;
        C46198c c46198c = interfaceC46192a instanceof C46198c ? (C46198c) interfaceC46192a : null;
        return c46198c != null && c46198c.getF103729a() == R$id.threeMonth;
    }

    /* JADX INFO: renamed from: n */
    public final void m82214n(long j11, long j12) {
        this.f79618d = new C46195b(j11, j12);
        m82215o(false);
    }

    /* JADX INFO: renamed from: o */
    public final void m82215o(boolean z11) {
        String strM66516f;
        InterfaceC46192a interfaceC46192a = this.f79618d;
        if (interfaceC46192a instanceof C46198c) {
            Intrinsics.checkNotNull(interfaceC46192a, "null cannot be cast to non-null type com.kubi.futures.dialog.pop.RangeTime");
            int f103729a = ((C46198c) interfaceC46192a).getF103729a();
            if (f103729a == R$id.sevenDay) {
                strM66516f = C27017c.f54310a.m66516f(R$string.seven_day, new Object[0]);
            } else {
                strM66516f = f103729a == R$id.oneMonth ? C27017c.f54310a.m66516f(R$string.one_month, new Object[0]) : C27017c.f54310a.m66516f(R$string.three_month, new Object[0]);
            }
        } else {
            InterfaceC46192a interfaceC46192a2 = this.f79618d;
            Intrinsics.checkNotNull(interfaceC46192a2, "null cannot be cast to non-null type com.kubi.futures.dialog.pop.CustomTime");
            Date date = new Date(((C46195b) interfaceC46192a2).m101861d());
            InterfaceC46192a interfaceC46192a3 = this.f79618d;
            Intrinsics.checkNotNull(interfaceC46192a3, "null cannot be cast to non-null type com.kubi.futures.dialog.pop.CustomTime");
            strM66516f = C42179a.m92629b(date.getTime(), null, true, null, false, 13, null) + " - " + C42179a.m92629b(new Date(((C46195b) interfaceC46192a3).m101860c()).getTime(), null, true, null, false, 13, null);
        }
        AppCompatTextView appCompatTextView = this.f79615a;
        C27096v0 c27096v0 = new C27096v0();
        C27017c c27017c = C27017c.f54310a;
        appCompatTextView.setText(c27096v0.m66905e(strM66516f, c27017c.m66512a(m82217q(this.f79619e && !m82212j()))));
        RotateDrawable rotateDrawable = new RotateDrawable(m82207d(C27017c.m66510d(c27017c, R$mipmap.ic_drop_triangle, null, 2, null), m82218r(z11)), m82216p(z11));
        rotateDrawable.setBounds(0, 0, rotateDrawable.getMinimumWidth(), rotateDrawable.getMinimumHeight());
        this.f79615a.setCompoundDrawablesRelative(null, null, rotateDrawable, null);
    }

    /* JADX INFO: renamed from: p */
    public final int m82216p(boolean z11) {
        return z11 ? 180 : 0;
    }

    /* JADX INFO: renamed from: q */
    public final int m82217q(boolean z11) {
        return z11 ? R$color.primary : R$color.c_text40;
    }

    /* JADX INFO: renamed from: r */
    public final int m82218r(boolean z11) {
        return z11 ? R$color.primary : R$color.c_icon60;
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m82204i(C36707o c36707o) {
        c36707o.m82213k();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public final Drawable m82207d(Drawable drawable, @ColorRes int i11) {
        Drawable drawableWrap = DrawableCompat.wrap(drawable.mutate());
        Intrinsics.checkNotNullExpressionValue(drawableWrap, "wrap(...)");
        DrawableCompat.setTint(drawableWrap, C27017c.f54310a.m66512a(i11));
        return drawableWrap;
    }

    public /* synthetic */ C36707o(AppCompatTextView appCompatTextView, View view, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(appCompatTextView, view, (i11 & 4) != 0 ? false : z11);
    }
}
