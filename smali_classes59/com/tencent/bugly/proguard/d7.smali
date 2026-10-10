.class public Lcom/tencent/bugly/proguard/d7;
.super Ljava/lang/Object;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/bugly/proguard/d7$c;,
        Lcom/tencent/bugly/proguard/d7$b;
    }
.end annotation


# static fields
.field public static final e:Ljava/lang/String; = "FragmentCallbackManager"


# instance fields
.field public a:Lcom/tencent/bugly/proguard/d7$b;

.field public b:Ljava/util/concurrent/CopyOnWriteArraySet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArraySet<",
            "Lcom/tencent/bugly/proguard/c9;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ljava/util/concurrent/CopyOnWriteArraySet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArraySet<",
            "Lcom/tencent/bugly/proguard/b9;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Lcom/tencent/bugly/proguard/d7$b;

    invoke-direct {v0}, Lcom/tencent/bugly/proguard/d7$b;-><init>()V

    iput-object v0, p0, Lcom/tencent/bugly/proguard/d7;->a:Lcom/tencent/bugly/proguard/d7$b;

    .line 4
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lcom/tencent/bugly/proguard/d7;->b:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 5
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lcom/tencent/bugly/proguard/d7;->c:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 6
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/tencent/bugly/proguard/d7;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/tencent/bugly/proguard/d7$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tencent/bugly/proguard/d7;-><init>()V

    return-void
.end method

.method public static a()Lcom/tencent/bugly/proguard/d7;
    .locals 1

    .line 2
    sget-object v0, Lcom/tencent/bugly/proguard/d7$c;->a:Lcom/tencent/bugly/proguard/d7;

    return-object v0
.end method

.method public static synthetic a(Lcom/tencent/bugly/proguard/d7;)Ljava/util/concurrent/CopyOnWriteArraySet;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/bugly/proguard/d7;->b:Ljava/util/concurrent/CopyOnWriteArraySet;

    return-object p0
.end method


# virtual methods
.method public a(Lcom/tencent/bugly/proguard/b9;)V
    .locals 2

    if-eqz p1, :cond_1

    .line 3
    iget-object v0, p0, Lcom/tencent/bugly/proguard/d7;->c:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 4
    iget-object v0, p0, Lcom/tencent/bugly/proguard/d7;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    .line 5
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/d7;->b()V

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/d7;->b:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tencent/bugly/proguard/c9;

    .line 7
    invoke-interface {v1, p1}, Lcom/tencent/bugly/proguard/c9;->b(Lcom/tencent/bugly/proguard/b9;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public b()V
    .locals 4

    .line 1
    const-string v0, "FragmentCallbackManager"

    iget-object v1, p0, Lcom/tencent/bugly/proguard/d7;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v1, p0, Lcom/tencent/bugly/proguard/d7;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 3
    :try_start_0
    invoke-static {}, Lcom/tencent/bugly/common/utils/AndroidVersion;->isOverO()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 4
    iget-object v1, p0, Lcom/tencent/bugly/proguard/d7;->b:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-static {}, Lcom/tencent/bugly/proguard/q;->a()Lcom/tencent/bugly/proguard/q;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 5
    :catchall_0
    sget-object v1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v2, "AndroidOFragmentLifecycleAdapter start failed"

    filled-new-array {v0, v2}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/tencent/rmonitor/common/logger/Logger;->w([Ljava/lang/String;)V

    .line 6
    :cond_1
    :goto_0
    :try_start_1
    iget-object v1, p0, Lcom/tencent/bugly/proguard/d7;->b:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-static {}, Lcom/tencent/bugly/proguard/s;->a()Lcom/tencent/bugly/proguard/s;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    .line 7
    :catchall_1
    sget-object v1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v2, "AndroidXFragmentLifecycleAdapter start failed"

    filled-new-array {v0, v2}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/tencent/rmonitor/common/logger/Logger;->w([Ljava/lang/String;)V

    .line 8
    :goto_1
    :try_start_2
    iget-object v1, p0, Lcom/tencent/bugly/proguard/d7;->b:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-static {}, Lcom/tencent/bugly/proguard/r;->a()Lcom/tencent/bugly/proguard/r;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_2

    .line 9
    :catchall_2
    sget-object v1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v2, "AndroidV4FragmentLifecycleAdapter start failed"

    filled-new-array {v0, v2}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/tencent/rmonitor/common/logger/Logger;->w([Ljava/lang/String;)V

    .line 10
    :goto_2
    iget-object v1, p0, Lcom/tencent/bugly/proguard/d7;->a:Lcom/tencent/bugly/proguard/d7$b;

    invoke-static {v1}, Lcom/tencent/rmonitor/common/lifecycle/LifecycleCallback;->register(Lcom/tencent/rmonitor/common/lifecycle/IActivityStateCallback;)V

    .line 11
    sget-object v1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string/jumbo v2, "start success"

    filled-new-array {v0, v2}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    return-void
.end method

.method public b(Lcom/tencent/bugly/proguard/b9;)V
    .locals 2

    if-eqz p1, :cond_1

    .line 12
    iget-object v0, p0, Lcom/tencent/bugly/proguard/d7;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 13
    iget-object v0, p0, Lcom/tencent/bugly/proguard/d7;->c:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    .line 14
    iget-object v0, p0, Lcom/tencent/bugly/proguard/d7;->b:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tencent/bugly/proguard/c9;

    .line 15
    invoke-interface {v1, p1}, Lcom/tencent/bugly/proguard/c9;->a(Lcom/tencent/bugly/proguard/b9;)V

    goto :goto_0

    .line 16
    :cond_0
    iget-object p1, p0, Lcom/tencent/bugly/proguard/d7;->c:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->size()I

    move-result p1

    if-nez p1, :cond_1

    .line 17
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/d7;->c()V

    :cond_1
    return-void
.end method

.method public final c()V
    .locals 4

    .line 1
    .line 2
    const-string v0, "FragmentCallbackManager"

    .line 3
    .line 4
    iget-object v1, p0, Lcom/tencent/bugly/proguard/d7;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 8
    move-result v1

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    return-void

    .line 12
    .line 13
    :cond_0
    iget-object v1, p0, Lcom/tencent/bugly/proguard/d7;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 14
    const/4 v2, 0x1

    .line 15
    const/4 v3, 0x0

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 19
    .line 20
    iget-object v1, p0, Lcom/tencent/bugly/proguard/d7;->a:Lcom/tencent/bugly/proguard/d7$b;

    .line 21
    .line 22
    .line 23
    invoke-static {v1}, Lcom/tencent/rmonitor/common/lifecycle/LifecycleCallback;->unRegister(Lcom/tencent/rmonitor/common/lifecycle/IActivityStateCallback;)V

    .line 24
    .line 25
    :try_start_0
    iget-object v1, p0, Lcom/tencent/bugly/proguard/d7;->b:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 26
    .line 27
    .line 28
    invoke-static {}, Lcom/tencent/bugly/proguard/q;->a()Lcom/tencent/bugly/proguard/q;

    .line 29
    move-result-object v2

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, v2}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    goto :goto_0

    .line 34
    .line 35
    :catchall_0
    sget-object v1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 36
    .line 37
    const-string v2, "AndroidOFragmentLifecycleAdapter stop failed"

    .line 38
    .line 39
    .line 40
    filled-new-array {v0, v2}, [Ljava/lang/String;

    .line 41
    move-result-object v2

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, v2}, Lcom/tencent/rmonitor/common/logger/Logger;->w([Ljava/lang/String;)V

    .line 45
    .line 46
    :goto_0
    :try_start_1
    iget-object v1, p0, Lcom/tencent/bugly/proguard/d7;->b:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 47
    .line 48
    .line 49
    invoke-static {}, Lcom/tencent/bugly/proguard/s;->a()Lcom/tencent/bugly/proguard/s;

    .line 50
    move-result-object v2

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1, v2}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 54
    goto :goto_1

    .line 55
    .line 56
    :catchall_1
    sget-object v1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 57
    .line 58
    const-string v2, "AndroidXFragmentLifecycleAdapter stop failed"

    .line 59
    .line 60
    .line 61
    filled-new-array {v0, v2}, [Ljava/lang/String;

    .line 62
    move-result-object v2

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, v2}, Lcom/tencent/rmonitor/common/logger/Logger;->w([Ljava/lang/String;)V

    .line 66
    .line 67
    :goto_1
    :try_start_2
    iget-object v1, p0, Lcom/tencent/bugly/proguard/d7;->b:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 68
    .line 69
    .line 70
    invoke-static {}, Lcom/tencent/bugly/proguard/r;->a()Lcom/tencent/bugly/proguard/r;

    .line 71
    move-result-object v2

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1, v2}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 75
    goto :goto_2

    .line 76
    .line 77
    :catchall_2
    sget-object v1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 78
    .line 79
    const-string v2, "AndroidV4FragmentLifecycleAdapter stop failed"

    .line 80
    .line 81
    .line 82
    filled-new-array {v0, v2}, [Ljava/lang/String;

    .line 83
    move-result-object v2

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1, v2}, Lcom/tencent/rmonitor/common/logger/Logger;->w([Ljava/lang/String;)V

    .line 87
    .line 88
    :goto_2
    sget-object v1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 89
    .line 90
    .line 91
    const-string/jumbo v2, "stop success"

    .line 92
    .line 93
    .line 94
    filled-new-array {v0, v2}, [Ljava/lang/String;

    .line 95
    move-result-object v0

    .line 96
    .line 97
    .line 98
    invoke-virtual {v1, v0}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    .line 99
    return-void
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
.end method
