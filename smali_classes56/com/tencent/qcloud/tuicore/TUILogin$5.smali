.class Lcom/tencent/qcloud/tuicore/TUILogin$5;
.super Ljava/lang/Object;
.source "TUILogin.java"

# interfaces
.implements Lcom/tencent/imsdk/v2/V2TIMValueCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/qcloud/tuicore/TUILogin;->internalLogin(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Lcom/tencent/qcloud/tuicore/interfaces/TUILoginConfig;Lcom/tencent/qcloud/tuicore/interfaces/TUICallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/tencent/imsdk/v2/V2TIMValueCallback<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tencent/qcloud/tuicore/TUILogin;

.field final synthetic val$callback:Lcom/tencent/qcloud/tuicore/interfaces/TUICallback;

.field final synthetic val$config:Lcom/tencent/qcloud/tuicore/interfaces/TUILoginConfig;

.field final synthetic val$userId:Ljava/lang/String;

.field final synthetic val$userSig:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/tencent/qcloud/tuicore/TUILogin;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/qcloud/tuicore/interfaces/TUILoginConfig;Lcom/tencent/qcloud/tuicore/interfaces/TUICallback;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/qcloud/tuicore/TUILogin$5;->this$0:Lcom/tencent/qcloud/tuicore/TUILogin;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/tencent/qcloud/tuicore/TUILogin$5;->val$userId:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p3, p0, Lcom/tencent/qcloud/tuicore/TUILogin$5;->val$userSig:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p4, p0, Lcom/tencent/qcloud/tuicore/TUILogin$5;->val$config:Lcom/tencent/qcloud/tuicore/interfaces/TUILoginConfig;

    .line 9
    .line 10
    iput-object p5, p0, Lcom/tencent/qcloud/tuicore/TUILogin$5;->val$callback:Lcom/tencent/qcloud/tuicore/interfaces/TUICallback;

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    return-void
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
.end method


# virtual methods
.method public onError(ILjava/lang/String;)V
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/qcloud/tuicore/TUILogin;->access$900()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    const-string v2, "getLoginAccountType error:"

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const-string p1, ", desc:"

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    move-result-object p1

    .line 30
    .line 31
    .line 32
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 33
    .line 34
    iget-object v1, p0, Lcom/tencent/qcloud/tuicore/TUILogin$5;->this$0:Lcom/tencent/qcloud/tuicore/TUILogin;

    .line 35
    .line 36
    iget-object v3, p0, Lcom/tencent/qcloud/tuicore/TUILogin$5;->val$userId:Ljava/lang/String;

    .line 37
    .line 38
    iget-object v4, p0, Lcom/tencent/qcloud/tuicore/TUILogin$5;->val$userSig:Ljava/lang/String;

    .line 39
    .line 40
    iget-object v5, p0, Lcom/tencent/qcloud/tuicore/TUILogin$5;->val$config:Lcom/tencent/qcloud/tuicore/interfaces/TUILoginConfig;

    .line 41
    .line 42
    iget-object v6, p0, Lcom/tencent/qcloud/tuicore/TUILogin$5;->val$callback:Lcom/tencent/qcloud/tuicore/interfaces/TUICallback;

    .line 43
    const/4 v2, 0x0

    .line 44
    .line 45
    .line 46
    invoke-static/range {v1 .. v6}, Lcom/tencent/qcloud/tuicore/TUILogin;->access$800(Lcom/tencent/qcloud/tuicore/TUILogin;ILjava/lang/String;Ljava/lang/String;Lcom/tencent/qcloud/tuicore/interfaces/TUILoginConfig;Lcom/tencent/qcloud/tuicore/interfaces/TUICallback;)V

    .line 47
    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 6

    .line 1
    .line 2
    check-cast p1, Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 6
    move-result v1

    .line 7
    .line 8
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/TUILogin$5;->this$0:Lcom/tencent/qcloud/tuicore/TUILogin;

    .line 9
    .line 10
    iget-object v2, p0, Lcom/tencent/qcloud/tuicore/TUILogin$5;->val$userId:Ljava/lang/String;

    .line 11
    .line 12
    iget-object v3, p0, Lcom/tencent/qcloud/tuicore/TUILogin$5;->val$userSig:Ljava/lang/String;

    .line 13
    .line 14
    iget-object v4, p0, Lcom/tencent/qcloud/tuicore/TUILogin$5;->val$config:Lcom/tencent/qcloud/tuicore/interfaces/TUILoginConfig;

    .line 15
    .line 16
    iget-object v5, p0, Lcom/tencent/qcloud/tuicore/TUILogin$5;->val$callback:Lcom/tencent/qcloud/tuicore/interfaces/TUICallback;

    .line 17
    .line 18
    .line 19
    invoke-static/range {v0 .. v5}, Lcom/tencent/qcloud/tuicore/TUILogin;->access$800(Lcom/tencent/qcloud/tuicore/TUILogin;ILjava/lang/String;Ljava/lang/String;Lcom/tencent/qcloud/tuicore/interfaces/TUILoginConfig;Lcom/tencent/qcloud/tuicore/interfaces/TUICallback;)V

    .line 20
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
.end method
