.class public final Lcom/sumsub/sns/core/SNSMobileSDK;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lcom/sumsub/sns/core/MobileSdk;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sumsub/sns/core/SNSMobileSDK$Builder;,
        Lcom/sumsub/sns/core/SNSMobileSDK$SDK;,
        Lcom/sumsub/sns/core/SNSMobileSDK$SNSSDK;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00de\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u00c7\u0002\u0018\u00002\u00020\u0001:\u0006\u008a\u0001\u008b\u0001\u008c\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\u000c\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u0007H\u0000\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\r\u0010\r\u001a\u00020\t\u00a2\u0006\u0004\u0008\r\u0010\u0003J\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0096\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u0004H\u0096\u0001\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u0018R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR$\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008!\u0010\"R$\u0010$\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020#8\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008$\u0010%\u001a\u0004\u0008&\u0010\'R\"\u0010(\u001a\u00020\u00128\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008(\u0010)\u001a\u0004\u0008*\u0010+\"\u0004\u0008,\u0010-R$\u0010/\u001a\u0004\u0018\u00010.8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008/\u00100\u001a\u0004\u00081\u00102\"\u0004\u00083\u00104R\u0016\u00105\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00085\u0010)R\u0016\u00106\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00086\u0010)R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00088\u00109R\u0013\u0010=\u001a\u0004\u0018\u00010:8F\u00a2\u0006\u0006\u001a\u0004\u0008;\u0010<R\u0013\u0010A\u001a\u0004\u0018\u00010>8F\u00a2\u0006\u0006\u001a\u0004\u0008?\u0010@R\u0014\u0010C\u001a\u00020\u00048\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008B\u0010\u0006R\u0014\u0010E\u001a\u00020#8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008D\u0010\'R\u0014\u0010G\u001a\u00020\u00048\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008F\u0010\u0006R\u0014\u0010K\u001a\u00020H8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008I\u0010JR\u0014\u0010L\u001a\u00020\u00128\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008L\u0010+R\u0014\u0010P\u001a\u00020M8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008N\u0010OR\u0016\u0010T\u001a\u0004\u0018\u00010Q8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008R\u0010SR\"\u0010X\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010U8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008V\u0010WR\u0016\u0010\\\u001a\u0004\u0018\u00010Y8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008Z\u0010[R\u0016\u0010`\u001a\u0004\u0018\u00010]8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008^\u0010_R\u0016\u0010d\u001a\u0004\u0018\u00010a8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008b\u0010cR\u0014\u0010h\u001a\u00020e8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008f\u0010gR\u0016\u0010l\u001a\u0004\u0018\u00010i8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008j\u0010kR\u0016\u0010p\u001a\u0004\u0018\u00010m8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008n\u0010oR\u0016\u0010t\u001a\u0004\u0018\u00010q8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008r\u0010sR$\u0010{\u001a\n\u0012\u0004\u0012\u00020v\u0018\u00010u8\u0016@\u0016X\u0096\u000f\u00a2\u0006\u000c\u001a\u0004\u0008w\u0010x\"\u0004\u0008y\u0010zR\"\u0010~\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020|\u0018\u00010U8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008}\u0010WR\u0018\u0010\u0081\u0001\u001a\u0004\u0018\u00010#8\u0016X\u0096\u0005\u00a2\u0006\u0007\u001a\u0005\u0008\u007f\u0010\u0080\u0001R\u001a\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0082\u00018\u0016X\u0096\u0005\u00a2\u0006\u0008\u001a\u0006\u0008\u0083\u0001\u0010\u0084\u0001R\u0016\u0010\u0087\u0001\u001a\u00020\u00048\u0016X\u0096\u0005\u00a2\u0006\u0007\u001a\u0005\u0008\u0086\u0001\u0010\u0006R\u001c\u0010\u0089\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u000f0u8BX\u0082\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u0088\u0001\u0010x\u00a8\u0006\u008d\u0001"
    }
    d2 = {
        "Lcom/sumsub/sns/core/SNSMobileSDK;",
        "Lcom/sumsub/sns/core/MobileSdk;",
        "<init>",
        "()V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "Landroid/content/Context;",
        "applicationContext",
        "",
        "restore$idensic_mobile_sdk_aar_defaultRelease",
        "(Landroid/content/Context;)V",
        "restore",
        "shutdown",
        "className",
        "Lcom/sumsub/sns/core/SNSModule;",
        "getPluggedModule",
        "(Ljava/lang/String;)Lcom/sumsub/sns/core/SNSModule;",
        "",
        "isModuleAvailable",
        "(Ljava/lang/String;)Z",
        "Lcom/sumsub/sns/core/SNSMobileSDK$SDK;",
        "sdk",
        "start",
        "(Lcom/sumsub/sns/core/SNSMobileSDK$SDK;)V",
        "initLogger",
        "initFeatures",
        "_sdk",
        "Lcom/sumsub/sns/core/SNSMobileSDK$SDK;",
        "Lcom/sumsub/log/logger/Logger;",
        "value",
        "logTree",
        "Lcom/sumsub/log/logger/Logger;",
        "getLogTree",
        "()Lcom/sumsub/log/logger/Logger;",
        "",
        "theme",
        "I",
        "getTheme",
        "()I",
        "xmlThemeUsed",
        "Z",
        "getXmlThemeUsed$idensic_mobile_sdk_aar_defaultRelease",
        "()Z",
        "setXmlThemeUsed$idensic_mobile_sdk_aar_defaultRelease",
        "(Z)V",
        "Lcom/sumsub/sns/core/theme/SNSJsonCustomizationSource;",
        "customizationSource",
        "Lcom/sumsub/sns/core/theme/SNSJsonCustomizationSource;",
        "getCustomizationSource$idensic_mobile_sdk_aar_defaultRelease",
        "()Lcom/sumsub/sns/core/theme/SNSJsonCustomizationSource;",
        "setCustomizationSource$idensic_mobile_sdk_aar_defaultRelease",
        "(Lcom/sumsub/sns/core/theme/SNSJsonCustomizationSource;)V",
        "isStartedInProcess",
        "isCallbacksLostReported",
        "Lcom/sumsub/sns/internal/core/exception/c;",
        "exceptionHandlerInstaller",
        "Lcom/sumsub/sns/internal/core/exception/c;",
        "Lcom/sumsub/sns/core/data/listener/SNSCompleteHandler;",
        "getCompleteHandler",
        "()Lcom/sumsub/sns/core/data/listener/SNSCompleteHandler;",
        "completeHandler",
        "Lcom/sumsub/sns/core/data/model/DayNightMode;",
        "getForcedDayNightMode",
        "()Lcom/sumsub/sns/core/data/model/DayNightMode;",
        "forcedDayNightMode",
        "getVersionName",
        "versionName",
        "getVersionCode",
        "versionCode",
        "getPackageName",
        "packageName",
        "Ljava/util/Locale;",
        "getLocale",
        "()Ljava/util/Locale;",
        "locale",
        "isDebug",
        "Lcom/sumsub/sns/core/data/model/SNSSDKState;",
        "getState",
        "()Lcom/sumsub/sns/core/data/model/SNSSDKState;",
        "state",
        "Lcom/sumsub/sns/core/data/model/SNSInitConfig;",
        "getConf",
        "()Lcom/sumsub/sns/core/data/model/SNSInitConfig;",
        "conf",
        "",
        "getSettings",
        "()Ljava/util/Map;",
        "settings",
        "Lcom/sumsub/sns/core/data/listener/TokenExpirationHandler;",
        "getTokenExpirationHandler",
        "()Lcom/sumsub/sns/core/data/listener/TokenExpirationHandler;",
        "tokenExpirationHandler",
        "Lcom/sumsub/sns/core/data/listener/SNSErrorHandler;",
        "getErrorHandler",
        "()Lcom/sumsub/sns/core/data/listener/SNSErrorHandler;",
        "errorHandler",
        "Lcom/sumsub/sns/core/data/listener/SNSStateChangedHandler;",
        "getStateChangedHandler",
        "()Lcom/sumsub/sns/core/data/listener/SNSStateChangedHandler;",
        "stateChangedHandler",
        "Lcom/sumsub/sns/core/data/listener/SNSIconHandler;",
        "getIconHandler",
        "()Lcom/sumsub/sns/core/data/listener/SNSIconHandler;",
        "iconHandler",
        "Lcom/sumsub/sns/core/data/listener/SNSEventHandler;",
        "getEventHandler",
        "()Lcom/sumsub/sns/core/data/listener/SNSEventHandler;",
        "eventHandler",
        "Lcom/sumsub/sns/core/theme/SNSJsonCustomization;",
        "getCustomization",
        "()Lcom/sumsub/sns/core/theme/SNSJsonCustomization;",
        "customization",
        "Lcom/sumsub/sns/core/data/listener/SNSInstructionsViewHandler;",
        "getInstructionsViewHandler",
        "()Lcom/sumsub/sns/core/data/listener/SNSInstructionsViewHandler;",
        "instructionsViewHandler",
        "",
        "Lcom/sumsub/sns/core/data/model/SNSSupportItem;",
        "getSupportItems",
        "()Ljava/util/List;",
        "setSupportItems",
        "(Ljava/util/List;)V",
        "supportItems",
        "Lcom/sumsub/sns/core/data/model/SNSDocumentDefinition;",
        "getPreferredDocumentsDefinitions",
        "preferredDocumentsDefinitions",
        "getAutoCloseOnApproveTimeout",
        "()Ljava/lang/Integer;",
        "autoCloseOnApproveTimeout",
        "Lcom/sumsub/sns/core/data/listener/SNSUrlHandler;",
        "getUrlHandler",
        "()Lcom/sumsub/sns/core/data/listener/SNSUrlHandler;",
        "urlHandler",
        "getVersion",
        "version",
        "getModules",
        "modules",
        "Builder",
        "SNSSDK",
        "SDK",
        "idensic-mobile-sdk-aar_defaultRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSNSMobileSDK.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSMobileSDK.kt\ncom/sumsub/sns/core/SNSMobileSDK\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,663:1\n1563#2:664\n1634#2,3:665\n1869#2,2:668\n1#3:670\n*S KotlinDebug\n*F\n+ 1 SNSMobileSDK.kt\ncom/sumsub/sns/core/SNSMobileSDK\n*L\n258#1:664\n258#1:665,3\n259#1:668,2\n*E\n"
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/sumsub/sns/core/SNSMobileSDK;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static _sdk:Lcom/sumsub/sns/core/SNSMobileSDK$SDK;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private static customizationSource:Lcom/sumsub/sns/core/theme/SNSJsonCustomizationSource;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private static final exceptionHandlerInstaller:Lcom/sumsub/sns/internal/core/exception/c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static isCallbacksLostReported:Z

.field private static isStartedInProcess:Z

.field private static logTree:Lcom/sumsub/log/logger/Logger;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static theme:I

.field private static xmlThemeUsed:Z


# instance fields
.field private final synthetic $$delegate_0:Lcom/sumsub/sns/internal/core/common/k0;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/core/SNSMobileSDK;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/sumsub/sns/core/SNSMobileSDK;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/sumsub/sns/core/SNSMobileSDK;->INSTANCE:Lcom/sumsub/sns/core/SNSMobileSDK;

    .line 8
    .line 9
    sget-object v0, Lcom/sumsub/sns/core/theme/SNSJsonCustomization;->Companion:Lcom/sumsub/sns/core/theme/SNSJsonCustomization$Companion;

    .line 10
    .line 11
    new-instance v1, Lcom/sumsub/sns/core/k;

    .line 12
    .line 13
    .line 14
    invoke-direct {v1}, Lcom/sumsub/sns/core/k;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lcom/sumsub/sns/core/theme/SNSJsonCustomization$Companion;->setDefaultJsonCustomizationProvider(Lkotlin/jvm/functions/Function0;)V

    .line 18
    .line 19
    sget-object v0, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    .line 20
    .line 21
    new-instance v0, Lcom/sumsub/sns/core/b;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0}, Lcom/sumsub/sns/core/b;-><init>()V

    .line 25
    .line 26
    new-instance v1, Lcom/sumsub/sns/core/c;

    .line 27
    .line 28
    .line 29
    invoke-direct {v1}, Lcom/sumsub/sns/core/c;-><init>()V

    .line 30
    .line 31
    new-instance v2, Lcom/sumsub/sns/core/d;

    .line 32
    .line 33
    .line 34
    invoke-direct {v2}, Lcom/sumsub/sns/core/d;-><init>()V

    .line 35
    .line 36
    new-instance v3, Lcom/sumsub/sns/core/e;

    .line 37
    .line 38
    .line 39
    invoke-direct {v3}, Lcom/sumsub/sns/core/e;-><init>()V

    .line 40
    .line 41
    new-instance v4, Lcom/sumsub/sns/core/f;

    .line 42
    .line 43
    .line 44
    invoke-direct {v4}, Lcom/sumsub/sns/core/f;-><init>()V

    .line 45
    .line 46
    new-instance v5, Lcom/sumsub/sns/core/g;

    .line 47
    .line 48
    .line 49
    invoke-direct {v5}, Lcom/sumsub/sns/core/g;-><init>()V

    .line 50
    .line 51
    new-instance v6, Lcom/sumsub/sns/core/h;

    .line 52
    .line 53
    .line 54
    invoke-direct {v6}, Lcom/sumsub/sns/core/h;-><init>()V

    .line 55
    .line 56
    new-instance v7, Lcom/sumsub/sns/core/i;

    .line 57
    .line 58
    .line 59
    invoke-direct {v7}, Lcom/sumsub/sns/core/i;-><init>()V

    .line 60
    .line 61
    new-instance v8, Lcom/sumsub/sns/core/j;

    .line 62
    .line 63
    .line 64
    invoke-direct {v8}, Lcom/sumsub/sns/core/j;-><init>()V

    .line 65
    .line 66
    new-instance v9, Lcom/sumsub/sns/core/l;

    .line 67
    .line 68
    .line 69
    invoke-direct {v9}, Lcom/sumsub/sns/core/l;-><init>()V

    .line 70
    .line 71
    new-instance v10, Lcom/sumsub/sns/core/m;

    .line 72
    .line 73
    .line 74
    invoke-direct {v10}, Lcom/sumsub/sns/core/m;-><init>()V

    .line 75
    .line 76
    new-instance v11, Lcom/sumsub/sns/core/n;

    .line 77
    .line 78
    .line 79
    invoke-direct {v11}, Lcom/sumsub/sns/core/n;-><init>()V

    .line 80
    .line 81
    new-instance v12, Lcom/sumsub/sns/core/o;

    .line 82
    .line 83
    .line 84
    invoke-direct {v12}, Lcom/sumsub/sns/core/o;-><init>()V

    .line 85
    .line 86
    sput-object v0, Lcom/sumsub/sns/internal/core/common/k0;->j:Lkotlin/jvm/functions/Function0;

    .line 87
    .line 88
    sput-object v1, Lcom/sumsub/sns/internal/core/common/k0;->k:Lkotlin/jvm/functions/Function0;

    .line 89
    .line 90
    sput-object v2, Lcom/sumsub/sns/internal/core/common/k0;->l:Lkotlin/jvm/functions/Function0;

    .line 91
    .line 92
    sput-object v3, Lcom/sumsub/sns/internal/core/common/k0;->m:Lkotlin/jvm/functions/Function0;

    .line 93
    .line 94
    sput-object v4, Lcom/sumsub/sns/internal/core/common/k0;->n:Lkotlin/jvm/functions/Function0;

    .line 95
    .line 96
    sput-object v5, Lcom/sumsub/sns/internal/core/common/k0;->o:Lkotlin/jvm/functions/Function0;

    .line 97
    .line 98
    sput-object v6, Lcom/sumsub/sns/internal/core/common/k0;->p:Lkotlin/jvm/functions/Function0;

    .line 99
    .line 100
    sput-object v7, Lcom/sumsub/sns/internal/core/common/k0;->q:Lkotlin/jvm/functions/Function0;

    .line 101
    .line 102
    sput-object v8, Lcom/sumsub/sns/internal/core/common/k0;->r:Lkotlin/jvm/functions/Function1;

    .line 103
    .line 104
    sput-object v9, Lcom/sumsub/sns/internal/core/common/k0;->s:Lkotlin/jvm/functions/Function0;

    .line 105
    .line 106
    sput-object v10, Lcom/sumsub/sns/internal/core/common/k0;->v:Lkotlin/jvm/functions/Function0;

    .line 107
    .line 108
    sput-object v11, Lcom/sumsub/sns/internal/core/common/k0;->w:Lkotlin/jvm/functions/Function0;

    .line 109
    .line 110
    sput-object v12, Lcom/sumsub/sns/internal/core/common/k0;->x:Lkotlin/jvm/functions/Function0;

    .line 111
    .line 112
    new-instance v0, Lcom/sumsub/sns/core/p;

    .line 113
    .line 114
    .line 115
    invoke-direct {v0}, Lcom/sumsub/sns/core/p;-><init>()V

    .line 116
    .line 117
    new-instance v1, Lcom/sumsub/sns/core/q;

    .line 118
    .line 119
    .line 120
    invoke-direct {v1}, Lcom/sumsub/sns/core/q;-><init>()V

    .line 121
    .line 122
    sput-object v0, Lcom/sumsub/sns/internal/core/common/k0;->t:Lkotlin/jvm/functions/Function0;

    .line 123
    .line 124
    sput-object v1, Lcom/sumsub/sns/internal/core/common/k0;->u:Lkotlin/jvm/functions/Function1;

    .line 125
    .line 126
    sget-object v0, Lcom/sumsub/sns/core/presentation/a;->a:Ljava/util/ArrayList;

    .line 127
    .line 128
    new-instance v0, Lcom/sumsub/sns/core/r;

    .line 129
    .line 130
    .line 131
    invoke-direct {v0}, Lcom/sumsub/sns/core/r;-><init>()V

    .line 132
    .line 133
    sget-object v1, Lcom/sumsub/sns/core/presentation/a;->a:Ljava/util/ArrayList;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 137
    .line 138
    sget-boolean v0, Lcom/sumsub/sns/internal/core/analytics/e;->h:Z

    .line 139
    .line 140
    if-eqz v0, :cond_0

    .line 141
    .line 142
    const-string v0, "com.sumsub.sns.videoident.BuildConfig"

    .line 143
    .line 144
    .line 145
    invoke-static {v0}, Lcom/sumsub/sns/internal/core/common/N0;->a(Ljava/lang/String;)Z

    .line 146
    move-result v0

    .line 147
    .line 148
    if-eqz v0, :cond_0

    .line 149
    .line 150
    new-instance v0, Lcom/sumsub/sns/core/s;

    .line 151
    .line 152
    .line 153
    invoke-direct {v0}, Lcom/sumsub/sns/core/s;-><init>()V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 157
    .line 158
    :cond_0
    sget-object v0, Lcom/sumsub/sns/internal/log/logger/j;->a:Lcom/sumsub/sns/internal/log/logger/j;

    .line 159
    .line 160
    sput-object v0, Lcom/sumsub/sns/core/SNSMobileSDK;->logTree:Lcom/sumsub/log/logger/Logger;

    .line 161
    .line 162
    sget v0, Lcom/sumsub/sns/R$style;->Theme_SNSCore:I

    .line 163
    .line 164
    sput v0, Lcom/sumsub/sns/core/SNSMobileSDK;->theme:I

    .line 165
    .line 166
    new-instance v0, Lcom/sumsub/sns/internal/core/exception/c;

    .line 167
    .line 168
    .line 169
    invoke-direct {v0}, Lcom/sumsub/sns/internal/core/exception/c;-><init>()V

    .line 170
    .line 171
    sput-object v0, Lcom/sumsub/sns/core/SNSMobileSDK;->exceptionHandlerInstaller:Lcom/sumsub/sns/internal/core/exception/c;

    .line 172
    return-void
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    sget-object v0, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    .line 6
    .line 7
    iput-object v0, p0, Lcom/sumsub/sns/core/SNSMobileSDK;->$$delegate_0:Lcom/sumsub/sns/internal/core/common/k0;

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
.end method

.method private static final _init_$lambda$0()Lcom/sumsub/sns/core/theme/SNSJsonCustomizationImpl;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/core/theme/SNSJsonCustomizationImpl;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/sumsub/sns/core/theme/SNSJsonCustomizationImpl;-><init>()V

    .line 6
    return-object v0
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
.end method

.method private static final _init_$lambda$1()Lcom/sumsub/sns/core/data/model/SNSInitConfig;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/core/SNSMobileSDK;->_sdk:Lcom/sumsub/sns/core/SNSMobileSDK$SDK;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/sumsub/sns/core/SNSMobileSDK$SDK;->getConf$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/data/model/SNSInitConfig;

    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method private static final _init_$lambda$10(Ljava/lang/String;)Lcom/sumsub/sns/core/SNSModule;
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/core/SNSMobileSDK;->INSTANCE:Lcom/sumsub/sns/core/SNSMobileSDK;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/sumsub/sns/core/SNSMobileSDK;->getModules()Ljava/util/List;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 10
    move-result v1

    .line 11
    .line 12
    .line 13
    invoke-interface {v0, v1}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 18
    move-result v1

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 24
    move-result-object v1

    .line 25
    move-object v2, v1

    .line 26
    .line 27
    check-cast v2, Lcom/sumsub/sns/core/SNSModule;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    move-result-object v2

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 35
    move-result-object v2

    .line 36
    .line 37
    .line 38
    invoke-static {v2, p0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    move-result v2

    .line 40
    .line 41
    if-eqz v2, :cond_0

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    const/4 v1, 0x0

    .line 44
    .line 45
    :goto_0
    check-cast v1, Lcom/sumsub/sns/core/SNSModule;

    .line 46
    return-object v1
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
.end method

.method private static final _init_$lambda$11()Lcom/sumsub/sns/core/data/listener/SNSIconHandler;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/core/SNSMobileSDK;->_sdk:Lcom/sumsub/sns/core/SNSMobileSDK$SDK;

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/sumsub/sns/core/SNSMobileSDK$SDK;->getIconHandler$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/data/listener/SNSIconHandler;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    return-object v0

    .line 13
    .line 14
    :cond_1
    :goto_0
    new-instance v0, Lcom/sumsub/sns/core/data/listener/SNSDefaultIconHandler;

    .line 15
    .line 16
    .line 17
    invoke-direct {v0}, Lcom/sumsub/sns/core/data/listener/SNSDefaultIconHandler;-><init>()V

    .line 18
    return-object v0
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
.end method

.method private static final _init_$lambda$12()Ljava/util/Map;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/core/SNSMobileSDK;->_sdk:Lcom/sumsub/sns/core/SNSMobileSDK$SDK;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/sumsub/sns/core/SNSMobileSDK$SDK;->getPreferredDocumentsDefinitions$idensic_mobile_sdk_aar_defaultRelease()Ljava/util/Map;

    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method private static final _init_$lambda$13()Ljava/lang/Integer;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/core/SNSMobileSDK;->_sdk:Lcom/sumsub/sns/core/SNSMobileSDK$SDK;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/sumsub/sns/core/SNSMobileSDK$SDK;->getAutoCloseOnApproveTimeout$idensic_mobile_sdk_aar_defaultRelease()Ljava/lang/Integer;

    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method private static final _init_$lambda$14()Lcom/sumsub/sns/core/data/listener/SNSUrlHandler;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/core/SNSMobileSDK;->_sdk:Lcom/sumsub/sns/core/SNSMobileSDK$SDK;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/sumsub/sns/core/SNSMobileSDK$SDK;->getSnsUrlHandler$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/data/listener/SNSUrlHandler;

    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method private static final _init_$lambda$15()Ljava/util/List;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/core/SNSMobileSDK;->_sdk:Lcom/sumsub/sns/core/SNSMobileSDK$SDK;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/sumsub/sns/core/SNSMobileSDK$SDK;->getSupportItems$idensic_mobile_sdk_aar_defaultRelease()Ljava/util/List;

    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method private static final _init_$lambda$16(Ljava/util/List;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/core/SNSMobileSDK;->_sdk:Lcom/sumsub/sns/core/SNSMobileSDK$SDK;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p0}, Lcom/sumsub/sns/core/SNSMobileSDK$SDK;->setSupportItems$idensic_mobile_sdk_aar_defaultRelease(Ljava/util/List;)V

    .line 8
    .line 9
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 10
    return-object p0
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
.end method

.method private static final _init_$lambda$17(Landroidx/fragment/app/Fragment;)Lcom/sumsub/sns/internal/core/analytics/Screen;
    .locals 1

    .line 1
    .line 2
    instance-of v0, p0, Lcom/sumsub/sns/internal/features/presentation/intro/j;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    sget-object p0, Lcom/sumsub/sns/internal/core/analytics/Screen;->InstructionsScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 7
    return-object p0

    .line 8
    .line 9
    :cond_0
    instance-of v0, p0, Lcom/sumsub/sns/internal/features/presentation/status/m;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    sget-object p0, Lcom/sumsub/sns/internal/core/analytics/Screen;->StatusScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 14
    return-object p0

    .line 15
    .line 16
    :cond_1
    instance-of v0, p0, Lcom/sumsub/sns/internal/features/presentation/dialogs/bottomsheet/a;

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    sget-object p0, Lcom/sumsub/sns/internal/core/analytics/Screen;->AgreementScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 21
    return-object p0

    .line 22
    .line 23
    :cond_2
    instance-of v0, p0, Lcom/sumsub/sns/internal/features/presentation/country/picker/CountryPickerDialog;

    .line 24
    .line 25
    if-eqz v0, :cond_3

    .line 26
    .line 27
    sget-object p0, Lcom/sumsub/sns/internal/core/analytics/Screen;->CountriesScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 28
    return-object p0

    .line 29
    .line 30
    :cond_3
    instance-of v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/l;

    .line 31
    .line 32
    if-eqz v0, :cond_4

    .line 33
    .line 34
    sget-object p0, Lcom/sumsub/sns/internal/core/analytics/Screen;->PreviewScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 35
    return-object p0

    .line 36
    .line 37
    :cond_4
    instance-of v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/F;

    .line 38
    .line 39
    if-eqz v0, :cond_5

    .line 40
    .line 41
    sget-object p0, Lcom/sumsub/sns/internal/core/analytics/Screen;->MrtdScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 42
    return-object p0

    .line 43
    .line 44
    :cond_5
    instance-of v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/g;

    .line 45
    .line 46
    if-eqz v0, :cond_6

    .line 47
    .line 48
    sget-object p0, Lcom/sumsub/sns/internal/core/analytics/Screen;->PreviewScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 49
    return-object p0

    .line 50
    .line 51
    :cond_6
    instance-of v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/h;

    .line 52
    .line 53
    if-eqz v0, :cond_7

    .line 54
    .line 55
    sget-object p0, Lcom/sumsub/sns/internal/core/analytics/Screen;->ApplicantDataScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 56
    return-object p0

    .line 57
    .line 58
    :cond_7
    instance-of v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/common/f;

    .line 59
    .line 60
    if-eqz v0, :cond_8

    .line 61
    .line 62
    sget-object p0, Lcom/sumsub/sns/internal/core/analytics/Screen;->PreviewScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 63
    return-object p0

    .line 64
    .line 65
    :cond_8
    instance-of v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;

    .line 66
    .line 67
    if-nez v0, :cond_18

    .line 68
    .line 69
    instance-of v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSLiveness3dFaceFragment;

    .line 70
    .line 71
    if-eqz v0, :cond_9

    .line 72
    goto :goto_0

    .line 73
    .line 74
    :cond_9
    instance-of v0, p0, Lcom/sumsub/sns/internal/features/presentation/verification/p;

    .line 75
    .line 76
    if-eqz v0, :cond_a

    .line 77
    .line 78
    sget-object p0, Lcom/sumsub/sns/internal/core/analytics/Screen;->ConfirmationContactScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 79
    return-object p0

    .line 80
    .line 81
    :cond_a
    instance-of v0, p0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/SNSQuestionnaireFragment;

    .line 82
    .line 83
    if-eqz v0, :cond_b

    .line 84
    .line 85
    sget-object p0, Lcom/sumsub/sns/internal/core/analytics/Screen;->QuestionnaireScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 86
    return-object p0

    .line 87
    .line 88
    :cond_b
    instance-of v0, p0, Lcom/sumsub/sns/internal/features/presentation/exitsurvey/g;

    .line 89
    .line 90
    if-eqz v0, :cond_c

    .line 91
    .line 92
    sget-object p0, Lcom/sumsub/sns/internal/core/analytics/Screen;->ExitSurveyScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 93
    return-object p0

    .line 94
    .line 95
    :cond_c
    instance-of v0, p0, Lcom/sumsub/sns/internal/features/presentation/support/f;

    .line 96
    .line 97
    if-eqz v0, :cond_d

    .line 98
    .line 99
    sget-object p0, Lcom/sumsub/sns/internal/core/analytics/Screen;->SupportScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 100
    return-object p0

    .line 101
    .line 102
    :cond_d
    instance-of v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/g;

    .line 103
    .line 104
    if-eqz v0, :cond_e

    .line 105
    .line 106
    sget-object p0, Lcom/sumsub/sns/internal/core/analytics/Screen;->DocTypeSelectorScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 107
    return-object p0

    .line 108
    .line 109
    :cond_e
    instance-of v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/l;

    .line 110
    .line 111
    if-eqz v0, :cond_f

    .line 112
    .line 113
    sget-object p0, Lcom/sumsub/sns/internal/core/analytics/Screen;->CameraScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 114
    return-object p0

    .line 115
    .line 116
    :cond_f
    instance-of v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/selfie/m;

    .line 117
    .line 118
    if-eqz v0, :cond_10

    .line 119
    .line 120
    sget-object p0, Lcom/sumsub/sns/internal/core/analytics/Screen;->CameraScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 121
    return-object p0

    .line 122
    .line 123
    :cond_10
    instance-of v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/K;

    .line 124
    .line 125
    if-eqz v0, :cond_11

    .line 126
    .line 127
    sget-object p0, Lcom/sumsub/sns/internal/core/analytics/Screen;->CameraScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 128
    return-object p0

    .line 129
    .line 130
    :cond_11
    instance-of v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;

    .line 131
    .line 132
    if-eqz v0, :cond_12

    .line 133
    .line 134
    sget-object p0, Lcom/sumsub/sns/internal/core/analytics/Screen;->CameraScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 135
    return-object p0

    .line 136
    .line 137
    :cond_12
    instance-of v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/video/i;

    .line 138
    .line 139
    if-eqz v0, :cond_13

    .line 140
    .line 141
    sget-object p0, Lcom/sumsub/sns/internal/core/analytics/Screen;->VideoScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 142
    return-object p0

    .line 143
    .line 144
    :cond_13
    instance-of v0, p0, Lcom/sumsub/sns/internal/features/presentation/consent/f;

    .line 145
    .line 146
    if-eqz v0, :cond_14

    .line 147
    .line 148
    sget-object p0, Lcom/sumsub/sns/internal/core/analytics/Screen;->AgreementSelectorScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 149
    return-object p0

    .line 150
    .line 151
    :cond_14
    instance-of v0, p0, Lcom/sumsub/sns/internal/features/presentation/restrictions/n;

    .line 152
    .line 153
    if-eqz v0, :cond_15

    .line 154
    .line 155
    sget-object p0, Lcom/sumsub/sns/internal/core/analytics/Screen;->RestrictionsScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 156
    return-object p0

    .line 157
    .line 158
    :cond_15
    instance-of v0, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/h;

    .line 159
    .line 160
    if-eqz v0, :cond_16

    .line 161
    .line 162
    sget-object p0, Lcom/sumsub/sns/internal/core/analytics/Screen;->PaymentMethodsSelectorScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 163
    return-object p0

    .line 164
    .line 165
    :cond_16
    instance-of p0, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/h;

    .line 166
    .line 167
    if-eqz p0, :cond_17

    .line 168
    .line 169
    sget-object p0, Lcom/sumsub/sns/internal/core/analytics/Screen;->PaymentMethodsBankCardUploadScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 170
    return-object p0

    .line 171
    .line 172
    :cond_17
    sget-object p0, Lcom/sumsub/sns/internal/core/analytics/Screen;->Other:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 173
    return-object p0

    .line 174
    .line 175
    :cond_18
    :goto_0
    sget-object p0, Lcom/sumsub/sns/internal/core/analytics/Screen;->LivenessScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 176
    return-object p0
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
.end method

.method private static final _init_$lambda$19(Landroidx/fragment/app/Fragment;)Lcom/sumsub/sns/internal/core/analytics/Screen;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/core/analytics/Screen;->VideoidentScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 3
    .line 4
    instance-of p0, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoIdentFragment;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    return-object v0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    return-object p0
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
    .line 25
.end method

.method private static final _init_$lambda$2()Ljava/util/Map;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/core/SNSMobileSDK;->_sdk:Lcom/sumsub/sns/core/SNSMobileSDK$SDK;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/sumsub/sns/core/SNSMobileSDK$SDK;->getSettings$idensic_mobile_sdk_aar_defaultRelease()Ljava/util/Map;

    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method private static final _init_$lambda$3()Lcom/sumsub/sns/core/data/listener/TokenExpirationHandler;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/core/SNSMobileSDK;->_sdk:Lcom/sumsub/sns/core/SNSMobileSDK$SDK;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/sumsub/sns/core/SNSMobileSDK$SDK;->getOnTokenExpiration$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/data/listener/TokenExpirationHandler;

    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method private static final _init_$lambda$4()Lcom/sumsub/sns/core/data/listener/SNSStateChangedHandler;
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/core/SNSMobileSDK;->_sdk:Lcom/sumsub/sns/core/SNSMobileSDK$SDK;

    .line 3
    .line 4
    instance-of v1, v0, Lcom/sumsub/sns/core/SNSMobileSDK$SNSSDK;

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Lcom/sumsub/sns/core/SNSMobileSDK$SNSSDK;

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object v0, v2

    .line 12
    .line 13
    :goto_0
    if-eqz v0, :cond_1

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/sumsub/sns/core/SNSMobileSDK$SNSSDK;->getStateChangedHandler$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/data/listener/SNSStateChangedHandler;

    .line 17
    move-result-object v0

    .line 18
    return-object v0

    .line 19
    :cond_1
    return-object v2
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
.end method

.method private static final _init_$lambda$5()Lcom/sumsub/sns/core/data/listener/SNSErrorHandler;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/core/SNSMobileSDK;->_sdk:Lcom/sumsub/sns/core/SNSMobileSDK$SDK;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/sumsub/sns/core/SNSMobileSDK$SDK;->getErrorHandler$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/data/listener/SNSErrorHandler;

    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method private static final _init_$lambda$6()Lcom/sumsub/sns/core/data/listener/SNSEventHandler;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/core/SNSMobileSDK;->_sdk:Lcom/sumsub/sns/core/SNSMobileSDK$SDK;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/sumsub/sns/core/SNSMobileSDK$SDK;->getEventHandler$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/data/listener/SNSEventHandler;

    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method private static final _init_$lambda$7()Lcom/sumsub/sns/core/theme/SNSJsonCustomization;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/core/SNSMobileSDK;->_sdk:Lcom/sumsub/sns/core/SNSMobileSDK$SDK;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/sumsub/sns/core/SNSMobileSDK$SDK;->getCustomization$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/theme/SNSJsonCustomization;

    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method private static final _init_$lambda$8()Lcom/sumsub/sns/core/data/listener/SNSInstructionsViewHandler;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/core/SNSMobileSDK;->_sdk:Lcom/sumsub/sns/core/SNSMobileSDK$SDK;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/sumsub/sns/core/SNSMobileSDK$SDK;->getInstructionsViewHandler$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/data/listener/SNSInstructionsViewHandler;

    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public static synthetic a()Lcom/sumsub/sns/core/data/listener/SNSInstructionsViewHandler;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/sumsub/sns/core/SNSMobileSDK;->_init_$lambda$8()Lcom/sumsub/sns/core/data/listener/SNSInstructionsViewHandler;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method

.method public static final synthetic access$start(Lcom/sumsub/sns/core/SNSMobileSDK;Lcom/sumsub/sns/core/SNSMobileSDK$SDK;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/sumsub/sns/core/SNSMobileSDK;->start(Lcom/sumsub/sns/core/SNSMobileSDK$SDK;)V

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
.end method

.method public static synthetic b()Lcom/sumsub/sns/core/theme/SNSJsonCustomizationImpl;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/sumsub/sns/core/SNSMobileSDK;->_init_$lambda$0()Lcom/sumsub/sns/core/theme/SNSJsonCustomizationImpl;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method

.method public static synthetic c()Ljava/util/List;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/sumsub/sns/core/SNSMobileSDK;->_init_$lambda$15()Ljava/util/List;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method

.method public static synthetic d()Ljava/util/Map;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/sumsub/sns/core/SNSMobileSDK;->_init_$lambda$2()Ljava/util/Map;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method

.method public static synthetic e()Lcom/sumsub/sns/core/data/listener/SNSEventHandler;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/sumsub/sns/core/SNSMobileSDK;->_init_$lambda$6()Lcom/sumsub/sns/core/data/listener/SNSEventHandler;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method

.method public static synthetic f()Ljava/lang/Integer;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/sumsub/sns/core/SNSMobileSDK;->_init_$lambda$13()Ljava/lang/Integer;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method

.method public static synthetic g()Lcom/sumsub/sns/core/data/listener/SNSErrorHandler;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/sumsub/sns/core/SNSMobileSDK;->_init_$lambda$5()Lcom/sumsub/sns/core/data/listener/SNSErrorHandler;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method

.method private final getModules()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sumsub/sns/core/SNSModule;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/core/SNSMobileSDK;->_sdk:Lcom/sumsub/sns/core/SNSMobileSDK$SDK;

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/sumsub/sns/core/SNSMobileSDK$SDK;->getModules$idensic_mobile_sdk_aar_defaultRelease()Ljava/util/List;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    return-object v0

    .line 13
    .line 14
    .line 15
    :cond_1
    :goto_0
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 16
    move-result-object v0

    .line 17
    return-object v0
.end method

.method public static synthetic h()Lcom/sumsub/sns/core/theme/SNSJsonCustomization;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/sumsub/sns/core/SNSMobileSDK;->_init_$lambda$7()Lcom/sumsub/sns/core/theme/SNSJsonCustomization;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method

.method public static synthetic i(Landroidx/fragment/app/Fragment;)Lcom/sumsub/sns/internal/core/analytics/Screen;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/sumsub/sns/core/SNSMobileSDK;->_init_$lambda$19(Landroidx/fragment/app/Fragment;)Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
    .line 25
.end method

.method private final initFeatures(Lcom/sumsub/sns/core/SNSMobileSDK$SDK;)V
    .locals 7

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/ff/a;->b:Lcom/sumsub/sns/internal/ff/core/b;

    .line 3
    .line 4
    iget-object v1, v0, Lcom/sumsub/sns/internal/ff/core/b;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    .line 11
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    .line 15
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    move-result v2

    .line 17
    const/4 v3, 0x0

    .line 18
    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    .line 22
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    move-result-object v2

    .line 24
    .line 25
    check-cast v2, Ljava/util/Map$Entry;

    .line 26
    .line 27
    .line 28
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 29
    move-result-object v2

    .line 30
    .line 31
    check-cast v2, Lcom/sumsub/sns/internal/ff/core/a;

    .line 32
    .line 33
    iget-object v4, v2, Lcom/sumsub/sns/internal/ff/core/a;->d:Ljava/util/concurrent/atomic/AtomicReference;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v4, v3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 37
    .line 38
    iget-object v4, v2, Lcom/sumsub/sns/internal/ff/core/a;->f:Ljava/util/concurrent/atomic/AtomicReference;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v4, v3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 42
    .line 43
    iget-object v2, v2, Lcom/sumsub/sns/internal/ff/core/a;->e:Ljava/util/concurrent/atomic/AtomicReference;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 47
    goto :goto_0

    .line 48
    .line 49
    :cond_0
    iget-object v0, v0, Lcom/sumsub/sns/internal/ff/core/b;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    .line 53
    move-result-object v0

    .line 54
    .line 55
    .line 56
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 57
    move-result-object v0

    .line 58
    .line 59
    .line 60
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    move-result v1

    .line 62
    .line 63
    if-eqz v1, :cond_1

    .line 64
    .line 65
    .line 66
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    move-result-object v1

    .line 68
    .line 69
    check-cast v1, Ljava/util/Map$Entry;

    .line 70
    .line 71
    .line 72
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 73
    move-result-object v1

    .line 74
    .line 75
    check-cast v1, Lcom/sumsub/sns/internal/ff/core/a;

    .line 76
    .line 77
    iget-object v2, v1, Lcom/sumsub/sns/internal/ff/core/a;->d:Ljava/util/concurrent/atomic/AtomicReference;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 81
    .line 82
    iget-object v2, v1, Lcom/sumsub/sns/internal/ff/core/a;->f:Ljava/util/concurrent/atomic/AtomicReference;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 86
    .line 87
    iget-object v1, v1, Lcom/sumsub/sns/internal/ff/core/a;->e:Ljava/util/concurrent/atomic/AtomicReference;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1, v3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 91
    goto :goto_1

    .line 92
    .line 93
    :cond_1
    sget-object v0, Lcom/sumsub/sns/internal/ff/a;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    .line 97
    move-result-object v0

    .line 98
    .line 99
    .line 100
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 101
    move-result-object v0

    .line 102
    .line 103
    .line 104
    :cond_2
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 105
    move-result v1

    .line 106
    .line 107
    if-eqz v1, :cond_4

    .line 108
    .line 109
    .line 110
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 111
    move-result-object v1

    .line 112
    .line 113
    check-cast v1, Ljava/util/Map$Entry;

    .line 114
    .line 115
    sget-object v2, Lcom/sumsub/sns/internal/ff/a;->b:Lcom/sumsub/sns/internal/ff/core/b;

    .line 116
    .line 117
    .line 118
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 119
    move-result-object v4

    .line 120
    .line 121
    check-cast v4, Ljava/lang/String;

    .line 122
    .line 123
    iget-object v5, v2, Lcom/sumsub/sns/internal/ff/core/b;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v5, v4}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    move-result-object v5

    .line 128
    .line 129
    check-cast v5, Lcom/sumsub/sns/internal/ff/core/a;

    .line 130
    .line 131
    if-nez v5, :cond_3

    .line 132
    .line 133
    iget-object v2, v2, Lcom/sumsub/sns/internal/ff/core/b;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2, v4}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    move-result-object v2

    .line 138
    move-object v5, v2

    .line 139
    .line 140
    check-cast v5, Lcom/sumsub/sns/internal/ff/core/a;

    .line 141
    .line 142
    :cond_3
    if-eqz v5, :cond_2

    .line 143
    .line 144
    .line 145
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 146
    move-result-object v2

    .line 147
    .line 148
    check-cast v2, Lkotlin/Pair;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v2}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 152
    move-result-object v2

    .line 153
    .line 154
    check-cast v2, Ljava/lang/Boolean;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 158
    move-result v2

    .line 159
    .line 160
    .line 161
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 162
    move-result-object v1

    .line 163
    .line 164
    check-cast v1, Lkotlin/Pair;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 168
    move-result-object v1

    .line 169
    .line 170
    check-cast v1, Ljava/lang/String;

    .line 171
    .line 172
    iget-object v4, v5, Lcom/sumsub/sns/internal/ff/core/a;->f:Ljava/util/concurrent/atomic/AtomicReference;

    .line 173
    .line 174
    new-instance v5, Lcom/sumsub/sns/internal/ff/core/c;

    .line 175
    .line 176
    sget-object v6, Lcom/sumsub/sns/internal/ff/core/FeatureFlagValueType;->DEFAULT:Lcom/sumsub/sns/internal/ff/core/FeatureFlagValueType;

    .line 177
    .line 178
    .line 179
    invoke-direct {v5, v2, v1}, Lcom/sumsub/sns/internal/ff/core/c;-><init>(ZLjava/lang/String;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v4, v5}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 183
    goto :goto_2

    .line 184
    .line 185
    .line 186
    :cond_4
    invoke-virtual {p1}, Lcom/sumsub/sns/core/SNSMobileSDK$SDK;->getModules$idensic_mobile_sdk_aar_defaultRelease()Ljava/util/List;

    .line 187
    move-result-object v0

    .line 188
    .line 189
    new-instance v1, Ljava/util/ArrayList;

    .line 190
    .line 191
    const/16 v2, 0xa

    .line 192
    .line 193
    .line 194
    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 195
    move-result v2

    .line 196
    .line 197
    .line 198
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 199
    .line 200
    .line 201
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 202
    move-result-object v0

    .line 203
    .line 204
    .line 205
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 206
    move-result v2

    .line 207
    .line 208
    if-eqz v2, :cond_5

    .line 209
    .line 210
    .line 211
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 212
    move-result-object v2

    .line 213
    .line 214
    check-cast v2, Lcom/sumsub/sns/core/SNSModule;

    .line 215
    .line 216
    .line 217
    invoke-virtual {v2}, Lcom/sumsub/sns/core/SNSModule;->getName()Ljava/lang/String;

    .line 218
    move-result-object v2

    .line 219
    .line 220
    .line 221
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 222
    goto :goto_3

    .line 223
    .line 224
    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 228
    .line 229
    const-string v2, "initFeatures: "

    .line 230
    .line 231
    .line 232
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 239
    move-result-object v0

    .line 240
    .line 241
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 242
    .line 243
    iget-object v1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 244
    .line 245
    const-string v2, "SDK"

    .line 246
    .line 247
    .line 248
    invoke-virtual {v1, v2, v0, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {p1}, Lcom/sumsub/sns/core/SNSMobileSDK$SDK;->getModules$idensic_mobile_sdk_aar_defaultRelease()Ljava/util/List;

    .line 252
    move-result-object p1

    .line 253
    .line 254
    .line 255
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 256
    move-result-object p1

    .line 257
    .line 258
    .line 259
    :cond_6
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 260
    move-result v0

    .line 261
    .line 262
    if-eqz v0, :cond_8

    .line 263
    .line 264
    .line 265
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 266
    move-result-object v0

    .line 267
    .line 268
    check-cast v0, Lcom/sumsub/sns/core/SNSModule;

    .line 269
    .line 270
    instance-of v1, v0, Lcom/sumsub/sns/core/SNSProoface;

    .line 271
    .line 272
    if-eqz v1, :cond_7

    .line 273
    .line 274
    sget-object v1, Lcom/sumsub/sns/internal/ff/a;->l:Lcom/sumsub/sns/internal/ff/core/a;

    .line 275
    move-object v2, v0

    .line 276
    .line 277
    check-cast v2, Lcom/sumsub/sns/core/SNSProoface;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v2}, Lcom/sumsub/sns/core/SNSProoface;->isDebug()Z

    .line 281
    move-result v3

    .line 282
    .line 283
    .line 284
    invoke-static {v1, v3}, Lcom/sumsub/sns/internal/ff/core/a;->a(Lcom/sumsub/sns/internal/ff/core/a;Z)V

    .line 285
    .line 286
    sget-object v1, Lcom/sumsub/sns/internal/ff/a;->m:Lcom/sumsub/sns/internal/ff/core/a;

    .line 287
    .line 288
    .line 289
    invoke-virtual {v2}, Lcom/sumsub/sns/core/SNSProoface;->isShowSettingsDialog()Z

    .line 290
    move-result v2

    .line 291
    .line 292
    .line 293
    invoke-static {v1, v2}, Lcom/sumsub/sns/internal/ff/core/a;->a(Lcom/sumsub/sns/internal/ff/core/a;Z)V

    .line 294
    .line 295
    :cond_7
    instance-of v1, v0, Lcom/sumsub/sns/core/SNSCoreModule;

    .line 296
    .line 297
    if-eqz v1, :cond_6

    .line 298
    .line 299
    sget-object v1, Lcom/sumsub/sns/internal/ff/a;->k:Lcom/sumsub/sns/internal/ff/core/a;

    .line 300
    .line 301
    check-cast v0, Lcom/sumsub/sns/core/SNSCoreModule;

    .line 302
    .line 303
    .line 304
    invoke-virtual {v0}, Lcom/sumsub/sns/core/SNSCoreModule;->isFullScreenCamera()Z

    .line 305
    move-result v2

    .line 306
    .line 307
    .line 308
    invoke-static {v1, v2}, Lcom/sumsub/sns/internal/ff/core/a;->a(Lcom/sumsub/sns/internal/ff/core/a;Z)V

    .line 309
    .line 310
    sget-object v1, Lcom/sumsub/sns/internal/ff/a;->j:Lcom/sumsub/sns/internal/ff/core/a;

    .line 311
    .line 312
    .line 313
    invoke-virtual {v0}, Lcom/sumsub/sns/core/SNSCoreModule;->isSkipGeolocationForm()Z

    .line 314
    move-result v0

    .line 315
    .line 316
    .line 317
    invoke-static {v1, v0}, Lcom/sumsub/sns/internal/ff/core/a;->a(Lcom/sumsub/sns/internal/ff/core/a;Z)V

    .line 318
    goto :goto_4

    .line 319
    :cond_8
    return-void
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
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
.end method

.method private final initLogger(Lcom/sumsub/sns/core/SNSMobileSDK$SDK;)V
    .locals 4

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/sumsub/sns/core/SNSMobileSDK$SDK;->isDebug$idensic_mobile_sdk_aar_defaultRelease()Z

    .line 6
    .line 7
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->b:Lcom/sumsub/sns/internal/log/b;

    .line 8
    const/4 v1, 0x0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 12
    .line 13
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 14
    .line 15
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->b:Lcom/sumsub/sns/internal/log/logger/a;

    .line 16
    monitor-enter v0

    .line 17
    .line 18
    :try_start_0
    iget-object v1, v0, Lcom/sumsub/sns/internal/log/logger/a;->a:Ljava/util/ArrayList;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 22
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 28
    .line 29
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->c:Lcom/sumsub/sns/internal/log/logger/k;

    .line 30
    .line 31
    iget-object v2, v1, Lcom/sumsub/sns/internal/log/logger/k;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Lcom/sumsub/sns/core/SNSMobileSDK$SDK;->isDebug$idensic_mobile_sdk_aar_defaultRelease()Z

    .line 38
    move-result v2

    .line 39
    .line 40
    if-eqz v2, :cond_1

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, Lcom/sumsub/sns/core/SNSMobileSDK$SDK;->getLogTree$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/log/logger/Logger;

    .line 44
    move-result-object p1

    .line 45
    .line 46
    instance-of v2, p1, Lcom/sumsub/sns/internal/log/logger/j;

    .line 47
    .line 48
    if-eqz v2, :cond_0

    .line 49
    .line 50
    sget-object v2, Lcom/sumsub/sns/internal/log/LoggerType;->LOG_CAT:Lcom/sumsub/sns/internal/log/LoggerType;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    iget-object v0, v1, Lcom/sumsub/sns/internal/log/logger/k;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    return-void

    .line 60
    .line 61
    :cond_0
    sget-object v2, Lcom/sumsub/sns/internal/log/LoggerType;->LOG_CAT:Lcom/sumsub/sns/internal/log/LoggerType;

    .line 62
    .line 63
    sget-object v3, Lcom/sumsub/sns/internal/log/logger/j;->a:Lcom/sumsub/sns/internal/log/logger/j;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    iget-object v2, v1, Lcom/sumsub/sns/internal/log/logger/k;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2, v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 72
    .line 73
    sget-object v2, Lcom/sumsub/sns/internal/log/LoggerType;->SDK_CLIENT:Lcom/sumsub/sns/internal/log/LoggerType;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, v2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    iget-object v0, v1, Lcom/sumsub/sns/internal/log/logger/k;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 82
    :cond_1
    return-void

    .line 83
    :catchall_0
    move-exception p1

    .line 84
    monitor-exit v0

    .line 85
    throw p1
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
.end method

.method public static synthetic j()Ljava/util/Map;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/sumsub/sns/core/SNSMobileSDK;->_init_$lambda$12()Ljava/util/Map;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method

.method public static synthetic k()Lcom/sumsub/sns/core/data/model/SNSInitConfig;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/sumsub/sns/core/SNSMobileSDK;->_init_$lambda$1()Lcom/sumsub/sns/core/data/model/SNSInitConfig;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method

.method public static synthetic l()Lcom/sumsub/sns/core/data/listener/TokenExpirationHandler;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/sumsub/sns/core/SNSMobileSDK;->_init_$lambda$3()Lcom/sumsub/sns/core/data/listener/TokenExpirationHandler;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method

.method public static synthetic m(Ljava/lang/String;)Lcom/sumsub/sns/core/SNSModule;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/sumsub/sns/core/SNSMobileSDK;->_init_$lambda$10(Ljava/lang/String;)Lcom/sumsub/sns/core/SNSModule;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
    .line 25
.end method

.method public static synthetic n()Lcom/sumsub/sns/core/data/listener/SNSIconHandler;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/sumsub/sns/core/SNSMobileSDK;->_init_$lambda$11()Lcom/sumsub/sns/core/data/listener/SNSIconHandler;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method

.method public static synthetic o()Lcom/sumsub/sns/core/data/listener/SNSUrlHandler;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/sumsub/sns/core/SNSMobileSDK;->_init_$lambda$14()Lcom/sumsub/sns/core/data/listener/SNSUrlHandler;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method

.method public static synthetic p(Landroidx/fragment/app/Fragment;)Lcom/sumsub/sns/internal/core/analytics/Screen;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/sumsub/sns/core/SNSMobileSDK;->_init_$lambda$17(Landroidx/fragment/app/Fragment;)Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
    .line 25
.end method

.method public static synthetic q(Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/sumsub/sns/core/SNSMobileSDK;->_init_$lambda$16(Ljava/util/List;)Lkotlin/Unit;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
    .line 25
.end method

.method public static synthetic r(Lcom/sumsub/sns/core/SNSModule;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/sumsub/sns/core/SNSMobileSDK;->toString$lambda$20(Lcom/sumsub/sns/core/SNSModule;)Ljava/lang/CharSequence;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
    .line 25
.end method

.method public static synthetic s()Lcom/sumsub/sns/core/data/listener/SNSStateChangedHandler;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/sumsub/sns/core/SNSMobileSDK;->_init_$lambda$4()Lcom/sumsub/sns/core/data/listener/SNSStateChangedHandler;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method

.method private final start(Lcom/sumsub/sns/core/SNSMobileSDK$SDK;)V
    .locals 14

    .line 1
    .line 2
    const-string v1, "SDK"

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/sumsub/sns/core/SNSMobileSDK$SDK;->getWeakActivity$idensic_mobile_sdk_aar_defaultRelease()Ljava/lang/ref/WeakReference;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    check-cast v0, Landroid/app/Activity;

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    return-void

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 19
    move-result-object v2

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/sumsub/sns/core/SNSMobileSDK$SDK;->getUrl$idensic_mobile_sdk_aar_defaultRelease()Ljava/lang/String;

    .line 23
    move-result-object v5

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/sumsub/sns/core/SNSMobileSDK$SDK;->getAccessToken$idensic_mobile_sdk_aar_defaultRelease()Ljava/lang/String;

    .line 27
    move-result-object v3

    .line 28
    .line 29
    if-nez v3, :cond_1

    .line 30
    .line 31
    const-string v3, ""

    .line 32
    :cond_1
    move-object v12, v3

    .line 33
    .line 34
    .line 35
    invoke-direct {p0, p1}, Lcom/sumsub/sns/core/SNSMobileSDK;->initFeatures(Lcom/sumsub/sns/core/SNSMobileSDK$SDK;)V

    .line 36
    .line 37
    .line 38
    invoke-direct {p0, p1}, Lcom/sumsub/sns/core/SNSMobileSDK;->initLogger(Lcom/sumsub/sns/core/SNSMobileSDK$SDK;)V

    .line 39
    .line 40
    sput-object p1, Lcom/sumsub/sns/core/SNSMobileSDK;->_sdk:Lcom/sumsub/sns/core/SNSMobileSDK$SDK;

    .line 41
    const/4 v3, 0x1

    .line 42
    .line 43
    sput-boolean v3, Lcom/sumsub/sns/core/SNSMobileSDK;->isStartedInProcess:Z

    .line 44
    const/4 v4, 0x0

    .line 45
    .line 46
    sput-boolean v4, Lcom/sumsub/sns/core/SNSMobileSDK;->isCallbacksLostReported:Z

    .line 47
    .line 48
    sput-boolean v4, Lcom/sumsub/sns/internal/core/common/k0;->h:Z

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1}, Lcom/sumsub/sns/core/SNSMobileSDK$SDK;->isDebug$idensic_mobile_sdk_aar_defaultRelease()Z

    .line 52
    move-result v6

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1}, Lcom/sumsub/sns/core/SNSMobileSDK$SDK;->getLocale$idensic_mobile_sdk_aar_defaultRelease()Ljava/util/Locale;

    .line 56
    move-result-object v7

    .line 57
    .line 58
    sput-boolean v6, Lcom/sumsub/sns/internal/core/common/k0;->f:Z

    .line 59
    .line 60
    sput-object v7, Lcom/sumsub/sns/internal/core/common/k0;->e:Ljava/util/Locale;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1}, Lcom/sumsub/sns/core/SNSMobileSDK$SDK;->getLogTree$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/log/logger/Logger;

    .line 64
    move-result-object v6

    .line 65
    .line 66
    sput-object v6, Lcom/sumsub/sns/core/SNSMobileSDK;->logTree:Lcom/sumsub/log/logger/Logger;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1}, Lcom/sumsub/sns/core/SNSMobileSDK$SDK;->getTheme$idensic_mobile_sdk_aar_defaultRelease()Ljava/lang/Integer;

    .line 70
    move-result-object v6

    .line 71
    .line 72
    if-eqz v6, :cond_2

    .line 73
    .line 74
    .line 75
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 76
    move-result v6

    .line 77
    goto :goto_0

    .line 78
    .line 79
    :cond_2
    sget v6, Lcom/sumsub/sns/core/SNSMobileSDK;->theme:I

    .line 80
    .line 81
    :goto_0
    sput v6, Lcom/sumsub/sns/core/SNSMobileSDK;->theme:I

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1}, Lcom/sumsub/sns/core/SNSMobileSDK$SDK;->getTheme$idensic_mobile_sdk_aar_defaultRelease()Ljava/lang/Integer;

    .line 85
    move-result-object v6

    .line 86
    .line 87
    if-eqz v6, :cond_3

    .line 88
    move v4, v3

    .line 89
    .line 90
    :cond_3
    sput-boolean v4, Lcom/sumsub/sns/core/SNSMobileSDK;->xmlThemeUsed:Z

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1}, Lcom/sumsub/sns/core/SNSMobileSDK$SDK;->getCustomizationSource$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/theme/SNSJsonCustomizationSource;

    .line 94
    move-result-object v4

    .line 95
    .line 96
    sput-object v4, Lcom/sumsub/sns/core/SNSMobileSDK;->customizationSource:Lcom/sumsub/sns/core/theme/SNSJsonCustomizationSource;

    .line 97
    const/4 v13, 0x0

    .line 98
    .line 99
    :try_start_0
    sget-object v4, Lcom/sumsub/sns/core/SNSMobileSDK;->_sdk:Lcom/sumsub/sns/core/SNSMobileSDK$SDK;

    .line 100
    .line 101
    if-eqz v4, :cond_4

    .line 102
    .line 103
    .line 104
    invoke-virtual {v4}, Lcom/sumsub/sns/core/SNSMobileSDK$SDK;->getCustomization$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/theme/SNSJsonCustomization;

    .line 105
    move-result-object v4

    .line 106
    .line 107
    if-eqz v4, :cond_4

    .line 108
    .line 109
    .line 110
    invoke-interface {v4, v2}, Lcom/sumsub/sns/core/theme/SNSJsonCustomization;->loadResources(Landroid/content/Context;)V

    .line 111
    goto :goto_1

    .line 112
    :catch_0
    move-exception v0

    .line 113
    move-object p1, v0

    .line 114
    .line 115
    goto/16 :goto_3

    .line 116
    .line 117
    :cond_4
    :goto_1
    sget-object v4, Lcom/sumsub/sns/internal/core/analytics/e;->a:Lcom/sumsub/sns/internal/features/data/repository/analytics/a;

    .line 118
    .line 119
    .line 120
    invoke-virtual {p1}, Lcom/sumsub/sns/core/SNSMobileSDK$SDK;->isAnalyticsEnabled$idensic_mobile_sdk_aar_defaultRelease()Z

    .line 121
    move-result v4

    .line 122
    .line 123
    if-nez v4, :cond_5

    .line 124
    .line 125
    sput-boolean v3, Lcom/sumsub/sns/internal/core/analytics/e;->h:Z

    .line 126
    .line 127
    new-instance v6, Lcom/sumsub/sns/internal/core/analytics/g;

    .line 128
    .line 129
    .line 130
    invoke-direct {v6}, Lcom/sumsub/sns/internal/core/analytics/g;-><init>()V

    .line 131
    .line 132
    sget-object v7, Lcom/sumsub/sns/internal/core/analytics/SdkEvent;->TrackingDisabled:Lcom/sumsub/sns/internal/core/analytics/SdkEvent;

    .line 133
    .line 134
    iget-object v8, v6, Lcom/sumsub/sns/internal/core/analytics/g;->b:Ljava/util/ArrayList;

    .line 135
    .line 136
    sget-object v9, Lcom/sumsub/sns/internal/core/analytics/Domain;->Sdk:Lcom/sumsub/sns/internal/core/analytics/Domain;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 140
    .line 141
    iget-object v8, v6, Lcom/sumsub/sns/internal/core/analytics/g;->b:Ljava/util/ArrayList;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    .line 148
    move-result-object v7

    .line 149
    .line 150
    .line 151
    invoke-static {v7}, Lkotlin/collections/MapsKt;->toMap(Ljava/util/Map;)Ljava/util/Map;

    .line 152
    move-result-object v7

    .line 153
    .line 154
    iput-object v7, v6, Lcom/sumsub/sns/internal/core/analytics/g;->c:Ljava/util/Map;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v6, v3}, Lcom/sumsub/sns/internal/core/analytics/g;->a(Z)V

    .line 158
    .line 159
    :cond_5
    sput-boolean v4, Lcom/sumsub/sns/internal/core/analytics/e;->h:Z

    .line 160
    .line 161
    .line 162
    invoke-virtual {p1}, Lcom/sumsub/sns/core/SNSMobileSDK$SDK;->isDebug$idensic_mobile_sdk_aar_defaultRelease()Z

    .line 163
    move-result v3

    .line 164
    .line 165
    .line 166
    invoke-virtual {p1}, Lcom/sumsub/sns/core/SNSMobileSDK$SDK;->getLocale$idensic_mobile_sdk_aar_defaultRelease()Ljava/util/Locale;

    .line 167
    move-result-object v4

    .line 168
    .line 169
    .line 170
    invoke-virtual {p1}, Lcom/sumsub/sns/core/SNSMobileSDK$SDK;->isAnalyticsEnabled$idensic_mobile_sdk_aar_defaultRelease()Z

    .line 171
    move-result p1

    .line 172
    .line 173
    sget-object v6, Lcom/sumsub/sns/internal/core/common/k0;->i:Ljava/lang/String;

    .line 174
    .line 175
    new-instance v7, Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 179
    .line 180
    .line 181
    const-string/jumbo v8, "starting: debug="

    .line 182
    .line 183
    .line 184
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    const-string v3, " locale="

    .line 190
    .line 191
    .line 192
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    const-string v3, " analytics="

    .line 198
    .line 199
    .line 200
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    const-string p1, " sdkVersion="

    .line 206
    .line 207
    .line 208
    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 215
    move-result-object p1

    .line 216
    .line 217
    sget-object v3, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 218
    .line 219
    iget-object v3, v3, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v3, v1, p1, v13}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 223
    .line 224
    new-instance p1, Landroid/content/Intent;

    .line 225
    .line 226
    .line 227
    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    .line 228
    .line 229
    .line 230
    invoke-virtual {p0}, Lcom/sumsub/sns/core/SNSMobileSDK;->getPackageName()Ljava/lang/String;

    .line 231
    move-result-object v3

    .line 232
    .line 233
    const-string v4, "com.sumsub.sns.internal.features.presentation.main.SNSAppActivity"

    .line 234
    .line 235
    .line 236
    invoke-virtual {p1, v3, v4}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 237
    .line 238
    new-instance v3, Lcom/sumsub/sns/internal/core/common/SNSSession;

    .line 239
    .line 240
    .line 241
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 242
    move-result-object v4

    .line 243
    .line 244
    .line 245
    invoke-virtual {v4}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 246
    move-result-object v4

    .line 247
    .line 248
    .line 249
    invoke-virtual {p0}, Lcom/sumsub/sns/core/SNSMobileSDK;->getLocale()Ljava/util/Locale;

    .line 250
    move-result-object v6

    .line 251
    .line 252
    .line 253
    invoke-virtual {p0}, Lcom/sumsub/sns/core/SNSMobileSDK;->isDebug()Z

    .line 254
    move-result v7

    .line 255
    .line 256
    .line 257
    invoke-virtual {p0}, Lcom/sumsub/sns/core/SNSMobileSDK;->getPackageName()Ljava/lang/String;

    .line 258
    move-result-object v8

    .line 259
    .line 260
    .line 261
    invoke-virtual {p0}, Lcom/sumsub/sns/core/SNSMobileSDK;->getVersionName()Ljava/lang/String;

    .line 262
    move-result-object v9

    .line 263
    .line 264
    .line 265
    invoke-virtual {p0}, Lcom/sumsub/sns/core/SNSMobileSDK;->getVersionCode()I

    .line 266
    move-result v10

    .line 267
    .line 268
    sget v11, Lcom/sumsub/sns/core/SNSMobileSDK;->theme:I

    .line 269
    .line 270
    .line 271
    invoke-direct/range {v3 .. v11}, Lcom/sumsub/sns/internal/core/common/SNSSession;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Locale;ZLjava/lang/String;Ljava/lang/String;II)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 275
    move-result-object v4

    .line 276
    .line 277
    .line 278
    invoke-static {v4, v3}, Lcom/sumsub/sns/internal/core/common/P0;->a(Landroid/content/Context;Lcom/sumsub/sns/internal/core/common/SNSSession;)V

    .line 279
    .line 280
    sget-object v5, Lcom/sumsub/sns/internal/core/domain/h;->T:Lcom/sumsub/sns/internal/core/domain/h;

    .line 281
    .line 282
    if-eqz v5, :cond_7

    .line 283
    .line 284
    iget-object v6, v5, Lcom/sumsub/sns/internal/core/domain/h;->b:Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    invoke-virtual {v3}, Lcom/sumsub/sns/internal/core/common/SNSSession;->getSessionId()Ljava/lang/String;

    .line 288
    move-result-object v7

    .line 289
    .line 290
    .line 291
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 292
    move-result v6

    .line 293
    .line 294
    if-eqz v6, :cond_6

    .line 295
    goto :goto_2

    .line 296
    :cond_6
    move-object v5, v13

    .line 297
    .line 298
    :goto_2
    if-nez v5, :cond_9

    .line 299
    .line 300
    :cond_7
    new-instance v5, Lcom/sumsub/sns/internal/core/domain/h;

    .line 301
    .line 302
    .line 303
    invoke-virtual {v3}, Lcom/sumsub/sns/internal/core/common/SNSSession;->getSessionId()Ljava/lang/String;

    .line 304
    move-result-object v6

    .line 305
    .line 306
    .line 307
    invoke-virtual {v3}, Lcom/sumsub/sns/internal/core/common/SNSSession;->getUrl()Ljava/lang/String;

    .line 308
    move-result-object v3

    .line 309
    .line 310
    .line 311
    invoke-direct {v5, v4, v6, v3, v12}, Lcom/sumsub/sns/internal/core/domain/h;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 312
    .line 313
    sget-object v3, Lcom/sumsub/sns/internal/core/domain/h;->T:Lcom/sumsub/sns/internal/core/domain/h;

    .line 314
    .line 315
    if-eqz v3, :cond_8

    .line 316
    .line 317
    .line 318
    invoke-virtual {v3}, Lcom/sumsub/sns/internal/core/domain/h;->a()V

    .line 319
    .line 320
    :cond_8
    sput-object v5, Lcom/sumsub/sns/internal/core/domain/h;->T:Lcom/sumsub/sns/internal/core/domain/h;

    .line 321
    .line 322
    :cond_9
    iget-object v3, v5, Lcom/sumsub/sns/internal/core/domain/h;->o:Lkotlin/Lazy;

    .line 323
    .line 324
    .line 325
    invoke-interface {v3}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 326
    move-result-object v3

    .line 327
    .line 328
    check-cast v3, Lcom/sumsub/sns/internal/log/cacher/c;

    .line 329
    .line 330
    .line 331
    invoke-static {v2, v3}, Lcom/sumsub/sentry/Y;->a(Landroid/content/Context;Lcom/sumsub/sns/internal/log/cacher/c;)V

    .line 332
    .line 333
    sget-object v3, Lcom/sumsub/sns/core/SNSMobileSDK;->exceptionHandlerInstaller:Lcom/sumsub/sns/internal/core/exception/c;

    .line 334
    .line 335
    .line 336
    invoke-virtual {v3, v2, v5}, Lcom/sumsub/sns/internal/core/exception/c;->b(Landroid/content/Context;Lcom/sumsub/sns/internal/core/domain/h;)V

    .line 337
    .line 338
    .line 339
    invoke-virtual {v0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 340
    goto :goto_4

    .line 341
    .line 342
    :goto_3
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 343
    .line 344
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 345
    .line 346
    .line 347
    const-string/jumbo v2, "start error!!!"

    .line 348
    .line 349
    .line 350
    invoke-virtual {v0, v1, v2, p1}, Lcom/sumsub/sns/internal/log/logger/b;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 351
    .line 352
    sget-object v0, Lcom/sumsub/sns/internal/core/common/F0;->a:Ljava/util/Map;

    .line 353
    .line 354
    new-instance v0, Lcom/sumsub/sns/core/data/model/SNSException$Unknown;

    .line 355
    .line 356
    .line 357
    invoke-direct {v0, p1}, Lcom/sumsub/sns/core/data/model/SNSException$Unknown;-><init>(Ljava/lang/Throwable;)V

    .line 358
    .line 359
    .line 360
    invoke-static {v0}, Lcom/sumsub/sns/internal/core/common/F0;->a(Lcom/sumsub/sns/core/data/model/SNSException;)V

    .line 361
    .line 362
    :goto_4
    sget-object v1, Lcom/sumsub/sns/internal/log/cacher/e;->a:Lkotlinx/coroutines/m0;

    .line 363
    .line 364
    new-instance v4, Lcom/sumsub/sns/internal/log/cacher/d;

    .line 365
    .line 366
    .line 367
    invoke-direct {v4, v13}, Lcom/sumsub/sns/internal/log/cacher/d;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 368
    const/4 v5, 0x3

    .line 369
    const/4 v6, 0x0

    .line 370
    const/4 v2, 0x0

    .line 371
    const/4 v3, 0x0

    .line 372
    .line 373
    .line 374
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 375
    return-void
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
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
.end method

.method private static final toString$lambda$20(Lcom/sumsub/sns/core/SNSModule;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/sumsub/sns/core/SNSModule;->getName()Ljava/lang/String;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
    .line 25
.end method


# virtual methods
.method public getAutoCloseOnApproveTimeout()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/SNSMobileSDK;->$$delegate_0:Lcom/sumsub/sns/internal/core/common/k0;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/common/k0;->getAutoCloseOnApproveTimeout()Ljava/lang/Integer;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
.end method

.method public final getCompleteHandler()Lcom/sumsub/sns/core/data/listener/SNSCompleteHandler;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/core/SNSMobileSDK;->_sdk:Lcom/sumsub/sns/core/SNSMobileSDK$SDK;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/sumsub/sns/core/SNSMobileSDK$SDK;->getCompleteHandler$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/data/listener/SNSCompleteHandler;

    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public getConf()Lcom/sumsub/sns/core/data/model/SNSInitConfig;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/SNSMobileSDK;->$$delegate_0:Lcom/sumsub/sns/internal/core/common/k0;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/common/k0;->getConf()Lcom/sumsub/sns/core/data/model/SNSInitConfig;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
.end method

.method public getCustomization()Lcom/sumsub/sns/core/theme/SNSJsonCustomization;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/SNSMobileSDK;->$$delegate_0:Lcom/sumsub/sns/internal/core/common/k0;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/common/k0;->getCustomization()Lcom/sumsub/sns/core/theme/SNSJsonCustomization;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
.end method

.method public final getCustomizationSource$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/theme/SNSJsonCustomizationSource;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/core/SNSMobileSDK;->customizationSource:Lcom/sumsub/sns/core/theme/SNSJsonCustomizationSource;

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
    .line 17
.end method

.method public getErrorHandler()Lcom/sumsub/sns/core/data/listener/SNSErrorHandler;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/SNSMobileSDK;->$$delegate_0:Lcom/sumsub/sns/internal/core/common/k0;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/common/k0;->getErrorHandler()Lcom/sumsub/sns/core/data/listener/SNSErrorHandler;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
.end method

.method public getEventHandler()Lcom/sumsub/sns/core/data/listener/SNSEventHandler;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/SNSMobileSDK;->$$delegate_0:Lcom/sumsub/sns/internal/core/common/k0;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/common/k0;->getEventHandler()Lcom/sumsub/sns/core/data/listener/SNSEventHandler;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
.end method

.method public final getForcedDayNightMode()Lcom/sumsub/sns/core/data/model/DayNightMode;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/core/SNSMobileSDK;->_sdk:Lcom/sumsub/sns/core/SNSMobileSDK$SDK;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/sumsub/sns/core/SNSMobileSDK$SDK;->getForcedDayNightMode$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/data/model/DayNightMode;

    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public getIconHandler()Lcom/sumsub/sns/core/data/listener/SNSIconHandler;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/SNSMobileSDK;->$$delegate_0:Lcom/sumsub/sns/internal/core/common/k0;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/common/k0;->getIconHandler()Lcom/sumsub/sns/core/data/listener/SNSIconHandler;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
.end method

.method public getInstructionsViewHandler()Lcom/sumsub/sns/core/data/listener/SNSInstructionsViewHandler;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/SNSMobileSDK;->$$delegate_0:Lcom/sumsub/sns/internal/core/common/k0;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/common/k0;->getInstructionsViewHandler()Lcom/sumsub/sns/core/data/listener/SNSInstructionsViewHandler;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
.end method

.method public getLocale()Ljava/util/Locale;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/SNSMobileSDK;->$$delegate_0:Lcom/sumsub/sns/internal/core/common/k0;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    sget-object v0, Lcom/sumsub/sns/internal/core/common/k0;->e:Ljava/util/Locale;

    .line 8
    return-object v0
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public final getLogTree()Lcom/sumsub/log/logger/Logger;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/core/SNSMobileSDK;->logTree:Lcom/sumsub/log/logger/Logger;

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
    .line 17
.end method

.method public getPackageName()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/SNSMobileSDK;->$$delegate_0:Lcom/sumsub/sns/internal/core/common/k0;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    sget-object v0, Lcom/sumsub/sns/internal/core/common/k0;->d:Ljava/lang/String;

    .line 8
    return-object v0
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public getPluggedModule(Ljava/lang/String;)Lcom/sumsub/sns/core/SNSModule;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/SNSMobileSDK;->$$delegate_0:Lcom/sumsub/sns/internal/core/common/k0;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/sumsub/sns/internal/core/common/k0;->getPluggedModule(Ljava/lang/String;)Lcom/sumsub/sns/core/SNSModule;

    .line 6
    move-result-object p1

    .line 7
    return-object p1
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
    .line 25
.end method

.method public getPreferredDocumentsDefinitions()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/sumsub/sns/core/data/model/SNSDocumentDefinition;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/SNSMobileSDK;->$$delegate_0:Lcom/sumsub/sns/internal/core/common/k0;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/common/k0;->getPreferredDocumentsDefinitions()Ljava/util/Map;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
.end method

.method public getSettings()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/SNSMobileSDK;->$$delegate_0:Lcom/sumsub/sns/internal/core/common/k0;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/common/k0;->getSettings()Ljava/util/Map;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
.end method

.method public getState()Lcom/sumsub/sns/core/data/model/SNSSDKState;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/SNSMobileSDK;->$$delegate_0:Lcom/sumsub/sns/internal/core/common/k0;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    sget-object v0, Lcom/sumsub/sns/internal/core/common/k0;->g:Lcom/sumsub/sns/core/data/model/SNSSDKState;

    .line 8
    return-object v0
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public getStateChangedHandler()Lcom/sumsub/sns/core/data/listener/SNSStateChangedHandler;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/SNSMobileSDK;->$$delegate_0:Lcom/sumsub/sns/internal/core/common/k0;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/common/k0;->getStateChangedHandler()Lcom/sumsub/sns/core/data/listener/SNSStateChangedHandler;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
.end method

.method public getSupportItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sumsub/sns/core/data/model/SNSSupportItem;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/SNSMobileSDK;->$$delegate_0:Lcom/sumsub/sns/internal/core/common/k0;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/common/k0;->getSupportItems()Ljava/util/List;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
.end method

.method public final getTheme()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/sumsub/sns/core/SNSMobileSDK;->theme:I

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
    .line 17
.end method

.method public getTokenExpirationHandler()Lcom/sumsub/sns/core/data/listener/TokenExpirationHandler;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/SNSMobileSDK;->$$delegate_0:Lcom/sumsub/sns/internal/core/common/k0;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/common/k0;->getTokenExpirationHandler()Lcom/sumsub/sns/core/data/listener/TokenExpirationHandler;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
.end method

.method public getUrlHandler()Lcom/sumsub/sns/core/data/listener/SNSUrlHandler;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/SNSMobileSDK;->$$delegate_0:Lcom/sumsub/sns/internal/core/common/k0;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/common/k0;->getUrlHandler()Lcom/sumsub/sns/core/data/listener/SNSUrlHandler;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
.end method

.method public getVersion()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/SNSMobileSDK;->$$delegate_0:Lcom/sumsub/sns/internal/core/common/k0;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    sget-object v0, Lcom/sumsub/sns/internal/core/common/k0;->i:Ljava/lang/String;

    .line 8
    return-object v0
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public getVersionCode()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/SNSMobileSDK;->$$delegate_0:Lcom/sumsub/sns/internal/core/common/k0;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    sget v0, Lcom/sumsub/sns/internal/core/common/k0;->c:I

    .line 8
    return v0
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public getVersionName()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/SNSMobileSDK;->$$delegate_0:Lcom/sumsub/sns/internal/core/common/k0;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    sget-object v0, Lcom/sumsub/sns/internal/core/common/k0;->b:Ljava/lang/String;

    .line 8
    return-object v0
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public final getXmlThemeUsed$idensic_mobile_sdk_aar_defaultRelease()Z
    .locals 1

    .line 1
    .line 2
    sget-boolean v0, Lcom/sumsub/sns/core/SNSMobileSDK;->xmlThemeUsed:Z

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
    .line 17
.end method

.method public isDebug()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/SNSMobileSDK;->$$delegate_0:Lcom/sumsub/sns/internal/core/common/k0;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    sget-boolean v0, Lcom/sumsub/sns/internal/core/common/k0;->f:Z

    .line 8
    return v0
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public isModuleAvailable(Ljava/lang/String;)Z
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/SNSMobileSDK;->$$delegate_0:Lcom/sumsub/sns/internal/core/common/k0;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/sumsub/sns/internal/core/common/k0;->isModuleAvailable(Ljava/lang/String;)Z

    .line 6
    move-result p1

    .line 7
    return p1
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
    .line 25
.end method

.method public final restore$idensic_mobile_sdk_aar_defaultRelease(Landroid/content/Context;)V
    .locals 6
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-static {p1, v0}, Lcom/sumsub/sns/internal/core/common/P0;->a(Landroid/content/Context;Lcom/sumsub/sns/internal/core/common/SNSSession;)V

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lcom/sumsub/sns/internal/core/common/P0;->a()Lcom/sumsub/sns/internal/core/common/SNSSession;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 12
    move-result-object v2

    .line 13
    .line 14
    .line 15
    invoke-static {v2, v1}, Lcom/sumsub/sns/internal/core/common/P0;->a(Landroid/content/Context;Lcom/sumsub/sns/internal/core/common/SNSSession;)V

    .line 16
    .line 17
    sget-object v3, Lcom/sumsub/sns/internal/core/domain/h;->T:Lcom/sumsub/sns/internal/core/domain/h;

    .line 18
    .line 19
    if-eqz v3, :cond_1

    .line 20
    .line 21
    iget-object v4, v3, Lcom/sumsub/sns/internal/core/domain/h;->b:Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/core/common/SNSSession;->getSessionId()Ljava/lang/String;

    .line 25
    move-result-object v5

    .line 26
    .line 27
    .line 28
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    move-result v4

    .line 30
    .line 31
    if-eqz v4, :cond_0

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move-object v3, v0

    .line 34
    .line 35
    :goto_0
    if-nez v3, :cond_3

    .line 36
    .line 37
    :cond_1
    new-instance v3, Lcom/sumsub/sns/internal/core/domain/h;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/core/common/SNSSession;->getSessionId()Ljava/lang/String;

    .line 41
    move-result-object v4

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/core/common/SNSSession;->getUrl()Ljava/lang/String;

    .line 45
    move-result-object v1

    .line 46
    .line 47
    .line 48
    invoke-direct {v3, v2, v4, v1, v0}, Lcom/sumsub/sns/internal/core/domain/h;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    sget-object v0, Lcom/sumsub/sns/internal/core/domain/h;->T:Lcom/sumsub/sns/internal/core/domain/h;

    .line 51
    .line 52
    if-eqz v0, :cond_2

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/domain/h;->a()V

    .line 56
    .line 57
    :cond_2
    sput-object v3, Lcom/sumsub/sns/internal/core/domain/h;->T:Lcom/sumsub/sns/internal/core/domain/h;

    .line 58
    .line 59
    :cond_3
    iget-object v0, v3, Lcom/sumsub/sns/internal/core/domain/h;->o:Lkotlin/Lazy;

    .line 60
    .line 61
    .line 62
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 63
    move-result-object v0

    .line 64
    .line 65
    check-cast v0, Lcom/sumsub/sns/internal/log/cacher/c;

    .line 66
    .line 67
    .line 68
    invoke-static {p1, v0}, Lcom/sumsub/sentry/Y;->a(Landroid/content/Context;Lcom/sumsub/sns/internal/log/cacher/c;)V

    .line 69
    .line 70
    sget-object v0, Lcom/sumsub/sns/core/SNSMobileSDK;->exceptionHandlerInstaller:Lcom/sumsub/sns/internal/core/exception/c;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, p1, v3}, Lcom/sumsub/sns/internal/core/exception/c;->b(Landroid/content/Context;Lcom/sumsub/sns/internal/core/domain/h;)V

    .line 74
    .line 75
    sget-object p1, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    .line 76
    .line 77
    sget-object p1, Lcom/sumsub/sns/core/SNSMobileSDK;->_sdk:Lcom/sumsub/sns/core/SNSMobileSDK$SDK;

    .line 78
    const/4 v0, 0x1

    .line 79
    .line 80
    if-nez p1, :cond_4

    .line 81
    move p1, v0

    .line 82
    goto :goto_1

    .line 83
    :cond_4
    const/4 p1, 0x0

    .line 84
    .line 85
    :goto_1
    sput-boolean p1, Lcom/sumsub/sns/internal/core/common/k0;->h:Z

    .line 86
    .line 87
    sget-object p1, Lcom/sumsub/sns/core/SNSMobileSDK;->_sdk:Lcom/sumsub/sns/core/SNSMobileSDK$SDK;

    .line 88
    .line 89
    if-nez p1, :cond_5

    .line 90
    .line 91
    sget-boolean p1, Lcom/sumsub/sns/core/SNSMobileSDK;->isCallbacksLostReported:Z

    .line 92
    .line 93
    if-nez p1, :cond_5

    .line 94
    .line 95
    sput-boolean v0, Lcom/sumsub/sns/core/SNSMobileSDK;->isCallbacksLostReported:Z

    .line 96
    .line 97
    new-instance p1, Lcom/sumsub/sns/internal/core/exception/SNSCallbacksLostOnRestoreException;

    .line 98
    .line 99
    sget-boolean v0, Lcom/sumsub/sns/core/SNSMobileSDK;->isStartedInProcess:Z

    .line 100
    .line 101
    .line 102
    invoke-direct {p1, v0}, Lcom/sumsub/sns/internal/core/exception/SNSCallbacksLostOnRestoreException;-><init>(Z)V

    .line 103
    .line 104
    .line 105
    invoke-static {p1}, Lcom/sumsub/sentry/Y;->a(Lcom/sumsub/sns/internal/core/exception/SNSCallbacksLostOnRestoreException;)V

    .line 106
    :cond_5
    return-void
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
.end method

.method public final setCustomizationSource$idensic_mobile_sdk_aar_defaultRelease(Lcom/sumsub/sns/core/theme/SNSJsonCustomizationSource;)V
    .locals 0
    .param p1    # Lcom/sumsub/sns/core/theme/SNSJsonCustomizationSource;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    sput-object p1, Lcom/sumsub/sns/core/SNSMobileSDK;->customizationSource:Lcom/sumsub/sns/core/theme/SNSJsonCustomizationSource;

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
    .line 25
.end method

.method public setSupportItems(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sumsub/sns/core/data/model/SNSSupportItem;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/SNSMobileSDK;->$$delegate_0:Lcom/sumsub/sns/internal/core/common/k0;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    sget-object v0, Lcom/sumsub/sns/internal/core/common/k0;->u:Lkotlin/jvm/functions/Function1;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    :cond_0
    return-void
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
.end method

.method public final setXmlThemeUsed$idensic_mobile_sdk_aar_defaultRelease(Z)V
    .locals 0

    .line 1
    .line 2
    sput-boolean p1, Lcom/sumsub/sns/core/SNSMobileSDK;->xmlThemeUsed:Z

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
    .line 25
.end method

.method public final shutdown()V
    .locals 7

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 3
    .line 4
    iget-object v1, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 5
    .line 6
    const-string v2, "SDK"

    .line 7
    .line 8
    .line 9
    const-string/jumbo v3, "shutdown"

    .line 10
    const/4 v4, 0x0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, v2, v3, v4}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 14
    .line 15
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->b:Lcom/sumsub/sns/internal/log/logger/a;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/log/logger/a;->a()V

    .line 19
    .line 20
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->b:Lcom/sumsub/sns/internal/log/b;

    .line 21
    const/4 v1, 0x0

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    .line 25
    move-result v2

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    goto :goto_0

    .line 29
    .line 30
    .line 31
    :cond_0
    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 32
    move-result-object v2

    .line 33
    .line 34
    const-wide/16 v5, 0x2710

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v2, v5, v6}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 38
    .line 39
    :goto_0
    sput-object v4, Lcom/sumsub/sns/internal/core/analytics/e;->g:Lkotlin/jvm/functions/Function1;

    .line 40
    .line 41
    sget-object v0, Lcom/sumsub/sns/internal/core/analytics/e;->f:Lkotlinx/coroutines/x1;

    .line 42
    const/4 v2, 0x1

    .line 43
    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    .line 47
    invoke-static {v0, v4, v2, v4}, Lkotlinx/coroutines/x1$a;->a(Lkotlinx/coroutines/x1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 48
    .line 49
    :cond_1
    sput-object v4, Lcom/sumsub/sns/internal/core/analytics/e;->f:Lkotlinx/coroutines/x1;

    .line 50
    .line 51
    sget-object v0, Lcom/sumsub/sns/internal/log/cacher/e;->a:Lkotlinx/coroutines/m0;

    .line 52
    .line 53
    .line 54
    invoke-static {v0, v4, v2, v4}, Lkotlinx/coroutines/n0;->e(Lkotlinx/coroutines/m0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 55
    .line 56
    sget-object v0, Lcom/sumsub/sns/core/SNSMobileSDK;->exceptionHandlerInstaller:Lcom/sumsub/sns/internal/core/exception/c;

    .line 57
    .line 58
    iget-object v2, v0, Lcom/sumsub/sns/internal/core/exception/c;->a:Ljava/lang/Object;

    .line 59
    monitor-enter v2

    .line 60
    .line 61
    :try_start_0
    iget-object v3, v0, Lcom/sumsub/sns/internal/core/exception/c;->c:Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 62
    .line 63
    .line 64
    invoke-static {v3}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    .line 65
    .line 66
    iput-object v4, v0, Lcom/sumsub/sns/internal/core/exception/c;->c:Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 67
    .line 68
    iput-boolean v1, v0, Lcom/sumsub/sns/internal/core/exception/c;->b:Z

    .line 69
    .line 70
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    monitor-exit v2

    .line 72
    .line 73
    sput-object v4, Lcom/sumsub/sns/core/SNSMobileSDK;->_sdk:Lcom/sumsub/sns/core/SNSMobileSDK$SDK;

    .line 74
    return-void

    .line 75
    :catchall_0
    move-exception v0

    .line 76
    monitor-exit v2

    .line 77
    throw v0
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
.end method

.method public toString()Ljava/lang/String;
    .locals 12
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/core/SNSMobileSDK;->_sdk:Lcom/sumsub/sns/core/SNSMobileSDK$SDK;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/sumsub/sns/core/SNSMobileSDK$SDK;->getUrl$idensic_mobile_sdk_aar_defaultRelease()Ljava/lang/String;

    .line 9
    move-result-object v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object v0, v1

    .line 12
    .line 13
    :goto_0
    sget-object v2, Lcom/sumsub/sns/core/SNSMobileSDK;->_sdk:Lcom/sumsub/sns/core/SNSMobileSDK$SDK;

    .line 14
    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2}, Lcom/sumsub/sns/core/SNSMobileSDK$SDK;->getAccessToken$idensic_mobile_sdk_aar_defaultRelease()Ljava/lang/String;

    .line 19
    move-result-object v2

    .line 20
    .line 21
    if-eqz v2, :cond_1

    .line 22
    const/4 v1, 0x3

    .line 23
    .line 24
    .line 25
    invoke-static {v1, v2}, Lcom/sumsub/sns/internal/core/common/R0;->a(ILjava/lang/String;)Ljava/lang/String;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    .line 29
    :cond_1
    invoke-direct {p0}, Lcom/sumsub/sns/core/SNSMobileSDK;->getModules()Ljava/util/List;

    .line 30
    move-result-object v2

    .line 31
    .line 32
    .line 33
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 34
    move-result v2

    .line 35
    .line 36
    if-eqz v2, :cond_2

    .line 37
    .line 38
    const-string v2, "Empty"

    .line 39
    goto :goto_1

    .line 40
    .line 41
    .line 42
    :cond_2
    invoke-direct {p0}, Lcom/sumsub/sns/core/SNSMobileSDK;->getModules()Ljava/util/List;

    .line 43
    move-result-object v3

    .line 44
    .line 45
    new-instance v9, Lcom/sumsub/sns/core/a;

    .line 46
    .line 47
    .line 48
    invoke-direct {v9}, Lcom/sumsub/sns/core/a;-><init>()V

    .line 49
    .line 50
    const/16 v10, 0x1f

    .line 51
    const/4 v11, 0x0

    .line 52
    const/4 v4, 0x0

    .line 53
    const/4 v5, 0x0

    .line 54
    const/4 v6, 0x0

    .line 55
    const/4 v7, 0x0

    .line 56
    const/4 v8, 0x0

    .line 57
    .line 58
    .line 59
    invoke-static/range {v3 .. v11}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    .line 60
    move-result-object v2

    .line 61
    .line 62
    new-instance v3, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 66
    .line 67
    const-string v4, "["

    .line 68
    .line 69
    .line 70
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    const-string v2, "]"

    .line 76
    .line 77
    .line 78
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    move-result-object v2

    .line 83
    .line 84
    .line 85
    :goto_1
    invoke-virtual {p0}, Lcom/sumsub/sns/core/SNSMobileSDK;->isDebug()Z

    .line 86
    move-result v3

    .line 87
    .line 88
    new-instance v4, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 92
    .line 93
    const-string v5, "SNSMobileSDK: Api Url: "

    .line 94
    .line 95
    .line 96
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    const-string v0, ", Access Token: "

    .line 102
    .line 103
    .line 104
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    const-string v0, ",Modules: "

    .line 110
    .line 111
    .line 112
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    const-string v0, ", isDebug: "

    .line 118
    .line 119
    .line 120
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    move-result-object v0

    .line 128
    return-object v0
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
.end method
