.class public Lcom/facebook/imagepipeline/producers/j1$a;
.super Lcom/facebook/imagepipeline/producers/s;
.source "ThumbnailBranchProducer.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/imagepipeline/producers/j1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
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

.field public final d:I

.field public final e:Lcom/facebook/imagepipeline/common/ResizeOptions;

.field public final synthetic f:Lcom/facebook/imagepipeline/producers/j1;


# direct methods
.method public constructor <init>(Lcom/facebook/imagepipeline/producers/j1;Lcom/facebook/imagepipeline/producers/m;Lcom/facebook/imagepipeline/producers/w0;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/m<",
            "Lx5/i;",
            ">;",
            "Lcom/facebook/imagepipeline/producers/w0;",
            "I)V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/j1$a;->f:Lcom/facebook/imagepipeline/producers/j1;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, p2}, Lcom/facebook/imagepipeline/producers/s;-><init>(Lcom/facebook/imagepipeline/producers/m;)V

    .line 6
    .line 7
    iput-object p3, p0, Lcom/facebook/imagepipeline/producers/j1$a;->c:Lcom/facebook/imagepipeline/producers/w0;

    .line 8
    .line 9
    iput p4, p0, Lcom/facebook/imagepipeline/producers/j1$a;->d:I

    .line 10
    .line 11
    .line 12
    invoke-interface {p3}, Lcom/facebook/imagepipeline/producers/w0;->h()Lcom/facebook/imagepipeline/request/ImageRequest;

    .line 13
    move-result-object p1

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/request/ImageRequest;->getResizeOptions()Lcom/facebook/imagepipeline/common/ResizeOptions;

    .line 17
    move-result-object p1

    .line 18
    .line 19
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/j1$a;->e:Lcom/facebook/imagepipeline/common/ResizeOptions;

    .line 20
    return-void
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
.end method


# virtual methods
.method public g(Ljava/lang/Throwable;)V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/j1$a;->f:Lcom/facebook/imagepipeline/producers/j1;

    .line 3
    .line 4
    iget v1, p0, Lcom/facebook/imagepipeline/producers/j1$a;->d:I

    .line 5
    .line 6
    add-int/lit8 v1, v1, 0x1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/s;->o()Lcom/facebook/imagepipeline/producers/m;

    .line 10
    move-result-object v2

    .line 11
    .line 12
    iget-object v3, p0, Lcom/facebook/imagepipeline/producers/j1$a;->c:Lcom/facebook/imagepipeline/producers/w0;

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1, v2, v3}, Lcom/facebook/imagepipeline/producers/j1;->c(Lcom/facebook/imagepipeline/producers/j1;ILcom/facebook/imagepipeline/producers/m;Lcom/facebook/imagepipeline/producers/w0;)Z

    .line 16
    move-result v0

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/s;->o()Lcom/facebook/imagepipeline/producers/m;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    .line 25
    invoke-interface {v0, p1}, Lcom/facebook/imagepipeline/producers/m;->onFailure(Ljava/lang/Throwable;)V

    .line 26
    :cond_0
    return-void
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
.end method

.method public bridge synthetic h(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    .line 2
    check-cast p1, Lx5/i;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/facebook/imagepipeline/producers/j1$a;->p(Lx5/i;I)V

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
    .locals 3

    .line 1
    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    .line 5
    invoke-static {p2}, Lcom/facebook/imagepipeline/producers/c;->e(I)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/j1$a;->e:Lcom/facebook/imagepipeline/common/ResizeOptions;

    .line 11
    .line 12
    .line 13
    invoke-static {p1, v0}, Lcom/facebook/imagepipeline/producers/l1;->c(Lx5/i;Lcom/facebook/imagepipeline/common/ResizeOptions;)Z

    .line 14
    move-result v0

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/s;->o()Lcom/facebook/imagepipeline/producers/m;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    .line 23
    invoke-interface {v0, p1, p2}, Lcom/facebook/imagepipeline/producers/m;->b(Ljava/lang/Object;I)V

    .line 24
    return-void

    .line 25
    .line 26
    .line 27
    :cond_1
    invoke-static {p2}, Lcom/facebook/imagepipeline/producers/c;->d(I)Z

    .line 28
    move-result p2

    .line 29
    .line 30
    if-eqz p2, :cond_2

    .line 31
    .line 32
    .line 33
    invoke-static {p1}, Lx5/i;->g(Lx5/i;)V

    .line 34
    .line 35
    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/j1$a;->f:Lcom/facebook/imagepipeline/producers/j1;

    .line 36
    .line 37
    iget p2, p0, Lcom/facebook/imagepipeline/producers/j1$a;->d:I

    .line 38
    const/4 v0, 0x1

    .line 39
    add-int/2addr p2, v0

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/s;->o()Lcom/facebook/imagepipeline/producers/m;

    .line 43
    move-result-object v1

    .line 44
    .line 45
    iget-object v2, p0, Lcom/facebook/imagepipeline/producers/j1$a;->c:Lcom/facebook/imagepipeline/producers/w0;

    .line 46
    .line 47
    .line 48
    invoke-static {p1, p2, v1, v2}, Lcom/facebook/imagepipeline/producers/j1;->c(Lcom/facebook/imagepipeline/producers/j1;ILcom/facebook/imagepipeline/producers/m;Lcom/facebook/imagepipeline/producers/w0;)Z

    .line 49
    move-result p1

    .line 50
    .line 51
    if-nez p1, :cond_2

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/s;->o()Lcom/facebook/imagepipeline/producers/m;

    .line 55
    move-result-object p1

    .line 56
    const/4 p2, 0x0

    .line 57
    .line 58
    .line 59
    invoke-interface {p1, p2, v0}, Lcom/facebook/imagepipeline/producers/m;->b(Ljava/lang/Object;I)V

    .line 60
    :cond_2
    return-void
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
