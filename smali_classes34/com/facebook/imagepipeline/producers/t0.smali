.class public Lcom/facebook/imagepipeline/producers/t0;
.super Ljava/lang/Object;
.source "PostprocessorProducer.java"

# interfaces
.implements Lcom/facebook/imagepipeline/producers/v0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/imagepipeline/producers/t0$b;,
        Lcom/facebook/imagepipeline/producers/t0$c;,
        Lcom/facebook/imagepipeline/producers/t0$a;
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
.field public final a:Lcom/facebook/imagepipeline/producers/v0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/imagepipeline/producers/v0<",
            "La4/a<",
            "Lx5/e;",
            ">;>;"
        }
    .end annotation
.end field

.field public final b:Lp5/c;

.field public final c:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Lcom/facebook/imagepipeline/producers/v0;Lp5/c;Ljava/util/concurrent/Executor;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "La4/a<",
            "Lx5/e;",
            ">;>;",
            "Lp5/c;",
            "Ljava/util/concurrent/Executor;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lw3/h;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    move-result-object p1

    .line 8
    .line 9
    check-cast p1, Lcom/facebook/imagepipeline/producers/v0;

    .line 10
    .line 11
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/t0;->a:Lcom/facebook/imagepipeline/producers/v0;

    .line 12
    .line 13
    iput-object p2, p0, Lcom/facebook/imagepipeline/producers/t0;->b:Lp5/c;

    .line 14
    .line 15
    .line 16
    invoke-static {p3}, Lw3/h;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    move-result-object p1

    .line 18
    .line 19
    check-cast p1, Ljava/util/concurrent/Executor;

    .line 20
    .line 21
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/t0;->c:Ljava/util/concurrent/Executor;

    .line 22
    return-void
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

.method public static bridge synthetic c(Lcom/facebook/imagepipeline/producers/t0;)Lp5/c;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/facebook/imagepipeline/producers/t0;->b:Lp5/c;

    .line 3
    return-object p0
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
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static bridge synthetic d(Lcom/facebook/imagepipeline/producers/t0;)Ljava/util/concurrent/Executor;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/facebook/imagepipeline/producers/t0;->c:Ljava/util/concurrent/Executor;

    .line 3
    return-object p0
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
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method


# virtual methods
.method public a(Lcom/facebook/imagepipeline/producers/m;Lcom/facebook/imagepipeline/producers/w0;)V
    .locals 11
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
    move-result-object v3

    .line 5
    .line 6
    .line 7
    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/w0;->h()Lcom/facebook/imagepipeline/request/ImageRequest;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/facebook/imagepipeline/request/ImageRequest;->getPostprocessor()Lcom/facebook/imagepipeline/request/b;

    .line 12
    move-result-object v4

    .line 13
    .line 14
    .line 15
    invoke-static {v4}, Lw3/h;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    new-instance v0, Lcom/facebook/imagepipeline/producers/t0$a;

    .line 18
    move-object v1, p0

    .line 19
    move-object v2, p1

    .line 20
    move-object v5, p2

    .line 21
    .line 22
    .line 23
    invoke-direct/range {v0 .. v5}, Lcom/facebook/imagepipeline/producers/t0$a;-><init>(Lcom/facebook/imagepipeline/producers/t0;Lcom/facebook/imagepipeline/producers/m;Lcom/facebook/imagepipeline/producers/y0;Lcom/facebook/imagepipeline/request/b;Lcom/facebook/imagepipeline/producers/w0;)V

    .line 24
    .line 25
    instance-of p1, v4, Lcom/facebook/imagepipeline/request/c;

    .line 26
    .line 27
    if-eqz p1, :cond_0

    .line 28
    move-object v9, v5

    .line 29
    .line 30
    new-instance v5, Lcom/facebook/imagepipeline/producers/t0$b;

    .line 31
    move-object v8, v4

    .line 32
    .line 33
    check-cast v8, Lcom/facebook/imagepipeline/request/c;

    .line 34
    const/4 v10, 0x0

    .line 35
    move-object v6, p0

    .line 36
    move-object v7, v0

    .line 37
    .line 38
    .line 39
    invoke-direct/range {v5 .. v10}, Lcom/facebook/imagepipeline/producers/t0$b;-><init>(Lcom/facebook/imagepipeline/producers/t0;Lcom/facebook/imagepipeline/producers/t0$a;Lcom/facebook/imagepipeline/request/c;Lcom/facebook/imagepipeline/producers/w0;Lcom/facebook/imagepipeline/producers/u0;)V

    .line 40
    move-object v1, v6

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    move-object v1, p0

    .line 43
    move-object v9, v5

    .line 44
    .line 45
    new-instance v5, Lcom/facebook/imagepipeline/producers/t0$c;

    .line 46
    const/4 p1, 0x0

    .line 47
    .line 48
    .line 49
    invoke-direct {v5, p0, v0, p1}, Lcom/facebook/imagepipeline/producers/t0$c;-><init>(Lcom/facebook/imagepipeline/producers/t0;Lcom/facebook/imagepipeline/producers/t0$a;Lcom/facebook/imagepipeline/producers/u0;)V

    .line 50
    .line 51
    :goto_0
    iget-object p1, v1, Lcom/facebook/imagepipeline/producers/t0;->a:Lcom/facebook/imagepipeline/producers/v0;

    .line 52
    .line 53
    .line 54
    invoke-interface {p1, v5, v9}, Lcom/facebook/imagepipeline/producers/v0;->a(Lcom/facebook/imagepipeline/producers/m;Lcom/facebook/imagepipeline/producers/w0;)V

    .line 55
    return-void
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
.end method
