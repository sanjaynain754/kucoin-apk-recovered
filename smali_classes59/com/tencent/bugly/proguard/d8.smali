.class public Lcom/tencent/bugly/proguard/d8;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static final M:I = 0x0

.field public static final N:I = -0x1

.field public static final O:I = -0x2

.field public static final P:Ljava/lang/String; = "RMonitor_net_quality_event"

.field public static final Q:Z

.field public static final R:Lcom/tencent/bugly/proguard/p4;


# instance fields
.field public A:Ljava/lang/String;

.field public B:Z

.field public C:J

.field public D:J

.field public E:Z

.field public F:J

.field public G:J

.field public H:I

.field public I:Ljava/lang/String;

.field public J:J

.field public K:J

.field public final L:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field public a:J

.field public b:J

.field public c:J

.field public d:Ljava/lang/String;

.field public e:I

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/Exception;

.field public h:J

.field public i:Z

.field public j:I

.field public k:J

.field public l:I

.field public m:I

.field public n:Ljava/lang/String;

.field public o:I

.field public p:Ljava/lang/String;

.field public q:I

.field public r:I

.field public s:J

.field public t:I

.field public u:Z

.field public v:Ljava/lang/String;

.field public w:Ljava/lang/String;

.field public x:Ljava/lang/String;

.field public y:Ljava/lang/String;

.field public z:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/bugly/proguard/p4;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/p4;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/tencent/bugly/proguard/d8;->R:Lcom/tencent/bugly/proguard/p4;

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
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/d8;->a:J

    .line 8
    .line 9
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/d8;->b:J

    .line 10
    .line 11
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/d8;->c:J

    .line 12
    const/4 v2, 0x0

    .line 13
    .line 14
    iput-object v2, p0, Lcom/tencent/bugly/proguard/d8;->d:Ljava/lang/String;

    .line 15
    const/4 v3, 0x0

    .line 16
    .line 17
    iput v3, p0, Lcom/tencent/bugly/proguard/d8;->e:I

    .line 18
    .line 19
    iput-object v2, p0, Lcom/tencent/bugly/proguard/d8;->f:Ljava/lang/String;

    .line 20
    .line 21
    iput-object v2, p0, Lcom/tencent/bugly/proguard/d8;->g:Ljava/lang/Exception;

    .line 22
    .line 23
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/d8;->h:J

    .line 24
    .line 25
    iput-boolean v3, p0, Lcom/tencent/bugly/proguard/d8;->i:Z

    .line 26
    .line 27
    iput v3, p0, Lcom/tencent/bugly/proguard/d8;->j:I

    .line 28
    .line 29
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/d8;->k:J

    .line 30
    .line 31
    iput v3, p0, Lcom/tencent/bugly/proguard/d8;->l:I

    .line 32
    .line 33
    iput v3, p0, Lcom/tencent/bugly/proguard/d8;->m:I

    .line 34
    .line 35
    iput-object v2, p0, Lcom/tencent/bugly/proguard/d8;->n:Ljava/lang/String;

    .line 36
    .line 37
    iput v3, p0, Lcom/tencent/bugly/proguard/d8;->o:I

    .line 38
    .line 39
    iput-object v2, p0, Lcom/tencent/bugly/proguard/d8;->p:Ljava/lang/String;

    .line 40
    .line 41
    iput v3, p0, Lcom/tencent/bugly/proguard/d8;->q:I

    .line 42
    .line 43
    iput v3, p0, Lcom/tencent/bugly/proguard/d8;->r:I

    .line 44
    .line 45
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/d8;->s:J

    .line 46
    .line 47
    iput v3, p0, Lcom/tencent/bugly/proguard/d8;->t:I

    .line 48
    .line 49
    iput-boolean v3, p0, Lcom/tencent/bugly/proguard/d8;->u:Z

    .line 50
    .line 51
    iput-object v2, p0, Lcom/tencent/bugly/proguard/d8;->v:Ljava/lang/String;

    .line 52
    .line 53
    iput-object v2, p0, Lcom/tencent/bugly/proguard/d8;->w:Ljava/lang/String;

    .line 54
    .line 55
    iput-object v2, p0, Lcom/tencent/bugly/proguard/d8;->x:Ljava/lang/String;

    .line 56
    .line 57
    iput-object v2, p0, Lcom/tencent/bugly/proguard/d8;->y:Ljava/lang/String;

    .line 58
    .line 59
    iput-object v2, p0, Lcom/tencent/bugly/proguard/d8;->z:Ljava/lang/String;

    .line 60
    .line 61
    iput-object v2, p0, Lcom/tencent/bugly/proguard/d8;->A:Ljava/lang/String;

    .line 62
    .line 63
    iput-boolean v3, p0, Lcom/tencent/bugly/proguard/d8;->B:Z

    .line 64
    .line 65
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/d8;->C:J

    .line 66
    .line 67
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/d8;->D:J

    .line 68
    .line 69
    iput-boolean v3, p0, Lcom/tencent/bugly/proguard/d8;->E:Z

    .line 70
    .line 71
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/d8;->F:J

    .line 72
    .line 73
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/d8;->G:J

    .line 74
    .line 75
    iput v3, p0, Lcom/tencent/bugly/proguard/d8;->H:I

    .line 76
    .line 77
    iput-object v2, p0, Lcom/tencent/bugly/proguard/d8;->I:Ljava/lang/String;

    .line 78
    .line 79
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/d8;->J:J

    .line 80
    .line 81
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/d8;->K:J

    .line 82
    .line 83
    new-instance v0, Ljava/util/HashMap;

    .line 84
    .line 85
    .line 86
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 87
    .line 88
    iput-object v0, p0, Lcom/tencent/bugly/proguard/d8;->L:Ljava/util/HashMap;

    .line 89
    .line 90
    .line 91
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 92
    move-result-wide v0

    .line 93
    .line 94
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/d8;->a:J

    .line 95
    .line 96
    .line 97
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 98
    move-result-wide v0

    .line 99
    .line 100
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/d8;->b:J

    .line 101
    .line 102
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/d8;->c:J

    .line 103
    .line 104
    const-string v0, "callStart"

    .line 105
    .line 106
    iput-object v0, p0, Lcom/tencent/bugly/proguard/d8;->d:Ljava/lang/String;

    .line 107
    return-void
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
.end method

.method public static b()Lcom/tencent/bugly/proguard/d8;
    .locals 1

    .line 7
    new-instance v0, Lcom/tencent/bugly/proguard/d8;

    invoke-direct {v0}, Lcom/tencent/bugly/proguard/d8;-><init>()V

    return-object v0
.end method


# virtual methods
.method public final a(JJ)J
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p3, v0

    if-nez v2, :cond_0

    return-wide v0

    .line 1
    :cond_0
    div-long/2addr p1, p3

    return-wide p1
.end method

.method public final a(Ljava/net/InetAddress;)Ljava/lang/String;
    .locals 0

    if-eqz p1, :cond_0

    .line 72
    invoke-virtual {p1}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const-string p1, ""

    return-object p1
.end method

.method public a(ILjava/lang/String;Ljava/io/IOException;)V
    .locals 1

    .line 59
    iget v0, p0, Lcom/tencent/bugly/proguard/d8;->e:I

    if-eqz v0, :cond_0

    return-void

    .line 60
    :cond_0
    iput p1, p0, Lcom/tencent/bugly/proguard/d8;->e:I

    .line 61
    iput-object p3, p0, Lcom/tencent/bugly/proguard/d8;->g:Ljava/lang/Exception;

    if-eqz p3, :cond_1

    .line 62
    invoke-virtual {p3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/bugly/proguard/d8;->f:Ljava/lang/String;

    return-void

    .line 63
    :cond_1
    iput-object p2, p0, Lcom/tencent/bugly/proguard/d8;->f:Ljava/lang/String;

    return-void
.end method

.method public a(J)V
    .locals 5

    .line 44
    const-string/jumbo v0, "requestHeadersStart"

    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/d8;->c(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    .line 45
    const-string/jumbo v1, "requestBodyEnd"

    invoke-virtual {p0, v1}, Lcom/tencent/bugly/proguard/d8;->c(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v1

    .line 46
    invoke-virtual {p0, v1, v0}, Lcom/tencent/bugly/proguard/d8;->a(Ljava/lang/Long;Ljava/lang/Long;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 47
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    sub-long/2addr v1, v3

    iput-wide v1, p0, Lcom/tencent/bugly/proguard/d8;->D:J

    .line 48
    :cond_0
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/d8;->C:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/d8;->C:J

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 3

    .line 55
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 56
    :cond_0
    iput-object p1, p0, Lcom/tencent/bugly/proguard/d8;->d:Ljava/lang/String;

    .line 57
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/d8;->c:J

    .line 58
    iget-object p1, p0, Lcom/tencent/bugly/proguard/d8;->L:Ljava/util/HashMap;

    iget-object v2, p0, Lcom/tencent/bugly/proguard/d8;->d:Ljava/lang/String;

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/io/IOException;)V
    .locals 5

    .line 6
    const-string v0, "callStart"

    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/d8;->c(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    .line 7
    const-string v1, "callEnd"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const-string v2, "callFailed"

    if-nez v1, :cond_1

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 8
    :cond_0
    iget-wide v3, p0, Lcom/tencent/bugly/proguard/d8;->c:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    goto :goto_1

    .line 9
    :cond_1
    :goto_0
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/d8;->c(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v1

    .line 10
    :goto_1
    invoke-virtual {p0, v1, v0}, Lcom/tencent/bugly/proguard/d8;->a(Ljava/lang/Long;Ljava/lang/Long;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 11
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    sub-long/2addr v3, v0

    iput-wide v3, p0, Lcom/tencent/bugly/proguard/d8;->h:J

    .line 12
    :cond_2
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    .line 13
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/d8;->i:Z

    const/4 p1, -0x1

    .line 14
    invoke-virtual {p0, p1, v2, p2}, Lcom/tencent/bugly/proguard/d8;->a(ILjava/lang/String;Ljava/io/IOException;)V

    return-void

    .line 15
    :cond_3
    iget p1, p0, Lcom/tencent/bugly/proguard/d8;->H:I

    const/16 v1, 0xc8

    if-lt p1, v1, :cond_4

    const/16 v1, 0x12c

    if-ge p1, v1, :cond_4

    const/4 p1, 0x1

    goto :goto_2

    :cond_4
    move p1, v0

    :goto_2
    iput-boolean p1, p0, Lcom/tencent/bugly/proguard/d8;->i:Z

    .line 16
    iget-boolean p1, p0, Lcom/tencent/bugly/proguard/d8;->u:Z

    if-eqz p1, :cond_5

    .line 17
    const-string p1, "cancel"

    invoke-virtual {p0, v0, p1, p2}, Lcom/tencent/bugly/proguard/d8;->a(ILjava/lang/String;Ljava/io/IOException;)V

    :cond_5
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 18
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/tencent/bugly/proguard/d8;->x:Ljava/lang/String;

    invoke-static {p1, p2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 19
    :cond_0
    iput-object p2, p0, Lcom/tencent/bugly/proguard/d8;->x:Ljava/lang/String;

    :cond_1
    :goto_0
    return-void
.end method

.method public a(Ljava/lang/String;Lokhttp3/Request;)V
    .locals 1

    if-nez p2, :cond_0

    goto :goto_0

    .line 36
    :cond_0
    invoke-virtual {p2}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 37
    :cond_1
    :try_start_0
    invoke-virtual {p2}, Lokhttp3/Request;->method()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/tencent/bugly/proguard/d8;->w:Ljava/lang/String;

    .line 38
    invoke-virtual {v0}, Lokhttp3/HttpUrl;->isHttps()Z

    move-result p2

    iput-boolean p2, p0, Lcom/tencent/bugly/proguard/d8;->B:Z

    .line 39
    invoke-virtual {v0}, Lokhttp3/HttpUrl;->host()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/tencent/bugly/proguard/d8;->x:Ljava/lang/String;

    .line 40
    invoke-virtual {v0}, Lokhttp3/HttpUrl;->encodedPath()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/tencent/bugly/proguard/d8;->y:Ljava/lang/String;

    .line 41
    invoke-virtual {v0}, Lokhttp3/HttpUrl;->encodedQuery()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/tencent/bugly/proguard/d8;->z:Ljava/lang/String;

    .line 42
    const-string p2, "callStart"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 43
    invoke-virtual {v0}, Lokhttp3/HttpUrl;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/bugly/proguard/d8;->v:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_2
    :goto_0
    return-void
.end method

.method public a(Lokhttp3/Connection;)V
    .locals 1

    .line 30
    iget v0, p0, Lcom/tencent/bugly/proguard/d8;->t:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/tencent/bugly/proguard/d8;->t:I

    if-nez p1, :cond_0

    goto :goto_0

    .line 31
    :cond_0
    invoke-interface {p1}, Lokhttp3/Connection;->socket()Ljava/net/Socket;

    move-result-object p1

    if-nez p1, :cond_1

    :goto_0
    return-void

    .line 32
    :cond_1
    invoke-virtual {p1}, Ljava/net/Socket;->getInetAddress()Ljava/net/InetAddress;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/d8;->a(Ljava/net/InetAddress;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/bugly/proguard/d8;->n:Ljava/lang/String;

    .line 33
    invoke-virtual {p1}, Ljava/net/Socket;->getPort()I

    move-result v0

    iput v0, p0, Lcom/tencent/bugly/proguard/d8;->o:I

    .line 34
    invoke-virtual {p1}, Ljava/net/Socket;->getLocalAddress()Ljava/net/InetAddress;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/d8;->a(Ljava/net/InetAddress;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/bugly/proguard/d8;->p:Ljava/lang/String;

    .line 35
    invoke-virtual {p1}, Ljava/net/Socket;->getLocalPort()I

    move-result p1

    iput p1, p0, Lcom/tencent/bugly/proguard/d8;->q:I

    return-void
.end method

.method public a(Lokhttp3/Response;)V
    .locals 1

    if-nez p1, :cond_0

    goto :goto_0

    .line 49
    :cond_0
    invoke-virtual {p1}, Lokhttp3/Response;->code()I

    move-result v0

    iput v0, p0, Lcom/tencent/bugly/proguard/d8;->H:I

    .line 50
    invoke-virtual {p1}, Lokhttp3/Response;->isSuccessful()Z

    move-result v0

    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/d8;->i:Z

    .line 51
    invoke-virtual {p1}, Lokhttp3/Response;->message()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/bugly/proguard/d8;->I:Ljava/lang/String;

    .line 52
    invoke-virtual {p1}, Lokhttp3/Response;->isRedirect()Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    .line 53
    iput-boolean p1, p0, Lcom/tencent/bugly/proguard/d8;->E:Z

    :cond_1
    :goto_0
    return-void
.end method

.method public a(ZLjava/net/InetSocketAddress;Lokhttp3/Protocol;Ljava/io/IOException;)V
    .locals 6

    .line 20
    const-string v0, "connectStart"

    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/d8;->c(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    const-string v1, "connectFailed"

    if-eqz p1, :cond_0

    move-object v2, v1

    goto :goto_0

    .line 21
    :cond_0
    const-string v2, "connectEnd"

    :goto_0
    invoke-virtual {p0, v2}, Lcom/tencent/bugly/proguard/d8;->c(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v2

    .line 22
    invoke-virtual {p0, v2, v0}, Lcom/tencent/bugly/proguard/d8;->a(Ljava/lang/Long;Ljava/lang/Long;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 23
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    sub-long/2addr v2, v4

    .line 24
    iget v0, p0, Lcom/tencent/bugly/proguard/d8;->l:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/tencent/bugly/proguard/d8;->l:I

    .line 25
    iget v0, p0, Lcom/tencent/bugly/proguard/d8;->m:I

    int-to-long v4, v0

    add-long/2addr v4, v2

    long-to-int v0, v4

    iput v0, p0, Lcom/tencent/bugly/proguard/d8;->m:I

    :cond_1
    if-eqz p3, :cond_2

    .line 26
    invoke-virtual {p3}, Lokhttp3/Protocol;->toString()Ljava/lang/String;

    move-result-object p3

    iput-object p3, p0, Lcom/tencent/bugly/proguard/d8;->A:Ljava/lang/String;

    :cond_2
    if-eqz p2, :cond_3

    .line 27
    invoke-virtual {p2}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    move-result-object p3

    invoke-virtual {p0, p3}, Lcom/tencent/bugly/proguard/d8;->a(Ljava/net/InetAddress;)Ljava/lang/String;

    move-result-object p3

    iput-object p3, p0, Lcom/tencent/bugly/proguard/d8;->n:Ljava/lang/String;

    .line 28
    invoke-virtual {p2}, Ljava/net/InetSocketAddress;->getPort()I

    move-result p2

    iput p2, p0, Lcom/tencent/bugly/proguard/d8;->o:I

    :cond_3
    if-eqz p1, :cond_4

    const/4 p1, -0x2

    .line 29
    invoke-virtual {p0, p1, v1, p4}, Lcom/tencent/bugly/proguard/d8;->a(ILjava/lang/String;Ljava/io/IOException;)V

    :cond_4
    return-void
.end method

.method public final a()Z
    .locals 2

    .line 2
    iget v0, p0, Lcom/tencent/bugly/proguard/d8;->j:I

    const/4 v1, 0x0

    if-lez v0, :cond_0

    return v1

    .line 3
    :cond_0
    iget v0, p0, Lcom/tencent/bugly/proguard/d8;->l:I

    if-lez v0, :cond_1

    return v1

    .line 4
    :cond_1
    iget v0, p0, Lcom/tencent/bugly/proguard/d8;->r:I

    if-lez v0, :cond_2

    return v1

    .line 5
    :cond_2
    iget v0, p0, Lcom/tencent/bugly/proguard/d8;->t:I

    if-lez v0, :cond_3

    const/4 v0, 0x1

    return v0

    :cond_3
    return v1
.end method

.method public a(JLcom/tencent/bugly/proguard/jd;)Z
    .locals 3
    .param p3    # Lcom/tencent/bugly/proguard/jd;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 64
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/d8;->c:J

    cmp-long v2, p1, v0

    if-gez v2, :cond_0

    .line 65
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p1

    iget-wide v0, p0, Lcom/tencent/bugly/proguard/d8;->c:J

    :cond_0
    sub-long/2addr p1, v0

    .line 66
    iget v0, p0, Lcom/tencent/bugly/proguard/d8;->H:I

    if-nez v0, :cond_1

    .line 67
    iget-wide v0, p3, Lcom/tencent/bugly/proguard/jd;->p:J

    cmp-long p1, p1, v0

    if-ltz p1, :cond_5

    goto :goto_0

    :cond_1
    const/16 v1, 0x190

    if-lt v0, v1, :cond_2

    .line 68
    iget-wide v0, p3, Lcom/tencent/bugly/proguard/jd;->o:J

    cmp-long p1, p1, v0

    if-ltz p1, :cond_5

    goto :goto_0

    :cond_2
    const/16 v1, 0xcc

    if-ne v0, v1, :cond_3

    .line 69
    iget-wide v0, p3, Lcom/tencent/bugly/proguard/jd;->o:J

    cmp-long p1, p1, v0

    if-ltz p1, :cond_5

    goto :goto_0

    :cond_3
    const/16 v1, 0xc8

    if-lt v0, v1, :cond_4

    const/16 v1, 0x12c

    if-ge v0, v1, :cond_4

    .line 70
    iget-wide v0, p3, Lcom/tencent/bugly/proguard/jd;->n:J

    cmp-long p1, p1, v0

    if-ltz p1, :cond_5

    goto :goto_0

    .line 71
    :cond_4
    iget-wide v0, p3, Lcom/tencent/bugly/proguard/jd;->p:J

    cmp-long p1, p1, v0

    if-ltz p1, :cond_5

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_5
    const/4 p1, 0x0

    return p1
.end method

.method public a(Ljava/lang/Long;Ljava/lang/Long;)Z
    .locals 2

    if-eqz p2, :cond_0

    if-eqz p1, :cond_0

    .line 54
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    cmp-long p1, v0, p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final b(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    if-nez p1, :cond_0

    .line 1
    const-string p1, ""

    :cond_0
    return-object p1
.end method

.method public b(J)V
    .locals 5

    .line 2
    const-string/jumbo v0, "responseHeadersStart"

    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/d8;->c(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    .line 3
    const-string/jumbo v1, "responseBodyEnd"

    invoke-virtual {p0, v1}, Lcom/tencent/bugly/proguard/d8;->c(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v1

    .line 4
    invoke-virtual {p0, v1, v0}, Lcom/tencent/bugly/proguard/d8;->a(Ljava/lang/Long;Ljava/lang/Long;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 5
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    sub-long/2addr v1, v3

    iput-wide v1, p0, Lcom/tencent/bugly/proguard/d8;->J:J

    .line 6
    :cond_0
    iput-wide p1, p0, Lcom/tencent/bugly/proguard/d8;->K:J

    return-void
.end method

.method public final c(Ljava/lang/String;)Ljava/lang/Long;
    .locals 1

    .line 8
    iget-object v0, p0, Lcom/tencent/bugly/proguard/d8;->L:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    return-object p1
.end method

.method public c()V
    .locals 6

    .line 1
    const-string/jumbo v0, "responseHeadersStart"

    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/d8;->c(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    .line 2
    const-string/jumbo v1, "requestBodyEnd"

    invoke-virtual {p0, v1}, Lcom/tencent/bugly/proguard/d8;->c(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v1

    .line 3
    invoke-virtual {p0, v0, v1}, Lcom/tencent/bugly/proguard/d8;->a(Ljava/lang/Long;Ljava/lang/Long;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 4
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    sub-long/2addr v2, v4

    iput-wide v2, p0, Lcom/tencent/bugly/proguard/d8;->F:J

    .line 5
    :cond_0
    const-string v1, "callStart"

    invoke-virtual {p0, v1}, Lcom/tencent/bugly/proguard/d8;->c(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v1

    .line 6
    invoke-virtual {p0, v0, v1}, Lcom/tencent/bugly/proguard/d8;->a(Ljava/lang/Long;Ljava/lang/Long;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 7
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    sub-long/2addr v2, v0

    iput-wide v2, p0, Lcom/tencent/bugly/proguard/d8;->G:J

    :cond_1
    return-void
.end method

.method public d()V
    .locals 5

    .line 8
    const-string/jumbo v0, "secureConnectStart"

    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/d8;->c(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    .line 9
    const-string/jumbo v1, "secureConnectEnd"

    invoke-virtual {p0, v1}, Lcom/tencent/bugly/proguard/d8;->c(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v1

    .line 10
    invoke-virtual {p0, v1, v0}, Lcom/tencent/bugly/proguard/d8;->a(Ljava/lang/Long;Ljava/lang/Long;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 11
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    sub-long/2addr v1, v3

    .line 12
    iget v0, p0, Lcom/tencent/bugly/proguard/d8;->r:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/tencent/bugly/proguard/d8;->r:I

    .line 13
    iget-wide v3, p0, Lcom/tencent/bugly/proguard/d8;->s:J

    add-long/2addr v3, v1

    iput-wide v3, p0, Lcom/tencent/bugly/proguard/d8;->s:J

    :cond_0
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 6

    .line 1
    const-string v0, "dnsStart"

    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/d8;->c(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    .line 2
    const-string v1, "dnsEnd"

    invoke-virtual {p0, v1}, Lcom/tencent/bugly/proguard/d8;->c(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v2

    .line 3
    invoke-virtual {p0, v2, v0}, Lcom/tencent/bugly/proguard/d8;->a(Ljava/lang/Long;Ljava/lang/Long;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 4
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    sub-long/2addr v2, v4

    .line 5
    iget v0, p0, Lcom/tencent/bugly/proguard/d8;->j:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/tencent/bugly/proguard/d8;->j:I

    .line 6
    iget-wide v4, p0, Lcom/tencent/bugly/proguard/d8;->k:J

    add-long/2addr v4, v2

    iput-wide v4, p0, Lcom/tencent/bugly/proguard/d8;->k:J

    .line 7
    :cond_0
    invoke-virtual {p0, v1, p1}, Lcom/tencent/bugly/proguard/d8;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public e()Lcom/tencent/bugly/proguard/z7;
    .locals 7

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/bugly/proguard/z7;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/z7;-><init>()V

    .line 6
    .line 7
    iget-wide v1, p0, Lcom/tencent/bugly/proguard/d8;->a:J

    .line 8
    .line 9
    iput-wide v1, v0, Lcom/tencent/bugly/proguard/z7;->a:J

    .line 10
    .line 11
    iget-object v1, p0, Lcom/tencent/bugly/proguard/d8;->g:Ljava/lang/Exception;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    const/4 v1, 0x1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v1, 0x0

    .line 17
    .line 18
    :goto_0
    iput-boolean v1, v0, Lcom/tencent/bugly/proguard/z7;->h:Z

    .line 19
    .line 20
    .line 21
    :try_start_0
    invoke-static {v0}, Lcom/tencent/bugly/proguard/gd;->a(Lcom/tencent/bugly/proguard/z7;)V

    .line 22
    .line 23
    new-instance v1, Lorg/json/JSONObject;

    .line 24
    .line 25
    .line 26
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 27
    .line 28
    iput-object v1, v0, Lcom/tencent/bugly/proguard/z7;->m:Lorg/json/JSONObject;

    .line 29
    .line 30
    .line 31
    const-string/jumbo v2, "request_time_in_ms"

    .line 32
    .line 33
    iget-wide v3, v0, Lcom/tencent/bugly/proguard/z7;->a:J

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 37
    .line 38
    iget-object v1, v0, Lcom/tencent/bugly/proguard/z7;->m:Lorg/json/JSONObject;

    .line 39
    .line 40
    .line 41
    const-string/jumbo v2, "protocol"

    .line 42
    .line 43
    iget-object v3, p0, Lcom/tencent/bugly/proguard/d8;->A:Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v3}, Lcom/tencent/bugly/proguard/d8;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    move-result-object v3

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 51
    .line 52
    iget-object v1, v0, Lcom/tencent/bugly/proguard/z7;->m:Lorg/json/JSONObject;

    .line 53
    .line 54
    const-string v2, "is_https"

    .line 55
    .line 56
    iget-boolean v3, p0, Lcom/tencent/bugly/proguard/d8;->B:Z

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 60
    .line 61
    iget-object v1, v0, Lcom/tencent/bugly/proguard/z7;->m:Lorg/json/JSONObject;

    .line 62
    .line 63
    const-string v2, "host"

    .line 64
    .line 65
    iget-object v3, p0, Lcom/tencent/bugly/proguard/d8;->x:Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, v3}, Lcom/tencent/bugly/proguard/d8;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 69
    move-result-object v3

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 73
    .line 74
    iget-object v1, v0, Lcom/tencent/bugly/proguard/z7;->m:Lorg/json/JSONObject;

    .line 75
    .line 76
    .line 77
    const-string/jumbo v2, "path"

    .line 78
    .line 79
    iget-object v3, p0, Lcom/tencent/bugly/proguard/d8;->y:Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0, v3}, Lcom/tencent/bugly/proguard/d8;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 83
    move-result-object v3

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 87
    .line 88
    iget-object v1, v0, Lcom/tencent/bugly/proguard/z7;->m:Lorg/json/JSONObject;

    .line 89
    .line 90
    .line 91
    const-string/jumbo v2, "query_string"

    .line 92
    .line 93
    iget-object v3, p0, Lcom/tencent/bugly/proguard/d8;->z:Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0, v3}, Lcom/tencent/bugly/proguard/d8;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 97
    move-result-object v3

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 101
    .line 102
    iget-object v1, v0, Lcom/tencent/bugly/proguard/z7;->m:Lorg/json/JSONObject;

    .line 103
    .line 104
    .line 105
    const-string/jumbo v2, "original_url"

    .line 106
    .line 107
    iget-object v3, p0, Lcom/tencent/bugly/proguard/d8;->v:Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 111
    .line 112
    iget-object v1, v0, Lcom/tencent/bugly/proguard/z7;->m:Lorg/json/JSONObject;

    .line 113
    .line 114
    .line 115
    const-string/jumbo v2, "method"

    .line 116
    .line 117
    iget-object v3, p0, Lcom/tencent/bugly/proguard/d8;->w:Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    invoke-virtual {p0, v3}, Lcom/tencent/bugly/proguard/d8;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 121
    move-result-object v3

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 125
    .line 126
    iget-object v1, v0, Lcom/tencent/bugly/proguard/z7;->m:Lorg/json/JSONObject;

    .line 127
    .line 128
    .line 129
    const-string/jumbo v2, "stage"

    .line 130
    .line 131
    iget-object v3, v0, Lcom/tencent/bugly/proguard/z7;->l:Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    invoke-virtual {p0, v3}, Lcom/tencent/bugly/proguard/d8;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 135
    move-result-object v3

    .line 136
    .line 137
    .line 138
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 139
    .line 140
    iget-object v1, v0, Lcom/tencent/bugly/proguard/z7;->m:Lorg/json/JSONObject;

    .line 141
    .line 142
    const-string v2, "is_reuse_connection"

    .line 143
    .line 144
    .line 145
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/d8;->a()Z

    .line 146
    move-result v3

    .line 147
    .line 148
    .line 149
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 150
    .line 151
    iget-object v1, v0, Lcom/tencent/bugly/proguard/z7;->m:Lorg/json/JSONObject;

    .line 152
    .line 153
    const-string v2, "is_canceled"

    .line 154
    .line 155
    iget-boolean v3, p0, Lcom/tencent/bugly/proguard/d8;->u:Z

    .line 156
    .line 157
    .line 158
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 159
    .line 160
    iget-object v1, v0, Lcom/tencent/bugly/proguard/z7;->m:Lorg/json/JSONObject;

    .line 161
    .line 162
    const-string v2, "has_redirect"

    .line 163
    .line 164
    iget-boolean v3, p0, Lcom/tencent/bugly/proguard/d8;->E:Z

    .line 165
    .line 166
    .line 167
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 168
    .line 169
    iget-object v1, v0, Lcom/tencent/bugly/proguard/z7;->m:Lorg/json/JSONObject;

    .line 170
    .line 171
    .line 172
    const-string/jumbo v2, "status_code"

    .line 173
    .line 174
    iget v3, p0, Lcom/tencent/bugly/proguard/d8;->H:I

    .line 175
    .line 176
    .line 177
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 178
    .line 179
    iget-object v1, v0, Lcom/tencent/bugly/proguard/z7;->m:Lorg/json/JSONObject;

    .line 180
    .line 181
    .line 182
    const-string/jumbo v2, "result_code"

    .line 183
    .line 184
    iget v3, p0, Lcom/tencent/bugly/proguard/d8;->e:I

    .line 185
    .line 186
    .line 187
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 188
    .line 189
    iget-object v1, v0, Lcom/tencent/bugly/proguard/z7;->m:Lorg/json/JSONObject;

    .line 190
    .line 191
    .line 192
    const-string/jumbo v2, "total_cost_in_ms"

    .line 193
    .line 194
    iget-wide v3, p0, Lcom/tencent/bugly/proguard/d8;->h:J

    .line 195
    .line 196
    .line 197
    invoke-virtual {v1, v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 198
    .line 199
    iget-object v1, v0, Lcom/tencent/bugly/proguard/z7;->m:Lorg/json/JSONObject;

    .line 200
    .line 201
    const-string v2, "dns_cost_in_ms"

    .line 202
    .line 203
    iget-wide v3, p0, Lcom/tencent/bugly/proguard/d8;->k:J

    .line 204
    .line 205
    iget v5, p0, Lcom/tencent/bugly/proguard/d8;->j:I

    .line 206
    int-to-long v5, v5

    .line 207
    .line 208
    .line 209
    invoke-virtual {p0, v3, v4, v5, v6}, Lcom/tencent/bugly/proguard/d8;->a(JJ)J

    .line 210
    move-result-wide v3

    .line 211
    .line 212
    .line 213
    invoke-virtual {v1, v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 214
    .line 215
    iget-object v1, v0, Lcom/tencent/bugly/proguard/z7;->m:Lorg/json/JSONObject;

    .line 216
    .line 217
    .line 218
    const-string/jumbo v2, "tcp_cost_in_ms"

    .line 219
    .line 220
    iget v3, p0, Lcom/tencent/bugly/proguard/d8;->m:I

    .line 221
    int-to-long v3, v3

    .line 222
    .line 223
    iget v5, p0, Lcom/tencent/bugly/proguard/d8;->l:I

    .line 224
    int-to-long v5, v5

    .line 225
    .line 226
    .line 227
    invoke-virtual {p0, v3, v4, v5, v6}, Lcom/tencent/bugly/proguard/d8;->a(JJ)J

    .line 228
    move-result-wide v3

    .line 229
    .line 230
    .line 231
    invoke-virtual {v1, v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 232
    .line 233
    iget-object v1, v0, Lcom/tencent/bugly/proguard/z7;->m:Lorg/json/JSONObject;

    .line 234
    .line 235
    .line 236
    const-string/jumbo v2, "ssl_cost_in_ms"

    .line 237
    .line 238
    iget-wide v3, p0, Lcom/tencent/bugly/proguard/d8;->s:J

    .line 239
    .line 240
    iget v5, p0, Lcom/tencent/bugly/proguard/d8;->r:I

    .line 241
    int-to-long v5, v5

    .line 242
    .line 243
    .line 244
    invoke-virtual {p0, v3, v4, v5, v6}, Lcom/tencent/bugly/proguard/d8;->a(JJ)J

    .line 245
    move-result-wide v3

    .line 246
    .line 247
    .line 248
    invoke-virtual {v1, v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 249
    .line 250
    iget-object v1, v0, Lcom/tencent/bugly/proguard/z7;->m:Lorg/json/JSONObject;

    .line 251
    .line 252
    .line 253
    const-string/jumbo v2, "request_cost_in_ms"

    .line 254
    .line 255
    iget-wide v3, p0, Lcom/tencent/bugly/proguard/d8;->D:J

    .line 256
    .line 257
    .line 258
    invoke-virtual {v1, v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 259
    .line 260
    iget-object v1, v0, Lcom/tencent/bugly/proguard/z7;->m:Lorg/json/JSONObject;

    .line 261
    .line 262
    .line 263
    const-string/jumbo v2, "wait_cost_in_ms"

    .line 264
    .line 265
    iget-wide v3, p0, Lcom/tencent/bugly/proguard/d8;->F:J

    .line 266
    .line 267
    .line 268
    invoke-virtual {v1, v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 269
    .line 270
    iget-object v1, v0, Lcom/tencent/bugly/proguard/z7;->m:Lorg/json/JSONObject;

    .line 271
    .line 272
    .line 273
    const-string/jumbo v2, "response_cost_in_ms"

    .line 274
    .line 275
    iget-wide v3, p0, Lcom/tencent/bugly/proguard/d8;->J:J

    .line 276
    .line 277
    .line 278
    invoke-virtual {v1, v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 279
    .line 280
    iget-object v1, v0, Lcom/tencent/bugly/proguard/z7;->m:Lorg/json/JSONObject;

    .line 281
    .line 282
    const-string v2, "first_package_cost_in_ms"

    .line 283
    .line 284
    iget-wide v3, p0, Lcom/tencent/bugly/proguard/d8;->G:J

    .line 285
    .line 286
    .line 287
    invoke-virtual {v1, v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 288
    .line 289
    iget-object v1, v0, Lcom/tencent/bugly/proguard/z7;->m:Lorg/json/JSONObject;

    .line 290
    .line 291
    .line 292
    const-string/jumbo v2, "request_byte_count"

    .line 293
    .line 294
    iget-wide v3, p0, Lcom/tencent/bugly/proguard/d8;->C:J

    .line 295
    .line 296
    .line 297
    invoke-virtual {v1, v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 298
    .line 299
    iget-object v1, v0, Lcom/tencent/bugly/proguard/z7;->m:Lorg/json/JSONObject;

    .line 300
    .line 301
    .line 302
    const-string/jumbo v2, "response_byte_count"

    .line 303
    .line 304
    iget-wide v3, p0, Lcom/tencent/bugly/proguard/d8;->K:J

    .line 305
    .line 306
    .line 307
    invoke-virtual {v1, v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 308
    .line 309
    iget-object v1, v0, Lcom/tencent/bugly/proguard/z7;->m:Lorg/json/JSONObject;

    .line 310
    .line 311
    const-string v2, "host_ip"

    .line 312
    .line 313
    iget-object v3, p0, Lcom/tencent/bugly/proguard/d8;->n:Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    invoke-virtual {p0, v3}, Lcom/tencent/bugly/proguard/d8;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 317
    move-result-object v3

    .line 318
    .line 319
    .line 320
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 321
    .line 322
    iget-object v1, v0, Lcom/tencent/bugly/proguard/z7;->m:Lorg/json/JSONObject;

    .line 323
    .line 324
    const-string v2, "host_port"

    .line 325
    .line 326
    iget v3, p0, Lcom/tencent/bugly/proguard/d8;->o:I

    .line 327
    .line 328
    .line 329
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 330
    .line 331
    iget-object v1, v0, Lcom/tencent/bugly/proguard/z7;->m:Lorg/json/JSONObject;

    .line 332
    .line 333
    const-string v2, "client_ip"

    .line 334
    .line 335
    iget-object v3, p0, Lcom/tencent/bugly/proguard/d8;->p:Ljava/lang/String;

    .line 336
    .line 337
    .line 338
    invoke-virtual {p0, v3}, Lcom/tencent/bugly/proguard/d8;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 339
    move-result-object v3

    .line 340
    .line 341
    .line 342
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 343
    .line 344
    iget-object v1, v0, Lcom/tencent/bugly/proguard/z7;->m:Lorg/json/JSONObject;

    .line 345
    .line 346
    const-string v2, "client_port"

    .line 347
    .line 348
    iget v3, p0, Lcom/tencent/bugly/proguard/d8;->q:I

    .line 349
    .line 350
    .line 351
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 352
    .line 353
    iget-object v1, v0, Lcom/tencent/bugly/proguard/z7;->m:Lorg/json/JSONObject;

    .line 354
    .line 355
    const-string v2, "client_operator"

    .line 356
    .line 357
    sget-object v3, Lcom/tencent/bugly/proguard/d8;->R:Lcom/tencent/bugly/proguard/p4;

    .line 358
    .line 359
    .line 360
    invoke-virtual {v3}, Lcom/tencent/bugly/proguard/p4;->d()Ljava/lang/String;

    .line 361
    move-result-object v4

    .line 362
    .line 363
    .line 364
    invoke-virtual {v1, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 365
    .line 366
    iget-object v1, v0, Lcom/tencent/bugly/proguard/z7;->m:Lorg/json/JSONObject;

    .line 367
    .line 368
    const-string v2, "client_operator_code"

    .line 369
    .line 370
    .line 371
    invoke-virtual {v3}, Lcom/tencent/bugly/proguard/p4;->b()Ljava/lang/String;

    .line 372
    move-result-object v4

    .line 373
    .line 374
    .line 375
    invoke-virtual {v1, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 376
    .line 377
    iget-object v1, v0, Lcom/tencent/bugly/proguard/z7;->m:Lorg/json/JSONObject;

    .line 378
    .line 379
    const-string v2, "client_country_code"

    .line 380
    .line 381
    .line 382
    invoke-virtual {v3}, Lcom/tencent/bugly/proguard/p4;->a()Ljava/lang/String;

    .line 383
    move-result-object v4

    .line 384
    .line 385
    .line 386
    invoke-virtual {v1, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 387
    .line 388
    iget-object v1, v0, Lcom/tencent/bugly/proguard/z7;->m:Lorg/json/JSONObject;

    .line 389
    .line 390
    const-string v2, "client_region_id"

    .line 391
    .line 392
    .line 393
    invoke-virtual {v3}, Lcom/tencent/bugly/proguard/p4;->e()Ljava/lang/String;

    .line 394
    move-result-object v3

    .line 395
    .line 396
    .line 397
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 398
    .line 399
    iget-object v1, v0, Lcom/tencent/bugly/proguard/z7;->m:Lorg/json/JSONObject;

    .line 400
    .line 401
    iget-object v2, p0, Lcom/tencent/bugly/proguard/d8;->f:Ljava/lang/String;

    .line 402
    .line 403
    iget-object v3, p0, Lcom/tencent/bugly/proguard/d8;->g:Ljava/lang/Exception;

    .line 404
    .line 405
    .line 406
    invoke-static {v1, v2, v3}, Lcom/tencent/bugly/proguard/gd;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 407
    .line 408
    iget-object v1, v0, Lcom/tencent/bugly/proguard/z7;->m:Lorg/json/JSONObject;

    .line 409
    .line 410
    .line 411
    const-string/jumbo v2, "user_custom"

    .line 412
    .line 413
    .line 414
    invoke-static {}, Lcom/tencent/bugly/proguard/w3;->a()Lcom/tencent/rmonitor/custom/a;

    .line 415
    move-result-object v3

    .line 416
    .line 417
    .line 418
    invoke-virtual {v3}, Lcom/tencent/rmonitor/custom/a;->g()Lorg/json/JSONObject;

    .line 419
    move-result-object v3

    .line 420
    .line 421
    .line 422
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 423
    return-object v0

    .line 424
    :catchall_0
    move-exception v1

    .line 425
    .line 426
    sget-object v2, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 427
    .line 428
    .line 429
    const-string/jumbo v3, "toMeta fail for "

    .line 430
    .line 431
    .line 432
    invoke-static {v3, v1}, Lcom/tencent/bugly/proguard/mf;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 433
    move-result-object v1

    .line 434
    .line 435
    const-string v3, "RMonitor_net_quality_event"

    .line 436
    .line 437
    .line 438
    filled-new-array {v3, v1}, [Ljava/lang/String;

    .line 439
    move-result-object v1

    .line 440
    .line 441
    .line 442
    invoke-virtual {v2, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->e([Ljava/lang/String;)V

    .line 443
    return-object v0
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "{url: "

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    iget-object v1, p0, Lcom/tencent/bugly/proguard/d8;->v:Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v1, ", host: "

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    iget-object v1, p0, Lcom/tencent/bugly/proguard/d8;->x:Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    const-string v1, ", statusCode: "

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    iget v1, p0, Lcom/tencent/bugly/proguard/d8;->H:I

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    const-string v1, ", cost: "

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    iget-wide v1, p0, Lcom/tencent/bugly/proguard/d8;->h:J

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string/jumbo v1, "}"

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    move-result-object v0

    .line 54
    return-object v0
    .line 55
    .line 56
    .line 57
.end method
