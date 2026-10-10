.class public final Lcom/kubi/chat/network/websockt/ChatSocketExecutor$e;
.super Lqb/b;
.source "ChatSocketExecutor.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/chat/network/websockt/ChatSocketExecutor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "e"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0008\u0086\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/kubi/chat/network/websockt/ChatSocketExecutor$e;",
        "Lqb/b;",
        "<init>",
        "(Lcom/kubi/chat/network/websockt/ChatSocketExecutor;)V",
        "Landroid/os/Message;",
        "msg",
        "",
        "c",
        "(Landroid/os/Message;)Z",
        "ImSDK_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Lcom/kubi/chat/network/websockt/ChatSocketExecutor;


# direct methods
.method public constructor <init>(Lcom/kubi/chat/network/websockt/ChatSocketExecutor;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "this$0"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/kubi/chat/network/websockt/ChatSocketExecutor$e;->a:Lcom/kubi/chat/network/websockt/ChatSocketExecutor;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lqb/b;-><init>()V

    .line 11
    return-void
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
.end method


# virtual methods
.method public c(Landroid/os/Message;)Z
    .locals 5
    .param p1    # Landroid/os/Message;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "msg"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget p1, p1, Landroid/os/Message;->what:I

    .line 8
    const/4 v0, 0x1

    .line 9
    .line 10
    if-ne p1, v0, :cond_1

    .line 11
    const/4 p1, 0x5

    .line 12
    const/4 v1, 0x0

    .line 13
    .line 14
    :try_start_0
    sget-object v2, Lpb/b;->a:Lpb/b;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2}, Lpb/b;->c()Lpb/a;

    .line 18
    move-result-object v2

    .line 19
    .line 20
    .line 21
    invoke-interface {v2}, Lpb/a;->c()Lretrofit2/Call;

    .line 22
    move-result-object v2

    .line 23
    .line 24
    .line 25
    invoke-interface {v2}, Lretrofit2/Call;->execute()Lretrofit2/Response;

    .line 26
    move-result-object v2

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 30
    move-result-object v2

    .line 31
    .line 32
    check-cast v2, Lcom/kubi/chat/entity/ChatToken;

    .line 33
    .line 34
    if-nez v2, :cond_0

    .line 35
    .line 36
    iget-object v2, p0, Lcom/kubi/chat/network/websockt/ChatSocketExecutor$e;->a:Lcom/kubi/chat/network/websockt/ChatSocketExecutor;

    .line 37
    .line 38
    .line 39
    invoke-static {v2}, Lcom/kubi/chat/network/websockt/ChatSocketExecutor;->I(Lcom/kubi/chat/network/websockt/ChatSocketExecutor;)Lcom/kubi/chat/network/websockt/ChatSocketExecutor$d;

    .line 40
    move-result-object v3

    .line 41
    .line 42
    .line 43
    invoke-static {v2, v3}, Lcom/kubi/chat/network/websockt/ChatSocketExecutor;->Q(Lcom/kubi/chat/network/websockt/ChatSocketExecutor;Lqb/a;)V

    .line 44
    .line 45
    iget-object v2, p0, Lcom/kubi/chat/network/websockt/ChatSocketExecutor$e;->a:Lcom/kubi/chat/network/websockt/ChatSocketExecutor;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2, v1, p1}, Lqb/c;->u(II)V

    .line 49
    goto :goto_0

    .line 50
    .line 51
    :cond_0
    iget-object v3, p0, Lcom/kubi/chat/network/websockt/ChatSocketExecutor$e;->a:Lcom/kubi/chat/network/websockt/ChatSocketExecutor;

    .line 52
    const/4 v4, 0x2

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3, v4, v2}, Lqb/c;->v(ILjava/lang/Object;)V

    .line 56
    .line 57
    iget-object v2, p0, Lcom/kubi/chat/network/websockt/ChatSocketExecutor$e;->a:Lcom/kubi/chat/network/websockt/ChatSocketExecutor;

    .line 58
    .line 59
    .line 60
    invoke-static {v2}, Lcom/kubi/chat/network/websockt/ChatSocketExecutor;->H(Lcom/kubi/chat/network/websockt/ChatSocketExecutor;)Lcom/kubi/chat/network/websockt/ChatSocketExecutor$b;

    .line 61
    move-result-object v3

    .line 62
    .line 63
    .line 64
    invoke-static {v2, v3}, Lcom/kubi/chat/network/websockt/ChatSocketExecutor;->Q(Lcom/kubi/chat/network/websockt/ChatSocketExecutor;Lqb/a;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 65
    goto :goto_0

    .line 66
    .line 67
    :catch_0
    iget-object v2, p0, Lcom/kubi/chat/network/websockt/ChatSocketExecutor$e;->a:Lcom/kubi/chat/network/websockt/ChatSocketExecutor;

    .line 68
    .line 69
    .line 70
    invoke-static {v2}, Lcom/kubi/chat/network/websockt/ChatSocketExecutor;->I(Lcom/kubi/chat/network/websockt/ChatSocketExecutor;)Lcom/kubi/chat/network/websockt/ChatSocketExecutor$d;

    .line 71
    move-result-object v3

    .line 72
    .line 73
    .line 74
    invoke-static {v2, v3}, Lcom/kubi/chat/network/websockt/ChatSocketExecutor;->Q(Lcom/kubi/chat/network/websockt/ChatSocketExecutor;Lqb/a;)V

    .line 75
    .line 76
    iget-object v2, p0, Lcom/kubi/chat/network/websockt/ChatSocketExecutor$e;->a:Lcom/kubi/chat/network/websockt/ChatSocketExecutor;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2, v1, p1}, Lqb/c;->u(II)V

    .line 80
    :cond_1
    :goto_0
    return v0
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
.end method
