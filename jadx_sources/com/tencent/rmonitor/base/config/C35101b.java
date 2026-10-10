package com.tencent.rmonitor.base.config;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.tencent.bugly.common.meta.UserMeta;
import com.tencent.bugly.proguard.AbstractC34022xe;
import com.tencent.bugly.proguard.C33547af;
import com.tencent.bugly.proguard.C33597d2;
import com.tencent.bugly.proguard.C33694hf;
import com.tencent.bugly.proguard.C33767l4;
import com.tencent.bugly.proguard.C33970v2;
import com.tencent.bugly.proguard.C34025xh;
import com.tencent.bugly.proguard.InterfaceC33792m8;
import com.tencent.rmonitor.common.logger.Logger;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: com.tencent.rmonitor.base.config.b */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class C35101b implements Handler.Callback {

    /* JADX INFO: renamed from: h */
    public static final String f75189h = "RMonitor_config_fetcher";

    /* JADX INFO: renamed from: b */
    public final C33547af f75190b = new C33547af();

    /* JADX INFO: renamed from: d */
    public InterfaceC35102c f75192d = null;

    /* JADX INFO: renamed from: e */
    public final C33767l4 f75193e = new C33767l4();

    /* JADX INFO: renamed from: f */
    public Handler f75194f = null;

    /* JADX INFO: renamed from: g */
    public boolean f75195g = false;

    /* JADX INFO: renamed from: c */
    public final CopyOnWriteArraySet<InterfaceC33792m8> f75191c = new CopyOnWriteArraySet<>();

    /* JADX INFO: renamed from: com.tencent.rmonitor.base.config.b$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C35101b.this.m77094b(InterfaceC35102c.a.CONFIG_CHANGE);
        }
    }

    /* JADX INFO: renamed from: com.tencent.rmonitor.base.config.b$b */
    /* JADX INFO: compiled from: BUGLY */
    public class b implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC35102c.a f75197b;

        public b(InterfaceC35102c.a aVar) {
            this.f75197b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            C35101b.this.m77094b(this.f75197b);
        }
    }

    /* JADX INFO: renamed from: com.tencent.rmonitor.base.config.b$c */
    /* JADX INFO: compiled from: BUGLY */
    public static class c {

        /* JADX INFO: renamed from: a */
        public static final C35101b f75199a = new C35101b();
    }

    /* JADX INFO: renamed from: b */
    public void m77093b(InterfaceC33792m8 interfaceC33792m8) {
        if (interfaceC33792m8 != null) {
            this.f75191c.remove(interfaceC33792m8);
        }
    }

    /* JADX INFO: renamed from: c */
    public final Handler m77095c() {
        return this.f75194f;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@NonNull Message message) {
        return true;
    }

    /* JADX INFO: renamed from: a */
    public void m77086a(Looper looper) {
        if (looper == null) {
            return;
        }
        Handler handler = this.f75194f;
        if (handler == null || handler.getLooper() != looper) {
            this.f75194f = new Handler(looper, this);
        }
    }

    /* JADX INFO: renamed from: b */
    public C33694hf m77091b(String str) {
        if (m77098f()) {
            m77097e();
        }
        return this.f75190b.m72369c(str);
    }

    /* JADX INFO: renamed from: c */
    public final void m77096c(String str) {
        if (this.f75195g) {
            Logger.INSTANCE.mo77130d(f75189h, str);
            return;
        }
        if (!C33970v2.b.f72311a.m75261d()) {
            Logger.INSTANCE.mo77131e(f75189h, str + " fail for creator not ready yet.");
            return;
        }
        this.f75195g = true;
        Logger.INSTANCE.mo77132i(f75189h, str + " success.");
        if (Logger.debug) {
            this.f75190b.m72367a(str);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m77097e() {
        if (this.f75195g) {
            return;
        }
        try {
            this.f75193e.mo73909a(this.f75190b);
            m77096c("load config from local");
        } catch (Throwable th2) {
            Logger.INSTANCE.exception(f75189h, th2);
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m77098f() {
        return !this.f75195g;
    }

    /* JADX INFO: renamed from: d */
    public static C35101b m77082d() {
        return c.f75199a;
    }

    /* JADX INFO: renamed from: a */
    public void m77085a() {
        Handler handlerM77095c = m77095c();
        if (handlerM77095c != null) {
            handlerM77095c.postDelayed(new a(), 100L);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m77094b(InterfaceC35102c.a aVar) {
        InterfaceC35102c interfaceC35102cM77092b = m77092b();
        if (interfaceC35102cM77092b == null) {
            Logger.INSTANCE.mo77132i(f75189h, "load config fail for loader is null");
            return;
        }
        Logger.INSTANCE.mo77130d(f75189h, "load config now.");
        try {
            interfaceC35102cM77092b.mo73910a(this.f75190b, aVar);
            Iterator<InterfaceC33792m8> it = this.f75191c.iterator();
            while (it.hasNext()) {
                it.next().mo74062a(this.f75190b);
            }
            m77096c("load config");
        } catch (Throwable th2) {
            Logger.INSTANCE.exception(f75189h, th2);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m77088a(InterfaceC33792m8 interfaceC33792m8) {
        if (interfaceC33792m8 != null) {
            this.f75191c.add(interfaceC33792m8);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m77087a(UserMeta userMeta) {
        if (userMeta != null && !TextUtils.isEmpty(userMeta.appId)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C33597d2.m72768b());
            sb2.append("/appconfig/v7/config/");
            this.f75193e.m73911a(C34025xh.m75464a(sb2, userMeta.appId, "/"));
        }
        this.f75193e.m73908a(userMeta);
    }

    /* JADX INFO: renamed from: a */
    public void m77090a(InterfaceC35102c interfaceC35102c) {
        this.f75192d = interfaceC35102c;
    }

    /* JADX INFO: renamed from: a */
    public void m77089a(InterfaceC35102c.a aVar) {
        b bVar = new b(aVar);
        Handler handlerM77095c = m77095c();
        if (handlerM77095c != null && handlerM77095c.getLooper().getThread() != Thread.currentThread()) {
            Logger.INSTANCE.mo77130d(f75189h, "load config in specified thread.");
            handlerM77095c.post(bVar);
        } else {
            Logger.INSTANCE.mo77130d(f75189h, "load config in current thread.");
            bVar.run();
        }
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC35102c m77092b() {
        InterfaceC35102c interfaceC35102c = this.f75192d;
        return interfaceC35102c != null ? interfaceC35102c : this.f75193e;
    }

    /* JADX INFO: renamed from: a */
    public AbstractC34022xe m77083a(String str) {
        if (m77098f()) {
            m77097e();
        }
        return this.f75190b.m72368b(str);
    }

    /* JADX INFO: renamed from: a */
    public List<String> m77084a(List<String> list) {
        if (m77098f()) {
            m77097e();
        }
        return this.f75190b.m72366a(list);
    }
}
