package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pair;
import com.google.android.material.C7090R;
import com.google.android.material.timepicker.TimeModel;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes45.dex */
class MonthAdapter extends BaseAdapter {
    private static final int NO_DAY_NUMBER = -1;
    final CalendarConstraints calendarConstraints;
    CalendarStyle calendarStyle;
    final DateSelector<?> dateSelector;

    @Nullable
    final DayViewDecorator dayViewDecorator;
    final Month month;
    private Collection<Long> previouslySelectedDates;
    static final int MAXIMUM_WEEKS = UtcDates.getUtcCalendar().getMaximum(4);
    private static final int MAXIMUM_GRID_CELLS = (UtcDates.getUtcCalendar().getMaximum(5) + UtcDates.getUtcCalendar().getMaximum(7)) - 1;

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    public boolean isLastInRow(int i11) {
        return (i11 + 1) % this.month.daysInWeek == 0;
    }

    private void initializeStyles(Context context) {
        if (this.calendarStyle == null) {
            this.calendarStyle = new CalendarStyle(context);
        }
    }

    private boolean isSelected(long j11) {
        Iterator<Long> it = this.dateSelector.getSelectedDays().iterator();
        while (it.hasNext()) {
            if (UtcDates.canonicalYearMonthDay(j11) == UtcDates.canonicalYearMonthDay(it.next().longValue())) {
                return true;
            }
        }
        return false;
    }

    private void updateSelectedState(@Nullable TextView textView, long j11, int i11) {
        boolean zIsSelected;
        CalendarItemStyle calendarItemStyle;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        String dayContentDescription = getDayContentDescription(context, j11);
        textView.setContentDescription(dayContentDescription);
        boolean zIsValid = this.calendarConstraints.getDateValidator().isValid(j11);
        if (zIsValid) {
            textView.setEnabled(true);
            zIsSelected = isSelected(j11);
            textView.setSelected(zIsSelected);
            if (zIsSelected) {
                calendarItemStyle = this.calendarStyle.selectedDay;
            } else {
                calendarItemStyle = isToday(j11) ? this.calendarStyle.todayDay : this.calendarStyle.day;
            }
        } else {
            zIsSelected = false;
            textView.setEnabled(false);
            calendarItemStyle = this.calendarStyle.invalidDay;
        }
        boolean z11 = zIsSelected;
        DayViewDecorator dayViewDecorator = this.dayViewDecorator;
        if (dayViewDecorator == null || i11 == -1) {
            calendarItemStyle.styleItem(textView);
            return;
        }
        Month month = this.month;
        int i12 = month.year;
        int i13 = month.month;
        calendarItemStyle.styleItem(textView, dayViewDecorator.getBackgroundColor(context, i12, i13, i11, zIsValid, z11), this.dayViewDecorator.getTextColor(context, i12, i13, i11, zIsValid, z11));
        textView.setCompoundDrawables(this.dayViewDecorator.getCompoundDrawableLeft(context, i12, i13, i11, zIsValid, z11), this.dayViewDecorator.getCompoundDrawableTop(context, i12, i13, i11, zIsValid, z11), this.dayViewDecorator.getCompoundDrawableRight(context, i12, i13, i11, zIsValid, z11), this.dayViewDecorator.getCompoundDrawableBottom(context, i12, i13, i11, zIsValid, z11));
        textView.setContentDescription(this.dayViewDecorator.getContentDescription(context, i12, i13, i11, zIsValid, z11, dayContentDescription));
    }

    public int dayToPosition(int i11) {
        return firstPositionInMonth() + (i11 - 1);
    }

    public int firstPositionInMonth() {
        return this.month.daysFromStartOfWeekToFirstOfMonth(this.calendarConstraints.getFirstDayOfWeek());
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return MAXIMUM_GRID_CELLS;
    }

    @Override // android.widget.Adapter
    @Nullable
    public Long getItem(int i11) {
        if (i11 < firstPositionInMonth() || i11 > lastPositionInMonth()) {
            return null;
        }
        return Long.valueOf(this.month.getDay(positionToDay(i11)));
    }

    @Override // android.widget.Adapter
    public long getItemId(int i11) {
        return i11 / this.month.daysInWeek;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0054  */
    @Override // android.widget.Adapter
    @NonNull
    public TextView getView(int i11, @Nullable View view, @NonNull ViewGroup viewGroup) {
        int i12;
        initializeStyles(viewGroup.getContext());
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C7090R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int iFirstPositionInMonth = i11 - firstPositionInMonth();
        if (iFirstPositionInMonth >= 0) {
            Month month = this.month;
            if (iFirstPositionInMonth >= month.daysInMonth) {
                textView.setVisibility(8);
                textView.setEnabled(false);
                i12 = -1;
            } else {
                i12 = iFirstPositionInMonth + 1;
                textView.setTag(month);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, TimeModel.NUMBER_FORMAT, Integer.valueOf(i12)));
                textView.setVisibility(0);
                textView.setEnabled(true);
            }
        } else {
            textView.setVisibility(8);
            textView.setEnabled(false);
            i12 = -1;
        }
        Long item = getItem(i11);
        if (item == null) {
            return textView;
        }
        updateSelectedState(textView, item.longValue(), i12);
        return textView;
    }

    @VisibleForTesting
    public boolean isEndOfRange(long j11) {
        Iterator<Pair<Long, Long>> it = this.dateSelector.getSelectedRanges().iterator();
        while (it.hasNext()) {
            Long l11 = it.next().second;
            if (l11 != null && l11.longValue() == j11) {
                return true;
            }
        }
        return false;
    }

    public boolean isFirstInRow(int i11) {
        return i11 % this.month.daysInWeek == 0;
    }

    @VisibleForTesting
    public boolean isStartOfRange(long j11) {
        Iterator<Pair<Long, Long>> it = this.dateSelector.getSelectedRanges().iterator();
        while (it.hasNext()) {
            Long l11 = it.next().first;
            if (l11 != null && l11.longValue() == j11) {
                return true;
            }
        }
        return false;
    }

    public void updateSelectedStates(MaterialCalendarGridView materialCalendarGridView) {
        Iterator<Long> it = this.previouslySelectedDates.iterator();
        while (it.hasNext()) {
            updateSelectedStateForDate(materialCalendarGridView, it.next().longValue());
        }
        DateSelector<?> dateSelector = this.dateSelector;
        if (dateSelector != null) {
            Iterator<Long> it2 = dateSelector.getSelectedDays().iterator();
            while (it2.hasNext()) {
                updateSelectedStateForDate(materialCalendarGridView, it2.next().longValue());
            }
            this.previouslySelectedDates = this.dateSelector.getSelectedDays();
        }
    }

    public MonthAdapter(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints, @Nullable DayViewDecorator dayViewDecorator) {
        this.month = month;
        this.dateSelector = dateSelector;
        this.calendarConstraints = calendarConstraints;
        this.dayViewDecorator = dayViewDecorator;
        this.previouslySelectedDates = dateSelector.getSelectedDays();
    }

    private String getDayContentDescription(Context context, long j11) {
        return DateStrings.getDayContentDescription(context, j11, isToday(j11), isStartOfRange(j11), isEndOfRange(j11));
    }

    private boolean isToday(long j11) {
        if (UtcDates.getTodayCalendar().getTimeInMillis() == j11) {
            return true;
        }
        return false;
    }

    private void updateSelectedStateForDate(MaterialCalendarGridView materialCalendarGridView, long j11) {
        if (Month.create(j11).equals(this.month)) {
            int dayOfMonth = this.month.getDayOfMonth(j11);
            updateSelectedState((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().dayToPosition(dayOfMonth) - materialCalendarGridView.getFirstVisiblePosition()), j11, dayOfMonth);
        }
    }

    public int lastPositionInMonth() {
        return (firstPositionInMonth() + this.month.daysInMonth) - 1;
    }

    public int positionToDay(int i11) {
        return (i11 - firstPositionInMonth()) + 1;
    }

    public boolean withinMonth(int i11) {
        if (i11 >= firstPositionInMonth() && i11 <= lastPositionInMonth()) {
            return true;
        }
        return false;
    }
}
