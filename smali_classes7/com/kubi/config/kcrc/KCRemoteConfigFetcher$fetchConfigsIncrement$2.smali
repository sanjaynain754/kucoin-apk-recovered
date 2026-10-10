.class final Lcom/kubi/config/kcrc/KCRemoteConfigFetcher$fetchConfigsIncrement$2;
.super Lkotlin/jvm/internal/Lambda;
.source "KCRemoteConfigFetcher.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;->C(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Throwable;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "",
        "kotlin.jvm.PlatformType",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $conf:Lcom/kubi/config/Config;

.field final synthetic $fetchBy:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/kubi/config/Config;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/config/kcrc/KCRemoteConfigFetcher$fetchConfigsIncrement$2;->$fetchBy:Ljava/lang/String;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/kubi/config/kcrc/KCRemoteConfigFetcher$fetchConfigsIncrement$2;->$conf:Lcom/kubi/config/Config;

    .line 5
    const/4 p1, 0x1

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 9
    return-void
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
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lcom/kubi/config/kcrc/KCRemoteConfigFetcher$fetchConfigsIncrement$2;->invoke(Ljava/lang/Throwable;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Throwable;)V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/kubi/config/kcrc/KCRemoteConfigFetcher$fetchConfigsIncrement$2;->$fetchBy:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-static {v0, v1, p1}, Lcom/kubi/config/kcrc/k;->b(Ljava/lang/String;ZLjava/lang/String;)V

    .line 3
    invoke-static {}, Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;->o()I

    move-result p1

    iget-object v0, p0, Lcom/kubi/config/kcrc/KCRemoteConfigFetcher$fetchConfigsIncrement$2;->$conf:Lcom/kubi/config/Config;

    invoke-virtual {v0}, Lcom/kubi/config/Config;->e()Lcom/kubi/config/kcrc/KCRemoteConfigParam;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kubi/config/kcrc/KCRemoteConfigParam;->getRetryCount()I

    move-result v0

    if-ge p1, v0, :cond_1

    sget-object p1, Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;->a:Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;

    invoke-static {p1}, Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;->q(Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    invoke-static {}, Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;->o()I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;->y(I)V

    .line 5
    sget-object p1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v0, Lcom/kubi/config/kcrc/KCRemoteConfigFetcher$fetchConfigsIncrement$2$a;

    invoke-direct {v0}, Lcom/kubi/config/kcrc/KCRemoteConfigFetcher$fetchConfigsIncrement$2$a;-><init>()V

    const-wide/16 v1, 0x2

    invoke-static {v1, v2, p1, v0}, Lo00/h;->b(JLjava/util/concurrent/TimeUnit;Ljava/lang/Runnable;)V

    return-void

    .line 6
    :cond_1
    :goto_0
    invoke-static {v1}, Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;->y(I)V

    return-void
.end method
