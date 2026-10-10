.class public final Lcom/kubi/config/kcrc/k$a;
.super Ljava/lang/Object;
.source "KCRemoteConfigUtils.kt"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/config/kcrc/k;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "",
        "run",
        "()V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/config/kcrc/k$a;->b:Ljava/lang/String;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/kubi/config/kcrc/k$a;->c:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p3, p0, Lcom/kubi/config/kcrc/k$a;->d:Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    return-void
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
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    .line 2
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    const-string v1, "getConfig:["

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    iget-object v1, p0, Lcom/kubi/config/kcrc/k$a;->b:Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v1, "], "

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    iget-object v1, p0, Lcom/kubi/config/kcrc/k$a;->c:Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    const/16 v1, 0x3a

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    iget-object v1, p0, Lcom/kubi/config/kcrc/k$a;->d:Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    move-result-object v0

    .line 40
    .line 41
    .line 42
    invoke-static {v0}, Lcom/kubi/config/kcrc/l;->a(Ljava/lang/String;)V

    .line 43
    .line 44
    const-string v0, "kc_remote_config"

    .line 45
    .line 46
    sget-object v1, Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;->b:Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder$Companion;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder$Companion;->acquire()Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;

    .line 50
    move-result-object v1

    .line 51
    .line 52
    const-string v2, "category"

    .line 53
    .line 54
    const-string v3, "get_config"

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1, v2, v3}, Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    .line 59
    const-string v2, "method"

    .line 60
    .line 61
    iget-object v3, p0, Lcom/kubi/config/kcrc/k$a;->b:Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1, v2, v3}, Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    .line 66
    const-string v2, "biz"

    .line 67
    .line 68
    iget-object v3, p0, Lcom/kubi/config/kcrc/k$a;->c:Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1, v2, v3}, Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-static {v0, v1}, Lcom/kubi/monitor/TechnologyEvent;->d(Ljava/lang/String;Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 75
    return-void

    .line 76
    :catch_0
    move-exception v0

    .line 77
    .line 78
    sget-object v1, Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;->a:Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1}, Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;->H()Lcom/kubi/config/Config;

    .line 82
    move-result-object v1

    .line 83
    .line 84
    if-eqz v1, :cond_0

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1}, Lcom/kubi/config/Config;->c()Lkotlin/jvm/functions/Function1;

    .line 88
    move-result-object v1

    .line 89
    .line 90
    if-eqz v1, :cond_0

    .line 91
    .line 92
    .line 93
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    :cond_0
    return-void
    .line 95
.end method
