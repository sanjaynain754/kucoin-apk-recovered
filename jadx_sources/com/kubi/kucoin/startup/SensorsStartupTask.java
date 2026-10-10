package com.kubi.kucoin.startup;

import android.annotation.SuppressLint;
import android.app.Application;
import androidx.lifecycle.Observer;
import androidx.media3.common.MimeTypes;
import com.appsflyer.AppsFlyerProperties;
import com.blankj.utilcode.util.C5276j;
import com.kubi.host.HostManager;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.mode.AppMode;
import com.kubi.sdk.site.SiteType;
import com.kubi.sdk.startup.IStartupTask;
import com.kubi.sdk.startup.StartupOption;
import com.kubi.sdk.startup.StartupStepType;
import com.kubi.sdk.startup.StartupThreadType;
import com.kubi.sdk.util.DeviceTierProvider;
import com.kubi.user.config.UserInfo;
import com.kubi.user.model.LoginUserEntity;
import com.kubi.utils.C27100x0;
import com.sensorsdata.analytics.android.sdk.SAConfigOptions;
import com.sensorsdata.analytics.android.sdk.SensorsDataAPI;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p694vk.C45590s;
import p813yy.C46612b;
import p852kotlin.Function;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import w70.C45749b;

/* JADX INFO: compiled from: SensorsStartupTask.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\b\u0010\b\u001a\u00020\u0005H\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\f\u001a\u00020\u0005H\u0002¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/kucoin/startup/SensorsStartupTask;", "Lcom/kubi/sdk/startup/IStartupTask;", "<init>", "()V", "run", "", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "updateUser", "getTheme", "", "getSystemTheme", "updateAppMode", "Companion", "LAppStartup_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@StartupOption(name = "sensors", priority = 200, stepType = StartupStepType.Application, threadType = StartupThreadType.Main)
public final class SensorsStartupTask implements IStartupTask {

    @NotNull
    public static final String TAG = "SensorsDataConfig";

    /* JADX INFO: renamed from: com.kubi.kucoin.startup.SensorsStartupTask$b */
    /* JADX INFO: compiled from: SensorsStartupTask.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15614b implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f28394b;

        public C15614b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f28394b = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p852kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f28394b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f28394b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: com.kubi.kucoin.startup.SensorsStartupTask$a */
    /* JADX INFO: compiled from: SensorsStartupTask.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C15613a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UserInfo.LoginState.values().length];
            try {
                iArr[UserInfo.LoginState.Login.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UserInfo.LoginState.None.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final String getSystemTheme() {
        return DayNightThemeManager.f28592a.m33184i() == 1 ? "light" : "dark";
    }

    private final String getTheme() {
        DayNightThemeManager dayNightThemeManager = DayNightThemeManager.f28592a;
        if (dayNightThemeManager.m33190o()) {
            return "followSystem";
        }
        if (dayNightThemeManager.m33190o() || dayNightThemeManager.m33184i() != 1) {
            return (dayNightThemeManager.m33190o() || dayNightThemeManager.m33184i() != 2) ? "followSystem" : "dark";
        }
        return "light";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit run$lambda$2(SensorsStartupTask sensorsStartupTask, Application application) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        C45590s c45590s = C45590s.f102687a;
        jSONObject.put(AppsFlyerProperties.CHANNEL, c45590s.m100665P());
        jSONObject.put("build_type", c45590s.m100660K());
        jSONObject.put("site_type", SiteType.INSTANCE.getCurrentSiteType());
        jSONObject.put(BaseActivity.THEME, sensorsStartupTask.getTheme());
        jSONObject.put("follow_system_theme", sensorsStartupTask.getSystemTheme());
        jSONObject.put("x_device_no", C5276j.m6247f());
        jSONObject.put("kc_device_tier", DeviceTierProvider.m58405b(application).getIntValue());
        SensorsDataAPI.sharedInstance().registerSuperProperties(jSONObject);
        return Unit.INSTANCE;
    }

    private final void updateAppMode() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.kucoin.startup.d0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SensorsStartupTask.updateAppMode$lambda$9();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateAppMode$lambda$9() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("APP_MODE", AppMode.Companion.getCurrentMode$default(AppMode.INSTANCE, null, 1, null).getModeType());
        SensorsDataAPI.sharedInstance().registerSuperProperties(jSONObject);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateUser$lambda$7(boolean z11, String str, LoginUserEntity loginUserEntity) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_login", z11);
        jSONObject.put("login_status", str);
        jSONObject.put("is_vip", loginUserEntity.getFeeLevel() > 0);
        jSONObject.put("vip_level", String.valueOf(loginUserEntity.getFeeLevel()));
        jSONObject.put("is_proxy", C45749b.m100996g());
        SensorsDataAPI.sharedInstance().registerSuperProperties(jSONObject);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.startup.IStartupTask
    @SuppressLint({"CheckResult"})
    public void run(@NotNull final Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(HostManager.a.t());
        C45590s c45590s = C45590s.f102687a;
        sb2.append(c45590s.m100670U());
        SAConfigOptions sAConfigOptions = new SAConfigOptions(sb2.toString());
        sAConfigOptions.setAutoTrackEventType(3);
        sAConfigOptions.enableLog(c45590s.m100666Q());
        sAConfigOptions.enableJavaScriptBridge(false);
        if (c45590s.m100666Q()) {
            sAConfigOptions.setFlushBulkSize(10);
            sAConfigOptions.setFlushInterval(5000);
        }
        SensorsDataAPI.startWithConfigOptions(application, sAConfigOptions);
        C27100x0.m66923d(new Function0() { // from class: com.kubi.kucoin.startup.e0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SensorsStartupTask.run$lambda$2(this.f28399b, application);
            }
        });
        updateUser();
        Observable observableJ = UserInfo.a.j();
        final Function1 function1 = new Function1() { // from class: com.kubi.kucoin.startup.f0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SensorsStartupTask.run$lambda$3(this.f28402b, (LoginUserEntity) obj);
            }
        };
        observableJ.subscribe(new Consumer() { // from class: com.kubi.kucoin.startup.g0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        });
        updateAppMode();
        AppMode.INSTANCE.getCurrentMode().observeForever(new C15614b(new Function1() { // from class: com.kubi.kucoin.startup.h0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SensorsStartupTask.run$lambda$5(this.f28405b, (AppMode) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit run$lambda$3(SensorsStartupTask sensorsStartupTask, LoginUserEntity loginUserEntity) {
        sensorsStartupTask.updateUser();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit run$lambda$5(SensorsStartupTask sensorsStartupTask, AppMode appMode) {
        sensorsStartupTask.updateAppMode();
        return Unit.INSTANCE;
    }

    private final void updateUser() {
        boolean z11;
        final String str;
        final LoginUserEntity loginUserEntityC = UserInfo.c();
        String str2 = loginUserEntityC.uid;
        if (str2 != null && str2.length() != 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        final boolean z12 = !z11;
        if (!z11) {
            SensorsDataAPI.sharedInstance().login(loginUserEntityC.uid);
        }
        int i11 = C15613a.$EnumSwitchMapping$0[UserInfo.a.d().ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                str = "NOT_LOGGED_IN";
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            str = "FULLY_LOGGED_IN";
        }
        C27100x0.m66923d(new Function0() { // from class: com.kubi.kucoin.startup.c0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SensorsStartupTask.updateUser$lambda$7(z12, str, loginUserEntityC);
            }
        });
        if (!z11) {
            SensorsDataAPI.sharedInstance().profileSet("app_login_language", C46612b.f104366a.m102772a().toLanguageTag());
        }
    }
}
