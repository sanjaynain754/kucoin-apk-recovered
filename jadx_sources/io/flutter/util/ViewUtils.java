package io.flutter.util;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.window.layout.WindowMetrics;
import androidx.window.layout.WindowMetricsCalculator;
import io.flutter.util.ViewUtils;

/* JADX INFO: loaded from: classes23.dex */
public final class ViewUtils {

    public interface DisplayUpdater {
        void updateDisplayMetrics(float f11, float f12, float f13);
    }

    /* JADX INFO: loaded from: classes60.dex */
    public interface ViewVisitor {
        boolean run(@NonNull View view);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ boolean m87791b(Class[] clsArr, View view) {
        for (Class cls : clsArr) {
            if (cls.isInstance(view)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public static Activity getActivity(@Nullable Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return getActivity(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static boolean traverseHierarchy(@Nullable View view, @NonNull ViewVisitor viewVisitor) {
        if (view == null) {
            return false;
        }
        if (viewVisitor.run(view)) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                if (traverseHierarchy(viewGroup.getChildAt(i11), viewVisitor)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean childHasFocus(@Nullable View view) {
        return traverseHierarchy(view, new ViewVisitor() { // from class: ye0.b
            @Override // io.flutter.util.ViewUtils.ViewVisitor
            public final boolean run(View view2) {
                return view2.hasFocus();
            }
        });
    }

    public static boolean hasChildViewOfType(@Nullable View view, final Class<? extends View>[] clsArr) {
        return traverseHierarchy(view, new ViewVisitor() { // from class: ye0.a
            @Override // io.flutter.util.ViewUtils.ViewVisitor
            public final boolean run(View view2) {
                return ViewUtils.m87791b(clsArr, view2);
            }
        });
    }

    public static void calculateMaximumDisplayMetrics(@Nullable Context context, @NonNull DisplayUpdater displayUpdater) {
        Activity activity = getActivity(context);
        if (activity != null) {
            WindowMetrics windowMetricsComputeMaximumWindowMetrics = WindowMetricsCalculator.getOrCreate().computeMaximumWindowMetrics(activity);
            displayUpdater.updateDisplayMetrics(windowMetricsComputeMaximumWindowMetrics.getBounds().width(), windowMetricsComputeMaximumWindowMetrics.getBounds().height(), context.getResources().getDisplayMetrics().density);
        }
    }
}
