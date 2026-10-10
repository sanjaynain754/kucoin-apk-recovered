.class public final Lcom/tencent/rmonitor/common/logger/Logger;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Lcom/tencent/rmonitor/common/logger/ILoger;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/rmonitor/common/logger/Logger$DefaultLogProxy;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0008\u0006\n\u0002\u0010\u0003\n\u0002\u0008\n\u0008\u00c6\u0002\u0018\u00002\u00020\u0001:\u00013B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J!\u0010 \u001a\u00020!2\u0012\u0010\"\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00060#\"\u00020\u0006H\u0016\u00a2\u0006\u0002\u0010$J!\u0010%\u001a\u00020!2\u0012\u0010\"\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00060#\"\u00020\u0006H\u0016\u00a2\u0006\u0002\u0010$J$\u0010&\u001a\u00020!2\u0008\u0010\'\u001a\u0004\u0018\u00010\u00062\u0008\u0010(\u001a\u0004\u0018\u00010\u00062\u0008\u0010)\u001a\u0004\u0018\u00010*J\u001a\u0010&\u001a\u00020!2\u0008\u0010\'\u001a\u0004\u0018\u00010\u00062\u0008\u0010)\u001a\u0004\u0018\u00010*J\u0010\u0010+\u001a\u00020\u00062\u0008\u0010)\u001a\u0004\u0018\u00010*J!\u0010,\u001a\u00020!2\u0012\u0010\"\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00060#\"\u00020\u0006H\u0016\u00a2\u0006\u0002\u0010$J)\u0010-\u001a\u00020!2\u0006\u0010.\u001a\u00020\u00102\u0012\u0010\"\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00060#\"\u00020\u0006H\u0002\u00a2\u0006\u0002\u0010/J\u000e\u00100\u001a\u00020!2\u0006\u0010\u000f\u001a\u00020\nJ!\u00101\u001a\u00020!2\u0012\u0010\"\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00060#\"\u00020\u0006H\u0016\u00a2\u0006\u0002\u0010$J!\u00102\u001a\u00020!2\u0012\u0010\"\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00060#\"\u00020\u0006H\u0016\u00a2\u0006\u0002\u0010$R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\u00088\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\"\u0004\u0008\r\u0010\u000eR$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013\"\u0004\u0008\u0014\u0010\u0015R*\u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019\"\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u001f\u001a\u00020\u00088\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00064"
    }
    d2 = {
        "Lcom/tencent/rmonitor/common/logger/Logger;",
        "Lcom/tencent/rmonitor/common/logger/ILoger;",
        "()V",
        "DEFAULT_PROXY",
        "Lcom/tencent/rmonitor/common/logger/ILogProxy;",
        "TAG",
        "",
        "debug",
        "",
        "intLevel",
        "",
        "getIntLevel",
        "()I",
        "setIntLevel",
        "(I)V",
        "level",
        "Lcom/tencent/rmonitor/common/logger/LogState;",
        "logLevel",
        "getLogLevel",
        "()Lcom/tencent/rmonitor/common/logger/LogState;",
        "setLogLevel",
        "(Lcom/tencent/rmonitor/common/logger/LogState;)V",
        "value",
        "logProxy",
        "getLogProxy",
        "()Lcom/tencent/rmonitor/common/logger/ILogProxy;",
        "setLogProxy",
        "(Lcom/tencent/rmonitor/common/logger/ILogProxy;)V",
        "logTimeFormatter",
        "Ljava/lang/ThreadLocal;",
        "Ljava/text/SimpleDateFormat;",
        "verbos",
        "d",
        "",
        "args",
        "",
        "([Ljava/lang/String;)V",
        "e",
        "exception",
        "tag",
        "msg",
        "throwable",
        "",
        "getThrowableMessage",
        "i",
        "logInner",
        "logState",
        "(Lcom/tencent/rmonitor/common/logger/LogState;[Ljava/lang/String;)V",
        "resetLogLevel",
        "v",
        "w",
        "DefaultLogProxy",
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


# static fields
.field private static final DEFAULT_PROXY:Lcom/tencent/rmonitor/common/logger/ILogProxy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final TAG:Ljava/lang/String; = "RMonitor_common_Logger"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static debug:Z
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field private static intLevel:I

.field private static logLevel:Lcom/tencent/rmonitor/common/logger/LogState;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static logProxy:Lcom/tencent/rmonitor/common/logger/ILogProxy;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private static logTimeFormatter:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Ljava/text/SimpleDateFormat;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static verbos:Z
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/rmonitor/common/logger/Logger;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/tencent/rmonitor/common/logger/Logger;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 8
    .line 9
    new-instance v0, Lcom/tencent/rmonitor/common/logger/Logger$DefaultLogProxy;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Lcom/tencent/rmonitor/common/logger/Logger$DefaultLogProxy;-><init>()V

    .line 13
    .line 14
    sput-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->DEFAULT_PROXY:Lcom/tencent/rmonitor/common/logger/ILogProxy;

    .line 15
    .line 16
    new-instance v1, Lcom/tencent/rmonitor/common/logger/Logger$logTimeFormatter$1;

    .line 17
    .line 18
    .line 19
    invoke-direct {v1}, Lcom/tencent/rmonitor/common/logger/Logger$logTimeFormatter$1;-><init>()V

    .line 20
    .line 21
    sput-object v1, Lcom/tencent/rmonitor/common/logger/Logger;->logTimeFormatter:Ljava/lang/ThreadLocal;

    .line 22
    .line 23
    sget-object v1, Lcom/tencent/rmonitor/common/logger/LogState;->WARN:Lcom/tencent/rmonitor/common/logger/LogState;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Lcom/tencent/rmonitor/common/logger/LogState;->getValue()I

    .line 27
    move-result v2

    .line 28
    .line 29
    sput v2, Lcom/tencent/rmonitor/common/logger/Logger;->intLevel:I

    .line 30
    .line 31
    sput-object v1, Lcom/tencent/rmonitor/common/logger/Logger;->logLevel:Lcom/tencent/rmonitor/common/logger/LogState;

    .line 32
    .line 33
    sput-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->logProxy:Lcom/tencent/rmonitor/common/logger/ILogProxy;

    .line 34
    return-void
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

.method private constructor <init>()V
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

.method public static final synthetic access$getLogTimeFormatter$p()Ljava/lang/ThreadLocal;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->logTimeFormatter:Ljava/lang/ThreadLocal;

    .line 3
    return-object v0
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
.end method

.method private final varargs logInner(Lcom/tencent/rmonitor/common/logger/LogState;[Ljava/lang/String;)V
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->logLevel:Lcom/tencent/rmonitor/common/logger/LogState;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 6
    move-result v0

    .line 7
    .line 8
    if-ltz v0, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/tencent/rmonitor/common/logger/Logger;->getLogProxy()Lcom/tencent/rmonitor/common/logger/ILogProxy;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    array-length v1, p2

    .line 16
    .line 17
    .line 18
    invoke-static {p2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 19
    move-result-object p2

    .line 20
    .line 21
    check-cast p2, [Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    invoke-interface {v0, p1, p2}, Lcom/tencent/rmonitor/common/logger/ILogProxy;->doLog(Lcom/tencent/rmonitor/common/logger/LogState;[Ljava/lang/String;)V

    .line 25
    :cond_0
    return-void
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
.end method


# virtual methods
.method public varargs d([Ljava/lang/String;)V
    .locals 2
    .param p1    # [Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "args"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/tencent/rmonitor/common/logger/LogState;->DEBUG:Lcom/tencent/rmonitor/common/logger/LogState;

    .line 8
    array-length v1, p1

    .line 9
    .line 10
    .line 11
    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    check-cast p1, [Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    invoke-direct {p0, v0, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->logInner(Lcom/tencent/rmonitor/common/logger/LogState;[Ljava/lang/String;)V

    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public varargs e([Ljava/lang/String;)V
    .locals 2
    .param p1    # [Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "args"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/tencent/rmonitor/common/logger/LogState;->ERROR:Lcom/tencent/rmonitor/common/logger/LogState;

    .line 8
    array-length v1, p1

    .line 9
    .line 10
    .line 11
    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    check-cast p1, [Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    invoke-direct {p0, v0, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->logInner(Lcom/tencent/rmonitor/common/logger/LogState;[Ljava/lang/String;)V

    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public final exception(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_2

    if-nez p3, :cond_0

    goto :goto_0

    :cond_0
    if-nez p2, :cond_1

    .line 2
    const-string p2, ""

    :cond_1
    invoke-virtual {p0, p3}, Lcom/tencent/rmonitor/common/logger/Logger;->getThrowableMessage(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p3

    filled-new-array {p1, p2, p3}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->e([Ljava/lang/String;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final exception(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    invoke-virtual {p0, p2}, Lcom/tencent/rmonitor/common/logger/Logger;->getThrowableMessage(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p2

    filled-new-array {p1, p2}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->e([Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final getIntLevel()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/tencent/rmonitor/common/logger/Logger;->intLevel:I

    .line 3
    return v0
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
.end method

.method public final getLogLevel()Lcom/tencent/rmonitor/common/logger/LogState;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->logLevel:Lcom/tencent/rmonitor/common/logger/LogState;

    .line 3
    return-object v0
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
.end method

.method public final getLogProxy()Lcom/tencent/rmonitor/common/logger/ILogProxy;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->logProxy:Lcom/tencent/rmonitor/common/logger/ILogProxy;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->DEFAULT_PROXY:Lcom/tencent/rmonitor/common/logger/ILogProxy;

    .line 7
    :cond_0
    return-object v0
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

.method public final getThrowableMessage(Ljava/lang/Throwable;)Ljava/lang/String;
    .locals 2
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    const-string p1, ""

    .line 5
    return-object p1

    .line 6
    .line 7
    :cond_0
    new-instance v0, Ljava/io/StringWriter;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    .line 11
    .line 12
    new-instance v1, Ljava/io/PrintWriter;

    .line 13
    .line 14
    .line 15
    invoke-direct {v1, v0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, v1}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    .line 22
    move-result-object p1

    .line 23
    .line 24
    const-string v0, "sw.toString()"

    .line 25
    .line 26
    .line 27
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    return-object p1
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
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
.end method

.method public varargs i([Ljava/lang/String;)V
    .locals 2
    .param p1    # [Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "args"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/tencent/rmonitor/common/logger/LogState;->INFO:Lcom/tencent/rmonitor/common/logger/LogState;

    .line 8
    array-length v1, p1

    .line 9
    .line 10
    .line 11
    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    check-cast p1, [Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    invoke-direct {p0, v0, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->logInner(Lcom/tencent/rmonitor/common/logger/LogState;[Ljava/lang/String;)V

    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public final resetLogLevel(I)V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/rmonitor/common/logger/LogState;->Companion:Lcom/tencent/rmonitor/common/logger/LogState$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/tencent/rmonitor/common/logger/LogState$Companion;->getByValue(I)Lcom/tencent/rmonitor/common/logger/LogState;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    sget-object p1, Lcom/tencent/rmonitor/common/logger/LogState;->OFF:Lcom/tencent/rmonitor/common/logger/LogState;

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {p0, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->setLogLevel(Lcom/tencent/rmonitor/common/logger/LogState;)V

    .line 14
    return-void
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
.end method

.method public final setIntLevel(I)V
    .locals 0

    .line 1
    .line 2
    sput p1, Lcom/tencent/rmonitor/common/logger/Logger;->intLevel:I

    .line 3
    return-void
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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public final setLogLevel(Lcom/tencent/rmonitor/common/logger/LogState;)V
    .locals 3
    .param p1    # Lcom/tencent/rmonitor/common/logger/LogState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "level"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sput-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->logLevel:Lcom/tencent/rmonitor/common/logger/LogState;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/tencent/rmonitor/common/logger/LogState;->getValue()I

    .line 11
    move-result p1

    .line 12
    .line 13
    sput p1, Lcom/tencent/rmonitor/common/logger/Logger;->intLevel:I

    .line 14
    .line 15
    sget-object v0, Lcom/tencent/rmonitor/common/logger/LogState;->DEBUG:Lcom/tencent/rmonitor/common/logger/LogState;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/tencent/rmonitor/common/logger/LogState;->getValue()I

    .line 19
    move-result v0

    .line 20
    const/4 v1, 0x0

    .line 21
    const/4 v2, 0x1

    .line 22
    .line 23
    if-lt p1, v0, :cond_0

    .line 24
    move p1, v2

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move p1, v1

    .line 27
    .line 28
    :goto_0
    sput-boolean p1, Lcom/tencent/rmonitor/common/logger/Logger;->debug:Z

    .line 29
    .line 30
    sget p1, Lcom/tencent/rmonitor/common/logger/Logger;->intLevel:I

    .line 31
    .line 32
    sget-object v0, Lcom/tencent/rmonitor/common/logger/LogState;->VERBOS:Lcom/tencent/rmonitor/common/logger/LogState;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Lcom/tencent/rmonitor/common/logger/LogState;->getValue()I

    .line 36
    move-result v0

    .line 37
    .line 38
    if-lt p1, v0, :cond_1

    .line 39
    move v1, v2

    .line 40
    .line 41
    :cond_1
    sput-boolean v1, Lcom/tencent/rmonitor/common/logger/Logger;->verbos:Z

    .line 42
    return-void
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
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
.end method

.method public final setLogProxy(Lcom/tencent/rmonitor/common/logger/ILogProxy;)V
    .locals 1
    .param p1    # Lcom/tencent/rmonitor/common/logger/ILogProxy;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    move-result-object v0

    .line 7
    monitor-enter v0

    .line 8
    .line 9
    :try_start_0
    sput-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->logProxy:Lcom/tencent/rmonitor/common/logger/ILogProxy;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    monitor-exit v0

    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    monitor-exit v0

    .line 16
    throw p1
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public varargs v([Ljava/lang/String;)V
    .locals 2
    .param p1    # [Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "args"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/tencent/rmonitor/common/logger/LogState;->VERBOS:Lcom/tencent/rmonitor/common/logger/LogState;

    .line 8
    array-length v1, p1

    .line 9
    .line 10
    .line 11
    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    check-cast p1, [Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    invoke-direct {p0, v0, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->logInner(Lcom/tencent/rmonitor/common/logger/LogState;[Ljava/lang/String;)V

    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public varargs w([Ljava/lang/String;)V
    .locals 2
    .param p1    # [Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "args"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/tencent/rmonitor/common/logger/LogState;->WARN:Lcom/tencent/rmonitor/common/logger/LogState;

    .line 8
    array-length v1, p1

    .line 9
    .line 10
    .line 11
    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    check-cast p1, [Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    invoke-direct {p0, v0, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->logInner(Lcom/tencent/rmonitor/common/logger/LogState;[Ljava/lang/String;)V

    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method
