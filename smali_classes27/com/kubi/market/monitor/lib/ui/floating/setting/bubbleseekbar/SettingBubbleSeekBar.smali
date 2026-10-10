.class public Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;
.super Landroid/view/View;
.source "SettingBubbleSeekBar.java"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$j;,
        Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$k;,
        Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$BubbleView;,
        Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$i;
    }
.end annotation


# static fields
.field static final NONE:I = -0x1


# instance fields
.field public bubbleMarginBottom:I

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

.field private mBubbleView:Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$BubbleView;

.field private mCanSeek:Ljava/lang/Boolean;

.field private mConfigBuilder:Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;

.field private mCustomStartHandle:Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/a;

.field private mDefaultProgress:F

.field private mDelta:F

.field private mFillColor:I

.field private mFillSize:I

.field private mFormatCallback:Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$j;

.field private mLayoutParams:Landroid/view/WindowManager$LayoutParams;

.field private mLeft:F

.field private mMax:F

.field private mMin:F

.field private mPaint:Landroid/graphics/Paint;

.field private mPoint:[I

.field private mPreSecValue:F

.field private mPreThumbCenterX:F

.field private mProgress:F

.field private mProgressListener:Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$k;

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

.field private showCenterPoint:Z

.field private triggerBubbleShowing:Z

.field private triggerSeekBySection:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 6

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/high16 v0, -0x40800000    # -1.0f

    .line 4
    iput v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mDefaultProgress:F

    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionTextPosition:I

    const/4 v1, 0x4

    .line 6
    iput v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->roundMode:I

    const/4 v1, 0x0

    .line 7
    iput-boolean v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->showCenterPoint:Z

    .line 8
    new-instance v2, Landroid/util/SparseArray;

    invoke-direct {v2}, Landroid/util/SparseArray;-><init>()V

    iput-object v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionTextArray:Landroid/util/SparseArray;

    const/4 v2, 0x2

    .line 9
    new-array v3, v2, [I

    iput-object v3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPoint:[I

    const/4 v3, 0x1

    .line 10
    iput-boolean v3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isTouchToSeekAnimEnd:Z

    .line 11
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v4, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mCanSeek:Ljava/lang/Boolean;

    const/4 v4, 0x3

    .line 12
    iput v4, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->bubbleMarginBottom:I

    .line 13
    sget-object v4, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar:[I

    invoke-virtual {p1, p2, v4, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 14
    sget p3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_min:I

    const/4 v4, 0x0

    invoke-virtual {p2, p3, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p3

    iput p3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mMin:F

    .line 15
    sget p3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_max:I

    const/high16 v4, 0x42c80000    # 100.0f

    invoke-virtual {p2, p3, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p3

    iput p3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mMax:F

    .line 16
    sget p3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_progress:I

    iget v4, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mMin:F

    invoke-virtual {p2, p3, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p3

    iput p3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mProgress:F

    .line 17
    sget p3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_is_float_type:I

    invoke-virtual {p2, p3, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p3

    iput-boolean p3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isFloatType:Z

    .line 18
    sget p3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_track_size:I

    invoke-static {v2}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/c;->b(I)I

    move-result v4

    invoke-virtual {p2, p3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mTrackSize:I

    .line 19
    sget v4, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_second_track_size:I

    .line 20
    invoke-static {v2}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/c;->b(I)I

    move-result v5

    add-int/2addr p3, v5

    .line 21
    invoke-virtual {p2, v4, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSecondTrackSize:I

    .line 22
    sget v4, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_track_radius:I

    .line 23
    invoke-static {v2}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/c;->b(I)I

    move-result v5

    add-int/2addr p3, v5

    .line 24
    invoke-virtual {p2, v4, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mTrackRadius:I

    .line 25
    sget p3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_thumb_radius:I

    iget v4, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSecondTrackSize:I

    .line 26
    invoke-static {v2}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/c;->b(I)I

    move-result v5

    add-int/2addr v4, v5

    .line 27
    invoke-virtual {p2, p3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbRadius:I

    .line 28
    sget p3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_thumb_radius_on_dragging:I

    iget v4, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSecondTrackSize:I

    mul-int/2addr v4, v2

    invoke-virtual {p2, p3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbRadiusOnDragging:I

    .line 29
    sget p3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_section_count:I

    const/16 v4, 0xa

    invoke-virtual {p2, p3, v4}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p3

    iput p3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionCount:I

    .line 30
    sget p3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_fill_size:I

    invoke-static {v2}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/c;->b(I)I

    move-result v4

    invoke-virtual {p2, p3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mFillSize:I

    .line 31
    sget p3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_fill_color:I

    sget v4, Lcom/kubi/sdk/res/R$color;->emphasis:I

    .line 32
    invoke-static {p1, v4}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v5

    .line 33
    invoke-virtual {p2, p3, v5}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p3

    iput p3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mFillColor:I

    .line 34
    sget p3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_track_color:I

    .line 35
    invoke-static {p1, v4}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v5

    .line 36
    invoke-virtual {p2, p3, v5}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p3

    iput p3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mTrackColor:I

    .line 37
    sget p3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_second_track_color:I

    .line 38
    invoke-static {p1, v4}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v4

    .line 39
    invoke-virtual {p2, p3, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p3

    iput p3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSecondTrackColor:I

    .line 40
    sget v4, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_thumb_color:I

    invoke-virtual {p2, v4, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p3

    iput p3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbColor:I

    .line 41
    sget p3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_show_section_text:I

    invoke-virtual {p2, p3, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p3

    iput-boolean p3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isShowSectionText:Z

    .line 42
    sget p3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_section_text_size:I

    const/16 v4, 0xe

    invoke-static {v4}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/c;->d(I)I

    move-result v5

    invoke-virtual {p2, p3, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionTextSize:I

    .line 43
    sget p3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_section_text_color:I

    iget v5, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mTrackColor:I

    invoke-virtual {p2, p3, v5}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p3

    iput p3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionTextColor:I

    .line 44
    sget p3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_seek_step_section:I

    invoke-virtual {p2, p3, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p3

    iput-boolean p3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isSeekStepSection:Z

    .line 45
    sget p3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_seek_by_section:I

    invoke-virtual {p2, p3, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p3

    iput-boolean p3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isSeekBySection:Z

    .line 46
    sget p3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_section_text_position:I

    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p3

    if-nez p3, :cond_0

    .line 47
    iput v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionTextPosition:I

    goto :goto_0

    :cond_0
    if-ne p3, v3, :cond_1

    .line 48
    iput v3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionTextPosition:I

    goto :goto_0

    :cond_1
    if-ne p3, v2, :cond_2

    .line 49
    iput v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionTextPosition:I

    goto :goto_0

    .line 50
    :cond_2
    iput v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionTextPosition:I

    .line 51
    :goto_0
    sget p3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_section_text_interval:I

    invoke-virtual {p2, p3, v3}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p3

    iput p3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionTextInterval:I

    .line 52
    sget p3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_show_thumb_text:I

    invoke-virtual {p2, p3, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p3

    iput-boolean p3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isShowThumbText:Z

    .line 53
    sget p3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_thumb_text_size:I

    invoke-static {v4}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/c;->d(I)I

    move-result v5

    invoke-virtual {p2, p3, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbTextSize:I

    .line 54
    sget p3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_thumb_text_color:I

    iget v5, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSecondTrackColor:I

    invoke-virtual {p2, p3, v5}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p3

    iput p3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbTextColor:I

    .line 55
    sget p3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_bubble_color:I

    iget v5, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSecondTrackColor:I

    invoke-virtual {p2, p3, v5}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p3

    iput p3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mBubbleColor:I

    .line 56
    sget p3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_bubble_text_size:I

    invoke-static {v4}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/c;->d(I)I

    move-result v4

    invoke-virtual {p2, p3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mBubbleTextSize:I

    .line 57
    sget p3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_bubble_text_color:I

    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p3

    iput p3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mBubbleTextColor:I

    .line 58
    sget p3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_show_section_mark:I

    invoke-virtual {p2, p3, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p3

    iput-boolean p3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isShowSectionMark:Z

    .line 59
    sget p3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_auto_adjust_section_mark:I

    invoke-virtual {p2, p3, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p3

    iput-boolean p3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isAutoAdjustSectionMark:Z

    .line 60
    sget p3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_show_progress_in_float:I

    invoke-virtual {p2, p3, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p3

    iput-boolean p3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isShowProgressInFloat:Z

    .line 61
    sget p3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_anim_duration:I

    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p3

    if-gez p3, :cond_3

    const-wide/16 v4, 0xc8

    goto :goto_1

    :cond_3
    int-to-long v4, p3

    .line 62
    :goto_1
    iput-wide v4, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mAnimDuration:J

    .line 63
    sget p3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_touch_to_seek:I

    invoke-virtual {p2, p3, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p3

    iput-boolean p3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isTouchToSeek:Z

    .line 64
    sget p3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_always_show_bubble:I

    invoke-virtual {p2, p3, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p3

    iput-boolean p3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isAlwaysShowBubble:Z

    .line 65
    sget p3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_always_show_bubble_delay:I

    invoke-virtual {p2, p3, v1}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p3

    if-gez p3, :cond_4

    const-wide/16 v4, 0x0

    goto :goto_2

    :cond_4
    int-to-long v4, p3

    .line 66
    :goto_2
    iput-wide v4, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mAlwaysShowBubbleDelay:J

    .line 67
    sget p3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_bsb_hide_bubble:I

    invoke-virtual {p2, p3, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p3

    iput-boolean p3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isHideBubble:Z

    .line 68
    invoke-static {}, Lcom/blankj/utilcode/util/w0;->a()Z

    move-result p3

    iput-boolean p3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isRtl:Z

    .line 69
    sget p3, Lcom/kubi/sdk/res/R$styleable;->BubbleSeekBar_android_enabled:I

    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    move-result v0

    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p3

    invoke-virtual {p0, p3}, Landroid/view/View;->setEnabled(Z)V

    .line 70
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 71
    new-instance p2, Landroid/graphics/Paint;

    invoke-direct {p2}, Landroid/graphics/Paint;-><init>()V

    iput-object p2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 72
    invoke-virtual {p2, v3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 73
    iget-object p2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    sget-object p3, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 74
    iget-object p2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    sget-object p3, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 75
    new-instance p2, Landroid/graphics/Rect;

    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    iput-object p2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mRectText:Landroid/graphics/Rect;

    .line 76
    invoke-static {v2}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/c;->b(I)I

    move-result p2

    iput p2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mTextSpace:I

    .line 77
    invoke-direct {p0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->initConfigByPriority()V

    .line 78
    iget-boolean p2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isHideBubble:Z

    if-eqz p2, :cond_5

    return-void

    .line 79
    :cond_5
    const-string p2, "window"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/view/WindowManager;

    iput-object p2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mWindowManager:Landroid/view/WindowManager;

    .line 80
    new-instance p2, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$BubbleView;

    invoke-direct {p2, p0, p1}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$BubbleView;-><init>(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;Landroid/content/Context;)V

    iput-object p2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mBubbleView:Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$BubbleView;

    .line 81
    iget-boolean p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isShowProgressInFloat:Z

    if-eqz p1, :cond_6

    .line 82
    invoke-virtual {p0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->getProgressFloat()F

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object p1

    goto :goto_3

    :cond_6
    invoke-virtual {p0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->getProgress()I

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    .line 83
    :goto_3
    invoke-virtual {p2, p1}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$BubbleView;->a(Ljava/lang/String;)V

    .line 84
    new-instance p1, Landroid/view/WindowManager$LayoutParams;

    invoke-direct {p1}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    iput-object p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mLayoutParams:Landroid/view/WindowManager$LayoutParams;

    const p2, 0x800033

    .line 85
    iput p2, p1, Landroid/view/WindowManager$LayoutParams;->gravity:I

    const/4 p2, -0x2

    .line 86
    iput p2, p1, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 87
    iput p2, p1, Landroid/view/WindowManager$LayoutParams;->height:I

    const/4 p2, -0x3

    .line 88
    iput p2, p1, Landroid/view/WindowManager$LayoutParams;->format:I

    const p2, 0x80028

    .line 89
    iput p2, p1, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 90
    invoke-static {}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/c;->c()Z

    move-result p1

    if-nez p1, :cond_8

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x19

    if-lt p1, p2, :cond_7

    goto :goto_4

    .line 91
    :cond_7
    iget-object p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mLayoutParams:Landroid/view/WindowManager$LayoutParams;

    const/16 p2, 0x7d5

    iput p2, p1, Landroid/view/WindowManager$LayoutParams;->type:I

    goto :goto_5

    .line 92
    :cond_8
    :goto_4
    iget-object p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mLayoutParams:Landroid/view/WindowManager$LayoutParams;

    iput v2, p1, Landroid/view/WindowManager$LayoutParams;->type:I

    .line 93
    :goto_5
    invoke-direct {p0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->calculateRadiusOfBubble()V

    return-void
.end method

.method public static synthetic access$002(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;Z)Z
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isTouchToSeekAnimEnd:Z

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
.end method

.method public static synthetic access$100(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->autoAdjustSection()V

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
.end method

.method public static synthetic access$1000(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;)Z
    .locals 0

    .line 1
    .line 2
    iget-boolean p0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isHideBubble:Z

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
.end method

.method public static synthetic access$1100(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;)F
    .locals 0

    .line 1
    .line 2
    iget p0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mBubbleCenterRawX:F

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
.end method

.method public static synthetic access$1102(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;F)F
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mBubbleCenterRawX:F

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
.end method

.method public static synthetic access$1200(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;)F
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->calculateCenterRawXofBubbleView()F

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
.end method

.method public static synthetic access$1300(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;)Landroid/view/WindowManager$LayoutParams;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mLayoutParams:Landroid/view/WindowManager$LayoutParams;

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
.end method

.method public static synthetic access$1400(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;)Landroid/view/WindowManager;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mWindowManager:Landroid/view/WindowManager;

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
.end method

.method public static synthetic access$1500(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;)Z
    .locals 0

    .line 1
    .line 2
    iget-boolean p0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isShowProgressInFloat:Z

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
.end method

.method public static synthetic access$1600(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;)F
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->processProgress()F

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
.end method

.method public static synthetic access$1700(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;)Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$k;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mProgressListener:Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$k;

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
.end method

.method public static synthetic access$1800(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->showBubble()V

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
.end method

.method public static synthetic access$1902(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;Z)Z
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->triggerBubbleShowing:Z

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
.end method

.method public static synthetic access$2000(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;)I
    .locals 0

    .line 1
    .line 2
    iget p0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mBubbleColor:I

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
.end method

.method public static synthetic access$202(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;Z)Z
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isThumbOnDragging:Z

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
.end method

.method public static synthetic access$2100(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;)I
    .locals 0

    .line 1
    .line 2
    iget p0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mBubbleTextSize:I

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
.end method

.method public static synthetic access$2200(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;)I
    .locals 0

    .line 1
    .line 2
    iget p0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mBubbleTextColor:I

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
.end method

.method public static synthetic access$2300(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;)Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$j;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mFormatCallback:Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$j;

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
.end method

.method public static synthetic access$300(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;)Z
    .locals 0

    .line 1
    .line 2
    iget-boolean p0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isAlwaysShowBubble:Z

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
.end method

.method public static synthetic access$400(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->hideBubble()V

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
.end method

.method public static synthetic access$500(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;)J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mAnimDuration:J

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
.end method

.method public static synthetic access$600(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;)Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$BubbleView;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mBubbleView:Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$BubbleView;

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
.end method

.method public static synthetic access$702(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;F)F
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbCenterX:F

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
.end method

.method public static synthetic access$802(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;F)F
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mProgress:F

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
.end method

.method public static synthetic access$900(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;)F
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->calculateProgress()F

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
    iget v6, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionCount:I

    .line 9
    .line 10
    if-gt v4, v6, :cond_1

    .line 11
    int-to-float v5, v4

    .line 12
    .line 13
    iget v6, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionOffset:F

    .line 14
    mul-float/2addr v5, v6

    .line 15
    .line 16
    iget v7, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mLeft:F

    .line 17
    add-float/2addr v5, v7

    .line 18
    .line 19
    iget v7, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbCenterX:F

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
    iget v6, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbCenterX:F

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
    iget v7, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->roundMode:I

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
    iget v8, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbCenterX:F

    .line 65
    .line 66
    sub-float v9, v8, v5

    .line 67
    .line 68
    iget v10, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionOffset:F

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
    iget v5, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mLeft:F

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
    new-instance v5, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$e;

    .line 114
    .line 115
    .line 116
    invoke-direct {v5, p0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$e;-><init>(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;)V

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
    iget-boolean v5, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isHideBubble:Z

    .line 124
    .line 125
    if-eqz v5, :cond_5

    .line 126
    .line 127
    if-nez v6, :cond_8

    .line 128
    .line 129
    iget-wide v5, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mAnimDuration:J

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
    iget-object v5, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mBubbleView:Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$BubbleView;

    .line 144
    .line 145
    iget-boolean v8, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isAlwaysShowBubble:Z

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
    iget-wide v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mAnimDuration:J

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
    iget-wide v5, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mAnimDuration:J

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
    new-instance v0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$f;

    .line 189
    .line 190
    .line 191
    invoke-direct {v0, p0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$f;-><init>(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;)V

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
.end method

.method private calThumbCxWhenSeekStepSection(F)F
    .locals 4

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mLeft:F

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
    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mRight:F

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
    iget v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionCount:I

    .line 19
    .line 20
    if-gt v1, v2, :cond_3

    .line 21
    int-to-float v0, v1

    .line 22
    .line 23
    iget v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionOffset:F

    .line 24
    mul-float/2addr v0, v2

    .line 25
    .line 26
    iget v3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mLeft:F

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
    iget v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionOffset:F

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
    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mLeft:F

    .line 60
    add-float/2addr p1, v0

    .line 61
    return p1
.end method

.method private calculateCenterRawXofBubbleView()F
    .locals 4

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isRtl:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mBubbleCenterRawSolidX:F

    .line 7
    .line 8
    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mTrackLength:F

    .line 9
    .line 10
    iget v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mProgress:F

    .line 11
    .line 12
    iget v3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mMin:F

    .line 13
    sub-float/2addr v2, v3

    .line 14
    mul-float/2addr v1, v2

    .line 15
    .line 16
    iget v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mDelta:F

    .line 17
    div-float/2addr v1, v2

    .line 18
    sub-float/2addr v0, v1

    .line 19
    return v0

    .line 20
    .line 21
    :cond_0
    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mBubbleCenterRawSolidX:F

    .line 22
    .line 23
    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mTrackLength:F

    .line 24
    .line 25
    iget v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mProgress:F

    .line 26
    .line 27
    iget v3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mMin:F

    .line 28
    sub-float/2addr v2, v3

    .line 29
    mul-float/2addr v1, v2

    .line 30
    .line 31
    iget v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mDelta:F

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
.end method

.method private calculateProgress()F
    .locals 2

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isRtl:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mRight:F

    .line 7
    .line 8
    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbCenterX:F

    .line 9
    sub-float/2addr v0, v1

    .line 10
    .line 11
    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mDelta:F

    .line 12
    mul-float/2addr v0, v1

    .line 13
    .line 14
    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mTrackLength:F

    .line 15
    div-float/2addr v0, v1

    .line 16
    .line 17
    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mMin:F

    .line 18
    :goto_0
    add-float/2addr v0, v1

    .line 19
    return v0

    .line 20
    .line 21
    :cond_0
    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbCenterX:F

    .line 22
    .line 23
    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mLeft:F

    .line 24
    sub-float/2addr v0, v1

    .line 25
    .line 26
    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mDelta:F

    .line 27
    mul-float/2addr v0, v1

    .line 28
    .line 29
    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mTrackLength:F

    .line 30
    div-float/2addr v0, v1

    .line 31
    .line 32
    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mMin:F

    .line 33
    goto :goto_0
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

.method private calculateRadiusOfBubble()V
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 3
    .line 4
    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mBubbleTextSize:I

    .line 5
    int-to-float v1, v1

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 9
    .line 10
    iget-boolean v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isShowProgressInFloat:Z

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-boolean v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isRtl:Z

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mMax:F

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mMin:F

    .line 22
    .line 23
    .line 24
    :goto_0
    invoke-direct {p0, v0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->float2String(F)Ljava/lang/String;

    .line 25
    move-result-object v0

    .line 26
    goto :goto_1

    .line 27
    .line 28
    :cond_1
    iget-boolean v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isRtl:Z

    .line 29
    .line 30
    if-eqz v0, :cond_3

    .line 31
    .line 32
    iget-boolean v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isFloatType:Z

    .line 33
    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mMax:F

    .line 37
    .line 38
    .line 39
    invoke-direct {p0, v0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->float2String(F)Ljava/lang/String;

    .line 40
    move-result-object v0

    .line 41
    goto :goto_1

    .line 42
    .line 43
    :cond_2
    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mMax:F

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
    iget-boolean v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isFloatType:Z

    .line 52
    .line 53
    if-eqz v0, :cond_4

    .line 54
    .line 55
    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mMin:F

    .line 56
    .line 57
    .line 58
    invoke-direct {p0, v0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->float2String(F)Ljava/lang/String;

    .line 59
    move-result-object v0

    .line 60
    goto :goto_1

    .line 61
    .line 62
    :cond_4
    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mMin:F

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
    iget-object v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 73
    move-result v2

    .line 74
    .line 75
    iget-object v3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mRectText:Landroid/graphics/Rect;

    .line 76
    const/4 v4, 0x0

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1, v0, v4, v2, v3}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 80
    .line 81
    iget-object v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mRectText:Landroid/graphics/Rect;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 85
    move-result v0

    .line 86
    .line 87
    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mTextSpace:I

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
    iget-boolean v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isShowProgressInFloat:Z

    .line 95
    .line 96
    if-eqz v1, :cond_6

    .line 97
    .line 98
    iget-boolean v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isRtl:Z

    .line 99
    .line 100
    if-eqz v1, :cond_5

    .line 101
    .line 102
    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mMin:F

    .line 103
    goto :goto_2

    .line 104
    .line 105
    :cond_5
    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mMax:F

    .line 106
    .line 107
    .line 108
    :goto_2
    invoke-direct {p0, v1}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->float2String(F)Ljava/lang/String;

    .line 109
    move-result-object v1

    .line 110
    goto :goto_3

    .line 111
    .line 112
    :cond_6
    iget-boolean v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isRtl:Z

    .line 113
    .line 114
    if-eqz v1, :cond_8

    .line 115
    .line 116
    iget-boolean v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isFloatType:Z

    .line 117
    .line 118
    if-eqz v1, :cond_7

    .line 119
    .line 120
    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mMin:F

    .line 121
    .line 122
    .line 123
    invoke-direct {p0, v1}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->float2String(F)Ljava/lang/String;

    .line 124
    move-result-object v1

    .line 125
    goto :goto_3

    .line 126
    .line 127
    :cond_7
    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mMin:F

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
    iget-boolean v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isFloatType:Z

    .line 136
    .line 137
    if-eqz v1, :cond_9

    .line 138
    .line 139
    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mMax:F

    .line 140
    .line 141
    .line 142
    invoke-direct {p0, v1}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->float2String(F)Ljava/lang/String;

    .line 143
    move-result-object v1

    .line 144
    goto :goto_3

    .line 145
    .line 146
    :cond_9
    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mMax:F

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
    iget-object v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 157
    move-result v3

    .line 158
    .line 159
    iget-object v5, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mRectText:Landroid/graphics/Rect;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v2, v1, v4, v3, v5}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 163
    .line 164
    iget-object v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mRectText:Landroid/graphics/Rect;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    .line 168
    move-result v1

    .line 169
    .line 170
    iget v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mTextSpace:I

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
    invoke-static {v2}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/c;->b(I)I

    .line 181
    move-result v2

    .line 182
    .line 183
    iput v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mBubbleRadius:I

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
    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mTextSpace:I

    .line 194
    add-int/2addr v0, v1

    .line 195
    .line 196
    iput v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mBubbleRadius:I

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
.end method

.method private float2String(F)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->formatFloat(F)F

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
    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->roundMode:I

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
.end method

.method private hideBubble()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mBubbleView:Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$BubbleView;

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
    iget-object v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mBubbleView:Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$BubbleView;

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
    iget-object v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mWindowManager:Landroid/view/WindowManager;

    .line 21
    .line 22
    iget-object v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mBubbleView:Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$BubbleView;

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

.method private initConfigByPriority()V
    .locals 6

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mMin:F

    .line 3
    .line 4
    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mMax:F

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
    iput v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mMin:F

    .line 12
    .line 13
    const/high16 v0, 0x42c80000    # 100.0f

    .line 14
    .line 15
    iput v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mMax:F

    .line 16
    .line 17
    :cond_0
    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mMin:F

    .line 18
    .line 19
    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mMax:F

    .line 20
    .line 21
    cmpl-float v2, v0, v1

    .line 22
    .line 23
    if-lez v2, :cond_1

    .line 24
    .line 25
    iput v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mMax:F

    .line 26
    .line 27
    iput v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mMin:F

    .line 28
    .line 29
    :cond_1
    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mProgress:F

    .line 30
    .line 31
    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mMin:F

    .line 32
    .line 33
    cmpg-float v0, v0, v1

    .line 34
    .line 35
    if-gez v0, :cond_2

    .line 36
    .line 37
    iput v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mProgress:F

    .line 38
    .line 39
    :cond_2
    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mProgress:F

    .line 40
    .line 41
    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mMax:F

    .line 42
    .line 43
    cmpl-float v0, v0, v1

    .line 44
    .line 45
    if-lez v0, :cond_3

    .line 46
    .line 47
    iput v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mProgress:F

    .line 48
    .line 49
    :cond_3
    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSecondTrackSize:I

    .line 50
    .line 51
    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mTrackSize:I

    .line 52
    const/4 v2, 0x2

    .line 53
    .line 54
    if-ge v0, v1, :cond_4

    .line 55
    .line 56
    .line 57
    invoke-static {v2}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/c;->b(I)I

    .line 58
    move-result v0

    .line 59
    add-int/2addr v1, v0

    .line 60
    .line 61
    iput v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSecondTrackSize:I

    .line 62
    .line 63
    :cond_4
    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbRadius:I

    .line 64
    .line 65
    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSecondTrackSize:I

    .line 66
    .line 67
    if-gt v0, v1, :cond_5

    .line 68
    .line 69
    .line 70
    invoke-static {v2}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/c;->b(I)I

    .line 71
    move-result v0

    .line 72
    add-int/2addr v1, v0

    .line 73
    .line 74
    iput v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbRadius:I

    .line 75
    .line 76
    :cond_5
    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbRadiusOnDragging:I

    .line 77
    .line 78
    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSecondTrackSize:I

    .line 79
    .line 80
    if-gt v0, v1, :cond_6

    .line 81
    mul-int/2addr v1, v2

    .line 82
    .line 83
    iput v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbRadiusOnDragging:I

    .line 84
    .line 85
    :cond_6
    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionCount:I

    .line 86
    .line 87
    if-gtz v0, :cond_7

    .line 88
    .line 89
    const/16 v0, 0xa

    .line 90
    .line 91
    iput v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionCount:I

    .line 92
    .line 93
    :cond_7
    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mMax:F

    .line 94
    .line 95
    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mMin:F

    .line 96
    sub-float/2addr v0, v1

    .line 97
    .line 98
    iput v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mDelta:F

    .line 99
    .line 100
    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionCount:I

    .line 101
    int-to-float v1, v1

    .line 102
    div-float/2addr v0, v1

    .line 103
    .line 104
    iput v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionValue:F

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
    iput-boolean v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isFloatType:Z

    .line 114
    .line 115
    :cond_8
    iget-boolean v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isFloatType:Z

    .line 116
    .line 117
    if-eqz v0, :cond_9

    .line 118
    .line 119
    iput-boolean v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isShowProgressInFloat:Z

    .line 120
    .line 121
    :cond_9
    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionTextPosition:I

    .line 122
    const/4 v3, -0x1

    .line 123
    .line 124
    if-eq v0, v3, :cond_a

    .line 125
    .line 126
    iput-boolean v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isShowSectionText:Z

    .line 127
    .line 128
    :cond_a
    iget-boolean v4, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isShowSectionText:Z

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
    iput v5, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionTextPosition:I

    .line 136
    .line 137
    :cond_b
    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionTextPosition:I

    .line 138
    .line 139
    if-ne v0, v2, :cond_c

    .line 140
    .line 141
    iput-boolean v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isShowSectionMark:Z

    .line 142
    .line 143
    :cond_c
    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionTextInterval:I

    .line 144
    .line 145
    if-ge v0, v1, :cond_d

    .line 146
    .line 147
    iput v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionTextInterval:I

    .line 148
    .line 149
    .line 150
    :cond_d
    invoke-direct {p0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->initSectionTextArray()V

    .line 151
    .line 152
    iget-boolean v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isSeekStepSection:Z

    .line 153
    .line 154
    if-eqz v0, :cond_e

    .line 155
    .line 156
    iput-boolean v5, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isSeekBySection:Z

    .line 157
    .line 158
    iput-boolean v5, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isAutoAdjustSectionMark:Z

    .line 159
    .line 160
    :cond_e
    iget-boolean v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isAutoAdjustSectionMark:Z

    .line 161
    .line 162
    if-eqz v0, :cond_f

    .line 163
    .line 164
    iget-boolean v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isShowSectionMark:Z

    .line 165
    .line 166
    if-nez v0, :cond_f

    .line 167
    .line 168
    iput-boolean v5, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isAutoAdjustSectionMark:Z

    .line 169
    .line 170
    :cond_f
    iget-boolean v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isSeekBySection:Z

    .line 171
    .line 172
    if-eqz v0, :cond_11

    .line 173
    .line 174
    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mMin:F

    .line 175
    .line 176
    iput v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPreSecValue:F

    .line 177
    .line 178
    iget v3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mProgress:F

    .line 179
    .line 180
    cmpl-float v0, v3, v0

    .line 181
    .line 182
    if-eqz v0, :cond_10

    .line 183
    .line 184
    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionValue:F

    .line 185
    .line 186
    iput v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPreSecValue:F

    .line 187
    .line 188
    :cond_10
    iput-boolean v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isShowSectionMark:Z

    .line 189
    .line 190
    iput-boolean v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isAutoAdjustSectionMark:Z

    .line 191
    .line 192
    :cond_11
    iget-boolean v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isHideBubble:Z

    .line 193
    .line 194
    if-eqz v0, :cond_12

    .line 195
    .line 196
    iput-boolean v5, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isAlwaysShowBubble:Z

    .line 197
    .line 198
    :cond_12
    iget-boolean v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isAlwaysShowBubble:Z

    .line 199
    .line 200
    if-eqz v0, :cond_13

    .line 201
    .line 202
    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mProgress:F

    .line 203
    .line 204
    .line 205
    invoke-virtual {p0, v0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->setProgress(F)V

    .line 206
    .line 207
    :cond_13
    iget-boolean v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isFloatType:Z

    .line 208
    .line 209
    if-nez v0, :cond_15

    .line 210
    .line 211
    iget-boolean v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isSeekBySection:Z

    .line 212
    .line 213
    if-nez v0, :cond_15

    .line 214
    .line 215
    iget-boolean v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isShowSectionText:Z

    .line 216
    .line 217
    if-eqz v0, :cond_14

    .line 218
    .line 219
    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionTextPosition:I

    .line 220
    .line 221
    if-ne v0, v2, :cond_14

    .line 222
    goto :goto_0

    .line 223
    .line 224
    :cond_14
    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbTextSize:I

    .line 225
    goto :goto_1

    .line 226
    .line 227
    :cond_15
    :goto_0
    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionTextSize:I

    .line 228
    .line 229
    :goto_1
    iput v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbTextSize:I

    .line 230
    return-void
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
.end method

.method private initSectionTextArray()V
    .locals 8

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionTextPosition:I

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
    iget v4, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionTextInterval:I

    .line 13
    .line 14
    if-le v4, v2, :cond_1

    .line 15
    .line 16
    iget v4, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionCount:I

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
    iget v3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionCount:I

    .line 24
    .line 25
    if-gt v1, v3, :cond_8

    .line 26
    .line 27
    iget-boolean v4, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isRtl:Z

    .line 28
    .line 29
    if-eqz v4, :cond_2

    .line 30
    .line 31
    iget v5, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mMax:F

    .line 32
    .line 33
    iget v6, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionValue:F

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
    iget v5, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mMin:F

    .line 40
    .line 41
    iget v6, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionValue:F

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
    iget v3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionTextInterval:I

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
    iget v3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mMax:F

    .line 59
    .line 60
    iget v4, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionValue:F

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
    iget v3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mMin:F

    .line 68
    .line 69
    iget v4, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionValue:F

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
    iget-object v3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionTextArray:Landroid/util/SparseArray;

    .line 81
    .line 82
    iget-boolean v4, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isFloatType:Z

    .line 83
    .line 84
    if-eqz v4, :cond_6

    .line 85
    .line 86
    .line 87
    invoke-direct {p0, v5}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->float2String(F)Ljava/lang/String;

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
    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mTrackLength:F

    .line 11
    .line 12
    iget v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mDelta:F

    .line 13
    div-float/2addr v0, v2

    .line 14
    .line 15
    iget v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mProgress:F

    .line 16
    .line 17
    iget v3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mMin:F

    .line 18
    sub-float/2addr v2, v3

    .line 19
    mul-float/2addr v0, v2

    .line 20
    .line 21
    iget-boolean v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isRtl:Z

    .line 22
    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    iget v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mRight:F

    .line 26
    sub-float/2addr v2, v0

    .line 27
    goto :goto_0

    .line 28
    .line 29
    :cond_1
    iget v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mLeft:F

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
    iget p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mLeft:F

    .line 64
    .line 65
    const/16 v0, 0x8

    .line 66
    .line 67
    .line 68
    invoke-static {v0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/c;->b(I)I

    .line 69
    move-result v2

    .line 70
    int-to-float v2, v2

    .line 71
    add-float/2addr p1, v2

    .line 72
    .line 73
    iget v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mLeft:F

    .line 74
    .line 75
    .line 76
    invoke-static {v0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/c;->b(I)I

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
.end method

.method private locatePositionInWindow()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPoint:[I

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
    iget-object v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPoint:[I

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
    iget-boolean v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isRtl:Z

    .line 36
    .line 37
    const/high16 v1, 0x40000000    # 2.0f

    .line 38
    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    iget-object v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPoint:[I

    .line 42
    .line 43
    aget v0, v0, v2

    .line 44
    int-to-float v0, v0

    .line 45
    .line 46
    iget v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mRight:F

    .line 47
    add-float/2addr v0, v2

    .line 48
    .line 49
    iget-object v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mBubbleView:Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$BubbleView;

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
    iput v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mBubbleCenterRawSolidX:F

    .line 59
    goto :goto_0

    .line 60
    .line 61
    :cond_1
    iget-object v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPoint:[I

    .line 62
    .line 63
    aget v0, v0, v2

    .line 64
    int-to-float v0, v0

    .line 65
    .line 66
    iget v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mLeft:F

    .line 67
    add-float/2addr v0, v2

    .line 68
    .line 69
    iget-object v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mBubbleView:Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$BubbleView;

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
    iput v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mBubbleCenterRawSolidX:F

    .line 79
    .line 80
    .line 81
    :goto_0
    invoke-direct {p0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->calculateCenterRawXofBubbleView()F

    .line 82
    move-result v0

    .line 83
    .line 84
    iput v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mBubbleCenterRawX:F

    .line 85
    .line 86
    iget-object v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPoint:[I

    .line 87
    const/4 v1, 0x1

    .line 88
    .line 89
    aget v0, v0, v1

    .line 90
    .line 91
    iget-object v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mBubbleView:Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$BubbleView;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    .line 95
    move-result v1

    .line 96
    sub-int/2addr v0, v1

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 100
    move-result v1

    .line 101
    add-int/2addr v0, v1

    .line 102
    int-to-float v0, v0

    .line 103
    .line 104
    iput v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mBubbleCenterRawSolidY:F

    .line 105
    .line 106
    sget-object v1, Lcom/kubi/sdk/util/EdgeToEdgeCompat;->a:Lcom/kubi/sdk/util/EdgeToEdgeCompat;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1}, Lcom/kubi/sdk/util/EdgeToEdgeCompat;->j()I

    .line 110
    move-result v1

    .line 111
    int-to-float v1, v1

    .line 112
    sub-float/2addr v0, v1

    .line 113
    .line 114
    iput v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mBubbleCenterRawSolidY:F

    .line 115
    .line 116
    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->bubbleMarginBottom:I

    .line 117
    .line 118
    .line 119
    invoke-static {v1}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/c;->b(I)I

    .line 120
    move-result v1

    .line 121
    int-to-float v1, v1

    .line 122
    sub-float/2addr v0, v1

    .line 123
    .line 124
    iput v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mBubbleCenterRawSolidY:F

    .line 125
    .line 126
    .line 127
    invoke-static {}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/c;->c()Z

    .line 128
    move-result v0

    .line 129
    .line 130
    if-eqz v0, :cond_2

    .line 131
    .line 132
    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mBubbleCenterRawSolidY:F

    .line 133
    const/4 v1, 0x4

    .line 134
    .line 135
    .line 136
    invoke-static {v1}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/c;->b(I)I

    .line 137
    move-result v1

    .line 138
    int-to-float v1, v1

    .line 139
    sub-float/2addr v0, v1

    .line 140
    .line 141
    iput v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mBubbleCenterRawSolidY:F

    .line 142
    .line 143
    .line 144
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 145
    move-result-object v0

    .line 146
    .line 147
    instance-of v1, v0, Landroid/app/Activity;

    .line 148
    .line 149
    if-eqz v1, :cond_3

    .line 150
    .line 151
    check-cast v0, Landroid/app/Activity;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 155
    move-result-object v0

    .line 156
    .line 157
    if-eqz v0, :cond_3

    .line 158
    .line 159
    .line 160
    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 161
    move-result-object v0

    .line 162
    .line 163
    iget v0, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 164
    .line 165
    and-int/lit16 v0, v0, 0x400

    .line 166
    .line 167
    if-eqz v0, :cond_3

    .line 168
    .line 169
    .line 170
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 171
    move-result-object v0

    .line 172
    .line 173
    const-string v1, "dimen"

    .line 174
    .line 175
    const-string v2, "android"

    .line 176
    .line 177
    const-string v3, "status_bar_height"

    .line 178
    .line 179
    .line 180
    invoke-virtual {v0, v3, v1, v2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 181
    move-result v1

    .line 182
    .line 183
    iget v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mBubbleCenterRawSolidY:F

    .line 184
    .line 185
    .line 186
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 187
    move-result v0

    .line 188
    int-to-float v0, v0

    .line 189
    add-float/2addr v2, v0

    .line 190
    .line 191
    iput v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mBubbleCenterRawSolidY:F

    .line 192
    :cond_3
    return-void
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
.end method

.method private processProgress()F
    .locals 6

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mProgress:F

    .line 3
    .line 4
    iget-boolean v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isSeekBySection:Z

    .line 5
    .line 6
    if-eqz v1, :cond_7

    .line 7
    .line 8
    iget-boolean v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->triggerSeekBySection:Z

    .line 9
    .line 10
    if-eqz v1, :cond_7

    .line 11
    .line 12
    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionValue:F

    .line 13
    .line 14
    const/high16 v2, 0x40000000    # 2.0f

    .line 15
    div-float/2addr v1, v2

    .line 16
    .line 17
    iget-boolean v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isTouchToSeek:Z

    .line 18
    .line 19
    if-eqz v2, :cond_3

    .line 20
    .line 21
    iget v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mMin:F

    .line 22
    .line 23
    cmpl-float v2, v0, v2

    .line 24
    .line 25
    if-eqz v2, :cond_7

    .line 26
    .line 27
    iget v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mMax:F

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
    iget v3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionCount:I

    .line 36
    .line 37
    if-gt v2, v3, :cond_3

    .line 38
    int-to-float v3, v2

    .line 39
    .line 40
    iget v4, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionValue:F

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
    iget v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPreSecValue:F

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
    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionValue:F

    .line 76
    add-float/2addr v2, v0

    .line 77
    .line 78
    iput v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPreSecValue:F

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
    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionValue:F

    .line 89
    sub-float/2addr v2, v0

    .line 90
    .line 91
    iput v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPreSecValue:F

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
.end method

.method private showBubble()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mBubbleView:Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$BubbleView;

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
    iget-object v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mLayoutParams:Landroid/view/WindowManager$LayoutParams;

    .line 14
    .line 15
    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mBubbleCenterRawX:F

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
    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mBubbleCenterRawSolidY:F

    .line 24
    add-float/2addr v1, v2

    .line 25
    float-to-int v1, v1

    .line 26
    .line 27
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 28
    .line 29
    iget-object v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mBubbleView:Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$BubbleView;

    .line 30
    const/4 v1, 0x0

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 34
    .line 35
    iget-object v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mBubbleView:Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$BubbleView;

    .line 36
    const/4 v1, 0x0

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 40
    .line 41
    iget-object v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mBubbleView:Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$BubbleView;

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
    iget-boolean v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isTouchToSeek:Z

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
    iget-wide v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mAnimDuration:J

    .line 61
    .line 62
    .line 63
    :goto_0
    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 64
    move-result-object v0

    .line 65
    .line 66
    new-instance v1, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$g;

    .line 67
    .line 68
    .line 69
    invoke-direct {v1, p0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$g;-><init>(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;)V

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
    iget-object v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mBubbleView:Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$BubbleView;

    .line 79
    .line 80
    iget-boolean v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isShowProgressInFloat:Z

    .line 81
    .line 82
    if-eqz v1, :cond_2

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->getProgressFloat()F

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
    invoke-virtual {p0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->getProgress()I

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
    invoke-virtual {v0, v1}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$BubbleView;->a(Ljava/lang/String;)V

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
.end method


# virtual methods
.method public config(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;)V
    .locals 3

    .line 1
    .line 2
    iget v0, p1, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->a:F

    .line 3
    .line 4
    iput v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mMin:F

    .line 5
    .line 6
    iget v0, p1, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->b:F

    .line 7
    .line 8
    iput v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mMax:F

    .line 9
    .line 10
    iget v0, p1, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->c:F

    .line 11
    .line 12
    iput v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mProgress:F

    .line 13
    .line 14
    iget-boolean v0, p1, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->d:Z

    .line 15
    .line 16
    iput-boolean v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isFloatType:Z

    .line 17
    .line 18
    iget v0, p1, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->e:I

    .line 19
    .line 20
    iput v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mTrackSize:I

    .line 21
    .line 22
    iget v0, p1, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->f:I

    .line 23
    .line 24
    iput v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSecondTrackSize:I

    .line 25
    .line 26
    iget v0, p1, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->g:I

    .line 27
    .line 28
    iput v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbRadius:I

    .line 29
    .line 30
    iget v0, p1, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->h:I

    .line 31
    .line 32
    iput v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbRadiusOnDragging:I

    .line 33
    .line 34
    iget v0, p1, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->i:I

    .line 35
    .line 36
    iput v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mTrackColor:I

    .line 37
    .line 38
    iget v0, p1, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->j:I

    .line 39
    .line 40
    iput v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSecondTrackColor:I

    .line 41
    .line 42
    iget v0, p1, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->k:I

    .line 43
    .line 44
    iput v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbColor:I

    .line 45
    .line 46
    iget v0, p1, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->l:I

    .line 47
    .line 48
    iput v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionCount:I

    .line 49
    .line 50
    iget-boolean v0, p1, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->m:Z

    .line 51
    .line 52
    iput-boolean v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isShowSectionMark:Z

    .line 53
    .line 54
    iget-boolean v0, p1, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->n:Z

    .line 55
    .line 56
    iput-boolean v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isAutoAdjustSectionMark:Z

    .line 57
    .line 58
    iget-boolean v0, p1, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->o:Z

    .line 59
    .line 60
    iput-boolean v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isShowSectionText:Z

    .line 61
    .line 62
    iget v0, p1, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->p:I

    .line 63
    .line 64
    iput v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionTextSize:I

    .line 65
    .line 66
    iget v0, p1, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->q:I

    .line 67
    .line 68
    iput v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionTextColor:I

    .line 69
    .line 70
    iget v0, p1, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->r:I

    .line 71
    .line 72
    iput v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionTextPosition:I

    .line 73
    .line 74
    iget v0, p1, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->s:I

    .line 75
    .line 76
    iput v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionTextInterval:I

    .line 77
    .line 78
    iget-boolean v0, p1, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->t:Z

    .line 79
    .line 80
    iput-boolean v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isShowThumbText:Z

    .line 81
    .line 82
    iget v0, p1, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->u:I

    .line 83
    .line 84
    iput v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbTextSize:I

    .line 85
    .line 86
    iget v0, p1, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->v:I

    .line 87
    .line 88
    iput v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbTextColor:I

    .line 89
    .line 90
    iget-boolean v0, p1, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->w:Z

    .line 91
    .line 92
    iput-boolean v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isShowProgressInFloat:Z

    .line 93
    .line 94
    iget-wide v0, p1, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->x:J

    .line 95
    .line 96
    iput-wide v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mAnimDuration:J

    .line 97
    .line 98
    iget-boolean v0, p1, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->y:Z

    .line 99
    .line 100
    iput-boolean v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isTouchToSeek:Z

    .line 101
    .line 102
    iget-boolean v0, p1, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->z:Z

    .line 103
    .line 104
    iput-boolean v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isSeekStepSection:Z

    .line 105
    .line 106
    iget-boolean v0, p1, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->A:Z

    .line 107
    .line 108
    iput-boolean v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isSeekBySection:Z

    .line 109
    .line 110
    iget v0, p1, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->B:I

    .line 111
    .line 112
    iput v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mBubbleColor:I

    .line 113
    .line 114
    iget v0, p1, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->C:I

    .line 115
    .line 116
    iput v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mBubbleTextSize:I

    .line 117
    .line 118
    iget v0, p1, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->D:I

    .line 119
    .line 120
    iput v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mBubbleTextColor:I

    .line 121
    .line 122
    iget-boolean v0, p1, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->E:Z

    .line 123
    .line 124
    iput-boolean v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isAlwaysShowBubble:Z

    .line 125
    .line 126
    iget-wide v0, p1, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->F:J

    .line 127
    .line 128
    iput-wide v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mAlwaysShowBubbleDelay:J

    .line 129
    .line 130
    iget-boolean v0, p1, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->G:Z

    .line 131
    .line 132
    iput-boolean v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isHideBubble:Z

    .line 133
    .line 134
    iget-boolean v0, p1, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->H:Z

    .line 135
    .line 136
    iput-boolean v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isRtl:Z

    .line 137
    .line 138
    iget v0, p1, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->I:I

    .line 139
    .line 140
    iput v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->roundMode:I

    .line 141
    .line 142
    iget-boolean v0, p1, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->K:Z

    .line 143
    .line 144
    iput-boolean v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->hideNoTextSectionMark:Z

    .line 145
    .line 146
    iget-boolean p1, p1, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->J:Z

    .line 147
    .line 148
    .line 149
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 150
    move-result-object p1

    .line 151
    .line 152
    iput-object p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mCanSeek:Ljava/lang/Boolean;

    .line 153
    .line 154
    .line 155
    invoke-direct {p0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->initConfigByPriority()V

    .line 156
    .line 157
    .line 158
    invoke-direct {p0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->calculateRadiusOfBubble()V

    .line 159
    .line 160
    iget-object p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mProgressListener:Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$k;

    .line 161
    .line 162
    if-eqz p1, :cond_0

    .line 163
    .line 164
    .line 165
    invoke-virtual {p0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->getProgress()I

    .line 166
    move-result v0

    .line 167
    .line 168
    .line 169
    invoke-virtual {p0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->getProgressFloat()F

    .line 170
    move-result v1

    .line 171
    const/4 v2, 0x0

    .line 172
    .line 173
    .line 174
    invoke-interface {p1, p0, v0, v1, v2}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$k;->c(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;IFZ)V

    .line 175
    .line 176
    iget-object p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mProgressListener:Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$k;

    .line 177
    .line 178
    .line 179
    invoke-virtual {p0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->getProgress()I

    .line 180
    move-result v0

    .line 181
    .line 182
    .line 183
    invoke-virtual {p0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->getProgressFloat()F

    .line 184
    move-result v1

    .line 185
    .line 186
    .line 187
    invoke-interface {p1, p0, v0, v1, v2}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$k;->a(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;IFZ)V

    .line 188
    :cond_0
    const/4 p1, 0x0

    .line 189
    .line 190
    iput-object p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mConfigBuilder:Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;

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
.end method

.method public correctOffsetWhenContainerOnScrolling()V
    .locals 3

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isHideBubble:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    goto :goto_0

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-direct {p0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->locatePositionInWindow()V

    .line 9
    .line 10
    iget-object v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mBubbleView:Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$BubbleView;

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
    iget-boolean v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isAlwaysShowBubble:Z

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    iget-object v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mLayoutParams:Landroid/view/WindowManager$LayoutParams;

    .line 23
    .line 24
    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mBubbleCenterRawSolidY:F

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
    iget-object v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mWindowManager:Landroid/view/WindowManager;

    .line 33
    .line 34
    iget-object v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mBubbleView:Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$BubbleView;

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
.end method

.method public getConfigBuilder()Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mConfigBuilder:Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, p0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;-><init>(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;)V

    .line 10
    .line 11
    iput-object v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mConfigBuilder:Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mConfigBuilder:Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;

    .line 14
    .line 15
    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mMin:F

    .line 16
    .line 17
    iput v1, v0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->a:F

    .line 18
    .line 19
    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mMax:F

    .line 20
    .line 21
    iput v1, v0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->b:F

    .line 22
    .line 23
    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mProgress:F

    .line 24
    .line 25
    iput v1, v0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->c:F

    .line 26
    .line 27
    iget-boolean v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isFloatType:Z

    .line 28
    .line 29
    iput-boolean v1, v0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->d:Z

    .line 30
    .line 31
    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mTrackSize:I

    .line 32
    .line 33
    iput v1, v0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->e:I

    .line 34
    .line 35
    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSecondTrackSize:I

    .line 36
    .line 37
    iput v1, v0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->f:I

    .line 38
    .line 39
    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbRadius:I

    .line 40
    .line 41
    iput v1, v0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->g:I

    .line 42
    .line 43
    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbRadiusOnDragging:I

    .line 44
    .line 45
    iput v1, v0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->h:I

    .line 46
    .line 47
    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mTrackColor:I

    .line 48
    .line 49
    iput v1, v0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->i:I

    .line 50
    .line 51
    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSecondTrackColor:I

    .line 52
    .line 53
    iput v1, v0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->j:I

    .line 54
    .line 55
    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbColor:I

    .line 56
    .line 57
    iput v1, v0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->k:I

    .line 58
    .line 59
    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionCount:I

    .line 60
    .line 61
    iput v1, v0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->l:I

    .line 62
    .line 63
    iget-boolean v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isShowSectionMark:Z

    .line 64
    .line 65
    iput-boolean v1, v0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->m:Z

    .line 66
    .line 67
    iget-boolean v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isAutoAdjustSectionMark:Z

    .line 68
    .line 69
    iput-boolean v1, v0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->n:Z

    .line 70
    .line 71
    iget-boolean v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isShowSectionText:Z

    .line 72
    .line 73
    iput-boolean v1, v0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->o:Z

    .line 74
    .line 75
    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionTextSize:I

    .line 76
    .line 77
    iput v1, v0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->p:I

    .line 78
    .line 79
    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionTextColor:I

    .line 80
    .line 81
    iput v1, v0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->q:I

    .line 82
    .line 83
    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionTextPosition:I

    .line 84
    .line 85
    iput v1, v0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->r:I

    .line 86
    .line 87
    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionTextInterval:I

    .line 88
    .line 89
    iput v1, v0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->s:I

    .line 90
    .line 91
    iget-boolean v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isShowThumbText:Z

    .line 92
    .line 93
    iput-boolean v1, v0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->t:Z

    .line 94
    .line 95
    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbTextSize:I

    .line 96
    .line 97
    iput v1, v0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->u:I

    .line 98
    .line 99
    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbTextColor:I

    .line 100
    .line 101
    iput v1, v0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->v:I

    .line 102
    .line 103
    iget-boolean v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isShowProgressInFloat:Z

    .line 104
    .line 105
    iput-boolean v1, v0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->w:Z

    .line 106
    .line 107
    iget-wide v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mAnimDuration:J

    .line 108
    .line 109
    iput-wide v1, v0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->x:J

    .line 110
    .line 111
    iget-boolean v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isTouchToSeek:Z

    .line 112
    .line 113
    iput-boolean v1, v0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->y:Z

    .line 114
    .line 115
    iget-boolean v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isSeekStepSection:Z

    .line 116
    .line 117
    iput-boolean v1, v0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->z:Z

    .line 118
    .line 119
    iget-boolean v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isSeekBySection:Z

    .line 120
    .line 121
    iput-boolean v1, v0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->A:Z

    .line 122
    .line 123
    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mBubbleColor:I

    .line 124
    .line 125
    iput v1, v0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->B:I

    .line 126
    .line 127
    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mBubbleTextSize:I

    .line 128
    .line 129
    iput v1, v0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->C:I

    .line 130
    .line 131
    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mBubbleTextColor:I

    .line 132
    .line 133
    iput v1, v0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->D:I

    .line 134
    .line 135
    iget-boolean v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isAlwaysShowBubble:Z

    .line 136
    .line 137
    iput-boolean v1, v0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->E:Z

    .line 138
    .line 139
    iget-wide v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mAlwaysShowBubbleDelay:J

    .line 140
    .line 141
    iput-wide v1, v0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->F:J

    .line 142
    .line 143
    iget-boolean v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isHideBubble:Z

    .line 144
    .line 145
    iput-boolean v1, v0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->G:Z

    .line 146
    .line 147
    iget-boolean v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isRtl:Z

    .line 148
    .line 149
    iput-boolean v1, v0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->H:Z

    .line 150
    .line 151
    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->roundMode:I

    .line 152
    .line 153
    iput v1, v0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->I:I

    .line 154
    .line 155
    iget-boolean v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->hideNoTextSectionMark:Z

    .line 156
    .line 157
    iput-boolean v1, v0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/b;->K:Z

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
.end method

.method public getMax()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mMax:F

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

.method public getMin()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mMin:F

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

.method public getOnProgressChangedListener()Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$k;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mProgressListener:Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$k;

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

.method public getProgress()I
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->processProgress()F

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

.method public getProgressFloat()F
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->processProgress()F

    .line 4
    move-result v0

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, v0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->formatFloat(F)F

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

.method public onDetachedFromWindow()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->hideBubble()V

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

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 14

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    int-to-float v0, v0

    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v2

    sub-int/2addr v1, v2

    int-to-float v1, v1

    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    iget v3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbRadiusOnDragging:I

    add-int/2addr v2, v3

    int-to-float v5, v2

    .line 5
    iget-boolean v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isShowSectionText:Z

    const/16 v9, 0xa

    const-string v10, "0123456789"

    const/4 v11, 0x1

    const/4 v12, 0x0

    if-eqz v2, :cond_3

    .line 6
    iget-object v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    iget v3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionTextColor:I

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 7
    iget-object v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    iget v3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionTextSize:I

    int-to-float v3, v3

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 8
    iget-object v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    iget-object v3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mRectText:Landroid/graphics/Rect;

    invoke-virtual {v2, v10, v12, v9, v3}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 9
    iget v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionTextPosition:I

    if-nez v2, :cond_0

    .line 10
    iget-object v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mRectText:Landroid/graphics/Rect;

    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    move-result v2

    int-to-float v2, v2

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    add-float/2addr v2, v5

    .line 11
    iget-object v4, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionTextArray:Landroid/util/SparseArray;

    invoke-virtual {v4, v12}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 12
    iget-object v6, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v7

    iget-object v8, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mRectText:Landroid/graphics/Rect;

    invoke-virtual {v6, v4, v12, v7, v8}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 13
    iget-object v6, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mRectText:Landroid/graphics/Rect;

    invoke-virtual {v6}, Landroid/graphics/Rect;->width()I

    move-result v6

    int-to-float v6, v6

    div-float/2addr v6, v3

    add-float/2addr v6, v0

    iget-object v7, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v4, v6, v2, v7}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 14
    iget-object v4, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mRectText:Landroid/graphics/Rect;

    invoke-virtual {v4}, Landroid/graphics/Rect;->width()I

    move-result v4

    iget v6, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mTextSpace:I

    add-int/2addr v4, v6

    int-to-float v4, v4

    add-float/2addr v0, v4

    .line 15
    iget-object v4, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionTextArray:Landroid/util/SparseArray;

    iget v6, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionCount:I

    invoke-virtual {v4, v6}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 16
    iget-object v6, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v7

    iget-object v8, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mRectText:Landroid/graphics/Rect;

    invoke-virtual {v6, v4, v12, v7, v8}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 17
    iget-object v6, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mRectText:Landroid/graphics/Rect;

    invoke-virtual {v6}, Landroid/graphics/Rect;->width()I

    move-result v6

    int-to-float v6, v6

    const/high16 v7, 0x3f000000    # 0.5f

    add-float/2addr v6, v7

    div-float/2addr v6, v3

    sub-float v3, v1, v6

    iget-object v6, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v4, v3, v2, v6}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 18
    iget-object v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mRectText:Landroid/graphics/Rect;

    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    move-result v2

    iget v3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mTextSpace:I

    add-int/2addr v2, v3

    int-to-float v2, v2

    sub-float/2addr v1, v2

    goto :goto_0

    :cond_0
    if-lt v2, v11, :cond_4

    .line 19
    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbRadiusOnDragging:I

    int-to-float v0, v0

    add-float/2addr v0, v5

    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mTextSpace:I

    int-to-float v1, v1

    add-float/2addr v0, v1

    .line 20
    iget-object v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionTextArray:Landroid/util/SparseArray;

    invoke-virtual {v1, v12}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 21
    iget-object v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    iget-object v4, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mRectText:Landroid/graphics/Rect;

    invoke-virtual {v2, v1, v12, v3, v4}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 22
    iget-object v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mRectText:Landroid/graphics/Rect;

    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    move-result v2

    int-to-float v2, v2

    add-float/2addr v0, v2

    .line 23
    iget v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mLeft:F

    .line 24
    iget v3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionTextPosition:I

    if-ne v3, v11, :cond_1

    .line 25
    iget-object v3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v2, v0, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 26
    :cond_1
    iget-object v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionTextArray:Landroid/util/SparseArray;

    iget v3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionCount:I

    invoke-virtual {v1, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 27
    iget-object v3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    iget-object v6, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mRectText:Landroid/graphics/Rect;

    invoke-virtual {v3, v1, v12, v4, v6}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 28
    iget v3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mRight:F

    .line 29
    iget v4, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionTextPosition:I

    if-ne v4, v11, :cond_2

    .line 30
    iget-object v4, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v3, v0, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    :cond_2
    move v0, v2

    move v1, v3

    goto :goto_0

    .line 31
    :cond_3
    iget-boolean v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isShowThumbText:Z

    if-eqz v2, :cond_4

    iget v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionTextPosition:I

    const/4 v3, -0x1

    if-ne v2, v3, :cond_4

    .line 32
    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mLeft:F

    .line 33
    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mRight:F

    .line 34
    :cond_4
    :goto_0
    iget-boolean v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isShowSectionText:Z

    if-nez v2, :cond_5

    iget-boolean v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isShowThumbText:Z

    if-eqz v2, :cond_6

    :cond_5
    iget v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionTextPosition:I

    if-nez v2, :cond_7

    .line 35
    :cond_6
    iget v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbRadiusOnDragging:I

    int-to-float v3, v2

    add-float/2addr v0, v3

    int-to-float v2, v2

    sub-float/2addr v1, v2

    :cond_7
    move v4, v1

    .line 36
    iget-boolean v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isThumbOnDragging:Z

    if-eqz v1, :cond_8

    iget-boolean v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isAlwaysShowBubble:Z

    if-eqz v1, :cond_a

    .line 37
    :cond_8
    iget-boolean v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isRtl:Z

    if-eqz v1, :cond_9

    .line 38
    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mTrackLength:F

    iget v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mDelta:F

    div-float/2addr v1, v2

    iget v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mProgress:F

    iget v3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mMin:F

    sub-float/2addr v2, v3

    mul-float/2addr v1, v2

    sub-float v1, v4, v1

    iput v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbCenterX:F

    goto :goto_1

    .line 39
    :cond_9
    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mTrackLength:F

    iget v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mDelta:F

    div-float/2addr v1, v2

    iget v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mProgress:F

    iget v3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mMin:F

    sub-float/2addr v2, v3

    mul-float/2addr v1, v2

    add-float/2addr v1, v0

    iput v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbCenterX:F

    .line 40
    :cond_a
    :goto_1
    iget-object v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    iget v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSecondTrackColor:I

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 41
    iget-object v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    iget v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSecondTrackSize:I

    int-to-float v2, v2

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 42
    iget-boolean v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isRtl:Z

    if-eqz v1, :cond_b

    .line 43
    iget v6, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbCenterX:F

    iget-object v8, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    move v7, v5

    move-object v3, p1

    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    move v1, v4

    move v4, v0

    goto :goto_2

    :cond_b
    move-object v3, p1

    move v1, v4

    .line 44
    iget v6, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbCenterX:F

    iget-object v8, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    move v7, v5

    move v4, v0

    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 45
    :goto_2
    iget-object p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mTrackColor:I

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 46
    iget-object p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mTrackSize:I

    int-to-float v0, v0

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 47
    iget-boolean p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isRtl:Z

    if-eqz p1, :cond_c

    move v6, v4

    .line 48
    iget v4, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbCenterX:F

    iget-object v8, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    move v7, v5

    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    move v0, v6

    goto :goto_3

    :cond_c
    move v0, v4

    .line 49
    iget v4, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbCenterX:F

    iget-object v8, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    move v7, v5

    move v6, v1

    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 50
    :goto_3
    iget-boolean p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isShowSectionText:Z

    if-eqz p1, :cond_d

    iget p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionTextPosition:I

    const/4 v2, 0x2

    if-ne p1, v2, :cond_d

    move p1, v11

    goto :goto_4

    :cond_d
    move p1, v12

    :goto_4
    if-nez p1, :cond_e

    .line 51
    iget-boolean v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isShowSectionMark:Z

    if-eqz v2, :cond_15

    .line 52
    :cond_e
    iget-object v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    iget v4, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionTextSize:I

    int-to-float v4, v4

    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 53
    iget-object v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    iget-object v4, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mRectText:Landroid/graphics/Rect;

    invoke-virtual {v2, v10, v12, v9, v4}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 54
    iget-object v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mRectText:Landroid/graphics/Rect;

    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    move-result v2

    int-to-float v2, v2

    add-float/2addr v2, v5

    iget v4, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbRadiusOnDragging:I

    int-to-float v4, v4

    add-float/2addr v2, v4

    iget v4, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mTextSpace:I

    int-to-float v4, v4

    add-float/2addr v2, v4

    .line 55
    iget-boolean v4, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isRtl:Z

    if-eqz v4, :cond_f

    .line 56
    iget v4, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mRight:F

    iget v6, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mTrackLength:F

    iget v7, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mDelta:F

    div-float/2addr v6, v7

    iget v7, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mProgress:F

    iget v8, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mMin:F

    sub-float/2addr v7, v8

    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    move-result v7

    mul-float/2addr v6, v7

    sub-float/2addr v4, v6

    goto :goto_5

    .line 57
    :cond_f
    iget v4, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mLeft:F

    iget v6, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mTrackLength:F

    iget v7, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mDelta:F

    div-float/2addr v6, v7

    iget v7, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mProgress:F

    iget v8, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mMin:F

    sub-float/2addr v7, v8

    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    move-result v7

    mul-float/2addr v6, v7

    add-float/2addr v4, v6

    :goto_5
    move v6, v12

    .line 58
    :goto_6
    iget v7, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionCount:I

    if-gt v6, v7, :cond_15

    .line 59
    iget-boolean v7, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->hideNoTextSectionMark:Z

    if-eqz v7, :cond_10

    iget-object v7, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionTextArray:Landroid/util/SparseArray;

    invoke-virtual {v7, v6}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/CharSequence;

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_10

    goto :goto_a

    :cond_10
    int-to-float v7, v6

    .line 60
    iget v8, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionOffset:F

    mul-float/2addr v7, v8

    add-float/2addr v7, v0

    .line 61
    iget-object v8, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    iget v13, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mFillColor:I

    invoke-virtual {v8, v13}, Landroid/graphics/Paint;->setColor(I)V

    .line 62
    iget v8, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mTrackRadius:I

    int-to-float v8, v8

    iget-object v13, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {v3, v7, v5, v8, v13}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 63
    iget-boolean v8, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isRtl:Z

    if-eqz v8, :cond_12

    .line 64
    iget-object v8, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    cmpg-float v13, v7, v4

    if-gtz v13, :cond_11

    iget v13, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mTrackColor:I

    goto :goto_7

    :cond_11
    iget v13, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSecondTrackColor:I

    :goto_7
    invoke-virtual {v8, v13}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_9

    .line 65
    :cond_12
    iget-object v8, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    cmpg-float v13, v7, v4

    if-gtz v13, :cond_13

    iget v13, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSecondTrackColor:I

    goto :goto_8

    :cond_13
    iget v13, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mTrackColor:I

    :goto_8
    invoke-virtual {v8, v13}, Landroid/graphics/Paint;->setColor(I)V

    .line 66
    :goto_9
    iget v8, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mTrackRadius:I

    iget v13, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mFillSize:I

    sub-int/2addr v8, v13

    int-to-float v8, v8

    iget-object v13, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {v3, v7, v5, v8, v13}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    if-eqz p1, :cond_14

    .line 67
    iget-object v8, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    iget v13, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionTextColor:I

    invoke-virtual {v8, v13}, Landroid/graphics/Paint;->setColor(I)V

    .line 68
    iget-object v8, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionTextArray:Landroid/util/SparseArray;

    const/4 v13, 0x0

    invoke-virtual {v8, v6, v13}, Landroid/util/SparseArray;->get(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    if-eqz v8, :cond_14

    .line 69
    iget-object v8, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionTextArray:Landroid/util/SparseArray;

    invoke-virtual {v8, v6}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    iget-object v13, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {v3, v8, v7, v2, v13}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    :cond_14
    :goto_a
    add-int/lit8 v6, v6, 0x1

    goto :goto_6

    .line 70
    :cond_15
    iget-boolean p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isShowThumbText:Z

    if-eqz p1, :cond_18

    iget-boolean p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isThumbOnDragging:Z

    if-nez p1, :cond_18

    iget-boolean p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isTouchToSeekAnimEnd:Z

    if-eqz p1, :cond_18

    .line 71
    iget-object p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    iget v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbTextColor:I

    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 72
    iget-object p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    iget v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbTextSize:I

    int-to-float v2, v2

    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 73
    iget-object p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    iget-object v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mRectText:Landroid/graphics/Rect;

    invoke-virtual {p1, v10, v12, v9, v2}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 74
    iget-object p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mRectText:Landroid/graphics/Rect;

    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result p1

    int-to-float p1, p1

    add-float/2addr p1, v5

    iget v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbRadiusOnDragging:I

    int-to-float v2, v2

    add-float/2addr p1, v2

    iget v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mTextSpace:I

    int-to-float v2, v2

    add-float/2addr p1, v2

    .line 75
    iget-boolean v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isFloatType:Z

    if-nez v2, :cond_17

    iget-boolean v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isShowProgressInFloat:Z

    if-eqz v2, :cond_16

    iget v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionTextPosition:I

    if-ne v2, v11, :cond_16

    iget v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mProgress:F

    iget v4, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mMin:F

    cmpl-float v4, v2, v4

    if-eqz v4, :cond_16

    iget v4, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mMax:F

    cmpl-float v2, v2, v4

    if-eqz v2, :cond_16

    goto :goto_b

    .line 76
    :cond_16
    invoke-virtual {p0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->getProgress()I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    iget v4, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbCenterX:F

    iget-object v6, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {v3, v2, v4, p1, v6}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    goto :goto_c

    .line 77
    :cond_17
    :goto_b
    invoke-virtual {p0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->getProgressFloat()F

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v2

    iget v4, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbCenterX:F

    iget-object v6, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {v3, v2, v4, p1, v6}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 78
    :cond_18
    :goto_c
    iget-boolean p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->showCenterPoint:Z

    if-eqz p1, :cond_1d

    iget p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mDefaultProgress:F

    const/4 v2, 0x0

    cmpl-float v2, p1, v2

    if-lez v2, :cond_1d

    .line 79
    iget-boolean v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isRtl:Z

    if-eqz v2, :cond_19

    .line 80
    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mTrackLength:F

    iget v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mDelta:F

    div-float/2addr v0, v2

    iget v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mMin:F

    sub-float/2addr p1, v2

    mul-float/2addr v0, p1

    sub-float v4, v1, v0

    goto :goto_d

    .line 81
    :cond_19
    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mTrackLength:F

    iget v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mDelta:F

    div-float/2addr v1, v2

    iget v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mMin:F

    sub-float/2addr p1, v2

    mul-float/2addr v1, p1

    add-float v4, v0, v1

    .line 82
    :goto_d
    iget-object p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/kubi/sdk/res/R$color;->c_overlay:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    const/4 p1, 0x5

    .line 83
    invoke-static {p1}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/c;->b(I)I

    move-result p1

    int-to-float p1, p1

    iget-object v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {v3, v4, v5, p1, v0}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 84
    iget-boolean p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isRtl:Z

    if-nez p1, :cond_1b

    .line 85
    iget p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbCenterX:F

    cmpl-float p1, p1, v4

    if-lez p1, :cond_1a

    .line 86
    iget-object p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSecondTrackColor:I

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_e

    .line 87
    :cond_1a
    iget-object p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mTrackColor:I

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_e

    .line 88
    :cond_1b
    iget p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbCenterX:F

    cmpg-float p1, p1, v4

    if-gez p1, :cond_1c

    .line 89
    iget-object p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSecondTrackColor:I

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_e

    .line 90
    :cond_1c
    iget-object p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mTrackColor:I

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    :goto_e
    const/high16 p1, 0x40600000    # 3.5f

    .line 91
    invoke-static {p1}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/c;->a(F)I

    move-result p1

    int-to-float p1, p1

    iget-object v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {v3, v4, v5, p1, v0}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 92
    :cond_1d
    iget-object p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbColor:I

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 93
    iget p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbCenterX:F

    iget-boolean v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isThumbOnDragging:Z

    if-eqz v0, :cond_1e

    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbRadiusOnDragging:I

    :goto_f
    int-to-float v0, v0

    goto :goto_10

    :cond_1e
    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbRadius:I

    goto :goto_f

    :goto_10
    iget-object v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {v3, p1, v5, v0, v1}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 94
    iget-object p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mFillColor:I

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 95
    iget p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbCenterX:F

    iget-boolean v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isThumbOnDragging:Z

    if-eqz v0, :cond_1f

    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbRadiusOnDragging:I

    :goto_11
    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mFillSize:I

    sub-int/2addr v0, v1

    int-to-float v0, v0

    goto :goto_12

    :cond_1f
    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbRadius:I

    goto :goto_11

    :goto_12
    iget-object v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {v3, p1, v5, v0, v1}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    return-void
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
    iget-boolean p2, p1, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isHideBubble:Z

    .line 7
    .line 8
    if-nez p2, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->locatePositionInWindow()V

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
.end method

.method public onMeasure(II)V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 4
    .line 5
    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbRadiusOnDragging:I

    .line 6
    .line 7
    mul-int/lit8 v0, v0, 0x2

    .line 8
    .line 9
    iget-boolean v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isShowThumbText:Z

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
    iget-object v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 18
    .line 19
    iget v5, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbTextSize:I

    .line 20
    int-to-float v5, v5

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v5}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 24
    .line 25
    iget-object v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 26
    .line 27
    iget-object v5, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mRectText:Landroid/graphics/Rect;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, v2, v4, v3, v5}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 31
    .line 32
    iget-object v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mRectText:Landroid/graphics/Rect;

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
    iget-boolean v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isShowSectionText:Z

    .line 40
    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionTextPosition:I

    .line 44
    .line 45
    if-lt v1, v3, :cond_1

    .line 46
    .line 47
    iget-object v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 48
    .line 49
    iget v5, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionTextSize:I

    .line 50
    int-to-float v5, v5

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1, v5}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 54
    .line 55
    iget-object v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 56
    .line 57
    iget-object v5, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mRectText:Landroid/graphics/Rect;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, v2, v4, v3, v5}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 61
    .line 62
    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbRadiusOnDragging:I

    .line 63
    .line 64
    mul-int/lit8 v1, v1, 0x2

    .line 65
    .line 66
    iget-object v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mRectText:Landroid/graphics/Rect;

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
    .line 78
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 79
    move-result v1

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 83
    move-result v2

    .line 84
    add-int/2addr v1, v2

    .line 85
    add-int/2addr v0, v1

    .line 86
    .line 87
    const/16 v1, 0xb4

    .line 88
    .line 89
    .line 90
    invoke-static {v1}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/c;->b(I)I

    .line 91
    move-result v1

    .line 92
    .line 93
    .line 94
    invoke-static {v1, p1}, Landroid/view/View;->resolveSize(II)I

    .line 95
    move-result v1

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0, v1, v0}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 102
    move-result v0

    .line 103
    .line 104
    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbRadiusOnDragging:I

    .line 105
    add-int/2addr v0, v1

    .line 106
    int-to-float v0, v0

    .line 107
    .line 108
    iput v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mLeft:F

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 112
    move-result v0

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 116
    move-result v1

    .line 117
    sub-int/2addr v0, v1

    .line 118
    .line 119
    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbRadiusOnDragging:I

    .line 120
    sub-int/2addr v0, v1

    .line 121
    int-to-float v0, v0

    .line 122
    .line 123
    iput v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mRight:F

    .line 124
    .line 125
    iget-boolean v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isShowSectionText:Z

    .line 126
    .line 127
    const/high16 v1, 0x40000000    # 2.0f

    .line 128
    .line 129
    if-eqz v0, :cond_3

    .line 130
    .line 131
    iget-object v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 132
    .line 133
    iget v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionTextSize:I

    .line 134
    int-to-float v2, v2

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 138
    .line 139
    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionTextPosition:I

    .line 140
    .line 141
    if-nez v0, :cond_2

    .line 142
    .line 143
    iget-object v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionTextArray:Landroid/util/SparseArray;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0, v4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 147
    move-result-object v0

    .line 148
    .line 149
    check-cast v0, Ljava/lang/String;

    .line 150
    .line 151
    iget-object v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 155
    move-result v2

    .line 156
    .line 157
    iget-object v3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mRectText:Landroid/graphics/Rect;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v1, v0, v4, v2, v3}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 161
    .line 162
    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mLeft:F

    .line 163
    .line 164
    iget-object v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mRectText:Landroid/graphics/Rect;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    .line 168
    move-result v1

    .line 169
    .line 170
    iget v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mTextSpace:I

    .line 171
    add-int/2addr v1, v2

    .line 172
    int-to-float v1, v1

    .line 173
    add-float/2addr v0, v1

    .line 174
    .line 175
    iput v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mLeft:F

    .line 176
    .line 177
    iget-object v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionTextArray:Landroid/util/SparseArray;

    .line 178
    .line 179
    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionCount:I

    .line 180
    .line 181
    .line 182
    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 183
    move-result-object v0

    .line 184
    .line 185
    check-cast v0, Ljava/lang/String;

    .line 186
    .line 187
    iget-object v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 191
    move-result v2

    .line 192
    .line 193
    iget-object v3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mRectText:Landroid/graphics/Rect;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v1, v0, v4, v2, v3}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 197
    .line 198
    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mRight:F

    .line 199
    .line 200
    iget-object v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mRectText:Landroid/graphics/Rect;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    .line 204
    move-result v1

    .line 205
    .line 206
    iget v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mTextSpace:I

    .line 207
    add-int/2addr v1, v2

    .line 208
    int-to-float v1, v1

    .line 209
    sub-float/2addr v0, v1

    .line 210
    .line 211
    iput v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mRight:F

    .line 212
    .line 213
    goto/16 :goto_0

    .line 214
    .line 215
    :cond_2
    if-lt v0, v3, :cond_4

    .line 216
    .line 217
    iget-object v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionTextArray:Landroid/util/SparseArray;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v0, v4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 221
    move-result-object v0

    .line 222
    .line 223
    check-cast v0, Ljava/lang/String;

    .line 224
    .line 225
    iget-object v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 229
    move-result v3

    .line 230
    .line 231
    iget-object v5, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mRectText:Landroid/graphics/Rect;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v2, v0, v4, v3, v5}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 235
    .line 236
    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbRadiusOnDragging:I

    .line 237
    int-to-float v0, v0

    .line 238
    .line 239
    iget-object v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mRectText:Landroid/graphics/Rect;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    .line 243
    move-result v2

    .line 244
    int-to-float v2, v2

    .line 245
    div-float/2addr v2, v1

    .line 246
    .line 247
    .line 248
    invoke-static {v0, v2}, Ljava/lang/Math;->max(FF)F

    .line 249
    move-result v0

    .line 250
    .line 251
    .line 252
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 253
    move-result v2

    .line 254
    int-to-float v2, v2

    .line 255
    add-float/2addr v2, v0

    .line 256
    .line 257
    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mTextSpace:I

    .line 258
    int-to-float v0, v0

    .line 259
    add-float/2addr v2, v0

    .line 260
    .line 261
    iput v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mLeft:F

    .line 262
    .line 263
    iget-object v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionTextArray:Landroid/util/SparseArray;

    .line 264
    .line 265
    iget v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionCount:I

    .line 266
    .line 267
    .line 268
    invoke-virtual {v0, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 269
    move-result-object v0

    .line 270
    .line 271
    check-cast v0, Ljava/lang/String;

    .line 272
    .line 273
    iget-object v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 277
    move-result v3

    .line 278
    .line 279
    iget-object v5, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mRectText:Landroid/graphics/Rect;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v2, v0, v4, v3, v5}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 283
    .line 284
    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbRadiusOnDragging:I

    .line 285
    int-to-float v0, v0

    .line 286
    .line 287
    iget-object v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mRectText:Landroid/graphics/Rect;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    .line 291
    move-result v2

    .line 292
    int-to-float v2, v2

    .line 293
    div-float/2addr v2, v1

    .line 294
    .line 295
    .line 296
    invoke-static {v0, v2}, Ljava/lang/Math;->max(FF)F

    .line 297
    move-result v0

    .line 298
    .line 299
    .line 300
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 301
    move-result v1

    .line 302
    .line 303
    .line 304
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 305
    move-result v2

    .line 306
    sub-int/2addr v1, v2

    .line 307
    int-to-float v1, v1

    .line 308
    sub-float/2addr v1, v0

    .line 309
    .line 310
    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mTextSpace:I

    .line 311
    int-to-float v0, v0

    .line 312
    sub-float/2addr v1, v0

    .line 313
    .line 314
    iput v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mRight:F

    .line 315
    goto :goto_0

    .line 316
    .line 317
    :cond_3
    iget-boolean v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isShowThumbText:Z

    .line 318
    .line 319
    if-eqz v0, :cond_4

    .line 320
    .line 321
    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionTextPosition:I

    .line 322
    const/4 v2, -0x1

    .line 323
    .line 324
    if-ne v0, v2, :cond_4

    .line 325
    .line 326
    iget-object v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 327
    .line 328
    iget v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbTextSize:I

    .line 329
    int-to-float v2, v2

    .line 330
    .line 331
    .line 332
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 333
    .line 334
    iget-object v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionTextArray:Landroid/util/SparseArray;

    .line 335
    .line 336
    .line 337
    invoke-virtual {v0, v4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 338
    move-result-object v0

    .line 339
    .line 340
    check-cast v0, Ljava/lang/String;

    .line 341
    .line 342
    iget-object v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 343
    .line 344
    .line 345
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 346
    move-result v3

    .line 347
    .line 348
    iget-object v5, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mRectText:Landroid/graphics/Rect;

    .line 349
    .line 350
    .line 351
    invoke-virtual {v2, v0, v4, v3, v5}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 352
    .line 353
    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbRadiusOnDragging:I

    .line 354
    int-to-float v0, v0

    .line 355
    .line 356
    iget-object v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mRectText:Landroid/graphics/Rect;

    .line 357
    .line 358
    .line 359
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    .line 360
    move-result v2

    .line 361
    int-to-float v2, v2

    .line 362
    div-float/2addr v2, v1

    .line 363
    .line 364
    .line 365
    invoke-static {v0, v2}, Ljava/lang/Math;->max(FF)F

    .line 366
    move-result v0

    .line 367
    .line 368
    .line 369
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 370
    move-result v2

    .line 371
    int-to-float v2, v2

    .line 372
    add-float/2addr v2, v0

    .line 373
    .line 374
    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mTextSpace:I

    .line 375
    int-to-float v0, v0

    .line 376
    add-float/2addr v2, v0

    .line 377
    .line 378
    iput v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mLeft:F

    .line 379
    .line 380
    iget-object v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionTextArray:Landroid/util/SparseArray;

    .line 381
    .line 382
    iget v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionCount:I

    .line 383
    .line 384
    .line 385
    invoke-virtual {v0, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 386
    move-result-object v0

    .line 387
    .line 388
    check-cast v0, Ljava/lang/String;

    .line 389
    .line 390
    iget-object v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 391
    .line 392
    .line 393
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 394
    move-result v3

    .line 395
    .line 396
    iget-object v5, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mRectText:Landroid/graphics/Rect;

    .line 397
    .line 398
    .line 399
    invoke-virtual {v2, v0, v4, v3, v5}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 400
    .line 401
    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbRadiusOnDragging:I

    .line 402
    int-to-float v0, v0

    .line 403
    .line 404
    iget-object v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mRectText:Landroid/graphics/Rect;

    .line 405
    .line 406
    .line 407
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    .line 408
    move-result v2

    .line 409
    int-to-float v2, v2

    .line 410
    div-float/2addr v2, v1

    .line 411
    .line 412
    .line 413
    invoke-static {v0, v2}, Ljava/lang/Math;->max(FF)F

    .line 414
    move-result v0

    .line 415
    .line 416
    .line 417
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 418
    move-result v1

    .line 419
    .line 420
    .line 421
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 422
    move-result v2

    .line 423
    sub-int/2addr v1, v2

    .line 424
    int-to-float v1, v1

    .line 425
    sub-float/2addr v1, v0

    .line 426
    .line 427
    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mTextSpace:I

    .line 428
    int-to-float v0, v0

    .line 429
    sub-float/2addr v1, v0

    .line 430
    .line 431
    iput v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mRight:F

    .line 432
    .line 433
    :cond_4
    :goto_0
    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mRight:F

    .line 434
    .line 435
    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mLeft:F

    .line 436
    sub-float/2addr v0, v1

    .line 437
    .line 438
    iput v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mTrackLength:F

    .line 439
    .line 440
    const/high16 v1, 0x3f800000    # 1.0f

    .line 441
    mul-float/2addr v0, v1

    .line 442
    .line 443
    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionCount:I

    .line 444
    int-to-float v1, v1

    .line 445
    div-float/2addr v0, v1

    .line 446
    .line 447
    iput v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionOffset:F

    .line 448
    .line 449
    iget-boolean v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isHideBubble:Z

    .line 450
    .line 451
    if-nez v0, :cond_5

    .line 452
    .line 453
    iget-object v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mBubbleView:Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$BubbleView;

    .line 454
    .line 455
    .line 456
    invoke-virtual {v0, p1, p2}, Landroid/view/View;->measure(II)V

    .line 457
    :cond_5
    return-void
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
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
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
    iput v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mProgress:F

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
    iget-object p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mBubbleView:Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$BubbleView;

    .line 26
    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    iget-boolean v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isShowProgressInFloat:Z

    .line 30
    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->getProgressFloat()F

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
    invoke-virtual {p0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->getProgress()I

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
    invoke-virtual {p1, v0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$BubbleView;->a(Ljava/lang/String;)V

    .line 52
    .line 53
    :cond_1
    iget p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mProgress:F

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0, p1}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->setProgress(F)V

    .line 57
    return-void

    .line 58
    .line 59
    .line 60
    :cond_2
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 61
    return-void
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
    iget v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mProgress:F

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

.method public onSizeChanged(IIII)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 4
    .line 5
    new-instance p1, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$a;

    .line 6
    .line 7
    .line 8
    invoke-direct {p1, p0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$a;-><init>(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;)V

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
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mCanSeek:Ljava/lang/Boolean;

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
    iget-boolean v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isThumbOnDragging:Z

    .line 30
    .line 31
    if-eqz v0, :cond_1a

    .line 32
    .line 33
    iget-boolean v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isSeekStepSection:Z

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
    invoke-direct {p0, v0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->calThumbCxWhenSeekStepSection(F)F

    .line 43
    move-result v0

    .line 44
    .line 45
    iget v3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPreThumbCenterX:F

    .line 46
    .line 47
    cmpl-float v3, v0, v3

    .line 48
    .line 49
    if-eqz v3, :cond_1a

    .line 50
    .line 51
    iput v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPreThumbCenterX:F

    .line 52
    .line 53
    iput v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbCenterX:F

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
    iget v3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->dx:F

    .line 61
    add-float/2addr v0, v3

    .line 62
    .line 63
    iput v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbCenterX:F

    .line 64
    .line 65
    iget v3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mLeft:F

    .line 66
    .line 67
    cmpg-float v0, v0, v3

    .line 68
    .line 69
    if-gez v0, :cond_3

    .line 70
    .line 71
    iput v3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbCenterX:F

    .line 72
    .line 73
    :cond_3
    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbCenterX:F

    .line 74
    .line 75
    iget v3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mRight:F

    .line 76
    .line 77
    cmpl-float v0, v0, v3

    .line 78
    .line 79
    if-lez v0, :cond_4

    .line 80
    .line 81
    iput v3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbCenterX:F

    .line 82
    .line 83
    .line 84
    :cond_4
    :goto_0
    invoke-direct {p0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->calculateProgress()F

    .line 85
    move-result v0

    .line 86
    .line 87
    iput v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mProgress:F

    .line 88
    .line 89
    iget-boolean v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isHideBubble:Z

    .line 90
    .line 91
    if-nez v0, :cond_6

    .line 92
    .line 93
    iget-object v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mBubbleView:Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$BubbleView;

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
    invoke-direct {p0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->calculateCenterRawXofBubbleView()F

    .line 103
    move-result v0

    .line 104
    .line 105
    iput v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mBubbleCenterRawX:F

    .line 106
    .line 107
    iget-object v3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mLayoutParams:Landroid/view/WindowManager$LayoutParams;

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
    iget-object v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mWindowManager:Landroid/view/WindowManager;

    .line 116
    .line 117
    iget-object v4, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mBubbleView:Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$BubbleView;

    .line 118
    .line 119
    .line 120
    invoke-interface {v0, v4, v3}, Landroid/view/ViewManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 121
    .line 122
    iget-object v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mBubbleView:Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$BubbleView;

    .line 123
    .line 124
    iget-boolean v3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isShowProgressInFloat:Z

    .line 125
    .line 126
    if-eqz v3, :cond_5

    .line 127
    .line 128
    .line 129
    invoke-virtual {p0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->getProgressFloat()F

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
    invoke-virtual {p0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->getProgress()I

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
    invoke-virtual {v0, v3}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$BubbleView;->a(Ljava/lang/String;)V

    .line 147
    goto :goto_2

    .line 148
    .line 149
    .line 150
    :cond_6
    invoke-direct {p0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->processProgress()F

    .line 151
    .line 152
    .line 153
    :goto_2
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 154
    .line 155
    iget-object v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mProgressListener:Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$k;

    .line 156
    .line 157
    if-eqz v0, :cond_1a

    .line 158
    .line 159
    .line 160
    invoke-virtual {p0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->getProgress()I

    .line 161
    move-result v3

    .line 162
    .line 163
    .line 164
    invoke-virtual {p0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->getProgressFloat()F

    .line 165
    move-result v4

    .line 166
    .line 167
    .line 168
    invoke-interface {v0, p0, v3, v4, v2}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$k;->c(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;IFZ)V

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
    iget-boolean v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isAutoAdjustSectionMark:Z

    .line 180
    .line 181
    if-eqz v0, :cond_9

    .line 182
    .line 183
    iget-boolean v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isTouchToSeek:Z

    .line 184
    .line 185
    if-eqz v0, :cond_8

    .line 186
    .line 187
    new-instance v0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$b;

    .line 188
    .line 189
    .line 190
    invoke-direct {v0, p0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$b;-><init>(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;)V

    .line 191
    .line 192
    iget-wide v3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mAnimDuration:J

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
    invoke-direct {p0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->autoAdjustSection()V

    .line 200
    goto :goto_4

    .line 201
    .line 202
    :cond_9
    iget-boolean v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isThumbOnDragging:Z

    .line 203
    .line 204
    if-nez v0, :cond_a

    .line 205
    .line 206
    iget-boolean v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isTouchToSeek:Z

    .line 207
    .line 208
    if-eqz v0, :cond_d

    .line 209
    .line 210
    :cond_a
    iget-boolean v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isHideBubble:Z

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
    iget-wide v3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mAnimDuration:J

    .line 219
    .line 220
    .line 221
    invoke-virtual {v0, v3, v4}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 222
    move-result-object v0

    .line 223
    .line 224
    iget-boolean v3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isThumbOnDragging:Z

    .line 225
    .line 226
    if-nez v3, :cond_b

    .line 227
    .line 228
    iget-boolean v3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isTouchToSeek:Z

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
    new-instance v3, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$c;

    .line 242
    .line 243
    .line 244
    invoke-direct {v3, p0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$c;-><init>(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;)V

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
    new-instance v0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$d;

    .line 255
    .line 256
    .line 257
    invoke-direct {v0, p0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$d;-><init>(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;)V

    .line 258
    .line 259
    iget-wide v3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mAnimDuration:J

    .line 260
    .line 261
    .line 262
    invoke-virtual {p0, v0, v3, v4}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 263
    .line 264
    :cond_d
    :goto_4
    iget-object v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mProgressListener:Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$k;

    .line 265
    .line 266
    if-eqz v0, :cond_1a

    .line 267
    .line 268
    .line 269
    invoke-virtual {p0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->getProgress()I

    .line 270
    move-result v3

    .line 271
    .line 272
    .line 273
    invoke-virtual {p0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->getProgressFloat()F

    .line 274
    move-result v4

    .line 275
    .line 276
    .line 277
    invoke-interface {v0, p0, v3, v4, v2}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$k;->c(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;IFZ)V

    .line 278
    .line 279
    iget-object v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mProgressListener:Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$k;

    .line 280
    .line 281
    .line 282
    invoke-virtual {p0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->getProgress()I

    .line 283
    move-result v3

    .line 284
    .line 285
    .line 286
    invoke-virtual {p0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->getProgressFloat()F

    .line 287
    move-result v4

    .line 288
    .line 289
    .line 290
    invoke-interface {v0, p0, v3, v4}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$k;->b(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;IF)V

    .line 291
    .line 292
    goto/16 :goto_7

    .line 293
    .line 294
    .line 295
    :cond_e
    invoke-direct {p0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->locatePositionInWindow()V

    .line 296
    .line 297
    .line 298
    invoke-virtual {p0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->performClick()Z

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
    invoke-direct {p0, p1}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isThumbTouched(Landroid/view/MotionEvent;)Z

    .line 309
    move-result v0

    .line 310
    .line 311
    iput-boolean v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isThumbOnDragging:Z

    .line 312
    .line 313
    if-eqz v0, :cond_12

    .line 314
    .line 315
    iget-boolean v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isSeekBySection:Z

    .line 316
    .line 317
    if-eqz v0, :cond_f

    .line 318
    .line 319
    iget-boolean v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->triggerSeekBySection:Z

    .line 320
    .line 321
    if-nez v0, :cond_f

    .line 322
    .line 323
    iput-boolean v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->triggerSeekBySection:Z

    .line 324
    .line 325
    :cond_f
    iget-boolean v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isAlwaysShowBubble:Z

    .line 326
    .line 327
    if-eqz v0, :cond_10

    .line 328
    .line 329
    iget-boolean v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->triggerBubbleShowing:Z

    .line 330
    .line 331
    if-nez v0, :cond_10

    .line 332
    .line 333
    iput-boolean v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->triggerBubbleShowing:Z

    .line 334
    .line 335
    :cond_10
    iget-boolean v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isHideBubble:Z

    .line 336
    .line 337
    if-nez v0, :cond_11

    .line 338
    .line 339
    .line 340
    invoke-direct {p0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->showBubble()V

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
    iget-boolean v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isTouchToSeek:Z

    .line 347
    .line 348
    if-eqz v0, :cond_19

    .line 349
    .line 350
    .line 351
    invoke-direct {p0, p1}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isTrackTouched(Landroid/view/MotionEvent;)Z

    .line 352
    move-result v0

    .line 353
    .line 354
    if-eqz v0, :cond_19

    .line 355
    .line 356
    iput-boolean v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isThumbOnDragging:Z

    .line 357
    .line 358
    iget-boolean v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isSeekBySection:Z

    .line 359
    .line 360
    if-eqz v0, :cond_13

    .line 361
    .line 362
    iget-boolean v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->triggerSeekBySection:Z

    .line 363
    .line 364
    if-nez v0, :cond_13

    .line 365
    .line 366
    iput-boolean v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->triggerSeekBySection:Z

    .line 367
    .line 368
    :cond_13
    iget-boolean v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isAlwaysShowBubble:Z

    .line 369
    .line 370
    if-eqz v0, :cond_14

    .line 371
    .line 372
    .line 373
    invoke-direct {p0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->hideBubble()V

    .line 374
    .line 375
    iput-boolean v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->triggerBubbleShowing:Z

    .line 376
    .line 377
    :cond_14
    iget-boolean v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isSeekStepSection:Z

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
    invoke-direct {p0, v0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->calThumbCxWhenSeekStepSection(F)F

    .line 387
    move-result v0

    .line 388
    .line 389
    iput v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mPreThumbCenterX:F

    .line 390
    .line 391
    iput v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbCenterX:F

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
    iput v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbCenterX:F

    .line 399
    .line 400
    iget v3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mLeft:F

    .line 401
    .line 402
    cmpg-float v0, v0, v3

    .line 403
    .line 404
    if-gez v0, :cond_16

    .line 405
    .line 406
    iput v3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbCenterX:F

    .line 407
    .line 408
    :cond_16
    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbCenterX:F

    .line 409
    .line 410
    iget v3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mRight:F

    .line 411
    .line 412
    cmpl-float v0, v0, v3

    .line 413
    .line 414
    if-lez v0, :cond_17

    .line 415
    .line 416
    iput v3, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbCenterX:F

    .line 417
    .line 418
    .line 419
    :cond_17
    :goto_5
    invoke-direct {p0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->calculateProgress()F

    .line 420
    move-result v0

    .line 421
    .line 422
    iput v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mProgress:F

    .line 423
    .line 424
    iget-boolean v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isHideBubble:Z

    .line 425
    .line 426
    if-nez v0, :cond_18

    .line 427
    .line 428
    .line 429
    invoke-direct {p0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->calculateCenterRawXofBubbleView()F

    .line 430
    move-result v0

    .line 431
    .line 432
    iput v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mBubbleCenterRawX:F

    .line 433
    .line 434
    .line 435
    invoke-direct {p0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->showBubble()V

    .line 436
    .line 437
    .line 438
    :cond_18
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 439
    .line 440
    :cond_19
    :goto_6
    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbCenterX:F

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
    iput v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->dx:F

    .line 448
    .line 449
    :cond_1a
    :goto_7
    iget-boolean v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isThumbOnDragging:Z

    .line 450
    .line 451
    if-nez v0, :cond_1c

    .line 452
    .line 453
    iget-boolean v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isTouchToSeek:Z

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
.end method

.method public onVisibilityChanged(Landroid/view/View;I)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isHideBubble:Z

    .line 3
    .line 4
    if-nez v0, :cond_3

    .line 5
    .line 6
    iget-boolean v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isAlwaysShowBubble:Z

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
    invoke-direct {p0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->hideBubble()V

    .line 15
    goto :goto_0

    .line 16
    .line 17
    :cond_1
    iget-boolean v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->triggerBubbleShowing:Z

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    .line 22
    invoke-direct {p0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->showBubble()V

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

.method public setBubbleColor(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mBubbleColor:I

    .line 3
    .line 4
    if-eq v0, p1, :cond_0

    .line 5
    .line 6
    iput p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mBubbleColor:I

    .line 7
    .line 8
    iget-object p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mBubbleView:Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$BubbleView;

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
.end method

.method public setCanSeek(Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mCanSeek:Ljava/lang/Boolean;

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
.end method

.method public setCustomSectionTextArray(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$i;)V
    .locals 3
    .param p1    # Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$i;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionCount:I

    .line 3
    .line 4
    iget-object v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionTextArray:Landroid/util/SparseArray;

    .line 5
    .line 6
    .line 7
    invoke-interface {p1, v0, v1}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$i;->a(ILandroid/util/SparseArray;)Landroid/util/SparseArray;

    .line 8
    move-result-object p1

    .line 9
    .line 10
    iput-object p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionTextArray:Landroid/util/SparseArray;

    .line 11
    const/4 p1, 0x0

    .line 12
    move v0, p1

    .line 13
    .line 14
    :goto_0
    iget v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionCount:I

    .line 15
    .line 16
    if-gt v0, v1, :cond_1

    .line 17
    .line 18
    iget-object v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionTextArray:Landroid/util/SparseArray;

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
    iget-object v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSectionTextArray:Landroid/util/SparseArray;

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
    iput-boolean p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isShowThumbText:Z

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
.end method

.method public setCustomStartHandle(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/a;)V
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
.end method

.method public setDefaultProgress(F)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mDefaultProgress:F

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

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
.end method

.method public setOnProgressChangedListener(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$k;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mProgressListener:Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$k;

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
.end method

.method public setProgress(F)V
    .locals 3

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mProgress:F

    .line 3
    .line 4
    iget-object p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mProgressListener:Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$k;

    .line 5
    const/4 v0, 0x0

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->getProgress()I

    .line 11
    move-result v1

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->getProgressFloat()F

    .line 15
    move-result v2

    .line 16
    .line 17
    .line 18
    invoke-interface {p1, p0, v1, v2, v0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$k;->c(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;IFZ)V

    .line 19
    .line 20
    iget-object p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mProgressListener:Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$k;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->getProgress()I

    .line 24
    move-result v1

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->getProgressFloat()F

    .line 28
    move-result v2

    .line 29
    .line 30
    .line 31
    invoke-interface {p1, p0, v1, v2, v0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$k;->a(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;IFZ)V

    .line 32
    .line 33
    :cond_0
    iget-boolean p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isHideBubble:Z

    .line 34
    .line 35
    if-nez p1, :cond_1

    .line 36
    .line 37
    .line 38
    invoke-direct {p0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->calculateCenterRawXofBubbleView()F

    .line 39
    move-result p1

    .line 40
    .line 41
    iput p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mBubbleCenterRawX:F

    .line 42
    .line 43
    :cond_1
    iget-boolean p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isAlwaysShowBubble:Z

    .line 44
    .line 45
    if-eqz p1, :cond_2

    .line 46
    .line 47
    .line 48
    invoke-direct {p0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->hideBubble()V

    .line 49
    .line 50
    new-instance p1, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$h;

    .line 51
    .line 52
    .line 53
    invoke-direct {p1, p0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$h;-><init>(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;)V

    .line 54
    .line 55
    iget-wide v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mAlwaysShowBubbleDelay:J

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, p1, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 59
    .line 60
    :cond_2
    iget-boolean p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->isSeekBySection:Z

    .line 61
    .line 62
    if-eqz p1, :cond_3

    .line 63
    .line 64
    iput-boolean v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->triggerSeekBySection:Z

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
.end method

.method public setProgressFormatCallback(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$j;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mFormatCallback:Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$j;

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
.end method

.method public setSecondTrackColor(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSecondTrackColor:I

    .line 3
    .line 4
    if-eq v0, p1, :cond_0

    .line 5
    .line 6
    iput p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mSecondTrackColor:I

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
.end method

.method public setShowCenterPoint(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->showCenterPoint:Z

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

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
.end method

.method public setThumbColor(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbColor:I

    .line 3
    .line 4
    if-eq v0, p1, :cond_0

    .line 5
    .line 6
    iput p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mThumbColor:I

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
.end method

.method public setTrackColor(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mTrackColor:I

    .line 3
    .line 4
    if-eq v0, p1, :cond_0

    .line 5
    .line 6
    iput p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->mTrackColor:I

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
.end method
