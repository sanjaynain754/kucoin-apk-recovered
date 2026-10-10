package p567qo;

import com.kubi.loan.R$string;
import com.kubi.loan.view.LeverInputViewNew;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: qo.z */
/* JADX INFO: compiled from: LeverInputViewNew.kt */
/* JADX INFO: loaded from: classes26.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m90084d2 = {"Lcom/kubi/loan/view/ReturnInputHelperNew;", "Lcom/kubi/loan/view/LeverInputHelperNew;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Lcom/kubi/loan/view/LeverInputViewNew;", "<init>", "(Lcom/kubi/loan/view/LeverInputViewNew;)V", "inputTips", "", "emptyCheck", "", "LoanLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C43820z extends AbstractC43805k {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43820z(@NotNull LeverInputViewNew view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
    }

    /* JADX INFO: renamed from: y */
    public static final Unit m96499y(C43820z c43820z, BigDecimal it) {
        Intrinsics.checkNotNullParameter(it, "it");
        LeverInputViewNew f96860a = c43820z.getF96860a();
        String string = c43820z.getF96860a().getContext().getString(R$string.return_exceed);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        f96860a.m37808h(true, string);
        Function1<Boolean, Unit> function1M96482j = c43820z.m96482j();
        if (function1M96482j != null) {
            function1M96482j.invoke(Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z */
    public static final Unit m96500z(C43820z c43820z, BigDecimal it) {
        Intrinsics.checkNotNullParameter(it, "it");
        LeverInputViewNew f96860a = c43820z.getF96860a();
        String string = c43820z.getF96860a().getContext().getString(R$string.available_amount_insufficient);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        f96860a.m37808h(true, string);
        Function1<Boolean, Unit> function1M96482j = c43820z.m96482j();
        if (function1M96482j != null) {
            function1M96482j.invoke(Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }

    @Override // p567qo.AbstractC43805k
    /* JADX INFO: renamed from: n */
    public void mo96467n(boolean z11) {
        Function1 function1 = new Function1() { // from class: qo.w
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C43820z.m96499y(this.f96886b, (BigDecimal) obj);
            }
        };
        Function1 function2 = new Function1() { // from class: qo.x
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C43820z.m96500z(this.f96887b, (BigDecimal) obj);
            }
        };
        Function0 function0 = new Function0() { // from class: qo.y
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C43820z.m96495A(this.f96888b);
            }
        };
        C43816v f96863d = getF96863d();
        if (f96863d == null) {
            function0.invoke();
            return;
        }
        if (C41014a.m89927a(C43801g.m96470a(), getF96860a().getData())) {
            return;
        }
        if (f96863d.getF96884b().compareTo(getF96860a().getData()) < 0) {
            function1.invoke(f96863d.getF96884b());
        } else if (f96863d.getF96885c().compareTo(getF96860a().getData()) < 0) {
            function2.invoke(f96863d.getF96885c());
        }
    }

    /* JADX INFO: renamed from: A */
    public static final Unit m96495A(C43820z c43820z) {
        LeverInputViewNew.m37804i(c43820z.getF96860a(), false, null, 2, null);
        Function1<Boolean, Unit> function1M96482j = c43820z.m96482j();
        if (function1M96482j == null) {
            return null;
        }
        function1M96482j.invoke(Boolean.FALSE);
        return Unit.INSTANCE;
    }
}
