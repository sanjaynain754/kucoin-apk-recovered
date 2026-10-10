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
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener;
import com.google.android.material.timepicker.MaterialTimePicker;
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
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\fH\u0002J1\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0002\u0010\u001a¨\u0006\u001b"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/SNSDateTimeInputLayout;", "Lcom/sumsub/sns/core/widget/SNSTextInputLayoutStartIconWorkaround;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "addView", "", "child", "Landroid/view/View;", "index", ReportDataTable.COLUMN_PARAMS, "Landroid/view/ViewGroup$LayoutParams;", "showCalendar", "showTime", "cal", "Ljava/util/Calendar;", "df", "Ljava/text/DateFormat;", "hours", "minutes", "(Ljava/util/Calendar;Ljava/text/DateFormat;Ljava/lang/Integer;Ljava/lang/Integer;)V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSDateTimeInputLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSDateTimeInputLayout.kt\ncom/sumsub/sns/core/widget/SNSDateTimeInputLayout\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,109:1\n59#2,2:110\n1#3:112\n*S KotlinDebug\n*F\n+ 1 SNSDateTimeInputLayout.kt\ncom/sumsub/sns/core/widget/SNSDateTimeInputLayout\n*L\n30#1:110,2\n*E\n"})
public final class SNSDateTimeInputLayout extends SNSTextInputLayoutStartIconWorkaround {
    @JvmOverloads
    public SNSDateTimeInputLayout(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
    }

    @JvmOverloads
    public SNSDateTimeInputLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addView$lambda$1(SNSDateTimeInputLayout sNSDateTimeInputLayout, View view, boolean z11) {
        if (z11) {
            sNSDateTimeInputLayout.showCalendar();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v12, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v15, types: [T, java.lang.Integer] */
    public final void showCalendar() {
        FragmentManager supportFragmentManager;
        Editable text;
        String string;
        Date date;
        final Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        final DateFormat dateTimeInstance = DateFormat.getDateTimeInstance();
        dateTimeInstance.setTimeZone(calendar.getTimeZone());
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        try {
            EditText editText = getEditText();
            if (editText != null && (text = editText.getText()) != null && (string = text.toString()) != null && (date = dateTimeInstance.parse(string)) != null) {
                calendar.setTime(date);
                objectRef.element = Integer.valueOf(calendar.get(12));
                objectRef2.element = Integer.valueOf(calendar.get(10));
            }
        } catch (Exception unused) {
        }
        FragmentActivity fragmentActivityM69330a = AbstractC28458h.m69330a(getContext());
        if (fragmentActivityM69330a == null || (supportFragmentManager = fragmentActivityM69330a.getSupportFragmentManager()) == null) {
            return;
        }
        MaterialDatePicker<Long> materialDatePickerBuild = MaterialDatePicker.Builder.datePicker().setSelection(Long.valueOf(calendar.getTimeInMillis())).build();
        final Function1 function1 = new Function1() { // from class: com.sumsub.sns.core.widget.r
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SNSDateTimeInputLayout.showCalendar$lambda$7$lambda$5(calendar, this, dateTimeInstance, objectRef2, objectRef, (Long) obj);
            }
        };
        materialDatePickerBuild.addOnPositiveButtonClickListener(new MaterialPickerOnPositiveButtonClickListener() { // from class: com.sumsub.sns.core.widget.s
            @Override // com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener
            public final void onPositiveButtonClick(Object obj) {
                function1.invoke(obj);
            }
        });
        materialDatePickerBuild.show(supportFragmentManager, (String) null);
    }

    private final void showTime(final Calendar cal, final DateFormat df2, Integer hours, Integer minutes) {
        FragmentManager supportFragmentManager;
        MaterialTimePicker.Builder timeFormat = new MaterialTimePicker.Builder().setTimeFormat(1);
        if (minutes != null) {
            timeFormat.setMinute(minutes.intValue());
        }
        if (hours != null) {
            timeFormat.setHour(hours.intValue());
        }
        final MaterialTimePicker materialTimePickerBuild = timeFormat.build();
        materialTimePickerBuild.addOnPositiveButtonClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.core.widget.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SNSDateTimeInputLayout.showTime$lambda$8(cal, materialTimePickerBuild, this, df2, view);
            }
        });
        FragmentActivity fragmentActivityM69330a = AbstractC28458h.m69330a(getContext());
        if (fragmentActivityM69330a == null || (supportFragmentManager = fragmentActivityM69330a.getSupportFragmentManager()) == null) {
            return;
        }
        materialTimePickerBuild.show(supportFragmentManager, (String) null);
    }

    @JvmOverloads
    public SNSDateTimeInputLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit showCalendar$lambda$7$lambda$5(Calendar calendar, SNSDateTimeInputLayout sNSDateTimeInputLayout, DateFormat dateFormat, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Long l11) {
        calendar.setTimeInMillis(l11.longValue());
        sNSDateTimeInputLayout.showTime(calendar, dateFormat, (Integer) objectRef.element, (Integer) objectRef2.element);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showTime$lambda$8(Calendar calendar, MaterialTimePicker materialTimePicker, SNSDateTimeInputLayout sNSDateTimeInputLayout, DateFormat dateFormat, View view) {
        calendar.set(10, materialTimePicker.getHour());
        calendar.set(12, materialTimePicker.getMinute());
        EditText editText = sNSDateTimeInputLayout.getEditText();
        if (editText != null) {
            editText.setText(dateFormat.format(calendar.getTime()));
        }
    }

    @Override // com.sumsub.sns.core.widget.SNSTextInputLayoutStartIconWorkaround, com.sumsub.sns.core.widget.SNSTextInputLayout, com.google.android.material.textfield.TextInputLayout, android.view.ViewGroup
    public void addView(@NotNull View child, int index, @NotNull ViewGroup.LayoutParams params) {
        super.addView(child, index, params);
        if (child instanceof EditText) {
            EditText editText = getEditText();
            if (editText != null) {
                editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.sumsub.sns.core.widget.p
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view, boolean z11) {
                        SNSDateTimeInputLayout.addView$lambda$1(this.f57599b, view, z11);
                    }
                });
            }
            EditText editText2 = getEditText();
            if (editText2 != null) {
                editText2.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.core.widget.q
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f57600b.showCalendar();
                    }
                });
            }
            EditText editText3 = getEditText();
            if (editText3 != null) {
                editText3.setKeyListener(null);
            }
            setFocusable(true);
            setFocusableInTouchMode(true);
        }
    }

    public /* synthetic */ SNSDateTimeInputLayout(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? R$attr.sns_DateTimeInputLayoutStyle : i11, (i13 & 8) != 0 ? R$style.Widget_SNSDateTimeInputLayout : i12);
    }

    @JvmOverloads
    public SNSDateTimeInputLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SNSDateTimeInputLayout, i11, i12);
        setIconMarginStart(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SNSDateTimeInputLayout_sns_iconMarginStart, 0));
        typedArrayObtainStyledAttributes.recycle();
        EditText editText = getEditText();
        if (editText != null) {
            editText.setKeyListener(null);
        }
        setStartIconDrawable(C28468k0.f57983a.getIconHandler().onResolveIcon(context, SNSIconHandler.SNSCommonIcons.CALENDAR.getImageName()));
    }
}
