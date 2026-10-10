.class public Lcom/bumptech/glide/g;
.super Ll2/a;
.source "RequestBuilder.java"

# interfaces
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<TranscodeType:",
        "Ljava/lang/Object;",
        ">",
        "Ll2/a<",
        "Lcom/bumptech/glide/g<",
        "TTranscodeType;>;>;",
        "Ljava/lang/Cloneable;"
    }
.end annotation


# static fields
.field public static final P:Ll2/f;


# instance fields
.field public final B:Landroid/content/Context;

.field public final C:Lcom/bumptech/glide/h;

.field public final D:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TTranscodeType;>;"
        }
    .end annotation
.end field

.field public final E:Lcom/bumptech/glide/c;

.field public final F:Lcom/bumptech/glide/e;

.field public G:Lcom/bumptech/glide/i;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/i<",
            "*-TTranscodeType;>;"
        }
    .end annotation
.end field

.field public H:Ljava/lang/Object;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public I:Ljava/util/List;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ll2/e<",
            "TTranscodeType;>;>;"
        }
    .end annotation
.end field

.field public J:Lcom/bumptech/glide/g;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/g<",
            "TTranscodeType;>;"
        }
    .end annotation
.end field

.field public K:Lcom/bumptech/glide/g;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/g<",
            "TTranscodeType;>;"
        }
    .end annotation
.end field

.field public L:Ljava/lang/Float;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public M:Z

.field public N:Z

.field public O:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Ll2/f;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ll2/f;-><init>()V

    .line 6
    .line 7
    sget-object v1, Lv1/c;->c:Lv1/c;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ll2/a;->i(Lv1/c;)Ll2/a;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    check-cast v0, Ll2/f;

    .line 14
    .line 15
    sget-object v1, Lcom/bumptech/glide/Priority;->LOW:Lcom/bumptech/glide/Priority;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ll2/a;->d0(Lcom/bumptech/glide/Priority;)Ll2/a;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    check-cast v0, Ll2/f;

    .line 22
    const/4 v1, 0x1

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ll2/a;->l0(Z)Ll2/a;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    check-cast v0, Ll2/f;

    .line 29
    .line 30
    sput-object v0, Lcom/bumptech/glide/g;->P:Ll2/f;

    .line 31
    return-void
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

.method public constructor <init>(Lcom/bumptech/glide/c;Lcom/bumptech/glide/h;Ljava/lang/Class;Landroid/content/Context;)V
    .locals 1
    .param p1    # Lcom/bumptech/glide/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "CheckResult"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/c;",
            "Lcom/bumptech/glide/h;",
            "Ljava/lang/Class<",
            "TTranscodeType;>;",
            "Landroid/content/Context;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ll2/a;-><init>()V

    .line 4
    const/4 v0, 0x1

    .line 5
    .line 6
    iput-boolean v0, p0, Lcom/bumptech/glide/g;->M:Z

    .line 7
    .line 8
    iput-object p1, p0, Lcom/bumptech/glide/g;->E:Lcom/bumptech/glide/c;

    .line 9
    .line 10
    iput-object p2, p0, Lcom/bumptech/glide/g;->C:Lcom/bumptech/glide/h;

    .line 11
    .line 12
    iput-object p3, p0, Lcom/bumptech/glide/g;->D:Ljava/lang/Class;

    .line 13
    .line 14
    iput-object p4, p0, Lcom/bumptech/glide/g;->B:Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p2, p3}, Lcom/bumptech/glide/h;->r(Ljava/lang/Class;)Lcom/bumptech/glide/i;

    .line 18
    move-result-object p3

    .line 19
    .line 20
    iput-object p3, p0, Lcom/bumptech/glide/g;->G:Lcom/bumptech/glide/i;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/bumptech/glide/c;->i()Lcom/bumptech/glide/e;

    .line 24
    move-result-object p1

    .line 25
    .line 26
    iput-object p1, p0, Lcom/bumptech/glide/g;->F:Lcom/bumptech/glide/e;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p2}, Lcom/bumptech/glide/h;->p()Ljava/util/List;

    .line 30
    move-result-object p1

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, p1}, Lcom/bumptech/glide/g;->A0(Ljava/util/List;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p2}, Lcom/bumptech/glide/h;->q()Ll2/f;

    .line 37
    move-result-object p1

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, p1}, Lcom/bumptech/glide/g;->t0(Ll2/a;)Lcom/bumptech/glide/g;

    .line 41
    return-void
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
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
.end method


# virtual methods
.method public final A0(Ljava/util/List;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "CheckResult"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ll2/e<",
            "Ljava/lang/Object;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    .line 7
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    check-cast v0, Ll2/e;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v0}, Lcom/bumptech/glide/g;->s0(Ll2/e;)Lcom/bumptech/glide/g;

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    return-void
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
.end method

.method public B0(Lm2/j;)Lm2/j;
    .locals 2
    .param p1    # Lm2/j;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Y::",
            "Lm2/j<",
            "TTranscodeType;>;>(TY;)TY;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lp2/e;->b()Ljava/util/concurrent/Executor;

    .line 5
    move-result-object v1

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1, v0, v1}, Lcom/bumptech/glide/g;->C0(Lm2/j;Ll2/e;Ljava/util/concurrent/Executor;)Lm2/j;

    .line 9
    move-result-object p1

    .line 10
    return-object p1
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
.end method

.method public C0(Lm2/j;Ll2/e;Ljava/util/concurrent/Executor;)Lm2/j;
    .locals 0
    .param p1    # Lm2/j;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ll2/e;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Y::",
            "Lm2/j<",
            "TTranscodeType;>;>(TY;",
            "Ll2/e<",
            "TTranscodeType;>;",
            "Ljava/util/concurrent/Executor;",
            ")TY;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p0, p3}, Lcom/bumptech/glide/g;->D0(Lm2/j;Ll2/e;Ll2/a;Ljava/util/concurrent/Executor;)Lm2/j;

    .line 4
    move-result-object p1

    .line 5
    return-object p1
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
.end method

.method public final D0(Lm2/j;Ll2/e;Ll2/a;Ljava/util/concurrent/Executor;)Lm2/j;
    .locals 1
    .param p1    # Lm2/j;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ll2/e;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Y::",
            "Lm2/j<",
            "TTranscodeType;>;>(TY;",
            "Ll2/e<",
            "TTranscodeType;>;",
            "Ll2/a<",
            "*>;",
            "Ljava/util/concurrent/Executor;",
            ")TY;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lp2/j;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/bumptech/glide/g;->N:Z

    .line 6
    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/bumptech/glide/g;->u0(Lm2/j;Ll2/e;Ll2/a;Ljava/util/concurrent/Executor;)Ll2/c;

    .line 11
    move-result-object p2

    .line 12
    .line 13
    .line 14
    invoke-interface {p1}, Lm2/j;->getRequest()Ll2/c;

    .line 15
    move-result-object p4

    .line 16
    .line 17
    .line 18
    invoke-interface {p2, p4}, Ll2/c;->d(Ll2/c;)Z

    .line 19
    move-result v0

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p3, p4}, Lcom/bumptech/glide/g;->F0(Ll2/a;Ll2/c;)Z

    .line 25
    move-result p3

    .line 26
    .line 27
    if-nez p3, :cond_1

    .line 28
    .line 29
    .line 30
    invoke-static {p4}, Lp2/j;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    move-result-object p2

    .line 32
    .line 33
    check-cast p2, Ll2/c;

    .line 34
    .line 35
    .line 36
    invoke-interface {p2}, Ll2/c;->isRunning()Z

    .line 37
    move-result p2

    .line 38
    .line 39
    if-nez p2, :cond_0

    .line 40
    .line 41
    .line 42
    invoke-interface {p4}, Ll2/c;->i()V

    .line 43
    :cond_0
    return-object p1

    .line 44
    .line 45
    :cond_1
    iget-object p3, p0, Lcom/bumptech/glide/g;->C:Lcom/bumptech/glide/h;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p3, p1}, Lcom/bumptech/glide/h;->n(Lm2/j;)V

    .line 49
    .line 50
    .line 51
    invoke-interface {p1, p2}, Lm2/j;->g(Ll2/c;)V

    .line 52
    .line 53
    iget-object p3, p0, Lcom/bumptech/glide/g;->C:Lcom/bumptech/glide/h;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p3, p1, p2}, Lcom/bumptech/glide/h;->B(Lm2/j;Ll2/c;)V

    .line 57
    return-object p1

    .line 58
    .line 59
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 60
    .line 61
    const-string p2, "You must call #load() before calling #into()"

    .line 62
    .line 63
    .line 64
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 65
    throw p1
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
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
.end method

.method public E0(Landroid/widget/ImageView;)Lm2/k;
    .locals 3
    .param p1    # Landroid/widget/ImageView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/ImageView;",
            ")",
            "Lm2/k<",
            "Landroid/widget/ImageView;",
            "TTranscodeType;>;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lp2/k;->b()V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lp2/j;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Ll2/a;->R()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Ll2/a;->P()Z

    .line 16
    move-result v0

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/widget/ImageView;->getScaleType()Landroid/widget/ImageView$ScaleType;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    sget-object v0, Lcom/bumptech/glide/g$a;->a:[I

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Landroid/widget/ImageView;->getScaleType()Landroid/widget/ImageView$ScaleType;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 34
    move-result v1

    .line 35
    .line 36
    aget v0, v0, v1

    .line 37
    .line 38
    .line 39
    packed-switch v0, :pswitch_data_0

    .line 40
    goto :goto_0

    .line 41
    .line 42
    .line 43
    :pswitch_0
    invoke-virtual {p0}, Ll2/a;->f()Ll2/a;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Ll2/a;->V()Ll2/a;

    .line 48
    move-result-object v0

    .line 49
    goto :goto_1

    .line 50
    .line 51
    .line 52
    :pswitch_1
    invoke-virtual {p0}, Ll2/a;->f()Ll2/a;

    .line 53
    move-result-object v0

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Ll2/a;->W()Ll2/a;

    .line 57
    move-result-object v0

    .line 58
    goto :goto_1

    .line 59
    .line 60
    .line 61
    :pswitch_2
    invoke-virtual {p0}, Ll2/a;->f()Ll2/a;

    .line 62
    move-result-object v0

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Ll2/a;->V()Ll2/a;

    .line 66
    move-result-object v0

    .line 67
    goto :goto_1

    .line 68
    .line 69
    .line 70
    :pswitch_3
    invoke-virtual {p0}, Ll2/a;->f()Ll2/a;

    .line 71
    move-result-object v0

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, Ll2/a;->U()Ll2/a;

    .line 75
    move-result-object v0

    .line 76
    goto :goto_1

    .line 77
    :cond_0
    :goto_0
    move-object v0, p0

    .line 78
    .line 79
    :goto_1
    iget-object v1, p0, Lcom/bumptech/glide/g;->F:Lcom/bumptech/glide/e;

    .line 80
    .line 81
    iget-object v2, p0, Lcom/bumptech/glide/g;->D:Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1, p1, v2}, Lcom/bumptech/glide/e;->a(Landroid/widget/ImageView;Ljava/lang/Class;)Lm2/k;

    .line 85
    move-result-object p1

    .line 86
    const/4 v1, 0x0

    .line 87
    .line 88
    .line 89
    invoke-static {}, Lp2/e;->b()Ljava/util/concurrent/Executor;

    .line 90
    move-result-object v2

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0, p1, v1, v0, v2}, Lcom/bumptech/glide/g;->D0(Lm2/j;Ll2/e;Ll2/a;Ljava/util/concurrent/Executor;)Lm2/j;

    .line 94
    move-result-object p1

    .line 95
    .line 96
    check-cast p1, Lm2/k;

    .line 97
    return-object p1

    .line 98
    nop

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
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final F0(Ll2/a;Ll2/c;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll2/a<",
            "*>;",
            "Ll2/c;",
            ")Z"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Ll2/a;->K()Z

    .line 4
    move-result p1

    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-interface {p2}, Ll2/c;->isComplete()Z

    .line 10
    move-result p1

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    const/4 p1, 0x1

    .line 14
    return p1

    .line 15
    :cond_0
    const/4 p1, 0x0

    .line 16
    return p1
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
.end method

.method public G0(Ll2/e;)Lcom/bumptech/glide/g;
    .locals 1
    .param p1    # Ll2/e;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll2/e<",
            "TTranscodeType;>;)",
            "Lcom/bumptech/glide/g<",
            "TTranscodeType;>;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ll2/a;->J()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/bumptech/glide/g;->x0()Lcom/bumptech/glide/g;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lcom/bumptech/glide/g;->G0(Ll2/e;)Lcom/bumptech/glide/g;

    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    .line 18
    iput-object v0, p0, Lcom/bumptech/glide/g;->I:Ljava/util/List;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, p1}, Lcom/bumptech/glide/g;->s0(Ll2/e;)Lcom/bumptech/glide/g;

    .line 22
    move-result-object p1

    .line 23
    return-object p1
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
.end method

.method public H0(Landroid/net/Uri;)Lcom/bumptech/glide/g;
    .locals 0
    .param p1    # Landroid/net/Uri;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            ")",
            "Lcom/bumptech/glide/g<",
            "TTranscodeType;>;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/bumptech/glide/g;->M0(Ljava/lang/Object;)Lcom/bumptech/glide/g;

    .line 4
    move-result-object p1

    .line 5
    return-object p1
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
.end method

.method public I0(Ljava/io/File;)Lcom/bumptech/glide/g;
    .locals 0
    .param p1    # Ljava/io/File;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            ")",
            "Lcom/bumptech/glide/g<",
            "TTranscodeType;>;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/bumptech/glide/g;->M0(Ljava/lang/Object;)Lcom/bumptech/glide/g;

    .line 4
    move-result-object p1

    .line 5
    return-object p1
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
.end method

.method public J0(Ljava/lang/Integer;)Lcom/bumptech/glide/g;
    .locals 1
    .param p1    # Ljava/lang/Integer;
        .annotation build Landroidx/annotation/DrawableRes;
        .end annotation

        .annotation build Landroidx/annotation/Nullable;
        .end annotation

        .annotation build Landroidx/annotation/RawRes;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            ")",
            "Lcom/bumptech/glide/g<",
            "TTranscodeType;>;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/bumptech/glide/g;->M0(Ljava/lang/Object;)Lcom/bumptech/glide/g;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    iget-object v0, p0, Lcom/bumptech/glide/g;->B:Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lo2/a;->c(Landroid/content/Context;)Lt1/b;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Ll2/f;->x0(Lt1/b;)Ll2/f;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v0}, Lcom/bumptech/glide/g;->t0(Ll2/a;)Lcom/bumptech/glide/g;

    .line 18
    move-result-object p1

    .line 19
    return-object p1
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
.end method

.method public K0(Ljava/lang/Object;)Lcom/bumptech/glide/g;
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Lcom/bumptech/glide/g<",
            "TTranscodeType;>;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/bumptech/glide/g;->M0(Ljava/lang/Object;)Lcom/bumptech/glide/g;

    .line 4
    move-result-object p1

    .line 5
    return-object p1
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
.end method

.method public L0(Ljava/lang/String;)Lcom/bumptech/glide/g;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/bumptech/glide/g<",
            "TTranscodeType;>;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/bumptech/glide/g;->M0(Ljava/lang/Object;)Lcom/bumptech/glide/g;

    .line 4
    move-result-object p1

    .line 5
    return-object p1
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
.end method

.method public final M0(Ljava/lang/Object;)Lcom/bumptech/glide/g;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Lcom/bumptech/glide/g<",
            "TTranscodeType;>;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ll2/a;->J()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/bumptech/glide/g;->x0()Lcom/bumptech/glide/g;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lcom/bumptech/glide/g;->M0(Ljava/lang/Object;)Lcom/bumptech/glide/g;

    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    .line 17
    :cond_0
    iput-object p1, p0, Lcom/bumptech/glide/g;->H:Ljava/lang/Object;

    .line 18
    const/4 p1, 0x1

    .line 19
    .line 20
    iput-boolean p1, p0, Lcom/bumptech/glide/g;->N:Z

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Ll2/a;->h0()Ll2/a;

    .line 24
    move-result-object p1

    .line 25
    .line 26
    check-cast p1, Lcom/bumptech/glide/g;

    .line 27
    return-object p1
    .line 28
    .line 29
    .line 30
    .line 31
.end method

.method public final N0(Ljava/lang/Object;Lm2/j;Ll2/e;Ll2/a;Lcom/bumptech/glide/request/RequestCoordinator;Lcom/bumptech/glide/i;Lcom/bumptech/glide/Priority;IILjava/util/concurrent/Executor;)Ll2/c;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lm2/j<",
            "TTranscodeType;>;",
            "Ll2/e<",
            "TTranscodeType;>;",
            "Ll2/a<",
            "*>;",
            "Lcom/bumptech/glide/request/RequestCoordinator;",
            "Lcom/bumptech/glide/i<",
            "*-TTranscodeType;>;",
            "Lcom/bumptech/glide/Priority;",
            "II",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Ll2/c;"
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    iget-object v1, v0, Lcom/bumptech/glide/g;->B:Landroid/content/Context;

    .line 5
    .line 6
    iget-object v2, v0, Lcom/bumptech/glide/g;->F:Lcom/bumptech/glide/e;

    .line 7
    .line 8
    iget-object v4, v0, Lcom/bumptech/glide/g;->H:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object v5, v0, Lcom/bumptech/glide/g;->D:Ljava/lang/Class;

    .line 11
    .line 12
    iget-object v12, v0, Lcom/bumptech/glide/g;->I:Ljava/util/List;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2}, Lcom/bumptech/glide/e;->f()Lcom/bumptech/glide/load/engine/f;

    .line 16
    move-result-object v14

    .line 17
    .line 18
    .line 19
    invoke-virtual/range {p6 .. p6}, Lcom/bumptech/glide/i;->b()Ln2/c;

    .line 20
    move-result-object v15

    .line 21
    .line 22
    move-object/from16 v3, p1

    .line 23
    .line 24
    move-object/from16 v10, p2

    .line 25
    .line 26
    move-object/from16 v11, p3

    .line 27
    .line 28
    move-object/from16 v6, p4

    .line 29
    .line 30
    move-object/from16 v13, p5

    .line 31
    .line 32
    move-object/from16 v9, p7

    .line 33
    .line 34
    move/from16 v7, p8

    .line 35
    .line 36
    move/from16 v8, p9

    .line 37
    .line 38
    move-object/from16 v16, p10

    .line 39
    .line 40
    .line 41
    invoke-static/range {v1 .. v16}, Lcom/bumptech/glide/request/SingleRequest;->w(Landroid/content/Context;Lcom/bumptech/glide/e;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Class;Ll2/a;IILcom/bumptech/glide/Priority;Lm2/j;Ll2/e;Ljava/util/List;Lcom/bumptech/glide/request/RequestCoordinator;Lcom/bumptech/glide/load/engine/f;Ln2/c;Ljava/util/concurrent/Executor;)Lcom/bumptech/glide/request/SingleRequest;

    .line 42
    move-result-object v1

    .line 43
    return-object v1
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
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
.end method

.method public O0()Ll2/b;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ll2/b<",
            "TTranscodeType;>;"
        }
    .end annotation

    .line 1
    .line 2
    const/high16 v0, -0x80000000

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0, v0}, Lcom/bumptech/glide/g;->P0(II)Ll2/b;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
.end method

.method public P0(II)Ll2/b;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Ll2/b<",
            "TTranscodeType;>;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ll2/d;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p1, p2}, Ll2/d;-><init>(II)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lp2/e;->a()Ljava/util/concurrent/Executor;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0, v0, p1}, Lcom/bumptech/glide/g;->C0(Lm2/j;Ll2/e;Ljava/util/concurrent/Executor;)Lm2/j;

    .line 13
    move-result-object p1

    .line 14
    .line 15
    check-cast p1, Ll2/b;

    .line 16
    return-object p1
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
.end method

.method public bridge synthetic a(Ll2/a;)Ll2/a;
    .locals 0
    .param p1    # Ll2/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/bumptech/glide/g;->t0(Ll2/a;)Lcom/bumptech/glide/g;

    .line 4
    move-result-object p1

    .line 5
    return-object p1
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
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/bumptech/glide/g;->x0()Lcom/bumptech/glide/g;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method

.method public bridge synthetic f()Ll2/a;
    .locals 1
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/bumptech/glide/g;->x0()Lcom/bumptech/glide/g;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method

.method public s0(Ll2/e;)Lcom/bumptech/glide/g;
    .locals 1
    .param p1    # Ll2/e;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll2/e<",
            "TTranscodeType;>;)",
            "Lcom/bumptech/glide/g<",
            "TTranscodeType;>;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ll2/a;->J()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/bumptech/glide/g;->x0()Lcom/bumptech/glide/g;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lcom/bumptech/glide/g;->s0(Ll2/e;)Lcom/bumptech/glide/g;

    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    .line 17
    :cond_0
    if-eqz p1, :cond_2

    .line 18
    .line 19
    iget-object v0, p0, Lcom/bumptech/glide/g;->I:Ljava/util/List;

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    new-instance v0, Ljava/util/ArrayList;

    .line 24
    .line 25
    .line 26
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 27
    .line 28
    iput-object v0, p0, Lcom/bumptech/glide/g;->I:Ljava/util/List;

    .line 29
    .line 30
    :cond_1
    iget-object v0, p0, Lcom/bumptech/glide/g;->I:Ljava/util/List;

    .line 31
    .line 32
    .line 33
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    :cond_2
    invoke-virtual {p0}, Ll2/a;->h0()Ll2/a;

    .line 37
    move-result-object p1

    .line 38
    .line 39
    check-cast p1, Lcom/bumptech/glide/g;

    .line 40
    return-object p1
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
.end method

.method public t0(Ll2/a;)Lcom/bumptech/glide/g;
    .locals 0
    .param p1    # Ll2/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll2/a<",
            "*>;)",
            "Lcom/bumptech/glide/g<",
            "TTranscodeType;>;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lp2/j;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Ll2/a;->a(Ll2/a;)Ll2/a;

    .line 7
    move-result-object p1

    .line 8
    .line 9
    check-cast p1, Lcom/bumptech/glide/g;

    .line 10
    return-object p1
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
.end method

.method public final u0(Lm2/j;Ll2/e;Ll2/a;Ljava/util/concurrent/Executor;)Ll2/c;
    .locals 11
    .param p2    # Ll2/e;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm2/j<",
            "TTranscodeType;>;",
            "Ll2/e<",
            "TTranscodeType;>;",
            "Ll2/a<",
            "*>;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Ll2/c;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v1, Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    iget-object v5, p0, Lcom/bumptech/glide/g;->G:Lcom/bumptech/glide/i;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p3}, Ll2/a;->B()Lcom/bumptech/glide/Priority;

    .line 11
    move-result-object v6

    .line 12
    .line 13
    .line 14
    invoke-virtual {p3}, Ll2/a;->y()I

    .line 15
    move-result v7

    .line 16
    .line 17
    .line 18
    invoke-virtual {p3}, Ll2/a;->x()I

    .line 19
    move-result v8

    .line 20
    const/4 v4, 0x0

    .line 21
    move-object v0, p0

    .line 22
    move-object v2, p1

    .line 23
    move-object v3, p2

    .line 24
    move-object v9, p3

    .line 25
    move-object v10, p4

    .line 26
    .line 27
    .line 28
    invoke-virtual/range {v0 .. v10}, Lcom/bumptech/glide/g;->v0(Ljava/lang/Object;Lm2/j;Ll2/e;Lcom/bumptech/glide/request/RequestCoordinator;Lcom/bumptech/glide/i;Lcom/bumptech/glide/Priority;IILl2/a;Ljava/util/concurrent/Executor;)Ll2/c;

    .line 29
    move-result-object p1

    .line 30
    return-object p1
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
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
.end method

.method public final v0(Ljava/lang/Object;Lm2/j;Ll2/e;Lcom/bumptech/glide/request/RequestCoordinator;Lcom/bumptech/glide/i;Lcom/bumptech/glide/Priority;IILl2/a;Ljava/util/concurrent/Executor;)Ll2/c;
    .locals 13
    .param p3    # Ll2/e;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Lcom/bumptech/glide/request/RequestCoordinator;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lm2/j<",
            "TTranscodeType;>;",
            "Ll2/e<",
            "TTranscodeType;>;",
            "Lcom/bumptech/glide/request/RequestCoordinator;",
            "Lcom/bumptech/glide/i<",
            "*-TTranscodeType;>;",
            "Lcom/bumptech/glide/Priority;",
            "II",
            "Ll2/a<",
            "*>;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Ll2/c;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/bumptech/glide/g;->K:Lcom/bumptech/glide/g;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lcom/bumptech/glide/request/a;

    .line 7
    .line 8
    move-object/from16 v1, p4

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, p1, v1}, Lcom/bumptech/glide/request/a;-><init>(Ljava/lang/Object;Lcom/bumptech/glide/request/RequestCoordinator;)V

    .line 12
    move-object v5, v0

    .line 13
    move-object v1, p0

    .line 14
    move-object v2, p1

    .line 15
    move-object v3, p2

    .line 16
    .line 17
    move-object/from16 v4, p3

    .line 18
    .line 19
    move-object/from16 v6, p5

    .line 20
    .line 21
    move-object/from16 v7, p6

    .line 22
    .line 23
    move/from16 v8, p7

    .line 24
    .line 25
    move/from16 v9, p8

    .line 26
    .line 27
    move-object/from16 v10, p9

    .line 28
    .line 29
    move-object/from16 v11, p10

    .line 30
    goto :goto_0

    .line 31
    .line 32
    :cond_0
    move-object/from16 v1, p4

    .line 33
    const/4 v0, 0x0

    .line 34
    move-object v5, v1

    .line 35
    move-object v2, p1

    .line 36
    move-object v3, p2

    .line 37
    .line 38
    move-object/from16 v4, p3

    .line 39
    .line 40
    move-object/from16 v6, p5

    .line 41
    .line 42
    move-object/from16 v7, p6

    .line 43
    .line 44
    move/from16 v8, p7

    .line 45
    .line 46
    move/from16 v9, p8

    .line 47
    .line 48
    move-object/from16 v10, p9

    .line 49
    .line 50
    move-object/from16 v11, p10

    .line 51
    move-object v1, p0

    .line 52
    .line 53
    .line 54
    :goto_0
    invoke-virtual/range {v1 .. v11}, Lcom/bumptech/glide/g;->w0(Ljava/lang/Object;Lm2/j;Ll2/e;Lcom/bumptech/glide/request/RequestCoordinator;Lcom/bumptech/glide/i;Lcom/bumptech/glide/Priority;IILl2/a;Ljava/util/concurrent/Executor;)Ll2/c;

    .line 55
    move-result-object v12

    .line 56
    .line 57
    if-nez v0, :cond_1

    .line 58
    return-object v12

    .line 59
    .line 60
    :cond_1
    iget-object v1, p0, Lcom/bumptech/glide/g;->K:Lcom/bumptech/glide/g;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1}, Ll2/a;->y()I

    .line 64
    move-result v1

    .line 65
    .line 66
    iget-object v2, p0, Lcom/bumptech/glide/g;->K:Lcom/bumptech/glide/g;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2}, Ll2/a;->x()I

    .line 70
    move-result v2

    .line 71
    .line 72
    .line 73
    invoke-static/range {p7 .. p8}, Lp2/k;->u(II)Z

    .line 74
    move-result v3

    .line 75
    .line 76
    if-eqz v3, :cond_2

    .line 77
    .line 78
    iget-object v3, p0, Lcom/bumptech/glide/g;->K:Lcom/bumptech/glide/g;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v3}, Ll2/a;->S()Z

    .line 82
    move-result v3

    .line 83
    .line 84
    if-nez v3, :cond_2

    .line 85
    .line 86
    .line 87
    invoke-virtual/range {p9 .. p9}, Ll2/a;->y()I

    .line 88
    move-result v1

    .line 89
    .line 90
    .line 91
    invoke-virtual/range {p9 .. p9}, Ll2/a;->x()I

    .line 92
    move-result v2

    .line 93
    :cond_2
    move v8, v1

    .line 94
    move v9, v2

    .line 95
    .line 96
    iget-object v1, p0, Lcom/bumptech/glide/g;->K:Lcom/bumptech/glide/g;

    .line 97
    .line 98
    iget-object v6, v1, Lcom/bumptech/glide/g;->G:Lcom/bumptech/glide/i;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1}, Ll2/a;->B()Lcom/bumptech/glide/Priority;

    .line 102
    move-result-object v7

    .line 103
    .line 104
    iget-object v10, p0, Lcom/bumptech/glide/g;->K:Lcom/bumptech/glide/g;

    .line 105
    move-object v2, p1

    .line 106
    move-object v3, p2

    .line 107
    .line 108
    move-object/from16 v4, p3

    .line 109
    .line 110
    move-object/from16 v11, p10

    .line 111
    move-object v5, v0

    .line 112
    .line 113
    .line 114
    invoke-virtual/range {v1 .. v11}, Lcom/bumptech/glide/g;->v0(Ljava/lang/Object;Lm2/j;Ll2/e;Lcom/bumptech/glide/request/RequestCoordinator;Lcom/bumptech/glide/i;Lcom/bumptech/glide/Priority;IILl2/a;Ljava/util/concurrent/Executor;)Ll2/c;

    .line 115
    move-result-object p1

    .line 116
    .line 117
    .line 118
    invoke-virtual {v5, v12, p1}, Lcom/bumptech/glide/request/a;->n(Ll2/c;Ll2/c;)V

    .line 119
    return-object v5
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
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
.end method

.method public final w0(Ljava/lang/Object;Lm2/j;Ll2/e;Lcom/bumptech/glide/request/RequestCoordinator;Lcom/bumptech/glide/i;Lcom/bumptech/glide/Priority;IILl2/a;Ljava/util/concurrent/Executor;)Ll2/c;
    .locals 16
    .param p4    # Lcom/bumptech/glide/request/RequestCoordinator;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lm2/j<",
            "TTranscodeType;>;",
            "Ll2/e<",
            "TTranscodeType;>;",
            "Lcom/bumptech/glide/request/RequestCoordinator;",
            "Lcom/bumptech/glide/i<",
            "*-TTranscodeType;>;",
            "Lcom/bumptech/glide/Priority;",
            "II",
            "Ll2/a<",
            "*>;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Ll2/c;"
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    move-object/from16 v5, p4

    .line 7
    .line 8
    move-object/from16 v7, p6

    .line 9
    .line 10
    iget-object v2, v0, Lcom/bumptech/glide/g;->J:Lcom/bumptech/glide/g;

    .line 11
    .line 12
    if-eqz v2, :cond_4

    .line 13
    .line 14
    iget-boolean v3, v0, Lcom/bumptech/glide/g;->O:Z

    .line 15
    .line 16
    if-nez v3, :cond_3

    .line 17
    .line 18
    iget-object v3, v2, Lcom/bumptech/glide/g;->G:Lcom/bumptech/glide/i;

    .line 19
    .line 20
    iget-boolean v4, v2, Lcom/bumptech/glide/g;->M:Z

    .line 21
    .line 22
    if-eqz v4, :cond_0

    .line 23
    .line 24
    move-object/from16 v11, p5

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move-object v11, v3

    .line 27
    .line 28
    .line 29
    :goto_0
    invoke-virtual {v2}, Ll2/a;->L()Z

    .line 30
    move-result v2

    .line 31
    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    iget-object v2, v0, Lcom/bumptech/glide/g;->J:Lcom/bumptech/glide/g;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2}, Ll2/a;->B()Lcom/bumptech/glide/Priority;

    .line 38
    move-result-object v2

    .line 39
    :goto_1
    move-object v12, v2

    .line 40
    goto :goto_2

    .line 41
    .line 42
    .line 43
    :cond_1
    invoke-virtual {v0, v7}, Lcom/bumptech/glide/g;->z0(Lcom/bumptech/glide/Priority;)Lcom/bumptech/glide/Priority;

    .line 44
    move-result-object v2

    .line 45
    goto :goto_1

    .line 46
    .line 47
    :goto_2
    iget-object v2, v0, Lcom/bumptech/glide/g;->J:Lcom/bumptech/glide/g;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2}, Ll2/a;->y()I

    .line 51
    move-result v2

    .line 52
    .line 53
    iget-object v3, v0, Lcom/bumptech/glide/g;->J:Lcom/bumptech/glide/g;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v3}, Ll2/a;->x()I

    .line 57
    move-result v3

    .line 58
    .line 59
    .line 60
    invoke-static/range {p7 .. p8}, Lp2/k;->u(II)Z

    .line 61
    move-result v4

    .line 62
    .line 63
    if-eqz v4, :cond_2

    .line 64
    .line 65
    iget-object v4, v0, Lcom/bumptech/glide/g;->J:Lcom/bumptech/glide/g;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v4}, Ll2/a;->S()Z

    .line 69
    move-result v4

    .line 70
    .line 71
    if-nez v4, :cond_2

    .line 72
    .line 73
    .line 74
    invoke-virtual/range {p9 .. p9}, Ll2/a;->y()I

    .line 75
    move-result v2

    .line 76
    .line 77
    .line 78
    invoke-virtual/range {p9 .. p9}, Ll2/a;->x()I

    .line 79
    move-result v3

    .line 80
    :cond_2
    move v13, v2

    .line 81
    move v14, v3

    .line 82
    .line 83
    new-instance v4, Lcom/bumptech/glide/request/b;

    .line 84
    .line 85
    .line 86
    invoke-direct {v4, v1, v5}, Lcom/bumptech/glide/request/b;-><init>(Ljava/lang/Object;Lcom/bumptech/glide/request/RequestCoordinator;)V

    .line 87
    .line 88
    move-object/from16 v2, p2

    .line 89
    .line 90
    move-object/from16 v3, p3

    .line 91
    .line 92
    move-object/from16 v6, p5

    .line 93
    .line 94
    move/from16 v8, p7

    .line 95
    .line 96
    move/from16 v9, p8

    .line 97
    .line 98
    move-object/from16 v10, p10

    .line 99
    move-object v5, v4

    .line 100
    .line 101
    move-object/from16 v4, p9

    .line 102
    .line 103
    .line 104
    invoke-virtual/range {v0 .. v10}, Lcom/bumptech/glide/g;->N0(Ljava/lang/Object;Lm2/j;Ll2/e;Ll2/a;Lcom/bumptech/glide/request/RequestCoordinator;Lcom/bumptech/glide/i;Lcom/bumptech/glide/Priority;IILjava/util/concurrent/Executor;)Ll2/c;

    .line 105
    move-result-object v15

    .line 106
    const/4 v1, 0x1

    .line 107
    .line 108
    iput-boolean v1, v0, Lcom/bumptech/glide/g;->O:Z

    .line 109
    move-object v1, v0

    .line 110
    .line 111
    iget-object v0, v1, Lcom/bumptech/glide/g;->J:Lcom/bumptech/glide/g;

    .line 112
    move-object v9, v0

    .line 113
    move-object v4, v5

    .line 114
    move-object v5, v11

    .line 115
    move-object v6, v12

    .line 116
    move v7, v13

    .line 117
    move v8, v14

    .line 118
    move-object v11, v1

    .line 119
    .line 120
    move-object/from16 v1, p1

    .line 121
    .line 122
    .line 123
    invoke-virtual/range {v0 .. v10}, Lcom/bumptech/glide/g;->v0(Ljava/lang/Object;Lm2/j;Ll2/e;Lcom/bumptech/glide/request/RequestCoordinator;Lcom/bumptech/glide/i;Lcom/bumptech/glide/Priority;IILl2/a;Ljava/util/concurrent/Executor;)Ll2/c;

    .line 124
    move-result-object v0

    .line 125
    move-object v5, v4

    .line 126
    const/4 v1, 0x0

    .line 127
    .line 128
    iput-boolean v1, v11, Lcom/bumptech/glide/g;->O:Z

    .line 129
    .line 130
    .line 131
    invoke-virtual {v5, v15, v0}, Lcom/bumptech/glide/request/b;->m(Ll2/c;Ll2/c;)V

    .line 132
    return-object v5

    .line 133
    :cond_3
    move-object v11, v0

    .line 134
    .line 135
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 136
    .line 137
    const-string v1, "You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()"

    .line 138
    .line 139
    .line 140
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 141
    throw v0

    .line 142
    :cond_4
    move-object v11, v0

    .line 143
    .line 144
    iget-object v0, v11, Lcom/bumptech/glide/g;->L:Ljava/lang/Float;

    .line 145
    .line 146
    if-eqz v0, :cond_5

    .line 147
    .line 148
    new-instance v0, Lcom/bumptech/glide/request/b;

    .line 149
    .line 150
    .line 151
    invoke-direct {v0, v1, v5}, Lcom/bumptech/glide/request/b;-><init>(Ljava/lang/Object;Lcom/bumptech/glide/request/RequestCoordinator;)V

    .line 152
    .line 153
    move-object/from16 v2, p2

    .line 154
    .line 155
    move-object/from16 v3, p3

    .line 156
    .line 157
    move-object/from16 v6, p5

    .line 158
    .line 159
    move-object/from16 v7, p6

    .line 160
    .line 161
    move/from16 v8, p7

    .line 162
    .line 163
    move/from16 v9, p8

    .line 164
    .line 165
    move-object/from16 v4, p9

    .line 166
    .line 167
    move-object/from16 v10, p10

    .line 168
    move-object v5, v0

    .line 169
    move-object v0, v11

    .line 170
    .line 171
    .line 172
    invoke-virtual/range {v0 .. v10}, Lcom/bumptech/glide/g;->N0(Ljava/lang/Object;Lm2/j;Ll2/e;Ll2/a;Lcom/bumptech/glide/request/RequestCoordinator;Lcom/bumptech/glide/i;Lcom/bumptech/glide/Priority;IILjava/util/concurrent/Executor;)Ll2/c;

    .line 173
    move-result-object v11

    .line 174
    .line 175
    .line 176
    invoke-virtual/range {p9 .. p9}, Ll2/a;->f()Ll2/a;

    .line 177
    move-result-object v1

    .line 178
    .line 179
    iget-object v2, v0, Lcom/bumptech/glide/g;->L:Ljava/lang/Float;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 183
    move-result v2

    .line 184
    .line 185
    .line 186
    invoke-virtual {v1, v2}, Ll2/a;->k0(F)Ll2/a;

    .line 187
    move-result-object v4

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0, v7}, Lcom/bumptech/glide/g;->z0(Lcom/bumptech/glide/Priority;)Lcom/bumptech/glide/Priority;

    .line 191
    move-result-object v7

    .line 192
    .line 193
    move-object/from16 v1, p1

    .line 194
    .line 195
    move-object/from16 v2, p2

    .line 196
    .line 197
    .line 198
    invoke-virtual/range {v0 .. v10}, Lcom/bumptech/glide/g;->N0(Ljava/lang/Object;Lm2/j;Ll2/e;Ll2/a;Lcom/bumptech/glide/request/RequestCoordinator;Lcom/bumptech/glide/i;Lcom/bumptech/glide/Priority;IILjava/util/concurrent/Executor;)Ll2/c;

    .line 199
    move-result-object v1

    .line 200
    .line 201
    .line 202
    invoke-virtual {v5, v11, v1}, Lcom/bumptech/glide/request/b;->m(Ll2/c;Ll2/c;)V

    .line 203
    return-object v5

    .line 204
    .line 205
    :cond_5
    move-object/from16 v2, p2

    .line 206
    .line 207
    move-object/from16 v3, p3

    .line 208
    .line 209
    move-object/from16 v6, p5

    .line 210
    .line 211
    move-object/from16 v7, p6

    .line 212
    .line 213
    move/from16 v8, p7

    .line 214
    .line 215
    move/from16 v9, p8

    .line 216
    .line 217
    move-object/from16 v4, p9

    .line 218
    .line 219
    move-object/from16 v10, p10

    .line 220
    move-object v0, v11

    .line 221
    .line 222
    .line 223
    invoke-virtual/range {v0 .. v10}, Lcom/bumptech/glide/g;->N0(Ljava/lang/Object;Lm2/j;Ll2/e;Ll2/a;Lcom/bumptech/glide/request/RequestCoordinator;Lcom/bumptech/glide/i;Lcom/bumptech/glide/Priority;IILjava/util/concurrent/Executor;)Ll2/c;

    .line 224
    move-result-object v1

    .line 225
    return-object v1
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
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
.end method

.method public x0()Lcom/bumptech/glide/g;
    .locals 3
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/bumptech/glide/g<",
            "TTranscodeType;>;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Ll2/a;->f()Ll2/a;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    check-cast v0, Lcom/bumptech/glide/g;

    .line 7
    .line 8
    iget-object v1, v0, Lcom/bumptech/glide/g;->G:Lcom/bumptech/glide/i;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, Lcom/bumptech/glide/i;->a()Lcom/bumptech/glide/i;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    iput-object v1, v0, Lcom/bumptech/glide/g;->G:Lcom/bumptech/glide/i;

    .line 15
    .line 16
    iget-object v1, v0, Lcom/bumptech/glide/g;->I:Ljava/util/List;

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    new-instance v1, Ljava/util/ArrayList;

    .line 21
    .line 22
    iget-object v2, v0, Lcom/bumptech/glide/g;->I:Ljava/util/List;

    .line 23
    .line 24
    .line 25
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 26
    .line 27
    iput-object v1, v0, Lcom/bumptech/glide/g;->I:Ljava/util/List;

    .line 28
    .line 29
    :cond_0
    iget-object v1, v0, Lcom/bumptech/glide/g;->J:Lcom/bumptech/glide/g;

    .line 30
    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Lcom/bumptech/glide/g;->x0()Lcom/bumptech/glide/g;

    .line 35
    move-result-object v1

    .line 36
    .line 37
    iput-object v1, v0, Lcom/bumptech/glide/g;->J:Lcom/bumptech/glide/g;

    .line 38
    .line 39
    :cond_1
    iget-object v1, v0, Lcom/bumptech/glide/g;->K:Lcom/bumptech/glide/g;

    .line 40
    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1}, Lcom/bumptech/glide/g;->x0()Lcom/bumptech/glide/g;

    .line 45
    move-result-object v1

    .line 46
    .line 47
    iput-object v1, v0, Lcom/bumptech/glide/g;->K:Lcom/bumptech/glide/g;

    .line 48
    :cond_2
    return-object v0
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

.method public y0(Lcom/bumptech/glide/g;)Lcom/bumptech/glide/g;
    .locals 1
    .param p1    # Lcom/bumptech/glide/g;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/g<",
            "TTranscodeType;>;)",
            "Lcom/bumptech/glide/g<",
            "TTranscodeType;>;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ll2/a;->J()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/bumptech/glide/g;->x0()Lcom/bumptech/glide/g;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lcom/bumptech/glide/g;->y0(Lcom/bumptech/glide/g;)Lcom/bumptech/glide/g;

    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    .line 17
    :cond_0
    iput-object p1, p0, Lcom/bumptech/glide/g;->K:Lcom/bumptech/glide/g;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Ll2/a;->h0()Ll2/a;

    .line 21
    move-result-object p1

    .line 22
    .line 23
    check-cast p1, Lcom/bumptech/glide/g;

    .line 24
    return-object p1
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
.end method

.method public final z0(Lcom/bumptech/glide/Priority;)Lcom/bumptech/glide/Priority;
    .locals 2
    .param p1    # Lcom/bumptech/glide/Priority;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/bumptech/glide/g$a;->b:[I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 6
    move-result p1

    .line 7
    .line 8
    aget p1, v0, p1

    .line 9
    const/4 v0, 0x1

    .line 10
    .line 11
    if-eq p1, v0, :cond_3

    .line 12
    const/4 v0, 0x2

    .line 13
    .line 14
    if-eq p1, v0, :cond_2

    .line 15
    const/4 v0, 0x3

    .line 16
    .line 17
    if-eq p1, v0, :cond_1

    .line 18
    const/4 v0, 0x4

    .line 19
    .line 20
    if-ne p1, v0, :cond_0

    .line 21
    goto :goto_0

    .line 22
    .line 23
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 24
    .line 25
    new-instance v0, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    const-string/jumbo v1, "unknown priority: "

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Ll2/a;->B()Lcom/bumptech/glide/Priority;

    .line 38
    move-result-object v1

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    move-result-object v0

    .line 46
    .line 47
    .line 48
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 49
    throw p1

    .line 50
    .line 51
    :cond_1
    :goto_0
    sget-object p1, Lcom/bumptech/glide/Priority;->IMMEDIATE:Lcom/bumptech/glide/Priority;

    .line 52
    return-object p1

    .line 53
    .line 54
    :cond_2
    sget-object p1, Lcom/bumptech/glide/Priority;->HIGH:Lcom/bumptech/glide/Priority;

    .line 55
    return-object p1

    .line 56
    .line 57
    :cond_3
    sget-object p1, Lcom/bumptech/glide/Priority;->NORMAL:Lcom/bumptech/glide/Priority;

    .line 58
    return-object p1
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
.end method
