.class public abstract Lcom/google/android/gms/internal/measurement/zzly;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-measurement-base@@22.5.0"


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
.end method

.method public static zzb(Ljava/lang/Class;)Lcom/google/android/gms/internal/measurement/zzlq;
    .locals 11

    .line 1
    .line 2
    const-class v1, Lcom/google/android/gms/internal/measurement/zzly;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 6
    move-result-object v2

    .line 7
    .line 8
    const-class v0, Lcom/google/android/gms/internal/measurement/zzlq;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    move-result v0

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const-string v0, "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader"

    .line 17
    goto :goto_0

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    .line 25
    move-result-object v3

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 29
    move-result v0

    .line 30
    .line 31
    if-eqz v0, :cond_4

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/Package;->getName()Ljava/lang/String;

    .line 39
    move-result-object v0

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 43
    move-result-object v3

    .line 44
    .line 45
    .line 46
    filled-new-array {v0, v3}, [Ljava/lang/Object;

    .line 47
    move-result-object v0

    .line 48
    .line 49
    const-string v3, "%s.BlazeGenerated%sLoader"

    .line 50
    .line 51
    .line 52
    invoke-static {v3, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 53
    move-result-object v0

    .line 54
    :goto_0
    const/4 v3, 0x1

    .line 55
    const/4 v4, 0x0

    .line 56
    .line 57
    .line 58
    :try_start_0
    invoke-static {v0, v3, v2}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 59
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_4

    .line 60
    .line 61
    :try_start_1
    new-array v5, v4, [Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v5}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 65
    move-result-object v0

    .line 66
    .line 67
    new-array v5, v4, [Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v5}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    move-result-object v0

    .line 72
    .line 73
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzly;
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/InstantiationException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_4

    .line 74
    .line 75
    .line 76
    :try_start_2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzly;->zza()Lcom/google/android/gms/internal/measurement/zzlq;

    .line 77
    move-result-object v0

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0, v0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    move-result-object v0

    .line 82
    .line 83
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzlq;

    .line 84
    return-object v0

    .line 85
    :catch_0
    move-exception v0

    .line 86
    goto :goto_1

    .line 87
    :catch_1
    move-exception v0

    .line 88
    goto :goto_2

    .line 89
    :catch_2
    move-exception v0

    .line 90
    goto :goto_3

    .line 91
    :catch_3
    move-exception v0

    .line 92
    goto :goto_4

    .line 93
    .line 94
    :goto_1
    new-instance v5, Ljava/lang/IllegalStateException;

    .line 95
    .line 96
    .line 97
    invoke-direct {v5, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 98
    throw v5

    .line 99
    .line 100
    :goto_2
    new-instance v5, Ljava/lang/IllegalStateException;

    .line 101
    .line 102
    .line 103
    invoke-direct {v5, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 104
    throw v5

    .line 105
    .line 106
    :goto_3
    new-instance v5, Ljava/lang/IllegalStateException;

    .line 107
    .line 108
    .line 109
    invoke-direct {v5, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 110
    throw v5

    .line 111
    .line 112
    :goto_4
    new-instance v5, Ljava/lang/IllegalStateException;

    .line 113
    .line 114
    .line 115
    invoke-direct {v5, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 116
    throw v5
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_4

    .line 117
    .line 118
    .line 119
    :catch_4
    invoke-static {v1, v2}, Ljava/util/ServiceLoader;->load(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/util/ServiceLoader;

    .line 120
    move-result-object v0

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0}, Ljava/util/ServiceLoader;->iterator()Ljava/util/Iterator;

    .line 124
    move-result-object v1

    .line 125
    .line 126
    new-instance v2, Ljava/util/ArrayList;

    .line 127
    .line 128
    .line 129
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 130
    .line 131
    .line 132
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 133
    move-result v0

    .line 134
    .line 135
    if-eqz v0, :cond_1

    .line 136
    .line 137
    .line 138
    :try_start_3
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 139
    move-result-object v0

    .line 140
    .line 141
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzly;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzly;->zza()Lcom/google/android/gms/internal/measurement/zzlq;

    .line 145
    move-result-object v0

    .line 146
    .line 147
    .line 148
    invoke-virtual {p0, v0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    move-result-object v0

    .line 150
    .line 151
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzlq;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catch Ljava/util/ServiceConfigurationError; {:try_start_3 .. :try_end_3} :catch_5

    .line 155
    goto :goto_5

    .line 156
    :catch_5
    move-exception v0

    .line 157
    move-object v10, v0

    .line 158
    .line 159
    const-class v0, Lcom/google/android/gms/internal/measurement/zzll;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 163
    move-result-object v0

    .line 164
    .line 165
    .line 166
    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    .line 167
    move-result-object v5

    .line 168
    .line 169
    sget-object v6, Ljava/util/logging/Level;->SEVERE:Ljava/util/logging/Level;

    .line 170
    .line 171
    .line 172
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 173
    move-result-object v0

    .line 174
    .line 175
    const-string v8, "load"

    .line 176
    .line 177
    const-string v7, "Unable to load "

    .line 178
    .line 179
    .line 180
    invoke-virtual {v7, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 181
    move-result-object v9

    .line 182
    .line 183
    const-string v7, "com.google.protobuf.GeneratedExtensionRegistryLoader"

    .line 184
    .line 185
    .line 186
    invoke-virtual/range {v5 .. v10}, Ljava/util/logging/Logger;->logp(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 187
    goto :goto_5

    .line 188
    .line 189
    .line 190
    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 191
    move-result v0

    .line 192
    .line 193
    if-ne v0, v3, :cond_2

    .line 194
    .line 195
    .line 196
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 197
    move-result-object p0

    .line 198
    .line 199
    check-cast p0, Lcom/google/android/gms/internal/measurement/zzlq;

    .line 200
    return-object p0

    .line 201
    .line 202
    .line 203
    :cond_2
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 204
    move-result v0

    .line 205
    const/4 v1, 0x0

    .line 206
    .line 207
    if-nez v0, :cond_3

    .line 208
    return-object v1

    .line 209
    .line 210
    :cond_3
    :try_start_4
    const-string v0, "combine"

    .line 211
    .line 212
    const-class v3, Ljava/util/Collection;

    .line 213
    .line 214
    .line 215
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 216
    move-result-object v3

    .line 217
    .line 218
    .line 219
    invoke-virtual {p0, v0, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 220
    move-result-object p0

    .line 221
    .line 222
    .line 223
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 224
    move-result-object v0

    .line 225
    .line 226
    .line 227
    invoke-virtual {p0, v1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 228
    move-result-object p0

    .line 229
    .line 230
    check-cast p0, Lcom/google/android/gms/internal/measurement/zzlq;
    :try_end_4
    .catch Ljava/lang/NoSuchMethodException; {:try_start_4 .. :try_end_4} :catch_8
    .catch Ljava/lang/IllegalAccessException; {:try_start_4 .. :try_end_4} :catch_7
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_4 .. :try_end_4} :catch_6

    .line 231
    return-object p0

    .line 232
    :catch_6
    move-exception v0

    .line 233
    move-object p0, v0

    .line 234
    .line 235
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 236
    .line 237
    .line 238
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 239
    throw v0

    .line 240
    :catch_7
    move-exception v0

    .line 241
    move-object p0, v0

    .line 242
    .line 243
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 244
    .line 245
    .line 246
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 247
    throw v0

    .line 248
    :catch_8
    move-exception v0

    .line 249
    move-object p0, v0

    .line 250
    .line 251
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 252
    .line 253
    .line 254
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 255
    throw v0

    .line 256
    .line 257
    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 258
    .line 259
    .line 260
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 261
    move-result-object p0

    .line 262
    .line 263
    .line 264
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 265
    throw v0
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


# virtual methods
.method public abstract zza()Lcom/google/android/gms/internal/measurement/zzlq;
.end method
