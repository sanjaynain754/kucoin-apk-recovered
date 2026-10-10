package com.appsflyer.internal;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tencent.rtmp.downloader.TXVodDownloadDataSource;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1dSDK {
    private final LinkedHashMap<String, Object> getMediationNetwork;
    public static final Object getRevenue = new Object() { // from class: com.appsflyer.internal.AFg1dSDK.3
        public final int hashCode() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return obj == this || obj == null;
        }

        public final String toString() {
            return "null";
        }
    };
    private static final Double getCurrencyIso4217Code = Double.valueOf(-0.0d);

    public AFg1dSDK() {
        this.getMediationNetwork = new LinkedHashMap<>();
    }

    public final AFg1dSDK AFAdRevenueData(String str, Object obj) throws Throwable {
        if (obj == null) {
            this.getMediationNetwork.remove(str);
            return this;
        }
        if (obj instanceof Number) {
            try {
                Object[] objArr = {Double.valueOf(((Number) obj).doubleValue())};
                Map map = AFa1hSDK.f6283e;
                Object method = map.get(-2091871728);
                if (method == null) {
                    method = ((Class) AFa1hSDK.getMediationNetwork(285 - ImageFormat.getBitsPerPixel(0), (char) (13138 - Process.getGidForName("")), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 36)).getMethod("AFAdRevenueData", Double.TYPE);
                    map.put(-2091871728, method);
                }
                ((Double) ((Method) method).invoke(null, objArr)).getClass();
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            }
        }
        LinkedHashMap<String, Object> linkedHashMap = this.getMediationNetwork;
        if (str == null) {
            throw new AFg1iSDK("Names must be non-null");
        }
        linkedHashMap.put(str, obj);
        return this;
    }

    public static String getMediationNetwork(Number number) throws Throwable {
        if (number == null) {
            throw new AFg1iSDK("Number must be non-null");
        }
        double dDoubleValue = number.doubleValue();
        try {
            Object[] objArr = {Double.valueOf(dDoubleValue)};
            Map map = AFa1hSDK.f6283e;
            Object declaredMethod = map.get(-2091871728);
            if (declaredMethod == null) {
                declaredMethod = ((Class) AFa1hSDK.getMediationNetwork(ExpandableListView.getPackedPositionChild(0L) + 287, (char) (13139 - (Process.myTid() >> 22)), 36 - ExpandableListView.getPackedPositionGroup(0L))).getDeclaredMethod("AFAdRevenueData", Double.TYPE);
                map.put(-2091871728, declaredMethod);
            }
            ((Double) ((Method) declaredMethod).invoke(null, objArr)).getClass();
            if (number.equals(getCurrencyIso4217Code)) {
                return "-0";
            }
            long jLongValue = number.longValue();
            return dDoubleValue == ((double) jLongValue) ? Long.toString(jLongValue) : number.toString();
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    public static Object getRevenue(Object obj) throws Throwable {
        if (obj == null) {
            return getRevenue;
        }
        if (((Class) AFa1hSDK.getMediationNetwork((Process.myTid() >> 22) + 322, (char) (KeyEvent.getMaxKeyCode() >> 16), 36 - MotionEvent.axisFromString(""))).isInstance(obj) || (obj instanceof AFg1dSDK)) {
            return obj;
        }
        try {
            if (obj instanceof JSONArray) {
                try {
                    Object[] objArr = {obj.toString()};
                    Map map = AFa1hSDK.f6283e;
                    Object declaredConstructor = map.get(224224126);
                    if (declaredConstructor == null) {
                        declaredConstructor = ((Class) AFa1hSDK.getMediationNetwork(322 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) ExpandableListView.getPackedPositionType(0L), 37 - Color.alpha(0))).getDeclaredConstructor(String.class);
                        map.put(224224126, declaredConstructor);
                    }
                    obj = ((Constructor) declaredConstructor).newInstance(objArr);
                    return obj;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th2;
                }
            }
            if (obj instanceof JSONObject) {
                return new AFg1dSDK(obj.toString());
            }
            if (obj.equals(getRevenue)) {
                return obj;
            }
            try {
                if (obj instanceof Collection) {
                    try {
                        Object[] objArr2 = {(Collection) obj};
                        Map map2 = AFa1hSDK.f6283e;
                        Object declaredConstructor2 = map2.get(1406949303);
                        if (declaredConstructor2 == null) {
                            declaredConstructor2 = ((Class) AFa1hSDK.getMediationNetwork((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 321, (char) (KeyEvent.getMaxKeyCode() >> 16), 38 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))).getDeclaredConstructor(Collection.class);
                            map2.put(1406949303, declaredConstructor2);
                        }
                        return ((Constructor) declaredConstructor2).newInstance(objArr2);
                    } catch (Throwable th3) {
                        Throwable cause2 = th3.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th3;
                    }
                }
                if (obj.getClass().isArray()) {
                    try {
                        Object[] objArr3 = {obj};
                        Map map3 = AFa1hSDK.f6283e;
                        Object declaredConstructor3 = map3.get(-1480289492);
                        if (declaredConstructor3 == null) {
                            declaredConstructor3 = ((Class) AFa1hSDK.getMediationNetwork(322 - (Process.myPid() >> 22), (char) (ViewConfiguration.getLongPressTimeout() >> 16), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 36)).getDeclaredConstructor(Object.class);
                            map3.put(-1480289492, declaredConstructor3);
                        }
                        return ((Constructor) declaredConstructor3).newInstance(objArr3);
                    } catch (Throwable th4) {
                        Throwable cause3 = th4.getCause();
                        if (cause3 != null) {
                            throw cause3;
                        }
                        throw th4;
                    }
                }
                if (obj instanceof Map) {
                    return new AFg1dSDK((Map) obj);
                }
                if ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) {
                    return obj;
                }
                if (obj.getClass().getPackage().getName().startsWith("java.")) {
                    return obj.toString();
                }
                return null;
            } catch (Exception unused) {
            }
            return null;
        } catch (AFg1iSDK unused2) {
        }
    }

    public final String toString() {
        try {
            AFg1hSDK aFg1hSDK = new AFg1hSDK();
            AFAdRevenueData(aFg1hSDK);
            return aFg1hSDK.toString();
        } catch (AFg1iSDK unused) {
            return null;
        }
    }

    public AFg1dSDK(Map map) {
        this();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str != null) {
                this.getMediationNetwork.put(str, getRevenue(entry.getValue()));
            } else {
                throw new NullPointerException("key == null");
            }
        }
    }

    public final void AFAdRevenueData(AFg1hSDK aFg1hSDK) throws AFg1iSDK {
        aFg1hSDK.AFAdRevenueData(AFg1hSDK.AFa1vSDK.EMPTY_OBJECT, "{");
        for (Map.Entry<String, Object> entry : this.getMediationNetwork.entrySet()) {
            String key = entry.getKey();
            if (key != null) {
                aFg1hSDK.getRevenue();
                aFg1hSDK.getMonetizationNetwork(key);
                aFg1hSDK.AFAdRevenueData(entry.getValue());
            } else {
                throw new AFg1iSDK("Names must be non-null");
            }
        }
        aFg1hSDK.getMonetizationNetwork(AFg1hSDK.AFa1vSDK.EMPTY_OBJECT, AFg1hSDK.AFa1vSDK.NONEMPTY_OBJECT, "}");
    }

    private AFg1dSDK(Object obj) throws Throwable {
        try {
            Map map = AFa1hSDK.f6283e;
            Object declaredMethod = map.get(-2008942427);
            if (declaredMethod == null) {
                declaredMethod = ((Class) AFa1hSDK.getMediationNetwork(TextUtils.indexOf((CharSequence) "", '0', 0) + TXVodDownloadDataSource.QUALITY_360P, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), TextUtils.getTrimmedLength("") + 37)).getDeclaredMethod("getCurrencyIso4217Code", null);
                map.put(-2008942427, declaredMethod);
            }
            Object objInvoke = ((Method) declaredMethod).invoke(obj, null);
            if (objInvoke instanceof AFg1dSDK) {
                this.getMediationNetwork = ((AFg1dSDK) objInvoke).getMediationNetwork;
                return;
            }
            Object[] objArr = {objInvoke, "AFJsonObject"};
            Object declaredMethod2 = map.get(2094207066);
            if (declaredMethod2 == null) {
                declaredMethod2 = ((Class) AFa1hSDK.getMediationNetwork(286 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (TextUtils.getOffsetBefore("", 0) + 13139), 37 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)))).getDeclaredMethod("getMediationNetwork", Object.class, String.class);
                map.put(2094207066, declaredMethod2);
            }
            throw ((Throwable) ((Method) declaredMethod2).invoke(null, objArr));
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private AFg1dSDK(String str) throws Throwable {
        try {
            Object[] objArr = {str};
            Map map = AFa1hSDK.f6283e;
            Object declaredConstructor = map.get(1864920862);
            if (declaredConstructor == null) {
                declaredConstructor = ((Class) AFa1hSDK.getMediationNetwork(359 - TextUtils.getCapsMode("", 0, 0), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 36)).getDeclaredConstructor(String.class);
                map.put(1864920862, declaredConstructor);
            }
            this(((Constructor) declaredConstructor).newInstance(objArr));
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }
}
