package com.jumio.sdk.credentials;

import com.jumio.analytics.Analytics;
import com.jumio.analytics.MetaInfo;
import com.jumio.analytics.MobileEvents;
import com.jumio.commons.camera.ImageData;
import com.jumio.core.Controller;
import com.jumio.core.data.ScanMode;
import com.jumio.core.data.document.Document;
import com.jumio.core.models.CredentialDataModel;
import com.jumio.core.models.DocumentModel;
import com.jumio.core.models.DocumentScanPartModel;
import com.jumio.core.models.ScanPartModel;
import com.jumio.core.models.SettingsModel;
import com.jumio.core.scanpart.ScanPart;
import com.jumio.sdk.enums.JumioAcquireMode;
import com.jumio.sdk.enums.JumioAcquireModeKt;
import com.jumio.sdk.enums.JumioCredentialPart;
import com.jumio.sdk.interfaces.JumioScanPartInterface;
import com.jumio.sdk.scanpart.JumioScanPart;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.SortedMap;
import jumio.core.C40522E0;
import jumio.core.C40606V0;
import jumio.core.C40709p1;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\u0011\u001a\u00020\u0012H\u0010¢\u0006\u0002\b\u0013J\u000e\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\fJ\u000e\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\fJ\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\fH\u0002J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001dR\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001e"}, m90084d2 = {"Lcom/jumio/sdk/credentials/JumioDocumentCredential;", "Lcom/jumio/sdk/credentials/JumioCredential;", "controller", "Lcom/jumio/core/Controller;", "credentialDataModel", "Lcom/jumio/core/models/CredentialDocumentDataModel;", "<init>", "(Lcom/jumio/core/Controller;Lcom/jumio/core/models/CredentialDocumentDataModel;)V", "isConfigured", "", "()Z", "selectedAcquireMode", "Lcom/jumio/sdk/enums/JumioAcquireMode;", "availableAcquireModes", "", "getAvailableAcquireModes", "()Ljava/util/List;", "start", "", "start$jumio_core_release", "isSupportedConfiguration", "acquireMode", "setConfiguration", "buildScanData", "initScanPart", "Lcom/jumio/sdk/scanpart/JumioScanPart;", "credentialPart", "Lcom/jumio/sdk/enums/JumioCredentialPart;", "scanPartInterface", "Lcom/jumio/sdk/interfaces/JumioScanPartInterface;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nJumioDocumentCredential.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JumioDocumentCredential.kt\ncom/jumio/sdk/credentials/JumioDocumentCredential\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,142:1\n1557#2:143\n1628#2,3:144\n1#3:147\n*S KotlinDebug\n*F\n+ 1 JumioDocumentCredential.kt\ncom/jumio/sdk/credentials/JumioDocumentCredential\n*L\n36#1:143\n36#1:144,3\n*E\n"})
public final class JumioDocumentCredential extends JumioCredential {

    /* JADX INFO: renamed from: f */
    public JumioAcquireMode f14684f;

    /* JADX INFO: renamed from: g */
    public final List f14685g;

    @Override // com.jumio.sdk.credentials.JumioCredential
    @NotNull
    public synchronized JumioScanPart initScanPart(@NotNull JumioCredentialPart credentialPart, @NotNull JumioScanPartInterface scanPartInterface) {
        JumioScanPart jumioScanPart;
        ScanPart c40606v0;
        try {
            Intrinsics.checkNotNullParameter(credentialPart, "credentialPart");
            Intrinsics.checkNotNullParameter(scanPartInterface, "scanPartInterface");
            ScanPartModel scanPartModel = (ScanPartModel) getF14676b().f14201e.get(credentialPart);
            if (scanPartModel == null) {
                throw new IllegalArgumentException((credentialPart + " not found").toString());
            }
            if (scanPartModel.getF14313b() == ScanMode.FILE) {
                Controller f14675a = getF14675a();
                Intrinsics.checkNotNull(scanPartModel, "null cannot be cast to non-null type com.jumio.core.models.DocumentScanPartModel");
                c40606v0 = new C40709p1(f14675a, this, (DocumentScanPartModel) scanPartModel, scanPartInterface);
            } else {
                c40606v0 = new C40606V0(getF14675a(), this, scanPartModel, scanPartInterface);
            }
            jumioScanPart = new JumioScanPart(c40606v0);
            getF14676b().f14203g = credentialPart;
            setActiveScanPart$jumio_core_release(jumioScanPart);
        } catch (Throwable th2) {
            throw th2;
        }
        return jumioScanPart;
    }

    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[JumioAcquireMode.values().length];
            try {
                iArr[JumioAcquireMode.CAMERA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[JumioAcquireMode.FILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JumioDocumentCredential(@NotNull Controller controller, @NotNull C40522E0 credentialDataModel) {
        super(controller, credentialDataModel);
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(credentialDataModel, "credentialDataModel");
        List<String> docProofAcquireModes = ((SettingsModel) controller.getF13603d().get(SettingsModel.class)).getDocProofAcquireModes();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(docProofAcquireModes, 10));
        Iterator<T> it = docProofAcquireModes.iterator();
        while (it.hasNext()) {
            arrayList.add(JumioAcquireModeKt.docProofOptionToJumioAcquireMode((String) it.next()));
        }
        List list = CollectionsKt.toList(arrayList);
        this.f14685g = list;
        if (list.size() == 1) {
            Object objFirst = CollectionsKt.first((List<? extends Object>) list);
            JumioAcquireMode jumioAcquireMode = JumioAcquireMode.CAMERA;
            if (objFirst == jumioAcquireMode) {
                setConfiguration(jumioAcquireMode);
            }
        }
    }

    @NotNull
    public final List<JumioAcquireMode> getAvailableAcquireModes() {
        return this.f14685g;
    }

    @Override // com.jumio.sdk.credentials.JumioCredential
    /* JADX INFO: renamed from: isConfigured */
    public boolean getF14686f() {
        return this.f14684f != null;
    }

    public final boolean isSupportedConfiguration(@NotNull JumioAcquireMode acquireMode) {
        Intrinsics.checkNotNullParameter(acquireMode, "acquireMode");
        if (getF14679e()) {
            return this.f14685g.contains(acquireMode);
        }
        return false;
    }

    public final void setConfiguration(@NotNull JumioAcquireMode acquireMode) throws IllegalArgumentException {
        Intrinsics.checkNotNullParameter(acquireMode, "acquireMode");
        if (getF14679e()) {
            if (!isSupportedConfiguration(acquireMode)) {
                throw new IllegalArgumentException("The selected JumioAcquireMode is not valid");
            }
            this.f14684f = acquireMode;
            m14619a(acquireMode);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m14619a(JumioAcquireMode jumioAcquireMode) {
        String str;
        DocumentScanPartModel documentScanPartModel;
        String str2;
        String str3;
        CredentialDataModel f14676b = getF14676b();
        Intrinsics.checkNotNull(f14676b, "null cannot be cast to non-null type com.jumio.core.models.CredentialDocumentDataModel");
        C40522E0 c40522e0 = (C40522E0) f14676b;
        ArrayList arrayList = c40522e0.f89953h;
        String str4 = "";
        if (arrayList == null || (str3 = (String) arrayList.get(0)) == null) {
            str = "";
        } else {
            str = str3;
        }
        DocumentModel documentModel = (DocumentModel) getF14675a().getF13603d().get(DocumentModel.class);
        ArrayList arrayList2 = c40522e0.f89954i;
        if (arrayList2 != null && (str2 = (String) arrayList2.get(0)) != null) {
            str4 = str2;
        }
        Document documentM14556a = documentModel.m14556a(str4);
        if (documentM14556a != null) {
            getF14676b().f14201e.clear();
            SortedMap sortedMap = getF14676b().f14201e;
            JumioCredentialPart jumioCredentialPart = JumioCredentialPart.DOCUMENT;
            int i11 = WhenMappings.$EnumSwitchMapping$0[jumioAcquireMode.ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    documentScanPartModel = new DocumentScanPartModel(jumioCredentialPart, ScanMode.FILE, str, documentM14556a, null, 16, null);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                documentScanPartModel = new DocumentScanPartModel(jumioCredentialPart, ScanMode.MANUAL, str, documentM14556a, new ImageData());
            }
            sortedMap.put(jumioCredentialPart, documentScanPartModel);
            MetaInfo metaInfo = new MetaInfo();
            metaInfo.put("country", str);
            metaInfo.put("type", documentM14556a.getF13795a());
            metaInfo.put("additionalData", jumioAcquireMode.toString());
            Analytics.INSTANCE.add(MobileEvents.userAction$default("configuration", null, metaInfo, 2, null));
            return;
        }
        throw new IllegalArgumentException("Document could not be found");
    }

    @Override // com.jumio.sdk.credentials.JumioCredential
    public void start$jumio_core_release() {
        JumioAcquireMode jumioAcquireMode;
        super.start$jumio_core_release();
        if (getF14686f() && (jumioAcquireMode = this.f14684f) != null) {
            m14619a(jumioAcquireMode);
        }
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
