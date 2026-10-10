package kc0;

import com.tencentcloudapi.cls.android.cls.Cls$Log;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: kc0.g */
/* JADX INFO: compiled from: LogSizeCalculator.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC40990g {
    /* JADX INFO: renamed from: b */
    public static int m89787b(C40989f c40989f) {
        int length = 4;
        for (Cls$Log.Content content : c40989f.f91093a.m79339b()) {
            if (content.getKey() != null) {
                length += content.getKey().length();
            }
            if (content.getValue() != null) {
                length += content.getValue().length();
            }
        }
        return length;
    }

    /* JADX INFO: renamed from: a */
    public static int m89786a(List<C40989f> list) {
        Iterator<C40989f> it = list.iterator();
        int iM89787b = 0;
        while (it.hasNext()) {
            iM89787b += m89787b(it.next());
        }
        return iM89787b;
    }
}
