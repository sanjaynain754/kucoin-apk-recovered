package com.sumsub.sns.core.widget.applicantData;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$style;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.core.widget.SNSApplicantDataFieldView;
import com.sumsub.sns.core.widget.SNSFlagView;
import com.sumsub.sns.core.widget.SNSFlaggedInputLayout;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.features.presentation.country.AbstractC30878c;
import com.sumsub.sns.internal.features.presentation.country.C30877b;
import com.sumsub.sns.internal.features.presentation.country.picker.CountryPickerDialog;
import com.sumsub.sns.internal.features.presentation.country.picker.InterfaceC30894f;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u000eJ\u000f\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u000eJ\u0017\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R(\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u0013R*\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R6\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u001a\u001a\u0004\b'\u0010\u001c\"\u0004\b(\u0010\u0013R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010/\u001a\u0004\u0018\u00010,8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00060"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataMultipleCountrySelectionFieldView;", "Lcom/sumsub/sns/core/widget/SNSApplicantDataFieldView;", "Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView$Selectable;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "initDefaults", "()V", "", "Lcom/sumsub/sns/internal/features/presentation/country/b;", FirebaseAnalytics.Param.ITEMS, "onCountriesSelected", "(Ljava/util/List;)V", "reset", "openSelector", "", "enabled", "setEnabled", "(Z)V", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "setItems", "Lkotlin/Function0;", "onCountrySelectionChanged", "Lkotlin/jvm/functions/Function0;", "getOnCountrySelectionChanged", "()Lkotlin/jvm/functions/Function0;", "setOnCountrySelectionChanged", "(Lkotlin/jvm/functions/Function0;)V", "value", "selectedCountries", "getSelectedCountries", "setSelectedCountries", "Landroid/graphics/drawable/Drawable;", "endIcon", "Landroid/graphics/drawable/Drawable;", "Lcom/sumsub/sns/core/widget/SNSFlagView;", "getSnsFlagView", "()Lcom/sumsub/sns/core/widget/SNSFlagView;", "snsFlagView", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SuppressLint({"ClickableViewAccessibility"})
public final class SNSApplicantDataMultipleCountrySelectionFieldView extends SNSApplicantDataFieldView implements SNSApplicantDataBaseFieldView.Selectable {

    @Nullable
    private Drawable endIcon;

    @NotNull
    private List<C30877b> items;

    @Nullable
    private Function0<Unit> onCountrySelectionChanged;

    @NotNull
    private List<C30877b> selectedCountries;

    @JvmOverloads
    public SNSApplicantDataMultipleCountrySelectionFieldView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
    }

    @JvmOverloads
    public SNSApplicantDataMultipleCountrySelectionFieldView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    @NotNull
    public final List<C30877b> getItems() {
        return this.items;
    }

    @Nullable
    public final Function0<Unit> getOnCountrySelectionChanged() {
        return this.onCountrySelectionChanged;
    }

    @NotNull
    public final List<C30877b> getSelectedCountries() {
        return this.selectedCountries;
    }

    public final void setItems(@NotNull List<C30877b> list) {
        this.items = list;
    }

    public final void setOnCountrySelectionChanged(@Nullable Function0<Unit> function0) {
        this.onCountrySelectionChanged = function0;
    }

    public final void setSelectedCountries(@NotNull List<C30877b> list) {
        EditText editText;
        this.selectedCountries = list;
        String strJoinToString$default = CollectionsKt.joinToString$default(list, null, null, null, 0, null, new Function1() { // from class: com.sumsub.sns.core.widget.applicantData.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ((C30877b) obj).f62374b;
            }
        }, 31, null);
        TextInputLayout inputLayout = getInputLayout();
        if (inputLayout != null && (editText = inputLayout.getEditText()) != null) {
            editText.setText(strJoinToString$default);
        }
        Drawable drawableM70503a = list.size() == 1 ? AbstractC30878c.m70503a(list.get(0), getContext()) : null;
        SNSFlagView snsFlagView = getSnsFlagView();
        if (snsFlagView != null) {
            snsFlagView.setImageDrawable(drawableM70503a);
        }
    }

    @JvmOverloads
    public SNSApplicantDataMultipleCountrySelectionFieldView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$2(GestureDetector gestureDetector, View view, MotionEvent motionEvent) {
        return gestureDetector.onTouchEvent(motionEvent);
    }

    private final SNSFlagView getSnsFlagView() {
        SNSFlaggedInputLayout sNSFlaggedInputLayout;
        TextInputLayout inputLayout = getInputLayout();
        if (inputLayout instanceof SNSFlaggedInputLayout) {
            sNSFlaggedInputLayout = (SNSFlaggedInputLayout) inputLayout;
        } else {
            sNSFlaggedInputLayout = null;
        }
        if (sNSFlaggedInputLayout == null) {
            return null;
        }
        return sNSFlaggedInputLayout.getFlagView();
    }

    private final void initDefaults() {
        EditText editText = getEditText();
        if (editText != null) {
            editText.setKeyListener(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCountriesSelected(List<C30877b> items) {
        EditText editText;
        TextInputLayout inputLayout = getInputLayout();
        if (inputLayout != null && (editText = inputLayout.getEditText()) != null) {
            editText.clearFocus();
        }
        setSelectedCountries(items);
        Function0<Unit> function0 = this.onCountrySelectionChanged;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [com.sumsub.sns.core.widget.applicantData.SNSApplicantDataMultipleCountrySelectionFieldView$openSelector$1] */
    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView.Selectable
    public void openSelector() {
        FragmentActivity fragmentActivity;
        FragmentManager supportFragmentManager;
        if (isEnabled()) {
            Context context = getContext();
            List<C30877b> list = this.items;
            Set set = CollectionsKt.toSet(this.selectedCountries);
            ?? r11 = new InterfaceC30894f() { // from class: com.sumsub.sns.core.widget.applicantData.SNSApplicantDataMultipleCountrySelectionFieldView.openSelector.1
                @Override // com.sumsub.sns.internal.features.presentation.country.picker.InterfaceC30894f
                public void onDismiss() {
                    EditText editText;
                    TextInputLayout inputLayout = SNSApplicantDataMultipleCountrySelectionFieldView.this.getInputLayout();
                    if (inputLayout == null || (editText = inputLayout.getEditText()) == null) {
                        return;
                    }
                    editText.clearFocus();
                }

                @Override // com.sumsub.sns.internal.features.presentation.country.picker.InterfaceC30894f
                public void onItemsSelected(List<C30877b> items) {
                    SNSApplicantDataMultipleCountrySelectionFieldView.this.onCountriesSelected(items);
                }
            };
            if (context instanceof FragmentActivity) {
                fragmentActivity = (FragmentActivity) context;
            } else {
                fragmentActivity = null;
            }
            if (fragmentActivity != null && (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) != null && supportFragmentManager.findFragmentByTag("CountryPickerDialog") == null) {
                CountryPickerDialog countryPickerDialog = new CountryPickerDialog();
                countryPickerDialog.f62385b = r11;
                Bundle bundle = new Bundle();
                bundle.putParcelable("extra_selection_mode", CountryPickerDialog.SelectionMode.MULTI);
                bundle.putParcelableArray("extra_items", (Parcelable[]) list.toArray(new C30877b[0]));
                bundle.putParcelableArray("extra_preselected_items", (Parcelable[]) set.toArray(new C30877b[0]));
                bundle.putBoolean("extra_sort", true);
                countryPickerDialog.setArguments(bundle);
                countryPickerDialog.show(supportFragmentManager, "CountryPickerDialog");
            }
        }
    }

    @Override // com.sumsub.sns.core.widget.SNSApplicantDataFieldView, com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    public void reset() {
        super.reset();
        initDefaults();
    }

    @Override // com.sumsub.sns.core.widget.SNSApplicantDataFieldView, android.view.View
    public void setEnabled(boolean enabled) {
        Drawable drawable;
        int i11;
        super.setEnabled(enabled);
        TextInputLayout inputLayout = getInputLayout();
        if (inputLayout != null) {
            if (enabled) {
                i11 = -1;
            } else {
                i11 = 0;
            }
            inputLayout.setEndIconMode(i11);
        }
        TextInputLayout inputLayout2 = getInputLayout();
        if (inputLayout2 != null) {
            if (enabled) {
                drawable = this.endIcon;
            } else {
                drawable = null;
            }
            inputLayout2.setEndIconDrawable(drawable);
        }
    }

    public /* synthetic */ SNSApplicantDataMultipleCountrySelectionFieldView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? R$attr.sns_applicantDataFieldViewStyle : i11, (i13 & 8) != 0 ? R$style.Widget_SNSApplicantDataFieldView_Country : i12);
    }

    @JvmOverloads
    public SNSApplicantDataMultipleCountrySelectionFieldView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        EditText editText;
        super(context, attributeSet, i11, i12);
        this.items = CollectionsKt.emptyList();
        this.selectedCountries = CollectionsKt.emptyList();
        String imageName = SNSIconHandler.SNSCommonIcons.MORE.getImageName();
        C28468k0 c28468k0 = C28468k0.f57983a;
        Drawable drawableOnResolveIcon = c28468k0.getIconHandler().onResolveIcon(context, imageName);
        this.endIcon = drawableOnResolveIcon == null ? c28468k0.getIconHandler().onResolveIcon(context, SNSIconHandler.SNSCommonIcons.DISCLOSURE.getImageName()) : drawableOnResolveIcon;
        TextInputLayout inputLayout = getInputLayout();
        if (inputLayout != null) {
            inputLayout.setEndIconMode(-1);
        }
        TextInputLayout inputLayout2 = getInputLayout();
        if (inputLayout2 != null) {
            inputLayout2.setEndIconDrawable(this.endIcon);
        }
        final GestureDetector gestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() { // from class: com.sumsub.sns.core.widget.applicantData.SNSApplicantDataMultipleCountrySelectionFieldView$gestureDetector$1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(MotionEvent e11) {
                this.this$0.openSelector();
                return super.onSingleTapUp(e11);
            }
        });
        TextInputLayout inputLayout3 = getInputLayout();
        if (inputLayout3 != null && (editText = inputLayout3.getEditText()) != null) {
            editText.setOnTouchListener(new View.OnTouchListener() { // from class: com.sumsub.sns.core.widget.applicantData.e
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return SNSApplicantDataMultipleCountrySelectionFieldView._init_$lambda$2(gestureDetector, view, motionEvent);
                }
            });
        }
        initDefaults();
        onInitializationFinished();
    }
}
