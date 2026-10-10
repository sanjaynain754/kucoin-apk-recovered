package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.C7090R;

/* JADX INFO: loaded from: classes45.dex */
class MonthsPagerAdapter extends RecyclerView.Adapter<ViewHolder> {

    @NonNull
    private final CalendarConstraints calendarConstraints;
    private final DateSelector<?> dateSelector;

    @Nullable
    private final DayViewDecorator dayViewDecorator;
    private final int itemHeight;
    private final MaterialCalendar.OnDayClickListener onDayClickListener;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final MaterialCalendarGridView monthGrid;
        final TextView monthTitle;

        public ViewHolder(@NonNull LinearLayout linearLayout, boolean z11) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(C7090R.id.month_title);
            this.monthTitle = textView;
            ViewCompat.setAccessibilityHeading(textView, true);
            this.monthGrid = (MaterialCalendarGridView) linearLayout.findViewById(C7090R.id.month_grid);
            if (!z11) {
                textView.setVisibility(8);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.calendarConstraints.getMonthSpan();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i11) {
        return this.calendarConstraints.getStart().monthsLater(i11).getStableId();
    }

    @NonNull
    public Month getPageMonth(int i11) {
        return this.calendarConstraints.getStart().monthsLater(i11);
    }

    public int getPosition(@NonNull Month month) {
        return this.calendarConstraints.getStart().monthsUntil(month);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i11) {
        Month monthMonthsLater = this.calendarConstraints.getStart().monthsLater(i11);
        viewHolder.monthTitle.setText(monthMonthsLater.getLongName());
        final MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) viewHolder.monthGrid.findViewById(C7090R.id.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !monthMonthsLater.equals(materialCalendarGridView.getAdapter().month)) {
            MonthAdapter monthAdapter = new MonthAdapter(monthMonthsLater, this.dateSelector, this.calendarConstraints, this.dayViewDecorator);
            materialCalendarGridView.setNumColumns(monthMonthsLater.daysInWeek);
            materialCalendarGridView.setAdapter((ListAdapter) monthAdapter);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().updateSelectedStates(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.google.android.material.datepicker.MonthsPagerAdapter.1
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i12, long j11) {
                if (materialCalendarGridView.getAdapter().withinMonth(i12)) {
                    MonthsPagerAdapter.this.onDayClickListener.onDayClick(materialCalendarGridView.getAdapter().getItem(i12).longValue());
                }
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i11) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C7090R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!MaterialDatePicker.isFullscreen(viewGroup.getContext())) {
            return new ViewHolder(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, this.itemHeight));
        return new ViewHolder(linearLayout, true);
    }

    public MonthsPagerAdapter(@NonNull Context context, DateSelector<?> dateSelector, @NonNull CalendarConstraints calendarConstraints, @Nullable DayViewDecorator dayViewDecorator, MaterialCalendar.OnDayClickListener onDayClickListener) {
        int dayHeight;
        Month start = calendarConstraints.getStart();
        Month end = calendarConstraints.getEnd();
        Month openAt = calendarConstraints.getOpenAt();
        if (start.compareTo(openAt) <= 0) {
            if (openAt.compareTo(end) <= 0) {
                int dayHeight2 = MonthAdapter.MAXIMUM_WEEKS * MaterialCalendar.getDayHeight(context);
                if (MaterialDatePicker.isFullscreen(context)) {
                    dayHeight = MaterialCalendar.getDayHeight(context);
                } else {
                    dayHeight = 0;
                }
                this.itemHeight = dayHeight2 + dayHeight;
                this.calendarConstraints = calendarConstraints;
                this.dateSelector = dateSelector;
                this.dayViewDecorator = dayViewDecorator;
                this.onDayClickListener = onDayClickListener;
                setHasStableIds(true);
                return;
            }
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        throw new IllegalArgumentException("firstPage cannot be after currentPage");
    }

    @NonNull
    public CharSequence getPageTitle(int i11) {
        return getPageMonth(i11).getLongName();
    }
}
