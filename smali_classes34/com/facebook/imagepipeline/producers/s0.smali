.class public Lcom/facebook/imagepipeline/producers/s0;
.super Ljava/lang/Object;
.source "PostprocessedBitmapMemoryCacheProducer.java"

# interfaces
.implements Lcom/facebook/imagepipeline/producers/v0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/imagepipeline/producers/s0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/imagepipeline/producers/v0<",
        "La4/a<",
        "Lx5/e;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final a:Lcom/facebook/imagepipeline/cache/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/imagepipeline/cache/f<",
            "Lq3/a;",
            "Lx5/e;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lq5/h;

.field public final c:Lcom/facebook/imagepipeline/producers/v0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/imagepipeline/producers/v0<",
            "La4/a<",
            "Lx5/e;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/facebook/imagepipeline/cache/f;Lq5/h;Lcom/facebook/imagepipeline/producers/v0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/cache/f<",
            "Lq3/a;",
            "Lx5/e;",
            ">;",
            "Lq5/h;",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "La4/a<",
            "Lx5/e;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/s0;->a:Lcom/facebook/imagepipeline/cache/f;

    .line 6
    .line 7
    iput-object p2, p0, Lcom/facebook/imagepipeline/producers/s0;->b:Lq5/h;

    .line 8
    .line 9
    iput-object p3, p0, Lcom/facebook/imagepipeline/producers/s0;->c:Lcom/facebook/imagepipeline/producers/v0;

    .line 10
    return-void
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
.end method


# virtual methods
.method public a(Lcom/facebook/imagepipeline/producers/m;Lcom/facebook/imagepipeline/producers/w0;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/m<",
            "La4/a<",
            "Lx5/e;",
            ">;>;",
            "Lcom/facebook/imagepipeline/producers/w0;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/w0;->g()Lcom/facebook/imagepipeline/producers/y0;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/w0;->h()Lcom/facebook/imagepipeline/request/ImageRequest;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    .line 11
    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/w0;->a()Ljava/lang/Object;

    .line 12
    move-result-object v2

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Lcom/facebook/imagepipeline/request/ImageRequest;->getPostprocessor()Lcom/facebook/imagepipeline/request/b;

    .line 16
    move-result-object v3

    .line 17
    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    .line 21
    invoke-interface {v3}, Lcom/facebook/imagepipeline/request/b;->getPostprocessorCacheKey()Lq3/a;

    .line 22
    move-result-object v4

    .line 23
    .line 24
    if-nez v4, :cond_1

    .line 25
    :cond_0
    move-object v6, p1

    .line 26
    .line 27
    goto/16 :goto_1

    .line 28
    .line 29
    .line 30
    :cond_1
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/s0;->c()Ljava/lang/String;

    .line 31
    move-result-object v4

    .line 32
    .line 33
    .line 34
    invoke-interface {v0, p2, v4}, Lcom/facebook/imagepipeline/producers/y0;->b(Lcom/facebook/imagepipeline/producers/w0;Ljava/lang/String;)V

    .line 35
    .line 36
    iget-object v4, p0, Lcom/facebook/imagepipeline/producers/s0;->b:Lq5/h;

    .line 37
    .line 38
    .line 39
    invoke-interface {v4, v1, v2}, Lq5/h;->a(Lcom/facebook/imagepipeline/request/ImageRequest;Ljava/lang/Object;)Lq3/a;

    .line 40
    move-result-object v7

    .line 41
    .line 42
    .line 43
    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/w0;->h()Lcom/facebook/imagepipeline/request/ImageRequest;

    .line 44
    move-result-object v1

    .line 45
    const/4 v2, 0x1

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, v2}, Lcom/facebook/imagepipeline/request/ImageRequest;->isCacheEnabled(I)Z

    .line 49
    move-result v1

    .line 50
    const/4 v4, 0x0

    .line 51
    .line 52
    if-eqz v1, :cond_2

    .line 53
    .line 54
    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/s0;->a:Lcom/facebook/imagepipeline/cache/f;

    .line 55
    .line 56
    .line 57
    invoke-interface {v1, v7}, Lcom/facebook/imagepipeline/cache/f;->get(Ljava/lang/Object;)La4/a;

    .line 58
    move-result-object v1

    .line 59
    goto :goto_0

    .line 60
    :cond_2
    move-object v1, v4

    .line 61
    .line 62
    :goto_0
    const-string v11, "cached_value_found"

    .line 63
    .line 64
    if-eqz v1, :cond_4

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/s0;->c()Ljava/lang/String;

    .line 68
    move-result-object v3

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/s0;->c()Ljava/lang/String;

    .line 72
    move-result-object v5

    .line 73
    .line 74
    .line 75
    invoke-interface {v0, p2, v5}, Lcom/facebook/imagepipeline/producers/y0;->f(Lcom/facebook/imagepipeline/producers/w0;Ljava/lang/String;)Z

    .line 76
    move-result v5

    .line 77
    .line 78
    if-eqz v5, :cond_3

    .line 79
    .line 80
    .line 81
    const-string/jumbo v4, "true"

    .line 82
    .line 83
    .line 84
    invoke-static {v11, v4}, Lcom/facebook/common/internal/ImmutableMap;->of(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 85
    move-result-object v4

    .line 86
    .line 87
    .line 88
    :cond_3
    invoke-interface {v0, p2, v3, v4}, Lcom/facebook/imagepipeline/producers/y0;->j(Lcom/facebook/imagepipeline/producers/w0;Ljava/lang/String;Ljava/util/Map;)V

    .line 89
    .line 90
    const-string v3, "PostprocessedBitmapMemoryCacheProducer"

    .line 91
    .line 92
    .line 93
    invoke-interface {v0, p2, v3, v2}, Lcom/facebook/imagepipeline/producers/y0;->a(Lcom/facebook/imagepipeline/producers/w0;Ljava/lang/String;Z)V

    .line 94
    .line 95
    const-string v0, "memory_bitmap"

    .line 96
    .line 97
    .line 98
    const-string/jumbo v3, "postprocessed"

    .line 99
    .line 100
    .line 101
    invoke-interface {p2, v0, v3}, Lcom/facebook/imagepipeline/producers/w0;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    .line 103
    const/high16 p2, 0x3f800000    # 1.0f

    .line 104
    .line 105
    .line 106
    invoke-interface {p1, p2}, Lcom/facebook/imagepipeline/producers/m;->c(F)V

    .line 107
    .line 108
    .line 109
    invoke-interface {p1, v1, v2}, Lcom/facebook/imagepipeline/producers/m;->b(Ljava/lang/Object;I)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1}, La4/a;->close()V

    .line 113
    return-void

    .line 114
    .line 115
    :cond_4
    instance-of v8, v3, Lcom/facebook/imagepipeline/request/c;

    .line 116
    .line 117
    .line 118
    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/w0;->h()Lcom/facebook/imagepipeline/request/ImageRequest;

    .line 119
    move-result-object v1

    .line 120
    const/4 v2, 0x2

    .line 121
    .line 122
    .line 123
    invoke-virtual {v1, v2}, Lcom/facebook/imagepipeline/request/ImageRequest;->isCacheEnabled(I)Z

    .line 124
    move-result v10

    .line 125
    .line 126
    new-instance v5, Lcom/facebook/imagepipeline/producers/s0$a;

    .line 127
    .line 128
    iget-object v9, p0, Lcom/facebook/imagepipeline/producers/s0;->a:Lcom/facebook/imagepipeline/cache/f;

    .line 129
    move-object v6, p1

    .line 130
    .line 131
    .line 132
    invoke-direct/range {v5 .. v10}, Lcom/facebook/imagepipeline/producers/s0$a;-><init>(Lcom/facebook/imagepipeline/producers/m;Lq3/a;ZLcom/facebook/imagepipeline/cache/f;Z)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/s0;->c()Ljava/lang/String;

    .line 136
    move-result-object p1

    .line 137
    .line 138
    .line 139
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/s0;->c()Ljava/lang/String;

    .line 140
    move-result-object v1

    .line 141
    .line 142
    .line 143
    invoke-interface {v0, p2, v1}, Lcom/facebook/imagepipeline/producers/y0;->f(Lcom/facebook/imagepipeline/producers/w0;Ljava/lang/String;)Z

    .line 144
    move-result v1

    .line 145
    .line 146
    if-eqz v1, :cond_5

    .line 147
    .line 148
    const-string v1, "false"

    .line 149
    .line 150
    .line 151
    invoke-static {v11, v1}, Lcom/facebook/common/internal/ImmutableMap;->of(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 152
    move-result-object v4

    .line 153
    .line 154
    .line 155
    :cond_5
    invoke-interface {v0, p2, p1, v4}, Lcom/facebook/imagepipeline/producers/y0;->j(Lcom/facebook/imagepipeline/producers/w0;Ljava/lang/String;Ljava/util/Map;)V

    .line 156
    .line 157
    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/s0;->c:Lcom/facebook/imagepipeline/producers/v0;

    .line 158
    .line 159
    .line 160
    invoke-interface {p1, v5, p2}, Lcom/facebook/imagepipeline/producers/v0;->a(Lcom/facebook/imagepipeline/producers/m;Lcom/facebook/imagepipeline/producers/w0;)V

    .line 161
    return-void

    .line 162
    .line 163
    :goto_1
    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/s0;->c:Lcom/facebook/imagepipeline/producers/v0;

    .line 164
    .line 165
    .line 166
    invoke-interface {p1, v6, p2}, Lcom/facebook/imagepipeline/producers/v0;->a(Lcom/facebook/imagepipeline/producers/m;Lcom/facebook/imagepipeline/producers/w0;)V

    .line 167
    return-void
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
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    const-string v0, "PostprocessedBitmapMemoryCacheProducer"

    .line 3
    return-object v0
    .line 4
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
.end method
