package com.appsflyer.internal;

import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tencent.bugly.proguard.C33844oi;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public final class AFg1hSDK {
    private StringBuilder getCurrencyIso4217Code = new StringBuilder();
    private final List<AFa1vSDK> getMonetizationNetwork = new ArrayList();
    private final String getRevenue = null;

    public enum AFa1vSDK {
        EMPTY_ARRAY,
        NONEMPTY_ARRAY,
        EMPTY_OBJECT,
        DANGLING_KEY,
        NONEMPTY_OBJECT,
        NULL
    }

    public final AFg1hSDK AFAdRevenueData(AFa1vSDK aFa1vSDK, String str) throws AFg1iSDK {
        if (this.getMonetizationNetwork.isEmpty() && this.getCurrencyIso4217Code.length() > 0) {
            throw new AFg1iSDK("Nesting problem: multiple top-level roots");
        }
        AFAdRevenueData();
        this.getMonetizationNetwork.add(aFa1vSDK);
        this.getCurrencyIso4217Code.append(str);
        return this;
    }

    public final AFg1hSDK getMonetizationNetwork(AFa1vSDK aFa1vSDK, AFa1vSDK aFa1vSDK2, String str) throws AFg1iSDK {
        AFa1vSDK currencyIso4217Code = getCurrencyIso4217Code();
        if (currencyIso4217Code != aFa1vSDK2 && currencyIso4217Code != aFa1vSDK) {
            throw new AFg1iSDK("Nesting problem");
        }
        List<AFa1vSDK> list = this.getMonetizationNetwork;
        list.remove(list.size() - 1);
        this.getCurrencyIso4217Code.append(str);
        return this;
    }

    private AFa1vSDK getCurrencyIso4217Code() throws AFg1iSDK {
        if (this.getMonetizationNetwork.isEmpty()) {
            throw new AFg1iSDK("Nesting problem");
        }
        List<AFa1vSDK> list = this.getMonetizationNetwork;
        return list.get(list.size() - 1);
    }

    public final String toString() {
        if (this.getCurrencyIso4217Code.length() == 0) {
            return null;
        }
        return this.getCurrencyIso4217Code.toString();
    }

    public final void getRevenue() throws AFg1iSDK {
        AFa1vSDK currencyIso4217Code = getCurrencyIso4217Code();
        if (currencyIso4217Code == AFa1vSDK.NONEMPTY_OBJECT) {
            this.getCurrencyIso4217Code.append(',');
        } else if (currencyIso4217Code != AFa1vSDK.EMPTY_OBJECT) {
            throw new AFg1iSDK("Nesting problem");
        }
        AFa1vSDK aFa1vSDK = AFa1vSDK.DANGLING_KEY;
        List<AFa1vSDK> list = this.getMonetizationNetwork;
        list.set(list.size() - 1, aFa1vSDK);
    }

    public final void getMonetizationNetwork(String str) {
        this.getCurrencyIso4217Code.append("\"");
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt == '\f') {
                this.getCurrencyIso4217Code.append("\\f");
            } else if (cCharAt == '\r') {
                this.getCurrencyIso4217Code.append("\\r");
            } else if (cCharAt != '\"' && cCharAt != '/' && cCharAt != '\\') {
                switch (cCharAt) {
                    case '\b':
                        this.getCurrencyIso4217Code.append("\\b");
                        break;
                    case '\t':
                        this.getCurrencyIso4217Code.append("\\t");
                        break;
                    case '\n':
                        this.getCurrencyIso4217Code.append("\\n");
                        break;
                    default:
                        if (cCharAt <= 31) {
                            this.getCurrencyIso4217Code.append(String.format("\\u%04x", Integer.valueOf(cCharAt)));
                        } else {
                            this.getCurrencyIso4217Code.append(cCharAt);
                        }
                        break;
                }
            } else {
                StringBuilder sb2 = this.getCurrencyIso4217Code;
                sb2.append('\\');
                sb2.append(cCharAt);
            }
        }
        this.getCurrencyIso4217Code.append("\"");
    }

    public final AFg1hSDK AFAdRevenueData(Object obj) throws AFg1iSDK {
        if (!this.getMonetizationNetwork.isEmpty()) {
            if (((Class) AFa1hSDK.getMediationNetwork((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 321, (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), View.MeasureSpec.makeMeasureSpec(0, 0) + 37)).isInstance(obj)) {
                try {
                    Object[] objArr = {this};
                    Map map = AFa1hSDK.f6283e;
                    Object declaredMethod = map.get(-1941649486);
                    if (declaredMethod == null) {
                        declaredMethod = ((Class) AFa1hSDK.getMediationNetwork(322 - (KeyEvent.getMaxKeyCode() >> 16), (char) TextUtils.getCapsMode("", 0, 0), (Process.myPid() >> 22) + 37)).getDeclaredMethod("getCurrencyIso4217Code", AFg1hSDK.class);
                        map.put(-1941649486, declaredMethod);
                    }
                    ((Method) declaredMethod).invoke(obj, objArr);
                    return this;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th2;
                }
            }
            if (obj instanceof AFg1dSDK) {
                ((AFg1dSDK) obj).AFAdRevenueData(this);
                return this;
            }
            AFAdRevenueData();
            if (obj != null && !(obj instanceof Boolean) && obj != AFg1dSDK.getRevenue) {
                if (obj instanceof Number) {
                    this.getCurrencyIso4217Code.append(AFg1dSDK.getMediationNetwork((Number) obj));
                    return this;
                }
                getMonetizationNetwork(obj.toString());
                return this;
            }
            this.getCurrencyIso4217Code.append(obj);
            return this;
        }
        throw new AFg1iSDK("Nesting problem");
    }

    private void AFAdRevenueData() throws AFg1iSDK {
        if (this.getMonetizationNetwork.isEmpty()) {
            return;
        }
        AFa1vSDK currencyIso4217Code = getCurrencyIso4217Code();
        if (currencyIso4217Code == AFa1vSDK.EMPTY_ARRAY) {
            AFa1vSDK aFa1vSDK = AFa1vSDK.NONEMPTY_ARRAY;
            List<AFa1vSDK> list = this.getMonetizationNetwork;
            list.set(list.size() - 1, aFa1vSDK);
        } else {
            if (currencyIso4217Code == AFa1vSDK.NONEMPTY_ARRAY) {
                this.getCurrencyIso4217Code.append(',');
                return;
            }
            if (currencyIso4217Code == AFa1vSDK.DANGLING_KEY) {
                this.getCurrencyIso4217Code.append(C33844oi.f71346o);
                AFa1vSDK aFa1vSDK2 = AFa1vSDK.NONEMPTY_OBJECT;
                List<AFa1vSDK> list2 = this.getMonetizationNetwork;
                list2.set(list2.size() - 1, aFa1vSDK2);
                return;
            }
            if (currencyIso4217Code != AFa1vSDK.NULL) {
                throw new AFg1iSDK("Nesting problem");
            }
        }
    }
}
