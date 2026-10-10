.class public final Lcom/jumio/core/models/PhysicalIdScanPartModel;
.super Lcom/jumio/core/models/ScanPartModel;
.source "SourceFile"


# annotations
.annotation runtime Lcom/jumio/commons/PersistWith;
    value = "PhysicalIdScanPartModel"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00a6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00050\t\u0012\u0014\u0008\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000b\u0012\u000e\u0008\u0002\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\r0\t\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0018\u0010@\u001a\u00020G2\u0006\u0010H\u001a\u00020\"2\u0006\u0010I\u001a\u00020<H\u0016J\u0012\u0010>\u001a\u0004\u0018\u00010<2\u0006\u0010H\u001a\u00020\"H\u0016J\u0008\u0010J\u001a\u00020GH\u0016J\u0010\u0010K\u001a\u0004\u0018\u00010L2\u0006\u0010H\u001a\u00020\"J\u0010\u0010M\u001a\u0004\u0018\u00010N2\u0006\u0010H\u001a\u00020\"J\u001f\u0010O\u001a\u0004\u0018\u00010G2\u0006\u0010H\u001a\u00020\"2\u0008\u0008\u0002\u00107\u001a\u000206\u00a2\u0006\u0002\u0010PJ\u0010\u0010Q\u001a\u0004\u0018\u0001062\u0006\u0010R\u001a\u00020SJ\u0010\u0010T\u001a\u0004\u0018\u0001062\u0006\u0010U\u001a\u00020\"J\u0010\u0010V\u001a\u0004\u0018\u00010W2\u0006\u0010R\u001a\u00020SJ\u0014\u0010X\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010#2\u0006\u0010H\u001a\u00020\"J4\u0010Y\u001a\u0004\u0018\u0001HZ\"\u000e\u0008\u0000\u0010Z\u0018\u0001*\u0006\u0012\u0002\u0008\u00030#2\u0012\u0010[\u001a\u000e\u0012\u0004\u0012\u0002HZ\u0012\u0004\u0012\u00020C0\\H\u0082\u0008\u00a2\u0006\u0002\u0010]R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013\"\u0004\u0008\u0014\u0010\u0015R \u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00050\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017\"\u0004\u0008\u0018\u0010\u0019R&\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001a\u0010\u001b\"\u0004\u0008\u001c\u0010\u001dR\u0017\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\r0\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u0017R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010 R\u001e\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\"\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030#0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010$\u001a\u0004\u0018\u00010%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008&\u0010\'\"\u0004\u0008(\u0010)R\u001b\u0010*\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030+0\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008,\u0010\u0017R\u0011\u0010-\u001a\u00020.8F\u00a2\u0006\u0006\u001a\u0004\u0008/\u00100R\u0014\u00101\u001a\u0002028VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u00083\u00104R(\u00107\u001a\u0004\u0018\u0001062\u0008\u00105\u001a\u0004\u0018\u0001068V@VX\u0096\u000e\u00a2\u0006\u000c\u001a\u0004\u00088\u00109\"\u0004\u0008:\u0010;R$\u0010=\u001a\u00020<2\u0006\u00105\u001a\u00020<8V@TX\u0096\u000e\u00a2\u0006\u000c\u001a\u0004\u0008>\u0010?\"\u0004\u0008@\u0010AR\u0014\u0010B\u001a\u00020C8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008D\u0010ER\u0014\u0010F\u001a\u00020C8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008F\u0010E\u00a8\u0006^"
    }
    d2 = {
        "Lcom/jumio/core/models/PhysicalIdScanPartModel;",
        "Lcom/jumio/core/models/ScanPartModel;",
        "credentialPart",
        "Lcom/jumio/sdk/enums/JumioCredentialPart;",
        "mode",
        "Lcom/jumio/core/data/ScanMode;",
        "selectionModel",
        "Lcom/jumio/core/models/PhysicalSelectionModel;",
        "extraction",
        "",
        "subExtraction",
        "",
        "supplementalImages",
        "Lcom/jumio/core/models/SupplementalImageConfig;",
        "cameraChallengeData",
        "Lcom/jumio/core/models/CameraChallengeData;",
        "<init>",
        "(Lcom/jumio/sdk/enums/JumioCredentialPart;Lcom/jumio/core/data/ScanMode;Lcom/jumio/core/models/PhysicalSelectionModel;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Lcom/jumio/core/models/CameraChallengeData;)V",
        "getSelectionModel",
        "()Lcom/jumio/core/models/PhysicalSelectionModel;",
        "setSelectionModel",
        "(Lcom/jumio/core/models/PhysicalSelectionModel;)V",
        "getExtraction",
        "()Ljava/util/List;",
        "setExtraction",
        "(Ljava/util/List;)V",
        "getSubExtraction",
        "()Ljava/util/Map;",
        "setSubExtraction",
        "(Ljava/util/Map;)V",
        "getSupplementalImages",
        "getCameraChallengeData",
        "()Lcom/jumio/core/models/CameraChallengeData;",
        "results",
        "",
        "Lcom/jumio/core/data/scan/ScanResult;",
        "documentData",
        "Lcom/jumio/core/models/DocumentDataModel;",
        "getDocumentData",
        "()Lcom/jumio/core/models/DocumentDataModel;",
        "setDocumentData",
        "(Lcom/jumio/core/models/DocumentDataModel;)V",
        "processorConfigs",
        "Lcom/jumio/core/processor/ImageProcessorConfig;",
        "getProcessorConfigs",
        "format",
        "Lcom/jumio/core/data/document/DocumentFormat;",
        "getFormat",
        "()Lcom/jumio/core/data/document/DocumentFormat;",
        "fileData",
        "Lcom/jumio/core/data/scan/FileDataInterface;",
        "getFileData",
        "()Lcom/jumio/core/data/scan/FileDataInterface;",
        "value",
        "Lcom/jumio/core/models/automation/AutomationModel;",
        "automationModel",
        "getAutomationModel",
        "()Lcom/jumio/core/models/automation/AutomationModel;",
        "setAutomationModel",
        "(Lcom/jumio/core/models/automation/AutomationModel;)V",
        "Lcom/jumio/core/data/scan/DataState;",
        "dataState",
        "getDataState",
        "()Lcom/jumio/core/data/scan/DataState;",
        "setDataState",
        "(Lcom/jumio/core/data/scan/DataState;)V",
        "hasData",
        "",
        "getHasData",
        "()Z",
        "isComplete",
        "",
        "classifier",
        "state",
        "clear",
        "imageForClassifier",
        "Lcom/jumio/core/processor/ProcessorImage;",
        "imageDataForClassifier",
        "Lcom/jumio/commons/camera/MultiResolutionImageData;",
        "setDataUploaded",
        "(Ljava/lang/String;Lcom/jumio/core/models/automation/AutomationModel;)Lkotlin/Unit;",
        "firstAutomationModelMatchingDecision",
        "decisionType",
        "Lcom/jumio/core/models/automation/AutomationModel$DecisionType;",
        "firstAutomationModelMatchingRejectReasonCode",
        "code",
        "firstImageDataMatchingDecision",
        "Lcom/jumio/commons/camera/ImageDataInterface;",
        "scanResultForClassifier",
        "firstResultMatching",
        "T",
        "filter",
        "Lkotlin/Function1;",
        "(Lkotlin/jvm/functions/Function1;)Lcom/jumio/core/data/scan/ScanResult;",
        "jumio-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nScanPartModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScanPartModel.kt\ncom/jumio/core/models/PhysicalIdScanPartModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,332:1\n237#1,5:398\n237#1,5:403\n237#1,5:408\n1863#2:333\n1557#2:334\n1628#2,3:335\n1053#2:339\n1864#2:340\n808#2,11:341\n1557#2:352\n1628#2,3:353\n808#2,11:356\n1557#2:367\n1628#2,2:368\n1557#2:370\n1628#2,3:371\n1630#2:374\n808#2,11:375\n1557#2:386\n1628#2,3:387\n1863#2,2:396\n1#3:338\n168#4,3:390\n168#4,3:393\n*S KotlinDebug\n*F\n+ 1 ScanPartModel.kt\ncom/jumio/core/models/PhysicalIdScanPartModel\n*L\n226#1:398,5\n229#1:403,5\n232#1:408,5\n107#1:333\n124#1:334\n124#1:335,3\n125#1:339\n107#1:340\n150#1:341,11\n150#1:352\n150#1:353,3\n153#1:356,11\n153#1:367\n153#1:368,2\n154#1:370\n154#1:371,3\n153#1:374\n158#1:375,11\n158#1:386\n158#1:387,3\n198#1:396,2\n182#1:390,3\n185#1:393,3\n*E\n"
    }
.end annotation


# instance fields
.field public l:Lcom/jumio/core/models/PhysicalSelectionModel;

.field public m:Ljava/util/List;

.field public n:Ljava/util/Map;

.field public final o:Ljava/util/List;

.field public final p:Ljumio/core/W;

.field public final q:Ljava/util/Map;

.field public r:Lcom/jumio/core/models/DocumentDataModel;

.field public final s:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Lcom/jumio/sdk/enums/JumioCredentialPart;Lcom/jumio/core/data/ScanMode;Lcom/jumio/core/models/PhysicalSelectionModel;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljumio/core/W;)V
    .locals 15
    .param p1    # Lcom/jumio/sdk/enums/JumioCredentialPart;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/jumio/core/data/ScanMode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/jumio/core/models/PhysicalSelectionModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Ljumio/core/W;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jumio/sdk/enums/JumioCredentialPart;",
            "Lcom/jumio/core/data/ScanMode;",
            "Lcom/jumio/core/models/PhysicalSelectionModel;",
            "Ljava/util/List<",
            "+",
            "Lcom/jumio/core/data/ScanMode;",
            ">;",
            "Ljava/util/Map<",
            "Lcom/jumio/core/data/ScanMode;",
            "+",
            "Lcom/jumio/core/data/ScanMode;",
            ">;",
            "Ljava/util/List<",
            "Lcom/jumio/core/models/SupplementalImageConfig;",
            ">;",
            "Ljumio/core/W;",
            ")V"
        }
    .end annotation

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    move-object/from16 v10, p7

    const-string v0, "credentialPart"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mode"

    move-object/from16 v2, p2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectionModel"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extraction"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subExtraction"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "supplementalImages"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cameraChallengeData"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    .line 6
    invoke-direct/range {v0 .. v5}, Lcom/jumio/core/models/ScanPartModel;-><init>(Lcom/jumio/sdk/enums/JumioCredentialPart;Lcom/jumio/core/data/ScanMode;Lcom/jumio/core/data/scan/FileDataInterface;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    iput-object v6, p0, Lcom/jumio/core/models/PhysicalIdScanPartModel;->l:Lcom/jumio/core/models/PhysicalSelectionModel;

    .line 8
    iput-object v7, p0, Lcom/jumio/core/models/PhysicalIdScanPartModel;->m:Ljava/util/List;

    .line 9
    iput-object v8, p0, Lcom/jumio/core/models/PhysicalIdScanPartModel;->n:Ljava/util/Map;

    .line 10
    iput-object v9, p0, Lcom/jumio/core/models/PhysicalIdScanPartModel;->o:Ljava/util/List;

    .line 11
    iput-object v10, p0, Lcom/jumio/core/models/PhysicalIdScanPartModel;->p:Ljumio/core/W;

    .line 12
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 13
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x1

    const/16 v5, 0xa

    const/4 v6, 0x0

    if-eqz v3, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/jumio/core/models/SupplementalImageConfig;

    .line 14
    invoke-virtual {v3}, Lcom/jumio/core/models/SupplementalImageConfig;->getCategory()Lcom/jumio/core/models/SupplementalImageCategory;

    move-result-object v7

    sget-object v8, Ljumio/core/T2;->a:[I

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    aget v7, v8, v7

    if-eq v7, v4, :cond_6

    const/4 v4, 0x2

    if-eq v7, v4, :cond_3

    const/4 v3, 0x3

    if-eq v7, v3, :cond_2

    const/4 v3, 0x4

    if-ne v7, v3, :cond_1

    goto :goto_0

    :cond_1
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    .line 15
    :cond_2
    iget-object v3, p0, Lcom/jumio/core/models/PhysicalIdScanPartModel;->p:Ljumio/core/W;

    .line 16
    iget-object v3, v3, Ljumio/core/W;->d:Ljava/util/List;

    .line 17
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_0

    .line 18
    new-instance v4, Lcom/jumio/core/processor/challenge/CameraChallengeProcessorConfig;

    .line 19
    iget-object v5, p0, Lcom/jumio/core/models/PhysicalIdScanPartModel;->p:Ljumio/core/W;

    .line 20
    new-instance v6, Lcom/jumio/core/processor/ProcessorData;

    .line 21
    iget-object v3, v5, Ljumio/core/W;->c:Ljava/lang/String;

    .line 22
    new-instance v7, Lcom/jumio/core/data/scan/ByteArrayResult;

    new-instance v8, Lcom/jumio/core/data/scan/ByteArrayData;

    invoke-direct {v8}, Lcom/jumio/core/data/scan/ByteArrayData;-><init>()V

    invoke-direct {v7, v8}, Lcom/jumio/core/data/scan/ByteArrayResult;-><init>(Lcom/jumio/core/data/scan/ByteArrayData;)V

    .line 23
    invoke-direct {v6, v3, v7}, Lcom/jumio/core/processor/ProcessorData;-><init>(Ljava/lang/String;Lcom/jumio/core/data/scan/ScanResult;)V

    const/16 v11, 0xc

    const/4 v12, 0x0

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    .line 24
    invoke-direct/range {v4 .. v12}, Lcom/jumio/core/processor/challenge/CameraChallengeProcessorConfig;-><init>(Ljumio/core/W;Lcom/jumio/core/processor/ProcessorData;JJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 25
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 26
    :cond_3
    invoke-virtual {v3}, Lcom/jumio/core/models/SupplementalImageConfig;->getImages()Ljava/util/List;

    move-result-object v3

    .line 27
    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v3, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 28
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 29
    check-cast v5, Lcom/jumio/core/models/SupplementalImage;

    .line 30
    invoke-static {v5}, Lcom/jumio/core/processor/ProcessorImageKt;->asTiltedImage(Lcom/jumio/core/models/SupplementalImage;)Lcom/jumio/core/processor/ProcessorImage$TiltedImage;

    move-result-object v5

    .line 31
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 32
    :cond_4
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_5

    move-object v6, v4

    :cond_5
    if-eqz v6, :cond_0

    .line 33
    new-instance v7, Lcom/jumio/core/processor/tilted/TiltedProcessorConfig;

    .line 34
    new-instance v3, Ljumio/core/U2;

    invoke-direct {v3}, Ljumio/core/U2;-><init>()V

    invoke-static {v6, v3}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v8

    const/4 v13, 0x6

    const/4 v14, 0x0

    const-wide/16 v9, 0x0

    const-wide/16 v11, 0x0

    .line 35
    invoke-direct/range {v7 .. v14}, Lcom/jumio/core/processor/tilted/TiltedProcessorConfig;-><init>(Ljava/util/List;JJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 36
    :cond_6
    invoke-virtual {v3}, Lcom/jumio/core/models/SupplementalImageConfig;->getImages()Ljava/util/List;

    move-result-object v4

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/jumio/core/models/SupplementalImage;

    if-eqz v4, :cond_0

    .line 37
    new-instance v5, Lcom/jumio/core/processor/flash/FlashProcessorConfig;

    .line 38
    invoke-static {v4}, Lcom/jumio/core/processor/ProcessorImageKt;->asFlashImage(Lcom/jumio/core/models/SupplementalImage;)Lcom/jumio/core/processor/ProcessorImage$FlashImage;

    move-result-object v6

    .line 39
    new-instance v7, Lcom/jumio/core/processor/ProcessorData;

    .line 40
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4}, Lcom/jumio/core/models/SupplementalImage;->getClassifier()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "_GZIP"

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 41
    new-instance v8, Lcom/jumio/core/data/scan/ByteArrayResult;

    new-instance v9, Lcom/jumio/core/data/scan/ByteArrayData;

    invoke-direct {v9}, Lcom/jumio/core/data/scan/ByteArrayData;-><init>()V

    invoke-direct {v8, v9}, Lcom/jumio/core/data/scan/ByteArrayResult;-><init>(Lcom/jumio/core/data/scan/ByteArrayData;)V

    .line 42
    invoke-direct {v7, v4, v8}, Lcom/jumio/core/processor/ProcessorData;-><init>(Ljava/lang/String;Lcom/jumio/core/data/scan/ScanResult;)V

    .line 43
    invoke-virtual {v3}, Lcom/jumio/core/models/SupplementalImageConfig;->getManualEnabled()Z

    move-result v12

    const/16 v13, 0xc

    const/4 v14, 0x0

    const-wide/16 v8, 0x0

    const-wide/16 v10, 0x0

    .line 44
    invoke-direct/range {v5 .. v14}, Lcom/jumio/core/processor/flash/FlashProcessorConfig;-><init>(Lcom/jumio/core/processor/ProcessorImage$FlashImage;Lcom/jumio/core/processor/ProcessorData;JJZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 45
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 46
    :cond_7
    iput-object v1, p0, Lcom/jumio/core/models/PhysicalIdScanPartModel;->s:Ljava/util/ArrayList;

    .line 47
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/jumio/core/data/image/ImageResult;

    invoke-direct {v3, v6, v4, v6}, Lcom/jumio/core/data/image/ImageResult;-><init>(Lcom/jumio/commons/camera/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v2, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    .line 48
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 49
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_8
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    instance-of v8, v7, Lcom/jumio/core/processor/SingleImageProcessorConfig;

    if-eqz v8, :cond_8

    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 50
    :cond_9
    new-instance v1, Ljava/util/ArrayList;

    invoke-static {v3, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v1, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 51
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_a

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 52
    check-cast v7, Lcom/jumio/core/processor/SingleImageProcessorConfig;

    .line 53
    invoke-interface {v7}, Lcom/jumio/core/processor/SingleImageProcessorConfig;->getImage()Lcom/jumio/core/processor/ProcessorImage;

    move-result-object v7

    invoke-interface {v7}, Lcom/jumio/core/processor/ProcessorImage;->getClassifier()Ljava/lang/String;

    move-result-object v7

    new-instance v8, Lcom/jumio/core/data/image/ImageResult;

    invoke-direct {v8, v6, v4, v6}, Lcom/jumio/core/data/image/ImageResult;-><init>(Lcom/jumio/commons/camera/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v7, v8}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v7

    .line 54
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 55
    :cond_a
    invoke-static {v2, v1}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v1

    .line 56
    iget-object v2, p0, Lcom/jumio/core/models/PhysicalIdScanPartModel;->s:Ljava/util/ArrayList;

    .line 57
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 58
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_b
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_c

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    instance-of v8, v7, Lcom/jumio/core/processor/MultiImageProcessorConfig;

    if-eqz v8, :cond_b

    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 59
    :cond_c
    new-instance v2, Ljava/util/ArrayList;

    invoke-static {v3, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v2, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 60
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_e

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 61
    check-cast v7, Lcom/jumio/core/processor/MultiImageProcessorConfig;

    .line 62
    invoke-interface {v7}, Lcom/jumio/core/processor/MultiImageProcessorConfig;->getImages()Ljava/util/List;

    move-result-object v7

    .line 63
    new-instance v8, Ljava/util/ArrayList;

    invoke-static {v7, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 64
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_6
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_d

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .line 65
    check-cast v9, Lcom/jumio/core/processor/ProcessorImage;

    .line 66
    invoke-interface {v9}, Lcom/jumio/core/processor/ProcessorImage;->getClassifier()Ljava/lang/String;

    move-result-object v9

    new-instance v10, Lcom/jumio/core/data/image/ImageResult;

    invoke-direct {v10, v6, v4, v6}, Lcom/jumio/core/data/image/ImageResult;-><init>(Lcom/jumio/commons/camera/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v9, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    .line 67
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    .line 68
    :cond_d
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 69
    :cond_e
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->flatten(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    .line 70
    invoke-static {v1, v2}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v1

    .line 71
    iget-object v2, p0, Lcom/jumio/core/models/PhysicalIdScanPartModel;->s:Ljava/util/ArrayList;

    .line 72
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 73
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_f
    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_10

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    instance-of v6, v4, Lcom/jumio/core/processor/SingleDataProcessorConfig;

    if-eqz v6, :cond_f

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7

    .line 74
    :cond_10
    new-instance v2, Ljava/util/ArrayList;

    invoke-static {v3, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 75
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_8
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_11

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 76
    check-cast v4, Lcom/jumio/core/processor/SingleDataProcessorConfig;

    .line 77
    invoke-interface {v4}, Lcom/jumio/core/processor/SingleDataProcessorConfig;->getProcessorData()Lcom/jumio/core/processor/ProcessorData;

    move-result-object v5

    invoke-virtual {v5}, Lcom/jumio/core/processor/ProcessorData;->getClassifier()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4}, Lcom/jumio/core/processor/SingleDataProcessorConfig;->getProcessorData()Lcom/jumio/core/processor/ProcessorData;

    move-result-object v4

    invoke-virtual {v4}, Lcom/jumio/core/processor/ProcessorData;->getData()Lcom/jumio/core/data/scan/ScanResult;

    move-result-object v4

    invoke-static {v5, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    .line 78
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    .line 79
    :cond_11
    invoke-static {v1, v2}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v1

    iput-object v1, p0, Lcom/jumio/core/models/PhysicalIdScanPartModel;->q:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/jumio/sdk/enums/JumioCredentialPart;Lcom/jumio/core/data/ScanMode;Lcom/jumio/core/models/PhysicalSelectionModel;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljumio/core/W;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 8

    and-int/lit8 v0, p8, 0x8

    if-eqz v0, :cond_0

    .line 1
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p4

    :cond_0
    move-object v4, p4

    and-int/lit8 p4, p8, 0x10

    if-eqz p4, :cond_1

    .line 2
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object p5

    :cond_1
    move-object v5, p5

    and-int/lit8 p4, p8, 0x20

    if-eqz p4, :cond_2

    .line 3
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p6

    :cond_2
    move-object v6, p6

    and-int/lit8 p4, p8, 0x40

    if-eqz p4, :cond_3

    .line 4
    new-instance p4, Ljumio/core/W;

    invoke-direct {p4}, Ljumio/core/W;-><init>()V

    move-object v7, p4

    :goto_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    goto :goto_1

    :cond_3
    move-object v7, p7

    goto :goto_0

    .line 5
    :goto_1
    invoke-direct/range {v0 .. v7}, Lcom/jumio/core/models/PhysicalIdScanPartModel;-><init>(Lcom/jumio/sdk/enums/JumioCredentialPart;Lcom/jumio/core/data/ScanMode;Lcom/jumio/core/models/PhysicalSelectionModel;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljumio/core/W;)V

    return-void
.end method

.method public static synthetic setDataUploaded$default(Lcom/jumio/core/models/PhysicalIdScanPartModel;Ljava/lang/String;Lcom/jumio/core/models/automation/AutomationModel;ILjava/lang/Object;)Lkotlin/Unit;
    .locals 8

    .line 1
    .line 2
    and-int/lit8 p3, p3, 0x2

    .line 3
    .line 4
    if-eqz p3, :cond_0

    .line 5
    .line 6
    new-instance v0, Lcom/jumio/core/models/automation/AutomationModel;

    .line 7
    .line 8
    const/16 v6, 0x1f

    .line 9
    const/4 v7, 0x0

    .line 10
    const/4 v1, 0x0

    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x0

    .line 14
    const/4 v5, 0x0

    .line 15
    .line 16
    .line 17
    invoke-direct/range {v0 .. v7}, Lcom/jumio/core/models/automation/AutomationModel;-><init>(Lcom/jumio/core/models/automation/AutomationModel$DecisionType;Lcom/jumio/core/models/automation/RejectReason;Lcom/jumio/core/models/automation/ExtractedData;Ljava/lang/String;Lcom/jumio/core/models/automation/NfcProperties;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 18
    move-object p2, v0

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->setDataUploaded(Ljava/lang/String;Lcom/jumio/core/models/automation/AutomationModel;)Lkotlin/Unit;

    .line 22
    move-result-object p0

    .line 23
    return-object p0
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
.end method


# virtual methods
.method public clear()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/models/PhysicalIdScanPartModel;->q:Ljava/util/Map;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    move-result v1

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    check-cast v1, Lcom/jumio/core/data/scan/ScanResult;

    .line 23
    .line 24
    .line 25
    invoke-interface {v1}, Lcom/jumio/core/data/scan/ScanResult;->getData()Lcom/jumio/core/data/scan/DataInterface;

    .line 26
    move-result-object v2

    .line 27
    .line 28
    .line 29
    invoke-interface {v2}, Lcom/jumio/core/data/scan/DataInterface;->clear()V

    .line 30
    .line 31
    sget-object v2, Lcom/jumio/core/data/scan/DataState;->TODO:Lcom/jumio/core/data/scan/DataState;

    .line 32
    .line 33
    .line 34
    invoke-interface {v1, v2}, Lcom/jumio/core/data/scan/ScanResult;->setState(Lcom/jumio/core/data/scan/DataState;)V

    .line 35
    const/4 v2, 0x0

    .line 36
    .line 37
    .line 38
    invoke-interface {v1, v2}, Lcom/jumio/core/data/scan/ScanResult;->setAutomationModel(Lcom/jumio/core/models/automation/AutomationModel;)V

    .line 39
    goto :goto_0

    .line 40
    .line 41
    .line 42
    :cond_0
    invoke-super {p0}, Lcom/jumio/core/models/ScanPartModel;->clear()V

    .line 43
    return-void
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
.end method

.method public final firstAutomationModelMatchingDecision(Lcom/jumio/core/models/automation/AutomationModel$DecisionType;)Lcom/jumio/core/models/automation/AutomationModel;
    .locals 4
    .param p1    # Lcom/jumio/core/models/automation/AutomationModel$DecisionType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    const-string v0, "decisionType"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/jumio/core/models/PhysicalIdScanPartModel;->q:Ljava/util/Map;

    .line 8
    .line 9
    .line 10
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    move-result v1

    .line 20
    const/4 v2, 0x0

    .line 21
    .line 22
    if-eqz v1, :cond_3

    .line 23
    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    check-cast v1, Ljava/util/Map$Entry;

    .line 29
    .line 30
    .line 31
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 32
    move-result-object v1

    .line 33
    move-object v3, v1

    .line 34
    .line 35
    check-cast v3, Lcom/jumio/core/data/scan/ScanResult;

    .line 36
    .line 37
    if-eqz v3, :cond_2

    .line 38
    .line 39
    .line 40
    invoke-interface {v3}, Lcom/jumio/core/data/scan/ScanResult;->getAutomationModel()Lcom/jumio/core/models/automation/AutomationModel;

    .line 41
    move-result-object v3

    .line 42
    .line 43
    if-eqz v3, :cond_1

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3}, Lcom/jumio/core/models/automation/AutomationModel;->getDecisionType()Lcom/jumio/core/models/automation/AutomationModel$DecisionType;

    .line 47
    move-result-object v3

    .line 48
    goto :goto_0

    .line 49
    :cond_1
    move-object v3, v2

    .line 50
    .line 51
    :goto_0
    if-ne v3, p1, :cond_2

    .line 52
    goto :goto_1

    .line 53
    :cond_2
    move-object v1, v2

    .line 54
    .line 55
    :goto_1
    check-cast v1, Lcom/jumio/core/data/scan/ScanResult;

    .line 56
    .line 57
    if-eqz v1, :cond_0

    .line 58
    goto :goto_2

    .line 59
    :cond_3
    move-object v1, v2

    .line 60
    .line 61
    :goto_2
    if-nez v1, :cond_4

    .line 62
    move-object v1, v2

    .line 63
    .line 64
    :cond_4
    if-eqz v1, :cond_5

    .line 65
    .line 66
    .line 67
    invoke-interface {v1}, Lcom/jumio/core/data/scan/ScanResult;->getAutomationModel()Lcom/jumio/core/models/automation/AutomationModel;

    .line 68
    move-result-object p1

    .line 69
    return-object p1

    .line 70
    :cond_5
    return-object v2
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
.end method

.method public final firstAutomationModelMatchingRejectReasonCode(Ljava/lang/String;)Lcom/jumio/core/models/automation/AutomationModel;
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    const-string v0, "code"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/jumio/core/models/PhysicalIdScanPartModel;->q:Ljava/util/Map;

    .line 8
    .line 9
    .line 10
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    move-result v1

    .line 20
    const/4 v2, 0x0

    .line 21
    .line 22
    if-eqz v1, :cond_3

    .line 23
    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    check-cast v1, Ljava/util/Map$Entry;

    .line 29
    .line 30
    .line 31
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 32
    move-result-object v1

    .line 33
    move-object v3, v1

    .line 34
    .line 35
    check-cast v3, Lcom/jumio/core/data/scan/ScanResult;

    .line 36
    .line 37
    if-eqz v3, :cond_2

    .line 38
    .line 39
    .line 40
    invoke-interface {v3}, Lcom/jumio/core/data/scan/ScanResult;->getAutomationModel()Lcom/jumio/core/models/automation/AutomationModel;

    .line 41
    move-result-object v3

    .line 42
    .line 43
    if-eqz v3, :cond_1

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3}, Lcom/jumio/core/models/automation/AutomationModel;->getRejectReason()Lcom/jumio/core/models/automation/RejectReason;

    .line 47
    move-result-object v3

    .line 48
    .line 49
    if-eqz v3, :cond_1

    .line 50
    .line 51
    .line 52
    invoke-virtual {v3}, Lcom/jumio/core/models/automation/RejectReason;->getCode()Ljava/lang/String;

    .line 53
    move-result-object v3

    .line 54
    goto :goto_0

    .line 55
    :cond_1
    move-object v3, v2

    .line 56
    .line 57
    .line 58
    :goto_0
    invoke-static {v3, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 59
    move-result v3

    .line 60
    .line 61
    if-eqz v3, :cond_2

    .line 62
    goto :goto_1

    .line 63
    :cond_2
    move-object v1, v2

    .line 64
    .line 65
    :goto_1
    check-cast v1, Lcom/jumio/core/data/scan/ScanResult;

    .line 66
    .line 67
    if-eqz v1, :cond_0

    .line 68
    goto :goto_2

    .line 69
    :cond_3
    move-object v1, v2

    .line 70
    .line 71
    :goto_2
    if-nez v1, :cond_4

    .line 72
    move-object v1, v2

    .line 73
    .line 74
    :cond_4
    if-eqz v1, :cond_5

    .line 75
    .line 76
    .line 77
    invoke-interface {v1}, Lcom/jumio/core/data/scan/ScanResult;->getAutomationModel()Lcom/jumio/core/models/automation/AutomationModel;

    .line 78
    move-result-object p1

    .line 79
    return-object p1

    .line 80
    :cond_5
    return-object v2
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
.end method

.method public final firstImageDataMatchingDecision(Lcom/jumio/core/models/automation/AutomationModel$DecisionType;)Lcom/jumio/commons/camera/ImageDataInterface;
    .locals 5
    .param p1    # Lcom/jumio/core/models/automation/AutomationModel$DecisionType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    const-string v0, "decisionType"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/jumio/core/models/PhysicalIdScanPartModel;->q:Ljava/util/Map;

    .line 8
    .line 9
    .line 10
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    move-result v1

    .line 20
    const/4 v2, 0x0

    .line 21
    .line 22
    if-eqz v1, :cond_3

    .line 23
    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    check-cast v1, Ljava/util/Map$Entry;

    .line 29
    .line 30
    .line 31
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 32
    move-result-object v1

    .line 33
    move-object v3, v1

    .line 34
    .line 35
    check-cast v3, Lcom/jumio/core/data/scan/ScanResult;

    .line 36
    .line 37
    instance-of v4, v3, Lcom/jumio/core/data/image/ImageResult;

    .line 38
    .line 39
    if-eqz v4, :cond_2

    .line 40
    .line 41
    check-cast v3, Lcom/jumio/core/data/image/ImageResult;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v3}, Lcom/jumio/core/data/image/ImageResult;->getAutomationModel()Lcom/jumio/core/models/automation/AutomationModel;

    .line 45
    move-result-object v3

    .line 46
    .line 47
    if-eqz v3, :cond_1

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3}, Lcom/jumio/core/models/automation/AutomationModel;->getDecisionType()Lcom/jumio/core/models/automation/AutomationModel$DecisionType;

    .line 51
    move-result-object v3

    .line 52
    goto :goto_0

    .line 53
    :cond_1
    move-object v3, v2

    .line 54
    .line 55
    :goto_0
    if-ne v3, p1, :cond_2

    .line 56
    goto :goto_1

    .line 57
    :cond_2
    move-object v1, v2

    .line 58
    .line 59
    :goto_1
    check-cast v1, Lcom/jumio/core/data/scan/ScanResult;

    .line 60
    .line 61
    if-eqz v1, :cond_0

    .line 62
    goto :goto_2

    .line 63
    :cond_3
    move-object v1, v2

    .line 64
    .line 65
    :goto_2
    instance-of p1, v1, Lcom/jumio/core/data/image/ImageResult;

    .line 66
    .line 67
    if-nez p1, :cond_4

    .line 68
    move-object v1, v2

    .line 69
    .line 70
    :cond_4
    check-cast v1, Lcom/jumio/core/data/image/ImageResult;

    .line 71
    .line 72
    if-eqz v1, :cond_5

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1}, Lcom/jumio/core/data/image/ImageResult;->getData()Lcom/jumio/commons/camera/a;

    .line 76
    move-result-object p1

    .line 77
    return-object p1

    .line 78
    :cond_5
    return-object v2
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
.end method

.method public getAutomationModel()Lcom/jumio/core/models/automation/AutomationModel;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/models/PhysicalIdScanPartModel;->q:Ljava/util/Map;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/jumio/core/models/ScanPartModel;->getCredentialPart()Lcom/jumio/sdk/enums/JumioCredentialPart;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    .line 13
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    check-cast v0, Lcom/jumio/core/data/scan/ScanResult;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    .line 21
    invoke-interface {v0}, Lcom/jumio/core/data/scan/ScanResult;->getAutomationModel()Lcom/jumio/core/models/automation/AutomationModel;

    .line 22
    move-result-object v0

    .line 23
    return-object v0

    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    return-object v0
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
.end method

.method public final getCameraChallengeData()Ljumio/core/W;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/models/PhysicalIdScanPartModel;->p:Ljumio/core/W;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public getDataState()Lcom/jumio/core/data/scan/DataState;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/jumio/core/models/PhysicalIdScanPartModel;->q:Ljava/util/Map;

    invoke-virtual {p0}, Lcom/jumio/core/models/ScanPartModel;->getCredentialPart()Lcom/jumio/sdk/enums/JumioCredentialPart;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jumio/core/data/scan/ScanResult;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lcom/jumio/core/data/scan/ScanResult;->getState()Lcom/jumio/core/data/scan/DataState;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    :goto_0
    sget-object v0, Lcom/jumio/core/data/scan/DataState;->TODO:Lcom/jumio/core/data/scan/DataState;

    return-object v0
.end method

.method public declared-synchronized getDataState(Ljava/lang/String;)Lcom/jumio/core/data/scan/DataState;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    monitor-enter p0

    :try_start_0
    const-string v0, "classifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0, p1}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->scanResultForClassifier(Ljava/lang/String;)Lcom/jumio/core/data/scan/ScanResult;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/jumio/core/data/scan/ScanResult;->getState()Lcom/jumio/core/data/scan/DataState;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    monitor-exit p0

    const/4 p1, 0x0

    return-object p1

    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final getDocumentData()Lcom/jumio/core/models/DocumentDataModel;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/models/PhysicalIdScanPartModel;->r:Lcom/jumio/core/models/DocumentDataModel;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public final getExtraction()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/jumio/core/data/ScanMode;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/models/PhysicalIdScanPartModel;->m:Ljava/util/List;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public getFileData()Lcom/jumio/core/data/scan/FileDataInterface;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/models/PhysicalIdScanPartModel;->q:Ljava/util/Map;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/jumio/core/models/ScanPartModel;->getCredentialPart()Lcom/jumio/sdk/enums/JumioCredentialPart;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    .line 13
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    instance-of v1, v0, Lcom/jumio/core/data/image/ImageResult;

    .line 17
    const/4 v2, 0x0

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    check-cast v0, Lcom/jumio/core/data/image/ImageResult;

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move-object v0, v2

    .line 24
    .line 25
    :goto_0
    if-nez v0, :cond_1

    .line 26
    .line 27
    new-instance v0, Lcom/jumio/core/data/image/ImageResult;

    .line 28
    const/4 v1, 0x1

    .line 29
    .line 30
    .line 31
    invoke-direct {v0, v2, v1, v2}, Lcom/jumio/core/data/image/ImageResult;-><init>(Lcom/jumio/commons/camera/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-virtual {v0}, Lcom/jumio/core/data/image/ImageResult;->getData()Lcom/jumio/commons/camera/a;

    .line 35
    move-result-object v0

    .line 36
    return-object v0
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
.end method

.method public final getFormat()Lcom/jumio/core/data/document/DocumentFormat;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/models/PhysicalIdScanPartModel;->l:Lcom/jumio/core/models/PhysicalSelectionModel;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/jumio/core/models/PhysicalSelectionModel;->getVariant()Lcom/jumio/core/data/document/DocumentVariant;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/jumio/core/data/document/DocumentVariant;->getFormat()Lcom/jumio/core/data/document/DocumentFormat;

    .line 10
    move-result-object v0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public getHasData()Z
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/jumio/core/models/ScanPartModel;->getHasData()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    iget-object v0, p0, Lcom/jumio/core/models/PhysicalIdScanPartModel;->q:Ljava/util/Map;

    .line 9
    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 12
    move-result v1

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    goto :goto_0

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    .line 26
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    move-result v1

    .line 28
    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    .line 32
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    move-result-object v1

    .line 34
    .line 35
    check-cast v1, Ljava/util/Map$Entry;

    .line 36
    .line 37
    .line 38
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 39
    move-result-object v1

    .line 40
    .line 41
    check-cast v1, Lcom/jumio/core/data/scan/ScanResult;

    .line 42
    .line 43
    .line 44
    invoke-interface {v1}, Lcom/jumio/core/data/scan/ScanResult;->getHasData()Z

    .line 45
    move-result v1

    .line 46
    .line 47
    if-nez v1, :cond_1

    .line 48
    goto :goto_1

    .line 49
    :cond_2
    :goto_0
    const/4 v0, 0x1

    .line 50
    return v0

    .line 51
    :cond_3
    :goto_1
    const/4 v0, 0x0

    .line 52
    return v0
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
.end method

.method public final getProcessorConfigs()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/jumio/core/processor/ImageProcessorConfig<",
            "*>;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/models/PhysicalIdScanPartModel;->s:Ljava/util/ArrayList;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public final getSelectionModel()Lcom/jumio/core/models/PhysicalSelectionModel;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/models/PhysicalIdScanPartModel;->l:Lcom/jumio/core/models/PhysicalSelectionModel;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public final getSubExtraction()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lcom/jumio/core/data/ScanMode;",
            "Lcom/jumio/core/data/ScanMode;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/models/PhysicalIdScanPartModel;->n:Ljava/util/Map;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public final getSupplementalImages()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/jumio/core/models/SupplementalImageConfig;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/models/PhysicalIdScanPartModel;->o:Ljava/util/List;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public final imageDataForClassifier(Ljava/lang/String;)Lcom/jumio/commons/camera/a;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    const-string v0, "classifier"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->scanResultForClassifier(Ljava/lang/String;)Lcom/jumio/core/data/scan/ScanResult;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    instance-of v0, p1, Lcom/jumio/core/data/image/ImageResult;

    .line 12
    const/4 v1, 0x0

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    check-cast p1, Lcom/jumio/core/data/image/ImageResult;

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-object p1, v1

    .line 19
    .line 20
    :goto_0
    if-eqz p1, :cond_1

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/jumio/core/data/image/ImageResult;->getData()Lcom/jumio/commons/camera/a;

    .line 24
    move-result-object p1

    .line 25
    return-object p1

    .line 26
    :cond_1
    return-object v1
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
.end method

.method public final imageForClassifier(Ljava/lang/String;)Lcom/jumio/core/processor/ProcessorImage;
    .locals 5
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    const-string v0, "classifier"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/jumio/core/models/PhysicalIdScanPartModel;->s:Ljava/util/ArrayList;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x0

    .line 17
    .line 18
    if-eqz v1, :cond_6

    .line 19
    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    check-cast v1, Lcom/jumio/core/processor/ImageProcessorConfig;

    .line 25
    .line 26
    instance-of v3, v1, Lcom/jumio/core/processor/SingleImageProcessorConfig;

    .line 27
    .line 28
    if-eqz v3, :cond_2

    .line 29
    move-object v3, v1

    .line 30
    .line 31
    check-cast v3, Lcom/jumio/core/processor/SingleImageProcessorConfig;

    .line 32
    .line 33
    .line 34
    invoke-interface {v3}, Lcom/jumio/core/processor/SingleImageProcessorConfig;->getImage()Lcom/jumio/core/processor/ProcessorImage;

    .line 35
    move-result-object v3

    .line 36
    .line 37
    .line 38
    invoke-interface {v3}, Lcom/jumio/core/processor/ProcessorImage;->getClassifier()Ljava/lang/String;

    .line 39
    move-result-object v3

    .line 40
    .line 41
    .line 42
    invoke-static {v3, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    move-result v3

    .line 44
    .line 45
    if-eqz v3, :cond_1

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    move-object v1, v2

    .line 48
    .line 49
    :goto_0
    check-cast v1, Lcom/jumio/core/processor/SingleImageProcessorConfig;

    .line 50
    .line 51
    if-eqz v1, :cond_5

    .line 52
    .line 53
    .line 54
    invoke-interface {v1}, Lcom/jumio/core/processor/SingleImageProcessorConfig;->getImage()Lcom/jumio/core/processor/ProcessorImage;

    .line 55
    move-result-object v2

    .line 56
    goto :goto_1

    .line 57
    .line 58
    :cond_2
    instance-of v3, v1, Lcom/jumio/core/processor/MultiImageProcessorConfig;

    .line 59
    .line 60
    if-eqz v3, :cond_5

    .line 61
    .line 62
    check-cast v1, Lcom/jumio/core/processor/MultiImageProcessorConfig;

    .line 63
    .line 64
    .line 65
    invoke-interface {v1}, Lcom/jumio/core/processor/MultiImageProcessorConfig;->getImages()Ljava/util/List;

    .line 66
    move-result-object v1

    .line 67
    .line 68
    .line 69
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 70
    move-result-object v1

    .line 71
    .line 72
    .line 73
    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    move-result v3

    .line 75
    .line 76
    if-eqz v3, :cond_4

    .line 77
    .line 78
    .line 79
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    move-result-object v3

    .line 81
    move-object v4, v3

    .line 82
    .line 83
    check-cast v4, Lcom/jumio/core/processor/ProcessorImage;

    .line 84
    .line 85
    .line 86
    invoke-interface {v4}, Lcom/jumio/core/processor/ProcessorImage;->getClassifier()Ljava/lang/String;

    .line 87
    move-result-object v4

    .line 88
    .line 89
    .line 90
    invoke-static {v4, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 91
    move-result v4

    .line 92
    .line 93
    if-eqz v4, :cond_3

    .line 94
    move-object v2, v3

    .line 95
    .line 96
    :cond_4
    check-cast v2, Lcom/jumio/core/processor/ProcessorImage;

    .line 97
    .line 98
    :cond_5
    :goto_1
    if-eqz v2, :cond_0

    .line 99
    :cond_6
    return-object v2
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
.end method

.method public isComplete()Z
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/jumio/core/models/ScanPartModel;->isComplete()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    iget-object v0, p0, Lcom/jumio/core/models/PhysicalIdScanPartModel;->q:Ljava/util/Map;

    .line 9
    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 12
    move-result v1

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    goto :goto_0

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    .line 26
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    move-result v1

    .line 28
    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    .line 32
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    move-result-object v1

    .line 34
    .line 35
    check-cast v1, Ljava/util/Map$Entry;

    .line 36
    .line 37
    .line 38
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 39
    move-result-object v1

    .line 40
    .line 41
    check-cast v1, Lcom/jumio/core/data/scan/ScanResult;

    .line 42
    .line 43
    .line 44
    invoke-interface {v1}, Lcom/jumio/core/data/scan/ScanResult;->isComplete()Z

    .line 45
    move-result v1

    .line 46
    .line 47
    if-nez v1, :cond_1

    .line 48
    goto :goto_1

    .line 49
    :cond_2
    :goto_0
    const/4 v0, 0x1

    .line 50
    return v0

    .line 51
    :cond_3
    :goto_1
    const/4 v0, 0x0

    .line 52
    return v0
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
.end method

.method public final scanResultForClassifier(Ljava/lang/String;)Lcom/jumio/core/data/scan/ScanResult;
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/jumio/core/data/scan/ScanResult<",
            "*>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    const-string v0, "classifier"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/jumio/core/models/PhysicalIdScanPartModel;->q:Ljava/util/Map;

    .line 8
    .line 9
    .line 10
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    move-result v1

    .line 20
    const/4 v2, 0x0

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    move-result-object v1

    .line 27
    move-object v3, v1

    .line 28
    .line 29
    check-cast v3, Ljava/util/Map$Entry;

    .line 30
    .line 31
    .line 32
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 33
    move-result-object v3

    .line 34
    .line 35
    .line 36
    invoke-static {v3, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    move-result v3

    .line 38
    .line 39
    if-eqz v3, :cond_0

    .line 40
    goto :goto_0

    .line 41
    :cond_1
    move-object v1, v2

    .line 42
    .line 43
    :goto_0
    check-cast v1, Ljava/util/Map$Entry;

    .line 44
    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    .line 48
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 49
    move-result-object p1

    .line 50
    .line 51
    check-cast p1, Lcom/jumio/core/data/scan/ScanResult;

    .line 52
    return-object p1

    .line 53
    :cond_2
    return-object v2
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
.end method

.method public setAutomationModel(Lcom/jumio/core/models/automation/AutomationModel;)V
    .locals 2
    .param p1    # Lcom/jumio/core/models/automation/AutomationModel;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/models/PhysicalIdScanPartModel;->q:Ljava/util/Map;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/jumio/core/models/ScanPartModel;->getCredentialPart()Lcom/jumio/sdk/enums/JumioCredentialPart;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    .line 13
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    check-cast v0, Lcom/jumio/core/data/scan/ScanResult;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    .line 21
    invoke-interface {v0, p1}, Lcom/jumio/core/data/scan/ScanResult;->setAutomationModel(Lcom/jumio/core/models/automation/AutomationModel;)V

    .line 22
    :cond_0
    return-void
    .line 23
    .line 24
.end method

.method public setDataState(Lcom/jumio/core/data/scan/DataState;)V
    .locals 2
    .param p1    # Lcom/jumio/core/data/scan/DataState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/jumio/core/models/PhysicalIdScanPartModel;->q:Ljava/util/Map;

    invoke-virtual {p0}, Lcom/jumio/core/models/ScanPartModel;->getCredentialPart()Lcom/jumio/sdk/enums/JumioCredentialPart;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jumio/core/data/scan/ScanResult;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/jumio/core/data/scan/ScanResult;->setState(Lcom/jumio/core/data/scan/DataState;)V

    :cond_0
    return-void
.end method

.method public declared-synchronized setDataState(Ljava/lang/String;Lcom/jumio/core/data/scan/DataState;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/jumio/core/data/scan/DataState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    monitor-enter p0

    :try_start_0
    const-string v0, "classifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0, p1}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->scanResultForClassifier(Ljava/lang/String;)Lcom/jumio/core/data/scan/ScanResult;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-interface {p1}, Lcom/jumio/core/data/scan/ScanResult;->getState()Lcom/jumio/core/data/scan/DataState;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/jumio/core/data/scan/DataState;->canTransitionTo(Lcom/jumio/core/data/scan/DataState;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    .line 3
    invoke-interface {p1, p2}, Lcom/jumio/core/data/scan/ScanResult;->setState(Lcom/jumio/core/data/scan/DataState;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final setDataUploaded(Ljava/lang/String;Lcom/jumio/core/models/automation/AutomationModel;)Lkotlin/Unit;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/jumio/core/models/automation/AutomationModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    const-string v0, "classifier"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "automationModel"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->scanResultForClassifier(Ljava/lang/String;)Lcom/jumio/core/data/scan/ScanResult;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    .line 19
    invoke-interface {p1}, Lcom/jumio/core/data/scan/ScanResult;->getState()Lcom/jumio/core/data/scan/DataState;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    sget-object v1, Lcom/jumio/core/data/scan/DataState;->UPLOADED:Lcom/jumio/core/data/scan/DataState;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lcom/jumio/core/data/scan/DataState;->canTransitionTo(Lcom/jumio/core/data/scan/DataState;)Z

    .line 26
    move-result v0

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    .line 31
    invoke-interface {p1, v1}, Lcom/jumio/core/data/scan/ScanResult;->setState(Lcom/jumio/core/data/scan/DataState;)V

    .line 32
    .line 33
    .line 34
    invoke-interface {p1, p2}, Lcom/jumio/core/data/scan/ScanResult;->setAutomationModel(Lcom/jumio/core/models/automation/AutomationModel;)V

    .line 35
    .line 36
    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 37
    return-object p1

    .line 38
    :cond_1
    const/4 p1, 0x0

    .line 39
    return-object p1
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method

.method public final setDocumentData(Lcom/jumio/core/models/DocumentDataModel;)V
    .locals 0
    .param p1    # Lcom/jumio/core/models/DocumentDataModel;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/jumio/core/models/PhysicalIdScanPartModel;->r:Lcom/jumio/core/models/DocumentDataModel;

    .line 3
    return-void
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public final setExtraction(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/jumio/core/data/ScanMode;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "<set-?>"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/jumio/core/models/PhysicalIdScanPartModel;->m:Ljava/util/List;

    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public final setSelectionModel(Lcom/jumio/core/models/PhysicalSelectionModel;)V
    .locals 1
    .param p1    # Lcom/jumio/core/models/PhysicalSelectionModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "<set-?>"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/jumio/core/models/PhysicalIdScanPartModel;->l:Lcom/jumio/core/models/PhysicalSelectionModel;

    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public final setSubExtraction(Ljava/util/Map;)V
    .locals 1
    .param p1    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lcom/jumio/core/data/ScanMode;",
            "+",
            "Lcom/jumio/core/data/ScanMode;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "<set-?>"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/jumio/core/models/PhysicalIdScanPartModel;->n:Ljava/util/Map;

    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method
