.class final Lcom/sumsub/sns/core/widget/SNSTextInputLayout$BoxBackgroundColorResolver;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sumsub/sns/core/widget/SNSTextInputLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "BoxBackgroundColorResolver"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0008R\u0012\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0008\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/sumsub/sns/core/widget/SNSTextInputLayout$BoxBackgroundColorResolver;",
        "",
        "<init>",
        "(Lcom/sumsub/sns/core/widget/SNSTextInputLayout;)V",
        "editorBackgroundColorList",
        "Landroid/content/res/ColorStateList;",
        "initStateColor",
        "",
        "Ljava/lang/Integer;",
        "invalidStateColor",
        "init",
        "",
        "styledAttributes",
        "Landroid/content/res/TypedArray;",
        "context",
        "Landroid/content/Context;",
        "getBoxBackgroundColor",
        "state",
        "Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;",
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


# instance fields
.field private editorBackgroundColorList:Landroid/content/res/ColorStateList;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private initStateColor:Ljava/lang/Integer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private invalidStateColor:Ljava/lang/Integer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field final synthetic this$0:Lcom/sumsub/sns/core/widget/SNSTextInputLayout;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/core/widget/SNSTextInputLayout;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/core/widget/SNSTextInputLayout$BoxBackgroundColorResolver;->this$0:Lcom/sumsub/sns/core/widget/SNSTextInputLayout;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    return-void
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


# virtual methods
.method public final getBoxBackgroundColor(Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;)I
    .locals 4
    .param p1    # Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSTextInputLayout$BoxBackgroundColorResolver;->initStateColor:Ljava/lang/Integer;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sumsub/sns/core/widget/SNSTextInputLayout$BoxBackgroundColorResolver;->invalidStateColor:Ljava/lang/Integer;

    .line 5
    .line 6
    iget-object v2, p0, Lcom/sumsub/sns/core/widget/SNSTextInputLayout$BoxBackgroundColorResolver;->editorBackgroundColorList:Landroid/content/res/ColorStateList;

    .line 7
    .line 8
    sget-object v3, Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;->INIT:Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;

    .line 9
    .line 10
    if-ne p1, v3, :cond_0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 16
    move-result p1

    .line 17
    return p1

    .line 18
    .line 19
    :cond_0
    sget-object v0, Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;->REJECTED:Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;

    .line 20
    .line 21
    if-ne p1, v0, :cond_1

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 27
    move-result p1

    .line 28
    return p1

    .line 29
    .line 30
    :cond_1
    if-eqz v2, :cond_2

    .line 31
    .line 32
    iget-object p1, p0, Lcom/sumsub/sns/core/widget/SNSTextInputLayout$BoxBackgroundColorResolver;->this$0:Lcom/sumsub/sns/core/widget/SNSTextInputLayout;

    .line 33
    .line 34
    .line 35
    invoke-static {p1}, Lcom/sumsub/sns/core/widget/SNSStepViewExtensionsKt;->getSnsStepDrawableState(Landroid/view/View;)[I

    .line 36
    move-result-object p1

    .line 37
    .line 38
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSTextInputLayout$BoxBackgroundColorResolver;->this$0:Lcom/sumsub/sns/core/widget/SNSTextInputLayout;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Lcom/google/android/material/textfield/TextInputLayout;->getBoxBackgroundColor()I

    .line 42
    move-result v0

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2, p1, v0}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 46
    move-result p1

    .line 47
    return p1

    .line 48
    .line 49
    :cond_2
    iget-object p1, p0, Lcom/sumsub/sns/core/widget/SNSTextInputLayout$BoxBackgroundColorResolver;->this$0:Lcom/sumsub/sns/core/widget/SNSTextInputLayout;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1}, Lcom/google/android/material/textfield/TextInputLayout;->getBoxBackgroundColor()I

    .line 53
    move-result p1

    .line 54
    return p1
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

.method public final init(Landroid/content/res/TypedArray;Landroid/content/Context;)V
    .locals 2
    .param p1    # Landroid/content/res/TypedArray;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    sget v0, Lcom/sumsub/sns/R$styleable;->SNSTextInputLayout_sns_editorBackgroundColor:I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 6
    move-result v1

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-static {p1, p2, v0}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/content/res/TypedArray;Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 12
    move-result-object p1

    .line 13
    goto :goto_0

    .line 14
    .line 15
    :cond_0
    iget-object p1, p0, Lcom/sumsub/sns/core/widget/SNSTextInputLayout$BoxBackgroundColorResolver;->this$0:Lcom/sumsub/sns/core/widget/SNSTextInputLayout;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/google/android/material/textfield/TextInputLayout;->getBoxBackgroundColor()I

    .line 19
    move-result p1

    .line 20
    .line 21
    .line 22
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 23
    move-result-object p1

    .line 24
    .line 25
    :goto_0
    iput-object p1, p0, Lcom/sumsub/sns/core/widget/SNSTextInputLayout$BoxBackgroundColorResolver;->editorBackgroundColorList:Landroid/content/res/ColorStateList;

    .line 26
    .line 27
    iget-object p1, p0, Lcom/sumsub/sns/core/widget/SNSTextInputLayout$BoxBackgroundColorResolver;->this$0:Lcom/sumsub/sns/core/widget/SNSTextInputLayout;

    .line 28
    .line 29
    sget-object p2, Lcom/sumsub/sns/core/theme/SNSColorElement;->FIELD_BACKGROUND:Lcom/sumsub/sns/core/theme/SNSColorElement;

    .line 30
    .line 31
    .line 32
    invoke-static {p1, p2}, Lcom/sumsub/sns/core/presentation/helper/b;->a(Landroid/view/View;Lcom/sumsub/sns/core/theme/SNSColorElement;)Ljava/lang/Integer;

    .line 33
    move-result-object p1

    .line 34
    .line 35
    iput-object p1, p0, Lcom/sumsub/sns/core/widget/SNSTextInputLayout$BoxBackgroundColorResolver;->initStateColor:Ljava/lang/Integer;

    .line 36
    .line 37
    iget-object p1, p0, Lcom/sumsub/sns/core/widget/SNSTextInputLayout$BoxBackgroundColorResolver;->this$0:Lcom/sumsub/sns/core/widget/SNSTextInputLayout;

    .line 38
    .line 39
    sget-object p2, Lcom/sumsub/sns/core/theme/SNSColorElement;->FIELD_BACKGROUND_INVALID:Lcom/sumsub/sns/core/theme/SNSColorElement;

    .line 40
    .line 41
    .line 42
    invoke-static {p1, p2}, Lcom/sumsub/sns/core/presentation/helper/b;->a(Landroid/view/View;Lcom/sumsub/sns/core/theme/SNSColorElement;)Ljava/lang/Integer;

    .line 43
    move-result-object p1

    .line 44
    .line 45
    if-nez p1, :cond_1

    .line 46
    .line 47
    iget-object p1, p0, Lcom/sumsub/sns/core/widget/SNSTextInputLayout$BoxBackgroundColorResolver;->this$0:Lcom/sumsub/sns/core/widget/SNSTextInputLayout;

    .line 48
    .line 49
    sget-object p2, Lcom/sumsub/sns/core/theme/SNSColorElement;->BACKGROUND_CRITICAL:Lcom/sumsub/sns/core/theme/SNSColorElement;

    .line 50
    .line 51
    .line 52
    invoke-static {p1, p2}, Lcom/sumsub/sns/core/presentation/helper/b;->a(Landroid/view/View;Lcom/sumsub/sns/core/theme/SNSColorElement;)Ljava/lang/Integer;

    .line 53
    move-result-object p1

    .line 54
    .line 55
    :cond_1
    iput-object p1, p0, Lcom/sumsub/sns/core/widget/SNSTextInputLayout$BoxBackgroundColorResolver;->invalidStateColor:Ljava/lang/Integer;

    .line 56
    return-void
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
.end method
