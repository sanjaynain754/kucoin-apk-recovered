package jumio.core;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.view.WindowMetrics;
import androidx.core.content.ContextCompat;
import com.jumio.commons.log.Log;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.UUID;
import p852kotlin.Pair;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.J0 */
/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractC40547J0 {
    /* JADX INFO: renamed from: a */
    public static String m89193a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("Jumio01", 0);
        String string = sharedPreferences.getString("Jumio02", null);
        if (string != null) {
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        Intrinsics.checkNotNull(sharedPreferences);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString("Jumio02", string2);
        editorEdit.apply();
        return string2;
    }

    /* JADX INFO: renamed from: d */
    public static Pair m89198d(Context context) {
        int iWidth;
        int iHeight = 0;
        try {
            Object systemService = context.getSystemService(InterfaceC33953u5.f72199F);
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            WindowManager windowManager = (WindowManager) systemService;
            if (Build.VERSION.SDK_INT >= 30) {
                WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
                Intrinsics.checkNotNullExpressionValue(currentWindowMetrics, "getCurrentWindowMetrics(...)");
                iWidth = currentWindowMetrics.getBounds().width();
                try {
                    iHeight = currentWindowMetrics.getBounds().height();
                } catch (Exception e11) {
                    e = e11;
                    Log.printStackTrace(e);
                }
            } else {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                ContextCompat.getDisplayOrDefault(context).getMetrics(displayMetrics);
                int i11 = displayMetrics.widthPixels;
                try {
                    iHeight = displayMetrics.heightPixels;
                    iWidth = i11;
                } catch (Exception e12) {
                    iWidth = i11;
                    e = e12;
                    Log.printStackTrace(e);
                }
            }
        } catch (Exception e13) {
            e = e13;
            iWidth = iHeight;
        }
        return new Pair(Integer.valueOf(iWidth), Integer.valueOf(iHeight));
    }

    /* JADX INFO: renamed from: b */
    public static List m89196b(Context context) {
        int i11;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
            String[] strArr = packageInfo.requestedPermissions;
            if (strArr != null) {
                ArrayList arrayList = new ArrayList();
                int length = strArr.length;
                int i12 = 0;
                int i13 = 0;
                while (i12 < length) {
                    String str = strArr[i12];
                    int i14 = i13 + 1;
                    int[] iArr = packageInfo.requestedPermissionsFlags;
                    if (iArr != null) {
                        i11 = iArr[i13];
                    } else {
                        i11 = 0;
                    }
                    if ((i11 & 2) != 0) {
                        arrayList.add(str);
                    }
                    i12++;
                    i13 = i14;
                }
                return arrayList;
            }
            return CollectionsKt.emptyList();
        } catch (Exception e11) {
            Log.m14486w("DataPointsUtil", e11);
            return CollectionsKt.emptyList();
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m89197c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                String initiatingPackageName = context.getPackageManager().getInstallSourceInfo(context.getPackageName()).getInitiatingPackageName();
                if (initiatingPackageName != null) {
                    return initiatingPackageName;
                }
            } else {
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                if (installerPackageName != null) {
                    return installerPackageName;
                }
            }
            return "unknown";
        } catch (Exception unused) {
            return "unknown";
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m89194a(Context context, int i11) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter("Jumio03", "key");
        SharedPreferences sharedPreferences = context.getSharedPreferences("Jumio01", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putInt("Jumio03", i11);
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: a */
    public static void m89195a(Context context, long j11) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("Jumio01", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putLong("Jumio06", j11);
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: a */
    public static String m89192a() {
        Calendar calendar = Calendar.getInstance();
        if (Build.VERSION.SDK_INT >= 26) {
            String calendarType = calendar.getCalendarType();
            Intrinsics.checkNotNull(calendarType);
            return calendarType;
        }
        String simpleName = calendar.getClass().getSimpleName();
        Intrinsics.checkNotNull(simpleName);
        return simpleName;
    }
}
