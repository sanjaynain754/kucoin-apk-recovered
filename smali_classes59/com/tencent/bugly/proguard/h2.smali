.class public Lcom/tencent/bugly/proguard/h2;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static final a:I = 0x5265c00

.field public static final b:I = 0xf731400

.field public static c:I

.field public static d:Ljava/lang/StringBuilder;

.field public static e:[Ljava/lang/String;

.field public static f:[Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/tencent/bugly/proguard/h2;->d:Ljava/lang/StringBuilder;

    .line 8
    .line 9
    .line 10
    const-string/jumbo v0, "mumu"

    .line 11
    .line 12
    .line 13
    filled-new-array {v0}, [Ljava/lang/String;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    sput-object v0, Lcom/tencent/bugly/proguard/h2;->e:[Ljava/lang/String;

    .line 17
    .line 18
    const-string v0, "/sys/bus,virtio"

    .line 19
    .line 20
    const-string v1, "/sys/class/misc,vbox"

    .line 21
    .line 22
    const-string v2, "/system/lib,vbox,ko"

    .line 23
    .line 24
    .line 25
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    sput-object v0, Lcom/tencent/bugly/proguard/h2;->f:[Ljava/lang/String;

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

.method public static synthetic a()I
    .locals 1

    .line 1
    sget v0, Lcom/tencent/bugly/proguard/h2;->c:I

    return v0
.end method

.method public static a(Landroid/content/Context;)V
    .locals 6

    .line 2
    invoke-static {p0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object p0

    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/l2;->o()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p0

    .line 3
    sget-object v0, Lcom/tencent/bugly/proguard/h2;->e:[Ljava/lang/String;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 4
    invoke-virtual {p0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 5
    const-string/jumbo v4, "model: "

    const-string v5, ";"

    invoke-static {v4, v3, v5}, Lcom/tencent/bugly/proguard/lf;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 6
    sget-object v4, Lcom/tencent/bugly/proguard/h2;->d:Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    sget v3, Lcom/tencent/bugly/proguard/h2;->c:I

    add-int/lit8 v3, v3, 0xa

    sput v3, Lcom/tencent/bugly/proguard/h2;->c:I

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static a(Ljava/io/File;[Ljava/lang/String;)V
    .locals 8

    .line 8
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    .line 9
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object p0

    .line 10
    const-string v1, "Check file path: "

    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/l7;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    .line 11
    new-array v3, v2, [Ljava/lang/Object;

    invoke-static {v1, v3}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    if-eqz p0, :cond_3

    .line 12
    array-length v1, p0

    if-eqz v1, :cond_3

    .line 13
    array-length v0, p0

    :goto_0
    if-ge v2, v0, :cond_2

    aget-object v1, p0, v2

    .line 14
    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    .line 15
    :goto_1
    array-length v5, p1

    if-ge v4, v5, :cond_1

    .line 16
    aget-object v5, p1, v4

    invoke-virtual {v5}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v5

    .line 17
    invoke-virtual {v3, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 18
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "file: "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, ", "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ";"

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 19
    sget-object v6, Lcom/tencent/bugly/proguard/h2;->d:Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    sget v5, Lcom/tencent/bugly/proguard/h2;->c:I

    add-int/lit8 v5, v5, 0x5

    sput v5, Lcom/tencent/bugly/proguard/h2;->c:I

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-void

    .line 21
    :cond_3
    const-string p0, "File list is zero or null in dir: "

    invoke-static {p0, v0}, Lcom/tencent/bugly/proguard/l7;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 22
    new-array p1, v2, [Ljava/lang/Object;

    .line 23
    sget-object v0, Lcom/tencent/rmonitor/common/logger/LogState;->DEBUG:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v0, p0, p1}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    const/4 v0, 0x0

    .line 24
    new-array v1, v0, [Ljava/lang/Object;

    const-string v2, "Start to parse emulator feature from config."

    invoke-static {v2, v1}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    const-string v1, "%"

    if-eqz p0, :cond_0

    .line 25
    const-string v2, "Get emulator model feature from config, feature: "

    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-array v3, v0, [Ljava/lang/Object;

    .line 26
    sget-object v4, Lcom/tencent/rmonitor/common/logger/LogState;->INFO:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v4, v2, v3}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 27
    invoke-virtual {p0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    sput-object p0, Lcom/tencent/bugly/proguard/h2;->e:[Ljava/lang/String;

    goto :goto_0

    .line 28
    :cond_0
    new-array p0, v0, [Ljava/lang/Object;

    .line 29
    sget-object v2, Lcom/tencent/rmonitor/common/logger/LogState;->DEBUG:Lcom/tencent/rmonitor/common/logger/LogState;

    const-string v3, "No emulator model feature in config."

    invoke-static {v2, v3, p0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    :goto_0
    if-eqz p1, :cond_1

    .line 30
    const-string p0, "Get emulator files feature from config, feature: "

    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-array v0, v0, [Ljava/lang/Object;

    .line 31
    sget-object v2, Lcom/tencent/rmonitor/common/logger/LogState;->INFO:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v2, p0, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 32
    invoke-virtual {p1, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    sput-object p0, Lcom/tencent/bugly/proguard/h2;->f:[Ljava/lang/String;

    return-void

    .line 33
    :cond_1
    new-array p0, v0, [Ljava/lang/Object;

    .line 34
    sget-object p1, Lcom/tencent/rmonitor/common/logger/LogState;->DEBUG:Lcom/tencent/rmonitor/common/logger/LogState;

    const-string v0, "No emulator files feature in config"

    invoke-static {p1, v0, p0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void
.end method

.method public static synthetic b()Ljava/lang/StringBuilder;
    .locals 1

    .line 1
    sget-object v0, Lcom/tencent/bugly/proguard/h2;->d:Ljava/lang/StringBuilder;

    return-object v0
.end method

.method public static b(Landroid/content/Context;)V
    .locals 2

    .line 2
    invoke-static {}, Lcom/tencent/bugly/proguard/m0;->c()Lcom/tencent/bugly/proguard/m0;

    move-result-object v0

    new-instance v1, Lcom/tencent/bugly/proguard/h2$a;

    invoke-direct {v1, p0}, Lcom/tencent/bugly/proguard/h2$a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/m0;->a(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public static c()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    move-result-object v0

    const-string/jumbo v1, "ro.product.cpu.abi"

    invoke-virtual {v0, v1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getProperties(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 2
    const-string/jumbo v1, "x86"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    sget-object v0, Lcom/tencent/bugly/proguard/h2;->d:Ljava/lang/StringBuilder;

    const-string v1, "cpu: x86;"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    sget v0, Lcom/tencent/bugly/proguard/h2;->c:I

    add-int/lit8 v0, v0, 0xa

    sput v0, Lcom/tencent/bugly/proguard/h2;->c:I

    :cond_0
    return-void
.end method

.method public static c(Landroid/content/Context;)V
    .locals 7

    .line 5
    invoke-static {p0}, Lcom/tencent/bugly/proguard/h2;->a(Landroid/content/Context;)V

    .line 6
    invoke-static {}, Lcom/tencent/bugly/proguard/h2;->c()V

    .line 7
    sget-object p0, Lcom/tencent/bugly/proguard/h2;->f:[Ljava/lang/String;

    array-length v0, p0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    aget-object v3, p0, v2

    .line 8
    const-string v4, ","

    invoke-virtual {v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    .line 9
    aget-object v4, v3, v1

    .line 10
    new-instance v5, Ljava/io/File;

    invoke-direct {v5, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 11
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v6

    if-eqz v6, :cond_0

    .line 12
    invoke-static {v5, v3}, Lcom/tencent/bugly/proguard/h2;->a(Ljava/io/File;[Ljava/lang/String;)V

    goto :goto_1

    .line 13
    :cond_0
    const-string v3, "Failed to get path: "

    invoke-static {v3, v4}, Lcom/tencent/bugly/proguard/l7;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 14
    new-array v4, v1, [Ljava/lang/Object;

    invoke-static {v3, v4}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method
