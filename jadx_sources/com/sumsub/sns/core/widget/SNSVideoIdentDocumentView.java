package com.sumsub.sns.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$style;
import com.sumsub.sns.R$styleable;
import com.sumsub.sns.core.theme.SNSCustomizationTheme;
import com.sumsub.sns.core.theme.SNSJsonCustomization;
import com.sumsub.sns.core.theme.SNSMetricElement;
import com.sumsub.sns.core.theme.SNSThemeMetric$CardStyle;
import com.sumsub.sns.core.theme.utils.CardViewExtensionsKt;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.presentation.theme.AbstractC28962j;
import com.sumsub.sns.internal.core.presentation.theme.C28960h;
import com.sumsub.sns.internal.core.presentation.theme.C28966p;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\r\u001a\u00020\u000eH\u0014R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/SNSVideoIdentDocumentView;", "Lcom/sumsub/sns/core/widget/SNSStepView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "defaultStrokeWidth", "activatedStrokeWidth", "drawableStateChanged", "", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSVideoIdentDocumentView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSVideoIdentDocumentView.kt\ncom/sumsub/sns/core/widget/SNSVideoIdentDocumentView\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n*L\n1#1,62:1\n233#2,3:63\n*S KotlinDebug\n*F\n+ 1 SNSVideoIdentDocumentView.kt\ncom/sumsub/sns/core/widget/SNSVideoIdentDocumentView\n*L\n29#1:63,3\n*E\n"})
public final class SNSVideoIdentDocumentView extends SNSStepView {
    private int activatedStrokeWidth;
    private int defaultStrokeWidth;

    @JvmOverloads
    public SNSVideoIdentDocumentView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
    }

    @JvmOverloads
    public SNSVideoIdentDocumentView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    @JvmOverloads
    public SNSVideoIdentDocumentView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        int i11;
        SNSCustomizationTheme theme;
        C28966p c28966p;
        AbstractC28962j abstractC28962j;
        C28960h c28960h;
        super.drawableStateChanged();
        if (isActivated()) {
            i11 = this.activatedStrokeWidth;
        } else {
            i11 = this.defaultStrokeWidth;
        }
        setStrokeWidth(i11);
        SNSJsonCustomization customization = C28468k0.f57983a.getCustomization();
        String str = null;
        if (customization != null) {
            theme = customization.getTheme();
        } else {
            theme = null;
        }
        if (theme instanceof C28966p) {
            c28966p = (C28966p) theme;
        } else {
            c28966p = null;
        }
        if (c28966p != null) {
            SNSMetricElement sNSMetricElement = SNSVideoIdentDocumentViewKt.DEFAULT_CARD_STYLE;
            Map map = c28966p.f58878d;
            if (map != null) {
                abstractC28962j = (AbstractC28962j) map.get(sNSMetricElement.getValue());
            } else {
                abstractC28962j = null;
            }
            if (abstractC28962j instanceof C28960h) {
                c28960h = (C28960h) abstractC28962j;
            } else {
                c28960h = null;
            }
            if (c28960h != null) {
                str = c28960h.f58868a;
            }
            SNSThemeMetric$CardStyle sNSThemeMetric$CardStyle = SNSThemeMetric$CardStyle.BORDERED;
            if (Intrinsics.areEqual(str, sNSThemeMetric$CardStyle.getValue())) {
                CardViewExtensionsKt.applyStyle(this, sNSThemeMetric$CardStyle);
            }
        }
    }

    public /* synthetic */ SNSVideoIdentDocumentView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? R$attr.sns_VideoIdentDocumentViewStyle : i11, (i13 & 8) != 0 ? R$style.Widget_SNSVideoIdentDocumentView : i12);
    }

    @JvmOverloads
    public SNSVideoIdentDocumentView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12, SNSVideoIdentDocumentViewKt.DEFAULT_CARD_STYLE);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SNSVideoIdentDocumentView, i11, i12);
        int i13 = R$styleable.SNSVideoIdentDocumentView_sns_stepStrokeWidthDefault;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(i13, 0);
            this.defaultStrokeWidth = dimensionPixelSize;
            setStrokeWidth(dimensionPixelSize);
        }
        int i14 = R$styleable.SNSVideoIdentDocumentView_sns_stepStrokeWidthActivated;
        if (typedArrayObtainStyledAttributes.hasValue(i14)) {
            this.activatedStrokeWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(i14, 0);
        }
        Unit unit = Unit.INSTANCE;
        typedArrayObtainStyledAttributes.recycle();
    }
}
