.class public Lcom/tencent/bugly/proguard/r3;
.super Ljava/lang/Object;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/bugly/proguard/r3$c;,
        Lcom/tencent/bugly/proguard/r3$d;,
        Lcom/tencent/bugly/proguard/r3$b;
    }
.end annotation


# static fields
.field public static a:Landroid/content/Context; = null

.field public static final b:I = 0x64


# direct methods
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

.method public static a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 52
    sget-boolean v0, Lcom/tencent/bugly/proguard/rc;->c:Z

    const-string/jumbo v1, "unknown"

    if-nez v0, :cond_0

    .line 53
    sget-object p0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string p1, "Can not get user data because bugly is disable."

    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-object v1

    :cond_0
    if-nez p0, :cond_1

    .line 54
    sget-object p0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string p1, "getUserDataValue args context should not be null"

    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-object v1

    .line 55
    :cond_1
    invoke-static {p1}, Lcom/tencent/bugly/proguard/bi;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 p0, 0x0

    return-object p0

    .line 56
    :cond_2
    invoke-static {p0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/l2;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static a(Landroid/content/Context;)Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 57
    sget-boolean v0, Lcom/tencent/bugly/proguard/rc;->c:Z

    if-nez v0, :cond_0

    .line 58
    sget-object p0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string v0, "Can not get all keys of user data because bugly is disable."

    invoke-static {p0, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 59
    new-instance p0, Ljava/util/HashSet;

    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    return-object p0

    :cond_0
    if-nez p0, :cond_1

    .line 60
    sget-object p0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string v0, "getAllUserDataKeys args context should not be null"

    invoke-static {p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 61
    new-instance p0, Ljava/util/HashSet;

    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    return-object p0

    .line 62
    :cond_1
    invoke-static {p0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object p0

    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/l2;->b()Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method public static a()V
    .locals 2

    .line 35
    sget-boolean v0, Lcom/tencent/bugly/proguard/rc;->c:Z

    if-nez v0, :cond_0

    .line 36
    sget-object v0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string v1, "Can not close bugly because bugly is disable."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 37
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/proguard/l3;->b()Lcom/tencent/bugly/proguard/l3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l3;->c()Z

    move-result v0

    if-nez v0, :cond_1

    .line 38
    sget-object v0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string v1, "CrashReport has not been initialed! pls to call method \'initCrashReport\' first!"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 39
    :cond_1
    sget-object v0, Lcom/tencent/bugly/proguard/r3;->a:Landroid/content/Context;

    if-nez v0, :cond_2

    goto :goto_0

    .line 40
    :cond_2
    invoke-static {}, Lcom/tencent/bugly/proguard/w1;->b()Lcom/tencent/bugly/proguard/w1;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 41
    sget-object v1, Lcom/tencent/bugly/proguard/r3;->a:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/w1;->b(Landroid/content/Context;)V

    .line 42
    :cond_3
    invoke-static {}, Lcom/tencent/bugly/proguard/r3;->b()V

    .line 43
    sget-object v0, Lcom/tencent/bugly/proguard/r3;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/tencent/bugly/proguard/sa;->b(Landroid/content/Context;)V

    .line 44
    invoke-static {}, Lcom/tencent/bugly/proguard/m0;->c()Lcom/tencent/bugly/proguard/m0;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 45
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/m0;->b()V

    :cond_4
    :goto_0
    return-void
.end method

.method public static a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 23
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    move v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-static/range {v0 .. v5}, Lcom/tencent/bugly/proguard/r3;->a(Ljava/lang/Thread;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public static a(J)V
    .locals 1

    .line 77
    sget-boolean v0, Lcom/tencent/bugly/proguard/rc;->c:Z

    if-nez v0, :cond_0

    .line 78
    sget-object p0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string p1, "Can not set \'SessionIntervalMills\' because bugly is disable."

    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 79
    :cond_0
    invoke-static {p0, p1}, Lcom/tencent/bugly/proguard/sa;->d(J)V

    return-void
.end method

.method public static a(Landroid/content/Context;I)V
    .locals 2

    .line 46
    sget-boolean v0, Lcom/tencent/bugly/proguard/rc;->c:Z

    if-nez v0, :cond_0

    .line 47
    sget-object p0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string p1, "Can not set tag caught because bugly is disable."

    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    if-nez p0, :cond_1

    .line 48
    sget-object p0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string/jumbo p1, "setTag args context should not be null"

    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    if-gtz p1, :cond_2

    const/4 v0, 0x0

    .line 49
    new-array v0, v0, [Ljava/lang/Object;

    const-string/jumbo v1, "setTag args tagId should > 0"

    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 50
    :cond_2
    invoke-static {p0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/l2;->b(I)V

    .line 51
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string p1, "[param] set user scene tag: %d"

    invoke-static {p1, p0}, Lcom/tencent/bugly/proguard/x4;->e(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void
.end method

.method public static a(Landroid/content/Context;Lcom/tencent/bugly/proguard/r3$c;)V
    .locals 3

    .line 2
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    if-nez p0, :cond_0

    return-void

    .line 3
    :cond_0
    sput-object p0, Lcom/tencent/bugly/proguard/r3;->a:Landroid/content/Context;

    .line 4
    invoke-static {}, Lcom/tencent/bugly/proguard/l3;->b()Lcom/tencent/bugly/proguard/l3;

    move-result-object v2

    invoke-static {v2}, Lcom/tencent/bugly/proguard/rc;->a(Lcom/tencent/bugly/proguard/c1;)V

    .line 5
    invoke-static {p0, p1, v0, v1}, Lcom/tencent/bugly/proguard/rc;->a(Landroid/content/Context;Lcom/tencent/bugly/proguard/b2;J)V

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    if-eqz p0, :cond_3

    .line 63
    invoke-static {p1}, Lcom/tencent/bugly/proguard/bi;->c(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-static {p2}, Lcom/tencent/bugly/proguard/bi;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 64
    :cond_0
    const-string v0, "[a-zA-Z[0-9]]+"

    const-string v1, ""

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    .line 65
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x64

    const/4 v2, 0x0

    if-le v0, v1, :cond_1

    .line 66
    sget-object v0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const/16 v1, 0x32

    .line 67
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    .line 68
    const-string/jumbo v4, "putSdkData key length over limit %d, will be cutted."

    invoke-static {v4, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 69
    invoke-virtual {p1, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    .line 70
    :cond_1
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x1f4

    if-le v0, v1, :cond_2

    .line 71
    sget-object v0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const/16 v1, 0xc8

    .line 72
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    .line 73
    const-string/jumbo v4, "putSdkData value length over limit %d, will be cutted!"

    invoke-static {v4, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 74
    invoke-virtual {p2, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p2

    .line 75
    :cond_2
    invoke-static {p0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object p0

    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/l2;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object p0

    const-string p1, "[param] putSdkData data: %s - %s"

    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    new-array p1, v2, [Ljava/lang/Object;

    invoke-static {p0, p1}, Lcom/tencent/bugly/proguard/x4;->e(Ljava/lang/String;[Ljava/lang/Object;)Z

    :cond_3
    :goto_0
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Z)V
    .locals 1

    const/4 v0, 0x0

    .line 6
    invoke-static {p0, p1, p2, v0}, Lcom/tencent/bugly/proguard/r3;->a(Landroid/content/Context;Ljava/lang/String;ZLcom/tencent/bugly/proguard/r3$c;)V

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;ZLcom/tencent/bugly/proguard/r3$c;)V
    .locals 6

    .line 7
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v4

    if-nez p0, :cond_0

    return-void

    .line 8
    :cond_0
    sput-object p0, Lcom/tencent/bugly/proguard/r3;->a:Landroid/content/Context;

    .line 9
    invoke-static {p0}, Lcom/tencent/bugly/proguard/d3;->a(Landroid/content/Context;)V

    .line 10
    invoke-static {}, Lcom/tencent/bugly/proguard/l3;->b()Lcom/tencent/bugly/proguard/l3;

    move-result-object v0

    invoke-static {v0}, Lcom/tencent/bugly/proguard/rc;->a(Lcom/tencent/bugly/proguard/c1;)V

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    .line 11
    invoke-static/range {v0 .. v5}, Lcom/tencent/bugly/proguard/rc;->a(Landroid/content/Context;Ljava/lang/String;ZLcom/tencent/bugly/proguard/b2;J)V

    return-void
.end method

.method public static a(Landroid/content/Context;Z)V
    .locals 0

    .line 84
    invoke-static {p0, p1}, Lcom/tencent/bugly/proguard/r3;->b(Landroid/content/Context;Z)V

    return-void
.end method

.method public static a(Landroid/content/Context;ZZ)V
    .locals 0

    .line 34
    invoke-static {p0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object p0

    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/l2;->a(ZZ)V

    return-void
.end method

.method public static a(Ljava/lang/String;)V
    .locals 3

    .line 80
    sget-boolean v0, Lcom/tencent/bugly/proguard/rc;->c:Z

    if-nez v0, :cond_0

    .line 81
    sget-object p0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string v0, "Can not set DB name because bugly is disable."

    invoke-static {p0, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 82
    :cond_0
    sget-object v0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Set Bugly DB name: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 83
    sput-object p0, Lcom/tencent/bugly/proguard/f4;->B:Ljava/lang/String;

    return-void
.end method

.method public static a(Ljava/lang/String;I)V
    .locals 0

    .line 114
    invoke-static {p0, p1}, Lcom/tencent/bugly/proguard/y7;->a(Ljava/lang/String;I)V

    return-void
.end method

.method public static a(Ljava/lang/Thread;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Thread;",
            "I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 18
    sget-boolean v0, Lcom/tencent/bugly/proguard/rc;->c:Z

    if-nez v0, :cond_0

    .line 19
    sget-object p0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string p1, "Can not post crash caught because bugly is disable."

    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 20
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/proguard/l3;->b()Lcom/tencent/bugly/proguard/l3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l3;->c()Z

    move-result v0

    if-nez v0, :cond_1

    .line 21
    sget-object p0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string p1, "CrashReport has not been initialed! pls to call method \'initCrashReport\' first!"

    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 22
    invoke-static/range {v0 .. v5}, Lcom/tencent/bugly/proguard/n5;->c(Ljava/lang/Thread;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public static a(Ljava/lang/Throwable;)V
    .locals 2

    .line 24
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    const/4 v1, 0x0

    .line 25
    invoke-static {p0, v0, v1}, Lcom/tencent/bugly/proguard/r3;->a(Ljava/lang/Throwable;Ljava/lang/Thread;Z)V

    return-void
.end method

.method public static a(Ljava/lang/Throwable;Ljava/lang/Thread;)V
    .locals 1

    const/4 v0, 0x0

    .line 26
    invoke-static {p0, p1, v0}, Lcom/tencent/bugly/proguard/r3;->a(Ljava/lang/Throwable;Ljava/lang/Thread;Z)V

    return-void
.end method

.method public static a(Ljava/lang/Throwable;Ljava/lang/Thread;Z)V
    .locals 8

    .line 27
    sget-boolean v0, Lcom/tencent/bugly/proguard/rc;->c:Z

    if-nez v0, :cond_0

    .line 28
    sget-object p0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string p1, "Can not post crash caught because bugly is disable."

    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 29
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/proguard/l3;->b()Lcom/tencent/bugly/proguard/l3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l3;->c()Z

    move-result v0

    if-nez v0, :cond_1

    .line 30
    sget-object p0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string p1, "CrashReport has not been initialed! pls to call method \'initCrashReport\' first!"

    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    if-nez p0, :cond_2

    const/4 p0, 0x0

    .line 31
    new-array p0, p0, [Ljava/lang/Object;

    const-string/jumbo p1, "throwable is null, just return"

    invoke-static {p1, p0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    :cond_2
    if-nez p1, :cond_3

    .line 32
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    :cond_3
    move-object v1, p1

    .line 33
    invoke-static {}, Lcom/tencent/bugly/proguard/k3;->l()Lcom/tencent/bugly/proguard/k3;

    move-result-object v0

    const/4 v5, 0x0

    const/4 v7, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v2, p0

    move v6, p2

    invoke-virtual/range {v0 .. v7}, Lcom/tencent/bugly/proguard/k3;->a(Ljava/lang/Thread;Ljava/lang/Throwable;ZLjava/lang/String;[BZZ)V

    return-void
.end method

.method public static a(Ljava/net/InetAddress;I)V
    .locals 0

    .line 115
    invoke-static {p0, p1}, Lcom/tencent/bugly/proguard/y7;->a(Ljava/net/InetAddress;I)V

    return-void
.end method

.method public static a(Z)V
    .locals 0

    .line 1
    sput-boolean p0, Lcom/tencent/bugly/proguard/rc;->c:Z

    return-void
.end method

.method public static a(ZZZ)V
    .locals 2

    .line 12
    sget-boolean v0, Lcom/tencent/bugly/proguard/rc;->c:Z

    if-nez v0, :cond_0

    .line 13
    sget-object p0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string p1, "Can not test native crash because bugly is disable."

    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 14
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/proguard/l3;->b()Lcom/tencent/bugly/proguard/l3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l3;->c()Z

    move-result v0

    if-nez v0, :cond_1

    .line 15
    sget-object p0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string p1, "CrashReport has not been initialed! pls to call method \'initCrashReport\' first!"

    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    const/4 v0, 0x0

    .line 16
    new-array v0, v0, [Ljava/lang/Object;

    const-string/jumbo v1, "start to create a native crash for test!"

    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 17
    invoke-static {}, Lcom/tencent/bugly/proguard/k3;->l()Lcom/tencent/bugly/proguard/k3;

    move-result-object v0

    invoke-virtual {v0, p0, p1, p2}, Lcom/tencent/bugly/proguard/k3;->a(ZZZ)V

    return-void
.end method

.method public static a(Landroid/webkit/WebView;Z)Z
    .locals 1

    const/4 v0, 0x0

    .line 85
    invoke-static {p0, p1, v0}, Lcom/tencent/bugly/proguard/r3;->a(Landroid/webkit/WebView;ZZ)Z

    move-result p0

    return p0
.end method

.method public static a(Landroid/webkit/WebView;ZZ)Z
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SetJavaScriptEnabled"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p0, :cond_0

    .line 86
    sget-object p0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string p1, "WebView is null."

    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return v0

    .line 87
    :cond_0
    invoke-virtual {p0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/webkit/WebSettings;->setSavePassword(Z)V

    .line 88
    invoke-virtual {p0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    .line 89
    new-instance v0, Lcom/tencent/bugly/proguard/r3$a;

    invoke-direct {v0, p0}, Lcom/tencent/bugly/proguard/r3$a;-><init>(Landroid/webkit/WebView;)V

    .line 90
    invoke-static {v0, p1, p2}, Lcom/tencent/bugly/proguard/r3;->a(Lcom/tencent/bugly/proguard/r3$d;ZZ)Z

    move-result p0

    return p0
.end method

.method public static a(Lcom/tencent/bugly/proguard/r3$d;Z)Z
    .locals 1

    const/4 v0, 0x0

    .line 91
    invoke-static {p0, p1, v0}, Lcom/tencent/bugly/proguard/r3;->a(Lcom/tencent/bugly/proguard/r3$d;ZZ)Z

    move-result p0

    return p0
.end method

.method public static a(Lcom/tencent/bugly/proguard/r3$d;ZZ)Z
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SetJavaScriptEnabled"
        }
    .end annotation

    const/4 p2, 0x0

    if-nez p0, :cond_0

    .line 92
    sget-object p0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string p1, "WebViewInterface is null."

    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return p2

    .line 93
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/proguard/l3;->b()Lcom/tencent/bugly/proguard/l3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l3;->c()Z

    move-result v0

    if-nez v0, :cond_1

    .line 94
    new-array p0, p2, [Ljava/lang/Object;

    const-string p1, "CrashReport has not been initialed! please to call method \'initCrashReport\' first!"

    invoke-static {p1, p0}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    return p2

    .line 95
    :cond_1
    new-array v0, p2, [Ljava/lang/Object;

    const-string v1, "Set Javascript exception monitor of webview."

    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 96
    sget-boolean v0, Lcom/tencent/bugly/proguard/rc;->c:Z

    if-nez v0, :cond_2

    .line 97
    sget-object p0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string p1, "Can not set JavaScript monitor because bugly is disable."

    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return p2

    .line 98
    :cond_2
    invoke-interface {p0}, Lcom/tencent/bugly/proguard/r3$d;->b()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    .line 99
    sget-object v1, Lcom/tencent/rmonitor/common/logger/LogState;->DEBUG:Lcom/tencent/rmonitor/common/logger/LogState;

    const-string v2, "URL of webview is %s"

    invoke-static {v1, v2, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 100
    new-array v0, p2, [Ljava/lang/Object;

    .line 101
    sget-object v1, Lcom/tencent/rmonitor/common/logger/LogState;->INFO:Lcom/tencent/rmonitor/common/logger/LogState;

    const-string v2, "Enable the javascript needed by webview monitor."

    invoke-static {v1, v2, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    const/4 v0, 0x1

    .line 102
    invoke-interface {p0, v0}, Lcom/tencent/bugly/proguard/r3$d;->a(Z)V

    .line 103
    invoke-static {p0}, Lcom/tencent/bugly/proguard/p7;->a(Lcom/tencent/bugly/proguard/r3$d;)Lcom/tencent/bugly/proguard/p7;

    move-result-object v2

    if-eqz v2, :cond_3

    .line 104
    const-string v3, "Add a secure javascript interface to the webview."

    new-array v4, p2, [Ljava/lang/Object;

    .line 105
    invoke-static {v1, v3, v4}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 106
    const-string v3, "exceptionUploader"

    invoke-interface {p0, v2, v3}, Lcom/tencent/bugly/proguard/r3$d;->a(Lcom/tencent/bugly/proguard/p7;Ljava/lang/String;)V

    :cond_3
    if-eqz p1, :cond_5

    .line 107
    invoke-static {}, Lcom/tencent/bugly/proguard/ga;->c()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    .line 108
    const-string v2, "Inject bugly.js(v%s) to the webview."

    invoke-static {v1, v2, p1}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 109
    invoke-static {}, Lcom/tencent/bugly/proguard/ga;->b()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_4

    .line 110
    sget-object p0, Lcom/tencent/bugly/proguard/ga;->a:Ljava/lang/String;

    .line 111
    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    .line 112
    sget-object p1, Lcom/tencent/rmonitor/common/logger/LogState;->ERROR:Lcom/tencent/rmonitor/common/logger/LogState;

    const-string v0, "Failed to inject Bugly.js."

    invoke-static {p1, v0, p0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    return p2

    .line 113
    :cond_4
    const-string p2, "javascript:"

    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/tencent/bugly/proguard/r3$d;->a(Ljava/lang/String;)V

    :cond_5
    return v0
.end method

.method public static b(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    .line 1
    new-array p0, p0, [Ljava/lang/Object;

    const-string v0, "Please call with context."

    invoke-static {v0, p0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 2
    const-string/jumbo p0, "unknown"

    return-object p0

    .line 3
    :cond_0
    invoke-static {p0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object p0

    .line 4
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/l2;->z()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 36
    sget-boolean v0, Lcom/tencent/bugly/proguard/rc;->c:Z

    const-string/jumbo v1, "unknown"

    if-nez v0, :cond_0

    .line 37
    sget-object p0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string p1, "Can not remove user data because bugly is disable."

    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-object v1

    :cond_0
    if-nez p0, :cond_1

    .line 38
    sget-object p0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string/jumbo p1, "removeUserData args context should not be null"

    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-object v1

    .line 39
    :cond_1
    invoke-static {p1}, Lcom/tencent/bugly/proguard/bi;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 p0, 0x0

    return-object p0

    .line 40
    :cond_2
    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "[param] remove user data: %s"

    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->e(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 41
    invoke-static {p0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/l2;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static b()V
    .locals 2

    .line 5
    sget-boolean v0, Lcom/tencent/bugly/proguard/rc;->c:Z

    if-nez v0, :cond_0

    .line 6
    sget-object v0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string v1, "Can not close crash report because bugly is disable."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 7
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/proguard/l3;->b()Lcom/tencent/bugly/proguard/l3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l3;->c()Z

    move-result v0

    if-nez v0, :cond_1

    .line 8
    sget-object v0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string v1, "CrashReport has not been initialed! pls to call method \'initCrashReport\' first!"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 9
    :cond_1
    invoke-static {}, Lcom/tencent/bugly/proguard/k3;->l()Lcom/tencent/bugly/proguard/k3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/k3;->c()V

    return-void
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 10
    sget-boolean v0, Lcom/tencent/bugly/proguard/rc;->c:Z

    if-nez v0, :cond_0

    .line 11
    sget-object p0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string p1, "Can not put user data because bugly is disable."

    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    if-nez p0, :cond_1

    .line 12
    sget-object p0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string/jumbo p1, "putUserData args context should not be null"

    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    const/4 v0, 0x0

    if-nez p1, :cond_2

    .line 13
    new-array p0, v0, [Ljava/lang/Object;

    const-string/jumbo p1, "putUserData args key should not be null or empty"

    invoke-static {p1, p0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    :cond_2
    if-nez p2, :cond_3

    .line 14
    new-array p0, v0, [Ljava/lang/Object;

    const-string/jumbo p1, "putUserData args value should not be null"

    invoke-static {p1, p0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    .line 15
    :cond_3
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0xc8

    if-le v1, v2, :cond_4

    .line 16
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    .line 17
    const-string/jumbo v3, "user data value length over limit %d, it will be cutted!"

    invoke-static {v3, v1}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 18
    invoke-virtual {p2, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p2

    .line 19
    :cond_4
    invoke-static {p0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object v1

    .line 20
    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/l2;->b()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 21
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 22
    invoke-virtual {v0, p1, p2}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->putKeyValueToNative(Ljava/lang/String;Ljava/lang/String;)Z

    .line 23
    :cond_5
    invoke-static {p0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object p0

    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/l2;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object p0

    const-string/jumbo p1, "replace KV %s %s"

    invoke-static {p1, p0}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    .line 25
    :cond_6
    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/l2;->G()I

    move-result v1

    const/16 v2, 0x32

    if-lt v1, v2, :cond_7

    .line 26
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    .line 27
    const-string/jumbo p1, "user data size is over limit %d, it will be cutted!"

    invoke-static {p1, p0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    .line 28
    :cond_7
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-le v1, v2, :cond_8

    .line 29
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v1, p1}, [Ljava/lang/Object;

    move-result-object v1

    .line 30
    const-string/jumbo v3, "user data key length over limit %d , will drop this new key %s"

    invoke-static {v3, v1}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 31
    invoke-virtual {p1, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    .line 32
    :cond_8
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    move-result-object v0

    if-eqz v0, :cond_9

    .line 33
    invoke-virtual {v0, p1, p2}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->putKeyValueToNative(Ljava/lang/String;Ljava/lang/String;)Z

    .line 34
    :cond_9
    invoke-static {p0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object p0

    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/l2;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object p0

    const-string p1, "[param] set user data: %s - %s"

    invoke-static {p1, p0}, Lcom/tencent/bugly/proguard/x4;->e(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void
.end method

.method public static b(Landroid/content/Context;Z)V
    .locals 3

    .line 51
    sget-boolean v0, Lcom/tencent/bugly/proguard/rc;->c:Z

    if-nez v0, :cond_0

    .line 52
    sget-object p0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string p1, "Can not set collect privacy info enable because bugly is disable."

    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    if-nez p0, :cond_1

    .line 53
    sget-object p0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string/jumbo p1, "setCollectPrivacyInfo args context should not be null"

    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 54
    :cond_1
    sget-object v0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "setCollectPrivacyInfo: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 55
    invoke-static {p0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/l2;->b(Z)V

    return-void
.end method

.method public static b(Ljava/lang/String;)V
    .locals 3

    .line 47
    sget-boolean v0, Lcom/tencent/bugly/proguard/rc;->c:Z

    if-nez v0, :cond_0

    .line 48
    sget-object p0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string v0, "Can not set App package because bugly is disable."

    invoke-static {p0, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 49
    :cond_0
    sget-object v0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Set crash stack filter: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 50
    sput-object p0, Lcom/tencent/bugly/proguard/k3;->P:Ljava/lang/String;

    return-void
.end method

.method public static b(Z)Z
    .locals 4

    .line 42
    sget-boolean v0, Lcom/tencent/bugly/proguard/rc;->c:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 43
    new-array p0, v1, [Ljava/lang/Object;

    const-string v0, "Can not enableNativeSubProcess because bugly is disable."

    invoke-static {v0, p0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    return v1

    .line 44
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 45
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "enableNativeSubProcess: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v2, v1}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 46
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->setNativeEnableSubProcess(Ljava/lang/Boolean;)Z

    move-result p0

    return p0

    :cond_1
    return v1
.end method

.method public static c(Landroid/content/Context;)Ljava/lang/String;
    .locals 0

    .line 6
    invoke-static {p0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object p0

    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/l2;->n()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static c()V
    .locals 2

    .line 1
    sget-boolean v0, Lcom/tencent/bugly/proguard/rc;->c:Z

    if-nez v0, :cond_0

    .line 2
    sget-object v0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string v1, "Can not close native report because bugly is disable."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 3
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/proguard/l3;->b()Lcom/tencent/bugly/proguard/l3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l3;->c()Z

    move-result v0

    if-nez v0, :cond_1

    .line 4
    sget-object v0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string v1, "CrashReport has not been initialed! pls to call method \'initCrashReport\' first!"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 5
    :cond_1
    invoke-static {}, Lcom/tencent/bugly/proguard/k3;->l()Lcom/tencent/bugly/proguard/k3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/k3;->f()V

    return-void
.end method

.method public static c(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 17
    sget-boolean v0, Lcom/tencent/bugly/proguard/rc;->c:Z

    if-nez v0, :cond_0

    .line 18
    sget-object p0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string p1, "Can not set App channel because Bugly is disable."

    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    if-nez p0, :cond_1

    .line 19
    sget-object p0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string/jumbo p1, "setAppChannel args context should not be null"

    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    if-nez p1, :cond_2

    .line 20
    sget-object p0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string p1, "App channel is null, will not set"

    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 21
    :cond_2
    invoke-static {p0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/l2;->d(Ljava/lang/String;)V

    .line 22
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    move-result-object p0

    if-eqz p0, :cond_3

    .line 23
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->setNativeAppChannel(Ljava/lang/String;)Z

    :cond_3
    return-void
.end method

.method public static c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 7
    sget-boolean v0, Lcom/tencent/bugly/proguard/rc;->c:Z

    if-nez v0, :cond_0

    .line 8
    sget-object p0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string p1, "Can not put SDK extra data because bugly is disable."

    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    if-eqz p0, :cond_2

    .line 9
    invoke-static {p1}, Lcom/tencent/bugly/proguard/bi;->c(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {p2}, Lcom/tencent/bugly/proguard/bi;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 10
    :cond_1
    invoke-static {p0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object p0

    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/l2;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public static c(Landroid/content/Context;Z)V
    .locals 2

    .line 11
    sget-boolean v0, Lcom/tencent/bugly/proguard/rc;->c:Z

    if-nez v0, :cond_0

    .line 12
    sget-object p0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string p1, "Can not set \'isDevelopmentDevice\' because bugly is disable."

    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    const/4 v0, 0x0

    if-nez p0, :cond_1

    .line 13
    new-array p0, v0, [Ljava/lang/Object;

    const-string p1, "Context should not be null."

    invoke-static {p1, p0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    :cond_1
    if-eqz p1, :cond_2

    .line 14
    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "This is a development device."

    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    goto :goto_0

    .line 15
    :cond_2
    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "This is not a development device."

    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 16
    :goto_0
    invoke-static {p0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object p0

    iput-boolean p1, p0, Lcom/tencent/bugly/proguard/l2;->h0:Z

    return-void
.end method

.method public static c(Ljava/lang/String;)V
    .locals 3

    .line 24
    sget-boolean v0, Lcom/tencent/bugly/proguard/rc;->c:Z

    if-nez v0, :cond_0

    .line 25
    sget-object p0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string v0, "Can not set App package because bugly is disable."

    invoke-static {p0, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 26
    :cond_0
    sget-object v0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Set crash stack filter: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    sput-object p0, Lcom/tencent/bugly/proguard/k3;->Q:Ljava/lang/String;

    return-void
.end method

.method public static c(Z)V
    .locals 3

    .line 28
    sget-boolean v0, Lcom/tencent/bugly/proguard/rc;->c:Z

    if-nez v0, :cond_0

    .line 29
    sget-object p0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string v0, "Can not set App package because bugly is disable."

    invoke-static {p0, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 30
    :cond_0
    sget-object v0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Should handle native crash in Java profile after handled in native profile: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 31
    invoke-static {p0}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->setShouldHandleInJava(Z)V

    return-void
.end method

.method public static d()Ljava/lang/String;
    .locals 3

    .line 1
    sget-boolean v0, Lcom/tencent/bugly/proguard/rc;->c:Z

    const-string/jumbo v1, "unknown"

    if-nez v0, :cond_0

    .line 2
    sget-object v0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string v2, "Can not get App channel because bugly is disable."

    invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-object v1

    .line 3
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/proguard/l3;->b()Lcom/tencent/bugly/proguard/l3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l3;->c()Z

    move-result v0

    if-nez v0, :cond_1

    .line 4
    sget-object v0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string v2, "CrashReport has not been initialed! pls to call method \'initCrashReport\' first!"

    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-object v1

    .line 5
    :cond_1
    sget-object v0, Lcom/tencent/bugly/proguard/r3;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l2;->d()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static d(Landroid/content/Context;)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 6
    sget-boolean v0, Lcom/tencent/bugly/proguard/rc;->c:Z

    if-nez v0, :cond_0

    .line 7
    sget-object p0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string v0, "Can not get SDK extra data because bugly is disable."

    invoke-static {p0, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 8
    new-instance p0, Ljava/util/HashMap;

    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    return-object p0

    :cond_0
    if-nez p0, :cond_1

    const/4 p0, 0x0

    .line 9
    new-array p0, p0, [Ljava/lang/Object;

    const-string v0, "Context should not be null."

    invoke-static {v0, p0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    const/4 p0, 0x0

    return-object p0

    .line 10
    :cond_1
    invoke-static {p0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object p0

    iget-object p0, p0, Lcom/tencent/bugly/proguard/l2;->j0:Ljava/util/HashMap;

    return-object p0
.end method

.method public static d(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 11
    sget-boolean v0, Lcom/tencent/bugly/proguard/rc;->c:Z

    if-nez v0, :cond_0

    .line 12
    sget-object p0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string p1, "Can not set App package because bugly is disable."

    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    if-nez p0, :cond_1

    .line 13
    sget-object p0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string/jumbo p1, "setAppPackage args context should not be null"

    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    if-nez p1, :cond_2

    .line 14
    sget-object p0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string p1, "App package is null, will not set"

    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 15
    :cond_2
    invoke-static {p0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object p0

    iput-object p1, p0, Lcom/tencent/bugly/proguard/l2;->e:Ljava/lang/String;

    .line 16
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    move-result-object p0

    if-eqz p0, :cond_3

    .line 17
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->setNativeAppPackage(Ljava/lang/String;)Z

    :cond_3
    return-void
.end method

.method public static d(Ljava/lang/String;)V
    .locals 1

    .line 18
    invoke-static {p0}, Lcom/tencent/bugly/proguard/bi;->c(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p0}, Lcom/tencent/bugly/proguard/bi;->e(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 19
    :cond_0
    invoke-static {p0}, Lcom/tencent/bugly/proguard/pg;->a(Ljava/lang/String;)V

    .line 20
    sput-object p0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->w:Ljava/lang/String;

    .line 21
    sput-object p0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->x:Ljava/lang/String;

    return-void

    .line 22
    :cond_1
    :goto_0
    sget-object p0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string v0, "URL is invalid."

    invoke-static {p0, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public static e(Landroid/content/Context;)I
    .locals 2

    .line 1
    sget-boolean v0, Lcom/tencent/bugly/proguard/rc;->c:Z

    const/4 v1, -0x1

    if-nez v0, :cond_0

    .line 2
    sget-object p0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string v0, "Can not get size of user data because bugly is disable."

    invoke-static {p0, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return v1

    :cond_0
    if-nez p0, :cond_1

    .line 3
    sget-object p0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string v0, "getUserDatasSize args context should not be null"

    invoke-static {p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return v1

    .line 4
    :cond_1
    invoke-static {p0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object p0

    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/l2;->G()I

    move-result p0

    return p0
.end method

.method public static e()Ljava/lang/String;
    .locals 3

    .line 5
    sget-boolean v0, Lcom/tencent/bugly/proguard/rc;->c:Z

    const-string/jumbo v1, "unknown"

    if-nez v0, :cond_0

    .line 6
    sget-object v0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string v2, "Can not get App ID because bugly is disable."

    invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-object v1

    .line 7
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/proguard/l3;->b()Lcom/tencent/bugly/proguard/l3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l3;->c()Z

    move-result v0

    if-nez v0, :cond_1

    .line 8
    sget-object v0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string v2, "CrashReport has not been initialed! pls to call method \'initCrashReport\' first!"

    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-object v1

    .line 9
    :cond_1
    sget-object v0, Lcom/tencent/bugly/proguard/r3;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l2;->e()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static e(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 15
    sget-boolean v0, Lcom/tencent/bugly/proguard/rc;->c:Z

    if-nez v0, :cond_0

    .line 16
    sget-object p0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string p1, "Can not set App version because bugly is disable."

    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    if-nez p0, :cond_1

    .line 17
    sget-object p0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string/jumbo p1, "setAppVersion args context should not be null"

    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    if-nez p1, :cond_2

    .line 18
    sget-object p0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string p1, "App version is null, will not set"

    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 19
    :cond_2
    invoke-static {p0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object p0

    iput-object p1, p0, Lcom/tencent/bugly/proguard/l2;->F:Ljava/lang/String;

    .line 20
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    move-result-object p0

    if-eqz p0, :cond_3

    .line 21
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->setNativeAppVersion(Ljava/lang/String;)Z

    :cond_3
    return-void
.end method

.method public static e(Ljava/lang/String;)V
    .locals 1

    .line 10
    sget-boolean v0, Lcom/tencent/bugly/proguard/rc;->c:Z

    if-nez v0, :cond_0

    .line 11
    sget-object p0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string v0, "Can not set user ID because bugly is disable."

    invoke-static {p0, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 12
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/proguard/l3;->b()Lcom/tencent/bugly/proguard/l3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l3;->c()Z

    move-result v0

    if-nez v0, :cond_1

    .line 13
    sget-object p0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string v0, "CrashReport has not been initialed! pls to call method \'initCrashReport\' first!"

    invoke-static {p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 14
    :cond_1
    sget-object v0, Lcom/tencent/bugly/proguard/r3;->a:Landroid/content/Context;

    invoke-static {v0, p0}, Lcom/tencent/bugly/proguard/r3;->i(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public static f(Landroid/content/Context;)I
    .locals 2

    .line 1
    sget-boolean v0, Lcom/tencent/bugly/proguard/rc;->c:Z

    const/4 v1, -0x1

    if-nez v0, :cond_0

    .line 2
    sget-object p0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string v0, "Can not get user scene tag because bugly is disable."

    invoke-static {p0, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return v1

    :cond_0
    if-nez p0, :cond_1

    .line 3
    sget-object p0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string v0, "getUserSceneTagId args context should not be null"

    invoke-static {p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return v1

    .line 4
    :cond_1
    invoke-static {p0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object p0

    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/l2;->H()I

    move-result p0

    return p0
.end method

.method public static f()Ljava/lang/String;
    .locals 3

    .line 9
    sget-boolean v0, Lcom/tencent/bugly/proguard/rc;->c:Z

    const-string/jumbo v1, "unknown"

    if-nez v0, :cond_0

    .line 10
    sget-object v0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string v2, "Can not get app version because bugly is disable."

    invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-object v1

    .line 11
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/proguard/l3;->b()Lcom/tencent/bugly/proguard/l3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l3;->c()Z

    move-result v0

    if-nez v0, :cond_1

    .line 12
    sget-object v0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string v2, "CrashReport has not been initialed! pls to call method \'initCrashReport\' first!"

    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-object v1

    .line 13
    :cond_1
    sget-object v0, Lcom/tencent/bugly/proguard/r3;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object v0

    iget-object v0, v0, Lcom/tencent/bugly/proguard/l2;->F:Ljava/lang/String;

    return-object v0
.end method

.method public static f(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    if-eqz p0, :cond_0

    .line 5
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 6
    invoke-static {p0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/l2;->i(Ljava/lang/String;)V

    .line 7
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 8
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->setNativeDeviceId(Ljava/lang/String;)Z

    :cond_0
    return-void
.end method

.method public static g()Landroid/content/Context;
    .locals 1

    .line 6
    sget-object v0, Lcom/tencent/bugly/proguard/r3;->a:Landroid/content/Context;

    return-object v0
.end method

.method public static g(Landroid/content/Context;)V
    .locals 4

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    if-nez p0, :cond_0

    return-void

    .line 2
    :cond_0
    sput-object p0, Lcom/tencent/bugly/proguard/r3;->a:Landroid/content/Context;

    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/l3;->b()Lcom/tencent/bugly/proguard/l3;

    move-result-object v2

    invoke-static {v2}, Lcom/tencent/bugly/proguard/rc;->a(Lcom/tencent/bugly/proguard/c1;)V

    .line 4
    const-class v2, Lcom/tencent/bugly/proguard/rc;

    monitor-enter v2

    const/4 v3, 0x0

    .line 5
    :try_start_0
    invoke-static {p0, v3, v0, v1}, Lcom/tencent/bugly/proguard/rc;->a(Landroid/content/Context;Lcom/tencent/bugly/proguard/b2;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v2

    throw p0
.end method

.method public static g(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    if-eqz p0, :cond_0

    .line 7
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 8
    invoke-static {p0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/l2;->j(Ljava/lang/String;)V

    .line 9
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 10
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->setNativeDeviceModel(Ljava/lang/String;)Z

    :cond_0
    return-void
.end method

.method public static h()Ljava/net/Proxy;
    .locals 1

    .line 1
    sget-object v0, Lcom/tencent/bugly/proguard/y7;->a:Ljava/net/Proxy;

    return-object v0
.end method

.method public static h(Landroid/content/Context;)V
    .locals 0

    .line 2
    sput-object p0, Lcom/tencent/bugly/proguard/r3;->a:Landroid/content/Context;

    return-void
.end method

.method public static h(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 3
    sget-boolean v0, Lcom/tencent/bugly/proguard/rc;->c:Z

    if-nez v0, :cond_0

    .line 4
    sget-object p0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string p1, "Can not set App version because bugly is disable."

    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    if-nez p0, :cond_1

    .line 5
    sget-object p0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string/jumbo p1, "setTombPath args context should not be null"

    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    if-nez p1, :cond_2

    .line 6
    sget-object p0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string/jumbo p1, "tombstone path is null, will not set"

    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 7
    :cond_2
    sget-object p0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string/jumbo v0, "user set tombstone path: "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 8
    invoke-static {p1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->setDumpFilePath(Ljava/lang/String;)V

    return-void
.end method

.method public static i()Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 17
    sget-boolean v0, Lcom/tencent/bugly/proguard/rc;->c:Z

    if-nez v0, :cond_0

    .line 18
    sget-object v0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string v1, "Can not get SDK extra data because bugly is disable."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 19
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    return-object v0

    .line 20
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/proguard/l3;->b()Lcom/tencent/bugly/proguard/l3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l3;->c()Z

    move-result v0

    if-nez v0, :cond_1

    .line 21
    sget-object v0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string v1, "CrashReport has not been initialed! pls to call method \'initCrashReport\' first!"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    return-object v0

    .line 22
    :cond_1
    sget-object v0, Lcom/tencent/bugly/proguard/r3;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object v0

    iget-object v0, v0, Lcom/tencent/bugly/proguard/l2;->j0:Ljava/util/HashMap;

    return-object v0
.end method

.method public static i(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    .line 1
    sget-boolean v0, Lcom/tencent/bugly/proguard/rc;->c:Z

    if-nez v0, :cond_0

    .line 2
    sget-object p0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string p1, "Can not set user ID because bugly is disable."

    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    if-nez p0, :cond_1

    .line 3
    sget-object p0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    const-string p1, "Context should not be null when bugly has not been initialed!"

    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 4
    :cond_1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 5
    new-array p0, v1, [Ljava/lang/Object;

    const-string/jumbo p1, "userId should not be null"

    invoke-static {p1, p0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    .line 6
    :cond_2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v2, 0x64

    if-le v0, v2, :cond_3

    .line 7
    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 8
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {p1, v1, v0}, [Ljava/lang/Object;

    move-result-object p1

    .line 9
    const-string/jumbo v1, "userId %s length is over limit %d substring to %s"

    invoke-static {v1, p1}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    move-object p1, v0

    .line 10
    :cond_3
    invoke-static {p0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l2;->F()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_0

    .line 11
    :cond_4
    invoke-static {p0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/l2;->n(Ljava/lang/String;)V

    .line 12
    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p0

    const-string v0, "[user] set userId : %s"

    invoke-static {v0, p0}, Lcom/tencent/bugly/proguard/x4;->e(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 13
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    move-result-object p0

    if-eqz p0, :cond_5

    .line 14
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->setNativeUserId(Ljava/lang/String;)Z

    .line 15
    :cond_5
    invoke-static {}, Lcom/tencent/bugly/proguard/l3;->b()Lcom/tencent/bugly/proguard/l3;

    move-result-object p0

    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/l3;->c()Z

    move-result p0

    if-eqz p0, :cond_6

    .line 16
    invoke-static {}, Lcom/tencent/bugly/proguard/sa;->p()V

    :cond_6
    :goto_0
    return-void
.end method

.method public static j()Ljava/lang/String;
    .locals 3

    .line 1
    .line 2
    sget-boolean v0, Lcom/tencent/bugly/proguard/rc;->c:Z

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "unknown"

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    .line 10
    .line 11
    const-string v2, "Can not get user ID because bugly is disable."

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 15
    return-object v1

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/proguard/l3;->b()Lcom/tencent/bugly/proguard/l3;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l3;->c()Z

    .line 23
    move-result v0

    .line 24
    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    sget-object v0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    .line 28
    .line 29
    const-string v2, "CrashReport has not been initialed! pls to call method \'initCrashReport\' first!"

    .line 30
    .line 31
    .line 32
    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 33
    return-object v1

    .line 34
    .line 35
    :cond_1
    sget-object v0, Lcom/tencent/bugly/proguard/r3;->a:Landroid/content/Context;

    .line 36
    .line 37
    .line 38
    invoke-static {v0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    .line 39
    move-result-object v0

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l2;->F()Ljava/lang/String;

    .line 43
    move-result-object v0

    .line 44
    return-object v0
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

.method public static k()Z
    .locals 3

    .line 1
    .line 2
    sget-boolean v0, Lcom/tencent/bugly/proguard/rc;->c:Z

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    .line 8
    .line 9
    const-string v2, "The info \'isLastSessionCrash\' is not accurate because bugly is disable."

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 13
    return v1

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/proguard/l3;->b()Lcom/tencent/bugly/proguard/l3;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l3;->c()Z

    .line 21
    move-result v0

    .line 22
    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    sget-object v0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    .line 26
    .line 27
    const-string v2, "CrashReport has not been initialed! pls to call method \'initCrashReport\' first!"

    .line 28
    .line 29
    .line 30
    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 31
    return v1

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-static {}, Lcom/tencent/bugly/proguard/k3;->l()Lcom/tencent/bugly/proguard/k3;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/k3;->o()Z

    .line 39
    move-result v0

    .line 40
    return v0
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

.method public static l()V
    .locals 2

    .line 1
    .line 2
    sget-boolean v0, Lcom/tencent/bugly/proguard/rc;->c:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    sget-object v0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    .line 7
    .line 8
    const-string v1, "Can not start crash report because bugly is disable."

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    return-void

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/proguard/l3;->b()Lcom/tencent/bugly/proguard/l3;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l3;->c()Z

    .line 20
    move-result v0

    .line 21
    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    sget-object v0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    .line 25
    .line 26
    const-string v1, "CrashReport has not been initialed! pls to call method \'initCrashReport\' first!"

    .line 27
    .line 28
    .line 29
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 30
    return-void

    .line 31
    .line 32
    .line 33
    :cond_1
    invoke-static {}, Lcom/tencent/bugly/proguard/k3;->l()Lcom/tencent/bugly/proguard/k3;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/k3;->w()V

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
.end method

.method public static m()V
    .locals 2

    .line 1
    .line 2
    sget-boolean v0, Lcom/tencent/bugly/proguard/rc;->c:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    sget-object v0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    .line 7
    .line 8
    const-string v1, "Can not test ANR crash because bugly is disable."

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    return-void

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/proguard/l3;->b()Lcom/tencent/bugly/proguard/l3;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l3;->c()Z

    .line 20
    move-result v0

    .line 21
    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    sget-object v0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    .line 25
    .line 26
    const-string v1, "CrashReport has not been initialed! pls to call method \'initCrashReport\' first!"

    .line 27
    .line 28
    .line 29
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 30
    return-void

    .line 31
    :cond_1
    const/4 v0, 0x0

    .line 32
    .line 33
    new-array v0, v0, [Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    const-string/jumbo v1, "start to create a anr crash for test!"

    .line 37
    .line 38
    .line 39
    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    invoke-static {}, Lcom/tencent/bugly/proguard/k3;->l()Lcom/tencent/bugly/proguard/k3;

    .line 43
    move-result-object v0

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/k3;->C()V

    .line 47
    return-void
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

.method public static n()V
    .locals 2

    .line 1
    .line 2
    sget-boolean v0, Lcom/tencent/bugly/proguard/rc;->c:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    sget-object v0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    .line 7
    .line 8
    const-string v1, "Can not test Java crash because bugly is disable."

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    return-void

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/proguard/l3;->b()Lcom/tencent/bugly/proguard/l3;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l3;->c()Z

    .line 20
    move-result v0

    .line 21
    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    sget-object v0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    .line 25
    .line 26
    const-string v1, "CrashReport has not been initialed! pls to call method \'initCrashReport\' first!"

    .line 27
    .line 28
    .line 29
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 30
    return-void

    .line 31
    .line 32
    .line 33
    :cond_1
    invoke-static {}, Lcom/tencent/bugly/proguard/l2;->s()Lcom/tencent/bugly/proguard/l2;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    const/16 v1, 0x5e20

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/l2;->a(I)V

    .line 42
    .line 43
    :cond_2
    new-instance v0, Ljava/lang/RuntimeException;

    .line 44
    .line 45
    const-string v1, "This Crash create for Test! You can go to Bugly see more detail!"

    .line 46
    .line 47
    .line 48
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 49
    throw v0
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
.end method

.method public static o()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v0, v1}, Lcom/tencent/bugly/proguard/r3;->a(ZZZ)V

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
.end method

.method public static p()V
    .locals 2

    .line 1
    .line 2
    sget-boolean v0, Lcom/tencent/bugly/proguard/rc;->c:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    sget-object v0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    .line 7
    .line 8
    const-string v1, "Can not upload user info because bugly is disable."

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    return-void

    .line 13
    .line 14
    :cond_0
    sget-object v0, Lcom/tencent/bugly/proguard/sa;->p:Lcom/tencent/bugly/proguard/v1;

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    sget-object v0, Lcom/tencent/bugly/proguard/x4;->a:Ljava/lang/String;

    .line 19
    .line 20
    const-string v1, "Can not upload user info because bugly is not init."

    .line 21
    .line 22
    .line 23
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 24
    return-void

    .line 25
    :cond_1
    const/4 v1, 0x0

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/v1;->c(Z)V

    .line 29
    return-void
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
