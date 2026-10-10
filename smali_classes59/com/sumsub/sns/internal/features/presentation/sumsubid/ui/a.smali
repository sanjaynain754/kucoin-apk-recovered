.class public final synthetic Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/a;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# static fields
.field public static final a:Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/a;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/a;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/a;->a:Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/a;

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
    const-string v4, "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcom/sumsub/sns/databinding/SnsSumsubidStateAgreementsBinding;"

    .line 3
    const/4 v5, 0x0

    .line 4
    const/4 v1, 0x2

    .line 5
    .line 6
    const-class v2, Lcom/sumsub/sns/databinding/K;

    .line 7
    .line 8
    const-string v3, "inflate"

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
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    .line 2
    check-cast p1, Landroid/view/LayoutInflater;

    .line 3
    move-object v1, p2

    .line 4
    .line 5
    check-cast v1, Landroid/view/ViewGroup;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    sget p2, Lcom/sumsub/sns/R$layout;->sns_sumsubid_state_agreements:I

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 13
    .line 14
    sget p1, Lcom/sumsub/sns/R$id;->sns_checkbox_user_consent:I

    .line 15
    .line 16
    .line 17
    invoke-static {v1, p1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 18
    move-result-object p2

    .line 19
    move-object v2, p2

    .line 20
    .line 21
    check-cast v2, Lcom/sumsub/sns/core/widget/SNSCheckBox;

    .line 22
    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    sget p1, Lcom/sumsub/sns/R$id;->sns_checkgroup:I

    .line 26
    .line 27
    .line 28
    invoke-static {v1, p1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 29
    move-result-object p2

    .line 30
    .line 31
    check-cast p2, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 32
    .line 33
    if-eqz p2, :cond_0

    .line 34
    .line 35
    sget p1, Lcom/sumsub/sns/R$id;->sns_divider:I

    .line 36
    .line 37
    .line 38
    invoke-static {v1, p1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 39
    move-result-object p2

    .line 40
    .line 41
    check-cast p2, Lcom/google/android/material/divider/MaterialDivider;

    .line 42
    .line 43
    if-eqz p2, :cond_0

    .line 44
    .line 45
    sget p1, Lcom/sumsub/sns/R$id;->sns_footer:I

    .line 46
    .line 47
    .line 48
    invoke-static {v1, p1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 49
    move-result-object p2

    .line 50
    move-object v3, p2

    .line 51
    .line 52
    check-cast v3, Lcom/sumsub/sns/core/widget/SNSTextView;

    .line 53
    .line 54
    if-eqz v3, :cond_0

    .line 55
    .line 56
    sget p1, Lcom/sumsub/sns/R$id;->sns_subtitle:I

    .line 57
    .line 58
    .line 59
    invoke-static {v1, p1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 60
    move-result-object p2

    .line 61
    move-object v4, p2

    .line 62
    .line 63
    check-cast v4, Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;

    .line 64
    .line 65
    if-eqz v4, :cond_0

    .line 66
    .line 67
    sget p1, Lcom/sumsub/sns/R$id;->sns_sumsubid_benefit_icon_instantly:I

    .line 68
    .line 69
    .line 70
    invoke-static {v1, p1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 71
    move-result-object p2

    .line 72
    move-object v5, p2

    .line 73
    .line 74
    check-cast v5, Landroid/widget/ImageView;

    .line 75
    .line 76
    if-eqz v5, :cond_0

    .line 77
    .line 78
    sget p1, Lcom/sumsub/sns/R$id;->sns_sumsubid_benefit_icon_optionally:I

    .line 79
    .line 80
    .line 81
    invoke-static {v1, p1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 82
    move-result-object p2

    .line 83
    move-object v6, p2

    .line 84
    .line 85
    check-cast v6, Landroid/widget/ImageView;

    .line 86
    .line 87
    if-eqz v6, :cond_0

    .line 88
    .line 89
    sget p1, Lcom/sumsub/sns/R$id;->sns_sumsubid_benefit_icon_securely:I

    .line 90
    .line 91
    .line 92
    invoke-static {v1, p1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 93
    move-result-object p2

    .line 94
    move-object v7, p2

    .line 95
    .line 96
    check-cast v7, Landroid/widget/ImageView;

    .line 97
    .line 98
    if-eqz v7, :cond_0

    .line 99
    .line 100
    sget p1, Lcom/sumsub/sns/R$id;->sns_sumsubid_benefit_title_instantly:I

    .line 101
    .line 102
    .line 103
    invoke-static {v1, p1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 104
    move-result-object p2

    .line 105
    move-object v8, p2

    .line 106
    .line 107
    check-cast v8, Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;

    .line 108
    .line 109
    if-eqz v8, :cond_0

    .line 110
    .line 111
    sget p1, Lcom/sumsub/sns/R$id;->sns_sumsubid_benefit_title_optionally:I

    .line 112
    .line 113
    .line 114
    invoke-static {v1, p1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 115
    move-result-object p2

    .line 116
    move-object v9, p2

    .line 117
    .line 118
    check-cast v9, Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;

    .line 119
    .line 120
    if-eqz v9, :cond_0

    .line 121
    .line 122
    sget p1, Lcom/sumsub/sns/R$id;->sns_sumsubid_benefit_title_securely:I

    .line 123
    .line 124
    .line 125
    invoke-static {v1, p1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 126
    move-result-object p2

    .line 127
    move-object v10, p2

    .line 128
    .line 129
    check-cast v10, Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;

    .line 130
    .line 131
    if-eqz v10, :cond_0

    .line 132
    .line 133
    sget p1, Lcom/sumsub/sns/R$id;->sns_text_user_consent:I

    .line 134
    .line 135
    .line 136
    invoke-static {v1, p1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 137
    move-result-object p2

    .line 138
    move-object v11, p2

    .line 139
    .line 140
    check-cast v11, Lcom/sumsub/sns/core/widget/SNSTextView;

    .line 141
    .line 142
    if-eqz v11, :cond_0

    .line 143
    .line 144
    sget p1, Lcom/sumsub/sns/R$id;->sns_title:I

    .line 145
    .line 146
    .line 147
    invoke-static {v1, p1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 148
    move-result-object p2

    .line 149
    move-object v12, p2

    .line 150
    .line 151
    check-cast v12, Lcom/sumsub/sns/core/widget/SNSH1TextView;

    .line 152
    .line 153
    if-eqz v12, :cond_0

    .line 154
    .line 155
    new-instance v0, Lcom/sumsub/sns/databinding/K;

    .line 156
    .line 157
    .line 158
    invoke-direct/range {v0 .. v12}, Lcom/sumsub/sns/databinding/K;-><init>(Landroid/view/ViewGroup;Lcom/sumsub/sns/core/widget/SNSCheckBox;Lcom/sumsub/sns/core/widget/SNSTextView;Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;Lcom/sumsub/sns/core/widget/SNSTextView;Lcom/sumsub/sns/core/widget/SNSH1TextView;)V

    .line 159
    return-object v0

    .line 160
    .line 161
    .line 162
    :cond_0
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 163
    move-result-object p2

    .line 164
    .line 165
    .line 166
    invoke-virtual {p2, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 167
    move-result-object p1

    .line 168
    .line 169
    new-instance p2, Ljava/lang/NullPointerException;

    .line 170
    .line 171
    const-string v0, "Missing required view with ID: "

    .line 172
    .line 173
    .line 174
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 175
    move-result-object p1

    .line 176
    .line 177
    .line 178
    invoke-direct {p2, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 179
    throw p2

    .line 180
    .line 181
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    .line 182
    .line 183
    .line 184
    const-string/jumbo p2, "parent"

    .line 185
    .line 186
    .line 187
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 188
    throw p1
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
.end method
