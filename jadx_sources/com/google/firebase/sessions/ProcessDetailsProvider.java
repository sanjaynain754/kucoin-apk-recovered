package com.google.firebase.sessions;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.google.android.gms.common.util.ProcessUtils;
import com.tencent.bugly.proguard.C33556b3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: ProcessDetailsProvider.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0002J\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fJ\r\u0010\u0011\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0012¨\u0006\u0013"}, m90084d2 = {"Lcom/google/firebase/sessions/ProcessDetailsProvider;", "", "()V", "buildProcessDetails", "Lcom/google/firebase/sessions/ProcessDetails;", "processName", "", C33556b3.f69038e2, "", "importance", "isDefaultProcess", "", "getAppProcessDetails", "", "context", "Landroid/content/Context;", "getCurrentProcessDetails", "getProcessName", "getProcessName$com_google_firebase_firebase_sessions", "com.google.firebase-firebase-sessions"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nProcessDetailsProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProcessDetailsProvider.kt\ncom/google/firebase/sessions/ProcessDetailsProvider\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,96:1\n766#2:97\n857#2,2:98\n1549#2:100\n1620#2,3:101\n1#3:104\n*S KotlinDebug\n*F\n+ 1 ProcessDetailsProvider.kt\ncom/google/firebase/sessions/ProcessDetailsProvider\n*L\n41#1:97\n41#1:98,2\n45#1:100\n45#1:101,3\n*E\n"})
public final class ProcessDetailsProvider {

    @NotNull
    public static final ProcessDetailsProvider INSTANCE = new ProcessDetailsProvider();

    private final ProcessDetails buildProcessDetails(String processName, int pid, int importance, boolean isDefaultProcess) {
        return new ProcessDetails(processName, pid, importance, isDefaultProcess);
    }

    public static /* synthetic */ ProcessDetails buildProcessDetails$default(ProcessDetailsProvider processDetailsProvider, String str, int i11, int i12, boolean z11, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = 0;
        }
        if ((i13 & 8) != 0) {
            z11 = false;
        }
        return processDetailsProvider.buildProcessDetails(str, i11, i12, z11);
    }

    @NotNull
    public final List<ProcessDetails> getAppProcessDetails(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i11 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager != null ? activityManager.getRunningAppProcesses() : null;
        if (runningAppProcesses == null) {
            runningAppProcesses = CollectionsKt.emptyList();
        }
        List listFilterNotNull = CollectionsKt.filterNotNull(runningAppProcesses);
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList();
        for (Object obj : listFilterNotNull) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i11) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            String str2 = runningAppProcessInfo.processName;
            Intrinsics.checkNotNullExpressionValue(str2, "runningAppProcessInfo.processName");
            arrayList2.add(new ProcessDetails(str2, runningAppProcessInfo.pid, runningAppProcessInfo.importance, Intrinsics.areEqual(runningAppProcessInfo.processName, str)));
        }
        return arrayList2;
    }

    @NotNull
    public final ProcessDetails getCurrentProcessDetails(@NotNull Context context) {
        Object next;
        Intrinsics.checkNotNullParameter(context, "context");
        int iMyPid = Process.myPid();
        Iterator<T> it = getAppProcessDetails(context).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((ProcessDetails) next).getPid() != iMyPid);
        ProcessDetails processDetails = (ProcessDetails) next;
        return processDetails == null ? buildProcessDetails$default(this, getProcessName$com_google_firebase_firebase_sessions(), iMyPid, 0, false, 12, null) : processDetails;
    }

    @NotNull
    public final String getProcessName$com_google_firebase_firebase_sessions() throws Throwable {
        String processName;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            String strMyProcessName = Process.myProcessName();
            Intrinsics.checkNotNullExpressionValue(strMyProcessName, "myProcessName()");
            return strMyProcessName;
        }
        if (i11 >= 28 && (processName = Application.getProcessName()) != null) {
            return processName;
        }
        String myProcessName = ProcessUtils.getMyProcessName();
        return myProcessName != null ? myProcessName : "";
    }

    private ProcessDetailsProvider() {
    }
}
