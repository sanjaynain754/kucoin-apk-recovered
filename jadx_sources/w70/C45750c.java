package w70;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: w70.c */
/* JADX INFO: compiled from: LDPingParse.java */
/* JADX INFO: loaded from: classes54.dex */
public class C45750c {
    /* JADX INFO: renamed from: a */
    public static String m100999a(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        if (str2.contains("timeout")) {
            sb2.append("ping: cannot resolve " + str + ": Timeout");
        } else if (str2.contains("unknown")) {
            sb2.append("ping: cannot resolve " + str + ": Unknown host");
        } else {
            m101005g(str2, sb2);
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: b */
    public static String m101000b(String str) {
        Matcher matcher = Pattern.compile("(?<=\\()([\\d]+\\.)+[\\d]+(?=\\))").matcher(str);
        String strTrim = null;
        while (matcher.find()) {
            strTrim = matcher.group().trim();
        }
        return strTrim;
    }

    /* JADX INFO: renamed from: c */
    public static List<String> m101001c(String str) {
        ArrayList arrayList = new ArrayList();
        Matcher matcher = Pattern.compile("(?<=icmp_seq=)([0-9]+)(?=\\s)").matcher(str);
        while (matcher.find()) {
            arrayList.add(matcher.group().trim());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public static List<String> m101002d(String str) {
        ArrayList arrayList = new ArrayList();
        Matcher matcher = Pattern.compile("(?<=\\D)([\\s0-9]+)(?=bytes)").matcher(str);
        while (matcher.find()) {
            String strTrim = matcher.group().trim();
            if (matcher.group().trim().matches("\\d+")) {
                arrayList.add(strTrim);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public static List<String> m101003e(String str) {
        ArrayList arrayList = new ArrayList();
        Matcher matcher = Pattern.compile("(?<=ttl=)([0-9]+)(?=\\s)").matcher(str);
        while (matcher.find()) {
            arrayList.add(matcher.group().trim());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public static List<String> m101004f(String str) {
        ArrayList arrayList = new ArrayList();
        Matcher matcher = Pattern.compile("(?<==)([\\.0-9\\s]+)(?=ms)").matcher(str);
        while (matcher.find()) {
            arrayList.add(matcher.group().trim());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public static void m101005g(String str, StringBuilder sb2) {
        String strM101000b = m101000b(str);
        List<String> listM101002d = m101002d(str);
        List<String> listM101003e = m101003e(str);
        List<String> listM101004f = m101004f(str);
        List<String> listM101001c = m101001c(str);
        int size = listM101004f.size();
        int i11 = 0;
        while (true) {
            int i12 = size - 1;
            if (i11 < i12) {
                sb2.append(listM101002d.get(i11) + "bytes from " + strM101000b + ": icmp_seq=#" + listM101001c.get(i11) + " ttl=" + listM101003e.get(i11) + " time=" + listM101004f.get(i11) + "ms\n");
                i11++;
            } else {
                sb2.append(listM101002d.get(i12) + "bytes from " + strM101000b + ": icmp_seq=#" + listM101001c.get(i12) + " ttl=" + listM101003e.get(i12) + " time=" + listM101004f.get(i12) + "ms");
                return;
            }
        }
    }
}
