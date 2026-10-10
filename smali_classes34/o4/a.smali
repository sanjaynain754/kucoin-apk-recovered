.class public abstract Lo4/a;
.super Ljava/lang/Object;
.source "AbstractDraweeController.java"

# interfaces
.implements Lt4/a;
.implements Ln4/a$a;
.implements Ls4/a$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo4/a$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "INFO:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lt4/a;",
        "Ln4/a$a;",
        "Ls4/a$a;"
    }
.end annotation


# static fields
.field public static final w:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static final x:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static final y:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Lcom/facebook/drawee/components/DraweeEventTracker;

.field public final b:Ln4/a;

.field public final c:Ljava/util/concurrent/Executor;

.field public d:Ln4/c;

.field public e:Ls4/a;

.field public f:Lo4/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo4/c<",
            "TINFO;>;"
        }
    .end annotation
.end field

.field public g:Lcom/facebook/fresco/ui/common/ForwardingControllerListener2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/fresco/ui/common/ForwardingControllerListener2<",
            "TINFO;>;"
        }
    .end annotation
.end field

.field public h:Lt4/c;

.field public i:Landroid/graphics/drawable/Drawable;

.field public j:Ljava/lang/String;

.field public k:Ljava/lang/Object;

.field public l:Z

.field public m:Z

.field public n:Z

.field public o:Z

.field public p:Z

.field public q:Ljava/lang/String;

.field public r:Lf4/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf4/b<",
            "TT;>;"
        }
    .end annotation
.end field

.field public s:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field public t:Z

.field public u:Z

.field public v:Landroid/graphics/drawable/Drawable;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    .line 2
    const-string v0, "component_tag"

    .line 3
    .line 4
    const-string v1, "drawee"

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Lcom/facebook/common/internal/ImmutableMap;->of(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    sput-object v0, Lo4/a;->w:Ljava/util/Map;

    .line 11
    .line 12
    .line 13
    const-string/jumbo v0, "origin_sub"

    .line 14
    .line 15
    .line 16
    const-string/jumbo v1, "shortcut"

    .line 17
    .line 18
    .line 19
    const-string/jumbo v2, "origin"

    .line 20
    .line 21
    const-string v3, "memory_bitmap"

    .line 22
    .line 23
    .line 24
    invoke-static {v2, v3, v0, v1}, Lcom/facebook/common/internal/ImmutableMap;->of(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    sput-object v0, Lo4/a;->x:Ljava/util/Map;

    .line 28
    .line 29
    const-class v0, Lo4/a;

    .line 30
    .line 31
    sput-object v0, Lo4/a;->y:Ljava/lang/Class;

    .line 32
    return-void
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
.end method

.method public constructor <init>(Ln4/a;Ljava/util/concurrent/Executor;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/facebook/drawee/components/DraweeEventTracker;->a()Lcom/facebook/drawee/components/DraweeEventTracker;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    iput-object v0, p0, Lo4/a;->a:Lcom/facebook/drawee/components/DraweeEventTracker;

    .line 10
    .line 11
    new-instance v0, Lcom/facebook/fresco/ui/common/ForwardingControllerListener2;

    .line 12
    .line 13
    .line 14
    invoke-direct {v0}, Lcom/facebook/fresco/ui/common/ForwardingControllerListener2;-><init>()V

    .line 15
    .line 16
    iput-object v0, p0, Lo4/a;->g:Lcom/facebook/fresco/ui/common/ForwardingControllerListener2;

    .line 17
    const/4 v0, 0x1

    .line 18
    .line 19
    iput-boolean v0, p0, Lo4/a;->t:Z

    .line 20
    const/4 v0, 0x0

    .line 21
    .line 22
    iput-boolean v0, p0, Lo4/a;->u:Z

    .line 23
    .line 24
    iput-object p1, p0, Lo4/a;->b:Ln4/a;

    .line 25
    .line 26
    iput-object p2, p0, Lo4/a;->c:Ljava/util/concurrent/Executor;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, p3, p4}, Lo4/a;->C(Ljava/lang/String;Ljava/lang/Object;)V

    .line 30
    return-void
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

.method public static bridge synthetic g(Lo4/a;Ljava/lang/String;Lf4/b;Ljava/lang/Throwable;Z)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, Lo4/a;->L(Ljava/lang/String;Lf4/b;Ljava/lang/Throwable;Z)V

    .line 4
    return-void
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
.end method

.method public static bridge synthetic h(Lo4/a;Ljava/lang/String;Lf4/b;Ljava/lang/Object;FZZZ)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual/range {p0 .. p7}, Lo4/a;->N(Ljava/lang/String;Lf4/b;Ljava/lang/Object;FZZZ)V

    .line 4
    return-void
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
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
.end method

.method public static bridge synthetic i(Lo4/a;Ljava/lang/String;Lf4/b;FZ)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, Lo4/a;->O(Ljava/lang/String;Lf4/b;FZ)V

    .line 4
    return-void
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
.end method


# virtual methods
.method public A()Ln4/c;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lo4/a;->d:Ln4/c;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Ln4/c;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0}, Ln4/c;-><init>()V

    .line 10
    .line 11
    iput-object v0, p0, Lo4/a;->d:Ln4/c;

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lo4/a;->d:Ln4/c;

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public final B()Lt4/c;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lo4/a;->h:Lt4/c;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    return-object v0

    .line 6
    .line 7
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 8
    .line 9
    new-instance v1, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    const-string v2, "mSettableDraweeHierarchy is null; Caller context: "

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    iget-object v2, p0, Lo4/a;->k:Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    throw v0
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
.end method

.method public final declared-synchronized C(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-static {}, Ld6/b;->d()Z

    .line 5
    move-result v0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const-string v0, "AbstractDraweeController#init"

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Ld6/b;->a(Ljava/lang/String;)V

    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    .line 16
    goto/16 :goto_2

    .line 17
    .line 18
    :cond_0
    :goto_0
    iget-object v0, p0, Lo4/a;->a:Lcom/facebook/drawee/components/DraweeEventTracker;

    .line 19
    .line 20
    sget-object v1, Lcom/facebook/drawee/components/DraweeEventTracker$Event;->ON_INIT_CONTROLLER:Lcom/facebook/drawee/components/DraweeEventTracker$Event;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Lcom/facebook/drawee/components/DraweeEventTracker;->b(Lcom/facebook/drawee/components/DraweeEventTracker$Event;)V

    .line 24
    .line 25
    iget-boolean v0, p0, Lo4/a;->t:Z

    .line 26
    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    iget-object v0, p0, Lo4/a;->b:Ln4/a;

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, p0}, Ln4/a;->a(Ln4/a$a;)V

    .line 35
    :cond_1
    const/4 v0, 0x0

    .line 36
    .line 37
    iput-boolean v0, p0, Lo4/a;->l:Z

    .line 38
    .line 39
    iput-boolean v0, p0, Lo4/a;->n:Z

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Lo4/a;->Q()V

    .line 43
    .line 44
    iput-boolean v0, p0, Lo4/a;->p:Z

    .line 45
    .line 46
    iget-object v0, p0, Lo4/a;->d:Ln4/c;

    .line 47
    .line 48
    if-eqz v0, :cond_2

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Ln4/c;->a()V

    .line 52
    .line 53
    :cond_2
    iget-object v0, p0, Lo4/a;->e:Ls4/a;

    .line 54
    .line 55
    if-eqz v0, :cond_3

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Ls4/a;->a()V

    .line 59
    .line 60
    iget-object v0, p0, Lo4/a;->e:Ls4/a;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, p0}, Ls4/a;->f(Ls4/a$a;)V

    .line 64
    .line 65
    :cond_3
    iget-object v0, p0, Lo4/a;->f:Lo4/c;

    .line 66
    .line 67
    instance-of v1, v0, Lo4/a$b;

    .line 68
    const/4 v2, 0x0

    .line 69
    .line 70
    if-eqz v1, :cond_4

    .line 71
    .line 72
    check-cast v0, Lo4/a$b;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Lo4/e;->b()V

    .line 76
    goto :goto_1

    .line 77
    .line 78
    :cond_4
    iput-object v2, p0, Lo4/a;->f:Lo4/c;

    .line 79
    .line 80
    :goto_1
    iget-object v0, p0, Lo4/a;->h:Lt4/c;

    .line 81
    .line 82
    if-eqz v0, :cond_5

    .line 83
    .line 84
    .line 85
    invoke-interface {v0}, Lt4/c;->reset()V

    .line 86
    .line 87
    iget-object v0, p0, Lo4/a;->h:Lt4/c;

    .line 88
    .line 89
    .line 90
    invoke-interface {v0, v2}, Lt4/c;->c(Landroid/graphics/drawable/Drawable;)V

    .line 91
    .line 92
    iput-object v2, p0, Lo4/a;->h:Lt4/c;

    .line 93
    .line 94
    :cond_5
    iput-object v2, p0, Lo4/a;->i:Landroid/graphics/drawable/Drawable;

    .line 95
    const/4 v0, 0x2

    .line 96
    .line 97
    .line 98
    invoke-static {v0}, Lx3/a;->w(I)Z

    .line 99
    move-result v0

    .line 100
    .line 101
    if-eqz v0, :cond_6

    .line 102
    .line 103
    sget-object v0, Lo4/a;->y:Ljava/lang/Class;

    .line 104
    .line 105
    const-string v1, "controller %x %s -> %s: initialize"

    .line 106
    .line 107
    .line 108
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 109
    move-result v2

    .line 110
    .line 111
    .line 112
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 113
    move-result-object v2

    .line 114
    .line 115
    iget-object v3, p0, Lo4/a;->j:Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    invoke-static {v0, v1, v2, v3, p1}, Lx3/a;->A(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 119
    .line 120
    :cond_6
    iput-object p1, p0, Lo4/a;->j:Ljava/lang/String;

    .line 121
    .line 122
    iput-object p2, p0, Lo4/a;->k:Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    invoke-static {}, Ld6/b;->d()Z

    .line 126
    move-result p1

    .line 127
    .line 128
    if-eqz p1, :cond_7

    .line 129
    .line 130
    .line 131
    invoke-static {}, Ld6/b;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 132
    :cond_7
    monitor-exit p0

    .line 133
    return-void

    .line 134
    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 135
    throw p1
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

.method public D(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lo4/a;->C(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    const/4 p1, 0x0

    .line 5
    .line 6
    iput-boolean p1, p0, Lo4/a;->t:Z

    .line 7
    .line 8
    iput-boolean p1, p0, Lo4/a;->u:Z

    .line 9
    return-void
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

.method public final E(Ljava/lang/String;Lf4/b;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lf4/b<",
            "TT;>;)Z"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lo4/a;->r:Lf4/b;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    return v0

    .line 9
    .line 10
    :cond_0
    iget-object v1, p0, Lo4/a;->j:Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    move-result p1

    .line 15
    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    iget-object p1, p0, Lo4/a;->r:Lf4/b;

    .line 19
    .line 20
    if-ne p2, p1, :cond_1

    .line 21
    .line 22
    iget-boolean p1, p0, Lo4/a;->m:Z

    .line 23
    .line 24
    if-eqz p1, :cond_1

    .line 25
    return v0

    .line 26
    :cond_1
    const/4 p1, 0x0

    .line 27
    return p1
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

.method public F()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lo4/a;->u:Z

    .line 3
    return v0
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

.method public final G(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 7

    .line 1
    const/4 v0, 0x2

    .line 2
    .line 3
    .line 4
    invoke-static {v0}, Lx3/a;->w(I)Z

    .line 5
    move-result v0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object v1, Lo4/a;->y:Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 13
    move-result v0

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 17
    move-result-object v3

    .line 18
    .line 19
    iget-object v4, p0, Lo4/a;->j:Ljava/lang/String;

    .line 20
    .line 21
    const-string v2, "controller %x %s: %s: failure: %s"

    .line 22
    move-object v5, p1

    .line 23
    move-object v6, p2

    .line 24
    .line 25
    .line 26
    invoke-static/range {v1 .. v6}, Lx3/a;->B(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

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
.end method

.method public final H(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "TT;)V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x2

    .line 2
    .line 3
    .line 4
    invoke-static {v0}, Lx3/a;->w(I)Z

    .line 5
    move-result v0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lo4/a;->y:Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 13
    move-result v1

    .line 14
    .line 15
    .line 16
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 17
    move-result-object v1

    .line 18
    .line 19
    iget-object v2, p0, Lo4/a;->j:Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, p2}, Lo4/a;->w(Ljava/lang/Object;)Ljava/lang/String;

    .line 23
    move-result-object v3

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p2}, Lo4/a;->x(Ljava/lang/Object;)I

    .line 27
    move-result p2

    .line 28
    .line 29
    .line 30
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    move-result-object p2

    .line 32
    .line 33
    .line 34
    filled-new-array {v1, v2, p1, v3, p2}, [Ljava/lang/Object;

    .line 35
    move-result-object p1

    .line 36
    .line 37
    const-string p2, "controller %x %s: %s: image: %s %x"

    .line 38
    .line 39
    .line 40
    invoke-static {v0, p2, p1}, Lx3/a;->C(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 41
    :cond_0
    return-void
    .line 42
.end method

.method public final I(Lf4/b;Ljava/lang/Object;Landroid/net/Uri;)Lcom/facebook/fresco/ui/common/ControllerListener2$Extras;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf4/b<",
            "TT;>;TINFO;",
            "Landroid/net/Uri;",
            ")",
            "Lcom/facebook/fresco/ui/common/ControllerListener2$Extras;"
        }
    .end annotation

    .line 1
    .line 2
    if-nez p1, :cond_0

    .line 3
    const/4 p1, 0x0

    .line 4
    goto :goto_0

    .line 5
    .line 6
    .line 7
    :cond_0
    invoke-interface {p1}, Lf4/b;->getExtras()Ljava/util/Map;

    .line 8
    move-result-object p1

    .line 9
    .line 10
    .line 11
    :goto_0
    invoke-virtual {p0, p2}, Lo4/a;->K(Ljava/lang/Object;)Ljava/util/Map;

    .line 12
    move-result-object p2

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1, p2, p3}, Lo4/a;->J(Ljava/util/Map;Ljava/util/Map;Landroid/net/Uri;)Lcom/facebook/fresco/ui/common/ControllerListener2$Extras;

    .line 16
    move-result-object p1

    .line 17
    return-object p1
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

.method public final J(Ljava/util/Map;Ljava/util/Map;Landroid/net/Uri;)Lcom/facebook/fresco/ui/common/ControllerListener2$Extras;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Landroid/net/Uri;",
            ")",
            "Lcom/facebook/fresco/ui/common/ControllerListener2$Extras;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lo4/a;->h:Lt4/c;

    .line 3
    .line 4
    instance-of v1, v0, Lr4/a;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    check-cast v0, Lr4/a;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lr4/a;->m()Lcom/facebook/drawee/drawable/q;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    .line 15
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Lr4/a;->l()Landroid/graphics/PointF;

    .line 20
    move-result-object v0

    .line 21
    move-object v8, v0

    .line 22
    move-object v7, v1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v1, 0x0

    .line 25
    move-object v7, v1

    .line 26
    move-object v8, v7

    .line 27
    .line 28
    :goto_0
    sget-object v2, Lo4/a;->w:Ljava/util/Map;

    .line 29
    .line 30
    sget-object v3, Lo4/a;->x:Ljava/util/Map;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lo4/a;->t()Landroid/graphics/Rect;

    .line 34
    move-result-object v6

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lo4/a;->o()Ljava/lang/Object;

    .line 38
    move-result-object v10

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Lo4/a;->F()Z

    .line 42
    move-result v11

    .line 43
    const/4 v5, 0x0

    .line 44
    move-object v4, p1

    .line 45
    move-object v9, p2

    .line 46
    .line 47
    move-object/from16 v12, p3

    .line 48
    .line 49
    .line 50
    invoke-static/range {v2 .. v12}, Lf5/a;->a(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Landroid/graphics/Rect;Ljava/lang/String;Landroid/graphics/PointF;Ljava/util/Map;Ljava/lang/Object;ZLandroid/net/Uri;)Lcom/facebook/fresco/ui/common/ControllerListener2$Extras;

    .line 51
    move-result-object p1

    .line 52
    return-object p1
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

.method public abstract K(Ljava/lang/Object;)Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TINFO;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end method

.method public final L(Ljava/lang/String;Lf4/b;Ljava/lang/Throwable;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lf4/b<",
            "TT;>;",
            "Ljava/lang/Throwable;",
            "Z)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ld6/b;->d()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const-string v0, "AbstractDraweeController#onFailureInternal"

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Ld6/b;->a(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0, p1, p2}, Lo4/a;->E(Ljava/lang/String;Lf4/b;)Z

    .line 15
    move-result p1

    .line 16
    .line 17
    if-nez p1, :cond_1

    .line 18
    .line 19
    const-string p1, "ignore_old_datasource @ onFailure"

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, p1, p3}, Lo4/a;->G(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    invoke-interface {p2}, Lf4/b;->close()Z

    .line 26
    .line 27
    .line 28
    invoke-static {}, Ld6/b;->d()Z

    .line 29
    move-result p1

    .line 30
    .line 31
    if-eqz p1, :cond_7

    .line 32
    .line 33
    .line 34
    invoke-static {}, Ld6/b;->b()V

    .line 35
    return-void

    .line 36
    .line 37
    :cond_1
    iget-object p1, p0, Lo4/a;->a:Lcom/facebook/drawee/components/DraweeEventTracker;

    .line 38
    .line 39
    if-eqz p4, :cond_2

    .line 40
    .line 41
    sget-object v0, Lcom/facebook/drawee/components/DraweeEventTracker$Event;->ON_DATASOURCE_FAILURE:Lcom/facebook/drawee/components/DraweeEventTracker$Event;

    .line 42
    goto :goto_0

    .line 43
    .line 44
    :cond_2
    sget-object v0, Lcom/facebook/drawee/components/DraweeEventTracker$Event;->ON_DATASOURCE_FAILURE_INT:Lcom/facebook/drawee/components/DraweeEventTracker$Event;

    .line 45
    .line 46
    .line 47
    :goto_0
    invoke-virtual {p1, v0}, Lcom/facebook/drawee/components/DraweeEventTracker;->b(Lcom/facebook/drawee/components/DraweeEventTracker$Event;)V

    .line 48
    .line 49
    if-eqz p4, :cond_6

    .line 50
    .line 51
    const-string p1, "final_failed @ onFailure"

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, p1, p3}, Lo4/a;->G(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 55
    const/4 p1, 0x0

    .line 56
    .line 57
    iput-object p1, p0, Lo4/a;->r:Lf4/b;

    .line 58
    const/4 p1, 0x1

    .line 59
    .line 60
    iput-boolean p1, p0, Lo4/a;->o:Z

    .line 61
    .line 62
    iget-object p4, p0, Lo4/a;->h:Lt4/c;

    .line 63
    .line 64
    if-eqz p4, :cond_5

    .line 65
    .line 66
    iget-boolean v0, p0, Lo4/a;->p:Z

    .line 67
    .line 68
    if-eqz v0, :cond_3

    .line 69
    .line 70
    iget-object v0, p0, Lo4/a;->v:Landroid/graphics/drawable/Drawable;

    .line 71
    .line 72
    if-eqz v0, :cond_3

    .line 73
    .line 74
    const/high16 v1, 0x3f800000    # 1.0f

    .line 75
    .line 76
    .line 77
    invoke-interface {p4, v0, v1, p1}, Lt4/c;->f(Landroid/graphics/drawable/Drawable;FZ)V

    .line 78
    goto :goto_1

    .line 79
    .line 80
    .line 81
    :cond_3
    invoke-virtual {p0}, Lo4/a;->g0()Z

    .line 82
    move-result p1

    .line 83
    .line 84
    if-eqz p1, :cond_4

    .line 85
    .line 86
    .line 87
    invoke-interface {p4, p3}, Lt4/c;->a(Ljava/lang/Throwable;)V

    .line 88
    goto :goto_1

    .line 89
    .line 90
    .line 91
    :cond_4
    invoke-interface {p4, p3}, Lt4/c;->d(Ljava/lang/Throwable;)V

    .line 92
    .line 93
    .line 94
    :cond_5
    :goto_1
    invoke-virtual {p0, p3, p2}, Lo4/a;->T(Ljava/lang/Throwable;Lf4/b;)V

    .line 95
    goto :goto_2

    .line 96
    .line 97
    :cond_6
    const-string p1, "intermediate_failed @ onFailure"

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0, p1, p3}, Lo4/a;->G(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0, p3}, Lo4/a;->U(Ljava/lang/Throwable;)V

    .line 104
    .line 105
    .line 106
    :goto_2
    invoke-static {}, Ld6/b;->d()Z

    .line 107
    move-result p1

    .line 108
    .line 109
    if-eqz p1, :cond_7

    .line 110
    .line 111
    .line 112
    invoke-static {}, Ld6/b;->b()V

    .line 113
    :cond_7
    return-void
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

.method public M(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "TT;)V"
        }
    .end annotation

    .line 1
    return-void
    .line 2
    .line 3
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

.method public final N(Ljava/lang/String;Lf4/b;Ljava/lang/Object;FZZZ)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lf4/b<",
            "TT;>;TT;FZZZ)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    :try_start_0
    invoke-static {}, Ld6/b;->d()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const-string v0, "AbstractDraweeController#onNewResultInternal"

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Ld6/b;->a(Ljava/lang/String;)V

    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-exception p1

    .line 14
    .line 15
    goto/16 :goto_4

    .line 16
    .line 17
    .line 18
    :cond_0
    :goto_0
    invoke-virtual {p0, p1, p2}, Lo4/a;->E(Ljava/lang/String;Lf4/b;)Z

    .line 19
    move-result v0

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    const-string p1, "ignore_old_datasource @ onNewResult"

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p1, p3}, Lo4/a;->H(Ljava/lang/String;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, p3}, Lo4/a;->R(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-interface {p2}, Lf4/b;->close()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    .line 35
    invoke-static {}, Ld6/b;->d()Z

    .line 36
    move-result p1

    .line 37
    .line 38
    if-eqz p1, :cond_9

    .line 39
    .line 40
    .line 41
    invoke-static {}, Ld6/b;->b()V

    .line 42
    return-void

    .line 43
    .line 44
    :cond_1
    :try_start_1
    iget-object v0, p0, Lo4/a;->a:Lcom/facebook/drawee/components/DraweeEventTracker;

    .line 45
    .line 46
    if-eqz p5, :cond_2

    .line 47
    .line 48
    sget-object v1, Lcom/facebook/drawee/components/DraweeEventTracker$Event;->ON_DATASOURCE_RESULT:Lcom/facebook/drawee/components/DraweeEventTracker$Event;

    .line 49
    goto :goto_1

    .line 50
    .line 51
    :cond_2
    sget-object v1, Lcom/facebook/drawee/components/DraweeEventTracker$Event;->ON_DATASOURCE_RESULT_INT:Lcom/facebook/drawee/components/DraweeEventTracker$Event;

    .line 52
    .line 53
    .line 54
    :goto_1
    invoke-virtual {v0, v1}, Lcom/facebook/drawee/components/DraweeEventTracker;->b(Lcom/facebook/drawee/components/DraweeEventTracker$Event;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 55
    .line 56
    .line 57
    :try_start_2
    invoke-virtual {p0, p3}, Lo4/a;->l(Ljava/lang/Object;)Landroid/graphics/drawable/Drawable;

    .line 58
    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 59
    .line 60
    :try_start_3
    iget-object v1, p0, Lo4/a;->s:Ljava/lang/Object;

    .line 61
    .line 62
    iget-object v2, p0, Lo4/a;->v:Landroid/graphics/drawable/Drawable;

    .line 63
    .line 64
    iput-object p3, p0, Lo4/a;->s:Ljava/lang/Object;

    .line 65
    .line 66
    iput-object v0, p0, Lo4/a;->v:Landroid/graphics/drawable/Drawable;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 67
    .line 68
    .line 69
    const-string/jumbo v3, "release_previous_result @ onNewResult"

    .line 70
    .line 71
    const/high16 v4, 0x3f800000    # 1.0f

    .line 72
    .line 73
    if-eqz p5, :cond_3

    .line 74
    .line 75
    .line 76
    :try_start_4
    const-string/jumbo p4, "set_final_result @ onNewResult"

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0, p4, p3}, Lo4/a;->H(Ljava/lang/String;Ljava/lang/Object;)V

    .line 80
    const/4 p4, 0x0

    .line 81
    .line 82
    iput-object p4, p0, Lo4/a;->r:Lf4/b;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0}, Lo4/a;->B()Lt4/c;

    .line 86
    move-result-object p4

    .line 87
    .line 88
    .line 89
    invoke-interface {p4, v0, v4, p6}, Lt4/c;->f(Landroid/graphics/drawable/Drawable;FZ)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0, p1, p3, p2}, Lo4/a;->Y(Ljava/lang/String;Ljava/lang/Object;Lf4/b;)V

    .line 93
    goto :goto_2

    .line 94
    :catchall_1
    move-exception p1

    .line 95
    goto :goto_3

    .line 96
    .line 97
    :cond_3
    if-eqz p7, :cond_4

    .line 98
    .line 99
    .line 100
    const-string/jumbo p4, "set_temporary_result @ onNewResult"

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0, p4, p3}, Lo4/a;->H(Ljava/lang/String;Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0}, Lo4/a;->B()Lt4/c;

    .line 107
    move-result-object p4

    .line 108
    .line 109
    .line 110
    invoke-interface {p4, v0, v4, p6}, Lt4/c;->f(Landroid/graphics/drawable/Drawable;FZ)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0, p1, p3, p2}, Lo4/a;->Y(Ljava/lang/String;Ljava/lang/Object;Lf4/b;)V

    .line 114
    goto :goto_2

    .line 115
    .line 116
    .line 117
    :cond_4
    const-string/jumbo p2, "set_intermediate_result @ onNewResult"

    .line 118
    .line 119
    .line 120
    invoke-virtual {p0, p2, p3}, Lo4/a;->H(Ljava/lang/String;Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p0}, Lo4/a;->B()Lt4/c;

    .line 124
    move-result-object p2

    .line 125
    .line 126
    .line 127
    invoke-interface {p2, v0, p4, p6}, Lt4/c;->f(Landroid/graphics/drawable/Drawable;FZ)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p0, p1, p3}, Lo4/a;->V(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 131
    .line 132
    :goto_2
    if-eqz v2, :cond_5

    .line 133
    .line 134
    if-eq v2, v0, :cond_5

    .line 135
    .line 136
    .line 137
    :try_start_5
    invoke-virtual {p0, v2}, Lo4/a;->P(Landroid/graphics/drawable/Drawable;)V

    .line 138
    .line 139
    :cond_5
    if-eqz v1, :cond_6

    .line 140
    .line 141
    if-eq v1, p3, :cond_6

    .line 142
    .line 143
    .line 144
    invoke-virtual {p0, v3, v1}, Lo4/a;->H(Ljava/lang/String;Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p0, v1}, Lo4/a;->R(Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 148
    .line 149
    .line 150
    :cond_6
    invoke-static {}, Ld6/b;->d()Z

    .line 151
    move-result p1

    .line 152
    .line 153
    if-eqz p1, :cond_9

    .line 154
    .line 155
    .line 156
    invoke-static {}, Ld6/b;->b()V

    .line 157
    return-void

    .line 158
    .line 159
    :goto_3
    if-eqz v2, :cond_7

    .line 160
    .line 161
    if-eq v2, v0, :cond_7

    .line 162
    .line 163
    .line 164
    :try_start_6
    invoke-virtual {p0, v2}, Lo4/a;->P(Landroid/graphics/drawable/Drawable;)V

    .line 165
    .line 166
    :cond_7
    if-eqz v1, :cond_8

    .line 167
    .line 168
    if-eq v1, p3, :cond_8

    .line 169
    .line 170
    .line 171
    invoke-virtual {p0, v3, v1}, Lo4/a;->H(Ljava/lang/String;Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {p0, v1}, Lo4/a;->R(Ljava/lang/Object;)V

    .line 175
    :cond_8
    throw p1

    .line 176
    :catch_0
    move-exception p4

    .line 177
    .line 178
    const-string p6, "drawable_failed @ onNewResult"

    .line 179
    .line 180
    .line 181
    invoke-virtual {p0, p6, p3}, Lo4/a;->H(Ljava/lang/String;Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {p0, p3}, Lo4/a;->R(Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {p0, p1, p2, p4, p5}, Lo4/a;->L(Ljava/lang/String;Lf4/b;Ljava/lang/Throwable;Z)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 188
    .line 189
    .line 190
    invoke-static {}, Ld6/b;->d()Z

    .line 191
    move-result p1

    .line 192
    .line 193
    if-eqz p1, :cond_9

    .line 194
    .line 195
    .line 196
    invoke-static {}, Ld6/b;->b()V

    .line 197
    :cond_9
    return-void

    .line 198
    .line 199
    .line 200
    :goto_4
    invoke-static {}, Ld6/b;->d()Z

    .line 201
    move-result p2

    .line 202
    .line 203
    if-eqz p2, :cond_a

    .line 204
    .line 205
    .line 206
    invoke-static {}, Ld6/b;->b()V

    .line 207
    :cond_a
    throw p1
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
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
.end method

.method public final O(Ljava/lang/String;Lf4/b;FZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lf4/b<",
            "TT;>;FZ)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lo4/a;->E(Ljava/lang/String;Lf4/b;)Z

    .line 4
    move-result p1

    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    const-string p1, "ignore_old_datasource @ onProgress"

    .line 9
    const/4 p3, 0x0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1, p3}, Lo4/a;->G(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p2}, Lf4/b;->close()Z

    .line 16
    return-void

    .line 17
    .line 18
    :cond_0
    if-nez p4, :cond_1

    .line 19
    .line 20
    iget-object p1, p0, Lo4/a;->h:Lt4/c;

    .line 21
    const/4 p2, 0x0

    .line 22
    .line 23
    .line 24
    invoke-interface {p1, p3, p2}, Lt4/c;->e(FZ)V

    .line 25
    :cond_1
    return-void
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

.method public abstract P(Landroid/graphics/drawable/Drawable;)V
.end method

.method public final Q()V
    .locals 6

    .line 1
    .line 2
    iget-boolean v0, p0, Lo4/a;->m:Z

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    iput-boolean v1, p0, Lo4/a;->m:Z

    .line 6
    .line 7
    iput-boolean v1, p0, Lo4/a;->o:Z

    .line 8
    .line 9
    iget-object v1, p0, Lo4/a;->r:Lf4/b;

    .line 10
    const/4 v2, 0x0

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-interface {v1}, Lf4/b;->getExtras()Ljava/util/Map;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    iget-object v3, p0, Lo4/a;->r:Lf4/b;

    .line 19
    .line 20
    .line 21
    invoke-interface {v3}, Lf4/b;->close()Z

    .line 22
    .line 23
    iput-object v2, p0, Lo4/a;->r:Lf4/b;

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-object v1, v2

    .line 26
    .line 27
    :goto_0
    iget-object v3, p0, Lo4/a;->v:Landroid/graphics/drawable/Drawable;

    .line 28
    .line 29
    if-eqz v3, :cond_1

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v3}, Lo4/a;->P(Landroid/graphics/drawable/Drawable;)V

    .line 33
    .line 34
    :cond_1
    iget-object v3, p0, Lo4/a;->q:Ljava/lang/String;

    .line 35
    .line 36
    if-eqz v3, :cond_2

    .line 37
    .line 38
    iput-object v2, p0, Lo4/a;->q:Ljava/lang/String;

    .line 39
    .line 40
    :cond_2
    iput-object v2, p0, Lo4/a;->v:Landroid/graphics/drawable/Drawable;

    .line 41
    .line 42
    iget-object v3, p0, Lo4/a;->s:Ljava/lang/Object;

    .line 43
    .line 44
    if-eqz v3, :cond_3

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, v3}, Lo4/a;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    move-result-object v3

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, v3}, Lo4/a;->K(Ljava/lang/Object;)Ljava/util/Map;

    .line 52
    move-result-object v3

    .line 53
    .line 54
    .line 55
    const-string/jumbo v4, "release"

    .line 56
    .line 57
    iget-object v5, p0, Lo4/a;->s:Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, v4, v5}, Lo4/a;->H(Ljava/lang/String;Ljava/lang/Object;)V

    .line 61
    .line 62
    iget-object v4, p0, Lo4/a;->s:Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, v4}, Lo4/a;->R(Ljava/lang/Object;)V

    .line 66
    .line 67
    iput-object v2, p0, Lo4/a;->s:Ljava/lang/Object;

    .line 68
    move-object v2, v3

    .line 69
    .line 70
    :cond_3
    if-eqz v0, :cond_4

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, v1, v2}, Lo4/a;->W(Ljava/util/Map;Ljava/util/Map;)V

    .line 74
    :cond_4
    return-void
    .line 75
    .line 76
    .line 77
.end method

.method public abstract R(Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation
.end method

.method public S(Lcom/facebook/fresco/ui/common/ControllerListener2;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/fresco/ui/common/ControllerListener2<",
            "TINFO;>;)V"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lo4/a;->g:Lcom/facebook/fresco/ui/common/ForwardingControllerListener2;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/facebook/fresco/ui/common/ForwardingControllerListener2;->m(Lcom/facebook/fresco/ui/common/ControllerListener2;)V

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

.method public final T(Ljava/lang/Throwable;Lf4/b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Throwable;",
            "Lf4/b<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p2, v0, v0}, Lo4/a;->I(Lf4/b;Ljava/lang/Object;Landroid/net/Uri;)Lcom/facebook/fresco/ui/common/ControllerListener2$Extras;

    .line 5
    move-result-object p2

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lo4/a;->p()Lo4/c;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    iget-object v1, p0, Lo4/a;->j:Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    invoke-interface {v0, v1, p1}, Lo4/c;->onFailure(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lo4/a;->q()Lcom/facebook/fresco/ui/common/ControllerListener2;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    iget-object v1, p0, Lo4/a;->j:Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    invoke-interface {v0, v1, p1, p2}, Lcom/facebook/fresco/ui/common/ControllerListener2;->j(Ljava/lang/String;Ljava/lang/Throwable;Lcom/facebook/fresco/ui/common/ControllerListener2$Extras;)V

    .line 24
    return-void
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

.method public final U(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lo4/a;->p()Lo4/c;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget-object v1, p0, Lo4/a;->j:Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-interface {v0, v1, p1}, Lo4/c;->onIntermediateImageFailed(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lo4/a;->q()Lcom/facebook/fresco/ui/common/ControllerListener2;

    .line 13
    move-result-object p1

    .line 14
    .line 15
    iget-object v0, p0, Lo4/a;->j:Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    invoke-interface {p1, v0}, Lcom/facebook/fresco/ui/common/ControllerListener2;->a(Ljava/lang/String;)V

    .line 19
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public final V(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "TT;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p2}, Lo4/a;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    move-result-object p2

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lo4/a;->p()Lo4/c;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, p1, p2}, Lo4/c;->onIntermediateImageSet(Ljava/lang/String;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lo4/a;->q()Lcom/facebook/fresco/ui/common/ControllerListener2;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    .line 18
    invoke-interface {v0, p1, p2}, Lcom/facebook/fresco/ui/common/ControllerListener2;->onIntermediateImageSet(Ljava/lang/String;Ljava/lang/Object;)V

    .line 19
    return-void
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

.method public final W(Ljava/util/Map;Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lo4/a;->p()Lo4/c;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget-object v1, p0, Lo4/a;->j:Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-interface {v0, v1}, Lo4/c;->onRelease(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lo4/a;->q()Lcom/facebook/fresco/ui/common/ControllerListener2;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    iget-object v1, p0, Lo4/a;->j:Ljava/lang/String;

    .line 16
    const/4 v2, 0x0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p1, p2, v2}, Lo4/a;->J(Ljava/util/Map;Ljava/util/Map;Landroid/net/Uri;)Lcom/facebook/fresco/ui/common/ControllerListener2$Extras;

    .line 20
    move-result-object p1

    .line 21
    .line 22
    .line 23
    invoke-interface {v0, v1, p1}, Lcom/facebook/fresco/ui/common/ControllerListener2;->h(Ljava/lang/String;Lcom/facebook/fresco/ui/common/ControllerListener2$Extras;)V

    .line 24
    return-void
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

.method public X(Lf4/b;Ljava/lang/Object;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf4/b<",
            "TT;>;TINFO;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lo4/a;->p()Lo4/c;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget-object v1, p0, Lo4/a;->j:Ljava/lang/String;

    .line 7
    .line 8
    iget-object v2, p0, Lo4/a;->k:Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, v1, v2}, Lo4/c;->onSubmit(Ljava/lang/String;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lo4/a;->q()Lcom/facebook/fresco/ui/common/ControllerListener2;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    iget-object v1, p0, Lo4/a;->j:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v2, p0, Lo4/a;->k:Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lo4/a;->z()Landroid/net/Uri;

    .line 23
    move-result-object v3

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p1, p2, v3}, Lo4/a;->I(Lf4/b;Ljava/lang/Object;Landroid/net/Uri;)Lcom/facebook/fresco/ui/common/ControllerListener2$Extras;

    .line 27
    move-result-object p1

    .line 28
    .line 29
    .line 30
    invoke-interface {v0, v1, v2, p1}, Lcom/facebook/fresco/ui/common/ControllerListener2;->i(Ljava/lang/String;Ljava/lang/Object;Lcom/facebook/fresco/ui/common/ControllerListener2$Extras;)V

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
.end method

.method public final Y(Ljava/lang/String;Ljava/lang/Object;Lf4/b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "TT;",
            "Lf4/b<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p2}, Lo4/a;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    move-result-object p2

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lo4/a;->p()Lo4/c;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lo4/a;->m()Landroid/graphics/drawable/Animatable;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    .line 15
    invoke-interface {v0, p1, p2, v1}, Lo4/c;->onFinalImageSet(Ljava/lang/String;Ljava/lang/Object;Landroid/graphics/drawable/Animatable;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lo4/a;->q()Lcom/facebook/fresco/ui/common/ControllerListener2;

    .line 19
    move-result-object v0

    .line 20
    const/4 v1, 0x0

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p3, p2, v1}, Lo4/a;->I(Lf4/b;Ljava/lang/Object;Landroid/net/Uri;)Lcom/facebook/fresco/ui/common/ControllerListener2$Extras;

    .line 24
    move-result-object p3

    .line 25
    .line 26
    .line 27
    invoke-interface {v0, p1, p2, p3}, Lcom/facebook/fresco/ui/common/ControllerListener2;->g(Ljava/lang/String;Ljava/lang/Object;Lcom/facebook/fresco/ui/common/ControllerListener2$Extras;)V

    .line 28
    return-void
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

.method public Z(Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lo4/a;->q:Ljava/lang/String;

    .line 3
    return-void
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

.method public a()Z
    .locals 4

    .line 1
    const/4 v0, 0x2

    .line 2
    .line 3
    .line 4
    invoke-static {v0}, Lx3/a;->w(I)Z

    .line 5
    move-result v0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lo4/a;->y:Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 13
    move-result v1

    .line 14
    .line 15
    .line 16
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 17
    move-result-object v1

    .line 18
    .line 19
    iget-object v2, p0, Lo4/a;->j:Ljava/lang/String;

    .line 20
    .line 21
    const-string v3, "controller %x %s: onClick"

    .line 22
    .line 23
    .line 24
    invoke-static {v0, v3, v1, v2}, Lx3/a;->z(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    invoke-virtual {p0}, Lo4/a;->g0()Z

    .line 28
    move-result v0

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    iget-object v0, p0, Lo4/a;->d:Ln4/c;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ln4/c;->b()V

    .line 36
    .line 37
    iget-object v0, p0, Lo4/a;->h:Lt4/c;

    .line 38
    .line 39
    .line 40
    invoke-interface {v0}, Lt4/c;->reset()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Lo4/a;->h0()V

    .line 44
    const/4 v0, 0x1

    .line 45
    return v0

    .line 46
    :cond_1
    const/4 v0, 0x0

    .line 47
    return v0
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
.end method

.method public a0(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    .line 2
    iput-object p1, p0, Lo4/a;->i:Landroid/graphics/drawable/Drawable;

    .line 3
    .line 4
    iget-object v0, p0, Lo4/a;->h:Lt4/c;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-interface {v0, p1}, Lt4/c;->c(Landroid/graphics/drawable/Drawable;)V

    .line 10
    :cond_0
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
.end method

.method public b(Landroid/view/MotionEvent;)Z
    .locals 4

    .line 1
    const/4 v0, 0x2

    .line 2
    .line 3
    .line 4
    invoke-static {v0}, Lx3/a;->w(I)Z

    .line 5
    move-result v0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lo4/a;->y:Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 13
    move-result v1

    .line 14
    .line 15
    .line 16
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 17
    move-result-object v1

    .line 18
    .line 19
    iget-object v2, p0, Lo4/a;->j:Ljava/lang/String;

    .line 20
    .line 21
    const-string v3, "controller %x %s: onTouchEvent %s"

    .line 22
    .line 23
    .line 24
    invoke-static {v0, v3, v1, v2, p1}, Lx3/a;->A(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 25
    .line 26
    :cond_0
    iget-object v0, p0, Lo4/a;->e:Ls4/a;

    .line 27
    const/4 v1, 0x0

    .line 28
    .line 29
    if-nez v0, :cond_1

    .line 30
    return v1

    .line 31
    .line 32
    .line 33
    :cond_1
    invoke-virtual {v0}, Ls4/a;->b()Z

    .line 34
    move-result v0

    .line 35
    .line 36
    if-nez v0, :cond_3

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Lo4/a;->f0()Z

    .line 40
    move-result v0

    .line 41
    .line 42
    if-eqz v0, :cond_2

    .line 43
    goto :goto_0

    .line 44
    :cond_2
    return v1

    .line 45
    .line 46
    :cond_3
    :goto_0
    iget-object v0, p0, Lo4/a;->e:Ls4/a;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, p1}, Ls4/a;->d(Landroid/view/MotionEvent;)Z

    .line 50
    const/4 p1, 0x1

    .line 51
    return p1
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

.method public b0(Lo4/d;)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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

.method public c()V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ld6/b;->d()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const-string v0, "AbstractDraweeController#onAttach"

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Ld6/b;->a(Ljava/lang/String;)V

    .line 12
    :cond_0
    const/4 v0, 0x2

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lx3/a;->w(I)Z

    .line 16
    move-result v0

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    sget-object v0, Lo4/a;->y:Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 24
    move-result v1

    .line 25
    .line 26
    .line 27
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    iget-object v2, p0, Lo4/a;->j:Ljava/lang/String;

    .line 31
    .line 32
    iget-boolean v3, p0, Lo4/a;->m:Z

    .line 33
    .line 34
    if-eqz v3, :cond_1

    .line 35
    .line 36
    .line 37
    const-string/jumbo v3, "request already submitted"

    .line 38
    goto :goto_0

    .line 39
    .line 40
    .line 41
    :cond_1
    const-string/jumbo v3, "request needs submit"

    .line 42
    .line 43
    :goto_0
    const-string v4, "controller %x %s: onAttach: %s"

    .line 44
    .line 45
    .line 46
    invoke-static {v0, v4, v1, v2, v3}, Lx3/a;->A(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 47
    .line 48
    :cond_2
    iget-object v0, p0, Lo4/a;->a:Lcom/facebook/drawee/components/DraweeEventTracker;

    .line 49
    .line 50
    sget-object v1, Lcom/facebook/drawee/components/DraweeEventTracker$Event;->ON_ATTACH_CONTROLLER:Lcom/facebook/drawee/components/DraweeEventTracker$Event;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v1}, Lcom/facebook/drawee/components/DraweeEventTracker;->b(Lcom/facebook/drawee/components/DraweeEventTracker$Event;)V

    .line 54
    .line 55
    iget-object v0, p0, Lo4/a;->h:Lt4/c;

    .line 56
    .line 57
    .line 58
    invoke-static {v0}, Lw3/h;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    iget-object v0, p0, Lo4/a;->b:Ln4/a;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, p0}, Ln4/a;->a(Ln4/a$a;)V

    .line 64
    const/4 v0, 0x1

    .line 65
    .line 66
    iput-boolean v0, p0, Lo4/a;->l:Z

    .line 67
    .line 68
    iget-boolean v0, p0, Lo4/a;->m:Z

    .line 69
    .line 70
    if-nez v0, :cond_3

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0}, Lo4/a;->h0()V

    .line 74
    .line 75
    .line 76
    :cond_3
    invoke-static {}, Ld6/b;->d()Z

    .line 77
    move-result v0

    .line 78
    .line 79
    if-eqz v0, :cond_4

    .line 80
    .line 81
    .line 82
    invoke-static {}, Ld6/b;->b()V

    .line 83
    :cond_4
    return-void
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
.end method

.method public c0(Ls4/a;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lo4/a;->e:Ls4/a;

    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1, p0}, Ls4/a;->f(Ls4/a$a;)V

    .line 8
    :cond_0
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
.end method

.method public d()V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ld6/b;->d()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const-string v0, "AbstractDraweeController#onDetach"

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Ld6/b;->a(Ljava/lang/String;)V

    .line 12
    :cond_0
    const/4 v0, 0x2

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lx3/a;->w(I)Z

    .line 16
    move-result v0

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    sget-object v0, Lo4/a;->y:Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 24
    move-result v1

    .line 25
    .line 26
    .line 27
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    iget-object v2, p0, Lo4/a;->j:Ljava/lang/String;

    .line 31
    .line 32
    const-string v3, "controller %x %s: onDetach"

    .line 33
    .line 34
    .line 35
    invoke-static {v0, v3, v1, v2}, Lx3/a;->z(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 36
    .line 37
    :cond_1
    iget-object v0, p0, Lo4/a;->a:Lcom/facebook/drawee/components/DraweeEventTracker;

    .line 38
    .line 39
    sget-object v1, Lcom/facebook/drawee/components/DraweeEventTracker$Event;->ON_DETACH_CONTROLLER:Lcom/facebook/drawee/components/DraweeEventTracker$Event;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Lcom/facebook/drawee/components/DraweeEventTracker;->b(Lcom/facebook/drawee/components/DraweeEventTracker$Event;)V

    .line 43
    const/4 v0, 0x0

    .line 44
    .line 45
    iput-boolean v0, p0, Lo4/a;->l:Z

    .line 46
    .line 47
    iget-object v0, p0, Lo4/a;->b:Ln4/a;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, p0}, Ln4/a;->d(Ln4/a$a;)V

    .line 51
    .line 52
    .line 53
    invoke-static {}, Ld6/b;->d()Z

    .line 54
    move-result v0

    .line 55
    .line 56
    if-eqz v0, :cond_2

    .line 57
    .line 58
    .line 59
    invoke-static {}, Ld6/b;->b()V

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
.end method

.method public d0(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lo4/a;->u:Z

    .line 3
    return-void
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

.method public e()Lt4/b;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lo4/a;->h:Lt4/c;

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

.method public e0(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lo4/a;->p:Z

    .line 3
    return-void
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

.method public f(Lt4/b;)V
    .locals 4

    .line 1
    const/4 v0, 0x2

    .line 2
    .line 3
    .line 4
    invoke-static {v0}, Lx3/a;->w(I)Z

    .line 5
    move-result v0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lo4/a;->y:Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 13
    move-result v1

    .line 14
    .line 15
    .line 16
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 17
    move-result-object v1

    .line 18
    .line 19
    iget-object v2, p0, Lo4/a;->j:Ljava/lang/String;

    .line 20
    .line 21
    const-string v3, "controller %x %s: setHierarchy: %s"

    .line 22
    .line 23
    .line 24
    invoke-static {v0, v3, v1, v2, p1}, Lx3/a;->A(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 25
    .line 26
    :cond_0
    iget-object v0, p0, Lo4/a;->a:Lcom/facebook/drawee/components/DraweeEventTracker;

    .line 27
    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    sget-object v1, Lcom/facebook/drawee/components/DraweeEventTracker$Event;->ON_SET_HIERARCHY:Lcom/facebook/drawee/components/DraweeEventTracker$Event;

    .line 31
    goto :goto_0

    .line 32
    .line 33
    :cond_1
    sget-object v1, Lcom/facebook/drawee/components/DraweeEventTracker$Event;->ON_CLEAR_HIERARCHY:Lcom/facebook/drawee/components/DraweeEventTracker$Event;

    .line 34
    .line 35
    .line 36
    :goto_0
    invoke-virtual {v0, v1}, Lcom/facebook/drawee/components/DraweeEventTracker;->b(Lcom/facebook/drawee/components/DraweeEventTracker$Event;)V

    .line 37
    .line 38
    iget-boolean v0, p0, Lo4/a;->m:Z

    .line 39
    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    iget-object v0, p0, Lo4/a;->b:Ln4/a;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, p0}, Ln4/a;->a(Ln4/a$a;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Lo4/a;->release()V

    .line 49
    .line 50
    :cond_2
    iget-object v0, p0, Lo4/a;->h:Lt4/c;

    .line 51
    .line 52
    if-eqz v0, :cond_3

    .line 53
    const/4 v1, 0x0

    .line 54
    .line 55
    .line 56
    invoke-interface {v0, v1}, Lt4/c;->c(Landroid/graphics/drawable/Drawable;)V

    .line 57
    .line 58
    iput-object v1, p0, Lo4/a;->h:Lt4/c;

    .line 59
    .line 60
    :cond_3
    if-eqz p1, :cond_4

    .line 61
    .line 62
    instance-of v0, p1, Lt4/c;

    .line 63
    .line 64
    .line 65
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 66
    move-result-object v0

    .line 67
    .line 68
    .line 69
    invoke-static {v0}, Lw3/h;->b(Ljava/lang/Boolean;)V

    .line 70
    .line 71
    check-cast p1, Lt4/c;

    .line 72
    .line 73
    iput-object p1, p0, Lo4/a;->h:Lt4/c;

    .line 74
    .line 75
    iget-object v0, p0, Lo4/a;->i:Landroid/graphics/drawable/Drawable;

    .line 76
    .line 77
    .line 78
    invoke-interface {p1, v0}, Lt4/c;->c(Landroid/graphics/drawable/Drawable;)V

    .line 79
    :cond_4
    return-void
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
.end method

.method public f0()Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lo4/a;->g0()Z

    .line 4
    move-result v0

    .line 5
    return v0
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

.method public final g0()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lo4/a;->o:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lo4/a;->d:Ln4/c;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ln4/c;->e()Z

    .line 12
    move-result v0

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0
.end method

.method public h0()V
    .locals 9

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ld6/b;->d()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const-string v0, "AbstractDraweeController#submitRequest"

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Ld6/b;->a(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0}, Lo4/a;->n()Ljava/lang/Object;

    .line 15
    move-result-object v4

    .line 16
    const/4 v0, 0x0

    .line 17
    const/4 v1, 0x0

    .line 18
    const/4 v2, 0x1

    .line 19
    .line 20
    if-eqz v4, :cond_3

    .line 21
    .line 22
    .line 23
    invoke-static {}, Ld6/b;->d()Z

    .line 24
    move-result v3

    .line 25
    .line 26
    if-eqz v3, :cond_1

    .line 27
    .line 28
    const-string v3, "AbstractDraweeController#submitRequest->cache"

    .line 29
    .line 30
    .line 31
    invoke-static {v3}, Ld6/b;->a(Ljava/lang/String;)V

    .line 32
    .line 33
    :cond_1
    iput-object v1, p0, Lo4/a;->r:Lf4/b;

    .line 34
    .line 35
    iput-boolean v2, p0, Lo4/a;->m:Z

    .line 36
    .line 37
    iput-boolean v0, p0, Lo4/a;->o:Z

    .line 38
    .line 39
    iget-object v0, p0, Lo4/a;->a:Lcom/facebook/drawee/components/DraweeEventTracker;

    .line 40
    .line 41
    sget-object v1, Lcom/facebook/drawee/components/DraweeEventTracker$Event;->ON_SUBMIT_CACHE_HIT:Lcom/facebook/drawee/components/DraweeEventTracker$Event;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1}, Lcom/facebook/drawee/components/DraweeEventTracker;->b(Lcom/facebook/drawee/components/DraweeEventTracker$Event;)V

    .line 45
    .line 46
    iget-object v0, p0, Lo4/a;->r:Lf4/b;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, v4}, Lo4/a;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    move-result-object v1

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, v0, v1}, Lo4/a;->X(Lf4/b;Ljava/lang/Object;)V

    .line 54
    .line 55
    iget-object v0, p0, Lo4/a;->j:Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, v0, v4}, Lo4/a;->M(Ljava/lang/String;Ljava/lang/Object;)V

    .line 59
    .line 60
    iget-object v2, p0, Lo4/a;->j:Ljava/lang/String;

    .line 61
    .line 62
    iget-object v3, p0, Lo4/a;->r:Lf4/b;

    .line 63
    const/4 v7, 0x1

    .line 64
    const/4 v8, 0x1

    .line 65
    .line 66
    const/high16 v5, 0x3f800000    # 1.0f

    .line 67
    const/4 v6, 0x1

    .line 68
    move-object v1, p0

    .line 69
    .line 70
    .line 71
    invoke-virtual/range {v1 .. v8}, Lo4/a;->N(Ljava/lang/String;Lf4/b;Ljava/lang/Object;FZZZ)V

    .line 72
    move-object v3, v1

    .line 73
    .line 74
    .line 75
    invoke-static {}, Ld6/b;->d()Z

    .line 76
    move-result v0

    .line 77
    .line 78
    if-eqz v0, :cond_2

    .line 79
    .line 80
    .line 81
    invoke-static {}, Ld6/b;->b()V

    .line 82
    .line 83
    .line 84
    :cond_2
    invoke-static {}, Ld6/b;->d()Z

    .line 85
    move-result v0

    .line 86
    .line 87
    if-eqz v0, :cond_5

    .line 88
    .line 89
    .line 90
    invoke-static {}, Ld6/b;->b()V

    .line 91
    return-void

    .line 92
    :cond_3
    move-object v3, p0

    .line 93
    .line 94
    iget-object v4, v3, Lo4/a;->a:Lcom/facebook/drawee/components/DraweeEventTracker;

    .line 95
    .line 96
    sget-object v5, Lcom/facebook/drawee/components/DraweeEventTracker$Event;->ON_DATASOURCE_SUBMIT:Lcom/facebook/drawee/components/DraweeEventTracker$Event;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v4, v5}, Lcom/facebook/drawee/components/DraweeEventTracker;->b(Lcom/facebook/drawee/components/DraweeEventTracker$Event;)V

    .line 100
    .line 101
    iget-object v4, v3, Lo4/a;->h:Lt4/c;

    .line 102
    const/4 v5, 0x0

    .line 103
    .line 104
    .line 105
    invoke-interface {v4, v5, v2}, Lt4/c;->e(FZ)V

    .line 106
    .line 107
    iput-boolean v2, v3, Lo4/a;->m:Z

    .line 108
    .line 109
    iput-boolean v0, v3, Lo4/a;->o:Z

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0}, Lo4/a;->s()Lf4/b;

    .line 113
    move-result-object v0

    .line 114
    .line 115
    iput-object v0, v3, Lo4/a;->r:Lf4/b;

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0, v0, v1}, Lo4/a;->X(Lf4/b;Ljava/lang/Object;)V

    .line 119
    const/4 v0, 0x2

    .line 120
    .line 121
    .line 122
    invoke-static {v0}, Lx3/a;->w(I)Z

    .line 123
    move-result v0

    .line 124
    .line 125
    if-eqz v0, :cond_4

    .line 126
    .line 127
    sget-object v0, Lo4/a;->y:Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 131
    move-result v1

    .line 132
    .line 133
    .line 134
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 135
    move-result-object v1

    .line 136
    .line 137
    iget-object v2, v3, Lo4/a;->j:Ljava/lang/String;

    .line 138
    .line 139
    iget-object v4, v3, Lo4/a;->r:Lf4/b;

    .line 140
    .line 141
    .line 142
    invoke-static {v4}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 143
    move-result v4

    .line 144
    .line 145
    .line 146
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 147
    move-result-object v4

    .line 148
    .line 149
    const-string v5, "controller %x %s: submitRequest: dataSource: %x"

    .line 150
    .line 151
    .line 152
    invoke-static {v0, v5, v1, v2, v4}, Lx3/a;->A(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 153
    .line 154
    :cond_4
    iget-object v0, v3, Lo4/a;->j:Ljava/lang/String;

    .line 155
    .line 156
    iget-object v1, v3, Lo4/a;->r:Lf4/b;

    .line 157
    .line 158
    .line 159
    invoke-interface {v1}, Lf4/b;->a()Z

    .line 160
    move-result v1

    .line 161
    .line 162
    new-instance v2, Lo4/a$a;

    .line 163
    .line 164
    .line 165
    invoke-direct {v2, p0, v0, v1}, Lo4/a$a;-><init>(Lo4/a;Ljava/lang/String;Z)V

    .line 166
    .line 167
    iget-object v0, v3, Lo4/a;->r:Lf4/b;

    .line 168
    .line 169
    iget-object v1, v3, Lo4/a;->c:Ljava/util/concurrent/Executor;

    .line 170
    .line 171
    .line 172
    invoke-interface {v0, v2, v1}, Lf4/b;->b(Lf4/d;Ljava/util/concurrent/Executor;)V

    .line 173
    .line 174
    .line 175
    invoke-static {}, Ld6/b;->d()Z

    .line 176
    move-result v0

    .line 177
    .line 178
    if-eqz v0, :cond_5

    .line 179
    .line 180
    .line 181
    invoke-static {}, Ld6/b;->b()V

    .line 182
    :cond_5
    return-void
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
.end method

.method public j(Lo4/c;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo4/c<",
            "-TINFO;>;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lw3/h;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v0, p0, Lo4/a;->f:Lo4/c;

    .line 6
    .line 7
    instance-of v1, v0, Lo4/a$b;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    check-cast v0, Lo4/a$b;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lo4/e;->a(Lo4/c;)V

    .line 15
    return-void

    .line 16
    .line 17
    :cond_0
    if-eqz v0, :cond_1

    .line 18
    .line 19
    .line 20
    invoke-static {v0, p1}, Lo4/a$b;->d(Lo4/c;Lo4/c;)Lo4/a$b;

    .line 21
    move-result-object p1

    .line 22
    .line 23
    iput-object p1, p0, Lo4/a;->f:Lo4/c;

    .line 24
    return-void

    .line 25
    .line 26
    :cond_1
    iput-object p1, p0, Lo4/a;->f:Lo4/c;

    .line 27
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
.end method

.method public k(Lcom/facebook/fresco/ui/common/ControllerListener2;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/fresco/ui/common/ControllerListener2<",
            "TINFO;>;)V"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lo4/a;->g:Lcom/facebook/fresco/ui/common/ForwardingControllerListener2;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/facebook/fresco/ui/common/ForwardingControllerListener2;->l(Lcom/facebook/fresco/ui/common/ControllerListener2;)V

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

.method public abstract l(Ljava/lang/Object;)Landroid/graphics/drawable/Drawable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Landroid/graphics/drawable/Drawable;"
        }
    .end annotation
.end method

.method public m()Landroid/graphics/drawable/Animatable;
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lo4/a;->v:Landroid/graphics/drawable/Drawable;

    .line 3
    .line 4
    instance-of v1, v0, Landroid/graphics/drawable/Animatable;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    check-cast v0, Landroid/graphics/drawable/Animatable;

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public n()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
    .line 3
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

.method public o()Ljava/lang/Object;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lo4/a;->k:Ljava/lang/Object;

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

.method public p()Lo4/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo4/c<",
            "TINFO;>;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lo4/a;->f:Lo4/c;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lo4/b;->a()Lo4/c;

    .line 8
    move-result-object v0

    .line 9
    :cond_0
    return-object v0
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

.method public q()Lcom/facebook/fresco/ui/common/ControllerListener2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/fresco/ui/common/ControllerListener2<",
            "TINFO;>;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lo4/a;->g:Lcom/facebook/fresco/ui/common/ForwardingControllerListener2;

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

.method public r()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lo4/a;->i:Landroid/graphics/drawable/Drawable;

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

.method public release()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lo4/a;->a:Lcom/facebook/drawee/components/DraweeEventTracker;

    .line 3
    .line 4
    sget-object v1, Lcom/facebook/drawee/components/DraweeEventTracker$Event;->ON_RELEASE_CONTROLLER:Lcom/facebook/drawee/components/DraweeEventTracker$Event;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/facebook/drawee/components/DraweeEventTracker;->b(Lcom/facebook/drawee/components/DraweeEventTracker$Event;)V

    .line 8
    .line 9
    iget-object v0, p0, Lo4/a;->d:Ln4/c;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ln4/c;->c()V

    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Lo4/a;->e:Ls4/a;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ls4/a;->e()V

    .line 22
    .line 23
    :cond_1
    iget-object v0, p0, Lo4/a;->h:Lt4/c;

    .line 24
    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    .line 28
    invoke-interface {v0}, Lt4/c;->reset()V

    .line 29
    .line 30
    .line 31
    :cond_2
    invoke-virtual {p0}, Lo4/a;->Q()V

    .line 32
    return-void
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
.end method

.method public abstract s()Lf4/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lf4/b<",
            "TT;>;"
        }
    .end annotation
.end method

.method public setLoggingListener(Lg5/e;)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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

.method public final t()Landroid/graphics/Rect;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lo4/a;->h:Lt4/c;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-interface {v0}, Lt4/b;->getBounds()Landroid/graphics/Rect;

    .line 10
    move-result-object v0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lw3/f;->b(Ljava/lang/Object;)Lw3/f$a;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-string v1, "isAttached"

    .line 7
    .line 8
    iget-boolean v2, p0, Lo4/a;->l:Z

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1, v2}, Lw3/f$a;->c(Ljava/lang/String;Z)Lw3/f$a;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    const-string v1, "isRequestSubmitted"

    .line 15
    .line 16
    iget-boolean v2, p0, Lo4/a;->m:Z

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1, v2}, Lw3/f$a;->c(Ljava/lang/String;Z)Lw3/f$a;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    const-string v1, "hasFetchFailed"

    .line 23
    .line 24
    iget-boolean v2, p0, Lo4/a;->o:Z

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1, v2}, Lw3/f$a;->c(Ljava/lang/String;Z)Lw3/f$a;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    iget-object v1, p0, Lo4/a;->s:Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, v1}, Lo4/a;->x(Ljava/lang/Object;)I

    .line 34
    move-result v1

    .line 35
    .line 36
    const-string v2, "fetchedImage"

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v2, v1}, Lw3/f$a;->a(Ljava/lang/String;I)Lw3/f$a;

    .line 40
    move-result-object v0

    .line 41
    .line 42
    iget-object v1, p0, Lo4/a;->a:Lcom/facebook/drawee/components/DraweeEventTracker;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Lcom/facebook/drawee/components/DraweeEventTracker;->toString()Ljava/lang/String;

    .line 46
    move-result-object v1

    .line 47
    .line 48
    const-string v2, "events"

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v2, v1}, Lw3/f$a;->b(Ljava/lang/String;Ljava/lang/Object;)Lw3/f$a;

    .line 52
    move-result-object v0

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Lw3/f$a;->toString()Ljava/lang/String;

    .line 56
    move-result-object v0

    .line 57
    return-object v0
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
.end method

.method public u()Ls4/a;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lo4/a;->e:Ls4/a;

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

.method public v()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lo4/a;->j:Ljava/lang/String;

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

.method public w(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 10
    move-result-object p1

    .line 11
    return-object p1

    .line 12
    .line 13
    :cond_0
    const-string p1, "<null>"

    .line 14
    return-object p1
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

.method public x(Ljava/lang/Object;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)I"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 4
    move-result p1

    .line 5
    return p1
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

.method public abstract y(Ljava/lang/Object;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)TINFO;"
        }
    .end annotation
.end method

.method public z()Landroid/net/Uri;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
    .line 3
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
