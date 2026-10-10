.class public final Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;
.super Landroid/widget/LinearLayout;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Landroid/view/GestureDetector$OnGestureListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView$Companion;,
        Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView$OnItemSelected;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000{\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0010*\u0001\u001e\u0018\u0000 K2\u00020\u00012\u00020\u0002:\u0002JKB1\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001c\u00101\u001a\u0002022\u000c\u00103\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u00104\u001a\u00020\u0008J\u0010\u00105\u001a\u00020\u00162\u0006\u00106\u001a\u000207H\u0017J\u0010\u00108\u001a\u00020\u00162\u0006\u00109\u001a\u00020\u0014H\u0002J\u0010\u0010:\u001a\u0002022\u0006\u0010;\u001a\u00020<H\u0014J\u0010\u0010=\u001a\u00020\u00162\u0006\u0010>\u001a\u000207H\u0016J\u0010\u0010?\u001a\u0002022\u0006\u0010>\u001a\u000207H\u0016J\u0010\u0010@\u001a\u00020\u00162\u0006\u0010>\u001a\u000207H\u0016J*\u0010A\u001a\u00020\u00162\u0008\u0010B\u001a\u0004\u0018\u0001072\u0006\u0010C\u001a\u0002072\u0006\u0010D\u001a\u00020\u00142\u0006\u0010E\u001a\u00020\u0014H\u0016J\u0010\u0010F\u001a\u0002022\u0006\u0010>\u001a\u000207H\u0016J*\u0010G\u001a\u00020\u00162\u0008\u0010B\u001a\u0004\u0018\u0001072\u0006\u0010C\u001a\u0002072\u0006\u0010H\u001a\u00020\u00142\u0006\u0010I\u001a\u00020\u0014H\u0016R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u00020\u001eX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u001fR\u000e\u0010 \u001a\u00020!X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\"\u001a\u0004\u0018\u00010#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008$\u0010%\"\u0004\u0008&\u0010\'R\u001a\u0010(\u001a\u00020\u0008X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008)\u0010*\"\u0004\u0008+\u0010,R$\u0010.\u001a\u00020\u00082\u0006\u0010-\u001a\u00020\u00088F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008/\u0010*\"\u0004\u00080\u0010,\u00a8\u0006L"
    }
    d2 = {
        "Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;",
        "Landroid/widget/LinearLayout;",
        "Landroid/view/GestureDetector$OnGestureListener;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "defStyleRes",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;II)V",
        "shapeAppearance",
        "Lcom/google/android/material/shape/ShapeAppearanceModel;",
        "selectedItemBackground",
        "Lcom/google/android/material/shape/MaterialShapeDrawable;",
        "textAppearance",
        "gestureDetector",
        "Landroidx/core/view/GestureDetectorCompat;",
        "selected",
        "",
        "isScrolling",
        "",
        "saveCurrentSelected",
        "textColor",
        "selectedTextColor",
        "segments",
        "",
        "",
        "selectedPropertyHolder",
        "com/sumsub/sns/core/widget/SNSSegmentedToggleView$selectedPropertyHolder$1",
        "Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView$selectedPropertyHolder$1;",
        "animator",
        "Landroidx/dynamicanimation/animation/SpringAnimation;",
        "onItemSelected",
        "Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView$OnItemSelected;",
        "getOnItemSelected",
        "()Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView$OnItemSelected;",
        "setOnItemSelected",
        "(Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView$OnItemSelected;)V",
        "itemPadding",
        "getItemPadding",
        "()I",
        "setItemPadding",
        "(I)V",
        "value",
        "selectedItem",
        "getSelectedItem",
        "setSelectedItem",
        "setItems",
        "",
        "items",
        "selectedIndex",
        "onTouchEvent",
        "event",
        "Landroid/view/MotionEvent;",
        "performTapSelection",
        "x",
        "onDraw",
        "canvas",
        "Landroid/graphics/Canvas;",
        "onDown",
        "e",
        "onShowPress",
        "onSingleTapUp",
        "onScroll",
        "e1",
        "e2",
        "distanceX",
        "distanceY",
        "onLongPress",
        "onFling",
        "velocityX",
        "velocityY",
        "OnItemSelected",
        "Companion",
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
        "SMAP\nSNSSegmentedToggleView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSSegmentedToggleView.kt\ncom/sumsub/sns/core/widget/SNSSegmentedToggleView\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,261:1\n233#2,3:262\n1#3:265\n1878#4,3:266\n1332#5,3:269\n1332#5,3:272\n*S KotlinDebug\n*F\n+ 1 SNSSegmentedToggleView.kt\ncom/sumsub/sns/core/widget/SNSSegmentedToggleView\n*L\n97#1:262,3\n141#1:266,3\n173#1:269,3\n72#1:272,3\n*E\n"
    }
.end annotation


# static fields
.field private static final Companion:Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final STATE_SELECTED:[I
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private final animator:Landroidx/dynamicanimation/animation/SpringAnimation;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final gestureDetector:Landroidx/core/view/GestureDetectorCompat;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private isScrolling:Z

.field private itemPadding:I

.field private onItemSelected:Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView$OnItemSelected;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private saveCurrentSelected:I

.field private segments:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private selected:F

.field private final selectedItemBackground:Lcom/google/android/material/shape/MaterialShapeDrawable;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final selectedPropertyHolder:Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView$selectedPropertyHolder$1;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private selectedTextColor:I

.field private final shapeAppearance:Lcom/google/android/material/shape/ShapeAppearanceModel;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private textAppearance:I

.field private textColor:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->Companion:Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView$Companion;

    .line 9
    .line 10
    .line 11
    const v0, 0x10100a1

    .line 12
    .line 13
    .line 14
    filled-new-array {v0}, [I

    .line 15
    move-result-object v0

    .line 16
    .line 17
    sput-object v0, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->STATE_SELECTED:[I

    .line 18
    return-void
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

.method public constructor <init>(Landroid/content/Context;)V
    .locals 7
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const/16 v5, 0xe

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    .line 1
    invoke-direct/range {v0 .. v6}, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const/16 v5, 0xc

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    .line 2
    invoke-direct/range {v0 .. v6}, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 7
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    .line 3
    invoke-direct/range {v0 .. v6}, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 8
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 7
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 8
    invoke-static {p1, p2, p3, p4}, Lcom/google/android/material/shape/ShapeAppearanceModel;->builder(Landroid/content/Context;Landroid/util/AttributeSet;II)Lcom/google/android/material/shape/ShapeAppearanceModel$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/material/shape/ShapeAppearanceModel$Builder;->build()Lcom/google/android/material/shape/ShapeAppearanceModel;

    move-result-object v0

    iput-object v0, p0, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->shapeAppearance:Lcom/google/android/material/shape/ShapeAppearanceModel;

    .line 9
    new-instance v1, Lcom/google/android/material/shape/MaterialShapeDrawable;

    invoke-direct {v1, v0}, Lcom/google/android/material/shape/MaterialShapeDrawable;-><init>(Lcom/google/android/material/shape/ShapeAppearanceModel;)V

    iput-object v1, p0, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->selectedItemBackground:Lcom/google/android/material/shape/MaterialShapeDrawable;

    const/4 v2, -0x1

    .line 10
    iput v2, p0, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->textAppearance:I

    .line 11
    iput v2, p0, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->textColor:I

    const v3, -0xffff01

    .line 12
    iput v3, p0, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->selectedTextColor:I

    .line 13
    new-instance v4, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView$selectedPropertyHolder$1;

    invoke-direct {v4, p0}, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView$selectedPropertyHolder$1;-><init>(Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;)V

    iput-object v4, p0, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->selectedPropertyHolder:Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView$selectedPropertyHolder$1;

    .line 14
    new-instance v5, Landroidx/dynamicanimation/animation/SpringAnimation;

    const/4 v6, 0x0

    invoke-direct {v5, p0, v4, v6}, Landroidx/dynamicanimation/animation/SpringAnimation;-><init>(Ljava/lang/Object;Landroidx/dynamicanimation/animation/FloatPropertyCompat;F)V

    .line 15
    invoke-virtual {v5}, Landroidx/dynamicanimation/animation/SpringAnimation;->getSpring()Landroidx/dynamicanimation/animation/SpringForce;

    move-result-object v4

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-virtual {v4, v7}, Landroidx/dynamicanimation/animation/SpringForce;->setDampingRatio(F)Landroidx/dynamicanimation/animation/SpringForce;

    .line 16
    invoke-virtual {v5}, Landroidx/dynamicanimation/animation/SpringAnimation;->getSpring()Landroidx/dynamicanimation/animation/SpringForce;

    move-result-object v4

    const v7, 0x44bb8000    # 1500.0f

    invoke-virtual {v4, v7}, Landroidx/dynamicanimation/animation/SpringForce;->setStiffness(F)Landroidx/dynamicanimation/animation/SpringForce;

    .line 17
    invoke-virtual {v5, v6}, Landroidx/dynamicanimation/animation/DynamicAnimation;->setMinValue(F)Landroidx/dynamicanimation/animation/DynamicAnimation;

    .line 18
    new-instance v4, Lcom/sumsub/sns/core/widget/g0;

    invoke-direct {v4, p0}, Lcom/sumsub/sns/core/widget/g0;-><init>(Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;)V

    invoke-virtual {v5, v4}, Landroidx/dynamicanimation/animation/DynamicAnimation;->addEndListener(Landroidx/dynamicanimation/animation/DynamicAnimation$OnAnimationEndListener;)Landroidx/dynamicanimation/animation/DynamicAnimation;

    .line 19
    iput-object v5, p0, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->animator:Landroidx/dynamicanimation/animation/SpringAnimation;

    const/4 v4, 0x0

    .line 20
    invoke-virtual {p0, v4}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 21
    sget-object v5, Lcom/sumsub/sns/R$styleable;->SNSSegmentedToggleView:[I

    .line 22
    invoke-virtual {p1, p2, v5, p3, p4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 23
    new-instance p3, Lcom/google/android/material/shape/MaterialShapeDrawable;

    invoke-direct {p3, v0}, Lcom/google/android/material/shape/MaterialShapeDrawable;-><init>(Lcom/google/android/material/shape/ShapeAppearanceModel;)V

    .line 24
    sget p4, Lcom/sumsub/sns/R$styleable;->SNSSegmentedToggleView_sns_boxStrokeWidth:I

    const/4 v0, 0x1

    int-to-float v0, v0

    .line 25
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v5

    iget v5, v5, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v0, v5

    .line 26
    invoke-virtual {p2, p4, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p4

    invoke-virtual {p3, p4}, Lcom/google/android/material/shape/MaterialShapeDrawable;->setStrokeWidth(F)V

    .line 27
    sget p4, Lcom/sumsub/sns/R$styleable;->SNSSegmentedToggleView_boxStrokeColor:I

    invoke-virtual {p2, p4}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object p4

    invoke-virtual {p3, p4}, Lcom/google/android/material/shape/MaterialShapeDrawable;->setStrokeColor(Landroid/content/res/ColorStateList;)V

    .line 28
    sget p4, Lcom/sumsub/sns/R$styleable;->SNSSegmentedToggleView_boxBackgroundColor:I

    invoke-virtual {p2, p4}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object p4

    invoke-virtual {p3, p4}, Lcom/google/android/material/shape/MaterialShapeDrawable;->setFillColor(Landroid/content/res/ColorStateList;)V

    .line 29
    invoke-virtual {p0, p3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 30
    sget p3, Lcom/sumsub/sns/R$styleable;->SNSSegmentedToggleView_sns_itemBackgroundColor:I

    invoke-virtual {p2, p3}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object p3

    invoke-virtual {v1, p3}, Lcom/google/android/material/shape/MaterialShapeDrawable;->setFillColor(Landroid/content/res/ColorStateList;)V

    .line 31
    sget p3, Lcom/sumsub/sns/R$styleable;->SNSSegmentedToggleView_sns_itemPadding:I

    invoke-virtual {p2, p3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->itemPadding:I

    .line 32
    sget p3, Lcom/sumsub/sns/R$styleable;->SNSSegmentedToggleView_android_textAppearance:I

    invoke-virtual {p2, p3, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p3

    iput p3, p0, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->textAppearance:I

    .line 33
    sget p3, Lcom/sumsub/sns/R$styleable;->SNSSegmentedToggleView_sns_textColor:I

    invoke-virtual {p2, p3}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object p3

    if-eqz p3, :cond_0

    .line 34
    invoke-virtual {p3}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v2

    :cond_0
    iput v2, p0, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->textColor:I

    if-eqz p3, :cond_1

    .line 35
    sget-object p4, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->STATE_SELECTED:[I

    invoke-virtual {p3, p4, v2}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v3

    :cond_1
    iput v3, p0, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->selectedTextColor:I

    .line 36
    sget-object p3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 37
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 38
    sget-object p2, Lcom/sumsub/sns/core/theme/SNSColorElement;->CAMERA_CONTENT:Lcom/sumsub/sns/core/theme/SNSColorElement;

    invoke-static {p0, p2}, Lcom/sumsub/sns/core/presentation/helper/b;->a(Landroid/view/View;Lcom/sumsub/sns/core/theme/SNSColorElement;)Ljava/lang/Integer;

    move-result-object p2

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    .line 39
    iput p2, p0, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->textColor:I

    .line 40
    invoke-static {p2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p2

    invoke-virtual {v1, p2}, Lcom/google/android/material/shape/MaterialShapeDrawable;->setFillColor(Landroid/content/res/ColorStateList;)V

    .line 41
    :cond_2
    sget-object p2, Lcom/sumsub/sns/core/theme/SNSColorElement;->CONTENT_LINK:Lcom/sumsub/sns/core/theme/SNSColorElement;

    invoke-static {p0, p2}, Lcom/sumsub/sns/core/presentation/helper/b;->a(Landroid/view/View;Lcom/sumsub/sns/core/theme/SNSColorElement;)Ljava/lang/Integer;

    move-result-object p2

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    iput p2, p0, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->selectedTextColor:I

    .line 42
    :cond_3
    sget-object p2, Lcom/sumsub/sns/core/theme/SNSColorElement;->CAMERA_BACKGROUND_OVERLAY:Lcom/sumsub/sns/core/theme/SNSColorElement;

    invoke-static {p0, p2}, Lcom/sumsub/sns/core/presentation/helper/b;->a(Landroid/view/View;Lcom/sumsub/sns/core/theme/SNSColorElement;)Ljava/lang/Integer;

    move-result-object p2

    const/4 p3, 0x0

    if-eqz p2, :cond_5

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    .line 43
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p4

    instance-of v0, p4, Lcom/google/android/material/shape/MaterialShapeDrawable;

    if-eqz v0, :cond_4

    check-cast p4, Lcom/google/android/material/shape/MaterialShapeDrawable;

    goto :goto_0

    :cond_4
    move-object p4, p3

    :goto_0
    if-eqz p4, :cond_5

    invoke-static {p2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p2

    invoke-virtual {p4, p2}, Lcom/google/android/material/shape/MaterialShapeDrawable;->setFillColor(Landroid/content/res/ColorStateList;)V

    .line 44
    :cond_5
    sget-object p2, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    invoke-virtual {p2}, Lcom/sumsub/sns/internal/core/common/k0;->getCustomization()Lcom/sumsub/sns/core/theme/SNSJsonCustomization;

    move-result-object p2

    if-eqz p2, :cond_6

    invoke-interface {p2}, Lcom/sumsub/sns/core/theme/SNSJsonCustomization;->getTheme()Lcom/sumsub/sns/core/theme/SNSCustomizationTheme;

    move-result-object p2

    goto :goto_1

    :cond_6
    move-object p2, p3

    :goto_1
    instance-of p4, p2, Lcom/sumsub/sns/internal/core/presentation/theme/p;

    if-eqz p4, :cond_7

    check-cast p2, Lcom/sumsub/sns/internal/core/presentation/theme/p;

    goto :goto_2

    :cond_7
    move-object p2, p3

    :goto_2
    if-eqz p2, :cond_d

    .line 45
    sget-object p4, Lcom/sumsub/sns/core/theme/SNSMetricElement;->SEGMENTED_CONTROL_CORNER_RADIUS:Lcom/sumsub/sns/core/theme/SNSMetricElement;

    .line 46
    iget-object p2, p2, Lcom/sumsub/sns/internal/core/presentation/theme/p;->d:Ljava/util/Map;

    if-eqz p2, :cond_8

    .line 47
    invoke-virtual {p4}, Lcom/sumsub/sns/core/theme/SNSMetricElement;->getValue()Ljava/lang/String;

    move-result-object p4

    invoke-interface {p2, p4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/sumsub/sns/internal/core/presentation/theme/j;

    goto :goto_3

    :cond_8
    move-object p2, p3

    :goto_3
    instance-of p4, p2, Lcom/sumsub/sns/internal/core/presentation/theme/d;

    if-eqz p4, :cond_9

    check-cast p2, Lcom/sumsub/sns/internal/core/presentation/theme/d;

    goto :goto_4

    :cond_9
    move-object p2, p3

    :goto_4
    if-eqz p2, :cond_a

    .line 48
    iget-object p2, p2, Lcom/sumsub/sns/internal/core/presentation/theme/d;->a:Ljava/lang/Float;

    goto :goto_5

    :cond_a
    move-object p2, p3

    :goto_5
    if-eqz p2, :cond_d

    .line 49
    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    move-result p2

    .line 50
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p4

    instance-of v0, p4, Lcom/google/android/material/shape/MaterialShapeDrawable;

    if-eqz v0, :cond_b

    move-object p3, p4

    check-cast p3, Lcom/google/android/material/shape/MaterialShapeDrawable;

    :cond_b
    if-eqz p3, :cond_c

    invoke-virtual {p3, p2}, Lcom/google/android/material/shape/MaterialShapeDrawable;->setCornerSize(F)V

    .line 51
    :cond_c
    invoke-virtual {v1, p2}, Lcom/google/android/material/shape/MaterialShapeDrawable;->setCornerSize(F)V

    .line 52
    :cond_d
    new-instance p2, Landroidx/core/view/GestureDetectorCompat;

    invoke-direct {p2, p1, p0}, Landroidx/core/view/GestureDetectorCompat;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object p2, p0, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->gestureDetector:Landroidx/core/view/GestureDetectorCompat;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    .line 4
    sget p3, Lcom/sumsub/sns/R$attr;->sns_SNSSegmentedToggleViewStyle:I

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    .line 5
    sget p4, Lcom/sumsub/sns/R$style;->Widget_SNSSegmentedToggleView:I

    .line 6
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public static synthetic a(Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;Landroidx/dynamicanimation/animation/DynamicAnimation;ZFF)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2, p3, p4}, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->animator$lambda$2$lambda$1(Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;Landroidx/dynamicanimation/animation/DynamicAnimation;ZFF)V

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
.end method

.method public static final synthetic access$getSelected$p(Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;)F
    .locals 0

    .line 1
    .line 2
    iget p0, p0, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->selected:F

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
.end method

.method public static final synthetic access$setSelected$p(Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;F)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->selected:F

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
.end method

.method private static final animator$lambda$2$lambda$1(Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;Landroidx/dynamicanimation/animation/DynamicAnimation;ZFF)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->performClick()Z

    .line 4
    .line 5
    iget-object p1, p0, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->onItemSelected:Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView$OnItemSelected;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->getSelectedItem()I

    .line 11
    move-result p2

    .line 12
    .line 13
    .line 14
    invoke-interface {p1, p2}, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView$OnItemSelected;->onSelected(I)V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-static {p0}, Landroidx/core/view/ViewGroupKt;->getChildren(Landroid/view/ViewGroup;)Lkotlin/sequences/Sequence;

    .line 18
    move-result-object p1

    .line 19
    .line 20
    .line 21
    invoke-interface {p1}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    .line 22
    move-result-object p1

    .line 23
    const/4 p2, 0x0

    .line 24
    .line 25
    .line 26
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    move-result p3

    .line 28
    .line 29
    if-eqz p3, :cond_5

    .line 30
    .line 31
    .line 32
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    move-result-object p3

    .line 34
    .line 35
    add-int/lit8 p4, p2, 0x1

    .line 36
    .line 37
    if-gez p2, :cond_1

    .line 38
    .line 39
    .line 40
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    .line 41
    .line 42
    :cond_1
    check-cast p3, Landroid/view/View;

    .line 43
    .line 44
    instance-of v0, p3, Landroid/widget/TextView;

    .line 45
    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    check-cast p3, Landroid/widget/TextView;

    .line 49
    goto :goto_1

    .line 50
    :cond_2
    const/4 p3, 0x0

    .line 51
    .line 52
    :goto_1
    if-eqz p3, :cond_4

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->getSelectedItem()I

    .line 56
    move-result v0

    .line 57
    .line 58
    if-ne p2, v0, :cond_3

    .line 59
    .line 60
    iget p2, p0, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->selectedTextColor:I

    .line 61
    goto :goto_2

    .line 62
    .line 63
    :cond_3
    iget p2, p0, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->textColor:I

    .line 64
    .line 65
    .line 66
    :goto_2
    invoke-virtual {p3, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 67
    :cond_4
    move p2, p4

    .line 68
    goto :goto_0

    .line 69
    :cond_5
    return-void
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
.end method

.method private final performTapSelection(F)Z
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Landroidx/core/view/ViewGroupKt;->getChildren(Landroid/view/ViewGroup;)Lkotlin/sequences/Sequence;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    move v2, v1

    .line 11
    .line 12
    .line 13
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    move-result v3

    .line 15
    .line 16
    if-eqz v3, :cond_2

    .line 17
    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    move-result-object v3

    .line 21
    .line 22
    add-int/lit8 v4, v2, 0x1

    .line 23
    .line 24
    if-gez v2, :cond_0

    .line 25
    .line 26
    .line 27
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    .line 28
    .line 29
    :cond_0
    check-cast v3, Landroid/view/View;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v3}, Landroid/view/View;->getLeft()I

    .line 33
    move-result v5

    .line 34
    int-to-float v5, v5

    .line 35
    .line 36
    cmpg-float v5, v5, p1

    .line 37
    .line 38
    if-gez v5, :cond_1

    .line 39
    .line 40
    .line 41
    invoke-virtual {v3}, Landroid/view/View;->getRight()I

    .line 42
    move-result v3

    .line 43
    int-to-float v3, v3

    .line 44
    .line 45
    cmpl-float v3, v3, p1

    .line 46
    .line 47
    if-lez v3, :cond_1

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->getSelectedItem()I

    .line 51
    move-result v3

    .line 52
    .line 53
    if-eq v3, v2, :cond_1

    .line 54
    .line 55
    iget-object p1, p0, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->animator:Landroidx/dynamicanimation/animation/SpringAnimation;

    .line 56
    int-to-float v0, v2

    .line 57
    .line 58
    const/high16 v1, 0x447a0000    # 1000.0f

    .line 59
    mul-float/2addr v0, v1

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1, v0}, Landroidx/dynamicanimation/animation/SpringAnimation;->animateToFinalPosition(F)V

    .line 63
    const/4 p1, 0x1

    .line 64
    return p1

    .line 65
    :cond_1
    move v2, v4

    .line 66
    goto :goto_0

    .line 67
    :cond_2
    return v1
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


# virtual methods
.method public final getItemPadding()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->itemPadding:I

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
.end method

.method public final getOnItemSelected()Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView$OnItemSelected;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->onItemSelected:Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView$OnItemSelected;

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

.method public final getSelectedItem()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->selected:F

    .line 3
    float-to-int v0, v0

    .line 4
    return v0
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

.method public onDown(Landroid/view/MotionEvent;)Z
    .locals 1
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    check-cast p1, Landroid/view/ViewGroup;

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    :goto_0
    const/4 v0, 0x1

    .line 14
    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->requestDisallowInterceptTouchEvent(Z)V

    .line 19
    :cond_1
    return v0
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 11
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->onDraw(Landroid/graphics/Canvas;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->getSelectedItem()I

    .line 7
    move-result v0

    .line 8
    const/4 v1, -0x1

    .line 9
    .line 10
    if-le v0, v1, :cond_f

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->getSelectedItem()I

    .line 14
    move-result v0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 18
    move-result v1

    .line 19
    .line 20
    if-ge v0, v1, :cond_f

    .line 21
    .line 22
    .line 23
    invoke-static {}, Lcom/google/android/material/animation/ArgbEvaluatorCompat;->getInstance()Lcom/google/android/material/animation/ArgbEvaluatorCompat;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    iget v1, p0, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->selected:F

    .line 27
    float-to-int v1, v1

    .line 28
    .line 29
    .line 30
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    move-result-object v2

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 35
    move-result v3

    .line 36
    const/4 v4, 0x0

    .line 37
    .line 38
    if-ge v1, v3, :cond_0

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    move-object v2, v4

    .line 41
    .line 42
    :goto_0
    if-eqz v2, :cond_1

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 46
    move-result v1

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 50
    move-result-object v1

    .line 51
    goto :goto_1

    .line 52
    :cond_1
    move-object v1, v4

    .line 53
    .line 54
    :goto_1
    iget v2, p0, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->selected:F

    .line 55
    float-to-double v2, v2

    .line 56
    .line 57
    .line 58
    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    .line 59
    move-result-wide v2

    .line 60
    double-to-float v2, v2

    .line 61
    float-to-int v2, v2

    .line 62
    .line 63
    .line 64
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 65
    move-result-object v3

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 69
    move-result v5

    .line 70
    .line 71
    if-ge v2, v5, :cond_2

    .line 72
    goto :goto_2

    .line 73
    :cond_2
    move-object v3, v4

    .line 74
    .line 75
    :goto_2
    if-eqz v3, :cond_3

    .line 76
    .line 77
    .line 78
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 79
    move-result v2

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 83
    move-result-object v2

    .line 84
    goto :goto_3

    .line 85
    :cond_3
    move-object v2, v4

    .line 86
    .line 87
    :goto_3
    iget v3, p0, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->selected:F

    .line 88
    const/4 v5, 0x1

    .line 89
    int-to-float v5, v5

    .line 90
    rem-float/2addr v3, v5

    .line 91
    .line 92
    if-eqz v1, :cond_7

    .line 93
    .line 94
    if-eqz v2, :cond_7

    .line 95
    .line 96
    .line 97
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 98
    move-result v5

    .line 99
    .line 100
    if-nez v5, :cond_7

    .line 101
    .line 102
    .line 103
    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    .line 104
    move-result v5

    .line 105
    int-to-float v5, v5

    .line 106
    .line 107
    .line 108
    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    .line 109
    move-result v6

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    .line 113
    move-result v7

    .line 114
    sub-int/2addr v6, v7

    .line 115
    int-to-float v6, v6

    .line 116
    mul-float/2addr v6, v3

    .line 117
    add-float/2addr v6, v5

    .line 118
    .line 119
    .line 120
    invoke-virtual {v1}, Landroid/view/View;->getRight()I

    .line 121
    move-result v5

    .line 122
    int-to-float v5, v5

    .line 123
    .line 124
    .line 125
    invoke-virtual {v2}, Landroid/view/View;->getRight()I

    .line 126
    move-result v7

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1}, Landroid/view/View;->getRight()I

    .line 130
    move-result v8

    .line 131
    sub-int/2addr v7, v8

    .line 132
    int-to-float v7, v7

    .line 133
    mul-float/2addr v7, v3

    .line 134
    add-float/2addr v7, v5

    .line 135
    .line 136
    iget-object v5, p0, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->selectedItemBackground:Lcom/google/android/material/shape/MaterialShapeDrawable;

    .line 137
    float-to-int v6, v6

    .line 138
    .line 139
    .line 140
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 141
    move-result v8

    .line 142
    float-to-int v7, v7

    .line 143
    .line 144
    .line 145
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 146
    move-result v9

    .line 147
    .line 148
    .line 149
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 150
    move-result v10

    .line 151
    sub-int/2addr v9, v10

    .line 152
    .line 153
    .line 154
    invoke-virtual {v5, v6, v8, v7, v9}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 155
    .line 156
    instance-of v5, v1, Landroid/widget/TextView;

    .line 157
    .line 158
    if-eqz v5, :cond_4

    .line 159
    .line 160
    check-cast v1, Landroid/widget/TextView;

    .line 161
    goto :goto_4

    .line 162
    :cond_4
    move-object v1, v4

    .line 163
    .line 164
    :goto_4
    if-eqz v1, :cond_5

    .line 165
    .line 166
    iget v5, p0, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->selectedTextColor:I

    .line 167
    .line 168
    .line 169
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 170
    move-result-object v5

    .line 171
    .line 172
    iget v6, p0, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->textColor:I

    .line 173
    .line 174
    .line 175
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 176
    move-result-object v6

    .line 177
    .line 178
    .line 179
    invoke-virtual {v0, v3, v5, v6}, Lcom/google/android/material/animation/ArgbEvaluatorCompat;->evaluate(FLjava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/Integer;

    .line 180
    move-result-object v5

    .line 181
    .line 182
    .line 183
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 184
    move-result v5

    .line 185
    .line 186
    .line 187
    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 188
    .line 189
    :cond_5
    instance-of v1, v2, Landroid/widget/TextView;

    .line 190
    .line 191
    if-eqz v1, :cond_6

    .line 192
    move-object v4, v2

    .line 193
    .line 194
    check-cast v4, Landroid/widget/TextView;

    .line 195
    .line 196
    :cond_6
    if-eqz v4, :cond_e

    .line 197
    .line 198
    iget v1, p0, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->textColor:I

    .line 199
    .line 200
    .line 201
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 202
    move-result-object v1

    .line 203
    .line 204
    iget v2, p0, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->selectedTextColor:I

    .line 205
    .line 206
    .line 207
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 208
    move-result-object v2

    .line 209
    .line 210
    .line 211
    invoke-virtual {v0, v3, v1, v2}, Lcom/google/android/material/animation/ArgbEvaluatorCompat;->evaluate(FLjava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/Integer;

    .line 212
    move-result-object v0

    .line 213
    .line 214
    .line 215
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 216
    move-result v0

    .line 217
    .line 218
    .line 219
    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 220
    goto :goto_7

    .line 221
    .line 222
    :cond_7
    instance-of v0, v1, Landroid/widget/TextView;

    .line 223
    .line 224
    if-eqz v0, :cond_8

    .line 225
    move-object v4, v1

    .line 226
    .line 227
    check-cast v4, Landroid/widget/TextView;

    .line 228
    .line 229
    :cond_8
    if-eqz v4, :cond_9

    .line 230
    .line 231
    iget v0, p0, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->selectedTextColor:I

    .line 232
    .line 233
    .line 234
    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 235
    :cond_9
    const/4 v0, 0x0

    .line 236
    .line 237
    if-eqz v1, :cond_a

    .line 238
    .line 239
    .line 240
    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    .line 241
    move-result v3

    .line 242
    goto :goto_5

    .line 243
    .line 244
    :cond_a
    if-eqz v2, :cond_b

    .line 245
    .line 246
    .line 247
    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    .line 248
    move-result v3

    .line 249
    goto :goto_5

    .line 250
    :cond_b
    move v3, v0

    .line 251
    .line 252
    :goto_5
    if-eqz v1, :cond_c

    .line 253
    .line 254
    .line 255
    invoke-virtual {v1}, Landroid/view/View;->getRight()I

    .line 256
    move-result v0

    .line 257
    goto :goto_6

    .line 258
    .line 259
    :cond_c
    if-eqz v2, :cond_d

    .line 260
    .line 261
    .line 262
    invoke-virtual {v2}, Landroid/view/View;->getRight()I

    .line 263
    move-result v0

    .line 264
    .line 265
    :cond_d
    :goto_6
    iget-object v1, p0, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->selectedItemBackground:Lcom/google/android/material/shape/MaterialShapeDrawable;

    .line 266
    .line 267
    .line 268
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 269
    move-result v2

    .line 270
    .line 271
    .line 272
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 273
    move-result v4

    .line 274
    .line 275
    .line 276
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 277
    move-result v5

    .line 278
    sub-int/2addr v4, v5

    .line 279
    .line 280
    .line 281
    invoke-virtual {v1, v3, v2, v0, v4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 282
    .line 283
    .line 284
    :cond_e
    :goto_7
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 285
    .line 286
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->selectedItemBackground:Lcom/google/android/material/shape/MaterialShapeDrawable;

    .line 287
    .line 288
    .line 289
    invoke-virtual {v0, p1}, Lcom/google/android/material/shape/MaterialShapeDrawable;->draw(Landroid/graphics/Canvas;)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 293
    :cond_f
    return-void
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
.end method

.method public onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 0
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Landroid/view/MotionEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
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
.end method

.method public onLongPress(Landroid/view/MotionEvent;)V
    .locals 0
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

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
.end method

.method public onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 4
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Landroid/view/MotionEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    iget-boolean p3, p0, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->isScrolling:Z

    .line 3
    const/4 p4, 0x1

    .line 4
    .line 5
    if-nez p3, :cond_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->getSelectedItem()I

    .line 9
    move-result p3

    .line 10
    .line 11
    iput p3, p0, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->saveCurrentSelected:I

    .line 12
    .line 13
    iput-boolean p4, p0, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->isScrolling:Z

    .line 14
    :cond_0
    const/4 p3, 0x0

    .line 15
    .line 16
    if-nez p1, :cond_1

    .line 17
    return p3

    .line 18
    .line 19
    .line 20
    :cond_1
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    .line 21
    move-result p2

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 25
    move-result v0

    .line 26
    sub-float/2addr p2, v0

    .line 27
    .line 28
    iget v0, p0, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->saveCurrentSelected:I

    .line 29
    const/4 v1, 0x0

    .line 30
    .line 31
    if-nez v0, :cond_2

    .line 32
    .line 33
    cmpg-float v2, p2, v1

    .line 34
    .line 35
    if-gez v2, :cond_2

    .line 36
    return p3

    .line 37
    .line 38
    .line 39
    :cond_2
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 40
    move-result v2

    .line 41
    sub-int/2addr v2, p4

    .line 42
    .line 43
    if-ne v0, v2, :cond_3

    .line 44
    .line 45
    cmpl-float v0, p2, v1

    .line 46
    .line 47
    if-lez v0, :cond_3

    .line 48
    return p3

    .line 49
    .line 50
    :cond_3
    iget v0, p0, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->saveCurrentSelected:I

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 54
    move-result-object v0

    .line 55
    .line 56
    if-nez v0, :cond_4

    .line 57
    return p3

    .line 58
    .line 59
    .line 60
    :cond_4
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 61
    move-result v2

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    .line 65
    move-result v3

    .line 66
    int-to-float v3, v3

    .line 67
    .line 68
    cmpg-float v2, v2, v3

    .line 69
    .line 70
    if-ltz v2, :cond_6

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 74
    move-result p1

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    .line 78
    move-result v0

    .line 79
    int-to-float v0, v0

    .line 80
    .line 81
    cmpl-float p1, p1, v0

    .line 82
    .line 83
    if-lez p1, :cond_5

    .line 84
    goto :goto_0

    .line 85
    .line 86
    .line 87
    :cond_5
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 88
    move-result p1

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0}, Landroid/view/View;->getPaddingStart()I

    .line 92
    move-result p3

    .line 93
    sub-int/2addr p1, p3

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0}, Landroid/view/View;->getPaddingEnd()I

    .line 97
    move-result p3

    .line 98
    sub-int/2addr p1, p3

    .line 99
    int-to-float p1, p1

    .line 100
    div-float/2addr p2, p1

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 104
    move-result p1

    .line 105
    int-to-float p1, p1

    .line 106
    mul-float/2addr p2, p1

    .line 107
    .line 108
    iget p1, p0, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->saveCurrentSelected:I

    .line 109
    int-to-float p1, p1

    .line 110
    add-float/2addr p1, p2

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 114
    move-result p2

    .line 115
    sub-int/2addr p2, p4

    .line 116
    int-to-float p2, p2

    .line 117
    .line 118
    .line 119
    invoke-static {p1, v1, p2}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    .line 120
    move-result p1

    .line 121
    .line 122
    iput p1, p0, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->selected:F

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 126
    return p4

    .line 127
    :cond_6
    :goto_0
    return p3
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
.end method

.method public onShowPress(Landroid/view/MotionEvent;)V
    .locals 0
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

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
.end method

.method public onSingleTapUp(Landroid/view/MotionEvent;)Z
    .locals 0
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 4
    move-result p1

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1}, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->performTapSelection(F)Z

    .line 8
    move-result p1

    .line 9
    return p1
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

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 5
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClickableViewAccessibility"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    .line 7
    if-ne v0, v1, :cond_1

    .line 8
    .line 9
    iget-boolean v0, p0, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->isScrolling:Z

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    const/4 v0, 0x0

    .line 13
    .line 14
    iput-boolean v0, p0, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->isScrolling:Z

    .line 15
    .line 16
    iget v2, p0, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->selected:F

    .line 17
    .line 18
    .line 19
    invoke-static {v2}, Lkotlin/math/MathKt;->roundToInt(F)I

    .line 20
    move-result v2

    .line 21
    int-to-float v2, v2

    .line 22
    .line 23
    iput v2, p0, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->selected:F

    .line 24
    .line 25
    iget-object v2, p0, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->animator:Landroidx/dynamicanimation/animation/SpringAnimation;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->getSelectedItem()I

    .line 29
    move-result v3

    .line 30
    int-to-float v3, v3

    .line 31
    .line 32
    const/high16 v4, 0x447a0000    # 1000.0f

    .line 33
    mul-float/2addr v3, v4

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2, v3}, Landroidx/dynamicanimation/animation/SpringAnimation;->animateToFinalPosition(F)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 40
    move-result-object v2

    .line 41
    .line 42
    instance-of v3, v2, Landroid/view/ViewGroup;

    .line 43
    .line 44
    if-eqz v3, :cond_0

    .line 45
    .line 46
    check-cast v2, Landroid/view/ViewGroup;

    .line 47
    goto :goto_0

    .line 48
    :cond_0
    const/4 v2, 0x0

    .line 49
    .line 50
    :goto_0
    if-eqz v2, :cond_1

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->requestDisallowInterceptTouchEvent(Z)V

    .line 54
    .line 55
    :cond_1
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->gestureDetector:Landroidx/core/view/GestureDetectorCompat;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, p1}, Landroidx/core/view/GestureDetectorCompat;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 59
    move-result v0

    .line 60
    .line 61
    if-eqz v0, :cond_2

    .line 62
    return v1

    .line 63
    .line 64
    .line 65
    :cond_2
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 66
    move-result p1

    .line 67
    return p1
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

.method public final setItemPadding(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->itemPadding:I

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
.end method

.method public final setItems(Ljava/util/List;I)V
    .locals 17
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;I)V"
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    iget-object v1, v0, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->segments:Ljava/util/List;

    .line 5
    .line 6
    move-object/from16 v2, p1

    .line 7
    .line 8
    .line 9
    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 10
    move-result v1

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    return-void

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 17
    .line 18
    new-instance v1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 19
    const/4 v3, -0x2

    .line 20
    .line 21
    .line 22
    invoke-direct {v1, v3, v3}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    .line 23
    .line 24
    const/16 v3, 0x10

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 28
    .line 29
    .line 30
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 31
    move-result-object v3

    .line 32
    const/4 v4, 0x0

    .line 33
    move v5, v4

    .line 34
    .line 35
    .line 36
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    move-result v6

    .line 38
    .line 39
    if-eqz v6, :cond_2

    .line 40
    .line 41
    .line 42
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    move-result-object v6

    .line 44
    .line 45
    add-int/lit8 v7, v5, 0x1

    .line 46
    .line 47
    if-gez v5, :cond_1

    .line 48
    .line 49
    .line 50
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    .line 51
    .line 52
    :cond_1
    check-cast v6, Ljava/lang/String;

    .line 53
    .line 54
    new-instance v8, Lcom/sumsub/sns/core/widget/SNSTextView;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 58
    move-result-object v9

    .line 59
    .line 60
    const/16 v15, 0x3e

    .line 61
    .line 62
    const/16 v16, 0x0

    .line 63
    const/4 v10, 0x0

    .line 64
    const/4 v11, 0x0

    .line 65
    const/4 v12, 0x0

    .line 66
    const/4 v13, 0x0

    .line 67
    const/4 v14, 0x0

    .line 68
    .line 69
    .line 70
    invoke-direct/range {v8 .. v16}, Lcom/sumsub/sns/core/widget/SNSTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILcom/sumsub/sns/core/theme/SNSTypographyElement;Lcom/sumsub/sns/core/theme/SNSColorElement;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v8, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 74
    .line 75
    iget v5, v0, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->textAppearance:I

    .line 76
    .line 77
    .line 78
    invoke-static {v8, v5}, Landroidx/core/widget/TextViewCompat;->setTextAppearance(Landroid/widget/TextView;I)V

    .line 79
    .line 80
    iget v5, v0, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->textColor:I

    .line 81
    .line 82
    .line 83
    invoke-virtual {v8, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 84
    .line 85
    iget v5, v0, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->itemPadding:I

    .line 86
    .line 87
    .line 88
    invoke-virtual {v8, v5, v4, v5, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, v8, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 92
    move v5, v7

    .line 93
    goto :goto_0

    .line 94
    .line 95
    :cond_2
    iget-object v1, v0, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->animator:Landroidx/dynamicanimation/animation/SpringAnimation;

    .line 96
    .line 97
    .line 98
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->getLastIndex(Ljava/util/List;)I

    .line 99
    move-result v2

    .line 100
    int-to-float v2, v2

    .line 101
    .line 102
    const/high16 v3, 0x447a0000    # 1000.0f

    .line 103
    mul-float/2addr v2, v3

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1, v2}, Landroidx/dynamicanimation/animation/DynamicAnimation;->setMaxValue(F)Landroidx/dynamicanimation/animation/DynamicAnimation;

    .line 107
    .line 108
    move/from16 v1, p2

    .line 109
    int-to-float v1, v1

    .line 110
    .line 111
    iput v1, v0, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->selected:F

    .line 112
    return-void
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

.method public final setOnItemSelected(Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView$OnItemSelected;)V
    .locals 0
    .param p1    # Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView$OnItemSelected;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->onItemSelected:Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView$OnItemSelected;

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
.end method

.method public final setSelectedItem(I)V
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->selected:F

    .line 3
    float-to-int v0, v0

    .line 4
    .line 5
    if-eq p1, v0, :cond_0

    .line 6
    .line 7
    if-ltz p1, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 11
    move-result v0

    .line 12
    .line 13
    if-ge p1, v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;->animator:Landroidx/dynamicanimation/animation/SpringAnimation;

    .line 16
    int-to-float p1, p1

    .line 17
    .line 18
    const/high16 v1, 0x447a0000    # 1000.0f

    .line 19
    mul-float/2addr p1, v1

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p1}, Landroidx/dynamicanimation/animation/SpringAnimation;->animateToFinalPosition(F)V

    .line 23
    :cond_0
    return-void
    .line 24
    .line 25
.end method
