.class public final Lcom/kubi/sdk/log/realtime/RealTimeReporter$b;
.super Ljava/lang/Object;
.source "RealTimeReporter.kt"

# interfaces
.implements Lcom/kubi/sdk/log/realtime/cache/LogCache$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/sdk/log/realtime/RealTimeReporter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "com/kubi/sdk/log/realtime/RealTimeReporter$b",
        "Lcom/kubi/sdk/log/realtime/cache/LogCache$b;",
        "",
        "a",
        "()V",
        "Logger-realtime_release"
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
        "SMAP\nRealTimeReporter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealTimeReporter.kt\ncom/kubi/sdk/log/realtime/RealTimeReporter$callback$1\n+ 2 RealLogger.kt\ncom/kubi/sdk/log/realtime/utils/RealLoggerKt\n*L\n1#1,342:1\n16#2,4:343\n16#2,4:347\n*S KotlinDebug\n*F\n+ 1 RealTimeReporter.kt\ncom/kubi/sdk/log/realtime/RealTimeReporter$callback$1\n*L\n89#1:343,4\n102#1:347,4\n*E\n"
    }
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
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    move-result-wide v0

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->d()J

    .line 8
    move-result-wide v2

    .line 9
    sub-long/2addr v0, v2

    .line 10
    .line 11
    const-wide/16 v2, 0x3e8

    .line 12
    .line 13
    cmp-long v0, v0, v2

    .line 14
    .line 15
    if-lez v0, :cond_3

    .line 16
    .line 17
    .line 18
    invoke-static {}, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->b()Lcom/kubi/sdk/log/realtime/cache/LogCache;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    sget-object v1, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->a:Lcom/kubi/sdk/log/realtime/RealTimeReporter;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->j()Lcom/kubi/sdk/log/realtime/LogRemoteConfigData;

    .line 25
    move-result-object v1

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Lcom/kubi/sdk/log/realtime/LogRemoteConfigData;->getLimitSize()I

    .line 29
    move-result v1

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1}, Lcom/kubi/sdk/log/realtime/cache/LogCache;->o(I)Lcom/kubi/sdk/log/realtime/cache/LogCache$a;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Lcom/kubi/sdk/log/realtime/cache/LogCache$a;->a()Ljava/util/List;

    .line 37
    move-result-object v1

    .line 38
    .line 39
    .line 40
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 41
    move-result v1

    .line 42
    .line 43
    if-nez v1, :cond_2

    .line 44
    .line 45
    .line 46
    invoke-static {}, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->c()Lcom/kubi/sdk/log/realtime/RealTimeReporter$a;

    .line 47
    move-result-object v1

    .line 48
    .line 49
    if-eqz v1, :cond_0

    .line 50
    const/4 v2, 0x2

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeMessages(I)V

    .line 54
    .line 55
    .line 56
    :cond_0
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    .line 57
    move-result-object v1

    .line 58
    const/4 v2, 0x1

    .line 59
    .line 60
    iput v2, v1, Landroid/os/Message;->what:I

    .line 61
    .line 62
    iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    invoke-static {}, Lcom/kubi/sdk/log/realtime/RealTimeReporter;->c()Lcom/kubi/sdk/log/realtime/RealTimeReporter$a;

    .line 66
    move-result-object v0

    .line 67
    .line 68
    if-eqz v0, :cond_1

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 72
    :cond_1
    return-void

    .line 73
    .line 74
    :cond_2
    const-string v0, "Logger::RealTimeReporter"

    .line 75
    .line 76
    const-string v1, "\u7f13\u5b58\u6ee1\uff0c\u4f46\u662f\u7f13\u5b58\u961f\u5217\u4e3a\u7a7a\uff0c\u8df3\u8fc7\u4e0a\u62a5"

    .line 77
    .line 78
    .line 79
    invoke-static {v0, v1}, Lro/b;->n(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    :cond_3
    return-void
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
