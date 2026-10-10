package com.tencent.bugly.proguard;

import android.text.TextUtils;
import com.tencent.bugly.common.thread.ThreadManager;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.me */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33798me implements InterfaceC33897r9 {

    /* JADX INFO: renamed from: d */
    public static final long f70962d = 500;

    /* JADX INFO: renamed from: a */
    public final InterfaceC33957u9 f70963a;

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f70964b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    public ConcurrentHashMap<String, String> f70965c = null;

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.me$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C33798me.this.mo74129b();
            C33798me.this.f70964b.set(false);
        }
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33897r9
    /* JADX INFO: renamed from: b */
    public void mo74129b() {
        ConcurrentHashMap<String, String> concurrentHashMap = this.f70965c;
        if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
            return;
        }
        InterfaceC33957u9 interfaceC33957u9 = this.f70963a;
        if (interfaceC33957u9 != null ? interfaceC33957u9.mo74697a(this.f70965c) : false) {
            this.f70965c.clear();
        }
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33897r9
    /* JADX INFO: renamed from: a */
    public void mo74128a(String str, boolean z11) {
        m74130b(str, Boolean.toString(z11));
    }

    public C33798me(InterfaceC33957u9 interfaceC33957u9) {
        this.f70963a = interfaceC33957u9;
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33897r9
    /* JADX INFO: renamed from: a */
    public void mo74124a(String str, long j11) {
        m74130b(str, Long.toString(j11));
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33897r9
    /* JADX INFO: renamed from: a */
    public void mo74123a(String str, double d11) {
        m74130b(str, Double.toString(d11));
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33897r9
    /* JADX INFO: renamed from: a */
    public void mo74125a(String str, String str2) {
        m74130b(str, str2);
    }

    /* JADX INFO: renamed from: b */
    public final void m74130b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.f70965c == null) {
            synchronized (this.f70964b) {
                try {
                    if (this.f70965c == null) {
                        this.f70965c = new ConcurrentHashMap<>();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (str2 != null) {
            this.f70965c.put(str, str2);
        } else {
            this.f70965c.put(str, "");
        }
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33897r9
    /* JADX INFO: renamed from: a */
    public void mo74126a(String str, List<String> list) {
        m74130b(str, C33861pe.m74562a(list));
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33897r9
    /* JADX INFO: renamed from: a */
    public void mo74127a(String str, JSONObject jSONObject) {
        m74130b(str, jSONObject == null ? "" : jSONObject.toString());
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33897r9
    /* JADX INFO: renamed from: a */
    public void mo74122a() {
        ConcurrentHashMap<String, String> concurrentHashMap = this.f70965c;
        if (concurrentHashMap == null || concurrentHashMap.isEmpty() || !this.f70964b.compareAndSet(false, true)) {
            return;
        }
        ThreadManager.runInMonitorThread(new a(), 500L);
    }
}
