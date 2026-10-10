package com.jumio.sdk.credentials;

import com.google.firebase.messaging.Constants;
import com.jumio.analytics.Analytics;
import com.jumio.analytics.MobileEvents;
import com.jumio.core.Controller;
import com.jumio.core.models.CredentialDataModel;
import com.jumio.core.models.ReportingModel;
import com.jumio.core.models.ScanPartModel;
import com.jumio.core.scanpart.ScanPart;
import com.jumio.sdk.credentials.JumioCredential;
import com.jumio.sdk.enums.JumioCredentialPart;
import com.jumio.sdk.error.JumioError;
import com.jumio.sdk.exceptions.SDKNotConfiguredException;
import com.jumio.sdk.interfaces.JumioScanPartInterface;
import com.jumio.sdk.scanpart.JumioScanPart;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import jumio.core.C40691l3;
import jumio.core.C40696m3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\"H&J\r\u0010#\u001a\u00020$H\u0010¢\u0006\u0002\b%J\b\u0010&\u001a\u00020$H\u0016J\b\u0010'\u001a\u00020$H\u0016J\u0015\u0010(\u001a\u00020$2\u0006\u0010)\u001a\u00020\u0015H\u0010¢\u0006\u0002\b*J\u0015\u0010+\u001a\u00020$2\u0006\u0010)\u001a\u00020\u0015H\u0010¢\u0006\u0002\b,J\u0015\u0010-\u001a\u00020$2\u0006\u0010.\u001a\u00020\rH\u0000¢\u0006\u0002\b/J\r\u00100\u001a\u00020$H\u0000¢\u0006\u0002\b1J\u0019\u00102\u001a\u0004\u0018\u00010\r2\u0006\u00103\u001a\u000204H\u0000¢\u0006\u0004\b5\u00106J\b\u00107\u001a\u0004\u0018\u00010\u0015R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u00020\rX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u001dR\u0012\u0010\u001e\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u000e¨\u00068"}, m90084d2 = {"Lcom/jumio/sdk/credentials/JumioCredential;", "", "controller", "Lcom/jumio/core/Controller;", "data", "Lcom/jumio/core/models/CredentialDataModel;", "<init>", "(Lcom/jumio/core/Controller;Lcom/jumio/core/models/CredentialDataModel;)V", "getController$jumio_core_release", "()Lcom/jumio/core/Controller;", "getData$jumio_core_release", "()Lcom/jumio/core/models/CredentialDataModel;", "isComplete", "", "()Z", "credentialParts", "", "Lcom/jumio/sdk/enums/JumioCredentialPart;", "getCredentialParts", "()Ljava/util/List;", "activeScanPart", "Lcom/jumio/sdk/scanpart/JumioScanPart;", "getActiveScanPart$jumio_core_release", "()Lcom/jumio/sdk/scanpart/JumioScanPart;", "setActiveScanPart$jumio_core_release", "(Lcom/jumio/sdk/scanpart/JumioScanPart;)V", "addonScanPart", "isValid", "setValid", "(Z)V", "isConfigured", "initScanPart", "credentialPart", "scanPartInterface", "Lcom/jumio/sdk/interfaces/JumioScanPartInterface;", "start", "", "start$jumio_core_release", "finish", "cancel", "cancelScanPart", "scanPart", "cancelScanPart$jumio_core_release", "finishScanPart", "finishScanPart$jumio_core_release", "persist", InterfaceC33730j9.f70350a, "persist$jumio_core_release", "restore", "restore$jumio_core_release", "consumeError", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/jumio/sdk/error/JumioError;", "consumeError$jumio_core_release", "(Lcom/jumio/sdk/error/JumioError;)Ljava/lang/Boolean;", "getAddonPart", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nJumioCredential.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JumioCredential.kt\ncom/jumio/sdk/credentials/JumioCredential\n+ 2 Precondition.kt\ncom/jumio/core/util/PreconditionKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,145:1\n15#2,5:146\n15#2,5:152\n1#3:151\n*S KotlinDebug\n*F\n+ 1 JumioCredential.kt\ncom/jumio/sdk/credentials/JumioCredential\n*L\n79#1:146,5\n96#1:152,5\n*E\n"})
public abstract class JumioCredential {

    /* JADX INFO: renamed from: a */
    public final Controller f14675a;

    /* JADX INFO: renamed from: b */
    public final CredentialDataModel f14676b;

    /* JADX INFO: renamed from: c */
    public JumioScanPart f14677c;

    /* JADX INFO: renamed from: d */
    public JumioScanPart f14678d;

    /* JADX INFO: renamed from: e */
    public boolean f14679e;

    public synchronized void cancelScanPart$jumio_core_release(@NotNull JumioScanPart scanPart) {
        Intrinsics.checkNotNullParameter(scanPart, "scanPart");
        this.f14677c = null;
        this.f14678d = null;
        this.f14676b.f14203g = null;
    }

    public synchronized void finishScanPart$jumio_core_release(@NotNull JumioScanPart scanPart) {
        ScanPart<?> scanPart$jumio_core_release;
        Intrinsics.checkNotNullParameter(scanPart, "scanPart");
        JumioScanPart jumioScanPart = this.f14677c;
        if (scanPart != jumioScanPart || jumioScanPart == null || (scanPart$jumio_core_release = jumioScanPart.getScanPart$jumio_core_release()) == null) {
            return;
        }
        scanPart$jumio_core_release.checkForAddon(new Function1() { // from class: aa.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JumioCredential.m14618a(this.f623b, (JumioScanPart) obj);
            }
        });
    }

    @NotNull
    public abstract JumioScanPart initScanPart(@NotNull JumioCredentialPart credentialPart, @NotNull JumioScanPartInterface scanPartInterface) throws IllegalStateException, SDKNotConfiguredException, IllegalArgumentException;

    /* JADX INFO: renamed from: isConfigured */
    public abstract boolean getF14686f();

    public JumioCredential(@NotNull Controller controller, @NotNull CredentialDataModel data) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f14675a = controller;
        this.f14676b = data;
        this.f14679e = true;
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m14618a(JumioCredential jumioCredential, JumioScanPart jumioScanPart) {
        ScanPart<?> scanPart$jumio_core_release;
        ScanPartModel scanPartModel;
        jumioCredential.f14678d = jumioScanPart;
        jumioCredential.f14677c = jumioScanPart;
        jumioCredential.f14676b.f14203g = (jumioScanPart == null || (scanPart$jumio_core_release = jumioScanPart.getScanPart$jumio_core_release()) == null || (scanPartModel = scanPart$jumio_core_release.getScanPartModel()) == null) ? null : scanPartModel.getF14312a();
        return Unit.INSTANCE;
    }

    public void cancel() throws SDKNotConfiguredException {
        if (!this.f14679e) {
            throw new SDKNotConfiguredException("Credential is not active");
        }
        JumioScanPart jumioScanPart = this.f14677c;
        if (jumioScanPart != null) {
            jumioScanPart.cancel();
        }
        this.f14675a.finishCredential$jumio_core_release(this);
        this.f14679e = false;
        ReportingModel reportingModel = (ReportingModel) this.f14675a.getF13603d().get(ReportingModel.class);
        String id2 = this.f14676b.f14197a;
        reportingModel.getClass();
        Intrinsics.checkNotNullParameter(id2, "id");
        C40691l3 c40691l3 = (C40691l3) reportingModel.f14304a.get(id2);
        if (c40691l3 != null) {
            C40696m3 c40696m3 = c40691l3.f90320a;
            if (c40696m3.f90328a != 0) {
                c40696m3.f90329b = (System.currentTimeMillis() - c40696m3.f90328a) + c40696m3.f90329b;
            }
            c40696m3.f90328a = 0L;
        }
        Analytics.INSTANCE.add(MobileEvents.userAction$default("cancel_credential", null, this.f14676b.f14197a, 2, null));
    }

    @Nullable
    public final Boolean consumeError$jumio_core_release(@NotNull JumioError error) {
        ScanPart<?> scanPart$jumio_core_release;
        Intrinsics.checkNotNullParameter(error, "error");
        JumioScanPart jumioScanPart = this.f14677c;
        if (jumioScanPart == null || (scanPart$jumio_core_release = jumioScanPart.getScanPart$jumio_core_release()) == null) {
            return null;
        }
        return Boolean.valueOf(scanPart$jumio_core_release.consumeError(error));
    }

    public void finish() throws SDKNotConfiguredException, IllegalArgumentException {
        if (!this.f14679e) {
            throw new SDKNotConfiguredException("Credential is not active");
        }
        if (!isComplete()) {
            throw new IllegalArgumentException("Workflow is not completed");
        }
        this.f14675a.finishCredential$jumio_core_release(this);
        this.f14679e = false;
        ReportingModel reportingModel = (ReportingModel) this.f14675a.getF13603d().get(ReportingModel.class);
        String id2 = this.f14676b.f14197a;
        reportingModel.getClass();
        Intrinsics.checkNotNullParameter(id2, "id");
        C40691l3 c40691l3 = (C40691l3) reportingModel.f14304a.get(id2);
        if (c40691l3 != null) {
            C40696m3 c40696m3 = c40691l3.f90320a;
            if (c40696m3.f90328a != 0) {
                c40696m3.f90329b = (System.currentTimeMillis() - c40696m3.f90328a) + c40696m3.f90329b;
            }
            c40696m3.f90328a = 0L;
        }
        Analytics.INSTANCE.add(MobileEvents.userAction$default("finish_credential", null, this.f14676b.f14197a, 2, null));
    }

    @Nullable
    /* JADX INFO: renamed from: getActiveScanPart$jumio_core_release, reason: from getter */
    public final JumioScanPart getF14677c() {
        return this.f14677c;
    }

    @Nullable
    /* JADX INFO: renamed from: getAddonPart, reason: from getter */
    public final JumioScanPart getF14678d() {
        return this.f14678d;
    }

    @NotNull
    /* JADX INFO: renamed from: getController$jumio_core_release, reason: from getter */
    public final Controller getF14675a() {
        return this.f14675a;
    }

    @NotNull
    public List<JumioCredentialPart> getCredentialParts() {
        Set setKeySet = this.f14676b.f14201e.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "<get-keys>(...)");
        return CollectionsKt.toList(setKeySet);
    }

    @NotNull
    /* JADX INFO: renamed from: getData$jumio_core_release, reason: from getter */
    public final CredentialDataModel getF14676b() {
        return this.f14676b;
    }

    public final boolean isComplete() {
        return this.f14676b.mo14552a() && this.f14677c == null;
    }

    /* JADX INFO: renamed from: isValid, reason: from getter */
    public final boolean getF14679e() {
        return this.f14679e;
    }

    public final void persist$jumio_core_release(boolean stop) {
        ScanPart<?> scanPart$jumio_core_release;
        JumioScanPart jumioScanPart = this.f14677c;
        if (jumioScanPart == null || (scanPart$jumio_core_release = jumioScanPart.getScanPart$jumio_core_release()) == null) {
            return;
        }
        scanPart$jumio_core_release.persist(stop);
    }

    public final void restore$jumio_core_release() {
        ScanPart<?> scanPart$jumio_core_release;
        JumioScanPart jumioScanPart = this.f14677c;
        if (jumioScanPart == null || (scanPart$jumio_core_release = jumioScanPart.getScanPart$jumio_core_release()) == null) {
            return;
        }
        scanPart$jumio_core_release.restore();
    }

    public final void setActiveScanPart$jumio_core_release(@Nullable JumioScanPart jumioScanPart) {
        this.f14677c = jumioScanPart;
    }

    public final void setValid(boolean z11) {
        this.f14679e = z11;
    }

    public void start$jumio_core_release() {
        ReportingModel reportingModel = (ReportingModel) this.f14675a.getF13603d().get(ReportingModel.class);
        String id2 = this.f14676b.f14197a;
        reportingModel.getClass();
        Intrinsics.checkNotNullParameter(id2, "id");
        reportingModel.f14306c = id2;
        reportingModel.f14307d = null;
        reportingModel.f14308e = null;
        TreeMap treeMap = reportingModel.f14304a;
        Object c40691l3 = treeMap.get(id2);
        if (c40691l3 == null) {
            c40691l3 = new C40691l3(reportingModel);
            treeMap.put(id2, c40691l3);
        }
        ((C40691l3) c40691l3).f90320a.f90328a = System.currentTimeMillis();
        Analytics.INSTANCE.add(MobileEvents.userAction$default("start_credential", null, this.f14676b.f14197a, 2, null));
    }
}
