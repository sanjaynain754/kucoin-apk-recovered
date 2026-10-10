.class final Lcom/google/android/play/integrity/internal/aa;
.super Lcom/google/android/play/integrity/internal/t;
.source "com.google.android.play:integrity@@1.3.0"


# instance fields
.field final synthetic a:Landroid/os/IBinder;

.field final synthetic b:Lcom/google/android/play/integrity/internal/ad;


# direct methods
.method public constructor <init>(Lcom/google/android/play/integrity/internal/ad;Landroid/os/IBinder;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/google/android/play/integrity/internal/aa;->b:Lcom/google/android/play/integrity/internal/ad;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/google/android/play/integrity/internal/aa;->a:Landroid/os/IBinder;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lcom/google/android/play/integrity/internal/t;-><init>()V

    .line 8
    return-void
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
.end method


# virtual methods
.method public final b()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/android/play/integrity/internal/aa;->b:Lcom/google/android/play/integrity/internal/ad;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/google/android/play/integrity/internal/ad;->a:Lcom/google/android/play/integrity/internal/ae;

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Lcom/google/android/play/integrity/internal/ae;->g(Lcom/google/android/play/integrity/internal/ae;)Lcom/google/android/play/integrity/internal/z;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    iget-object v1, p0, Lcom/google/android/play/integrity/internal/aa;->a:Landroid/os/IBinder;

    .line 11
    .line 12
    .line 13
    invoke-interface {v0, v1}, Lcom/google/android/play/integrity/internal/z;->a(Landroid/os/IBinder;)Ljava/lang/Object;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    check-cast v0, Landroid/os/IInterface;

    .line 17
    .line 18
    iget-object v1, p0, Lcom/google/android/play/integrity/internal/aa;->b:Lcom/google/android/play/integrity/internal/ad;

    .line 19
    .line 20
    iget-object v1, v1, Lcom/google/android/play/integrity/internal/ad;->a:Lcom/google/android/play/integrity/internal/ae;

    .line 21
    .line 22
    .line 23
    invoke-static {v1, v0}, Lcom/google/android/play/integrity/internal/ae;->n(Lcom/google/android/play/integrity/internal/ae;Landroid/os/IInterface;)V

    .line 24
    .line 25
    iget-object v0, p0, Lcom/google/android/play/integrity/internal/aa;->b:Lcom/google/android/play/integrity/internal/ad;

    .line 26
    .line 27
    iget-object v0, v0, Lcom/google/android/play/integrity/internal/ad;->a:Lcom/google/android/play/integrity/internal/ae;

    .line 28
    .line 29
    .line 30
    invoke-static {v0}, Lcom/google/android/play/integrity/internal/ae;->r(Lcom/google/android/play/integrity/internal/ae;)V

    .line 31
    .line 32
    iget-object v0, p0, Lcom/google/android/play/integrity/internal/aa;->b:Lcom/google/android/play/integrity/internal/ad;

    .line 33
    .line 34
    iget-object v0, v0, Lcom/google/android/play/integrity/internal/ad;->a:Lcom/google/android/play/integrity/internal/ae;

    .line 35
    const/4 v1, 0x0

    .line 36
    .line 37
    .line 38
    invoke-static {v0, v1}, Lcom/google/android/play/integrity/internal/ae;->m(Lcom/google/android/play/integrity/internal/ae;Z)V

    .line 39
    .line 40
    iget-object v0, p0, Lcom/google/android/play/integrity/internal/aa;->b:Lcom/google/android/play/integrity/internal/ad;

    .line 41
    .line 42
    iget-object v0, v0, Lcom/google/android/play/integrity/internal/ad;->a:Lcom/google/android/play/integrity/internal/ae;

    .line 43
    .line 44
    .line 45
    invoke-static {v0}, Lcom/google/android/play/integrity/internal/ae;->i(Lcom/google/android/play/integrity/internal/ae;)Ljava/util/List;

    .line 46
    move-result-object v0

    .line 47
    .line 48
    .line 49
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 50
    move-result-object v0

    .line 51
    .line 52
    .line 53
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    move-result v1

    .line 55
    .line 56
    if-eqz v1, :cond_0

    .line 57
    .line 58
    .line 59
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    move-result-object v1

    .line 61
    .line 62
    check-cast v1, Ljava/lang/Runnable;

    .line 63
    .line 64
    .line 65
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    .line 66
    goto :goto_0

    .line 67
    .line 68
    :cond_0
    iget-object v0, p0, Lcom/google/android/play/integrity/internal/aa;->b:Lcom/google/android/play/integrity/internal/ad;

    .line 69
    .line 70
    iget-object v0, v0, Lcom/google/android/play/integrity/internal/ad;->a:Lcom/google/android/play/integrity/internal/ae;

    .line 71
    .line 72
    .line 73
    invoke-static {v0}, Lcom/google/android/play/integrity/internal/ae;->i(Lcom/google/android/play/integrity/internal/ae;)Ljava/util/List;

    .line 74
    move-result-object v0

    .line 75
    .line 76
    .line 77
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 78
    return-void
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
