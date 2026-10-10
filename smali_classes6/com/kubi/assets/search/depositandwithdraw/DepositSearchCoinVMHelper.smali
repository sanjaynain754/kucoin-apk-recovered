.class public final Lcom/kubi/assets/search/depositandwithdraw/DepositSearchCoinVMHelper;
.super Lcom/kubi/assets/search/depositandwithdraw/q0;
.source "DepositSearchCoinVMHelper.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007H\u0016J\u000e\u0010\t\u001a\u00020\nH\u0096@\u00a2\u0006\u0002\u0010\u000bJ\u001c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\r0\u00072\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u0016J\u0008\u0010\u000f\u001a\u00020\u0005H\u0016J\u001c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\r0\u00072\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u0016J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0013\u001a\u00020\u0014H\u0016\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/kubi/assets/search/depositandwithdraw/DepositSearchCoinVMHelper;",
        "Lcom/kubi/assets/search/depositandwithdraw/SearchCoinVMHelper;",
        "<init>",
        "()V",
        "saveHistory",
        "",
        "getHistoryCoinListFromLocal",
        "",
        "Lcom/kubi/data/entity/CoinInfoEntity;",
        "handleGetServerData",
        "",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "buildSearchCoinList",
        "Lcom/kubi/assets/entity/SearchCoinEntity;",
        "list",
        "removeAllHistory",
        "handleServerCoinListData",
        "coinInfoEntities",
        "getCoinInfoByCurrentCurrency",
        "currency",
        "",
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
        "SMAP\nDepositSearchCoinVMHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DepositSearchCoinVMHelper.kt\ncom/kubi/assets/search/depositandwithdraw/DepositSearchCoinVMHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 5 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 6 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 7 AssetEx.kt\ncom/kubi/assets/AssetExKt\n*L\n1#1,100:1\n1617#2,9:101\n1869#2:110\n1870#2:112\n1626#2:113\n774#2:122\n865#2,2:123\n1011#2,2:128\n1#3:111\n1#3:119\n1#3:134\n23#4,2:114\n32#4:116\n15#4:121\n149#5:117\n25#6:118\n26#6:120\n131#7,3:125\n134#7,4:130\n*S KotlinDebug\n*F\n+ 1 DepositSearchCoinVMHelper.kt\ncom/kubi/assets/search/depositandwithdraw/DepositSearchCoinVMHelper\n*L\n32#1:101,9\n32#1:110\n32#1:112\n32#1:113\n91#1:122\n91#1:123,2\n92#1:128,2\n32#1:111\n63#1:119\n32#1:114,2\n44#1:116\n80#1:121\n43#1:117\n63#1:118\n63#1:120\n92#1:125,3\n92#1:130,4\n*E\n"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/assets/search/depositandwithdraw/q0;-><init>()V

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
.method public B(Ljava/util/List;)Ljava/util/List;
    .locals 4
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/kubi/data/entity/CoinInfoEntity;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/kubi/assets/entity/SearchCoinEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "coinInfoEntities"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/kubi/assets/search/depositandwithdraw/q0;->j()Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V

    .line 13
    .line 14
    new-instance v1, Ljava/util/ArrayList;

    .line 15
    .line 16
    .line 17
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    move-result-object p1

    .line 22
    .line 23
    .line 24
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    move-result v2

    .line 26
    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    .line 30
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    move-result-object v2

    .line 32
    move-object v3, v2

    .line 33
    .line 34
    check-cast v3, Lcom/kubi/data/entity/CoinInfoEntity;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v3}, Lcom/kubi/data/entity/CoinInfoEntity;->isDisplayDeposit()Z

    .line 38
    move-result v3

    .line 39
    .line 40
    if-eqz v3, :cond_0

    .line 41
    .line 42
    .line 43
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 44
    goto :goto_0

    .line 45
    .line 46
    .line 47
    :cond_1
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->addAll(Ljava/util/Collection;)Z

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    .line 51
    move-result p1

    .line 52
    const/4 v1, 0x1

    .line 53
    .line 54
    if-le p1, v1, :cond_3

    .line 55
    .line 56
    new-instance p1, Ljava/util/ArrayList;

    .line 57
    .line 58
    .line 59
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 60
    .line 61
    .line 62
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 63
    move-result v2

    .line 64
    .line 65
    if-le v2, v1, :cond_2

    .line 66
    .line 67
    new-instance v1, Lcom/kubi/assets/search/depositandwithdraw/DepositSearchCoinVMHelper$b;

    .line 68
    .line 69
    .line 70
    invoke-direct {v1}, Lcom/kubi/assets/search/depositandwithdraw/DepositSearchCoinVMHelper$b;-><init>()V

    .line 71
    .line 72
    .line 73
    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->sortWith(Ljava/util/List;Ljava/util/Comparator;)V

    .line 74
    .line 75
    .line 76
    :cond_2
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->addAll(Ljava/util/Collection;)Z

    .line 80
    .line 81
    .line 82
    :cond_3
    invoke-virtual {p0, v0}, Lcom/kubi/assets/search/depositandwithdraw/q0;->t(Ljava/util/List;)V

    .line 83
    const/4 p1, 0x5

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0, v0, p1}, Lcom/kubi/assets/search/depositandwithdraw/q0;->A(Ljava/util/List;I)Ljava/util/List;

    .line 87
    move-result-object p1

    .line 88
    return-object p1
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
.end method

.method public d(Ljava/util/List;)Ljava/util/List;
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/kubi/data/entity/CoinInfoEntity;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/kubi/assets/entity/SearchCoinEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "list"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    const/4 v0, 0x5

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1, v0}, Lcom/kubi/assets/search/depositandwithdraw/q0;->A(Ljava/util/List;I)Ljava/util/List;

    .line 10
    move-result-object p1

    .line 11
    return-object p1
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
.end method

.method public i(Ljava/lang/String;)Lcom/kubi/data/entity/CoinInfoEntity;
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    const-string v0, "currency"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/kubi/assets/search/depositandwithdraw/q0;->j()Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    move-result v1

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    move-result-object v1

    .line 24
    move-object v2, v1

    .line 25
    .line 26
    check-cast v2, Lcom/kubi/data/entity/CoinInfoEntity;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2}, Lcom/kubi/data/entity/CoinInfoEntity;->getCurrency()Ljava/lang/String;

    .line 30
    move-result-object v3

    .line 31
    .line 32
    .line 33
    invoke-static {v3, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    move-result v3

    .line 35
    .line 36
    if-eqz v3, :cond_0

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2}, Lcom/kubi/data/entity/CoinInfoEntity;->isDisplayDeposit()Z

    .line 40
    move-result v2

    .line 41
    .line 42
    if-eqz v2, :cond_0

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    const/4 v1, 0x0

    .line 45
    .line 46
    :goto_0
    check-cast v1, Lcom/kubi/data/entity/CoinInfoEntity;

    .line 47
    return-object v1
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
.end method

.method public m()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/kubi/data/entity/CoinInfoEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 3
    .line 4
    sget-object v0, Llb/h;->a:Llb/h;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Llb/h;->l()Ly70/g;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    const-string v1, ""

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, Ly70/a;->h(Ly70/g;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    sget-object v1, Lcom/kubi/utils/x;->a:Lcom/kubi/utils/x;

    .line 17
    .line 18
    new-instance v1, Lcom/kubi/assets/search/depositandwithdraw/DepositSearchCoinVMHelper$a;

    .line 19
    .line 20
    .line 21
    invoke-direct {v1}, Lcom/kubi/assets/search/depositandwithdraw/DepositSearchCoinVMHelper$a;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 25
    move-result-object v1

    .line 26
    .line 27
    .line 28
    invoke-static {v0, v1}, Lcom/kubi/utils/x;->d(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    check-cast v0, Ljava/util/List;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v0}, Lcom/kubi/assets/search/depositandwithdraw/q0;->y(Ljava/util/List;)Ljava/util/List;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    .line 38
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    goto :goto_0

    .line 41
    :catchall_0
    move-exception v0

    .line 42
    .line 43
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 44
    .line 45
    .line 46
    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 47
    move-result-object v0

    .line 48
    .line 49
    .line 50
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    move-result-object v0

    .line 52
    .line 53
    .line 54
    :goto_0
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 55
    move-result v1

    .line 56
    .line 57
    if-eqz v1, :cond_0

    .line 58
    const/4 v0, 0x0

    .line 59
    .line 60
    :cond_0
    check-cast v0, Ljava/util/List;

    .line 61
    return-object v0
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

.method public q(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 9
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    instance-of v0, p1, Lcom/kubi/assets/search/depositandwithdraw/DepositSearchCoinVMHelper$handleGetServerData$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p1

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/assets/search/depositandwithdraw/DepositSearchCoinVMHelper$handleGetServerData$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/assets/search/depositandwithdraw/DepositSearchCoinVMHelper$handleGetServerData$1;->label:I

    .line 10
    .line 11
    const/high16 v2, -0x80000000

    .line 12
    .line 13
    and-int v3, v1, v2

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    sub-int/2addr v1, v2

    .line 17
    .line 18
    iput v1, v0, Lcom/kubi/assets/search/depositandwithdraw/DepositSearchCoinVMHelper$handleGetServerData$1;->label:I

    .line 19
    :goto_0
    move-object v4, v0

    .line 20
    goto :goto_1

    .line 21
    .line 22
    :cond_0
    new-instance v0, Lcom/kubi/assets/search/depositandwithdraw/DepositSearchCoinVMHelper$handleGetServerData$1;

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, p0, p1}, Lcom/kubi/assets/search/depositandwithdraw/DepositSearchCoinVMHelper$handleGetServerData$1;-><init>(Lcom/kubi/assets/search/depositandwithdraw/DepositSearchCoinVMHelper;Lkotlin/coroutines/Continuation;)V

    .line 26
    goto :goto_0

    .line 27
    .line 28
    :goto_1
    iget-object p1, v4, Lcom/kubi/assets/search/depositandwithdraw/DepositSearchCoinVMHelper$handleGetServerData$1;->result:Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    iget v1, v4, Lcom/kubi/assets/search/depositandwithdraw/DepositSearchCoinVMHelper$handleGetServerData$1;->label:I

    .line 35
    const/4 v7, 0x2

    .line 36
    const/4 v2, 0x1

    .line 37
    .line 38
    if-eqz v1, :cond_3

    .line 39
    .line 40
    if-eq v1, v2, :cond_2

    .line 41
    .line 42
    if-ne v1, v7, :cond_1

    .line 43
    .line 44
    iget-object v0, v4, Lcom/kubi/assets/search/depositandwithdraw/DepositSearchCoinVMHelper$handleGetServerData$1;->L$0:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, Lkotlinx/coroutines/w;

    .line 47
    .line 48
    .line 49
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 50
    return-object p1

    .line 51
    .line 52
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 53
    .line 54
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 55
    .line 56
    .line 57
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 58
    throw p1

    .line 59
    .line 60
    :cond_2
    iget-object v1, v4, Lcom/kubi/assets/search/depositandwithdraw/DepositSearchCoinVMHelper$handleGetServerData$1;->L$0:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v1, Lkotlinx/coroutines/w;

    .line 63
    .line 64
    .line 65
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 66
    goto :goto_2

    .line 67
    .line 68
    .line 69
    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 70
    const/4 p1, 0x0

    .line 71
    .line 72
    .line 73
    invoke-static {p1, v2, p1}, Lkotlinx/coroutines/y;->c(Lkotlinx/coroutines/x1;ILjava/lang/Object;)Lkotlinx/coroutines/w;

    .line 74
    move-result-object v8

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, Lcom/kubi/assets/search/depositandwithdraw/q0;->p()Lib/a;

    .line 78
    move-result-object v1

    .line 79
    .line 80
    const-string v3, "DEPOSIT"

    .line 81
    .line 82
    .line 83
    invoke-interface {v1, v3}, Lib/a;->d(Ljava/lang/String;)Lkotlinx/coroutines/flow/e;

    .line 84
    move-result-object v1

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0}, Lcom/kubi/assets/search/depositandwithdraw/q0;->p()Lib/a;

    .line 88
    move-result-object v3

    .line 89
    .line 90
    .line 91
    invoke-interface {v3}, Lib/a;->a()Lkotlinx/coroutines/flow/e;

    .line 92
    move-result-object v3

    .line 93
    .line 94
    new-instance v5, Lcom/kubi/assets/search/depositandwithdraw/DepositSearchCoinVMHelper$handleGetServerData$2;

    .line 95
    .line 96
    .line 97
    invoke-direct {v5, p0, p1}, Lcom/kubi/assets/search/depositandwithdraw/DepositSearchCoinVMHelper$handleGetServerData$2;-><init>(Lcom/kubi/assets/search/depositandwithdraw/DepositSearchCoinVMHelper;Lkotlin/coroutines/Continuation;)V

    .line 98
    .line 99
    .line 100
    invoke-static {v1, v3, v5}, Lkotlinx/coroutines/flow/g;->o0(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/e;

    .line 101
    move-result-object v1

    .line 102
    .line 103
    new-instance v3, Lcom/kubi/assets/search/depositandwithdraw/DepositSearchCoinVMHelper$handleGetServerData$3;

    .line 104
    .line 105
    .line 106
    invoke-direct {v3, v8, p1}, Lcom/kubi/assets/search/depositandwithdraw/DepositSearchCoinVMHelper$handleGetServerData$3;-><init>(Lkotlinx/coroutines/w;Lkotlin/coroutines/Continuation;)V

    .line 107
    .line 108
    iput-object v8, v4, Lcom/kubi/assets/search/depositandwithdraw/DepositSearchCoinVMHelper$handleGetServerData$1;->L$0:Ljava/lang/Object;

    .line 109
    .line 110
    iput v2, v4, Lcom/kubi/assets/search/depositandwithdraw/DepositSearchCoinVMHelper$handleGetServerData$1;->label:I

    .line 111
    const/4 v2, 0x0

    .line 112
    const/4 v5, 0x1

    .line 113
    const/4 v6, 0x0

    .line 114
    .line 115
    .line 116
    invoke-static/range {v1 .. v6}, Lcom/kubi/network/retrofit/utils/RetrofitFlowExKt;->e(Lkotlinx/coroutines/flow/e;ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 117
    move-result-object p1

    .line 118
    .line 119
    if-ne p1, v0, :cond_4

    .line 120
    goto :goto_3

    .line 121
    :cond_4
    move-object v1, v8

    .line 122
    .line 123
    :goto_2
    check-cast p1, Lcom/kubi/network/retrofit/utils/f;

    .line 124
    .line 125
    .line 126
    invoke-virtual {p1}, Lcom/kubi/network/retrofit/utils/f;->b()Ljava/lang/Throwable;

    .line 127
    move-result-object p1

    .line 128
    .line 129
    if-eqz p1, :cond_5

    .line 130
    const/4 p1, 0x0

    .line 131
    .line 132
    .line 133
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 134
    move-result-object p1

    .line 135
    .line 136
    .line 137
    invoke-interface {v1, p1}, Lkotlinx/coroutines/w;->n(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    :cond_5
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    move-result-object p1

    .line 142
    .line 143
    iput-object p1, v4, Lcom/kubi/assets/search/depositandwithdraw/DepositSearchCoinVMHelper$handleGetServerData$1;->L$0:Ljava/lang/Object;

    .line 144
    .line 145
    iput v7, v4, Lcom/kubi/assets/search/depositandwithdraw/DepositSearchCoinVMHelper$handleGetServerData$1;->label:I

    .line 146
    .line 147
    .line 148
    invoke-interface {v1, v4}, Lkotlinx/coroutines/r0;->h(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 149
    move-result-object p1

    .line 150
    .line 151
    if-ne p1, v0, :cond_6

    .line 152
    :goto_3
    return-object v0

    .line 153
    :cond_6
    return-object p1
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

.method public s()V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Llb/h;->a:Llb/h;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Llb/h;->l()Ly70/g;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Ly70/a;->r(Ly70/g;)Ly70/a;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/kubi/assets/search/depositandwithdraw/q0;->n()Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V

    .line 17
    return-void
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

.method public u()V
    .locals 5

    .line 1
    .line 2
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 3
    .line 4
    sget-object v0, Llb/h;->a:Llb/h;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Llb/h;->l()Ly70/g;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/kubi/assets/search/depositandwithdraw/q0;->n()Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    new-instance v2, Ljava/util/ArrayList;

    .line 15
    .line 16
    .line 17
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    .line 24
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    move-result v3

    .line 26
    const/4 v4, 0x0

    .line 27
    .line 28
    if-eqz v3, :cond_2

    .line 29
    .line 30
    .line 31
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    move-result-object v3

    .line 33
    .line 34
    check-cast v3, Lcom/kubi/data/entity/CoinInfoEntity;

    .line 35
    .line 36
    if-eqz v3, :cond_1

    .line 37
    .line 38
    .line 39
    invoke-virtual {v3}, Lcom/kubi/data/entity/CoinInfoEntity;->getCurrency()Ljava/lang/String;

    .line 40
    move-result-object v4

    .line 41
    goto :goto_1

    .line 42
    :catchall_0
    move-exception v0

    .line 43
    goto :goto_2

    .line 44
    .line 45
    :cond_1
    :goto_1
    if-eqz v4, :cond_0

    .line 46
    .line 47
    .line 48
    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 49
    goto :goto_0

    .line 50
    :cond_2
    const/4 v1, 0x0

    .line 51
    const/4 v3, 0x2

    .line 52
    .line 53
    .line 54
    invoke-static {v2, v1, v3, v4}, Lcom/kubi/utils/x;->i(Ljava/lang/Object;ZILjava/lang/Object;)Ljava/lang/String;

    .line 55
    move-result-object v1

    .line 56
    .line 57
    .line 58
    invoke-static {v0, v1}, Ly70/a;->p(Ly70/g;Ljava/lang/String;)Ly70/a;

    .line 59
    .line 60
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 61
    .line 62
    .line 63
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    return-void

    .line 65
    .line 66
    :goto_2
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 67
    .line 68
    .line 69
    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 70
    move-result-object v0

    .line 71
    .line 72
    .line 73
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    return-void
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
