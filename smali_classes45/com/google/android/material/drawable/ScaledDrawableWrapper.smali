.class public Lcom/google/android/material/drawable/ScaledDrawableWrapper;
.super Landroidx/appcompat/graphics/drawable/DrawableWrapperCompat;
.source "ScaledDrawableWrapper.java"


# annotations
.annotation build Landroidx/annotation/RestrictTo;
    value = {
        .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/material/drawable/ScaledDrawableWrapper$ScaledDrawableWrapperState;
    }
.end annotation


# instance fields
.field private mutated:Z

.field private state:Lcom/google/android/material/drawable/ScaledDrawableWrapper$ScaledDrawableWrapperState;


# direct methods
.method public constructor <init>(Landroid/graphics/drawable/Drawable;II)V
    .locals 1
    .param p1    # Landroid/graphics/drawable/Drawable;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Landroidx/appcompat/graphics/drawable/DrawableWrapperCompat;-><init>(Landroid/graphics/drawable/Drawable;)V

    .line 4
    .line 5
    new-instance v0, Lcom/google/android/material/drawable/ScaledDrawableWrapper$ScaledDrawableWrapperState;

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p1}, Lcom/google/android/material/drawable/ScaledDrawableWrapper;->getConstantStateFrom(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable$ConstantState;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, p1, p2, p3}, Lcom/google/android/material/drawable/ScaledDrawableWrapper$ScaledDrawableWrapperState;-><init>(Landroid/graphics/drawable/Drawable$ConstantState;II)V

    .line 13
    .line 14
    iput-object v0, p0, Lcom/google/android/material/drawable/ScaledDrawableWrapper;->state:Lcom/google/android/material/drawable/ScaledDrawableWrapper$ScaledDrawableWrapperState;

    .line 15
    return-void
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

.method private getConstantStateFrom(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable$ConstantState;
    .locals 0
    .param p1    # Landroid/graphics/drawable/Drawable;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    .line 6
    move-result-object p1

    .line 7
    return-object p1

    .line 8
    :cond_0
    const/4 p1, 0x0

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
.end method


# virtual methods
.method public getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/android/material/drawable/ScaledDrawableWrapper;->state:Lcom/google/android/material/drawable/ScaledDrawableWrapper$ScaledDrawableWrapperState;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/android/material/drawable/ScaledDrawableWrapper$ScaledDrawableWrapperState;->canConstantState()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/google/android/material/drawable/ScaledDrawableWrapper;->state:Lcom/google/android/material/drawable/ScaledDrawableWrapper$ScaledDrawableWrapperState;

    .line 11
    return-object v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return-object v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public getIntrinsicHeight()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/android/material/drawable/ScaledDrawableWrapper;->state:Lcom/google/android/material/drawable/ScaledDrawableWrapper$ScaledDrawableWrapperState;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/google/android/material/drawable/ScaledDrawableWrapper$ScaledDrawableWrapperState;->access$100(Lcom/google/android/material/drawable/ScaledDrawableWrapper$ScaledDrawableWrapperState;)I

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

.method public getIntrinsicWidth()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/android/material/drawable/ScaledDrawableWrapper;->state:Lcom/google/android/material/drawable/ScaledDrawableWrapper$ScaledDrawableWrapperState;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/google/android/material/drawable/ScaledDrawableWrapper$ScaledDrawableWrapperState;->access$000(Lcom/google/android/material/drawable/ScaledDrawableWrapper$ScaledDrawableWrapperState;)I

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

.method public mutate()Landroid/graphics/drawable/Drawable;
    .locals 4
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/google/android/material/drawable/ScaledDrawableWrapper;->mutated:Z

    .line 3
    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    .line 7
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    if-ne v0, p0, :cond_1

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/appcompat/graphics/drawable/DrawableWrapperCompat;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 20
    .line 21
    :cond_0
    new-instance v1, Lcom/google/android/material/drawable/ScaledDrawableWrapper$ScaledDrawableWrapperState;

    .line 22
    .line 23
    .line 24
    invoke-direct {p0, v0}, Lcom/google/android/material/drawable/ScaledDrawableWrapper;->getConstantStateFrom(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable$ConstantState;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    iget-object v2, p0, Lcom/google/android/material/drawable/ScaledDrawableWrapper;->state:Lcom/google/android/material/drawable/ScaledDrawableWrapper$ScaledDrawableWrapperState;

    .line 28
    .line 29
    .line 30
    invoke-static {v2}, Lcom/google/android/material/drawable/ScaledDrawableWrapper$ScaledDrawableWrapperState;->access$000(Lcom/google/android/material/drawable/ScaledDrawableWrapper$ScaledDrawableWrapperState;)I

    .line 31
    move-result v2

    .line 32
    .line 33
    iget-object v3, p0, Lcom/google/android/material/drawable/ScaledDrawableWrapper;->state:Lcom/google/android/material/drawable/ScaledDrawableWrapper$ScaledDrawableWrapperState;

    .line 34
    .line 35
    .line 36
    invoke-static {v3}, Lcom/google/android/material/drawable/ScaledDrawableWrapper$ScaledDrawableWrapperState;->access$100(Lcom/google/android/material/drawable/ScaledDrawableWrapper$ScaledDrawableWrapperState;)I

    .line 37
    move-result v3

    .line 38
    .line 39
    .line 40
    invoke-direct {v1, v0, v2, v3}, Lcom/google/android/material/drawable/ScaledDrawableWrapper$ScaledDrawableWrapperState;-><init>(Landroid/graphics/drawable/Drawable$ConstantState;II)V

    .line 41
    .line 42
    iput-object v1, p0, Lcom/google/android/material/drawable/ScaledDrawableWrapper;->state:Lcom/google/android/material/drawable/ScaledDrawableWrapper$ScaledDrawableWrapperState;

    .line 43
    const/4 v0, 0x1

    .line 44
    .line 45
    iput-boolean v0, p0, Lcom/google/android/material/drawable/ScaledDrawableWrapper;->mutated:Z

    .line 46
    :cond_1
    return-object p0
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

.method public setDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1
    .param p1    # Landroid/graphics/drawable/Drawable;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Landroidx/appcompat/graphics/drawable/DrawableWrapperCompat;->setDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/google/android/material/drawable/ScaledDrawableWrapper;->state:Lcom/google/android/material/drawable/ScaledDrawableWrapper$ScaledDrawableWrapperState;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, p1}, Lcom/google/android/material/drawable/ScaledDrawableWrapper;->getConstantStateFrom(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable$ConstantState;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    .line 14
    invoke-static {v0, p1}, Lcom/google/android/material/drawable/ScaledDrawableWrapper$ScaledDrawableWrapperState;->access$202(Lcom/google/android/material/drawable/ScaledDrawableWrapper$ScaledDrawableWrapperState;Landroid/graphics/drawable/Drawable$ConstantState;)Landroid/graphics/drawable/Drawable$ConstantState;

    .line 15
    const/4 p1, 0x0

    .line 16
    .line 17
    iput-boolean p1, p0, Lcom/google/android/material/drawable/ScaledDrawableWrapper;->mutated:Z

    .line 18
    :cond_0
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method
