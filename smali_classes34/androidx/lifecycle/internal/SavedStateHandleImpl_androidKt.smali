.class public final Landroidx/lifecycle/internal/SavedStateHandleImpl_androidKt;
.super Ljava/lang/Object;
.source "SavedStateHandleImpl.android.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u00012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0000\"\u001c\u0010\u0004\u001a\u0010\u0012\u000c\u0012\n\u0012\u0006\u0008\u0001\u0012\u00020\u00030\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"
    }
    d2 = {
        "isAcceptableType",
        "",
        "value",
        "",
        "ACCEPTABLE_CLASSES",
        "",
        "Ljava/lang/Class;",
        "lifecycle-viewmodel-savedstate_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSavedStateHandleImpl.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleImpl.android.kt\nandroidx/lifecycle/internal/SavedStateHandleImpl_androidKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,66:1\n1755#2,3:67\n*S KotlinDebug\n*F\n+ 1 SavedStateHandleImpl.android.kt\nandroidx/lifecycle/internal/SavedStateHandleImpl_androidKt\n*L\n28#1:67,3\n*E\n"
    }
.end annotation


# static fields
.field private static final ACCEPTABLE_CLASSES:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "+",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 30

    .line 1
    .line 2
    const-class v28, Landroid/util/Size;

    .line 3
    .line 4
    const-class v29, Landroid/util/SizeF;

    .line 5
    .line 6
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 7
    .line 8
    const-class v2, [Z

    .line 9
    .line 10
    sget-object v3, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 11
    .line 12
    const-class v4, [D

    .line 13
    .line 14
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 15
    .line 16
    const-class v6, [I

    .line 17
    .line 18
    sget-object v7, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 19
    .line 20
    const-class v8, [J

    .line 21
    .line 22
    const-class v9, Ljava/lang/String;

    .line 23
    .line 24
    const-class v10, [Ljava/lang/String;

    .line 25
    .line 26
    const-class v11, Landroid/os/Binder;

    .line 27
    .line 28
    const-class v12, Landroid/os/Bundle;

    .line 29
    .line 30
    sget-object v13, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 31
    .line 32
    const-class v14, [B

    .line 33
    .line 34
    sget-object v15, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 35
    .line 36
    const-class v16, [C

    .line 37
    .line 38
    const-class v17, Ljava/lang/CharSequence;

    .line 39
    .line 40
    const-class v18, [Ljava/lang/CharSequence;

    .line 41
    .line 42
    const-class v19, Ljava/util/ArrayList;

    .line 43
    .line 44
    sget-object v20, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 45
    .line 46
    const-class v21, [F

    .line 47
    .line 48
    const-class v22, Landroid/os/Parcelable;

    .line 49
    .line 50
    const-class v23, [Landroid/os/Parcelable;

    .line 51
    .line 52
    const-class v24, Ljava/io/Serializable;

    .line 53
    .line 54
    sget-object v25, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 55
    .line 56
    const-class v26, [S

    .line 57
    .line 58
    const-class v27, Landroid/util/SparseArray;

    .line 59
    .line 60
    .line 61
    filled-new-array/range {v1 .. v29}, [Ljava/lang/Class;

    .line 62
    move-result-object v0

    .line 63
    .line 64
    .line 65
    invoke-static {v0}, Lkotlin/collections/ArraysKt;->filterNotNull([Ljava/lang/Object;)Ljava/util/List;

    .line 66
    move-result-object v0

    .line 67
    .line 68
    sput-object v0, Landroidx/lifecycle/internal/SavedStateHandleImpl_androidKt;->ACCEPTABLE_CLASSES:Ljava/util/List;

    .line 69
    return-void
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public static final isAcceptableType(Ljava/lang/Object;)Z
    .locals 2
    .param p0    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    if-eqz p0, :cond_3

    .line 3
    .line 4
    sget-object v0, Landroidx/lifecycle/internal/SavedStateHandleImpl_androidKt;->ACCEPTABLE_CLASSES:Ljava/util/List;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 10
    move-result v1

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    goto :goto_0

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    .line 20
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    move-result v1

    .line 22
    .line 23
    if-eqz v1, :cond_2

    .line 24
    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    move-result-object v1

    .line 28
    .line 29
    check-cast v1, Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, p0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 33
    move-result v1

    .line 34
    .line 35
    if-eqz v1, :cond_1

    .line 36
    goto :goto_1

    .line 37
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 38
    return p0

    .line 39
    :cond_3
    :goto_1
    const/4 p0, 0x1

    .line 40
    return p0
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
.end method
