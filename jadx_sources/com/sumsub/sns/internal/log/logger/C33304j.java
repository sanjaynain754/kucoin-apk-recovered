package com.sumsub.sns.internal.log.logger;

import android.util.Log;
import com.sumsub.log.logger.Logger;

/* JADX INFO: renamed from: com.sumsub.sns.internal.log.logger.j */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33304j implements Logger {

    /* JADX INFO: renamed from: a */
    public static final C33304j f67900a = new C33304j();

    @Override // com.sumsub.log.logger.Logger
    /* JADX INFO: renamed from: d */
    public final void mo68955d(String str, String str2, Throwable th2) {
        if (th2 == null) {
            Log.d(str, str2);
        } else {
            Log.d(str, str2, th2);
        }
    }

    @Override // com.sumsub.log.logger.Logger
    /* JADX INFO: renamed from: e */
    public final void mo68956e(String str, String str2, Throwable th2) {
        if (th2 == null) {
            Log.e(str, str2);
        } else {
            Log.e(str, str2, th2);
        }
    }

    @Override // com.sumsub.log.logger.Logger
    /* JADX INFO: renamed from: i */
    public final void mo68957i(String str, String str2, Throwable th2) {
        if (th2 == null) {
            Log.i(str, str2);
        } else {
            Log.i(str, str2, th2);
        }
    }

    @Override // com.sumsub.log.logger.Logger
    /* JADX INFO: renamed from: v */
    public final void mo68958v(String str, String str2, Throwable th2) {
        if (th2 == null) {
            Log.v(str, str2);
        } else {
            Log.v(str, str2, th2);
        }
    }

    @Override // com.sumsub.log.logger.Logger
    /* JADX INFO: renamed from: w */
    public final void mo68959w(String str, String str2, Throwable th2) {
        if (th2 == null) {
            Log.w(str, str2);
        } else {
            Log.w(str, str2, th2);
        }
    }
}
