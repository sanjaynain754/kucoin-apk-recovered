.class public final enum Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;
.super Ljava/lang/Enum;
.source "NetworkUtils.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/blankj/utilcode/util/NetworkUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "NetworkType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum NETWORK_2G:Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;

.field public static final enum NETWORK_3G:Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;

.field public static final enum NETWORK_4G:Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;

.field public static final enum NETWORK_5G:Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;

.field public static final enum NETWORK_ETHERNET:Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;

.field public static final enum NETWORK_NO:Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;

.field public static final enum NETWORK_UNKNOWN:Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;

.field public static final enum NETWORK_WIFI:Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;

.field public static final synthetic b:[Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    .line 2
    new-instance v0, Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;

    .line 3
    .line 4
    const-string v1, "NETWORK_ETHERNET"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1, v2}, Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;-><init>(Ljava/lang/String;I)V

    .line 9
    .line 10
    sput-object v0, Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;->NETWORK_ETHERNET:Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;

    .line 11
    .line 12
    new-instance v1, Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;

    .line 13
    .line 14
    const-string v2, "NETWORK_WIFI"

    .line 15
    const/4 v3, 0x1

    .line 16
    .line 17
    .line 18
    invoke-direct {v1, v2, v3}, Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;-><init>(Ljava/lang/String;I)V

    .line 19
    .line 20
    sput-object v1, Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;->NETWORK_WIFI:Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;

    .line 21
    .line 22
    new-instance v2, Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;

    .line 23
    .line 24
    const-string v3, "NETWORK_5G"

    .line 25
    const/4 v4, 0x2

    .line 26
    .line 27
    .line 28
    invoke-direct {v2, v3, v4}, Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;-><init>(Ljava/lang/String;I)V

    .line 29
    .line 30
    sput-object v2, Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;->NETWORK_5G:Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;

    .line 31
    .line 32
    new-instance v3, Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;

    .line 33
    .line 34
    const-string v4, "NETWORK_4G"

    .line 35
    const/4 v5, 0x3

    .line 36
    .line 37
    .line 38
    invoke-direct {v3, v4, v5}, Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;-><init>(Ljava/lang/String;I)V

    .line 39
    .line 40
    sput-object v3, Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;->NETWORK_4G:Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;

    .line 41
    .line 42
    new-instance v4, Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;

    .line 43
    .line 44
    const-string v5, "NETWORK_3G"

    .line 45
    const/4 v6, 0x4

    .line 46
    .line 47
    .line 48
    invoke-direct {v4, v5, v6}, Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;-><init>(Ljava/lang/String;I)V

    .line 49
    .line 50
    sput-object v4, Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;->NETWORK_3G:Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;

    .line 51
    .line 52
    new-instance v5, Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;

    .line 53
    .line 54
    const-string v6, "NETWORK_2G"

    .line 55
    const/4 v7, 0x5

    .line 56
    .line 57
    .line 58
    invoke-direct {v5, v6, v7}, Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;-><init>(Ljava/lang/String;I)V

    .line 59
    .line 60
    sput-object v5, Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;->NETWORK_2G:Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;

    .line 61
    .line 62
    new-instance v6, Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;

    .line 63
    .line 64
    const-string v7, "NETWORK_UNKNOWN"

    .line 65
    const/4 v8, 0x6

    .line 66
    .line 67
    .line 68
    invoke-direct {v6, v7, v8}, Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;-><init>(Ljava/lang/String;I)V

    .line 69
    .line 70
    sput-object v6, Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;->NETWORK_UNKNOWN:Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;

    .line 71
    .line 72
    new-instance v7, Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;

    .line 73
    .line 74
    const-string v8, "NETWORK_NO"

    .line 75
    const/4 v9, 0x7

    .line 76
    .line 77
    .line 78
    invoke-direct {v7, v8, v9}, Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;-><init>(Ljava/lang/String;I)V

    .line 79
    .line 80
    sput-object v7, Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;->NETWORK_NO:Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;

    .line 81
    .line 82
    .line 83
    filled-new-array/range {v0 .. v7}, [Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;

    .line 84
    move-result-object v0

    .line 85
    .line 86
    sput-object v0, Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;->b:[Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;

    .line 87
    return-void
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
.end method

.method public constructor <init>(Ljava/lang/String;I)V
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

.method public static valueOf(Ljava/lang/String;)Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;

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

.method public static values()[Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;->b:[Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, [Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;

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
