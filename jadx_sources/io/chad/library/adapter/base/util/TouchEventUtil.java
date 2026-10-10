package io.chad.library.adapter.base.util;

/* JADX INFO: loaded from: classes60.dex */
public class TouchEventUtil {
    public static String getTouchAction(int i11) {
        String str = "Unknow:id=" + i11;
        if (i11 == 0) {
            return "ACTION_DOWN";
        }
        if (i11 == 1) {
            return "ACTION_UP";
        }
        if (i11 == 2) {
            return "ACTION_MOVE";
        }
        if (i11 != 3) {
            return i11 != 4 ? str : "ACTION_OUTSIDE";
        }
        return "ACTION_CANCEL";
    }
}
