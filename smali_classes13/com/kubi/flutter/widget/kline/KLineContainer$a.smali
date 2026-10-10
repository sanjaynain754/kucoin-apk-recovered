.class public final Lcom/kubi/flutter/widget/kline/KLineContainer$a;
.super Ljava/lang/Object;
.source "KLineContainer.kt"

# interfaces
.implements Lio/flutter/embedding/engine/renderer/FlutterUiDisplayListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/flutter/widget/kline/KLineContainer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u0010\u0004\u001a\u00020\u0005H\u0016J\u0008\u0010\u0006\u001a\u00020\u0005H\u0016\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/kubi/flutter/widget/kline/KLineContainer$FlutterViewDisplayListener;",
        "Lio/flutter/embedding/engine/renderer/FlutterUiDisplayListener;",
        "<init>",
        "(Lcom/kubi/flutter/widget/kline/KLineContainer;)V",
        "onFlutterUiDisplayed",
        "",
        "onFlutterUiNoLongerDisplayed",
        "LKLineWidget_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nKLineContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KLineContainer.kt\ncom/kubi/flutter/widget/kline/KLineContainer$FlutterViewDisplayListener\n+ 2 EventListeners.kt\ncom/kubi/flutter/widget/kline/utils/EventListeners\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 KLineIssue.kt\ncom/kubi/flutter/widget/kline/exception/KLineIssueKt\n*L\n1#1,476:1\n33#2,4:477\n37#2,4:482\n42#2:490\n43#2:492\n1869#3:481\n1870#3:491\n45#4,4:486\n*S KotlinDebug\n*F\n+ 1 KLineContainer.kt\ncom/kubi/flutter/widget/kline/KLineContainer$FlutterViewDisplayListener\n*L\n361#1:477,4\n361#1:482,4\n361#1:490\n361#1:492\n361#1:481\n361#1:491\n361#1:486,4\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/kubi/flutter/widget/kline/KLineContainer;


# direct methods
.method public constructor <init>(Lcom/kubi/flutter/widget/kline/KLineContainer;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/flutter/widget/kline/KLineContainer$a;->a:Lcom/kubi/flutter/widget/kline/KLineContainer;

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
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method


# virtual methods
.method public onFlutterUiDisplayed()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/flutter/widget/kline/KLineContainer$a;->a:Lcom/kubi/flutter/widget/kline/KLineContainer;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/kubi/flutter/widget/kline/KLineContainer;->n(Lcom/kubi/flutter/widget/kline/KLineContainer;)Ljava/util/concurrent/atomic/AtomicReference;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 12
    .line 13
    iget-object v0, p0, Lcom/kubi/flutter/widget/kline/KLineContainer$a;->a:Lcom/kubi/flutter/widget/kline/KLineContainer;

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Lcom/kubi/flutter/widget/kline/KLineContainer;->m(Lcom/kubi/flutter/widget/kline/KLineContainer;)Lcom/kubi/flutter/widget/kline/utils/f;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Lcom/kubi/flutter/widget/kline/utils/f;->a(Lcom/kubi/flutter/widget/kline/utils/f;)Ljava/util/Set;

    .line 21
    move-result-object v1

    .line 22
    monitor-enter v1

    .line 23
    .line 24
    .line 25
    :try_start_0
    invoke-static {v0}, Lcom/kubi/flutter/widget/kline/utils/f;->a(Lcom/kubi/flutter/widget/kline/utils/f;)Ljava/util/Set;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    .line 29
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    .line 30
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 31
    monitor-exit v1

    .line 32
    .line 33
    .line 34
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    .line 38
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    move-result v1

    .line 40
    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    .line 44
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    move-result-object v1

    .line 46
    .line 47
    :try_start_1
    check-cast v1, Lcom/kubi/flutter/widget/kline/b$a;

    .line 48
    .line 49
    .line 50
    invoke-interface {v1}, Lcom/kubi/flutter/widget/kline/b$a;->onFlutterUiDisplayed()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 51
    goto :goto_0

    .line 52
    :catchall_0
    move-exception v1

    .line 53
    .line 54
    const-string v2, "callListener error"

    .line 55
    .line 56
    .line 57
    invoke-static {v1}, Lny/b;->e(Ljava/lang/Throwable;)Z

    .line 58
    move-result v3

    .line 59
    .line 60
    if-nez v3, :cond_0

    .line 61
    .line 62
    .line 63
    invoke-static {v1, v2}, Log/a;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 64
    goto :goto_0

    .line 65
    :cond_1
    return-void

    .line 66
    :catchall_1
    move-exception v0

    .line 67
    monitor-exit v1

    .line 68
    throw v0
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
.end method

.method public onFlutterUiNoLongerDisplayed()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
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
.end method
