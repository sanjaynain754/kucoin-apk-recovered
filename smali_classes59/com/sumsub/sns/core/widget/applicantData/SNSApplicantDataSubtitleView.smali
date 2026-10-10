.class public final Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataSubtitleView;
.super Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\n\u001a\u0004\u0018\u00010\t2\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t8V@VX\u0096\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u000b\u0010\u000c\"\u0004\u0008\r\u0010\u000eR@\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f2\u0014\u0010\u0008\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f@VX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014\"\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataSubtitleView;",
        "Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;",
        "context",
        "Landroid/content/Context;",
        "<init>",
        "(Landroid/content/Context;)V",
        "subtitleView",
        "Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;",
        "value",
        "",
        "label",
        "getLabel",
        "()Ljava/lang/CharSequence;",
        "setLabel",
        "(Ljava/lang/CharSequence;)V",
        "Lkotlin/Function1;",
        "",
        "",
        "onLinkClicked",
        "getOnLinkClicked",
        "()Lkotlin/jvm/functions/Function1;",
        "setOnLinkClicked",
        "(Lkotlin/jvm/functions/Function1;)V",
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
        "SMAP\nSNSApplicantDataSubtitleView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSApplicantDataSubtitleView.kt\ncom/sumsub/sns/core/widget/applicantData/SNSApplicantDataSubtitleView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,54:1\n157#2,8:55\n1#3:63\n*S KotlinDebug\n*F\n+ 1 SNSApplicantDataSubtitleView.kt\ncom/sumsub/sns/core/widget/applicantData/SNSApplicantDataSubtitleView\n*L\n36#1:55,8\n*E\n"
    }
.end annotation


# instance fields
.field private onLinkClicked:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final subtitleView:Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 8
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const/16 v5, 0xe

    .line 3
    const/4 v6, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    const/4 v4, 0x0

    .line 7
    move-object v0, p0

    .line 8
    move-object v1, p1

    .line 9
    .line 10
    .line 11
    invoke-direct/range {v0 .. v6}, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 15
    move-object v2, v1

    .line 16
    .line 17
    new-instance v1, Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;

    .line 18
    .line 19
    const/16 v6, 0xe

    .line 20
    const/4 v7, 0x0

    .line 21
    const/4 v3, 0x0

    .line 22
    const/4 v5, 0x0

    .line 23
    .line 24
    .line 25
    invoke-direct/range {v1 .. v7}, Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 26
    move-object p1, v1

    .line 27
    move-object v1, v2

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 31
    move-result-object v1

    .line 32
    .line 33
    sget v2, Lcom/sumsub/sns/R$dimen;->sns_margin_medium:I

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 37
    move-result v1

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Landroid/view/View;->getPaddingLeft()I

    .line 41
    move-result v2

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Landroid/view/View;->getPaddingRight()I

    .line 45
    move-result v3

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Landroid/view/View;->getPaddingBottom()I

    .line 49
    move-result v4

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, v2, v1, v3, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 53
    .line 54
    new-instance v1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    .line 55
    const/4 v2, -0x1

    .line 56
    const/4 v3, -0x2

    .line 57
    .line 58
    .line 59
    invoke-direct {v1, v2, v3}, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;-><init>(II)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 63
    .line 64
    iput-object p1, v0, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataSubtitleView;->subtitleView:Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;->onInitializationFinished()V

    .line 71
    .line 72
    sget-object v1, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/core/common/k0;->getCustomization()Lcom/sumsub/sns/core/theme/SNSJsonCustomization;

    .line 76
    move-result-object v1

    .line 77
    const/4 v2, 0x0

    .line 78
    .line 79
    if-eqz v1, :cond_0

    .line 80
    .line 81
    .line 82
    invoke-interface {v1}, Lcom/sumsub/sns/core/theme/SNSJsonCustomization;->getTheme()Lcom/sumsub/sns/core/theme/SNSCustomizationTheme;

    .line 83
    move-result-object v1

    .line 84
    goto :goto_0

    .line 85
    :cond_0
    move-object v1, v2

    .line 86
    .line 87
    :goto_0
    instance-of v3, v1, Lcom/sumsub/sns/internal/core/presentation/theme/p;

    .line 88
    .line 89
    if-eqz v3, :cond_1

    .line 90
    .line 91
    check-cast v1, Lcom/sumsub/sns/internal/core/presentation/theme/p;

    .line 92
    goto :goto_1

    .line 93
    :cond_1
    move-object v1, v2

    .line 94
    .line 95
    :goto_1
    const/16 v3, 0x11

    .line 96
    .line 97
    if-eqz v1, :cond_8

    .line 98
    .line 99
    sget-object v4, Lcom/sumsub/sns/core/theme/SNSMetricElement;->SECTION_HEADER_ALIGNMENT:Lcom/sumsub/sns/core/theme/SNSMetricElement;

    .line 100
    .line 101
    iget-object v1, v1, Lcom/sumsub/sns/internal/core/presentation/theme/p;->d:Ljava/util/Map;

    .line 102
    .line 103
    if-eqz v1, :cond_2

    .line 104
    .line 105
    .line 106
    invoke-virtual {v4}, Lcom/sumsub/sns/core/theme/SNSMetricElement;->getValue()Ljava/lang/String;

    .line 107
    move-result-object v4

    .line 108
    .line 109
    .line 110
    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    move-result-object v1

    .line 112
    .line 113
    check-cast v1, Lcom/sumsub/sns/internal/core/presentation/theme/j;

    .line 114
    goto :goto_2

    .line 115
    :cond_2
    move-object v1, v2

    .line 116
    .line 117
    :goto_2
    instance-of v4, v1, Lcom/sumsub/sns/internal/core/presentation/theme/h;

    .line 118
    .line 119
    if-eqz v4, :cond_3

    .line 120
    .line 121
    check-cast v1, Lcom/sumsub/sns/internal/core/presentation/theme/h;

    .line 122
    goto :goto_3

    .line 123
    :cond_3
    move-object v1, v2

    .line 124
    .line 125
    :goto_3
    if-eqz v1, :cond_4

    .line 126
    .line 127
    iget-object v1, v1, Lcom/sumsub/sns/internal/core/presentation/theme/h;->a:Ljava/lang/String;

    .line 128
    goto :goto_4

    .line 129
    :cond_4
    move-object v1, v2

    .line 130
    .line 131
    :goto_4
    if-eqz v1, :cond_8

    .line 132
    .line 133
    sget-object v4, Lcom/sumsub/sns/core/theme/SNSThemeMetric$TextAlignment;->LEFT:Lcom/sumsub/sns/core/theme/SNSThemeMetric$TextAlignment;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v4}, Lcom/sumsub/sns/core/theme/SNSThemeMetric$TextAlignment;->getValue()Ljava/lang/String;

    .line 137
    move-result-object v4

    .line 138
    .line 139
    .line 140
    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 141
    move-result v4

    .line 142
    .line 143
    if-eqz v4, :cond_5

    .line 144
    .line 145
    .line 146
    const v1, 0x800003

    .line 147
    .line 148
    .line 149
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 150
    move-result-object v2

    .line 151
    goto :goto_5

    .line 152
    .line 153
    :cond_5
    sget-object v4, Lcom/sumsub/sns/core/theme/SNSThemeMetric$TextAlignment;->RIGHT:Lcom/sumsub/sns/core/theme/SNSThemeMetric$TextAlignment;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v4}, Lcom/sumsub/sns/core/theme/SNSThemeMetric$TextAlignment;->getValue()Ljava/lang/String;

    .line 157
    move-result-object v4

    .line 158
    .line 159
    .line 160
    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 161
    move-result v4

    .line 162
    .line 163
    if-eqz v4, :cond_6

    .line 164
    .line 165
    .line 166
    const v1, 0x800005

    .line 167
    .line 168
    .line 169
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 170
    move-result-object v2

    .line 171
    goto :goto_5

    .line 172
    .line 173
    :cond_6
    sget-object v4, Lcom/sumsub/sns/core/theme/SNSThemeMetric$TextAlignment;->CENTER:Lcom/sumsub/sns/core/theme/SNSThemeMetric$TextAlignment;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v4}, Lcom/sumsub/sns/core/theme/SNSThemeMetric$TextAlignment;->getValue()Ljava/lang/String;

    .line 177
    move-result-object v4

    .line 178
    .line 179
    .line 180
    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 181
    move-result v1

    .line 182
    .line 183
    if-eqz v1, :cond_7

    .line 184
    .line 185
    .line 186
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 187
    move-result-object v2

    .line 188
    .line 189
    :cond_7
    :goto_5
    if-eqz v2, :cond_8

    .line 190
    .line 191
    .line 192
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 193
    move-result v3

    .line 194
    .line 195
    .line 196
    :cond_8
    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setGravity(I)V

    .line 197
    return-void
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
.method public getLabel()Ljava/lang/CharSequence;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataSubtitleView;->subtitleView:Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public getOnLinkClicked()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataSubtitleView;->onLinkClicked:Lkotlin/jvm/functions/Function1;

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
.end method

.method public setLabel(Ljava/lang/CharSequence;)V
    .locals 1
    .param p1    # Ljava/lang/CharSequence;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataSubtitleView;->subtitleView:Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8
    :cond_0
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
.end method

.method public setOnLinkClicked(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataSubtitleView;->subtitleView:Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-static {v0, p1}, Lcom/sumsub/sns/internal/core/common/q;->a(Landroid/widget/TextView;Lkotlin/jvm/functions/Function1;)V

    .line 8
    .line 9
    :cond_0
    iput-object p1, p0, Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataSubtitleView;->onLinkClicked:Lkotlin/jvm/functions/Function1;

    .line 10
    return-void
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
