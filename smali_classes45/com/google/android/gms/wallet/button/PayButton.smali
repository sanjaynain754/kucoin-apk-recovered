.class public final Lcom/google/android/gms/wallet/button/PayButton;
.super Landroid/widget/FrameLayout;
.source "com.google.android.gms:play-services-wallet@@19.3.0"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private zza:Landroid/view/View$OnClickListener;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private zzb:Lcom/google/android/gms/wallet/button/ButtonOptions$Builder;

.field private zzc:Landroid/view/View;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private final zzd:Lcom/google/android/gms/wallet/button/zzf;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/wallet/button/PayButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/wallet/button/PayButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    invoke-static {}, Lcom/google/android/gms/wallet/button/ButtonOptions;->newBuilder()Lcom/google/android/gms/wallet/button/ButtonOptions$Builder;

    move-result-object p3

    iput-object p3, p0, Lcom/google/android/gms/wallet/button/PayButton;->zzb:Lcom/google/android/gms/wallet/button/ButtonOptions$Builder;

    .line 5
    sget-object v0, Lcom/google/android/gms/wallet/R$styleable;->PayButtonAttributes:[I

    .line 6
    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    sget p2, Lcom/google/android/gms/wallet/R$styleable;->PayButtonAttributes_buttonTheme:I

    const/4 v0, 0x1

    .line 7
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    .line 8
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    const/high16 v2, 0x42c80000    # 100.0f

    .line 9
    invoke-static {v0, v2, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v1

    float-to-int v1, v1

    sget v2, Lcom/google/android/gms/wallet/R$styleable;->PayButtonAttributes_cornerRadius:I

    .line 10
    invoke-virtual {p1, v2, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v1

    iget-object v3, p3, Lcom/google/android/gms/wallet/button/ButtonOptions$Builder;->zza:Lcom/google/android/gms/wallet/button/ButtonOptions;

    iput p2, v3, Lcom/google/android/gms/wallet/button/ButtonOptions;->zzb:I

    iput v1, v3, Lcom/google/android/gms/wallet/button/ButtonOptions;->zzc:I

    .line 11
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p3, Lcom/google/android/gms/wallet/button/ButtonOptions$Builder;->zza:Lcom/google/android/gms/wallet/button/ButtonOptions;

    iput-boolean v0, p2, Lcom/google/android/gms/wallet/button/ButtonOptions;->zze:Z

    .line 12
    :cond_0
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 13
    invoke-virtual {p3, v0}, Lcom/google/android/gms/wallet/button/ButtonOptions$Builder;->setButtonType(I)Lcom/google/android/gms/wallet/button/ButtonOptions$Builder;

    new-instance p1, Lcom/google/android/gms/wallet/button/zzf;

    invoke-direct {p1}, Lcom/google/android/gms/wallet/button/zzf;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/wallet/button/PayButton;->zzd:Lcom/google/android/gms/wallet/button/zzf;

    .line 14
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/wallet/button/PayButton;->zzb:Lcom/google/android/gms/wallet/button/ButtonOptions$Builder;

    .line 15
    invoke-virtual {p1}, Lcom/google/android/gms/wallet/button/ButtonOptions$Builder;->build()Lcom/google/android/gms/wallet/button/ButtonOptions;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/gms/wallet/button/PayButton;->zza(Lcom/google/android/gms/wallet/button/ButtonOptions;)V

    :cond_1
    return-void
.end method

.method private final zza(Lcom/google/android/gms/wallet/button/ButtonOptions;)V
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/google/android/gms/wallet/button/ButtonOptions;->getButtonTheme()I

    .line 9
    move-result v2

    .line 10
    const/4 v3, 0x2

    .line 11
    .line 12
    if-ne v2, v3, :cond_0

    .line 13
    .line 14
    sget v2, Lcom/google/android/gms/wallet/R$style;->PayButtonGenericLightTheme:I

    .line 15
    goto :goto_0

    .line 16
    .line 17
    :cond_0
    sget v2, Lcom/google/android/gms/wallet/R$style;->PayButtonGenericDarkTheme:I

    .line 18
    .line 19
    :goto_0
    new-instance v4, Landroid/view/ContextThemeWrapper;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 23
    move-result-object v5

    .line 24
    .line 25
    .line 26
    invoke-direct {v4, v5, v2}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    .line 27
    .line 28
    new-instance v2, Lcom/google/android/gms/wallet/button/zzg;

    .line 29
    const/4 v5, 0x0

    .line 30
    .line 31
    .line 32
    invoke-direct {v2, v4, v5}, Lcom/google/android/gms/wallet/button/zzg;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 36
    move-result-object v4

    .line 37
    .line 38
    .line 39
    invoke-static {v4}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 40
    move-result-object v4

    .line 41
    .line 42
    sget v6, Lcom/google/android/gms/wallet/R$layout;->paybutton_generic:I

    .line 43
    .line 44
    .line 45
    invoke-virtual {v4, v6, v2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 46
    move-result-object v4

    .line 47
    .line 48
    sget v6, Lcom/google/android/gms/wallet/R$id;->pay_button_view:I

    .line 49
    .line 50
    .line 51
    invoke-virtual {v4, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 52
    move-result-object v4

    .line 53
    .line 54
    check-cast v4, Landroid/widget/LinearLayout;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 58
    move-result-object v6

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1}, Lcom/google/android/gms/wallet/button/ButtonOptions;->getCornerRadius()I

    .line 62
    move-result p1

    .line 63
    .line 64
    sget v7, Lcom/google/android/gms/wallet/R$attr;->payButtonGenericBackground:I

    .line 65
    .line 66
    .line 67
    invoke-static {v6, v7}, Lcom/google/android/gms/wallet/button/zzh;->zza(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 68
    move-result-object v7

    .line 69
    .line 70
    .line 71
    invoke-virtual {v7}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 72
    move-result-object v7

    .line 73
    .line 74
    check-cast v7, Landroid/graphics/drawable/GradientDrawable;

    .line 75
    int-to-float p1, p1

    .line 76
    .line 77
    .line 78
    invoke-virtual {v7, p1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 79
    .line 80
    sget v8, Lcom/google/android/gms/wallet/R$attr;->payButtonGenericRippleColor:I

    .line 81
    .line 82
    new-instance v9, Landroid/util/TypedValue;

    .line 83
    .line 84
    .line 85
    invoke-direct {v9}, Landroid/util/TypedValue;-><init>()V

    .line 86
    .line 87
    iget v9, v9, Landroid/util/TypedValue;->data:I

    .line 88
    .line 89
    .line 90
    filled-new-array {v8}, [I

    .line 91
    move-result-object v8

    .line 92
    .line 93
    .line 94
    invoke-virtual {v6, v9, v8}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 95
    move-result-object v8

    .line 96
    .line 97
    .line 98
    invoke-virtual {v8, v0, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 99
    move-result v9

    .line 100
    .line 101
    .line 102
    invoke-virtual {v8}, Landroid/content/res/TypedArray;->recycle()V

    .line 103
    .line 104
    .line 105
    invoke-static {v9}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 106
    move-result-object v8

    .line 107
    .line 108
    .line 109
    invoke-static {}, Lcom/google/android/gms/common/util/PlatformVersion;->isAtLeastLollipop()Z

    .line 110
    move-result v9

    .line 111
    .line 112
    if-eqz v9, :cond_1

    .line 113
    .line 114
    new-instance p1, Landroid/graphics/drawable/RippleDrawable;

    .line 115
    .line 116
    .line 117
    invoke-direct {p1, v8, v7, v5}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 118
    goto :goto_1

    .line 119
    .line 120
    :cond_1
    sget v5, Lcom/google/android/gms/wallet/R$attr;->payButtonGenericRippleMask:I

    .line 121
    .line 122
    .line 123
    invoke-static {v6, v5}, Lcom/google/android/gms/wallet/button/zzh;->zza(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 124
    move-result-object v5

    .line 125
    .line 126
    .line 127
    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 128
    move-result-object v5

    .line 129
    .line 130
    check-cast v5, Landroid/graphics/drawable/GradientDrawable;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v5, p1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 134
    .line 135
    new-instance p1, Landroid/graphics/drawable/LayerDrawable;

    .line 136
    .line 137
    new-array v3, v3, [Landroid/graphics/drawable/Drawable;

    .line 138
    .line 139
    aput-object v7, v3, v0

    .line 140
    .line 141
    aput-object v5, v3, v1

    .line 142
    .line 143
    .line 144
    invoke-direct {p1, v3}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    .line 145
    .line 146
    new-instance v1, Landroid/graphics/drawable/StateListDrawable;

    .line 147
    .line 148
    .line 149
    invoke-direct {v1}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    .line 150
    .line 151
    .line 152
    const v3, 0x10100a7

    .line 153
    .line 154
    .line 155
    filled-new-array {v3}, [I

    .line 156
    move-result-object v3

    .line 157
    .line 158
    .line 159
    invoke-virtual {v1, v3, p1}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 160
    .line 161
    new-array p1, v0, [I

    .line 162
    .line 163
    .line 164
    invoke-virtual {v1, p1, v7}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 165
    move-object p1, v1

    .line 166
    .line 167
    .line 168
    :goto_1
    invoke-virtual {v4, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 172
    move-result-object p1

    .line 173
    .line 174
    sget v0, Lcom/google/android/gms/wallet/R$string;->gpay_logo_description:I

    .line 175
    .line 176
    .line 177
    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 178
    move-result-object p1

    .line 179
    .line 180
    .line 181
    invoke-virtual {v2, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 182
    .line 183
    iput-object v2, p0, Lcom/google/android/gms/wallet/button/PayButton;->zzc:Landroid/view/View;

    .line 184
    .line 185
    .line 186
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 187
    .line 188
    iget-object p1, p0, Lcom/google/android/gms/wallet/button/PayButton;->zzc:Landroid/view/View;

    .line 189
    .line 190
    .line 191
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 192
    return-void
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
.end method


# virtual methods
.method public initialize(Lcom/google/android/gms/wallet/button/ButtonOptions;)V
    .locals 3
    .param p1    # Lcom/google/android/gms/wallet/button/ButtonOptions;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/android/gms/wallet/button/PayButton;->zzb:Lcom/google/android/gms/wallet/button/ButtonOptions$Builder;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/google/android/gms/wallet/button/ButtonOptions;->getButtonType()I

    .line 6
    move-result v1

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    iget-object v1, v0, Lcom/google/android/gms/wallet/button/ButtonOptions$Builder;->zza:Lcom/google/android/gms/wallet/button/ButtonOptions;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/google/android/gms/wallet/button/ButtonOptions;->getButtonType()I

    .line 14
    move-result v2

    .line 15
    .line 16
    iput v2, v1, Lcom/google/android/gms/wallet/button/ButtonOptions;->zza:I

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/wallet/button/ButtonOptions;->getButtonTheme()I

    .line 20
    move-result v1

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    iget-object v1, v0, Lcom/google/android/gms/wallet/button/ButtonOptions$Builder;->zza:Lcom/google/android/gms/wallet/button/ButtonOptions;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/google/android/gms/wallet/button/ButtonOptions;->getButtonTheme()I

    .line 28
    move-result v2

    .line 29
    .line 30
    iput v2, v1, Lcom/google/android/gms/wallet/button/ButtonOptions;->zzb:I

    .line 31
    .line 32
    :cond_1
    iget-boolean v1, p1, Lcom/google/android/gms/wallet/button/ButtonOptions;->zze:Z

    .line 33
    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Lcom/google/android/gms/wallet/button/ButtonOptions;->getCornerRadius()I

    .line 38
    move-result v1

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v1}, Lcom/google/android/gms/wallet/button/ButtonOptions$Builder;->setCornerRadius(I)Lcom/google/android/gms/wallet/button/ButtonOptions$Builder;

    .line 42
    .line 43
    .line 44
    :cond_2
    invoke-virtual {p1}, Lcom/google/android/gms/wallet/button/ButtonOptions;->getAllowedPaymentMethods()Ljava/lang/String;

    .line 45
    move-result-object v1

    .line 46
    .line 47
    if-eqz v1, :cond_3

    .line 48
    .line 49
    iget-object v0, v0, Lcom/google/android/gms/wallet/button/ButtonOptions$Builder;->zza:Lcom/google/android/gms/wallet/button/ButtonOptions;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1}, Lcom/google/android/gms/wallet/button/ButtonOptions;->getAllowedPaymentMethods()Ljava/lang/String;

    .line 53
    move-result-object p1

    .line 54
    .line 55
    iput-object p1, v0, Lcom/google/android/gms/wallet/button/ButtonOptions;->zzd:Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    .line 59
    move-result p1

    .line 60
    .line 61
    if-nez p1, :cond_7

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 65
    .line 66
    iget-object p1, p0, Lcom/google/android/gms/wallet/button/PayButton;->zzb:Lcom/google/android/gms/wallet/button/ButtonOptions$Builder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1}, Lcom/google/android/gms/wallet/button/ButtonOptions$Builder;->build()Lcom/google/android/gms/wallet/button/ButtonOptions;

    .line 70
    move-result-object p1

    .line 71
    .line 72
    .line 73
    invoke-static {}, Lcom/google/android/gms/common/GoogleApiAvailability;->getInstance()Lcom/google/android/gms/common/GoogleApiAvailability;

    .line 74
    move-result-object v0

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 78
    move-result-object v1

    .line 79
    .line 80
    .line 81
    const v2, 0xdd590a0

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/GoogleApiAvailability;->isGooglePlayServicesAvailable(Landroid/content/Context;I)I

    .line 85
    move-result v0

    .line 86
    .line 87
    const-string v1, "PayButton"

    .line 88
    .line 89
    if-eqz v0, :cond_4

    .line 90
    .line 91
    .line 92
    invoke-direct {p0, p1}, Lcom/google/android/gms/wallet/button/PayButton;->zza(Lcom/google/android/gms/wallet/button/ButtonOptions;)V

    .line 93
    .line 94
    const-string p1, "Failed to create latest buttonView: Google Play Services version is outdated."

    .line 95
    .line 96
    .line 97
    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 98
    return-void

    .line 99
    .line 100
    .line 101
    :cond_4
    invoke-virtual {p1}, Lcom/google/android/gms/wallet/button/ButtonOptions;->getAllowedPaymentMethods()Ljava/lang/String;

    .line 102
    move-result-object v0

    .line 103
    .line 104
    .line 105
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 106
    move-result v0

    .line 107
    .line 108
    if-eqz v0, :cond_5

    .line 109
    .line 110
    const-string p1, "Failed to create buttonView: allowedPaymentMethods cannot be empty."

    .line 111
    .line 112
    .line 113
    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 114
    return-void

    .line 115
    .line 116
    .line 117
    :cond_5
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 118
    move-result-object v0

    .line 119
    .line 120
    .line 121
    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    move-result-object v0

    .line 123
    .line 124
    check-cast v0, Landroid/content/Context;

    .line 125
    .line 126
    .line 127
    invoke-static {v0, p1}, Lcom/google/android/gms/wallet/button/zzf;->zza(Landroid/content/Context;Lcom/google/android/gms/wallet/button/ButtonOptions;)Landroid/view/View;

    .line 128
    move-result-object p1

    .line 129
    .line 130
    iput-object p1, p0, Lcom/google/android/gms/wallet/button/PayButton;->zzc:Landroid/view/View;

    .line 131
    .line 132
    if-nez p1, :cond_6

    .line 133
    .line 134
    const-string p1, "Failed to create buttonView"

    .line 135
    .line 136
    .line 137
    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 138
    return-void

    .line 139
    .line 140
    .line 141
    :cond_6
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 142
    .line 143
    iget-object p1, p0, Lcom/google/android/gms/wallet/button/PayButton;->zzc:Landroid/view/View;

    .line 144
    .line 145
    .line 146
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 147
    return-void

    .line 148
    .line 149
    :cond_7
    iget-object p1, p0, Lcom/google/android/gms/wallet/button/PayButton;->zzb:Lcom/google/android/gms/wallet/button/ButtonOptions$Builder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {p1}, Lcom/google/android/gms/wallet/button/ButtonOptions$Builder;->build()Lcom/google/android/gms/wallet/button/ButtonOptions;

    .line 153
    move-result-object p1

    .line 154
    .line 155
    .line 156
    invoke-direct {p0, p1}, Lcom/google/android/gms/wallet/button/PayButton;->zza(Lcom/google/android/gms/wallet/button/ButtonOptions;)V

    .line 157
    return-void
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
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/android/gms/wallet/button/PayButton;->zza:Landroid/view/View$OnClickListener;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v1, p0, Lcom/google/android/gms/wallet/button/PayButton;->zzc:Landroid/view/View;

    .line 7
    .line 8
    if-ne p1, v1, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, p0}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    .line 12
    :cond_0
    return-void
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

.method public setOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 0
    .param p1    # Landroid/view/View$OnClickListener;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/google/android/gms/wallet/button/PayButton;->zza:Landroid/view/View$OnClickListener;

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
