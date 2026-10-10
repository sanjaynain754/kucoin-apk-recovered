package com.tencent.bugly.proguard;

import com.tencent.bugly.common.meta.UserMeta;
import com.tencent.rmonitor.base.config.InterfaceC35102c;
import com.tencent.rmonitor.common.logger.Logger;
import java.net.URL;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.l4 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33767l4 implements InterfaceC35102c {

    /* JADX INFO: renamed from: f */
    public static final String f70793f = "RMonitor_config_Loader";

    /* JADX INFO: renamed from: a */
    public final InterfaceC33834o8 f70794a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC33813n8 f70795b;

    /* JADX INFO: renamed from: c */
    public final C33910s2 f70796c;

    /* JADX INFO: renamed from: d */
    public InterfaceC33750k8 f70797d;

    /* JADX INFO: renamed from: e */
    public UserMeta f70798e;

    public C33767l4() {
        this.f70796c = new C33910s2();
        this.f70797d = null;
        this.f70794a = new C33535a3();
        this.f70795b = new C34050z2();
    }

    /* JADX INFO: renamed from: a */
    public void m73908a(UserMeta userMeta) {
        this.f70798e = userMeta;
    }

    /* JADX INFO: renamed from: a */
    public void m73911a(String str) {
        this.f70796c.f71790a = str;
    }

    @Override // com.tencent.rmonitor.base.config.InterfaceC35102c
    /* JADX INFO: renamed from: a */
    public void mo73910a(@NotNull C33547af c33547af, InterfaceC35102c.a aVar) {
        JSONObject jSONObjectM73907a;
        this.f70796c.m74904a(this.f70798e);
        InterfaceC33750k8 interfaceC33750k8M73906a = m73906a();
        C33890r2 c33890r2Mo72289a = this.f70794a.mo72289a();
        if (interfaceC33750k8M73906a != null && m73912a(c33890r2Mo72289a, aVar)) {
            jSONObjectM73907a = m73907a(interfaceC33750k8M73906a, c33890r2Mo72289a);
        } else {
            jSONObjectM73907a = c33890r2Mo72289a == null ? null : c33890r2Mo72289a.m74721b().f72027a;
            Logger.INSTANCE.mo77132i(f70793f, "load config from cache.");
        }
        if (jSONObjectM73907a != null) {
            this.f70795b.mo74242a(jSONObjectM73907a, c33547af);
        }
        c33547af.m72367a("loadConfig");
    }

    public C33767l4(InterfaceC33750k8 interfaceC33750k8, @NotNull InterfaceC33834o8 interfaceC33834o8, @NotNull InterfaceC33813n8 interfaceC33813n8) {
        this.f70796c = new C33910s2();
        this.f70797d = interfaceC33750k8;
        this.f70794a = interfaceC33834o8;
        this.f70795b = interfaceC33813n8;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final JSONObject m73907a(InterfaceC33750k8 interfaceC33750k8, C33890r2 c33890r2) {
        JSONObject jSONObject;
        Logger.INSTANCE.mo77130d(f70793f, "load config from server.");
        this.f70796c.f71791b = c33890r2 == null ? "" : c33890r2.m74721b().f72029c;
        interfaceC33750k8.mo73742a(this.f70796c);
        int iMo73741a = interfaceC33750k8.mo73741a();
        C33930t2 c33930t2Mo73743b = interfaceC33750k8.mo73743b();
        if (iMo73741a == 1) {
            jSONObject = c33930t2Mo73743b.f72027a;
        } else {
            jSONObject = c33890r2 == null ? null : c33890r2.m74721b().f72027a;
        }
        if (iMo73741a != 3) {
            this.f70794a.mo72291a(new C33890r2(this.f70796c, c33930t2Mo73743b, iMo73741a == 1));
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC33750k8 m73906a() {
        if (this.f70797d == null) {
            try {
                this.f70797d = new C33950u2(new URL(this.f70796c.f71790a));
            } catch (Throwable th2) {
                Logger.INSTANCE.exception(f70793f, th2);
            }
        }
        return this.f70797d;
    }

    @Override // com.tencent.rmonitor.base.config.InterfaceC35102c
    /* JADX INFO: renamed from: a */
    public void mo73909a(@NotNull C33547af c33547af) {
        try {
            C33890r2 c33890r2Mo72289a = this.f70794a.mo72289a();
            JSONObject jSONObject = c33890r2Mo72289a == null ? null : c33890r2Mo72289a.m74721b().f72027a;
            if (jSONObject != null) {
                this.f70795b.mo74242a(jSONObject, c33547af);
            }
            Logger.INSTANCE.mo77130d(f70793f, "load config from local.");
        } catch (Throwable unused) {
            Logger.INSTANCE.mo77131e(f70793f, "load config from local fail.");
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m73912a(C33890r2 c33890r2, InterfaceC35102c.a aVar) {
        if (C33791m7.m74056f()) {
            Logger.INSTANCE.mo77130d(f70793f, "disable apply config for user turn off");
            return false;
        }
        if (aVar != InterfaceC35102c.a.CONFIG_CHANGE && c33890r2 != null) {
            if (c33890r2.m74720a(this.f70796c)) {
                Logger.INSTANCE.mo77130d(f70793f, "enable apply config for param change");
                return true;
            }
            C33930t2 c33930t2M74721b = c33890r2.m74721b();
            boolean z11 = Math.abs(System.currentTimeMillis() - c33930t2M74721b.f72032f) >= c33930t2M74721b.f72030d;
            Logger.INSTANCE.mo77130d(f70793f, z11 ? "enable apply config" : "disable apply config");
            return z11;
        }
        Logger.INSTANCE.mo77130d(f70793f, "enable apply config for config change");
        return true;
    }
}
