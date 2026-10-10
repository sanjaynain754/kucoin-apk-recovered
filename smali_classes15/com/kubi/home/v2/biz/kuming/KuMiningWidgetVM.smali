.class public final Lcom/kubi/home/v2/biz/kuming/KuMiningWidgetVM;
.super Lcom/kubi/mvi/state/m;
.source "KuMiningWidgetVM.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/kubi/mvi/state/m<",
        "Lcom/kubi/home/v2/biz/kuming/KuMiningWidgetContract$UIState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0094@\u00a2\u0006\u0002\u0010\u0014J\u000e\u0010\u0015\u001a\u00020\u0011H\u0082@\u00a2\u0006\u0002\u0010\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u0007\u0010\u0008R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u00028TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/kubi/home/v2/biz/kuming/KuMiningWidgetVM;",
        "Lcom/kubi/mvi/state/SingleSimpleStateVM;",
        "Lcom/kubi/home/v2/biz/kuming/KuMiningWidgetContract$UIState;",
        "<init>",
        "()V",
        "repo",
        "Lcom/kubi/home/api/HomeBizRepo;",
        "getRepo",
        "()Lcom/kubi/home/api/HomeBizRepo;",
        "repo$delegate",
        "Lkotlin/Lazy;",
        "firstLoad",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "initState",
        "getInitState",
        "()Lcom/kubi/home/v2/biz/kuming/KuMiningWidgetContract$UIState;",
        "dispatchIntent",
        "",
        "intent",
        "Lcom/kubi/mvi/state/IIntent;",
        "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "loadData",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "HomeLib_googleRelease"
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
        "SMAP\nKuMiningWidgetVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KuMiningWidgetVM.kt\ncom/kubi/home/v2/biz/kuming/KuMiningWidgetVM\n+ 2 BaseStateVM.kt\ncom/kubi/mvi/state/BaseStateVM\n+ 3 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 4 KVStore.kt\ncom/kubi/utils/storage/KVStore\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,43:1\n473#2,4:44\n153#3,2:48\n144#3,2:52\n178#4:50\n1#5:51\n*S KotlinDebug\n*F\n+ 1 KuMiningWidgetVM.kt\ncom/kubi/home/v2/biz/kuming/KuMiningWidgetVM\n*L\n26#1:44,4\n32#1:48,2\n37#1:52,2\n32#1:50\n*E\n"
    }
.end annotation


# instance fields
.field public final X:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final Y:Ljava/util/concurrent/atomic/AtomicBoolean;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/mvi/state/m;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/kubi/home/v2/biz/kuming/e;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lcom/kubi/home/v2/biz/kuming/e;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    iput-object v0, p0, Lcom/kubi/home/v2/biz/kuming/KuMiningWidgetVM;->X:Lkotlin/Lazy;

    .line 15
    .line 16
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 17
    const/4 v1, 0x1

    .line 18
    .line 19
    .line 20
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 21
    .line 22
    iput-object v0, p0, Lcom/kubi/home/v2/biz/kuming/KuMiningWidgetVM;->Y:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 23
    return-void
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
.end method

.method public static synthetic n()Lcom/kubi/home/api/HomeBizRepo;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/home/v2/biz/kuming/KuMiningWidgetVM;->s()Lcom/kubi/home/api/HomeBizRepo;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method

.method public static final synthetic o(Lcom/kubi/home/v2/biz/kuming/KuMiningWidgetVM;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/kubi/home/v2/biz/kuming/KuMiningWidgetVM;->r(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
.end method

.method private final r(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    instance-of v0, p1, Lcom/kubi/home/v2/biz/kuming/KuMiningWidgetVM$loadData$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p1

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/home/v2/biz/kuming/KuMiningWidgetVM$loadData$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/home/v2/biz/kuming/KuMiningWidgetVM$loadData$1;->label:I

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
    iput v1, v0, Lcom/kubi/home/v2/biz/kuming/KuMiningWidgetVM$loadData$1;->label:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/kubi/home/v2/biz/kuming/KuMiningWidgetVM$loadData$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p1}, Lcom/kubi/home/v2/biz/kuming/KuMiningWidgetVM$loadData$1;-><init>(Lcom/kubi/home/v2/biz/kuming/KuMiningWidgetVM;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p1, v0, Lcom/kubi/home/v2/biz/kuming/KuMiningWidgetVM$loadData$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/kubi/home/v2/biz/kuming/KuMiningWidgetVM$loadData$1;->label:I

    .line 33
    const/4 v3, 0x1

    .line 34
    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    .line 40
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 41
    goto :goto_1

    .line 42
    .line 43
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 44
    .line 45
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    .line 48
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 49
    throw p1

    .line 50
    .line 51
    .line 52
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 53
    .line 54
    iget-object p1, p0, Lcom/kubi/home/v2/biz/kuming/KuMiningWidgetVM;->Y:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 55
    const/4 v2, 0x0

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, v3, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 59
    move-result p1

    .line 60
    .line 61
    if-eqz p1, :cond_3

    .line 62
    .line 63
    sget-object v2, Lsj/a;->a:Lsj/a;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2}, Lsj/a;->c()Ly70/g;

    .line 67
    move-result-object v2

    .line 68
    .line 69
    sget-object v4, Ly70/a;->a:Ly70/a;

    .line 70
    .line 71
    const-class v5, Lcom/kubi/home/v2/biz/kuming/KuMiningDataEntity;

    .line 72
    const/4 v6, 0x0

    .line 73
    .line 74
    .line 75
    invoke-virtual {v4, v2, v5, v6}, Ly70/a;->j(Ly70/g;Ljava/lang/Class;Landroid/os/Parcelable;)Landroid/os/Parcelable;

    .line 76
    move-result-object v2

    .line 77
    .line 78
    check-cast v2, Lcom/kubi/home/v2/biz/kuming/KuMiningDataEntity;

    .line 79
    .line 80
    if-eqz v2, :cond_3

    .line 81
    .line 82
    new-instance v4, Lcom/kubi/home/v2/biz/kuming/d;

    .line 83
    .line 84
    .line 85
    invoke-direct {v4, v2}, Lcom/kubi/home/v2/biz/kuming/d;-><init>(Lcom/kubi/home/v2/biz/kuming/KuMiningDataEntity;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0, v4}, Lcom/kubi/mvi/state/BaseStateVM;->send(Ldr/a;)V

    .line 89
    .line 90
    .line 91
    :cond_3
    invoke-virtual {p0}, Lcom/kubi/home/v2/biz/kuming/KuMiningWidgetVM;->q()Lcom/kubi/home/api/HomeBizRepo;

    .line 92
    move-result-object v2

    .line 93
    .line 94
    iput-boolean p1, v0, Lcom/kubi/home/v2/biz/kuming/KuMiningWidgetVM$loadData$1;->Z$0:Z

    .line 95
    .line 96
    iput v3, v0, Lcom/kubi/home/v2/biz/kuming/KuMiningWidgetVM$loadData$1;->label:I

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2, v0}, Lcom/kubi/home/api/HomeBizRepo;->d(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 100
    move-result-object p1

    .line 101
    .line 102
    if-ne p1, v1, :cond_4

    .line 103
    return-object v1

    .line 104
    .line 105
    :cond_4
    :goto_1
    check-cast p1, Lcom/kubi/home/v2/biz/kuming/KuMiningDataEntity;

    .line 106
    .line 107
    if-eqz p1, :cond_5

    .line 108
    .line 109
    sget-object v0, Lsj/a;->a:Lsj/a;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0}, Lsj/a;->c()Ly70/g;

    .line 113
    move-result-object v0

    .line 114
    .line 115
    .line 116
    invoke-static {v0, p1}, Ly70/a;->n(Ly70/g;Landroid/os/Parcelable;)Ly70/a;

    .line 117
    .line 118
    :cond_5
    new-instance v0, Lcom/kubi/home/v2/biz/kuming/d;

    .line 119
    .line 120
    .line 121
    invoke-direct {v0, p1}, Lcom/kubi/home/v2/biz/kuming/d;-><init>(Lcom/kubi/home/v2/biz/kuming/KuMiningDataEntity;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p0, v0}, Lcom/kubi/mvi/state/BaseStateVM;->send(Ldr/a;)V

    .line 125
    .line 126
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 127
    return-object p1
.end method

.method public static final s()Lcom/kubi/home/api/HomeBizRepo;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/home/api/HomeBizRepo;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/home/api/HomeBizRepo;-><init>()V

    .line 6
    return-object v0
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
.end method


# virtual methods
.method public dispatchIntent(Lcom/kubi/mvi/state/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .param p1    # Lcom/kubi/mvi/state/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/mvi/state/d;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    instance-of v0, p2, Lcom/kubi/home/v2/biz/kuming/KuMiningWidgetVM$dispatchIntent$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p2

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/home/v2/biz/kuming/KuMiningWidgetVM$dispatchIntent$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/home/v2/biz/kuming/KuMiningWidgetVM$dispatchIntent$1;->label:I

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
    iput v1, v0, Lcom/kubi/home/v2/biz/kuming/KuMiningWidgetVM$dispatchIntent$1;->label:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/kubi/home/v2/biz/kuming/KuMiningWidgetVM$dispatchIntent$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p2}, Lcom/kubi/home/v2/biz/kuming/KuMiningWidgetVM$dispatchIntent$1;-><init>(Lcom/kubi/home/v2/biz/kuming/KuMiningWidgetVM;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p2, v0, Lcom/kubi/home/v2/biz/kuming/KuMiningWidgetVM$dispatchIntent$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/kubi/home/v2/biz/kuming/KuMiningWidgetVM$dispatchIntent$1;->label:I

    .line 33
    const/4 v3, 0x1

    .line 34
    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    iget-object p1, v0, Lcom/kubi/home/v2/biz/kuming/KuMiningWidgetVM$dispatchIntent$1;->L$3:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, Lcom/kubi/home/v2/biz/kuming/KuMiningWidgetContract$UiIntent$LoadData;

    .line 42
    .line 43
    iget-object p1, v0, Lcom/kubi/home/v2/biz/kuming/KuMiningWidgetVM$dispatchIntent$1;->L$2:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p1, Lcom/kubi/mvi/state/d;

    .line 46
    .line 47
    iget-object p1, v0, Lcom/kubi/home/v2/biz/kuming/KuMiningWidgetVM$dispatchIntent$1;->L$1:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p1, Lcom/kubi/mvi/state/BaseStateVM;

    .line 50
    .line 51
    iget-object p1, v0, Lcom/kubi/home/v2/biz/kuming/KuMiningWidgetVM$dispatchIntent$1;->L$0:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast p1, Lcom/kubi/mvi/state/d;

    .line 54
    .line 55
    .line 56
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 57
    goto :goto_1

    .line 58
    .line 59
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 60
    .line 61
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 62
    .line 63
    .line 64
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 65
    throw p1

    .line 66
    .line 67
    .line 68
    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 69
    .line 70
    instance-of p2, p1, Lcom/kubi/home/v2/biz/kuming/KuMiningWidgetContract$UiIntent$LoadData;

    .line 71
    .line 72
    if-eqz p2, :cond_3

    .line 73
    move-object p2, p1

    .line 74
    .line 75
    check-cast p2, Lcom/kubi/home/v2/biz/kuming/KuMiningWidgetContract$UiIntent$LoadData;

    .line 76
    .line 77
    .line 78
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    move-result-object v2

    .line 80
    .line 81
    iput-object v2, v0, Lcom/kubi/home/v2/biz/kuming/KuMiningWidgetVM$dispatchIntent$1;->L$0:Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    invoke-static {p0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    move-result-object v2

    .line 86
    .line 87
    iput-object v2, v0, Lcom/kubi/home/v2/biz/kuming/KuMiningWidgetVM$dispatchIntent$1;->L$1:Ljava/lang/Object;

    .line 88
    .line 89
    iput-object p1, v0, Lcom/kubi/home/v2/biz/kuming/KuMiningWidgetVM$dispatchIntent$1;->L$2:Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    move-result-object p1

    .line 94
    .line 95
    iput-object p1, v0, Lcom/kubi/home/v2/biz/kuming/KuMiningWidgetVM$dispatchIntent$1;->L$3:Ljava/lang/Object;

    .line 96
    const/4 p1, 0x0

    .line 97
    .line 98
    iput p1, v0, Lcom/kubi/home/v2/biz/kuming/KuMiningWidgetVM$dispatchIntent$1;->I$0:I

    .line 99
    .line 100
    iput p1, v0, Lcom/kubi/home/v2/biz/kuming/KuMiningWidgetVM$dispatchIntent$1;->I$1:I

    .line 101
    .line 102
    iput v3, v0, Lcom/kubi/home/v2/biz/kuming/KuMiningWidgetVM$dispatchIntent$1;->label:I

    .line 103
    .line 104
    .line 105
    invoke-direct {p0, v0}, Lcom/kubi/home/v2/biz/kuming/KuMiningWidgetVM;->r(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 106
    move-result-object p1

    .line 107
    .line 108
    if-ne p1, v1, :cond_3

    .line 109
    return-object v1

    .line 110
    .line 111
    :cond_3
    :goto_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 112
    return-object p1
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
.end method

.method public bridge synthetic getInitState()Lcom/kubi/mvi/state/f;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/home/v2/biz/kuming/KuMiningWidgetVM;->p()Lcom/kubi/home/v2/biz/kuming/KuMiningWidgetContract$UIState;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method

.method public p()Lcom/kubi/home/v2/biz/kuming/KuMiningWidgetContract$UIState;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/home/v2/biz/kuming/KuMiningWidgetContract$UIState;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/home/v2/biz/kuming/KuMiningWidgetContract$UIState;-><init>()V

    .line 6
    return-object v0
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
.end method

.method public final q()Lcom/kubi/home/api/HomeBizRepo;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/home/v2/biz/kuming/KuMiningWidgetVM;->X:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/home/api/HomeBizRepo;

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
.end method
