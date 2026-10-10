.class public final Lcom/appsflyer/internal/AFd1oSDK;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/appsflyer/internal/AFd1kSDK;


# static fields
.field private static $10:I = 0x0

.field private static $11:I = 0x1

.field private static final AFAdRevenueData:I

.field private static component2:[C = null

.field private static copy:Z = false

.field private static copydefault:Z = false

.field private static equals:I = 0x1

.field private static hashCode:I

.field private static toString:I


# instance fields
.field private areAllFieldsValid:Ljava/security/SecureRandom;

.field private component1:Z

.field private final component3:Lcom/appsflyer/internal/AFd1zSDK;

.field private component4:Z

.field private final getCurrencyIso4217Code:Ljava/util/Map;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private getMediationNetwork:Z

.field private getMonetizationNetwork:I

.field private getRevenue:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/appsflyer/internal/AFd1oSDK;->component1()V

    .line 4
    .line 5
    .line 6
    const v0, 0x17f76

    .line 7
    .line 8
    sput v0, Lcom/appsflyer/internal/AFd1oSDK;->AFAdRevenueData:I

    .line 9
    .line 10
    sget v0, Lcom/appsflyer/internal/AFd1oSDK;->toString:I

    .line 11
    .line 12
    add-int/lit8 v0, v0, 0x6b

    .line 13
    .line 14
    rem-int/lit16 v0, v0, 0x80

    .line 15
    .line 16
    sput v0, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public constructor <init>(Lcom/appsflyer/internal/AFd1zSDK;)V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/appsflyer/internal/AFd1oSDK;->getRevenue:Ljava/util/List;

    .line 11
    const/4 v0, 0x1

    .line 12
    .line 13
    iput-boolean v0, p0, Lcom/appsflyer/internal/AFd1oSDK;->getMediationNetwork:Z

    .line 14
    .line 15
    new-instance v1, Ljava/util/HashMap;

    .line 16
    .line 17
    .line 18
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 19
    .line 20
    iput-object v1, p0, Lcom/appsflyer/internal/AFd1oSDK;->getCurrencyIso4217Code:Ljava/util/Map;

    .line 21
    .line 22
    new-instance v1, Ljava/security/SecureRandom;

    .line 23
    .line 24
    .line 25
    invoke-direct {v1}, Ljava/security/SecureRandom;-><init>()V

    .line 26
    .line 27
    iput-object v1, p0, Lcom/appsflyer/internal/AFd1oSDK;->areAllFieldsValid:Ljava/security/SecureRandom;

    .line 28
    .line 29
    .line 30
    invoke-static {}, Lcom/appsflyer/AppsFlyerProperties;->getInstance()Lcom/appsflyer/AppsFlyerProperties;

    .line 31
    move-result-object v1

    .line 32
    .line 33
    const-string v2, "disableProxy"

    .line 34
    const/4 v3, 0x0

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, v2, v3}, Lcom/appsflyer/AppsFlyerProperties;->getBoolean(Ljava/lang/String;Z)Z

    .line 38
    move-result v1

    .line 39
    xor-int/2addr v0, v1

    .line 40
    .line 41
    iput-boolean v0, p0, Lcom/appsflyer/internal/AFd1oSDK;->component4:Z

    .line 42
    .line 43
    iput v3, p0, Lcom/appsflyer/internal/AFd1oSDK;->getMonetizationNetwork:I

    .line 44
    .line 45
    iput-boolean v3, p0, Lcom/appsflyer/internal/AFd1oSDK;->component1:Z

    .line 46
    .line 47
    iput-object p1, p0, Lcom/appsflyer/internal/AFd1oSDK;->component3:Lcom/appsflyer/internal/AFd1zSDK;

    .line 48
    return-void
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
.end method

.method private static AFAdRevenueData(Lcom/appsflyer/internal/AFi1ySDK;)Lcom/appsflyer/internal/AFi1uSDK;
    .locals 3
    .param p0    # Lcom/appsflyer/internal/AFi1ySDK;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    const/4 v0, 0x0

    if-eqz p0, :cond_1

    .line 38
    sget v1, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    add-int/lit8 v2, v1, 0x4f

    rem-int/lit16 v2, v2, 0x80

    sput v2, Lcom/appsflyer/internal/AFd1oSDK;->toString:I

    .line 39
    iget-object p0, p0, Lcom/appsflyer/internal/AFi1ySDK;->getRevenue:Lcom/appsflyer/internal/AFi1zSDK;

    if-eqz p0, :cond_1

    add-int/lit8 v2, v1, 0x7

    .line 40
    rem-int/lit16 v2, v2, 0x80

    sput v2, Lcom/appsflyer/internal/AFd1oSDK;->toString:I

    .line 41
    iget-object p0, p0, Lcom/appsflyer/internal/AFi1zSDK;->getRevenue:Lcom/appsflyer/internal/AFi1uSDK;

    add-int/lit8 v1, v1, 0x1b

    .line 42
    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/appsflyer/internal/AFd1oSDK;->toString:I

    rem-int/lit8 v1, v1, 0x2

    if-nez v1, :cond_0

    return-object p0

    :cond_0
    throw v0

    :cond_1
    return-object v0
.end method

.method private static synthetic AFAdRevenueData([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    const/4 v0, 0x0

    aget-object p0, p0, v0

    check-cast p0, Lcom/appsflyer/internal/AFd1oSDK;

    .line 17
    sget v0, Lcom/appsflyer/internal/AFd1oSDK;->toString:I

    add-int/lit8 v1, v0, 0x4f

    rem-int/lit16 v1, v1, 0x80

    sput v1, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    iget-boolean p0, p0, Lcom/appsflyer/internal/AFd1oSDK;->component1:Z

    add-int/lit8 v0, v0, 0x27

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    rem-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    throw p0
.end method

.method public static synthetic AFAdRevenueData([Ljava/lang/Object;III)Ljava/lang/Object;
    .locals 5

    mul-int/lit16 v0, p1, -0x203

    mul-int/lit16 v1, p2, 0x205

    add-int/2addr v0, v1

    not-int v1, p2

    or-int v2, v1, p3

    not-int v2, v2

    not-int v3, p3

    or-int v4, v3, p1

    not-int v4, v4

    or-int/2addr v2, v4

    or-int v4, v3, p2

    not-int v4, v4

    or-int/2addr v2, v4

    mul-int/lit16 v2, v2, -0x204

    add-int/2addr v0, v2

    not-int p1, p1

    or-int/2addr v1, p1

    or-int/2addr p3, v1

    not-int p3, p3

    or-int v1, p1, v3

    or-int/2addr v1, p2

    not-int v1, v1

    or-int/2addr p3, v1

    mul-int/lit16 p3, p3, 0x204

    add-int/2addr v0, p3

    or-int/2addr p1, p2

    not-int p1, p1

    or-int/2addr p1, v4

    mul-int/lit16 p1, p1, 0x204

    add-int/2addr v0, p1

    const/4 p1, 0x2

    const/4 p2, 0x1

    if-eq v0, p2, :cond_2

    if-eq v0, p1, :cond_1

    const/4 p1, 0x3

    if-eq v0, p1, :cond_0

    .line 1
    invoke-static {p0}, Lcom/appsflyer/internal/AFd1oSDK;->AFAdRevenueData([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p0}, Lcom/appsflyer/internal/AFd1oSDK;->getMonetizationNetwork([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-static {p0}, Lcom/appsflyer/internal/AFd1oSDK;->getCurrencyIso4217Code([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_2
    const/4 p3, 0x0

    aget-object p0, p0, p3

    check-cast p0, Ljava/lang/String;

    .line 2
    invoke-static {p0}, Lcom/appsflyer/internal/AFk1wSDK;->getMonetizationNetwork(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 3
    sget p0, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    add-int/lit8 v0, p0, 0x47

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFd1oSDK;->toString:I

    rem-int/2addr v0, p1

    if-eqz v0, :cond_3

    move p2, p3

    :cond_3
    add-int/lit8 p0, p0, 0x19

    rem-int/lit16 p0, p0, 0x80

    sput p0, Lcom/appsflyer/internal/AFd1oSDK;->toString:I

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0

    :cond_4
    new-instance p1, Lcom/appsflyer/internal/AFd1pSDK;

    invoke-direct {p1}, Lcom/appsflyer/internal/AFd1pSDK;-><init>()V

    invoke-static {}, Lcom/appsflyer/internal/AFd1oSDK;->areAllFieldsValid()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p0}, Lcom/appsflyer/internal/AFd1pSDK;->getMonetizationNetwork(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method private declared-synchronized AFAdRevenueData(Lcom/appsflyer/internal/AFi1uSDK;Lcom/appsflyer/internal/AFi1uSDK;)Z
    .locals 4
    .param p1    # Lcom/appsflyer/internal/AFi1uSDK;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/appsflyer/internal/AFi1uSDK;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    monitor-enter p0

    const/4 v0, 0x0

    if-nez p1, :cond_0

    .line 18
    :try_start_0
    invoke-direct {p0}, Lcom/appsflyer/internal/AFd1oSDK;->AFKeystoreWrapper()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    monitor-exit p0

    return v0

    :catchall_0
    move-exception p1

    goto/16 :goto_1

    .line 20
    :cond_0
    :try_start_1
    invoke-virtual {p1}, Lcom/appsflyer/internal/AFi1uSDK;->getRevenue()Z

    move-result v1

    if-eqz v1, :cond_7

    .line 21
    iget-object v1, p0, Lcom/appsflyer/internal/AFd1oSDK;->component3:Lcom/appsflyer/internal/AFd1zSDK;

    invoke-interface {v1}, Lcom/appsflyer/internal/AFd1zSDK;->getCurrencyIso4217Code()Lcom/appsflyer/internal/AFc1kSDK;

    move-result-object v1

    .line 22
    iget-object v1, v1, Lcom/appsflyer/internal/AFc1kSDK;->getRevenue:Lcom/appsflyer/internal/AFc1pSDK;

    const-string v2, "appsFlyerCount"

    invoke-interface {v1, v2, v0}, Lcom/appsflyer/internal/AFc1pSDK;->AFAdRevenueData(Ljava/lang/String;I)I

    move-result v1

    .line 23
    iget v2, p1, Lcom/appsflyer/internal/AFi1uSDK;->getMediationNetwork:I

    const/4 v3, 0x1

    if-gt v1, v2, :cond_1

    .line 24
    sget v1, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    add-int/lit8 v1, v1, 0x19

    rem-int/lit16 v1, v1, 0x80

    sput v1, Lcom/appsflyer/internal/AFd1oSDK;->toString:I

    move v1, v3

    goto :goto_0

    :cond_1
    move v1, v0

    :goto_0
    xor-int/2addr v1, v3

    if-eq v1, v3, :cond_6

    .line 25
    invoke-direct {p0, p1, p2}, Lcom/appsflyer/internal/AFd1oSDK;->getCurrencyIso4217Code(Lcom/appsflyer/internal/AFi1uSDK;Lcom/appsflyer/internal/AFi1uSDK;)Z

    move-result p2

    if-nez p2, :cond_2

    .line 26
    sget p1, Lcom/appsflyer/internal/AFd1oSDK;->toString:I

    add-int/lit8 p1, p1, 0x77

    rem-int/lit16 p1, p1, 0x80

    sput p1, Lcom/appsflyer/internal/AFd1oSDK;->equals:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    monitor-exit p0

    return v0

    .line 28
    :cond_2
    :try_start_2
    iget-object p2, p1, Lcom/appsflyer/internal/AFi1uSDK;->getRevenue:Ljava/lang/String;

    .line 29
    invoke-direct {p0, p2}, Lcom/appsflyer/internal/AFd1oSDK;->getCurrencyIso4217Code(Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_3

    .line 30
    sget p1, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    add-int/lit8 p1, p1, 0xf

    rem-int/lit16 p1, p1, 0x80

    sput p1, Lcom/appsflyer/internal/AFd1oSDK;->toString:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 31
    monitor-exit p0

    return v0

    .line 32
    :cond_3
    :try_start_3
    iget-object p1, p1, Lcom/appsflyer/internal/AFi1uSDK;->component4:Ljava/lang/String;

    .line 33
    invoke-static {p1}, Lcom/appsflyer/internal/AFd1oSDK;->getMonetizationNetwork(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_5

    .line 34
    sget p1, Lcom/appsflyer/internal/AFd1oSDK;->toString:I

    add-int/lit8 p1, p1, 0x7b

    rem-int/lit16 p2, p1, 0x80

    sput p2, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    rem-int/lit8 p1, p1, 0x2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-nez p1, :cond_4

    move v0, v3

    .line 35
    :cond_4
    monitor-exit p0

    return v0

    :cond_5
    monitor-exit p0

    return v3

    :cond_6
    monitor-exit p0

    return v0

    :cond_7
    :try_start_4
    sget p1, Lcom/appsflyer/internal/AFd1oSDK;->toString:I

    add-int/lit8 p1, p1, 0x45

    rem-int/lit16 p2, p1, 0x80

    sput p2, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    rem-int/lit8 p1, p1, 0x2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-nez p1, :cond_8

    .line 36
    monitor-exit p0

    return v0

    :cond_8
    monitor-exit p0

    return v0

    .line 37
    :goto_1
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw p1
.end method

.method private AFInAppEventParameterName()Z
    .locals 3

    .line 1
    .line 2
    sget v0, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x33

    .line 5
    .line 6
    rem-int/lit16 v1, v0, 0x80

    .line 7
    .line 8
    sput v1, Lcom/appsflyer/internal/AFd1oSDK;->toString:I

    .line 9
    .line 10
    rem-int/lit8 v0, v0, 0x2

    .line 11
    .line 12
    const-string v1, "participantInProxy"

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lcom/appsflyer/internal/AFd1oSDK;->component3:Lcom/appsflyer/internal/AFd1zSDK;

    .line 17
    .line 18
    .line 19
    invoke-interface {v0}, Lcom/appsflyer/internal/AFd1zSDK;->component4()Lcom/appsflyer/internal/AFc1pSDK;

    .line 20
    move-result-object v0

    .line 21
    const/4 v2, 0x1

    .line 22
    .line 23
    .line 24
    :goto_0
    invoke-interface {v0, v1, v2}, Lcom/appsflyer/internal/AFc1pSDK;->getMonetizationNetwork(Ljava/lang/String;Z)Z

    .line 25
    move-result v0

    .line 26
    goto :goto_1

    .line 27
    .line 28
    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFd1oSDK;->component3:Lcom/appsflyer/internal/AFd1zSDK;

    .line 29
    .line 30
    .line 31
    invoke-interface {v0}, Lcom/appsflyer/internal/AFd1zSDK;->component4()Lcom/appsflyer/internal/AFc1pSDK;

    .line 32
    move-result-object v0

    .line 33
    const/4 v2, 0x0

    .line 34
    goto :goto_0

    .line 35
    .line 36
    :goto_1
    sget v1, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    .line 37
    .line 38
    add-int/lit8 v1, v1, 0x17

    .line 39
    .line 40
    rem-int/lit16 v1, v1, 0x80

    .line 41
    .line 42
    sput v1, Lcom/appsflyer/internal/AFd1oSDK;->toString:I

    .line 43
    return v0
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

.method private AFKeystoreWrapper()V
    .locals 2

    .line 1
    .line 2
    sget v0, Lcom/appsflyer/internal/AFd1oSDK;->toString:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x23

    .line 5
    .line 6
    rem-int/lit16 v1, v0, 0x80

    .line 7
    .line 8
    sput v1, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    .line 9
    .line 10
    rem-int/lit8 v0, v0, 0x2

    .line 11
    .line 12
    const-string v1, "participantInProxy"

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lcom/appsflyer/internal/AFd1oSDK;->component3:Lcom/appsflyer/internal/AFd1zSDK;

    .line 17
    .line 18
    .line 19
    invoke-interface {v0}, Lcom/appsflyer/internal/AFd1zSDK;->component4()Lcom/appsflyer/internal/AFc1pSDK;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    .line 23
    invoke-interface {v0, v1}, Lcom/appsflyer/internal/AFc1pSDK;->getRevenue(Ljava/lang/String;)V

    .line 24
    return-void

    .line 25
    .line 26
    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFd1oSDK;->component3:Lcom/appsflyer/internal/AFd1zSDK;

    .line 27
    .line 28
    .line 29
    invoke-interface {v0}, Lcom/appsflyer/internal/AFd1zSDK;->component4()Lcom/appsflyer/internal/AFc1pSDK;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    .line 33
    invoke-interface {v0, v1}, Lcom/appsflyer/internal/AFc1pSDK;->getRevenue(Ljava/lang/String;)V

    .line 34
    const/4 v0, 0x0

    .line 35
    throw v0
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
.end method

.method private static a(Ljava/lang/String;Ljava/lang/String;[II[Ljava/lang/Object;)V
    .locals 10

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    const-string v0, "ISO-8859-1"

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 8
    move-result-object p1

    .line 9
    .line 10
    :cond_0
    check-cast p1, [B

    .line 11
    .line 12
    if-eqz p0, :cond_1

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    .line 16
    move-result-object p0

    .line 17
    .line 18
    :cond_1
    check-cast p0, [C

    .line 19
    .line 20
    new-instance v0, Lcom/appsflyer/internal/AFk1jSDK;

    .line 21
    .line 22
    .line 23
    invoke-direct {v0}, Lcom/appsflyer/internal/AFk1jSDK;-><init>()V

    .line 24
    .line 25
    sget-object v1, Lcom/appsflyer/internal/AFd1oSDK;->component2:[C

    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    const-wide v2, 0x19569dd871fb8d0aL

    .line 31
    const/4 v4, 0x0

    .line 32
    .line 33
    if-eqz v1, :cond_4

    .line 34
    .line 35
    sget v5, Lcom/appsflyer/internal/AFd1oSDK;->$11:I

    .line 36
    .line 37
    add-int/lit8 v5, v5, 0x7b

    .line 38
    .line 39
    rem-int/lit16 v6, v5, 0x80

    .line 40
    .line 41
    sput v6, Lcom/appsflyer/internal/AFd1oSDK;->$10:I

    .line 42
    .line 43
    rem-int/lit8 v5, v5, 0x2

    .line 44
    .line 45
    if-eqz v5, :cond_2

    .line 46
    array-length v5, v1

    .line 47
    .line 48
    new-array v6, v5, [C

    .line 49
    const/4 v7, 0x1

    .line 50
    goto :goto_0

    .line 51
    :cond_2
    array-length v5, v1

    .line 52
    .line 53
    new-array v6, v5, [C

    .line 54
    move v7, v4

    .line 55
    .line 56
    :goto_0
    if-ge v7, v5, :cond_3

    .line 57
    .line 58
    aget-char v8, v1, v7

    .line 59
    int-to-long v8, v8

    .line 60
    xor-long/2addr v8, v2

    .line 61
    long-to-int v8, v8

    .line 62
    int-to-char v8, v8

    .line 63
    .line 64
    aput-char v8, v6, v7

    .line 65
    .line 66
    add-int/lit8 v7, v7, 0x1

    .line 67
    goto :goto_0

    .line 68
    :cond_3
    move-object v1, v6

    .line 69
    .line 70
    :cond_4
    sget v5, Lcom/appsflyer/internal/AFd1oSDK;->hashCode:I

    .line 71
    int-to-long v5, v5

    .line 72
    xor-long/2addr v2, v5

    .line 73
    long-to-int v2, v2

    .line 74
    .line 75
    sget-boolean v3, Lcom/appsflyer/internal/AFd1oSDK;->copy:Z

    .line 76
    .line 77
    if-eqz v3, :cond_6

    .line 78
    array-length p0, p1

    .line 79
    .line 80
    iput p0, v0, Lcom/appsflyer/internal/AFk1jSDK;->getRevenue:I

    .line 81
    .line 82
    new-array p0, p0, [C

    .line 83
    .line 84
    iput v4, v0, Lcom/appsflyer/internal/AFk1jSDK;->getMonetizationNetwork:I

    .line 85
    .line 86
    :goto_1
    iget p2, v0, Lcom/appsflyer/internal/AFk1jSDK;->getMonetizationNetwork:I

    .line 87
    .line 88
    iget v3, v0, Lcom/appsflyer/internal/AFk1jSDK;->getRevenue:I

    .line 89
    .line 90
    if-ge p2, v3, :cond_5

    .line 91
    .line 92
    add-int/lit8 v3, v3, -0x1

    .line 93
    sub-int/2addr v3, p2

    .line 94
    .line 95
    aget-byte v3, p1, v3

    .line 96
    add-int/2addr v3, p3

    .line 97
    .line 98
    aget-char v3, v1, v3

    .line 99
    sub-int/2addr v3, v2

    .line 100
    int-to-char v3, v3

    .line 101
    .line 102
    aput-char v3, p0, p2

    .line 103
    .line 104
    add-int/lit8 p2, p2, 0x1

    .line 105
    .line 106
    iput p2, v0, Lcom/appsflyer/internal/AFk1jSDK;->getMonetizationNetwork:I

    .line 107
    goto :goto_1

    .line 108
    .line 109
    :cond_5
    new-instance p1, Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    invoke-direct {p1, p0}, Ljava/lang/String;-><init>([C)V

    .line 113
    .line 114
    sget p0, Lcom/appsflyer/internal/AFd1oSDK;->$10:I

    .line 115
    .line 116
    add-int/lit8 p0, p0, 0x41

    .line 117
    .line 118
    rem-int/lit16 p0, p0, 0x80

    .line 119
    .line 120
    sput p0, Lcom/appsflyer/internal/AFd1oSDK;->$11:I

    .line 121
    .line 122
    aput-object p1, p4, v4

    .line 123
    return-void

    .line 124
    .line 125
    :cond_6
    sget-boolean p1, Lcom/appsflyer/internal/AFd1oSDK;->copydefault:Z

    .line 126
    .line 127
    if-eqz p1, :cond_9

    .line 128
    array-length p1, p0

    .line 129
    .line 130
    iput p1, v0, Lcom/appsflyer/internal/AFk1jSDK;->getRevenue:I

    .line 131
    .line 132
    new-array p1, p1, [C

    .line 133
    .line 134
    iput v4, v0, Lcom/appsflyer/internal/AFk1jSDK;->getMonetizationNetwork:I

    .line 135
    .line 136
    sget p2, Lcom/appsflyer/internal/AFd1oSDK;->$11:I

    .line 137
    .line 138
    add-int/lit8 p2, p2, 0x2b

    .line 139
    .line 140
    rem-int/lit16 p2, p2, 0x80

    .line 141
    .line 142
    sput p2, Lcom/appsflyer/internal/AFd1oSDK;->$10:I

    .line 143
    .line 144
    :goto_2
    iget p2, v0, Lcom/appsflyer/internal/AFk1jSDK;->getMonetizationNetwork:I

    .line 145
    .line 146
    iget v3, v0, Lcom/appsflyer/internal/AFk1jSDK;->getRevenue:I

    .line 147
    .line 148
    if-ge p2, v3, :cond_8

    .line 149
    .line 150
    sget v5, Lcom/appsflyer/internal/AFd1oSDK;->$10:I

    .line 151
    .line 152
    add-int/lit8 v5, v5, 0x9

    .line 153
    .line 154
    rem-int/lit16 v6, v5, 0x80

    .line 155
    .line 156
    sput v6, Lcom/appsflyer/internal/AFd1oSDK;->$11:I

    .line 157
    .line 158
    rem-int/lit8 v5, v5, 0x2

    .line 159
    .line 160
    if-nez v5, :cond_7

    .line 161
    .line 162
    div-int/lit8 v3, v3, 0x0

    .line 163
    div-int/2addr v3, p2

    .line 164
    .line 165
    aget-char v3, p0, v3

    .line 166
    shl-int/2addr v3, p3

    .line 167
    .line 168
    aget-char v3, v1, v3

    .line 169
    div-int/2addr v3, v2

    .line 170
    int-to-char v3, v3

    .line 171
    .line 172
    aput-char v3, p1, p2

    .line 173
    .line 174
    :goto_3
    iput p2, v0, Lcom/appsflyer/internal/AFk1jSDK;->getMonetizationNetwork:I

    .line 175
    goto :goto_2

    .line 176
    .line 177
    :cond_7
    add-int/lit8 v3, v3, -0x1

    .line 178
    sub-int/2addr v3, p2

    .line 179
    .line 180
    aget-char v3, p0, v3

    .line 181
    sub-int/2addr v3, p3

    .line 182
    .line 183
    aget-char v3, v1, v3

    .line 184
    sub-int/2addr v3, v2

    .line 185
    int-to-char v3, v3

    .line 186
    .line 187
    aput-char v3, p1, p2

    .line 188
    .line 189
    add-int/lit8 p2, p2, 0x1

    .line 190
    goto :goto_3

    .line 191
    .line 192
    :cond_8
    new-instance p0, Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    invoke-direct {p0, p1}, Ljava/lang/String;-><init>([C)V

    .line 196
    .line 197
    aput-object p0, p4, v4

    .line 198
    return-void

    .line 199
    :cond_9
    array-length p0, p2

    .line 200
    .line 201
    iput p0, v0, Lcom/appsflyer/internal/AFk1jSDK;->getRevenue:I

    .line 202
    .line 203
    new-array p0, p0, [C

    .line 204
    .line 205
    iput v4, v0, Lcom/appsflyer/internal/AFk1jSDK;->getMonetizationNetwork:I

    .line 206
    .line 207
    :goto_4
    iget p1, v0, Lcom/appsflyer/internal/AFk1jSDK;->getMonetizationNetwork:I

    .line 208
    .line 209
    iget v3, v0, Lcom/appsflyer/internal/AFk1jSDK;->getRevenue:I

    .line 210
    .line 211
    if-ge p1, v3, :cond_a

    .line 212
    .line 213
    add-int/lit8 v3, v3, -0x1

    .line 214
    sub-int/2addr v3, p1

    .line 215
    .line 216
    aget v3, p2, v3

    .line 217
    sub-int/2addr v3, p3

    .line 218
    .line 219
    aget-char v3, v1, v3

    .line 220
    sub-int/2addr v3, v2

    .line 221
    int-to-char v3, v3

    .line 222
    .line 223
    aput-char v3, p0, p1

    .line 224
    .line 225
    add-int/lit8 p1, p1, 0x1

    .line 226
    .line 227
    iput p1, v0, Lcom/appsflyer/internal/AFk1jSDK;->getMonetizationNetwork:I

    .line 228
    goto :goto_4

    .line 229
    .line 230
    :cond_a
    new-instance p1, Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    invoke-direct {p1, p0}, Ljava/lang/String;-><init>([C)V

    .line 234
    .line 235
    aput-object p1, p4, v4

    .line 236
    return-void
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
.end method

.method private static areAllFieldsValid()Ljava/lang/String;
    .locals 2
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    .line 1
    .line 2
    sget v0, Lcom/appsflyer/internal/AFd1oSDK;->toString:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x4d

    .line 5
    .line 6
    rem-int/lit16 v1, v0, 0x80

    .line 7
    .line 8
    sput v1, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    .line 9
    .line 10
    rem-int/lit8 v0, v0, 0x2

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const-string v0, "6.17.4"

    .line 15
    return-object v0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    throw v0
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public static component1()V
    .locals 1

    .line 1
    const/4 v0, 0x5

    .line 2
    .line 3
    new-array v0, v0, [C

    .line 4
    .line 5
    .line 6
    fill-array-data v0, :array_0

    .line 7
    .line 8
    sput-object v0, Lcom/appsflyer/internal/AFd1oSDK;->component2:[C

    .line 9
    .line 10
    .line 11
    const v0, 0x71fb8d8c

    .line 12
    .line 13
    sput v0, Lcom/appsflyer/internal/AFd1oSDK;->hashCode:I

    .line 14
    const/4 v0, 0x1

    .line 15
    .line 16
    sput-boolean v0, Lcom/appsflyer/internal/AFd1oSDK;->copydefault:Z

    .line 17
    .line 18
    sput-boolean v0, Lcom/appsflyer/internal/AFd1oSDK;->copy:Z

    .line 19
    return-void

    .line 20
    nop

    .line 21
    .line 22
    :array_0
    .array-data 2
        -0x721es
        -0x720es
        -0x7213s
        -0x7202s
        -0x7220s
    .end array-data
.end method

.method private declared-synchronized component2()V
    .locals 8

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    sget v0, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    .line 4
    .line 5
    add-int/lit8 v0, v0, 0x35

    .line 6
    .line 7
    rem-int/lit16 v0, v0, 0x80

    .line 8
    .line 9
    sput v0, Lcom/appsflyer/internal/AFd1oSDK;->toString:I

    .line 10
    .line 11
    iget-boolean v0, p0, Lcom/appsflyer/internal/AFd1oSDK;->component1:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    monitor-exit p0

    .line 15
    return-void

    .line 16
    :cond_0
    const/4 v0, 0x1

    .line 17
    .line 18
    :try_start_1
    iput-boolean v0, p0, Lcom/appsflyer/internal/AFd1oSDK;->component1:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 19
    .line 20
    :try_start_2
    const-string v0, "r_debugging_on"

    .line 21
    .line 22
    new-instance v1, Ljava/text/SimpleDateFormat;

    .line 23
    .line 24
    .line 25
    const-string/jumbo v2, "yyyy-MM-dd HH:mm:ssZ"

    .line 26
    .line 27
    sget-object v3, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 28
    .line 29
    .line 30
    invoke-direct {v1, v2, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 31
    .line 32
    .line 33
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 34
    move-result-wide v2

    .line 35
    .line 36
    .line 37
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 38
    move-result-object v2

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, v2}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    .line 42
    move-result-object v1

    .line 43
    const/4 v2, 0x0

    .line 44
    .line 45
    new-array v2, v2, [Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    invoke-direct {p0, v0, v1, v2}, Lcom/appsflyer/internal/AFd1oSDK;->getMonetizationNetwork(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 49
    .line 50
    :try_start_3
    sget v0, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    .line 51
    .line 52
    add-int/lit8 v0, v0, 0x3b

    .line 53
    .line 54
    rem-int/lit16 v0, v0, 0x80

    .line 55
    .line 56
    sput v0, Lcom/appsflyer/internal/AFd1oSDK;->toString:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 57
    monitor-exit p0

    .line 58
    return-void

    .line 59
    :catchall_0
    move-exception v0

    .line 60
    goto :goto_0

    .line 61
    :catchall_1
    move-exception v0

    .line 62
    move-object v4, v0

    .line 63
    .line 64
    :try_start_4
    sget-object v1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 65
    .line 66
    sget-object v2, Lcom/appsflyer/internal/AFh1ySDK;->afLogForce:Lcom/appsflyer/internal/AFh1ySDK;

    .line 67
    .line 68
    const-string v3, "Error while starting remote debugger"

    .line 69
    const/4 v6, 0x1

    .line 70
    const/4 v7, 0x1

    .line 71
    const/4 v5, 0x1

    .line 72
    .line 73
    .line 74
    invoke-virtual/range {v1 .. v7}, Lcom/appsflyer/internal/AFg1bSDK;->e(Lcom/appsflyer/internal/AFh1ySDK;Ljava/lang/String;Ljava/lang/Throwable;ZZZ)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 75
    monitor-exit p0

    .line 76
    return-void

    .line 77
    :goto_0
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 78
    throw v0
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

.method private component3()F
    .locals 2
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    .line 1
    .line 2
    sget v0, Lcom/appsflyer/internal/AFd1oSDK;->toString:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x2b

    .line 5
    .line 6
    rem-int/lit16 v1, v0, 0x80

    .line 7
    .line 8
    sput v1, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    .line 9
    .line 10
    rem-int/lit8 v0, v0, 0x2

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lcom/appsflyer/internal/AFd1oSDK;->areAllFieldsValid:Ljava/security/SecureRandom;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/util/Random;->nextFloat()F

    .line 18
    move-result v0

    .line 19
    .line 20
    const/16 v1, 0xc

    .line 21
    .line 22
    div-int/lit8 v1, v1, 0x0

    .line 23
    return v0

    .line 24
    .line 25
    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFd1oSDK;->areAllFieldsValid:Ljava/security/SecureRandom;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/util/Random;->nextFloat()F

    .line 29
    move-result v0

    .line 30
    return v0
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
.end method

.method private declared-synchronized copy()Ljava/util/Map;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    sget v0, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    .line 4
    .line 5
    add-int/lit8 v0, v0, 0x79

    .line 6
    .line 7
    rem-int/lit16 v1, v0, 0x80

    .line 8
    .line 9
    sput v1, Lcom/appsflyer/internal/AFd1oSDK;->toString:I

    .line 10
    .line 11
    rem-int/lit8 v0, v0, 0x2

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lcom/appsflyer/internal/AFd1oSDK;->getCurrencyIso4217Code:Ljava/util/Map;

    .line 16
    .line 17
    const-string v1, "data"

    .line 18
    .line 19
    iget-object v2, p0, Lcom/appsflyer/internal/AFd1oSDK;->getRevenue:Ljava/util/List;

    .line 20
    .line 21
    .line 22
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    invoke-direct {p0}, Lcom/appsflyer/internal/AFd1oSDK;->equals()V

    .line 26
    .line 27
    iget-object v0, p0, Lcom/appsflyer/internal/AFd1oSDK;->getCurrencyIso4217Code:Ljava/util/Map;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 28
    .line 29
    const/16 v1, 0x8

    .line 30
    .line 31
    :try_start_1
    div-int/lit8 v1, v1, 0x0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception v0

    .line 34
    :try_start_2
    throw v0

    .line 35
    :catchall_1
    move-exception v0

    .line 36
    goto :goto_1

    .line 37
    .line 38
    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFd1oSDK;->getCurrencyIso4217Code:Ljava/util/Map;

    .line 39
    .line 40
    const-string v1, "data"

    .line 41
    .line 42
    iget-object v2, p0, Lcom/appsflyer/internal/AFd1oSDK;->getRevenue:Ljava/util/List;

    .line 43
    .line 44
    .line 45
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    invoke-direct {p0}, Lcom/appsflyer/internal/AFd1oSDK;->equals()V

    .line 49
    .line 50
    iget-object v0, p0, Lcom/appsflyer/internal/AFd1oSDK;->getCurrencyIso4217Code:Ljava/util/Map;

    .line 51
    .line 52
    :goto_0
    sget v1, Lcom/appsflyer/internal/AFd1oSDK;->toString:I

    .line 53
    .line 54
    add-int/lit8 v1, v1, 0x27

    .line 55
    .line 56
    rem-int/lit16 v2, v1, 0x80

    .line 57
    .line 58
    sput v2, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    .line 59
    .line 60
    rem-int/lit8 v1, v1, 0x2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 61
    .line 62
    if-eqz v1, :cond_1

    .line 63
    monitor-exit p0

    .line 64
    return-object v0

    .line 65
    :cond_1
    const/4 v0, 0x0

    .line 66
    :try_start_3
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 67
    :catchall_2
    move-exception v0

    .line 68
    :try_start_4
    throw v0

    .line 69
    :goto_1
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 70
    throw v0
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

.method private copydefault()Z
    .locals 3

    .line 1
    .line 2
    sget v0, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x5f

    .line 5
    .line 6
    rem-int/lit16 v0, v0, 0x80

    .line 7
    .line 8
    sput v0, Lcom/appsflyer/internal/AFd1oSDK;->toString:I

    .line 9
    .line 10
    iget-boolean v1, p0, Lcom/appsflyer/internal/AFd1oSDK;->component4:Z

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    goto :goto_0

    .line 14
    .line 15
    :cond_0
    iget-boolean v1, p0, Lcom/appsflyer/internal/AFd1oSDK;->getMediationNetwork:Z

    .line 16
    const/4 v2, 0x1

    .line 17
    .line 18
    if-eq v1, v2, :cond_2

    .line 19
    .line 20
    add-int/lit8 v1, v0, 0x71

    .line 21
    .line 22
    rem-int/lit16 v1, v1, 0x80

    .line 23
    .line 24
    sput v1, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    .line 25
    .line 26
    iget-boolean v1, p0, Lcom/appsflyer/internal/AFd1oSDK;->component1:Z

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    goto :goto_1

    .line 30
    .line 31
    :cond_1
    :goto_0
    add-int/lit8 v0, v0, 0x2f

    .line 32
    .line 33
    rem-int/lit16 v0, v0, 0x80

    .line 34
    .line 35
    sput v0, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    .line 36
    const/4 v0, 0x0

    .line 37
    return v0

    .line 38
    :cond_2
    :goto_1
    return v2
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
.end method

.method private declared-synchronized equals()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    iput-object v0, p0, Lcom/appsflyer/internal/AFd1oSDK;->getRevenue:Ljava/util/List;

    .line 9
    const/4 v0, 0x0

    .line 10
    .line 11
    iput v0, p0, Lcom/appsflyer/internal/AFd1oSDK;->getMonetizationNetwork:I

    .line 12
    .line 13
    sget v0, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    .line 14
    .line 15
    add-int/lit8 v0, v0, 0x29

    .line 16
    .line 17
    rem-int/lit16 v0, v0, 0x80

    .line 18
    .line 19
    sput v0, Lcom/appsflyer/internal/AFd1oSDK;->toString:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    monitor-exit p0

    .line 21
    return-void

    .line 22
    :catchall_0
    move-exception v0

    .line 23
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

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

.method private static synthetic getCurrencyIso4217Code([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    const/4 v0, 0x0

    aget-object v1, p0, v0

    check-cast v1, Lcom/appsflyer/internal/AFd1oSDK;

    const/4 v2, 0x1

    aget-object v2, p0, v2

    check-cast v2, Ljava/lang/String;

    const/4 v3, 0x2

    aget-object v4, p0, v3

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    const/4 v5, 0x3

    aget-object p0, p0, v5

    check-cast p0, Ljava/lang/String;

    .line 26
    sget v6, Lcom/appsflyer/internal/AFd1oSDK;->toString:I

    add-int/lit8 v6, v6, 0x65

    rem-int/lit16 v6, v6, 0x80

    sput v6, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    .line 27
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    filled-new-array {v4, p0}, [Ljava/lang/String;

    move-result-object p0

    const-string/jumbo v4, "server_response"

    invoke-direct {v1, v4, v2, p0}, Lcom/appsflyer/internal/AFd1oSDK;->getMonetizationNetwork(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 28
    sget p0, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    add-int/2addr p0, v5

    rem-int/lit16 v1, p0, 0x80

    sput v1, Lcom/appsflyer/internal/AFd1oSDK;->toString:I

    rem-int/2addr p0, v3

    const/4 v1, 0x0

    if-eqz p0, :cond_0

    const/16 p0, 0x2a

    div-int/2addr p0, v0

    :cond_0
    return-object v1
.end method

.method private declared-synchronized getCurrencyIso4217Code(Ljava/lang/String;Lcom/appsflyer/internal/AFf1fSDK;Lcom/appsflyer/internal/AFc1iSDK;)V
    .locals 6

    monitor-enter p0

    .line 42
    :try_start_0
    invoke-static {}, Lcom/appsflyer/AppsFlyerProperties;->getInstance()Lcom/appsflyer/AppsFlyerProperties;

    move-result-object v0

    .line 43
    const-string v1, "remote_debug_static_data"

    .line 44
    invoke-virtual {v0, v1}, Lcom/appsflyer/AppsFlyerProperties;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 45
    iget-object v3, p0, Lcom/appsflyer/internal/AFd1oSDK;->getCurrencyIso4217Code:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_0

    .line 46
    :try_start_1
    iget-object p1, p0, Lcom/appsflyer/internal/AFd1oSDK;->getCurrencyIso4217Code:Ljava/util/Map;

    new-instance p2, Lorg/json/JSONObject;

    invoke-direct {p2, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-static {p2}, Lcom/appsflyer/internal/AFg1gSDK;->getMediationNetwork(Lorg/json/JSONObject;)Ljava/util/Map;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/Map;->putAll(Ljava/util/Map;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 47
    :try_start_2
    sget p1, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    add-int/lit8 p1, p1, 0x61

    rem-int/lit16 p1, p1, 0x80

    sput p1, Lcom/appsflyer/internal/AFd1oSDK;->toString:I

    goto/16 :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_1

    .line 48
    :cond_0
    iget-object v2, p0, Lcom/appsflyer/internal/AFd1oSDK;->component3:Lcom/appsflyer/internal/AFd1zSDK;

    invoke-interface {v2}, Lcom/appsflyer/internal/AFd1zSDK;->getCurrencyIso4217Code()Lcom/appsflyer/internal/AFc1kSDK;

    move-result-object v2

    invoke-virtual {v2}, Lcom/appsflyer/internal/AFc1kSDK;->areAllFieldsValid()Ljava/lang/String;

    move-result-object v2

    .line 49
    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {p2}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p2

    const v4, -0x26378c9

    const v5, 0x26378c9

    invoke-static {v3, v4, v5, p2}, Lcom/appsflyer/internal/AFf1fSDK;->AFAdRevenueData([Ljava/lang/Object;III)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    .line 50
    iget-object p3, p3, Lcom/appsflyer/internal/AFc1iSDK;->getMediationNetwork:Ljava/lang/String;

    .line 51
    invoke-direct {p0, v2, p2, p3}, Lcom/appsflyer/internal/AFd1oSDK;->getMediationNetwork(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "6.17.4."

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object p3, Lcom/appsflyer/internal/AFa1ySDK;->getMonetizationNetwork:Ljava/lang/String;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    iget-object p3, p0, Lcom/appsflyer/internal/AFd1oSDK;->component3:Lcom/appsflyer/internal/AFd1zSDK;

    .line 53
    invoke-interface {p3}, Lcom/appsflyer/internal/AFd1zSDK;->AFKeystoreWrapper()Lcom/appsflyer/internal/AFf1fSDK;

    move-result-object p3

    invoke-virtual {p3}, Lcom/appsflyer/internal/AFf1fSDK;->getMonetizationNetwork()Ljava/lang/String;

    move-result-object p3

    const-string v2, "KSAppsFlyerId"

    .line 54
    invoke-virtual {v0, v2}, Lcom/appsflyer/AppsFlyerProperties;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/appsflyer/internal/AFd1oSDK;->component3:Lcom/appsflyer/internal/AFd1zSDK;

    .line 55
    invoke-interface {v3}, Lcom/appsflyer/internal/AFd1zSDK;->getCurrencyIso4217Code()Lcom/appsflyer/internal/AFc1kSDK;

    move-result-object v3

    .line 56
    iget-object v3, v3, Lcom/appsflyer/internal/AFc1kSDK;->getRevenue:Lcom/appsflyer/internal/AFc1pSDK;

    invoke-static {v3}, Lcom/appsflyer/internal/AFb1mSDK;->getRevenue(Lcom/appsflyer/internal/AFc1pSDK;)Ljava/lang/String;

    move-result-object v3

    .line 57
    invoke-direct {p0, p2, p3, v2, v3}, Lcom/appsflyer/internal/AFd1oSDK;->getCurrencyIso4217Code(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 58
    :try_start_3
    iget-object p2, p0, Lcom/appsflyer/internal/AFd1oSDK;->component3:Lcom/appsflyer/internal/AFd1zSDK;

    invoke-interface {p2}, Lcom/appsflyer/internal/AFd1zSDK;->getCurrencyIso4217Code()Lcom/appsflyer/internal/AFc1kSDK;

    move-result-object p2

    .line 59
    invoke-virtual {p2}, Lcom/appsflyer/internal/AFc1kSDK;->n_()Landroid/content/pm/PackageInfo;

    move-result-object p2

    iget p2, p2, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 60
    const-string p3, "channel"

    invoke-virtual {v0, p3}, Lcom/appsflyer/AppsFlyerProperties;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    .line 61
    const-string v2, "preInstallName"

    invoke-virtual {v0, v2}, Lcom/appsflyer/AppsFlyerProperties;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 62
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p1, p2, p3, v2}, Lcom/appsflyer/internal/AFd1oSDK;->getRevenue(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 63
    :try_start_4
    sget p1, Lcom/appsflyer/internal/AFd1oSDK;->toString:I

    add-int/lit8 p1, p1, 0xd

    rem-int/lit16 p1, p1, 0x80

    sput p1, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    .line 64
    :catchall_1
    new-instance p1, Lorg/json/JSONObject;

    iget-object p2, p0, Lcom/appsflyer/internal/AFd1oSDK;->getCurrencyIso4217Code:Ljava/util/Map;

    invoke-direct {p1, p2}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lcom/appsflyer/AppsFlyerProperties;->set(Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    :catchall_2
    :goto_0
    iget-object p1, p0, Lcom/appsflyer/internal/AFd1oSDK;->getCurrencyIso4217Code:Ljava/util/Map;

    const-string p2, "launch_counter"

    iget-object p3, p0, Lcom/appsflyer/internal/AFd1oSDK;->component3:Lcom/appsflyer/internal/AFd1zSDK;

    invoke-interface {p3}, Lcom/appsflyer/internal/AFd1zSDK;->getCurrencyIso4217Code()Lcom/appsflyer/internal/AFc1kSDK;

    move-result-object p3

    .line 66
    iget-object p3, p3, Lcom/appsflyer/internal/AFc1kSDK;->getRevenue:Lcom/appsflyer/internal/AFc1pSDK;

    const-string v0, "appsFlyerCount"

    const/4 v1, 0x0

    invoke-interface {p3, v0, v1}, Lcom/appsflyer/internal/AFc1pSDK;->AFAdRevenueData(Ljava/lang/String;I)I

    move-result p3

    .line 67
    invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p3

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 68
    monitor-exit p0

    return-void

    :goto_1
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw p1
.end method

.method private declared-synchronized getCurrencyIso4217Code(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    monitor-enter p0

    .line 29
    :try_start_0
    sget v0, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    add-int/lit8 v0, v0, 0xb

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1oSDK;->toString:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    :try_start_1
    iget-object v0, p0, Lcom/appsflyer/internal/AFd1oSDK;->getCurrencyIso4217Code:Ljava/util/Map;

    const-string v1, "sdk_version"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p2, :cond_1

    .line 31
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-lez p1, :cond_1

    .line 32
    :try_start_2
    sget p1, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    add-int/lit8 p1, p1, 0x67

    rem-int/lit16 v0, p1, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1oSDK;->toString:I

    rem-int/lit8 p1, p1, 0x2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz p1, :cond_0

    .line 33
    :try_start_3
    iget-object p1, p0, Lcom/appsflyer/internal/AFd1oSDK;->getCurrencyIso4217Code:Ljava/util/Map;

    const-string v0, "devkey"

    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 p1, 0x32

    .line 34
    div-int/lit8 p1, p1, 0x0

    goto :goto_0

    .line 35
    :cond_0
    iget-object p1, p0, Lcom/appsflyer/internal/AFd1oSDK;->getCurrencyIso4217Code:Ljava/util/Map;

    const-string v0, "devkey"

    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    :goto_0
    if-eqz p3, :cond_2

    .line 36
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_2

    .line 37
    iget-object p1, p0, Lcom/appsflyer/internal/AFd1oSDK;->getCurrencyIso4217Code:Ljava/util/Map;

    const-string p2, "originalAppsFlyerId"

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    if-eqz p4, :cond_3

    .line 38
    invoke-virtual {p4}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_3

    .line 39
    iget-object p1, p0, Lcom/appsflyer/internal/AFd1oSDK;->getCurrencyIso4217Code:Ljava/util/Map;

    const-string/jumbo p2, "uid"

    invoke-interface {p1, p2, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 40
    :cond_3
    monitor-exit p0

    return-void

    .line 41
    :catchall_1
    monitor-exit p0

    return-void

    :goto_1
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw p1
.end method

.method private getCurrencyIso4217Code(Z)V
    .locals 2

    .line 83
    sget v0, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    add-int/lit8 v0, v0, 0x73

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1oSDK;->toString:I

    .line 84
    iget-object v0, p0, Lcom/appsflyer/internal/AFd1oSDK;->component3:Lcom/appsflyer/internal/AFd1zSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFd1zSDK;->component4()Lcom/appsflyer/internal/AFc1pSDK;

    move-result-object v0

    const-string v1, "participantInProxy"

    invoke-interface {v0, v1, p1}, Lcom/appsflyer/internal/AFc1pSDK;->getRevenue(Ljava/lang/String;Z)V

    .line 85
    sget p1, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    add-int/lit8 p1, p1, 0x1d

    rem-int/lit16 p1, p1, 0x80

    sput p1, Lcom/appsflyer/internal/AFd1oSDK;->toString:I

    return-void
.end method

.method private getCurrencyIso4217Code(Lcom/appsflyer/internal/AFi1uSDK;Lcom/appsflyer/internal/AFi1uSDK;)Z
    .locals 0
    .param p1    # Lcom/appsflyer/internal/AFi1uSDK;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/appsflyer/internal/AFi1uSDK;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 69
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 70
    sget p1, Lcom/appsflyer/internal/AFd1oSDK;->toString:I

    add-int/lit8 p1, p1, 0x3f

    rem-int/lit16 p2, p1, 0x80

    sput p2, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    rem-int/lit8 p1, p1, 0x2

    if-eqz p1, :cond_0

    .line 71
    invoke-direct {p0}, Lcom/appsflyer/internal/AFd1oSDK;->AFInAppEventParameterName()Z

    move-result p1

    .line 72
    sget p2, Lcom/appsflyer/internal/AFd1oSDK;->toString:I

    add-int/lit8 p2, p2, 0x45

    rem-int/lit16 p2, p2, 0x80

    sput p2, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    return p1

    .line 73
    :cond_0
    invoke-direct {p0}, Lcom/appsflyer/internal/AFd1oSDK;->AFInAppEventParameterName()Z

    const/4 p1, 0x0

    throw p1

    .line 74
    :cond_1
    iget p1, p1, Lcom/appsflyer/internal/AFi1uSDK;->getCurrencyIso4217Code:F

    .line 75
    invoke-direct {p0, p1}, Lcom/appsflyer/internal/AFd1oSDK;->getMediationNetwork(F)Z

    move-result p1

    .line 76
    invoke-direct {p0, p1}, Lcom/appsflyer/internal/AFd1oSDK;->getCurrencyIso4217Code(Z)V

    return p1
.end method

.method private getCurrencyIso4217Code(Ljava/lang/String;)Z
    .locals 2

    .line 77
    sget v0, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    add-int/lit8 v0, v0, 0x37

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFd1oSDK;->toString:I

    rem-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_1

    .line 78
    invoke-static {p1}, Lcom/appsflyer/internal/AFk1wSDK;->getMonetizationNetwork(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 79
    sget p1, Lcom/appsflyer/internal/AFd1oSDK;->toString:I

    add-int/lit8 p1, p1, 0x29

    rem-int/lit16 p1, p1, 0x80

    sput p1, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    const/4 p1, 0x1

    return p1

    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFd1oSDK;->component3:Lcom/appsflyer/internal/AFd1zSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFd1zSDK;->getCurrencyIso4217Code()Lcom/appsflyer/internal/AFc1kSDK;

    move-result-object v0

    .line 80
    invoke-virtual {v0}, Lcom/appsflyer/internal/AFc1kSDK;->n_()Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 81
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    .line 82
    sget v0, Lcom/appsflyer/internal/AFd1oSDK;->toString:I

    add-int/lit8 v0, v0, 0xd

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    return p1

    :cond_1
    invoke-static {p1}, Lcom/appsflyer/internal/AFk1wSDK;->getMonetizationNetwork(Ljava/lang/String;)Z

    const/4 p1, 0x0

    throw p1
.end method

.method private getMediationNetwork(Ljava/lang/String;)Ljava/util/Map;
    .locals 2
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 6
    sget v0, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    add-int/lit8 v0, v0, 0x1f

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFd1oSDK;->toString:I

    rem-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_0

    .line 7
    iget-object v0, p0, Lcom/appsflyer/internal/AFd1oSDK;->component3:Lcom/appsflyer/internal/AFd1zSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFd1zSDK;->AFKeystoreWrapper()Lcom/appsflyer/internal/AFf1fSDK;

    move-result-object v0

    iget-object v1, p0, Lcom/appsflyer/internal/AFd1oSDK;->component3:Lcom/appsflyer/internal/AFd1zSDK;

    invoke-interface {v1}, Lcom/appsflyer/internal/AFd1zSDK;->v()Lcom/appsflyer/internal/AFc1iSDK;

    move-result-object v1

    invoke-direct {p0, p1, v0, v1}, Lcom/appsflyer/internal/AFd1oSDK;->getCurrencyIso4217Code(Ljava/lang/String;Lcom/appsflyer/internal/AFf1fSDK;Lcom/appsflyer/internal/AFc1iSDK;)V

    .line 8
    invoke-direct {p0}, Lcom/appsflyer/internal/AFd1oSDK;->copy()Ljava/util/Map;

    move-result-object p1

    sget v0, Lcom/appsflyer/internal/AFd1oSDK;->toString:I

    add-int/lit8 v0, v0, 0x49

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    return-object p1

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFd1oSDK;->component3:Lcom/appsflyer/internal/AFd1zSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFd1zSDK;->AFKeystoreWrapper()Lcom/appsflyer/internal/AFf1fSDK;

    move-result-object v0

    iget-object v1, p0, Lcom/appsflyer/internal/AFd1oSDK;->component3:Lcom/appsflyer/internal/AFd1zSDK;

    invoke-interface {v1}, Lcom/appsflyer/internal/AFd1zSDK;->v()Lcom/appsflyer/internal/AFc1iSDK;

    move-result-object v1

    invoke-direct {p0, p1, v0, v1}, Lcom/appsflyer/internal/AFd1oSDK;->getCurrencyIso4217Code(Ljava/lang/String;Lcom/appsflyer/internal/AFf1fSDK;Lcom/appsflyer/internal/AFc1iSDK;)V

    .line 10
    invoke-direct {p0}, Lcom/appsflyer/internal/AFd1oSDK;->copy()Ljava/util/Map;

    const/4 p1, 0x0

    throw p1
.end method

.method private declared-synchronized getMediationNetwork(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    monitor-enter p0

    .line 11
    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFd1oSDK;->getCurrencyIso4217Code:Ljava/util/Map;

    const-string/jumbo v1, "\u0085\u0084\u0083\u0082\u0081"

    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    add-int/lit8 v2, v2, 0x7e

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-static {v4, v1, v4, v2, v3}, Lcom/appsflyer/internal/AFd1oSDK;->a(Ljava/lang/String;Ljava/lang/String;[II[Ljava/lang/Object;)V

    const/4 v1, 0x0

    aget-object v1, v3, v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Landroid/os/Build;->BRAND:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    iget-object v0, p0, Lcom/appsflyer/internal/AFd1oSDK;->getCurrencyIso4217Code:Ljava/util/Map;

    const-string v1, "model"

    sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    iget-object v0, p0, Lcom/appsflyer/internal/AFd1oSDK;->getCurrencyIso4217Code:Ljava/util/Map;

    const-string v1, "platform"

    const-string v2, "Android"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    iget-object v0, p0, Lcom/appsflyer/internal/AFd1oSDK;->getCurrencyIso4217Code:Ljava/util/Map;

    const-string v1, "platform_version"

    sget-object v2, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz p1, :cond_0

    .line 15
    :try_start_1
    sget v0, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    add-int/lit8 v0, v0, 0x3d

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1oSDK;->toString:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 16
    :try_start_2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 17
    iget-object v0, p0, Lcom/appsflyer/internal/AFd1oSDK;->getCurrencyIso4217Code:Ljava/util/Map;

    const-string v1, "advertiserId"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 18
    :try_start_3
    sget p1, Lcom/appsflyer/internal/AFd1oSDK;->toString:I

    add-int/lit8 p1, p1, 0x71

    rem-int/lit16 p1, p1, 0x80

    sput p1, Lcom/appsflyer/internal/AFd1oSDK;->equals:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    if-eqz p2, :cond_1

    .line 19
    :try_start_4
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_1

    .line 20
    iget-object p1, p0, Lcom/appsflyer/internal/AFd1oSDK;->getCurrencyIso4217Code:Ljava/util/Map;

    const-string v0, "imei"

    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    if-eqz p3, :cond_2

    .line 21
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    if-lez p1, :cond_2

    .line 22
    :try_start_5
    sget p1, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    add-int/lit8 p1, p1, 0x7d

    rem-int/lit16 p1, p1, 0x80

    sput p1, Lcom/appsflyer/internal/AFd1oSDK;->toString:I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 23
    :try_start_6
    iget-object p1, p0, Lcom/appsflyer/internal/AFd1oSDK;->getCurrencyIso4217Code:Ljava/util/Map;

    const-string p2, "android_id"

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_2

    .line 24
    :goto_1
    :try_start_7
    monitor-exit p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    throw p1

    .line 25
    :cond_2
    :goto_2
    monitor-exit p0

    return-void

    .line 26
    :catchall_1
    monitor-exit p0

    return-void
.end method

.method private getMediationNetwork(F)Z
    .locals 8

    .line 27
    sget v0, Lcom/appsflyer/internal/AFd1oSDK;->toString:I

    add-int/lit8 v1, v0, 0x19

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    rem-int/lit8 v1, v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    if-nez v1, :cond_0

    float-to-double v6, p1

    cmpl-double v1, v6, v4

    if-ltz v1, :cond_2

    goto :goto_0

    :cond_0
    float-to-double v6, p1

    cmpl-double v1, v6, v4

    if-ltz v1, :cond_2

    :goto_0
    add-int/lit8 v0, v0, 0x5d

    .line 28
    rem-int/lit16 p1, v0, 0x80

    sput p1, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    rem-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_1

    return v3

    :cond_1
    throw v2

    :cond_2
    float-to-double v4, p1

    const-wide/16 v6, 0x0

    cmpg-double v1, v4, v6

    const/4 v4, 0x0

    if-gtz v1, :cond_3

    add-int/lit8 v0, v0, 0x2d

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    add-int/lit8 v0, v0, 0x43

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1oSDK;->toString:I

    return v4

    .line 29
    :cond_3
    invoke-direct {p0}, Lcom/appsflyer/internal/AFd1oSDK;->component3()F

    move-result v0

    cmpg-float p1, v0, p1

    if-gtz p1, :cond_4

    return v3

    .line 30
    :cond_4
    sget p1, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    add-int/lit8 p1, p1, 0xb

    rem-int/lit16 v0, p1, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1oSDK;->toString:I

    rem-int/lit8 p1, p1, 0x2

    if-nez p1, :cond_5

    return v4

    :cond_5
    throw v2
.end method

.method private static synthetic getMonetizationNetwork([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    const/4 v0, 0x0

    aget-object v0, p0, v0

    check-cast v0, Lcom/appsflyer/internal/AFd1oSDK;

    const/4 v1, 0x1

    aget-object v2, p0, v1

    check-cast v2, Ljava/lang/String;

    const/4 v3, 0x2

    aget-object p0, p0, v3

    check-cast p0, Ljava/lang/String;

    .line 10
    sget v4, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    add-int/2addr v4, v1

    rem-int/lit16 v4, v4, 0x80

    sput v4, Lcom/appsflyer/internal/AFd1oSDK;->toString:I

    .line 11
    filled-new-array {p0}, [Ljava/lang/String;

    move-result-object p0

    const/4 v1, 0x0

    invoke-direct {v0, v1, v2, p0}, Lcom/appsflyer/internal/AFd1oSDK;->getMonetizationNetwork(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 12
    sget p0, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    add-int/lit8 p0, p0, 0x1b

    rem-int/lit16 v0, p0, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1oSDK;->toString:I

    rem-int/2addr p0, v3

    if-nez p0, :cond_0

    return-object v1

    :cond_0
    throw v1
.end method

.method private varargs declared-synchronized getMonetizationNetwork(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 4

    monitor-enter p0

    .line 13
    :try_start_0
    invoke-direct {p0}, Lcom/appsflyer/internal/AFd1oSDK;->copydefault()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    .line 14
    sget v0, Lcom/appsflyer/internal/AFd1oSDK;->toString:I

    add-int/lit8 v0, v0, 0x73

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    .line 15
    iget v0, p0, Lcom/appsflyer/internal/AFd1oSDK;->getMonetizationNetwork:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const v2, 0x18000

    if-lt v0, v2, :cond_0

    goto/16 :goto_3

    .line 16
    :cond_0
    :try_start_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 17
    const-string v0, ", "

    invoke-static {v0, p3}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    if-eqz p1, :cond_1

    .line 18
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->getId()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, " _/AppsFlyer_6.17.4 ["

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "] "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 19
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    move-result-wide v2

    invoke-virtual {p1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "/AppsFlyer_6.17.4 "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    .line 20
    :goto_0
    iget p2, p0, Lcom/appsflyer/internal/AFd1oSDK;->getMonetizationNetwork:I

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p3

    const/4 v0, 0x1

    shl-int/2addr p3, v0

    add-int/2addr p2, p3

    sget p3, Lcom/appsflyer/internal/AFd1oSDK;->AFAdRevenueData:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-le p2, p3, :cond_2

    .line 21
    :try_start_2
    sget p2, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    add-int/lit8 p2, p2, 0x39

    rem-int/lit16 p2, p2, 0x80

    sput p2, Lcom/appsflyer/internal/AFd1oSDK;->toString:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 22
    :try_start_3
    iget p2, p0, Lcom/appsflyer/internal/AFd1oSDK;->getMonetizationNetwork:I

    sub-int/2addr p3, p2

    div-int/lit8 p3, p3, 0x2

    invoke-virtual {p1, v1, p3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    move v1, v0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_4

    .line 23
    :cond_2
    :goto_1
    iget-object p2, p0, Lcom/appsflyer/internal/AFd1oSDK;->getRevenue:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 24
    iget p2, p0, Lcom/appsflyer/internal/AFd1oSDK;->getMonetizationNetwork:I

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    shl-int/2addr p1, v0

    add-int/2addr p2, p1

    iput p2, p0, Lcom/appsflyer/internal/AFd1oSDK;->getMonetizationNetwork:I

    if-nez v1, :cond_3

    goto :goto_2

    .line 25
    :cond_3
    iget-object p1, p0, Lcom/appsflyer/internal/AFd1oSDK;->getRevenue:Ljava/util/List;

    const-string p2, "+~+~ The limit has been exceeded, and no more data is available. +~+~"

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 26
    iget p1, p0, Lcom/appsflyer/internal/AFd1oSDK;->getMonetizationNetwork:I

    add-int/lit16 p1, p1, 0x8a

    iput p1, p0, Lcom/appsflyer/internal/AFd1oSDK;->getMonetizationNetwork:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 27
    :goto_2
    monitor-exit p0

    return-void

    .line 28
    :catchall_1
    monitor-exit p0

    return-void

    :cond_4
    :goto_3
    :try_start_4
    sget p1, Lcom/appsflyer/internal/AFd1oSDK;->toString:I

    add-int/lit8 p1, p1, 0x11

    rem-int/lit16 p2, p1, 0x80

    sput p2, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    rem-int/lit8 p1, p1, 0x2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-nez p1, :cond_5

    const/16 p1, 0x23

    :try_start_5
    div-int/2addr p1, v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    monitor-exit p0

    return-void

    :catchall_2
    move-exception p1

    :try_start_6
    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :cond_5
    monitor-exit p0

    return-void

    :goto_4
    :try_start_7
    monitor-exit p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    throw p1
.end method

.method private static getMonetizationNetwork(Ljava/lang/String;)Z
    .locals 3

    .line 38
    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    long-to-int v0, v0

    const v1, 0x72c57f70

    const v2, -0x72c57f6f

    invoke-static {p0, v1, v2, v0}, Lcom/appsflyer/internal/AFd1oSDK;->AFAdRevenueData([Ljava/lang/Object;III)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static getMonetizationNetwork(Ljava/lang/String;[Ljava/lang/StackTraceElement;)[Ljava/lang/String;
    .locals 4

    .line 29
    sget v0, Lcom/appsflyer/internal/AFd1oSDK;->toString:I

    add-int/lit8 v0, v0, 0x15

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    rem-int/lit8 v0, v0, 0x2

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    if-nez p1, :cond_0

    .line 30
    filled-new-array {p0}, [Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 31
    :cond_0
    array-length v0, p1

    const/4 v2, 0x1

    add-int/2addr v0, v2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v3, 0x0

    .line 32
    aput-object p0, v0, v3

    .line 33
    :goto_0
    array-length p0, p1

    if-ge v2, p0, :cond_2

    .line 34
    sget p0, Lcom/appsflyer/internal/AFd1oSDK;->toString:I

    add-int/lit8 p0, p0, 0x77

    rem-int/lit16 v3, p0, 0x80

    sput v3, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    rem-int/lit8 p0, p0, 0x2

    if-nez p0, :cond_1

    .line 35
    aget-object p0, p1, v2

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    aput-object p0, v0, v2

    add-int/lit8 v2, v2, 0x31

    goto :goto_0

    :cond_1
    aget-object p0, p1, v2

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    aput-object p0, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 36
    :cond_2
    sget p0, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    add-int/lit8 p0, p0, 0x51

    rem-int/lit16 p1, p0, 0x80

    sput p1, Lcom/appsflyer/internal/AFd1oSDK;->toString:I

    rem-int/lit8 p0, p0, 0x2

    if-nez p0, :cond_3

    return-object v0

    :cond_3
    throw v1

    .line 37
    :cond_4
    throw v1
.end method

.method private declared-synchronized getRevenue(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    monitor-enter p0

    if-eqz p1, :cond_0

    .line 4
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-lez v0, :cond_0

    .line 5
    :try_start_1
    sget v0, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    add-int/lit8 v0, v0, 0x75

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1oSDK;->toString:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 6
    :try_start_2
    iget-object v0, p0, Lcom/appsflyer/internal/AFd1oSDK;->getCurrencyIso4217Code:Ljava/util/Map;

    const-string v1, "app_id"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    if-eqz p2, :cond_1

    .line 7
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_1

    .line 8
    iget-object p1, p0, Lcom/appsflyer/internal/AFd1oSDK;->getCurrencyIso4217Code:Ljava/util/Map;

    const-string v0, "app_version"

    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    if-eqz p3, :cond_2

    .line 9
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-lez p1, :cond_2

    .line 10
    :try_start_3
    sget p1, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    add-int/lit8 p1, p1, 0x31

    rem-int/lit16 p1, p1, 0x80

    sput p1, Lcom/appsflyer/internal/AFd1oSDK;->toString:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 11
    :try_start_4
    iget-object p1, p0, Lcom/appsflyer/internal/AFd1oSDK;->getCurrencyIso4217Code:Ljava/util/Map;

    const-string p2, "channel"

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :cond_2
    if-eqz p4, :cond_3

    .line 12
    :try_start_5
    sget p1, Lcom/appsflyer/internal/AFd1oSDK;->toString:I

    add-int/lit8 p1, p1, 0x3d

    rem-int/lit16 p1, p1, 0x80

    sput p1, Lcom/appsflyer/internal/AFd1oSDK;->equals:I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 13
    :try_start_6
    invoke-virtual {p4}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_3

    .line 14
    iget-object p1, p0, Lcom/appsflyer/internal/AFd1oSDK;->getCurrencyIso4217Code:Ljava/util/Map;

    const-string p2, "preInstall"

    invoke-interface {p1, p2, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_2

    .line 15
    :catchall_1
    monitor-exit p0

    return-void

    :goto_1
    :try_start_7
    monitor-exit p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    throw p1

    .line 16
    :cond_3
    :goto_2
    monitor-exit p0

    return-void
.end method


# virtual methods
.method public final declared-synchronized AFAdRevenueData()V
    .locals 8

    monitor-enter p0

    .line 4
    :try_start_0
    iget-boolean v0, p0, Lcom/appsflyer/internal/AFd1oSDK;->component1:Z

    if-nez v0, :cond_0

    .line 5
    sget v0, Lcom/appsflyer/internal/AFd1oSDK;->toString:I

    add-int/lit8 v0, v0, 0x3b

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    .line 6
    iget-boolean v1, p0, Lcom/appsflyer/internal/AFd1oSDK;->getMediationNetwork:Z

    if-nez v1, :cond_0

    add-int/lit8 v0, v0, 0x5f

    .line 7
    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1oSDK;->toString:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 8
    :try_start_1
    iput-boolean v0, p0, Lcom/appsflyer/internal/AFd1oSDK;->component1:Z

    .line 9
    iput-boolean v0, p0, Lcom/appsflyer/internal/AFd1oSDK;->getMediationNetwork:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 10
    :try_start_2
    const-string v1, "r_debugging_off"

    new-instance v2, Ljava/text/SimpleDateFormat;

    const-string/jumbo v3, "yyyy-MM-dd HH:mm:ssZ"

    sget-object v4, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-direct {v2, v3, v4}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-array v0, v0, [Ljava/lang/String;

    invoke-direct {p0, v1, v2, v0}, Lcom/appsflyer/internal/AFd1oSDK;->getMonetizationNetwork(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 11
    monitor-exit p0

    return-void

    :catchall_1
    move-exception v0

    move-object v4, v0

    .line 12
    :try_start_3
    sget-object v1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v2, Lcom/appsflyer/internal/AFh1ySDK;->afLogForce:Lcom/appsflyer/internal/AFh1ySDK;

    const-string v3, "Error while stopping remote debugger"

    const/4 v6, 0x1

    const/4 v7, 0x1

    const/4 v5, 0x1

    invoke-virtual/range {v1 .. v7}, Lcom/appsflyer/internal/AFg1bSDK;->e(Lcom/appsflyer/internal/AFh1ySDK;Ljava/lang/String;Ljava/lang/Throwable;ZZZ)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 13
    monitor-exit p0

    return-void

    :goto_0
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v0
.end method

.method public final AFAdRevenueData(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 14
    sget v0, Lcom/appsflyer/internal/AFd1oSDK;->toString:I

    add-int/lit8 v0, v0, 0x79

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    .line 15
    const-string/jumbo v0, "server_request"

    filled-new-array {p2}, [Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, v0, p1, p2}, Lcom/appsflyer/internal/AFd1oSDK;->getMonetizationNetwork(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 16
    sget p1, Lcom/appsflyer/internal/AFd1oSDK;->toString:I

    add-int/lit8 p1, p1, 0x35

    rem-int/lit16 p1, p1, 0x80

    sput p1, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    return-void
.end method

.method public final component4()Z
    .locals 4

    .line 1
    .line 2
    .line 3
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 8
    move-result v1

    .line 9
    .line 10
    .line 11
    const v2, 0x47909e07

    .line 12
    .line 13
    .line 14
    const v3, -0x47909e07

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v2, v3, v1}, Lcom/appsflyer/internal/AFd1oSDK;->AFAdRevenueData([Ljava/lang/Object;III)Ljava/lang/Object;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    check-cast v0, Ljava/lang/Boolean;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 24
    move-result v0

    .line 25
    return v0
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
.end method

.method public final getCurrencyIso4217Code(Ljava/lang/Throwable;)V
    .locals 3

    .line 15
    sget v0, Lcom/appsflyer/internal/AFd1oSDK;->toString:I

    add-int/lit8 v0, v0, 0x9

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    rem-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_2

    .line 16
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    if-nez v0, :cond_0

    .line 18
    sget v2, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    add-int/lit8 v2, v2, 0x59

    rem-int/lit16 v2, v2, 0x80

    sput v2, Lcom/appsflyer/internal/AFd1oSDK;->toString:I

    .line 19
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    :goto_0
    if-nez v0, :cond_1

    .line 20
    invoke-virtual {p1}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object p1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object p1

    .line 21
    sget v0, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    add-int/lit8 v0, v0, 0x61

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1oSDK;->toString:I

    .line 22
    :goto_1
    invoke-static {v2, p1}, Lcom/appsflyer/internal/AFd1oSDK;->getMonetizationNetwork(Ljava/lang/String;[Ljava/lang/StackTraceElement;)[Ljava/lang/String;

    move-result-object p1

    .line 23
    const-string v0, "exception"

    invoke-direct {p0, v0, v1, p1}, Lcom/appsflyer/internal/AFd1oSDK;->getMonetizationNetwork(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    return-void

    .line 24
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    const/4 p1, 0x0

    .line 25
    throw p1
.end method

.method public final getCurrencyIso4217Code()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFd1oSDK;->component3:Lcom/appsflyer/internal/AFd1zSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFd1zSDK;->areAllFieldsValid()Lcom/appsflyer/internal/AFf1iSDK;

    move-result-object v0

    .line 2
    iget-object v0, v0, Lcom/appsflyer/internal/AFf1iSDK;->getMonetizationNetwork:Lcom/appsflyer/internal/AFf1lSDK;

    .line 3
    iget-object v0, v0, Lcom/appsflyer/internal/AFf1lSDK;->getMediationNetwork:Lcom/appsflyer/internal/AFi1ySDK;

    .line 4
    invoke-static {v0}, Lcom/appsflyer/internal/AFd1oSDK;->AFAdRevenueData(Lcom/appsflyer/internal/AFi1ySDK;)Lcom/appsflyer/internal/AFi1uSDK;

    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/appsflyer/internal/AFd1oSDK;->component3:Lcom/appsflyer/internal/AFd1zSDK;

    invoke-interface {v1}, Lcom/appsflyer/internal/AFd1zSDK;->areAllFieldsValid()Lcom/appsflyer/internal/AFf1iSDK;

    move-result-object v1

    .line 6
    iget-object v1, v1, Lcom/appsflyer/internal/AFf1iSDK;->getMonetizationNetwork:Lcom/appsflyer/internal/AFf1lSDK;

    .line 7
    iget-object v1, v1, Lcom/appsflyer/internal/AFf1lSDK;->getMonetizationNetwork:Lcom/appsflyer/internal/AFi1ySDK;

    .line 8
    invoke-static {v1}, Lcom/appsflyer/internal/AFd1oSDK;->AFAdRevenueData(Lcom/appsflyer/internal/AFi1ySDK;)Lcom/appsflyer/internal/AFi1uSDK;

    move-result-object v1

    .line 9
    invoke-direct {p0, v0, v1}, Lcom/appsflyer/internal/AFd1oSDK;->AFAdRevenueData(Lcom/appsflyer/internal/AFi1uSDK;Lcom/appsflyer/internal/AFi1uSDK;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 10
    sget v1, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    add-int/lit8 v1, v1, 0x6d

    rem-int/lit16 v1, v1, 0x80

    sput v1, Lcom/appsflyer/internal/AFd1oSDK;->toString:I

    .line 11
    invoke-direct {p0}, Lcom/appsflyer/internal/AFd1oSDK;->component2()V

    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFd1oSDK;->getMediationNetwork()V

    .line 13
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFd1oSDK;->AFAdRevenueData()V

    .line 14
    sget v1, Lcom/appsflyer/internal/AFd1oSDK;->toString:I

    add-int/lit8 v1, v1, 0x2b

    rem-int/lit16 v1, v1, 0x80

    sput v1, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    :goto_0
    sget v1, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    add-int/lit8 v1, v1, 0x1d

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/appsflyer/internal/AFd1oSDK;->toString:I

    rem-int/lit8 v1, v1, 0x2

    if-nez v1, :cond_1

    return v0

    :cond_1
    const/4 v0, 0x0

    throw v0
.end method

.method public final declared-synchronized getMediationNetwork()V
    .locals 2

    monitor-enter p0

    .line 1
    :try_start_0
    sget v0, Lcom/appsflyer/internal/AFd1oSDK;->toString:I

    add-int/lit8 v0, v0, 0x13

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/appsflyer/internal/AFd1oSDK;->getMediationNetwork:Z

    .line 3
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFd1oSDK;->getMonetizationNetwork()V

    .line 4
    invoke-direct {p0}, Lcom/appsflyer/internal/AFd1oSDK;->equals()V

    .line 5
    sget v0, Lcom/appsflyer/internal/AFd1oSDK;->toString:I

    add-int/lit8 v0, v0, 0xd

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    rem-int/lit8 v0, v0, 0x2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    const/4 v0, 0x0

    :try_start_1
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    :try_start_2
    throw v0

    :catchall_1
    move-exception v0

    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0
.end method

.method public final getMediationNetwork(Ljava/lang/String;ILjava/lang/String;)V
    .locals 1

    .line 32
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {p0, p1, v0, p3}, [Ljava/lang/Object;

    move-result-object p1

    const p3, 0x665ffe9e

    const v0, -0x665ffe9c

    invoke-static {p1, p3, v0, p2}, Lcom/appsflyer/internal/AFd1oSDK;->AFAdRevenueData([Ljava/lang/Object;III)Ljava/lang/Object;

    return-void
.end method

.method public final getMediationNetwork(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 31
    filled-new-array {p0, p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p2

    const v0, -0x2b633d9c

    const v1, 0x2b633d9f

    invoke-static {p1, v0, v1, p2}, Lcom/appsflyer/internal/AFd1oSDK;->AFAdRevenueData([Ljava/lang/Object;III)Ljava/lang/Object;

    return-void
.end method

.method public final declared-synchronized getMonetizationNetwork()V
    .locals 3

    monitor-enter p0

    .line 1
    :try_start_0
    sget v0, Lcom/appsflyer/internal/AFd1oSDK;->toString:I

    add-int/lit8 v0, v0, 0x25

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    .line 2
    iget-object v0, p0, Lcom/appsflyer/internal/AFd1oSDK;->getCurrencyIso4217Code:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 3
    iget-object v0, p0, Lcom/appsflyer/internal/AFd1oSDK;->getRevenue:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    const/4 v0, 0x0

    .line 4
    iput v0, p0, Lcom/appsflyer/internal/AFd1oSDK;->getMonetizationNetwork:I

    .line 5
    sget v1, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    add-int/lit8 v1, v1, 0x17

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/appsflyer/internal/AFd1oSDK;->toString:I

    rem-int/lit8 v1, v1, 0x2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v1, :cond_0

    const/16 v1, 0x60

    :try_start_1
    div-int/2addr v1, v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_2
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception v0

    goto :goto_0

    :cond_0
    monitor-exit p0

    return-void

    :goto_0
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v0
.end method

.method public final varargs getMonetizationNetwork(Ljava/lang/String;[Ljava/lang/String;)V
    .locals 2

    .line 6
    sget v0, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    add-int/lit8 v0, v0, 0x39

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFd1oSDK;->toString:I

    rem-int/lit8 v0, v0, 0x2

    const-string v1, "public_api_call"

    if-eqz v0, :cond_0

    .line 7
    invoke-direct {p0, v1, p1, p2}, Lcom/appsflyer/internal/AFd1oSDK;->getMonetizationNetwork(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    const/16 p1, 0x1d

    .line 8
    div-int/lit8 p1, p1, 0x0

    return-void

    .line 9
    :cond_0
    invoke-direct {p0, v1, p1, p2}, Lcom/appsflyer/internal/AFd1oSDK;->getMonetizationNetwork(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    return-void
.end method

.method public final getRevenue()V
    .locals 2

    .line 1
    sget v0, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    add-int/lit8 v0, v0, 0xb

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1oSDK;->toString:I

    const/4 v1, 0x0

    .line 2
    iput-boolean v1, p0, Lcom/appsflyer/internal/AFd1oSDK;->component4:Z

    add-int/lit8 v0, v0, 0x59

    .line 3
    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    return-void
.end method

.method public final q_(Ljava/lang/String;Landroid/content/pm/PackageManager;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    :try_start_0
    invoke-direct {p0, p1}, Lcom/appsflyer/internal/AFd1oSDK;->getMediationNetwork(Ljava/lang/String;)Ljava/util/Map;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    iget-object p2, p0, Lcom/appsflyer/internal/AFd1oSDK;->component3:Lcom/appsflyer/internal/AFd1zSDK;

    .line 7
    .line 8
    .line 9
    invoke-interface {p2}, Lcom/appsflyer/internal/AFd1zSDK;->AFKeystoreWrapper()Lcom/appsflyer/internal/AFf1fSDK;

    .line 10
    move-result-object p2

    .line 11
    .line 12
    .line 13
    invoke-virtual {p2}, Lcom/appsflyer/internal/AFf1fSDK;->getMonetizationNetwork()Ljava/lang/String;

    .line 14
    move-result-object p2

    .line 15
    .line 16
    iget-object v0, p0, Lcom/appsflyer/internal/AFd1oSDK;->component3:Lcom/appsflyer/internal/AFd1zSDK;

    .line 17
    .line 18
    .line 19
    invoke-interface {v0}, Lcom/appsflyer/internal/AFd1zSDK;->AFAdRevenueData()Lcom/appsflyer/internal/AFd1mSDK;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p1, p2}, Lcom/appsflyer/internal/AFd1mSDK;->getRevenue(Ljava/util/Map;Ljava/lang/String;)Lcom/appsflyer/internal/AFd1lSDK;

    .line 24
    move-result-object p1

    .line 25
    .line 26
    if-nez p1, :cond_0

    .line 27
    .line 28
    const-string p1, "could not send null proxy data"

    .line 29
    .line 30
    new-instance p2, Ljava/lang/NullPointerException;

    .line 31
    .line 32
    const-string v0, "request was null"

    .line 33
    .line 34
    .line 35
    invoke-direct {p2, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-static {p1, p2}, Lcom/appsflyer/AFLogger;->afErrorLogForExcManagerOnly(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    sget p1, Lcom/appsflyer/internal/AFd1oSDK;->toString:I

    .line 41
    .line 42
    add-int/lit8 p1, p1, 0x9

    .line 43
    .line 44
    rem-int/lit16 p1, p1, 0x80

    .line 45
    .line 46
    sput p1, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    .line 47
    return-void

    .line 48
    :catchall_0
    move-exception p1

    .line 49
    goto :goto_0

    .line 50
    .line 51
    :cond_0
    :try_start_1
    iget-object p2, p0, Lcom/appsflyer/internal/AFd1oSDK;->component3:Lcom/appsflyer/internal/AFd1zSDK;

    .line 52
    .line 53
    .line 54
    invoke-interface {p2}, Lcom/appsflyer/internal/AFd1zSDK;->getMonetizationNetwork()Ljava/util/concurrent/ExecutorService;

    .line 55
    move-result-object p2

    .line 56
    .line 57
    new-instance v0, Lcom/appsflyer/internal/r;

    .line 58
    .line 59
    .line 60
    invoke-direct {v0, p1}, Lcom/appsflyer/internal/r;-><init>(Lcom/appsflyer/internal/AFd1lSDK;)V

    .line 61
    .line 62
    .line 63
    invoke-interface {p2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 64
    .line 65
    sget p1, Lcom/appsflyer/internal/AFd1oSDK;->toString:I

    .line 66
    .line 67
    add-int/lit8 p1, p1, 0x33

    .line 68
    .line 69
    rem-int/lit16 p2, p1, 0x80

    .line 70
    .line 71
    sput p2, Lcom/appsflyer/internal/AFd1oSDK;->equals:I

    .line 72
    .line 73
    rem-int/lit8 p1, p1, 0x2

    .line 74
    .line 75
    if-eqz p1, :cond_1

    .line 76
    return-void

    .line 77
    :cond_1
    const/4 p1, 0x0

    .line 78
    throw p1

    .line 79
    .line 80
    :goto_0
    const-string p2, "could not send proxy data"

    .line 81
    .line 82
    .line 83
    invoke-static {p2, p1}, Lcom/appsflyer/AFLogger;->afErrorLogForExcManagerOnly(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 84
    return-void
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
.end method
