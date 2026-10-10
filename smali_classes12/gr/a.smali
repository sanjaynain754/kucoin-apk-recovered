.class public final Lgr/a;
.super Ljava/lang/Object;
.source "SubscribeCallAdapter.kt"

# interfaces
.implements Lkr/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ResponseIn:",
        "Ljava/lang/Object;",
        "ResponseOut:",
        "Ljava/lang/Object;",
        "ResponseStream:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lkr/a<",
        "TResponseIn;TResponseOut;TResponseStream;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0002\u0018\u0000*\u0008\u0008\u0000\u0010\u0002*\u00020\u0001*\u0008\u0008\u0001\u0010\u0003*\u00020\u0001*\u0008\u0008\u0002\u0010\u0004*\u00020\u00012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005B#\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00028\u00022\u0006\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u0010R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lgr/a;",
        "",
        "ResponseIn",
        "ResponseOut",
        "ResponseStream",
        "Lkr/a;",
        "Ler/a;",
        "client",
        "Lkr/c;",
        "convert",
        "<init>",
        "(Ler/a;Lkr/c;)V",
        "Lcom/kubi/network/restful/c;",
        "request",
        "a",
        "(Lcom/kubi/network/restful/c;)Ljava/lang/Object;",
        "Ler/a;",
        "b",
        "Lkr/c;",
        "network-adapter-subscribe_release"
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
        "SMAP\nSubscribeCallAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubscribeCallAdapter.kt\ncom/kubi/network/api/subscribe/adapter/FlowSubscribeCallAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n1#2:91\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Ler/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lkr/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkr/c<",
            "TResponseIn;TResponseOut;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ler/a;Lkr/c;)V
    .locals 1
    .param p1    # Ler/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkr/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ler/a;",
            "Lkr/c<",
            "TResponseIn;TResponseOut;>;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "client"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "convert"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    iput-object p1, p0, Lgr/a;->a:Ler/a;

    .line 16
    .line 17
    iput-object p2, p0, Lgr/a;->b:Lkr/c;

    .line 18
    return-void
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


# virtual methods
.method public a(Lcom/kubi/network/restful/c;)Ljava/lang/Object;
    .locals 6
    .param p1    # Lcom/kubi/network/restful/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/network/restful/c;",
            ")TResponseStream;"
        }
    .end annotation

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
    iget-object v0, p0, Lgr/a;->a:Ler/a;

    .line 8
    .line 9
    sget-object v1, Lcom/kubi/network/api/subscribe/utils/b;->a:Lcom/kubi/network/api/subscribe/utils/b;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, p1}, Lcom/kubi/network/api/subscribe/utils/b;->g(Lcom/kubi/network/restful/c;)Lcom/kubi/network/api/subscribe/model/SubscribeRequest;

    .line 13
    move-result-object v2

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, p1}, Lcom/kubi/network/api/subscribe/utils/b;->a(Lcom/kubi/network/restful/c;)Lkr/c;

    .line 17
    move-result-object v3

    .line 18
    .line 19
    if-nez v3, :cond_0

    .line 20
    .line 21
    iget-object v3, p0, Lgr/a;->b:Lkr/c;

    .line 22
    .line 23
    :cond_0
    const-string v4, "null cannot be cast to non-null type com.kubi.network.restful.core.IConverter<com.kubi.network.api.subscribe.model.SubscribeMessage, ResponseOut of com.kubi.network.api.subscribe.adapter.FlowSubscribeCallAdapter>"

    .line 24
    .line 25
    .line 26
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, p1}, Lcom/kubi/network/api/subscribe/utils/b;->c(Lcom/kubi/network/restful/c;)Lhr/f;

    .line 30
    move-result-object v4

    .line 31
    const/4 v5, 0x0

    .line 32
    .line 33
    if-eqz v4, :cond_1

    .line 34
    .line 35
    .line 36
    invoke-virtual {v4}, Lhr/f;->f()Lkotlinx/coroutines/flow/m;

    .line 37
    move-result-object v4

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    move-object v4, v5

    .line 40
    .line 41
    .line 42
    :goto_0
    invoke-virtual {v1, p1}, Lcom/kubi/network/api/subscribe/utils/b;->e(Lcom/kubi/network/restful/c;)Ljava/lang/reflect/Type;

    .line 43
    move-result-object p1

    .line 44
    .line 45
    if-eqz p1, :cond_2

    .line 46
    .line 47
    new-instance v5, Lgr/i;

    .line 48
    .line 49
    .line 50
    invoke-direct {v5, p1}, Lgr/i;-><init>(Ljava/lang/reflect/Type;)V

    .line 51
    .line 52
    .line 53
    :cond_2
    invoke-static {v0, v2, v3, v4, v5}, Lcom/kubi/network/api/subscribe/utils/ChannelUtilsKt;->a(Ler/a;Lcom/kubi/network/api/subscribe/model/SubscribeRequest;Lkr/c;Lkotlinx/coroutines/flow/m;Lkr/c;)Lkotlinx/coroutines/flow/e;

    .line 54
    move-result-object p1

    .line 55
    .line 56
    const-string v0, "null cannot be cast to non-null type ResponseStream of com.kubi.network.api.subscribe.adapter.FlowSubscribeCallAdapter"

    .line 57
    .line 58
    .line 59
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    return-object p1
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
.end method
