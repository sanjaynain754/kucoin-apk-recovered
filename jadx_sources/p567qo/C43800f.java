package p567qo;

import android.content.Context;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.kubi.loan.R$string;
import com.kubi.loan.view.LeverInputViewNew;
import com.kubi.utils.C27056j0;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: qo.f */
/* JADX INFO: compiled from: LeverInputViewNew.kt */
/* JADX INFO: loaded from: classes26.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R(\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR*\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\r@VX\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/loan/view/BorrowInputHelperNew;", "Lcom/kubi/loan/view/LeverInputHelperNew;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Lcom/kubi/loan/view/LeverInputViewNew;", "<init>", "(Lcom/kubi/loan/view/LeverInputViewNew;)V", "value", "Lcom/kubi/loan/view/Range;", SessionDescription.ATTR_RANGE, "getRange", "()Lcom/kubi/loan/view/Range;", "setRange", "(Lcom/kubi/loan/view/Range;)V", "", "precision", "getPrecision", "()Ljava/lang/Integer;", "setPrecision", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "inputTips", "", "emptyCheck", "", "LoanLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C43800f extends AbstractC43805k {

    /* JADX INFO: renamed from: h */
    @Nullable
    public C43816v f96853h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public Integer f96854i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43800f(@NotNull LeverInputViewNew view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
    }

    /* JADX INFO: renamed from: A */
    public static final Unit m96455A(C43800f c43800f, BigDecimal it) {
        Intrinsics.checkNotNullParameter(it, "it");
        LeverInputViewNew f96860a = c43800f.getF96860a();
        String string = c43800f.getF96860a().getContext().getString(R$string.remain_borrow_amount, C42180b.m92640e(it, null, 20, false, false, false, 0, null, 125, null));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        f96860a.m37808h(true, string);
        Function1<Boolean, Unit> function1M96482j = c43800f.m96482j();
        if (function1M96482j != null) {
            function1M96482j.invoke(Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B */
    public static final Unit m96456B(C43800f c43800f, BigDecimal it) {
        Intrinsics.checkNotNullParameter(it, "it");
        LeverInputViewNew f96860a = c43800f.getF96860a();
        String string = c43800f.getF96860a().getContext().getString(R$string.min_borrow, C42180b.m92640e(it, null, 20, false, false, false, 0, null, 125, null));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        f96860a.m37808h(true, string);
        Function1<Boolean, Unit> function1M96482j = c43800f.m96482j();
        if (function1M96482j != null) {
            function1M96482j.invoke(Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }

    @Override // p567qo.AbstractC43805k
    @Nullable
    /* JADX INFO: renamed from: k, reason: from getter */
    public Integer getF96854i() {
        return this.f96854i;
    }

    @Override // p567qo.AbstractC43805k
    @Nullable
    /* JADX INFO: renamed from: l, reason: from getter */
    public C43816v getF96853h() {
        return this.f96853h;
    }

    @Override // p567qo.AbstractC43805k
    /* JADX INFO: renamed from: n */
    public void mo96467n(boolean z11) {
        Function1 function1 = new Function1() { // from class: qo.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C43800f.m96455A(this.f96848b, (BigDecimal) obj);
            }
        };
        Function1 function2 = new Function1() { // from class: qo.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C43800f.m96456B(this.f96849b, (BigDecimal) obj);
            }
        };
        Function0 function0 = new Function0() { // from class: qo.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C43800f.m96457C(this.f96850b);
            }
        };
        Function0 function3 = new Function0() { // from class: qo.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C43800f.m96458D(this.f96851b);
            }
        };
        Function0 function4 = new Function0() { // from class: qo.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C43800f.m96459E(this.f96852b);
            }
        };
        C43816v f96853h = getF96853h();
        if (f96853h == null) {
            function3.invoke();
            return;
        }
        if (C41014a.m89927a(C43801g.m96470a(), getF96860a().getData()) && z11) {
            function0.invoke();
            return;
        }
        if (C41014a.m89927a(C43801g.m96470a(), getF96860a().getData()) && !z11) {
            return;
        }
        if (f96853h.getF96883a().compareTo(getF96860a().getData()) > 0) {
            function2.invoke(f96853h.getF96883a());
            return;
        }
        if (f96853h.getF96884b().compareTo(getF96860a().getData()) < 0) {
            function1.invoke(f96853h.getF96884b());
        } else if (C41014a.m89918C(getF96860a().getData(), C41014a.m89922G(getF96866g(), null, 1, null))) {
        } else {
            function4.invoke();
        }
    }

    @Override // p567qo.AbstractC43805k
    /* JADX INFO: renamed from: s */
    public void mo96468s(@Nullable Integer num) {
        this.f96854i = num;
        getF96860a().getInput().setFilters(new C27056j0[]{new C27056j0(num != null ? num.intValue() : 10)});
    }

    @Override // p567qo.AbstractC43805k
    /* JADX INFO: renamed from: t */
    public void mo96469t(@Nullable C43816v c43816v) {
        this.f96853h = c43816v;
        mo96467n(false);
    }

    /* JADX INFO: renamed from: C */
    public static final Unit m96457C(C43800f c43800f) {
        if (c43800f.getF96865f() == null) {
            LeverInputViewNew.m37804i(c43800f.getF96860a(), false, null, 2, null);
        } else {
            LeverInputViewNew f96860a = c43800f.getF96860a();
            String f96865f = c43800f.getF96865f();
            Intrinsics.checkNotNull(f96865f);
            f96860a.m37808h(true, f96865f);
        }
        Function1<Boolean, Unit> function1M96482j = c43800f.m96482j();
        if (function1M96482j != null) {
            function1M96482j.invoke(Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D */
    public static final Unit m96458D(C43800f c43800f) {
        LeverInputViewNew.m37804i(c43800f.getF96860a(), false, null, 2, null);
        Function1<Boolean, Unit> function1M96482j = c43800f.m96482j();
        if (function1M96482j == null) {
            return null;
        }
        function1M96482j.invoke(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E */
    public static final Unit m96459E(C43800f c43800f) {
        String strM92640e;
        LeverInputViewNew f96860a = c43800f.getF96860a();
        Context context = c43800f.getF96860a().getContext();
        int i11 = R$string.margin_borrow_min_unit_hint;
        BigDecimal f96866g = c43800f.getF96866g();
        if (f96866g != null) {
            strM92640e = C42180b.m92640e(f96866g, null, 20, false, false, false, 0, null, 125, null);
        } else {
            strM92640e = null;
        }
        String string = context.getString(i11, strM92640e);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        f96860a.m37808h(true, string);
        Function1<Boolean, Unit> function1M96482j = c43800f.m96482j();
        if (function1M96482j != null) {
            function1M96482j.invoke(Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }
}
