package uc0;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import com.trtc.tuikit.common.system.ContextProvider;

/* JADX INFO: renamed from: uc0.a */
/* JADX INFO: compiled from: ScreenUtil.java */
/* JADX INFO: loaded from: classes2.dex */
public class C45152a {
    /* JADX INFO: renamed from: b */
    public static int m99800b(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService(InterfaceC33953u5.f72199F)).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    /* JADX INFO: renamed from: a */
    public static int m99799a(float f11) {
        return (int) ((f11 * ContextProvider.m79397b().getResources().getDisplayMetrics().density) + 0.5f);
    }
}
