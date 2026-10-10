package com.tencent.qcloud.tim.push.components;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tencent.qcloud.tim.push.TIMPushCallback;
import com.tencent.qcloud.tim.push.config.TIMPushConfig;
import com.tencent.qcloud.tim.push.interfaces.IMEventListener;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tim.push.utils.TIMPushLog;
import com.tencent.qcloud.tim.push.utils.TIMPushUtils;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.qcloud.tuicore.TUICore;
import com.tencent.qcloud.tuicore.interfaces.ITUINotification;
import java.util.Map;

/* JADX INFO: loaded from: classes56.dex */
public class ActivityLifecycleHandler implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: h */
    public static final String f74843h = "ActivityLifecycleHandler";

    /* JADX INFO: renamed from: i */
    public static boolean f74844i;

    /* JADX INFO: renamed from: b */
    public boolean f74846b;

    /* JADX INFO: renamed from: c */
    public TIMPushProvider f74847c;

    /* JADX INFO: renamed from: d */
    public Context f74848d;

    /* JADX INFO: renamed from: e */
    public int f74849e;

    /* JADX INFO: renamed from: a */
    public int f74845a = 0;

    /* JADX INFO: renamed from: f */
    public final IMEventListener f74850f = new IMEventListener() { // from class: com.tencent.qcloud.tim.push.components.ActivityLifecycleHandler.1
        @Override // com.tencent.qcloud.tim.push.interfaces.IMEventListener
        /* JADX INFO: renamed from: a */
        public void mo76827a(long j11) {
            if (ActivityLifecycleHandler.this.m76825a()) {
                return;
            }
            ActivityLifecycleHandler.this.m76823a(j11);
        }
    };

    /* JADX INFO: renamed from: g */
    public final ITUINotification f74851g = new ITUINotification() { // from class: com.tencent.qcloud.tim.push.components.ActivityLifecycleHandler.2
        @Override // com.tencent.qcloud.tuicore.interfaces.ITUINotification
        public void onNotifyEvent(String str, String str2, Map<String, Object> map) {
            if (ActivityLifecycleHandler.this.m76825a() || map == null) {
                return;
            }
            Object obj = map.get(TUIConstants.TUIConversation.TOTAL_UNREAD_COUNT);
            if (obj instanceof Long) {
                ActivityLifecycleHandler.this.m76823a(((Long) obj).longValue());
            }
        }
    };

    /* JADX INFO: renamed from: a */
    public void m76824a(Context context, TIMPushProvider tIMPushProvider) {
        this.f74848d = context;
        this.f74847c = tIMPushProvider;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
        TIMPushLog.m77018i(f74843h, "onActivityCreated bundle: " + bundle);
    }

    /* JADX INFO: renamed from: a */
    public boolean m76825a() {
        return TIMPushConfig.getInstance().getCustomBadgeNumber() >= 0;
    }

    /* JADX INFO: renamed from: b */
    public void m76826b() {
        if (TIMPushConfig.getInstance().getRunningPlatform() == 3) {
            return;
        }
        if (!f74844i) {
            this.f74847c.m76947a(this.f74849e, new TIMPushCallback() { // from class: com.tencent.qcloud.tim.push.components.ActivityLifecycleHandler.5
            });
        } else {
            this.f74847c.m76952a(new TIMPushCallback() { // from class: com.tencent.qcloud.tim.push.components.ActivityLifecycleHandler.6
            });
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NonNull Activity activity) {
        if (TIMPushConfig.getInstance().getRunningPlatform() == 3) {
            return;
        }
        int i11 = this.f74845a + 1;
        this.f74845a = i11;
        if (i11 == 1 && !this.f74846b) {
            TIMPushLog.m77016d(f74843h, "enter foreground");
            this.f74847c.m76952a(new TIMPushCallback() { // from class: com.tencent.qcloud.tim.push.components.ActivityLifecycleHandler.3
            });
            f74844i = true;
            this.f74847c.m76954a(this.f74850f);
            TUICore.registerEvent(TUIConstants.TUIConversation.EVENT_UNREAD, TUIConstants.TUIConversation.EVENT_SUB_KEY_UNREAD_CHANGED, this.f74851g);
        }
        this.f74846b = false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NonNull Activity activity) {
        if (TIMPushConfig.getInstance().getRunningPlatform() == 3) {
            return;
        }
        int i11 = this.f74845a - 1;
        this.f74845a = i11;
        if (i11 == 0) {
            TIMPushLog.m77016d(f74843h, "enter background");
            int customBadgeNumber = this.f74849e;
            if (m76825a()) {
                customBadgeNumber = TIMPushConfig.getInstance().getCustomBadgeNumber();
            }
            this.f74847c.m76947a(customBadgeNumber, new TIMPushCallback() { // from class: com.tencent.qcloud.tim.push.components.ActivityLifecycleHandler.4
            });
            f74844i = false;
            this.f74847c.m76976f();
            TUICore.unRegisterEvent(TUIConstants.TUIConversation.EVENT_UNREAD, TUIConstants.TUIConversation.EVENT_SUB_KEY_UNREAD_CHANGED, this.f74851g);
        }
        this.f74846b = activity.isChangingConfigurations();
    }

    /* JADX INFO: renamed from: a */
    public void m76823a(long j11) {
        int i11 = (int) j11;
        this.f74849e = i11;
        TIMPushUtils.m77024a(this.f74848d, i11, new TIMPushCallback() { // from class: com.tencent.qcloud.tim.push.components.ActivityLifecycleHandler.7
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
    }
}
