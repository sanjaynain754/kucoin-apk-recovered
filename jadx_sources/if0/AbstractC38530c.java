package if0;

import androidx.annotation.NonNull;
import androidx.media3.exoplayer.upstream.CmcdData;
import hh0.C38210b;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: if0.c */
/* JADX INFO: compiled from: CommonMarkEntities.java */
/* JADX INFO: loaded from: classes60.dex */
public abstract class AbstractC38530c {

    /* JADX INFO: renamed from: a */
    public static final Map<String, String> f86502a;

    static {
        Map<String, String> map;
        try {
            Field declaredField = C38210b.class.getDeclaredField(CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY);
            declaredField.setAccessible(true);
            map = (Map) declaredField.get(null);
        } catch (Throwable th2) {
            Map<String, String> map2 = Collections.EMPTY_MAP;
            th2.printStackTrace();
            map = map2;
        }
        f86502a = map;
    }

    /* JADX INFO: renamed from: a */
    public static int m87159a(@NonNull String str, @NonNull int[] iArr) {
        String str2 = f86502a.get(str);
        if (str2 == null) {
            return 0;
        }
        int length = str2.length();
        if (length == 1) {
            iArr[0] = str2.charAt(0);
            return length;
        }
        iArr[0] = str2.charAt(0);
        iArr[1] = str2.charAt(1);
        return length;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m87160b(@NonNull String str) {
        return f86502a.containsKey(str);
    }
}
