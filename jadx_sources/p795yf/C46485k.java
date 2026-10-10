package p795yf;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: yf.k */
/* JADX INFO: compiled from: TimeUtils.java */
/* JADX INFO: loaded from: classes13.dex */
public class C46485k {

    /* JADX INFO: renamed from: a */
    public static Map<String, ThreadLocal<SimpleDateFormat>> f104246a = new HashMap();

    /* JADX INFO: renamed from: a */
    public static Integer m102555a() {
        try {
            Calendar calendar = Calendar.getInstance(Locale.getDefault());
            return Integer.valueOf((-(calendar.get(15) + calendar.get(16))) / 60000);
        } catch (Exception e11) {
            C46481g.m102541d(e11);
            return null;
        }
    }
}
