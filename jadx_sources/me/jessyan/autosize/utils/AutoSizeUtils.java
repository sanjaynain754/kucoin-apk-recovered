package me.jessyan.autosize.utils;

import android.content.Context;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes61.dex */
public class AutoSizeUtils {
    private AutoSizeUtils() {
        throw new IllegalStateException("you can't instantiate me!");
    }

    public static int dp2px(Context context, float f11) {
        return (int) (TypedValue.applyDimension(1, f11, context.getResources().getDisplayMetrics()) + 0.5f);
    }

    public static int in2px(Context context, float f11) {
        return (int) (TypedValue.applyDimension(4, f11, context.getResources().getDisplayMetrics()) + 0.5f);
    }

    public static int mm2px(Context context, float f11) {
        return (int) (TypedValue.applyDimension(5, f11, context.getResources().getDisplayMetrics()) + 0.5f);
    }

    public static int pt2px(Context context, float f11) {
        return (int) (TypedValue.applyDimension(3, f11, context.getResources().getDisplayMetrics()) + 0.5f);
    }

    public static int sp2px(Context context, float f11) {
        return (int) (TypedValue.applyDimension(2, f11, context.getResources().getDisplayMetrics()) + 0.5f);
    }
}
