package com.tencent.timpush.fcm;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.qcloud.tuicore.TUICore;
import com.tencent.qcloud.tuicore.interfaces.ITUIService;
import com.tencent.qcloud.tuicore.interfaces.TUIServiceCallback;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class TIMPushFCMService extends ContentProvider implements ITUIService {
    public static final String TAG = "TIMPushFCMService";
    private static TIMPushFCMService instance;
    private TIMPushFCMDataAdapter adapter;
    private boolean enableRing;
    private String fcmChanneSoundName;
    private String fcmChannelId;
    private Handler handler;
    private TUIServiceCallback mCallback = null;
    private Context mContext;

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // com.tencent.qcloud.tuicore.interfaces.ITUIService
    public Object onCall(String str, Map<String, Object> map) {
        String str2 = TAG;
        TIMPushLog.m78956d(str2, "onCall method: " + str);
        if (!TextUtils.equals("parseFCMPushIntent", str)) {
            return null;
        }
        if (map == null) {
            TIMPushLog.m78957e(str2, "param is null");
            return null;
        }
        Object obj = map.get("fcmPushIntentKey");
        if (obj instanceof Intent) {
            return TIMPushFCMMsgService.m78951a((Intent) obj, true);
        }
        TIMPushLog.m78957e(str2, "param is not Intent");
        return null;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    private void checkContext(Context context) {
        if (this.mContext == null) {
            TIMPushLog.m78956d(TAG, "mContext is null");
            if (context != null) {
                this.mContext = context;
            } else {
                this.mContext = getContext().getApplicationContext();
            }
        }
    }

    public static TIMPushFCMService getInstance() {
        return instance;
    }

    public void callbackData(final TIMPushErrorBean tIMPushErrorBean) {
        this.handler.post(new Runnable() { // from class: com.tencent.timpush.fcm.TIMPushFCMService.1
            @Override // java.lang.Runnable
            public void run() {
                if (TIMPushFCMService.this.mCallback == null || tIMPushErrorBean == null) {
                    TIMPushLog.m78957e(TIMPushFCMService.TAG, "callback failed");
                } else {
                    TIMPushFCMService.this.mCallback.onServiceCallback((int) tIMPushErrorBean.m78940a(), tIMPushErrorBean.m78943b(), null);
                }
            }
        });
    }

    public String getFcmChanneSoundName() {
        return this.fcmChanneSoundName;
    }

    public String getFcmChannelId() {
        return this.fcmChannelId;
    }

    public boolean isEnableRing() {
        return this.enableRing;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        instance = this;
        TUICore.registerService(TUIConstants.TIMPush.FCM.FCM_SERVICE_NAME, this);
        this.adapter = new TIMPushFCMDataAdapter();
        this.mContext = getContext().getApplicationContext();
        this.handler = new Handler(Looper.getMainLooper());
        return false;
    }

    public void registerPush(Context context, TUIServiceCallback tUIServiceCallback) {
        checkContext(context);
        this.mCallback = tUIServiceCallback;
        this.adapter.m78950c(this.mContext);
    }

    @Override // com.tencent.qcloud.tuicore.interfaces.ITUIService
    public Object onCall(String str, Map<String, Object> map, TUIServiceCallback tUIServiceCallback) {
        String str2 = TAG;
        TIMPushLog.m78956d(str2, "onCall method: " + str);
        if (TextUtils.equals(TUIConstants.TIMPush.FCM.METHOD_REGISTER_FCM_PUSH, str)) {
            if (map == null) {
                TIMPushLog.m78957e(str2, "param is null");
                return null;
            }
            Context context = (Context) map.get("context");
            this.enableRing = ((Boolean) map.get(TUIConstants.TIMPush.FCM.ENABLE_FCM_PRIVATE_RING)).booleanValue();
            this.fcmChannelId = (String) map.get(TUIConstants.TIMPush.FCM.FCM_CHANNEL_ID);
            this.fcmChanneSoundName = (String) map.get(TUIConstants.TIMPush.FCM.FCM_CHANNEL_SOUND_NAME);
            registerPush(context, tUIServiceCallback);
        }
        return null;
    }
}
