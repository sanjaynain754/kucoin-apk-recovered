.class final Lcom/facebook/react/uimanager/UIViewOperationQueue$FindTargetForTouchOperation;
.super Ljava/lang/Object;
.source "UIViewOperationQueue.java"

# interfaces
.implements Lcom/facebook/react/uimanager/UIViewOperationQueue$UIOperation;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/uimanager/UIViewOperationQueue;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "FindTargetForTouchOperation"
.end annotation


# instance fields
.field private final mCallback:Lcom/facebook/react/bridge/Callback;

.field private final mReactTag:I

.field private final mTargetX:F

.field private final mTargetY:F

.field final synthetic this$0:Lcom/facebook/react/uimanager/UIViewOperationQueue;


# direct methods
.method private constructor <init>(Lcom/facebook/react/uimanager/UIViewOperationQueue;IFFLcom/facebook/react/bridge/Callback;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$FindTargetForTouchOperation;->this$0:Lcom/facebook/react/uimanager/UIViewOperationQueue;

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput p2, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$FindTargetForTouchOperation;->mReactTag:I

    .line 5
    iput p3, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$FindTargetForTouchOperation;->mTargetX:F

    .line 6
    iput p4, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$FindTargetForTouchOperation;->mTargetY:F

    .line 7
    iput-object p5, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$FindTargetForTouchOperation;->mCallback:Lcom/facebook/react/bridge/Callback;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/facebook/react/uimanager/UIViewOperationQueue;IFFLcom/facebook/react/bridge/Callback;Lcom/facebook/react/uimanager/k0;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lcom/facebook/react/uimanager/UIViewOperationQueue$FindTargetForTouchOperation;-><init>(Lcom/facebook/react/uimanager/UIViewOperationQueue;IFFLcom/facebook/react/bridge/Callback;)V

    return-void
.end method


# virtual methods
.method public execute()V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    :try_start_0
    iget-object v1, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$FindTargetForTouchOperation;->this$0:Lcom/facebook/react/uimanager/UIViewOperationQueue;

    .line 4
    .line 5
    .line 6
    invoke-static {v1}, Lcom/facebook/react/uimanager/UIViewOperationQueue;->d(Lcom/facebook/react/uimanager/UIViewOperationQueue;)Lcom/facebook/react/uimanager/NativeViewHierarchyManager;

    .line 7
    move-result-object v1

    .line 8
    .line 9
    iget v2, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$FindTargetForTouchOperation;->mReactTag:I

    .line 10
    .line 11
    iget-object v3, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$FindTargetForTouchOperation;->this$0:Lcom/facebook/react/uimanager/UIViewOperationQueue;

    .line 12
    .line 13
    .line 14
    invoke-static {v3}, Lcom/facebook/react/uimanager/UIViewOperationQueue;->c(Lcom/facebook/react/uimanager/UIViewOperationQueue;)[I

    .line 15
    move-result-object v3

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v2, v3}, Lcom/facebook/react/uimanager/NativeViewHierarchyManager;->measure(I[I)V
    :try_end_0
    .catch Lcom/facebook/react/uimanager/IllegalViewOperationException; {:try_start_0 .. :try_end_0} :catch_1

    .line 19
    .line 20
    iget-object v1, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$FindTargetForTouchOperation;->this$0:Lcom/facebook/react/uimanager/UIViewOperationQueue;

    .line 21
    .line 22
    .line 23
    invoke-static {v1}, Lcom/facebook/react/uimanager/UIViewOperationQueue;->c(Lcom/facebook/react/uimanager/UIViewOperationQueue;)[I

    .line 24
    move-result-object v1

    .line 25
    .line 26
    aget v1, v1, v0

    .line 27
    int-to-float v1, v1

    .line 28
    .line 29
    iget-object v2, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$FindTargetForTouchOperation;->this$0:Lcom/facebook/react/uimanager/UIViewOperationQueue;

    .line 30
    .line 31
    .line 32
    invoke-static {v2}, Lcom/facebook/react/uimanager/UIViewOperationQueue;->c(Lcom/facebook/react/uimanager/UIViewOperationQueue;)[I

    .line 33
    move-result-object v2

    .line 34
    const/4 v3, 0x1

    .line 35
    .line 36
    aget v2, v2, v3

    .line 37
    int-to-float v2, v2

    .line 38
    .line 39
    iget-object v4, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$FindTargetForTouchOperation;->this$0:Lcom/facebook/react/uimanager/UIViewOperationQueue;

    .line 40
    .line 41
    .line 42
    invoke-static {v4}, Lcom/facebook/react/uimanager/UIViewOperationQueue;->d(Lcom/facebook/react/uimanager/UIViewOperationQueue;)Lcom/facebook/react/uimanager/NativeViewHierarchyManager;

    .line 43
    move-result-object v4

    .line 44
    .line 45
    iget v5, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$FindTargetForTouchOperation;->mReactTag:I

    .line 46
    .line 47
    iget v6, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$FindTargetForTouchOperation;->mTargetX:F

    .line 48
    .line 49
    iget v7, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$FindTargetForTouchOperation;->mTargetY:F

    .line 50
    .line 51
    .line 52
    invoke-virtual {v4, v5, v6, v7}, Lcom/facebook/react/uimanager/NativeViewHierarchyManager;->findTargetTagForTouch(IFF)I

    .line 53
    move-result v4

    .line 54
    .line 55
    :try_start_1
    iget-object v5, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$FindTargetForTouchOperation;->this$0:Lcom/facebook/react/uimanager/UIViewOperationQueue;

    .line 56
    .line 57
    .line 58
    invoke-static {v5}, Lcom/facebook/react/uimanager/UIViewOperationQueue;->d(Lcom/facebook/react/uimanager/UIViewOperationQueue;)Lcom/facebook/react/uimanager/NativeViewHierarchyManager;

    .line 59
    move-result-object v5

    .line 60
    .line 61
    iget-object v6, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$FindTargetForTouchOperation;->this$0:Lcom/facebook/react/uimanager/UIViewOperationQueue;

    .line 62
    .line 63
    .line 64
    invoke-static {v6}, Lcom/facebook/react/uimanager/UIViewOperationQueue;->c(Lcom/facebook/react/uimanager/UIViewOperationQueue;)[I

    .line 65
    move-result-object v6

    .line 66
    .line 67
    .line 68
    invoke-virtual {v5, v4, v6}, Lcom/facebook/react/uimanager/NativeViewHierarchyManager;->measure(I[I)V
    :try_end_1
    .catch Lcom/facebook/react/uimanager/IllegalViewOperationException; {:try_start_1 .. :try_end_1} :catch_0

    .line 69
    .line 70
    iget-object v5, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$FindTargetForTouchOperation;->this$0:Lcom/facebook/react/uimanager/UIViewOperationQueue;

    .line 71
    .line 72
    .line 73
    invoke-static {v5}, Lcom/facebook/react/uimanager/UIViewOperationQueue;->c(Lcom/facebook/react/uimanager/UIViewOperationQueue;)[I

    .line 74
    move-result-object v5

    .line 75
    .line 76
    aget v0, v5, v0

    .line 77
    int-to-float v0, v0

    .line 78
    sub-float/2addr v0, v1

    .line 79
    .line 80
    .line 81
    invoke-static {v0}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 82
    move-result v0

    .line 83
    .line 84
    iget-object v1, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$FindTargetForTouchOperation;->this$0:Lcom/facebook/react/uimanager/UIViewOperationQueue;

    .line 85
    .line 86
    .line 87
    invoke-static {v1}, Lcom/facebook/react/uimanager/UIViewOperationQueue;->c(Lcom/facebook/react/uimanager/UIViewOperationQueue;)[I

    .line 88
    move-result-object v1

    .line 89
    .line 90
    aget v1, v1, v3

    .line 91
    int-to-float v1, v1

    .line 92
    sub-float/2addr v1, v2

    .line 93
    .line 94
    .line 95
    invoke-static {v1}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 96
    move-result v1

    .line 97
    .line 98
    iget-object v2, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$FindTargetForTouchOperation;->this$0:Lcom/facebook/react/uimanager/UIViewOperationQueue;

    .line 99
    .line 100
    .line 101
    invoke-static {v2}, Lcom/facebook/react/uimanager/UIViewOperationQueue;->c(Lcom/facebook/react/uimanager/UIViewOperationQueue;)[I

    .line 102
    move-result-object v2

    .line 103
    const/4 v3, 0x2

    .line 104
    .line 105
    aget v2, v2, v3

    .line 106
    int-to-float v2, v2

    .line 107
    .line 108
    .line 109
    invoke-static {v2}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 110
    move-result v2

    .line 111
    .line 112
    iget-object v3, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$FindTargetForTouchOperation;->this$0:Lcom/facebook/react/uimanager/UIViewOperationQueue;

    .line 113
    .line 114
    .line 115
    invoke-static {v3}, Lcom/facebook/react/uimanager/UIViewOperationQueue;->c(Lcom/facebook/react/uimanager/UIViewOperationQueue;)[I

    .line 116
    move-result-object v3

    .line 117
    const/4 v5, 0x3

    .line 118
    .line 119
    aget v3, v3, v5

    .line 120
    int-to-float v3, v3

    .line 121
    .line 122
    .line 123
    invoke-static {v3}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 124
    move-result v3

    .line 125
    .line 126
    iget-object v5, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$FindTargetForTouchOperation;->mCallback:Lcom/facebook/react/bridge/Callback;

    .line 127
    .line 128
    .line 129
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 130
    move-result-object v4

    .line 131
    .line 132
    .line 133
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 134
    move-result-object v0

    .line 135
    .line 136
    .line 137
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 138
    move-result-object v1

    .line 139
    .line 140
    .line 141
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 142
    move-result-object v2

    .line 143
    .line 144
    .line 145
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 146
    move-result-object v3

    .line 147
    .line 148
    .line 149
    filled-new-array {v4, v0, v1, v2, v3}, [Ljava/lang/Object;

    .line 150
    move-result-object v0

    .line 151
    .line 152
    .line 153
    invoke-interface {v5, v0}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V

    .line 154
    return-void

    .line 155
    .line 156
    :catch_0
    iget-object v1, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$FindTargetForTouchOperation;->mCallback:Lcom/facebook/react/bridge/Callback;

    .line 157
    .line 158
    new-array v0, v0, [Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    invoke-interface {v1, v0}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V

    .line 162
    return-void

    .line 163
    .line 164
    :catch_1
    iget-object v1, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$FindTargetForTouchOperation;->mCallback:Lcom/facebook/react/bridge/Callback;

    .line 165
    .line 166
    new-array v0, v0, [Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    invoke-interface {v1, v0}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V

    .line 170
    return-void
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
.end method
