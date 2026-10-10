.class public Lcom/tencent/ugc/videobase/videobase/FrameConverter;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/ugc/videobase/videobase/FrameConverter$FrameConvertListener;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "FrameConverter"


# instance fields
.field private mGLTexturePool:Lcom/tencent/ugc/videobase/frame/GLTexturePool;

.field private final mSameParamsConverts:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/tencent/ugc/videobase/videobase/ConvertParams;",
            "Lcom/tencent/ugc/videobase/videobase/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/HashMap;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/ugc/videobase/videobase/FrameConverter;->mSameParamsConverts:Ljava/util/Map;

    .line 11
    return-void
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


# virtual methods
.method public addListener(Lcom/tencent/ugc/videobase/videobase/ConvertParams;Lcom/tencent/liteav/videobase/base/GLConstants$a;Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;ILcom/tencent/ugc/videobase/videobase/FrameConverter$FrameConvertListener;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/ugc/videobase/videobase/FrameConverter;->mSameParamsConverts:Ljava/util/Map;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/tencent/ugc/videobase/videobase/a;

    .line 9
    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    new-instance v0, Lcom/tencent/ugc/videobase/videobase/a;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, p1}, Lcom/tencent/ugc/videobase/videobase/a;-><init>(Lcom/tencent/ugc/videobase/videobase/ConvertParams;)V

    .line 16
    .line 17
    iget-object v1, p0, Lcom/tencent/ugc/videobase/videobase/FrameConverter;->mGLTexturePool:Lcom/tencent/ugc/videobase/frame/GLTexturePool;

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lcom/tencent/ugc/videobase/videobase/a;->a(Lcom/tencent/ugc/videobase/frame/GLTexturePool;)V

    .line 23
    .line 24
    :cond_0
    iget-object v1, p0, Lcom/tencent/ugc/videobase/videobase/FrameConverter;->mSameParamsConverts:Ljava/util/Map;

    .line 25
    .line 26
    .line 27
    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    :cond_1
    iget-object p1, v0, Lcom/tencent/ugc/videobase/videobase/a;->e:Ljava/util/Map;

    .line 30
    .line 31
    .line 32
    invoke-interface {p1, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    move-result-object p1

    .line 34
    .line 35
    check-cast p1, Ljava/util/List;

    .line 36
    .line 37
    if-nez p1, :cond_2

    .line 38
    .line 39
    new-instance p1, Ljava/util/ArrayList;

    .line 40
    .line 41
    .line 42
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 43
    .line 44
    iget-object v0, v0, Lcom/tencent/ugc/videobase/videobase/a;->e:Ljava/util/Map;

    .line 45
    .line 46
    .line 47
    invoke-interface {v0, p3, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    :cond_2
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 51
    move-result-object p3

    .line 52
    .line 53
    .line 54
    :cond_3
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    move-result v0

    .line 56
    .line 57
    if-eqz v0, :cond_5

    .line 58
    .line 59
    .line 60
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    move-result-object v0

    .line 62
    .line 63
    check-cast v0, Lcom/tencent/ugc/videobase/videobase/a$a;

    .line 64
    .line 65
    iget v1, v0, Lcom/tencent/ugc/videobase/videobase/a$a;->b:I

    .line 66
    .line 67
    if-ne v1, p4, :cond_3

    .line 68
    .line 69
    iget-object v0, v0, Lcom/tencent/ugc/videobase/videobase/a$a;->c:Lcom/tencent/ugc/videobase/videobase/FrameConverter$FrameConvertListener;

    .line 70
    .line 71
    if-eq v0, p5, :cond_4

    .line 72
    goto :goto_0

    .line 73
    :cond_4
    return-void

    .line 74
    .line 75
    :cond_5
    new-instance p3, Lcom/tencent/ugc/videobase/videobase/a$a;

    .line 76
    .line 77
    .line 78
    invoke-direct {p3, p2, p4, p5}, Lcom/tencent/ugc/videobase/videobase/a$a;-><init>(Lcom/tencent/liteav/videobase/base/GLConstants$a;ILcom/tencent/ugc/videobase/videobase/FrameConverter$FrameConvertListener;)V

    .line 79
    .line 80
    .line 81
    invoke-interface {p1, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 82
    return-void
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

.method public initialize(Lcom/tencent/ugc/videobase/frame/GLTexturePool;)V
    .locals 2

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/ugc/videobase/videobase/FrameConverter;->mGLTexturePool:Lcom/tencent/ugc/videobase/frame/GLTexturePool;

    .line 3
    .line 4
    iget-object v0, p0, Lcom/tencent/ugc/videobase/videobase/FrameConverter;->mSameParamsConverts:Ljava/util/Map;

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    .line 15
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    move-result v1

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    check-cast v1, Lcom/tencent/ugc/videobase/videobase/a;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, p1}, Lcom/tencent/ugc/videobase/videobase/a;->a(Lcom/tencent/ugc/videobase/frame/GLTexturePool;)V

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    return-void
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

.method public processFrame(JLcom/tencent/ugc/videobase/frame/GLTexture;)V
    .locals 22

    move-object/from16 v0, p0

    move-wide/from16 v2, p1

    .line 1
    iget-object v1, v0, Lcom/tencent/ugc/videobase/videobase/FrameConverter;->mSameParamsConverts:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v1

    if-gtz v1, :cond_0

    .line 2
    const-string v1, "FrameConverter"

    const-string v4, "process frame without SameParamsConverter."

    invoke-static {v1, v4}, Lcom/tencent/liteav/base/util/LiteavLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    :cond_0
    iget-object v1, v0, Lcom/tencent/ugc/videobase/videobase/FrameConverter;->mSameParamsConverts:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_17

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tencent/ugc/videobase/videobase/a;

    .line 4
    iget-boolean v4, v1, Lcom/tencent/ugc/videobase/videobase/a;->h:Z

    if-eqz v4, :cond_16

    .line 5
    iget-object v4, v1, Lcom/tencent/ugc/videobase/videobase/a;->d:Lcom/tencent/ugc/videobase/videobase/ConvertParams;

    iget v4, v4, Lcom/tencent/ugc/videobase/videobase/ConvertParams;->width:I

    if-eqz v4, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual/range {p3 .. p3}, Lcom/tencent/ugc/videobase/frame/GLTexture;->getWidth()I

    move-result v4

    .line 6
    :goto_1
    iget-object v5, v1, Lcom/tencent/ugc/videobase/videobase/a;->d:Lcom/tencent/ugc/videobase/videobase/ConvertParams;

    iget v5, v5, Lcom/tencent/ugc/videobase/videobase/ConvertParams;->height:I

    if-eqz v5, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual/range {p3 .. p3}, Lcom/tencent/ugc/videobase/frame/GLTexture;->getHeight()I

    move-result v5

    .line 7
    :goto_2
    invoke-virtual/range {p3 .. p3}, Lcom/tencent/ugc/videobase/frame/GLTexture;->getWidth()I

    move-result v6

    if-ne v6, v4, :cond_3

    invoke-virtual/range {p3 .. p3}, Lcom/tencent/ugc/videobase/frame/GLTexture;->getHeight()I

    move-result v6

    if-ne v6, v5, :cond_3

    iget-object v6, v1, Lcom/tencent/ugc/videobase/videobase/a;->d:Lcom/tencent/ugc/videobase/videobase/ConvertParams;

    iget-object v8, v6, Lcom/tencent/ugc/videobase/videobase/ConvertParams;->rotation:Lcom/tencent/liteav/base/util/l;

    sget-object v9, Lcom/tencent/liteav/base/util/l;->a:Lcom/tencent/liteav/base/util/l;

    if-ne v8, v9, :cond_3

    iget-boolean v6, v6, Lcom/tencent/ugc/videobase/videobase/ConvertParams;->mirror:Z

    if-nez v6, :cond_3

    .line 8
    invoke-virtual/range {p3 .. p3}, Lcom/tencent/ugc/videobase/frame/RefCounted;->retain()I

    move-object/from16 v8, p3

    move-object v9, v8

    goto :goto_5

    .line 9
    :cond_3
    iget-object v6, v1, Lcom/tencent/ugc/videobase/videobase/a;->g:Lcom/tencent/ugc/videobase/frame/PixelFrameRenderer;

    if-nez v6, :cond_4

    .line 10
    new-instance v6, Lcom/tencent/ugc/videobase/frame/PixelFrameRenderer;

    invoke-direct {v6, v4, v5}, Lcom/tencent/ugc/videobase/frame/PixelFrameRenderer;-><init>(II)V

    iput-object v6, v1, Lcom/tencent/ugc/videobase/videobase/a;->g:Lcom/tencent/ugc/videobase/frame/PixelFrameRenderer;

    .line 11
    :cond_4
    invoke-static {}, Lcom/tencent/ugc/videobase/utils/OpenGlUtils;->getCurrentContext()Ljava/lang/Object;

    move-result-object v6

    move-object/from16 v8, p3

    invoke-virtual {v8, v6}, Lcom/tencent/ugc/videobase/frame/GLTexture;->wrap(Ljava/lang/Object;)Lcom/tencent/ugc/videobase/frame/PixelFrame;

    move-result-object v6

    .line 12
    iget-object v9, v1, Lcom/tencent/ugc/videobase/videobase/a;->d:Lcom/tencent/ugc/videobase/videobase/ConvertParams;

    iget-object v9, v9, Lcom/tencent/ugc/videobase/videobase/ConvertParams;->rotation:Lcom/tencent/liteav/base/util/l;

    sget-object v10, Lcom/tencent/liteav/base/util/l;->b:Lcom/tencent/liteav/base/util/l;

    if-eq v9, v10, :cond_6

    sget-object v10, Lcom/tencent/liteav/base/util/l;->d:Lcom/tencent/liteav/base/util/l;

    if-ne v9, v10, :cond_5

    goto :goto_3

    .line 13
    :cond_5
    invoke-virtual {v8}, Lcom/tencent/ugc/videobase/frame/GLTexture;->getWidth()I

    move-result v9

    invoke-virtual {v6, v9}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->setWidth(I)V

    .line 14
    invoke-virtual {v8}, Lcom/tencent/ugc/videobase/frame/GLTexture;->getHeight()I

    move-result v9

    invoke-virtual {v6, v9}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->setHeight(I)V

    goto :goto_4

    .line 15
    :cond_6
    :goto_3
    invoke-virtual {v8}, Lcom/tencent/ugc/videobase/frame/GLTexture;->getHeight()I

    move-result v9

    invoke-virtual {v6, v9}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->setWidth(I)V

    .line 16
    invoke-virtual {v8}, Lcom/tencent/ugc/videobase/frame/GLTexture;->getWidth()I

    move-result v9

    invoke-virtual {v6, v9}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->setHeight(I)V

    .line 17
    :goto_4
    iget-object v9, v1, Lcom/tencent/ugc/videobase/videobase/a;->d:Lcom/tencent/ugc/videobase/videobase/ConvertParams;

    iget-object v9, v9, Lcom/tencent/ugc/videobase/videobase/ConvertParams;->rotation:Lcom/tencent/liteav/base/util/l;

    invoke-virtual {v6, v9}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->setRotation(Lcom/tencent/liteav/base/util/l;)V

    .line 18
    iget-object v9, v1, Lcom/tencent/ugc/videobase/videobase/a;->d:Lcom/tencent/ugc/videobase/videobase/ConvertParams;

    iget-boolean v9, v9, Lcom/tencent/ugc/videobase/videobase/ConvertParams;->mirror:Z

    invoke-virtual {v6, v9}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->setMirrorHorizontal(Z)V

    .line 19
    iget-object v9, v1, Lcom/tencent/ugc/videobase/videobase/a;->j:Lcom/tencent/ugc/videobase/frame/GLTexturePool;

    invoke-virtual {v9, v4, v5}, Lcom/tencent/ugc/videobase/frame/GLTexturePool;->obtain(II)Lcom/tencent/ugc/videobase/frame/GLTexture;

    move-result-object v4

    .line 20
    invoke-virtual {v6}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getColorRange()Lcom/tencent/liteav/videobase/base/GLConstants$ColorRange;

    move-result-object v5

    invoke-virtual {v6}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getColorSpace()Lcom/tencent/liteav/videobase/base/GLConstants$ColorSpace;

    move-result-object v9

    invoke-virtual {v4, v5, v9}, Lcom/tencent/ugc/videobase/frame/GLTexture;->setColorFormat(Lcom/tencent/liteav/videobase/base/GLConstants$ColorRange;Lcom/tencent/liteav/videobase/base/GLConstants$ColorSpace;)V

    .line 21
    invoke-virtual {v8}, Lcom/tencent/ugc/videobase/frame/GLTexture;->getMetaData()Lcom/tencent/ugc/videobase/frame/FrameMetaData;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/tencent/ugc/videobase/frame/GLTexture;->setMetaData(Lcom/tencent/ugc/videobase/frame/FrameMetaData;)V

    .line 22
    iget-object v5, v1, Lcom/tencent/ugc/videobase/videobase/a;->g:Lcom/tencent/ugc/videobase/frame/PixelFrameRenderer;

    sget-object v9, Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;->a:Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;

    invoke-virtual {v5, v6, v9, v4}, Lcom/tencent/ugc/videobase/frame/PixelFrameRenderer;->renderFrame(Lcom/tencent/ugc/videobase/frame/PixelFrame;Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;Lcom/tencent/ugc/videobase/frame/GLTexture;)V

    .line 23
    invoke-virtual {v6}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->release()V

    move-object v9, v4

    .line 24
    :goto_5
    invoke-static {}, Lcom/tencent/ugc/videobase/utils/OpenGlUtils;->getCurrentContext()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v9, v4}, Lcom/tencent/ugc/videobase/frame/GLTexture;->wrap(Ljava/lang/Object;)Lcom/tencent/ugc/videobase/frame/PixelFrame;

    move-result-object v4

    .line 25
    invoke-virtual {v9}, Lcom/tencent/ugc/videobase/frame/GLTexture;->getMetaData()Lcom/tencent/ugc/videobase/frame/FrameMetaData;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->setMetaData(Lcom/tencent/ugc/videobase/frame/FrameMetaData;)V

    .line 26
    invoke-virtual {v1, v4, v2, v3}, Lcom/tencent/ugc/videobase/videobase/a;->a(Lcom/tencent/ugc/videobase/frame/PixelFrame;J)V

    .line 27
    invoke-virtual {v4}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->release()V

    .line 28
    sget-object v4, Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;->f:Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;

    invoke-virtual {v1, v2, v3, v9, v4}, Lcom/tencent/ugc/videobase/videobase/a;->a(JLcom/tencent/ugc/videobase/frame/GLTexture;Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;)Lcom/tencent/ugc/videobase/frame/PixelFrame;

    move-result-object v4

    if-eqz v4, :cond_7

    .line 29
    invoke-virtual {v4}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->release()V

    :cond_7
    const/4 v5, 0x0

    .line 30
    :goto_6
    sget-object v6, Lcom/tencent/ugc/videobase/videobase/a;->a:[Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;

    array-length v10, v6

    if-ge v5, v10, :cond_9

    .line 31
    iget-object v10, v1, Lcom/tencent/ugc/videobase/videobase/a;->e:Ljava/util/Map;

    aget-object v11, v6, v5

    invoke-interface {v10, v11}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    goto :goto_7

    :cond_8
    add-int/lit8 v5, v5, 0x1

    goto :goto_6

    :cond_9
    const/4 v5, -0x1

    :goto_7
    if-ltz v5, :cond_15

    .line 32
    invoke-virtual {v9}, Lcom/tencent/ugc/videobase/frame/GLTexture;->getWidth()I

    move-result v14

    .line 33
    invoke-virtual {v9}, Lcom/tencent/ugc/videobase/frame/GLTexture;->getHeight()I

    move-result v15

    .line 34
    invoke-virtual {v9}, Lcom/tencent/ugc/videobase/frame/GLTexture;->getColorRange()Lcom/tencent/liteav/videobase/base/GLConstants$ColorRange;

    move-result-object v10

    .line 35
    invoke-virtual {v9}, Lcom/tencent/ugc/videobase/frame/GLTexture;->getColorSpace()Lcom/tencent/liteav/videobase/base/GLConstants$ColorSpace;

    move-result-object v11

    .line 36
    iget-object v12, v1, Lcom/tencent/ugc/videobase/videobase/a;->j:Lcom/tencent/ugc/videobase/frame/GLTexturePool;

    invoke-virtual {v12, v14, v15}, Lcom/tencent/ugc/videobase/frame/GLTexturePool;->obtain(II)Lcom/tencent/ugc/videobase/frame/GLTexture;

    move-result-object v12

    .line 37
    invoke-virtual {v12, v10, v11}, Lcom/tencent/ugc/videobase/frame/GLTexture;->setColorFormat(Lcom/tencent/liteav/videobase/base/GLConstants$ColorRange;Lcom/tencent/liteav/videobase/base/GLConstants$ColorSpace;)V

    .line 38
    aget-object v13, v6, v5

    if-nez v13, :cond_a

    :goto_8
    move/from16 v18, v5

    const/4 v4, 0x0

    goto :goto_b

    .line 39
    :cond_a
    iget-object v4, v1, Lcom/tencent/ugc/videobase/videobase/a;->f:Ljava/util/Map;

    invoke-interface {v4, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;

    if-nez v4, :cond_f

    .line 40
    sget-object v4, Lcom/tencent/ugc/videobase/videobase/a$1;->a:[I

    invoke-virtual {v13}, Ljava/lang/Enum;->ordinal()I

    move-result v18

    aget v4, v4, v18

    const/4 v0, 0x1

    if-eq v4, v0, :cond_d

    const/4 v0, 0x2

    if-eq v4, v0, :cond_c

    const/4 v0, 0x3

    if-eq v4, v0, :cond_b

    goto :goto_8

    .line 41
    :cond_b
    new-instance v0, Lcom/tencent/ugc/videobase/yuv/TXCGPUImageRGBAToNV21Filter;

    invoke-direct {v0}, Lcom/tencent/ugc/videobase/yuv/TXCGPUImageRGBAToNV21Filter;-><init>()V

    :goto_9
    move-object v4, v0

    const/4 v0, 0x0

    goto :goto_a

    .line 42
    :cond_c
    new-instance v0, Lcom/tencent/ugc/videobase/yuv/TXCGPUImageRGBAToNV12Filter;

    invoke-direct {v0}, Lcom/tencent/ugc/videobase/yuv/TXCGPUImageRGBAToNV12Filter;-><init>()V

    goto :goto_9

    .line 43
    :cond_d
    iget-object v0, v1, Lcom/tencent/ugc/videobase/videobase/a;->d:Lcom/tencent/ugc/videobase/videobase/ConvertParams;

    iget v0, v0, Lcom/tencent/ugc/videobase/videobase/ConvertParams;->height:I

    rem-int/lit8 v0, v0, 0x10

    if-nez v0, :cond_e

    .line 44
    new-instance v0, Lcom/tencent/ugc/videobase/yuv/TXCGPUImageRGBAToI420Filter;

    invoke-direct {v0}, Lcom/tencent/ugc/videobase/yuv/TXCGPUImageRGBAToI420Filter;-><init>()V

    goto :goto_9

    .line 45
    :cond_e
    new-instance v0, Lcom/tencent/ugc/videobase/yuv/TXCGPUImageRGBAToI420NoDiv16Filter;

    invoke-direct {v0}, Lcom/tencent/ugc/videobase/yuv/TXCGPUImageRGBAToI420NoDiv16Filter;-><init>()V

    goto :goto_9

    .line 46
    :goto_a
    invoke-virtual {v4, v0}, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;->initialize(Lcom/tencent/ugc/videobase/frame/GLTexturePool;)V

    .line 47
    iget-object v0, v1, Lcom/tencent/ugc/videobase/videobase/a;->d:Lcom/tencent/ugc/videobase/videobase/ConvertParams;

    move/from16 v18, v5

    iget v5, v0, Lcom/tencent/ugc/videobase/videobase/ConvertParams;->width:I

    iget v0, v0, Lcom/tencent/ugc/videobase/videobase/ConvertParams;->height:I

    invoke-virtual {v4, v5, v0}, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;->onOutputSizeChanged(II)V

    .line 48
    iget-object v0, v1, Lcom/tencent/ugc/videobase/videobase/a;->f:Ljava/util/Map;

    invoke-interface {v0, v13, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_b

    :cond_f
    move/from16 v18, v5

    :goto_b
    if-eqz v4, :cond_15

    const/4 v0, 0x0

    .line 49
    invoke-static {v0, v0, v14, v15}, Lcom/tencent/ugc/videobase/utils/OpenGlUtils;->glViewport(IIII)V

    .line 50
    invoke-virtual {v4, v10, v11}, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;->setColorFormat(Lcom/tencent/liteav/videobase/base/GLConstants$ColorRange;Lcom/tencent/liteav/videobase/base/GLConstants$ColorSpace;)V

    .line 51
    invoke-virtual {v9}, Lcom/tencent/ugc/videobase/frame/GLTexture;->getId()I

    move-result v0

    iget-object v5, v1, Lcom/tencent/ugc/videobase/videobase/a;->b:Ljava/nio/FloatBuffer;

    iget-object v13, v1, Lcom/tencent/ugc/videobase/videobase/a;->c:Ljava/nio/FloatBuffer;

    .line 52
    invoke-virtual {v4, v0, v12, v5, v13}, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;->onDraw(ILcom/tencent/ugc/videobase/frame/GLTexture;Ljava/nio/FloatBuffer;Ljava/nio/FloatBuffer;)V

    .line 53
    invoke-virtual {v9}, Lcom/tencent/ugc/videobase/frame/GLTexture;->getMetaData()Lcom/tencent/ugc/videobase/frame/FrameMetaData;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/tencent/ugc/videobase/frame/GLTexture;->setMetaData(Lcom/tencent/ugc/videobase/frame/FrameMetaData;)V

    .line 54
    aget-object v0, v6, v18

    invoke-virtual {v1, v2, v3, v12, v0}, Lcom/tencent/ugc/videobase/videobase/a;->a(JLcom/tencent/ugc/videobase/frame/GLTexture;Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;)Lcom/tencent/ugc/videobase/frame/PixelFrame;

    move-result-object v0

    if-eqz v0, :cond_15

    .line 55
    invoke-virtual {v12}, Lcom/tencent/ugc/videobase/frame/RefCounted;->release()V

    .line 56
    invoke-virtual {v0}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getPixelBufferType()Lcom/tencent/liteav/videobase/base/GLConstants$a;

    move-result-object v4

    sget-object v5, Lcom/tencent/liteav/videobase/base/GLConstants$a;->a:Lcom/tencent/liteav/videobase/base/GLConstants$a;

    if-ne v4, v5, :cond_10

    invoke-virtual {v0}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object v4

    goto :goto_c

    .line 57
    :cond_10
    invoke-virtual {v0}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getData()[B

    move-result-object v4

    :goto_c
    add-int/lit8 v5, v18, 0x1

    .line 58
    :goto_d
    sget-object v6, Lcom/tencent/ugc/videobase/videobase/a;->a:[Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;

    array-length v12, v6

    if-ge v5, v12, :cond_14

    .line 59
    aget-object v12, v6, v5

    sget-object v13, Lcom/tencent/liteav/videobase/base/GLConstants$a;->a:Lcom/tencent/liteav/videobase/base/GLConstants$a;

    invoke-virtual {v1, v12, v13}, Lcom/tencent/ugc/videobase/videobase/a;->a(Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;Lcom/tencent/liteav/videobase/base/GLConstants$a;)I

    move-result v16

    .line 60
    aget-object v12, v6, v5

    move-object/from16 v18, v0

    sget-object v0, Lcom/tencent/liteav/videobase/base/GLConstants$a;->d:Lcom/tencent/liteav/videobase/base/GLConstants$a;

    invoke-virtual {v1, v12, v0}, Lcom/tencent/ugc/videobase/videobase/a;->a(Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;Lcom/tencent/liteav/videobase/base/GLConstants$a;)I

    move-result v19

    if-eqz v16, :cond_11

    .line 61
    iget-object v0, v1, Lcom/tencent/ugc/videobase/videobase/a;->i:Lcom/tencent/ugc/videobase/frame/PixelFramePool;

    aget-object v6, v6, v5

    .line 62
    invoke-virtual {v0, v14, v15, v13, v6}, Lcom/tencent/ugc/videobase/frame/PixelFramePool;->obtain(IILcom/tencent/liteav/videobase/base/GLConstants$a;Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;)Lcom/tencent/ugc/videobase/frame/PixelFrame;

    move-result-object v0

    goto :goto_e

    :cond_11
    if-eqz v19, :cond_12

    .line 63
    iget-object v12, v1, Lcom/tencent/ugc/videobase/videobase/a;->i:Lcom/tencent/ugc/videobase/frame/PixelFramePool;

    aget-object v6, v6, v5

    .line 64
    invoke-virtual {v12, v14, v15, v0, v6}, Lcom/tencent/ugc/videobase/frame/PixelFramePool;->obtain(IILcom/tencent/liteav/videobase/base/GLConstants$a;Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;)Lcom/tencent/ugc/videobase/frame/PixelFrame;

    move-result-object v0

    goto :goto_e

    :cond_12
    const/4 v0, 0x0

    :goto_e
    if-eqz v0, :cond_13

    .line 65
    invoke-virtual {v0}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->isFrameDataValid()Z

    move-result v6

    if-eqz v6, :cond_13

    .line 66
    invoke-virtual {v0, v10, v11}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->setColorFormat(Lcom/tencent/liteav/videobase/base/GLConstants$ColorRange;Lcom/tencent/liteav/videobase/base/GLConstants$ColorSpace;)V

    move-object v6, v10

    .line 67
    invoke-virtual/range {v18 .. v18}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getPixelFormatType()Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;

    move-result-object v10

    .line 68
    invoke-virtual {v0}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getPixelFormatType()Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;

    move-result-object v12

    invoke-virtual {v0}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object v13

    move-object/from16 v20, v6

    move-object/from16 v21, v11

    move-object v11, v4

    .line 69
    invoke-static/range {v10 .. v15}, Lcom/tencent/ugc/videobase/utils/OpenGlUtils;->convertYuvFormat(Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;Ljava/lang/Object;Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;Ljava/lang/Object;II)V

    .line 70
    invoke-virtual {v9}, Lcom/tencent/ugc/videobase/frame/GLTexture;->getMetaData()Lcom/tencent/ugc/videobase/frame/FrameMetaData;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->setMetaData(Lcom/tencent/ugc/videobase/frame/FrameMetaData;)V

    .line 71
    invoke-virtual {v1, v0, v2, v3}, Lcom/tencent/ugc/videobase/videobase/a;->a(Lcom/tencent/ugc/videobase/frame/PixelFrame;J)V

    move-object v4, v0

    move v0, v5

    move/from16 v5, v16

    move/from16 v6, v19

    const/16 v17, 0x0

    .line 72
    invoke-virtual/range {v1 .. v6}, Lcom/tencent/ugc/videobase/videobase/a;->a(JLcom/tencent/ugc/videobase/frame/PixelFrame;II)V

    .line 73
    invoke-virtual {v4}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->release()V

    goto :goto_f

    :cond_13
    move v0, v5

    move-object/from16 v20, v10

    move-object/from16 v21, v11

    const/16 v17, 0x0

    move-object v11, v4

    :goto_f
    add-int/lit8 v5, v0, 0x1

    move-wide/from16 v2, p1

    move-object v4, v11

    move-object/from16 v0, v18

    move-object/from16 v10, v20

    move-object/from16 v11, v21

    goto :goto_d

    :cond_14
    move-object/from16 v18, v0

    .line 74
    invoke-virtual/range {v18 .. v18}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->release()V

    .line 75
    :cond_15
    invoke-virtual {v9}, Lcom/tencent/ugc/videobase/frame/RefCounted;->release()V

    goto :goto_10

    :cond_16
    move-object/from16 v8, p3

    :goto_10
    move-object/from16 v0, p0

    move-wide/from16 v2, p1

    goto/16 :goto_0

    :cond_17
    return-void
.end method

.method public removeListener(ILcom/tencent/ugc/videobase/videobase/FrameConverter$FrameConvertListener;)V
    .locals 4

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    iget-object v1, p0, Lcom/tencent/ugc/videobase/videobase/FrameConverter;->mSameParamsConverts:Ljava/util/Map;

    .line 8
    .line 9
    .line 10
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    .line 14
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    .line 18
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    move-result v2

    .line 20
    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    move-result-object v2

    .line 26
    .line 27
    check-cast v2, Ljava/util/Map$Entry;

    .line 28
    .line 29
    .line 30
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 31
    move-result-object v3

    .line 32
    .line 33
    check-cast v3, Lcom/tencent/ugc/videobase/videobase/a;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3, p1, p2}, Lcom/tencent/ugc/videobase/videobase/a;->a(ILcom/tencent/ugc/videobase/videobase/FrameConverter$FrameConvertListener;)V

    .line 37
    .line 38
    .line 39
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 40
    move-result-object v3

    .line 41
    .line 42
    check-cast v3, Lcom/tencent/ugc/videobase/videobase/a;

    .line 43
    .line 44
    iget-object v3, v3, Lcom/tencent/ugc/videobase/videobase/a;->e:Ljava/util/Map;

    .line 45
    .line 46
    .line 47
    invoke-interface {v3}, Ljava/util/Map;->isEmpty()Z

    .line 48
    move-result v3

    .line 49
    .line 50
    if-eqz v3, :cond_0

    .line 51
    .line 52
    .line 53
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 54
    move-result-object v2

    .line 55
    .line 56
    .line 57
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 58
    goto :goto_0

    .line 59
    .line 60
    .line 61
    :cond_1
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 62
    move-result-object p1

    .line 63
    .line 64
    .line 65
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    move-result p2

    .line 67
    .line 68
    if-eqz p2, :cond_3

    .line 69
    .line 70
    .line 71
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    move-result-object p2

    .line 73
    .line 74
    check-cast p2, Lcom/tencent/ugc/videobase/videobase/ConvertParams;

    .line 75
    .line 76
    iget-object v0, p0, Lcom/tencent/ugc/videobase/videobase/FrameConverter;->mSameParamsConverts:Ljava/util/Map;

    .line 77
    .line 78
    .line 79
    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    move-result-object v0

    .line 81
    .line 82
    check-cast v0, Lcom/tencent/ugc/videobase/videobase/a;

    .line 83
    .line 84
    if-eqz v0, :cond_2

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0}, Lcom/tencent/ugc/videobase/videobase/a;->a()V

    .line 88
    .line 89
    :cond_2
    iget-object v0, p0, Lcom/tencent/ugc/videobase/videobase/FrameConverter;->mSameParamsConverts:Ljava/util/Map;

    .line 90
    .line 91
    .line 92
    invoke-interface {v0, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    goto :goto_1

    .line 94
    :cond_3
    return-void
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
.end method

.method public uninitialize()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/ugc/videobase/videobase/FrameConverter;->mSameParamsConverts:Ljava/util/Map;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    move-result v1

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    check-cast v1, Lcom/tencent/ugc/videobase/videobase/a;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Lcom/tencent/ugc/videobase/videobase/a;->a()V

    .line 26
    goto :goto_0

    .line 27
    :cond_0
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
.end method
