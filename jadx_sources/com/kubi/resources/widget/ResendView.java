package com.kubi.resources.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.CountDownTimer;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.sdk.res.R$color;
import com.kubi.sdk.res.R$string;
import com.kubi.sdk.res.R$styleable;
import com.kubi.utils.extensions.DowngradeExKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ResendView.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010(\u001a\u00020)H\u0014J\u0006\u0010*\u001a\u00020!J\u0010\u0010+\u001a\u00020)2\b\u0010,\u001a\u0004\u0018\u00010'J\u0006\u0010-\u001a\u00020)J\u0006\u0010.\u001a\u00020)R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000b\"\u0004\b\u001c\u0010\rR\u001a\u0010\u001d\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u0013R\u000e\u0010 \u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, m90084d2 = {"Lcom/kubi/resources/widget/ResendView;", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "normalText", "", "getNormalText", "()Ljava/lang/String;", "setNormalText", "(Ljava/lang/String;)V", "normalColor", "", "getNormalColor", "()I", "setNormalColor", "(I)V", "countTime", "getCountTime", "setCountTime", "countInterval", "getCountInterval", "setCountInterval", "countText", "getCountText", "setCountText", "countColor", "getCountColor", "setCountColor", "isCounting", "", "countingTime", "", "countDownTimer", "Landroid/os/CountDownTimer;", "countDownListener", "Lcom/kubi/resources/widget/ICountDownListener;", "onDetachedFromWindow", "", "isCountingTime", "setCountDownListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "startCountTime", "stopCountTime", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ResendView extends AppCompatTextView {

    /* JADX INFO: renamed from: b */
    @NotNull
    public String f44026b;

    /* JADX INFO: renamed from: c */
    public int f44027c;

    /* JADX INFO: renamed from: d */
    public int f44028d;

    /* JADX INFO: renamed from: e */
    public int f44029e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public String f44030f;

    /* JADX INFO: renamed from: g */
    public int f44031g;

    /* JADX INFO: renamed from: h */
    public boolean f44032h;

    /* JADX INFO: renamed from: i */
    public long f44033i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public CountDownTimer f44034j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public ICountDownListener f44035k;

    /* JADX INFO: renamed from: com.kubi.resources.widget.ResendView$a */
    /* JADX INFO: compiled from: ResendView.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, m90084d2 = {"com/kubi/resources/widget/ResendView$startCountTime$1", "Landroid/os/CountDownTimer;", "onTick", "", "millisUntilFinished", "", "onFinish", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class CountDownTimerC22948a extends CountDownTimer {
        public CountDownTimerC22948a(long j11, long j12) {
            super(j11, j12);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            ResendView.this.m54762f();
            ICountDownListener iCountDownListener = ResendView.this.f44035k;
            if (iCountDownListener != null) {
                iCountDownListener.onFinish();
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long millisUntilFinished) {
            ResendView.this.f44033i = millisUntilFinished;
            ResendView resendView = ResendView.this;
            resendView.setText(DowngradeExKt.m66551u(resendView.getF44030f(), new Object[]{Long.valueOf(millisUntilFinished / ((long) 1000))}, null, 2, null));
            ICountDownListener iCountDownListener = ResendView.this.f44035k;
            if (iCountDownListener != null) {
                iCountDownListener.m55137a(millisUntilFinished);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m54762f() {
        this.f44032h = false;
        this.f44028d = 0;
        CountDownTimer countDownTimer = this.f44034j;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        setEnabled(true);
        setText(this.f44026b);
        setTextColor(this.f44027c);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResendView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        String string = getResources().getString(R$string.resend);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this.f44026b = string;
        this.f44027c = getResources().getColor(R$color.primary);
        this.f44028d = 60000;
        this.f44029e = 1000;
        String string2 = getResources().getString(R$string.signup_checkcode_resend_after);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        this.f44030f = string2;
        this.f44031g = getResources().getColor(R$color.emphasis40);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, R$styleable.ResendView);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        String string3 = typedArrayObtainStyledAttributes.getString(R$styleable.ResendView_normalText);
        this.f44026b = string3 == null ? this.f44026b : string3;
        this.f44027c = typedArrayObtainStyledAttributes.getColor(R$styleable.ResendView_normalColor, this.f44027c);
        this.f44028d = typedArrayObtainStyledAttributes.getInt(R$styleable.ResendView_countTime, this.f44028d);
        this.f44029e = typedArrayObtainStyledAttributes.getInt(R$styleable.ResendView_countInterval, this.f44029e);
        String string4 = typedArrayObtainStyledAttributes.getString(R$styleable.ResendView_countText);
        this.f44030f = string4 == null ? this.f44030f : string4;
        this.f44031g = typedArrayObtainStyledAttributes.getColor(R$styleable.ResendView_countColor, this.f44031g);
        typedArrayObtainStyledAttributes.recycle();
        m54762f();
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getF44032h() {
        return this.f44032h;
    }

    /* JADX INFO: renamed from: e */
    public final void m54761e() {
        if (this.f44032h) {
            m54762f();
        }
        this.f44032h = true;
        int i11 = this.f44028d;
        this.f44033i = i11;
        CountDownTimerC22948a countDownTimerC22948a = new CountDownTimerC22948a(i11, this.f44029e);
        this.f44034j = countDownTimerC22948a;
        countDownTimerC22948a.start();
        setEnabled(false);
        setText(DowngradeExKt.m66551u(this.f44030f, new Object[]{Integer.valueOf(this.f44028d / 1000)}, null, 2, null));
        setTextColor(this.f44031g);
    }

    /* JADX INFO: renamed from: getCountColor, reason: from getter */
    public final int getF44031g() {
        return this.f44031g;
    }

    /* JADX INFO: renamed from: getCountInterval, reason: from getter */
    public final int getF44029e() {
        return this.f44029e;
    }

    @NotNull
    /* JADX INFO: renamed from: getCountText, reason: from getter */
    public final String getF44030f() {
        return this.f44030f;
    }

    /* JADX INFO: renamed from: getCountTime, reason: from getter */
    public final int getF44028d() {
        return this.f44028d;
    }

    /* JADX INFO: renamed from: getNormalColor, reason: from getter */
    public final int getF44027c() {
        return this.f44027c;
    }

    @NotNull
    /* JADX INFO: renamed from: getNormalText, reason: from getter */
    public final String getF44026b() {
        return this.f44026b;
    }

    public final void setCountColor(int i11) {
        this.f44031g = i11;
    }

    public final void setCountDownListener(@Nullable ICountDownListener iCountDownListener) {
        this.f44035k = iCountDownListener;
        if (this.f44032h) {
            if (iCountDownListener != null) {
                iCountDownListener.m55137a(this.f44033i);
            }
        } else if (iCountDownListener != null) {
            iCountDownListener.onFinish();
        }
    }

    public final void setCountInterval(int i11) {
        this.f44029e = i11;
    }

    public final void setCountText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f44030f = str;
    }

    public final void setCountTime(int i11) {
        this.f44028d = i11;
    }

    public final void setNormalColor(int i11) {
        this.f44027c = i11;
    }

    public final void setNormalText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f44026b = str;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m54762f();
    }
}
