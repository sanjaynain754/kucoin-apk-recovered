package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: classes45.dex */
final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new Parcelable.Creator<Month>() { // from class: com.google.android.material.datepicker.Month.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NonNull
        public Month createFromParcel(@NonNull Parcel parcel) {
            return Month.create(parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NonNull
        public Month[] newArray(int i11) {
            return new Month[i11];
        }
    };
    final int daysInMonth;
    final int daysInWeek;

    @NonNull
    private final Calendar firstOfMonth;

    @Nullable
    private String longName;
    final int month;
    final long timeInMillis;
    final int year;

    @NonNull
    public static Month create(long j11) {
        Calendar utcCalendar = UtcDates.getUtcCalendar();
        utcCalendar.setTimeInMillis(j11);
        return new Month(utcCalendar);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        return this.month == month.month && this.year == month.year;
    }

    @NonNull
    public static Month current() {
        return new Month(UtcDates.getTodayCalendar());
    }

    @Override // java.lang.Comparable
    public int compareTo(@NonNull Month month) {
        return this.firstOfMonth.compareTo(month.firstOfMonth);
    }

    public int daysFromStartOfWeekToFirstOfMonth(int i11) {
        int i12 = this.firstOfMonth.get(7);
        if (i11 <= 0) {
            i11 = this.firstOfMonth.getFirstDayOfWeek();
        }
        int i13 = i12 - i11;
        return i13 < 0 ? i13 + this.daysInWeek : i13;
    }

    public long getDay(int i11) {
        Calendar dayCopy = UtcDates.getDayCopy(this.firstOfMonth);
        dayCopy.set(5, i11);
        return dayCopy.getTimeInMillis();
    }

    public int getDayOfMonth(long j11) {
        Calendar dayCopy = UtcDates.getDayCopy(this.firstOfMonth);
        dayCopy.setTimeInMillis(j11);
        return dayCopy.get(5);
    }

    @NonNull
    public String getLongName() {
        if (this.longName == null) {
            this.longName = DateStrings.getYearMonth(this.firstOfMonth.getTimeInMillis());
        }
        return this.longName;
    }

    public long getStableId() {
        return this.firstOfMonth.getTimeInMillis();
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.month), Integer.valueOf(this.year)});
    }

    @NonNull
    public Month monthsLater(int i11) {
        Calendar dayCopy = UtcDates.getDayCopy(this.firstOfMonth);
        dayCopy.add(2, i11);
        return new Month(dayCopy);
    }

    public int monthsUntil(@NonNull Month month) {
        if (this.firstOfMonth instanceof GregorianCalendar) {
            return ((month.year - this.year) * 12) + (month.month - this.month);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        parcel.writeInt(this.year);
        parcel.writeInt(this.month);
    }

    private Month(@NonNull Calendar calendar) {
        calendar.set(5, 1);
        Calendar dayCopy = UtcDates.getDayCopy(calendar);
        this.firstOfMonth = dayCopy;
        this.month = dayCopy.get(2);
        this.year = dayCopy.get(1);
        this.daysInWeek = dayCopy.getMaximum(7);
        this.daysInMonth = dayCopy.getActualMaximum(5);
        this.timeInMillis = dayCopy.getTimeInMillis();
    }

    @NonNull
    public static Month create(int i11, int i12) {
        Calendar utcCalendar = UtcDates.getUtcCalendar();
        utcCalendar.set(1, i11);
        utcCalendar.set(2, i12);
        return new Month(utcCalendar);
    }
}
