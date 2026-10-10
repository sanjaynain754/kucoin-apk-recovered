package com.sumsub.sns.internal.core.data.network.interceptor;

import android.content.SharedPreferences;
import android.os.Build;
import com.kubi.mine.lib.jsapi.KCTurboSystemSettingsModuleImpl;
import com.sumsub.sns.internal.core.common.AbstractC28413P0;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.common.SNSSession;
import com.sumsub.sns.internal.core.domain.InterfaceC28584k;
import com.sumsub.sns.internal.features.data.repository.settings.C30034c;
import com.sumsub.sns.internal.p125ff.C33048a;
import com.sumsub.sns.internal.p125ff.core.C33050a;
import java.util.Map;
import java.util.UUID;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.data.network.interceptor.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28519a implements Interceptor {

    /* JADX INFO: renamed from: a */
    public final C30034c f58055a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC28584k f58056b;

    /* JADX INFO: renamed from: c */
    public final Lazy f58057c = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.core.data.network.interceptor.k
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C28519a.m69390a(this.f58078b);
        }
    });

    @Override // okhttp3.Interceptor
    public final synchronized Response intercept(Interceptor.Chain chain) {
        Request.Builder builderAddHeader;
        String str;
        String str2;
        String str3;
        try {
            Request.Builder builderAddHeader2 = chain.request().newBuilder().addHeader("X-Network-Type", this.f58055a.f60333b.getString("key_network_type", ""));
            String str4 = (String) this.f58056b.mo69412b();
            SNSSession sNSSession = null;
            if (str4 == null || StringsKt.isBlank(str4)) {
                str4 = null;
            }
            if (str4 != null) {
                builderAddHeader2.addHeader("X-Applicant-Id", str4);
            }
            C28468k0 c28468k0 = C28468k0.f57983a;
            builderAddHeader = builderAddHeader2.addHeader("X-Mob-App", C28468k0.f57986d).addHeader("X-Mob-App-Ver", C28468k0.f57984b + "/" + C28468k0.f57985c).addHeader("X-Mob-Dev", AbstractC28458h.m69349b()).addHeader("X-Mob-Dev-Id", (String) this.f58057c.getValue()).addHeader("X-Mob-Sdk-Build", "1.46.0").addHeader("X-Mob-Sdk-Ver", "1.46.0").addHeader("X-Mob-Sdk-Locale", C28468k0.f57987e.toString()).addHeader("X-Mob-OS", KCTurboSystemSettingsModuleImpl.PLATFORM_ANDROID).addHeader("X-Mob-OS-Ver", Build.VERSION.RELEASE).addHeader("X-Client-Id", "msdk2").addHeader("X-Debug", String.valueOf(C28468k0.f57988f)).addHeader("X-Device-Fingerprint", (String) this.f58057c.getValue());
            if (chain.request().headers().get("X-Session-Id") == null) {
                if (!AbstractC28413P0.f57921a) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                SNSSession sNSSession2 = AbstractC28413P0.f57923c;
                if (sNSSession2 != null) {
                    sNSSession = sNSSession2;
                }
                builderAddHeader.addHeader("X-Session-Id", sNSSession.getSessionId());
            }
            Map settings = c28468k0.getSettings();
            if (settings != null && (str3 = (String) settings.get("appFrameworkName")) != null) {
                builderAddHeader.addHeader("X-Mob-App-Framework", str3);
            }
            Map settings2 = c28468k0.getSettings();
            if (settings2 != null && (str2 = (String) settings2.get("appFrameworkVersion")) != null) {
                builderAddHeader.addHeader("X-Mob-App-Framework-Ver", str2);
            }
            C33050a c33050a = C33048a.f67440C;
            if (c33050a.m71434a() && (str = c33050a.m71435b().f67504b) != null) {
                builderAddHeader.addHeader("X-Test-Ip", str);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return chain.proceed(builderAddHeader.build());
    }

    /* JADX INFO: renamed from: a */
    public static final String m69390a(C28519a c28519a) {
        C30034c c30034c = c28519a.f58055a;
        String string = c30034c.f60333b.getString("device_id", null);
        if (string == null || string.length() == 0) {
            string = UUID.randomUUID().toString();
        }
        SharedPreferences.Editor editorEdit = c30034c.f60333b.edit();
        editorEdit.putString("device_id", string);
        editorEdit.commit();
        return string;
    }

    public C28519a(C30034c c30034c, InterfaceC28584k interfaceC28584k) {
        this.f58055a = c30034c;
        this.f58056b = interfaceC28584k;
    }
}
