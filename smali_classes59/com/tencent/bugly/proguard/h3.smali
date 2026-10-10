.class public Lcom/tencent/bugly/proguard/h3;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static final a:I = 0xfa000

.field public static final b:J = 0xaL


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

.method public static a(Landroid/content/Context;)V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/rmonitor/base/config/b$c;->a()Lcom/tencent/rmonitor/base/config/b;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-string v1, "crash"

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/base/config/b;->a(Ljava/lang/String;)Lcom/tencent/bugly/proguard/xe;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    instance-of v1, v0, Lcom/tencent/bugly/proguard/f3;

    .line 13
    .line 14
    if-eqz v1, :cond_2

    .line 15
    .line 16
    check-cast v0, Lcom/tencent/bugly/proguard/f3;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/f3;->e()I

    .line 20
    move-result v1

    .line 21
    .line 22
    if-lez v1, :cond_0

    .line 23
    .line 24
    .line 25
    const v2, 0xfa000

    .line 26
    .line 27
    if-ge v1, v2, :cond_0

    .line 28
    .line 29
    sput v1, Lcom/tencent/bugly/proguard/k3;->x:I

    .line 30
    .line 31
    .line 32
    :cond_0
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/f3;->d()J

    .line 33
    move-result-wide v1

    .line 34
    .line 35
    const-wide/16 v3, 0x0

    .line 36
    .line 37
    cmp-long v3, v1, v3

    .line 38
    .line 39
    if-lez v3, :cond_1

    .line 40
    .line 41
    const-wide/16 v3, 0xa

    .line 42
    .line 43
    cmp-long v3, v1, v3

    .line 44
    .line 45
    if-gez v3, :cond_1

    .line 46
    .line 47
    sput-wide v1, Lcom/tencent/bugly/proguard/k3;->K:J

    .line 48
    .line 49
    .line 50
    :cond_1
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/f3;->f()Z

    .line 51
    move-result v1

    .line 52
    .line 53
    .line 54
    invoke-static {p0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    .line 55
    move-result-object p0

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, v1}, Lcom/tencent/bugly/proguard/l2;->c(Z)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/f3;->c()Z

    .line 62
    move-result p0

    .line 63
    .line 64
    .line 65
    invoke-static {p0}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->setCustomFileUploadAble(Z)V

    .line 66
    :cond_2
    return-void
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
