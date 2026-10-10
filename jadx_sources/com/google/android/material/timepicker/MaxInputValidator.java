package com.google.android.material.timepicker;

import android.text.InputFilter;
import android.text.Spanned;

/* JADX INFO: loaded from: classes45.dex */
class MaxInputValidator implements InputFilter {
    private int max;

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i11, int i12, Spanned spanned, int i13, int i14) {
        try {
            StringBuilder sb2 = new StringBuilder(spanned);
            sb2.replace(i13, i14, charSequence.subSequence(i11, i12).toString());
            if (Integer.parseInt(sb2.toString()) <= this.max) {
                return null;
            }
            return "";
        } catch (NumberFormatException unused) {
            return "";
        }
    }

    public int getMax() {
        return this.max;
    }

    public void setMax(int i11) {
        this.max = i11;
    }

    public MaxInputValidator(int i11) {
        this.max = i11;
    }
}
