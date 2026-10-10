.class public final Lio/trtc/tuikit/atomicxcore/impl/live/x0;
.super Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$Observer;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lio/trtc/tuikit/atomicxcore/impl/live/N0;


# direct methods
.method public constructor <init>(Lio/trtc/tuikit/atomicxcore/impl/live/N0;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/x0;->a:Lio/trtc/tuikit/atomicxcore/impl/live/N0;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$Observer;-><init>()V

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
.method public final onLiveInfoChanged(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;Ljava/util/List;)V
    .locals 6

    .line 1
    .line 2
    const-string v0, "liveInfo"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "modifyFlagList"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/x0;->a:Lio/trtc/tuikit/atomicxcore/impl/live/N0;

    .line 13
    .line 14
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->d:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 15
    .line 16
    new-instance v1, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    const-string v2, "onLiveInfoChanged: "

    .line 19
    .line 20
    .line 21
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    const-string v2, ", "

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    move-result-object v1

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    const-string v2, "message"

    .line 42
    .line 43
    .line 44
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    const/4 v2, 0x0

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 49
    .line 50
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/x0;->a:Lio/trtc/tuikit/atomicxcore/impl/live/N0;

    .line 51
    .line 52
    .line 53
    invoke-static {p1}, Lio/trtc/tuikit/atomicxcore/impl/live/u0;->a(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;)Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    .line 54
    move-result-object p1

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveID()Ljava/lang/String;

    .line 61
    move-result-object v1

    .line 62
    .line 63
    iget-object v3, v0, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->c:Lkotlinx/coroutines/flow/n;

    .line 64
    .line 65
    .line 66
    invoke-interface {v3}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 67
    move-result-object v3

    .line 68
    .line 69
    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveID()Ljava/lang/String;

    .line 73
    move-result-object v3

    .line 74
    .line 75
    .line 76
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 77
    move-result v1

    .line 78
    .line 79
    if-eqz v1, :cond_1

    .line 80
    .line 81
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->c:Lkotlinx/coroutines/flow/n;

    .line 82
    .line 83
    .line 84
    :cond_0
    invoke-interface {v1}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 85
    move-result-object v3

    .line 86
    move-object v4, v3

    .line 87
    .line 88
    check-cast v4, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    .line 89
    .line 90
    .line 91
    invoke-static {v4, p1, p2}, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->a(Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;Ljava/util/List;)Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    .line 92
    move-result-object v4

    .line 93
    .line 94
    .line 95
    invoke-interface {v1, v3, v4}, Lkotlinx/coroutines/flow/n;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 96
    move-result v3

    .line 97
    .line 98
    if-eqz v3, :cond_0

    .line 99
    .line 100
    :cond_1
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->a:Lkotlinx/coroutines/flow/n;

    .line 101
    .line 102
    .line 103
    invoke-interface {v1}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 104
    move-result-object v1

    .line 105
    .line 106
    check-cast v1, Ljava/util/List;

    .line 107
    .line 108
    .line 109
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 110
    move-result-object v1

    .line 111
    .line 112
    .line 113
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 114
    move-result v3

    .line 115
    const/4 v4, -0x1

    .line 116
    .line 117
    if-eqz v3, :cond_3

    .line 118
    .line 119
    .line 120
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 121
    move-result-object v3

    .line 122
    .line 123
    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveID()Ljava/lang/String;

    .line 127
    move-result-object v3

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveID()Ljava/lang/String;

    .line 131
    move-result-object v5

    .line 132
    .line 133
    .line 134
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 135
    move-result v3

    .line 136
    .line 137
    if-eqz v3, :cond_2

    .line 138
    goto :goto_1

    .line 139
    .line 140
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 141
    goto :goto_0

    .line 142
    :cond_3
    move v2, v4

    .line 143
    .line 144
    :goto_1
    if-ne v2, v4, :cond_4

    .line 145
    return-void

    .line 146
    .line 147
    :cond_4
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->a:Lkotlinx/coroutines/flow/n;

    .line 148
    .line 149
    .line 150
    invoke-interface {v1}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 151
    move-result-object v1

    .line 152
    .line 153
    check-cast v1, Ljava/util/Collection;

    .line 154
    .line 155
    .line 156
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    .line 157
    move-result-object v1

    .line 158
    .line 159
    iget-object v3, v0, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->a:Lkotlinx/coroutines/flow/n;

    .line 160
    .line 161
    .line 162
    invoke-interface {v3}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 163
    move-result-object v3

    .line 164
    .line 165
    check-cast v3, Ljava/util/List;

    .line 166
    .line 167
    .line 168
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 169
    move-result-object v3

    .line 170
    .line 171
    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    .line 172
    .line 173
    .line 174
    invoke-static {v3, p1, p2}, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->a(Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;Ljava/util/List;)Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    .line 175
    move-result-object p1

    .line 176
    .line 177
    .line 178
    invoke-interface {v1, v2, p1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 179
    .line 180
    iget-object p1, v0, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->a:Lkotlinx/coroutines/flow/n;

    .line 181
    .line 182
    .line 183
    invoke-interface {p1, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 184
    return-void
    .line 185
    .line 186
.end method
