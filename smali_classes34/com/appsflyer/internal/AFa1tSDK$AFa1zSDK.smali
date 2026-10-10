.class final enum Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/appsflyer/internal/AFa1tSDK;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "AFa1zSDK"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;",
        ">;"
    }
.end annotation


# static fields
.field private static enum AFAdRevenueData:Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;

.field private static final synthetic AFInAppEventParameterName:[Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;

.field private static enum AFKeystoreWrapper:Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;

.field private static enum areAllFieldsValid:Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;

.field private static enum component1:Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;

.field private static enum component2:Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;

.field private static enum component3:Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;

.field private static enum component4:Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;

.field private static enum copy:Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;

.field private static enum copydefault:Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;

.field private static enum equals:Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;

.field public static final enum getCurrencyIso4217Code:Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;

.field private static enum getMediationNetwork:Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;

.field private static enum hashCode:Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;

.field private static enum toString:Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;


# instance fields
.field final getMonetizationNetwork:Ljava/lang/String;

.field final getRevenue:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 19

    .line 1
    .line 2
    new-instance v0, Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;

    .line 3
    .line 4
    const-string v1, "android_adobe_air"

    .line 5
    .line 6
    const-string v2, "com.appsflyer.adobeair.AppsFlyerExtension"

    .line 7
    .line 8
    const-string v3, "ADOBE_AIR"

    .line 9
    const/4 v4, 0x0

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v3, v4, v1, v2}, Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    sput-object v0, Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;->AFAdRevenueData:Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;

    .line 15
    .line 16
    new-instance v0, Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;

    .line 17
    .line 18
    const-string v1, "android_adobe_mobile"

    .line 19
    .line 20
    const-string v2, "com.appsflyer.adobeextension.AppsFlyerAdobeExtension"

    .line 21
    .line 22
    const-string v3, "ADOBE_MOBILE_SDK"

    .line 23
    const/4 v4, 0x1

    .line 24
    .line 25
    .line 26
    invoke-direct {v0, v3, v4, v1, v2}, Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 27
    .line 28
    sput-object v0, Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;->getMediationNetwork:Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;

    .line 29
    .line 30
    new-instance v0, Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;

    .line 31
    .line 32
    const-string v1, "android_cocos2dx"

    .line 33
    .line 34
    .line 35
    const-string/jumbo v2, "org.cocos2dx.lib.Cocos2dxActivity"

    .line 36
    .line 37
    const-string v3, "COCOS2DX"

    .line 38
    const/4 v4, 0x2

    .line 39
    .line 40
    .line 41
    invoke-direct {v0, v3, v4, v1, v2}, Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 42
    .line 43
    sput-object v0, Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;->component3:Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;

    .line 44
    .line 45
    new-instance v0, Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;

    .line 46
    .line 47
    const-string v1, "android_cordova"

    .line 48
    .line 49
    const-string v2, "com.appsflyer.cordova.plugin.AppsFlyerPlugin"

    .line 50
    .line 51
    const-string v3, "CORDOVA"

    .line 52
    const/4 v4, 0x3

    .line 53
    .line 54
    .line 55
    invoke-direct {v0, v3, v4, v1, v2}, Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 56
    .line 57
    sput-object v0, Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;->component4:Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;

    .line 58
    .line 59
    new-instance v9, Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;

    .line 60
    const/4 v0, 0x4

    .line 61
    .line 62
    const-string v1, "android_native"

    .line 63
    .line 64
    const-string v2, "DEFAULT"

    .line 65
    .line 66
    .line 67
    invoke-direct {v9, v2, v0, v1, v1}, Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 68
    .line 69
    sput-object v9, Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;->getCurrencyIso4217Code:Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;

    .line 70
    .line 71
    new-instance v0, Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;

    .line 72
    .line 73
    const-string v1, "android_flutter"

    .line 74
    .line 75
    const-string v2, "com.appsflyer.appsflyersdk.AppsflyerSdkPlugin"

    .line 76
    .line 77
    const-string v3, "FLUTTER"

    .line 78
    const/4 v4, 0x5

    .line 79
    .line 80
    .line 81
    invoke-direct {v0, v3, v4, v1, v2}, Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 82
    .line 83
    sput-object v0, Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;->component1:Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;

    .line 84
    .line 85
    new-instance v0, Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;

    .line 86
    .line 87
    const-string v1, "android_mparticle"

    .line 88
    .line 89
    const-string v2, "com.mparticle.kits.AppsFlyerKit"

    .line 90
    .line 91
    const-string v3, "M_PARTICLE"

    .line 92
    const/4 v4, 0x6

    .line 93
    .line 94
    .line 95
    invoke-direct {v0, v3, v4, v1, v2}, Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 96
    .line 97
    sput-object v0, Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;->component2:Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;

    .line 98
    .line 99
    new-instance v0, Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;

    .line 100
    .line 101
    const-string v1, "android_native_script"

    .line 102
    .line 103
    const-string v2, "com.tns.NativeScriptActivity"

    .line 104
    .line 105
    const-string v3, "NATIVE_SCRIPT"

    .line 106
    const/4 v4, 0x7

    .line 107
    .line 108
    .line 109
    invoke-direct {v0, v3, v4, v1, v2}, Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 110
    .line 111
    sput-object v0, Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;->areAllFieldsValid:Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;

    .line 112
    .line 113
    new-instance v0, Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;

    .line 114
    .line 115
    const-string v1, "android_expo"

    .line 116
    .line 117
    const-string v2, "expo.modules.devmenu.react.DevMenuAwareReactActivity"

    .line 118
    .line 119
    const-string v3, "EXPO"

    .line 120
    .line 121
    const/16 v4, 0x8

    .line 122
    .line 123
    .line 124
    invoke-direct {v0, v3, v4, v1, v2}, Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 125
    .line 126
    sput-object v0, Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;->copydefault:Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;

    .line 127
    .line 128
    new-instance v0, Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;

    .line 129
    .line 130
    const-string v1, "android_reactNative"

    .line 131
    .line 132
    const-string v2, "com.appsflyer.reactnative.RNAppsFlyerModule"

    .line 133
    .line 134
    const-string v3, "REACT_NATIVE"

    .line 135
    .line 136
    const/16 v4, 0x9

    .line 137
    .line 138
    .line 139
    invoke-direct {v0, v3, v4, v1, v2}, Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 140
    .line 141
    sput-object v0, Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;->toString:Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;

    .line 142
    .line 143
    new-instance v0, Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;

    .line 144
    .line 145
    const-string v1, "android_unity"

    .line 146
    .line 147
    const-string v2, "com.appsflyer.unity.AppsFlyerAndroidWrapper"

    .line 148
    .line 149
    const-string v3, "UNITY"

    .line 150
    .line 151
    const/16 v4, 0xa

    .line 152
    .line 153
    .line 154
    invoke-direct {v0, v3, v4, v1, v2}, Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 155
    .line 156
    sput-object v0, Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;->copy:Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;

    .line 157
    .line 158
    new-instance v0, Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;

    .line 159
    .line 160
    const-string v1, "android_unreal"

    .line 161
    .line 162
    const-string v2, "com.epicgames.ue4.GameActivity"

    .line 163
    .line 164
    const-string v3, "UNREAL_ENGINE"

    .line 165
    .line 166
    const/16 v4, 0xb

    .line 167
    .line 168
    .line 169
    invoke-direct {v0, v3, v4, v1, v2}, Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 170
    .line 171
    sput-object v0, Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;->equals:Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;

    .line 172
    .line 173
    new-instance v0, Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;

    .line 174
    .line 175
    const-string v1, "android_xamarin"

    .line 176
    .line 177
    const-string v2, "mono.android.Runtime"

    .line 178
    .line 179
    const-string v3, "XAMARIN"

    .line 180
    .line 181
    const/16 v4, 0xc

    .line 182
    .line 183
    .line 184
    invoke-direct {v0, v3, v4, v1, v2}, Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 185
    .line 186
    sput-object v0, Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;->hashCode:Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;

    .line 187
    .line 188
    new-instance v0, Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;

    .line 189
    .line 190
    const-string v1, "android_capacitor"

    .line 191
    .line 192
    const-string v2, "capacitor.plugin.appsflyer.sdk.AppsFlyerPlugin"

    .line 193
    .line 194
    const-string v3, "CAPACITOR"

    .line 195
    .line 196
    const/16 v4, 0xd

    .line 197
    .line 198
    .line 199
    invoke-direct {v0, v3, v4, v1, v2}, Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 200
    .line 201
    sput-object v0, Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;

    .line 202
    .line 203
    sget-object v5, Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;->AFAdRevenueData:Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;

    .line 204
    .line 205
    sget-object v6, Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;->getMediationNetwork:Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;

    .line 206
    .line 207
    sget-object v7, Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;->component3:Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;

    .line 208
    .line 209
    sget-object v8, Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;->component4:Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;

    .line 210
    .line 211
    sget-object v10, Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;->component1:Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;

    .line 212
    .line 213
    sget-object v11, Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;->component2:Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;

    .line 214
    .line 215
    sget-object v12, Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;->areAllFieldsValid:Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;

    .line 216
    .line 217
    sget-object v13, Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;->copydefault:Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;

    .line 218
    .line 219
    sget-object v14, Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;->toString:Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;

    .line 220
    .line 221
    sget-object v15, Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;->copy:Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;

    .line 222
    .line 223
    sget-object v16, Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;->equals:Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;

    .line 224
    .line 225
    sget-object v17, Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;->hashCode:Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;

    .line 226
    .line 227
    move-object/from16 v18, v0

    .line 228
    .line 229
    .line 230
    filled-new-array/range {v5 .. v18}, [Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;

    .line 231
    move-result-object v0

    .line 232
    .line 233
    sput-object v0, Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;->AFInAppEventParameterName:[Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;

    .line 234
    return-void
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

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 4
    .line 5
    iput-object p3, p0, Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;->getMonetizationNetwork:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;->getRevenue:Ljava/lang/String;

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
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;

    .line 9
    return-object p0
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

.method public static values()[Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;->AFInAppEventParameterName:[Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, [Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lcom/appsflyer/internal/AFa1tSDK$AFa1zSDK;

    .line 9
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
