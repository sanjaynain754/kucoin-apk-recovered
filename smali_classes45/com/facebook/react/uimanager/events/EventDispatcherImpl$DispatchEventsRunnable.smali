.class Lcom/facebook/react/uimanager/events/EventDispatcherImpl$DispatchEventsRunnable;
.super Ljava/lang/Object;
.source "EventDispatcherImpl.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/uimanager/events/EventDispatcherImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "DispatchEventsRunnable"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/uimanager/events/EventDispatcherImpl;


# direct methods
.method private constructor <init>(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl$DispatchEventsRunnable;->this$0:Lcom/facebook/react/uimanager/events/EventDispatcherImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;Lcom/facebook/react/uimanager/events/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/uimanager/events/EventDispatcherImpl$DispatchEventsRunnable;-><init>(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 1
    .line 2
    const-string v0, "DispatchEventsRunnable"

    .line 3
    .line 4
    const-wide/16 v1, 0x0

    .line 5
    .line 6
    .line 7
    invoke-static {v1, v2, v0}, Lcom/facebook/systrace/Systrace;->c(JLjava/lang/String;)V

    .line 8
    .line 9
    :try_start_0
    const-string v0, "ScheduleDispatchFrameCallback"

    .line 10
    .line 11
    iget-object v3, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl$DispatchEventsRunnable;->this$0:Lcom/facebook/react/uimanager/events/EventDispatcherImpl;

    .line 12
    .line 13
    .line 14
    invoke-static {v3}, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->h(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;)Ljava/util/concurrent/atomic/AtomicInteger;

    .line 15
    move-result-object v3

    .line 16
    .line 17
    .line 18
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 19
    move-result v3

    .line 20
    .line 21
    .line 22
    invoke-static {v1, v2, v0, v3}, Lcom/facebook/systrace/Systrace;->f(JLjava/lang/String;I)V

    .line 23
    .line 24
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl$DispatchEventsRunnable;->this$0:Lcom/facebook/react/uimanager/events/EventDispatcherImpl;

    .line 25
    const/4 v3, 0x0

    .line 26
    .line 27
    .line 28
    invoke-static {v0, v3}, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->l(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;Z)V

    .line 29
    .line 30
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl$DispatchEventsRunnable;->this$0:Lcom/facebook/react/uimanager/events/EventDispatcherImpl;

    .line 31
    .line 32
    .line 33
    invoke-static {v0}, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->k(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;)Lcom/facebook/react/uimanager/events/ReactEventEmitter;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    .line 37
    invoke-static {v0}, Lh6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl$DispatchEventsRunnable;->this$0:Lcom/facebook/react/uimanager/events/EventDispatcherImpl;

    .line 40
    .line 41
    .line 42
    invoke-static {v0}, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->e(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;)Ljava/lang/Object;

    .line 43
    move-result-object v0

    .line 44
    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 45
    .line 46
    :try_start_1
    iget-object v4, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl$DispatchEventsRunnable;->this$0:Lcom/facebook/react/uimanager/events/EventDispatcherImpl;

    .line 47
    .line 48
    .line 49
    invoke-static {v4}, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->f(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;)I

    .line 50
    move-result v4

    .line 51
    .line 52
    if-lez v4, :cond_3

    .line 53
    .line 54
    iget-object v4, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl$DispatchEventsRunnable;->this$0:Lcom/facebook/react/uimanager/events/EventDispatcherImpl;

    .line 55
    .line 56
    .line 57
    invoke-static {v4}, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->f(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;)I

    .line 58
    move-result v4

    .line 59
    const/4 v5, 0x1

    .line 60
    .line 61
    if-le v4, v5, :cond_0

    .line 62
    .line 63
    iget-object v4, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl$DispatchEventsRunnable;->this$0:Lcom/facebook/react/uimanager/events/EventDispatcherImpl;

    .line 64
    .line 65
    .line 66
    invoke-static {v4}, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->d(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;)[Lcom/facebook/react/uimanager/events/Event;

    .line 67
    move-result-object v4

    .line 68
    .line 69
    iget-object v5, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl$DispatchEventsRunnable;->this$0:Lcom/facebook/react/uimanager/events/EventDispatcherImpl;

    .line 70
    .line 71
    .line 72
    invoke-static {v5}, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->f(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;)I

    .line 73
    move-result v5

    .line 74
    .line 75
    .line 76
    invoke-static {}, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->p()Ljava/util/Comparator;

    .line 77
    move-result-object v6

    .line 78
    .line 79
    .line 80
    invoke-static {v4, v3, v5, v6}, Ljava/util/Arrays;->sort([Ljava/lang/Object;IILjava/util/Comparator;)V

    .line 81
    goto :goto_0

    .line 82
    :catchall_0
    move-exception v3

    .line 83
    goto :goto_3

    .line 84
    .line 85
    :cond_0
    :goto_0
    iget-object v4, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl$DispatchEventsRunnable;->this$0:Lcom/facebook/react/uimanager/events/EventDispatcherImpl;

    .line 86
    .line 87
    .line 88
    invoke-static {v4}, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->f(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;)I

    .line 89
    move-result v4

    .line 90
    .line 91
    if-ge v3, v4, :cond_2

    .line 92
    .line 93
    iget-object v4, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl$DispatchEventsRunnable;->this$0:Lcom/facebook/react/uimanager/events/EventDispatcherImpl;

    .line 94
    .line 95
    .line 96
    invoke-static {v4}, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->d(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;)[Lcom/facebook/react/uimanager/events/Event;

    .line 97
    move-result-object v4

    .line 98
    .line 99
    aget-object v4, v4, v3

    .line 100
    .line 101
    if-nez v4, :cond_1

    .line 102
    goto :goto_1

    .line 103
    .line 104
    .line 105
    :cond_1
    invoke-virtual {v4}, Lcom/facebook/react/uimanager/events/Event;->getEventName()Ljava/lang/String;

    .line 106
    move-result-object v5

    .line 107
    .line 108
    .line 109
    invoke-virtual {v4}, Lcom/facebook/react/uimanager/events/Event;->getUniqueID()I

    .line 110
    move-result v6

    .line 111
    .line 112
    .line 113
    invoke-static {v1, v2, v5, v6}, Lcom/facebook/systrace/Systrace;->f(JLjava/lang/String;I)V

    .line 114
    .line 115
    iget-object v5, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl$DispatchEventsRunnable;->this$0:Lcom/facebook/react/uimanager/events/EventDispatcherImpl;

    .line 116
    .line 117
    .line 118
    invoke-static {v5}, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->k(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;)Lcom/facebook/react/uimanager/events/ReactEventEmitter;

    .line 119
    move-result-object v5

    .line 120
    .line 121
    .line 122
    invoke-virtual {v4, v5}, Lcom/facebook/react/uimanager/events/Event;->dispatchModern(Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v4}, Lcom/facebook/react/uimanager/events/Event;->dispose()V

    .line 126
    .line 127
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 128
    goto :goto_0

    .line 129
    .line 130
    :cond_2
    iget-object v3, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl$DispatchEventsRunnable;->this$0:Lcom/facebook/react/uimanager/events/EventDispatcherImpl;

    .line 131
    .line 132
    .line 133
    invoke-static {v3}, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->m(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;)V

    .line 134
    .line 135
    iget-object v3, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl$DispatchEventsRunnable;->this$0:Lcom/facebook/react/uimanager/events/EventDispatcherImpl;

    .line 136
    .line 137
    .line 138
    invoke-static {v3}, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->c(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;)Landroid/util/LongSparseArray;

    .line 139
    move-result-object v3

    .line 140
    .line 141
    .line 142
    invoke-virtual {v3}, Landroid/util/LongSparseArray;->clear()V

    .line 143
    :cond_3
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 144
    .line 145
    :try_start_2
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl$DispatchEventsRunnable;->this$0:Lcom/facebook/react/uimanager/events/EventDispatcherImpl;

    .line 146
    .line 147
    .line 148
    invoke-static {v0}, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->i(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 149
    move-result-object v0

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 153
    move-result-object v0

    .line 154
    .line 155
    .line 156
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 157
    move-result v3

    .line 158
    .line 159
    if-eqz v3, :cond_4

    .line 160
    .line 161
    .line 162
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 163
    move-result-object v3

    .line 164
    .line 165
    check-cast v3, Lcom/facebook/react/uimanager/events/BatchEventDispatchedListener;

    .line 166
    .line 167
    .line 168
    invoke-interface {v3}, Lcom/facebook/react/uimanager/events/BatchEventDispatchedListener;->onBatchEventDispatched()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 169
    goto :goto_2

    .line 170
    :catchall_1
    move-exception v0

    .line 171
    goto :goto_4

    .line 172
    .line 173
    .line 174
    :cond_4
    invoke-static {v1, v2}, Lcom/facebook/systrace/Systrace;->i(J)V

    .line 175
    return-void

    .line 176
    :goto_3
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 177
    :try_start_4
    throw v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 178
    .line 179
    .line 180
    :goto_4
    invoke-static {v1, v2}, Lcom/facebook/systrace/Systrace;->i(J)V

    .line 181
    throw v0
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
.end method
