.class public final Lcom/kubi/tradebase/orderbook/b;
.super Ljava/lang/Object;
.source "OrderBookDataHelper.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0000\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J>\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u000c2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\tJ,\u0010\u0011\u001a\u00020\u0005*\u00020\u00052\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000c2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\tH\u0002J:\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u000e2\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00160\u00150\u000e2\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u001c\u0010\u0019\u001a\u00020\u001a*\u00020\u00162\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002J\u001a\u0010\u001b\u001a\u00020\u001a*\u00020\u00162\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0008\u001a\u00020\t\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/kubi/tradebase/orderbook/OrderBookDataHelper;",
        "",
        "<init>",
        "()V",
        "convertDisplayData",
        "Lcom/kubi/tradebase/orderbook/DisplayOrderBookData;",
        "orderData",
        "Lcom/kubi/tradebase/orderbook/IOrderBookData;",
        "pricePrecision",
        "",
        "amountPrecision",
        "orderBookType",
        "Lcom/kubi/resources/widget/OrderBookType;",
        "delegationPriceList",
        "",
        "Lcom/kubi/tradebase/orderbook/OrderBookDelegation;",
        "defaultSize",
        "calculateProgressWithMaxAndMarkDelegation",
        "buildOrderBookData",
        "Lcom/kubi/tradebase/orderbook/OrderBookItemData;",
        "data",
        "",
        "Ljava/math/BigDecimal;",
        "isBids",
        "",
        "formatterDisplayAmount",
        "",
        "formatterOrderBookPrice",
        "getTextSizeByPricePrecision",
        "",
        "TradeBaseLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nOrderBookDataHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderBookDataHelper.kt\ncom/kubi/tradebase/orderbook/OrderBookDataHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,238:1\n1563#2:239\n1634#2,3:240\n1999#2,14:243\n1563#2:257\n1634#2,3:258\n1999#2,14:261\n1563#2:275\n1634#2,3:276\n1999#2,14:279\n1563#2:293\n1634#2,3:294\n1999#2,14:297\n1869#2:311\n1870#2:313\n1869#2,2:314\n1869#2,2:316\n1068#2:318\n1056#2:319\n1563#2:320\n1634#2,3:321\n1878#2,3:324\n1#3:312\n*S KotlinDebug\n*F\n+ 1 OrderBookDataHelper.kt\ncom/kubi/tradebase/orderbook/OrderBookDataHelper\n*L\n83#1:239\n83#1:240,3\n84#1:243,14\n86#1:257\n86#1:258,3\n87#1:261,14\n90#1:275\n90#1:276,3\n90#1:279,14\n93#1:293\n93#1:294,3\n93#1:297,14\n96#1:311\n96#1:313\n106#1:314,2\n135#1:316,2\n145#1:318\n147#1:319\n148#1:320\n148#1:321,3\n162#1:324,3\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Lcom/kubi/tradebase/orderbook/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/tradebase/orderbook/b;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/tradebase/orderbook/b;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/kubi/tradebase/orderbook/b;->a:Lcom/kubi/tradebase/orderbook/b;

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
.end method


# virtual methods
.method public final a(Ljava/util/List;IIZ)Ljava/util/List;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "[",
            "Ljava/math/BigDecimal;",
            ">;IIZ)",
            "Ljava/util/List<",
            "Lcom/kubi/tradebase/orderbook/OrderBookItemData;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    move/from16 v0, p2

    .line 3
    .line 4
    move/from16 v1, p3

    .line 5
    .line 6
    move/from16 v2, p4

    .line 7
    .line 8
    new-instance v3, Ljava/util/HashMap;

    .line 9
    .line 10
    .line 11
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-interface/range {p1 .. p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    move-result-object v4

    .line 16
    .line 17
    .line 18
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    move-result v5

    .line 20
    .line 21
    const-string v6, "add(...)"

    .line 22
    const/4 v7, 0x0

    .line 23
    const/4 v8, 0x1

    .line 24
    .line 25
    if-eqz v5, :cond_1

    .line 26
    .line 27
    .line 28
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    move-result-object v5

    .line 30
    .line 31
    check-cast v5, [Ljava/math/BigDecimal;

    .line 32
    .line 33
    sget-object v9, Lcom/kubi/tradebase/orderbook/b;->a:Lcom/kubi/tradebase/orderbook/b;

    .line 34
    .line 35
    aget-object v7, v5, v7

    .line 36
    .line 37
    .line 38
    invoke-virtual {v9, v7, v0, v2}, Lcom/kubi/tradebase/orderbook/b;->e(Ljava/math/BigDecimal;IZ)Ljava/lang/String;

    .line 39
    move-result-object v7

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3, v7}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 43
    move-result v9

    .line 44
    .line 45
    if-eqz v9, :cond_0

    .line 46
    .line 47
    .line 48
    invoke-virtual {v3, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    move-result-object v9

    .line 50
    .line 51
    .line 52
    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 53
    .line 54
    check-cast v9, Ljava/math/BigDecimal;

    .line 55
    .line 56
    aget-object v5, v5, v8

    .line 57
    .line 58
    .line 59
    invoke-virtual {v9, v5}, Ljava/math/BigDecimal;->add(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 60
    move-result-object v5

    .line 61
    .line 62
    .line 63
    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-interface {v3, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    goto :goto_0

    .line 68
    .line 69
    :cond_0
    aget-object v5, v5, v8

    .line 70
    .line 71
    .line 72
    invoke-interface {v3, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    goto :goto_0

    .line 74
    .line 75
    :cond_1
    sget-object v4, Lcom/kubi/tradebase/orderbook/b;->a:Lcom/kubi/tradebase/orderbook/b;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v4, v0}, Lcom/kubi/tradebase/orderbook/b;->f(I)F

    .line 79
    move-result v15

    .line 80
    .line 81
    const-string v4, "<get-keys>(...)"

    .line 82
    .line 83
    if-eqz v2, :cond_2

    .line 84
    .line 85
    .line 86
    invoke-virtual {v3}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 87
    move-result-object v2

    .line 88
    .line 89
    .line 90
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    .line 92
    new-instance v4, Lcom/kubi/tradebase/orderbook/b$b;

    .line 93
    .line 94
    .line 95
    invoke-direct {v4}, Lcom/kubi/tradebase/orderbook/b$b;-><init>()V

    .line 96
    .line 97
    .line 98
    invoke-static {v2, v4}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 99
    move-result-object v2

    .line 100
    goto :goto_1

    .line 101
    .line 102
    .line 103
    :cond_2
    invoke-virtual {v3}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 104
    move-result-object v2

    .line 105
    .line 106
    .line 107
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    .line 109
    new-instance v4, Lcom/kubi/tradebase/orderbook/b$a;

    .line 110
    .line 111
    .line 112
    invoke-direct {v4}, Lcom/kubi/tradebase/orderbook/b$a;-><init>()V

    .line 113
    .line 114
    .line 115
    invoke-static {v2, v4}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 116
    move-result-object v2

    .line 117
    .line 118
    :goto_1
    new-instance v4, Ljava/util/ArrayList;

    .line 119
    .line 120
    const/16 v5, 0xa

    .line 121
    .line 122
    .line 123
    invoke-static {v2, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 124
    move-result v5

    .line 125
    .line 126
    .line 127
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 128
    .line 129
    .line 130
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 131
    move-result-object v2

    .line 132
    .line 133
    .line 134
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 135
    move-result v5

    .line 136
    const/4 v9, 0x0

    .line 137
    .line 138
    if-eqz v5, :cond_3

    .line 139
    .line 140
    .line 141
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 142
    move-result-object v5

    .line 143
    move-object v10, v5

    .line 144
    .line 145
    check-cast v10, Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v3, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    move-result-object v5

    .line 150
    .line 151
    check-cast v5, Ljava/math/BigDecimal;

    .line 152
    .line 153
    .line 154
    invoke-static {v5, v9, v8, v9}, Lkf/a;->G(Ljava/math/BigDecimal;Ljava/lang/String;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 155
    move-result-object v5

    .line 156
    .line 157
    new-instance v9, Lcom/kubi/tradebase/orderbook/OrderBookItemData;

    .line 158
    .line 159
    new-instance v11, Lcom/kubi/tradebase/orderbook/DisPlayAmount;

    .line 160
    .line 161
    sget-object v12, Lcom/kubi/tradebase/orderbook/b;->a:Lcom/kubi/tradebase/orderbook/b;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v12, v5, v0, v1}, Lcom/kubi/tradebase/orderbook/b;->d(Ljava/math/BigDecimal;II)Ljava/lang/String;

    .line 165
    move-result-object v12

    .line 166
    .line 167
    .line 168
    invoke-direct {v11, v12, v5}, Lcom/kubi/tradebase/orderbook/DisPlayAmount;-><init>(Ljava/lang/String;Ljava/math/BigDecimal;)V

    .line 169
    .line 170
    const/16 v16, 0x1c

    .line 171
    .line 172
    const/16 v17, 0x0

    .line 173
    const/4 v12, 0x0

    .line 174
    const/4 v13, 0x0

    .line 175
    const/4 v14, 0x0

    .line 176
    .line 177
    .line 178
    invoke-direct/range {v9 .. v17}, Lcom/kubi/tradebase/orderbook/OrderBookItemData;-><init>(Ljava/lang/String;Lcom/kubi/tradebase/orderbook/DisPlayAmount;Lcom/kubi/tradebase/orderbook/DisPlayAmount;FZFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 179
    .line 180
    .line 181
    invoke-interface {v4, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 182
    goto :goto_2

    .line 183
    .line 184
    .line 185
    :cond_3
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 186
    move-result-object v2

    .line 187
    .line 188
    .line 189
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 190
    move-result v3

    .line 191
    .line 192
    if-eqz v3, :cond_c

    .line 193
    .line 194
    .line 195
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 196
    move-result-object v3

    .line 197
    .line 198
    add-int/lit8 v5, v7, 0x1

    .line 199
    .line 200
    if-gez v7, :cond_4

    .line 201
    .line 202
    .line 203
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    .line 204
    .line 205
    :cond_4
    check-cast v3, Lcom/kubi/tradebase/orderbook/OrderBookItemData;

    .line 206
    .line 207
    if-nez v7, :cond_6

    .line 208
    .line 209
    .line 210
    invoke-virtual {v3}, Lcom/kubi/tradebase/orderbook/OrderBookItemData;->getTotalAmount()Lcom/kubi/tradebase/orderbook/DisPlayAmount;

    .line 211
    move-result-object v7

    .line 212
    .line 213
    if-eqz v7, :cond_9

    .line 214
    .line 215
    .line 216
    invoke-virtual {v3}, Lcom/kubi/tradebase/orderbook/OrderBookItemData;->getSingleAmount()Lcom/kubi/tradebase/orderbook/DisPlayAmount;

    .line 217
    move-result-object v10

    .line 218
    .line 219
    if-eqz v10, :cond_5

    .line 220
    .line 221
    .line 222
    invoke-virtual {v10}, Lcom/kubi/tradebase/orderbook/DisPlayAmount;->getValueAmount()Ljava/math/BigDecimal;

    .line 223
    move-result-object v10

    .line 224
    goto :goto_4

    .line 225
    :cond_5
    move-object v10, v9

    .line 226
    .line 227
    .line 228
    :goto_4
    invoke-static {v10, v9, v8, v9}, Lkf/a;->G(Ljava/math/BigDecimal;Ljava/lang/String;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 229
    move-result-object v10

    .line 230
    .line 231
    .line 232
    invoke-virtual {v7, v10}, Lcom/kubi/tradebase/orderbook/DisPlayAmount;->setValueAmount(Ljava/math/BigDecimal;)V

    .line 233
    goto :goto_7

    .line 234
    .line 235
    .line 236
    :cond_6
    invoke-virtual {v3}, Lcom/kubi/tradebase/orderbook/OrderBookItemData;->getTotalAmount()Lcom/kubi/tradebase/orderbook/DisPlayAmount;

    .line 237
    move-result-object v10

    .line 238
    .line 239
    if-eqz v10, :cond_9

    .line 240
    .line 241
    .line 242
    invoke-virtual {v3}, Lcom/kubi/tradebase/orderbook/OrderBookItemData;->getSingleAmount()Lcom/kubi/tradebase/orderbook/DisPlayAmount;

    .line 243
    move-result-object v11

    .line 244
    .line 245
    if-eqz v11, :cond_8

    .line 246
    .line 247
    .line 248
    invoke-virtual {v11}, Lcom/kubi/tradebase/orderbook/DisPlayAmount;->getValueAmount()Ljava/math/BigDecimal;

    .line 249
    move-result-object v11

    .line 250
    .line 251
    if-eqz v11, :cond_8

    .line 252
    .line 253
    add-int/lit8 v7, v7, -0x1

    .line 254
    .line 255
    .line 256
    invoke-interface {v4, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 257
    move-result-object v7

    .line 258
    .line 259
    check-cast v7, Lcom/kubi/tradebase/orderbook/OrderBookItemData;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v7}, Lcom/kubi/tradebase/orderbook/OrderBookItemData;->getTotalAmount()Lcom/kubi/tradebase/orderbook/DisPlayAmount;

    .line 263
    move-result-object v7

    .line 264
    .line 265
    if-eqz v7, :cond_7

    .line 266
    .line 267
    .line 268
    invoke-virtual {v7}, Lcom/kubi/tradebase/orderbook/DisPlayAmount;->getValueAmount()Ljava/math/BigDecimal;

    .line 269
    move-result-object v7

    .line 270
    goto :goto_5

    .line 271
    :cond_7
    move-object v7, v9

    .line 272
    .line 273
    .line 274
    :goto_5
    invoke-static {v7, v9, v8, v9}, Lkf/a;->G(Ljava/math/BigDecimal;Ljava/lang/String;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 275
    move-result-object v7

    .line 276
    .line 277
    .line 278
    invoke-virtual {v11, v7}, Ljava/math/BigDecimal;->add(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 279
    move-result-object v7

    .line 280
    .line 281
    .line 282
    invoke-static {v7, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 283
    goto :goto_6

    .line 284
    :cond_8
    move-object v7, v9

    .line 285
    .line 286
    .line 287
    :goto_6
    invoke-static {v7, v9, v8, v9}, Lkf/a;->G(Ljava/math/BigDecimal;Ljava/lang/String;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 288
    move-result-object v7

    .line 289
    .line 290
    .line 291
    invoke-virtual {v10, v7}, Lcom/kubi/tradebase/orderbook/DisPlayAmount;->setValueAmount(Ljava/math/BigDecimal;)V

    .line 292
    .line 293
    .line 294
    :cond_9
    :goto_7
    invoke-virtual {v3}, Lcom/kubi/tradebase/orderbook/OrderBookItemData;->getTotalAmount()Lcom/kubi/tradebase/orderbook/DisPlayAmount;

    .line 295
    move-result-object v7

    .line 296
    .line 297
    if-eqz v7, :cond_b

    .line 298
    .line 299
    .line 300
    invoke-virtual {v3}, Lcom/kubi/tradebase/orderbook/OrderBookItemData;->getTotalAmount()Lcom/kubi/tradebase/orderbook/DisPlayAmount;

    .line 301
    move-result-object v3

    .line 302
    .line 303
    if-eqz v3, :cond_a

    .line 304
    .line 305
    .line 306
    invoke-virtual {v3}, Lcom/kubi/tradebase/orderbook/DisPlayAmount;->getValueAmount()Ljava/math/BigDecimal;

    .line 307
    move-result-object v3

    .line 308
    .line 309
    if-eqz v3, :cond_a

    .line 310
    .line 311
    sget-object v10, Lcom/kubi/tradebase/orderbook/b;->a:Lcom/kubi/tradebase/orderbook/b;

    .line 312
    .line 313
    .line 314
    invoke-virtual {v10, v3, v0, v1}, Lcom/kubi/tradebase/orderbook/b;->d(Ljava/math/BigDecimal;II)Ljava/lang/String;

    .line 315
    move-result-object v3

    .line 316
    goto :goto_8

    .line 317
    :cond_a
    move-object v3, v9

    .line 318
    .line 319
    .line 320
    :goto_8
    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 321
    move-result-object v3

    .line 322
    .line 323
    .line 324
    invoke-virtual {v7, v3}, Lcom/kubi/tradebase/orderbook/DisPlayAmount;->setDisplayAmount(Ljava/lang/String;)V

    .line 325
    :cond_b
    move v7, v5

    .line 326
    .line 327
    goto/16 :goto_3

    .line 328
    :cond_c
    return-object v4
.end method

.method public final b(Lcom/kubi/tradebase/orderbook/DisplayOrderBookData;Lcom/kubi/resources/widget/OrderBookType;Ljava/util/List;I)Lcom/kubi/tradebase/orderbook/DisplayOrderBookData;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/tradebase/orderbook/DisplayOrderBookData;",
            "Lcom/kubi/resources/widget/OrderBookType;",
            "Ljava/util/List<",
            "Lcom/kubi/tradebase/orderbook/OrderBookDelegation;",
            ">;I)",
            "Lcom/kubi/tradebase/orderbook/DisplayOrderBookData;"
        }
    .end annotation

    move-object/from16 v0, p2

    move/from16 v1, p4

    .line 1
    sget-object v2, Lcom/kubi/resources/widget/OrderBookType$a;->b:Lcom/kubi/resources/widget/OrderBookType$a;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/16 v3, 0xa

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_c

    .line 2
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/tradebase/orderbook/DisplayOrderBookData;->getDisplayBids()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->take(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v0

    .line 3
    new-instance v2, Ljava/util/ArrayList;

    invoke-static {v0, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v2, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 4
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .line 5
    check-cast v6, Lcom/kubi/tradebase/orderbook/OrderBookItemData;

    .line 6
    invoke-virtual {v6}, Lcom/kubi/tradebase/orderbook/OrderBookItemData;->getTotalAmount()Lcom/kubi/tradebase/orderbook/DisPlayAmount;

    move-result-object v6

    if-eqz v6, :cond_0

    invoke-virtual {v6}, Lcom/kubi/tradebase/orderbook/DisPlayAmount;->getValueAmount()Ljava/math/BigDecimal;

    move-result-object v6

    goto :goto_1

    :cond_0
    move-object v6, v5

    :goto_1
    invoke-static {v6, v5, v4, v5}, Lkf/a;->G(Ljava/math/BigDecimal;Ljava/lang/String;ILjava/lang/Object;)Ljava/math/BigDecimal;

    move-result-object v6

    .line 7
    invoke-interface {v2, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 8
    :cond_1
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 9
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_2

    move-object v0, v5

    goto :goto_2

    .line 10
    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 11
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-nez v6, :cond_3

    goto :goto_2

    .line 12
    :cond_3
    move-object v6, v0

    check-cast v6, Ljava/math/BigDecimal;

    .line 13
    :cond_4
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 14
    move-object v8, v7

    check-cast v8, Ljava/math/BigDecimal;

    .line 15
    invoke-interface {v6, v8}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v9

    if-gez v9, :cond_5

    move-object v0, v7

    move-object v6, v8

    .line 16
    :cond_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-nez v7, :cond_4

    .line 17
    :goto_2
    check-cast v0, Ljava/math/BigDecimal;

    .line 18
    invoke-static {v0}, Lcom/kubi/utils/extensions/d;->g(Ljava/math/BigDecimal;)D

    move-result-wide v7

    .line 19
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/tradebase/orderbook/DisplayOrderBookData;->getDisplayAsks()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->take(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v0

    .line 20
    new-instance v1, Ljava/util/ArrayList;

    invoke-static {v0, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 21
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 22
    check-cast v2, Lcom/kubi/tradebase/orderbook/OrderBookItemData;

    .line 23
    invoke-virtual {v2}, Lcom/kubi/tradebase/orderbook/OrderBookItemData;->getTotalAmount()Lcom/kubi/tradebase/orderbook/DisPlayAmount;

    move-result-object v2

    if-eqz v2, :cond_6

    invoke-virtual {v2}, Lcom/kubi/tradebase/orderbook/DisPlayAmount;->getValueAmount()Ljava/math/BigDecimal;

    move-result-object v2

    goto :goto_4

    :cond_6
    move-object v2, v5

    :goto_4
    invoke-static {v2, v5, v4, v5}, Lkf/a;->G(Ljava/math/BigDecimal;Ljava/lang/String;ILjava/lang/Object;)Ljava/math/BigDecimal;

    move-result-object v2

    .line 24
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 25
    :cond_7
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    .line 26
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_8

    move-object v0, v5

    goto :goto_5

    .line 27
    :cond_8
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 28
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_9

    goto :goto_5

    .line 29
    :cond_9
    move-object v1, v0

    check-cast v1, Ljava/math/BigDecimal;

    .line 30
    :cond_a
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 31
    move-object v3, v2

    check-cast v3, Ljava/math/BigDecimal;

    .line 32
    invoke-interface {v1, v3}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v6

    if-gez v6, :cond_b

    move-object v0, v2

    move-object v1, v3

    .line 33
    :cond_b
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_a

    .line 34
    :goto_5
    check-cast v0, Ljava/math/BigDecimal;

    .line 35
    invoke-static {v0}, Lcom/kubi/utils/extensions/d;->g(Ljava/math/BigDecimal;)D

    move-result-wide v0

    .line 36
    invoke-static {v7, v8, v0, v1}, Ljava/lang/Math;->max(DD)D

    move-result-wide v0

    .line 37
    new-instance v2, Ljava/math/BigDecimal;

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    goto/16 :goto_c

    .line 38
    :cond_c
    sget-object v1, Lcom/kubi/resources/widget/OrderBookType$b;->b:Lcom/kubi/resources/widget/OrderBookType$b;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_13

    .line 39
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/tradebase/orderbook/DisplayOrderBookData;->getDisplayBids()Ljava/util/List;

    move-result-object v0

    .line 40
    new-instance v1, Ljava/util/ArrayList;

    invoke-static {v0, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 41
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_e

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 42
    check-cast v2, Lcom/kubi/tradebase/orderbook/OrderBookItemData;

    .line 43
    invoke-virtual {v2}, Lcom/kubi/tradebase/orderbook/OrderBookItemData;->getTotalAmount()Lcom/kubi/tradebase/orderbook/DisPlayAmount;

    move-result-object v2

    if-eqz v2, :cond_d

    invoke-virtual {v2}, Lcom/kubi/tradebase/orderbook/DisPlayAmount;->getValueAmount()Ljava/math/BigDecimal;

    move-result-object v2

    goto :goto_7

    :cond_d
    move-object v2, v5

    :goto_7
    invoke-static {v2, v5, v4, v5}, Lkf/a;->G(Ljava/math/BigDecimal;Ljava/lang/String;ILjava/lang/Object;)Ljava/math/BigDecimal;

    move-result-object v2

    .line 44
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_6

    .line 45
    :cond_e
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 46
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_f

    move-object v1, v5

    goto :goto_8

    .line 47
    :cond_f
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 48
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_10

    goto :goto_8

    .line 49
    :cond_10
    move-object v2, v1

    check-cast v2, Ljava/math/BigDecimal;

    .line 50
    :cond_11
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 51
    move-object v6, v3

    check-cast v6, Ljava/math/BigDecimal;

    .line 52
    invoke-interface {v2, v6}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v7

    if-gez v7, :cond_12

    move-object v1, v3

    move-object v2, v6

    .line 53
    :cond_12
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_11

    .line 54
    :goto_8
    check-cast v1, Ljava/math/BigDecimal;

    .line 55
    invoke-static {v1, v5, v4, v5}, Lkf/a;->G(Ljava/math/BigDecimal;Ljava/lang/String;ILjava/lang/Object;)Ljava/math/BigDecimal;

    move-result-object v2

    goto :goto_c

    .line 56
    :cond_13
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/tradebase/orderbook/DisplayOrderBookData;->getDisplayAsks()Ljava/util/List;

    move-result-object v0

    .line 57
    new-instance v1, Ljava/util/ArrayList;

    invoke-static {v0, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 58
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_15

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 59
    check-cast v2, Lcom/kubi/tradebase/orderbook/OrderBookItemData;

    .line 60
    invoke-virtual {v2}, Lcom/kubi/tradebase/orderbook/OrderBookItemData;->getTotalAmount()Lcom/kubi/tradebase/orderbook/DisPlayAmount;

    move-result-object v2

    if-eqz v2, :cond_14

    invoke-virtual {v2}, Lcom/kubi/tradebase/orderbook/DisPlayAmount;->getValueAmount()Ljava/math/BigDecimal;

    move-result-object v2

    goto :goto_a

    :cond_14
    move-object v2, v5

    :goto_a
    invoke-static {v2, v5, v4, v5}, Lkf/a;->G(Ljava/math/BigDecimal;Ljava/lang/String;ILjava/lang/Object;)Ljava/math/BigDecimal;

    move-result-object v2

    .line 61
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_9

    .line 62
    :cond_15
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 63
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_16

    move-object v1, v5

    goto :goto_b

    .line 64
    :cond_16
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 65
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_17

    goto :goto_b

    .line 66
    :cond_17
    move-object v2, v1

    check-cast v2, Ljava/math/BigDecimal;

    .line 67
    :cond_18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 68
    move-object v6, v3

    check-cast v6, Ljava/math/BigDecimal;

    .line 69
    invoke-interface {v2, v6}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v7

    if-gez v7, :cond_19

    move-object v1, v3

    move-object v2, v6

    .line 70
    :cond_19
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_18

    .line 71
    :goto_b
    check-cast v1, Ljava/math/BigDecimal;

    .line 72
    invoke-static {v1, v5, v4, v5}, Lkf/a;->G(Ljava/math/BigDecimal;Ljava/lang/String;ILjava/lang/Object;)Ljava/math/BigDecimal;

    move-result-object v2

    .line 73
    :goto_c
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/tradebase/orderbook/DisplayOrderBookData;->getDisplayBids()Ljava/util/List;

    move-result-object v0

    .line 74
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v6, 0x0

    const-string v7, "multiply(...)"

    const-string v8, "valueOf(...)"

    const-wide/16 v9, 0x64

    const/4 v11, 0x2

    const-wide/16 v12, 0x0

    if-eqz v1, :cond_1f

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kubi/tradebase/orderbook/OrderBookItemData;

    .line 75
    invoke-virtual {v2}, Ljava/math/BigDecimal;->doubleValue()D

    move-result-wide v14

    cmpg-double v12, v14, v12

    if-nez v12, :cond_1a

    goto :goto_f

    .line 76
    :cond_1a
    invoke-virtual {v1}, Lcom/kubi/tradebase/orderbook/OrderBookItemData;->getTotalAmount()Lcom/kubi/tradebase/orderbook/DisPlayAmount;

    move-result-object v12

    if-eqz v12, :cond_1b

    invoke-virtual {v12}, Lcom/kubi/tradebase/orderbook/DisPlayAmount;->getValueAmount()Ljava/math/BigDecimal;

    move-result-object v12

    if-eqz v12, :cond_1b

    sget-object v13, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    invoke-virtual {v12, v2, v11, v13}, Ljava/math/BigDecimal;->divide(Ljava/math/BigDecimal;ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    move-result-object v11

    if-eqz v11, :cond_1b

    .line 77
    invoke-static {v9, v10}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    move-result-object v9

    invoke-static {v9, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v11, v9}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v8

    invoke-static {v8, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v8, :cond_1b

    invoke-virtual {v8}, Ljava/math/BigDecimal;->floatValue()F

    move-result v7

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    goto :goto_e

    :cond_1b
    move-object v7, v5

    :goto_e
    invoke-static {v7, v6, v4, v5}, Lcom/kubi/utils/extensions/d;->i(Ljava/lang/Float;FILjava/lang/Object;)F

    move-result v6

    .line 78
    invoke-virtual {v1, v6}, Lcom/kubi/tradebase/orderbook/OrderBookItemData;->setDisplayProgress(F)V

    .line 79
    :goto_f
    invoke-interface/range {p3 .. p3}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_1e

    .line 80
    invoke-interface/range {p3 .. p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_1c
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1d

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Lcom/kubi/tradebase/orderbook/OrderBookDelegation;

    invoke-virtual {v8}, Lcom/kubi/tradebase/orderbook/OrderBookDelegation;->isBuy()Z

    move-result v9

    if-eqz v9, :cond_1c

    invoke-virtual {v8}, Lcom/kubi/tradebase/orderbook/OrderBookDelegation;->getDisplayPrice()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Lcom/kubi/tradebase/orderbook/OrderBookItemData;->getDisplayPrice()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1c

    goto :goto_10

    :cond_1d
    move-object v7, v5

    :goto_10
    if-eqz v7, :cond_1e

    move v3, v4

    goto :goto_11

    :cond_1e
    const/4 v3, 0x0

    .line 81
    :goto_11
    invoke-virtual {v1, v3}, Lcom/kubi/tradebase/orderbook/OrderBookItemData;->setDelegationMark(Z)V

    goto/16 :goto_d

    .line 82
    :cond_1f
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/tradebase/orderbook/DisplayOrderBookData;->getDisplayAsks()Ljava/util/List;

    move-result-object v0

    .line 83
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_12
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_25

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kubi/tradebase/orderbook/OrderBookItemData;

    .line 84
    invoke-virtual {v2}, Ljava/math/BigDecimal;->doubleValue()D

    move-result-wide v14

    cmpg-double v14, v14, v12

    if-nez v14, :cond_20

    goto :goto_14

    .line 85
    :cond_20
    invoke-virtual {v1}, Lcom/kubi/tradebase/orderbook/OrderBookItemData;->getTotalAmount()Lcom/kubi/tradebase/orderbook/DisPlayAmount;

    move-result-object v14

    if-eqz v14, :cond_21

    invoke-virtual {v14}, Lcom/kubi/tradebase/orderbook/DisPlayAmount;->getValueAmount()Ljava/math/BigDecimal;

    move-result-object v14

    if-eqz v14, :cond_21

    sget-object v15, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    invoke-virtual {v14, v2, v11, v15}, Ljava/math/BigDecimal;->divide(Ljava/math/BigDecimal;ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    move-result-object v14

    if-eqz v14, :cond_21

    .line 86
    invoke-static {v9, v10}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    move-result-object v15

    invoke-static {v15, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v14, v15}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v14

    invoke-static {v14, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v14, :cond_21

    invoke-virtual {v14}, Ljava/math/BigDecimal;->floatValue()F

    move-result v14

    invoke-static {v14}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v14

    goto :goto_13

    :cond_21
    move-object v14, v5

    :goto_13
    invoke-static {v14, v6, v4, v5}, Lcom/kubi/utils/extensions/d;->i(Ljava/lang/Float;FILjava/lang/Object;)F

    move-result v14

    .line 87
    invoke-virtual {v1, v14}, Lcom/kubi/tradebase/orderbook/OrderBookItemData;->setDisplayProgress(F)V

    .line 88
    :goto_14
    invoke-interface/range {p3 .. p3}, Ljava/util/Collection;->isEmpty()Z

    move-result v14

    if-nez v14, :cond_24

    .line 89
    invoke-interface/range {p3 .. p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_15
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_23

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    move-object/from16 v16, v15

    check-cast v16, Lcom/kubi/tradebase/orderbook/OrderBookDelegation;

    invoke-virtual/range {v16 .. v16}, Lcom/kubi/tradebase/orderbook/OrderBookDelegation;->isBuy()Z

    move-result v17

    if-nez v17, :cond_22

    invoke-virtual/range {v16 .. v16}, Lcom/kubi/tradebase/orderbook/OrderBookDelegation;->getDisplayPrice()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/kubi/tradebase/orderbook/OrderBookItemData;->getDisplayPrice()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_22

    goto :goto_16

    :cond_22
    const/4 v4, 0x1

    goto :goto_15

    :cond_23
    move-object v15, v5

    :goto_16
    if-eqz v15, :cond_24

    const/4 v3, 0x1

    goto :goto_17

    :cond_24
    const/4 v3, 0x0

    .line 90
    :goto_17
    invoke-virtual {v1, v3}, Lcom/kubi/tradebase/orderbook/OrderBookItemData;->setDelegationMark(Z)V

    const/4 v4, 0x1

    goto/16 :goto_12

    :cond_25
    return-object p1
.end method

.method public final c(Lcom/kubi/tradebase/orderbook/a;IILcom/kubi/resources/widget/OrderBookType;Ljava/util/List;I)Lcom/kubi/tradebase/orderbook/DisplayOrderBookData;
    .locals 8
    .param p1    # Lcom/kubi/tradebase/orderbook/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/kubi/resources/widget/OrderBookType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/tradebase/orderbook/a;",
            "II",
            "Lcom/kubi/resources/widget/OrderBookType;",
            "Ljava/util/List<",
            "Lcom/kubi/tradebase/orderbook/OrderBookDelegation;",
            ">;I)",
            "Lcom/kubi/tradebase/orderbook/DisplayOrderBookData;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "orderData"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "orderBookType"

    .line 8
    .line 9
    .line 10
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string v0, "delegationPriceList"

    .line 13
    .line 14
    .line 15
    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p1}, Lcom/kubi/tradebase/orderbook/a;->getBids()Ljava/util/List;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    .line 24
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 25
    move-result-object v0

    .line 26
    :cond_0
    const/4 v1, 0x1

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v0, p2, p3, v1}, Lcom/kubi/tradebase/orderbook/b;->a(Ljava/util/List;IIZ)Ljava/util/List;

    .line 30
    move-result-object v6

    .line 31
    .line 32
    .line 33
    invoke-interface {p1}, Lcom/kubi/tradebase/orderbook/a;->getAsks()Ljava/util/List;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    .line 39
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 40
    move-result-object v0

    .line 41
    :cond_1
    const/4 v1, 0x0

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, v0, p2, p3, v1}, Lcom/kubi/tradebase/orderbook/b;->a(Ljava/util/List;IIZ)Ljava/util/List;

    .line 45
    move-result-object v7

    .line 46
    .line 47
    new-instance v2, Lcom/kubi/tradebase/orderbook/DisplayOrderBookData;

    .line 48
    .line 49
    .line 50
    invoke-interface {p1}, Lcom/kubi/tradebase/orderbook/a;->getSymbol()Ljava/lang/String;

    .line 51
    move-result-object v3

    .line 52
    .line 53
    .line 54
    invoke-interface {p1}, Lcom/kubi/tradebase/orderbook/a;->getBids()Ljava/util/List;

    .line 55
    move-result-object v4

    .line 56
    .line 57
    .line 58
    invoke-interface {p1}, Lcom/kubi/tradebase/orderbook/a;->getAsks()Ljava/util/List;

    .line 59
    move-result-object v5

    .line 60
    .line 61
    .line 62
    invoke-direct/range {v2 .. v7}, Lcom/kubi/tradebase/orderbook/DisplayOrderBookData;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, v2, p4, p5, p6}, Lcom/kubi/tradebase/orderbook/b;->b(Lcom/kubi/tradebase/orderbook/DisplayOrderBookData;Lcom/kubi/resources/widget/OrderBookType;Ljava/util/List;I)Lcom/kubi/tradebase/orderbook/DisplayOrderBookData;

    .line 66
    move-result-object p1

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
.end method

.method public final d(Ljava/math/BigDecimal;II)Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    sget-object v0, Ll30/b;->a:Ll30/b;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p2}, Ll30/b;->b(I)Ll30/a;

    .line 6
    move-result-object p2

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/math/BigDecimal;->doubleValue()D

    .line 10
    move-result-wide v0

    .line 11
    .line 12
    .line 13
    invoke-interface {p2, v0, v1, p3}, Ll30/a;->a(DI)Ljava/lang/String;

    .line 14
    move-result-object p1

    .line 15
    return-object p1
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
.end method

.method public final e(Ljava/math/BigDecimal;IZ)Ljava/lang/String;
    .locals 12
    .param p1    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/math/BigDecimal;->doubleValue()D

    .line 9
    move-result-wide v0

    .line 10
    .line 11
    const-wide/16 v2, 0x0

    .line 12
    .line 13
    cmpg-double v0, v0, v2

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    const-string p1, "pow(...)"

    .line 18
    .line 19
    const/16 p3, 0x3c

    .line 20
    .line 21
    if-gez p2, :cond_0

    .line 22
    .line 23
    new-instance v0, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    sget-object p3, Ljava/math/BigDecimal;->TEN:Ljava/math/BigDecimal;

    .line 32
    .line 33
    .line 34
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    .line 35
    move-result p2

    .line 36
    .line 37
    .line 38
    invoke-virtual {p3, p2}, Ljava/math/BigDecimal;->pow(I)Ljava/math/BigDecimal;

    .line 39
    move-result-object v1

    .line 40
    .line 41
    .line 42
    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    const/16 v9, 0x7d

    .line 45
    const/4 v10, 0x0

    .line 46
    const/4 v2, 0x0

    .line 47
    .line 48
    const/16 v3, 0x14

    .line 49
    const/4 v4, 0x0

    .line 50
    const/4 v5, 0x0

    .line 51
    const/4 v6, 0x0

    .line 52
    const/4 v7, 0x0

    .line 53
    const/4 v8, 0x0

    .line 54
    .line 55
    .line 56
    invoke-static/range {v1 .. v10}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 57
    move-result-object p1

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    move-result-object p1

    .line 65
    return-object p1

    .line 66
    .line 67
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    new-instance p3, Ljava/math/BigDecimal;

    .line 76
    .line 77
    const-string v1, "0.1"

    .line 78
    .line 79
    .line 80
    invoke-direct {p3, v1}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p3, p2}, Ljava/math/BigDecimal;->pow(I)Ljava/math/BigDecimal;

    .line 84
    move-result-object v2

    .line 85
    .line 86
    .line 87
    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    .line 89
    const/16 v10, 0x7d

    .line 90
    const/4 v11, 0x0

    .line 91
    const/4 v3, 0x0

    .line 92
    .line 93
    const/16 v4, 0x14

    .line 94
    const/4 v5, 0x0

    .line 95
    const/4 v6, 0x0

    .line 96
    const/4 v7, 0x0

    .line 97
    const/4 v8, 0x0

    .line 98
    const/4 v9, 0x0

    .line 99
    .line 100
    .line 101
    invoke-static/range {v2 .. v11}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 102
    move-result-object p1

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    move-result-object p1

    .line 110
    return-object p1

    .line 111
    .line 112
    :cond_1
    if-eqz p3, :cond_2

    .line 113
    .line 114
    sget-object p3, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 115
    :goto_0
    move-object v1, p3

    .line 116
    goto :goto_1

    .line 117
    .line 118
    :cond_2
    sget-object p3, Ljava/math/RoundingMode;->UP:Ljava/math/RoundingMode;

    .line 119
    goto :goto_0

    .line 120
    .line 121
    :goto_1
    const/16 v8, 0x68

    .line 122
    const/4 v9, 0x0

    .line 123
    const/4 v3, 0x1

    .line 124
    const/4 v4, 0x0

    .line 125
    const/4 v5, 0x1

    .line 126
    const/4 v6, 0x0

    .line 127
    const/4 v7, 0x0

    .line 128
    move-object v0, p1

    .line 129
    move v2, p2

    .line 130
    .line 131
    .line 132
    invoke-static/range {v0 .. v9}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 133
    move-result-object p1

    .line 134
    return-object p1
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
.end method

.method public final f(I)F
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/utils/c;->b()Landroid/content/Context;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    const/16 v1, 0x8

    .line 9
    .line 10
    if-gt p1, v1, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    sget v0, Lcom/kubi/tradebase/R$dimen;->order_book_text_size_big:I

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimension(I)F

    .line 20
    move-result p1

    .line 21
    return p1

    .line 22
    .line 23
    :cond_0
    const/16 v1, 0xa

    .line 24
    .line 25
    if-gt p1, v1, :cond_1

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 29
    move-result-object p1

    .line 30
    .line 31
    sget v0, Lcom/kubi/tradebase/R$dimen;->order_book_text_size_medium:I

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimension(I)F

    .line 35
    move-result p1

    .line 36
    return p1

    .line 37
    .line 38
    .line 39
    :cond_1
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 40
    move-result-object p1

    .line 41
    .line 42
    sget v0, Lcom/kubi/tradebase/R$dimen;->order_book_text_size_small:I

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimension(I)F

    .line 46
    move-result p1

    .line 47
    return p1
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
.end method
