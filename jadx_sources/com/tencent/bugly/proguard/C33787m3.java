package com.tencent.bugly.proguard;

import android.content.SharedPreferences;
import com.tencent.bugly.common.thread.ThreadManager;
import com.tencent.rmonitor.base.meta.BaseInfo;
import com.tencent.rmonitor.common.logger.Logger;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.m3 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33787m3 {

    /* JADX INFO: renamed from: a */
    public static final String f70905a = "RMonitor_common_CrashProtector";

    /* JADX INFO: renamed from: b */
    public static final String f70906b = "disable_forever_";

    /* JADX INFO: renamed from: c */
    public static final String f70907c = "start_failed_times_";

    /* JADX INFO: renamed from: d */
    public static final String f70908d = "recovery_";

    /* JADX INFO: renamed from: e */
    public static final int f70909e = 3;

    /* JADX INFO: renamed from: f */
    public static boolean f70910f = true;

    /* JADX INFO: renamed from: g */
    public static final LinkedList<String> f70911g = new LinkedList<>();

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.m3$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f70912b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ SharedPreferences.Editor f70913c;

        public a(String str, SharedPreferences.Editor editor) {
            this.f70912b = str;
            this.f70913c = editor;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f70913c.putInt(C33787m3.m74031b(this.f70912b), 0);
            this.f70913c.commit();
            C33787m3.f70911g.remove(this.f70912b);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m74029a(boolean z11) {
        f70910f = z11;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static String m74031b(String str) {
        return f70907c + BaseInfo.userMeta.sdkVersion + "_" + str;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static String m74032c(String str) {
        return f70908d + BaseInfo.userMeta.sdkVersion + "_" + str;
    }

    /* JADX INFO: renamed from: a */
    public static void m74028a(List<String> list) {
        SharedPreferences sharedPreferences = BaseInfo.sharePreference;
        if (sharedPreferences == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            editorEdit.putBoolean(m74032c(it.next()), true);
        }
        editorEdit.commit();
    }

    /* JADX INFO: renamed from: a */
    public static boolean m74030a(String str, long j11) {
        if (!f70910f) {
            return false;
        }
        LinkedList<String> linkedList = f70911g;
        if (linkedList.contains(str)) {
            Logger.INSTANCE.mo77130d(f70905a, C33778lf.m73987a("plugin ", str, " is in protect list"));
            return false;
        }
        linkedList.add(str);
        SharedPreferences sharedPreferences = BaseInfo.sharePreference;
        if (sharedPreferences == null) {
            return true;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        String strM74032c = m74032c(str);
        String strM74026a = m74026a(str);
        String strM74031b = m74031b(str);
        if (sharedPreferences.getBoolean(strM74032c, false)) {
            Logger.INSTANCE.mo77130d(f70905a, C33778lf.m73987a("recovery plugin ", str, " for config"));
            editorEdit.putBoolean(strM74026a, false);
            editorEdit.putInt(strM74031b, 0);
            editorEdit.commit();
            return false;
        }
        if (sharedPreferences.getBoolean(strM74026a, false)) {
            Logger.INSTANCE.mo77130d(f70905a, C33778lf.m73987a("start plugin ", str, " fail due to disabled"));
            return true;
        }
        int i11 = sharedPreferences.getInt(strM74031b, 0);
        if (i11 > 3) {
            editorEdit.putBoolean(strM74026a, true);
            editorEdit.commit();
            Logger.INSTANCE.mo77130d(f70905a, C33778lf.m73987a("start plugin ", str, " fail duo to too many failed times"));
            return true;
        }
        editorEdit.putInt(strM74031b, i11 + 1);
        editorEdit.commit();
        ThreadManager.runInMonitorThread(new a(str, editorEdit), j11);
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static String m74026a(String str) {
        return f70906b + BaseInfo.userMeta.sdkVersion + "_" + str;
    }
}
