.class public final Lcom/sumsub/sns/core/widget/SNSAlertDialogBuilder$Companion;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sumsub/sns/core/widget/SNSAlertDialogBuilder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0011\u0010\u0004\u001a\u00020\u0005*\u00020\u0007H\u0007\u00a2\u0006\u0002\u0008\u0008J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u000e\u0010\n\u001a\u0004\u0018\u00010\u000b*\u00020\u0007H\u0002J\u000e\u0010\u000c\u001a\u0004\u0018\u00010\u000b*\u00020\u0007H\u0002\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/sumsub/sns/core/widget/SNSAlertDialogBuilder$Companion;",
        "",
        "<init>",
        "()V",
        "showWithTheme",
        "",
        "dialog",
        "Landroidx/appcompat/app/AlertDialog;",
        "showWithThemeExtension",
        "setDialogColors",
        "getMessageTextView",
        "Landroid/widget/TextView;",
        "getTitleTextView",
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
        "SMAP\nSNSAlertDialogBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSAlertDialogBuilder.kt\ncom/sumsub/sns/core/widget/SNSAlertDialogBuilder$Companion\n+ 2 ThemeHelper.kt\ncom/sumsub/sns/core/presentation/helper/ThemeHelper\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,154:1\n22#2:155\n1#3:156\n1#3:157\n*S KotlinDebug\n*F\n+ 1 SNSAlertDialogBuilder.kt\ncom/sumsub/sns/core/widget/SNSAlertDialogBuilder$Companion\n*L\n110#1:155\n110#1:156\n*E\n"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/sumsub/sns/core/widget/SNSAlertDialogBuilder$Companion;-><init>()V

    return-void
.end method

.method public static final synthetic access$setDialogColors(Lcom/sumsub/sns/core/widget/SNSAlertDialogBuilder$Companion;Landroidx/appcompat/app/AlertDialog;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/sumsub/sns/core/widget/SNSAlertDialogBuilder$Companion;->setDialogColors(Landroidx/appcompat/app/AlertDialog;)V

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
.end method

.method private final getMessageTextView(Landroidx/appcompat/app/AlertDialog;)Landroid/widget/TextView;
    .locals 1

    .line 1
    .line 2
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 3
    .line 4
    .line 5
    const v0, 0x102000b

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    check-cast p1, Landroid/widget/TextView;

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception p1

    .line 18
    .line 19
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 20
    .line 21
    .line 22
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 23
    move-result-object p1

    .line 24
    .line 25
    .line 26
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    move-result-object p1

    .line 28
    .line 29
    .line 30
    :goto_0
    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 31
    move-result v0

    .line 32
    .line 33
    if-eqz v0, :cond_0

    .line 34
    const/4 p1, 0x0

    .line 35
    .line 36
    :cond_0
    check-cast p1, Landroid/widget/TextView;

    .line 37
    return-object p1
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
.end method

.method private final getTitleTextView(Landroidx/appcompat/app/AlertDialog;)Landroid/widget/TextView;
    .locals 1

    .line 1
    .line 2
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 3
    .line 4
    sget v0, Lcom/google/android/material/R$id;->alertTitle:I

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    .line 8
    move-result-object p1

    .line 9
    .line 10
    check-cast p1, Landroid/widget/TextView;

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    .line 18
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 19
    .line 20
    .line 21
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 22
    move-result-object p1

    .line 23
    .line 24
    .line 25
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    move-result-object p1

    .line 27
    .line 28
    .line 29
    :goto_0
    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 30
    move-result v0

    .line 31
    .line 32
    if-eqz v0, :cond_0

    .line 33
    const/4 p1, 0x0

    .line 34
    .line 35
    :cond_0
    check-cast p1, Landroid/widget/TextView;

    .line 36
    return-object p1
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
.end method

.method private final setDialogColors(Landroidx/appcompat/app/AlertDialog;)V
    .locals 5

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/common/k0;->getCustomization()Lcom/sumsub/sns/core/theme/SNSJsonCustomization;

    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-interface {v0}, Lcom/sumsub/sns/core/theme/SNSJsonCustomization;->getTheme()Lcom/sumsub/sns/core/theme/SNSCustomizationTheme;

    .line 13
    move-result-object v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v0, v1

    .line 16
    .line 17
    :goto_0
    instance-of v2, v0, Lcom/sumsub/sns/internal/core/presentation/theme/p;

    .line 18
    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/theme/p;

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move-object v0, v1

    .line 24
    .line 25
    :goto_1
    if-eqz v0, :cond_a

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 29
    move-result-object v2

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 33
    move-result-object v2

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 37
    move-result-object v2

    .line 38
    .line 39
    .line 40
    invoke-static {v2}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/content/res/Configuration;)Z

    .line 41
    move-result v2

    .line 42
    .line 43
    sget-object v3, Lcom/sumsub/sns/core/theme/SNSColorElement;->ALERT_TINT:Lcom/sumsub/sns/core/theme/SNSColorElement;

    .line 44
    .line 45
    iget-object v4, v0, Lcom/sumsub/sns/internal/core/presentation/theme/p;->c:Ljava/util/Map;

    .line 46
    .line 47
    if-eqz v4, :cond_3

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3}, Lcom/sumsub/sns/core/theme/SNSColorElement;->getValue()Ljava/lang/String;

    .line 51
    move-result-object v3

    .line 52
    .line 53
    .line 54
    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    move-result-object v3

    .line 56
    .line 57
    check-cast v3, Lcom/sumsub/sns/internal/core/presentation/theme/c;

    .line 58
    .line 59
    if-eqz v3, :cond_3

    .line 60
    .line 61
    if-eqz v2, :cond_2

    .line 62
    .line 63
    iget-object v3, v3, Lcom/sumsub/sns/internal/core/presentation/theme/c;->a:Ljava/lang/Integer;

    .line 64
    goto :goto_2

    .line 65
    .line 66
    :cond_2
    iget-object v3, v3, Lcom/sumsub/sns/internal/core/presentation/theme/c;->b:Ljava/lang/Integer;

    .line 67
    goto :goto_2

    .line 68
    :cond_3
    move-object v3, v1

    .line 69
    .line 70
    :goto_2
    if-eqz v3, :cond_6

    .line 71
    .line 72
    .line 73
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 74
    move-result v3

    .line 75
    const/4 v4, -0x1

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1, v4}, Landroidx/appcompat/app/AlertDialog;->getButton(I)Landroid/widget/Button;

    .line 79
    move-result-object v4

    .line 80
    .line 81
    if-eqz v4, :cond_4

    .line 82
    .line 83
    .line 84
    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 85
    :cond_4
    const/4 v4, -0x2

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1, v4}, Landroidx/appcompat/app/AlertDialog;->getButton(I)Landroid/widget/Button;

    .line 89
    move-result-object v4

    .line 90
    .line 91
    if-eqz v4, :cond_5

    .line 92
    .line 93
    .line 94
    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 95
    :cond_5
    const/4 v4, -0x3

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1, v4}, Landroidx/appcompat/app/AlertDialog;->getButton(I)Landroid/widget/Button;

    .line 99
    move-result-object v4

    .line 100
    .line 101
    if-eqz v4, :cond_6

    .line 102
    .line 103
    .line 104
    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 105
    .line 106
    :cond_6
    sget-object v3, Lcom/sumsub/sns/core/theme/SNSColorElement;->CONTENT_STRONG:Lcom/sumsub/sns/core/theme/SNSColorElement;

    .line 107
    .line 108
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/theme/p;->c:Ljava/util/Map;

    .line 109
    .line 110
    if-eqz v0, :cond_8

    .line 111
    .line 112
    .line 113
    invoke-virtual {v3}, Lcom/sumsub/sns/core/theme/SNSColorElement;->getValue()Ljava/lang/String;

    .line 114
    move-result-object v3

    .line 115
    .line 116
    .line 117
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    move-result-object v0

    .line 119
    .line 120
    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/theme/c;

    .line 121
    .line 122
    if-eqz v0, :cond_8

    .line 123
    .line 124
    if-eqz v2, :cond_7

    .line 125
    .line 126
    iget-object v1, v0, Lcom/sumsub/sns/internal/core/presentation/theme/c;->a:Ljava/lang/Integer;

    .line 127
    goto :goto_3

    .line 128
    .line 129
    :cond_7
    iget-object v1, v0, Lcom/sumsub/sns/internal/core/presentation/theme/c;->b:Ljava/lang/Integer;

    .line 130
    .line 131
    :cond_8
    :goto_3
    if-eqz v1, :cond_a

    .line 132
    .line 133
    .line 134
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 135
    move-result v0

    .line 136
    .line 137
    sget-object v1, Lcom/sumsub/sns/core/widget/SNSAlertDialogBuilder;->Companion:Lcom/sumsub/sns/core/widget/SNSAlertDialogBuilder$Companion;

    .line 138
    .line 139
    .line 140
    invoke-direct {v1, p1}, Lcom/sumsub/sns/core/widget/SNSAlertDialogBuilder$Companion;->getTitleTextView(Landroidx/appcompat/app/AlertDialog;)Landroid/widget/TextView;

    .line 141
    move-result-object v2

    .line 142
    .line 143
    if-eqz v2, :cond_9

    .line 144
    .line 145
    .line 146
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 147
    .line 148
    .line 149
    :cond_9
    invoke-direct {v1, p1}, Lcom/sumsub/sns/core/widget/SNSAlertDialogBuilder$Companion;->getMessageTextView(Landroidx/appcompat/app/AlertDialog;)Landroid/widget/TextView;

    .line 150
    move-result-object p1

    .line 151
    .line 152
    if-eqz p1, :cond_a

    .line 153
    .line 154
    .line 155
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 156
    :cond_a
    return-void
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
.method public final showWithTheme(Landroidx/appcompat/app/AlertDialog;)V
    .locals 0
    .param p1    # Landroidx/appcompat/app/AlertDialog;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/sumsub/sns/core/widget/SNSAlertDialogBuilder$Companion;->setDialogColors(Landroidx/appcompat/app/AlertDialog;)V

    .line 7
    return-void
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
.end method

.method public final showWithThemeExtension(Landroidx/appcompat/app/AlertDialog;)V
    .locals 0
    .param p1    # Landroidx/appcompat/app/AlertDialog;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmName;
        name = "showWithThemeExtension"
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/core/widget/SNSAlertDialogBuilder$Companion;->showWithTheme(Landroidx/appcompat/app/AlertDialog;)V

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
.end method
