.class public final enum Lcom/sensorsdata/analytics/android/sdk/network/ResponseStatus;
.super Ljava/lang/Enum;
.source "ResponseStatus.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/sensorsdata/analytics/android/sdk/network/ResponseStatus;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/sensorsdata/analytics/android/sdk/network/ResponseStatus;

.field public static final enum GET_PARAMS_FAILED:Lcom/sensorsdata/analytics/android/sdk/network/ResponseStatus;

.field public static final enum NO_QUERY:Lcom/sensorsdata/analytics/android/sdk/network/ResponseStatus;

.field public static final enum PARSE_ERROR:Lcom/sensorsdata/analytics/android/sdk/network/ResponseStatus;

.field public static final enum SUCCESS:Lcom/sensorsdata/analytics/android/sdk/network/ResponseStatus;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    .line 2
    new-instance v0, Lcom/sensorsdata/analytics/android/sdk/network/ResponseStatus;

    .line 3
    .line 4
    const-string v1, "SUCCESS"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1, v2}, Lcom/sensorsdata/analytics/android/sdk/network/ResponseStatus;-><init>(Ljava/lang/String;I)V

    .line 9
    .line 10
    sput-object v0, Lcom/sensorsdata/analytics/android/sdk/network/ResponseStatus;->SUCCESS:Lcom/sensorsdata/analytics/android/sdk/network/ResponseStatus;

    .line 11
    .line 12
    new-instance v1, Lcom/sensorsdata/analytics/android/sdk/network/ResponseStatus;

    .line 13
    .line 14
    const-string v2, "PARSE_ERROR"

    .line 15
    const/4 v3, 0x1

    .line 16
    .line 17
    .line 18
    invoke-direct {v1, v2, v3}, Lcom/sensorsdata/analytics/android/sdk/network/ResponseStatus;-><init>(Ljava/lang/String;I)V

    .line 19
    .line 20
    sput-object v1, Lcom/sensorsdata/analytics/android/sdk/network/ResponseStatus;->PARSE_ERROR:Lcom/sensorsdata/analytics/android/sdk/network/ResponseStatus;

    .line 21
    .line 22
    new-instance v2, Lcom/sensorsdata/analytics/android/sdk/network/ResponseStatus;

    .line 23
    .line 24
    const-string v3, "NO_QUERY"

    .line 25
    const/4 v4, 0x2

    .line 26
    .line 27
    .line 28
    invoke-direct {v2, v3, v4}, Lcom/sensorsdata/analytics/android/sdk/network/ResponseStatus;-><init>(Ljava/lang/String;I)V

    .line 29
    .line 30
    sput-object v2, Lcom/sensorsdata/analytics/android/sdk/network/ResponseStatus;->NO_QUERY:Lcom/sensorsdata/analytics/android/sdk/network/ResponseStatus;

    .line 31
    .line 32
    new-instance v3, Lcom/sensorsdata/analytics/android/sdk/network/ResponseStatus;

    .line 33
    .line 34
    const-string v4, "GET_PARAMS_FAILED"

    .line 35
    const/4 v5, 0x3

    .line 36
    .line 37
    .line 38
    invoke-direct {v3, v4, v5}, Lcom/sensorsdata/analytics/android/sdk/network/ResponseStatus;-><init>(Ljava/lang/String;I)V

    .line 39
    .line 40
    sput-object v3, Lcom/sensorsdata/analytics/android/sdk/network/ResponseStatus;->GET_PARAMS_FAILED:Lcom/sensorsdata/analytics/android/sdk/network/ResponseStatus;

    .line 41
    .line 42
    .line 43
    filled-new-array {v0, v1, v2, v3}, [Lcom/sensorsdata/analytics/android/sdk/network/ResponseStatus;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    sput-object v0, Lcom/sensorsdata/analytics/android/sdk/network/ResponseStatus;->$VALUES:[Lcom/sensorsdata/analytics/android/sdk/network/ResponseStatus;

    .line 47
    return-void
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
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/sensorsdata/analytics/android/sdk/network/ResponseStatus;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lcom/sensorsdata/analytics/android/sdk/network/ResponseStatus;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/sensorsdata/analytics/android/sdk/network/ResponseStatus;

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

.method public static values()[Lcom/sensorsdata/analytics/android/sdk/network/ResponseStatus;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/sensorsdata/analytics/android/sdk/network/ResponseStatus;->$VALUES:[Lcom/sensorsdata/analytics/android/sdk/network/ResponseStatus;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, [Lcom/sensorsdata/analytics/android/sdk/network/ResponseStatus;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lcom/sensorsdata/analytics/android/sdk/network/ResponseStatus;

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
.end method
