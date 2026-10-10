package com.sumsub.sns.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.material.imageview.ShapeableImageView;
import com.sumsub.sns.R$styleable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0014R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/SNSAspectRatioImageView;", "Lcom/google/android/material/imageview/ShapeableImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", ViewProps.ASPECT_RATIO, "", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSAspectRatioImageView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSAspectRatioImageView.kt\ncom/sumsub/sns/core/widget/SNSAspectRatioImageView\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n*L\n1#1,43:1\n52#2,9:44\n*S KotlinDebug\n*F\n+ 1 SNSAspectRatioImageView.kt\ncom/sumsub/sns/core/widget/SNSAspectRatioImageView\n*L\n25#1:44,9\n*E\n"})
public final class SNSAspectRatioImageView extends ShapeableImageView {
    private float aspectRatio;

    @JvmOverloads
    public SNSAspectRatioImageView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public SNSAspectRatioImageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // com.google.android.material.imageview.ShapeableImageView, android.widget.ImageView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.aspectRatio <= 0.0f) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size / this.aspectRatio), 1073741824));
    }

    public /* synthetic */ SNSAspectRatioImageView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @JvmOverloads
    public SNSAspectRatioImageView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SNSAspectRatioImageView, 0, 0);
        this.aspectRatio = typedArrayObtainStyledAttributes.getFloat(R$styleable.SNSAspectRatioImageView_sns_aspectRatio, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }
}
