.class public final Lcom/tencent/bugly/proguard/pd$d$a;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Lokhttp3/Interceptor;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/bugly/proguard/pd$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field public a:Z

.field public final synthetic b:Lcom/tencent/bugly/proguard/pd$d;


# direct methods
.method public constructor <init>(Lcom/tencent/bugly/proguard/pd$d;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/bugly/proguard/pd$d$a;->b:Lcom/tencent/bugly/proguard/pd$d;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/pd$d$a;->b:Lcom/tencent/bugly/proguard/pd$d;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/tencent/bugly/proguard/pd$d;->a(Lcom/tencent/bugly/proguard/pd$d;)Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    monitor-enter v0

    .line 8
    const/4 v1, 0x1

    .line 9
    .line 10
    :try_start_0
    iput-boolean v1, p0, Lcom/tencent/bugly/proguard/pd$d$a;->a:Z

    .line 11
    .line 12
    iget-object v1, p0, Lcom/tencent/bugly/proguard/pd$d$a;->b:Lcom/tencent/bugly/proguard/pd$d;

    .line 13
    .line 14
    iget-object v1, v1, Lcom/tencent/bugly/proguard/pd$d;->h:Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    .line 18
    monitor-exit v0

    .line 19
    return-void

    .line 20
    :catchall_0
    move-exception v1

    .line 21
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    throw v1
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
.end method

.method public intercept(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-interface {p1}, Lokhttp3/Interceptor$Chain;->request()Lokhttp3/Request;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget-object v1, p0, Lcom/tencent/bugly/proguard/pd$d$a;->b:Lcom/tencent/bugly/proguard/pd$d;

    .line 7
    .line 8
    .line 9
    invoke-static {v1}, Lcom/tencent/bugly/proguard/pd$d;->a(Lcom/tencent/bugly/proguard/pd$d;)Ljava/lang/Object;

    .line 10
    move-result-object v1

    .line 11
    monitor-enter v1

    .line 12
    .line 13
    :try_start_0
    iget-object v2, p0, Lcom/tencent/bugly/proguard/pd$d$a;->b:Lcom/tencent/bugly/proguard/pd$d;

    .line 14
    const/4 v3, 0x0

    .line 15
    .line 16
    iput-boolean v3, v2, Lcom/tencent/bugly/proguard/pd$d;->l:Z

    .line 17
    .line 18
    .line 19
    invoke-interface {p1}, Lokhttp3/Interceptor$Chain;->connection()Lokhttp3/Connection;

    .line 20
    move-result-object v3

    .line 21
    .line 22
    .line 23
    invoke-interface {v3}, Lokhttp3/Connection;->route()Lokhttp3/Route;

    .line 24
    move-result-object v3

    .line 25
    .line 26
    .line 27
    invoke-virtual {v3}, Lokhttp3/Route;->proxy()Ljava/net/Proxy;

    .line 28
    move-result-object v3

    .line 29
    .line 30
    iput-object v3, v2, Lcom/tencent/bugly/proguard/pd$d;->m:Ljava/net/Proxy;

    .line 31
    .line 32
    iget-object v2, p0, Lcom/tencent/bugly/proguard/pd$d$a;->b:Lcom/tencent/bugly/proguard/pd$d;

    .line 33
    .line 34
    .line 35
    invoke-interface {p1}, Lokhttp3/Interceptor$Chain;->connection()Lokhttp3/Connection;

    .line 36
    move-result-object v3

    .line 37
    .line 38
    .line 39
    invoke-interface {v3}, Lokhttp3/Connection;->handshake()Lokhttp3/Handshake;

    .line 40
    move-result-object v3

    .line 41
    .line 42
    iput-object v3, v2, Lcom/tencent/bugly/proguard/pd$d;->n:Lokhttp3/Handshake;

    .line 43
    .line 44
    iget-object v2, p0, Lcom/tencent/bugly/proguard/pd$d$a;->b:Lcom/tencent/bugly/proguard/pd$d;

    .line 45
    .line 46
    iget-object v2, v2, Lcom/tencent/bugly/proguard/pd$d;->h:Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    :goto_0
    :try_start_1
    iget-boolean v2, p0, Lcom/tencent/bugly/proguard/pd$d$a;->a:Z

    .line 52
    .line 53
    if-nez v2, :cond_0

    .line 54
    .line 55
    iget-object v2, p0, Lcom/tencent/bugly/proguard/pd$d$a;->b:Lcom/tencent/bugly/proguard/pd$d;

    .line 56
    .line 57
    iget-object v2, v2, Lcom/tencent/bugly/proguard/pd$d;->h:Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 61
    goto :goto_0

    .line 62
    :catchall_0
    move-exception p1

    .line 63
    goto :goto_1

    .line 64
    :cond_0
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Lokhttp3/Request;->body()Lokhttp3/RequestBody;

    .line 68
    move-result-object v1

    .line 69
    .line 70
    instance-of v1, v1, Lcom/tencent/bugly/proguard/pd$f;

    .line 71
    .line 72
    if-eqz v1, :cond_1

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Lokhttp3/Request;->body()Lokhttp3/RequestBody;

    .line 76
    move-result-object v1

    .line 77
    .line 78
    check-cast v1, Lcom/tencent/bugly/proguard/pd$f;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1, v0}, Lcom/tencent/bugly/proguard/pd$f;->a(Lokhttp3/Request;)Lokhttp3/Request;

    .line 82
    move-result-object v0

    .line 83
    .line 84
    .line 85
    :cond_1
    invoke-interface {p1, v0}, Lokhttp3/Interceptor$Chain;->proceed(Lokhttp3/Request;)Lokhttp3/Response;

    .line 86
    move-result-object p1

    .line 87
    .line 88
    iget-object v0, p0, Lcom/tencent/bugly/proguard/pd$d$a;->b:Lcom/tencent/bugly/proguard/pd$d;

    .line 89
    .line 90
    iget-object v0, v0, Lcom/tencent/bugly/proguard/pd$d;->h:Ljava/lang/Object;

    .line 91
    monitor-enter v0

    .line 92
    .line 93
    :try_start_3
    iget-object v1, p0, Lcom/tencent/bugly/proguard/pd$d$a;->b:Lcom/tencent/bugly/proguard/pd$d;

    .line 94
    .line 95
    iput-object p1, v1, Lcom/tencent/bugly/proguard/pd$d;->k:Lokhttp3/Response;

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1}, Lokhttp3/Response;->request()Lokhttp3/Request;

    .line 99
    move-result-object v2

    .line 100
    .line 101
    .line 102
    invoke-virtual {v2}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    .line 103
    move-result-object v2

    .line 104
    .line 105
    .line 106
    invoke-virtual {v2}, Lokhttp3/HttpUrl;->url()Ljava/net/URL;

    .line 107
    move-result-object v2

    .line 108
    .line 109
    .line 110
    invoke-static {v1, v2}, Lcom/tencent/bugly/proguard/pd$d;->a(Lcom/tencent/bugly/proguard/pd$d;Ljava/net/URL;)Ljava/net/URL;

    .line 111
    monitor-exit v0

    .line 112
    return-object p1

    .line 113
    :catchall_1
    move-exception p1

    .line 114
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 115
    throw p1

    .line 116
    .line 117
    .line 118
    :catch_0
    :try_start_4
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 119
    move-result-object p1

    .line 120
    .line 121
    .line 122
    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    .line 123
    .line 124
    new-instance p1, Ljava/io/InterruptedIOException;

    .line 125
    .line 126
    .line 127
    invoke-direct {p1}, Ljava/io/InterruptedIOException;-><init>()V

    .line 128
    throw p1

    .line 129
    :goto_1
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 130
    throw p1
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
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
.end method
