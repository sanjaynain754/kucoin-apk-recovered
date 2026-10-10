package com.sumsub.sns.core.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$style;
import com.sumsub.sns.R$styleable;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSCustomizationTheme;
import com.sumsub.sns.core.theme.SNSJsonCustomization;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.presentation.theme.C28955c;
import com.sumsub.sns.internal.core.presentation.theme.C28966p;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0007J\u000e\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0007R(\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/SNSProgressView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "value", "", "text", "getText", "()Ljava/lang/CharSequence;", "setText", "(Ljava/lang/CharSequence;)V", "progressBar", "Landroid/widget/ProgressBar;", "getProgressBar", "()Landroid/widget/ProgressBar;", "setProgressBackgroundColor", "", "color", "setProgressBarColor", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSProgressView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSProgressView.kt\ncom/sumsub/sns/core/widget/SNSProgressView\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 ViewThemeExtensions.kt\ncom/sumsub/sns/core/presentation/helper/ViewThemeExtensionsKt\n*L\n1#1,81:1\n233#2,3:82\n37#3:85\n37#3:86\n*S KotlinDebug\n*F\n+ 1 SNSProgressView.kt\ncom/sumsub/sns/core/widget/SNSProgressView\n*L\n36#1:82,3\n62#1:85\n67#1:86\n*E\n"})
public final class SNSProgressView extends ConstraintLayout {
    @JvmOverloads
    public SNSProgressView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
    }

    @JvmOverloads
    public SNSProgressView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    private final ProgressBar getProgressBar() {
        return (ProgressBar) findViewById(R$id.sns_progress_bar);
    }

    @Nullable
    public final CharSequence getText() {
        TextView textView = (TextView) findViewById(R$id.sns_progress_text);
        if (textView != null) {
            return textView.getText();
        }
        return null;
    }

    public final void setProgressBackgroundColor(int color) {
        View viewFindViewById = findViewById(R$id.sns_progress_bg);
        Drawable background = viewFindViewById != null ? viewFindViewById.getBackground() : null;
        MaterialShapeDrawable materialShapeDrawable = background instanceof MaterialShapeDrawable ? (MaterialShapeDrawable) background : null;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setTint(color);
        }
    }

    public final void setText(@Nullable CharSequence charSequence) {
        TextView textView = (TextView) findViewById(R$id.sns_progress_text);
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @JvmOverloads
    public SNSProgressView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
    }

    public final void setProgressBarColor(int color) {
        ProgressBar progressBar = getProgressBar();
        if (progressBar != null) {
            progressBar.setIndeterminateTintList(ColorStateList.valueOf(color));
        }
    }

    public /* synthetic */ SNSProgressView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? R$attr.sns_ProgressViewStyle : i11, (i13 & 8) != 0 ? R$style.Widget_SNSProgressView : i12);
    }

    @JvmOverloads
    public SNSProgressView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        C28955c c28955c;
        Integer num;
        C28955c c28955c2;
        super(context, attributeSet, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SNSProgressView, i11, i12);
        LayoutInflater.from(context).inflate(typedArrayObtainStyledAttributes.getResourceId(R$styleable.SNSProgressView_sns_progressViewLayout, 0), (ViewGroup) this, true);
        int i13 = R$styleable.SNSProgressView_sns_dimColor;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            setBackgroundColor(AbstractC28458h.m69329a(typedArrayObtainStyledAttributes, context, i13).getDefaultColor());
        }
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(context, attributeSet, i11, i12);
        int i14 = R$styleable.SNSProgressView_sns_progressBackgroundColor;
        if (typedArrayObtainStyledAttributes.hasValue(i14)) {
            materialShapeDrawable.setTint(AbstractC28458h.m69329a(typedArrayObtainStyledAttributes, context, i14).getDefaultColor());
        }
        View viewFindViewById = findViewById(R$id.sns_progress_bg);
        if (viewFindViewById != null) {
            viewFindViewById.setBackground(materialShapeDrawable);
        }
        Unit unit = Unit.INSTANCE;
        typedArrayObtainStyledAttributes.recycle();
        SNSColorElement sNSColorElement = SNSColorElement.BACKGROUND_COMMON;
        C28468k0 c28468k0 = C28468k0.f57983a;
        SNSJsonCustomization customization = c28468k0.getCustomization();
        Integer num2 = null;
        SNSCustomizationTheme theme = customization != null ? customization.getTheme() : null;
        C28966p c28966p = theme instanceof C28966p ? (C28966p) theme : null;
        if (c28966p != null) {
            boolean zM69346a = AbstractC28458h.m69346a(getResources().getConfiguration());
            Map map = c28966p.f58877c;
            if (map == null || (c28955c2 = (C28955c) map.get(sNSColorElement.getValue())) == null) {
                num = null;
            } else if (zM69346a) {
                num = c28955c2.f58858a;
            } else {
                num = c28955c2.f58859b;
            }
            if (num != null) {
                int iIntValue = num.intValue();
                setBackground(new ColorDrawable(iIntValue));
                setProgressBackgroundColor(iIntValue);
            }
        }
        SNSColorElement sNSColorElement2 = SNSColorElement.CONTENT_NEUTRAL;
        SNSJsonCustomization customization2 = c28468k0.getCustomization();
        SNSCustomizationTheme theme2 = customization2 != null ? customization2.getTheme() : null;
        C28966p c28966p2 = theme2 instanceof C28966p ? (C28966p) theme2 : null;
        if (c28966p2 != null) {
            boolean zM69346a2 = AbstractC28458h.m69346a(getResources().getConfiguration());
            Map map2 = c28966p2.f58877c;
            if (map2 != null && (c28955c = (C28955c) map2.get(sNSColorElement2.getValue())) != null) {
                if (zM69346a2) {
                    num2 = c28955c.f58858a;
                } else {
                    num2 = c28955c.f58859b;
                }
            }
            if (num2 != null) {
                setProgressBarColor(num2.intValue());
            }
        }
    }
}
