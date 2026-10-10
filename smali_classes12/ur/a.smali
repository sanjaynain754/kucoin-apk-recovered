.class public final Lur/a;
.super Ljava/lang/Object;
.source "ActiveTrack.kt"

# interfaces
.implements Lur/d;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\nJ\u000f\u0010\u000c\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\nJ\u0017\u0010\u000f\u001a\u00020\u00082\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0013R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001e"
    }
    d2 = {
        "Lur/a;",
        "Lur/d;",
        "",
        "linkType",
        "",
        "activePeriod",
        "<init>",
        "(Ljava/lang/String;J)V",
        "",
        "start",
        "()V",
        "stop",
        "a",
        "",
        "isSuccess",
        "f",
        "(Z)V",
        "Ljava/lang/String;",
        "b",
        "J",
        "c",
        "activeTime",
        "Ljava/util/Timer;",
        "d",
        "Ljava/util/Timer;",
        "activeTimer",
        "Lcom/kubi/network/socket/utils/i;",
        "e",
        "Lcom/kubi/network/socket/utils/i;",
        "evaluator",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nActiveTrack.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActiveTrack.kt\ncom/kubi/network/socket/track/ActiveTrack\n+ 2 TechnologyEvent.kt\ncom/kubi/monitor/TechnologyEvent\n+ 3 KunlunEvent.kt\ncom/kubi/monitor/KunlunEvent\n*L\n1#1,87:1\n71#2,4:88\n74#3,12:92\n*S KotlinDebug\n*F\n+ 1 ActiveTrack.kt\ncom/kubi/network/socket/track/ActiveTrack\n*L\n63#1:88,4\n70#1:92,12\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:J

.field public c:J

.field public d:Ljava/util/Timer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final e:Lcom/kubi/network/socket/utils/i;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;J)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "linkType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lur/a;->a:Ljava/lang/String;

    .line 3
    iput-wide p2, p0, Lur/a;->b:J

    .line 4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    iput-wide p1, p0, Lur/a;->c:J

    .line 5
    new-instance p1, Lcom/kubi/network/socket/utils/i;

    const-wide/16 p2, 0xa

    invoke-direct {p1, p2, p3}, Lcom/kubi/network/socket/utils/i;-><init>(J)V

    iput-object p1, p0, Lur/a;->e:Lcom/kubi/network/socket/utils/i;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;JILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    .line 6
    const-string p1, "push"

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    const-wide/32 p2, 0xea60

    .line 7
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lur/a;-><init>(Ljava/lang/String;J)V

    return-void
.end method

.method public static final synthetic b(Lur/a;)J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lur/a;->b:J

    .line 3
    return-wide v0
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

.method public static final synthetic c(Lur/a;)J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lur/a;->c:J

    .line 3
    return-wide v0
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

.method public static final synthetic d(Lur/a;)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lur/a;->a:Ljava/lang/String;

    .line 3
    return-object p0
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

.method public static final synthetic e(Lur/a;Z)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lur/a;->f(Z)V

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


# virtual methods
.method public a()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    move-result-wide v0

    .line 5
    .line 6
    iput-wide v0, p0, Lur/a;->c:J

    .line 7
    return-void
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

.method public final f(Z)V
    .locals 6

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/network/socket/utils/d;->a:Lcom/kubi/network/socket/utils/d;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/network/socket/utils/d;->b()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto/16 :goto_1

    .line 11
    .line 12
    :cond_0
    sget-object v0, Lcom/kubi/network/socket/utils/g;->a:Lcom/kubi/network/socket/utils/g;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/kubi/network/socket/utils/g;->h()Z

    .line 16
    move-result v0

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    goto/16 :goto_1

    .line 21
    .line 22
    :cond_1
    xor-int/lit8 v0, p1, 0x1

    .line 23
    .line 24
    sget-object v1, Lcom/kubi/monitor/TechnologyEvent;->a:Lcom/kubi/monitor/TechnologyEvent;

    .line 25
    .line 26
    sget-object v1, Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;->b:Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder$Companion;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder$Companion;->acquire()Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;

    .line 30
    move-result-object v2

    .line 31
    .line 32
    const-string v3, "code"

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2, v3, v0}, Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;->b(Ljava/lang/String;I)V

    .line 36
    .line 37
    .line 38
    invoke-static {p0}, Lur/a;->d(Lur/a;)Ljava/lang/String;

    .line 39
    move-result-object v3

    .line 40
    .line 41
    const-string v4, "link_type"

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2, v4, v3}, Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-static {v2}, Lcom/kubi/monitor/TechnologyEvent$a;->b(Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;)V

    .line 48
    .line 49
    const-string v3, "socket_active"

    .line 50
    .line 51
    .line 52
    invoke-static {v3, v2}, Lcom/kubi/monitor/TechnologyEvent;->d(Ljava/lang/String;Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;)V

    .line 53
    .line 54
    sget-object v2, Lcom/kubi/sdk/constant/monitor/KunlunEventNameEnum;->FRONTEND_CONNECT_WS_ACTIVE:Lcom/kubi/sdk/constant/monitor/KunlunEventNameEnum;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder$Companion;->acquire()Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;

    .line 58
    move-result-object v1

    .line 59
    .line 60
    const-string v3, "status_code"

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1, v3, v0}, Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;->b(Ljava/lang/String;I)V

    .line 64
    .line 65
    .line 66
    invoke-static {p0}, Lur/a;->d(Lur/a;)Ljava/lang/String;

    .line 67
    move-result-object v0

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1, v4, v0}, Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    .line 72
    sget-object v0, Lcom/kubi/monitor/TechnologyEvent$a;->a:Lcom/kubi/monitor/TechnologyEvent$a;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v1}, Lcom/kubi/monitor/TechnologyEvent$a;->c(Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;)Ljava/util/Map;

    .line 76
    move-result-object v3

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, v1}, Lcom/kubi/monitor/TechnologyEvent$a;->a(Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;)Ljava/util/Map;

    .line 80
    move-result-object v0

    .line 81
    .line 82
    sget-object v1, Lqq/i;->a:Lqq/i;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1}, Lqq/i;->e()Lqq/e;

    .line 86
    move-result-object v1

    .line 87
    .line 88
    .line 89
    invoke-interface {v1}, Lqq/e;->c()Ljava/util/List;

    .line 90
    move-result-object v1

    .line 91
    .line 92
    .line 93
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 94
    move-result-object v1

    .line 95
    .line 96
    .line 97
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 98
    move-result v4

    .line 99
    .line 100
    if-eqz v4, :cond_3

    .line 101
    .line 102
    .line 103
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 104
    move-result-object v4

    .line 105
    .line 106
    check-cast v4, Lrq/a;

    .line 107
    .line 108
    .line 109
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 110
    move-result v5

    .line 111
    .line 112
    if-eqz v5, :cond_2

    .line 113
    .line 114
    .line 115
    invoke-virtual {v2}, Lcom/kubi/sdk/constant/monitor/KunlunEventNameEnum;->getEventName()Ljava/lang/String;

    .line 116
    move-result-object v5

    .line 117
    .line 118
    .line 119
    invoke-interface {v4, v5, v3}, Lrq/a;->b(Ljava/lang/String;Ljava/util/Map;)V

    .line 120
    goto :goto_0

    .line 121
    .line 122
    .line 123
    :cond_2
    invoke-virtual {v2}, Lcom/kubi/sdk/constant/monitor/KunlunEventNameEnum;->getEventName()Ljava/lang/String;

    .line 124
    move-result-object v5

    .line 125
    .line 126
    .line 127
    invoke-interface {v4, v5, v0, v3}, Lrq/a;->a(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V

    .line 128
    goto :goto_0

    .line 129
    .line 130
    :cond_3
    iget-object v0, p0, Lur/a;->e:Lcom/kubi/network/socket/utils/i;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0, p1}, Lcom/kubi/network/socket/utils/i;->a(Z)Lcom/kubi/network/socket/utils/j;

    .line 134
    move-result-object p1

    .line 135
    .line 136
    if-eqz p1, :cond_4

    .line 137
    .line 138
    new-instance v0, Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 142
    .line 143
    const-string v1, "request ws_connect_active_rate: windowSuccessRate = "

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {p1}, Lcom/kubi/network/socket/utils/j;->b()D

    .line 150
    move-result-wide v1

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    const-string v1, ", totalSuccessRate = "

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {p1}, Lcom/kubi/network/socket/utils/j;->a()D

    .line 162
    move-result-wide v1

    .line 163
    .line 164
    .line 165
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 169
    move-result-object p1

    .line 170
    .line 171
    const-string v0, "NetworkChain:Ws"

    .line 172
    .line 173
    .line 174
    invoke-static {v0, p1}, Lro/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 175
    :cond_4
    :goto_1
    return-void
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

.method public start()V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lur/a;->stop()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/Timer;

    .line 6
    .line 7
    const-string v1, "ActiveTrack"

    .line 8
    const/4 v2, 0x1

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v1, v2}, Ljava/util/Timer;-><init>(Ljava/lang/String;Z)V

    .line 12
    .line 13
    iput-object v0, p0, Lur/a;->d:Ljava/util/Timer;

    .line 14
    .line 15
    new-instance v1, Lur/a$a;

    .line 16
    .line 17
    .line 18
    invoke-direct {v1, p0}, Lur/a$a;-><init>(Lur/a;)V

    .line 19
    .line 20
    const-wide/16 v2, 0x0

    .line 21
    .line 22
    iget-wide v4, p0, Lur/a;->b:J

    .line 23
    .line 24
    .line 25
    invoke-virtual/range {v0 .. v5}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V

    .line 26
    return-void
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public stop()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    move-result-wide v0

    .line 5
    .line 6
    iput-wide v0, p0, Lur/a;->c:J

    .line 7
    .line 8
    iget-object v0, p0, Lur/a;->d:Ljava/util/Timer;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    .line 16
    iput-object v0, p0, Lur/a;->d:Ljava/util/Timer;

    .line 17
    return-void
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
