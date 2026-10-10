package p502oj;

import android.os.SystemClock;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.sdk.util.StartupMinorTraceUtils;
import com.kubi.sdk.util.StartupTrace;
import com.kubi.utils.extensions.C27025c;
import com.tencent.bugly.proguard.C33820nf;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p569qq.C43846g;
import p569qq.C43852m;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: oj.f */
/* JADX INFO: compiled from: HomeTraceUtils.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u00102\u001a\u000203J\u000e\u00104\u001a\u0002032\u0006\u00105\u001a\u00020\u0005J\u0006\u00106\u001a\u000203J\u0006\u00107\u001a\u000203J\u0006\u00108\u001a\u00020\u001eJ\b\u00109\u001a\u00020.H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R\u000e\u0010#\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R*\u0010*\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050+j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005`,X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020.01X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006:"}, m90084d2 = {"Lcom/kubi/home/utils/HomeTraceUtils;", "", "<init>", "()V", "STEP_MAIN_ACTIVITY_XML_FINISH", "", "STEP_HOME_FRAGMENT_ON_CREATE", "STEP_HOME_FRAGMENT_ON_CREATE_VIEW", "STEP_HOME_FRAGMENT_ON_VIEW_CREATED", "STEP_HOME_PAGE_START_LOAD_DATA", "STEP_HOME_PAGE_USE_CACHE", "STEP_HOME_PAGE_START_FETCH_DATA", "STEP_HOME_PAGE_END_FETCH_DATA", "STEP_HOME_PAGE_START_ADD_WIDGET", "STEP_HOME_NEW_USER_WIDGET_ON_CREATE_VIEW", "STEP_HOME_NEW_USER_WIDGET_ON_VIEW_CREATED", "STEP_HOME_NEW_USER_WIDGET_LOAD_DATA", "STEP_HOME_NEW_USER_WIDGET_USE_CACHE", "STEP_HOME_NEW_USER_WIDGET_START_FETCH_DATA", "STEP_HOME_NEW_USER_WIDGET_END_FETCH_DATA", "STEP_HOME_NEW_USER_WIDGET_START_SHOW_UI", "STEP_HOME_MENU_WIDGET_ON_CREATE_VIEW", "STEP_HOME_MENU_WIDGET_ON_VIEW_CREATED", "STEP_HOME_MENU_WIDGET_LOAD_DATA", "STEP_HOME_MENU_WIDGET_USE_CACHE", "STEP_HOME_MENU_WIDGET_START_FETCH_DATA", "STEP_HOME_MENU_WIDGET_END_FETCH_DATA", "STEP_HOME_MENU_WIDGET_START_SHOW_UI", "STEP_HOME_FINISH", "enableOptimiseV1", "", "getEnableOptimiseV1", "()Z", "enableOptimiseV1$delegate", "Lkotlin/Lazy;", "VALUE_NO_CACHE", "VALUE_IN_CACHE", "PARAMS_OPTIMISE_VERSION", "PARAMS_TYPE", "PARAMS_SUB_TYPE", "PARAMS_URL", "TAG", "reportMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "startMills", "", "isFinish", "costMap", "Ljava/util/concurrent/ConcurrentHashMap;", "startHomeTrace", "", "addTrace", "key", "setDirtyData", "finish", "enableV1Optimise", "curTime", "HomeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHomeTraceUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeTraceUtils.kt\ncom/kubi/home/utils/HomeTraceUtils\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 4 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,164:1\n216#2,2:165\n35#3,4:167\n39#3:173\n44#4,2:171\n*S KotlinDebug\n*F\n+ 1 HomeTraceUtils.kt\ncom/kubi/home/utils/HomeTraceUtils\n*L\n125#1:165,2\n49#1:167,4\n49#1:173\n49#1:171,2\n*E\n"})
public final class C43101f {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C43101f f95302a = new C43101f();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f95303b = LazyKt.lazy(new Function0() { // from class: oj.e
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(C43101f.m94708d());
        }
    });

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final HashMap<String, String> f95304c;

    /* JADX INFO: renamed from: d */
    public static long f95305d;

    /* JADX INFO: renamed from: e */
    public static volatile boolean f95306e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final ConcurrentHashMap<String, Long> f95307f;

    /* JADX INFO: renamed from: oj.f$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class a extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: h */
    public final void m94714h() {
        f95306e = true;
    }

    /* JADX INFO: renamed from: i */
    public final void m94715i() {
        f95306e = false;
        f95307f.clear();
        f95305d = m94710c();
    }

    static {
        HashMap<String, String> map = new HashMap<>();
        map.put("main_activity_xml_finish", "duration1");
        map.put("home_fragment_on_create", "duration2");
        map.put("home_fragment_on_create_view", "duration3");
        map.put("home_fragment_on_view_created", "duration4");
        map.put("home_page_start_load_data", "duration5");
        map.put("home_page_widget_use_cache", "type");
        map.put("home_page_start_fetch_data", "duration6");
        map.put("home_page_end_fetch_data", "duration7");
        map.put("home_page_start_add_widget", "duration8");
        map.put("home_page_new_user_widget_on_create_view", "duration9");
        map.put("home_page_new_user_widget_on_view_created", "duration10");
        map.put("home_page_new_user_widget_load_data", "duration11");
        map.put("home_page_new_user_widget_use_cache", C33820nf.f71150f);
        map.put("home_page_new_user_widget_start_fetch_data", "duration12");
        map.put("home_page_new_user_widget_end_fetch_data", "duration13");
        map.put("home_page_new_user_widget_show_data", "duration14");
        map.put("home_page_menu_widget_on_create_view", "duration9");
        map.put("home_page_menu_widget_on_view_created", "duration10");
        map.put("home_page_menu_widget_load_data", "duration11");
        map.put("home_page_menu_widget_use_cache", C33820nf.f71150f);
        map.put("home_page_menu_widget_start_fetch_data", "duration12");
        map.put("home_page_menu_widget_end_fetch_data", "duration13");
        map.put("home_page_menu_widget_show_data", "duration14");
        map.put("home_page_finish", "duration15");
        f95304c = map;
        f95307f = new ConcurrentHashMap<>();
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m94708d() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("platform_home_time_cost_v1", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, true);
    }

    /* JADX INFO: renamed from: b */
    public final void m94709b(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (f95306e) {
            return;
        }
        ConcurrentHashMap<String, Long> concurrentHashMap = f95307f;
        if (concurrentHashMap.containsKey(key)) {
            return;
        }
        long jM94710c = m94710c() - f95305d;
        concurrentHashMap.put(key, Long.valueOf(jM94710c));
        StartupMinorTraceUtils.f48182a.m58421d("HomeTraceUtils", "addTrace: key:" + key + " cost=" + jM94710c);
    }

    /* JADX INFO: renamed from: f */
    public final void m94712f() {
        m94709b("home_page_finish");
        if (f95306e) {
            return;
        }
        f95306e = true;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("category", "startup_home");
        for (Map.Entry<String, Long> entry : f95307f.entrySet()) {
            if (!Intrinsics.areEqual(entry.getKey(), "home_page_widget_use_cache") && !Intrinsics.areEqual(entry.getKey(), "home_page_new_user_widget_use_cache") && !Intrinsics.areEqual(entry.getKey(), "home_page_menu_widget_use_cache")) {
                HashMap<String, String> map = f95304c;
                if (map.containsKey(entry.getKey())) {
                    String key = map.get(entry.getKey());
                    if (key == null) {
                        key = entry.getKey();
                    }
                    jSONObject.put(key, entry.getValue().longValue());
                }
            }
        }
        if (f95302a.m94711e()) {
            jSONObject.put("Busi_Type", "v2");
        }
        ConcurrentHashMap<String, Long> concurrentHashMap = f95307f;
        jSONObject.put("type", concurrentHashMap.containsKey("home_page_widget_use_cache") ? "1" : "0");
        jSONObject.put(C33820nf.f71150f, (concurrentHashMap.containsKey("home_page_new_user_widget_use_cache") || concurrentHashMap.containsKey("home_page_menu_widget_use_cache")) ? "1" : "0");
        jSONObject.put("path", StartupTrace.f48194a.m58453m());
        jSONObject.put("url", UUID.randomUUID().toString());
        C43852m.m96605q("duration_event", jSONObject);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m94713g() {
        return ((Boolean) f95303b.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: c */
    public final long m94710c() {
        return SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: e */
    public final boolean m94711e() {
        return m94713g();
    }
}
