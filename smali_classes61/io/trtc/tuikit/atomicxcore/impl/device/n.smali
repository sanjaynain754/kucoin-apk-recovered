.class public final Lio/trtc/tuikit/atomicxcore/impl/device/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Callback;


# instance fields
.field public final synthetic a:Lio/trtc/tuikit/atomicxcore/impl/device/r;

.field public final synthetic b:Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;


# direct methods
.method public constructor <init>(Lio/trtc/tuikit/atomicxcore/impl/device/r;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/device/n;->a:Lio/trtc/tuikit/atomicxcore/impl/device/r;

    .line 3
    .line 4
    iput-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/device/n;->b:Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;

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
.method public final onError(ILjava/lang/String;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/n;->a:Lio/trtc/tuikit/atomicxcore/impl/device/r;

    .line 3
    .line 4
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->n:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 5
    .line 6
    new-instance v1, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    const-string v2, "Response: callEngine openMicrophone failed code="

    .line 9
    .line 10
    .line 11
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v2, ", message="

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    const-string v2, "message"

    .line 32
    .line 33
    .line 34
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    const/4 v2, 0x2

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 39
    .line 40
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/n;->a:Lio/trtc/tuikit/atomicxcore/impl/device/r;

    .line 41
    .line 42
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->a:Lkotlinx/coroutines/flow/n;

    .line 43
    .line 44
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;->OFF:Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;

    .line 45
    .line 46
    .line 47
    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 48
    .line 49
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/n;->a:Lio/trtc/tuikit/atomicxcore/impl/device/r;

    .line 50
    .line 51
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->b:Lkotlinx/coroutines/flow/n;

    .line 52
    .line 53
    .line 54
    invoke-static {p1}, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->fromInt(I)Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;

    .line 55
    move-result-object v1

    .line 56
    .line 57
    const-string v2, "fromInt(...)"

    .line 58
    .line 59
    .line 60
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-static {v1}, Lio/trtc/tuikit/atomicxcore/impl/device/i;->a(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;)Lio/trtc/tuikit/atomicxcore/api/device/DeviceError;

    .line 64
    move-result-object v1

    .line 65
    .line 66
    .line 67
    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 68
    .line 69
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/n;->b:Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;

    .line 70
    .line 71
    if-eqz v0, :cond_1

    .line 72
    .line 73
    if-nez p2, :cond_0

    .line 74
    .line 75
    const-string p2, ""

    .line 76
    .line 77
    .line 78
    :cond_0
    invoke-interface {v0, p1, p2}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 79
    :cond_1
    return-void
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

.method public final onSuccess()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/n;->a:Lio/trtc/tuikit/atomicxcore/impl/device/r;

    .line 3
    .line 4
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->n:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 5
    .line 6
    const-string v1, "message"

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    const-string v3, "Response: callEngine openMicrophone success"

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v3, v1, v2, v3}, Lio/trtc/tuikit/atomicxcore/impl/barrage/b;->a(Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    .line 13
    .line 14
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/n;->a:Lio/trtc/tuikit/atomicxcore/impl/device/r;

    .line 15
    .line 16
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->a:Lkotlinx/coroutines/flow/n;

    .line 17
    .line 18
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;->ON:Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;

    .line 19
    .line 20
    .line 21
    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 22
    .line 23
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/n;->a:Lio/trtc/tuikit/atomicxcore/impl/device/r;

    .line 24
    .line 25
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->b:Lkotlinx/coroutines/flow/n;

    .line 26
    .line 27
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/device/DeviceError;->NO_ERROR:Lio/trtc/tuikit/atomicxcore/api/device/DeviceError;

    .line 28
    .line 29
    .line 30
    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 31
    .line 32
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/n;->b:Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;

    .line 33
    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    .line 37
    invoke-interface {v0}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onSuccess()V

    .line 38
    :cond_0
    return-void
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
.end method
