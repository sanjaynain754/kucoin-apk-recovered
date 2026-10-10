.class public Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;
.super Landroid/view/View;
.source "BubbleSeekBar.java"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$j;,
        Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$k;,
        Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;,
        Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$i;,
        Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$l;
    }
.end annotation


# static fields
.field static final NONE:I = -0x1


# instance fields
.field dx:F

.field private hideNoTextSectionMark:Z

.field private isAlwaysShowBubble:Z

.field private isAutoAdjustSectionMark:Z

.field private isFloatType:Z

.field private isHideBubble:Z

.field private isRtl:Z

.field private isSeekBySection:Z

.field private isSeekStepSection:Z

.field private isShowProgressInFloat:Z

.field private isShowSectionMark:Z

.field private isShowSectionText:Z

.field private isShowThumbText:Z

.field private isThumbOnDragging:Z

.field private isTouchToSeek:Z

.field private isTouchToSeekAnimEnd:Z

.field private mAlwaysShowBubbleDelay:J

.field private mAnimDuration:J

.field private mBubbleCenterRawSolidX:F

.field private mBubbleCenterRawSolidY:F

.field private mBubbleCenterRawX:F

.field private mBubbleColor:I

.field private mBubbleRadius:I

.field private mBubbleTextColor:I

.field private mBubbleTextSize:I

.field private mBubbleView:Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;

.field private mCanSeek:Ljava/lang/Boolean;

.field private mConfigBuilder:Lcom/kubi/resources/widget/bubbleseekbar/a;

.field private mCustomStartHandle:Lcom/kubi/resources/widget/bubbleseekbar/c;

.field private mDelta:F

.field private mFillColor:I

.field private mFillSize:I

.field private mFormatCallback:Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$j;

.field private mLayoutParams:Landroid/view/WindowManager$LayoutParams;

.field private mLeft:F

.field private mMax:F

.field private mMin:F

.field private mPaint:Landroid/graphics/Paint;

.field private mPoint:[I

.field private mPreSecValue:F

.field private mPreThumbCenterX:F

.field private mProgress:F

.field private mProgressListener:Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$k;

.field private mRectText:Landroid/graphics/Rect;

.field private mRight:F

.field private mSecondTrackColor:I

.field private mSecondTrackSize:I

.field private mSectionCount:I

.field private mSectionOffset:F

.field private mSectionTextArray:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private mSectionTextColor:I

.field private mSectionTextInterval:I

.field private mSectionTextPosition:I

.field private mSectionTextSize:I

.field private mSectionValue:F

.field private mTextSpace:I

.field private mThumbCenterX:F

.field private mThumbColor:I

.field private mThumbRadius:I

.field private mThumbRadiusOnDragging:I

.field private mThumbTextColor:I

.field private mThumbTextSize:I

.field private mTrackColor:I

.field private mTrackLength:F

.field private mTrackRadius:I

.field private mTrackSize:I

.field private mWindowManager:Landroid/view/WindowManager;

.field private roundMode:I

.field private triggerBubbleShowing:Z

.field private triggerSeekBySection:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 7

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 v0, -0x1

    .line 4
    iput v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionTextPosition:I

    const/4 v1, 0x4

    .line 5
    iput v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->roundMode:I

    .line 6
    new-instance v1, Landroid/util/SparseArray;

    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    iput-object v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionTextArray:Landroid/util/SparseArray;

    const/4 v1, 0x2

    .line 7
    new-array v2, v1, [I

    iput-object v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mPoint:[I

    const/4 v2, 0x1

    .line 8
    iput-boolean v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isTouchToSeekAnimEnd:Z

    .line 9
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mCanSeek:Ljava/lang/Boolean;

    .line 10
    sget-object v3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar:[I

    const/4 v4, 0x0

    invoke-virtual {p1, p2, v3, p3, v4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 11
    sget p3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_min:I

    const/4 v3, 0x0

    invoke-virtual {p2, p3, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p3

    iput p3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mMin:F

    .line 12
    sget p3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_max:I

    const/high16 v3, 0x42c80000    # 100.0f

    invoke-virtual {p2, p3, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p3

    iput p3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mMax:F

    .line 13
    sget p3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_progress:I

    iget v3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mMin:F

    invoke-virtual {p2, p3, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p3

    iput p3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mProgress:F

    .line 14
    sget p3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_is_float_type:I

    invoke-virtual {p2, p3, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p3

    iput-boolean p3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isFloatType:Z

    .line 15
    sget p3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_track_size:I

    invoke-static {v1}, Lcom/kubi/resources/widget/bubbleseekbar/b;->a(I)I

    move-result v3

    invoke-virtual {p2, p3, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mTrackSize:I

    .line 16
    sget v3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_second_track_size:I

    .line 17
    invoke-static {v1}, Lcom/kubi/resources/widget/bubbleseekbar/b;->a(I)I

    move-result v5

    add-int/2addr p3, v5

    .line 18
    invoke-virtual {p2, v3, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSecondTrackSize:I

    .line 19
    sget v3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_track_radius:I

    .line 20
    invoke-static {v1}, Lcom/kubi/resources/widget/bubbleseekbar/b;->a(I)I

    move-result v5

    add-int/2addr p3, v5

    .line 21
    invoke-virtual {p2, v3, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mTrackRadius:I

    .line 22
    sget p3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_thumb_radius:I

    iget v3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSecondTrackSize:I

    .line 23
    invoke-static {v1}, Lcom/kubi/resources/widget/bubbleseekbar/b;->a(I)I

    move-result v5

    add-int/2addr v3, v5

    .line 24
    invoke-virtual {p2, p3, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbRadius:I

    .line 25
    sget p3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_thumb_radius_on_dragging:I

    iget v3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSecondTrackSize:I

    mul-int/2addr v3, v1

    invoke-virtual {p2, p3, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbRadiusOnDragging:I

    .line 26
    sget p3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_section_count:I

    const/16 v3, 0xa

    invoke-virtual {p2, p3, v3}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p3

    iput p3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionCount:I

    .line 27
    sget p3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_fill_size:I

    invoke-static {v1}, Lcom/kubi/resources/widget/bubbleseekbar/b;->a(I)I

    move-result v3

    invoke-virtual {p2, p3, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mFillSize:I

    .line 28
    sget p3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_fill_color:I

    sget v3, Lcom/kubi/sdk/res/R$color;->emphasis:I

    .line 29
    invoke-static {p1, v3}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v5

    .line 30
    invoke-virtual {p2, p3, v5}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p3

    iput p3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mFillColor:I

    .line 31
    sget p3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_track_color:I

    .line 32
    invoke-static {p1, v3}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v5

    .line 33
    invoke-virtual {p2, p3, v5}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p3

    iput p3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mTrackColor:I

    .line 34
    sget p3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_second_track_color:I

    .line 35
    invoke-static {p1, v3}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v3

    .line 36
    invoke-virtual {p2, p3, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p3

    iput p3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSecondTrackColor:I

    .line 37
    sget v3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_thumb_color:I

    invoke-virtual {p2, v3, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p3

    iput p3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbColor:I

    .line 38
    sget p3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_show_section_text:I

    invoke-virtual {p2, p3, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p3

    iput-boolean p3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isShowSectionText:Z

    .line 39
    sget p3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_section_text_size:I

    const/16 v3, 0xe

    invoke-static {v3}, Lcom/kubi/resources/widget/bubbleseekbar/b;->c(I)I

    move-result v5

    invoke-virtual {p2, p3, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionTextSize:I

    .line 40
    sget p3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_section_text_color:I

    iget v5, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mTrackColor:I

    invoke-virtual {p2, p3, v5}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p3

    iput p3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionTextColor:I

    .line 41
    sget p3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_seek_step_section:I

    invoke-virtual {p2, p3, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p3

    iput-boolean p3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isSeekStepSection:Z

    .line 42
    sget p3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_seek_by_section:I

    invoke-virtual {p2, p3, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p3

    iput-boolean p3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isSeekBySection:Z

    .line 43
    sget p3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_section_text_position:I

    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p3

    if-nez p3, :cond_0

    .line 44
    iput v4, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionTextPosition:I

    goto :goto_0

    :cond_0
    if-ne p3, v2, :cond_1

    .line 45
    iput v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionTextPosition:I

    goto :goto_0

    :cond_1
    if-ne p3, v1, :cond_2

    .line 46
    iput v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionTextPosition:I

    goto :goto_0

    .line 47
    :cond_2
    iput v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionTextPosition:I

    .line 48
    :goto_0
    sget p3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_section_text_interval:I

    invoke-virtual {p2, p3, v2}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p3

    iput p3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionTextInterval:I

    .line 49
    sget p3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_show_thumb_text:I

    invoke-virtual {p2, p3, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p3

    iput-boolean p3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isShowThumbText:Z

    .line 50
    sget p3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_thumb_text_size:I

    invoke-static {v3}, Lcom/kubi/resources/widget/bubbleseekbar/b;->c(I)I

    move-result v5

    invoke-virtual {p2, p3, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbTextSize:I

    .line 51
    sget p3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_thumb_text_color:I

    iget v5, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSecondTrackColor:I

    invoke-virtual {p2, p3, v5}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p3

    iput p3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbTextColor:I

    .line 52
    sget p3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_bubble_color:I

    iget v5, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSecondTrackColor:I

    invoke-virtual {p2, p3, v5}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p3

    iput p3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mBubbleColor:I

    .line 53
    sget p3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_bubble_text_size:I

    invoke-static {v3}, Lcom/kubi/resources/widget/bubbleseekbar/b;->c(I)I

    move-result v3

    invoke-virtual {p2, p3, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mBubbleTextSize:I

    .line 54
    sget p3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_bubble_text_color:I

    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p3

    iput p3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mBubbleTextColor:I

    .line 55
    sget p3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_show_section_mark:I

    invoke-virtual {p2, p3, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p3

    iput-boolean p3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isShowSectionMark:Z

    .line 56
    sget p3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_auto_adjust_section_mark:I

    invoke-virtual {p2, p3, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p3

    iput-boolean p3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isAutoAdjustSectionMark:Z

    .line 57
    sget p3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_show_progress_in_float:I

    invoke-virtual {p2, p3, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p3

    iput-boolean p3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isShowProgressInFloat:Z

    .line 58
    sget p3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_anim_duration:I

    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p3

    if-gez p3, :cond_3

    const-wide/16 v5, 0xc8

    goto :goto_1

    :cond_3
    int-to-long v5, p3

    .line 59
    :goto_1
    iput-wide v5, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mAnimDuration:J

    .line 60
    sget p3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_touch_to_seek:I

    invoke-virtual {p2, p3, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p3

    iput-boolean p3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isTouchToSeek:Z

    .line 61
    sget p3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_always_show_bubble:I

    invoke-virtual {p2, p3, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p3

    iput-boolean p3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isAlwaysShowBubble:Z

    .line 62
    sget p3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_always_show_bubble_delay:I

    invoke-virtual {p2, p3, v4}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p3

    if-gez p3, :cond_4

    const-wide/16 v5, 0x0

    goto :goto_2

    :cond_4
    int-to-long v5, p3

    .line 63
    :goto_2
    iput-wide v5, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mAlwaysShowBubbleDelay:J

    .line 64
    sget p3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_hide_bubble:I

    invoke-virtual {p2, p3, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p3

    iput-boolean p3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isHideBubble:Z

    .line 65
    sget p3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_rtl:I

    invoke-virtual {p2, p3, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p3

    iput-boolean p3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isRtl:Z

    .line 66
    sget p3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_android_enabled:I

    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    move-result v0

    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p3

    invoke-virtual {p0, p3}, Landroid/view/View;->setEnabled(Z)V

    .line 67
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 68
    new-instance p2, Landroid/graphics/Paint;

    invoke-direct {p2}, Landroid/graphics/Paint;-><init>()V

    iput-object p2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 69
    invoke-virtual {p2, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 70
    iget-object p2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    sget-object p3, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 71
    iget-object p2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    sget-object p3, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 72
    new-instance p2, Landroid/graphics/Rect;

    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    iput-object p2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mRectText:Landroid/graphics/Rect;

    .line 73
    invoke-static {v1}, Lcom/kubi/resources/widget/bubbleseekbar/b;->a(I)I

    move-result p2

    iput p2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mTextSpace:I

    .line 74
    invoke-direct {p0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->initConfigByPriority()V

    .line 75
    iget-boolean p2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isHideBubble:Z

    if-eqz p2, :cond_5

    return-void

    .line 76
    :cond_5
    const-string p2, "window"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/view/WindowManager;

    iput-object p2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mWindowManager:Landroid/view/WindowManager;

    .line 77
    new-instance p2, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;

    invoke-direct {p2, p0, p1}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;-><init>(Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;Landroid/content/Context;)V

    iput-object p2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mBubbleView:Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;

    .line 78
    iget-boolean p1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isShowProgressInFloat:Z

    if-eqz p1, :cond_6

    .line 79
    invoke-virtual {p0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->getProgressFloat()F

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object p1

    goto :goto_3

    :cond_6
    invoke-virtual {p0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->getProgress()I

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    .line 80
    :goto_3
    invoke-virtual {p2, p1}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;->a(Ljava/lang/String;)V

    .line 81
    new-instance p1, Landroid/view/WindowManager$LayoutParams;

    invoke-direct {p1}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    iput-object p1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mLayoutParams:Landroid/view/WindowManager$LayoutParams;

    const p2, 0x800033

    .line 82
    iput p2, p1, Landroid/view/WindowManager$LayoutParams;->gravity:I

    const/4 p2, -0x2

    .line 83
    iput p2, p1, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 84
    iput p2, p1, Landroid/view/WindowManager$LayoutParams;->height:I

    const/4 p2, -0x3

    .line 85
    iput p2, p1, Landroid/view/WindowManager$LayoutParams;->format:I

    const p2, 0x80028

    .line 86
    iput p2, p1, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 87
    invoke-static {}, Lcom/kubi/resources/widget/bubbleseekbar/b;->b()Z

    move-result p1

    if-nez p1, :cond_8

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x19

    if-lt p1, p2, :cond_7

    goto :goto_4

    .line 88
    :cond_7
    iget-object p1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mLayoutParams:Landroid/view/WindowManager$LayoutParams;

    const/16 p2, 0x7d5

    iput p2, p1, Landroid/view/WindowManager$LayoutParams;->type:I

    goto :goto_5

    .line 89
    :cond_8
    :goto_4
    iget-object p1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mLayoutParams:Landroid/view/WindowManager$LayoutParams;

    iput v1, p1, Landroid/view/WindowManager$LayoutParams;->type:I

    .line 90
    :goto_5
    invoke-direct {p0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->calculateRadiusOfBubble()V

    return-void
.end method

.method public static synthetic access$002(Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;Z)Z
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isTouchToSeekAnimEnd:Z

    .line 3
    return p1
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
.end method

.method public static synthetic access$100(Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->autoAdjustSection()V

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
.end method

.method public static synthetic access$1000(Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;)Z
    .locals 0

    .line 1
    .line 2
    iget-boolean p0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isHideBubble:Z

    .line 3
    return p0
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
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public static synthetic access$1100(Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;)F
    .locals 0

    .line 1
    .line 2
    iget p0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mBubbleCenterRawX:F

    .line 3
    return p0
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
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public static synthetic access$1102(Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;F)F
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mBubbleCenterRawX:F

    .line 3
    return p1
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
.end method

.method public static synthetic access$1200(Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;)F
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->calculateCenterRawXofBubbleView()F

    .line 4
    move-result p0

    .line 5
    return p0
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
.end method

.method public static synthetic access$1300(Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;)Landroid/view/WindowManager$LayoutParams;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mLayoutParams:Landroid/view/WindowManager$LayoutParams;

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
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public static synthetic access$1400(Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;)Landroid/view/WindowManager;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mWindowManager:Landroid/view/WindowManager;

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
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public static synthetic access$1500(Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;)Z
    .locals 0

    .line 1
    .line 2
    iget-boolean p0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isShowProgressInFloat:Z

    .line 3
    return p0
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
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public static synthetic access$1600(Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;)F
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->processProgress()F

    .line 4
    move-result p0

    .line 5
    return p0
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
.end method

.method public static synthetic access$1700(Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;)Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$k;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mProgressListener:Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$k;

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
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public static synthetic access$1800(Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->showBubble()V

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
.end method

.method public static synthetic access$1902(Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;Z)Z
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->triggerBubbleShowing:Z

    .line 3
    return p1
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
.end method

.method public static synthetic access$2000(Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;)I
    .locals 0

    .line 1
    .line 2
    iget p0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mBubbleColor:I

    .line 3
    return p0
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
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public static synthetic access$202(Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;Z)Z
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isThumbOnDragging:Z

    .line 3
    return p1
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
.end method

.method public static synthetic access$2100(Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;)I
    .locals 0

    .line 1
    .line 2
    iget p0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mBubbleTextSize:I

    .line 3
    return p0
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
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public static synthetic access$2200(Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;)I
    .locals 0

    .line 1
    .line 2
    iget p0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mBubbleTextColor:I

    .line 3
    return p0
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
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public static synthetic access$2300(Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;)Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$j;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mFormatCallback:Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$j;

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
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public static synthetic access$300(Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;)Z
    .locals 0

    .line 1
    .line 2
    iget-boolean p0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isAlwaysShowBubble:Z

    .line 3
    return p0
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
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public static synthetic access$400(Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->hideBubble()V

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
.end method

.method public static synthetic access$500(Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;)J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mAnimDuration:J

    .line 3
    return-wide v0
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
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public static synthetic access$600(Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;)Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mBubbleView:Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;

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
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public static synthetic access$702(Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;F)F
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbCenterX:F

    .line 3
    return p1
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
.end method

.method public static synthetic access$802(Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;F)F
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mProgress:F

    .line 3
    return p1
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
.end method

.method public static synthetic access$900(Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;)F
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->calculateProgress()F

    .line 4
    move-result p0

    .line 5
    return p0
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
.end method

.method private autoAdjustSection()V
    .locals 12

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    const/4 v3, 0x0

    .line 5
    move v5, v2

    .line 6
    move v4, v3

    .line 7
    .line 8
    :goto_0
    iget v6, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionCount:I

    .line 9
    .line 10
    if-gt v4, v6, :cond_1

    .line 11
    int-to-float v5, v4

    .line 12
    .line 13
    iget v6, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionOffset:F

    .line 14
    mul-float/2addr v5, v6

    .line 15
    .line 16
    iget v7, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mLeft:F

    .line 17
    add-float/2addr v5, v7

    .line 18
    .line 19
    iget v7, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbCenterX:F

    .line 20
    .line 21
    cmpg-float v8, v5, v7

    .line 22
    .line 23
    if-gtz v8, :cond_0

    .line 24
    sub-float/2addr v7, v5

    .line 25
    .line 26
    cmpg-float v6, v7, v6

    .line 27
    .line 28
    if-gtz v6, :cond_0

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    add-int/2addr v4, v1

    .line 31
    goto :goto_0

    .line 32
    .line 33
    :cond_1
    :goto_1
    iget v6, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbCenterX:F

    .line 34
    float-to-double v6, v6

    .line 35
    .line 36
    .line 37
    invoke-static {v6, v7}, Ljava/math/BigDecimal;->valueOf(D)Ljava/math/BigDecimal;

    .line 38
    move-result-object v6

    .line 39
    .line 40
    iget v7, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->roundMode:I

    .line 41
    .line 42
    .line 43
    invoke-virtual {v6, v1, v7}, Ljava/math/BigDecimal;->setScale(II)Ljava/math/BigDecimal;

    .line 44
    move-result-object v6

    .line 45
    .line 46
    .line 47
    invoke-virtual {v6}, Ljava/math/BigDecimal;->floatValue()F

    .line 48
    move-result v6

    .line 49
    .line 50
    cmpl-float v6, v6, v5

    .line 51
    .line 52
    if-nez v6, :cond_2

    .line 53
    move v6, v1

    .line 54
    goto :goto_2

    .line 55
    :cond_2
    move v6, v3

    .line 56
    .line 57
    :goto_2
    new-instance v7, Landroid/animation/AnimatorSet;

    .line 58
    .line 59
    .line 60
    invoke-direct {v7}, Landroid/animation/AnimatorSet;-><init>()V

    .line 61
    .line 62
    if-nez v6, :cond_4

    .line 63
    .line 64
    iget v8, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbCenterX:F

    .line 65
    .line 66
    sub-float v9, v8, v5

    .line 67
    .line 68
    iget v10, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionOffset:F

    .line 69
    .line 70
    const/high16 v11, 0x40000000    # 2.0f

    .line 71
    .line 72
    div-float v11, v10, v11

    .line 73
    .line 74
    cmpg-float v9, v9, v11

    .line 75
    .line 76
    if-gtz v9, :cond_3

    .line 77
    .line 78
    new-array v4, v0, [F

    .line 79
    .line 80
    aput v8, v4, v3

    .line 81
    .line 82
    aput v5, v4, v1

    .line 83
    .line 84
    .line 85
    invoke-static {v4}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 86
    move-result-object v4

    .line 87
    goto :goto_3

    .line 88
    :cond_3
    add-int/2addr v4, v1

    .line 89
    int-to-float v4, v4

    .line 90
    mul-float/2addr v4, v10

    .line 91
    .line 92
    iget v5, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mLeft:F

    .line 93
    add-float/2addr v4, v5

    .line 94
    .line 95
    new-array v5, v0, [F

    .line 96
    .line 97
    aput v8, v5, v3

    .line 98
    .line 99
    aput v4, v5, v1

    .line 100
    .line 101
    .line 102
    invoke-static {v5}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 103
    move-result-object v4

    .line 104
    .line 105
    :goto_3
    new-instance v5, Landroid/view/animation/LinearInterpolator;

    .line 106
    .line 107
    .line 108
    invoke-direct {v5}, Landroid/view/animation/LinearInterpolator;-><init>()V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v4, v5}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 112
    .line 113
    new-instance v5, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$e;

    .line 114
    .line 115
    .line 116
    invoke-direct {v5, p0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$e;-><init>(Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v4, v5}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 120
    goto :goto_4

    .line 121
    :cond_4
    const/4 v4, 0x0

    .line 122
    .line 123
    :goto_4
    iget-boolean v5, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isHideBubble:Z

    .line 124
    .line 125
    if-eqz v5, :cond_5

    .line 126
    .line 127
    if-nez v6, :cond_8

    .line 128
    .line 129
    iget-wide v5, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mAnimDuration:J

    .line 130
    .line 131
    .line 132
    invoke-virtual {v7, v5, v6}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 133
    move-result-object v0

    .line 134
    .line 135
    new-array v1, v1, [Landroid/animation/Animator;

    .line 136
    .line 137
    aput-object v4, v1, v3

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 141
    goto :goto_5

    .line 142
    .line 143
    :cond_5
    iget-object v5, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mBubbleView:Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;

    .line 144
    .line 145
    iget-boolean v8, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isAlwaysShowBubble:Z

    .line 146
    .line 147
    if-eqz v8, :cond_6

    .line 148
    .line 149
    const/high16 v2, 0x3f800000    # 1.0f

    .line 150
    .line 151
    :cond_6
    new-array v8, v1, [F

    .line 152
    .line 153
    aput v2, v8, v3

    .line 154
    .line 155
    sget-object v2, Landroid/view/View;->ALPHA:Landroid/util/Property;

    .line 156
    .line 157
    .line 158
    invoke-static {v5, v2, v8}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 159
    move-result-object v2

    .line 160
    .line 161
    if-eqz v6, :cond_7

    .line 162
    .line 163
    iget-wide v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mAnimDuration:J

    .line 164
    .line 165
    .line 166
    invoke-virtual {v7, v0, v1}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 167
    move-result-object v0

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0, v2}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 171
    goto :goto_5

    .line 172
    .line 173
    :cond_7
    iget-wide v5, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mAnimDuration:J

    .line 174
    .line 175
    .line 176
    invoke-virtual {v7, v5, v6}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 177
    move-result-object v5

    .line 178
    .line 179
    new-array v0, v0, [Landroid/animation/Animator;

    .line 180
    .line 181
    aput-object v4, v0, v3

    .line 182
    .line 183
    aput-object v2, v0, v1

    .line 184
    .line 185
    .line 186
    invoke-virtual {v5, v0}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 187
    .line 188
    :cond_8
    :goto_5
    new-instance v0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$f;

    .line 189
    .line 190
    .line 191
    invoke-direct {v0, p0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$f;-><init>(Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v7, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v7}, Landroid/animation/AnimatorSet;->start()V

    .line 198
    return-void
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
.end method

.method private calThumbCxWhenSeekStepSection(F)F
    .locals 4

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mLeft:F

    .line 3
    .line 4
    cmpg-float v1, p1, v0

    .line 5
    .line 6
    if-gtz v1, :cond_0

    .line 7
    return v0

    .line 8
    .line 9
    :cond_0
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mRight:F

    .line 10
    .line 11
    cmpl-float v1, p1, v0

    .line 12
    .line 13
    if-ltz v1, :cond_1

    .line 14
    return v0

    .line 15
    :cond_1
    const/4 v0, 0x0

    .line 16
    const/4 v1, 0x0

    .line 17
    .line 18
    :goto_0
    iget v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionCount:I

    .line 19
    .line 20
    if-gt v1, v2, :cond_3

    .line 21
    int-to-float v0, v1

    .line 22
    .line 23
    iget v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionOffset:F

    .line 24
    mul-float/2addr v0, v2

    .line 25
    .line 26
    iget v3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mLeft:F

    .line 27
    add-float/2addr v0, v3

    .line 28
    .line 29
    cmpg-float v3, v0, p1

    .line 30
    .line 31
    if-gtz v3, :cond_2

    .line 32
    .line 33
    sub-float v3, p1, v0

    .line 34
    .line 35
    cmpg-float v2, v3, v2

    .line 36
    .line 37
    if-gtz v2, :cond_2

    .line 38
    goto :goto_1

    .line 39
    .line 40
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 41
    goto :goto_0

    .line 42
    :cond_3
    :goto_1
    sub-float/2addr p1, v0

    .line 43
    .line 44
    iget v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionOffset:F

    .line 45
    .line 46
    const/high16 v3, 0x40000000    # 2.0f

    .line 47
    .line 48
    div-float v3, v2, v3

    .line 49
    .line 50
    cmpg-float p1, p1, v3

    .line 51
    .line 52
    if-gtz p1, :cond_4

    .line 53
    return v0

    .line 54
    .line 55
    :cond_4
    add-int/lit8 v1, v1, 0x1

    .line 56
    int-to-float p1, v1

    .line 57
    mul-float/2addr p1, v2

    .line 58
    .line 59
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mLeft:F

    .line 60
    add-float/2addr p1, v0

    .line 61
    return p1
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
.end method

.method private calculateCenterRawXofBubbleView()F
    .locals 4

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isRtl:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mBubbleCenterRawSolidX:F

    .line 7
    .line 8
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mTrackLength:F

    .line 9
    .line 10
    iget v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mProgress:F

    .line 11
    .line 12
    iget v3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mMin:F

    .line 13
    sub-float/2addr v2, v3

    .line 14
    mul-float/2addr v1, v2

    .line 15
    .line 16
    iget v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mDelta:F

    .line 17
    div-float/2addr v1, v2

    .line 18
    sub-float/2addr v0, v1

    .line 19
    return v0

    .line 20
    .line 21
    :cond_0
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mBubbleCenterRawSolidX:F

    .line 22
    .line 23
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mTrackLength:F

    .line 24
    .line 25
    iget v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mProgress:F

    .line 26
    .line 27
    iget v3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mMin:F

    .line 28
    sub-float/2addr v2, v3

    .line 29
    mul-float/2addr v1, v2

    .line 30
    .line 31
    iget v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mDelta:F

    .line 32
    div-float/2addr v1, v2

    .line 33
    add-float/2addr v0, v1

    .line 34
    return v0
    .line 35
    .line 36
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
.end method

.method private calculateProgress()F
    .locals 2

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isRtl:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mRight:F

    .line 7
    .line 8
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbCenterX:F

    .line 9
    sub-float/2addr v0, v1

    .line 10
    .line 11
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mDelta:F

    .line 12
    mul-float/2addr v0, v1

    .line 13
    .line 14
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mTrackLength:F

    .line 15
    div-float/2addr v0, v1

    .line 16
    .line 17
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mMin:F

    .line 18
    :goto_0
    add-float/2addr v0, v1

    .line 19
    return v0

    .line 20
    .line 21
    :cond_0
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbCenterX:F

    .line 22
    .line 23
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mLeft:F

    .line 24
    sub-float/2addr v0, v1

    .line 25
    .line 26
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mDelta:F

    .line 27
    mul-float/2addr v0, v1

    .line 28
    .line 29
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mTrackLength:F

    .line 30
    div-float/2addr v0, v1

    .line 31
    .line 32
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mMin:F

    .line 33
    goto :goto_0
.end method

.method private calculateRadiusOfBubble()V
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 3
    .line 4
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mBubbleTextSize:I

    .line 5
    int-to-float v1, v1

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 9
    .line 10
    iget-boolean v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isShowProgressInFloat:Z

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-boolean v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isRtl:Z

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mMax:F

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mMin:F

    .line 22
    .line 23
    .line 24
    :goto_0
    invoke-direct {p0, v0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->float2String(F)Ljava/lang/String;

    .line 25
    move-result-object v0

    .line 26
    goto :goto_1

    .line 27
    .line 28
    :cond_1
    iget-boolean v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isRtl:Z

    .line 29
    .line 30
    if-eqz v0, :cond_3

    .line 31
    .line 32
    iget-boolean v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isFloatType:Z

    .line 33
    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mMax:F

    .line 37
    .line 38
    .line 39
    invoke-direct {p0, v0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->float2String(F)Ljava/lang/String;

    .line 40
    move-result-object v0

    .line 41
    goto :goto_1

    .line 42
    .line 43
    :cond_2
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mMax:F

    .line 44
    float-to-int v0, v0

    .line 45
    .line 46
    .line 47
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 48
    move-result-object v0

    .line 49
    goto :goto_1

    .line 50
    .line 51
    :cond_3
    iget-boolean v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isFloatType:Z

    .line 52
    .line 53
    if-eqz v0, :cond_4

    .line 54
    .line 55
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mMin:F

    .line 56
    .line 57
    .line 58
    invoke-direct {p0, v0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->float2String(F)Ljava/lang/String;

    .line 59
    move-result-object v0

    .line 60
    goto :goto_1

    .line 61
    .line 62
    :cond_4
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mMin:F

    .line 63
    float-to-int v0, v0

    .line 64
    .line 65
    .line 66
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 67
    move-result-object v0

    .line 68
    .line 69
    :goto_1
    iget-object v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 73
    move-result v2

    .line 74
    .line 75
    iget-object v3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mRectText:Landroid/graphics/Rect;

    .line 76
    const/4 v4, 0x0

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1, v0, v4, v2, v3}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 80
    .line 81
    iget-object v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mRectText:Landroid/graphics/Rect;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 85
    move-result v0

    .line 86
    .line 87
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mTextSpace:I

    .line 88
    .line 89
    mul-int/lit8 v1, v1, 0x2

    .line 90
    add-int/2addr v0, v1

    .line 91
    .line 92
    shr-int/lit8 v0, v0, 0x1

    .line 93
    .line 94
    iget-boolean v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isShowProgressInFloat:Z

    .line 95
    .line 96
    if-eqz v1, :cond_6

    .line 97
    .line 98
    iget-boolean v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isRtl:Z

    .line 99
    .line 100
    if-eqz v1, :cond_5

    .line 101
    .line 102
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mMin:F

    .line 103
    goto :goto_2

    .line 104
    .line 105
    :cond_5
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mMax:F

    .line 106
    .line 107
    .line 108
    :goto_2
    invoke-direct {p0, v1}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->float2String(F)Ljava/lang/String;

    .line 109
    move-result-object v1

    .line 110
    goto :goto_3

    .line 111
    .line 112
    :cond_6
    iget-boolean v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isRtl:Z

    .line 113
    .line 114
    if-eqz v1, :cond_8

    .line 115
    .line 116
    iget-boolean v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isFloatType:Z

    .line 117
    .line 118
    if-eqz v1, :cond_7

    .line 119
    .line 120
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mMin:F

    .line 121
    .line 122
    .line 123
    invoke-direct {p0, v1}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->float2String(F)Ljava/lang/String;

    .line 124
    move-result-object v1

    .line 125
    goto :goto_3

    .line 126
    .line 127
    :cond_7
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mMin:F

    .line 128
    float-to-int v1, v1

    .line 129
    .line 130
    .line 131
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 132
    move-result-object v1

    .line 133
    goto :goto_3

    .line 134
    .line 135
    :cond_8
    iget-boolean v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isFloatType:Z

    .line 136
    .line 137
    if-eqz v1, :cond_9

    .line 138
    .line 139
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mMax:F

    .line 140
    .line 141
    .line 142
    invoke-direct {p0, v1}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->float2String(F)Ljava/lang/String;

    .line 143
    move-result-object v1

    .line 144
    goto :goto_3

    .line 145
    .line 146
    :cond_9
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mMax:F

    .line 147
    float-to-int v1, v1

    .line 148
    .line 149
    .line 150
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 151
    move-result-object v1

    .line 152
    .line 153
    :goto_3
    iget-object v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 157
    move-result v3

    .line 158
    .line 159
    iget-object v5, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mRectText:Landroid/graphics/Rect;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v2, v1, v4, v3, v5}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 163
    .line 164
    iget-object v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mRectText:Landroid/graphics/Rect;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    .line 168
    move-result v1

    .line 169
    .line 170
    iget v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mTextSpace:I

    .line 171
    .line 172
    mul-int/lit8 v2, v2, 0x2

    .line 173
    add-int/2addr v1, v2

    .line 174
    .line 175
    shr-int/lit8 v1, v1, 0x1

    .line 176
    .line 177
    const/16 v2, 0xe

    .line 178
    .line 179
    .line 180
    invoke-static {v2}, Lcom/kubi/resources/widget/bubbleseekbar/b;->a(I)I

    .line 181
    move-result v2

    .line 182
    .line 183
    iput v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mBubbleRadius:I

    .line 184
    .line 185
    .line 186
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 187
    move-result v0

    .line 188
    .line 189
    .line 190
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    .line 191
    move-result v0

    .line 192
    .line 193
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mTextSpace:I

    .line 194
    add-int/2addr v0, v1

    .line 195
    .line 196
    iput v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mBubbleRadius:I

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
.end method

.method private float2String(F)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->formatFloat(F)F

    .line 4
    move-result p1

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    .line 8
    move-result-object p1

    .line 9
    return-object p1
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
.end method

.method private formatFloat(F)F
    .locals 2

    .line 1
    float-to-double v0, p1

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(D)Ljava/math/BigDecimal;

    .line 5
    move-result-object p1

    .line 6
    .line 7
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->roundMode:I

    .line 8
    const/4 v1, 0x1

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, v1, v0}, Ljava/math/BigDecimal;->setScale(II)Ljava/math/BigDecimal;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/math/BigDecimal;->floatValue()F

    .line 16
    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    return p1

    .line 18
    :catch_0
    const/4 p1, 0x0

    .line 19
    return p1
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
.end method

.method private hideBubble()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mBubbleView:Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    goto :goto_0

    .line 6
    .line 7
    :cond_0
    const/16 v1, 0x8

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 11
    .line 12
    iget-object v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mBubbleView:Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    iget-object v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mWindowManager:Landroid/view/WindowManager;

    .line 21
    .line 22
    iget-object v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mBubbleView:Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;

    .line 23
    .line 24
    .line 25
    invoke-interface {v0, v1}, Landroid/view/WindowManager;->removeViewImmediate(Landroid/view/View;)V

    .line 26
    :cond_1
    :goto_0
    return-void
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method private initConfigByPriority()V
    .locals 6

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mMin:F

    .line 3
    .line 4
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mMax:F

    .line 5
    .line 6
    cmpl-float v0, v0, v1

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    const/4 v0, 0x0

    .line 10
    .line 11
    iput v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mMin:F

    .line 12
    .line 13
    const/high16 v0, 0x42c80000    # 100.0f

    .line 14
    .line 15
    iput v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mMax:F

    .line 16
    .line 17
    :cond_0
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mMin:F

    .line 18
    .line 19
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mMax:F

    .line 20
    .line 21
    cmpl-float v2, v0, v1

    .line 22
    .line 23
    if-lez v2, :cond_1

    .line 24
    .line 25
    iput v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mMax:F

    .line 26
    .line 27
    iput v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mMin:F

    .line 28
    .line 29
    :cond_1
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mProgress:F

    .line 30
    .line 31
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mMin:F

    .line 32
    .line 33
    cmpg-float v0, v0, v1

    .line 34
    .line 35
    if-gez v0, :cond_2

    .line 36
    .line 37
    iput v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mProgress:F

    .line 38
    .line 39
    :cond_2
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mProgress:F

    .line 40
    .line 41
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mMax:F

    .line 42
    .line 43
    cmpl-float v0, v0, v1

    .line 44
    .line 45
    if-lez v0, :cond_3

    .line 46
    .line 47
    iput v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mProgress:F

    .line 48
    .line 49
    :cond_3
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSecondTrackSize:I

    .line 50
    .line 51
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mTrackSize:I

    .line 52
    const/4 v2, 0x2

    .line 53
    .line 54
    if-ge v0, v1, :cond_4

    .line 55
    .line 56
    .line 57
    invoke-static {v2}, Lcom/kubi/resources/widget/bubbleseekbar/b;->a(I)I

    .line 58
    move-result v0

    .line 59
    add-int/2addr v1, v0

    .line 60
    .line 61
    iput v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSecondTrackSize:I

    .line 62
    .line 63
    :cond_4
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbRadius:I

    .line 64
    .line 65
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSecondTrackSize:I

    .line 66
    .line 67
    if-gt v0, v1, :cond_5

    .line 68
    .line 69
    .line 70
    invoke-static {v2}, Lcom/kubi/resources/widget/bubbleseekbar/b;->a(I)I

    .line 71
    move-result v0

    .line 72
    add-int/2addr v1, v0

    .line 73
    .line 74
    iput v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbRadius:I

    .line 75
    .line 76
    :cond_5
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbRadiusOnDragging:I

    .line 77
    .line 78
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSecondTrackSize:I

    .line 79
    .line 80
    if-gt v0, v1, :cond_6

    .line 81
    mul-int/2addr v1, v2

    .line 82
    .line 83
    iput v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbRadiusOnDragging:I

    .line 84
    .line 85
    :cond_6
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionCount:I

    .line 86
    .line 87
    if-gtz v0, :cond_7

    .line 88
    .line 89
    const/16 v0, 0xa

    .line 90
    .line 91
    iput v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionCount:I

    .line 92
    .line 93
    :cond_7
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mMax:F

    .line 94
    .line 95
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mMin:F

    .line 96
    sub-float/2addr v0, v1

    .line 97
    .line 98
    iput v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mDelta:F

    .line 99
    .line 100
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionCount:I

    .line 101
    int-to-float v1, v1

    .line 102
    div-float/2addr v0, v1

    .line 103
    .line 104
    iput v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionValue:F

    .line 105
    .line 106
    const/high16 v1, 0x3f800000    # 1.0f

    .line 107
    .line 108
    cmpg-float v0, v0, v1

    .line 109
    const/4 v1, 0x1

    .line 110
    .line 111
    if-gez v0, :cond_8

    .line 112
    .line 113
    iput-boolean v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isFloatType:Z

    .line 114
    .line 115
    :cond_8
    iget-boolean v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isFloatType:Z

    .line 116
    .line 117
    if-eqz v0, :cond_9

    .line 118
    .line 119
    iput-boolean v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isShowProgressInFloat:Z

    .line 120
    .line 121
    :cond_9
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionTextPosition:I

    .line 122
    const/4 v3, -0x1

    .line 123
    .line 124
    if-eq v0, v3, :cond_a

    .line 125
    .line 126
    iput-boolean v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isShowSectionText:Z

    .line 127
    .line 128
    :cond_a
    iget-boolean v4, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isShowSectionText:Z

    .line 129
    const/4 v5, 0x0

    .line 130
    .line 131
    if-eqz v4, :cond_c

    .line 132
    .line 133
    if-ne v0, v3, :cond_b

    .line 134
    .line 135
    iput v5, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionTextPosition:I

    .line 136
    .line 137
    :cond_b
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionTextPosition:I

    .line 138
    .line 139
    if-ne v0, v2, :cond_c

    .line 140
    .line 141
    iput-boolean v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isShowSectionMark:Z

    .line 142
    .line 143
    :cond_c
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionTextInterval:I

    .line 144
    .line 145
    if-ge v0, v1, :cond_d

    .line 146
    .line 147
    iput v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionTextInterval:I

    .line 148
    .line 149
    .line 150
    :cond_d
    invoke-direct {p0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->initSectionTextArray()V

    .line 151
    .line 152
    iget-boolean v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isSeekStepSection:Z

    .line 153
    .line 154
    if-eqz v0, :cond_e

    .line 155
    .line 156
    iput-boolean v5, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isSeekBySection:Z

    .line 157
    .line 158
    iput-boolean v5, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isAutoAdjustSectionMark:Z

    .line 159
    .line 160
    :cond_e
    iget-boolean v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isAutoAdjustSectionMark:Z

    .line 161
    .line 162
    if-eqz v0, :cond_f

    .line 163
    .line 164
    iget-boolean v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isShowSectionMark:Z

    .line 165
    .line 166
    if-nez v0, :cond_f

    .line 167
    .line 168
    iput-boolean v5, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isAutoAdjustSectionMark:Z

    .line 169
    .line 170
    :cond_f
    iget-boolean v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isSeekBySection:Z

    .line 171
    .line 172
    if-eqz v0, :cond_11

    .line 173
    .line 174
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mMin:F

    .line 175
    .line 176
    iput v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mPreSecValue:F

    .line 177
    .line 178
    iget v3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mProgress:F

    .line 179
    .line 180
    cmpl-float v0, v3, v0

    .line 181
    .line 182
    if-eqz v0, :cond_10

    .line 183
    .line 184
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionValue:F

    .line 185
    .line 186
    iput v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mPreSecValue:F

    .line 187
    .line 188
    :cond_10
    iput-boolean v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isShowSectionMark:Z

    .line 189
    .line 190
    iput-boolean v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isAutoAdjustSectionMark:Z

    .line 191
    .line 192
    :cond_11
    iget-boolean v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isHideBubble:Z

    .line 193
    .line 194
    if-eqz v0, :cond_12

    .line 195
    .line 196
    iput-boolean v5, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isAlwaysShowBubble:Z

    .line 197
    .line 198
    :cond_12
    iget-boolean v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isAlwaysShowBubble:Z

    .line 199
    .line 200
    if-eqz v0, :cond_13

    .line 201
    .line 202
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mProgress:F

    .line 203
    .line 204
    .line 205
    invoke-virtual {p0, v0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->setProgress(F)V

    .line 206
    .line 207
    :cond_13
    iget-boolean v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isFloatType:Z

    .line 208
    .line 209
    if-nez v0, :cond_15

    .line 210
    .line 211
    iget-boolean v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isSeekBySection:Z

    .line 212
    .line 213
    if-nez v0, :cond_15

    .line 214
    .line 215
    iget-boolean v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isShowSectionText:Z

    .line 216
    .line 217
    if-eqz v0, :cond_14

    .line 218
    .line 219
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionTextPosition:I

    .line 220
    .line 221
    if-ne v0, v2, :cond_14

    .line 222
    goto :goto_0

    .line 223
    .line 224
    :cond_14
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbTextSize:I

    .line 225
    goto :goto_1

    .line 226
    .line 227
    :cond_15
    :goto_0
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionTextSize:I

    .line 228
    .line 229
    :goto_1
    iput v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbTextSize:I

    .line 230
    return-void
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
.end method

.method private initSectionTextArray()V
    .locals 8

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionTextPosition:I

    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x2

    .line 6
    .line 7
    if-ne v0, v3, :cond_0

    .line 8
    move v0, v2

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move v0, v1

    .line 11
    .line 12
    :goto_0
    iget v4, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionTextInterval:I

    .line 13
    .line 14
    if-le v4, v2, :cond_1

    .line 15
    .line 16
    iget v4, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionCount:I

    .line 17
    rem-int/2addr v4, v3

    .line 18
    .line 19
    if-nez v4, :cond_1

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    move v2, v1

    .line 22
    .line 23
    :goto_1
    iget v3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionCount:I

    .line 24
    .line 25
    if-gt v1, v3, :cond_8

    .line 26
    .line 27
    iget-boolean v4, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isRtl:Z

    .line 28
    .line 29
    if-eqz v4, :cond_2

    .line 30
    .line 31
    iget v5, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mMax:F

    .line 32
    .line 33
    iget v6, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionValue:F

    .line 34
    int-to-float v7, v1

    .line 35
    mul-float/2addr v6, v7

    .line 36
    sub-float/2addr v5, v6

    .line 37
    goto :goto_2

    .line 38
    .line 39
    :cond_2
    iget v5, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mMin:F

    .line 40
    .line 41
    iget v6, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionValue:F

    .line 42
    int-to-float v7, v1

    .line 43
    mul-float/2addr v6, v7

    .line 44
    add-float/2addr v5, v6

    .line 45
    .line 46
    :goto_2
    if-eqz v0, :cond_4

    .line 47
    .line 48
    if-eqz v2, :cond_5

    .line 49
    .line 50
    iget v3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionTextInterval:I

    .line 51
    .line 52
    rem-int v3, v1, v3

    .line 53
    .line 54
    if-nez v3, :cond_7

    .line 55
    .line 56
    if-eqz v4, :cond_3

    .line 57
    .line 58
    iget v3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mMax:F

    .line 59
    .line 60
    iget v4, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionValue:F

    .line 61
    int-to-float v5, v1

    .line 62
    mul-float/2addr v4, v5

    .line 63
    sub-float/2addr v3, v4

    .line 64
    :goto_3
    move v5, v3

    .line 65
    goto :goto_4

    .line 66
    .line 67
    :cond_3
    iget v3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mMin:F

    .line 68
    .line 69
    iget v4, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionValue:F

    .line 70
    int-to-float v5, v1

    .line 71
    mul-float/2addr v4, v5

    .line 72
    add-float/2addr v3, v4

    .line 73
    goto :goto_3

    .line 74
    .line 75
    :cond_4
    if-eqz v1, :cond_5

    .line 76
    .line 77
    if-eq v1, v3, :cond_5

    .line 78
    goto :goto_6

    .line 79
    .line 80
    :cond_5
    :goto_4
    iget-object v3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionTextArray:Landroid/util/SparseArray;

    .line 81
    .line 82
    iget-boolean v4, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isFloatType:Z

    .line 83
    .line 84
    if-eqz v4, :cond_6

    .line 85
    .line 86
    .line 87
    invoke-direct {p0, v5}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->float2String(F)Ljava/lang/String;

    .line 88
    move-result-object v4

    .line 89
    goto :goto_5

    .line 90
    .line 91
    :cond_6
    new-instance v4, Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 95
    float-to-int v5, v5

    .line 96
    .line 97
    .line 98
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    const-string v5, ""

    .line 101
    .line 102
    .line 103
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    move-result-object v4

    .line 108
    .line 109
    .line 110
    :goto_5
    invoke-virtual {v3, v1, v4}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 111
    .line 112
    :cond_7
    :goto_6
    add-int/lit8 v1, v1, 0x1

    .line 113
    goto :goto_1

    .line 114
    :cond_8
    return-void
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
.end method

.method private isThumbTouched(Landroid/view/MotionEvent;)Z
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    return v1

    .line 9
    .line 10
    :cond_0
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mTrackLength:F

    .line 11
    .line 12
    iget v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mDelta:F

    .line 13
    div-float/2addr v0, v2

    .line 14
    .line 15
    iget v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mProgress:F

    .line 16
    .line 17
    iget v3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mMin:F

    .line 18
    sub-float/2addr v2, v3

    .line 19
    mul-float/2addr v0, v2

    .line 20
    .line 21
    iget-boolean v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isRtl:Z

    .line 22
    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    iget v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mRight:F

    .line 26
    sub-float/2addr v2, v0

    .line 27
    goto :goto_0

    .line 28
    .line 29
    :cond_1
    iget v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mLeft:F

    .line 30
    add-float/2addr v2, v0

    .line 31
    .line 32
    .line 33
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 34
    move-result v0

    .line 35
    int-to-float v0, v0

    .line 36
    .line 37
    const/high16 v3, 0x40000000    # 2.0f

    .line 38
    div-float/2addr v0, v3

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 42
    move-result v3

    .line 43
    sub-float/2addr v3, v2

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 47
    move-result v4

    .line 48
    sub-float/2addr v4, v2

    .line 49
    mul-float/2addr v3, v4

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 53
    move-result v2

    .line 54
    sub-float/2addr v2, v0

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 58
    move-result p1

    .line 59
    sub-float/2addr p1, v0

    .line 60
    mul-float/2addr v2, p1

    .line 61
    add-float/2addr v3, v2

    .line 62
    .line 63
    iget p1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mLeft:F

    .line 64
    .line 65
    const/16 v0, 0x8

    .line 66
    .line 67
    .line 68
    invoke-static {v0}, Lcom/kubi/resources/widget/bubbleseekbar/b;->a(I)I

    .line 69
    move-result v2

    .line 70
    int-to-float v2, v2

    .line 71
    add-float/2addr p1, v2

    .line 72
    .line 73
    iget v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mLeft:F

    .line 74
    .line 75
    .line 76
    invoke-static {v0}, Lcom/kubi/resources/widget/bubbleseekbar/b;->a(I)I

    .line 77
    move-result v0

    .line 78
    int-to-float v0, v0

    .line 79
    add-float/2addr v2, v0

    .line 80
    mul-float/2addr p1, v2

    .line 81
    .line 82
    cmpg-float p1, v3, p1

    .line 83
    .line 84
    if-gtz p1, :cond_2

    .line 85
    const/4 p1, 0x1

    .line 86
    return p1

    .line 87
    :cond_2
    return v1
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
.end method

.method private isTrackTouched(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 10
    move-result v0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 14
    move-result v1

    .line 15
    int-to-float v1, v1

    .line 16
    .line 17
    cmpl-float v0, v0, v1

    .line 18
    .line 19
    if-ltz v0, :cond_0

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 23
    move-result v0

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 27
    move-result v1

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 31
    move-result v2

    .line 32
    sub-int/2addr v1, v2

    .line 33
    int-to-float v1, v1

    .line 34
    .line 35
    cmpg-float v0, v0, v1

    .line 36
    .line 37
    if-gtz v0, :cond_0

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 41
    move-result v0

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 45
    move-result v1

    .line 46
    int-to-float v1, v1

    .line 47
    .line 48
    cmpl-float v0, v0, v1

    .line 49
    .line 50
    if-ltz v0, :cond_0

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 54
    move-result p1

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 58
    move-result v0

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 62
    move-result v1

    .line 63
    sub-int/2addr v0, v1

    .line 64
    int-to-float v0, v0

    .line 65
    .line 66
    cmpg-float p1, p1, v0

    .line 67
    .line 68
    if-gtz p1, :cond_0

    .line 69
    const/4 p1, 0x1

    .line 70
    return p1

    .line 71
    :cond_0
    const/4 p1, 0x0

    .line 72
    return p1
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
.end method

.method private locatePositionInWindow()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mPoint:[I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroid/view/View;->getLocationInWindow([I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    instance-of v1, v0, Landroid/view/View;

    .line 12
    const/4 v2, 0x0

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    check-cast v0, Landroid/view/View;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 20
    move-result v1

    .line 21
    .line 22
    if-lez v1, :cond_0

    .line 23
    .line 24
    iget-object v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mPoint:[I

    .line 25
    .line 26
    aget v3, v1, v2

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 30
    move-result v0

    .line 31
    rem-int/2addr v3, v0

    .line 32
    .line 33
    aput v3, v1, v2

    .line 34
    .line 35
    :cond_0
    iget-boolean v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isRtl:Z

    .line 36
    .line 37
    const/high16 v1, 0x40000000    # 2.0f

    .line 38
    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    iget-object v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mPoint:[I

    .line 42
    .line 43
    aget v0, v0, v2

    .line 44
    int-to-float v0, v0

    .line 45
    .line 46
    iget v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mRight:F

    .line 47
    add-float/2addr v0, v2

    .line 48
    .line 49
    iget-object v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mBubbleView:Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    .line 53
    move-result v2

    .line 54
    int-to-float v2, v2

    .line 55
    div-float/2addr v2, v1

    .line 56
    sub-float/2addr v0, v2

    .line 57
    .line 58
    iput v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mBubbleCenterRawSolidX:F

    .line 59
    goto :goto_0

    .line 60
    .line 61
    :cond_1
    iget-object v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mPoint:[I

    .line 62
    .line 63
    aget v0, v0, v2

    .line 64
    int-to-float v0, v0

    .line 65
    .line 66
    iget v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mLeft:F

    .line 67
    add-float/2addr v0, v2

    .line 68
    .line 69
    iget-object v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mBubbleView:Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    .line 73
    move-result v2

    .line 74
    int-to-float v2, v2

    .line 75
    div-float/2addr v2, v1

    .line 76
    sub-float/2addr v0, v2

    .line 77
    .line 78
    iput v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mBubbleCenterRawSolidX:F

    .line 79
    .line 80
    .line 81
    :goto_0
    invoke-direct {p0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->calculateCenterRawXofBubbleView()F

    .line 82
    move-result v0

    .line 83
    .line 84
    iput v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mBubbleCenterRawX:F

    .line 85
    .line 86
    iget-object v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mPoint:[I

    .line 87
    const/4 v1, 0x1

    .line 88
    .line 89
    aget v0, v0, v1

    .line 90
    .line 91
    iget-object v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mBubbleView:Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    .line 95
    move-result v1

    .line 96
    sub-int/2addr v0, v1

    .line 97
    int-to-float v0, v0

    .line 98
    .line 99
    iput v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mBubbleCenterRawSolidY:F

    .line 100
    .line 101
    const/16 v1, 0x18

    .line 102
    .line 103
    .line 104
    invoke-static {v1}, Lcom/kubi/resources/widget/bubbleseekbar/b;->a(I)I

    .line 105
    move-result v1

    .line 106
    int-to-float v1, v1

    .line 107
    sub-float/2addr v0, v1

    .line 108
    .line 109
    iput v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mBubbleCenterRawSolidY:F

    .line 110
    .line 111
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbRadius:I

    .line 112
    .line 113
    iget v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbRadiusOnDragging:I

    .line 114
    .line 115
    .line 116
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 117
    move-result v1

    .line 118
    const/4 v2, 0x3

    .line 119
    .line 120
    .line 121
    invoke-static {v2}, Lcom/kubi/resources/widget/bubbleseekbar/b;->a(I)I

    .line 122
    move-result v2

    .line 123
    add-int/2addr v1, v2

    .line 124
    int-to-float v1, v1

    .line 125
    sub-float/2addr v0, v1

    .line 126
    .line 127
    iput v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mBubbleCenterRawSolidY:F

    .line 128
    .line 129
    .line 130
    invoke-static {}, Lcom/kubi/resources/widget/bubbleseekbar/b;->b()Z

    .line 131
    move-result v0

    .line 132
    .line 133
    if-eqz v0, :cond_2

    .line 134
    .line 135
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mBubbleCenterRawSolidY:F

    .line 136
    const/4 v1, 0x4

    .line 137
    .line 138
    .line 139
    invoke-static {v1}, Lcom/kubi/resources/widget/bubbleseekbar/b;->a(I)I

    .line 140
    move-result v1

    .line 141
    int-to-float v1, v1

    .line 142
    sub-float/2addr v0, v1

    .line 143
    .line 144
    iput v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mBubbleCenterRawSolidY:F

    .line 145
    .line 146
    .line 147
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 148
    move-result-object v0

    .line 149
    .line 150
    instance-of v1, v0, Landroid/app/Activity;

    .line 151
    .line 152
    if-eqz v1, :cond_3

    .line 153
    .line 154
    check-cast v0, Landroid/app/Activity;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 158
    move-result-object v0

    .line 159
    .line 160
    if-eqz v0, :cond_3

    .line 161
    .line 162
    .line 163
    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 164
    move-result-object v0

    .line 165
    .line 166
    iget v0, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 167
    .line 168
    and-int/lit16 v0, v0, 0x400

    .line 169
    .line 170
    if-eqz v0, :cond_3

    .line 171
    .line 172
    .line 173
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 174
    move-result-object v0

    .line 175
    .line 176
    const-string v1, "dimen"

    .line 177
    .line 178
    const-string v2, "android"

    .line 179
    .line 180
    const-string v3, "status_bar_height"

    .line 181
    .line 182
    .line 183
    invoke-virtual {v0, v3, v1, v2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 184
    move-result v1

    .line 185
    .line 186
    iget v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mBubbleCenterRawSolidY:F

    .line 187
    .line 188
    .line 189
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 190
    move-result v0

    .line 191
    int-to-float v0, v0

    .line 192
    add-float/2addr v2, v0

    .line 193
    .line 194
    iput v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mBubbleCenterRawSolidY:F

    .line 195
    :cond_3
    return-void
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
.end method

.method private processProgress()F
    .locals 6

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mProgress:F

    .line 3
    .line 4
    iget-boolean v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isSeekBySection:Z

    .line 5
    .line 6
    if-eqz v1, :cond_7

    .line 7
    .line 8
    iget-boolean v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->triggerSeekBySection:Z

    .line 9
    .line 10
    if-eqz v1, :cond_7

    .line 11
    .line 12
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionValue:F

    .line 13
    .line 14
    const/high16 v2, 0x40000000    # 2.0f

    .line 15
    div-float/2addr v1, v2

    .line 16
    .line 17
    iget-boolean v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isTouchToSeek:Z

    .line 18
    .line 19
    if-eqz v2, :cond_3

    .line 20
    .line 21
    iget v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mMin:F

    .line 22
    .line 23
    cmpl-float v2, v0, v2

    .line 24
    .line 25
    if-eqz v2, :cond_7

    .line 26
    .line 27
    iget v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mMax:F

    .line 28
    .line 29
    cmpl-float v2, v0, v2

    .line 30
    .line 31
    if-nez v2, :cond_0

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    const/4 v2, 0x0

    .line 34
    .line 35
    :goto_0
    iget v3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionCount:I

    .line 36
    .line 37
    if-gt v2, v3, :cond_3

    .line 38
    int-to-float v3, v2

    .line 39
    .line 40
    iget v4, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionValue:F

    .line 41
    mul-float/2addr v3, v4

    .line 42
    .line 43
    cmpg-float v5, v3, v0

    .line 44
    .line 45
    if-gez v5, :cond_2

    .line 46
    .line 47
    add-float v5, v3, v4

    .line 48
    .line 49
    cmpl-float v5, v5, v0

    .line 50
    .line 51
    if-ltz v5, :cond_2

    .line 52
    add-float/2addr v1, v3

    .line 53
    .line 54
    cmpl-float v0, v1, v0

    .line 55
    .line 56
    if-lez v0, :cond_1

    .line 57
    return v3

    .line 58
    :cond_1
    add-float/2addr v3, v4

    .line 59
    return v3

    .line 60
    .line 61
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 62
    goto :goto_0

    .line 63
    .line 64
    :cond_3
    iget v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mPreSecValue:F

    .line 65
    .line 66
    cmpl-float v3, v0, v2

    .line 67
    .line 68
    if-ltz v3, :cond_4

    .line 69
    add-float/2addr v1, v2

    .line 70
    .line 71
    cmpl-float v0, v0, v1

    .line 72
    .line 73
    if-ltz v0, :cond_5

    .line 74
    .line 75
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionValue:F

    .line 76
    add-float/2addr v2, v0

    .line 77
    .line 78
    iput v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mPreSecValue:F

    .line 79
    return v2

    .line 80
    .line 81
    :cond_4
    sub-float v1, v2, v1

    .line 82
    .line 83
    cmpl-float v0, v0, v1

    .line 84
    .line 85
    if-ltz v0, :cond_6

    .line 86
    :cond_5
    return v2

    .line 87
    .line 88
    :cond_6
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionValue:F

    .line 89
    sub-float/2addr v2, v0

    .line 90
    .line 91
    iput v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mPreSecValue:F

    .line 92
    return v2

    .line 93
    :cond_7
    :goto_1
    return v0
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
.end method

.method private showBubble()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mBubbleView:Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;

    .line 3
    .line 4
    if-eqz v0, :cond_3

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    goto :goto_2

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mLayoutParams:Landroid/view/WindowManager$LayoutParams;

    .line 14
    .line 15
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mBubbleCenterRawX:F

    .line 16
    .line 17
    const/high16 v2, 0x3f000000    # 0.5f

    .line 18
    add-float/2addr v1, v2

    .line 19
    float-to-int v1, v1

    .line 20
    .line 21
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 22
    .line 23
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mBubbleCenterRawSolidY:F

    .line 24
    add-float/2addr v1, v2

    .line 25
    float-to-int v1, v1

    .line 26
    .line 27
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 28
    .line 29
    iget-object v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mBubbleView:Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;

    .line 30
    const/4 v1, 0x0

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 34
    .line 35
    iget-object v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mBubbleView:Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;

    .line 36
    const/4 v1, 0x0

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 40
    .line 41
    iget-object v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mBubbleView:Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 45
    move-result-object v0

    .line 46
    .line 47
    const/high16 v1, 0x3f800000    # 1.0f

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 51
    move-result-object v0

    .line 52
    .line 53
    iget-boolean v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isTouchToSeek:Z

    .line 54
    .line 55
    if-eqz v1, :cond_1

    .line 56
    .line 57
    const-wide/16 v1, 0x0

    .line 58
    goto :goto_0

    .line 59
    .line 60
    :cond_1
    iget-wide v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mAnimDuration:J

    .line 61
    .line 62
    .line 63
    :goto_0
    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 64
    move-result-object v0

    .line 65
    .line 66
    new-instance v1, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$g;

    .line 67
    .line 68
    .line 69
    invoke-direct {v1, p0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$g;-><init>(Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    .line 73
    move-result-object v0

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 77
    .line 78
    iget-object v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mBubbleView:Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;

    .line 79
    .line 80
    iget-boolean v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isShowProgressInFloat:Z

    .line 81
    .line 82
    if-eqz v1, :cond_2

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->getProgressFloat()F

    .line 86
    move-result v1

    .line 87
    .line 88
    .line 89
    invoke-static {v1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    .line 90
    move-result-object v1

    .line 91
    goto :goto_1

    .line 92
    .line 93
    .line 94
    :cond_2
    invoke-virtual {p0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->getProgress()I

    .line 95
    move-result v1

    .line 96
    .line 97
    .line 98
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 99
    move-result-object v1

    .line 100
    .line 101
    .line 102
    :goto_1
    invoke-virtual {v0, v1}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;->a(Ljava/lang/String;)V

    .line 103
    :cond_3
    :goto_2
    return-void
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
.end method


# virtual methods
.method public config(Lcom/kubi/resources/widget/bubbleseekbar/a;)V
    .locals 3

    .line 1
    .line 2
    iget v0, p1, Lcom/kubi/resources/widget/bubbleseekbar/a;->a:F

    .line 3
    .line 4
    iput v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mMin:F

    .line 5
    .line 6
    iget v0, p1, Lcom/kubi/resources/widget/bubbleseekbar/a;->b:F

    .line 7
    .line 8
    iput v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mMax:F

    .line 9
    .line 10
    iget v0, p1, Lcom/kubi/resources/widget/bubbleseekbar/a;->c:F

    .line 11
    .line 12
    iput v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mProgress:F

    .line 13
    .line 14
    iget-boolean v0, p1, Lcom/kubi/resources/widget/bubbleseekbar/a;->d:Z

    .line 15
    .line 16
    iput-boolean v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isFloatType:Z

    .line 17
    .line 18
    iget v0, p1, Lcom/kubi/resources/widget/bubbleseekbar/a;->e:I

    .line 19
    .line 20
    iput v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mTrackSize:I

    .line 21
    .line 22
    iget v0, p1, Lcom/kubi/resources/widget/bubbleseekbar/a;->f:I

    .line 23
    .line 24
    iput v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSecondTrackSize:I

    .line 25
    .line 26
    iget v0, p1, Lcom/kubi/resources/widget/bubbleseekbar/a;->g:I

    .line 27
    .line 28
    iput v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbRadius:I

    .line 29
    .line 30
    iget v0, p1, Lcom/kubi/resources/widget/bubbleseekbar/a;->h:I

    .line 31
    .line 32
    iput v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbRadiusOnDragging:I

    .line 33
    .line 34
    iget v0, p1, Lcom/kubi/resources/widget/bubbleseekbar/a;->i:I

    .line 35
    .line 36
    iput v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mTrackColor:I

    .line 37
    .line 38
    iget v0, p1, Lcom/kubi/resources/widget/bubbleseekbar/a;->j:I

    .line 39
    .line 40
    iput v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSecondTrackColor:I

    .line 41
    .line 42
    iget v0, p1, Lcom/kubi/resources/widget/bubbleseekbar/a;->k:I

    .line 43
    .line 44
    iput v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbColor:I

    .line 45
    .line 46
    iget v0, p1, Lcom/kubi/resources/widget/bubbleseekbar/a;->l:I

    .line 47
    .line 48
    iput v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionCount:I

    .line 49
    .line 50
    iget-boolean v0, p1, Lcom/kubi/resources/widget/bubbleseekbar/a;->m:Z

    .line 51
    .line 52
    iput-boolean v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isShowSectionMark:Z

    .line 53
    .line 54
    iget-boolean v0, p1, Lcom/kubi/resources/widget/bubbleseekbar/a;->n:Z

    .line 55
    .line 56
    iput-boolean v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isAutoAdjustSectionMark:Z

    .line 57
    .line 58
    iget-boolean v0, p1, Lcom/kubi/resources/widget/bubbleseekbar/a;->o:Z

    .line 59
    .line 60
    iput-boolean v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isShowSectionText:Z

    .line 61
    .line 62
    iget v0, p1, Lcom/kubi/resources/widget/bubbleseekbar/a;->p:I

    .line 63
    .line 64
    iput v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionTextSize:I

    .line 65
    .line 66
    iget v0, p1, Lcom/kubi/resources/widget/bubbleseekbar/a;->q:I

    .line 67
    .line 68
    iput v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionTextColor:I

    .line 69
    .line 70
    iget v0, p1, Lcom/kubi/resources/widget/bubbleseekbar/a;->r:I

    .line 71
    .line 72
    iput v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionTextPosition:I

    .line 73
    .line 74
    iget v0, p1, Lcom/kubi/resources/widget/bubbleseekbar/a;->s:I

    .line 75
    .line 76
    iput v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionTextInterval:I

    .line 77
    .line 78
    iget-boolean v0, p1, Lcom/kubi/resources/widget/bubbleseekbar/a;->t:Z

    .line 79
    .line 80
    iput-boolean v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isShowThumbText:Z

    .line 81
    .line 82
    iget v0, p1, Lcom/kubi/resources/widget/bubbleseekbar/a;->u:I

    .line 83
    .line 84
    iput v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbTextSize:I

    .line 85
    .line 86
    iget v0, p1, Lcom/kubi/resources/widget/bubbleseekbar/a;->v:I

    .line 87
    .line 88
    iput v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbTextColor:I

    .line 89
    .line 90
    iget-boolean v0, p1, Lcom/kubi/resources/widget/bubbleseekbar/a;->w:Z

    .line 91
    .line 92
    iput-boolean v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isShowProgressInFloat:Z

    .line 93
    .line 94
    iget-wide v0, p1, Lcom/kubi/resources/widget/bubbleseekbar/a;->x:J

    .line 95
    .line 96
    iput-wide v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mAnimDuration:J

    .line 97
    .line 98
    iget-boolean v0, p1, Lcom/kubi/resources/widget/bubbleseekbar/a;->y:Z

    .line 99
    .line 100
    iput-boolean v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isTouchToSeek:Z

    .line 101
    .line 102
    iget-boolean v0, p1, Lcom/kubi/resources/widget/bubbleseekbar/a;->z:Z

    .line 103
    .line 104
    iput-boolean v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isSeekStepSection:Z

    .line 105
    .line 106
    iget-boolean v0, p1, Lcom/kubi/resources/widget/bubbleseekbar/a;->A:Z

    .line 107
    .line 108
    iput-boolean v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isSeekBySection:Z

    .line 109
    .line 110
    iget v0, p1, Lcom/kubi/resources/widget/bubbleseekbar/a;->B:I

    .line 111
    .line 112
    iput v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mBubbleColor:I

    .line 113
    .line 114
    iget v0, p1, Lcom/kubi/resources/widget/bubbleseekbar/a;->C:I

    .line 115
    .line 116
    iput v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mBubbleTextSize:I

    .line 117
    .line 118
    iget v0, p1, Lcom/kubi/resources/widget/bubbleseekbar/a;->D:I

    .line 119
    .line 120
    iput v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mBubbleTextColor:I

    .line 121
    .line 122
    iget-boolean v0, p1, Lcom/kubi/resources/widget/bubbleseekbar/a;->E:Z

    .line 123
    .line 124
    iput-boolean v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isAlwaysShowBubble:Z

    .line 125
    .line 126
    iget-wide v0, p1, Lcom/kubi/resources/widget/bubbleseekbar/a;->F:J

    .line 127
    .line 128
    iput-wide v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mAlwaysShowBubbleDelay:J

    .line 129
    .line 130
    iget-boolean v0, p1, Lcom/kubi/resources/widget/bubbleseekbar/a;->G:Z

    .line 131
    .line 132
    iput-boolean v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isHideBubble:Z

    .line 133
    .line 134
    iget-boolean v0, p1, Lcom/kubi/resources/widget/bubbleseekbar/a;->H:Z

    .line 135
    .line 136
    iput-boolean v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isRtl:Z

    .line 137
    .line 138
    iget v0, p1, Lcom/kubi/resources/widget/bubbleseekbar/a;->I:I

    .line 139
    .line 140
    iput v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->roundMode:I

    .line 141
    .line 142
    iget-boolean v0, p1, Lcom/kubi/resources/widget/bubbleseekbar/a;->K:Z

    .line 143
    .line 144
    iput-boolean v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->hideNoTextSectionMark:Z

    .line 145
    .line 146
    iget-boolean p1, p1, Lcom/kubi/resources/widget/bubbleseekbar/a;->J:Z

    .line 147
    .line 148
    .line 149
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 150
    move-result-object p1

    .line 151
    .line 152
    iput-object p1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mCanSeek:Ljava/lang/Boolean;

    .line 153
    .line 154
    .line 155
    invoke-direct {p0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->initConfigByPriority()V

    .line 156
    .line 157
    .line 158
    invoke-direct {p0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->calculateRadiusOfBubble()V

    .line 159
    .line 160
    iget-object p1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mProgressListener:Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$k;

    .line 161
    .line 162
    if-eqz p1, :cond_0

    .line 163
    .line 164
    .line 165
    invoke-virtual {p0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->getProgress()I

    .line 166
    move-result v0

    .line 167
    .line 168
    .line 169
    invoke-virtual {p0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->getProgressFloat()F

    .line 170
    move-result v1

    .line 171
    const/4 v2, 0x0

    .line 172
    .line 173
    .line 174
    invoke-interface {p1, p0, v0, v1, v2}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$k;->a(Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;IFZ)V

    .line 175
    .line 176
    iget-object p1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mProgressListener:Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$k;

    .line 177
    .line 178
    .line 179
    invoke-virtual {p0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->getProgress()I

    .line 180
    move-result v0

    .line 181
    .line 182
    .line 183
    invoke-virtual {p0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->getProgressFloat()F

    .line 184
    move-result v1

    .line 185
    .line 186
    .line 187
    invoke-interface {p1, p0, v0, v1, v2}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$k;->c(Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;IFZ)V

    .line 188
    :cond_0
    const/4 p1, 0x0

    .line 189
    .line 190
    iput-object p1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mConfigBuilder:Lcom/kubi/resources/widget/bubbleseekbar/a;

    .line 191
    .line 192
    .line 193
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 194
    return-void
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
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
.end method

.method public correctOffsetWhenContainerOnScrolling()V
    .locals 3

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isHideBubble:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    goto :goto_0

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-direct {p0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->locatePositionInWindow()V

    .line 9
    .line 10
    iget-object v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mBubbleView:Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    iget-boolean v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isAlwaysShowBubble:Z

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    iget-object v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mLayoutParams:Landroid/view/WindowManager$LayoutParams;

    .line 23
    .line 24
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mBubbleCenterRawSolidY:F

    .line 25
    .line 26
    const/high16 v2, 0x3f000000    # 0.5f

    .line 27
    add-float/2addr v1, v2

    .line 28
    float-to-int v1, v1

    .line 29
    .line 30
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 31
    .line 32
    iget-object v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mWindowManager:Landroid/view/WindowManager;

    .line 33
    .line 34
    iget-object v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mBubbleView:Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;

    .line 35
    .line 36
    .line 37
    invoke-interface {v1, v2, v0}, Landroid/view/ViewManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 38
    return-void

    .line 39
    .line 40
    .line 41
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 42
    :cond_2
    :goto_0
    return-void
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
.end method

.method public getConfigBuilder()Lcom/kubi/resources/widget/bubbleseekbar/a;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mConfigBuilder:Lcom/kubi/resources/widget/bubbleseekbar/a;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lcom/kubi/resources/widget/bubbleseekbar/a;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, p0}, Lcom/kubi/resources/widget/bubbleseekbar/a;-><init>(Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;)V

    .line 10
    .line 11
    iput-object v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mConfigBuilder:Lcom/kubi/resources/widget/bubbleseekbar/a;

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mConfigBuilder:Lcom/kubi/resources/widget/bubbleseekbar/a;

    .line 14
    .line 15
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mMin:F

    .line 16
    .line 17
    iput v1, v0, Lcom/kubi/resources/widget/bubbleseekbar/a;->a:F

    .line 18
    .line 19
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mMax:F

    .line 20
    .line 21
    iput v1, v0, Lcom/kubi/resources/widget/bubbleseekbar/a;->b:F

    .line 22
    .line 23
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mProgress:F

    .line 24
    .line 25
    iput v1, v0, Lcom/kubi/resources/widget/bubbleseekbar/a;->c:F

    .line 26
    .line 27
    iget-boolean v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isFloatType:Z

    .line 28
    .line 29
    iput-boolean v1, v0, Lcom/kubi/resources/widget/bubbleseekbar/a;->d:Z

    .line 30
    .line 31
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mTrackSize:I

    .line 32
    .line 33
    iput v1, v0, Lcom/kubi/resources/widget/bubbleseekbar/a;->e:I

    .line 34
    .line 35
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSecondTrackSize:I

    .line 36
    .line 37
    iput v1, v0, Lcom/kubi/resources/widget/bubbleseekbar/a;->f:I

    .line 38
    .line 39
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbRadius:I

    .line 40
    .line 41
    iput v1, v0, Lcom/kubi/resources/widget/bubbleseekbar/a;->g:I

    .line 42
    .line 43
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbRadiusOnDragging:I

    .line 44
    .line 45
    iput v1, v0, Lcom/kubi/resources/widget/bubbleseekbar/a;->h:I

    .line 46
    .line 47
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mTrackColor:I

    .line 48
    .line 49
    iput v1, v0, Lcom/kubi/resources/widget/bubbleseekbar/a;->i:I

    .line 50
    .line 51
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSecondTrackColor:I

    .line 52
    .line 53
    iput v1, v0, Lcom/kubi/resources/widget/bubbleseekbar/a;->j:I

    .line 54
    .line 55
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbColor:I

    .line 56
    .line 57
    iput v1, v0, Lcom/kubi/resources/widget/bubbleseekbar/a;->k:I

    .line 58
    .line 59
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionCount:I

    .line 60
    .line 61
    iput v1, v0, Lcom/kubi/resources/widget/bubbleseekbar/a;->l:I

    .line 62
    .line 63
    iget-boolean v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isShowSectionMark:Z

    .line 64
    .line 65
    iput-boolean v1, v0, Lcom/kubi/resources/widget/bubbleseekbar/a;->m:Z

    .line 66
    .line 67
    iget-boolean v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isAutoAdjustSectionMark:Z

    .line 68
    .line 69
    iput-boolean v1, v0, Lcom/kubi/resources/widget/bubbleseekbar/a;->n:Z

    .line 70
    .line 71
    iget-boolean v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isShowSectionText:Z

    .line 72
    .line 73
    iput-boolean v1, v0, Lcom/kubi/resources/widget/bubbleseekbar/a;->o:Z

    .line 74
    .line 75
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionTextSize:I

    .line 76
    .line 77
    iput v1, v0, Lcom/kubi/resources/widget/bubbleseekbar/a;->p:I

    .line 78
    .line 79
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionTextColor:I

    .line 80
    .line 81
    iput v1, v0, Lcom/kubi/resources/widget/bubbleseekbar/a;->q:I

    .line 82
    .line 83
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionTextPosition:I

    .line 84
    .line 85
    iput v1, v0, Lcom/kubi/resources/widget/bubbleseekbar/a;->r:I

    .line 86
    .line 87
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionTextInterval:I

    .line 88
    .line 89
    iput v1, v0, Lcom/kubi/resources/widget/bubbleseekbar/a;->s:I

    .line 90
    .line 91
    iget-boolean v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isShowThumbText:Z

    .line 92
    .line 93
    iput-boolean v1, v0, Lcom/kubi/resources/widget/bubbleseekbar/a;->t:Z

    .line 94
    .line 95
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbTextSize:I

    .line 96
    .line 97
    iput v1, v0, Lcom/kubi/resources/widget/bubbleseekbar/a;->u:I

    .line 98
    .line 99
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbTextColor:I

    .line 100
    .line 101
    iput v1, v0, Lcom/kubi/resources/widget/bubbleseekbar/a;->v:I

    .line 102
    .line 103
    iget-boolean v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isShowProgressInFloat:Z

    .line 104
    .line 105
    iput-boolean v1, v0, Lcom/kubi/resources/widget/bubbleseekbar/a;->w:Z

    .line 106
    .line 107
    iget-wide v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mAnimDuration:J

    .line 108
    .line 109
    iput-wide v1, v0, Lcom/kubi/resources/widget/bubbleseekbar/a;->x:J

    .line 110
    .line 111
    iget-boolean v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isTouchToSeek:Z

    .line 112
    .line 113
    iput-boolean v1, v0, Lcom/kubi/resources/widget/bubbleseekbar/a;->y:Z

    .line 114
    .line 115
    iget-boolean v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isSeekStepSection:Z

    .line 116
    .line 117
    iput-boolean v1, v0, Lcom/kubi/resources/widget/bubbleseekbar/a;->z:Z

    .line 118
    .line 119
    iget-boolean v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isSeekBySection:Z

    .line 120
    .line 121
    iput-boolean v1, v0, Lcom/kubi/resources/widget/bubbleseekbar/a;->A:Z

    .line 122
    .line 123
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mBubbleColor:I

    .line 124
    .line 125
    iput v1, v0, Lcom/kubi/resources/widget/bubbleseekbar/a;->B:I

    .line 126
    .line 127
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mBubbleTextSize:I

    .line 128
    .line 129
    iput v1, v0, Lcom/kubi/resources/widget/bubbleseekbar/a;->C:I

    .line 130
    .line 131
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mBubbleTextColor:I

    .line 132
    .line 133
    iput v1, v0, Lcom/kubi/resources/widget/bubbleseekbar/a;->D:I

    .line 134
    .line 135
    iget-boolean v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isAlwaysShowBubble:Z

    .line 136
    .line 137
    iput-boolean v1, v0, Lcom/kubi/resources/widget/bubbleseekbar/a;->E:Z

    .line 138
    .line 139
    iget-wide v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mAlwaysShowBubbleDelay:J

    .line 140
    .line 141
    iput-wide v1, v0, Lcom/kubi/resources/widget/bubbleseekbar/a;->F:J

    .line 142
    .line 143
    iget-boolean v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isHideBubble:Z

    .line 144
    .line 145
    iput-boolean v1, v0, Lcom/kubi/resources/widget/bubbleseekbar/a;->G:Z

    .line 146
    .line 147
    iget-boolean v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isRtl:Z

    .line 148
    .line 149
    iput-boolean v1, v0, Lcom/kubi/resources/widget/bubbleseekbar/a;->H:Z

    .line 150
    .line 151
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->roundMode:I

    .line 152
    .line 153
    iput v1, v0, Lcom/kubi/resources/widget/bubbleseekbar/a;->I:I

    .line 154
    .line 155
    iget-boolean v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->hideNoTextSectionMark:Z

    .line 156
    .line 157
    iput-boolean v1, v0, Lcom/kubi/resources/widget/bubbleseekbar/a;->K:Z

    .line 158
    return-object v0
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
.end method

.method public getMax()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mMax:F

    .line 3
    return v0
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
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public getMin()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mMin:F

    .line 3
    return v0
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
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public getOnProgressChangedListener()Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$k;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mProgressListener:Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$k;

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
.end method

.method public getProgress()I
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->processProgress()F

    .line 4
    move-result v0

    .line 5
    float-to-int v0, v0

    .line 6
    return v0
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
.end method

.method public getProgressFloat()F
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->processProgress()F

    .line 4
    move-result v0

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, v0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->formatFloat(F)F

    .line 8
    move-result v0

    .line 9
    return v0
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
.end method

.method public onDetachedFromWindow()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->hideBubble()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

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
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 13

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 7
    move-result v0

    .line 8
    int-to-float v0, v0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 12
    move-result v1

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 16
    move-result v2

    .line 17
    sub-int/2addr v1, v2

    .line 18
    int-to-float v1, v1

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 22
    move-result v2

    .line 23
    .line 24
    iget v3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbRadiusOnDragging:I

    .line 25
    add-int/2addr v2, v3

    .line 26
    int-to-float v5, v2

    .line 27
    .line 28
    iget-boolean v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isShowSectionText:Z

    .line 29
    .line 30
    const/16 v9, 0xa

    .line 31
    .line 32
    const-string v10, "0123456789"

    .line 33
    const/4 v11, 0x1

    .line 34
    const/4 v12, 0x0

    .line 35
    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    iget-object v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 39
    .line 40
    iget v3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionTextColor:I

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 44
    .line 45
    iget-object v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 46
    .line 47
    iget v3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionTextSize:I

    .line 48
    int-to-float v3, v3

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 52
    .line 53
    iget-object v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 54
    .line 55
    iget-object v3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mRectText:Landroid/graphics/Rect;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2, v10, v12, v9, v3}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 59
    .line 60
    iget v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionTextPosition:I

    .line 61
    .line 62
    if-nez v2, :cond_0

    .line 63
    .line 64
    iget-object v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mRectText:Landroid/graphics/Rect;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    .line 68
    move-result v2

    .line 69
    int-to-float v2, v2

    .line 70
    .line 71
    const/high16 v3, 0x40000000    # 2.0f

    .line 72
    div-float/2addr v2, v3

    .line 73
    add-float/2addr v2, v5

    .line 74
    .line 75
    iget-object v4, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionTextArray:Landroid/util/SparseArray;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v4, v12}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 79
    move-result-object v4

    .line 80
    .line 81
    check-cast v4, Ljava/lang/String;

    .line 82
    .line 83
    iget-object v6, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 87
    move-result v7

    .line 88
    .line 89
    iget-object v8, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mRectText:Landroid/graphics/Rect;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v6, v4, v12, v7, v8}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 93
    .line 94
    iget-object v6, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mRectText:Landroid/graphics/Rect;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v6}, Landroid/graphics/Rect;->width()I

    .line 98
    move-result v6

    .line 99
    int-to-float v6, v6

    .line 100
    div-float/2addr v6, v3

    .line 101
    add-float/2addr v6, v0

    .line 102
    .line 103
    iget-object v7, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1, v4, v6, v2, v7}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 107
    .line 108
    iget-object v4, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mRectText:Landroid/graphics/Rect;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v4}, Landroid/graphics/Rect;->width()I

    .line 112
    move-result v4

    .line 113
    .line 114
    iget v6, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mTextSpace:I

    .line 115
    add-int/2addr v4, v6

    .line 116
    int-to-float v4, v4

    .line 117
    add-float/2addr v0, v4

    .line 118
    .line 119
    iget-object v4, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionTextArray:Landroid/util/SparseArray;

    .line 120
    .line 121
    iget v6, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionCount:I

    .line 122
    .line 123
    .line 124
    invoke-virtual {v4, v6}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 125
    move-result-object v4

    .line 126
    .line 127
    check-cast v4, Ljava/lang/String;

    .line 128
    .line 129
    iget-object v6, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 133
    move-result v7

    .line 134
    .line 135
    iget-object v8, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mRectText:Landroid/graphics/Rect;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v6, v4, v12, v7, v8}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 139
    .line 140
    iget-object v6, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mRectText:Landroid/graphics/Rect;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v6}, Landroid/graphics/Rect;->width()I

    .line 144
    move-result v6

    .line 145
    int-to-float v6, v6

    .line 146
    .line 147
    const/high16 v7, 0x3f000000    # 0.5f

    .line 148
    add-float/2addr v6, v7

    .line 149
    div-float/2addr v6, v3

    .line 150
    .line 151
    sub-float v3, v1, v6

    .line 152
    .line 153
    iget-object v6, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 154
    .line 155
    .line 156
    invoke-virtual {p1, v4, v3, v2, v6}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 157
    .line 158
    iget-object v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mRectText:Landroid/graphics/Rect;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    .line 162
    move-result v2

    .line 163
    .line 164
    iget v3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mTextSpace:I

    .line 165
    add-int/2addr v2, v3

    .line 166
    int-to-float v2, v2

    .line 167
    sub-float/2addr v1, v2

    .line 168
    goto :goto_0

    .line 169
    .line 170
    :cond_0
    if-lt v2, v11, :cond_4

    .line 171
    .line 172
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbRadiusOnDragging:I

    .line 173
    int-to-float v0, v0

    .line 174
    add-float/2addr v0, v5

    .line 175
    .line 176
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mTextSpace:I

    .line 177
    int-to-float v1, v1

    .line 178
    add-float/2addr v0, v1

    .line 179
    .line 180
    iget-object v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionTextArray:Landroid/util/SparseArray;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v1, v12}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 184
    move-result-object v1

    .line 185
    .line 186
    check-cast v1, Ljava/lang/String;

    .line 187
    .line 188
    iget-object v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 192
    move-result v3

    .line 193
    .line 194
    iget-object v4, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mRectText:Landroid/graphics/Rect;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v2, v1, v12, v3, v4}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 198
    .line 199
    iget-object v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mRectText:Landroid/graphics/Rect;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    .line 203
    move-result v2

    .line 204
    int-to-float v2, v2

    .line 205
    add-float/2addr v0, v2

    .line 206
    .line 207
    iget v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mLeft:F

    .line 208
    .line 209
    iget v3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionTextPosition:I

    .line 210
    .line 211
    if-ne v3, v11, :cond_1

    .line 212
    .line 213
    iget-object v3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 214
    .line 215
    .line 216
    invoke-virtual {p1, v1, v2, v0, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 217
    .line 218
    :cond_1
    iget-object v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionTextArray:Landroid/util/SparseArray;

    .line 219
    .line 220
    iget v3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionCount:I

    .line 221
    .line 222
    .line 223
    invoke-virtual {v1, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 224
    move-result-object v1

    .line 225
    .line 226
    check-cast v1, Ljava/lang/String;

    .line 227
    .line 228
    iget-object v3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 232
    move-result v4

    .line 233
    .line 234
    iget-object v6, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mRectText:Landroid/graphics/Rect;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v3, v1, v12, v4, v6}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 238
    .line 239
    iget v3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mRight:F

    .line 240
    .line 241
    iget v4, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionTextPosition:I

    .line 242
    .line 243
    if-ne v4, v11, :cond_2

    .line 244
    .line 245
    iget-object v4, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 246
    .line 247
    .line 248
    invoke-virtual {p1, v1, v3, v0, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 249
    :cond_2
    move v0, v2

    .line 250
    move v1, v3

    .line 251
    goto :goto_0

    .line 252
    .line 253
    :cond_3
    iget-boolean v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isShowThumbText:Z

    .line 254
    .line 255
    if-eqz v2, :cond_4

    .line 256
    .line 257
    iget v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionTextPosition:I

    .line 258
    const/4 v3, -0x1

    .line 259
    .line 260
    if-ne v2, v3, :cond_4

    .line 261
    .line 262
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mLeft:F

    .line 263
    .line 264
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mRight:F

    .line 265
    .line 266
    :cond_4
    :goto_0
    iget-boolean v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isShowSectionText:Z

    .line 267
    .line 268
    if-nez v2, :cond_5

    .line 269
    .line 270
    iget-boolean v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isShowThumbText:Z

    .line 271
    .line 272
    if-eqz v2, :cond_6

    .line 273
    .line 274
    :cond_5
    iget v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionTextPosition:I

    .line 275
    .line 276
    if-nez v2, :cond_7

    .line 277
    .line 278
    :cond_6
    iget v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbRadiusOnDragging:I

    .line 279
    int-to-float v3, v2

    .line 280
    add-float/2addr v0, v3

    .line 281
    int-to-float v2, v2

    .line 282
    sub-float/2addr v1, v2

    .line 283
    :cond_7
    move v4, v1

    .line 284
    .line 285
    iget-boolean v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isThumbOnDragging:Z

    .line 286
    .line 287
    if-eqz v1, :cond_8

    .line 288
    .line 289
    iget-boolean v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isAlwaysShowBubble:Z

    .line 290
    .line 291
    if-eqz v1, :cond_a

    .line 292
    .line 293
    :cond_8
    iget-boolean v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isRtl:Z

    .line 294
    .line 295
    if-eqz v1, :cond_9

    .line 296
    .line 297
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mTrackLength:F

    .line 298
    .line 299
    iget v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mDelta:F

    .line 300
    div-float/2addr v1, v2

    .line 301
    .line 302
    iget v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mProgress:F

    .line 303
    .line 304
    iget v3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mMin:F

    .line 305
    sub-float/2addr v2, v3

    .line 306
    mul-float/2addr v1, v2

    .line 307
    .line 308
    sub-float v1, v4, v1

    .line 309
    .line 310
    iput v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbCenterX:F

    .line 311
    goto :goto_1

    .line 312
    .line 313
    :cond_9
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mTrackLength:F

    .line 314
    .line 315
    iget v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mDelta:F

    .line 316
    div-float/2addr v1, v2

    .line 317
    .line 318
    iget v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mProgress:F

    .line 319
    .line 320
    iget v3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mMin:F

    .line 321
    sub-float/2addr v2, v3

    .line 322
    mul-float/2addr v1, v2

    .line 323
    add-float/2addr v1, v0

    .line 324
    .line 325
    iput v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbCenterX:F

    .line 326
    .line 327
    :cond_a
    :goto_1
    iget-object v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 328
    .line 329
    iget v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSecondTrackColor:I

    .line 330
    .line 331
    .line 332
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 333
    .line 334
    iget-object v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 335
    .line 336
    iget v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSecondTrackSize:I

    .line 337
    int-to-float v2, v2

    .line 338
    .line 339
    .line 340
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 341
    .line 342
    iget-boolean v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isRtl:Z

    .line 343
    .line 344
    if-eqz v1, :cond_b

    .line 345
    .line 346
    iget v6, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbCenterX:F

    .line 347
    .line 348
    iget-object v8, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 349
    move v7, v5

    .line 350
    move-object v3, p1

    .line 351
    .line 352
    .line 353
    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 354
    move v1, v4

    .line 355
    move v4, v0

    .line 356
    goto :goto_2

    .line 357
    :cond_b
    move-object v3, p1

    .line 358
    move v1, v4

    .line 359
    .line 360
    iget v6, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbCenterX:F

    .line 361
    .line 362
    iget-object v8, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 363
    move v7, v5

    .line 364
    move v4, v0

    .line 365
    .line 366
    .line 367
    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 368
    .line 369
    :goto_2
    iget-object p1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 370
    .line 371
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mTrackColor:I

    .line 372
    .line 373
    .line 374
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 375
    .line 376
    iget-object p1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 377
    .line 378
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mTrackSize:I

    .line 379
    int-to-float v0, v0

    .line 380
    .line 381
    .line 382
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 383
    .line 384
    iget-boolean p1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isRtl:Z

    .line 385
    .line 386
    if-eqz p1, :cond_c

    .line 387
    move v6, v4

    .line 388
    .line 389
    iget v4, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbCenterX:F

    .line 390
    .line 391
    iget-object v8, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 392
    move v7, v5

    .line 393
    .line 394
    .line 395
    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 396
    move v0, v6

    .line 397
    goto :goto_3

    .line 398
    :cond_c
    move v0, v4

    .line 399
    .line 400
    iget v4, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbCenterX:F

    .line 401
    .line 402
    iget-object v8, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 403
    move v7, v5

    .line 404
    move v6, v1

    .line 405
    .line 406
    .line 407
    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 408
    .line 409
    :goto_3
    iget-boolean p1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isShowSectionText:Z

    .line 410
    .line 411
    if-eqz p1, :cond_d

    .line 412
    .line 413
    iget p1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionTextPosition:I

    .line 414
    const/4 v1, 0x2

    .line 415
    .line 416
    if-ne p1, v1, :cond_d

    .line 417
    move p1, v11

    .line 418
    goto :goto_4

    .line 419
    :cond_d
    move p1, v12

    .line 420
    .line 421
    :goto_4
    if-nez p1, :cond_e

    .line 422
    .line 423
    iget-boolean v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isShowSectionMark:Z

    .line 424
    .line 425
    if-eqz v1, :cond_15

    .line 426
    .line 427
    :cond_e
    iget-object v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 428
    .line 429
    iget v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionTextSize:I

    .line 430
    int-to-float v2, v2

    .line 431
    .line 432
    .line 433
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 434
    .line 435
    iget-object v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 436
    .line 437
    iget-object v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mRectText:Landroid/graphics/Rect;

    .line 438
    .line 439
    .line 440
    invoke-virtual {v1, v10, v12, v9, v2}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 441
    .line 442
    iget-object v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mRectText:Landroid/graphics/Rect;

    .line 443
    .line 444
    .line 445
    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    .line 446
    move-result v1

    .line 447
    int-to-float v1, v1

    .line 448
    add-float/2addr v1, v5

    .line 449
    .line 450
    iget v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbRadiusOnDragging:I

    .line 451
    int-to-float v2, v2

    .line 452
    add-float/2addr v1, v2

    .line 453
    .line 454
    iget v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mTextSpace:I

    .line 455
    int-to-float v2, v2

    .line 456
    add-float/2addr v1, v2

    .line 457
    .line 458
    iget-boolean v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isRtl:Z

    .line 459
    .line 460
    if-eqz v2, :cond_f

    .line 461
    .line 462
    iget v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mRight:F

    .line 463
    .line 464
    iget v4, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mTrackLength:F

    .line 465
    .line 466
    iget v6, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mDelta:F

    .line 467
    div-float/2addr v4, v6

    .line 468
    .line 469
    iget v6, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mProgress:F

    .line 470
    .line 471
    iget v7, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mMin:F

    .line 472
    sub-float/2addr v6, v7

    .line 473
    .line 474
    .line 475
    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    .line 476
    move-result v6

    .line 477
    mul-float/2addr v4, v6

    .line 478
    sub-float/2addr v2, v4

    .line 479
    goto :goto_5

    .line 480
    .line 481
    :cond_f
    iget v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mLeft:F

    .line 482
    .line 483
    iget v4, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mTrackLength:F

    .line 484
    .line 485
    iget v6, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mDelta:F

    .line 486
    div-float/2addr v4, v6

    .line 487
    .line 488
    iget v6, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mProgress:F

    .line 489
    .line 490
    iget v7, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mMin:F

    .line 491
    sub-float/2addr v6, v7

    .line 492
    .line 493
    .line 494
    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    .line 495
    move-result v6

    .line 496
    mul-float/2addr v4, v6

    .line 497
    add-float/2addr v2, v4

    .line 498
    :goto_5
    move v4, v12

    .line 499
    .line 500
    :goto_6
    iget v6, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionCount:I

    .line 501
    .line 502
    if-gt v4, v6, :cond_15

    .line 503
    .line 504
    iget-boolean v6, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->hideNoTextSectionMark:Z

    .line 505
    .line 506
    if-eqz v6, :cond_10

    .line 507
    .line 508
    iget-object v6, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionTextArray:Landroid/util/SparseArray;

    .line 509
    .line 510
    .line 511
    invoke-virtual {v6, v4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 512
    move-result-object v6

    .line 513
    .line 514
    check-cast v6, Ljava/lang/CharSequence;

    .line 515
    .line 516
    .line 517
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 518
    move-result v6

    .line 519
    .line 520
    if-eqz v6, :cond_10

    .line 521
    goto :goto_a

    .line 522
    :cond_10
    int-to-float v6, v4

    .line 523
    .line 524
    iget v7, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionOffset:F

    .line 525
    mul-float/2addr v6, v7

    .line 526
    add-float/2addr v6, v0

    .line 527
    .line 528
    iget-object v7, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 529
    .line 530
    iget v8, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mFillColor:I

    .line 531
    .line 532
    .line 533
    invoke-virtual {v7, v8}, Landroid/graphics/Paint;->setColor(I)V

    .line 534
    .line 535
    iget v7, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mTrackRadius:I

    .line 536
    int-to-float v7, v7

    .line 537
    .line 538
    iget-object v8, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 539
    .line 540
    .line 541
    invoke-virtual {v3, v6, v5, v7, v8}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 542
    .line 543
    iget-boolean v7, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isRtl:Z

    .line 544
    .line 545
    if-eqz v7, :cond_12

    .line 546
    .line 547
    iget-object v7, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 548
    .line 549
    cmpg-float v8, v6, v2

    .line 550
    .line 551
    if-gtz v8, :cond_11

    .line 552
    .line 553
    iget v8, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mTrackColor:I

    .line 554
    goto :goto_7

    .line 555
    .line 556
    :cond_11
    iget v8, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSecondTrackColor:I

    .line 557
    .line 558
    .line 559
    :goto_7
    invoke-virtual {v7, v8}, Landroid/graphics/Paint;->setColor(I)V

    .line 560
    goto :goto_9

    .line 561
    .line 562
    :cond_12
    iget-object v7, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 563
    .line 564
    cmpg-float v8, v6, v2

    .line 565
    .line 566
    if-gtz v8, :cond_13

    .line 567
    .line 568
    iget v8, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSecondTrackColor:I

    .line 569
    goto :goto_8

    .line 570
    .line 571
    :cond_13
    iget v8, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mTrackColor:I

    .line 572
    .line 573
    .line 574
    :goto_8
    invoke-virtual {v7, v8}, Landroid/graphics/Paint;->setColor(I)V

    .line 575
    .line 576
    :goto_9
    iget v7, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mTrackRadius:I

    .line 577
    .line 578
    iget v8, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mFillSize:I

    .line 579
    sub-int/2addr v7, v8

    .line 580
    int-to-float v7, v7

    .line 581
    .line 582
    iget-object v8, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 583
    .line 584
    .line 585
    invoke-virtual {v3, v6, v5, v7, v8}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 586
    .line 587
    if-eqz p1, :cond_14

    .line 588
    .line 589
    iget-object v7, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 590
    .line 591
    iget v8, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionTextColor:I

    .line 592
    .line 593
    .line 594
    invoke-virtual {v7, v8}, Landroid/graphics/Paint;->setColor(I)V

    .line 595
    .line 596
    iget-object v7, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionTextArray:Landroid/util/SparseArray;

    .line 597
    const/4 v8, 0x0

    .line 598
    .line 599
    .line 600
    invoke-virtual {v7, v4, v8}, Landroid/util/SparseArray;->get(ILjava/lang/Object;)Ljava/lang/Object;

    .line 601
    move-result-object v7

    .line 602
    .line 603
    if-eqz v7, :cond_14

    .line 604
    .line 605
    iget-object v7, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionTextArray:Landroid/util/SparseArray;

    .line 606
    .line 607
    .line 608
    invoke-virtual {v7, v4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 609
    move-result-object v7

    .line 610
    .line 611
    check-cast v7, Ljava/lang/String;

    .line 612
    .line 613
    iget-object v8, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 614
    .line 615
    .line 616
    invoke-virtual {v3, v7, v6, v1, v8}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 617
    .line 618
    :cond_14
    :goto_a
    add-int/lit8 v4, v4, 0x1

    .line 619
    goto :goto_6

    .line 620
    .line 621
    :cond_15
    iget-boolean p1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isShowThumbText:Z

    .line 622
    .line 623
    if-eqz p1, :cond_18

    .line 624
    .line 625
    iget-boolean p1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isThumbOnDragging:Z

    .line 626
    .line 627
    if-nez p1, :cond_18

    .line 628
    .line 629
    iget-boolean p1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isTouchToSeekAnimEnd:Z

    .line 630
    .line 631
    if-eqz p1, :cond_18

    .line 632
    .line 633
    iget-object p1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 634
    .line 635
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbTextColor:I

    .line 636
    .line 637
    .line 638
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 639
    .line 640
    iget-object p1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 641
    .line 642
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbTextSize:I

    .line 643
    int-to-float v0, v0

    .line 644
    .line 645
    .line 646
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 647
    .line 648
    iget-object p1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 649
    .line 650
    iget-object v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mRectText:Landroid/graphics/Rect;

    .line 651
    .line 652
    .line 653
    invoke-virtual {p1, v10, v12, v9, v0}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 654
    .line 655
    iget-object p1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mRectText:Landroid/graphics/Rect;

    .line 656
    .line 657
    .line 658
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    .line 659
    move-result p1

    .line 660
    int-to-float p1, p1

    .line 661
    add-float/2addr p1, v5

    .line 662
    .line 663
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbRadiusOnDragging:I

    .line 664
    int-to-float v0, v0

    .line 665
    add-float/2addr p1, v0

    .line 666
    .line 667
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mTextSpace:I

    .line 668
    int-to-float v0, v0

    .line 669
    add-float/2addr p1, v0

    .line 670
    .line 671
    iget-boolean v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isFloatType:Z

    .line 672
    .line 673
    if-nez v0, :cond_17

    .line 674
    .line 675
    iget-boolean v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isShowProgressInFloat:Z

    .line 676
    .line 677
    if-eqz v0, :cond_16

    .line 678
    .line 679
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionTextPosition:I

    .line 680
    .line 681
    if-ne v0, v11, :cond_16

    .line 682
    .line 683
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mProgress:F

    .line 684
    .line 685
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mMin:F

    .line 686
    .line 687
    cmpl-float v1, v0, v1

    .line 688
    .line 689
    if-eqz v1, :cond_16

    .line 690
    .line 691
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mMax:F

    .line 692
    .line 693
    cmpl-float v0, v0, v1

    .line 694
    .line 695
    if-eqz v0, :cond_16

    .line 696
    goto :goto_b

    .line 697
    .line 698
    .line 699
    :cond_16
    invoke-virtual {p0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->getProgress()I

    .line 700
    move-result v0

    .line 701
    .line 702
    .line 703
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 704
    move-result-object v0

    .line 705
    .line 706
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbCenterX:F

    .line 707
    .line 708
    iget-object v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 709
    .line 710
    .line 711
    invoke-virtual {v3, v0, v1, p1, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 712
    goto :goto_c

    .line 713
    .line 714
    .line 715
    :cond_17
    :goto_b
    invoke-virtual {p0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->getProgressFloat()F

    .line 716
    move-result v0

    .line 717
    .line 718
    .line 719
    invoke-static {v0}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    .line 720
    move-result-object v0

    .line 721
    .line 722
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbCenterX:F

    .line 723
    .line 724
    iget-object v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 725
    .line 726
    .line 727
    invoke-virtual {v3, v0, v1, p1, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 728
    .line 729
    :cond_18
    :goto_c
    iget-object p1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 730
    .line 731
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbColor:I

    .line 732
    .line 733
    .line 734
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 735
    .line 736
    iget p1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbCenterX:F

    .line 737
    .line 738
    iget-boolean v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isThumbOnDragging:Z

    .line 739
    .line 740
    if-eqz v0, :cond_19

    .line 741
    .line 742
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbRadiusOnDragging:I

    .line 743
    :goto_d
    int-to-float v0, v0

    .line 744
    goto :goto_e

    .line 745
    .line 746
    :cond_19
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbRadius:I

    .line 747
    goto :goto_d

    .line 748
    .line 749
    :goto_e
    iget-object v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 750
    .line 751
    .line 752
    invoke-virtual {v3, p1, v5, v0, v1}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 753
    .line 754
    iget-object p1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 755
    .line 756
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mFillColor:I

    .line 757
    .line 758
    .line 759
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 760
    .line 761
    iget p1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbCenterX:F

    .line 762
    .line 763
    iget-boolean v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isThumbOnDragging:Z

    .line 764
    .line 765
    if-eqz v0, :cond_1a

    .line 766
    .line 767
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbRadiusOnDragging:I

    .line 768
    .line 769
    :goto_f
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mFillSize:I

    .line 770
    sub-int/2addr v0, v1

    .line 771
    int-to-float v0, v0

    .line 772
    goto :goto_10

    .line 773
    .line 774
    :cond_1a
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbRadius:I

    .line 775
    goto :goto_f

    .line 776
    .line 777
    :goto_10
    iget-object v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 778
    .line 779
    .line 780
    invoke-virtual {v3, p1, v5, v0, v1}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 781
    return-void
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
.end method

.method public onLayout(ZIIII)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-super/range {p0 .. p5}, Landroid/view/View;->onLayout(ZIIII)V

    .line 4
    move-object p1, p0

    .line 5
    .line 6
    iget-boolean p2, p1, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isHideBubble:Z

    .line 7
    .line 8
    if-nez p2, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->locatePositionInWindow()V

    .line 12
    :cond_0
    return-void
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
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
.end method

.method public onMeasure(II)V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 4
    .line 5
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbRadiusOnDragging:I

    .line 6
    .line 7
    mul-int/lit8 v0, v0, 0x2

    .line 8
    .line 9
    iget-boolean v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isShowThumbText:Z

    .line 10
    .line 11
    const-string v2, "j"

    .line 12
    const/4 v3, 0x1

    .line 13
    const/4 v4, 0x0

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iget-object v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 18
    .line 19
    iget v5, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbTextSize:I

    .line 20
    int-to-float v5, v5

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v5}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 24
    .line 25
    iget-object v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 26
    .line 27
    iget-object v5, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mRectText:Landroid/graphics/Rect;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, v2, v4, v3, v5}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 31
    .line 32
    iget-object v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mRectText:Landroid/graphics/Rect;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    .line 36
    move-result v1

    .line 37
    add-int/2addr v0, v1

    .line 38
    .line 39
    :cond_0
    iget-boolean v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isShowSectionText:Z

    .line 40
    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionTextPosition:I

    .line 44
    .line 45
    if-lt v1, v3, :cond_1

    .line 46
    .line 47
    iget-object v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 48
    .line 49
    iget v5, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionTextSize:I

    .line 50
    int-to-float v5, v5

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1, v5}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 54
    .line 55
    iget-object v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 56
    .line 57
    iget-object v5, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mRectText:Landroid/graphics/Rect;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, v2, v4, v3, v5}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 61
    .line 62
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbRadiusOnDragging:I

    .line 63
    .line 64
    mul-int/lit8 v1, v1, 0x2

    .line 65
    .line 66
    iget-object v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mRectText:Landroid/graphics/Rect;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    .line 70
    move-result v2

    .line 71
    add-int/2addr v1, v2

    .line 72
    .line 73
    .line 74
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 75
    move-result v0

    .line 76
    .line 77
    :cond_1
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mTextSpace:I

    .line 78
    .line 79
    mul-int/lit8 v1, v1, 0x2

    .line 80
    add-int/2addr v0, v1

    .line 81
    .line 82
    const/16 v1, 0xb4

    .line 83
    .line 84
    .line 85
    invoke-static {v1}, Lcom/kubi/resources/widget/bubbleseekbar/b;->a(I)I

    .line 86
    move-result v1

    .line 87
    .line 88
    .line 89
    invoke-static {v1, p1}, Landroid/view/View;->resolveSize(II)I

    .line 90
    move-result v1

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0, v1, v0}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 97
    move-result v0

    .line 98
    .line 99
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbRadiusOnDragging:I

    .line 100
    add-int/2addr v0, v1

    .line 101
    int-to-float v0, v0

    .line 102
    .line 103
    iput v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mLeft:F

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 107
    move-result v0

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 111
    move-result v1

    .line 112
    sub-int/2addr v0, v1

    .line 113
    .line 114
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbRadiusOnDragging:I

    .line 115
    sub-int/2addr v0, v1

    .line 116
    int-to-float v0, v0

    .line 117
    .line 118
    iput v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mRight:F

    .line 119
    .line 120
    iget-boolean v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isShowSectionText:Z

    .line 121
    .line 122
    const/high16 v1, 0x40000000    # 2.0f

    .line 123
    .line 124
    if-eqz v0, :cond_3

    .line 125
    .line 126
    iget-object v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 127
    .line 128
    iget v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionTextSize:I

    .line 129
    int-to-float v2, v2

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 133
    .line 134
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionTextPosition:I

    .line 135
    .line 136
    if-nez v0, :cond_2

    .line 137
    .line 138
    iget-object v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionTextArray:Landroid/util/SparseArray;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0, v4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 142
    move-result-object v0

    .line 143
    .line 144
    check-cast v0, Ljava/lang/String;

    .line 145
    .line 146
    iget-object v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 150
    move-result v2

    .line 151
    .line 152
    iget-object v3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mRectText:Landroid/graphics/Rect;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v1, v0, v4, v2, v3}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 156
    .line 157
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mLeft:F

    .line 158
    .line 159
    iget-object v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mRectText:Landroid/graphics/Rect;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    .line 163
    move-result v1

    .line 164
    .line 165
    iget v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mTextSpace:I

    .line 166
    add-int/2addr v1, v2

    .line 167
    int-to-float v1, v1

    .line 168
    add-float/2addr v0, v1

    .line 169
    .line 170
    iput v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mLeft:F

    .line 171
    .line 172
    iget-object v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionTextArray:Landroid/util/SparseArray;

    .line 173
    .line 174
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionCount:I

    .line 175
    .line 176
    .line 177
    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 178
    move-result-object v0

    .line 179
    .line 180
    check-cast v0, Ljava/lang/String;

    .line 181
    .line 182
    iget-object v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 186
    move-result v2

    .line 187
    .line 188
    iget-object v3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mRectText:Landroid/graphics/Rect;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v1, v0, v4, v2, v3}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 192
    .line 193
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mRight:F

    .line 194
    .line 195
    iget-object v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mRectText:Landroid/graphics/Rect;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    .line 199
    move-result v1

    .line 200
    .line 201
    iget v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mTextSpace:I

    .line 202
    add-int/2addr v1, v2

    .line 203
    int-to-float v1, v1

    .line 204
    sub-float/2addr v0, v1

    .line 205
    .line 206
    iput v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mRight:F

    .line 207
    .line 208
    goto/16 :goto_0

    .line 209
    .line 210
    :cond_2
    if-lt v0, v3, :cond_4

    .line 211
    .line 212
    iget-object v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionTextArray:Landroid/util/SparseArray;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v0, v4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 216
    move-result-object v0

    .line 217
    .line 218
    check-cast v0, Ljava/lang/String;

    .line 219
    .line 220
    iget-object v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 221
    .line 222
    .line 223
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 224
    move-result v3

    .line 225
    .line 226
    iget-object v5, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mRectText:Landroid/graphics/Rect;

    .line 227
    .line 228
    .line 229
    invoke-virtual {v2, v0, v4, v3, v5}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 230
    .line 231
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbRadiusOnDragging:I

    .line 232
    int-to-float v0, v0

    .line 233
    .line 234
    iget-object v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mRectText:Landroid/graphics/Rect;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    .line 238
    move-result v2

    .line 239
    int-to-float v2, v2

    .line 240
    div-float/2addr v2, v1

    .line 241
    .line 242
    .line 243
    invoke-static {v0, v2}, Ljava/lang/Math;->max(FF)F

    .line 244
    move-result v0

    .line 245
    .line 246
    .line 247
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 248
    move-result v2

    .line 249
    int-to-float v2, v2

    .line 250
    add-float/2addr v2, v0

    .line 251
    .line 252
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mTextSpace:I

    .line 253
    int-to-float v0, v0

    .line 254
    add-float/2addr v2, v0

    .line 255
    .line 256
    iput v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mLeft:F

    .line 257
    .line 258
    iget-object v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionTextArray:Landroid/util/SparseArray;

    .line 259
    .line 260
    iget v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionCount:I

    .line 261
    .line 262
    .line 263
    invoke-virtual {v0, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 264
    move-result-object v0

    .line 265
    .line 266
    check-cast v0, Ljava/lang/String;

    .line 267
    .line 268
    iget-object v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 269
    .line 270
    .line 271
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 272
    move-result v3

    .line 273
    .line 274
    iget-object v5, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mRectText:Landroid/graphics/Rect;

    .line 275
    .line 276
    .line 277
    invoke-virtual {v2, v0, v4, v3, v5}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 278
    .line 279
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbRadiusOnDragging:I

    .line 280
    int-to-float v0, v0

    .line 281
    .line 282
    iget-object v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mRectText:Landroid/graphics/Rect;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    .line 286
    move-result v2

    .line 287
    int-to-float v2, v2

    .line 288
    div-float/2addr v2, v1

    .line 289
    .line 290
    .line 291
    invoke-static {v0, v2}, Ljava/lang/Math;->max(FF)F

    .line 292
    move-result v0

    .line 293
    .line 294
    .line 295
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 296
    move-result v1

    .line 297
    .line 298
    .line 299
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 300
    move-result v2

    .line 301
    sub-int/2addr v1, v2

    .line 302
    int-to-float v1, v1

    .line 303
    sub-float/2addr v1, v0

    .line 304
    .line 305
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mTextSpace:I

    .line 306
    int-to-float v0, v0

    .line 307
    sub-float/2addr v1, v0

    .line 308
    .line 309
    iput v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mRight:F

    .line 310
    goto :goto_0

    .line 311
    .line 312
    :cond_3
    iget-boolean v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isShowThumbText:Z

    .line 313
    .line 314
    if-eqz v0, :cond_4

    .line 315
    .line 316
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionTextPosition:I

    .line 317
    const/4 v2, -0x1

    .line 318
    .line 319
    if-ne v0, v2, :cond_4

    .line 320
    .line 321
    iget-object v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 322
    .line 323
    iget v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbTextSize:I

    .line 324
    int-to-float v2, v2

    .line 325
    .line 326
    .line 327
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 328
    .line 329
    iget-object v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionTextArray:Landroid/util/SparseArray;

    .line 330
    .line 331
    .line 332
    invoke-virtual {v0, v4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 333
    move-result-object v0

    .line 334
    .line 335
    check-cast v0, Ljava/lang/String;

    .line 336
    .line 337
    iget-object v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 338
    .line 339
    .line 340
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 341
    move-result v3

    .line 342
    .line 343
    iget-object v5, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mRectText:Landroid/graphics/Rect;

    .line 344
    .line 345
    .line 346
    invoke-virtual {v2, v0, v4, v3, v5}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 347
    .line 348
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbRadiusOnDragging:I

    .line 349
    int-to-float v0, v0

    .line 350
    .line 351
    iget-object v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mRectText:Landroid/graphics/Rect;

    .line 352
    .line 353
    .line 354
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    .line 355
    move-result v2

    .line 356
    int-to-float v2, v2

    .line 357
    div-float/2addr v2, v1

    .line 358
    .line 359
    .line 360
    invoke-static {v0, v2}, Ljava/lang/Math;->max(FF)F

    .line 361
    move-result v0

    .line 362
    .line 363
    .line 364
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 365
    move-result v2

    .line 366
    int-to-float v2, v2

    .line 367
    add-float/2addr v2, v0

    .line 368
    .line 369
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mTextSpace:I

    .line 370
    int-to-float v0, v0

    .line 371
    add-float/2addr v2, v0

    .line 372
    .line 373
    iput v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mLeft:F

    .line 374
    .line 375
    iget-object v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionTextArray:Landroid/util/SparseArray;

    .line 376
    .line 377
    iget v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionCount:I

    .line 378
    .line 379
    .line 380
    invoke-virtual {v0, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 381
    move-result-object v0

    .line 382
    .line 383
    check-cast v0, Ljava/lang/String;

    .line 384
    .line 385
    iget-object v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 386
    .line 387
    .line 388
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 389
    move-result v3

    .line 390
    .line 391
    iget-object v5, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mRectText:Landroid/graphics/Rect;

    .line 392
    .line 393
    .line 394
    invoke-virtual {v2, v0, v4, v3, v5}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 395
    .line 396
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbRadiusOnDragging:I

    .line 397
    int-to-float v0, v0

    .line 398
    .line 399
    iget-object v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mRectText:Landroid/graphics/Rect;

    .line 400
    .line 401
    .line 402
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    .line 403
    move-result v2

    .line 404
    int-to-float v2, v2

    .line 405
    div-float/2addr v2, v1

    .line 406
    .line 407
    .line 408
    invoke-static {v0, v2}, Ljava/lang/Math;->max(FF)F

    .line 409
    move-result v0

    .line 410
    .line 411
    .line 412
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 413
    move-result v1

    .line 414
    .line 415
    .line 416
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 417
    move-result v2

    .line 418
    sub-int/2addr v1, v2

    .line 419
    int-to-float v1, v1

    .line 420
    sub-float/2addr v1, v0

    .line 421
    .line 422
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mTextSpace:I

    .line 423
    int-to-float v0, v0

    .line 424
    sub-float/2addr v1, v0

    .line 425
    .line 426
    iput v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mRight:F

    .line 427
    .line 428
    :cond_4
    :goto_0
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mRight:F

    .line 429
    .line 430
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mLeft:F

    .line 431
    sub-float/2addr v0, v1

    .line 432
    .line 433
    iput v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mTrackLength:F

    .line 434
    .line 435
    const/high16 v1, 0x3f800000    # 1.0f

    .line 436
    mul-float/2addr v0, v1

    .line 437
    .line 438
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionCount:I

    .line 439
    int-to-float v1, v1

    .line 440
    div-float/2addr v0, v1

    .line 441
    .line 442
    iput v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionOffset:F

    .line 443
    .line 444
    iget-boolean v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isHideBubble:Z

    .line 445
    .line 446
    if-nez v0, :cond_5

    .line 447
    .line 448
    iget-object v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mBubbleView:Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;

    .line 449
    .line 450
    .line 451
    invoke-virtual {v0, p1, p2}, Landroid/view/View;->measure(II)V

    .line 452
    :cond_5
    return-void
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 1
    .line 2
    instance-of v0, p1, Landroid/os/Bundle;

    .line 3
    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    check-cast p1, Landroid/os/Bundle;

    .line 7
    .line 8
    const-string v0, "progress"

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    .line 12
    move-result v0

    .line 13
    .line 14
    iput v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mProgress:F

    .line 15
    .line 16
    const-string v0, "save_instance"

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 20
    move-result-object p1

    .line 21
    .line 22
    .line 23
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 24
    .line 25
    iget-object p1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mBubbleView:Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;

    .line 26
    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    iget-boolean v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isShowProgressInFloat:Z

    .line 30
    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->getProgressFloat()F

    .line 35
    move-result v0

    .line 36
    .line 37
    .line 38
    invoke-static {v0}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    .line 39
    move-result-object v0

    .line 40
    goto :goto_0

    .line 41
    .line 42
    .line 43
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->getProgress()I

    .line 44
    move-result v0

    .line 45
    .line 46
    .line 47
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 48
    move-result-object v0

    .line 49
    .line 50
    .line 51
    :goto_0
    invoke-virtual {p1, v0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;->a(Ljava/lang/String;)V

    .line 52
    .line 53
    :cond_1
    iget p1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mProgress:F

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0, p1}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->setProgress(F)V

    .line 57
    return-void

    .line 58
    .line 59
    .line 60
    :cond_2
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 61
    return-void
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
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Landroid/os/Bundle;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 6
    .line 7
    const-string v1, "save_instance"

    .line 8
    .line 9
    .line 10
    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    .line 11
    move-result-object v2

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 15
    .line 16
    const-string v1, "progress"

    .line 17
    .line 18
    iget v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mProgress:F

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 22
    return-object v0
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
.end method

.method public onSizeChanged(IIII)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 4
    .line 5
    new-instance p1, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$a;

    .line 6
    .line 7
    .line 8
    invoke-direct {p1, p0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$a;-><init>(Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 12
    return-void
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
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mCanSeek:Ljava/lang/Boolean;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    return v1

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 14
    move-result v0

    .line 15
    const/4 v2, 0x1

    .line 16
    .line 17
    if-eqz v0, :cond_e

    .line 18
    .line 19
    if-eq v0, v2, :cond_7

    .line 20
    const/4 v3, 0x2

    .line 21
    .line 22
    if-eq v0, v3, :cond_1

    .line 23
    const/4 v3, 0x3

    .line 24
    .line 25
    if-eq v0, v3, :cond_7

    .line 26
    .line 27
    goto/16 :goto_7

    .line 28
    .line 29
    :cond_1
    iget-boolean v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isThumbOnDragging:Z

    .line 30
    .line 31
    if-eqz v0, :cond_1a

    .line 32
    .line 33
    iget-boolean v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isSeekStepSection:Z

    .line 34
    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 39
    move-result v0

    .line 40
    .line 41
    .line 42
    invoke-direct {p0, v0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->calThumbCxWhenSeekStepSection(F)F

    .line 43
    move-result v0

    .line 44
    .line 45
    iget v3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mPreThumbCenterX:F

    .line 46
    .line 47
    cmpl-float v3, v0, v3

    .line 48
    .line 49
    if-eqz v3, :cond_1a

    .line 50
    .line 51
    iput v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mPreThumbCenterX:F

    .line 52
    .line 53
    iput v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbCenterX:F

    .line 54
    goto :goto_0

    .line 55
    .line 56
    .line 57
    :cond_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 58
    move-result v0

    .line 59
    .line 60
    iget v3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->dx:F

    .line 61
    add-float/2addr v0, v3

    .line 62
    .line 63
    iput v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbCenterX:F

    .line 64
    .line 65
    iget v3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mLeft:F

    .line 66
    .line 67
    cmpg-float v0, v0, v3

    .line 68
    .line 69
    if-gez v0, :cond_3

    .line 70
    .line 71
    iput v3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbCenterX:F

    .line 72
    .line 73
    :cond_3
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbCenterX:F

    .line 74
    .line 75
    iget v3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mRight:F

    .line 76
    .line 77
    cmpl-float v0, v0, v3

    .line 78
    .line 79
    if-lez v0, :cond_4

    .line 80
    .line 81
    iput v3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbCenterX:F

    .line 82
    .line 83
    .line 84
    :cond_4
    :goto_0
    invoke-direct {p0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->calculateProgress()F

    .line 85
    move-result v0

    .line 86
    .line 87
    iput v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mProgress:F

    .line 88
    .line 89
    iget-boolean v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isHideBubble:Z

    .line 90
    .line 91
    if-nez v0, :cond_6

    .line 92
    .line 93
    iget-object v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mBubbleView:Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 97
    move-result-object v0

    .line 98
    .line 99
    if-eqz v0, :cond_6

    .line 100
    .line 101
    .line 102
    invoke-direct {p0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->calculateCenterRawXofBubbleView()F

    .line 103
    move-result v0

    .line 104
    .line 105
    iput v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mBubbleCenterRawX:F

    .line 106
    .line 107
    iget-object v3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mLayoutParams:Landroid/view/WindowManager$LayoutParams;

    .line 108
    .line 109
    const/high16 v4, 0x3f000000    # 0.5f

    .line 110
    add-float/2addr v0, v4

    .line 111
    float-to-int v0, v0

    .line 112
    .line 113
    iput v0, v3, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 114
    .line 115
    iget-object v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mWindowManager:Landroid/view/WindowManager;

    .line 116
    .line 117
    iget-object v4, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mBubbleView:Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;

    .line 118
    .line 119
    .line 120
    invoke-interface {v0, v4, v3}, Landroid/view/ViewManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 121
    .line 122
    iget-object v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mBubbleView:Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;

    .line 123
    .line 124
    iget-boolean v3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isShowProgressInFloat:Z

    .line 125
    .line 126
    if-eqz v3, :cond_5

    .line 127
    .line 128
    .line 129
    invoke-virtual {p0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->getProgressFloat()F

    .line 130
    move-result v3

    .line 131
    .line 132
    .line 133
    invoke-static {v3}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    .line 134
    move-result-object v3

    .line 135
    goto :goto_1

    .line 136
    .line 137
    .line 138
    :cond_5
    invoke-virtual {p0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->getProgress()I

    .line 139
    move-result v3

    .line 140
    .line 141
    .line 142
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 143
    move-result-object v3

    .line 144
    .line 145
    .line 146
    :goto_1
    invoke-virtual {v0, v3}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;->a(Ljava/lang/String;)V

    .line 147
    goto :goto_2

    .line 148
    .line 149
    .line 150
    :cond_6
    invoke-direct {p0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->processProgress()F

    .line 151
    .line 152
    .line 153
    :goto_2
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 154
    .line 155
    iget-object v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mProgressListener:Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$k;

    .line 156
    .line 157
    if-eqz v0, :cond_1a

    .line 158
    .line 159
    .line 160
    invoke-virtual {p0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->getProgress()I

    .line 161
    move-result v3

    .line 162
    .line 163
    .line 164
    invoke-virtual {p0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->getProgressFloat()F

    .line 165
    move-result v4

    .line 166
    .line 167
    .line 168
    invoke-interface {v0, p0, v3, v4, v2}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$k;->a(Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;IFZ)V

    .line 169
    .line 170
    goto/16 :goto_7

    .line 171
    .line 172
    .line 173
    :cond_7
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 174
    move-result-object v0

    .line 175
    .line 176
    .line 177
    invoke-interface {v0, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 178
    .line 179
    iget-boolean v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isAutoAdjustSectionMark:Z

    .line 180
    .line 181
    if-eqz v0, :cond_9

    .line 182
    .line 183
    iget-boolean v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isTouchToSeek:Z

    .line 184
    .line 185
    if-eqz v0, :cond_8

    .line 186
    .line 187
    new-instance v0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$b;

    .line 188
    .line 189
    .line 190
    invoke-direct {v0, p0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$b;-><init>(Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;)V

    .line 191
    .line 192
    iget-wide v3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mAnimDuration:J

    .line 193
    .line 194
    .line 195
    invoke-virtual {p0, v0, v3, v4}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 196
    goto :goto_4

    .line 197
    .line 198
    .line 199
    :cond_8
    invoke-direct {p0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->autoAdjustSection()V

    .line 200
    goto :goto_4

    .line 201
    .line 202
    :cond_9
    iget-boolean v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isThumbOnDragging:Z

    .line 203
    .line 204
    if-nez v0, :cond_a

    .line 205
    .line 206
    iget-boolean v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isTouchToSeek:Z

    .line 207
    .line 208
    if-eqz v0, :cond_d

    .line 209
    .line 210
    :cond_a
    iget-boolean v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isHideBubble:Z

    .line 211
    .line 212
    if-eqz v0, :cond_c

    .line 213
    .line 214
    .line 215
    invoke-virtual {p0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 216
    move-result-object v0

    .line 217
    .line 218
    iget-wide v3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mAnimDuration:J

    .line 219
    .line 220
    .line 221
    invoke-virtual {v0, v3, v4}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 222
    move-result-object v0

    .line 223
    .line 224
    iget-boolean v3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isThumbOnDragging:Z

    .line 225
    .line 226
    if-nez v3, :cond_b

    .line 227
    .line 228
    iget-boolean v3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isTouchToSeek:Z

    .line 229
    .line 230
    if-eqz v3, :cond_b

    .line 231
    .line 232
    const-wide/16 v3, 0x12c

    .line 233
    goto :goto_3

    .line 234
    .line 235
    :cond_b
    const-wide/16 v3, 0x0

    .line 236
    .line 237
    .line 238
    :goto_3
    invoke-virtual {v0, v3, v4}, Landroid/view/ViewPropertyAnimator;->setStartDelay(J)Landroid/view/ViewPropertyAnimator;

    .line 239
    move-result-object v0

    .line 240
    .line 241
    new-instance v3, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$c;

    .line 242
    .line 243
    .line 244
    invoke-direct {v3, p0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$c;-><init>(Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v0, v3}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    .line 248
    move-result-object v0

    .line 249
    .line 250
    .line 251
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 252
    goto :goto_4

    .line 253
    .line 254
    :cond_c
    new-instance v0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$d;

    .line 255
    .line 256
    .line 257
    invoke-direct {v0, p0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$d;-><init>(Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;)V

    .line 258
    .line 259
    iget-wide v3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mAnimDuration:J

    .line 260
    .line 261
    .line 262
    invoke-virtual {p0, v0, v3, v4}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 263
    .line 264
    :cond_d
    :goto_4
    iget-object v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mProgressListener:Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$k;

    .line 265
    .line 266
    if-eqz v0, :cond_1a

    .line 267
    .line 268
    .line 269
    invoke-virtual {p0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->getProgress()I

    .line 270
    move-result v3

    .line 271
    .line 272
    .line 273
    invoke-virtual {p0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->getProgressFloat()F

    .line 274
    move-result v4

    .line 275
    .line 276
    .line 277
    invoke-interface {v0, p0, v3, v4, v2}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$k;->a(Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;IFZ)V

    .line 278
    .line 279
    iget-object v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mProgressListener:Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$k;

    .line 280
    .line 281
    .line 282
    invoke-virtual {p0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->getProgress()I

    .line 283
    move-result v3

    .line 284
    .line 285
    .line 286
    invoke-virtual {p0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->getProgressFloat()F

    .line 287
    move-result v4

    .line 288
    .line 289
    .line 290
    invoke-interface {v0, p0, v3, v4}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$k;->b(Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;IF)V

    .line 291
    .line 292
    goto/16 :goto_7

    .line 293
    .line 294
    .line 295
    :cond_e
    invoke-direct {p0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->locatePositionInWindow()V

    .line 296
    .line 297
    .line 298
    invoke-virtual {p0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->performClick()Z

    .line 299
    .line 300
    .line 301
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 302
    move-result-object v0

    .line 303
    .line 304
    .line 305
    invoke-interface {v0, v2}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 306
    .line 307
    .line 308
    invoke-direct {p0, p1}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isThumbTouched(Landroid/view/MotionEvent;)Z

    .line 309
    move-result v0

    .line 310
    .line 311
    iput-boolean v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isThumbOnDragging:Z

    .line 312
    .line 313
    if-eqz v0, :cond_12

    .line 314
    .line 315
    iget-boolean v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isSeekBySection:Z

    .line 316
    .line 317
    if-eqz v0, :cond_f

    .line 318
    .line 319
    iget-boolean v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->triggerSeekBySection:Z

    .line 320
    .line 321
    if-nez v0, :cond_f

    .line 322
    .line 323
    iput-boolean v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->triggerSeekBySection:Z

    .line 324
    .line 325
    :cond_f
    iget-boolean v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isAlwaysShowBubble:Z

    .line 326
    .line 327
    if-eqz v0, :cond_10

    .line 328
    .line 329
    iget-boolean v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->triggerBubbleShowing:Z

    .line 330
    .line 331
    if-nez v0, :cond_10

    .line 332
    .line 333
    iput-boolean v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->triggerBubbleShowing:Z

    .line 334
    .line 335
    :cond_10
    iget-boolean v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isHideBubble:Z

    .line 336
    .line 337
    if-nez v0, :cond_11

    .line 338
    .line 339
    .line 340
    invoke-direct {p0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->showBubble()V

    .line 341
    .line 342
    .line 343
    :cond_11
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 344
    goto :goto_6

    .line 345
    .line 346
    :cond_12
    iget-boolean v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isTouchToSeek:Z

    .line 347
    .line 348
    if-eqz v0, :cond_19

    .line 349
    .line 350
    .line 351
    invoke-direct {p0, p1}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isTrackTouched(Landroid/view/MotionEvent;)Z

    .line 352
    move-result v0

    .line 353
    .line 354
    if-eqz v0, :cond_19

    .line 355
    .line 356
    iput-boolean v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isThumbOnDragging:Z

    .line 357
    .line 358
    iget-boolean v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isSeekBySection:Z

    .line 359
    .line 360
    if-eqz v0, :cond_13

    .line 361
    .line 362
    iget-boolean v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->triggerSeekBySection:Z

    .line 363
    .line 364
    if-nez v0, :cond_13

    .line 365
    .line 366
    iput-boolean v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->triggerSeekBySection:Z

    .line 367
    .line 368
    :cond_13
    iget-boolean v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isAlwaysShowBubble:Z

    .line 369
    .line 370
    if-eqz v0, :cond_14

    .line 371
    .line 372
    .line 373
    invoke-direct {p0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->hideBubble()V

    .line 374
    .line 375
    iput-boolean v2, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->triggerBubbleShowing:Z

    .line 376
    .line 377
    :cond_14
    iget-boolean v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isSeekStepSection:Z

    .line 378
    .line 379
    if-eqz v0, :cond_15

    .line 380
    .line 381
    .line 382
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 383
    move-result v0

    .line 384
    .line 385
    .line 386
    invoke-direct {p0, v0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->calThumbCxWhenSeekStepSection(F)F

    .line 387
    move-result v0

    .line 388
    .line 389
    iput v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mPreThumbCenterX:F

    .line 390
    .line 391
    iput v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbCenterX:F

    .line 392
    goto :goto_5

    .line 393
    .line 394
    .line 395
    :cond_15
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 396
    move-result v0

    .line 397
    .line 398
    iput v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbCenterX:F

    .line 399
    .line 400
    iget v3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mLeft:F

    .line 401
    .line 402
    cmpg-float v0, v0, v3

    .line 403
    .line 404
    if-gez v0, :cond_16

    .line 405
    .line 406
    iput v3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbCenterX:F

    .line 407
    .line 408
    :cond_16
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbCenterX:F

    .line 409
    .line 410
    iget v3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mRight:F

    .line 411
    .line 412
    cmpl-float v0, v0, v3

    .line 413
    .line 414
    if-lez v0, :cond_17

    .line 415
    .line 416
    iput v3, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbCenterX:F

    .line 417
    .line 418
    .line 419
    :cond_17
    :goto_5
    invoke-direct {p0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->calculateProgress()F

    .line 420
    move-result v0

    .line 421
    .line 422
    iput v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mProgress:F

    .line 423
    .line 424
    iget-boolean v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isHideBubble:Z

    .line 425
    .line 426
    if-nez v0, :cond_18

    .line 427
    .line 428
    .line 429
    invoke-direct {p0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->calculateCenterRawXofBubbleView()F

    .line 430
    move-result v0

    .line 431
    .line 432
    iput v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mBubbleCenterRawX:F

    .line 433
    .line 434
    .line 435
    invoke-direct {p0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->showBubble()V

    .line 436
    .line 437
    .line 438
    :cond_18
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 439
    .line 440
    :cond_19
    :goto_6
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbCenterX:F

    .line 441
    .line 442
    .line 443
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 444
    move-result v3

    .line 445
    sub-float/2addr v0, v3

    .line 446
    .line 447
    iput v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->dx:F

    .line 448
    .line 449
    :cond_1a
    :goto_7
    iget-boolean v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isThumbOnDragging:Z

    .line 450
    .line 451
    if-nez v0, :cond_1c

    .line 452
    .line 453
    iget-boolean v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isTouchToSeek:Z

    .line 454
    .line 455
    if-nez v0, :cond_1c

    .line 456
    .line 457
    .line 458
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 459
    move-result p1

    .line 460
    .line 461
    if-eqz p1, :cond_1b

    .line 462
    goto :goto_8

    .line 463
    :cond_1b
    return v1

    .line 464
    :cond_1c
    :goto_8
    return v2
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
.end method

.method public onVisibilityChanged(Landroid/view/View;I)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isHideBubble:Z

    .line 3
    .line 4
    if-nez v0, :cond_3

    .line 5
    .line 6
    iget-boolean v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isAlwaysShowBubble:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    goto :goto_1

    .line 10
    .line 11
    :cond_0
    if-eqz p2, :cond_1

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->hideBubble()V

    .line 15
    goto :goto_0

    .line 16
    .line 17
    :cond_1
    iget-boolean v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->triggerBubbleShowing:Z

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    .line 22
    invoke-direct {p0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->showBubble()V

    .line 23
    .line 24
    .line 25
    :cond_2
    :goto_0
    invoke-super {p0, p1, p2}, Landroid/view/View;->onVisibilityChanged(Landroid/view/View;I)V

    .line 26
    :cond_3
    :goto_1
    return-void
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
.end method

.method public performClick()Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Landroid/view/View;->performClick()Z

    .line 4
    move-result v0

    .line 5
    return v0
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
.end method

.method public setBubbleColor(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mBubbleColor:I

    .line 3
    .line 4
    if-eq v0, p1, :cond_0

    .line 5
    .line 6
    iput p1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mBubbleColor:I

    .line 7
    .line 8
    iget-object p1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mBubbleView:Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$BubbleView;

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 14
    :cond_0
    return-void
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
.end method

.method public setCanSeek(Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mCanSeek:Ljava/lang/Boolean;

    .line 3
    return-void
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
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public setCustomSectionTextArray(Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$i;)V
    .locals 3
    .param p1    # Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$i;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionCount:I

    .line 3
    .line 4
    iget-object v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionTextArray:Landroid/util/SparseArray;

    .line 5
    .line 6
    .line 7
    invoke-interface {p1, v0, v1}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$i;->a(ILandroid/util/SparseArray;)Landroid/util/SparseArray;

    .line 8
    move-result-object p1

    .line 9
    .line 10
    iput-object p1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionTextArray:Landroid/util/SparseArray;

    .line 11
    const/4 p1, 0x0

    .line 12
    move v0, p1

    .line 13
    .line 14
    :goto_0
    iget v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionCount:I

    .line 15
    .line 16
    if-gt v0, v1, :cond_1

    .line 17
    .line 18
    iget-object v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionTextArray:Landroid/util/SparseArray;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    iget-object v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSectionTextArray:Landroid/util/SparseArray;

    .line 27
    .line 28
    const-string v2, ""

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v0, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 32
    .line 33
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 34
    goto :goto_0

    .line 35
    .line 36
    :cond_1
    iput-boolean p1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isShowThumbText:Z

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 43
    return-void
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
.end method

.method public setCustomStartHandle(Lcom/kubi/resources/widget/bubbleseekbar/c;)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public setOnProgressChangedListener(Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$k;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mProgressListener:Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$k;

    .line 3
    return-void
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
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public setProgress(F)V
    .locals 3

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mProgress:F

    .line 3
    .line 4
    iget-object p1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mProgressListener:Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$k;

    .line 5
    const/4 v0, 0x0

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->getProgress()I

    .line 11
    move-result v1

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->getProgressFloat()F

    .line 15
    move-result v2

    .line 16
    .line 17
    .line 18
    invoke-interface {p1, p0, v1, v2, v0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$k;->a(Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;IFZ)V

    .line 19
    .line 20
    iget-object p1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mProgressListener:Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$k;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->getProgress()I

    .line 24
    move-result v1

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->getProgressFloat()F

    .line 28
    move-result v2

    .line 29
    .line 30
    .line 31
    invoke-interface {p1, p0, v1, v2, v0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$k;->c(Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;IFZ)V

    .line 32
    .line 33
    :cond_0
    iget-boolean p1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isHideBubble:Z

    .line 34
    .line 35
    if-nez p1, :cond_1

    .line 36
    .line 37
    .line 38
    invoke-direct {p0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->calculateCenterRawXofBubbleView()F

    .line 39
    move-result p1

    .line 40
    .line 41
    iput p1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mBubbleCenterRawX:F

    .line 42
    .line 43
    :cond_1
    iget-boolean p1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isAlwaysShowBubble:Z

    .line 44
    .line 45
    if-eqz p1, :cond_2

    .line 46
    .line 47
    .line 48
    invoke-direct {p0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->hideBubble()V

    .line 49
    .line 50
    new-instance p1, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$h;

    .line 51
    .line 52
    .line 53
    invoke-direct {p1, p0}, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$h;-><init>(Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;)V

    .line 54
    .line 55
    iget-wide v1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mAlwaysShowBubbleDelay:J

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, p1, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 59
    .line 60
    :cond_2
    iget-boolean p1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->isSeekBySection:Z

    .line 61
    .line 62
    if-eqz p1, :cond_3

    .line 63
    .line 64
    iput-boolean v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->triggerSeekBySection:Z

    .line 65
    .line 66
    .line 67
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 68
    return-void
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
.end method

.method public setProgressFormatCallback(Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$j;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mFormatCallback:Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar$j;

    .line 3
    return-void
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
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public setSecondTrackColor(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSecondTrackColor:I

    .line 3
    .line 4
    if-eq v0, p1, :cond_0

    .line 5
    .line 6
    iput p1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mSecondTrackColor:I

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 10
    :cond_0
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
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public setThumbColor(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbColor:I

    .line 3
    .line 4
    if-eq v0, p1, :cond_0

    .line 5
    .line 6
    iput p1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mThumbColor:I

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 10
    :cond_0
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
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public setTrackColor(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mTrackColor:I

    .line 3
    .line 4
    if-eq v0, p1, :cond_0

    .line 5
    .line 6
    iput p1, p0, Lcom/kubi/resources/widget/bubbleseekbar/BubbleSeekBar;->mTrackColor:I

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 10
    :cond_0
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
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method
