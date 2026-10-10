.class public Lcom/tencent/bugly/proguard/l5;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Lcom/tencent/bugly/proguard/y9;


# static fields
.field public static A:J = 0x0L

.field public static B:I = 0x0

.field public static C:Z = false

.field public static D:D = 0.0

.field public static volatile E:Lcom/tencent/bugly/proguard/l5; = null

.field public static final g:I = 0x4

.field public static final h:I = 0x5

.field public static final i:I = 0x6

.field public static final j:I = 0xc

.field public static final k:I = 0x9

.field public static final l:I = 0x7

.field public static final m:I = 0x3

.field public static final n:I = 0x8

.field public static final o:Ljava/lang/String; = "bugly_exit_info"

.field public static final p:Ljava/lang/String; = "bugly_exit_data"

.field public static final q:J = 0xf731400L

.field public static final r:I = 0x1e

.field public static final s:Ljava/lang/String; = "bugly_stage"

.field public static final t:J = 0x5265c00L

.field public static final u:I = 0x32

.field public static final v:I = 0xa

.field public static final w:Ljava/lang/String; = "exit_trace_"

.field public static final x:Ljava/lang/String; = "exit_tombs_"

.field public static final y:Ljava/lang/String; = "exit_data_"

.field public static z:J


# instance fields
.field public final b:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Z

.field public final f:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
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
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/bugly/proguard/l5;->b:Ljava/util/concurrent/ConcurrentMap;

    .line 11
    const/4 v0, 0x0

    .line 12
    .line 13
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/l5;->e:Z

    .line 14
    .line 15
    new-instance v0, Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 19
    .line 20
    iput-object v0, p0, Lcom/tencent/bugly/proguard/l5;->f:Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    :try_start_0
    invoke-static {}, Lcom/tencent/bugly/proguard/d3;->c()Landroid/content/Context;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    new-instance v1, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 33
    move-result-object v2

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 37
    move-result-object v2

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    const-string v3, "bugly_exit_data"

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    move-result-object v1

    .line 55
    .line 56
    iput-object v1, p0, Lcom/tencent/bugly/proguard/l5;->c:Ljava/lang/String;

    .line 57
    .line 58
    new-instance v1, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 65
    move-result-object v0

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 69
    move-result-object v0

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    const-string v0, "bugly_exit_info"

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    move-result-object v0

    .line 85
    .line 86
    iput-object v0, p0, Lcom/tencent/bugly/proguard/l5;->d:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 87
    return-void

    .line 88
    :catchall_0
    move-exception v0

    .line 89
    .line 90
    .line 91
    invoke-static {v0}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/Throwable;)Z

    .line 92
    return-void
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
.end method

.method public static synthetic a(Lcom/tencent/bugly/proguard/l5;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/bugly/proguard/l5;->f:Ljava/lang/Object;

    return-object p0
.end method

.method public static synthetic a(Lcom/tencent/bugly/proguard/l5;Ljava/util/concurrent/ConcurrentMap;)Ljava/lang/String;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/l5;->a(Ljava/util/concurrent/ConcurrentMap;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a(Lcom/tencent/bugly/proguard/l5;Landroid/app/ActivityManager;)V
    .locals 0

    .line 5
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/l5;->a(Landroid/app/ActivityManager;)V

    return-void
.end method

.method public static synthetic a()Z
    .locals 1

    .line 3
    sget-boolean v0, Lcom/tencent/bugly/proguard/l5;->C:Z

    return v0
.end method

.method public static synthetic a(Z)Z
    .locals 0

    .line 4
    sput-boolean p0, Lcom/tencent/bugly/proguard/l5;->C:Z

    return p0
.end method

.method public static synthetic b(Lcom/tencent/bugly/proguard/l5;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/bugly/proguard/l5;->c:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic c(Lcom/tencent/bugly/proguard/l5;)Ljava/util/concurrent/ConcurrentMap;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/bugly/proguard/l5;->b:Ljava/util/concurrent/ConcurrentMap;

    return-object p0
.end method

.method public static synthetic d(Lcom/tencent/bugly/proguard/l5;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/l5;->g()V

    return-void
.end method

.method public static synthetic e(Lcom/tencent/bugly/proguard/l5;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/l5;->d()V

    return-void
.end method

.method public static f()Lcom/tencent/bugly/proguard/l5;
    .locals 2

    .line 2
    sget-object v0, Lcom/tencent/bugly/proguard/l5;->E:Lcom/tencent/bugly/proguard/l5;

    if-nez v0, :cond_1

    .line 3
    const-class v0, Lcom/tencent/bugly/proguard/l5;

    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/tencent/bugly/proguard/l5;->E:Lcom/tencent/bugly/proguard/l5;

    if-nez v1, :cond_0

    .line 5
    new-instance v1, Lcom/tencent/bugly/proguard/l5;

    invoke-direct {v1}, Lcom/tencent/bugly/proguard/l5;-><init>()V

    sput-object v1, Lcom/tencent/bugly/proguard/l5;->E:Lcom/tencent/bugly/proguard/l5;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    .line 6
    :cond_0
    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 7
    :cond_1
    :goto_2
    sget-object v0, Lcom/tencent/bugly/proguard/l5;->E:Lcom/tencent/bugly/proguard/l5;

    return-object v0
.end method

.method public static synthetic f(Lcom/tencent/bugly/proguard/l5;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/l5;->c()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/concurrent/ConcurrentMap;)Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/ConcurrentMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, ""

    if-eqz p1, :cond_5

    .line 87
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_3

    .line 88
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 89
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 90
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 91
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v3, :cond_1

    move-object v3, v0

    goto :goto_1

    .line 92
    :cond_1
    invoke-static {v3}, Lcom/tencent/bugly/proguard/bi;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    :goto_1
    if-nez v2, :cond_2

    move-object v2, v0

    goto :goto_2

    .line 93
    :cond_2
    invoke-static {v2}, Lcom/tencent/bugly/proguard/bi;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 94
    :goto_2
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0xa

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 95
    :cond_3
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result p1

    if-lez p1, :cond_4

    .line 96
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 97
    :cond_4
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_5
    :goto_3
    return-object v0
.end method

.method public final a(Landroid/app/ActivityManager;)V
    .locals 27

    move-object/from16 v1, p0

    const-string v0, "bugly_stage"

    .line 9
    :try_start_0
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-string v3, "getHistoricalProcessExitReasons"

    const-class v4, Ljava/lang/String;

    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    filled-new-array {v4, v5, v5}, [Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    .line 10
    const-string v3, "android.app.ApplicationExitInfo"

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    .line 11
    const-string v4, "getTimestamp"

    const/4 v5, 0x0

    new-array v6, v5, [Ljava/lang/Class;

    invoke-virtual {v3, v4, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    .line 12
    const-string v6, "getReason"

    new-array v7, v5, [Ljava/lang/Class;

    invoke-virtual {v3, v6, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    .line 13
    const-string v7, "getPid"

    new-array v8, v5, [Ljava/lang/Class;

    invoke-virtual {v3, v7, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7

    .line 14
    const-string v8, "getProcessName"

    new-array v9, v5, [Ljava/lang/Class;

    invoke-virtual {v3, v8, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v8

    .line 15
    const-string v9, "getDescription"

    new-array v10, v5, [Ljava/lang/Class;

    invoke-virtual {v3, v9, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v9

    .line 16
    const-string v10, "getTraceInputStream"

    new-array v11, v5, [Ljava/lang/Class;

    invoke-virtual {v3, v10, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v10

    .line 17
    const-string v11, "getProcessStateSummary"

    new-array v12, v5, [Ljava/lang/Class;

    invoke-virtual {v3, v11, v12}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v11

    .line 18
    const-string v12, "getImportance"

    new-array v13, v5, [Ljava/lang/Class;

    invoke-virtual {v3, v12, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    if-eqz v2, :cond_16

    if-eqz v4, :cond_16

    if-eqz v6, :cond_16

    if-eqz v7, :cond_16

    if-eqz v8, :cond_16

    if-eqz v9, :cond_16

    if-eqz v10, :cond_16

    if-eqz v11, :cond_16

    if-nez v3, :cond_0

    goto/16 :goto_f

    .line 19
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/proguard/l2;->s()Lcom/tencent/bugly/proguard/l2;

    move-result-object v12

    iget-object v12, v12, Lcom/tencent/bugly/proguard/l2;->m0:Landroid/content/SharedPreferences;

    .line 20
    invoke-virtual {v1, v12}, Lcom/tencent/bugly/proguard/l5;->a(Landroid/content/SharedPreferences;)V

    .line 21
    invoke-static {}, Lcom/tencent/bugly/proguard/m5;->a()Lcom/tencent/bugly/proguard/m5;

    move-result-object v13

    invoke-static {}, Lcom/tencent/bugly/proguard/d3;->c()Landroid/content/Context;

    move-result-object v14

    invoke-virtual {v13, v14}, Lcom/tencent/bugly/proguard/m5;->a(Landroid/content/Context;)V

    .line 22
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    const/4 v15, 0x0

    filled-new-array {v15, v13, v14}, [Ljava/lang/Object;

    move-result-object v13

    move-object/from16 v14, p1

    invoke-virtual {v2, v14, v13}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    if-eqz v2, :cond_15

    .line 23
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v13

    if-eqz v13, :cond_1

    goto/16 :goto_e

    .line 24
    :cond_1
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v13, v5

    move v14, v13

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    move-object/from16 p1, v2

    .line 25
    new-array v2, v5, [Ljava/lang/Object;

    invoke-virtual {v4, v15, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    move-object/from16 v17, v4

    .line 26
    new-array v4, v5, [Ljava/lang/Object;

    invoke-virtual {v6, v15, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    if-eqz v2, :cond_2

    if-nez v4, :cond_3

    :cond_2
    move-object/from16 v26, v3

    move-object/from16 v19, v6

    move-object/from16 v23, v7

    move-object/from16 v24, v8

    move-object/from16 v25, v9

    move-object/from16 v21, v11

    move-object/from16 v22, v12

    goto/16 :goto_c

    .line 27
    :cond_3
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v18

    sget-wide v20, Lcom/tencent/bugly/proguard/l5;->z:J

    cmp-long v18, v18, v20

    if-ltz v18, :cond_4

    const/16 v5, 0x32

    if-le v5, v13, :cond_4

    const/16 v5, 0xa

    if-gt v5, v14, :cond_5

    :cond_4
    move-object/from16 v22, v12

    goto/16 :goto_d

    :cond_5
    add-int/lit8 v13, v13, 0x1

    move-object/from16 v19, v6

    const/4 v5, 0x0

    .line 28
    new-array v6, v5, [Ljava/lang/Object;

    invoke-virtual {v11, v15, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, [B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v6, ""

    if-eqz v5, :cond_7

    move-object/from16 v20, v6

    .line 29
    :try_start_1
    array-length v6, v5

    if-eqz v6, :cond_6

    .line 30
    new-instance v6, Ljava/lang/String;

    move-object/from16 v21, v11

    const-string v11, "UTF-8"

    invoke-direct {v6, v5, v11}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    goto :goto_3

    :catchall_0
    move-exception v0

    goto/16 :goto_10

    :cond_6
    :goto_1
    move-object/from16 v21, v11

    goto :goto_2

    :cond_7
    move-object/from16 v20, v6

    goto :goto_1

    :goto_2
    move-object/from16 v6, v20

    .line 31
    :goto_3
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/4 v11, 0x4

    move-object/from16 v22, v12

    const/4 v12, 0x5

    if-eq v5, v11, :cond_9

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-eq v5, v12, :cond_9

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/4 v12, 0x6

    if-eq v5, v12, :cond_9

    .line 32
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v12, 0xc

    if-eq v5, v12, :cond_9

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v12, 0x9

    if-eq v5, v12, :cond_9

    .line 33
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/4 v12, 0x7

    if-eq v5, v12, :cond_9

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/4 v12, 0x3

    if-eq v5, v12, :cond_9

    .line 34
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v12, 0x8

    if-eq v5, v12, :cond_9

    .line 35
    sget v2, Lcom/tencent/bugly/proguard/l5;->B:I

    add-int/lit8 v2, v2, 0x1

    sput v2, Lcom/tencent/bugly/proguard/l5;->B:I

    .line 36
    invoke-virtual {v1, v6}, Lcom/tencent/bugly/proguard/l5;->b(Ljava/lang/String;)V

    :goto_4
    move-object/from16 v26, v3

    move-object/from16 v23, v7

    move-object/from16 v24, v8

    move-object/from16 v25, v9

    :cond_8
    move v7, v13

    goto/16 :goto_a

    .line 37
    :cond_9
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-eq v5, v11, :cond_b

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/4 v11, 0x5

    if-eq v5, v11, :cond_b

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/4 v12, 0x6

    if-ne v5, v12, :cond_a

    goto :goto_5

    :cond_a
    const/4 v5, 0x0

    const/4 v11, 0x0

    goto/16 :goto_7

    .line 38
    :cond_b
    :goto_5
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_c

    goto :goto_4

    .line 39
    :cond_c
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/4 v12, 0x6

    if-ne v5, v12, :cond_d

    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v11

    sget-wide v25, Lcom/tencent/bugly/proguard/l5;->D:D

    cmpg-double v5, v11, v25

    if-gez v5, :cond_d

    const/4 v5, 0x0

    .line 40
    new-array v11, v5, [Ljava/lang/Object;

    invoke-virtual {v10, v15, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/io/InputStream;

    if-eqz v5, :cond_d

    .line 41
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v12, v1, Lcom/tencent/bugly/proguard/l5;->d:Ljava/lang/String;

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v12, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v12, "exit_trace_"

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    const/4 v12, 0x0

    .line 42
    invoke-static {v11, v5, v12}, Lcom/tencent/bugly/common/utils/FileUtil;->writeFile(Ljava/lang/String;Ljava/io/InputStream;Z)V

    goto :goto_6

    :cond_d
    const/4 v11, 0x0

    .line 43
    :goto_6
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/4 v12, 0x5

    if-ne v5, v12, :cond_e

    invoke-static {}, Lcom/tencent/bugly/proguard/o4;->b()I

    move-result v5

    const/16 v12, 0x1f

    if-lt v5, v12, :cond_e

    .line 44
    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v23

    sget-wide v25, Lcom/tencent/bugly/proguard/l5;->D:D

    cmpg-double v5, v23, v25

    if-gez v5, :cond_e

    const/4 v5, 0x0

    .line 45
    new-array v12, v5, [Ljava/lang/Object;

    invoke-virtual {v10, v15, v12}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/io/InputStream;

    if-eqz v5, :cond_e

    .line 46
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v12, v1, Lcom/tencent/bugly/proguard/l5;->d:Ljava/lang/String;

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v12, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v12, "exit_tombs_"

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    const/4 v12, 0x0

    .line 47
    invoke-static {v11, v5, v12}, Lcom/tencent/bugly/common/utils/FileUtil;->writeFile(Ljava/lang/String;Ljava/io/InputStream;Z)V

    :cond_e
    const/4 v5, 0x0

    .line 48
    :goto_7
    new-array v12, v5, [Ljava/lang/Object;

    invoke-virtual {v7, v15, v12}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Integer;

    move-object/from16 v23, v7

    .line 49
    new-array v7, v5, [Ljava/lang/Object;

    invoke-virtual {v8, v15, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    move-object/from16 v24, v8

    .line 50
    new-array v8, v5, [Ljava/lang/Object;

    invoke-virtual {v9, v15, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    move-object/from16 v25, v9

    .line 51
    new-array v9, v5, [Ljava/lang/Object;

    invoke-virtual {v3, v15, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    if-nez v5, :cond_f

    const/4 v5, -0x1

    goto :goto_8

    .line 52
    :cond_f
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    :goto_8
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    .line 53
    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v26, v3

    const-string v3, "exitProcessId:"

    invoke-virtual {v15, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, "; exitProcessName:"

    invoke-virtual {v15, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "; exitTime:"

    invoke-virtual {v15, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, "; exitReason:"

    invoke-virtual {v15, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, "; exitDescription:"

    invoke-virtual {v15, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "; crashIdentify: "

    invoke-virtual {v15, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "; importance = "

    invoke-virtual {v15, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v9, 0x0

    new-array v15, v9, [Ljava/lang/Object;

    invoke-static {v3, v15}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 54
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_11

    .line 55
    invoke-virtual {v1, v6}, Lcom/tencent/bugly/proguard/l5;->c(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v3

    if-eqz v3, :cond_10

    .line 56
    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    .line 57
    invoke-interface {v3, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_9

    :cond_10
    move-object/from16 v9, v20

    goto :goto_9

    :cond_11
    move-object/from16 v9, v20

    const/4 v3, 0x0

    :goto_9
    if-eqz v12, :cond_8

    if-eqz v7, :cond_8

    .line 58
    new-instance v15, Lcom/tencent/bugly/proguard/k5;

    invoke-direct {v15}, Lcom/tencent/bugly/proguard/k5;-><init>()V

    .line 59
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v12

    .line 60
    iput v12, v15, Lcom/tencent/bugly/proguard/k5;->a:I

    .line 61
    iput-object v7, v15, Lcom/tencent/bugly/proguard/k5;->b:Ljava/lang/String;

    move v7, v13

    .line 62
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v12

    .line 63
    iput-wide v12, v15, Lcom/tencent/bugly/proguard/k5;->c:J

    .line 64
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 65
    iput v2, v15, Lcom/tencent/bugly/proguard/k5;->d:I

    .line 66
    iput-object v8, v15, Lcom/tencent/bugly/proguard/k5;->e:Ljava/lang/String;

    .line 67
    iput-object v11, v15, Lcom/tencent/bugly/proguard/k5;->f:Ljava/lang/String;

    .line 68
    iput-object v6, v15, Lcom/tencent/bugly/proguard/k5;->g:Ljava/lang/String;

    .line 69
    iput v5, v15, Lcom/tencent/bugly/proguard/k5;->h:I

    .line 70
    iput-object v9, v15, Lcom/tencent/bugly/proguard/k5;->i:Ljava/lang/String;

    if-eqz v3, :cond_12

    .line 71
    iput-object v3, v15, Lcom/tencent/bugly/proguard/k5;->j:Ljava/util/Map;

    .line 72
    :cond_12
    invoke-static {}, Lcom/tencent/bugly/proguard/m5;->a()Lcom/tencent/bugly/proguard/m5;

    move-result-object v2

    iget-object v3, v1, Lcom/tencent/bugly/proguard/l5;->d:Ljava/lang/String;

    invoke-virtual {v2, v15, v3}, Lcom/tencent/bugly/proguard/m5;->a(Lcom/tencent/bugly/proguard/k5;Ljava/lang/String;)V

    add-int/lit8 v14, v14, 0x1

    :goto_a
    move-object/from16 v2, p1

    move v13, v7

    :goto_b
    move-object/from16 v4, v17

    move-object/from16 v6, v19

    move-object/from16 v11, v21

    move-object/from16 v12, v22

    move-object/from16 v7, v23

    move-object/from16 v8, v24

    move-object/from16 v9, v25

    move-object/from16 v3, v26

    const/4 v5, 0x0

    const/4 v15, 0x0

    goto/16 :goto_0

    :goto_c
    move-object/from16 v2, p1

    goto :goto_b

    .line 73
    :goto_d
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 74
    sget-wide v4, Lcom/tencent/bugly/proguard/l5;->A:J

    sub-long v4, v2, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->abs(J)J

    move-result-wide v4

    const-wide/32 v6, 0x5265c00

    cmp-long v0, v6, v4

    if-gez v0, :cond_14

    .line 75
    sget v0, Lcom/tencent/bugly/proguard/l5;->B:I

    if-eqz v0, :cond_13

    .line 76
    invoke-static {}, Lcom/tencent/bugly/proguard/m5;->a()Lcom/tencent/bugly/proguard/m5;

    move-result-object v0

    sget v4, Lcom/tencent/bugly/proguard/l5;->B:I

    invoke-virtual {v0, v4}, Lcom/tencent/bugly/proguard/m5;->a(I)V

    .line 77
    :cond_13
    sput-wide v2, Lcom/tencent/bugly/proguard/l5;->A:J

    .line 78
    invoke-interface/range {v22 .. v22}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v4, "exit_normal_last_time"

    invoke-interface {v0, v4, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    const/16 v18, 0x0

    .line 79
    sput v18, Lcom/tencent/bugly/proguard/l5;->B:I

    .line 80
    :cond_14
    invoke-interface/range {v22 .. v22}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v4, "exit_normal_count"

    sget v5, Lcom/tencent/bugly/proguard/l5;->B:I

    invoke-interface {v0, v4, v5}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 81
    sput-wide v2, Lcom/tencent/bugly/proguard/l5;->z:J

    .line 82
    invoke-interface/range {v22 .. v22}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v2, "exit_last_time"

    sget-wide v3, Lcom/tencent/bugly/proguard/l5;->z:J

    invoke-interface {v0, v2, v3, v4}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 83
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Success handle all info, query exit info: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", exception exit upload: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v5, 0x0

    new-array v2, v5, [Ljava/lang/Object;

    invoke-static {v0, v2}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    .line 84
    :cond_15
    :goto_e
    const-string v0, "No exit info need to upload."

    const/4 v5, 0x0

    new-array v2, v5, [Ljava/lang/Object;

    invoke-static {v0, v2}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    .line 85
    :cond_16
    :goto_f
    const-string v0, "Failed to get ApplicationExitInfo method."

    const/4 v5, 0x0

    new-array v2, v5, [Ljava/lang/Object;

    invoke-static {v0, v2}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void

    .line 86
    :goto_10
    invoke-static {v0}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public final a(Landroid/content/SharedPreferences;)V
    .locals 5

    if-nez p1, :cond_0

    return-void

    .line 6
    :cond_0
    const-string v0, "exit_last_time"

    const-wide/16 v1, 0x0

    invoke-interface {p1, v0, v1, v2}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v3

    sput-wide v3, Lcom/tencent/bugly/proguard/l5;->z:J

    .line 7
    const-string v0, "exit_normal_last_time"

    invoke-interface {p1, v0, v1, v2}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    sput-wide v0, Lcom/tencent/bugly/proguard/l5;->A:J

    .line 8
    const-string v0, "exit_normal_count"

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result p1

    sput p1, Lcom/tencent/bugly/proguard/l5;->B:I

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 2

    .line 98
    sget-boolean v0, Lcom/tencent/bugly/proguard/l5;->C:Z

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/l5;->e:Z

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    goto :goto_0

    .line 99
    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/l5;->b:Ljava/util/concurrent/ConcurrentMap;

    const-string v1, "bugly_stage"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/l5;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 101
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    :cond_2
    :goto_0
    return-void
.end method

.method public b()V
    .locals 2

    .line 5
    invoke-static {}, Lcom/tencent/bugly/proguard/m0;->c()Lcom/tencent/bugly/proguard/m0;

    move-result-object v0

    new-instance v1, Lcom/tencent/bugly/proguard/l5$b;

    invoke-direct {v1, p0}, Lcom/tencent/bugly/proguard/l5$b;-><init>(Lcom/tencent/bugly/proguard/l5;)V

    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/m0;->a(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 2

    .line 2
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/tencent/bugly/proguard/l5;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "exit_data_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 3
    invoke-static {p1}, Lcom/tencent/bugly/common/utils/FileUtil;->deleteFile(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 4
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public final c(Ljava/lang/String;)Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "exit_data_"

    const/4 v1, 0x0

    .line 16
    :try_start_0
    iget-object v2, p0, Lcom/tencent/bugly/proguard/l5;->c:Ljava/lang/String;

    const-string v3, ""

    invoke-static {v2, v3}, Lcom/tencent/bugly/common/utils/FileUtil;->getFiles(Ljava/lang/String;Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v2

    if-nez v2, :cond_0

    return-object v1

    .line 17
    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 18
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/io/File;

    .line 19
    invoke-virtual {v2}, Ljava/io/File;->isFile()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 20
    invoke-virtual {v2}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/tencent/bugly/common/utils/FileUtil;->readOutputFromFile(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 21
    invoke-static {v2}, Lcom/tencent/bugly/common/utils/FileUtil;->deleteFile(Ljava/io/File;)V

    .line 22
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/l5;->d(Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    move-exception p1

    .line 23
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    :cond_2
    return-object v1
.end method

.method public final c()V
    .locals 11

    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/l5;->c:Ljava/lang/String;

    if-nez v0, :cond_0

    goto :goto_4

    .line 3
    :cond_0
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/tencent/bugly/proguard/l5;->c:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 4
    :try_start_0
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_4

    .line 5
    :cond_1
    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 6
    array-length v1, v0

    if-nez v1, :cond_2

    goto :goto_4

    .line 7
    :cond_2
    array-length v1, v0

    const/16 v2, 0x1e

    const/4 v3, 0x0

    if-le v1, v2, :cond_3

    .line 8
    array-length v1, v0

    sub-int/2addr v1, v2

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_3
    move v1, v3

    .line 9
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 10
    invoke-static {v0}, Lcom/tencent/bugly/proguard/a7;->a([Ljava/io/File;)V

    .line 11
    array-length v2, v0

    :goto_1
    if-ge v3, v2, :cond_6

    aget-object v6, v0, v3

    if-lez v1, :cond_4

    .line 12
    invoke-static {v6}, Lcom/tencent/bugly/common/utils/FileUtil;->deleteFile(Ljava/io/File;)V

    add-int/lit8 v1, v1, -0x1

    goto :goto_2

    .line 13
    :cond_4
    invoke-virtual {v6}, Ljava/io/File;->lastModified()J

    move-result-wide v7

    sub-long v7, v4, v7

    const-wide/32 v9, 0xf731400

    cmp-long v7, v7, v9

    if-lez v7, :cond_5

    .line 14
    invoke-static {v6}, Lcom/tencent/bugly/common/utils/FileUtil;->deleteFile(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_5
    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 15
    :goto_3
    invoke-static {v0}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    :cond_6
    :goto_4
    return-void
.end method

.method public final d(Ljava/lang/String;)Ljava/util/Map;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 11
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    if-eqz p1, :cond_3

    .line 12
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_2

    .line 13
    :cond_0
    const-string v1, "\n"

    invoke-virtual {p1, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    .line 14
    array-length v1, p1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_3

    aget-object v4, p1, v3

    .line 15
    const-string v5, "\u0000"

    const/4 v6, 0x2

    invoke-virtual {v4, v5, v6}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v4

    .line 16
    array-length v5, v4

    const/4 v7, 0x1

    if-ne v5, v6, :cond_1

    .line 17
    aget-object v5, v4, v2

    aget-object v4, v4, v7

    invoke-virtual {v0, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 18
    :cond_1
    array-length v5, v4

    if-ne v5, v7, :cond_2

    .line 19
    aget-object v4, v4, v2

    const-string v5, ""

    invoke-virtual {v0, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    :goto_2
    return-object v0
.end method

.method public final d()V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/l5;->d:Ljava/lang/String;

    if-nez v0, :cond_0

    goto :goto_1

    .line 3
    :cond_0
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/tencent/bugly/proguard/l5;->d:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 4
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_1

    .line 5
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    move-result v0

    .line 6
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "make exit info dir, "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 7
    :cond_1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/l5;->d:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/tencent/bugly/common/utils/FileUtil;->getFiles(Ljava/lang/String;Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 8
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    .line 9
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/io/File;

    .line 10
    invoke-static {v1}, Lcom/tencent/bugly/common/utils/FileUtil;->deleteFile(Ljava/io/File;)V

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public final e()V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/l5;->c:Ljava/lang/String;

    if-nez v0, :cond_0

    return-void

    .line 3
    :cond_0
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/tencent/bugly/proguard/l5;->c:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 4
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_1

    .line 5
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    .line 6
    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "make exit info data dir failed!"

    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    :cond_1
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/l5;->e:Z

    return-void
.end method

.method public final g()V
    .locals 3

    .line 1
    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/l5;->e()V

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/l5;->e:Z

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lcom/tencent/bugly/proguard/g;->e()Ljava/lang/String;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v1, p0, Lcom/tencent/bugly/proguard/l5;->b:Ljava/util/concurrent/ConcurrentMap;

    .line 16
    .line 17
    const-string v2, "bugly_stage"

    .line 18
    .line 19
    .line 20
    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception v0

    .line 23
    goto :goto_1

    .line 24
    .line 25
    .line 26
    :cond_0
    :goto_0
    invoke-static {}, Lcom/tencent/bugly/proguard/g;->h()Lcom/tencent/bugly/proguard/g;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p0}, Lcom/tencent/bugly/proguard/g;->a(Lcom/tencent/bugly/proguard/y9;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/l5;->i()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/l5;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    return-void

    .line 38
    .line 39
    .line 40
    :goto_1
    invoke-static {v0}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    .line 41
    :cond_1
    return-void
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

.method public final h()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/m0;->c()Lcom/tencent/bugly/proguard/m0;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, Lcom/tencent/bugly/proguard/l5$a;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, p0}, Lcom/tencent/bugly/proguard/l5$a;-><init>(Lcom/tencent/bugly/proguard/l5;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/m0;->a(Ljava/lang/Runnable;)Z

    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public i()V
    .locals 2

    .line 1
    .line 2
    sget-boolean v0, Lcom/tencent/bugly/proguard/l5;->C:Z

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/l5;->e:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    goto :goto_0

    .line 10
    .line 11
    .line 12
    :cond_0
    :try_start_0
    invoke-static {}, Lcom/tencent/bugly/proguard/d3;->c()Landroid/content/Context;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l2;->i()Ljava/util/Map;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    iget-object v1, p0, Lcom/tencent/bugly/proguard/l5;->b:Ljava/util/concurrent/ConcurrentMap;

    .line 26
    .line 27
    .line 28
    invoke-interface {v1, v0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/l5;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    return-void

    .line 33
    :catchall_0
    move-exception v0

    .line 34
    .line 35
    .line 36
    invoke-static {v0}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    .line 37
    :cond_1
    :goto_0
    return-void
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
