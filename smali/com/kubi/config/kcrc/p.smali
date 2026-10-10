.class public final Lcom/kubi/config/kcrc/p;
.super Ljava/lang/Object;
.source "RemoteConfigKunlunTrack.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u0004\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001d\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/kubi/config/kcrc/p;",
        "",
        "<init>",
        "()V",
        "Lcom/kubi/config/kcrc/KCRCAllEntity;",
        "entity",
        "",
        "b",
        "(Lcom/kubi/config/kcrc/KCRCAllEntity;)V",
        "Lcom/kubi/config/Config;",
        "config",
        "",
        "throwable",
        "a",
        "(Lcom/kubi/config/Config;Ljava/lang/Throwable;)V",
        "Config_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lcom/kubi/config/kcrc/p;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/config/kcrc/p;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/config/kcrc/p;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/kubi/config/kcrc/p;->a:Lcom/kubi/config/kcrc/p;

    .line 8
    return-void
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
    .line 21
    .line 22
.end method


# virtual methods
.method public final a(Lcom/kubi/config/Config;Ljava/lang/Throwable;)V
    .locals 1
    .param p1    # Lcom/kubi/config/Config;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "config"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string/jumbo v0, "throwable"

    .line 9
    .line 10
    .line 11
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    :try_start_0
    instance-of v0, p2, Lcom/kubi/network/retrofit/exception/ApiException;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    check-cast p2, Lcom/kubi/network/retrofit/exception/ApiException;

    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception p2

    .line 20
    goto :goto_2

    .line 21
    :cond_0
    const/4 p2, 0x0

    .line 22
    .line 23
    :goto_0
    if-nez p2, :cond_1

    .line 24
    goto :goto_3

    .line 25
    .line 26
    :cond_1
    iget-object p2, p2, Lcom/kubi/network/retrofit/exception/ApiException;->code:Ljava/lang/String;

    .line 27
    .line 28
    const-string v0, "apiException.code"

    .line 29
    .line 30
    .line 31
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-static {p2}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    .line 35
    move-result-object p2

    .line 36
    .line 37
    if-eqz p2, :cond_2

    .line 38
    .line 39
    .line 40
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 41
    move-result p2

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    const/4 p2, -0x3

    .line 44
    .line 45
    :goto_1
    sget-object v0, Lcom/kubi/sdk/constant/monitor/KunlunTechEventEnum;->CATE_REMOTE_CONFIG_FETCH_ALL:Lcom/kubi/sdk/constant/monitor/KunlunTechEventEnum;

    .line 46
    .line 47
    .line 48
    invoke-static {v0, p2}, Lqq/h;->d(Lcom/kubi/sdk/constant/monitor/KunlunTechEventEnum;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    return-void

    .line 50
    .line 51
    .line 52
    :goto_2
    invoke-virtual {p1}, Lcom/kubi/config/Config;->c()Lkotlin/jvm/functions/Function1;

    .line 53
    move-result-object p1

    .line 54
    .line 55
    .line 56
    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    :goto_3
    return-void
    .line 58
    .line 59
.end method

.method public final b(Lcom/kubi/config/kcrc/KCRCAllEntity;)V
    .locals 1
    .param p1    # Lcom/kubi/config/kcrc/KCRCAllEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "entity"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/kubi/config/kcrc/KCRCAllEntity;->getData()Lcom/kubi/config/kcrc/KCRCDataAll;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/kubi/config/kcrc/KCRCDataAll;->getHasMore()Ljava/lang/Boolean;

    .line 15
    move-result-object v0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    .line 19
    :goto_0
    if-eqz v0, :cond_3

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/kubi/config/kcrc/KCRCDataAll;->getBeginId()Ljava/lang/Long;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    if-eqz v0, :cond_3

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Lcom/kubi/config/kcrc/KCRCDataAll;->getVersion()Ljava/lang/Long;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    if-eqz v0, :cond_3

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/kubi/config/kcrc/KCRCDataAll;->getValues()Ljava/util/Map;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    if-nez v0, :cond_1

    .line 38
    goto :goto_1

    .line 39
    .line 40
    .line 41
    :cond_1
    invoke-virtual {p1}, Lcom/kubi/config/kcrc/KCRCDataAll;->getValues()Ljava/util/Map;

    .line 42
    move-result-object p1

    .line 43
    .line 44
    .line 45
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    .line 46
    move-result p1

    .line 47
    .line 48
    if-eqz p1, :cond_2

    .line 49
    const/4 p1, -0x1

    .line 50
    goto :goto_2

    .line 51
    .line 52
    :cond_2
    const/16 p1, 0xc8

    .line 53
    goto :goto_2

    .line 54
    :cond_3
    :goto_1
    const/4 p1, -0x2

    .line 55
    .line 56
    :goto_2
    sget-object v0, Lcom/kubi/sdk/constant/monitor/KunlunTechEventEnum;->CATE_REMOTE_CONFIG_FETCH_ALL:Lcom/kubi/sdk/constant/monitor/KunlunTechEventEnum;

    .line 57
    .line 58
    .line 59
    invoke-static {v0, p1}, Lqq/h;->d(Lcom/kubi/sdk/constant/monitor/KunlunTechEventEnum;I)V

    .line 60
    return-void
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
.end method
