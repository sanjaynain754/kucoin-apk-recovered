.class public final Lcom/kubi/config/kcrc/KCRemoteConfigFetcher$onAppStatusChangedListener$1;
.super Ljava/lang/Object;
.source "KCRemoteConfigFetcher.kt"

# interfaces
.implements Lcom/blankj/utilcode/util/o0$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0006\u00a8\u0006\u0008"
    }
    d2 = {
        "com/kubi/config/kcrc/KCRemoteConfigFetcher$onAppStatusChangedListener$1",
        "Lcom/blankj/utilcode/util/o0$b;",
        "Landroid/app/Activity;",
        "activity",
        "",
        "onForeground",
        "(Landroid/app/Activity;)V",
        "onBackground",
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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method


# virtual methods
.method public onBackground(Landroid/app/Activity;)V
    .locals 3
    .param p1    # Landroid/app/Activity;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string p1, "app onBackground>>> resetPoll."

    .line 3
    .line 4
    .line 5
    invoke-static {p1}, Lcom/kubi/config/kcrc/l;->d(Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object p1, Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;->a:Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;

    .line 8
    const/4 v0, 0x2

    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x0

    .line 11
    .line 12
    .line 13
    invoke-static {p1, v2, v2, v0, v1}, Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;->T(Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;ZZILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-static {p1}, Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;->p(Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;)Lcom/kubi/config/kcrc/KCRemoteConfigWS;

    .line 17
    move-result-object p1

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/kubi/config/kcrc/KCRemoteConfigWS;->m()V

    .line 21
    return-void
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
.end method

.method public onForeground(Landroid/app/Activity;)V
    .locals 7
    .param p1    # Landroid/app/Activity;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    sget-object p1, Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;->a:Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;->H()Lcom/kubi/config/Config;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    return-void

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 13
    move-result-wide v1

    .line 14
    .line 15
    .line 16
    invoke-static {}, Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;->l()J

    .line 17
    move-result-wide v3

    .line 18
    sub-long/2addr v1, v3

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/kubi/config/Config;->e()Lcom/kubi/config/kcrc/KCRemoteConfigParam;

    .line 22
    move-result-object v3

    .line 23
    .line 24
    .line 25
    invoke-virtual {v3}, Lcom/kubi/config/kcrc/KCRemoteConfigParam;->getForegroundThrottle()J

    .line 26
    move-result-wide v3

    .line 27
    .line 28
    const/16 v5, 0x3e8

    .line 29
    int-to-long v5, v5

    .line 30
    mul-long/2addr v3, v5

    .line 31
    .line 32
    cmp-long v3, v1, v3

    .line 33
    .line 34
    if-gez v3, :cond_1

    .line 35
    .line 36
    new-instance p1, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 40
    .line 41
    const-string v0, "app onForeground>>> Throttle Limit. at "

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    const-string v0, " ms"

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    move-result-object p1

    .line 57
    .line 58
    .line 59
    invoke-static {p1}, Lcom/kubi/config/kcrc/l;->d(Ljava/lang/String;)V

    .line 60
    return-void

    .line 61
    .line 62
    .line 63
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 64
    move-result-wide v1

    .line 65
    .line 66
    .line 67
    invoke-static {v1, v2}, Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;->v(J)V

    .line 68
    .line 69
    const-string v1, "app onForeground>>> lanchPoll."

    .line 70
    .line 71
    .line 72
    invoke-static {v1}, Lcom/kubi/config/kcrc/l;->d(Ljava/lang/String;)V

    .line 73
    const/4 v1, 0x2

    .line 74
    const/4 v2, 0x0

    .line 75
    const/4 v3, 0x1

    .line 76
    const/4 v4, 0x0

    .line 77
    .line 78
    .line 79
    invoke-static {p1, v3, v4, v1, v2}, Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;->T(Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;ZZILjava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    invoke-static {p1}, Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;->p(Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;)Lcom/kubi/config/kcrc/KCRemoteConfigWS;

    .line 83
    move-result-object p1

    .line 84
    .line 85
    sget-object v1, Lcom/kubi/config/kcrc/KCRemoteConfigFetcher$onAppStatusChangedListener$1$onForeground$1;->INSTANCE:Lcom/kubi/config/kcrc/KCRemoteConfigFetcher$onAppStatusChangedListener$1$onForeground$1;

    .line 86
    .line 87
    sget-object v2, Lcom/kubi/config/kcrc/KCRemoteConfigFetcher$onAppStatusChangedListener$1$onForeground$2;->INSTANCE:Lcom/kubi/config/kcrc/KCRemoteConfigFetcher$onAppStatusChangedListener$1$onForeground$2;

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1, v0, v1, v2}, Lcom/kubi/config/kcrc/KCRemoteConfigWS;->i(Lcom/kubi/config/Config;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V

    .line 91
    return-void
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
