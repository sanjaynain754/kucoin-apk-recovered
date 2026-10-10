package com.kubi.utils;

import android.text.InputFilter;
import android.text.Spanned;
import com.fasterxml.jackson.databind.node.C6447a;
import com.tencent.bugly.proguard.C33978va;
import java.math.BigDecimal;

/* JADX INFO: renamed from: com.kubi.utils.j0 */
/* JADX INFO: compiled from: PointLengthFilter.java */
/* JADX INFO: loaded from: classes54.dex */
public class C27056j0 implements InputFilter {

    /* JADX INFO: renamed from: a */
    public int f54341a;

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i11, int i12, Spanned spanned, int i13, int i14) {
        String strSubstring = charSequence.toString().substring(i11, i12);
        String strSubstring2 = spanned.toString().substring(i13, i14);
        if ("".equals(strSubstring)) {
            if (i13 == 0 && spanned.toString().indexOf(C33978va.f72339h) == i14) {
                return strSubstring2;
            }
            return null;
        }
        if (i13 == 0 && strSubstring.indexOf(C33978va.f72339h) == 0) {
            return "";
        }
        if (this.f54341a <= 0 && strSubstring.contains(C33978va.f72339h)) {
            return strSubstring.length() == 1 ? "" : strSubstring.substring(0, strSubstring.indexOf(C33978va.f72339h));
        }
        String[] strArrSplit = spanned.toString().split("\\.");
        if (strArrSplit.length > 1 && strArrSplit[1].length() >= this.f54341a && i13 > strArrSplit[0].length()) {
            return "";
        }
        if (strSubstring.length() <= 1 || !strSubstring.contains(C33978va.f72339h)) {
            return null;
        }
        try {
            return C6447a.m11724a(new BigDecimal(strSubstring).setScale(this.f54341a, 1)).toPlainString();
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    public C27056j0(int i11) {
        this.f54341a = i11;
    }
}
