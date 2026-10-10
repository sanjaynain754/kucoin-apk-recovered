package com.sumsub.sns.internal.log.logger;

import android.util.Log;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.internal.log.AbstractC33293d;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: renamed from: com.sumsub.sns.internal.log.logger.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33295a implements Logger {

    /* JADX INFO: renamed from: c */
    public static final SimpleDateFormat f67872c = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.ROOT);

    /* JADX INFO: renamed from: a */
    public final ArrayList f67873a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public C33303i f67874b;

    /* JADX INFO: renamed from: a */
    public final synchronized void m71625a() {
        C33303i c33303i;
        try {
            if (!this.f67873a.isEmpty() && (c33303i = this.f67874b) != null) {
                StringBuilder sb2 = new StringBuilder();
                ArrayList arrayList = this.f67873a;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    sb2.append((String) obj);
                    sb2.append('\n');
                }
                this.f67873a.clear();
                Logger.DefaultImpls.i$default(c33303i, "MsdkBatchLogger", sb2.toString(), null, 4, null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.sumsub.log.logger.Logger
    /* JADX INFO: renamed from: d */
    public final void mo68955d(String str, String str2, Throwable th2) {
        m71626a(3, str, str2, th2);
    }

    @Override // com.sumsub.log.logger.Logger
    /* JADX INFO: renamed from: e */
    public final void mo68956e(String str, String str2, Throwable th2) {
        m71626a(6, str, str2, th2);
    }

    @Override // com.sumsub.log.logger.Logger
    /* JADX INFO: renamed from: i */
    public final void mo68957i(String str, String str2, Throwable th2) {
        m71626a(4, str, str2, th2);
    }

    @Override // com.sumsub.log.logger.Logger
    /* JADX INFO: renamed from: v */
    public final void mo68958v(String str, String str2, Throwable th2) {
        m71626a(2, str, str2, th2);
    }

    @Override // com.sumsub.log.logger.Logger
    /* JADX INFO: renamed from: w */
    public final void mo68959w(String str, String str2, Throwable th2) {
        m71626a(5, str, str2, th2);
    }

    /* JADX INFO: renamed from: a */
    public final void m71626a(int i11, String str, String str2, Throwable th2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f67872c.format(new Date()).toString());
        sb2.append(' ');
        sb2.append((String) AbstractC33293d.f67871a.get(Integer.valueOf(i11)));
        sb2.append('/');
        sb2.append(str);
        sb2.append(": ");
        sb2.append(str2);
        if (th2 != null) {
            sb2.append('\n');
            sb2.append(Log.getStackTraceString(th2));
        }
        String string = sb2.toString();
        synchronized (this) {
            this.f67873a.add(string);
        }
    }
}
