.class public Lcom/cpiz/android/bubbleview/d;
.super Ljava/lang/Object;
.source "RelativePos.java"


# instance fields
.field public a:I

.field public b:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput p1, p0, Lcom/cpiz/android/bubbleview/d;->a:I

    .line 6
    .line 7
    iput p2, p0, Lcom/cpiz/android/bubbleview/d;->b:I

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
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
.end method


# virtual methods
.method public a()Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/cpiz/android/bubbleview/d;->d()Z

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x2

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/cpiz/android/bubbleview/d;->e()Z

    .line 12
    move-result v0

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    iget v0, p0, Lcom/cpiz/android/bubbleview/d;->a:I

    .line 17
    .line 18
    if-ne v0, v2, :cond_0

    .line 19
    .line 20
    sget-object v0, Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;->Left:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;

    .line 21
    return-object v0

    .line 22
    .line 23
    :cond_0
    if-ne v0, v1, :cond_1

    .line 24
    .line 25
    sget-object v0, Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;->Right:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;

    .line 26
    return-object v0

    .line 27
    .line 28
    .line 29
    :cond_1
    invoke-virtual {p0}, Lcom/cpiz/android/bubbleview/d;->d()Z

    .line 30
    move-result v0

    .line 31
    .line 32
    if-nez v0, :cond_3

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/cpiz/android/bubbleview/d;->e()Z

    .line 36
    move-result v0

    .line 37
    .line 38
    if-eqz v0, :cond_3

    .line 39
    .line 40
    iget v0, p0, Lcom/cpiz/android/bubbleview/d;->b:I

    .line 41
    .line 42
    if-ne v0, v2, :cond_2

    .line 43
    .line 44
    sget-object v0, Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;->Up:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;

    .line 45
    return-object v0

    .line 46
    .line 47
    :cond_2
    if-ne v0, v1, :cond_3

    .line 48
    .line 49
    sget-object v0, Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;->Down:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;

    .line 50
    return-object v0

    .line 51
    .line 52
    :cond_3
    sget-object v0, Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;->None:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;

    .line 53
    return-object v0
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
.end method

.method public b()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/cpiz/android/bubbleview/d;->a:I

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
.end method

.method public c()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/cpiz/android/bubbleview/d;->b:I

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
.end method

.method public final d()Z
    .locals 3

    .line 1
    .line 2
    iget v0, p0, Lcom/cpiz/android/bubbleview/d;->a:I

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    if-eq v0, v1, :cond_1

    .line 6
    const/4 v2, 0x2

    .line 7
    .line 8
    if-ne v0, v2, :cond_0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0

    .line 12
    :cond_1
    :goto_0
    return v1
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public final e()Z
    .locals 3

    .line 1
    .line 2
    iget v0, p0, Lcom/cpiz/android/bubbleview/d;->b:I

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    if-eq v0, v1, :cond_1

    .line 6
    const/4 v2, 0x2

    .line 7
    .line 8
    if-ne v0, v2, :cond_0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0

    .line 12
    :cond_1
    :goto_0
    return v1
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method
