.class public Lcom/opensource/svgaplayer/SVGAImageView;
.super Landroid/widget/ImageView;
.source "SVGAImageView.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/opensource/svgaplayer/SVGAImageView$FillMode;,
        Lcom/opensource/svgaplayer/SVGAImageView$a;,
        Lcom/opensource/svgaplayer/SVGAImageView$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00a8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u001c\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0016\u0018\u00002\u00020\u0001:\u0003xEyB\'\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\u00132\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u0011H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J!\u0010\u001e\u001a\u00020\n2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008 \u0010!J\u0011\u0010#\u001a\u0004\u0018\u00010\"H\u0002\u00a2\u0006\u0004\u0008#\u0010$J\u000f\u0010&\u001a\u00020%H\u0002\u00a2\u0006\u0004\u0008&\u0010\'J\u0019\u0010*\u001a\u00020\n2\u0008\u0010)\u001a\u0004\u0018\u00010(H\u0002\u00a2\u0006\u0004\u0008*\u0010+J\u0019\u0010.\u001a\u00020\n2\u0008\u0010-\u001a\u0004\u0018\u00010,H\u0002\u00a2\u0006\u0004\u0008.\u0010/J\r\u00100\u001a\u00020\n\u00a2\u0006\u0004\u00080\u0010!J!\u00101\u001a\u00020\n2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0008\u0008\u0002\u0010\u001d\u001a\u00020\u001c\u00a2\u0006\u0004\u00081\u0010\u001fJ\r\u00102\u001a\u00020\n\u00a2\u0006\u0004\u00082\u0010!J\r\u00103\u001a\u00020\n\u00a2\u0006\u0004\u00083\u0010!J\u0015\u00105\u001a\u00020\n2\u0006\u00104\u001a\u00020\u001c\u00a2\u0006\u0004\u00085\u00106J\u0017\u00107\u001a\u00020\n2\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\u0004\u00087\u0010\u0019J!\u0010:\u001a\u00020\n2\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0008\u00109\u001a\u0004\u0018\u000108\u00a2\u0006\u0004\u0008:\u0010;J\u0015\u0010>\u001a\u00020\n2\u0006\u0010=\u001a\u00020<\u00a2\u0006\u0004\u0008>\u0010?J\u0019\u0010B\u001a\u00020\u001c2\u0008\u0010A\u001a\u0004\u0018\u00010@H\u0017\u00a2\u0006\u0004\u0008B\u0010CJ\u000f\u0010D\u001a\u00020\nH\u0014\u00a2\u0006\u0004\u0008D\u0010!R\u0014\u0010G\u001a\u00020\r8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008E\u0010FR$\u0010K\u001a\u00020\u001c2\u0006\u0010H\u001a\u00020\u001c8\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008I\u0010J\u001a\u0004\u0008K\u0010LR\"\u0010S\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008M\u0010N\u001a\u0004\u0008O\u0010P\"\u0004\u0008Q\u0010RR(\u0010X\u001a\u00020\u001c8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0018\n\u0004\u0008T\u0010J\u0012\u0004\u0008W\u0010!\u001a\u0004\u0008U\u0010L\"\u0004\u0008V\u00106R\"\u0010\\\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008Y\u0010J\u001a\u0004\u0008Z\u0010L\"\u0004\u0008[\u00106R\"\u0010d\u001a\u00020]8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008^\u0010_\u001a\u0004\u0008`\u0010a\"\u0004\u0008b\u0010cR$\u0010k\u001a\u0004\u0018\u00010e8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u00082\u0010f\u001a\u0004\u0008g\u0010h\"\u0004\u0008i\u0010jR\u0018\u0010m\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010lR\u0016\u0010n\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008&\u0010JR\u0016\u0010o\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010JR\u0014\u0010r\u001a\u00020p8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008.\u0010qR\u0014\u0010u\u001a\u00020s8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008*\u0010tR\u0016\u0010v\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010NR\u0016\u0010w\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010N\u00a8\u0006z"
    }
    d2 = {
        "Lcom/opensource/svgaplayer/SVGAImageView;",
        "Landroid/widget/ImageView;",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attrs",
        "",
        "defStyleAttr",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "",
        "k",
        "(Landroid/util/AttributeSet;)V",
        "",
        "source",
        "n",
        "(Ljava/lang/String;)V",
        "Ljava/lang/ref/WeakReference;",
        "ref",
        "Lcom/opensource/svgaplayer/SVGAParser$b;",
        "i",
        "(Ljava/lang/ref/WeakReference;)Lcom/opensource/svgaplayer/SVGAParser$b;",
        "Lcom/opensource/svgaplayer/SVGAVideoEntity;",
        "videoItem",
        "s",
        "(Lcom/opensource/svgaplayer/SVGAVideoEntity;)V",
        "Lj90/c;",
        "range",
        "",
        "reverse",
        "o",
        "(Lj90/c;Z)V",
        "q",
        "()V",
        "Lcom/opensource/svgaplayer/d;",
        "getSVGADrawable",
        "()Lcom/opensource/svgaplayer/d;",
        "",
        "j",
        "()D",
        "Landroid/animation/ValueAnimator;",
        "animator",
        "m",
        "(Landroid/animation/ValueAnimator;)V",
        "Landroid/animation/Animator;",
        "animation",
        "l",
        "(Landroid/animation/Animator;)V",
        "r",
        "t",
        "h",
        "u",
        "clear",
        "v",
        "(Z)V",
        "setVideoItem",
        "Lcom/opensource/svgaplayer/e;",
        "dynamicItem",
        "p",
        "(Lcom/opensource/svgaplayer/SVGAVideoEntity;Lcom/opensource/svgaplayer/e;)V",
        "Lcom/opensource/svgaplayer/c;",
        "clickListener",
        "setOnAnimKeyClickListener",
        "(Lcom/opensource/svgaplayer/c;)V",
        "Landroid/view/MotionEvent;",
        "event",
        "onTouchEvent",
        "(Landroid/view/MotionEvent;)Z",
        "onDetachedFromWindow",
        "b",
        "Ljava/lang/String;",
        "TAG",
        "<set-?>",
        "c",
        "Z",
        "isAnimating",
        "()Z",
        "d",
        "I",
        "getLoops",
        "()I",
        "setLoops",
        "(I)V",
        "loops",
        "e",
        "getClearsAfterStop",
        "setClearsAfterStop",
        "clearsAfterStop$annotations",
        "clearsAfterStop",
        "f",
        "getClearsAfterDetached",
        "setClearsAfterDetached",
        "clearsAfterDetached",
        "Lcom/opensource/svgaplayer/SVGAImageView$FillMode;",
        "g",
        "Lcom/opensource/svgaplayer/SVGAImageView$FillMode;",
        "getFillMode",
        "()Lcom/opensource/svgaplayer/SVGAImageView$FillMode;",
        "setFillMode",
        "(Lcom/opensource/svgaplayer/SVGAImageView$FillMode;)V",
        "fillMode",
        "Lcom/opensource/svgaplayer/b;",
        "Lcom/opensource/svgaplayer/b;",
        "getCallback",
        "()Lcom/opensource/svgaplayer/b;",
        "setCallback",
        "(Lcom/opensource/svgaplayer/b;)V",
        "callback",
        "Landroid/animation/ValueAnimator;",
        "mAnimator",
        "mAntiAlias",
        "mAutoPlay",
        "Lcom/opensource/svgaplayer/SVGAImageView$a;",
        "Lcom/opensource/svgaplayer/SVGAImageView$a;",
        "mAnimatorListener",
        "Lcom/opensource/svgaplayer/SVGAImageView$b;",
        "Lcom/opensource/svgaplayer/SVGAImageView$b;",
        "mAnimatorUpdateListener",
        "mStartFrame",
        "mEndFrame",
        "a",
        "FillMode",
        "com.opensource.svgaplayer"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# instance fields
.field public final b:Ljava/lang/String;

.field public c:Z

.field public d:I

.field public e:Z

.field public f:Z

.field public g:Lcom/opensource/svgaplayer/SVGAImageView$FillMode;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public h:Lcom/opensource/svgaplayer/b;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public i:Landroid/animation/ValueAnimator;

.field public j:Z

.field public k:Z

.field public final l:Lcom/opensource/svgaplayer/SVGAImageView$a;

.field public final m:Lcom/opensource/svgaplayer/SVGAImageView$b;

.field public n:I

.field public o:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 6
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 1
    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/opensource/svgaplayer/SVGAImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 6
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

    .line 2
    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, Lcom/opensource/svgaplayer/SVGAImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
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

    .line 4
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 5
    const-string p1, "SVGAImageView"

    iput-object p1, p0, Lcom/opensource/svgaplayer/SVGAImageView;->b:Ljava/lang/String;

    .line 6
    sget-object p1, Lcom/opensource/svgaplayer/SVGAImageView$FillMode;->Forward:Lcom/opensource/svgaplayer/SVGAImageView$FillMode;

    iput-object p1, p0, Lcom/opensource/svgaplayer/SVGAImageView;->g:Lcom/opensource/svgaplayer/SVGAImageView$FillMode;

    const/4 p1, 0x1

    .line 7
    iput-boolean p1, p0, Lcom/opensource/svgaplayer/SVGAImageView;->j:Z

    .line 8
    iput-boolean p1, p0, Lcom/opensource/svgaplayer/SVGAImageView;->k:Z

    .line 9
    new-instance p1, Lcom/opensource/svgaplayer/SVGAImageView$a;

    invoke-direct {p1, p0}, Lcom/opensource/svgaplayer/SVGAImageView$a;-><init>(Lcom/opensource/svgaplayer/SVGAImageView;)V

    iput-object p1, p0, Lcom/opensource/svgaplayer/SVGAImageView;->l:Lcom/opensource/svgaplayer/SVGAImageView$a;

    .line 10
    new-instance p1, Lcom/opensource/svgaplayer/SVGAImageView$b;

    invoke-direct {p1, p0}, Lcom/opensource/svgaplayer/SVGAImageView$b;-><init>(Lcom/opensource/svgaplayer/SVGAImageView;)V

    iput-object p1, p0, Lcom/opensource/svgaplayer/SVGAImageView;->m:Lcom/opensource/svgaplayer/SVGAImageView$b;

    if-eqz p2, :cond_0

    .line 11
    invoke-virtual {p0, p2}, Lcom/opensource/svgaplayer/SVGAImageView;->k(Landroid/util/AttributeSet;)V

    :cond_0
    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 3
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/opensource/svgaplayer/SVGAImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static final synthetic a(Lcom/opensource/svgaplayer/SVGAImageView;)Z
    .locals 0

    .line 1
    .line 2
    iget-boolean p0, p0, Lcom/opensource/svgaplayer/SVGAImageView;->j:Z

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

.method public static final synthetic b(Lcom/opensource/svgaplayer/SVGAImageView;)Z
    .locals 0

    .line 1
    .line 2
    iget-boolean p0, p0, Lcom/opensource/svgaplayer/SVGAImageView;->k:Z

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

.method public static final synthetic c(Lcom/opensource/svgaplayer/SVGAImageView;)Lcom/opensource/svgaplayer/d;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/opensource/svgaplayer/SVGAImageView;->getSVGADrawable()Lcom/opensource/svgaplayer/d;

    .line 4
    move-result-object p0

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
.end method

.method public static final synthetic d(Lcom/opensource/svgaplayer/SVGAImageView;Landroid/animation/Animator;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/opensource/svgaplayer/SVGAImageView;->l(Landroid/animation/Animator;)V

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
.end method

.method public static final synthetic e(Lcom/opensource/svgaplayer/SVGAImageView;Landroid/animation/ValueAnimator;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/opensource/svgaplayer/SVGAImageView;->m(Landroid/animation/ValueAnimator;)V

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
.end method

.method public static final synthetic f(Lcom/opensource/svgaplayer/SVGAImageView;Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/opensource/svgaplayer/SVGAImageView;->c:Z

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

.method public static final synthetic g(Lcom/opensource/svgaplayer/SVGAImageView;Lcom/opensource/svgaplayer/SVGAVideoEntity;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/opensource/svgaplayer/SVGAImageView;->s(Lcom/opensource/svgaplayer/SVGAVideoEntity;)V

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
.end method

.method private final getSVGADrawable()Lcom/opensource/svgaplayer/d;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    instance-of v1, v0, Lcom/opensource/svgaplayer/d;

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    const/4 v0, 0x0

    .line 10
    .line 11
    :cond_0
    check-cast v0, Lcom/opensource/svgaplayer/d;

    .line 12
    return-object v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method


# virtual methods
.method public final getCallback()Lcom/opensource/svgaplayer/b;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/opensource/svgaplayer/SVGAImageView;->h:Lcom/opensource/svgaplayer/b;

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

.method public final getClearsAfterDetached()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/opensource/svgaplayer/SVGAImageView;->f:Z

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

.method public final getClearsAfterStop()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/opensource/svgaplayer/SVGAImageView;->e:Z

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

.method public final getFillMode()Lcom/opensource/svgaplayer/SVGAImageView$FillMode;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/opensource/svgaplayer/SVGAImageView;->g:Lcom/opensource/svgaplayer/SVGAImageView$FillMode;

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

.method public final getLoops()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/opensource/svgaplayer/SVGAImageView;->d:I

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

.method public final h()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/opensource/svgaplayer/SVGAImageView;->getSVGADrawable()Lcom/opensource/svgaplayer/d;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    const/4 v1, 0x1

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lcom/opensource/svgaplayer/d;->e(Z)V

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-direct {p0}, Lcom/opensource/svgaplayer/SVGAImageView;->getSVGADrawable()Lcom/opensource/svgaplayer/d;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/opensource/svgaplayer/d;->a()V

    .line 20
    :cond_1
    const/4 v0, 0x0

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 24
    return-void
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

.method public final i(Ljava/lang/ref/WeakReference;)Lcom/opensource/svgaplayer/SVGAParser$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/opensource/svgaplayer/SVGAImageView;",
            ">;)",
            "Lcom/opensource/svgaplayer/SVGAParser$b;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/opensource/svgaplayer/SVGAImageView$c;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p1}, Lcom/opensource/svgaplayer/SVGAImageView$c;-><init>(Ljava/lang/ref/WeakReference;)V

    .line 6
    return-object v0
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

.method public final j()D
    .locals 7

    .line 1
    .line 2
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 3
    .line 4
    :try_start_0
    const-string v2, "android.animation.ValueAnimator"

    .line 5
    .line 6
    .line 7
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 8
    move-result-object v2

    .line 9
    .line 10
    const-string v3, "getDurationScale"

    .line 11
    const/4 v4, 0x0

    .line 12
    .line 13
    new-array v5, v4, [Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v2, v3, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 17
    move-result-object v3

    .line 18
    .line 19
    if-eqz v3, :cond_2

    .line 20
    .line 21
    new-array v4, v4, [Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v3, v2, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    move-result-object v3

    .line 26
    .line 27
    if-eqz v3, :cond_1

    .line 28
    .line 29
    check-cast v3, Ljava/lang/Float;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    .line 33
    move-result v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    float-to-double v3, v3

    .line 35
    .line 36
    const-wide/16 v5, 0x0

    .line 37
    .line 38
    cmpg-double v5, v3, v5

    .line 39
    .line 40
    if-nez v5, :cond_0

    .line 41
    .line 42
    .line 43
    :try_start_1
    const-string/jumbo v5, "setDurationScale"

    .line 44
    .line 45
    sget-object v6, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    filled-new-array {v6}, [Ljava/lang/Class;

    .line 49
    move-result-object v6

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2, v5, v6}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 53
    move-result-object v5

    .line 54
    .line 55
    if-eqz v5, :cond_0

    .line 56
    const/4 v6, 0x1

    .line 57
    .line 58
    .line 59
    invoke-virtual {v5, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 60
    .line 61
    const/high16 v6, 0x3f800000    # 1.0f

    .line 62
    .line 63
    .line 64
    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 65
    move-result-object v6

    .line 66
    .line 67
    .line 68
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 69
    move-result-object v6

    .line 70
    .line 71
    .line 72
    invoke-virtual {v5, v2, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 73
    .line 74
    :try_start_2
    sget-object v2, Lk90/c;->a:Lk90/c;

    .line 75
    .line 76
    iget-object v3, p0, Lcom/opensource/svgaplayer/SVGAImageView;->b:Ljava/lang/String;

    .line 77
    .line 78
    const-string v4, "The animation duration scale has been reset to 1.0x, because you closed it on developer options."

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2, v3, v4}, Lk90/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    return-wide v0

    .line 83
    :catch_0
    move-exception v2

    .line 84
    goto :goto_0

    .line 85
    :catch_1
    move-exception v2

    .line 86
    move-wide v0, v3

    .line 87
    goto :goto_0

    .line 88
    :cond_0
    return-wide v3

    .line 89
    .line 90
    :cond_1
    new-instance v2, Lkotlin/TypeCastException;

    .line 91
    .line 92
    .line 93
    const-string/jumbo v3, "null cannot be cast to non-null type kotlin.Float"

    .line 94
    .line 95
    .line 96
    invoke-direct {v2, v3}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    .line 97
    throw v2
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 98
    :cond_2
    return-wide v0

    .line 99
    .line 100
    .line 101
    :goto_0
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 102
    return-wide v0
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
.end method

.method public final k(Landroid/util/AttributeSet;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-string v1, "context"

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    sget-object v1, Lcom/opensource/svgaplayer/R$styleable;->SVGAImageView:[I

    .line 16
    const/4 v2, 0x0

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p1, v1, v2, v2}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 20
    move-result-object p1

    .line 21
    .line 22
    sget v0, Lcom/opensource/svgaplayer/R$styleable;->SVGAImageView_loopCount:I

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 26
    move-result v0

    .line 27
    .line 28
    iput v0, p0, Lcom/opensource/svgaplayer/SVGAImageView;->d:I

    .line 29
    .line 30
    sget v0, Lcom/opensource/svgaplayer/R$styleable;->SVGAImageView_clearsAfterStop:I

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 34
    move-result v0

    .line 35
    .line 36
    iput-boolean v0, p0, Lcom/opensource/svgaplayer/SVGAImageView;->e:Z

    .line 37
    .line 38
    sget v0, Lcom/opensource/svgaplayer/R$styleable;->SVGAImageView_clearsAfterDetached:I

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 42
    move-result v0

    .line 43
    .line 44
    iput-boolean v0, p0, Lcom/opensource/svgaplayer/SVGAImageView;->f:Z

    .line 45
    .line 46
    sget v0, Lcom/opensource/svgaplayer/R$styleable;->SVGAImageView_antiAlias:I

    .line 47
    const/4 v1, 0x1

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 51
    move-result v0

    .line 52
    .line 53
    iput-boolean v0, p0, Lcom/opensource/svgaplayer/SVGAImageView;->j:Z

    .line 54
    .line 55
    sget v0, Lcom/opensource/svgaplayer/R$styleable;->SVGAImageView_autoPlay:I

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 59
    move-result v0

    .line 60
    .line 61
    iput-boolean v0, p0, Lcom/opensource/svgaplayer/SVGAImageView;->k:Z

    .line 62
    .line 63
    sget v0, Lcom/opensource/svgaplayer/R$styleable;->SVGAImageView_fillMode:I

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 67
    move-result-object v0

    .line 68
    .line 69
    if-eqz v0, :cond_0

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 73
    move-result v1

    .line 74
    .line 75
    .line 76
    packed-switch v1, :pswitch_data_0

    .line 77
    goto :goto_0

    .line 78
    .line 79
    :pswitch_0
    const-string v1, "2"

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 83
    move-result v0

    .line 84
    .line 85
    if-eqz v0, :cond_0

    .line 86
    .line 87
    sget-object v0, Lcom/opensource/svgaplayer/SVGAImageView$FillMode;->Clear:Lcom/opensource/svgaplayer/SVGAImageView$FillMode;

    .line 88
    .line 89
    iput-object v0, p0, Lcom/opensource/svgaplayer/SVGAImageView;->g:Lcom/opensource/svgaplayer/SVGAImageView$FillMode;

    .line 90
    goto :goto_0

    .line 91
    .line 92
    :pswitch_1
    const-string v1, "1"

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 96
    move-result v0

    .line 97
    .line 98
    if-eqz v0, :cond_0

    .line 99
    .line 100
    sget-object v0, Lcom/opensource/svgaplayer/SVGAImageView$FillMode;->Forward:Lcom/opensource/svgaplayer/SVGAImageView$FillMode;

    .line 101
    .line 102
    iput-object v0, p0, Lcom/opensource/svgaplayer/SVGAImageView;->g:Lcom/opensource/svgaplayer/SVGAImageView$FillMode;

    .line 103
    goto :goto_0

    .line 104
    .line 105
    :pswitch_2
    const-string v1, "0"

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 109
    move-result v0

    .line 110
    .line 111
    if-eqz v0, :cond_0

    .line 112
    .line 113
    sget-object v0, Lcom/opensource/svgaplayer/SVGAImageView$FillMode;->Backward:Lcom/opensource/svgaplayer/SVGAImageView$FillMode;

    .line 114
    .line 115
    iput-object v0, p0, Lcom/opensource/svgaplayer/SVGAImageView;->g:Lcom/opensource/svgaplayer/SVGAImageView$FillMode;

    .line 116
    .line 117
    :cond_0
    :goto_0
    sget v0, Lcom/opensource/svgaplayer/R$styleable;->SVGAImageView_source:I

    .line 118
    .line 119
    .line 120
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 121
    move-result-object v0

    .line 122
    .line 123
    if-eqz v0, :cond_1

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0, v0}, Lcom/opensource/svgaplayer/SVGAImageView;->n(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    :cond_1
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 130
    return-void

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
    :pswitch_data_0
    .packed-switch 0x30
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method

.method public final l(Landroid/animation/Animator;)V
    .locals 3

    .line 1
    const/4 p1, 0x0

    .line 2
    .line 3
    iput-boolean p1, p0, Lcom/opensource/svgaplayer/SVGAImageView;->c:Z

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/opensource/svgaplayer/SVGAImageView;->u()V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Lcom/opensource/svgaplayer/SVGAImageView;->getSVGADrawable()Lcom/opensource/svgaplayer/d;

    .line 10
    move-result-object p1

    .line 11
    .line 12
    if-eqz p1, :cond_3

    .line 13
    .line 14
    iget-object v0, p0, Lcom/opensource/svgaplayer/SVGAImageView;->g:Lcom/opensource/svgaplayer/SVGAImageView$FillMode;

    .line 15
    .line 16
    sget-object v1, Lcom/opensource/svgaplayer/f;->$EnumSwitchMapping$0:[I

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 20
    move-result v0

    .line 21
    .line 22
    aget v0, v1, v0

    .line 23
    const/4 v1, 0x1

    .line 24
    .line 25
    if-eq v0, v1, :cond_2

    .line 26
    const/4 v2, 0x2

    .line 27
    .line 28
    if-eq v0, v2, :cond_1

    .line 29
    const/4 v2, 0x3

    .line 30
    .line 31
    if-eq v0, v2, :cond_0

    .line 32
    goto :goto_0

    .line 33
    .line 34
    .line 35
    :cond_0
    invoke-virtual {p1, v1}, Lcom/opensource/svgaplayer/d;->e(Z)V

    .line 36
    goto :goto_0

    .line 37
    .line 38
    :cond_1
    iget v0, p0, Lcom/opensource/svgaplayer/SVGAImageView;->o:I

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v0}, Lcom/opensource/svgaplayer/d;->f(I)V

    .line 42
    goto :goto_0

    .line 43
    .line 44
    :cond_2
    iget v0, p0, Lcom/opensource/svgaplayer/SVGAImageView;->n:I

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, v0}, Lcom/opensource/svgaplayer/d;->f(I)V

    .line 48
    .line 49
    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/opensource/svgaplayer/SVGAImageView;->h:Lcom/opensource/svgaplayer/b;

    .line 50
    .line 51
    if-eqz p1, :cond_4

    .line 52
    .line 53
    .line 54
    invoke-interface {p1}, Lcom/opensource/svgaplayer/b;->a()V

    .line 55
    :cond_4
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
.end method

.method public final m(Landroid/animation/ValueAnimator;)V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/opensource/svgaplayer/SVGAImageView;->getSVGADrawable()Lcom/opensource/svgaplayer/d;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 12
    move-result-object p1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    .line 16
    :goto_0
    if-eqz p1, :cond_1

    .line 17
    .line 18
    check-cast p1, Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 22
    move-result p1

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p1}, Lcom/opensource/svgaplayer/d;->f(I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Lcom/opensource/svgaplayer/d;->b()I

    .line 29
    move-result p1

    .line 30
    .line 31
    add-int/lit8 p1, p1, 0x1

    .line 32
    int-to-double v1, p1

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Lcom/opensource/svgaplayer/d;->d()Lcom/opensource/svgaplayer/SVGAVideoEntity;

    .line 36
    move-result-object p1

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Lcom/opensource/svgaplayer/SVGAVideoEntity;->n()I

    .line 40
    move-result p1

    .line 41
    int-to-double v3, p1

    .line 42
    div-double/2addr v1, v3

    .line 43
    .line 44
    iget-object p1, p0, Lcom/opensource/svgaplayer/SVGAImageView;->h:Lcom/opensource/svgaplayer/b;

    .line 45
    .line 46
    if-eqz p1, :cond_2

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Lcom/opensource/svgaplayer/d;->b()I

    .line 50
    move-result v0

    .line 51
    .line 52
    .line 53
    invoke-interface {p1, v0, v1, v2}, Lcom/opensource/svgaplayer/b;->b(ID)V

    .line 54
    return-void

    .line 55
    .line 56
    :cond_1
    new-instance p1, Lkotlin/TypeCastException;

    .line 57
    .line 58
    .line 59
    const-string/jumbo v0, "null cannot be cast to non-null type kotlin.Int"

    .line 60
    .line 61
    .line 62
    invoke-direct {p1, v0}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    .line 63
    throw p1

    .line 64
    :cond_2
    return-void
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

.method public final n(Ljava/lang/String;)V
    .locals 7

    .line 1
    .line 2
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 6
    .line 7
    new-instance v1, Lcom/opensource/svgaplayer/SVGAParser;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 11
    move-result-object v2

    .line 12
    .line 13
    .line 14
    invoke-direct {v1, v2}, Lcom/opensource/svgaplayer/SVGAParser;-><init>(Landroid/content/Context;)V

    .line 15
    .line 16
    const-string v2, "http://"

    .line 17
    const/4 v3, 0x0

    .line 18
    const/4 v4, 0x2

    .line 19
    const/4 v5, 0x0

    .line 20
    .line 21
    .line 22
    invoke-static {p1, v2, v3, v4, v5}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 23
    move-result v2

    .line 24
    .line 25
    if-nez v2, :cond_1

    .line 26
    .line 27
    const-string v2, "https://"

    .line 28
    .line 29
    .line 30
    invoke-static {p1, v2, v3, v4, v5}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 31
    move-result v2

    .line 32
    .line 33
    if-eqz v2, :cond_0

    .line 34
    goto :goto_0

    .line 35
    .line 36
    .line 37
    :cond_0
    invoke-virtual {p0, v0}, Lcom/opensource/svgaplayer/SVGAImageView;->i(Ljava/lang/ref/WeakReference;)Lcom/opensource/svgaplayer/SVGAParser$b;

    .line 38
    move-result-object v3

    .line 39
    const/4 v5, 0x4

    .line 40
    const/4 v6, 0x0

    .line 41
    const/4 v4, 0x0

    .line 42
    move-object v2, p1

    .line 43
    .line 44
    .line 45
    invoke-static/range {v1 .. v6}, Lcom/opensource/svgaplayer/SVGAParser;->p(Lcom/opensource/svgaplayer/SVGAParser;Ljava/lang/String;Lcom/opensource/svgaplayer/SVGAParser$b;Lcom/opensource/svgaplayer/SVGAParser$c;ILjava/lang/Object;)V

    .line 46
    return-void

    .line 47
    .line 48
    :cond_1
    :goto_0
    new-instance v2, Ljava/net/URL;

    .line 49
    .line 50
    .line 51
    invoke-direct {v2, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, v0}, Lcom/opensource/svgaplayer/SVGAImageView;->i(Ljava/lang/ref/WeakReference;)Lcom/opensource/svgaplayer/SVGAParser$b;

    .line 55
    move-result-object v3

    .line 56
    const/4 v5, 0x4

    .line 57
    const/4 v6, 0x0

    .line 58
    const/4 v4, 0x0

    .line 59
    .line 60
    .line 61
    invoke-static/range {v1 .. v6}, Lcom/opensource/svgaplayer/SVGAParser;->u(Lcom/opensource/svgaplayer/SVGAParser;Ljava/net/URL;Lcom/opensource/svgaplayer/SVGAParser$b;Lcom/opensource/svgaplayer/SVGAParser$c;ILjava/lang/Object;)Lkotlin/jvm/functions/Function0;

    .line 62
    return-void
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

.method public final o(Lj90/c;Z)V
    .locals 5

    .line 1
    .line 2
    sget-object p1, Lk90/c;->a:Lk90/c;

    .line 3
    .line 4
    iget-object v0, p0, Lcom/opensource/svgaplayer/SVGAImageView;->b:Ljava/lang/String;

    .line 5
    .line 6
    const-string v1, "================ start animation ================"

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1, v0, v1}, Lk90/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {p0}, Lcom/opensource/svgaplayer/SVGAImageView;->getSVGADrawable()Lcom/opensource/svgaplayer/d;

    .line 13
    move-result-object p1

    .line 14
    .line 15
    if-eqz p1, :cond_2

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/opensource/svgaplayer/SVGAImageView;->q()V

    .line 19
    const/4 v0, 0x0

    .line 20
    .line 21
    .line 22
    invoke-static {v0, v0}, Ljava/lang/Math;->max(II)I

    .line 23
    move-result v0

    .line 24
    .line 25
    iput v0, p0, Lcom/opensource/svgaplayer/SVGAImageView;->n:I

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Lcom/opensource/svgaplayer/d;->d()Lcom/opensource/svgaplayer/SVGAVideoEntity;

    .line 29
    move-result-object p1

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/opensource/svgaplayer/SVGAVideoEntity;->n()I

    .line 33
    move-result v0

    .line 34
    .line 35
    add-int/lit8 v0, v0, -0x1

    .line 36
    .line 37
    .line 38
    const v1, 0x7fffffff

    .line 39
    .line 40
    add-int/lit8 v1, v1, -0x1

    .line 41
    .line 42
    .line 43
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 44
    move-result v0

    .line 45
    .line 46
    iput v0, p0, Lcom/opensource/svgaplayer/SVGAImageView;->o:I

    .line 47
    .line 48
    iget v1, p0, Lcom/opensource/svgaplayer/SVGAImageView;->n:I

    .line 49
    .line 50
    .line 51
    filled-new-array {v1, v0}, [I

    .line 52
    move-result-object v0

    .line 53
    .line 54
    .line 55
    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    .line 56
    move-result-object v0

    .line 57
    .line 58
    const-string v1, "animator"

    .line 59
    .line 60
    .line 61
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    new-instance v1, Landroid/view/animation/LinearInterpolator;

    .line 64
    .line 65
    .line 66
    invoke-direct {v1}, Landroid/view/animation/LinearInterpolator;-><init>()V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 70
    .line 71
    iget v1, p0, Lcom/opensource/svgaplayer/SVGAImageView;->o:I

    .line 72
    .line 73
    iget v2, p0, Lcom/opensource/svgaplayer/SVGAImageView;->n:I

    .line 74
    sub-int/2addr v1, v2

    .line 75
    .line 76
    add-int/lit8 v1, v1, 0x1

    .line 77
    .line 78
    const/16 v2, 0x3e8

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1}, Lcom/opensource/svgaplayer/SVGAVideoEntity;->m()I

    .line 82
    move-result p1

    .line 83
    div-int/2addr v2, p1

    .line 84
    mul-int/2addr v1, v2

    .line 85
    int-to-double v1, v1

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0}, Lcom/opensource/svgaplayer/SVGAImageView;->j()D

    .line 89
    move-result-wide v3

    .line 90
    div-double/2addr v1, v3

    .line 91
    double-to-long v1, v1

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 95
    .line 96
    iget p1, p0, Lcom/opensource/svgaplayer/SVGAImageView;->d:I

    .line 97
    .line 98
    if-gtz p1, :cond_0

    .line 99
    .line 100
    .line 101
    const p1, 0x1869f

    .line 102
    goto :goto_0

    .line 103
    .line 104
    :cond_0
    add-int/lit8 p1, p1, -0x1

    .line 105
    .line 106
    .line 107
    :goto_0
    invoke-virtual {v0, p1}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    .line 108
    .line 109
    iget-object p1, p0, Lcom/opensource/svgaplayer/SVGAImageView;->m:Lcom/opensource/svgaplayer/SVGAImageView$b;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0, p1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 113
    .line 114
    iget-object p1, p0, Lcom/opensource/svgaplayer/SVGAImageView;->l:Lcom/opensource/svgaplayer/SVGAImageView$a;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0, p1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 118
    .line 119
    if-eqz p2, :cond_1

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->reverse()V

    .line 123
    goto :goto_1

    .line 124
    .line 125
    .line 126
    :cond_1
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 127
    .line 128
    :goto_1
    iput-object v0, p0, Lcom/opensource/svgaplayer/SVGAImageView;->i:Landroid/animation/ValueAnimator;

    .line 129
    :cond_2
    return-void
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

.method public onDetachedFromWindow()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Landroid/widget/ImageView;->onDetachedFromWindow()V

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/opensource/svgaplayer/SVGAImageView;->f:Z

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lcom/opensource/svgaplayer/SVGAImageView;->v(Z)V

    .line 9
    .line 10
    iget-boolean v0, p0, Lcom/opensource/svgaplayer/SVGAImageView;->f:Z

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/opensource/svgaplayer/SVGAImageView;->h()V

    .line 16
    :cond_0
    return-void
    .line 17
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClickableViewAccessibility"
        }
    .end annotation

    .line 1
    .line 2
    if-eqz p1, :cond_4

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    goto :goto_1

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-direct {p0}, Lcom/opensource/svgaplayer/SVGAImageView;->getSVGADrawable()Lcom/opensource/svgaplayer/d;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    if-eqz v0, :cond_3

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/opensource/svgaplayer/d;->c()Lcom/opensource/svgaplayer/e;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/opensource/svgaplayer/e;->j()Ljava/util/HashMap;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 31
    move-result-object v0

    .line 32
    .line 33
    .line 34
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    move-result v1

    .line 36
    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    .line 40
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    move-result-object v1

    .line 42
    .line 43
    check-cast v1, Ljava/util/Map$Entry;

    .line 44
    .line 45
    .line 46
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 47
    move-result-object v2

    .line 48
    .line 49
    check-cast v2, Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 53
    move-result-object v1

    .line 54
    .line 55
    check-cast v1, [I

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 59
    move-result v2

    .line 60
    const/4 v3, 0x0

    .line 61
    .line 62
    aget v3, v1, v3

    .line 63
    int-to-float v3, v3

    .line 64
    .line 65
    cmpl-float v2, v2, v3

    .line 66
    .line 67
    if-ltz v2, :cond_1

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 71
    move-result v2

    .line 72
    const/4 v3, 0x2

    .line 73
    .line 74
    aget v3, v1, v3

    .line 75
    int-to-float v3, v3

    .line 76
    .line 77
    cmpg-float v2, v2, v3

    .line 78
    .line 79
    if-gtz v2, :cond_1

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 83
    move-result v2

    .line 84
    const/4 v3, 0x1

    .line 85
    .line 86
    aget v3, v1, v3

    .line 87
    int-to-float v3, v3

    .line 88
    .line 89
    cmpl-float v2, v2, v3

    .line 90
    .line 91
    if-ltz v2, :cond_1

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 95
    const/4 v2, 0x3

    .line 96
    .line 97
    aget v1, v1, v2

    .line 98
    goto :goto_0

    .line 99
    .line 100
    .line 101
    :cond_2
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 102
    move-result p1

    .line 103
    return p1

    .line 104
    .line 105
    .line 106
    :cond_3
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 107
    move-result p1

    .line 108
    return p1

    .line 109
    .line 110
    .line 111
    :cond_4
    :goto_1
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 112
    move-result p1

    .line 113
    return p1
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
.end method

.method public final p(Lcom/opensource/svgaplayer/SVGAVideoEntity;Lcom/opensource/svgaplayer/e;)V
    .locals 1
    .param p1    # Lcom/opensource/svgaplayer/SVGAVideoEntity;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/opensource/svgaplayer/e;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    if-nez p1, :cond_0

    .line 3
    const/4 p1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    new-instance v0, Lcom/opensource/svgaplayer/d;

    .line 10
    .line 11
    if-eqz p2, :cond_1

    .line 12
    goto :goto_0

    .line 13
    .line 14
    :cond_1
    new-instance p2, Lcom/opensource/svgaplayer/e;

    .line 15
    .line 16
    .line 17
    invoke-direct {p2}, Lcom/opensource/svgaplayer/e;-><init>()V

    .line 18
    .line 19
    .line 20
    :goto_0
    invoke-direct {v0, p1, p2}, Lcom/opensource/svgaplayer/d;-><init>(Lcom/opensource/svgaplayer/SVGAVideoEntity;Lcom/opensource/svgaplayer/e;)V

    .line 21
    const/4 p1, 0x1

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p1}, Lcom/opensource/svgaplayer/d;->e(Z)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 28
    return-void
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

.method public final q()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/opensource/svgaplayer/SVGAImageView;->getSVGADrawable()Lcom/opensource/svgaplayer/d;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lcom/opensource/svgaplayer/d;->e(Z)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/widget/ImageView;->getScaleType()Landroid/widget/ImageView$ScaleType;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    .line 17
    const-string/jumbo v2, "scaleType"

    .line 18
    .line 19
    .line 20
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Lcom/opensource/svgaplayer/d;->g(Landroid/widget/ImageView$ScaleType;)V

    .line 24
    :cond_0
    return-void
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

.method public final r()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0, v1}, Lcom/opensource/svgaplayer/SVGAImageView;->t(Lj90/c;Z)V

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
.end method

.method public final s(Lcom/opensource/svgaplayer/SVGAVideoEntity;)V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/opensource/svgaplayer/SVGAImageView$d;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, Lcom/opensource/svgaplayer/SVGAImageView$d;-><init>(Lcom/opensource/svgaplayer/SVGAImageView;Lcom/opensource/svgaplayer/SVGAVideoEntity;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 9
    return-void
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

.method public final setCallback(Lcom/opensource/svgaplayer/b;)V
    .locals 0
    .param p1    # Lcom/opensource/svgaplayer/b;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/opensource/svgaplayer/SVGAImageView;->h:Lcom/opensource/svgaplayer/b;

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

.method public final setClearsAfterDetached(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/opensource/svgaplayer/SVGAImageView;->f:Z

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

.method public final setClearsAfterStop(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/opensource/svgaplayer/SVGAImageView;->e:Z

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

.method public final setFillMode(Lcom/opensource/svgaplayer/SVGAImageView$FillMode;)V
    .locals 0
    .param p1    # Lcom/opensource/svgaplayer/SVGAImageView$FillMode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/opensource/svgaplayer/SVGAImageView;->g:Lcom/opensource/svgaplayer/SVGAImageView$FillMode;

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

.method public final setLoops(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/opensource/svgaplayer/SVGAImageView;->d:I

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

.method public final setOnAnimKeyClickListener(Lcom/opensource/svgaplayer/c;)V
    .locals 0
    .param p1    # Lcom/opensource/svgaplayer/c;
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

.method public final setVideoItem(Lcom/opensource/svgaplayer/SVGAVideoEntity;)V
    .locals 1
    .param p1    # Lcom/opensource/svgaplayer/SVGAVideoEntity;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    new-instance v0, Lcom/opensource/svgaplayer/e;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/opensource/svgaplayer/e;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1, v0}, Lcom/opensource/svgaplayer/SVGAImageView;->p(Lcom/opensource/svgaplayer/SVGAVideoEntity;Lcom/opensource/svgaplayer/e;)V

    .line 9
    return-void
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

.method public final t(Lj90/c;Z)V
    .locals 1
    .param p1    # Lj90/c;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Lcom/opensource/svgaplayer/SVGAImageView;->v(Z)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, Lcom/opensource/svgaplayer/SVGAImageView;->o(Lj90/c;Z)V

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

.method public final u()V
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/opensource/svgaplayer/SVGAImageView;->e:Z

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lcom/opensource/svgaplayer/SVGAImageView;->v(Z)V

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
.end method

.method public final v(Z)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/opensource/svgaplayer/SVGAImageView;->i:Landroid/animation/ValueAnimator;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, Lcom/opensource/svgaplayer/SVGAImageView;->i:Landroid/animation/ValueAnimator;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/animation/Animator;->removeAllListeners()V

    .line 15
    .line 16
    :cond_1
    iget-object v0, p0, Lcom/opensource/svgaplayer/SVGAImageView;->i:Landroid/animation/ValueAnimator;

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->removeAllUpdateListeners()V

    .line 22
    .line 23
    .line 24
    :cond_2
    invoke-direct {p0}, Lcom/opensource/svgaplayer/SVGAImageView;->getSVGADrawable()Lcom/opensource/svgaplayer/d;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    if-eqz v0, :cond_3

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lcom/opensource/svgaplayer/d;->h()V

    .line 31
    .line 32
    .line 33
    :cond_3
    invoke-direct {p0}, Lcom/opensource/svgaplayer/SVGAImageView;->getSVGADrawable()Lcom/opensource/svgaplayer/d;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    if-eqz v0, :cond_4

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, p1}, Lcom/opensource/svgaplayer/d;->e(Z)V

    .line 40
    :cond_4
    return-void
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
.end method
