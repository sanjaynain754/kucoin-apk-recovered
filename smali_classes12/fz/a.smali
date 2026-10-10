.class public final Lfz/a;
.super Ljava/lang/Object;
.source "BizControlIssue.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u001a\'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u0013\u0010\t\u001a\u00020\u0008*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "",
        "throwable",
        "",
        "msg",
        "source",
        "",
        "a",
        "(Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)V",
        "",
        "b",
        "(Ljava/lang/Throwable;)Z",
        "biz-control-core_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p0    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "throwable"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "msg"

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string v0, "source"

    .line 13
    .line 14
    .line 15
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-static {p0}, Lfz/a;->b(Ljava/lang/Throwable;)Z

    .line 19
    move-result v0

    .line 20
    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 25
    move-result-object v0

    .line 26
    const/4 v1, 0x1

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    .line 31
    invoke-static {v0}, Lfz/a;->b(Ljava/lang/Throwable;)Z

    .line 32
    move-result v0

    .line 33
    .line 34
    if-ne v0, v1, :cond_0

    .line 35
    return-void

    .line 36
    .line 37
    .line 38
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 39
    move-result-object v0

    .line 40
    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 45
    move-result-object v0

    .line 46
    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    .line 50
    invoke-static {v0}, Lfz/a;->b(Ljava/lang/Throwable;)Z

    .line 51
    move-result v0

    .line 52
    .line 53
    if-ne v0, v1, :cond_1

    .line 54
    return-void

    .line 55
    .line 56
    :cond_1
    new-instance v0, Lcom/kubi/sdk/lib/kucoin/biz/control/internal/monitor/BizControlException;

    .line 57
    const/4 v1, 0x0

    .line 58
    .line 59
    .line 60
    invoke-direct {v0, p0, p2, v1, p1}, Lcom/kubi/sdk/lib/kucoin/biz/control/internal/monitor/BizControlException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;)V

    .line 61
    const/4 p0, 0x2

    .line 62
    const/4 p1, 0x0

    .line 63
    .line 64
    .line 65
    invoke-static {v0, p1, p0, p1}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 66
    :cond_2
    return-void
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
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
.end method

.method public static final b(Ljava/lang/Throwable;)Z
    .locals 5
    .param p0    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    instance-of v0, p0, Ljava/net/SocketException;

    .line 8
    const/4 v1, 0x1

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    return v1

    .line 12
    .line 13
    :cond_0
    instance-of v0, p0, Ljava/net/UnknownHostException;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    return v1

    .line 17
    .line 18
    :cond_1
    instance-of v0, p0, Ljava/net/SocketTimeoutException;

    .line 19
    .line 20
    if-eqz v0, :cond_2

    .line 21
    return v1

    .line 22
    .line 23
    :cond_2
    instance-of v0, p0, Ljavax/net/ssl/SSLException;

    .line 24
    .line 25
    if-eqz v0, :cond_3

    .line 26
    return v1

    .line 27
    .line 28
    :cond_3
    instance-of v0, p0, Lokhttp3/internal/http2/ConnectionShutdownException;

    .line 29
    .line 30
    if-eqz v0, :cond_4

    .line 31
    return v1

    .line 32
    .line 33
    :cond_4
    instance-of v0, p0, Lretrofit2/HttpException;

    .line 34
    .line 35
    if-eqz v0, :cond_5

    .line 36
    return v1

    .line 37
    .line 38
    :cond_5
    instance-of v0, p0, Ljava/lang/SecurityException;

    .line 39
    const/4 v2, 0x0

    .line 40
    const/4 v3, 0x2

    .line 41
    const/4 v4, 0x0

    .line 42
    .line 43
    if-eqz v0, :cond_7

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 47
    move-result-object p0

    .line 48
    .line 49
    if-eqz p0, :cond_6

    .line 50
    .line 51
    const-string v0, "Package android does not belong to"

    .line 52
    .line 53
    .line 54
    invoke-static {p0, v0, v4, v3, v2}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 55
    move-result p0

    .line 56
    return p0

    .line 57
    :cond_6
    return v4

    .line 58
    .line 59
    :cond_7
    instance-of v0, p0, Lcom/kubi/network/retrofit/exception/ApiException;

    .line 60
    .line 61
    if-eqz v0, :cond_9

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 65
    move-result-object p0

    .line 66
    .line 67
    if-eqz p0, :cond_8

    .line 68
    .line 69
    const-string v0, "Sorry! Your IP is from restricted area"

    .line 70
    .line 71
    .line 72
    invoke-static {p0, v0, v4, v3, v2}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 73
    move-result p0

    .line 74
    return p0

    .line 75
    :cond_8
    return v4

    .line 76
    .line 77
    :cond_9
    instance-of v0, p0, Ljava/io/InterruptedIOException;

    .line 78
    .line 79
    if-eqz v0, :cond_a

    .line 80
    return v1

    .line 81
    .line 82
    :cond_a
    instance-of v0, p0, Ljava/io/IOException;

    .line 83
    .line 84
    if-eqz v0, :cond_11

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 88
    move-result-object p0

    .line 89
    .line 90
    if-eqz p0, :cond_11

    .line 91
    .line 92
    const-string v0, "Required SETTINGS preface not received"

    .line 93
    .line 94
    .line 95
    invoke-static {p0, v0, v4, v3, v2}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 96
    move-result v0

    .line 97
    .line 98
    if-eqz v0, :cond_b

    .line 99
    return v1

    .line 100
    .line 101
    :cond_b
    const-string v0, "Unexpected response code for CONNECT"

    .line 102
    .line 103
    .line 104
    invoke-static {p0, v0, v4, v3, v2}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 105
    move-result v0

    .line 106
    .line 107
    if-eqz v0, :cond_c

    .line 108
    return v1

    .line 109
    .line 110
    :cond_c
    const-string v0, "exhausted all routes"

    .line 111
    .line 112
    .line 113
    invoke-static {p0, v0, v4, v3, v2}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 114
    move-result v0

    .line 115
    .line 116
    if-eqz v0, :cond_d

    .line 117
    return v1

    .line 118
    .line 119
    :cond_d
    const-string v0, "unexpected end of stream"

    .line 120
    .line 121
    .line 122
    invoke-static {p0, v0, v4, v3, v2}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 123
    move-result v0

    .line 124
    .line 125
    if-eqz v0, :cond_e

    .line 126
    return v1

    .line 127
    .line 128
    :cond_e
    const-string v0, "stream was reset: CANCEL"

    .line 129
    .line 130
    .line 131
    invoke-static {p0, v0, v4, v3, v2}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 132
    move-result v0

    .line 133
    .line 134
    if-eqz v0, :cond_f

    .line 135
    return v1

    .line 136
    .line 137
    :cond_f
    const-string v0, "Software caused connection abort"

    .line 138
    .line 139
    .line 140
    invoke-static {p0, v0, v4, v3, v2}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 141
    move-result v0

    .line 142
    .line 143
    if-eqz v0, :cond_10

    .line 144
    return v1

    .line 145
    .line 146
    :cond_10
    const-string v0, "closed"

    .line 147
    .line 148
    .line 149
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 150
    move-result p0

    .line 151
    .line 152
    if-eqz p0, :cond_11

    .line 153
    return v1

    .line 154
    :cond_11
    return v4
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
