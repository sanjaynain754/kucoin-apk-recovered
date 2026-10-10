.class public final Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager$a;,
        Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager$b;
    }
.end annotation


# static fields
.field private static final DEBUG:Z = false

.field static final MSG_EXEC_PENDING_BROADCASTS:I = 0x1

.field private static final TAG:Ljava/lang/String; = "LocalBroadcastManager"

.field private static mInstance:Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager;

.field private static final mLock:Ljava/lang/Object;


# instance fields
.field private final mActions:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager$b;",
            ">;>;"
        }
    .end annotation
.end field

.field private final mAppContext:Landroid/content/Context;

.field private final mMainHandler:Landroid/os/Handler;

.field private final mPendingBroadcasts:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager$a;",
            ">;"
        }
    .end annotation
.end field

.field private final mReceivers:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Landroid/content/BroadcastReceiver;",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager$b;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager;->mLock:Ljava/lang/Object;

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
    .line 78
    .line 79
    .line 80
    .line 81
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/HashMap;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager;->mReceivers:Ljava/util/HashMap;

    .line 11
    .line 12
    new-instance v0, Ljava/util/HashMap;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 16
    .line 17
    iput-object v0, p0, Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager;->mActions:Ljava/util/HashMap;

    .line 18
    .line 19
    new-instance v0, Ljava/util/ArrayList;

    .line 20
    .line 21
    .line 22
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    iput-object v0, p0, Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager;->mPendingBroadcasts:Ljava/util/ArrayList;

    .line 25
    .line 26
    iput-object p1, p0, Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager;->mAppContext:Landroid/content/Context;

    .line 27
    .line 28
    new-instance v0, Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager$1;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    .line 32
    move-result-object p1

    .line 33
    .line 34
    .line 35
    invoke-direct {v0, p0, p1}, Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager$1;-><init>(Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager;Landroid/os/Looper;)V

    .line 36
    .line 37
    iput-object v0, p0, Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager;->mMainHandler:Landroid/os/Handler;

    .line 38
    return-void
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
.end method

.method public static getInstance()Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager;
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager;->mLock:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    sget-object v1, Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager;->mInstance:Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    new-instance v1, Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager;

    .line 10
    .line 11
    .line 12
    invoke-static {}, Lcom/tencent/liteav/base/ContextUtils;->getApplicationContext()Landroid/content/Context;

    .line 13
    move-result-object v2

    .line 14
    .line 15
    .line 16
    invoke-direct {v1, v2}, Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager;-><init>(Landroid/content/Context;)V

    .line 17
    .line 18
    sput-object v1, Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager;->mInstance:Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager;

    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception v1

    .line 21
    goto :goto_1

    .line 22
    .line 23
    :cond_0
    :goto_0
    sget-object v1, Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager;->mInstance:Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager;

    .line 24
    monitor-exit v0

    .line 25
    return-object v1

    .line 26
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    throw v1
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
    .line 78
    .line 79
    .line 80
    .line 81
.end method


# virtual methods
.method public final executePendingBroadcasts()V
    .locals 10

    .line 1
    .line 2
    :cond_0
    iget-object v0, p0, Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager;->mReceivers:Ljava/util/HashMap;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    iget-object v1, p0, Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager;->mPendingBroadcasts:Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 9
    move-result v1

    .line 10
    .line 11
    if-gtz v1, :cond_1

    .line 12
    monitor-exit v0

    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception v1

    .line 15
    goto :goto_2

    .line 16
    .line 17
    :cond_1
    new-array v2, v1, [Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager$a;

    .line 18
    .line 19
    iget-object v3, p0, Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager;->mPendingBroadcasts:Ljava/util/ArrayList;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 23
    .line 24
    iget-object v3, p0, Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager;->mPendingBroadcasts:Ljava/util/ArrayList;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 28
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    const/4 v0, 0x0

    .line 30
    move v3, v0

    .line 31
    .line 32
    :goto_0
    if-ge v3, v1, :cond_0

    .line 33
    .line 34
    aget-object v4, v2, v3

    .line 35
    .line 36
    iget-object v5, v4, Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager$a;->b:Ljava/util/ArrayList;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 40
    move-result v5

    .line 41
    move v6, v0

    .line 42
    .line 43
    :goto_1
    if-ge v6, v5, :cond_3

    .line 44
    .line 45
    iget-object v7, v4, Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager$a;->b:Ljava/util/ArrayList;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 49
    move-result-object v7

    .line 50
    .line 51
    check-cast v7, Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager$b;

    .line 52
    .line 53
    iget-boolean v8, v7, Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager$b;->d:Z

    .line 54
    .line 55
    if-nez v8, :cond_2

    .line 56
    .line 57
    iget-object v7, v7, Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager$b;->b:Landroid/content/BroadcastReceiver;

    .line 58
    .line 59
    iget-object v8, p0, Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager;->mAppContext:Landroid/content/Context;

    .line 60
    .line 61
    iget-object v9, v4, Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager$a;->a:Landroid/content/Intent;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v7, v8, v9}, Landroid/content/BroadcastReceiver;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V

    .line 65
    .line 66
    :cond_2
    add-int/lit8 v6, v6, 0x1

    .line 67
    goto :goto_1

    .line 68
    .line 69
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 70
    goto :goto_0

    .line 71
    :goto_2
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 72
    throw v1
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
.end method

.method public final registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager;->mReceivers:Ljava/util/HashMap;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    new-instance v1, Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager$b;

    .line 6
    .line 7
    .line 8
    invoke-direct {v1, p2, p1}, Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager$b;-><init>(Landroid/content/IntentFilter;Landroid/content/BroadcastReceiver;)V

    .line 9
    .line 10
    iget-object v2, p0, Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager;->mReceivers:Ljava/util/HashMap;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    move-result-object v2

    .line 15
    .line 16
    check-cast v2, Ljava/util/ArrayList;

    .line 17
    const/4 v3, 0x1

    .line 18
    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    new-instance v2, Ljava/util/ArrayList;

    .line 22
    .line 23
    .line 24
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 25
    .line 26
    iget-object v4, p0, Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager;->mReceivers:Ljava/util/HashMap;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v4, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception p1

    .line 32
    goto :goto_2

    .line 33
    .line 34
    .line 35
    :cond_0
    :goto_0
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 36
    const/4 p1, 0x0

    .line 37
    .line 38
    .line 39
    :goto_1
    invoke-virtual {p2}, Landroid/content/IntentFilter;->countActions()I

    .line 40
    move-result v2

    .line 41
    .line 42
    if-ge p1, v2, :cond_2

    .line 43
    .line 44
    .line 45
    invoke-virtual {p2, p1}, Landroid/content/IntentFilter;->getAction(I)Ljava/lang/String;

    .line 46
    move-result-object v2

    .line 47
    .line 48
    iget-object v4, p0, Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager;->mActions:Ljava/util/HashMap;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v4, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    move-result-object v4

    .line 53
    .line 54
    check-cast v4, Ljava/util/ArrayList;

    .line 55
    .line 56
    if-nez v4, :cond_1

    .line 57
    .line 58
    new-instance v4, Ljava/util/ArrayList;

    .line 59
    .line 60
    .line 61
    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 62
    .line 63
    iget-object v5, p0, Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager;->mActions:Ljava/util/HashMap;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v5, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    :cond_1
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    add-int/lit8 p1, p1, 0x1

    .line 72
    goto :goto_1

    .line 73
    :cond_2
    monitor-exit v0

    .line 74
    return-void

    .line 75
    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    throw p1
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
.end method

.method public final sendBroadcast(Landroid/content/Intent;)Z
    .locals 18

    .line 1
    .line 2
    move-object/from16 v1, p0

    .line 3
    .line 4
    move-object/from16 v0, p1

    .line 5
    .line 6
    iget-object v2, v1, Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager;->mReceivers:Ljava/util/HashMap;

    .line 7
    monitor-enter v2

    .line 8
    .line 9
    .line 10
    :try_start_0
    invoke-virtual {v0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 11
    move-result-object v4

    .line 12
    .line 13
    iget-object v3, v1, Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager;->mAppContext:Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v3}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 17
    move-result-object v3

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v3}, Landroid/content/Intent;->resolveTypeIfNeeded(Landroid/content/ContentResolver;)Ljava/lang/String;

    .line 21
    move-result-object v5

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 25
    move-result-object v7

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/content/Intent;->getScheme()Ljava/lang/String;

    .line 29
    move-result-object v6

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Landroid/content/Intent;->getCategories()Ljava/util/Set;

    .line 33
    move-result-object v8

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/content/Intent;->getFlags()I

    .line 37
    move-result v3

    .line 38
    .line 39
    and-int/lit8 v3, v3, 0x8

    .line 40
    .line 41
    if-eqz v3, :cond_0

    .line 42
    const/4 v12, 0x1

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    const/4 v12, 0x0

    .line 45
    .line 46
    :goto_0
    if-eqz v12, :cond_1

    .line 47
    .line 48
    const-string v3, "LocalBroadcastManager"

    .line 49
    .line 50
    new-instance v9, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    const-string v13, "Resolving type "

    .line 53
    .line 54
    .line 55
    invoke-direct {v9, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    const-string v13, " scheme "

    .line 61
    .line 62
    .line 63
    invoke-virtual {v9, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    const-string v13, " of intent "

    .line 69
    .line 70
    .line 71
    invoke-virtual {v9, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    move-result-object v9

    .line 79
    .line 80
    .line 81
    invoke-static {v3, v9}, Lcom/tencent/liteav/base/util/LiteavLog;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    goto :goto_1

    .line 83
    :catchall_0
    move-exception v0

    .line 84
    .line 85
    goto/16 :goto_7

    .line 86
    .line 87
    :cond_1
    :goto_1
    iget-object v3, v1, Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager;->mActions:Ljava/util/HashMap;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 91
    move-result-object v9

    .line 92
    .line 93
    .line 94
    invoke-virtual {v3, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    move-result-object v3

    .line 96
    move-object v13, v3

    .line 97
    .line 98
    check-cast v13, Ljava/util/ArrayList;

    .line 99
    .line 100
    if-eqz v13, :cond_11

    .line 101
    .line 102
    if-eqz v12, :cond_2

    .line 103
    .line 104
    const-string v3, "LocalBroadcastManager"

    .line 105
    .line 106
    const-string v9, "Action list: "

    .line 107
    .line 108
    .line 109
    invoke-static {v13}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 110
    move-result-object v14

    .line 111
    .line 112
    .line 113
    invoke-virtual {v9, v14}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 114
    move-result-object v9

    .line 115
    .line 116
    .line 117
    invoke-static {v3, v9}, Lcom/tencent/liteav/base/util/LiteavLog;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    :cond_2
    const/4 v3, 0x0

    .line 119
    move-object v14, v3

    .line 120
    const/4 v15, 0x0

    .line 121
    .line 122
    .line 123
    :goto_2
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 124
    move-result v3

    .line 125
    .line 126
    if-ge v15, v3, :cond_e

    .line 127
    .line 128
    .line 129
    invoke-virtual {v13, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 130
    move-result-object v3

    .line 131
    .line 132
    check-cast v3, Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager$b;

    .line 133
    .line 134
    if-eqz v12, :cond_3

    .line 135
    .line 136
    const-string v9, "LocalBroadcastManager"

    .line 137
    .line 138
    new-instance v10, Ljava/lang/StringBuilder;

    .line 139
    .line 140
    const-string v11, "Matching against filter "

    .line 141
    .line 142
    .line 143
    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 144
    .line 145
    iget-object v11, v3, Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager$b;->a:Landroid/content/IntentFilter;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 152
    move-result-object v10

    .line 153
    .line 154
    .line 155
    invoke-static {v9, v10}, Lcom/tencent/liteav/base/util/LiteavLog;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 156
    .line 157
    :cond_3
    iget-boolean v9, v3, Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager$b;->c:Z

    .line 158
    .line 159
    if-eqz v9, :cond_5

    .line 160
    .line 161
    if-eqz v12, :cond_4

    .line 162
    .line 163
    const-string v3, "LocalBroadcastManager"

    .line 164
    .line 165
    const-string v9, "  Filter\'s target already added"

    .line 166
    .line 167
    .line 168
    invoke-static {v3, v9}, Lcom/tencent/liteav/base/util/LiteavLog;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 169
    .line 170
    :cond_4
    move-object/from16 v17, v4

    .line 171
    goto :goto_5

    .line 172
    :cond_5
    move-object v9, v3

    .line 173
    .line 174
    iget-object v3, v9, Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager$b;->a:Landroid/content/IntentFilter;

    .line 175
    move-object v10, v9

    .line 176
    .line 177
    const-string v9, "LocalBroadcastManager"

    .line 178
    .line 179
    .line 180
    invoke-virtual/range {v3 .. v9}, Landroid/content/IntentFilter;->match(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/util/Set;Ljava/lang/String;)I

    .line 181
    move-result v3

    .line 182
    .line 183
    if-ltz v3, :cond_8

    .line 184
    .line 185
    if-eqz v12, :cond_6

    .line 186
    .line 187
    const-string v9, "LocalBroadcastManager"

    .line 188
    .line 189
    new-instance v11, Ljava/lang/StringBuilder;

    .line 190
    .line 191
    move-object/from16 v17, v4

    .line 192
    .line 193
    const-string v4, "  Filter matched!  match=0x"

    .line 194
    .line 195
    .line 196
    invoke-direct {v11, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 200
    move-result-object v3

    .line 201
    .line 202
    .line 203
    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 207
    move-result-object v3

    .line 208
    .line 209
    .line 210
    invoke-static {v9, v3}, Lcom/tencent/liteav/base/util/LiteavLog;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 211
    goto :goto_3

    .line 212
    .line 213
    :cond_6
    move-object/from16 v17, v4

    .line 214
    .line 215
    :goto_3
    if-nez v14, :cond_7

    .line 216
    .line 217
    new-instance v14, Ljava/util/ArrayList;

    .line 218
    .line 219
    .line 220
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 221
    .line 222
    .line 223
    :cond_7
    invoke-virtual {v14, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 224
    const/4 v3, 0x1

    .line 225
    .line 226
    iput-boolean v3, v10, Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager$b;->c:Z

    .line 227
    goto :goto_5

    .line 228
    .line 229
    :cond_8
    move-object/from16 v17, v4

    .line 230
    .line 231
    if-eqz v12, :cond_d

    .line 232
    const/4 v4, -0x4

    .line 233
    .line 234
    if-eq v3, v4, :cond_c

    .line 235
    const/4 v4, -0x3

    .line 236
    .line 237
    if-eq v3, v4, :cond_b

    .line 238
    const/4 v4, -0x2

    .line 239
    .line 240
    if-eq v3, v4, :cond_a

    .line 241
    const/4 v4, -0x1

    .line 242
    .line 243
    if-eq v3, v4, :cond_9

    .line 244
    .line 245
    const-string v3, "unknown reason"

    .line 246
    goto :goto_4

    .line 247
    .line 248
    :cond_9
    const-string v3, "type"

    .line 249
    goto :goto_4

    .line 250
    .line 251
    :cond_a
    const-string v3, "data"

    .line 252
    goto :goto_4

    .line 253
    .line 254
    :cond_b
    const-string v3, "action"

    .line 255
    goto :goto_4

    .line 256
    .line 257
    :cond_c
    const-string v3, "category"

    .line 258
    .line 259
    :goto_4
    const-string v4, "LocalBroadcastManager"

    .line 260
    .line 261
    const-string v9, "  Filter did not match: "

    .line 262
    .line 263
    .line 264
    invoke-virtual {v9, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 265
    move-result-object v3

    .line 266
    .line 267
    .line 268
    invoke-static {v4, v3}, Lcom/tencent/liteav/base/util/LiteavLog;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 269
    .line 270
    :cond_d
    :goto_5
    add-int/lit8 v15, v15, 0x1

    .line 271
    .line 272
    move-object/from16 v4, v17

    .line 273
    .line 274
    goto/16 :goto_2

    .line 275
    .line 276
    :cond_e
    if-eqz v14, :cond_11

    .line 277
    const/4 v3, 0x0

    .line 278
    .line 279
    .line 280
    :goto_6
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    .line 281
    move-result v4

    .line 282
    .line 283
    if-ge v3, v4, :cond_f

    .line 284
    .line 285
    .line 286
    invoke-virtual {v14, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 287
    move-result-object v4

    .line 288
    .line 289
    check-cast v4, Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager$b;

    .line 290
    const/4 v5, 0x0

    .line 291
    .line 292
    iput-boolean v5, v4, Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager$b;->c:Z

    .line 293
    .line 294
    add-int/lit8 v3, v3, 0x1

    .line 295
    goto :goto_6

    .line 296
    .line 297
    :cond_f
    iget-object v3, v1, Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager;->mPendingBroadcasts:Ljava/util/ArrayList;

    .line 298
    .line 299
    new-instance v4, Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager$a;

    .line 300
    .line 301
    .line 302
    invoke-direct {v4, v0, v14}, Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager$a;-><init>(Landroid/content/Intent;Ljava/util/ArrayList;)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 306
    .line 307
    iget-object v0, v1, Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager;->mMainHandler:Landroid/os/Handler;

    .line 308
    const/4 v3, 0x1

    .line 309
    .line 310
    .line 311
    invoke-virtual {v0, v3}, Landroid/os/Handler;->hasMessages(I)Z

    .line 312
    move-result v0

    .line 313
    .line 314
    if-nez v0, :cond_10

    .line 315
    .line 316
    iget-object v0, v1, Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager;->mMainHandler:Landroid/os/Handler;

    .line 317
    .line 318
    .line 319
    invoke-virtual {v0, v3}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 320
    :cond_10
    monitor-exit v2

    .line 321
    return v3

    .line 322
    :cond_11
    monitor-exit v2

    .line 323
    .line 324
    const/16 v16, 0x0

    .line 325
    return v16

    .line 326
    :goto_7
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 327
    throw v0
.end method

.method public final sendBroadcastSync(Landroid/content/Intent;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    .line 4
    move-result p1

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager;->executePendingBroadcasts()V

    .line 10
    :cond_0
    return-void
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
.end method

.method public final unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    .locals 11

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager;->mReceivers:Ljava/util/HashMap;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    iget-object v1, p0, Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager;->mReceivers:Ljava/util/HashMap;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    check-cast v1, Ljava/util/ArrayList;

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    monitor-exit v0

    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    goto :goto_3

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 21
    move-result v2

    .line 22
    const/4 v3, 0x1

    .line 23
    sub-int/2addr v2, v3

    .line 24
    .line 25
    :goto_0
    if-ltz v2, :cond_5

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 29
    move-result-object v4

    .line 30
    .line 31
    check-cast v4, Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager$b;

    .line 32
    .line 33
    iput-boolean v3, v4, Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager$b;->d:Z

    .line 34
    const/4 v5, 0x0

    .line 35
    .line 36
    :goto_1
    iget-object v6, v4, Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager$b;->a:Landroid/content/IntentFilter;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v6}, Landroid/content/IntentFilter;->countActions()I

    .line 40
    move-result v6

    .line 41
    .line 42
    if-ge v5, v6, :cond_4

    .line 43
    .line 44
    iget-object v6, v4, Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager$b;->a:Landroid/content/IntentFilter;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v6, v5}, Landroid/content/IntentFilter;->getAction(I)Ljava/lang/String;

    .line 48
    move-result-object v6

    .line 49
    .line 50
    iget-object v7, p0, Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager;->mActions:Ljava/util/HashMap;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v7, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    move-result-object v7

    .line 55
    .line 56
    check-cast v7, Ljava/util/ArrayList;

    .line 57
    .line 58
    if-eqz v7, :cond_3

    .line 59
    .line 60
    .line 61
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 62
    move-result v8

    .line 63
    sub-int/2addr v8, v3

    .line 64
    .line 65
    :goto_2
    if-ltz v8, :cond_2

    .line 66
    .line 67
    .line 68
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 69
    move-result-object v9

    .line 70
    .line 71
    check-cast v9, Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager$b;

    .line 72
    .line 73
    iget-object v10, v9, Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager$b;->b:Landroid/content/BroadcastReceiver;

    .line 74
    .line 75
    if-ne v10, p1, :cond_1

    .line 76
    .line 77
    iput-boolean v3, v9, Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager$b;->d:Z

    .line 78
    .line 79
    .line 80
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 81
    .line 82
    :cond_1
    add-int/lit8 v8, v8, -0x1

    .line 83
    goto :goto_2

    .line 84
    .line 85
    .line 86
    :cond_2
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 87
    move-result v7

    .line 88
    .line 89
    if-gtz v7, :cond_3

    .line 90
    .line 91
    iget-object v7, p0, Lcom/tencent/ugc/videobase/utils/LocalBroadcastManager;->mActions:Ljava/util/HashMap;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v7, v6}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    :cond_3
    add-int/lit8 v5, v5, 0x1

    .line 97
    goto :goto_1

    .line 98
    .line 99
    :cond_4
    add-int/lit8 v2, v2, -0x1

    .line 100
    goto :goto_0

    .line 101
    :cond_5
    monitor-exit v0

    .line 102
    return-void

    .line 103
    :goto_3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 104
    throw p1
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
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
.end method
