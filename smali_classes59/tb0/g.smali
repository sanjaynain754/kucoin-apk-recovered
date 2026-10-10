.class public final Ltb0/g;
.super Ltb0/b;
.source "PanGestureHandlerEventDataBuilder.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ltb0/b<",
        "Lcom/swmansion/gesturehandler/core/PanGestureHandler;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\rR\u0014\u0010\u0014\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\rR\u0014\u0010\u0016\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\rR\u0014\u0010\u0018\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\rR\u0014\u0010\u001a\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\rR\u0014\u0010\u001c\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\rR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001f\u00a8\u0006!"
    }
    d2 = {
        "Ltb0/g;",
        "Ltb0/b;",
        "Lcom/swmansion/gesturehandler/core/PanGestureHandler;",
        "handler",
        "<init>",
        "(Lcom/swmansion/gesturehandler/core/PanGestureHandler;)V",
        "Lcom/facebook/react/bridge/WritableMap;",
        "eventData",
        "",
        "a",
        "(Lcom/facebook/react/bridge/WritableMap;)V",
        "",
        "e",
        "F",
        "x",
        "f",
        "y",
        "g",
        "absoluteX",
        "h",
        "absoluteY",
        "i",
        "translationX",
        "j",
        "translationY",
        "k",
        "velocityX",
        "l",
        "velocityY",
        "Lcom/swmansion/gesturehandler/core/StylusData;",
        "m",
        "Lcom/swmansion/gesturehandler/core/StylusData;",
        "stylusData",
        "react-native-gesture-handler_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final e:F

.field public final f:F

.field public final g:F

.field public final h:F

.field public final i:F

.field public final j:F

.field public final k:F

.field public final l:F

.field public final m:Lcom/swmansion/gesturehandler/core/StylusData;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/swmansion/gesturehandler/core/PanGestureHandler;)V
    .locals 1
    .param p1    # Lcom/swmansion/gesturehandler/core/PanGestureHandler;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "handler"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p1}, Ltb0/b;-><init>(Lcom/swmansion/gesturehandler/core/GestureHandler;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/swmansion/gesturehandler/core/GestureHandler;->J()F

    .line 12
    move-result v0

    .line 13
    .line 14
    iput v0, p0, Ltb0/g;->e:F

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/swmansion/gesturehandler/core/GestureHandler;->K()F

    .line 18
    move-result v0

    .line 19
    .line 20
    iput v0, p0, Ltb0/g;->f:F

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/swmansion/gesturehandler/core/GestureHandler;->H()F

    .line 24
    move-result v0

    .line 25
    .line 26
    iput v0, p0, Ltb0/g;->g:F

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/swmansion/gesturehandler/core/GestureHandler;->I()F

    .line 30
    move-result v0

    .line 31
    .line 32
    iput v0, p0, Ltb0/g;->h:F

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Lcom/swmansion/gesturehandler/core/PanGestureHandler;->V0()F

    .line 36
    move-result v0

    .line 37
    .line 38
    iput v0, p0, Ltb0/g;->i:F

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Lcom/swmansion/gesturehandler/core/PanGestureHandler;->W0()F

    .line 42
    move-result v0

    .line 43
    .line 44
    iput v0, p0, Ltb0/g;->j:F

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Lcom/swmansion/gesturehandler/core/PanGestureHandler;->X0()F

    .line 48
    move-result v0

    .line 49
    .line 50
    iput v0, p0, Ltb0/g;->k:F

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Lcom/swmansion/gesturehandler/core/PanGestureHandler;->Y0()F

    .line 54
    move-result v0

    .line 55
    .line 56
    iput v0, p0, Ltb0/g;->l:F

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1}, Lcom/swmansion/gesturehandler/core/PanGestureHandler;->U0()Lcom/swmansion/gesturehandler/core/StylusData;

    .line 60
    move-result-object p1

    .line 61
    .line 62
    iput-object p1, p0, Ltb0/g;->m:Lcom/swmansion/gesturehandler/core/StylusData;

    .line 63
    return-void
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
.end method


# virtual methods
.method public a(Lcom/facebook/react/bridge/WritableMap;)V
    .locals 4
    .param p1    # Lcom/facebook/react/bridge/WritableMap;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "eventData"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-super {p0, p1}, Ltb0/b;->a(Lcom/facebook/react/bridge/WritableMap;)V

    .line 9
    .line 10
    iget v0, p0, Ltb0/g;->e:F

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 14
    move-result v0

    .line 15
    float-to-double v0, v0

    .line 16
    .line 17
    .line 18
    const-string/jumbo v2, "x"

    .line 19
    .line 20
    .line 21
    invoke-interface {p1, v2, v0, v1}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 22
    .line 23
    iget v0, p0, Ltb0/g;->f:F

    .line 24
    .line 25
    .line 26
    invoke-static {v0}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 27
    move-result v0

    .line 28
    float-to-double v0, v0

    .line 29
    .line 30
    .line 31
    const-string/jumbo v2, "y"

    .line 32
    .line 33
    .line 34
    invoke-interface {p1, v2, v0, v1}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 35
    .line 36
    iget v0, p0, Ltb0/g;->g:F

    .line 37
    .line 38
    .line 39
    invoke-static {v0}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 40
    move-result v0

    .line 41
    float-to-double v0, v0

    .line 42
    .line 43
    const-string v2, "absoluteX"

    .line 44
    .line 45
    .line 46
    invoke-interface {p1, v2, v0, v1}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 47
    .line 48
    iget v0, p0, Ltb0/g;->h:F

    .line 49
    .line 50
    .line 51
    invoke-static {v0}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 52
    move-result v0

    .line 53
    float-to-double v0, v0

    .line 54
    .line 55
    const-string v2, "absoluteY"

    .line 56
    .line 57
    .line 58
    invoke-interface {p1, v2, v0, v1}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 59
    .line 60
    iget v0, p0, Ltb0/g;->i:F

    .line 61
    .line 62
    .line 63
    invoke-static {v0}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 64
    move-result v0

    .line 65
    float-to-double v0, v0

    .line 66
    .line 67
    .line 68
    const-string/jumbo v2, "translationX"

    .line 69
    .line 70
    .line 71
    invoke-interface {p1, v2, v0, v1}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 72
    .line 73
    iget v0, p0, Ltb0/g;->j:F

    .line 74
    .line 75
    .line 76
    invoke-static {v0}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 77
    move-result v0

    .line 78
    float-to-double v0, v0

    .line 79
    .line 80
    .line 81
    const-string/jumbo v2, "translationY"

    .line 82
    .line 83
    .line 84
    invoke-interface {p1, v2, v0, v1}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 85
    .line 86
    iget v0, p0, Ltb0/g;->k:F

    .line 87
    .line 88
    .line 89
    invoke-static {v0}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 90
    move-result v0

    .line 91
    float-to-double v0, v0

    .line 92
    .line 93
    .line 94
    const-string/jumbo v2, "velocityX"

    .line 95
    .line 96
    .line 97
    invoke-interface {p1, v2, v0, v1}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 98
    .line 99
    iget v0, p0, Ltb0/g;->l:F

    .line 100
    .line 101
    .line 102
    invoke-static {v0}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 103
    move-result v0

    .line 104
    float-to-double v0, v0

    .line 105
    .line 106
    .line 107
    const-string/jumbo v2, "velocityY"

    .line 108
    .line 109
    .line 110
    invoke-interface {p1, v2, v0, v1}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 111
    .line 112
    iget-object v0, p0, Ltb0/g;->m:Lcom/swmansion/gesturehandler/core/StylusData;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0}, Lcom/swmansion/gesturehandler/core/StylusData;->a()D

    .line 116
    move-result-wide v0

    .line 117
    .line 118
    const-wide/high16 v2, -0x4010000000000000L    # -1.0

    .line 119
    .line 120
    cmpg-double v0, v0, v2

    .line 121
    .line 122
    if-nez v0, :cond_0

    .line 123
    return-void

    .line 124
    .line 125
    :cond_0
    iget-object v0, p0, Ltb0/g;->m:Lcom/swmansion/gesturehandler/core/StylusData;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0}, Lcom/swmansion/gesturehandler/core/StylusData;->b()Lcom/facebook/react/bridge/ReadableMap;

    .line 129
    move-result-object v0

    .line 130
    .line 131
    .line 132
    const-string/jumbo v1, "stylusData"

    .line 133
    .line 134
    .line 135
    invoke-interface {p1, v1, v0}, Lcom/facebook/react/bridge/WritableMap;->putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 136
    return-void
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
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
.end method
