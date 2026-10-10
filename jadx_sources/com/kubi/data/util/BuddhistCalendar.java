package com.kubi.data.util;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes9.dex */
public class BuddhistCalendar extends GregorianCalendar {
    private static final long serialVersionUID = -8527488697350388578L;

    /* JADX INFO: renamed from: b */
    public transient int f21494b;

    public BuddhistCalendar() {
        this.f21494b = 543;
    }

    @Override // java.util.Calendar
    public int get(int i11) {
        return i11 == 1 ? super.get(i11) + this.f21494b : super.get(i11);
    }

    @Override // java.util.Calendar
    public void set(int i11, int i12) {
        if (i11 == 1) {
            super.set(i11, i12 - this.f21494b);
        } else {
            super.set(i11, i12);
        }
    }

    @Override // java.util.GregorianCalendar, java.util.Calendar
    public void add(int i11, int i12) {
        int i13 = this.f21494b;
        this.f21494b = 0;
        try {
            super.add(i11, i12);
        } finally {
            this.f21494b = i13;
        }
    }

    @Override // java.util.GregorianCalendar, java.util.Calendar
    public boolean equals(Object obj) {
        return (obj instanceof BuddhistCalendar) && super.equals(obj);
    }

    @Override // java.util.GregorianCalendar, java.util.Calendar
    public int getActualMaximum(int i11) {
        int i12 = this.f21494b;
        this.f21494b = 0;
        try {
            return super.getActualMaximum(i11);
        } finally {
            this.f21494b = i12;
        }
    }

    @Override // java.util.GregorianCalendar, java.util.Calendar
    public String getCalendarType() {
        return "buddhist";
    }

    @Override // java.util.GregorianCalendar, java.util.Calendar
    public void roll(int i11, int i12) {
        int i13 = this.f21494b;
        this.f21494b = 0;
        try {
            super.roll(i11, i12);
        } finally {
            this.f21494b = i13;
        }
    }

    public BuddhistCalendar(TimeZone timeZone) {
        super(timeZone);
        this.f21494b = 543;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f21494b = 543;
    }

    @Override // java.util.Calendar
    public String getDisplayName(int i11, int i12, Locale locale) {
        return super.getDisplayName(i11, i12, locale);
    }

    @Override // java.util.Calendar
    public Map<String, Integer> getDisplayNames(int i11, int i12, Locale locale) {
        return super.getDisplayNames(i11, i12, locale);
    }

    @Override // java.util.GregorianCalendar, java.util.Calendar
    public int hashCode() {
        return super.hashCode() ^ 543;
    }

    @Override // java.util.Calendar
    public String toString() {
        int iIndexOf;
        String string = super.toString();
        if (!isSet(1) || (iIndexOf = string.indexOf("YEAR=")) == -1) {
            return string;
        }
        int i11 = iIndexOf + 5;
        StringBuilder sb2 = new StringBuilder(string.substring(0, i11));
        while (true) {
            int i12 = i11 + 1;
            if (Character.isDigit(string.charAt(i11))) {
                i11 = i12;
            } else {
                sb2.append(internalGet(1) + 543);
                sb2.append(string.substring(i11));
                return sb2.toString();
            }
        }
    }

    public BuddhistCalendar(Locale locale) {
        super(locale);
        this.f21494b = 543;
    }

    public BuddhistCalendar(TimeZone timeZone, Locale locale) {
        super(timeZone, locale);
        this.f21494b = 543;
    }
}
