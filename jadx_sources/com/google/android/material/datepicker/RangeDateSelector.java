package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.util.Pair;
import androidx.core.util.Preconditions;
import com.google.android.material.C7090R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ManufacturerUtils;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.textfield.TextInputLayout;
import com.tencent.bugly.proguard.C33627eb;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes45.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class RangeDateSelector implements DateSelector<Pair<Long, Long>> {
    public static final Parcelable.Creator<RangeDateSelector> CREATOR = new Parcelable.Creator<RangeDateSelector>() { // from class: com.google.android.material.datepicker.RangeDateSelector.3
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NonNull
        public RangeDateSelector createFromParcel(@NonNull Parcel parcel) {
            RangeDateSelector rangeDateSelector = new RangeDateSelector();
            rangeDateSelector.selectedStartItem = (Long) parcel.readValue(Long.class.getClassLoader());
            rangeDateSelector.selectedEndItem = (Long) parcel.readValue(Long.class.getClassLoader());
            return rangeDateSelector;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NonNull
        public RangeDateSelector[] newArray(int i11) {
            return new RangeDateSelector[i11];
        }
    };

    @Nullable
    private CharSequence error;
    private String invalidRangeStartError;

    @Nullable
    private SimpleDateFormat textInputFormat;
    private final String invalidRangeEndError = C33627eb.f69716f;

    @Nullable
    private Long selectedStartItem = null;

    @Nullable
    private Long selectedEndItem = null;

    @Nullable
    private Long proposedTextStart = null;

    @Nullable
    private Long proposedTextEnd = null;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private boolean isValidRange(long j11, long j12) {
        return j11 <= j12;
    }

    private void setInvalidRange(@NonNull TextInputLayout textInputLayout, @NonNull TextInputLayout textInputLayout2) {
        textInputLayout.setError(this.invalidRangeStartError);
        textInputLayout2.setError(C33627eb.f69716f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateIfValidTextProposal(@NonNull TextInputLayout textInputLayout, @NonNull TextInputLayout textInputLayout2, @NonNull OnSelectionChangedListener<Pair<Long, Long>> onSelectionChangedListener) {
        Long l11 = this.proposedTextStart;
        if (l11 == null || this.proposedTextEnd == null) {
            clearInvalidRange(textInputLayout, textInputLayout2);
            onSelectionChangedListener.onIncompleteSelectionChanged();
        } else if (isValidRange(l11.longValue(), this.proposedTextEnd.longValue())) {
            this.selectedStartItem = this.proposedTextStart;
            this.selectedEndItem = this.proposedTextEnd;
            onSelectionChangedListener.onSelectionChanged(getSelection());
        } else {
            setInvalidRange(textInputLayout, textInputLayout2);
            onSelectionChangedListener.onIncompleteSelectionChanged();
        }
        updateError(textInputLayout, textInputLayout2);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int getDefaultTitleResId() {
        return C7090R.string.mtrl_picker_range_header_title;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @Nullable
    public String getError() {
        if (TextUtils.isEmpty(this.error)) {
            return null;
        }
        return this.error.toString();
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public Collection<Long> getSelectedDays() {
        ArrayList arrayList = new ArrayList();
        Long l11 = this.selectedStartItem;
        if (l11 != null) {
            arrayList.add(l11);
        }
        Long l12 = this.selectedEndItem;
        if (l12 != null) {
            arrayList.add(l12);
        }
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public Collection<Pair<Long, Long>> getSelectedRanges() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair(this.selectedStartItem, this.selectedEndItem));
        return arrayList;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public Pair<Long, Long> getSelection() {
        return new Pair<>(this.selectedStartItem, this.selectedEndItem);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public boolean isSelectionComplete() {
        Long l11 = this.selectedStartItem;
        return (l11 == null || this.selectedEndItem == null || !isValidRange(l11.longValue(), this.selectedEndItem.longValue())) ? false : true;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public View onCreateTextInputView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle, CalendarConstraints calendarConstraints, @NonNull final OnSelectionChangedListener<Pair<Long, Long>> onSelectionChangedListener) {
        View viewInflate = layoutInflater.inflate(C7090R.layout.mtrl_picker_text_input_date_range, viewGroup, false);
        final TextInputLayout textInputLayout = (TextInputLayout) viewInflate.findViewById(C7090R.id.mtrl_picker_text_input_range_start);
        final TextInputLayout textInputLayout2 = (TextInputLayout) viewInflate.findViewById(C7090R.id.mtrl_picker_text_input_range_end);
        EditText editText = textInputLayout.getEditText();
        EditText editText2 = textInputLayout2.getEditText();
        Integer colorOrNull = MaterialColors.getColorOrNull(viewInflate.getContext(), C7090R.attr.colorOnSurfaceVariant);
        if (colorOrNull != null) {
            editText.setHintTextColor(colorOrNull.intValue());
            editText2.setHintTextColor(colorOrNull.intValue());
        }
        if (ManufacturerUtils.isDateInputKeyboardMissingSeparatorCharacters()) {
            editText.setInputType(17);
            editText2.setInputType(17);
        }
        this.invalidRangeStartError = viewInflate.getResources().getString(C7090R.string.mtrl_picker_invalid_range);
        SimpleDateFormat defaultTextInputFormat = this.textInputFormat;
        boolean z11 = defaultTextInputFormat != null;
        if (!z11) {
            defaultTextInputFormat = UtcDates.getDefaultTextInputFormat();
        }
        SimpleDateFormat simpleDateFormat = defaultTextInputFormat;
        Long l11 = this.selectedStartItem;
        if (l11 != null) {
            editText.setText(simpleDateFormat.format(l11));
            this.proposedTextStart = this.selectedStartItem;
        }
        Long l12 = this.selectedEndItem;
        if (l12 != null) {
            editText2.setText(simpleDateFormat.format(l12));
            this.proposedTextEnd = this.selectedEndItem;
        }
        String pattern = z11 ? simpleDateFormat.toPattern() : UtcDates.getDefaultTextInputHint(viewInflate.getResources(), simpleDateFormat);
        textInputLayout.setPlaceholderText(pattern);
        textInputLayout2.setPlaceholderText(pattern);
        editText.addTextChangedListener(new DateFormatTextWatcher(pattern, simpleDateFormat, textInputLayout, calendarConstraints) { // from class: com.google.android.material.datepicker.RangeDateSelector.1
            @Override // com.google.android.material.datepicker.DateFormatTextWatcher
            public void onInvalidDate() {
                RangeDateSelector.this.proposedTextStart = null;
                RangeDateSelector.this.updateIfValidTextProposal(textInputLayout, textInputLayout2, onSelectionChangedListener);
            }

            @Override // com.google.android.material.datepicker.DateFormatTextWatcher
            public void onValidDate(@Nullable Long l13) {
                RangeDateSelector.this.proposedTextStart = l13;
                RangeDateSelector.this.updateIfValidTextProposal(textInputLayout, textInputLayout2, onSelectionChangedListener);
            }
        });
        editText2.addTextChangedListener(new DateFormatTextWatcher(pattern, simpleDateFormat, textInputLayout2, calendarConstraints) { // from class: com.google.android.material.datepicker.RangeDateSelector.2
            @Override // com.google.android.material.datepicker.DateFormatTextWatcher
            public void onInvalidDate() {
                RangeDateSelector.this.proposedTextEnd = null;
                RangeDateSelector.this.updateIfValidTextProposal(textInputLayout, textInputLayout2, onSelectionChangedListener);
            }

            @Override // com.google.android.material.datepicker.DateFormatTextWatcher
            public void onValidDate(@Nullable Long l13) {
                RangeDateSelector.this.proposedTextEnd = l13;
                RangeDateSelector.this.updateIfValidTextProposal(textInputLayout, textInputLayout2, onSelectionChangedListener);
            }
        });
        if (!DateSelector.isTouchExplorationEnabled(viewInflate.getContext())) {
            DateSelector.showKeyboardWithAutoHideBehavior(editText, editText2);
        }
        return viewInflate;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void select(long j11) {
        Long l11 = this.selectedStartItem;
        if (l11 == null) {
            this.selectedStartItem = Long.valueOf(j11);
        } else if (this.selectedEndItem == null && isValidRange(l11.longValue(), j11)) {
            this.selectedEndItem = Long.valueOf(j11);
        } else {
            this.selectedEndItem = null;
            this.selectedStartItem = Long.valueOf(j11);
        }
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void setSelection(@NonNull Pair<Long, Long> pair) {
        Long l11 = pair.first;
        if (l11 != null && pair.second != null) {
            Preconditions.checkArgument(isValidRange(l11.longValue(), pair.second.longValue()));
        }
        Long l12 = pair.first;
        this.selectedStartItem = l12 == null ? null : Long.valueOf(UtcDates.canonicalYearMonthDay(l12.longValue()));
        Long l13 = pair.second;
        this.selectedEndItem = l13 != null ? Long.valueOf(UtcDates.canonicalYearMonthDay(l13.longValue())) : null;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void setTextInputFormat(@Nullable SimpleDateFormat simpleDateFormat) {
        if (simpleDateFormat != null) {
            simpleDateFormat = (SimpleDateFormat) UtcDates.getNormalizedFormat(simpleDateFormat);
        }
        this.textInputFormat = simpleDateFormat;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        parcel.writeValue(this.selectedStartItem);
        parcel.writeValue(this.selectedEndItem);
    }

    private void clearInvalidRange(@NonNull TextInputLayout textInputLayout, @NonNull TextInputLayout textInputLayout2) {
        if (textInputLayout.getError() != null && this.invalidRangeStartError.contentEquals(textInputLayout.getError())) {
            textInputLayout.setError(null);
        }
        if (textInputLayout2.getError() != null && C33627eb.f69716f.contentEquals(textInputLayout2.getError())) {
            textInputLayout2.setError(null);
        }
    }

    private void updateError(@NonNull TextInputLayout textInputLayout, @NonNull TextInputLayout textInputLayout2) {
        if (!TextUtils.isEmpty(textInputLayout.getError())) {
            this.error = textInputLayout.getError();
        } else if (!TextUtils.isEmpty(textInputLayout2.getError())) {
            this.error = textInputLayout2.getError();
        } else {
            this.error = null;
        }
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int getDefaultThemeResId(@NonNull Context context) {
        int i11;
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        if (Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) > resources.getDimensionPixelSize(C7090R.dimen.mtrl_calendar_maximum_default_fullscreen_minor_axis)) {
            i11 = C7090R.attr.materialCalendarTheme;
        } else {
            i11 = C7090R.attr.materialCalendarFullscreenTheme;
        }
        return MaterialAttributes.resolveOrThrow(context, i11, MaterialDatePicker.class.getCanonicalName());
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public String getSelectionContentDescription(@NonNull Context context) {
        String string;
        String string2;
        Resources resources = context.getResources();
        Pair<String, String> dateRangeString = DateStrings.getDateRangeString(this.selectedStartItem, this.selectedEndItem);
        String str = dateRangeString.first;
        if (str == null) {
            string = resources.getString(C7090R.string.mtrl_picker_announce_current_selection_none);
        } else {
            string = str;
        }
        String str2 = dateRangeString.second;
        if (str2 == null) {
            string2 = resources.getString(C7090R.string.mtrl_picker_announce_current_selection_none);
        } else {
            string2 = str2;
        }
        return resources.getString(C7090R.string.mtrl_picker_announce_current_range_selection, string, string2);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public String getSelectionDisplayString(@NonNull Context context) {
        Resources resources = context.getResources();
        Long l11 = this.selectedStartItem;
        if (l11 == null && this.selectedEndItem == null) {
            return resources.getString(C7090R.string.mtrl_picker_range_header_unselected);
        }
        Long l12 = this.selectedEndItem;
        if (l12 == null) {
            return resources.getString(C7090R.string.mtrl_picker_range_header_only_start_selected, DateStrings.getDateString(l11.longValue()));
        }
        if (l11 == null) {
            return resources.getString(C7090R.string.mtrl_picker_range_header_only_end_selected, DateStrings.getDateString(l12.longValue()));
        }
        Pair<String, String> dateRangeString = DateStrings.getDateRangeString(l11, l12);
        return resources.getString(C7090R.string.mtrl_picker_range_header_selected, dateRangeString.first, dateRangeString.second);
    }
}
