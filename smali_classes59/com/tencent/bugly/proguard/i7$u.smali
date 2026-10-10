.class public Lcom/tencent/bugly/proguard/i7$u;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/bugly/proguard/i7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/bugly/proguard/i7$u;->b:Landroid/content/Context;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/tencent/bugly/proguard/i7$u;->c:Ljava/lang/String;

    .line 5
    .line 6
    iput-boolean p3, p0, Lcom/tencent/bugly/proguard/i7$u;->d:Z

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
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
.end method


# virtual methods
.method public run()V
    .locals 11

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/i7;->c()Lcom/tencent/feedback/eup/CrashHandleListener;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    new-instance v4, Lcom/tencent/bugly/proguard/u3;

    .line 9
    .line 10
    .line 11
    invoke-direct {v4}, Lcom/tencent/bugly/proguard/u3;-><init>()V

    .line 12
    .line 13
    sget-object v0, Lcom/tencent/bugly/proguard/i7;->u:Lcom/tencent/feedback/eup/CrashHandleListener;

    .line 14
    monitor-enter v4

    .line 15
    .line 16
    :try_start_0
    iput-object v0, v4, Lcom/tencent/bugly/proguard/u3;->s:Lcom/tencent/feedback/eup/CrashHandleListener;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    monitor-exit v4

    .line 18
    .line 19
    iget-object v1, p0, Lcom/tencent/bugly/proguard/i7$u;->b:Landroid/content/Context;

    .line 20
    .line 21
    iget-object v2, p0, Lcom/tencent/bugly/proguard/i7$u;->c:Ljava/lang/String;

    .line 22
    .line 23
    iget-boolean v3, p0, Lcom/tencent/bugly/proguard/i7$u;->d:Z

    .line 24
    .line 25
    sget-wide v5, Lcom/tencent/bugly/proguard/i7;->q:J

    .line 26
    .line 27
    .line 28
    invoke-static {v1}, Lcom/tencent/bugly/proguard/d3;->a(Landroid/content/Context;)V

    .line 29
    .line 30
    .line 31
    invoke-static/range {v1 .. v6}, Lcom/tencent/bugly/proguard/n3;->a(Landroid/content/Context;Ljava/lang/String;ZLcom/tencent/bugly/proguard/u3;J)V

    .line 32
    return-void

    .line 33
    :catchall_0
    move-exception v0

    .line 34
    monitor-exit v4

    .line 35
    throw v0

    .line 36
    .line 37
    :cond_0
    iget-object v5, p0, Lcom/tencent/bugly/proguard/i7$u;->b:Landroid/content/Context;

    .line 38
    .line 39
    iget-object v6, p0, Lcom/tencent/bugly/proguard/i7$u;->c:Ljava/lang/String;

    .line 40
    .line 41
    iget-boolean v7, p0, Lcom/tencent/bugly/proguard/i7$u;->d:Z

    .line 42
    .line 43
    sget-wide v9, Lcom/tencent/bugly/proguard/i7;->q:J

    .line 44
    .line 45
    .line 46
    invoke-static {v5}, Lcom/tencent/bugly/proguard/d3;->a(Landroid/content/Context;)V

    .line 47
    const/4 v8, 0x0

    .line 48
    .line 49
    .line 50
    invoke-static/range {v5 .. v10}, Lcom/tencent/bugly/proguard/n3;->a(Landroid/content/Context;Ljava/lang/String;ZLcom/tencent/bugly/proguard/u3;J)V

    .line 51
    return-void
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
.end method
