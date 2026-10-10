.class final Lcom/facebook/react/modules/core/JavaTimerManager$TimerFrameCallback;
.super Ljava/lang/Object;
.source "JavaTimerManager.kt"

# interfaces
.implements Landroid/view/Choreographer$FrameCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/modules/core/JavaTimerManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "TimerFrameCallback"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/facebook/react/modules/core/JavaTimerManager$TimerFrameCallback;",
        "Landroid/view/Choreographer$FrameCallback;",
        "<init>",
        "(Lcom/facebook/react/modules/core/JavaTimerManager;)V",
        "timersToCall",
        "Lcom/facebook/react/bridge/WritableArray;",
        "doFrame",
        "",
        "frameTimeNanos",
        "",
        "ReactAndroid_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/modules/core/JavaTimerManager;

.field private timersToCall:Lcom/facebook/react/bridge/WritableArray;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/facebook/react/modules/core/JavaTimerManager;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/facebook/react/modules/core/JavaTimerManager$TimerFrameCallback;->this$0:Lcom/facebook/react/modules/core/JavaTimerManager;

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
.end method


# virtual methods
.method public doFrame(J)V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/modules/core/JavaTimerManager$TimerFrameCallback;->this$0:Lcom/facebook/react/modules/core/JavaTimerManager;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/facebook/react/modules/core/JavaTimerManager;->access$isPaused$p(Lcom/facebook/react/modules/core/JavaTimerManager;)Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lcom/facebook/react/modules/core/JavaTimerManager$TimerFrameCallback;->this$0:Lcom/facebook/react/modules/core/JavaTimerManager;

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Lcom/facebook/react/modules/core/JavaTimerManager;->access$isRunningTasks$p(Lcom/facebook/react/modules/core/JavaTimerManager;)Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 22
    move-result v0

    .line 23
    .line 24
    if-nez v0, :cond_0

    .line 25
    return-void

    .line 26
    .line 27
    .line 28
    :cond_0
    const v0, 0xf4240

    .line 29
    int-to-long v0, v0

    .line 30
    div-long/2addr p1, v0

    .line 31
    .line 32
    iget-object v0, p0, Lcom/facebook/react/modules/core/JavaTimerManager$TimerFrameCallback;->this$0:Lcom/facebook/react/modules/core/JavaTimerManager;

    .line 33
    .line 34
    .line 35
    invoke-static {v0}, Lcom/facebook/react/modules/core/JavaTimerManager;->access$getTimerGuard$p(Lcom/facebook/react/modules/core/JavaTimerManager;)Ljava/lang/Object;

    .line 36
    move-result-object v0

    .line 37
    .line 38
    iget-object v1, p0, Lcom/facebook/react/modules/core/JavaTimerManager$TimerFrameCallback;->this$0:Lcom/facebook/react/modules/core/JavaTimerManager;

    .line 39
    monitor-enter v0

    .line 40
    .line 41
    .line 42
    :goto_0
    :try_start_0
    invoke-static {v1}, Lcom/facebook/react/modules/core/JavaTimerManager;->access$getTimers$p(Lcom/facebook/react/modules/core/JavaTimerManager;)Ljava/util/PriorityQueue;

    .line 43
    move-result-object v2

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 47
    move-result v2

    .line 48
    .line 49
    if-nez v2, :cond_5

    .line 50
    .line 51
    .line 52
    invoke-static {v1}, Lcom/facebook/react/modules/core/JavaTimerManager;->access$getTimers$p(Lcom/facebook/react/modules/core/JavaTimerManager;)Ljava/util/PriorityQueue;

    .line 53
    move-result-object v2

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2}, Ljava/util/PriorityQueue;->peek()Ljava/lang/Object;

    .line 57
    move-result-object v2

    .line 58
    .line 59
    .line 60
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 61
    .line 62
    check-cast v2, Lcom/facebook/react/modules/core/JavaTimerManager$Timer;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2}, Lcom/facebook/react/modules/core/JavaTimerManager$Timer;->getTargetTime()J

    .line 66
    move-result-wide v2

    .line 67
    .line 68
    cmp-long v2, v2, p1

    .line 69
    .line 70
    if-gez v2, :cond_5

    .line 71
    .line 72
    .line 73
    invoke-static {v1}, Lcom/facebook/react/modules/core/JavaTimerManager;->access$getTimers$p(Lcom/facebook/react/modules/core/JavaTimerManager;)Ljava/util/PriorityQueue;

    .line 74
    move-result-object v2

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2}, Ljava/util/PriorityQueue;->poll()Ljava/lang/Object;

    .line 78
    move-result-object v2

    .line 79
    .line 80
    check-cast v2, Lcom/facebook/react/modules/core/JavaTimerManager$Timer;

    .line 81
    .line 82
    if-nez v2, :cond_1

    .line 83
    goto :goto_2

    .line 84
    .line 85
    :cond_1
    iget-object v3, p0, Lcom/facebook/react/modules/core/JavaTimerManager$TimerFrameCallback;->timersToCall:Lcom/facebook/react/bridge/WritableArray;

    .line 86
    .line 87
    if-nez v3, :cond_2

    .line 88
    .line 89
    .line 90
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createArray()Lcom/facebook/react/bridge/WritableArray;

    .line 91
    move-result-object v3

    .line 92
    .line 93
    iput-object v3, p0, Lcom/facebook/react/modules/core/JavaTimerManager$TimerFrameCallback;->timersToCall:Lcom/facebook/react/bridge/WritableArray;

    .line 94
    goto :goto_1

    .line 95
    :catchall_0
    move-exception p1

    .line 96
    goto :goto_3

    .line 97
    .line 98
    :cond_2
    :goto_1
    iget-object v3, p0, Lcom/facebook/react/modules/core/JavaTimerManager$TimerFrameCallback;->timersToCall:Lcom/facebook/react/bridge/WritableArray;

    .line 99
    .line 100
    if-eqz v3, :cond_3

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2}, Lcom/facebook/react/modules/core/JavaTimerManager$Timer;->getTimerId()I

    .line 104
    move-result v4

    .line 105
    .line 106
    .line 107
    invoke-interface {v3, v4}, Lcom/facebook/react/bridge/WritableArray;->pushInt(I)V

    .line 108
    .line 109
    .line 110
    :cond_3
    invoke-virtual {v2}, Lcom/facebook/react/modules/core/JavaTimerManager$Timer;->getRepeat()Z

    .line 111
    move-result v3

    .line 112
    .line 113
    if-eqz v3, :cond_4

    .line 114
    .line 115
    .line 116
    invoke-virtual {v2}, Lcom/facebook/react/modules/core/JavaTimerManager$Timer;->getInterval()I

    .line 117
    move-result v3

    .line 118
    int-to-long v3, v3

    .line 119
    add-long/2addr v3, p1

    .line 120
    .line 121
    .line 122
    invoke-virtual {v2, v3, v4}, Lcom/facebook/react/modules/core/JavaTimerManager$Timer;->setTargetTime(J)V

    .line 123
    .line 124
    .line 125
    invoke-static {v1}, Lcom/facebook/react/modules/core/JavaTimerManager;->access$getTimers$p(Lcom/facebook/react/modules/core/JavaTimerManager;)Ljava/util/PriorityQueue;

    .line 126
    move-result-object v3

    .line 127
    .line 128
    .line 129
    invoke-virtual {v3, v2}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    .line 130
    goto :goto_0

    .line 131
    .line 132
    .line 133
    :cond_4
    invoke-static {v1}, Lcom/facebook/react/modules/core/JavaTimerManager;->access$getTimerIdsToTimers$p(Lcom/facebook/react/modules/core/JavaTimerManager;)Landroid/util/SparseArray;

    .line 134
    move-result-object v3

    .line 135
    .line 136
    .line 137
    invoke-virtual {v2}, Lcom/facebook/react/modules/core/JavaTimerManager$Timer;->getTimerId()I

    .line 138
    move-result v2

    .line 139
    .line 140
    .line 141
    invoke-virtual {v3, v2}, Landroid/util/SparseArray;->remove(I)V

    .line 142
    goto :goto_0

    .line 143
    .line 144
    :cond_5
    :goto_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 145
    monitor-exit v0

    .line 146
    .line 147
    iget-object p1, p0, Lcom/facebook/react/modules/core/JavaTimerManager$TimerFrameCallback;->timersToCall:Lcom/facebook/react/bridge/WritableArray;

    .line 148
    .line 149
    if-eqz p1, :cond_6

    .line 150
    .line 151
    iget-object p2, p0, Lcom/facebook/react/modules/core/JavaTimerManager$TimerFrameCallback;->this$0:Lcom/facebook/react/modules/core/JavaTimerManager;

    .line 152
    .line 153
    .line 154
    invoke-static {p2}, Lcom/facebook/react/modules/core/JavaTimerManager;->access$getJavaScriptTimerExecutor$p(Lcom/facebook/react/modules/core/JavaTimerManager;)Lcom/facebook/react/modules/core/JavaScriptTimerExecutor;

    .line 155
    move-result-object p2

    .line 156
    .line 157
    .line 158
    invoke-interface {p2, p1}, Lcom/facebook/react/modules/core/JavaScriptTimerExecutor;->callTimers(Lcom/facebook/react/bridge/WritableArray;)V

    .line 159
    const/4 p1, 0x0

    .line 160
    .line 161
    iput-object p1, p0, Lcom/facebook/react/modules/core/JavaTimerManager$TimerFrameCallback;->timersToCall:Lcom/facebook/react/bridge/WritableArray;

    .line 162
    .line 163
    :cond_6
    iget-object p1, p0, Lcom/facebook/react/modules/core/JavaTimerManager$TimerFrameCallback;->this$0:Lcom/facebook/react/modules/core/JavaTimerManager;

    .line 164
    .line 165
    .line 166
    invoke-static {p1}, Lcom/facebook/react/modules/core/JavaTimerManager;->access$getReactChoreographer$p(Lcom/facebook/react/modules/core/JavaTimerManager;)Lcom/facebook/react/modules/core/ReactChoreographer;

    .line 167
    move-result-object p1

    .line 168
    .line 169
    sget-object p2, Lcom/facebook/react/modules/core/ReactChoreographer$CallbackType;->TIMERS_EVENTS:Lcom/facebook/react/modules/core/ReactChoreographer$CallbackType;

    .line 170
    .line 171
    .line 172
    invoke-virtual {p1, p2, p0}, Lcom/facebook/react/modules/core/ReactChoreographer;->postFrameCallback(Lcom/facebook/react/modules/core/ReactChoreographer$CallbackType;Landroid/view/Choreographer$FrameCallback;)V

    .line 173
    return-void

    .line 174
    :goto_3
    monitor-exit v0

    .line 175
    throw p1
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
