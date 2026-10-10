package com.kubi.kumex.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.kubi.futures.trade.welfare.airdrop.AirdropPositionDetailsDialog;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$drawable;
import com.kubi.kumex.R$font;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.market.model.FundingRateEntity;
import com.kubi.kumex.utils.C17056l0;
import com.kubi.kumex.view.PositionTrialLayout;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.widget.AlignTopTextView;
import com.kubi.sdk.widget.shape.layout.ShapeConstraintLayout;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27092t0;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.C27029c;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.C34054z6;
import java.util.TimeZone;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42179a;
import p481ny.C42899b;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PositionTrialLayout.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007JU\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0013\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\rH\u0002J\b\u0010\u001b\u001a\u00020\u000fH\u0002J\b\u0010\u001c\u001a\u00020\u000fH\u0002R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/kumex/view/PositionTrialLayout;", "Lcom/kubi/sdk/widget/shape/layout/ShapeConstraintLayout;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", C34054z6.f72610i, "Lcom/kubi/resources/widget/AlignTopTextView;", "mTime", "Landroidx/appcompat/widget/AppCompatTextView;", "eightHour", "", "render", "", "amount", "", "expireTime", "prizeType", "maxValue", "minTotalAmount", "minCloseRealisedPnl", "code", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTime", "time", "createLeftTitle", "createRightTime", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class PositionTrialLayout extends ShapeConstraintLayout {

    /* JADX INFO: renamed from: p */
    @Nullable
    public AlignTopTextView f30908p;

    /* JADX INFO: renamed from: q */
    @Nullable
    public AppCompatTextView f30909q;

    /* JADX INFO: renamed from: r */
    public final long f30910r;

    /* JADX INFO: renamed from: com.kubi.kumex.view.PositionTrialLayout$a */
    /* JADX INFO: compiled from: PositionTrialLayout.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/kumex/view/PositionTrialLayout$render$1$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "p0", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17079a extends ClickableSpan {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f30911b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ PositionTrialLayout f30912c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Long f30913d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ String f30914e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ String f30915f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ String f30916g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ String f30917h;

        public C17079a(boolean z11, PositionTrialLayout positionTrialLayout, Long l11, String str, String str2, String str3, String str4) {
            this.f30911b = z11;
            this.f30912c = positionTrialLayout;
            this.f30913d = l11;
            this.f30914e = str;
            this.f30915f = str2;
            this.f30916g = str3;
            this.f30917h = str4;
        }

        /* JADX INFO: renamed from: b */
        public static final Unit m36711b(PositionTrialLayout positionTrialLayout, Long l11, String str, String str2, String str3, String str4, FragmentActivity it) {
            Intrinsics.checkNotNullParameter(it, "it");
            AirdropPositionDetailsDialog airdropPositionDetailsDialog = new AirdropPositionDetailsDialog();
            String strM36706h = positionTrialLayout.m36706h(C27039d.m66652l(l11));
            Bundle bundle = new Bundle();
            bundle.putString("data", strM36706h);
            bundle.putString("data_1", str);
            bundle.putString("data_2", str2);
            bundle.putString("data_3", str3);
            bundle.putString("data_4", str4);
            airdropPositionDetailsDialog.setArguments(bundle);
            FragmentManager supportFragmentManager = it.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            airdropPositionDetailsDialog.show(supportFragmentManager, "AirdropPositionDetailsDialog");
            return Unit.INSTANCE;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View p11) {
            Intrinsics.checkNotNullParameter(p11, "p0");
            if (this.f30911b) {
                final PositionTrialLayout positionTrialLayout = this.f30912c;
                final Long l11 = this.f30913d;
                final String str = this.f30914e;
                final String str2 = this.f30915f;
                final String str3 = this.f30916g;
                final String str4 = this.f30917h;
                C42899b.m94073c(new Function1() { // from class: xm.i0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PositionTrialLayout.C17079a.m36711b(positionTrialLayout, l11, str, str2, str3, str4, (FragmentActivity) obj);
                    }
                });
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds2) {
            Intrinsics.checkNotNullParameter(ds2, "ds");
            ds2.setColor(C27017c.f54310a.m66512a(R$color.c_text));
            ds2.setUnderlineText(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PositionTrialLayout(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attributeSet, "attributeSet");
        this.f30910r = FundingRateEntity.DEFAULT_FUNDING_PERIOD_MILLIS;
        m36707f();
        m36708g();
        getShapeDrawableBuilder().m92151m(C27017c.f54310a.m66512a(R$color.complementary4));
        getShapeDrawableBuilder().m92149k(C27040e.m66658b(8));
        getShapeDrawableBuilder().m92143e();
    }

    /* JADX INFO: renamed from: f */
    public final void m36707f() {
        int iM66601d = C27029c.m66601d(this, 8);
        C27017c c27017c = C27017c.f54310a;
        Drawable drawableM66514c = c27017c.m66514c(R$drawable.ic2_coupons_16, Integer.valueOf(R$color.complementary));
        AlignTopTextView alignTopTextView = new AlignTopTextView(getContext());
        alignTopTextView.setTypeface(ResourcesCompat.getFont(getContext(), R$font.regular));
        alignTopTextView.setId(R$id.title);
        alignTopTextView.setTextSize(12.0f);
        alignTopTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableM66514c, (Drawable) null, (Drawable) null, (Drawable) null);
        alignTopTextView.setCompoundDrawablePadding(C27029c.m66601d(this, 4));
        alignTopTextView.setTextColor(c27017c.m66512a(R$color.c_text40));
        alignTopTextView.setPaddingRelative(0, iM66601d, 0, C27040e.m66658b(4));
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, -2);
        layoutParams.topToTop = 0;
        layoutParams.startToStart = 0;
        layoutParams.setMarginStart(C27029c.m66601d(this, 8));
        addView(alignTopTextView, layoutParams);
        this.f30908p = alignTopTextView;
    }

    /* JADX INFO: renamed from: g */
    public final void m36708g() {
        int iM66601d = C27029c.m66601d(this, 8);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        appCompatTextView.setId(R$id.time);
        appCompatTextView.setGravity(GravityCompat.END);
        appCompatTextView.setTypeface(ResourcesCompat.getFont(getContext(), R$font.regular));
        appCompatTextView.setTextColor(C27017c.f54310a.m66512a(R$color.c_text40));
        appCompatTextView.setTextSize(10.0f);
        appCompatTextView.setPaddingRelative(0, 0, iM66601d, iM66601d);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, -2);
        layoutParams.topToBottom = R$id.title;
        layoutParams.startToStart = 0;
        layoutParams.setMarginStart(C27029c.m66601d(this, 27));
        addView(appCompatTextView, layoutParams);
        this.f30909q = appCompatTextView;
    }

    /* JADX INFO: renamed from: i */
    public final void m36709i(@Nullable String str, @Nullable Long l11, @NotNull String prizeType, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        Intrinsics.checkNotNullParameter(prizeType, "prizeType");
        if (str == null || str.length() == 0 || C27039d.m66652l(l11) <= 0) {
            ViewExtKt.m66577h(this);
            return;
        }
        C27046k.m66685H(this);
        boolean zM66897b = C27092t0.m66897b(prizeType);
        AlignTopTextView alignTopTextView = this.f30908p;
        if (alignTopTextView != null) {
            C27017c c27017c = C27017c.f54310a;
            alignTopTextView.setText(c27017c.m66516f(zM66897b ? R$string.kumex_airdrop_position_tips_detail : R$string.kumex_welfare_position_use_desc, C27041f.m66668h(str)));
            HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
            HighlightTextHelper.TextTagEnum textTagEnum = HighlightTextHelper.TextTagEnum.SPAN;
            Pair pair = new Pair(textTagEnum, new ForegroundColorSpan(c27017c.m66512a(R$color.c_text)));
            int i11 = R$font.medium;
            TypefaceSpan typefaceSpanM36545b = C17056l0.m36545b(i11);
            if (typefaceSpanM36545b == null) {
                typefaceSpanM36545b = new TypefaceSpan("sans-serif-medium");
            }
            Pair pair2 = new Pair(textTagEnum, typefaceSpanM36545b);
            HighlightTextHelper.TextTagEnum textTagEnum2 = HighlightTextHelper.TextTagEnum.SPAN1;
            Pair pair3 = new Pair(textTagEnum2, new C17079a(zM66897b, this, l11, str3, str4, str2, str5));
            TypefaceSpan typefaceSpanM36545b2 = C17056l0.m36545b(i11);
            if (typefaceSpanM36545b2 == null) {
                typefaceSpanM36545b2 = new TypefaceSpan("sans-serif-medium");
            }
            highlightTextHelper.m54120f(alignTopTextView, pair, pair2, pair3, new Pair(textTagEnum2, typefaceSpanM36545b2));
            alignTopTextView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        AppCompatTextView appCompatTextView = this.f30909q;
        if (appCompatTextView != null) {
            C27017c c27017c2 = C27017c.f54310a;
            appCompatTextView.setText(c27017c2.m66516f(R$string.kumex_expires_time, m36706h(C27039d.m66652l(l11))));
            appCompatTextView.setTextColor(c27017c2.m66512a(R$color.c_text40));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public final String m36706h(long j11) {
        String str;
        int rawOffset = ((TimeZone.getDefault().getRawOffset() / 1000) / 60) / 60;
        StringBuilder sb2 = new StringBuilder();
        if (rawOffset >= 0) {
            str = "+";
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append(rawOffset);
        return C42179a.m92633f(j11, null, false, true, null, 11, null) + " (UTC" + sb2.toString() + ')';
    }
}
