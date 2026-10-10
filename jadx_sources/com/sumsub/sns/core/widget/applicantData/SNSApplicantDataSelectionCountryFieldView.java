package com.sumsub.sns.core.widget.applicantData;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.navigation.NavigationBarView;
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
import com.sumsub.sns.internal.features.presentation.country.picker.InterfaceC30893e;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u000eJ\u000f\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u000eJ\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R(\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR?\u0010$\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\f\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R(\u0010+\u001a\u0004\u0018\u00010\u000f2\b\u0010*\u001a\u0004\u0018\u00010\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R$\u0010*\u001a\u0002022\u0006\u0010*\u001a\u0002028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b3\u00104\"\u0004\b5\u00106¨\u00067"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataSelectionCountryFieldView;", "Lcom/sumsub/sns/core/widget/SNSApplicantDataFieldView;", "Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView$Selectable;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "initDefaults", "()V", "Lcom/sumsub/sns/internal/features/presentation/country/b;", "item", "onCountrySelected", "(Lcom/sumsub/sns/internal/features/presentation/country/b;)V", "reset", "openSelector", "", "enabled", "setEnabled", "(Z)V", "", FirebaseAnalytics.Param.ITEMS, "Ljava/util/List;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "country", "onCountrySelectedCallback", "Lkotlin/jvm/functions/Function1;", "getOnCountrySelectedCallback", "()Lkotlin/jvm/functions/Function1;", "setOnCountrySelectedCallback", "(Lkotlin/jvm/functions/Function1;)V", "value", "selectedCountry", "Lcom/sumsub/sns/internal/features/presentation/country/b;", "getSelectedCountry", "()Lcom/sumsub/sns/internal/features/presentation/country/b;", "Landroid/graphics/drawable/Drawable;", "endIcon", "Landroid/graphics/drawable/Drawable;", "", "getValue", "()Ljava/lang/String;", "setValue", "(Ljava/lang/String;)V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SuppressLint({"ClickableViewAccessibility"})
@SourceDebugExtension({"SMAP\nSNSApplicantDataSelectionCountryFieldView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSApplicantDataSelectionCountryFieldView.kt\ncom/sumsub/sns/core/widget/applicantData/SNSApplicantDataSelectionCountryFieldView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,131:1\n1#2:132\n*E\n"})
public final class SNSApplicantDataSelectionCountryFieldView extends SNSApplicantDataFieldView implements SNSApplicantDataBaseFieldView.Selectable {

    @Nullable
    private Drawable endIcon;

    @NotNull
    private List<C30877b> items;

    @Nullable
    private Function1<? super C30877b, Unit> onCountrySelectedCallback;

    @Nullable
    private C30877b selectedCountry;

    @JvmOverloads
    public SNSApplicantDataSelectionCountryFieldView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _set_value_$lambda$1$lambda$0(EditText editText) {
        editText.setSelection(0);
        editText.scrollTo(0, 0);
    }

    @JvmOverloads
    public SNSApplicantDataSelectionCountryFieldView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    @NotNull
    public final List<C30877b> getItems() {
        return this.items;
    }

    @Nullable
    public final Function1<C30877b, Unit> getOnCountrySelectedCallback() {
        return this.onCountrySelectedCallback;
    }

    @Nullable
    public final C30877b getSelectedCountry() {
        return this.selectedCountry;
    }

    public final void setItems(@NotNull List<C30877b> list) {
        this.items = list;
    }

    public final void setOnCountrySelectedCallback(@Nullable Function1<? super C30877b, Unit> function1) {
        this.onCountrySelectedCallback = function1;
    }

    @JvmOverloads
    public SNSApplicantDataSelectionCountryFieldView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$7(GestureDetector gestureDetector, View view, MotionEvent motionEvent) {
        return gestureDetector.onTouchEvent(motionEvent);
    }

    private final void initDefaults() {
        EditText editText = getEditText();
        if (editText != null) {
            editText.setKeyListener(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCountrySelected(C30877b item) {
        SNSFlaggedInputLayout sNSFlaggedInputLayout;
        SNSFlagView flagView;
        EditText editText;
        EditText editText2;
        TextInputLayout inputLayout = getInputLayout();
        if (inputLayout != null && (editText2 = inputLayout.getEditText()) != null) {
            editText2.clearFocus();
        }
        TextInputLayout inputLayout2 = getInputLayout();
        if (inputLayout2 != null && (editText = inputLayout2.getEditText()) != null) {
            editText.setText(item.f62374b);
        }
        TextInputLayout inputLayout3 = getInputLayout();
        if (inputLayout3 instanceof SNSFlaggedInputLayout) {
            sNSFlaggedInputLayout = (SNSFlaggedInputLayout) inputLayout3;
        } else {
            sNSFlaggedInputLayout = null;
        }
        if (sNSFlaggedInputLayout != null && (flagView = sNSFlaggedInputLayout.getFlagView()) != null) {
            flagView.setImageDrawable(AbstractC30878c.m70503a(item, flagView.getContext()));
        }
        this.selectedCountry = item;
        Function1<? super C30877b, Unit> function1 = this.onCountrySelectedCallback;
        if (function1 != null) {
            function1.invoke(item);
        }
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    @NotNull
    public String getValue() {
        Editable text;
        EditText editText;
        TextInputLayout inputLayout = getInputLayout();
        if (inputLayout != null && (editText = inputLayout.getEditText()) != null) {
            text = editText.getText();
        } else {
            text = null;
        }
        return String.valueOf(text);
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView.Selectable
    public void openSelector() {
        FragmentActivity fragmentActivity;
        FragmentManager supportFragmentManager;
        if (isEnabled()) {
            Context context = getContext();
            List<C30877b> list = this.items;
            InterfaceC30893e interfaceC30893e = new InterfaceC30893e() { // from class: com.sumsub.sns.core.widget.applicantData.SNSApplicantDataSelectionCountryFieldView.openSelector.1
                @Override // com.sumsub.sns.internal.features.presentation.country.picker.InterfaceC30893e
                public void onDismiss() {
                    EditText editText;
                    TextInputLayout inputLayout = SNSApplicantDataSelectionCountryFieldView.this.getInputLayout();
                    if (inputLayout == null || (editText = inputLayout.getEditText()) == null) {
                        return;
                    }
                    editText.clearFocus();
                }

                @Override // com.sumsub.sns.internal.features.presentation.country.picker.InterfaceC30893e
                public void onItemSelected(C30877b item) {
                    SNSApplicantDataSelectionCountryFieldView.this.onCountrySelected(item);
                }
            };
            if (context instanceof FragmentActivity) {
                fragmentActivity = (FragmentActivity) context;
            } else {
                fragmentActivity = null;
            }
            if (fragmentActivity != null && (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) != null && supportFragmentManager.findFragmentByTag("CountryPickerDialog") == null) {
                int i11 = CountryPickerDialog.f62384U;
                Set setEmptySet = SetsKt.emptySet();
                CountryPickerDialog countryPickerDialog = new CountryPickerDialog();
                countryPickerDialog.f62386c = interfaceC30893e;
                Bundle bundle = new Bundle();
                bundle.putParcelable("extra_selection_mode", CountryPickerDialog.SelectionMode.SINGLE);
                bundle.putParcelableArray("extra_items", (Parcelable[]) list.toArray(new C30877b[0]));
                bundle.putParcelableArray("extra_preselected_items", (Parcelable[]) setEmptySet.toArray(new C30877b[0]));
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

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    public void setValue(@NotNull String str) {
        SNSFlaggedInputLayout sNSFlaggedInputLayout;
        Object next;
        SNSFlaggedInputLayout sNSFlaggedInputLayout2;
        SNSFlagView flagView;
        SNSFlagView flagView2;
        String str2;
        Locale locale;
        final EditText editText;
        EditText editText2;
        TextInputLayout inputLayout = getInputLayout();
        if (inputLayout != null && (editText2 = inputLayout.getEditText()) != null) {
            editText2.setText(str);
        }
        TextInputLayout inputLayout2 = getInputLayout();
        if (inputLayout2 != null && (editText = inputLayout2.getEditText()) != null) {
            editText.post(new Runnable() { // from class: com.sumsub.sns.core.widget.applicantData.n
                @Override // java.lang.Runnable
                public final void run() {
                    SNSApplicantDataSelectionCountryFieldView._set_value_$lambda$1$lambda$0(editText);
                }
            });
        }
        Iterator<T> it = this.items.iterator();
        do {
            sNSFlaggedInputLayout = null;
            if (it.hasNext()) {
                next = it.next();
                str2 = ((C30877b) next).f62374b;
                locale = Locale.ROOT;
            } else {
                next = null;
                break;
            }
        } while (!Intrinsics.areEqual(str2.toLowerCase(locale), str.toLowerCase(locale)));
        C30877b c30877b = (C30877b) next;
        if (c30877b != null) {
            TextInputLayout inputLayout3 = getInputLayout();
            if (inputLayout3 instanceof SNSFlaggedInputLayout) {
                sNSFlaggedInputLayout = (SNSFlaggedInputLayout) inputLayout3;
            }
            if (sNSFlaggedInputLayout != null && (flagView2 = sNSFlaggedInputLayout.getFlagView()) != null) {
                flagView2.setImageDrawable(AbstractC30878c.m70503a(c30877b, getContext()));
            }
            this.selectedCountry = c30877b;
            return;
        }
        TextInputLayout inputLayout4 = getInputLayout();
        if (inputLayout4 instanceof SNSFlaggedInputLayout) {
            sNSFlaggedInputLayout2 = (SNSFlaggedInputLayout) inputLayout4;
        } else {
            sNSFlaggedInputLayout2 = null;
        }
        if (sNSFlaggedInputLayout2 != null && (flagView = sNSFlaggedInputLayout2.getFlagView()) != null) {
            flagView.setImageDrawable(null);
        }
        this.selectedCountry = null;
    }

    public /* synthetic */ SNSApplicantDataSelectionCountryFieldView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? R$attr.sns_applicantDataFieldViewStyle : i11, (i13 & 8) != 0 ? R$style.Widget_SNSApplicantDataFieldView_Country : i12);
    }

    @JvmOverloads
    public SNSApplicantDataSelectionCountryFieldView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        EditText editText;
        EditText editText2;
        super(context, attributeSet, i11, i12);
        this.items = CollectionsKt.emptyList();
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
        TextInputLayout inputLayout3 = getInputLayout();
        if (inputLayout3 != null && (editText2 = inputLayout3.getEditText()) != null) {
            editText2.setTextAlignment(5);
            editText2.setGravity(NavigationBarView.ITEM_GRAVITY_START_CENTER);
        }
        final GestureDetector gestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() { // from class: com.sumsub.sns.core.widget.applicantData.SNSApplicantDataSelectionCountryFieldView$gestureDetector$1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(MotionEvent e11) {
                this.this$0.openSelector();
                return super.onSingleTapUp(e11);
            }
        });
        TextInputLayout inputLayout4 = getInputLayout();
        if (inputLayout4 != null && (editText = inputLayout4.getEditText()) != null) {
            editText.setOnTouchListener(new View.OnTouchListener() { // from class: com.sumsub.sns.core.widget.applicantData.o
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return SNSApplicantDataSelectionCountryFieldView._init_$lambda$7(gestureDetector, view, motionEvent);
                }
            });
        }
        initDefaults();
        onInitializationFinished();
    }
}
