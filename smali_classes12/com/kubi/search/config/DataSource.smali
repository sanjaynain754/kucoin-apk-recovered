.class public final Lcom/kubi/search/config/DataSource;
.super Ljava/lang/Object;
.source "DataSource.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0016\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012H\u0086@\u00a2\u0006\u0002\u0010\u0013J\u0014\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0012H\u0082@\u00a2\u0006\u0002\u0010\u0013R.\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR.\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0005@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\tR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/kubi/search/config/DataSource;",
        "",
        "<init>",
        "()V",
        "value",
        "Ljava/util/concurrent/CopyOnWriteArrayList;",
        "Lcom/kubi/data/entity/TradeItemBean;",
        "spotList",
        "getSpotList",
        "()Ljava/util/concurrent/CopyOnWriteArrayList;",
        "Lcom/kubi/search/entity/ContractEntity;",
        "futureList",
        "getFutureList",
        "isFirstLoad",
        "",
        "api",
        "Lcom/kubi/search/SearchApi;",
        "refreshDataSource",
        "",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "fetchFuturesData",
        "SearchLib_googleRelease"
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
        "SMAP\nDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataSource.kt\ncom/kubi/search/config/DataSource\n+ 2 SearchIssue.kt\ncom/kubi/search/exception/SearchIssueKt\n+ 3 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 4 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,81:1\n51#2:82\n53#2:87\n47#3,4:83\n17#4,2:88\n*S KotlinDebug\n*F\n+ 1 DataSource.kt\ncom/kubi/search/config/DataSource\n*L\n47#1:82\n47#1:87\n47#1:83,4\n72#1:88,2\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Lcom/kubi/search/config/DataSource;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static b:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lcom/kubi/data/entity/TradeItemBean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static c:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lcom/kubi/search/entity/ContractEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static d:Z

.field public static final e:Lcom/kubi/search/x;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/search/config/DataSource;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/search/config/DataSource;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/kubi/search/config/DataSource;->a:Lcom/kubi/search/config/DataSource;

    .line 8
    .line 9
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 13
    .line 14
    sput-object v0, Lcom/kubi/search/config/DataSource;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 15
    .line 16
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 17
    .line 18
    .line 19
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 20
    .line 21
    sput-object v0, Lcom/kubi/search/config/DataSource;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 22
    const/4 v0, 0x1

    .line 23
    .line 24
    sput-boolean v0, Lcom/kubi/search/config/DataSource;->d:Z

    .line 25
    .line 26
    const-class v0, Lcom/kubi/search/x;

    .line 27
    .line 28
    .line 29
    invoke-static {v0}, Lcom/kubi/network/retrofit/utils/RetrofitFlowExKt;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    check-cast v0, Lcom/kubi/search/x;

    .line 33
    .line 34
    sput-object v0, Lcom/kubi/search/config/DataSource;->e:Lcom/kubi/search/x;

    .line 35
    return-void
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
.end method

.method public static final synthetic a(Lcom/kubi/search/config/DataSource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/search/config/DataSource;->d(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static final synthetic b()Z
    .locals 1

    .line 1
    .line 2
    sget-boolean v0, Lcom/kubi/search/config/DataSource;->d:Z

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
.end method

.method public static final synthetic c(Z)V
    .locals 0

    .line 1
    .line 2
    sput-boolean p0, Lcom/kubi/search/config/DataSource;->d:Z

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
.end method


# virtual methods
.method public final d(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/kubi/search/entity/ContractEntity;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    instance-of v0, p1, Lcom/kubi/search/config/DataSource$fetchFuturesData$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p1

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/search/config/DataSource$fetchFuturesData$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/search/config/DataSource$fetchFuturesData$1;->label:I

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
    iput v1, v0, Lcom/kubi/search/config/DataSource$fetchFuturesData$1;->label:I

    .line 19
    :goto_0
    move-object v4, v0

    .line 20
    goto :goto_1

    .line 21
    .line 22
    :cond_0
    new-instance v0, Lcom/kubi/search/config/DataSource$fetchFuturesData$1;

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, p0, p1}, Lcom/kubi/search/config/DataSource$fetchFuturesData$1;-><init>(Lcom/kubi/search/config/DataSource;Lkotlin/coroutines/Continuation;)V

    .line 26
    goto :goto_0

    .line 27
    .line 28
    :goto_1
    iget-object p1, v4, Lcom/kubi/search/config/DataSource$fetchFuturesData$1;->result:Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    iget v1, v4, Lcom/kubi/search/config/DataSource$fetchFuturesData$1;->label:I

    .line 35
    const/4 v2, 0x2

    .line 36
    const/4 v3, 0x1

    .line 37
    const/4 v5, 0x0

    .line 38
    .line 39
    if-eqz v1, :cond_3

    .line 40
    .line 41
    if-eq v1, v3, :cond_2

    .line 42
    .line 43
    if-ne v1, v2, :cond_1

    .line 44
    .line 45
    .line 46
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 47
    .line 48
    goto/16 :goto_5

    .line 49
    .line 50
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 51
    .line 52
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    .line 55
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    throw p1

    .line 57
    .line 58
    :cond_2
    iget v1, v4, Lcom/kubi/search/config/DataSource$fetchFuturesData$1;->I$0:I

    .line 59
    .line 60
    iget-object v3, v4, Lcom/kubi/search/config/DataSource$fetchFuturesData$1;->L$1:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v3, Ls10/a;

    .line 63
    .line 64
    iget-object v3, v4, Lcom/kubi/search/config/DataSource$fetchFuturesData$1;->L$0:Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 68
    goto :goto_2

    .line 69
    .line 70
    .line 71
    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 72
    .line 73
    sget-object p1, Lcom/kubi/router/core/Router;->a:Lcom/kubi/router/core/Router;

    .line 74
    .line 75
    sget-object v1, Lcom/kubi/sdk/site/info/SiteInfoManager;->a:Lcom/kubi/sdk/site/info/SiteInfoManager;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1}, Lcom/kubi/sdk/site/info/SiteInfoManager;->c()Ljava/lang/String;

    .line 79
    move-result-object v1

    .line 80
    .line 81
    const-class v6, Ls10/a;

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1, v6, v1}, Lcom/kubi/router/core/Router;->h(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    .line 85
    move-result-object p1

    .line 86
    .line 87
    if-eqz p1, :cond_6

    .line 88
    move-object v1, p1

    .line 89
    .line 90
    check-cast v1, Ls10/a;

    .line 91
    .line 92
    sget-object v6, Lcom/kubi/search/config/DataSource;->e:Lcom/kubi/search/x;

    .line 93
    .line 94
    .line 95
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    move-result-object v7

    .line 97
    .line 98
    iput-object v7, v4, Lcom/kubi/search/config/DataSource$fetchFuturesData$1;->L$0:Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    move-result-object v7

    .line 103
    .line 104
    iput-object v7, v4, Lcom/kubi/search/config/DataSource$fetchFuturesData$1;->L$1:Ljava/lang/Object;

    .line 105
    .line 106
    iput v5, v4, Lcom/kubi/search/config/DataSource$fetchFuturesData$1;->I$0:I

    .line 107
    .line 108
    iput v5, v4, Lcom/kubi/search/config/DataSource$fetchFuturesData$1;->I$1:I

    .line 109
    .line 110
    iput v3, v4, Lcom/kubi/search/config/DataSource$fetchFuturesData$1;->label:I

    .line 111
    .line 112
    .line 113
    invoke-interface {v1, v6, v4}, Ls10/a;->a(Lcom/kubi/search/x;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 114
    move-result-object v1

    .line 115
    .line 116
    if-ne v1, v0, :cond_4

    .line 117
    goto :goto_4

    .line 118
    :cond_4
    move-object v3, p1

    .line 119
    move-object p1, v1

    .line 120
    move v1, v5

    .line 121
    .line 122
    :goto_2
    check-cast p1, Ljava/util/List;

    .line 123
    .line 124
    if-nez p1, :cond_5

    .line 125
    move-object p1, v3

    .line 126
    goto :goto_3

    .line 127
    :cond_5
    return-object p1

    .line 128
    :cond_6
    move v1, v5

    .line 129
    .line 130
    :goto_3
    sget-object v3, Lcom/kubi/sdk/site/SiteVisibleConfigKey;->Futures:Lcom/kubi/sdk/site/SiteVisibleConfigKey;

    .line 131
    .line 132
    .line 133
    invoke-static {v3}, Lcom/kubi/sdk/site/b;->b(Lcom/kubi/sdk/site/SiteVisibleConfigKey;)Z

    .line 134
    move-result v3

    .line 135
    .line 136
    if-nez v3, :cond_7

    .line 137
    .line 138
    .line 139
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 140
    move-result-object p1

    .line 141
    return-object p1

    .line 142
    .line 143
    :cond_7
    sget-object v3, Lcom/kubi/search/config/DataSource;->e:Lcom/kubi/search/x;

    .line 144
    .line 145
    .line 146
    invoke-interface {v3}, Lcom/kubi/search/x;->h()Lkotlinx/coroutines/flow/e;

    .line 147
    move-result-object v3

    .line 148
    .line 149
    .line 150
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    move-result-object p1

    .line 152
    .line 153
    iput-object p1, v4, Lcom/kubi/search/config/DataSource$fetchFuturesData$1;->L$0:Ljava/lang/Object;

    .line 154
    const/4 p1, 0x0

    .line 155
    .line 156
    iput-object p1, v4, Lcom/kubi/search/config/DataSource$fetchFuturesData$1;->L$1:Ljava/lang/Object;

    .line 157
    .line 158
    iput v1, v4, Lcom/kubi/search/config/DataSource$fetchFuturesData$1;->I$0:I

    .line 159
    .line 160
    iput v5, v4, Lcom/kubi/search/config/DataSource$fetchFuturesData$1;->I$1:I

    .line 161
    .line 162
    iput v2, v4, Lcom/kubi/search/config/DataSource$fetchFuturesData$1;->label:I

    .line 163
    const/4 v2, 0x0

    .line 164
    move-object v1, v3

    .line 165
    const/4 v3, 0x0

    .line 166
    const/4 v5, 0x2

    .line 167
    const/4 v6, 0x0

    .line 168
    .line 169
    .line 170
    invoke-static/range {v1 .. v6}, Lcom/kubi/network/retrofit/utils/RetrofitFlowExKt;->g(Lkotlinx/coroutines/flow/e;ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 171
    move-result-object p1

    .line 172
    .line 173
    if-ne p1, v0, :cond_8

    .line 174
    :goto_4
    return-object v0

    .line 175
    .line 176
    :cond_8
    :goto_5
    check-cast p1, Lcom/kubi/network/retrofit/utils/f;

    .line 177
    .line 178
    .line 179
    invoke-virtual {p1}, Lcom/kubi/network/retrofit/utils/f;->a()Ljava/lang/Object;

    .line 180
    move-result-object p1

    .line 181
    .line 182
    check-cast p1, Ljava/util/List;

    .line 183
    .line 184
    if-nez p1, :cond_9

    .line 185
    .line 186
    .line 187
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 188
    move-result-object p1

    .line 189
    :cond_9
    return-object p1
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
.end method

.method public final e()Ljava/util/concurrent/CopyOnWriteArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lcom/kubi/search/entity/ContractEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/search/config/DataSource;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

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
.end method

.method public final f()Ljava/util/concurrent/CopyOnWriteArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lcom/kubi/data/entity/TradeItemBean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/search/config/DataSource;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

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
.end method

.method public final g(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/Object;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lo00/a;->b()Lkotlinx/coroutines/j0;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    sget-object v1, Lkotlinx/coroutines/CoroutineExceptionHandler;->M0:Lkotlinx/coroutines/CoroutineExceptionHandler$a;

    .line 7
    .line 8
    new-instance v2, Lr10/a;

    .line 9
    .line 10
    .line 11
    invoke-direct {v2, v1}, Lr10/a;-><init>(Lkotlinx/coroutines/CoroutineExceptionHandler$a;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v2}, Lkotlin/coroutines/AbstractCoroutineContextElement;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    new-instance v1, Lcom/kubi/search/config/DataSource$refreshDataSource$2;

    .line 18
    const/4 v2, 0x0

    .line 19
    .line 20
    .line 21
    invoke-direct {v1, v2}, Lcom/kubi/search/config/DataSource$refreshDataSource$2;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 22
    .line 23
    .line 24
    invoke-static {v0, v1, p1}, Lkotlinx/coroutines/h;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 25
    move-result-object p1

    .line 26
    return-object p1
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
.end method
