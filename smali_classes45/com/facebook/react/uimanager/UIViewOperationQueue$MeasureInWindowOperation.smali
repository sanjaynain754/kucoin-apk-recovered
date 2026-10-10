.class final Lcom/facebook/react/uimanager/UIViewOperationQueue$MeasureInWindowOperation;
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
    name = "MeasureInWindowOperation"
.end annotation


# instance fields
.field private final mCallback:Lcom/facebook/react/bridge/Callback;

.field private final mReactTag:I

.field final synthetic this$0:Lcom/facebook/react/uimanager/UIViewOperationQueue;


# direct methods
.method private constructor <init>(Lcom/facebook/react/uimanager/UIViewOperationQueue;ILcom/facebook/react/bridge/Callback;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$MeasureInWindowOperation;->this$0:Lcom/facebook/react/uimanager/UIViewOperationQueue;

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput p2, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$MeasureInWindowOperation;->mReactTag:I

    .line 5
    iput-object p3, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$MeasureInWindowOperation;->mCallback:Lcom/facebook/react/bridge/Callback;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/facebook/react/uimanager/UIViewOperationQueue;ILcom/facebook/react/bridge/Callback;Lcom/facebook/react/uimanager/k0;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/react/uimanager/UIViewOperationQueue$MeasureInWindowOperation;-><init>(Lcom/facebook/react/uimanager/UIViewOperationQueue;ILcom/facebook/react/bridge/Callback;)V

    return-void
.end method


# virtual methods
.method public execute()V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    :try_start_0
    iget-object v1, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$MeasureInWindowOperation;->this$0:Lcom/facebook/react/uimanager/UIViewOperationQueue;

    .line 4
    .line 5
    .line 6
    invoke-static {v1}, Lcom/facebook/react/uimanager/UIViewOperationQueue;->d(Lcom/facebook/react/uimanager/UIViewOperationQueue;)Lcom/facebook/react/uimanager/NativeViewHierarchyManager;

    .line 7
    move-result-object v1

    .line 8
    .line 9
    iget v2, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$MeasureInWindowOperation;->mReactTag:I

    .line 10
    .line 11
    iget-object v3, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$MeasureInWindowOperation;->this$0:Lcom/facebook/react/uimanager/UIViewOperationQueue;

    .line 12
    .line 13
    .line 14
    invoke-static {v3}, Lcom/facebook/react/uimanager/UIViewOperationQueue;->c(Lcom/facebook/react/uimanager/UIViewOperationQueue;)[I

    .line 15
    move-result-object v3

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v2, v3}, Lcom/facebook/react/uimanager/NativeViewHierarchyManager;->measureInWindow(I[I)V
    :try_end_0
    .catch Lcom/facebook/react/uimanager/NoSuchNativeViewException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    iget-object v1, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$MeasureInWindowOperation;->this$0:Lcom/facebook/react/uimanager/UIViewOperationQueue;

    .line 21
    .line 22
    .line 23
    invoke-static {v1}, Lcom/facebook/react/uimanager/UIViewOperationQueue;->c(Lcom/facebook/react/uimanager/UIViewOperationQueue;)[I

    .line 24
    move-result-object v1

    .line 25
    .line 26
    aget v0, v1, v0

    .line 27
    int-to-float v0, v0

    .line 28
    .line 29
    .line 30
    invoke-static {v0}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 31
    move-result v0

    .line 32
    .line 33
    iget-object v1, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$MeasureInWindowOperation;->this$0:Lcom/facebook/react/uimanager/UIViewOperationQueue;

    .line 34
    .line 35
    .line 36
    invoke-static {v1}, Lcom/facebook/react/uimanager/UIViewOperationQueue;->c(Lcom/facebook/react/uimanager/UIViewOperationQueue;)[I

    .line 37
    move-result-object v1

    .line 38
    const/4 v2, 0x1

    .line 39
    .line 40
    aget v1, v1, v2

    .line 41
    int-to-float v1, v1

    .line 42
    .line 43
    .line 44
    invoke-static {v1}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 45
    move-result v1

    .line 46
    .line 47
    iget-object v2, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$MeasureInWindowOperation;->this$0:Lcom/facebook/react/uimanager/UIViewOperationQueue;

    .line 48
    .line 49
    .line 50
    invoke-static {v2}, Lcom/facebook/react/uimanager/UIViewOperationQueue;->c(Lcom/facebook/react/uimanager/UIViewOperationQueue;)[I

    .line 51
    move-result-object v2

    .line 52
    const/4 v3, 0x2

    .line 53
    .line 54
    aget v2, v2, v3

    .line 55
    int-to-float v2, v2

    .line 56
    .line 57
    .line 58
    invoke-static {v2}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 59
    move-result v2

    .line 60
    .line 61
    iget-object v3, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$MeasureInWindowOperation;->this$0:Lcom/facebook/react/uimanager/UIViewOperationQueue;

    .line 62
    .line 63
    .line 64
    invoke-static {v3}, Lcom/facebook/react/uimanager/UIViewOperationQueue;->c(Lcom/facebook/react/uimanager/UIViewOperationQueue;)[I

    .line 65
    move-result-object v3

    .line 66
    const/4 v4, 0x3

    .line 67
    .line 68
    aget v3, v3, v4

    .line 69
    int-to-float v3, v3

    .line 70
    .line 71
    .line 72
    invoke-static {v3}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 73
    move-result v3

    .line 74
    .line 75
    iget-object v4, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$MeasureInWindowOperation;->mCallback:Lcom/facebook/react/bridge/Callback;

    .line 76
    .line 77
    .line 78
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 79
    move-result-object v0

    .line 80
    .line 81
    .line 82
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 83
    move-result-object v1

    .line 84
    .line 85
    .line 86
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 87
    move-result-object v2

    .line 88
    .line 89
    .line 90
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 91
    move-result-object v3

    .line 92
    .line 93
    .line 94
    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/Object;

    .line 95
    move-result-object v0

    .line 96
    .line 97
    .line 98
    invoke-interface {v4, v0}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V

    .line 99
    return-void

    .line 100
    .line 101
    :catch_0
    iget-object v1, p0, Lcom/facebook/react/uimanager/UIViewOperationQueue$MeasureInWindowOperation;->mCallback:Lcom/facebook/react/bridge/Callback;

    .line 102
    .line 103
    new-array v0, v0, [Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    invoke-interface {v1, v0}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V

    .line 107
    return-void
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
