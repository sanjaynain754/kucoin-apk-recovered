.class public abstract Lcom/geetest/gtc4/g4;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static b:Ljava/lang/String;

.field public static c:Z

.field public static d:Z

.field public static final e:Ljava/util/concurrent/CountDownLatch;


# instance fields
.field public a:Lcom/geetest/gtc4/f4;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 7
    .line 8
    sput-object v0, Lcom/geetest/gtc4/g4;->e:Ljava/util/concurrent/CountDownLatch;

    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

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
.end method


# virtual methods
.method public final a(Landroid/content/Context;)Z
    .locals 6

    .line 1
    .line 2
    sget-boolean v0, Lcom/geetest/gtc4/g4;->d:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    sget-boolean p1, Lcom/geetest/gtc4/g4;->c:Z

    .line 7
    return p1

    .line 8
    :cond_0
    const/4 v0, 0x1

    .line 9
    const/4 v1, 0x0

    .line 10
    .line 11
    if-eqz p1, :cond_5

    .line 12
    .line 13
    const-string v2, "com.huawei.hwid"

    .line 14
    .line 15
    .line 16
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 17
    move-result v3

    .line 18
    .line 19
    if-nez v3, :cond_5

    .line 20
    .line 21
    :try_start_0
    sget-object v3, Lcom/geetest/gtc4/h4;->d:Landroid/content/pm/PackageManager;

    .line 22
    .line 23
    if-nez v3, :cond_1

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 27
    move-result-object p1

    .line 28
    .line 29
    sput-object p1, Lcom/geetest/gtc4/h4;->d:Landroid/content/pm/PackageManager;

    .line 30
    .line 31
    :cond_1
    sget-object p1, Lcom/geetest/gtc4/h4;->d:Landroid/content/pm/PackageManager;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, v2, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 35
    move-result-object p1

    .line 36
    .line 37
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 38
    .line 39
    const/16 v3, 0x1c

    .line 40
    .line 41
    if-lt v2, v3, :cond_3

    .line 42
    .line 43
    if-eqz p1, :cond_2

    .line 44
    .line 45
    .line 46
    invoke-static {p1}, Landroidx/credentials/playservices/controllers/identityauth/createpublickeycredential/x;->a(Landroid/content/pm/PackageInfo;)J

    .line 47
    move-result-wide v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    const-wide/16 v4, 0x1

    .line 50
    .line 51
    cmp-long p1, v2, v4

    .line 52
    .line 53
    if-ltz p1, :cond_2

    .line 54
    return v0

    .line 55
    :cond_2
    return v1

    .line 56
    .line 57
    :cond_3
    if-eqz p1, :cond_4

    .line 58
    .line 59
    iget p1, p1, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 60
    .line 61
    if-lez p1, :cond_4

    .line 62
    move v1, v0

    .line 63
    .line 64
    :cond_4
    sput-boolean v1, Lcom/geetest/gtc4/g4;->c:Z

    .line 65
    goto :goto_0

    .line 66
    :catchall_0
    return v1

    .line 67
    .line 68
    :cond_5
    sput-boolean v1, Lcom/geetest/gtc4/g4;->c:Z

    .line 69
    .line 70
    :goto_0
    sput-boolean v0, Lcom/geetest/gtc4/g4;->d:Z

    .line 71
    .line 72
    sget-boolean p1, Lcom/geetest/gtc4/g4;->c:Z

    .line 73
    return p1
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public final b(Landroid/content/Context;)Z
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-eqz p1, :cond_6

    .line 4
    .line 5
    const-string v1, "com.huawei.hwid"

    .line 6
    .line 7
    .line 8
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 9
    move-result v2

    .line 10
    .line 11
    if-nez v2, :cond_6

    .line 12
    .line 13
    iget-object v2, p0, Lcom/geetest/gtc4/g4;->a:Lcom/geetest/gtc4/f4;

    .line 14
    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    new-instance v2, Lcom/geetest/gtc4/f4;

    .line 18
    .line 19
    sget-object v3, Lcom/geetest/gtc4/g4;->e:Ljava/util/concurrent/CountDownLatch;

    .line 20
    .line 21
    .line 22
    invoke-direct {v2, v3}, Lcom/geetest/gtc4/f4;-><init>(Ljava/util/concurrent/CountDownLatch;)V

    .line 23
    .line 24
    iput-object v2, p0, Lcom/geetest/gtc4/g4;->a:Lcom/geetest/gtc4/f4;

    .line 25
    .line 26
    :cond_0
    new-instance v2, Landroid/content/Intent;

    .line 27
    .line 28
    .line 29
    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 30
    const/4 v3, 0x0

    .line 31
    .line 32
    .line 33
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 34
    move-result v4

    .line 35
    .line 36
    if-eqz v4, :cond_1

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 40
    goto :goto_0

    .line 41
    .line 42
    :cond_1
    new-instance v4, Landroid/content/ComponentName;

    .line 43
    .line 44
    .line 45
    invoke-direct {v4, v1, v3}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2, v4}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 49
    .line 50
    :goto_0
    const-string v1, "com.uodis.opendevice.OPENIDS_SERVICE"

    .line 51
    .line 52
    .line 53
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 54
    move-result v4

    .line 55
    .line 56
    if-nez v4, :cond_2

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 60
    .line 61
    :cond_2
    iget-object v1, p0, Lcom/geetest/gtc4/g4;->a:Lcom/geetest/gtc4/f4;

    .line 62
    .line 63
    iget-object v4, v1, Lcom/geetest/gtc4/f4;->a:Lcom/geetest/gtc4/e4;

    .line 64
    const/4 v5, 0x1

    .line 65
    .line 66
    if-eqz v4, :cond_3

    .line 67
    return v5

    .line 68
    .line 69
    .line 70
    :cond_3
    :try_start_0
    invoke-virtual {p1, v2, v1, v5}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 71
    move-result p1

    .line 72
    .line 73
    iget-object v2, v1, Lcom/geetest/gtc4/f4;->b:Ljava/util/concurrent/CountDownLatch;

    .line 74
    .line 75
    sget-object v4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 76
    .line 77
    const-wide/16 v5, 0x1

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, v5, v6, v4}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    .line 81
    .line 82
    iget-object v2, v1, Lcom/geetest/gtc4/f4;->c:Landroid/os/IBinder;

    .line 83
    .line 84
    const-string v4, "com.uodis.opendevice.aidl.OpenDeviceIdentifierService"

    .line 85
    .line 86
    if-nez v2, :cond_4

    .line 87
    goto :goto_1

    .line 88
    .line 89
    .line 90
    :cond_4
    invoke-interface {v2, v4}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 91
    move-result-object v3

    .line 92
    .line 93
    instance-of v4, v3, Lcom/geetest/gtc4/e4;

    .line 94
    .line 95
    if-eqz v4, :cond_5

    .line 96
    .line 97
    check-cast v3, Lcom/geetest/gtc4/e4;

    .line 98
    goto :goto_1

    .line 99
    .line 100
    :cond_5
    new-instance v3, Lcom/geetest/gtc4/e4;

    .line 101
    .line 102
    .line 103
    invoke-direct {v3, v2}, Lcom/geetest/gtc4/e4;-><init>(Landroid/os/IBinder;)V

    .line 104
    .line 105
    :goto_1
    iput-object v3, v1, Lcom/geetest/gtc4/f4;->a:Lcom/geetest/gtc4/e4;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 106
    return p1

    .line 107
    :catchall_0
    :cond_6
    return v0
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
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
.end method
