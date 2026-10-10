package com.sumsub.sns.core.widget.applicantData;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.widget.EditText;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.firebase.messaging.Constants;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$style;
import com.sumsub.sns.core.widget.SNSApplicantDataFieldView;
import com.sumsub.sns.core.widget.SNSDateInputLayout;
import java.text.DateFormat;
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
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'J\u000e\u0010(\u001a\u0004\u0018\u00010\u0018*\u00020\u0013H\u0002R\u0016\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00138V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R*\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u0012\u001a\u0004\u0018\u00010\u00188F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR(\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u001e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006)"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataCalendarFieldView;", "Lcom/sumsub/sns/core/widget/SNSApplicantDataFieldView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "printDateFormat", "Ljava/text/DateFormat;", "kotlin.jvm.PlatformType", "dateInput", "Lcom/sumsub/sns/core/widget/SNSDateInputLayout;", "getDateInput", "()Lcom/sumsub/sns/core/widget/SNSDateInputLayout;", "value", "", "getValue", "()Ljava/lang/String;", "setValue", "(Ljava/lang/String;)V", "Ljava/util/Date;", "selectedDate", "getSelectedDate", "()Ljava/util/Date;", "setSelectedDate", "(Ljava/util/Date;)V", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "getError", "()Ljava/lang/CharSequence;", "setError", "(Ljava/lang/CharSequence;)V", "setConstraints", "", "constraints", "Lcom/google/android/material/datepicker/CalendarConstraints;", "parseAsPrintFormat", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSApplicantDataCalendarFieldView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSApplicantDataCalendarFieldView.kt\ncom/sumsub/sns/core/widget/applicantData/SNSApplicantDataCalendarFieldView\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,77:1\n65#2,16:78\n93#2,3:94\n1#3:97\n*S KotlinDebug\n*F\n+ 1 SNSApplicantDataCalendarFieldView.kt\ncom/sumsub/sns/core/widget/applicantData/SNSApplicantDataCalendarFieldView\n*L\n58#1:78,16\n58#1:94,3\n*E\n"})
public final class SNSApplicantDataCalendarFieldView extends SNSApplicantDataFieldView {
    private final DateFormat printDateFormat;

    @Nullable
    private Date selectedDate;

    @JvmOverloads
    public SNSApplicantDataCalendarFieldView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
    }

    @JvmOverloads
    public SNSApplicantDataCalendarFieldView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    private final SNSDateInputLayout getDateInput() {
        return (SNSDateInputLayout) findViewById(R$id.sns_data_date);
    }

    private final Date parseAsPrintFormat(String str) {
        try {
            return this.printDateFormat.parse(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @JvmOverloads
    public SNSApplicantDataCalendarFieldView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    @Nullable
    public CharSequence getError() {
        SNSDateInputLayout dateInput = getDateInput();
        if (dateInput != null) {
            return dateInput.getError();
        }
        return null;
    }

    @Nullable
    public final Date getSelectedDate() {
        Editable text;
        EditText editText;
        SNSDateInputLayout dateInput = getDateInput();
        if (dateInput != null && (editText = dateInput.getEditText()) != null) {
            text = editText.getText();
        } else {
            text = null;
        }
        return parseAsPrintFormat(String.valueOf(text));
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    @NotNull
    public String getValue() {
        String str;
        Date selectedDate = getSelectedDate();
        if (selectedDate != null && (str = this.printDateFormat.format(selectedDate)) != null) {
            return str;
        }
        return "";
    }

    public final void setConstraints(@Nullable CalendarConstraints constraints) {
        SNSDateInputLayout dateInput = getDateInput();
        if (dateInput != null) {
            dateInput.setConstraints(constraints);
        }
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    public void setError(@Nullable CharSequence charSequence) {
        SNSDateInputLayout dateInput = getDateInput();
        if (dateInput != null) {
            dateInput.setError(charSequence);
        }
    }

    public final void setSelectedDate(@Nullable Date date) {
        EditText editText;
        String str;
        SNSDateInputLayout dateInput = getDateInput();
        if (dateInput != null && (editText = dateInput.getEditText()) != null) {
            if (date == null || (str = this.printDateFormat.format(date)) == null) {
                str = "";
            }
            editText.setText(str);
        }
        this.selectedDate = date;
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    public void setValue(@NotNull String str) {
        setSelectedDate(parseAsPrintFormat(str));
    }

    public /* synthetic */ SNSApplicantDataCalendarFieldView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? R$attr.sns_applicantDataFieldViewStyle : i11, (i13 & 8) != 0 ? R$style.Widget_SNSApplicantDataFieldView_Date : i12);
    }

    @JvmOverloads
    public SNSApplicantDataCalendarFieldView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        EditText editText;
        super(context, attributeSet, i11, i12);
        DateFormat dateInstance = DateFormat.getDateInstance();
        dateInstance.setTimeZone(TimeZone.getTimeZone("UTC"));
        this.printDateFormat = dateInstance;
        setFocusable(true);
        setFocusableInTouchMode(true);
        SNSDateInputLayout dateInput = getDateInput();
        if (dateInput != null && (editText = dateInput.getEditText()) != null) {
            editText.addTextChangedListener(new TextWatcher() { // from class: com.sumsub.sns.core.widget.applicantData.SNSApplicantDataCalendarFieldView$special$$inlined$addTextChangedListener$default$1
                @Override // android.text.TextWatcher
                public void afterTextChanged(@Nullable Editable s11) {
                    this.this$0.setError(null);
                    Function1<String, Unit> textChangedCallback = this.this$0.getTextChangedCallback();
                    if (textChangedCallback != null) {
                        textChangedCallback.invoke(s11 != null ? s11.toString() : null);
                    }
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
                }
            });
        }
        onInitializationFinished();
    }
}
