.class public final Lio/trtc/tuikit/atomicxcore/impl/live/l1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/flow/f;


# instance fields
.field public final synthetic a:Lio/trtc/tuikit/atomicxcore/impl/live/n1;

.field public final synthetic b:Lio/trtc/tuikit/atomicxcore/impl/login/h;


# direct methods
.method public constructor <init>(Lio/trtc/tuikit/atomicxcore/impl/live/n1;Lio/trtc/tuikit/atomicxcore/impl/login/h;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/l1;->a:Lio/trtc/tuikit/atomicxcore/impl/live/n1;

    .line 3
    .line 4
    iput-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/live/l1;->b:Lio/trtc/tuikit/atomicxcore/impl/login/h;

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
    .locals 10

    .line 1
    .line 2
    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/login/LoginStatus;

    .line 3
    .line 4
    iget-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/live/l1;->a:Lio/trtc/tuikit/atomicxcore/impl/live/n1;

    .line 5
    .line 6
    iget-object p2, p2, Lio/trtc/tuikit/atomicxcore/impl/live/n1;->a:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 7
    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string v1, "Listener: loginStatus changed to "

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    const-string v1, "message"

    .line 23
    .line 24
    .line 25
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    const/4 v2, 0x0

    .line 27
    .line 28
    .line 29
    invoke-virtual {p2, v2, v0}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 30
    .line 31
    sget-object p2, Lio/trtc/tuikit/atomicxcore/impl/live/k1;->a:[I

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 35
    move-result p1

    .line 36
    .line 37
    aget p1, p2, p1

    .line 38
    const/4 p2, 0x0

    .line 39
    const/4 v0, 0x1

    .line 40
    .line 41
    if-eq p1, v0, :cond_1

    .line 42
    const/4 v3, 0x2

    .line 43
    .line 44
    if-eq p1, v3, :cond_0

    .line 45
    .line 46
    goto/16 :goto_0

    .line 47
    .line 48
    :cond_0
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/l1;->a:Lio/trtc/tuikit/atomicxcore/impl/live/n1;

    .line 49
    .line 50
    iget-object v3, p1, Lio/trtc/tuikit/atomicxcore/impl/live/n1;->c:Lio/trtc/tuikit/atomicxcore/impl/live/f1;

    .line 51
    .line 52
    if-eqz v3, :cond_3

    .line 53
    .line 54
    iget-object v3, p1, Lio/trtc/tuikit/atomicxcore/impl/live/n1;->a:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 55
    .line 56
    const-string v4, "API: logout room engine"

    .line 57
    .line 58
    .line 59
    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v3, v2, v4}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 63
    .line 64
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/common/c;

    .line 65
    .line 66
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/live/i1;

    .line 67
    .line 68
    .line 69
    invoke-direct {v2, p1}, Lio/trtc/tuikit/atomicxcore/impl/live/i1;-><init>(Lio/trtc/tuikit/atomicxcore/impl/live/n1;)V

    .line 70
    .line 71
    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/live/j1;

    .line 72
    .line 73
    .line 74
    invoke-direct {v3, p1}, Lio/trtc/tuikit/atomicxcore/impl/live/j1;-><init>(Lio/trtc/tuikit/atomicxcore/impl/live/n1;)V

    .line 75
    .line 76
    .line 77
    invoke-direct {v1, p2, v2, v3, v0}, Lio/trtc/tuikit/atomicxcore/impl/common/c;-><init>(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;I)V

    .line 78
    .line 79
    .line 80
    invoke-static {v1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->logout(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 81
    .line 82
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/l1;->a:Lio/trtc/tuikit/atomicxcore/impl/live/n1;

    .line 83
    .line 84
    iput-object p2, p1, Lio/trtc/tuikit/atomicxcore/impl/live/n1;->c:Lio/trtc/tuikit/atomicxcore/impl/live/f1;

    .line 85
    goto :goto_0

    .line 86
    .line 87
    :cond_1
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/l1;->a:Lio/trtc/tuikit/atomicxcore/impl/live/n1;

    .line 88
    .line 89
    iget-object p1, p1, Lio/trtc/tuikit/atomicxcore/impl/live/n1;->c:Lio/trtc/tuikit/atomicxcore/impl/live/f1;

    .line 90
    .line 91
    iget-object v3, p0, Lio/trtc/tuikit/atomicxcore/impl/live/l1;->b:Lio/trtc/tuikit/atomicxcore/impl/login/h;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;->getSdkAppID()I

    .line 95
    move-result v6

    .line 96
    .line 97
    iget-object v3, p0, Lio/trtc/tuikit/atomicxcore/impl/live/l1;->b:Lio/trtc/tuikit/atomicxcore/impl/login/h;

    .line 98
    .line 99
    iget-object v7, v3, Lio/trtc/tuikit/atomicxcore/impl/login/h;->f:Ljava/lang/String;

    .line 100
    .line 101
    iget-object v8, v3, Lio/trtc/tuikit/atomicxcore/impl/login/h;->g:Ljava/lang/String;

    .line 102
    .line 103
    iget-object v9, v3, Lio/trtc/tuikit/atomicxcore/impl/login/h;->h:Landroid/content/Context;

    .line 104
    .line 105
    if-eqz p1, :cond_2

    .line 106
    .line 107
    iget v3, p1, Lio/trtc/tuikit/atomicxcore/impl/live/f1;->a:I

    .line 108
    .line 109
    if-ne v3, v6, :cond_2

    .line 110
    .line 111
    iget-object v3, p1, Lio/trtc/tuikit/atomicxcore/impl/live/f1;->b:Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    invoke-static {v3, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 115
    move-result v3

    .line 116
    .line 117
    if-eqz v3, :cond_2

    .line 118
    .line 119
    iget-object p1, p1, Lio/trtc/tuikit/atomicxcore/impl/live/f1;->c:Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    invoke-static {p1, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 123
    move-result p1

    .line 124
    .line 125
    if-nez p1, :cond_3

    .line 126
    .line 127
    :cond_2
    iget-object v5, p0, Lio/trtc/tuikit/atomicxcore/impl/live/l1;->a:Lio/trtc/tuikit/atomicxcore/impl/live/n1;

    .line 128
    .line 129
    iget-object p1, v5, Lio/trtc/tuikit/atomicxcore/impl/live/n1;->a:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 130
    .line 131
    new-instance v3, Ljava/lang/StringBuilder;

    .line 132
    .line 133
    const-string v4, "API: login room engine with userId="

    .line 134
    .line 135
    .line 136
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 143
    move-result-object v3

    .line 144
    .line 145
    .line 146
    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {p1, v2, v3}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 150
    .line 151
    new-instance p1, Lio/trtc/tuikit/atomicxcore/impl/common/c;

    .line 152
    .line 153
    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/live/g1;

    .line 154
    .line 155
    .line 156
    invoke-direct/range {v4 .. v9}, Lio/trtc/tuikit/atomicxcore/impl/live/g1;-><init>(Lio/trtc/tuikit/atomicxcore/impl/live/n1;ILjava/lang/String;Ljava/lang/String;Landroid/content/Context;)V

    .line 157
    .line 158
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/h1;

    .line 159
    .line 160
    .line 161
    invoke-direct {v1, v5}, Lio/trtc/tuikit/atomicxcore/impl/live/h1;-><init>(Lio/trtc/tuikit/atomicxcore/impl/live/n1;)V

    .line 162
    .line 163
    .line 164
    invoke-direct {p1, p2, v4, v1, v0}, Lio/trtc/tuikit/atomicxcore/impl/common/c;-><init>(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;I)V

    .line 165
    .line 166
    .line 167
    invoke-static {v9, v6, v7, v8, p1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->login(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 168
    .line 169
    :cond_3
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 170
    return-object p1
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
