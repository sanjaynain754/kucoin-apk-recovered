package jumio.core;

import com.jumio.analytics.MetaInfo;
import com.jumio.commons.camera.C9300a;
import com.jumio.commons.camera.CaptureSettings;
import com.jumio.commons.camera.ImageData;
import com.jumio.commons.camera.ImageDataInterface;
import com.jumio.commons.camera.ImageMetadata;
import com.jumio.commons.log.Log;
import com.jumio.core.Controller;
import com.jumio.core.api.BackendManager;
import com.jumio.core.api.calls.UsabilityCall;
import com.jumio.core.data.ScanMode;
import com.jumio.core.data.country.Country;
import com.jumio.core.data.digitaldocument.DigitalDocumentPart;
import com.jumio.core.data.document.ClassifiedDocument;
import com.jumio.core.data.document.DocumentPart;
import com.jumio.core.data.image.ImageResult;
import com.jumio.core.data.scan.ByteArrayData;
import com.jumio.core.data.scan.DataInterface;
import com.jumio.core.data.scan.DataState;
import com.jumio.core.data.scan.FileDataInterface;
import com.jumio.core.data.scan.ScanResult;
import com.jumio.core.enums.UploadResolution;
import com.jumio.core.extraction.ExtractionClient;
import com.jumio.core.extraction.ExtractionUpdateInterface;
import com.jumio.core.extraction.ExtractionUpdateState;
import com.jumio.core.extraction.docfinder.classifier.DocumentClassifier;
import com.jumio.core.extraction.result.DataExtractionResult;
import com.jumio.core.extraction.result.ExtractionResult;
import com.jumio.core.extraction.result.ImageExtractionResult;
import com.jumio.core.interfaces.UsabilityInterface;
import com.jumio.core.model.StaticModel;
import com.jumio.core.models.AdditionalDataPointsModel;
import com.jumio.core.models.ApiCallDataModel;
import com.jumio.core.models.DigitalIdScanPartModel;
import com.jumio.core.models.DigitalSelectionModel;
import com.jumio.core.models.DocumentDataModel;
import com.jumio.core.models.MrzDataModel;
import com.jumio.core.models.NfcSettingsModel;
import com.jumio.core.models.PhysicalIdScanPartModel;
import com.jumio.core.models.PhysicalSelectionModel;
import com.jumio.core.models.ScanPartModel;
import com.jumio.core.models.SelectionModel;
import com.jumio.core.models.SettingsModel;
import com.jumio.core.models.TimeModel;
import com.jumio.core.models.UploadSettingsModel;
import com.jumio.core.models.automation.AutomationModel;
import com.jumio.core.plugins.ExtractionPlugin;
import com.jumio.core.plugins.ScanPartPlugin;
import com.jumio.core.processor.ImageProcessorConfig;
import com.jumio.core.processor.MultiImageProcessorConfig;
import com.jumio.core.processor.ProcessorImage;
import com.jumio.core.processor.SingleDataProcessorConfig;
import com.jumio.core.processor.SingleImageProcessorConfig;
import com.jumio.core.scanpart.JVisionScanPart;
import com.jumio.core.scanpart.ScanPart;
import com.jumio.core.scanpart.ScanPartKt;
import com.jumio.core.sensors.SensorConfig;
import com.jumio.core.sensors.SensorFactoryInterfaceKt;
import com.jumio.core.sensors.SensorProxy;
import com.jumio.core.sensors.SensorType;
import com.jumio.core.views.CameraScanView;
import com.jumio.core.views.EnumC9313a;
import com.jumio.sdk.credentials.JumioCredential;
import com.jumio.sdk.credentials.JumioIDCredential;
import com.jumio.sdk.data.JumioTiltState;
import com.jumio.sdk.document.JumioDocumentInfo;
import com.jumio.sdk.document.JumioDocumentType;
import com.jumio.sdk.document.JumioPhysicalDocument;
import com.jumio.sdk.enums.JumioCredentialPart;
import com.jumio.sdk.enums.JumioFallbackReason;
import com.jumio.sdk.enums.JumioFlashState;
import com.jumio.sdk.enums.JumioScanStep;
import com.jumio.sdk.enums.JumioScanUpdate;
import com.jumio.sdk.interfaces.JumioScanPartInterface;
import com.jumio.sdk.scanpart.JumioAddonScanPartConfiguration;
import com.jumio.sdk.scanpart.JumioScanPart;
import com.p059BV.LinearGradient.LinearGradientManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import jumio.core.C40593S2;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: jumio.core.S2 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40593S2 extends JVisionScanPart implements UsabilityInterface {

    /* JADX INFO: renamed from: t */
    public final int f90120t;

    /* JADX INFO: renamed from: u */
    public final SensorProxy f90121u;

    /* JADX INFO: renamed from: v */
    public final ArrayList f90122v;

    /* JADX INFO: renamed from: w */
    public final boolean f90123w;

    /* JADX INFO: renamed from: a */
    public static final StaticModel m89237a(StaticModel staticModel, StaticModel staticModel2) {
        return staticModel2 == null ? staticModel : staticModel2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40593S2(final Controller controller, JumioIDCredential credential, ArrayList scanPartModelList, JumioScanPartInterface scanPartInterface) {
        super(controller, credential, scanPartModelList, scanPartInterface);
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(credential, "credential");
        Intrinsics.checkNotNullParameter(scanPartModelList, "scanPartModelList");
        Intrinsics.checkNotNullParameter(scanPartInterface, "scanPartInterface");
        this.f90120t = ((SettingsModel) controller.getF13603d().get(SettingsModel.class)).getSensorSamplingTime();
        this.f90121u = new SensorProxy(new Function1() { // from class: lg0.z
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C40593S2.m89238a(controller, this, (List) obj);
            }
        });
        this.f90122v = new ArrayList();
        this.f90123w = true;
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m89238a(Controller controller, C40593S2 c40593s2, List SensorProxy) {
        Intrinsics.checkNotNullParameter(SensorProxy, "$this$SensorProxy");
        if (((SettingsModel) controller.getF13603d().get(SettingsModel.class)).getSensorDataCollectionEnabled()) {
            SensorConfig sensorConfig = new SensorConfig((TimeModel) controller.getF13603d().get(TimeModel.class), c40593s2.f90120t, null, 4, null);
            SensorProxy.add(SensorFactoryInterfaceKt.getSensorFactory().getSensor(SensorType.GYROSCOPE, sensorConfig));
            SensorProxy.add(SensorFactoryInterfaceKt.getSensorFactory().getSensor(SensorType.ACCELEROMETER, sensorConfig));
            SensorProxy.add(SensorFactoryInterfaceKt.getSensorFactory().getSensor(SensorType.GRAVITY, sensorConfig));
        }
        return Unit.INSTANCE;
    }

    @Override // com.jumio.core.scanpart.ScanPart
    public final void checkForAddon(Function1 complete) {
        Object next;
        Intrinsics.checkNotNullParameter(complete, "complete");
        ScanPartPlugin scanPartPlugin = (ScanPartPlugin) getF14541a().getF13605f().getPlugin(EnumC40613W2.NFC);
        if (scanPartPlugin == null) {
            complete.invoke(null);
            return;
        }
        Iterator<T> it = getScanPartModelList().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!scanPartPlugin.isApplicableFor(getF14541a(), (PhysicalIdScanPartModel) next));
        PhysicalIdScanPartModel physicalIdScanPartModel = (PhysicalIdScanPartModel) next;
        if (physicalIdScanPartModel == null) {
            complete.invoke(null);
            return;
        }
        JumioCredentialPart jumioCredentialPart = JumioCredentialPart.NFC;
        PhysicalIdScanPartModel physicalIdScanPartModel2 = new PhysicalIdScanPartModel(jumioCredentialPart, ScanMode.NFC, physicalIdScanPartModel.getF14294l(), null, null, null, null, 120, null);
        physicalIdScanPartModel2.setDocumentData(physicalIdScanPartModel.getF14300r());
        getF14542b().getF14676b().f14202f.put(jumioCredentialPart, physicalIdScanPartModel2);
        complete.invoke(new JumioScanPart(scanPartPlugin.getScanPart(getF14541a(), getF14542b(), physicalIdScanPartModel2, getF14544d())));
        DocumentDataModel f14300r = physicalIdScanPartModel2.getF14300r();
        String f14228g = f14300r != null ? f14300r.getF14228g() : null;
        DocumentDataModel f14300r2 = physicalIdScanPartModel2.getF14300r();
        ScanPart.sendScanStep$default(this, JumioScanStep.ADDON_SCAN_PART, new JumioAddonScanPartConfiguration(new JumioDocumentInfo(f14228g, f14300r2 != null ? f14300r2.getF14223b() : null), ((NfcSettingsModel) getF14541a().getF13603d().get(NfcSettingsModel.class)).getNfcRetries() >= 0), null, 4, null);
    }

    @Override // com.jumio.core.scanpart.JVisionScanPart
    public final void configureExtractionClient(ExtractionClient extractionClient) {
        ExtractionPlugin extractionPlugin;
        Intrinsics.checkNotNullParameter(extractionClient, "extractionClient");
        ScanMode scanMode = ((PhysicalIdScanPartModel) getScanPartModel()).getSubExtraction().get(((PhysicalIdScanPartModel) getScanPartModel()).getF14313b());
        if (scanMode != null && (extractionPlugin = (ExtractionPlugin) getF14541a().getF13605f().getPlugin(ScanPartKt.getPluginModule(scanMode))) != null && extractionPlugin.isUsable(getF14541a())) {
            extractionClient.addSubExtraction(extractionPlugin.getExtractionClient(getF14541a()), new Function2() { // from class: lg0.a0
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C40593S2.m89237a((StaticModel) obj, (StaticModel) obj2);
                }
            });
        }
        super.configureExtractionClient(extractionClient);
    }

    @Override // com.jumio.core.scanpart.ScanPart
    public final void fallback(JumioFallbackReason fallbackReason) {
        String classifier;
        DataState dataState;
        Intrinsics.checkNotNullParameter(fallbackReason, "fallbackReason");
        if (!getHasFallback() || getScanView() == null || this.f90122v.contains(fallbackReason) || !CollectionsKt.contains(CollectionsKt.listOf((Object[]) new JumioScanStep[]{JumioScanStep.SCAN_VIEW, JumioScanStep.STARTED, JumioScanStep.NEXT_PART}), ((PhysicalIdScanPartModel) getScanPartModel()).getF14316e())) {
            return;
        }
        super.fallback(fallbackReason);
        if (!((PhysicalIdScanPartModel) getScanPartModel()).getF14314c().getHasData()) {
            PhysicalIdScanPartModel physicalIdScanPartModel = (PhysicalIdScanPartModel) getScanPartModel();
            ScanMode f14313b = ((PhysicalIdScanPartModel) getScanPartModel()).getF14313b();
            int iIndexOf = ((PhysicalIdScanPartModel) getScanPartModel()).getExtraction().indexOf(f14313b);
            if (iIndexOf != CollectionsKt.getLastIndex(((PhysicalIdScanPartModel) getScanPartModel()).getExtraction())) {
                f14313b = ((PhysicalIdScanPartModel) getScanPartModel()).getExtraction().get(iIndexOf + 1);
            }
            physicalIdScanPartModel.setMode(f14313b);
            initExtractionAndOverlay();
            sendUpdate(JumioScanUpdate.FALLBACK, fallbackReason);
            return;
        }
        destroyExtractionClient();
        destroyOverlay();
        Iterator<T> it = ((PhysicalIdScanPartModel) getScanPartModel()).getProcessorConfigs().iterator();
        while (it.hasNext()) {
            ImageProcessorConfig imageProcessorConfig = (ImageProcessorConfig) it.next();
            if (imageProcessorConfig instanceof SingleImageProcessorConfig) {
                String classifier2 = ((SingleImageProcessorConfig) imageProcessorConfig).getImage().getClassifier();
                DataState dataState2 = ((PhysicalIdScanPartModel) getScanPartModel()).getDataState(classifier2);
                if (dataState2 == null || !dataState2.isAtLeast(DataState.UPLOADED)) {
                    ((PhysicalIdScanPartModel) getScanPartModel()).setDataState(classifier2, DataState.SKIPPED);
                }
            } else if (imageProcessorConfig instanceof MultiImageProcessorConfig) {
                Iterator it2 = ((MultiImageProcessorConfig) imageProcessorConfig).getImages().iterator();
                while (it2.hasNext()) {
                    String classifier3 = ((ProcessorImage) it2.next()).getClassifier();
                    DataState dataState3 = ((PhysicalIdScanPartModel) getScanPartModel()).getDataState(classifier3);
                    if (dataState3 == null || !dataState3.isAtLeast(DataState.UPLOADED)) {
                        ((PhysicalIdScanPartModel) getScanPartModel()).setDataState(classifier3, DataState.SKIPPED);
                    }
                }
            }
            if ((imageProcessorConfig instanceof SingleDataProcessorConfig) && ((dataState = ((PhysicalIdScanPartModel) getScanPartModel()).getDataState((classifier = ((SingleDataProcessorConfig) imageProcessorConfig).getProcessorData().getClassifier()))) == null || !dataState.isAtLeast(DataState.UPLOADED))) {
                ((PhysicalIdScanPartModel) getScanPartModel()).setDataState(classifier, DataState.SKIPPED);
            }
        }
        JVisionScanPart.nextPartOrProcess$default(this, false, 1, null);
    }

    @Override // com.jumio.core.scanpart.JVisionScanPart
    public final ExtractionPlugin getExtractionPlugin(ScanMode scanMode) {
        Intrinsics.checkNotNullParameter(scanMode, "scanMode");
        ExtractionPlugin extractionPlugin = (ExtractionPlugin) getF14541a().getF13605f().getPlugin(ScanPartKt.getPluginModule(scanMode));
        while (true) {
            if (extractionPlugin != null && extractionPlugin.isUsable(getF14541a())) {
                Pair pairM90091to = TuplesKt.m90091to(scanMode, extractionPlugin);
                ScanMode scanMode2 = (ScanMode) pairM90091to.component1();
                ExtractionPlugin extractionPlugin2 = (ExtractionPlugin) pairM90091to.component2();
                ((PhysicalIdScanPartModel) getScanPartModel()).setMode(scanMode2);
                return extractionPlugin2;
            }
            int iIndexOf = ((PhysicalIdScanPartModel) getScanPartModel()).getExtraction().indexOf(scanMode);
            if (iIndexOf != CollectionsKt.getLastIndex(((PhysicalIdScanPartModel) getScanPartModel()).getExtraction())) {
                scanMode = ((PhysicalIdScanPartModel) getScanPartModel()).getExtraction().get(iIndexOf + 1);
            }
            extractionPlugin = (ExtractionPlugin) getF14541a().getF13605f().getPlugin(ScanPartKt.getPluginModule(scanMode));
        }
    }

    @Override // com.jumio.core.scanpart.JVisionScanPart
    public final FileDataInterface getFileDataForResolution(ScanPartModel scanPartModel, ImageExtractionResult result, UploadResolution uploadResolution) {
        PhysicalIdScanPartModel scanPartModel2 = (PhysicalIdScanPartModel) scanPartModel;
        Intrinsics.checkNotNullParameter(scanPartModel2, "scanPartModel");
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(uploadResolution, "uploadResolution");
        C9300a c9300aImageDataForClassifier = scanPartModel2.imageDataForClassifier(result.getF14141b());
        return c9300aImageDataForClassifier != null ? c9300aImageDataForClassifier.m14447a(uploadResolution) : scanPartModel2.getF14314c();
    }

    @Override // com.jumio.core.interfaces.UsabilityInterface
    public final List getMultipartItemsForResultKeys(ApiCallDataModel apiCallDataModel) {
        Intrinsics.checkNotNullParameter(apiCallDataModel, "apiCallDataModel");
        PhysicalIdScanPartModel physicalIdScanPartModel = (PhysicalIdScanPartModel) getPartForId(apiCallDataModel.getF14174b());
        if (physicalIdScanPartModel == null) {
            return CollectionsKt.emptyList();
        }
        if (Intrinsics.areEqual(apiCallDataModel.getF14175c(), physicalIdScanPartModel.getF14312a().name())) {
            return CollectionsKt.listOf(new C40635a4(physicalIdScanPartModel.getF14314c().getFileName(), physicalIdScanPartModel.getF14312a().name()));
        }
        List<C40726s3> list = getSavedImages().get(apiCallDataModel.getF14175c());
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (C40726s3 c40726s3 : list) {
                C9300a c9300aImageDataForClassifier = physicalIdScanPartModel.imageDataForClassifier(c40726s3.f90409a);
                List list2 = null;
                if (c9300aImageDataForClassifier != null) {
                    ArrayList arrayList2 = new ArrayList();
                    ImageData imageDataM14447a = c9300aImageDataForClassifier.m14447a(UploadResolution.FHD);
                    if (!imageDataM14447a.getHasData()) {
                        imageDataM14447a = null;
                    }
                    if (imageDataM14447a != null) {
                        arrayList2.add(new C40635a4(imageDataM14447a.getFileName(), c40726s3.f90409a));
                    }
                    ImageData imageDataM14447a2 = c9300aImageDataForClassifier.m14447a(UploadResolution.UHD);
                    ImageData imageData = imageDataM14447a2.getHasData() ? imageDataM14447a2 : null;
                    if (imageData != null) {
                        arrayList2.add(new C40635a4(imageData.getFileName(), c40726s3.f90409a));
                    }
                    list2 = CollectionsKt.toList(arrayList2);
                }
                if (list2 != null) {
                    arrayList.add(list2);
                }
            }
            List listFlatten = CollectionsKt.flatten(arrayList);
            if (listFlatten != null) {
                return listFlatten;
            }
        }
        return CollectionsKt.emptyList();
    }

    @Override // com.jumio.core.scanpart.JVisionScanPart, jumio.core.InterfaceC40643c0
    public final boolean getShouldUseShader() {
        return this.f90123w;
    }

    @Override // com.jumio.core.scanpart.JVisionScanPart
    public final void handleChallenge(CaptureSettings captureSettings) {
        Intrinsics.checkNotNullParameter(captureSettings, "captureSettings");
        if (captureSettings.getF13525d()) {
            ArrayList arrayList = this.f90122v;
            JumioFallbackReason jumioFallbackReason = JumioFallbackReason.USER_ACTION;
            if (!arrayList.contains(jumioFallbackReason)) {
                arrayList.add(jumioFallbackReason);
            }
            JumioFallbackReason jumioFallbackReason2 = JumioFallbackReason.LOW_PERFORMANCE;
            if (!arrayList.contains(jumioFallbackReason2)) {
                arrayList.add(jumioFallbackReason2);
            }
        }
        super.handleChallenge(captureSettings);
    }

    @Override // com.jumio.core.scanpart.JVisionScanPart
    public final void handleFlash(JumioFlashState flashState, boolean z11) {
        Intrinsics.checkNotNullParameter(flashState, "flashState");
        CameraScanView scanView = getScanView();
        if (scanView != null) {
            if (!scanView.getHasFlash()) {
                scanView = null;
            }
            if (scanView == null) {
                return;
            }
            if (flashState == JumioFlashState.ON) {
                ArrayList arrayList = this.f90122v;
                JumioFallbackReason jumioFallbackReason = JumioFallbackReason.USER_ACTION;
                if (!arrayList.contains(jumioFallbackReason)) {
                    arrayList.add(jumioFallbackReason);
                }
            }
            super.handleFlash(flashState, z11);
        }
    }

    @Override // com.jumio.core.scanpart.JVisionScanPart
    public final void handleShotTaken(ExtractionResult extractionResult, MetaInfo metaInfo, boolean z11) {
        String f14141b;
        DataInterface<?> data;
        C9300a data2;
        ImageMetadata metadata;
        this.f90122v.clear();
        MetaInfo metaInfo2 = new MetaInfo();
        if (extractionResult != null && (f14141b = extractionResult.getF14141b()) != null) {
            PhysicalIdScanPartModel physicalIdScanPartModel = (PhysicalIdScanPartModel) getPartForSide(extractionResult.getF14140a());
            if (physicalIdScanPartModel == null) {
                return;
            }
            ScanResult<?> scanResultScanResultForClassifier = physicalIdScanPartModel.scanResultForClassifier(f14141b);
            ImageResult imageResult = scanResultScanResultForClassifier instanceof ImageResult ? (ImageResult) scanResultScanResultForClassifier : null;
            if (imageResult != null && (data2 = imageResult.getData()) != null && (metadata = data2.m14447a(data2.f13566b).getMetadata()) != null) {
                metaInfo2.put(DocumentClassifier.KEY_SIDE, f14141b);
                metaInfo2.put("flash", Boolean.valueOf(metadata.getF13545a()));
                if (metadata instanceof ImageMetadata.Tilted) {
                    metaInfo2.put(LinearGradientManager.PROP_ANGLE, Integer.valueOf(((ImageMetadata.Tilted) metadata).getAngle()));
                }
            }
            DataExtractionResult dataExtractionResult = extractionResult instanceof DataExtractionResult ? (DataExtractionResult) extractionResult : null;
            if (dataExtractionResult != null && (data = dataExtractionResult.getData()) != null && (data instanceof ByteArrayData)) {
                Map<String, List<C40726s3>> savedImages = getSavedImages();
                DataExtractionResult dataExtractionResult2 = (DataExtractionResult) extractionResult;
                String f14142c = dataExtractionResult2.getF14142c();
                if (f14142c == null) {
                    f14142c = dataExtractionResult2.getF14141b();
                }
                List<C40726s3> arrayList = savedImages.get(f14142c);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    savedImages.put(f14142c, arrayList);
                }
                arrayList.add(new C40726s3(dataExtractionResult2.getF14141b(), C41696j.m91104d(getF14541a().getF13607h().getBackgroundScope(), null, null, new C40588R2(scanResultScanResultForClassifier, data, null), 3, null)));
            }
            synchronized (this.f90121u) {
                physicalIdScanPartModel.setSensorData(this.f90121u.collectResult(getF14542b(), this.f90120t));
                this.f90121u.reset();
                Unit unit = Unit.INSTANCE;
            }
        }
        if (metaInfo != null) {
            metaInfo2.putAll(metaInfo);
        }
        super.handleShotTaken(extractionResult, metaInfo2, z11);
    }

    @Override // com.jumio.core.scanpart.JVisionScanPart
    public final void handleUploadOrUsabilityResult(ApiCallDataModel apiCallDataModel, AutomationModel automationModel) {
        Intrinsics.checkNotNullParameter(apiCallDataModel, "apiCallDataModel");
        Intrinsics.checkNotNullParameter(automationModel, "automationModel");
        PhysicalIdScanPartModel physicalIdScanPartModel = (PhysicalIdScanPartModel) getPartForId(apiCallDataModel.getF14174b());
        if (physicalIdScanPartModel == null) {
            return;
        }
        String f14175c = apiCallDataModel.getF14175c();
        List<C40726s3> list = getSavedImages().get(f14175c);
        if (list == null) {
            physicalIdScanPartModel.setDataUploaded(f14175c, automationModel);
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            physicalIdScanPartModel.setDataUploaded(((C40726s3) it.next()).f90409a, automationModel);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.jumio.core.scanpart.JVisionScanPart
    public final void handleUsabilityReject(Map rejectedModels) {
        Object next;
        AutomationModel f14319h;
        Intrinsics.checkNotNullParameter(rejectedModels, "rejectedModels");
        Iterator<T> it = getScanPartModelList().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((PhysicalIdScanPartModel) next).firstAutomationModelMatchingRejectReasonCode("401") == null);
        PhysicalIdScanPartModel physicalIdScanPartModel = (PhysicalIdScanPartModel) next;
        if (physicalIdScanPartModel != null && (f14319h = physicalIdScanPartModel.getF14319h()) != null) {
            List<ScanPartModel> scanPartModelList = getScanPartModelList();
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(scanPartModelList, 10)), 16));
            Iterator<T> it2 = scanPartModelList.iterator();
            while (it2.hasNext()) {
                PhysicalIdScanPartModel physicalIdScanPartModel2 = (PhysicalIdScanPartModel) it2.next();
                JumioCredentialPart f14312a = physicalIdScanPartModel2.getF14312a();
                AutomationModel automationModelCopy$default = AutomationModel.copy$default(f14319h, null, null, null, null, null, 31, null);
                physicalIdScanPartModel2.setAutomationModel(automationModelCopy$default);
                Pair pairM90091to = TuplesKt.m90091to(f14312a, automationModelCopy$default);
                linkedHashMap.put(pairM90091to.getFirst(), pairM90091to.getSecond());
            }
            rejectedModels = linkedHashMap;
        }
        super.handleUsabilityReject(rejectedModels);
    }

    @Override // com.jumio.core.scanpart.JVisionScanPart, com.jumio.core.model.SubscriberWithUpdate, com.jumio.core.model.Subscriber
    public void onResult(@Nullable StaticModel staticModel) {
        if (staticModel instanceof DocumentDataModel) {
            ((PhysicalIdScanPartModel) getScanPartModel()).setDocumentData((DocumentDataModel) staticModel);
        }
        super.onResult(staticModel);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Code duplicated, block: B:95:0x0238  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r16v0, types: [com.jumio.core.scanpart.JVisionScanPart, com.jumio.core.scanpart.ScanPart, jumio.core.S2, jumio.core.y2] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [com.jumio.core.models.PhysicalIdScanPartModel, com.jumio.core.models.ScanPartModel] */
    /* JADX WARN: Type inference failed for: r9v5, types: [com.jumio.core.models.PhysicalIdScanPartModel] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v8 */
    @Override // com.jumio.core.scanpart.JVisionScanPart, com.jumio.core.model.SubscriberWithUpdate
    public void onUpdate(@NotNull ExtractionUpdateInterface<?> update) {
        Object next;
        Map mapSortedMapOf;
        ?? extraction;
        Map mapEmptyMap;
        Intrinsics.checkNotNullParameter(update, "update");
        Integer f13842a = update.getF13842a();
        ExtractionUpdateState.Companion companion = ExtractionUpdateState.INSTANCE;
        int skipImage = companion.getSkipImage();
        if (f13842a != null && f13842a.intValue() == skipImage) {
            Object data = update.getData();
            Intrinsics.checkNotNull(data, "null cannot be cast to non-null type com.jumio.core.extraction.result.ExtractionResult");
            ExtractionResult extractionResult = (ExtractionResult) data;
            PhysicalIdScanPartModel physicalIdScanPartModel = (PhysicalIdScanPartModel) getPartForSide(extractionResult.getF14140a());
            if (physicalIdScanPartModel != null) {
                physicalIdScanPartModel.setDataState(extractionResult.getF14141b(), DataState.SKIPPED);
            }
            PhysicalIdScanPartModel physicalIdScanPartModel2 = (PhysicalIdScanPartModel) getPartForSide(extractionResult.getF14140a());
            if (physicalIdScanPartModel2 != null) {
                physicalIdScanPartModel2.setDataState(extractionResult.getF14141b() + "_GZIP", DataState.SKIPPED);
                return;
            }
            return;
        }
        int tilt = companion.getTilt();
        if (f13842a != null && f13842a.intValue() == tilt) {
            Object data2 = update.getData();
            if (!(data2 instanceof JumioTiltState)) {
                if (data2 instanceof JumioFlashState) {
                    Object data3 = update.getData();
                    Intrinsics.checkNotNull(data3, "null cannot be cast to non-null type com.jumio.sdk.enums.JumioFlashState");
                    handleFlash((JumioFlashState) data3, false);
                    return;
                }
                return;
            }
            Object data4 = update.getData();
            Intrinsics.checkNotNull(data4, "null cannot be cast to non-null type com.jumio.sdk.data.JumioTiltState");
            JumioTiltState jumioTiltState = (JumioTiltState) data4;
            CameraScanView scanView = getScanView();
            if (scanView != null) {
                CameraScanView cameraScanView = scanView.getHasFlash() ? scanView : null;
                if (cameraScanView != null) {
                    cameraScanView.registerUserActionOverride$jumio_core_release(EnumC9313a.FLASH);
                }
            }
            this.f90122v.remove(JumioFallbackReason.USER_ACTION);
            sendUpdate(JumioScanUpdate.TILT, jumioTiltState);
            return;
        }
        int documentClassified = companion.getDocumentClassified();
        if (f13842a == null || f13842a.intValue() != documentClassified) {
            super.onUpdate(update);
            return;
        }
        Object data5 = update.getData();
        Intrinsics.checkNotNull(data5, "null cannot be cast to non-null type com.jumio.core.data.document.ClassifiedDocument");
        ClassifiedDocument classifiedDocument = (ClassifiedDocument) data5;
        String countryCode = classifiedDocument.getF13778a();
        JumioDocumentType f13779b = classifiedDocument.getF13779b();
        if ((getSettingsModel().getSkipDocTypeSelection() || getSettingsModel().getDocClassifierOverride()) && (getF14542b() instanceof JumioIDCredential)) {
            C40758z0 c40758z0 = (C40758z0) ((JumioIDCredential) getF14542b()).getF14687f();
            c40758z0.getClass();
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            Country countryM89272a = c40758z0.m89272a(countryCode);
            Iterator it = (countryM89272a == null ? CollectionsKt.emptyList() : c40758z0.m89273a(countryM89272a)).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((JumioPhysicalDocument) next).getType() != f13779b);
            JumioPhysicalDocument jumioPhysicalDocument = (JumioPhysicalDocument) next;
            if (jumioPhysicalDocument == null) {
                return;
            }
            String simpleName = C40593S2.class.getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
            Log.m14463d(simpleName, "Setting re-classified configuration");
            InterfaceC40578P1 f14688g = ((JumioIDCredential) getF14542b()).getF14688g();
            JumioCredentialPart f14312a = ((PhysicalIdScanPartModel) getScanPartModel()).getF14312a();
            C40573O1 c40573o1 = (C40573O1) f14688g;
            c40573o1.m89206a(countryCode, jumioPhysicalDocument);
            SelectionModel selectionModelM89278b = ((C40758z0) c40573o1.f90064b).m89278b();
            if (selectionModelM89278b != null) {
                if (selectionModelM89278b instanceof PhysicalSelectionModel) {
                    PhysicalSelectionModel physicalSelectionModel = (PhysicalSelectionModel) selectionModelM89278b;
                    mapSortedMapOf = MapsKt.sortedMapOf(new Pair[0]);
                    for (DocumentPart documentPart : physicalSelectionModel.getF14303c().getParts()) {
                        Object obj = c40573o1.f90065c.f14201e.get(documentPart.getF13807a());
                        ?? M89205a = obj instanceof PhysicalIdScanPartModel ? (PhysicalIdScanPartModel) obj : 0;
                        JumioCredentialPart f13807a = documentPart.getF13807a();
                        if (M89205a != 0) {
                            if (((SettingsModel) c40573o1.f90063a.getF13603d().get(SettingsModel.class)).getAutomaticBarcodeExtraction() && documentPart.getExtraction().contains(ScanMode.DOCFINDER) && c40573o1.f90063a.getF13605f().hasPlugin(EnumC40613W2.DOCFINDER)) {
                                List<ScanMode> extraction2 = documentPart.getExtraction();
                                extraction = new ArrayList();
                                for (Object obj2 : extraction2) {
                                    if (((ScanMode) obj2) != ScanMode.PDF417) {
                                        extraction.add(obj2);
                                    }
                                }
                            } else {
                                extraction = documentPart.getExtraction();
                            }
                            if (((SettingsModel) c40573o1.f90063a.getF13603d().get(SettingsModel.class)).getAutomaticBarcodeExtraction()) {
                                List<ScanMode> extraction3 = documentPart.getExtraction();
                                ScanMode scanMode = ScanMode.DOCFINDER;
                                if (extraction3.contains(scanMode) && c40573o1.f90063a.getF13605f().hasPlugin(EnumC40613W2.DOCFINDER)) {
                                    mapEmptyMap = MapsKt.mapOf(TuplesKt.m90091to(scanMode, ScanMode.PDF417));
                                } else {
                                    mapEmptyMap = MapsKt.emptyMap();
                                }
                            } else {
                                mapEmptyMap = MapsKt.emptyMap();
                            }
                            M89205a.setMode((ScanMode) extraction.get(0));
                            M89205a.setSelectionModel(physicalSelectionModel);
                            M89205a.setExtraction(extraction);
                            M89205a.setSubExtraction(mapEmptyMap);
                        } else {
                            M89205a = c40573o1.m89205a(documentPart, physicalSelectionModel);
                        }
                        mapSortedMapOf.put(f13807a, M89205a);
                    }
                } else {
                    if (!(selectionModelM89278b instanceof DigitalSelectionModel)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    DigitalSelectionModel digitalSelectionModel = (DigitalSelectionModel) selectionModelM89278b;
                    List<DigitalDocumentPart> parts = digitalSelectionModel.getF14214b().getParts();
                    Map linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(parts, 10)), 16));
                    Iterator it2 = parts.iterator();
                    while (it2.hasNext()) {
                        Pair pairM90091to = TuplesKt.m90091to(JumioCredentialPart.DIGITAL, new DigitalIdScanPartModel(((DigitalDocumentPart) it2.next()).getF13773b(), digitalSelectionModel));
                        linkedHashMap.put(pairM90091to.getFirst(), pairM90091to.getSecond());
                    }
                    mapSortedMapOf = linkedHashMap;
                }
                SortedMap sortedMap = c40573o1.f90065c.f14201e;
                sortedMap.clear();
                sortedMap.putAll(mapSortedMapOf);
            }
            Collection<ScanPartModel> collectionValues = getF14542b().getF14676b().f14201e.values();
            Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
            ArrayList arrayList = new ArrayList();
            for (ScanPartModel scanPartModel : collectionValues) {
                PhysicalIdScanPartModel physicalIdScanPartModel3 = scanPartModel instanceof PhysicalIdScanPartModel ? (PhysicalIdScanPartModel) scanPartModel : null;
                if (physicalIdScanPartModel3 != null) {
                    arrayList.add(physicalIdScanPartModel3);
                }
            }
            updateScanPartModelList(arrayList, f14312a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.jumio.core.scanpart.JVisionScanPart
    public final void uploadExtractionResult(ExtractionResult result) {
        LinkedHashMap linkedHashMapLinkedMapOf;
        C9300a c9300aImageDataForClassifier;
        C9300a c9300aImageDataForClassifier2;
        UploadResolution uploadResolution;
        Intrinsics.checkNotNullParameter(result, "result");
        PhysicalIdScanPartModel physicalIdScanPartModel = (PhysicalIdScanPartModel) getPartForSide(result.getF14140a());
        if (physicalIdScanPartModel == null) {
            return;
        }
        physicalIdScanPartModel.setUsability(getShouldEnableUsability());
        String upperCase = result.getF14141b().toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        if (Intrinsics.areEqual(upperCase, physicalIdScanPartModel.getF14312a().name())) {
            physicalIdScanPartModel.setDataState(result.getF14141b(), DataState.SAVED);
            if (physicalIdScanPartModel.getF14314c() instanceof ImageDataInterface) {
                FileDataInterface f14314c = physicalIdScanPartModel.getF14314c();
                Intrinsics.checkNotNull(f14314c, "null cannot be cast to non-null type com.jumio.commons.camera.ImageDataInterface");
                addCameraData((ImageDataInterface) f14314c);
            }
            getF14541a().getF13604e().uploadPart(getF14542b(), physicalIdScanPartModel);
            return;
        }
        String f14142c = result.getF14142c();
        if (f14142c != null) {
            List<C40726s3> list = getSavedImages().get(f14142c);
            if (list != null) {
                linkedHashMapLinkedMapOf = new LinkedHashMap();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    Pair pairM90091to = TuplesKt.m90091to(((C40726s3) it.next()).f90409a, physicalIdScanPartModel);
                    linkedHashMapLinkedMapOf.put(pairM90091to.getFirst(), pairM90091to.getSecond());
                }
            } else {
                linkedHashMapLinkedMapOf = new LinkedHashMap();
            }
        } else {
            linkedHashMapLinkedMapOf = MapsKt.linkedMapOf(TuplesKt.m90091to(result.getF14141b(), physicalIdScanPartModel));
        }
        UploadResolution uploadImageResolution = ((UploadSettingsModel) getF14541a().getF13603d().get(UploadSettingsModel.class)).getF14381b();
        Iterator it2 = linkedHashMapLinkedMapOf.entrySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it2.next();
            Object value = entry.getValue();
            PhysicalIdScanPartModel physicalIdScanPartModel2 = value instanceof PhysicalIdScanPartModel ? (PhysicalIdScanPartModel) value : null;
            if (physicalIdScanPartModel2 != null && (c9300aImageDataForClassifier2 = physicalIdScanPartModel2.imageDataForClassifier((String) entry.getKey())) != null) {
                Intrinsics.checkNotNullParameter(c9300aImageDataForClassifier2, "<this>");
                Intrinsics.checkNotNullParameter(uploadImageResolution, "uploadImageResolution");
                Intrinsics.checkNotNullParameter(c9300aImageDataForClassifier2, "<this>");
                Intrinsics.checkNotNullParameter(uploadImageResolution, "uploadImageResolution");
                UploadResolution uploadResolution2 = UploadResolution.UHD;
                if (c9300aImageDataForClassifier2.m14447a(uploadResolution2).getHasData()) {
                    uploadResolution = uploadResolution2;
                } else {
                    uploadResolution = UploadResolution.FHD;
                    if (!c9300aImageDataForClassifier2.m14447a(uploadResolution).getHasData()) {
                        UploadResolution uploadResolution3 = UploadResolution.DEBUG;
                        if (c9300aImageDataForClassifier2.m14447a(uploadResolution3).getHasData()) {
                            uploadResolution = uploadResolution3;
                        }
                    }
                }
                if (uploadImageResolution != uploadResolution) {
                    UploadResolution uploadResolution4 = UploadResolution.DEBUG;
                    uploadResolution = uploadResolution == uploadResolution4 ? uploadResolution4 : uploadResolution == uploadResolution2 ? UploadResolution.FHD : UploadResolution.FHD;
                }
                c9300aImageDataForClassifier2.m14448b(uploadResolution);
                if (!c9300aImageDataForClassifier2.m14447a(c9300aImageDataForClassifier2.f13566b).getHasData()) {
                    physicalIdScanPartModel.setDataState((String) entry.getKey(), DataState.SKIPPED);
                }
            }
        }
        if (linkedHashMapLinkedMapOf.isEmpty() || linkedHashMapLinkedMapOf.isEmpty()) {
            return;
        }
        for (Map.Entry entry2 : linkedHashMapLinkedMapOf.entrySet()) {
            Object value2 = entry2.getValue();
            PhysicalIdScanPartModel physicalIdScanPartModel3 = value2 instanceof PhysicalIdScanPartModel ? (PhysicalIdScanPartModel) value2 : null;
            if (physicalIdScanPartModel3 != null && (c9300aImageDataForClassifier = physicalIdScanPartModel3.imageDataForClassifier((String) entry2.getKey())) != null && c9300aImageDataForClassifier.m14447a(c9300aImageDataForClassifier.f13566b).getHasData()) {
                Set<String> setKeySet = linkedHashMapLinkedMapOf.keySet();
                Intrinsics.checkNotNullExpressionValue(setKeySet, "<get-keys>(...)");
                for (String str : setKeySet) {
                    Intrinsics.checkNotNull(str);
                    physicalIdScanPartModel.setDataState(str, DataState.SAVED);
                    C9300a c9300aImageDataForClassifier3 = physicalIdScanPartModel.imageDataForClassifier(str);
                    if (c9300aImageDataForClassifier3 != null) {
                        addCameraData(c9300aImageDataForClassifier3);
                    }
                }
                BackendManager f13604e = getF14541a().getF13604e();
                JumioCredential f14542b = getF14542b();
                String f14318g = physicalIdScanPartModel.getF14318g();
                String f14142c2 = result.getF14142c();
                if (f14142c2 == null) {
                    f14142c2 = result.getF14141b();
                }
                f13604e.uploadRawData(f14542b, linkedHashMapLinkedMapOf, f14318g, f14142c2);
                return;
            }
        }
    }

    @Override // com.jumio.core.scanpart.JVisionScanPart, jumio.core.InterfaceC40643c0
    public final void cameraAvailable() {
        super.cameraAvailable();
        CameraScanView scanView = getScanView();
        if (scanView != null) {
            scanView.setShader$jumio_core_release(AbstractC40663g0.f90269a);
        }
    }

    @Override // com.jumio.core.scanpart.JVisionScanPart, com.jumio.core.scanpart.ScanPart
    public final void cancel() {
        super.cancel();
        this.f90121u.stop();
    }

    @Override // com.jumio.core.scanpart.JVisionScanPart, com.jumio.core.scanpart.ScanPart
    public final void finish() {
        String f13765a;
        super.finish();
        this.f90121u.stop();
        AdditionalDataPointsModel additionalDataPointsModel = (AdditionalDataPointsModel) getF14541a().getF13603d().get(AdditionalDataPointsModel.class);
        PhysicalIdScanPartModel scanPart = (PhysicalIdScanPartModel) getScanPartModel();
        additionalDataPointsModel.getClass();
        Intrinsics.checkNotNullParameter(scanPart, "scanPart");
        DocumentDataModel f14300r = scanPart.getF14300r();
        if (f14300r != null) {
            f13765a = f14300r.getF14228g();
        } else {
            f13765a = null;
        }
        if (f13765a == null || f13765a.length() == 0) {
            f13765a = scanPart.getF14294l().getF14323a().getF13765a();
        }
        additionalDataPointsModel.f14171i = f13765a;
    }

    @Override // com.jumio.core.scanpart.JVisionScanPart, com.jumio.core.scanpart.ScanPart
    public final boolean getHasFallback() {
        if (((PhysicalIdScanPartModel) getScanPartModel()).getExtraction().indexOf(((PhysicalIdScanPartModel) getScanPartModel()).getF14313b()) != CollectionsKt.getLastIndex(((PhysicalIdScanPartModel) getScanPartModel()).getExtraction())) {
            return true;
        }
        return false;
    }

    @Override // com.jumio.core.scanpart.JVisionScanPart
    public final Map getRejectedImages() {
        Pair pairM90091to;
        List<ScanPartModel> scanPartModelList = getScanPartModelList();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = scanPartModelList.iterator();
        while (it.hasNext()) {
            PhysicalIdScanPartModel physicalIdScanPartModel = (PhysicalIdScanPartModel) it.next();
            ImageDataInterface imageDataInterfaceFirstImageDataMatchingDecision = physicalIdScanPartModel.firstImageDataMatchingDecision(AutomationModel.DecisionType.REJECT);
            if (imageDataInterfaceFirstImageDataMatchingDecision != null) {
                pairM90091to = TuplesKt.m90091to(physicalIdScanPartModel.getF14312a(), imageDataInterfaceFirstImageDataMatchingDecision);
            } else {
                pairM90091to = null;
            }
            if (pairM90091to != null) {
                arrayList.add(pairM90091to);
            }
        }
        return MapsKt.toMap(arrayList);
    }

    @Override // com.jumio.core.scanpart.JVisionScanPart
    public final Map getRejectedModels() {
        Pair pairM90091to;
        List<ScanPartModel> scanPartModelList = getScanPartModelList();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = scanPartModelList.iterator();
        while (it.hasNext()) {
            PhysicalIdScanPartModel physicalIdScanPartModel = (PhysicalIdScanPartModel) it.next();
            AutomationModel automationModelFirstAutomationModelMatchingDecision = physicalIdScanPartModel.firstAutomationModelMatchingDecision(AutomationModel.DecisionType.REJECT);
            if (automationModelFirstAutomationModelMatchingDecision != null) {
                pairM90091to = TuplesKt.m90091to(physicalIdScanPartModel.getF14312a(), automationModelFirstAutomationModelMatchingDecision);
            } else {
                pairM90091to = null;
            }
            if (pairM90091to != null) {
                arrayList.add(pairM90091to);
            }
        }
        return MapsKt.toMap(arrayList);
    }

    @Override // com.jumio.core.interfaces.UsabilityInterface
    public final boolean getShouldEnableUsability() {
        if (getSettingsModel().isInstantFeedbackEnabled() && getF14535n() < getSettingsModel().getAutomationMaxRetries()) {
            return true;
        }
        return false;
    }

    @Override // com.jumio.core.scanpart.JVisionScanPart, com.jumio.core.scanpart.ScanPart
    public final void persist(boolean z11) {
        super.persist(z11);
        if (z11) {
            this.f90121u.stop();
        }
    }

    @Override // jumio.core.AbstractC40755y2, com.jumio.core.scanpart.ScanPart
    public final void reset() {
        PhysicalIdScanPartModel physicalIdScanPartModel = (PhysicalIdScanPartModel) getScanPartModel();
        ScanMode scanMode = ((PhysicalIdScanPartModel) getScanPartModel()).getExtraction().get(0);
        ExtractionPlugin extractionPlugin = (ExtractionPlugin) getF14541a().getF13605f().getPlugin(ScanPartKt.getPluginModule(scanMode));
        while (true) {
            if (extractionPlugin != null && extractionPlugin.isUsable(getF14541a())) {
                physicalIdScanPartModel.setMode((ScanMode) TuplesKt.m90091to(scanMode, extractionPlugin).getFirst());
                ((PhysicalIdScanPartModel) getScanPartModel()).setDocumentData(null);
                getSavedImages().clear();
                synchronized (this.f90121u) {
                    this.f90121u.reset();
                    Unit unit = Unit.INSTANCE;
                }
                super.reset();
                return;
            }
            int iIndexOf = ((PhysicalIdScanPartModel) getScanPartModel()).getExtraction().indexOf(scanMode);
            if (iIndexOf != CollectionsKt.getLastIndex(((PhysicalIdScanPartModel) getScanPartModel()).getExtraction())) {
                scanMode = ((PhysicalIdScanPartModel) getScanPartModel()).getExtraction().get(iIndexOf + 1);
            }
            extractionPlugin = (ExtractionPlugin) getF14541a().getF13605f().getPlugin(ScanPartKt.getPluginModule(scanMode));
        }
    }

    @Override // com.jumio.core.scanpart.JVisionScanPart, jumio.core.AbstractC40755y2, com.jumio.core.scanpart.ScanPart
    public final void restore() {
        super.restore();
        this.f90121u.start(getF14541a().getF13601b());
    }

    @Override // com.jumio.core.scanpart.JVisionScanPart, com.jumio.core.scanpart.ScanPart
    public final void start() {
        super.start();
        this.f90121u.start(getF14541a().getF13601b());
    }

    @Override // com.jumio.core.scanpart.JVisionScanPart, com.jumio.core.network.ApiBinding, jumio.core.InterfaceC40662g
    public void onResult(@NotNull ApiCallDataModel<?> apiCallDataModel, @Nullable Object obj) {
        PhysicalIdScanPartModel physicalIdScanPartModel;
        AutomationModel f14319h;
        Intrinsics.checkNotNullParameter(apiCallDataModel, "apiCallDataModel");
        super.onResult(apiCallDataModel, obj);
        if (!Intrinsics.areEqual(apiCallDataModel.getCall(), UsabilityCall.class) || (physicalIdScanPartModel = (PhysicalIdScanPartModel) getPartForId(apiCallDataModel.getF14174b())) == null) {
            return;
        }
        if (!Intrinsics.areEqual(physicalIdScanPartModel.getF14312a().name(), apiCallDataModel.getF14175c())) {
            physicalIdScanPartModel = null;
        }
        if (physicalIdScanPartModel != null && (f14319h = physicalIdScanPartModel.getF14319h()) != null && f14319h.getExtractedData().isNfcChipUnlockDataComplete() && f14319h.getNfcProperties().available()) {
            MrzDataModel mrzDataModel = new MrzDataModel();
            mrzDataModel.setFromExtractedData(f14319h.getExtractedData());
            physicalIdScanPartModel.setDocumentData(mrzDataModel);
        }
    }
}
