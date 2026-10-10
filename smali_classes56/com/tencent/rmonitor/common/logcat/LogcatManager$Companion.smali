.class public final Lcom/tencent/rmonitor/common/logcat/LogcatManager$Companion;
.super Ljava/lang/Object;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/rmonitor/common/logcat/LogcatManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00078BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u0008\u0010\tR\u001b\u0010\u000c\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u000b\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/tencent/rmonitor/common/logcat/LogcatManager$Companion;",
        "",
        "()V",
        "JAVA",
        "",
        "NATIVE",
        "javaLog",
        "Lcom/tencent/rmonitor/common/logcat/LogcatFromJava;",
        "getJavaLog",
        "()Lcom/tencent/rmonitor/common/logcat/LogcatFromJava;",
        "javaLog$delegate",
        "Lkotlin/Lazy;",
        "nativeLog",
        "Lcom/tencent/rmonitor/common/logcat/LogcatFromNative;",
        "getNativeLog",
        "()Lcom/tencent/rmonitor/common/logcat/LogcatFromNative;",
        "nativeLog$delegate",
        "initLogcat",
        "Lcom/tencent/rmonitor/common/logcat/ILogcat;",
        "type",
        "bugly-pro_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tencent/rmonitor/common/logcat/LogcatManager$Companion;-><init>()V

    return-void
.end method

.method private final getJavaLog()Lcom/tencent/rmonitor/common/logcat/LogcatFromJava;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/rmonitor/common/logcat/LogcatManager;->access$getJavaLog$delegate$cp()Lkotlin/Lazy;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    check-cast v0, Lcom/tencent/rmonitor/common/logcat/LogcatFromJava;

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method private final getNativeLog()Lcom/tencent/rmonitor/common/logcat/LogcatFromNative;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/rmonitor/common/logcat/LogcatManager;->access$getNativeLog$delegate$cp()Lkotlin/Lazy;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    check-cast v0, Lcom/tencent/rmonitor/common/logcat/LogcatFromNative;

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method


# virtual methods
.method public final initLogcat(I)Lcom/tencent/rmonitor/common/logcat/ILogcat;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    if-eq p1, v0, :cond_1

    .line 4
    const/4 v0, 0x2

    .line 5
    .line 6
    if-eq p1, v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Lcom/tencent/rmonitor/common/logcat/LogcatManager$Companion;->getJavaLog()Lcom/tencent/rmonitor/common/logcat/LogcatFromJava;

    .line 10
    move-result-object p1

    .line 11
    return-object p1

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-direct {p0}, Lcom/tencent/rmonitor/common/logcat/LogcatManager$Companion;->getNativeLog()Lcom/tencent/rmonitor/common/logcat/LogcatFromNative;

    .line 15
    move-result-object p1

    .line 16
    return-object p1

    .line 17
    .line 18
    .line 19
    :cond_1
    invoke-direct {p0}, Lcom/tencent/rmonitor/common/logcat/LogcatManager$Companion;->getJavaLog()Lcom/tencent/rmonitor/common/logcat/LogcatFromJava;

    .line 20
    move-result-object p1

    .line 21
    return-object p1
    .line 22
    .line 23
    .line 24
.end method
