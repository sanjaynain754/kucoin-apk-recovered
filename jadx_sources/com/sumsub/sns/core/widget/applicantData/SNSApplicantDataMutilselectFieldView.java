package com.sumsub.sns.core.widget.applicantData;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewGroupKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$color;
import com.sumsub.sns.R$dimen;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.R$style;
import com.sumsub.sns.R$styleable;
import com.sumsub.sns.core.presentation.helper.AbstractC28233a;
import com.sumsub.sns.core.presentation.helper.AbstractC28234b;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSCustomizationTheme;
import com.sumsub.sns.core.theme.SNSJsonCustomization;
import com.sumsub.sns.core.theme.SNSMetricElement;
import com.sumsub.sns.core.widget.SNSBodyTextView;
import com.sumsub.sns.core.widget.SNSCheckGroup;
import com.sumsub.sns.core.widget.SNSLabeledCheckBox;
import com.sumsub.sns.core.widget.SNSStepAttrs;
import com.sumsub.sns.core.widget.SNSStepViewExtensionsKt;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.AbstractC28462i0;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.presentation.theme.C28955c;
import com.sumsub.sns.internal.core.presentation.theme.C28966p;
import com.sumsub.sns.internal.core.presentation.widget.InterfaceC28973a;
import com.sumsub.sns.internal.core.presentation.widget.SNSStepState;
import com.sumsub.sns.internal.features.data.model.common.C29724z;
import com.tencent.bugly.proguard.C33627eb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.sequences.Sequence;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u000eJ\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R*\u0010#\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u001f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010!\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R:\u0010(\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010'2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010'8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R6\u00100\u001a\b\u0012\u0004\u0012\u00020/0.2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020/0.8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R*\u00106\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010)\u001a\u0004\b7\u0010+\"\u0004\b8\u0010-R6\u0010:\u001a\b\u0012\u0004\u0012\u00020/0.2\f\u00109\u001a\b\u0012\u0004\u0012\u00020/0.8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b:\u00101\u001a\u0004\b;\u00103\"\u0004\b<\u00105R\u0016\u0010@\u001a\u0004\u0018\u00010=8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0016\u0010D\u001a\u0004\u0018\u00010A8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR(\u0010J\u001a\u0004\u0018\u00010E2\b\u0010\"\u001a\u0004\u0018\u00010E8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR(\u0010P\u001a\u0004\u0018\u00010K2\b\u0010\"\u001a\u0004\u0018\u00010K8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR(\u0010S\u001a\u0004\u0018\u00010K2\b\u0010\"\u001a\u0004\u0018\u00010K8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bQ\u0010M\"\u0004\bR\u0010O¨\u0006T"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataMutilselectFieldView;", "Lcom/sumsub/sns/internal/core/presentation/widget/a;", "Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "updateState", "()V", "color", "setTitleIconColor", "(I)V", "showGrouped", "extraSpace", "", "onCreateDrawableState", "(I)[I", "Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;", "getSNSStepState", "()Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;", "state", "setSNSStepState", "(Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;)V", "stepState", "Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;", "", "isUpdating", "Z", "value", "isGrouped", "()Z", "setGrouped", "(Z)V", "Lkotlin/Function0;", "onTitleClickCallback", "Lkotlin/jvm/functions/Function0;", "getOnTitleClickCallback", "()Lkotlin/jvm/functions/Function0;", "setOnTitleClickCallback", "(Lkotlin/jvm/functions/Function0;)V", "", "Lcom/sumsub/sns/internal/features/data/model/common/z;", FirebaseAnalytics.Param.ITEMS, "Ljava/util/List;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "onSelectionChanged", "getOnSelectionChanged", "setOnSelectionChanged", "aValue", "selectedItems", "getSelectedItems", "setSelectedItems", "Lcom/sumsub/sns/core/widget/SNSCheckGroup;", "getCheckGroup", "()Lcom/sumsub/sns/core/widget/SNSCheckGroup;", "checkGroup", "Landroid/widget/ImageView;", "getIvTitleIcon", "()Landroid/widget/ImageView;", "ivTitleIcon", "Landroid/graphics/drawable/Drawable;", "getTitleIcon", "()Landroid/graphics/drawable/Drawable;", "setTitleIcon", "(Landroid/graphics/drawable/Drawable;)V", "titleIcon", "", "getLabel", "()Ljava/lang/CharSequence;", "setLabel", "(Ljava/lang/CharSequence;)V", Constants.ScionAnalytics.PARAM_LABEL, "getError", "setError", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSApplicantDataMutilselectFieldView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSApplicantDataMutilselectFieldView.kt\ncom/sumsub/sns/core/widget/applicantData/SNSApplicantDataMutilselectFieldView\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 ViewThemeExtensions.kt\ncom/sumsub/sns/core/presentation/helper/ViewThemeExtensionsKt\n+ 4 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n+ 5 View.kt\nandroidx/core/view/ViewKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 8 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 9 ThemeHelper.kt\ncom/sumsub/sns/core/presentation/helper/ThemeHelper\n*L\n1#1,293:1\n233#2:294\n234#2,2:296\n37#3:295\n37#3:314\n32#4:298\n33#4:308\n157#5,8:299\n1#6:307\n1321#7:309\n1322#7:313\n1761#8,3:310\n54#9:315\n54#9:316\n*S KotlinDebug\n*F\n+ 1 SNSApplicantDataMutilselectFieldView.kt\ncom/sumsub/sns/core/widget/applicantData/SNSApplicantDataMutilselectFieldView\n*L\n164#1:294\n164#1:296,2\n185#1:295\n239#1:314\n86#1:298\n86#1:308\n90#1:299,8\n137#1:309\n137#1:313\n138#1:310,3\n243#1:315\n247#1:316\n*E\n"})
public final class SNSApplicantDataMutilselectFieldView extends SNSApplicantDataBaseFieldView implements InterfaceC28973a {
    private boolean isGrouped;
    private boolean isUpdating;

    @NotNull
    private List<C29724z> items;

    @Nullable
    private Function0<Unit> onSelectionChanged;

    @Nullable
    private Function0<Unit> onTitleClickCallback;

    @NotNull
    private List<C29724z> selectedItems;

    @Nullable
    private SNSStepState stepState;

    @JvmOverloads
    public SNSApplicantDataMutilselectFieldView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _set_items_$lambda$11$lambda$10$lambda$9(SNSApplicantDataMutilselectFieldView sNSApplicantDataMutilselectFieldView, SNSLabeledCheckBox sNSLabeledCheckBox, boolean z11) {
        Object obj = null;
        sNSApplicantDataMutilselectFieldView.setError(null);
        final String str = (String) sNSLabeledCheckBox.getTag();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(sNSApplicantDataMutilselectFieldView.selectedItems);
        CollectionsKt.removeAll((List) arrayList, new Function1() { // from class: com.sumsub.sns.core.widget.applicantData.j
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return Boolean.valueOf(SNSApplicantDataMutilselectFieldView._set_items_$lambda$11$lambda$10$lambda$9$lambda$6(str, (C29724z) obj2));
            }
        });
        if (z11) {
            for (Object obj2 : sNSApplicantDataMutilselectFieldView.items) {
                if (Intrinsics.areEqual(((C29724z) obj2).f59791a, str)) {
                    obj = obj2;
                    break;
                }
            }
            C29724z c29724z = (C29724z) obj;
            if (c29724z != null) {
                arrayList.add(c29724z);
            }
        }
        if (!sNSApplicantDataMutilselectFieldView.isUpdating) {
            sNSApplicantDataMutilselectFieldView.setSelectedItems(arrayList);
            Function0<Unit> function0 = sNSApplicantDataMutilselectFieldView.onSelectionChanged;
            if (function0 != null) {
                function0.invoke();
            }
        }
        sNSApplicantDataMutilselectFieldView.updateState();
        return Unit.INSTANCE;
    }

    private final void showGrouped() {
        Float fM69171a;
        Float fM69171a2;
        Integer numM69172a;
        int color = ContextCompat.getColor(getContext(), R$color.sns_color_neutral_20);
        SNSColorElement sNSColorElement = SNSColorElement.CONTENT_NEUTRAL;
        C28966p c28966pM69169a = AbstractC28233a.m69169a();
        if (c28966pM69169a != null && (numM69172a = AbstractC28233a.m69172a(c28966pM69169a, sNSColorElement, AbstractC28458h.m69346a(getResources().getConfiguration()))) != null) {
            color = numM69172a.intValue();
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R$dimen.sns_agreement_card_stroke_width);
        SNSMetricElement sNSMetricElement = SNSMetricElement.CARD_BORDER_WIDTH;
        C28966p c28966pM69169a2 = AbstractC28233a.m69169a();
        if (c28966pM69169a2 != null && (fM69171a2 = AbstractC28233a.m69171a(c28966pM69169a2, sNSMetricElement)) != null) {
            dimensionPixelSize = (int) fM69171a2.floatValue();
        }
        int dimensionPixelSize2 = getContext().getResources().getDimensionPixelSize(R$dimen.sns_agreement_card_corner_radius);
        SNSMetricElement sNSMetricElement2 = SNSMetricElement.CARD_CORNER_RADIUS;
        C28966p c28966pM69169a3 = AbstractC28233a.m69169a();
        if (c28966pM69169a3 != null && (fM69171a = AbstractC28233a.m69171a(c28966pM69169a3, sNSMetricElement2)) != null) {
            dimensionPixelSize2 = (int) fM69171a.floatValue();
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setStroke(dimensionPixelSize, color);
        gradientDrawable.setCornerRadius(dimensionPixelSize2);
        ColorStateList colorStateList = ContextCompat.getColorStateList(getContext(), R$color.sns_step_bg_color);
        if (colorStateList != null) {
            Integer numM69174a = AbstractC28234b.m69174a(this, SNSColorElement.BACKGROUND_INFO);
            int iIntValue = numM69174a != null ? numM69174a.intValue() : colorStateList.getColorForState(new int[]{R$attr.sns_stateProcessing}, -65281);
            SNSStepAttrs sNSStepAttrs = SNSStepAttrs.INSTANCE;
            gradientDrawable.setColor(new ColorStateList(new int[][]{sNSStepAttrs.getSTATE_INIT(), sNSStepAttrs.getSTATE_PROCESSING()}, new int[]{0, iIntValue}));
        }
        setBackground(gradientDrawable);
        Resources resources = getResources();
        int i11 = R$dimen.sns_margin_medium;
        int dimensionPixelSize3 = resources.getDimensionPixelSize(i11);
        setPadding(dimensionPixelSize3, 0, dimensionPixelSize3, dimensionPixelSize3);
        AbstractC28458h.m69343a((Integer) null, (Integer) null, Integer.valueOf(dimensionPixelSize3), this);
        SNSCheckGroup checkGroup = getCheckGroup();
        if (checkGroup != null) {
            checkGroup.setShowDividers(1);
            AbstractC28458h.m69343a((Integer) null, (Integer) null, Integer.valueOf(getResources().getDimensionPixelSize(i11)), checkGroup);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @NotNull
    public int[] onCreateDrawableState(int extraSpace) {
        return View.mergeDrawableStates(super.onCreateDrawableState(extraSpace + 1), this.stepState != null ? SNSStepViewExtensionsKt.getSnsStepDrawableState(this) : new int[]{R$attr.sns_stateInit});
    }

    public final void setSelectedItems(@NotNull List<C29724z> list) {
        Sequence<View> children;
        boolean z11;
        this.isUpdating = true;
        SNSCheckGroup checkGroup = getCheckGroup();
        if (checkGroup != null && (children = ViewGroupKt.getChildren(checkGroup)) != null) {
            for (View view : children) {
                SNSLabeledCheckBox sNSLabeledCheckBox = view instanceof SNSLabeledCheckBox ? (SNSLabeledCheckBox) view : null;
                if (sNSLabeledCheckBox != null) {
                    if (list != null && list.isEmpty()) {
                        z11 = false;
                        break;
                    }
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (Intrinsics.areEqual(((C29724z) it.next()).f59791a, ((SNSLabeledCheckBox) view).getTag())) {
                                z11 = true;
                                break;
                            }
                        } else {
                            z11 = false;
                            break;
                        }
                    }
                    sNSLabeledCheckBox.setChecked(z11);
                }
            }
        }
        this.isUpdating = false;
        this.selectedItems = list;
        updateState();
    }

    @JvmOverloads
    public SNSApplicantDataMutilselectFieldView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _set_items_$lambda$11$lambda$10$lambda$9$lambda$6(String str, C29724z c29724z) {
        return Intrinsics.areEqual(c29724z.f59791a, str);
    }

    private final SNSCheckGroup getCheckGroup() {
        return (SNSCheckGroup) findViewById(R$id.sns_checkgroup);
    }

    private final ImageView getIvTitleIcon() {
        return (ImageView) findViewById(R$id.sns_label_icon);
    }

    private final void updateState() {
        SNSStepState sNSStepState = SNSStepState.INIT;
        if (this.items.size() == this.selectedItems.size()) {
            sNSStepState = SNSStepState.PROCESSING;
        }
        setSNSStepState(sNSStepState);
    }

    @NotNull
    public final List<C29724z> getItems() {
        return this.items;
    }

    @Nullable
    public final Function0<Unit> getOnSelectionChanged() {
        return this.onSelectionChanged;
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    @Nullable
    public Function0<Unit> getOnTitleClickCallback() {
        return this.onTitleClickCallback;
    }

    @Override // com.sumsub.sns.internal.core.presentation.widget.InterfaceC28973a
    @NotNull
    public SNSStepState getSNSStepState() {
        SNSStepState sNSStepState = this.stepState;
        return sNSStepState == null ? SNSStepState.INIT : sNSStepState;
    }

    @NotNull
    public final List<C29724z> getSelectedItems() {
        return this.selectedItems;
    }

    public final void setGrouped(boolean z11) {
        this.isGrouped = z11;
        if (z11) {
            showGrouped();
        }
    }

    public final void setOnSelectionChanged(@Nullable Function0<Unit> function0) {
        this.onSelectionChanged = function0;
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    public void setOnTitleClickCallback(@Nullable final Function0<Unit> function0) {
        this.onTitleClickCallback = function0;
        if (function0 != null) {
            TextView tvLabel$idensic_mobile_sdk_aar_defaultRelease = getTvLabel$idensic_mobile_sdk_aar_defaultRelease();
            if (tvLabel$idensic_mobile_sdk_aar_defaultRelease != null) {
                tvLabel$idensic_mobile_sdk_aar_defaultRelease.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.core.widget.applicantData.h
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        function0.invoke();
                    }
                });
            }
            ImageView ivTitleIcon = getIvTitleIcon();
            if (ivTitleIcon != null) {
                ivTitleIcon.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.core.widget.applicantData.i
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        function0.invoke();
                    }
                });
            }
            TypedValue typedValue = new TypedValue();
            getContext().getTheme().resolveAttribute(R.attr.selectableItemBackground, typedValue, true);
            TextView tvLabel$idensic_mobile_sdk_aar_defaultRelease2 = getTvLabel$idensic_mobile_sdk_aar_defaultRelease();
            if (tvLabel$idensic_mobile_sdk_aar_defaultRelease2 != null) {
                tvLabel$idensic_mobile_sdk_aar_defaultRelease2.setBackgroundResource(typedValue.resourceId);
            }
        }
    }

    @Override // com.sumsub.sns.internal.core.presentation.widget.InterfaceC28973a
    public void setSNSStepState(@NotNull SNSStepState state) {
        if (state == this.stepState) {
            return;
        }
        this.stepState = state;
        if (this.isGrouped) {
            showGrouped();
            refreshDrawableState();
        }
    }

    @JvmOverloads
    public SNSApplicantDataMutilselectFieldView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _set_items_$lambda$11$lambda$10$lambda$5(SNSApplicantDataMutilselectFieldView sNSApplicantDataMutilselectFieldView, String str) {
        Function1<String, Unit> onLinkClicked = sNSApplicantDataMutilselectFieldView.getOnLinkClicked();
        if (onLinkClicked != null) {
            onLinkClicked.invoke(str);
        }
        return Unit.INSTANCE;
    }

    private final void setTitleIconColor(int color) {
        ImageView ivTitleIcon = getIvTitleIcon();
        if (ivTitleIcon != null) {
            ivTitleIcon.setImageTintList(ColorStateList.valueOf(color));
        }
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

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    @Nullable
    public Drawable getTitleIcon() {
        return super.getTitleIcon();
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    public void setError(@Nullable CharSequence charSequence) {
        SNSStepState sNSStepState;
        TextView tvError = getTvError();
        if (tvError != null) {
            AbstractC28458h.m69341a(tvError, charSequence);
        }
        SNSCheckGroup checkGroup = getCheckGroup();
        if (checkGroup != null) {
            if (charSequence != null && charSequence.length() != 0) {
                sNSStepState = SNSStepState.REJECTED;
            } else {
                sNSStepState = SNSStepState.INIT;
            }
            SNSStepViewExtensionsKt.setSnsStepState(checkGroup, sNSStepState);
        }
    }

    public final void setItems(@NotNull List<C29724z> list) {
        CharSequence charSequenceM69364a;
        SNSCheckGroup checkGroup = getCheckGroup();
        if (checkGroup != null) {
            checkGroup.removeAllViews();
        }
        setSelectedItems(CollectionsKt.emptyList());
        for (C29724z c29724z : list) {
            if (c29724z.f59793c != null) {
                SNSBodyTextView sNSBodyTextView = new SNSBodyTextView(getContext(), null, 0, 0, 14, null);
                sNSBodyTextView.setText(c29724z.f59793c);
                sNSBodyTextView.setPadding(sNSBodyTextView.getPaddingLeft(), sNSBodyTextView.getContext().getResources().getDimensionPixelSize(R$dimen.sns_margin_medium), sNSBodyTextView.getPaddingRight(), sNSBodyTextView.getPaddingBottom());
                SNSCheckGroup checkGroup2 = getCheckGroup();
                if (checkGroup2 != null) {
                    checkGroup2.addView(sNSBodyTextView);
                }
            }
            String str = null;
            final SNSLabeledCheckBox sNSLabeledCheckBox = new SNSLabeledCheckBox(getContext(), null, 2, null);
            String str2 = c29724z.f59792b;
            if (str2.length() > 0) {
                str = str2;
            }
            if (str == null || (charSequenceM69364a = AbstractC28462i0.m69364a(str, getContext())) == null) {
                charSequenceM69364a = C33627eb.f69716f;
            }
            sNSLabeledCheckBox.setText(charSequenceM69364a);
            sNSLabeledCheckBox.setOnLinkClicked(new Function1() { // from class: com.sumsub.sns.core.widget.applicantData.f
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SNSApplicantDataMutilselectFieldView._set_items_$lambda$11$lambda$10$lambda$5(this.f57547b, (String) obj);
                }
            });
            sNSLabeledCheckBox.setOnCheckedChanged(new Function1() { // from class: com.sumsub.sns.core.widget.applicantData.g
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SNSApplicantDataMutilselectFieldView._set_items_$lambda$11$lambda$10$lambda$9(this.f57548b, sNSLabeledCheckBox, ((Boolean) obj).booleanValue());
                }
            });
            sNSLabeledCheckBox.setTag(c29724z.f59791a);
            SNSCheckGroup checkGroup3 = getCheckGroup();
            if (checkGroup3 != null) {
                checkGroup3.addView(sNSLabeledCheckBox);
            }
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

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    public void setTitleIcon(@Nullable Drawable drawable) {
        super.setTitleIcon(drawable);
        ImageView ivTitleIcon = getIvTitleIcon();
        if (ivTitleIcon != null) {
            ivTitleIcon.setImageDrawable(drawable);
        }
    }

    public /* synthetic */ SNSApplicantDataMutilselectFieldView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? R$attr.sns_applicantDataMutilselectFieldViewStyle : i11, (i13 & 8) != 0 ? R$style.Widget_SNSApplicantDataMutilselectFieldView : i12);
    }

    @JvmOverloads
    public SNSApplicantDataMutilselectFieldView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        C28955c c28955c;
        super(context, attributeSet, i11, i12);
        this.items = new ArrayList();
        this.selectedItems = CollectionsKt.emptyList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SNSApplicantDataMutilselectFieldView, i11, i12);
        LayoutInflater.from(context).inflate(typedArrayObtainStyledAttributes.getResourceId(R$styleable.f57178x73eddcc, R$layout.sns_layout_applicant_data_multiselect_view), (ViewGroup) this, true);
        int i13 = R$styleable.f57177x53f9e136;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            setTitleIconColor(typedArrayObtainStyledAttributes.getColor(i13, ContextCompat.getColor(context, R$color.sns_color_primary_100)));
        }
        SNSColorElement sNSColorElement = SNSColorElement.CONTENT_LINK;
        SNSJsonCustomization customization = C28468k0.f57983a.getCustomization();
        Integer num = null;
        SNSCustomizationTheme theme = customization != null ? customization.getTheme() : null;
        C28966p c28966p = theme instanceof C28966p ? (C28966p) theme : null;
        if (c28966p != null) {
            boolean zM69346a = AbstractC28458h.m69346a(getResources().getConfiguration());
            Map map = c28966p.f58877c;
            if (map != null && (c28955c = (C28955c) map.get(sNSColorElement.getValue())) != null) {
                if (zM69346a) {
                    num = c28955c.f58858a;
                } else {
                    num = c28955c.f58859b;
                }
            }
            if (num != null) {
                setTitleIconColor(num.intValue());
                Unit unit = Unit.INSTANCE;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        onInitializationFinished();
    }
}
