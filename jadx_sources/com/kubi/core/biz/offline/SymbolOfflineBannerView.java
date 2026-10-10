package com.kubi.core.biz.offline;

import android.content.Context;
import android.os.CountDownTimer;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import com.google.android.material.timepicker.TimeModel;
import com.kubi.tradecorebiz.R$color;
import com.kubi.tradecorebiz.R$string;
import com.tencent.bugly.proguard.C33627eb;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import v30.C45399o0;

/* JADX INFO: compiled from: SymbolOfflineBannerView.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0014H\u0002J$\u0010\u0018\u001a\u00020\u000f*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0007H\u0002J\u0006\u0010\u001e\u001a\u00020\u000fJ\u0006\u0010\u001f\u001a\u00020\u000fJ\b\u0010 \u001a\u00020\u000fH\u0014R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, m90084d2 = {"Lcom/kubi/core/biz/offline/SymbolOfflineBannerView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/kubi/tradecorebiz/databinding/TradeCoreViewSymbolOfflineBannerBinding;", "countDownTimer", "Landroid/os/CountDownTimer;", "bind", "", "offlineData", "Lcom/kubi/core/biz/offline/SymbolOfflineData;", "startCountdown", "remainingMs", "", "formatCountdown", "", "millis", "appendCountdownPart", "Landroid/text/SpannableStringBuilder;", "number", "", "unit", "unitColor", TIMPushProvider.f75062n, TIMPushProvider.f75063o, "onDetachedFromWindow", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSymbolOfflineBannerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SymbolOfflineBannerView.kt\ncom/kubi/core/biz/offline/SymbolOfflineBannerView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,129:1\n1#2:130\n*E\n"})
public final class SymbolOfflineBannerView extends FrameLayout {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final C45399o0 f20560b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public CountDownTimer f20561c;

    /* JADX INFO: renamed from: com.kubi.core.biz.offline.SymbolOfflineBannerView$a */
    /* JADX INFO: compiled from: SymbolOfflineBannerView.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, m90084d2 = {"com/kubi/core/biz/offline/SymbolOfflineBannerView$startCountdown$1", "Landroid/os/CountDownTimer;", "onTick", "", "millisUntilFinished", "", "onFinish", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class CountDownTimerC12012a extends CountDownTimer {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SymbolOfflineBannerView f20562a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CountDownTimerC12012a(long j11, SymbolOfflineBannerView symbolOfflineBannerView) {
            super(j11, 1000L);
            this.f20562a = symbolOfflineBannerView;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            this.f20562a.m22062f();
        }

        @Override // android.os.CountDownTimer
        public void onTick(long millisUntilFinished) {
            this.f20562a.f20560b.f102267c.setText(this.f20562a.m22061e(millisUntilFinished));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SymbolOfflineBannerView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: g */
    public final void m22063g() {
        setVisibility(0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SymbolOfflineBannerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: d */
    public final void m22060d(@NotNull SymbolOfflineData offlineData) {
        Intrinsics.checkNotNullParameter(offlineData, "offlineData");
        CountDownTimer countDownTimer = this.f20561c;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        Long offlineTime = offlineData.getOfflineTime();
        if (offlineTime == null) {
            m22062f();
            return;
        }
        long jLongValue = offlineTime.longValue() - System.currentTimeMillis();
        if (jLongValue <= 0) {
            m22062f();
        } else {
            m22064h(jLongValue);
            m22063g();
        }
    }

    /* JADX INFO: renamed from: e */
    public final CharSequence m22061e(long j11) {
        long j12 = j11 / ((long) 1000);
        long j13 = 86400;
        long j14 = j12 / j13;
        long j15 = 3600;
        long j16 = (j12 % j13) / j15;
        long j17 = 60;
        long j18 = (j12 % j15) / j17;
        long j19 = j12 % j17;
        String string = getContext().getString(R$string.alpha_countdown_day);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = getContext().getString(R$string.alpha_countdown_hour);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String string3 = getContext().getString(R$string.alpha_countdown_minute);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        String string4 = getContext().getString(R$string.alpha_countdown_second);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        int color = ContextCompat.getColor(getContext(), R$color.c_text48_40);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(j14)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        m22059c(spannableStringBuilder, str, string, color);
        spannableStringBuilder.append(C33627eb.f69716f);
        String str2 = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(j16)}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        m22059c(spannableStringBuilder, str2, string2, color);
        spannableStringBuilder.append(C33627eb.f69716f);
        String str3 = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(j18)}, 1));
        Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
        m22059c(spannableStringBuilder, str3, string3, color);
        spannableStringBuilder.append(C33627eb.f69716f);
        String str4 = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(j19)}, 1));
        Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
        m22059c(spannableStringBuilder, str4, string4, color);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: f */
    public final void m22062f() {
        CountDownTimer countDownTimer = this.f20561c;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f20561c = null;
        setVisibility(8);
    }

    /* JADX INFO: renamed from: h */
    public final void m22064h(long j11) {
        CountDownTimer countDownTimer = this.f20561c;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f20561c = new CountDownTimerC12012a(j11, this).start();
    }

    public /* synthetic */ SymbolOfflineBannerView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: c */
    public final void m22059c(SpannableStringBuilder spannableStringBuilder, String str, String str2, int i11) {
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) str);
        spannableStringBuilder.setSpan(new StyleSpan(1), length, spannableStringBuilder.length(), 33);
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) str2);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(i11), length2, spannableStringBuilder.length(), 33);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CountDownTimer countDownTimer = this.f20561c;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f20561c = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SymbolOfflineBannerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        C45399o0 c45399o0M100335c = C45399o0.m100335c(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(c45399o0M100335c, "inflate(...)");
        this.f20560b = c45399o0M100335c;
        c45399o0M100335c.f102268d.setText(context.getString(R$string.kc_trade_symbol_offline_soon));
        c45399o0M100335c.f102268d.setDashColor(ContextCompat.getColor(context, R$color.c_text20));
    }
}
