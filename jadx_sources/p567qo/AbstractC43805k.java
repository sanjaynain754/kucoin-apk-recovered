package p567qo;

import android.widget.TextView;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.fasterxml.jackson.databind.node.C6447a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.loan.view.LeverInputViewNew;
import com.kubi.utils.C27056j0;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.math.BigDecimal;
import java.math.RoundingMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p011a9.C0206f;
import p402kf.C41014a;
import p752x8.AbstractC46099a;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: qo.k */
/* JADX INFO: compiled from: LeverInputViewNew.kt */
/* JADX INFO: loaded from: classes26.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\b&\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u00103\u001a\u00020\fJ\u0012\u00104\u001a\u00020\f2\b\b\u0002\u00105\u001a\u00020\u000bH&R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R(\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR*\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u001e@VX\u0096\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0011\u0010%\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u001c\u0010)\u001a\u0004\u0018\u00010*X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001c\u0010/\u001a\u0004\u0018\u00010&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010(\"\u0004\b1\u00102¨\u00066"}, m90084d2 = {"Lcom/kubi/loan/view/LeverInputHelperNew;", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Lcom/kubi/loan/view/LeverInputViewNew;", "<init>", "(Lcom/kubi/loan/view/LeverInputViewNew;)V", "input", "getInput", "()Lcom/kubi/loan/view/LeverInputViewNew;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function1;", "", "", "getListener", "()Lkotlin/jvm/functions/Function1;", "setListener", "(Lkotlin/jvm/functions/Function1;)V", "allListener", "Lkotlin/Function0;", "getAllListener", "()Lkotlin/jvm/functions/Function0;", "setAllListener", "(Lkotlin/jvm/functions/Function0;)V", "value", "Lcom/kubi/loan/view/Range;", SessionDescription.ATTR_RANGE, "getRange", "()Lcom/kubi/loan/view/Range;", "setRange", "(Lcom/kubi/loan/view/Range;)V", "", "precision", "getPrecision", "()Ljava/lang/Integer;", "setPrecision", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "amount", "Ljava/math/BigDecimal;", "getAmount", "()Ljava/math/BigDecimal;", "empty", "", "getEmpty", "()Ljava/lang/String;", "setEmpty", "(Ljava/lang/String;)V", "step", "getStep", "setStep", "(Ljava/math/BigDecimal;)V", "reset", "inputTips", "emptyCheck", "LoanLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLeverInputViewNew.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LeverInputViewNew.kt\ncom/kubi/loan/view/LeverInputHelperNew\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,402:1\n1#2:403\n*E\n"})
public abstract class AbstractC43805k {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final LeverInputViewNew f96860a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public Function1<? super Boolean, Unit> f96861b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public Function0<Unit> f96862c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public C43816v f96863d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public Integer f96864e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public String f96865f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public BigDecimal f96866g;

    /* JADX INFO: renamed from: e */
    public static final Unit m96476e(AbstractC43805k abstractC43805k, CharSequence charSequence) {
        Object objM103844constructorimpl;
        m96478o(abstractC43805k, false, 1, null);
        if (abstractC43805k.f96860a.getF32490f() && abstractC43805k.f96860a.getF32491g() != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(new BigDecimal(charSequence.toString()));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
                objM103844constructorimpl = null;
            }
            TextView fiatTv = abstractC43805k.f96860a.getFiatTv();
            BigDecimal bigDecimalM66656p = C27039d.m66656p((BigDecimal) objM103844constructorimpl);
            CoinInfoEntity f32491g = abstractC43805k.f96860a.getF32491g();
            fiatTv.setText(C41014a.m89948v(C41014a.m89940n(bigDecimalM66656p, f32491g != null ? f32491g.getCode() : null), null, null, 0, false, true, false, 47, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public abstract void mo96467n(boolean z11);

    public AbstractC43805k(@NotNull LeverInputViewNew view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f96860a = view;
        TextView tvAll = view.getF32486b().f89839h;
        Intrinsics.checkNotNullExpressionValue(tvAll, "tvAll");
        C27046k.m66711z(tvAll, 0L, new Function0() { // from class: qo.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC43805k.m96475d(this.f96857b);
            }
        }, 1, null);
        AbstractC46099a<CharSequence> abstractC46099aM784d = C0206f.m784d(view.getInput());
        final Function1 function1 = new Function1() { // from class: qo.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC43805k.m96476e(this.f96858b, (CharSequence) obj);
            }
        };
        Disposable disposableSubscribe = abstractC46099aM784d.subscribe(new Consumer() { // from class: qo.j
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AbstractC43805k.m96477f(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, C27046k.m66696k(view));
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m96478o(AbstractC43805k abstractC43805k, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: inputTips");
        }
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        abstractC43805k.mo96467n(z11);
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final BigDecimal m96479g() {
        C43816v f96863d;
        BigDecimal data = this.f96860a.getData();
        if (C41014a.m89927a(data, C43801g.m96470a()) || ((f96863d = getF96863d()) != null && f96863d.m96488a(data))) {
            return C41014a.m89918C(data, C41014a.m89922G(this.f96866g, null, 1, null)) ? data : C43801g.m96471b();
        }
        return C43801g.m96471b();
    }

    @Nullable
    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getF96865f() {
        return this.f96865f;
    }

    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public final LeverInputViewNew getF96860a() {
        return this.f96860a;
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public final Function1<Boolean, Unit> m96482j() {
        return this.f96861b;
    }

    @Nullable
    /* JADX INFO: renamed from: k, reason: from getter */
    public Integer getF96864e() {
        return this.f96864e;
    }

    @Nullable
    /* JADX INFO: renamed from: l, reason: from getter */
    public C43816v getF96863d() {
        return this.f96863d;
    }

    @Nullable
    /* JADX INFO: renamed from: m, reason: from getter */
    public final BigDecimal getF96866g() {
        return this.f96866g;
    }

    /* JADX INFO: renamed from: p */
    public final void m96484p() {
        this.f96860a.setAmount("");
        mo96467n(false);
    }

    /* JADX INFO: renamed from: q */
    public final void m96485q(@Nullable Function0<Unit> function0) {
        this.f96862c = function0;
    }

    /* JADX INFO: renamed from: r */
    public final void m96486r(@Nullable String str) {
        this.f96865f = str;
    }

    /* JADX INFO: renamed from: s */
    public void mo96468s(@Nullable Integer num) {
        this.f96864e = num;
        this.f96860a.getInput().setFilters(new C27056j0[]{new C27056j0(num != null ? num.intValue() : 10)});
    }

    /* JADX INFO: renamed from: t */
    public void mo96469t(@Nullable C43816v c43816v) {
        this.f96863d = c43816v;
        mo96467n(false);
    }

    /* JADX INFO: renamed from: u */
    public final void m96487u(@Nullable BigDecimal bigDecimal) {
        this.f96866g = bigDecimal;
    }

    /* JADX INFO: renamed from: d */
    public static final Unit m96475d(AbstractC43805k abstractC43805k) {
        BigDecimal f96884b;
        C43816v f96863d = abstractC43805k.getF96863d();
        if (f96863d != null) {
            LeverInputViewNew leverInputViewNew = abstractC43805k.f96860a;
            if (abstractC43805k.getF96864e() == null) {
                f96884b = f96863d.getF96884b();
            } else {
                f96884b = f96863d.getF96884b();
                Integer f96864e = abstractC43805k.getF96864e();
                Intrinsics.checkNotNull(f96864e);
                f96884b.setScale(f96864e.intValue(), RoundingMode.DOWN);
            }
            String plainString = C6447a.m11724a(f96884b).toPlainString();
            Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
            leverInputViewNew.setAmount(plainString);
        }
        Function0<Unit> function0 = abstractC43805k.f96862c;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public static final void m96477f(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
