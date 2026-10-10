package me.jessyan.autosize.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.bugly.proguard.InterfaceC33953u5;

/* JADX INFO: loaded from: classes23.dex */
public class ScreenUtils {
    private ScreenUtils() {
        throw new IllegalStateException("you can't instantiate me!");
    }

    public static int getHeightOfNavigationBar(Context context) {
        if (Settings.Global.getInt(context.getContentResolver(), "force_fsg_nav_bar", 0) != 0) {
            return 0;
        }
        return getRawScreenSize(context)[1] - getScreenSize(context)[1];
    }

    public static int[] getRawScreenSize(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService(InterfaceC33953u5.f72199F)).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i11 = displayMetrics.widthPixels;
        int i12 = displayMetrics.heightPixels;
        try {
            Point point = new Point();
            Display.class.getMethod("getRealSize", Point.class).invoke(defaultDisplay, point);
            i11 = point.x;
            i12 = point.y;
        } catch (Exception unused) {
        }
        return new int[]{i11, i12};
    }

    public static int[] getScreenSize(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService(InterfaceC33953u5.f72199F)).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return new int[]{displayMetrics.widthPixels, displayMetrics.heightPixels};
    }

    public static int getStatusBarHeight() {
        try {
            int identifier = Resources.getSystem().getIdentifier("status_bar_height", "dimen", "android");
            if (identifier > 0) {
                return Resources.getSystem().getDimensionPixelSize(identifier);
            }
            return 0;
        } catch (Resources.NotFoundException e11) {
            e11.printStackTrace();
            return 0;
        }
    }
}
