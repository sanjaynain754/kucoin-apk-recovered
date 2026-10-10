package com.sumsub.sns.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.sumsub.sns.R$attr;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/SNSAutoCompleteTextView;", "Lcom/google/android/material/textfield/MaterialAutoCompleteTextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "enoughToFilter", "", "showDropDown", "", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSAutoCompleteTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSAutoCompleteTextView.kt\ncom/sumsub/sns/core/widget/SNSAutoCompleteTextView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,28:1\n188#2,3:29\n*S KotlinDebug\n*F\n+ 1 SNSAutoCompleteTextView.kt\ncom/sumsub/sns/core/widget/SNSAutoCompleteTextView\n*L\n22#1:29,3\n*E\n"})
public final class SNSAutoCompleteTextView extends MaterialAutoCompleteTextView {
    @JvmOverloads
    public SNSAutoCompleteTextView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @Override // android.widget.AutoCompleteTextView
    public boolean enoughToFilter() {
        return true;
    }

    @JvmOverloads
    public SNSAutoCompleteTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // com.google.android.material.textfield.MaterialAutoCompleteTextView, android.widget.AutoCompleteTextView
    public void showDropDown() {
        postDelayed(new Runnable() { // from class: com.sumsub.sns.core.widget.SNSAutoCompleteTextView$showDropDown$$inlined$postDelayed$1
            @Override // java.lang.Runnable
            public final void run() {
                super/*com.google.android.material.textfield.MaterialAutoCompleteTextView*/.showDropDown();
            }
        }, 200L);
    }

    public /* synthetic */ SNSAutoCompleteTextView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? R$attr.sns_AutoCompleteTextViewStyle : i11);
    }

    @JvmOverloads
    public SNSAutoCompleteTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
    }
}
