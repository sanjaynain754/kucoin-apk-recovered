package com.kubi.p110rn.core;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.lifecycle.LifecycleOwner;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.monitor.TechnologyEvent;
import com.kubi.p110rn.Constants;
import com.kubi.p110rn.RNConstantKt;
import com.kubi.p110rn.entity.RnSensorReport;
import com.kubi.sdk.constant.monitor.KunlunEventNameEnum;
import com.kubi.sdk.pkg.util.C23985b;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.core.C27029c;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43848i;
import p569qq.C43851l;
import p569qq.C43852m;
import p604rq.InterfaceC44169a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: ReactStateContext.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0000\u0018\u0000 D2\u00020\u0001:\u0001DB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020&J\u0010\u0010'\u001a\u00020\u001c2\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u000e\u0010(\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020\u0005J\u000e\u0010*\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020\u0005J\u000e\u0010,\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020-J\u001f\u0010.\u001a\u00020-2\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020100\"\u000201¢\u0006\u0002\u00102J\u000e\u00103\u001a\u00020\u001c2\u0006\u00104\u001a\u00020\u0015J\u0010\u00105\u001a\u00020\u001c2\u0006\u00104\u001a\u00020\u0015H\u0002J\u001a\u00106\u001a\u00020\u001c2\u0006\u00107\u001a\u00020\u00052\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0007J\u0006\u00109\u001a\u00020\u001cJ\b\u0010:\u001a\u00020\u001cH\u0002J\u0006\u0010;\u001a\u00020\u001cJ\b\u0010<\u001a\u00020\u001cH\u0002J\b\u0010=\u001a\u00020\u001cH\u0002J\b\u0010>\u001a\u00020\u001cH\u0002J\b\u0010?\u001a\u00020\u001cH\u0002J&\u0010@\u001a\u00020\u001c2\u0006\u0010A\u001a\u00020\u00052\b\b\u0002\u0010B\u001a\u00020\n2\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0007H\u0002J\u0010\u0010C\u001a\u00020\u001c2\u0006\u0010A\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006E"}, m90084d2 = {"Lcom/kubi/rn/core/ReactStateContext;", "", "<init>", "()V", "loadType", "", "path", "", "version", "startTime", "", "startBaseLoadingTime", "startBizLoadingTime", "startRendereTime", "baseReadyDuration", "bizReadyDuration", "renderedDuration", "timeLimit", "isReportSensor", "Ljava/util/concurrent/atomic/AtomicBoolean;", "state", "Lcom/kubi/rn/core/IReactHostState;", "performanceWatcher", "Lcom/kubi/monitor/TechnologyPerformance$IPrefWatcher;", "rnSensorReport", "Lcom/kubi/rn/entity/RnSensorReport;", "onPageMountListener", "Lkotlin/Function0;", "", "getOnPageMountListener", "()Lkotlin/jvm/functions/Function0;", "setOnPageMountListener", "(Lkotlin/jvm/functions/Function0;)V", "initConfig", "param", "Lcom/kubi/rn/core/ReactInitParam;", "downgradeMode", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "setBizVersion", "setLoadBizType", "type", "setWhiteStatus", "whiteStatus", "isFirstEnter", "", "isIn", "states", "", "Lcom/kubi/rn/core/ReactHostStates;", "([Lcom/kubi/rn/core/ReactHostStates;)Z", "changeTo", "next", "watch", "changeToFailed", "errorCode", "errorMessage", "changeToFinish", "reportAllData", "exposeReportSensor", "reportSensor", "reportKunLun", "reportKunLunCode", "reportKunLunCost", "report", "code", TypedValues.TransitionType.S_DURATION, "reportPerformance", "Companion", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nReactStateContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactStateContext.kt\ncom/kubi/rn/core/ReactStateContext\n+ 2 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 3 ReactStateContext.kt\ncom/kubi/rn/core/ReactStateContext$Companion\n+ 4 KunlunEvent.kt\ncom/kubi/monitor/KunlunEvent\n+ 5 TechnologyEvent.kt\ncom/kubi/monitor/TechnologyEvent\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,305:1\n76#2,7:306\n40#3:313\n40#3:314\n41#3:315\n40#3:316\n40#3:317\n41#3:318\n40#3:319\n104#4,12:320\n71#5,2:332\n73#5,2:335\n1#6:334\n*S KotlinDebug\n*F\n+ 1 ReactStateContext.kt\ncom/kubi/rn/core/ReactStateContext\n*L\n73#1:306,7\n163#1:313\n167#1:314\n168#1:315\n168#1:316\n172#1:317\n173#1:318\n173#1:319\n258#1:320,12\n281#1:332,2\n281#1:335,2\n*E\n"})
public final class ReactStateContext {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "ReactContext";

    @NotNull
    private static final String TRACKER_NAME = "krn_bundle_load";
    private long baseReadyDuration;
    private long bizReadyDuration;
    private int loadType;

    @Nullable
    private Function0<Unit> onPageMountListener;

    @Nullable
    private String path;
    private long renderedDuration;
    private long startBaseLoadingTime;
    private long startBizLoadingTime;
    private long startRendereTime;

    @Nullable
    private String version;
    private long startTime = System.currentTimeMillis();
    private final int timeLimit = 30000;

    @NotNull
    private final AtomicBoolean isReportSensor = new AtomicBoolean(false);

    @NotNull
    private volatile IReactHostState state = ReactHostStates.Init;

    @NotNull
    private final C43851l.a performanceWatcher = C43851l.m96588a(TRACKER_NAME, false);

    @NotNull
    private final RnSensorReport rnSensorReport = new RnSensorReport(null, 0, false, null, 0, false, 0, false, 0, null, null, null, 0, 8191, null);

    /* JADX INFO: compiled from: ReactStateContext.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\u0007\u001a\u00020\bH\u0082\bJ\u0011\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0082\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/rn/core/ReactStateContext$Companion;", "", "<init>", "()V", "TAG", "", "TRACKER_NAME", "now", "", TypedValues.TransitionType.S_DURATION, "startTime", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nReactStateContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactStateContext.kt\ncom/kubi/rn/core/ReactStateContext$Companion\n*L\n1#1,305:1\n40#1:306\n*S KotlinDebug\n*F\n+ 1 ReactStateContext.kt\ncom/kubi/rn/core/ReactStateContext$Companion\n*L\n41#1:306\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final long duration(long startTime) {
            return System.currentTimeMillis() - startTime;
        }

        private final long now() {
            return System.currentTimeMillis();
        }
    }

    public static /* synthetic */ void changeToFailed$default(ReactStateContext reactStateContext, int i11, String str, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            str = null;
        }
        reactStateContext.changeToFailed(i11, str);
    }

    private final void report(int code, long duration, String errorMessage) {
        String str = this.path;
        if (str == null) {
            return;
        }
        TechnologyEvent technologyEvent = TechnologyEvent.f35482a;
        TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
        eventParametersBuilderAcquire.m42391b("code", code);
        eventParametersBuilderAcquire.m42393d("path", str);
        String str2 = this.version;
        if (str2 != null) {
            eventParametersBuilderAcquire.m42393d("version", str2);
        }
        if (duration > 0) {
            eventParametersBuilderAcquire.m42396g(TypedValues.TransitionType.S_DURATION, duration);
        }
        if (errorMessage != null) {
            eventParametersBuilderAcquire.m42393d("error_message", errorMessage);
        }
        TechnologyEvent.m42388d("krn_load_rate", eventParametersBuilderAcquire);
    }

    public static /* synthetic */ void report$default(ReactStateContext reactStateContext, int i11, long j11, String str, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            j11 = 0;
        }
        if ((i12 & 4) != 0) {
            str = null;
        }
        reactStateContext.report(i11, j11, str);
    }

    private final void reportAllData() throws JSONException {
        if (this.isReportSensor.getAndSet(true)) {
            return;
        }
        reportSensor();
        reportKunLun();
    }

    private final void reportKunLunCode() {
        KunlunEventNameEnum kunlunEventNameEnum = KunlunEventNameEnum.FRONTEND_RNPAGE_COUNT;
        TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
        eventParametersBuilderAcquire.m42393d(Constants.BIZ, this.rnSensorReport.getBiz());
        eventParametersBuilderAcquire.m42391b("code", this.rnSensorReport.getCode());
        eventParametersBuilderAcquire.m42393d("category", "page_finish");
        TechnologyEvent.C19216a c19216a = TechnologyEvent.C19216a.f35485a;
        Map<String, Object> mapM42399c = c19216a.m42399c(eventParametersBuilderAcquire);
        Map<String, Number> mapM42398a = c19216a.m42398a(eventParametersBuilderAcquire);
        for (InterfaceC44169a interfaceC44169a : C43848i.f96913a.m96586e().mo32841c()) {
            if (mapM42398a.isEmpty()) {
                interfaceC44169a.mo94079b(kunlunEventNameEnum.getEventName(), mapM42399c);
            } else {
                interfaceC44169a.mo94078a(kunlunEventNameEnum.getEventName(), mapM42398a, mapM42399c);
            }
        }
    }

    private final void reportPerformance(int code) {
        String str = this.path;
        if (str == null) {
            return;
        }
        C43851l.a aVar = this.performanceWatcher;
        aVar.putAttribute("path", str);
        aVar.putAttribute("code", String.valueOf(code));
        String str2 = this.version;
        if (str2 != null) {
            aVar.putAttribute("version", str2);
        }
        aVar.mo32882a("baseReady", this.baseReadyDuration);
        aVar.mo32882a("bizReady", this.bizReadyDuration);
        aVar.mo32882a("rendered", this.renderedDuration);
        aVar.stop();
    }

    private final void reportSensor() throws JSONException {
        C44128b.m97259c(TAG, "reportSensor: " + C27029c.m66606i(this.rnSensorReport));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("category", "load_rn_page");
        jSONObject.put(Constants.BIZ, this.rnSensorReport.getBiz());
        jSONObject.put("finishedTime", this.rnSensorReport.getFinishedTime());
        jSONObject.put("isFirstEnter", this.rnSensorReport.isFirstEnter());
        jSONObject.put("version", this.rnSensorReport.getVersion());
        jSONObject.put("code", this.rnSensorReport.getCode());
        jSONObject.put("hitEngineCache", this.rnSensorReport.getHitEngineCache());
        jSONObject.put("downgradeMode", this.rnSensorReport.getDowngradeMode());
        jSONObject.put("whiteStatus", this.rnSensorReport.getWhiteStatus());
        jSONObject.put("isRemote", this.rnSensorReport.isRemote());
        jSONObject.put("siteType", this.rnSensorReport.getSiteType());
        jSONObject.put("appMode", this.rnSensorReport.getAppMode());
        jSONObject.put("pageMount", this.rnSensorReport.getPageMount());
        jSONObject.put("subPath", this.rnSensorReport.getSubPath());
        C43852m.m96605q("app_rn_sensor", jSONObject);
    }

    private final void watch(IReactHostState next) {
        C23985b.f47489a.m57877e("rnState", "rn watch state:" + next);
        if (next == ReactHostStates.Prepare) {
            this.performanceWatcher.start();
            return;
        }
        if (next == ReactHostStates.Loading) {
            this.startBaseLoadingTime = System.currentTimeMillis();
            return;
        }
        if (next == ReactHostStates.LoadingSplit) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.startBizLoadingTime = jCurrentTimeMillis;
            this.baseReadyDuration = System.currentTimeMillis() - jCurrentTimeMillis;
        } else if (next == ReactHostStates.Loaded) {
            this.startRendereTime = System.currentTimeMillis();
            this.bizReadyDuration = System.currentTimeMillis() - this.startBizLoadingTime;
        } else if (next == ReactHostStates.Running) {
            long jCurrentTimeMillis2 = System.currentTimeMillis() - this.startTime;
            this.rnSensorReport.setFinishedTime(jCurrentTimeMillis2);
            this.rnSensorReport.setCode(200);
            int i11 = this.loadType + 200;
            report$default(this, i11, jCurrentTimeMillis2, null, 4, null);
            reportPerformance(i11);
        }
    }

    public final void changeTo(@NotNull IReactHostState next) {
        Intrinsics.checkNotNullParameter(next, "next");
        if (this.state.canChangeTo(next)) {
            this.state = next;
            watch(next);
            return;
        }
        C44128b.m97266j(TAG, this.state + " 状态切换异常：" + next);
    }

    public final void changeToFailed(int errorCode, @Nullable String errorMessage) {
        this.rnSensorReport.setCode(errorCode);
        IReactHostState iReactHostStateFailed = this.state.failed();
        if (iReactHostStateFailed == null) {
            return;
        }
        this.state = iReactHostStateFailed;
        C23985b.m57873d(C23985b.f47489a, "openKRN", "changeToFailed code:" + errorCode + ", " + errorMessage, null, 4, null);
        if (iReactHostStateFailed == ReactHostStates.Failed) {
            if (ReactConstKt.getDeveloperSupport()) {
                ToastCompat.m66441G("code:" + errorCode + ", " + errorMessage, new Object[0]);
            }
            report$default(this, errorCode, 0L, errorMessage, 2, null);
        }
    }

    public final void changeToFinish() {
        this.state = ReactHostStates.Final;
        reportAllData();
    }

    @Nullable
    public final Function0<Unit> getOnPageMountListener() {
        return this.onPageMountListener;
    }

    public final void initConfig(@NotNull ReactInitParam param, int downgradeMode, @NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(param, "param");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.path = param.getBiz() + '-' + param.getEntry();
        this.rnSensorReport.setBiz(param.getBiz());
        this.rnSensorReport.setDowngradeMode(downgradeMode);
        if (C12573b.f21598a.m23696a()) {
            RNConstantKt.SEND_PAGE_MOUNT.length();
        }
        C12572a.m23692a(lifecycleOwner, false, new ReactStateContext$initConfig$$inlined$bindFlowEvent$default$1(RNConstantKt.SEND_PAGE_MOUNT, null, this, param));
    }

    public final void isFirstEnter(boolean isFirstEnter) {
        this.rnSensorReport.setFirstEnter(isFirstEnter);
    }

    public final boolean isIn(@NotNull ReactHostStates... states) {
        Intrinsics.checkNotNullParameter(states, "states");
        return ArraysKt.contains(states, this.state);
    }

    public final void setBizVersion(@Nullable String version) {
        this.version = version;
        RnSensorReport rnSensorReport = this.rnSensorReport;
        if (version == null) {
            version = "";
        }
        rnSensorReport.setVersion(version);
    }

    public final void setLoadBizType(int type) {
        this.loadType = type;
        if (type == 2 || type == 3) {
            this.rnSensorReport.setRemote(true);
        } else {
            this.rnSensorReport.setRemote(false);
        }
        int i11 = this.loadType;
        if (i11 == 1 || i11 == 3) {
            this.rnSensorReport.setHitEngineCache(true);
        } else {
            this.rnSensorReport.setHitEngineCache(false);
        }
    }

    public final void setOnPageMountListener(@Nullable Function0<Unit> function0) {
        this.onPageMountListener = function0;
    }

    public final void setWhiteStatus(int whiteStatus) {
        this.rnSensorReport.setWhiteStatus(whiteStatus);
    }

    private final void reportKunLun() {
        reportKunLunCode();
        if (this.rnSensorReport.getCode() == 200) {
            reportKunLunCost();
        }
    }

    public final void exposeReportSensor() {
        reportAllData();
    }

    private final void reportKunLunCost() {
    }
}
