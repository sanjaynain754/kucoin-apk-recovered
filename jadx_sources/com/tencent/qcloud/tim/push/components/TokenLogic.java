package com.tencent.qcloud.tim.push.components;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.qcloud.tim.push.TIMPushConstants;
import com.tencent.qcloud.tim.push.config.TIMPushConfig;
import com.tencent.qcloud.tim.push.impl.TIMPushManagerImpl;
import com.tencent.qcloud.tim.push.utils.TIMPushLog;
import com.tencent.qcloud.tim.push.utils.TIMPushUtils;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.qcloud.tuicore.interfaces.TUIServiceCallback;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes56.dex */
public class TokenLogic {

    /* JADX INFO: renamed from: h */
    public static final String f74900h = "TokenLogic";

    /* JADX INFO: renamed from: i */
    public static final int f74901i = 10000;

    /* JADX INFO: renamed from: j */
    public static final int f74902j = 3000;

    /* JADX INFO: renamed from: a */
    public Context f74903a;

    /* JADX INFO: renamed from: c */
    public String f74905c;

    /* JADX INFO: renamed from: b */
    public boolean f74904b = false;

    /* JADX INFO: renamed from: d */
    public String f74906d = "";

    /* JADX INFO: renamed from: e */
    public String f74907e = "";

    /* JADX INFO: renamed from: f */
    public Map<Integer, RequestTask> f74908f = new ConcurrentHashMap();

    /* JADX INFO: renamed from: g */
    public List<OnRequestTokenComplete> f74909g = new CopyOnWriteArrayList();

    public interface OnRequestTokenComplete {
        /* JADX INFO: renamed from: a */
        void mo76856a(int i11, String str, Object obj);
    }

    public class RequestTask extends TUIServiceCallback {

        /* JADX INFO: renamed from: a */
        public int f74910a;

        /* JADX INFO: renamed from: b */
        public int f74911b;

        /* JADX INFO: renamed from: c */
        public int f74912c;

        /* JADX INFO: renamed from: d */
        public TokenRequester f74913d;

        public RequestTask(int i11, int i12, int i13) {
            this.f74910a = i11;
            this.f74911b = i12;
            this.f74912c = i13;
            this.f74913d = new TokenRequester(i11);
        }

        /* JADX INFO: renamed from: a */
        public void m76857a() {
            this.f74913d.m76866a(TokenLogic.this.f74903a, this.f74910a, this.f74911b, this);
        }

        /* JADX INFO: renamed from: b */
        public void m76858b() {
            TokenRequester tokenRequester = this.f74913d;
            if (tokenRequester != null) {
                tokenRequester.m76868b();
                this.f74913d = null;
            }
        }

        @Override // com.tencent.qcloud.tuicore.interfaces.TUIServiceCallback
        public void onServiceCallback(int i11, String str, Bundle bundle) {
            TokenLogic.this.m76847a(this.f74912c, this.f74910a, i11, str, bundle);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m76853b() {
        this.f74905c = "";
        this.f74904b = false;
        this.f74906d = "";
        this.f74907e = "";
        Iterator<Integer> it = this.f74908f.keySet().iterator();
        while (it.hasNext()) {
            RequestTask requestTask = this.f74908f.get(it.next());
            if (requestTask != null) {
                requestTask.m76858b();
            }
        }
        this.f74908f.clear();
        this.f74909g.clear();
    }

    /* JADX INFO: renamed from: a */
    public void m76850a(Context context) {
        this.f74903a = context;
    }

    /* JADX INFO: renamed from: a */
    public String m76844a() {
        return this.f74905c;
    }

    /* JADX INFO: renamed from: a */
    public void m76851a(OnRequestTokenComplete onRequestTokenComplete) {
        if (this.f74909g.contains(onRequestTokenComplete)) {
            return;
        }
        this.f74909g.add(onRequestTokenComplete);
        if (this.f74904b) {
            return;
        }
        this.f74906d = "";
        this.f74907e = "";
        this.f74904b = true;
        int pushChannelId = TIMPushConfig.getInstance().getPushChannelId();
        int iM77036i = TIMPushUtils.m77036i();
        int i11 = pushChannelId == iM77036i ? 2 : 1;
        TIMPushLog.m77016d(f74900h, "requestPushToken start, configuredChannel = " + TIMPushUtils.m77023a(pushChannelId) + ", deviceChannel = " + TIMPushUtils.m77023a(iM77036i) + ", channelType = " + TIMPushUtils.m77029b(i11) + ", backupChannelsEnabled = " + TIMPushConfig.getInstance().isBackupChannelsEnabled());
        RequestTask requestTask = new RequestTask(pushChannelId, 10000, i11);
        this.f74908f.put(Integer.valueOf(pushChannelId), requestTask);
        requestTask.m76857a();
    }

    /* JADX INFO: renamed from: b */
    public void m76855b(String str) {
        this.f74906d = "";
        this.f74907e = "";
        m76848a(TIMPushConfig.getInstance().getPushChannelId(), str);
    }

    /* JADX INFO: renamed from: b */
    public final void m76854b(int i11, int i12, int i13, String str) {
        String str2 = "failedChannel=" + TIMPushUtils.m77023a(i12) + "|channelType=" + TIMPushUtils.m77029b(i11) + "|errorCode=" + i13;
        if (!TextUtils.isEmpty(str)) {
            str2 = str2 + "|errorMessage=" + str;
        }
        String strM76845a = m76845a(i11, i12, i13, str);
        if (TextUtils.isEmpty(this.f74907e)) {
            this.f74907e = strM76845a;
            TIMPushLog.m77016d(f74900h, "request channel failed, " + str2 + ", recordedAsRootCause = " + strM76845a);
            return;
        }
        TIMPushLog.m77016d(f74900h, "request channel failed, " + str2 + ", currentChannelMsg = " + strM76845a + ", keepingRootCause = " + this.f74907e);
    }

    /* JADX INFO: renamed from: a */
    public final void m76848a(int i11, String str) {
        this.f74905c = str;
        Iterator<Integer> it = this.f74908f.keySet().iterator();
        while (it.hasNext()) {
            RequestTask requestTask = this.f74908f.get(it.next());
            if (requestTask != null) {
                requestTask.m76858b();
            }
        }
        this.f74908f.clear();
        for (OnRequestTokenComplete onRequestTokenComplete : this.f74909g) {
            Bundle bundle = new Bundle();
            bundle.putString("pushTokenKey", str);
            bundle.putInt(TUIConstants.TIMPush.PUSH_BRAND_ID_KEY, i11);
            onRequestTokenComplete.mo76856a(0, "", bundle);
        }
        this.f74909g.clear();
        this.f74904b = false;
        this.f74906d = "";
        this.f74907e = "";
    }

    /* JADX INFO: renamed from: a */
    public final void m76849a(int i11, String str, Object obj) {
        if (!TextUtils.isEmpty(this.f74906d)) {
            TIMPushLog.m77017e(f74900h, "requestPushToken final failed, errCode = " + i11 + ", errMsg = " + str + ", builtInChannelDetail = " + this.f74906d);
        } else {
            TIMPushLog.m77017e(f74900h, "requestPushToken final failed, errCode = " + i11 + ", errMsg = " + str);
        }
        Iterator<Integer> it = this.f74908f.keySet().iterator();
        while (it.hasNext()) {
            RequestTask requestTask = this.f74908f.get(it.next());
            if (requestTask != null) {
                requestTask.m76858b();
            }
        }
        this.f74908f.clear();
        Iterator<OnRequestTokenComplete> it2 = this.f74909g.iterator();
        while (it2.hasNext()) {
            it2.next().mo76856a(i11, str, obj);
        }
        this.f74909g.clear();
        this.f74904b = false;
        this.f74906d = "";
        this.f74907e = "";
    }

    /* JADX INFO: renamed from: a */
    public final void m76852a(Set<Integer> set) {
        TIMPushLog.m77016d(f74900h, "detectChannels start, excludeChannelIDs = " + set);
        HashSet<Integer> hashSet = new HashSet();
        hashSet.add(2002);
        hashSet.add(2000);
        hashSet.add(2001);
        hashSet.add(2006);
        hashSet.add(2003);
        hashSet.add(2004);
        hashSet.add(2005);
        for (Integer num : set) {
            num.getClass();
            hashSet.remove(num);
        }
        for (Integer num2 : hashSet) {
            this.f74908f.put(num2, new RequestTask(num2.intValue(), 3000, 3));
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            RequestTask requestTask = this.f74908f.get((Integer) it.next());
            if (requestTask != null) {
                requestTask.m76857a();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m76845a(int i11, int i12, int i13, String str) {
        String strM77023a = TIMPushUtils.m77023a(i12);
        if (i13 == 800008) {
            return strM77023a + " token timeout";
        }
        if (!TextUtils.isEmpty(str) && str.length() <= 120) {
            return str;
        }
        return strM77023a + " token failed code=" + i13;
    }

    /* JADX INFO: renamed from: a */
    public final String m76846a(String str) {
        return !TextUtils.isEmpty(this.f74907e) ? this.f74907e : str;
    }

    /* JADX INFO: renamed from: a */
    public final void m76847a(int i11, int i12, int i13, String str, Bundle bundle) {
        RequestTask requestTask = this.f74908f.get(Integer.valueOf(i12));
        if (requestTask != null) {
            requestTask.m76858b();
            this.f74908f.remove(Integer.valueOf(i12));
        }
        if (i13 == 0 && !TextUtils.isEmpty(str)) {
            TIMPushLog.m77016d(f74900h, "request success, channel = " + TIMPushUtils.m77023a(i12) + ", tokenState = valid");
            TIMPushConfig.getInstance().setPushChannelId(i12);
            if (i11 != 2) {
                TIMPushManagerImpl.m76884c().m76896a(2L, i12, 13L, this.f74906d, TIMPushUtils.m77030c(), TIMPushUtils.m77035h(), null);
            } else if (i11 == 2) {
                this.f74906d = "";
                TIMPushManagerImpl.m76884c().m76896a(2L, i12, 12L, this.f74906d, TIMPushUtils.m77030c(), TIMPushUtils.m77035h(), null);
            } else {
                this.f74906d = "";
            }
            m76848a(i12, str);
            return;
        }
        m76854b(i11, i12, i13, str);
        if (i11 == 1) {
            TIMPushLog.m77016d(f74900h, "request built after specified failed");
            int iM77036i = TIMPushUtils.m77036i();
            RequestTask requestTask2 = new RequestTask(iM77036i, 10000, 2);
            this.f74908f.put(Integer.valueOf(iM77036i), requestTask2);
            requestTask2.m76857a();
            return;
        }
        if (i11 != 2) {
            if (i11 == 4) {
                TIMPushLog.m77016d(f74900h, "request fcm failed");
                m76849a(TIMPushConstants.ERR_REGISTER_PUSH_FAILED_TRY_FCM, m76846a("FCM token failed"), null);
                return;
            } else {
                if (this.f74908f.isEmpty()) {
                    TIMPushLog.m77016d(f74900h, "detectChannels all failed");
                    m76849a(TIMPushConstants.ERR_REGISTER_PUSH_FAILED_DETECT_CHANNELS, m76846a("All backup channels failed"), null);
                    return;
                }
                TIMPushLog.m77017e(f74900h, "notifyRequestTokenFailed channelId = " + i12);
                return;
            }
        }
        this.f74906d = "orginChannel:" + i12 + "|errorCode:" + i13 + "|errorMsg:" + str;
        TIMPushManagerImpl.m76884c().m76896a(2L, 0L, 11L, this.f74906d, TIMPushUtils.m77030c(), TIMPushUtils.m77035h(), null);
        if (TIMPushConfig.getInstance().isBackupChannelsEnabled()) {
            HashSet hashSet = new HashSet();
            hashSet.add(Integer.valueOf(TIMPushConfig.getInstance().getPushChannelId()));
            hashSet.add(Integer.valueOf(TIMPushUtils.m77036i()));
            TIMPushLog.m77016d(f74900h, "built-in channel failed, backup channels enabled, start detecting other channels");
            m76852a(hashSet);
            return;
        }
        if (2002 != i12) {
            TIMPushLog.m77016d(f74900h, "request fcm after built failed");
            RequestTask requestTask3 = new RequestTask(2002, 10000, 4);
            this.f74908f.put(2002, requestTask3);
            requestTask3.m76857a();
            return;
        }
        m76849a(TIMPushConstants.ERR_REGISTER_PUSH_FAILED_BUILT_IN_DEVICE, m76846a("Built-in channel token failed"), null);
    }
}
