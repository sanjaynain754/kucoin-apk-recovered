.class public final Lcom/kubi/kucoin/startup/RemoteConfigStartupTask$a;
.super Ljava/lang/Object;
.source "RemoteConfigStartupTask.kt"

# interfaces
.implements Lcom/kubi/sdk/function/language/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/kucoin/startup/RemoteConfigStartupTask;->run(Landroid/app/Application;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"
    }
    d2 = {
        "com/kubi/kucoin/startup/RemoteConfigStartupTask$run$3",
        "Lcom/kubi/sdk/function/language/MultiLanguageManager$OnLanguageChangeListener;",
        "onLanguageChange",
        "",
        "language",
        "Lcom/kubi/sdk/function/language/LanguageType;",
        "LAppStartup_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Lcom/kubi/kucoin/startup/RemoteConfigStartupTask;

.field public final synthetic b:Landroid/app/Application;


# direct methods
.method public constructor <init>(Lcom/kubi/kucoin/startup/RemoteConfigStartupTask;Landroid/app/Application;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/kucoin/startup/RemoteConfigStartupTask$a;->a:Lcom/kubi/kucoin/startup/RemoteConfigStartupTask;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/kubi/kucoin/startup/RemoteConfigStartupTask$a;->b:Landroid/app/Application;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method


# virtual methods
.method public onLanguageChange(Lcom/kubi/sdk/function/language/LanguageType;)V
    .locals 2

    .line 1
    .line 2
    const-string v0, "language"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object p1, Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;->a:Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;

    .line 8
    .line 9
    iget-object v0, p0, Lcom/kubi/kucoin/startup/RemoteConfigStartupTask$a;->a:Lcom/kubi/kucoin/startup/RemoteConfigStartupTask;

    .line 10
    .line 11
    iget-object v1, p0, Lcom/kubi/kucoin/startup/RemoteConfigStartupTask$a;->b:Landroid/app/Application;

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lcom/kubi/kucoin/startup/RemoteConfigStartupTask;->access$createCurrentConfig(Lcom/kubi/kucoin/startup/RemoteConfigStartupTask;Landroid/app/Application;)Lcom/kubi/config/Config;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, v0}, Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;->B(Lcom/kubi/config/Config;)V

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
.end method
