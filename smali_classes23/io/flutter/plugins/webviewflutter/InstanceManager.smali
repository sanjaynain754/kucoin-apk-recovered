.class public Lio/flutter/plugins/webviewflutter/InstanceManager;
.super Ljava/lang/Object;
.source "InstanceManager.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/webviewflutter/InstanceManager$FinalizationListener;
    }
.end annotation


# static fields
.field private static final CLEAR_FINALIZED_WEAK_REFERENCES_INTERVAL:J = 0xbb8L

.field private static final MIN_HOST_CREATED_IDENTIFIER:J = 0x10000L

.field private static final TAG:Ljava/lang/String; = "InstanceManager"


# instance fields
.field private final finalizationListener:Lio/flutter/plugins/webviewflutter/InstanceManager$FinalizationListener;

.field private final handler:Landroid/os/Handler;

.field private hasFinalizationListenerStopped:Z

.field private final identifiers:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap<",
            "Ljava/lang/Object;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private nextIdentifier:J

.field private final referenceQueue:Ljava/lang/ref/ReferenceQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/ReferenceQueue<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final strongInstances:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Long;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final weakInstances:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Long;",
            "Ljava/lang/ref/WeakReference<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field private final weakReferencesToIdentifiers:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/ref/WeakReference<",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lio/flutter/plugins/webviewflutter/InstanceManager$FinalizationListener;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/WeakHashMap;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lio/flutter/plugins/webviewflutter/InstanceManager;->identifiers:Ljava/util/WeakHashMap;

    .line 11
    .line 12
    new-instance v0, Ljava/util/HashMap;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 16
    .line 17
    iput-object v0, p0, Lio/flutter/plugins/webviewflutter/InstanceManager;->weakInstances:Ljava/util/HashMap;

    .line 18
    .line 19
    new-instance v0, Ljava/util/HashMap;

    .line 20
    .line 21
    .line 22
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 23
    .line 24
    iput-object v0, p0, Lio/flutter/plugins/webviewflutter/InstanceManager;->strongInstances:Ljava/util/HashMap;

    .line 25
    .line 26
    new-instance v0, Ljava/lang/ref/ReferenceQueue;

    .line 27
    .line 28
    .line 29
    invoke-direct {v0}, Ljava/lang/ref/ReferenceQueue;-><init>()V

    .line 30
    .line 31
    iput-object v0, p0, Lio/flutter/plugins/webviewflutter/InstanceManager;->referenceQueue:Ljava/lang/ref/ReferenceQueue;

    .line 32
    .line 33
    new-instance v0, Ljava/util/HashMap;

    .line 34
    .line 35
    .line 36
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 37
    .line 38
    iput-object v0, p0, Lio/flutter/plugins/webviewflutter/InstanceManager;->weakReferencesToIdentifiers:Ljava/util/HashMap;

    .line 39
    .line 40
    new-instance v0, Landroid/os/Handler;

    .line 41
    .line 42
    .line 43
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 44
    move-result-object v1

    .line 45
    .line 46
    .line 47
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 48
    .line 49
    iput-object v0, p0, Lio/flutter/plugins/webviewflutter/InstanceManager;->handler:Landroid/os/Handler;

    .line 50
    .line 51
    .line 52
    const-wide/32 v1, 0x10000

    .line 53
    .line 54
    iput-wide v1, p0, Lio/flutter/plugins/webviewflutter/InstanceManager;->nextIdentifier:J

    .line 55
    const/4 v1, 0x0

    .line 56
    .line 57
    iput-boolean v1, p0, Lio/flutter/plugins/webviewflutter/InstanceManager;->hasFinalizationListenerStopped:Z

    .line 58
    .line 59
    iput-object p1, p0, Lio/flutter/plugins/webviewflutter/InstanceManager;->finalizationListener:Lio/flutter/plugins/webviewflutter/InstanceManager$FinalizationListener;

    .line 60
    .line 61
    new-instance p1, Lio/flutter/plugins/webviewflutter/a3;

    .line 62
    .line 63
    .line 64
    invoke-direct {p1, p0}, Lio/flutter/plugins/webviewflutter/a3;-><init>(Lio/flutter/plugins/webviewflutter/InstanceManager;)V

    .line 65
    .line 66
    const-wide/16 v1, 0xbb8

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, p1, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 70
    return-void
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public static synthetic a(Lio/flutter/plugins/webviewflutter/InstanceManager;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lio/flutter/plugins/webviewflutter/InstanceManager;->releaseAllFinalizedInstances()V

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
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method private addInstance(Ljava/lang/Object;J)V
    .locals 3

    .line 1
    .line 2
    const-wide/16 v0, 0x0

    .line 3
    .line 4
    cmp-long v0, p2, v0

    .line 5
    .line 6
    if-ltz v0, :cond_1

    .line 7
    .line 8
    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/InstanceManager;->weakInstances:Ljava/util/HashMap;

    .line 9
    .line 10
    .line 11
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 16
    move-result v0

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 21
    .line 22
    iget-object v1, p0, Lio/flutter/plugins/webviewflutter/InstanceManager;->referenceQueue:Ljava/lang/ref/ReferenceQueue;

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, p1, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V

    .line 26
    .line 27
    iget-object v1, p0, Lio/flutter/plugins/webviewflutter/InstanceManager;->identifiers:Ljava/util/WeakHashMap;

    .line 28
    .line 29
    .line 30
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 31
    move-result-object v2

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, p1, v2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    iget-object v1, p0, Lio/flutter/plugins/webviewflutter/InstanceManager;->weakInstances:Ljava/util/HashMap;

    .line 37
    .line 38
    .line 39
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 40
    move-result-object v2

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    iget-object v1, p0, Lio/flutter/plugins/webviewflutter/InstanceManager;->weakReferencesToIdentifiers:Ljava/util/HashMap;

    .line 46
    .line 47
    .line 48
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 49
    move-result-object v2

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/InstanceManager;->strongInstances:Ljava/util/HashMap;

    .line 55
    .line 56
    .line 57
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 58
    move-result-object p2

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    return-void

    .line 63
    .line 64
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 65
    .line 66
    .line 67
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 68
    move-result-object p2

    .line 69
    .line 70
    .line 71
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 72
    move-result-object p2

    .line 73
    .line 74
    const-string p3, "Identifier has already been added: %d"

    .line 75
    .line 76
    .line 77
    invoke-static {p3, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 78
    move-result-object p2

    .line 79
    .line 80
    .line 81
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 82
    throw p1

    .line 83
    .line 84
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 85
    .line 86
    .line 87
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 88
    move-result-object p2

    .line 89
    .line 90
    .line 91
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 92
    move-result-object p2

    .line 93
    .line 94
    const-string p3, "Identifier must be >= 0: %d"

    .line 95
    .line 96
    .line 97
    invoke-static {p3, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 98
    move-result-object p2

    .line 99
    .line 100
    .line 101
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 102
    throw p1
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
.end method

.method public static create(Lio/flutter/plugins/webviewflutter/InstanceManager$FinalizationListener;)Lio/flutter/plugins/webviewflutter/InstanceManager;
    .locals 1
    .param p0    # Lio/flutter/plugins/webviewflutter/InstanceManager$FinalizationListener;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lio/flutter/plugins/webviewflutter/InstanceManager;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lio/flutter/plugins/webviewflutter/InstanceManager;-><init>(Lio/flutter/plugins/webviewflutter/InstanceManager$FinalizationListener;)V

    .line 6
    return-object v0
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
.end method

.method private logWarningIfFinalizationListenerHasStopped()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lio/flutter/plugins/webviewflutter/InstanceManager;->hasFinalizationListenerStopped()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const-string v0, "InstanceManager"

    .line 9
    .line 10
    const-string v1, "The manager was used after calls to the FinalizationListener have been stopped."

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    :cond_0
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method private releaseAllFinalizedInstances()V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lio/flutter/plugins/webviewflutter/InstanceManager;->hasFinalizationListenerStopped()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    :goto_0
    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/InstanceManager;->referenceQueue:Ljava/lang/ref/ReferenceQueue;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/ref/ReferenceQueue;->poll()Ljava/lang/ref/Reference;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    check-cast v0, Ljava/lang/ref/WeakReference;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget-object v1, p0, Lio/flutter/plugins/webviewflutter/InstanceManager;->weakReferencesToIdentifiers:Ljava/util/HashMap;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    check-cast v0, Ljava/lang/Long;

    .line 26
    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    iget-object v1, p0, Lio/flutter/plugins/webviewflutter/InstanceManager;->weakInstances:Ljava/util/HashMap;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    iget-object v1, p0, Lio/flutter/plugins/webviewflutter/InstanceManager;->strongInstances:Ljava/util/HashMap;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    iget-object v1, p0, Lio/flutter/plugins/webviewflutter/InstanceManager;->finalizationListener:Lio/flutter/plugins/webviewflutter/InstanceManager$FinalizationListener;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 43
    move-result-wide v2

    .line 44
    .line 45
    .line 46
    invoke-interface {v1, v2, v3}, Lio/flutter/plugins/webviewflutter/InstanceManager$FinalizationListener;->onFinalize(J)V

    .line 47
    goto :goto_0

    .line 48
    .line 49
    :cond_1
    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/InstanceManager;->handler:Landroid/os/Handler;

    .line 50
    .line 51
    new-instance v1, Lio/flutter/plugins/webviewflutter/a3;

    .line 52
    .line 53
    .line 54
    invoke-direct {v1, p0}, Lio/flutter/plugins/webviewflutter/a3;-><init>(Lio/flutter/plugins/webviewflutter/InstanceManager;)V

    .line 55
    .line 56
    const-wide/16 v2, 0xbb8

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 60
    return-void
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
.end method


# virtual methods
.method public addDartCreatedInstance(Ljava/lang/Object;J)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lio/flutter/plugins/webviewflutter/InstanceManager;->logWarningIfFinalizationListenerHasStopped()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1, p2, p3}, Lio/flutter/plugins/webviewflutter/InstanceManager;->addInstance(Ljava/lang/Object;J)V

    .line 7
    return-void
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
.end method

.method public addHostCreatedInstance(Ljava/lang/Object;)J
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lio/flutter/plugins/webviewflutter/InstanceManager;->logWarningIfFinalizationListenerHasStopped()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lio/flutter/plugins/webviewflutter/InstanceManager;->containsInstance(Ljava/lang/Object;)Z

    .line 7
    move-result v0

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-wide v0, p0, Lio/flutter/plugins/webviewflutter/InstanceManager;->nextIdentifier:J

    .line 12
    .line 13
    const-wide/16 v2, 0x1

    .line 14
    add-long/2addr v2, v0

    .line 15
    .line 16
    iput-wide v2, p0, Lio/flutter/plugins/webviewflutter/InstanceManager;->nextIdentifier:J

    .line 17
    .line 18
    .line 19
    invoke-direct {p0, p1, v0, v1}, Lio/flutter/plugins/webviewflutter/InstanceManager;->addInstance(Ljava/lang/Object;J)V

    .line 20
    return-wide v0

    .line 21
    .line 22
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 23
    .line 24
    new-instance v1, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    const-string v2, "Instance of "

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    move-result-object p1

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    const-string p1, " has already been added."

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    move-result-object p1

    .line 49
    .line 50
    .line 51
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 52
    throw v0
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
.end method

.method public clear()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/InstanceManager;->identifiers:Ljava/util/WeakHashMap;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/WeakHashMap;->clear()V

    .line 6
    .line 7
    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/InstanceManager;->weakInstances:Ljava/util/HashMap;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 11
    .line 12
    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/InstanceManager;->strongInstances:Ljava/util/HashMap;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 16
    .line 17
    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/InstanceManager;->weakReferencesToIdentifiers:Ljava/util/HashMap;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 21
    return-void
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
.end method

.method public containsInstance(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lio/flutter/plugins/webviewflutter/InstanceManager;->logWarningIfFinalizationListenerHasStopped()V

    .line 4
    .line 5
    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/InstanceManager;->identifiers:Ljava/util/WeakHashMap;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 9
    move-result p1

    .line 10
    return p1
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
.end method

.method public getIdentifierForStrongReference(Ljava/lang/Object;)Ljava/lang/Long;
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lio/flutter/plugins/webviewflutter/InstanceManager;->logWarningIfFinalizationListenerHasStopped()V

    .line 4
    .line 5
    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/InstanceManager;->identifiers:Ljava/util/WeakHashMap;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    check-cast v0, Ljava/lang/Long;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v1, p0, Lio/flutter/plugins/webviewflutter/InstanceManager;->strongInstances:Ljava/util/HashMap;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    :cond_0
    return-object v0
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public getInstance(J)Ljava/lang/Object;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(J)TT;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lio/flutter/plugins/webviewflutter/InstanceManager;->logWarningIfFinalizationListenerHasStopped()V

    .line 4
    .line 5
    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/InstanceManager;->weakInstances:Ljava/util/HashMap;

    .line 6
    .line 7
    .line 8
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    move-result-object p1

    .line 14
    .line 15
    check-cast p1, Ljava/lang/ref/WeakReference;

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :cond_0
    const/4 p1, 0x0

    .line 24
    return-object p1
.end method

.method public hasFinalizationListenerStopped()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lio/flutter/plugins/webviewflutter/InstanceManager;->hasFinalizationListenerStopped:Z

    .line 3
    return v0
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
.end method

.method public remove(J)Ljava/lang/Object;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(J)TT;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lio/flutter/plugins/webviewflutter/InstanceManager;->logWarningIfFinalizationListenerHasStopped()V

    .line 4
    .line 5
    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/InstanceManager;->strongInstances:Ljava/util/HashMap;

    .line 6
    .line 7
    .line 8
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    move-result-object p1

    .line 14
    return-object p1
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
.end method

.method public stopFinalizationListener()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/InstanceManager;->handler:Landroid/os/Handler;

    .line 3
    .line 4
    new-instance v1, Lio/flutter/plugins/webviewflutter/a3;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1, p0}, Lio/flutter/plugins/webviewflutter/a3;-><init>(Lio/flutter/plugins/webviewflutter/InstanceManager;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 11
    const/4 v0, 0x1

    .line 12
    .line 13
    iput-boolean v0, p0, Lio/flutter/plugins/webviewflutter/InstanceManager;->hasFinalizationListenerStopped:Z

    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method
