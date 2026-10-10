package com.sumsub.sns.internal.log;

import com.sumsub.log.logger.Logger;
import com.sumsub.sns.internal.log.logger.C33295a;
import com.sumsub.sns.internal.log.logger.C33296b;
import com.sumsub.sns.internal.log.logger.C33305k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p852kotlin.collections.CollectionsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.log.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33272c implements Logger {

    /* JADX INFO: renamed from: a */
    public static final C33272c f67812a = new C33272c();

    /* JADX INFO: renamed from: b */
    public static final HandlerC33271b f67813b = new HandlerC33271b();

    /* JADX INFO: renamed from: c */
    public static final C33305k f67814c;

    /* JADX INFO: renamed from: d */
    public static final ConcurrentHashMap f67815d;

    /* JADX INFO: renamed from: e */
    public static final C33270a f67816e;

    static {
        C33305k c33305k = new C33305k();
        f67814c = c33305k;
        f67815d = new ConcurrentHashMap();
        f67816e = new C33270a(new C33295a(), c33305k);
    }

    /* JADX INFO: renamed from: a */
    public static ArrayList m71617a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LoggerType loggerType = (LoggerType) it.next();
            Logger logger = (Logger) f67815d.get(loggerType);
            if (logger != null) {
                arrayList.add(logger);
            } else {
                Logger.DefaultImpls.e$default(f67814c, "L", "Failed to get logger for " + loggerType.name(), null, 4, null);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static C33296b m71618b(List list) {
        Set mutableSet = CollectionsKt.toMutableSet(f67814c.f67901a);
        mutableSet.addAll(m71617a(list));
        if (list.contains(LoggerType.KIBANA)) {
            mutableSet.add(f67816e.f67811b);
        }
        return new C33296b(mutableSet);
    }

    @Override // com.sumsub.log.logger.Logger
    /* JADX INFO: renamed from: d */
    public final void mo68955d(String str, String str2, Throwable th2) {
        f67814c.mo68955d(str, str2, th2);
    }

    @Override // com.sumsub.log.logger.Logger
    /* JADX INFO: renamed from: e */
    public final void mo68956e(String str, String str2, Throwable th2) {
        f67814c.mo68956e(str, str2, th2);
    }

    @Override // com.sumsub.log.logger.Logger
    /* JADX INFO: renamed from: i */
    public final void mo68957i(String str, String str2, Throwable th2) {
        f67814c.mo68957i(str, str2, th2);
    }

    @Override // com.sumsub.log.logger.Logger
    /* JADX INFO: renamed from: v */
    public final void mo68958v(String str, String str2, Throwable th2) {
        f67814c.mo68958v(str, str2, th2);
    }

    @Override // com.sumsub.log.logger.Logger
    /* JADX INFO: renamed from: w */
    public final void mo68959w(String str, String str2, Throwable th2) {
        f67814c.mo68959w(str, str2, th2);
    }
}
