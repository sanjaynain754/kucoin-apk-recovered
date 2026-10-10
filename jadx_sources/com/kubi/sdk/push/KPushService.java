package com.kubi.sdk.push;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import cn.jiguang.privates.common.log.JCommonLog;
import cn.jiguang.privates.core.api.Address;
import cn.jiguang.privates.core.api.JCorePrivatesApi;
import cn.jiguang.privates.push.api.JPushPrivatesApi;
import cn.jiguang.privates.push.api.NotificationMessage;
import com.google.firebase.FirebaseApp;
import com.kubi.host.HostManager;
import com.kubi.sdk.function.language.LanguageType;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.push.jpush.BackPushLogHandler;
import com.kubi.sdk.push.jpush.PushLogHandler;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.C27100x0;
import i00.C38392a;
import j00.C40197a;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p481ny.C42899b;
import p569qq.C43840a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: KPushService.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\rJ%\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0002\b\u000fJ\b\u0010\u0010\u001a\u00020\u0007H\u0007J\b\u0010\u0011\u001a\u00020\u0007H\u0007J\u0017\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0001¢\u0006\u0002\b\u0015J\u0016\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u000bH\u0082@¢\u0006\u0002\u0010\u0018J\b\u0010\u0019\u001a\u00020\u0007H\u0002J\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/sdk/push/KPushService;", "", "<init>", "()V", "TAG", "", "config", "", "context", "Landroid/content/Context;", "isMainProcess", "", "debuggable", "config$LJiGuang_googleRelease", "start", "start$LJiGuang_googleRelease", "bind", "unbind", "autoBindOnStart", "delayTime", "", "autoBindOnStart$LJiGuang_googleRelease", "autoBind", "force", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerLanguageChange", "parsePushInfo", "Lcom/kubi/sdk/push/PushInfo;", "intent", "Landroid/content/Intent;", "LJiGuang_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKPushService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KPushService.kt\ncom/kubi/sdk/push/KPushService\n+ 2 PushIssue.kt\ncom/kubi/sdk/push/exception/PushIssueKt\n*L\n1#1,177:1\n45#2,4:178\n*S KotlinDebug\n*F\n+ 1 KPushService.kt\ncom/kubi/sdk/push/KPushService\n*L\n171#1:178,4\n*E\n"})
public final class KPushService {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final KPushService f47508a = new KPushService();

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m57907d(long j11) {
        C41696j.m91104d(PushManger.f47510a.m57923g(), null, null, new KPushService$autoBindOnStart$1(j11, null), 3, null);
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final void m57908e() {
        C41696j.m91104d(PushManger.f47510a.m57923g(), null, null, new KPushService$bind$1(null), 3, null);
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: g */
    public static final PushInfo m57909g(@Nullable Intent intent) {
        NotificationMessage notificationMessage;
        if (intent != null) {
            try {
                Bundle extras = intent.getExtras();
                if (extras != null && (notificationMessage = (NotificationMessage) extras.getParcelable("message")) != null) {
                    String string = notificationMessage.getExtras().getString("url");
                    if (string == null) {
                        string = "";
                    }
                    String str = string;
                    C43840a.m96550d("解析PUSH jump=" + str + " id=" + notificationMessage.getMessageId() + ",title=" + notificationMessage.getTitle(), "KPushService");
                    return new PushInfo(str, notificationMessage.getMessageId(), notificationMessage.getTitle(), notificationMessage.getContent(), C40197a.m88550a(notificationMessage.getPlatform()));
                }
            } catch (Exception e11) {
                C44128b.m97262f("KPushService", "解析PUSH-INFO", e11);
                if (!C42899b.m94075e(e11)) {
                    C38392a.m86573b(e11, "KPushService", "parsePushInfo");
                }
            }
        }
        return null;
    }

    @JvmStatic
    /* JADX INFO: renamed from: i */
    public static final void m57910i(@NotNull final Context context, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (z11) {
            PushManger pushManger = PushManger.f47510a;
            pushManger.m57922f();
            f47508a.m57915h();
            if (z12) {
                pushManger.m57925i(60000);
            }
        } else {
            C27100x0.m66924e(new Function0() { // from class: com.kubi.sdk.push.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KPushService.m57911j(context);
                }
            });
        }
        JPushPrivatesApi.init(context);
        JPushPrivatesApi.turnOnPush(context);
        JCorePrivatesApi.uploadCacheReport(context);
    }

    @JvmStatic
    /* JADX INFO: renamed from: k */
    public static final void m57912k() {
        C41696j.m91104d(PushManger.f47510a.m57923g(), null, null, new KPushService$unbind$1(null), 3, null);
    }

    /* JADX INFO: renamed from: f */
    public final void m57914f(@NotNull Context context, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(context, "context");
        HostManager hostManager = HostManager.a;
        JCorePrivatesApi.configAddress(context, new Address().setDefaultHost(hostManager.d()).setDefaultPort(3000).setDefaultReportUrl(hostManager.u()));
        JCommonLog.setHandler(z11 ? new PushLogHandler() : new BackPushLogHandler(z12));
    }

    /* JADX INFO: renamed from: h */
    public final void m57915h() {
        MultiLanguageManager.f46805a.addOnLanguageChangeListener(new MultiLanguageManager.a() { // from class: com.kubi.sdk.push.KPushService$registerLanguageChange$1
            @Override // com.kubi.sdk.function.language.MultiLanguageManager.a
            public void onLanguageChange(LanguageType language) {
                Intrinsics.checkNotNullParameter(language, "language");
                C41696j.m91104d(PushManger.f47510a.m57923g(), null, null, new KPushService$registerLanguageChange$1$onLanguageChange$1(null), 3, null);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m57911j(Context context) {
        FirebaseApp.initializeApp(context);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public final Object m57913c(boolean z11, Continuation<? super Unit> continuation) {
        boolean zIsEmpty = TextUtils.isEmpty(UserInfo.c().id);
        if (UserInfo.a.n()) {
            Object objM57919c = PushManger.f47510a.m57919c(continuation);
            if (objM57919c == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return objM57919c;
            }
            return Unit.INSTANCE;
        }
        if (zIsEmpty) {
            Object objM57920d = PushManger.f47510a.m57920d(z11, continuation);
            if (objM57920d == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return objM57920d;
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
