package com.blankj.utilcode.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.blankj.utilcode.util.l0 */
/* JADX INFO: compiled from: TimeUtils.java */
/* JADX INFO: loaded from: classes34.dex */
public final class C5281l0 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal<Map<String, SimpleDateFormat>> f6552a = new a();

    /* JADX INFO: renamed from: b */
    public static final String[] f6553b = {"猴", "鸡", "狗", "猪", "鼠", "牛", "虎", "兔", "龙", "蛇", "马", "羊"};

    /* JADX INFO: renamed from: c */
    public static final int[] f6554c = {20, 19, 21, 21, 21, 22, 23, 23, 23, 24, 23, 22};

    /* JADX INFO: renamed from: d */
    public static final String[] f6555d = {"水瓶座", "双鱼座", "白羊座", "金牛座", "双子座", "巨蟹座", "狮子座", "处女座", "天秤座", "天蝎座", "射手座", "魔羯座"};

    /* JADX INFO: renamed from: com.blankj.utilcode.util.l0$a */
    /* JADX INFO: compiled from: TimeUtils.java */
    public static class a extends ThreadLocal<Map<String, SimpleDateFormat>> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map<String, SimpleDateFormat> initialValue() {
            return new HashMap();
        }
    }

    /* JADX INFO: renamed from: a */
    public static long m6266a() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(13, 0);
        calendar.set(12, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m6267b(long j11) {
        long jM6266a = m6266a();
        if (j11 >= jM6266a && j11 < jM6266a + 86400000) {
            return true;
        }
        return false;
    }
}
