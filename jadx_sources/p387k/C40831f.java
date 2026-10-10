package p387k;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.tencent.bugly.proguard.C33627eb;

/* JADX INFO: renamed from: k.f */
/* JADX INFO: loaded from: classes23.dex */
public class C40831f {
    /* JADX INFO: renamed from: b */
    public static String m89345b(String str) {
        int i11;
        int i12;
        if (str == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder(str);
        if (str.equals("")) {
            return null;
        }
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < str.length(); i15++) {
            char cCharAt = str.charAt(i15);
            if (cCharAt == '{' || cCharAt == '[') {
                i11 = i14 + 4;
                sb2.insert(i15 + i13 + 1, ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + m89344a(i11));
                i12 = i14 + 5;
            } else {
                if (cCharAt == ',') {
                    sb2.insert(i15 + i13 + 1, ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + m89344a(i14));
                    i13 += i14 + 1;
                } else if (cCharAt == '}' || cCharAt == ']') {
                    i11 = i14 - 4;
                    sb2.insert(i15 + i13, ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + m89344a(i11));
                    i12 = i14 + (-3);
                }
            }
            i13 += i12;
            i14 = i11;
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: a */
    public static String m89344a(int i11) {
        StringBuilder sb2 = new StringBuilder();
        for (int i12 = 0; i12 < i11; i12++) {
            sb2.append(C33627eb.f69716f);
        }
        return sb2.toString();
    }
}
