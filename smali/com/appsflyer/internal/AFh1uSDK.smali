.class public final enum Lcom/appsflyer/internal/AFh1uSDK;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/appsflyer/internal/AFh1uSDK;",
        ">;"
    }
.end annotation


# static fields
.field private static enum AFAdRevenueData:Lcom/appsflyer/internal/AFh1uSDK;

.field private static enum getMediationNetwork:Lcom/appsflyer/internal/AFh1uSDK;

.field private static enum getMonetizationNetwork:Lcom/appsflyer/internal/AFh1uSDK;

.field private static final synthetic getRevenue:[Lcom/appsflyer/internal/AFh1uSDK;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/appsflyer/internal/AFh1uSDK;

    .line 3
    .line 4
    const-string v1, "application"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1, v2}, Lcom/appsflyer/internal/AFh1uSDK;-><init>(Ljava/lang/String;I)V

    .line 9
    .line 10
    sput-object v0, Lcom/appsflyer/internal/AFh1uSDK;->getMonetizationNetwork:Lcom/appsflyer/internal/AFh1uSDK;

    .line 11
    .line 12
    new-instance v0, Lcom/appsflyer/internal/AFh1uSDK;

    .line 13
    .line 14
    const-string v1, "activity"

    .line 15
    const/4 v2, 0x1

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1, v2}, Lcom/appsflyer/internal/AFh1uSDK;-><init>(Ljava/lang/String;I)V

    .line 19
    .line 20
    sput-object v0, Lcom/appsflyer/internal/AFh1uSDK;->getMediationNetwork:Lcom/appsflyer/internal/AFh1uSDK;

    .line 21
    .line 22
    new-instance v0, Lcom/appsflyer/internal/AFh1uSDK;

    .line 23
    .line 24
    const-string v1, "other"

    .line 25
    const/4 v2, 0x2

    .line 26
    .line 27
    .line 28
    invoke-direct {v0, v1, v2}, Lcom/appsflyer/internal/AFh1uSDK;-><init>(Ljava/lang/String;I)V

    .line 29
    .line 30
    sput-object v0, Lcom/appsflyer/internal/AFh1uSDK;->AFAdRevenueData:Lcom/appsflyer/internal/AFh1uSDK;

    .line 31
    .line 32
    sget-object v1, Lcom/appsflyer/internal/AFh1uSDK;->getMonetizationNetwork:Lcom/appsflyer/internal/AFh1uSDK;

    .line 33
    .line 34
    sget-object v2, Lcom/appsflyer/internal/AFh1uSDK;->getMediationNetwork:Lcom/appsflyer/internal/AFh1uSDK;

    .line 35
    .line 36
    .line 37
    filled-new-array {v1, v2, v0}, [Lcom/appsflyer/internal/AFh1uSDK;

    .line 38
    move-result-object v0

    .line 39
    .line 40
    sput-object v0, Lcom/appsflyer/internal/AFh1uSDK;->getRevenue:[Lcom/appsflyer/internal/AFh1uSDK;

    .line 41
    return-void
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
.end method

.method public static getMonetizationNetwork(Landroid/content/Context;)Lcom/appsflyer/internal/AFh1uSDK;
    .locals 1

    .line 1
    .line 2
    instance-of v0, p0, Landroid/app/Activity;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    sget-object p0, Lcom/appsflyer/internal/AFh1uSDK;->getMediationNetwork:Lcom/appsflyer/internal/AFh1uSDK;

    .line 7
    return-object p0

    .line 8
    .line 9
    :cond_0
    instance-of p0, p0, Landroid/app/Application;

    .line 10
    .line 11
    if-eqz p0, :cond_1

    .line 12
    .line 13
    sget-object p0, Lcom/appsflyer/internal/AFh1uSDK;->getMonetizationNetwork:Lcom/appsflyer/internal/AFh1uSDK;

    .line 14
    return-object p0

    .line 15
    .line 16
    :cond_1
    sget-object p0, Lcom/appsflyer/internal/AFh1uSDK;->AFAdRevenueData:Lcom/appsflyer/internal/AFh1uSDK;

    .line 17
    return-object p0
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
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/appsflyer/internal/AFh1uSDK;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lcom/appsflyer/internal/AFh1uSDK;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/appsflyer/internal/AFh1uSDK;

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
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
.end method

.method public static values()[Lcom/appsflyer/internal/AFh1uSDK;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/appsflyer/internal/AFh1uSDK;->getRevenue:[Lcom/appsflyer/internal/AFh1uSDK;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, [Lcom/appsflyer/internal/AFh1uSDK;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lcom/appsflyer/internal/AFh1uSDK;

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
    .line 19
    .line 20
    .line 21
    .line 22
.end method
