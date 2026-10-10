.class public Lcom/horcrux/svg/SvgPackage;
.super Lcom/facebook/react/BaseReactPackage;
.source "SvgPackage.java"

# interfaces
.implements Lcom/facebook/react/ViewManagerOnDemandReactPackage;


# instance fields
.field private mViewManagers:Ljava/util/Map;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/facebook/react/bridge/ModuleSpec;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/facebook/react/BaseReactPackage;-><init>()V

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
.end method

.method private getViewManagersMap(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/react/bridge/ReactApplicationContext;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/facebook/react/bridge/ModuleSpec;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object p1, p0, Lcom/horcrux/svg/SvgPackage;->mViewManagers:Ljava/util/Map;

    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lcom/facebook/react/common/MapBuilder;->newHashMap()Ljava/util/HashMap;

    .line 8
    move-result-object p1

    .line 9
    .line 10
    new-instance v0, Lcom/horcrux/svg/SvgPackage$k;

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, p0}, Lcom/horcrux/svg/SvgPackage$k;-><init>(Lcom/horcrux/svg/SvgPackage;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Lcom/facebook/react/bridge/ModuleSpec;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    const-string v1, "RNSVGGroup"

    .line 20
    .line 21
    .line 22
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    new-instance v0, Lcom/horcrux/svg/SvgPackage$v;

    .line 25
    .line 26
    .line 27
    invoke-direct {v0, p0}, Lcom/horcrux/svg/SvgPackage$v;-><init>(Lcom/horcrux/svg/SvgPackage;)V

    .line 28
    .line 29
    .line 30
    invoke-static {v0}, Lcom/facebook/react/bridge/ModuleSpec;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    .line 31
    move-result-object v0

    .line 32
    .line 33
    const-string v1, "RNSVGPath"

    .line 34
    .line 35
    .line 36
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    new-instance v0, Lcom/horcrux/svg/SvgPackage$x;

    .line 39
    .line 40
    .line 41
    invoke-direct {v0, p0}, Lcom/horcrux/svg/SvgPackage$x;-><init>(Lcom/horcrux/svg/SvgPackage;)V

    .line 42
    .line 43
    .line 44
    invoke-static {v0}, Lcom/facebook/react/bridge/ModuleSpec;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    .line 45
    move-result-object v0

    .line 46
    .line 47
    const-string v1, "RNSVGCircle"

    .line 48
    .line 49
    .line 50
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    new-instance v0, Lcom/horcrux/svg/SvgPackage$y;

    .line 53
    .line 54
    .line 55
    invoke-direct {v0, p0}, Lcom/horcrux/svg/SvgPackage$y;-><init>(Lcom/horcrux/svg/SvgPackage;)V

    .line 56
    .line 57
    .line 58
    invoke-static {v0}, Lcom/facebook/react/bridge/ModuleSpec;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    .line 59
    move-result-object v0

    .line 60
    .line 61
    const-string v1, "RNSVGEllipse"

    .line 62
    .line 63
    .line 64
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    new-instance v0, Lcom/horcrux/svg/SvgPackage$z;

    .line 67
    .line 68
    .line 69
    invoke-direct {v0, p0}, Lcom/horcrux/svg/SvgPackage$z;-><init>(Lcom/horcrux/svg/SvgPackage;)V

    .line 70
    .line 71
    .line 72
    invoke-static {v0}, Lcom/facebook/react/bridge/ModuleSpec;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    .line 73
    move-result-object v0

    .line 74
    .line 75
    const-string v1, "RNSVGLine"

    .line 76
    .line 77
    .line 78
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    new-instance v0, Lcom/horcrux/svg/SvgPackage$a0;

    .line 81
    .line 82
    .line 83
    invoke-direct {v0, p0}, Lcom/horcrux/svg/SvgPackage$a0;-><init>(Lcom/horcrux/svg/SvgPackage;)V

    .line 84
    .line 85
    .line 86
    invoke-static {v0}, Lcom/facebook/react/bridge/ModuleSpec;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    .line 87
    move-result-object v0

    .line 88
    .line 89
    const-string v1, "RNSVGRect"

    .line 90
    .line 91
    .line 92
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    new-instance v0, Lcom/horcrux/svg/SvgPackage$b0;

    .line 95
    .line 96
    .line 97
    invoke-direct {v0, p0}, Lcom/horcrux/svg/SvgPackage$b0;-><init>(Lcom/horcrux/svg/SvgPackage;)V

    .line 98
    .line 99
    .line 100
    invoke-static {v0}, Lcom/facebook/react/bridge/ModuleSpec;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    .line 101
    move-result-object v0

    .line 102
    .line 103
    const-string v1, "RNSVGText"

    .line 104
    .line 105
    .line 106
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    new-instance v0, Lcom/horcrux/svg/SvgPackage$c0;

    .line 109
    .line 110
    .line 111
    invoke-direct {v0, p0}, Lcom/horcrux/svg/SvgPackage$c0;-><init>(Lcom/horcrux/svg/SvgPackage;)V

    .line 112
    .line 113
    .line 114
    invoke-static {v0}, Lcom/facebook/react/bridge/ModuleSpec;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    .line 115
    move-result-object v0

    .line 116
    .line 117
    const-string v1, "RNSVGTSpan"

    .line 118
    .line 119
    .line 120
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    new-instance v0, Lcom/horcrux/svg/SvgPackage$d0;

    .line 123
    .line 124
    .line 125
    invoke-direct {v0, p0}, Lcom/horcrux/svg/SvgPackage$d0;-><init>(Lcom/horcrux/svg/SvgPackage;)V

    .line 126
    .line 127
    .line 128
    invoke-static {v0}, Lcom/facebook/react/bridge/ModuleSpec;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    .line 129
    move-result-object v0

    .line 130
    .line 131
    const-string v1, "RNSVGTextPath"

    .line 132
    .line 133
    .line 134
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    new-instance v0, Lcom/horcrux/svg/SvgPackage$a;

    .line 137
    .line 138
    .line 139
    invoke-direct {v0, p0}, Lcom/horcrux/svg/SvgPackage$a;-><init>(Lcom/horcrux/svg/SvgPackage;)V

    .line 140
    .line 141
    .line 142
    invoke-static {v0}, Lcom/facebook/react/bridge/ModuleSpec;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    .line 143
    move-result-object v0

    .line 144
    .line 145
    const-string v1, "RNSVGImage"

    .line 146
    .line 147
    .line 148
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    new-instance v0, Lcom/horcrux/svg/SvgPackage$b;

    .line 151
    .line 152
    .line 153
    invoke-direct {v0, p0}, Lcom/horcrux/svg/SvgPackage$b;-><init>(Lcom/horcrux/svg/SvgPackage;)V

    .line 154
    .line 155
    .line 156
    invoke-static {v0}, Lcom/facebook/react/bridge/ModuleSpec;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    .line 157
    move-result-object v0

    .line 158
    .line 159
    const-string v1, "RNSVGClipPath"

    .line 160
    .line 161
    .line 162
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    new-instance v0, Lcom/horcrux/svg/SvgPackage$c;

    .line 165
    .line 166
    .line 167
    invoke-direct {v0, p0}, Lcom/horcrux/svg/SvgPackage$c;-><init>(Lcom/horcrux/svg/SvgPackage;)V

    .line 168
    .line 169
    .line 170
    invoke-static {v0}, Lcom/facebook/react/bridge/ModuleSpec;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    .line 171
    move-result-object v0

    .line 172
    .line 173
    const-string v1, "RNSVGDefs"

    .line 174
    .line 175
    .line 176
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    .line 178
    new-instance v0, Lcom/horcrux/svg/SvgPackage$d;

    .line 179
    .line 180
    .line 181
    invoke-direct {v0, p0}, Lcom/horcrux/svg/SvgPackage$d;-><init>(Lcom/horcrux/svg/SvgPackage;)V

    .line 182
    .line 183
    .line 184
    invoke-static {v0}, Lcom/facebook/react/bridge/ModuleSpec;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    .line 185
    move-result-object v0

    .line 186
    .line 187
    const-string v1, "RNSVGUse"

    .line 188
    .line 189
    .line 190
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    .line 192
    new-instance v0, Lcom/horcrux/svg/SvgPackage$e;

    .line 193
    .line 194
    .line 195
    invoke-direct {v0, p0}, Lcom/horcrux/svg/SvgPackage$e;-><init>(Lcom/horcrux/svg/SvgPackage;)V

    .line 196
    .line 197
    .line 198
    invoke-static {v0}, Lcom/facebook/react/bridge/ModuleSpec;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    .line 199
    move-result-object v0

    .line 200
    .line 201
    const-string v1, "RNSVGSymbol"

    .line 202
    .line 203
    .line 204
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    .line 206
    new-instance v0, Lcom/horcrux/svg/SvgPackage$f;

    .line 207
    .line 208
    .line 209
    invoke-direct {v0, p0}, Lcom/horcrux/svg/SvgPackage$f;-><init>(Lcom/horcrux/svg/SvgPackage;)V

    .line 210
    .line 211
    .line 212
    invoke-static {v0}, Lcom/facebook/react/bridge/ModuleSpec;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    .line 213
    move-result-object v0

    .line 214
    .line 215
    const-string v1, "RNSVGLinearGradient"

    .line 216
    .line 217
    .line 218
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    .line 220
    new-instance v0, Lcom/horcrux/svg/SvgPackage$g;

    .line 221
    .line 222
    .line 223
    invoke-direct {v0, p0}, Lcom/horcrux/svg/SvgPackage$g;-><init>(Lcom/horcrux/svg/SvgPackage;)V

    .line 224
    .line 225
    .line 226
    invoke-static {v0}, Lcom/facebook/react/bridge/ModuleSpec;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    .line 227
    move-result-object v0

    .line 228
    .line 229
    const-string v1, "RNSVGRadialGradient"

    .line 230
    .line 231
    .line 232
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 233
    .line 234
    new-instance v0, Lcom/horcrux/svg/SvgPackage$h;

    .line 235
    .line 236
    .line 237
    invoke-direct {v0, p0}, Lcom/horcrux/svg/SvgPackage$h;-><init>(Lcom/horcrux/svg/SvgPackage;)V

    .line 238
    .line 239
    .line 240
    invoke-static {v0}, Lcom/facebook/react/bridge/ModuleSpec;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    .line 241
    move-result-object v0

    .line 242
    .line 243
    const-string v1, "RNSVGPattern"

    .line 244
    .line 245
    .line 246
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    .line 248
    new-instance v0, Lcom/horcrux/svg/SvgPackage$i;

    .line 249
    .line 250
    .line 251
    invoke-direct {v0, p0}, Lcom/horcrux/svg/SvgPackage$i;-><init>(Lcom/horcrux/svg/SvgPackage;)V

    .line 252
    .line 253
    .line 254
    invoke-static {v0}, Lcom/facebook/react/bridge/ModuleSpec;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    .line 255
    move-result-object v0

    .line 256
    .line 257
    const-string v1, "RNSVGMask"

    .line 258
    .line 259
    .line 260
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 261
    .line 262
    new-instance v0, Lcom/horcrux/svg/SvgPackage$j;

    .line 263
    .line 264
    .line 265
    invoke-direct {v0, p0}, Lcom/horcrux/svg/SvgPackage$j;-><init>(Lcom/horcrux/svg/SvgPackage;)V

    .line 266
    .line 267
    .line 268
    invoke-static {v0}, Lcom/facebook/react/bridge/ModuleSpec;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    .line 269
    move-result-object v0

    .line 270
    .line 271
    const-string v1, "RNSVGFilter"

    .line 272
    .line 273
    .line 274
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 275
    .line 276
    new-instance v0, Lcom/horcrux/svg/SvgPackage$l;

    .line 277
    .line 278
    .line 279
    invoke-direct {v0, p0}, Lcom/horcrux/svg/SvgPackage$l;-><init>(Lcom/horcrux/svg/SvgPackage;)V

    .line 280
    .line 281
    .line 282
    invoke-static {v0}, Lcom/facebook/react/bridge/ModuleSpec;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    .line 283
    move-result-object v0

    .line 284
    .line 285
    const-string v1, "RNSVGFeBlend"

    .line 286
    .line 287
    .line 288
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 289
    .line 290
    new-instance v0, Lcom/horcrux/svg/SvgPackage$m;

    .line 291
    .line 292
    .line 293
    invoke-direct {v0, p0}, Lcom/horcrux/svg/SvgPackage$m;-><init>(Lcom/horcrux/svg/SvgPackage;)V

    .line 294
    .line 295
    .line 296
    invoke-static {v0}, Lcom/facebook/react/bridge/ModuleSpec;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    .line 297
    move-result-object v0

    .line 298
    .line 299
    const-string v1, "RNSVGFeColorMatrix"

    .line 300
    .line 301
    .line 302
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 303
    .line 304
    new-instance v0, Lcom/horcrux/svg/SvgPackage$n;

    .line 305
    .line 306
    .line 307
    invoke-direct {v0, p0}, Lcom/horcrux/svg/SvgPackage$n;-><init>(Lcom/horcrux/svg/SvgPackage;)V

    .line 308
    .line 309
    .line 310
    invoke-static {v0}, Lcom/facebook/react/bridge/ModuleSpec;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    .line 311
    move-result-object v0

    .line 312
    .line 313
    const-string v1, "RNSVGFeComposite"

    .line 314
    .line 315
    .line 316
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 317
    .line 318
    new-instance v0, Lcom/horcrux/svg/SvgPackage$o;

    .line 319
    .line 320
    .line 321
    invoke-direct {v0, p0}, Lcom/horcrux/svg/SvgPackage$o;-><init>(Lcom/horcrux/svg/SvgPackage;)V

    .line 322
    .line 323
    .line 324
    invoke-static {v0}, Lcom/facebook/react/bridge/ModuleSpec;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    .line 325
    move-result-object v0

    .line 326
    .line 327
    const-string v1, "RNSVGFeFlood"

    .line 328
    .line 329
    .line 330
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 331
    .line 332
    new-instance v0, Lcom/horcrux/svg/SvgPackage$p;

    .line 333
    .line 334
    .line 335
    invoke-direct {v0, p0}, Lcom/horcrux/svg/SvgPackage$p;-><init>(Lcom/horcrux/svg/SvgPackage;)V

    .line 336
    .line 337
    .line 338
    invoke-static {v0}, Lcom/facebook/react/bridge/ModuleSpec;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    .line 339
    move-result-object v0

    .line 340
    .line 341
    const-string v1, "RNSVGFeGaussianBlur"

    .line 342
    .line 343
    .line 344
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 345
    .line 346
    new-instance v0, Lcom/horcrux/svg/SvgPackage$q;

    .line 347
    .line 348
    .line 349
    invoke-direct {v0, p0}, Lcom/horcrux/svg/SvgPackage$q;-><init>(Lcom/horcrux/svg/SvgPackage;)V

    .line 350
    .line 351
    .line 352
    invoke-static {v0}, Lcom/facebook/react/bridge/ModuleSpec;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    .line 353
    move-result-object v0

    .line 354
    .line 355
    const-string v1, "RNSVGFeMerge"

    .line 356
    .line 357
    .line 358
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 359
    .line 360
    new-instance v0, Lcom/horcrux/svg/SvgPackage$r;

    .line 361
    .line 362
    .line 363
    invoke-direct {v0, p0}, Lcom/horcrux/svg/SvgPackage$r;-><init>(Lcom/horcrux/svg/SvgPackage;)V

    .line 364
    .line 365
    .line 366
    invoke-static {v0}, Lcom/facebook/react/bridge/ModuleSpec;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    .line 367
    move-result-object v0

    .line 368
    .line 369
    const-string v1, "RNSVGFeOffset"

    .line 370
    .line 371
    .line 372
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 373
    .line 374
    new-instance v0, Lcom/horcrux/svg/SvgPackage$s;

    .line 375
    .line 376
    .line 377
    invoke-direct {v0, p0}, Lcom/horcrux/svg/SvgPackage$s;-><init>(Lcom/horcrux/svg/SvgPackage;)V

    .line 378
    .line 379
    .line 380
    invoke-static {v0}, Lcom/facebook/react/bridge/ModuleSpec;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    .line 381
    move-result-object v0

    .line 382
    .line 383
    const-string v1, "RNSVGForeignObject"

    .line 384
    .line 385
    .line 386
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 387
    .line 388
    new-instance v0, Lcom/horcrux/svg/SvgPackage$t;

    .line 389
    .line 390
    .line 391
    invoke-direct {v0, p0}, Lcom/horcrux/svg/SvgPackage$t;-><init>(Lcom/horcrux/svg/SvgPackage;)V

    .line 392
    .line 393
    .line 394
    invoke-static {v0}, Lcom/facebook/react/bridge/ModuleSpec;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    .line 395
    move-result-object v0

    .line 396
    .line 397
    const-string v1, "RNSVGMarker"

    .line 398
    .line 399
    .line 400
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 401
    .line 402
    new-instance v0, Lcom/horcrux/svg/SvgPackage$u;

    .line 403
    .line 404
    .line 405
    invoke-direct {v0, p0}, Lcom/horcrux/svg/SvgPackage$u;-><init>(Lcom/horcrux/svg/SvgPackage;)V

    .line 406
    .line 407
    .line 408
    invoke-static {v0}, Lcom/facebook/react/bridge/ModuleSpec;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    .line 409
    move-result-object v0

    .line 410
    .line 411
    const-string v1, "RNSVGSvgViewAndroid"

    .line 412
    .line 413
    .line 414
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 415
    .line 416
    iput-object p1, p0, Lcom/horcrux/svg/SvgPackage;->mViewManagers:Ljava/util/Map;

    .line 417
    .line 418
    :cond_0
    iget-object p1, p0, Lcom/horcrux/svg/SvgPackage;->mViewManagers:Ljava/util/Map;

    .line 419
    return-object p1
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
.end method


# virtual methods
.method public createJSModules()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "+",
            "Lcom/facebook/react/bridge/JavaScriptModule;",
            ">;>;"
        }
    .end annotation

    .line 1
    .line 2
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

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
.end method

.method public createViewManager(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/String;)Lcom/facebook/react/uimanager/ViewManager;
    .locals 0
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/horcrux/svg/SvgPackage;->getViewManagersMap(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/Map;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    .line 7
    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    move-result-object p1

    .line 9
    .line 10
    check-cast p1, Lcom/facebook/react/bridge/ModuleSpec;

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/facebook/react/bridge/ModuleSpec;->getProvider()Ljavax/inject/Provider;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    .line 19
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 20
    move-result-object p1

    .line 21
    .line 22
    check-cast p1, Lcom/facebook/react/uimanager/ViewManager;

    .line 23
    return-object p1

    .line 24
    :cond_0
    const/4 p1, 0x0

    .line 25
    return-object p1
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
.end method

.method public getModule(Ljava/lang/String;Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    const-string v0, "RNSVGRenderableModule"

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 9
    move-result v0

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    const-string v0, "RNSVGSvgViewModule"

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    move-result p1

    .line 18
    .line 19
    if-nez p1, :cond_0

    .line 20
    const/4 p1, 0x0

    .line 21
    return-object p1

    .line 22
    .line 23
    :cond_0
    new-instance p1, Lcom/horcrux/svg/SvgViewModule;

    .line 24
    .line 25
    .line 26
    invoke-direct {p1, p2}, Lcom/horcrux/svg/SvgViewModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 27
    return-object p1

    .line 28
    .line 29
    :cond_1
    new-instance p1, Lcom/horcrux/svg/RNSVGRenderableManager;

    .line 30
    .line 31
    .line 32
    invoke-direct {p1, p2}, Lcom/horcrux/svg/RNSVGRenderableManager;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 33
    return-object p1
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
.end method

.method public getReactModuleInfoProvider()Lcom/facebook/react/module/model/ReactModuleInfoProvider;
    .locals 3

    .line 1
    .line 2
    :try_start_0
    const-string v0, "com.horcrux.svg.SvgPackage$$ReactModuleInfoProvider"

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    check-cast v0, Lcom/facebook/react/module/model/ReactModuleInfoProvider;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    return-object v0

    .line 14
    :catch_0
    move-exception v0

    .line 15
    goto :goto_0

    .line 16
    :catch_1
    move-exception v0

    .line 17
    .line 18
    :goto_0
    new-instance v1, Ljava/lang/RuntimeException;

    .line 19
    .line 20
    const-string v2, "No ReactModuleInfoProvider for MyPackage$$ReactModuleInfoProvider"

    .line 21
    .line 22
    .line 23
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 24
    throw v1

    .line 25
    .line 26
    :catch_2
    new-instance v0, Lcom/horcrux/svg/SvgPackage$w;

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, p0}, Lcom/horcrux/svg/SvgPackage$w;-><init>(Lcom/horcrux/svg/SvgPackage;)V

    .line 30
    return-object v0
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
.end method

.method public bridge synthetic getViewManagerNames(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/horcrux/svg/SvgPackage;->getViewManagerNames(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public getViewManagerNames(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/react/bridge/ReactApplicationContext;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {p0, p1}, Lcom/horcrux/svg/SvgPackage;->getViewManagersMap(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public getViewManagers(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/react/bridge/ReactApplicationContext;",
            ")",
            "Ljava/util/List<",
            "Lcom/facebook/react/bridge/ModuleSpec;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, p1}, Lcom/horcrux/svg/SvgPackage;->getViewManagersMap(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/Map;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    .line 9
    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 10
    move-result-object p1

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 14
    return-object v0
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
.end method
