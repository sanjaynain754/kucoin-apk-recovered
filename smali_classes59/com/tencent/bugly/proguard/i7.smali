.class public Lcom/tencent/bugly/proguard/i7;
.super Ljava/lang/Object;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/bugly/proguard/i7$y;
    }
.end annotation


# static fields
.field public static final a:Ljava/lang/String; = "4.0"

.field public static final b:Ljava/lang/String; = "CrashReport-GameAgent"

.field public static final c:I = 0x0

.field public static final d:I = 0x1

.field public static final e:I = 0x2

.field public static final f:I = 0x0

.field public static final g:I = 0x1

.field public static final h:I = 0x2

.field public static final i:I = 0x3

.field public static final j:I = 0x4

.field public static final k:I = 0x4

.field public static final l:I = 0x5

.field public static final m:I = 0x6

.field public static final n:Ljava/lang/String; = "com.unity3d.player.UnityPlayer"

.field public static final o:Ljava/lang/String; = "org.cocos2dx.lib.Cocos2dxActivity"

.field public static p:I

.field public static q:J

.field public static r:Landroid/os/Handler;

.field public static s:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field public static t:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public static u:Lcom/tencent/feedback/eup/CrashHandleListener;

.field public static v:Z


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
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method

.method public static a()V
    .locals 1

    .line 55
    new-instance v0, Lcom/tencent/bugly/proguard/i7$n;

    invoke-direct {v0}, Lcom/tencent/bugly/proguard/i7$n;-><init>()V

    invoke-static {v0}, Lcom/tencent/bugly/proguard/i7;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static a(I)V
    .locals 0

    .line 21
    sput p0, Lcom/tencent/bugly/proguard/i7;->p:I

    return-void
.end method

.method public static a(ILjava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "CrashReport-GameAgent"

    invoke-static {p0, v0, p1}, Lcom/tencent/bugly/proguard/i7;->a(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static a(ILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 57
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    if-eqz p0, :cond_4

    const/4 v0, 0x2

    if-eq p0, v0, :cond_3

    const/4 v0, 0x3

    if-eq p0, v0, :cond_2

    const/4 v0, 0x4

    if-eq p0, v0, :cond_1

    .line 58
    invoke-static {p1, p2}, Lcom/tencent/bugly/proguard/a2;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 59
    :cond_1
    invoke-static {p1, p2}, Lcom/tencent/bugly/proguard/a2;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 60
    :cond_2
    invoke-static {p1, p2}, Lcom/tencent/bugly/proguard/a2;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 61
    :cond_3
    invoke-static {p1, p2}, Lcom/tencent/bugly/proguard/a2;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 62
    :cond_4
    invoke-static {p1, p2}, Lcom/tencent/bugly/proguard/a2;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 3

    .line 14
    invoke-static {p4}, Lcom/tencent/bugly/proguard/i7;->c(Ljava/lang/String;)Ljava/util/HashMap;

    move-result-object p4

    const/4 v0, 0x4

    if-eq p0, v0, :cond_2

    const/4 v1, 0x5

    if-eq p0, v1, :cond_1

    const/4 v1, 0x6

    if-eq p0, v1, :cond_0

    .line 15
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "The category of exception posted is unknown: "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 17
    const-string p1, "CrashReport-GameAgent"

    invoke-static {v0, p1, p0}, Lcom/tencent/bugly/proguard/i7;->a(ILjava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    move v2, p5

    move-object p5, p4

    move p4, v2

    .line 18
    invoke-static/range {p0 .. p5}, Lcom/tencent/bugly/proguard/i7;->b(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;)V

    return-void

    :cond_1
    move v2, p5

    move-object p5, p4

    move p4, v2

    .line 19
    invoke-static/range {p0 .. p5}, Lcom/tencent/bugly/proguard/i7;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;)V

    return-void

    :cond_2
    move v2, p5

    move-object p5, p4

    move p4, v2

    .line 20
    invoke-static {p1, p2, p3, p4, p5}, Lcom/tencent/bugly/proguard/i7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;)V

    return-void
.end method

.method public static a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 6

    const/4 v4, 0x0

    move v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v5, p4

    .line 13
    invoke-static/range {v0 .. v5}, Lcom/tencent/bugly/proguard/i7;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method public static a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 11
    new-instance v0, Lcom/tencent/bugly/proguard/i7$r;

    move v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v6, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v6}, Lcom/tencent/bugly/proguard/i7$r;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Z)V

    invoke-static {v0}, Lcom/tencent/bugly/proguard/i7;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static a(J)V
    .locals 2

    const-wide/16 v0, 0x0

    .line 5
    invoke-static {v0, v1, p0, p1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p0

    .line 6
    sget-object v0, Lcom/tencent/bugly/proguard/i7;->r:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 7
    new-instance v1, Lcom/tencent/bugly/proguard/i7$k;

    invoke-direct {v1}, Lcom/tencent/bugly/proguard/i7$k;-><init>()V

    invoke-virtual {v0, v1, p0, p1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    .line 8
    :cond_0
    :try_start_0
    invoke-static {p0, p1}, Ljava/lang/Thread;->sleep(J)V

    .line 9
    invoke-static {}, Lcom/tencent/bugly/proguard/i7;->e()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    .line 10
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method public static a(Lcom/tencent/feedback/eup/CrashHandleListener;)V
    .locals 0

    .line 22
    sput-object p0, Lcom/tencent/bugly/proguard/i7;->u:Lcom/tencent/feedback/eup/CrashHandleListener;

    return-void
.end method

.method public static a(Ljava/lang/Runnable;)V
    .locals 1

    .line 2
    invoke-static {}, Lcom/tencent/bugly/proguard/i7;->f()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, p0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void

    .line 4
    :cond_0
    new-instance v0, Ljava/lang/Thread;

    invoke-direct {v0, p0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public static a(Ljava/lang/String;)V
    .locals 1

    .line 56
    new-instance v0, Lcom/tencent/bugly/proguard/i7$o;

    invoke-direct {v0, p0}, Lcom/tencent/bugly/proguard/i7$o;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/tencent/bugly/proguard/i7;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 53
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 54
    :cond_0
    new-instance v0, Lcom/tencent/bugly/proguard/i7$i;

    invoke-direct {v0, p0, p1}, Lcom/tencent/bugly/proguard/i7$i;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/tencent/bugly/proguard/i7;->a(Ljava/lang/Runnable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 23
    invoke-static {}, Lcom/tencent/bugly/proguard/i7;->g()Landroid/content/Context;

    move-result-object v0

    const-string v1, "CrashReport-GameAgent"

    const/4 v2, 0x4

    if-nez v0, :cond_0

    .line 24
    const-string p0, "Context is null. bugly initialize terminated."

    .line 25
    invoke-static {v2, v1, p0}, Lcom/tencent/bugly/proguard/i7;->a(ILjava/lang/String;Ljava/lang/String;)V

    return-void

    .line 26
    :cond_0
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_5

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    const/16 v1, 0x6b

    .line 27
    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/ye;->c(ILjava/lang/Object;)Z

    const/16 v0, 0x65

    .line 28
    invoke-static {v0, p0}, Lcom/tencent/bugly/proguard/ff;->a(ILjava/lang/String;)Z

    const/16 p0, 0x64

    .line 29
    invoke-static {p0, p1}, Lcom/tencent/bugly/proguard/ff;->a(ILjava/lang/String;)Z

    .line 30
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_2

    const/16 p0, 0x67

    .line 31
    invoke-static {p0, p2}, Lcom/tencent/bugly/proguard/ff;->a(ILjava/lang/String;)Z

    .line 32
    :cond_2
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_3

    const/16 p0, 0x6d

    .line 33
    invoke-static {p0, p3}, Lcom/tencent/bugly/proguard/ff;->a(ILjava/lang/String;)Z

    .line 34
    :cond_3
    invoke-static {p5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_4

    const/16 p0, 0x70

    .line 35
    invoke-static {p0, p5}, Lcom/tencent/bugly/proguard/ff;->a(ILjava/lang/String;)Z

    .line 36
    :cond_4
    new-instance p0, Lcom/tencent/bugly/proguard/i7$t;

    invoke-direct {p0, p4}, Lcom/tencent/bugly/proguard/i7$t;-><init>([Ljava/lang/String;)V

    invoke-static {p0}, Lcom/tencent/bugly/proguard/i7;->a(Ljava/lang/Runnable;)V

    return-void

    .line 37
    :cond_5
    :goto_0
    const-string p0, "Please input appId and appKey."

    .line 38
    invoke-static {v2, v1, p0}, Lcom/tencent/bugly/proguard/i7;->a(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 2

    .line 39
    invoke-static {}, Lcom/tencent/bugly/proguard/i7;->g()Landroid/content/Context;

    move-result-object p4

    const-string p5, "CrashReport-GameAgent"

    const/4 v0, 0x4

    if-nez p4, :cond_0

    .line 40
    const-string p0, "Context is null. bugly initialize terminated."

    .line 41
    invoke-static {v0, p5, p0}, Lcom/tencent/bugly/proguard/i7;->a(ILjava/lang/String;Ljava/lang/String;)V

    return-void

    .line 42
    :cond_0
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_4

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    .line 43
    :cond_1
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_2

    .line 44
    invoke-static {p4, p2}, Lcom/tencent/bugly/proguard/n3;->g(Landroid/content/Context;Ljava/lang/String;)V

    .line 45
    :cond_2
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_3

    .line 46
    invoke-static {p3}, Lcom/tencent/bugly/proguard/n3;->e(Ljava/lang/String;)V

    .line 47
    :cond_3
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object p1, Lcom/tencent/bugly/proguard/i7;->r:Landroid/os/Handler;

    .line 48
    new-instance p1, Lcom/tencent/bugly/proguard/i7$u;

    invoke-direct {p1, p4, p0, p6}, Lcom/tencent/bugly/proguard/i7$u;-><init>(Landroid/content/Context;Ljava/lang/String;Z)V

    invoke-static {p1}, Lcom/tencent/bugly/proguard/i7;->a(Ljava/lang/Runnable;)V

    return-void

    .line 49
    :cond_4
    :goto_0
    const-string p0, "Please input appId and appKey."

    .line 50
    invoke-static {v0, p5, p0}, Lcom/tencent/bugly/proguard/i7;->a(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 12
    new-instance v0, Lcom/tencent/bugly/proguard/i7$s;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v5, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lcom/tencent/bugly/proguard/i7$s;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Z)V

    invoke-static {v0}, Lcom/tencent/bugly/proguard/i7;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static a([Ljava/lang/String;)V
    .locals 1

    if-eqz p0, :cond_1

    .line 51
    array-length v0, p0

    if-nez v0, :cond_0

    goto :goto_0

    .line 52
    :cond_0
    new-instance v0, Lcom/tencent/bugly/proguard/i7$g;

    invoke-direct {v0, p0}, Lcom/tencent/bugly/proguard/i7$g;-><init>([Ljava/lang/String;)V

    invoke-static {v0}, Lcom/tencent/bugly/proguard/i7;->a(Ljava/lang/Runnable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public static synthetic b()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/tencent/bugly/proguard/i7;->e()V

    return-void
.end method

.method public static b(I)V
    .locals 1

    .line 14
    new-instance v0, Lcom/tencent/bugly/proguard/i7$x;

    invoke-direct {v0, p0}, Lcom/tencent/bugly/proguard/i7$x;-><init>(I)V

    invoke-static {v0}, Lcom/tencent/bugly/proguard/i7;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static b(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 2
    :try_start_0
    const-string/jumbo v0, "stack traceback"

    invoke-virtual {p3, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v1, "\n"

    if-eqz v0, :cond_0

    .line 3
    :try_start_1
    invoke-virtual {p3, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {p3, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p3

    .line 4
    :cond_0
    invoke-virtual {p3, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_1

    add-int/lit8 v0, v0, 0x1

    .line 5
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {p3, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p3

    .line 6
    :cond_1
    invoke-virtual {p3, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x0

    if-lez v0, :cond_2

    .line 7
    invoke-virtual {p3, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_2
    move-object v0, p3

    .line 8
    :goto_0
    const-string v2, "]:"

    invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v2

    if-eqz p1, :cond_4

    .line 9
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    if-nez v3, :cond_3

    goto :goto_3

    :cond_3
    :goto_1
    move-object v2, p1

    :goto_2
    move-object v4, p3

    goto :goto_4

    :cond_4
    :goto_3
    const/4 v3, -0x1

    if-eq v2, v3, :cond_5

    add-int/lit8 v2, v2, 0x1

    .line 10
    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    if-eqz p1, :cond_5

    .line 11
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_3

    :cond_5
    move-object v2, p2

    goto :goto_2

    .line 12
    :goto_4
    new-instance v0, Lcom/tencent/bugly/proguard/i7$q;

    move v1, p0

    move-object v3, p2

    move v6, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v6}, Lcom/tencent/bugly/proguard/i7$q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Z)V

    invoke-static {v0}, Lcom/tencent/bugly/proguard/i7;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static b(J)V
    .locals 0

    .line 13
    sput-wide p0, Lcom/tencent/bugly/proguard/i7;->q:J

    return-void
.end method

.method public static b(Ljava/lang/String;)V
    .locals 1

    .line 16
    new-instance v0, Lcom/tencent/bugly/proguard/i7$p;

    invoke-direct {v0, p0}, Lcom/tencent/bugly/proguard/i7$p;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/tencent/bugly/proguard/i7;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static b([Ljava/lang/String;)V
    .locals 1

    .line 15
    new-instance v0, Lcom/tencent/bugly/proguard/i7$l;

    invoke-direct {v0, p0}, Lcom/tencent/bugly/proguard/i7$l;-><init>([Ljava/lang/String;)V

    invoke-static {v0}, Lcom/tencent/bugly/proguard/i7;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic c()Lcom/tencent/feedback/eup/CrashHandleListener;
    .locals 1

    .line 1
    sget-object v0, Lcom/tencent/bugly/proguard/i7;->u:Lcom/tencent/feedback/eup/CrashHandleListener;

    return-object v0
.end method

.method public static c(Ljava/lang/String;)Ljava/util/HashMap;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 2
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    .line 3
    :cond_0
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 4
    new-instance p0, Ljava/util/HashMap;

    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 5
    :try_start_1
    invoke-virtual {v0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v1

    .line 6
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 7
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 8
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 9
    invoke-virtual {p0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_1
    return-object p0

    :goto_1
    move-object v1, p0

    goto :goto_2

    :catch_1
    move-exception p0

    move-object v0, p0

    .line 10
    :goto_2
    new-instance p0, Ljava/lang/StringBuilder;

    const-string v2, "Failed to parse extra info. "

    invoke-direct {p0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "CrashReport-GameAgent"

    invoke-static {v0, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-object v1
.end method

.method public static c(I)V
    .locals 1

    .line 11
    new-instance v0, Lcom/tencent/bugly/proguard/i7$h;

    invoke-direct {v0, p0}, Lcom/tencent/bugly/proguard/i7$h;-><init>(I)V

    invoke-static {v0}, Lcom/tencent/bugly/proguard/i7;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static c([Ljava/lang/String;)V
    .locals 1

    .line 12
    new-instance v0, Lcom/tencent/bugly/proguard/i7$m;

    invoke-direct {v0, p0}, Lcom/tencent/bugly/proguard/i7$m;-><init>([Ljava/lang/String;)V

    invoke-static {v0}, Lcom/tencent/bugly/proguard/i7;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic d()J
    .locals 2

    .line 1
    sget-wide v0, Lcom/tencent/bugly/proguard/i7;->q:J

    return-wide v0
.end method

.method public static d(Ljava/lang/String;)V
    .locals 3

    .line 2
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 3
    :cond_0
    const-string v0, "<Log>"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x2

    const-string v2, "CrashReport-GameAgent"

    if-eqz v0, :cond_1

    .line 4
    invoke-static {v1, v2, p0}, Lcom/tencent/bugly/proguard/i7;->a(ILjava/lang/String;Ljava/lang/String;)V

    return-void

    .line 5
    :cond_1
    const-string v0, "<LogDebug>"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    .line 6
    invoke-static {v0, v2, p0}, Lcom/tencent/bugly/proguard/i7;->a(ILjava/lang/String;Ljava/lang/String;)V

    return-void

    .line 7
    :cond_2
    const-string v0, "<LogInfo>"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 8
    invoke-static {v1, v2, p0}, Lcom/tencent/bugly/proguard/i7;->a(ILjava/lang/String;Ljava/lang/String;)V

    return-void

    .line 9
    :cond_3
    const-string v0, "<LogWarning>"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x3

    if-eqz v0, :cond_4

    .line 10
    invoke-static {v1, v2, p0}, Lcom/tencent/bugly/proguard/i7;->a(ILjava/lang/String;Ljava/lang/String;)V

    return-void

    .line 11
    :cond_4
    const-string v0, "<LogAssert>"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 12
    invoke-static {v1, v2, p0}, Lcom/tencent/bugly/proguard/i7;->a(ILjava/lang/String;Ljava/lang/String;)V

    return-void

    .line 13
    :cond_5
    const-string v0, "<LogError>"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x4

    if-eqz v0, :cond_6

    .line 14
    invoke-static {v1, v2, p0}, Lcom/tencent/bugly/proguard/i7;->a(ILjava/lang/String;Ljava/lang/String;)V

    return-void

    .line 15
    :cond_6
    const-string v0, "<LogException>"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 16
    invoke-static {v1, v2, p0}, Lcom/tencent/bugly/proguard/i7;->a(ILjava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_7
    const/4 v0, 0x0

    .line 17
    invoke-static {v0, v2, p0}, Lcom/tencent/bugly/proguard/i7;->a(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static e()V
    .locals 4

    .line 1
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    .line 2
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    const-string v3, "Exit application by kill process[%d]"

    invoke-static {v1, v3, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 4
    const-string v2, "CrashReport-GameAgent"

    const/4 v3, 0x3

    invoke-static {v3, v2, v1}, Lcom/tencent/bugly/proguard/i7;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 5
    invoke-static {v0}, Landroid/os/Process;->killProcess(I)V

    return-void
.end method

.method public static e(Ljava/lang/String;)V
    .locals 1

    .line 6
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 7
    :cond_0
    new-instance v0, Lcom/tencent/bugly/proguard/i7$j;

    invoke-direct {v0, p0}, Lcom/tencent/bugly/proguard/i7$j;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/tencent/bugly/proguard/i7;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static f()Landroid/app/Activity;
    .locals 2

    .line 1
    sget-object v0, Lcom/tencent/bugly/proguard/i7;->s:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_3

    .line 2
    :cond_0
    sget v0, Lcom/tencent/bugly/proguard/i7;->p:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    .line 3
    const-string v0, "CrashReport-GameAgent"

    const-string v1, "Game type has not been set."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    invoke-static {}, Lcom/tencent/bugly/proguard/i7;->k()Landroid/app/Activity;

    move-result-object v0

    goto :goto_0

    .line 5
    :cond_1
    invoke-static {}, Lcom/tencent/bugly/proguard/i7;->i()Landroid/app/Activity;

    move-result-object v0

    goto :goto_0

    .line 6
    :cond_2
    invoke-static {}, Lcom/tencent/bugly/proguard/i7;->h()Landroid/app/Activity;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_3

    .line 7
    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v1, Lcom/tencent/bugly/proguard/i7;->s:Ljava/lang/ref/WeakReference;

    .line 8
    :cond_3
    sget-object v0, Lcom/tencent/bugly/proguard/i7;->s:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    return-object v0

    :cond_4
    const/4 v0, 0x0

    return-object v0
.end method

.method public static f(Ljava/lang/String;)V
    .locals 1

    .line 9
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 10
    :cond_0
    new-instance v0, Lcom/tencent/bugly/proguard/i7$w;

    invoke-direct {v0, p0}, Lcom/tencent/bugly/proguard/i7$w;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/tencent/bugly/proguard/i7;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static g()Landroid/content/Context;
    .locals 2

    .line 1
    sget-object v0, Lcom/tencent/bugly/proguard/i7;->t:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    .line 2
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/proguard/i7;->f()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 3
    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v1, Lcom/tencent/bugly/proguard/i7;->t:Ljava/lang/ref/WeakReference;

    .line 4
    :cond_1
    sget-object v0, Lcom/tencent/bugly/proguard/i7;->t:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    return-object v0

    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method

.method public static g(Ljava/lang/String;)V
    .locals 1

    .line 5
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 6
    :cond_0
    new-instance v0, Lcom/tencent/bugly/proguard/i7$c;

    invoke-direct {v0, p0}, Lcom/tencent/bugly/proguard/i7$c;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/tencent/bugly/proguard/i7;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static h()Landroid/app/Activity;
    .locals 4

    const/4 v0, 0x0

    .line 1
    :try_start_0
    const-string/jumbo v1, "org.cocos2dx.lib.Cocos2dxActivity"

    const-string v2, "getContext"

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Class;

    .line 2
    invoke-static {v1, v2, v0, v3}, Lcom/tencent/bugly/proguard/i7$y;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;[Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 3
    instance-of v2, v1, Landroid/app/Activity;

    if-eqz v2, :cond_0

    .line 4
    check-cast v1, Landroid/app/Activity;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    .line 5
    :catch_0
    const-string v1, "CrashReport-GameAgent"

    const-string v2, "Failed to get activity of Cocos."

    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-object v0
.end method

.method public static h(Ljava/lang/String;)V
    .locals 1

    .line 6
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 7
    :cond_0
    new-instance v0, Lcom/tencent/bugly/proguard/i7$d;

    invoke-direct {v0, p0}, Lcom/tencent/bugly/proguard/i7$d;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/tencent/bugly/proguard/i7;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static i()Landroid/app/Activity;
    .locals 3

    const/4 v0, 0x0

    .line 1
    :try_start_0
    const-string v1, "com.unity3d.player.UnityPlayer"

    const-string v2, "currentActivity"

    .line 2
    invoke-static {v1, v2, v0}, Lcom/tencent/bugly/proguard/i7$y;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 3
    instance-of v2, v1, Landroid/app/Activity;

    if-eqz v2, :cond_0

    .line 4
    check-cast v1, Landroid/app/Activity;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    .line 5
    :catch_0
    const-string v1, "CrashReport-GameAgent"

    const-string v2, "Failed to get activity of Unity."

    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-object v0
.end method

.method public static i(Ljava/lang/String;)V
    .locals 1

    .line 6
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 7
    :cond_0
    new-instance v0, Lcom/tencent/bugly/proguard/i7$e;

    invoke-direct {v0, p0}, Lcom/tencent/bugly/proguard/i7$e;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/tencent/bugly/proguard/i7;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static j()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "4.0"

    return-object v0
.end method

.method public static j(Ljava/lang/String;)V
    .locals 1

    .line 2
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 3
    :cond_0
    new-instance v0, Lcom/tencent/bugly/proguard/i7$f;

    invoke-direct {v0, p0}, Lcom/tencent/bugly/proguard/i7$f;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/tencent/bugly/proguard/i7;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static k()Landroid/app/Activity;
    .locals 1

    .line 1
    sget-boolean v0, Lcom/tencent/bugly/proguard/i7;->v:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    const/4 v0, 0x1

    .line 2
    sput-boolean v0, Lcom/tencent/bugly/proguard/i7;->v:Z

    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/i7;->h()Landroid/app/Activity;

    move-result-object v0

    if-nez v0, :cond_1

    .line 4
    invoke-static {}, Lcom/tencent/bugly/proguard/i7;->i()Landroid/app/Activity;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public static k(Ljava/lang/String;)V
    .locals 1

    .line 5
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 6
    :cond_0
    new-instance v0, Lcom/tencent/bugly/proguard/i7$v;

    invoke-direct {v0, p0}, Lcom/tencent/bugly/proguard/i7$v;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/tencent/bugly/proguard/i7;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static l(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-static {p0}, Lcom/tencent/bugly/proguard/d2;->a(Ljava/lang/String;)Z

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
.end method

.method public static m(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

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
    new-instance v0, Lcom/tencent/bugly/proguard/i7$a;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, p0}, Lcom/tencent/bugly/proguard/i7$a;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lcom/tencent/bugly/proguard/i7;->a(Ljava/lang/Runnable;)V

    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public static n(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

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
    new-instance v0, Lcom/tencent/bugly/proguard/i7$b;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, p0}, Lcom/tencent/bugly/proguard/i7$b;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lcom/tencent/bugly/proguard/i7;->a(Ljava/lang/Runnable;)V

    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method
