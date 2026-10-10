package p746x2;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.Display;
import android.view.View;

/* JADX INFO: renamed from: x2.b */
/* JADX INFO: compiled from: Utils.java */
/* JADX INFO: loaded from: classes34.dex */
public class C45993b {
    /* JADX INFO: renamed from: b */
    public static int m101469b(int i11) {
        return (int) (i11 * Resources.getSystem().getDisplayMetrics().density);
    }

    /* JADX INFO: renamed from: a */
    public static float m101468a(float f11, float f12, float f13) {
        return Math.min(Math.max(f12, f11), f13);
    }

    /* JADX INFO: renamed from: c */
    public static Activity m101470c(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static int m101471d(View view) {
        Activity activityM101470c = m101470c(view);
        if (activityM101470c != null) {
            Display defaultDisplay = activityM101470c.getWindowManager().getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            int i11 = point.y;
            defaultDisplay.getRealSize(point);
            int i12 = point.y;
            if (i12 > i11) {
                return i12 - i11;
            }
        }
        return 0;
    }
}
