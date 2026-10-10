.class final Lcom/google/android/material/drawable/ScaledDrawableWrapper$ScaledDrawableWrapperState;
.super Landroid/graphics/drawable/Drawable$ConstantState;
.source "ScaledDrawableWrapper.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/material/drawable/ScaledDrawableWrapper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ScaledDrawableWrapperState"
.end annotation


# instance fields
.field private final height:I

.field private final width:I

.field private wrappedDrawableState:Landroid/graphics/drawable/Drawable$ConstantState;


# direct methods
.method public constructor <init>(Landroid/graphics/drawable/Drawable$ConstantState;II)V
    .locals 0
    .param p1    # Landroid/graphics/drawable/Drawable$ConstantState;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/google/android/material/drawable/ScaledDrawableWrapper$ScaledDrawableWrapperState;->wrappedDrawableState:Landroid/graphics/drawable/Drawable$ConstantState;

    .line 6
    .line 7
    iput p2, p0, Lcom/google/android/material/drawable/ScaledDrawableWrapper$ScaledDrawableWrapperState;->width:I

    .line 8
    .line 9
    iput p3, p0, Lcom/google/android/material/drawable/ScaledDrawableWrapper$ScaledDrawableWrapperState;->height:I

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
.end method

.method public static synthetic access$000(Lcom/google/android/material/drawable/ScaledDrawableWrapper$ScaledDrawableWrapperState;)I
    .locals 0

    .line 1
    .line 2
    iget p0, p0, Lcom/google/android/material/drawable/ScaledDrawableWrapper$ScaledDrawableWrapperState;->width:I

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
.end method

.method public static synthetic access$100(Lcom/google/android/material/drawable/ScaledDrawableWrapper$ScaledDrawableWrapperState;)I
    .locals 0

    .line 1
    .line 2
    iget p0, p0, Lcom/google/android/material/drawable/ScaledDrawableWrapper$ScaledDrawableWrapperState;->height:I

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
.end method

.method public static synthetic access$202(Lcom/google/android/material/drawable/ScaledDrawableWrapper$ScaledDrawableWrapperState;Landroid/graphics/drawable/Drawable$ConstantState;)Landroid/graphics/drawable/Drawable$ConstantState;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/google/android/material/drawable/ScaledDrawableWrapper$ScaledDrawableWrapperState;->wrappedDrawableState:Landroid/graphics/drawable/Drawable$ConstantState;

    .line 3
    return-object p1
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
.end method


# virtual methods
.method public canConstantState()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/android/material/drawable/ScaledDrawableWrapper$ScaledDrawableWrapperState;->wrappedDrawableState:Landroid/graphics/drawable/Drawable$ConstantState;

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

.method public getChangingConfigurations()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/android/material/drawable/ScaledDrawableWrapper$ScaledDrawableWrapperState;->wrappedDrawableState:Landroid/graphics/drawable/Drawable$ConstantState;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable$ConstantState;->getChangingConfigurations()I

    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public newDrawable()Landroid/graphics/drawable/Drawable;
    .locals 4
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/material/drawable/ScaledDrawableWrapper$ScaledDrawableWrapperState;->wrappedDrawableState:Landroid/graphics/drawable/Drawable$ConstantState;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 2
    new-instance v1, Lcom/google/android/material/drawable/ScaledDrawableWrapper;

    iget v2, p0, Lcom/google/android/material/drawable/ScaledDrawableWrapper$ScaledDrawableWrapperState;->width:I

    iget v3, p0, Lcom/google/android/material/drawable/ScaledDrawableWrapper$ScaledDrawableWrapperState;->height:I

    invoke-direct {v1, v0, v2, v3}, Lcom/google/android/material/drawable/ScaledDrawableWrapper;-><init>(Landroid/graphics/drawable/Drawable;II)V

    return-object v1
.end method

.method public newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;
    .locals 3
    .param p1    # Landroid/content/res/Resources;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 3
    iget-object v0, p0, Lcom/google/android/material/drawable/ScaledDrawableWrapper$ScaledDrawableWrapperState;->wrappedDrawableState:Landroid/graphics/drawable/Drawable$ConstantState;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 4
    new-instance v0, Lcom/google/android/material/drawable/ScaledDrawableWrapper;

    iget v1, p0, Lcom/google/android/material/drawable/ScaledDrawableWrapper$ScaledDrawableWrapperState;->width:I

    iget v2, p0, Lcom/google/android/material/drawable/ScaledDrawableWrapper$ScaledDrawableWrapperState;->height:I

    invoke-direct {v0, p1, v1, v2}, Lcom/google/android/material/drawable/ScaledDrawableWrapper;-><init>(Landroid/graphics/drawable/Drawable;II)V

    return-object v0
.end method

.method public newDrawable(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;
    .locals 2
    .param p1    # Landroid/content/res/Resources;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Landroid/content/res/Resources$Theme;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 5
    iget-object v0, p0, Lcom/google/android/material/drawable/ScaledDrawableWrapper$ScaledDrawableWrapperState;->wrappedDrawableState:Landroid/graphics/drawable/Drawable$ConstantState;

    invoke-virtual {v0, p1, p2}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 6
    new-instance p2, Lcom/google/android/material/drawable/ScaledDrawableWrapper;

    iget v0, p0, Lcom/google/android/material/drawable/ScaledDrawableWrapper$ScaledDrawableWrapperState;->width:I

    iget v1, p0, Lcom/google/android/material/drawable/ScaledDrawableWrapper$ScaledDrawableWrapperState;->height:I

    invoke-direct {p2, p1, v0, v1}, Lcom/google/android/material/drawable/ScaledDrawableWrapper;-><init>(Landroid/graphics/drawable/Drawable;II)V

    return-object p2
.end method
