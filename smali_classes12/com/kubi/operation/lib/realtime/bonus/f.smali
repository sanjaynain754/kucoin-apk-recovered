.class public final Lcom/kubi/operation/lib/realtime/bonus/f;
.super Ljava/lang/Object;
.source "BonusRealtimeListener.kt"

# interfaces
.implements Lcom/kubi/home/realtime/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/kubi/home/realtime/f<",
        "Lcom/kubi/operation/lib/realtime/bonus/BonusRealtimeData;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0008\u0010\u0005\u001a\u00020\u0006H\u0016J\u0008\u0010\u0007\u001a\u00020\u0008H\u0016J\u0008\u0010\t\u001a\u00020\u0008H\u0016J\u0008\u0010\n\u001a\u00020\u0008H\u0016J\u0008\u0010\u000b\u001a\u00020\u0008H\u0016J\u0008\u0010\u000c\u001a\u00020\u0008H\u0016J\u0016\u0010\r\u001a\u00020\u00082\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000fH\u0016\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/kubi/operation/lib/realtime/bonus/BonusRealtimeListener;",
        "Lcom/kubi/home/realtime/ViewLifecycleListener;",
        "Lcom/kubi/operation/lib/realtime/bonus/BonusRealtimeData;",
        "<init>",
        "()V",
        "viewType",
        "Lcom/kubi/home/realtime/RealTimeViewType;",
        "onCardCreate",
        "",
        "onCardShow",
        "onCardHide",
        "onCardDestroy",
        "onCardRefresh",
        "onViewLifecycleEvent",
        "event",
        "Lcom/kubi/home/realtime/ViewLifecycleEvent;",
        "OperationLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


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
.method public a()V
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lzs/b;->a:Lzs/b;

    .line 3
    .line 4
    const-string v1, "[bonus]onCardShow"

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lzs/b;->d(Ljava/lang/String;)V

    .line 8
    .line 9
    sget-object v0, Lcom/kubi/operation/lib/realtime/bonus/BonusRealtimeDataHelper;->a:Lcom/kubi/operation/lib/realtime/bonus/BonusRealtimeDataHelper;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/kubi/operation/lib/realtime/bonus/BonusRealtimeDataHelper;->h()Lkotlinx/coroutines/x1;

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

.method public b()V
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lzs/b;->a:Lzs/b;

    .line 3
    .line 4
    const-string v1, "[bonus]onCardHide"

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lzs/b;->d(Ljava/lang/String;)V

    .line 8
    return-void
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

.method public c()Lcom/kubi/home/realtime/RealTimeViewType;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/home/realtime/RealTimeViewType;->WELFARE_BONUS:Lcom/kubi/home/realtime/RealTimeViewType;

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

.method public d(Lcom/kubi/home/realtime/e;)V
    .locals 3
    .param p1    # Lcom/kubi/home/realtime/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/home/realtime/e<",
            "Lcom/kubi/operation/lib/realtime/bonus/BonusRealtimeData;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "event"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/kubi/home/realtime/e;->a()Lcom/kubi/home/realtime/RealTimeViewType;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    sget-object v1, Lcom/kubi/home/realtime/RealTimeViewType;->WELFARE_BONUS:Lcom/kubi/home/realtime/RealTimeViewType;

    .line 12
    .line 13
    if-eq v0, v1, :cond_0

    .line 14
    return-void

    .line 15
    .line 16
    :cond_0
    sget-object v0, Lzs/b;->a:Lzs/b;

    .line 17
    .line 18
    new-instance v1, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    const-string v2, "[bonus]onViewLifecycleEvent,event:"

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    move-result-object v1

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v1}, Lzs/b;->d(Ljava/lang/String;)V

    .line 37
    .line 38
    instance-of v0, p1, Lcom/kubi/home/realtime/e$a;

    .line 39
    .line 40
    if-nez v0, :cond_2

    .line 41
    .line 42
    instance-of v0, p1, Lcom/kubi/home/realtime/e$b;

    .line 43
    .line 44
    if-nez v0, :cond_2

    .line 45
    .line 46
    instance-of v0, p1, Lcom/kubi/home/realtime/e$c;

    .line 47
    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    sget-object v0, Lcom/kubi/operation/lib/realtime/bonus/BonusRealtimeDataHelper;->a:Lcom/kubi/operation/lib/realtime/bonus/BonusRealtimeDataHelper;

    .line 51
    .line 52
    check-cast p1, Lcom/kubi/home/realtime/e$c;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1}, Lcom/kubi/home/realtime/e$c;->b()Lcom/kubi/home/realtime/b;

    .line 56
    move-result-object p1

    .line 57
    .line 58
    check-cast p1, Lcom/kubi/operation/lib/realtime/bonus/BonusRealtimeData;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, p1}, Lcom/kubi/operation/lib/realtime/bonus/BonusRealtimeDataHelper;->g(Lcom/kubi/operation/lib/realtime/bonus/BonusRealtimeData;)Lkotlinx/coroutines/x1;

    .line 62
    return-void

    .line 63
    .line 64
    :cond_1
    instance-of p1, p1, Lcom/kubi/home/realtime/e$d;

    .line 65
    :cond_2
    return-void
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

.method public e()V
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lzs/b;->a:Lzs/b;

    .line 3
    .line 4
    const-string v1, "[bonus]onCardRefresh"

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lzs/b;->d(Ljava/lang/String;)V

    .line 8
    .line 9
    sget-object v0, Lcom/kubi/operation/lib/realtime/bonus/BonusRealtimeDataHelper;->a:Lcom/kubi/operation/lib/realtime/bonus/BonusRealtimeDataHelper;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/kubi/operation/lib/realtime/bonus/BonusRealtimeDataHelper;->j()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/kubi/operation/lib/realtime/bonus/BonusRealtimeDataHelper;->h()Lkotlinx/coroutines/x1;

    .line 16
    return-void
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

.method public f()V
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lzs/b;->a:Lzs/b;

    .line 3
    .line 4
    const-string v1, "[bonus]onCardCreate"

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lzs/b;->d(Ljava/lang/String;)V

    .line 8
    .line 9
    sget-object v0, Lcom/kubi/operation/lib/realtime/bonus/BonusRealtimeDataHelper;->a:Lcom/kubi/operation/lib/realtime/bonus/BonusRealtimeDataHelper;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/kubi/operation/lib/realtime/bonus/BonusRealtimeDataHelper;->h()Lkotlinx/coroutines/x1;

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
