.class public final Landroidx/autofill/inline/v1/InlineSuggestionUi$Content$Builder;
.super Landroidx/autofill/inline/common/SlicedContent$Builder;
.source "InlineSuggestionUi.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/autofill/inline/v1/InlineSuggestionUi$Content;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/autofill/inline/common/SlicedContent$Builder<",
        "Landroidx/autofill/inline/v1/InlineSuggestionUi$Content;",
        ">;"
    }
.end annotation


# instance fields
.field private final mAttributionIntent:Landroid/app/PendingIntent;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private mContentDescription:Ljava/lang/CharSequence;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private mEndIcon:Landroid/graphics/drawable/Icon;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private mHints:Ljava/util/List;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private mStartIcon:Landroid/graphics/drawable/Icon;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private mSubtitle:Ljava/lang/CharSequence;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private mTitle:Ljava/lang/CharSequence;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/app/PendingIntent;)V
    .locals 1
    .param p1    # Landroid/app/PendingIntent;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "androidx.autofill.inline.ui.version:v1"

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, v0}, Landroidx/autofill/inline/common/SlicedContent$Builder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Landroidx/autofill/inline/v1/InlineSuggestionUi$Content$Builder;->mAttributionIntent:Landroid/app/PendingIntent;

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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method


# virtual methods
.method public bridge synthetic build()Landroidx/autofill/inline/common/SlicedContent;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/autofill/inline/v1/InlineSuggestionUi$Content$Builder;->build()Landroidx/autofill/inline/v1/InlineSuggestionUi$Content;

    move-result-object v0

    return-object v0
.end method

.method public build()Landroidx/autofill/inline/v1/InlineSuggestionUi$Content;
    .locals 5
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 2
    iget-object v0, p0, Landroidx/autofill/inline/v1/InlineSuggestionUi$Content$Builder;->mTitle:Ljava/lang/CharSequence;

    if-nez v0, :cond_1

    iget-object v1, p0, Landroidx/autofill/inline/v1/InlineSuggestionUi$Content$Builder;->mStartIcon:Landroid/graphics/drawable/Icon;

    if-nez v1, :cond_1

    iget-object v1, p0, Landroidx/autofill/inline/v1/InlineSuggestionUi$Content$Builder;->mEndIcon:Landroid/graphics/drawable/Icon;

    if-nez v1, :cond_1

    iget-object v1, p0, Landroidx/autofill/inline/v1/InlineSuggestionUi$Content$Builder;->mSubtitle:Ljava/lang/CharSequence;

    if-eqz v1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Title, subtitle, start icon, end icon are all null. Please set value for at least one of them"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    if-nez v0, :cond_3

    .line 4
    iget-object v0, p0, Landroidx/autofill/inline/v1/InlineSuggestionUi$Content$Builder;->mSubtitle:Ljava/lang/CharSequence;

    if-nez v0, :cond_2

    goto :goto_1

    .line 5
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot set the subtitle without setting the title."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 6
    :cond_3
    :goto_1
    iget-object v0, p0, Landroidx/autofill/inline/v1/InlineSuggestionUi$Content$Builder;->mAttributionIntent:Landroid/app/PendingIntent;

    if-eqz v0, :cond_b

    .line 7
    iget-object v0, p0, Landroidx/autofill/inline/v1/InlineSuggestionUi$Content$Builder;->mStartIcon:Landroid/graphics/drawable/Icon;

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    .line 8
    iget-object v2, p0, Landroidx/autofill/inline/common/SlicedContent$Builder;->mSliceBuilder:Landroid/app/slice/Slice$Builder;

    const-string v3, "inline_start_icon"

    .line 9
    invoke-static {v3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    .line 10
    invoke-static {v2, v0, v1, v3}, Landroidx/autofill/inline/v1/h;->a(Landroid/app/slice/Slice$Builder;Landroid/graphics/drawable/Icon;Ljava/lang/String;Ljava/util/List;)Landroid/app/slice/Slice$Builder;

    .line 11
    :cond_4
    iget-object v0, p0, Landroidx/autofill/inline/v1/InlineSuggestionUi$Content$Builder;->mTitle:Ljava/lang/CharSequence;

    if-eqz v0, :cond_5

    .line 12
    iget-object v2, p0, Landroidx/autofill/inline/common/SlicedContent$Builder;->mSliceBuilder:Landroid/app/slice/Slice$Builder;

    const-string v3, "inline_title"

    .line 13
    invoke-static {v3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    .line 14
    invoke-static {v2, v0, v1, v3}, Landroidx/autofill/inline/v1/i;->a(Landroid/app/slice/Slice$Builder;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/util/List;)Landroid/app/slice/Slice$Builder;

    .line 15
    :cond_5
    iget-object v0, p0, Landroidx/autofill/inline/v1/InlineSuggestionUi$Content$Builder;->mSubtitle:Ljava/lang/CharSequence;

    if-eqz v0, :cond_6

    .line 16
    iget-object v2, p0, Landroidx/autofill/inline/common/SlicedContent$Builder;->mSliceBuilder:Landroid/app/slice/Slice$Builder;

    const-string v3, "inline_subtitle"

    .line 17
    invoke-static {v3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    .line 18
    invoke-static {v2, v0, v1, v3}, Landroidx/autofill/inline/v1/i;->a(Landroid/app/slice/Slice$Builder;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/util/List;)Landroid/app/slice/Slice$Builder;

    .line 19
    :cond_6
    iget-object v0, p0, Landroidx/autofill/inline/v1/InlineSuggestionUi$Content$Builder;->mEndIcon:Landroid/graphics/drawable/Icon;

    if-eqz v0, :cond_7

    .line 20
    iget-object v2, p0, Landroidx/autofill/inline/common/SlicedContent$Builder;->mSliceBuilder:Landroid/app/slice/Slice$Builder;

    const-string v3, "inline_end_icon"

    .line 21
    invoke-static {v3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    .line 22
    invoke-static {v2, v0, v1, v3}, Landroidx/autofill/inline/v1/h;->a(Landroid/app/slice/Slice$Builder;Landroid/graphics/drawable/Icon;Ljava/lang/String;Ljava/util/List;)Landroid/app/slice/Slice$Builder;

    .line 23
    :cond_7
    iget-object v0, p0, Landroidx/autofill/inline/v1/InlineSuggestionUi$Content$Builder;->mAttributionIntent:Landroid/app/PendingIntent;

    if-eqz v0, :cond_8

    .line 24
    iget-object v2, p0, Landroidx/autofill/inline/common/SlicedContent$Builder;->mSliceBuilder:Landroid/app/slice/Slice$Builder;

    invoke-static {}, Landroidx/autofill/inline/common/e;->a()V

    iget-object v3, p0, Landroidx/autofill/inline/common/SlicedContent$Builder;->mSliceBuilder:Landroid/app/slice/Slice$Builder;

    invoke-static {v3}, Landroidx/autofill/inline/v1/m;->a(Landroid/app/slice/Slice$Builder;)Landroid/app/slice/Slice$Builder;

    move-result-object v3

    const-string v4, "inline_attribution"

    .line 25
    invoke-static {v4}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    .line 26
    invoke-static {v3, v4}, Landroidx/autofill/inline/v1/j;->a(Landroid/app/slice/Slice$Builder;Ljava/util/List;)Landroid/app/slice/Slice$Builder;

    move-result-object v3

    .line 27
    invoke-static {v3}, Landroidx/autofill/inline/v1/k;->a(Landroid/app/slice/Slice$Builder;)Landroid/app/slice/Slice;

    move-result-object v3

    .line 28
    invoke-static {v2, v0, v3, v1}, Landroidx/autofill/inline/v1/l;->a(Landroid/app/slice/Slice$Builder;Landroid/app/PendingIntent;Landroid/app/slice/Slice;Ljava/lang/String;)Landroid/app/slice/Slice$Builder;

    .line 29
    :cond_8
    iget-object v0, p0, Landroidx/autofill/inline/v1/InlineSuggestionUi$Content$Builder;->mContentDescription:Ljava/lang/CharSequence;

    if-eqz v0, :cond_9

    .line 30
    iget-object v2, p0, Landroidx/autofill/inline/common/SlicedContent$Builder;->mSliceBuilder:Landroid/app/slice/Slice$Builder;

    const-string v3, "inline_content_description"

    .line 31
    invoke-static {v3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    .line 32
    invoke-static {v2, v0, v1, v3}, Landroidx/autofill/inline/v1/i;->a(Landroid/app/slice/Slice$Builder;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/util/List;)Landroid/app/slice/Slice$Builder;

    .line 33
    :cond_9
    iget-object v0, p0, Landroidx/autofill/inline/v1/InlineSuggestionUi$Content$Builder;->mHints:Ljava/util/List;

    if-eqz v0, :cond_a

    .line 34
    iget-object v1, p0, Landroidx/autofill/inline/common/SlicedContent$Builder;->mSliceBuilder:Landroid/app/slice/Slice$Builder;

    invoke-static {v1, v0}, Landroidx/autofill/inline/v1/j;->a(Landroid/app/slice/Slice$Builder;Ljava/util/List;)Landroid/app/slice/Slice$Builder;

    .line 35
    :cond_a
    new-instance v0, Landroidx/autofill/inline/v1/InlineSuggestionUi$Content;

    iget-object v1, p0, Landroidx/autofill/inline/common/SlicedContent$Builder;->mSliceBuilder:Landroid/app/slice/Slice$Builder;

    invoke-static {v1}, Landroidx/autofill/inline/v1/k;->a(Landroid/app/slice/Slice$Builder;)Landroid/app/slice/Slice;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/autofill/inline/v1/InlineSuggestionUi$Content;-><init>(Landroid/app/slice/Slice;)V

    return-object v0

    .line 36
    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Attribution intent cannot be null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public setContentDescription(Ljava/lang/CharSequence;)Landroidx/autofill/inline/v1/InlineSuggestionUi$Content$Builder;
    .locals 0
    .param p1    # Ljava/lang/CharSequence;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Landroidx/autofill/inline/v1/InlineSuggestionUi$Content$Builder;->mContentDescription:Ljava/lang/CharSequence;

    .line 3
    return-object p0
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
    .line 24
.end method

.method public setEndIcon(Landroid/graphics/drawable/Icon;)Landroidx/autofill/inline/v1/InlineSuggestionUi$Content$Builder;
    .locals 0
    .param p1    # Landroid/graphics/drawable/Icon;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Landroidx/autofill/inline/v1/InlineSuggestionUi$Content$Builder;->mEndIcon:Landroid/graphics/drawable/Icon;

    .line 3
    return-object p0
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
    .line 24
.end method

.method public setHints(Ljava/util/List;)Landroidx/autofill/inline/v1/InlineSuggestionUi$Content$Builder;
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Landroidx/autofill/inline/v1/InlineSuggestionUi$Content$Builder;"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Landroidx/autofill/inline/v1/InlineSuggestionUi$Content$Builder;->mHints:Ljava/util/List;

    .line 3
    return-object p0
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
    .line 24
.end method

.method public setStartIcon(Landroid/graphics/drawable/Icon;)Landroidx/autofill/inline/v1/InlineSuggestionUi$Content$Builder;
    .locals 0
    .param p1    # Landroid/graphics/drawable/Icon;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Landroidx/autofill/inline/v1/InlineSuggestionUi$Content$Builder;->mStartIcon:Landroid/graphics/drawable/Icon;

    .line 3
    return-object p0
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
    .line 24
.end method

.method public setSubtitle(Ljava/lang/CharSequence;)Landroidx/autofill/inline/v1/InlineSuggestionUi$Content$Builder;
    .locals 0
    .param p1    # Ljava/lang/CharSequence;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Landroidx/autofill/inline/v1/InlineSuggestionUi$Content$Builder;->mSubtitle:Ljava/lang/CharSequence;

    .line 3
    return-object p0
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
    .line 24
.end method

.method public setTitle(Ljava/lang/CharSequence;)Landroidx/autofill/inline/v1/InlineSuggestionUi$Content$Builder;
    .locals 0
    .param p1    # Ljava/lang/CharSequence;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Landroidx/autofill/inline/v1/InlineSuggestionUi$Content$Builder;->mTitle:Ljava/lang/CharSequence;

    .line 3
    return-object p0
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
    .line 24
.end method
