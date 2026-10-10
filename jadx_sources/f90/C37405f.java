package f90;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;

/* JADX INFO: renamed from: f90.f */
/* JADX INFO: compiled from: WalleChannelReader.java */
/* JADX INFO: loaded from: classes23.dex */
public final class C37405f {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static String m84135a(@NonNull Context context) {
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            if (applicationInfo == null) {
                return null;
            }
            return applicationInfo.sourceDir;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static String m84136b(@NonNull Context context) {
        return m84137c(context, null);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static String m84137c(@NonNull Context context, @NonNull String str) {
        C37401b c37401bM84138d = m84138d(context);
        if (c37401bM84138d == null) {
            return str;
        }
        return c37401bM84138d.m84125a();
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static C37401b m84138d(@NonNull Context context) {
        String strM84135a = m84135a(context);
        if (TextUtils.isEmpty(strM84135a)) {
            return null;
        }
        return C37402c.m84126a(new File(strM84135a));
    }
}
