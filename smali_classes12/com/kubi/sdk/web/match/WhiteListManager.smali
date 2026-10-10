.class public final Lcom/kubi/sdk/web/match/WhiteListManager;
.super Ljava/lang/Object;
.source "WhiteListManager.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\u00020\u0004H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001b\u0010\n\u001a\u00020\u00042\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\r\u0010\u000c\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u000c\u0010\u0003J\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0015\u0010\u0010J\u001d\u0010\u0016\u001a\u00020\u00042\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u000bJ\u001d\u0010\u0018\u001a\u00020\u00042\u000c\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u000bR\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u001a\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/kubi/sdk/web/match/WhiteListManager;",
        "",
        "<init>",
        "()V",
        "",
        "d",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "",
        "",
        "newList",
        "g",
        "(Ljava/util/List;)V",
        "f",
        "url",
        "",
        "b",
        "(Ljava/lang/String;)Z",
        "Landroid/net/Uri;",
        "uri",
        "a",
        "(Landroid/net/Uri;)Z",
        "c",
        "h",
        "writeList",
        "e",
        "Lcom/kubi/sdk/web/match/WhiteListMatcher;",
        "Lcom/kubi/sdk/web/match/WhiteListMatcher;",
        "hostMatcher",
        "whitelistMatcher",
        "KWebView_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nWhiteListManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WhiteListManager.kt\ncom/kubi/sdk/web/match/WhiteListManager\n+ 2 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 3 WebCoreException.kt\ncom/kubi/sdk/web/core/WebCoreExceptionKt\n*L\n1#1,89:1\n181#2,5:90\n86#3,3:95\n86#3,3:98\n*S KotlinDebug\n*F\n+ 1 WhiteListManager.kt\ncom/kubi/sdk/web/match/WhiteListManager\n*L\n28#1:90,5\n31#1:95,3\n53#1:98,3\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Lcom/kubi/sdk/web/match/WhiteListManager;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Lcom/kubi/sdk/web/match/WhiteListMatcher;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final c:Lcom/kubi/sdk/web/match/WhiteListMatcher;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/sdk/web/match/WhiteListManager;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/sdk/web/match/WhiteListManager;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/kubi/sdk/web/match/WhiteListManager;->a:Lcom/kubi/sdk/web/match/WhiteListManager;

    .line 8
    .line 9
    new-instance v1, Lcom/kubi/sdk/web/match/WhiteListMatcher;

    .line 10
    const/4 v2, 0x1

    .line 11
    .line 12
    .line 13
    invoke-direct {v1, v2}, Lcom/kubi/sdk/web/match/WhiteListMatcher;-><init>(Z)V

    .line 14
    .line 15
    sput-object v1, Lcom/kubi/sdk/web/match/WhiteListManager;->b:Lcom/kubi/sdk/web/match/WhiteListMatcher;

    .line 16
    .line 17
    new-instance v1, Lcom/kubi/sdk/web/match/WhiteListMatcher;

    .line 18
    const/4 v3, 0x0

    .line 19
    const/4 v4, 0x0

    .line 20
    .line 21
    .line 22
    invoke-direct {v1, v3, v2, v4}, Lcom/kubi/sdk/web/match/WhiteListMatcher;-><init>(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 23
    .line 24
    sput-object v1, Lcom/kubi/sdk/web/match/WhiteListManager;->c:Lcom/kubi/sdk/web/match/WhiteListMatcher;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/kubi/sdk/web/match/WhiteListManager;->f()V

    .line 28
    return-void
    .line 29
    .line 30
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


# virtual methods
.method public final a(Landroid/net/Uri;)Z
    .locals 1
    .param p1    # Landroid/net/Uri;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "uri"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/kubi/sdk/web/match/WhiteListManager;->b:Lcom/kubi/sdk/web/match/WhiteListMatcher;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lcom/kubi/sdk/web/match/WhiteListMatcher;->f(Landroid/net/Uri;)Z

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
    .line 44
    .line 45
.end method

.method public final b(Ljava/lang/String;)Z
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "url"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/kubi/sdk/web/match/WhiteListManager;->b:Lcom/kubi/sdk/web/match/WhiteListMatcher;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lcom/kubi/sdk/web/match/WhiteListMatcher;->g(Ljava/lang/String;)Z

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
    .line 44
    .line 45
.end method

.method public final c(Ljava/lang/String;)Z
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "url"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/kubi/sdk/web/match/WhiteListManager;->c:Lcom/kubi/sdk/web/match/WhiteListMatcher;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lcom/kubi/sdk/web/match/WhiteListMatcher;->g(Ljava/lang/String;)Z

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
    .line 44
    .line 45
.end method

.method public final d(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 12
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
    instance-of v0, p1, Lcom/kubi/sdk/web/match/WhiteListManager$load$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p1

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/sdk/web/match/WhiteListManager$load$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/sdk/web/match/WhiteListManager$load$1;->label:I

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
    iput v1, v0, Lcom/kubi/sdk/web/match/WhiteListManager$load$1;->label:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/kubi/sdk/web/match/WhiteListManager$load$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p1}, Lcom/kubi/sdk/web/match/WhiteListManager$load$1;-><init>(Lcom/kubi/sdk/web/match/WhiteListManager;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p1, v0, Lcom/kubi/sdk/web/match/WhiteListManager$load$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/kubi/sdk/web/match/WhiteListManager$load$1;->label:I

    .line 33
    const/4 v3, 0x1

    .line 34
    const/4 v4, 0x0

    .line 35
    .line 36
    if-eqz v2, :cond_2

    .line 37
    .line 38
    if-ne v2, v3, :cond_1

    .line 39
    .line 40
    iget-object v0, v0, Lcom/kubi/sdk/web/match/WhiteListManager$load$1;->L$0:Ljava/lang/Object;

    .line 41
    move-object v1, v0

    .line 42
    .line 43
    check-cast v1, Lcom/kubi/sdk/web/match/WhiteListManager;

    .line 44
    .line 45
    .line 46
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    goto :goto_2

    .line 48
    :catch_0
    move-exception v0

    .line 49
    move-object p1, v0

    .line 50
    :goto_1
    move-object v6, p1

    .line 51
    goto :goto_3

    .line 52
    .line 53
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 54
    .line 55
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 56
    .line 57
    .line 58
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 59
    throw p1

    .line 60
    .line 61
    .line 62
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 63
    .line 64
    const-string p1, "whitelist"

    .line 65
    .line 66
    const-string v2, ""

    .line 67
    .line 68
    const-string v5, "web"

    .line 69
    .line 70
    .line 71
    invoke-static {v5, p1, v2}, Ly70/e;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 72
    move-result-object p1

    .line 73
    .line 74
    .line 75
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 76
    move-result v2

    .line 77
    .line 78
    if-lez v2, :cond_5

    .line 79
    .line 80
    :try_start_1
    sget-object v2, Lcom/kubi/utils/x;->a:Lcom/kubi/utils/x;

    .line 81
    .line 82
    new-instance v2, Lcom/kubi/sdk/web/match/WhiteListManager$load$$inlined$fromJsonOrNull$1;

    .line 83
    .line 84
    .line 85
    invoke-direct {v2, p1, v4}, Lcom/kubi/sdk/web/match/WhiteListManager$load$$inlined$fromJsonOrNull$1;-><init>(Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 86
    .line 87
    .line 88
    invoke-static {v2}, Lkotlinx/coroutines/flow/g;->K(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/e;

    .line 89
    move-result-object p1

    .line 90
    .line 91
    .line 92
    invoke-static {}, Lo00/a;->b()Lkotlinx/coroutines/j0;

    .line 93
    move-result-object v2

    .line 94
    .line 95
    .line 96
    invoke-static {p1, v2}, Lkotlinx/coroutines/flow/g;->N(Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/flow/e;

    .line 97
    move-result-object p1

    .line 98
    .line 99
    new-instance v2, Lcom/kubi/sdk/web/match/WhiteListManager$load$$inlined$fromJsonOrNull$2;

    .line 100
    .line 101
    .line 102
    invoke-direct {v2, v4}, Lcom/kubi/sdk/web/match/WhiteListManager$load$$inlined$fromJsonOrNull$2;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 103
    .line 104
    .line 105
    invoke-static {p1, v2}, Lkotlinx/coroutines/flow/g;->h(Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/e;

    .line 106
    move-result-object p1

    .line 107
    .line 108
    iput-object p0, v0, Lcom/kubi/sdk/web/match/WhiteListManager$load$1;->L$0:Ljava/lang/Object;

    .line 109
    .line 110
    iput v3, v0, Lcom/kubi/sdk/web/match/WhiteListManager$load$1;->label:I

    .line 111
    .line 112
    .line 113
    invoke-static {p1, v0}, Lkotlinx/coroutines/flow/g;->f0(Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 114
    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 115
    .line 116
    if-ne p1, v1, :cond_3

    .line 117
    return-object v1

    .line 118
    :cond_3
    move-object v1, p0

    .line 119
    .line 120
    :goto_2
    :try_start_2
    check-cast p1, Ljava/util/ArrayList;

    .line 121
    .line 122
    if-eqz p1, :cond_4

    .line 123
    .line 124
    .line 125
    invoke-virtual {v1, p1}, Lcom/kubi/sdk/web/match/WhiteListManager;->h(Ljava/util/List;)V

    .line 126
    goto :goto_4

    .line 127
    .line 128
    :cond_4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 129
    return-object p1

    .line 130
    :catch_1
    move-exception v0

    .line 131
    move-object p1, v0

    .line 132
    move-object v1, p0

    .line 133
    goto :goto_1

    .line 134
    .line 135
    :goto_3
    new-instance v5, Lcom/kubi/sdk/web/core/WebCoreException;

    .line 136
    const/4 v10, 0x4

    .line 137
    const/4 v11, 0x0

    .line 138
    .line 139
    const-string v7, "WhiteListManager"

    .line 140
    const/4 v8, 0x0

    .line 141
    .line 142
    const-string v9, "initWhiteList err"

    .line 143
    .line 144
    .line 145
    invoke-direct/range {v5 .. v11}, Lcom/kubi/sdk/web/core/WebCoreException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 146
    const/4 p1, 0x2

    .line 147
    .line 148
    .line 149
    invoke-static {v5, v4, p1, v4}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 150
    goto :goto_4

    .line 151
    :cond_5
    move-object v1, p0

    .line 152
    .line 153
    .line 154
    :goto_4
    invoke-virtual {v1}, Lcom/kubi/sdk/web/match/WhiteListManager;->f()V

    .line 155
    .line 156
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 157
    return-object p1
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

.method public final e(Ljava/util/List;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x2

    .line 3
    const/4 v2, 0x0

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-static {p1, v0, v1, v2}, Lcom/kubi/utils/x;->i(Ljava/lang/Object;ZILjava/lang/Object;)Ljava/lang/String;

    .line 7
    move-result-object p1

    .line 8
    .line 9
    const-string v0, "web"

    .line 10
    .line 11
    const-string v3, "whitelist"

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v3, p1}, Ly70/e;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ly70/e;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    return-void

    .line 16
    :catch_0
    move-exception v0

    .line 17
    move-object p1, v0

    .line 18
    move-object v4, p1

    .line 19
    .line 20
    new-instance v3, Lcom/kubi/sdk/web/core/WebCoreException;

    .line 21
    const/4 v8, 0x4

    .line 22
    const/4 v9, 0x0

    .line 23
    .line 24
    const-string v5, "WhiteListManager"

    .line 25
    const/4 v6, 0x0

    .line 26
    .line 27
    const-string v7, "save whitelist"

    .line 28
    .line 29
    .line 30
    invoke-direct/range {v3 .. v9}, Lcom/kubi/sdk/web/core/WebCoreException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 31
    .line 32
    .line 33
    invoke-static {v3, v2, v1, v2}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 34
    return-void
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

.method public final f()V
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/sdk/web/match/WhiteListManager;->b:Lcom/kubi/sdk/web/match/WhiteListMatcher;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/host/HostManager;->a:Lcom/kubi/host/HostManager;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/kubi/host/HostManager;->h()Ljava/util/List;

    .line 8
    move-result-object v2

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v2}, Lcom/kubi/sdk/web/match/WhiteListMatcher;->a(Ljava/lang/Iterable;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Lcom/kubi/host/HostManager;->s()Ljava/util/List;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lcom/kubi/sdk/web/match/WhiteListMatcher;->a(Ljava/lang/Iterable;)V

    .line 19
    return-void
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

.method public final g(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "newList"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lcom/kubi/sdk/web/match/WhiteListManager;->h(Ljava/util/List;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lcom/kubi/sdk/web/match/WhiteListManager;->e(Ljava/util/List;)V

    .line 12
    return-void
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

.method public final h(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/sdk/web/match/WhiteListManager;->c:Lcom/kubi/sdk/web/match/WhiteListMatcher;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/sdk/web/match/WhiteListMatcher;->d()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/kubi/sdk/web/match/WhiteListMatcher;->b(Ljava/lang/Iterable;)V

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
