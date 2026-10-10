package com.tencent.qcloud.tim.push.notification;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.browser.trusted.C0671f;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.google.gson.Gson;
import com.tencent.qcloud.tim.push.C34991R;
import com.tencent.qcloud.tim.push.TIMPushCallback;
import com.tencent.qcloud.tim.push.TIMPushConstants;
import com.tencent.qcloud.tim.push.TIMPushOpenActivity;
import com.tencent.qcloud.tim.push.bean.NotificationBean;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tim.push.utils.TIMPushLog;
import com.tencent.qcloud.tim.push.utils.TIMPushUtils;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.qcloud.tuicore.TUICore;
import com.tencent.qcloud.tuicore.push.OfflinePushExtInfo;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes56.dex */
public class NotificationBuilder {

    /* JADX INFO: renamed from: g */
    public static final String f75126g = "NotificationBuilder";

    /* JADX INFO: renamed from: h */
    public static final int f75127h = 1;

    /* JADX INFO: renamed from: i */
    public static final int f75128i = 2;

    /* JADX INFO: renamed from: j */
    public static final int f75129j = 3;

    /* JADX INFO: renamed from: k */
    public static final String f75130k = "default push channel";

    /* JADX INFO: renamed from: a */
    public TIMPushProvider f75131a;

    /* JADX INFO: renamed from: b */
    public Context f75132b;

    /* JADX INFO: renamed from: c */
    public int f75133c;

    /* JADX INFO: renamed from: d */
    public List<NotificationBean> f75134d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public List<String> f75135e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public int f75136f = 0;

    public static class NotificationBuilderHolder {

        /* JADX INFO: renamed from: a */
        public static final NotificationBuilder f75143a = new NotificationBuilder();

        private NotificationBuilderHolder() {
        }
    }

    /* JADX INFO: renamed from: c */
    public static NotificationBuilder m76983c() {
        return NotificationBuilderHolder.f75143a;
    }

    /* JADX INFO: renamed from: b */
    public void m76993b(int i11, String str) {
        NotificationBean next;
        if (i11 <= 0) {
            TIMPushLog.m77017e(f75126g, "Notification id invalid");
            return;
        }
        Iterator<NotificationBean> it = this.f75134d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (next.m76814i() != i11);
        if (next == null) {
            TIMPushLog.m77017e(f75126g, "notificationInfo not exits");
        } else {
            next.m76796a(str);
            m76989a(next);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m76998d(NotificationBean notificationBean) {
        String str;
        String strM76999e;
        String strM76820m = notificationBean.m76820m();
        String strM76804d = notificationBean.m76804d();
        String strM76799b = notificationBean.m76799b();
        String strM76802c = notificationBean.m76802c();
        String strM76819l = notificationBean.m76819l();
        String strM76818k = notificationBean.m76818k();
        String strM76794a = notificationBean.m76794a();
        String strM76806e = notificationBean.m76806e();
        String strM76816j = notificationBean.m76816j();
        int iM76814i = notificationBean.m76814i();
        if (TextUtils.isEmpty(strM76820m) && TextUtils.isEmpty(strM76804d)) {
            TIMPushLog.m77016d(f75126g, "notification title&content is null");
            return;
        }
        if (TextUtils.isEmpty(strM76819l)) {
            TIMPushLog.m77016d(f75126g, "sound is not set");
            str = "";
            strM76999e = "";
        } else {
            str = "android.resource://" + this.f75132b.getPackageName() + "/raw/" + strM76819l;
            strM76999e = m76999e(strM76819l);
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            if (TextUtils.isEmpty(strM76799b)) {
                strM76799b = TextUtils.isEmpty(strM76999e) ? f75130k : strM76999e;
            }
            if (!TextUtils.equals(f75130k, strM76799b) && !this.f75135e.contains(strM76799b)) {
                this.f75135e.add(strM76799b);
            }
            NotificationManager notificationManager = (NotificationManager) this.f75132b.getSystemService(NotificationManager.class);
            if (this.f75135e.size() > 3) {
                String str2 = this.f75135e.get(0);
                TIMPushLog.m77016d(f75126g, "recycleChannelID = " + str2);
                notificationManager.deleteNotificationChannel(str2);
                this.f75135e.remove(str2);
            }
            String str3 = TextUtils.isEmpty(strM76802c) ? strM76799b : strM76802c;
            NotificationChannel notificationChannelM1622a = C0671f.m1622a(strM76799b, str3, 4);
            notificationChannelM1622a.setDescription(str3);
            notificationChannelM1622a.enableLights(true);
            notificationChannelM1622a.enableVibration(true);
            notificationChannelM1622a.setShowBadge(true);
            notificationChannelM1622a.setLockscreenVisibility(1);
            notificationChannelM1622a.setBypassDnd(true);
            if (!TextUtils.isEmpty(str)) {
                notificationChannelM1622a.setSound(Uri.parse(str), null);
            }
            notificationManager.createNotificationChannel(notificationChannelM1622a);
        }
        Intent intent = new Intent(this.f75132b, (Class<?>) TIMPushOpenActivity.class);
        intent.setFlags(268435456);
        intent.putExtra("ext", strM76806e);
        intent.putExtra(TUIConstants.TIMPush.NOTIFICATION_CREATED_BY_IM_KEY, true);
        intent.putExtra(TIMPushConstants.NOTIFICATION_FROM_ONLINE_MESSAGE, notificationBean.m76821n());
        intent.putExtra(TUIConstants.TIMPush.NOTIFICATION_UI_ID, iM76814i);
        intent.putExtra("clickExt", strM76816j);
        NotificationCompat.Builder autoCancel = new NotificationCompat.Builder(this.f75132b, strM76799b).setContentTitle(strM76820m).setContentText(strM76804d).setPriority(1).setVisibility(1).setCategory("msg").setDefaults(4).setSmallIcon(m76997d(strM76818k)).setChannelId(strM76799b).setContentIntent(PendingIntent.getActivity(this.f75132b, iM76814i, intent, 67108864)).setAutoCancel(true);
        if (!TextUtils.isEmpty(strM76794a)) {
            TIMPushLog.m77016d(f75126g, "bigPicture =" + strM76794a);
            autoCancel.setStyle(new NotificationCompat.BigPictureStyle().bigPicture(BitmapFactory.decodeFile(strM76794a)));
        }
        if (i11 < 26 && !TextUtils.isEmpty(str)) {
            autoCancel.setSound(Uri.parse(str));
        }
        NotificationManagerCompat.from(this.f75132b).notify(iM76814i, autoCancel.build());
    }

    /* JADX INFO: renamed from: c */
    public final int m76995c(String str) {
        int iOptInt;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString(TUIConstants.TIMPush.NOTIFICATION.ENTITY);
            if (TextUtils.isEmpty(strOptString)) {
                iOptInt = jSONObject.optInt(TUIConstants.TIMPush.NOTIFICATION.ACTION);
                TIMPushLog.m77016d(f75126g, "parseLegacyExt ext action = " + iOptInt);
            } else {
                iOptInt = new JSONObject(strOptString).optInt(TUIConstants.TIMPush.NOTIFICATION.ACTION);
                String str2 = f75126g;
                TIMPushLog.m77016d(str2, "parseLegacyExt entity action = " + iOptInt);
                if (iOptInt <= 0) {
                    iOptInt = jSONObject.optInt(TUIConstants.TIMPush.NOTIFICATION.ACTION);
                    TIMPushLog.m77016d(str2, "parseLegacyExt ext action = " + iOptInt);
                }
            }
            if (iOptInt <= 0) {
                TIMPushLog.m77016d(f75126g, "parseLegacyExt failed");
            }
            return iOptInt;
        } catch (Exception e11) {
            TIMPushLog.m77017e(f75126g, "parseLegacyExt e= " + e11);
            return 1;
        }
    }

    /* JADX INFO: renamed from: e */
    public final String m76999e(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        return (iLastIndexOf == -1 || iLastIndexOf == 0) ? str : str.substring(0, iLastIndexOf);
    }

    /* JADX INFO: renamed from: a */
    public void m76986a(Context context, TIMPushProvider tIMPushProvider) {
        this.f75132b = context;
        this.f75133c = m76991b();
        this.f75134d.clear();
        this.f75131a = tIMPushProvider;
        this.f75136f = (int) (System.currentTimeMillis() / 1000);
    }

    /* JADX INFO: renamed from: a */
    public void m76990a(Map<String, String> map) {
        NotificationBean notificationBean = new NotificationBean();
        notificationBean.m76797a(map);
        notificationBean.m76817j(map.get(TUIConstants.TIMPush.NOTIFICATION.TITLE));
        notificationBean.m76805d(map.get(TUIConstants.TIMPush.NOTIFICATION.DESCPTION));
        notificationBean.m76801b(map.get(TUIConstants.TIMPush.NOTIFICATION.CHANNEL_ID));
        notificationBean.m76813h(map.get(TUIConstants.TIMPush.NOTIFICATION.SMALL_ICON));
        notificationBean.m76815i(map.get(TUIConstants.TIMPush.NOTIFICATION.SOUND));
        notificationBean.m76796a(map.get(TUIConstants.TIMPush.NOTIFICATION.BIG_PICTURE));
        notificationBean.m76807e(map.get("ext"));
        String strM76806e = notificationBean.m76806e();
        if (!TextUtils.isEmpty(strM76806e)) {
            notificationBean.m76795a(m76992b(strM76806e));
        }
        notificationBean.m76798a(TextUtils.equals(TIMPushConstants.NOTIFICATION_FROM_ONLINE_MESSAGE, map.get(TIMPushConstants.NOTIFICATION_FROM_ONLINE_MESSAGE)));
        notificationBean.m76811g(map.get("clickExt"));
        int i11 = this.f75136f + 1;
        this.f75136f = i11;
        notificationBean.m76800b(i11);
        this.f75134d.add(notificationBean);
        if (notificationBean.m76822o()) {
            m76994b(notificationBean);
        } else {
            m76989a(notificationBean);
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m76992b(String str) {
        try {
            OfflinePushExtInfo offlinePushExtInfoM76984a = m76984a(str);
            int fCMNotificationType = offlinePushExtInfoM76984a != null ? offlinePushExtInfoM76984a.getConfigInfo().getFCMNotificationType() : -1;
            TIMPushLog.m77016d(f75126g, "parseExt action = " + fCMNotificationType);
            if (fCMNotificationType == 0) {
                return 1;
            }
            if (fCMNotificationType == 1) {
                return 2;
            }
            return m76995c(str);
        } catch (Exception e11) {
            TIMPushLog.m77017e(f75126g, "parseExt e= " + e11);
            return 1;
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m76991b() {
        try {
            return this.f75132b.getPackageManager().getApplicationInfo(this.f75132b.getPackageName(), 0).icon;
        } catch (Exception e11) {
            TIMPushLog.m77017e(f75126g, "getApplicationIcon e =" + e11);
            return C34991R.drawable.fcm_private_icon;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m76996c(NotificationBean notificationBean) {
        if (notificationBean.m76821n()) {
            return;
        }
        Map<String, String> mapM76810g = notificationBean.m76810g();
        HashMap map = new HashMap();
        map.put(TUIConstants.TIMPush.EVENT_IM_LOGIN_AFTER_APP_WAKEUP_PUSH_MESSAGE_KEY, mapM76810g);
        TUICore.notifyEvent(TUIConstants.TIMPush.EVENT_IM_LOGIN_AFTER_APP_WAKEUP_KEY, TUIConstants.TIMPush.EVENT_IM_LOGIN_AFTER_APP_WAKEUP_SUB_KEY, map);
        Bundle bundle = new Bundle();
        for (Map.Entry<String, String> entry : mapM76810g.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        Intent intent = new Intent(TUIConstants.TIMPush.BROADCAST_IM_LOGIN_AFTER_APP_WAKEUP);
        intent.putExtras(bundle);
        LocalBroadcastManager.getInstance(this.f75132b).sendBroadcast(intent);
    }

    /* JADX INFO: renamed from: b */
    public final void m76994b(NotificationBean notificationBean) {
        final String strM76794a = notificationBean.m76794a();
        final int iM76814i = notificationBean.m76814i();
        if (TextUtils.isEmpty(strM76794a)) {
            TIMPushLog.m77017e(f75126g, "imageUriInput is null");
            m76985a(iM76814i, (String) null);
            return;
        }
        if (strM76794a.startsWith("file://")) {
            m76985a(iM76814i, strM76794a);
            return;
        }
        if (!strM76794a.startsWith("http://") && !strM76794a.startsWith("https://")) {
            TIMPushLog.m77016d(f75126g, "invalid url = " + strM76794a);
            m76985a(iM76814i, strM76794a);
            return;
        }
        new Thread(new Runnable() { // from class: com.tencent.qcloud.tim.push.notification.NotificationBuilder.1
            /* JADX WARN: Code duplicated, block: B:41:0x00e6 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:42:0x00e8 A[Catch: Exception -> 0x00eb, TRY_LEAVE, TryCatch #6 {Exception -> 0x00eb, blocks: (B:40:0x00e3, B:42:0x00e8), top: B:64:0x00e3 }] */
            /* JADX WARN: Code duplicated, block: B:50:0x00fa A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:51:0x00fc A[Catch: Exception -> 0x00ff, TRY_LEAVE, TryCatch #3 {Exception -> 0x00ff, blocks: (B:49:0x00f7, B:51:0x00fc), top: B:60:0x00f7 }] */
            /* JADX WARN: Code duplicated, block: B:53:0x0101  */
            /* JADX WARN: Code duplicated, block: B:60:0x00f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:64:0x00e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:75:? A[SYNTHETIC] */
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                HttpURLConnection httpURLConnection;
                FileOutputStream fileOutputStream;
                InputStream inputStream;
                Throwable th2;
                InputStream inputStream2 = null;
                try {
                    httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(strM76794a).openConnection()));
                    try {
                        httpURLConnection.setConnectTimeout(8000);
                        httpURLConnection.setReadTimeout(8000);
                        httpURLConnection.setDoInput(true);
                        httpURLConnection.connect();
                        if (httpURLConnection.getResponseCode() != 200) {
                            TIMPushLog.m77017e(NotificationBuilder.f75126g, "HttpURLConnection failed");
                            httpURLConnection.disconnect();
                            return;
                        }
                        InputStream inputStream3 = httpURLConnection.getInputStream();
                        try {
                            File file = new File(NotificationBuilder.this.f75132b.getExternalFilesDir(null), "downloaded_image" + iM76814i + ".jpg");
                            fileOutputStream = new FileOutputStream(file);
                            try {
                                byte[] bArr = new byte[4096];
                                while (true) {
                                    int i11 = inputStream3.read(bArr);
                                    if (i11 == -1) {
                                        break;
                                    } else {
                                        fileOutputStream.write(bArr, 0, i11);
                                    }
                                }
                                fileOutputStream.flush();
                                String absolutePath = file.getAbsolutePath();
                                TIMPushLog.m77016d(NotificationBuilder.f75126g, "imagePath =" + absolutePath);
                                NotificationBuilder.this.m76985a(iM76814i, absolutePath);
                                try {
                                    inputStream3.close();
                                    fileOutputStream.close();
                                } catch (Exception unused) {
                                }
                            } catch (Exception e11) {
                                e = e11;
                                inputStream2 = inputStream3;
                                try {
                                    TIMPushLog.m77016d(NotificationBuilder.f75126g, "downloadResource failed e =" + e);
                                    if (inputStream2 != null) {
                                        try {
                                            inputStream2.close();
                                            if (fileOutputStream != null) {
                                                fileOutputStream.close();
                                            }
                                        } catch (Exception unused2) {
                                            if (httpURLConnection == null) {
                                                return;
                                            }
                                            httpURLConnection.disconnect();
                                        }
                                    } else if (fileOutputStream != null) {
                                        fileOutputStream.close();
                                    }
                                    if (httpURLConnection == null) {
                                        return;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    Throwable th4 = th;
                                    inputStream3 = inputStream2;
                                    th2 = th4;
                                    if (inputStream3 != null) {
                                        try {
                                            inputStream3.close();
                                            if (fileOutputStream != null) {
                                                fileOutputStream.close();
                                            }
                                        } catch (Exception unused3) {
                                            if (httpURLConnection != null) {
                                                throw th2;
                                            }
                                            httpURLConnection.disconnect();
                                            throw th2;
                                        }
                                    } else if (fileOutputStream != null) {
                                        fileOutputStream.close();
                                    }
                                    if (httpURLConnection != null) {
                                        throw th2;
                                    }
                                    httpURLConnection.disconnect();
                                    throw th2;
                                }
                            } catch (Throwable th5) {
                                th2 = th5;
                                if (inputStream3 != null) {
                                    inputStream3.close();
                                    if (fileOutputStream != null) {
                                        fileOutputStream.close();
                                    }
                                } else if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                                if (httpURLConnection != null) {
                                    throw th2;
                                }
                                httpURLConnection.disconnect();
                                throw th2;
                            }
                        } catch (Exception e12) {
                            inputStream = inputStream3;
                            e = e12;
                            fileOutputStream = null;
                            inputStream2 = inputStream;
                            TIMPushLog.m77016d(NotificationBuilder.f75126g, "downloadResource failed e =" + e);
                            if (inputStream2 != null) {
                                inputStream2.close();
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                            } else if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            if (httpURLConnection == null) {
                                return;
                            }
                            httpURLConnection.disconnect();
                        } catch (Throwable th6) {
                            fileOutputStream = null;
                            inputStream2 = inputStream3;
                            th = th6;
                            Throwable th7 = th;
                            inputStream3 = inputStream2;
                            th2 = th7;
                            if (inputStream3 != null) {
                                inputStream3.close();
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                            } else if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            if (httpURLConnection != null) {
                                throw th2;
                            }
                            httpURLConnection.disconnect();
                            throw th2;
                        }
                        httpURLConnection.disconnect();
                    } catch (Exception e13) {
                        e = e13;
                        inputStream = null;
                    } catch (Throwable th8) {
                        th = th8;
                        fileOutputStream = null;
                    }
                } catch (Exception e14) {
                    e = e14;
                    httpURLConnection = null;
                    inputStream = null;
                } catch (Throwable th9) {
                    th = th9;
                    httpURLConnection = null;
                    fileOutputStream = null;
                }
            }
        }).start();
    }

    /* JADX INFO: renamed from: a */
    public void m76989a(NotificationBean notificationBean) {
        int iM76812h = notificationBean.m76812h();
        TIMPushLog.m77017e(f75126g, "buildNotification action = " + iM76812h);
        if (iM76812h == 1) {
            m76998d(notificationBean);
        } else if (iM76812h != 2) {
            m76998d(notificationBean);
        } else {
            m76996c(notificationBean);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m76988a(Intent intent) {
        int intExtra;
        if (intent == null || (intExtra = intent.getIntExtra(TUIConstants.TIMPush.NOTIFICATION_UI_ID, 0)) <= 0 || this.f75134d.isEmpty()) {
            return;
        }
        Iterator<NotificationBean> it = this.f75134d.iterator();
        while (it.hasNext()) {
            if (it.next().m76814i() == intExtra) {
                it.remove();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m76987a(Context context, String str, String str2, String str3, String str4, TIMPushCallback tIMPushCallback) {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (TextUtils.isEmpty(str2)) {
                str2 = "customChannelId";
            }
            if (TextUtils.isEmpty(str)) {
                str = "customChannel";
            }
            NotificationChannel notificationChannelM1622a = C0671f.m1622a(str2, str, 4);
            notificationChannelM1622a.enableLights(true);
            notificationChannelM1622a.enableVibration(true);
            notificationChannelM1622a.setShowBadge(true);
            notificationChannelM1622a.setLockscreenVisibility(1);
            if (!TextUtils.isEmpty(str3)) {
                notificationChannelM1622a.setDescription(str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                if (!str4.startsWith("android.resource://")) {
                    str4 = "android.resource://" + context.getPackageName() + "/raw/" + str4;
                }
                notificationChannelM1622a.setSound(Uri.parse(str4), null);
            } else {
                TIMPushLog.m77016d(f75126g, "soundName is null");
            }
            notificationManager.createNotificationChannel(notificationChannelM1622a);
            TIMPushUtils.m77026a(tIMPushCallback, null);
            return;
        }
        TIMPushLog.m77017e(f75126g, "os version < 8");
        TIMPushUtils.m77025a(tIMPushCallback, -1, "os version < 8", null);
    }

    /* JADX INFO: renamed from: a */
    public final OfflinePushExtInfo m76984a(String str) {
        OfflinePushExtInfo offlinePushExtInfo;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            offlinePushExtInfo = (OfflinePushExtInfo) new Gson().fromJson(str, OfflinePushExtInfo.class);
        } catch (Exception e11) {
            TIMPushLog.m77020w(f75126g, "getOfflinePushExtInfo: " + e11.getMessage());
            offlinePushExtInfo = null;
        }
        if (offlinePushExtInfo == null) {
            return null;
        }
        return offlinePushExtInfo;
    }

    /* JADX INFO: renamed from: d */
    public final int m76997d(String str) {
        if (!TextUtils.isEmpty(str)) {
            int identifier = this.f75132b.getResources().getIdentifier(str, "drawable", this.f75132b.getPackageName());
            if (identifier > 0) {
                TIMPushLog.m77016d(f75126g, "smallIcon id is " + identifier);
                return identifier;
            }
        } else {
            TIMPushLog.m77016d(f75126g, "smallIcon not set");
        }
        return this.f75133c;
    }

    /* JADX INFO: renamed from: a */
    public final void m76985a(final int i11, final String str) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tencent.qcloud.tim.push.notification.NotificationBuilder.2
            @Override // java.lang.Runnable
            public void run() {
                NotificationBuilder.this.m76993b(i11, str);
            }
        });
    }
}
