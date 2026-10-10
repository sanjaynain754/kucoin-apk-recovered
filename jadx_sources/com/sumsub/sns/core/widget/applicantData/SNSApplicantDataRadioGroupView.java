package com.sumsub.sns.core.widget.applicantData;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.core.view.ViewKt;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.R$style;
import com.sumsub.sns.R$styleable;
import com.sumsub.sns.core.presentation.helper.AbstractC28234b;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSTypographyElement;
import com.sumsub.sns.core.widget.SNSRadioGroup;
import com.sumsub.sns.core.widget.SNSStepViewExtensionsKt;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.presentation.widget.SNSStepState;
import com.sumsub.sns.internal.features.data.model.common.C29724z;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.sequences.Sequence;
import p852kotlin.sequences.SequencesKt;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0012\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR>\u0010\u000f\u001a\f\u0012\b\u0012\u00060\fj\u0002`\r0\u000b2\u0010\u0010\u000e\u001a\f\u0012\b\u0012\u00060\fj\u0002`\r0\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R?\u0010\u001a\u001a\u001f\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u0004\u0018\u00010 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R(\u0010)\u001a\u0004\u0018\u00010$2\b\u0010\u000e\u001a\u0004\u0018\u00010$8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010\u000e\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u00168V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R4\u00102\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r2\u000e\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R(\u00105\u001a\u0004\u0018\u00010$2\b\u0010\u000e\u001a\u0004\u0018\u00010$8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b3\u0010&\"\u0004\b4\u0010(¨\u00066"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataRadioGroupView;", "Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "Lcom/sumsub/sns/internal/features/data/model/common/z;", "Lcom/sumsub/sns/core/widget/applicantData/Item;", "value", FirebaseAnalytics.Param.ITEMS, "Ljava/util/List;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "", "onSelectionChanged", "Lkotlin/jvm/functions/Function1;", "getOnSelectionChanged", "()Lkotlin/jvm/functions/Function1;", "setOnSelectionChanged", "(Lkotlin/jvm/functions/Function1;)V", "Lcom/sumsub/sns/core/widget/SNSRadioGroup;", "getRadioGroup", "()Lcom/sumsub/sns/core/widget/SNSRadioGroup;", "radioGroup", "", "getLabel", "()Ljava/lang/CharSequence;", "setLabel", "(Ljava/lang/CharSequence;)V", Constants.ScionAnalytics.PARAM_LABEL, "getValue", "()Ljava/lang/String;", "setValue", "(Ljava/lang/String;)V", "getSelectedItem", "()Lcom/sumsub/sns/internal/features/data/model/common/z;", "setSelectedItem", "(Lcom/sumsub/sns/internal/features/data/model/common/z;)V", "selectedItem", "getError", "setError", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSApplicantDataRadioGroupView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSApplicantDataRadioGroupView.kt\ncom/sumsub/sns/core/widget/applicantData/SNSApplicantDataRadioGroupView\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,131:1\n233#2,3:132\n1869#3,2:135\n295#3,2:138\n477#4:137\n477#4:140\n1321#4,2:141\n*S KotlinDebug\n*F\n+ 1 SNSApplicantDataRadioGroupView.kt\ncom/sumsub/sns/core/widget/applicantData/SNSApplicantDataRadioGroupView\n*L\n118#1:132,3\n42#1:135,2\n87#1:138,2\n82#1:137\n95#1:140\n96#1:141,2\n*E\n"})
public final class SNSApplicantDataRadioGroupView extends SNSApplicantDataBaseFieldView {

    @NotNull
    private List<C29724z> items;

    @Nullable
    private Function1<? super String, Unit> onSelectionChanged;

    @JvmOverloads
    public SNSApplicantDataRadioGroupView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _set_items_$lambda$3$lambda$2(SNSApplicantDataRadioGroupView sNSApplicantDataRadioGroupView, CompoundButton compoundButton, boolean z11) {
        Function1<? super String, Unit> function1;
        Object obj = null;
        sNSApplicantDataRadioGroupView.setError(null);
        for (Object obj2 : sNSApplicantDataRadioGroupView.items) {
            String str = ((C29724z) obj2).f59791a;
            Object tag = compoundButton.getTag();
            if (Intrinsics.areEqual(str, tag instanceof String ? (String) tag : null)) {
                obj = obj2;
                break;
            }
        }
        C29724z c29724z = (C29724z) obj;
        if (c29724z == null || !z11 || (function1 = sNSApplicantDataRadioGroupView.onSelectionChanged) == null) {
            return;
        }
        function1.invoke(c29724z.f59791a);
    }

    @JvmOverloads
    public SNSApplicantDataRadioGroupView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    private final SNSRadioGroup getRadioGroup() {
        return (SNSRadioGroup) findViewById(R$id.sns_radiogroup);
    }

    @NotNull
    public final List<C29724z> getItems() {
        return this.items;
    }

    @Nullable
    public final Function1<String, Unit> getOnSelectionChanged() {
        return this.onSelectionChanged;
    }

    public final void setOnSelectionChanged(@Nullable Function1<? super String, Unit> function1) {
        this.onSelectionChanged = function1;
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    public void setValue(@NotNull String str) {
        for (Object obj : this.items) {
            if (Intrinsics.areEqual(((C29724z) obj).f59791a, str)) {
                setSelectedItem((C29724z) obj);
            }
        }
        obj = null;
        setSelectedItem((C29724z) obj);
    }

    @JvmOverloads
    public SNSApplicantDataRadioGroupView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    @Nullable
    public CharSequence getError() {
        TextView tvError = getTvError();
        if (tvError != null) {
            return tvError.getText();
        }
        return null;
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    @Nullable
    public CharSequence getLabel() {
        CharSequence text;
        TextView tvLabel$idensic_mobile_sdk_aar_defaultRelease = getTvLabel$idensic_mobile_sdk_aar_defaultRelease();
        if (tvLabel$idensic_mobile_sdk_aar_defaultRelease != null && (text = tvLabel$idensic_mobile_sdk_aar_defaultRelease.getText()) != null) {
            return text;
        }
        return "";
    }

    @Nullable
    public final C29724z getSelectedItem() {
        Sequence<View> allViews;
        Sequence sequenceFilter;
        Sequence sequenceFilter2;
        Sequence map;
        Object objFirstOrNull;
        String str;
        SNSRadioGroup radioGroup = getRadioGroup();
        Object obj = null;
        if (radioGroup == null || (allViews = ViewKt.getAllViews(radioGroup)) == null || (sequenceFilter = SequencesKt.filter(allViews, new Function1<Object, Boolean>() { // from class: com.sumsub.sns.core.widget.applicantData.SNSApplicantDataRadioGroupView$special$$inlined$filterIsInstance$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj2) {
                return Boolean.valueOf(obj2 instanceof RadioButton);
            }
        })) == null || (sequenceFilter2 = SequencesKt.filter(sequenceFilter, new Function1() { // from class: com.sumsub.sns.core.widget.applicantData.l
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return Boolean.valueOf(((RadioButton) obj2).isChecked());
            }
        })) == null || (map = SequencesKt.map(sequenceFilter2, new Function1() { // from class: com.sumsub.sns.core.widget.applicantData.m
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return ((RadioButton) obj2).getTag();
            }
        })) == null || (objFirstOrNull = SequencesKt.firstOrNull(map)) == null) {
            return null;
        }
        for (Object obj2 : this.items) {
            String str2 = ((C29724z) obj2).f59791a;
            if (objFirstOrNull instanceof String) {
                str = (String) objFirstOrNull;
            } else {
                str = null;
            }
            if (Intrinsics.areEqual(str2, str)) {
                obj = obj2;
                break;
            }
        }
        return (C29724z) obj;
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    @NotNull
    public String getValue() {
        String str;
        C29724z selectedItem = getSelectedItem();
        if (selectedItem != null && (str = selectedItem.f59791a) != null) {
            return str;
        }
        return "";
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    public void setError(@Nullable CharSequence charSequence) {
        SNSStepState sNSStepState;
        TextView tvError = getTvError();
        if (tvError != null) {
            AbstractC28458h.m69341a(tvError, charSequence);
        }
        SNSRadioGroup radioGroup = getRadioGroup();
        if (radioGroup != null) {
            if (charSequence != null && charSequence.length() != 0) {
                sNSStepState = SNSStepState.REJECTED;
            } else {
                sNSStepState = SNSStepState.INIT;
            }
            SNSStepViewExtensionsKt.setSnsStepState(radioGroup, sNSStepState);
        }
    }

    public final void setItems(@NotNull List<C29724z> list) {
        SNSRadioGroup radioGroup = getRadioGroup();
        if (radioGroup != null) {
            radioGroup.removeAllViews();
        }
        for (C29724z c29724z : list) {
            MaterialRadioButton materialRadioButton = new MaterialRadioButton(getContext());
            materialRadioButton.setText(c29724z.f59792b);
            materialRadioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.sumsub.sns.core.widget.applicantData.k
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                    SNSApplicantDataRadioGroupView._set_items_$lambda$3$lambda$2(this.f57553b, compoundButton, z11);
                }
            });
            materialRadioButton.setTag(c29724z.f59791a);
            SNSRadioGroup radioGroup2 = getRadioGroup();
            if (radioGroup2 != null) {
                radioGroup2.addView(materialRadioButton, new ViewGroup.LayoutParams(-1, -2));
            }
            AbstractC28234b.m69176a(materialRadioButton, SNSTypographyElement.SUBTITLE2, SNSColorElement.CONTENT_NEUTRAL);
        }
        this.items = list;
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    public void setLabel(@Nullable CharSequence charSequence) {
        TextView tvLabel$idensic_mobile_sdk_aar_defaultRelease = getTvLabel$idensic_mobile_sdk_aar_defaultRelease();
        if (tvLabel$idensic_mobile_sdk_aar_defaultRelease != null) {
            AbstractC28458h.m69341a(tvLabel$idensic_mobile_sdk_aar_defaultRelease, charSequence);
        }
    }

    public final void setSelectedItem(@Nullable C29724z c29724z) {
        Sequence<View> allViews;
        Sequence<RadioButton> sequenceFilter;
        String str;
        SNSRadioGroup radioGroup = getRadioGroup();
        if (radioGroup != null && (allViews = ViewKt.getAllViews(radioGroup)) != null && (sequenceFilter = SequencesKt.filter(allViews, new Function1<Object, Boolean>() { // from class: com.sumsub.sns.core.widget.applicantData.SNSApplicantDataRadioGroupView$special$$inlined$filterIsInstance$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof RadioButton);
            }
        })) != null) {
            for (RadioButton radioButton : sequenceFilter) {
                Object tag = radioButton.getTag();
                String str2 = null;
                if (tag instanceof String) {
                    str = (String) tag;
                } else {
                    str = null;
                }
                if (c29724z != null) {
                    str2 = c29724z.f59791a;
                }
                radioButton.setChecked(Intrinsics.areEqual(str, str2));
            }
        }
    }

    public /* synthetic */ SNSApplicantDataRadioGroupView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? R$attr.sns_applicantDataRadioGroupViewStyle : i11, (i13 & 8) != 0 ? R$style.Widget_SNSApplicantDataRadioGroupView : i12);
    }

    @JvmOverloads
    public SNSApplicantDataRadioGroupView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        this.items = CollectionsKt.emptyList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SNSApplicantDataRadioGroupView, i11, i12);
        LayoutInflater.from(context).inflate(typedArrayObtainStyledAttributes.getResourceId(R$styleable.SNSApplicantDataRadioGroupView_sns_applicantDataRadioGroupLayout, R$layout.sns_layout_applicant_data_radio_group_view), (ViewGroup) this, true);
        typedArrayObtainStyledAttributes.recycle();
        onInitializationFinished();
    }
}
