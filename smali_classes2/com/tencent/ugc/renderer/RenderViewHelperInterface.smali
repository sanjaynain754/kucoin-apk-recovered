.class public abstract Lcom/tencent/ugc/renderer/RenderViewHelperInterface;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lcom/tencent/liteav/base/annotations/JNINamespace;
    value = "liteav::ugc"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/ugc/renderer/RenderViewHelperInterface$RenderViewListener;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "RenderViewHelperInterface"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    return-void
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
.end method

.method public static create(Lcom/tencent/liteav/videobase/videobase/DisplayTarget;Lcom/tencent/ugc/renderer/RenderViewHelperInterface$RenderViewListener;)Lcom/tencent/ugc/renderer/RenderViewHelperInterface;
    .locals 6

    .line 1
    .line 2
    const-string v0, "RenderViewHelperInterface"

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz p0, :cond_a

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/tencent/liteav/videobase/videobase/DisplayTarget;->getType()Lcom/tencent/liteav/videobase/videobase/DisplayTarget$a;

    .line 9
    move-result-object v2

    .line 10
    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    goto/16 :goto_2

    .line 14
    .line 15
    :cond_0
    sget-object v2, Lcom/tencent/ugc/renderer/RenderViewHelperInterface$1;->a:[I

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/tencent/liteav/videobase/videobase/DisplayTarget;->getType()Lcom/tencent/liteav/videobase/videobase/DisplayTarget$a;

    .line 19
    move-result-object v3

    .line 20
    .line 21
    .line 22
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 23
    move-result v3

    .line 24
    .line 25
    aget v2, v2, v3

    .line 26
    const/4 v3, 0x1

    .line 27
    .line 28
    if-eq v2, v3, :cond_5

    .line 29
    const/4 v3, 0x2

    .line 30
    .line 31
    if-eq v2, v3, :cond_4

    .line 32
    const/4 v3, 0x3

    .line 33
    .line 34
    if-eq v2, v3, :cond_3

    .line 35
    const/4 v3, 0x4

    .line 36
    .line 37
    if-eq v2, v3, :cond_1

    .line 38
    move-object v2, v1

    .line 39
    move-object v3, v2

    .line 40
    :goto_0
    move-object v4, v3

    .line 41
    move-object v5, v4

    .line 42
    goto :goto_1

    .line 43
    .line 44
    .line 45
    :cond_1
    invoke-virtual {p0}, Lcom/tencent/liteav/videobase/videobase/DisplayTarget;->getTXCloudVideoView()Lcom/tencent/rtmp/ui/TXCloudVideoView;

    .line 46
    move-result-object v2

    .line 47
    .line 48
    if-nez v2, :cond_2

    .line 49
    .line 50
    const-string v3, "txCloudVideoView is null."

    .line 51
    .line 52
    .line 53
    invoke-static {v0, v3}, Lcom/tencent/liteav/base/util/LiteavLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    move-object v4, v1

    .line 55
    move-object v5, v4

    .line 56
    move-object v3, v2

    .line 57
    move-object v2, v5

    .line 58
    goto :goto_1

    .line 59
    .line 60
    .line 61
    :cond_2
    invoke-virtual {v2}, Lcom/tencent/rtmp/ui/TXCloudVideoView;->getSurfaceView()Landroid/view/SurfaceView;

    .line 62
    move-result-object v3

    .line 63
    .line 64
    .line 65
    invoke-static {v2}, Lcom/tencent/ugc/videobase/videobase/TXCCloudVideoViewMethodInvoker;->getTextureViewSetByUser(Lcom/tencent/rtmp/ui/TXCloudVideoView;)Landroid/view/TextureView;

    .line 66
    move-result-object v4

    .line 67
    move-object v5, v4

    .line 68
    move-object v4, v3

    .line 69
    move-object v3, v2

    .line 70
    move-object v2, v1

    .line 71
    goto :goto_1

    .line 72
    .line 73
    .line 74
    :cond_3
    invoke-virtual {p0}, Lcom/tencent/liteav/videobase/videobase/DisplayTarget;->getSurface()Landroid/view/Surface;

    .line 75
    move-result-object v2

    .line 76
    move-object v3, v1

    .line 77
    goto :goto_0

    .line 78
    .line 79
    .line 80
    :cond_4
    invoke-virtual {p0}, Lcom/tencent/liteav/videobase/videobase/DisplayTarget;->getTextureView()Landroid/view/TextureView;

    .line 81
    move-result-object v4

    .line 82
    move-object v2, v1

    .line 83
    move-object v3, v2

    .line 84
    move-object v5, v4

    .line 85
    move-object v4, v3

    .line 86
    goto :goto_1

    .line 87
    .line 88
    .line 89
    :cond_5
    invoke-virtual {p0}, Lcom/tencent/liteav/videobase/videobase/DisplayTarget;->getSurfaceView()Landroid/view/SurfaceView;

    .line 90
    move-result-object v3

    .line 91
    move-object v2, v1

    .line 92
    move-object v5, v2

    .line 93
    move-object v4, v3

    .line 94
    move-object v3, v5

    .line 95
    .line 96
    :goto_1
    if-eqz v4, :cond_6

    .line 97
    .line 98
    new-instance p0, Lcom/tencent/ugc/renderer/SurfaceViewRenderHelper;

    .line 99
    .line 100
    .line 101
    invoke-direct {p0, v4, p1}, Lcom/tencent/ugc/renderer/SurfaceViewRenderHelper;-><init>(Landroid/view/SurfaceView;Lcom/tencent/ugc/renderer/RenderViewHelperInterface$RenderViewListener;)V

    .line 102
    return-object p0

    .line 103
    .line 104
    :cond_6
    if-eqz v5, :cond_7

    .line 105
    .line 106
    new-instance p0, Lcom/tencent/ugc/renderer/TextureViewRenderHelper;

    .line 107
    .line 108
    .line 109
    invoke-direct {p0, v5, p1}, Lcom/tencent/ugc/renderer/TextureViewRenderHelper;-><init>(Landroid/view/TextureView;Lcom/tencent/ugc/renderer/RenderViewHelperInterface$RenderViewListener;)V

    .line 110
    return-object p0

    .line 111
    .line 112
    :cond_7
    if-eqz v2, :cond_8

    .line 113
    .line 114
    new-instance p0, Lcom/tencent/ugc/renderer/SurfaceRenderHelper;

    .line 115
    .line 116
    .line 117
    invoke-direct {p0, v2, p1}, Lcom/tencent/ugc/renderer/SurfaceRenderHelper;-><init>(Landroid/view/Surface;Lcom/tencent/ugc/renderer/RenderViewHelperInterface$RenderViewListener;)V

    .line 118
    return-object p0

    .line 119
    .line 120
    :cond_8
    if-eqz v3, :cond_9

    .line 121
    .line 122
    new-instance p0, Lcom/tencent/ugc/renderer/TextureViewRenderHelper;

    .line 123
    .line 124
    .line 125
    invoke-direct {p0, v3, p1}, Lcom/tencent/ugc/renderer/TextureViewRenderHelper;-><init>(Lcom/tencent/rtmp/ui/TXCloudVideoView;Lcom/tencent/ugc/renderer/RenderViewHelperInterface$RenderViewListener;)V

    .line 126
    return-object p0

    .line 127
    .line 128
    .line 129
    :cond_9
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 130
    move-result-object p0

    .line 131
    .line 132
    const-string p1, "RenderViewHelper not created. displayTarget="

    .line 133
    .line 134
    .line 135
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 136
    move-result-object p0

    .line 137
    .line 138
    .line 139
    invoke-static {v0, p0}, Lcom/tencent/liteav/base/util/LiteavLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 140
    return-object v1

    .line 141
    .line 142
    .line 143
    :cond_a
    :goto_2
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 144
    move-result-object p0

    .line 145
    .line 146
    const-string p1, "displayTarget or type is null. displayTarget="

    .line 147
    .line 148
    .line 149
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 150
    move-result-object p0

    .line 151
    .line 152
    .line 153
    invoke-static {v0, p0}, Lcom/tencent/liteav/base/util/LiteavLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 154
    return-object v1
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
.end method

.method public static createScaleType(I)Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;->a(I)Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method


# virtual methods
.method public abstract checkViewAvailability()V
.end method

.method public abstract getTransformMatrix(II)Landroid/graphics/Matrix;
.end method

.method public abstract isUsingTextureView()Z
.end method

.method public abstract release(Z)V
.end method

.method public abstract updateVideoFrameInfo(Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;IIZ)V
.end method
