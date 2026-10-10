package com.jumio.sdk.credentials;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.jumio.analytics.Analytics;
import com.jumio.analytics.MetaInfo;
import com.jumio.analytics.MobileEvents;
import com.jumio.core.Controller;
import com.jumio.core.data.ScanMode;
import com.jumio.core.data.country.Country;
import com.jumio.core.data.digitaldocument.DigitalDocumentPart;
import com.jumio.core.data.digitaldocument.DigitalDocumentType;
import com.jumio.core.data.document.DocumentPart;
import com.jumio.core.models.CountryDocumentModel;
import com.jumio.core.models.CredentialDataModel;
import com.jumio.core.models.DigitalIdScanPartModel;
import com.jumio.core.models.DigitalSelectionModel;
import com.jumio.core.models.LegalStatementModel;
import com.jumio.core.models.PhysicalIdScanPartModel;
import com.jumio.core.models.PhysicalSelectionModel;
import com.jumio.core.models.ReusableIdLookupResult;
import com.jumio.core.models.ScanPartModel;
import com.jumio.core.models.SelectionModel;
import com.jumio.core.models.SettingsModel;
import com.jumio.core.persistence.DataManager;
import com.jumio.core.plugins.ExtractionPlugin;
import com.jumio.core.plugins.ScanPartPlugin;
import com.jumio.sdk.document.JumioDigitalDocument;
import com.jumio.sdk.document.JumioDocument;
import com.jumio.sdk.document.JumioDocumentType;
import com.jumio.sdk.document.JumioLookupResult;
import com.jumio.sdk.document.JumioPhysicalDocument;
import com.jumio.sdk.enums.JumioCredentialPart;
import com.jumio.sdk.enums.JumioScanStep;
import com.jumio.sdk.exceptions.SDKNotConfiguredException;
import com.jumio.sdk.interfaces.JumioScanPartInterface;
import com.jumio.sdk.scanpart.JumioScanPart;
import com.kubi.kyc.KycKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jumio.core.C40532G0;
import jumio.core.C40573O1;
import jumio.core.C40593S2;
import jumio.core.C40685k2;
import jumio.core.C40709p1;
import jumio.core.C40758z0;
import jumio.core.EnumC40613W2;
import jumio.core.InterfaceC40502A0;
import jumio.core.InterfaceC40578P1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Pair;
import p852kotlin.ReplaceWith;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B-\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010.\u001a\u00020/H\u0010¢\u0006\u0002\b0J\b\u00101\u001a\u00020/H\u0016J\b\u00102\u001a\u00020/H\u0016J\b\u00103\u001a\u00020/H\u0002J\u0014\u00104\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00142\u0006\u00105\u001a\u00020\u001aJ\u0014\u00106\u001a\b\u0012\u0004\u0012\u0002070\u00142\u0006\u00105\u001a\u00020\u001aJ\u0016\u00108\u001a\u00020\u00112\u0006\u00109\u001a\u00020\u001a2\u0006\u0010:\u001a\u00020;J\u0016\u0010<\u001a\u00020/2\u0006\u00109\u001a\u00020\u001a2\u0006\u0010:\u001a\u00020;J\u0018\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020\u00152\u0006\u0010@\u001a\u00020AH\u0016J\u0015\u0010B\u001a\u00020/2\u0006\u0010C\u001a\u00020>H\u0010¢\u0006\u0002\bDJ\u0015\u0010E\u001a\u00020/2\u0006\u0010C\u001a\u00020>H\u0010¢\u0006\u0002\bFJ\u0018\u0010G\u001a\u00020>2\u0006\u0010?\u001a\u00020\u00152\u0006\u0010@\u001a\u00020AH\u0002J(\u0010H\u001a\u00020>2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010I\u001a\u00020\u00002\u0006\u0010J\u001a\u00020K2\u0006\u0010@\u001a\u00020AH\u0002J\b\u0010L\u001a\u00020/H\u0002J\u0016\u0010M\u001a\u00020/2\u0006\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020\u0011R\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R,\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00140\u00198FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001a0\u00148F¢\u0006\u0006\u001a\u0004\b!\u0010\u0017R\u0013\u0010\"\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0013\u0010%\u001a\u0004\u0018\u00010&8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010)\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b*\u0010\u0012R\u0016\u0010+\u001a\u0004\u0018\u00010\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006Q"}, m90084d2 = {"Lcom/jumio/sdk/credentials/JumioIDCredential;", "Lcom/jumio/sdk/credentials/JumioCredential;", "controller", "Lcom/jumio/core/Controller;", "credentialDataModel", "Lcom/jumio/core/models/CredentialIDDataModel;", "countrySelection", "Lcom/jumio/core/credentials/CountrySelectionInterface;", "scanPartConfigurator", "Lcom/jumio/core/scanpart/IdScanPartConfiguratorInterface;", "<init>", "(Lcom/jumio/core/Controller;Lcom/jumio/core/models/CredentialIDDataModel;Lcom/jumio/core/credentials/CountrySelectionInterface;Lcom/jumio/core/scanpart/IdScanPartConfiguratorInterface;)V", "getCountrySelection$jumio_core_release", "()Lcom/jumio/core/credentials/CountrySelectionInterface;", "getScanPartConfigurator$jumio_core_release", "()Lcom/jumio/core/scanpart/IdScanPartConfiguratorInterface;", "isConfigured", "", "()Z", "credentialParts", "", "Lcom/jumio/sdk/enums/JumioCredentialPart;", "getCredentialParts", "()Ljava/util/List;", "countries", "", "", "Lcom/jumio/sdk/document/JumioPhysicalDocument;", "getCountries$annotations", "()V", "getCountries", "()Ljava/util/Map;", "supportedCountries", "getSupportedCountries", "suggestedCountry", "getSuggestedCountry", "()Ljava/lang/String;", "lookupResult", "Lcom/jumio/sdk/document/JumioLookupResult;", "getLookupResult", "()Lcom/jumio/sdk/document/JumioLookupResult;", "brandingEnabled", "getBrandingEnabled", "credentialIdDataModel", "getCredentialIdDataModel", "()Lcom/jumio/core/models/CredentialIDDataModel;", "start", "", "start$jumio_core_release", "cancel", "finish", "cleanUpPreselection", "getPhysicalDocumentsForCountry", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "getDigitalDocumentsForCountry", "Lcom/jumio/sdk/document/JumioDigitalDocument;", "isSupportedConfiguration", "country", "document", "Lcom/jumio/sdk/document/JumioDocument;", "setConfiguration", "initScanPart", "Lcom/jumio/sdk/scanpart/JumioScanPart;", "credentialPart", "scanPartInterface", "Lcom/jumio/sdk/interfaces/JumioScanPartInterface;", "cancelScanPart", "scanPart", "cancelScanPart$jumio_core_release", "finishScanPart", "finishScanPart$jumio_core_release", "createScanPart", "createDigitalIdScanPart", "idCredential", "scanPartModel", "Lcom/jumio/core/models/DigitalIdScanPartModel;", "buildScanData", "userConsented", "legalStatement", "Lcom/jumio/sdk/document/JumioLookupResult$JumioLegalStatement;", "userConsent", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nJumioIDCredential.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JumioIDCredential.kt\ncom/jumio/sdk/credentials/JumioIDCredential\n+ 2 Precondition.kt\ncom/jumio/core/util/PreconditionKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,298:1\n15#2,5:299\n15#2,5:304\n1#3:309\n1557#4:310\n1628#4,3:311\n*S KotlinDebug\n*F\n+ 1 JumioIDCredential.kt\ncom/jumio/sdk/credentials/JumioIDCredential\n*L\n192#1:299,5\n193#1:304,5\n238#1:310\n238#1:311,3\n*E\n"})
public final class JumioIDCredential extends JumioCredential {

    /* JADX INFO: renamed from: f */
    public final InterfaceC40502A0 f14687f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC40578P1 f14688g;

    /* JADX WARN: Code duplicated, block: B:11:0x0048  */
    public /* synthetic */ JumioIDCredential(Controller controller, C40532G0 c40532g0, InterfaceC40502A0 interfaceC40502A0, InterfaceC40578P1 interfaceC40578P1, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z11;
        if ((i11 & 4) != 0) {
            CountryDocumentModel countryDocumentModel = (CountryDocumentModel) controller.getF13603d().get(CountryDocumentModel.class);
            String countryForIp = ((SettingsModel) controller.getF13603d().get(SettingsModel.class)).getCountryForIp();
            ExtractionPlugin extractionPlugin = (ExtractionPlugin) controller.getF13605f().getPlugin(EnumC40613W2.DOCFINDER);
            if (extractionPlugin != null) {
                z11 = extractionPlugin.isUsable(controller) && ((SettingsModel) controller.getF13603d().get(SettingsModel.class)).getSkipDocTypeSelection();
            }
            interfaceC40502A0 = new C40758z0(countryDocumentModel, countryForIp, c40532g0, z11);
        }
        this(controller, c40532g0, interfaceC40502A0, (i11 & 8) != 0 ? new C40573O1(controller, interfaceC40502A0, c40532g0) : interfaceC40578P1);
    }

    @Override // com.jumio.sdk.credentials.JumioCredential
    public synchronized void cancelScanPart$jumio_core_release(@NotNull JumioScanPart scanPart) {
        C40685k2 c40685k2;
        C40685k2 c40685k3;
        try {
            Intrinsics.checkNotNullParameter(scanPart, "scanPart");
            if (Intrinsics.areEqual(getF14677c(), scanPart) && scanPart.getScanPart$jumio_core_release().getScanPartModel().getF14312a() != JumioCredentialPart.NFC) {
                if (scanPart.getScanPart$jumio_core_release().getScanPartModel().getF14316e() == JumioScanStep.CAN_FINISH) {
                    C40532G0 c40532g0M14622b = m14622b();
                    if (c40532g0M14622b != null && (c40685k3 = c40532g0M14622b.f89971j) != null) {
                        c40685k3.m89259a(getF14675a(), true, true);
                    }
                } else {
                    C40532G0 c40532g0M14622b2 = m14622b();
                    if (c40532g0M14622b2 != null && (c40685k2 = c40532g0M14622b2.f89971j) != null) {
                        Controller controller = getF14675a();
                        Intrinsics.checkNotNullParameter(controller, "controller");
                        DataManager f13603d = controller.getF13603d();
                        JumioDocumentType jumioDocumentType = ((ReusableIdLookupResult) f13603d.get(ReusableIdLookupResult.class)).f14311a;
                        if (jumioDocumentType != null) {
                            c40685k2.f90312a = new JumioLookupResult(jumioDocumentType, ((LegalStatementModel) f13603d.get(LegalStatementModel.class)).f14260a);
                        }
                    }
                }
            }
            super.cancelScanPart$jumio_core_release(scanPart);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.jumio.sdk.credentials.JumioCredential
    public synchronized void finishScanPart$jumio_core_release(@NotNull JumioScanPart scanPart) {
        C40532G0 c40532g0M14622b;
        C40685k2 c40685k2;
        try {
            Intrinsics.checkNotNullParameter(scanPart, "scanPart");
            if (Intrinsics.areEqual(getF14677c(), scanPart) && scanPart.getScanPart$jumio_core_release().getScanPartModel().getF14312a() != JumioCredentialPart.NFC && scanPart.getScanPart$jumio_core_release().getScanPartModel().getF14316e() == JumioScanStep.CAN_FINISH && (c40532g0M14622b = m14622b()) != null && (c40685k2 = c40532g0M14622b.f89971j) != null) {
                c40685k2.m89259a(getF14675a(), true, true);
            }
            super.finishScanPart$jumio_core_release(scanPart);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.jumio.sdk.credentials.JumioCredential
    @NotNull
    public synchronized JumioScanPart initScanPart(@NotNull JumioCredentialPart credentialPart, @NotNull JumioScanPartInterface scanPartInterface) {
        JumioScanPart jumioScanPart;
        C40685k2 c40685k2;
        try {
            Intrinsics.checkNotNullParameter(credentialPart, "credentialPart");
            Intrinsics.checkNotNullParameter(scanPartInterface, "scanPartInterface");
            if (!getF14679e()) {
                throw new SDKNotConfiguredException("Credential is not active");
            }
            if (!getF14686f()) {
                throw new SDKNotConfiguredException("Credential is not configured");
            }
            if (!getCredentialParts().contains(credentialPart)) {
                throw new IllegalArgumentException((credentialPart + " not found").toString());
            }
            if (getF14677c() != null) {
                throw new IllegalStateException("Please finish the active scan part first");
            }
            JumioLookupResult lookupResult = getLookupResult();
            if ((lookupResult != null ? lookupResult.getDocumentType() : null) != null) {
                LegalStatementModel legalStatementModel = (LegalStatementModel) getF14675a().getF13603d().get(LegalStatementModel.class);
                if (legalStatementModel.f14261b == null || legalStatementModel.f14262c == null) {
                    throw new IllegalStateException("Need to consent first");
                }
            }
            getF14676b().f14203g = credentialPart;
            C40532G0 c40532g0M14622b = m14622b();
            if (c40532g0M14622b != null && (c40685k2 = c40532g0M14622b.f89971j) != null) {
                c40685k2.m89259a(getF14675a(), true, false);
            }
            Collection collectionValues = getF14676b().f14201e.values();
            Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
            ScanPartModel scanPartModel = (ScanPartModel) CollectionsKt.firstOrNull(collectionValues);
            if (scanPartModel instanceof PhysicalIdScanPartModel) {
                Controller f14675a = getF14675a();
                Collection<ScanPartModel> collectionValues2 = getF14676b().f14201e.values();
                Intrinsics.checkNotNullExpressionValue(collectionValues2, "<get-values>(...)");
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collectionValues2, 10));
                for (ScanPartModel scanPartModel2 : collectionValues2) {
                    Intrinsics.checkNotNull(scanPartModel2, "null cannot be cast to non-null type com.jumio.core.models.PhysicalIdScanPartModel");
                    arrayList.add((PhysicalIdScanPartModel) scanPartModel2);
                }
                jumioScanPart = new JumioScanPart(new C40593S2(f14675a, this, arrayList, scanPartInterface));
            } else {
                if (!(scanPartModel instanceof DigitalIdScanPartModel)) {
                    throw new SDKNotConfiguredException("Country/Document selection not found");
                }
                Collection collectionValues3 = getF14676b().f14201e.values();
                Intrinsics.checkNotNullExpressionValue(collectionValues3, "<get-values>(...)");
                Object objFirstOrNull = CollectionsKt.firstOrNull(collectionValues3);
                Intrinsics.checkNotNull(objFirstOrNull, "null cannot be cast to non-null type com.jumio.core.models.DigitalIdScanPartModel");
                if (((DigitalIdScanPartModel) objFirstOrNull).getF14313b() == ScanMode.FILE) {
                    Controller f14675a2 = getF14675a();
                    Object obj = getF14676b().f14201e.get(credentialPart);
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.jumio.core.models.DigitalIdScanPartModel");
                    jumioScanPart = new JumioScanPart(new C40709p1(f14675a2, this, (DigitalIdScanPartModel) obj, scanPartInterface));
                } else {
                    Controller f14675a3 = getF14675a();
                    Object obj2 = getF14676b().f14201e.get(credentialPart);
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.jumio.core.models.DigitalIdScanPartModel");
                    DigitalIdScanPartModel digitalIdScanPartModel = (DigitalIdScanPartModel) obj2;
                    ScanPartPlugin scanPartPlugin = (ScanPartPlugin) f14675a3.getF13605f().getPlugin(EnumC40613W2.DIGITAL_IDENTITY);
                    if (scanPartPlugin == null) {
                        throw new SDKNotConfiguredException("'jumio-digital-identity' module is required to handle digital documents!");
                    }
                    jumioScanPart = new JumioScanPart(scanPartPlugin.getScanPart(f14675a3, this, digitalIdScanPartModel, scanPartInterface));
                }
            }
            setActiveScanPart$jumio_core_release(jumioScanPart);
        } catch (Throwable th2) {
            throw th2;
        }
        return jumioScanPart;
    }

    /* JADX INFO: renamed from: a */
    public final void m14621a() {
        LinkedHashMap linkedHashMap;
        C40573O1 c40573o1 = (C40573O1) this.f14688g;
        SelectionModel selectionModelM89278b = ((C40758z0) c40573o1.f90064b).m89278b();
        if (selectionModelM89278b != null) {
            c40573o1.f90065c.f14201e.clear();
            if (selectionModelM89278b instanceof PhysicalSelectionModel) {
                PhysicalSelectionModel physicalSelectionModel = (PhysicalSelectionModel) selectionModelM89278b;
                List<DocumentPart> parts = physicalSelectionModel.getF14303c().getParts();
                linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(parts, 10)), 16));
                for (DocumentPart documentPart : parts) {
                    Pair pairM90091to = TuplesKt.m90091to(documentPart.getF13807a(), c40573o1.m89205a(documentPart, physicalSelectionModel));
                    linkedHashMap.put(pairM90091to.getFirst(), pairM90091to.getSecond());
                }
            } else {
                if (!(selectionModelM89278b instanceof DigitalSelectionModel)) {
                    throw new NoWhenBranchMatchedException();
                }
                DigitalSelectionModel digitalSelectionModel = (DigitalSelectionModel) selectionModelM89278b;
                List<DigitalDocumentPart> parts2 = digitalSelectionModel.getF14214b().getParts();
                linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(parts2, 10)), 16));
                Iterator<T> it = parts2.iterator();
                while (it.hasNext()) {
                    Pair pairM90091to2 = TuplesKt.m90091to(JumioCredentialPart.DIGITAL, new DigitalIdScanPartModel(((DigitalDocumentPart) it.next()).getF13773b(), digitalSelectionModel));
                    linkedHashMap.put(pairM90091to2.getFirst(), pairM90091to2.getSecond());
                }
            }
            c40573o1.f90065c.f14201e.putAll(linkedHashMap);
        }
        Analytics.INSTANCE.add(MobileEvents.userAction$default("configuration", null, ((C40758z0) this.f14687f).m89278b(), 2, null));
    }

    @NotNull
    public final Map<String, List<JumioPhysicalDocument>> getCountries() {
        return ((C40758z0) this.f14687f).m89274a();
    }

    @NotNull
    /* JADX INFO: renamed from: getCountrySelection$jumio_core_release, reason: from getter */
    public final InterfaceC40502A0 getF14687f() {
        return this.f14687f;
    }

    @NotNull
    public final List<JumioDigitalDocument> getDigitalDocumentsForCountry(@NotNull String countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        C40758z0 c40758z0 = (C40758z0) this.f14687f;
        c40758z0.getClass();
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Country country = c40758z0.m89272a(countryCode);
        if (country == null) {
            return CollectionsKt.emptyList();
        }
        CountryDocumentModel countryDocumentModel = c40758z0.f90496a;
        countryDocumentModel.getClass();
        Intrinsics.checkNotNullParameter(country, "country");
        List<DigitalDocumentType> digitalDocumentTypes = countryDocumentModel.f14196a.getDigitalDocumentTypes(country);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(digitalDocumentTypes, 10));
        for (DigitalDocumentType digitalDocumentType : digitalDocumentTypes) {
            arrayList.add(new JumioDigitalDocument(digitalDocumentType.getF13775a(), digitalDocumentType.getF13776b()));
        }
        return arrayList;
    }

    @NotNull
    public final List<JumioPhysicalDocument> getPhysicalDocumentsForCountry(@NotNull String countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        C40758z0 c40758z0 = (C40758z0) this.f14687f;
        c40758z0.getClass();
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Country countryM89272a = c40758z0.m89272a(countryCode);
        return countryM89272a == null ? CollectionsKt.emptyList() : c40758z0.m89273a(countryM89272a);
    }

    @NotNull
    /* JADX INFO: renamed from: getScanPartConfigurator$jumio_core_release, reason: from getter */
    public final InterfaceC40578P1 getF14688g() {
        return this.f14688g;
    }

    @Nullable
    public final String getSuggestedCountry() {
        C40758z0 c40758z0 = (C40758z0) this.f14687f;
        if (c40758z0.m89272a(c40758z0.f90497b) != null) {
            return c40758z0.f90497b;
        }
        return null;
    }

    @NotNull
    public final List<String> getSupportedCountries() {
        List list = ((C40758z0) this.f14687f).f90499d;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Country) it.next()).getF13765a());
        }
        return arrayList;
    }

    public final boolean isSupportedConfiguration(@NotNull String country, @NotNull JumioDocument document) {
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(document, "document");
        if (getF14679e()) {
            return ((C40758z0) this.f14687f).m89277a(country, document);
        }
        return false;
    }

    public final void setConfiguration(@NotNull String country, @NotNull JumioDocument document) throws IllegalArgumentException {
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(document, "document");
        if (getF14679e()) {
            if (!isSupportedConfiguration(country, document)) {
                throw new IllegalArgumentException("The selected country/document combination is not valid");
            }
            ((C40573O1) this.f14688g).m89206a(country, document);
            m14621a();
        }
    }

    public final void userConsented(@NotNull JumioLookupResult.JumioLegalStatement legalStatement, boolean userConsent) {
        C40532G0 c40532g0M14622b;
        C40685k2 c40685k2;
        JumioDocumentType documentType;
        Intrinsics.checkNotNullParameter(legalStatement, "legalStatement");
        if (!getF14679e() || (c40532g0M14622b = m14622b()) == null || (c40685k2 = c40532g0M14622b.f89971j) == null) {
            return;
        }
        Controller controller = getF14675a();
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(legalStatement, "legalStatement");
        JumioLookupResult jumioLookupResult = c40685k2.f90312a;
        if (jumioLookupResult == null || (documentType = jumioLookupResult.getDocumentType()) == null) {
            return;
        }
        c40685k2.f90313b = Boolean.valueOf(userConsent);
        LegalStatementModel legalStatementModel = (LegalStatementModel) controller.getF13603d().get(LegalStatementModel.class);
        legalStatementModel.getClass();
        Intrinsics.checkNotNullParameter(legalStatement, "legalStatement");
        legalStatementModel.f14261b = legalStatement;
        legalStatementModel.f14262c = Boolean.valueOf(userConsent);
        Analytics.Companion companion = Analytics.INSTANCE;
        MetaInfo metaInfo = new MetaInfo();
        metaInfo.put(KycKey.idType, documentType.toString());
        metaInfo.put("IDShareConsent", Boolean.valueOf(userConsent));
        Unit unit = Unit.INSTANCE;
        companion.add(MobileEvents.alert("lookupResult", metaInfo));
    }

    /* JADX INFO: renamed from: b */
    public final C40532G0 m14622b() {
        CredentialDataModel f14676b = getF14676b();
        if (f14676b instanceof C40532G0) {
            return (C40532G0) f14676b;
        }
        return null;
    }

    @Override // com.jumio.sdk.credentials.JumioCredential
    public void cancel() throws SDKNotConfiguredException {
        C40685k2 c40685k2;
        super.cancel();
        C40532G0 c40532g0M14622b = m14622b();
        if (c40532g0M14622b != null && (c40685k2 = c40532g0M14622b.f89971j) != null) {
            c40685k2.m89259a(getF14675a(), true, false);
        }
        C40532G0 c40532g0M14622b2 = m14622b();
        if (c40532g0M14622b2 != null && c40532g0M14622b2.f89971j != null) {
            Controller controller = getF14675a();
            Intrinsics.checkNotNullParameter(controller, "controller");
            LegalStatementModel legalStatementModel = (LegalStatementModel) controller.getF13603d().get(LegalStatementModel.class);
            legalStatementModel.f14262c = null;
            legalStatementModel.f14261b = null;
        }
        CredentialDataModel f14676b = getF14676b();
        Intrinsics.checkNotNull(f14676b, "null cannot be cast to non-null type com.jumio.core.models.CredentialIDDataModel");
        C40532G0 c40532g0 = (C40532G0) f14676b;
        c40532g0.f89972k = null;
        c40532g0.f89973l = null;
        C40758z0 c40758z0 = (C40758z0) this.f14687f;
        c40758z0.f90500e = null;
        c40758z0.f90501f = null;
        c40758z0.f90502g = null;
        c40758z0.f90503h = null;
    }

    @Override // com.jumio.sdk.credentials.JumioCredential
    public void finish() throws SDKNotConfiguredException {
        C40532G0 c40532g0M14622b;
        C40685k2 c40685k2;
        super.finish();
        JumioLookupResult lookupResult = getLookupResult();
        if (lookupResult != null && lookupResult.getDocumentType() != null && (c40532g0M14622b = m14622b()) != null && (c40685k2 = c40532g0M14622b.f89971j) != null) {
            c40685k2.m89259a(getF14675a(), false, true);
        }
        CredentialDataModel f14676b = getF14676b();
        Intrinsics.checkNotNull(f14676b, "null cannot be cast to non-null type com.jumio.core.models.CredentialIDDataModel");
        C40532G0 c40532g0 = (C40532G0) f14676b;
        c40532g0.f89972k = null;
        c40532g0.f89973l = null;
        C40758z0 c40758z0 = (C40758z0) this.f14687f;
        c40758z0.f90500e = null;
        c40758z0.f90501f = null;
        c40758z0.f90502g = null;
        c40758z0.f90503h = null;
    }

    public final boolean getBrandingEnabled() {
        return ((SettingsModel) getF14675a().getF13603d().get(SettingsModel.class)).isBrandingEnabled();
    }

    @Override // com.jumio.sdk.credentials.JumioCredential
    @NotNull
    public List<JumioCredentialPart> getCredentialParts() {
        if (super.getCredentialParts().size() == 1) {
            return super.getCredentialParts();
        }
        return CollectionsKt.listOf(JumioCredentialPart.MULTIPART);
    }

    @Nullable
    public final JumioLookupResult getLookupResult() {
        C40685k2 c40685k2;
        C40532G0 c40532g0M14622b = m14622b();
        if (c40532g0M14622b != null && (c40685k2 = c40532g0M14622b.f89971j) != null) {
            return c40685k2.f90312a;
        }
        return null;
    }

    @Override // com.jumio.sdk.credentials.JumioCredential
    /* JADX INFO: renamed from: isConfigured */
    public boolean getF14686f() {
        if (getF14679e() && ((C40758z0) this.f14687f).m89279c()) {
            return true;
        }
        return false;
    }

    @Override // com.jumio.sdk.credentials.JumioCredential
    public void start$jumio_core_release() {
        C40685k2 c40685k2;
        super.start$jumio_core_release();
        C40532G0 c40532g0M14622b = m14622b();
        if (c40532g0M14622b != null && (c40685k2 = c40532g0M14622b.f89971j) != null) {
            Controller controller = getF14675a();
            Intrinsics.checkNotNullParameter(controller, "controller");
            DataManager f13603d = controller.getF13603d();
            JumioDocumentType jumioDocumentType = ((ReusableIdLookupResult) f13603d.get(ReusableIdLookupResult.class)).f14311a;
            if (jumioDocumentType != null) {
                c40685k2.f90312a = new JumioLookupResult(jumioDocumentType, ((LegalStatementModel) f13603d.get(LegalStatementModel.class)).f14260a);
            }
        }
        if (((C40758z0) this.f14687f).m89279c()) {
            m14621a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JumioIDCredential(@NotNull Controller controller, @NotNull C40532G0 credentialDataModel, @NotNull InterfaceC40502A0 countrySelection, @NotNull InterfaceC40578P1 scanPartConfigurator) {
        super(controller, credentialDataModel);
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(credentialDataModel, "credentialDataModel");
        Intrinsics.checkNotNullParameter(countrySelection, "countrySelection");
        Intrinsics.checkNotNullParameter(scanPartConfigurator, "scanPartConfigurator");
        this.f14687f = countrySelection;
        this.f14688g = scanPartConfigurator;
    }

    @Deprecated(message = "Use supportedCountries together with getPhysical/DigitalDocumentsForCountry(country) instead", replaceWith = @ReplaceWith(expression = "countrySelection.countryMap", imports = {}))
    public static /* synthetic */ void getCountries$annotations() {
    }
}
