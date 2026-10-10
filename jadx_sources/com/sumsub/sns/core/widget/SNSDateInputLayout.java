package com.sumsub.sns.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$style;
import com.sumsub.sns.R$styleable;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\fJ \u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u000eH\u0002R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/SNSDateInputLayout;", "Lcom/sumsub/sns/core/widget/SNSTextInputLayoutStartIconWorkaround;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "constraints", "Lcom/google/android/material/datepicker/CalendarConstraints;", "setConstraints", "", "c", "addView", "child", "Landroid/view/View;", "index", ReportDataTable.COLUMN_PARAMS, "Landroid/view/ViewGroup$LayoutParams;", "showCalendar", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSDateInputLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSDateInputLayout.kt\ncom/sumsub/sns/core/widget/SNSDateInputLayout\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,87:1\n59#2,2:88\n1#3:90\n*S KotlinDebug\n*F\n+ 1 SNSDateInputLayout.kt\ncom/sumsub/sns/core/widget/SNSDateInputLayout\n*L\n30#1:88,2\n*E\n"})
public final class SNSDateInputLayout extends SNSTextInputLayoutStartIconWorkaround {

    @Nullable
    private CalendarConstraints constraints;

    @JvmOverloads
    public SNSDateInputLayout(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
    }

    @JvmOverloads
    public SNSDateInputLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addView$lambda$1(SNSDateInputLayout sNSDateInputLayout, View view, boolean z11) {
        if (z11) {
            sNSDateInputLayout.showCalendar();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showCalendar() {
        FragmentManager supportFragmentManager;
        Editable text;
        String string;
        Date date;
        final Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        final DateFormat dateInstance = DateFormat.getDateInstance();
        dateInstance.setTimeZone(calendar.getTimeZone());
        try {
            EditText editText = getEditText();
            if (editText != null && (text = editText.getText()) != null && (string = text.toString()) != null && (date = dateInstance.parse(string)) != null) {
                calendar.setTime(date);
            }
        } catch (Exception unused) {
        }
        FragmentActivity fragmentActivityM69330a = AbstractC28458h.m69330a(getContext());
        if (fragmentActivityM69330a == null || (supportFragmentManager = fragmentActivityM69330a.getSupportFragmentManager()) == null) {
            return;
        }
        MaterialDatePicker.Builder<Long> selection = MaterialDatePicker.Builder.datePicker().setSelection(Long.valueOf(calendar.getTimeInMillis()));
        CalendarConstraints calendarConstraints = this.constraints;
        if (calendarConstraints != null) {
            selection.setCalendarConstraints(calendarConstraints);
        }
        MaterialDatePicker<Long> materialDatePickerBuild = selection.build();
        final Function1 function1 = new Function1() { // from class: com.sumsub.sns.core.widget.n
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SNSDateInputLayout.showCalendar$lambda$9$lambda$7(calendar, this, dateInstance, (Long) obj);
            }
        };
        materialDatePickerBuild.addOnPositiveButtonClickListener(new MaterialPickerOnPositiveButtonClickListener() { // from class: com.sumsub.sns.core.widget.o
            @Override // com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener
            public final void onPositiveButtonClick(Object obj) {
                function1.invoke(obj);
            }
        });
        materialDatePickerBuild.show(supportFragmentManager, (String) null);
    }

    public final void setConstraints(@Nullable CalendarConstraints c11) {
        this.constraints = c11;
    }

    @JvmOverloads
    public SNSDateInputLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showCalendar$lambda$9$lambda$7(Calendar calendar, SNSDateInputLayout sNSDateInputLayout, DateFormat dateFormat, Long l11) {
        calendar.setTimeInMillis(l11.longValue());
        EditText editText = sNSDateInputLayout.getEditText();
        if (editText != null) {
            editText.setText(dateFormat.format(calendar.getTime()));
        }
        return Unit.INSTANCE;
    }

    @Override // com.sumsub.sns.core.widget.SNSTextInputLayoutStartIconWorkaround, com.sumsub.sns.core.widget.SNSTextInputLayout, com.google.android.material.textfield.TextInputLayout, android.view.ViewGroup
    public void addView(@NotNull View child, int index, @NotNull ViewGroup.LayoutParams params) {
        super.addView(child, index, params);
        if (child instanceof EditText) {
            EditText editText = getEditText();
            if (editText != null) {
                editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.sumsub.sns.core.widget.l
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view, boolean z11) {
                        SNSDateInputLayout.addView$lambda$1(this.f57593b, view, z11);
                    }
                });
            }
            EditText editText2 = getEditText();
            if (editText2 != null) {
                editText2.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.core.widget.m
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f57594b.showCalendar();
                    }
                });
            }
            EditText editText3 = getEditText();
            if (editText3 != null) {
                editText3.setKeyListener(null);
            }
        }
    }

    public /* synthetic */ SNSDateInputLayout(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? R$attr.sns_DateInputLayoutStyle : i11, (i13 & 8) != 0 ? R$style.Widget_SNSDateInputLayout : i12);
    }

    @JvmOverloads
    public SNSDateInputLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SNSDateInputLayout, i11, i12);
        setIconMarginStart(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SNSDateInputLayout_sns_iconMarginStart, 0));
        typedArrayObtainStyledAttributes.recycle();
        setStartIconDrawable(C28468k0.f57983a.getIconHandler().onResolveIcon(context, SNSIconHandler.SNSCommonIcons.CALENDAR.getImageName()));
    }
}
