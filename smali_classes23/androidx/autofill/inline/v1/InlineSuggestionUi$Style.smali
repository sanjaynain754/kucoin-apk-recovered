.class public final Landroidx/autofill/inline/v1/InlineSuggestionUi$Style;
.super Landroidx/autofill/inline/common/BundledStyle;
.source "InlineSuggestionUi.java"

# interfaces
.implements Landroidx/autofill/inline/UiVersions$Style;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/autofill/inline/v1/InlineSuggestionUi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Style"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/autofill/inline/v1/InlineSuggestionUi$Style$Builder;
    }
.end annotation


# static fields
.field private static final KEY_CHIP_STYLE:Ljava/lang/String; = "chip_style"

.field private static final KEY_END_ICON_STYLE:Ljava/lang/String; = "end_icon_style"

.field private static final KEY_LAYOUT_DIRECTION:Ljava/lang/String; = "layout_direction"

.field private static final KEY_SINGLE_ICON_CHIP_ICON_STYLE:Ljava/lang/String; = "single_icon_chip_icon_style"

.field private static final KEY_SINGLE_ICON_CHIP_STYLE:Ljava/lang/String; = "single_icon_chip_style"

.field private static final KEY_START_ICON_STYLE:Ljava/lang/String; = "start_icon_style"

.field private static final KEY_STYLE_V1:Ljava/lang/String; = "style_v1"

.field private static final KEY_SUBTITLE_STYLE:Ljava/lang/String; = "subtitle_style"

.field private static final KEY_TITLE_STYLE:Ljava/lang/String; = "title_style"


# direct methods
.method public constructor <init>(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Landroidx/autofill/inline/common/BundledStyle;-><init>(Landroid/os/Bundle;)V

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
.end method


# virtual methods
.method public applyStyle(Landroid/view/View;Landroid/widget/ImageView;)V
    .locals 2
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/widget/ImageView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/autofill/inline/common/BundledStyle;->isValid()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p0}, Landroidx/autofill/inline/v1/InlineSuggestionUi$Style;->getLayoutDirection()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutDirection(I)V

    .line 3
    invoke-virtual {p2}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-eq v0, v1, :cond_2

    .line 4
    invoke-virtual {p0}, Landroidx/autofill/inline/v1/InlineSuggestionUi$Style;->getSingleIconChipIconStyle()Landroidx/autofill/inline/common/ImageViewStyle;

    move-result-object v0

    if-nez v0, :cond_1

    .line 5
    invoke-virtual {p0}, Landroidx/autofill/inline/v1/InlineSuggestionUi$Style;->getStartIconStyle()Landroidx/autofill/inline/common/ImageViewStyle;

    move-result-object v0

    :cond_1
    if-eqz v0, :cond_2

    .line 6
    invoke-virtual {v0, p2}, Landroidx/autofill/inline/common/ImageViewStyle;->applyStyleOnImageViewIfValid(Landroid/widget/ImageView;)V

    .line 7
    :cond_2
    invoke-virtual {p0}, Landroidx/autofill/inline/v1/InlineSuggestionUi$Style;->getSingleIconChipStyle()Landroidx/autofill/inline/common/ViewStyle;

    move-result-object p2

    if-nez p2, :cond_3

    .line 8
    invoke-virtual {p0}, Landroidx/autofill/inline/v1/InlineSuggestionUi$Style;->getChipStyle()Landroidx/autofill/inline/common/ViewStyle;

    move-result-object p2

    :cond_3
    if-eqz p2, :cond_4

    .line 9
    invoke-virtual {p2, p1}, Landroidx/autofill/inline/common/ViewStyle;->applyStyleOnViewIfValid(Landroid/view/View;)V

    :cond_4
    :goto_0
    return-void
.end method

.method public applyStyle(Landroid/view/View;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ImageView;)V
    .locals 2
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/widget/ImageView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Landroid/widget/TextView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Landroid/widget/TextView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Landroid/widget/ImageView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .line 10
    invoke-virtual {p0}, Landroidx/autofill/inline/common/BundledStyle;->isValid()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 11
    :cond_0
    invoke-virtual {p0}, Landroidx/autofill/inline/v1/InlineSuggestionUi$Style;->getLayoutDirection()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutDirection(I)V

    .line 12
    invoke-virtual {p2}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-eq v0, v1, :cond_1

    .line 13
    invoke-virtual {p0}, Landroidx/autofill/inline/v1/InlineSuggestionUi$Style;->getStartIconStyle()Landroidx/autofill/inline/common/ImageViewStyle;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 14
    invoke-virtual {v0, p2}, Landroidx/autofill/inline/common/ImageViewStyle;->applyStyleOnImageViewIfValid(Landroid/widget/ImageView;)V

    .line 15
    :cond_1
    invoke-virtual {p3}, Landroid/view/View;->getVisibility()I

    move-result p2

    if-eq p2, v1, :cond_2

    .line 16
    invoke-virtual {p0}, Landroidx/autofill/inline/v1/InlineSuggestionUi$Style;->getTitleStyle()Landroidx/autofill/inline/common/TextViewStyle;

    move-result-object p2

    if-eqz p2, :cond_2

    .line 17
    invoke-virtual {p2, p3}, Landroidx/autofill/inline/common/TextViewStyle;->applyStyleOnTextViewIfValid(Landroid/widget/TextView;)V

    .line 18
    :cond_2
    invoke-virtual {p4}, Landroid/view/View;->getVisibility()I

    move-result p2

    if-eq p2, v1, :cond_3

    .line 19
    invoke-virtual {p0}, Landroidx/autofill/inline/v1/InlineSuggestionUi$Style;->getSubtitleStyle()Landroidx/autofill/inline/common/TextViewStyle;

    move-result-object p2

    if-eqz p2, :cond_3

    .line 20
    invoke-virtual {p2, p4}, Landroidx/autofill/inline/common/TextViewStyle;->applyStyleOnTextViewIfValid(Landroid/widget/TextView;)V

    .line 21
    :cond_3
    invoke-virtual {p5}, Landroid/view/View;->getVisibility()I

    move-result p2

    if-eq p2, v1, :cond_4

    .line 22
    invoke-virtual {p0}, Landroidx/autofill/inline/v1/InlineSuggestionUi$Style;->getEndIconStyle()Landroidx/autofill/inline/common/ImageViewStyle;

    move-result-object p2

    if-eqz p2, :cond_4

    .line 23
    invoke-virtual {p2, p5}, Landroidx/autofill/inline/common/ImageViewStyle;->applyStyleOnImageViewIfValid(Landroid/widget/ImageView;)V

    .line 24
    :cond_4
    invoke-virtual {p0}, Landroidx/autofill/inline/v1/InlineSuggestionUi$Style;->getChipStyle()Landroidx/autofill/inline/common/ViewStyle;

    move-result-object p2

    if-eqz p2, :cond_5

    .line 25
    invoke-virtual {p2, p1}, Landroidx/autofill/inline/common/ViewStyle;->applyStyleOnViewIfValid(Landroid/view/View;)V

    :cond_5
    :goto_0
    return-void
.end method

.method public getChipStyle()Landroidx/autofill/inline/common/ViewStyle;
    .locals 2
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/autofill/inline/common/BundledStyle;->mBundle:Landroid/os/Bundle;

    .line 3
    .line 4
    const-string v1, "chip_style"

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0

    .line 13
    .line 14
    :cond_0
    new-instance v1, Landroidx/autofill/inline/common/ViewStyle;

    .line 15
    .line 16
    .line 17
    invoke-direct {v1, v0}, Landroidx/autofill/inline/common/ViewStyle;-><init>(Landroid/os/Bundle;)V

    .line 18
    return-object v1
    .line 19
    .line 20
.end method

.method public getEndIconStyle()Landroidx/autofill/inline/common/ImageViewStyle;
    .locals 2
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/autofill/inline/common/BundledStyle;->mBundle:Landroid/os/Bundle;

    .line 3
    .line 4
    const-string v1, "end_icon_style"

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0

    .line 13
    .line 14
    :cond_0
    new-instance v1, Landroidx/autofill/inline/common/ImageViewStyle;

    .line 15
    .line 16
    .line 17
    invoke-direct {v1, v0}, Landroidx/autofill/inline/common/ImageViewStyle;-><init>(Landroid/os/Bundle;)V

    .line 18
    return-object v1
    .line 19
    .line 20
.end method

.method public getLayoutDirection()I
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/autofill/inline/common/BundledStyle;->mBundle:Landroid/os/Bundle;

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "layout_direction"

    .line 6
    const/4 v2, 0x0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 10
    move-result v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    const/4 v1, 0x1

    .line 14
    .line 15
    if-eq v0, v1, :cond_0

    .line 16
    return v2

    .line 17
    :cond_0
    return v0
    .line 18
    .line 19
    .line 20
.end method

.method public getSingleIconChipIconStyle()Landroidx/autofill/inline/common/ImageViewStyle;
    .locals 2
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/autofill/inline/common/BundledStyle;->mBundle:Landroid/os/Bundle;

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "single_icon_chip_icon_style"

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    const/4 v0, 0x0

    .line 13
    return-object v0

    .line 14
    .line 15
    :cond_0
    new-instance v1, Landroidx/autofill/inline/common/ImageViewStyle;

    .line 16
    .line 17
    .line 18
    invoke-direct {v1, v0}, Landroidx/autofill/inline/common/ImageViewStyle;-><init>(Landroid/os/Bundle;)V

    .line 19
    return-object v1
    .line 20
.end method

.method public getSingleIconChipStyle()Landroidx/autofill/inline/common/ViewStyle;
    .locals 2
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/autofill/inline/common/BundledStyle;->mBundle:Landroid/os/Bundle;

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "single_icon_chip_style"

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    const/4 v0, 0x0

    .line 13
    return-object v0

    .line 14
    .line 15
    :cond_0
    new-instance v1, Landroidx/autofill/inline/common/ViewStyle;

    .line 16
    .line 17
    .line 18
    invoke-direct {v1, v0}, Landroidx/autofill/inline/common/ViewStyle;-><init>(Landroid/os/Bundle;)V

    .line 19
    return-object v1
    .line 20
.end method

.method public getStartIconStyle()Landroidx/autofill/inline/common/ImageViewStyle;
    .locals 2
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/autofill/inline/common/BundledStyle;->mBundle:Landroid/os/Bundle;

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "start_icon_style"

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    const/4 v0, 0x0

    .line 13
    return-object v0

    .line 14
    .line 15
    :cond_0
    new-instance v1, Landroidx/autofill/inline/common/ImageViewStyle;

    .line 16
    .line 17
    .line 18
    invoke-direct {v1, v0}, Landroidx/autofill/inline/common/ImageViewStyle;-><init>(Landroid/os/Bundle;)V

    .line 19
    return-object v1
    .line 20
.end method

.method public getStyleKey()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "style_v1"

    .line 4
    return-object v0
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
.end method

.method public getSubtitleStyle()Landroidx/autofill/inline/common/TextViewStyle;
    .locals 2
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/autofill/inline/common/BundledStyle;->mBundle:Landroid/os/Bundle;

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "subtitle_style"

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    const/4 v0, 0x0

    .line 13
    return-object v0

    .line 14
    .line 15
    :cond_0
    new-instance v1, Landroidx/autofill/inline/common/TextViewStyle;

    .line 16
    .line 17
    .line 18
    invoke-direct {v1, v0}, Landroidx/autofill/inline/common/TextViewStyle;-><init>(Landroid/os/Bundle;)V

    .line 19
    return-object v1
    .line 20
.end method

.method public getTitleStyle()Landroidx/autofill/inline/common/TextViewStyle;
    .locals 2
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/autofill/inline/common/BundledStyle;->mBundle:Landroid/os/Bundle;

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "title_style"

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    const/4 v0, 0x0

    .line 13
    return-object v0

    .line 14
    .line 15
    :cond_0
    new-instance v1, Landroidx/autofill/inline/common/TextViewStyle;

    .line 16
    .line 17
    .line 18
    invoke-direct {v1, v0}, Landroidx/autofill/inline/common/TextViewStyle;-><init>(Landroid/os/Bundle;)V

    .line 19
    return-object v1
    .line 20
.end method

.method public getVersion()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "androidx.autofill.inline.ui.version:v1"

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
    .line 19
    .line 20
.end method
