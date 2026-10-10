package com.sensorsdata.analytics.android.sdk.util;

import androidx.fragment.app.Fragment;
import com.sensorsdata.analytics.android.sdk.SALog;

/* JADX INFO: loaded from: classes59.dex */
public class SAFragmentUtils {
    public static boolean fragmentGetUserVisibleHint(Object obj) {
        try {
            return ((Boolean) obj.getClass().getMethod("getUserVisibleHint", new Class[0]).invoke(obj, new Object[0])).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean fragmentIsHidden(Object obj) {
        try {
            return ((Boolean) obj.getClass().getMethod("isHidden", new Class[0]).invoke(obj, new Object[0])).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean fragmentIsResumed(Object obj) {
        try {
            return ((Boolean) obj.getClass().getMethod("isResumed", new Class[0]).invoke(obj, new Object[0])).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isFragmentVisible(Object obj) {
        Object objInvoke;
        try {
            objInvoke = obj.getClass().getMethod("getParentFragment", new Class[0]).invoke(obj, new Object[0]);
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            objInvoke = null;
        }
        try {
            if (objInvoke == null) {
                if (!fragmentIsHidden(obj) && fragmentGetUserVisibleHint(obj) && fragmentIsResumed(obj)) {
                    return true;
                }
            } else if (!fragmentIsHidden(obj) && fragmentGetUserVisibleHint(obj) && fragmentIsResumed(obj) && !fragmentIsHidden(objInvoke) && fragmentGetUserVisibleHint(objInvoke) && fragmentIsResumed(objInvoke)) {
                return true;
            }
        } catch (Exception e12) {
            SALog.printStackTrace(e12);
        }
        return false;
    }

    public static boolean isFragment(Object obj) {
        Class<?> cls;
        Class<Fragment> cls2;
        Class<Fragment> cls3 = Fragment.class;
        if (obj == null) {
            return false;
        }
        try {
            cls = Class.forName("android.app.Fragment");
        } catch (Exception unused) {
            cls = null;
        }
        try {
            int i11 = Fragment.f2711T;
            cls2 = cls3;
        } catch (Exception unused2) {
            cls2 = null;
        }
        try {
            int i12 = Fragment.f2711T;
        } catch (Exception unused3) {
            cls3 = null;
        }
        if (cls2 == null && cls3 == null && cls == null) {
            return false;
        }
        if (cls2 != null) {
            try {
                if (cls2.isInstance(obj)) {
                    return true;
                }
                if (cls3 == null && cls3.isInstance(obj)) {
                    return true;
                }
                if (cls == null && cls.isInstance(obj)) {
                    return true;
                }
            } catch (Exception unused4) {
            }
        } else {
            if (cls3 == null) {
            }
            if (cls == null) {
            }
        }
        return false;
    }
}
