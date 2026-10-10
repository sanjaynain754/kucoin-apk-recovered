package com.tencent.thumbplayer.tcmedia.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.utils.i */
/* JADX INFO: loaded from: classes64.dex */
public class C35429i extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    private static int f76590a = 0;

    /* JADX INFO: renamed from: b */
    private static String f76591b = "unknown";

    /* JADX INFO: renamed from: c */
    private static int f76592c;

    /* JADX INFO: renamed from: d */
    private static int f76593d;

    /* JADX INFO: renamed from: e */
    private static String f76594e;

    /* JADX INFO: renamed from: f */
    private ArrayList<b> f76595f;

    /* JADX INFO: renamed from: g */
    private HandlerThread f76596g;

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.utils.i$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private static C35429i f76597a = new C35429i();
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.utils.i$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo78010a(int i11, int i12, int i13, int i14);
    }

    private C35429i() {
        this.f76595f = null;
        this.f76595f = new ArrayList<>();
    }

    /* JADX INFO: renamed from: a */
    public static C35429i m78882a() {
        return a.f76597a;
    }

    /* JADX INFO: renamed from: b */
    public static int m78885b() {
        return f76592c;
    }

    /* JADX INFO: renamed from: c */
    public static int m78888c() {
        return f76590a;
    }

    /* JADX INFO: renamed from: e */
    private synchronized void m78891e() {
        try {
            boolean z11 = (f76590a == f76593d && TextUtils.equals(f76591b, f76594e)) ? false : true;
            TPLogUtil.m78800i("TPNetworkChangeMonitor", "notifyIfNetChanged, isNetChanged: " + z11 + ",  mListeners:  " + this.f76595f);
            TPLogUtil.m78800i("TPNetworkChangeMonitor", "onNetworkStatusChanged oldNetStatus: " + f76593d + ", netStatus: " + f76590a + ", mobileNetSubType" + f76592c);
            if (z11) {
                Iterator<b> it = this.f76595f.iterator();
                while (it.hasNext()) {
                    it.next().mo78010a(f76593d, f76590a, 0, f76592c);
                }
                f76593d = f76590a;
                f76594e = f76591b;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: b */
    private static int m78886b(NetworkInfo networkInfo) {
        if (networkInfo != null) {
            switch (networkInfo.getSubtype()) {
                case 0:
                    break;
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                    return 2;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                    return 3;
                case 13:
                    return 4;
                default:
                    return 3;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    private String m78889c(NetworkInfo networkInfo) {
        String str = "unknown";
        if (networkInfo != null && networkInfo.isConnected()) {
            int type = networkInfo.getType();
            if (type == 1) {
                str = "wifi";
            } else if (type == 9) {
                str = "ethernet";
            } else if (type == 0) {
                str = "mobilenet";
            }
            TPLogUtil.m78796d("TPNetworkChangeMonitor", "getDetailNetworkType, typeDesc: ".concat(str));
        }
        return str;
    }

    /* JADX INFO: renamed from: f */
    private void m78892f() {
        TPLogUtil.m78796d("TPNetworkChangeMonitor", "-->updateNetStatus(), mNetStatus=" + f76590a + "[wifi: 2, mobile: 3], lastNetStatus=" + f76593d + ", mDetailNetworkType=" + f76591b + ", mobileNetSubType=" + f76592c + "[2G:2 3G:3 4G:4], currentDetailNetType=" + f76591b + ", lastDetailNetType=" + f76594e);
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m78893a(Context context) {
        try {
            C35422b.m78844a(context, "context can not be null!");
            if (this.f76596g == null) {
                this.f76596g = C35435o.m78917a().m78922b();
            }
            m78883a(context, new Handler(this.f76596g.getLooper()));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        StringBuilder sb2 = new StringBuilder("onReceive broadcast action and update net status,onReceive broadcast in ");
        sb2.append(m78890d() ? "main" : "work");
        sb2.append(" thread.");
        TPLogUtil.m78796d("TPNetworkChangeMonitor", sb2.toString());
        m78887b(context);
    }

    /* JADX INFO: renamed from: a */
    private synchronized void m78883a(Context context, Handler handler) {
        if (context != null) {
            context.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"), null, handler);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x004e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051 A[Catch: Exception -> 0x0073, TryCatch #0 {Exception -> 0x0073, blocks: (B:3:0x0002, B:6:0x000e, B:8:0x0020, B:10:0x0026, B:23:0x0048, B:31:0x005d, B:33:0x0067, B:34:0x006d, B:28:0x0051, B:29:0x0058, B:30:0x005b, B:11:0x0029, B:13:0x002f, B:14:0x0033, B:15:0x0036, B:17:0x003c, B:21:0x0045), top: B:37:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0058 A[Catch: Exception -> 0x0073, TryCatch #0 {Exception -> 0x0073, blocks: (B:3:0x0002, B:6:0x000e, B:8:0x0020, B:10:0x0026, B:23:0x0048, B:31:0x005d, B:33:0x0067, B:34:0x006d, B:28:0x0051, B:29:0x0058, B:30:0x005b, B:11:0x0029, B:13:0x002f, B:14:0x0033, B:15:0x0036, B:17:0x003c, B:21:0x0045), top: B:37:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x005b A[Catch: Exception -> 0x0073, TryCatch #0 {Exception -> 0x0073, blocks: (B:3:0x0002, B:6:0x000e, B:8:0x0020, B:10:0x0026, B:23:0x0048, B:31:0x005d, B:33:0x0067, B:34:0x006d, B:28:0x0051, B:29:0x0058, B:30:0x005b, B:11:0x0029, B:13:0x002f, B:14:0x0033, B:15:0x0036, B:17:0x003c, B:21:0x0045), top: B:37:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0067 A[Catch: Exception -> 0x0073, TryCatch #0 {Exception -> 0x0073, blocks: (B:3:0x0002, B:6:0x000e, B:8:0x0020, B:10:0x0026, B:23:0x0048, B:31:0x005d, B:33:0x0067, B:34:0x006d, B:28:0x0051, B:29:0x0058, B:30:0x005b, B:11:0x0029, B:13:0x002f, B:14:0x0033, B:15:0x0036, B:17:0x003c, B:21:0x0045), top: B:37:0x0002 }] */
    /* JADX INFO: renamed from: b */
    private void m78887b(Context context) {
        ConnectivityManager connectivityManager;
        int i11;
        String strM78889c;
        if (context != null) {
            try {
                connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            } catch (Exception unused) {
                return;
            }
        } else {
            connectivityManager = null;
        }
        if (connectivityManager != null) {
            NetworkInfo networkInfo = connectivityManager.getNetworkInfo(0);
            NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(1);
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (m78884a(activeNetworkInfo)) {
                    f76590a = m78884a(networkInfo) ? 3 : 2;
                }
                networkInfo = activeNetworkInfo;
                i11 = f76590a;
                if (i11 == 1) {
                    f76592c = 0;
                } else if (i11 == 2) {
                    f76592c = 1;
                } else if (i11 == 3) {
                    f76592c = m78886b(networkInfo);
                }
                strM78889c = m78889c(networkInfo);
                f76591b = strM78889c;
                if (f76593d == 0) {
                    f76593d = f76590a;
                    f76594e = strM78889c;
                }
                m78892f();
                m78891e();
            }
            if (m78884a(networkInfo)) {
                f76590a = 3;
            } else if (m78884a(networkInfo2)) {
                f76590a = 2;
                networkInfo = networkInfo2;
            }
            i11 = f76590a;
            if (i11 == 1) {
                f76592c = 0;
            } else if (i11 == 2) {
                f76592c = 1;
            } else if (i11 == 3) {
                f76592c = m78886b(networkInfo);
            }
            strM78889c = m78889c(networkInfo);
            f76591b = strM78889c;
            if (f76593d == 0) {
                f76593d = f76590a;
                f76594e = strM78889c;
            }
            m78892f();
            m78891e();
            f76590a = 1;
            networkInfo = activeNetworkInfo;
            i11 = f76590a;
            if (i11 == 1) {
                f76592c = 0;
            } else if (i11 == 2) {
                f76592c = 1;
            } else if (i11 == 3) {
                f76592c = m78886b(networkInfo);
            }
            strM78889c = m78889c(networkInfo);
            f76591b = strM78889c;
            if (f76593d == 0) {
                f76593d = f76590a;
                f76594e = strM78889c;
            }
            m78892f();
            m78891e();
        }
    }

    /* JADX INFO: renamed from: d */
    private static boolean m78890d() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m78894a(b bVar) {
        ArrayList<b> arrayList = this.f76595f;
        if (arrayList != null && !arrayList.contains(bVar)) {
            this.f76595f.add(bVar);
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m78895b(b bVar) {
        ArrayList<b> arrayList = this.f76595f;
        if (arrayList != null) {
            arrayList.remove(bVar);
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m78884a(NetworkInfo networkInfo) {
        if (networkInfo != null) {
            return networkInfo.isConnected() || networkInfo.isConnectedOrConnecting();
        }
        return false;
    }
}
