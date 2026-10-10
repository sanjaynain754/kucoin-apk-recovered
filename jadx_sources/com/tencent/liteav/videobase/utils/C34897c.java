package com.tencent.liteav.videobase.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: renamed from: com.tencent.liteav.videobase.utils.c */
/* JADX INFO: loaded from: classes59.dex */
public final class C34897c {

    /* JADX INFO: renamed from: f */
    private static final Object f74305f = new Object();

    /* JADX INFO: renamed from: g */
    private static C34897c f74306g;

    /* JADX INFO: renamed from: a */
    final Context f74307a;

    /* JADX INFO: renamed from: e */
    private final Handler f74311e;

    /* JADX INFO: renamed from: b */
    final HashMap<BroadcastReceiver, ArrayList<b>> f74308b = new HashMap<>();

    /* JADX INFO: renamed from: d */
    private final HashMap<String, ArrayList<b>> f74310d = new HashMap<>();

    /* JADX INFO: renamed from: c */
    final ArrayList<a> f74309c = new ArrayList<>();

    /* JADX INFO: renamed from: com.tencent.liteav.videobase.utils.c$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        final IntentFilter f74315a;

        /* JADX INFO: renamed from: b */
        final BroadcastReceiver f74316b;

        /* JADX INFO: renamed from: c */
        boolean f74317c;

        /* JADX INFO: renamed from: d */
        boolean f74318d;

        public final String toString() {
            StringBuilder sb2 = new StringBuilder(128);
            sb2.append("Receiver{");
            sb2.append(this.f74316b);
            sb2.append(" filter=");
            sb2.append(this.f74315a);
            if (this.f74318d) {
                sb2.append(" DEAD");
            }
            sb2.append("}");
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: a */
    public static C34897c m76557a() {
        C34897c c34897c;
        synchronized (f74305f) {
            try {
                if (f74306g == null) {
                    f74306g = new C34897c(ContextUtils.getApplicationContext());
                }
                c34897c = f74306g;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c34897c;
    }

    /* JADX INFO: renamed from: com.tencent.liteav.videobase.utils.c$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        final Intent f74313a;

        /* JADX INFO: renamed from: b */
        final ArrayList<b> f74314b;

        public a(Intent intent, ArrayList<b> arrayList) {
            this.f74313a = intent;
            this.f74314b = arrayList;
        }
    }

    private C34897c(Context context) {
        this.f74307a = context;
        this.f74311e = new Handler(context.getMainLooper()) { // from class: com.tencent.liteav.videobase.utils.c.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                int size;
                a[] aVarArr;
                if (message.what != 1) {
                    super.handleMessage(message);
                    return;
                }
                C34897c c34897c = C34897c.this;
                while (true) {
                    synchronized (c34897c.f74308b) {
                        try {
                            size = c34897c.f74309c.size();
                            if (size <= 0) {
                                return;
                            }
                            aVarArr = new a[size];
                            c34897c.f74309c.toArray(aVarArr);
                            c34897c.f74309c.clear();
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    for (int i11 = 0; i11 < size; i11++) {
                        a aVar = aVarArr[i11];
                        int size2 = aVar.f74314b.size();
                        for (int i12 = 0; i12 < size2; i12++) {
                            b bVar = aVar.f74314b.get(i12);
                            if (!bVar.f74318d) {
                                bVar.f74316b.onReceive(c34897c.f74307a, aVar.f74313a);
                            }
                        }
                    }
                }
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public final boolean m76558a(Intent intent) {
        String str;
        synchronized (this.f74308b) {
            try {
                String action = intent.getAction();
                String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f74307a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z11 = (intent.getFlags() & 8) != 0;
                if (z11) {
                    LiteavLog.m76090v("LocalBroadcastManager", "Resolving type " + strResolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList<b> arrayList = this.f74310d.get(intent.getAction());
                if (arrayList != null) {
                    if (z11) {
                        LiteavLog.m76090v("LocalBroadcastManager", "Action list: ".concat(String.valueOf(arrayList)));
                    }
                    ArrayList arrayList2 = null;
                    int i11 = 0;
                    while (i11 < arrayList.size()) {
                        b bVar = arrayList.get(i11);
                        if (z11) {
                            LiteavLog.m76090v("LocalBroadcastManager", "Matching against filter " + bVar.f74315a);
                        }
                        if (bVar.f74317c) {
                            if (z11) {
                                LiteavLog.m76090v("LocalBroadcastManager", "  Filter's target already added");
                            }
                            action = action;
                        } else {
                            int iMatch = bVar.f74315a.match(action, strResolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                            if (iMatch >= 0) {
                                if (z11) {
                                    LiteavLog.m76090v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(iMatch));
                                }
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                }
                                arrayList2.add(bVar);
                                bVar.f74317c = true;
                            } else {
                                action = action;
                                if (z11) {
                                    if (iMatch == -4) {
                                        str = "category";
                                    } else if (iMatch == -3) {
                                        str = TUIConstants.TIMPush.NOTIFICATION.ACTION;
                                    } else if (iMatch == -2) {
                                        str = "data";
                                    } else if (iMatch != -1) {
                                        str = "unknown reason";
                                    } else {
                                        str = "type";
                                    }
                                    LiteavLog.m76090v("LocalBroadcastManager", "  Filter did not match: ".concat(str));
                                }
                            }
                        }
                        i11++;
                        action = action;
                    }
                    if (arrayList2 != null) {
                        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                            ((b) arrayList2.get(i12)).f74317c = false;
                        }
                        this.f74309c.add(new a(intent, arrayList2));
                        if (!this.f74311e.hasMessages(1)) {
                            this.f74311e.sendEmptyMessage(1);
                        }
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
