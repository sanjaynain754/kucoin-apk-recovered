.class public abstract Lcom/kubi/utils/ToastCompat$c;
.super Ljava/lang/Object;
.source "ToastCompat.java"

# interfaces
.implements Lcom/kubi/utils/ToastCompat$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/utils/ToastCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "c"
.end annotation


# instance fields
.field public a:Landroid/widget/Toast;

.field public b:Lcom/kubi/utils/ToastCompat;

.field public c:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/kubi/utils/ToastCompat;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Landroid/widget/Toast;

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lcom/blankj/utilcode/util/o0;->a()Landroid/app/Application;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1}, Landroid/widget/Toast;-><init>(Landroid/content/Context;)V

    .line 13
    .line 14
    iput-object v0, p0, Lcom/kubi/utils/ToastCompat$c;->a:Landroid/widget/Toast;

    .line 15
    .line 16
    iput-object p1, p0, Lcom/kubi/utils/ToastCompat$c;->b:Lcom/kubi/utils/ToastCompat;

    .line 17
    .line 18
    .line 19
    invoke-static {p1}, Lcom/kubi/utils/ToastCompat;->g(Lcom/kubi/utils/ToastCompat;)I

    .line 20
    move-result p1

    .line 21
    const/4 v0, -0x1

    .line 22
    .line 23
    if-ne p1, v0, :cond_1

    .line 24
    .line 25
    iget-object p1, p0, Lcom/kubi/utils/ToastCompat$c;->b:Lcom/kubi/utils/ToastCompat;

    .line 26
    .line 27
    .line 28
    invoke-static {p1}, Lcom/kubi/utils/ToastCompat;->h(Lcom/kubi/utils/ToastCompat;)I

    .line 29
    move-result p1

    .line 30
    .line 31
    if-ne p1, v0, :cond_1

    .line 32
    .line 33
    iget-object p1, p0, Lcom/kubi/utils/ToastCompat$c;->b:Lcom/kubi/utils/ToastCompat;

    .line 34
    .line 35
    .line 36
    invoke-static {p1}, Lcom/kubi/utils/ToastCompat;->i(Lcom/kubi/utils/ToastCompat;)I

    .line 37
    move-result p1

    .line 38
    .line 39
    if-eq p1, v0, :cond_0

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    return-void

    .line 42
    .line 43
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/kubi/utils/ToastCompat$c;->a:Landroid/widget/Toast;

    .line 44
    .line 45
    iget-object v0, p0, Lcom/kubi/utils/ToastCompat$c;->b:Lcom/kubi/utils/ToastCompat;

    .line 46
    .line 47
    .line 48
    invoke-static {v0}, Lcom/kubi/utils/ToastCompat;->g(Lcom/kubi/utils/ToastCompat;)I

    .line 49
    move-result v0

    .line 50
    .line 51
    iget-object v1, p0, Lcom/kubi/utils/ToastCompat$c;->b:Lcom/kubi/utils/ToastCompat;

    .line 52
    .line 53
    .line 54
    invoke-static {v1}, Lcom/kubi/utils/ToastCompat;->h(Lcom/kubi/utils/ToastCompat;)I

    .line 55
    move-result v1

    .line 56
    .line 57
    iget-object v2, p0, Lcom/kubi/utils/ToastCompat$c;->b:Lcom/kubi/utils/ToastCompat;

    .line 58
    .line 59
    .line 60
    invoke-static {v2}, Lcom/kubi/utils/ToastCompat;->i(Lcom/kubi/utils/ToastCompat;)I

    .line 61
    move-result v2

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, v0, v1, v2}, Landroid/widget/Toast;->setGravity(III)V

    .line 65
    return-void
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
.end method


# virtual methods
.method public a(Landroid/view/View;)V
    .locals 1

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/utils/ToastCompat$c;->c:Landroid/view/View;

    .line 3
    .line 4
    iget-object v0, p0, Lcom/kubi/utils/ToastCompat$c;->a:Landroid/widget/Toast;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1}, Landroid/widget/Toast;->setView(Landroid/view/View;)V

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
.end method

.method public c(Ljava/lang/CharSequence;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/utils/ToastCompat$c;->b:Lcom/kubi/utils/ToastCompat;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p1}, Lcom/kubi/utils/ToastCompat;->j(Lcom/kubi/utils/ToastCompat;Ljava/lang/CharSequence;)Landroid/view/View;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lcom/kubi/utils/ToastCompat$c;->a(Landroid/view/View;)V

    .line 12
    return-void

    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lcom/kubi/utils/ToastCompat$c;->a:Landroid/widget/Toast;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/widget/Toast;->getView()Landroid/view/View;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    iput-object v0, p0, Lcom/kubi/utils/ToastCompat$c;->c:Landroid/view/View;

    .line 21
    .line 22
    .line 23
    const v1, 0x102000b

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    if-nez v0, :cond_2

    .line 32
    .line 33
    :cond_1
    sget v0, Lcom/kubi/sdk/utils/R$layout;->toast_view:I

    .line 34
    .line 35
    .line 36
    invoke-static {v0}, Lcom/kubi/utils/ToastCompat;->k(I)Landroid/view/View;

    .line 37
    move-result-object v0

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v0}, Lcom/kubi/utils/ToastCompat$c;->a(Landroid/view/View;)V

    .line 41
    .line 42
    :cond_2
    iget-object v0, p0, Lcom/kubi/utils/ToastCompat$c;->c:Landroid/view/View;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 46
    move-result-object v0

    .line 47
    .line 48
    check-cast v0, Landroid/widget/TextView;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 52
    .line 53
    iget-object p1, p0, Lcom/kubi/utils/ToastCompat$c;->b:Lcom/kubi/utils/ToastCompat;

    .line 54
    .line 55
    .line 56
    invoke-static {p1}, Lcom/kubi/utils/ToastCompat;->l(Lcom/kubi/utils/ToastCompat;)I

    .line 57
    move-result p1

    .line 58
    .line 59
    .line 60
    const v1, -0x1000001

    .line 61
    .line 62
    if-eq p1, v1, :cond_3

    .line 63
    .line 64
    iget-object p1, p0, Lcom/kubi/utils/ToastCompat$c;->b:Lcom/kubi/utils/ToastCompat;

    .line 65
    .line 66
    .line 67
    invoke-static {p1}, Lcom/kubi/utils/ToastCompat;->l(Lcom/kubi/utils/ToastCompat;)I

    .line 68
    move-result p1

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 72
    .line 73
    :cond_3
    iget-object p1, p0, Lcom/kubi/utils/ToastCompat$c;->b:Lcom/kubi/utils/ToastCompat;

    .line 74
    .line 75
    .line 76
    invoke-static {p1}, Lcom/kubi/utils/ToastCompat;->d(Lcom/kubi/utils/ToastCompat;)I

    .line 77
    move-result p1

    .line 78
    const/4 v1, -0x1

    .line 79
    .line 80
    if-eq p1, v1, :cond_4

    .line 81
    .line 82
    iget-object p1, p0, Lcom/kubi/utils/ToastCompat$c;->b:Lcom/kubi/utils/ToastCompat;

    .line 83
    .line 84
    .line 85
    invoke-static {p1}, Lcom/kubi/utils/ToastCompat;->d(Lcom/kubi/utils/ToastCompat;)I

    .line 86
    move-result p1

    .line 87
    int-to-float p1, p1

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 91
    .line 92
    .line 93
    :cond_4
    invoke-virtual {p0, v0}, Lcom/kubi/utils/ToastCompat$c;->d(Landroid/widget/TextView;)V

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
.end method

.method public cancel()V
    .locals 3
    .annotation build Landroidx/annotation/CallSuper;
    .end annotation

    .line 1
    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/kubi/utils/ToastCompat$c;->a:Landroid/widget/Toast;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    new-instance v1, Landroid/view/View;

    .line 7
    .line 8
    .line 9
    invoke-static {}, Lcom/blankj/utilcode/util/o0;->a()Landroid/app/Application;

    .line 10
    move-result-object v2

    .line 11
    .line 12
    .line 13
    invoke-direct {v1, v2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/widget/Toast;->setView(Landroid/view/View;)V

    .line 17
    .line 18
    iget-object v0, p0, Lcom/kubi/utils/ToastCompat$c;->a:Landroid/widget/Toast;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/widget/Toast;->cancel()V

    .line 22
    goto :goto_0

    .line 23
    :catch_0
    move-exception v0

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    :goto_0
    const/4 v0, 0x0

    .line 26
    .line 27
    iput-object v0, p0, Lcom/kubi/utils/ToastCompat$c;->a:Landroid/widget/Toast;

    .line 28
    .line 29
    iput-object v0, p0, Lcom/kubi/utils/ToastCompat$c;->c:Landroid/view/View;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    return-void

    .line 31
    .line 32
    :goto_1
    const-string v1, "ToastCompat_AbsToast"

    .line 33
    .line 34
    .line 35
    invoke-static {v0, v1}, Lv70/a;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 36
    return-void
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
    .line 241
    .line 242
    .line 243
    .line 244
.end method

.method public d(Landroid/widget/TextView;)V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/utils/ToastCompat$c;->b:Lcom/kubi/utils/ToastCompat;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/kubi/utils/ToastCompat;->e(Lcom/kubi/utils/ToastCompat;)I

    .line 6
    move-result v0

    .line 7
    const/4 v1, -0x1

    .line 8
    const/4 v2, 0x0

    .line 9
    .line 10
    if-eq v0, v1, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/kubi/utils/ToastCompat$c;->c:Landroid/view/View;

    .line 13
    .line 14
    iget-object v1, p0, Lcom/kubi/utils/ToastCompat$c;->b:Lcom/kubi/utils/ToastCompat;

    .line 15
    .line 16
    .line 17
    invoke-static {v1}, Lcom/kubi/utils/ToastCompat;->e(Lcom/kubi/utils/ToastCompat;)I

    .line 18
    move-result v1

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 25
    return-void

    .line 26
    .line 27
    :cond_0
    iget-object v0, p0, Lcom/kubi/utils/ToastCompat$c;->b:Lcom/kubi/utils/ToastCompat;

    .line 28
    .line 29
    .line 30
    invoke-static {v0}, Lcom/kubi/utils/ToastCompat;->f(Lcom/kubi/utils/ToastCompat;)I

    .line 31
    move-result v0

    .line 32
    .line 33
    .line 34
    const v1, -0x1000001

    .line 35
    .line 36
    if-eq v0, v1, :cond_4

    .line 37
    .line 38
    iget-object v0, p0, Lcom/kubi/utils/ToastCompat$c;->c:Landroid/view/View;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 42
    move-result-object v0

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 46
    move-result-object v1

    .line 47
    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    if-eqz v1, :cond_1

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 54
    move-result-object v0

    .line 55
    .line 56
    new-instance v1, Landroid/graphics/PorterDuffColorFilter;

    .line 57
    .line 58
    iget-object v3, p0, Lcom/kubi/utils/ToastCompat$c;->b:Lcom/kubi/utils/ToastCompat;

    .line 59
    .line 60
    .line 61
    invoke-static {v3}, Lcom/kubi/utils/ToastCompat;->f(Lcom/kubi/utils/ToastCompat;)I

    .line 62
    move-result v3

    .line 63
    .line 64
    sget-object v4, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 65
    .line 66
    .line 67
    invoke-direct {v1, v3, v4}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1, v2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 74
    return-void

    .line 75
    .line 76
    :cond_1
    if-eqz v0, :cond_2

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 80
    move-result-object p1

    .line 81
    .line 82
    new-instance v0, Landroid/graphics/PorterDuffColorFilter;

    .line 83
    .line 84
    iget-object v1, p0, Lcom/kubi/utils/ToastCompat$c;->b:Lcom/kubi/utils/ToastCompat;

    .line 85
    .line 86
    .line 87
    invoke-static {v1}, Lcom/kubi/utils/ToastCompat;->f(Lcom/kubi/utils/ToastCompat;)I

    .line 88
    move-result v1

    .line 89
    .line 90
    sget-object v2, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 91
    .line 92
    .line 93
    invoke-direct {v0, v1, v2}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 97
    return-void

    .line 98
    .line 99
    :cond_2
    if-eqz v1, :cond_3

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 103
    move-result-object p1

    .line 104
    .line 105
    new-instance v0, Landroid/graphics/PorterDuffColorFilter;

    .line 106
    .line 107
    iget-object v1, p0, Lcom/kubi/utils/ToastCompat$c;->b:Lcom/kubi/utils/ToastCompat;

    .line 108
    .line 109
    .line 110
    invoke-static {v1}, Lcom/kubi/utils/ToastCompat;->f(Lcom/kubi/utils/ToastCompat;)I

    .line 111
    move-result v1

    .line 112
    .line 113
    sget-object v2, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 114
    .line 115
    .line 116
    invoke-direct {v0, v1, v2}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 120
    return-void

    .line 121
    .line 122
    :cond_3
    iget-object p1, p0, Lcom/kubi/utils/ToastCompat$c;->c:Landroid/view/View;

    .line 123
    .line 124
    iget-object v0, p0, Lcom/kubi/utils/ToastCompat$c;->b:Lcom/kubi/utils/ToastCompat;

    .line 125
    .line 126
    .line 127
    invoke-static {v0}, Lcom/kubi/utils/ToastCompat;->f(Lcom/kubi/utils/ToastCompat;)I

    .line 128
    move-result v0

    .line 129
    .line 130
    .line 131
    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 132
    :cond_4
    return-void
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
.end method
