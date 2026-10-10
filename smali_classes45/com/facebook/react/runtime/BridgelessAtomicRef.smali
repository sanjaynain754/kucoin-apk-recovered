.class Lcom/facebook/react/runtime/BridgelessAtomicRef;
.super Ljava/lang/Object;
.source "BridgelessAtomicRef.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/runtime/BridgelessAtomicRef$State;,
        Lcom/facebook/react/runtime/BridgelessAtomicRef$Provider;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private volatile failureMessage:Ljava/lang/String;

.field mInitialValue:Ljava/lang/Object;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field volatile mValue:Ljava/lang/Object;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private volatile state:Lcom/facebook/react/runtime/BridgelessAtomicRef$State;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 6
    invoke-direct {p0, v0}, Lcom/facebook/react/runtime/BridgelessAtomicRef;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/facebook/react/runtime/BridgelessAtomicRef;->mValue:Ljava/lang/Object;

    .line 3
    iput-object p1, p0, Lcom/facebook/react/runtime/BridgelessAtomicRef;->mInitialValue:Ljava/lang/Object;

    .line 4
    sget-object p1, Lcom/facebook/react/runtime/BridgelessAtomicRef$State;->Init:Lcom/facebook/react/runtime/BridgelessAtomicRef$State;

    iput-object p1, p0, Lcom/facebook/react/runtime/BridgelessAtomicRef;->state:Lcom/facebook/react/runtime/BridgelessAtomicRef$State;

    .line 5
    const-string p1, ""

    iput-object p1, p0, Lcom/facebook/react/runtime/BridgelessAtomicRef;->failureMessage:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public declared-synchronized get()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/facebook/react/runtime/BridgelessAtomicRef;->mValue:Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lh6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    monitor-exit p0

    .line 9
    return-object v0

    .line 10
    :catchall_0
    move-exception v0

    .line 11
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 12
    throw v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public declared-synchronized getAndReset()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-virtual {p0}, Lcom/facebook/react/runtime/BridgelessAtomicRef;->get()Ljava/lang/Object;

    .line 5
    move-result-object v0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/facebook/react/runtime/BridgelessAtomicRef;->reset()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    monitor-exit p0

    .line 10
    return-object v0

    .line 11
    :catchall_0
    move-exception v0

    .line 12
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 13
    throw v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public declared-synchronized getNullable()Ljava/lang/Object;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/facebook/react/runtime/BridgelessAtomicRef;->mValue:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    monitor-exit p0

    .line 5
    return-object v0

    .line 6
    :catchall_0
    move-exception v0

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw v0
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

.method public getOrCreate(Lcom/facebook/react/runtime/BridgelessAtomicRef$Provider;)Ljava/lang/Object;
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "CatchGeneralException"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/react/runtime/BridgelessAtomicRef$Provider<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/facebook/react/runtime/BridgelessAtomicRef;->state:Lcom/facebook/react/runtime/BridgelessAtomicRef$State;

    .line 4
    .line 5
    sget-object v1, Lcom/facebook/react/runtime/BridgelessAtomicRef$State;->Success:Lcom/facebook/react/runtime/BridgelessAtomicRef$State;

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/facebook/react/runtime/BridgelessAtomicRef;->get()Ljava/lang/Object;

    .line 11
    move-result-object p1

    .line 12
    monitor-exit p0

    .line 13
    return-object p1

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    .line 16
    goto/16 :goto_3

    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/runtime/BridgelessAtomicRef;->state:Lcom/facebook/react/runtime/BridgelessAtomicRef$State;

    .line 19
    .line 20
    sget-object v2, Lcom/facebook/react/runtime/BridgelessAtomicRef$State;->Failure:Lcom/facebook/react/runtime/BridgelessAtomicRef$State;

    .line 21
    .line 22
    if-eq v0, v2, :cond_6

    .line 23
    .line 24
    iget-object v0, p0, Lcom/facebook/react/runtime/BridgelessAtomicRef;->state:Lcom/facebook/react/runtime/BridgelessAtomicRef$State;

    .line 25
    .line 26
    sget-object v2, Lcom/facebook/react/runtime/BridgelessAtomicRef$State;->Creating:Lcom/facebook/react/runtime/BridgelessAtomicRef$State;

    .line 27
    const/4 v3, 0x1

    .line 28
    const/4 v4, 0x0

    .line 29
    .line 30
    if-eq v0, v2, :cond_1

    .line 31
    .line 32
    iput-object v2, p0, Lcom/facebook/react/runtime/BridgelessAtomicRef;->state:Lcom/facebook/react/runtime/BridgelessAtomicRef$State;

    .line 33
    move v0, v3

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    move v0, v4

    .line 36
    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    .line 41
    :try_start_1
    invoke-interface {p1}, Lcom/facebook/react/runtime/BridgelessAtomicRef$Provider;->get()Ljava/lang/Object;

    .line 42
    move-result-object p1

    .line 43
    .line 44
    iput-object p1, p0, Lcom/facebook/react/runtime/BridgelessAtomicRef;->mValue:Ljava/lang/Object;

    .line 45
    monitor-enter p0
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    .line 46
    .line 47
    :try_start_2
    iput-object v1, p0, Lcom/facebook/react/runtime/BridgelessAtomicRef;->state:Lcom/facebook/react/runtime/BridgelessAtomicRef$State;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Lcom/facebook/react/runtime/BridgelessAtomicRef;->get()Ljava/lang/Object;

    .line 54
    move-result-object p1

    .line 55
    monitor-exit p0

    .line 56
    return-object p1

    .line 57
    :catchall_1
    move-exception p1

    .line 58
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 59
    :try_start_3
    throw p1
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_0

    .line 60
    :catch_0
    move-exception p1

    .line 61
    monitor-enter p0

    .line 62
    .line 63
    :try_start_4
    sget-object v0, Lcom/facebook/react/runtime/BridgelessAtomicRef$State;->Failure:Lcom/facebook/react/runtime/BridgelessAtomicRef$State;

    .line 64
    .line 65
    iput-object v0, p0, Lcom/facebook/react/runtime/BridgelessAtomicRef;->state:Lcom/facebook/react/runtime/BridgelessAtomicRef$State;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 69
    move-result-object v0

    .line 70
    .line 71
    const-string v1, "null"

    .line 72
    .line 73
    .line 74
    invoke-static {v0, v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 75
    move-result-object v0

    .line 76
    .line 77
    iput-object v0, p0, Lcom/facebook/react/runtime/BridgelessAtomicRef;->failureMessage:Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 81
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 82
    .line 83
    new-instance v0, Ljava/lang/RuntimeException;

    .line 84
    .line 85
    const-string v1, "BridgelessAtomicRef: Failed to create object."

    .line 86
    .line 87
    .line 88
    invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 89
    throw v0

    .line 90
    :catchall_2
    move-exception p1

    .line 91
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 92
    throw p1

    .line 93
    :cond_2
    monitor-enter p0

    .line 94
    .line 95
    :goto_1
    :try_start_6
    iget-object p1, p0, Lcom/facebook/react/runtime/BridgelessAtomicRef;->state:Lcom/facebook/react/runtime/BridgelessAtomicRef$State;

    .line 96
    .line 97
    sget-object v0, Lcom/facebook/react/runtime/BridgelessAtomicRef$State;->Creating:Lcom/facebook/react/runtime/BridgelessAtomicRef$State;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 98
    .line 99
    if-ne p1, v0, :cond_3

    .line 100
    .line 101
    .line 102
    :try_start_7
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V
    :try_end_7
    .catch Ljava/lang/InterruptedException; {:try_start_7 .. :try_end_7} :catch_1
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 103
    goto :goto_1

    .line 104
    :catchall_3
    move-exception p1

    .line 105
    goto :goto_2

    .line 106
    :catch_1
    move v4, v3

    .line 107
    goto :goto_1

    .line 108
    .line 109
    :cond_3
    if-eqz v4, :cond_4

    .line 110
    .line 111
    .line 112
    :try_start_8
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 113
    move-result-object p1

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    .line 117
    .line 118
    :cond_4
    iget-object p1, p0, Lcom/facebook/react/runtime/BridgelessAtomicRef;->state:Lcom/facebook/react/runtime/BridgelessAtomicRef$State;

    .line 119
    .line 120
    sget-object v0, Lcom/facebook/react/runtime/BridgelessAtomicRef$State;->Failure:Lcom/facebook/react/runtime/BridgelessAtomicRef$State;

    .line 121
    .line 122
    if-eq p1, v0, :cond_5

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0}, Lcom/facebook/react/runtime/BridgelessAtomicRef;->get()Ljava/lang/Object;

    .line 126
    move-result-object p1

    .line 127
    monitor-exit p0

    .line 128
    return-object p1

    .line 129
    .line 130
    :cond_5
    new-instance p1, Ljava/lang/RuntimeException;

    .line 131
    .line 132
    new-instance v0, Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 136
    .line 137
    const-string v1, "BridgelessAtomicRef: Failed to create object. Reason: "

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    iget-object v1, p0, Lcom/facebook/react/runtime/BridgelessAtomicRef;->failureMessage:Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 149
    move-result-object v0

    .line 150
    .line 151
    .line 152
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 153
    throw p1

    .line 154
    :goto_2
    monitor-exit p0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 155
    throw p1

    .line 156
    .line 157
    :cond_6
    :try_start_9
    new-instance p1, Ljava/lang/RuntimeException;

    .line 158
    .line 159
    new-instance v0, Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 163
    .line 164
    const-string v1, "BridgelessAtomicRef: Failed to create object. Reason: "

    .line 165
    .line 166
    .line 167
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    iget-object v1, p0, Lcom/facebook/react/runtime/BridgelessAtomicRef;->failureMessage:Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 176
    move-result-object v0

    .line 177
    .line 178
    .line 179
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 180
    throw p1

    .line 181
    :goto_3
    monitor-exit p0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 182
    throw p1
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

.method public declared-synchronized reset()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/facebook/react/runtime/BridgelessAtomicRef;->mInitialValue:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object v0, p0, Lcom/facebook/react/runtime/BridgelessAtomicRef;->mValue:Ljava/lang/Object;

    .line 6
    .line 7
    sget-object v0, Lcom/facebook/react/runtime/BridgelessAtomicRef$State;->Init:Lcom/facebook/react/runtime/BridgelessAtomicRef$State;

    .line 8
    .line 9
    iput-object v0, p0, Lcom/facebook/react/runtime/BridgelessAtomicRef;->state:Lcom/facebook/react/runtime/BridgelessAtomicRef$State;

    .line 10
    .line 11
    const-string v0, ""

    .line 12
    .line 13
    iput-object v0, p0, Lcom/facebook/react/runtime/BridgelessAtomicRef;->failureMessage:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    monitor-exit p0

    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception v0

    .line 17
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    throw v0
.end method
