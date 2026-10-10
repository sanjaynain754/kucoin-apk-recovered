.class public Lv5/a$a;
.super Ljava/lang/Object;
.source "DefaultImageDecoder.java"

# interfaces
.implements Lv5/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv5/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lv5/a;


# direct methods
.method public constructor <init>(Lv5/a;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lv5/a$a;->a:Lv5/a;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method


# virtual methods
.method public decode(Lx5/i;ILx5/n;Lr5/c;)Lx5/e;
    .locals 8

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lx5/i;->m()Lcom/facebook/imageformat/ImageFormat;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget-object v1, p0, Lv5/a$a;->a:Lv5/a;

    .line 7
    .line 8
    .line 9
    invoke-static {v1}, Lv5/a;->a(Lv5/a;)Lw3/k;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    .line 13
    invoke-interface {v1}, Lw3/k;->get()Ljava/lang/Object;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    check-cast v1, Ljava/lang/Boolean;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 20
    move-result v1

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    iget-object v1, p4, Lr5/c;->k:Landroid/graphics/ColorSpace;

    .line 25
    .line 26
    if-nez v1, :cond_0

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Lx5/i;->k()Landroid/graphics/ColorSpace;

    .line 30
    move-result-object v1

    .line 31
    :cond_0
    :goto_0
    move-object v7, v1

    .line 32
    goto :goto_1

    .line 33
    .line 34
    :cond_1
    iget-object v1, p4, Lr5/c;->k:Landroid/graphics/ColorSpace;

    .line 35
    goto :goto_0

    .line 36
    .line 37
    :goto_1
    sget-object v1, Ll5/a;->b:Lcom/facebook/imageformat/ImageFormat;

    .line 38
    .line 39
    if-ne v0, v1, :cond_2

    .line 40
    .line 41
    iget-object v2, p0, Lv5/a$a;->a:Lv5/a;

    .line 42
    move-object v3, p1

    .line 43
    move v4, p2

    .line 44
    move-object v5, p3

    .line 45
    move-object v6, p4

    .line 46
    .line 47
    .line 48
    invoke-virtual/range {v2 .. v7}, Lv5/a;->d(Lx5/i;ILx5/n;Lr5/c;Landroid/graphics/ColorSpace;)Lx5/f;

    .line 49
    move-result-object p1

    .line 50
    return-object p1

    .line 51
    :cond_2
    move-object v3, p1

    .line 52
    move v4, p2

    .line 53
    move-object v5, p3

    .line 54
    move-object v6, p4

    .line 55
    .line 56
    sget-object p1, Ll5/a;->d:Lcom/facebook/imageformat/ImageFormat;

    .line 57
    .line 58
    if-ne v0, p1, :cond_3

    .line 59
    .line 60
    iget-object p1, p0, Lv5/a$a;->a:Lv5/a;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, v3, v4, v5, v6}, Lv5/a;->c(Lx5/i;ILx5/n;Lr5/c;)Lx5/e;

    .line 64
    move-result-object p1

    .line 65
    return-object p1

    .line 66
    .line 67
    :cond_3
    sget-object p1, Ll5/a;->k:Lcom/facebook/imageformat/ImageFormat;

    .line 68
    .line 69
    if-ne v0, p1, :cond_4

    .line 70
    .line 71
    iget-object p1, p0, Lv5/a$a;->a:Lv5/a;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1, v3, v4, v5, v6}, Lv5/a;->b(Lx5/i;ILx5/n;Lr5/c;)Lx5/e;

    .line 75
    move-result-object p1

    .line 76
    return-object p1

    .line 77
    .line 78
    :cond_4
    sget-object p1, Lcom/facebook/imageformat/ImageFormat;->d:Lcom/facebook/imageformat/ImageFormat;

    .line 79
    .line 80
    if-eq v0, p1, :cond_5

    .line 81
    .line 82
    iget-object p1, p0, Lv5/a$a;->a:Lv5/a;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1, v3, v6}, Lv5/a;->e(Lx5/i;Lr5/c;)Lx5/f;

    .line 86
    move-result-object p1

    .line 87
    return-object p1

    .line 88
    .line 89
    :cond_5
    new-instance p1, Lcom/facebook/imagepipeline/decoder/DecodeException;

    .line 90
    .line 91
    .line 92
    const-string/jumbo p2, "unknown image format"

    .line 93
    .line 94
    .line 95
    invoke-direct {p1, p2, v3}, Lcom/facebook/imagepipeline/decoder/DecodeException;-><init>(Ljava/lang/String;Lx5/i;)V

    .line 96
    throw p1
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
