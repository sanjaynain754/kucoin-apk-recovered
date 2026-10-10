package com.tencent.liteav.audio2;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Process;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import androidx.autofill.HintConstants;
import com.tencent.bugly.proguard.C33872q4;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.util.C34748m;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.tencent.liteav.audio2.e */
/* JADX INFO: loaded from: classes59.dex */
public final class C34671e extends PhoneStateListener implements C34669c.a {

    /* JADX INFO: renamed from: c */
    static C34669c f73349c;

    /* JADX INFO: renamed from: d */
    Class<?> f73352d;

    /* JADX INFO: renamed from: e */
    Object f73353e;

    /* JADX INFO: renamed from: h */
    private b f73356h;

    /* JADX INFO: renamed from: g */
    int f73355g = 0;

    /* JADX INFO: renamed from: i */
    private boolean f73357i = false;

    /* JADX INFO: renamed from: a */
    TelephonyManager f73350a = (TelephonyManager) ContextUtils.getApplicationContext().getSystemService(HintConstants.AUTOFILL_HINT_PHONE);

    /* JADX INFO: renamed from: b */
    AudioManager f73351b = (AudioManager) ContextUtils.getApplicationContext().getSystemService("audio");

    /* JADX INFO: renamed from: f */
    C34748m f73354f = new C34748m(60, "PhoneStateManager");

    /* JADX INFO: renamed from: com.tencent.liteav.audio2.e$b */
    public interface b {
        void onInterruptedByPhoneCall();

        void onResumedByPhoneCall();
    }

    /* JADX INFO: renamed from: com.tencent.liteav.audio2.e$a */
    public static class a implements InvocationHandler {

        /* JADX INFO: renamed from: a */
        private final WeakReference<C34671e> f73358a;

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            b bVar;
            try {
                if ("onModeChanged".equals(method.getName())) {
                    int iIntValue = ((Integer) objArr[0]).intValue();
                    C34671e c34671e = this.f73358a.get();
                    if (c34671e != null && (bVar = c34671e.f73356h) != null) {
                        if (iIntValue == 2) {
                            c34671e.f73357i = true;
                            bVar.onInterruptedByPhoneCall();
                            return obj;
                        }
                        if (c34671e.f73357i) {
                            c34671e.f73357i = false;
                            bVar.onResumedByPhoneCall();
                            return obj;
                        }
                    }
                }
            } catch (Throwable th2) {
                Log.m76033e("PhoneStateManager", "notify mode changed failed, " + th2.getMessage(), new Object[0]);
            }
            return obj;
        }

        public a(C34671e c34671e) {
            this.f73358a = new WeakReference<>(c34671e);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 26) {
            f73349c = new C34669c();
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m76005b() {
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            return false;
        }
        try {
            return applicationContext.checkPermission(C33872q4.f71536c, Process.myPid(), Process.myUid()) == 0;
        } catch (Throwable th2) {
            Log.m76033e("PhoneStateManager", "check permission exception, " + th2.getMessage(), new Object[0]);
            return true;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m76007c() {
        if (Build.VERSION.SDK_INT >= 26 && f73349c != null) {
            Log.m76034i("PhoneStateManager", "unregister audio playback callback.", new Object[0]);
            f73349c.f73347a = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m76008d() {
        b bVar = this.f73356h;
        if (bVar == null) {
            return;
        }
        try {
            if (this.f73351b.getMode() == 2) {
                this.f73357i = true;
                bVar.onInterruptedByPhoneCall();
            } else if (this.f73357i) {
                this.f73357i = false;
                bVar.onResumedByPhoneCall();
            }
        } catch (Throwable th2) {
            Log.m76033e("PhoneStateManager", "get Mode exception, " + th2.getMessage(), new Object[0]);
        }
    }

    @Override // com.tencent.liteav.audio2.C34669c.a
    /* JADX INFO: renamed from: a */
    public final void mo76000a() {
        this.f73354f.m76136b(RunnableC34673g.m76011a(this), 500L);
    }

    @Override // android.telephony.PhoneStateListener
    public final void onCallStateChanged(int i11, String str) {
        b bVar = this.f73356h;
        if (bVar == null || this.f73355g == i11) {
            return;
        }
        this.f73355g = i11;
        if (i11 == 2) {
            bVar.onInterruptedByPhoneCall();
        } else if (i11 == 0) {
            bVar.onResumedByPhoneCall();
        }
    }

    public C34671e(b bVar) {
        this.f73356h = bVar;
    }
}
