.class public Lcom/sumsub/sns/core/data/listener/SNSDefaultIconHandler;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lcom/sumsub/sns/core/data/listener/SNSIconHandler;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0017\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J!\u0010\r\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/sumsub/sns/core/data/listener/SNSDefaultIconHandler;",
        "Lcom/sumsub/sns/core/data/listener/SNSIconHandler;",
        "<init>",
        "()V",
        "Lcom/sumsub/sns/internal/features/data/model/common/X;",
        "",
        "stepIcon",
        "(Lcom/sumsub/sns/internal/features/data/model/common/X;)I",
        "Landroid/content/Context;",
        "context",
        "",
        "key",
        "Landroid/graphics/drawable/Drawable;",
        "onResolveIcon",
        "(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;",
        "idensic-mobile-sdk-aar_defaultRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSNSDefaultIconHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSDefaultIconHandler.kt\ncom/sumsub/sns/core/data/listener/SNSDefaultIconHandler\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,142:1\n1#2:143\n*E\n"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method

.method private final stepIcon(Lcom/sumsub/sns/internal/features/data/model/common/X;)I
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/X;->d()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    sget p1, Lcom/sumsub/sns/R$drawable;->sns_ic_step_identity:I

    .line 9
    return p1

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/X;->e()Z

    .line 13
    move-result v0

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    sget p1, Lcom/sumsub/sns/R$drawable;->sns_ic_step_poa:I

    .line 18
    return p1

    .line 19
    .line 20
    .line 21
    :cond_1
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/X;->f()Z

    .line 22
    move-result v0

    .line 23
    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    sget p1, Lcom/sumsub/sns/R$drawable;->sns_ic_step_selfie:I

    .line 27
    return p1

    .line 28
    .line 29
    .line 30
    :cond_2
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/X;->c()Z

    .line 31
    move-result v0

    .line 32
    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    sget p1, Lcom/sumsub/sns/R$drawable;->sns_ic_step_applicant_data:I

    .line 36
    return p1

    .line 37
    .line 38
    :cond_3
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 39
    .line 40
    const-string v1, "QUESTIONNAIRE"

    .line 41
    const/4 v2, 0x0

    .line 42
    const/4 v3, 0x2

    .line 43
    const/4 v4, 0x0

    .line 44
    .line 45
    .line 46
    invoke-static {v0, v1, v2, v3, v4}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 47
    move-result v0

    .line 48
    .line 49
    if-eqz v0, :cond_4

    .line 50
    .line 51
    sget p1, Lcom/sumsub/sns/R$drawable;->sns_ic_step_questionnaire:I

    .line 52
    return p1

    .line 53
    .line 54
    :cond_4
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 55
    .line 56
    const-string v1, "PHONE_VERIFICATION"

    .line 57
    .line 58
    .line 59
    invoke-static {v0, v1, v2, v3, v4}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 60
    move-result v0

    .line 61
    .line 62
    if-eqz v0, :cond_5

    .line 63
    .line 64
    sget p1, Lcom/sumsub/sns/R$drawable;->sns_ic_step_phone:I

    .line 65
    return p1

    .line 66
    .line 67
    :cond_5
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 68
    .line 69
    const-string v1, "EMAIL_VERIFICATION"

    .line 70
    .line 71
    .line 72
    invoke-static {v0, v1, v2, v3, v4}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 73
    move-result v0

    .line 74
    .line 75
    if-eqz v0, :cond_6

    .line 76
    .line 77
    sget p1, Lcom/sumsub/sns/R$drawable;->sns_ic_step_email:I

    .line 78
    return p1

    .line 79
    .line 80
    :cond_6
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 81
    .line 82
    const-string v1, "E_KYC"

    .line 83
    .line 84
    .line 85
    invoke-static {v0, v1, v2, v3, v4}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 86
    move-result v0

    .line 87
    .line 88
    if-eqz v0, :cond_7

    .line 89
    .line 90
    sget p1, Lcom/sumsub/sns/R$drawable;->sns_ic_step_ekyc:I

    .line 91
    return p1

    .line 92
    .line 93
    :cond_7
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 94
    .line 95
    const-string v1, "VIDEO_IDENT"

    .line 96
    .line 97
    .line 98
    invoke-static {v0, v1, v2, v3, v4}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 99
    move-result v0

    .line 100
    .line 101
    if-eqz v0, :cond_8

    .line 102
    .line 103
    sget p1, Lcom/sumsub/sns/R$drawable;->sns_ic_step_video_ident:I

    .line 104
    return p1

    .line 105
    .line 106
    :cond_8
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 107
    .line 108
    const-string v0, "E_SIGN"

    .line 109
    .line 110
    .line 111
    invoke-static {p1, v0, v2, v3, v4}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 112
    move-result p1

    .line 113
    .line 114
    if-eqz p1, :cond_9

    .line 115
    .line 116
    sget p1, Lcom/sumsub/sns/R$drawable;->sns_ic_sign:I

    .line 117
    return p1

    .line 118
    .line 119
    :cond_9
    sget p1, Lcom/sumsub/sns/R$drawable;->sns_ic_step_identity:I

    .line 120
    return p1
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
.method public onResolveIcon(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    .locals 15
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p2

    .line 3
    .line 4
    .line 5
    invoke-static {}, Lcom/sumsub/sns/core/presentation/helper/a;->a()Lcom/sumsub/sns/internal/core/presentation/theme/p;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    const-string v2, "IdentityType/"

    .line 9
    .line 10
    const-string v3, "DocType/"

    .line 11
    .line 12
    const-string v4, "/"

    .line 13
    const/4 v5, 0x0

    .line 14
    const/4 v6, 0x2

    .line 15
    const/4 v7, 0x0

    .line 16
    .line 17
    if-eqz v1, :cond_5

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v3, v5, v6, v7}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 21
    move-result v8

    .line 22
    .line 23
    if-eqz v8, :cond_0

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v4, v7, v6, v7}, Lkotlin/text/StringsKt;->substringAfter$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 27
    move-result-object v9

    .line 28
    const/4 v8, 0x1

    .line 29
    .line 30
    new-array v10, v8, [C

    .line 31
    .line 32
    const/16 v8, 0x5f

    .line 33
    .line 34
    aput-char v8, v10, v5

    .line 35
    const/4 v13, 0x6

    .line 36
    const/4 v14, 0x0

    .line 37
    const/4 v11, 0x0

    .line 38
    const/4 v12, 0x0

    .line 39
    .line 40
    .line 41
    invoke-static/range {v9 .. v14}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[CZIILjava/lang/Object;)Ljava/util/List;

    .line 42
    move-result-object v8

    .line 43
    .line 44
    .line 45
    invoke-static {v8}, Lcom/sumsub/sns/internal/core/common/T0;->a(Ljava/util/List;)Ljava/lang/String;

    .line 46
    move-result-object v8

    .line 47
    .line 48
    sget-object v9, Lcom/sumsub/sns/internal/core/presentation/theme/ImageElementName;->VERIFICATION_STEP_ICONS:Lcom/sumsub/sns/internal/core/presentation/theme/ImageElementName;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v9}, Lcom/sumsub/sns/internal/core/presentation/theme/ImageElementName;->getValue()Ljava/lang/String;

    .line 52
    move-result-object v9

    .line 53
    .line 54
    .line 55
    invoke-static {v1, v8, v9}, Lcom/sumsub/sns/core/presentation/helper/a;->a(Lcom/sumsub/sns/internal/core/presentation/theme/p;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/BitmapDrawable;

    .line 56
    move-result-object v1

    .line 57
    goto :goto_2

    .line 58
    .line 59
    :cond_0
    const-string v8, "default/"

    .line 60
    .line 61
    .line 62
    invoke-static {v0, v8, v5, v6, v7}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 63
    move-result v8

    .line 64
    .line 65
    if-eqz v8, :cond_1

    .line 66
    .line 67
    sget-object v8, Lcom/sumsub/sns/internal/core/presentation/theme/ImageElementName;->INSTRUCTIONS_IMAGES:Lcom/sumsub/sns/internal/core/presentation/theme/ImageElementName;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v8}, Lcom/sumsub/sns/internal/core/presentation/theme/ImageElementName;->getValue()Ljava/lang/String;

    .line 71
    move-result-object v8

    .line 72
    .line 73
    .line 74
    invoke-static {v1, v0, v8}, Lcom/sumsub/sns/core/presentation/helper/a;->a(Lcom/sumsub/sns/internal/core/presentation/theme/p;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/BitmapDrawable;

    .line 75
    move-result-object v1

    .line 76
    goto :goto_2

    .line 77
    .line 78
    .line 79
    :cond_1
    invoke-static {v0, v2, v5, v6, v7}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 80
    move-result v8

    .line 81
    .line 82
    if-eqz v8, :cond_2

    .line 83
    .line 84
    .line 85
    invoke-static {v0, v4, v7, v6, v7}, Lkotlin/text/StringsKt;->substringAfter$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 86
    move-result-object v8

    .line 87
    .line 88
    sget-object v9, Lcom/sumsub/sns/internal/core/presentation/theme/ImageElementName;->DOCUMENT_TYPE_ICONS:Lcom/sumsub/sns/internal/core/presentation/theme/ImageElementName;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v9}, Lcom/sumsub/sns/internal/core/presentation/theme/ImageElementName;->getValue()Ljava/lang/String;

    .line 92
    move-result-object v9

    .line 93
    .line 94
    .line 95
    invoke-static {v1, v8, v9}, Lcom/sumsub/sns/core/presentation/helper/a;->a(Lcom/sumsub/sns/internal/core/presentation/theme/p;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/BitmapDrawable;

    .line 96
    move-result-object v1

    .line 97
    goto :goto_2

    .line 98
    .line 99
    :cond_2
    iget-object v1, v1, Lcom/sumsub/sns/internal/core/presentation/theme/p;->e:Ljava/util/Map;

    .line 100
    .line 101
    if-eqz v1, :cond_3

    .line 102
    .line 103
    .line 104
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    move-result-object v1

    .line 106
    .line 107
    check-cast v1, Lcom/sumsub/sns/internal/core/presentation/theme/j;

    .line 108
    goto :goto_0

    .line 109
    :cond_3
    move-object v1, v7

    .line 110
    .line 111
    :goto_0
    instance-of v8, v1, Lcom/sumsub/sns/internal/core/presentation/theme/e;

    .line 112
    .line 113
    if-eqz v8, :cond_4

    .line 114
    .line 115
    check-cast v1, Lcom/sumsub/sns/internal/core/presentation/theme/e;

    .line 116
    goto :goto_1

    .line 117
    :cond_4
    move-object v1, v7

    .line 118
    .line 119
    :goto_1
    if-eqz v1, :cond_5

    .line 120
    .line 121
    iget-object v1, v1, Lcom/sumsub/sns/internal/core/presentation/theme/e;->d:Landroid/graphics/Bitmap;

    .line 122
    .line 123
    if-eqz v1, :cond_5

    .line 124
    .line 125
    new-instance v8, Landroid/graphics/drawable/BitmapDrawable;

    .line 126
    .line 127
    .line 128
    invoke-direct {v8, v1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/graphics/Bitmap;)V

    .line 129
    move-object v1, v8

    .line 130
    goto :goto_2

    .line 131
    :cond_5
    move-object v1, v7

    .line 132
    .line 133
    :goto_2
    if-eqz v1, :cond_6

    .line 134
    return-object v1

    .line 135
    .line 136
    :cond_6
    const-string v1, "default/videoident"

    .line 137
    .line 138
    .line 139
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 140
    move-result v1

    .line 141
    const/4 v8, -0x1

    .line 142
    .line 143
    if-eqz v1, :cond_7

    .line 144
    .line 145
    sget v0, Lcom/sumsub/sns/R$drawable;->sns_ic_videoident_intro_face:I

    .line 146
    .line 147
    goto/16 :goto_3

    .line 148
    .line 149
    :cond_7
    const-string v1, "default/do_idCard"

    .line 150
    .line 151
    .line 152
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 153
    move-result v1

    .line 154
    .line 155
    if-eqz v1, :cond_8

    .line 156
    .line 157
    sget v0, Lcom/sumsub/sns/R$drawable;->sns_ic_intro_do:I

    .line 158
    .line 159
    goto/16 :goto_3

    .line 160
    .line 161
    :cond_8
    const-string v1, "default/do_passport"

    .line 162
    .line 163
    .line 164
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 165
    move-result v1

    .line 166
    .line 167
    if-eqz v1, :cond_9

    .line 168
    .line 169
    sget v0, Lcom/sumsub/sns/R$drawable;->sns_ic_intro_do_passport:I

    .line 170
    .line 171
    goto/16 :goto_3

    .line 172
    .line 173
    :cond_9
    const-string v1, "default/dont_idCard"

    .line 174
    .line 175
    .line 176
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 177
    move-result v1

    .line 178
    .line 179
    if-eqz v1, :cond_a

    .line 180
    .line 181
    sget v0, Lcom/sumsub/sns/R$drawable;->sns_ic_intro_dont:I

    .line 182
    .line 183
    goto/16 :goto_3

    .line 184
    .line 185
    :cond_a
    const-string v1, "default/dont_passport"

    .line 186
    .line 187
    .line 188
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 189
    move-result v1

    .line 190
    .line 191
    if-eqz v1, :cond_b

    .line 192
    .line 193
    sget v0, Lcom/sumsub/sns/R$drawable;->sns_ic_intro_dont_passport:I

    .line 194
    .line 195
    goto/16 :goto_3

    .line 196
    .line 197
    :cond_b
    const-string v1, "default/facescan"

    .line 198
    .line 199
    .line 200
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 201
    move-result v1

    .line 202
    .line 203
    if-eqz v1, :cond_c

    .line 204
    .line 205
    sget v0, Lcom/sumsub/sns/R$drawable;->sns_ic_intro_liveness:I

    .line 206
    .line 207
    goto/16 :goto_3

    .line 208
    .line 209
    :cond_c
    const-string v1, "default/do_idCard_backSide"

    .line 210
    .line 211
    .line 212
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 213
    move-result v1

    .line 214
    .line 215
    if-eqz v1, :cond_d

    .line 216
    .line 217
    sget v0, Lcom/sumsub/sns/R$drawable;->sns_ic_intro_do_back:I

    .line 218
    .line 219
    goto/16 :goto_3

    .line 220
    .line 221
    :cond_d
    const-string v1, "default/dont_idCard_backSide"

    .line 222
    .line 223
    .line 224
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 225
    move-result v1

    .line 226
    .line 227
    if-eqz v1, :cond_e

    .line 228
    .line 229
    sget v0, Lcom/sumsub/sns/R$drawable;->sns_ic_intro_dont_back:I

    .line 230
    .line 231
    goto/16 :goto_3

    .line 232
    .line 233
    :cond_e
    sget-object v1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSIdentityTypeIcons;->Companion:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSIdentityTypeIcons$Companion;

    .line 234
    .line 235
    sget-object v9, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSIdentityTypeIcons;->PASSPORT:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSIdentityTypeIcons;

    .line 236
    .line 237
    .line 238
    invoke-virtual {v1, v9}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSIdentityTypeIcons$Companion;->imageKey(Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSIdentityTypeIcons;)Ljava/lang/String;

    .line 239
    move-result-object v9

    .line 240
    .line 241
    .line 242
    invoke-static {v0, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 243
    move-result v9

    .line 244
    .line 245
    if-eqz v9, :cond_f

    .line 246
    .line 247
    sget v0, Lcom/sumsub/sns/R$drawable;->sns_ic_iddoc_passport:I

    .line 248
    .line 249
    goto/16 :goto_3

    .line 250
    .line 251
    :cond_f
    sget-object v9, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSIdentityTypeIcons;->DRIVERS:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSIdentityTypeIcons;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v1, v9}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSIdentityTypeIcons$Companion;->imageKey(Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSIdentityTypeIcons;)Ljava/lang/String;

    .line 255
    move-result-object v9

    .line 256
    .line 257
    .line 258
    invoke-static {v0, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 259
    move-result v9

    .line 260
    .line 261
    if-eqz v9, :cond_10

    .line 262
    .line 263
    sget v0, Lcom/sumsub/sns/R$drawable;->sns_ic_iddoc_driving_license:I

    .line 264
    .line 265
    goto/16 :goto_3

    .line 266
    .line 267
    :cond_10
    sget-object v9, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSIdentityTypeIcons;->RESIDENCE_PERMIT:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSIdentityTypeIcons;

    .line 268
    .line 269
    .line 270
    invoke-virtual {v1, v9}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSIdentityTypeIcons$Companion;->imageKey(Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSIdentityTypeIcons;)Ljava/lang/String;

    .line 271
    move-result-object v9

    .line 272
    .line 273
    .line 274
    invoke-static {v0, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 275
    move-result v9

    .line 276
    .line 277
    if-eqz v9, :cond_11

    .line 278
    .line 279
    sget v0, Lcom/sumsub/sns/R$drawable;->sns_ic_iddoc_residence_permit:I

    .line 280
    .line 281
    goto/16 :goto_3

    .line 282
    .line 283
    :cond_11
    sget-object v9, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSIdentityTypeIcons;->ID_CARD:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSIdentityTypeIcons;

    .line 284
    .line 285
    .line 286
    invoke-virtual {v1, v9}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSIdentityTypeIcons$Companion;->imageKey(Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSIdentityTypeIcons;)Ljava/lang/String;

    .line 287
    move-result-object v1

    .line 288
    .line 289
    .line 290
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 291
    move-result v1

    .line 292
    .line 293
    if-eqz v1, :cond_12

    .line 294
    .line 295
    sget v0, Lcom/sumsub/sns/R$drawable;->sns_ic_iddoc_id_card:I

    .line 296
    .line 297
    goto/16 :goto_3

    .line 298
    .line 299
    :cond_12
    sget-object v1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->ADD:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    .line 300
    .line 301
    .line 302
    invoke-virtual {v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    .line 303
    move-result-object v1

    .line 304
    .line 305
    .line 306
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 307
    move-result v1

    .line 308
    .line 309
    if-eqz v1, :cond_13

    .line 310
    .line 311
    sget v0, Lcom/sumsub/sns/R$drawable;->sns_ic_add:I

    .line 312
    .line 313
    goto/16 :goto_3

    .line 314
    .line 315
    :cond_13
    sget-object v1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSResultIcons;->SUCCESS:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSResultIcons;

    .line 316
    .line 317
    .line 318
    invoke-virtual {v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSResultIcons;->getImageName()Ljava/lang/String;

    .line 319
    move-result-object v1

    .line 320
    .line 321
    .line 322
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 323
    move-result v1

    .line 324
    .line 325
    if-eqz v1, :cond_14

    .line 326
    .line 327
    sget v0, Lcom/sumsub/sns/R$drawable;->sns_ic_success:I

    .line 328
    .line 329
    goto/16 :goto_3

    .line 330
    .line 331
    :cond_14
    sget-object v1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSResultIcons;->FAILURE:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSResultIcons;

    .line 332
    .line 333
    .line 334
    invoke-virtual {v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSResultIcons;->getImageName()Ljava/lang/String;

    .line 335
    move-result-object v1

    .line 336
    .line 337
    .line 338
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 339
    move-result v1

    .line 340
    .line 341
    if-eqz v1, :cond_15

    .line 342
    .line 343
    sget v0, Lcom/sumsub/sns/R$drawable;->sns_ic_fatal:I

    .line 344
    .line 345
    goto/16 :goto_3

    .line 346
    .line 347
    :cond_15
    sget-object v1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSResultIcons;->SUBMITTED:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSResultIcons;

    .line 348
    .line 349
    .line 350
    invoke-virtual {v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSResultIcons;->getImageName()Ljava/lang/String;

    .line 351
    move-result-object v1

    .line 352
    .line 353
    .line 354
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 355
    move-result v1

    .line 356
    .line 357
    if-eqz v1, :cond_16

    .line 358
    .line 359
    sget v0, Lcom/sumsub/sns/R$drawable;->sns_ic_submitted:I

    .line 360
    .line 361
    goto/16 :goto_3

    .line 362
    .line 363
    :cond_16
    sget-object v1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSResultIcons;->WARNING:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSResultIcons;

    .line 364
    .line 365
    .line 366
    invoke-virtual {v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSResultIcons;->getImageName()Ljava/lang/String;

    .line 367
    move-result-object v1

    .line 368
    .line 369
    .line 370
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 371
    move-result v1

    .line 372
    .line 373
    if-eqz v1, :cond_17

    .line 374
    .line 375
    sget v0, Lcom/sumsub/sns/R$drawable;->sns_ic_warning:I

    .line 376
    .line 377
    goto/16 :goto_3

    .line 378
    .line 379
    :cond_17
    sget-object v1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSResultIcons;->INFO:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSResultIcons;

    .line 380
    .line 381
    .line 382
    invoke-virtual {v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSResultIcons;->getImageName()Ljava/lang/String;

    .line 383
    move-result-object v1

    .line 384
    .line 385
    .line 386
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 387
    move-result v1

    .line 388
    .line 389
    if-eqz v1, :cond_18

    .line 390
    .line 391
    sget v0, Lcom/sumsub/sns/R$drawable;->sns_ic_info_circle:I

    .line 392
    .line 393
    goto/16 :goto_3

    .line 394
    .line 395
    :cond_18
    sget-object v1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->WARNING_OUTLINE:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    .line 396
    .line 397
    .line 398
    invoke-virtual {v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    .line 399
    move-result-object v1

    .line 400
    .line 401
    .line 402
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 403
    move-result v1

    .line 404
    .line 405
    if-eqz v1, :cond_19

    .line 406
    .line 407
    sget v0, Lcom/sumsub/sns/R$drawable;->sns_ic_warning_outline:I

    .line 408
    .line 409
    goto/16 :goto_3

    .line 410
    .line 411
    :cond_19
    sget-object v1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->CLOSE:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    .line 412
    .line 413
    .line 414
    invoke-virtual {v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    .line 415
    move-result-object v1

    .line 416
    .line 417
    .line 418
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 419
    move-result v1

    .line 420
    .line 421
    if-eqz v1, :cond_1a

    .line 422
    .line 423
    sget v0, Lcom/sumsub/sns/R$drawable;->sns_ic_close:I

    .line 424
    .line 425
    goto/16 :goto_3

    .line 426
    .line 427
    :cond_1a
    sget-object v1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->BACK:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    .line 428
    .line 429
    .line 430
    invoke-virtual {v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    .line 431
    move-result-object v1

    .line 432
    .line 433
    .line 434
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 435
    move-result v1

    .line 436
    .line 437
    if-eqz v1, :cond_1b

    .line 438
    .line 439
    sget v0, Lcom/sumsub/sns/R$drawable;->sns_ic_back:I

    .line 440
    .line 441
    goto/16 :goto_3

    .line 442
    .line 443
    :cond_1b
    sget-object v1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->DISCLOSURE:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    .line 444
    .line 445
    .line 446
    invoke-virtual {v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    .line 447
    move-result-object v1

    .line 448
    .line 449
    .line 450
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 451
    move-result v1

    .line 452
    .line 453
    if-eqz v1, :cond_1c

    .line 454
    .line 455
    sget v0, Lcom/sumsub/sns/R$drawable;->sns_ic_step_open:I

    .line 456
    .line 457
    goto/16 :goto_3

    .line 458
    .line 459
    :cond_1c
    sget-object v1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->DROPDOWN:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    .line 460
    .line 461
    .line 462
    invoke-virtual {v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    .line 463
    move-result-object v1

    .line 464
    .line 465
    .line 466
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 467
    move-result v1

    .line 468
    .line 469
    if-eqz v1, :cond_1d

    .line 470
    .line 471
    sget v0, Lcom/sumsub/sns/R$drawable;->sns_ic_arrown_down:I

    .line 472
    .line 473
    goto/16 :goto_3

    .line 474
    .line 475
    :cond_1d
    sget-object v1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->TORCH_ON:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    .line 476
    .line 477
    .line 478
    invoke-virtual {v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    .line 479
    move-result-object v1

    .line 480
    .line 481
    .line 482
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 483
    move-result v1

    .line 484
    .line 485
    if-eqz v1, :cond_1e

    .line 486
    .line 487
    sget v0, Lcom/sumsub/sns/R$drawable;->sns_ic_flash_on:I

    .line 488
    .line 489
    goto/16 :goto_3

    .line 490
    .line 491
    :cond_1e
    sget-object v1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->INSTANT_ACTION:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    .line 492
    .line 493
    .line 494
    invoke-virtual {v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    .line 495
    move-result-object v1

    .line 496
    .line 497
    .line 498
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 499
    move-result v1

    .line 500
    .line 501
    if-eqz v1, :cond_1f

    .line 502
    .line 503
    sget v0, Lcom/sumsub/sns/R$drawable;->sns_ic_flash_on_filled:I

    .line 504
    .line 505
    goto/16 :goto_3

    .line 506
    .line 507
    :cond_1f
    sget-object v1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->TORCH_OFF:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    .line 508
    .line 509
    .line 510
    invoke-virtual {v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    .line 511
    move-result-object v1

    .line 512
    .line 513
    .line 514
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 515
    move-result v1

    .line 516
    .line 517
    if-eqz v1, :cond_20

    .line 518
    .line 519
    sget v0, Lcom/sumsub/sns/R$drawable;->sns_ic_flash_off:I

    .line 520
    .line 521
    goto/16 :goto_3

    .line 522
    .line 523
    :cond_20
    sget-object v1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->GALLERY:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    .line 524
    .line 525
    .line 526
    invoke-virtual {v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    .line 527
    move-result-object v1

    .line 528
    .line 529
    .line 530
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 531
    move-result v1

    .line 532
    .line 533
    if-eqz v1, :cond_21

    .line 534
    .line 535
    sget v0, Lcom/sumsub/sns/R$drawable;->sns_ic_gallery:I

    .line 536
    .line 537
    goto/16 :goto_3

    .line 538
    .line 539
    :cond_21
    sget-object v1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->INFO:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    .line 540
    .line 541
    .line 542
    invoke-virtual {v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    .line 543
    move-result-object v1

    .line 544
    .line 545
    .line 546
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 547
    move-result v1

    .line 548
    .line 549
    if-eqz v1, :cond_22

    .line 550
    .line 551
    sget v0, Lcom/sumsub/sns/R$drawable;->sns_ic_info:I

    .line 552
    .line 553
    goto/16 :goto_3

    .line 554
    .line 555
    :cond_22
    sget-object v1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->MAIL:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    .line 556
    .line 557
    .line 558
    invoke-virtual {v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    .line 559
    move-result-object v1

    .line 560
    .line 561
    .line 562
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 563
    move-result v1

    .line 564
    .line 565
    if-eqz v1, :cond_23

    .line 566
    .line 567
    sget v0, Lcom/sumsub/sns/R$drawable;->sns_ic_email:I

    .line 568
    .line 569
    goto/16 :goto_3

    .line 570
    .line 571
    :cond_23
    sget-object v1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->BIN:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    .line 572
    .line 573
    .line 574
    invoke-virtual {v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    .line 575
    move-result-object v1

    .line 576
    .line 577
    .line 578
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 579
    move-result v1

    .line 580
    .line 581
    if-eqz v1, :cond_24

    .line 582
    .line 583
    sget v0, Lcom/sumsub/sns/R$drawable;->sns_ic_delete:I

    .line 584
    .line 585
    goto/16 :goto_3

    .line 586
    .line 587
    :cond_24
    sget-object v1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->CALENDAR:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    .line 588
    .line 589
    .line 590
    invoke-virtual {v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    .line 591
    move-result-object v1

    .line 592
    .line 593
    .line 594
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 595
    move-result v1

    .line 596
    .line 597
    if-eqz v1, :cond_25

    .line 598
    .line 599
    sget v0, Lcom/sumsub/sns/R$drawable;->sns_ic_calendar:I

    .line 600
    .line 601
    goto/16 :goto_3

    .line 602
    .line 603
    :cond_25
    sget-object v1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->ATTACHMENT:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    .line 604
    .line 605
    .line 606
    invoke-virtual {v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    .line 607
    move-result-object v1

    .line 608
    .line 609
    .line 610
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 611
    move-result v1

    .line 612
    .line 613
    if-eqz v1, :cond_26

    .line 614
    .line 615
    sget v0, Lcom/sumsub/sns/R$drawable;->sns_ic_add_image:I

    .line 616
    .line 617
    goto/16 :goto_3

    .line 618
    .line 619
    :cond_26
    sget-object v1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->IMAGE:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    .line 620
    .line 621
    .line 622
    invoke-virtual {v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    .line 623
    move-result-object v1

    .line 624
    .line 625
    .line 626
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 627
    move-result v1

    .line 628
    .line 629
    if-eqz v1, :cond_27

    .line 630
    .line 631
    sget v0, Lcom/sumsub/sns/R$drawable;->sns_ic_image:I

    .line 632
    .line 633
    goto/16 :goto_3

    .line 634
    .line 635
    :cond_27
    sget-object v1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->SEARCH:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    .line 636
    .line 637
    .line 638
    invoke-virtual {v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    .line 639
    move-result-object v1

    .line 640
    .line 641
    .line 642
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 643
    move-result v1

    .line 644
    .line 645
    if-eqz v1, :cond_28

    .line 646
    .line 647
    sget v0, Lcom/sumsub/sns/R$drawable;->sns_ic_search:I

    .line 648
    .line 649
    goto/16 :goto_3

    .line 650
    .line 651
    :cond_28
    sget-object v1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->NOTIFY:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    .line 652
    .line 653
    .line 654
    invoke-virtual {v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    .line 655
    move-result-object v1

    .line 656
    .line 657
    .line 658
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 659
    move-result v1

    .line 660
    .line 661
    if-eqz v1, :cond_29

    .line 662
    .line 663
    sget v0, Lcom/sumsub/sns/R$drawable;->sns_ic_notify:I

    .line 664
    .line 665
    goto/16 :goto_3

    .line 666
    .line 667
    :cond_29
    sget-object v1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->TAKE_PHOTO:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    .line 668
    .line 669
    .line 670
    invoke-virtual {v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    .line 671
    move-result-object v1

    .line 672
    .line 673
    .line 674
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 675
    move-result v1

    .line 676
    .line 677
    if-eqz v1, :cond_2a

    .line 678
    .line 679
    sget v0, Lcom/sumsub/sns/R$drawable;->sns_ic_capture:I

    .line 680
    .line 681
    goto/16 :goto_3

    .line 682
    .line 683
    :cond_2a
    sget-object v1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->LOCATION_ON:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    .line 684
    .line 685
    .line 686
    invoke-virtual {v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    .line 687
    move-result-object v1

    .line 688
    .line 689
    .line 690
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 691
    move-result v1

    .line 692
    .line 693
    if-eqz v1, :cond_2b

    .line 694
    .line 695
    sget v0, Lcom/sumsub/sns/R$drawable;->sns_ic_location_on_outline:I

    .line 696
    .line 697
    goto/16 :goto_3

    .line 698
    .line 699
    :cond_2b
    sget-object v1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->LOCATION_OFF:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    .line 700
    .line 701
    .line 702
    invoke-virtual {v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    .line 703
    move-result-object v1

    .line 704
    .line 705
    .line 706
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 707
    move-result v1

    .line 708
    .line 709
    if-eqz v1, :cond_2c

    .line 710
    .line 711
    sget v0, Lcom/sumsub/sns/R$drawable;->sns_ic_location_off_outline:I

    .line 712
    .line 713
    goto/16 :goto_3

    .line 714
    .line 715
    :cond_2c
    sget-object v1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->COUNTRY_OTHER:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    .line 716
    .line 717
    .line 718
    invoke-virtual {v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    .line 719
    move-result-object v1

    .line 720
    .line 721
    .line 722
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 723
    move-result v1

    .line 724
    .line 725
    if-eqz v1, :cond_2d

    .line 726
    .line 727
    sget v0, Lcom/sumsub/sns/R$drawable;->sns_ic_flag_placeholder:I

    .line 728
    .line 729
    goto/16 :goto_3

    .line 730
    .line 731
    :cond_2d
    sget-object v1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->PICTURE_AGREEMENT:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    .line 732
    .line 733
    .line 734
    invoke-virtual {v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    .line 735
    move-result-object v1

    .line 736
    .line 737
    .line 738
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 739
    move-result v1

    .line 740
    .line 741
    if-eqz v1, :cond_2e

    .line 742
    .line 743
    sget v0, Lcom/sumsub/sns/R$drawable;->sns_ic_earth:I

    .line 744
    .line 745
    goto/16 :goto_3

    .line 746
    .line 747
    :cond_2e
    sget-object v1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->ICON_ID:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    .line 748
    .line 749
    .line 750
    invoke-virtual {v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    .line 751
    move-result-object v1

    .line 752
    .line 753
    .line 754
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 755
    move-result v1

    .line 756
    .line 757
    if-eqz v1, :cond_2f

    .line 758
    .line 759
    sget v0, Lcom/sumsub/sns/R$drawable;->sns_ic_iddoc_id_card:I

    .line 760
    .line 761
    goto/16 :goto_3

    .line 762
    .line 763
    :cond_2f
    sget-object v1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->ICON_HOME:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    .line 764
    .line 765
    .line 766
    invoke-virtual {v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    .line 767
    move-result-object v1

    .line 768
    .line 769
    .line 770
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 771
    move-result v1

    .line 772
    .line 773
    if-eqz v1, :cond_30

    .line 774
    .line 775
    sget v0, Lcom/sumsub/sns/R$drawable;->sns_ic_iddoc_residence_permit:I

    .line 776
    .line 777
    goto/16 :goto_3

    .line 778
    .line 779
    :cond_30
    sget-object v1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->ICON_PERSONS:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    .line 780
    .line 781
    .line 782
    invoke-virtual {v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    .line 783
    move-result-object v1

    .line 784
    .line 785
    .line 786
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 787
    move-result v1

    .line 788
    .line 789
    if-eqz v1, :cond_31

    .line 790
    .line 791
    sget v0, Lcom/sumsub/sns/R$drawable;->sns_ic_persons:I

    .line 792
    .line 793
    goto/16 :goto_3

    .line 794
    .line 795
    :cond_31
    sget-object v1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->ICON_LIGHT:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    .line 796
    .line 797
    .line 798
    invoke-virtual {v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    .line 799
    move-result-object v1

    .line 800
    .line 801
    .line 802
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 803
    move-result v1

    .line 804
    .line 805
    if-eqz v1, :cond_32

    .line 806
    .line 807
    sget v0, Lcom/sumsub/sns/R$drawable;->sns_ic_light:I

    .line 808
    .line 809
    goto/16 :goto_3

    .line 810
    .line 811
    :cond_32
    sget-object v1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->ICON_CAMERA:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    .line 812
    .line 813
    .line 814
    invoke-virtual {v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    .line 815
    move-result-object v1

    .line 816
    .line 817
    .line 818
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 819
    move-result v1

    .line 820
    .line 821
    if-eqz v1, :cond_33

    .line 822
    .line 823
    sget v0, Lcom/sumsub/sns/R$drawable;->sns_ic_camera:I

    .line 824
    .line 825
    goto/16 :goto_3

    .line 826
    .line 827
    :cond_33
    sget-object v1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->ICON_WIFI:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    .line 828
    .line 829
    .line 830
    invoke-virtual {v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    .line 831
    move-result-object v1

    .line 832
    .line 833
    .line 834
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 835
    move-result v1

    .line 836
    .line 837
    if-eqz v1, :cond_34

    .line 838
    .line 839
    sget v0, Lcom/sumsub/sns/R$drawable;->sns_ic_wifi:I

    .line 840
    .line 841
    goto/16 :goto_3

    .line 842
    .line 843
    :cond_34
    sget-object v1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->WARNING:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    .line 844
    .line 845
    .line 846
    invoke-virtual {v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    .line 847
    move-result-object v1

    .line 848
    .line 849
    .line 850
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 851
    move-result v1

    .line 852
    .line 853
    if-eqz v1, :cond_35

    .line 854
    .line 855
    sget v0, Lcom/sumsub/sns/R$drawable;->sns_ic_warning_triangle:I

    .line 856
    .line 857
    goto/16 :goto_3

    .line 858
    .line 859
    :cond_35
    sget-object v1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->ROTATE_CW:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    .line 860
    .line 861
    .line 862
    invoke-virtual {v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    .line 863
    move-result-object v1

    .line 864
    .line 865
    .line 866
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 867
    move-result v1

    .line 868
    .line 869
    if-eqz v1, :cond_36

    .line 870
    .line 871
    sget v0, Lcom/sumsub/sns/R$drawable;->sns_ic_rotate_cw:I

    .line 872
    .line 873
    goto/16 :goto_3

    .line 874
    .line 875
    :cond_36
    sget-object v1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->ROTATE_CCW:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    .line 876
    .line 877
    .line 878
    invoke-virtual {v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    .line 879
    move-result-object v1

    .line 880
    .line 881
    .line 882
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 883
    move-result v1

    .line 884
    .line 885
    if-eqz v1, :cond_37

    .line 886
    .line 887
    sget v0, Lcom/sumsub/sns/R$drawable;->sns_ic_rotate_ccw:I

    .line 888
    .line 889
    goto/16 :goto_3

    .line 890
    .line 891
    :cond_37
    sget-object v1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->FLIP:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    .line 892
    .line 893
    .line 894
    invoke-virtual {v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    .line 895
    move-result-object v1

    .line 896
    .line 897
    .line 898
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 899
    move-result v1

    .line 900
    .line 901
    if-eqz v1, :cond_38

    .line 902
    .line 903
    sget v0, Lcom/sumsub/sns/R$drawable;->sns_flip:I

    .line 904
    .line 905
    goto/16 :goto_3

    .line 906
    .line 907
    :cond_38
    sget-object v1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->SUCCESS_CHECK:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    .line 908
    .line 909
    .line 910
    invoke-virtual {v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    .line 911
    move-result-object v1

    .line 912
    .line 913
    .line 914
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 915
    move-result v1

    .line 916
    .line 917
    if-eqz v1, :cond_39

    .line 918
    .line 919
    sget v0, Lcom/sumsub/sns/R$drawable;->sns_ic_success_check:I

    .line 920
    .line 921
    goto/16 :goto_3

    .line 922
    .line 923
    :cond_39
    sget-object v1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->ICON_LAUNCH:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    .line 924
    .line 925
    .line 926
    invoke-virtual {v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    .line 927
    move-result-object v1

    .line 928
    .line 929
    .line 930
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 931
    move-result v1

    .line 932
    .line 933
    if-eqz v1, :cond_3a

    .line 934
    .line 935
    sget v0, Lcom/sumsub/sns/R$drawable;->sns_ic_launch:I

    .line 936
    .line 937
    goto/16 :goto_3

    .line 938
    .line 939
    :cond_3a
    sget-object v1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->ICON_WORDLESS_FAILURE:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    .line 940
    .line 941
    .line 942
    invoke-virtual {v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    .line 943
    move-result-object v1

    .line 944
    .line 945
    .line 946
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 947
    move-result v1

    .line 948
    .line 949
    if-eqz v1, :cond_3b

    .line 950
    .line 951
    sget v0, Lcom/sumsub/sns/R$drawable;->sns_ic_error_robot:I

    .line 952
    .line 953
    goto/16 :goto_3

    .line 954
    .line 955
    :cond_3b
    sget-object v1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->SUCCESS_FILLED:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    .line 956
    .line 957
    .line 958
    invoke-virtual {v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    .line 959
    move-result-object v1

    .line 960
    .line 961
    .line 962
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 963
    move-result v1

    .line 964
    .line 965
    if-eqz v1, :cond_3c

    .line 966
    .line 967
    sget v0, Lcom/sumsub/sns/R$drawable;->sns_ic_success_filled:I

    .line 968
    .line 969
    goto/16 :goto_3

    .line 970
    .line 971
    :cond_3c
    sget-object v1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->FAILURE_FILLED:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    .line 972
    .line 973
    .line 974
    invoke-virtual {v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    .line 975
    move-result-object v1

    .line 976
    .line 977
    .line 978
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 979
    move-result v1

    .line 980
    .line 981
    if-eqz v1, :cond_3d

    .line 982
    .line 983
    sget v0, Lcom/sumsub/sns/R$drawable;->sns_ic_failure_filled:I

    .line 984
    .line 985
    goto/16 :goto_3

    .line 986
    .line 987
    :cond_3d
    sget-object v1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->LOCK:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    .line 988
    .line 989
    .line 990
    invoke-virtual {v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    .line 991
    move-result-object v1

    .line 992
    .line 993
    .line 994
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 995
    move-result v1

    .line 996
    .line 997
    if-eqz v1, :cond_3e

    .line 998
    .line 999
    sget v0, Lcom/sumsub/sns/R$drawable;->sns_ic_lock:I

    .line 1000
    .line 1001
    goto/16 :goto_3

    .line 1002
    .line 1003
    :cond_3e
    sget-object v1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->ICON_PERSON:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    .line 1004
    .line 1005
    .line 1006
    invoke-virtual {v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    .line 1007
    move-result-object v1

    .line 1008
    .line 1009
    .line 1010
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1011
    move-result v1

    .line 1012
    .line 1013
    if-eqz v1, :cond_3f

    .line 1014
    .line 1015
    sget v0, Lcom/sumsub/sns/R$drawable;->sns_ic_person:I

    .line 1016
    .line 1017
    goto/16 :goto_3

    .line 1018
    .line 1019
    :cond_3f
    sget-object v1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->GALLERY_SMALL:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    .line 1020
    .line 1021
    .line 1022
    invoke-virtual {v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    .line 1023
    move-result-object v1

    .line 1024
    .line 1025
    .line 1026
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1027
    move-result v1

    .line 1028
    .line 1029
    if-eqz v1, :cond_40

    .line 1030
    .line 1031
    sget v0, Lcom/sumsub/sns/R$drawable;->sns_ic_gallery_small:I

    .line 1032
    .line 1033
    goto/16 :goto_3

    .line 1034
    .line 1035
    :cond_40
    sget-object v1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSEidIcons;->PIN:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSEidIcons;

    .line 1036
    .line 1037
    .line 1038
    invoke-virtual {v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSEidIcons;->getImageName()Ljava/lang/String;

    .line 1039
    move-result-object v1

    .line 1040
    .line 1041
    .line 1042
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1043
    move-result v1

    .line 1044
    .line 1045
    if-eqz v1, :cond_41

    .line 1046
    .line 1047
    sget v0, Lcom/sumsub/sns/R$drawable;->sns_ic_pin:I

    .line 1048
    .line 1049
    goto/16 :goto_3

    .line 1050
    .line 1051
    :cond_41
    sget-object v1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSEidIcons;->DONE:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSEidIcons;

    .line 1052
    .line 1053
    .line 1054
    invoke-virtual {v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSEidIcons;->getImageName()Ljava/lang/String;

    .line 1055
    move-result-object v1

    .line 1056
    .line 1057
    .line 1058
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1059
    move-result v1

    .line 1060
    .line 1061
    if-eqz v1, :cond_42

    .line 1062
    .line 1063
    sget v0, Lcom/sumsub/sns/R$drawable;->sns_ic_success:I

    .line 1064
    .line 1065
    goto/16 :goto_3

    .line 1066
    .line 1067
    :cond_42
    sget-object v1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSEidIcons;->ID_CARD:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSEidIcons;

    .line 1068
    .line 1069
    .line 1070
    invoke-virtual {v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSEidIcons;->getImageName()Ljava/lang/String;

    .line 1071
    move-result-object v1

    .line 1072
    .line 1073
    .line 1074
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1075
    move-result v1

    .line 1076
    .line 1077
    if-eqz v1, :cond_43

    .line 1078
    .line 1079
    sget v0, Lcom/sumsub/sns/R$drawable;->sns_ic_id_hand:I

    .line 1080
    .line 1081
    goto/16 :goto_3

    .line 1082
    .line 1083
    :cond_43
    sget-object v1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSEidIcons;->CAN:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSEidIcons;

    .line 1084
    .line 1085
    .line 1086
    invoke-virtual {v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSEidIcons;->getImageName()Ljava/lang/String;

    .line 1087
    move-result-object v1

    .line 1088
    .line 1089
    .line 1090
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1091
    move-result v1

    .line 1092
    .line 1093
    if-eqz v1, :cond_44

    .line 1094
    .line 1095
    sget v0, Lcom/sumsub/sns/R$drawable;->sns_ic_eid_can:I

    .line 1096
    .line 1097
    goto/16 :goto_3

    .line 1098
    .line 1099
    :cond_44
    sget-object v1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSRestrictionsIcons;->VPN:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSRestrictionsIcons;

    .line 1100
    .line 1101
    .line 1102
    invoke-virtual {v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSRestrictionsIcons;->getImageName()Ljava/lang/String;

    .line 1103
    move-result-object v1

    .line 1104
    .line 1105
    .line 1106
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1107
    move-result v1

    .line 1108
    .line 1109
    if-eqz v1, :cond_45

    .line 1110
    .line 1111
    sget v0, Lcom/sumsub/sns/R$drawable;->sns_ic_restriction_vpn:I

    .line 1112
    .line 1113
    goto/16 :goto_3

    .line 1114
    .line 1115
    :cond_45
    sget-object v1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSRestrictionsIcons;->DEFAULT:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSRestrictionsIcons;

    .line 1116
    .line 1117
    .line 1118
    invoke-virtual {v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSRestrictionsIcons;->getImageName()Ljava/lang/String;

    .line 1119
    move-result-object v1

    .line 1120
    .line 1121
    .line 1122
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1123
    move-result v1

    .line 1124
    .line 1125
    if-eqz v1, :cond_46

    .line 1126
    .line 1127
    sget v0, Lcom/sumsub/sns/R$drawable;->sns_ic_fatal:I

    .line 1128
    goto :goto_3

    .line 1129
    .line 1130
    :cond_46
    sget-object v1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSPaymentMethodIcons;->BANK_CARD:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSPaymentMethodIcons;

    .line 1131
    .line 1132
    .line 1133
    invoke-virtual {v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSPaymentMethodIcons;->getImageName()Ljava/lang/String;

    .line 1134
    move-result-object v1

    .line 1135
    .line 1136
    .line 1137
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1138
    move-result v1

    .line 1139
    .line 1140
    if-eqz v1, :cond_47

    .line 1141
    .line 1142
    sget v0, Lcom/sumsub/sns/R$drawable;->sns_ic_intro_payment_methods_bank_card:I

    .line 1143
    goto :goto_3

    .line 1144
    .line 1145
    .line 1146
    :cond_47
    invoke-static {v0, v2, v5, v6, v7}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 1147
    move-result v1

    .line 1148
    .line 1149
    if-eqz v1, :cond_48

    .line 1150
    .line 1151
    sget v0, Lcom/sumsub/sns/R$drawable;->sns_ic_iddoc_id_card:I

    .line 1152
    goto :goto_3

    .line 1153
    .line 1154
    :cond_48
    const-string v1, "Flag/"

    .line 1155
    .line 1156
    .line 1157
    invoke-static {v0, v1, v5, v6, v7}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 1158
    move-result v1

    .line 1159
    .line 1160
    if-eqz v1, :cond_4a

    .line 1161
    .line 1162
    .line 1163
    invoke-static {v0, v4, v7, v6, v7}, Lkotlin/text/StringsKt;->substringAfter$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 1164
    move-result-object v0

    .line 1165
    .line 1166
    sget-object v1, Lcom/sumsub/sns/core/common/a;->a:Ljava/util/Map;

    .line 1167
    .line 1168
    .line 1169
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1170
    move-result-object v1

    .line 1171
    .line 1172
    check-cast v1, Ljava/lang/Integer;

    .line 1173
    .line 1174
    if-eqz v1, :cond_49

    .line 1175
    .line 1176
    .line 1177
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1178
    move-result v0

    .line 1179
    goto :goto_3

    .line 1180
    .line 1181
    :cond_49
    sget v1, Lcom/sumsub/sns/core/common/a;->b:I

    .line 1182
    .line 1183
    sget-object v9, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    .line 1184
    .line 1185
    .line 1186
    invoke-static {p0}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    .line 1187
    move-result-object v10

    .line 1188
    .line 1189
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1190
    .line 1191
    .line 1192
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 1193
    .line 1194
    const-string v3, "Unknown flag: "

    .line 1195
    .line 1196
    .line 1197
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1198
    .line 1199
    .line 1200
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1201
    .line 1202
    .line 1203
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1204
    move-result-object v11

    .line 1205
    const/4 v13, 0x4

    .line 1206
    const/4 v14, 0x0

    .line 1207
    const/4 v12, 0x0

    .line 1208
    .line 1209
    .line 1210
    invoke-static/range {v9 .. v14}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->e$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 1211
    move v0, v1

    .line 1212
    goto :goto_3

    .line 1213
    .line 1214
    .line 1215
    :cond_4a
    invoke-static {v0, v3, v5, v6, v7}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 1216
    move-result v1

    .line 1217
    .line 1218
    if-eqz v1, :cond_4b

    .line 1219
    .line 1220
    .line 1221
    invoke-static {v0, v4, v7, v6, v7}, Lkotlin/text/StringsKt;->substringAfter$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 1222
    move-result-object v0

    .line 1223
    .line 1224
    new-instance v1, Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 1225
    .line 1226
    .line 1227
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/features/data/model/common/X;-><init>(Ljava/lang/String;)V

    .line 1228
    .line 1229
    .line 1230
    invoke-direct {p0, v1}, Lcom/sumsub/sns/core/data/listener/SNSDefaultIconHandler;->stepIcon(Lcom/sumsub/sns/internal/features/data/model/common/X;)I

    .line 1231
    move-result v0

    .line 1232
    goto :goto_3

    .line 1233
    :cond_4b
    move v0, v8

    .line 1234
    .line 1235
    .line 1236
    :goto_3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1237
    move-result-object v1

    .line 1238
    .line 1239
    if-eq v0, v8, :cond_4c

    .line 1240
    goto :goto_4

    .line 1241
    :cond_4c
    move-object v1, v7

    .line 1242
    .line 1243
    :goto_4
    if-eqz v1, :cond_4d

    .line 1244
    .line 1245
    .line 1246
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 1247
    move-result v0

    .line 1248
    .line 1249
    .line 1250
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1251
    move-result-object v1

    .line 1252
    .line 1253
    .line 1254
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 1255
    move-result-object v2

    .line 1256
    .line 1257
    .line 1258
    invoke-static {v1, v0, v2}, Landroidx/core/content/res/ResourcesCompat;->getDrawable(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 1259
    move-result-object v0

    .line 1260
    .line 1261
    if-eqz v0, :cond_4d

    .line 1262
    .line 1263
    .line 1264
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 1265
    move-result-object v1

    .line 1266
    .line 1267
    .line 1268
    invoke-static {v0, v1}, Landroidx/core/graphics/drawable/DrawableCompat;->applyTheme(Landroid/graphics/drawable/Drawable;Landroid/content/res/Resources$Theme;)V

    .line 1269
    return-object v0

    .line 1270
    :cond_4d
    return-object v7
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
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
.end method
