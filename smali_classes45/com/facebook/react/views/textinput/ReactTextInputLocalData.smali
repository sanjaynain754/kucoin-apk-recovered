.class public final Lcom/facebook/react/views/textinput/ReactTextInputLocalData;
.super Ljava/lang/Object;
.source "ReactTextInputLocalData.java"


# instance fields
.field private final mBreakStrategy:I

.field private final mInputType:I

.field private final mMaxLines:I

.field private final mMinLines:I

.field private final mPlaceholder:Ljava/lang/CharSequence;

.field private final mText:Landroid/text/SpannableStringBuilder;

.field private final mTextSize:F


# direct methods
.method public constructor <init>(Landroid/widget/EditText;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Landroid/text/SpannableStringBuilder;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 13
    .line 14
    iput-object v0, p0, Lcom/facebook/react/views/textinput/ReactTextInputLocalData;->mText:Landroid/text/SpannableStringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/widget/TextView;->getTextSize()F

    .line 18
    move-result v0

    .line 19
    .line 20
    iput v0, p0, Lcom/facebook/react/views/textinput/ReactTextInputLocalData;->mTextSize:F

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/widget/TextView;->getInputType()I

    .line 24
    move-result v0

    .line 25
    .line 26
    iput v0, p0, Lcom/facebook/react/views/textinput/ReactTextInputLocalData;->mInputType:I

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Landroid/widget/TextView;->getHint()Ljava/lang/CharSequence;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    iput-object v0, p0, Lcom/facebook/react/views/textinput/ReactTextInputLocalData;->mPlaceholder:Ljava/lang/CharSequence;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Landroid/widget/TextView;->getMinLines()I

    .line 36
    move-result v0

    .line 37
    .line 38
    iput v0, p0, Lcom/facebook/react/views/textinput/ReactTextInputLocalData;->mMinLines:I

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Landroid/widget/TextView;->getMaxLines()I

    .line 42
    move-result v0

    .line 43
    .line 44
    iput v0, p0, Lcom/facebook/react/views/textinput/ReactTextInputLocalData;->mMaxLines:I

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Landroid/widget/TextView;->getBreakStrategy()I

    .line 48
    move-result p1

    .line 49
    .line 50
    iput p1, p0, Lcom/facebook/react/views/textinput/ReactTextInputLocalData;->mBreakStrategy:I

    .line 51
    return-void
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
.end method


# virtual methods
.method public apply(Landroid/widget/EditText;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/views/textinput/ReactTextInputLocalData;->mText:Landroid/text/SpannableStringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    const/4 v0, 0x0

    .line 7
    .line 8
    iget v1, p0, Lcom/facebook/react/views/textinput/ReactTextInputLocalData;->mTextSize:F

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, v0, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 12
    .line 13
    iget v0, p0, Lcom/facebook/react/views/textinput/ReactTextInputLocalData;->mMinLines:I

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setMinLines(I)V

    .line 17
    .line 18
    iget v0, p0, Lcom/facebook/react/views/textinput/ReactTextInputLocalData;->mMaxLines:I

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 22
    .line 23
    iget v0, p0, Lcom/facebook/react/views/textinput/ReactTextInputLocalData;->mInputType:I

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setInputType(I)V

    .line 27
    .line 28
    iget-object v0, p0, Lcom/facebook/react/views/textinput/ReactTextInputLocalData;->mPlaceholder:Ljava/lang/CharSequence;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 32
    .line 33
    iget v0, p0, Lcom/facebook/react/views/textinput/ReactTextInputLocalData;->mBreakStrategy:I

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setBreakStrategy(I)V

    .line 37
    return-void
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
.end method
