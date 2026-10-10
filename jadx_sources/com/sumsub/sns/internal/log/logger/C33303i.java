package com.sumsub.sns.internal.log.logger;

import android.util.Log;
import androidx.camera.core.CameraInfo;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.internal.core.domain.InterfaceC28584k;
import com.sumsub.sns.internal.features.data.model.common.LogParams;
import com.sumsub.sns.internal.features.data.repository.log.C30002b;
import com.sumsub.sns.internal.log.AbstractC33293d;
import com.sumsub.sns.internal.log.cacher.AbstractC33277e;
import com.sumsub.sns.internal.log.cacher.C33284l;
import java.io.File;
import java.util.concurrent.Executors;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41718o1;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.sumsub.sns.internal.log.logger.i */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33303i implements Logger {

    /* JADX INFO: renamed from: c */
    public static final InterfaceC41709m0 f67897c = C41713n0.m91125a(C41718o1.m91179c(Executors.newSingleThreadExecutor()));

    /* JADX INFO: renamed from: a */
    public final InterfaceC28584k f67898a;

    /* JADX INFO: renamed from: b */
    public final C33284l f67899b;

    public C33303i(C30002b c30002b, InterfaceC28584k interfaceC28584k, File file) {
        C33284l c33284l = new C33284l("KibanaLogger", new C33301g(c30002b), file, 28);
        AbstractC33277e.f67822b.add(c33284l);
        this.f67898a = interfaceC28584k;
        this.f67899b = c33284l;
    }

    /* JADX INFO: renamed from: a */
    public final LogParams m71627a(int i11, String str, String str2, Throwable th2) {
        String stackTraceString;
        String str3 = (String) this.f67898a.mo69412b();
        if (str3 == null) {
            str3 = CameraInfo.IMPLEMENTATION_TYPE_UNKNOWN;
        }
        String str4 = str3;
        String str5 = AbstractC33293d.f67871a.get(Integer.valueOf(i11)) + "/" + str2;
        if (th2 == null || (stackTraceString = Log.getStackTraceString(th2)) == null) {
            stackTraceString = "";
        }
        return new LogParams((String) null, str, (String) null, "KibanaLogger.kt", str4, str5, (String) null, stackTraceString, 65, (DefaultConstructorMarker) null);
    }

    @Override // com.sumsub.log.logger.Logger
    /* JADX INFO: renamed from: d */
    public final void mo68955d(String str, String str2, Throwable th2) {
        C41696j.m91104d(f67897c, null, null, new C33302h(this, 3, str, str2, th2, null), 3, null);
    }

    @Override // com.sumsub.log.logger.Logger
    /* JADX INFO: renamed from: e */
    public final void mo68956e(String str, String str2, Throwable th2) {
        C41696j.m91104d(f67897c, null, null, new C33302h(this, 6, str, str2, th2, null), 3, null);
    }

    @Override // com.sumsub.log.logger.Logger
    /* JADX INFO: renamed from: i */
    public final void mo68957i(String str, String str2, Throwable th2) {
        C41696j.m91104d(f67897c, null, null, new C33302h(this, 4, str, str2, th2, null), 3, null);
    }

    @Override // com.sumsub.log.logger.Logger
    /* JADX INFO: renamed from: v */
    public final void mo68958v(String str, String str2, Throwable th2) {
        C41696j.m91104d(f67897c, null, null, new C33302h(this, 2, str, str2, th2, null), 3, null);
    }

    @Override // com.sumsub.log.logger.Logger
    /* JADX INFO: renamed from: w */
    public final void mo68959w(String str, String str2, Throwable th2) {
        C41696j.m91104d(f67897c, null, null, new C33302h(this, 5, str, str2, th2, null), 3, null);
    }
}
