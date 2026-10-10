.class public final Ljumio/liveness/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jumio/liveness/DaClient2$EventHandler;


# instance fields
.field public final a:Ljumio/liveness/e;

.field public final b:Ljumio/liveness/f;

.field public c:Ljumio/liveness/q;


# direct methods
.method public constructor <init>(Ljumio/liveness/e;Ljumio/liveness/f;)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "forwardToLivenessUx"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "handleEvent"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    iput-object p1, p0, Ljumio/liveness/d;->a:Ljumio/liveness/e;

    .line 16
    .line 17
    iput-object p2, p0, Ljumio/liveness/d;->b:Ljumio/liveness/f;

    .line 18
    return-void
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
.end method


# virtual methods
.method public final onEventForForwarding(J)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Ljumio/liveness/d;->a:Ljumio/liveness/e;

    .line 3
    .line 4
    .line 5
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ljumio/liveness/e;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

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
.end method

.method public final onResponse(Lcom/jumio/liveness/DaClient2$EventView;)V
    .locals 4

    .line 1
    .line 2
    const-string v0, "eventView"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/jumio/liveness/DaClient2$EventView;->copy()Lcom/jumio/liveness/DaClient2$Event;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    sget-object v0, Lcom/jumio/commons/log/Log;->INSTANCE:Lcom/jumio/commons/log/Log;

    .line 12
    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v2, "onResponse: "

    .line 16
    .line 17
    .line 18
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    move-result-object v1

    .line 26
    .line 27
    sget-object v2, Lcom/jumio/commons/log/LogLevel;->DEBUG:Lcom/jumio/commons/log/LogLevel;

    .line 28
    .line 29
    const-string v3, "DefaultDaClient"

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1, v3, v2}, Lcom/jumio/commons/log/Log;->logThreadInfoWithMessage(Ljava/lang/String;Ljava/lang/String;Lcom/jumio/commons/log/LogLevel;)V

    .line 33
    .line 34
    iget-object v0, p0, Ljumio/liveness/d;->b:Ljumio/liveness/f;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, p1}, Ljumio/liveness/f;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    iget-object v0, p0, Ljumio/liveness/d;->c:Ljumio/liveness/q;

    .line 40
    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, p1}, Ljumio/liveness/q;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    :cond_0
    return-void
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
.end method
