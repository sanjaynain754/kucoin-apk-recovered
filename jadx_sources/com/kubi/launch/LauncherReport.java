package com.kubi.launch;

import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.monitor.TechnologyEvent;
import com.kubi.sdk.BaseConstants;
import com.kubi.sdk.startup.StartupDispatcher;
import com.tencent.bugly.proguard.InterfaceC33617e1;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;

/* JADX INFO: renamed from: com.kubi.launch.p, reason: from Kotlin metadata */
/* JADX INFO: compiled from: LauncherReport.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/launch/LauncherReport;", "", "<init>", "()V", "report", "", "context", "Lcom/kubi/launch/LauncherContext;", "startTimeOut", "reportTask", "pageExpose", "LAppFacade_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLauncherReport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LauncherReport.kt\ncom/kubi/launch/LauncherReport\n+ 2 TechnologyEvent.kt\ncom/kubi/monitor/TechnologyEvent\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,56:1\n71#2,4:57\n71#2,4:61\n71#2,2:65\n73#2,2:68\n1#3:67\n136#4:70\n*S KotlinDebug\n*F\n+ 1 LauncherReport.kt\ncom/kubi/launch/LauncherReport\n*L\n16#1:57,4\n29#1:61,4\n40#1:65,2\n40#1:68,2\n52#1:70\n*E\n"})
public final class LauncherReport {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final LauncherReport f31812a = new LauncherReport();

    /* JADX INFO: renamed from: a */
    public final void m37496a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("businessType", InterfaceC33617e1.f69659h);
        jSONObject.put("is_first_time", !C46392a.m102322d(BaseConstants.f46539a.m56609b(), false));
        Unit unit = Unit.INSTANCE;
        C43852m.m96600l("BTsplashNewPage", null, jSONObject, 2, null);
    }

    /* JADX INFO: renamed from: b */
    public final void m37497b(@NotNull LauncherContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        TechnologyEvent technologyEvent = TechnologyEvent.f35482a;
        TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
        eventParametersBuilderAcquire.m42393d("category", "splash_launcher");
        eventParametersBuilderAcquire.m42391b(FirebaseAnalytics.Param.METHOD, context.getF31807f().getF31814b());
        eventParametersBuilderAcquire.m42391b("code", context.getF31807f().getF31815c());
        eventParametersBuilderAcquire.m42391b(JAnalysisConstants.ACCOUNT_EXTRA_ATTR, context.getF31807f().getF31816d());
        eventParametersBuilderAcquire.m42394e("success", true);
        TechnologyEvent.m42388d("startup_event", eventParametersBuilderAcquire);
    }

    /* JADX INFO: renamed from: c */
    public final void m37498c(@NotNull LauncherContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        TechnologyEvent technologyEvent = TechnologyEvent.f35482a;
        TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
        eventParametersBuilderAcquire.m42391b("state", StartupDispatcher.INSTANCE.getState());
        eventParametersBuilderAcquire.m42394e("hasBiz", context.m37485d());
        String f31803b = context.getF31803b();
        if (f31803b != null) {
            eventParametersBuilderAcquire.m42393d("path", f31803b);
        }
        TechnologyEvent.m42388d("startup_task_event", eventParametersBuilderAcquire);
    }

    /* JADX INFO: renamed from: d */
    public final void m37499d(@NotNull LauncherContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        TechnologyEvent technologyEvent = TechnologyEvent.f35482a;
        TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
        eventParametersBuilderAcquire.m42393d("category", "splash_timeout");
        eventParametersBuilderAcquire.m42391b("privacy", context.getF31807f().getF31813a());
        eventParametersBuilderAcquire.m42391b(FirebaseAnalytics.Param.METHOD, context.getF31807f().getF31814b());
        eventParametersBuilderAcquire.m42391b("code", context.getF31807f().getF31815c());
        eventParametersBuilderAcquire.m42391b(JAnalysisConstants.ACCOUNT_EXTRA_ATTR, context.getF31807f().getF31816d());
        eventParametersBuilderAcquire.m42394e("success", true);
        TechnologyEvent.m42388d("startup_event", eventParametersBuilderAcquire);
    }
}
