.class public final Lbk/a;
.super Ljava/lang/Object;
.source "OkHttpDns.kt"

# interfaces
.implements Lokhttp3/Dns;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0001\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lbk/a;",
        "Lokhttp3/Dns;",
        "system",
        "Lcom/kubi/httpdns/track/ILookupTrack$a;",
        "factory",
        "<init>",
        "(Lokhttp3/Dns;Lcom/kubi/httpdns/track/ILookupTrack$a;)V",
        "",
        "hostname",
        "",
        "Ljava/net/InetAddress;",
        "lookup",
        "(Ljava/lang/String;)Ljava/util/List;",
        "a",
        "Lokhttp3/Dns;",
        "b",
        "Lcom/kubi/httpdns/track/ILookupTrack$a;",
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
        "SMAP\nOkHttpDns.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHttpDns.kt\ncom/kubi/httpdns/adapter/OkHttpDns\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 DnsIssueException.kt\ncom/kubi/httpdns/exception/DnsIssueExceptionKt\n*L\n1#1,64:1\n11335#2:65\n11670#2,3:66\n36#3,14:69\n*S KotlinDebug\n*F\n+ 1 OkHttpDns.kt\ncom/kubi/httpdns/adapter/OkHttpDns\n*L\n51#1:65\n51#1:66,3\n58#1:69,14\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Lokhttp3/Dns;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lcom/kubi/httpdns/track/ILookupTrack$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lokhttp3/Dns;Lcom/kubi/httpdns/track/ILookupTrack$a;)V
    .locals 1
    .param p1    # Lokhttp3/Dns;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/httpdns/track/ILookupTrack$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "system"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "factory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lbk/a;->a:Lokhttp3/Dns;

    .line 3
    iput-object p2, p0, Lbk/a;->b:Lcom/kubi/httpdns/track/ILookupTrack$a;

    return-void
.end method

.method public synthetic constructor <init>(Lokhttp3/Dns;Lcom/kubi/httpdns/track/ILookupTrack$a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    .line 4
    sget-object p1, Lokhttp3/Dns;->SYSTEM:Lokhttp3/Dns;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    .line 5
    new-instance p2, Lcom/kubi/httpdns/track/b;

    invoke-direct {p2}, Lcom/kubi/httpdns/track/b;-><init>()V

    .line 6
    :cond_1
    invoke-direct {p0, p1, p2}, Lbk/a;-><init>(Lokhttp3/Dns;Lcom/kubi/httpdns/track/ILookupTrack$a;)V

    return-void
.end method


# virtual methods
.method public lookup(Ljava/lang/String;)Ljava/util/List;
    .locals 6
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/net/InetAddress;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/UnknownHostException;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "hostname"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lbk/a;->b:Lcom/kubi/httpdns/track/ILookupTrack$a;

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, p1}, Lcom/kubi/httpdns/track/ILookupTrack$a;->a(Ljava/lang/String;)Lcom/kubi/httpdns/track/ILookupTrack;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-interface {v0}, Lcom/kubi/httpdns/track/ILookupTrack;->b()V

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Lcom/kubi/httpdns/track/ILookupTrack;->e()V

    .line 18
    .line 19
    sget-object v1, Lak/a;->a:Lak/a;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, p1}, Lak/a;->a(Ljava/lang/String;)Lck/a;

    .line 23
    move-result-object v1

    .line 24
    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    new-instance v2, Ljava/net/UnknownHostException;

    .line 28
    .line 29
    new-instance v3, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 33
    .line 34
    const-string v4, "request host["

    .line 35
    .line 36
    .line 37
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    const-string v4, "] not found return null"

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    move-result-object v3

    .line 50
    .line 51
    .line 52
    invoke-direct {v2, v3}, Ljava/net/UnknownHostException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-interface {v0, v2}, Lcom/kubi/httpdns/track/ILookupTrack;->i(Ljava/lang/Throwable;)V

    .line 56
    goto :goto_0

    .line 57
    .line 58
    .line 59
    :cond_0
    invoke-interface {v0, v1}, Lcom/kubi/httpdns/track/ILookupTrack;->g(Lck/a;)V

    .line 60
    .line 61
    .line 62
    :goto_0
    :try_start_0
    invoke-interface {v0}, Lcom/kubi/httpdns/track/ILookupTrack;->d()V

    .line 63
    .line 64
    iget-object v2, p0, Lbk/a;->a:Lokhttp3/Dns;

    .line 65
    .line 66
    .line 67
    invoke-interface {v2, p1}, Lokhttp3/Dns;->lookup(Ljava/lang/String;)Ljava/util/List;

    .line 68
    move-result-object v2

    .line 69
    .line 70
    .line 71
    invoke-interface {v0, v2}, Lcom/kubi/httpdns/track/ILookupTrack;->h(Ljava/util/List;)V

    .line 72
    const/4 v3, 0x1

    .line 73
    .line 74
    .line 75
    invoke-interface {v0, v2, v3}, Lcom/kubi/httpdns/track/ILookupTrack;->f(Ljava/util/List;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    return-object v2

    .line 77
    :catchall_0
    move-exception v2

    .line 78
    .line 79
    .line 80
    invoke-interface {v0, v2}, Lcom/kubi/httpdns/track/ILookupTrack;->c(Ljava/lang/Throwable;)V

    .line 81
    .line 82
    if-eqz v1, :cond_2

    .line 83
    .line 84
    .line 85
    :try_start_1
    invoke-virtual {v1}, Lck/a;->d()[Ljava/lang/String;

    .line 86
    move-result-object p1

    .line 87
    .line 88
    new-instance v1, Ljava/util/ArrayList;

    .line 89
    array-length v2, p1

    .line 90
    .line 91
    .line 92
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 93
    array-length v2, p1

    .line 94
    const/4 v3, 0x0

    .line 95
    move v4, v3

    .line 96
    .line 97
    :goto_1
    if-ge v4, v2, :cond_1

    .line 98
    .line 99
    aget-object v5, p1, v4

    .line 100
    .line 101
    .line 102
    invoke-static {v5}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    .line 103
    move-result-object v5

    .line 104
    .line 105
    .line 106
    invoke-interface {v1, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 107
    .line 108
    add-int/lit8 v4, v4, 0x1

    .line 109
    goto :goto_1

    .line 110
    :catchall_1
    move-exception p1

    .line 111
    goto :goto_2

    .line 112
    .line 113
    .line 114
    :cond_1
    invoke-interface {v0, v1, v3}, Lcom/kubi/httpdns/track/ILookupTrack;->f(Ljava/util/List;Z)V

    .line 115
    return-object v1

    .line 116
    .line 117
    :cond_2
    new-instance v1, Ljava/net/UnknownHostException;

    .line 118
    .line 119
    new-instance v2, Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 123
    .line 124
    const-string v3, "Both system and httpDns failed for host: "

    .line 125
    .line 126
    .line 127
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 134
    move-result-object p1

    .line 135
    .line 136
    .line 137
    invoke-direct {v1, p1}, Ljava/net/UnknownHostException;-><init>(Ljava/lang/String;)V

    .line 138
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 139
    .line 140
    :goto_2
    sget-object v1, Lik/b;->a:Lik/b;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v1}, Lik/b;->b()Ljava/lang/String;

    .line 144
    move-result-object v1

    .line 145
    .line 146
    instance-of v2, p1, Ljava/net/SocketException;

    .line 147
    .line 148
    if-nez v2, :cond_4

    .line 149
    .line 150
    instance-of v2, p1, Lcom/kubi/httpdns/interpret/NoServerException;

    .line 151
    .line 152
    if-nez v2, :cond_4

    .line 153
    .line 154
    instance-of v2, p1, Ljava/net/SocketTimeoutException;

    .line 155
    .line 156
    if-nez v2, :cond_4

    .line 157
    .line 158
    instance-of v2, p1, Landroid/system/ErrnoException;

    .line 159
    .line 160
    if-eqz v2, :cond_3

    .line 161
    goto :goto_3

    .line 162
    .line 163
    .line 164
    :cond_3
    invoke-static {p1, v1}, Ldk/a;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 165
    goto :goto_4

    .line 166
    .line 167
    .line 168
    :cond_4
    :goto_3
    invoke-static {v1, p1}, Lro/b;->g(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 169
    .line 170
    .line 171
    :goto_4
    invoke-interface {v0, p1}, Lcom/kubi/httpdns/track/ILookupTrack;->a(Ljava/lang/Throwable;)V

    .line 172
    throw p1
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
