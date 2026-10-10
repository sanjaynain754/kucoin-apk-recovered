.class public final Luk/b;
.super Ljava/lang/Object;
.source "IsolatedCalculator.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008,\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003Jg\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000c\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0011\u0010\u0012JW\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0015\u0010\u0016Jy\u0010\u001d\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ?\u0010\"\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\"\u0010#J-\u0010%\u001a\u0004\u0018\u00010\u00062\u0008\u0010$\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008%\u0010&JG\u0010,\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\'\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00062\u0008\u0008\u0002\u0010+\u001a\u00020\u0006\u00a2\u0006\u0004\u0008,\u0010-J/\u00100\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u0006\u00a2\u0006\u0004\u00080\u00101\u00a8\u00062"
    }
    d2 = {
        "Luk/b;",
        "",
        "<init>",
        "()V",
        "",
        "isInverse",
        "Lrk/b;",
        "multiplier",
        "isOrderBuy",
        "availableBalance",
        "maxClosePositionSize",
        "positionQty",
        "percent",
        "estimatedPrice",
        "leverage",
        "takerFeeRate",
        "taxRate",
        "c",
        "(ZLrk/b;ZLrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;)Lrk/b;",
        "isBuy",
        "orderQty",
        "d",
        "(ZLrk/b;ZLrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;)Lrk/b;",
        "maxOrderQty",
        "positionLiqPrice",
        "maintainMarginRate",
        "liquidationFeeRate",
        "posCost",
        "posMargin",
        "b",
        "(ZLrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;)Lrk/b;",
        "markPrice",
        "aggRate",
        "positionTotalMargin",
        "f",
        "(ZLrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;)Lrk/b;",
        "markValue",
        "e",
        "(Lrk/b;Lrk/b;Lrk/b;)Lrk/b;",
        "isLimit",
        "inputDelegationPrice",
        "bestBid",
        "bestAsk",
        "spread",
        "a",
        "(ZZZLrk/b;Lrk/b;Lrk/b;Lrk/b;)Lrk/b;",
        "price",
        "qty",
        "g",
        "(ZLrk/b;Lrk/b;Lrk/b;)Lrk/b;",
        "shared_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nIsolatedCalculator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IsolatedCalculator.kt\ncom/kubi/kmm/trade/futures/isolated/IsolatedCalculator\n+ 2 NumberEx.kt\ncom/kubi/kmm/trade/utils/NumberExKt\n*L\n1#1,456:1\n30#2,4:457\n52#2:461\n38#2,2:462\n55#2,2:464\n41#2:466\n18#2:467\n38#2,2:468\n55#2,2:470\n41#2:472\n30#2,4:473\n38#2,2:477\n55#2,2:479\n41#2:481\n38#2,2:482\n55#2,2:484\n41#2:486\n52#2:487\n52#2:488\n52#2:489\n38#2,2:490\n55#2,2:492\n41#2:494\n38#2,2:495\n55#2,2:497\n41#2:499\n38#2,2:500\n55#2,2:502\n41#2:504\n38#2,2:505\n55#2,2:507\n41#2:509\n18#2:510\n30#2,4:511\n30#2,4:515\n52#2:519\n30#2,4:520\n30#2,4:524\n30#2,4:528\n30#2,4:532\n33#2:536\n38#2,2:537\n55#2,2:539\n41#2:541\n30#2,4:542\n52#2:546\n46#2:547\n49#2:548\n30#2,4:549\n*S KotlinDebug\n*F\n+ 1 IsolatedCalculator.kt\ncom/kubi/kmm/trade/futures/isolated/IsolatedCalculator\n*L\n72#1:457,4\n77#1:461\n78#1:462,2\n78#1:464,2\n78#1:466\n128#1:467\n135#1:468,2\n135#1:470,2\n135#1:472\n135#1:473,4\n138#1:477,2\n138#1:479,2\n138#1:481\n212#1:482,2\n212#1:484,2\n212#1:486\n220#1:487\n222#1:488\n224#1:489\n226#1:490,2\n226#1:492,2\n226#1:494\n226#1:495,2\n226#1:497,2\n226#1:499\n230#1:500,2\n230#1:502,2\n230#1:504\n230#1:505,2\n230#1:507,2\n230#1:509\n240#1:510\n242#1:511,4\n244#1:515,4\n249#1:519\n261#1:520,4\n274#1:524,4\n277#1:528,4\n316#1:532,4\n321#1:536\n348#1:537,2\n348#1:539,2\n348#1:541\n348#1:542,4\n378#1:546\n392#1:547\n417#1:548\n449#1:549,4\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Luk/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Luk/b;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Luk/b;-><init>()V

    .line 6
    .line 7
    sput-object v0, Luk/b;->a:Luk/b;

    .line 8
    return-void
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


# virtual methods
.method public final a(ZZZLrk/b;Lrk/b;Lrk/b;Lrk/b;)Lrk/b;
    .locals 3
    .param p4    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "inputDelegationPrice"

    .line 3
    .line 4
    .line 5
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "bestBid"

    .line 8
    .line 9
    .line 10
    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string v0, "bestAsk"

    .line 13
    .line 14
    .line 15
    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    const-string v0, "spread"

    .line 18
    .line 19
    .line 20
    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    const-string v0, "0"

    .line 23
    .line 24
    if-eqz p2, :cond_0

    .line 25
    .line 26
    new-instance v1, Lrk/b;

    .line 27
    .line 28
    .line 29
    invoke-direct {v1, v0}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p4, v1}, Lrk/b;->b(Lrk/b;)I

    .line 33
    move-result v1

    .line 34
    .line 35
    if-nez v1, :cond_0

    .line 36
    .line 37
    sget-object p1, Lrk/a;->a:Lrk/a;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Lrk/a;->b()Lrk/b;

    .line 41
    move-result-object p1

    .line 42
    return-object p1

    .line 43
    .line 44
    :cond_0
    new-instance v1, Lrk/b;

    .line 45
    .line 46
    const-string v2, "1000000"

    .line 47
    .line 48
    .line 49
    invoke-direct {v1, v2}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p4, v1}, Lrk/b;->b(Lrk/b;)I

    .line 53
    move-result v1

    .line 54
    .line 55
    if-lez v1, :cond_1

    .line 56
    .line 57
    new-instance p4, Lrk/b;

    .line 58
    .line 59
    .line 60
    invoke-direct {p4, v2}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    :cond_1
    sget-object v1, Lrk/a;->a:Lrk/a;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1}, Lrk/a;->a()Lrk/b;

    .line 66
    move-result-object v2

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2, p7}, Lrk/b;->g(Lrk/b;)Lrk/b;

    .line 70
    move-result-object v2

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1}, Lrk/a;->a()Lrk/b;

    .line 74
    move-result-object v1

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1, p7}, Lrk/b;->a(Lrk/b;)Lrk/b;

    .line 78
    move-result-object p7

    .line 79
    .line 80
    if-eqz p1, :cond_6

    .line 81
    .line 82
    if-eqz p2, :cond_4

    .line 83
    .line 84
    if-eqz p3, :cond_7

    .line 85
    .line 86
    new-instance p1, Lrk/b;

    .line 87
    .line 88
    .line 89
    invoke-direct {p1, v0}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p6, p1}, Lrk/b;->b(Lrk/b;)I

    .line 93
    move-result p1

    .line 94
    .line 95
    if-gtz p1, :cond_2

    .line 96
    goto :goto_0

    .line 97
    .line 98
    .line 99
    :cond_2
    invoke-virtual {p4, p6}, Lrk/b;->b(Lrk/b;)I

    .line 100
    move-result p1

    .line 101
    .line 102
    if-gez p1, :cond_3

    .line 103
    :goto_0
    move-object p6, p4

    .line 104
    .line 105
    .line 106
    :cond_3
    invoke-virtual {p6, v2}, Lrk/b;->e(Lrk/b;)Lrk/b;

    .line 107
    move-result-object p1

    .line 108
    return-object p1

    .line 109
    .line 110
    :cond_4
    if-eqz p3, :cond_5

    .line 111
    .line 112
    .line 113
    invoke-virtual {p6, v2}, Lrk/b;->e(Lrk/b;)Lrk/b;

    .line 114
    move-result-object p1

    .line 115
    return-object p1

    .line 116
    .line 117
    .line 118
    :cond_5
    invoke-virtual {p5, v2}, Lrk/b;->e(Lrk/b;)Lrk/b;

    .line 119
    move-result-object p1

    .line 120
    return-object p1

    .line 121
    .line 122
    :cond_6
    if-eqz p2, :cond_a

    .line 123
    .line 124
    if-eqz p3, :cond_8

    .line 125
    :cond_7
    return-object p4

    .line 126
    .line 127
    .line 128
    :cond_8
    invoke-virtual {p5, p4}, Lrk/b;->b(Lrk/b;)I

    .line 129
    move-result p1

    .line 130
    .line 131
    if-lez p1, :cond_9

    .line 132
    goto :goto_1

    .line 133
    :cond_9
    move-object p5, p4

    .line 134
    .line 135
    .line 136
    :goto_1
    invoke-virtual {p5, p7}, Lrk/b;->e(Lrk/b;)Lrk/b;

    .line 137
    move-result-object p1

    .line 138
    return-object p1

    .line 139
    .line 140
    :cond_a
    if-eqz p3, :cond_b

    .line 141
    .line 142
    .line 143
    invoke-virtual {p6, p7}, Lrk/b;->e(Lrk/b;)Lrk/b;

    .line 144
    move-result-object p1

    .line 145
    return-object p1

    .line 146
    .line 147
    .line 148
    :cond_b
    invoke-virtual {p5, p7}, Lrk/b;->e(Lrk/b;)Lrk/b;

    .line 149
    move-result-object p1

    .line 150
    return-object p1
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
.end method

.method public final b(ZLrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;)Lrk/b;
    .locals 19
    .param p2    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p7    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p8    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p9    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p10    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p11    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p12    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p13    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    move/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    move-object/from16 v4, p5

    move-object/from16 v5, p7

    move-object/from16 v6, p8

    move-object/from16 v7, p9

    move-object/from16 v8, p10

    move-object/from16 v9, p13

    const-string v10, "multiplier"

    invoke-static {v1, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "maxOrderQty"

    invoke-static {v2, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "orderQty"

    invoke-static {v3, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "positionQty"

    invoke-static {v4, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "estimatedPrice"

    invoke-static {v5, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "leverage"

    invoke-static {v6, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "maintainMarginRate"

    invoke-static {v7, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "liquidationFeeRate"

    invoke-static {v8, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "posCost"

    move-object/from16 v11, p11

    invoke-static {v11, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "posMargin"

    move-object/from16 v12, p12

    invoke-static {v12, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "taxRate"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v10, Lrk/a;->a:Lrk/a;

    invoke-virtual {v10}, Lrk/a;->b()Lrk/b;

    move-result-object v13

    invoke-virtual {v3, v13}, Lrk/b;->b(Lrk/b;)I

    move-result v13

    const-string v14, "-1"

    if-ltz v13, :cond_0

    move-object v13, v3

    goto :goto_0

    .line 2
    :cond_0
    new-instance v13, Lrk/b;

    invoke-direct {v13, v14}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v13}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v13

    .line 3
    :goto_0
    invoke-virtual {v13, v2}, Lrk/b;->b(Lrk/b;)I

    move-result v2

    const/4 v13, 0x0

    if-lez v2, :cond_1

    return-object v13

    .line 4
    :cond_1
    new-instance v2, Lrk/b;

    const-string v15, "0"

    invoke-direct {v2, v15}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Lrk/b;->b(Lrk/b;)I

    move-result v2

    const/16 v16, 0x0

    const/16 v17, 0x1

    if-ltz v2, :cond_2

    move/from16 v2, v17

    :goto_1
    move-object/from16 p3, v13

    goto :goto_2

    :cond_2
    move/from16 v2, v16

    goto :goto_1

    .line 5
    :goto_2
    new-instance v13, Lrk/b;

    invoke-direct {v13, v15}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v13}, Lrk/b;->b(Lrk/b;)I

    move-result v13

    if-ltz v13, :cond_3

    move/from16 v13, v17

    :goto_3
    move-object/from16 v18, v10

    goto :goto_4

    :cond_3
    move/from16 v13, v16

    goto :goto_3

    .line 6
    :goto_4
    sget-object v10, Luk/a;->a:Luk/a;

    invoke-virtual {v4, v3}, Lrk/b;->a(Lrk/b;)Lrk/b;

    move-result-object v11

    new-instance v12, Lrk/b;

    invoke-direct {v12, v15}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v12}, Lrk/b;->b(Lrk/b;)I

    move-result v11

    if-ltz v11, :cond_4

    move/from16 v11, v17

    goto :goto_5

    :cond_4
    move/from16 v11, v16

    :goto_5
    invoke-virtual {v10, v11, v0}, Luk/a;->b(ZZ)Lrk/b;

    move-result-object v10

    .line 7
    new-instance v11, Lrk/b;

    invoke-direct {v11, v15}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v11}, Lrk/b;->b(Lrk/b;)I

    move-result v11

    if-nez v11, :cond_5

    return-object p3

    .line 8
    :cond_5
    new-instance v11, Lrk/b;

    invoke-direct {v11, v15}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v11}, Lrk/b;->b(Lrk/b;)I

    move-result v11

    if-nez v11, :cond_6

    return-object p3

    .line 9
    :cond_6
    invoke-virtual/range {p4 .. p5}, Lrk/b;->a(Lrk/b;)Lrk/b;

    move-result-object v11

    .line 10
    new-instance v12, Lrk/b;

    invoke-direct {v12, v15}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v12}, Lrk/b;->b(Lrk/b;)I

    move-result v11

    if-nez v11, :cond_7

    return-object p3

    .line 11
    :cond_7
    invoke-virtual/range {v18 .. v18}, Lrk/a;->b()Lrk/b;

    move-result-object v11

    invoke-virtual {v3, v11}, Lrk/b;->b(Lrk/b;)I

    move-result v11

    if-ltz v11, :cond_8

    move-object v11, v3

    goto :goto_6

    .line 12
    :cond_8
    new-instance v11, Lrk/b;

    invoke-direct {v11, v14}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v11}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v11

    .line 13
    :goto_6
    invoke-virtual/range {v18 .. v18}, Lrk/a;->b()Lrk/b;

    move-result-object v12

    invoke-virtual {v4, v12}, Lrk/b;->b(Lrk/b;)I

    move-result v12

    if-ltz v12, :cond_9

    move-object v12, v4

    goto :goto_7

    .line 14
    :cond_9
    new-instance v12, Lrk/b;

    invoke-direct {v12, v14}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v12}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v12

    .line 15
    :goto_7
    invoke-virtual {v11, v12}, Lrk/b;->b(Lrk/b;)I

    move-result v11

    if-gez v11, :cond_a

    new-instance v11, Lrk/b;

    invoke-direct {v11, v15}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v11}, Lrk/b;->b(Lrk/b;)I

    move-result v11

    if-eqz v11, :cond_a

    if-eq v2, v13, :cond_a

    return-object p6

    .line 16
    :cond_a
    invoke-virtual/range {v18 .. v18}, Lrk/a;->b()Lrk/b;

    move-result-object v11

    invoke-virtual {v3, v11}, Lrk/b;->b(Lrk/b;)I

    move-result v11

    if-ltz v11, :cond_b

    move-object v11, v3

    goto :goto_8

    .line 17
    :cond_b
    new-instance v11, Lrk/b;

    invoke-direct {v11, v14}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v11}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v11

    .line 18
    :goto_8
    invoke-virtual/range {v18 .. v18}, Lrk/a;->b()Lrk/b;

    move-result-object v12

    invoke-virtual {v4, v12}, Lrk/b;->b(Lrk/b;)I

    move-result v12

    if-ltz v12, :cond_c

    move-object v12, v4

    goto :goto_9

    .line 19
    :cond_c
    new-instance v12, Lrk/b;

    invoke-direct {v12, v14}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v12}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v12

    .line 20
    :goto_9
    invoke-virtual {v11, v12}, Lrk/b;->b(Lrk/b;)I

    move-result v11

    const/16 v12, 0x14

    const-string v14, "1"

    if-lez v11, :cond_f

    new-instance v11, Lrk/b;

    invoke-direct {v11, v15}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v11}, Lrk/b;->b(Lrk/b;)I

    move-result v11

    if-eqz v11, :cond_f

    if-eq v2, v13, :cond_f

    .line 21
    :try_start_0
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 22
    new-instance v1, Lrk/b;

    invoke-direct {v1, v14}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 23
    invoke-virtual {v10, v7}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v2

    .line 24
    invoke-virtual {v1, v2}, Lrk/b;->g(Lrk/b;)Lrk/b;

    move-result-object v1

    .line 25
    invoke-virtual {v10, v8}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v2

    new-instance v3, Lrk/b;

    invoke-direct {v3, v14}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v9}, Lrk/b;->a(Lrk/b;)Lrk/b;

    move-result-object v3

    invoke-virtual {v2, v3}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v2

    .line 26
    invoke-virtual {v1, v2}, Lrk/b;->g(Lrk/b;)Lrk/b;

    move-result-object v1

    .line 27
    new-instance v2, Lrk/b;

    invoke-direct {v2, v14}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 28
    new-instance v3, Lrk/b;

    invoke-direct {v3, v14}, Lrk/b;-><init>(Ljava/lang/String;)V

    sget-object v4, Lcom/kubi/kmm/trade/KMMRoundingMode;->HALF_UP:Lcom/kubi/kmm/trade/KMMRoundingMode;

    const/16 v7, 0xa

    invoke-virtual {v3, v6, v7, v4}, Lrk/b;->c(Lrk/b;ILcom/kubi/kmm/trade/KMMRoundingMode;)Lrk/b;

    move-result-object v3

    .line 29
    invoke-virtual {v10, v3}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v3

    invoke-virtual {v2, v3}, Lrk/b;->g(Lrk/b;)Lrk/b;

    move-result-object v2

    if-eqz v0, :cond_d

    .line 30
    invoke-virtual {v1, v2, v12, v4}, Lrk/b;->c(Lrk/b;ILcom/kubi/kmm/trade/KMMRoundingMode;)Lrk/b;

    move-result-object v0

    goto :goto_a

    :catchall_0
    move-exception v0

    goto :goto_b

    .line 31
    :cond_d
    invoke-virtual {v2, v1, v12, v4}, Lrk/b;->c(Lrk/b;ILcom/kubi/kmm/trade/KMMRoundingMode;)Lrk/b;

    move-result-object v0

    .line 32
    :goto_a
    invoke-virtual {v0, v5}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v0

    .line 33
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_c

    :goto_b
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 34
    :goto_c
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_e

    move-object/from16 v13, p3

    goto :goto_d

    :cond_e
    move-object v13, v0

    :goto_d
    check-cast v13, Lrk/b;

    return-object v13

    :cond_f
    if-eq v2, v13, :cond_11

    .line 35
    new-instance v2, Lrk/b;

    invoke-direct {v2, v15}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Lrk/b;->b(Lrk/b;)I

    move-result v2

    if-nez v2, :cond_10

    goto :goto_e

    :cond_10
    return-object p3

    .line 36
    :cond_11
    :goto_e
    :try_start_1
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 37
    sget-object v2, Luk/b;->a:Luk/b;

    invoke-virtual {v2, v0, v1, v5, v3}, Luk/b;->g(ZLrk/b;Lrk/b;Lrk/b;)Lrk/b;

    move-result-object v2

    if-nez v2, :cond_12

    .line 38
    new-instance v2, Lrk/b;

    invoke-direct {v2, v15}, Lrk/b;-><init>(Ljava/lang/String;)V

    goto :goto_f

    :catchall_1
    move-exception v0

    goto :goto_11

    .line 39
    :cond_12
    :goto_f
    invoke-virtual/range {p11 .. p12}, Lrk/b;->g(Lrk/b;)Lrk/b;

    move-result-object v5

    invoke-virtual {v5, v2}, Lrk/b;->a(Lrk/b;)Lrk/b;

    move-result-object v5

    .line 40
    invoke-virtual {v10, v2}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v2

    .line 41
    sget-object v11, Lcom/kubi/kmm/trade/KMMRoundingMode;->HALF_UP:Lcom/kubi/kmm/trade/KMMRoundingMode;

    .line 42
    invoke-virtual {v2, v6, v12, v11}, Lrk/b;->c(Lrk/b;ILcom/kubi/kmm/trade/KMMRoundingMode;)Lrk/b;

    move-result-object v2

    .line 43
    invoke-virtual {v5, v2}, Lrk/b;->g(Lrk/b;)Lrk/b;

    move-result-object v2

    .line 44
    invoke-virtual {v4, v3}, Lrk/b;->a(Lrk/b;)Lrk/b;

    move-result-object v3

    invoke-virtual {v3, v1}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v1

    .line 45
    new-instance v3, Lrk/b;

    invoke-direct {v3, v14}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v7}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v4

    invoke-virtual {v3, v4}, Lrk/b;->g(Lrk/b;)Lrk/b;

    move-result-object v3

    .line 46
    invoke-virtual {v10, v8}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v4

    .line 47
    new-instance v5, Lrk/b;

    invoke-direct {v5, v14}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v9}, Lrk/b;->a(Lrk/b;)Lrk/b;

    move-result-object v5

    .line 48
    invoke-virtual {v4, v5}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v4

    .line 49
    invoke-virtual {v3, v4}, Lrk/b;->g(Lrk/b;)Lrk/b;

    move-result-object v3

    if-eqz v0, :cond_13

    .line 50
    invoke-virtual {v1, v3}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v0

    .line 51
    invoke-virtual {v0, v2, v12, v11}, Lrk/b;->c(Lrk/b;ILcom/kubi/kmm/trade/KMMRoundingMode;)Lrk/b;

    move-result-object v0

    goto :goto_10

    .line 52
    :cond_13
    invoke-virtual {v1, v3}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v0

    .line 53
    invoke-virtual {v2, v0, v12, v11}, Lrk/b;->c(Lrk/b;ILcom/kubi/kmm/trade/KMMRoundingMode;)Lrk/b;

    move-result-object v0

    .line 54
    :goto_10
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_12

    :goto_11
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 55
    :goto_12
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_14

    move-object/from16 v13, p3

    goto :goto_13

    :cond_14
    move-object v13, v0

    :goto_13
    check-cast v13, Lrk/b;

    return-object v13
.end method

.method public final c(ZLrk/b;ZLrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;)Lrk/b;
    .locals 16
    .param p2    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p8    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p9    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p10    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p11    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    move-object/from16 v0, p4

    move-object/from16 v1, p5

    move-object/from16 v2, p6

    move-object/from16 v3, p7

    const-string v4, "0"

    const-string v5, "multiplier"

    move-object/from16 v8, p2

    invoke-static {v8, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "availableBalance"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "maxClosePositionSize"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "positionQty"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "percent"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "estimatedPrice"

    move-object/from16 v10, p8

    invoke-static {v10, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "leverage"

    move-object/from16 v11, p9

    invoke-static {v11, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "takerFeeRate"

    move-object/from16 v14, p10

    invoke-static {v14, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "taxRate"

    move-object/from16 v15, p11

    invoke-static {v15, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    :try_start_0
    sget-object v5, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 2
    sget-object v6, Luk/b;->a:Luk/b;

    .line 3
    new-instance v12, Lrk/b;

    const-string v5, "1"

    invoke-direct {v12, v5}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 4
    new-instance v13, Lrk/b;

    invoke-direct {v13, v4}, Lrk/b;-><init>(Ljava/lang/String;)V

    move/from16 v7, p1

    move/from16 v9, p3

    .line 5
    invoke-virtual/range {v6 .. v15}, Luk/b;->d(ZLrk/b;ZLrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;)Lrk/b;

    move-result-object v5

    if-nez v5, :cond_0

    .line 6
    new-instance v5, Lrk/b;

    invoke-direct {v5, v4}, Lrk/b;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_5

    .line 7
    :cond_0
    :goto_0
    sget-object v6, Lcom/kubi/kmm/trade/KMMRoundingMode;->HALF_UP:Lcom/kubi/kmm/trade/KMMRoundingMode;

    const/16 v7, 0x14

    .line 8
    invoke-virtual {v0, v5, v7, v6}, Lrk/b;->c(Lrk/b;ILcom/kubi/kmm/trade/KMMRoundingMode;)Lrk/b;

    move-result-object v0

    .line 9
    new-instance v5, Lrk/b;

    invoke-direct {v5, v4}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v5}, Lrk/b;->b(Lrk/b;)I

    move-result v5

    if-nez v5, :cond_1

    goto :goto_4

    .line 10
    :cond_1
    new-instance v5, Lrk/b;

    invoke-direct {v5, v4}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v5}, Lrk/b;->b(Lrk/b;)I

    move-result v2

    if-lez v2, :cond_2

    const/4 v2, 0x1

    :goto_1
    move/from16 v9, p3

    goto :goto_2

    :cond_2
    const/4 v2, 0x0

    goto :goto_1

    :goto_2
    if-eq v2, v9, :cond_4

    .line 11
    sget-object v2, Lrk/a;->a:Lrk/a;

    invoke-virtual {v2}, Lrk/a;->b()Lrk/b;

    move-result-object v2

    invoke-virtual {v1, v2}, Lrk/b;->b(Lrk/b;)I

    move-result v2

    if-ltz v2, :cond_3

    goto :goto_3

    .line 12
    :cond_3
    new-instance v2, Lrk/b;

    const-string v4, "-1"

    invoke-direct {v2, v4}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v1

    .line 13
    :goto_3
    invoke-virtual {v0, v1}, Lrk/b;->a(Lrk/b;)Lrk/b;

    move-result-object v0

    .line 14
    :cond_4
    :goto_4
    invoke-virtual {v0, v3}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v0

    .line 15
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_6

    :goto_5
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 16
    :goto_6
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    const/4 v0, 0x0

    :cond_5
    check-cast v0, Lrk/b;

    return-object v0
.end method

.method public final d(ZLrk/b;ZLrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;)Lrk/b;
    .locals 3
    .param p2    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p8    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p9    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "1"

    const-string v1, "multiplier"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "estimatedPrice"

    invoke-static {p4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "leverage"

    invoke-static {p5, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "orderQty"

    invoke-static {p6, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "positionQty"

    invoke-static {p7, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "takerFeeRate"

    invoke-static {p8, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "taxRate"

    invoke-static {p9, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    :try_start_0
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 2
    sget-object v1, Luk/a;->a:Luk/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    const-string v2, "-1"

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    :try_start_1
    new-instance p3, Lrk/b;

    invoke-direct {p3, v2}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {p6, p3}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object p6

    .line 4
    :goto_0
    invoke-virtual {v1, p6, p7}, Luk/a;->a(Lrk/b;Lrk/b;)Lrk/b;

    move-result-object p3

    .line 5
    new-instance p6, Lrk/b;

    invoke-direct {p6, v0}, Lrk/b;-><init>(Ljava/lang/String;)V

    sget-object p7, Lcom/kubi/kmm/trade/KMMRoundingMode;->HALF_UP:Lcom/kubi/kmm/trade/KMMRoundingMode;

    const/16 v1, 0xa

    invoke-virtual {p6, p5, v1, p7}, Lrk/b;->c(Lrk/b;ILcom/kubi/kmm/trade/KMMRoundingMode;)Lrk/b;

    move-result-object p5

    .line 6
    new-instance p6, Lrk/b;

    invoke-direct {p6, v0}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {p6, p9}, Lrk/b;->a(Lrk/b;)Lrk/b;

    move-result-object p6

    .line 7
    invoke-virtual {p8, p6}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object p6

    .line 8
    invoke-virtual {p5, p6}, Lrk/b;->a(Lrk/b;)Lrk/b;

    move-result-object p5

    if-eqz p1, :cond_2

    .line 9
    invoke-virtual {p3, p2}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object p1

    .line 10
    sget-object p2, Lrk/a;->a:Lrk/a;

    invoke-virtual {p2}, Lrk/a;->b()Lrk/b;

    move-result-object p2

    invoke-virtual {p1, p2}, Lrk/b;->b(Lrk/b;)I

    move-result p2

    if-ltz p2, :cond_1

    goto :goto_1

    .line 11
    :cond_1
    new-instance p2, Lrk/b;

    invoke-direct {p2, v2}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object p1

    :goto_1
    const/16 p2, 0x14

    .line 12
    invoke-virtual {p1, p4, p2, p7}, Lrk/b;->c(Lrk/b;ILcom/kubi/kmm/trade/KMMRoundingMode;)Lrk/b;

    move-result-object p1

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_4

    .line 13
    :cond_2
    invoke-virtual {p3, p2}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object p1

    .line 14
    sget-object p2, Lrk/a;->a:Lrk/a;

    invoke-virtual {p2}, Lrk/a;->b()Lrk/b;

    move-result-object p2

    invoke-virtual {p1, p2}, Lrk/b;->b(Lrk/b;)I

    move-result p2

    if-ltz p2, :cond_3

    goto :goto_2

    .line 15
    :cond_3
    new-instance p2, Lrk/b;

    invoke-direct {p2, v2}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object p1

    .line 16
    :goto_2
    invoke-virtual {p4, p1}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object p1

    .line 17
    :goto_3
    invoke-virtual {p1, p5}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object p1

    .line 18
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_5

    :goto_4
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 19
    :goto_5
    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    const/4 p1, 0x0

    :cond_4
    check-cast p1, Lrk/b;

    return-object p1
.end method

.method public final e(Lrk/b;Lrk/b;Lrk/b;)Lrk/b;
    .locals 3
    .param p1    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    :try_start_0
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 4
    .line 5
    if-eqz p1, :cond_4

    .line 6
    .line 7
    sget-object v1, Lrk/a;->a:Lrk/a;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Lrk/a;->b()Lrk/b;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v1}, Lrk/b;->b(Lrk/b;)I

    .line 15
    move-result v1

    .line 16
    .line 17
    if-ltz v1, :cond_0

    .line 18
    move-object v1, p1

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v1, Lrk/b;

    .line 22
    .line 23
    const-string v2, "-1"

    .line 24
    .line 25
    .line 26
    invoke-direct {v1, v2}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, v1}, Lrk/b;->e(Lrk/b;)Lrk/b;

    .line 30
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    :goto_0
    if-eqz v1, :cond_4

    .line 33
    .line 34
    const-string v2, "0"

    .line 35
    .line 36
    if-eqz p2, :cond_2

    .line 37
    .line 38
    .line 39
    :try_start_1
    invoke-virtual {p2, p1}, Lrk/b;->a(Lrk/b;)Lrk/b;

    .line 40
    move-result-object p1

    .line 41
    .line 42
    if-eqz p1, :cond_2

    .line 43
    .line 44
    if-nez p3, :cond_1

    .line 45
    .line 46
    new-instance p3, Lrk/b;

    .line 47
    .line 48
    .line 49
    invoke-direct {p3, v2}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 50
    goto :goto_1

    .line 51
    :catchall_0
    move-exception p1

    .line 52
    goto :goto_3

    .line 53
    .line 54
    .line 55
    :cond_1
    :goto_1
    invoke-virtual {p1, p3}, Lrk/b;->g(Lrk/b;)Lrk/b;

    .line 56
    move-result-object p1

    .line 57
    .line 58
    if-nez p1, :cond_3

    .line 59
    .line 60
    :cond_2
    new-instance p1, Lrk/b;

    .line 61
    .line 62
    .line 63
    invoke-direct {p1, v2}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    :cond_3
    sget-object p2, Lcom/kubi/kmm/trade/KMMRoundingMode;->HALF_UP:Lcom/kubi/kmm/trade/KMMRoundingMode;

    .line 66
    .line 67
    const/16 p3, 0x14

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1, p1, p3, p2}, Lrk/b;->c(Lrk/b;ILcom/kubi/kmm/trade/KMMRoundingMode;)Lrk/b;

    .line 71
    move-result-object p1

    .line 72
    .line 73
    if-eqz p1, :cond_4

    .line 74
    .line 75
    sget-object p2, Lcom/kubi/kmm/trade/KMMRoundingMode;->UP:Lcom/kubi/kmm/trade/KMMRoundingMode;

    .line 76
    const/4 p3, 0x2

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1, p3, p2}, Lrk/b;->f(ILcom/kubi/kmm/trade/KMMRoundingMode;)Lrk/b;

    .line 80
    move-result-object p1

    .line 81
    goto :goto_2

    .line 82
    :cond_4
    move-object p1, v0

    .line 83
    .line 84
    .line 85
    :goto_2
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 87
    goto :goto_4

    .line 88
    .line 89
    :goto_3
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 90
    .line 91
    .line 92
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 93
    move-result-object p1

    .line 94
    .line 95
    .line 96
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    move-result-object p1

    .line 98
    .line 99
    .line 100
    :goto_4
    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 101
    move-result p2

    .line 102
    .line 103
    if-eqz p2, :cond_5

    .line 104
    goto :goto_5

    .line 105
    :cond_5
    move-object v0, p1

    .line 106
    .line 107
    :goto_5
    check-cast v0, Lrk/b;

    .line 108
    return-object v0
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
.end method

.method public final f(ZLrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;)Lrk/b;
    .locals 3
    .param p2    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    const-string v0, "0"

    .line 3
    .line 4
    const-string v1, "markPrice"

    .line 5
    .line 6
    .line 7
    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    const-string v1, "positionQty"

    .line 10
    .line 11
    .line 12
    invoke-static {p3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    const-string v1, "multiplier"

    .line 15
    .line 16
    .line 17
    invoke-static {p4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    const-string v1, "aggRate"

    .line 20
    .line 21
    .line 22
    invoke-static {p5, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    const-string v1, "positionTotalMargin"

    .line 25
    .line 26
    .line 27
    invoke-static {p6, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    :try_start_0
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 30
    .line 31
    sget-object v1, Luk/a;->a:Luk/a;

    .line 32
    .line 33
    new-instance v2, Lrk/b;

    .line 34
    .line 35
    .line 36
    invoke-direct {v2, v0}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p3, v2}, Lrk/b;->b(Lrk/b;)I

    .line 40
    move-result v2

    .line 41
    .line 42
    if-ltz v2, :cond_0

    .line 43
    const/4 v2, 0x1

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const/4 v2, 0x0

    .line 46
    .line 47
    .line 48
    :goto_0
    invoke-virtual {v1, v2, p1}, Luk/a;->b(ZZ)Lrk/b;

    .line 49
    move-result-object v1

    .line 50
    .line 51
    if-eqz p1, :cond_1

    .line 52
    .line 53
    .line 54
    invoke-virtual {p3, p4}, Lrk/b;->e(Lrk/b;)Lrk/b;

    .line 55
    move-result-object p1

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, v1}, Lrk/b;->e(Lrk/b;)Lrk/b;

    .line 59
    move-result-object p1

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1, p5}, Lrk/b;->e(Lrk/b;)Lrk/b;

    .line 63
    move-result-object p1

    .line 64
    .line 65
    sget-object p3, Lcom/kubi/kmm/trade/KMMRoundingMode;->HALF_UP:Lcom/kubi/kmm/trade/KMMRoundingMode;

    .line 66
    .line 67
    const/16 p4, 0x14

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1, p2, p4, p3}, Lrk/b;->c(Lrk/b;ILcom/kubi/kmm/trade/KMMRoundingMode;)Lrk/b;

    .line 71
    move-result-object p1

    .line 72
    goto :goto_1

    .line 73
    :catchall_0
    move-exception p1

    .line 74
    goto :goto_2

    .line 75
    .line 76
    .line 77
    :cond_1
    invoke-virtual {p2, p3}, Lrk/b;->e(Lrk/b;)Lrk/b;

    .line 78
    move-result-object p1

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1, p4}, Lrk/b;->e(Lrk/b;)Lrk/b;

    .line 82
    move-result-object p1

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1, v1}, Lrk/b;->e(Lrk/b;)Lrk/b;

    .line 86
    move-result-object p1

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1, p5}, Lrk/b;->e(Lrk/b;)Lrk/b;

    .line 90
    move-result-object p1

    .line 91
    .line 92
    :goto_1
    sget-object p2, Lcom/kubi/kmm/trade/KMMRoundingMode;->UP:Lcom/kubi/kmm/trade/KMMRoundingMode;

    .line 93
    const/4 p3, 0x4

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, p6, p3, p2}, Lrk/b;->c(Lrk/b;ILcom/kubi/kmm/trade/KMMRoundingMode;)Lrk/b;

    .line 97
    move-result-object p1

    .line 98
    .line 99
    .line 100
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 102
    goto :goto_3

    .line 103
    .line 104
    :goto_2
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 105
    .line 106
    .line 107
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 108
    move-result-object p1

    .line 109
    .line 110
    .line 111
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    move-result-object p1

    .line 113
    .line 114
    .line 115
    :goto_3
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 116
    move-result-object p2

    .line 117
    const/4 p3, 0x0

    .line 118
    .line 119
    if-nez p2, :cond_2

    .line 120
    goto :goto_4

    .line 121
    :cond_2
    move-object p1, p3

    .line 122
    .line 123
    :goto_4
    check-cast p1, Lrk/b;

    .line 124
    .line 125
    if-eqz p1, :cond_4

    .line 126
    .line 127
    new-instance p2, Lrk/b;

    .line 128
    .line 129
    .line 130
    invoke-direct {p2, v0}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p1, p2}, Lrk/b;->b(Lrk/b;)I

    .line 134
    move-result p2

    .line 135
    .line 136
    if-gez p2, :cond_3

    .line 137
    .line 138
    new-instance p1, Lrk/b;

    .line 139
    .line 140
    const-string p2, "1"

    .line 141
    .line 142
    .line 143
    invoke-direct {p1, p2}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 144
    :cond_3
    move-object p3, p1

    .line 145
    :cond_4
    return-object p3
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
.end method

.method public final g(ZLrk/b;Lrk/b;Lrk/b;)Lrk/b;
    .locals 1
    .param p2    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    const-string v0, "multiplier"

    .line 3
    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "price"

    .line 8
    .line 9
    .line 10
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string v0, "qty"

    .line 13
    .line 14
    .line 15
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    .line 22
    invoke-virtual {p4, p2}, Lrk/b;->e(Lrk/b;)Lrk/b;

    .line 23
    move-result-object p1

    .line 24
    .line 25
    sget-object p2, Lcom/kubi/kmm/trade/KMMRoundingMode;->HALF_UP:Lcom/kubi/kmm/trade/KMMRoundingMode;

    .line 26
    .line 27
    const/16 p4, 0x14

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, p3, p4, p2}, Lrk/b;->c(Lrk/b;ILcom/kubi/kmm/trade/KMMRoundingMode;)Lrk/b;

    .line 31
    move-result-object p1

    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception p1

    .line 34
    goto :goto_1

    .line 35
    .line 36
    .line 37
    :cond_0
    invoke-virtual {p3, p4}, Lrk/b;->e(Lrk/b;)Lrk/b;

    .line 38
    move-result-object p1

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, p2}, Lrk/b;->e(Lrk/b;)Lrk/b;

    .line 42
    move-result-object p1

    .line 43
    .line 44
    .line 45
    :goto_0
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    goto :goto_2

    .line 48
    .line 49
    :goto_1
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 50
    .line 51
    .line 52
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 53
    move-result-object p1

    .line 54
    .line 55
    .line 56
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    move-result-object p1

    .line 58
    .line 59
    .line 60
    :goto_2
    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 61
    move-result p2

    .line 62
    .line 63
    if-eqz p2, :cond_1

    .line 64
    const/4 p1, 0x0

    .line 65
    .line 66
    :cond_1
    check-cast p1, Lrk/b;

    .line 67
    return-object p1
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
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
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
.end method
