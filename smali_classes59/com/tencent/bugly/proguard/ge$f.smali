.class public final Lcom/tencent/bugly/proguard/ge$f;
.super Ljava/lang/Object;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/bugly/proguard/ge;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation


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

.method public static a([Ljava/lang/Object;)Lcom/tencent/bugly/proguard/ge$e;
    .locals 4

    .line 1
    .line 2
    const-string v0, "Bugly.PowerHooker"

    .line 3
    .line 4
    if-nez p0, :cond_0

    .line 5
    const/4 p0, 0x0

    .line 6
    .line 7
    new-array p0, p0, [Ljava/lang/Object;

    .line 8
    .line 9
    const-string v1, "createReleaseWakeLockArgs args null"

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1, p0}, Lcom/tencent/bugly/proguard/pb;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 13
    const/4 p0, 0x0

    .line 14
    return-object p0

    .line 15
    .line 16
    :cond_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 17
    .line 18
    .line 19
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    move-result-object v2

    .line 21
    .line 22
    sget-object v3, Landroid/os/Build$VERSION;->CODENAME:Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    .line 29
    filled-new-array {v2, v3, v1}, [Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    const-string v2, "createReleaseWakeLockArgs apiLevel:%d, codeName:%s, versionRelease:%s"

    .line 33
    .line 34
    .line 35
    invoke-static {v0, v2, v1}, Lcom/tencent/bugly/proguard/pb;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-static {p0}, Lcom/tencent/bugly/proguard/ge$f;->c([Ljava/lang/Object;)Lcom/tencent/bugly/proguard/ge$e;

    .line 39
    move-result-object p0

    .line 40
    return-object p0
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

.method public static b([Ljava/lang/Object;)Lcom/tencent/bugly/proguard/ge$e;
    .locals 5

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x2

    .line 3
    const/4 v2, 0x0

    .line 4
    .line 5
    const-string v3, "Bugly.PowerHooker"

    .line 6
    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    array-length p0, p0

    .line 9
    .line 10
    .line 11
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    move-result-object p0

    .line 13
    .line 14
    .line 15
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 16
    move-result-object p0

    .line 17
    .line 18
    const-string v0, "createReleaseWakeLockArgs2 args length invalid : %d"

    .line 19
    .line 20
    .line 21
    invoke-static {v3, v0, p0}, Lcom/tencent/bugly/proguard/pb;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 22
    return-object v2

    .line 23
    .line 24
    :cond_0
    new-instance v0, Lcom/tencent/bugly/proguard/ge$e;

    .line 25
    .line 26
    .line 27
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/ge$e;-><init>()V

    .line 28
    const/4 v1, 0x0

    .line 29
    .line 30
    aget-object v1, p0, v1

    .line 31
    .line 32
    instance-of v4, v1, Landroid/os/IBinder;

    .line 33
    .line 34
    if-nez v4, :cond_1

    .line 35
    .line 36
    .line 37
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 38
    move-result-object p0

    .line 39
    .line 40
    const-string v0, "createReleaseWakeLockArgs2 args idx 0 not IBinder, %s"

    .line 41
    .line 42
    .line 43
    invoke-static {v3, v0, p0}, Lcom/tencent/bugly/proguard/pb;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 44
    return-object v2

    .line 45
    .line 46
    :cond_1
    check-cast v1, Landroid/os/IBinder;

    .line 47
    .line 48
    iput-object v1, v0, Lcom/tencent/bugly/proguard/ge$e;->a:Landroid/os/IBinder;

    .line 49
    const/4 v1, 0x1

    .line 50
    .line 51
    aget-object p0, p0, v1

    .line 52
    .line 53
    instance-of v1, p0, Ljava/lang/Integer;

    .line 54
    .line 55
    if-nez v1, :cond_2

    .line 56
    .line 57
    .line 58
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 59
    move-result-object p0

    .line 60
    .line 61
    const-string v0, "createReleaseWakeLockArgs2 args idx 1 not Integer, %s"

    .line 62
    .line 63
    .line 64
    invoke-static {v3, v0, p0}, Lcom/tencent/bugly/proguard/pb;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 65
    return-object v2

    .line 66
    .line 67
    :cond_2
    check-cast p0, Ljava/lang/Integer;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 71
    move-result p0

    .line 72
    .line 73
    iput p0, v0, Lcom/tencent/bugly/proguard/ge$e;->b:I

    .line 74
    return-object v0
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
.end method

.method public static c([Ljava/lang/Object;)Lcom/tencent/bugly/proguard/ge$e;
    .locals 3

    .line 1
    array-length v0, p0

    .line 2
    .line 3
    .line 4
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    move-result-object v0

    .line 6
    .line 7
    .line 8
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    const-string v1, "Bugly.PowerHooker"

    .line 12
    .line 13
    const-string v2, "createReleaseWakeLockArgsAccordingToArgsLength: length:%s"

    .line 14
    .line 15
    .line 16
    invoke-static {v1, v2, v0}, Lcom/tencent/bugly/proguard/pb;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-static {p0}, Lcom/tencent/bugly/proguard/ge$f;->b([Ljava/lang/Object;)Lcom/tencent/bugly/proguard/ge$e;

    .line 20
    move-result-object p0

    .line 21
    return-object p0
    .line 22
    .line 23
    .line 24
    .line 25
.end method
