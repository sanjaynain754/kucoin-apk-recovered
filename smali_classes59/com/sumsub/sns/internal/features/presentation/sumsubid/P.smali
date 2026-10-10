.class public final synthetic Lcom/sumsub/sns/internal/features/presentation/sumsubid/P;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final a:Lcom/sumsub/sns/internal/features/presentation/sumsubid/P;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/P;->a:Lcom/sumsub/sns/internal/features/presentation/sumsubid/P;

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
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    .line 2
    const-string v4, "bind(Landroid/view/View;)Lcom/sumsub/sns/databinding/SnsSumsubidLearnMoreBottomSheetBinding;"

    .line 3
    const/4 v5, 0x0

    .line 4
    const/4 v1, 0x1

    .line 5
    .line 6
    const-class v2, Lcom/sumsub/sns/databinding/J;

    .line 7
    .line 8
    const-string v3, "bind"

    .line 9
    move-object v0, p0

    .line 10
    .line 11
    .line 12
    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    .line 2
    check-cast p1, Landroid/view/View;

    .line 3
    .line 4
    sget v0, Lcom/sumsub/sns/R$id;->sns_sumsubid_learn_more_banner:I

    .line 5
    .line 6
    .line 7
    invoke-static {p1, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 8
    move-result-object v1

    .line 9
    move-object v4, v1

    .line 10
    .line 11
    check-cast v4, Lcom/sumsub/sns/core/widget/SNSAspectRatioImageView;

    .line 12
    .line 13
    if-eqz v4, :cond_0

    .line 14
    .line 15
    sget v0, Lcom/sumsub/sns/R$id;->sns_sumsubid_learn_more_benefits:I

    .line 16
    .line 17
    .line 18
    invoke-static {p1, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 19
    move-result-object v1

    .line 20
    move-object v5, v1

    .line 21
    .line 22
    check-cast v5, Landroid/widget/LinearLayout;

    .line 23
    .line 24
    if-eqz v5, :cond_0

    .line 25
    .line 26
    sget v0, Lcom/sumsub/sns/R$id;->sns_sumsubid_learn_more_button:I

    .line 27
    .line 28
    .line 29
    invoke-static {p1, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 30
    move-result-object v1

    .line 31
    move-object v6, v1

    .line 32
    .line 33
    check-cast v6, Lcom/sumsub/sns/core/widget/SNSPrimaryButton;

    .line 34
    .line 35
    if-eqz v6, :cond_0

    .line 36
    .line 37
    sget v0, Lcom/sumsub/sns/R$id;->sns_sumsubid_learn_more_handle:I

    .line 38
    .line 39
    .line 40
    invoke-static {p1, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 41
    move-result-object v1

    .line 42
    .line 43
    check-cast v1, Lcom/sumsub/sns/core/widget/SNSBottomSheetHandleView;

    .line 44
    .line 45
    if-eqz v1, :cond_0

    .line 46
    .line 47
    sget v0, Lcom/sumsub/sns/R$id;->sns_sumsubid_learn_more_scroll:I

    .line 48
    .line 49
    .line 50
    invoke-static {p1, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 51
    move-result-object v1

    .line 52
    .line 53
    check-cast v1, Landroidx/core/widget/NestedScrollView;

    .line 54
    .line 55
    if-eqz v1, :cond_0

    .line 56
    .line 57
    sget v0, Lcom/sumsub/sns/R$id;->sns_sumsubid_learn_more_subtitle:I

    .line 58
    .line 59
    .line 60
    invoke-static {p1, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 61
    move-result-object v1

    .line 62
    move-object v7, v1

    .line 63
    .line 64
    check-cast v7, Lcom/sumsub/sns/core/widget/SNSSubtitle1TextView;

    .line 65
    .line 66
    if-eqz v7, :cond_0

    .line 67
    .line 68
    sget v0, Lcom/sumsub/sns/R$id;->sns_sumsubid_learn_more_title:I

    .line 69
    .line 70
    .line 71
    invoke-static {p1, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 72
    move-result-object v1

    .line 73
    move-object v8, v1

    .line 74
    .line 75
    check-cast v8, Lcom/sumsub/sns/core/widget/SNSH1TextView;

    .line 76
    .line 77
    if-eqz v8, :cond_0

    .line 78
    .line 79
    new-instance v2, Lcom/sumsub/sns/databinding/J;

    .line 80
    move-object v3, p1

    .line 81
    .line 82
    check-cast v3, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 83
    .line 84
    .line 85
    invoke-direct/range {v2 .. v8}, Lcom/sumsub/sns/databinding/J;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Lcom/sumsub/sns/core/widget/SNSAspectRatioImageView;Landroid/widget/LinearLayout;Lcom/sumsub/sns/core/widget/SNSPrimaryButton;Lcom/sumsub/sns/core/widget/SNSSubtitle1TextView;Lcom/sumsub/sns/core/widget/SNSH1TextView;)V

    .line 86
    return-object v2

    .line 87
    .line 88
    .line 89
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 90
    move-result-object p1

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 94
    move-result-object p1

    .line 95
    .line 96
    new-instance v0, Ljava/lang/NullPointerException;

    .line 97
    .line 98
    const-string v1, "Missing required view with ID: "

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 102
    move-result-object p1

    .line 103
    .line 104
    .line 105
    invoke-direct {v0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 106
    throw v0
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
.end method
