package p203di;

import android.content.Context;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.widget.AppCompatTextView;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.futures.FuturesDisplayNameUtils;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$mipmap;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.utils.RotateDrawable;
import com.kubi.kumex.utils.ViewExKt;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p761xh.C46216k;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import th.InterfaceC44980d;

/* JADX INFO: renamed from: di.g */
/* JADX INFO: compiled from: ContractClickFilter.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\r\u001a\u00020\f2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\b\u0010\u000e\u001a\u0004\u0018\u00010\tJ\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\tJ\b\u0010\u0011\u001a\u00020\fH\u0002J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\f\u0010\u0015\u001a\u00020\u0016*\u00020\u0014H\u0002J\f\u0010\u0017\u001a\u00020\u0016*\u00020\u0014H\u0002J\f\u0010\u0018\u001a\u00020\u0016*\u00020\u0014H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/futures/history/filter/ContractClickFilter;", "", "clickView", "Landroidx/appcompat/widget/AppCompatTextView;", "anchorView", "Landroid/view/View;", "<init>", "(Landroidx/appcompat/widget/AppCompatTextView;Landroid/view/View;)V", "currentSymbol", "", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lkotlin/Function0;", "", "initAndRegisterSelectAction", "getSymbol", "setSymbol", "symbol", "performClick", "setContractShow", "select", "", "toAngle", "", "toTriangleColor", "toColor", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C36699g {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final AppCompatTextView f79594a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final View f79595b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public String f79596c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public Function0<Unit> f79597d;

    /* JADX INFO: renamed from: i */
    public static final void m82172i(C36699g c36699g) {
        c36699g.m82176j(false);
    }

    /* JADX INFO: renamed from: g */
    public final void m82175g() {
        m82176j(true);
        Context context = this.f79595b.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        new C46216k(context, this.f79596c, new Function1() { // from class: di.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C36699g.m82171h(this.f79592b, (String) obj);
            }
        }).m96315Y(new PopupWindow.OnDismissListener() { // from class: di.f
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                C36699g.m82172i(this.f79593b);
            }
        }).mo54253b0(this.f79595b);
    }

    public C36699g(@NotNull AppCompatTextView clickView, @NotNull View anchorView) {
        Intrinsics.checkNotNullParameter(clickView, "clickView");
        Intrinsics.checkNotNullParameter(anchorView, "anchorView");
        this.f79594a = clickView;
        this.f79595b = anchorView;
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m82171h(C36699g c36699g, String str) {
        c36699g.f79596c = str;
        Function0<Unit> function0 = c36699g.f79597d;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getF79596c() {
        return this.f79596c;
    }

    /* JADX INFO: renamed from: e */
    public final void m82174e(@NotNull Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f79597d = action;
        m82176j(false);
        C27046k.m66711z(this.f79594a, 0L, new Function0() { // from class: di.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C36699g.m82170f(this.f79591b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: j */
    public final void m82176j(boolean z11) {
        CharSequence charSequenceM66516f;
        String str = this.f79596c;
        if (str == null || str.length() == 0) {
            charSequenceM66516f = C27017c.f54310a.m66516f(R$string.contract_symbol, new Object[0]);
        } else {
            ContractEntity contractEntityM99529O = InterfaceC44980d.m99529O(RepositoryServiceLocator.f19236a.m20288g(), C27041f.m66668h(this.f79596c), false, 2, null);
            charSequenceM66516f = C27041f.m66667g(contractEntityM99529O != null ? FuturesDisplayNameUtils.f22525a.m24440e(contractEntityM99529O) : null, C27041f.m66668h(this.f79596c));
        }
        AppCompatTextView appCompatTextView = this.f79594a;
        C27096v0 c27096v0 = new C27096v0();
        C27017c c27017c = C27017c.f54310a;
        String str2 = this.f79596c;
        appCompatTextView.setText(c27096v0.m66905e(charSequenceM66516f, c27017c.m66512a(m82179m(!(str2 == null || str2.length() == 0)))));
        RotateDrawable rotateDrawable = new RotateDrawable(ViewExKt.m36481g(C27017c.m66510d(c27017c, R$mipmap.ic_drop_triangle, null, 2, null), m82180n(z11)), m82178l(z11));
        rotateDrawable.setBounds(0, 0, rotateDrawable.getMinimumWidth(), rotateDrawable.getMinimumHeight());
        this.f79594a.setCompoundDrawablesRelative(null, null, rotateDrawable, null);
    }

    /* JADX INFO: renamed from: k */
    public final void m82177k(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.f79596c = symbol;
    }

    /* JADX INFO: renamed from: l */
    public final int m82178l(boolean z11) {
        return z11 ? 180 : 0;
    }

    /* JADX INFO: renamed from: m */
    public final int m82179m(boolean z11) {
        return z11 ? R$color.primary : R$color.c_text40;
    }

    /* JADX INFO: renamed from: n */
    public final int m82180n(boolean z11) {
        return z11 ? R$color.primary : R$color.c_icon60;
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m82170f(C36699g c36699g) {
        c36699g.m82175g();
        return Unit.INSTANCE;
    }
}
