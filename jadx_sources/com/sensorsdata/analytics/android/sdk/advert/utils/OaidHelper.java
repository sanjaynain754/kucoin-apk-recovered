package com.sensorsdata.analytics.android.sdk.advert.utils;

import android.content.Context;
import android.text.TextUtils;
import com.sensorsdata.analytics.android.sdk.SALog;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes59.dex */
public class OaidHelper {
    private static final String TAG = "SA.DeviceUtils";
    private static Class<?> jLibrary = null;
    private static CountDownLatch mCountDownLatch = null;
    private static Class<?> mIdSupplier = null;
    private static Class<?> mIdentifyListener = null;
    private static Class<?> mMidSDKHelper = null;
    private static String mOAID = "";
    public static String oaidCertPath;

    public static class IdentifyListenerHandler implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            try {
                if (!"OnSupport".equalsIgnoreCase(method.getName())) {
                    return null;
                }
                Method declaredMethod = OaidHelper.mIdSupplier.getDeclaredMethod("getOAID", new Class[0]);
                if (objArr.length == 1) {
                    String unused = OaidHelper.mOAID = (String) declaredMethod.invoke(objArr[0], new Object[0]);
                } else {
                    String unused2 = OaidHelper.mOAID = (String) declaredMethod.invoke(objArr[1], new Object[0]);
                }
                SALog.m68587d(OaidHelper.TAG, "oaid:" + OaidHelper.mOAID);
                OaidHelper.mCountDownLatch.countDown();
                return null;
            } catch (Throwable unused3) {
                OaidHelper.mCountDownLatch.countDown();
                return null;
            }
        }
    }

    private static void getOAIDReflect(Context context, int i11) {
        if (i11 == 0) {
            return;
        }
        try {
            initPemCert(context);
            Class<?> cls = jLibrary;
            if (cls != null) {
                cls.getDeclaredMethod("InitEntry", Context.class).invoke(null, context);
            }
            int iIntValue = ((Integer) mMidSDKHelper.getDeclaredMethod("InitSdk", Context.class, Boolean.TYPE, mIdentifyListener).invoke(null, context, Boolean.TRUE, Proxy.newProxyInstance(context.getClassLoader(), new Class[]{mIdentifyListener}, new IdentifyListenerHandler()))).intValue();
            SALog.m68587d(TAG, "MdidSdkHelper ErrorCode : " + iIntValue);
            if (iIntValue != 1008614 && iIntValue != 1008610) {
                i11--;
                getOAIDReflect(context, i11);
                if (i11 == 0) {
                    mCountDownLatch.countDown();
                }
            }
            new Thread(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.advert.utils.OaidHelper.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Thread.sleep(2000L);
                    } catch (InterruptedException unused) {
                    }
                    OaidHelper.mCountDownLatch.countDown();
                }
            }).start();
        } catch (Throwable th2) {
            SALog.m68587d(TAG, th2.getMessage());
            int i12 = i11 - 1;
            getOAIDReflect(context, i12);
            if (i12 == 0) {
                mCountDownLatch.countDown();
            }
        }
    }

    private static String getRomOAID(Context context) {
        try {
            mCountDownLatch = new CountDownLatch(1);
            initInvokeListener();
            if (mMidSDKHelper != null && mIdentifyListener != null && mIdSupplier != null) {
                if (!TextUtils.isEmpty(mOAID)) {
                    return mOAID;
                }
                getOAIDReflect(context, 2);
                try {
                    mCountDownLatch.await();
                } catch (InterruptedException e11) {
                    SALog.printStackTrace(e11);
                }
                SALog.m68587d(TAG, "CountDownLatch await");
                return mOAID;
            }
            SALog.m68587d(TAG, "OAID 读取类创建失败");
            return "";
        } catch (Throwable th2) {
            SALog.m68587d(TAG, th2.getMessage());
            return "";
        }
    }

    private static void initInvokeListener() {
        try {
            mMidSDKHelper = Class.forName("com.bun.miitmdid.core.MdidSdkHelper");
            try {
                try {
                    try {
                        mIdentifyListener = Class.forName("com.bun.miitmdid.interfaces.IIdentifierListener");
                        mIdSupplier = Class.forName("com.bun.miitmdid.interfaces.IdSupplier");
                    } catch (Exception unused) {
                        mIdentifyListener = Class.forName("com.bun.supplier.IIdentifierListener");
                        mIdSupplier = Class.forName("com.bun.supplier.IdSupplier");
                        jLibrary = Class.forName("com.bun.miitmdid.core.JLibrary");
                    }
                } catch (Exception unused2) {
                }
            } catch (Exception unused3) {
                mIdentifyListener = Class.forName("com.bun.miitmdid.core.IIdentifierListener");
                mIdSupplier = Class.forName("com.bun.miitmdid.supplier.IdSupplier");
                jLibrary = Class.forName("com.bun.miitmdid.core.JLibrary");
            }
        } catch (ClassNotFoundException e11) {
            SALog.m68587d(TAG, e11.getMessage());
        }
    }

    private static String loadPemFromAssetFile(Context context) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getAssets().open(context.getPackageName() + ".cert.pem")));
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    return sb2.toString();
                }
                sb2.append(line);
                sb2.append('\n');
            }
        } catch (IOException unused) {
            SALog.m68587d(TAG, "loadPemFromAssetFile failed");
            return "";
        }
    }

    static {
        initSDKLibrary();
    }

    public static String getOAID(Context context) {
        String romOAID = getRomOAID(context);
        SALog.m68589i(TAG, "romOAID is " + romOAID);
        if ("00000000-0000-0000-0000-000000000000".equals(romOAID)) {
            return "";
        }
        return romOAID;
    }

    private static void initPemCert(Context context) {
        try {
            String strLoadPemFromAssetFile = loadPemFromAssetFile(context);
            oaidCertPath = strLoadPemFromAssetFile;
            if (!TextUtils.isEmpty(strLoadPemFromAssetFile)) {
                mMidSDKHelper.getDeclaredMethod("InitCert", Context.class, String.class).invoke(null, context, oaidCertPath);
            }
        } catch (Throwable th2) {
            SALog.m68587d(TAG, th2.getMessage());
        }
    }

    private static void initSDKLibrary() {
        try {
            System.loadLibrary("nllvm1623827671");
        } catch (Throwable unused) {
        }
    }
}
