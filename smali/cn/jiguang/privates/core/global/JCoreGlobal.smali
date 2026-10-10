.class public Lcn/jiguang/privates/core/global/JCoreGlobal;
.super Ljava/lang/Object;
.source "JCoreGlobal.java"


# static fields
.field private static address:Lcn/jiguang/privates/core/api/Address; = null

.field private static connectRetryCount:I = 0x3

.field private static heartbeatInterval:J = 0x46cd0L

.field private static loginCode:I = 0x0

.field private static onlyBeWakeState:Z = true

.field private static onlyWakeState:Z = true

.field private static password:Ljava/lang/String; = null

.field private static registerCode:I = -0x1

.field private static registrationId:Ljava/lang/String; = null

.field private static rid:J = 0x0L

.field private static seedId:I = 0x0

.field private static serverTime:J = 0x0L

.field private static userId:J = 0x0L

.field private static wakeAndBeWakeState:Z = true


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
    .line 2
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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method

.method public static getAddress()Lcn/jiguang/privates/core/api/Address;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcn/jiguang/privates/core/global/JCoreGlobal;->address:Lcn/jiguang/privates/core/api/Address;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lcn/jiguang/privates/core/api/Address;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0}, Lcn/jiguang/privates/core/api/Address;-><init>()V

    .line 10
    .line 11
    sput-object v0, Lcn/jiguang/privates/core/global/JCoreGlobal;->address:Lcn/jiguang/privates/core/api/Address;

    .line 12
    .line 13
    :cond_0
    sget-object v0, Lcn/jiguang/privates/core/global/JCoreGlobal;->address:Lcn/jiguang/privates/core/api/Address;

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public static getConnectRetryCount()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcn/jiguang/privates/core/global/JCoreGlobal;->connectRetryCount:I

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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public static getHeartbeatInterval()J
    .locals 2

    .line 1
    .line 2
    sget-wide v0, Lcn/jiguang/privates/core/global/JCoreGlobal;->heartbeatInterval:J

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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public static getHttpAddress(Landroid/content/Context;)Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcn/jiguang/privates/core/cache/JCoreConfig;->getHttpAddress(Landroid/content/Context;)Ljava/util/Set;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lcn/jiguang/privates/core/global/JCoreGlobal;->getAddress()Lcn/jiguang/privates/core/api/Address;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    goto :goto_0

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {v0}, Lcn/jiguang/privates/core/api/Address;->getDefaultReportUrl()Ljava/lang/String;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    .line 18
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 19
    move-result v1

    .line 20
    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    .line 24
    invoke-interface {p0, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 25
    :cond_1
    :goto_0
    return-object p0
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
.end method

.method public static getLoginCode(Landroid/content/Context;)I
    .locals 2

    .line 1
    .line 2
    sget v0, Lcn/jiguang/privates/core/global/JCoreGlobal;->loginCode:I

    .line 3
    const/4 v1, -0x1

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Lcn/jiguang/privates/core/cache/JCoreConfig;->getLoginCode(Landroid/content/Context;)I

    .line 9
    move-result p0

    .line 10
    .line 11
    sput p0, Lcn/jiguang/privates/core/global/JCoreGlobal;->loginCode:I

    .line 12
    .line 13
    :cond_0
    sget p0, Lcn/jiguang/privates/core/global/JCoreGlobal;->loginCode:I

    .line 14
    return p0
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

.method public static getOnlyBeWakeState()Z
    .locals 1

    .line 1
    .line 2
    sget-boolean v0, Lcn/jiguang/privates/common/global/JGlobal;->IS_FOR_BINANCE:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    sget-boolean v0, Lcn/jiguang/privates/common/global/JGlobal;->IS_FOR_PINGANBANK:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    .line 12
    :cond_0
    sget-boolean v0, Lcn/jiguang/privates/core/global/JCoreGlobal;->onlyBeWakeState:Z

    .line 13
    return v0
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

.method public static getOnlyWakeState()Z
    .locals 1

    .line 1
    .line 2
    sget-boolean v0, Lcn/jiguang/privates/common/global/JGlobal;->IS_FOR_BINANCE:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    sget-boolean v0, Lcn/jiguang/privates/common/global/JGlobal;->IS_FOR_PINGANBANK:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    .line 12
    :cond_0
    sget-boolean v0, Lcn/jiguang/privates/core/global/JCoreGlobal;->onlyWakeState:Z

    .line 13
    return v0
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

.method public static getPassword(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcn/jiguang/privates/core/global/JCoreGlobal;->password:Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-static {p0}, Lcn/jiguang/privates/core/cache/JCoreConfig;->getPassword(Landroid/content/Context;)Ljava/lang/String;

    .line 12
    move-result-object p0

    .line 13
    .line 14
    sput-object p0, Lcn/jiguang/privates/core/global/JCoreGlobal;->password:Ljava/lang/String;

    .line 15
    .line 16
    :cond_0
    sget-object p0, Lcn/jiguang/privates/core/global/JCoreGlobal;->password:Ljava/lang/String;

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

.method public static getPlatformState(Landroid/content/Context;)B
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcn/jiguang/privates/core/cache/JCoreConfig;->getPlatformState(Landroid/content/Context;)B

    .line 4
    move-result p0

    .line 5
    return p0
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
.end method

.method public static getRegisterCode(Landroid/content/Context;)I
    .locals 2

    .line 1
    .line 2
    sget v0, Lcn/jiguang/privates/core/global/JCoreGlobal;->registerCode:I

    .line 3
    const/4 v1, -0x1

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Lcn/jiguang/privates/core/cache/JCoreConfig;->getRegisterCode(Landroid/content/Context;)I

    .line 9
    move-result p0

    .line 10
    .line 11
    sput p0, Lcn/jiguang/privates/core/global/JCoreGlobal;->registerCode:I

    .line 12
    .line 13
    :cond_0
    sget p0, Lcn/jiguang/privates/core/global/JCoreGlobal;->registerCode:I

    .line 14
    return p0
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

.method public static getRegistrationId(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcn/jiguang/privates/core/global/JCoreGlobal;->registrationId:Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-static {p0}, Lcn/jiguang/privates/core/cache/JCoreConfig;->getRegistrationId(Landroid/content/Context;)Ljava/lang/String;

    .line 12
    move-result-object p0

    .line 13
    .line 14
    sput-object p0, Lcn/jiguang/privates/core/global/JCoreGlobal;->registrationId:Ljava/lang/String;

    .line 15
    .line 16
    :cond_0
    sget-object p0, Lcn/jiguang/privates/core/global/JCoreGlobal;->registrationId:Ljava/lang/String;

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

.method public static getRid()J
    .locals 8

    .line 1
    .line 2
    sget-wide v0, Lcn/jiguang/privates/core/global/JCoreGlobal;->rid:J

    .line 3
    .line 4
    const-wide/16 v2, 0x2

    .line 5
    .line 6
    rem-long v4, v0, v2

    .line 7
    .line 8
    const-wide/16 v6, 0x0

    .line 9
    .line 10
    cmp-long v4, v4, v6

    .line 11
    .line 12
    if-nez v4, :cond_0

    .line 13
    .line 14
    const-wide/16 v2, 0x1

    .line 15
    :cond_0
    add-long/2addr v0, v2

    .line 16
    .line 17
    const-wide/16 v2, 0x7fff

    .line 18
    rem-long/2addr v0, v2

    .line 19
    .line 20
    sput-wide v0, Lcn/jiguang/privates/core/global/JCoreGlobal;->rid:J

    .line 21
    return-wide v0
    .line 22
.end method

.method public static getSeedId(Landroid/content/Context;)I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcn/jiguang/privates/core/global/JCoreGlobal;->seedId:I

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-static {p0}, Lcn/jiguang/privates/core/cache/JCoreConfig;->getSeedId(Landroid/content/Context;)I

    .line 8
    move-result p0

    .line 9
    .line 10
    sput p0, Lcn/jiguang/privates/core/global/JCoreGlobal;->seedId:I

    .line 11
    .line 12
    :cond_0
    sget p0, Lcn/jiguang/privates/core/global/JCoreGlobal;->seedId:I

    .line 13
    return p0
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

.method public static getServerTime(Landroid/content/Context;)J
    .locals 4

    .line 1
    .line 2
    sget-wide v0, Lcn/jiguang/privates/core/global/JCoreGlobal;->serverTime:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v0, v0, v2

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-static {p0}, Lcn/jiguang/privates/core/cache/JCoreConfig;->getServerTime(Landroid/content/Context;)J

    .line 12
    move-result-wide v0

    .line 13
    .line 14
    sput-wide v0, Lcn/jiguang/privates/core/global/JCoreGlobal;->serverTime:J

    .line 15
    .line 16
    :cond_0
    sget-wide v0, Lcn/jiguang/privates/core/global/JCoreGlobal;->serverTime:J

    .line 17
    return-wide v0
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

.method public static getUserId(Landroid/content/Context;)J
    .locals 4

    .line 1
    .line 2
    sget-wide v0, Lcn/jiguang/privates/core/global/JCoreGlobal;->userId:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v0, v0, v2

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-static {p0}, Lcn/jiguang/privates/core/cache/JCoreConfig;->getUserId(Landroid/content/Context;)J

    .line 12
    move-result-wide v0

    .line 13
    .line 14
    sput-wide v0, Lcn/jiguang/privates/core/global/JCoreGlobal;->userId:J

    .line 15
    .line 16
    :cond_0
    sget-wide v0, Lcn/jiguang/privates/core/global/JCoreGlobal;->userId:J

    .line 17
    return-wide v0
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

.method public static getWakeAndBeWakeState()Z
    .locals 1

    .line 1
    .line 2
    sget-boolean v0, Lcn/jiguang/privates/core/global/JCoreGlobal;->wakeAndBeWakeState:Z

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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public static setAddress(Lcn/jiguang/privates/core/api/Address;)V
    .locals 0

    .line 1
    .line 2
    sput-object p0, Lcn/jiguang/privates/core/global/JCoreGlobal;->address:Lcn/jiguang/privates/core/api/Address;

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
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
.end method

.method public static setConnectRetryCount(I)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    .line 3
    if-ge p0, v0, :cond_0

    .line 4
    .line 5
    sput v0, Lcn/jiguang/privates/core/global/JCoreGlobal;->connectRetryCount:I

    .line 6
    return-void

    .line 7
    .line 8
    :cond_0
    sput p0, Lcn/jiguang/privates/core/global/JCoreGlobal;->connectRetryCount:I

    .line 9
    return-void
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

.method public static setHeartbeatInterval(J)V
    .locals 2

    .line 1
    .line 2
    const-wide/16 v0, 0x0

    .line 3
    .line 4
    cmp-long v0, p0, v0

    .line 5
    .line 6
    if-gtz v0, :cond_0

    .line 7
    .line 8
    .line 9
    const-wide/32 p0, 0x46cd0

    .line 10
    .line 11
    sput-wide p0, Lcn/jiguang/privates/core/global/JCoreGlobal;->heartbeatInterval:J

    .line 12
    return-void

    .line 13
    .line 14
    :cond_0
    sput-wide p0, Lcn/jiguang/privates/core/global/JCoreGlobal;->heartbeatInterval:J

    .line 15
    return-void
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

.method public static setLoginCode(I)V
    .locals 0

    .line 1
    .line 2
    sput p0, Lcn/jiguang/privates/core/global/JCoreGlobal;->loginCode:I

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
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
.end method

.method public static setOnlyBeWakeState(Z)V
    .locals 1

    .line 1
    .line 2
    sget-boolean v0, Lcn/jiguang/privates/common/global/JGlobal;->IS_FOR_BINANCE:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    sget-boolean v0, Lcn/jiguang/privates/common/global/JGlobal;->IS_FOR_PINGANBANK:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    return-void

    .line 10
    .line 11
    :cond_0
    sput-boolean p0, Lcn/jiguang/privates/core/global/JCoreGlobal;->onlyBeWakeState:Z

    .line 12
    return-void
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

.method public static setOnlyWakeState(Z)V
    .locals 1

    .line 1
    .line 2
    sget-boolean v0, Lcn/jiguang/privates/common/global/JGlobal;->IS_FOR_BINANCE:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    sget-boolean v0, Lcn/jiguang/privates/common/global/JGlobal;->IS_FOR_PINGANBANK:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    return-void

    .line 10
    .line 11
    :cond_0
    sput-boolean p0, Lcn/jiguang/privates/core/global/JCoreGlobal;->onlyWakeState:Z

    .line 12
    return-void
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

.method public static setPassword(Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    sput-object p0, Lcn/jiguang/privates/core/global/JCoreGlobal;->password:Ljava/lang/String;

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
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
.end method

.method public static setPlatformState(Landroid/content/Context;B)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcn/jiguang/privates/core/cache/JCoreConfig;->setPlatformState(Landroid/content/Context;B)V

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

.method public static setRegisterCode(I)V
    .locals 0

    .line 1
    .line 2
    sput p0, Lcn/jiguang/privates/core/global/JCoreGlobal;->registerCode:I

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
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
.end method

.method public static setRegistrationId(Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    sput-object p0, Lcn/jiguang/privates/core/global/JCoreGlobal;->registrationId:Ljava/lang/String;

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
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
.end method

.method public static setSeedId(I)V
    .locals 0

    .line 1
    .line 2
    sput p0, Lcn/jiguang/privates/core/global/JCoreGlobal;->seedId:I

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
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
.end method

.method public static setServerTime(J)V
    .locals 0

    .line 1
    .line 2
    sput-wide p0, Lcn/jiguang/privates/core/global/JCoreGlobal;->serverTime:J

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
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
.end method

.method public static setUserId(J)V
    .locals 0

    .line 1
    .line 2
    sput-wide p0, Lcn/jiguang/privates/core/global/JCoreGlobal;->userId:J

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
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
.end method

.method public static setWakeAndBeWakeState(Z)V
    .locals 0

    .line 1
    .line 2
    sput-boolean p0, Lcn/jiguang/privates/core/global/JCoreGlobal;->wakeAndBeWakeState:Z

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
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
.end method
