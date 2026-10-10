package com.kubi.redpackage.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.data.coin.AccountType;
import com.kubi.redpackage.R$color;
import com.kubi.sdk.function.language.MultiLanguageManager;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AccountLabelView.kt */
/* JADX INFO: loaded from: classes38.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0014J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001aH\u0014R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/redpackage/view/AccountLabelView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "paint", "Landroid/graphics/Paint;", "rectF", "Landroid/graphics/RectF;", "resArrayCn", "", "", "[Ljava/lang/String;", "resArray", "currentAccountPosition", "", "currentAccount", "Lcom/kubi/data/coin/AccountType;", "setCurrentAccount", "", "accountType", "onDraw", "canvas", "Landroid/graphics/Canvas;", "RedpackageLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AccountLabelView extends View {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Paint f43384b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final RectF f43385c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final String[] f43386d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final String[] f43387e;

    /* JADX INFO: renamed from: f */
    public int f43388f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public AccountType f43389g;

    /* JADX INFO: renamed from: com.kubi.redpackage.view.AccountLabelView$a */
    /* JADX INFO: compiled from: AccountLabelView.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C22873a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccountType.values().length];
            try {
                iArr[AccountType.TRADE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccountType.MARGIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AccountType.CONTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AccountType.FINANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AccountType.SUB.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AccountType.ISOLATED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountLabelView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f43384b = new Paint(1);
        this.f43385c = new RectF();
        this.f43386d = new String[]{"储", "币", "杠", "合", "金", "子", "杠"};
        this.f43387e = new String[]{"Ma", "Tr", "Mg", "Fu", "Fi", "Su", "Is"};
        this.f43389g = AccountType.MAIN;
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        this.f43384b.setColor(Color.parseColor(this.f43389g.getColorString()));
        this.f43384b.setStyle(Paint.Style.FILL);
        RectF rectF = this.f43385c;
        rectF.right = rectF.left + getWidth();
        RectF rectF2 = this.f43385c;
        rectF2.bottom = rectF2.top + getHeight();
        canvas.drawRoundRect(this.f43385c, C5275i0.m6236a(2.0f), C5275i0.m6236a(2.0f), this.f43384b);
        this.f43384b.setColor(getContext().getResources().getColor(R$color.c_overlay));
        this.f43384b.setTextSize(getHeight() * 0.8f);
        String str = MultiLanguageManager.m56979h() ? this.f43386d[this.f43388f] : this.f43387e[this.f43388f];
        float fMeasureText = this.f43384b.measureText(str);
        if (fMeasureText > getWidth() * 0.8f) {
            Paint paint = this.f43384b;
            paint.setTextSize(paint.getTextSize() * ((getWidth() * 0.8f) / fMeasureText));
        }
        Paint.FontMetricsInt fontMetricsInt = this.f43384b.getFontMetricsInt();
        Intrinsics.checkNotNullExpressionValue(fontMetricsInt, "getFontMetricsInt(...)");
        int i11 = fontMetricsInt.bottom;
        canvas.drawText(str, getWidth() * 0.1f, (getHeight() / 2) + (((i11 - fontMetricsInt.top) / 2) - i11), this.f43384b);
    }

    public final void setCurrentAccount(@NotNull AccountType accountType) {
        int i11;
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        switch (C22873a.$EnumSwitchMapping$0[accountType.ordinal()]) {
            case 1:
                i11 = 1;
                break;
            case 2:
                i11 = 2;
                break;
            case 3:
                i11 = 3;
                break;
            case 4:
                i11 = 4;
                break;
            case 5:
                i11 = 5;
                break;
            case 6:
                i11 = 6;
                break;
            default:
                i11 = 0;
                break;
        }
        this.f43388f = i11;
        this.f43389g = accountType;
        invalidate();
    }
}
