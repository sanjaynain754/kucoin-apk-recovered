package com.google.android.material.datepicker;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.google.android.material.C7090R;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;
import p852kotlin.text.Typography;

/* JADX INFO: loaded from: classes45.dex */
abstract class DateFormatTextWatcher extends TextWatcherAdapter {
    private final CalendarConstraints constraints;
    private final DateFormat dateFormat;
    private final String formatHint;
    private int lastLength = 0;
    private final String outOfRange;
    private final Runnable setErrorCallback;
    private Runnable setRangeErrorCallback;

    @NonNull
    private final TextInputLayout textInputLayout;

    public abstract void onValidDate(@Nullable Long l11);

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m13117b(DateFormatTextWatcher dateFormatTextWatcher, String str) {
        TextInputLayout textInputLayout = dateFormatTextWatcher.textInputLayout;
        DateFormat dateFormat = dateFormatTextWatcher.dateFormat;
        Context context = textInputLayout.getContext();
        textInputLayout.setError(context.getString(C7090R.string.mtrl_picker_invalid_format) + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + String.format(context.getString(C7090R.string.mtrl_picker_invalid_format_use), dateFormatTextWatcher.sanitizeDateString(str)) + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + String.format(context.getString(C7090R.string.mtrl_picker_invalid_format_example), dateFormatTextWatcher.sanitizeDateString(dateFormat.format(new Date(UtcDates.getTodayCalendar().getTimeInMillis())))));
        dateFormatTextWatcher.onInvalidDate();
    }

    private Runnable createRangeErrorCallback(final long j11) {
        return new Runnable() { // from class: com.google.android.material.datepicker.b
            @Override // java.lang.Runnable
            public final void run() {
                DateFormatTextWatcher.m13116a(this.f11834b, j11);
            }
        };
    }

    private String sanitizeDateString(String str) {
        return str.replace(' ', Typography.nbsp);
    }

    @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
    public void onTextChanged(@NonNull CharSequence charSequence, int i11, int i12, int i13) {
        this.textInputLayout.removeCallbacks(this.setErrorCallback);
        this.textInputLayout.removeCallbacks(this.setRangeErrorCallback);
        this.textInputLayout.setError(null);
        onValidDate(null);
        if (TextUtils.isEmpty(charSequence) || charSequence.length() < this.formatHint.length()) {
            return;
        }
        try {
            Date date = this.dateFormat.parse(charSequence.toString());
            this.textInputLayout.setError(null);
            long time = date.getTime();
            if (this.constraints.getDateValidator().isValid(time) && this.constraints.isWithinBounds(time)) {
                onValidDate(Long.valueOf(date.getTime()));
                return;
            }
            Runnable runnableCreateRangeErrorCallback = createRangeErrorCallback(time);
            this.setRangeErrorCallback = runnableCreateRangeErrorCallback;
            runValidation(this.textInputLayout, runnableCreateRangeErrorCallback);
        } catch (ParseException unused) {
            runValidation(this.textInputLayout, this.setErrorCallback);
        }
    }

    public DateFormatTextWatcher(final String str, DateFormat dateFormat, @NonNull TextInputLayout textInputLayout, CalendarConstraints calendarConstraints) {
        this.formatHint = str;
        this.dateFormat = dateFormat;
        this.textInputLayout = textInputLayout;
        this.constraints = calendarConstraints;
        this.outOfRange = textInputLayout.getContext().getString(C7090R.string.mtrl_picker_out_of_range);
        this.setErrorCallback = new Runnable() { // from class: com.google.android.material.datepicker.a
            @Override // java.lang.Runnable
            public final void run() {
                DateFormatTextWatcher.m13117b(this.f11832b, str);
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m13116a(DateFormatTextWatcher dateFormatTextWatcher, long j11) {
        dateFormatTextWatcher.getClass();
        dateFormatTextWatcher.textInputLayout.setError(String.format(dateFormatTextWatcher.outOfRange, dateFormatTextWatcher.sanitizeDateString(DateStrings.getDateString(j11))));
        dateFormatTextWatcher.onInvalidDate();
    }

    @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
    public void afterTextChanged(@NonNull Editable editable) {
        if (!Locale.getDefault().getLanguage().equals(Locale.KOREAN.getLanguage()) && editable.length() != 0 && editable.length() < this.formatHint.length() && editable.length() >= this.lastLength) {
            char cCharAt = this.formatHint.charAt(editable.length());
            if (!Character.isLetterOrDigit(cCharAt)) {
                editable.append(cCharAt);
            }
        }
    }

    @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
    public void beforeTextChanged(@NonNull CharSequence charSequence, int i11, int i12, int i13) {
        this.lastLength = charSequence.length();
    }

    public void runValidation(View view, Runnable runnable) {
        view.post(runnable);
    }

    public void onInvalidDate() {
    }
}
