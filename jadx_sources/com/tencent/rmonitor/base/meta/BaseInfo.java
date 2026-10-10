package com.tencent.rmonitor.base.meta;

import android.app.Application;
import android.content.SharedPreferences;
import com.tencent.bugly.common.meta.UserMeta;
import com.tencent.bugly.common.network.ssl.NameVerifierFactory;
import com.tencent.bugly.common.utils.ProcessUtil;
import com.tencent.bugly.proguard.C33591ch;
import com.tencent.bugly.proguard.C33714ie;
import com.tencent.bugly.proguard.C33716ig;
import com.tencent.bugly.proguard.C33791m7;
import com.tencent.bugly.proguard.C34008x0;
import com.tencent.bugly.proguard.InterfaceC33611dg;
import com.tencent.rmonitor.base.p144db.DBHelper;
import com.tencent.rmonitor.common.logger.Logger;
import com.tencent.rmonitor.common.logger.NativeLogger;
import com.tencent.rmonitor.common.network.ssl.RMonitorNameVerifier;
import com.tencent.rmonitor.common.util.AppInfo;
import com.tencent.rmonitor.common.util.AppVersionHelper;
import com.tencent.rmonitor.common.util.AsyncSPEditor;
import com.tencent.rmonitor.common.util.FileUtil;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m90084d2 = {"Lcom/tencent/rmonitor/base/meta/BaseInfo;", "", "()V", "Info", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class BaseInfo {

    /* JADX INFO: renamed from: Info, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(0 == true ? 1 : 0);

    @NotNull
    private static String TAG = "RMonitor_BaseInfo";

    @JvmField
    @Nullable
    public static Application app;

    @JvmField
    @Nullable
    public static DBHelper dbHelper;

    @JvmField
    @NotNull
    public static AsyncSPEditor editor;

    @JvmField
    @NotNull
    public static AtomicBoolean hasInit;

    @JvmField
    @Nullable
    public static Boolean is64Bit;

    @JvmField
    @NotNull
    public static JSONObject pubJson;

    @JvmField
    @Nullable
    public static SharedPreferences sharePreference;

    @JvmField
    @NotNull
    public static final UrlMeta urlMeta;

    @JvmField
    @NotNull
    public static final UserMeta userMeta;

    /* JADX INFO: renamed from: com.tencent.rmonitor.base.meta.BaseInfo$Info, reason: from kotlin metadata */
    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b/\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\u0006\u001a\u00020\u0002H\u0007J\b\u0010\u0007\u001a\u00020\u0002H\u0007J\b\u0010\b\u001a\u00020\u0002H\u0007J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0007R(\u0010\f\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\f\u0010\r\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020#8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, m90084d2 = {"Lcom/tencent/rmonitor/base/meta/BaseInfo$Info;", "", "", "reset", "Lcom/tencent/bugly/proguard/x0;", "makeBaseDBParam", "initUrl", "initSp", "initInfo", "", "jsonString", "initPubJson", "TAG", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "setTAG", "(Ljava/lang/String;)V", "getTAG$annotations", "()V", "Landroid/app/Application;", "app", "Landroid/app/Application;", "Lcom/tencent/rmonitor/base/db/DBHelper;", "dbHelper", "Lcom/tencent/rmonitor/base/db/DBHelper;", "Lcom/tencent/rmonitor/common/util/AsyncSPEditor;", "editor", "Lcom/tencent/rmonitor/common/util/AsyncSPEditor;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "hasInit", "Ljava/util/concurrent/atomic/AtomicBoolean;", "", "is64Bit", "Ljava/lang/Boolean;", "Lorg/json/JSONObject;", "pubJson", "Lorg/json/JSONObject;", "Landroid/content/SharedPreferences;", "sharePreference", "Landroid/content/SharedPreferences;", "Lcom/tencent/rmonitor/base/meta/UrlMeta;", "urlMeta", "Lcom/tencent/rmonitor/base/meta/UrlMeta;", "Lcom/tencent/bugly/common/meta/UserMeta;", "userMeta", "Lcom/tencent/bugly/common/meta/UserMeta;", "<init>", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final void initInfo() {
            DBHelper companion;
            if (BaseInfo.hasInit.get()) {
                return;
            }
            Application application = BaseInfo.app;
            if (application != null) {
                C33591ch.m72745c(application);
                UserMeta userMeta = BaseInfo.userMeta;
                if (userMeta.appVersion.length() == 0) {
                    userMeta.appVersion = AppVersionHelper.INSTANCE.checkAndGetAppVersion(application.getApplicationContext());
                }
                if (userMeta.buildNumber.length() == 0) {
                    userMeta.buildNumber = AppVersionHelper.INSTANCE.checkAndGetUuid(application.getApplicationContext());
                }
                FileUtil.INSTANCE.setApp(application);
                NameVerifierFactory.INSTANCE.setNameVerifier(new RMonitorNameVerifier());
                BaseInfo.INSTANCE.initSp();
                try {
                    companion = DBHelper.INSTANCE.getInstance(application);
                } catch (Throwable unused) {
                    companion = null;
                }
                BaseInfo.dbHelper = companion;
                Companion companion2 = BaseInfo.INSTANCE;
                UserMeta userMeta2 = BaseInfo.userMeta;
                companion2.initPubJson(userMeta2.toJSON());
                BaseInfo.is64Bit = Boolean.valueOf(ProcessUtil.INSTANCE.is64BitProcess(application));
                NativeLogger.initLogLevel(Logger.INSTANCE.getIntLevel());
                userMeta2.setModel(C33714ie.m73408k().mo73416d());
                userMeta2.cacheAppVersionMode();
            }
            BaseInfo.hasInit.compareAndSet(false, true);
        }

        @JvmStatic
        public final void initPubJson(@NotNull String jsonString) {
            JSONObject jSONObject;
            Intrinsics.checkNotNullParameter(jsonString, "jsonString");
            try {
                jSONObject = new JSONObject(jsonString);
            } catch (Throwable unused) {
                jSONObject = new JSONObject();
            }
            BaseInfo.pubJson = jSONObject;
        }

        @JvmStatic
        public final void initSp() {
            if (BaseInfo.sharePreference == null) {
                synchronized (BaseInfo.INSTANCE.getClass()) {
                    try {
                        if (BaseInfo.sharePreference == null) {
                            BaseInfo.sharePreference = C33716ig.m73433a().getSharedPreferences(BaseInfo.app, InterfaceC33611dg.f69592a, false);
                            SharedPreferences sharedPreferences = BaseInfo.sharePreference;
                            BaseInfo.editor = new AsyncSPEditor(sharedPreferences != null ? sharedPreferences.edit() : null);
                            UserMeta userMeta = BaseInfo.userMeta;
                            userMeta.sharePreference = BaseInfo.sharePreference;
                            userMeta.crashSharedPreferences = C33716ig.m73433a().getSharedPreferences(BaseInfo.app, "BUGLY_COMMON_VALUES", false);
                        }
                    } catch (Throwable th2) {
                        Logger.INSTANCE.exception(BaseInfo.INSTANCE.getTAG(), th2);
                        BaseInfo.sharePreference = null;
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
        }

        @JvmStatic
        public final void initUrl() {
            UrlMeta urlMeta = BaseInfo.urlMeta;
            urlMeta.setAuthorizationUrl(urlMeta.rmonitorDomain + "/entrance/" + BaseInfo.userMeta.appId + "/authorize/");
        }

        @JvmStatic
        @NotNull
        public final C34008x0 makeBaseDBParam() {
            C34008x0 c34008x0 = new C34008x0();
            c34008x0.f72483b = AppInfo.INSTANCE.obtainProcessName(BaseInfo.app);
            UserMeta userMeta = BaseInfo.userMeta;
            c34008x0.f72482a = userMeta.appId;
            c34008x0.f72484c = userMeta.appVersion;
            c34008x0.f72488g = userMeta.uin;
            c34008x0.f72486e = C33591ch.m72741a(BaseInfo.app);
            c34008x0.f72487f = C33591ch.f69465f;
            return c34008x0;
        }

        public final void setTAG(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            BaseInfo.TAG = str;
        }

        @NotNull
        public final String getTAG() {
            return BaseInfo.TAG;
        }

        @JvmStatic
        public final void reset() {
            initUrl();
            initPubJson(BaseInfo.userMeta.toJSON());
        }

        @JvmStatic
        public static /* synthetic */ void getTAG$annotations() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        UserMeta userMetaM74054e = C33791m7.m74054e();
        Intrinsics.checkNotNullExpressionValue(userMetaM74054e, "getUserMeta()");
        userMeta = userMetaM74054e;
        urlMeta = new UrlMeta(null, null, null, 7, null);
        SharedPreferences sharedPreferences = sharePreference;
        editor = new AsyncSPEditor(sharedPreferences != null ? sharedPreferences.edit() : null);
        pubJson = new JSONObject();
        is64Bit = Boolean.TRUE;
        hasInit = new AtomicBoolean(false);
    }

    @NotNull
    public static final String getTAG() {
        return INSTANCE.getTAG();
    }

    @JvmStatic
    public static final void initInfo() {
        INSTANCE.initInfo();
    }

    @JvmStatic
    public static final void initPubJson(@NotNull String str) {
        INSTANCE.initPubJson(str);
    }

    @JvmStatic
    public static final void initSp() {
        INSTANCE.initSp();
    }

    @JvmStatic
    public static final void initUrl() {
        INSTANCE.initUrl();
    }

    @JvmStatic
    @NotNull
    public static final C34008x0 makeBaseDBParam() {
        return INSTANCE.makeBaseDBParam();
    }

    @JvmStatic
    public static final void reset() {
        INSTANCE.reset();
    }

    public static final void setTAG(@NotNull String str) {
        INSTANCE.setTAG(str);
    }
}
