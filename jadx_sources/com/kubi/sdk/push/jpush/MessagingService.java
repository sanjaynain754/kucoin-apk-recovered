package com.kubi.sdk.push.jpush;

import android.content.Intent;
import cn.jiguang.privates.push.platform.google.callback.JGoogleCallback;
import com.appsflyer.AppsFlyerLib;
import com.google.firebase.messaging.RemoteMessage;
import com.tencent.bugly.proguard.InterfaceC33826o0;
import com.tencent.qcloud.tim.push.TIMPushCallback;
import com.tencent.qcloud.tim.push.TIMPushManager;
import i00.C38392a;
import org.jetbrains.annotations.NotNull;
import p481ny.C42899b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: MessagingService.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/sdk/push/jpush/MessagingService;", "Lcn/jiguang/privates/push/platform/google/callback/JGoogleCallback;", "<init>", "()V", "onNewToken", "", InterfaceC33826o0.f71244p, "", "onMessageArrived", "remoteMessage", "Lcom/google/firebase/messaging/RemoteMessage;", "onMessageReceived", "message", "handleIntent", "intent", "Landroid/content/Intent;", "Companion", "LJiGuang_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMessagingService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessagingService.kt\ncom/kubi/sdk/push/jpush/MessagingService\n+ 2 PushIssue.kt\ncom/kubi/sdk/push/exception/PushIssueKt\n*L\n1#1,76:1\n45#2,4:77\n45#2,4:81\n*S KotlinDebug\n*F\n+ 1 MessagingService.kt\ncom/kubi/sdk/push/jpush/MessagingService\n*L\n26#1:77,4\n48#1:81,4\n*E\n"})
public final class MessagingService extends JGoogleCallback {

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Companion f47597e = new Companion(null);

    /* JADX INFO: compiled from: MessagingService.kt */
    /* JADX INFO: loaded from: classes42.dex */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/sdk/push/jpush/MessagingService$Companion;", "", "<init>", "()V", "TAG", "", "LJiGuang_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.sdk.push.jpush.MessagingService$a */
    /* JADX INFO: compiled from: MessagingService.kt */
    /* JADX INFO: loaded from: classes42.dex */
    @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016J$\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u000b"}, m90084d2 = {"com/kubi/sdk/push/jpush/MessagingService$handleIntent$1", "Lcom/tencent/qcloud/tim/push/TIMPushCallback;", "", "onSuccess", "", "data", "onError", "errCode", "", "errMsg", "", "LJiGuang_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C24091a extends TIMPushCallback<Object> {
        @Override // com.tencent.qcloud.tim.push.TIMPushCallback
        public void onError(int errCode, String errMsg, Object data) {
            C44128b.m97261e("MessagingService", "reportFCMPushArrived failed, errCode=" + errCode + ", errMsg=" + errMsg);
        }

        @Override // com.tencent.qcloud.tim.push.TIMPushCallback
        public void onSuccess(Object data) {
            C44128b.m97259c("MessagingService", "reportFCMPushArrived success");
        }
    }

    @Override // cn.jiguang.privates.push.platform.google.callback.JGoogleCallback, com.google.firebase.messaging.FirebaseMessagingService, com.google.firebase.messaging.EnhancedIntentService
    public void handleIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.handleIntent(intent);
        C44128b.m97259c("MessagingService", "handleIntent forward to TIMPush, action=" + intent.getAction());
        TIMPushManager.getInstance().callExperimentalAPI("reportFCMPushArrived", intent, new C24091a());
    }

    @Override // cn.jiguang.privates.push.platform.google.callback.JGoogleCallback
    public void onMessageArrived(@NotNull RemoteMessage remoteMessage) {
        Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
        if (remoteMessage.getData().containsKey("af-uinstall-tracking")) {
            return;
        }
        super.onMessageArrived(remoteMessage);
    }

    @Override // cn.jiguang.privates.push.platform.google.callback.JGoogleCallback, com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(@NotNull RemoteMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        try {
            if (message.getData().containsKey("af-uinstall-tracking")) {
                return;
            }
            super.onMessageReceived(message);
        } catch (Throwable th2) {
            if (C42899b.m94075e(th2)) {
                return;
            }
            C38392a.m86573b(th2, "push", "onMessageReceived failed");
        }
    }

    @Override // cn.jiguang.privates.push.platform.google.callback.JGoogleCallback, com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(@NotNull String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        super.onNewToken(token);
        try {
            AppsFlyerLib.getInstance().updateServerUninstallToken(getApplicationContext(), token);
        } catch (Throwable th2) {
            if (C42899b.m94075e(th2)) {
                return;
            }
            C38392a.m86573b(th2, "push", "AppsFlyer updateServerUninstallToken failed");
        }
    }
}
