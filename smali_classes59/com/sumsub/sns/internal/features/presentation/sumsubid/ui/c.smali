.class public final synthetic Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/c;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# static fields
.field public static final a:Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/c;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/c;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/c;->a:Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/c;

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
    const-string v4, "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcom/sumsub/sns/databinding/SnsSumsubidStateEmailBinding;"

    .line 3
    const/4 v5, 0x0

    .line 4
    const/4 v1, 0x2

    .line 5
    .line 6
    const-class v2, Lcom/sumsub/sns/databinding/M;

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
    .locals 6

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
    sget p2, Lcom/sumsub/sns/R$layout;->sns_sumsubid_state_email:I

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 13
    .line 14
    sget p1, Lcom/sumsub/sns/R$id;->sns_email:I

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
    check-cast v2, Lcom/sumsub/sns/core/widget/SNSTextInputLayout;

    .line 22
    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    sget p1, Lcom/sumsub/sns/R$id;->sns_email_id:I

    .line 26
    .line 27
    .line 28
    invoke-static {v1, p1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 29
    move-result-object p2

    .line 30
    move-object v3, p2

    .line 31
    .line 32
    check-cast v3, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 33
    .line 34
    if-eqz v3, :cond_0

    .line 35
    .line 36
    sget p1, Lcom/sumsub/sns/R$id;->sns_subtitle:I

    .line 37
    .line 38
    .line 39
    invoke-static {v1, p1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 40
    move-result-object p2

    .line 41
    move-object v4, p2

    .line 42
    .line 43
    check-cast v4, Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;

    .line 44
    .line 45
    if-eqz v4, :cond_0

    .line 46
    .line 47
    sget p1, Lcom/sumsub/sns/R$id;->sns_title:I

    .line 48
    .line 49
    .line 50
    invoke-static {v1, p1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 51
    move-result-object p2

    .line 52
    move-object v5, p2

    .line 53
    .line 54
    check-cast v5, Lcom/sumsub/sns/core/widget/SNSH1TextView;

    .line 55
    .line 56
    if-eqz v5, :cond_0

    .line 57
    .line 58
    new-instance v0, Lcom/sumsub/sns/databinding/M;

    .line 59
    .line 60
    .line 61
    invoke-direct/range {v0 .. v5}, Lcom/sumsub/sns/databinding/M;-><init>(Landroid/view/ViewGroup;Lcom/sumsub/sns/core/widget/SNSTextInputLayout;Lcom/sumsub/sns/core/widget/SNSTextInputEditText;Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;Lcom/sumsub/sns/core/widget/SNSH1TextView;)V

    .line 62
    return-object v0

    .line 63
    .line 64
    .line 65
    :cond_0
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 66
    move-result-object p2

    .line 67
    .line 68
    .line 69
    invoke-virtual {p2, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 70
    move-result-object p1

    .line 71
    .line 72
    new-instance p2, Ljava/lang/NullPointerException;

    .line 73
    .line 74
    const-string v0, "Missing required view with ID: "

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 78
    move-result-object p1

    .line 79
    .line 80
    .line 81
    invoke-direct {p2, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 82
    throw p2

    .line 83
    .line 84
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    .line 85
    .line 86
    .line 87
    const-string/jumbo p2, "parent"

    .line 88
    .line 89
    .line 90
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 91
    throw p1
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
.end method
