package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.util.Pair;
import com.google.android.material.C7090R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ManufacturerUtils;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.textfield.TextInputLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes45.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class SingleDateSelector implements DateSelector<Long> {
    public static final Parcelable.Creator<SingleDateSelector> CREATOR = new Parcelable.Creator<SingleDateSelector>() { // from class: com.google.android.material.datepicker.SingleDateSelector.2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NonNull
        public SingleDateSelector createFromParcel(@NonNull Parcel parcel) {
            SingleDateSelector singleDateSelector = new SingleDateSelector();
            singleDateSelector.selectedItem = (Long) parcel.readValue(Long.class.getClassLoader());
            return singleDateSelector;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NonNull
        public SingleDateSelector[] newArray(int i11) {
            return new SingleDateSelector[i11];
        }
    };

    @Nullable
    private CharSequence error;

    @Nullable
    private Long selectedItem;

    @Nullable
    private SimpleDateFormat textInputFormat;

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelection() {
        this.selectedItem = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int getDefaultThemeResId(Context context) {
        return MaterialAttributes.resolveOrThrow(context, C7090R.attr.materialCalendarTheme, MaterialDatePicker.class.getCanonicalName());
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int getDefaultTitleResId() {
        return C7090R.string.mtrl_picker_date_header_title;
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
        Long l11 = this.selectedItem;
        if (l11 != null) {
            arrayList.add(l11);
        }
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public Collection<Pair<Long, Long>> getSelectedRanges() {
        return new ArrayList();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.material.datepicker.DateSelector
    @Nullable
    public Long getSelection() {
        return this.selectedItem;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public boolean isSelectionComplete() {
        return this.selectedItem != null;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public View onCreateTextInputView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle, CalendarConstraints calendarConstraints, @NonNull final OnSelectionChangedListener<Long> onSelectionChangedListener) {
        View viewInflate = layoutInflater.inflate(C7090R.layout.mtrl_picker_text_input_date, viewGroup, false);
        final TextInputLayout textInputLayout = (TextInputLayout) viewInflate.findViewById(C7090R.id.mtrl_picker_text_input_date);
        EditText editText = textInputLayout.getEditText();
        Integer colorOrNull = MaterialColors.getColorOrNull(viewInflate.getContext(), C7090R.attr.colorOnSurfaceVariant);
        if (colorOrNull != null) {
            editText.setHintTextColor(colorOrNull.intValue());
        }
        if (ManufacturerUtils.isDateInputKeyboardMissingSeparatorCharacters()) {
            editText.setInputType(17);
        }
        SimpleDateFormat defaultTextInputFormat = this.textInputFormat;
        boolean z11 = defaultTextInputFormat != null;
        if (!z11) {
            defaultTextInputFormat = UtcDates.getDefaultTextInputFormat();
        }
        SimpleDateFormat simpleDateFormat = defaultTextInputFormat;
        String pattern = z11 ? simpleDateFormat.toPattern() : UtcDates.getDefaultTextInputHint(viewInflate.getResources(), simpleDateFormat);
        textInputLayout.setPlaceholderText(pattern);
        Long l11 = this.selectedItem;
        if (l11 != null) {
            editText.setText(simpleDateFormat.format(l11));
        }
        editText.addTextChangedListener(new DateFormatTextWatcher(pattern, simpleDateFormat, textInputLayout, calendarConstraints) { // from class: com.google.android.material.datepicker.SingleDateSelector.1
            @Override // com.google.android.material.datepicker.DateFormatTextWatcher
            public void onInvalidDate() {
                SingleDateSelector.this.error = textInputLayout.getError();
                onSelectionChangedListener.onIncompleteSelectionChanged();
            }

            @Override // com.google.android.material.datepicker.DateFormatTextWatcher
            public void onValidDate(@Nullable Long l12) {
                if (l12 == null) {
                    SingleDateSelector.this.clearSelection();
                } else {
                    SingleDateSelector.this.select(l12.longValue());
                }
                SingleDateSelector.this.error = null;
                onSelectionChangedListener.onSelectionChanged(SingleDateSelector.this.getSelection());
            }
        });
        if (!DateSelector.isTouchExplorationEnabled(viewInflate.getContext())) {
            DateSelector.showKeyboardWithAutoHideBehavior(editText);
        }
        return viewInflate;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void setSelection(@Nullable Long l11) {
        this.selectedItem = l11 == null ? null : Long.valueOf(UtcDates.canonicalYearMonthDay(l11.longValue()));
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
        parcel.writeValue(this.selectedItem);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public String getSelectionContentDescription(@NonNull Context context) {
        String yearMonthDay;
        Resources resources = context.getResources();
        Long l11 = this.selectedItem;
        if (l11 == null) {
            yearMonthDay = resources.getString(C7090R.string.mtrl_picker_announce_current_selection_none);
        } else {
            yearMonthDay = DateStrings.getYearMonthDay(l11.longValue());
        }
        return resources.getString(C7090R.string.mtrl_picker_announce_current_selection, yearMonthDay);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public String getSelectionDisplayString(@NonNull Context context) {
        Resources resources = context.getResources();
        Long l11 = this.selectedItem;
        if (l11 == null) {
            return resources.getString(C7090R.string.mtrl_picker_date_header_unselected);
        }
        return resources.getString(C7090R.string.mtrl_picker_date_header_selected, DateStrings.getYearMonthDay(l11.longValue()));
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void select(long j11) {
        this.selectedItem = Long.valueOf(j11);
    }
}
