package com.kubi.resources.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.graphics.ColorUtils;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.uimanager.ViewProps;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KcTagsView.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u001b\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/resources/widget/KcTagsView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "initView", "()V", "", "dpValue", "", "b", "(F)I", "w", CmcdData.Factory.STREAMING_FORMAT_HLS, "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/graphics/drawable/Drawable;", "start", ViewProps.TOP, "end", ViewProps.BOTTOM, "setCompoundDrawablesRelativeWithIntrinsicBounds", "(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V", "LUIKit_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class KcTagsView extends AppCompatTextView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KcTagsView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        initView();
    }

    private final void initView() {
        setPadding(m54594b(4.0f), m54594b(1.0f), m54594b(4.0f), m54594b(1.0f));
        int iAlpha = Color.alpha(getCurrentTextColor());
        int currentTextColor = getCurrentTextColor();
        GradientDrawable gradientDrawable = new GradientDrawable();
        double d11 = iAlpha;
        gradientDrawable.setStroke(m54594b(0.5f), ColorUtils.setAlphaComponent(currentTextColor, (int) (0.16d * d11)));
        gradientDrawable.setColor(Integer.valueOf(ColorUtils.setAlphaComponent(currentTextColor, (int) (d11 * 0.08d))).intValue());
        gradientDrawable.setCornerRadius(m54594b(2.0f));
        setBackgroundDrawable(gradientDrawable);
        setCompoundDrawablePadding(m54594b(1.0f));
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(@Nullable Drawable start, @Nullable Drawable top, @Nullable Drawable end, @Nullable Drawable bottom) {
        if (start != null || end != null) {
            setPadding(m54594b(3.0f), m54594b(1.0f), m54594b(4.0f), m54594b(1.0f));
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(start, top, end, bottom);
    }

    /* JADX INFO: renamed from: b */
    private final int m54594b(float dpValue) {
        return (int) ((dpValue * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    @Override // android.view.View
    public void onSizeChanged(int w11, int h11, int oldw, int oldh) {
        super.onSizeChanged(w11, h11, oldw, oldh);
        setCompoundDrawablesRelativeWithIntrinsicBounds(getCompoundDrawablesRelative()[0], getCompoundDrawablesRelative()[1], getCompoundDrawablesRelative()[2], getCompoundDrawablesRelative()[3]);
    }
}
