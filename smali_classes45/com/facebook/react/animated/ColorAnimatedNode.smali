.class public final Lcom/facebook/react/animated/ColorAnimatedNode;
.super Lcom/facebook/react/animated/AnimatedNode;
.source "ColorAnimatedNode.kt"

# interfaces
.implements Lcom/facebook/react/animated/AnimatedNodeWithUpdateableConfig;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/animated/ColorAnimatedNode$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0001\u001fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0012\u0010\u0016\u001a\u00020\u00172\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0016J\u0008\u0010\u0018\u001a\u00020\u0019H\u0016J\u0008\u0010\u001a\u001a\u00020\u0017H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u000c8F\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0015R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001c8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001d\u0010\u001e\u00a8\u0006 "
    }
    d2 = {
        "Lcom/facebook/react/animated/ColorAnimatedNode;",
        "Lcom/facebook/react/animated/AnimatedNode;",
        "Lcom/facebook/react/animated/AnimatedNodeWithUpdateableConfig;",
        "config",
        "Lcom/facebook/react/bridge/ReadableMap;",
        "nativeAnimatedNodesManager",
        "Lcom/facebook/react/animated/NativeAnimatedNodesManager;",
        "reactApplicationContext",
        "Lcom/facebook/react/bridge/ReactApplicationContext;",
        "<init>",
        "(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/animated/NativeAnimatedNodesManager;Lcom/facebook/react/bridge/ReactApplicationContext;)V",
        "rNodeId",
        "",
        "gNodeId",
        "bNodeId",
        "aNodeId",
        "nativeColor",
        "nativeColorApplied",
        "",
        "color",
        "getColor",
        "()I",
        "onUpdateConfig",
        "",
        "prettyPrint",
        "",
        "tryApplyNativeColor",
        "context",
        "Landroid/content/Context;",
        "getContext",
        "()Landroid/content/Context;",
        "Companion",
        "ReactAndroid_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/facebook/react/animated/ColorAnimatedNode$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private aNodeId:I

.field private bNodeId:I

.field private gNodeId:I

.field private final nativeAnimatedNodesManager:Lcom/facebook/react/animated/NativeAnimatedNodesManager;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private nativeColor:Lcom/facebook/react/bridge/ReadableMap;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private nativeColorApplied:Z

.field private rNodeId:I

.field private final reactApplicationContext:Lcom/facebook/react/bridge/ReactApplicationContext;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/react/animated/ColorAnimatedNode$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/facebook/react/animated/ColorAnimatedNode$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/facebook/react/animated/ColorAnimatedNode;->Companion:Lcom/facebook/react/animated/ColorAnimatedNode$Companion;

    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/animated/NativeAnimatedNodesManager;Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 1
    .param p1    # Lcom/facebook/react/bridge/ReadableMap;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/facebook/react/animated/NativeAnimatedNodesManager;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/facebook/react/bridge/ReactApplicationContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "config"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "nativeAnimatedNodesManager"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string/jumbo v0, "reactApplicationContext"

    .line 14
    .line 15
    .line 16
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-direct {p0}, Lcom/facebook/react/animated/AnimatedNode;-><init>()V

    .line 20
    .line 21
    iput-object p2, p0, Lcom/facebook/react/animated/ColorAnimatedNode;->nativeAnimatedNodesManager:Lcom/facebook/react/animated/NativeAnimatedNodesManager;

    .line 22
    .line 23
    iput-object p3, p0, Lcom/facebook/react/animated/ColorAnimatedNode;->reactApplicationContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p1}, Lcom/facebook/react/animated/ColorAnimatedNode;->onUpdateConfig(Lcom/facebook/react/bridge/ReadableMap;)V

    .line 27
    return-void
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
.end method

.method private final getContext()Landroid/content/Context;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/animated/ColorAnimatedNode;->reactApplicationContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->getCurrentActivity()Landroid/app/Activity;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    return-object v0

    .line 10
    .line 11
    :cond_0
    sget-object v0, Lcom/facebook/react/animated/ColorAnimatedNode;->Companion:Lcom/facebook/react/animated/ColorAnimatedNode$Companion;

    .line 12
    .line 13
    .line 14
    invoke-static {v0, p0}, Lcom/facebook/react/animated/ColorAnimatedNode$Companion;->access$getContextHelper(Lcom/facebook/react/animated/ColorAnimatedNode$Companion;Lcom/facebook/react/animated/AnimatedNode;)Landroid/content/Context;

    .line 15
    move-result-object v0

    .line 16
    return-object v0
    .line 17
    .line 18
.end method

.method private final tryApplyNativeColor()V
    .locals 7

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/animated/ColorAnimatedNode;->nativeColor:Lcom/facebook/react/bridge/ReadableMap;

    .line 3
    .line 4
    if-eqz v0, :cond_6

    .line 5
    .line 6
    iget-boolean v0, p0, Lcom/facebook/react/animated/ColorAnimatedNode;->nativeColorApplied:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    goto/16 :goto_0

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-direct {p0}, Lcom/facebook/react/animated/ColorAnimatedNode;->getContext()Landroid/content/Context;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    goto :goto_0

    .line 18
    .line 19
    :cond_1
    iget-object v1, p0, Lcom/facebook/react/animated/ColorAnimatedNode;->nativeColor:Lcom/facebook/react/bridge/ReadableMap;

    .line 20
    .line 21
    .line 22
    invoke-static {v1, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    iget-object v1, p0, Lcom/facebook/react/animated/ColorAnimatedNode;->nativeAnimatedNodesManager:Lcom/facebook/react/animated/NativeAnimatedNodesManager;

    .line 26
    .line 27
    iget v2, p0, Lcom/facebook/react/animated/ColorAnimatedNode;->rNodeId:I

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, v2}, Lcom/facebook/react/animated/NativeAnimatedNodesManager;->getNodeById(I)Lcom/facebook/react/animated/AnimatedNode;

    .line 31
    move-result-object v1

    .line 32
    .line 33
    check-cast v1, Lcom/facebook/react/animated/ValueAnimatedNode;

    .line 34
    .line 35
    iget-object v2, p0, Lcom/facebook/react/animated/ColorAnimatedNode;->nativeAnimatedNodesManager:Lcom/facebook/react/animated/NativeAnimatedNodesManager;

    .line 36
    .line 37
    iget v3, p0, Lcom/facebook/react/animated/ColorAnimatedNode;->gNodeId:I

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2, v3}, Lcom/facebook/react/animated/NativeAnimatedNodesManager;->getNodeById(I)Lcom/facebook/react/animated/AnimatedNode;

    .line 41
    move-result-object v2

    .line 42
    .line 43
    check-cast v2, Lcom/facebook/react/animated/ValueAnimatedNode;

    .line 44
    .line 45
    iget-object v3, p0, Lcom/facebook/react/animated/ColorAnimatedNode;->nativeAnimatedNodesManager:Lcom/facebook/react/animated/NativeAnimatedNodesManager;

    .line 46
    .line 47
    iget v4, p0, Lcom/facebook/react/animated/ColorAnimatedNode;->bNodeId:I

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3, v4}, Lcom/facebook/react/animated/NativeAnimatedNodesManager;->getNodeById(I)Lcom/facebook/react/animated/AnimatedNode;

    .line 51
    move-result-object v3

    .line 52
    .line 53
    check-cast v3, Lcom/facebook/react/animated/ValueAnimatedNode;

    .line 54
    .line 55
    iget-object v4, p0, Lcom/facebook/react/animated/ColorAnimatedNode;->nativeAnimatedNodesManager:Lcom/facebook/react/animated/NativeAnimatedNodesManager;

    .line 56
    .line 57
    iget v5, p0, Lcom/facebook/react/animated/ColorAnimatedNode;->aNodeId:I

    .line 58
    .line 59
    .line 60
    invoke-virtual {v4, v5}, Lcom/facebook/react/animated/NativeAnimatedNodesManager;->getNodeById(I)Lcom/facebook/react/animated/AnimatedNode;

    .line 61
    move-result-object v4

    .line 62
    .line 63
    check-cast v4, Lcom/facebook/react/animated/ValueAnimatedNode;

    .line 64
    .line 65
    if-eqz v1, :cond_2

    .line 66
    .line 67
    .line 68
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 72
    move-result v5

    .line 73
    .line 74
    .line 75
    invoke-static {v5}, Landroid/graphics/Color;->red(I)I

    .line 76
    move-result v5

    .line 77
    int-to-double v5, v5

    .line 78
    .line 79
    iput-wide v5, v1, Lcom/facebook/react/animated/ValueAnimatedNode;->nodeValue:D

    .line 80
    .line 81
    :cond_2
    if-eqz v2, :cond_3

    .line 82
    .line 83
    .line 84
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 88
    move-result v1

    .line 89
    .line 90
    .line 91
    invoke-static {v1}, Landroid/graphics/Color;->green(I)I

    .line 92
    move-result v1

    .line 93
    int-to-double v5, v1

    .line 94
    .line 95
    iput-wide v5, v2, Lcom/facebook/react/animated/ValueAnimatedNode;->nodeValue:D

    .line 96
    .line 97
    :cond_3
    if-eqz v3, :cond_4

    .line 98
    .line 99
    .line 100
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 104
    move-result v1

    .line 105
    .line 106
    .line 107
    invoke-static {v1}, Landroid/graphics/Color;->blue(I)I

    .line 108
    move-result v1

    .line 109
    int-to-double v1, v1

    .line 110
    .line 111
    iput-wide v1, v3, Lcom/facebook/react/animated/ValueAnimatedNode;->nodeValue:D

    .line 112
    .line 113
    :cond_4
    if-eqz v4, :cond_5

    .line 114
    .line 115
    .line 116
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 120
    move-result v0

    .line 121
    .line 122
    .line 123
    invoke-static {v0}, Landroid/graphics/Color;->alpha(I)I

    .line 124
    move-result v0

    .line 125
    int-to-double v0, v0

    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    const-wide v2, 0x406fe00000000000L    # 255.0

    .line 131
    div-double/2addr v0, v2

    .line 132
    .line 133
    iput-wide v0, v4, Lcom/facebook/react/animated/ValueAnimatedNode;->nodeValue:D

    .line 134
    :cond_5
    const/4 v0, 0x1

    .line 135
    .line 136
    iput-boolean v0, p0, Lcom/facebook/react/animated/ColorAnimatedNode;->nativeColorApplied:Z

    .line 137
    :cond_6
    :goto_0
    return-void
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


# virtual methods
.method public final getColor()I
    .locals 17

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/facebook/react/animated/ColorAnimatedNode;->tryApplyNativeColor()V

    .line 6
    .line 7
    iget-object v1, v0, Lcom/facebook/react/animated/ColorAnimatedNode;->nativeAnimatedNodesManager:Lcom/facebook/react/animated/NativeAnimatedNodesManager;

    .line 8
    .line 9
    iget v2, v0, Lcom/facebook/react/animated/ColorAnimatedNode;->rNodeId:I

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v2}, Lcom/facebook/react/animated/NativeAnimatedNodesManager;->getNodeById(I)Lcom/facebook/react/animated/AnimatedNode;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    check-cast v1, Lcom/facebook/react/animated/ValueAnimatedNode;

    .line 16
    .line 17
    iget-object v2, v0, Lcom/facebook/react/animated/ColorAnimatedNode;->nativeAnimatedNodesManager:Lcom/facebook/react/animated/NativeAnimatedNodesManager;

    .line 18
    .line 19
    iget v3, v0, Lcom/facebook/react/animated/ColorAnimatedNode;->gNodeId:I

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2, v3}, Lcom/facebook/react/animated/NativeAnimatedNodesManager;->getNodeById(I)Lcom/facebook/react/animated/AnimatedNode;

    .line 23
    move-result-object v2

    .line 24
    .line 25
    check-cast v2, Lcom/facebook/react/animated/ValueAnimatedNode;

    .line 26
    .line 27
    iget-object v3, v0, Lcom/facebook/react/animated/ColorAnimatedNode;->nativeAnimatedNodesManager:Lcom/facebook/react/animated/NativeAnimatedNodesManager;

    .line 28
    .line 29
    iget v4, v0, Lcom/facebook/react/animated/ColorAnimatedNode;->bNodeId:I

    .line 30
    .line 31
    .line 32
    invoke-virtual {v3, v4}, Lcom/facebook/react/animated/NativeAnimatedNodesManager;->getNodeById(I)Lcom/facebook/react/animated/AnimatedNode;

    .line 33
    move-result-object v3

    .line 34
    .line 35
    check-cast v3, Lcom/facebook/react/animated/ValueAnimatedNode;

    .line 36
    .line 37
    iget-object v4, v0, Lcom/facebook/react/animated/ColorAnimatedNode;->nativeAnimatedNodesManager:Lcom/facebook/react/animated/NativeAnimatedNodesManager;

    .line 38
    .line 39
    iget v5, v0, Lcom/facebook/react/animated/ColorAnimatedNode;->aNodeId:I

    .line 40
    .line 41
    .line 42
    invoke-virtual {v4, v5}, Lcom/facebook/react/animated/NativeAnimatedNodesManager;->getNodeById(I)Lcom/facebook/react/animated/AnimatedNode;

    .line 43
    move-result-object v4

    .line 44
    .line 45
    check-cast v4, Lcom/facebook/react/animated/ValueAnimatedNode;

    .line 46
    .line 47
    const-wide/16 v5, 0x0

    .line 48
    .line 49
    if-eqz v1, :cond_0

    .line 50
    .line 51
    iget-wide v7, v1, Lcom/facebook/react/animated/ValueAnimatedNode;->nodeValue:D

    .line 52
    move-wide v9, v7

    .line 53
    goto :goto_0

    .line 54
    :cond_0
    move-wide v9, v5

    .line 55
    .line 56
    :goto_0
    if-eqz v2, :cond_1

    .line 57
    .line 58
    iget-wide v1, v2, Lcom/facebook/react/animated/ValueAnimatedNode;->nodeValue:D

    .line 59
    move-wide v11, v1

    .line 60
    goto :goto_1

    .line 61
    :cond_1
    move-wide v11, v5

    .line 62
    .line 63
    :goto_1
    if-eqz v3, :cond_2

    .line 64
    .line 65
    iget-wide v1, v3, Lcom/facebook/react/animated/ValueAnimatedNode;->nodeValue:D

    .line 66
    move-wide v13, v1

    .line 67
    goto :goto_2

    .line 68
    :cond_2
    move-wide v13, v5

    .line 69
    .line 70
    :goto_2
    if-eqz v4, :cond_3

    .line 71
    .line 72
    iget-wide v5, v4, Lcom/facebook/react/animated/ValueAnimatedNode;->nodeValue:D

    .line 73
    :cond_3
    move-wide v15, v5

    .line 74
    .line 75
    .line 76
    invoke-static/range {v9 .. v16}, Lcom/facebook/react/views/view/ColorUtil;->normalize(DDDD)I

    .line 77
    move-result v1

    .line 78
    return v1
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

.method public onUpdateConfig(Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 2
    .param p1    # Lcom/facebook/react/bridge/ReadableMap;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    .line 6
    const-string/jumbo v1, "r"

    .line 7
    .line 8
    .line 9
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    .line 10
    move-result v1

    .line 11
    .line 12
    iput v1, p0, Lcom/facebook/react/animated/ColorAnimatedNode;->rNodeId:I

    .line 13
    .line 14
    const-string v1, "g"

    .line 15
    .line 16
    .line 17
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    .line 18
    move-result v1

    .line 19
    .line 20
    iput v1, p0, Lcom/facebook/react/animated/ColorAnimatedNode;->gNodeId:I

    .line 21
    .line 22
    const-string v1, "b"

    .line 23
    .line 24
    .line 25
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    .line 26
    move-result v1

    .line 27
    .line 28
    iput v1, p0, Lcom/facebook/react/animated/ColorAnimatedNode;->bNodeId:I

    .line 29
    .line 30
    const-string v1, "a"

    .line 31
    .line 32
    .line 33
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    .line 34
    move-result v1

    .line 35
    .line 36
    iput v1, p0, Lcom/facebook/react/animated/ColorAnimatedNode;->aNodeId:I

    .line 37
    .line 38
    const-string v1, "nativeColor"

    .line 39
    .line 40
    .line 41
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    .line 42
    move-result-object p1

    .line 43
    .line 44
    iput-object p1, p0, Lcom/facebook/react/animated/ColorAnimatedNode;->nativeColor:Lcom/facebook/react/bridge/ReadableMap;

    .line 45
    .line 46
    iput-boolean v0, p0, Lcom/facebook/react/animated/ColorAnimatedNode;->nativeColorApplied:Z

    .line 47
    .line 48
    .line 49
    invoke-direct {p0}, Lcom/facebook/react/animated/ColorAnimatedNode;->tryApplyNativeColor()V

    .line 50
    return-void

    .line 51
    .line 52
    :cond_0
    iput v0, p0, Lcom/facebook/react/animated/ColorAnimatedNode;->rNodeId:I

    .line 53
    .line 54
    iput v0, p0, Lcom/facebook/react/animated/ColorAnimatedNode;->gNodeId:I

    .line 55
    .line 56
    iput v0, p0, Lcom/facebook/react/animated/ColorAnimatedNode;->bNodeId:I

    .line 57
    .line 58
    iput v0, p0, Lcom/facebook/react/animated/ColorAnimatedNode;->aNodeId:I

    .line 59
    const/4 p1, 0x0

    .line 60
    .line 61
    iput-object p1, p0, Lcom/facebook/react/animated/ColorAnimatedNode;->nativeColor:Lcom/facebook/react/bridge/ReadableMap;

    .line 62
    .line 63
    iput-boolean v0, p0, Lcom/facebook/react/animated/ColorAnimatedNode;->nativeColorApplied:Z

    .line 64
    return-void
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
.end method

.method public prettyPrint()Ljava/lang/String;
    .locals 7
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Lcom/facebook/react/animated/AnimatedNode;->tag:I

    .line 3
    .line 4
    iget v1, p0, Lcom/facebook/react/animated/ColorAnimatedNode;->rNodeId:I

    .line 5
    .line 6
    iget v2, p0, Lcom/facebook/react/animated/ColorAnimatedNode;->gNodeId:I

    .line 7
    .line 8
    iget v3, p0, Lcom/facebook/react/animated/ColorAnimatedNode;->bNodeId:I

    .line 9
    .line 10
    iget v4, p0, Lcom/facebook/react/animated/ColorAnimatedNode;->aNodeId:I

    .line 11
    .line 12
    new-instance v5, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    const-string v6, "ColorAnimatedNode["

    .line 18
    .line 19
    .line 20
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    const-string v0, "]: r: "

    .line 26
    .line 27
    .line 28
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    const-string v0, "  g: "

    .line 34
    .line 35
    .line 36
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    const-string v0, " b: "

    .line 42
    .line 43
    .line 44
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    const-string v0, " a: "

    .line 50
    .line 51
    .line 52
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    move-result-object v0

    .line 60
    return-object v0
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
.end method
