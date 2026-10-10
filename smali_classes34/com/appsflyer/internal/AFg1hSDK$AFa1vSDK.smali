.class public final enum Lcom/appsflyer/internal/AFg1hSDK$AFa1vSDK;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/appsflyer/internal/AFg1hSDK;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "AFa1vSDK"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/appsflyer/internal/AFg1hSDK$AFa1vSDK;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum AFAdRevenueData:Lcom/appsflyer/internal/AFg1hSDK$AFa1vSDK;

.field public static final enum areAllFieldsValid:Lcom/appsflyer/internal/AFg1hSDK$AFa1vSDK;

.field private static final synthetic component4:[Lcom/appsflyer/internal/AFg1hSDK$AFa1vSDK;

.field public static final enum getCurrencyIso4217Code:Lcom/appsflyer/internal/AFg1hSDK$AFa1vSDK;

.field public static final enum getMediationNetwork:Lcom/appsflyer/internal/AFg1hSDK$AFa1vSDK;

.field public static final enum getMonetizationNetwork:Lcom/appsflyer/internal/AFg1hSDK$AFa1vSDK;

.field public static final enum getRevenue:Lcom/appsflyer/internal/AFg1hSDK$AFa1vSDK;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    .line 2
    new-instance v0, Lcom/appsflyer/internal/AFg1hSDK$AFa1vSDK;

    .line 3
    .line 4
    const-string v1, "EMPTY_ARRAY"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1, v2}, Lcom/appsflyer/internal/AFg1hSDK$AFa1vSDK;-><init>(Ljava/lang/String;I)V

    .line 9
    .line 10
    sput-object v0, Lcom/appsflyer/internal/AFg1hSDK$AFa1vSDK;->getRevenue:Lcom/appsflyer/internal/AFg1hSDK$AFa1vSDK;

    .line 11
    .line 12
    new-instance v1, Lcom/appsflyer/internal/AFg1hSDK$AFa1vSDK;

    .line 13
    .line 14
    const-string v2, "NONEMPTY_ARRAY"

    .line 15
    const/4 v3, 0x1

    .line 16
    .line 17
    .line 18
    invoke-direct {v1, v2, v3}, Lcom/appsflyer/internal/AFg1hSDK$AFa1vSDK;-><init>(Ljava/lang/String;I)V

    .line 19
    .line 20
    sput-object v1, Lcom/appsflyer/internal/AFg1hSDK$AFa1vSDK;->getMediationNetwork:Lcom/appsflyer/internal/AFg1hSDK$AFa1vSDK;

    .line 21
    .line 22
    new-instance v2, Lcom/appsflyer/internal/AFg1hSDK$AFa1vSDK;

    .line 23
    .line 24
    const-string v3, "EMPTY_OBJECT"

    .line 25
    const/4 v4, 0x2

    .line 26
    .line 27
    .line 28
    invoke-direct {v2, v3, v4}, Lcom/appsflyer/internal/AFg1hSDK$AFa1vSDK;-><init>(Ljava/lang/String;I)V

    .line 29
    .line 30
    sput-object v2, Lcom/appsflyer/internal/AFg1hSDK$AFa1vSDK;->AFAdRevenueData:Lcom/appsflyer/internal/AFg1hSDK$AFa1vSDK;

    .line 31
    .line 32
    new-instance v3, Lcom/appsflyer/internal/AFg1hSDK$AFa1vSDK;

    .line 33
    .line 34
    const-string v4, "DANGLING_KEY"

    .line 35
    const/4 v5, 0x3

    .line 36
    .line 37
    .line 38
    invoke-direct {v3, v4, v5}, Lcom/appsflyer/internal/AFg1hSDK$AFa1vSDK;-><init>(Ljava/lang/String;I)V

    .line 39
    .line 40
    sput-object v3, Lcom/appsflyer/internal/AFg1hSDK$AFa1vSDK;->getCurrencyIso4217Code:Lcom/appsflyer/internal/AFg1hSDK$AFa1vSDK;

    .line 41
    .line 42
    new-instance v4, Lcom/appsflyer/internal/AFg1hSDK$AFa1vSDK;

    .line 43
    .line 44
    const-string v5, "NONEMPTY_OBJECT"

    .line 45
    const/4 v6, 0x4

    .line 46
    .line 47
    .line 48
    invoke-direct {v4, v5, v6}, Lcom/appsflyer/internal/AFg1hSDK$AFa1vSDK;-><init>(Ljava/lang/String;I)V

    .line 49
    .line 50
    sput-object v4, Lcom/appsflyer/internal/AFg1hSDK$AFa1vSDK;->getMonetizationNetwork:Lcom/appsflyer/internal/AFg1hSDK$AFa1vSDK;

    .line 51
    .line 52
    new-instance v5, Lcom/appsflyer/internal/AFg1hSDK$AFa1vSDK;

    .line 53
    .line 54
    const-string v6, "NULL"

    .line 55
    const/4 v7, 0x5

    .line 56
    .line 57
    .line 58
    invoke-direct {v5, v6, v7}, Lcom/appsflyer/internal/AFg1hSDK$AFa1vSDK;-><init>(Ljava/lang/String;I)V

    .line 59
    .line 60
    sput-object v5, Lcom/appsflyer/internal/AFg1hSDK$AFa1vSDK;->areAllFieldsValid:Lcom/appsflyer/internal/AFg1hSDK$AFa1vSDK;

    .line 61
    .line 62
    .line 63
    filled-new-array/range {v0 .. v5}, [Lcom/appsflyer/internal/AFg1hSDK$AFa1vSDK;

    .line 64
    move-result-object v0

    .line 65
    .line 66
    sput-object v0, Lcom/appsflyer/internal/AFg1hSDK$AFa1vSDK;->component4:[Lcom/appsflyer/internal/AFg1hSDK$AFa1vSDK;

    .line 67
    return-void
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

.method public static valueOf(Ljava/lang/String;)Lcom/appsflyer/internal/AFg1hSDK$AFa1vSDK;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lcom/appsflyer/internal/AFg1hSDK$AFa1vSDK;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/appsflyer/internal/AFg1hSDK$AFa1vSDK;

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

.method public static values()[Lcom/appsflyer/internal/AFg1hSDK$AFa1vSDK;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/appsflyer/internal/AFg1hSDK$AFa1vSDK;->component4:[Lcom/appsflyer/internal/AFg1hSDK$AFa1vSDK;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, [Lcom/appsflyer/internal/AFg1hSDK$AFa1vSDK;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lcom/appsflyer/internal/AFg1hSDK$AFa1vSDK;

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
