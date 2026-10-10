.class public final Lcom/kubi/network/socket/core/NetworkCall$AsyncCall;
.super Ljava/lang/Object;
.source "NetworkCall.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/network/socket/core/NetworkCall;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "AsyncCall"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0008\u0005*\u0001\n\u0008\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\tR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000c\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/kubi/network/socket/core/NetworkCall$AsyncCall;",
        "",
        "Lfr/c;",
        "callback",
        "<init>",
        "(Lcom/kubi/network/socket/core/NetworkCall;Lfr/c;)V",
        "",
        "a",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Lfr/c;",
        "com/kubi/network/socket/core/NetworkCall$AsyncCall$a",
        "b",
        "Lcom/kubi/network/socket/core/NetworkCall$AsyncCall$a;",
        "timeout",
        "network-core-socket_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Lfr/c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lcom/kubi/network/socket/core/NetworkCall$AsyncCall$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final synthetic c:Lcom/kubi/network/socket/core/NetworkCall;


# direct methods
.method public constructor <init>(Lcom/kubi/network/socket/core/NetworkCall;Lfr/c;)V
    .locals 2
    .param p1    # Lcom/kubi/network/socket/core/NetworkCall;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfr/c;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "callback"

    .line 3
    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/kubi/network/socket/core/NetworkCall$AsyncCall;->c:Lcom/kubi/network/socket/core/NetworkCall;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    iput-object p2, p0, Lcom/kubi/network/socket/core/NetworkCall$AsyncCall;->a:Lfr/c;

    .line 13
    .line 14
    new-instance p2, Lcom/kubi/network/socket/core/NetworkCall$AsyncCall$a;

    .line 15
    .line 16
    .line 17
    invoke-direct {p2, p1}, Lcom/kubi/network/socket/core/NetworkCall$AsyncCall$a;-><init>(Lcom/kubi/network/socket/core/NetworkCall;)V

    .line 18
    .line 19
    .line 20
    invoke-static {p1}, Lcom/kubi/network/socket/core/NetworkCall;->c(Lcom/kubi/network/socket/core/NetworkCall;)Lcom/kubi/network/socket/WebSocketClient$a;

    .line 21
    move-result-object p1

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Lcom/kubi/network/socket/WebSocketClient$a;->d()J

    .line 25
    move-result-wide v0

    .line 26
    .line 27
    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2, v0, v1, p1}, Lokio/Timeout;->timeout(JLjava/util/concurrent/TimeUnit;)Lokio/Timeout;

    .line 31
    .line 32
    iput-object p2, p0, Lcom/kubi/network/socket/core/NetworkCall$AsyncCall;->b:Lcom/kubi/network/socket/core/NetworkCall$AsyncCall$a;

    .line 33
    return-void
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


# virtual methods
.method public final a(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
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
    instance-of v0, p1, Lcom/kubi/network/socket/core/NetworkCall$AsyncCall$executeOnSingleThread$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p1

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/network/socket/core/NetworkCall$AsyncCall$executeOnSingleThread$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/network/socket/core/NetworkCall$AsyncCall$executeOnSingleThread$1;->label:I

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
    iput v1, v0, Lcom/kubi/network/socket/core/NetworkCall$AsyncCall$executeOnSingleThread$1;->label:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/kubi/network/socket/core/NetworkCall$AsyncCall$executeOnSingleThread$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p1}, Lcom/kubi/network/socket/core/NetworkCall$AsyncCall$executeOnSingleThread$1;-><init>(Lcom/kubi/network/socket/core/NetworkCall$AsyncCall;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p1, v0, Lcom/kubi/network/socket/core/NetworkCall$AsyncCall$executeOnSingleThread$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/kubi/network/socket/core/NetworkCall$AsyncCall$executeOnSingleThread$1;->label:I

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
    iget-object v0, v0, Lcom/kubi/network/socket/core/NetworkCall$AsyncCall$executeOnSingleThread$1;->L$0:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v0, Lcom/kubi/network/socket/core/NetworkCall$AsyncCall;

    .line 42
    .line 43
    .line 44
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    goto :goto_1

    .line 46
    :catchall_0
    move-exception p1

    .line 47
    goto :goto_2

    .line 48
    .line 49
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 50
    .line 51
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    .line 54
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 55
    throw p1

    .line 56
    .line 57
    .line 58
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 59
    .line 60
    :try_start_1
    iget-object p1, p0, Lcom/kubi/network/socket/core/NetworkCall$AsyncCall;->b:Lcom/kubi/network/socket/core/NetworkCall$AsyncCall$a;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1}, Lokio/AsyncTimeout;->enter()V

    .line 64
    .line 65
    iget-object p1, p0, Lcom/kubi/network/socket/core/NetworkCall$AsyncCall;->c:Lcom/kubi/network/socket/core/NetworkCall;

    .line 66
    .line 67
    iput-object p0, v0, Lcom/kubi/network/socket/core/NetworkCall$AsyncCall$executeOnSingleThread$1;->L$0:Ljava/lang/Object;

    .line 68
    .line 69
    iput v3, v0, Lcom/kubi/network/socket/core/NetworkCall$AsyncCall$executeOnSingleThread$1;->label:I

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, v0}, Lcom/kubi/network/socket/core/NetworkCall;->g(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 73
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 74
    .line 75
    if-ne p1, v1, :cond_3

    .line 76
    return-object v1

    .line 77
    :cond_3
    move-object v0, p0

    .line 78
    .line 79
    :goto_1
    :try_start_2
    check-cast p1, Lcom/kubi/network/api/model/NetworkResponse;

    .line 80
    .line 81
    iget-object v1, v0, Lcom/kubi/network/socket/core/NetworkCall$AsyncCall;->c:Lcom/kubi/network/socket/core/NetworkCall;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1}, Lcom/kubi/network/socket/core/NetworkCall;->isCancelled()Z

    .line 85
    move-result v1

    .line 86
    .line 87
    if-nez v1, :cond_4

    .line 88
    .line 89
    iget-object v1, v0, Lcom/kubi/network/socket/core/NetworkCall$AsyncCall;->b:Lcom/kubi/network/socket/core/NetworkCall$AsyncCall$a;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1}, Lokio/AsyncTimeout;->exit()Z

    .line 93
    .line 94
    iget-object v1, v0, Lcom/kubi/network/socket/core/NetworkCall$AsyncCall;->a:Lfr/c;

    .line 95
    .line 96
    .line 97
    invoke-interface {v1, p1}, Lfr/c;->a(Lcom/kubi/network/api/model/NetworkResponse;)V

    .line 98
    .line 99
    iget-object p1, v0, Lcom/kubi/network/socket/core/NetworkCall$AsyncCall;->c:Lcom/kubi/network/socket/core/NetworkCall;

    .line 100
    const/4 v1, 0x0

    .line 101
    .line 102
    .line 103
    invoke-static {p1, v1, v3, v1}, Lcom/kubi/network/socket/core/NetworkCall;->e(Lcom/kubi/network/socket/core/NetworkCall;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 104
    goto :goto_4

    .line 105
    .line 106
    :cond_4
    new-instance p1, Lcom/kubi/network/socket/exception/RequestCancelException;

    .line 107
    .line 108
    .line 109
    invoke-direct {p1}, Lcom/kubi/network/socket/exception/RequestCancelException;-><init>()V

    .line 110
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 111
    :catchall_1
    move-exception p1

    .line 112
    move-object v0, p0

    .line 113
    .line 114
    :goto_2
    iget-object v1, v0, Lcom/kubi/network/socket/core/NetworkCall$AsyncCall;->b:Lcom/kubi/network/socket/core/NetworkCall$AsyncCall$a;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v1}, Lokio/AsyncTimeout;->exit()Z

    .line 118
    move-result v1

    .line 119
    .line 120
    if-nez v1, :cond_5

    .line 121
    goto :goto_3

    .line 122
    .line 123
    :cond_5
    new-instance v1, Lcom/kubi/network/socket/exception/RequestTimeoutException;

    .line 124
    .line 125
    .line 126
    invoke-direct {v1, p1}, Lcom/kubi/network/socket/exception/RequestTimeoutException;-><init>(Ljava/lang/Throwable;)V

    .line 127
    move-object p1, v1

    .line 128
    .line 129
    :goto_3
    iget-object v1, v0, Lcom/kubi/network/socket/core/NetworkCall$AsyncCall;->a:Lfr/c;

    .line 130
    .line 131
    .line 132
    invoke-interface {v1, p1}, Lfr/c;->onFailure(Ljava/lang/Throwable;)V

    .line 133
    .line 134
    iget-object v0, v0, Lcom/kubi/network/socket/core/NetworkCall$AsyncCall;->c:Lcom/kubi/network/socket/core/NetworkCall;

    .line 135
    .line 136
    .line 137
    invoke-static {v0, p1}, Lcom/kubi/network/socket/core/NetworkCall;->b(Lcom/kubi/network/socket/core/NetworkCall;Ljava/lang/Throwable;)V

    .line 138
    .line 139
    :goto_4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 140
    return-object p1
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
