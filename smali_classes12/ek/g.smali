.class public final Lek/g;
.super Ljava/lang/Object;
.source "InterpretServiceImpl.kt"

# interfaces
.implements Lek/d;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u000eR\u001a\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0015"
    }
    d2 = {
        "Lek/g;",
        "Lek/d;",
        "Lcom/kubi/httpdns/HttpDnsConfig;",
        "config",
        "Lek/b;",
        "Lek/c;",
        "categoryController",
        "<init>",
        "(Lcom/kubi/httpdns/HttpDnsConfig;Lek/b;)V",
        "Lek/e;",
        "request",
        "Lek/f;",
        "a",
        "(Lek/e;)Lek/f;",
        "Lcom/kubi/httpdns/HttpDnsConfig;",
        "b",
        "Lek/b;",
        "Lik/d;",
        "c",
        "Lik/d;",
        "interpretRecorder",
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


# instance fields
.field public final a:Lcom/kubi/httpdns/HttpDnsConfig;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lek/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lek/b<",
            "Lek/c;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lik/d;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/kubi/httpdns/HttpDnsConfig;Lek/b;)V
    .locals 1
    .param p1    # Lcom/kubi/httpdns/HttpDnsConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lek/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/httpdns/HttpDnsConfig;",
            "Lek/b<",
            "Lek/c;",
            ">;)V"
        }
    .end annotation

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "categoryController"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lek/g;->a:Lcom/kubi/httpdns/HttpDnsConfig;

    .line 3
    iput-object p2, p0, Lek/g;->b:Lek/b;

    .line 4
    new-instance p1, Lik/d;

    invoke-direct {p1}, Lik/d;-><init>()V

    iput-object p1, p0, Lek/g;->c:Lik/d;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/kubi/httpdns/HttpDnsConfig;Lek/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 5
    new-instance p2, Lcom/kubi/httpdns/interpret/ClientControlImpl;

    invoke-direct {p2, p1}, Lcom/kubi/httpdns/interpret/ClientControlImpl;-><init>(Lcom/kubi/httpdns/HttpDnsConfig;)V

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2}, Lek/g;-><init>(Lcom/kubi/httpdns/HttpDnsConfig;Lek/b;)V

    return-void
.end method


# virtual methods
.method public a(Lek/e;)Lek/f;
    .locals 2
    .param p1    # Lek/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "request"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    :try_start_0
    iget-object v0, p0, Lek/g;->c:Lik/d;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lek/e;->a()Ljava/lang/String;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lik/d;->a(Ljava/lang/String;)Z

    .line 15
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    :try_start_1
    iget-object v0, p0, Lek/g;->b:Lek/b;

    .line 20
    .line 21
    .line 22
    invoke-interface {v0}, Lek/b;->a()Ljava/lang/Object;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    check-cast v0, Lek/c;

    .line 26
    .line 27
    .line 28
    invoke-interface {v0, p1}, Lek/c;->a(Lek/e;)Lek/f;

    .line 29
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 30
    .line 31
    :try_start_2
    iget-object v1, p0, Lek/g;->c:Lik/d;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Lek/e;->a()Ljava/lang/String;

    .line 35
    move-result-object p1

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, p1}, Lik/d;->b(Ljava/lang/String;)V

    .line 39
    return-object v0

    .line 40
    :catchall_0
    move-exception p1

    .line 41
    goto :goto_0

    .line 42
    :catchall_1
    move-exception v0

    .line 43
    .line 44
    iget-object v1, p0, Lek/g;->c:Lik/d;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Lek/e;->a()Ljava/lang/String;

    .line 48
    move-result-object p1

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, p1}, Lik/d;->b(Ljava/lang/String;)V

    .line 52
    throw v0

    .line 53
    .line 54
    :cond_0
    new-instance p1, Lcom/kubi/httpdns/interpret/InterpretExistException;

    .line 55
    .line 56
    .line 57
    invoke-direct {p1}, Lcom/kubi/httpdns/interpret/InterpretExistException;-><init>()V

    .line 58
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 59
    .line 60
    :goto_0
    new-instance v0, Lcom/kubi/httpdns/exception/InterpretException;

    .line 61
    .line 62
    .line 63
    invoke-direct {v0, p1}, Lcom/kubi/httpdns/exception/InterpretException;-><init>(Ljava/lang/Throwable;)V

    .line 64
    throw v0
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
.end method
