.class public Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;
.super Landroid/widget/RelativeLayout;
.source "BGABanner.java"

# interfaces
.implements Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGAViewPager$a;
.implements Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner$b;,
        Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner$d;,
        Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner$e;,
        Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner$c;,
        Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner$f;
    }
.end annotation


# static fields
.field private static final LWC:I = -0x2

.field private static final NO_PLACEHOLDER_DRAWABLE:I = -0x1

.field private static final RMP:I = -0x1

.field private static final RWC:I = -0x2

.field private static final VEL_THRESHOLD:I = 0x190

.field private static final sScaleTypeArray:[Landroid/widget/ImageView$ScaleType;


# instance fields
.field private isUseHackyViews:Z

.field private mAdapter:Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner$b;

.field private mAllowUserScrollable:Z

.field private mAspectRatio:F

.field private mAutoPlayAble:Z

.field private mAutoPlayInterval:I

.field private mAutoPlayTask:Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner$c;

.field private mContentBottomMargin:I

.field private mDelegate:Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner$d;

.field private mEnterView:Landroid/view/View;

.field private mGuideDelegate:Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner$e;

.field private mGuideOnNoDoubleClickListener:Lcom/kubi/resources/widget/bingoogolapple/bgabanner/d;

.field private mHackyViews:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private mIsFirstInvisible:Z

.field private mIsNeedShowIndicatorOnOnlyOnePage:Z

.field private mIsNumberIndicator:Z

.field private mModels:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private mNumberIndicatorBackground:Landroid/graphics/drawable/Drawable;

.field private mNumberIndicatorTextColor:I

.field private mNumberIndicatorTextSize:I

.field protected mNumberIndicatorTv:Landroid/widget/TextView;

.field private mOnPageChangeListener:Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;

.field private mOverScrollMode:I

.field private mPageChangeDuration:I

.field private mPageScrollPosition:I

.field private mPageScrollPositionOffset:F

.field private mPlaceholderDrawableResId:I

.field private mPlaceholderIv:Landroid/widget/ImageView;

.field private mPlaceholderIvLeftRightMargin:I

.field private mPointContainerBackgroundDrawable:Landroid/graphics/drawable/Drawable;

.field private mPointContainerLeftRightPadding:I

.field protected mPointContainerRl:Landroid/widget/RelativeLayout;

.field private mPointDrawableResId:I

.field private mPointGravity:I

.field private mPointLeftRightMargin:I

.field private mPointRealContainerBackgroundDrawable:Landroid/graphics/drawable/Drawable;

.field private mPointRealContainerLl:Landroid/widget/LinearLayout;

.field private mPointRealContainerPadding:I

.field private mPointTopBottomMargin:I

.field private mScaleType:Landroid/widget/ImageView$ScaleType;

.field private mSkipView:Landroid/view/View;

.field private mTipTextColor:I

.field private mTipTextSize:I

.field private mTipTv:Landroid/widget/TextView;

.field private mTips:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private mTransitionEffect:Lcom/kubi/resources/widget/bingoogolapple/bgabanner/transformer/TransitionEffect;

.field private mViewPager:Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGAViewPager;

.field private mViews:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private stopAutoPlay:Z


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    .line 2
    sget-object v0, Landroid/widget/ImageView$ScaleType;->MATRIX:Landroid/widget/ImageView$ScaleType;

    .line 3
    .line 4
    sget-object v1, Landroid/widget/ImageView$ScaleType;->FIT_XY:Landroid/widget/ImageView$ScaleType;

    .line 5
    .line 6
    sget-object v2, Landroid/widget/ImageView$ScaleType;->FIT_START:Landroid/widget/ImageView$ScaleType;

    .line 7
    .line 8
    sget-object v3, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    .line 9
    .line 10
    sget-object v4, Landroid/widget/ImageView$ScaleType;->FIT_END:Landroid/widget/ImageView$ScaleType;

    .line 11
    .line 12
    sget-object v5, Landroid/widget/ImageView$ScaleType;->CENTER:Landroid/widget/ImageView$ScaleType;

    .line 13
    .line 14
    sget-object v6, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 15
    .line 16
    sget-object v7, Landroid/widget/ImageView$ScaleType;->CENTER_INSIDE:Landroid/widget/ImageView$ScaleType;

    .line 17
    .line 18
    .line 19
    filled-new-array/range {v0 .. v7}, [Landroid/widget/ImageView$ScaleType;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    sput-object v0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->sScaleTypeArray:[Landroid/widget/ImageView$ScaleType;

    .line 23
    return-void
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

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, v0}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 2
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p3, 0x1

    .line 3
    iput-boolean p3, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->isUseHackyViews:Z

    .line 4
    iput-boolean p3, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mAutoPlayAble:Z

    const/16 v0, 0xbb8

    .line 5
    iput v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mAutoPlayInterval:I

    const/16 v0, 0x320

    .line 6
    iput v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPageChangeDuration:I

    const/16 v0, 0x51

    .line 7
    iput v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPointGravity:I

    const/4 v0, -0x1

    .line 8
    iput v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mTipTextColor:I

    .line 9
    sget v1, Lcom/kubi/sdk/res/R$drawable;->bga_banner_selector_point_solid:I

    iput v1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPointDrawableResId:I

    .line 10
    sget-object v1, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    iput-object v1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mScaleType:Landroid/widget/ImageView$ScaleType;

    .line 11
    iput v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPlaceholderDrawableResId:I

    const/4 v1, 0x2

    .line 12
    iput v1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mOverScrollMode:I

    const/4 v1, 0x0

    .line 13
    iput-boolean v1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mIsNumberIndicator:Z

    .line 14
    iput v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mNumberIndicatorTextColor:I

    .line 15
    iput-boolean p3, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mAllowUserScrollable:Z

    .line 16
    iput-boolean p3, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mIsFirstInvisible:Z

    .line 17
    iput-boolean v1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->stopAutoPlay:Z

    .line 18
    new-instance p3, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner$a;

    invoke-direct {p3, p0}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner$a;-><init>(Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;)V

    iput-object p3, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mGuideOnNoDoubleClickListener:Lcom/kubi/resources/widget/bingoogolapple/bgabanner/d;

    .line 19
    invoke-direct {p0, p1}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->initDefaultAttrs(Landroid/content/Context;)V

    .line 20
    invoke-direct {p0, p1, p2}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->initCustomAttrs(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 21
    invoke-direct {p0, p1}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->initView(Landroid/content/Context;)V

    return-void
.end method

.method public static synthetic access$000(Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;)Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner$e;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    const/4 p0, 0x0

    .line 5
    return-object p0
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

.method public static synthetic access$1000(Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;)Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner$b;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mAdapter:Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner$b;

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

.method public static synthetic access$1100(Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->switchToNextPage()V

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

.method public static synthetic access$300(Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;)Ljava/util/List;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViews:Ljava/util/List;

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

.method public static synthetic access$400(Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;)Z
    .locals 0

    .line 1
    .line 2
    iget-boolean p0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mAutoPlayAble:Z

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

.method public static synthetic access$500(Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;)Z
    .locals 0

    .line 1
    .line 2
    iget-boolean p0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->isUseHackyViews:Z

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

.method public static synthetic access$600(Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;)Ljava/util/List;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mHackyViews:Ljava/util/List;

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

.method public static synthetic access$700(Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;)Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner$d;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    const/4 p0, 0x0

    .line 5
    return-object p0
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

.method public static synthetic access$800(Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;)Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGAViewPager;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViewPager:Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGAViewPager;

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

.method public static synthetic access$900(Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;)Ljava/util/List;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mModels:Ljava/util/List;

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

.method private handleGuideViewVisibility(IF)V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mEnterView:Landroid/view/View;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mSkipView:Landroid/view/View;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto/16 :goto_0

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->getItemCount()I

    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x2

    .line 16
    .line 17
    const/16 v2, 0x8

    .line 18
    const/4 v3, 0x0

    .line 19
    .line 20
    if-ge v0, v1, :cond_2

    .line 21
    .line 22
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mEnterView:Landroid/view/View;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 28
    .line 29
    iget-object p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mSkipView:Landroid/view/View;

    .line 30
    .line 31
    if-eqz p1, :cond_10

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 35
    return-void

    .line 36
    .line 37
    :cond_1
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mSkipView:Landroid/view/View;

    .line 38
    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 43
    return-void

    .line 44
    .line 45
    .line 46
    :cond_2
    invoke-virtual {p0}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->getItemCount()I

    .line 47
    move-result v0

    .line 48
    sub-int/2addr v0, v1

    .line 49
    .line 50
    const/high16 v1, 0x3f000000    # 0.5f

    .line 51
    .line 52
    const/high16 v4, 0x3f800000    # 1.0f

    .line 53
    .line 54
    if-ne p1, v0, :cond_8

    .line 55
    .line 56
    iget-object p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mEnterView:Landroid/view/View;

    .line 57
    .line 58
    if-eqz p1, :cond_3

    .line 59
    .line 60
    .line 61
    invoke-static {p1, p2}, Landroidx/core/view/ViewCompat;->setAlpha(Landroid/view/View;F)V

    .line 62
    .line 63
    :cond_3
    iget-object p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mSkipView:Landroid/view/View;

    .line 64
    .line 65
    if-eqz p1, :cond_4

    .line 66
    sub-float/2addr v4, p2

    .line 67
    .line 68
    .line 69
    invoke-static {p1, v4}, Landroidx/core/view/ViewCompat;->setAlpha(Landroid/view/View;F)V

    .line 70
    .line 71
    :cond_4
    cmpl-float p1, p2, v1

    .line 72
    .line 73
    if-lez p1, :cond_6

    .line 74
    .line 75
    iget-object p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mEnterView:Landroid/view/View;

    .line 76
    .line 77
    if-eqz p1, :cond_5

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 81
    .line 82
    :cond_5
    iget-object p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mSkipView:Landroid/view/View;

    .line 83
    .line 84
    if-eqz p1, :cond_10

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 88
    return-void

    .line 89
    .line 90
    :cond_6
    iget-object p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mEnterView:Landroid/view/View;

    .line 91
    .line 92
    if-eqz p1, :cond_7

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 96
    .line 97
    :cond_7
    iget-object p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mSkipView:Landroid/view/View;

    .line 98
    .line 99
    if-eqz p1, :cond_10

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 103
    return-void

    .line 104
    .line 105
    .line 106
    :cond_8
    invoke-virtual {p0}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->getItemCount()I

    .line 107
    move-result v0

    .line 108
    .line 109
    add-int/lit8 v0, v0, -0x1

    .line 110
    .line 111
    if-ne p1, v0, :cond_e

    .line 112
    .line 113
    iget-object p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mEnterView:Landroid/view/View;

    .line 114
    .line 115
    if-eqz p1, :cond_9

    .line 116
    sub-float/2addr v4, p2

    .line 117
    .line 118
    .line 119
    invoke-static {p1, v4}, Landroidx/core/view/ViewCompat;->setAlpha(Landroid/view/View;F)V

    .line 120
    .line 121
    :cond_9
    iget-object p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mSkipView:Landroid/view/View;

    .line 122
    .line 123
    if-eqz p1, :cond_a

    .line 124
    .line 125
    .line 126
    invoke-static {p1, p2}, Landroidx/core/view/ViewCompat;->setAlpha(Landroid/view/View;F)V

    .line 127
    .line 128
    :cond_a
    cmpg-float p1, p2, v1

    .line 129
    .line 130
    if-gez p1, :cond_c

    .line 131
    .line 132
    iget-object p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mEnterView:Landroid/view/View;

    .line 133
    .line 134
    if-eqz p1, :cond_b

    .line 135
    .line 136
    .line 137
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 138
    .line 139
    :cond_b
    iget-object p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mSkipView:Landroid/view/View;

    .line 140
    .line 141
    if-eqz p1, :cond_10

    .line 142
    .line 143
    .line 144
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 145
    return-void

    .line 146
    .line 147
    :cond_c
    iget-object p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mEnterView:Landroid/view/View;

    .line 148
    .line 149
    if-eqz p1, :cond_d

    .line 150
    .line 151
    .line 152
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 153
    .line 154
    :cond_d
    iget-object p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mSkipView:Landroid/view/View;

    .line 155
    .line 156
    if-eqz p1, :cond_10

    .line 157
    .line 158
    .line 159
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 160
    return-void

    .line 161
    .line 162
    :cond_e
    iget-object p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mSkipView:Landroid/view/View;

    .line 163
    .line 164
    if-eqz p1, :cond_f

    .line 165
    .line 166
    .line 167
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 168
    .line 169
    iget-object p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mSkipView:Landroid/view/View;

    .line 170
    .line 171
    .line 172
    invoke-static {p1, v4}, Landroidx/core/view/ViewCompat;->setAlpha(Landroid/view/View;F)V

    .line 173
    .line 174
    :cond_f
    iget-object p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mEnterView:Landroid/view/View;

    .line 175
    .line 176
    if-eqz p1, :cond_10

    .line 177
    .line 178
    .line 179
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 180
    :cond_10
    :goto_0
    return-void
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
.end method

.method private inflateItemView(I)Landroid/view/View;
    .locals 2
    .param p1    # I
        .annotation build Landroidx/annotation/LayoutRes;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    .line 8
    invoke-static {v0, p1, v1}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    instance-of v0, p1, Landroid/widget/ImageView;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    move-object v0, p1

    .line 15
    .line 16
    check-cast v0, Landroid/widget/ImageView;

    .line 17
    .line 18
    iget-object v1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mScaleType:Landroid/widget/ImageView$ScaleType;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 22
    :cond_0
    return-object p1
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

.method private initCustomAttr(ILandroid/content/res/TypedArray;)V
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/kubi/sdk/res/R$styleable;->BGABanner_banner_pointDrawable:I

    .line 3
    .line 4
    if-ne p1, v0, :cond_0

    .line 5
    .line 6
    sget v0, Lcom/kubi/sdk/res/R$drawable;->bga_banner_selector_point_solid:I

    .line 7
    .line 8
    .line 9
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 10
    move-result p1

    .line 11
    .line 12
    iput p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPointDrawableResId:I

    .line 13
    return-void

    .line 14
    .line 15
    :cond_0
    sget v0, Lcom/kubi/sdk/res/R$styleable;->BGABanner_banner_pointContainerBackground:I

    .line 16
    .line 17
    if-ne p1, v0, :cond_1

    .line 18
    .line 19
    .line 20
    invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 21
    move-result-object p1

    .line 22
    .line 23
    iput-object p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPointContainerBackgroundDrawable:Landroid/graphics/drawable/Drawable;

    .line 24
    return-void

    .line 25
    .line 26
    :cond_1
    sget v0, Lcom/kubi/sdk/res/R$styleable;->BGABanner_banner_pointRealContainerBackground:I

    .line 27
    .line 28
    if-ne p1, v0, :cond_2

    .line 29
    .line 30
    .line 31
    invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 32
    move-result-object p1

    .line 33
    .line 34
    iput-object p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPointRealContainerBackgroundDrawable:Landroid/graphics/drawable/Drawable;

    .line 35
    return-void

    .line 36
    .line 37
    :cond_2
    sget v0, Lcom/kubi/sdk/res/R$styleable;->BGABanner_banner_pointRealContainerPadding:I

    .line 38
    .line 39
    if-ne p1, v0, :cond_3

    .line 40
    .line 41
    iget v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPointRealContainerPadding:I

    .line 42
    .line 43
    .line 44
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 45
    move-result p1

    .line 46
    .line 47
    iput p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPointRealContainerPadding:I

    .line 48
    return-void

    .line 49
    .line 50
    :cond_3
    sget v0, Lcom/kubi/sdk/res/R$styleable;->BGABanner_banner_pointLeftRightMargin:I

    .line 51
    .line 52
    if-ne p1, v0, :cond_4

    .line 53
    .line 54
    iget v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPointLeftRightMargin:I

    .line 55
    .line 56
    .line 57
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 58
    move-result p1

    .line 59
    .line 60
    iput p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPointLeftRightMargin:I

    .line 61
    return-void

    .line 62
    .line 63
    :cond_4
    sget v0, Lcom/kubi/sdk/res/R$styleable;->BGABanner_banner_pointContainerLeftRightPadding:I

    .line 64
    .line 65
    if-ne p1, v0, :cond_5

    .line 66
    .line 67
    iget v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPointContainerLeftRightPadding:I

    .line 68
    .line 69
    .line 70
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 71
    move-result p1

    .line 72
    .line 73
    iput p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPointContainerLeftRightPadding:I

    .line 74
    return-void

    .line 75
    .line 76
    :cond_5
    sget v0, Lcom/kubi/sdk/res/R$styleable;->BGABanner_banner_pointTopBottomMargin:I

    .line 77
    .line 78
    if-ne p1, v0, :cond_6

    .line 79
    .line 80
    iget v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPointTopBottomMargin:I

    .line 81
    .line 82
    .line 83
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 84
    move-result p1

    .line 85
    .line 86
    iput p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPointTopBottomMargin:I

    .line 87
    return-void

    .line 88
    .line 89
    :cond_6
    sget v0, Lcom/kubi/sdk/res/R$styleable;->BGABanner_banner_indicatorGravity:I

    .line 90
    .line 91
    if-ne p1, v0, :cond_7

    .line 92
    .line 93
    iget v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPointGravity:I

    .line 94
    .line 95
    .line 96
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 97
    move-result p1

    .line 98
    .line 99
    iput p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPointGravity:I

    .line 100
    return-void

    .line 101
    .line 102
    :cond_7
    sget v0, Lcom/kubi/sdk/res/R$styleable;->BGABanner_banner_pointAutoPlayAble:I

    .line 103
    .line 104
    if-ne p1, v0, :cond_8

    .line 105
    .line 106
    iget-boolean v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mAutoPlayAble:Z

    .line 107
    .line 108
    .line 109
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 110
    move-result p1

    .line 111
    .line 112
    iput-boolean p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mAutoPlayAble:Z

    .line 113
    return-void

    .line 114
    .line 115
    :cond_8
    sget v0, Lcom/kubi/sdk/res/R$styleable;->BGABanner_banner_pointAutoPlayInterval:I

    .line 116
    .line 117
    if-ne p1, v0, :cond_9

    .line 118
    .line 119
    iget v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mAutoPlayInterval:I

    .line 120
    .line 121
    .line 122
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 123
    move-result p1

    .line 124
    .line 125
    iput p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mAutoPlayInterval:I

    .line 126
    return-void

    .line 127
    .line 128
    :cond_9
    sget v0, Lcom/kubi/sdk/res/R$styleable;->BGABanner_banner_pageChangeDuration:I

    .line 129
    .line 130
    if-ne p1, v0, :cond_a

    .line 131
    .line 132
    iget v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPageChangeDuration:I

    .line 133
    .line 134
    .line 135
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 136
    move-result p1

    .line 137
    .line 138
    iput p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPageChangeDuration:I

    .line 139
    return-void

    .line 140
    .line 141
    :cond_a
    sget v0, Lcom/kubi/sdk/res/R$styleable;->BGABanner_banner_transitionEffect:I

    .line 142
    .line 143
    if-ne p1, v0, :cond_b

    .line 144
    .line 145
    sget-object v0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/transformer/TransitionEffect;->Accordion:Lcom/kubi/resources/widget/bingoogolapple/bgabanner/transformer/TransitionEffect;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 149
    move-result v0

    .line 150
    .line 151
    .line 152
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 153
    move-result p1

    .line 154
    .line 155
    .line 156
    invoke-static {}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/transformer/TransitionEffect;->values()[Lcom/kubi/resources/widget/bingoogolapple/bgabanner/transformer/TransitionEffect;

    .line 157
    move-result-object p2

    .line 158
    .line 159
    aget-object p1, p2, p1

    .line 160
    .line 161
    iput-object p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mTransitionEffect:Lcom/kubi/resources/widget/bingoogolapple/bgabanner/transformer/TransitionEffect;

    .line 162
    return-void

    .line 163
    .line 164
    :cond_b
    sget v0, Lcom/kubi/sdk/res/R$styleable;->BGABanner_banner_tipTextColor:I

    .line 165
    .line 166
    if-ne p1, v0, :cond_c

    .line 167
    .line 168
    iget v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mTipTextColor:I

    .line 169
    .line 170
    .line 171
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 172
    move-result p1

    .line 173
    .line 174
    iput p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mTipTextColor:I

    .line 175
    return-void

    .line 176
    .line 177
    :cond_c
    sget v0, Lcom/kubi/sdk/res/R$styleable;->BGABanner_banner_tipTextSize:I

    .line 178
    .line 179
    if-ne p1, v0, :cond_d

    .line 180
    .line 181
    iget v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mTipTextSize:I

    .line 182
    .line 183
    .line 184
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 185
    move-result p1

    .line 186
    .line 187
    iput p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mTipTextSize:I

    .line 188
    return-void

    .line 189
    .line 190
    :cond_d
    sget v0, Lcom/kubi/sdk/res/R$styleable;->BGABanner_banner_placeholderDrawable:I

    .line 191
    .line 192
    if-ne p1, v0, :cond_e

    .line 193
    .line 194
    iget v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPlaceholderDrawableResId:I

    .line 195
    .line 196
    .line 197
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 198
    move-result p1

    .line 199
    .line 200
    iput p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPlaceholderDrawableResId:I

    .line 201
    return-void

    .line 202
    .line 203
    :cond_e
    sget v0, Lcom/kubi/sdk/res/R$styleable;->BGABanner_banner_isNumberIndicator:I

    .line 204
    .line 205
    if-ne p1, v0, :cond_f

    .line 206
    .line 207
    iget-boolean v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mIsNumberIndicator:Z

    .line 208
    .line 209
    .line 210
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 211
    move-result p1

    .line 212
    .line 213
    iput-boolean p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mIsNumberIndicator:Z

    .line 214
    return-void

    .line 215
    .line 216
    :cond_f
    sget v0, Lcom/kubi/sdk/res/R$styleable;->BGABanner_banner_numberIndicatorTextColor:I

    .line 217
    .line 218
    if-ne p1, v0, :cond_10

    .line 219
    .line 220
    iget v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mNumberIndicatorTextColor:I

    .line 221
    .line 222
    .line 223
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 224
    move-result p1

    .line 225
    .line 226
    iput p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mNumberIndicatorTextColor:I

    .line 227
    return-void

    .line 228
    .line 229
    :cond_10
    sget v0, Lcom/kubi/sdk/res/R$styleable;->BGABanner_banner_numberIndicatorTextSize:I

    .line 230
    .line 231
    if-ne p1, v0, :cond_11

    .line 232
    .line 233
    iget v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mNumberIndicatorTextSize:I

    .line 234
    .line 235
    .line 236
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 237
    move-result p1

    .line 238
    .line 239
    iput p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mNumberIndicatorTextSize:I

    .line 240
    return-void

    .line 241
    .line 242
    :cond_11
    sget v0, Lcom/kubi/sdk/res/R$styleable;->BGABanner_banner_numberIndicatorBackground:I

    .line 243
    .line 244
    if-ne p1, v0, :cond_12

    .line 245
    .line 246
    .line 247
    invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 248
    move-result-object p1

    .line 249
    .line 250
    iput-object p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mNumberIndicatorBackground:Landroid/graphics/drawable/Drawable;

    .line 251
    return-void

    .line 252
    .line 253
    :cond_12
    sget v0, Lcom/kubi/sdk/res/R$styleable;->BGABanner_banner_isNeedShowIndicatorOnOnlyOnePage:I

    .line 254
    .line 255
    if-ne p1, v0, :cond_13

    .line 256
    .line 257
    iget-boolean v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mIsNeedShowIndicatorOnOnlyOnePage:Z

    .line 258
    .line 259
    .line 260
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 261
    move-result p1

    .line 262
    .line 263
    iput-boolean p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mIsNeedShowIndicatorOnOnlyOnePage:Z

    .line 264
    return-void

    .line 265
    .line 266
    :cond_13
    sget v0, Lcom/kubi/sdk/res/R$styleable;->BGABanner_banner_placeholder_left_right_margin:I

    .line 267
    .line 268
    if-ne p1, v0, :cond_14

    .line 269
    .line 270
    iget v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPlaceholderIvLeftRightMargin:I

    .line 271
    .line 272
    .line 273
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 274
    move-result p1

    .line 275
    .line 276
    iput p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPlaceholderIvLeftRightMargin:I

    .line 277
    return-void

    .line 278
    .line 279
    :cond_14
    sget v0, Lcom/kubi/sdk/res/R$styleable;->BGABanner_banner_contentBottomMargin:I

    .line 280
    .line 281
    if-ne p1, v0, :cond_15

    .line 282
    .line 283
    iget v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mContentBottomMargin:I

    .line 284
    .line 285
    .line 286
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 287
    move-result p1

    .line 288
    .line 289
    iput p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mContentBottomMargin:I

    .line 290
    return-void

    .line 291
    .line 292
    :cond_15
    sget v0, Lcom/kubi/sdk/res/R$styleable;->BGABanner_banner_aspectRatio:I

    .line 293
    .line 294
    if-ne p1, v0, :cond_16

    .line 295
    .line 296
    iget v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mAspectRatio:F

    .line 297
    .line 298
    .line 299
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 300
    move-result p1

    .line 301
    .line 302
    iput p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mAspectRatio:F

    .line 303
    return-void

    .line 304
    .line 305
    :cond_16
    sget v0, Lcom/kubi/sdk/res/R$styleable;->BGABanner_android_scaleType:I

    .line 306
    .line 307
    if-ne p1, v0, :cond_17

    .line 308
    const/4 v0, -0x1

    .line 309
    .line 310
    .line 311
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 312
    move-result p1

    .line 313
    .line 314
    if-ltz p1, :cond_17

    .line 315
    .line 316
    sget-object p2, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->sScaleTypeArray:[Landroid/widget/ImageView$ScaleType;

    .line 317
    array-length v0, p2

    .line 318
    .line 319
    if-ge p1, v0, :cond_17

    .line 320
    .line 321
    aget-object p1, p2, p1

    .line 322
    .line 323
    iput-object p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mScaleType:Landroid/widget/ImageView$ScaleType;

    .line 324
    :cond_17
    return-void
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
.end method

.method private initCustomAttrs(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/sdk/res/R$styleable;->BGABanner:[I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    .line 10
    move-result p2

    .line 11
    const/4 v0, 0x0

    .line 12
    .line 13
    :goto_0
    if-ge v0, p2, :cond_0

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getIndex(I)I

    .line 17
    move-result v1

    .line 18
    .line 19
    .line 20
    invoke-direct {p0, v1, p1}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->initCustomAttr(ILandroid/content/res/TypedArray;)V

    .line 21
    .line 22
    add-int/lit8 v0, v0, 0x1

    .line 23
    goto :goto_0

    .line 24
    .line 25
    .line 26
    :cond_0
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 27
    return-void
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

.method private initDefaultAttrs(Landroid/content/Context;)V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner$c;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, p0, v1}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner$c;-><init>(Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner$a;)V

    .line 7
    .line 8
    iput-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mAutoPlayTask:Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner$c;

    .line 9
    .line 10
    const/high16 v0, 0x40400000    # 3.0f

    .line 11
    .line 12
    .line 13
    invoke-static {p1, v0}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/b;->b(Landroid/content/Context;F)I

    .line 14
    move-result v0

    .line 15
    .line 16
    iput v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPointLeftRightMargin:I

    .line 17
    .line 18
    const/high16 v0, 0x40c00000    # 6.0f

    .line 19
    .line 20
    .line 21
    invoke-static {p1, v0}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/b;->b(Landroid/content/Context;F)I

    .line 22
    move-result v0

    .line 23
    .line 24
    iput v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPointTopBottomMargin:I

    .line 25
    .line 26
    const/high16 v0, 0x41200000    # 10.0f

    .line 27
    .line 28
    .line 29
    invoke-static {p1, v0}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/b;->b(Landroid/content/Context;F)I

    .line 30
    move-result v1

    .line 31
    .line 32
    iput v1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPointContainerLeftRightPadding:I

    .line 33
    .line 34
    const/high16 v1, 0x3f800000    # 1.0f

    .line 35
    .line 36
    .line 37
    invoke-static {p1, v1}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/b;->b(Landroid/content/Context;F)I

    .line 38
    move-result v1

    .line 39
    .line 40
    iput v1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPointRealContainerPadding:I

    .line 41
    .line 42
    .line 43
    invoke-static {p1, v0}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/b;->k(Landroid/content/Context;F)I

    .line 44
    move-result v1

    .line 45
    .line 46
    iput v1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mTipTextSize:I

    .line 47
    .line 48
    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    .line 49
    .line 50
    const-string v2, "#44aaaaaa"

    .line 51
    .line 52
    .line 53
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 54
    move-result v2

    .line 55
    .line 56
    .line 57
    invoke-direct {v1, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 58
    .line 59
    iput-object v1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPointContainerBackgroundDrawable:Landroid/graphics/drawable/Drawable;

    .line 60
    .line 61
    sget-object v1, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/transformer/TransitionEffect;->Default:Lcom/kubi/resources/widget/bingoogolapple/bgabanner/transformer/TransitionEffect;

    .line 62
    .line 63
    iput-object v1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mTransitionEffect:Lcom/kubi/resources/widget/bingoogolapple/bgabanner/transformer/TransitionEffect;

    .line 64
    .line 65
    .line 66
    invoke-static {p1, v0}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/b;->k(Landroid/content/Context;F)I

    .line 67
    move-result p1

    .line 68
    .line 69
    iput p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mNumberIndicatorTextSize:I

    .line 70
    const/4 p1, 0x0

    .line 71
    .line 72
    iput p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mContentBottomMargin:I

    .line 73
    const/4 p1, 0x0

    .line 74
    .line 75
    iput p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mAspectRatio:F

    .line 76
    return-void
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

.method private initIndicator()V
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPointRealContainerLl:Landroid/widget/LinearLayout;

    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 10
    .line 11
    iget-boolean v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mIsNeedShowIndicatorOnOnlyOnePage:Z

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViews:Ljava/util/List;

    .line 18
    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 21
    move-result v0

    .line 22
    .line 23
    if-le v0, v1, :cond_1

    .line 24
    .line 25
    :cond_0
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 26
    const/4 v3, -0x2

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, v3, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 30
    .line 31
    iget v3, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPointLeftRightMargin:I

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v3, v2, v3, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 35
    move v3, v2

    .line 36
    .line 37
    :goto_0
    iget-object v4, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViews:Ljava/util/List;

    .line 38
    .line 39
    .line 40
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 41
    move-result v4

    .line 42
    .line 43
    if-ge v3, v4, :cond_1

    .line 44
    .line 45
    new-instance v4, Landroid/widget/ImageView;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 49
    move-result-object v5

    .line 50
    .line 51
    .line 52
    invoke-direct {v4, v5}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v4, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 56
    .line 57
    iget v5, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPointDrawableResId:I

    .line 58
    .line 59
    .line 60
    invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 61
    .line 62
    iget-object v5, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPointRealContainerLl:Landroid/widget/LinearLayout;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v5, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 66
    .line 67
    add-int/lit8 v3, v3, 0x1

    .line 68
    goto :goto_0

    .line 69
    .line 70
    :cond_1
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mNumberIndicatorTv:Landroid/widget/TextView;

    .line 71
    .line 72
    if-eqz v0, :cond_4

    .line 73
    .line 74
    iget-boolean v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mIsNeedShowIndicatorOnOnlyOnePage:Z

    .line 75
    .line 76
    if-nez v0, :cond_3

    .line 77
    .line 78
    if-nez v0, :cond_2

    .line 79
    .line 80
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViews:Ljava/util/List;

    .line 81
    .line 82
    .line 83
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 84
    move-result v0

    .line 85
    .line 86
    if-le v0, v1, :cond_2

    .line 87
    goto :goto_1

    .line 88
    .line 89
    :cond_2
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mNumberIndicatorTv:Landroid/widget/TextView;

    .line 90
    const/4 v1, 0x4

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 94
    return-void

    .line 95
    .line 96
    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mNumberIndicatorTv:Landroid/widget/TextView;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 100
    :cond_4
    return-void
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

.method private initView(Landroid/content/Context;)V
    .locals 9

    .line 1
    .line 2
    new-instance v0, Landroid/widget/RelativeLayout;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    iput-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPointContainerRl:Landroid/widget/RelativeLayout;

    .line 8
    .line 9
    iget-object v1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPointContainerBackgroundDrawable:Landroid/graphics/drawable/Drawable;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 13
    .line 14
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPointContainerRl:Landroid/widget/RelativeLayout;

    .line 15
    .line 16
    iget v1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPointContainerLeftRightPadding:I

    .line 17
    .line 18
    iget v2, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPointTopBottomMargin:I

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1, v2, v1, v2}, Landroid/view/View;->setPadding(IIII)V

    .line 22
    .line 23
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 24
    const/4 v1, -0x1

    .line 25
    const/4 v2, -0x2

    .line 26
    .line 27
    .line 28
    invoke-direct {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 29
    .line 30
    iget v3, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPointGravity:I

    .line 31
    .line 32
    and-int/lit8 v3, v3, 0x70

    .line 33
    .line 34
    const/16 v4, 0x30

    .line 35
    .line 36
    if-ne v3, v4, :cond_0

    .line 37
    .line 38
    const/16 v3, 0xa

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 42
    goto :goto_0

    .line 43
    .line 44
    :cond_0
    const/16 v3, 0xc

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 48
    .line 49
    :goto_0
    iget-object v3, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPointContainerRl:Landroid/widget/RelativeLayout;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, v3, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 53
    .line 54
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 55
    .line 56
    .line 57
    invoke-direct {v0, v2, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 58
    .line 59
    const/16 v3, 0xf

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 63
    .line 64
    iget-boolean v4, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mIsNumberIndicator:Z

    .line 65
    const/4 v5, 0x1

    .line 66
    const/4 v6, 0x0

    .line 67
    .line 68
    const/16 v7, 0x10

    .line 69
    .line 70
    if-eqz v4, :cond_2

    .line 71
    .line 72
    new-instance v4, Landroid/widget/TextView;

    .line 73
    .line 74
    .line 75
    invoke-direct {v4, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 76
    .line 77
    iput-object v4, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mNumberIndicatorTv:Landroid/widget/TextView;

    .line 78
    .line 79
    sget v8, Lcom/kubi/sdk/res/R$id;->banner_indicatorId:I

    .line 80
    .line 81
    .line 82
    invoke-virtual {v4, v8}, Landroid/view/View;->setId(I)V

    .line 83
    .line 84
    iget-object v4, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mNumberIndicatorTv:Landroid/widget/TextView;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v4, v7}, Landroid/widget/TextView;->setGravity(I)V

    .line 88
    .line 89
    iget-object v4, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mNumberIndicatorTv:Landroid/widget/TextView;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 93
    .line 94
    iget-object v4, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mNumberIndicatorTv:Landroid/widget/TextView;

    .line 95
    .line 96
    sget-object v8, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v4, v8}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 100
    .line 101
    iget-object v4, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mNumberIndicatorTv:Landroid/widget/TextView;

    .line 102
    .line 103
    iget v8, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mNumberIndicatorTextColor:I

    .line 104
    .line 105
    .line 106
    invoke-virtual {v4, v8}, Landroid/widget/TextView;->setTextColor(I)V

    .line 107
    .line 108
    iget-object v4, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mNumberIndicatorTv:Landroid/widget/TextView;

    .line 109
    .line 110
    iget v8, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mNumberIndicatorTextSize:I

    .line 111
    int-to-float v8, v8

    .line 112
    .line 113
    .line 114
    invoke-virtual {v4, v6, v8}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 115
    .line 116
    iget-object v4, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mNumberIndicatorTv:Landroid/widget/TextView;

    .line 117
    const/4 v8, 0x4

    .line 118
    .line 119
    .line 120
    invoke-virtual {v4, v8}, Landroid/view/View;->setVisibility(I)V

    .line 121
    .line 122
    iget-object v4, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mNumberIndicatorBackground:Landroid/graphics/drawable/Drawable;

    .line 123
    .line 124
    if-eqz v4, :cond_1

    .line 125
    .line 126
    iget-object v8, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mNumberIndicatorTv:Landroid/widget/TextView;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v8, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 130
    .line 131
    :cond_1
    iget-object v4, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPointContainerRl:Landroid/widget/RelativeLayout;

    .line 132
    .line 133
    iget-object v8, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mNumberIndicatorTv:Landroid/widget/TextView;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v4, v8, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 137
    goto :goto_1

    .line 138
    .line 139
    :cond_2
    new-instance v4, Landroid/widget/LinearLayout;

    .line 140
    .line 141
    .line 142
    invoke-direct {v4, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 143
    .line 144
    iput-object v4, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPointRealContainerLl:Landroid/widget/LinearLayout;

    .line 145
    .line 146
    sget v8, Lcom/kubi/sdk/res/R$id;->banner_indicatorId:I

    .line 147
    .line 148
    .line 149
    invoke-virtual {v4, v8}, Landroid/view/View;->setId(I)V

    .line 150
    .line 151
    iget-object v4, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPointRealContainerLl:Landroid/widget/LinearLayout;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v4, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 155
    .line 156
    iget-object v4, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPointRealContainerLl:Landroid/widget/LinearLayout;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v4, v7}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 160
    .line 161
    iget-object v4, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPointRealContainerBackgroundDrawable:Landroid/graphics/drawable/Drawable;

    .line 162
    .line 163
    if-eqz v4, :cond_3

    .line 164
    .line 165
    iget-object v8, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPointRealContainerLl:Landroid/widget/LinearLayout;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v8, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 169
    .line 170
    iget-object v4, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPointRealContainerLl:Landroid/widget/LinearLayout;

    .line 171
    .line 172
    iget v8, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPointRealContainerPadding:I

    .line 173
    .line 174
    .line 175
    invoke-virtual {v4, v8, v8, v8, v8}, Landroid/view/View;->setPadding(IIII)V

    .line 176
    .line 177
    :cond_3
    iget-object v4, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPointContainerRl:Landroid/widget/RelativeLayout;

    .line 178
    .line 179
    iget-object v8, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPointRealContainerLl:Landroid/widget/LinearLayout;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v4, v8, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 183
    .line 184
    :goto_1
    new-instance v4, Landroid/widget/RelativeLayout$LayoutParams;

    .line 185
    .line 186
    .line 187
    invoke-direct {v4, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v4, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 191
    .line 192
    new-instance v1, Landroid/widget/TextView;

    .line 193
    .line 194
    .line 195
    invoke-direct {v1, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 196
    .line 197
    iput-object v1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mTipTv:Landroid/widget/TextView;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setGravity(I)V

    .line 201
    .line 202
    iget-object p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mTipTv:Landroid/widget/TextView;

    .line 203
    .line 204
    .line 205
    invoke-virtual {p1, v5}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 206
    .line 207
    iget-object p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mTipTv:Landroid/widget/TextView;

    .line 208
    .line 209
    sget-object v1, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 210
    .line 211
    .line 212
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 213
    .line 214
    iget-object p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mTipTv:Landroid/widget/TextView;

    .line 215
    .line 216
    iget v1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mTipTextColor:I

    .line 217
    .line 218
    .line 219
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 220
    .line 221
    iget-object p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mTipTv:Landroid/widget/TextView;

    .line 222
    .line 223
    iget v1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mTipTextSize:I

    .line 224
    int-to-float v1, v1

    .line 225
    .line 226
    .line 227
    invoke-virtual {p1, v6, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 228
    .line 229
    iget-object p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPointContainerRl:Landroid/widget/RelativeLayout;

    .line 230
    .line 231
    iget-object v1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mTipTv:Landroid/widget/TextView;

    .line 232
    .line 233
    .line 234
    invoke-virtual {p1, v1, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 235
    .line 236
    iget p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPointGravity:I

    .line 237
    .line 238
    and-int/lit8 p1, p1, 0x7

    .line 239
    const/4 v1, 0x3

    .line 240
    .line 241
    if-ne p1, v1, :cond_4

    .line 242
    .line 243
    const/16 p1, 0x14

    .line 244
    .line 245
    .line 246
    invoke-virtual {v0, p1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 247
    .line 248
    const/16 p1, 0x11

    .line 249
    .line 250
    sget v0, Lcom/kubi/sdk/res/R$id;->banner_indicatorId:I

    .line 251
    .line 252
    .line 253
    invoke-virtual {v4, p1, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 254
    .line 255
    iget-object p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mTipTv:Landroid/widget/TextView;

    .line 256
    .line 257
    .line 258
    const v0, 0x800015

    .line 259
    .line 260
    .line 261
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setGravity(I)V

    .line 262
    goto :goto_2

    .line 263
    :cond_4
    const/4 v1, 0x5

    .line 264
    .line 265
    if-ne p1, v1, :cond_5

    .line 266
    .line 267
    const/16 p1, 0x15

    .line 268
    .line 269
    .line 270
    invoke-virtual {v0, p1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 271
    .line 272
    sget p1, Lcom/kubi/sdk/res/R$id;->banner_indicatorId:I

    .line 273
    .line 274
    .line 275
    invoke-virtual {v4, v7, p1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 276
    goto :goto_2

    .line 277
    .line 278
    :cond_5
    const/16 p1, 0xe

    .line 279
    .line 280
    .line 281
    invoke-virtual {v0, p1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 282
    .line 283
    sget p1, Lcom/kubi/sdk/res/R$id;->banner_indicatorId:I

    .line 284
    .line 285
    .line 286
    invoke-virtual {v4, v7, p1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 287
    .line 288
    .line 289
    :goto_2
    invoke-virtual {p0}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->showPlaceholder()V

    .line 290
    return-void
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

.method private initViewPager()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViewPager:Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGAViewPager;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 13
    move-result v0

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViewPager:Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGAViewPager;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 21
    .line 22
    iput-object v1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViewPager:Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGAViewPager;

    .line 23
    .line 24
    :cond_0
    new-instance v0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGAViewPager;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 28
    move-result-object v2

    .line 29
    .line 30
    .line 31
    invoke-direct {v0, v2}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGAViewPager;-><init>(Landroid/content/Context;)V

    .line 32
    .line 33
    iput-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViewPager:Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGAViewPager;

    .line 34
    const/4 v2, 0x1

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v2}, Landroidx/viewpager/widget/ViewPager;->setOffscreenPageLimit(I)V

    .line 38
    .line 39
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViewPager:Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGAViewPager;

    .line 40
    .line 41
    new-instance v3, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner$f;

    .line 42
    .line 43
    .line 44
    invoke-direct {v3, p0, v1}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner$f;-><init>(Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner$a;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v3}, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;->setAdapter(Landroidx/viewpager/widget/PagerAdapter;)V

    .line 48
    .line 49
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViewPager:Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGAViewPager;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, p0}, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;->addOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V

    .line 53
    .line 54
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViewPager:Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGAViewPager;

    .line 55
    .line 56
    iget v1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mOverScrollMode:I

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v1}, Landroid/view/View;->setOverScrollMode(I)V

    .line 60
    .line 61
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViewPager:Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGAViewPager;

    .line 62
    .line 63
    iget-boolean v1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mAllowUserScrollable:Z

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v1}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGAViewPager;->setAllowUserScrollable(Z)V

    .line 67
    .line 68
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViewPager:Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGAViewPager;

    .line 69
    .line 70
    iget-object v1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mTransitionEffect:Lcom/kubi/resources/widget/bingoogolapple/bgabanner/transformer/TransitionEffect;

    .line 71
    .line 72
    .line 73
    invoke-static {v1}, Liw/c;->a(Lcom/kubi/resources/widget/bingoogolapple/bgabanner/transformer/TransitionEffect;)Liw/c;

    .line 74
    move-result-object v1

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v2, v1}, Landroidx/viewpager/widget/ViewPager;->setPageTransformer(ZLandroidx/viewpager/widget/ViewPager$PageTransformer;)V

    .line 78
    .line 79
    iget v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPageChangeDuration:I

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0, v0}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->setPageChangeDuration(I)V

    .line 83
    .line 84
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 85
    const/4 v1, -0x1

    .line 86
    .line 87
    .line 88
    invoke-direct {v0, v1, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 89
    .line 90
    iget v1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mContentBottomMargin:I

    .line 91
    const/4 v2, 0x0

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, v2, v2, v2, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 95
    .line 96
    iget-object v1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViewPager:Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGAViewPager;

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0, v1, v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 100
    .line 101
    iget-boolean v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mAutoPlayAble:Z

    .line 102
    .line 103
    if-eqz v0, :cond_1

    .line 104
    .line 105
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViews:Ljava/util/List;

    .line 106
    .line 107
    new-array v1, v2, [Ljava/util/Collection;

    .line 108
    .line 109
    .line 110
    invoke-static {v0, v1}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/b;->g(Ljava/util/Collection;[Ljava/util/Collection;)Z

    .line 111
    move-result v0

    .line 112
    .line 113
    if-nez v0, :cond_1

    .line 114
    .line 115
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViewPager:Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGAViewPager;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0, p0}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGAViewPager;->setAutoPlayDelegate(Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGAViewPager$a;)V

    .line 119
    .line 120
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViews:Ljava/util/List;

    .line 121
    .line 122
    .line 123
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 124
    move-result v0

    .line 125
    .line 126
    .line 127
    const v1, 0x3fffffff    # 1.9999999f

    .line 128
    .line 129
    rem-int v0, v1, v0

    .line 130
    sub-int/2addr v1, v0

    .line 131
    .line 132
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViewPager:Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGAViewPager;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0, v1}, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;->setCurrentItem(I)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p0}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->startAutoPlay()V

    .line 139
    return-void

    .line 140
    .line 141
    .line 142
    :cond_1
    invoke-direct {p0, v2}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->switchToPoint(I)V

    .line 143
    return-void
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

.method private onInvisibleToUser()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->stopAutoPlay()V

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mIsFirstInvisible:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-boolean v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mAutoPlayAble:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViewPager:Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGAViewPager;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->getItemCount()I

    .line 19
    move-result v0

    .line 20
    .line 21
    if-lez v0, :cond_0

    .line 22
    .line 23
    iget v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPageScrollPositionOffset:F

    .line 24
    const/4 v1, 0x0

    .line 25
    .line 26
    cmpl-float v0, v0, v1

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViewPager:Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGAViewPager;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;->getCurrentItem()I

    .line 34
    move-result v1

    .line 35
    .line 36
    add-int/lit8 v1, v1, -0x1

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v1}, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;->setCurrentItem(I)V

    .line 40
    .line 41
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViewPager:Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGAViewPager;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;->getCurrentItem()I

    .line 45
    move-result v1

    .line 46
    .line 47
    add-int/lit8 v1, v1, 0x1

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1}, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;->setCurrentItem(I)V

    .line 51
    :cond_0
    const/4 v0, 0x0

    .line 52
    .line 53
    iput-boolean v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mIsFirstInvisible:Z

    .line 54
    return-void
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

.method private switchToNextPage()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViewPager:Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGAViewPager;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;->getCurrentItem()I

    .line 8
    move-result v1

    .line 9
    .line 10
    add-int/lit8 v1, v1, 0x1

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;->setCurrentItem(I)V

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
.end method

.method private switchToPoint(I)V
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mTipTv:Landroid/widget/TextView;

    .line 3
    .line 4
    const/16 v1, 0x8

    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mTips:Ljava/util/List;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 16
    move-result v0

    .line 17
    .line 18
    if-lt v0, v3, :cond_1

    .line 19
    .line 20
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mTips:Ljava/util/List;

    .line 21
    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 24
    move-result v0

    .line 25
    .line 26
    if-lt p1, v0, :cond_0

    .line 27
    goto :goto_0

    .line 28
    .line 29
    :cond_0
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mTipTv:Landroid/widget/TextView;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 33
    .line 34
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mTipTv:Landroid/widget/TextView;

    .line 35
    .line 36
    iget-object v4, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mTips:Ljava/util/List;

    .line 37
    .line 38
    .line 39
    invoke-interface {v4, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 40
    move-result-object v4

    .line 41
    .line 42
    check-cast v4, Ljava/lang/CharSequence;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 46
    goto :goto_1

    .line 47
    .line 48
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mTipTv:Landroid/widget/TextView;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 52
    .line 53
    :cond_2
    :goto_1
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPointRealContainerLl:Landroid/widget/LinearLayout;

    .line 54
    .line 55
    if-eqz v0, :cond_6

    .line 56
    .line 57
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViews:Ljava/util/List;

    .line 58
    .line 59
    if-eqz v0, :cond_5

    .line 60
    .line 61
    .line 62
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 63
    move-result v0

    .line 64
    .line 65
    if-lez v0, :cond_5

    .line 66
    .line 67
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViews:Ljava/util/List;

    .line 68
    .line 69
    .line 70
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 71
    move-result v0

    .line 72
    .line 73
    if-ge p1, v0, :cond_5

    .line 74
    .line 75
    iget-boolean v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mIsNeedShowIndicatorOnOnlyOnePage:Z

    .line 76
    .line 77
    if-nez v0, :cond_3

    .line 78
    .line 79
    if-nez v0, :cond_5

    .line 80
    .line 81
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViews:Ljava/util/List;

    .line 82
    .line 83
    .line 84
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 85
    move-result v0

    .line 86
    .line 87
    if-le v0, v3, :cond_5

    .line 88
    .line 89
    :cond_3
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPointRealContainerLl:Landroid/widget/LinearLayout;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 93
    move v0, v2

    .line 94
    .line 95
    :goto_2
    iget-object v4, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPointRealContainerLl:Landroid/widget/LinearLayout;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v4}, Landroid/view/ViewGroup;->getChildCount()I

    .line 99
    move-result v4

    .line 100
    .line 101
    if-ge v0, v4, :cond_6

    .line 102
    .line 103
    iget-object v4, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPointRealContainerLl:Landroid/widget/LinearLayout;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v4, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 107
    move-result-object v4

    .line 108
    .line 109
    if-ne v0, p1, :cond_4

    .line 110
    move v5, v3

    .line 111
    goto :goto_3

    .line 112
    :cond_4
    move v5, v2

    .line 113
    .line 114
    .line 115
    :goto_3
    invoke-virtual {v4, v5}, Landroid/view/View;->setSelected(Z)V

    .line 116
    .line 117
    iget-object v4, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPointRealContainerLl:Landroid/widget/LinearLayout;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v4, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 121
    move-result-object v4

    .line 122
    .line 123
    .line 124
    invoke-virtual {v4}, Landroid/view/View;->requestLayout()V

    .line 125
    .line 126
    add-int/lit8 v0, v0, 0x1

    .line 127
    goto :goto_2

    .line 128
    .line 129
    :cond_5
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPointRealContainerLl:Landroid/widget/LinearLayout;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 133
    .line 134
    :cond_6
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mNumberIndicatorTv:Landroid/widget/TextView;

    .line 135
    .line 136
    if-eqz v0, :cond_9

    .line 137
    .line 138
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViews:Ljava/util/List;

    .line 139
    .line 140
    if-eqz v0, :cond_8

    .line 141
    .line 142
    .line 143
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 144
    move-result v0

    .line 145
    .line 146
    if-lez v0, :cond_8

    .line 147
    .line 148
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViews:Ljava/util/List;

    .line 149
    .line 150
    .line 151
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 152
    move-result v0

    .line 153
    .line 154
    if-ge p1, v0, :cond_8

    .line 155
    .line 156
    iget-boolean v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mIsNeedShowIndicatorOnOnlyOnePage:Z

    .line 157
    .line 158
    if-nez v0, :cond_7

    .line 159
    .line 160
    if-nez v0, :cond_8

    .line 161
    .line 162
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViews:Ljava/util/List;

    .line 163
    .line 164
    .line 165
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 166
    move-result v0

    .line 167
    .line 168
    if-le v0, v3, :cond_8

    .line 169
    .line 170
    :cond_7
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mNumberIndicatorTv:Landroid/widget/TextView;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 174
    .line 175
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mNumberIndicatorTv:Landroid/widget/TextView;

    .line 176
    .line 177
    new-instance v1, Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 181
    add-int/2addr p1, v3

    .line 182
    .line 183
    .line 184
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    const-string p1, "/"

    .line 187
    .line 188
    .line 189
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    iget-object p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViews:Ljava/util/List;

    .line 192
    .line 193
    .line 194
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 195
    move-result p1

    .line 196
    .line 197
    .line 198
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 202
    move-result-object p1

    .line 203
    .line 204
    .line 205
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 206
    return-void

    .line 207
    .line 208
    :cond_8
    iget-object p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mNumberIndicatorTv:Landroid/widget/TextView;

    .line 209
    .line 210
    .line 211
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 212
    :cond_9
    return-void
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


# virtual methods
.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mAutoPlayAble:Z

    .line 3
    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 8
    move-result v0

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    const/4 v1, 0x1

    .line 12
    .line 13
    if-eq v0, v1, :cond_0

    .line 14
    const/4 v1, 0x3

    .line 15
    .line 16
    if-eq v0, v1, :cond_0

    .line 17
    goto :goto_0

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->startAutoPlay()V

    .line 21
    goto :goto_0

    .line 22
    .line 23
    .line 24
    :cond_1
    invoke-virtual {p0}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->stopAutoPlay()V

    .line 25
    .line 26
    .line 27
    :cond_2
    :goto_0
    invoke-super {p0, p1}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 28
    move-result p1

    .line 29
    return p1
    .line 30
    .line 31
    .line 32
.end method

.method public getCurrentIndexItem()Ljava/lang/Object;
    .locals 2

    .line 1
    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mModels:Ljava/util/List;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->getCurrentItem()I

    .line 6
    move-result v1

    .line 7
    .line 8
    .line 9
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 10
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    return-object v0

    .line 12
    :catch_0
    const/4 v0, 0x0

    .line 13
    return-object v0
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

.method public getCurrentItem()I
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViewPager:Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGAViewPager;

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViews:Ljava/util/List;

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    new-array v1, v1, [Ljava/util/Collection;

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/b;->g(Ljava/util/Collection;[Ljava/util/Collection;)Z

    .line 13
    move-result v0

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    goto :goto_0

    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViewPager:Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGAViewPager;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;->getCurrentItem()I

    .line 22
    move-result v0

    .line 23
    .line 24
    iget-object v1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViews:Ljava/util/List;

    .line 25
    .line 26
    .line 27
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 28
    move-result v1

    .line 29
    rem-int/2addr v0, v1

    .line 30
    return v0

    .line 31
    :cond_1
    :goto_0
    const/4 v0, -0x1

    .line 32
    return v0
    .line 33
.end method

.method public getItemCount()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViews:Ljava/util/List;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 10
    move-result v0

    .line 11
    return v0
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

.method public getItemImageView(I)Landroid/widget/ImageView;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->getItemView(I)Landroid/view/View;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    check-cast p1, Landroid/widget/ImageView;

    .line 7
    return-object p1
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

.method public getItemView(I)Landroid/view/View;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<VT:",
            "Landroid/view/View;",
            ">(I)TVT;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViews:Ljava/util/List;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    const/4 p1, 0x0

    .line 6
    return-object p1

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 10
    move-result-object p1

    .line 11
    .line 12
    check-cast p1, Landroid/view/View;

    .line 13
    return-object p1
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

.method public getTips()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mTips:Ljava/util/List;

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

.method public getViewPager()Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGAViewPager;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViewPager:Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGAViewPager;

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

.method public getViews()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "+",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViews:Ljava/util/List;

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

.method public handleAutoPlayActionUpOrCancel(F)V
    .locals 7

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViewPager:Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGAViewPager;

    .line 3
    .line 4
    if-eqz v0, :cond_d

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 8
    move-result v0

    .line 9
    .line 10
    .line 11
    const v1, 0x3f333333    # 0.7f

    .line 12
    .line 13
    .line 14
    const v2, 0x3e99999a    # 0.3f

    .line 15
    .line 16
    const/high16 v3, -0x3c380000    # -400.0f

    .line 17
    .line 18
    const/high16 v4, 0x43c80000    # 400.0f

    .line 19
    const/4 v5, 0x1

    .line 20
    .line 21
    if-ne v0, v5, :cond_6

    .line 22
    .line 23
    iget v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPageScrollPosition:I

    .line 24
    .line 25
    iget-object v6, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViewPager:Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGAViewPager;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v6}, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;->getCurrentItem()I

    .line 29
    move-result v6

    .line 30
    .line 31
    if-ge v0, v6, :cond_2

    .line 32
    neg-float p1, p1

    .line 33
    .line 34
    cmpl-float v0, p1, v4

    .line 35
    .line 36
    if-gtz v0, :cond_1

    .line 37
    .line 38
    iget v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPageScrollPositionOffset:F

    .line 39
    .line 40
    cmpl-float v0, v0, v2

    .line 41
    .line 42
    if-lez v0, :cond_0

    .line 43
    .line 44
    cmpg-float p1, p1, v4

    .line 45
    .line 46
    if-gez p1, :cond_0

    .line 47
    goto :goto_0

    .line 48
    .line 49
    :cond_0
    iget-object p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViewPager:Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGAViewPager;

    .line 50
    .line 51
    iget v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPageScrollPosition:I

    .line 52
    add-int/2addr v0, v5

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, v0, v5}, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;->setCurrentItem(IZ)V

    .line 56
    return-void

    .line 57
    .line 58
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViewPager:Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGAViewPager;

    .line 59
    .line 60
    iget v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPageScrollPosition:I

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, v0, v5}, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;->setCurrentItem(IZ)V

    .line 64
    return-void

    .line 65
    .line 66
    :cond_2
    iget v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPageScrollPosition:I

    .line 67
    .line 68
    iget-object v2, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViewPager:Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGAViewPager;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2}, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;->getCurrentItem()I

    .line 72
    move-result v2

    .line 73
    .line 74
    if-ne v0, v2, :cond_5

    .line 75
    .line 76
    cmpl-float v0, p1, v4

    .line 77
    .line 78
    if-gtz v0, :cond_4

    .line 79
    .line 80
    iget v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPageScrollPositionOffset:F

    .line 81
    .line 82
    cmpg-float v0, v0, v1

    .line 83
    .line 84
    if-gez v0, :cond_3

    .line 85
    .line 86
    cmpl-float p1, p1, v3

    .line 87
    .line 88
    if-lez p1, :cond_3

    .line 89
    goto :goto_1

    .line 90
    .line 91
    :cond_3
    iget-object p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViewPager:Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGAViewPager;

    .line 92
    .line 93
    iget v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPageScrollPosition:I

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, v0, v5}, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;->setCurrentItem(IZ)V

    .line 97
    return-void

    .line 98
    .line 99
    :cond_4
    :goto_1
    iget-object p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViewPager:Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGAViewPager;

    .line 100
    .line 101
    iget v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPageScrollPosition:I

    .line 102
    add-int/2addr v0, v5

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1, v0, v5}, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;->setCurrentItem(IZ)V

    .line 106
    return-void

    .line 107
    .line 108
    :cond_5
    iget-object p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViewPager:Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGAViewPager;

    .line 109
    .line 110
    iget v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPageScrollPosition:I

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1, v0, v5}, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;->setCurrentItem(IZ)V

    .line 114
    return-void

    .line 115
    .line 116
    :cond_6
    iget v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPageScrollPosition:I

    .line 117
    .line 118
    iget-object v6, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViewPager:Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGAViewPager;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v6}, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;->getCurrentItem()I

    .line 122
    move-result v6

    .line 123
    .line 124
    if-ge v0, v6, :cond_9

    .line 125
    .line 126
    cmpl-float v0, p1, v4

    .line 127
    .line 128
    if-gtz v0, :cond_8

    .line 129
    .line 130
    iget v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPageScrollPositionOffset:F

    .line 131
    .line 132
    cmpg-float v0, v0, v1

    .line 133
    .line 134
    if-gez v0, :cond_7

    .line 135
    .line 136
    cmpl-float p1, p1, v3

    .line 137
    .line 138
    if-lez p1, :cond_7

    .line 139
    goto :goto_2

    .line 140
    .line 141
    :cond_7
    iget-object p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViewPager:Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGAViewPager;

    .line 142
    .line 143
    iget v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPageScrollPosition:I

    .line 144
    add-int/2addr v0, v5

    .line 145
    .line 146
    .line 147
    invoke-virtual {p1, v0, v5}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGAViewPager;->g(IZ)V

    .line 148
    return-void

    .line 149
    .line 150
    :cond_8
    :goto_2
    iget-object p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViewPager:Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGAViewPager;

    .line 151
    .line 152
    iget v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPageScrollPosition:I

    .line 153
    .line 154
    .line 155
    invoke-virtual {p1, v0, v5}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGAViewPager;->g(IZ)V

    .line 156
    return-void

    .line 157
    .line 158
    :cond_9
    iget v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPageScrollPosition:I

    .line 159
    .line 160
    iget-object v1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViewPager:Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGAViewPager;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v1}, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;->getCurrentItem()I

    .line 164
    move-result v1

    .line 165
    .line 166
    if-ne v0, v1, :cond_c

    .line 167
    .line 168
    cmpg-float v0, p1, v3

    .line 169
    .line 170
    if-ltz v0, :cond_b

    .line 171
    .line 172
    iget v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPageScrollPositionOffset:F

    .line 173
    .line 174
    cmpl-float v0, v0, v2

    .line 175
    .line 176
    if-lez v0, :cond_a

    .line 177
    .line 178
    cmpg-float p1, p1, v4

    .line 179
    .line 180
    if-gez p1, :cond_a

    .line 181
    goto :goto_3

    .line 182
    .line 183
    :cond_a
    iget-object p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViewPager:Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGAViewPager;

    .line 184
    .line 185
    iget v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPageScrollPosition:I

    .line 186
    .line 187
    .line 188
    invoke-virtual {p1, v0, v5}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGAViewPager;->g(IZ)V

    .line 189
    return-void

    .line 190
    .line 191
    :cond_b
    :goto_3
    iget-object p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViewPager:Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGAViewPager;

    .line 192
    .line 193
    iget v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPageScrollPosition:I

    .line 194
    add-int/2addr v0, v5

    .line 195
    .line 196
    .line 197
    invoke-virtual {p1, v0, v5}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGAViewPager;->g(IZ)V

    .line 198
    return-void

    .line 199
    .line 200
    :cond_c
    iget-object p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViewPager:Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGAViewPager;

    .line 201
    .line 202
    iget v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPageScrollPosition:I

    .line 203
    .line 204
    .line 205
    invoke-virtual {p1, v0, v5}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGAViewPager;->g(IZ)V

    .line 206
    :cond_d
    return-void
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

.method public isStopAutoPlay()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->stopAutoPlay:Z

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

.method public onAttachedToWindow()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->startAutoPlay()V

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

.method public onDetachedFromWindow()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->onInvisibleToUser()V

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

.method public onMeasure(II)V
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mAspectRatio:F

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    cmpl-float v0, v0, v1

    .line 6
    .line 7
    if-lez v0, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 11
    move-result p2

    .line 12
    int-to-float p2, p2

    .line 13
    .line 14
    iget v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mAspectRatio:F

    .line 15
    div-float/2addr p2, v0

    .line 16
    float-to-int p2, p2

    .line 17
    .line 18
    const/high16 v0, 0x40000000    # 2.0f

    .line 19
    .line 20
    .line 21
    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 22
    move-result p2

    .line 23
    .line 24
    .line 25
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/widget/RelativeLayout;->onMeasure(II)V

    .line 26
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

.method public onPageScrollStateChanged(I)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mOnPageChangeListener:Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0, p1}, Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;->onPageScrollStateChanged(I)V

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
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public onPageScrolled(IFI)V
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViews:Ljava/util/List;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    new-array v2, v1, [Ljava/util/Collection;

    .line 6
    .line 7
    .line 8
    invoke-static {v0, v2}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/b;->g(Ljava/util/Collection;[Ljava/util/Collection;)Z

    .line 9
    move-result v0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto/16 :goto_1

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViews:Ljava/util/List;

    .line 16
    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 19
    move-result v0

    .line 20
    .line 21
    rem-int v0, p1, v0

    .line 22
    .line 23
    .line 24
    invoke-direct {p0, v0, p2}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->handleGuideViewVisibility(IF)V

    .line 25
    .line 26
    iput p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPageScrollPosition:I

    .line 27
    .line 28
    iput p2, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPageScrollPositionOffset:F

    .line 29
    .line 30
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mTipTv:Landroid/widget/TextView;

    .line 31
    .line 32
    if-eqz v0, :cond_3

    .line 33
    .line 34
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mTips:Ljava/util/List;

    .line 35
    .line 36
    new-array v2, v1, [Ljava/util/Collection;

    .line 37
    .line 38
    .line 39
    invoke-static {v0, v2}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/b;->h(Ljava/util/Collection;[Ljava/util/Collection;)Z

    .line 40
    move-result v0

    .line 41
    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mTipTv:Landroid/widget/TextView;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 48
    .line 49
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mTips:Ljava/util/List;

    .line 50
    .line 51
    .line 52
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 53
    move-result v0

    .line 54
    .line 55
    rem-int v0, p1, v0

    .line 56
    .line 57
    add-int/lit8 v1, p1, 0x1

    .line 58
    .line 59
    iget-object v2, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mTips:Ljava/util/List;

    .line 60
    .line 61
    .line 62
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 63
    move-result v2

    .line 64
    rem-int/2addr v1, v2

    .line 65
    .line 66
    iget-object v2, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mTips:Ljava/util/List;

    .line 67
    .line 68
    .line 69
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 70
    move-result v2

    .line 71
    .line 72
    if-ge v1, v2, :cond_3

    .line 73
    .line 74
    iget-object v2, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mTips:Ljava/util/List;

    .line 75
    .line 76
    .line 77
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 78
    move-result v2

    .line 79
    .line 80
    if-ge v0, v2, :cond_3

    .line 81
    float-to-double v2, p2

    .line 82
    .line 83
    const-wide/high16 v4, 0x3fe0000000000000L    # 0.5

    .line 84
    .line 85
    cmpl-double v2, v2, v4

    .line 86
    .line 87
    if-lez v2, :cond_1

    .line 88
    .line 89
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mTipTv:Landroid/widget/TextView;

    .line 90
    .line 91
    iget-object v2, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mTips:Ljava/util/List;

    .line 92
    .line 93
    .line 94
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 95
    move-result-object v1

    .line 96
    .line 97
    check-cast v1, Ljava/lang/CharSequence;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 101
    .line 102
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mTipTv:Landroid/widget/TextView;

    .line 103
    .line 104
    .line 105
    invoke-static {v0, p2}, Landroidx/core/view/ViewCompat;->setAlpha(Landroid/view/View;F)V

    .line 106
    goto :goto_0

    .line 107
    .line 108
    :cond_1
    iget-object v1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mTipTv:Landroid/widget/TextView;

    .line 109
    .line 110
    const/high16 v2, 0x3f800000    # 1.0f

    .line 111
    sub-float/2addr v2, p2

    .line 112
    .line 113
    .line 114
    invoke-static {v1, v2}, Landroidx/core/view/ViewCompat;->setAlpha(Landroid/view/View;F)V

    .line 115
    .line 116
    iget-object v1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mTipTv:Landroid/widget/TextView;

    .line 117
    .line 118
    iget-object v2, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mTips:Ljava/util/List;

    .line 119
    .line 120
    .line 121
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 122
    move-result-object v0

    .line 123
    .line 124
    check-cast v0, Ljava/lang/CharSequence;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 128
    goto :goto_0

    .line 129
    .line 130
    :cond_2
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mTipTv:Landroid/widget/TextView;

    .line 131
    .line 132
    const/16 v1, 0x8

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 136
    .line 137
    :cond_3
    :goto_0
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mOnPageChangeListener:Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;

    .line 138
    .line 139
    if-eqz v0, :cond_4

    .line 140
    .line 141
    iget-object v1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViews:Ljava/util/List;

    .line 142
    .line 143
    .line 144
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 145
    move-result v1

    .line 146
    rem-int/2addr p1, v1

    .line 147
    .line 148
    .line 149
    invoke-interface {v0, p1, p2, p3}, Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;->onPageScrolled(IFI)V

    .line 150
    :cond_4
    :goto_1
    return-void
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
.end method

.method public onPageSelected(I)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViews:Ljava/util/List;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    new-array v1, v1, [Ljava/util/Collection;

    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/b;->g(Ljava/util/Collection;[Ljava/util/Collection;)Z

    .line 9
    move-result v0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    goto :goto_0

    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViews:Ljava/util/List;

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 18
    move-result v0

    .line 19
    rem-int/2addr p1, v0

    .line 20
    .line 21
    .line 22
    invoke-direct {p0, p1}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->switchToPoint(I)V

    .line 23
    .line 24
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mOnPageChangeListener:Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    .line 29
    invoke-interface {v0, p1}, Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;->onPageSelected(I)V

    .line 30
    :cond_1
    :goto_0
    return-void
    .line 31
    .line 32
.end method

.method public onVisibilityChanged(Landroid/view/View;I)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Landroid/view/View;->onVisibilityChanged(Landroid/view/View;I)V

    .line 4
    .line 5
    if-nez p2, :cond_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->startAutoPlay()V

    .line 9
    return-void

    .line 10
    :cond_0
    const/4 p1, 0x4

    .line 11
    .line 12
    if-eq p2, p1, :cond_2

    .line 13
    .line 14
    const/16 p1, 0x8

    .line 15
    .line 16
    if-ne p2, p1, :cond_1

    .line 17
    goto :goto_0

    .line 18
    :cond_1
    return-void

    .line 19
    .line 20
    .line 21
    :cond_2
    :goto_0
    invoke-direct {p0}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->onInvisibleToUser()V

    .line 22
    return-void
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

.method public removePlaceholder()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPlaceholderIv:Landroid/widget/ImageView;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    move-result v0

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPlaceholderIv:Landroid/widget/ImageView;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 20
    const/4 v0, 0x0

    .line 21
    .line 22
    iput-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPlaceholderIv:Landroid/widget/ImageView;

    .line 23
    :cond_0
    return-void
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

.method public setAdapter(Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner$b;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mAdapter:Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner$b;

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

.method public setAllowUserScrollable(Z)V
    .locals 1

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mAllowUserScrollable:Z

    .line 3
    .line 4
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViewPager:Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGAViewPager;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGAViewPager;->setAllowUserScrollable(Z)V

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

.method public setAspectRatio(F)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mAspectRatio:F

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

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
.end method

.method public setAutoPlayAble(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mAutoPlayAble:Z

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->stopAutoPlay()V

    .line 6
    .line 7
    iget-object p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViewPager:Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGAViewPager;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;->getAdapter()Landroidx/viewpager/widget/PagerAdapter;

    .line 13
    move-result-object p1

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    iget-object p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViewPager:Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGAViewPager;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;->getAdapter()Landroidx/viewpager/widget/PagerAdapter;

    .line 21
    move-result-object p1

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Landroidx/viewpager/widget/PagerAdapter;->notifyDataSetChanged()V

    .line 25
    :cond_0
    return-void
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public setAutoPlayInterval(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mAutoPlayInterval:I

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

.method public setCurrentItem(I)V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViewPager:Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGAViewPager;

    .line 3
    .line 4
    if-eqz v0, :cond_4

    .line 5
    .line 6
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViews:Ljava/util/List;

    .line 7
    .line 8
    if-eqz v0, :cond_4

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->getItemCount()I

    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x1

    .line 14
    sub-int/2addr v0, v1

    .line 15
    .line 16
    if-le p1, v0, :cond_0

    .line 17
    goto :goto_2

    .line 18
    .line 19
    :cond_0
    iget-boolean v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mAutoPlayAble:Z

    .line 20
    const/4 v2, 0x0

    .line 21
    .line 22
    if-eqz v0, :cond_3

    .line 23
    .line 24
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViewPager:Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGAViewPager;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;->getCurrentItem()I

    .line 28
    move-result v0

    .line 29
    .line 30
    iget-object v3, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViews:Ljava/util/List;

    .line 31
    .line 32
    .line 33
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 34
    move-result v3

    .line 35
    .line 36
    rem-int v3, v0, v3

    .line 37
    sub-int/2addr p1, v3

    .line 38
    .line 39
    if-gez p1, :cond_1

    .line 40
    const/4 v1, -0x1

    .line 41
    .line 42
    :goto_0
    if-lt v1, p1, :cond_2

    .line 43
    .line 44
    iget-object v3, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViewPager:Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGAViewPager;

    .line 45
    .line 46
    add-int v4, v0, v1

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3, v4, v2}, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;->setCurrentItem(IZ)V

    .line 50
    .line 51
    add-int/lit8 v1, v1, -0x1

    .line 52
    goto :goto_0

    .line 53
    .line 54
    :cond_1
    if-lez p1, :cond_2

    .line 55
    .line 56
    :goto_1
    if-gt v1, p1, :cond_2

    .line 57
    .line 58
    iget-object v3, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViewPager:Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGAViewPager;

    .line 59
    .line 60
    add-int v4, v0, v1

    .line 61
    .line 62
    .line 63
    invoke-virtual {v3, v4, v2}, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;->setCurrentItem(IZ)V

    .line 64
    .line 65
    add-int/lit8 v1, v1, 0x1

    .line 66
    goto :goto_1

    .line 67
    .line 68
    .line 69
    :cond_2
    invoke-virtual {p0}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->startAutoPlay()V

    .line 70
    return-void

    .line 71
    .line 72
    :cond_3
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViewPager:Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGAViewPager;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, p1, v2}, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;->setCurrentItem(IZ)V

    .line 76
    :cond_4
    :goto_2
    return-void
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

.method public setData(ILjava/util/List;Ljava/util/List;)V
    .locals 3
    .param p1    # I
        .annotation build Landroidx/annotation/LayoutRes;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 15
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViews:Ljava/util/List;

    if-nez p2, :cond_0

    .line 16
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 17
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    :cond_0
    const/4 v0, 0x0

    .line 18
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 19
    iget-object v1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViews:Ljava/util/List;

    invoke-direct {p0, p1}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->inflateItemView(I)Landroid/view/View;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 20
    :cond_1
    iget-boolean v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mAutoPlayAble:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViews:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x3

    if-ge v0, v1, :cond_2

    .line 21
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViews:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mHackyViews:Ljava/util/List;

    .line 22
    invoke-direct {p0, p1}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->inflateItemView(I)Landroid/view/View;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 23
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mHackyViews:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 24
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mHackyViews:Ljava/util/List;

    invoke-direct {p0, p1}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->inflateItemView(I)Landroid/view/View;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 25
    :cond_2
    iget-object p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViews:Ljava/util/List;

    invoke-virtual {p0, p1, p2, p3}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->setData(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-void
.end method

.method public varargs setData(Lcom/kubi/resources/widget/bingoogolapple/bgabanner/c;Landroid/widget/ImageView$ScaleType;[I)V
    .locals 5
    .param p1    # Lcom/kubi/resources/widget/bingoogolapple/bgabanner/c;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Landroid/widget/ImageView$ScaleType;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # [I
        .annotation build Landroidx/annotation/DrawableRes;
        .end annotation
    .end param

    if-nez p1, :cond_0

    .line 28
    new-instance p1, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/c;

    const/high16 v0, 0x43a00000    # 320.0f

    const/high16 v1, 0x44200000    # 640.0f

    const/16 v2, 0x2d0

    const/16 v3, 0x500

    invoke-direct {p1, v2, v3, v0, v1}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/c;-><init>(IIFF)V

    :cond_0
    if-eqz p2, :cond_1

    .line 29
    iput-object p2, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mScaleType:Landroid/widget/ImageView$ScaleType;

    .line 30
    :cond_1
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 31
    array-length v0, p3

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    aget v2, p3, v1

    .line 32
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    iget-object v4, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mScaleType:Landroid/widget/ImageView$ScaleType;

    invoke-static {v3, v2, p1, v4}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/b;->d(Landroid/content/Context;ILcom/kubi/resources/widget/bingoogolapple/bgabanner/c;Landroid/widget/ImageView$ScaleType;)Landroid/widget/ImageView;

    move-result-object v2

    invoke-interface {p2, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 33
    :cond_2
    invoke-virtual {p0, p2}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->setData(Ljava/util/List;)V

    return-void
.end method

.method public setData(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 27
    invoke-virtual {p0, p1, v0, v0}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->setData(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-void
.end method

.method public setData(Ljava/util/List;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 26
    sget v0, Lcom/kubi/sdk/res/R$layout;->bga_banner_item_image:I

    invoke-virtual {p0, v0, p1, p2}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->setData(ILjava/util/List;Ljava/util/List;)V

    return-void
.end method

.method public setData(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    new-array v1, v0, [Ljava/util/Collection;

    invoke-static {p1, v1}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/b;->g(Ljava/util/Collection;[Ljava/util/Collection;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 2
    iput-boolean v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mAutoPlayAble:Z

    .line 3
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 4
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 5
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 6
    :cond_0
    iget-boolean v1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mAutoPlayAble:Z

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x3

    if-ge v1, v2, :cond_1

    iget-object v1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mHackyViews:Ljava/util/List;

    if-nez v1, :cond_1

    .line 7
    iput-boolean v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mAutoPlayAble:Z

    .line 8
    :cond_1
    iput-object p2, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mModels:Ljava/util/List;

    .line 9
    iput-object p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViews:Ljava/util/List;

    .line 10
    iput-object p3, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mTips:Ljava/util/List;

    .line 11
    invoke-direct {p0}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->initIndicator()V

    .line 12
    invoke-direct {p0}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->initViewPager()V

    .line 13
    invoke-virtual {p0}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->removePlaceholder()V

    const/4 p1, 0x0

    .line 14
    invoke-direct {p0, v0, p1}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->handleGuideViewVisibility(IF)V

    return-void
.end method

.method public setDelegate(Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner$d;)V
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

.method public setEnterSkipViewId(II)V
    .locals 1

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Landroid/app/Activity;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    iput-object p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mEnterView:Landroid/view/View;

    .line 15
    .line 16
    :cond_0
    if-eqz p2, :cond_1

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 20
    move-result-object p1

    .line 21
    .line 22
    check-cast p1, Landroid/app/Activity;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, p2}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 26
    move-result-object p1

    .line 27
    .line 28
    iput-object p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mSkipView:Landroid/view/View;

    .line 29
    :cond_1
    return-void
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

.method public setEnterSkipViewIdAndDelegate(IILcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner$e;)V
    .locals 0

    .line 1
    .line 2
    if-eqz p3, :cond_1

    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    move-result-object p3

    .line 9
    .line 10
    check-cast p3, Landroid/app/Activity;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p3, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    iput-object p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mEnterView:Landroid/view/View;

    .line 17
    .line 18
    iget-object p3, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mGuideOnNoDoubleClickListener:Lcom/kubi/resources/widget/bingoogolapple/bgabanner/d;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 22
    .line 23
    :cond_0
    if-eqz p2, :cond_1

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 27
    move-result-object p1

    .line 28
    .line 29
    check-cast p1, Landroid/app/Activity;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, p2}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 33
    move-result-object p1

    .line 34
    .line 35
    iput-object p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mSkipView:Landroid/view/View;

    .line 36
    .line 37
    iget-object p2, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mGuideOnNoDoubleClickListener:Lcom/kubi/resources/widget/bingoogolapple/bgabanner/d;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 41
    :cond_1
    const/4 p1, 0x0

    .line 42
    const/4 p2, 0x0

    .line 43
    .line 44
    .line 45
    invoke-direct {p0, p1, p2}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->handleGuideViewVisibility(IF)V

    .line 46
    return-void
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
.end method

.method public setIndicatorTopBottomMarginDp(I)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    move-result-object v0

    .line 5
    int-to-float p1, p1

    .line 6
    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/b;->b(Landroid/content/Context;F)I

    .line 9
    move-result p1

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->setIndicatorTopBottomMarginPx(I)V

    .line 13
    return-void
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

.method public setIndicatorTopBottomMarginPx(I)V
    .locals 2

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPointTopBottomMargin:I

    .line 3
    .line 4
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPointContainerRl:Landroid/widget/RelativeLayout;

    .line 5
    .line 6
    iget v1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPointContainerLeftRightPadding:I

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1, p1, v1, p1}, Landroid/view/View;->setPadding(IIII)V

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
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public setIndicatorTopBottomMarginRes(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/DimenRes;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 8
    move-result p1

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->setIndicatorTopBottomMarginPx(I)V

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
.end method

.method public setIndicatorVisibility(Z)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPointContainerRl:Landroid/widget/RelativeLayout;

    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    const/4 p1, 0x0

    .line 6
    goto :goto_0

    .line 7
    .line 8
    :cond_0
    const/16 p1, 0x8

    .line 9
    .line 10
    .line 11
    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

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
.end method

.method public setIsNeedShowIndicatorOnOnlyOnePage(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mIsNeedShowIndicatorOnOnlyOnePage:Z

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

.method public setOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mOnPageChangeListener:Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;

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

.method public setOverScrollMode(I)V
    .locals 1

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mOverScrollMode:I

    .line 3
    .line 4
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViewPager:Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGAViewPager;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Landroid/view/View;->setOverScrollMode(I)V

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

.method public setPageChangeDuration(I)V
    .locals 1

    .line 1
    .line 2
    if-ltz p1, :cond_0

    .line 3
    .line 4
    const/16 v0, 0x7d0

    .line 5
    .line 6
    if-gt p1, v0, :cond_0

    .line 7
    .line 8
    iput p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPageChangeDuration:I

    .line 9
    .line 10
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViewPager:Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGAViewPager;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGAViewPager;->setPageChangeDuration(I)V

    .line 16
    :cond_0
    return-void
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

.method public setPageTransformer(Landroidx/viewpager/widget/ViewPager$PageTransformer;)V
    .locals 2

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViewPager:Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGAViewPager;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    const/4 v1, 0x1

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1, p1}, Landroidx/viewpager/widget/ViewPager;->setPageTransformer(ZLandroidx/viewpager/widget/ViewPager$PageTransformer;)V

    .line 11
    :cond_0
    return-void
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

.method public setTransitionEffect(Lcom/kubi/resources/widget/bingoogolapple/bgabanner/transformer/TransitionEffect;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mTransitionEffect:Lcom/kubi/resources/widget/bingoogolapple/bgabanner/transformer/TransitionEffect;

    .line 3
    .line 4
    iget-object p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViewPager:Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGAViewPager;

    .line 5
    .line 6
    if-eqz p1, :cond_1

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->initViewPager()V

    .line 10
    .line 11
    iget-object p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mHackyViews:Ljava/util/List;

    .line 12
    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    iget-object p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mViews:Ljava/util/List;

    .line 16
    .line 17
    .line 18
    invoke-static {p1}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/b;->j(Ljava/util/List;)V

    .line 19
    return-void

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-static {p1}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/b;->j(Ljava/util/List;)V

    .line 23
    :cond_1
    return-void
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

.method public setUseHackyViews(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->isUseHackyViews:Z

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

.method public showPlaceholder()V
    .locals 8

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPlaceholderIv:Landroid/widget/ImageView;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iget v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPlaceholderDrawableResId:I

    .line 7
    const/4 v1, -0x1

    .line 8
    .line 9
    if-eq v0, v1, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    iget v2, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPlaceholderDrawableResId:I

    .line 16
    .line 17
    new-instance v3, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/c;

    .line 18
    .line 19
    const/high16 v4, 0x44200000    # 640.0f

    .line 20
    .line 21
    const/high16 v5, 0x43a00000    # 320.0f

    .line 22
    .line 23
    const/16 v6, 0x2d0

    .line 24
    .line 25
    const/16 v7, 0x168

    .line 26
    .line 27
    .line 28
    invoke-direct {v3, v6, v7, v4, v5}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/c;-><init>(IIFF)V

    .line 29
    .line 30
    iget-object v4, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mScaleType:Landroid/widget/ImageView$ScaleType;

    .line 31
    .line 32
    .line 33
    invoke-static {v0, v2, v3, v4}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/b;->d(Landroid/content/Context;ILcom/kubi/resources/widget/bingoogolapple/bgabanner/c;Landroid/widget/ImageView$ScaleType;)Landroid/widget/ImageView;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    iput-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPlaceholderIv:Landroid/widget/ImageView;

    .line 37
    .line 38
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 39
    .line 40
    .line 41
    invoke-direct {v0, v1, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 42
    .line 43
    iget v1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPlaceholderIvLeftRightMargin:I

    .line 44
    const/4 v2, 0x0

    .line 45
    .line 46
    iget v3, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mContentBottomMargin:I

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v1, v2, v1, v3}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 50
    .line 51
    iget-object v1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mPlaceholderIv:Landroid/widget/ImageView;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 55
    :cond_0
    return-void
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

.method public startAutoPlay()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->stopAutoPlay()V

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mAutoPlayAble:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mAutoPlayTask:Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner$c;

    .line 10
    .line 11
    iget v1, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mAutoPlayInterval:I

    .line 12
    int-to-long v1, v1

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    .line 18
    iput-boolean v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->stopAutoPlay:Z

    .line 19
    return-void
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

.method public stopAutoPlay()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->mAutoPlayTask:Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner$c;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 8
    :cond_0
    const/4 v0, 0x1

    .line 9
    .line 10
    iput-boolean v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/BGABanner;->stopAutoPlay:Z

    .line 11
    return-void
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
