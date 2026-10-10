package v00;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import com.google.gson.reflect.TypeToken;
import com.kubi.sdk.BaseApplication;
import com.kubi.sdk.function.language.LanguageType;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.timpush.data.model.TimPushInfo;
import com.kubi.sdk.timpush.manager.KCPushManager;
import com.kubi.utils.C27099x;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tim.push.TIMPushCallback;
import com.tencent.qcloud.tim.push.TIMPushListener;
import com.tencent.qcloud.tim.push.TIMPushManager;
import com.tencent.qcloud.tim.push.TIMPushMessage;
import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p481ny.C42899b;
import p569qq.C43852m;
import p694vk.C45590s;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import u00.C45088a;

/* JADX INFO: renamed from: v00.d */
/* JADX INFO: compiled from: KCPushHelper.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u00009\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0011\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0006\u0010\u0018\u001a\u00020\u0014J\b\u0010\u0019\u001a\u00020\u0014H\u0002J\u0010\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u000bH\u0002J\u001d\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\u001eJ\b\u0010\u001f\u001a\u00020\u0014H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000f\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0012¨\u0006 "}, m90084d2 = {"Lcom/kubi/sdk/timpush/helper/KCPushHelper;", "", "<init>", "()V", "SDK_APP_ID", "", "getSDK_APP_ID", "()I", "SDK_APP_ID$delegate", "Lkotlin/Lazy;", "SDK_APP_KEY", "", "getSDK_APP_KEY", "()Ljava/lang/String;", "SDK_APP_KEY$delegate", "ACTION_TIM_URI_LAUNCHER", "registerCallback", "com/kubi/sdk/timpush/helper/KCPushHelper$registerCallback$1", "Lcom/kubi/sdk/timpush/helper/KCPushHelper$registerCallback$1;", "init", "", "context", "Landroid/content/Context;", "registerPush", "unregisterPush", "addPushListener", "launchSplashActivity", "ext", "buildTimPushLaunchIntent", "Landroid/content/Intent;", "buildTimPushLaunchIntent$LTimPush_googleRelease", "registerLanguageChange", "LTimPush_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C45349d {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C45349d f101945a = new C45349d();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f101946b = LazyKt.lazy(new Function0() { // from class: v00.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(C45349d.m100236c());
        }
    });

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Lazy f101947c = LazyKt.lazy(new Function0() { // from class: v00.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C45349d.m100237d();
        }
    });

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final b f101948d = new b();

    /* JADX INFO: renamed from: v00.d$a */
    /* JADX INFO: compiled from: KCPushHelper.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\u000b"}, m90084d2 = {"com/kubi/sdk/timpush/helper/KCPushHelper$addPushListener$1", "Lcom/tencent/qcloud/tim/push/TIMPushListener;", "onRecvPushMessage", "", "message", "Lcom/tencent/qcloud/tim/push/TIMPushMessage;", "onRevokePushMessage", "messageID", "", "onNotificationClicked", "ext", "LTimPush_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nKCPushHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCPushHelper.kt\ncom/kubi/sdk/timpush/helper/KCPushHelper$addPushListener$1\n+ 2 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n+ 3 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,185:1\n19#2,2:186\n160#3,4:188\n1#4:192\n*S KotlinDebug\n*F\n+ 1 KCPushHelper.kt\ncom/kubi/sdk/timpush/helper/KCPushHelper$addPushListener$1\n*L\n125#1:186,2\n126#1:188,4\n*E\n"})
    public static final class a extends TIMPushListener {

        /* JADX INFO: renamed from: v00.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: GsonUtils.kt */
        @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJSONOrNull$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJSONOrNull$1\n*L\n1#1,300:1\n*E\n"})
        public static final class C47032a extends TypeToken<TimPushInfo> {
        }

        /* JADX INFO: renamed from: b */
        public static final void m100248b(String str) throws JSONException {
            Object objM66914d;
            try {
                C27099x c27099x = C27099x.f54458a;
                objM66914d = C27099x.m66914d(str, new C47032a().getType());
            } catch (Throwable unused) {
                objM66914d = null;
            }
            TimPushInfo timPushInfo = (TimPushInfo) objM66914d;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("app_push_msg_id", C27041f.m66668h(timPushInfo != null ? timPushInfo.getMessageId() : null));
            jSONObject.put("app_push_service_name", "TIM_PUSH");
            jSONObject.put("url", C27041f.m66668h(timPushInfo != null ? timPushInfo.getUrl() : null));
            jSONObject.put("postType", C27041f.m66668h(timPushInfo != null ? timPushInfo.getTemplateCode() : null));
            String businessCustomTracking = timPushInfo != null ? timPushInfo.getBusinessCustomTracking() : null;
            if (businessCustomTracking != null && businessCustomTracking.length() != 0) {
                JSONObject jSONObject2 = new JSONObject(C27041f.m66668h(timPushInfo.getBusinessCustomTracking()));
                String strOptString = jSONObject2.optString("mc_track_1");
                Intrinsics.checkNotNull(strOptString);
                if (strOptString.length() <= 0) {
                    strOptString = null;
                }
                jSONObject.put("mc_track_1", strOptString);
                String strOptString2 = jSONObject2.optString("mc_track_2");
                Intrinsics.checkNotNull(strOptString2);
                if (strOptString2.length() <= 0) {
                    strOptString2 = null;
                }
                jSONObject.put("mc_track_2", strOptString2);
                String strOptString3 = jSONObject2.optString("mc_track_3");
                Intrinsics.checkNotNull(strOptString3);
                jSONObject.put("mc_track_3", strOptString3.length() > 0 ? strOptString3 : null);
            }
            C43852m.m96605q("app_push_click", jSONObject);
            C45349d.f101945a.m100244k(str);
        }

        @Override // com.tencent.qcloud.tim.push.TIMPushListener
        public void onNotificationClicked(final String ext) {
            super.onNotificationClicked(ext);
            try {
                C44128b.m97266j("KCPush", "onNotificationClicked ext:" + ext);
                if (ext != null && ext.length() != 0) {
                    C42917g.m94139e().execute(new Runnable() { // from class: v00.c
                        @Override // java.lang.Runnable
                        public final void run() throws JSONException {
                            C45349d.a.m100248b(ext);
                        }
                    });
                }
            } catch (Exception e11) {
                C44128b.m97262f("KCPush", "onNotificationClicked error", e11);
            }
        }

        @Override // com.tencent.qcloud.tim.push.TIMPushListener
        public void onRecvPushMessage(TIMPushMessage message) {
            super.onRecvPushMessage(message);
            C44128b.m97259c("KCPush", "onRecvPushMessage message:" + message);
        }

        @Override // com.tencent.qcloud.tim.push.TIMPushListener
        public void onRevokePushMessage(String messageID) {
            super.onRevokePushMessage(messageID);
            C44128b.m97266j("KCPush", "onRevokePushMessage messageID:" + messageID);
        }
    }

    /* JADX INFO: renamed from: v00.d$b */
    /* JADX INFO: compiled from: KCPushHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016J$\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\n"}, m90084d2 = {"com/kubi/sdk/timpush/helper/KCPushHelper$registerCallback$1", "Lcom/tencent/qcloud/tim/push/TIMPushCallback;", "", "onSuccess", "", "data", "onError", "errCode", "", "errMsg", "LTimPush_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nKCPushHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCPushHelper.kt\ncom/kubi/sdk/timpush/helper/KCPushHelper$registerCallback$1\n+ 2 TimPushIssue.kt\ncom/kubi/sdk/timpush/exception/TimPushIssueKt\n*L\n1#1,185:1\n39#2,4:186\n*S KotlinDebug\n*F\n+ 1 KCPushHelper.kt\ncom/kubi/sdk/timpush/helper/KCPushHelper$registerCallback$1\n*L\n53#1:186,4\n*E\n"})
    public static final class b extends TIMPushCallback<String> {
        @Override // com.tencent.qcloud.tim.push.TIMPushCallback
        public void onError(int errCode, String errMsg, String data) {
            super.onError(errCode, errMsg, data);
            KCPushManager.f48094a.m58259g();
            C44128b.m97261e("KCPush", "registerTimPush onError errCode:" + errCode + ",errMsg:" + errMsg + ",data:" + data);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("registerTimPush failed errCode:");
            sb2.append(errCode);
            sb2.append(",errMsg:");
            sb2.append(errMsg);
            Throwable th2 = new Throwable(sb2.toString());
            if (C42899b.m94075e(th2)) {
                return;
            }
            C45088a.m99691b(th2, "TimPushHelper", "registerTimPush error");
        }

        @Override // com.tencent.qcloud.tim.push.TIMPushCallback
        public void onSuccess(String data) {
            super.onSuccess(data);
            C44128b.m97259c("KCPush", "registerTimPush onSuccess data:" + data);
            KCPushManager.f48094a.m58259g();
        }
    }

    /* JADX INFO: renamed from: v00.d$c */
    /* JADX INFO: compiled from: KCPushHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/sdk/timpush/helper/KCPushHelper$registerLanguageChange$1", "Lcom/kubi/sdk/function/language/MultiLanguageManager$OnLanguageChangeListener;", "onLanguageChange", "", "language", "Lcom/kubi/sdk/function/language/LanguageType;", "LTimPush_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class c implements MultiLanguageManager.a {
        @Override // com.kubi.sdk.function.language.MultiLanguageManager.a
        public void onLanguageChange(LanguageType language) {
            Intrinsics.checkNotNullParameter(language, "language");
            C44128b.m97266j("KCPush", "onLanguageChange language:" + language + ", rebind push");
            KCPushManager.f48094a.m58255c();
        }
    }

    /* JADX INFO: renamed from: c */
    public static final int m100236c() {
        return C45590s.f102687a.m100671V();
    }

    /* JADX INFO: renamed from: d */
    public static final String m100237d() {
        return C45590s.f102687a.m100672W();
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final Intent m100240g(@NotNull Context context, @NotNull String ext) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(ext, "ext");
        Intent intent = new Intent("com.kubi.action.TIM_URI_LAUNCHER");
        intent.setPackage(context.getPackageName());
        intent.addCategory("android.intent.category.DEFAULT");
        intent.putExtra("ext", ext);
        intent.addFlags(268435456);
        return intent;
    }

    /* JADX INFO: renamed from: h */
    public final int m100241h() {
        return ((Number) f101946b.getValue()).intValue();
    }

    /* JADX INFO: renamed from: i */
    public final String m100242i() {
        return (String) f101947c.getValue();
    }

    /* JADX INFO: renamed from: j */
    public final void m100243j(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        m100245l();
        m100239f();
        m100246m(context);
    }

    /* JADX INFO: renamed from: k */
    public final void m100244k(String str) {
        Application application = BaseApplication.INSTANCE.get();
        application.startActivity(m100240g(application, str));
    }

    /* JADX INFO: renamed from: l */
    public final void m100245l() {
        MultiLanguageManager.f46805a.addOnLanguageChangeListener(new c());
    }

    /* JADX INFO: renamed from: f */
    public final void m100239f() {
        TIMPushManager.getInstance().addPushListener(new a());
    }

    /* JADX INFO: renamed from: m */
    public final void m100246m(Context context) {
        TIMPushManager.getInstance().forceUseFCMPushChannel(true);
        TIMPushManager.getInstance().disablePostNotificationInForeground(false);
        TIMPushManager.getInstance().registerPush(context, m100241h(), m100242i(), f101948d);
    }
}
