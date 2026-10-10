.class public final Lcom/sumsub/sns/internal/core/exception/c;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# static fields
.field public static final d:Ljava/util/Set;


# instance fields
.field public final a:Ljava/lang/Object;

.field public b:Z

.field public c:Ljava/lang/Thread$UncaughtExceptionHandler;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    .line 2
    const-string v0, "com.kinegram"

    .line 3
    .line 4
    const-string v1, "com.twilio"

    .line 5
    .line 6
    const-string v2, "com.sumsub"

    .line 7
    .line 8
    const-string v3, "de.authada"

    .line 9
    .line 10
    .line 11
    const-string/jumbo v4, "org.jmrtd"

    .line 12
    .line 13
    .line 14
    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/String;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    .line 18
    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    sput-object v0, Lcom/sumsub/sns/internal/core/exception/c;->d:Ljava/util/Set;

    .line 22
    return-void
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

.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/sumsub/sns/internal/core/exception/c;->a:Ljava/lang/Object;

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public static a(Landroid/content/Context;Lcom/sumsub/sns/internal/core/domain/h;)Lcom/sumsub/sns/internal/core/exception/d;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/core/common/K0;

    .line 3
    .line 4
    sget-boolean v1, Lcom/sumsub/sns/internal/core/common/P0;->a:Z

    .line 5
    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    sget-object v1, Lcom/sumsub/sns/internal/core/common/P0;->c:Lcom/sumsub/sns/internal/core/common/SNSSession;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    const/4 v1, 0x0

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/core/common/SNSSession;->getUrl()Ljava/lang/String;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    iget-object v2, p1, Lcom/sumsub/sns/internal/core/domain/h;->N:Lcom/sumsub/sns/internal/core/domain/c;

    .line 18
    .line 19
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/domain/h;->M:Lcom/sumsub/sns/internal/core/domain/a;

    .line 20
    .line 21
    .line 22
    invoke-direct {v0, p0, v1, v2, p1}, Lcom/sumsub/sns/internal/core/common/K0;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/sumsub/sns/internal/core/domain/c;Lcom/sumsub/sns/internal/core/domain/a;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 26
    move-result-object p0

    .line 27
    .line 28
    new-instance p1, Lcom/sumsub/sns/internal/log/cacher/l;

    .line 29
    .line 30
    const-string v1, "SNSExceptionSink"

    .line 31
    .line 32
    const/16 v2, 0xc

    .line 33
    .line 34
    .line 35
    invoke-direct {p1, v1, v0, p0, v2}, Lcom/sumsub/sns/internal/log/cacher/l;-><init>(Ljava/lang/String;Lcom/sumsub/sns/internal/log/cacher/a;Ljava/io/File;I)V

    .line 36
    .line 37
    sget-object p0, Lcom/sumsub/sns/internal/log/cacher/e;->b:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    new-instance p0, Lcom/sumsub/sns/internal/core/exception/d;

    .line 43
    .line 44
    .line 45
    invoke-direct {p0, p1}, Lcom/sumsub/sns/internal/core/exception/d;-><init>(Lcom/sumsub/sns/internal/log/cacher/l;)V

    .line 46
    return-object p0

    .line 47
    .line 48
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 49
    .line 50
    const-string p1, "Failed requirement."

    .line 51
    .line 52
    .line 53
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 54
    throw p0
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
.end method


# virtual methods
.method public final b(Landroid/content/Context;Lcom/sumsub/sns/internal/core/domain/h;)V
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/exception/c;->a:Ljava/lang/Object;

    .line 4
    monitor-enter v1

    .line 5
    .line 6
    :try_start_0
    iget-boolean v2, p0, Lcom/sumsub/sns/internal/core/exception/c;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    monitor-exit v1

    .line 10
    return-void

    .line 11
    .line 12
    .line 13
    :cond_0
    :try_start_1
    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 14
    move-result-object v2

    .line 15
    .line 16
    new-instance v3, Lcom/sumsub/sns/internal/core/exception/b;

    .line 17
    const/4 v4, 0x0

    .line 18
    .line 19
    .line 20
    invoke-direct {v3, p2, v4}, Lcom/sumsub/sns/internal/core/exception/b;-><init>(Lcom/sumsub/sns/internal/core/domain/h;Lkotlin/coroutines/Continuation;)V

    .line 21
    .line 22
    new-instance v4, Lcom/sumsub/sentry/c0;

    .line 23
    .line 24
    iget-object v5, p2, Lcom/sumsub/sns/internal/core/domain/h;->a:Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    invoke-direct {v4, v5}, Lcom/sumsub/sentry/c0;-><init>(Landroid/content/Context;)V

    .line 28
    .line 29
    new-instance v5, Lcom/sumsub/sns/internal/core/exception/j;

    .line 30
    .line 31
    iget-object v6, p2, Lcom/sumsub/sns/internal/core/domain/h;->o:Lkotlin/Lazy;

    .line 32
    .line 33
    .line 34
    invoke-interface {v6}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 35
    move-result-object v6

    .line 36
    .line 37
    check-cast v6, Lcom/sumsub/sns/internal/log/cacher/c;

    .line 38
    .line 39
    .line 40
    invoke-direct {v5, v4, v6}, Lcom/sumsub/sns/internal/core/exception/j;-><init>(Lcom/sumsub/sentry/c0;Lcom/sumsub/sns/internal/log/cacher/c;)V

    .line 41
    .line 42
    .line 43
    invoke-static {p1, p2}, Lcom/sumsub/sns/internal/core/exception/c;->a(Landroid/content/Context;Lcom/sumsub/sns/internal/core/domain/h;)Lcom/sumsub/sns/internal/core/exception/d;

    .line 44
    move-result-object p1

    .line 45
    .line 46
    new-instance p2, Lcom/sumsub/sns/internal/core/exception/i;

    .line 47
    .line 48
    new-instance v4, Lcom/sumsub/sns/internal/core/exception/a;

    .line 49
    .line 50
    sget-object v6, Lcom/sumsub/sns/internal/core/exception/c;->d:Ljava/util/Set;

    .line 51
    .line 52
    .line 53
    invoke-direct {v4, v6}, Lcom/sumsub/sns/internal/core/exception/a;-><init>(Ljava/util/Set;)V

    .line 54
    const/4 v6, 0x2

    .line 55
    .line 56
    new-array v6, v6, [Lcom/sumsub/sns/internal/core/exception/e;

    .line 57
    const/4 v7, 0x0

    .line 58
    .line 59
    aput-object v5, v6, v7

    .line 60
    .line 61
    aput-object p1, v6, v0

    .line 62
    .line 63
    .line 64
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 65
    move-result-object p1

    .line 66
    .line 67
    .line 68
    invoke-direct {p2, v4, p1, v3, v2}, Lcom/sumsub/sns/internal/core/exception/i;-><init>(Lcom/sumsub/sns/internal/core/exception/a;Ljava/util/List;Lcom/sumsub/sns/internal/core/exception/b;Ljava/lang/Thread$UncaughtExceptionHandler;)V

    .line 69
    .line 70
    .line 71
    invoke-static {p2}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    .line 72
    .line 73
    iput-object v2, p0, Lcom/sumsub/sns/internal/core/exception/c;->c:Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 74
    .line 75
    iput-boolean v0, p0, Lcom/sumsub/sns/internal/core/exception/c;->b:Z

    .line 76
    .line 77
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 78
    monitor-exit v1

    .line 79
    return-void

    .line 80
    :catchall_0
    move-exception p1

    .line 81
    monitor-exit v1

    .line 82
    throw p1
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
.end method
