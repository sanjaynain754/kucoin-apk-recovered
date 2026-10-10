package com.sumsub.sns.internal.log.logger;

import com.sumsub.log.logger.Logger;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.sumsub.sns.internal.log.logger.k */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33305k implements Logger {

    /* JADX INFO: renamed from: a */
    public final CopyOnWriteArrayList f67901a = new CopyOnWriteArrayList();

    @Override // com.sumsub.log.logger.Logger
    /* JADX INFO: renamed from: d */
    public final void mo68955d(String str, String str2, Throwable th2) {
        Iterator it = this.f67901a.iterator();
        while (it.hasNext()) {
            ((Logger) it.next()).mo68955d(str, str2, th2);
        }
    }

    @Override // com.sumsub.log.logger.Logger
    /* JADX INFO: renamed from: e */
    public final void mo68956e(String str, String str2, Throwable th2) {
        Iterator it = this.f67901a.iterator();
        while (it.hasNext()) {
            ((Logger) it.next()).mo68956e(str, str2, th2);
        }
    }

    @Override // com.sumsub.log.logger.Logger
    /* JADX INFO: renamed from: i */
    public final void mo68957i(String str, String str2, Throwable th2) {
        Iterator it = this.f67901a.iterator();
        while (it.hasNext()) {
            ((Logger) it.next()).mo68957i(str, str2, th2);
        }
    }

    @Override // com.sumsub.log.logger.Logger
    /* JADX INFO: renamed from: v */
    public final void mo68958v(String str, String str2, Throwable th2) {
        Iterator it = this.f67901a.iterator();
        while (it.hasNext()) {
            ((Logger) it.next()).mo68958v(str, str2, th2);
        }
    }

    @Override // com.sumsub.log.logger.Logger
    /* JADX INFO: renamed from: w */
    public final void mo68959w(String str, String str2, Throwable th2) {
        Iterator it = this.f67901a.iterator();
        while (it.hasNext()) {
            ((Logger) it.next()).mo68959w(str, str2, th2);
        }
    }
}
