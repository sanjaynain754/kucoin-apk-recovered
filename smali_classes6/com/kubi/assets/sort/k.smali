.class public final Lcom/kubi/assets/sort/k;
.super Ljava/lang/Object;
.source "AccountTabSortManager.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0006\u0010\u0007\u001a\u00020\u0008J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006J\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00060\rJ\u0006\u0010\u000e\u001a\u00020\u0006J!\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00102\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00120\r\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0006\u0010\u0015\u001a\u00020\nJ\u0006\u0010\u0016\u001a\u00020\u0008J\u0014\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00120\r2\u0006\u0010\u0018\u001a\u00020\u0019J \u0010\u001a\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\nH\u0002J\u0008\u0010\u001c\u001a\u00020\nH\u0002R\u0014\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/kubi/assets/sort/AccountTabSortManager;",
        "",
        "<init>",
        "()V",
        "supportOrderAccountList",
        "",
        "Lcom/kubi/assets/sort/AccountBiz;",
        "refreshSupportAccounts",
        "",
        "isSupportAccount",
        "",
        "biz",
        "getSupportAccountList",
        "",
        "lastCheckedAccountBiz",
        "saveOrder",
        "Lkotlin/Result;",
        "orders",
        "Lcom/kubi/assets/sort/AccountTabSortData;",
        "saveOrder-IoAF18A",
        "(Ljava/util/List;)Ljava/lang/Object;",
        "shouldShowSortGuide",
        "markSortGuideClicked",
        "buildAccountListFromResponse",
        "assetOverview",
        "Lcom/kubi/assets/entity/AssetV2OverviewEntity;",
        "createAccountData",
        "isHide",
        "isUnified",
        "AssetsCenterLib_googleRelease"
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
        "SMAP\nAccountTabSortManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountTabSortManager.kt\ncom/kubi/assets/sort/AccountTabSortManager\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,312:1\n135#2,2:313\n32#2:315\n23#2,2:324\n135#2,2:326\n126#2,2:328\n1#3:316\n774#4:317\n865#4,2:318\n1563#4:320\n1634#4,3:321\n1869#4,2:330\n774#4:332\n865#4,2:333\n1563#4:335\n1634#4,3:336\n774#4:339\n865#4,2:340\n*S KotlinDebug\n*F\n+ 1 AccountTabSortManager.kt\ncom/kubi/assets/sort/AccountTabSortManager\n*L\n77#1:313,2\n122#1:315\n137#1:324,2\n146#1:326,2\n153#1:328,2\n135#1:317\n135#1:318,2\n135#1:320\n135#1:321,3\n172#1:330,2\n267#1:332\n267#1:333,2\n268#1:335\n268#1:336,3\n282#1:339\n282#1:340,2\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Lcom/kubi/assets/sort/k;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kubi/assets/sort/AccountBiz;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/assets/sort/k;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/assets/sort/k;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/kubi/assets/sort/k;->a:Lcom/kubi/assets/sort/k;

    .line 8
    .line 9
    new-instance v1, Ljava/util/ArrayList;

    .line 10
    .line 11
    .line 12
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    sput-object v1, Lcom/kubi/assets/sort/k;->b:Ljava/util/List;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/kubi/assets/sort/k;->h()V

    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
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
.end method


# virtual methods
.method public final a(Lcom/kubi/assets/entity/AssetV2OverviewEntity;)Ljava/util/List;
    .locals 8
    .param p1    # Lcom/kubi/assets/entity/AssetV2OverviewEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/assets/entity/AssetV2OverviewEntity;",
            ")",
            "Ljava/util/List<",
            "Lcom/kubi/assets/sort/i;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    .line 4
    const-string v2, "assetOverview"

    .line 5
    .line 6
    .line 7
    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/kubi/assets/entity/AssetV2OverviewEntity;->getAccounts()Ljava/util/List;

    .line 11
    move-result-object v2

    .line 12
    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    .line 16
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 17
    move-result-object p1

    .line 18
    return-object p1

    .line 19
    .line 20
    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    .line 21
    .line 22
    .line 23
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    new-instance v4, Ljava/util/LinkedHashSet;

    .line 26
    .line 27
    .line 28
    invoke-direct {v4}, Ljava/util/LinkedHashSet;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 32
    move-result-object v2

    .line 33
    .line 34
    .line 35
    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    move-result v5

    .line 37
    .line 38
    if-eqz v5, :cond_c

    .line 39
    .line 40
    .line 41
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    move-result-object v5

    .line 43
    .line 44
    check-cast v5, Lcom/kubi/assets/entity/OverviewAccountInfo;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v5}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getMain()Lcom/kubi/data/entity/AssetSingleEntity;

    .line 48
    move-result-object v6

    .line 49
    .line 50
    if-eqz v6, :cond_2

    .line 51
    .line 52
    sget-object v5, Lcom/kubi/assets/sort/AccountBiz$e;->b:Lcom/kubi/assets/sort/AccountBiz$e;

    .line 53
    .line 54
    sget-object v6, Lcom/kubi/assets/sort/k;->a:Lcom/kubi/assets/sort/k;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v6, v5}, Lcom/kubi/assets/sort/k;->d(Lcom/kubi/assets/sort/AccountBiz;)Z

    .line 58
    move-result v7

    .line 59
    .line 60
    if-eqz v7, :cond_1

    .line 61
    .line 62
    .line 63
    invoke-virtual {v6, v5, p1, v1}, Lcom/kubi/assets/sort/k;->b(Lcom/kubi/assets/sort/AccountBiz;Lcom/kubi/assets/entity/AssetV2OverviewEntity;Z)Lcom/kubi/assets/sort/i;

    .line 64
    move-result-object v6

    .line 65
    .line 66
    .line 67
    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    invoke-interface {v4, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 71
    goto :goto_0

    .line 72
    .line 73
    .line 74
    :cond_2
    invoke-virtual {v5}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getTrade()Lcom/kubi/data/entity/AssetSingleEntity;

    .line 75
    move-result-object v6

    .line 76
    .line 77
    if-eqz v6, :cond_3

    .line 78
    .line 79
    sget-object v5, Lcom/kubi/assets/sort/AccountBiz$j;->b:Lcom/kubi/assets/sort/AccountBiz$j;

    .line 80
    .line 81
    sget-object v6, Lcom/kubi/assets/sort/k;->a:Lcom/kubi/assets/sort/k;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v6, v5}, Lcom/kubi/assets/sort/k;->d(Lcom/kubi/assets/sort/AccountBiz;)Z

    .line 85
    move-result v7

    .line 86
    .line 87
    if-eqz v7, :cond_1

    .line 88
    .line 89
    .line 90
    invoke-virtual {v6, v5, p1, v1}, Lcom/kubi/assets/sort/k;->b(Lcom/kubi/assets/sort/AccountBiz;Lcom/kubi/assets/entity/AssetV2OverviewEntity;Z)Lcom/kubi/assets/sort/i;

    .line 91
    move-result-object v6

    .line 92
    .line 93
    .line 94
    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    invoke-interface {v4, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 98
    goto :goto_0

    .line 99
    .line 100
    .line 101
    :cond_3
    invoke-virtual {v5}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getUnified()Lcom/kubi/data/entity/UnifiedAssetEntity;

    .line 102
    move-result-object v6

    .line 103
    .line 104
    if-eqz v6, :cond_4

    .line 105
    .line 106
    sget-object v5, Lcom/kubi/assets/sort/AccountBiz$k;->b:Lcom/kubi/assets/sort/AccountBiz$k;

    .line 107
    .line 108
    sget-object v6, Lcom/kubi/assets/sort/k;->a:Lcom/kubi/assets/sort/k;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v6, v5}, Lcom/kubi/assets/sort/k;->d(Lcom/kubi/assets/sort/AccountBiz;)Z

    .line 112
    move-result v7

    .line 113
    .line 114
    if-eqz v7, :cond_1

    .line 115
    .line 116
    .line 117
    invoke-virtual {v6, v5, p1, v1}, Lcom/kubi/assets/sort/k;->b(Lcom/kubi/assets/sort/AccountBiz;Lcom/kubi/assets/entity/AssetV2OverviewEntity;Z)Lcom/kubi/assets/sort/i;

    .line 118
    move-result-object v6

    .line 119
    .line 120
    .line 121
    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    invoke-interface {v4, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 125
    goto :goto_0

    .line 126
    .line 127
    .line 128
    :cond_4
    invoke-virtual {v5}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getMargin()Lcom/kubi/assets/entity/MarginEntity;

    .line 129
    move-result-object v6

    .line 130
    .line 131
    if-eqz v6, :cond_5

    .line 132
    .line 133
    sget-object v5, Lcom/kubi/assets/sort/AccountBiz$g;->b:Lcom/kubi/assets/sort/AccountBiz$g;

    .line 134
    .line 135
    sget-object v6, Lcom/kubi/assets/sort/k;->a:Lcom/kubi/assets/sort/k;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v6, v5}, Lcom/kubi/assets/sort/k;->d(Lcom/kubi/assets/sort/AccountBiz;)Z

    .line 139
    move-result v7

    .line 140
    .line 141
    if-eqz v7, :cond_1

    .line 142
    .line 143
    .line 144
    invoke-virtual {v6, v5, p1, v1}, Lcom/kubi/assets/sort/k;->b(Lcom/kubi/assets/sort/AccountBiz;Lcom/kubi/assets/entity/AssetV2OverviewEntity;Z)Lcom/kubi/assets/sort/i;

    .line 145
    move-result-object v6

    .line 146
    .line 147
    .line 148
    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    invoke-interface {v4, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 152
    goto :goto_0

    .line 153
    .line 154
    .line 155
    :cond_5
    invoke-virtual {v5}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getKumex()Lcom/kubi/assets/entity/EquityEntity;

    .line 156
    move-result-object v6

    .line 157
    .line 158
    if-eqz v6, :cond_6

    .line 159
    .line 160
    sget-object v5, Lcom/kubi/assets/sort/AccountBiz$f;->b:Lcom/kubi/assets/sort/AccountBiz$f;

    .line 161
    .line 162
    sget-object v6, Lcom/kubi/assets/sort/k;->a:Lcom/kubi/assets/sort/k;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v6, v5}, Lcom/kubi/assets/sort/k;->d(Lcom/kubi/assets/sort/AccountBiz;)Z

    .line 166
    move-result v7

    .line 167
    .line 168
    if-eqz v7, :cond_1

    .line 169
    .line 170
    .line 171
    invoke-virtual {v6, v5, p1, v1}, Lcom/kubi/assets/sort/k;->b(Lcom/kubi/assets/sort/AccountBiz;Lcom/kubi/assets/entity/AssetV2OverviewEntity;Z)Lcom/kubi/assets/sort/i;

    .line 172
    move-result-object v6

    .line 173
    .line 174
    .line 175
    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    invoke-interface {v4, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 179
    .line 180
    goto/16 :goto_0

    .line 181
    .line 182
    .line 183
    :cond_6
    invoke-virtual {v5}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getAlpha()Lcom/kubi/assets/entity/CommonAccountEntity;

    .line 184
    move-result-object v6

    .line 185
    .line 186
    if-eqz v6, :cond_7

    .line 187
    .line 188
    sget-object v5, Lcom/kubi/assets/sort/AccountBiz$a;->b:Lcom/kubi/assets/sort/AccountBiz$a;

    .line 189
    .line 190
    sget-object v6, Lcom/kubi/assets/sort/k;->a:Lcom/kubi/assets/sort/k;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v6, v5}, Lcom/kubi/assets/sort/k;->d(Lcom/kubi/assets/sort/AccountBiz;)Z

    .line 194
    move-result v7

    .line 195
    .line 196
    if-eqz v7, :cond_1

    .line 197
    .line 198
    .line 199
    invoke-virtual {v6, v5, p1, v1}, Lcom/kubi/assets/sort/k;->b(Lcom/kubi/assets/sort/AccountBiz;Lcom/kubi/assets/entity/AssetV2OverviewEntity;Z)Lcom/kubi/assets/sort/i;

    .line 200
    move-result-object v6

    .line 201
    .line 202
    .line 203
    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    invoke-interface {v4, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 207
    .line 208
    goto/16 :goto_0

    .line 209
    .line 210
    .line 211
    :cond_7
    invoke-virtual {v5}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getRobot()Lcom/kubi/data/entity/SubAssetEntity;

    .line 212
    move-result-object v6

    .line 213
    .line 214
    if-eqz v6, :cond_8

    .line 215
    .line 216
    sget-object v5, Lcom/kubi/assets/sort/AccountBiz$b;->b:Lcom/kubi/assets/sort/AccountBiz$b;

    .line 217
    .line 218
    sget-object v6, Lcom/kubi/assets/sort/k;->a:Lcom/kubi/assets/sort/k;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v6, v5}, Lcom/kubi/assets/sort/k;->d(Lcom/kubi/assets/sort/AccountBiz;)Z

    .line 222
    move-result v7

    .line 223
    .line 224
    if-eqz v7, :cond_1

    .line 225
    .line 226
    .line 227
    invoke-virtual {v6, v5, p1, v1}, Lcom/kubi/assets/sort/k;->b(Lcom/kubi/assets/sort/AccountBiz;Lcom/kubi/assets/entity/AssetV2OverviewEntity;Z)Lcom/kubi/assets/sort/i;

    .line 228
    move-result-object v6

    .line 229
    .line 230
    .line 231
    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    invoke-interface {v4, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 235
    .line 236
    goto/16 :goto_0

    .line 237
    .line 238
    .line 239
    :cond_8
    invoke-virtual {v5}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getEarn()Lcom/kubi/assets/entity/EarnBalance;

    .line 240
    move-result-object v6

    .line 241
    .line 242
    if-eqz v6, :cond_9

    .line 243
    .line 244
    sget-object v5, Lcom/kubi/assets/sort/AccountBiz$d;->b:Lcom/kubi/assets/sort/AccountBiz$d;

    .line 245
    .line 246
    sget-object v6, Lcom/kubi/assets/sort/k;->a:Lcom/kubi/assets/sort/k;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v6, v5}, Lcom/kubi/assets/sort/k;->d(Lcom/kubi/assets/sort/AccountBiz;)Z

    .line 250
    move-result v7

    .line 251
    .line 252
    if-eqz v7, :cond_1

    .line 253
    .line 254
    .line 255
    invoke-virtual {v6, v5, p1, v1}, Lcom/kubi/assets/sort/k;->b(Lcom/kubi/assets/sort/AccountBiz;Lcom/kubi/assets/entity/AssetV2OverviewEntity;Z)Lcom/kubi/assets/sort/i;

    .line 256
    move-result-object v6

    .line 257
    .line 258
    .line 259
    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    invoke-interface {v4, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 263
    .line 264
    goto/16 :goto_0

    .line 265
    .line 266
    .line 267
    :cond_9
    invoke-virtual {v5}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getOption()Lcom/kubi/assets/entity/CommonAccountEntity;

    .line 268
    move-result-object v6

    .line 269
    .line 270
    if-eqz v6, :cond_a

    .line 271
    .line 272
    sget-object v5, Lcom/kubi/assets/sort/AccountBiz$i;->b:Lcom/kubi/assets/sort/AccountBiz$i;

    .line 273
    .line 274
    sget-object v6, Lcom/kubi/assets/sort/k;->a:Lcom/kubi/assets/sort/k;

    .line 275
    .line 276
    .line 277
    invoke-virtual {v6, v5}, Lcom/kubi/assets/sort/k;->d(Lcom/kubi/assets/sort/AccountBiz;)Z

    .line 278
    move-result v7

    .line 279
    .line 280
    if-eqz v7, :cond_1

    .line 281
    .line 282
    .line 283
    invoke-virtual {v6, v5, p1, v1}, Lcom/kubi/assets/sort/k;->b(Lcom/kubi/assets/sort/AccountBiz;Lcom/kubi/assets/entity/AssetV2OverviewEntity;Z)Lcom/kubi/assets/sort/i;

    .line 284
    move-result-object v6

    .line 285
    .line 286
    .line 287
    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 288
    .line 289
    .line 290
    invoke-interface {v4, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 291
    .line 292
    goto/16 :goto_0

    .line 293
    .line 294
    .line 295
    :cond_a
    invoke-virtual {v5}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getCopyTrading()Lcom/kubi/data/entity/SubAssetEntity;

    .line 296
    move-result-object v6

    .line 297
    .line 298
    if-eqz v6, :cond_b

    .line 299
    .line 300
    sget-object v5, Lcom/kubi/assets/sort/AccountBiz$c;->b:Lcom/kubi/assets/sort/AccountBiz$c;

    .line 301
    .line 302
    sget-object v6, Lcom/kubi/assets/sort/k;->a:Lcom/kubi/assets/sort/k;

    .line 303
    .line 304
    .line 305
    invoke-virtual {v6, v5}, Lcom/kubi/assets/sort/k;->d(Lcom/kubi/assets/sort/AccountBiz;)Z

    .line 306
    move-result v7

    .line 307
    .line 308
    if-eqz v7, :cond_1

    .line 309
    .line 310
    .line 311
    invoke-virtual {v6, v5, p1, v1}, Lcom/kubi/assets/sort/k;->b(Lcom/kubi/assets/sort/AccountBiz;Lcom/kubi/assets/entity/AssetV2OverviewEntity;Z)Lcom/kubi/assets/sort/i;

    .line 312
    move-result-object v6

    .line 313
    .line 314
    .line 315
    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 316
    .line 317
    .line 318
    invoke-interface {v4, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 319
    .line 320
    goto/16 :goto_0

    .line 321
    .line 322
    .line 323
    :cond_b
    invoke-virtual {v5}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getMining()Lcom/kubi/assets/entity/CommonAccountEntity;

    .line 324
    move-result-object v5

    .line 325
    .line 326
    if-eqz v5, :cond_1

    .line 327
    .line 328
    sget-object v5, Lcom/kubi/assets/sort/AccountBiz$h;->b:Lcom/kubi/assets/sort/AccountBiz$h;

    .line 329
    .line 330
    sget-object v6, Lcom/kubi/assets/sort/k;->a:Lcom/kubi/assets/sort/k;

    .line 331
    .line 332
    .line 333
    invoke-virtual {v6, v5}, Lcom/kubi/assets/sort/k;->d(Lcom/kubi/assets/sort/AccountBiz;)Z

    .line 334
    move-result v7

    .line 335
    .line 336
    if-eqz v7, :cond_1

    .line 337
    .line 338
    .line 339
    invoke-virtual {v6, v5, p1, v1}, Lcom/kubi/assets/sort/k;->b(Lcom/kubi/assets/sort/AccountBiz;Lcom/kubi/assets/entity/AssetV2OverviewEntity;Z)Lcom/kubi/assets/sort/i;

    .line 340
    move-result-object v6

    .line 341
    .line 342
    .line 343
    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 344
    .line 345
    .line 346
    invoke-interface {v4, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 347
    .line 348
    goto/16 :goto_0

    .line 349
    .line 350
    :cond_c
    sget-object p1, Lcom/kubi/assets/sort/k;->a:Lcom/kubi/assets/sort/k;

    .line 351
    .line 352
    .line 353
    invoke-virtual {p1}, Lcom/kubi/assets/sort/k;->c()Ljava/util/List;

    .line 354
    move-result-object p1

    .line 355
    .line 356
    new-instance v2, Ljava/util/ArrayList;

    .line 357
    .line 358
    .line 359
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 360
    .line 361
    .line 362
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 363
    move-result-object p1

    .line 364
    .line 365
    .line 366
    :cond_d
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 367
    move-result v5

    .line 368
    .line 369
    if-eqz v5, :cond_e

    .line 370
    .line 371
    .line 372
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 373
    move-result-object v5

    .line 374
    move-object v6, v5

    .line 375
    .line 376
    check-cast v6, Lcom/kubi/assets/sort/AccountBiz;

    .line 377
    .line 378
    .line 379
    invoke-interface {v4, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 380
    move-result v6

    .line 381
    .line 382
    if-nez v6, :cond_d

    .line 383
    .line 384
    .line 385
    invoke-interface {v2, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 386
    goto :goto_1

    .line 387
    .line 388
    :cond_e
    new-instance p1, Ljava/util/ArrayList;

    .line 389
    .line 390
    const/16 v4, 0xa

    .line 391
    .line 392
    .line 393
    invoke-static {v2, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 394
    move-result v4

    .line 395
    .line 396
    .line 397
    invoke-direct {p1, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 398
    .line 399
    .line 400
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 401
    move-result-object v2

    .line 402
    .line 403
    .line 404
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 405
    move-result v4

    .line 406
    .line 407
    if-eqz v4, :cond_f

    .line 408
    .line 409
    .line 410
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 411
    move-result-object v4

    .line 412
    .line 413
    check-cast v4, Lcom/kubi/assets/sort/AccountBiz;

    .line 414
    .line 415
    new-instance v5, Lcom/kubi/assets/sort/i;

    .line 416
    .line 417
    sget-object v6, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 418
    .line 419
    const-string v7, "ZERO"

    .line 420
    .line 421
    .line 422
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 423
    .line 424
    .line 425
    invoke-direct {v5, v4, v0, v6}, Lcom/kubi/assets/sort/i;-><init>(Lcom/kubi/assets/sort/AccountBiz;ZLjava/math/BigDecimal;)V

    .line 426
    .line 427
    .line 428
    invoke-interface {p1, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 429
    goto :goto_2

    .line 430
    .line 431
    .line 432
    :cond_f
    invoke-static {v3, p1}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    .line 433
    move-result-object p1

    .line 434
    .line 435
    .line 436
    invoke-virtual {p0}, Lcom/kubi/assets/sort/k;->e()Z

    .line 437
    move-result v2

    .line 438
    .line 439
    if-eqz v2, :cond_13

    .line 440
    const/4 v2, 0x2

    .line 441
    .line 442
    new-array v2, v2, [Lcom/kubi/assets/sort/AccountBiz;

    .line 443
    .line 444
    sget-object v3, Lcom/kubi/assets/sort/AccountBiz$j;->b:Lcom/kubi/assets/sort/AccountBiz$j;

    .line 445
    .line 446
    aput-object v3, v2, v1

    .line 447
    .line 448
    sget-object v1, Lcom/kubi/assets/sort/AccountBiz$f;->b:Lcom/kubi/assets/sort/AccountBiz$f;

    .line 449
    .line 450
    aput-object v1, v2, v0

    .line 451
    .line 452
    .line 453
    invoke-static {v2}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    .line 454
    move-result-object v0

    .line 455
    .line 456
    new-instance v1, Ljava/util/ArrayList;

    .line 457
    .line 458
    .line 459
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 460
    .line 461
    .line 462
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 463
    move-result-object p1

    .line 464
    .line 465
    .line 466
    :cond_10
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 467
    move-result v2

    .line 468
    .line 469
    if-eqz v2, :cond_12

    .line 470
    .line 471
    .line 472
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 473
    move-result-object v2

    .line 474
    move-object v3, v2

    .line 475
    .line 476
    check-cast v3, Lcom/kubi/assets/sort/i;

    .line 477
    .line 478
    .line 479
    invoke-virtual {v3}, Lcom/kubi/assets/sort/i;->d()Lcom/kubi/assets/sort/AccountBiz;

    .line 480
    move-result-object v4

    .line 481
    .line 482
    .line 483
    invoke-interface {v0, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 484
    move-result v4

    .line 485
    .line 486
    if-eqz v4, :cond_11

    .line 487
    .line 488
    .line 489
    invoke-virtual {v3}, Lcom/kubi/assets/sort/i;->c()Ljava/math/BigDecimal;

    .line 490
    move-result-object v3

    .line 491
    .line 492
    sget-object v4, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 493
    .line 494
    .line 495
    invoke-virtual {v3, v4}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 496
    move-result v3

    .line 497
    .line 498
    if-lez v3, :cond_10

    .line 499
    .line 500
    .line 501
    :cond_11
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 502
    goto :goto_3

    .line 503
    :cond_12
    return-object v1

    .line 504
    :cond_13
    return-object p1
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
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
.end method

.method public final b(Lcom/kubi/assets/sort/AccountBiz;Lcom/kubi/assets/entity/AssetV2OverviewEntity;Z)Lcom/kubi/assets/sort/i;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/assets/sort/i;

    .line 3
    .line 4
    .line 5
    invoke-interface {p1}, Lcom/kubi/assets/sort/AccountBiz;->getKey()Ljava/lang/String;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-static {v1, p2}, Lcom/kubi/assets/view/tab/e;->a(Ljava/lang/String;Lcom/kubi/assets/entity/AssetV2OverviewEntity;)Ljava/math/BigDecimal;

    .line 10
    move-result-object p2

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, p1, p3, p2}, Lcom/kubi/assets/sort/i;-><init>(Lcom/kubi/assets/sort/AccountBiz;ZLjava/math/BigDecimal;)V

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
.end method

.method public final c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/kubi/assets/sort/AccountBiz;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/assets/sort/k;->b:Ljava/util/List;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
.end method

.method public final d(Lcom/kubi/assets/sort/AccountBiz;)Z
    .locals 1
    .param p1    # Lcom/kubi/assets/sort/AccountBiz;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "biz"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/kubi/assets/sort/k;->b:Ljava/util/List;

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 11
    move-result p1

    .line 12
    return p1
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
.end method

.method public final e()Z
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/unify/api/IUnifyAccountService;->a:Lcom/kubi/unify/api/IUnifyAccountService$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/unify/api/IUnifyAccountService$Companion;->get()Lcom/kubi/unify/api/IUnifyAccountService;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Lcom/kubi/unify/api/IUnifyAccountService;->C()Z

    .line 10
    move-result v0

    .line 11
    return v0
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
.end method

.method public final f()Lcom/kubi/assets/sort/AccountBiz;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Llb/h;->a:Llb/h;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Llb/h;->r()Ly70/g;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    const-string v1, ""

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Ly70/a;->h(Ly70/g;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    sget-object v1, Lcom/kubi/assets/sort/AccountBiz;->a:Lcom/kubi/assets/sort/AccountBiz$Companion;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v0}, Lcom/kubi/assets/sort/AccountBiz$Companion;->fromKey(Ljava/lang/String;)Lcom/kubi/assets/sort/AccountBiz;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    sget-object v0, Lcom/kubi/assets/sort/AccountBiz$e;->b:Lcom/kubi/assets/sort/AccountBiz$e;

    .line 23
    .line 24
    :cond_0
    sget-object v1, Lcom/kubi/assets/sort/k;->b:Ljava/util/List;

    .line 25
    .line 26
    .line 27
    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 28
    move-result v1

    .line 29
    .line 30
    if-eqz v1, :cond_1

    .line 31
    return-object v0

    .line 32
    .line 33
    :cond_1
    sget-object v0, Lcom/kubi/assets/sort/AccountBiz$e;->b:Lcom/kubi/assets/sort/AccountBiz$e;

    .line 34
    return-object v0
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
.end method

.method public final g()V
    .locals 2

    .line 1
    .line 2
    sget-object v0, Llb/h;->a:Llb/h;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Llb/h;->h()Ly70/g;

    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x1

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1}, Ly70/a;->k(Ly70/g;Z)Ly70/a;

    .line 11
    return-void
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
.end method

.method public final h()V
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/assets/sort/k;->b:Ljava/util/List;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 6
    .line 7
    sget-object v1, Lcom/kubi/assets/sort/AccountBiz$e;->b:Lcom/kubi/assets/sort/AccountBiz$e;

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    sget-object v1, Lcom/kubi/assets/sort/AccountBiz$j;->b:Lcom/kubi/assets/sort/AccountBiz$j;

    .line 13
    .line 14
    .line 15
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 16
    .line 17
    sget-object v1, Lcom/kubi/sdk/site/SiteVisibleConfigKey;->Margin:Lcom/kubi/sdk/site/SiteVisibleConfigKey;

    .line 18
    .line 19
    .line 20
    invoke-static {v1}, Lcom/kubi/sdk/site/b;->b(Lcom/kubi/sdk/site/SiteVisibleConfigKey;)Z

    .line 21
    move-result v1

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    sget-object v1, Lcom/kubi/assets/sort/AccountBiz$g;->b:Lcom/kubi/assets/sort/AccountBiz$g;

    .line 26
    .line 27
    .line 28
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    :cond_0
    invoke-static {}, Lcom/kubi/assets/a;->a()Z

    .line 32
    move-result v1

    .line 33
    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    sget-object v1, Lcom/kubi/assets/sort/AccountBiz$f;->b:Lcom/kubi/assets/sort/AccountBiz$f;

    .line 37
    .line 38
    .line 39
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    :cond_1
    sget-object v1, Lcom/kubi/sdk/site/SiteVisibleConfigKey;->Financing:Lcom/kubi/sdk/site/SiteVisibleConfigKey;

    .line 42
    .line 43
    .line 44
    invoke-static {v1}, Lcom/kubi/sdk/site/b;->b(Lcom/kubi/sdk/site/SiteVisibleConfigKey;)Z

    .line 45
    move-result v1

    .line 46
    .line 47
    if-eqz v1, :cond_2

    .line 48
    .line 49
    sget-object v1, Lcom/kubi/assets/sort/AccountBiz$d;->b:Lcom/kubi/assets/sort/AccountBiz$d;

    .line 50
    .line 51
    .line 52
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    :cond_2
    sget-object v1, Lcom/kubi/sdk/site/SiteVisibleConfigKey;->CopyTrading:Lcom/kubi/sdk/site/SiteVisibleConfigKey;

    .line 55
    .line 56
    .line 57
    invoke-static {v1}, Lcom/kubi/sdk/site/b;->b(Lcom/kubi/sdk/site/SiteVisibleConfigKey;)Z

    .line 58
    move-result v1

    .line 59
    .line 60
    if-eqz v1, :cond_3

    .line 61
    .line 62
    sget-object v1, Lcom/kubi/assets/sort/AccountBiz$c;->b:Lcom/kubi/assets/sort/AccountBiz$c;

    .line 63
    .line 64
    .line 65
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    :cond_3
    sget-object v1, Lcom/kubi/assets/service/a;->a:Lcom/kubi/assets/service/a;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1}, Lcom/kubi/assets/service/a;->f()Lcom/kubi/quotefacade/api/IQuoteFacadeService;

    .line 71
    move-result-object v1

    .line 72
    .line 73
    .line 74
    invoke-interface {v1}, Lcom/kubi/quotefacade/api/IQuoteFacadeService;->o()Z

    .line 75
    move-result v1

    .line 76
    .line 77
    if-eqz v1, :cond_4

    .line 78
    .line 79
    sget-object v1, Llb/h;->a:Llb/h;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1}, Llb/h;->C()Ly70/g;

    .line 83
    move-result-object v1

    .line 84
    const/4 v2, 0x0

    .line 85
    .line 86
    .line 87
    invoke-static {v1, v2}, Ly70/a;->d(Ly70/g;Z)Z

    .line 88
    move-result v1

    .line 89
    .line 90
    if-eqz v1, :cond_4

    .line 91
    .line 92
    sget-object v1, Lcom/kubi/assets/sort/AccountBiz$a;->b:Lcom/kubi/assets/sort/AccountBiz$a;

    .line 93
    .line 94
    .line 95
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 96
    .line 97
    :cond_4
    sget-object v1, Lcom/kubi/unify/api/IUnifyAccountService;->a:Lcom/kubi/unify/api/IUnifyAccountService$Companion;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1}, Lcom/kubi/unify/api/IUnifyAccountService$Companion;->get()Lcom/kubi/unify/api/IUnifyAccountService;

    .line 101
    move-result-object v1

    .line 102
    .line 103
    sget-object v2, Lcom/kubi/sdk/site/SiteVisibleConfigKey;->UNIFIED:Lcom/kubi/sdk/site/SiteVisibleConfigKey;

    .line 104
    .line 105
    .line 106
    invoke-static {v2}, Lcom/kubi/sdk/site/b;->b(Lcom/kubi/sdk/site/SiteVisibleConfigKey;)Z

    .line 107
    move-result v2

    .line 108
    .line 109
    if-eqz v2, :cond_6

    .line 110
    .line 111
    .line 112
    invoke-interface {v1}, Lcom/kubi/unify/api/IUnifyAccountService;->C()Z

    .line 113
    move-result v2

    .line 114
    .line 115
    if-nez v2, :cond_5

    .line 116
    .line 117
    .line 118
    invoke-interface {v1}, Lcom/kubi/unify/api/IUnifyAccountService;->e()Z

    .line 119
    move-result v1

    .line 120
    .line 121
    if-eqz v1, :cond_6

    .line 122
    .line 123
    :cond_5
    sget-object v1, Lcom/kubi/assets/sort/AccountBiz$k;->b:Lcom/kubi/assets/sort/AccountBiz$k;

    .line 124
    .line 125
    .line 126
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 127
    .line 128
    :cond_6
    sget-object v1, Lcom/kubi/sdk/site/SiteVisibleConfigKey;->TradingBot:Lcom/kubi/sdk/site/SiteVisibleConfigKey;

    .line 129
    .line 130
    .line 131
    invoke-static {v1}, Lcom/kubi/sdk/site/b;->b(Lcom/kubi/sdk/site/SiteVisibleConfigKey;)Z

    .line 132
    move-result v1

    .line 133
    .line 134
    if-eqz v1, :cond_7

    .line 135
    .line 136
    sget-object v1, Lcom/kubi/assets/sort/AccountBiz$b;->b:Lcom/kubi/assets/sort/AccountBiz$b;

    .line 137
    .line 138
    .line 139
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 140
    .line 141
    :cond_7
    sget-object v1, Lcom/kubi/sdk/site/SiteVisibleConfigKey;->Option:Lcom/kubi/sdk/site/SiteVisibleConfigKey;

    .line 142
    .line 143
    .line 144
    invoke-static {v1}, Lcom/kubi/sdk/site/b;->b(Lcom/kubi/sdk/site/SiteVisibleConfigKey;)Z

    .line 145
    move-result v1

    .line 146
    .line 147
    if-eqz v1, :cond_8

    .line 148
    .line 149
    sget-object v1, Lcom/kubi/assets/sort/AccountBiz$i;->b:Lcom/kubi/assets/sort/AccountBiz$i;

    .line 150
    .line 151
    .line 152
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 153
    .line 154
    :cond_8
    sget-object v1, Lcom/kubi/sdk/site/SiteVisibleConfigKey;->CLOUD_MINING:Lcom/kubi/sdk/site/SiteVisibleConfigKey;

    .line 155
    .line 156
    .line 157
    invoke-static {v1}, Lcom/kubi/sdk/site/b;->b(Lcom/kubi/sdk/site/SiteVisibleConfigKey;)Z

    .line 158
    move-result v1

    .line 159
    .line 160
    if-eqz v1, :cond_9

    .line 161
    .line 162
    sget-object v1, Lcom/kubi/assets/sort/AccountBiz$h;->b:Lcom/kubi/assets/sort/AccountBiz$h;

    .line 163
    .line 164
    .line 165
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 166
    :cond_9
    return-void
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
.end method

.method public final i(Ljava/util/List;)Ljava/lang/Object;
    .locals 9
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/kubi/assets/sort/i;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "orders"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 8
    .line 9
    new-instance v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    .line 19
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    move-result v1

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    .line 25
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    move-result-object v1

    .line 27
    move-object v2, v1

    .line 28
    .line 29
    check-cast v2, Lcom/kubi/assets/sort/i;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2}, Lcom/kubi/assets/sort/i;->e()Z

    .line 33
    move-result v2

    .line 34
    .line 35
    if-nez v2, :cond_0

    .line 36
    .line 37
    .line 38
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 39
    goto :goto_0

    .line 40
    :catchall_0
    move-exception v0

    .line 41
    move-object p1, v0

    .line 42
    goto :goto_2

    .line 43
    :cond_1
    move-object p1, v0

    .line 44
    .line 45
    new-instance v0, Ljava/util/ArrayList;

    .line 46
    .line 47
    const/16 v1, 0xa

    .line 48
    .line 49
    .line 50
    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 51
    move-result v1

    .line 52
    .line 53
    .line 54
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 55
    .line 56
    .line 57
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 58
    move-result-object p1

    .line 59
    .line 60
    .line 61
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    move-result v1

    .line 63
    .line 64
    if-eqz v1, :cond_2

    .line 65
    .line 66
    .line 67
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    move-result-object v1

    .line 69
    .line 70
    check-cast v1, Lcom/kubi/assets/sort/i;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1}, Lcom/kubi/assets/sort/i;->d()Lcom/kubi/assets/sort/AccountBiz;

    .line 74
    move-result-object v1

    .line 75
    .line 76
    .line 77
    invoke-interface {v1}, Lcom/kubi/assets/sort/AccountBiz;->getKey()Ljava/lang/String;

    .line 78
    move-result-object v1

    .line 79
    .line 80
    .line 81
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 82
    goto :goto_1

    .line 83
    .line 84
    :cond_2
    sget-object p1, Llb/h;->a:Llb/h;

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1}, Llb/h;->y()Ly70/g;

    .line 88
    move-result-object p1

    .line 89
    .line 90
    const-string v1, ","

    .line 91
    .line 92
    const/16 v7, 0x3e

    .line 93
    const/4 v8, 0x0

    .line 94
    const/4 v2, 0x0

    .line 95
    const/4 v3, 0x0

    .line 96
    const/4 v4, 0x0

    .line 97
    const/4 v5, 0x0

    .line 98
    const/4 v6, 0x0

    .line 99
    .line 100
    .line 101
    invoke-static/range {v0 .. v8}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    .line 102
    move-result-object v1

    .line 103
    .line 104
    .line 105
    invoke-static {p1, v1}, Ly70/a;->p(Ly70/g;Ljava/lang/String;)Ly70/a;

    .line 106
    .line 107
    sget-object p1, Lcom/kubi/assets/AssetsLog;->Common:Lcom/kubi/assets/AssetsLog;

    .line 108
    .line 109
    new-instance v1, Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 113
    .line 114
    const-string v2, "\u4fdd\u5b58\u8d26\u6237\u6392\u5e8f\u987a\u5e8f: "

    .line 115
    .line 116
    .line 117
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 124
    move-result-object v0

    .line 125
    .line 126
    .line 127
    invoke-virtual {p1, v0}, Lcom/kubi/assets/AssetsLog;->i(Ljava/lang/String;)V

    .line 128
    .line 129
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 130
    .line 131
    .line 132
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 134
    return-object p1

    .line 135
    .line 136
    :goto_2
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 137
    .line 138
    .line 139
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 140
    move-result-object p1

    .line 141
    .line 142
    .line 143
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    move-result-object p1

    .line 145
    return-object p1
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
.end method

.method public final j()Z
    .locals 2

    .line 1
    .line 2
    sget-object v0, Llb/h;->a:Llb/h;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Llb/h;->h()Ly70/g;

    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1}, Ly70/a;->d(Ly70/g;Z)Z

    .line 11
    move-result v0

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    .line 16
    invoke-static {}, Lcom/kubi/assets/sort/l;->a()Z

    .line 17
    move-result v0

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    const/4 v0, 0x1

    .line 21
    return v0

    .line 22
    :cond_0
    return v1
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method
