.class public Lcom/facebook/react/PackageList;
.super Ljava/lang/Object;
.source "PackageList.java"


# instance fields
.field private application:Landroid/app/Application;

.field private mConfig:Lcom/facebook/react/shell/MainPackageConfig;

.field private reactNativeHost:Lcom/facebook/react/ReactNativeHost;


# direct methods
.method public constructor <init>(Landroid/app/Application;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Lcom/facebook/react/PackageList;-><init>(Landroid/app/Application;Lcom/facebook/react/shell/MainPackageConfig;)V

    return-void
.end method

.method public constructor <init>(Landroid/app/Application;Lcom/facebook/react/shell/MainPackageConfig;)V
    .locals 1

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lcom/facebook/react/PackageList;->reactNativeHost:Lcom/facebook/react/ReactNativeHost;

    .line 8
    iput-object p1, p0, Lcom/facebook/react/PackageList;->application:Landroid/app/Application;

    .line 9
    iput-object p2, p0, Lcom/facebook/react/PackageList;->mConfig:Lcom/facebook/react/shell/MainPackageConfig;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/ReactNativeHost;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/facebook/react/PackageList;-><init>(Lcom/facebook/react/ReactNativeHost;Lcom/facebook/react/shell/MainPackageConfig;)V

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/ReactNativeHost;Lcom/facebook/react/shell/MainPackageConfig;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lcom/facebook/react/PackageList;->reactNativeHost:Lcom/facebook/react/ReactNativeHost;

    .line 5
    iput-object p2, p0, Lcom/facebook/react/PackageList;->mConfig:Lcom/facebook/react/shell/MainPackageConfig;

    return-void
.end method

.method private getApplication()Landroid/app/Application;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/PackageList;->reactNativeHost:Lcom/facebook/react/ReactNativeHost;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/PackageList;->application:Landroid/app/Application;

    .line 7
    return-object v0

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {v0}, Lcom/facebook/react/ReactNativeHost;->getApplication()Landroid/app/Application;

    .line 11
    move-result-object v0

    .line 12
    return-object v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method private getApplicationContext()Landroid/content/Context;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/facebook/react/PackageList;->getApplication()Landroid/app/Application;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 8
    move-result-object v0

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

.method private getReactNativeHost()Lcom/facebook/react/ReactNativeHost;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/PackageList;->reactNativeHost:Lcom/facebook/react/ReactNativeHost;

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

.method private getResources()Landroid/content/res/Resources;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/facebook/react/PackageList;->getApplication()Landroid/app/Application;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 8
    move-result-object v0

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


# virtual methods
.method public getPackages()Ljava/util/ArrayList;
    .locals 59
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/facebook/react/ReactPackage;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    new-instance v1, Lcom/facebook/react/shell/MainReactPackage;

    .line 5
    .line 6
    move-object/from16 v2, p0

    .line 7
    .line 8
    iget-object v3, v2, Lcom/facebook/react/PackageList;->mConfig:Lcom/facebook/react/shell/MainPackageConfig;

    .line 9
    .line 10
    .line 11
    invoke-direct {v1, v3}, Lcom/facebook/react/shell/MainReactPackage;-><init>(Lcom/facebook/react/shell/MainPackageConfig;)V

    .line 12
    .line 13
    new-instance v3, Lcom/reactnativeimageresizer/c;

    .line 14
    .line 15
    .line 16
    invoke-direct {v3}, Lcom/reactnativeimageresizer/c;-><init>()V

    .line 17
    .line 18
    new-instance v4, Lfa0/i;

    .line 19
    .line 20
    .line 21
    invoke-direct {v4}, Lfa0/i;-><init>()V

    .line 22
    .line 23
    new-instance v5, Lth0/a;

    .line 24
    .line 25
    .line 26
    invoke-direct {v5}, Lth0/a;-><init>()V

    .line 27
    .line 28
    new-instance v6, Lcom/reactnativecommunity/imageeditor/d;

    .line 29
    .line 30
    .line 31
    invoke-direct {v6}, Lcom/reactnativecommunity/imageeditor/d;-><init>()V

    .line 32
    .line 33
    new-instance v7, Lcom/shopify/reactnative/skia/e;

    .line 34
    .line 35
    .line 36
    invoke-direct {v7}, Lcom/shopify/reactnative/skia/e;-><init>()V

    .line 37
    .line 38
    new-instance v8, Lcom/airbnb/android/react/lottie/LottiePackage;

    .line 39
    .line 40
    .line 41
    invoke-direct {v8}, Lcom/airbnb/android/react/lottie/LottiePackage;-><init>()V

    .line 42
    .line 43
    new-instance v9, Lqb0/e;

    .line 44
    .line 45
    .line 46
    invoke-direct {v9}, Lqb0/e;-><init>()V

    .line 47
    .line 48
    new-instance v10, Lc1/a;

    .line 49
    .line 50
    .line 51
    invoke-direct {v10}, Lc1/a;-><init>()V

    .line 52
    .line 53
    new-instance v11, Lga0/b;

    .line 54
    .line 55
    .line 56
    invoke-direct {v11}, Lga0/b;-><init>()V

    .line 57
    .line 58
    new-instance v12, Lcom/swmansion/reanimated/ReanimatedPackage;

    .line 59
    .line 60
    .line 61
    invoke-direct {v12}, Lcom/swmansion/reanimated/ReanimatedPackage;-><init>()V

    .line 62
    .line 63
    new-instance v13, Lcom/th3rdwave/safeareacontext/SafeAreaContextPackage;

    .line 64
    .line 65
    .line 66
    invoke-direct {v13}, Lcom/th3rdwave/safeareacontext/SafeAreaContextPackage;-><init>()V

    .line 67
    .line 68
    new-instance v14, Lcom/swmansion/rnscreens/RNScreensPackage;

    .line 69
    .line 70
    .line 71
    invoke-direct {v14}, Lcom/swmansion/rnscreens/RNScreensPackage;-><init>()V

    .line 72
    .line 73
    new-instance v15, Lcom/horcrux/svg/SvgPackage;

    .line 74
    .line 75
    .line 76
    invoke-direct {v15}, Lcom/horcrux/svg/SvgPackage;-><init>()V

    .line 77
    .line 78
    new-instance v16, Lve0/c;

    .line 79
    .line 80
    .line 81
    invoke-direct/range {v16 .. v16}, Lve0/c;-><init>()V

    .line 82
    .line 83
    new-instance v17, Lcom/reactnativecommunity/webview/RNCWebViewPackage;

    .line 84
    .line 85
    .line 86
    invoke-direct/range {v17 .. v17}, Lcom/reactnativecommunity/webview/RNCWebViewPackage;-><init>()V

    .line 87
    .line 88
    new-instance v18, Lcom/reactnativecommunity/blurview/b;

    .line 89
    .line 90
    .line 91
    invoke-direct/range {v18 .. v18}, Lcom/reactnativecommunity/blurview/b;-><init>()V

    .line 92
    .line 93
    new-instance v19, Lcom/kubi/rn/core/turbo/NativeSensorTurboModulePackage;

    .line 94
    .line 95
    .line 96
    invoke-direct/range {v19 .. v19}, Lcom/kubi/rn/core/turbo/NativeSensorTurboModulePackage;-><init>()V

    .line 97
    .line 98
    new-instance v20, Lcom/kubi/rn/core/turbo/NativeCommonTurboModulePackage;

    .line 99
    .line 100
    .line 101
    invoke-direct/range {v20 .. v20}, Lcom/kubi/rn/core/turbo/NativeCommonTurboModulePackage;-><init>()V

    .line 102
    .line 103
    new-instance v21, Lcom/kubi/rn/core/turbo/NativeFileTurboModulePackage;

    .line 104
    .line 105
    .line 106
    invoke-direct/range {v21 .. v21}, Lcom/kubi/rn/core/turbo/NativeFileTurboModulePackage;-><init>()V

    .line 107
    .line 108
    new-instance v22, Lcom/kubi/rn/core/turbo/NativeHomeTurboModulePackage;

    .line 109
    .line 110
    .line 111
    invoke-direct/range {v22 .. v22}, Lcom/kubi/rn/core/turbo/NativeHomeTurboModulePackage;-><init>()V

    .line 112
    .line 113
    new-instance v23, Lcom/kubi/rn/core/turbo/NativeRouterTurboModulePackage;

    .line 114
    .line 115
    .line 116
    invoke-direct/range {v23 .. v23}, Lcom/kubi/rn/core/turbo/NativeRouterTurboModulePackage;-><init>()V

    .line 117
    .line 118
    new-instance v24, Lcom/kubi/rn/core/turbo/NativeSymbolsCoinTurboModulePackage;

    .line 119
    .line 120
    .line 121
    invoke-direct/range {v24 .. v24}, Lcom/kubi/rn/core/turbo/NativeSymbolsCoinTurboModulePackage;-><init>()V

    .line 122
    .line 123
    new-instance v25, Lcom/kubi/rn/core/turbo/NativePhotoTurboModulePackage;

    .line 124
    .line 125
    .line 126
    invoke-direct/range {v25 .. v25}, Lcom/kubi/rn/core/turbo/NativePhotoTurboModulePackage;-><init>()V

    .line 127
    .line 128
    new-instance v26, Lcom/kubi/rn/core/turbo/NativeMarketTurboModulePackage;

    .line 129
    .line 130
    .line 131
    invoke-direct/range {v26 .. v26}, Lcom/kubi/rn/core/turbo/NativeMarketTurboModulePackage;-><init>()V

    .line 132
    .line 133
    new-instance v27, Lcom/kubi/rn/core/turbo/NativeSecurityTurboModulePackage;

    .line 134
    .line 135
    .line 136
    invoke-direct/range {v27 .. v27}, Lcom/kubi/rn/core/turbo/NativeSecurityTurboModulePackage;-><init>()V

    .line 137
    .line 138
    new-instance v28, Lcom/kubi/rn/core/turbo/NativeQrScanTurboModulePackage;

    .line 139
    .line 140
    .line 141
    invoke-direct/range {v28 .. v28}, Lcom/kubi/rn/core/turbo/NativeQrScanTurboModulePackage;-><init>()V

    .line 142
    .line 143
    new-instance v29, Lcom/kubi/rn/core/turbo/NativeCalendarTurboModulePackage;

    .line 144
    .line 145
    .line 146
    invoke-direct/range {v29 .. v29}, Lcom/kubi/rn/core/turbo/NativeCalendarTurboModulePackage;-><init>()V

    .line 147
    .line 148
    new-instance v30, Lcom/kubi/rn/core/turbo/NativeAuthTurboModulePackage;

    .line 149
    .line 150
    .line 151
    invoke-direct/range {v30 .. v30}, Lcom/kubi/rn/core/turbo/NativeAuthTurboModulePackage;-><init>()V

    .line 152
    .line 153
    new-instance v31, Lcom/kubi/rn/core/turbo/NativeHomeFeedTurboModulePackage;

    .line 154
    .line 155
    .line 156
    invoke-direct/range {v31 .. v31}, Lcom/kubi/rn/core/turbo/NativeHomeFeedTurboModulePackage;-><init>()V

    .line 157
    .line 158
    new-instance v32, Lcom/kubi/rn/core/turbo/NativeNetworkTurboModulePackage;

    .line 159
    .line 160
    .line 161
    invoke-direct/range {v32 .. v32}, Lcom/kubi/rn/core/turbo/NativeNetworkTurboModulePackage;-><init>()V

    .line 162
    .line 163
    new-instance v33, Lcom/kubi/rn/core/turbo/NativeSocketJsTurboModulePackage;

    .line 164
    .line 165
    .line 166
    invoke-direct/range {v33 .. v33}, Lcom/kubi/rn/core/turbo/NativeSocketJsTurboModulePackage;-><init>()V

    .line 167
    .line 168
    new-instance v34, Lcom/kubi/rn/core/turbo/NativeRemoteConfigTurboModulePackage;

    .line 169
    .line 170
    .line 171
    invoke-direct/range {v34 .. v34}, Lcom/kubi/rn/core/turbo/NativeRemoteConfigTurboModulePackage;-><init>()V

    .line 172
    .line 173
    new-instance v35, Lcom/kubi/rn/core/turbo/NativeShareTurboModulePackage;

    .line 174
    .line 175
    .line 176
    invoke-direct/range {v35 .. v35}, Lcom/kubi/rn/core/turbo/NativeShareTurboModulePackage;-><init>()V

    .line 177
    .line 178
    new-instance v36, Lcom/kubi/rn/core/turbo/NativeKrnSocketTurboModulePackage;

    .line 179
    .line 180
    .line 181
    invoke-direct/range {v36 .. v36}, Lcom/kubi/rn/core/turbo/NativeKrnSocketTurboModulePackage;-><init>()V

    .line 182
    .line 183
    new-instance v37, Lcom/kubi/rn/core/turbo/NativeSafeValidationTurboModulePackage;

    .line 184
    .line 185
    .line 186
    invoke-direct/range {v37 .. v37}, Lcom/kubi/rn/core/turbo/NativeSafeValidationTurboModulePackage;-><init>()V

    .line 187
    .line 188
    new-instance v38, Lcom/kubi/rn/core/turbo/NativeCountryCodeTurboModulePackage;

    .line 189
    .line 190
    .line 191
    invoke-direct/range {v38 .. v38}, Lcom/kubi/rn/core/turbo/NativeCountryCodeTurboModulePackage;-><init>()V

    .line 192
    .line 193
    new-instance v39, Lcom/kubi/rn/core/turbo/NativeLifeCycleTurboModulePackage;

    .line 194
    .line 195
    .line 196
    invoke-direct/range {v39 .. v39}, Lcom/kubi/rn/core/turbo/NativeLifeCycleTurboModulePackage;-><init>()V

    .line 197
    .line 198
    new-instance v40, Lcom/kubi/rn/core/turbo/NativeLaunchTurboModulePackage;

    .line 199
    .line 200
    .line 201
    invoke-direct/range {v40 .. v40}, Lcom/kubi/rn/core/turbo/NativeLaunchTurboModulePackage;-><init>()V

    .line 202
    .line 203
    new-instance v41, Lcom/kubi/rn/core/turbo/NativeSystemSettingsTurboModulePackage;

    .line 204
    .line 205
    .line 206
    invoke-direct/range {v41 .. v41}, Lcom/kubi/rn/core/turbo/NativeSystemSettingsTurboModulePackage;-><init>()V

    .line 207
    .line 208
    new-instance v42, Lcom/kubi/rn/core/turbo/NativeTrackTurboModulePackage;

    .line 209
    .line 210
    .line 211
    invoke-direct/range {v42 .. v42}, Lcom/kubi/rn/core/turbo/NativeTrackTurboModulePackage;-><init>()V

    .line 212
    .line 213
    new-instance v43, Lcom/kubi/rn/core/turbo/NativeAssetsTurboModulePackage;

    .line 214
    .line 215
    .line 216
    invoke-direct/range {v43 .. v43}, Lcom/kubi/rn/core/turbo/NativeAssetsTurboModulePackage;-><init>()V

    .line 217
    .line 218
    new-instance v44, Lcom/kubi/rn/core/turbo/NativeFuturesTurboModulePackage;

    .line 219
    .line 220
    .line 221
    invoke-direct/range {v44 .. v44}, Lcom/kubi/rn/core/turbo/NativeFuturesTurboModulePackage;-><init>()V

    .line 222
    .line 223
    new-instance v45, Lcom/kubi/rn/core/turbo/NativeLocaleTurboModulePackage;

    .line 224
    .line 225
    .line 226
    invoke-direct/range {v45 .. v45}, Lcom/kubi/rn/core/turbo/NativeLocaleTurboModulePackage;-><init>()V

    .line 227
    .line 228
    new-instance v46, Lcom/kubi/rn/core/turbo/NativeKycTurboModulePackage;

    .line 229
    .line 230
    .line 231
    invoke-direct/range {v46 .. v46}, Lcom/kubi/rn/core/turbo/NativeKycTurboModulePackage;-><init>()V

    .line 232
    .line 233
    new-instance v47, Lcom/kubi/rn/core/turbo/NativeTradeTurboModulePackage;

    .line 234
    .line 235
    .line 236
    invoke-direct/range {v47 .. v47}, Lcom/kubi/rn/core/turbo/NativeTradeTurboModulePackage;-><init>()V

    .line 237
    .line 238
    new-instance v48, Lcom/kubi/rn/core/turbo/NativeSiteConfigTurboModulePackage;

    .line 239
    .line 240
    .line 241
    invoke-direct/range {v48 .. v48}, Lcom/kubi/rn/core/turbo/NativeSiteConfigTurboModulePackage;-><init>()V

    .line 242
    .line 243
    new-instance v49, Lcom/kubi/rn/core/turbo/NativeExperimentTurboModulePackage;

    .line 244
    .line 245
    .line 246
    invoke-direct/range {v49 .. v49}, Lcom/kubi/rn/core/turbo/NativeExperimentTurboModulePackage;-><init>()V

    .line 247
    .line 248
    new-instance v50, Lcom/kubi/rn/core/turbo/NativeCopyTradingTurboModulePackage;

    .line 249
    .line 250
    .line 251
    invoke-direct/range {v50 .. v50}, Lcom/kubi/rn/core/turbo/NativeCopyTradingTurboModulePackage;-><init>()V

    .line 252
    .line 253
    new-instance v51, Lcom/kubi/rn/core/turbo/NativeGestureTurboModulePackage;

    .line 254
    .line 255
    .line 256
    invoke-direct/range {v51 .. v51}, Lcom/kubi/rn/core/turbo/NativeGestureTurboModulePackage;-><init>()V

    .line 257
    .line 258
    new-instance v52, Lcom/kubi/rn/core/turbo/NativeUserCenterTurboModulePackage;

    .line 259
    .line 260
    .line 261
    invoke-direct/range {v52 .. v52}, Lcom/kubi/rn/core/turbo/NativeUserCenterTurboModulePackage;-><init>()V

    .line 262
    .line 263
    new-instance v53, Lcom/kubi/rn/core/turbo/NativeSiteTurboModulePackage;

    .line 264
    .line 265
    .line 266
    invoke-direct/range {v53 .. v53}, Lcom/kubi/rn/core/turbo/NativeSiteTurboModulePackage;-><init>()V

    .line 267
    .line 268
    new-instance v54, Lcom/kubi/rn/core/turbo/NativeStorageTurboModulePackage;

    .line 269
    .line 270
    .line 271
    invoke-direct/range {v54 .. v54}, Lcom/kubi/rn/core/turbo/NativeStorageTurboModulePackage;-><init>()V

    .line 272
    .line 273
    new-instance v55, Lcom/kubi/rn/core/turbo/NativeKRNEventHubBridgePackage;

    .line 274
    .line 275
    .line 276
    invoke-direct/range {v55 .. v55}, Lcom/kubi/rn/core/turbo/NativeKRNEventHubBridgePackage;-><init>()V

    .line 277
    .line 278
    new-instance v56, Lcom/kubi/rn/core/turbo/NativeKRNSocketModulePackage;

    .line 279
    .line 280
    .line 281
    invoke-direct/range {v56 .. v56}, Lcom/kubi/rn/core/turbo/NativeKRNSocketModulePackage;-><init>()V

    .line 282
    .line 283
    move-object/from16 v57, v1

    .line 284
    .line 285
    const/16 v1, 0x37

    .line 286
    .line 287
    new-array v1, v1, [Lcom/facebook/react/ReactPackage;

    .line 288
    .line 289
    const/16 v58, 0x0

    .line 290
    .line 291
    aput-object v57, v1, v58

    .line 292
    .line 293
    const/16 v57, 0x1

    .line 294
    .line 295
    aput-object v3, v1, v57

    .line 296
    const/4 v3, 0x2

    .line 297
    .line 298
    aput-object v4, v1, v3

    .line 299
    const/4 v3, 0x3

    .line 300
    .line 301
    aput-object v5, v1, v3

    .line 302
    const/4 v3, 0x4

    .line 303
    .line 304
    aput-object v6, v1, v3

    .line 305
    const/4 v3, 0x5

    .line 306
    .line 307
    aput-object v7, v1, v3

    .line 308
    const/4 v3, 0x6

    .line 309
    .line 310
    aput-object v8, v1, v3

    .line 311
    const/4 v3, 0x7

    .line 312
    .line 313
    aput-object v9, v1, v3

    .line 314
    .line 315
    const/16 v3, 0x8

    .line 316
    .line 317
    aput-object v10, v1, v3

    .line 318
    .line 319
    const/16 v3, 0x9

    .line 320
    .line 321
    aput-object v11, v1, v3

    .line 322
    .line 323
    const/16 v3, 0xa

    .line 324
    .line 325
    aput-object v12, v1, v3

    .line 326
    .line 327
    const/16 v3, 0xb

    .line 328
    .line 329
    aput-object v13, v1, v3

    .line 330
    .line 331
    const/16 v3, 0xc

    .line 332
    .line 333
    aput-object v14, v1, v3

    .line 334
    .line 335
    const/16 v3, 0xd

    .line 336
    .line 337
    aput-object v15, v1, v3

    .line 338
    .line 339
    const/16 v3, 0xe

    .line 340
    .line 341
    aput-object v16, v1, v3

    .line 342
    .line 343
    const/16 v3, 0xf

    .line 344
    .line 345
    aput-object v17, v1, v3

    .line 346
    .line 347
    const/16 v3, 0x10

    .line 348
    .line 349
    aput-object v18, v1, v3

    .line 350
    .line 351
    const/16 v3, 0x11

    .line 352
    .line 353
    aput-object v19, v1, v3

    .line 354
    .line 355
    const/16 v3, 0x12

    .line 356
    .line 357
    aput-object v20, v1, v3

    .line 358
    .line 359
    const/16 v3, 0x13

    .line 360
    .line 361
    aput-object v21, v1, v3

    .line 362
    .line 363
    const/16 v3, 0x14

    .line 364
    .line 365
    aput-object v22, v1, v3

    .line 366
    .line 367
    const/16 v3, 0x15

    .line 368
    .line 369
    aput-object v23, v1, v3

    .line 370
    .line 371
    const/16 v3, 0x16

    .line 372
    .line 373
    aput-object v24, v1, v3

    .line 374
    .line 375
    const/16 v3, 0x17

    .line 376
    .line 377
    aput-object v25, v1, v3

    .line 378
    .line 379
    const/16 v3, 0x18

    .line 380
    .line 381
    aput-object v26, v1, v3

    .line 382
    .line 383
    const/16 v3, 0x19

    .line 384
    .line 385
    aput-object v27, v1, v3

    .line 386
    .line 387
    const/16 v3, 0x1a

    .line 388
    .line 389
    aput-object v28, v1, v3

    .line 390
    .line 391
    const/16 v3, 0x1b

    .line 392
    .line 393
    aput-object v29, v1, v3

    .line 394
    .line 395
    const/16 v3, 0x1c

    .line 396
    .line 397
    aput-object v30, v1, v3

    .line 398
    .line 399
    const/16 v3, 0x1d

    .line 400
    .line 401
    aput-object v31, v1, v3

    .line 402
    .line 403
    const/16 v3, 0x1e

    .line 404
    .line 405
    aput-object v32, v1, v3

    .line 406
    .line 407
    const/16 v3, 0x1f

    .line 408
    .line 409
    aput-object v33, v1, v3

    .line 410
    .line 411
    const/16 v3, 0x20

    .line 412
    .line 413
    aput-object v34, v1, v3

    .line 414
    .line 415
    const/16 v3, 0x21

    .line 416
    .line 417
    aput-object v35, v1, v3

    .line 418
    .line 419
    const/16 v3, 0x22

    .line 420
    .line 421
    aput-object v36, v1, v3

    .line 422
    .line 423
    const/16 v3, 0x23

    .line 424
    .line 425
    aput-object v37, v1, v3

    .line 426
    .line 427
    const/16 v3, 0x24

    .line 428
    .line 429
    aput-object v38, v1, v3

    .line 430
    .line 431
    const/16 v3, 0x25

    .line 432
    .line 433
    aput-object v39, v1, v3

    .line 434
    .line 435
    const/16 v3, 0x26

    .line 436
    .line 437
    aput-object v40, v1, v3

    .line 438
    .line 439
    const/16 v3, 0x27

    .line 440
    .line 441
    aput-object v41, v1, v3

    .line 442
    .line 443
    const/16 v3, 0x28

    .line 444
    .line 445
    aput-object v42, v1, v3

    .line 446
    .line 447
    const/16 v3, 0x29

    .line 448
    .line 449
    aput-object v43, v1, v3

    .line 450
    .line 451
    const/16 v3, 0x2a

    .line 452
    .line 453
    aput-object v44, v1, v3

    .line 454
    .line 455
    const/16 v3, 0x2b

    .line 456
    .line 457
    aput-object v45, v1, v3

    .line 458
    .line 459
    const/16 v3, 0x2c

    .line 460
    .line 461
    aput-object v46, v1, v3

    .line 462
    .line 463
    const/16 v3, 0x2d

    .line 464
    .line 465
    aput-object v47, v1, v3

    .line 466
    .line 467
    const/16 v3, 0x2e

    .line 468
    .line 469
    aput-object v48, v1, v3

    .line 470
    .line 471
    const/16 v3, 0x2f

    .line 472
    .line 473
    aput-object v49, v1, v3

    .line 474
    .line 475
    const/16 v3, 0x30

    .line 476
    .line 477
    aput-object v50, v1, v3

    .line 478
    .line 479
    const/16 v3, 0x31

    .line 480
    .line 481
    aput-object v51, v1, v3

    .line 482
    .line 483
    const/16 v3, 0x32

    .line 484
    .line 485
    aput-object v52, v1, v3

    .line 486
    .line 487
    const/16 v3, 0x33

    .line 488
    .line 489
    aput-object v53, v1, v3

    .line 490
    .line 491
    const/16 v3, 0x34

    .line 492
    .line 493
    aput-object v54, v1, v3

    .line 494
    .line 495
    const/16 v3, 0x35

    .line 496
    .line 497
    aput-object v55, v1, v3

    .line 498
    .line 499
    const/16 v3, 0x36

    .line 500
    .line 501
    aput-object v56, v1, v3

    .line 502
    .line 503
    .line 504
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 505
    move-result-object v1

    .line 506
    .line 507
    .line 508
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 509
    return-object v0
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
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
.end method
