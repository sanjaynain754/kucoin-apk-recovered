.class public final Ltr/b;
.super Ljava/lang/Object;
.source "DefaultTokenProvider.kt"

# interfaces
.implements Ltr/c;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\r\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u0014\u00a8\u0006\u0016"
    }
    d2 = {
        "Ltr/b;",
        "Ltr/c;",
        "Lokhttp3/OkHttpClient;",
        "client",
        "Ltr/a;",
        "config",
        "<init>",
        "(Lokhttp3/OkHttpClient;Ltr/a;)V",
        "",
        "fromCache",
        "Lcom/kubi/network/socket/model/TokenEntity;",
        "getToken",
        "(Z)Lcom/kubi/network/socket/model/TokenEntity;",
        "c",
        "()Z",
        "a",
        "Lokhttp3/OkHttpClient;",
        "b",
        "Ltr/a;",
        "Lcom/kubi/network/socket/utils/RemoteTokenUtils;",
        "Lcom/kubi/network/socket/utils/RemoteTokenUtils;",
        "tokenUtils",
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
.field public final a:Lokhttp3/OkHttpClient;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Ltr/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lcom/kubi/network/socket/utils/RemoteTokenUtils;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lokhttp3/OkHttpClient;Ltr/a;)V
    .locals 1
    .param p1    # Lokhttp3/OkHttpClient;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ltr/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "client"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ltr/b;->a:Lokhttp3/OkHttpClient;

    .line 3
    iput-object p2, p0, Ltr/b;->b:Ltr/a;

    .line 4
    new-instance p2, Lcom/kubi/network/socket/utils/RemoteTokenUtils;

    invoke-direct {p2, p1}, Lcom/kubi/network/socket/utils/RemoteTokenUtils;-><init>(Lokhttp3/OkHttpClient;)V

    iput-object p2, p0, Ltr/b;->c:Lcom/kubi/network/socket/utils/RemoteTokenUtils;

    return-void
.end method

.method public synthetic constructor <init>(Lokhttp3/OkHttpClient;Ltr/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    .line 5
    invoke-static {}, Lmr/a;->e()Lokhttp3/OkHttpClient;

    move-result-object p1

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2}, Ltr/b;-><init>(Lokhttp3/OkHttpClient;Ltr/a;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Ltr/c$a;->c(Ltr/c;)V

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

.method public b()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Ltr/c$a;->b(Ltr/c;)V

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

.method public c()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
    .line 3
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

.method public d()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Ltr/c$a;->d(Ltr/c;)V

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

.method public getToken(Z)Lcom/kubi/network/socket/model/TokenEntity;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object p1, p0, Ltr/b;->c:Lcom/kubi/network/socket/utils/RemoteTokenUtils;

    .line 3
    .line 4
    iget-object v0, p0, Ltr/b;->b:Ltr/a;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Ltr/a;->c()Ljava/lang/String;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    iget-object v1, p0, Ltr/b;->b:Ltr/a;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1}, Ltr/a;->a()Ljava/util/Map;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    iget-object v2, p0, Ltr/b;->b:Ltr/a;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2}, Ltr/a;->b()Ljava/util/Map;

    .line 20
    move-result-object v2

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v0, v1, v2}, Lcom/kubi/network/socket/utils/RemoteTokenUtils;->c(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Lcom/kubi/network/socket/model/DefaultTokenEntity;

    .line 24
    move-result-object p1

    .line 25
    .line 26
    new-instance v0, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 30
    .line 31
    const-string v1, "/socket.io"

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, v1}, Lcom/kubi/network/socket/model/DefaultTokenEntity;->getWsUrl(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    move-result-object v1

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    iget-object v1, p0, Ltr/b;->c:Lcom/kubi/network/socket/utils/RemoteTokenUtils;

    .line 41
    .line 42
    iget-object v2, p0, Ltr/b;->b:Ltr/a;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2}, Ltr/a;->d()Ljava/util/Map;

    .line 46
    move-result-object v2

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, v2}, Lcom/kubi/network/socket/utils/RemoteTokenUtils;->d(Ljava/util/Map;)Ljava/lang/String;

    .line 50
    move-result-object v1

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    move-result-object v0

    .line 58
    .line 59
    new-instance v1, Lcom/kubi/network/socket/model/TokenEntity;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1}, Lcom/kubi/network/socket/model/DefaultTokenEntity;->getPingInterval()I

    .line 63
    move-result v2

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1}, Lcom/kubi/network/socket/model/DefaultTokenEntity;->getPingTimeout()I

    .line 67
    move-result p1

    .line 68
    .line 69
    .line 70
    invoke-direct {v1, v0, v2, p1}, Lcom/kubi/network/socket/model/TokenEntity;-><init>(Ljava/lang/String;II)V

    .line 71
    return-object v1
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
.end method
