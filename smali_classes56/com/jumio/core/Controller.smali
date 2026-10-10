.class public final Lcom/jumio/core/Controller;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jumio/core/network/ApiBinding;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0080\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0003\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B+\u0008\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0004\u0008\n\u0010\u000bB-\u0008\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\n\u0010\u0010J\u0018\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020B2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J \u0010P\u001a\u00020N2\u0006\u0010O\u001a\u00020B2\u0006\u0010Q\u001a\u00020R2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u000e\u0010S\u001a\u00020N2\u0006\u0010T\u001a\u00020\rJ\u000e\u0010U\u001a\u00020N2\u0006\u0010V\u001a\u000207J\u0010\u0010W\u001a\u00020N2\u0006\u0010X\u001a\u000207H\u0002J\u0008\u0010Y\u001a\u00020NH\u0002J\u0008\u0010Z\u001a\u00020NH\u0002J\u000e\u0010\\\u001a\u00020N2\u0006\u0010]\u001a\u000203J\u0006\u0010^\u001a\u00020NJ\u0006\u0010_\u001a\u00020NJ\u000c\u0010`\u001a\u0008\u0012\u0004\u0012\u00020b0aJ\u0016\u0010c\u001a\u00020N2\u0006\u0010d\u001a\u00020b2\u0006\u0010e\u001a\u000207J\u000e\u0010f\u001a\u00020B2\u0006\u0010g\u001a\u00020hJ\u0015\u0010i\u001a\u00020N2\u0006\u0010O\u001a\u00020BH\u0000\u00a2\u0006\u0002\u0008jJ.\u0010k\u001a\u00020N2$\u0008\u0002\u0010l\u001a\u001e\u0012\u0004\u0012\u00020n\u0012\u0004\u0012\u00020o0mj\u000e\u0012\u0004\u0012\u00020n\u0012\u0004\u0012\u00020o`pH\u0002J4\u0010q\u001a\u00020o2\"\u0010l\u001a\u001e\u0012\u0004\u0012\u00020n\u0012\u0004\u0012\u00020o0mj\u000e\u0012\u0004\u0012\u00020n\u0012\u0004\u0012\u00020o`p2\u0006\u0010O\u001a\u00020rH\u0002J \u0010s\u001a\u00020N2\u0006\u0010t\u001a\u00020o2\u0006\u0010O\u001a\u00020r2\u0006\u0010u\u001a\u00020vH\u0002J\u0008\u0010w\u001a\u00020NH\u0002J\u001e\u0010x\u001a\u00020N2\u0008\u0010]\u001a\u0004\u0018\u00010y2\u000c\u0008\u0002\u0010z\u001a\u0006\u0012\u0002\u0008\u00030=J\u000e\u0010{\u001a\u00020N2\u0006\u0010|\u001a\u000207J\u0010\u0010}\u001a\u00020N2\u0006\u0010|\u001a\u000207H\u0002J \u0010~\u001a\u00020N2\u000b\u0010\u007f\u001a\u0007\u0012\u0002\u0008\u00030\u0080\u00012\t\u0010t\u001a\u0005\u0018\u00010\u0081\u0001H\u0016J\u001b\u0010\u0082\u0001\u001a\u00020N2\t\u0010t\u001a\u0005\u0018\u00010\u0081\u0001H\u0082@\u00a2\u0006\u0003\u0010\u0083\u0001J\u0014\u0010\u0084\u0001\u001a\u00020N2\t\u0010t\u001a\u0005\u0018\u00010\u0081\u0001H\u0002J\u0012\u0010\u0085\u0001\u001a\u00020N2\u0007\u0010\u000c\u001a\u00030\u0086\u0001H\u0002J\u0012\u0010\u0087\u0001\u001a\u00020N2\u0007\u0010\u000c\u001a\u00030\u0086\u0001H\u0002J\u0012\u0010\u0088\u0001\u001a\u00020N2\u0007\u0010\u000c\u001a\u00030\u0086\u0001H\u0002J\u0013\u0010\u0089\u0001\u001a\u00020N2\u0008\u0010\u008a\u0001\u001a\u00030\u0086\u0001H\u0002J\u0013\u0010\u008b\u0001\u001a\u00020N2\u0008\u0010\u008a\u0001\u001a\u00030\u0086\u0001H\u0002J\u0012\u0010\u008c\u0001\u001a\u00020N2\u0007\u0010\u000c\u001a\u00030\u0086\u0001H\u0002J\u0013\u0010\u008d\u0001\u001a\u00020N2\u0008\u0010\u008a\u0001\u001a\u00030\u0086\u0001H\u0002J\u0013\u0010\u008e\u0001\u001a\u00020N2\u0008\u0010\u008a\u0001\u001a\u00030\u0086\u0001H\u0002J\u0013\u0010\u008f\u0001\u001a\u00020N2\u0008\u0010\u008a\u0001\u001a\u00030\u0086\u0001H\u0002J\u0013\u0010\u0090\u0001\u001a\u00020N2\u0008\u0010\u008a\u0001\u001a\u00030\u0086\u0001H\u0002J\u0013\u0010\u0091\u0001\u001a\u00020N2\u0008\u0010\u008a\u0001\u001a\u00030\u0086\u0001H\u0002J\u0013\u0010\u0092\u0001\u001a\u00020N2\u0008\u0010\u008a\u0001\u001a\u00030\u0086\u0001H\u0002J\u0012\u0010\u0093\u0001\u001a\u00020N2\u0007\u0010\u000c\u001a\u00030\u0086\u0001H\u0002J\u0012\u0010\u0094\u0001\u001a\u00020N2\u0007\u0010\u000c\u001a\u00030\u0086\u0001H\u0002J\u0013\u0010\u0095\u0001\u001a\u00030\u0096\u00012\u0007\u0010\u000c\u001a\u00030\u0086\u0001H\u0002J\u0012\u0010\u0097\u0001\u001a\u00020N2\u0007\u0010\u000c\u001a\u00030\u0086\u0001H\u0002J\u0012\u0010\u0098\u0001\u001a\u00020N2\u0007\u0010\u000c\u001a\u00030\u0086\u0001H\u0002J\u001f\u0010x\u001a\u00020N2\u000b\u0010\u007f\u001a\u0007\u0012\u0002\u0008\u00030\u0080\u00012\u0008\u0010]\u001a\u0004\u0018\u00010yH\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012\"\u0004\u0008\u0013\u0010\u0014R\u001a\u0010\u0002\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017\"\u0004\u0008\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u001b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u001f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010!R\u0011\u0010\"\u001a\u00020#\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010%R\u0011\u0010&\u001a\u00020\'\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010)R\u0011\u0010*\u001a\u00020+\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008,\u0010-R\u0011\u0010.\u001a\u00020/\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00080\u00101R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u00102\u001a\u0004\u0018\u000103X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u00104\u001a\u0004\u0018\u000105X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u00106\u001a\u0002078BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u00086\u00108R\u0014\u00109\u001a\u0002078BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008:\u00108R&\u0010;\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0008\u0001\u0012\u0006\u0012\u0002\u0008\u00030>0=0<8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008?\u0010@R\u001c\u0010A\u001a\u0004\u0018\u00010BX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008C\u0010D\"\u0004\u0008E\u0010FR\u001a\u0010G\u001a\u000207X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008H\u00108\"\u0004\u0008I\u0010JR\u0011\u0010K\u001a\u0002078F\u00a2\u0006\u0006\u001a\u0004\u0008K\u00108R\u0014\u0010L\u001a\u0002078BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008L\u00108R\u0011\u0010[\u001a\u0002078F\u00a2\u0006\u0006\u001a\u0004\u0008[\u00108\u00a8\u0006\u0099\u0001"
    }
    d2 = {
        "Lcom/jumio/core/Controller;",
        "Lcom/jumio/core/network/ApiBinding;",
        "context",
        "Landroid/content/Context;",
        "authorizationModel",
        "Lcom/jumio/core/models/AuthorizationModel;",
        "controllerInterface",
        "Lcom/jumio/sdk/interfaces/JumioControllerInterface;",
        "customThemeId",
        "",
        "<init>",
        "(Landroid/content/Context;Lcom/jumio/core/models/AuthorizationModel;Lcom/jumio/sdk/interfaces/JumioControllerInterface;I)V",
        "data",
        "Landroid/os/Bundle;",
        "scanPartInterface",
        "Lcom/jumio/sdk/interfaces/JumioScanPartInterface;",
        "(Landroid/content/Context;Landroid/os/Bundle;Lcom/jumio/sdk/interfaces/JumioControllerInterface;Lcom/jumio/sdk/interfaces/JumioScanPartInterface;)V",
        "getAuthorizationModel",
        "()Lcom/jumio/core/models/AuthorizationModel;",
        "setAuthorizationModel",
        "(Lcom/jumio/core/models/AuthorizationModel;)V",
        "Lcom/jumio/core/MobileContext;",
        "getContext",
        "()Lcom/jumio/core/MobileContext;",
        "setContext",
        "(Lcom/jumio/core/MobileContext;)V",
        "rotationManager",
        "Lcom/jumio/commons/utils/DeviceRotationManager;",
        "getRotationManager",
        "()Lcom/jumio/commons/utils/DeviceRotationManager;",
        "dataManager",
        "Lcom/jumio/core/persistence/DataManager;",
        "getDataManager",
        "()Lcom/jumio/core/persistence/DataManager;",
        "backendManager",
        "Lcom/jumio/core/api/BackendManager;",
        "getBackendManager",
        "()Lcom/jumio/core/api/BackendManager;",
        "pluginRegistry",
        "Lcom/jumio/core/plugins/PluginRegistryInterface;",
        "getPluginRegistry",
        "()Lcom/jumio/core/plugins/PluginRegistryInterface;",
        "analytics",
        "Lcom/jumio/analytics/Analytics;",
        "getAnalytics",
        "()Lcom/jumio/analytics/Analytics;",
        "scopeProvider",
        "Lcom/jumio/core/scope/ScopeProviderInterface;",
        "getScopeProvider",
        "()Lcom/jumio/core/scope/ScopeProviderInterface;",
        "lastError",
        "Lcom/jumio/sdk/error/JumioError;",
        "initializeWorkflowJob",
        "Lkotlinx/coroutines/Job;",
        "isDefaultUi",
        "",
        "()Z",
        "userConsentedAllItems",
        "getUserConsentedAllItems",
        "bindingClasses",
        "",
        "Ljava/lang/Class;",
        "Lcom/jumio/core/network/ApiCall;",
        "getBindingClasses",
        "()[Ljava/lang/Class;",
        "activeCredential",
        "Lcom/jumio/sdk/credentials/JumioCredential;",
        "getActiveCredential$jumio_core_release",
        "()Lcom/jumio/sdk/credentials/JumioCredential;",
        "setActiveCredential$jumio_core_release",
        "(Lcom/jumio/sdk/credentials/JumioCredential;)V",
        "isActive",
        "isActive$jumio_core_release",
        "setActive$jumio_core_release",
        "(Z)V",
        "isConsentPreApproved",
        "isModelPreloaded",
        "restoreActiveCredential",
        "",
        "credential",
        "restoreScanPart",
        "credentialPart",
        "Lcom/jumio/sdk/enums/JumioCredentialPart;",
        "saveState",
        "bundle",
        "persistAllData",
        "stop",
        "setup",
        "restore",
        "scheduleWorkflow",
        "checkWorkflow",
        "isComplete",
        "retry",
        "error",
        "cancel",
        "finish",
        "getUnconsentedItems",
        "",
        "Lcom/jumio/sdk/consent/JumioConsentItem;",
        "userConsented",
        "consentItem",
        "userConsent",
        "startCredential",
        "credentialInfo",
        "Lcom/jumio/sdk/credentials/JumioCredentialInfo;",
        "finishCredential",
        "finishCredential$jumio_core_release",
        "sdkResult",
        "resultMap",
        "Ljava/util/HashMap;",
        "",
        "Lcom/jumio/sdk/result/JumioCredentialResult;",
        "Lkotlin/collections/HashMap;",
        "ensureCredentialResult",
        "Lcom/jumio/core/models/CredentialDataModel;",
        "updateSdkResultWithImageData",
        "result",
        "serverSettingsModel",
        "Lcom/jumio/core/models/SettingsModel;",
        "destroy",
        "onError",
        "",
        "sourceClass",
        "reporting",
        "canceled",
        "finishSDK",
        "onResult",
        "apiCallDataModel",
        "Lcom/jumio/core/models/ApiCallDataModel;",
        "",
        "onSettingsCallResult",
        "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "onFinalizeCallResult",
        "setupTime",
        "Lorg/json/JSONObject;",
        "setupDocuments",
        "setupCountryDocuments",
        "setupTimeouts",
        "configurations",
        "setupLivenessSettings",
        "setupNfcSettings",
        "setupCameraData",
        "setupDocfinderSettings",
        "setupCDNFeatures",
        "setupUploadSettings",
        "setupSupplementalImages",
        "setupCameraChallenge",
        "setupConsent",
        "setupLegalStatements",
        "setupInitiateModel",
        "Lcom/jumio/core/models/InitiateModel;",
        "setupCredentials",
        "setupTermsOfUse",
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
        "SMAP\nController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Controller.kt\ncom/jumio/core/Controller\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,870:1\n1#2:871\n1557#3:872\n1628#3,3:873\n1863#3,2:876\n1863#3,2:885\n381#4,7:878\n*S KotlinDebug\n*F\n+ 1 Controller.kt\ncom/jumio/core/Controller\n*L\n396#1:872\n396#1:873,3\n496#1:876,2\n555#1:885,2\n524#1:878,7\n*E\n"
    }
.end annotation


# instance fields
.field public a:Lcom/jumio/core/models/AuthorizationModel;

.field public b:Lcom/jumio/core/MobileContext;

.field public final c:Lcom/jumio/commons/utils/DeviceRotationManager;

.field public final d:Lcom/jumio/core/persistence/DataManager;

.field public final e:Lcom/jumio/core/api/BackendManager;

.field public final f:Lcom/jumio/core/plugins/PluginRegistryInterface;

.field public final g:Lcom/jumio/analytics/Analytics;

.field public final h:Lcom/jumio/core/scope/ScopeProviderInterface;

.field public i:Lcom/jumio/sdk/interfaces/JumioControllerInterface;

.field public final j:Lcom/jumio/sdk/interfaces/JumioScanPartInterface;

.field public k:Lcom/jumio/sdk/error/JumioError;

.field public l:Lkotlinx/coroutines/x1;

.field public m:Lcom/jumio/sdk/credentials/JumioCredential;

.field public n:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Bundle;Lcom/jumio/sdk/interfaces/JumioControllerInterface;Lcom/jumio/sdk/interfaces/JumioScanPartInterface;)V
    .locals 19
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/jumio/sdk/interfaces/JumioControllerInterface;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/jumio/sdk/interfaces/JumioScanPartInterface;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    const-string v4, "context"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "data"

    move-object/from16 v5, p2

    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "controllerInterface"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const/4 v4, 0x1

    .line 24
    iput-boolean v4, v1, Lcom/jumio/core/Controller;->n:Z

    .line 25
    invoke-static {v5}, Ljumio/core/y0;->a(Landroid/os/Bundle;)Ljava/io/Serializable;

    move-result-object v5

    check-cast v5, Lcom/jumio/core/models/AuthorizationModel;

    iput-object v5, v1, Lcom/jumio/core/Controller;->a:Lcom/jumio/core/models/AuthorizationModel;

    .line 26
    iput-object v3, v1, Lcom/jumio/core/Controller;->j:Lcom/jumio/sdk/interfaces/JumioScanPartInterface;

    .line 27
    new-instance v5, Ljumio/core/L2;

    invoke-direct {v5, v0}, Ljumio/core/L2;-><init>(Landroid/content/Context;)V

    .line 28
    new-instance v6, Ljumio/core/l0;

    const/4 v7, 0x0

    invoke-direct {v6, v5, v7}, Ljumio/core/l0;-><init>(Ljumio/core/L2;Lkotlin/coroutines/Continuation;)V

    invoke-static {v7, v6, v4, v7}, Lkotlinx/coroutines/h;->f(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;

    .line 29
    new-instance v6, Ljumio/core/P2;

    .line 30
    iget-object v8, v1, Lcom/jumio/core/Controller;->a:Lcom/jumio/core/models/AuthorizationModel;

    invoke-virtual {v8}, Lcom/jumio/core/models/AuthorizationModel;->getSessionKey()Lcom/jumio/core/models/AuthorizationModel$SessionKey;

    move-result-object v8

    .line 31
    new-instance v9, Ljava/io/File;

    sget-object v10, Lcom/jumio/core/environment/Environment;->INSTANCE:Lcom/jumio/core/environment/Environment;

    invoke-virtual {v10, v0}, Lcom/jumio/core/environment/Environment;->getDataDirectory(Landroid/content/Context;)Ljava/io/File;

    move-result-object v10

    const-string v11, "tmp_store"

    invoke-direct {v9, v10, v11}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 32
    invoke-direct {v6, v8, v9, v5}, Ljumio/core/P2;-><init>(Lcom/jumio/core/models/AuthorizationModel$SessionKey;Ljava/io/File;Ljumio/core/L2;)V

    .line 33
    :try_start_0
    invoke-virtual {v6}, Ljumio/core/P2;->b()Z

    move-result v5

    .line 34
    new-instance v8, Lcom/jumio/core/MobileContext;

    .line 35
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v9

    .line 36
    iget-object v10, v1, Lcom/jumio/core/Controller;->a:Lcom/jumio/core/models/AuthorizationModel;

    const/4 v11, 0x0

    .line 37
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    .line 38
    invoke-virtual {v6}, Ljumio/core/P2;->a()Ljava/lang/Object;

    move-result-object v12

    if-nez v12, :cond_0

    goto :goto_0

    :cond_0
    move-object v11, v12

    .line 39
    :goto_0
    check-cast v11, Ljava/lang/Number;

    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    move-result v11

    .line 40
    invoke-direct {v8, v9, v10, v11}, Lcom/jumio/core/MobileContext;-><init>(Landroid/content/Context;Lcom/jumio/core/models/AuthorizationModel;I)V

    .line 41
    sget-object v9, Lcom/jumio/core/ServiceLocator;->INSTANCE:Lcom/jumio/core/ServiceLocator;

    invoke-virtual {v9, v8}, Lcom/jumio/core/ServiceLocator;->init(Landroid/content/Context;)V

    .line 42
    iput-object v8, v1, Lcom/jumio/core/Controller;->b:Lcom/jumio/core/MobileContext;

    .line 43
    const-class v8, Lcom/jumio/core/plugins/PluginRegistryInterface;

    const/4 v10, 0x2

    invoke-static {v9, v8, v7, v10, v7}, Lcom/jumio/core/ServiceLocatorInterface;->getServiceImplementation$default(Lcom/jumio/core/ServiceLocatorInterface;Ljava/lang/Class;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/jumio/core/plugins/PluginRegistryInterface;

    iput-object v8, v1, Lcom/jumio/core/Controller;->f:Lcom/jumio/core/plugins/PluginRegistryInterface;

    .line 44
    const-class v11, Lcom/jumio/core/scope/ScopeProviderInterface;

    invoke-static {v9, v11, v7, v10, v7}, Lcom/jumio/core/ServiceLocatorInterface;->getServiceImplementation$default(Lcom/jumio/core/ServiceLocatorInterface;Ljava/lang/Class;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/jumio/core/scope/ScopeProviderInterface;

    iput-object v9, v1, Lcom/jumio/core/Controller;->h:Lcom/jumio/core/scope/ScopeProviderInterface;

    .line 45
    sget-object v11, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 46
    invoke-virtual {v6}, Ljumio/core/P2;->a()Ljava/lang/Object;

    move-result-object v12

    if-nez v12, :cond_1

    goto :goto_1

    :cond_1
    move-object v11, v12

    .line 47
    :goto_1
    check-cast v11, Ljava/lang/Boolean;

    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v11

    iput-boolean v11, v1, Lcom/jumio/core/Controller;->n:Z

    .line 48
    invoke-virtual {v6}, Ljumio/core/P2;->a()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/jumio/sdk/error/JumioError;

    iput-object v11, v1, Lcom/jumio/core/Controller;->k:Lcom/jumio/sdk/error/JumioError;

    .line 49
    new-instance v11, Lcom/jumio/core/persistence/DataManager;

    invoke-direct {v11}, Lcom/jumio/core/persistence/DataManager;-><init>()V

    iput-object v11, v1, Lcom/jumio/core/Controller;->d:Lcom/jumio/core/persistence/DataManager;

    .line 50
    new-instance v12, Lcom/jumio/core/api/BackendManager;

    iget-object v13, v1, Lcom/jumio/core/Controller;->b:Lcom/jumio/core/MobileContext;

    iget-object v14, v1, Lcom/jumio/core/Controller;->a:Lcom/jumio/core/models/AuthorizationModel;

    invoke-direct {v12, v13, v9, v11, v14}, Lcom/jumio/core/api/BackendManager;-><init>(Landroid/content/Context;Lcom/jumio/core/scope/ScopeProviderInterface;Lcom/jumio/core/persistence/DataManager;Lcom/jumio/core/models/AuthorizationModel;)V

    iput-object v12, v1, Lcom/jumio/core/Controller;->e:Lcom/jumio/core/api/BackendManager;

    .line 51
    invoke-virtual {v12, v6}, Lcom/jumio/core/api/BackendManager;->restore(Ljumio/core/P2;)V

    .line 52
    invoke-virtual {v11, v6}, Lcom/jumio/core/persistence/DataManager;->restore(Ljumio/core/P2;)V

    .line 53
    sget-object v9, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    invoke-static {v6, v7}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 55
    new-instance v6, Lcom/jumio/commons/utils/DeviceRotationManager;

    invoke-direct {v6, v0}, Lcom/jumio/commons/utils/DeviceRotationManager;-><init>(Landroid/content/Context;)V

    iput-object v6, v1, Lcom/jumio/core/Controller;->c:Lcom/jumio/commons/utils/DeviceRotationManager;

    .line 56
    iput-object v2, v1, Lcom/jumio/core/Controller;->i:Lcom/jumio/sdk/interfaces/JumioControllerInterface;

    .line 57
    invoke-virtual {v12, v1}, Lcom/jumio/core/api/BackendManager;->addBinding(Lcom/jumio/core/network/ApiBinding;)V

    .line 58
    new-instance v0, Lcom/jumio/analytics/Analytics;

    const-class v2, Lcom/jumio/analytics/AnalyticsModel;

    invoke-virtual {v11, v2}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    move-result-object v2

    check-cast v2, Lcom/jumio/analytics/AnalyticsModel;

    invoke-direct {v0, v12, v2}, Lcom/jumio/analytics/Analytics;-><init>(Lcom/jumio/core/api/BackendManager;Lcom/jumio/analytics/AnalyticsModel;)V

    .line 59
    invoke-virtual {v0}, Lcom/jumio/analytics/Analytics;->configure$jumio_core_release()V

    .line 60
    invoke-virtual {v0}, Lcom/jumio/analytics/Analytics;->resume()V

    .line 61
    iput-object v0, v1, Lcom/jumio/core/Controller;->g:Lcom/jumio/analytics/Analytics;

    if-nez v5, :cond_2

    .line 62
    new-instance v13, Lcom/jumio/core/error/Error;

    sget-object v14, Lcom/jumio/core/enums/ErrorCase;->PROCESS_CANT_BE_COMPLETED:Lcom/jumio/core/enums/ErrorCase;

    const/16 v17, 0x2

    const/16 v18, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x2

    invoke-direct/range {v13 .. v18}, Lcom/jumio/core/error/Error;-><init>(Lcom/jumio/core/enums/ErrorCase;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v1, v13, v7, v10, v7}, Lcom/jumio/core/Controller;->onError$default(Lcom/jumio/core/Controller;Ljava/lang/Throwable;Ljava/lang/Class;ILjava/lang/Object;)V

    return-void

    .line 63
    :cond_2
    invoke-virtual {v1, v4}, Lcom/jumio/core/Controller;->b(Z)V

    .line 64
    const-class v0, Lcom/jumio/core/models/CredentialsModel;

    invoke-virtual {v11, v0}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/jumio/core/models/CredentialsModel;

    .line 65
    iget-object v2, v0, Lcom/jumio/core/models/CredentialsModel;->c:Ljava/lang/String;

    if-eqz v2, :cond_4

    .line 66
    invoke-virtual {v0, v1, v2}, Lcom/jumio/core/models/CredentialsModel;->a(Lcom/jumio/core/Controller;Ljava/lang/String;)Lcom/jumio/sdk/credentials/JumioCredential;

    move-result-object v0

    iput-object v0, v1, Lcom/jumio/core/Controller;->m:Lcom/jumio/sdk/credentials/JumioCredential;

    if-eqz v0, :cond_4

    if-eqz v3, :cond_4

    .line 67
    invoke-virtual {v0}, Lcom/jumio/sdk/credentials/JumioCredential;->getData$jumio_core_release()Lcom/jumio/core/models/CredentialDataModel;

    move-result-object v2

    .line 68
    iget-object v2, v2, Lcom/jumio/core/models/CredentialDataModel;->g:Lcom/jumio/sdk/enums/JumioCredentialPart;

    if-eqz v2, :cond_4

    .line 69
    invoke-virtual {v0}, Lcom/jumio/sdk/credentials/JumioCredential;->getData$jumio_core_release()Lcom/jumio/core/models/CredentialDataModel;

    move-result-object v4

    .line 70
    iget-object v4, v4, Lcom/jumio/core/models/CredentialDataModel;->f:Ljava/util/SortedMap;

    .line 71
    invoke-interface {v4}, Ljava/util/Map;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_3

    .line 72
    invoke-virtual {v0}, Lcom/jumio/sdk/credentials/JumioCredential;->getData$jumio_core_release()Lcom/jumio/core/models/CredentialDataModel;

    move-result-object v4

    .line 73
    iget-object v4, v4, Lcom/jumio/core/models/CredentialDataModel;->f:Ljava/util/SortedMap;

    .line 74
    invoke-virtual {v0}, Lcom/jumio/sdk/credentials/JumioCredential;->getData$jumio_core_release()Lcom/jumio/core/models/CredentialDataModel;

    move-result-object v5

    .line 75
    iget-object v5, v5, Lcom/jumio/core/models/CredentialDataModel;->g:Lcom/jumio/sdk/enums/JumioCredentialPart;

    .line 76
    invoke-interface {v4, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 77
    invoke-virtual {v0}, Lcom/jumio/sdk/credentials/JumioCredential;->getData$jumio_core_release()Lcom/jumio/core/models/CredentialDataModel;

    move-result-object v2

    .line 78
    iget-object v2, v2, Lcom/jumio/core/models/CredentialDataModel;->f:Ljava/util/SortedMap;

    .line 79
    invoke-virtual {v0}, Lcom/jumio/sdk/credentials/JumioCredential;->getData$jumio_core_release()Lcom/jumio/core/models/CredentialDataModel;

    move-result-object v4

    .line 80
    iget-object v4, v4, Lcom/jumio/core/models/CredentialDataModel;->g:Lcom/jumio/sdk/enums/JumioCredentialPart;

    .line 81
    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/jumio/core/models/ScanPartModel;

    if-eqz v2, :cond_4

    .line 82
    invoke-virtual {v0}, Lcom/jumio/sdk/credentials/JumioCredential;->getData$jumio_core_release()Lcom/jumio/core/models/CredentialDataModel;

    move-result-object v4

    .line 83
    iget-object v4, v4, Lcom/jumio/core/models/CredentialDataModel;->g:Lcom/jumio/sdk/enums/JumioCredentialPart;

    .line 84
    sget-object v5, Lcom/jumio/sdk/enums/JumioCredentialPart;->NFC:Lcom/jumio/sdk/enums/JumioCredentialPart;

    if-ne v4, v5, :cond_4

    .line 85
    sget-object v4, Ljumio/core/W2;->i:Ljumio/core/W2;

    invoke-interface {v8, v4}, Lcom/jumio/core/plugins/PluginRegistryInterface;->getPlugin(Ljumio/core/W2;)Lcom/jumio/core/plugins/Plugin;

    move-result-object v4

    check-cast v4, Lcom/jumio/core/plugins/ScanPartPlugin;

    if-eqz v4, :cond_4

    .line 86
    new-instance v5, Lcom/jumio/sdk/scanpart/JumioScanPart;

    .line 87
    invoke-virtual {v0}, Lcom/jumio/sdk/credentials/JumioCredential;->getController$jumio_core_release()Lcom/jumio/core/Controller;

    move-result-object v6

    .line 88
    invoke-interface {v4, v6, v0, v2, v3}, Lcom/jumio/core/plugins/ScanPartPlugin;->getScanPart(Lcom/jumio/core/Controller;Lcom/jumio/sdk/credentials/JumioCredential;Lcom/jumio/core/models/ScanPartModel;Lcom/jumio/sdk/interfaces/JumioScanPartInterface;)Lcom/jumio/core/scanpart/ScanPart;

    move-result-object v2

    .line 89
    invoke-direct {v5, v2}, Lcom/jumio/sdk/scanpart/JumioScanPart;-><init>(Lcom/jumio/core/scanpart/ScanPart;)V

    invoke-virtual {v0, v5}, Lcom/jumio/sdk/credentials/JumioCredential;->setActiveScanPart$jumio_core_release(Lcom/jumio/sdk/scanpart/JumioScanPart;)V

    goto :goto_2

    .line 90
    :cond_3
    invoke-virtual {v0, v2, v3}, Lcom/jumio/sdk/credentials/JumioCredential;->initScanPart(Lcom/jumio/sdk/enums/JumioCredentialPart;Lcom/jumio/sdk/interfaces/JumioScanPartInterface;)Lcom/jumio/sdk/scanpart/JumioScanPart;

    move-result-object v0

    .line 91
    invoke-virtual {v0}, Lcom/jumio/sdk/scanpart/JumioScanPart;->getScanPart$jumio_core_release()Lcom/jumio/core/scanpart/ScanPart;

    move-result-object v0

    invoke-virtual {v0}, Lcom/jumio/core/scanpart/ScanPart;->restore()V

    .line 92
    :cond_4
    :goto_2
    invoke-virtual {v12}, Lcom/jumio/core/api/BackendManager;->retry()V

    return-void

    :catchall_0
    move-exception v0

    move-object v2, v0

    .line 93
    :try_start_1
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v0

    invoke-static {v6, v2}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/os/Bundle;Lcom/jumio/sdk/interfaces/JumioControllerInterface;Lcom/jumio/sdk/interfaces/JumioScanPartInterface;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    .line 22
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/jumio/core/Controller;-><init>(Landroid/content/Context;Landroid/os/Bundle;Lcom/jumio/sdk/interfaces/JumioControllerInterface;Lcom/jumio/sdk/interfaces/JumioScanPartInterface;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/jumio/core/models/AuthorizationModel;Lcom/jumio/sdk/interfaces/JumioControllerInterface;I)V
    .locals 4
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/jumio/core/models/AuthorizationModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/jumio/sdk/interfaces/JumioControllerInterface;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "authorizationModel"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "controllerInterface"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lcom/jumio/core/Controller;->n:Z

    .line 4
    new-instance v0, Lcom/jumio/core/MobileContext;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p2, p4}, Lcom/jumio/core/MobileContext;-><init>(Landroid/content/Context;Lcom/jumio/core/models/AuthorizationModel;I)V

    .line 5
    sget-object p4, Lcom/jumio/core/ServiceLocator;->INSTANCE:Lcom/jumio/core/ServiceLocator;

    invoke-virtual {p4, v0}, Lcom/jumio/core/ServiceLocator;->init(Landroid/content/Context;)V

    .line 6
    iput-object v0, p0, Lcom/jumio/core/Controller;->b:Lcom/jumio/core/MobileContext;

    .line 7
    const-class v0, Lcom/jumio/core/plugins/PluginRegistryInterface;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p4, v0, v1, v2, v1}, Lcom/jumio/core/ServiceLocatorInterface;->getServiceImplementation$default(Lcom/jumio/core/ServiceLocatorInterface;Ljava/lang/Class;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jumio/core/plugins/PluginRegistryInterface;

    iput-object v0, p0, Lcom/jumio/core/Controller;->f:Lcom/jumio/core/plugins/PluginRegistryInterface;

    .line 8
    const-class v0, Lcom/jumio/core/scope/ScopeProviderInterface;

    invoke-static {p4, v0, v1, v2, v1}, Lcom/jumio/core/ServiceLocatorInterface;->getServiceImplementation$default(Lcom/jumio/core/ServiceLocatorInterface;Ljava/lang/Class;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lcom/jumio/core/scope/ScopeProviderInterface;

    iput-object p4, p0, Lcom/jumio/core/Controller;->h:Lcom/jumio/core/scope/ScopeProviderInterface;

    .line 9
    new-instance v0, Lcom/jumio/commons/utils/DeviceRotationManager;

    invoke-direct {v0, p1}, Lcom/jumio/commons/utils/DeviceRotationManager;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/jumio/core/Controller;->c:Lcom/jumio/commons/utils/DeviceRotationManager;

    .line 10
    new-instance p1, Lcom/jumio/core/persistence/DataManager;

    invoke-direct {p1}, Lcom/jumio/core/persistence/DataManager;-><init>()V

    iput-object p1, p0, Lcom/jumio/core/Controller;->d:Lcom/jumio/core/persistence/DataManager;

    .line 11
    new-instance v0, Lcom/jumio/core/api/BackendManager;

    iget-object v3, p0, Lcom/jumio/core/Controller;->b:Lcom/jumio/core/MobileContext;

    invoke-direct {v0, v3, p4, p1, p2}, Lcom/jumio/core/api/BackendManager;-><init>(Landroid/content/Context;Lcom/jumio/core/scope/ScopeProviderInterface;Lcom/jumio/core/persistence/DataManager;Lcom/jumio/core/models/AuthorizationModel;)V

    iput-object v0, p0, Lcom/jumio/core/Controller;->e:Lcom/jumio/core/api/BackendManager;

    .line 12
    invoke-virtual {v0, p0}, Lcom/jumio/core/api/BackendManager;->addBinding(Lcom/jumio/core/network/ApiBinding;)V

    .line 13
    new-instance p4, Lcom/jumio/analytics/AnalyticsModel;

    invoke-direct {p4}, Lcom/jumio/analytics/AnalyticsModel;-><init>()V

    .line 14
    const-class v3, Lcom/jumio/analytics/AnalyticsModel;

    invoke-virtual {p1, v3, p4}, Lcom/jumio/core/persistence/DataManager;->put(Ljava/lang/Class;Ljava/io/Serializable;)V

    .line 15
    new-instance p1, Lcom/jumio/analytics/Analytics;

    invoke-direct {p1, v0, p4}, Lcom/jumio/analytics/Analytics;-><init>(Lcom/jumio/core/api/BackendManager;Lcom/jumio/analytics/AnalyticsModel;)V

    .line 16
    invoke-virtual {p1}, Lcom/jumio/analytics/Analytics;->configure$jumio_core_release()V

    .line 17
    sget-object p4, Ljumio/core/h2;->c:Ljumio/core/h2;

    invoke-static {p4, v1, v2, v1}, Lcom/jumio/analytics/MobileEvents;->lifecycle$default(Ljumio/core/h2;Ljava/lang/Object;ILjava/lang/Object;)Lcom/jumio/analytics/AnalyticsEvent;

    move-result-object p4

    invoke-virtual {p1, p4}, Lcom/jumio/analytics/Analytics;->add(Lcom/jumio/analytics/AnalyticsEvent;)V

    .line 18
    iput-object p1, p0, Lcom/jumio/core/Controller;->g:Lcom/jumio/analytics/Analytics;

    .line 19
    iput-object p2, p0, Lcom/jumio/core/Controller;->a:Lcom/jumio/core/models/AuthorizationModel;

    .line 20
    iput-object p3, p0, Lcom/jumio/core/Controller;->i:Lcom/jumio/sdk/interfaces/JumioControllerInterface;

    const/4 p1, 0x0

    .line 21
    invoke-virtual {p0, p1}, Lcom/jumio/core/Controller;->b(Z)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Lcom/jumio/core/models/AuthorizationModel;Lcom/jumio/sdk/interfaces/JumioControllerInterface;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    .line 1
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/jumio/core/Controller;-><init>(Landroid/content/Context;Lcom/jumio/core/models/AuthorizationModel;Lcom/jumio/sdk/interfaces/JumioControllerInterface;I)V

    return-void
.end method

.method public static a(Ljava/util/HashMap;Lcom/jumio/core/models/CredentialDataModel;)Lcom/jumio/sdk/result/JumioCredentialResult;
    .locals 33

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 1
    iget-object v2, v1, Lcom/jumio/core/models/CredentialDataModel;->a:Ljava/lang/String;

    .line 2
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_b

    .line 3
    iget-object v3, v1, Lcom/jumio/core/models/CredentialDataModel;->b:Lcom/jumio/sdk/credentials/JumioCredentialCategory;

    .line 4
    sget-object v4, Ljumio/core/m0;->b:[I

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v3, v4, v3

    const/4 v4, 0x1

    if-eq v3, v4, :cond_a

    const/4 v5, 0x3

    const/4 v6, 0x2

    if-eq v3, v6, :cond_1

    if-ne v3, v5, :cond_0

    .line 5
    new-instance v1, Lcom/jumio/sdk/result/JumioCredentialResult;

    invoke-direct {v1}, Lcom/jumio/sdk/result/JumioCredentialResult;-><init>()V

    move-object v3, v1

    goto/16 :goto_6

    .line 6
    :cond_0
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    .line 7
    :cond_1
    iget-object v1, v1, Lcom/jumio/core/models/CredentialDataModel;->e:Ljava/util/SortedMap;

    .line 8
    sget-object v3, Lcom/jumio/sdk/enums/JumioCredentialPart;->FACE:Lcom/jumio/sdk/enums/JumioCredentialPart;

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v3, v1, Lcom/jumio/core/models/FaceScanPartModel;

    const/4 v7, 0x0

    if-eqz v3, :cond_2

    check-cast v1, Lcom/jumio/core/models/FaceScanPartModel;

    goto :goto_0

    :cond_2
    move-object v1, v7

    :goto_0
    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lcom/jumio/core/models/FaceScanPartModel;->getLivenessData()Lcom/jumio/core/extraction/liveness/extraction/LivenessDataModel;

    move-result-object v1

    goto :goto_1

    :cond_3
    move-object v1, v7

    .line 9
    :goto_1
    new-instance v3, Lcom/jumio/sdk/result/JumioFaceResult;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lcom/jumio/core/extraction/liveness/extraction/LivenessDataModel;->isPassed()Ljava/lang/Boolean;

    move-result-object v8

    goto :goto_2

    :cond_4
    move-object v8, v7

    :goto_2
    invoke-direct {v3, v8}, Lcom/jumio/sdk/result/JumioFaceResult;-><init>(Ljava/lang/Boolean;)V

    if-eqz v1, :cond_5

    .line 10
    invoke-virtual {v1}, Lcom/jumio/core/extraction/liveness/extraction/LivenessDataModel;->getType()Lcom/jumio/core/data/ScanMode;

    move-result-object v1

    goto :goto_3

    :cond_5
    move-object v1, v7

    :goto_3
    if-nez v1, :cond_6

    const/4 v1, -0x1

    goto :goto_4

    :cond_6
    sget-object v8, Ljumio/core/m0;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v8, v1

    :goto_4
    if-eq v1, v4, :cond_9

    if-eq v1, v6, :cond_8

    if-eq v1, v5, :cond_7

    goto :goto_5

    .line 11
    :cond_7
    sget-object v7, Lcom/jumio/sdk/enums/JumioScanMode;->JUMIO_PREMIUM:Lcom/jumio/sdk/enums/JumioScanMode;

    goto :goto_5

    .line 12
    :cond_8
    sget-object v7, Lcom/jumio/sdk/enums/JumioScanMode;->JUMIO_LIVENESS:Lcom/jumio/sdk/enums/JumioScanMode;

    goto :goto_5

    .line 13
    :cond_9
    sget-object v7, Lcom/jumio/sdk/enums/JumioScanMode;->FACE_MANUAL:Lcom/jumio/sdk/enums/JumioScanMode;

    .line 14
    :goto_5
    invoke-virtual {v3, v7}, Lcom/jumio/sdk/result/JumioCredentialResult;->setExtractionMode$jumio_core_release(Lcom/jumio/sdk/enums/JumioScanMode;)V

    goto :goto_6

    .line 15
    :cond_a
    new-instance v8, Lcom/jumio/sdk/result/JumioIDResult;

    const v31, 0x3fffff

    const/16 v32, 0x0

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

    const/16 v29, 0x0

    const/16 v30, 0x0

    invoke-direct/range {v8 .. v32}, Lcom/jumio/sdk/result/JumioIDResult;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v3, v8

    .line 16
    :goto_6
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    :cond_b
    check-cast v3, Lcom/jumio/sdk/result/JumioCredentialResult;

    return-object v3
.end method

.method public static final synthetic access$checkWorkflow(Lcom/jumio/core/Controller;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/jumio/core/Controller;->a()V

    .line 4
    return-void
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

.method public static final synthetic access$getControllerInterface$p(Lcom/jumio/core/Controller;)Lcom/jumio/sdk/interfaces/JumioControllerInterface;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/jumio/core/Controller;->i:Lcom/jumio/sdk/interfaces/JumioControllerInterface;

    .line 3
    return-object p0
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

.method public static final synthetic access$getInitializeWorkflowJob$p(Lcom/jumio/core/Controller;)Lkotlinx/coroutines/x1;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/jumio/core/Controller;->l:Lkotlinx/coroutines/x1;

    .line 3
    return-object p0
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

.method public static final synthetic access$getLastError$p(Lcom/jumio/core/Controller;)Lcom/jumio/sdk/error/JumioError;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/jumio/core/Controller;->k:Lcom/jumio/sdk/error/JumioError;

    .line 3
    return-object p0
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

.method public static final access$isModelPreloaded(Lcom/jumio/core/Controller;)Z
    .locals 7

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/Controller;->d:Lcom/jumio/core/persistence/DataManager;

    .line 3
    .line 4
    const-class v1, Lcom/jumio/core/models/CredentialsModel;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    check-cast v0, Lcom/jumio/core/models/CredentialsModel;

    .line 11
    .line 12
    iget-object v1, v0, Lcom/jumio/core/models/CredentialsModel;->a:Ljava/util/List;

    .line 13
    .line 14
    .line 15
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    move-result v2

    .line 21
    const/4 v3, 0x0

    .line 22
    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    .line 26
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    move-result-object v2

    .line 28
    move-object v4, v2

    .line 29
    .line 30
    check-cast v4, Lcom/jumio/core/models/CredentialDataModel;

    .line 31
    .line 32
    iget-object v4, v4, Lcom/jumio/core/models/CredentialDataModel;->b:Lcom/jumio/sdk/credentials/JumioCredentialCategory;

    .line 33
    .line 34
    sget-object v5, Lcom/jumio/sdk/credentials/JumioCredentialCategory;->ID:Lcom/jumio/sdk/credentials/JumioCredentialCategory;

    .line 35
    .line 36
    if-ne v4, v5, :cond_0

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    move-object v2, v3

    .line 39
    .line 40
    :goto_0
    check-cast v2, Lcom/jumio/core/models/CredentialDataModel;

    .line 41
    const/4 v1, 0x1

    .line 42
    .line 43
    if-eqz v2, :cond_3

    .line 44
    .line 45
    iget-object v2, p0, Lcom/jumio/core/Controller;->f:Lcom/jumio/core/plugins/PluginRegistryInterface;

    .line 46
    .line 47
    sget-object v4, Ljumio/core/W2;->e:Ljumio/core/W2;

    .line 48
    .line 49
    .line 50
    invoke-interface {v2, v4}, Lcom/jumio/core/plugins/PluginRegistryInterface;->getPlugin(Ljumio/core/W2;)Lcom/jumio/core/plugins/Plugin;

    .line 51
    move-result-object v2

    .line 52
    .line 53
    check-cast v2, Lcom/jumio/core/plugins/ExtractionPlugin;

    .line 54
    .line 55
    if-eqz v2, :cond_2

    .line 56
    .line 57
    .line 58
    invoke-interface {v2, p0}, Lcom/jumio/core/plugins/Plugin;->isPreloaded(Lcom/jumio/core/Controller;)Z

    .line 59
    move-result v2

    .line 60
    .line 61
    .line 62
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 63
    move-result-object v2

    .line 64
    goto :goto_1

    .line 65
    :cond_2
    move-object v2, v3

    .line 66
    .line 67
    :goto_1
    if-eqz v2, :cond_3

    .line 68
    .line 69
    .line 70
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 71
    move-result v2

    .line 72
    goto :goto_2

    .line 73
    :cond_3
    move v2, v1

    .line 74
    .line 75
    :goto_2
    iget-object v0, v0, Lcom/jumio/core/models/CredentialsModel;->a:Ljava/util/List;

    .line 76
    .line 77
    .line 78
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 79
    move-result-object v0

    .line 80
    .line 81
    .line 82
    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 83
    move-result v4

    .line 84
    .line 85
    if-eqz v4, :cond_5

    .line 86
    .line 87
    .line 88
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 89
    move-result-object v4

    .line 90
    move-object v5, v4

    .line 91
    .line 92
    check-cast v5, Lcom/jumio/core/models/CredentialDataModel;

    .line 93
    .line 94
    iget-object v5, v5, Lcom/jumio/core/models/CredentialDataModel;->b:Lcom/jumio/sdk/credentials/JumioCredentialCategory;

    .line 95
    .line 96
    sget-object v6, Lcom/jumio/sdk/credentials/JumioCredentialCategory;->FACE:Lcom/jumio/sdk/credentials/JumioCredentialCategory;

    .line 97
    .line 98
    if-ne v5, v6, :cond_4

    .line 99
    goto :goto_3

    .line 100
    :cond_5
    move-object v4, v3

    .line 101
    .line 102
    :goto_3
    check-cast v4, Lcom/jumio/core/models/CredentialDataModel;

    .line 103
    .line 104
    if-eqz v4, :cond_7

    .line 105
    .line 106
    iget-object v0, p0, Lcom/jumio/core/Controller;->f:Lcom/jumio/core/plugins/PluginRegistryInterface;

    .line 107
    .line 108
    sget-object v4, Ljumio/core/W2;->k:Ljumio/core/W2;

    .line 109
    .line 110
    .line 111
    invoke-interface {v0, v4}, Lcom/jumio/core/plugins/PluginRegistryInterface;->getPlugin(Ljumio/core/W2;)Lcom/jumio/core/plugins/Plugin;

    .line 112
    move-result-object v0

    .line 113
    .line 114
    check-cast v0, Lcom/jumio/core/plugins/ExtractionPlugin;

    .line 115
    .line 116
    if-eqz v0, :cond_6

    .line 117
    .line 118
    .line 119
    invoke-interface {v0, p0}, Lcom/jumio/core/plugins/Plugin;->isPreloaded(Lcom/jumio/core/Controller;)Z

    .line 120
    move-result p0

    .line 121
    .line 122
    .line 123
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 124
    move-result-object v3

    .line 125
    .line 126
    :cond_6
    if-eqz v3, :cond_7

    .line 127
    .line 128
    .line 129
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 130
    move-result p0

    .line 131
    goto :goto_4

    .line 132
    :cond_7
    move p0, v1

    .line 133
    .line 134
    :goto_4
    if-eqz v2, :cond_8

    .line 135
    .line 136
    if-eqz p0, :cond_8

    .line 137
    return v1

    .line 138
    :cond_8
    const/4 p0, 0x0

    .line 139
    return p0
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

.method public static final access$onSettingsCallResult(Lcom/jumio/core/Controller;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/Controller;->h:Lcom/jumio/core/scope/ScopeProviderInterface;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lcom/jumio/core/scope/ScopeProviderInterface;->getBackgroundDispatcher()Lkotlinx/coroutines/j0;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    new-instance v1, Ljumio/core/r0;

    .line 9
    const/4 v2, 0x0

    .line 10
    .line 11
    .line 12
    invoke-direct {v1, p0, p1, v2}, Ljumio/core/r0;-><init>(Lcom/jumio/core/Controller;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1, p2}, Lkotlinx/coroutines/h;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 16
    move-result-object p0

    .line 17
    .line 18
    .line 19
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 20
    move-result-object p1

    .line 21
    .line 22
    if-ne p0, p1, :cond_0

    .line 23
    return-object p0

    .line 24
    .line 25
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 26
    return-object p0
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
.end method

.method public static final access$scheduleWorkflow(Lcom/jumio/core/Controller;)V
    .locals 7

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/Controller;->h:Lcom/jumio/core/scope/ScopeProviderInterface;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lcom/jumio/core/scope/ScopeProviderInterface;->getIoScope()Lkotlinx/coroutines/m0;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    new-instance v4, Ljumio/core/t0;

    .line 9
    const/4 v0, 0x0

    .line 10
    .line 11
    .line 12
    invoke-direct {v4, p0, v0}, Ljumio/core/t0;-><init>(Lcom/jumio/core/Controller;Lkotlin/coroutines/Continuation;)V

    .line 13
    const/4 v5, 0x3

    .line 14
    const/4 v6, 0x0

    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    .line 18
    .line 19
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    iput-object v0, p0, Lcom/jumio/core/Controller;->l:Lkotlinx/coroutines/x1;

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    .line 27
    invoke-interface {v0}, Lkotlinx/coroutines/x1;->start()Z

    .line 28
    :cond_0
    return-void
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

.method public static final access$setupCDNFeatures(Lcom/jumio/core/Controller;Lorg/json/JSONObject;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    const-string v0, "cdnEnc"

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iget-object p0, p0, Lcom/jumio/core/Controller;->d:Lcom/jumio/core/persistence/DataManager;

    .line 14
    .line 15
    const-class v0, Lcom/jumio/core/cdn/CDNFeatureModel;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v0}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    .line 19
    move-result-object p0

    .line 20
    .line 21
    check-cast p0, Lcom/jumio/core/cdn/CDNFeatureModel;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p1}, Lcom/jumio/core/cdn/CDNFeatureModel;->setup(Lorg/json/JSONArray;)V

    .line 25
    :cond_0
    return-void
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
.end method

.method public static final access$setupCameraChallenge(Lcom/jumio/core/Controller;Lorg/json/JSONObject;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    const-string v0, "cameraChallenge"

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iget-object p0, p0, Lcom/jumio/core/Controller;->d:Lcom/jumio/core/persistence/DataManager;

    .line 14
    .line 15
    sget-object v0, Lcom/jumio/core/models/CameraChallengeModel;->b:Lcom/jumio/core/models/CameraChallengeModel$Companion;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lcom/jumio/core/models/CameraChallengeModel$Companion;->fromJson(Lorg/json/JSONArray;)Lcom/jumio/core/models/CameraChallengeModel;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    const-class v0, Lcom/jumio/core/models/CameraChallengeModel;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v0, p1}, Lcom/jumio/core/persistence/DataManager;->put(Ljava/lang/Class;Ljava/io/Serializable;)V

    .line 25
    :cond_0
    return-void
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
.end method

.method public static final access$setupCameraData(Lcom/jumio/core/Controller;Lorg/json/JSONObject;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    const-string v0, "cameraData"

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iget-object p0, p0, Lcom/jumio/core/Controller;->d:Lcom/jumio/core/persistence/DataManager;

    .line 14
    .line 15
    sget-object v0, Lcom/jumio/core/camera/CameraDataSettingsModel;->Companion:Lcom/jumio/core/camera/CameraDataSettingsModel$Companion;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lcom/jumio/core/camera/CameraDataSettingsModel$Companion;->fromJson(Lorg/json/JSONObject;)Lcom/jumio/core/camera/CameraDataSettingsModel;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    const-class v0, Lcom/jumio/core/camera/CameraDataSettingsModel;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v0, p1}, Lcom/jumio/core/persistence/DataManager;->put(Ljava/lang/Class;Ljava/io/Serializable;)V

    .line 25
    :cond_0
    return-void
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
.end method

.method public static final access$setupConsent(Lcom/jumio/core/Controller;Lorg/json/JSONObject;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    const-string v0, "consents"

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iget-object p0, p0, Lcom/jumio/core/Controller;->d:Lcom/jumio/core/persistence/DataManager;

    .line 14
    .line 15
    sget-object v0, Lcom/jumio/core/models/ConsentModel;->Companion:Lcom/jumio/core/models/ConsentModel$Companion;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lcom/jumio/core/models/ConsentModel$Companion;->fromJson(Lorg/json/JSONArray;)Lcom/jumio/core/models/ConsentModel;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    const-class v0, Lcom/jumio/core/models/ConsentModel;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v0, p1}, Lcom/jumio/core/persistence/DataManager;->put(Ljava/lang/Class;Ljava/io/Serializable;)V

    .line 25
    :cond_0
    return-void
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
.end method

.method public static final access$setupCountryDocuments(Lcom/jumio/core/Controller;Lorg/json/JSONObject;)V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    const-string v0, "supportedCountries"

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lcom/jumio/core/Controller;->d:Lcom/jumio/core/persistence/DataManager;

    .line 14
    .line 15
    new-instance v1, Lcom/jumio/core/models/CountryDocumentModel;

    .line 16
    .line 17
    new-instance v2, Lcom/jumio/core/data/document/DefaultCountryDocumentProvider;

    .line 18
    .line 19
    sget-object v3, Lcom/jumio/core/util/LocaleUtil;->INSTANCE:Lcom/jumio/core/util/LocaleUtil;

    .line 20
    .line 21
    iget-object p0, p0, Lcom/jumio/core/Controller;->b:Lcom/jumio/core/MobileContext;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v3, p0}, Lcom/jumio/core/util/LocaleUtil;->checkForLocalization(Landroid/content/Context;)Z

    .line 25
    move-result p0

    .line 26
    .line 27
    .line 28
    invoke-direct {v2, p1, p0}, Lcom/jumio/core/data/document/DefaultCountryDocumentProvider;-><init>(Lorg/json/JSONArray;Z)V

    .line 29
    .line 30
    .line 31
    invoke-direct {v1, v2}, Lcom/jumio/core/models/CountryDocumentModel;-><init>(Lcom/jumio/core/data/document/CountryDocumentProviderInterface;)V

    .line 32
    .line 33
    const-class p0, Lcom/jumio/core/models/CountryDocumentModel;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, p0, v1}, Lcom/jumio/core/persistence/DataManager;->put(Ljava/lang/Class;Ljava/io/Serializable;)V

    .line 37
    :cond_0
    return-void
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
.end method

.method public static final access$setupCredentials(Lcom/jumio/core/Controller;Lorg/json/JSONObject;)V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    const-string v0, "credentials"

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    const-string v0, "No credentials available"

    .line 12
    .line 13
    if-eqz p1, :cond_b

    .line 14
    .line 15
    sget-object v1, Lcom/jumio/core/models/CredentialsModel;->d:Lcom/jumio/core/models/CredentialsModel$Companion;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, p1}, Lcom/jumio/core/models/CredentialsModel$Companion;->fromJson(Lorg/json/JSONArray;)Lcom/jumio/core/models/CredentialsModel;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    if-eqz p1, :cond_b

    .line 22
    .line 23
    iget-object v1, p0, Lcom/jumio/core/Controller;->d:Lcom/jumio/core/persistence/DataManager;

    .line 24
    .line 25
    const-class v2, Lcom/jumio/core/models/CredentialsModel;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v2, p1}, Lcom/jumio/core/persistence/DataManager;->put(Ljava/lang/Class;Ljava/io/Serializable;)V

    .line 29
    .line 30
    iget-object v1, p1, Lcom/jumio/core/models/CredentialsModel;->a:Ljava/util/List;

    .line 31
    .line 32
    .line 33
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 34
    move-result v1

    .line 35
    .line 36
    if-nez v1, :cond_a

    .line 37
    .line 38
    iget-object v0, p1, Lcom/jumio/core/models/CredentialsModel;->a:Ljava/util/List;

    .line 39
    .line 40
    .line 41
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 42
    move-result-object v0

    .line 43
    .line 44
    .line 45
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    move-result v1

    .line 47
    const/4 v2, 0x0

    .line 48
    .line 49
    if-eqz v1, :cond_1

    .line 50
    .line 51
    .line 52
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    move-result-object v1

    .line 54
    move-object v3, v1

    .line 55
    .line 56
    check-cast v3, Lcom/jumio/core/models/CredentialDataModel;

    .line 57
    .line 58
    iget-object v3, v3, Lcom/jumio/core/models/CredentialDataModel;->b:Lcom/jumio/sdk/credentials/JumioCredentialCategory;

    .line 59
    .line 60
    sget-object v4, Lcom/jumio/sdk/credentials/JumioCredentialCategory;->ID:Lcom/jumio/sdk/credentials/JumioCredentialCategory;

    .line 61
    .line 62
    if-ne v3, v4, :cond_0

    .line 63
    goto :goto_0

    .line 64
    :cond_1
    move-object v1, v2

    .line 65
    .line 66
    :goto_0
    check-cast v1, Lcom/jumio/core/models/CredentialDataModel;

    .line 67
    .line 68
    if-eqz v1, :cond_3

    .line 69
    .line 70
    iget-object v0, p0, Lcom/jumio/core/Controller;->f:Lcom/jumio/core/plugins/PluginRegistryInterface;

    .line 71
    .line 72
    sget-object v1, Ljumio/core/W2;->e:Ljumio/core/W2;

    .line 73
    .line 74
    .line 75
    invoke-interface {v0, v1}, Lcom/jumio/core/plugins/PluginRegistryInterface;->getPlugin(Ljumio/core/W2;)Lcom/jumio/core/plugins/Plugin;

    .line 76
    move-result-object v0

    .line 77
    .line 78
    check-cast v0, Lcom/jumio/core/plugins/ExtractionPlugin;

    .line 79
    .line 80
    if-eqz v0, :cond_2

    .line 81
    .line 82
    .line 83
    invoke-interface {v0, p0}, Lcom/jumio/core/plugins/Plugin;->preload(Lcom/jumio/core/Controller;)V

    .line 84
    .line 85
    :cond_2
    iget-object v0, p0, Lcom/jumio/core/Controller;->f:Lcom/jumio/core/plugins/PluginRegistryInterface;

    .line 86
    .line 87
    sget-object v1, Ljumio/core/W2;->i:Ljumio/core/W2;

    .line 88
    .line 89
    .line 90
    invoke-interface {v0, v1}, Lcom/jumio/core/plugins/PluginRegistryInterface;->getPlugin(Ljumio/core/W2;)Lcom/jumio/core/plugins/Plugin;

    .line 91
    move-result-object v0

    .line 92
    .line 93
    check-cast v0, Lcom/jumio/core/plugins/ScanPartPlugin;

    .line 94
    .line 95
    if-eqz v0, :cond_3

    .line 96
    .line 97
    .line 98
    invoke-interface {v0, p0}, Lcom/jumio/core/plugins/Plugin;->preload(Lcom/jumio/core/Controller;)V

    .line 99
    .line 100
    :cond_3
    iget-object v0, p1, Lcom/jumio/core/models/CredentialsModel;->a:Ljava/util/List;

    .line 101
    .line 102
    .line 103
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 104
    move-result-object v0

    .line 105
    .line 106
    .line 107
    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 108
    move-result v1

    .line 109
    .line 110
    if-eqz v1, :cond_5

    .line 111
    .line 112
    .line 113
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 114
    move-result-object v1

    .line 115
    move-object v3, v1

    .line 116
    .line 117
    check-cast v3, Lcom/jumio/core/models/CredentialDataModel;

    .line 118
    .line 119
    iget-object v3, v3, Lcom/jumio/core/models/CredentialDataModel;->b:Lcom/jumio/sdk/credentials/JumioCredentialCategory;

    .line 120
    .line 121
    sget-object v4, Lcom/jumio/sdk/credentials/JumioCredentialCategory;->FACE:Lcom/jumio/sdk/credentials/JumioCredentialCategory;

    .line 122
    .line 123
    if-ne v3, v4, :cond_4

    .line 124
    goto :goto_1

    .line 125
    :cond_5
    move-object v1, v2

    .line 126
    .line 127
    :goto_1
    check-cast v1, Lcom/jumio/core/models/CredentialDataModel;

    .line 128
    .line 129
    if-eqz v1, :cond_6

    .line 130
    .line 131
    iget-object v0, p0, Lcom/jumio/core/Controller;->f:Lcom/jumio/core/plugins/PluginRegistryInterface;

    .line 132
    .line 133
    sget-object v1, Ljumio/core/W2;->k:Ljumio/core/W2;

    .line 134
    .line 135
    .line 136
    invoke-interface {v0, v1}, Lcom/jumio/core/plugins/PluginRegistryInterface;->getPlugin(Ljumio/core/W2;)Lcom/jumio/core/plugins/Plugin;

    .line 137
    move-result-object v0

    .line 138
    .line 139
    check-cast v0, Lcom/jumio/core/plugins/ExtractionPlugin;

    .line 140
    .line 141
    if-eqz v0, :cond_6

    .line 142
    .line 143
    .line 144
    invoke-interface {v0, p0}, Lcom/jumio/core/plugins/Plugin;->preload(Lcom/jumio/core/Controller;)V

    .line 145
    .line 146
    :cond_6
    iget-object p1, p1, Lcom/jumio/core/models/CredentialsModel;->a:Ljava/util/List;

    .line 147
    .line 148
    .line 149
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 150
    move-result-object p1

    .line 151
    .line 152
    .line 153
    :cond_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 154
    move-result v0

    .line 155
    .line 156
    if-eqz v0, :cond_8

    .line 157
    .line 158
    .line 159
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 160
    move-result-object v0

    .line 161
    move-object v1, v0

    .line 162
    .line 163
    check-cast v1, Lcom/jumio/core/models/CredentialDataModel;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v1, p0}, Lcom/jumio/core/models/CredentialDataModel;->a(Lcom/jumio/core/Controller;)Z

    .line 167
    move-result v1

    .line 168
    .line 169
    if-eqz v1, :cond_7

    .line 170
    move-object v2, v0

    .line 171
    .line 172
    :cond_8
    if-nez v2, :cond_9

    .line 173
    return-void

    .line 174
    .line 175
    :cond_9
    new-instance p0, Ljava/lang/Exception;

    .line 176
    .line 177
    const-string p1, "Credential not supported"

    .line 178
    .line 179
    .line 180
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 181
    throw p0

    .line 182
    .line 183
    :cond_a
    new-instance p0, Ljava/lang/Exception;

    .line 184
    .line 185
    .line 186
    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 187
    throw p0

    .line 188
    .line 189
    :cond_b
    new-instance p0, Ljava/lang/Exception;

    .line 190
    .line 191
    .line 192
    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 193
    throw p0
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
.end method

.method public static final access$setupDocfinderSettings(Lcom/jumio/core/Controller;Lorg/json/JSONObject;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    const-string v0, "docFinder"

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iget-object p0, p0, Lcom/jumio/core/Controller;->d:Lcom/jumio/core/persistence/DataManager;

    .line 14
    .line 15
    sget-object v0, Lcom/jumio/core/models/DocfinderSettingsModel;->Companion:Lcom/jumio/core/models/DocfinderSettingsModel$Companion;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lcom/jumio/core/models/DocfinderSettingsModel$Companion;->fromJson(Lorg/json/JSONObject;)Lcom/jumio/core/models/DocfinderSettingsModel;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    const-class v0, Lcom/jumio/core/models/DocfinderSettingsModel;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v0, p1}, Lcom/jumio/core/persistence/DataManager;->put(Ljava/lang/Class;Ljava/io/Serializable;)V

    .line 25
    :cond_0
    return-void
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
.end method

.method public static final access$setupDocuments(Lcom/jumio/core/Controller;Lorg/json/JSONObject;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    const-string v0, "supportedDocumentTypes"

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iget-object p0, p0, Lcom/jumio/core/Controller;->d:Lcom/jumio/core/persistence/DataManager;

    .line 14
    .line 15
    sget-object v0, Lcom/jumio/core/models/DocumentModel;->b:Lcom/jumio/core/models/DocumentModel$Companion;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lcom/jumio/core/models/DocumentModel$Companion;->fromJson(Lorg/json/JSONArray;)Lcom/jumio/core/models/DocumentModel;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    const-class v0, Lcom/jumio/core/models/DocumentModel;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v0, p1}, Lcom/jumio/core/persistence/DataManager;->put(Ljava/lang/Class;Ljava/io/Serializable;)V

    .line 25
    :cond_0
    return-void
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
.end method

.method public static final access$setupInitiateModel(Lcom/jumio/core/Controller;Lorg/json/JSONObject;)Lcom/jumio/core/models/InitiateModel;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    sget-object v0, Lcom/jumio/core/models/InitiateModel;->e:Lcom/jumio/core/models/InitiateModel$Companion;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/jumio/core/models/InitiateModel$Companion;->fromJson(Lorg/json/JSONObject;)Lcom/jumio/core/models/InitiateModel;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    iget-object p0, p0, Lcom/jumio/core/Controller;->d:Lcom/jumio/core/persistence/DataManager;

    .line 12
    .line 13
    const-class v0, Lcom/jumio/core/models/InitiateModel;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0, p1}, Lcom/jumio/core/persistence/DataManager;->put(Ljava/lang/Class;Ljava/io/Serializable;)V

    .line 17
    .line 18
    .line 19
    invoke-static {}, Lcom/jumio/commons/log/Log;->isFileLoggingActivated()Z

    .line 20
    move-result p0

    .line 21
    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    sget-object p0, Lcom/jumio/commons/log/LogUtils;->INSTANCE:Lcom/jumio/commons/log/LogUtils;

    .line 25
    .line 26
    new-instance v0, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    const-string v1, "SDK_"

    .line 29
    .line 30
    .line 31
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/jumio/core/models/InitiateModel;->getWorkflowExecutionId()Ljava/lang/String;

    .line 35
    move-result-object v1

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    move-result-object v0

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, v0}, Lcom/jumio/commons/log/LogUtils;->setSessionLogFolderName(Ljava/lang/String;)V

    .line 46
    :cond_0
    return-object p1
    .line 47
.end method

.method public static final access$setupLegalStatements(Lcom/jumio/core/Controller;Lorg/json/JSONObject;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    const-string v0, "idFoundLegalStatement"

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iget-object p0, p0, Lcom/jumio/core/Controller;->d:Lcom/jumio/core/persistence/DataManager;

    .line 14
    .line 15
    sget-object v0, Lcom/jumio/core/models/LegalStatementModel;->d:Lcom/jumio/core/models/LegalStatementModel$Companion;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lcom/jumio/core/models/LegalStatementModel$Companion;->fromJson(Lorg/json/JSONObject;)Lcom/jumio/core/models/LegalStatementModel;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    const-class v0, Lcom/jumio/core/models/LegalStatementModel;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v0, p1}, Lcom/jumio/core/persistence/DataManager;->put(Ljava/lang/Class;Ljava/io/Serializable;)V

    .line 25
    :cond_0
    return-void
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
.end method

.method public static final access$setupLivenessSettings(Lcom/jumio/core/Controller;Lorg/json/JSONObject;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    const-string v0, "jumioLiveness"

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iget-object p0, p0, Lcom/jumio/core/Controller;->d:Lcom/jumio/core/persistence/DataManager;

    .line 14
    .line 15
    sget-object v0, Lcom/jumio/core/models/LivenessSettingsModel;->Companion:Lcom/jumio/core/models/LivenessSettingsModel$Companion;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lcom/jumio/core/models/LivenessSettingsModel$Companion;->fromJson(Lorg/json/JSONObject;)Lcom/jumio/core/models/LivenessSettingsModel;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    const-class v0, Lcom/jumio/core/models/LivenessSettingsModel;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v0, p1}, Lcom/jumio/core/persistence/DataManager;->put(Ljava/lang/Class;Ljava/io/Serializable;)V

    .line 25
    :cond_0
    return-void
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
.end method

.method public static final access$setupNfcSettings(Lcom/jumio/core/Controller;Lorg/json/JSONObject;)V
    .locals 1

    .line 1
    .line 2
    iget-object p0, p0, Lcom/jumio/core/Controller;->d:Lcom/jumio/core/persistence/DataManager;

    .line 3
    .line 4
    sget-object v0, Lcom/jumio/core/models/NfcSettingsModel;->Companion:Lcom/jumio/core/models/NfcSettingsModel$Companion;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lcom/jumio/core/models/NfcSettingsModel$Companion;->fromJson(Lorg/json/JSONObject;)Lcom/jumio/core/models/NfcSettingsModel;

    .line 8
    move-result-object p1

    .line 9
    .line 10
    const-class v0, Lcom/jumio/core/models/NfcSettingsModel;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0, p1}, Lcom/jumio/core/persistence/DataManager;->put(Ljava/lang/Class;Ljava/io/Serializable;)V

    .line 14
    return-void
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
.end method

.method public static final access$setupSupplementalImages(Lcom/jumio/core/Controller;Lorg/json/JSONObject;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    const-string v0, "supplementalImagesV2"

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iget-object p0, p0, Lcom/jumio/core/Controller;->d:Lcom/jumio/core/persistence/DataManager;

    .line 14
    .line 15
    sget-object v0, Lcom/jumio/core/models/SupplementalImageModel;->Companion:Lcom/jumio/core/models/SupplementalImageModel$Companion;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lcom/jumio/core/models/SupplementalImageModel$Companion;->fromJson(Lorg/json/JSONArray;)Lcom/jumio/core/models/SupplementalImageModel;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    const-class v0, Lcom/jumio/core/models/SupplementalImageModel;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v0, p1}, Lcom/jumio/core/persistence/DataManager;->put(Ljava/lang/Class;Ljava/io/Serializable;)V

    .line 25
    :cond_0
    return-void
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
.end method

.method public static final access$setupTermsOfUse(Lcom/jumio/core/Controller;Lorg/json/JSONObject;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    const-string v0, "termsOfUse"

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    sget-object v0, Lcom/jumio/core/models/TermsOfUseModel;->b:Lcom/jumio/core/models/TermsOfUseModel$Companion;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Lcom/jumio/core/models/TermsOfUseModel$Companion;->fromJson(Lorg/json/JSONObject;)Lcom/jumio/core/models/TermsOfUseModel;

    .line 17
    move-result-object p1

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    iget-object p0, p0, Lcom/jumio/core/Controller;->d:Lcom/jumio/core/persistence/DataManager;

    .line 22
    .line 23
    const-class v0, Lcom/jumio/core/models/TermsOfUseModel;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v0, p1}, Lcom/jumio/core/persistence/DataManager;->put(Ljava/lang/Class;Ljava/io/Serializable;)V

    .line 27
    :cond_0
    return-void
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
.end method

.method public static final access$setupTime(Lcom/jumio/core/Controller;Lorg/json/JSONObject;)V
    .locals 6

    .line 1
    .line 2
    iget-object p0, p0, Lcom/jumio/core/Controller;->d:Lcom/jumio/core/persistence/DataManager;

    .line 3
    .line 4
    sget-object v0, Lcom/jumio/core/models/TimeModel;->Companion:Lcom/jumio/core/models/TimeModel$Companion;

    .line 5
    const/4 v4, 0x2

    .line 6
    const/4 v5, 0x0

    .line 7
    .line 8
    const-wide/16 v2, 0x0

    .line 9
    move-object v1, p1

    .line 10
    .line 11
    .line 12
    invoke-static/range {v0 .. v5}, Lcom/jumio/core/models/TimeModel$Companion;->fromJson$default(Lcom/jumio/core/models/TimeModel$Companion;Lorg/json/JSONObject;JILjava/lang/Object;)Lcom/jumio/core/models/TimeModel;

    .line 13
    move-result-object p1

    .line 14
    .line 15
    const-class v0, Lcom/jumio/core/models/TimeModel;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v0, p1}, Lcom/jumio/core/persistence/DataManager;->put(Ljava/lang/Class;Ljava/io/Serializable;)V

    .line 19
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
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
.end method

.method public static final access$setupTimeouts(Lcom/jumio/core/Controller;Lorg/json/JSONObject;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    const-string v0, "networkTimeouts"

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iget-object p0, p0, Lcom/jumio/core/Controller;->d:Lcom/jumio/core/persistence/DataManager;

    .line 14
    .line 15
    sget-object v0, Lcom/jumio/core/models/TimeoutModel;->Companion:Lcom/jumio/core/models/TimeoutModel$Companion;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lcom/jumio/core/models/TimeoutModel$Companion;->fromJson(Lorg/json/JSONObject;)Lcom/jumio/core/models/TimeoutModel;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    const-class v0, Lcom/jumio/core/models/TimeoutModel;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v0, p1}, Lcom/jumio/core/persistence/DataManager;->put(Ljava/lang/Class;Ljava/io/Serializable;)V

    .line 25
    :cond_0
    return-void
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
.end method

.method public static final access$setupUploadSettings(Lcom/jumio/core/Controller;Lorg/json/JSONObject;)V
    .locals 1

    .line 1
    .line 2
    iget-object p0, p0, Lcom/jumio/core/Controller;->d:Lcom/jumio/core/persistence/DataManager;

    .line 3
    .line 4
    sget-object v0, Lcom/jumio/core/models/UploadSettingsModel;->Companion:Lcom/jumio/core/models/UploadSettingsModel$Companion;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lcom/jumio/core/models/UploadSettingsModel$Companion;->fromJson(Lorg/json/JSONObject;)Lcom/jumio/core/models/UploadSettingsModel;

    .line 8
    move-result-object p1

    .line 9
    .line 10
    const-class v0, Lcom/jumio/core/models/UploadSettingsModel;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0, p1}, Lcom/jumio/core/persistence/DataManager;->put(Ljava/lang/Class;Ljava/io/Serializable;)V

    .line 14
    return-void
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
.end method

.method public static synthetic onError$default(Lcom/jumio/core/Controller;Ljava/lang/Throwable;Ljava/lang/Class;ILjava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    and-int/lit8 p3, p3, 0x2

    .line 3
    .line 4
    if-eqz p3, :cond_0

    .line 5
    .line 6
    const-class p2, Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/jumio/core/Controller;->onError(Ljava/lang/Throwable;Ljava/lang/Class;)V

    .line 10
    return-void
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
.method public final a()V
    .locals 13

    .line 18
    iget-object v0, p0, Lcom/jumio/core/Controller;->d:Lcom/jumio/core/persistence/DataManager;

    const-class v1, Lcom/jumio/core/models/SettingsModel;

    invoke-virtual {v0, v1}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/jumio/core/models/SettingsModel;

    .line 19
    iget-object v2, p0, Lcom/jumio/core/Controller;->g:Lcom/jumio/analytics/Analytics;

    invoke-virtual {v0}, Lcom/jumio/core/models/SettingsModel;->isAnalyticsEnabled()Z

    move-result v0

    const-wide/16 v3, 0x4e20

    const/16 v5, 0x14

    invoke-virtual {v2, v0, v3, v4, v5}, Lcom/jumio/analytics/Analytics;->start(ZJI)V

    .line 20
    iget-object v0, p0, Lcom/jumio/core/Controller;->b:Lcom/jumio/core/MobileContext;

    iget-object v2, p0, Lcom/jumio/core/Controller;->d:Lcom/jumio/core/persistence/DataManager;

    .line 21
    const-string v3, "context"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "dataManager"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    invoke-virtual {v2, v1}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    move-result-object v1

    check-cast v1, Lcom/jumio/core/models/SettingsModel;

    .line 23
    invoke-virtual {v1}, Lcom/jumio/core/models/SettingsModel;->isAdditionalDataPointsEnabled()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_2

    .line 24
    :cond_0
    const-class v3, Lcom/jumio/core/models/AdditionalDataPointsModel;

    invoke-virtual {v2, v3}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/jumio/core/models/AdditionalDataPointsModel;

    .line 25
    :try_start_0
    invoke-static {v0}, Ljumio/core/J0;->d(Landroid/content/Context;)Lkotlin/Pair;

    move-result-object v2

    .line 26
    invoke-static {v0}, Ljumio/core/q3;->a(Landroid/content/Context;)Z

    move-result v8

    .line 27
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object v4

    .line 28
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-virtual {v4, v5, v6}, Ljava/util/TimeZone;->getOffset(J)I

    move-result v4

    const v5, 0x36ee80

    div-int v7, v4, v5

    .line 29
    sget-object v4, Lcom/jumio/core/util/LocaleUtil;->INSTANCE:Lcom/jumio/core/util/LocaleUtil;

    invoke-virtual {v4, v0}, Lcom/jumio/core/util/LocaleUtil;->getLocale(Landroid/content/Context;)Ljava/util/Locale;

    move-result-object v4

    if-eqz v4, :cond_1

    .line 30
    invoke-virtual {v4}, Ljava/util/Locale;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v6, "toString(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    invoke-static {v4}, Lcom/jumio/core/util/LocaleUtilKt;->getAlpha3Country(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v9, v4

    move-object v4, v5

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    .line 32
    :cond_1
    const-string v5, ""

    move-object v4, v5

    move-object v9, v4

    .line 33
    :goto_0
    :try_start_1
    invoke-virtual {v2}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    .line 34
    invoke-virtual {v2}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v6

    .line 35
    invoke-virtual {v1}, Lcom/jumio/core/models/SettingsModel;->getCountryForIp()Ljava/lang/String;

    move-result-object v10

    .line 36
    invoke-virtual {v1}, Lcom/jumio/core/models/SettingsModel;->getStateForIp()Ljava/lang/String;

    move-result-object v11

    .line 37
    invoke-static {v0}, Ljumio/core/J0;->b(Landroid/content/Context;)Ljava/util/List;

    move-result-object v12

    .line 38
    invoke-virtual/range {v3 .. v12}, Lcom/jumio/core/models/AdditionalDataPointsModel;->a(Ljava/lang/String;IIIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    .line 39
    :goto_1
    const-string v1, "Failed to build analytics data points model"

    invoke-static {v1, v0}, Lcom/jumio/commons/log/Log;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 40
    :goto_2
    sget-object v0, Lcom/jumio/analytics/Analytics;->Companion:Lcom/jumio/analytics/Analytics$Companion;

    iget-object v1, p0, Lcom/jumio/core/Controller;->b:Lcom/jumio/core/MobileContext;

    invoke-static {v1}, Lcom/jumio/analytics/MobileEvents;->deviceInformation(Landroid/content/Context;)Lcom/jumio/analytics/AnalyticsEvent;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/jumio/analytics/Analytics$Companion;->add(Lcom/jumio/analytics/AnalyticsEvent;)V

    .line 41
    iget-object v1, p0, Lcom/jumio/core/Controller;->b:Lcom/jumio/core/MobileContext;

    .line 42
    iget-object v2, p0, Lcom/jumio/core/Controller;->d:Lcom/jumio/core/persistence/DataManager;

    .line 43
    iget-object v3, p0, Lcom/jumio/core/Controller;->a:Lcom/jumio/core/models/AuthorizationModel;

    .line 44
    iget-object v4, p0, Lcom/jumio/core/Controller;->f:Lcom/jumio/core/plugins/PluginRegistryInterface;

    .line 45
    sget-object v5, Lcom/jumio/core/util/ReflectionUtil;->INSTANCE:Lcom/jumio/core/util/ReflectionUtil;

    const-string v6, "com.jumio.defaultui.utils.DefaultUIProvider"

    invoke-virtual {v5, v6}, Lcom/jumio/core/util/ReflectionUtil;->getClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    if-eqz v5, :cond_2

    .line 46
    invoke-static {v5}, Lkotlin/jvm/JvmClassMappingKt;->getKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v5

    if-eqz v5, :cond_2

    iget-object v6, p0, Lcom/jumio/core/Controller;->i:Lcom/jumio/sdk/interfaces/JumioControllerInterface;

    invoke-interface {v5, v6}, Lkotlin/reflect/KClass;->isInstance(Ljava/lang/Object;)Z

    move-result v5

    goto :goto_3

    :cond_2
    const/4 v5, 0x0

    .line 47
    :goto_3
    invoke-static {v1, v2, v3, v4, v5}, Lcom/jumio/analytics/MobileEvents;->sdkParameters(Landroid/content/Context;Lcom/jumio/core/persistence/DataManager;Lcom/jumio/core/models/AuthorizationModel;Lcom/jumio/core/plugins/PluginRegistryInterface;Z)Lcom/jumio/analytics/AnalyticsEvent;

    move-result-object v1

    .line 48
    invoke-virtual {v0, v1}, Lcom/jumio/analytics/Analytics$Companion;->add(Lcom/jumio/analytics/AnalyticsEvent;)V

    .line 49
    iget-object v0, p0, Lcom/jumio/core/Controller;->d:Lcom/jumio/core/persistence/DataManager;

    const-class v1, Lcom/jumio/core/models/ConsentModel;

    invoke-virtual {v0, v1}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/jumio/core/models/ConsentModel;

    invoke-virtual {v0}, Lcom/jumio/core/models/ConsentModel;->getAllConsented()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_4

    .line 50
    invoke-virtual {p0}, Lcom/jumio/core/Controller;->getUnconsentedItems()Ljava/util/List;

    move-result-object v0

    .line 51
    new-instance v2, Lcom/jumio/analytics/MetaInfo;

    invoke-direct {v2}, Lcom/jumio/analytics/MetaInfo;-><init>()V

    .line 52
    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v0, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 53
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 54
    check-cast v5, Lcom/jumio/sdk/consent/JumioConsentItem;

    .line 55
    invoke-static {v5, v1}, Ljumio/core/k0;->a(Lcom/jumio/sdk/consent/JumioConsentItem;Ljava/lang/Long;)Ljava/util/Map;

    move-result-object v5

    .line 56
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 57
    :cond_3
    const-string v4, "consents"

    invoke-virtual {v2, v4, v3}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    sget-object v3, Lcom/jumio/analytics/Analytics;->Companion:Lcom/jumio/analytics/Analytics$Companion;

    const-string v4, "consentRequired"

    invoke-static {v4, v2}, Lcom/jumio/analytics/MobileEvents;->alert(Ljava/lang/String;Lcom/jumio/analytics/MetaInfo;)Lcom/jumio/analytics/AnalyticsEvent;

    move-result-object v2

    invoke-virtual {v3, v2}, Lcom/jumio/analytics/Analytics$Companion;->add(Lcom/jumio/analytics/AnalyticsEvent;)V

    goto :goto_5

    :cond_4
    move-object v0, v1

    .line 59
    :goto_5
    iget-object v2, p0, Lcom/jumio/core/Controller;->h:Lcom/jumio/core/scope/ScopeProviderInterface;

    new-instance v3, Ljumio/core/o0;

    invoke-direct {v3, p0, v0, v1}, Ljumio/core/o0;-><init>(Lcom/jumio/core/Controller;Ljava/util/List;Lkotlin/coroutines/Continuation;)V

    invoke-interface {v2, v3}, Lcom/jumio/core/scope/ScopeProviderInterface;->runOnMain(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/x1;

    return-void
.end method

.method public final a(Lcom/jumio/sdk/result/JumioCredentialResult;Lcom/jumio/core/models/CredentialDataModel;Lcom/jumio/core/models/SettingsModel;)V
    .locals 4

    .line 76
    invoke-virtual {p3}, Lcom/jumio/core/models/SettingsModel;->getReturnImages()Z

    move-result p3

    if-nez p3, :cond_0

    return-void

    .line 77
    :cond_0
    new-instance p3, Lcom/jumio/sdk/result/JumioImageData;

    iget-object v0, p0, Lcom/jumio/core/Controller;->a:Lcom/jumio/core/models/AuthorizationModel;

    invoke-direct {p3, v0}, Lcom/jumio/sdk/result/JumioImageData;-><init>(Lcom/jumio/core/models/AuthorizationModel;)V

    .line 78
    iget-object p2, p2, Lcom/jumio/core/models/CredentialDataModel;->e:Ljava/util/SortedMap;

    .line 79
    invoke-interface {p2}, Ljava/util/SortedMap;->values()Ljava/util/Collection;

    move-result-object p2

    const-string v0, "<get-values>(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jumio/core/models/ScanPartModel;

    .line 81
    invoke-virtual {v0}, Lcom/jumio/core/models/ScanPartModel;->getFileData()Lcom/jumio/core/data/scan/FileDataInterface;

    move-result-object v1

    invoke-interface {v1}, Lcom/jumio/core/data/scan/DataInterface;->getHasData()Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    .line 82
    :cond_1
    :try_start_0
    sget-object v1, Lcom/jumio/commons/utils/FileUtil;->INSTANCE:Lcom/jumio/commons/utils/FileUtil;

    .line 83
    invoke-virtual {v0}, Lcom/jumio/core/models/ScanPartModel;->getFileData()Lcom/jumio/core/data/scan/FileDataInterface;

    move-result-object v2

    invoke-interface {v2}, Lcom/jumio/core/data/scan/DataInterface;->getData()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 84
    iget-object v3, p0, Lcom/jumio/core/Controller;->a:Lcom/jumio/core/models/AuthorizationModel;

    invoke-virtual {v3}, Lcom/jumio/core/models/AuthorizationModel;->getSessionKey()Lcom/jumio/core/models/AuthorizationModel$SessionKey;

    move-result-object v3

    .line 85
    invoke-virtual {v1, v2, v3}, Lcom/jumio/commons/utils/FileUtil;->readFile(Ljava/lang/String;Lcom/jumio/core/models/AuthorizationModel$SessionKey;)[B

    move-result-object v1

    .line 86
    iget-object v2, p0, Lcom/jumio/core/Controller;->b:Lcom/jumio/core/MobileContext;

    invoke-virtual {v0}, Lcom/jumio/core/models/ScanPartModel;->getCredentialPart()Lcom/jumio/sdk/enums/JumioCredentialPart;

    move-result-object v0

    invoke-virtual {p3, v2, v1, v0}, Lcom/jumio/sdk/result/JumioImageData;->addImage$jumio_core_release(Landroid/content/Context;[BLcom/jumio/sdk/enums/JumioCredentialPart;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 87
    const-string v1, "ImageData"

    const-string v2, "Error reading File"

    invoke-static {v1, v2, v0}, Lcom/jumio/commons/log/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 88
    :cond_2
    invoke-virtual {p1, p3}, Lcom/jumio/sdk/result/JumioCredentialResult;->setImageData$jumio_core_release(Lcom/jumio/sdk/result/JumioImageData;)V

    return-void
.end method

.method public final a(Ljava/util/HashMap;)V
    .locals 14

    .line 60
    const-class v1, Lcom/jumio/core/models/CredentialsModel;

    iget-object v0, p0, Lcom/jumio/core/Controller;->d:Lcom/jumio/core/persistence/DataManager;

    const-class v2, Lcom/jumio/core/models/SettingsModel;

    invoke-virtual {v0, v2}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/jumio/core/models/SettingsModel;

    .line 61
    iget-object v2, p0, Lcom/jumio/core/Controller;->d:Lcom/jumio/core/persistence/DataManager;

    const-class v3, Lcom/jumio/core/models/InitiateModel;

    invoke-virtual {v2, v3}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    move-result-object v2

    check-cast v2, Lcom/jumio/core/models/InitiateModel;

    const/4 v3, 0x0

    .line 62
    :try_start_0
    iget-object v4, p0, Lcom/jumio/core/Controller;->d:Lcom/jumio/core/persistence/DataManager;

    invoke-virtual {v4, v1}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    move-result-object v4

    check-cast v4, Lcom/jumio/core/models/CredentialsModel;

    .line 63
    iget-object v4, v4, Lcom/jumio/core/models/CredentialsModel;->a:Ljava/util/List;

    .line 64
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/jumio/core/models/CredentialDataModel;

    .line 65
    invoke-static {p1, v5}, Lcom/jumio/core/Controller;->a(Ljava/util/HashMap;Lcom/jumio/core/models/CredentialDataModel;)Lcom/jumio/sdk/result/JumioCredentialResult;

    move-result-object v6

    .line 66
    invoke-virtual {p0, v6, v5, v0}, Lcom/jumio/core/Controller;->a(Lcom/jumio/sdk/result/JumioCredentialResult;Lcom/jumio/core/models/CredentialDataModel;Lcom/jumio/core/models/SettingsModel;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const/4 v4, 0x2

    .line 67
    invoke-static {p0, v0, v3, v4, v3}, Lcom/jumio/core/Controller;->onError$default(Lcom/jumio/core/Controller;Ljava/lang/Throwable;Ljava/lang/Class;ILjava/lang/Object;)V

    .line 68
    :cond_0
    new-instance v5, Lcom/jumio/sdk/result/JumioResult;

    .line 69
    invoke-virtual {v2}, Lcom/jumio/core/models/InitiateModel;->getWorkflowExecutionId()Ljava/lang/String;

    move-result-object v6

    .line 70
    iget-object v7, v2, Lcom/jumio/core/models/InitiateModel;->a:Ljava/lang/String;

    .line 71
    iget-object v0, p0, Lcom/jumio/core/Controller;->d:Lcom/jumio/core/persistence/DataManager;

    invoke-virtual {v0, v1}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/jumio/core/models/CredentialsModel;

    invoke-virtual {v0}, Lcom/jumio/core/models/CredentialsModel;->a()Ljava/util/ArrayList;

    move-result-object v9

    const/16 v12, 0x20

    const/4 v13, 0x0

    const/4 v8, 0x1

    const/4 v11, 0x0

    move-object v10, p1

    .line 72
    invoke-direct/range {v5 .. v13}, Lcom/jumio/sdk/result/JumioResult;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/util/Map;Lcom/jumio/sdk/error/JumioError;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 p1, 0x0

    .line 73
    invoke-virtual {p0, p1}, Lcom/jumio/core/Controller;->a(Z)V

    .line 74
    iget-object p1, p0, Lcom/jumio/core/Controller;->h:Lcom/jumio/core/scope/ScopeProviderInterface;

    new-instance v0, Ljumio/core/u0;

    invoke-direct {v0, p0, v5, v3}, Ljumio/core/u0;-><init>(Lcom/jumio/core/Controller;Lcom/jumio/sdk/result/JumioResult;Lkotlin/coroutines/Continuation;)V

    invoke-interface {p1, v0}, Lcom/jumio/core/scope/ScopeProviderInterface;->runOnMain(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/x1;

    .line 75
    invoke-virtual {p0}, Lcom/jumio/core/Controller;->b()V

    return-void
.end method

.method public final a(Z)V
    .locals 7

    const-string v0, "getSharedPreferences(...)"

    const-string v1, "Jumio01"

    const/4 v2, 0x0

    const-string v3, "key"

    const-string v4, "context"

    if-eqz p1, :cond_0

    .line 89
    :try_start_0
    iget-object p1, p0, Lcom/jumio/core/Controller;->b:Lcom/jumio/core/MobileContext;

    const-string v5, "Jumio05"

    .line 90
    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 92
    invoke-virtual {p1, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v6

    .line 93
    invoke-interface {v6, v5, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v6

    add-int/lit8 v6, v6, 0x1

    .line 94
    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    invoke-virtual {p1, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    .line 97
    invoke-interface {p1, v5, v6}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 98
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 99
    sget-object p1, Ljumio/core/h2;->b:Ljumio/core/h2;

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    .line 100
    :cond_0
    iget-object p1, p0, Lcom/jumio/core/Controller;->b:Lcom/jumio/core/MobileContext;

    const-string v5, "Jumio04"

    .line 101
    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 103
    invoke-virtual {p1, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v6

    .line 104
    invoke-interface {v6, v5, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v6

    add-int/lit8 v6, v6, 0x1

    .line 105
    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 106
    invoke-virtual {p1, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 107
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    .line 108
    invoke-interface {p1, v5, v6}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 109
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 110
    sget-object p1, Ljumio/core/h2;->a:Ljumio/core/h2;

    .line 111
    :goto_0
    sget-object v0, Lcom/jumio/analytics/Analytics;->Companion:Lcom/jumio/analytics/Analytics$Companion;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v2, v1, v2}, Lcom/jumio/analytics/MobileEvents;->lifecycle$default(Ljumio/core/h2;Ljava/lang/Object;ILjava/lang/Object;)Lcom/jumio/analytics/AnalyticsEvent;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/jumio/analytics/Analytics$Companion;->add(Lcom/jumio/analytics/AnalyticsEvent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    .line 112
    :goto_1
    invoke-static {p1}, Lcom/jumio/commons/log/Log;->printStackTrace(Ljava/lang/Throwable;)V

    .line 113
    :goto_2
    :try_start_1
    iget-object p1, p0, Lcom/jumio/core/Controller;->g:Lcom/jumio/analytics/Analytics;

    invoke-virtual {p1}, Lcom/jumio/analytics/Analytics;->stop()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    :catch_1
    move-exception p1

    .line 114
    invoke-static {p1}, Lcom/jumio/commons/log/Log;->printStackTrace(Ljava/lang/Throwable;)V

    :goto_3
    return-void
.end method

.method public final b()V
    .locals 3

    .line 15
    iget-object v0, p0, Lcom/jumio/core/Controller;->h:Lcom/jumio/core/scope/ScopeProviderInterface;

    invoke-interface {v0}, Lcom/jumio/core/scope/ScopeProviderInterface;->cancelAll()V

    .line 16
    sget-object v0, Lcom/jumio/core/ServiceLocator;->INSTANCE:Lcom/jumio/core/ServiceLocator;

    invoke-virtual {v0}, Lcom/jumio/core/ServiceLocator;->destroy()V

    .line 17
    iget-object v0, p0, Lcom/jumio/core/Controller;->e:Lcom/jumio/core/api/BackendManager;

    invoke-virtual {v0, p0}, Lcom/jumio/core/api/BackendManager;->removeBinding(Lcom/jumio/core/network/ApiBinding;)V

    .line 18
    iget-object v0, p0, Lcom/jumio/core/Controller;->c:Lcom/jumio/commons/utils/DeviceRotationManager;

    invoke-virtual {v0}, Lcom/jumio/commons/utils/DeviceRotationManager;->destroy()V

    .line 19
    iget-object v0, p0, Lcom/jumio/core/Controller;->f:Lcom/jumio/core/plugins/PluginRegistryInterface;

    invoke-interface {v0}, Lcom/jumio/core/plugins/PluginRegistryInterface;->clearCache()V

    .line 20
    iget-object v0, p0, Lcom/jumio/core/Controller;->d:Lcom/jumio/core/persistence/DataManager;

    const-class v1, Lcom/jumio/core/cdn/CDNFeatureModel;

    invoke-virtual {v0, v1}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/jumio/core/cdn/CDNFeatureModel;

    invoke-virtual {v0}, Lcom/jumio/core/cdn/CDNFeatureModel;->clearNonCacheFiles()V

    const/4 v0, 0x0

    .line 21
    iput-object v0, p0, Lcom/jumio/core/Controller;->i:Lcom/jumio/sdk/interfaces/JumioControllerInterface;

    .line 22
    iput-object v0, p0, Lcom/jumio/core/Controller;->l:Lkotlinx/coroutines/x1;

    .line 23
    :try_start_0
    iget-object v0, p0, Lcom/jumio/core/Controller;->d:Lcom/jumio/core/persistence/DataManager;

    invoke-virtual {v0}, Lcom/jumio/core/persistence/DataManager;->removeAll()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 24
    invoke-static {v0}, Lcom/jumio/commons/log/Log;->printStackTrace(Ljava/lang/Throwable;)V

    .line 25
    :goto_0
    :try_start_1
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/jumio/core/Controller;->b:Lcom/jumio/core/MobileContext;

    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    const-string v2, "jumio"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 26
    new-instance v1, Ljumio/core/q1;

    invoke-direct {v1}, Ljumio/core/q1;-><init>()V

    invoke-virtual {v0, v1}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 27
    invoke-static {v0}, Lkotlin/jvm/internal/ArrayIteratorKt;->iterator([Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/io/File;

    .line 28
    invoke-virtual {v1}, Ljava/io/File;->isFile()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 29
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    move-result v2

    if-nez v2, :cond_0

    .line 30
    invoke-virtual {v1}, Ljava/io/File;->deleteOnExit()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v0

    .line 31
    invoke-static {v0}, Lcom/jumio/commons/log/Log;->printStackTrace(Ljava/lang/Throwable;)V

    .line 32
    :cond_1
    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v0

    .line 33
    instance-of v1, v0, Ljumio/core/f1;

    if-eqz v1, :cond_2

    .line 34
    check-cast v0, Ljumio/core/f1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v1

    if-ne v1, v0, :cond_2

    .line 36
    iget-object v0, v0, Ljumio/core/f1;->a:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-static {v0}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    :cond_2
    const/4 v0, 0x0

    .line 37
    iput-boolean v0, p0, Lcom/jumio/core/Controller;->n:Z

    return-void
.end method

.method public final b(Z)V
    .locals 7

    .line 1
    sget-object v0, Lcom/jumio/sdk/JumioSDK;->Companion:Lcom/jumio/sdk/JumioSDK$Companion;

    iget-object v1, p0, Lcom/jumio/core/Controller;->b:Lcom/jumio/core/MobileContext;

    invoke-virtual {v0, v1}, Lcom/jumio/sdk/JumioSDK$Companion;->isSupportedPlatform(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    new-instance v1, Lcom/jumio/core/error/Error;

    sget-object v2, Lcom/jumio/core/enums/ErrorCase;->OCR_LOADING_FAILED:Lcom/jumio/core/enums/ErrorCase;

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-direct/range {v1 .. v6}, Lcom/jumio/core/error/Error;-><init>(Lcom/jumio/core/enums/ErrorCase;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 p1, 0x2

    const/4 v0, 0x0

    invoke-static {p0, v1, v0, p1, v0}, Lcom/jumio/core/Controller;->onError$default(Lcom/jumio/core/Controller;Ljava/lang/Throwable;Ljava/lang/Class;ILjava/lang/Object;)V

    return-void

    .line 3
    :cond_0
    new-instance v0, Ljumio/core/f1;

    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v1

    invoke-direct {v0, v1}, Ljumio/core/f1;-><init>(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    invoke-static {v0}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    .line 4
    iget-object v0, p0, Lcom/jumio/core/Controller;->d:Lcom/jumio/core/persistence/DataManager;

    const-class v1, Lcom/jumio/core/cdn/CDNFeatureModel;

    invoke-virtual {v0, v1}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/jumio/core/cdn/CDNFeatureModel;

    .line 5
    sget-object v1, Lcom/jumio/core/environment/Environment;->INSTANCE:Lcom/jumio/core/environment/Environment;

    iget-object v2, p0, Lcom/jumio/core/Controller;->b:Lcom/jumio/core/MobileContext;

    invoke-virtual {v1, v2}, Lcom/jumio/core/environment/Environment;->getDataDirectory(Landroid/content/Context;)Ljava/io/File;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/jumio/core/cdn/CDNFeatureModel;->setDirectory(Ljava/io/File;)V

    .line 6
    iget-object v1, p0, Lcom/jumio/core/Controller;->b:Lcom/jumio/core/MobileContext;

    invoke-virtual {v1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/jumio/core/cdn/CDNFeatureModel;->setAssetManager(Landroid/content/res/AssetManager;)V

    .line 7
    new-instance v1, Ljumio/core/x0;

    invoke-direct {v1, p0}, Ljumio/core/x0;-><init>(Lcom/jumio/core/Controller;)V

    invoke-virtual {v0, v1}, Lcom/jumio/core/cdn/CDNFeatureModel;->setCdnDownloadListener(Lcom/jumio/core/cdn/CDNDownloadListener;)V

    if-eqz p1, :cond_1

    return-void

    .line 8
    :cond_1
    iget-object p1, p0, Lcom/jumio/core/Controller;->d:Lcom/jumio/core/persistence/DataManager;

    const-class v0, Lcom/jumio/core/models/ReportingModel;

    invoke-virtual {p1, v0}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    move-result-object p1

    check-cast p1, Lcom/jumio/core/models/ReportingModel;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p1, Lcom/jumio/core/models/ReportingModel;->f:J

    .line 10
    iget-object p1, p0, Lcom/jumio/core/Controller;->b:Lcom/jumio/core/MobileContext;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {p1, v0, v1}, Ljumio/core/J0;->a(Landroid/content/Context;J)V

    .line 11
    iget-object p1, p0, Lcom/jumio/core/Controller;->b:Lcom/jumio/core/MobileContext;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Ljumio/core/J0;->a(Landroid/content/Context;I)V

    .line 12
    iget-object p1, p0, Lcom/jumio/core/Controller;->d:Lcom/jumio/core/persistence/DataManager;

    const-class v0, Lcom/jumio/core/models/SettingsModel;

    invoke-virtual {p1, v0}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    move-result-object p1

    check-cast p1, Lcom/jumio/core/models/SettingsModel;

    invoke-virtual {p1}, Lcom/jumio/core/models/SettingsModel;->isLoaded()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 13
    invoke-virtual {p0}, Lcom/jumio/core/Controller;->a()V

    return-void

    .line 14
    :cond_2
    iget-object p1, p0, Lcom/jumio/core/Controller;->e:Lcom/jumio/core/api/BackendManager;

    iget-object v0, p0, Lcom/jumio/core/Controller;->f:Lcom/jumio/core/plugins/PluginRegistryInterface;

    invoke-interface {v0}, Lcom/jumio/core/plugins/PluginRegistryInterface;->getAvailablePluginNames()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/jumio/core/api/BackendManager;->settings(Ljava/util/List;)V

    return-void
.end method

.method public final cancel()V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/jumio/sdk/exceptions/SDKNotConfiguredException;,
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/Controller;->m:Lcom/jumio/sdk/credentials/JumioCredential;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/jumio/sdk/credentials/JumioCredential;->cancel()V

    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, Lcom/jumio/core/Controller;->d:Lcom/jumio/core/persistence/DataManager;

    .line 10
    .line 11
    const-class v1, Lcom/jumio/core/models/InitiateModel;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    check-cast v0, Lcom/jumio/core/models/InitiateModel;

    .line 18
    .line 19
    new-instance v1, Lcom/jumio/sdk/result/JumioResult;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/jumio/core/models/InitiateModel;->getWorkflowExecutionId()Ljava/lang/String;

    .line 23
    move-result-object v2

    .line 24
    .line 25
    iget-object v3, v0, Lcom/jumio/core/models/InitiateModel;->a:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v0, p0, Lcom/jumio/core/Controller;->k:Lcom/jumio/sdk/error/JumioError;

    .line 28
    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    new-instance v4, Lcom/jumio/core/error/Error;

    .line 32
    .line 33
    sget-object v5, Lcom/jumio/core/enums/ErrorCase;->CANCEL_TYPE_USER:Lcom/jumio/core/enums/ErrorCase;

    .line 34
    const/4 v8, 0x6

    .line 35
    const/4 v9, 0x0

    .line 36
    const/4 v6, 0x0

    .line 37
    const/4 v7, 0x0

    .line 38
    .line 39
    .line 40
    invoke-direct/range {v4 .. v9}, Lcom/jumio/core/error/Error;-><init>(Lcom/jumio/core/enums/ErrorCase;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 41
    .line 42
    iget-object v0, p0, Lcom/jumio/core/Controller;->b:Lcom/jumio/core/MobileContext;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v4, v0}, Lcom/jumio/core/error/Error;->getJumioError(Landroid/content/Context;)Lcom/jumio/sdk/error/JumioError;

    .line 46
    move-result-object v0

    .line 47
    :cond_1
    move-object v7, v0

    .line 48
    .line 49
    const/16 v8, 0x18

    .line 50
    const/4 v9, 0x0

    .line 51
    const/4 v4, 0x0

    .line 52
    const/4 v5, 0x0

    .line 53
    const/4 v6, 0x0

    .line 54
    .line 55
    .line 56
    invoke-direct/range {v1 .. v9}, Lcom/jumio/sdk/result/JumioResult;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/util/Map;Lcom/jumio/sdk/error/JumioError;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 57
    .line 58
    iget-object v0, p0, Lcom/jumio/core/Controller;->h:Lcom/jumio/core/scope/ScopeProviderInterface;

    .line 59
    .line 60
    new-instance v2, Ljumio/core/n0;

    .line 61
    const/4 v3, 0x0

    .line 62
    .line 63
    .line 64
    invoke-direct {v2, p0, v1, v3}, Ljumio/core/n0;-><init>(Lcom/jumio/core/Controller;Lcom/jumio/sdk/result/JumioResult;Lkotlin/coroutines/Continuation;)V

    .line 65
    .line 66
    .line 67
    invoke-interface {v0, v2}, Lcom/jumio/core/scope/ScopeProviderInterface;->runOnMain(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/x1;

    .line 68
    .line 69
    iget-object v0, p0, Lcom/jumio/core/Controller;->e:Lcom/jumio/core/api/BackendManager;

    .line 70
    const/4 v1, 0x1

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, v1}, Lcom/jumio/core/api/BackendManager;->cancelCall(Z)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0, v1}, Lcom/jumio/core/Controller;->reporting(Z)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0, v1}, Lcom/jumio/core/Controller;->a(Z)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0}, Lcom/jumio/core/Controller;->b()V

    .line 83
    return-void
    .line 84
.end method

.method public final finish()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/jumio/core/Controller;->isComplete()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    const/4 v0, 0x0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lcom/jumio/core/Controller;->reporting(Z)V

    .line 11
    .line 12
    iget-object v0, p0, Lcom/jumio/core/Controller;->e:Lcom/jumio/core/api/BackendManager;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/jumio/core/api/BackendManager;->finalizeCall()V

    .line 16
    return-void

    .line 17
    .line 18
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 19
    .line 20
    const-string v1, "Workflow is not completed"

    .line 21
    .line 22
    .line 23
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 24
    throw v0
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
.end method

.method public final declared-synchronized finishCredential$jumio_core_release(Lcom/jumio/sdk/credentials/JumioCredential;)V
    .locals 3
    .param p1    # Lcom/jumio/sdk/credentials/JumioCredential;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    const-string v0, "credential"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Lcom/jumio/core/Controller;->m:Lcom/jumio/sdk/credentials/JumioCredential;

    .line 9
    .line 10
    if-ne p1, v0, :cond_0

    .line 11
    const/4 v0, 0x0

    .line 12
    .line 13
    iput-object v0, p0, Lcom/jumio/core/Controller;->m:Lcom/jumio/sdk/credentials/JumioCredential;

    .line 14
    .line 15
    iget-object v1, p0, Lcom/jumio/core/Controller;->d:Lcom/jumio/core/persistence/DataManager;

    .line 16
    .line 17
    const-class v2, Lcom/jumio/core/models/CredentialsModel;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v2}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    check-cast v1, Lcom/jumio/core/models/CredentialsModel;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/jumio/sdk/credentials/JumioCredential;->getData$jumio_core_release()Lcom/jumio/core/models/CredentialDataModel;

    .line 27
    move-result-object p1

    .line 28
    .line 29
    iget-object p1, p1, Lcom/jumio/core/models/CredentialDataModel;->a:Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    const-string v2, "id"

    .line 35
    .line 36
    .line 37
    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    iget-object v2, v1, Lcom/jumio/core/models/CredentialsModel;->c:Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    move-result p1

    .line 44
    .line 45
    if-eqz p1, :cond_0

    .line 46
    .line 47
    iput-object v0, v1, Lcom/jumio/core/models/CredentialsModel;->c:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    monitor-exit p0

    .line 49
    return-void

    .line 50
    :catchall_0
    move-exception p1

    .line 51
    goto :goto_0

    .line 52
    :cond_0
    monitor-exit p0

    .line 53
    return-void

    .line 54
    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 55
    throw p1
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

.method public final getActiveCredential$jumio_core_release()Lcom/jumio/sdk/credentials/JumioCredential;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/Controller;->m:Lcom/jumio/sdk/credentials/JumioCredential;

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

.method public final getAnalytics()Lcom/jumio/analytics/Analytics;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/Controller;->g:Lcom/jumio/analytics/Analytics;

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

.method public final getAuthorizationModel()Lcom/jumio/core/models/AuthorizationModel;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/Controller;->a:Lcom/jumio/core/models/AuthorizationModel;

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

.method public final getBackendManager()Lcom/jumio/core/api/BackendManager;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/Controller;->e:Lcom/jumio/core/api/BackendManager;

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

.method public getBindingClasses()[Ljava/lang/Class;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Ljava/lang/Class<",
            "+",
            "Lcom/jumio/core/network/ApiCall<",
            "*>;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-class v0, Ljumio/core/k3;

    .line 3
    .line 4
    const-class v1, Lcom/jumio/core/api/calls/SettingsCall;

    .line 5
    .line 6
    const-class v2, Ljumio/core/h1;

    .line 7
    .line 8
    const-class v3, Ljumio/core/r1;

    .line 9
    .line 10
    .line 11
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/Class;

    .line 12
    move-result-object v0

    .line 13
    return-object v0
    .line 14
    .line 15
    .line 16
.end method

.method public final getContext()Lcom/jumio/core/MobileContext;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/Controller;->b:Lcom/jumio/core/MobileContext;

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

.method public final getDataManager()Lcom/jumio/core/persistence/DataManager;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/Controller;->d:Lcom/jumio/core/persistence/DataManager;

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

.method public final getPluginRegistry()Lcom/jumio/core/plugins/PluginRegistryInterface;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/Controller;->f:Lcom/jumio/core/plugins/PluginRegistryInterface;

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

.method public final getRotationManager()Lcom/jumio/commons/utils/DeviceRotationManager;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/Controller;->c:Lcom/jumio/commons/utils/DeviceRotationManager;

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

.method public final getScopeProvider()Lcom/jumio/core/scope/ScopeProviderInterface;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/Controller;->h:Lcom/jumio/core/scope/ScopeProviderInterface;

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

.method public final getUnconsentedItems()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/jumio/sdk/consent/JumioConsentItem;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/Controller;->d:Lcom/jumio/core/persistence/DataManager;

    .line 3
    .line 4
    const-class v1, Lcom/jumio/core/models/ConsentModel;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    check-cast v0, Lcom/jumio/core/models/ConsentModel;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/jumio/core/models/ConsentModel;->getNonConsentedItems()Ljava/util/List;

    .line 14
    move-result-object v0

    .line 15
    return-object v0
    .line 16
.end method

.method public final isActive$jumio_core_release()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/jumio/core/Controller;->n:Z

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

.method public final isComplete()Z
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/Controller;->m:Lcom/jumio/sdk/credentials/JumioCredential;

    .line 3
    .line 4
    if-nez v0, :cond_3

    .line 5
    .line 6
    iget-object v0, p0, Lcom/jumio/core/Controller;->d:Lcom/jumio/core/persistence/DataManager;

    .line 7
    .line 8
    const-class v1, Lcom/jumio/core/models/CredentialsModel;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    check-cast v0, Lcom/jumio/core/models/CredentialsModel;

    .line 15
    .line 16
    iget-object v1, v0, Lcom/jumio/core/models/CredentialsModel;->a:Ljava/util/List;

    .line 17
    .line 18
    .line 19
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 20
    move-result v1

    .line 21
    .line 22
    if-nez v1, :cond_3

    .line 23
    .line 24
    iget-object v0, v0, Lcom/jumio/core/models/CredentialsModel;->a:Ljava/util/List;

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 30
    move-result v1

    .line 31
    .line 32
    if-eqz v1, :cond_0

    .line 33
    goto :goto_0

    .line 34
    .line 35
    .line 36
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 37
    move-result-object v0

    .line 38
    .line 39
    .line 40
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    move-result v1

    .line 42
    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    .line 46
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    move-result-object v1

    .line 48
    .line 49
    check-cast v1, Lcom/jumio/core/models/CredentialDataModel;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, Lcom/jumio/core/models/CredentialDataModel;->a()Z

    .line 53
    move-result v1

    .line 54
    .line 55
    if-nez v1, :cond_1

    .line 56
    goto :goto_1

    .line 57
    :cond_2
    :goto_0
    const/4 v0, 0x1

    .line 58
    return v0

    .line 59
    :cond_3
    :goto_1
    const/4 v0, 0x0

    .line 60
    return v0
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

.method public final isConsentPreApproved()Z
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/Controller;->d:Lcom/jumio/core/persistence/DataManager;

    .line 3
    .line 4
    const-class v1, Lcom/jumio/core/models/SettingsModel;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    check-cast v0, Lcom/jumio/core/models/SettingsModel;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/jumio/core/models/SettingsModel;->getSkipStartScreen()Z

    .line 14
    move-result v0

    .line 15
    return v0
    .line 16
.end method

.method public onError(Lcom/jumio/core/models/ApiCallDataModel;Ljava/lang/Throwable;)V
    .locals 1
    .param p1    # Lcom/jumio/core/models/ApiCallDataModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jumio/core/models/ApiCallDataModel<",
            "*>;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    const-string v0, "apiCallDataModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-virtual {p1}, Lcom/jumio/core/models/ApiCallDataModel;->getCall()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p0, p2, p1}, Lcom/jumio/core/Controller;->onError(Ljava/lang/Throwable;Ljava/lang/Class;)V

    return-void
.end method

.method public final onError(Ljava/lang/Throwable;Ljava/lang/Class;)V
    .locals 2
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Class;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Throwable;",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    const-string v0, "sourceClass"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/jumio/core/Controller;->e:Lcom/jumio/core/api/BackendManager;

    invoke-virtual {v0, p1, p2}, Lcom/jumio/core/api/BackendManager;->errorFromThrowable(Ljava/lang/Throwable;Ljava/lang/Class;)Lcom/jumio/core/error/Error;

    move-result-object p1

    .line 2
    sget-object p2, Lcom/jumio/analytics/Analytics;->Companion:Lcom/jumio/analytics/Analytics$Companion;

    sget-object v0, Ljumio/core/h2;->e:Ljumio/core/h2;

    invoke-static {v0, p1}, Lcom/jumio/analytics/MobileEvents;->lifecycle(Ljumio/core/h2;Ljava/lang/Object;)Lcom/jumio/analytics/AnalyticsEvent;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/jumio/analytics/Analytics$Companion;->add(Lcom/jumio/analytics/AnalyticsEvent;)V

    .line 3
    iget-object p2, p0, Lcom/jumio/core/Controller;->b:Lcom/jumio/core/MobileContext;

    invoke-virtual {p1, p2}, Lcom/jumio/core/error/Error;->getJumioError(Landroid/content/Context;)Lcom/jumio/sdk/error/JumioError;

    move-result-object p1

    .line 4
    iput-object p1, p0, Lcom/jumio/core/Controller;->k:Lcom/jumio/sdk/error/JumioError;

    .line 5
    iget-object p2, p0, Lcom/jumio/core/Controller;->h:Lcom/jumio/core/scope/ScopeProviderInterface;

    new-instance v0, Ljumio/core/p0;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Ljumio/core/p0;-><init>(Lcom/jumio/core/Controller;Lcom/jumio/sdk/error/JumioError;Lkotlin/coroutines/Continuation;)V

    invoke-interface {p2, v0}, Lcom/jumio/core/scope/ScopeProviderInterface;->runOnMain(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/x1;

    return-void
.end method

.method public onResult(Lcom/jumio/core/models/ApiCallDataModel;Ljava/lang/Object;)V
    .locals 6
    .param p1    # Lcom/jumio/core/models/ApiCallDataModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jumio/core/models/ApiCallDataModel<",
            "*>;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "apiCallDataModel"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/jumio/core/models/ApiCallDataModel;->getCall()Ljava/lang/Class;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    const-class v0, Lcom/jumio/core/api/calls/SettingsCall;

    .line 12
    .line 13
    .line 14
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    move-result v0

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object p1, p0, Lcom/jumio/core/Controller;->h:Lcom/jumio/core/scope/ScopeProviderInterface;

    .line 20
    .line 21
    .line 22
    invoke-interface {p1}, Lcom/jumio/core/scope/ScopeProviderInterface;->getMainScope()Lkotlinx/coroutines/m0;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    new-instance v3, Ljumio/core/q0;

    .line 26
    const/4 p1, 0x0

    .line 27
    .line 28
    .line 29
    invoke-direct {v3, p0, p2, p1}, Ljumio/core/q0;-><init>(Lcom/jumio/core/Controller;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V

    .line 30
    const/4 v4, 0x3

    .line 31
    const/4 v5, 0x0

    .line 32
    const/4 v1, 0x0

    .line 33
    const/4 v2, 0x0

    .line 34
    .line 35
    .line 36
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 37
    return-void

    .line 38
    .line 39
    :cond_0
    const-class v0, Ljumio/core/k3;

    .line 40
    .line 41
    .line 42
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    move-result v0

    .line 44
    .line 45
    if-nez v0, :cond_3

    .line 46
    .line 47
    const-class v0, Ljumio/core/r1;

    .line 48
    .line 49
    .line 50
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    move-result v0

    .line 52
    .line 53
    if-eqz v0, :cond_2

    .line 54
    .line 55
    const-string p1, "null cannot be cast to non-null type org.json.JSONObject"

    .line 56
    .line 57
    .line 58
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    check-cast p2, Lorg/json/JSONObject;

    .line 61
    .line 62
    const-string p1, "extractDataExecuted"

    .line 63
    const/4 v0, 0x0

    .line 64
    .line 65
    .line 66
    invoke-virtual {p2, p1, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 67
    move-result p1

    .line 68
    .line 69
    if-eqz p1, :cond_1

    .line 70
    .line 71
    iget-object p1, p0, Lcom/jumio/core/Controller;->e:Lcom/jumio/core/api/BackendManager;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1}, Lcom/jumio/core/api/BackendManager;->extractData()V

    .line 75
    return-void

    .line 76
    .line 77
    :cond_1
    new-instance p1, Ljava/util/HashMap;

    .line 78
    .line 79
    .line 80
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0, p1}, Lcom/jumio/core/Controller;->a(Ljava/util/HashMap;)V

    .line 84
    return-void

    .line 85
    .line 86
    :cond_2
    const-class v0, Ljumio/core/h1;

    .line 87
    .line 88
    .line 89
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 90
    move-result p1

    .line 91
    .line 92
    if-eqz p1, :cond_3

    .line 93
    .line 94
    const-string p1, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, com.jumio.sdk.result.JumioCredentialResult>"

    .line 95
    .line 96
    .line 97
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    .line 99
    check-cast p2, Ljava/util/HashMap;

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0, p2}, Lcom/jumio/core/Controller;->a(Ljava/util/HashMap;)V

    .line 103
    :cond_3
    return-void
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
.end method

.method public final persistAllData(Z)V
    .locals 7

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/Controller;->h:Lcom/jumio/core/scope/ScopeProviderInterface;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lcom/jumio/core/scope/ScopeProviderInterface;->getIoScope()Lkotlinx/coroutines/m0;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    new-instance v4, Ljumio/core/s0;

    .line 9
    const/4 v0, 0x0

    .line 10
    .line 11
    .line 12
    invoke-direct {v4, p0, p1, v0}, Ljumio/core/s0;-><init>(Lcom/jumio/core/Controller;ZLkotlin/coroutines/Continuation;)V

    .line 13
    const/4 v5, 0x3

    .line 14
    const/4 v6, 0x0

    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    .line 18
    .line 19
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 20
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public final reporting(Z)V
    .locals 4

    .line 1
    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/jumio/core/Controller;->d:Lcom/jumio/core/persistence/DataManager;

    .line 3
    .line 4
    const-class v1, Lcom/jumio/core/models/SettingsModel;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    check-cast v0, Lcom/jumio/core/models/SettingsModel;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/jumio/core/models/SettingsModel;->isAdditionalDataPointsEnabled()Z

    .line 14
    move-result v0

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    sget-object v0, Lcom/jumio/analytics/Analytics;->Companion:Lcom/jumio/analytics/Analytics$Companion;

    .line 19
    .line 20
    iget-object v1, p0, Lcom/jumio/core/Controller;->b:Lcom/jumio/core/MobileContext;

    .line 21
    .line 22
    iget-object v2, p0, Lcom/jumio/core/Controller;->d:Lcom/jumio/core/persistence/DataManager;

    .line 23
    .line 24
    .line 25
    invoke-static {v1, v2}, Lcom/jumio/analytics/MobileEvents;->additionalDatapoints(Landroid/content/Context;Lcom/jumio/core/persistence/DataManager;)Lcom/jumio/analytics/AnalyticsEvent;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Lcom/jumio/analytics/Analytics$Companion;->add(Lcom/jumio/analytics/AnalyticsEvent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    goto :goto_0

    .line 31
    :catch_0
    move-exception v0

    .line 32
    .line 33
    .line 34
    invoke-static {v0}, Lcom/jumio/commons/log/Log;->printStackTrace(Ljava/lang/Throwable;)V

    .line 35
    .line 36
    :cond_0
    :goto_0
    :try_start_1
    sget-object v0, Lcom/jumio/analytics/Analytics;->Companion:Lcom/jumio/analytics/Analytics$Companion;

    .line 37
    .line 38
    iget-object v1, p0, Lcom/jumio/core/Controller;->d:Lcom/jumio/core/persistence/DataManager;

    .line 39
    .line 40
    const-class v2, Lcom/jumio/core/models/ReportingModel;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v2}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    .line 44
    move-result-object v1

    .line 45
    .line 46
    check-cast v1, Lcom/jumio/core/models/ReportingModel;

    .line 47
    .line 48
    iget-object v2, p0, Lcom/jumio/core/Controller;->d:Lcom/jumio/core/persistence/DataManager;

    .line 49
    .line 50
    const-class v3, Lcom/jumio/core/models/CredentialsModel;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2, v3}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    .line 54
    move-result-object v2

    .line 55
    .line 56
    check-cast v2, Lcom/jumio/core/models/CredentialsModel;

    .line 57
    .line 58
    .line 59
    invoke-static {v1, v2, p1}, Lcom/jumio/analytics/MobileEvents;->reporting(Lcom/jumio/core/models/ReportingModel;Lcom/jumio/core/models/CredentialsModel;Z)Lcom/jumio/analytics/AnalyticsEvent;

    .line 60
    move-result-object v1

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v1}, Lcom/jumio/analytics/Analytics$Companion;->add(Lcom/jumio/analytics/AnalyticsEvent;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 64
    goto :goto_1

    .line 65
    :catch_1
    move-exception v0

    .line 66
    .line 67
    .line 68
    invoke-static {v0}, Lcom/jumio/commons/log/Log;->printStackTrace(Ljava/lang/Throwable;)V

    .line 69
    .line 70
    :goto_1
    iget-object v0, p0, Lcom/jumio/core/Controller;->g:Lcom/jumio/analytics/Analytics;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, p1}, Lcom/jumio/analytics/Analytics;->reporting(Z)V

    .line 74
    return-void
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

.method public final retry(Lcom/jumio/sdk/error/JumioError;)V
    .locals 3
    .param p1    # Lcom/jumio/sdk/error/JumioError;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "error"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/jumio/core/Controller;->k:Lcom/jumio/sdk/error/JumioError;

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 11
    move-result v0

    .line 12
    .line 13
    if-eqz v0, :cond_3

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/jumio/sdk/error/JumioError;->isRetryable()Z

    .line 17
    move-result v0

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    const/4 v0, 0x0

    .line 21
    .line 22
    iput-object v0, p0, Lcom/jumio/core/Controller;->k:Lcom/jumio/sdk/error/JumioError;

    .line 23
    .line 24
    iget-object v1, p0, Lcom/jumio/core/Controller;->m:Lcom/jumio/sdk/credentials/JumioCredential;

    .line 25
    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, p1}, Lcom/jumio/sdk/credentials/JumioCredential;->consumeError$jumio_core_release(Lcom/jumio/sdk/error/JumioError;)Ljava/lang/Boolean;

    .line 30
    move-result-object p1

    .line 31
    .line 32
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 33
    .line 34
    .line 35
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    move-result p1

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/4 p1, 0x0

    .line 39
    .line 40
    :goto_0
    if-nez p1, :cond_1

    .line 41
    .line 42
    iget-object p1, p0, Lcom/jumio/core/Controller;->e:Lcom/jumio/core/api/BackendManager;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Lcom/jumio/core/api/BackendManager;->retry()V

    .line 46
    .line 47
    :cond_1
    sget-object p1, Lcom/jumio/analytics/Analytics;->Companion:Lcom/jumio/analytics/Analytics$Companion;

    .line 48
    .line 49
    const-string v1, "retry_error"

    .line 50
    const/4 v2, 0x6

    .line 51
    .line 52
    .line 53
    invoke-static {v1, v0, v0, v2, v0}, Lcom/jumio/analytics/MobileEvents;->userAction$default(Ljava/lang/String;Lcom/jumio/sdk/enums/JumioScanStep;Ljava/lang/Object;ILjava/lang/Object;)Lcom/jumio/analytics/AnalyticsEvent;

    .line 54
    move-result-object v0

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, v0}, Lcom/jumio/analytics/Analytics$Companion;->add(Lcom/jumio/analytics/AnalyticsEvent;)V

    .line 58
    return-void

    .line 59
    .line 60
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 61
    .line 62
    const-string v0, "Specified error is not retryable"

    .line 63
    .line 64
    .line 65
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 66
    throw p1

    .line 67
    .line 68
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 69
    .line 70
    const-string v0, "Specified error is not valid"

    .line 71
    .line 72
    .line 73
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 74
    throw p1
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

.method public final saveState(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "bundle"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/jumio/core/Controller;->a:Lcom/jumio/core/models/AuthorizationModel;

    .line 8
    .line 9
    const-string v1, "Jumio1"

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 13
    const/4 p1, 0x0

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lcom/jumio/core/Controller;->persistAllData(Z)V

    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public final setActive$jumio_core_release(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/jumio/core/Controller;->n:Z

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

.method public final setActiveCredential$jumio_core_release(Lcom/jumio/sdk/credentials/JumioCredential;)V
    .locals 0
    .param p1    # Lcom/jumio/sdk/credentials/JumioCredential;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/jumio/core/Controller;->m:Lcom/jumio/sdk/credentials/JumioCredential;

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

.method public final setAuthorizationModel(Lcom/jumio/core/models/AuthorizationModel;)V
    .locals 1
    .param p1    # Lcom/jumio/core/models/AuthorizationModel;
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
    iput-object p1, p0, Lcom/jumio/core/Controller;->a:Lcom/jumio/core/models/AuthorizationModel;

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

.method public final setContext(Lcom/jumio/core/MobileContext;)V
    .locals 1
    .param p1    # Lcom/jumio/core/MobileContext;
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
    iput-object p1, p0, Lcom/jumio/core/Controller;->b:Lcom/jumio/core/MobileContext;

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

.method public final declared-synchronized startCredential(Lcom/jumio/sdk/credentials/JumioCredentialInfo;)Lcom/jumio/sdk/credentials/JumioCredential;
    .locals 6
    .param p1    # Lcom/jumio/sdk/credentials/JumioCredentialInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    const-string v0, "credentialInfo"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Lcom/jumio/core/Controller;->d:Lcom/jumio/core/persistence/DataManager;

    .line 9
    .line 10
    const-class v1, Lcom/jumio/core/models/ConsentModel;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    check-cast v0, Lcom/jumio/core/models/ConsentModel;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/jumio/core/models/ConsentModel;->getAllConsented()Z

    .line 20
    move-result v0

    .line 21
    .line 22
    if-eqz v0, :cond_8

    .line 23
    .line 24
    iget-object v0, p0, Lcom/jumio/core/Controller;->m:Lcom/jumio/sdk/credentials/JumioCredential;

    .line 25
    .line 26
    if-nez v0, :cond_7

    .line 27
    .line 28
    iget-object v0, p0, Lcom/jumio/core/Controller;->d:Lcom/jumio/core/persistence/DataManager;

    .line 29
    .line 30
    const-class v1, Lcom/jumio/core/models/CredentialsModel;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    check-cast v0, Lcom/jumio/core/models/CredentialsModel;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    const-string v1, "credentialInfo"

    .line 42
    .line 43
    .line 44
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    iget-object v1, v0, Lcom/jumio/core/models/CredentialsModel;->a:Ljava/util/List;

    .line 47
    .line 48
    new-instance v2, Ljava/util/ArrayList;

    .line 49
    .line 50
    .line 51
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 55
    move-result-object v1

    .line 56
    .line 57
    .line 58
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    move-result v3

    .line 60
    .line 61
    if-eqz v3, :cond_1

    .line 62
    .line 63
    .line 64
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    move-result-object v3

    .line 66
    move-object v4, v3

    .line 67
    .line 68
    check-cast v4, Lcom/jumio/core/models/CredentialDataModel;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v4}, Lcom/jumio/core/models/CredentialDataModel;->a()Z

    .line 72
    move-result v5

    .line 73
    .line 74
    if-nez v5, :cond_0

    .line 75
    .line 76
    iget-object v4, v4, Lcom/jumio/core/models/CredentialDataModel;->a:Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1}, Lcom/jumio/sdk/credentials/JumioCredentialInfo;->getId()Ljava/lang/String;

    .line 80
    move-result-object v5

    .line 81
    .line 82
    .line 83
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    move-result v4

    .line 85
    .line 86
    if-nez v4, :cond_0

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 90
    goto :goto_0

    .line 91
    :catchall_0
    move-exception p1

    .line 92
    .line 93
    goto/16 :goto_4

    .line 94
    .line 95
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    .line 96
    .line 97
    const/16 v3, 0xa

    .line 98
    .line 99
    .line 100
    invoke-static {v2, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 101
    move-result v3

    .line 102
    .line 103
    .line 104
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 108
    move-result-object v2

    .line 109
    .line 110
    .line 111
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 112
    move-result v3

    .line 113
    .line 114
    if-eqz v3, :cond_2

    .line 115
    .line 116
    .line 117
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 118
    move-result-object v3

    .line 119
    .line 120
    check-cast v3, Lcom/jumio/core/models/CredentialDataModel;

    .line 121
    .line 122
    iget v3, v3, Lcom/jumio/core/models/CredentialDataModel;->d:I

    .line 123
    .line 124
    .line 125
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 126
    move-result-object v3

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 130
    goto :goto_1

    .line 131
    .line 132
    .line 133
    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 134
    move-result v2

    .line 135
    .line 136
    if-eqz v2, :cond_3

    .line 137
    goto :goto_3

    .line 138
    .line 139
    .line 140
    :cond_3
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 141
    move-result-object v1

    .line 142
    .line 143
    .line 144
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 145
    move-result v2

    .line 146
    .line 147
    if-eqz v2, :cond_5

    .line 148
    .line 149
    .line 150
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 151
    move-result-object v2

    .line 152
    .line 153
    check-cast v2, Ljava/lang/Number;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 157
    move-result v2

    .line 158
    .line 159
    .line 160
    invoke-virtual {p1}, Lcom/jumio/sdk/credentials/JumioCredentialInfo;->getOrder()I

    .line 161
    move-result v3

    .line 162
    .line 163
    if-lt v2, v3, :cond_4

    .line 164
    goto :goto_2

    .line 165
    .line 166
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 167
    .line 168
    const-string v1, "Cannot start credential with order "

    .line 169
    .line 170
    .line 171
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {p1}, Lcom/jumio/sdk/credentials/JumioCredentialInfo;->getOrder()I

    .line 175
    move-result p1

    .line 176
    .line 177
    .line 178
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    const-string p1, ". Credentials with lower order must be completed first."

    .line 181
    .line 182
    .line 183
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 187
    move-result-object p1

    .line 188
    .line 189
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 190
    .line 191
    .line 192
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 193
    move-result-object p1

    .line 194
    .line 195
    .line 196
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 197
    throw v0

    .line 198
    .line 199
    .line 200
    :cond_5
    :goto_3
    invoke-virtual {p1}, Lcom/jumio/sdk/credentials/JumioCredentialInfo;->getId()Ljava/lang/String;

    .line 201
    move-result-object p1

    .line 202
    .line 203
    .line 204
    invoke-virtual {v0, p0, p1}, Lcom/jumio/core/models/CredentialsModel;->a(Lcom/jumio/core/Controller;Ljava/lang/String;)Lcom/jumio/sdk/credentials/JumioCredential;

    .line 205
    move-result-object p1

    .line 206
    .line 207
    if-eqz p1, :cond_6

    .line 208
    .line 209
    iput-object p1, p0, Lcom/jumio/core/Controller;->m:Lcom/jumio/sdk/credentials/JumioCredential;

    .line 210
    .line 211
    .line 212
    invoke-virtual {p1}, Lcom/jumio/sdk/credentials/JumioCredential;->start$jumio_core_release()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 213
    monitor-exit p0

    .line 214
    return-object p1

    .line 215
    .line 216
    :cond_6
    :try_start_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 217
    .line 218
    const-string v0, "Could not start credential"

    .line 219
    .line 220
    .line 221
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 222
    throw p1

    .line 223
    .line 224
    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 225
    .line 226
    const-string v0, "Please finish the active credential first"

    .line 227
    .line 228
    .line 229
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 230
    throw p1

    .line 231
    .line 232
    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 233
    .line 234
    const-string v0, "User consent is missing"

    .line 235
    .line 236
    .line 237
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 238
    throw p1

    .line 239
    :goto_4
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 240
    throw p1
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

.method public final userConsented(Lcom/jumio/sdk/consent/JumioConsentItem;Z)V
    .locals 5
    .param p1    # Lcom/jumio/sdk/consent/JumioConsentItem;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "consentItem"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 9
    move-result-wide v0

    .line 10
    .line 11
    new-instance v2, Lcom/jumio/analytics/MetaInfo;

    .line 12
    .line 13
    .line 14
    invoke-direct {v2}, Lcom/jumio/analytics/MetaInfo;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 18
    move-result-object v3

    .line 19
    .line 20
    .line 21
    invoke-static {p1, v3}, Ljumio/core/k0;->a(Lcom/jumio/sdk/consent/JumioConsentItem;Ljava/lang/Long;)Ljava/util/Map;

    .line 22
    move-result-object v3

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2, v3}, Ljava/util/AbstractMap;->putAll(Ljava/util/Map;)V

    .line 26
    .line 27
    .line 28
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 29
    move-result-object v3

    .line 30
    .line 31
    const-string v4, "decision"

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2, v4, v3}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    sget-object v3, Lcom/jumio/analytics/Analytics;->Companion:Lcom/jumio/analytics/Analytics$Companion;

    .line 37
    .line 38
    const-string v4, "consent"

    .line 39
    .line 40
    .line 41
    invoke-static {v4, v2}, Lcom/jumio/analytics/MobileEvents;->alert(Ljava/lang/String;Lcom/jumio/analytics/MetaInfo;)Lcom/jumio/analytics/AnalyticsEvent;

    .line 42
    move-result-object v2

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3, v2}, Lcom/jumio/analytics/Analytics$Companion;->add(Lcom/jumio/analytics/AnalyticsEvent;)V

    .line 46
    .line 47
    iget-object v2, p0, Lcom/jumio/core/Controller;->d:Lcom/jumio/core/persistence/DataManager;

    .line 48
    .line 49
    const-class v3, Lcom/jumio/core/models/ConsentModel;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2, v3}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    .line 53
    move-result-object v2

    .line 54
    .line 55
    check-cast v2, Lcom/jumio/core/models/ConsentModel;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2, p1, p2, v0, v1}, Lcom/jumio/core/models/ConsentModel;->saveResult(Lcom/jumio/sdk/consent/JumioConsentItem;ZJ)V

    .line 59
    return-void
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
.end method
