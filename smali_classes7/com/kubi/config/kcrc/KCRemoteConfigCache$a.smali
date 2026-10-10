.class public final Lcom/kubi/config/kcrc/KCRemoteConfigCache$a;
.super Ljava/lang/Object;
.source "KCRemoteConfigUtils.kt"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/config/kcrc/KCRemoteConfigCache;->m(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "",
        "run",
        "()V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field public final synthetic b:Lcom/kubi/config/kcrc/KCRemoteConfigCache;

.field public final synthetic c:Z


# direct methods
.method public constructor <init>(Lcom/kubi/config/kcrc/KCRemoteConfigCache;Z)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/config/kcrc/KCRemoteConfigCache$a;->b:Lcom/kubi/config/kcrc/KCRemoteConfigCache;

    .line 3
    .line 4
    iput-boolean p2, p0, Lcom/kubi/config/kcrc/KCRemoteConfigCache$a;->c:Z

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
    .line 76
    .line 77
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    .line 2
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    const-string v1, "notifyWrite: size="

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    iget-object v1, p0, Lcom/kubi/config/kcrc/KCRemoteConfigCache$a;->b:Lcom/kubi/config/kcrc/KCRemoteConfigCache;

    .line 13
    .line 14
    .line 15
    invoke-static {v1}, Lcom/kubi/config/kcrc/KCRemoteConfigCache;->a(Lcom/kubi/config/kcrc/KCRemoteConfigCache;)Ljava/util/concurrent/ConcurrentHashMap;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    .line 20
    move-result v1

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    .line 30
    invoke-static {v0}, Lcom/kubi/config/kcrc/l;->d(Ljava/lang/String;)V

    .line 31
    .line 32
    iget-object v0, p0, Lcom/kubi/config/kcrc/KCRemoteConfigCache$a;->b:Lcom/kubi/config/kcrc/KCRemoteConfigCache;

    .line 33
    .line 34
    .line 35
    invoke-static {v0}, Lcom/kubi/config/kcrc/KCRemoteConfigCache;->c(Lcom/kubi/config/kcrc/KCRemoteConfigCache;)Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 36
    move-result-object v0

    .line 37
    const/4 v1, 0x1

    .line 38
    const/4 v2, 0x0

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 42
    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    const/16 v0, 0x2e

    .line 47
    .line 48
    :try_start_1
    iget-object v1, p0, Lcom/kubi/config/kcrc/KCRemoteConfigCache$a;->b:Lcom/kubi/config/kcrc/KCRemoteConfigCache;

    .line 49
    .line 50
    .line 51
    invoke-static {v1}, Lcom/kubi/config/kcrc/KCRemoteConfigCache;->b(Lcom/kubi/config/kcrc/KCRemoteConfigCache;)Ljava/util/concurrent/ConcurrentHashMap;

    .line 52
    move-result-object v1

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    .line 56
    move-result v1

    .line 57
    .line 58
    iget-boolean v3, p0, Lcom/kubi/config/kcrc/KCRemoteConfigCache$a;->c:Z

    .line 59
    .line 60
    if-eqz v3, :cond_0

    .line 61
    .line 62
    if-lez v1, :cond_0

    .line 63
    .line 64
    iget-object v3, p0, Lcom/kubi/config/kcrc/KCRemoteConfigCache$a;->b:Lcom/kubi/config/kcrc/KCRemoteConfigCache;

    .line 65
    .line 66
    .line 67
    invoke-static {v3}, Lcom/kubi/config/kcrc/KCRemoteConfigCache;->b(Lcom/kubi/config/kcrc/KCRemoteConfigCache;)Ljava/util/concurrent/ConcurrentHashMap;

    .line 68
    move-result-object v4

    .line 69
    .line 70
    .line 71
    invoke-static {v3, v4}, Lcom/kubi/config/kcrc/KCRemoteConfigCache;->d(Lcom/kubi/config/kcrc/KCRemoteConfigCache;Ljava/util/concurrent/ConcurrentHashMap;)V

    .line 72
    .line 73
    iget-object v3, p0, Lcom/kubi/config/kcrc/KCRemoteConfigCache$a;->b:Lcom/kubi/config/kcrc/KCRemoteConfigCache;

    .line 74
    .line 75
    new-instance v4, Ljava/util/concurrent/ConcurrentHashMap;

    .line 76
    .line 77
    .line 78
    invoke-direct {v4}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 79
    .line 80
    .line 81
    invoke-static {v3, v4}, Lcom/kubi/config/kcrc/KCRemoteConfigCache;->e(Lcom/kubi/config/kcrc/KCRemoteConfigCache;Ljava/util/concurrent/ConcurrentHashMap;)V

    .line 82
    goto :goto_0

    .line 83
    :catchall_0
    move-exception v1

    .line 84
    .line 85
    goto/16 :goto_2

    .line 86
    .line 87
    :cond_0
    :goto_0
    sget-object v3, Lcom/kubi/config/kcrc/j;->a:Lcom/kubi/config/kcrc/j;

    .line 88
    .line 89
    new-instance v4, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 93
    .line 94
    const-string v5, "[refreshConfigMap]-success: changedSize="

    .line 95
    .line 96
    .line 97
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    move-result-object v1

    .line 108
    .line 109
    .line 110
    invoke-virtual {v3, v1}, Lcom/kubi/config/kcrc/j;->b(Ljava/lang/String;)V

    .line 111
    .line 112
    new-instance v1, Lorg/json/JSONObject;

    .line 113
    .line 114
    .line 115
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 116
    .line 117
    iget-object v3, p0, Lcom/kubi/config/kcrc/KCRemoteConfigCache$a;->b:Lcom/kubi/config/kcrc/KCRemoteConfigCache;

    .line 118
    .line 119
    .line 120
    invoke-static {v3}, Lcom/kubi/config/kcrc/KCRemoteConfigCache;->a(Lcom/kubi/config/kcrc/KCRemoteConfigCache;)Ljava/util/concurrent/ConcurrentHashMap;

    .line 121
    move-result-object v3

    .line 122
    .line 123
    .line 124
    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 125
    move-result-object v3

    .line 126
    .line 127
    .line 128
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 129
    move-result-object v3

    .line 130
    .line 131
    .line 132
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 133
    move-result v4

    .line 134
    .line 135
    if-eqz v4, :cond_1

    .line 136
    .line 137
    .line 138
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 139
    move-result-object v4

    .line 140
    .line 141
    check-cast v4, Ljava/util/Map$Entry;

    .line 142
    .line 143
    .line 144
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 145
    move-result-object v5

    .line 146
    .line 147
    check-cast v5, Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 151
    move-result-object v4

    .line 152
    .line 153
    .line 154
    invoke-virtual {v1, v5, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 155
    goto :goto_1

    .line 156
    .line 157
    :cond_1
    iget-object v3, p0, Lcom/kubi/config/kcrc/KCRemoteConfigCache$a;->b:Lcom/kubi/config/kcrc/KCRemoteConfigCache;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 161
    move-result-object v1

    .line 162
    .line 163
    const-string v4, "jsonObject.toString()"

    .line 164
    .line 165
    .line 166
    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    invoke-static {v3, v1}, Lcom/kubi/config/kcrc/KCRemoteConfigCache;->f(Lcom/kubi/config/kcrc/KCRemoteConfigCache;Ljava/lang/String;)V

    .line 170
    .line 171
    sget-object v1, Lcom/kubi/config/kcrc/j;->a:Lcom/kubi/config/kcrc/j;

    .line 172
    .line 173
    new-instance v3, Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 177
    .line 178
    const-string v4, "[notifyWrite]-success: size="

    .line 179
    .line 180
    .line 181
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    iget-object v4, p0, Lcom/kubi/config/kcrc/KCRemoteConfigCache$a;->b:Lcom/kubi/config/kcrc/KCRemoteConfigCache;

    .line 184
    .line 185
    .line 186
    invoke-static {v4}, Lcom/kubi/config/kcrc/KCRemoteConfigCache;->a(Lcom/kubi/config/kcrc/KCRemoteConfigCache;)Ljava/util/concurrent/ConcurrentHashMap;

    .line 187
    move-result-object v4

    .line 188
    .line 189
    .line 190
    invoke-virtual {v4}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    .line 191
    move-result v4

    .line 192
    .line 193
    .line 194
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 201
    move-result-object v3

    .line 202
    .line 203
    .line 204
    invoke-virtual {v1, v3}, Lcom/kubi/config/kcrc/j;->b(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 205
    goto :goto_3

    .line 206
    .line 207
    :goto_2
    :try_start_2
    sget-object v3, Lcom/kubi/config/kcrc/j;->a:Lcom/kubi/config/kcrc/j;

    .line 208
    .line 209
    new-instance v4, Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 213
    .line 214
    const-string v5, "[notifyWrite]-error: "

    .line 215
    .line 216
    .line 217
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 221
    move-result-object v5

    .line 222
    .line 223
    .line 224
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 231
    move-result-object v0

    .line 232
    .line 233
    .line 234
    invoke-virtual {v3, v0, v1}, Lcom/kubi/config/kcrc/j;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 235
    .line 236
    :goto_3
    iget-object v0, p0, Lcom/kubi/config/kcrc/KCRemoteConfigCache$a;->b:Lcom/kubi/config/kcrc/KCRemoteConfigCache;

    .line 237
    .line 238
    .line 239
    invoke-static {v0}, Lcom/kubi/config/kcrc/KCRemoteConfigCache;->c(Lcom/kubi/config/kcrc/KCRemoteConfigCache;)Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 240
    move-result-object v0

    .line 241
    .line 242
    .line 243
    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 244
    goto :goto_4

    .line 245
    :catch_0
    move-exception v0

    .line 246
    .line 247
    sget-object v1, Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;->a:Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v1}, Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;->H()Lcom/kubi/config/Config;

    .line 251
    move-result-object v1

    .line 252
    .line 253
    if-eqz v1, :cond_2

    .line 254
    .line 255
    .line 256
    invoke-virtual {v1}, Lcom/kubi/config/Config;->c()Lkotlin/jvm/functions/Function1;

    .line 257
    move-result-object v1

    .line 258
    .line 259
    if-eqz v1, :cond_2

    .line 260
    .line 261
    .line 262
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    :cond_2
    :goto_4
    return-void
.end method
