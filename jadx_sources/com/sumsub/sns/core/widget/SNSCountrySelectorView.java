package com.sumsub.sns.core.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.widget.ImageViewCompat;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$style;
import com.sumsub.sns.core.theme.SNSMetricElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\n\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¨\u0006\u0010"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/SNSCountrySelectorView;", "Lcom/sumsub/sns/core/widget/SNSStepView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "setIconTintColor", "", "tintColor", "Landroid/content/res/ColorStateList;", "getIconTintColor", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSCountrySelectorView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSCountrySelectorView.kt\ncom/sumsub/sns/core/widget/SNSCountrySelectorView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,25:1\n1#2:26\n*E\n"})
public final class SNSCountrySelectorView extends SNSStepView {
    @JvmOverloads
    public SNSCountrySelectorView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
    }

    @JvmOverloads
    public SNSCountrySelectorView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    @JvmOverloads
    public SNSCountrySelectorView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
    }

    @Override // com.sumsub.sns.core.widget.SNSStepView
    @Nullable
    public ColorStateList getIconTintColor() {
        ImageView iconEndView = getIconEndView();
        if (iconEndView != null) {
            return iconEndView.getImageTintList();
        }
        return null;
    }

    @Override // com.sumsub.sns.core.widget.SNSStepView
    public void setIconTintColor(@NotNull ColorStateList tintColor) {
        ImageView iconEndView = getIconEndView();
        if (iconEndView != null) {
            ImageViewCompat.setImageTintList(iconEndView, tintColor);
        }
    }

    public /* synthetic */ SNSCountrySelectorView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? R$attr.sns_CountrySelectorViewStyle : i11, (i13 & 8) != 0 ? R$style.Widget_SNSCountrySelectorView : i12);
    }

    @JvmOverloads
    public SNSCountrySelectorView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12, SNSMetricElement.SELECTED_COUNTRY_CARD_STYLE);
    }
}
