.class public final Landroidx/autofill/inline/v1/InlineSuggestionUi$Style$Builder;
.super Landroidx/autofill/inline/common/BundledStyle$Builder;
.source "InlineSuggestionUi.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/autofill/inline/v1/InlineSuggestionUi$Style;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/autofill/inline/common/BundledStyle$Builder<",
        "Landroidx/autofill/inline/v1/InlineSuggestionUi$Style;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "style_v1"

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, v0}, Landroidx/autofill/inline/common/BundledStyle$Builder;-><init>(Ljava/lang/String;)V

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
.end method


# virtual methods
.method public bridge synthetic build()Landroidx/autofill/inline/common/BundledStyle;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/autofill/inline/v1/InlineSuggestionUi$Style$Builder;->build()Landroidx/autofill/inline/v1/InlineSuggestionUi$Style;

    move-result-object v0

    return-object v0
.end method

.method public build()Landroidx/autofill/inline/v1/InlineSuggestionUi$Style;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 2
    new-instance v0, Landroidx/autofill/inline/v1/InlineSuggestionUi$Style;

    iget-object v1, p0, Landroidx/autofill/inline/common/BundledStyle$Builder;->mBundle:Landroid/os/Bundle;

    invoke-direct {v0, v1}, Landroidx/autofill/inline/v1/InlineSuggestionUi$Style;-><init>(Landroid/os/Bundle;)V

    return-object v0
.end method

.method public setChipStyle(Landroidx/autofill/inline/common/ViewStyle;)Landroidx/autofill/inline/v1/InlineSuggestionUi$Style$Builder;
    .locals 2
    .param p1    # Landroidx/autofill/inline/common/ViewStyle;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/autofill/inline/common/BundledStyle;->assertIsValid()V

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/autofill/inline/common/BundledStyle$Builder;->mBundle:Landroid/os/Bundle;

    .line 6
    .line 7
    const-string v1, "chip_style"

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Landroidx/autofill/inline/common/BundledStyle;->getBundle()Landroid/os/Bundle;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 15
    return-object p0
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

.method public setEndIconStyle(Landroidx/autofill/inline/common/ImageViewStyle;)Landroidx/autofill/inline/v1/InlineSuggestionUi$Style$Builder;
    .locals 2
    .param p1    # Landroidx/autofill/inline/common/ImageViewStyle;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/autofill/inline/common/BundledStyle;->assertIsValid()V

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/autofill/inline/common/BundledStyle$Builder;->mBundle:Landroid/os/Bundle;

    .line 6
    .line 7
    const-string v1, "end_icon_style"

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Landroidx/autofill/inline/common/BundledStyle;->getBundle()Landroid/os/Bundle;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 15
    return-object p0
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

.method public setLayoutDirection(I)Landroidx/autofill/inline/v1/InlineSuggestionUi$Style$Builder;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/autofill/inline/common/BundledStyle$Builder;->mBundle:Landroid/os/Bundle;

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "layout_direction"

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 9
    return-object p0
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

.method public setSingleIconChipIconStyle(Landroidx/autofill/inline/common/ImageViewStyle;)Landroidx/autofill/inline/v1/InlineSuggestionUi$Style$Builder;
    .locals 2
    .param p1    # Landroidx/autofill/inline/common/ImageViewStyle;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/autofill/inline/common/BundledStyle;->assertIsValid()V

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/autofill/inline/common/BundledStyle$Builder;->mBundle:Landroid/os/Bundle;

    .line 6
    .line 7
    .line 8
    const-string/jumbo v1, "single_icon_chip_icon_style"

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Landroidx/autofill/inline/common/BundledStyle;->getBundle()Landroid/os/Bundle;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 16
    return-object p0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public setSingleIconChipStyle(Landroidx/autofill/inline/common/ViewStyle;)Landroidx/autofill/inline/v1/InlineSuggestionUi$Style$Builder;
    .locals 2
    .param p1    # Landroidx/autofill/inline/common/ViewStyle;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/autofill/inline/common/BundledStyle;->assertIsValid()V

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/autofill/inline/common/BundledStyle$Builder;->mBundle:Landroid/os/Bundle;

    .line 6
    .line 7
    .line 8
    const-string/jumbo v1, "single_icon_chip_style"

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Landroidx/autofill/inline/common/BundledStyle;->getBundle()Landroid/os/Bundle;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 16
    return-object p0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public setStartIconStyle(Landroidx/autofill/inline/common/ImageViewStyle;)Landroidx/autofill/inline/v1/InlineSuggestionUi$Style$Builder;
    .locals 2
    .param p1    # Landroidx/autofill/inline/common/ImageViewStyle;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/autofill/inline/common/BundledStyle;->assertIsValid()V

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/autofill/inline/common/BundledStyle$Builder;->mBundle:Landroid/os/Bundle;

    .line 6
    .line 7
    .line 8
    const-string/jumbo v1, "start_icon_style"

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Landroidx/autofill/inline/common/BundledStyle;->getBundle()Landroid/os/Bundle;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 16
    return-object p0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public setSubtitleStyle(Landroidx/autofill/inline/common/TextViewStyle;)Landroidx/autofill/inline/v1/InlineSuggestionUi$Style$Builder;
    .locals 2
    .param p1    # Landroidx/autofill/inline/common/TextViewStyle;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/autofill/inline/common/BundledStyle;->assertIsValid()V

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/autofill/inline/common/BundledStyle$Builder;->mBundle:Landroid/os/Bundle;

    .line 6
    .line 7
    .line 8
    const-string/jumbo v1, "subtitle_style"

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Landroidx/autofill/inline/common/BundledStyle;->getBundle()Landroid/os/Bundle;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 16
    return-object p0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public setTitleStyle(Landroidx/autofill/inline/common/TextViewStyle;)Landroidx/autofill/inline/v1/InlineSuggestionUi$Style$Builder;
    .locals 2
    .param p1    # Landroidx/autofill/inline/common/TextViewStyle;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/autofill/inline/common/BundledStyle;->assertIsValid()V

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/autofill/inline/common/BundledStyle$Builder;->mBundle:Landroid/os/Bundle;

    .line 6
    .line 7
    .line 8
    const-string/jumbo v1, "title_style"

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Landroidx/autofill/inline/common/BundledStyle;->getBundle()Landroid/os/Bundle;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 16
    return-object p0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method
