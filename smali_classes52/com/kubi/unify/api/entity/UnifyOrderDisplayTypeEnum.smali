.class public final enum Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;
.super Ljava/lang/Enum;
.source "UnifyEnum.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0012\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B!\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\nj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;",
        "",
        "type",
        "",
        "tradeType",
        "",
        "displayString",
        "<init>",
        "(Ljava/lang/String;IILjava/lang/String;I)V",
        "getType",
        "()I",
        "getTradeType",
        "()Ljava/lang/String;",
        "getDisplayString",
        "UTA_LIMIT",
        "UTA_MARKET",
        "UTA_CON_LIMIT",
        "UTA_CON_MARKET",
        "UTA_ADVANCED_LIMIT",
        "UTA_HIDDEN",
        "UTA_LIQUIDATION",
        "UTA_ADL",
        "UTA_SETTLEMENT",
        "BUnifyAccountApi_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final enum UTA_ADL:Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;

.field public static final enum UTA_ADVANCED_LIMIT:Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;

.field public static final enum UTA_CON_LIMIT:Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;

.field public static final enum UTA_CON_MARKET:Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;

.field public static final enum UTA_HIDDEN:Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;

.field public static final enum UTA_LIMIT:Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;

.field public static final enum UTA_LIQUIDATION:Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;

.field public static final enum UTA_MARKET:Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;

.field public static final enum UTA_SETTLEMENT:Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;

.field public static final synthetic b:[Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;

.field public static final synthetic c:Lkotlin/enums/EnumEntries;


# instance fields
.field private final displayString:I

.field private final tradeType:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final type:I


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;

    .line 3
    .line 4
    const-string v4, "limit"

    .line 5
    .line 6
    sget v5, Lcom/kubi/unifyapi/R$string;->kumex_order_limit:I

    .line 7
    .line 8
    const-string v1, "UTA_LIMIT"

    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x0

    .line 11
    .line 12
    .line 13
    invoke-direct/range {v0 .. v5}, Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;-><init>(Ljava/lang/String;IILjava/lang/String;I)V

    .line 14
    .line 15
    sput-object v0, Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;->UTA_LIMIT:Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;

    .line 16
    .line 17
    new-instance v1, Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;

    .line 18
    .line 19
    const-string v5, "market"

    .line 20
    .line 21
    sget v6, Lcom/kubi/unifyapi/R$string;->kumex_order_market:I

    .line 22
    .line 23
    const-string v2, "UTA_MARKET"

    .line 24
    const/4 v3, 0x1

    .line 25
    const/4 v4, 0x1

    .line 26
    .line 27
    .line 28
    invoke-direct/range {v1 .. v6}, Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;-><init>(Ljava/lang/String;IILjava/lang/String;I)V

    .line 29
    .line 30
    sput-object v1, Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;->UTA_MARKET:Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;

    .line 31
    .line 32
    new-instance v2, Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;

    .line 33
    .line 34
    const-string v6, "limit_stop"

    .line 35
    .line 36
    sget v7, Lcom/kubi/unifyapi/R$string;->kumex_order_limit_stop:I

    .line 37
    .line 38
    const-string v3, "UTA_CON_LIMIT"

    .line 39
    const/4 v4, 0x2

    .line 40
    const/4 v5, 0x2

    .line 41
    .line 42
    .line 43
    invoke-direct/range {v2 .. v7}, Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;-><init>(Ljava/lang/String;IILjava/lang/String;I)V

    .line 44
    .line 45
    sput-object v2, Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;->UTA_CON_LIMIT:Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;

    .line 46
    .line 47
    new-instance v3, Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;

    .line 48
    .line 49
    const-string v7, "market_stop"

    .line 50
    .line 51
    sget v8, Lcom/kubi/unifyapi/R$string;->kumex_order_market_stop:I

    .line 52
    .line 53
    const-string v4, "UTA_CON_MARKET"

    .line 54
    const/4 v5, 0x3

    .line 55
    const/4 v6, 0x3

    .line 56
    .line 57
    .line 58
    invoke-direct/range {v3 .. v8}, Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;-><init>(Ljava/lang/String;IILjava/lang/String;I)V

    .line 59
    .line 60
    sput-object v3, Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;->UTA_CON_MARKET:Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;

    .line 61
    .line 62
    new-instance v4, Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;

    .line 63
    .line 64
    const-string v8, "advanced_limit"

    .line 65
    .line 66
    sget v9, Lcom/kubi/unifyapi/R$string;->kumex_order_limit_advanced:I

    .line 67
    .line 68
    const-string v5, "UTA_ADVANCED_LIMIT"

    .line 69
    const/4 v6, 0x4

    .line 70
    const/4 v7, 0x4

    .line 71
    .line 72
    .line 73
    invoke-direct/range {v4 .. v9}, Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;-><init>(Ljava/lang/String;IILjava/lang/String;I)V

    .line 74
    .line 75
    sput-object v4, Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;->UTA_ADVANCED_LIMIT:Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;

    .line 76
    .line 77
    new-instance v5, Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;

    .line 78
    .line 79
    const-string v9, "hidden"

    .line 80
    .line 81
    sget v10, Lcom/kubi/unifyapi/R$string;->kumex_order_hidden:I

    .line 82
    .line 83
    const-string v6, "UTA_HIDDEN"

    .line 84
    const/4 v7, 0x5

    .line 85
    const/4 v8, 0x5

    .line 86
    .line 87
    .line 88
    invoke-direct/range {v5 .. v10}, Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;-><init>(Ljava/lang/String;IILjava/lang/String;I)V

    .line 89
    .line 90
    sput-object v5, Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;->UTA_HIDDEN:Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;

    .line 91
    .line 92
    new-instance v6, Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;

    .line 93
    .line 94
    const-string v10, "liquid"

    .line 95
    .line 96
    sget v11, Lcom/kubi/unifyapi/R$string;->force_close_position:I

    .line 97
    .line 98
    const-string v7, "UTA_LIQUIDATION"

    .line 99
    const/4 v8, 0x6

    .line 100
    const/4 v9, 0x6

    .line 101
    .line 102
    .line 103
    invoke-direct/range {v6 .. v11}, Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;-><init>(Ljava/lang/String;IILjava/lang/String;I)V

    .line 104
    .line 105
    sput-object v6, Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;->UTA_LIQUIDATION:Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;

    .line 106
    .line 107
    new-instance v0, Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;

    .line 108
    .line 109
    const-string v4, "adl"

    .line 110
    .line 111
    sget v5, Lcom/kubi/unifyapi/R$string;->auto_reduce_position:I

    .line 112
    .line 113
    const-string v1, "UTA_ADL"

    .line 114
    const/4 v2, 0x7

    .line 115
    const/4 v3, 0x7

    .line 116
    .line 117
    .line 118
    invoke-direct/range {v0 .. v5}, Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;-><init>(Ljava/lang/String;IILjava/lang/String;I)V

    .line 119
    .line 120
    sput-object v0, Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;->UTA_ADL:Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;

    .line 121
    .line 122
    new-instance v1, Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;

    .line 123
    .line 124
    const-string v5, "settlement"

    .line 125
    .line 126
    sget v6, Lcom/kubi/unifyapi/R$string;->settlement:I

    .line 127
    .line 128
    const-string v2, "UTA_SETTLEMENT"

    .line 129
    .line 130
    const/16 v3, 0x8

    .line 131
    .line 132
    const/16 v4, 0x8

    .line 133
    .line 134
    .line 135
    invoke-direct/range {v1 .. v6}, Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;-><init>(Ljava/lang/String;IILjava/lang/String;I)V

    .line 136
    .line 137
    sput-object v1, Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;->UTA_SETTLEMENT:Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;

    .line 138
    .line 139
    .line 140
    invoke-static {}, Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;->a()[Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;

    .line 141
    move-result-object v0

    .line 142
    .line 143
    sput-object v0, Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;->b:[Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;

    .line 144
    .line 145
    .line 146
    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 147
    move-result-object v0

    .line 148
    .line 149
    sput-object v0, Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;->c:Lkotlin/enums/EnumEntries;

    .line 150
    return-void
    .line 151
    .line 152
    .line 153
.end method

.method public constructor <init>(Ljava/lang/String;IILjava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "I)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 4
    .line 5
    iput p3, p0, Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;->type:I

    .line 6
    .line 7
    iput-object p4, p0, Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;->tradeType:Ljava/lang/String;

    .line 8
    .line 9
    iput p5, p0, Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;->displayString:I

    .line 10
    return-void
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
.end method

.method public static final synthetic a()[Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;
    .locals 9

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;->UTA_LIMIT:Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;->UTA_MARKET:Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;

    .line 5
    .line 6
    sget-object v2, Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;->UTA_CON_LIMIT:Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;

    .line 7
    .line 8
    sget-object v3, Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;->UTA_CON_MARKET:Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;

    .line 9
    .line 10
    sget-object v4, Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;->UTA_ADVANCED_LIMIT:Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;

    .line 11
    .line 12
    sget-object v5, Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;->UTA_HIDDEN:Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;

    .line 13
    .line 14
    sget-object v6, Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;->UTA_LIQUIDATION:Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;

    .line 15
    .line 16
    sget-object v7, Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;->UTA_ADL:Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;

    .line 17
    .line 18
    sget-object v8, Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;->UTA_SETTLEMENT:Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;

    .line 19
    .line 20
    .line 21
    filled-new-array/range {v0 .. v8}, [Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;

    .line 22
    move-result-object v0

    .line 23
    return-object v0
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
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;->c:Lkotlin/enums/EnumEntries;

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
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;

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
.end method

.method public static values()[Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;->b:[Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;

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
.end method


# virtual methods
.method public final getDisplayString()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;->displayString:I

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
.end method

.method public final getTradeType()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;->tradeType:Ljava/lang/String;

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
.end method

.method public final getType()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;->type:I

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
.end method
