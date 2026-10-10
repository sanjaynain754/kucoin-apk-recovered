package com.jumio.core.models;

import androidx.exifinterface.media.ExifInterface;
import com.jumio.commons.PersistWith;
import com.jumio.commons.camera.C9300a;
import com.jumio.commons.camera.ImageDataInterface;
import com.jumio.core.data.ScanMode;
import com.jumio.core.data.document.DocumentFormat;
import com.jumio.core.data.image.ImageResult;
import com.jumio.core.data.scan.ByteArrayData;
import com.jumio.core.data.scan.ByteArrayResult;
import com.jumio.core.data.scan.DataState;
import com.jumio.core.data.scan.FileDataInterface;
import com.jumio.core.data.scan.ScanResult;
import com.jumio.core.extraction.docfinder.classifier.DocumentClassifier;
import com.jumio.core.models.automation.AutomationModel;
import com.jumio.core.models.automation.RejectReason;
import com.jumio.core.processor.ImageProcessorConfig;
import com.jumio.core.processor.MultiImageProcessorConfig;
import com.jumio.core.processor.ProcessorData;
import com.jumio.core.processor.ProcessorImage;
import com.jumio.core.processor.ProcessorImageKt;
import com.jumio.core.processor.SingleDataProcessorConfig;
import com.jumio.core.processor.SingleImageProcessorConfig;
import com.jumio.core.processor.challenge.CameraChallengeProcessorConfig;
import com.jumio.core.processor.flash.FlashProcessorConfig;
import com.jumio.core.processor.tilted.TiltedProcessorConfig;
import com.jumio.sdk.enums.JumioCredentialPart;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jumio.core.AbstractC40598T2;
import jumio.core.C40603U2;
import jumio.core.C40610W;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010@\u001a\u00020G2\u0006\u0010H\u001a\u00020\"2\u0006\u0010I\u001a\u00020<H\u0016J\u0012\u0010>\u001a\u0004\u0018\u00010<2\u0006\u0010H\u001a\u00020\"H\u0016J\b\u0010J\u001a\u00020GH\u0016J\u0010\u0010K\u001a\u0004\u0018\u00010L2\u0006\u0010H\u001a\u00020\"J\u0010\u0010M\u001a\u0004\u0018\u00010N2\u0006\u0010H\u001a\u00020\"J\u001f\u0010O\u001a\u0004\u0018\u00010G2\u0006\u0010H\u001a\u00020\"2\b\b\u0002\u00107\u001a\u000206¢\u0006\u0002\u0010PJ\u0010\u0010Q\u001a\u0004\u0018\u0001062\u0006\u0010R\u001a\u00020SJ\u0010\u0010T\u001a\u0004\u0018\u0001062\u0006\u0010U\u001a\u00020\"J\u0010\u0010V\u001a\u0004\u0018\u00010W2\u0006\u0010R\u001a\u00020SJ\u0014\u0010X\u001a\b\u0012\u0002\b\u0003\u0018\u00010#2\u0006\u0010H\u001a\u00020\"J4\u0010Y\u001a\u0004\u0018\u0001HZ\"\u000e\b\u0000\u0010Z\u0018\u0001*\u0006\u0012\u0002\b\u00030#2\u0012\u0010[\u001a\u000e\u0012\u0004\u0012\u0002HZ\u0012\u0004\u0012\u00020C0\\H\u0082\b¢\u0006\u0002\u0010]R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R&\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001e\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030#0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010$\u001a\u0004\u0018\u00010%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001b\u0010*\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030+0\t¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0017R\u0011\u0010-\u001a\u00020.8F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00101\u001a\u0002028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R(\u00107\u001a\u0004\u0018\u0001062\b\u00105\u001a\u0004\u0018\u0001068V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R$\u0010=\u001a\u00020<2\u0006\u00105\u001a\u00020<8V@TX\u0096\u000e¢\u0006\f\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0014\u0010B\u001a\u00020C8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0014\u0010F\u001a\u00020C8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010E¨\u0006^"}, m90084d2 = {"Lcom/jumio/core/models/PhysicalIdScanPartModel;", "Lcom/jumio/core/models/ScanPartModel;", "credentialPart", "Lcom/jumio/sdk/enums/JumioCredentialPart;", "mode", "Lcom/jumio/core/data/ScanMode;", "selectionModel", "Lcom/jumio/core/models/PhysicalSelectionModel;", "extraction", "", "subExtraction", "", "supplementalImages", "Lcom/jumio/core/models/SupplementalImageConfig;", "cameraChallengeData", "Lcom/jumio/core/models/CameraChallengeData;", "<init>", "(Lcom/jumio/sdk/enums/JumioCredentialPart;Lcom/jumio/core/data/ScanMode;Lcom/jumio/core/models/PhysicalSelectionModel;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Lcom/jumio/core/models/CameraChallengeData;)V", "getSelectionModel", "()Lcom/jumio/core/models/PhysicalSelectionModel;", "setSelectionModel", "(Lcom/jumio/core/models/PhysicalSelectionModel;)V", "getExtraction", "()Ljava/util/List;", "setExtraction", "(Ljava/util/List;)V", "getSubExtraction", "()Ljava/util/Map;", "setSubExtraction", "(Ljava/util/Map;)V", "getSupplementalImages", "getCameraChallengeData", "()Lcom/jumio/core/models/CameraChallengeData;", "results", "", "Lcom/jumio/core/data/scan/ScanResult;", "documentData", "Lcom/jumio/core/models/DocumentDataModel;", "getDocumentData", "()Lcom/jumio/core/models/DocumentDataModel;", "setDocumentData", "(Lcom/jumio/core/models/DocumentDataModel;)V", "processorConfigs", "Lcom/jumio/core/processor/ImageProcessorConfig;", "getProcessorConfigs", TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_FORMAT, "Lcom/jumio/core/data/document/DocumentFormat;", "getFormat", "()Lcom/jumio/core/data/document/DocumentFormat;", "fileData", "Lcom/jumio/core/data/scan/FileDataInterface;", "getFileData", "()Lcom/jumio/core/data/scan/FileDataInterface;", "value", "Lcom/jumio/core/models/automation/AutomationModel;", "automationModel", "getAutomationModel", "()Lcom/jumio/core/models/automation/AutomationModel;", "setAutomationModel", "(Lcom/jumio/core/models/automation/AutomationModel;)V", "Lcom/jumio/core/data/scan/DataState;", "dataState", "getDataState", "()Lcom/jumio/core/data/scan/DataState;", "setDataState", "(Lcom/jumio/core/data/scan/DataState;)V", "hasData", "", "getHasData", "()Z", "isComplete", "", DocumentClassifier.KEY_SIDE, "state", "clear", "imageForClassifier", "Lcom/jumio/core/processor/ProcessorImage;", "imageDataForClassifier", "Lcom/jumio/commons/camera/MultiResolutionImageData;", "setDataUploaded", "(Ljava/lang/String;Lcom/jumio/core/models/automation/AutomationModel;)Lkotlin/Unit;", "firstAutomationModelMatchingDecision", "decisionType", "Lcom/jumio/core/models/automation/AutomationModel$DecisionType;", "firstAutomationModelMatchingRejectReasonCode", "code", "firstImageDataMatchingDecision", "Lcom/jumio/commons/camera/ImageDataInterface;", "scanResultForClassifier", "firstResultMatching", ExifInterface.GPS_DIRECTION_TRUE, "filter", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function1;)Lcom/jumio/core/data/scan/ScanResult;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@PersistWith("PhysicalIdScanPartModel")
@SourceDebugExtension({"SMAP\nScanPartModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScanPartModel.kt\ncom/jumio/core/models/PhysicalIdScanPartModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,332:1\n237#1,5:398\n237#1,5:403\n237#1,5:408\n1863#2:333\n1557#2:334\n1628#2,3:335\n1053#2:339\n1864#2:340\n808#2,11:341\n1557#2:352\n1628#2,3:353\n808#2,11:356\n1557#2:367\n1628#2,2:368\n1557#2:370\n1628#2,3:371\n1630#2:374\n808#2,11:375\n1557#2:386\n1628#2,3:387\n1863#2,2:396\n1#3:338\n168#4,3:390\n168#4,3:393\n*S KotlinDebug\n*F\n+ 1 ScanPartModel.kt\ncom/jumio/core/models/PhysicalIdScanPartModel\n*L\n226#1:398,5\n229#1:403,5\n232#1:408,5\n107#1:333\n124#1:334\n124#1:335,3\n125#1:339\n107#1:340\n150#1:341,11\n150#1:352\n150#1:353,3\n153#1:356,11\n153#1:367\n153#1:368,2\n154#1:370\n154#1:371,3\n153#1:374\n158#1:375,11\n158#1:386\n158#1:387,3\n198#1:396,2\n182#1:390,3\n185#1:393,3\n*E\n"})
public final class PhysicalIdScanPartModel extends ScanPartModel {

    /* JADX INFO: renamed from: l */
    public PhysicalSelectionModel f14294l;

    /* JADX INFO: renamed from: m */
    public List f14295m;

    /* JADX INFO: renamed from: n */
    public Map f14296n;

    /* JADX INFO: renamed from: o */
    public final List f14297o;

    /* JADX INFO: renamed from: p */
    public final C40610W f14298p;

    /* JADX INFO: renamed from: q */
    public final Map f14299q;

    /* JADX INFO: renamed from: r */
    public DocumentDataModel f14300r;

    /* JADX INFO: renamed from: s */
    public final ArrayList f14301s;

    public /* synthetic */ PhysicalIdScanPartModel(JumioCredentialPart jumioCredentialPart, ScanMode scanMode, PhysicalSelectionModel physicalSelectionModel, List list, Map map, List list2, C40610W c40610w, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(jumioCredentialPart, scanMode, physicalSelectionModel, (i11 & 8) != 0 ? CollectionsKt.listOf(scanMode) : list, (i11 & 16) != 0 ? MapsKt.emptyMap() : map, (i11 & 32) != 0 ? CollectionsKt.emptyList() : list2, (i11 & 64) != 0 ? new C40610W() : c40610w);
    }

    @Override // com.jumio.core.models.ScanPartModel
    @NotNull
    /* JADX INFO: renamed from: getDataState */
    public DataState getF14265q() {
        DataState state;
        ScanResult scanResult = (ScanResult) this.f14299q.get(getF14312a().name());
        return (scanResult == null || (state = scanResult.getF13818c()) == null) ? DataState.TODO : state;
    }

    @Override // com.jumio.core.models.ScanPartModel
    public void setDataState(@NotNull DataState value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ScanResult scanResult = (ScanResult) this.f14299q.get(getF14312a().name());
        if (scanResult != null) {
            scanResult.setState(value);
        }
    }

    public static /* synthetic */ Unit setDataUploaded$default(PhysicalIdScanPartModel physicalIdScanPartModel, String str, AutomationModel automationModel, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            automationModel = new AutomationModel(null, null, null, null, null, 31, null);
        }
        return physicalIdScanPartModel.setDataUploaded(str, automationModel);
    }

    @Override // com.jumio.core.models.ScanPartModel
    public void clear() {
        for (ScanResult scanResult : this.f14299q.values()) {
            scanResult.getData().clear();
            scanResult.setState(DataState.TODO);
            scanResult.setAutomationModel(null);
        }
        super.clear();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0034  */
    @Nullable
    public final AutomationModel firstAutomationModelMatchingDecision(@NotNull AutomationModel.DecisionType decisionType) {
        ScanResult scanResult;
        Intrinsics.checkNotNullParameter(decisionType, "decisionType");
        Iterator it = this.f14299q.entrySet().iterator();
        do {
            if (!it.hasNext()) {
                scanResult = null;
                break;
            }
            Object value = ((Map.Entry) it.next()).getValue();
            ScanResult scanResult2 = (ScanResult) value;
            if (scanResult2 == null) {
                value = null;
            } else {
                AutomationModel automationModel = scanResult2.getF13817b();
                if ((automationModel != null ? automationModel.getDecisionType() : null) != decisionType) {
                    value = null;
                }
            }
            scanResult = (ScanResult) value;
        } while (scanResult == null);
        if (scanResult == null) {
            scanResult = null;
        }
        if (scanResult != null) {
            return scanResult.getF13817b();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    @Nullable
    public final AutomationModel firstAutomationModelMatchingRejectReasonCode(@NotNull String code) {
        ScanResult scanResult;
        RejectReason rejectReason;
        Intrinsics.checkNotNullParameter(code, "code");
        Iterator it = this.f14299q.entrySet().iterator();
        do {
            if (!it.hasNext()) {
                scanResult = null;
                break;
            }
            Object value = ((Map.Entry) it.next()).getValue();
            ScanResult scanResult2 = (ScanResult) value;
            if (scanResult2 == null) {
                value = null;
            } else {
                AutomationModel automationModel = scanResult2.getF13817b();
                if (!Intrinsics.areEqual((automationModel == null || (rejectReason = automationModel.getRejectReason()) == null) ? null : rejectReason.getCode(), code)) {
                    value = null;
                }
            }
            scanResult = (ScanResult) value;
        } while (scanResult == null);
        if (scanResult == null) {
            scanResult = null;
        }
        if (scanResult != null) {
            return scanResult.getF13817b();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0038  */
    @Nullable
    public final ImageDataInterface firstImageDataMatchingDecision(@NotNull AutomationModel.DecisionType decisionType) {
        ScanResult scanResult;
        Intrinsics.checkNotNullParameter(decisionType, "decisionType");
        Iterator it = this.f14299q.entrySet().iterator();
        do {
            if (!it.hasNext()) {
                scanResult = null;
                break;
            }
            Object value = ((Map.Entry) it.next()).getValue();
            ScanResult scanResult2 = (ScanResult) value;
            if (scanResult2 instanceof ImageResult) {
                AutomationModel automationModel = ((ImageResult) scanResult2).getF13817b();
                if ((automationModel != null ? automationModel.getDecisionType() : null) != decisionType) {
                    value = null;
                }
            } else {
                value = null;
            }
            scanResult = (ScanResult) value;
        } while (scanResult == null);
        if (!(scanResult instanceof ImageResult)) {
            scanResult = null;
        }
        ImageResult imageResult = (ImageResult) scanResult;
        if (imageResult != null) {
            return imageResult.getData();
        }
        return null;
    }

    @Override // com.jumio.core.models.ScanPartModel
    @Nullable
    /* JADX INFO: renamed from: getAutomationModel */
    public AutomationModel getF14319h() {
        ScanResult scanResult = (ScanResult) this.f14299q.get(getF14312a().name());
        if (scanResult != null) {
            return scanResult.getF13817b();
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: getCameraChallengeData, reason: from getter */
    public final C40610W getF14298p() {
        return this.f14298p;
    }

    @Override // com.jumio.core.models.ScanPartModel
    @Nullable
    public synchronized DataState getDataState(@NotNull String classifier) {
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        ScanResult<?> scanResultScanResultForClassifier = scanResultForClassifier(classifier);
        if (scanResultScanResultForClassifier == null) {
            return null;
        }
        return scanResultScanResultForClassifier.getF13818c();
    }

    @Nullable
    /* JADX INFO: renamed from: getDocumentData, reason: from getter */
    public final DocumentDataModel getF14300r() {
        return this.f14300r;
    }

    @NotNull
    public final List<ScanMode> getExtraction() {
        return this.f14295m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.jumio.core.models.ScanPartModel
    @NotNull
    /* JADX INFO: renamed from: getFileData */
    public FileDataInterface getF14314c() {
        Object obj = this.f14299q.get(getF14312a().name());
        C9300a c9300a = null;
        Object[] objArr = 0;
        ImageResult imageResult = obj instanceof ImageResult ? (ImageResult) obj : null;
        if (imageResult == null) {
            imageResult = new ImageResult(c9300a, 1, objArr == true ? 1 : 0);
        }
        return imageResult.getData();
    }

    @NotNull
    public final DocumentFormat getFormat() {
        return this.f14294l.getF14303c().getF13811c();
    }

    @NotNull
    public final List<ImageProcessorConfig<?>> getProcessorConfigs() {
        return this.f14301s;
    }

    @NotNull
    /* JADX INFO: renamed from: getSelectionModel, reason: from getter */
    public final PhysicalSelectionModel getF14294l() {
        return this.f14294l;
    }

    @NotNull
    public final Map<ScanMode, ScanMode> getSubExtraction() {
        return this.f14296n;
    }

    @NotNull
    public final List<SupplementalImageConfig> getSupplementalImages() {
        return this.f14297o;
    }

    @Nullable
    public final C9300a imageDataForClassifier(@NotNull String classifier) {
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        ScanResult<?> scanResultScanResultForClassifier = scanResultForClassifier(classifier);
        ImageResult imageResult = scanResultScanResultForClassifier instanceof ImageResult ? (ImageResult) scanResultScanResultForClassifier : null;
        if (imageResult != null) {
            return imageResult.getData();
        }
        return null;
    }

    @Nullable
    public final ProcessorImage imageForClassifier(@NotNull String classifier) {
        ProcessorImage image;
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        Iterator it = this.f14301s.iterator();
        do {
            image = null;
            image = null;
            Object obj = null;
            image = null;
            if (!it.hasNext()) {
                break;
            }
            ImageProcessorConfig imageProcessorConfig = (ImageProcessorConfig) it.next();
            if (imageProcessorConfig instanceof SingleImageProcessorConfig) {
                if (!Intrinsics.areEqual(((SingleImageProcessorConfig) imageProcessorConfig).getImage().getClassifier(), classifier)) {
                    imageProcessorConfig = null;
                }
                SingleImageProcessorConfig singleImageProcessorConfig = (SingleImageProcessorConfig) imageProcessorConfig;
                if (singleImageProcessorConfig != null) {
                    image = singleImageProcessorConfig.getImage();
                }
            } else if (imageProcessorConfig instanceof MultiImageProcessorConfig) {
                for (Object obj2 : ((MultiImageProcessorConfig) imageProcessorConfig).getImages()) {
                    if (Intrinsics.areEqual(((ProcessorImage) obj2).getClassifier(), classifier)) {
                        obj = obj2;
                        break;
                    }
                }
                image = (ProcessorImage) obj;
            }
        } while (image == null);
        return image;
    }

    @Nullable
    public final ScanResult<?> scanResultForClassifier(@NotNull String classifier) {
        Object next;
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        Iterator it = this.f14299q.entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((Map.Entry) next).getKey(), classifier));
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (ScanResult) entry.getValue();
        }
        return null;
    }

    @Override // com.jumio.core.models.ScanPartModel
    public void setAutomationModel(@Nullable AutomationModel automationModel) {
        ScanResult scanResult = (ScanResult) this.f14299q.get(getF14312a().name());
        if (scanResult != null) {
            scanResult.setAutomationModel(automationModel);
        }
    }

    @Override // com.jumio.core.models.ScanPartModel
    public synchronized void setDataState(@NotNull String classifier, @NotNull DataState state) {
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        Intrinsics.checkNotNullParameter(state, "state");
        ScanResult<?> scanResultScanResultForClassifier = scanResultForClassifier(classifier);
        if (scanResultScanResultForClassifier != null) {
            if (!scanResultScanResultForClassifier.getF13818c().canTransitionTo(state)) {
                scanResultScanResultForClassifier = null;
            }
            if (scanResultScanResultForClassifier != null) {
                scanResultScanResultForClassifier.setState(state);
            }
        }
    }

    @Nullable
    public final Unit setDataUploaded(@NotNull String classifier, @NotNull AutomationModel automationModel) {
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        Intrinsics.checkNotNullParameter(automationModel, "automationModel");
        ScanResult<?> scanResultScanResultForClassifier = scanResultForClassifier(classifier);
        if (scanResultScanResultForClassifier == null) {
            return null;
        }
        DataState state = scanResultScanResultForClassifier.getF13818c();
        DataState dataState = DataState.UPLOADED;
        if (state.canTransitionTo(dataState)) {
            scanResultScanResultForClassifier.setState(dataState);
            scanResultScanResultForClassifier.setAutomationModel(automationModel);
        }
        return Unit.INSTANCE;
    }

    public final void setDocumentData(@Nullable DocumentDataModel documentDataModel) {
        this.f14300r = documentDataModel;
    }

    public final void setExtraction(@NotNull List<? extends ScanMode> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f14295m = list;
    }

    public final void setSelectionModel(@NotNull PhysicalSelectionModel physicalSelectionModel) {
        Intrinsics.checkNotNullParameter(physicalSelectionModel, "<set-?>");
        this.f14294l = physicalSelectionModel;
    }

    public final void setSubExtraction(@NotNull Map<ScanMode, ? extends ScanMode> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.f14296n = map;
    }

    @Override // com.jumio.core.models.ScanPartModel
    public boolean getHasData() {
        if (super.getHasData()) {
            Map map = this.f14299q;
            if (!map.isEmpty()) {
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    if (!((ScanResult) ((Map.Entry) it.next()).getValue()).getHasData()) {
                        return false;
                    }
                }
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // com.jumio.core.models.ScanPartModel
    public boolean isComplete() {
        if (super.isComplete()) {
            Map map = this.f14299q;
            if (!map.isEmpty()) {
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    if (!((ScanResult) ((Map.Entry) it.next()).getValue()).isComplete()) {
                        return false;
                    }
                }
                return true;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PhysicalIdScanPartModel(@NotNull JumioCredentialPart credentialPart, @NotNull ScanMode mode, @NotNull PhysicalSelectionModel selectionModel, @NotNull List<? extends ScanMode> extraction, @NotNull Map<ScanMode, ? extends ScanMode> subExtraction, @NotNull List<SupplementalImageConfig> supplementalImages, @NotNull C40610W cameraChallengeData) {
        super(credentialPart, mode, null, 4, null);
        Intrinsics.checkNotNullParameter(credentialPart, "credentialPart");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(selectionModel, "selectionModel");
        Intrinsics.checkNotNullParameter(extraction, "extraction");
        Intrinsics.checkNotNullParameter(subExtraction, "subExtraction");
        Intrinsics.checkNotNullParameter(supplementalImages, "supplementalImages");
        Intrinsics.checkNotNullParameter(cameraChallengeData, "cameraChallengeData");
        this.f14294l = selectionModel;
        this.f14295m = extraction;
        this.f14296n = subExtraction;
        this.f14297o = supplementalImages;
        this.f14298p = cameraChallengeData;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = supplementalImages.iterator();
        while (true) {
            int i11 = 1;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            Object[] objArr5 = 0;
            Object[] objArr6 = 0;
            if (!it.hasNext()) {
                this.f14301s = arrayList;
                Map mapMapOf = MapsKt.mapOf(TuplesKt.m90091to(credentialPart.name(), new ImageResult(objArr6 == true ? 1 : 0, i11, objArr5 == true ? 1 : 0)));
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (obj instanceof SingleImageProcessorConfig) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(TuplesKt.m90091to(((SingleImageProcessorConfig) it2.next()).getImage().getClassifier(), new ImageResult(objArr4 == true ? 1 : 0, i11, objArr3 == true ? 1 : 0)));
                }
                Map mapPlus = MapsKt.plus(mapMapOf, arrayList3);
                ArrayList arrayList4 = this.f14301s;
                ArrayList arrayList5 = new ArrayList();
                for (Object obj2 : arrayList4) {
                    if (obj2 instanceof MultiImageProcessorConfig) {
                        arrayList5.add(obj2);
                    }
                }
                ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList5, 10));
                Iterator it3 = arrayList5.iterator();
                while (it3.hasNext()) {
                    List images = ((MultiImageProcessorConfig) it3.next()).getImages();
                    ArrayList arrayList7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(images, 10));
                    Iterator it4 = images.iterator();
                    while (it4.hasNext()) {
                        arrayList7.add(TuplesKt.m90091to(((ProcessorImage) it4.next()).getClassifier(), new ImageResult(objArr2 == true ? 1 : 0, i11, objArr == true ? 1 : 0)));
                    }
                    arrayList6.add(arrayList7);
                }
                Map mapPlus2 = MapsKt.plus(mapPlus, CollectionsKt.flatten(arrayList6));
                ArrayList arrayList8 = this.f14301s;
                ArrayList<SingleDataProcessorConfig> arrayList9 = new ArrayList();
                for (Object obj3 : arrayList8) {
                    if (obj3 instanceof SingleDataProcessorConfig) {
                        arrayList9.add(obj3);
                    }
                }
                ArrayList arrayList10 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList9, 10));
                for (SingleDataProcessorConfig singleDataProcessorConfig : arrayList9) {
                    arrayList10.add(TuplesKt.m90091to(singleDataProcessorConfig.getProcessorData().getClassifier(), singleDataProcessorConfig.getProcessorData().getData()));
                }
                this.f14299q = MapsKt.plus(mapPlus2, arrayList10);
                return;
            }
            SupplementalImageConfig supplementalImageConfig = (SupplementalImageConfig) it.next();
            int i12 = AbstractC40598T2.f90126a[supplementalImageConfig.getCategory().ordinal()];
            if (i12 == 1) {
                SupplementalImage supplementalImage = (SupplementalImage) CollectionsKt.firstOrNull((List) supplementalImageConfig.getImages());
                if (supplementalImage != null) {
                    arrayList.add(new FlashProcessorConfig(ProcessorImageKt.asFlashImage(supplementalImage), new ProcessorData(supplementalImage.getClassifier() + "_GZIP", new ByteArrayResult(new ByteArrayData())), 0L, 0L, supplementalImageConfig.getManualEnabled(), 12, null));
                }
            } else if (i12 == 2) {
                List<SupplementalImage> images2 = supplementalImageConfig.getImages();
                ArrayList arrayList11 = new ArrayList(CollectionsKt.collectionSizeOrDefault(images2, 10));
                Iterator<T> it5 = images2.iterator();
                while (it5.hasNext()) {
                    arrayList11.add(ProcessorImageKt.asTiltedImage((SupplementalImage) it5.next()));
                }
                ArrayList arrayList12 = arrayList11.isEmpty() ? null : arrayList11;
                if (arrayList12 != null) {
                    arrayList.add(new TiltedProcessorConfig(CollectionsKt.sortedWith(arrayList12, new C40603U2()), 0L, 0L, 6, null));
                }
            } else if (i12 != 3) {
                if (i12 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (!this.f14298p.f90154d.isEmpty()) {
                C40610W c40610w = this.f14298p;
                arrayList.add(new CameraChallengeProcessorConfig(c40610w, new ProcessorData(c40610w.f90153c, new ByteArrayResult(new ByteArrayData())), 0L, 0L, 12, null));
            }
        }
    }
}
