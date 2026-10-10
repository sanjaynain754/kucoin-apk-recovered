package com.kubi.kumex.view;

import android.content.Context;
import android.os.CountDownTimer;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import com.kubi.futures.view.FuturesTraderProChallengeView;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$font;
import com.kubi.kumex.R$string;
import com.kubi.kumex.utils.C17056l0;
import com.kubi.kumex.view.PositionTradeProChallengeLayout;
import com.kubi.resources.ColorClickSpan;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.widget.AlignTopTextView;
import com.kubi.sdk.widget.shape.layout.ShapeConstraintLayout;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import dm.C36750d4;
import f00.C37304a;
import g00.InterfaceC37766r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p729wl.C45875l0;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: PositionTradeProChallengeLayout.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0012\u0010\u0015\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J\b\u0010\u0016\u001a\u00020\u0011H\u0002J\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u000fH\u0002J\b\u0010\u0019\u001a\u00020\u0011H\u0002J\b\u0010\u001a\u001a\u00020\u0011H\u0014R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/kumex/view/PositionTradeProChallengeLayout;", "Lcom/kubi/sdk/widget/shape/layout/ShapeConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/kubi/kumex/databinding/BkumexLayoutPositionTradeProChallengeBinding;", "countDownTimer", "Landroid/os/CountDownTimer;", "countdownEndTimeMillis", "", "render", "", "expiredPeriodMillis", "progressUrl", "", "bindTitle", "startCountdown", "updateCountdownText", "remainMillis", "stopCountdown", "onDetachedFromWindow", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPositionTradeProChallengeLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PositionTradeProChallengeLayout.kt\ncom/kubi/kumex/view/PositionTradeProChallengeLayout\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,133:1\n1#2:134\n*E\n"})
public final class PositionTradeProChallengeLayout extends ShapeConstraintLayout {

    /* JADX INFO: renamed from: p */
    @NotNull
    public final C36750d4 f30904p;

    /* JADX INFO: renamed from: q */
    @Nullable
    public CountDownTimer f30905q;

    /* JADX INFO: renamed from: r */
    public long f30906r;

    /* JADX INFO: renamed from: com.kubi.kumex.view.PositionTradeProChallengeLayout$a */
    /* JADX INFO: compiled from: PositionTradeProChallengeLayout.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, m90084d2 = {"com/kubi/kumex/view/PositionTradeProChallengeLayout$startCountdown$1", "Landroid/os/CountDownTimer;", "onTick", "", "millisUntilFinished", "", "onFinish", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class CountDownTimerC17078a extends CountDownTimer {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ PositionTradeProChallengeLayout f30907a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CountDownTimerC17078a(long j11, PositionTradeProChallengeLayout positionTradeProChallengeLayout) {
            super(j11, 1000L);
            this.f30907a = positionTradeProChallengeLayout;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            this.f30907a.m36702j(0L);
            ViewExtKt.m66577h(this.f30907a);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long millisUntilFinished) {
            this.f30907a.m36702j(millisUntilFinished);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PositionTradeProChallengeLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PositionTradeProChallengeLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: e */
    public static final Unit m36698e(TextPaint ds2) {
        Intrinsics.checkNotNullParameter(ds2, "ds");
        ds2.setColor(C27017c.f54310a.m66512a(R$color.c_text));
        ds2.setUnderlineText(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    private final void m36701i() {
        CountDownTimer countDownTimer = this.f30905q;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f30905q = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final void m36702j(long j11) {
        C27017c c27017c = C27017c.f54310a;
        String strM66516f = c27017c.m66516f(R$string.kumex_trade_pro_position_countdown_label, new Object[0]);
        String str = strM66516f + ' ' + FuturesTraderProChallengeView.f24987z.formatPositionCountdown(j11);
        SpannableString spannableString = new SpannableString(str);
        TypefaceSpan typefaceSpanM36545b = C17056l0.m36545b(R$font.medium);
        if (typefaceSpanM36545b == null) {
            typefaceSpanM36545b = new TypefaceSpan("sans-serif-medium");
        }
        spannableString.setSpan(typefaceSpanM36545b, strM66516f.length(), str.length(), 33);
        spannableString.setSpan(new ForegroundColorSpan(c27017c.m66512a(R$color.c_text)), strM66516f.length(), str.length(), 33);
        this.f30904p.f79920b.setText(spannableString);
    }

    /* JADX INFO: renamed from: d */
    public final void m36703d(final String str) {
        AlignTopTextView alignTopTextView = this.f30904p.f79921c;
        alignTopTextView.setMaxLines(Integer.MAX_VALUE);
        alignTopTextView.setEllipsize(null);
        alignTopTextView.setSingleLine(false);
        alignTopTextView.setText(C27017c.f54310a.m66516f(R$string.kumex_trade_pro_position_challenge_in_progress, new Object[0]));
        HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
        Intrinsics.checkNotNull(alignTopTextView);
        highlightTextHelper.m54120f(alignTopTextView, new Pair(HighlightTextHelper.TextTagEnum.SPAN, new ColorClickSpan(new Function1() { // from class: xm.g0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PositionTradeProChallengeLayout.m36698e((TextPaint) obj);
            }
        }, new View.OnClickListener() { // from class: xm.h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PositionTradeProChallengeLayout.m36699f(str, view);
            }
        })));
        alignTopTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public /* synthetic */ PositionTradeProChallengeLayout(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: f */
    public static final void m36699f(String str, View view) {
        String strM66668h = C27041f.m66668h(str);
        if (StringsKt.isBlank(strM66668h)) {
            strM66668h = C45875l0.f103336a.m101358z0();
        }
        String str2 = strM66668h;
        if (!StringsKt.isBlank(str2)) {
            InterfaceC37766r.a.m85190a(C37304a.f82764a, str2, null, null, null, null, null, null, 126, null);
        }
    }

    /* JADX INFO: renamed from: h */
    private final void m36700h() {
        m36701i();
        long jCurrentTimeMillis = this.f30906r - System.currentTimeMillis();
        if (jCurrentTimeMillis <= 0) {
            m36702j(0L);
            ViewExtKt.m66577h(this);
        } else {
            m36702j(jCurrentTimeMillis);
            CountDownTimerC17078a countDownTimerC17078a = new CountDownTimerC17078a(jCurrentTimeMillis, this);
            countDownTimerC17078a.start();
            this.f30905q = countDownTimerC17078a;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m36704g(long j11, @Nullable String str) {
        m36701i();
        if (j11 <= 0) {
            ViewExtKt.m66577h(this);
            return;
        }
        C27046k.m66685H(this);
        this.f30906r = j11;
        m36703d(str);
        m36700h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        m36701i();
        super.onDetachedFromWindow();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PositionTradeProChallengeLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        C36750d4 c36750d4M82352b = C36750d4.m82352b(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c36750d4M82352b, "inflate(...)");
        this.f30904p = c36750d4M82352b;
    }
}
