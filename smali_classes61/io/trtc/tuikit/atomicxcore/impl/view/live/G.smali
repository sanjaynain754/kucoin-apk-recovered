.class public final Lio/trtc/tuikit/atomicxcore/impl/view/live/G;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/flow/f;


# instance fields
.field public final synthetic a:Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

.field public final synthetic b:Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;


# direct methods
.method public constructor <init>(Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/G;->a:Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    .line 3
    .line 4
    iput-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/G;->b:Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;

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
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3

    .line 1
    .line 2
    check-cast p1, Ljava/util/List;

    .line 3
    .line 4
    iget-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/G;->a:Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;->getLiveSeatState()Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatState;

    .line 8
    move-result-object p2

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatState;->getCanvas()Lkotlinx/coroutines/flow/w;

    .line 12
    move-result-object p2

    .line 13
    .line 14
    .line 15
    invoke-interface {p2}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 16
    move-result-object p2

    .line 17
    .line 18
    check-cast p2, Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;

    .line 19
    .line 20
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/live/o1;

    .line 21
    .line 22
    .line 23
    invoke-direct {v0, p2, p1}, Lio/trtc/tuikit/atomicxcore/impl/live/o1;-><init>(Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;Ljava/util/List;)V

    .line 24
    .line 25
    iget-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/G;->b:Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLogger$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 29
    move-result-object p2

    .line 30
    .line 31
    new-instance v1, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    const-string v2, "oid:"

    .line 34
    .line 35
    .line 36
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/G;->b:Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getOid$atomicxcore_release()I

    .line 42
    move-result v2

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    const-string v2, ", onSeatListChanged-Core currentSeatLayout:"

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    const-string v2, ",lastSeatLayout:"

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/G;->b:Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLastSeatLayout$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/live/o1;

    .line 64
    move-result-object v2

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    move-result-object v1

    .line 72
    .line 73
    .line 74
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    const-string v2, "message"

    .line 77
    .line 78
    .line 79
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    const/4 v2, 0x0

    .line 81
    .line 82
    .line 83
    invoke-virtual {p2, v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 87
    move-result p1

    .line 88
    .line 89
    if-nez p1, :cond_0

    .line 90
    .line 91
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/G;->b:Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;

    .line 92
    .line 93
    .line 94
    invoke-static {p1, v0}, Lio/trtc/tuikit/atomicxcore/impl/view/live/N;->a(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;Lio/trtc/tuikit/atomicxcore/impl/live/o1;)V

    .line 95
    .line 96
    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 97
    return-object p1
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
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
.end method
