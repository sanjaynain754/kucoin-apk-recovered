package com.sumsub.sns.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.ViewCompat;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$style;
import com.sumsub.sns.R$styleable;
import com.sumsub.sns.internal.core.common.AbstractC28485q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007J\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0007¨\u0006\u0010"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/SNSFrameView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "setStroke", "", "width", "color", "setFillColor", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public class SNSFrameView extends FrameLayout {
    @JvmOverloads
    public SNSFrameView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
    }

    @JvmOverloads
    public SNSFrameView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    @JvmOverloads
    public SNSFrameView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
    }

    public final void setFillColor(int color) {
        SNSFrameDrawable sNSFrameDrawable;
        Drawable foreground = getForeground();
        if (foreground instanceof SNSFrameDrawable) {
            sNSFrameDrawable = (SNSFrameDrawable) foreground;
        } else {
            sNSFrameDrawable = null;
        }
        if (sNSFrameDrawable != null) {
            sNSFrameDrawable.setFillColor(color);
        }
    }

    public final void setStroke(int width, int color) {
        SNSFrameDrawable sNSFrameDrawable;
        Drawable foreground = getForeground();
        if (foreground instanceof SNSFrameDrawable) {
            sNSFrameDrawable = (SNSFrameDrawable) foreground;
        } else {
            sNSFrameDrawable = null;
        }
        if (sNSFrameDrawable != null) {
            sNSFrameDrawable.setStroke(width, color);
        }
    }

    public /* synthetic */ SNSFrameView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? R$attr.sns_FrameViewStyle : i11, (i13 & 8) != 0 ? R$style.SNSFrameViewStyle : i12);
    }

    @JvmOverloads
    public SNSFrameView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SNSFrameView, i11, i12);
        setForeground(new SNSFrameDrawable(AppCompatResources.getDrawable(context, typedArrayObtainStyledAttributes.getResourceId(R$styleable.SNSFrameView_sns_FrameDrawable, -1)), AbstractC28485q.m69379a(typedArrayObtainStyledAttributes, R$styleable.SNSFrameView_sns_FrameFillColor, ViewCompat.MEASURED_STATE_MASK), typedArrayObtainStyledAttributes.getDimension(R$styleable.SNSFrameView_sns_FramePaddingLeft, 0.0f), typedArrayObtainStyledAttributes.getDimension(R$styleable.SNSFrameView_sns_FramePaddingTop, 0.0f), typedArrayObtainStyledAttributes.getDimension(R$styleable.SNSFrameView_sns_FramePaddingRight, 0.0f), typedArrayObtainStyledAttributes.getDimension(R$styleable.SNSFrameView_sns_FramePaddingBottom, 0.0f)));
        typedArrayObtainStyledAttributes.recycle();
    }
}
