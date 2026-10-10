package com.tencent.bugly.proguard;

import android.app.Activity;
import android.text.TextUtils;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.g */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33657g {

    /* JADX INFO: renamed from: j */
    public static final C33657g f69911j = new C33657g();

    /* JADX INFO: renamed from: k */
    public static final int f69912k = 10;

    /* JADX INFO: renamed from: g */
    public final String[] f69919g;

    /* JADX INFO: renamed from: c */
    public WeakReference<Activity> f69915c = null;

    /* JADX INFO: renamed from: d */
    public String f69916d = "";

    /* JADX INFO: renamed from: e */
    public String f69917e = "";

    /* JADX INFO: renamed from: f */
    public String f69918f = "";

    /* JADX INFO: renamed from: h */
    public int f69920h = -1;

    /* JADX INFO: renamed from: i */
    public String f69921i = "";

    /* JADX INFO: renamed from: a */
    public final CopyOnWriteArraySet<InterfaceC33896r8> f69913a = new CopyOnWriteArraySet<>();

    /* JADX INFO: renamed from: b */
    public final CopyOnWriteArraySet<InterfaceC34037y9> f69914b = new CopyOnWriteArraySet<>();

    /* JADX INFO: renamed from: c */
    public static Activity m73092c() {
        return f69911j.m73108i();
    }

    /* JADX INFO: renamed from: a */
    public void m73098a(InterfaceC33896r8 interfaceC33896r8) {
        this.f69913a.add(interfaceC33896r8);
    }

    /* JADX INFO: renamed from: b */
    public void m73102b(InterfaceC33896r8 interfaceC33896r8) {
        this.f69913a.remove(interfaceC33896r8);
    }

    /* JADX INFO: renamed from: d */
    public static String m73093d() {
        return f69911j.m73110k();
    }

    /* JADX INFO: renamed from: e */
    public static String m73094e() {
        return f69911j.m73106f();
    }

    /* JADX INFO: renamed from: h */
    public static C33657g m73095h() {
        return f69911j;
    }

    /* JADX INFO: renamed from: a */
    public void m73099a(InterfaceC34037y9 interfaceC34037y9) {
        this.f69914b.add(interfaceC34037y9);
    }

    /* JADX INFO: renamed from: b */
    public void m73103b(InterfaceC34037y9 interfaceC34037y9) {
        this.f69914b.remove(interfaceC34037y9);
    }

    /* JADX INFO: renamed from: g */
    public String m73107g() {
        return this.f69918f;
    }

    /* JADX INFO: renamed from: i */
    public Activity m73108i() {
        WeakReference<Activity> weakReference = this.f69915c;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* JADX INFO: renamed from: j */
    public String m73109j() {
        return this.f69917e;
    }

    /* JADX INFO: renamed from: k */
    public String m73110k() {
        return this.f69916d;
    }

    /* JADX INFO: renamed from: l */
    public boolean m73111l() {
        return !TextUtils.isEmpty(this.f69918f);
    }

    public C33657g() {
        String[] strArr = new String[10];
        this.f69919g = strArr;
        Arrays.fill(strArr, "");
    }

    /* JADX INFO: renamed from: a */
    public void m73097a(Activity activity) {
        WeakReference<Activity> weakReference = this.f69915c;
        if (activity != null) {
            if (weakReference == null || weakReference.get() != activity) {
                this.f69915c = new WeakReference<>(activity);
                this.f69917e = activity.getClass().getName();
                this.f69916d = activity.getClass().getSimpleName();
                if (!m73111l()) {
                    m73100a(this.f69917e);
                }
                m73096a();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public String m73101b() {
        StringBuilder sb2 = new StringBuilder(120);
        if (this.f69920h >= 0) {
            for (int i11 = 0; i11 < 10; i11++) {
                int i12 = ((this.f69920h - i11) + 10) % 10;
                if (!TextUtils.isEmpty(this.f69919g[i12])) {
                    sb2.append(this.f69919g[i12]);
                    sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                }
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: c */
    public void m73105c(String str) {
        if (str == null || str.equals(this.f69918f)) {
            this.f69918f = "";
            if (!TextUtils.isEmpty(this.f69917e)) {
                m73100a(this.f69917e);
            }
            Iterator<InterfaceC33896r8> it = this.f69913a.iterator();
            while (it.hasNext()) {
                it.next().onExitScene(str);
            }
            m73096a();
        }
    }

    /* JADX INFO: renamed from: f */
    public String m73106f() {
        String strM73107g = m73107g();
        if (TextUtils.isEmpty(strM73107g)) {
            return m73110k();
        }
        return strM73107g;
    }

    /* JADX INFO: renamed from: b */
    public void m73104b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f69918f = str;
        m73100a(str);
        Iterator<InterfaceC33896r8> it = this.f69913a.iterator();
        while (it.hasNext()) {
            it.next().onEnterScene(str);
        }
        m73096a();
    }

    /* JADX INFO: renamed from: a */
    public void m73100a(String str) {
        int i11 = this.f69920h;
        if (i11 < 0 || !TextUtils.equals(str, this.f69919g[i11])) {
            int i12 = (this.f69920h + 1) % 10;
            this.f69920h = i12;
            this.f69919g[i12] = str;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m73096a() {
        String strM73106f = m73106f();
        if (TextUtils.equals(strM73106f, this.f69921i)) {
            return;
        }
        this.f69921i = strM73106f;
        Iterator<InterfaceC34037y9> it = this.f69914b.iterator();
        while (it.hasNext()) {
            it.next().mo72960a(strM73106f);
        }
    }
}
