package com.kubi.kucoin.startup;

import android.annotation.SuppressLint;
import android.app.Application;
import androidx.lifecycle.Observer;
import androidx.media3.common.MimeTypes;
import com.kubi.kucoin.utils.CannotDeliverBroadcastExceptionFix;
import com.kubi.kucoin.utils.ThirdPartOrSystemExceptionFix;
import com.kubi.monitor.firebase.C19219a;
import com.kubi.monitor.firebase.C19220b;
import com.kubi.monitor.firebase.C19222d;
import com.kubi.sdk.BaseApplication;
import com.kubi.sdk.mode.AppMode;
import com.kubi.sdk.startup.IStartupTask;
import com.kubi.sdk.startup.StartupOption;
import com.kubi.sdk.startup.StartupStepType;
import com.kubi.sdk.startup.StartupThreadType;
import com.kubi.user.config.UserInfo;
import com.kubi.user.model.AccountEventState;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.util.List;
import nz.C42900a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p324hy.C38364b;
import p569qq.C43846g;
import p569qq.C43848i;
import p569qq.InterfaceC43844e;
import p604rq.InterfaceC44169a;
import p642tq.InterfaceC45058a;
import p642tq.InterfaceC45059b;
import p642tq.InterfaceC45063f;
import p642tq.InterfaceC45064g;
import p642tq.InterfaceC45065h;
import p694vk.C45590s;
import p852kotlin.Function;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MonitorStartupTask.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\b\u0010\b\u001a\u00020\u0005H\u0002J\b\u0010\t\u001a\u00020\u0005H\u0002¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/kucoin/startup/MonitorStartupTask;", "Lcom/kubi/sdk/startup/IStartupTask;", "<init>", "()V", "run", "", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "updateUser", "updateAppMode", "MonitorConfig", "LAppStartup_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@StartupOption(name = "monitor", priority = 1, stepType = StartupStepType.Setup, threadType = StartupThreadType.Main)
public final class MonitorStartupTask implements IStartupTask {

    /* JADX INFO: renamed from: com.kubi.kucoin.startup.MonitorStartupTask$a */
    /* JADX INFO: compiled from: MonitorStartupTask.kt */
    @Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0005H\u0016J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u0005H\u0016J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u0005H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/kucoin/startup/MonitorStartupTask$MonitorConfig;", "Lcom/kubi/monitor/IMonitorConfigProvider;", "<init>", "()V", "issues", "", "Lcom/kubi/monitor/core/IIssue;", "trackers", "Lcom/kubi/monitor/core/ITracker;", "breadcrumbs", "Lcom/kubi/monitor/core/IBreadcrumb;", "technologyTracker", "Lcom/kubi/monitor/core/ITechnologyTracker;", "kunlunTracker", "Lcom/kubi/monitor/business/IKunlunEventTracker;", "getIssuesImpl", "getITrackerImpl", "getIBreadcrumbImpl", "getITechnologyTrackers", "getIPerformanceImpl", "Lcom/kubi/monitor/core/IPerformance;", "getIKunlunTrackers", "LAppStartup_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15605a implements InterfaceC43844e {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final C15605a f28385a = new C15605a();

        /* JADX INFO: renamed from: b */
        @NotNull
        public static final List<InterfaceC45059b> f28386b;

        /* JADX INFO: renamed from: c */
        @NotNull
        public static final List<InterfaceC45065h> f28387c;

        /* JADX INFO: renamed from: d */
        @NotNull
        public static final List<InterfaceC45058a> f28388d;

        /* JADX INFO: renamed from: e */
        @NotNull
        public static final List<InterfaceC45064g> f28389e;

        /* JADX INFO: renamed from: f */
        @NotNull
        public static final List<InterfaceC44169a> f28390f;

        static {
            C38364b c38364b = C38364b.f86125a;
            f28386b = CollectionsKt.listOf(c38364b);
            f28387c = CollectionsKt.listOf(com.kubi.monitor.sensor.c.a);
            f28388d = CollectionsKt.listOf(c38364b);
            f28389e = CollectionsKt.listOf(C19219a.f35541a);
            f28390f = CollectionsKt.listOf(C42900a.f94979a);
        }

        @Override // p569qq.InterfaceC43844e
        @NotNull
        /* JADX INFO: renamed from: a */
        public List<InterfaceC45065h> mo32839a() {
            return f28387c;
        }

        @Override // p569qq.InterfaceC43844e
        @NotNull
        /* JADX INFO: renamed from: b */
        public List<InterfaceC45058a> mo32840b() {
            return f28388d;
        }

        @Override // p569qq.InterfaceC43844e
        @NotNull
        /* JADX INFO: renamed from: c */
        public List<InterfaceC44169a> mo32841c() {
            return f28390f;
        }

        @Override // p569qq.InterfaceC43844e
        @NotNull
        /* JADX INFO: renamed from: d */
        public List<InterfaceC45059b> mo32842d() {
            return f28386b;
        }

        @Override // p569qq.InterfaceC43844e
        @NotNull
        /* JADX INFO: renamed from: e */
        public InterfaceC45063f mo32843e() {
            return SafeFirebasePerformanceWrapper.f28417a;
        }

        @Override // p569qq.InterfaceC43844e
        @NotNull
        /* JADX INFO: renamed from: f */
        public List<InterfaceC45064g> mo32844f() {
            return f28389e;
        }
    }

    /* JADX INFO: renamed from: com.kubi.kucoin.startup.MonitorStartupTask$b */
    /* JADX INFO: compiled from: MonitorStartupTask.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15606b implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f28391b;

        public C15606b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f28391b = function;
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
            return this.f28391b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f28391b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    private final void updateAppMode() {
        C43846g.m96571f("APP-MODE", AppMode.Companion.getCurrentMode$default(AppMode.INSTANCE, null, 1, null).getModeType());
    }

    @Override // com.kubi.sdk.startup.IStartupTask
    @SuppressLint({"CheckResult"})
    public void run(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        C43848i.m96580h(BaseApplication.INSTANCE.get(), C45590s.f102687a.m100666Q(), C15605a.f28385a, C19222d.f35555a);
        C43848i.m96577a(C19220b.f35543a);
        C43848i.m96577a(com.kubi.monitor.sensor.b.a);
        updateUser();
        Observable observableA = UserInfo.a.a();
        final Function1 function1 = new Function1() { // from class: com.kubi.kucoin.startup.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MonitorStartupTask.run$lambda$0(this.f28406b, (AccountEventState) obj);
            }
        };
        observableA.subscribe(new Consumer() { // from class: com.kubi.kucoin.startup.j
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        });
        updateAppMode();
        AppMode.INSTANCE.getCurrentMode().observeForever(new C15606b(new Function1() { // from class: com.kubi.kucoin.startup.k
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MonitorStartupTask.run$lambda$2(this.f28408b, (AppMode) obj);
            }
        }));
        CannotDeliverBroadcastExceptionFix.f28590a.m33154a();
        ThirdPartOrSystemExceptionFix.f28558a.m33134a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit run$lambda$0(MonitorStartupTask monitorStartupTask, AccountEventState accountEventState) {
        monitorStartupTask.updateUser();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit run$lambda$2(MonitorStartupTask monitorStartupTask, AppMode appMode) {
        monitorStartupTask.updateAppMode();
        return Unit.INSTANCE;
    }

    private final void updateUser() {
        String str = UserInfo.c().uid;
        if (str == null) {
            str = "0";
        }
        C43846g.m96571f("UID", str);
    }
}
