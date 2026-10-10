package qf0;

import android.text.Spanned;

/* JADX INFO: renamed from: qf0.c */
/* JADX INFO: compiled from: LeadingMarginUtils.java */
/* JADX INFO: loaded from: classes60.dex */
public abstract class AbstractC43728c {
    /* JADX INFO: renamed from: a */
    public static boolean m96339a(int i11, CharSequence charSequence, Object obj) {
        return (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanEnd(obj) == i11;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m96340b(int i11, CharSequence charSequence, Object obj) {
        return (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanStart(obj) == i11;
    }
}
