package com.datavisorobfus;

import android.content.ContentResolver;
import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Process;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.autofill.HintConstants;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashSet;

/* JADX INFO: renamed from: com.datavisorobfus.o0 */
/* JADX INFO: loaded from: classes34.dex */
public class C5435o0 {
    /* JADX INFO: renamed from: a */
    public static int m7242a(Object obj, String str) throws NoSuchFieldException {
        Field declaredField = obj.getClass().getEnclosingClass().getDeclaredField(str);
        declaredField.setAccessible(true);
        return ((Integer) declaredField.get(obj)).intValue();
    }

    /* JADX INFO: renamed from: a */
    public static String m7243a(Context context) {
        try {
            Class<?> cls = Class.forName("android.os.UserHandle");
            Class cls2 = Integer.TYPE;
            Method declaredMethod = cls.getDeclaredMethod("getUserId", cls2);
            declaredMethod.setAccessible(true);
            Integer num = (Integer) declaredMethod.invoke(null, Integer.valueOf(Process.myUid()));
            num.intValue();
            Method declaredMethod2 = Class.forName("android.provider.Settings$Secure").getDeclaredMethod("getStringForUser", ContentResolver.class, String.class, cls2);
            declaredMethod2.setAccessible(true);
            return (String) declaredMethod2.invoke(null, context.getContentResolver(), "android_id", num);
        } catch (Throwable unused) {
            return "exception";
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m7246b(Context context) {
        Class cls = Integer.TYPE;
        try {
            ContentResolver contentResolver = context.getContentResolver();
            Method declaredMethod = Class.forName("android.os.UserHandle").getDeclaredMethod("getUserId", cls);
            declaredMethod.setAccessible(true);
            Integer num = (Integer) declaredMethod.invoke(null, Integer.valueOf(Process.myUid()));
            num.intValue();
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            try {
                Class<?> cls2 = Class.forName("android.provider.Settings$Global");
                Field declaredField = cls2.getDeclaredField("MOVED_TO_SECURE");
                declaredField.setAccessible(true);
                hashSet = (HashSet) declaredField.get(cls2);
            } catch (Throwable unused) {
            }
            try {
                Class<?> cls3 = Class.forName("android.provider.Settings$Secure");
                Field declaredField2 = cls3.getDeclaredField("MOVED_TO_LOCK_SETTINGS");
                declaredField2.setAccessible(true);
                hashSet2 = (HashSet) declaredField2.get(cls3);
            } catch (Throwable unused2) {
            }
            try {
                Class<?> cls4 = Class.forName("android.provider.Settings$Secure");
                Field declaredField3 = cls4.getDeclaredField("MOVED_TO_GLOBAL");
                declaredField3.setAccessible(true);
                hashSet3 = (HashSet) declaredField3.get(cls4);
            } catch (Throwable unused3) {
            }
            if (!hashSet.contains("android_id")) {
                if (hashSet3.contains("android_id")) {
                    Method declaredMethod2 = Class.forName("android.provider.Global").getDeclaredMethod("getStringForUser", ContentResolver.class, String.class, cls);
                    declaredMethod2.setAccessible(true);
                    return (String) declaredMethod2.invoke(null, contentResolver, "android_id", num);
                }
                if (hashSet2.contains("android_id")) {
                    Method declaredMethod3 = Class.forName("android.os.ServiceManager").getDeclaredMethod("getService", new Class[0]);
                    declaredMethod3.setAccessible(true);
                    IBinder iBinder = (IBinder) declaredMethod3.invoke(null, "lock_settings");
                    Method declaredMethod4 = Class.forName("com.android.internal.widget.ILockSettings$Stub").getDeclaredMethod("asInterface", IBinder.class);
                    declaredMethod4.setAccessible(true);
                    Object objInvoke = declaredMethod4.invoke(null, iBinder);
                    boolean z11 = Process.myUid() == 1000;
                    if (hashSet2.contains("android_id") && objInvoke != null && !z11) {
                        return (String) objInvoke.getClass().getDeclaredMethod("getString", String.class, String.class, cls).invoke("android_id", "0", num);
                    }
                }
            }
            Field declaredField4 = Class.forName("android.provider.Settings$Secure").getDeclaredField("sNameValueCache");
            declaredField4.setAccessible(true);
            Object obj = declaredField4.get(null);
            return (String) obj.getClass().getDeclaredMethod("getStringForUser", ContentResolver.class, String.class, cls).invoke(obj, contentResolver, "android_id", num);
        } catch (Throwable unused4) {
            return "exception";
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m7247c(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
            try {
                try {
                    Method declaredMethod = TelephonyManager.class.getDeclaredMethod("getITelephony", new Class[0]);
                    declaredMethod.setAccessible(true);
                    Object objInvoke = declaredMethod.invoke(telephonyManager, new Object[0]);
                    Method declaredMethod2 = objInvoke.getClass().getDeclaredMethod("getDeviceId", String.class);
                    declaredMethod2.setAccessible(true);
                    return (String) declaredMethod2.invoke(objInvoke, context.getPackageName());
                } catch (Throwable unused) {
                    Method declaredMethod3 = TelephonyManager.class.getDeclaredMethod("getSubscriberInfo", new Class[0]);
                    declaredMethod3.setAccessible(true);
                    Object objInvoke2 = declaredMethod3.invoke(telephonyManager, new Object[0]);
                    Method declaredMethod4 = objInvoke2.getClass().getDeclaredMethod("getDeviceId", String.class);
                    return declaredMethod4 != null ? (String) declaredMethod4.invoke(objInvoke2, context.getPackageName()) : "empty";
                }
            } catch (Throwable unused2) {
                return "exception";
            }
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m7248d(Context context) {
        try {
            Method declaredMethod = Class.forName("android.os.ServiceManager").getDeclaredMethod("getService", String.class);
            declaredMethod.setAccessible(true);
            try {
                IBinder iBinder = (IBinder) declaredMethod.invoke(null, HintConstants.AUTOFILL_HINT_PHONE);
                Method declaredMethod2 = Class.forName("com.android.internal.telephony.ITelephony$Stub").getDeclaredMethod("asInterface", IBinder.class);
                declaredMethod2.setAccessible(true);
                Object objInvoke = declaredMethod2.invoke(null, iBinder);
                Method declaredMethod3 = objInvoke.getClass().getDeclaredMethod("getDeviceId", String.class);
                return declaredMethod3 != null ? (String) declaredMethod3.invoke(objInvoke, context.getPackageName()) : "empty";
            } catch (Throwable unused) {
                IBinder iBinder2 = (IBinder) declaredMethod.invoke(null, "iphonesubinfo");
                Method declaredMethod4 = Class.forName("com.android.internal.telephony.IPhoneSubInfo$Stub").getDeclaredMethod("asInterface", IBinder.class);
                declaredMethod4.setAccessible(true);
                Object objInvoke2 = declaredMethod4.invoke(null, iBinder2);
                Method declaredMethod5 = objInvoke2.getClass().getDeclaredMethod("getDeviceId", String.class);
                return declaredMethod5 != null ? (String) declaredMethod5.invoke(objInvoke2, context.getPackageName()) : "empty";
            }
        } catch (Throwable unused2) {
            return "exception";
        }
        return "exception";
    }

    /* JADX INFO: renamed from: e */
    public static String m7249e(Context context) {
        String strM7245a = "exception";
        try {
            Method declaredMethod = Class.forName("android.os.ServiceManager").getDeclaredMethod("getService", String.class);
            declaredMethod.setAccessible(true);
            try {
                IBinder iBinder = (IBinder) declaredMethod.invoke(null, HintConstants.AUTOFILL_HINT_PHONE);
                Method declaredMethod2 = Class.forName("com.android.internal.telephony.ITelephony$Stub").getDeclaredMethod("asInterface", IBinder.class);
                declaredMethod2.setAccessible(true);
                Object objInvoke = declaredMethod2.invoke(null, iBinder);
                if (objInvoke.getClass().getDeclaredMethod("getDeviceId", String.class) != null) {
                    strM7245a = m7245a(context.getPackageName(), iBinder, m7244a(objInvoke), m7242a(objInvoke, "TRANSACTION_getDeviceId"));
                    return strM7245a;
                }
            } catch (Throwable unused) {
                IBinder iBinder2 = (IBinder) declaredMethod.invoke(null, "iphonesubinfo");
                Method declaredMethod3 = Class.forName("com.android.internal.telephony.IPhoneSubInfo$Stub").getDeclaredMethod("asInterface", IBinder.class);
                declaredMethod3.setAccessible(true);
                Object objInvoke2 = declaredMethod3.invoke(null, iBinder2);
                if (objInvoke2.getClass().getDeclaredMethod("getDeviceId", String.class) != null) {
                    return m7245a(context.getPackageName(), iBinder2, m7244a(objInvoke2), m7242a(objInvoke2, "TRANSACTION_getDeviceId"));
                }
            }
            return "empty";
        } catch (Throwable unused2) {
            return strM7245a;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m7244a(Object obj) {
        return (String) obj.getClass().getDeclaredMethod("getInterfaceDescriptor", new Class[0]).invoke(obj, new Object[0]);
    }

    /* JADX INFO: renamed from: a */
    private static String m7245a(String str, IBinder iBinder, String str2, int i11) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(str2);
            if (!TextUtils.isEmpty(str)) {
                parcelObtain.writeString(str);
            }
            iBinder.transact(i11, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
