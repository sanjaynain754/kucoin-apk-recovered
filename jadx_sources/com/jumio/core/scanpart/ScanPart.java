package com.jumio.core.scanpart;

import androidx.annotation.CallSuper;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.messaging.Constants;
import com.jumio.analytics.Analytics;
import com.jumio.analytics.MetaInfo;
import com.jumio.analytics.MobileEvents;
import com.jumio.commons.log.Log;
import com.jumio.core.Controller;
import com.jumio.core.ServiceLocator;
import com.jumio.core.ServiceLocatorInterface;
import com.jumio.core.interfaces.VibratorInterface;
import com.jumio.core.models.ReportingModel;
import com.jumio.core.models.ScanPartModel;
import com.jumio.core.network.ApiBinding;
import com.jumio.core.scanpart.ScanPart;
import com.jumio.sdk.credentials.JumioCredential;
import com.jumio.sdk.enums.JumioFallbackReason;
import com.jumio.sdk.enums.JumioScanMode;
import com.jumio.sdk.enums.JumioScanStep;
import com.jumio.sdk.enums.JumioScanUpdate;
import com.jumio.sdk.error.JumioError;
import com.jumio.sdk.interfaces.JumioScanPartInterface;
import com.jumio.sdk.retry.JumioRetryReason;
import com.jumio.sdk.scanpart.JumioScanPart;
import com.jumio.sdk.views.JumioAnimationView;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import jumio.core.AbstractC40736u3;
import jumio.core.C40741v3;
import jumio.core.C40746w3;
import jumio.core.C40751x3;
import jumio.core.EnumC40613W2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B'\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00028\u0000\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010(\u001a\u00020#2\u0006\u0010)\u001a\u00020\u00192\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+H\u0004J\u001c\u0010,\u001a\u00020#2\u0006\u0010)\u001a\u00020\u00192\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+H\u0004J(\u0010-\u001a\u00020#2\u0006\u0010.\u001a\u00020/2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+2\n\b\u0002\u00100\u001a\u0004\u0018\u00010+H\u0004J\b\u00105\u001a\u00020#H\u0014J\u0010\u00106\u001a\u00020#2\u0006\u00107\u001a\u000208H\u0016J\b\u00109\u001a\u00020#H\u0016J\b\u0010F\u001a\u00020#H\u0017J\u0010\u0010G\u001a\u00020#2\u0006\u0010H\u001a\u00020IH\u0017J\u0010\u0010J\u001a\u00020#2\u0006\u0010K\u001a\u00020LH\u0017J\b\u0010M\u001a\u00020#H\u0017J\b\u0010N\u001a\u00020#H\u0017J-\u0010O\u001a\u00020#2#\u0010P\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010R¢\u0006\f\bS\u0012\b\bT\u0012\u0004\b\b(U\u0012\u0004\u0012\u00020#0QH\u0016J\u0010\u0010V\u001a\u00020#2\u0006\u0010W\u001a\u00020XH&J\u0010\u0010Y\u001a\u0002082\u0006\u0010Z\u001a\u00020[H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\b\u001a\u00028\u0000X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\u00020\u001bX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001fX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001b\u0010\"\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b$\u0010%R\u0014\u00101\u001a\u0002028DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R$\u0010;\u001a\u0002082\u0006\u0010:\u001a\u000208@DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u0012\u0010?\u001a\u000208X¦\u0004¢\u0006\u0006\u001a\u0004\b?\u0010<R\u0012\u0010@\u001a\u000208X¦\u0004¢\u0006\u0006\u001a\u0004\bA\u0010<R\u0012\u0010B\u001a\u00020CX¦\u0004¢\u0006\u0006\u001a\u0004\bD\u0010E¨\u0006\\"}, m90084d2 = {"Lcom/jumio/core/scanpart/ScanPart;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/jumio/core/models/ScanPartModel;", "Lcom/jumio/core/interfaces/ScanPartInterface;", "controller", "Lcom/jumio/core/Controller;", URLCredentialContract.FeedEntry.TABLE_NAME, "Lcom/jumio/sdk/credentials/JumioCredential;", "scanPartModel", "scanPartInterface", "Lcom/jumio/sdk/interfaces/JumioScanPartInterface;", "<init>", "(Lcom/jumio/core/Controller;Lcom/jumio/sdk/credentials/JumioCredential;Lcom/jumio/core/models/ScanPartModel;Lcom/jumio/sdk/interfaces/JumioScanPartInterface;)V", "getController", "()Lcom/jumio/core/Controller;", "getCredential", "()Lcom/jumio/sdk/credentials/JumioCredential;", "getScanPartModel", "()Lcom/jumio/core/models/ScanPartModel;", "setScanPartModel", "(Lcom/jumio/core/models/ScanPartModel;)V", "Lcom/jumio/core/models/ScanPartModel;", "getScanPartInterface", "()Lcom/jumio/sdk/interfaces/JumioScanPartInterface;", "lastSeenScanUpdate", "Lcom/jumio/sdk/enums/JumioScanUpdate;", "reportingModel", "Lcom/jumio/core/models/ReportingModel;", "getReportingModel", "()Lcom/jumio/core/models/ReportingModel;", "vibrator", "Lcom/jumio/core/interfaces/VibratorInterface;", "getVibrator", "()Lcom/jumio/core/interfaces/VibratorInterface;", "registerBinding", "", "getRegisterBinding", "()Lkotlin/Unit;", "registerBinding$delegate", "Lkotlin/Lazy;", "sendUpdate", "scanUpdate", "data", "", "sendUpdateFiltered", "sendScanStep", "scanStep", "Lcom/jumio/sdk/enums/JumioScanStep;", "analytics", "analyticsScanData", "Lcom/jumio/analytics/MetaInfo;", "getAnalyticsScanData", "()Lcom/jumio/analytics/MetaInfo;", "reset", "persist", InterfaceC33730j9.f70350a, "", "restore", "value", "isComplete", "()Z", "setComplete", "(Z)V", "isCancelable", "hasFallback", "getHasFallback", "scanMode", "Lcom/jumio/sdk/enums/JumioScanMode;", "getScanMode", "()Lcom/jumio/sdk/enums/JumioScanMode;", "start", "retry", "reason", "Lcom/jumio/sdk/retry/JumioRetryReason;", "fallback", "fallbackReason", "Lcom/jumio/sdk/enums/JumioFallbackReason;", "cancel", "finish", "checkForAddon", "complete", "Lkotlin/Function1;", "Lcom/jumio/sdk/scanpart/JumioScanPart;", "Lkotlin/ParameterName;", "name", "addonScanPart", "getHelpAnimation", "animationView", "Lcom/jumio/sdk/views/JumioAnimationView;", "consumeError", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/jumio/sdk/error/JumioError;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nScanPart.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScanPart.kt\ncom/jumio/core/scanpart/ScanPart\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,210:1\n1#2:211\n*E\n"})
public abstract class ScanPart<T extends ScanPartModel> {

    /* JADX INFO: renamed from: a */
    public final Controller f14541a;

    /* JADX INFO: renamed from: b */
    public final JumioCredential f14542b;

    /* JADX INFO: renamed from: c */
    public ScanPartModel f14543c;

    /* JADX INFO: renamed from: d */
    public final JumioScanPartInterface f14544d;

    /* JADX INFO: renamed from: e */
    public JumioScanUpdate f14545e;

    /* JADX INFO: renamed from: f */
    public final ReportingModel f14546f;

    /* JADX INFO: renamed from: g */
    public final VibratorInterface f14547g;

    /* JADX INFO: renamed from: h */
    public boolean f14548h;

    public abstract boolean getHasFallback();

    public abstract void getHelpAnimation(@NotNull JumioAnimationView animationView);

    @NotNull
    public abstract JumioScanMode getScanMode();

    public abstract boolean isCancelable();

    public void reset() {
        this.f14545e = null;
        this.f14543c.clear();
    }

    public final synchronized void sendUpdateFiltered(@NotNull JumioScanUpdate scanUpdate, @Nullable Object data) {
        Intrinsics.checkNotNullParameter(scanUpdate, "scanUpdate");
        if (this.f14545e == scanUpdate) {
            return;
        }
        this.f14545e = scanUpdate;
        this.f14541a.getF13607h().postOnMain(new C40751x3(this, scanUpdate, data, null));
    }

    public ScanPart(@NotNull Controller controller, @NotNull JumioCredential credential, @NotNull T scanPartModel, @NotNull JumioScanPartInterface scanPartInterface) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(credential, "credential");
        Intrinsics.checkNotNullParameter(scanPartModel, "scanPartModel");
        Intrinsics.checkNotNullParameter(scanPartInterface, "scanPartInterface");
        this.f14541a = controller;
        this.f14542b = credential;
        this.f14543c = scanPartModel;
        this.f14544d = scanPartInterface;
        this.f14546f = (ReportingModel) controller.getF13603d().get(ReportingModel.class);
        this.f14547g = (VibratorInterface) ServiceLocatorInterface.getServiceImplementation$default(ServiceLocator.INSTANCE, VibratorInterface.class, null, 2, null);
        LazyKt.lazy(new Function0() { // from class: u9.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ScanPart.m14590a(this.f101583b);
            }
        }).getValue();
        Unit unit = Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final Unit m14590a(ScanPart scanPart) {
        if (scanPart instanceof ApiBinding) {
            scanPart.f14541a.getF13604e().addBinding((ApiBinding) scanPart);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void sendScanStep$default(ScanPart scanPart, JumioScanStep jumioScanStep, Object obj, Object obj2, int i11, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendScanStep");
        }
        if ((i11 & 2) != 0) {
            obj = null;
        }
        if ((i11 & 4) != 0) {
            obj2 = obj;
        }
        scanPart.sendScanStep(jumioScanStep, obj, obj2);
    }

    public static /* synthetic */ void sendUpdate$default(ScanPart scanPart, JumioScanUpdate jumioScanUpdate, Object obj, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendUpdate");
        }
        if ((i11 & 2) != 0) {
            obj = null;
        }
        scanPart.sendUpdate(jumioScanUpdate, obj);
    }

    public static /* synthetic */ void sendUpdateFiltered$default(ScanPart scanPart, JumioScanUpdate jumioScanUpdate, Object obj, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendUpdateFiltered");
        }
        if ((i11 & 2) != 0) {
            obj = null;
        }
        scanPart.sendUpdateFiltered(jumioScanUpdate, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CallSuper
    public void cancel() {
        Analytics.INSTANCE.add(MobileEvents.userAction("cancel", this.f14543c.getF14316e(), this.f14543c.getF14312a().name()));
        this.f14546f.m14565a(this.f14542b.getF14676b().f14197a, this.f14543c.getF14312a());
        if (this instanceof ApiBinding) {
            this.f14541a.getF13604e().removeBinding((ApiBinding) this);
        }
    }

    public void checkForAddon(@NotNull Function1<? super JumioScanPart, Unit> complete) {
        Intrinsics.checkNotNullParameter(complete, "complete");
        complete.invoke(null);
    }

    public boolean consumeError(@NotNull JumioError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        return false;
    }

    @CallSuper
    public void fallback(@NotNull JumioFallbackReason fallbackReason) {
        Intrinsics.checkNotNullParameter(fallbackReason, "fallbackReason");
        Analytics.INSTANCE.add(MobileEvents.userAction("fallback", this.f14543c.getF14316e(), this.f14543c.getF14312a().name()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CallSuper
    public void finish() {
        Analytics.INSTANCE.add(MobileEvents.userAction("finish", this.f14543c.getF14316e(), this.f14543c.getF14312a().name()));
        this.f14546f.m14565a(this.f14542b.getF14676b().f14197a, this.f14543c.getF14312a());
        if (this instanceof ApiBinding) {
            this.f14541a.getF13604e().removeBinding((ApiBinding) this);
        }
    }

    @NotNull
    public final MetaInfo getAnalyticsScanData() {
        MetaInfo metaInfo = new MetaInfo();
        metaInfo.put("side", this.f14543c.getF14312a().toString());
        metaInfo.put("type", MobileEvents.INSTANCE.getTypeFromScanMode(this.f14543c.getF14313b()));
        return metaInfo;
    }

    @NotNull
    /* JADX INFO: renamed from: getController, reason: from getter */
    public final Controller getF14541a() {
        return this.f14541a;
    }

    @NotNull
    /* JADX INFO: renamed from: getCredential, reason: from getter */
    public final JumioCredential getF14542b() {
        return this.f14542b;
    }

    @NotNull
    /* JADX INFO: renamed from: getReportingModel, reason: from getter */
    public final ReportingModel getF14546f() {
        return this.f14546f;
    }

    @NotNull
    /* JADX INFO: renamed from: getScanPartInterface, reason: from getter */
    public final JumioScanPartInterface getF14544d() {
        return this.f14544d;
    }

    @NotNull
    public final T getScanPartModel() {
        return (T) this.f14543c;
    }

    @NotNull
    /* JADX INFO: renamed from: getVibrator, reason: from getter */
    public final VibratorInterface getF14547g() {
        return this.f14547g;
    }

    /* JADX INFO: renamed from: isComplete, reason: from getter */
    public final boolean getF14548h() {
        return this.f14548h;
    }

    public void restore() {
        if (CollectionsKt.contains(CollectionsKt.listOf((Object[]) new JumioScanStep[]{JumioScanStep.STARTED, JumioScanStep.NEXT_PART, JumioScanStep.SCAN_VIEW}), this.f14543c.getF14316e())) {
            if (this.f14543c.getF14317f() == null) {
                this.f14543c.setLastRetryReason(new JumioRetryReason(1, ""));
            }
            JumioRetryReason lastRetryReason = this.f14543c.getF14317f();
            if (lastRetryReason != null) {
                retry(lastRetryReason);
            }
        }
    }

    @CallSuper
    public void retry(@NotNull JumioRetryReason reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        JumioRetryReason lastRetryReason = this.f14543c.getF14317f();
        if (lastRetryReason == null || reason.getF14742a() != lastRetryReason.getF14742a()) {
            throw new IllegalArgumentException("Specified retry reason is not valid");
        }
        this.f14543c.setLastRetryReason(null);
        this.f14543c.setScanStep(null);
        reset();
        Analytics.INSTANCE.add(MobileEvents.userAction("retry", this.f14543c.getF14316e(), this.f14543c.getF14312a().name()));
    }

    public final void sendScanStep(@NotNull JumioScanStep scanStep, @Nullable Object data, @Nullable Object analytics) {
        Intrinsics.checkNotNullParameter(scanStep, "scanStep");
        if (this.f14543c.getF14316e() == scanStep) {
            String simpleName = getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
            Log.m14484w(simpleName, "Duplicate " + scanStep + " received -> Please check");
        }
        this.f14543c.setScanStep(scanStep);
        this.f14546f.f14308e = scanStep;
        this.f14545e = null;
        int i11 = AbstractC40736u3.f90446a[scanStep.ordinal()];
        if (i11 == 1) {
            this.f14543c.setLastRetryReason((JumioRetryReason) data);
        } else if (i11 == 2 || i11 == 3) {
            ReportingModel reportingModel = this.f14546f;
            EnumC40613W2 pluginModule = ScanPartKt.access$getPluginModule(this.f14543c);
            reportingModel.getClass();
            Intrinsics.checkNotNullParameter(pluginModule, "pluginModule");
            if (!reportingModel.f14305b.contains(pluginModule)) {
                reportingModel.f14305b.add(pluginModule);
            }
        }
        Analytics.INSTANCE.add(MobileEvents.scanStep(scanStep, analytics));
        this.f14541a.getF13607h().postOnMain(new C40741v3(this, scanStep, data, null));
    }

    public final void sendUpdate(@NotNull JumioScanUpdate scanUpdate, @Nullable Object data) {
        Intrinsics.checkNotNullParameter(scanUpdate, "scanUpdate");
        this.f14545e = null;
        this.f14541a.getF13607h().postOnMain(new C40746w3(this, scanUpdate, data, null));
    }

    public final void setComplete(boolean z11) {
        this.f14548h = z11;
    }

    public final void setScanPartModel(@NotNull T t11) {
        Intrinsics.checkNotNullParameter(t11, "<set-?>");
        this.f14543c = t11;
    }

    @CallSuper
    public void start() {
        this.f14546f.m14566b(this.f14542b.getF14676b().f14197a, this.f14543c.getF14312a());
        reset();
        Analytics.INSTANCE.add(MobileEvents.userAction("start", this.f14543c.getF14316e(), this.f14543c.getF14312a().name()));
    }

    public void persist(boolean stop) {
    }
}
