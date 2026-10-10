package com.dianping.logan;

import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: renamed from: com.dianping.logan.j */
/* JADX INFO: compiled from: Util.java */
/* JADX INFO: loaded from: classes.dex */
public class C5467j {

    /* JADX INFO: renamed from: a */
    public static final SimpleDateFormat f7498a = new SimpleDateFormat("yyyy-MM-dd");

    /* JADX INFO: renamed from: a */
    public static long m7549a() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            SimpleDateFormat simpleDateFormat = f7498a;
            return simpleDateFormat.parse(simpleDateFormat.format(new Date(jCurrentTimeMillis))).getTime();
        } catch (Exception e11) {
            e11.printStackTrace();
            return 0L;
        }
    }
}
