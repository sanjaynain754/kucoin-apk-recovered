package com.kubi.futures.view;

import android.content.Context;
import android.os.CountDownTimer;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.flexbox.FlexboxLayout;
import com.kubi.futures.trade.challenge.FuturesTraderProChallengeUiState;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36858v4;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.ranges.RangesKt;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: FuturesTraderProChallengeView.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 M2\u00020\u0001:\u0001MB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010.\u001a\u00020\u00152\b\u0010/\u001a\u0004\u0018\u00010-J\u0010\u00100\u001a\u00020\u00152\u0006\u0010/\u001a\u00020-H\u0002J\u0012\u00101\u001a\u00020\u00152\b\b\u0002\u00102\u001a\u00020\u0011H\u0002J\u0010\u00103\u001a\u00020\u00112\u0006\u00104\u001a\u00020\u0007H\u0002J\u0012\u00105\u001a\u00020\u00152\b\b\u0002\u00102\u001a\u00020\u0011H\u0002J\u0010\u00106\u001a\u00020\u00112\u0006\u00107\u001a\u00020\u0007H\u0002J\u0010\u00108\u001a\u00020\u00072\u0006\u00109\u001a\u00020\u0007H\u0002J\u0018\u0010:\u001a\u00020\u00072\u0006\u0010;\u001a\u00020<2\u0006\u00109\u001a\u00020\u0007H\u0002J0\u0010=\u001a\u00020\u00152\u0006\u0010>\u001a\u00020\u00112\u0006\u0010?\u001a\u00020\u00072\u0006\u0010@\u001a\u00020\u00072\u0006\u0010A\u001a\u00020\u00072\u0006\u0010B\u001a\u00020\u0007H\u0014J\u0010\u0010C\u001a\u00020\u00112\u0006\u0010;\u001a\u00020<H\u0002J\u0013\u0010D\u001a\u00020\u0007*\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0002\u0010EJ\u000e\u0010F\u001a\u00020\u00152\u0006\u0010G\u001a\u00020\u0011J\b\u0010H\u001a\u00020\u0015H\u0002J\u0010\u0010I\u001a\u00020\u00152\u0006\u0010J\u001a\u00020\u000fH\u0002J\b\u0010K\u001a\u00020\u0015H\u0002J\b\u0010L\u001a\u00020\u0015H\u0014R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\"\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R\"\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010\u0019R\"\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0017\"\u0004\b%\u0010\u0019R(\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0015\u0018\u00010'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006N"}, m90084d2 = {"Lcom/kubi/futures/view/FuturesTraderProChallengeView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/kubi/kumex/databinding/BkumexViewTraderProChallengeBinding;", "countDownTimer", "Landroid/os/CountDownTimer;", "countdownEndTimeMillis", "", "isButtonsWrapped", "", "isTitleCountdownInline", "onCloseClickListener", "Lkotlin/Function0;", "", "getOnCloseClickListener", "()Lkotlin/jvm/functions/Function0;", "setOnCloseClickListener", "(Lkotlin/jvm/functions/Function0;)V", "onProgressClickListener", "getOnProgressClickListener", "setOnProgressClickListener", "onUseClickListener", "getOnUseClickListener", "setOnUseClickListener", "onActivateClickListener", "getOnActivateClickListener", "setOnActivateClickListener", "onCountdownFinishedListener", "getOnCountdownFinishedListener", "setOnCountdownFinishedListener", "onVisibilityChanged", "Lkotlin/Function1;", "getOnVisibilityChanged", "()Lkotlin/jvm/functions/Function1;", "setOnVisibilityChanged", "(Lkotlin/jvm/functions/Function1;)V", "currentState", "Lcom/kubi/futures/trade/challenge/FuturesTraderProChallengeUiState;", "bind", "state", "updateAmountVisibility", "applyTitleRowLayout", "force", "shouldShowTitleCountdownInline", "titleAreaWidth", "applyContentRowLayout", "shouldWrapActionButtons", "availableWidth", "measureActionButtonsWidth", ViewProps.MAX_WIDTH, "measureViewWidth", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", ViewProps.ON_LAYOUT, "changed", "left", ViewProps.TOP, "right", ViewProps.BOTTOM, "isButtonVisible", "orZero", "(Ljava/lang/Integer;)I", "setActionLoading", "isLoading", "startCountdown", "updateCountdownText", "remainMillis", "stopCountdown", "onDetachedFromWindow", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFuturesTraderProChallengeView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuturesTraderProChallengeView.kt\ncom/kubi/futures/view/FuturesTraderProChallengeView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,312:1\n1#2:313\n*E\n"})
public final class FuturesTraderProChallengeView extends ConstraintLayout {

    /* JADX INFO: renamed from: z */
    @NotNull
    public static final Companion f24987z = new Companion(null);

    /* JADX INFO: renamed from: n */
    @NotNull
    public final C36858v4 f24988n;

    /* JADX INFO: renamed from: o */
    @Nullable
    public CountDownTimer f24989o;

    /* JADX INFO: renamed from: p */
    public long f24990p;

    /* JADX INFO: renamed from: q */
    public boolean f24991q;

    /* JADX INFO: renamed from: r */
    public boolean f24992r;

    /* JADX INFO: renamed from: s */
    @Nullable
    public Function0<Unit> f24993s;

    /* JADX INFO: renamed from: t */
    @Nullable
    public Function0<Unit> f24994t;

    /* JADX INFO: renamed from: u */
    @Nullable
    public Function0<Unit> f24995u;

    /* JADX INFO: renamed from: v */
    @Nullable
    public Function0<Unit> f24996v;

    /* JADX INFO: renamed from: w */
    @Nullable
    public Function0<Unit> f24997w;

    /* JADX INFO: renamed from: x */
    @Nullable
    public Function1<? super Boolean, Unit> f24998x;

    /* JADX INFO: renamed from: y */
    @Nullable
    public FuturesTraderProChallengeUiState f24999y;

    /* JADX INFO: compiled from: FuturesTraderProChallengeView.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\t"}, m90084d2 = {"Lcom/kubi/futures/view/FuturesTraderProChallengeView$Companion;", "", "<init>", "()V", "formatCountdown", "", "remainMillis", "", "formatPositionCountdown", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final String formatPositionCountdown(long remainMillis) {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(RangesKt.coerceAtLeast(remainMillis, 0L));
            TimeUnit timeUnit = TimeUnit.DAYS;
            long seconds2 = seconds / timeUnit.toSeconds(1L);
            long seconds3 = seconds % timeUnit.toSeconds(1L);
            TimeUnit timeUnit2 = TimeUnit.HOURS;
            long seconds4 = seconds3 / timeUnit2.toSeconds(1L);
            long seconds5 = seconds % timeUnit2.toSeconds(1L);
            TimeUnit timeUnit3 = TimeUnit.MINUTES;
            long seconds6 = seconds5 / timeUnit3.toSeconds(1L);
            long seconds7 = seconds % timeUnit3.toSeconds(1L);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(Locale.US, "%dd : %02dh : %02dm : %02ds", Arrays.copyOf(new Object[]{Long.valueOf(seconds2), Long.valueOf(seconds4), Long.valueOf(seconds6), Long.valueOf(seconds7)}, 4));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        }

        @NotNull
        public final String formatCountdown(long remainMillis) {
            return formatPositionCountdown(remainMillis);
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.view.FuturesTraderProChallengeView$a */
    /* JADX INFO: compiled from: FuturesTraderProChallengeView.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, m90084d2 = {"com/kubi/futures/view/FuturesTraderProChallengeView$startCountdown$1", "Landroid/os/CountDownTimer;", "onTick", "", "millisUntilFinished", "", "onFinish", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class CountDownTimerC14451a extends CountDownTimer {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ FuturesTraderProChallengeView f25000a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CountDownTimerC14451a(long j11, FuturesTraderProChallengeView futuresTraderProChallengeView) {
            super(j11, 1000L);
            this.f25000a = futuresTraderProChallengeView;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            this.f25000a.f24988n.f81261k.setText(FuturesTraderProChallengeView.f24987z.formatCountdown(0L));
            Function0<Unit> onCountdownFinishedListener = this.f25000a.getOnCountdownFinishedListener();
            if (onCountdownFinishedListener != null) {
                onCountdownFinishedListener.invoke();
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long millisUntilFinished) {
            this.f25000a.m28823C(millisUntilFinished);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FuturesTraderProChallengeView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: D */
    public static final void m28824D(FuturesTraderProChallengeView futuresTraderProChallengeView) {
        futuresTraderProChallengeView.m28841m(true);
    }

    /* JADX INFO: renamed from: p */
    public static final void m28837p(FuturesTraderProChallengeView futuresTraderProChallengeView) {
        futuresTraderProChallengeView.m28841m(true);
        futuresTraderProChallengeView.m28840k(true);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FuturesTraderProChallengeView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public final void m28823C(long j11) {
        this.f24988n.f81261k.setText(f24987z.formatCountdown(j11));
        this.f24988n.f81259i.post(new Runnable() { // from class: com.kubi.futures.view.f
            @Override // java.lang.Runnable
            public final void run() {
                FuturesTraderProChallengeView.m28824D(this.f25044b);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m28830f(FuturesTraderProChallengeView futuresTraderProChallengeView) {
        Function0<Unit> function0 = futuresTraderProChallengeView.f24993s;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m28831g(FuturesTraderProChallengeView futuresTraderProChallengeView) {
        Function0<Unit> function0 = futuresTraderProChallengeView.f24994t;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m28832h(FuturesTraderProChallengeView futuresTraderProChallengeView) {
        FuturesTraderProChallengeUiState futuresTraderProChallengeUiState = futuresTraderProChallengeView.f24999y;
        if (futuresTraderProChallengeUiState == null) {
            return Unit.INSTANCE;
        }
        if (futuresTraderProChallengeUiState.getShowActivateButton()) {
            Function0<Unit> function0 = futuresTraderProChallengeView.f24996v;
            if (function0 != null) {
                function0.invoke();
            }
        } else {
            Function0<Unit> function1 = futuresTraderProChallengeView.f24995u;
            if (function1 != null) {
                function1.invoke();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m28835l(FuturesTraderProChallengeView futuresTraderProChallengeView, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        futuresTraderProChallengeView.m28840k(z11);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m28836n(FuturesTraderProChallengeView futuresTraderProChallengeView, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        futuresTraderProChallengeView.m28841m(z11);
    }

    /* JADX INFO: renamed from: A */
    public final void m28838A() {
        CountDownTimer countDownTimer = this.f24989o;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f24989o = null;
    }

    @Nullable
    public final Function0<Unit> getOnActivateClickListener() {
        return this.f24996v;
    }

    @Nullable
    public final Function0<Unit> getOnCloseClickListener() {
        return this.f24993s;
    }

    @Nullable
    public final Function0<Unit> getOnCountdownFinishedListener() {
        return this.f24997w;
    }

    @Nullable
    public final Function0<Unit> getOnProgressClickListener() {
        return this.f24994t;
    }

    @Nullable
    public final Function0<Unit> getOnUseClickListener() {
        return this.f24995u;
    }

    @Nullable
    public final Function1<Boolean, Unit> getOnVisibilityChanged() {
        return this.f24998x;
    }

    /* JADX INFO: renamed from: o */
    public final void m28842o(@Nullable FuturesTraderProChallengeUiState futuresTraderProChallengeUiState) {
        if (futuresTraderProChallengeUiState == null) {
            this.f24999y = null;
            m28838A();
            ViewExtKt.m66577h(this);
            Function1<? super Boolean, Unit> function1 = this.f24998x;
            if (function1 != null) {
                function1.invoke(Boolean.FALSE);
                return;
            }
            return;
        }
        this.f24999y = futuresTraderProChallengeUiState;
        ViewExtKt.m66594y(this);
        Function1<? super Boolean, Unit> function2 = this.f24998x;
        if (function2 != null) {
            function2.invoke(Boolean.TRUE);
        }
        this.f24988n.f81263m.setText(futuresTraderProChallengeUiState.getTitle());
        this.f24988n.f81260j.setText(futuresTraderProChallengeUiState.getAmountText());
        this.f24988n.f81262l.setText(futuresTraderProChallengeUiState.getCurrencyText());
        this.f24988n.f81254d.setText(futuresTraderProChallengeUiState.getProgressButtonText());
        this.f24988n.f81254d.setVisibility(futuresTraderProChallengeUiState.getShowProgressButton() ? 0 : 8);
        this.f24988n.f81255e.setText(futuresTraderProChallengeUiState.getShowActivateButton() ? futuresTraderProChallengeUiState.getActivateButtonText() : futuresTraderProChallengeUiState.getUseButtonText());
        this.f24988n.f81255e.setVisibility((futuresTraderProChallengeUiState.getShowActivateButton() || futuresTraderProChallengeUiState.getShowUseButton()) ? 0 : 8);
        m28839B(futuresTraderProChallengeUiState);
        this.f24988n.f81259i.post(new Runnable() { // from class: com.kubi.futures.view.e
            @Override // java.lang.Runnable
            public final void run() {
                FuturesTraderProChallengeView.m28837p(this.f25043b);
            }
        });
        this.f24990p = futuresTraderProChallengeUiState.getCountdownEndTimeMillis();
        m28849z();
    }

    public final void setActionLoading(boolean isLoading) {
        this.f24988n.f81255e.setEnabled(!isLoading);
        this.f24988n.f81254d.setEnabled(!isLoading);
        this.f24988n.f81258h.setEnabled(!isLoading);
        this.f24988n.f81255e.setAlpha(isLoading ? 0.4f : 1.0f);
        this.f24988n.f81254d.setAlpha(isLoading ? 0.4f : 1.0f);
    }

    public final void setOnActivateClickListener(@Nullable Function0<Unit> function0) {
        this.f24996v = function0;
    }

    public final void setOnCloseClickListener(@Nullable Function0<Unit> function0) {
        this.f24993s = function0;
    }

    public final void setOnCountdownFinishedListener(@Nullable Function0<Unit> function0) {
        this.f24997w = function0;
    }

    public final void setOnProgressClickListener(@Nullable Function0<Unit> function0) {
        this.f24994t = function0;
    }

    public final void setOnUseClickListener(@Nullable Function0<Unit> function0) {
        this.f24995u = function0;
    }

    public final void setOnVisibilityChanged(@Nullable Function1<? super Boolean, Unit> function1) {
        this.f24998x = function1;
    }

    /* JADX INFO: renamed from: t */
    public final int m28844t(int i11) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE);
        int iM28846w = 0;
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        BaseTextView btnProgress = this.f24988n.f81254d;
        Intrinsics.checkNotNullExpressionValue(btnProgress, "btnProgress");
        if (m28843r(btnProgress)) {
            this.f24988n.f81254d.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = this.f24988n.f81254d.getMeasuredWidth();
            ViewGroup.LayoutParams layoutParams = this.f24988n.f81254d.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            iM28846w = measuredWidth + m28846w(marginLayoutParams != null ? Integer.valueOf(marginLayoutParams.getMarginEnd()) : null);
        }
        BaseTextView btnUse = this.f24988n.f81255e;
        Intrinsics.checkNotNullExpressionValue(btnUse, "btnUse");
        if (!m28843r(btnUse)) {
            return iM28846w;
        }
        this.f24988n.f81255e.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        return iM28846w + this.f24988n.f81255e.getMeasuredWidth();
    }

    /* JADX INFO: renamed from: u */
    public final int m28845u(View view, int i11) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        return view.getMeasuredWidth();
    }

    /* JADX INFO: renamed from: w */
    public final int m28846w(Integer num) {
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m28847x(int i11) {
        CharSequence text = this.f24988n.f81263m.getText();
        String string = text != null ? text.toString() : null;
        if (string == null) {
            string = "";
        }
        if (StringsKt.isBlank(string)) {
            return true;
        }
        int iMeasureText = (int) this.f24988n.f81263m.getPaint().measureText(string);
        BaseTextView tvCountdown = this.f24988n.f81261k;
        Intrinsics.checkNotNullExpressionValue(tvCountdown, "tvCountdown");
        return (iMeasureText + C27040e.m66658b(6)) + m28845u(tvCountdown, i11) <= i11;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m28848y(int i11) {
        if (this.f24988n.f81253c.getVisibility() != 0) {
            return false;
        }
        ConstraintLayout amountGroup = this.f24988n.f81253c;
        Intrinsics.checkNotNullExpressionValue(amountGroup, "amountGroup");
        int iM28845u = m28845u(amountGroup, i11);
        int iM28844t = m28844t(i11);
        return iM28844t > 0 && (iM28845u + C27040e.m66658b(12)) + iM28844t > i11;
    }

    public /* synthetic */ FuturesTraderProChallengeView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: B */
    public final void m28839B(FuturesTraderProChallengeUiState futuresTraderProChallengeUiState) {
        boolean z11;
        int i11 = 0;
        if (StringsKt.isBlank(futuresTraderProChallengeUiState.getAmountText()) && StringsKt.isBlank(futuresTraderProChallengeUiState.getCurrencyText())) {
            z11 = false;
        } else {
            z11 = true;
        }
        ConstraintLayout constraintLayout = this.f24988n.f81253c;
        if (!z11) {
            i11 = 8;
        }
        constraintLayout.setVisibility(i11);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: k */
    public final void m28840k(boolean z11) {
        int width;
        float f11;
        int i11;
        int iM66658b;
        if (getVisibility() == 0 && (width = (this.f24988n.f81257g.getWidth() - this.f24988n.f81257g.getPaddingLeft()) - this.f24988n.f81257g.getPaddingRight()) > 0) {
            boolean zM28848y = m28848y(width);
            if (z11 || zM28848y != this.f24991q) {
                this.f24991q = zM28848y;
                ViewGroup.LayoutParams layoutParams = this.f24988n.f81252b.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayout.LayoutParams");
                FlexboxLayout.LayoutParams layoutParams2 = (FlexboxLayout.LayoutParams) layoutParams;
                if (zM28848y) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                boolean z12 = false;
                if (zM28848y) {
                    i11 = -2;
                } else {
                    i11 = 0;
                }
                if (this.f24988n.f81253c.getVisibility() != 0 || zM28848y) {
                    iM66658b = 0;
                } else {
                    iM66658b = C27040e.m66658b(12);
                }
                int i12 = !zM28848y ? 1 : 0;
                boolean z13 = true;
                if (layoutParams2.getFlexGrow() != f11) {
                    layoutParams2.setFlexGrow(f11);
                    z12 = true;
                }
                if (((ViewGroup.MarginLayoutParams) layoutParams2).width != i11) {
                    ((ViewGroup.MarginLayoutParams) layoutParams2).width = i11;
                    z12 = true;
                }
                if (layoutParams2.getMarginStart() != iM66658b) {
                    layoutParams2.setMarginStart(iM66658b);
                    z12 = true;
                }
                if (layoutParams2.isWrapBefore() != zM28848y) {
                    layoutParams2.setWrapBefore(zM28848y);
                } else {
                    z13 = z12;
                }
                if (z13) {
                    this.f24988n.f81252b.setLayoutParams(layoutParams2);
                }
                if (this.f24988n.f81252b.getJustifyContent() != i12) {
                    this.f24988n.f81252b.setJustifyContent(i12);
                }
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m28841m(boolean z11) {
        int width;
        int i11;
        if (getVisibility() == 0 && (width = this.f24988n.f81259i.getWidth()) > 0) {
            boolean zM28847x = m28847x(width);
            if (!z11 && zM28847x == this.f24992r) {
                return;
            }
            this.f24992r = zM28847x;
            BaseTextView baseTextView = this.f24988n.f81263m;
            if (zM28847x) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            baseTextView.setMaxLines(i11);
            ViewGroup.LayoutParams layoutParams = this.f24988n.f81263m.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            ViewGroup.LayoutParams layoutParams3 = this.f24988n.f81261k.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
            if (zM28847x) {
                ((ViewGroup.MarginLayoutParams) layoutParams2).width = -2;
                layoutParams2.endToEnd = -1;
                layoutParams2.endToStart = -1;
                layoutParams4.topToTop = this.f24988n.f81263m.getId();
                layoutParams4.bottomToBottom = this.f24988n.f81263m.getId();
                layoutParams4.topToBottom = -1;
                layoutParams4.startToEnd = this.f24988n.f81263m.getId();
                layoutParams4.startToStart = -1;
                layoutParams4.setMarginStart(C27040e.m66658b(6));
                ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin = 0;
            } else {
                ((ViewGroup.MarginLayoutParams) layoutParams2).width = 0;
                layoutParams2.endToEnd = 0;
                layoutParams2.endToStart = -1;
                layoutParams4.topToTop = -1;
                layoutParams4.bottomToBottom = -1;
                layoutParams4.topToBottom = this.f24988n.f81263m.getId();
                layoutParams4.startToEnd = -1;
                layoutParams4.startToStart = 0;
                layoutParams4.setMarginStart(0);
                ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin = C27040e.m66658b(2);
            }
            this.f24988n.f81263m.setLayoutParams(layoutParams2);
            this.f24988n.f81261k.setLayoutParams(layoutParams4);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        m28838A();
        super.onDetachedFromWindow();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        if (changed && getVisibility() == 0) {
            m28836n(this, false, 1, null);
            m28835l(this, false, 1, null);
        }
    }

    /* JADX INFO: renamed from: r */
    public final boolean m28843r(View view) {
        if (view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: z */
    public final void m28849z() {
        m28838A();
        long jCurrentTimeMillis = this.f24990p - System.currentTimeMillis();
        if (jCurrentTimeMillis <= 0) {
            this.f24988n.f81261k.setText(f24987z.formatCountdown(0L));
            Function0<Unit> function0 = this.f24997w;
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        m28823C(jCurrentTimeMillis);
        CountDownTimerC14451a countDownTimerC14451a = new CountDownTimerC14451a(jCurrentTimeMillis, this);
        countDownTimerC14451a.start();
        this.f24989o = countDownTimerC14451a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FuturesTraderProChallengeView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        C36858v4 c36858v4M82582b = C36858v4.m82582b(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c36858v4M82582b, "inflate(...)");
        this.f24988n = c36858v4M82582b;
        this.f24992r = true;
        ImageView ivClose = c36858v4M82582b.f81258h;
        Intrinsics.checkNotNullExpressionValue(ivClose, "ivClose");
        C27046k.m66711z(ivClose, 0L, new Function0() { // from class: com.kubi.futures.view.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesTraderProChallengeView.m28830f(this.f25040b);
            }
        }, 1, null);
        BaseTextView btnProgress = c36858v4M82582b.f81254d;
        Intrinsics.checkNotNullExpressionValue(btnProgress, "btnProgress");
        C27046k.m66711z(btnProgress, 0L, new Function0() { // from class: com.kubi.futures.view.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesTraderProChallengeView.m28831g(this.f25041b);
            }
        }, 1, null);
        BaseTextView btnUse = c36858v4M82582b.f81255e;
        Intrinsics.checkNotNullExpressionValue(btnUse, "btnUse");
        C27046k.m66711z(btnUse, 0L, new Function0() { // from class: com.kubi.futures.view.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesTraderProChallengeView.m28832h(this.f25042b);
            }
        }, 1, null);
    }
}
