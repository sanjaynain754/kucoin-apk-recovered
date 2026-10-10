.class public final Lio/trtc/tuikit/atomicxcore/impl/call/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lio/trtc/tuikit/atomicxcore/impl/call/w;


# direct methods
.method public constructor <init>(Lio/trtc/tuikit/atomicxcore/impl/call/w;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/call/u;->a:Lio/trtc/tuikit/atomicxcore/impl/call/w;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    return-void
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
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method


# virtual methods
.method public final run()V
    .locals 17

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/call/u;->a:Lio/trtc/tuikit/atomicxcore/impl/call/w;

    .line 5
    .line 6
    iget-object v1, v1, Lio/trtc/tuikit/atomicxcore/impl/call/w;->d:Lkotlinx/coroutines/flow/n;

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-interface {v1}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 10
    move-result-object v2

    .line 11
    move-object v3, v2

    .line 12
    .line 13
    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/call/CallInfo;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/call/CallInfo;->getDuration()J

    .line 17
    move-result-wide v4

    .line 18
    .line 19
    const-wide/16 v6, 0x1

    .line 20
    .line 21
    add-long v13, v4, v6

    .line 22
    .line 23
    const/16 v15, 0xff

    .line 24
    .line 25
    const/16 v16, 0x0

    .line 26
    const/4 v4, 0x0

    .line 27
    const/4 v5, 0x0

    .line 28
    const/4 v6, 0x0

    .line 29
    const/4 v7, 0x0

    .line 30
    const/4 v8, 0x0

    .line 31
    const/4 v9, 0x0

    .line 32
    const/4 v10, 0x0

    .line 33
    .line 34
    const-wide/16 v11, 0x0

    .line 35
    .line 36
    .line 37
    invoke-static/range {v3 .. v16}, Lio/trtc/tuikit/atomicxcore/api/call/CallInfo;->copy$default(Lio/trtc/tuikit/atomicxcore/api/call/CallInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedHashSet;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/call/CallMediaType;Lio/trtc/tuikit/atomicxcore/api/call/CallDirection;JJILjava/lang/Object;)Lio/trtc/tuikit/atomicxcore/api/call/CallInfo;

    .line 38
    move-result-object v3

    .line 39
    .line 40
    .line 41
    invoke-interface {v1, v2, v3}, Lkotlinx/coroutines/flow/n;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    move-result v2

    .line 43
    .line 44
    if-eqz v2, :cond_0

    .line 45
    .line 46
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/call/u;->a:Lio/trtc/tuikit/atomicxcore/impl/call/w;

    .line 47
    .line 48
    iget-object v1, v1, Lio/trtc/tuikit/atomicxcore/impl/call/w;->c:Landroid/os/Handler;

    .line 49
    .line 50
    if-eqz v1, :cond_1

    .line 51
    .line 52
    const-wide/16 v2, 0x3e8

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 56
    :cond_1
    return-void
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
.end method
