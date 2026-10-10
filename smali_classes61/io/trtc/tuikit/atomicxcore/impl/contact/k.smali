.class public final Lio/trtc/tuikit/atomicxcore/impl/contact/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/imsdk/v2/V2TIMValueCallback;


# instance fields
.field public final synthetic a:Lio/trtc/tuikit/atomicxcore/impl/contact/s;


# direct methods
.method public constructor <init>(Lio/trtc/tuikit/atomicxcore/impl/contact/s;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/k;->a:Lio/trtc/tuikit/atomicxcore/impl/contact/s;

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
.method public final onError(ILjava/lang/String;)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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

.method public final onSuccess(Ljava/lang/Object;)V
    .locals 3

    .line 1
    .line 2
    check-cast p1, Ljava/util/List;

    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 8
    move-result-object p1

    .line 9
    .line 10
    check-cast p1, Lcom/tencent/imsdk/v2/V2TIMReceiveMessageOptInfo;

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    .line 14
    :goto_0
    if-eqz p1, :cond_2

    .line 15
    .line 16
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/k;->a:Lio/trtc/tuikit/atomicxcore/impl/contact/s;

    .line 17
    .line 18
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/contact/s;->g:Lkotlinx/coroutines/flow/n;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/tencent/imsdk/v2/V2TIMReceiveMessageOptInfo;->getC2CReceiveMessageOpt()I

    .line 22
    move-result v1

    .line 23
    const/4 v2, 0x2

    .line 24
    .line 25
    if-ne v1, v2, :cond_1

    .line 26
    const/4 v1, 0x1

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    const/4 v1, 0x0

    .line 29
    .line 30
    .line 31
    :goto_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 32
    move-result-object v1

    .line 33
    .line 34
    .line 35
    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 36
    .line 37
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/k;->a:Lio/trtc/tuikit/atomicxcore/impl/contact/s;

    .line 38
    .line 39
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/contact/s;->k:Lkotlinx/coroutines/flow/n;

    .line 40
    .line 41
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/contact/ReceiveMessageOpt;->Companion:Lio/trtc/tuikit/atomicxcore/api/contact/ReceiveMessageOpt$Companion;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Lcom/tencent/imsdk/v2/V2TIMReceiveMessageOptInfo;->getC2CReceiveMessageOpt()I

    .line 45
    move-result p1

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, p1}, Lio/trtc/tuikit/atomicxcore/api/contact/ReceiveMessageOpt$Companion;->parse(I)Lio/trtc/tuikit/atomicxcore/api/contact/ReceiveMessageOpt;

    .line 49
    move-result-object p1

    .line 50
    .line 51
    .line 52
    invoke-interface {v0, p1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 53
    :cond_2
    return-void
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
