package com.sumsub.sns.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.presentation.helper.AbstractC28233a;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSMetricElement;
import com.sumsub.sns.databinding.C28361z;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.presentation.theme.C28966p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/SNSDividerWithTextView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "text", "", "setText", "(Ljava/lang/CharSequence;)V", "Lcom/sumsub/sns/databinding/z;", "binding", "Lcom/sumsub/sns/databinding/z;", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSDividerWithTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSDividerWithTextView.kt\ncom/sumsub/sns/core/widget/SNSDividerWithTextView\n+ 2 ViewThemeExtensions.kt\ncom/sumsub/sns/core/presentation/helper/ViewThemeExtensionsKt\n+ 3 ThemeHelper.kt\ncom/sumsub/sns/core/presentation/helper/ThemeHelper\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,39:1\n37#2:40\n54#3:41\n256#4,2:42\n*S KotlinDebug\n*F\n+ 1 SNSDividerWithTextView.kt\ncom/sumsub/sns/core/widget/SNSDividerWithTextView\n*L\n24#1:40\n28#1:41\n35#1:42,2\n*E\n"})
public final class SNSDividerWithTextView extends ConstraintLayout {

    @NotNull
    private final C28361z binding;

    @JvmOverloads
    public SNSDividerWithTextView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public SNSDividerWithTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void setText(@Nullable CharSequence text) {
        this.binding.f57824b.setVisibility((text == null || text.length() == 0) ? 8 : 0);
        this.binding.f57824b.setText(text);
    }

    public /* synthetic */ SNSDividerWithTextView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @JvmOverloads
    public SNSDividerWithTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        View viewFindChildViewById;
        Float fM69171a;
        Integer numM69172a;
        super(context, attributeSet, i11);
        View viewInflate = LayoutInflater.from(context).inflate(R$layout.sns_layout_labeled_divider, (ViewGroup) this, false);
        addView(viewInflate);
        int i12 = R$id.end_divider;
        View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, i12);
        if (viewFindChildViewById2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, (i12 = R$id.start_divider))) != null) {
            i12 = R$id.text;
            SNSSubtitle2TextView sNSSubtitle2TextView = (SNSSubtitle2TextView) ViewBindings.findChildViewById(viewInflate, i12);
            if (sNSSubtitle2TextView != null) {
                this.binding = new C28361z((ConstraintLayout) viewInflate, viewFindChildViewById2, viewFindChildViewById, sNSSubtitle2TextView);
                SNSColorElement sNSColorElement = SNSColorElement.CONTENT_WEAK;
                C28966p c28966pM69169a = AbstractC28233a.m69169a();
                if (c28966pM69169a != null && (numM69172a = AbstractC28233a.m69172a(c28966pM69169a, sNSColorElement, AbstractC28458h.m69346a(getResources().getConfiguration()))) != null) {
                    int iIntValue = numM69172a.intValue();
                    viewFindChildViewById.setBackgroundColor(iIntValue);
                    viewFindChildViewById2.setBackgroundColor(iIntValue);
                }
                SNSMetricElement sNSMetricElement = SNSMetricElement.LIST_SEPARATOR_HEIGHT;
                C28966p c28966pM69169a2 = AbstractC28233a.m69169a();
                if (c28966pM69169a2 == null || (fM69171a = AbstractC28233a.m69171a(c28966pM69169a2, sNSMetricElement)) == null) {
                    return;
                }
                int iFloatValue = (int) fM69171a.floatValue();
                viewFindChildViewById.getLayoutParams().height = iFloatValue;
                viewFindChildViewById2.getLayoutParams().height = iFloatValue;
                return;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i12)));
    }
}
