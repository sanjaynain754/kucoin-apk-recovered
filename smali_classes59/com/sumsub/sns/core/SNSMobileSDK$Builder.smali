.class public final Lcom/sumsub/sns/core/SNSMobileSDK$Builder;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sumsub/sns/core/SNSMobileSDK;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00d6\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007B\u0011\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0008J!\u0010\u000c\u001a\u00020\u00002\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00002\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00002\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u0019J\u0015\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0015\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 \u00a2\u0006\u0004\u0008\"\u0010#J#\u0010\'\u001a\u00020\u00002\u0014\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020%\u0018\u00010$\u00a2\u0006\u0004\u0008\'\u0010(J\u0015\u0010+\u001a\u00020\u00002\u0006\u0010*\u001a\u00020)\u00a2\u0006\u0004\u0008+\u0010,J\r\u0010.\u001a\u00020-\u00a2\u0006\u0004\u0008.\u0010/R\u001a\u00101\u001a\u0002008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u00081\u00102\u001a\u0004\u00083\u00104R \u00106\u001a\u0008\u0012\u0004\u0012\u00020\u0002058\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u00086\u00107\u001a\u0004\u00088\u00109R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010:\u001a\u00020\u00048\u0000@BX\u0080\u000e\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010;\u001a\u0004\u0008<\u0010=R(\u0010\t\u001a\u0004\u0018\u00010\u00042\u0008\u0010:\u001a\u0004\u0018\u00010\u00048\u0000@BX\u0080\u000e\u00a2\u0006\u000c\n\u0004\u0008\t\u0010;\u001a\u0004\u0008>\u0010=R(\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0008\u0010:\u001a\u0004\u0018\u00010\n8\u0000@BX\u0080\u000e\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010?\u001a\u0004\u0008@\u0010AR(\u0010C\u001a\u0004\u0018\u00010B2\u0008\u0010:\u001a\u0004\u0018\u00010B8\u0000@BX\u0080\u000e\u00a2\u0006\u000c\n\u0004\u0008C\u0010D\u001a\u0004\u0008E\u0010FR(\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0008\u0010:\u001a\u0004\u0018\u00010\u000e8\u0000@BX\u0080\u000e\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010G\u001a\u0004\u0008H\u0010IR(\u0010K\u001a\u0004\u0018\u00010J2\u0008\u0010:\u001a\u0004\u0018\u00010J8\u0000@BX\u0080\u000e\u00a2\u0006\u000c\n\u0004\u0008K\u0010L\u001a\u0004\u0008M\u0010NR(\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0008\u0010:\u001a\u0004\u0018\u00010\u00128\u0000@BX\u0080\u000e\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010O\u001a\u0004\u0008P\u0010QR$\u0010S\u001a\u0004\u0018\u00010R8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008S\u0010T\u001a\u0004\u0008U\u0010V\"\u0004\u0008W\u0010XR(\u0010Z\u001a\u0004\u0018\u00010Y2\u0008\u0010:\u001a\u0004\u0018\u00010Y8\u0000@BX\u0080\u000e\u00a2\u0006\u000c\n\u0004\u0008Z\u0010[\u001a\u0004\u0008\\\u0010]R$\u0010\u001a\u001a\u00020\u00162\u0006\u0010:\u001a\u00020\u00168\u0000@BX\u0080\u000e\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010^\u001a\u0004\u0008_\u0010`R$\u0010b\u001a\u0004\u0018\u00010a8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008b\u0010c\u001a\u0004\u0008d\u0010e\"\u0004\u0008f\u0010gR0\u0010j\u001a\u0008\u0012\u0004\u0012\u00020i0h2\u000c\u0010:\u001a\u0008\u0012\u0004\u0012\u00020i0h8\u0000@BX\u0080\u000e\u00a2\u0006\u000c\n\u0004\u0008j\u0010k\u001a\u0004\u0008l\u0010mR4\u0010o\u001a\n\u0012\u0004\u0012\u00020n\u0018\u00010h2\u000e\u0010:\u001a\n\u0012\u0004\u0012\u00020n\u0018\u00010h8\u0000@BX\u0080\u000e\u00a2\u0006\u000c\n\u0004\u0008o\u0010k\u001a\u0004\u0008p\u0010mR$\u0010q\u001a\u00020\u00162\u0006\u0010:\u001a\u00020\u00168\u0000@BX\u0080\u000e\u00a2\u0006\u000c\n\u0004\u0008q\u0010^\u001a\u0004\u0008r\u0010`R$\u0010t\u001a\u00020s2\u0006\u0010:\u001a\u00020s8\u0000@BX\u0080\u000e\u00a2\u0006\u000c\n\u0004\u0008t\u0010u\u001a\u0004\u0008v\u0010wR$\u0010\u001d\u001a\u00020\u001c2\u0006\u0010:\u001a\u00020\u001c8\u0000@BX\u0080\u000e\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010x\u001a\u0004\u0008y\u0010zR(\u0010!\u001a\u0004\u0018\u00010)2\u0008\u0010:\u001a\u0004\u0018\u00010)8\u0000@BX\u0080\u000e\u00a2\u0006\u000c\n\u0004\u0008!\u0010{\u001a\u0004\u0008|\u0010}R)\u0010\u007f\u001a\u0004\u0018\u00010~8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0017\n\u0005\u0008\u007f\u0010\u0080\u0001\u001a\u0006\u0008\u0081\u0001\u0010\u0082\u0001\"\u0006\u0008\u0083\u0001\u0010\u0084\u0001R,\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0085\u00018\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0018\n\u0006\u0008\u0086\u0001\u0010\u0087\u0001\u001a\u0006\u0008\u0088\u0001\u0010\u0089\u0001\"\u0006\u0008\u008a\u0001\u0010\u008b\u0001R7\u0010\u008c\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010$8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0018\n\u0006\u0008\u008c\u0001\u0010\u008d\u0001\u001a\u0006\u0008\u008e\u0001\u0010\u008f\u0001\"\u0006\u0008\u0090\u0001\u0010\u0091\u0001R7\u0010\u0092\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020%\u0018\u00010$8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0018\n\u0006\u0008\u0092\u0001\u0010\u008d\u0001\u001a\u0006\u0008\u0093\u0001\u0010\u008f\u0001\"\u0006\u0008\u0094\u0001\u0010\u0091\u0001R)\u0010\u0095\u0001\u001a\u0004\u0018\u00010)8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0016\n\u0005\u0008\u0095\u0001\u0010{\u001a\u0005\u0008\u0096\u0001\u0010}\"\u0006\u0008\u0097\u0001\u0010\u0098\u0001R,\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u0099\u00018\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0018\n\u0006\u0008\u009a\u0001\u0010\u009b\u0001\u001a\u0006\u0008\u009c\u0001\u0010\u009d\u0001\"\u0006\u0008\u009e\u0001\u0010\u009f\u0001R,\u0010\u00a1\u0001\u001a\u0005\u0018\u00010\u00a0\u00018\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0018\n\u0006\u0008\u00a1\u0001\u0010\u00a2\u0001\u001a\u0006\u0008\u00a3\u0001\u0010\u00a4\u0001\"\u0006\u0008\u00a5\u0001\u0010\u00a6\u0001\u00a8\u0006\u00a7\u0001"
    }
    d2 = {
        "Lcom/sumsub/sns/core/SNSMobileSDK$Builder;",
        "",
        "Landroid/app/Activity;",
        "activity",
        "",
        "url",
        "<init>",
        "(Landroid/app/Activity;Ljava/lang/String;)V",
        "(Landroid/app/Activity;)V",
        "accessToken",
        "Lcom/sumsub/sns/core/data/listener/TokenExpirationHandler;",
        "onTokenExpiration",
        "withAccessToken",
        "(Ljava/lang/String;Lcom/sumsub/sns/core/data/listener/TokenExpirationHandler;)Lcom/sumsub/sns/core/SNSMobileSDK$Builder;",
        "Lcom/sumsub/sns/core/data/listener/SNSCompleteHandler;",
        "completeHandler",
        "withCompleteHandler",
        "(Lcom/sumsub/sns/core/data/listener/SNSCompleteHandler;)Lcom/sumsub/sns/core/SNSMobileSDK$Builder;",
        "Lcom/sumsub/sns/core/data/listener/SNSEventHandler;",
        "eventHandler",
        "withEventHandler",
        "(Lcom/sumsub/sns/core/data/listener/SNSEventHandler;)Lcom/sumsub/sns/core/SNSMobileSDK$Builder;",
        "",
        "debug",
        "withDebug",
        "(Z)Lcom/sumsub/sns/core/SNSMobileSDK$Builder;",
        "isAnalyticsEnabled",
        "withAnalyticsEnabled",
        "Ljava/util/Locale;",
        "locale",
        "withLocale",
        "(Ljava/util/Locale;)Lcom/sumsub/sns/core/SNSMobileSDK$Builder;",
        "Lcom/sumsub/sns/core/theme/SNSTheme;",
        "theme",
        "withTheme",
        "(Lcom/sumsub/sns/core/theme/SNSTheme;)Lcom/sumsub/sns/core/SNSMobileSDK$Builder;",
        "",
        "Lcom/sumsub/sns/core/data/model/SNSDocumentDefinition;",
        "definitions",
        "withPreferredDocumentDefinitions",
        "(Ljava/util/Map;)Lcom/sumsub/sns/core/SNSMobileSDK$Builder;",
        "",
        "timeInSecs",
        "withAutoCloseOnApprove",
        "(I)Lcom/sumsub/sns/core/SNSMobileSDK$Builder;",
        "Lcom/sumsub/sns/core/SNSMobileSDK$SDK;",
        "build",
        "()Lcom/sumsub/sns/core/SNSMobileSDK$SDK;",
        "Landroid/content/Context;",
        "applicationContext",
        "Landroid/content/Context;",
        "getApplicationContext$idensic_mobile_sdk_aar_defaultRelease",
        "()Landroid/content/Context;",
        "Ljava/lang/ref/WeakReference;",
        "weakActivity",
        "Ljava/lang/ref/WeakReference;",
        "getWeakActivity$idensic_mobile_sdk_aar_defaultRelease",
        "()Ljava/lang/ref/WeakReference;",
        "value",
        "Ljava/lang/String;",
        "getUrl$idensic_mobile_sdk_aar_defaultRelease",
        "()Ljava/lang/String;",
        "getAccessToken$idensic_mobile_sdk_aar_defaultRelease",
        "Lcom/sumsub/sns/core/data/listener/TokenExpirationHandler;",
        "getOnTokenExpiration$idensic_mobile_sdk_aar_defaultRelease",
        "()Lcom/sumsub/sns/core/data/listener/TokenExpirationHandler;",
        "Lcom/sumsub/sns/core/data/listener/SNSStateChangedHandler;",
        "stateChangedHandler",
        "Lcom/sumsub/sns/core/data/listener/SNSStateChangedHandler;",
        "getStateChangedHandler$idensic_mobile_sdk_aar_defaultRelease",
        "()Lcom/sumsub/sns/core/data/listener/SNSStateChangedHandler;",
        "Lcom/sumsub/sns/core/data/listener/SNSCompleteHandler;",
        "getCompleteHandler$idensic_mobile_sdk_aar_defaultRelease",
        "()Lcom/sumsub/sns/core/data/listener/SNSCompleteHandler;",
        "Lcom/sumsub/sns/core/data/listener/SNSErrorHandler;",
        "errorHandler",
        "Lcom/sumsub/sns/core/data/listener/SNSErrorHandler;",
        "getErrorHandler$idensic_mobile_sdk_aar_defaultRelease",
        "()Lcom/sumsub/sns/core/data/listener/SNSErrorHandler;",
        "Lcom/sumsub/sns/core/data/listener/SNSEventHandler;",
        "getEventHandler$idensic_mobile_sdk_aar_defaultRelease",
        "()Lcom/sumsub/sns/core/data/listener/SNSEventHandler;",
        "Lcom/sumsub/sns/core/data/listener/SNSInstructionsViewHandler;",
        "instructionsHandler",
        "Lcom/sumsub/sns/core/data/listener/SNSInstructionsViewHandler;",
        "getInstructionsHandler$idensic_mobile_sdk_aar_defaultRelease",
        "()Lcom/sumsub/sns/core/data/listener/SNSInstructionsViewHandler;",
        "setInstructionsHandler$idensic_mobile_sdk_aar_defaultRelease",
        "(Lcom/sumsub/sns/core/data/listener/SNSInstructionsViewHandler;)V",
        "Lcom/sumsub/sns/core/data/model/SNSInitConfig;",
        "conf",
        "Lcom/sumsub/sns/core/data/model/SNSInitConfig;",
        "getConf$idensic_mobile_sdk_aar_defaultRelease",
        "()Lcom/sumsub/sns/core/data/model/SNSInitConfig;",
        "Z",
        "isAnalyticsEnabled$idensic_mobile_sdk_aar_defaultRelease",
        "()Z",
        "Lcom/sumsub/sns/core/data/listener/SNSIconHandler;",
        "iconHandler",
        "Lcom/sumsub/sns/core/data/listener/SNSIconHandler;",
        "getIconHandler$idensic_mobile_sdk_aar_defaultRelease",
        "()Lcom/sumsub/sns/core/data/listener/SNSIconHandler;",
        "setIconHandler$idensic_mobile_sdk_aar_defaultRelease",
        "(Lcom/sumsub/sns/core/data/listener/SNSIconHandler;)V",
        "",
        "Lcom/sumsub/sns/core/SNSModule;",
        "modules",
        "Ljava/util/List;",
        "getModules$idensic_mobile_sdk_aar_defaultRelease",
        "()Ljava/util/List;",
        "Lcom/sumsub/sns/core/data/model/SNSSupportItem;",
        "supportItems",
        "getSupportItems$idensic_mobile_sdk_aar_defaultRelease",
        "isDebug",
        "isDebug$idensic_mobile_sdk_aar_defaultRelease",
        "Lcom/sumsub/log/logger/Logger;",
        "logTree",
        "Lcom/sumsub/log/logger/Logger;",
        "getLogTree$idensic_mobile_sdk_aar_defaultRelease",
        "()Lcom/sumsub/log/logger/Logger;",
        "Ljava/util/Locale;",
        "getLocale$idensic_mobile_sdk_aar_defaultRelease",
        "()Ljava/util/Locale;",
        "Ljava/lang/Integer;",
        "getTheme$idensic_mobile_sdk_aar_defaultRelease",
        "()Ljava/lang/Integer;",
        "Lcom/sumsub/sns/core/theme/SNSJsonCustomization;",
        "customization",
        "Lcom/sumsub/sns/core/theme/SNSJsonCustomization;",
        "getCustomization$idensic_mobile_sdk_aar_defaultRelease",
        "()Lcom/sumsub/sns/core/theme/SNSJsonCustomization;",
        "setCustomization$idensic_mobile_sdk_aar_defaultRelease",
        "(Lcom/sumsub/sns/core/theme/SNSJsonCustomization;)V",
        "Lcom/sumsub/sns/core/theme/SNSJsonCustomizationSource;",
        "customizationSource",
        "Lcom/sumsub/sns/core/theme/SNSJsonCustomizationSource;",
        "getCustomizationSource$idensic_mobile_sdk_aar_defaultRelease",
        "()Lcom/sumsub/sns/core/theme/SNSJsonCustomizationSource;",
        "setCustomizationSource$idensic_mobile_sdk_aar_defaultRelease",
        "(Lcom/sumsub/sns/core/theme/SNSJsonCustomizationSource;)V",
        "settings",
        "Ljava/util/Map;",
        "getSettings$idensic_mobile_sdk_aar_defaultRelease",
        "()Ljava/util/Map;",
        "setSettings$idensic_mobile_sdk_aar_defaultRelease",
        "(Ljava/util/Map;)V",
        "preferredDocumentsDefinitions",
        "getPreferredDocumentsDefinitions$idensic_mobile_sdk_aar_defaultRelease",
        "setPreferredDocumentsDefinitions$idensic_mobile_sdk_aar_defaultRelease",
        "autoCloseOnApproveTimeout",
        "getAutoCloseOnApproveTimeout$idensic_mobile_sdk_aar_defaultRelease",
        "setAutoCloseOnApproveTimeout$idensic_mobile_sdk_aar_defaultRelease",
        "(Ljava/lang/Integer;)V",
        "Lcom/sumsub/sns/core/data/model/DayNightMode;",
        "forcedDayNightMode",
        "Lcom/sumsub/sns/core/data/model/DayNightMode;",
        "getForcedDayNightMode$idensic_mobile_sdk_aar_defaultRelease",
        "()Lcom/sumsub/sns/core/data/model/DayNightMode;",
        "setForcedDayNightMode$idensic_mobile_sdk_aar_defaultRelease",
        "(Lcom/sumsub/sns/core/data/model/DayNightMode;)V",
        "Lcom/sumsub/sns/core/data/listener/SNSUrlHandler;",
        "urlHandler",
        "Lcom/sumsub/sns/core/data/listener/SNSUrlHandler;",
        "getUrlHandler$idensic_mobile_sdk_aar_defaultRelease",
        "()Lcom/sumsub/sns/core/data/listener/SNSUrlHandler;",
        "setUrlHandler$idensic_mobile_sdk_aar_defaultRelease",
        "(Lcom/sumsub/sns/core/data/listener/SNSUrlHandler;)V",
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
        "SMAP\nSNSMobileSDK.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSMobileSDK.kt\ncom/sumsub/sns/core/SNSMobileSDK$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,663:1\n1#2:664\n*E\n"
    }
.end annotation


# instance fields
.field private accessToken:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final applicationContext:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private autoCloseOnApproveTimeout:Ljava/lang/Integer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private completeHandler:Lcom/sumsub/sns/core/data/listener/SNSCompleteHandler;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private conf:Lcom/sumsub/sns/core/data/model/SNSInitConfig;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private customization:Lcom/sumsub/sns/core/theme/SNSJsonCustomization;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private customizationSource:Lcom/sumsub/sns/core/theme/SNSJsonCustomizationSource;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private errorHandler:Lcom/sumsub/sns/core/data/listener/SNSErrorHandler;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private eventHandler:Lcom/sumsub/sns/core/data/listener/SNSEventHandler;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private forcedDayNightMode:Lcom/sumsub/sns/core/data/model/DayNightMode;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private iconHandler:Lcom/sumsub/sns/core/data/listener/SNSIconHandler;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private instructionsHandler:Lcom/sumsub/sns/core/data/listener/SNSInstructionsViewHandler;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private isAnalyticsEnabled:Z

.field private isDebug:Z

.field private locale:Ljava/util/Locale;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private logTree:Lcom/sumsub/log/logger/Logger;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private modules:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lcom/sumsub/sns/core/SNSModule;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private onTokenExpiration:Lcom/sumsub/sns/core/data/listener/TokenExpirationHandler;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private preferredDocumentsDefinitions:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/sumsub/sns/core/data/model/SNSDocumentDefinition;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private settings:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private stateChangedHandler:Lcom/sumsub/sns/core/data/listener/SNSStateChangedHandler;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private supportItems:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sumsub/sns/core/data/model/SNSSupportItem;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private theme:Ljava/lang/Integer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private url:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private urlHandler:Lcom/sumsub/sns/core/data/listener/SNSUrlHandler;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final weakActivity:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 1
    .param p1    # Landroid/app/Activity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 11
    invoke-direct {p0, p1, v0}, Lcom/sumsub/sns/core/SNSMobileSDK$Builder;-><init>(Landroid/app/Activity;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 1
    .param p1    # Landroid/app/Activity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-object v0, Lcom/sumsub/sns/core/SNSMobileSDK;->INSTANCE:Lcom/sumsub/sns/core/SNSMobileSDK;

    invoke-virtual {v0}, Lcom/sumsub/sns/core/SNSMobileSDK;->isDebug()Z

    .line 3
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/sumsub/sns/core/SNSMobileSDK$Builder;->applicationContext:Landroid/content/Context;

    .line 4
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/sumsub/sns/core/SNSMobileSDK$Builder;->weakActivity:Ljava/lang/ref/WeakReference;

    if-nez p2, :cond_0

    .line 5
    const-string p2, "https://api.sumsub.com/"

    :cond_0
    iput-object p2, p0, Lcom/sumsub/sns/core/SNSMobileSDK$Builder;->url:Ljava/lang/String;

    const/4 p1, 0x1

    .line 6
    iput-boolean p1, p0, Lcom/sumsub/sns/core/SNSMobileSDK$Builder;->isAnalyticsEnabled:Z

    .line 7
    new-instance p1, Lcom/sumsub/sns/core/data/listener/SNSDefaultIconHandler;

    invoke-direct {p1}, Lcom/sumsub/sns/core/data/listener/SNSDefaultIconHandler;-><init>()V

    iput-object p1, p0, Lcom/sumsub/sns/core/SNSMobileSDK$Builder;->iconHandler:Lcom/sumsub/sns/core/data/listener/SNSIconHandler;

    .line 8
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/sumsub/sns/core/SNSMobileSDK$Builder;->modules:Ljava/util/List;

    .line 9
    sget-object p1, Lcom/sumsub/sns/internal/log/logger/j;->a:Lcom/sumsub/sns/internal/log/logger/j;

    iput-object p1, p0, Lcom/sumsub/sns/core/SNSMobileSDK$Builder;->logTree:Lcom/sumsub/log/logger/Logger;

    .line 10
    invoke-static {}, Lcom/sumsub/sns/internal/core/common/h;->a()Ljava/util/Locale;

    move-result-object p1

    iput-object p1, p0, Lcom/sumsub/sns/core/SNSMobileSDK$Builder;->locale:Ljava/util/Locale;

    return-void
.end method


# virtual methods
.method public final build()Lcom/sumsub/sns/core/SNSMobileSDK$SDK;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/core/SNSMobileSDK$SNSSDK;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lcom/sumsub/sns/core/SNSMobileSDK$SNSSDK;-><init>(Lcom/sumsub/sns/core/SNSMobileSDK$Builder;)V

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

.method public final getAccessToken$idensic_mobile_sdk_aar_defaultRelease()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/SNSMobileSDK$Builder;->accessToken:Ljava/lang/String;

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

.method public final getApplicationContext$idensic_mobile_sdk_aar_defaultRelease()Landroid/content/Context;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/SNSMobileSDK$Builder;->applicationContext:Landroid/content/Context;

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

.method public final getAutoCloseOnApproveTimeout$idensic_mobile_sdk_aar_defaultRelease()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/SNSMobileSDK$Builder;->autoCloseOnApproveTimeout:Ljava/lang/Integer;

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

.method public final getCompleteHandler$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/data/listener/SNSCompleteHandler;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/SNSMobileSDK$Builder;->completeHandler:Lcom/sumsub/sns/core/data/listener/SNSCompleteHandler;

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

.method public final getConf$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/data/model/SNSInitConfig;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/SNSMobileSDK$Builder;->conf:Lcom/sumsub/sns/core/data/model/SNSInitConfig;

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

.method public final getCustomization$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/theme/SNSJsonCustomization;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/SNSMobileSDK$Builder;->customization:Lcom/sumsub/sns/core/theme/SNSJsonCustomization;

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

.method public final getCustomizationSource$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/theme/SNSJsonCustomizationSource;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/SNSMobileSDK$Builder;->customizationSource:Lcom/sumsub/sns/core/theme/SNSJsonCustomizationSource;

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

.method public final getErrorHandler$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/data/listener/SNSErrorHandler;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/SNSMobileSDK$Builder;->errorHandler:Lcom/sumsub/sns/core/data/listener/SNSErrorHandler;

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

.method public final getEventHandler$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/data/listener/SNSEventHandler;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/SNSMobileSDK$Builder;->eventHandler:Lcom/sumsub/sns/core/data/listener/SNSEventHandler;

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

.method public final getForcedDayNightMode$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/data/model/DayNightMode;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/SNSMobileSDK$Builder;->forcedDayNightMode:Lcom/sumsub/sns/core/data/model/DayNightMode;

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

.method public final getIconHandler$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/data/listener/SNSIconHandler;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/SNSMobileSDK$Builder;->iconHandler:Lcom/sumsub/sns/core/data/listener/SNSIconHandler;

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

.method public final getInstructionsHandler$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/data/listener/SNSInstructionsViewHandler;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/SNSMobileSDK$Builder;->instructionsHandler:Lcom/sumsub/sns/core/data/listener/SNSInstructionsViewHandler;

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

.method public final getLocale$idensic_mobile_sdk_aar_defaultRelease()Ljava/util/Locale;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/SNSMobileSDK$Builder;->locale:Ljava/util/Locale;

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

.method public final getLogTree$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/log/logger/Logger;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/SNSMobileSDK$Builder;->logTree:Lcom/sumsub/log/logger/Logger;

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

.method public final getModules$idensic_mobile_sdk_aar_defaultRelease()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sumsub/sns/core/SNSModule;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/SNSMobileSDK$Builder;->modules:Ljava/util/List;

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

.method public final getOnTokenExpiration$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/data/listener/TokenExpirationHandler;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/SNSMobileSDK$Builder;->onTokenExpiration:Lcom/sumsub/sns/core/data/listener/TokenExpirationHandler;

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

.method public final getPreferredDocumentsDefinitions$idensic_mobile_sdk_aar_defaultRelease()Ljava/util/Map;
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
    iget-object v0, p0, Lcom/sumsub/sns/core/SNSMobileSDK$Builder;->preferredDocumentsDefinitions:Ljava/util/Map;

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

.method public final getSettings$idensic_mobile_sdk_aar_defaultRelease()Ljava/util/Map;
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
    iget-object v0, p0, Lcom/sumsub/sns/core/SNSMobileSDK$Builder;->settings:Ljava/util/Map;

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

.method public final getStateChangedHandler$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/data/listener/SNSStateChangedHandler;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/SNSMobileSDK$Builder;->stateChangedHandler:Lcom/sumsub/sns/core/data/listener/SNSStateChangedHandler;

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

.method public final getSupportItems$idensic_mobile_sdk_aar_defaultRelease()Ljava/util/List;
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
    iget-object v0, p0, Lcom/sumsub/sns/core/SNSMobileSDK$Builder;->supportItems:Ljava/util/List;

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

.method public final getTheme$idensic_mobile_sdk_aar_defaultRelease()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/SNSMobileSDK$Builder;->theme:Ljava/lang/Integer;

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

.method public final getUrl$idensic_mobile_sdk_aar_defaultRelease()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/SNSMobileSDK$Builder;->url:Ljava/lang/String;

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

.method public final getUrlHandler$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/data/listener/SNSUrlHandler;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/SNSMobileSDK$Builder;->urlHandler:Lcom/sumsub/sns/core/data/listener/SNSUrlHandler;

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

.method public final getWeakActivity$idensic_mobile_sdk_aar_defaultRelease()Ljava/lang/ref/WeakReference;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/SNSMobileSDK$Builder;->weakActivity:Ljava/lang/ref/WeakReference;

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

.method public final isAnalyticsEnabled$idensic_mobile_sdk_aar_defaultRelease()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/sumsub/sns/core/SNSMobileSDK$Builder;->isAnalyticsEnabled:Z

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

.method public final isDebug$idensic_mobile_sdk_aar_defaultRelease()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/sumsub/sns/core/SNSMobileSDK$Builder;->isDebug:Z

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

.method public final withAccessToken(Ljava/lang/String;Lcom/sumsub/sns/core/data/listener/TokenExpirationHandler;)Lcom/sumsub/sns/core/SNSMobileSDK$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/sumsub/sns/core/data/listener/TokenExpirationHandler;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/core/SNSMobileSDK$Builder;->accessToken:Ljava/lang/String;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/sumsub/sns/core/SNSMobileSDK$Builder;->onTokenExpiration:Lcom/sumsub/sns/core/data/listener/TokenExpirationHandler;

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

.method public final withAnalyticsEnabled(Z)Lcom/sumsub/sns/core/SNSMobileSDK$Builder;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/sumsub/sns/core/SNSMobileSDK$Builder;->isAnalyticsEnabled:Z

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
    .line 25
.end method

.method public final withAutoCloseOnApprove(I)Lcom/sumsub/sns/core/SNSMobileSDK$Builder;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    iput-object p1, p0, Lcom/sumsub/sns/core/SNSMobileSDK$Builder;->autoCloseOnApproveTimeout:Ljava/lang/Integer;

    .line 7
    return-object p0
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

.method public final withCompleteHandler(Lcom/sumsub/sns/core/data/listener/SNSCompleteHandler;)Lcom/sumsub/sns/core/SNSMobileSDK$Builder;
    .locals 0
    .param p1    # Lcom/sumsub/sns/core/data/listener/SNSCompleteHandler;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/core/SNSMobileSDK$Builder;->completeHandler:Lcom/sumsub/sns/core/data/listener/SNSCompleteHandler;

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
    .line 25
.end method

.method public final withDebug(Z)Lcom/sumsub/sns/core/SNSMobileSDK$Builder;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/sumsub/sns/core/SNSMobileSDK$Builder;->isDebug:Z

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
    .line 25
.end method

.method public final withEventHandler(Lcom/sumsub/sns/core/data/listener/SNSEventHandler;)Lcom/sumsub/sns/core/SNSMobileSDK$Builder;
    .locals 0
    .param p1    # Lcom/sumsub/sns/core/data/listener/SNSEventHandler;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/core/SNSMobileSDK$Builder;->eventHandler:Lcom/sumsub/sns/core/data/listener/SNSEventHandler;

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
    .line 25
.end method

.method public final withLocale(Ljava/util/Locale;)Lcom/sumsub/sns/core/SNSMobileSDK$Builder;
    .locals 0
    .param p1    # Ljava/util/Locale;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/core/SNSMobileSDK$Builder;->locale:Ljava/util/Locale;

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
    .line 25
.end method

.method public final withPreferredDocumentDefinitions(Ljava/util/Map;)Lcom/sumsub/sns/core/SNSMobileSDK$Builder;
    .locals 0
    .param p1    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/sumsub/sns/core/data/model/SNSDocumentDefinition;",
            ">;)",
            "Lcom/sumsub/sns/core/SNSMobileSDK$Builder;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/core/SNSMobileSDK$Builder;->preferredDocumentsDefinitions:Ljava/util/Map;

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
    .line 25
.end method

.method public final withTheme(Lcom/sumsub/sns/core/theme/SNSTheme;)Lcom/sumsub/sns/core/SNSMobileSDK$Builder;
    .locals 1
    .param p1    # Lcom/sumsub/sns/core/theme/SNSTheme;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/core/theme/SNSJsonCustomization;->Companion:Lcom/sumsub/sns/core/theme/SNSJsonCustomization$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/sumsub/sns/core/theme/SNSJsonCustomization$Companion;->create()Lcom/sumsub/sns/core/theme/SNSJsonCustomization;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-interface {v0, p1}, Lcom/sumsub/sns/core/theme/SNSJsonCustomization;->loadTheme(Lcom/sumsub/sns/core/theme/SNSTheme;)V

    .line 10
    .line 11
    iput-object v0, p0, Lcom/sumsub/sns/core/SNSMobileSDK$Builder;->customization:Lcom/sumsub/sns/core/theme/SNSJsonCustomization;

    .line 12
    .line 13
    sget-object p1, Lcom/sumsub/sns/core/theme/SNSJsonCustomizationSource;->DSL:Lcom/sumsub/sns/core/theme/SNSJsonCustomizationSource;

    .line 14
    .line 15
    iput-object p1, p0, Lcom/sumsub/sns/core/SNSMobileSDK$Builder;->customizationSource:Lcom/sumsub/sns/core/theme/SNSJsonCustomizationSource;

    .line 16
    return-object p0
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
