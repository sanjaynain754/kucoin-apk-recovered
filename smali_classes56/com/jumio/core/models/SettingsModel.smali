.class public final Lcom/jumio/core/models/SettingsModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jumio/core/model/StaticModel;


# annotations
.annotation runtime Lcom/jumio/commons/PersistWith;
    value = "SettingsModel"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jumio/core/models/SettingsModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0011\n\u0002\u0010!\n\u0002\u0008<\n\u0002\u0010\u0000\n\u0002\u0008\u0004\u0008\u0087\u0008\u0018\u0000 `2\u00020\u0001:\u0001`B\u009b\u0002\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010\u001d\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u000e\u0012\u000e\u0008\u0002\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00080 \u0012\u0008\u0008\u0002\u0010!\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\"\u0010#J\t\u0010?\u001a\u00020\u0003H\u00c6\u0003J\t\u0010@\u001a\u00020\u0005H\u00c6\u0003J\t\u0010A\u001a\u00020\u0005H\u00c6\u0003J\t\u0010B\u001a\u00020\u0008H\u00c6\u0003J\t\u0010C\u001a\u00020\u0008H\u00c6\u0003J\t\u0010D\u001a\u00020\u0005H\u00c6\u0003J\t\u0010E\u001a\u00020\u0005H\u00c6\u0003J\t\u0010F\u001a\u00020\u0005H\u00c6\u0003J\t\u0010G\u001a\u00020\u000eH\u00c6\u0003J\t\u0010H\u001a\u00020\u0005H\u00c6\u0003J\t\u0010I\u001a\u00020\u0005H\u00c6\u0003J\t\u0010J\u001a\u00020\u0005H\u00c6\u0003J\t\u0010K\u001a\u00020\u0005H\u00c6\u0003J\t\u0010L\u001a\u00020\u000eH\u00c6\u0003J\t\u0010M\u001a\u00020\u000eH\u00c6\u0003J\t\u0010N\u001a\u00020\u0008H\u00c6\u0003J\t\u0010O\u001a\u00020\u0005H\u00c6\u0003J\t\u0010P\u001a\u00020\u0005H\u00c6\u0003J\t\u0010Q\u001a\u00020\u0005H\u00c6\u0003J\t\u0010R\u001a\u00020\u000eH\u00c6\u0003J\t\u0010S\u001a\u00020\u000eH\u00c6\u0003J\t\u0010T\u001a\u00020\u0005H\u00c6\u0003J\t\u0010U\u001a\u00020\u000eH\u00c6\u0003J\t\u0010V\u001a\u00020\u0005H\u00c6\u0003J\t\u0010W\u001a\u00020\u000eH\u00c6\u0003J\u000f\u0010X\u001a\u0008\u0012\u0004\u0012\u00020\u00080 H\u00c6\u0003J\t\u0010Y\u001a\u00020\u0008H\u00c6\u0003J\u009d\u0002\u0010Z\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\n\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00052\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u001d\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u000e2\u000e\u0008\u0002\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00080 2\u0008\u0008\u0002\u0010!\u001a\u00020\u0008H\u00c6\u0001J\u0013\u0010[\u001a\u00020\u00052\u0008\u0010\\\u001a\u0004\u0018\u00010]H\u00d6\u0003J\t\u0010^\u001a\u00020\u000eH\u00d6\u0001J\t\u0010_\u001a\u00020\u0008H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010%R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0004\u0010&R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010&R\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010)R\u0011\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010)R\u0011\u0010\n\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010&R\u0011\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010&R\u0011\u0010\u000c\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010&R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010,R\u0011\u0010\u000f\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008-\u0010&R\u0011\u0010\u0010\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008.\u0010&R\u0011\u0010\u0011\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008/\u0010&R\u0011\u0010\u0012\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010&R\u0011\u0010\u0013\u001a\u00020\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00080\u0010,R\u0011\u0010\u0014\u001a\u00020\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00081\u0010,R\u0011\u0010\u0015\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00082\u0010)R\u0011\u0010\u0016\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00083\u0010&R\u0011\u0010\u0017\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00084\u0010&R\u0011\u0010\u0018\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00085\u0010&R\u0011\u0010\u0019\u001a\u00020\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00086\u0010,R\u0011\u0010\u001a\u001a\u00020\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00087\u0010,R\u0011\u0010\u001b\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00088\u0010&R\u0011\u0010\u001c\u001a\u00020\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00089\u0010,R\u0011\u0010\u001d\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008:\u0010&R\u0011\u0010\u001e\u001a\u00020\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008;\u0010,R\u0017\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00080 \u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008<\u0010=R\u0011\u0010!\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008>\u0010)\u00a8\u0006a"
    }
    d2 = {
        "Lcom/jumio/core/models/SettingsModel;",
        "Lcom/jumio/core/model/StaticModel;",
        "serverTimestamp",
        "",
        "isBrandingEnabled",
        "",
        "returnImages",
        "countryForIp",
        "",
        "stateForIp",
        "isAdditionalDataPointsEnabled",
        "isLoaded",
        "isAnalyticsEnabled",
        "maxLivenessImages",
        "",
        "useCamera1",
        "cameraConnection",
        "keyPinningEnabled",
        "isInstantFeedbackEnabled",
        "automationMaxRetries",
        "maxFileUploadSize",
        "workflowDefinitionKey",
        "automaticBarcodeExtraction",
        "skipDocTypeSelection",
        "docClassifierOverride",
        "throttlingLimit",
        "imageCompressionQuality",
        "skipStartScreen",
        "startMaxLoadingTime",
        "sensorDataCollectionEnabled",
        "sensorSamplingTime",
        "docProofAcquireModes",
        "",
        "faceCaptureMode",
        "<init>",
        "(JZZLjava/lang/String;Ljava/lang/String;ZZZIZZZZIILjava/lang/String;ZZZIIZIZILjava/util/List;Ljava/lang/String;)V",
        "getServerTimestamp",
        "()J",
        "()Z",
        "getReturnImages",
        "getCountryForIp",
        "()Ljava/lang/String;",
        "getStateForIp",
        "getMaxLivenessImages",
        "()I",
        "getUseCamera1",
        "getCameraConnection",
        "getKeyPinningEnabled",
        "getAutomationMaxRetries",
        "getMaxFileUploadSize",
        "getWorkflowDefinitionKey",
        "getAutomaticBarcodeExtraction",
        "getSkipDocTypeSelection",
        "getDocClassifierOverride",
        "getThrottlingLimit",
        "getImageCompressionQuality",
        "getSkipStartScreen",
        "getStartMaxLoadingTime",
        "getSensorDataCollectionEnabled",
        "getSensorSamplingTime",
        "getDocProofAcquireModes",
        "()Ljava/util/List;",
        "getFaceCaptureMode",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "component16",
        "component17",
        "component18",
        "component19",
        "component20",
        "component21",
        "component22",
        "component23",
        "component24",
        "component25",
        "component26",
        "component27",
        "copy",
        "equals",
        "other",
        "",
        "hashCode",
        "toString",
        "Companion",
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


# static fields
.field public static final Companion:Lcom/jumio/core/models/SettingsModel$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final A:Ljava/lang/String;

.field public final a:J

.field public final b:Z

.field public final c:Z

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Z

.field public final g:Z

.field public final h:Z

.field public final i:I

.field public final j:Z

.field public final k:Z

.field public final l:Z

.field public final m:Z

.field public final n:I

.field public final o:I

.field public final p:Ljava/lang/String;

.field public final q:Z

.field public final r:Z

.field public final s:Z

.field public final t:I

.field public final u:I

.field public final v:Z

.field public final w:I

.field public final x:Z

.field public final y:I

.field public final z:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/jumio/core/models/SettingsModel$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/jumio/core/models/SettingsModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/jumio/core/models/SettingsModel;->Companion:Lcom/jumio/core/models/SettingsModel$Companion;

    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public constructor <init>()V
    .locals 31

    const v29, 0x7ffffff

    const/16 v30, 0x0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    move-object/from16 v0, p0

    .line 1
    invoke-direct/range {v0 .. v30}, Lcom/jumio/core/models/SettingsModel;-><init>(JZZLjava/lang/String;Ljava/lang/String;ZZZIZZZZIILjava/lang/String;ZZZIIZIZILjava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(JZZLjava/lang/String;Ljava/lang/String;ZZZIZZZZIILjava/lang/String;ZZZIIZIZILjava/util/List;Ljava/lang/String;)V
    .locals 4
    .param p5    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p17    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p27    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p28    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JZZ",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "ZZZIZZZZII",
            "Ljava/lang/String;",
            "ZZZIIZIZI",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p17

    move-object/from16 v1, p27

    move-object/from16 v2, p28

    const-string v3, "countryForIp"

    invoke-static {p5, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "stateForIp"

    invoke-static {p6, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "workflowDefinitionKey"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "docProofAcquireModes"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "faceCaptureMode"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, Lcom/jumio/core/models/SettingsModel;->a:J

    .line 4
    iput-boolean p3, p0, Lcom/jumio/core/models/SettingsModel;->b:Z

    .line 5
    iput-boolean p4, p0, Lcom/jumio/core/models/SettingsModel;->c:Z

    .line 6
    iput-object p5, p0, Lcom/jumio/core/models/SettingsModel;->d:Ljava/lang/String;

    .line 7
    iput-object p6, p0, Lcom/jumio/core/models/SettingsModel;->e:Ljava/lang/String;

    .line 8
    iput-boolean p7, p0, Lcom/jumio/core/models/SettingsModel;->f:Z

    .line 9
    iput-boolean p8, p0, Lcom/jumio/core/models/SettingsModel;->g:Z

    .line 10
    iput-boolean p9, p0, Lcom/jumio/core/models/SettingsModel;->h:Z

    .line 11
    iput p10, p0, Lcom/jumio/core/models/SettingsModel;->i:I

    .line 12
    iput-boolean p11, p0, Lcom/jumio/core/models/SettingsModel;->j:Z

    move/from16 p1, p12

    .line 13
    iput-boolean p1, p0, Lcom/jumio/core/models/SettingsModel;->k:Z

    move/from16 p1, p13

    .line 14
    iput-boolean p1, p0, Lcom/jumio/core/models/SettingsModel;->l:Z

    move/from16 p1, p14

    .line 15
    iput-boolean p1, p0, Lcom/jumio/core/models/SettingsModel;->m:Z

    move/from16 p1, p15

    .line 16
    iput p1, p0, Lcom/jumio/core/models/SettingsModel;->n:I

    move/from16 p1, p16

    .line 17
    iput p1, p0, Lcom/jumio/core/models/SettingsModel;->o:I

    .line 18
    iput-object v0, p0, Lcom/jumio/core/models/SettingsModel;->p:Ljava/lang/String;

    move/from16 p1, p18

    .line 19
    iput-boolean p1, p0, Lcom/jumio/core/models/SettingsModel;->q:Z

    move/from16 p1, p19

    .line 20
    iput-boolean p1, p0, Lcom/jumio/core/models/SettingsModel;->r:Z

    move/from16 p1, p20

    .line 21
    iput-boolean p1, p0, Lcom/jumio/core/models/SettingsModel;->s:Z

    move/from16 p1, p21

    .line 22
    iput p1, p0, Lcom/jumio/core/models/SettingsModel;->t:I

    move/from16 p1, p22

    .line 23
    iput p1, p0, Lcom/jumio/core/models/SettingsModel;->u:I

    move/from16 p1, p23

    .line 24
    iput-boolean p1, p0, Lcom/jumio/core/models/SettingsModel;->v:Z

    move/from16 p1, p24

    .line 25
    iput p1, p0, Lcom/jumio/core/models/SettingsModel;->w:I

    move/from16 p1, p25

    .line 26
    iput-boolean p1, p0, Lcom/jumio/core/models/SettingsModel;->x:Z

    move/from16 p1, p26

    .line 27
    iput p1, p0, Lcom/jumio/core/models/SettingsModel;->y:I

    .line 28
    iput-object v1, p0, Lcom/jumio/core/models/SettingsModel;->z:Ljava/util/List;

    .line 29
    iput-object v2, p0, Lcom/jumio/core/models/SettingsModel;->A:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(JZZLjava/lang/String;Ljava/lang/String;ZZZIZZZZIILjava/lang/String;ZZZIIZIZILjava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 25

    move/from16 v0, p29

    const/4 v1, 0x1

    and-int/lit8 v2, v0, 0x1

    if-eqz v2, :cond_0

    const-wide/16 v2, 0x0

    goto :goto_0

    :cond_0
    move-wide/from16 v2, p1

    :goto_0
    and-int/lit8 v4, v0, 0x2

    if-eqz v4, :cond_1

    move v4, v1

    goto :goto_1

    :cond_1
    move/from16 v4, p3

    :goto_1
    and-int/lit8 v5, v0, 0x4

    if-eqz v5, :cond_2

    const/4 v5, 0x0

    goto :goto_2

    :cond_2
    move/from16 v5, p4

    :goto_2
    and-int/lit8 v7, v0, 0x8

    const-string v8, ""

    if-eqz v7, :cond_3

    move-object v7, v8

    goto :goto_3

    :cond_3
    move-object/from16 v7, p5

    :goto_3
    and-int/lit8 v9, v0, 0x10

    if-eqz v9, :cond_4

    move-object v9, v8

    goto :goto_4

    :cond_4
    move-object/from16 v9, p6

    :goto_4
    and-int/lit8 v10, v0, 0x20

    if-eqz v10, :cond_5

    const/4 v10, 0x0

    goto :goto_5

    :cond_5
    move/from16 v10, p7

    :goto_5
    and-int/lit8 v11, v0, 0x40

    if-eqz v11, :cond_6

    const/4 v11, 0x0

    goto :goto_6

    :cond_6
    move/from16 v11, p8

    :goto_6
    and-int/lit16 v12, v0, 0x80

    if-eqz v12, :cond_7

    const/4 v12, 0x0

    goto :goto_7

    :cond_7
    move/from16 v12, p9

    :goto_7
    and-int/lit16 v13, v0, 0x100

    if-eqz v13, :cond_8

    const/16 v13, 0xa

    goto :goto_8

    :cond_8
    move/from16 v13, p10

    :goto_8
    and-int/lit16 v14, v0, 0x200

    if-eqz v14, :cond_9

    const/4 v14, 0x0

    goto :goto_9

    :cond_9
    move/from16 v14, p11

    :goto_9
    and-int/lit16 v15, v0, 0x400

    if-eqz v15, :cond_a

    const/4 v15, 0x0

    goto :goto_a

    :cond_a
    move/from16 v15, p12

    :goto_a
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_b

    const/4 v1, 0x1

    goto :goto_b

    :cond_b
    move/from16 v1, p13

    :goto_b
    and-int/lit16 v6, v0, 0x1000

    if-eqz v6, :cond_c

    const/4 v6, 0x0

    goto :goto_c

    :cond_c
    move/from16 v6, p14

    :goto_c
    move/from16 p2, v1

    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_d

    const/4 v1, 0x0

    goto :goto_d

    :cond_d
    move/from16 v1, p15

    :goto_d
    move/from16 p3, v1

    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_e

    const/high16 v1, 0x300000

    goto :goto_e

    :cond_e
    move/from16 v1, p16

    :goto_e
    const v16, 0x8000

    and-int v16, v0, v16

    if-eqz v16, :cond_f

    goto :goto_f

    :cond_f
    move-object/from16 v8, p17

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, v0, v16

    if-eqz v16, :cond_10

    const/16 v16, 0x1

    goto :goto_10

    :cond_10
    move/from16 v16, p18

    :goto_10
    const/high16 v17, 0x20000

    and-int v17, v0, v17

    if-eqz v17, :cond_11

    const/16 v17, 0x0

    goto :goto_11

    :cond_11
    move/from16 v17, p19

    :goto_11
    const/high16 v18, 0x40000

    and-int v18, v0, v18

    if-eqz v18, :cond_12

    const/16 v18, 0x0

    goto :goto_12

    :cond_12
    move/from16 v18, p20

    :goto_12
    const/high16 v19, 0x80000

    and-int v19, v0, v19

    if-eqz v19, :cond_13

    const/16 v19, 0x12c

    goto :goto_13

    :cond_13
    move/from16 v19, p21

    :goto_13
    const/high16 v20, 0x100000

    and-int v20, v0, v20

    if-eqz v20, :cond_14

    .line 30
    sget-object v20, Ljumio/core/M3;->a:Ljava/util/List;

    const/16 v0, 0x64

    move/from16 p4, v1

    int-to-double v0, v0

    const-wide v20, 0x3feccccccccccccdL    # 0.9

    mul-double v0, v0, v20

    double-to-int v0, v0

    goto :goto_14

    :cond_14
    move/from16 p4, v1

    move/from16 v0, p22

    :goto_14
    const/high16 v1, 0x200000

    and-int v1, p29, v1

    if-eqz v1, :cond_15

    const/4 v1, 0x0

    goto :goto_15

    :cond_15
    move/from16 v1, p23

    :goto_15
    const/high16 v20, 0x400000

    and-int v20, p29, v20

    if-eqz v20, :cond_16

    const/16 v20, 0x1388

    goto :goto_16

    :cond_16
    move/from16 v20, p24

    :goto_16
    const/high16 v21, 0x800000

    and-int v21, p29, v21

    if-eqz v21, :cond_17

    const/16 v21, 0x0

    goto :goto_17

    :cond_17
    move/from16 v21, p25

    :goto_17
    const/high16 v22, 0x1000000

    and-int v22, p29, v22

    if-eqz v22, :cond_18

    .line 31
    const-string v22, "100"

    invoke-static/range {v22 .. v22}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v22

    goto :goto_18

    :cond_18
    move/from16 v22, p26

    :goto_18
    const/high16 v23, 0x2000000

    and-int v23, p29, v23

    if-eqz v23, :cond_19

    .line 32
    sget-object v23, Ljumio/core/M3;->a:Ljava/util/List;

    goto :goto_19

    :cond_19
    move-object/from16 v23, p27

    :goto_19
    const/high16 v24, 0x4000000

    and-int v24, p29, v24

    if-eqz v24, :cond_1a

    .line 33
    const-string v24, "front"

    move-object/from16 p29, v24

    :goto_1a
    move-object/from16 p1, p0

    move/from16 p14, p2

    move/from16 p16, p3

    move/from16 p17, p4

    move/from16 p23, v0

    move/from16 p24, v1

    move-wide/from16 p2, v2

    move/from16 p4, v4

    move/from16 p5, v5

    move/from16 p15, v6

    move-object/from16 p6, v7

    move-object/from16 p18, v8

    move-object/from16 p7, v9

    move/from16 p8, v10

    move/from16 p9, v11

    move/from16 p10, v12

    move/from16 p11, v13

    move/from16 p12, v14

    move/from16 p13, v15

    move/from16 p19, v16

    move/from16 p20, v17

    move/from16 p21, v18

    move/from16 p22, v19

    move/from16 p25, v20

    move/from16 p26, v21

    move/from16 p27, v22

    move-object/from16 p28, v23

    goto :goto_1b

    :cond_1a
    move-object/from16 p29, p28

    goto :goto_1a

    .line 34
    :goto_1b
    invoke-direct/range {p1 .. p29}, Lcom/jumio/core/models/SettingsModel;-><init>(JZZLjava/lang/String;Ljava/lang/String;ZZZIZZZZIILjava/lang/String;ZZZIIZIZILjava/util/List;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/jumio/core/models/SettingsModel;JZZLjava/lang/String;Ljava/lang/String;ZZZIZZZZIILjava/lang/String;ZZZIIZIZILjava/util/List;Ljava/lang/String;ILjava/lang/Object;)Lcom/jumio/core/models/SettingsModel;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    move/from16 v1, p29

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-wide v2, v0, Lcom/jumio/core/models/SettingsModel;->a:J

    goto :goto_0

    :cond_0
    move-wide/from16 v2, p1

    :goto_0
    and-int/lit8 v4, v1, 0x2

    if-eqz v4, :cond_1

    iget-boolean v4, v0, Lcom/jumio/core/models/SettingsModel;->b:Z

    goto :goto_1

    :cond_1
    move/from16 v4, p3

    :goto_1
    and-int/lit8 v5, v1, 0x4

    if-eqz v5, :cond_2

    iget-boolean v5, v0, Lcom/jumio/core/models/SettingsModel;->c:Z

    goto :goto_2

    :cond_2
    move/from16 v5, p4

    :goto_2
    and-int/lit8 v6, v1, 0x8

    if-eqz v6, :cond_3

    iget-object v6, v0, Lcom/jumio/core/models/SettingsModel;->d:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v6, p5

    :goto_3
    and-int/lit8 v7, v1, 0x10

    if-eqz v7, :cond_4

    iget-object v7, v0, Lcom/jumio/core/models/SettingsModel;->e:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v7, p6

    :goto_4
    and-int/lit8 v8, v1, 0x20

    if-eqz v8, :cond_5

    iget-boolean v8, v0, Lcom/jumio/core/models/SettingsModel;->f:Z

    goto :goto_5

    :cond_5
    move/from16 v8, p7

    :goto_5
    and-int/lit8 v9, v1, 0x40

    if-eqz v9, :cond_6

    iget-boolean v9, v0, Lcom/jumio/core/models/SettingsModel;->g:Z

    goto :goto_6

    :cond_6
    move/from16 v9, p8

    :goto_6
    and-int/lit16 v10, v1, 0x80

    if-eqz v10, :cond_7

    iget-boolean v10, v0, Lcom/jumio/core/models/SettingsModel;->h:Z

    goto :goto_7

    :cond_7
    move/from16 v10, p9

    :goto_7
    and-int/lit16 v11, v1, 0x100

    if-eqz v11, :cond_8

    iget v11, v0, Lcom/jumio/core/models/SettingsModel;->i:I

    goto :goto_8

    :cond_8
    move/from16 v11, p10

    :goto_8
    and-int/lit16 v12, v1, 0x200

    if-eqz v12, :cond_9

    iget-boolean v12, v0, Lcom/jumio/core/models/SettingsModel;->j:Z

    goto :goto_9

    :cond_9
    move/from16 v12, p11

    :goto_9
    and-int/lit16 v13, v1, 0x400

    if-eqz v13, :cond_a

    iget-boolean v13, v0, Lcom/jumio/core/models/SettingsModel;->k:Z

    goto :goto_a

    :cond_a
    move/from16 v13, p12

    :goto_a
    and-int/lit16 v14, v1, 0x800

    if-eqz v14, :cond_b

    iget-boolean v14, v0, Lcom/jumio/core/models/SettingsModel;->l:Z

    goto :goto_b

    :cond_b
    move/from16 v14, p13

    :goto_b
    and-int/lit16 v15, v1, 0x1000

    if-eqz v15, :cond_c

    iget-boolean v15, v0, Lcom/jumio/core/models/SettingsModel;->m:Z

    goto :goto_c

    :cond_c
    move/from16 v15, p14

    :goto_c
    move-wide/from16 v16, v2

    and-int/lit16 v2, v1, 0x2000

    if-eqz v2, :cond_d

    iget v2, v0, Lcom/jumio/core/models/SettingsModel;->n:I

    goto :goto_d

    :cond_d
    move/from16 v2, p15

    :goto_d
    and-int/lit16 v3, v1, 0x4000

    if-eqz v3, :cond_e

    iget v3, v0, Lcom/jumio/core/models/SettingsModel;->o:I

    goto :goto_e

    :cond_e
    move/from16 v3, p16

    :goto_e
    const v18, 0x8000

    and-int v18, v1, v18

    if-eqz v18, :cond_f

    iget-object v1, v0, Lcom/jumio/core/models/SettingsModel;->p:Ljava/lang/String;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p17

    :goto_f
    const/high16 v18, 0x10000

    and-int v18, p29, v18

    move-object/from16 p1, v1

    if-eqz v18, :cond_10

    iget-boolean v1, v0, Lcom/jumio/core/models/SettingsModel;->q:Z

    goto :goto_10

    :cond_10
    move/from16 v1, p18

    :goto_10
    const/high16 v18, 0x20000

    and-int v18, p29, v18

    move/from16 p2, v1

    if-eqz v18, :cond_11

    iget-boolean v1, v0, Lcom/jumio/core/models/SettingsModel;->r:Z

    goto :goto_11

    :cond_11
    move/from16 v1, p19

    :goto_11
    const/high16 v18, 0x40000

    and-int v18, p29, v18

    move/from16 p3, v1

    if-eqz v18, :cond_12

    iget-boolean v1, v0, Lcom/jumio/core/models/SettingsModel;->s:Z

    goto :goto_12

    :cond_12
    move/from16 v1, p20

    :goto_12
    const/high16 v18, 0x80000

    and-int v18, p29, v18

    move/from16 p4, v1

    if-eqz v18, :cond_13

    iget v1, v0, Lcom/jumio/core/models/SettingsModel;->t:I

    goto :goto_13

    :cond_13
    move/from16 v1, p21

    :goto_13
    const/high16 v18, 0x100000

    and-int v18, p29, v18

    move/from16 p5, v1

    if-eqz v18, :cond_14

    iget v1, v0, Lcom/jumio/core/models/SettingsModel;->u:I

    goto :goto_14

    :cond_14
    move/from16 v1, p22

    :goto_14
    const/high16 v18, 0x200000

    and-int v18, p29, v18

    move/from16 p6, v1

    if-eqz v18, :cond_15

    iget-boolean v1, v0, Lcom/jumio/core/models/SettingsModel;->v:Z

    goto :goto_15

    :cond_15
    move/from16 v1, p23

    :goto_15
    const/high16 v18, 0x400000

    and-int v18, p29, v18

    move/from16 p7, v1

    if-eqz v18, :cond_16

    iget v1, v0, Lcom/jumio/core/models/SettingsModel;->w:I

    goto :goto_16

    :cond_16
    move/from16 v1, p24

    :goto_16
    const/high16 v18, 0x800000

    and-int v18, p29, v18

    move/from16 p8, v1

    if-eqz v18, :cond_17

    iget-boolean v1, v0, Lcom/jumio/core/models/SettingsModel;->x:Z

    goto :goto_17

    :cond_17
    move/from16 v1, p25

    :goto_17
    const/high16 v18, 0x1000000

    and-int v18, p29, v18

    move/from16 p9, v1

    if-eqz v18, :cond_18

    iget v1, v0, Lcom/jumio/core/models/SettingsModel;->y:I

    goto :goto_18

    :cond_18
    move/from16 v1, p26

    :goto_18
    const/high16 v18, 0x2000000

    and-int v18, p29, v18

    move/from16 p10, v1

    if-eqz v18, :cond_19

    iget-object v1, v0, Lcom/jumio/core/models/SettingsModel;->z:Ljava/util/List;

    goto :goto_19

    :cond_19
    move-object/from16 v1, p27

    :goto_19
    const/high16 v18, 0x4000000

    and-int v18, p29, v18

    if-eqz v18, :cond_1a

    move-object/from16 p11, v1

    iget-object v1, v0, Lcom/jumio/core/models/SettingsModel;->A:Ljava/lang/String;

    move-object/from16 p28, p11

    move-object/from16 p29, v1

    :goto_1a
    move-object/from16 p18, p1

    move/from16 p19, p2

    move/from16 p20, p3

    move/from16 p21, p4

    move/from16 p22, p5

    move/from16 p23, p6

    move/from16 p24, p7

    move/from16 p25, p8

    move/from16 p26, p9

    move/from16 p27, p10

    move-object/from16 p1, v0

    move/from16 p16, v2

    move/from16 p17, v3

    move/from16 p4, v4

    move/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move/from16 p8, v8

    move/from16 p9, v9

    move/from16 p10, v10

    move/from16 p11, v11

    move/from16 p12, v12

    move/from16 p13, v13

    move/from16 p14, v14

    move/from16 p15, v15

    move-wide/from16 p2, v16

    goto :goto_1b

    :cond_1a
    move-object/from16 p29, p28

    move-object/from16 p28, v1

    goto :goto_1a

    :goto_1b
    invoke-virtual/range {p1 .. p29}, Lcom/jumio/core/models/SettingsModel;->copy(JZZLjava/lang/String;Ljava/lang/String;ZZZIZZZZIILjava/lang/String;ZZZIIZIZILjava/util/List;Ljava/lang/String;)Lcom/jumio/core/models/SettingsModel;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/jumio/core/models/SettingsModel;->a:J

    .line 3
    return-wide v0
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

.method public final component10()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/jumio/core/models/SettingsModel;->j:Z

    .line 3
    return v0
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

.method public final component11()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/jumio/core/models/SettingsModel;->k:Z

    .line 3
    return v0
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

.method public final component12()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/jumio/core/models/SettingsModel;->l:Z

    .line 3
    return v0
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

.method public final component13()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/jumio/core/models/SettingsModel;->m:Z

    .line 3
    return v0
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

.method public final component14()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/jumio/core/models/SettingsModel;->n:I

    .line 3
    return v0
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

.method public final component15()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/jumio/core/models/SettingsModel;->o:I

    .line 3
    return v0
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

.method public final component16()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/models/SettingsModel;->p:Ljava/lang/String;

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

.method public final component17()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/jumio/core/models/SettingsModel;->q:Z

    .line 3
    return v0
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

.method public final component18()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/jumio/core/models/SettingsModel;->r:Z

    .line 3
    return v0
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

.method public final component19()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/jumio/core/models/SettingsModel;->s:Z

    .line 3
    return v0
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

.method public final component2()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/jumio/core/models/SettingsModel;->b:Z

    .line 3
    return v0
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

.method public final component20()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/jumio/core/models/SettingsModel;->t:I

    .line 3
    return v0
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

.method public final component21()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/jumio/core/models/SettingsModel;->u:I

    .line 3
    return v0
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

.method public final component22()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/jumio/core/models/SettingsModel;->v:Z

    .line 3
    return v0
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

.method public final component23()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/jumio/core/models/SettingsModel;->w:I

    .line 3
    return v0
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

.method public final component24()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/jumio/core/models/SettingsModel;->x:Z

    .line 3
    return v0
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

.method public final component25()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/jumio/core/models/SettingsModel;->y:I

    .line 3
    return v0
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

.method public final component26()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/models/SettingsModel;->z:Ljava/util/List;

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

.method public final component27()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/models/SettingsModel;->A:Ljava/lang/String;

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

.method public final component3()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/jumio/core/models/SettingsModel;->c:Z

    .line 3
    return v0
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

.method public final component4()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/models/SettingsModel;->d:Ljava/lang/String;

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

.method public final component5()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/models/SettingsModel;->e:Ljava/lang/String;

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

.method public final component6()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/jumio/core/models/SettingsModel;->f:Z

    .line 3
    return v0
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

.method public final component7()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/jumio/core/models/SettingsModel;->g:Z

    .line 3
    return v0
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

.method public final component8()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/jumio/core/models/SettingsModel;->h:Z

    .line 3
    return v0
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

.method public final component9()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/jumio/core/models/SettingsModel;->i:I

    .line 3
    return v0
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

.method public final copy(JZZLjava/lang/String;Ljava/lang/String;ZZZIZZZZIILjava/lang/String;ZZZIIZIZILjava/util/List;Ljava/lang/String;)Lcom/jumio/core/models/SettingsModel;
    .locals 30
    .param p5    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p17    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p27    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p28    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JZZ",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "ZZZIZZZZII",
            "Ljava/lang/String;",
            "ZZZIIZIZI",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lcom/jumio/core/models/SettingsModel;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "countryForIp"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stateForIp"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workflowDefinitionKey"

    move-object/from16 v1, p17

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "docProofAcquireModes"

    move-object/from16 v2, p27

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "faceCaptureMode"

    move-object/from16 v3, p28

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/jumio/core/models/SettingsModel;

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    move/from16 v12, p11

    move/from16 v13, p12

    move/from16 v14, p13

    move/from16 v15, p14

    move/from16 v16, p15

    move/from16 v17, p16

    move-object/from16 v18, p17

    move/from16 v19, p18

    move/from16 v20, p19

    move/from16 v21, p20

    move/from16 v22, p21

    move/from16 v23, p22

    move/from16 v24, p23

    move/from16 v25, p24

    move/from16 v26, p25

    move/from16 v27, p26

    move-object/from16 v28, v2

    move-object/from16 v29, v3

    move-wide/from16 v2, p1

    invoke-direct/range {v1 .. v29}, Lcom/jumio/core/models/SettingsModel;-><init>(JZZLjava/lang/String;Ljava/lang/String;ZZZIZZZZIILjava/lang/String;ZZZIIZIZILjava/util/List;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    if-ne p0, p1, :cond_0

    .line 4
    return v0

    .line 5
    .line 6
    :cond_0
    instance-of v1, p1, Lcom/jumio/core/models/SettingsModel;

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    return v2

    .line 11
    .line 12
    :cond_1
    check-cast p1, Lcom/jumio/core/models/SettingsModel;

    .line 13
    .line 14
    iget-wide v3, p0, Lcom/jumio/core/models/SettingsModel;->a:J

    .line 15
    .line 16
    iget-wide v5, p1, Lcom/jumio/core/models/SettingsModel;->a:J

    .line 17
    .line 18
    cmp-long v1, v3, v5

    .line 19
    .line 20
    if-eqz v1, :cond_2

    .line 21
    return v2

    .line 22
    .line 23
    :cond_2
    iget-boolean v1, p0, Lcom/jumio/core/models/SettingsModel;->b:Z

    .line 24
    .line 25
    iget-boolean v3, p1, Lcom/jumio/core/models/SettingsModel;->b:Z

    .line 26
    .line 27
    if-eq v1, v3, :cond_3

    .line 28
    return v2

    .line 29
    .line 30
    :cond_3
    iget-boolean v1, p0, Lcom/jumio/core/models/SettingsModel;->c:Z

    .line 31
    .line 32
    iget-boolean v3, p1, Lcom/jumio/core/models/SettingsModel;->c:Z

    .line 33
    .line 34
    if-eq v1, v3, :cond_4

    .line 35
    return v2

    .line 36
    .line 37
    :cond_4
    iget-object v1, p0, Lcom/jumio/core/models/SettingsModel;->d:Ljava/lang/String;

    .line 38
    .line 39
    iget-object v3, p1, Lcom/jumio/core/models/SettingsModel;->d:Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    move-result v1

    .line 44
    .line 45
    if-nez v1, :cond_5

    .line 46
    return v2

    .line 47
    .line 48
    :cond_5
    iget-object v1, p0, Lcom/jumio/core/models/SettingsModel;->e:Ljava/lang/String;

    .line 49
    .line 50
    iget-object v3, p1, Lcom/jumio/core/models/SettingsModel;->e:Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    move-result v1

    .line 55
    .line 56
    if-nez v1, :cond_6

    .line 57
    return v2

    .line 58
    .line 59
    :cond_6
    iget-boolean v1, p0, Lcom/jumio/core/models/SettingsModel;->f:Z

    .line 60
    .line 61
    iget-boolean v3, p1, Lcom/jumio/core/models/SettingsModel;->f:Z

    .line 62
    .line 63
    if-eq v1, v3, :cond_7

    .line 64
    return v2

    .line 65
    .line 66
    :cond_7
    iget-boolean v1, p0, Lcom/jumio/core/models/SettingsModel;->g:Z

    .line 67
    .line 68
    iget-boolean v3, p1, Lcom/jumio/core/models/SettingsModel;->g:Z

    .line 69
    .line 70
    if-eq v1, v3, :cond_8

    .line 71
    return v2

    .line 72
    .line 73
    :cond_8
    iget-boolean v1, p0, Lcom/jumio/core/models/SettingsModel;->h:Z

    .line 74
    .line 75
    iget-boolean v3, p1, Lcom/jumio/core/models/SettingsModel;->h:Z

    .line 76
    .line 77
    if-eq v1, v3, :cond_9

    .line 78
    return v2

    .line 79
    .line 80
    :cond_9
    iget v1, p0, Lcom/jumio/core/models/SettingsModel;->i:I

    .line 81
    .line 82
    iget v3, p1, Lcom/jumio/core/models/SettingsModel;->i:I

    .line 83
    .line 84
    if-eq v1, v3, :cond_a

    .line 85
    return v2

    .line 86
    .line 87
    :cond_a
    iget-boolean v1, p0, Lcom/jumio/core/models/SettingsModel;->j:Z

    .line 88
    .line 89
    iget-boolean v3, p1, Lcom/jumio/core/models/SettingsModel;->j:Z

    .line 90
    .line 91
    if-eq v1, v3, :cond_b

    .line 92
    return v2

    .line 93
    .line 94
    :cond_b
    iget-boolean v1, p0, Lcom/jumio/core/models/SettingsModel;->k:Z

    .line 95
    .line 96
    iget-boolean v3, p1, Lcom/jumio/core/models/SettingsModel;->k:Z

    .line 97
    .line 98
    if-eq v1, v3, :cond_c

    .line 99
    return v2

    .line 100
    .line 101
    :cond_c
    iget-boolean v1, p0, Lcom/jumio/core/models/SettingsModel;->l:Z

    .line 102
    .line 103
    iget-boolean v3, p1, Lcom/jumio/core/models/SettingsModel;->l:Z

    .line 104
    .line 105
    if-eq v1, v3, :cond_d

    .line 106
    return v2

    .line 107
    .line 108
    :cond_d
    iget-boolean v1, p0, Lcom/jumio/core/models/SettingsModel;->m:Z

    .line 109
    .line 110
    iget-boolean v3, p1, Lcom/jumio/core/models/SettingsModel;->m:Z

    .line 111
    .line 112
    if-eq v1, v3, :cond_e

    .line 113
    return v2

    .line 114
    .line 115
    :cond_e
    iget v1, p0, Lcom/jumio/core/models/SettingsModel;->n:I

    .line 116
    .line 117
    iget v3, p1, Lcom/jumio/core/models/SettingsModel;->n:I

    .line 118
    .line 119
    if-eq v1, v3, :cond_f

    .line 120
    return v2

    .line 121
    .line 122
    :cond_f
    iget v1, p0, Lcom/jumio/core/models/SettingsModel;->o:I

    .line 123
    .line 124
    iget v3, p1, Lcom/jumio/core/models/SettingsModel;->o:I

    .line 125
    .line 126
    if-eq v1, v3, :cond_10

    .line 127
    return v2

    .line 128
    .line 129
    :cond_10
    iget-object v1, p0, Lcom/jumio/core/models/SettingsModel;->p:Ljava/lang/String;

    .line 130
    .line 131
    iget-object v3, p1, Lcom/jumio/core/models/SettingsModel;->p:Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 135
    move-result v1

    .line 136
    .line 137
    if-nez v1, :cond_11

    .line 138
    return v2

    .line 139
    .line 140
    :cond_11
    iget-boolean v1, p0, Lcom/jumio/core/models/SettingsModel;->q:Z

    .line 141
    .line 142
    iget-boolean v3, p1, Lcom/jumio/core/models/SettingsModel;->q:Z

    .line 143
    .line 144
    if-eq v1, v3, :cond_12

    .line 145
    return v2

    .line 146
    .line 147
    :cond_12
    iget-boolean v1, p0, Lcom/jumio/core/models/SettingsModel;->r:Z

    .line 148
    .line 149
    iget-boolean v3, p1, Lcom/jumio/core/models/SettingsModel;->r:Z

    .line 150
    .line 151
    if-eq v1, v3, :cond_13

    .line 152
    return v2

    .line 153
    .line 154
    :cond_13
    iget-boolean v1, p0, Lcom/jumio/core/models/SettingsModel;->s:Z

    .line 155
    .line 156
    iget-boolean v3, p1, Lcom/jumio/core/models/SettingsModel;->s:Z

    .line 157
    .line 158
    if-eq v1, v3, :cond_14

    .line 159
    return v2

    .line 160
    .line 161
    :cond_14
    iget v1, p0, Lcom/jumio/core/models/SettingsModel;->t:I

    .line 162
    .line 163
    iget v3, p1, Lcom/jumio/core/models/SettingsModel;->t:I

    .line 164
    .line 165
    if-eq v1, v3, :cond_15

    .line 166
    return v2

    .line 167
    .line 168
    :cond_15
    iget v1, p0, Lcom/jumio/core/models/SettingsModel;->u:I

    .line 169
    .line 170
    iget v3, p1, Lcom/jumio/core/models/SettingsModel;->u:I

    .line 171
    .line 172
    if-eq v1, v3, :cond_16

    .line 173
    return v2

    .line 174
    .line 175
    :cond_16
    iget-boolean v1, p0, Lcom/jumio/core/models/SettingsModel;->v:Z

    .line 176
    .line 177
    iget-boolean v3, p1, Lcom/jumio/core/models/SettingsModel;->v:Z

    .line 178
    .line 179
    if-eq v1, v3, :cond_17

    .line 180
    return v2

    .line 181
    .line 182
    :cond_17
    iget v1, p0, Lcom/jumio/core/models/SettingsModel;->w:I

    .line 183
    .line 184
    iget v3, p1, Lcom/jumio/core/models/SettingsModel;->w:I

    .line 185
    .line 186
    if-eq v1, v3, :cond_18

    .line 187
    return v2

    .line 188
    .line 189
    :cond_18
    iget-boolean v1, p0, Lcom/jumio/core/models/SettingsModel;->x:Z

    .line 190
    .line 191
    iget-boolean v3, p1, Lcom/jumio/core/models/SettingsModel;->x:Z

    .line 192
    .line 193
    if-eq v1, v3, :cond_19

    .line 194
    return v2

    .line 195
    .line 196
    :cond_19
    iget v1, p0, Lcom/jumio/core/models/SettingsModel;->y:I

    .line 197
    .line 198
    iget v3, p1, Lcom/jumio/core/models/SettingsModel;->y:I

    .line 199
    .line 200
    if-eq v1, v3, :cond_1a

    .line 201
    return v2

    .line 202
    .line 203
    :cond_1a
    iget-object v1, p0, Lcom/jumio/core/models/SettingsModel;->z:Ljava/util/List;

    .line 204
    .line 205
    iget-object v3, p1, Lcom/jumio/core/models/SettingsModel;->z:Ljava/util/List;

    .line 206
    .line 207
    .line 208
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 209
    move-result v1

    .line 210
    .line 211
    if-nez v1, :cond_1b

    .line 212
    return v2

    .line 213
    .line 214
    :cond_1b
    iget-object v1, p0, Lcom/jumio/core/models/SettingsModel;->A:Ljava/lang/String;

    .line 215
    .line 216
    iget-object p1, p1, Lcom/jumio/core/models/SettingsModel;->A:Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 220
    move-result p1

    .line 221
    .line 222
    if-nez p1, :cond_1c

    .line 223
    return v2

    .line 224
    :cond_1c
    return v0
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
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
.end method

.method public final getAutomaticBarcodeExtraction()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/jumio/core/models/SettingsModel;->q:Z

    .line 3
    return v0
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

.method public final getAutomationMaxRetries()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/jumio/core/models/SettingsModel;->n:I

    .line 3
    return v0
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

.method public final getCameraConnection()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/jumio/core/models/SettingsModel;->k:Z

    .line 3
    return v0
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

.method public final getCountryForIp()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/models/SettingsModel;->d:Ljava/lang/String;

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

.method public final getDocClassifierOverride()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/jumio/core/models/SettingsModel;->s:Z

    .line 3
    return v0
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

.method public final getDocProofAcquireModes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/models/SettingsModel;->z:Ljava/util/List;

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

.method public final getFaceCaptureMode()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/models/SettingsModel;->A:Ljava/lang/String;

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

.method public final getImageCompressionQuality()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/jumio/core/models/SettingsModel;->u:I

    .line 3
    return v0
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

.method public final getKeyPinningEnabled()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/jumio/core/models/SettingsModel;->l:Z

    .line 3
    return v0
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

.method public final getMaxFileUploadSize()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/jumio/core/models/SettingsModel;->o:I

    .line 3
    return v0
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

.method public final getMaxLivenessImages()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/jumio/core/models/SettingsModel;->i:I

    .line 3
    return v0
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

.method public final getReturnImages()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/jumio/core/models/SettingsModel;->c:Z

    .line 3
    return v0
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

.method public final getSensorDataCollectionEnabled()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/jumio/core/models/SettingsModel;->x:Z

    .line 3
    return v0
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

.method public final getSensorSamplingTime()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/jumio/core/models/SettingsModel;->y:I

    .line 3
    return v0
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

.method public final getServerTimestamp()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/jumio/core/models/SettingsModel;->a:J

    .line 3
    return-wide v0
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

.method public final getSkipDocTypeSelection()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/jumio/core/models/SettingsModel;->r:Z

    .line 3
    return v0
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

.method public final getSkipStartScreen()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/jumio/core/models/SettingsModel;->v:Z

    .line 3
    return v0
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

.method public final getStartMaxLoadingTime()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/jumio/core/models/SettingsModel;->w:I

    .line 3
    return v0
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

.method public final getStateForIp()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/models/SettingsModel;->e:Ljava/lang/String;

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

.method public final getThrottlingLimit()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/jumio/core/models/SettingsModel;->t:I

    .line 3
    return v0
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

.method public final getUseCamera1()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/jumio/core/models/SettingsModel;->j:Z

    .line 3
    return v0
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

.method public final getWorkflowDefinitionKey()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/models/SettingsModel;->p:Ljava/lang/String;

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

.method public hashCode()I
    .locals 3

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/jumio/core/models/SettingsModel;->a:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 6
    move-result v0

    .line 7
    .line 8
    const/16 v1, 0x1f

    .line 9
    mul-int/2addr v0, v1

    .line 10
    .line 11
    iget-boolean v2, p0, Lcom/jumio/core/models/SettingsModel;->b:Z

    .line 12
    .line 13
    .line 14
    invoke-static {v2, v0, v1}, Ljumio/core/b0;->a(ZII)I

    .line 15
    move-result v0

    .line 16
    .line 17
    iget-boolean v2, p0, Lcom/jumio/core/models/SettingsModel;->c:Z

    .line 18
    .line 19
    .line 20
    invoke-static {v2, v0, v1}, Ljumio/core/b0;->a(ZII)I

    .line 21
    move-result v0

    .line 22
    .line 23
    iget-object v2, p0, Lcom/jumio/core/models/SettingsModel;->d:Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    invoke-static {v2, v0, v1}, Ljumio/core/C;->a(Ljava/lang/String;II)I

    .line 27
    move-result v0

    .line 28
    .line 29
    iget-object v2, p0, Lcom/jumio/core/models/SettingsModel;->e:Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    invoke-static {v2, v0, v1}, Ljumio/core/C;->a(Ljava/lang/String;II)I

    .line 33
    move-result v0

    .line 34
    .line 35
    iget-boolean v2, p0, Lcom/jumio/core/models/SettingsModel;->f:Z

    .line 36
    .line 37
    .line 38
    invoke-static {v2, v0, v1}, Ljumio/core/b0;->a(ZII)I

    .line 39
    move-result v0

    .line 40
    .line 41
    iget-boolean v2, p0, Lcom/jumio/core/models/SettingsModel;->g:Z

    .line 42
    .line 43
    .line 44
    invoke-static {v2, v0, v1}, Ljumio/core/b0;->a(ZII)I

    .line 45
    move-result v0

    .line 46
    .line 47
    iget-boolean v2, p0, Lcom/jumio/core/models/SettingsModel;->h:Z

    .line 48
    .line 49
    .line 50
    invoke-static {v2, v0, v1}, Ljumio/core/b0;->a(ZII)I

    .line 51
    move-result v0

    .line 52
    .line 53
    iget v2, p0, Lcom/jumio/core/models/SettingsModel;->i:I

    .line 54
    .line 55
    .line 56
    invoke-static {v2, v0, v1}, Ljumio/core/e0;->a(III)I

    .line 57
    move-result v0

    .line 58
    .line 59
    iget-boolean v2, p0, Lcom/jumio/core/models/SettingsModel;->j:Z

    .line 60
    .line 61
    .line 62
    invoke-static {v2, v0, v1}, Ljumio/core/b0;->a(ZII)I

    .line 63
    move-result v0

    .line 64
    .line 65
    iget-boolean v2, p0, Lcom/jumio/core/models/SettingsModel;->k:Z

    .line 66
    .line 67
    .line 68
    invoke-static {v2, v0, v1}, Ljumio/core/b0;->a(ZII)I

    .line 69
    move-result v0

    .line 70
    .line 71
    iget-boolean v2, p0, Lcom/jumio/core/models/SettingsModel;->l:Z

    .line 72
    .line 73
    .line 74
    invoke-static {v2, v0, v1}, Ljumio/core/b0;->a(ZII)I

    .line 75
    move-result v0

    .line 76
    .line 77
    iget-boolean v2, p0, Lcom/jumio/core/models/SettingsModel;->m:Z

    .line 78
    .line 79
    .line 80
    invoke-static {v2, v0, v1}, Ljumio/core/b0;->a(ZII)I

    .line 81
    move-result v0

    .line 82
    .line 83
    iget v2, p0, Lcom/jumio/core/models/SettingsModel;->n:I

    .line 84
    .line 85
    .line 86
    invoke-static {v2, v0, v1}, Ljumio/core/e0;->a(III)I

    .line 87
    move-result v0

    .line 88
    .line 89
    iget v2, p0, Lcom/jumio/core/models/SettingsModel;->o:I

    .line 90
    .line 91
    .line 92
    invoke-static {v2, v0, v1}, Ljumio/core/e0;->a(III)I

    .line 93
    move-result v0

    .line 94
    .line 95
    iget-object v2, p0, Lcom/jumio/core/models/SettingsModel;->p:Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    invoke-static {v2, v0, v1}, Ljumio/core/C;->a(Ljava/lang/String;II)I

    .line 99
    move-result v0

    .line 100
    .line 101
    iget-boolean v2, p0, Lcom/jumio/core/models/SettingsModel;->q:Z

    .line 102
    .line 103
    .line 104
    invoke-static {v2, v0, v1}, Ljumio/core/b0;->a(ZII)I

    .line 105
    move-result v0

    .line 106
    .line 107
    iget-boolean v2, p0, Lcom/jumio/core/models/SettingsModel;->r:Z

    .line 108
    .line 109
    .line 110
    invoke-static {v2, v0, v1}, Ljumio/core/b0;->a(ZII)I

    .line 111
    move-result v0

    .line 112
    .line 113
    iget-boolean v2, p0, Lcom/jumio/core/models/SettingsModel;->s:Z

    .line 114
    .line 115
    .line 116
    invoke-static {v2, v0, v1}, Ljumio/core/b0;->a(ZII)I

    .line 117
    move-result v0

    .line 118
    .line 119
    iget v2, p0, Lcom/jumio/core/models/SettingsModel;->t:I

    .line 120
    .line 121
    .line 122
    invoke-static {v2, v0, v1}, Ljumio/core/e0;->a(III)I

    .line 123
    move-result v0

    .line 124
    .line 125
    iget v2, p0, Lcom/jumio/core/models/SettingsModel;->u:I

    .line 126
    .line 127
    .line 128
    invoke-static {v2, v0, v1}, Ljumio/core/e0;->a(III)I

    .line 129
    move-result v0

    .line 130
    .line 131
    iget-boolean v2, p0, Lcom/jumio/core/models/SettingsModel;->v:Z

    .line 132
    .line 133
    .line 134
    invoke-static {v2, v0, v1}, Ljumio/core/b0;->a(ZII)I

    .line 135
    move-result v0

    .line 136
    .line 137
    iget v2, p0, Lcom/jumio/core/models/SettingsModel;->w:I

    .line 138
    .line 139
    .line 140
    invoke-static {v2, v0, v1}, Ljumio/core/e0;->a(III)I

    .line 141
    move-result v0

    .line 142
    .line 143
    iget-boolean v2, p0, Lcom/jumio/core/models/SettingsModel;->x:Z

    .line 144
    .line 145
    .line 146
    invoke-static {v2, v0, v1}, Ljumio/core/b0;->a(ZII)I

    .line 147
    move-result v0

    .line 148
    .line 149
    iget v2, p0, Lcom/jumio/core/models/SettingsModel;->y:I

    .line 150
    .line 151
    .line 152
    invoke-static {v2, v0, v1}, Ljumio/core/e0;->a(III)I

    .line 153
    move-result v0

    .line 154
    .line 155
    iget-object v2, p0, Lcom/jumio/core/models/SettingsModel;->z:Ljava/util/List;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 159
    move-result v2

    .line 160
    add-int/2addr v2, v0

    .line 161
    mul-int/2addr v2, v1

    .line 162
    .line 163
    iget-object v0, p0, Lcom/jumio/core/models/SettingsModel;->A:Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 167
    move-result v0

    .line 168
    add-int/2addr v0, v2

    .line 169
    return v0
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
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
.end method

.method public final isAdditionalDataPointsEnabled()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/jumio/core/models/SettingsModel;->f:Z

    .line 3
    return v0
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

.method public final isAnalyticsEnabled()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/jumio/core/models/SettingsModel;->h:Z

    .line 3
    return v0
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

.method public final isBrandingEnabled()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/jumio/core/models/SettingsModel;->b:Z

    .line 3
    return v0
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

.method public final isInstantFeedbackEnabled()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/jumio/core/models/SettingsModel;->m:Z

    .line 3
    return v0
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

.method public final isLoaded()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/jumio/core/models/SettingsModel;->g:Z

    .line 3
    return v0
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

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    const-string v1, "SettingsModel(serverTimestamp="

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    iget-wide v1, p0, Lcom/jumio/core/models/SettingsModel;->a:J

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v1, ", isBrandingEnabled="

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    iget-boolean v1, p0, Lcom/jumio/core/models/SettingsModel;->b:Z

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v1, ", returnImages="

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    iget-boolean v1, p0, Lcom/jumio/core/models/SettingsModel;->c:Z

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    const-string v1, ", countryForIp="

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    iget-object v1, p0, Lcom/jumio/core/models/SettingsModel;->d:Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    const-string v1, ", stateForIp="

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    iget-object v1, p0, Lcom/jumio/core/models/SettingsModel;->e:Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    const-string v1, ", isAdditionalDataPointsEnabled="

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    iget-boolean v1, p0, Lcom/jumio/core/models/SettingsModel;->f:Z

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    const-string v1, ", isLoaded="

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    iget-boolean v1, p0, Lcom/jumio/core/models/SettingsModel;->g:Z

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    const-string v1, ", isAnalyticsEnabled="

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    iget-boolean v1, p0, Lcom/jumio/core/models/SettingsModel;->h:Z

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    const-string v1, ", maxLivenessImages="

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    iget v1, p0, Lcom/jumio/core/models/SettingsModel;->i:I

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    const-string v1, ", useCamera1="

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    iget-boolean v1, p0, Lcom/jumio/core/models/SettingsModel;->j:Z

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    const-string v1, ", cameraConnection="

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    iget-boolean v1, p0, Lcom/jumio/core/models/SettingsModel;->k:Z

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    const-string v1, ", keyPinningEnabled="

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    iget-boolean v1, p0, Lcom/jumio/core/models/SettingsModel;->l:Z

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    const-string v1, ", isInstantFeedbackEnabled="

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    iget-boolean v1, p0, Lcom/jumio/core/models/SettingsModel;->m:Z

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    const-string v1, ", automationMaxRetries="

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    iget v1, p0, Lcom/jumio/core/models/SettingsModel;->n:I

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    const-string v1, ", maxFileUploadSize="

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    iget v1, p0, Lcom/jumio/core/models/SettingsModel;->o:I

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    const-string v1, ", workflowDefinitionKey="

    .line 155
    .line 156
    .line 157
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    iget-object v1, p0, Lcom/jumio/core/models/SettingsModel;->p:Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    const-string v1, ", automaticBarcodeExtraction="

    .line 165
    .line 166
    .line 167
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    iget-boolean v1, p0, Lcom/jumio/core/models/SettingsModel;->q:Z

    .line 170
    .line 171
    .line 172
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    const-string v1, ", skipDocTypeSelection="

    .line 175
    .line 176
    .line 177
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    iget-boolean v1, p0, Lcom/jumio/core/models/SettingsModel;->r:Z

    .line 180
    .line 181
    .line 182
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    const-string v1, ", docClassifierOverride="

    .line 185
    .line 186
    .line 187
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    iget-boolean v1, p0, Lcom/jumio/core/models/SettingsModel;->s:Z

    .line 190
    .line 191
    .line 192
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    const-string v1, ", throttlingLimit="

    .line 195
    .line 196
    .line 197
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    iget v1, p0, Lcom/jumio/core/models/SettingsModel;->t:I

    .line 200
    .line 201
    .line 202
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    const-string v1, ", imageCompressionQuality="

    .line 205
    .line 206
    .line 207
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    iget v1, p0, Lcom/jumio/core/models/SettingsModel;->u:I

    .line 210
    .line 211
    .line 212
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    const-string v1, ", skipStartScreen="

    .line 215
    .line 216
    .line 217
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    iget-boolean v1, p0, Lcom/jumio/core/models/SettingsModel;->v:Z

    .line 220
    .line 221
    .line 222
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    const-string v1, ", startMaxLoadingTime="

    .line 225
    .line 226
    .line 227
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    iget v1, p0, Lcom/jumio/core/models/SettingsModel;->w:I

    .line 230
    .line 231
    .line 232
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    const-string v1, ", sensorDataCollectionEnabled="

    .line 235
    .line 236
    .line 237
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    iget-boolean v1, p0, Lcom/jumio/core/models/SettingsModel;->x:Z

    .line 240
    .line 241
    .line 242
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    const-string v1, ", sensorSamplingTime="

    .line 245
    .line 246
    .line 247
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    iget v1, p0, Lcom/jumio/core/models/SettingsModel;->y:I

    .line 250
    .line 251
    .line 252
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    const-string v1, ", docProofAcquireModes="

    .line 255
    .line 256
    .line 257
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    iget-object v1, p0, Lcom/jumio/core/models/SettingsModel;->z:Ljava/util/List;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 263
    .line 264
    const-string v1, ", faceCaptureMode="

    .line 265
    .line 266
    .line 267
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 268
    .line 269
    iget-object v1, p0, Lcom/jumio/core/models/SettingsModel;->A:Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 273
    .line 274
    const/16 v1, 0x29

    .line 275
    .line 276
    .line 277
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 281
    move-result-object v0

    .line 282
    return-object v0
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
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
.end method
