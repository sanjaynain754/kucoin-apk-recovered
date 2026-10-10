.class public final Lcom/kubi/widget/web/abtest/WebKnbABTestHelper;
.super Ljava/lang/Object;
.source "WebKnbABTestHelper.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/widget/web/abtest/WebKnbABTestHelper$ABTestConfig;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0008\u00c0\u0002\u0018\u00002\u00020\u0001:\u0001\u000cB\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0006\u0010\n\u001a\u00020\u000bR\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/kubi/widget/web/abtest/WebKnbABTestHelper;",
        "",
        "<init>",
        "()V",
        "config",
        "Lcom/kubi/widget/web/abtest/WebKnbABTestHelper$ABTestConfig;",
        "getConfig",
        "()Lcom/kubi/widget/web/abtest/WebKnbABTestHelper$ABTestConfig;",
        "config$delegate",
        "Lkotlin/Lazy;",
        "isEnableMessageQueue",
        "",
        "ABTestConfig",
        "LWebWidget_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nWebKnbABTestHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebKnbABTestHelper.kt\ncom/kubi/widget/web/abtest/WebKnbABTestHelper\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,29:1\n35#2,4:30\n39#2:36\n44#3,2:34\n*S KotlinDebug\n*F\n+ 1 WebKnbABTestHelper.kt\ncom/kubi/widget/web/abtest/WebKnbABTestHelper\n*L\n23#1:30,4\n23#1:36\n23#1:34,2\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Lcom/kubi/widget/web/abtest/WebKnbABTestHelper;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/widget/web/abtest/WebKnbABTestHelper;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/widget/web/abtest/WebKnbABTestHelper;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/kubi/widget/web/abtest/WebKnbABTestHelper;->a:Lcom/kubi/widget/web/abtest/WebKnbABTestHelper;

    .line 8
    .line 9
    new-instance v0, Lcom/kubi/widget/web/abtest/a;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Lcom/kubi/widget/web/abtest/a;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    sput-object v0, Lcom/kubi/widget/web/abtest/WebKnbABTestHelper;->b:Lkotlin/Lazy;

    .line 19
    return-void
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

.method public static synthetic a()Lcom/kubi/widget/web/abtest/WebKnbABTestHelper$ABTestConfig;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/widget/web/abtest/WebKnbABTestHelper;->b()Lcom/kubi/widget/web/abtest/WebKnbABTestHelper$ABTestConfig;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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

.method public static final b()Lcom/kubi/widget/web/abtest/WebKnbABTestHelper$ABTestConfig;
    .locals 9

    .line 1
    .line 2
    const-string v0, "h5_knb_config"

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    :try_start_0
    sget-object v2, Lcom/kubi/config/RemoteConfig;->a:Lcom/kubi/config/RemoteConfig;

    .line 6
    .line 7
    new-instance v2, Lcom/kubi/widget/web/abtest/WebKnbABTestHelper$a;

    .line 8
    .line 9
    .line 10
    invoke-direct {v2}, Lcom/kubi/widget/web/abtest/WebKnbABTestHelper$a;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v2}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 14
    move-result-object v2

    .line 15
    .line 16
    .line 17
    const-string/jumbo v3, "object : TypeToken<T>() {}.type"

    .line 18
    .line 19
    .line 20
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-static {v0, v2}, Lcom/kubi/config/RemoteConfig;->a(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 24
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception v0

    .line 27
    move-object v3, v0

    .line 28
    .line 29
    new-instance v2, Lcom/kubi/config/exception/KCConfigException;

    .line 30
    .line 31
    const/16 v7, 0x8

    .line 32
    const/4 v8, 0x0

    .line 33
    .line 34
    const-string v4, "RemoteConfig"

    .line 35
    const/4 v5, 0x0

    .line 36
    const/4 v6, 0x0

    .line 37
    .line 38
    .line 39
    invoke-direct/range {v2 .. v8}, Lcom/kubi/config/exception/KCConfigException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 40
    const/4 v0, 0x2

    .line 41
    .line 42
    .line 43
    invoke-static {v2, v1, v0, v1}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 44
    move-object v0, v1

    .line 45
    .line 46
    :goto_0
    check-cast v0, Lcom/kubi/widget/web/abtest/WebKnbABTestHelper$ABTestConfig;

    .line 47
    .line 48
    if-nez v0, :cond_0

    .line 49
    .line 50
    new-instance v0, Lcom/kubi/widget/web/abtest/WebKnbABTestHelper$ABTestConfig;

    .line 51
    const/4 v2, 0x0

    .line 52
    const/4 v3, 0x1

    .line 53
    .line 54
    .line 55
    invoke-direct {v0, v2, v3, v1}, Lcom/kubi/widget/web/abtest/WebKnbABTestHelper$ABTestConfig;-><init>(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 56
    :cond_0
    return-object v0
    .line 57
.end method


# virtual methods
.method public final c()Lcom/kubi/widget/web/abtest/WebKnbABTestHelper$ABTestConfig;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/widget/web/abtest/WebKnbABTestHelper;->b:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/widget/web/abtest/WebKnbABTestHelper$ABTestConfig;

    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public final d()Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/widget/web/abtest/WebKnbABTestHelper;->c()Lcom/kubi/widget/web/abtest/WebKnbABTestHelper$ABTestConfig;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/kubi/widget/web/abtest/WebKnbABTestHelper$ABTestConfig;->getQueue()Z

    .line 8
    move-result v0

    .line 9
    return v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method
