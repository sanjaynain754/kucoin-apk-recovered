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
import com.kubi.tradebase.R$mipmap;
import com.kubi.tradebase.R$string;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p761xh.C46203d1;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: di.s */
/* JADX INFO: compiled from: TradeTypeClickFilter.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\b\u0010\u000f\u001a\u0004\u0018\u00010\tJ\b\u0010\u0010\u001a\u00020\fH\u0002J\u0010\u0010\u0011\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H&J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\f\u0010\u0018\u001a\u00020\u0019*\u00020\u0017H\u0002J\f\u0010\u001a\u001a\u00020\u0019*\u00020\u0017H\u0002J\f\u0010\u001b\u001a\u00020\u0019*\u00020\u0017H\u0002J\u0016\u0010\u001c\u001a\u00020\u001d*\u00020\u001d2\b\b\u0001\u0010\u001e\u001a\u00020\u0019H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/futures/history/filter/TradeTypeClickFilter;", "", "clickView", "Landroidx/appcompat/widget/AppCompatTextView;", "anchorView", "Landroid/view/View;", "<init>", "(Landroidx/appcompat/widget/AppCompatTextView;Landroid/view/View;)V", "tradeType", "", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lkotlin/Function0;", "", "initAndRegisterSelectAction", "initTradeType", "getTradeType", "performClick", "setCurTypeProgrammatic", "buildTradeTypeList", "", "Lcom/kubi/futures/dialog/pop/SelectTradeTypeOfHistoryPopup$TradeTypeAdapter$TradeTypeIndex;", "setTradeTypeShow", "select", "", "toAngle", "", "toTriangleColor", "toColor", "drawableTint", "Landroid/graphics/drawable/Drawable;", "colorRes", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTradeTypeClickFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeTypeClickFilter.kt\ncom/kubi/futures/history/filter/TradeTypeClickFilter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,104:1\n1869#2,2:105\n*S KotlinDebug\n*F\n+ 1 TradeTypeClickFilter.kt\ncom/kubi/futures/history/filter/TradeTypeClickFilter\n*L\n75#1:105,2\n*E\n"})
public abstract class AbstractC36711s {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final AppCompatTextView f79624a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final View f79625b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public String f79626c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public Function0<Unit> f79627d;

    /* JADX INFO: renamed from: l */
    public static final void m82225l(AbstractC36711s abstractC36711s) {
        abstractC36711s.m82231n(false);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public abstract List<C46203d1.a.TradeTypeIndex> mo65317d();

    /* JADX INFO: renamed from: j */
    public final void m82229j() {
        m82231n(true);
        Context context = this.f79624a.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        new C46203d1(context, this.f79626c, mo65317d(), new Function1() { // from class: di.q
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC36711s.m82224k(this.f79622b, (String) obj);
            }
        }).m96315Y(new PopupWindow.OnDismissListener() { // from class: di.r
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                AbstractC36711s.m82225l(this.f79623b);
            }
        }).mo54253b0(this.f79625b);
    }

    public AbstractC36711s(@NotNull AppCompatTextView clickView, @NotNull View anchorView) {
        Intrinsics.checkNotNullParameter(clickView, "clickView");
        Intrinsics.checkNotNullParameter(anchorView, "anchorView");
        this.f79624a = clickView;
        this.f79625b = anchorView;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m82222h(AbstractC36711s abstractC36711s, String str, Function0 function0, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initAndRegisterSelectAction");
        }
        if ((i11 & 1) != 0) {
            str = null;
        }
        abstractC36711s.m82228g(str, function0);
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m82224k(AbstractC36711s abstractC36711s, String str) {
        abstractC36711s.f79626c = str;
        Function0<Unit> function0 = abstractC36711s.f79627d;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getF79626c() {
        return this.f79626c;
    }

    /* JADX INFO: renamed from: g */
    public final void m82228g(@Nullable String str, @NotNull Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f79626c = str;
        this.f79627d = action;
        m82231n(false);
        C27046k.m66711z(this.f79624a, 0L, new Function0() { // from class: di.p
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC36711s.m82223i(this.f79621b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: m */
    public final void m82230m(@Nullable String str) {
        this.f79626c = str;
        m82231n(false);
        Function0<Unit> function0 = this.f79627d;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m82231n(boolean z11) {
        String strM66516f = C27017c.f54310a.m66516f(R$string.type, new Object[0]);
        for (C46203d1.a.TradeTypeIndex tradeTypeIndex : mo65317d()) {
            if (tradeTypeIndex.getType() != null && Intrinsics.areEqual(tradeTypeIndex.getType(), this.f79626c)) {
                strM66516f = tradeTypeIndex.getDisplayType();
            }
        }
        AppCompatTextView appCompatTextView = this.f79624a;
        C27096v0 c27096v0 = new C27096v0();
        C27017c c27017c = C27017c.f54310a;
        String str = this.f79626c;
        appCompatTextView.setText(c27096v0.m66905e(strM66516f, c27017c.m66512a(m82233p(!(str == null || str.length() == 0)))));
        RotateDrawable rotateDrawable = new RotateDrawable(m82226e(C27017c.m66510d(c27017c, R$mipmap.ic_drop_triangle, null, 2, null), m82234q(z11)), m82232o(z11));
        rotateDrawable.setBounds(0, 0, rotateDrawable.getMinimumWidth(), rotateDrawable.getMinimumHeight());
        this.f79624a.setCompoundDrawablesRelative(null, null, rotateDrawable, null);
    }

    /* JADX INFO: renamed from: o */
    public final int m82232o(boolean z11) {
        return z11 ? 180 : 0;
    }

    /* JADX INFO: renamed from: p */
    public final int m82233p(boolean z11) {
        return z11 ? R$color.primary : R$color.c_text40;
    }

    /* JADX INFO: renamed from: q */
    public final int m82234q(boolean z11) {
        return z11 ? R$color.primary : R$color.c_icon60;
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m82223i(AbstractC36711s abstractC36711s) {
        abstractC36711s.m82229j();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public final Drawable m82226e(Drawable drawable, @ColorRes int i11) {
        Drawable drawableWrap = DrawableCompat.wrap(drawable.mutate());
        Intrinsics.checkNotNullExpressionValue(drawableWrap, "wrap(...)");
        DrawableCompat.setTint(drawableWrap, C27017c.f54310a.m66512a(i11));
        return drawableWrap;
    }
}
