.class public Lcom/tencent/bugly/proguard/u6;
.super Lcom/tencent/bugly/proguard/a1;
.source "BUGLY"


# static fields
.field public static final b:Ljava/lang/String; = "java.net.Socket"

.field public static final c:Ljava/lang/String; = "java.net.SocketImpl"

.field public static final d:Ljava/lang/String; = "impl"

.field public static final e:Ljava/lang/String; = "address"

.field public static final f:Ljava/lang/String; = "sun.nio.ch.SocketChannelImpl"

.field public static final g:Ljava/lang/String; = "remoteAddress"

.field public static final h:Ljava/lang/String; = "java.net.InetSocketAddress"

.field public static final i:Ljava/lang/String; = "holder"

.field public static final j:Ljava/lang/String; = "addr"

.field public static final k:Ljava/lang/String; = "java.net.InetSocketAddress$InetSocketAddressHolder"

.field public static final l:Ljava/lang/String; = "port"

.field public static final m:Ljava/lang/String; = "java.net.InetAddress"

.field public static final n:Ljava/lang/String; = "java.net.InetAddress$InetAddressHolder"

.field public static final o:Ljava/lang/String; = "originalHostName"

.field public static final p:Ljava/lang/String; = "address"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/bugly/proguard/a1;-><init>()V

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
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 2
    const-string/jumbo v0, "socket"

    return-object v0
.end method

.method public final a(J)Ljava/lang/String;
    .locals 5

    .line 27
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0xf

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    const/4 v3, 0x4

    if-ge v2, v3, :cond_1

    const-wide/16 v3, 0xff

    and-long/2addr v3, p1

    .line 28
    invoke-static {v3, v4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Ljava/lang/StringBuilder;->insert(ILjava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v3, 0x3

    if-ge v2, v3, :cond_0

    const/16 v3, 0x2e

    .line 29
    invoke-virtual {v0, v1, v3}, Ljava/lang/StringBuilder;->insert(IC)Ljava/lang/StringBuilder;

    :cond_0
    const/16 v3, 0x8

    shr-long/2addr p1, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 30
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final a(Lshark/HeapObject$HeapInstance;)Ljava/lang/String;
    .locals 2

    if-eqz p1, :cond_1

    .line 22
    const-string v0, "java.net.InetAddress"

    const-string v1, "holder"

    invoke-static {p1, v0, v1}, Lcom/tencent/rmonitor/fd/utils/SharkUtil;->getInstanceField(Lshark/HeapObject$HeapInstance;Ljava/lang/String;Ljava/lang/String;)Lshark/HeapObject$HeapInstance;

    move-result-object p1

    .line 23
    const-string/jumbo v0, "originalHostName"

    invoke-static {p1, v0}, Lcom/tencent/rmonitor/fd/utils/SharkUtil;->getStringField(Lshark/HeapObject$HeapInstance;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 24
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 25
    const-string v0, "address"

    invoke-static {p1, v0}, Lcom/tencent/rmonitor/fd/utils/SharkUtil;->getIntField(Lshark/HeapObject$HeapInstance;Ljava/lang/String;)I

    move-result p1

    int-to-long v0, p1

    .line 26
    invoke-virtual {p0, v0, v1}, Lcom/tencent/bugly/proguard/u6;->a(J)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public a(Lcom/tencent/bugly/proguard/c6;)Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tencent/bugly/proguard/c6;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    invoke-virtual {p0, p1, v0}, Lcom/tencent/bugly/proguard/u6;->a(Lcom/tencent/bugly/proguard/c6;Ljava/util/Map;)Ljava/util/Set;

    move-result-object v1

    .line 5
    invoke-virtual {p0, p1, v0}, Lcom/tencent/bugly/proguard/u6;->b(Lcom/tencent/bugly/proguard/c6;Ljava/util/Map;)Ljava/util/Set;

    move-result-object v2

    .line 6
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 7
    invoke-interface {v3, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 8
    invoke-interface {v3, v2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 9
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/u6;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, v3}, Lcom/tencent/bugly/proguard/c6;->a(Ljava/lang/String;Ljava/util/Set;)V

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Ljava/util/Map;
    .locals 0

    .line 1
    check-cast p1, Lcom/tencent/bugly/proguard/c6;

    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/u6;->a(Lcom/tencent/bugly/proguard/c6;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public final a(Lcom/tencent/bugly/proguard/c6;Ljava/util/Map;)Ljava/util/Set;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tencent/bugly/proguard/c6;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/util/Set<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 10
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/c6;->a()Lshark/i;

    move-result-object p1

    const-string v0, "java.net.Socket"

    invoke-interface {p1, v0}, Lshark/i;->b(Ljava/lang/String;)Lshark/HeapObject$HeapClass;

    move-result-object p1

    .line 11
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    if-nez p1, :cond_0

    goto :goto_1

    .line 12
    :cond_0
    invoke-virtual {p1}, Lshark/HeapObject$HeapClass;->o()Lkotlin/sequences/Sequence;

    move-result-object p1

    invoke-interface {p1}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 13
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 14
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lshark/HeapObject$HeapInstance;

    .line 15
    const-string v3, "impl"

    invoke-static {v2, v0, v3}, Lcom/tencent/rmonitor/fd/utils/SharkUtil;->getInstanceField(Lshark/HeapObject$HeapInstance;Ljava/lang/String;Ljava/lang/String;)Lshark/HeapObject$HeapInstance;

    move-result-object v3

    if-nez v3, :cond_2

    goto :goto_0

    .line 16
    :cond_2
    const-string/jumbo v4, "port"

    const-string v5, "java.net.SocketImpl"

    invoke-static {v3, v5, v4}, Lcom/tencent/rmonitor/fd/utils/SharkUtil;->getIntField(Lshark/HeapObject$HeapInstance;Ljava/lang/String;Ljava/lang/String;)I

    move-result v4

    .line 17
    const-string v6, "address"

    invoke-static {v3, v5, v6}, Lcom/tencent/rmonitor/fd/utils/SharkUtil;->getInstanceField(Lshark/HeapObject$HeapInstance;Ljava/lang/String;Ljava/lang/String;)Lshark/HeapObject$HeapInstance;

    move-result-object v3

    .line 18
    invoke-virtual {p0, v3}, Lcom/tencent/bugly/proguard/u6;->a(Lshark/HeapObject$HeapInstance;)Ljava/lang/String;

    move-result-object v3

    .line 19
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_1

    .line 20
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    filled-new-array {v3, v4}, [Ljava/lang/Object;

    move-result-object v3

    const-string v4, "/%s:%s"

    invoke-static {v4, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, p2, v3}, Lcom/tencent/bugly/proguard/y0;->a(Ljava/util/Map;Ljava/lang/String;)V

    .line 21
    invoke-virtual {v2}, Lshark/HeapObject$HeapInstance;->f()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    :goto_1
    return-object v1
.end method

.method public final b(Lcom/tencent/bugly/proguard/c6;Ljava/util/Map;)Ljava/util/Set;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tencent/bugly/proguard/c6;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/util/Set<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/c6;->a()Lshark/i;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    .line 7
    const-string/jumbo v0, "sun.nio.ch.SocketChannelImpl"

    .line 8
    .line 9
    .line 10
    invoke-interface {p1, v0}, Lshark/i;->b(Ljava/lang/String;)Lshark/HeapObject$HeapClass;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    new-instance v1, Ljava/util/HashSet;

    .line 14
    .line 15
    .line 16
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 17
    .line 18
    if-nez p1, :cond_0

    .line 19
    goto :goto_1

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-virtual {p1}, Lshark/HeapObject$HeapClass;->o()Lkotlin/sequences/Sequence;

    .line 23
    move-result-object p1

    .line 24
    .line 25
    .line 26
    invoke-interface {p1}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    .line 27
    move-result-object p1

    .line 28
    .line 29
    .line 30
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    move-result v2

    .line 32
    .line 33
    if-eqz v2, :cond_3

    .line 34
    .line 35
    .line 36
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    move-result-object v2

    .line 38
    .line 39
    check-cast v2, Lshark/HeapObject$HeapInstance;

    .line 40
    .line 41
    .line 42
    const-string/jumbo v3, "remoteAddress"

    .line 43
    .line 44
    .line 45
    invoke-static {v2, v0, v3}, Lcom/tencent/rmonitor/fd/utils/SharkUtil;->getInstanceField(Lshark/HeapObject$HeapInstance;Ljava/lang/String;Ljava/lang/String;)Lshark/HeapObject$HeapInstance;

    .line 46
    move-result-object v3

    .line 47
    .line 48
    if-nez v3, :cond_2

    .line 49
    goto :goto_0

    .line 50
    .line 51
    :cond_2
    const-string v4, "java.net.InetSocketAddress"

    .line 52
    .line 53
    const-string v5, "holder"

    .line 54
    .line 55
    .line 56
    invoke-static {v3, v4, v5}, Lcom/tencent/rmonitor/fd/utils/SharkUtil;->getInstanceField(Lshark/HeapObject$HeapInstance;Ljava/lang/String;Ljava/lang/String;)Lshark/HeapObject$HeapInstance;

    .line 57
    move-result-object v3

    .line 58
    .line 59
    if-eqz v3, :cond_1

    .line 60
    .line 61
    .line 62
    const-string/jumbo v4, "port"

    .line 63
    .line 64
    .line 65
    invoke-static {v3, v4}, Lcom/tencent/rmonitor/fd/utils/SharkUtil;->getIntField(Lshark/HeapObject$HeapInstance;Ljava/lang/String;)I

    .line 66
    move-result v4

    .line 67
    .line 68
    const-string v5, "java.net.InetSocketAddress$InetSocketAddressHolder"

    .line 69
    .line 70
    const-string v6, "addr"

    .line 71
    .line 72
    .line 73
    invoke-static {v3, v5, v6}, Lcom/tencent/rmonitor/fd/utils/SharkUtil;->getInstanceField(Lshark/HeapObject$HeapInstance;Ljava/lang/String;Ljava/lang/String;)Lshark/HeapObject$HeapInstance;

    .line 74
    move-result-object v3

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0, v3}, Lcom/tencent/bugly/proguard/u6;->a(Lshark/HeapObject$HeapInstance;)Ljava/lang/String;

    .line 78
    move-result-object v3

    .line 79
    .line 80
    .line 81
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 82
    move-result v5

    .line 83
    .line 84
    if-nez v5, :cond_1

    .line 85
    .line 86
    .line 87
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 88
    move-result-object v4

    .line 89
    .line 90
    .line 91
    filled-new-array {v3, v4}, [Ljava/lang/Object;

    .line 92
    move-result-object v3

    .line 93
    .line 94
    const-string v4, "/%s:%s"

    .line 95
    .line 96
    .line 97
    invoke-static {v4, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 98
    move-result-object v3

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0, p2, v3}, Lcom/tencent/bugly/proguard/y0;->a(Ljava/util/Map;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2}, Lshark/HeapObject$HeapInstance;->f()J

    .line 105
    move-result-wide v2

    .line 106
    .line 107
    .line 108
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 109
    move-result-object v2

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 113
    goto :goto_0

    .line 114
    :cond_3
    :goto_1
    return-object v1
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
    .line 212
    .line 213
    .line 214
.end method
