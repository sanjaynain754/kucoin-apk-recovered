.class public final Lcom/kubi/sdk/util/PreLoader;
.super Ljava/lang/Object;
.source "PreLoader.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/sdk/util/PreLoader$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0005\u0018\u0000 \u0016*\u0004\u0008\u0000\u0010\u00012\u00020\u0002:\u0001\u0016B\'\u0008\u0002\u0012\u001c\u0010\u0003\u001a\u0018\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000e\u0010\u0011\u001a\u00020\u0012H\u0086@\u00a2\u0006\u0002\u0010\u0013J\u000e\u0010\u0014\u001a\u00028\u0000H\u0086@\u00a2\u0006\u0002\u0010\u0013J\u0006\u0010\u0015\u001a\u00020\u0012R&\u0010\u0003\u001a\u0018\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0008R(\u0010\t\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000 \u000c*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000b0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/kubi/sdk/util/PreLoader;",
        "T",
        "",
        "loader",
        "Lkotlin/Function1;",
        "Lkotlin/coroutines/Continuation;",
        "<init>",
        "(Lkotlin/jvm/functions/Function1;)V",
        "Lkotlin/jvm/functions/Function1;",
        "comparableRef",
        "Ljava/util/concurrent/atomic/AtomicReference;",
        "Lkotlinx/coroutines/CompletableDeferred;",
        "kotlin.jvm.PlatformType",
        "loadState",
        "Ljava/util/concurrent/atomic/AtomicInteger;",
        "locker",
        "Lkotlinx/coroutines/sync/Mutex;",
        "preload",
        "",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "loadData",
        "reset",
        "Companion",
        "LBase_googleRelease"
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
        "SMAP\nPreLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreLoader.kt\ncom/kubi/sdk/util/PreLoader\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,78:1\n116#2,11:79\n*S KotlinDebug\n*F\n+ 1 PreLoader.kt\ncom/kubi/sdk/util/PreLoader\n*L\n37#1:79,11\n*E\n"
    }
.end annotation


# static fields
.field public static final e:Lcom/kubi/sdk/util/PreLoader$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lkotlin/coroutines/Continuation<",
            "-TT;>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lkotlinx/coroutines/w<",
            "TT;>;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Ljava/util/concurrent/atomic/AtomicInteger;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Lrg0/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/sdk/util/PreLoader$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/kubi/sdk/util/PreLoader$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/kubi/sdk/util/PreLoader;->e:Lcom/kubi/sdk/util/PreLoader$Companion;

    .line 9
    return-void
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

.method public constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/kubi/sdk/util/PreLoader;->a:Lkotlin/jvm/functions/Function1;

    .line 3
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {v0, v1, v0}, Lkotlinx/coroutines/y;->c(Lkotlinx/coroutines/x1;ILjava/lang/Object;)Lkotlinx/coroutines/w;

    move-result-object v2

    invoke-direct {p1, v2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/kubi/sdk/util/PreLoader;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 4
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v2, 0x0

    invoke-direct {p1, v2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object p1, p0, Lcom/kubi/sdk/util/PreLoader;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 5
    invoke-static {v2, v1, v0}, Lrg0/f;->b(ZILjava/lang/Object;)Lrg0/a;

    move-result-object p1

    iput-object p1, p0, Lcom/kubi/sdk/util/PreLoader;->d:Lrg0/a;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/kubi/sdk/util/PreLoader;-><init>(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final synthetic a(Lcom/kubi/sdk/util/PreLoader;)Ljava/util/concurrent/atomic/AtomicReference;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/sdk/util/PreLoader;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 3
    return-object p0
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

.method public static final synthetic b(Lcom/kubi/sdk/util/PreLoader;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/sdk/util/PreLoader;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 3
    return-object p0
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

.method public static final synthetic c(Lcom/kubi/sdk/util/PreLoader;)Lrg0/a;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/sdk/util/PreLoader;->d:Lrg0/a;

    .line 3
    return-object p0
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
    .locals 5
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    instance-of v0, p1, Lcom/kubi/sdk/util/PreLoader$loadData$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p1

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/sdk/util/PreLoader$loadData$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/sdk/util/PreLoader$loadData$1;->label:I

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
    iput v1, v0, Lcom/kubi/sdk/util/PreLoader$loadData$1;->label:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/kubi/sdk/util/PreLoader$loadData$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p1}, Lcom/kubi/sdk/util/PreLoader$loadData$1;-><init>(Lcom/kubi/sdk/util/PreLoader;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p1, v0, Lcom/kubi/sdk/util/PreLoader$loadData$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/kubi/sdk/util/PreLoader$loadData$1;->label:I

    .line 33
    const/4 v3, 0x2

    .line 34
    const/4 v4, 0x1

    .line 35
    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    if-eq v2, v4, :cond_2

    .line 39
    .line 40
    if-ne v2, v3, :cond_1

    .line 41
    .line 42
    .line 43
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 44
    return-object p1

    .line 45
    .line 46
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    .line 51
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 52
    throw p1

    .line 53
    .line 54
    .line 55
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 56
    goto :goto_1

    .line 57
    .line 58
    .line 59
    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 60
    .line 61
    iget-object p1, p0, Lcom/kubi/sdk/util/PreLoader;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 65
    move-result p1

    .line 66
    .line 67
    if-nez p1, :cond_4

    .line 68
    .line 69
    iput v4, v0, Lcom/kubi/sdk/util/PreLoader$loadData$1;->label:I

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0, v0}, Lcom/kubi/sdk/util/PreLoader;->e(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 73
    move-result-object p1

    .line 74
    .line 75
    if-ne p1, v1, :cond_4

    .line 76
    goto :goto_2

    .line 77
    .line 78
    :cond_4
    :goto_1
    iget-object p1, p0, Lcom/kubi/sdk/util/PreLoader;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 82
    move-result-object p1

    .line 83
    .line 84
    check-cast p1, Lkotlinx/coroutines/w;

    .line 85
    .line 86
    iput v3, v0, Lcom/kubi/sdk/util/PreLoader$loadData$1;->label:I

    .line 87
    .line 88
    .line 89
    invoke-interface {p1, v0}, Lkotlinx/coroutines/r0;->h(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 90
    move-result-object p1

    .line 91
    .line 92
    if-ne p1, v1, :cond_5

    .line 93
    :goto_2
    return-object v1

    .line 94
    :cond_5
    return-object p1
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
.end method

.method public final e(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 10
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
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

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    instance-of v0, p1, Lcom/kubi/sdk/util/PreLoader$preload$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p1

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/sdk/util/PreLoader$preload$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/sdk/util/PreLoader$preload$1;->label:I

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
    iput v1, v0, Lcom/kubi/sdk/util/PreLoader$preload$1;->label:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/kubi/sdk/util/PreLoader$preload$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p1}, Lcom/kubi/sdk/util/PreLoader$preload$1;-><init>(Lcom/kubi/sdk/util/PreLoader;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p1, v0, Lcom/kubi/sdk/util/PreLoader$preload$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/kubi/sdk/util/PreLoader$preload$1;->label:I

    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v4, 0x1

    .line 35
    const/4 v5, 0x2

    .line 36
    const/4 v6, 0x0

    .line 37
    .line 38
    if-eqz v2, :cond_3

    .line 39
    .line 40
    if-eq v2, v4, :cond_2

    .line 41
    .line 42
    if-ne v2, v5, :cond_1

    .line 43
    .line 44
    iget-object v1, v0, Lcom/kubi/sdk/util/PreLoader$preload$1;->L$1:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v1, Lkotlinx/coroutines/w;

    .line 47
    .line 48
    iget-object v0, v0, Lcom/kubi/sdk/util/PreLoader$preload$1;->L$0:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v0, Lrg0/a;

    .line 51
    .line 52
    .line 53
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    .line 55
    goto/16 :goto_3

    .line 56
    :catchall_0
    move-exception p1

    .line 57
    .line 58
    goto/16 :goto_5

    .line 59
    .line 60
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 61
    .line 62
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 63
    .line 64
    .line 65
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 66
    throw p1

    .line 67
    .line 68
    :cond_2
    iget v2, v0, Lcom/kubi/sdk/util/PreLoader$preload$1;->I$0:I

    .line 69
    .line 70
    iget-object v7, v0, Lcom/kubi/sdk/util/PreLoader$preload$1;->L$0:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v7, Lrg0/a;

    .line 73
    .line 74
    .line 75
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 76
    move-object p1, v7

    .line 77
    goto :goto_1

    .line 78
    .line 79
    .line 80
    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 81
    .line 82
    iget-object p1, p0, Lcom/kubi/sdk/util/PreLoader;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 86
    move-result p1

    .line 87
    .line 88
    if-eqz p1, :cond_4

    .line 89
    .line 90
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 91
    return-object p1

    .line 92
    .line 93
    :cond_4
    iget-object p1, p0, Lcom/kubi/sdk/util/PreLoader;->d:Lrg0/a;

    .line 94
    .line 95
    iput-object p1, v0, Lcom/kubi/sdk/util/PreLoader$preload$1;->L$0:Ljava/lang/Object;

    .line 96
    .line 97
    iput v3, v0, Lcom/kubi/sdk/util/PreLoader$preload$1;->I$0:I

    .line 98
    .line 99
    iput v4, v0, Lcom/kubi/sdk/util/PreLoader$preload$1;->label:I

    .line 100
    .line 101
    .line 102
    invoke-interface {p1, v6, v0}, Lrg0/a;->d(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 103
    move-result-object v2

    .line 104
    .line 105
    if-ne v2, v1, :cond_5

    .line 106
    goto :goto_2

    .line 107
    :cond_5
    move v2, v3

    .line 108
    .line 109
    :goto_1
    :try_start_1
    iget-object v7, p0, Lcom/kubi/sdk/util/PreLoader;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v7}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 113
    move-result-object v7

    .line 114
    .line 115
    check-cast v7, Lkotlinx/coroutines/w;

    .line 116
    .line 117
    iget-object v8, p0, Lcom/kubi/sdk/util/PreLoader;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v8}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 121
    move-result v8

    .line 122
    .line 123
    if-eqz v8, :cond_6

    .line 124
    .line 125
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 126
    .line 127
    .line 128
    invoke-interface {p1, v6}, Lrg0/a;->e(Ljava/lang/Object;)V

    .line 129
    return-object v0

    .line 130
    :catchall_1
    move-exception v0

    .line 131
    goto :goto_7

    .line 132
    .line 133
    :cond_6
    :try_start_2
    iget-object v8, p0, Lcom/kubi/sdk/util/PreLoader;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v8, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 137
    .line 138
    :try_start_3
    iget-object v4, p0, Lcom/kubi/sdk/util/PreLoader;->a:Lkotlin/jvm/functions/Function1;

    .line 139
    .line 140
    iput-object p1, v0, Lcom/kubi/sdk/util/PreLoader$preload$1;->L$0:Ljava/lang/Object;

    .line 141
    .line 142
    iput-object v7, v0, Lcom/kubi/sdk/util/PreLoader$preload$1;->L$1:Ljava/lang/Object;

    .line 143
    .line 144
    iput v2, v0, Lcom/kubi/sdk/util/PreLoader$preload$1;->I$0:I

    .line 145
    .line 146
    iput v3, v0, Lcom/kubi/sdk/util/PreLoader$preload$1;->I$1:I

    .line 147
    .line 148
    iput v5, v0, Lcom/kubi/sdk/util/PreLoader$preload$1;->label:I

    .line 149
    .line 150
    .line 151
    invoke-interface {v4, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 153
    .line 154
    if-ne v0, v1, :cond_7

    .line 155
    :goto_2
    return-object v1

    .line 156
    :cond_7
    move-object v1, v0

    .line 157
    move-object v0, p1

    .line 158
    move-object p1, v1

    .line 159
    move-object v1, v7

    .line 160
    .line 161
    .line 162
    :goto_3
    :try_start_4
    invoke-interface {v1, p1}, Lkotlinx/coroutines/w;->n(Ljava/lang/Object;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 163
    .line 164
    :try_start_5
    iget-object p1, p0, Lcom/kubi/sdk/util/PreLoader;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 165
    .line 166
    .line 167
    :goto_4
    invoke-virtual {p1, v5}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 168
    goto :goto_6

    .line 169
    :catchall_2
    move-exception p1

    .line 170
    move-object v9, v0

    .line 171
    move-object v0, p1

    .line 172
    move-object p1, v9

    .line 173
    goto :goto_7

    .line 174
    :catchall_3
    move-exception v0

    .line 175
    move-object v1, v0

    .line 176
    move-object v0, p1

    .line 177
    move-object p1, v1

    .line 178
    move-object v1, v7

    .line 179
    .line 180
    .line 181
    :goto_5
    :try_start_6
    invoke-interface {v1, p1}, Lkotlinx/coroutines/w;->m(Ljava/lang/Throwable;)Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 182
    .line 183
    :try_start_7
    iget-object p1, p0, Lcom/kubi/sdk/util/PreLoader;->c:Ljava/util/concurrent/atomic/AtomicInteger;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 184
    goto :goto_4

    .line 185
    .line 186
    .line 187
    :goto_6
    invoke-interface {v0, v6}, Lrg0/a;->e(Ljava/lang/Object;)V

    .line 188
    .line 189
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 190
    return-object p1

    .line 191
    :catchall_4
    move-exception p1

    .line 192
    .line 193
    :try_start_8
    iget-object v1, p0, Lcom/kubi/sdk/util/PreLoader;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v1, v5}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 197
    throw p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 198
    .line 199
    .line 200
    :goto_7
    invoke-interface {p1, v6}, Lrg0/a;->e(Ljava/lang/Object;)V

    .line 201
    throw v0
    .line 202
    .line 203
    .line 204
    .line 205
.end method

.method public final f()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/sdk/util/PreLoader;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    return-void

    .line 10
    .line 11
    :cond_0
    new-instance v0, Lcom/kubi/sdk/util/PreLoader$reset$1;

    .line 12
    const/4 v1, 0x0

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, p0, v1}, Lcom/kubi/sdk/util/PreLoader$reset$1;-><init>(Lcom/kubi/sdk/util/PreLoader;Lkotlin/coroutines/Continuation;)V

    .line 16
    const/4 v2, 0x1

    .line 17
    .line 18
    .line 19
    invoke-static {v1, v0, v2, v1}, Lkotlinx/coroutines/h;->f(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;

    .line 20
    return-void
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
