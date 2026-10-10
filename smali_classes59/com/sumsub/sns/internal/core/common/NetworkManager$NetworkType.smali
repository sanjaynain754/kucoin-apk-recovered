.class public final enum Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;
.super Ljava/lang/Enum;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0012\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0007\u001a\u0004\u0008\u0008\u0010\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "com/sumsub/sns/internal/core/common/NetworkManager$NetworkType",
        "",
        "Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;",
        "",
        "type",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "Ljava/lang/String;",
        "getType",
        "()Ljava/lang/String;",
        "OTHER",
        "WIFI",
        "MOBILE",
        "ETHERNET",
        "M_2G",
        "M_3G",
        "M_4G",
        "M_5G",
        "LTE",
        "NONE",
        "NO_PERMISSION",
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


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;

.field public static final enum ETHERNET:Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;

.field public static final enum LTE:Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;

.field public static final enum MOBILE:Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;

.field public static final enum M_2G:Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;

.field public static final enum M_3G:Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;

.field public static final enum M_4G:Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;

.field public static final enum M_5G:Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;

.field public static final enum NONE:Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;

.field public static final enum NO_PERMISSION:Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;

.field public static final enum OTHER:Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;

.field public static final enum WIFI:Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;


# instance fields
.field private final type:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;
    .locals 11

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;->OTHER:Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;->WIFI:Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;

    .line 5
    .line 6
    sget-object v2, Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;->MOBILE:Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;

    .line 7
    .line 8
    sget-object v3, Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;->ETHERNET:Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;

    .line 9
    .line 10
    sget-object v4, Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;->M_2G:Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;

    .line 11
    .line 12
    sget-object v5, Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;->M_3G:Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;

    .line 13
    .line 14
    sget-object v6, Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;->M_4G:Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;

    .line 15
    .line 16
    sget-object v7, Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;->M_5G:Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;

    .line 17
    .line 18
    sget-object v8, Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;->LTE:Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;

    .line 19
    .line 20
    sget-object v9, Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;->NONE:Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;

    .line 21
    .line 22
    sget-object v10, Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;->NO_PERMISSION:Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;

    .line 23
    .line 24
    .line 25
    filled-new-array/range {v0 .. v10}, [Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;

    .line 26
    move-result-object v0

    .line 27
    return-object v0
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

.method static constructor <clinit>()V
    .locals 4

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    const-string v2, "Other"

    .line 6
    .line 7
    const-string v3, "OTHER"

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v3, v1, v2}, Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 11
    .line 12
    sput-object v0, Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;->OTHER:Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;

    .line 13
    .line 14
    new-instance v0, Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;

    .line 15
    const/4 v1, 0x1

    .line 16
    .line 17
    const-string v2, "WiFi"

    .line 18
    .line 19
    const-string v3, "WIFI"

    .line 20
    .line 21
    .line 22
    invoke-direct {v0, v3, v1, v2}, Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 23
    .line 24
    sput-object v0, Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;->WIFI:Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;

    .line 25
    .line 26
    new-instance v0, Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;

    .line 27
    const/4 v1, 0x2

    .line 28
    .line 29
    const-string v2, "Mobile"

    .line 30
    .line 31
    const-string v3, "MOBILE"

    .line 32
    .line 33
    .line 34
    invoke-direct {v0, v3, v1, v2}, Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 35
    .line 36
    sput-object v0, Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;->MOBILE:Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;

    .line 37
    .line 38
    new-instance v0, Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;

    .line 39
    const/4 v1, 0x3

    .line 40
    .line 41
    const-string v2, "Ethernet"

    .line 42
    .line 43
    const-string v3, "ETHERNET"

    .line 44
    .line 45
    .line 46
    invoke-direct {v0, v3, v1, v2}, Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 47
    .line 48
    sput-object v0, Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;->ETHERNET:Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;

    .line 49
    .line 50
    new-instance v0, Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;

    .line 51
    const/4 v1, 0x4

    .line 52
    .line 53
    const-string v2, "2G"

    .line 54
    .line 55
    const-string v3, "M_2G"

    .line 56
    .line 57
    .line 58
    invoke-direct {v0, v3, v1, v2}, Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 59
    .line 60
    sput-object v0, Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;->M_2G:Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;

    .line 61
    .line 62
    new-instance v0, Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;

    .line 63
    const/4 v1, 0x5

    .line 64
    .line 65
    const-string v2, "3G"

    .line 66
    .line 67
    const-string v3, "M_3G"

    .line 68
    .line 69
    .line 70
    invoke-direct {v0, v3, v1, v2}, Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 71
    .line 72
    sput-object v0, Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;->M_3G:Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;

    .line 73
    .line 74
    new-instance v0, Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;

    .line 75
    const/4 v1, 0x6

    .line 76
    .line 77
    const-string v2, "4G"

    .line 78
    .line 79
    const-string v3, "M_4G"

    .line 80
    .line 81
    .line 82
    invoke-direct {v0, v3, v1, v2}, Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 83
    .line 84
    sput-object v0, Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;->M_4G:Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;

    .line 85
    .line 86
    new-instance v0, Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;

    .line 87
    const/4 v1, 0x7

    .line 88
    .line 89
    const-string v2, "5G"

    .line 90
    .line 91
    const-string v3, "M_5G"

    .line 92
    .line 93
    .line 94
    invoke-direct {v0, v3, v1, v2}, Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 95
    .line 96
    sput-object v0, Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;->M_5G:Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;

    .line 97
    .line 98
    new-instance v0, Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;

    .line 99
    .line 100
    const-string v1, "LTE"

    .line 101
    .line 102
    const/16 v2, 0x8

    .line 103
    .line 104
    .line 105
    invoke-direct {v0, v1, v2, v1}, Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 106
    .line 107
    sput-object v0, Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;->LTE:Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;

    .line 108
    .line 109
    new-instance v0, Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;

    .line 110
    .line 111
    const/16 v1, 0x9

    .line 112
    .line 113
    const-string v2, "None"

    .line 114
    .line 115
    const-string v3, "NONE"

    .line 116
    .line 117
    .line 118
    invoke-direct {v0, v3, v1, v2}, Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 119
    .line 120
    sput-object v0, Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;->NONE:Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;

    .line 121
    .line 122
    new-instance v0, Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;

    .line 123
    .line 124
    const/16 v1, 0xa

    .line 125
    .line 126
    const-string v2, "No permission"

    .line 127
    .line 128
    const-string v3, "NO_PERMISSION"

    .line 129
    .line 130
    .line 131
    invoke-direct {v0, v3, v1, v2}, Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 132
    .line 133
    sput-object v0, Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;->NO_PERMISSION:Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;

    .line 134
    .line 135
    .line 136
    invoke-static {}, Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;->$values()[Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;

    .line 137
    move-result-object v0

    .line 138
    .line 139
    sput-object v0, Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;->$VALUES:[Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;

    .line 140
    .line 141
    .line 142
    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 143
    move-result-object v0

    .line 144
    .line 145
    sput-object v0, Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    .line 146
    return-void
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

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 4
    .line 5
    iput-object p3, p0, Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;->type:Ljava/lang/String;

    .line 6
    return-void
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
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;->$ENTRIES:Lkotlin/enums/EnumEntries;

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

.method public static valueOf(Ljava/lang/String;)Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;

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

.method public static values()[Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;->$VALUES:[Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;

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


# virtual methods
.method public final getType()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;->type:Ljava/lang/String;

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
