.class public final Lvr/a;
.super Ljava/lang/Object;
.source "SubscribeClient.kt"

# interfaces
.implements Lcom/kubi/network/socket/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\t\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u0003R\u0016\u0010\r\u001a\u00020\u00048\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u000cR$\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012\"\u0004\u0008\u0013\u0010\u0014R$\u0010\u001c\u001a\u0004\u0018\u00010\u00168\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u000f\u0010\u0019\"\u0004\u0008\u001a\u0010\u001bR$\u0010\"\u001a\u0004\u0018\u00010\u001d8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0011\u0010\u001e\u001a\u0004\u0008\u0017\u0010\u001f\"\u0004\u0008 \u0010!\u00a8\u0006#"
    }
    d2 = {
        "Lvr/a;",
        "Lcom/kubi/network/socket/a;",
        "<init>",
        "()V",
        "Lcom/kubi/network/socket/b;",
        "config",
        "",
        "a",
        "(Lcom/kubi/network/socket/b;)V",
        "connect",
        "disconnect",
        "cancelAll",
        "Lcom/kubi/network/socket/b;",
        "subscribeConfig",
        "Lyr/b;",
        "b",
        "Lyr/b;",
        "d",
        "()Lyr/b;",
        "setSubscribeQueue$network_core_subscribe_release",
        "(Lyr/b;)V",
        "subscribeQueue",
        "Lcom/kubi/network/subscribe/period/OnetimeExecutor;",
        "c",
        "Lcom/kubi/network/subscribe/period/OnetimeExecutor;",
        "()Lcom/kubi/network/subscribe/period/OnetimeExecutor;",
        "setOnetimeExecutor$network_core_subscribe_release",
        "(Lcom/kubi/network/subscribe/period/OnetimeExecutor;)V",
        "onetimeExecutor",
        "Lcom/kubi/network/subscribe/period/PeriodExecutor;",
        "Lcom/kubi/network/subscribe/period/PeriodExecutor;",
        "()Lcom/kubi/network/subscribe/period/PeriodExecutor;",
        "setPeriodExecutor$network_core_subscribe_release",
        "(Lcom/kubi/network/subscribe/period/PeriodExecutor;)V",
        "periodExecutor",
        "network-core-subscribe_release"
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
.field public a:Lcom/kubi/network/socket/b;

.field public b:Lyr/b;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public c:Lcom/kubi/network/subscribe/period/OnetimeExecutor;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public d:Lcom/kubi/network/subscribe/period/PeriodExecutor;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
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
.method public a(Lcom/kubi/network/socket/b;)V
    .locals 2
    .param p1    # Lcom/kubi/network/socket/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "config"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lvr/a;->a:Lcom/kubi/network/socket/b;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/kubi/network/socket/b;->e()Ler/a;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    new-instance v1, Lvr/a$a;

    .line 14
    .line 15
    .line 16
    invoke-direct {v1, p0, p1}, Lvr/a$a;-><init>(Lvr/a;Lcom/kubi/network/socket/b;)V

    .line 17
    .line 18
    .line 19
    invoke-interface {v0, v1}, Ler/a;->a(Lfr/d;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/kubi/network/socket/b;->c()Ljava/util/List;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    new-instance v1, Lxr/a;

    .line 26
    .line 27
    .line 28
    invoke-direct {v1, p0}, Lxr/a;-><init>(Lvr/a;)V

    .line 29
    .line 30
    .line 31
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/kubi/network/socket/b;->c()Ljava/util/List;

    .line 35
    move-result-object p1

    .line 36
    .line 37
    new-instance v0, Lxr/b;

    .line 38
    .line 39
    .line 40
    invoke-direct {v0, p0}, Lxr/b;-><init>(Lvr/a;)V

    .line 41
    .line 42
    .line 43
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 44
    return-void
    .line 45
.end method

.method public final b()Lcom/kubi/network/subscribe/period/OnetimeExecutor;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lvr/a;->c:Lcom/kubi/network/subscribe/period/OnetimeExecutor;

    .line 3
    return-object v0
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

.method public final c()Lcom/kubi/network/subscribe/period/PeriodExecutor;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lvr/a;->d:Lcom/kubi/network/subscribe/period/PeriodExecutor;

    .line 3
    return-object v0
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

.method public cancelAll()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lvr/a;->b:Lyr/b;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lyr/b;->clear()V

    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, Lvr/a;->d:Lcom/kubi/network/subscribe/period/PeriodExecutor;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/kubi/network/subscribe/period/PeriodExecutor;->c()V

    .line 15
    :cond_1
    return-void
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

.method public connect()V
    .locals 4

    .line 1
    .line 2
    new-instance v0, Lyr/b;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lyr/b;-><init>()V

    .line 6
    .line 7
    iput-object v0, p0, Lvr/a;->b:Lyr/b;

    .line 8
    .line 9
    new-instance v0, Lcom/kubi/network/subscribe/period/OnetimeExecutor;

    .line 10
    .line 11
    iget-object v1, p0, Lvr/a;->a:Lcom/kubi/network/socket/b;

    .line 12
    const/4 v2, 0x0

    .line 13
    .line 14
    const-string v3, "subscribeConfig"

    .line 15
    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    .line 19
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 20
    move-object v1, v2

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-direct {v0, v1}, Lcom/kubi/network/subscribe/period/OnetimeExecutor;-><init>(Lcom/kubi/network/socket/b;)V

    .line 24
    .line 25
    iput-object v0, p0, Lvr/a;->c:Lcom/kubi/network/subscribe/period/OnetimeExecutor;

    .line 26
    .line 27
    new-instance v0, Lcom/kubi/network/subscribe/period/PeriodExecutor;

    .line 28
    .line 29
    iget-object v1, p0, Lvr/a;->a:Lcom/kubi/network/socket/b;

    .line 30
    .line 31
    if-nez v1, :cond_1

    .line 32
    .line 33
    .line 34
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    move-object v2, v1

    .line 37
    .line 38
    .line 39
    :goto_0
    invoke-virtual {v2}, Lcom/kubi/network/socket/b;->e()Ler/a;

    .line 40
    move-result-object v1

    .line 41
    .line 42
    iget-object v2, p0, Lvr/a;->c:Lcom/kubi/network/subscribe/period/OnetimeExecutor;

    .line 43
    .line 44
    .line 45
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    invoke-direct {v0, v1, v2}, Lcom/kubi/network/subscribe/period/PeriodExecutor;-><init>(Ler/a;Lzr/a;)V

    .line 49
    .line 50
    iput-object v0, p0, Lvr/a;->d:Lcom/kubi/network/subscribe/period/PeriodExecutor;

    .line 51
    return-void
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
.end method

.method public final d()Lyr/b;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lvr/a;->b:Lyr/b;

    .line 3
    return-object v0
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

.method public disconnect()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lvr/a;->cancelAll()V

    .line 4
    .line 5
    iget-object v0, p0, Lvr/a;->d:Lcom/kubi/network/subscribe/period/PeriodExecutor;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    .line 13
    iput-object v0, p0, Lvr/a;->d:Lcom/kubi/network/subscribe/period/PeriodExecutor;

    .line 14
    .line 15
    iput-object v0, p0, Lvr/a;->c:Lcom/kubi/network/subscribe/period/OnetimeExecutor;

    .line 16
    .line 17
    iput-object v0, p0, Lvr/a;->b:Lyr/b;

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
.end method
