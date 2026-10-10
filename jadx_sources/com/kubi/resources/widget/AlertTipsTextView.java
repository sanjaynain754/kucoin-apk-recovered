package com.kubi.resources.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.otc.entity.OtcAd;
import com.kubi.sdk.res.R$color;
import com.kubi.sdk.res.R$font;
import com.kubi.sdk.res.R$styleable;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.core.C27029c;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AlertTipsTextView.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 '2\u00020\u0001:\u0001'B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\tH\u0002J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\tH\u0002J(\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\tH\u0014J0\u0010\u001e\u001a\u00020\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\"\u001a\u0004\u0018\u00010 2\b\u0010#\u001a\u0004\u0018\u00010 H\u0016J\u0018\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020 2\u0006\u0010&\u001a\u00020\fH\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0010R\u0012\u0010\u0011\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0010R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, m90084d2 = {"Lcom/kubi/resources/widget/AlertTipsTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "startTint", "", "endTint", "startTintAlignCenter", "", "endTintAlignCenter", "cornerRadius", "fontColor", "Ljava/lang/Integer;", "backgroundColor", "lineSpaceMult", "", "setFontFamily", "", "fontFamilyType", "setTipsLevel", "tipsLevel", "onSizeChanged", "w", CmcdData.Factory.STREAMING_FORMAT_HLS, "oldw", "oldh", "setCompoundDrawablesRelative", "start", "Landroid/graphics/drawable/Drawable;", ViewProps.TOP, "end", ViewProps.BOTTOM, "resetDrawables", "drawables", "isAlignCenter", "Companion", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAlertTipsTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlertTipsTextView.kt\ncom/kubi/resources/widget/AlertTipsTextView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,243:1\n1#2:244\n*E\n"})
public final class AlertTipsTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: j */
    @NotNull
    public static final Companion f43698j = new Companion(null);

    /* JADX INFO: renamed from: k */
    @NotNull
    public static final HashMap<Integer, Typeface> f43699k = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public int f43700b;

    /* JADX INFO: renamed from: c */
    public int f43701c;

    /* JADX INFO: renamed from: d */
    public boolean f43702d;

    /* JADX INFO: renamed from: e */
    public boolean f43703e;

    /* JADX INFO: renamed from: f */
    public int f43704f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public Integer f43705g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public Integer f43706h;

    /* JADX INFO: renamed from: i */
    public float f43707i;

    /* JADX INFO: compiled from: AlertTipsTextView.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R1\u0010\u000b\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\r0\fj\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\r`\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/resources/widget/AlertTipsTextView$Companion;", "", "<init>", "()V", "WARNING", "", "NOTICE", OtcAd.STATUS_NORMAL, "IMPORTANT", "NOTICE_IMPORTANT", "ERROR", "typefaceCache", "Ljava/util/HashMap;", "Landroid/graphics/Typeface;", "Lkotlin/collections/HashMap;", "getTypefaceCache", "()Ljava/util/HashMap;", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final HashMap<Integer, Typeface> getTypefaceCache() {
            return AlertTipsTextView.f43699k;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final Unit m54425e(int i11, AlertTipsTextView alertTipsTextView) {
        int i12;
        if (i11 == 1) {
            i12 = R$font.medium;
        } else if (i11 != 2) {
            i12 = i11 != 3 ? R$font.regular : R$font.bold;
        } else {
            i12 = R$font.semi;
        }
        HashMap<Integer, Typeface> map = f43699k;
        if (map.containsKey(Integer.valueOf(i12))) {
            Typeface typeface = map.get(Integer.valueOf(i12));
            if (typeface == null) {
                typeface = Typeface.DEFAULT;
            }
            alertTipsTextView.setTypeface(typeface);
            return Unit.INSTANCE;
        }
        Typeface font = ResourcesCompat.getFont(alertTipsTextView.getContext(), i12);
        map.put(Integer.valueOf(i12), font);
        if (font == null) {
            font = Typeface.DEFAULT;
        }
        alertTipsTextView.setTypeface(font);
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlertTipsTextView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f43704f = C27029c.m66600c(this, 8.0f);
        this.f43707i = 1.2f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, R$styleable.AlertTipsTextView);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f43700b = typedArrayObtainStyledAttributes.getColor(R$styleable.AlertTipsTextView_att_startDrawableTint, 0);
        this.f43701c = typedArrayObtainStyledAttributes.getColor(R$styleable.AlertTipsTextView_att_endDrawableTint, 0);
        this.f43702d = typedArrayObtainStyledAttributes.getBoolean(R$styleable.AlertTipsTextView_att_startDrawableAlignCenter, false);
        this.f43703e = typedArrayObtainStyledAttributes.getBoolean(R$styleable.AlertTipsTextView_att_endDrawableAlignCenter, false);
        this.f43704f = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.AlertTipsTextView_att_cornerRadius, this.f43704f);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.AlertTipsTextView_att_paddingStart, C27029c.m66600c(this, 16.0f));
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.AlertTipsTextView_att_paddingEnd, C27029c.m66600c(this, 16.0f));
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.AlertTipsTextView_att_paddingTop, C27029c.m66600c(this, 12.0f));
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.AlertTipsTextView_att_paddingBottom, C27029c.m66600c(this, 12.0f));
        int dimensionPixelSize5 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.AlertTipsTextView_att_drawablePadding, C27029c.m66600c(this, 8.0f));
        this.f43707i = typedArrayObtainStyledAttributes.getFloat(R$styleable.AlertTipsTextView_att_lineSpaceMult, 1.2f);
        int i11 = typedArrayObtainStyledAttributes.getInt(R$styleable.AlertTipsTextView_att_tipsLevel, 0);
        int i12 = typedArrayObtainStyledAttributes.getInt(R$styleable.AlertTipsTextView_att_fontFamily, 0);
        int dimensionPixelSize6 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.AlertTipsTextView_att_fontSize, (int) C27025c.m66568f(context, 14));
        int i13 = R$styleable.AlertTipsTextView_att_fontColor;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            this.f43705g = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(i13, ContextCompat.getColor(context, R$color.c_text60)));
        }
        int i14 = R$styleable.AlertTipsTextView_att_backgroundColor;
        if (typedArrayObtainStyledAttributes.hasValue(i14)) {
            this.f43706h = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(i14, ContextCompat.getColor(context, R$color.complementary8)));
        }
        typedArrayObtainStyledAttributes.recycle();
        setFontFamily(i12);
        setTextSize(0, dimensionPixelSize6);
        setCompoundDrawablePadding(dimensionPixelSize5);
        setLineSpacing(getLineSpacingExtra(), this.f43707i);
        setPaddingRelative(dimensionPixelSize, dimensionPixelSize3, dimensionPixelSize2, dimensionPixelSize4 + C27029c.m66600c(this, 1.0f));
        setTipsLevel(i11);
    }

    private final void setFontFamily(final int fontFamilyType) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.resources.widget.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlertTipsTextView.m54425e(fontFamilyType, this);
            }
        });
    }

    private final void setTipsLevel(int tipsLevel) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(this.f43704f);
        Context context = getContext();
        int i11 = R$color.complementary8;
        int color = ContextCompat.getColor(context, i11);
        Context context2 = getContext();
        int i12 = R$color.c_text60;
        setTextColor(ContextCompat.getColor(context2, i12));
        if (tipsLevel == 0) {
            color = ContextCompat.getColor(getContext(), i11);
            setTextColor(ContextCompat.getColor(getContext(), i12));
        } else if (tipsLevel == 1) {
            color = ContextCompat.getColor(getContext(), R$color.brandGreen8);
            setTextColor(ContextCompat.getColor(getContext(), i12));
        } else if (tipsLevel == 2) {
            color = ContextCompat.getColor(getContext(), R$color.c_cover4);
            setTextColor(ContextCompat.getColor(getContext(), i12));
        } else if (tipsLevel == 3) {
            color = ContextCompat.getColor(getContext(), i11);
            setTextColor(ContextCompat.getColor(getContext(), R$color.complementary));
        } else if (tipsLevel == 4) {
            color = ContextCompat.getColor(getContext(), R$color.brandGreen8);
            setTextColor(ContextCompat.getColor(getContext(), R$color.brandGreen));
        } else if (tipsLevel == 5) {
            color = ContextCompat.getColor(getContext(), R$color.brandRed8);
            setTextColor(ContextCompat.getColor(getContext(), R$color.brandRed));
        }
        Integer num = this.f43706h;
        if (num != null) {
            color = num.intValue();
        }
        Integer num2 = this.f43705g;
        if (num2 != null) {
            setTextColor(num2.intValue());
        }
        gradientDrawable.setColor(color);
        setBackground(gradientDrawable);
    }

    /* JADX INFO: renamed from: d */
    public final void m54426d(Drawable drawable, boolean z11) {
        if (z11) {
            return;
        }
        if (getLineCount() <= 1) {
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            return;
        }
        Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
        float f11 = fontMetrics.descent - fontMetrics.ascent;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int measuredHeight = (int) (((intrinsicHeight - ((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom())) / 2.0f) + (fontMetrics.ascent - fontMetrics.top) + ((f11 - intrinsicHeight) / 2.0f));
        drawable.setBounds(0, measuredHeight, drawable.getIntrinsicWidth(), intrinsicHeight + measuredHeight);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setCompoundDrawablesRelative(@Nullable Drawable start, @Nullable Drawable top, @Nullable Drawable end, @Nullable Drawable bottom) {
        if (start != null) {
            int i11 = this.f43700b;
            if (i11 != 0) {
                start.setColorFilter(i11, PorterDuff.Mode.SRC_IN);
            }
            m54426d(start, this.f43702d);
        }
        if (end != null) {
            int i12 = this.f43701c;
            if (i12 != 0) {
                end.setColorFilter(i12, PorterDuff.Mode.SRC_IN);
            }
            m54426d(end, this.f43703e);
        }
        super.setCompoundDrawablesRelative(start, top, end, bottom);
    }

    @Override // android.view.View
    public void onSizeChanged(int w11, int h11, int oldw, int oldh) {
        super.onSizeChanged(w11, h11, oldw, oldh);
        setCompoundDrawablesRelative(getCompoundDrawablesRelative()[0], getCompoundDrawablesRelative()[1], getCompoundDrawablesRelative()[2], getCompoundDrawablesRelative()[3]);
    }
}
