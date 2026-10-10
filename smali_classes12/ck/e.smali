.class public final Lck/e;
.super Ljava/lang/Object;
.source "HttpDnsServiceImpl.kt"

# interfaces
.implements Lck/f;
.implements Lfk/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0016J!\u0010\u001b\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u001fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010 R\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010$R\u0014\u0010\u000c\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008%\u0010&R\u0014\u0010(\u001a\u00020\u000f8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008*\u0010+\u00a8\u0006-"
    }
    d2 = {
        "Lck/e;",
        "Lck/f;",
        "Lfk/a;",
        "Lcom/kubi/httpdns/HttpDnsConfig;",
        "config",
        "Lcom/kubi/httpdns/cache/a;",
        "cacheService",
        "Lgk/a;",
        "probeService",
        "Lek/d;",
        "interpretService",
        "Lfk/b;",
        "networkService",
        "<init>",
        "(Lcom/kubi/httpdns/HttpDnsConfig;Lcom/kubi/httpdns/cache/a;Lgk/a;Lek/d;Lfk/b;)V",
        "",
        "host",
        "Lck/a;",
        "a",
        "(Ljava/lang/String;)Lck/a;",
        "",
        "b",
        "()V",
        "k",
        "f",
        "",
        "interpret",
        "h",
        "(Ljava/lang/String;Z)Lck/a;",
        "i",
        "(Ljava/lang/String;)V",
        "Lcom/kubi/httpdns/HttpDnsConfig;",
        "Lcom/kubi/httpdns/cache/a;",
        "c",
        "Lgk/a;",
        "d",
        "Lek/d;",
        "e",
        "Lfk/b;",
        "Ljava/lang/String;",
        "TAG",
        "Lik/d;",
        "g",
        "Lik/d;",
        "handleRecorder",
        "httpdns_release"
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
        "SMAP\nHttpDnsServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpDnsServiceImpl.kt\ncom/kubi/httpdns/core/HttpDnsServiceImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 DnsIssueException.kt\ncom/kubi/httpdns/exception/DnsIssueExceptionKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,210:1\n1855#2,2:211\n1855#2,2:213\n1549#2:229\n1620#2,3:230\n1549#2:235\n1620#2,3:236\n1549#2:240\n1620#2,3:241\n36#3,14:215\n36#3,14:244\n36#3,14:258\n36#3,14:272\n36#3,14:286\n37#4,2:233\n1#5:239\n*S KotlinDebug\n*F\n+ 1 HttpDnsServiceImpl.kt\ncom/kubi/httpdns/core/HttpDnsServiceImpl\n*L\n55#1:211,2\n62#1:213,2\n160#1:229\n160#1:230,3\n168#1:235\n168#1:236,3\n175#1:240\n175#1:241,3\n64#1:215,14\n183#1:244,14\n187#1:258,14\n191#1:272,14\n195#1:286,14\n160#1:233,2\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Lcom/kubi/httpdns/HttpDnsConfig;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lcom/kubi/httpdns/cache/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lgk/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Lek/d;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final e:Lfk/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final f:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final g:Lik/d;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/kubi/httpdns/HttpDnsConfig;Lcom/kubi/httpdns/cache/a;Lgk/a;Lek/d;Lfk/b;)V
    .locals 1
    .param p1    # Lcom/kubi/httpdns/HttpDnsConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/httpdns/cache/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lgk/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lek/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lfk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cacheService"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "probeService"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "interpretService"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "networkService"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lck/e;->a:Lcom/kubi/httpdns/HttpDnsConfig;

    .line 3
    iput-object p2, p0, Lck/e;->b:Lcom/kubi/httpdns/cache/a;

    .line 4
    iput-object p3, p0, Lck/e;->c:Lgk/a;

    .line 5
    iput-object p4, p0, Lck/e;->d:Lek/d;

    .line 6
    iput-object p5, p0, Lck/e;->e:Lfk/b;

    .line 7
    const-string p1, "HttpDnsServiceImpl"

    iput-object p1, p0, Lck/e;->f:Ljava/lang/String;

    .line 8
    new-instance p1, Lik/d;

    invoke-direct {p1}, Lik/d;-><init>()V

    iput-object p1, p0, Lck/e;->g:Lik/d;

    .line 9
    invoke-virtual {p0}, Lck/e;->k()V

    .line 10
    invoke-interface {p5, p0}, Lfk/b;->a(Lfk/a;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/kubi/httpdns/HttpDnsConfig;Lcom/kubi/httpdns/cache/a;Lgk/a;Lek/d;Lfk/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_0

    .line 11
    new-instance p2, Lcom/kubi/httpdns/cache/CacheServiceImpl;

    invoke-direct {p2, p1}, Lcom/kubi/httpdns/cache/CacheServiceImpl;-><init>(Lcom/kubi/httpdns/HttpDnsConfig;)V

    :cond_0
    move-object v2, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_1

    .line 12
    new-instance p3, Lgk/c;

    invoke-direct {p3, p1}, Lgk/c;-><init>(Lcom/kubi/httpdns/HttpDnsConfig;)V

    :cond_1
    move-object v3, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_2

    .line 13
    new-instance p4, Lek/g;

    const/4 p2, 0x0

    const/4 p3, 0x2

    invoke-direct {p4, p1, p2, p3, p2}, Lek/g;-><init>(Lcom/kubi/httpdns/HttpDnsConfig;Lek/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_2
    move-object v4, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_3

    .line 14
    new-instance p5, Lcom/kubi/httpdns/network/NetworkServiceImpl;

    invoke-direct {p5, p1}, Lcom/kubi/httpdns/network/NetworkServiceImpl;-><init>(Lcom/kubi/httpdns/HttpDnsConfig;)V

    :cond_3
    move-object v0, p0

    move-object v1, p1

    move-object v5, p5

    .line 15
    invoke-direct/range {v0 .. v5}, Lck/e;-><init>(Lcom/kubi/httpdns/HttpDnsConfig;Lcom/kubi/httpdns/cache/a;Lgk/a;Lek/d;Lfk/b;)V

    return-void
.end method

.method public static synthetic c(Lck/e;Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lck/e;->j(Lck/e;Ljava/lang/String;)V

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
.end method

.method public static synthetic d(Lck/e;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lck/e;->g(Lck/e;)V

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
.end method

.method public static synthetic e(Lck/e;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lck/e;->l(Lck/e;)V

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
.end method

.method public static final g(Lck/e;)V
    .locals 3

    .line 1
    .line 2
    const-string v0, "this$0"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 8
    .line 9
    iget-object v0, p0, Lck/e;->b:Lcom/kubi/httpdns/cache/a;

    .line 10
    .line 11
    .line 12
    invoke-interface {v0}, Lcom/kubi/httpdns/cache/a;->a()Ljava/util/List;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    .line 16
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    .line 20
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    move-result v1

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    move-result-object v1

    .line 28
    .line 29
    check-cast v1, Lck/a;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Lck/a;->c()Ljava/lang/String;

    .line 33
    move-result-object v1

    .line 34
    const/4 v2, 0x1

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v1, v2}, Lck/e;->h(Ljava/lang/String;Z)Lck/a;

    .line 38
    goto :goto_0

    .line 39
    .line 40
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 41
    .line 42
    .line 43
    invoke-static {p0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    goto :goto_1

    .line 46
    :catchall_0
    move-exception p0

    .line 47
    .line 48
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 49
    .line 50
    .line 51
    invoke-static {p0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 52
    move-result-object p0

    .line 53
    .line 54
    .line 55
    invoke-static {p0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    move-result-object p0

    .line 57
    .line 58
    .line 59
    :goto_1
    invoke-static {p0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 60
    move-result-object p0

    .line 61
    .line 62
    if-eqz p0, :cond_5

    .line 63
    .line 64
    sget-object v0, Lik/b;->a:Lik/b;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Lik/b;->b()Ljava/lang/String;

    .line 68
    move-result-object v0

    .line 69
    .line 70
    instance-of v1, p0, Ljava/net/SocketException;

    .line 71
    .line 72
    if-eqz v1, :cond_1

    .line 73
    goto :goto_2

    .line 74
    .line 75
    :cond_1
    instance-of v1, p0, Lcom/kubi/httpdns/interpret/NoServerException;

    .line 76
    .line 77
    if-eqz v1, :cond_2

    .line 78
    goto :goto_2

    .line 79
    .line 80
    :cond_2
    instance-of v1, p0, Ljava/net/SocketTimeoutException;

    .line 81
    .line 82
    if-eqz v1, :cond_3

    .line 83
    goto :goto_2

    .line 84
    .line 85
    :cond_3
    instance-of v1, p0, Landroid/system/ErrnoException;

    .line 86
    .line 87
    if-eqz v1, :cond_4

    .line 88
    .line 89
    .line 90
    :goto_2
    invoke-static {v0, p0}, Lro/b;->g(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 91
    goto :goto_3

    .line 92
    .line 93
    .line 94
    :cond_4
    invoke-static {p0, v0}, Ldk/a;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 95
    :cond_5
    :goto_3
    return-void
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

.method public static final j(Lck/e;Ljava/lang/String;)V
    .locals 19

    .line 1
    .line 2
    move-object/from16 v1, p0

    .line 3
    .line 4
    move-object/from16 v3, p1

    .line 5
    .line 6
    const-string v0, "this$0"

    .line 7
    .line 8
    .line 9
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    const-string v0, "$host"

    .line 12
    .line 13
    .line 14
    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-static {}, Lcom/blankj/utilcode/util/NetworkUtils;->k()Z

    .line 18
    move-result v0

    .line 19
    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    goto/16 :goto_c

    .line 23
    .line 24
    :cond_0
    iget-object v0, v1, Lck/e;->g:Lik/d;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v3}, Lik/d;->a(Ljava/lang/String;)Z

    .line 28
    move-result v0

    .line 29
    .line 30
    if-eqz v0, :cond_e

    .line 31
    .line 32
    iget-object v0, v1, Lck/e;->a:Lcom/kubi/httpdns/HttpDnsConfig;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Lcom/kubi/httpdns/HttpDnsConfig;->getInterpretTrackFactory()Lcom/kubi/httpdns/track/IInterpretTrack$a;

    .line 36
    move-result-object v0

    .line 37
    .line 38
    .line 39
    invoke-interface {v0, v3}, Lcom/kubi/httpdns/track/IInterpretTrack$a;->a(Ljava/lang/String;)Lcom/kubi/httpdns/track/IInterpretTrack;

    .line 40
    move-result-object v9

    .line 41
    .line 42
    .line 43
    invoke-interface {v9}, Lcom/kubi/httpdns/track/IInterpretTrack;->b()V

    .line 44
    .line 45
    .line 46
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 47
    move-result-wide v7

    .line 48
    .line 49
    new-instance v0, Lek/e;

    .line 50
    .line 51
    .line 52
    invoke-direct {v0, v3}, Lek/e;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    const-string v2, "IInterpretTrack"

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v2, v9}, Lek/e;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    invoke-interface {v9}, Lcom/kubi/httpdns/track/IInterpretTrack;->g()V

    .line 61
    .line 62
    iget-object v2, v1, Lck/e;->d:Lek/d;

    .line 63
    .line 64
    .line 65
    invoke-interface {v2, v0}, Lek/d;->a(Lek/e;)Lek/f;

    .line 66
    move-result-object v10

    .line 67
    .line 68
    .line 69
    invoke-interface {v9, v10}, Lcom/kubi/httpdns/track/IInterpretTrack;->k(Lek/f;)V

    .line 70
    .line 71
    .line 72
    invoke-interface {v9}, Lcom/kubi/httpdns/track/IInterpretTrack;->l()V

    .line 73
    .line 74
    iget-object v2, v1, Lck/e;->c:Lgk/a;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v10}, Lek/f;->a()Ljava/util/List;

    .line 78
    move-result-object v4

    .line 79
    .line 80
    new-instance v5, Ljava/util/ArrayList;

    .line 81
    .line 82
    const/16 v11, 0xa

    .line 83
    .line 84
    .line 85
    invoke-static {v4, v11}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 86
    move-result v6

    .line 87
    .line 88
    .line 89
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 90
    .line 91
    .line 92
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 93
    move-result-object v4

    .line 94
    .line 95
    .line 96
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 97
    move-result v6

    .line 98
    .line 99
    if-eqz v6, :cond_1

    .line 100
    .line 101
    .line 102
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 103
    move-result-object v6

    .line 104
    .line 105
    check-cast v6, Lcom/kubi/httpdns/interpret/IpInfo;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v6}, Lcom/kubi/httpdns/interpret/IpInfo;->getIp()Ljava/lang/String;

    .line 109
    move-result-object v6

    .line 110
    .line 111
    .line 112
    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 113
    goto :goto_0

    .line 114
    :catchall_0
    move-exception v0

    .line 115
    .line 116
    goto/16 :goto_5

    .line 117
    :catch_0
    move-exception v0

    .line 118
    .line 119
    goto/16 :goto_9

    .line 120
    :catch_1
    move-exception v0

    .line 121
    .line 122
    goto/16 :goto_a

    .line 123
    :catch_2
    move-exception v0

    .line 124
    .line 125
    goto/16 :goto_b

    .line 126
    :cond_1
    const/4 v4, 0x0

    .line 127
    .line 128
    new-array v4, v4, [Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    invoke-interface {v5, v4}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 132
    move-result-object v4

    .line 133
    .line 134
    check-cast v4, [Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    invoke-interface {v2, v0, v4}, Lgk/a;->a(Lek/e;[Ljava/lang/String;)Lgk/b;

    .line 138
    move-result-object v0

    .line 139
    .line 140
    .line 141
    invoke-interface {v9, v0}, Lcom/kubi/httpdns/track/IInterpretTrack;->h(Lgk/b;)V

    .line 142
    .line 143
    .line 144
    invoke-interface {v9}, Lcom/kubi/httpdns/track/IInterpretTrack;->f()V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0}, Lgk/b;->a()[Ljava/lang/String;

    .line 148
    move-result-object v4

    .line 149
    .line 150
    .line 151
    invoke-virtual {v10}, Lek/f;->a()Ljava/util/List;

    .line 152
    move-result-object v2

    .line 153
    .line 154
    new-instance v5, Ljava/util/ArrayList;

    .line 155
    .line 156
    .line 157
    invoke-static {v2, v11}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 158
    move-result v6

    .line 159
    .line 160
    .line 161
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 162
    .line 163
    .line 164
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 165
    move-result-object v2

    .line 166
    .line 167
    .line 168
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 169
    move-result v6

    .line 170
    .line 171
    if-eqz v6, :cond_2

    .line 172
    .line 173
    .line 174
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 175
    move-result-object v6

    .line 176
    .line 177
    check-cast v6, Lcom/kubi/httpdns/interpret/IpInfo;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v6}, Lcom/kubi/httpdns/interpret/IpInfo;->getTtl()I

    .line 181
    move-result v6

    .line 182
    .line 183
    .line 184
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 185
    move-result-object v6

    .line 186
    .line 187
    .line 188
    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 189
    goto :goto_1

    .line 190
    .line 191
    .line 192
    :cond_2
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 193
    move-result-object v2

    .line 194
    .line 195
    .line 196
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 197
    move-result v5

    .line 198
    .line 199
    if-eqz v5, :cond_9

    .line 200
    .line 201
    .line 202
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 203
    move-result-object v5

    .line 204
    .line 205
    check-cast v5, Ljava/lang/Number;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 209
    move-result v5

    .line 210
    .line 211
    .line 212
    :cond_3
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 213
    move-result v6

    .line 214
    .line 215
    if-eqz v6, :cond_4

    .line 216
    .line 217
    .line 218
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 219
    move-result-object v6

    .line 220
    .line 221
    check-cast v6, Ljava/lang/Number;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 225
    move-result v6

    .line 226
    .line 227
    if-le v5, v6, :cond_3

    .line 228
    move v5, v6

    .line 229
    goto :goto_2

    .line 230
    :cond_4
    int-to-long v5, v5

    .line 231
    .line 232
    new-instance v2, Lcom/kubi/httpdns/cache/HostRecord;

    .line 233
    .line 234
    .line 235
    invoke-direct/range {v2 .. v8}, Lcom/kubi/httpdns/cache/HostRecord;-><init>(Ljava/lang/String;[Ljava/lang/String;JJ)V
    :try_end_0
    .catch Lcom/kubi/httpdns/exception/InterpretException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lcom/kubi/httpdns/exception/ProbeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/kubi/httpdns/exception/CacheException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 236
    move-object v12, v2

    .line 237
    .line 238
    :try_start_1
    iget-object v13, v1, Lck/e;->b:Lcom/kubi/httpdns/cache/a;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v0}, Lgk/b;->a()[Ljava/lang/String;

    .line 242
    move-result-object v4

    .line 243
    .line 244
    .line 245
    invoke-virtual {v10}, Lek/f;->a()Ljava/util/List;

    .line 246
    move-result-object v0

    .line 247
    .line 248
    new-instance v2, Ljava/util/ArrayList;

    .line 249
    .line 250
    .line 251
    invoke-static {v0, v11}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 252
    move-result v3

    .line 253
    .line 254
    .line 255
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 256
    .line 257
    .line 258
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 259
    move-result-object v0

    .line 260
    .line 261
    .line 262
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 263
    move-result v3

    .line 264
    .line 265
    if-eqz v3, :cond_5

    .line 266
    .line 267
    .line 268
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 269
    move-result-object v3

    .line 270
    .line 271
    check-cast v3, Lcom/kubi/httpdns/interpret/IpInfo;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v3}, Lcom/kubi/httpdns/interpret/IpInfo;->getTtl()I

    .line 275
    move-result v3

    .line 276
    .line 277
    .line 278
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 279
    move-result-object v3

    .line 280
    .line 281
    .line 282
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 283
    goto :goto_3

    .line 284
    :catchall_1
    move-exception v0

    .line 285
    .line 286
    move-object/from16 v3, p1

    .line 287
    goto :goto_5

    .line 288
    :catch_3
    move-exception v0

    .line 289
    .line 290
    move-object/from16 v3, p1

    .line 291
    .line 292
    goto/16 :goto_9

    .line 293
    :catch_4
    move-exception v0

    .line 294
    .line 295
    move-object/from16 v3, p1

    .line 296
    .line 297
    goto/16 :goto_a

    .line 298
    :catch_5
    move-exception v0

    .line 299
    .line 300
    move-object/from16 v3, p1

    .line 301
    .line 302
    goto/16 :goto_b

    .line 303
    .line 304
    .line 305
    :cond_5
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 306
    move-result-object v0

    .line 307
    .line 308
    .line 309
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 310
    move-result v2

    .line 311
    .line 312
    if-eqz v2, :cond_8

    .line 313
    .line 314
    .line 315
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 316
    move-result-object v2

    .line 317
    .line 318
    check-cast v2, Ljava/lang/Number;

    .line 319
    .line 320
    .line 321
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 322
    move-result v2

    .line 323
    .line 324
    .line 325
    :cond_6
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 326
    move-result v3

    .line 327
    .line 328
    if-eqz v3, :cond_7

    .line 329
    .line 330
    .line 331
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 332
    move-result-object v3

    .line 333
    .line 334
    check-cast v3, Ljava/lang/Number;

    .line 335
    .line 336
    .line 337
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 338
    move-result v3

    .line 339
    .line 340
    if-le v2, v3, :cond_6

    .line 341
    move v2, v3

    .line 342
    goto :goto_4

    .line 343
    :cond_7
    int-to-long v5, v2

    .line 344
    .line 345
    new-instance v14, Lcom/kubi/httpdns/cache/HostRecord;
    :try_end_1
    .catch Lcom/kubi/httpdns/exception/InterpretException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Lcom/kubi/httpdns/exception/ProbeException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Lcom/kubi/httpdns/exception/CacheException; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 346
    .line 347
    move-object/from16 v3, p1

    .line 348
    move-object v2, v14

    .line 349
    .line 350
    .line 351
    :try_start_2
    invoke-direct/range {v2 .. v8}, Lcom/kubi/httpdns/cache/HostRecord;-><init>(Ljava/lang/String;[Ljava/lang/String;JJ)V

    .line 352
    move-object v14, v2

    .line 353
    .line 354
    const/16 v17, 0x6

    .line 355
    .line 356
    const/16 v18, 0x0

    .line 357
    const/4 v15, 0x0

    .line 358
    .line 359
    const/16 v16, 0x0

    .line 360
    .line 361
    .line 362
    invoke-static/range {v13 .. v18}, Lcom/kubi/httpdns/cache/a$a;->a(Lcom/kubi/httpdns/cache/a;Lcom/kubi/httpdns/cache/HostRecord;IZILjava/lang/Object;)V

    .line 363
    .line 364
    .line 365
    invoke-interface {v9, v12}, Lcom/kubi/httpdns/track/IInterpretTrack;->s(Lcom/kubi/httpdns/cache/HostRecord;)V

    .line 366
    .line 367
    .line 368
    invoke-interface {v9, v12}, Lcom/kubi/httpdns/track/IInterpretTrack;->m(Lcom/kubi/httpdns/cache/HostRecord;)V
    :try_end_2
    .catch Lcom/kubi/httpdns/exception/InterpretException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Lcom/kubi/httpdns/exception/ProbeException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Lcom/kubi/httpdns/exception/CacheException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 369
    .line 370
    iget-object v0, v1, Lck/e;->g:Lik/d;

    .line 371
    .line 372
    .line 373
    invoke-virtual {v0, v3}, Lik/d;->b(Ljava/lang/String;)V

    .line 374
    return-void

    .line 375
    .line 376
    :cond_8
    move-object/from16 v3, p1

    .line 377
    .line 378
    :try_start_3
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 379
    .line 380
    .line 381
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 382
    throw v0

    .line 383
    .line 384
    :cond_9
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 385
    .line 386
    .line 387
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 388
    throw v0
    :try_end_3
    .catch Lcom/kubi/httpdns/exception/InterpretException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Lcom/kubi/httpdns/exception/ProbeException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Lcom/kubi/httpdns/exception/CacheException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 389
    .line 390
    :goto_5
    :try_start_4
    sget-object v2, Lik/b;->a:Lik/b;

    .line 391
    .line 392
    .line 393
    invoke-virtual {v2}, Lik/b;->b()Ljava/lang/String;

    .line 394
    move-result-object v2

    .line 395
    .line 396
    instance-of v4, v0, Ljava/net/SocketException;

    .line 397
    .line 398
    if-eqz v4, :cond_a

    .line 399
    goto :goto_6

    .line 400
    .line 401
    :cond_a
    instance-of v4, v0, Lcom/kubi/httpdns/interpret/NoServerException;

    .line 402
    .line 403
    if-eqz v4, :cond_b

    .line 404
    goto :goto_6

    .line 405
    .line 406
    :cond_b
    instance-of v4, v0, Ljava/net/SocketTimeoutException;

    .line 407
    .line 408
    if-eqz v4, :cond_c

    .line 409
    goto :goto_6

    .line 410
    .line 411
    :cond_c
    instance-of v4, v0, Landroid/system/ErrnoException;

    .line 412
    .line 413
    if-eqz v4, :cond_d

    .line 414
    .line 415
    .line 416
    :goto_6
    invoke-static {v2, v0}, Lro/b;->g(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 417
    goto :goto_7

    .line 418
    :catchall_2
    move-exception v0

    .line 419
    goto :goto_d

    .line 420
    .line 421
    .line 422
    :cond_d
    invoke-static {v0, v2}, Ldk/a;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 423
    .line 424
    :goto_7
    new-instance v2, Lcom/kubi/httpdns/exception/UnknownException;

    .line 425
    .line 426
    .line 427
    invoke-direct {v2, v0}, Lcom/kubi/httpdns/exception/UnknownException;-><init>(Ljava/lang/Throwable;)V

    .line 428
    .line 429
    .line 430
    invoke-interface {v9, v2}, Lcom/kubi/httpdns/track/IInterpretTrack;->a(Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 431
    .line 432
    :goto_8
    iget-object v0, v1, Lck/e;->g:Lik/d;

    .line 433
    .line 434
    .line 435
    invoke-virtual {v0, v3}, Lik/d;->b(Ljava/lang/String;)V

    .line 436
    goto :goto_c

    .line 437
    .line 438
    :goto_9
    :try_start_5
    sget-object v2, Lik/b;->a:Lik/b;

    .line 439
    .line 440
    .line 441
    invoke-virtual {v2}, Lik/b;->b()Ljava/lang/String;

    .line 442
    move-result-object v2

    .line 443
    .line 444
    .line 445
    invoke-static {v0, v2}, Ldk/a;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 446
    .line 447
    .line 448
    invoke-interface {v9, v0}, Lcom/kubi/httpdns/track/IInterpretTrack;->e(Ljava/lang/Throwable;)V

    .line 449
    .line 450
    .line 451
    invoke-interface {v9, v0}, Lcom/kubi/httpdns/track/IInterpretTrack;->a(Ljava/lang/Throwable;)V

    .line 452
    goto :goto_8

    .line 453
    .line 454
    :goto_a
    sget-object v2, Lik/b;->a:Lik/b;

    .line 455
    .line 456
    .line 457
    invoke-virtual {v2}, Lik/b;->b()Ljava/lang/String;

    .line 458
    move-result-object v2

    .line 459
    .line 460
    .line 461
    invoke-static {v0, v2}, Ldk/a;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 462
    .line 463
    .line 464
    invoke-interface {v9, v0}, Lcom/kubi/httpdns/track/IInterpretTrack;->n(Ljava/lang/Throwable;)V

    .line 465
    .line 466
    .line 467
    invoke-interface {v9, v0}, Lcom/kubi/httpdns/track/IInterpretTrack;->a(Ljava/lang/Throwable;)V

    .line 468
    goto :goto_8

    .line 469
    .line 470
    :goto_b
    sget-object v2, Lik/b;->a:Lik/b;

    .line 471
    .line 472
    .line 473
    invoke-virtual {v2}, Lik/b;->b()Ljava/lang/String;

    .line 474
    move-result-object v2

    .line 475
    .line 476
    .line 477
    invoke-static {v0, v2}, Ldk/a;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 478
    .line 479
    .line 480
    invoke-interface {v9, v0}, Lcom/kubi/httpdns/track/IInterpretTrack;->d(Ljava/lang/Throwable;)V

    .line 481
    .line 482
    .line 483
    invoke-interface {v9, v0}, Lcom/kubi/httpdns/track/IInterpretTrack;->a(Ljava/lang/Throwable;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 484
    goto :goto_8

    .line 485
    :goto_c
    return-void

    .line 486
    .line 487
    :goto_d
    iget-object v1, v1, Lck/e;->g:Lik/d;

    .line 488
    .line 489
    .line 490
    invoke-virtual {v1, v3}, Lik/d;->b(Ljava/lang/String;)V

    .line 491
    throw v0

    .line 492
    .line 493
    :cond_e
    new-instance v0, Ljava/lang/StringBuilder;

    .line 494
    .line 495
    .line 496
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 497
    .line 498
    const-string v1, "request host["

    .line 499
    .line 500
    .line 501
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 502
    .line 503
    .line 504
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 505
    .line 506
    const-string v1, "] running"

    .line 507
    .line 508
    .line 509
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 510
    .line 511
    .line 512
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 513
    move-result-object v0

    .line 514
    .line 515
    .line 516
    invoke-static {v0}, Lro/b;->i(Ljava/lang/String;)V

    .line 517
    return-void
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
.end method

.method public static final l(Lck/e;)V
    .locals 3

    .line 1
    .line 2
    const-string v0, "this$0"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lck/e;->a:Lcom/kubi/httpdns/HttpDnsConfig;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/kubi/httpdns/HttpDnsConfig;->getPreFetchHost()Ljava/util/List;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    .line 18
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    move-result v1

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    move-result-object v1

    .line 26
    .line 27
    check-cast v1, Ljava/lang/String;

    .line 28
    const/4 v2, 0x1

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v1, v2}, Lck/e;->h(Ljava/lang/String;Z)Lck/a;

    .line 32
    goto :goto_0

    .line 33
    :cond_0
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
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lck/a;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    const-string v0, "host"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    const/4 v0, 0x0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1, v0}, Lck/e;->h(Ljava/lang/String;Z)Lck/a;

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
    .line 44
    .line 45
.end method

.method public b()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lck/e;->f()V

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

.method public final f()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lo00/g;->c()Ljava/util/concurrent/Executor;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, Lck/d;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, p0}, Lck/d;-><init>(Lck/e;)V

    .line 10
    .line 11
    .line 12
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 13
    return-void
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

.method public final h(Ljava/lang/String;Z)Lck/a;
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lck/e;->a:Lcom/kubi/httpdns/HttpDnsConfig;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/httpdns/HttpDnsConfig;->getDnsEnable()Z

    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const-string p1, "service is disabled"

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, Lro/b;->i(Ljava/lang/String;)V

    .line 15
    return-object v1

    .line 16
    .line 17
    :cond_0
    sget-object v0, Lik/a;->a:Lik/a;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p1}, Lik/a;->c(Ljava/lang/String;)Z

    .line 21
    move-result v2

    .line 22
    .line 23
    if-nez v2, :cond_1

    .line 24
    .line 25
    new-instance p2, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    const-string p1, " is invalid. "

    .line 34
    .line 35
    .line 36
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    move-result-object p1

    .line 41
    .line 42
    .line 43
    invoke-static {p1}, Lro/b;->m(Ljava/lang/String;)V

    .line 44
    return-object v1

    .line 45
    .line 46
    .line 47
    :cond_1
    invoke-virtual {v0, p1}, Lik/a;->d(Ljava/lang/String;)Z

    .line 48
    move-result v0

    .line 49
    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    new-instance p2, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    const-string p1, " is ip. "

    .line 61
    .line 62
    .line 63
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    move-result-object p1

    .line 68
    .line 69
    .line 70
    invoke-static {p1}, Lro/b;->m(Ljava/lang/String;)V

    .line 71
    return-object v1

    .line 72
    .line 73
    :cond_2
    iget-object v0, p0, Lck/e;->a:Lcom/kubi/httpdns/HttpDnsConfig;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Lcom/kubi/httpdns/HttpDnsConfig;->getRequestTrackFactory()Lhk/b$a;

    .line 77
    move-result-object v0

    .line 78
    .line 79
    .line 80
    invoke-interface {v0, p1}, Lhk/b$a;->a(Ljava/lang/String;)Lhk/b;

    .line 81
    move-result-object v0

    .line 82
    .line 83
    .line 84
    invoke-interface {v0}, Lhk/b;->b()V

    .line 85
    .line 86
    :try_start_0
    iget-object v2, p0, Lck/e;->b:Lcom/kubi/httpdns/cache/a;

    .line 87
    .line 88
    .line 89
    invoke-interface {v2, p1}, Lcom/kubi/httpdns/cache/a;->query(Ljava/lang/String;)Lck/a;

    .line 90
    move-result-object v2

    .line 91
    .line 92
    if-nez p2, :cond_3

    .line 93
    .line 94
    if-eqz v2, :cond_3

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2}, Lck/a;->b()Z

    .line 98
    move-result p2

    .line 99
    .line 100
    if-nez p2, :cond_3

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2}, Lck/a;->e()Z

    .line 104
    move-result p2

    .line 105
    .line 106
    if-eqz p2, :cond_4

    .line 107
    goto :goto_0

    .line 108
    :catch_0
    move-exception p1

    .line 109
    goto :goto_2

    .line 110
    .line 111
    .line 112
    :cond_3
    :goto_0
    invoke-virtual {p0, p1}, Lck/e;->i(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 113
    .line 114
    :cond_4
    const-string p2, "request host["

    .line 115
    .line 116
    if-eqz v2, :cond_7

    .line 117
    .line 118
    :try_start_1
    iget-object v3, p0, Lck/e;->a:Lcom/kubi/httpdns/HttpDnsConfig;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v3}, Lcom/kubi/httpdns/HttpDnsConfig;->getAllowExpiredIp()Z

    .line 122
    move-result v3

    .line 123
    .line 124
    if-nez v3, :cond_6

    .line 125
    .line 126
    .line 127
    invoke-virtual {v2}, Lck/a;->e()Z

    .line 128
    move-result v3

    .line 129
    .line 130
    if-nez v3, :cond_5

    .line 131
    goto :goto_1

    .line 132
    .line 133
    :cond_5
    new-instance v2, Lcom/kubi/httpdns/exception/ExpiredResultException;

    .line 134
    .line 135
    new-instance v3, Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    const-string p1, "] expired return null"

    .line 147
    .line 148
    .line 149
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 153
    move-result-object p1

    .line 154
    .line 155
    .line 156
    invoke-direct {v2, p1}, Lcom/kubi/httpdns/exception/ExpiredResultException;-><init>(Ljava/lang/String;)V

    .line 157
    throw v2

    .line 158
    .line 159
    .line 160
    :cond_6
    :goto_1
    invoke-interface {v0, v2}, Lhk/b;->c(Lck/a;)V

    .line 161
    return-object v2

    .line 162
    .line 163
    :cond_7
    new-instance v2, Lcom/kubi/httpdns/exception/NoResultException;

    .line 164
    .line 165
    new-instance v3, Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    const-string p1, "] not found return null"

    .line 177
    .line 178
    .line 179
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 183
    move-result-object p1

    .line 184
    .line 185
    .line 186
    invoke-direct {v2, p1}, Lcom/kubi/httpdns/exception/NoResultException;-><init>(Ljava/lang/String;)V

    .line 187
    throw v2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 188
    .line 189
    .line 190
    :goto_2
    invoke-interface {v0, p1}, Lhk/b;->a(Ljava/lang/Throwable;)V

    .line 191
    return-object v1
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
.end method

.method public final i(Ljava/lang/String;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lo00/g;->d()Ljava/util/concurrent/Executor;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, Lck/c;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, p0, p1}, Lck/c;-><init>(Lck/e;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 13
    return-void
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

.method public final k()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lo00/g;->c()Ljava/util/concurrent/Executor;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, Lck/b;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, p0}, Lck/b;-><init>(Lck/e;)V

    .line 10
    .line 11
    .line 12
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 13
    return-void
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
