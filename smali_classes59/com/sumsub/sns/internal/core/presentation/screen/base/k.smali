.class public final Lcom/sumsub/sns/internal/core/presentation/screen/base/k;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


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
    const-string v0, "getScreens()Ljava/util/List;"

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    const-class v2, Lcom/sumsub/sns/internal/core/presentation/screen/base/k;

    .line 6
    .line 7
    .line 8
    const-string/jumbo v3, "screens"

    .line 9
    .line 10
    .line 11
    invoke-static {v2, v3, v0, v1}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 12
    move-result-object v0

    .line 13
    const/4 v2, 0x1

    .line 14
    .line 15
    new-array v2, v2, [Lkotlin/reflect/KProperty;

    .line 16
    .line 17
    aput-object v0, v2, v1

    .line 18
    .line 19
    sput-object v2, Lcom/sumsub/sns/internal/core/presentation/screen/base/k;->c:[Lkotlin/reflect/KProperty;

    .line 20
    return-void
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
    .line 8
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 9
    move-result-object v1

    .line 10
    const/4 v2, 0x0

    .line 11
    .line 12
    .line 13
    const-string/jumbo v3, "screenStack"

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, p1, v3, v1, v2}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 17
    .line 18
    iput-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/screen/base/k;->a:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 19
    .line 20
    .line 21
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, v3, v0}, Landroidx/lifecycle/SavedStateHandle;->getStateFlow(Ljava/lang/String;Ljava/lang/Object;)Lkotlinx/coroutines/flow/w;

    .line 26
    move-result-object p1

    .line 27
    .line 28
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/screen/base/k;->b:Lkotlinx/coroutines/flow/w;

    .line 29
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

.method public static final a(Landroid/os/Parcelable;Ljava/util/List;)Ljava/util/List;
    .locals 2

    .line 4
    invoke-interface {p1, p0}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 5
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    invoke-static {p1, v0}, Lkotlin/collections/CollectionsKt;->take(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final a(Ljava/util/List;)Ljava/util/List;
    .locals 1

    const/4 v0, 0x1

    .line 2
    invoke-static {p0, v0}, Lkotlin/collections/CollectionsKt;->dropLast(Ljava/util/List;I)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroid/os/Parcelable;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 2
    invoke-static {p1, p0}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroid/os/Parcelable;Ljava/util/List;)Ljava/util/List;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    const/4 v0, 0x1

    .line 13
    .line 14
    .line 15
    invoke-static {p1, v0}, Lkotlin/collections/CollectionsKt;->dropLast(Ljava/util/List;I)Ljava/util/List;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    .line 19
    invoke-static {p1, p0}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    .line 20
    move-result-object p0

    .line 21
    return-object p0
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


# virtual methods
.method public final a()Ljava/util/List;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/screen/base/k;->a:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v1, Lcom/sumsub/sns/internal/core/presentation/screen/base/k;->c:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public final a(Lcom/sumsub/sns/internal/core/presentation/screen/navigation/i;)V
    .locals 1

    .line 3
    new-instance v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/w;

    invoke-direct {v0, p1}, Lcom/sumsub/sns/internal/core/presentation/screen/base/w;-><init>(Landroid/os/Parcelable;)V

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/core/presentation/screen/base/k;->a(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/core/presentation/screen/navigation/k;)V
    .locals 1

    .line 6
    new-instance v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/u;

    invoke-direct {v0, p1}, Lcom/sumsub/sns/internal/core/presentation/screen/base/u;-><init>(Landroid/os/Parcelable;)V

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/core/presentation/screen/base/k;->a(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final a(Lkotlin/jvm/functions/Function1;)V
    .locals 3

    .line 7
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/core/presentation/screen/base/k;->a()Ljava/util/List;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    .line 8
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/screen/base/k;->a:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v1, Lcom/sumsub/sns/internal/core/presentation/screen/base/k;->c:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    .line 9
    iget-object v1, v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 10
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v1, v0, p1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final b()V
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/core/presentation/screen/base/k;->a()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->lastOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Parcelable;

    if-nez v0, :cond_0

    return-void

    .line 4
    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/x;

    invoke-direct {v0}, Lcom/sumsub/sns/internal/core/presentation/screen/base/x;-><init>()V

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/core/presentation/screen/base/k;->a(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final b(Lcom/sumsub/sns/internal/core/presentation/screen/navigation/i;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/v;

    invoke-direct {v0, p1}, Lcom/sumsub/sns/internal/core/presentation/screen/base/v;-><init>(Landroid/os/Parcelable;)V

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/core/presentation/screen/base/k;->a(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
