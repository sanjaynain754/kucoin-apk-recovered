package com.google.android.material.datepicker;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.C7090R;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes45.dex */
class DaysOfWeekAdapter extends BaseAdapter {
    private static final int CALENDAR_DAY_STYLE;
    private static final int NARROW_FORMAT = 4;

    @NonNull
    private final Calendar calendar;
    private final int daysInWeek;
    private final int firstDayOfWeek;

    public DaysOfWeekAdapter() {
        Calendar utcCalendar = UtcDates.getUtcCalendar();
        this.calendar = utcCalendar;
        this.daysInWeek = utcCalendar.getMaximum(7);
        this.firstDayOfWeek = utcCalendar.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    @Nullable
    @SuppressLint({"WrongConstant"})
    public View getView(int i11, @Nullable View view, @NonNull ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C7090R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        this.calendar.set(7, positionToDayOfWeek(i11));
        textView.setText(this.calendar.getDisplayName(7, CALENDAR_DAY_STYLE, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(C7090R.string.mtrl_picker_day_of_week_column_header), this.calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    static {
        CALENDAR_DAY_STYLE = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    private int positionToDayOfWeek(int i11) {
        int i12 = i11 + this.firstDayOfWeek;
        int i13 = this.daysInWeek;
        return i12 > i13 ? i12 - i13 : i12;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.daysInWeek;
    }

    @Override // android.widget.Adapter
    @Nullable
    public Integer getItem(int i11) {
        if (i11 >= this.daysInWeek) {
            return null;
        }
        return Integer.valueOf(positionToDayOfWeek(i11));
    }

    @Override // android.widget.Adapter
    public long getItemId(int i11) {
        return 0L;
    }

    public DaysOfWeekAdapter(int i11) {
        Calendar utcCalendar = UtcDates.getUtcCalendar();
        this.calendar = utcCalendar;
        this.daysInWeek = utcCalendar.getMaximum(7);
        this.firstDayOfWeek = i11;
    }
}
