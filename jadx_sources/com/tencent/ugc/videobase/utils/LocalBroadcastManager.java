package com.tencent.ugc.videobase.utils;

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

/* JADX INFO: loaded from: classes2.dex */
public final class LocalBroadcastManager {
    private static final boolean DEBUG = false;
    static final int MSG_EXEC_PENDING_BROADCASTS = 1;
    private static final String TAG = "LocalBroadcastManager";
    private static LocalBroadcastManager mInstance;
    private static final Object mLock = new Object();
    private final Context mAppContext;
    private final Handler mMainHandler;
    private final HashMap<BroadcastReceiver, ArrayList<C35829b>> mReceivers = new HashMap<>();
    private final HashMap<String, ArrayList<C35829b>> mActions = new HashMap<>();
    private final ArrayList<C35828a> mPendingBroadcasts = new ArrayList<>();

    /* JADX INFO: renamed from: com.tencent.ugc.videobase.utils.LocalBroadcastManager$b */
    public static final class C35829b {

        /* JADX INFO: renamed from: a */
        final IntentFilter f77377a;

        /* JADX INFO: renamed from: b */
        final BroadcastReceiver f77378b;

        /* JADX INFO: renamed from: c */
        boolean f77379c;

        /* JADX INFO: renamed from: d */
        boolean f77380d;

        public final String toString() {
            StringBuilder sb2 = new StringBuilder(128);
            sb2.append("Receiver{");
            sb2.append(this.f77378b);
            sb2.append(" filter=");
            sb2.append(this.f77377a);
            if (this.f77380d) {
                sb2.append(" DEAD");
            }
            sb2.append("}");
            return sb2.toString();
        }

        public C35829b(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f77377a = intentFilter;
            this.f77378b = broadcastReceiver;
        }
    }

    /* JADX INFO: renamed from: com.tencent.ugc.videobase.utils.LocalBroadcastManager$a */
    public static final class C35828a {

        /* JADX INFO: renamed from: a */
        final Intent f77375a;

        /* JADX INFO: renamed from: b */
        final ArrayList<C35829b> f77376b;

        public C35828a(Intent intent, ArrayList<C35829b> arrayList) {
            this.f77375a = intent;
            this.f77376b = arrayList;
        }
    }

    public static LocalBroadcastManager getInstance() {
        LocalBroadcastManager localBroadcastManager;
        synchronized (mLock) {
            try {
                if (mInstance == null) {
                    mInstance = new LocalBroadcastManager(ContextUtils.getApplicationContext());
                }
                localBroadcastManager = mInstance;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return localBroadcastManager;
    }

    public final void executePendingBroadcasts() {
        int size;
        C35828a[] c35828aArr;
        while (true) {
            synchronized (this.mReceivers) {
                try {
                    size = this.mPendingBroadcasts.size();
                    if (size <= 0) {
                        return;
                    }
                    c35828aArr = new C35828a[size];
                    this.mPendingBroadcasts.toArray(c35828aArr);
                    this.mPendingBroadcasts.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            for (int i11 = 0; i11 < size; i11++) {
                C35828a c35828a = c35828aArr[i11];
                int size2 = c35828a.f77376b.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    C35829b c35829b = c35828a.f77376b.get(i12);
                    if (!c35829b.f77380d) {
                        c35829b.f77378b.onReceive(this.mAppContext, c35828a.f77375a);
                    }
                }
            }
        }
    }

    public final void registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.mReceivers) {
            try {
                C35829b c35829b = new C35829b(intentFilter, broadcastReceiver);
                ArrayList<C35829b> arrayList = this.mReceivers.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList<>(1);
                    this.mReceivers.put(broadcastReceiver, arrayList);
                }
                arrayList.add(c35829b);
                for (int i11 = 0; i11 < intentFilter.countActions(); i11++) {
                    String action = intentFilter.getAction(i11);
                    ArrayList<C35829b> arrayList2 = this.mActions.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>(1);
                        this.mActions.put(action, arrayList2);
                    }
                    arrayList2.add(c35829b);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean sendBroadcast(Intent intent) {
        String str;
        synchronized (this.mReceivers) {
            try {
                String action = intent.getAction();
                String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.mAppContext.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z11 = (intent.getFlags() & 8) != 0;
                if (z11) {
                    LiteavLog.m76090v(TAG, "Resolving type " + strResolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList<C35829b> arrayList = this.mActions.get(intent.getAction());
                if (arrayList != null) {
                    if (z11) {
                        LiteavLog.m76090v(TAG, "Action list: ".concat(String.valueOf(arrayList)));
                    }
                    ArrayList arrayList2 = null;
                    int i11 = 0;
                    while (i11 < arrayList.size()) {
                        C35829b c35829b = arrayList.get(i11);
                        if (z11) {
                            LiteavLog.m76090v(TAG, "Matching against filter " + c35829b.f77377a);
                        }
                        if (c35829b.f77379c) {
                            if (z11) {
                                LiteavLog.m76090v(TAG, "  Filter's target already added");
                            }
                            action = action;
                        } else {
                            int iMatch = c35829b.f77377a.match(action, strResolveTypeIfNeeded, scheme, data, categories, TAG);
                            if (iMatch >= 0) {
                                if (z11) {
                                    LiteavLog.m76090v(TAG, "  Filter matched!  match=0x" + Integer.toHexString(iMatch));
                                }
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                }
                                arrayList2.add(c35829b);
                                c35829b.f77379c = true;
                            } else {
                                action = action;
                                if (z11) {
                                    if (iMatch == -4) {
                                        str = "category";
                                    } else if (iMatch == -3) {
                                        str = TUIConstants.TIMPush.NOTIFICATION.ACTION;
                                    } else if (iMatch != -2) {
                                        str = iMatch != -1 ? "unknown reason" : "type";
                                    } else {
                                        str = "data";
                                    }
                                    LiteavLog.m76090v(TAG, "  Filter did not match: ".concat(str));
                                }
                            }
                        }
                        i11++;
                        action = action;
                    }
                    if (arrayList2 != null) {
                        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                            ((C35829b) arrayList2.get(i12)).f77379c = false;
                        }
                        this.mPendingBroadcasts.add(new C35828a(intent, arrayList2));
                        if (!this.mMainHandler.hasMessages(1)) {
                            this.mMainHandler.sendEmptyMessage(1);
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

    public final void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
        synchronized (this.mReceivers) {
            try {
                ArrayList<C35829b> arrayListRemove = this.mReceivers.remove(broadcastReceiver);
                if (arrayListRemove == null) {
                    return;
                }
                for (int size = arrayListRemove.size() - 1; size >= 0; size--) {
                    C35829b c35829b = arrayListRemove.get(size);
                    c35829b.f77380d = true;
                    for (int i11 = 0; i11 < c35829b.f77377a.countActions(); i11++) {
                        String action = c35829b.f77377a.getAction(i11);
                        ArrayList<C35829b> arrayList = this.mActions.get(action);
                        if (arrayList != null) {
                            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                                C35829b c35829b2 = arrayList.get(size2);
                                if (c35829b2.f77378b == broadcastReceiver) {
                                    c35829b2.f77380d = true;
                                    arrayList.remove(size2);
                                }
                            }
                            if (arrayList.size() <= 0) {
                                this.mActions.remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private LocalBroadcastManager(Context context) {
        this.mAppContext = context;
        this.mMainHandler = new Handler(context.getMainLooper()) { // from class: com.tencent.ugc.videobase.utils.LocalBroadcastManager.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                if (message.what == 1) {
                    LocalBroadcastManager.this.executePendingBroadcasts();
                } else {
                    super.handleMessage(message);
                }
            }
        };
    }

    public final void sendBroadcastSync(Intent intent) {
        if (sendBroadcast(intent)) {
            executePendingBroadcasts();
        }
    }
}
