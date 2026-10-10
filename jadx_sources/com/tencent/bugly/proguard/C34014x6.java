package com.tencent.bugly.proguard;

import android.os.HandlerThread;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.List;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.x6 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C34014x6 {

    /* JADX INFO: renamed from: a */
    public final String f72494a;

    /* JADX INFO: renamed from: b */
    public final String f72495b;

    /* JADX INFO: renamed from: c */
    public final long f72496c;

    /* JADX INFO: renamed from: d */
    public final List<String> f72497d;

    public C34014x6(Thread thread, List<String> list) {
        this.f72494a = thread instanceof HandlerThread ? HandlerThread.class.getName() : thread.getClass().getName();
        this.f72495b = thread.getName();
        this.f72496c = thread.getId();
        this.f72497d = list;
    }

    /* JADX INFO: renamed from: a */
    public List<String> m75445a() {
        return this.f72497d;
    }

    /* JADX INFO: renamed from: b */
    public String m75446b() {
        return this.f72495b;
    }

    /* JADX INFO: renamed from: c */
    public String m75447c() {
        return this.f72494a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f72497d != null) {
            for (int i11 = 0; i11 < this.f72497d.size(); i11++) {
                sb2.append(this.f72497d.get(i11));
                if (i11 < this.f72497d.size() - 1) {
                    sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                }
            }
        }
        return String.format("%s,%s,%d\n%s", this.f72494a, this.f72495b, Long.valueOf(this.f72496c), sb2.toString());
    }

    public C34014x6(String str, String str2, long j11, List<String> list) {
        this.f72494a = str;
        this.f72495b = str2;
        this.f72496c = j11;
        this.f72497d = list;
    }
}
