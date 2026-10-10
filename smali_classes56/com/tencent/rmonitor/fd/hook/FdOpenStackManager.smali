.class public Lcom/tencent/rmonitor/fd/hook/FdOpenStackManager;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static a:Z

.field public static b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:[Ljava/lang/String;

.field public static d:Lcom/tencent/bugly/proguard/a9;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/rmonitor/fd/hook/FdOpenStackManager$a;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/tencent/rmonitor/fd/hook/FdOpenStackManager$a;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/tencent/rmonitor/fd/hook/FdOpenStackManager;->b:Ljava/util/List;

    .line 8
    .line 9
    const-string v0, ".*\\.so$"

    .line 10
    .line 11
    .line 12
    filled-new-array {v0}, [Ljava/lang/String;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    sput-object v0, Lcom/tencent/rmonitor/fd/hook/FdOpenStackManager;->c:[Ljava/lang/String;

    .line 16
    .line 17
    const-string v0, "rmonitor_memory"

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Lcom/tencent/rmonitor/common/util/FileUtil;->loadLibrary(Ljava/lang/String;)Z

    .line 21
    move-result v0

    .line 22
    .line 23
    sput-boolean v0, Lcom/tencent/rmonitor/fd/hook/FdOpenStackManager;->a:Z

    .line 24
    .line 25
    new-instance v0, Lcom/tencent/rmonitor/fd/hook/FdOpenStackManager$b;

    .line 26
    .line 27
    .line 28
    invoke-direct {v0}, Lcom/tencent/rmonitor/fd/hook/FdOpenStackManager$b;-><init>()V

    .line 29
    .line 30
    sput-object v0, Lcom/tencent/rmonitor/fd/hook/FdOpenStackManager;->d:Lcom/tencent/bugly/proguard/a9;

    .line 31
    return-void
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
.end method

.method public static a(Z)V
    .locals 1

    .line 10
    sget-boolean v0, Lcom/tencent/rmonitor/fd/hook/FdOpenStackManager;->a:Z

    if-eqz v0, :cond_0

    .line 11
    invoke-static {p0}, Lcom/tencent/rmonitor/fd/hook/FdOpenStackManager;->nSetFdOpenHookValue(Z)V

    :cond_0
    return-void
.end method

.method public static a()Z
    .locals 4

    .line 1
    sget-boolean v0, Lcom/tencent/rmonitor/fd/hook/FdOpenStackManager;->a:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    .line 2
    sget-object v0, Lcom/tencent/rmonitor/fd/hook/FdOpenStackManager;->c:[Ljava/lang/String;

    array-length v2, v0

    :goto_0
    if-ge v1, v2, :cond_0

    aget-object v3, v0, v1

    .line 3
    invoke-static {v3}, Lcom/tencent/rmonitor/fd/hook/FdOpenStackManager;->nSetRegisterHookSo(Ljava/lang/String;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 4
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/common/utils/AndroidVersion;->isOverR()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 5
    sget-object v0, Lcom/tencent/rmonitor/fd/hook/FdOpenStackManager;->b:Ljava/util/List;

    const-string v1, ".*/libmonochrome.so$"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 6
    :cond_1
    sget-object v0, Lcom/tencent/rmonitor/fd/hook/FdOpenStackManager;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 7
    invoke-static {v1}, Lcom/tencent/rmonitor/fd/hook/FdOpenStackManager;->nSetIgnoreHookSo(Ljava/lang/String;)V

    goto :goto_1

    .line 8
    :cond_2
    invoke-static {}, Lcom/tencent/bugly/proguard/g6;->i()Z

    move-result v0

    invoke-static {v0}, Lcom/tencent/rmonitor/fd/hook/FdOpenStackManager;->nStartFdOpenHook(Z)V

    .line 9
    sget-object v0, Lcom/tencent/rmonitor/fd/hook/FdOpenStackManager;->d:Lcom/tencent/bugly/proguard/a9;

    invoke-static {v0}, Lcom/tencent/bugly/common/heapdump/ForkJvmHeapDumper;->a(Lcom/tencent/bugly/proguard/a9;)V

    const/4 v0, 0x1

    return v0

    :cond_3
    return v1
.end method

.method public static a(Ljava/lang/String;)Z
    .locals 1

    .line 12
    sget-boolean v0, Lcom/tencent/rmonitor/fd/hook/FdOpenStackManager;->a:Z

    if-eqz v0, :cond_0

    .line 13
    invoke-static {p0}, Lcom/tencent/rmonitor/fd/hook/FdOpenStackManager;->nDumpFdOpenStacks(Ljava/lang/String;)Z

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static b()V
    .locals 1

    .line 1
    .line 2
    sget-boolean v0, Lcom/tencent/rmonitor/fd/hook/FdOpenStackManager;->a:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lcom/tencent/rmonitor/fd/hook/FdOpenStackManager;->nStopFdOpenHook()V

    .line 8
    :cond_0
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method private static native nDumpFdOpenStacks(Ljava/lang/String;)Z
.end method

.method private static native nSetFdOpenHookValue(Z)V
.end method

.method private static native nSetIgnoreHookSo(Ljava/lang/String;)V
.end method

.method private static native nSetRegisterHookSo(Ljava/lang/String;)V
.end method

.method private static native nStartFdOpenHook(Z)V
.end method

.method private static native nStopFdOpenHook()V
.end method
