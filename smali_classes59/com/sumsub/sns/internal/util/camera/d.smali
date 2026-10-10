.class public final Lcom/sumsub/sns/internal/util/camera/d;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lcom/sumsub/sns/internal/util/camera/h;

.field public final c:Ljava/util/List;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 8

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/sumsub/sns/internal/util/camera/d;->a:Landroid/content/Context;

    .line 6
    .line 7
    new-instance v0, Lcom/sumsub/sns/internal/util/camera/h;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, p1}, Lcom/sumsub/sns/internal/util/camera/h;-><init>(Landroid/content/Context;)V

    .line 11
    .line 12
    iput-object v0, p0, Lcom/sumsub/sns/internal/util/camera/d;->b:Lcom/sumsub/sns/internal/util/camera/h;

    .line 13
    .line 14
    new-instance v1, Lcom/sumsub/sns/internal/util/camera/c;

    .line 15
    .line 16
    .line 17
    const-string/jumbo p1, "virtualMp4"

    .line 18
    .line 19
    .line 20
    const-string/jumbo v0, "virtual.mp4"

    .line 21
    .line 22
    .line 23
    invoke-direct {v1, p1, v0}, Lcom/sumsub/sns/internal/util/camera/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    new-instance v2, Lcom/sumsub/sns/internal/util/camera/c;

    .line 26
    .line 27
    const-string p1, "1000Bmp"

    .line 28
    .line 29
    const-string v0, "1000.bmp"

    .line 30
    .line 31
    .line 32
    invoke-direct {v2, p1, v0}, Lcom/sumsub/sns/internal/util/camera/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    new-instance v3, Lcom/sumsub/sns/internal/util/camera/c;

    .line 35
    .line 36
    .line 37
    const-string/jumbo p1, "noToastJpg"

    .line 38
    .line 39
    .line 40
    const-string/jumbo v0, "no_toast.jpg"

    .line 41
    .line 42
    .line 43
    invoke-direct {v3, p1, v0}, Lcom/sumsub/sns/internal/util/camera/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    new-instance v4, Lcom/sumsub/sns/internal/util/camera/c;

    .line 46
    .line 47
    const-string p1, "forceShowJpg"

    .line 48
    .line 49
    const-string v0, "force_show.jpg"

    .line 50
    .line 51
    .line 52
    invoke-direct {v4, p1, v0}, Lcom/sumsub/sns/internal/util/camera/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    .line 54
    new-instance v5, Lcom/sumsub/sns/internal/util/camera/c;

    .line 55
    .line 56
    .line 57
    const-string/jumbo p1, "privateDirJpg"

    .line 58
    .line 59
    .line 60
    const-string/jumbo v0, "private_dir.jpg"

    .line 61
    .line 62
    .line 63
    invoke-direct {v5, p1, v0}, Lcom/sumsub/sns/internal/util/camera/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    .line 65
    new-instance v6, Lcom/sumsub/sns/internal/util/camera/c;

    .line 66
    .line 67
    const-string p1, "disableJpg"

    .line 68
    .line 69
    const-string v0, "disable.jpg"

    .line 70
    .line 71
    .line 72
    invoke-direct {v6, p1, v0}, Lcom/sumsub/sns/internal/util/camera/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    .line 74
    new-instance v7, Lcom/sumsub/sns/internal/util/camera/c;

    .line 75
    .line 76
    .line 77
    const-string/jumbo p1, "noSilentJpg"

    .line 78
    .line 79
    .line 80
    const-string/jumbo v0, "no-silent.jpg"

    .line 81
    .line 82
    .line 83
    invoke-direct {v7, p1, v0}, Lcom/sumsub/sns/internal/util/camera/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    filled-new-array/range {v1 .. v7}, [Lcom/sumsub/sns/internal/util/camera/c;

    .line 87
    move-result-object p1

    .line 88
    .line 89
    .line 90
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 91
    move-result-object p1

    .line 92
    .line 93
    iput-object p1, p0, Lcom/sumsub/sns/internal/util/camera/d;->c:Ljava/util/List;

    .line 94
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
.end method


# virtual methods
.method public final a(Lcom/sumsub/sns/internal/util/camera/XposedVirtualCameraDirectory;)Ljava/util/List;
    .locals 6

    .line 1
    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/sumsub/sns/internal/util/camera/d;->a:Landroid/content/Context;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1, v0}, Lcom/sumsub/sns/internal/util/camera/XposedVirtualCameraDirectory;->getDirectory(Landroid/content/Context;)Ljava/io/File;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    iget-object v1, p0, Lcom/sumsub/sns/internal/util/camera/d;->c:Ljava/util/List;

    .line 9
    .line 10
    new-instance v2, Ljava/util/ArrayList;

    .line 11
    .line 12
    const/16 v3, 0xa

    .line 13
    .line 14
    .line 15
    invoke-static {v1, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 16
    move-result v3

    .line 17
    .line 18
    .line 19
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 20
    .line 21
    .line 22
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 23
    move-result-object v1

    .line 24
    .line 25
    .line 26
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    move-result v3

    .line 28
    .line 29
    if-eqz v3, :cond_1

    .line 30
    .line 31
    .line 32
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    move-result-object v3

    .line 34
    .line 35
    check-cast v3, Lcom/sumsub/sns/internal/util/camera/c;

    .line 36
    .line 37
    if-eqz v0, :cond_0

    .line 38
    .line 39
    iget-object v4, v3, Lcom/sumsub/sns/internal/util/camera/c;->b:Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    invoke-static {v0, v4}, Lkotlin/io/FilesKt;->resolve(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    .line 43
    move-result-object v4

    .line 44
    .line 45
    if-eqz v4, :cond_0

    .line 46
    .line 47
    .line 48
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    .line 49
    move-result v4

    .line 50
    goto :goto_1

    .line 51
    :cond_0
    const/4 v4, 0x0

    .line 52
    .line 53
    :goto_1
    new-instance v5, Lcom/sumsub/sns/internal/util/camera/b;

    .line 54
    .line 55
    iget-object v3, v3, Lcom/sumsub/sns/internal/util/camera/c;->a:Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    invoke-direct {v5, v3, p1, v4}, Lcom/sumsub/sns/internal/util/camera/b;-><init>(Ljava/lang/String;Lcom/sumsub/sns/internal/util/camera/XposedVirtualCameraDirectory;Z)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    goto :goto_0

    .line 63
    :cond_1
    return-object v2

    .line 64
    .line 65
    .line 66
    :catchall_0
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 67
    move-result-object p1

    .line 68
    return-object p1
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
