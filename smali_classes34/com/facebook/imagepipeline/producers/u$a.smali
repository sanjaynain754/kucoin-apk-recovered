.class public Lcom/facebook/imagepipeline/producers/u$a;
.super Lcom/facebook/imagepipeline/producers/s;
.source "DiskCacheWriteProducer.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/imagepipeline/producers/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/imagepipeline/producers/s<",
        "Lx5/i;",
        "Lx5/i;",
        ">;"
    }
.end annotation


# instance fields
.field public final c:Lcom/facebook/imagepipeline/producers/w0;

.field public final d:Lw3/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw3/k<",
            "Ls5/b;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Lq5/h;


# direct methods
.method public constructor <init>(Lcom/facebook/imagepipeline/producers/m;Lcom/facebook/imagepipeline/producers/w0;Lw3/k;Lq5/h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/m<",
            "Lx5/i;",
            ">;",
            "Lcom/facebook/imagepipeline/producers/w0;",
            "Lw3/k<",
            "Ls5/b;",
            ">;",
            "Lq5/h;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-direct {p0, p1}, Lcom/facebook/imagepipeline/producers/s;-><init>(Lcom/facebook/imagepipeline/producers/m;)V

    .line 3
    iput-object p2, p0, Lcom/facebook/imagepipeline/producers/u$a;->c:Lcom/facebook/imagepipeline/producers/w0;

    .line 4
    iput-object p3, p0, Lcom/facebook/imagepipeline/producers/u$a;->d:Lw3/k;

    .line 5
    iput-object p4, p0, Lcom/facebook/imagepipeline/producers/u$a;->e:Lq5/h;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/facebook/imagepipeline/producers/m;Lcom/facebook/imagepipeline/producers/w0;Lw3/k;Lq5/h;Lcom/facebook/imagepipeline/producers/v;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/facebook/imagepipeline/producers/u$a;-><init>(Lcom/facebook/imagepipeline/producers/m;Lcom/facebook/imagepipeline/producers/w0;Lw3/k;Lq5/h;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic h(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    .line 2
    check-cast p1, Lx5/i;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/facebook/imagepipeline/producers/u$a;->p(Lx5/i;I)V

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
.end method

.method public p(Lx5/i;I)V
    .locals 8

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/u$a;->c:Lcom/facebook/imagepipeline/producers/w0;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lcom/facebook/imagepipeline/producers/w0;->g()Lcom/facebook/imagepipeline/producers/y0;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/u$a;->c:Lcom/facebook/imagepipeline/producers/w0;

    .line 9
    .line 10
    const-string v2, "DiskCacheWriteProducer"

    .line 11
    .line 12
    .line 13
    invoke-interface {v0, v1, v2}, Lcom/facebook/imagepipeline/producers/y0;->b(Lcom/facebook/imagepipeline/producers/w0;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-static {p2}, Lcom/facebook/imagepipeline/producers/c;->e(I)Z

    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x0

    .line 19
    .line 20
    if-nez v0, :cond_2

    .line 21
    .line 22
    if-eqz p1, :cond_2

    .line 23
    .line 24
    const/16 v0, 0xa

    .line 25
    .line 26
    .line 27
    invoke-static {p2, v0}, Lcom/facebook/imagepipeline/producers/c;->l(II)Z

    .line 28
    move-result v0

    .line 29
    .line 30
    if-nez v0, :cond_2

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Lx5/i;->m()Lcom/facebook/imageformat/ImageFormat;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    sget-object v3, Lcom/facebook/imageformat/ImageFormat;->d:Lcom/facebook/imageformat/ImageFormat;

    .line 37
    .line 38
    if-ne v0, v3, :cond_0

    .line 39
    goto :goto_0

    .line 40
    .line 41
    :cond_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/u$a;->c:Lcom/facebook/imagepipeline/producers/w0;

    .line 42
    .line 43
    .line 44
    invoke-interface {v0}, Lcom/facebook/imagepipeline/producers/w0;->h()Lcom/facebook/imagepipeline/request/ImageRequest;

    .line 45
    move-result-object v0

    .line 46
    .line 47
    iget-object v3, p0, Lcom/facebook/imagepipeline/producers/u$a;->e:Lq5/h;

    .line 48
    .line 49
    iget-object v4, p0, Lcom/facebook/imagepipeline/producers/u$a;->c:Lcom/facebook/imagepipeline/producers/w0;

    .line 50
    .line 51
    .line 52
    invoke-interface {v4}, Lcom/facebook/imagepipeline/producers/w0;->a()Ljava/lang/Object;

    .line 53
    move-result-object v4

    .line 54
    .line 55
    .line 56
    invoke-interface {v3, v0, v4}, Lq5/h;->b(Lcom/facebook/imagepipeline/request/ImageRequest;Ljava/lang/Object;)Lq3/a;

    .line 57
    move-result-object v3

    .line 58
    .line 59
    iget-object v4, p0, Lcom/facebook/imagepipeline/producers/u$a;->d:Lw3/k;

    .line 60
    .line 61
    .line 62
    invoke-interface {v4}, Lw3/k;->get()Ljava/lang/Object;

    .line 63
    move-result-object v4

    .line 64
    .line 65
    check-cast v4, Ls5/b;

    .line 66
    .line 67
    .line 68
    invoke-interface {v4}, Ls5/b;->a()Lcom/facebook/imagepipeline/cache/BufferedDiskCache;

    .line 69
    move-result-object v5

    .line 70
    .line 71
    .line 72
    invoke-interface {v4}, Ls5/b;->b()Lcom/facebook/imagepipeline/cache/BufferedDiskCache;

    .line 73
    move-result-object v6

    .line 74
    .line 75
    .line 76
    invoke-interface {v4}, Ls5/b;->c()Lcom/facebook/common/internal/ImmutableMap;

    .line 77
    move-result-object v4

    .line 78
    .line 79
    .line 80
    invoke-static {v0, v5, v6, v4}, Lcom/facebook/imagepipeline/producers/DiskCacheDecision;->a(Lcom/facebook/imagepipeline/request/ImageRequest;Lcom/facebook/imagepipeline/cache/BufferedDiskCache;Lcom/facebook/imagepipeline/cache/BufferedDiskCache;Ljava/util/Map;)Lcom/facebook/imagepipeline/cache/BufferedDiskCache;

    .line 81
    move-result-object v4

    .line 82
    .line 83
    if-nez v4, :cond_1

    .line 84
    .line 85
    iget-object v3, p0, Lcom/facebook/imagepipeline/producers/u$a;->c:Lcom/facebook/imagepipeline/producers/w0;

    .line 86
    .line 87
    .line 88
    invoke-interface {v3}, Lcom/facebook/imagepipeline/producers/w0;->g()Lcom/facebook/imagepipeline/producers/y0;

    .line 89
    move-result-object v3

    .line 90
    .line 91
    iget-object v4, p0, Lcom/facebook/imagepipeline/producers/u$a;->c:Lcom/facebook/imagepipeline/producers/w0;

    .line 92
    .line 93
    new-instance v5, Lcom/facebook/imagepipeline/producers/DiskCacheDecision$DiskCacheDecisionNoDiskCacheChosenException;

    .line 94
    .line 95
    new-instance v6, Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 99
    .line 100
    const-string v7, "Got no disk cache for CacheChoice: "

    .line 101
    .line 102
    .line 103
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0}, Lcom/facebook/imagepipeline/request/ImageRequest;->getCacheChoice()Lcom/facebook/imagepipeline/request/ImageRequest$CacheChoice;

    .line 107
    move-result-object v0

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 111
    move-result v0

    .line 112
    .line 113
    .line 114
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 115
    move-result-object v0

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    .line 119
    move-result-object v0

    .line 120
    .line 121
    .line 122
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 126
    move-result-object v0

    .line 127
    .line 128
    .line 129
    invoke-direct {v5, v0}, Lcom/facebook/imagepipeline/producers/DiskCacheDecision$DiskCacheDecisionNoDiskCacheChosenException;-><init>(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    invoke-interface {v3, v4, v2, v5, v1}, Lcom/facebook/imagepipeline/producers/y0;->k(Lcom/facebook/imagepipeline/producers/w0;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/Map;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/s;->o()Lcom/facebook/imagepipeline/producers/m;

    .line 136
    move-result-object v0

    .line 137
    .line 138
    .line 139
    invoke-interface {v0, p1, p2}, Lcom/facebook/imagepipeline/producers/m;->b(Ljava/lang/Object;I)V

    .line 140
    return-void

    .line 141
    .line 142
    .line 143
    :cond_1
    invoke-virtual {v4, v3, p1}, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->p(Lq3/a;Lx5/i;)V

    .line 144
    .line 145
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/u$a;->c:Lcom/facebook/imagepipeline/producers/w0;

    .line 146
    .line 147
    .line 148
    invoke-interface {v0}, Lcom/facebook/imagepipeline/producers/w0;->g()Lcom/facebook/imagepipeline/producers/y0;

    .line 149
    move-result-object v0

    .line 150
    .line 151
    iget-object v3, p0, Lcom/facebook/imagepipeline/producers/u$a;->c:Lcom/facebook/imagepipeline/producers/w0;

    .line 152
    .line 153
    .line 154
    invoke-interface {v0, v3, v2, v1}, Lcom/facebook/imagepipeline/producers/y0;->j(Lcom/facebook/imagepipeline/producers/w0;Ljava/lang/String;Ljava/util/Map;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/s;->o()Lcom/facebook/imagepipeline/producers/m;

    .line 158
    move-result-object v0

    .line 159
    .line 160
    .line 161
    invoke-interface {v0, p1, p2}, Lcom/facebook/imagepipeline/producers/m;->b(Ljava/lang/Object;I)V

    .line 162
    return-void

    .line 163
    .line 164
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/u$a;->c:Lcom/facebook/imagepipeline/producers/w0;

    .line 165
    .line 166
    .line 167
    invoke-interface {v0}, Lcom/facebook/imagepipeline/producers/w0;->g()Lcom/facebook/imagepipeline/producers/y0;

    .line 168
    move-result-object v0

    .line 169
    .line 170
    iget-object v3, p0, Lcom/facebook/imagepipeline/producers/u$a;->c:Lcom/facebook/imagepipeline/producers/w0;

    .line 171
    .line 172
    .line 173
    invoke-interface {v0, v3, v2, v1}, Lcom/facebook/imagepipeline/producers/y0;->j(Lcom/facebook/imagepipeline/producers/w0;Ljava/lang/String;Ljava/util/Map;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/s;->o()Lcom/facebook/imagepipeline/producers/m;

    .line 177
    move-result-object v0

    .line 178
    .line 179
    .line 180
    invoke-interface {v0, p1, p2}, Lcom/facebook/imagepipeline/producers/m;->b(Ljava/lang/Object;I)V

    .line 181
    return-void
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
.end method
