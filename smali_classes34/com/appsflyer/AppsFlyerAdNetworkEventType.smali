.class public final enum Lcom/appsflyer/AppsFlyerAdNetworkEventType;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/appsflyer/AppsFlyerAdNetworkEventType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0007\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008"
    }
    d2 = {
        "Lcom/appsflyer/AppsFlyerAdNetworkEventType;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "BANNER",
        "INTERSTITIAL",
        "NATIVE",
        "REWARDED",
        "APP_OPEN"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final enum APP_OPEN:Lcom/appsflyer/AppsFlyerAdNetworkEventType;

.field public static final enum BANNER:Lcom/appsflyer/AppsFlyerAdNetworkEventType;

.field public static final enum INTERSTITIAL:Lcom/appsflyer/AppsFlyerAdNetworkEventType;

.field public static final enum NATIVE:Lcom/appsflyer/AppsFlyerAdNetworkEventType;

.field public static final enum REWARDED:Lcom/appsflyer/AppsFlyerAdNetworkEventType;

.field private static final synthetic getCurrencyIso4217Code:[Lcom/appsflyer/AppsFlyerAdNetworkEventType;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    .line 2
    new-instance v0, Lcom/appsflyer/AppsFlyerAdNetworkEventType;

    .line 3
    .line 4
    const-string v1, "BANNER"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1, v2}, Lcom/appsflyer/AppsFlyerAdNetworkEventType;-><init>(Ljava/lang/String;I)V

    .line 9
    .line 10
    sput-object v0, Lcom/appsflyer/AppsFlyerAdNetworkEventType;->BANNER:Lcom/appsflyer/AppsFlyerAdNetworkEventType;

    .line 11
    .line 12
    new-instance v1, Lcom/appsflyer/AppsFlyerAdNetworkEventType;

    .line 13
    .line 14
    const-string v2, "INTERSTITIAL"

    .line 15
    const/4 v3, 0x1

    .line 16
    .line 17
    .line 18
    invoke-direct {v1, v2, v3}, Lcom/appsflyer/AppsFlyerAdNetworkEventType;-><init>(Ljava/lang/String;I)V

    .line 19
    .line 20
    sput-object v1, Lcom/appsflyer/AppsFlyerAdNetworkEventType;->INTERSTITIAL:Lcom/appsflyer/AppsFlyerAdNetworkEventType;

    .line 21
    .line 22
    new-instance v2, Lcom/appsflyer/AppsFlyerAdNetworkEventType;

    .line 23
    .line 24
    const-string v3, "NATIVE"

    .line 25
    const/4 v4, 0x2

    .line 26
    .line 27
    .line 28
    invoke-direct {v2, v3, v4}, Lcom/appsflyer/AppsFlyerAdNetworkEventType;-><init>(Ljava/lang/String;I)V

    .line 29
    .line 30
    sput-object v2, Lcom/appsflyer/AppsFlyerAdNetworkEventType;->NATIVE:Lcom/appsflyer/AppsFlyerAdNetworkEventType;

    .line 31
    .line 32
    new-instance v3, Lcom/appsflyer/AppsFlyerAdNetworkEventType;

    .line 33
    .line 34
    const-string v4, "REWARDED"

    .line 35
    const/4 v5, 0x3

    .line 36
    .line 37
    .line 38
    invoke-direct {v3, v4, v5}, Lcom/appsflyer/AppsFlyerAdNetworkEventType;-><init>(Ljava/lang/String;I)V

    .line 39
    .line 40
    sput-object v3, Lcom/appsflyer/AppsFlyerAdNetworkEventType;->REWARDED:Lcom/appsflyer/AppsFlyerAdNetworkEventType;

    .line 41
    .line 42
    new-instance v4, Lcom/appsflyer/AppsFlyerAdNetworkEventType;

    .line 43
    .line 44
    const-string v5, "APP_OPEN"

    .line 45
    const/4 v6, 0x4

    .line 46
    .line 47
    .line 48
    invoke-direct {v4, v5, v6}, Lcom/appsflyer/AppsFlyerAdNetworkEventType;-><init>(Ljava/lang/String;I)V

    .line 49
    .line 50
    sput-object v4, Lcom/appsflyer/AppsFlyerAdNetworkEventType;->APP_OPEN:Lcom/appsflyer/AppsFlyerAdNetworkEventType;

    .line 51
    .line 52
    .line 53
    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/appsflyer/AppsFlyerAdNetworkEventType;

    .line 54
    move-result-object v0

    .line 55
    .line 56
    sput-object v0, Lcom/appsflyer/AppsFlyerAdNetworkEventType;->getCurrencyIso4217Code:[Lcom/appsflyer/AppsFlyerAdNetworkEventType;

    .line 57
    return-void
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
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

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
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/appsflyer/AppsFlyerAdNetworkEventType;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lcom/appsflyer/AppsFlyerAdNetworkEventType;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/appsflyer/AppsFlyerAdNetworkEventType;

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
.end method

.method public static values()[Lcom/appsflyer/AppsFlyerAdNetworkEventType;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/appsflyer/AppsFlyerAdNetworkEventType;->getCurrencyIso4217Code:[Lcom/appsflyer/AppsFlyerAdNetworkEventType;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lcom/appsflyer/AppsFlyerAdNetworkEventType;

    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method
