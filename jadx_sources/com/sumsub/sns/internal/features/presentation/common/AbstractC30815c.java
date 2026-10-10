package com.sumsub.sns.internal.features.presentation.common;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.C7090R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.sumsub.sns.R$color;
import com.sumsub.sns.R$dimen;
import com.sumsub.sns.R$drawable;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.core.presentation.base.AbstractActivityC28115f;
import com.sumsub.sns.core.presentation.base.adapter.decorator.C28093a;
import com.sumsub.sns.core.presentation.helper.AbstractC28233a;
import com.sumsub.sns.core.presentation.helper.AbstractC28234b;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSCustomizationTheme;
import com.sumsub.sns.core.theme.SNSJsonCustomization;
import com.sumsub.sns.core.theme.SNSMetricElement;
import com.sumsub.sns.core.theme.SNSTypographyElement;
import com.sumsub.sns.core.widget.SNSBottomSheetView;
import com.sumsub.sns.core.widget.SNSPrimaryButton;
import com.sumsub.sns.core.widget.SNSTextInputLayout;
import com.sumsub.sns.core.widget.SNSToolbarView;
import com.sumsub.sns.databinding.C28323C;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.domain.C28578h;
import com.sumsub.sns.internal.core.presentation.theme.AbstractC28962j;
import com.sumsub.sns.internal.core.presentation.theme.C28955c;
import com.sumsub.sns.internal.core.presentation.theme.C28956d;
import com.sumsub.sns.internal.core.presentation.theme.C28966p;
import com.sumsub.sns.internal.features.data.repository.dynamic.AbstractC29971N;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29958A;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.common.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/common/c;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public abstract class AbstractC30815c extends BottomSheetDialogFragment {

    /* JADX INFO: renamed from: a */
    public C28323C f62250a;

    /* JADX WARN: Code duplicated, block: B:21:0x007b  */
    /* JADX INFO: renamed from: a */
    public static final void m70479a(AbstractC30815c abstractC30815c, DialogInterface dialogInterface) {
        Integer num;
        SNSBottomSheetView sNSBottomSheetView;
        C28955c c28955c;
        BottomSheetDialog bottomSheetDialog = (BottomSheetDialog) dialogInterface;
        abstractC30815c.getClass();
        int i11 = C7090R.id.design_bottom_sheet;
        FrameLayout frameLayout = (FrameLayout) bottomSheetDialog.findViewById(i11);
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        abstractC30815c.requireActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i12 = displayMetrics.heightPixels;
        if (layoutParams != null) {
            layoutParams.height = i12;
        }
        frameLayout.setLayoutParams(layoutParams);
        bottomSheetBehaviorFrom.setState(3);
        FrameLayout frameLayout2 = (FrameLayout) bottomSheetDialog.findViewById(i11);
        C28468k0 c28468k0 = C28468k0.f57983a;
        SNSJsonCustomization customization = c28468k0.getCustomization();
        SNSCustomizationTheme theme = customization != null ? customization.getTheme() : null;
        C28966p c28966p = theme instanceof C28966p ? (C28966p) theme : null;
        if (c28966p != null) {
            SNSColorElement sNSColorElement = SNSColorElement.BOTTOM_SHEET_BACKGROUND;
            boolean zM69346a = AbstractC28458h.m69346a(frameLayout2.getResources().getConfiguration());
            Map map = c28966p.f58877c;
            if (map == null || (c28955c = (C28955c) map.get(sNSColorElement.getValue())) == null) {
                num = null;
            } else {
                num = zM69346a ? c28955c.f58858a : c28955c.f58859b;
            }
        } else {
            num = null;
        }
        if (num != null) {
            int iIntValue = num.intValue();
            Drawable background = frameLayout2.getBackground();
            MaterialShapeDrawable materialShapeDrawable = background instanceof MaterialShapeDrawable ? (MaterialShapeDrawable) background : null;
            if (materialShapeDrawable == null) {
                frameLayout2.setBackgroundColor(0);
                return;
            }
            SNSJsonCustomization customization2 = c28468k0.getCustomization();
            SNSCustomizationTheme theme2 = customization2 != null ? customization2.getTheme() : null;
            C28966p c28966p2 = theme2 instanceof C28966p ? (C28966p) theme2 : null;
            if (c28966p2 != null) {
                SNSMetricElement sNSMetricElement = SNSMetricElement.BOTTOM_SHEET_CORNER_RADIUS;
                Map map2 = c28966p2.f58878d;
                AbstractC28962j abstractC28962j = map2 != null ? (AbstractC28962j) map2.get(sNSMetricElement.getValue()) : null;
                C28956d c28956d = abstractC28962j instanceof C28956d ? (C28956d) abstractC28962j : null;
                Float f11 = c28956d != null ? c28956d.f58860a : null;
                if (f11 != null) {
                    materialShapeDrawable.setCornerSize(f11.floatValue());
                }
            }
            materialShapeDrawable.setFillColor(ColorStateList.valueOf(iIntValue));
            C28323C c28323c = abstractC30815c.f62250a;
            if (c28323c == null || (sNSBottomSheetView = c28323c.f57630a) == null) {
                return;
            }
            sNSBottomSheetView.setBackground(null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R$layout.sns_picker_multiselect_dialog, viewGroup, false);
        SNSBottomSheetView sNSBottomSheetView = (SNSBottomSheetView) viewInflate;
        int i11 = R$id.sns_confirm;
        SNSPrimaryButton sNSPrimaryButton = (SNSPrimaryButton) ViewBindings.findChildViewById(viewInflate, i11);
        if (sNSPrimaryButton != null) {
            i11 = R$id.sns_editor_layout;
            SNSTextInputLayout sNSTextInputLayout = (SNSTextInputLayout) ViewBindings.findChildViewById(viewInflate, i11);
            if (sNSTextInputLayout != null) {
                i11 = R$id.sns_list;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, i11);
                if (recyclerView != null) {
                    i11 = R$id.sns_toolbar;
                    SNSToolbarView sNSToolbarView = (SNSToolbarView) ViewBindings.findChildViewById(viewInflate, i11);
                    if (sNSToolbarView != null) {
                        this.f62250a = new C28323C(sNSBottomSheetView, sNSPrimaryButton, sNSTextInputLayout, recyclerView, sNSToolbarView);
                        return sNSBottomSheetView;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        dialogOnCreateDialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.sumsub.sns.internal.features.presentation.common.d0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                AbstractC30815c.m70479a(this.f62252a, dialogInterface);
            }
        });
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f62250a = null;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0064  */
    /* JADX INFO: renamed from: a */
    public final void m70481a(SNSTextInputLayout sNSTextInputLayout) {
        Integer num;
        EditText editText;
        C28955c c28955c;
        Context contextRequireContext = requireContext();
        C28468k0 c28468k0 = C28468k0.f57983a;
        Drawable drawableOnResolveIcon = c28468k0.getIconHandler().onResolveIcon(contextRequireContext, SNSIconHandler.SNSCommonIcons.SEARCH.getImageName());
        if (drawableOnResolveIcon == null) {
            drawableOnResolveIcon = ResourcesCompat.getDrawable(contextRequireContext.getResources(), R$drawable.sns_ic_search, contextRequireContext.getTheme());
        }
        sNSTextInputLayout.setStartIconDrawable(drawableOnResolveIcon);
        SNSJsonCustomization customization = c28468k0.getCustomization();
        SNSCustomizationTheme theme = customization != null ? customization.getTheme() : null;
        C28966p c28966p = theme instanceof C28966p ? (C28966p) theme : null;
        if (c28966p != null) {
            SNSColorElement sNSColorElement = SNSColorElement.FIELD_PLACEHOLDER;
            boolean zM69346a = AbstractC28458h.m69346a(sNSTextInputLayout.getResources().getConfiguration());
            Map map = c28966p.f58877c;
            if (map == null || (c28955c = (C28955c) map.get(sNSColorElement.getValue())) == null) {
                num = null;
            } else if (zM69346a) {
                num = c28955c.f58858a;
            } else {
                num = c28955c.f58859b;
            }
        } else {
            num = null;
        }
        if (num != null && (editText = sNSTextInputLayout.getEditText()) != null) {
            editText.setHintTextColor(num.intValue());
        }
        EditText editText2 = sNSTextInputLayout.getEditText();
        if (editText2 != null) {
            AbstractC28234b.m69176a(editText2, SNSTypographyElement.SUBTITLE2, SNSColorElement.FIELD_CONTENT);
        }
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C30813b(this, sNSTextInputLayout, null), 3, null);
    }

    /* JADX INFO: renamed from: a */
    public static void m70478a(RecyclerView recyclerView) {
        int color;
        float dimensionPixelSize;
        float dimensionPixelSize2;
        float dimensionPixelSize3;
        Float fM69171a;
        Float fM69171a2;
        Float fM69171a3;
        Integer numM69172a;
        C28966p c28966pM69169a = AbstractC28233a.m69169a();
        if (c28966pM69169a != null && (numM69172a = AbstractC28233a.m69172a(c28966pM69169a, SNSColorElement.LIST_SEPARATOR, AbstractC28458h.m69346a(recyclerView.getResources().getConfiguration()))) != null) {
            color = numM69172a.intValue();
        } else {
            color = ContextCompat.getColor(recyclerView.getContext(), R$color.sns_listSeparator);
        }
        if (c28966pM69169a != null && (fM69171a3 = AbstractC28233a.m69171a(c28966pM69169a, SNSMetricElement.LIST_SEPARATOR_HEIGHT)) != null) {
            dimensionPixelSize = fM69171a3.floatValue();
        } else {
            dimensionPixelSize = recyclerView.getResources().getDimensionPixelSize(R$dimen.sns_list_separator_height_default);
        }
        if (c28966pM69169a != null && (fM69171a2 = AbstractC28233a.m69171a(c28966pM69169a, SNSMetricElement.LIST_SEPARATOR_MARGIN_LEFT)) != null) {
            dimensionPixelSize2 = fM69171a2.floatValue();
        } else {
            dimensionPixelSize2 = recyclerView.getResources().getDimensionPixelSize(R$dimen.sns_margin_medium);
        }
        if (c28966pM69169a != null && (fM69171a = AbstractC28233a.m69171a(c28966pM69169a, SNSMetricElement.LIST_SEPARATOR_MARGIN_RIGHT)) != null) {
            dimensionPixelSize3 = fM69171a.floatValue();
        } else {
            dimensionPixelSize3 = recyclerView.getResources().getDimensionPixelSize(R$dimen.sns_margin_medium);
        }
        recyclerView.addItemDecoration(new C28093a(dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize, color));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70480a(ContinuationImpl continuationImpl) {
        C30811a c30811a;
        C28578h c28578h;
        InterfaceC29984m interfaceC29984m;
        if (continuationImpl instanceof C30811a) {
            c30811a = (C30811a) continuationImpl;
            int i11 = c30811a.f62244c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30811a.f62244c = i11 - Integer.MIN_VALUE;
            } else {
                c30811a = new C30811a(this, continuationImpl);
            }
        } else {
            c30811a = new C30811a(this, continuationImpl);
        }
        Object objM70040a = c30811a.f62242a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30811a.f62244c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70040a);
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            AbstractActivityC28115f abstractActivityC28115f = fragmentActivityRequireActivity instanceof AbstractActivityC28115f ? (AbstractActivityC28115f) fragmentActivityRequireActivity : null;
            if (abstractActivityC28115f != null && (c28578h = (C28578h) abstractActivityC28115f.f57328a.getValue()) != null && (interfaceC29984m = (InterfaceC29984m) c28578h.f58180r.getValue()) != null) {
                c30811a.f62244c = 1;
                C29967J c29967j = (C29967J) interfaceC29984m;
                objM70040a = c29967j.m70040a(c29967j.f60204l.f60236h.getValue(), new C29958A(c29967j, null), c30811a);
                if (objM70040a == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return null;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objM70040a);
        AbstractC29971N abstractC29971N = (AbstractC29971N) objM70040a;
        if (abstractC29971N != null) {
            return (C29983l) abstractC29971N.m70051c();
        }
        return null;
    }
}
