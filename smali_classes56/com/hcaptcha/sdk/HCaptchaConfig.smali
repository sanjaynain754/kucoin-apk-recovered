.class public Lcom/hcaptcha/sdk/HCaptchaConfig;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/hcaptcha/sdk/HCaptchaConfig$a;
    }
.end annotation


# instance fields
.field private apiEndpoint:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/l;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private assethost:Ljava/lang/String;

.field private customTheme:Ljava/lang/String;

.field private diagnosticLog:Ljava/lang/Boolean;

.field private disableHardwareAcceleration:Ljava/lang/Boolean;
    .annotation build Llombok/NonNull;
    .end annotation
.end field

.field private endpoint:Ljava/lang/String;

.field private hideDialog:Ljava/lang/Boolean;

.field private host:Ljava/lang/String;

.field private imghost:Ljava/lang/String;

.field private jsSrc:Ljava/lang/String;

.field private loading:Ljava/lang/Boolean;

.field private locale:Ljava/lang/String;

.field private orientation:Lcom/hcaptcha/sdk/HCaptchaOrientation;

.field private reportapi:Ljava/lang/String;

.field private resetOnTimeout:Ljava/lang/Boolean;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private retryPredicate:Lcom/hcaptcha/sdk/IHCaptchaRetryPredicate;
    .annotation runtime Lcom/fasterxml/jackson/annotation/l;
    .end annotation
.end field

.field private rqdata:Ljava/lang/String;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private sentry:Ljava/lang/Boolean;

.field private siteKey:Ljava/lang/String;
    .annotation build Llombok/NonNull;
    .end annotation
.end field

.field private size:Lcom/hcaptcha/sdk/HCaptchaSize;

.field private theme:Lcom/hcaptcha/sdk/HCaptchaTheme;

.field private tokenExpiration:J


# direct methods
.method private static $default$apiEndpoint()Ljava/lang/String;
    .locals 1
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "generated code"
    .end annotation

    .annotation build Llombok/Generated;
    .end annotation

    .line 1
    .line 2
    const-string v0, "https://js.hcaptcha.com/1/api.js"

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

.method private static $default$customTheme()Ljava/lang/String;
    .locals 1
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "generated code"
    .end annotation

    .annotation build Llombok/Generated;
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
    .line 3
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

.method private static $default$diagnosticLog()Ljava/lang/Boolean;
    .locals 1
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "generated code"
    .end annotation

    .annotation build Llombok/Generated;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

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

.method private static $default$disableHardwareAcceleration()Ljava/lang/Boolean;
    .locals 1
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "generated code"
    .end annotation

    .annotation build Llombok/Generated;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

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

.method private static $default$hideDialog()Ljava/lang/Boolean;
    .locals 1
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "generated code"
    .end annotation

    .annotation build Llombok/Generated;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

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

.method private static $default$host()Ljava/lang/String;
    .locals 1
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "generated code"
    .end annotation

    .annotation build Llombok/Generated;
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
    .line 3
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

.method private static $default$jsSrc()Ljava/lang/String;
    .locals 1
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "generated code"
    .end annotation

    .annotation build Llombok/Generated;
    .end annotation

    .line 1
    .line 2
    const-string v0, "https://js.hcaptcha.com/1/api.js"

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

.method private static $default$loading()Ljava/lang/Boolean;
    .locals 1
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "generated code"
    .end annotation

    .annotation build Llombok/Generated;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

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

.method private static $default$locale()Ljava/lang/String;
    .locals 1
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "generated code"
    .end annotation

    .annotation build Llombok/Generated;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    .line 8
    move-result-object v0

    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method private static $default$orientation()Lcom/hcaptcha/sdk/HCaptchaOrientation;
    .locals 1
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "generated code"
    .end annotation

    .annotation build Llombok/Generated;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/hcaptcha/sdk/HCaptchaOrientation;->PORTRAIT:Lcom/hcaptcha/sdk/HCaptchaOrientation;

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

.method private static $default$resetOnTimeout()Ljava/lang/Boolean;
    .locals 1
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "generated code"
    .end annotation

    .annotation build Llombok/Generated;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

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

.method private static $default$retryPredicate()Lcom/hcaptcha/sdk/IHCaptchaRetryPredicate;
    .locals 1
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "generated code"
    .end annotation

    .annotation build Llombok/Generated;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/hcaptcha/sdk/c;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/hcaptcha/sdk/c;-><init>()V

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
.end method

.method private static $default$sentry()Ljava/lang/Boolean;
    .locals 1
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "generated code"
    .end annotation

    .annotation build Llombok/Generated;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

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

.method private static $default$size()Lcom/hcaptcha/sdk/HCaptchaSize;
    .locals 1
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "generated code"
    .end annotation

    .annotation build Llombok/Generated;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/hcaptcha/sdk/HCaptchaSize;->INVISIBLE:Lcom/hcaptcha/sdk/HCaptchaSize;

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

.method private static $default$theme()Lcom/hcaptcha/sdk/HCaptchaTheme;
    .locals 1
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "generated code"
    .end annotation

    .annotation build Llombok/Generated;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/hcaptcha/sdk/HCaptchaTheme;->LIGHT:Lcom/hcaptcha/sdk/HCaptchaTheme;

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

.method private static $default$tokenExpiration()J
    .locals 2
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "generated code"
    .end annotation

    .annotation build Llombok/Generated;
    .end annotation

    .line 1
    .line 2
    const-wide/16 v0, 0x78

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

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/hcaptcha/sdk/HCaptchaSize;Lcom/hcaptcha/sdk/HCaptchaOrientation;Lcom/hcaptcha/sdk/HCaptchaTheme;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/hcaptcha/sdk/IHCaptchaRetryPredicate;JLjava/lang/Boolean;Ljava/lang/Boolean;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Llombok/NonNull;
        .end annotation
    .end param
    .param p23    # Ljava/lang/Boolean;
        .annotation build Llombok/NonNull;
        .end annotation
    .end param
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "generated code"
    .end annotation

    .annotation build Llombok/Generated;
    .end annotation

    move-object/from16 v0, p23

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_1

    if-eqz v0, :cond_0

    iput-object p1, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->siteKey:Ljava/lang/String;

    iput-object p2, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->sentry:Ljava/lang/Boolean;

    iput-object p3, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->loading:Ljava/lang/Boolean;

    iput-object p4, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->hideDialog:Ljava/lang/Boolean;

    iput-object p5, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->rqdata:Ljava/lang/String;

    iput-object p6, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->apiEndpoint:Ljava/lang/String;

    iput-object p7, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->jsSrc:Ljava/lang/String;

    iput-object p8, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->endpoint:Ljava/lang/String;

    iput-object p9, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->reportapi:Ljava/lang/String;

    iput-object p10, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->assethost:Ljava/lang/String;

    iput-object p11, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->imghost:Ljava/lang/String;

    iput-object p12, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->locale:Ljava/lang/String;

    iput-object p13, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->size:Lcom/hcaptcha/sdk/HCaptchaSize;

    iput-object p14, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->orientation:Lcom/hcaptcha/sdk/HCaptchaOrientation;

    move-object/from16 p1, p15

    iput-object p1, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->theme:Lcom/hcaptcha/sdk/HCaptchaTheme;

    move-object/from16 p1, p16

    iput-object p1, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->host:Ljava/lang/String;

    move-object/from16 p1, p17

    iput-object p1, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->customTheme:Ljava/lang/String;

    move-object/from16 p1, p18

    iput-object p1, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->resetOnTimeout:Ljava/lang/Boolean;

    move-object/from16 p1, p19

    iput-object p1, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->retryPredicate:Lcom/hcaptcha/sdk/IHCaptchaRetryPredicate;

    move-wide/from16 p1, p20

    iput-wide p1, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->tokenExpiration:J

    move-object/from16 p1, p22

    iput-object p1, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->diagnosticLog:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->disableHardwareAcceleration:Ljava/lang/Boolean;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "disableHardwareAcceleration is marked non-null but is null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "siteKey is marked non-null but is null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic a(Lcom/hcaptcha/sdk/HCaptchaConfig;Lcom/hcaptcha/sdk/HCaptchaException;)Z
    .locals 1

    .line 1
    .line 2
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 3
    .line 4
    iget-object p0, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->resetOnTimeout:Ljava/lang/Boolean;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p0}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 8
    move-result p0

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/hcaptcha/sdk/HCaptchaException;->getHCaptchaError()Lcom/hcaptcha/sdk/HCaptchaError;

    .line 14
    move-result-object p0

    .line 15
    .line 16
    sget-object p1, Lcom/hcaptcha/sdk/HCaptchaError;->SESSION_TIMEOUT:Lcom/hcaptcha/sdk/HCaptchaError;

    .line 17
    .line 18
    if-ne p0, p1, :cond_0

    .line 19
    const/4 p0, 0x1

    .line 20
    return p0

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    return p0
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

.method public static synthetic access$000()Ljava/lang/Boolean;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/hcaptcha/sdk/HCaptchaConfig;->$default$sentry()Ljava/lang/Boolean;

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
.end method

.method public static synthetic access$100()Ljava/lang/Boolean;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/hcaptcha/sdk/HCaptchaConfig;->$default$loading()Ljava/lang/Boolean;

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
.end method

.method public static synthetic access$1000()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/hcaptcha/sdk/HCaptchaConfig;->$default$customTheme()Ljava/lang/String;

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
.end method

.method public static synthetic access$1100()Ljava/lang/Boolean;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/hcaptcha/sdk/HCaptchaConfig;->$default$resetOnTimeout()Ljava/lang/Boolean;

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
.end method

.method public static synthetic access$1200()Lcom/hcaptcha/sdk/IHCaptchaRetryPredicate;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/hcaptcha/sdk/HCaptchaConfig;->$default$retryPredicate()Lcom/hcaptcha/sdk/IHCaptchaRetryPredicate;

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
.end method

.method public static synthetic access$1300()J
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/hcaptcha/sdk/HCaptchaConfig;->$default$tokenExpiration()J

    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
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

.method public static synthetic access$1400()Ljava/lang/Boolean;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/hcaptcha/sdk/HCaptchaConfig;->$default$diagnosticLog()Ljava/lang/Boolean;

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
.end method

.method public static synthetic access$1500()Ljava/lang/Boolean;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/hcaptcha/sdk/HCaptchaConfig;->$default$disableHardwareAcceleration()Ljava/lang/Boolean;

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
.end method

.method public static synthetic access$200()Ljava/lang/Boolean;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/hcaptcha/sdk/HCaptchaConfig;->$default$hideDialog()Ljava/lang/Boolean;

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
.end method

.method public static synthetic access$300()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/hcaptcha/sdk/HCaptchaConfig;->$default$apiEndpoint()Ljava/lang/String;

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
.end method

.method public static synthetic access$400()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/hcaptcha/sdk/HCaptchaConfig;->$default$jsSrc()Ljava/lang/String;

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
.end method

.method public static synthetic access$500()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/hcaptcha/sdk/HCaptchaConfig;->$default$locale()Ljava/lang/String;

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
.end method

.method public static synthetic access$600()Lcom/hcaptcha/sdk/HCaptchaSize;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/hcaptcha/sdk/HCaptchaConfig;->$default$size()Lcom/hcaptcha/sdk/HCaptchaSize;

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
.end method

.method public static synthetic access$700()Lcom/hcaptcha/sdk/HCaptchaOrientation;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/hcaptcha/sdk/HCaptchaConfig;->$default$orientation()Lcom/hcaptcha/sdk/HCaptchaOrientation;

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
.end method

.method public static synthetic access$800()Lcom/hcaptcha/sdk/HCaptchaTheme;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/hcaptcha/sdk/HCaptchaConfig;->$default$theme()Lcom/hcaptcha/sdk/HCaptchaTheme;

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
.end method

.method public static synthetic access$900()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/hcaptcha/sdk/HCaptchaConfig;->$default$host()Ljava/lang/String;

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
.end method

.method public static builder()Lcom/hcaptcha/sdk/HCaptchaConfig$a;
    .locals 1
    .annotation build Ledu/umd/cs/findbugs/annotations/NonNull;
    .end annotation

    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "generated code"
    .end annotation

    .annotation build Llombok/Generated;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/hcaptcha/sdk/HCaptchaConfig$a;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/hcaptcha/sdk/HCaptchaConfig$a;-><init>()V

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
.end method


# virtual methods
.method public canEqual(Ljava/lang/Object;)Z
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Ledu/umd/cs/findbugs/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "generated code"
    .end annotation

    .annotation build Llombok/Generated;
    .end annotation

    .line 1
    .line 2
    instance-of p1, p1, Lcom/hcaptcha/sdk/HCaptchaConfig;

    .line 3
    return p1
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

.method public equals(Ljava/lang/Object;)Z
    .locals 7
    .param p1    # Ljava/lang/Object;
        .annotation build Ledu/umd/cs/findbugs/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "generated code"
    .end annotation

    .annotation build Llombok/Generated;
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    if-ne p1, p0, :cond_0

    .line 4
    return v0

    .line 5
    .line 6
    :cond_0
    instance-of v1, p1, Lcom/hcaptcha/sdk/HCaptchaConfig;

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
    check-cast p1, Lcom/hcaptcha/sdk/HCaptchaConfig;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, p0}, Lcom/hcaptcha/sdk/HCaptchaConfig;->canEqual(Ljava/lang/Object;)Z

    .line 16
    move-result v1

    .line 17
    .line 18
    if-nez v1, :cond_2

    .line 19
    return v2

    .line 20
    .line 21
    .line 22
    :cond_2
    invoke-virtual {p0}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getTokenExpiration()J

    .line 23
    move-result-wide v3

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getTokenExpiration()J

    .line 27
    move-result-wide v5

    .line 28
    .line 29
    cmp-long v1, v3, v5

    .line 30
    .line 31
    if-eqz v1, :cond_3

    .line 32
    return v2

    .line 33
    .line 34
    .line 35
    :cond_3
    invoke-virtual {p0}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getSentry()Ljava/lang/Boolean;

    .line 36
    move-result-object v1

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getSentry()Ljava/lang/Boolean;

    .line 40
    move-result-object v3

    .line 41
    .line 42
    if-nez v1, :cond_4

    .line 43
    .line 44
    if-eqz v3, :cond_5

    .line 45
    goto :goto_0

    .line 46
    .line 47
    .line 48
    :cond_4
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 49
    move-result v1

    .line 50
    .line 51
    if-nez v1, :cond_5

    .line 52
    :goto_0
    return v2

    .line 53
    .line 54
    .line 55
    :cond_5
    invoke-virtual {p0}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getLoading()Ljava/lang/Boolean;

    .line 56
    move-result-object v1

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getLoading()Ljava/lang/Boolean;

    .line 60
    move-result-object v3

    .line 61
    .line 62
    if-nez v1, :cond_6

    .line 63
    .line 64
    if-eqz v3, :cond_7

    .line 65
    goto :goto_1

    .line 66
    .line 67
    .line 68
    :cond_6
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 69
    move-result v1

    .line 70
    .line 71
    if-nez v1, :cond_7

    .line 72
    :goto_1
    return v2

    .line 73
    .line 74
    .line 75
    :cond_7
    invoke-virtual {p0}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getHideDialog()Ljava/lang/Boolean;

    .line 76
    move-result-object v1

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getHideDialog()Ljava/lang/Boolean;

    .line 80
    move-result-object v3

    .line 81
    .line 82
    if-nez v1, :cond_8

    .line 83
    .line 84
    if-eqz v3, :cond_9

    .line 85
    goto :goto_2

    .line 86
    .line 87
    .line 88
    :cond_8
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 89
    move-result v1

    .line 90
    .line 91
    if-nez v1, :cond_9

    .line 92
    :goto_2
    return v2

    .line 93
    .line 94
    .line 95
    :cond_9
    invoke-virtual {p0}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getResetOnTimeout()Ljava/lang/Boolean;

    .line 96
    move-result-object v1

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getResetOnTimeout()Ljava/lang/Boolean;

    .line 100
    move-result-object v3

    .line 101
    .line 102
    if-nez v1, :cond_a

    .line 103
    .line 104
    if-eqz v3, :cond_b

    .line 105
    goto :goto_3

    .line 106
    .line 107
    .line 108
    :cond_a
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 109
    move-result v1

    .line 110
    .line 111
    if-nez v1, :cond_b

    .line 112
    :goto_3
    return v2

    .line 113
    .line 114
    .line 115
    :cond_b
    invoke-virtual {p0}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getDiagnosticLog()Ljava/lang/Boolean;

    .line 116
    move-result-object v1

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getDiagnosticLog()Ljava/lang/Boolean;

    .line 120
    move-result-object v3

    .line 121
    .line 122
    if-nez v1, :cond_c

    .line 123
    .line 124
    if-eqz v3, :cond_d

    .line 125
    goto :goto_4

    .line 126
    .line 127
    .line 128
    :cond_c
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 129
    move-result v1

    .line 130
    .line 131
    if-nez v1, :cond_d

    .line 132
    :goto_4
    return v2

    .line 133
    .line 134
    .line 135
    :cond_d
    invoke-virtual {p0}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getDisableHardwareAcceleration()Ljava/lang/Boolean;

    .line 136
    move-result-object v1

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getDisableHardwareAcceleration()Ljava/lang/Boolean;

    .line 140
    move-result-object v3

    .line 141
    .line 142
    if-nez v1, :cond_e

    .line 143
    .line 144
    if-eqz v3, :cond_f

    .line 145
    goto :goto_5

    .line 146
    .line 147
    .line 148
    :cond_e
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 149
    move-result v1

    .line 150
    .line 151
    if-nez v1, :cond_f

    .line 152
    :goto_5
    return v2

    .line 153
    .line 154
    .line 155
    :cond_f
    invoke-virtual {p0}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getSiteKey()Ljava/lang/String;

    .line 156
    move-result-object v1

    .line 157
    .line 158
    .line 159
    invoke-virtual {p1}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getSiteKey()Ljava/lang/String;

    .line 160
    move-result-object v3

    .line 161
    .line 162
    if-nez v1, :cond_10

    .line 163
    .line 164
    if-eqz v3, :cond_11

    .line 165
    goto :goto_6

    .line 166
    .line 167
    .line 168
    :cond_10
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 169
    move-result v1

    .line 170
    .line 171
    if-nez v1, :cond_11

    .line 172
    :goto_6
    return v2

    .line 173
    .line 174
    .line 175
    :cond_11
    invoke-virtual {p0}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getRqdata()Ljava/lang/String;

    .line 176
    move-result-object v1

    .line 177
    .line 178
    .line 179
    invoke-virtual {p1}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getRqdata()Ljava/lang/String;

    .line 180
    move-result-object v3

    .line 181
    .line 182
    if-nez v1, :cond_12

    .line 183
    .line 184
    if-eqz v3, :cond_13

    .line 185
    goto :goto_7

    .line 186
    .line 187
    .line 188
    :cond_12
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 189
    move-result v1

    .line 190
    .line 191
    if-nez v1, :cond_13

    .line 192
    :goto_7
    return v2

    .line 193
    .line 194
    .line 195
    :cond_13
    invoke-virtual {p0}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getApiEndpoint()Ljava/lang/String;

    .line 196
    move-result-object v1

    .line 197
    .line 198
    .line 199
    invoke-virtual {p1}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getApiEndpoint()Ljava/lang/String;

    .line 200
    move-result-object v3

    .line 201
    .line 202
    if-nez v1, :cond_14

    .line 203
    .line 204
    if-eqz v3, :cond_15

    .line 205
    goto :goto_8

    .line 206
    .line 207
    .line 208
    :cond_14
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 209
    move-result v1

    .line 210
    .line 211
    if-nez v1, :cond_15

    .line 212
    :goto_8
    return v2

    .line 213
    .line 214
    .line 215
    :cond_15
    invoke-virtual {p0}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getJsSrc()Ljava/lang/String;

    .line 216
    move-result-object v1

    .line 217
    .line 218
    .line 219
    invoke-virtual {p1}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getJsSrc()Ljava/lang/String;

    .line 220
    move-result-object v3

    .line 221
    .line 222
    if-nez v1, :cond_16

    .line 223
    .line 224
    if-eqz v3, :cond_17

    .line 225
    goto :goto_9

    .line 226
    .line 227
    .line 228
    :cond_16
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 229
    move-result v1

    .line 230
    .line 231
    if-nez v1, :cond_17

    .line 232
    :goto_9
    return v2

    .line 233
    .line 234
    .line 235
    :cond_17
    invoke-virtual {p0}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getEndpoint()Ljava/lang/String;

    .line 236
    move-result-object v1

    .line 237
    .line 238
    .line 239
    invoke-virtual {p1}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getEndpoint()Ljava/lang/String;

    .line 240
    move-result-object v3

    .line 241
    .line 242
    if-nez v1, :cond_18

    .line 243
    .line 244
    if-eqz v3, :cond_19

    .line 245
    goto :goto_a

    .line 246
    .line 247
    .line 248
    :cond_18
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 249
    move-result v1

    .line 250
    .line 251
    if-nez v1, :cond_19

    .line 252
    :goto_a
    return v2

    .line 253
    .line 254
    .line 255
    :cond_19
    invoke-virtual {p0}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getReportapi()Ljava/lang/String;

    .line 256
    move-result-object v1

    .line 257
    .line 258
    .line 259
    invoke-virtual {p1}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getReportapi()Ljava/lang/String;

    .line 260
    move-result-object v3

    .line 261
    .line 262
    if-nez v1, :cond_1a

    .line 263
    .line 264
    if-eqz v3, :cond_1b

    .line 265
    goto :goto_b

    .line 266
    .line 267
    .line 268
    :cond_1a
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 269
    move-result v1

    .line 270
    .line 271
    if-nez v1, :cond_1b

    .line 272
    :goto_b
    return v2

    .line 273
    .line 274
    .line 275
    :cond_1b
    invoke-virtual {p0}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getAssethost()Ljava/lang/String;

    .line 276
    move-result-object v1

    .line 277
    .line 278
    .line 279
    invoke-virtual {p1}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getAssethost()Ljava/lang/String;

    .line 280
    move-result-object v3

    .line 281
    .line 282
    if-nez v1, :cond_1c

    .line 283
    .line 284
    if-eqz v3, :cond_1d

    .line 285
    goto :goto_c

    .line 286
    .line 287
    .line 288
    :cond_1c
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 289
    move-result v1

    .line 290
    .line 291
    if-nez v1, :cond_1d

    .line 292
    :goto_c
    return v2

    .line 293
    .line 294
    .line 295
    :cond_1d
    invoke-virtual {p0}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getImghost()Ljava/lang/String;

    .line 296
    move-result-object v1

    .line 297
    .line 298
    .line 299
    invoke-virtual {p1}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getImghost()Ljava/lang/String;

    .line 300
    move-result-object v3

    .line 301
    .line 302
    if-nez v1, :cond_1e

    .line 303
    .line 304
    if-eqz v3, :cond_1f

    .line 305
    goto :goto_d

    .line 306
    .line 307
    .line 308
    :cond_1e
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 309
    move-result v1

    .line 310
    .line 311
    if-nez v1, :cond_1f

    .line 312
    :goto_d
    return v2

    .line 313
    .line 314
    .line 315
    :cond_1f
    invoke-virtual {p0}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getLocale()Ljava/lang/String;

    .line 316
    move-result-object v1

    .line 317
    .line 318
    .line 319
    invoke-virtual {p1}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getLocale()Ljava/lang/String;

    .line 320
    move-result-object v3

    .line 321
    .line 322
    if-nez v1, :cond_20

    .line 323
    .line 324
    if-eqz v3, :cond_21

    .line 325
    goto :goto_e

    .line 326
    .line 327
    .line 328
    :cond_20
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 329
    move-result v1

    .line 330
    .line 331
    if-nez v1, :cond_21

    .line 332
    :goto_e
    return v2

    .line 333
    .line 334
    .line 335
    :cond_21
    invoke-virtual {p0}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getSize()Lcom/hcaptcha/sdk/HCaptchaSize;

    .line 336
    move-result-object v1

    .line 337
    .line 338
    .line 339
    invoke-virtual {p1}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getSize()Lcom/hcaptcha/sdk/HCaptchaSize;

    .line 340
    move-result-object v3

    .line 341
    .line 342
    if-nez v1, :cond_22

    .line 343
    .line 344
    if-eqz v3, :cond_23

    .line 345
    goto :goto_f

    .line 346
    .line 347
    .line 348
    :cond_22
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 349
    move-result v1

    .line 350
    .line 351
    if-nez v1, :cond_23

    .line 352
    :goto_f
    return v2

    .line 353
    .line 354
    .line 355
    :cond_23
    invoke-virtual {p0}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getOrientation()Lcom/hcaptcha/sdk/HCaptchaOrientation;

    .line 356
    move-result-object v1

    .line 357
    .line 358
    .line 359
    invoke-virtual {p1}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getOrientation()Lcom/hcaptcha/sdk/HCaptchaOrientation;

    .line 360
    move-result-object v3

    .line 361
    .line 362
    if-nez v1, :cond_24

    .line 363
    .line 364
    if-eqz v3, :cond_25

    .line 365
    goto :goto_10

    .line 366
    .line 367
    .line 368
    :cond_24
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 369
    move-result v1

    .line 370
    .line 371
    if-nez v1, :cond_25

    .line 372
    :goto_10
    return v2

    .line 373
    .line 374
    .line 375
    :cond_25
    invoke-virtual {p0}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getTheme()Lcom/hcaptcha/sdk/HCaptchaTheme;

    .line 376
    move-result-object v1

    .line 377
    .line 378
    .line 379
    invoke-virtual {p1}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getTheme()Lcom/hcaptcha/sdk/HCaptchaTheme;

    .line 380
    move-result-object v3

    .line 381
    .line 382
    if-nez v1, :cond_26

    .line 383
    .line 384
    if-eqz v3, :cond_27

    .line 385
    goto :goto_11

    .line 386
    .line 387
    .line 388
    :cond_26
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 389
    move-result v1

    .line 390
    .line 391
    if-nez v1, :cond_27

    .line 392
    :goto_11
    return v2

    .line 393
    .line 394
    .line 395
    :cond_27
    invoke-virtual {p0}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getHost()Ljava/lang/String;

    .line 396
    move-result-object v1

    .line 397
    .line 398
    .line 399
    invoke-virtual {p1}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getHost()Ljava/lang/String;

    .line 400
    move-result-object v3

    .line 401
    .line 402
    if-nez v1, :cond_28

    .line 403
    .line 404
    if-eqz v3, :cond_29

    .line 405
    goto :goto_12

    .line 406
    .line 407
    .line 408
    :cond_28
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 409
    move-result v1

    .line 410
    .line 411
    if-nez v1, :cond_29

    .line 412
    :goto_12
    return v2

    .line 413
    .line 414
    .line 415
    :cond_29
    invoke-virtual {p0}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getCustomTheme()Ljava/lang/String;

    .line 416
    move-result-object v1

    .line 417
    .line 418
    .line 419
    invoke-virtual {p1}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getCustomTheme()Ljava/lang/String;

    .line 420
    move-result-object v3

    .line 421
    .line 422
    if-nez v1, :cond_2a

    .line 423
    .line 424
    if-eqz v3, :cond_2b

    .line 425
    goto :goto_13

    .line 426
    .line 427
    .line 428
    :cond_2a
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 429
    move-result v1

    .line 430
    .line 431
    if-nez v1, :cond_2b

    .line 432
    :goto_13
    return v2

    .line 433
    .line 434
    .line 435
    :cond_2b
    invoke-virtual {p0}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getRetryPredicate()Lcom/hcaptcha/sdk/IHCaptchaRetryPredicate;

    .line 436
    move-result-object v1

    .line 437
    .line 438
    .line 439
    invoke-virtual {p1}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getRetryPredicate()Lcom/hcaptcha/sdk/IHCaptchaRetryPredicate;

    .line 440
    move-result-object p1

    .line 441
    .line 442
    if-nez v1, :cond_2c

    .line 443
    .line 444
    if-eqz p1, :cond_2d

    .line 445
    goto :goto_14

    .line 446
    .line 447
    .line 448
    :cond_2c
    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 449
    move-result p1

    .line 450
    .line 451
    if-nez p1, :cond_2d

    .line 452
    :goto_14
    return v2

    .line 453
    :cond_2d
    return v0
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

.method public getApiEndpoint()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->jsSrc:Ljava/lang/String;

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

.method public getAssethost()Ljava/lang/String;
    .locals 1
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "generated code"
    .end annotation

    .annotation build Llombok/Generated;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->assethost:Ljava/lang/String;

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

.method public getBaseUrl()Ljava/lang/String;
    .locals 2
    .annotation runtime Lcom/fasterxml/jackson/annotation/l;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->host:Ljava/lang/String;

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 8
    move-result v1

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    goto :goto_0

    .line 12
    .line 13
    :cond_0
    const-string v1, "https://"

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    move-result-object v0

    .line 18
    return-object v0

    .line 19
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 20
    return-object v0
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
.end method

.method public getCustomTheme()Ljava/lang/String;
    .locals 1
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "generated code"
    .end annotation

    .annotation build Llombok/Generated;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->customTheme:Ljava/lang/String;

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

.method public getDiagnosticLog()Ljava/lang/Boolean;
    .locals 1
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "generated code"
    .end annotation

    .annotation build Llombok/Generated;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->diagnosticLog:Ljava/lang/Boolean;

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

.method public getDisableHardwareAcceleration()Ljava/lang/Boolean;
    .locals 1
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "generated code"
    .end annotation

    .annotation build Llombok/Generated;
    .end annotation

    .annotation build Llombok/NonNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->disableHardwareAcceleration:Ljava/lang/Boolean;

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

.method public getEndpoint()Ljava/lang/String;
    .locals 1
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "generated code"
    .end annotation

    .annotation build Llombok/Generated;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->endpoint:Ljava/lang/String;

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

.method public getHideDialog()Ljava/lang/Boolean;
    .locals 1
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "generated code"
    .end annotation

    .annotation build Llombok/Generated;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->hideDialog:Ljava/lang/Boolean;

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

.method public getHost()Ljava/lang/String;
    .locals 1
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "generated code"
    .end annotation

    .annotation build Llombok/Generated;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->host:Ljava/lang/String;

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

.method public getImghost()Ljava/lang/String;
    .locals 1
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "generated code"
    .end annotation

    .annotation build Llombok/Generated;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->imghost:Ljava/lang/String;

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

.method public getJsSrc()Ljava/lang/String;
    .locals 1
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "generated code"
    .end annotation

    .annotation build Llombok/Generated;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->jsSrc:Ljava/lang/String;

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

.method public getLoading()Ljava/lang/Boolean;
    .locals 1
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "generated code"
    .end annotation

    .annotation build Llombok/Generated;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->loading:Ljava/lang/Boolean;

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

.method public getLocale()Ljava/lang/String;
    .locals 1
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "generated code"
    .end annotation

    .annotation build Llombok/Generated;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->locale:Ljava/lang/String;

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

.method public getOrientation()Lcom/hcaptcha/sdk/HCaptchaOrientation;
    .locals 1
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "generated code"
    .end annotation

    .annotation build Llombok/Generated;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->orientation:Lcom/hcaptcha/sdk/HCaptchaOrientation;

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

.method public getReportapi()Ljava/lang/String;
    .locals 1
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "generated code"
    .end annotation

    .annotation build Llombok/Generated;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->reportapi:Ljava/lang/String;

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

.method public getResetOnTimeout()Ljava/lang/Boolean;
    .locals 1
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "generated code"
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .annotation build Llombok/Generated;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->resetOnTimeout:Ljava/lang/Boolean;

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

.method public getRetryPredicate()Lcom/hcaptcha/sdk/IHCaptchaRetryPredicate;
    .locals 1
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "generated code"
    .end annotation

    .annotation build Llombok/Generated;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->retryPredicate:Lcom/hcaptcha/sdk/IHCaptchaRetryPredicate;

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

.method public getRqdata()Ljava/lang/String;
    .locals 1
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "generated code"
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .annotation build Llombok/Generated;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->rqdata:Ljava/lang/String;

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

.method public getSentry()Ljava/lang/Boolean;
    .locals 1
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "generated code"
    .end annotation

    .annotation build Llombok/Generated;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->sentry:Ljava/lang/Boolean;

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

.method public getSiteKey()Ljava/lang/String;
    .locals 1
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "generated code"
    .end annotation

    .annotation build Llombok/Generated;
    .end annotation

    .annotation build Llombok/NonNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->siteKey:Ljava/lang/String;

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

.method public getSize()Lcom/hcaptcha/sdk/HCaptchaSize;
    .locals 1
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "generated code"
    .end annotation

    .annotation build Llombok/Generated;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->size:Lcom/hcaptcha/sdk/HCaptchaSize;

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

.method public getTheme()Lcom/hcaptcha/sdk/HCaptchaTheme;
    .locals 1
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "generated code"
    .end annotation

    .annotation build Llombok/Generated;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->theme:Lcom/hcaptcha/sdk/HCaptchaTheme;

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

.method public getTokenExpiration()J
    .locals 2
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "generated code"
    .end annotation

    .annotation build Llombok/Generated;
    .end annotation

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->tokenExpiration:J

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

.method public hashCode()I
    .locals 4
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "generated code"
    .end annotation

    .annotation build Llombok/Generated;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getTokenExpiration()J

    .line 4
    move-result-wide v0

    .line 5
    .line 6
    const/16 v2, 0x20

    .line 7
    .line 8
    ushr-long v2, v0, v2

    .line 9
    xor-long/2addr v0, v2

    .line 10
    long-to-int v0, v0

    .line 11
    .line 12
    add-int/lit8 v0, v0, 0x3b

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getSentry()Ljava/lang/Boolean;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    mul-int/lit8 v0, v0, 0x3b

    .line 19
    .line 20
    const/16 v2, 0x2b

    .line 21
    .line 22
    if-nez v1, :cond_0

    .line 23
    move v1, v2

    .line 24
    goto :goto_0

    .line 25
    .line 26
    .line 27
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 28
    move-result v1

    .line 29
    :goto_0
    add-int/2addr v0, v1

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getLoading()Ljava/lang/Boolean;

    .line 33
    move-result-object v1

    .line 34
    .line 35
    mul-int/lit8 v0, v0, 0x3b

    .line 36
    .line 37
    if-nez v1, :cond_1

    .line 38
    move v1, v2

    .line 39
    goto :goto_1

    .line 40
    .line 41
    .line 42
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 43
    move-result v1

    .line 44
    :goto_1
    add-int/2addr v0, v1

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getHideDialog()Ljava/lang/Boolean;

    .line 48
    move-result-object v1

    .line 49
    .line 50
    mul-int/lit8 v0, v0, 0x3b

    .line 51
    .line 52
    if-nez v1, :cond_2

    .line 53
    move v1, v2

    .line 54
    goto :goto_2

    .line 55
    .line 56
    .line 57
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 58
    move-result v1

    .line 59
    :goto_2
    add-int/2addr v0, v1

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getResetOnTimeout()Ljava/lang/Boolean;

    .line 63
    move-result-object v1

    .line 64
    .line 65
    mul-int/lit8 v0, v0, 0x3b

    .line 66
    .line 67
    if-nez v1, :cond_3

    .line 68
    move v1, v2

    .line 69
    goto :goto_3

    .line 70
    .line 71
    .line 72
    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 73
    move-result v1

    .line 74
    :goto_3
    add-int/2addr v0, v1

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getDiagnosticLog()Ljava/lang/Boolean;

    .line 78
    move-result-object v1

    .line 79
    .line 80
    mul-int/lit8 v0, v0, 0x3b

    .line 81
    .line 82
    if-nez v1, :cond_4

    .line 83
    move v1, v2

    .line 84
    goto :goto_4

    .line 85
    .line 86
    .line 87
    :cond_4
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 88
    move-result v1

    .line 89
    :goto_4
    add-int/2addr v0, v1

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getDisableHardwareAcceleration()Ljava/lang/Boolean;

    .line 93
    move-result-object v1

    .line 94
    .line 95
    mul-int/lit8 v0, v0, 0x3b

    .line 96
    .line 97
    if-nez v1, :cond_5

    .line 98
    move v1, v2

    .line 99
    goto :goto_5

    .line 100
    .line 101
    .line 102
    :cond_5
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 103
    move-result v1

    .line 104
    :goto_5
    add-int/2addr v0, v1

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getSiteKey()Ljava/lang/String;

    .line 108
    move-result-object v1

    .line 109
    .line 110
    mul-int/lit8 v0, v0, 0x3b

    .line 111
    .line 112
    if-nez v1, :cond_6

    .line 113
    move v1, v2

    .line 114
    goto :goto_6

    .line 115
    .line 116
    .line 117
    :cond_6
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 118
    move-result v1

    .line 119
    :goto_6
    add-int/2addr v0, v1

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getRqdata()Ljava/lang/String;

    .line 123
    move-result-object v1

    .line 124
    .line 125
    mul-int/lit8 v0, v0, 0x3b

    .line 126
    .line 127
    if-nez v1, :cond_7

    .line 128
    move v1, v2

    .line 129
    goto :goto_7

    .line 130
    .line 131
    .line 132
    :cond_7
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 133
    move-result v1

    .line 134
    :goto_7
    add-int/2addr v0, v1

    .line 135
    .line 136
    .line 137
    invoke-virtual {p0}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getApiEndpoint()Ljava/lang/String;

    .line 138
    move-result-object v1

    .line 139
    .line 140
    mul-int/lit8 v0, v0, 0x3b

    .line 141
    .line 142
    if-nez v1, :cond_8

    .line 143
    move v1, v2

    .line 144
    goto :goto_8

    .line 145
    .line 146
    .line 147
    :cond_8
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 148
    move-result v1

    .line 149
    :goto_8
    add-int/2addr v0, v1

    .line 150
    .line 151
    .line 152
    invoke-virtual {p0}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getJsSrc()Ljava/lang/String;

    .line 153
    move-result-object v1

    .line 154
    .line 155
    mul-int/lit8 v0, v0, 0x3b

    .line 156
    .line 157
    if-nez v1, :cond_9

    .line 158
    move v1, v2

    .line 159
    goto :goto_9

    .line 160
    .line 161
    .line 162
    :cond_9
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 163
    move-result v1

    .line 164
    :goto_9
    add-int/2addr v0, v1

    .line 165
    .line 166
    .line 167
    invoke-virtual {p0}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getEndpoint()Ljava/lang/String;

    .line 168
    move-result-object v1

    .line 169
    .line 170
    mul-int/lit8 v0, v0, 0x3b

    .line 171
    .line 172
    if-nez v1, :cond_a

    .line 173
    move v1, v2

    .line 174
    goto :goto_a

    .line 175
    .line 176
    .line 177
    :cond_a
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 178
    move-result v1

    .line 179
    :goto_a
    add-int/2addr v0, v1

    .line 180
    .line 181
    .line 182
    invoke-virtual {p0}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getReportapi()Ljava/lang/String;

    .line 183
    move-result-object v1

    .line 184
    .line 185
    mul-int/lit8 v0, v0, 0x3b

    .line 186
    .line 187
    if-nez v1, :cond_b

    .line 188
    move v1, v2

    .line 189
    goto :goto_b

    .line 190
    .line 191
    .line 192
    :cond_b
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 193
    move-result v1

    .line 194
    :goto_b
    add-int/2addr v0, v1

    .line 195
    .line 196
    .line 197
    invoke-virtual {p0}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getAssethost()Ljava/lang/String;

    .line 198
    move-result-object v1

    .line 199
    .line 200
    mul-int/lit8 v0, v0, 0x3b

    .line 201
    .line 202
    if-nez v1, :cond_c

    .line 203
    move v1, v2

    .line 204
    goto :goto_c

    .line 205
    .line 206
    .line 207
    :cond_c
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 208
    move-result v1

    .line 209
    :goto_c
    add-int/2addr v0, v1

    .line 210
    .line 211
    .line 212
    invoke-virtual {p0}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getImghost()Ljava/lang/String;

    .line 213
    move-result-object v1

    .line 214
    .line 215
    mul-int/lit8 v0, v0, 0x3b

    .line 216
    .line 217
    if-nez v1, :cond_d

    .line 218
    move v1, v2

    .line 219
    goto :goto_d

    .line 220
    .line 221
    .line 222
    :cond_d
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 223
    move-result v1

    .line 224
    :goto_d
    add-int/2addr v0, v1

    .line 225
    .line 226
    .line 227
    invoke-virtual {p0}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getLocale()Ljava/lang/String;

    .line 228
    move-result-object v1

    .line 229
    .line 230
    mul-int/lit8 v0, v0, 0x3b

    .line 231
    .line 232
    if-nez v1, :cond_e

    .line 233
    move v1, v2

    .line 234
    goto :goto_e

    .line 235
    .line 236
    .line 237
    :cond_e
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 238
    move-result v1

    .line 239
    :goto_e
    add-int/2addr v0, v1

    .line 240
    .line 241
    .line 242
    invoke-virtual {p0}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getSize()Lcom/hcaptcha/sdk/HCaptchaSize;

    .line 243
    move-result-object v1

    .line 244
    .line 245
    mul-int/lit8 v0, v0, 0x3b

    .line 246
    .line 247
    if-nez v1, :cond_f

    .line 248
    move v1, v2

    .line 249
    goto :goto_f

    .line 250
    .line 251
    .line 252
    :cond_f
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 253
    move-result v1

    .line 254
    :goto_f
    add-int/2addr v0, v1

    .line 255
    .line 256
    .line 257
    invoke-virtual {p0}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getOrientation()Lcom/hcaptcha/sdk/HCaptchaOrientation;

    .line 258
    move-result-object v1

    .line 259
    .line 260
    mul-int/lit8 v0, v0, 0x3b

    .line 261
    .line 262
    if-nez v1, :cond_10

    .line 263
    move v1, v2

    .line 264
    goto :goto_10

    .line 265
    .line 266
    .line 267
    :cond_10
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 268
    move-result v1

    .line 269
    :goto_10
    add-int/2addr v0, v1

    .line 270
    .line 271
    .line 272
    invoke-virtual {p0}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getTheme()Lcom/hcaptcha/sdk/HCaptchaTheme;

    .line 273
    move-result-object v1

    .line 274
    .line 275
    mul-int/lit8 v0, v0, 0x3b

    .line 276
    .line 277
    if-nez v1, :cond_11

    .line 278
    move v1, v2

    .line 279
    goto :goto_11

    .line 280
    .line 281
    .line 282
    :cond_11
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 283
    move-result v1

    .line 284
    :goto_11
    add-int/2addr v0, v1

    .line 285
    .line 286
    .line 287
    invoke-virtual {p0}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getHost()Ljava/lang/String;

    .line 288
    move-result-object v1

    .line 289
    .line 290
    mul-int/lit8 v0, v0, 0x3b

    .line 291
    .line 292
    if-nez v1, :cond_12

    .line 293
    move v1, v2

    .line 294
    goto :goto_12

    .line 295
    .line 296
    .line 297
    :cond_12
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 298
    move-result v1

    .line 299
    :goto_12
    add-int/2addr v0, v1

    .line 300
    .line 301
    .line 302
    invoke-virtual {p0}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getCustomTheme()Ljava/lang/String;

    .line 303
    move-result-object v1

    .line 304
    .line 305
    mul-int/lit8 v0, v0, 0x3b

    .line 306
    .line 307
    if-nez v1, :cond_13

    .line 308
    move v1, v2

    .line 309
    goto :goto_13

    .line 310
    .line 311
    .line 312
    :cond_13
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 313
    move-result v1

    .line 314
    :goto_13
    add-int/2addr v0, v1

    .line 315
    .line 316
    .line 317
    invoke-virtual {p0}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getRetryPredicate()Lcom/hcaptcha/sdk/IHCaptchaRetryPredicate;

    .line 318
    move-result-object v1

    .line 319
    .line 320
    mul-int/lit8 v0, v0, 0x3b

    .line 321
    .line 322
    if-nez v1, :cond_14

    .line 323
    goto :goto_14

    .line 324
    .line 325
    .line 326
    :cond_14
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 327
    move-result v2

    .line 328
    :goto_14
    add-int/2addr v0, v2

    .line 329
    return v0
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

.method public setApiEndpoint(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lcom/fasterxml/jackson/annotation/l;
    .end annotation

    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "generated code"
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .annotation build Llombok/Generated;
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->apiEndpoint:Ljava/lang/String;

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

.method public setAssethost(Ljava/lang/String;)V
    .locals 0
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "generated code"
    .end annotation

    .annotation build Llombok/Generated;
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->assethost:Ljava/lang/String;

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

.method public setCustomTheme(Ljava/lang/String;)V
    .locals 0
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "generated code"
    .end annotation

    .annotation build Llombok/Generated;
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->customTheme:Ljava/lang/String;

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

.method public setDiagnosticLog(Ljava/lang/Boolean;)V
    .locals 0
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "generated code"
    .end annotation

    .annotation build Llombok/Generated;
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->diagnosticLog:Ljava/lang/Boolean;

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

.method public setDisableHardwareAcceleration(Ljava/lang/Boolean;)V
    .locals 1
    .param p1    # Ljava/lang/Boolean;
        .annotation build Llombok/NonNull;
        .end annotation
    .end param
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "generated code"
    .end annotation

    .annotation build Llombok/Generated;
    .end annotation

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    iput-object p1, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->disableHardwareAcceleration:Ljava/lang/Boolean;

    .line 5
    return-void

    .line 6
    .line 7
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 8
    .line 9
    const-string v0, "disableHardwareAcceleration is marked non-null but is null"

    .line 10
    .line 11
    .line 12
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 13
    throw p1
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

.method public setEndpoint(Ljava/lang/String;)V
    .locals 0
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "generated code"
    .end annotation

    .annotation build Llombok/Generated;
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->endpoint:Ljava/lang/String;

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

.method public setHideDialog(Ljava/lang/Boolean;)V
    .locals 0
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "generated code"
    .end annotation

    .annotation build Llombok/Generated;
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->hideDialog:Ljava/lang/Boolean;

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

.method public setHost(Ljava/lang/String;)V
    .locals 0
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "generated code"
    .end annotation

    .annotation build Llombok/Generated;
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->host:Ljava/lang/String;

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

.method public setImghost(Ljava/lang/String;)V
    .locals 0
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "generated code"
    .end annotation

    .annotation build Llombok/Generated;
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->imghost:Ljava/lang/String;

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

.method public setJsSrc(Ljava/lang/String;)V
    .locals 0
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "generated code"
    .end annotation

    .annotation build Llombok/Generated;
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->jsSrc:Ljava/lang/String;

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

.method public setLoading(Ljava/lang/Boolean;)V
    .locals 0
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "generated code"
    .end annotation

    .annotation build Llombok/Generated;
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->loading:Ljava/lang/Boolean;

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

.method public setLocale(Ljava/lang/String;)V
    .locals 0
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "generated code"
    .end annotation

    .annotation build Llombok/Generated;
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->locale:Ljava/lang/String;

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

.method public setOrientation(Lcom/hcaptcha/sdk/HCaptchaOrientation;)V
    .locals 0
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "generated code"
    .end annotation

    .annotation build Llombok/Generated;
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->orientation:Lcom/hcaptcha/sdk/HCaptchaOrientation;

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

.method public setReportapi(Ljava/lang/String;)V
    .locals 0
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "generated code"
    .end annotation

    .annotation build Llombok/Generated;
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->reportapi:Ljava/lang/String;

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

.method public setResetOnTimeout(Ljava/lang/Boolean;)V
    .locals 0
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "generated code"
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .annotation build Llombok/Generated;
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->resetOnTimeout:Ljava/lang/Boolean;

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

.method public setRetryPredicate(Lcom/hcaptcha/sdk/IHCaptchaRetryPredicate;)V
    .locals 0
    .annotation runtime Lcom/fasterxml/jackson/annotation/l;
    .end annotation

    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "generated code"
    .end annotation

    .annotation build Llombok/Generated;
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->retryPredicate:Lcom/hcaptcha/sdk/IHCaptchaRetryPredicate;

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

.method public setRqdata(Ljava/lang/String;)V
    .locals 0
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "generated code"
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .annotation build Llombok/Generated;
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->rqdata:Ljava/lang/String;

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

.method public setSentry(Ljava/lang/Boolean;)V
    .locals 0
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "generated code"
    .end annotation

    .annotation build Llombok/Generated;
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->sentry:Ljava/lang/Boolean;

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

.method public setSiteKey(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Llombok/NonNull;
        .end annotation
    .end param
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "generated code"
    .end annotation

    .annotation build Llombok/Generated;
    .end annotation

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    iput-object p1, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->siteKey:Ljava/lang/String;

    .line 5
    return-void

    .line 6
    .line 7
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 8
    .line 9
    const-string v0, "siteKey is marked non-null but is null"

    .line 10
    .line 11
    .line 12
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 13
    throw p1
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

.method public setSize(Lcom/hcaptcha/sdk/HCaptchaSize;)V
    .locals 0
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "generated code"
    .end annotation

    .annotation build Llombok/Generated;
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->size:Lcom/hcaptcha/sdk/HCaptchaSize;

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

.method public setTheme(Lcom/hcaptcha/sdk/HCaptchaTheme;)V
    .locals 0
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "generated code"
    .end annotation

    .annotation build Llombok/Generated;
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->theme:Lcom/hcaptcha/sdk/HCaptchaTheme;

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

.method public setTokenExpiration(J)V
    .locals 0
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "generated code"
    .end annotation

    .annotation build Llombok/Generated;
    .end annotation

    .line 1
    .line 2
    iput-wide p1, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->tokenExpiration:J

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

.method public toBuilder()Lcom/hcaptcha/sdk/HCaptchaConfig$a;
    .locals 3
    .annotation build Ledu/umd/cs/findbugs/annotations/NonNull;
    .end annotation

    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "generated code"
    .end annotation

    .annotation build Llombok/Generated;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/hcaptcha/sdk/HCaptchaConfig$a;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/hcaptcha/sdk/HCaptchaConfig$a;-><init>()V

    .line 6
    .line 7
    iget-object v1, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->siteKey:Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lcom/hcaptcha/sdk/HCaptchaConfig$a;->t(Ljava/lang/String;)Lcom/hcaptcha/sdk/HCaptchaConfig$a;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    iget-object v1, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->sentry:Ljava/lang/Boolean;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lcom/hcaptcha/sdk/HCaptchaConfig$a;->s(Ljava/lang/Boolean;)Lcom/hcaptcha/sdk/HCaptchaConfig$a;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    iget-object v1, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->loading:Ljava/lang/Boolean;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lcom/hcaptcha/sdk/HCaptchaConfig$a;->l(Ljava/lang/Boolean;)Lcom/hcaptcha/sdk/HCaptchaConfig$a;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    iget-object v1, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->hideDialog:Ljava/lang/Boolean;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Lcom/hcaptcha/sdk/HCaptchaConfig$a;->h(Ljava/lang/Boolean;)Lcom/hcaptcha/sdk/HCaptchaConfig$a;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    iget-object v1, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->rqdata:Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1}, Lcom/hcaptcha/sdk/HCaptchaConfig$a;->r(Ljava/lang/String;)Lcom/hcaptcha/sdk/HCaptchaConfig$a;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    iget-object v1, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->apiEndpoint:Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v1}, Lcom/hcaptcha/sdk/HCaptchaConfig$a;->a(Ljava/lang/String;)Lcom/hcaptcha/sdk/HCaptchaConfig$a;

    .line 41
    move-result-object v0

    .line 42
    .line 43
    iget-object v1, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->jsSrc:Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v1}, Lcom/hcaptcha/sdk/HCaptchaConfig$a;->k(Ljava/lang/String;)Lcom/hcaptcha/sdk/HCaptchaConfig$a;

    .line 47
    move-result-object v0

    .line 48
    .line 49
    iget-object v1, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->endpoint:Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1}, Lcom/hcaptcha/sdk/HCaptchaConfig$a;->g(Ljava/lang/String;)Lcom/hcaptcha/sdk/HCaptchaConfig$a;

    .line 53
    move-result-object v0

    .line 54
    .line 55
    iget-object v1, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->reportapi:Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v1}, Lcom/hcaptcha/sdk/HCaptchaConfig$a;->o(Ljava/lang/String;)Lcom/hcaptcha/sdk/HCaptchaConfig$a;

    .line 59
    move-result-object v0

    .line 60
    .line 61
    iget-object v1, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->assethost:Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v1}, Lcom/hcaptcha/sdk/HCaptchaConfig$a;->b(Ljava/lang/String;)Lcom/hcaptcha/sdk/HCaptchaConfig$a;

    .line 65
    move-result-object v0

    .line 66
    .line 67
    iget-object v1, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->imghost:Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v1}, Lcom/hcaptcha/sdk/HCaptchaConfig$a;->j(Ljava/lang/String;)Lcom/hcaptcha/sdk/HCaptchaConfig$a;

    .line 71
    move-result-object v0

    .line 72
    .line 73
    iget-object v1, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->locale:Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, v1}, Lcom/hcaptcha/sdk/HCaptchaConfig$a;->m(Ljava/lang/String;)Lcom/hcaptcha/sdk/HCaptchaConfig$a;

    .line 77
    move-result-object v0

    .line 78
    .line 79
    iget-object v1, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->size:Lcom/hcaptcha/sdk/HCaptchaSize;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, v1}, Lcom/hcaptcha/sdk/HCaptchaConfig$a;->u(Lcom/hcaptcha/sdk/HCaptchaSize;)Lcom/hcaptcha/sdk/HCaptchaConfig$a;

    .line 83
    move-result-object v0

    .line 84
    .line 85
    iget-object v1, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->orientation:Lcom/hcaptcha/sdk/HCaptchaOrientation;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, v1}, Lcom/hcaptcha/sdk/HCaptchaConfig$a;->n(Lcom/hcaptcha/sdk/HCaptchaOrientation;)Lcom/hcaptcha/sdk/HCaptchaConfig$a;

    .line 89
    move-result-object v0

    .line 90
    .line 91
    iget-object v1, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->theme:Lcom/hcaptcha/sdk/HCaptchaTheme;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, v1}, Lcom/hcaptcha/sdk/HCaptchaConfig$a;->v(Lcom/hcaptcha/sdk/HCaptchaTheme;)Lcom/hcaptcha/sdk/HCaptchaConfig$a;

    .line 95
    move-result-object v0

    .line 96
    .line 97
    iget-object v1, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->host:Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, v1}, Lcom/hcaptcha/sdk/HCaptchaConfig$a;->i(Ljava/lang/String;)Lcom/hcaptcha/sdk/HCaptchaConfig$a;

    .line 101
    move-result-object v0

    .line 102
    .line 103
    iget-object v1, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->customTheme:Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0, v1}, Lcom/hcaptcha/sdk/HCaptchaConfig$a;->d(Ljava/lang/String;)Lcom/hcaptcha/sdk/HCaptchaConfig$a;

    .line 107
    move-result-object v0

    .line 108
    .line 109
    iget-object v1, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->resetOnTimeout:Ljava/lang/Boolean;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0, v1}, Lcom/hcaptcha/sdk/HCaptchaConfig$a;->p(Ljava/lang/Boolean;)Lcom/hcaptcha/sdk/HCaptchaConfig$a;

    .line 113
    move-result-object v0

    .line 114
    .line 115
    iget-object v1, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->retryPredicate:Lcom/hcaptcha/sdk/IHCaptchaRetryPredicate;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0, v1}, Lcom/hcaptcha/sdk/HCaptchaConfig$a;->q(Lcom/hcaptcha/sdk/IHCaptchaRetryPredicate;)Lcom/hcaptcha/sdk/HCaptchaConfig$a;

    .line 119
    move-result-object v0

    .line 120
    .line 121
    iget-wide v1, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->tokenExpiration:J

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0, v1, v2}, Lcom/hcaptcha/sdk/HCaptchaConfig$a;->w(J)Lcom/hcaptcha/sdk/HCaptchaConfig$a;

    .line 125
    move-result-object v0

    .line 126
    .line 127
    iget-object v1, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->diagnosticLog:Ljava/lang/Boolean;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0, v1}, Lcom/hcaptcha/sdk/HCaptchaConfig$a;->e(Ljava/lang/Boolean;)Lcom/hcaptcha/sdk/HCaptchaConfig$a;

    .line 131
    move-result-object v0

    .line 132
    .line 133
    iget-object v1, p0, Lcom/hcaptcha/sdk/HCaptchaConfig;->disableHardwareAcceleration:Ljava/lang/Boolean;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0, v1}, Lcom/hcaptcha/sdk/HCaptchaConfig$a;->f(Ljava/lang/Boolean;)Lcom/hcaptcha/sdk/HCaptchaConfig$a;

    .line 137
    move-result-object v0

    .line 138
    return-object v0
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
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Ledu/umd/cs/findbugs/annotations/NonNull;
    .end annotation

    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "generated code"
    .end annotation

    .annotation build Llombok/Generated;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    const-string v1, "HCaptchaConfig(siteKey="

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getSiteKey()Ljava/lang/String;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v1, ", sentry="

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getSentry()Ljava/lang/Boolean;

    .line 23
    move-result-object v1

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    const-string v1, ", loading="

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getLoading()Ljava/lang/Boolean;

    .line 35
    move-result-object v1

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    const-string v1, ", hideDialog="

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getHideDialog()Ljava/lang/Boolean;

    .line 47
    move-result-object v1

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    const-string v1, ", rqdata="

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getRqdata()Ljava/lang/String;

    .line 59
    move-result-object v1

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    const-string v1, ", apiEndpoint="

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getApiEndpoint()Ljava/lang/String;

    .line 71
    move-result-object v1

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    const-string v1, ", jsSrc="

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getJsSrc()Ljava/lang/String;

    .line 83
    move-result-object v1

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    const-string v1, ", endpoint="

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getEndpoint()Ljava/lang/String;

    .line 95
    move-result-object v1

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    const-string v1, ", reportapi="

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getReportapi()Ljava/lang/String;

    .line 107
    move-result-object v1

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    const-string v1, ", assethost="

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getAssethost()Ljava/lang/String;

    .line 119
    move-result-object v1

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    const-string v1, ", imghost="

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {p0}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getImghost()Ljava/lang/String;

    .line 131
    move-result-object v1

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    const-string v1, ", locale="

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {p0}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getLocale()Ljava/lang/String;

    .line 143
    move-result-object v1

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    const-string v1, ", size="

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {p0}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getSize()Lcom/hcaptcha/sdk/HCaptchaSize;

    .line 155
    move-result-object v1

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    const-string v1, ", orientation="

    .line 161
    .line 162
    .line 163
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {p0}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getOrientation()Lcom/hcaptcha/sdk/HCaptchaOrientation;

    .line 167
    move-result-object v1

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    const-string v1, ", theme="

    .line 173
    .line 174
    .line 175
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {p0}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getTheme()Lcom/hcaptcha/sdk/HCaptchaTheme;

    .line 179
    move-result-object v1

    .line 180
    .line 181
    .line 182
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    const-string v1, ", host="

    .line 185
    .line 186
    .line 187
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {p0}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getHost()Ljava/lang/String;

    .line 191
    move-result-object v1

    .line 192
    .line 193
    .line 194
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    const-string v1, ", customTheme="

    .line 197
    .line 198
    .line 199
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {p0}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getCustomTheme()Ljava/lang/String;

    .line 203
    move-result-object v1

    .line 204
    .line 205
    .line 206
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    const-string v1, ", resetOnTimeout="

    .line 209
    .line 210
    .line 211
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    invoke-virtual {p0}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getResetOnTimeout()Ljava/lang/Boolean;

    .line 215
    move-result-object v1

    .line 216
    .line 217
    .line 218
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    const-string v1, ", retryPredicate="

    .line 221
    .line 222
    .line 223
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    invoke-virtual {p0}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getRetryPredicate()Lcom/hcaptcha/sdk/IHCaptchaRetryPredicate;

    .line 227
    move-result-object v1

    .line 228
    .line 229
    .line 230
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    const-string v1, ", tokenExpiration="

    .line 233
    .line 234
    .line 235
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    invoke-virtual {p0}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getTokenExpiration()J

    .line 239
    move-result-wide v1

    .line 240
    .line 241
    .line 242
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    const-string v1, ", diagnosticLog="

    .line 245
    .line 246
    .line 247
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    invoke-virtual {p0}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getDiagnosticLog()Ljava/lang/Boolean;

    .line 251
    move-result-object v1

    .line 252
    .line 253
    .line 254
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    const-string v1, ", disableHardwareAcceleration="

    .line 257
    .line 258
    .line 259
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 260
    .line 261
    .line 262
    invoke-virtual {p0}, Lcom/hcaptcha/sdk/HCaptchaConfig;->getDisableHardwareAcceleration()Ljava/lang/Boolean;

    .line 263
    move-result-object v1

    .line 264
    .line 265
    .line 266
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    const-string v1, ")"

    .line 269
    .line 270
    .line 271
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 275
    move-result-object v0

    .line 276
    return-object v0
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
