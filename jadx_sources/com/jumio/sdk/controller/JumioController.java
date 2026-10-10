package com.jumio.sdk.controller;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.messaging.Constants;
import com.jumio.core.Controller;
import com.jumio.core.models.AuthorizationModel;
import com.jumio.sdk.consent.JumioConsentItem;
import com.jumio.sdk.credentials.JumioCredential;
import com.jumio.sdk.credentials.JumioCredentialInfo;
import com.jumio.sdk.error.JumioError;
import com.jumio.sdk.exceptions.SDKNotConfiguredException;
import com.jumio.sdk.interfaces.JumioControllerInterface;
import com.jumio.sdk.interfaces.JumioScanPartInterface;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u0000 +2\u00020\u0001:\u0001+B+\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bB-\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\n\u0010\u0010J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u0017\u001a\u00020\u0016J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\"J\u0006\u0010#\u001a\u00020\u0016J\u0006\u0010$\u001a\u00020\u0016J\u0016\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0019J\f\u0010)\u001a\b\u0012\u0004\u0012\u00020'0*R\u0014\u0010\u0011\u001a\u00020\u0012X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0018\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001a¨\u0006,"}, m90084d2 = {"Lcom/jumio/sdk/controller/JumioController;", "", "context", "Landroid/content/Context;", "authorizationModel", "Lcom/jumio/core/models/AuthorizationModel;", "controllerInterface", "Lcom/jumio/sdk/interfaces/JumioControllerInterface;", "customThemeId", "", "<init>", "(Landroid/content/Context;Lcom/jumio/core/models/AuthorizationModel;Lcom/jumio/sdk/interfaces/JumioControllerInterface;I)V", "data", "Landroid/os/Bundle;", "scanPartInterface", "Lcom/jumio/sdk/interfaces/JumioScanPartInterface;", "(Landroid/content/Context;Landroid/os/Bundle;Lcom/jumio/sdk/interfaces/JumioControllerInterface;Lcom/jumio/sdk/interfaces/JumioScanPartInterface;)V", "controller", "Lcom/jumio/core/Controller;", "getController$jumio_core_release", "()Lcom/jumio/core/Controller;", "persist", "", InterfaceC33730j9.f70350a, "isComplete", "", "()Z", "isConsentPreApproved", "start", "Lcom/jumio/sdk/credentials/JumioCredential;", "credentialInfo", "Lcom/jumio/sdk/credentials/JumioCredentialInfo;", "retry", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/jumio/sdk/error/JumioError;", "cancel", "finish", "userConsented", "consentItem", "Lcom/jumio/sdk/consent/JumioConsentItem;", "userConsent", "getUnconsentedItems", "", "Companion", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nJumioController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JumioController.kt\ncom/jumio/sdk/controller/JumioController\n+ 2 Precondition.kt\ncom/jumio/core/util/PreconditionKt\n*L\n1#1,160:1\n15#2,5:161\n15#2,5:166\n15#2,5:171\n15#2,5:176\n15#2,5:181\n15#2,5:186\n*S KotlinDebug\n*F\n+ 1 JumioController.kt\ncom/jumio/sdk/controller/JumioController\n*L\n89#1:161,5\n103#1:166,5\n117#1:171,5\n132#1:176,5\n148#1:181,5\n155#1:186,5\n*E\n"})
public final class JumioController {

    /* JADX INFO: renamed from: a */
    public final Controller f14674a;

    public /* synthetic */ JumioController(Context context, AuthorizationModel authorizationModel, JumioControllerInterface jumioControllerInterface, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, authorizationModel, jumioControllerInterface, (i12 & 8) != 0 ? 0 : i11);
    }

    public final synchronized void cancel() throws SDKNotConfiguredException, IllegalArgumentException {
        if (!this.f14674a.getF13613n()) {
            throw new SDKNotConfiguredException("This controller can not be used anymore");
        }
        this.f14674a.cancel();
    }

    public final synchronized void finish() throws SDKNotConfiguredException, IllegalArgumentException {
        if (!this.f14674a.getF13613n()) {
            throw new SDKNotConfiguredException("This controller can not be used anymore");
        }
        this.f14674a.finish();
    }

    public JumioController(@NotNull Context context, @NotNull AuthorizationModel authorizationModel, @NotNull JumioControllerInterface controllerInterface, int i11) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(authorizationModel, "authorizationModel");
        Intrinsics.checkNotNullParameter(controllerInterface, "controllerInterface");
        this.f14674a = new Controller(context, authorizationModel, controllerInterface, i11);
    }

    @NotNull
    /* JADX INFO: renamed from: getController$jumio_core_release, reason: from getter */
    public final Controller getF14674a() {
        return this.f14674a;
    }

    @NotNull
    public final List<JumioConsentItem> getUnconsentedItems() throws SDKNotConfiguredException {
        if (this.f14674a.getF13613n()) {
            return this.f14674a.getUnconsentedItems();
        }
        throw new SDKNotConfiguredException("This controller can not be used anymore");
    }

    public final boolean isComplete() {
        return this.f14674a.isComplete();
    }

    public final boolean isConsentPreApproved() {
        return this.f14674a.isConsentPreApproved();
    }

    public final void persist(@NotNull Bundle data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (this.f14674a.getF13613n()) {
            this.f14674a.saveState(data);
        }
    }

    public final void retry(@NotNull JumioError error) throws SDKNotConfiguredException {
        Intrinsics.checkNotNullParameter(error, "error");
        if (!this.f14674a.getF13613n()) {
            throw new SDKNotConfiguredException("This controller can not be used anymore");
        }
        this.f14674a.retry(error);
    }

    @NotNull
    public final JumioCredential start(@NotNull JumioCredentialInfo credentialInfo) throws SDKNotConfiguredException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(credentialInfo, "credentialInfo");
        if (this.f14674a.getF13613n()) {
            return this.f14674a.startCredential(credentialInfo);
        }
        throw new SDKNotConfiguredException("This controller can not be used anymore");
    }

    public final void stop() {
        if (this.f14674a.getF13613n()) {
            this.f14674a.persistAllData(true);
        }
    }

    public final void userConsented(@NotNull JumioConsentItem consentItem, boolean userConsent) throws SDKNotConfiguredException {
        Intrinsics.checkNotNullParameter(consentItem, "consentItem");
        if (!this.f14674a.getF13613n()) {
            throw new SDKNotConfiguredException("This controller can not be used anymore");
        }
        this.f14674a.userConsented(consentItem, userConsent);
    }

    public /* synthetic */ JumioController(Context context, Bundle bundle, JumioControllerInterface jumioControllerInterface, JumioScanPartInterface jumioScanPartInterface, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, bundle, jumioControllerInterface, (i11 & 8) != 0 ? null : jumioScanPartInterface);
    }

    public JumioController(@NotNull Context context, @NotNull Bundle data, @NotNull JumioControllerInterface controllerInterface, @Nullable JumioScanPartInterface jumioScanPartInterface) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(controllerInterface, "controllerInterface");
        this.f14674a = new Controller(context, data, controllerInterface, jumioScanPartInterface);
    }
}
