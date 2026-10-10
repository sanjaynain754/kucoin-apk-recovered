package com.jumio.core.models;

import androidx.annotation.CallSuper;
import com.jumio.commons.PersistWith;
import com.jumio.commons.camera.ImageData;
import com.jumio.core.data.ScanMode;
import com.jumio.core.data.scan.DataState;
import com.jumio.core.data.scan.FileDataInterface;
import com.jumio.core.extraction.docfinder.classifier.DocumentClassifier;
import com.jumio.core.model.StaticModel;
import com.jumio.core.models.automation.AutomationModel;
import com.jumio.sdk.enums.JumioCredentialPart;
import com.jumio.sdk.enums.JumioScanStep;
import com.jumio.sdk.retry.JumioRetryReason;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;
import jumio.core.C40535G3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010?\u001a\u00020D2\u0006\u0010E\u001a\u00020%2\u0006\u0010F\u001a\u00020;H\u0016J\u0012\u0010=\u001a\u0004\u0018\u00010;2\u0006\u0010E\u001a\u00020%H\u0016J\b\u0010G\u001a\u00020DH\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0011\u0010$\u001a\u00020%¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u001c\u0010(\u001a\u0004\u0018\u00010)X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R-\u0010.\u001a\u001e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u0002000/j\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u000200`1¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u001c\u00104\u001a\u0004\u0018\u000105X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R$\u0010<\u001a\u00020;2\u0006\u0010:\u001a\u00020;@TX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u0014\u0010A\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010\u0015R\u0014\u0010C\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010\u0015¨\u0006H"}, m90084d2 = {"Lcom/jumio/core/models/ScanPartModel;", "Lcom/jumio/core/model/StaticModel;", "credentialPart", "Lcom/jumio/sdk/enums/JumioCredentialPart;", "mode", "Lcom/jumio/core/data/ScanMode;", "fileData", "Lcom/jumio/core/data/scan/FileDataInterface;", "<init>", "(Lcom/jumio/sdk/enums/JumioCredentialPart;Lcom/jumio/core/data/ScanMode;Lcom/jumio/core/data/scan/FileDataInterface;)V", "getCredentialPart", "()Lcom/jumio/sdk/enums/JumioCredentialPart;", "getMode", "()Lcom/jumio/core/data/ScanMode;", "setMode", "(Lcom/jumio/core/data/ScanMode;)V", "getFileData", "()Lcom/jumio/core/data/scan/FileDataInterface;", "usability", "", "getUsability", "()Z", "setUsability", "(Z)V", "scanStep", "Lcom/jumio/sdk/enums/JumioScanStep;", "getScanStep", "()Lcom/jumio/sdk/enums/JumioScanStep;", "setScanStep", "(Lcom/jumio/sdk/enums/JumioScanStep;)V", "lastRetryReason", "Lcom/jumio/sdk/retry/JumioRetryReason;", "getLastRetryReason", "()Lcom/jumio/sdk/retry/JumioRetryReason;", "setLastRetryReason", "(Lcom/jumio/sdk/retry/JumioRetryReason;)V", "id", "", "getId", "()Ljava/lang/String;", "automationModel", "Lcom/jumio/core/models/automation/AutomationModel;", "getAutomationModel", "()Lcom/jumio/core/models/automation/AutomationModel;", "setAutomationModel", "(Lcom/jumio/core/models/automation/AutomationModel;)V", "data", "Ljava/util/HashMap;", "Ljava/io/Serializable;", "Lkotlin/collections/HashMap;", "getData", "()Ljava/util/HashMap;", "sensorData", "Lcom/jumio/core/sensors/SensorDataResult;", "getSensorData", "()Lcom/jumio/core/sensors/SensorDataResult;", "setSensorData", "(Lcom/jumio/core/sensors/SensorDataResult;)V", "value", "Lcom/jumio/core/data/scan/DataState;", "dataState", "getDataState", "()Lcom/jumio/core/data/scan/DataState;", "setDataState", "(Lcom/jumio/core/data/scan/DataState;)V", "hasData", "getHasData", "isComplete", "", DocumentClassifier.KEY_SIDE, "state", "clear", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@PersistWith("ScanPartModel")
public class ScanPartModel implements StaticModel {

    /* JADX INFO: renamed from: a */
    public final JumioCredentialPart f14312a;

    /* JADX INFO: renamed from: b */
    public ScanMode f14313b;

    /* JADX INFO: renamed from: c */
    public final FileDataInterface f14314c;

    /* JADX INFO: renamed from: d */
    public boolean f14315d;

    /* JADX INFO: renamed from: e */
    public JumioScanStep f14316e;

    /* JADX INFO: renamed from: f */
    public JumioRetryReason f14317f;

    /* JADX INFO: renamed from: g */
    public final String f14318g;

    /* JADX INFO: renamed from: h */
    public AutomationModel f14319h;

    /* JADX INFO: renamed from: i */
    public final HashMap f14320i;

    /* JADX INFO: renamed from: j */
    public C40535G3 f14321j;

    /* JADX INFO: renamed from: k */
    public DataState f14322k;

    public ScanPartModel(@NotNull JumioCredentialPart credentialPart, @NotNull ScanMode mode, @NotNull FileDataInterface fileData) {
        Intrinsics.checkNotNullParameter(credentialPart, "credentialPart");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(fileData, "fileData");
        this.f14312a = credentialPart;
        this.f14313b = mode;
        this.f14314c = fileData;
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.f14318g = string;
        this.f14320i = new HashMap();
        this.f14322k = DataState.TODO;
    }

    @NotNull
    /* JADX INFO: renamed from: getDataState, reason: from getter */
    public DataState getF14322k() {
        return this.f14322k;
    }

    public void setDataState(@NotNull DataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "<set-?>");
        this.f14322k = dataState;
    }

    @Nullable
    /* JADX INFO: renamed from: getAutomationModel, reason: from getter */
    public AutomationModel getF14319h() {
        return this.f14319h;
    }

    @NotNull
    /* JADX INFO: renamed from: getCredentialPart, reason: from getter */
    public final JumioCredentialPart getF14312a() {
        return this.f14312a;
    }

    @NotNull
    public final HashMap<String, Serializable> getData() {
        return this.f14320i;
    }

    @Nullable
    public synchronized DataState getDataState(@NotNull String classifier) {
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        String upperCase = classifier.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        if (!Intrinsics.areEqual(upperCase, this.f14312a.name())) {
            return null;
        }
        return getF14322k();
    }

    @NotNull
    /* JADX INFO: renamed from: getFileData, reason: from getter */
    public FileDataInterface getF14314c() {
        return this.f14314c;
    }

    @NotNull
    /* JADX INFO: renamed from: getId, reason: from getter */
    public final String getF14318g() {
        return this.f14318g;
    }

    @Nullable
    /* JADX INFO: renamed from: getLastRetryReason, reason: from getter */
    public final JumioRetryReason getF14317f() {
        return this.f14317f;
    }

    @NotNull
    /* JADX INFO: renamed from: getMode, reason: from getter */
    public final ScanMode getF14313b() {
        return this.f14313b;
    }

    @Nullable
    /* JADX INFO: renamed from: getScanStep, reason: from getter */
    public final JumioScanStep getF14316e() {
        return this.f14316e;
    }

    @Nullable
    /* JADX INFO: renamed from: getSensorData, reason: from getter */
    public final C40535G3 getF14321j() {
        return this.f14321j;
    }

    /* JADX INFO: renamed from: getUsability, reason: from getter */
    public final boolean getF14315d() {
        return this.f14315d;
    }

    public void setAutomationModel(@Nullable AutomationModel automationModel) {
        this.f14319h = automationModel;
    }

    public synchronized void setDataState(@NotNull String classifier, @NotNull DataState state) {
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        Intrinsics.checkNotNullParameter(state, "state");
        String upperCase = classifier.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        if (Intrinsics.areEqual(upperCase, this.f14312a.name()) && getF14322k().canTransitionTo(state)) {
            setDataState(state);
        }
    }

    public final void setLastRetryReason(@Nullable JumioRetryReason jumioRetryReason) {
        this.f14317f = jumioRetryReason;
    }

    public final void setMode(@NotNull ScanMode scanMode) {
        Intrinsics.checkNotNullParameter(scanMode, "<set-?>");
        this.f14313b = scanMode;
    }

    public final void setScanStep(@Nullable JumioScanStep jumioScanStep) {
        this.f14316e = jumioScanStep;
    }

    public final void setSensorData(@Nullable C40535G3 c40535g3) {
        this.f14321j = c40535g3;
    }

    public final void setUsability(boolean z11) {
        this.f14315d = z11;
    }

    @CallSuper
    public void clear() {
        getF14314c().clear();
        setDataState(DataState.TODO);
        setAutomationModel(null);
    }

    public boolean getHasData() {
        if (!getF14314c().getHasData() && !getF14322k().isAtLeast(DataState.SAVING)) {
            return false;
        }
        return true;
    }

    public boolean isComplete() {
        if (getF14314c().getHasData() && getF14319h() != null) {
            return true;
        }
        return false;
    }

    public /* synthetic */ ScanPartModel(JumioCredentialPart jumioCredentialPart, ScanMode scanMode, FileDataInterface fileDataInterface, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(jumioCredentialPart, scanMode, (i11 & 4) != 0 ? new ImageData() : fileDataInterface);
    }
}
