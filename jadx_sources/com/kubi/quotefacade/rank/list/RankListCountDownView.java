package com.kubi.quotefacade.rank.list;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.google.android.material.timepicker.TimeModel;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.R$layout;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.util.CountDownCallback;
import com.kubi.sdk.util.CountDownFinishCallback;
import com.kubi.sdk.util.TimeSyncManager;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: RankListCountDownView.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u0015\u0010\u001b\u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u00182\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003J\b\u0010 \u001a\u00020\u0018H\u0014J\b\u0010!\u001a\u00020\u0018H\u0014J\b\u0010\"\u001a\u00020\u0018H\u0002J\b\u0010#\u001a\u00020\u0018H\u0002J\u0010\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\rH\u0017J\b\u0010&\u001a\u00020\u0018H\u0016R\u0012\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000eR\u0012\u0010\u000f\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, m90084d2 = {"Lcom/kubi/quotefacade/rank/list/RankListCountDownView;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "Lcom/kubi/sdk/util/CountDownCallback;", "Lcom/kubi/sdk/util/CountDownFinishCallback;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "launchTime", "", "Ljava/lang/Long;", "taskId", "Ljava/lang/Integer;", "tvDay", "Lcom/kubi/resources/widget/BaseTextView;", "tvHour", "tvMinute", "tvSeconds", "finishCallback", "onShowChange", "", TIMPushProvider.f75062n, "", "updateLaunchTime", "value", "(Ljava/lang/Long;)V", "updateFinishCallback", TUIConstants.TUIChat.CALL_BACK, "onAttachedToWindow", "onDetachedFromWindow", "registerTimerTask", "unRegisterTimerTask", "countDown", "remainingSecond", "finish", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class RankListCountDownView extends LinearLayoutCompat implements CountDownCallback, CountDownFinishCallback {

    /* JADX INFO: renamed from: b */
    @Nullable
    public Long f42468b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public Integer f42469c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public BaseTextView f42470d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public BaseTextView f42471e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public BaseTextView f42472f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public BaseTextView f42473g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public CountDownFinishCallback f42474h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RankListCountDownView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RankListCountDownView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: c */
    private final void m52794c() {
        Integer num = this.f42469c;
        if (num != null) {
            TimeSyncManager.f48123a.m58369s(num.intValue());
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m52795a(boolean z11) {
        if (z11) {
            m52793b();
        } else {
            m52794c();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m52796d(@Nullable CountDownFinishCallback countDownFinishCallback) {
        this.f42474h = countDownFinishCallback;
    }

    /* JADX INFO: renamed from: e */
    public final void m52797e(@Nullable Long l11) {
        this.f42468b = l11;
        if (l11 != null) {
            mo20702l2(((l11.longValue() - TimeSyncManager.f48123a.m58366p()) + ((long) 500)) / ((long) 1000));
        }
        m52793b();
    }

    @Override // com.kubi.sdk.util.CountDownFinishCallback
    public void finish() {
        CountDownFinishCallback countDownFinishCallback = this.f42474h;
        if (countDownFinishCallback != null) {
            countDownFinishCallback.finish();
        }
    }

    @Override // com.kubi.sdk.util.CountDownCallback
    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: l2 */
    public void mo20702l2(long j11) {
        long jCoerceAtLeast = RangesKt.coerceAtLeast(j11, 0L);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long days = timeUnit.toDays(jCoerceAtLeast);
        long hours = timeUnit.toHours(jCoerceAtLeast) % ((long) 24);
        long j12 = 60;
        long minutes = timeUnit.toMinutes(jCoerceAtLeast) % j12;
        long j13 = jCoerceAtLeast % j12;
        BaseTextView baseTextView = this.f42470d;
        if (baseTextView != null) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(Locale.ENGLISH, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(days)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            baseTextView.setText(str);
        }
        BaseTextView baseTextView2 = this.f42471e;
        if (baseTextView2 != null) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String str2 = String.format(Locale.ENGLISH, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(hours)}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            baseTextView2.setText(str2);
        }
        BaseTextView baseTextView3 = this.f42472f;
        if (baseTextView3 != null) {
            StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
            String str3 = String.format(Locale.ENGLISH, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(minutes)}, 1));
            Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
            baseTextView3.setText(str3);
        }
        BaseTextView baseTextView4 = this.f42473g;
        if (baseTextView4 != null) {
            StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
            String str4 = String.format(Locale.ENGLISH, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(j13)}, 1));
            Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
            baseTextView4.setText(str4);
        }
    }

    public /* synthetic */ RankListCountDownView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: b */
    private final void m52793b() {
        m52794c();
        Long l11 = this.f42468b;
        if (l11 != null) {
            this.f42469c = Integer.valueOf(TimeSyncManager.f48123a.m58359i(l11.longValue(), this, this));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m52793b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Integer num = this.f42469c;
        if (num != null) {
            TimeSyncManager.f48123a.m58369s(num.intValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RankListCountDownView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(context).inflate(R$layout.quote_layout_alpha_countdown, (ViewGroup) this, true);
        setGravity(16);
        this.f42470d = (BaseTextView) findViewById(R$id.tvDay);
        this.f42471e = (BaseTextView) findViewById(R$id.tvHour);
        this.f42472f = (BaseTextView) findViewById(R$id.tvMinute);
        this.f42473g = (BaseTextView) findViewById(R$id.tvSeconds);
    }
}
