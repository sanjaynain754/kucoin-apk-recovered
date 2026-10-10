.class public abstract Lcom/facebook/yoga/YogaNodeJNIBase;
.super Lcom/facebook/yoga/a;
.source "YogaNodeJNIBase.java"

# interfaces
.implements Ljava/lang/Cloneable;


# annotations
.annotation build Le7/a;
.end annotation


# instance fields
.field private arr:[F
    .annotation build Le7/a;
    .end annotation
.end field

.field public b:Lcom/facebook/yoga/YogaNodeJNIBase;

.field public c:Ld7/b;

.field public d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/facebook/yoga/YogaNodeJNIBase;",
            ">;"
        }
    .end annotation
.end field

.field public e:Ld7/g;

.field public f:Ld7/a;

.field public g:J

.field public h:Ljava/lang/Object;

.field public i:Z

.field private mLayoutDirection:I
    .annotation build Le7/a;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 7
    invoke-static {}, Lcom/facebook/yoga/YogaNative;->jni_YGNodeNewJNI()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lcom/facebook/yoga/YogaNodeJNIBase;-><init>(J)V

    return-void
.end method

.method public constructor <init>(J)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/facebook/yoga/a;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->arr:[F

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->mLayoutDirection:I

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->i:Z

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-eqz v0, :cond_0

    .line 5
    iput-wide p1, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->g:J

    return-void

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Failed to allocate native memory"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Ld7/b;)V
    .locals 2

    .line 8
    move-object v0, p1

    check-cast v0, Ld7/d;

    iget-wide v0, v0, Ld7/d;->a:J

    invoke-static {v0, v1}, Lcom/facebook/yoga/YogaNative;->jni_YGNodeNewWithConfigJNI(J)J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lcom/facebook/yoga/YogaNodeJNIBase;-><init>(J)V

    .line 9
    iput-object p1, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->c:Ld7/b;

    return-void
.end method

.method public static o0(J)Lcom/facebook/yoga/YogaValue;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/yoga/YogaValue;

    .line 3
    long-to-int v1, p0

    .line 4
    .line 5
    .line 6
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 7
    move-result v1

    .line 8
    .line 9
    const/16 v2, 0x20

    .line 10
    shr-long/2addr p0, v2

    .line 11
    long-to-int p0, p0

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, v1, p0}, Lcom/facebook/yoga/YogaValue;-><init>(FI)V

    .line 15
    return-object v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method private final replaceChild(Lcom/facebook/yoga/YogaNodeJNIBase;I)J
    .locals 1
    .annotation build Le7/a;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->d:Ljava/util/List;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0, p2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->d:Ljava/util/List;

    .line 10
    .line 11
    .line 12
    invoke-interface {v0, p2, p1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 13
    .line 14
    iput-object p0, p1, Lcom/facebook/yoga/YogaNodeJNIBase;->b:Lcom/facebook/yoga/YogaNodeJNIBase;

    .line 15
    .line 16
    iget-wide p1, p1, Lcom/facebook/yoga/YogaNodeJNIBase;->g:J

    .line 17
    return-wide p1

    .line 18
    .line 19
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string p2, "Cannot replace child. YogaNode does not have children"

    .line 22
    .line 23
    .line 24
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    throw p1
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
.end method


# virtual methods
.method public A(Lcom/facebook/yoga/YogaDirection;)V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->g:J

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/facebook/yoga/YogaDirection;->intValue()I

    .line 6
    move-result p1

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1, p1}, Lcom/facebook/yoga/YogaNative;->jni_YGNodeStyleSetDirectionJNI(JI)V

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
.end method

.method public B(Lcom/facebook/yoga/YogaDisplay;)V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->g:J

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/facebook/yoga/YogaDisplay;->intValue()I

    .line 6
    move-result p1

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1, p1}, Lcom/facebook/yoga/YogaNative;->jni_YGNodeStyleSetDisplayJNI(JI)V

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
.end method

.method public C(F)V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->g:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lcom/facebook/yoga/YogaNative;->jni_YGNodeStyleSetFlexJNI(JF)V

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
.end method

.method public D(F)V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->g:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lcom/facebook/yoga/YogaNative;->jni_YGNodeStyleSetFlexBasisJNI(JF)V

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
.end method

.method public E()V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->g:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/facebook/yoga/YogaNative;->jni_YGNodeStyleSetFlexBasisAutoJNI(J)V

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
.end method

.method public F(F)V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->g:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lcom/facebook/yoga/YogaNative;->jni_YGNodeStyleSetFlexBasisPercentJNI(JF)V

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
.end method

.method public G(Lcom/facebook/yoga/YogaFlexDirection;)V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->g:J

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/facebook/yoga/YogaFlexDirection;->intValue()I

    .line 6
    move-result p1

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1, p1}, Lcom/facebook/yoga/YogaNative;->jni_YGNodeStyleSetFlexDirectionJNI(JI)V

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
.end method

.method public H(F)V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->g:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lcom/facebook/yoga/YogaNative;->jni_YGNodeStyleSetFlexGrowJNI(JF)V

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
.end method

.method public I(F)V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->g:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lcom/facebook/yoga/YogaNative;->jni_YGNodeStyleSetFlexShrinkJNI(JF)V

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
.end method

.method public J(Lcom/facebook/yoga/YogaGutter;F)V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->g:J

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/facebook/yoga/YogaGutter;->intValue()I

    .line 6
    move-result p1

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1, p1, p2}, Lcom/facebook/yoga/YogaNative;->jni_YGNodeStyleSetGapJNI(JIF)V

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
.end method

.method public K(Lcom/facebook/yoga/YogaGutter;F)V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->g:J

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/facebook/yoga/YogaGutter;->intValue()I

    .line 6
    move-result p1

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1, p1, p2}, Lcom/facebook/yoga/YogaNative;->jni_YGNodeStyleSetGapPercentJNI(JIF)V

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
.end method

.method public L(F)V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->g:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lcom/facebook/yoga/YogaNative;->jni_YGNodeStyleSetHeightJNI(JF)V

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
.end method

.method public M()V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->g:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/facebook/yoga/YogaNative;->jni_YGNodeStyleSetHeightAutoJNI(J)V

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
.end method

.method public N(F)V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->g:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lcom/facebook/yoga/YogaNative;->jni_YGNodeStyleSetHeightPercentJNI(JF)V

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
.end method

.method public O(Lcom/facebook/yoga/YogaJustify;)V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->g:J

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/facebook/yoga/YogaJustify;->intValue()I

    .line 6
    move-result p1

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1, p1}, Lcom/facebook/yoga/YogaNative;->jni_YGNodeStyleSetJustifyContentJNI(JI)V

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
.end method

.method public P(Lcom/facebook/yoga/YogaEdge;F)V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->g:J

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/facebook/yoga/YogaEdge;->intValue()I

    .line 6
    move-result p1

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1, p1, p2}, Lcom/facebook/yoga/YogaNative;->jni_YGNodeStyleSetMarginJNI(JIF)V

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
.end method

.method public Q(Lcom/facebook/yoga/YogaEdge;)V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->g:J

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/facebook/yoga/YogaEdge;->intValue()I

    .line 6
    move-result p1

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1, p1}, Lcom/facebook/yoga/YogaNative;->jni_YGNodeStyleSetMarginAutoJNI(JI)V

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
.end method

.method public R(Lcom/facebook/yoga/YogaEdge;F)V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->g:J

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/facebook/yoga/YogaEdge;->intValue()I

    .line 6
    move-result p1

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1, p1, p2}, Lcom/facebook/yoga/YogaNative;->jni_YGNodeStyleSetMarginPercentJNI(JIF)V

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
.end method

.method public S(F)V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->g:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lcom/facebook/yoga/YogaNative;->jni_YGNodeStyleSetMaxHeightJNI(JF)V

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
.end method

.method public T(F)V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->g:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lcom/facebook/yoga/YogaNative;->jni_YGNodeStyleSetMaxHeightPercentJNI(JF)V

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
.end method

.method public U(F)V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->g:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lcom/facebook/yoga/YogaNative;->jni_YGNodeStyleSetMaxWidthJNI(JF)V

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
.end method

.method public V(F)V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->g:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lcom/facebook/yoga/YogaNative;->jni_YGNodeStyleSetMaxWidthPercentJNI(JF)V

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
.end method

.method public W(Ld7/g;)V
    .locals 2

    .line 1
    .line 2
    iput-object p1, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->e:Ld7/g;

    .line 3
    .line 4
    iget-wide v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->g:J

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    const/4 p1, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 p1, 0x0

    .line 10
    .line 11
    .line 12
    :goto_0
    invoke-static {v0, v1, p1}, Lcom/facebook/yoga/YogaNative;->jni_YGNodeSetHasMeasureFuncJNI(JZ)V

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
.end method

.method public X(F)V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->g:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lcom/facebook/yoga/YogaNative;->jni_YGNodeStyleSetMinHeightJNI(JF)V

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
.end method

.method public Y(F)V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->g:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lcom/facebook/yoga/YogaNative;->jni_YGNodeStyleSetMinHeightPercentJNI(JF)V

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
.end method

.method public Z(F)V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->g:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lcom/facebook/yoga/YogaNative;->jni_YGNodeStyleSetMinWidthJNI(JF)V

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
.end method

.method public a(Lcom/facebook/yoga/a;I)V
    .locals 4

    .line 1
    .line 2
    instance-of v0, p1, Lcom/facebook/yoga/YogaNodeJNIBase;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    return-void

    .line 6
    .line 7
    :cond_0
    check-cast p1, Lcom/facebook/yoga/YogaNodeJNIBase;

    .line 8
    .line 9
    iget-object v0, p1, Lcom/facebook/yoga/YogaNodeJNIBase;->b:Lcom/facebook/yoga/YogaNodeJNIBase;

    .line 10
    .line 11
    if-nez v0, :cond_2

    .line 12
    .line 13
    iget-object v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->d:Ljava/util/List;

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    new-instance v0, Ljava/util/ArrayList;

    .line 18
    const/4 v1, 0x4

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 22
    .line 23
    iput-object v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->d:Ljava/util/List;

    .line 24
    .line 25
    :cond_1
    iget-object v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->d:Ljava/util/List;

    .line 26
    .line 27
    .line 28
    invoke-interface {v0, p2, p1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 29
    .line 30
    iput-object p0, p1, Lcom/facebook/yoga/YogaNodeJNIBase;->b:Lcom/facebook/yoga/YogaNodeJNIBase;

    .line 31
    .line 32
    iget-wide v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->g:J

    .line 33
    .line 34
    iget-wide v2, p1, Lcom/facebook/yoga/YogaNodeJNIBase;->g:J

    .line 35
    .line 36
    .line 37
    invoke-static {v0, v1, v2, v3, p2}, Lcom/facebook/yoga/YogaNative;->jni_YGNodeInsertChildJNI(JJI)V

    .line 38
    return-void

    .line 39
    .line 40
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 41
    .line 42
    const-string p2, "Child already has a parent, it must be removed first."

    .line 43
    .line 44
    .line 45
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 46
    throw p1
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
.end method

.method public a0(F)V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->g:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lcom/facebook/yoga/YogaNative;->jni_YGNodeStyleSetMinWidthPercentJNI(JF)V

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
.end method

.method public b(FF)V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Lcom/facebook/yoga/YogaNodeJNIBase;->l0(Lcom/facebook/yoga/a;)V

    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 13
    const/4 v1, 0x0

    .line 14
    move v2, v1

    .line 15
    .line 16
    .line 17
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 18
    move-result v3

    .line 19
    .line 20
    if-ge v2, v3, :cond_1

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 24
    move-result-object v3

    .line 25
    .line 26
    check-cast v3, Lcom/facebook/yoga/YogaNodeJNIBase;

    .line 27
    .line 28
    iget-object v4, v3, Lcom/facebook/yoga/YogaNodeJNIBase;->d:Ljava/util/List;

    .line 29
    .line 30
    if-eqz v4, :cond_0

    .line 31
    .line 32
    .line 33
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 34
    move-result-object v4

    .line 35
    .line 36
    .line 37
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    move-result v5

    .line 39
    .line 40
    if-eqz v5, :cond_0

    .line 41
    .line 42
    .line 43
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    move-result-object v5

    .line 45
    .line 46
    check-cast v5, Lcom/facebook/yoga/YogaNodeJNIBase;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v5, v3}, Lcom/facebook/yoga/YogaNodeJNIBase;->l0(Lcom/facebook/yoga/a;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    goto :goto_1

    .line 54
    .line 55
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 56
    goto :goto_0

    .line 57
    .line 58
    .line 59
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 60
    move-result v2

    .line 61
    .line 62
    new-array v2, v2, [Lcom/facebook/yoga/YogaNodeJNIBase;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 66
    move-result-object v0

    .line 67
    move-object v7, v0

    .line 68
    .line 69
    check-cast v7, [Lcom/facebook/yoga/YogaNodeJNIBase;

    .line 70
    array-length v0, v7

    .line 71
    .line 72
    new-array v6, v0, [J

    .line 73
    :goto_2
    array-length v0, v7

    .line 74
    .line 75
    if-ge v1, v0, :cond_2

    .line 76
    .line 77
    aget-object v0, v7, v1

    .line 78
    .line 79
    iget-wide v2, v0, Lcom/facebook/yoga/YogaNodeJNIBase;->g:J

    .line 80
    .line 81
    aput-wide v2, v6, v1

    .line 82
    .line 83
    add-int/lit8 v1, v1, 0x1

    .line 84
    goto :goto_2

    .line 85
    .line 86
    :cond_2
    iget-wide v2, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->g:J

    .line 87
    move v4, p1

    .line 88
    move v5, p2

    .line 89
    .line 90
    .line 91
    invoke-static/range {v2 .. v7}, Lcom/facebook/yoga/YogaNative;->jni_YGNodeCalculateLayoutJNI(JFF[J[Lcom/facebook/yoga/YogaNodeJNIBase;)V

    .line 92
    return-void
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
.end method

.method public b0(Lcom/facebook/yoga/YogaOverflow;)V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->g:J

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/facebook/yoga/YogaOverflow;->intValue()I

    .line 6
    move-result p1

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1, p1}, Lcom/facebook/yoga/YogaNative;->jni_YGNodeStyleSetOverflowJNI(JI)V

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
.end method

.method public final baseline(FF)F
    .locals 1
    .annotation build Le7/a;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->f:Ld7/a;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p0, p1, p2}, Ld7/a;->baseline(Lcom/facebook/yoga/a;FF)F

    .line 6
    move-result p1

    .line 7
    return p1
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
.end method

.method public c()V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->g:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/facebook/yoga/YogaNative;->jni_YGNodeMarkDirtyJNI(J)V

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
.end method

.method public c0(Lcom/facebook/yoga/YogaEdge;F)V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->g:J

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/facebook/yoga/YogaEdge;->intValue()I

    .line 6
    move-result p1

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1, p1, p2}, Lcom/facebook/yoga/YogaNative;->jni_YGNodeStyleSetPaddingJNI(JIF)V

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
.end method

.method public d()F
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->g:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/facebook/yoga/YogaNative;->jni_YGNodeStyleGetFlexJNI(J)F

    .line 6
    move-result v0

    .line 7
    return v0
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
.end method

.method public d0(Lcom/facebook/yoga/YogaEdge;F)V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->g:J

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/facebook/yoga/YogaEdge;->intValue()I

    .line 6
    move-result p1

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1, p1, p2}, Lcom/facebook/yoga/YogaNative;->jni_YGNodeStyleSetPaddingPercentJNI(JIF)V

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
.end method

.method public e()Lcom/facebook/yoga/YogaValue;
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->g:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/facebook/yoga/YogaNative;->jni_YGNodeStyleGetHeightJNI(J)J

    .line 6
    move-result-wide v0

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1}, Lcom/facebook/yoga/YogaNodeJNIBase;->o0(J)Lcom/facebook/yoga/YogaValue;

    .line 10
    move-result-object v0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public e0(Lcom/facebook/yoga/YogaEdge;F)V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->g:J

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/facebook/yoga/YogaEdge;->intValue()I

    .line 6
    move-result p1

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1, p1, p2}, Lcom/facebook/yoga/YogaNative;->jni_YGNodeStyleSetPositionJNI(JIF)V

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
.end method

.method public f()Lcom/facebook/yoga/YogaDirection;
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->arr:[F

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    const/4 v1, 0x5

    .line 6
    .line 7
    aget v0, v0, v1

    .line 8
    float-to-int v0, v0

    .line 9
    goto :goto_0

    .line 10
    .line 11
    :cond_0
    iget v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->mLayoutDirection:I

    .line 12
    .line 13
    .line 14
    :goto_0
    invoke-static {v0}, Lcom/facebook/yoga/YogaDirection;->fromInt(I)Lcom/facebook/yoga/YogaDirection;

    .line 15
    move-result-object v0

    .line 16
    return-object v0
    .line 17
    .line 18
.end method

.method public f0(Lcom/facebook/yoga/YogaEdge;F)V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->g:J

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/facebook/yoga/YogaEdge;->intValue()I

    .line 6
    move-result p1

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1, p1, p2}, Lcom/facebook/yoga/YogaNative;->jni_YGNodeStyleSetPositionPercentJNI(JIF)V

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
.end method

.method public g()F
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->arr:[F

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    const/4 v1, 0x2

    .line 6
    .line 7
    aget v0, v0, v1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public g0(Lcom/facebook/yoga/YogaPositionType;)V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->g:J

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/facebook/yoga/YogaPositionType;->intValue()I

    .line 6
    move-result p1

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1, p1}, Lcom/facebook/yoga/YogaNative;->jni_YGNodeStyleSetPositionTypeJNI(JI)V

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
.end method

.method public h(Lcom/facebook/yoga/YogaEdge;)F
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->arr:[F

    .line 3
    .line 4
    if-eqz v0, :cond_3

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    aget v0, v0, v1

    .line 8
    float-to-int v2, v0

    .line 9
    const/4 v3, 0x2

    .line 10
    and-int/2addr v2, v3

    .line 11
    .line 12
    if-ne v2, v3, :cond_3

    .line 13
    float-to-int v0, v0

    .line 14
    const/4 v2, 0x1

    .line 15
    and-int/2addr v0, v2

    .line 16
    .line 17
    if-ne v0, v2, :cond_0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v1, 0x4

    .line 20
    .line 21
    :goto_0
    rsub-int/lit8 v0, v1, 0xa

    .line 22
    .line 23
    sget-object v2, Lcom/facebook/yoga/YogaNodeJNIBase$a;->a:[I

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 27
    move-result p1

    .line 28
    .line 29
    aget p1, v2, p1

    .line 30
    .line 31
    .line 32
    packed-switch p1, :pswitch_data_0

    .line 33
    .line 34
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 35
    .line 36
    const-string v0, "Cannot get layout paddings of multi-edge shorthands"

    .line 37
    .line 38
    .line 39
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 40
    throw p1

    .line 41
    .line 42
    .line 43
    :pswitch_0
    invoke-virtual {p0}, Lcom/facebook/yoga/YogaNodeJNIBase;->f()Lcom/facebook/yoga/YogaDirection;

    .line 44
    move-result-object p1

    .line 45
    .line 46
    sget-object v2, Lcom/facebook/yoga/YogaDirection;->RTL:Lcom/facebook/yoga/YogaDirection;

    .line 47
    .line 48
    if-ne p1, v2, :cond_1

    .line 49
    .line 50
    iget-object p1, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->arr:[F

    .line 51
    .line 52
    aget p1, p1, v0

    .line 53
    return p1

    .line 54
    .line 55
    :cond_1
    iget-object p1, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->arr:[F

    .line 56
    .line 57
    rsub-int/lit8 v0, v1, 0xc

    .line 58
    .line 59
    aget p1, p1, v0

    .line 60
    return p1

    .line 61
    .line 62
    .line 63
    :pswitch_1
    invoke-virtual {p0}, Lcom/facebook/yoga/YogaNodeJNIBase;->f()Lcom/facebook/yoga/YogaDirection;

    .line 64
    move-result-object p1

    .line 65
    .line 66
    sget-object v2, Lcom/facebook/yoga/YogaDirection;->RTL:Lcom/facebook/yoga/YogaDirection;

    .line 67
    .line 68
    if-ne p1, v2, :cond_2

    .line 69
    .line 70
    iget-object p1, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->arr:[F

    .line 71
    .line 72
    rsub-int/lit8 v0, v1, 0xc

    .line 73
    .line 74
    aget p1, p1, v0

    .line 75
    return p1

    .line 76
    .line 77
    :cond_2
    iget-object p1, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->arr:[F

    .line 78
    .line 79
    aget p1, p1, v0

    .line 80
    return p1

    .line 81
    .line 82
    :pswitch_2
    iget-object p1, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->arr:[F

    .line 83
    .line 84
    rsub-int/lit8 v0, v1, 0xd

    .line 85
    .line 86
    aget p1, p1, v0

    .line 87
    return p1

    .line 88
    .line 89
    :pswitch_3
    iget-object p1, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->arr:[F

    .line 90
    .line 91
    rsub-int/lit8 v0, v1, 0xc

    .line 92
    .line 93
    aget p1, p1, v0

    .line 94
    return p1

    .line 95
    .line 96
    :pswitch_4
    iget-object p1, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->arr:[F

    .line 97
    .line 98
    rsub-int/lit8 v0, v1, 0xb

    .line 99
    .line 100
    aget p1, p1, v0

    .line 101
    return p1

    .line 102
    .line 103
    :pswitch_5
    iget-object p1, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->arr:[F

    .line 104
    .line 105
    aget p1, p1, v0

    .line 106
    return p1

    .line 107
    :cond_3
    const/4 p1, 0x0

    .line 108
    return p1

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
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method

.method public h0(F)V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->g:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lcom/facebook/yoga/YogaNative;->jni_YGNodeStyleSetWidthJNI(JF)V

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
.end method

.method public i()F
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->arr:[F

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    const/4 v1, 0x1

    .line 6
    .line 7
    aget v0, v0, v1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public i0()V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->g:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/facebook/yoga/YogaNative;->jni_YGNodeStyleSetWidthAutoJNI(J)V

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
.end method

.method public j()F
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->arr:[F

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    const/4 v1, 0x3

    .line 6
    .line 7
    aget v0, v0, v1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public j0(F)V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->g:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lcom/facebook/yoga/YogaNative;->jni_YGNodeStyleSetWidthPercentJNI(JF)V

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
.end method

.method public k()F
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->arr:[F

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    const/4 v1, 0x4

    .line 6
    .line 7
    aget v0, v0, v1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public k0(Lcom/facebook/yoga/YogaWrap;)V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->g:J

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/facebook/yoga/YogaWrap;->intValue()I

    .line 6
    move-result p1

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1, p1}, Lcom/facebook/yoga/YogaNative;->jni_YGNodeStyleSetFlexWrapJNI(JI)V

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
.end method

.method public l(Lcom/facebook/yoga/YogaEdge;)Lcom/facebook/yoga/YogaValue;
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->g:J

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/facebook/yoga/YogaEdge;->intValue()I

    .line 6
    move-result p1

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1, p1}, Lcom/facebook/yoga/YogaNative;->jni_YGNodeStyleGetPaddingJNI(JI)J

    .line 10
    move-result-wide v0

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, Lcom/facebook/yoga/YogaNodeJNIBase;->o0(J)Lcom/facebook/yoga/YogaValue;

    .line 14
    move-result-object p1

    .line 15
    return-object p1
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public final l0(Lcom/facebook/yoga/a;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/facebook/yoga/YogaNodeJNIBase;->m0()Ljava/lang/Object;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    instance-of v1, v0, Lcom/facebook/yoga/a$a;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    check-cast v0, Lcom/facebook/yoga/a$a;

    .line 11
    .line 12
    .line 13
    invoke-interface {v0, p0, p1}, Lcom/facebook/yoga/a$a;->a(Lcom/facebook/yoga/a;Lcom/facebook/yoga/a;)V

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
.end method

.method public m()Lcom/facebook/yoga/YogaValue;
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->g:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/facebook/yoga/YogaNative;->jni_YGNodeStyleGetWidthJNI(J)J

    .line 6
    move-result-wide v0

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1}, Lcom/facebook/yoga/YogaNodeJNIBase;->o0(J)Lcom/facebook/yoga/YogaValue;

    .line 10
    move-result-object v0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public m0()Ljava/lang/Object;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->h:Ljava/lang/Object;

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
.end method

.method public final measure(FIFI)J
    .locals 7
    .annotation build Le7/a;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/facebook/yoga/YogaNodeJNIBase;->p()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v1, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->e:Ld7/g;

    .line 9
    .line 10
    .line 11
    invoke-static {p2}, Lcom/facebook/yoga/YogaMeasureMode;->fromInt(I)Lcom/facebook/yoga/YogaMeasureMode;

    .line 12
    move-result-object v4

    .line 13
    .line 14
    .line 15
    invoke-static {p4}, Lcom/facebook/yoga/YogaMeasureMode;->fromInt(I)Lcom/facebook/yoga/YogaMeasureMode;

    .line 16
    move-result-object v6

    .line 17
    move-object v2, p0

    .line 18
    move v3, p1

    .line 19
    move v5, p3

    .line 20
    .line 21
    .line 22
    invoke-interface/range {v1 .. v6}, Ld7/g;->measure(Lcom/facebook/yoga/a;FLcom/facebook/yoga/YogaMeasureMode;FLcom/facebook/yoga/YogaMeasureMode;)J

    .line 23
    move-result-wide p1

    .line 24
    return-wide p1

    .line 25
    .line 26
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    .line 27
    .line 28
    const-string p2, "Measure function isn\'t defined!"

    .line 29
    .line 30
    .line 31
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 32
    throw p1
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
.end method

.method public n()Z
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->arr:[F

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    aget v0, v0, v1

    .line 8
    float-to-int v0, v0

    .line 9
    .line 10
    const/16 v2, 0x10

    .line 11
    and-int/2addr v0, v2

    .line 12
    .line 13
    if-ne v0, v2, :cond_0

    .line 14
    const/4 v0, 0x1

    .line 15
    return v0

    .line 16
    :cond_0
    return v1

    .line 17
    .line 18
    :cond_1
    iget-boolean v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->i:Z

    .line 19
    return v0
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
.end method

.method public n0(I)Lcom/facebook/yoga/YogaNodeJNIBase;
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->d:Ljava/util/List;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 8
    move-result-object p1

    .line 9
    .line 10
    check-cast p1, Lcom/facebook/yoga/YogaNodeJNIBase;

    .line 11
    const/4 v0, 0x0

    .line 12
    .line 13
    iput-object v0, p1, Lcom/facebook/yoga/YogaNodeJNIBase;->b:Lcom/facebook/yoga/YogaNodeJNIBase;

    .line 14
    .line 15
    iget-wide v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->g:J

    .line 16
    .line 17
    iget-wide v2, p1, Lcom/facebook/yoga/YogaNodeJNIBase;->g:J

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v1, v2, v3}, Lcom/facebook/yoga/YogaNative;->jni_YGNodeRemoveChildJNI(JJ)V

    .line 21
    return-object p1

    .line 22
    .line 23
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    const-string v0, "Trying to remove a child of a YogaNode that does not have children"

    .line 26
    .line 27
    .line 28
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 29
    throw p1
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
.end method

.method public o()Z
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->g:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/facebook/yoga/YogaNative;->jni_YGNodeIsDirtyJNI(J)Z

    .line 6
    move-result v0

    .line 7
    return v0
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
.end method

.method public p()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->e:Ld7/g;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
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
.end method

.method public q()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->arr:[F

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    aget v2, v0, v1

    .line 8
    float-to-int v2, v2

    .line 9
    .line 10
    and-int/lit8 v2, v2, -0x11

    .line 11
    int-to-float v2, v2

    .line 12
    .line 13
    aput v2, v0, v1

    .line 14
    .line 15
    :cond_0
    iput-boolean v1, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->i:Z

    .line 16
    return-void
    .line 17
    .line 18
.end method

.method public bridge synthetic r(I)Lcom/facebook/yoga/a;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/facebook/yoga/YogaNodeJNIBase;->n0(I)Lcom/facebook/yoga/YogaNodeJNIBase;

    .line 4
    move-result-object p1

    .line 5
    return-object p1
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
.end method

.method public s()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput-object v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->e:Ld7/g;

    .line 4
    .line 5
    iput-object v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->f:Ld7/a;

    .line 6
    .line 7
    iput-object v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->h:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->arr:[F

    .line 10
    const/4 v0, 0x1

    .line 11
    .line 12
    iput-boolean v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->i:Z

    .line 13
    const/4 v0, 0x0

    .line 14
    .line 15
    iput v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->mLayoutDirection:I

    .line 16
    .line 17
    iget-wide v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->g:J

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v1}, Lcom/facebook/yoga/YogaNative;->jni_YGNodeResetJNI(J)V

    .line 21
    return-void
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
.end method

.method public t(Lcom/facebook/yoga/YogaAlign;)V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->g:J

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/facebook/yoga/YogaAlign;->intValue()I

    .line 6
    move-result p1

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1, p1}, Lcom/facebook/yoga/YogaNative;->jni_YGNodeStyleSetAlignContentJNI(JI)V

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
.end method

.method public u(Lcom/facebook/yoga/YogaAlign;)V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->g:J

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/facebook/yoga/YogaAlign;->intValue()I

    .line 6
    move-result p1

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1, p1}, Lcom/facebook/yoga/YogaNative;->jni_YGNodeStyleSetAlignItemsJNI(JI)V

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
.end method

.method public v(Lcom/facebook/yoga/YogaAlign;)V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->g:J

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/facebook/yoga/YogaAlign;->intValue()I

    .line 6
    move-result p1

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1, p1}, Lcom/facebook/yoga/YogaNative;->jni_YGNodeStyleSetAlignSelfJNI(JI)V

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
.end method

.method public w(F)V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->g:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lcom/facebook/yoga/YogaNative;->jni_YGNodeStyleSetAspectRatioJNI(JF)V

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
.end method

.method public x(Ld7/a;)V
    .locals 2

    .line 1
    .line 2
    iput-object p1, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->f:Ld7/a;

    .line 3
    .line 4
    iget-wide v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->g:J

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    const/4 p1, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 p1, 0x0

    .line 10
    .line 11
    .line 12
    :goto_0
    invoke-static {v0, v1, p1}, Lcom/facebook/yoga/YogaNative;->jni_YGNodeSetHasBaselineFuncJNI(JZ)V

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
.end method

.method public y(Lcom/facebook/yoga/YogaEdge;F)V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->g:J

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/facebook/yoga/YogaEdge;->intValue()I

    .line 6
    move-result p1

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1, p1, p2}, Lcom/facebook/yoga/YogaNative;->jni_YGNodeStyleSetBorderJNI(JIF)V

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
.end method

.method public z(Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/facebook/yoga/YogaNodeJNIBase;->h:Ljava/lang/Object;

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
.end method
