package hh0;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: hh0.b */
/* JADX INFO: compiled from: Html5Entities.java */
/* JADX INFO: loaded from: classes61.dex */
public class C38210b {

    /* JADX INFO: renamed from: a */
    public static final Map<String, String> f85911a = m86210b();

    /* JADX INFO: renamed from: b */
    public static final Pattern f85912b = Pattern.compile("^&#[Xx]?");

    /* JADX INFO: renamed from: b */
    public static Map<String, String> m86210b() {
        HashMap map = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(C38210b.class.getResourceAsStream("/org/commonmark/internal/util/entities.properties"), Charset.forName("UTF-8")));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        bufferedReader.close();
                        map.put("NewLine", ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                        return map;
                    }
                    if (line.length() != 0) {
                        int iIndexOf = line.indexOf("=");
                        map.put(line.substring(0, iIndexOf), line.substring(iIndexOf + 1));
                    }
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th4) {
                            th2.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
                throw new IllegalStateException("Failed reading data for HTML named character references", e);
            }
        } catch (IOException e11) {
            throw new IllegalStateException("Failed reading data for HTML named character references", e11);
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m86209a(String str) {
        int i11;
        Matcher matcher = f85912b.matcher(str);
        if (matcher.find()) {
            if (matcher.end() == 2) {
                i11 = 10;
            } else {
                i11 = 16;
            }
            try {
                int i12 = Integer.parseInt(str.substring(matcher.end(), str.length() - 1), i11);
                if (i12 == 0) {
                    return "�";
                }
                return new String(Character.toChars(i12));
            } catch (IllegalArgumentException unused) {
                return "�";
            }
        }
        String str2 = f85911a.get(str.substring(1, str.length() - 1));
        if (str2 != null) {
            return str2;
        }
        return str;
    }
}
