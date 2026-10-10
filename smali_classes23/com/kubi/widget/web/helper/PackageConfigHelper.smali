.class public final Lcom/kubi/widget/web/helper/PackageConfigHelper;
.super Ljava/lang/Object;
.source "PackageConfigHelper.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/widget/web/helper/PackageConfigHelper$RemoteSetting;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0008\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0010\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/kubi/widget/web/helper/PackageConfigHelper;",
        "",
        "<init>",
        "()V",
        "TASK_LIMIT_DEF",
        "",
        "CONFIG_KEY",
        "",
        "setting",
        "Lcom/kubi/widget/web/helper/PackageConfigHelper$RemoteSetting;",
        "getSetting",
        "()Lcom/kubi/widget/web/helper/PackageConfigHelper$RemoteSetting;",
        "setting$delegate",
        "Lkotlin/Lazy;",
        "bundleTaskLimit",
        "getBundleTaskLimit",
        "()I",
        "offlineTaskLimit",
        "getOfflineTaskLimit",
        "RemoteSetting",
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
        "SMAP\nPackageConfigHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PackageConfigHelper.kt\ncom/kubi/widget/web/helper/PackageConfigHelper\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,34:1\n35#2,4:35\n39#2:41\n44#3,2:39\n*S KotlinDebug\n*F\n+ 1 PackageConfigHelper.kt\ncom/kubi/widget/web/helper/PackageConfigHelper\n*L\n14#1:35,4\n14#1:41\n14#1:39,2\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Lcom/kubi/widget/web/helper/PackageConfigHelper;
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
    new-instance v0, Lcom/kubi/widget/web/helper/PackageConfigHelper;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/widget/web/helper/PackageConfigHelper;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/kubi/widget/web/helper/PackageConfigHelper;->a:Lcom/kubi/widget/web/helper/PackageConfigHelper;

    .line 8
    .line 9
    new-instance v0, Lcom/kubi/widget/web/helper/o;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Lcom/kubi/widget/web/helper/o;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    sput-object v0, Lcom/kubi/widget/web/helper/PackageConfigHelper;->b:Lkotlin/Lazy;

    .line 19
    return-void
    .line 20
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
    .line 18
    .line 19
    .line 20
.end method

.method public static synthetic a()Lcom/kubi/widget/web/helper/PackageConfigHelper$RemoteSetting;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/widget/web/helper/PackageConfigHelper;->e()Lcom/kubi/widget/web/helper/PackageConfigHelper$RemoteSetting;

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
    .line 18
    .line 19
    .line 20
.end method

.method public static final e()Lcom/kubi/widget/web/helper/PackageConfigHelper$RemoteSetting;
    .locals 9

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "pkg_setting_android"

    .line 4
    const/4 v1, 0x0

    .line 5
    .line 6
    :try_start_0
    sget-object v2, Lcom/kubi/config/RemoteConfig;->a:Lcom/kubi/config/RemoteConfig;

    .line 7
    .line 8
    new-instance v2, Lcom/kubi/widget/web/helper/PackageConfigHelper$a;

    .line 9
    .line 10
    .line 11
    invoke-direct {v2}, Lcom/kubi/widget/web/helper/PackageConfigHelper$a;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 15
    move-result-object v2

    .line 16
    .line 17
    .line 18
    const-string/jumbo v3, "object : TypeToken<T>() {}.type"

    .line 19
    .line 20
    .line 21
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-static {v0, v2}, Lcom/kubi/config/RemoteConfig;->a(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 25
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception v0

    .line 28
    move-object v3, v0

    .line 29
    .line 30
    new-instance v2, Lcom/kubi/config/exception/KCConfigException;

    .line 31
    .line 32
    const/16 v7, 0x8

    .line 33
    const/4 v8, 0x0

    .line 34
    .line 35
    const-string v4, "RemoteConfig"

    .line 36
    const/4 v5, 0x0

    .line 37
    const/4 v6, 0x0

    .line 38
    .line 39
    .line 40
    invoke-direct/range {v2 .. v8}, Lcom/kubi/config/exception/KCConfigException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 41
    const/4 v0, 0x2

    .line 42
    .line 43
    .line 44
    invoke-static {v2, v1, v0, v1}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 45
    move-object v0, v1

    .line 46
    .line 47
    :goto_0
    check-cast v0, Lcom/kubi/widget/web/helper/PackageConfigHelper$RemoteSetting;

    .line 48
    .line 49
    if-nez v0, :cond_0

    .line 50
    .line 51
    new-instance v0, Lcom/kubi/widget/web/helper/PackageConfigHelper$RemoteSetting;

    .line 52
    const/4 v2, 0x3

    .line 53
    const/4 v3, 0x0

    .line 54
    .line 55
    .line 56
    invoke-direct {v0, v3, v3, v2, v1}, Lcom/kubi/widget/web/helper/PackageConfigHelper$RemoteSetting;-><init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 57
    :cond_0
    return-object v0
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
.end method


# virtual methods
.method public final b()I
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/widget/web/helper/PackageConfigHelper;->d()Lcom/kubi/widget/web/helper/PackageConfigHelper$RemoteSetting;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/kubi/widget/web/helper/PackageConfigHelper$RemoteSetting;->getBundleTaskLimit()I

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
    .line 18
    .line 19
    .line 20
.end method

.method public final c()I
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/widget/web/helper/PackageConfigHelper;->d()Lcom/kubi/widget/web/helper/PackageConfigHelper$RemoteSetting;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/kubi/widget/web/helper/PackageConfigHelper$RemoteSetting;->getOfflineTaskLimit()I

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
    .line 18
    .line 19
    .line 20
.end method

.method public final d()Lcom/kubi/widget/web/helper/PackageConfigHelper$RemoteSetting;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/widget/web/helper/PackageConfigHelper;->b:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/widget/web/helper/PackageConfigHelper$RemoteSetting;

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
    .line 18
    .line 19
    .line 20
.end method
