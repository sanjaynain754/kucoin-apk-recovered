.class public final Lcom/sumsub/sns/internal/core/presentation/android/g;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lcom/sumsub/sns/internal/core/presentation/common/g;


# static fields
.field public static final synthetic c:[Lkotlin/reflect/KProperty;


# instance fields
.field public final a:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public final b:Lkotlinx/coroutines/flow/w;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    .line 2
    const-string v0, "get_state()Lcom/sumsub/sns/internal/core/presentation/android/PermissionController$State;"

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    const-class v2, Lcom/sumsub/sns/internal/core/presentation/android/g;

    .line 6
    .line 7
    const-string v3, "_state"

    .line 8
    .line 9
    .line 10
    invoke-static {v2, v3, v0, v1}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 11
    move-result-object v0

    .line 12
    const/4 v2, 0x1

    .line 13
    .line 14
    new-array v2, v2, [Lkotlin/reflect/KProperty;

    .line 15
    .line 16
    aput-object v0, v2, v1

    .line 17
    .line 18
    sput-object v2, Lcom/sumsub/sns/internal/core/presentation/android/g;->c:[Lkotlin/reflect/KProperty;

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

.method public constructor <init>(Landroidx/lifecycle/SavedStateHandle;)V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 6
    .line 7
    sget-object v1, Lcom/sumsub/sns/internal/core/presentation/android/e;->a:Lcom/sumsub/sns/internal/core/presentation/android/e;

    .line 8
    .line 9
    const-string v2, "PERMISSION_CONTROLLER_STATE"

    .line 10
    const/4 v3, 0x0

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, p1, v2, v1, v3}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 14
    .line 15
    iput-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/android/g;->a:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 16
    .line 17
    sget-object v1, Lcom/sumsub/sns/internal/core/presentation/android/g;->c:[Lkotlin/reflect/KProperty;

    .line 18
    .line 19
    aget-object v1, v1, v3

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/android/f;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v2, v0}, Landroidx/lifecycle/SavedStateHandle;->getStateFlow(Ljava/lang/String;Ljava/lang/Object;)Lkotlinx/coroutines/flow/w;

    .line 29
    move-result-object p1

    .line 30
    .line 31
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/android/g;->b:Lkotlinx/coroutines/flow/w;

    .line 32
    return-void
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
.end method


# virtual methods
.method public final a(Lcom/sumsub/sns/internal/core/presentation/android/f;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/android/g;->a:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v1, Lcom/sumsub/sns/internal/core/presentation/android/g;->c:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    .line 2
    iget-object v1, v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 3
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v1, v0, p1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final a(Ljava/util/Set;Z)V
    .locals 6

    .line 4
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/android/g;->a:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v1, Lcom/sumsub/sns/internal/core/presentation/android/g;->c:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/android/f;

    .line 5
    instance-of v1, v0, Lcom/sumsub/sns/internal/core/presentation/android/c;

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/android/c;

    goto :goto_0

    :cond_0
    move-object v0, v3

    :goto_0
    if-nez v0, :cond_1

    return-void

    .line 6
    :cond_1
    iget-object v1, v0, Lcom/sumsub/sns/internal/core/presentation/android/c;->a:Ljava/util/Set;

    .line 7
    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    .line 8
    iget v4, v0, Lcom/sumsub/sns/internal/core/presentation/android/c;->d:I

    add-int/lit8 v4, v4, 0x1

    const/4 v5, 0x2

    .line 9
    invoke-static {v0, p1, v1, v4, v5}, Lcom/sumsub/sns/internal/core/presentation/android/c;->a(Lcom/sumsub/sns/internal/core/presentation/android/c;Ljava/util/Set;ZII)Lcom/sumsub/sns/internal/core/presentation/android/c;

    move-result-object p1

    if-eqz p2, :cond_2

    const/16 p2, 0xd

    .line 10
    invoke-static {p1, v3, v2, v2, p2}, Lcom/sumsub/sns/internal/core/presentation/android/c;->a(Lcom/sumsub/sns/internal/core/presentation/android/c;Ljava/util/Set;ZII)Lcom/sumsub/sns/internal/core/presentation/android/c;

    move-result-object p1

    .line 11
    :cond_2
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/core/presentation/android/g;->a(Lcom/sumsub/sns/internal/core/presentation/android/f;)V

    return-void
.end method

.method public final getState()Lkotlinx/coroutines/flow/w;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/android/g;->b:Lkotlinx/coroutines/flow/w;

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
