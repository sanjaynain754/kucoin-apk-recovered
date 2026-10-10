.class public final Lur/a$a;
.super Ljava/util/TimerTask;
.source "ActiveTrack.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lur/a;->start()V
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
        "ur/a$a",
        "Ljava/util/TimerTask;",
        "",
        "run",
        "()V",
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
        "SMAP\nActiveTrack.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActiveTrack.kt\ncom/kubi/network/socket/track/ActiveTrack$start$1\n+ 2 NetCoreSocketIssue.kt\ncom/kubi/network/socket/exception/NetCoreSocketIssueKt\n*L\n1#1,87:1\n52#2,33:88\n*S KotlinDebug\n*F\n+ 1 ActiveTrack.kt\ncom/kubi/network/socket/track/ActiveTrack$start$1\n*L\n38#1:88,33\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic b:Lur/a;


# direct methods
.method public constructor <init>(Lur/a;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lur/a$a;->b:Lur/a;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    .line 6
    return-void
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


# virtual methods
.method public run()V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    .line 4
    :try_start_0
    iget-object v2, p0, Lur/a$a;->b:Lur/a;

    .line 5
    .line 6
    .line 7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 8
    move-result-wide v3

    .line 9
    .line 10
    iget-object v5, p0, Lur/a$a;->b:Lur/a;

    .line 11
    .line 12
    .line 13
    invoke-static {v5}, Lur/a;->c(Lur/a;)J

    .line 14
    move-result-wide v5

    .line 15
    sub-long/2addr v3, v5

    .line 16
    .line 17
    iget-object v5, p0, Lur/a$a;->b:Lur/a;

    .line 18
    .line 19
    .line 20
    invoke-static {v5}, Lur/a;->b(Lur/a;)J

    .line 21
    move-result-wide v5

    .line 22
    .line 23
    cmp-long v3, v3, v5

    .line 24
    .line 25
    if-gez v3, :cond_0

    .line 26
    move v3, v1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move v3, v0

    .line 29
    .line 30
    .line 31
    :goto_0
    invoke-static {v2, v3}, Lur/a;->e(Lur/a;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    return-void

    .line 33
    :catchall_0
    move-exception v2

    .line 34
    .line 35
    instance-of v3, v2, Ljava/net/UnknownHostException;

    .line 36
    .line 37
    if-eqz v3, :cond_1

    .line 38
    :goto_1
    move v0, v1

    .line 39
    .line 40
    goto/16 :goto_2

    .line 41
    .line 42
    :cond_1
    instance-of v3, v2, Ljava/net/SocketException;

    .line 43
    .line 44
    if-eqz v3, :cond_2

    .line 45
    goto :goto_1

    .line 46
    .line 47
    :cond_2
    instance-of v3, v2, Ljava/net/SocketTimeoutException;

    .line 48
    .line 49
    if-eqz v3, :cond_3

    .line 50
    goto :goto_1

    .line 51
    .line 52
    :cond_3
    instance-of v3, v2, Ljavax/net/ssl/SSLException;

    .line 53
    .line 54
    if-eqz v3, :cond_4

    .line 55
    goto :goto_1

    .line 56
    .line 57
    :cond_4
    instance-of v3, v2, Ljavax/net/ssl/SSLProtocolException;

    .line 58
    .line 59
    if-eqz v3, :cond_5

    .line 60
    goto :goto_1

    .line 61
    .line 62
    :cond_5
    instance-of v3, v2, Ljavax/net/ssl/SSLPeerUnverifiedException;

    .line 63
    .line 64
    if-eqz v3, :cond_6

    .line 65
    goto :goto_1

    .line 66
    .line 67
    :cond_6
    instance-of v3, v2, Lokhttp3/internal/http2/ConnectionShutdownException;

    .line 68
    .line 69
    if-eqz v3, :cond_7

    .line 70
    goto :goto_1

    .line 71
    .line 72
    :cond_7
    instance-of v3, v2, Ljava/lang/SecurityException;

    .line 73
    const/4 v4, 0x0

    .line 74
    const/4 v5, 0x2

    .line 75
    .line 76
    if-eqz v3, :cond_8

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 80
    move-result-object v1

    .line 81
    .line 82
    if-eqz v1, :cond_f

    .line 83
    .line 84
    const-string v3, "Package android does not belong to"

    .line 85
    .line 86
    .line 87
    invoke-static {v1, v3, v0, v5, v4}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 88
    move-result v0

    .line 89
    goto :goto_2

    .line 90
    .line 91
    :cond_8
    instance-of v3, v2, Ljava/io/IOException;

    .line 92
    .line 93
    if-eqz v3, :cond_f

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 97
    move-result-object v3

    .line 98
    .line 99
    if-eqz v3, :cond_f

    .line 100
    .line 101
    const-string v6, "Required SETTINGS preface not received"

    .line 102
    .line 103
    .line 104
    invoke-static {v3, v6, v0, v5, v4}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 105
    move-result v6

    .line 106
    .line 107
    if-eqz v6, :cond_9

    .line 108
    goto :goto_1

    .line 109
    .line 110
    :cond_9
    const-string v6, "Unexpected response code for CONNECT"

    .line 111
    .line 112
    .line 113
    invoke-static {v3, v6, v0, v5, v4}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 114
    move-result v6

    .line 115
    .line 116
    if-eqz v6, :cond_a

    .line 117
    goto :goto_1

    .line 118
    .line 119
    :cond_a
    const-string v6, "exhausted all routes"

    .line 120
    .line 121
    .line 122
    invoke-static {v3, v6, v0, v5, v4}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 123
    move-result v6

    .line 124
    .line 125
    if-eqz v6, :cond_b

    .line 126
    goto :goto_1

    .line 127
    .line 128
    :cond_b
    const-string v6, "unexpected end of stream"

    .line 129
    .line 130
    .line 131
    invoke-static {v3, v6, v0, v5, v4}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 132
    move-result v6

    .line 133
    .line 134
    if-eqz v6, :cond_c

    .line 135
    goto :goto_1

    .line 136
    .line 137
    :cond_c
    const-string v6, "stream was reset: CANCEL"

    .line 138
    .line 139
    .line 140
    invoke-static {v3, v6, v0, v5, v4}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 141
    move-result v6

    .line 142
    .line 143
    if-eqz v6, :cond_d

    .line 144
    goto :goto_1

    .line 145
    .line 146
    :cond_d
    const-string v6, "Software caused connection abort"

    .line 147
    .line 148
    .line 149
    invoke-static {v3, v6, v0, v5, v4}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 150
    move-result v4

    .line 151
    .line 152
    if-eqz v4, :cond_e

    .line 153
    goto :goto_1

    .line 154
    .line 155
    :cond_e
    const-string v4, "closed"

    .line 156
    .line 157
    .line 158
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 159
    move-result v3

    .line 160
    .line 161
    if-eqz v3, :cond_f

    .line 162
    goto :goto_1

    .line 163
    .line 164
    :cond_f
    :goto_2
    const-string v1, "ActiveTrack"

    .line 165
    .line 166
    if-eqz v0, :cond_10

    .line 167
    .line 168
    .line 169
    invoke-static {v1, v2}, Lro/b;->g(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 170
    goto :goto_3

    .line 171
    .line 172
    .line 173
    :cond_10
    invoke-static {v2, v1}, Lrr/a;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 174
    :goto_3
    return-void
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
