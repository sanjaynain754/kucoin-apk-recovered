package com.tencent.bugly.proguard;

import com.tencent.rmonitor.common.logger.Logger;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.yg */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C34044yg {

    /* JADX INFO: renamed from: a */
    public static final String f72572a = "RMonitor_TStackInfoParser";

    /* JADX INFO: renamed from: a */
    public static ArrayList<C34024xg> m75538a(String str) {
        if (str == null) {
            return null;
        }
        ArrayList<C34024xg> arrayList = new ArrayList<>();
        for (String str2 : str.split(RunnableC33958ua.f72251f)) {
            String[] strArrSplit = str2.split("%");
            if (strArrSplit != null && strArrSplit.length == 5) {
                try {
                    C34024xg c34024xg = new C34024xg();
                    c34024xg.f72529c = Long.parseLong(strArrSplit[0]);
                    c34024xg.f72530d = Long.parseLong(strArrSplit[1]);
                    c34024xg.f72531e = Long.parseLong(strArrSplit[2]);
                    c34024xg.f72532f = Long.parseLong(strArrSplit[3]);
                    c34024xg.f72528b = strArrSplit[4];
                    arrayList.add(c34024xg);
                } catch (Throwable th2) {
                    Logger.INSTANCE.exception(f72572a, th2);
                }
            }
        }
        return arrayList;
    }
}
