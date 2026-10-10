package com.kubi.utils;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.blankj.utilcode.util.C5264d;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.p407io.CloseableKt;

/* JADX INFO: renamed from: com.kubi.utils.k0 */
/* JADX INFO: compiled from: ProcessUtils.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\rJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\r¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/utils/k0;", "", "<init>", "()V", "", "e", "()Z", "Landroid/content/Context;", "context", "f", "(Landroid/content/Context;)Z", "", "d", "(Landroid/content/Context;)Ljava/lang/String;", "b", "()Ljava/lang/String;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "c", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nProcessUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProcessUtils.kt\ncom/kubi/utils/ProcessUtils\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,77:1\n107#2:78\n79#2,22:79\n1#3:101\n*S KotlinDebug\n*F\n+ 1 ProcessUtils.kt\ncom/kubi/utils/ProcessUtils\n*L\n42#1:78\n42#1:79,22\n*E\n"})
public final class C27058k0 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C27058k0 f54342a = new C27058k0();

    /* JADX INFO: renamed from: b */
    public final String m66752b() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("/proc/" + Process.myPid() + "/cmdline")));
            try {
                String line = bufferedReader.readLine();
                Intrinsics.checkNotNullExpressionValue(line, "it.readLine()");
                int length = line.length() - 1;
                int i11 = 0;
                boolean z11 = false;
                while (i11 <= length) {
                    boolean z12 = Intrinsics.compare((int) line.charAt(!z11 ? i11 : length), 32) <= 0;
                    if (z11) {
                        if (!z12) {
                            break;
                        }
                        length--;
                    } else if (z12) {
                        i11++;
                    } else {
                        z11 = true;
                    }
                }
                String string = line.subSequence(i11, length + 1).toString();
                CloseableKt.closeFinally(bufferedReader, null);
                return string;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(bufferedReader, th2);
                    throw th3;
                }
            }
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m66751a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        Object next;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null && !runningAppProcesses.isEmpty()) {
            Iterator<T> it = runningAppProcesses.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) next;
                if (runningAppProcessInfo.pid == Process.myPid() && runningAppProcessInfo.processName != null) {
                    break;
                }
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo2 = (ActivityManager.RunningAppProcessInfo) next;
            if (runningAppProcessInfo2 != null) {
                return runningAppProcessInfo2.processName;
            }
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final String m66754d(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String strM66752b = m66752b();
        if (!TextUtils.isEmpty(strM66752b)) {
            Intrinsics.checkNotNull(strM66752b);
            return strM66752b;
        }
        String strM66751a = m66751a(context);
        if (TextUtils.isEmpty(strM66751a)) {
            String strM66753c = m66753c(context);
            return strM66753c == null ? "" : strM66753c;
        }
        Intrinsics.checkNotNull(strM66751a);
        return strM66751a;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m66756f(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return Intrinsics.areEqual(context.getPackageName(), m66754d(context));
    }

    /* JADX INFO: renamed from: c */
    public final String m66753c(Context context) {
        try {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
            Application application = (Application) applicationContext;
            Field field = application.getClass().getField("mLoadedApk");
            field.setAccessible(true);
            Object obj = field.get(application);
            Field declaredField = obj.getClass().getDeclaredField("mActivityThread");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            Object objInvoke = obj2.getClass().getDeclaredMethod("getProcessName", new Class[0]).invoke(obj2, new Object[0]);
            Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.String");
            return (String) objInvoke;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m66755e() {
        try {
            return C5264d.m6168n();
        } catch (Exception unused) {
            return false;
        }
    }
}
