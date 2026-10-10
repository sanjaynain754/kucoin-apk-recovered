package com.jumio.sdk.credentials;

import com.jumio.core.Controller;
import com.jumio.core.data.ScanMode;
import com.jumio.core.models.AuthenticationScanPartModel;
import com.jumio.core.models.CredentialDataModel;
import com.jumio.core.models.FaceScanPartModel;
import com.jumio.core.models.LivenessScanPartModel;
import com.jumio.core.plugins.ScanPartPlugin;
import com.jumio.core.scanpart.FaceScanPart;
import com.jumio.core.scanpart.ScanPart;
import com.jumio.sdk.enums.JumioCredentialPart;
import com.jumio.sdk.interfaces.JumioScanPartInterface;
import com.jumio.sdk.scanpart.JumioScanPart;
import java.util.ArrayList;
import java.util.Iterator;
import jumio.core.C40512C0;
import jumio.core.C40527F0;
import jumio.core.EnumC40517D0;
import jumio.core.EnumC40613W2;
import jumio.core.EnumC40680j2;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\tH\u0010¢\u0006\u0002\b\nJ\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J \u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u00152\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013J!\u0010\u001a\u001a\u00020\f2\u0012\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001d0\u001c\"\u00020\u001dH\u0002¢\u0006\u0002\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\r¨\u0006\u001f"}, m90084d2 = {"Lcom/jumio/sdk/credentials/JumioFaceCredential;", "Lcom/jumio/sdk/credentials/JumioCredential;", "controller", "Lcom/jumio/core/Controller;", "credentialDataModel", "Lcom/jumio/core/models/CredentialFaceDataModel;", "<init>", "(Lcom/jumio/core/Controller;Lcom/jumio/core/models/CredentialFaceDataModel;)V", "start", "", "start$jumio_core_release", "isConfigured", "", "()Z", "initScanPart", "Lcom/jumio/sdk/scanpart/JumioScanPart;", "credentialPart", "Lcom/jumio/sdk/enums/JumioCredentialPart;", "scanPartInterface", "Lcom/jumio/sdk/interfaces/JumioScanPartInterface;", "getScanPart", "Lcom/jumio/core/scanpart/ScanPart;", "Lcom/jumio/core/models/ScanPartModel;", "isJumioLivenessSupported", "livenessPlugin", "Lcom/jumio/core/plugins/ScanPartPlugin;", "hasLivenessType", "livenessTypes", "", "Lcom/jumio/core/enums/LivenessType;", "([Lcom/jumio/core/enums/LivenessType;)Z", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nJumioFaceCredential.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JumioFaceCredential.kt\ncom/jumio/sdk/credentials/JumioFaceCredential\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,115:1\n1#2:116\n*E\n"})
public final class JumioFaceCredential extends JumioCredential {

    /* JADX INFO: renamed from: f */
    public final boolean f14686f;

    /* JADX WARN: Code duplicated, block: B:33:0x00e2 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:3:0x0001, B:5:0x0017, B:7:0x003c, B:9:0x0046, B:11:0x0054, B:13:0x005e, B:20:0x0073, B:21:0x0087, B:23:0x008d, B:28:0x009e, B:29:0x00ac, B:31:0x00ba, B:32:0x00c8, B:34:0x00f1, B:16:0x0064, B:18:0x006e, B:19:0x0071, B:33:0x00e2, B:37:0x00ff, B:38:0x0119), top: B:41:0x0001 }] */
    @Override // com.jumio.sdk.credentials.JumioCredential
    @NotNull
    public synchronized JumioScanPart initScanPart(@NotNull JumioCredentialPart credentialPart, @NotNull JumioScanPartInterface scanPartInterface) throws IllegalArgumentException {
        JumioScanPart jumioScanPart;
        ScanPart<?> faceScanPart;
        ScanMode scanMode;
        Object next;
        try {
            Intrinsics.checkNotNullParameter(credentialPart, "credentialPart");
            Intrinsics.checkNotNullParameter(scanPartInterface, "scanPartInterface");
            if (!getF14676b().f14201e.containsKey(credentialPart)) {
                throw new IllegalArgumentException((credentialPart + " not found").toString());
            }
            ScanPartPlugin scanPartPlugin = (ScanPartPlugin) getF14675a().getF13605f().getPlugin(EnumC40613W2.JUMIO_LIVENESS);
            Object obj = getF14676b().f14201e.get(credentialPart);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.jumio.core.models.FaceScanPartModel");
            FaceScanPartModel faceScanPartModel = (FaceScanPartModel) obj;
            if (scanPartPlugin == null || !scanPartPlugin.isUsable(getF14675a())) {
                faceScanPartModel.setMode(ScanMode.FACE_MANUAL);
                faceScanPart = new FaceScanPart(getF14675a(), this, faceScanPartModel, scanPartInterface);
            } else {
                EnumC40680j2 enumC40680j2 = EnumC40680j2.JUMIO_LIVENESS;
                EnumC40680j2 enumC40680j3 = EnumC40680j2.JUMIO_PREMIUM;
                if (m14620a(enumC40680j2, enumC40680j3)) {
                    if (m14620a(enumC40680j3)) {
                        scanMode = ScanMode.JUMIO_PREMIUM;
                    } else {
                        scanMode = m14620a(enumC40680j2) ? ScanMode.JUMIO_LIVENESS : ScanMode.JUMIO_LIVENESS;
                    }
                    boolean zM14620a = m14620a(EnumC40680j2.JUMIO_STANDARD);
                    Iterator it = getF14676b().f14199c.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (((C40512C0) next).f89930a != EnumC40517D0.AUTHENTICATION);
                    if (next != null) {
                        getF14676b().f14201e.put(credentialPart, new AuthenticationScanPartModel(scanMode, zM14620a));
                    }
                    if (!(getF14676b().f14201e.get(credentialPart) instanceof LivenessScanPartModel)) {
                        getF14676b().f14201e.put(credentialPart, new LivenessScanPartModel(scanMode, zM14620a));
                    }
                    Controller f14675a = getF14675a();
                    Object obj2 = getF14676b().f14201e.get(credentialPart);
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.jumio.core.models.LivenessScanPartModel");
                    faceScanPart = scanPartPlugin.getScanPart(f14675a, this, (LivenessScanPartModel) obj2, scanPartInterface);
                } else {
                    faceScanPartModel.setMode(ScanMode.FACE_MANUAL);
                    faceScanPart = new FaceScanPart(getF14675a(), this, faceScanPartModel, scanPartInterface);
                }
            }
            jumioScanPart = new JumioScanPart(faceScanPart);
            getF14676b().f14203g = credentialPart;
            setActiveScanPart$jumio_core_release(jumioScanPart);
        } catch (Throwable th2) {
            throw th2;
        }
        return jumioScanPart;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JumioFaceCredential(@NotNull Controller controller, @NotNull C40527F0 credentialDataModel) {
        super(controller, credentialDataModel);
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(credentialDataModel, "credentialDataModel");
        this.f14686f = true;
    }

    @Override // com.jumio.sdk.credentials.JumioCredential
    /* JADX INFO: renamed from: isConfigured, reason: from getter */
    public boolean getF14686f() {
        return this.f14686f;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m14620a(EnumC40680j2... enumC40680j2Arr) {
        CredentialDataModel f14676b = getF14676b();
        Intrinsics.checkNotNull(f14676b, "null cannot be cast to non-null type com.jumio.core.models.CredentialFaceDataModel");
        C40527F0 c40527f0 = (C40527F0) f14676b;
        ArrayList arrayList = c40527f0.f89959h;
        if (arrayList == null || arrayList.isEmpty()) {
            return true;
        }
        for (EnumC40680j2 enumC40680j2 : enumC40680j2Arr) {
            if (c40527f0.f89959h.contains(enumC40680j2)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.jumio.sdk.credentials.JumioCredential
    public void start$jumio_core_release() {
        super.start$jumio_core_release();
        getF14676b().f14201e.put(JumioCredentialPart.FACE, new FaceScanPartModel(ScanMode.FACE_MANUAL));
    }

    @NotNull
    public final synchronized JumioScanPart initScanPart(@NotNull JumioScanPartInterface scanPartInterface) {
        Object objFirstKey;
        Intrinsics.checkNotNullParameter(scanPartInterface, "scanPartInterface");
        objFirstKey = getF14676b().f14201e.firstKey();
        Intrinsics.checkNotNullExpressionValue(objFirstKey, "firstKey(...)");
        return initScanPart((JumioCredentialPart) objFirstKey, scanPartInterface);
    }
}
