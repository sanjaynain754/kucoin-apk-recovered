.class public final Lcom/sumsub/sns/internal/features/presentation/geo/v0;
.super Lcom/sumsub/sns/core/presentation/base/p0;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lcom/sumsub/sns/internal/core/presentation/form/k;


# static fields
.field public static final synthetic w:[Lkotlin/reflect/KProperty;


# instance fields
.field public final a:Lcom/sumsub/sns/internal/features/domain/geo/u;

.field public final b:Lcom/sumsub/sns/internal/features/domain/geo/x;

.field public final c:Lcom/sumsub/sns/internal/features/domain/geo/z;

.field public final d:Z

.field public final e:Lcom/sumsub/sns/internal/features/domain/e;

.field public final f:Lcom/sumsub/sns/internal/features/presentation/verification/d;

.field public final g:Lcom/sumsub/sns/internal/features/data/model/common/Document;

.field public final h:Lcom/sumsub/sns/internal/core/presentation/android/location/s;

.field public final i:Lcom/sumsub/sns/internal/core/presentation/android/t;

.field public final j:Lcom/sumsub/sns/internal/core/presentation/android/location/l;

.field public final k:Lkotlinx/coroutines/flow/w;

.field public final l:Lcom/sumsub/sns/internal/features/presentation/geo/Y;

.field public final m:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public n:I

.field public final o:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public final p:Lkotlinx/coroutines/flow/w;

.field public final q:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public final r:Lkotlinx/coroutines/flow/w;

.field public s:Z

.field public final t:Lkotlinx/coroutines/flow/n;

.field public final u:Lkotlinx/coroutines/flow/n;

.field public v:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    .line 2
    const-class v0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;

    .line 3
    .line 4
    const-string v1, "addressDataCache"

    .line 5
    .line 6
    const-string v2, "getAddressDataCache()Ljava/util/List;"

    .line 7
    const/4 v3, 0x0

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1, v2, v3}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    const-string v2, "locationAccessRefusedCounter"

    .line 14
    .line 15
    const-string v4, "getLocationAccessRefusedCounter()I"

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v2, v4, v3}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 19
    move-result-object v2

    .line 20
    .line 21
    .line 22
    const-string/jumbo v4, "vpnWarningCounter"

    .line 23
    .line 24
    const-string v5, "getVpnWarningCounter()I"

    .line 25
    .line 26
    .line 27
    invoke-static {v0, v4, v5, v3}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 28
    move-result-object v0

    .line 29
    const/4 v4, 0x3

    .line 30
    .line 31
    new-array v4, v4, [Lkotlin/reflect/KProperty;

    .line 32
    .line 33
    aput-object v1, v4, v3

    .line 34
    const/4 v1, 0x1

    .line 35
    .line 36
    aput-object v2, v4, v1

    .line 37
    const/4 v1, 0x2

    .line 38
    .line 39
    aput-object v0, v4, v1

    .line 40
    .line 41
    sput-object v4, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->w:[Lkotlin/reflect/KProperty;

    .line 42
    return-void
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

.method public constructor <init>(Landroidx/lifecycle/SavedStateHandle;Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;Lcom/sumsub/sns/internal/features/domain/geo/u;Lcom/sumsub/sns/internal/features/domain/geo/x;Lcom/sumsub/sns/internal/features/domain/geo/z;ZLcom/sumsub/sns/internal/features/domain/e;Lcom/sumsub/sns/internal/features/presentation/verification/d;Lcom/sumsub/sns/internal/features/data/model/common/Document;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/sumsub/sns/core/presentation/base/P;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lcom/sumsub/sns/core/presentation/base/P;-><init>(I)V

    .line 2
    invoke-direct {p0, p2, p3, v0}, Lcom/sumsub/sns/core/presentation/base/p0;-><init>(Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;Lcom/sumsub/sns/core/presentation/base/P;)V

    .line 3
    iput-object p4, p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->a:Lcom/sumsub/sns/internal/features/domain/geo/u;

    .line 4
    iput-object p5, p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->b:Lcom/sumsub/sns/internal/features/domain/geo/x;

    .line 5
    iput-object p6, p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->c:Lcom/sumsub/sns/internal/features/domain/geo/z;

    .line 6
    iput-boolean p7, p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->d:Z

    .line 7
    iput-object p8, p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->e:Lcom/sumsub/sns/internal/features/domain/e;

    .line 8
    iput-object p9, p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->f:Lcom/sumsub/sns/internal/features/presentation/verification/d;

    .line 9
    iput-object p10, p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->g:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 10
    invoke-interface {p11}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/sumsub/sns/internal/core/presentation/android/location/s;

    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->h:Lcom/sumsub/sns/internal/core/presentation/android/location/s;

    const/4 p2, 0x2

    .line 11
    new-array p2, p2, [Lcom/sumsub/sns/internal/core/presentation/android/K;

    sget-object p3, Lcom/sumsub/sns/internal/core/presentation/android/C;->e:Lcom/sumsub/sns/internal/core/presentation/android/C;

    const/4 p4, 0x0

    aput-object p3, p2, p4

    sget-object p3, Lcom/sumsub/sns/internal/core/presentation/android/E;->e:Lcom/sumsub/sns/internal/core/presentation/android/E;

    const/4 p5, 0x1

    aput-object p3, p2, p5

    invoke-static {p2}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p2

    .line 12
    invoke-interface {p12, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/sumsub/sns/internal/core/presentation/android/t;

    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->i:Lcom/sumsub/sns/internal/core/presentation/android/t;

    .line 13
    invoke-interface {p13}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/sumsub/sns/internal/core/presentation/android/location/l;

    iput-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->j:Lcom/sumsub/sns/internal/core/presentation/android/location/l;

    .line 14
    const-string p3, "address_by_location_countdown"

    invoke-virtual {p9, p3}, Lcom/sumsub/sns/internal/features/presentation/verification/d;->b(Ljava/lang/String;)Lkotlinx/coroutines/flow/e;

    move-result-object p3

    .line 15
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object p5

    sget-object p6, Lkotlinx/coroutines/flow/SharingStarted;->a:Lkotlinx/coroutines/flow/SharingStarted$Companion;

    invoke-virtual {p6}, Lkotlinx/coroutines/flow/SharingStarted$Companion;->getEagerly()Lkotlinx/coroutines/flow/SharingStarted;

    move-result-object p6

    const/4 p7, 0x0

    invoke-static {p3, p5, p6, p7}, Lkotlinx/coroutines/flow/g;->g0(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/m0;Lkotlinx/coroutines/flow/SharingStarted;Ljava/lang/Object;)Lkotlinx/coroutines/flow/w;

    move-result-object p3

    iput-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->k:Lkotlinx/coroutines/flow/w;

    .line 16
    new-instance p3, Lcom/sumsub/sns/internal/features/presentation/geo/Y;

    invoke-direct {p3, p0}, Lcom/sumsub/sns/internal/features/presentation/geo/Y;-><init>(Lcom/sumsub/sns/internal/features/presentation/geo/v0;)V

    iput-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->l:Lcom/sumsub/sns/internal/features/presentation/geo/Y;

    .line 17
    new-instance p3, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 18
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p5

    .line 19
    const-string p6, "addressDataCache"

    .line 20
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p8

    .line 21
    invoke-direct {p3, p1, p6, p5, p4}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 22
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->m:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 23
    new-instance p3, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 24
    const-string p5, "STATE_LOCATION_ACCESS_REFUSED_COUNTER"

    invoke-direct {p3, p1, p5, p8, p4}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 25
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->o:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 26
    invoke-virtual {p1, p5, p8}, Landroidx/lifecycle/SavedStateHandle;->getStateFlow(Ljava/lang/String;Ljava/lang/Object;)Lkotlinx/coroutines/flow/w;

    move-result-object p3

    iput-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->p:Lkotlinx/coroutines/flow/w;

    .line 27
    new-instance p3, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 28
    const-string p5, "STATE_VPN_WARNING_COUNTER"

    invoke-direct {p3, p1, p5, p8, p4}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 29
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->q:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 30
    invoke-virtual {p1, p5, p8}, Landroidx/lifecycle/SavedStateHandle;->getStateFlow(Ljava/lang/String;Ljava/lang/Object;)Lkotlinx/coroutines/flow/w;

    move-result-object p1

    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->r:Lkotlinx/coroutines/flow/w;

    .line 31
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/geo/s;->a:Lcom/sumsub/sns/internal/features/presentation/geo/s;

    invoke-static {p1}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    move-result-object p1

    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->t:Lkotlinx/coroutines/flow/n;

    .line 32
    sget-object p3, Lcom/sumsub/sns/internal/core/presentation/form/f;->e:Lcom/sumsub/sns/internal/core/presentation/form/f;

    .line 33
    invoke-static {p3}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    move-result-object p3

    iput-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->u:Lkotlinx/coroutines/flow/n;

    .line 34
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object p3

    iput-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->v:Ljava/util/Map;

    .line 35
    new-instance p3, Lcom/sumsub/sns/internal/features/presentation/geo/l0;

    invoke-direct {p3, p1, p0}, Lcom/sumsub/sns/internal/features/presentation/geo/l0;-><init>(Lkotlinx/coroutines/flow/n;Lcom/sumsub/sns/internal/features/presentation/geo/v0;)V

    .line 36
    invoke-static {p3}, Lkotlinx/coroutines/flow/g;->v(Lkotlinx/coroutines/flow/e;)Lkotlinx/coroutines/flow/e;

    move-result-object p1

    .line 37
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/p0;->getViewState()Lkotlinx/coroutines/flow/w;

    move-result-object p3

    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object p4

    new-instance p5, Lcom/sumsub/sns/internal/features/presentation/geo/h;

    invoke-direct {p5, p0, p7}, Lcom/sumsub/sns/internal/features/presentation/geo/h;-><init>(Lcom/sumsub/sns/internal/features/presentation/geo/v0;Lkotlin/coroutines/Continuation;)V

    invoke-static {p3, p4, p5}, Lcom/sumsub/sns/internal/core/common/U;->b(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/m0;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    .line 38
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object p3

    new-instance p4, Lcom/sumsub/sns/internal/features/presentation/geo/i;

    invoke-direct {p4, p0, p7}, Lcom/sumsub/sns/internal/features/presentation/geo/i;-><init>(Lcom/sumsub/sns/internal/features/presentation/geo/v0;Lkotlin/coroutines/Continuation;)V

    invoke-static {p1, p3, p4}, Lcom/sumsub/sns/internal/core/common/U;->a(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/m0;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    .line 39
    iget-object p1, p2, Lcom/sumsub/sns/internal/core/presentation/android/t;->i:Lkotlinx/coroutines/flow/e;

    .line 40
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object p2

    new-instance p3, Lcom/sumsub/sns/internal/features/presentation/geo/j;

    invoke-direct {p3, p0, p7}, Lcom/sumsub/sns/internal/features/presentation/geo/j;-><init>(Lcom/sumsub/sns/internal/features/presentation/geo/v0;Lkotlin/coroutines/Continuation;)V

    invoke-static {p1, p2, p3}, Lcom/sumsub/sns/internal/core/common/U;->a(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/m0;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    return-void
.end method

.method public static a(Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Ljava/lang/String;J)Lcom/sumsub/sns/internal/features/presentation/geo/x0;
    .locals 6

    .line 222
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 223
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string/jumbo p1, "s"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const-string/jumbo v1, "{time}"

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    goto :goto_0

    .line 224
    :cond_0
    const-string p0, ""

    .line 225
    :goto_0
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/geo/x0;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lcom/sumsub/sns/internal/features/presentation/geo/x0;-><init>(Ljava/lang/String;Lcom/sumsub/sns/internal/features/presentation/geo/G0;)V

    return-object p1
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/geo/v0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/geo/G;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/geo/G;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/geo/G;->g:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/geo/G;->g:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/geo/G;

    invoke-direct {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/geo/G;-><init>(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/geo/G;->f:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 143
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/geo/G;->g:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget v4, v0, Lcom/sumsub/sns/internal/features/presentation/geo/G;->e:I

    iget-object p0, v0, Lcom/sumsub/sns/internal/features/presentation/geo/G;->d:Ljava/lang/String;

    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/geo/G;->c:[Lkotlin/Pair;

    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/geo/G;->b:Lcom/sumsub/sns/internal/core/analytics/g;

    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/geo/G;->a:[Lkotlin/Pair;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 144
    new-instance p1, Lcom/sumsub/sns/internal/core/analytics/g;

    invoke-direct {p1}, Lcom/sumsub/sns/internal/core/analytics/g;-><init>()V

    .line 145
    sget-object v2, Lcom/sumsub/sns/internal/core/analytics/PrimaryAction;->Geolocation:Lcom/sumsub/sns/internal/core/analytics/PrimaryAction;

    invoke-virtual {p1, v2}, Lcom/sumsub/sns/internal/core/analytics/g;->a(Lcom/sumsub/sns/internal/core/analytics/PrimaryAction;)Lcom/sumsub/sns/internal/core/analytics/g;

    move-result-object v2

    .line 146
    iget-object p1, v2, Lcom/sumsub/sns/internal/core/analytics/g;->b:Ljava/util/ArrayList;

    sget-object v5, Lcom/sumsub/sns/internal/core/analytics/PrimaryActionState;->Failed:Lcom/sumsub/sns/internal/core/analytics/PrimaryActionState;

    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x2

    .line 147
    new-array p1, p1, [Lkotlin/Pair;

    iget v5, p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->n:I

    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v5

    const-string v6, "attempt"

    invoke-static {v6, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    aput-object v5, p1, v3

    .line 148
    iget-object v5, p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->i:Lcom/sumsub/sns/internal/core/presentation/android/t;

    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/geo/G;->a:[Lkotlin/Pair;

    iput-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/geo/G;->b:Lcom/sumsub/sns/internal/core/analytics/g;

    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/geo/G;->c:[Lkotlin/Pair;

    const-string v6, "isAuthorized"

    iput-object v6, v0, Lcom/sumsub/sns/internal/features/presentation/geo/G;->d:Ljava/lang/String;

    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/geo/G;->e:I

    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/geo/G;->g:I

    invoke-virtual {p0, v5, v0}, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->a(Lcom/sumsub/sns/internal/core/presentation/android/t;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p1

    move-object v1, v0

    move-object p1, p0

    move-object p0, v6

    :goto_1
    invoke-static {p0, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    aput-object p0, v1, v4

    .line 149
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    invoke-static {v0}, Lkotlin/collections/ArraysKt;->filterNotNull([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Lkotlin/collections/MapsKt;->toMap(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object p0

    iput-object p0, v2, Lcom/sumsub/sns/internal/core/analytics/g;->c:Ljava/util/Map;

    .line 151
    invoke-virtual {v2, v3}, Lcom/sumsub/sns/internal/core/analytics/g;->a(Z)V

    .line 152
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/geo/v0;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Lcom/sumsub/sns/internal/features/presentation/geo/x;)Lkotlinx/coroutines/flow/e;
    .locals 14

    move-object/from16 v0, p2

    .line 17
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/geo/s;->a:Lcom/sumsub/sns/internal/features/presentation/geo/s;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const-string/jumbo v2, "sns_geolocation_intro_subtitle_location"

    const-string/jumbo v4, "sns_geolocation_intro_title"

    const-string/jumbo v5, "sns_geolocation_intro_subtitle_document"

    const-string/jumbo v6, "sns_geolocation_intro_subtitle_divider"

    const/4 v7, 0x0

    if-eqz v1, :cond_2

    .line 18
    new-instance v8, Lcom/sumsub/sns/internal/features/presentation/geo/B0;

    .line 19
    sget-object v9, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->LOCATION_ON:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    .line 20
    invoke-virtual {p1, v4}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 21
    invoke-virtual {p1, v2}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 22
    iget-boolean v0, p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->s:Z

    if-eqz v0, :cond_0

    move-object v12, v7

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v6}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object v12, v0

    .line 23
    :goto_0
    iget-boolean v0, p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->s:Z

    if-eqz v0, :cond_1

    move-object v13, v7

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v5}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object v13, v0

    .line 24
    :goto_1
    invoke-direct/range {v8 .. v13}, Lcom/sumsub/sns/internal/features/presentation/geo/B0;-><init>(Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->k:Lkotlinx/coroutines/flow/w;

    .line 26
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/geo/T;

    const-string/jumbo v4, "sns_geolocation_action_allowAccessInTime"

    const-string/jumbo v5, "sns_geolocation_action_allowAccess"

    move-object v2, p0

    move-object v3, p1

    invoke-direct/range {v0 .. v5}, Lcom/sumsub/sns/internal/features/presentation/geo/T;-><init>(Lkotlinx/coroutines/flow/e;Lcom/sumsub/sns/internal/features/presentation/geo/v0;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->p:Lkotlinx/coroutines/flow/w;

    iget-object v4, p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->r:Lkotlinx/coroutines/flow/w;

    new-instance v5, Lcom/sumsub/sns/internal/features/presentation/geo/P;

    invoke-direct {v5, p1, p0, v7}, Lcom/sumsub/sns/internal/features/presentation/geo/P;-><init>(Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Lcom/sumsub/sns/internal/features/presentation/geo/v0;Lkotlin/coroutines/Continuation;)V

    invoke-static {v2, v4, v5}, Lkotlinx/coroutines/flow/g;->m(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/e;

    move-result-object p0

    .line 28
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/geo/X;

    invoke-direct {v1, v7}, Lcom/sumsub/sns/internal/features/presentation/geo/X;-><init>(Lkotlin/coroutines/Continuation;)V

    invoke-static {v0, p0, v1}, Lkotlinx/coroutines/flow/g;->m(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/e;

    move-result-object p0

    .line 29
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/geo/W;

    invoke-direct {v0, p0, v8}, Lcom/sumsub/sns/internal/features/presentation/geo/W;-><init>(Lkotlinx/coroutines/flow/e;Lcom/sumsub/sns/internal/features/presentation/geo/B0;)V

    return-object v0

    .line 30
    :cond_2
    instance-of v8, v0, Lcom/sumsub/sns/internal/features/presentation/geo/t;

    if-nez v8, :cond_b

    .line 31
    instance-of v8, v0, Lcom/sumsub/sns/internal/features/presentation/geo/u;

    if-eqz v8, :cond_3

    goto/16 :goto_6

    .line 32
    :cond_3
    instance-of v2, v0, Lcom/sumsub/sns/internal/features/presentation/geo/w;

    if-eqz v2, :cond_6

    .line 33
    new-instance v8, Lcom/sumsub/sns/internal/features/presentation/geo/B0;

    .line 34
    sget-object v9, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->LOCATION_OFF:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    .line 35
    const-string/jumbo v0, "sns_geolocation_vpnWarning_title"

    invoke-virtual {p1, v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 36
    const-string/jumbo v0, "sns_geolocation_vpnWarning_subtitle_location"

    invoke-virtual {p1, v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 37
    iget-boolean v0, p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->s:Z

    if-eqz v0, :cond_4

    move-object v12, v7

    goto :goto_2

    :cond_4
    const-string/jumbo v0, "sns_geolocation_vpnWarning_subtitle_divider"

    invoke-virtual {p1, v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object v12, v0

    .line 38
    :goto_2
    iget-boolean v0, p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->s:Z

    if-eqz v0, :cond_5

    move-object v13, v7

    goto :goto_3

    :cond_5
    const-string/jumbo v0, "sns_geolocation_vpnWarning_subtitle_document"

    invoke-virtual {p1, v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object v13, v0

    .line 39
    :goto_3
    invoke-direct/range {v8 .. v13}, Lcom/sumsub/sns/internal/features/presentation/geo/B0;-><init>(Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->k:Lkotlinx/coroutines/flow/w;

    .line 41
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/geo/T;

    const-string/jumbo v4, "sns_geolocation_vpnWarning_action_retryInTime"

    const-string/jumbo v5, "sns_geolocation_vpnWarning_action_retry"

    move-object v2, p0

    move-object v3, p1

    invoke-direct/range {v0 .. v5}, Lcom/sumsub/sns/internal/features/presentation/geo/T;-><init>(Lkotlinx/coroutines/flow/e;Lcom/sumsub/sns/internal/features/presentation/geo/v0;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->p:Lkotlinx/coroutines/flow/w;

    iget-object v4, p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->r:Lkotlinx/coroutines/flow/w;

    new-instance v5, Lcom/sumsub/sns/internal/features/presentation/geo/P;

    invoke-direct {v5, p1, p0, v7}, Lcom/sumsub/sns/internal/features/presentation/geo/P;-><init>(Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Lcom/sumsub/sns/internal/features/presentation/geo/v0;Lkotlin/coroutines/Continuation;)V

    invoke-static {v1, v4, v5}, Lkotlinx/coroutines/flow/g;->m(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/e;

    move-result-object p0

    .line 43
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/geo/u0;

    invoke-direct {v1, v7}, Lcom/sumsub/sns/internal/features/presentation/geo/u0;-><init>(Lkotlin/coroutines/Continuation;)V

    invoke-static {v0, p0, v1}, Lkotlinx/coroutines/flow/g;->m(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/e;

    move-result-object p0

    .line 44
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/geo/t0;

    invoke-direct {v0, p0, v8}, Lcom/sumsub/sns/internal/features/presentation/geo/t0;-><init>(Lkotlinx/coroutines/flow/e;Lcom/sumsub/sns/internal/features/presentation/geo/B0;)V

    return-object v0

    .line 45
    :cond_6
    instance-of v1, v0, Lcom/sumsub/sns/internal/features/presentation/geo/v;

    const/4 v4, 0x1

    if-eqz v1, :cond_9

    .line 46
    new-instance v8, Lcom/sumsub/sns/internal/features/presentation/geo/B0;

    .line 47
    sget-object v9, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->LOCATION_OFF:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    .line 48
    sget-object v0, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    .line 49
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->g:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object v0

    .line 50
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 51
    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    .line 52
    const-string/jumbo v1, "sns_step_%s_title"

    invoke-static {v0, v4, v1, p1}, Lcom/sumsub/sns/internal/core/presentation/intro/d;->a([Ljava/lang/Object;ILjava/lang/String;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;)Ljava/lang/String;

    move-result-object v10

    .line 53
    const-string/jumbo v0, "sns_geolocation_detection_invalidLocation"

    invoke-virtual {p1, v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 54
    iget-boolean v0, p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->s:Z

    if-eqz v0, :cond_7

    move-object v12, v7

    goto :goto_4

    :cond_7
    invoke-virtual {p1, v6}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object v12, v0

    .line 55
    :goto_4
    iget-boolean v0, p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->s:Z

    if-eqz v0, :cond_8

    move-object v13, v7

    goto :goto_5

    :cond_8
    invoke-virtual {p1, v5}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object v13, v0

    .line 56
    :goto_5
    invoke-direct/range {v8 .. v13}, Lcom/sumsub/sns/internal/features/presentation/geo/B0;-><init>(Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->k:Lkotlinx/coroutines/flow/w;

    .line 58
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/geo/T;

    const-string/jumbo v4, "sns_geolocation_action_allowAccessInTime"

    const-string/jumbo v5, "sns_geolocation_action_allowAccess"

    move-object v2, p0

    move-object v3, p1

    invoke-direct/range {v0 .. v5}, Lcom/sumsub/sns/internal/features/presentation/geo/T;-><init>(Lkotlinx/coroutines/flow/e;Lcom/sumsub/sns/internal/features/presentation/geo/v0;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/geo/p0;

    invoke-direct {v1, p1, p0, v7}, Lcom/sumsub/sns/internal/features/presentation/geo/p0;-><init>(Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Lcom/sumsub/sns/internal/features/presentation/geo/v0;Lkotlin/coroutines/Continuation;)V

    .line 60
    new-instance p0, Lcom/sumsub/sns/internal/core/common/D;

    invoke-direct {p0, v1, v7}, Lcom/sumsub/sns/internal/core/common/D;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    invoke-static {p0}, Lkotlinx/coroutines/flow/g;->K(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/e;

    move-result-object p0

    .line 61
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/geo/q0;

    invoke-direct {v1, v7}, Lcom/sumsub/sns/internal/features/presentation/geo/q0;-><init>(Lkotlin/coroutines/Continuation;)V

    invoke-static {v0, p0, v1}, Lkotlinx/coroutines/flow/g;->m(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/e;

    move-result-object p0

    .line 62
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/geo/o0;

    invoke-direct {v0, p0, v8}, Lcom/sumsub/sns/internal/features/presentation/geo/o0;-><init>(Lkotlinx/coroutines/flow/e;Lcom/sumsub/sns/internal/features/presentation/geo/B0;)V

    return-object v0

    .line 63
    :cond_9
    instance-of v1, v0, Lcom/sumsub/sns/internal/features/presentation/geo/r;

    if-eqz v1, :cond_a

    .line 64
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/geo/r;

    .line 65
    iget-object v6, v0, Lcom/sumsub/sns/internal/features/presentation/geo/r;->a:Ljava/util/List;

    .line 66
    sget-object v0, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    .line 67
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->g:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object v0

    .line 68
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 69
    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    .line 70
    const-string/jumbo v1, "sns_geolocation_form_title"

    invoke-static {v0, v4, v1, p1}, Lcom/sumsub/sns/internal/core/presentation/intro/d;->a([Ljava/lang/Object;ILjava/lang/String;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;)Ljava/lang/String;

    move-result-object v8

    .line 71
    const-string/jumbo v0, "sns_geolocation_form_subtitle"

    invoke-virtual {p1, v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 72
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/geo/L;

    invoke-direct {v0, p1, p0, v7}, Lcom/sumsub/sns/internal/features/presentation/geo/L;-><init>(Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Lcom/sumsub/sns/internal/features/presentation/geo/v0;Lkotlin/coroutines/Continuation;)V

    .line 73
    new-instance v1, Lcom/sumsub/sns/internal/core/common/D;

    invoke-direct {v1, v0, v7}, Lcom/sumsub/sns/internal/core/common/D;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    invoke-static {v1}, Lkotlinx/coroutines/flow/g;->K(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/e;

    move-result-object v10

    .line 74
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->k:Lkotlinx/coroutines/flow/w;

    .line 75
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/geo/T;

    const-string/jumbo v4, "sns_geolocation_form_action_retryInTime"

    const-string/jumbo v5, "sns_geolocation_form_action_retry"

    move-object v2, p0

    move-object v3, p1

    invoke-direct/range {v0 .. v5}, Lcom/sumsub/sns/internal/features/presentation/geo/T;-><init>(Lkotlinx/coroutines/flow/e;Lcom/sumsub/sns/internal/features/presentation/geo/v0;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    new-instance p0, Lcom/sumsub/sns/internal/features/presentation/geo/M;

    invoke-direct {p0, v7}, Lcom/sumsub/sns/internal/features/presentation/geo/M;-><init>(Lkotlin/coroutines/Continuation;)V

    invoke-static {v10, v0, p0}, Lkotlinx/coroutines/flow/g;->m(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/e;

    move-result-object p0

    .line 77
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/geo/K;

    invoke-direct {v0, p0, v8, v9, v6}, Lcom/sumsub/sns/internal/features/presentation/geo/K;-><init>(Lkotlinx/coroutines/flow/e;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-object v0

    .line 78
    :cond_a
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    .line 79
    :cond_b
    :goto_6
    new-instance v8, Lcom/sumsub/sns/internal/features/presentation/geo/B0;

    .line 80
    sget-object v9, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->LOCATION_OFF:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    .line 81
    invoke-virtual {p1, v4}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 82
    invoke-virtual {p1, v2}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 83
    iget-boolean v0, p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->s:Z

    if-eqz v0, :cond_c

    move-object v12, v7

    goto :goto_7

    :cond_c
    invoke-virtual {p1, v6}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object v12, v0

    .line 84
    :goto_7
    iget-boolean v0, p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->s:Z

    if-eqz v0, :cond_d

    move-object v13, v7

    goto :goto_8

    :cond_d
    invoke-virtual {p1, v5}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object v13, v0

    .line 85
    :goto_8
    invoke-direct/range {v8 .. v13}, Lcom/sumsub/sns/internal/features/presentation/geo/B0;-><init>(Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/geo/g0;

    invoke-direct {v0, p1, p0, v7}, Lcom/sumsub/sns/internal/features/presentation/geo/g0;-><init>(Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Lcom/sumsub/sns/internal/features/presentation/geo/v0;Lkotlin/coroutines/Continuation;)V

    .line 87
    new-instance v2, Lcom/sumsub/sns/internal/core/common/D;

    invoke-direct {v2, v0, v7}, Lcom/sumsub/sns/internal/core/common/D;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    invoke-static {v2}, Lkotlinx/coroutines/flow/g;->K(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/e;

    move-result-object v0

    .line 88
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->p:Lkotlinx/coroutines/flow/w;

    iget-object v4, p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->r:Lkotlinx/coroutines/flow/w;

    new-instance v5, Lcom/sumsub/sns/internal/features/presentation/geo/P;

    invoke-direct {v5, p1, p0, v7}, Lcom/sumsub/sns/internal/features/presentation/geo/P;-><init>(Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Lcom/sumsub/sns/internal/features/presentation/geo/v0;Lkotlin/coroutines/Continuation;)V

    invoke-static {v2, v4, v5}, Lkotlinx/coroutines/flow/g;->m(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/e;

    move-result-object p0

    .line 89
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/geo/h0;

    invoke-direct {v1, v7}, Lcom/sumsub/sns/internal/features/presentation/geo/h0;-><init>(Lkotlin/coroutines/Continuation;)V

    invoke-static {v0, p0, v1}, Lkotlinx/coroutines/flow/g;->m(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/e;

    move-result-object p0

    .line 90
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/geo/f0;

    invoke-direct {v0, p0, v8}, Lcom/sumsub/sns/internal/features/presentation/geo/f0;-><init>(Lkotlinx/coroutines/flow/e;Lcom/sumsub/sns/internal/features/presentation/geo/B0;)V

    return-object v0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/geo/v0;Lcom/sumsub/sns/internal/features/data/model/geo/e;)V
    .locals 4

    .line 6
    new-instance v0, Lcom/sumsub/sns/internal/core/analytics/g;

    invoke-direct {v0}, Lcom/sumsub/sns/internal/core/analytics/g;-><init>()V

    .line 7
    sget-object v1, Lcom/sumsub/sns/internal/core/analytics/PrimaryAction;->Geolocation:Lcom/sumsub/sns/internal/core/analytics/PrimaryAction;

    invoke-virtual {v0, v1}, Lcom/sumsub/sns/internal/core/analytics/g;->a(Lcom/sumsub/sns/internal/core/analytics/PrimaryAction;)Lcom/sumsub/sns/internal/core/analytics/g;

    move-result-object v0

    .line 8
    iget-object v1, v0, Lcom/sumsub/sns/internal/core/analytics/g;->b:Ljava/util/ArrayList;

    sget-object v2, Lcom/sumsub/sns/internal/core/analytics/PrimaryActionState;->Completed:Lcom/sumsub/sns/internal/core/analytics/PrimaryActionState;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 9
    iget p0, p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->n:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const-string v1, "attempt"

    invoke-static {v1, p0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    .line 10
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const-string v2, "isAuthorized"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    .line 11
    iget v2, p1, Lcom/sumsub/sns/internal/features/data/model/geo/e;->c:F

    .line 12
    invoke-static {v2}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v2

    const-string v3, "accuracy"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    .line 13
    iget-boolean p1, p1, Lcom/sumsub/sns/internal/features/data/model/geo/e;->d:Z

    .line 14
    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object p1

    const-string v3, "is_mock_geo"

    invoke-static {v3, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    filled-new-array {p0, v1, v2, p1}, [Lkotlin/Pair;

    move-result-object p0

    .line 15
    invoke-static {p0}, Lkotlin/collections/ArraysKt;->filterNotNull([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Lkotlin/collections/MapsKt;->toMap(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object p0

    iput-object p0, v0, Lcom/sumsub/sns/internal/core/analytics/g;->c:Ljava/util/Map;

    const/4 p0, 0x0

    .line 16
    invoke-virtual {v0, p0}, Lcom/sumsub/sns/internal/core/analytics/g;->a(Z)V

    return-void
.end method

.method public static final b(Lcom/sumsub/sns/internal/features/presentation/geo/v0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/geo/H;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/geo/H;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/geo/H;->g:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/geo/H;->g:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/geo/H;

    invoke-direct {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/geo/H;-><init>(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/geo/H;->f:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 53
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/geo/H;->g:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget v4, v0, Lcom/sumsub/sns/internal/features/presentation/geo/H;->e:I

    iget-object p0, v0, Lcom/sumsub/sns/internal/features/presentation/geo/H;->d:Ljava/lang/String;

    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/geo/H;->c:[Lkotlin/Pair;

    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/geo/H;->b:Lcom/sumsub/sns/internal/core/analytics/g;

    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/geo/H;->a:[Lkotlin/Pair;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 54
    new-instance p1, Lcom/sumsub/sns/internal/core/analytics/g;

    invoke-direct {p1}, Lcom/sumsub/sns/internal/core/analytics/g;-><init>()V

    .line 55
    sget-object v2, Lcom/sumsub/sns/internal/core/analytics/PrimaryAction;->Geolocation:Lcom/sumsub/sns/internal/core/analytics/PrimaryAction;

    invoke-virtual {p1, v2}, Lcom/sumsub/sns/internal/core/analytics/g;->a(Lcom/sumsub/sns/internal/core/analytics/PrimaryAction;)Lcom/sumsub/sns/internal/core/analytics/g;

    move-result-object v2

    .line 56
    iget-object p1, v2, Lcom/sumsub/sns/internal/core/analytics/g;->b:Ljava/util/ArrayList;

    sget-object v5, Lcom/sumsub/sns/internal/core/analytics/PrimaryActionState;->Started:Lcom/sumsub/sns/internal/core/analytics/PrimaryActionState;

    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x2

    .line 57
    new-array p1, p1, [Lkotlin/Pair;

    iget v5, p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->n:I

    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v5

    const-string v6, "attempt"

    invoke-static {v6, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    aput-object v5, p1, v3

    .line 58
    iget-object v5, p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->i:Lcom/sumsub/sns/internal/core/presentation/android/t;

    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/geo/H;->a:[Lkotlin/Pair;

    iput-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/geo/H;->b:Lcom/sumsub/sns/internal/core/analytics/g;

    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/geo/H;->c:[Lkotlin/Pair;

    const-string v6, "isAuthorized"

    iput-object v6, v0, Lcom/sumsub/sns/internal/features/presentation/geo/H;->d:Ljava/lang/String;

    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/geo/H;->e:I

    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/geo/H;->g:I

    invoke-virtual {p0, v5, v0}, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->a(Lcom/sumsub/sns/internal/core/presentation/android/t;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p1

    move-object v1, v0

    move-object p1, p0

    move-object p0, v6

    :goto_1
    invoke-static {p0, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    aput-object p0, v1, v4

    .line 59
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    invoke-static {v0}, Lkotlin/collections/ArraysKt;->filterNotNull([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Lkotlin/collections/MapsKt;->toMap(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object p0

    iput-object p0, v2, Lcom/sumsub/sns/internal/core/analytics/g;->c:Ljava/util/Map;

    .line 61
    invoke-virtual {v2, v3}, Lcom/sumsub/sns/internal/core/analytics/g;->a(Z)V

    .line 62
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final a(Lcom/sumsub/sns/internal/core/presentation/android/t;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Lcom/sumsub/sns/internal/features/presentation/geo/c0;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/geo/c0;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/geo/c0;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/geo/c0;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/geo/c0;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/presentation/geo/c0;-><init>(Lcom/sumsub/sns/internal/features/presentation/geo/v0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/geo/c0;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 226
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/geo/c0;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 227
    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/geo/c0;->c:I

    invoke-virtual {p1, v0}, Lcom/sumsub/sns/internal/core/presentation/android/t;->b(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    sget-object p1, Lcom/sumsub/sns/internal/core/presentation/android/i;->a:Lcom/sumsub/sns/internal/core/presentation/android/i;

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final a(Lcom/sumsub/sns/internal/features/data/model/geo/e;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    instance-of v3, v2, Lcom/sumsub/sns/internal/features/presentation/geo/E;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lcom/sumsub/sns/internal/features/presentation/geo/E;

    iget v4, v3, Lcom/sumsub/sns/internal/features/presentation/geo/E;->f:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lcom/sumsub/sns/internal/features/presentation/geo/E;->f:I

    goto :goto_0

    :cond_0
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/geo/E;

    invoke-direct {v3, v0, v2}, Lcom/sumsub/sns/internal/features/presentation/geo/E;-><init>(Lcom/sumsub/sns/internal/features/presentation/geo/v0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object v2, v3, Lcom/sumsub/sns/internal/features/presentation/geo/E;->d:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v4

    .line 153
    iget v5, v3, Lcom/sumsub/sns/internal/features/presentation/geo/E;->f:I

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x2

    if-eqz v5, :cond_4

    if-eq v5, v8, :cond_3

    if-eq v5, v9, :cond_2

    if-ne v5, v6, :cond_1

    iget-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/geo/E;->c:Lcom/sumsub/sns/internal/features/presentation/geo/v0;

    iget-object v4, v3, Lcom/sumsub/sns/internal/features/presentation/geo/E;->b:Lcom/sumsub/sns/internal/features/domain/geo/b;

    iget-object v3, v3, Lcom/sumsub/sns/internal/features/presentation/geo/E;->a:Ljava/lang/Object;

    check-cast v3, Ljava/util/Map;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_7

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/geo/E;->a:Ljava/lang/Object;

    check-cast v1, Ljava/util/Map;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    iget-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/geo/E;->a:Ljava/lang/Object;

    check-cast v1, Lcom/sumsub/sns/internal/features/data/model/geo/e;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v2, Lkotlin/Result;

    invoke-virtual {v2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v2

    goto :goto_1

    :cond_4
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 154
    iget v2, v1, Lcom/sumsub/sns/internal/features/data/model/geo/e;->c:F

    .line 155
    iget-boolean v5, v1, Lcom/sumsub/sns/internal/features/data/model/geo/e;->d:Z

    .line 156
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v11, "onLocationAcquired: accuracy="

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v2, ", isMock="

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/sumsub/sns/internal/features/presentation/geo/a;->a(Ljava/lang/String;)V

    .line 157
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->e:Lcom/sumsub/sns/internal/features/domain/e;

    iput-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/geo/E;->a:Ljava/lang/Object;

    iput v8, v3, Lcom/sumsub/sns/internal/features/presentation/geo/E;->f:I

    invoke-virtual {v2, v7, v3}, Lcom/sumsub/sns/internal/features/domain/e;->a(ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_5

    goto/16 :goto_6

    .line 158
    :cond_5
    :goto_1
    invoke-static {v2}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    check-cast v2, Lcom/sumsub/sns/internal/features/domain/n;

    .line 159
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/domain/n;->c:Ljava/util/Map;

    .line 160
    :cond_6
    invoke-static {v2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 161
    invoke-static {v2}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v5

    if-nez v5, :cond_17

    check-cast v2, Ljava/util/Map;

    .line 162
    iget-object v5, v0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->a:Lcom/sumsub/sns/internal/features/domain/geo/u;

    .line 163
    iget-object v10, v0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->g:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    invoke-virtual {v10}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object v10

    .line 164
    iget-object v10, v10, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 165
    iput-object v2, v3, Lcom/sumsub/sns/internal/features/presentation/geo/E;->a:Ljava/lang/Object;

    iput v9, v3, Lcom/sumsub/sns/internal/features/presentation/geo/E;->f:I

    invoke-virtual {v5, v10, v1, v3}, Lcom/sumsub/sns/internal/features/domain/geo/u;->a(Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/geo/e;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_7

    goto/16 :goto_6

    :cond_7
    move-object/from16 v17, v2

    move-object v2, v1

    move-object/from16 v1, v17

    .line 166
    :goto_2
    check-cast v2, Lcom/sumsub/sns/internal/features/domain/geo/e;

    .line 167
    instance-of v5, v2, Lcom/sumsub/sns/internal/features/domain/geo/b;

    if-eqz v5, :cond_8

    move-object v10, v2

    check-cast v10, Lcom/sumsub/sns/internal/features/domain/geo/b;

    .line 168
    iget-object v10, v10, Lcom/sumsub/sns/internal/features/domain/geo/b;->b:Ljava/lang/Long;

    if-eqz v10, :cond_a

    .line 169
    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    goto :goto_3

    .line 170
    :cond_8
    instance-of v10, v2, Lcom/sumsub/sns/internal/features/domain/geo/d;

    if-eqz v10, :cond_9

    move-object v10, v2

    check-cast v10, Lcom/sumsub/sns/internal/features/domain/geo/d;

    .line 171
    iget-object v10, v10, Lcom/sumsub/sns/internal/features/domain/geo/d;->b:Ljava/lang/Long;

    if-eqz v10, :cond_a

    .line 172
    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    goto :goto_3

    .line 173
    :cond_9
    instance-of v10, v2, Lcom/sumsub/sns/internal/features/domain/geo/c;

    if-eqz v10, :cond_b

    move-object v10, v2

    check-cast v10, Lcom/sumsub/sns/internal/features/domain/geo/c;

    .line 174
    iget-object v10, v10, Lcom/sumsub/sns/internal/features/domain/geo/c;->a:Ljava/lang/Long;

    if-eqz v10, :cond_a

    .line 175
    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    goto :goto_3

    :cond_a
    const-wide/16 v10, 0xa

    .line 176
    :goto_3
    iget-object v12, v0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->f:Lcom/sumsub/sns/internal/features/presentation/verification/d;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v13

    const-wide/16 v15, 0x3e8

    mul-long/2addr v10, v15

    add-long/2addr v10, v13

    const-string v13, "address_by_location_countdown"

    invoke-virtual {v12, v13, v10, v11}, Lcom/sumsub/sns/internal/features/presentation/verification/d;->a(Ljava/lang/String;J)V

    goto :goto_4

    .line 177
    :cond_b
    instance-of v10, v2, Lcom/sumsub/sns/internal/features/domain/geo/a;

    if-eqz v10, :cond_16

    .line 178
    :goto_4
    instance-of v10, v2, Lcom/sumsub/sns/internal/features/domain/geo/d;

    if-eqz v10, :cond_c

    .line 179
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->q:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v3, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->w:[Lkotlin/reflect/KProperty;

    aget-object v4, v3, v9

    invoke-virtual {v1}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    add-int/2addr v1, v8

    .line 180
    iget-object v4, v0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->q:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    aget-object v3, v3, v9

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 181
    iget-object v3, v4, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 182
    iget-object v4, v4, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v3, v4, v1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 183
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/geo/n;

    check-cast v2, Lcom/sumsub/sns/internal/features/domain/geo/d;

    .line 184
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/domain/geo/d;->a:Ljava/util/ArrayList;

    .line 185
    invoke-direct {v1, v2}, Lcom/sumsub/sns/internal/features/presentation/geo/n;-><init>(Ljava/util/ArrayList;)V

    goto/16 :goto_8

    :cond_c
    if-eqz v5, :cond_13

    .line 186
    iget-object v5, v0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->q:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v8, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->w:[Lkotlin/reflect/KProperty;

    aget-object v8, v8, v9

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    .line 187
    iget-object v9, v5, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 188
    iget-object v5, v5, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v9, v5, v8}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 189
    move-object v5, v2

    check-cast v5, Lcom/sumsub/sns/internal/features/domain/geo/b;

    .line 190
    iget-object v8, v5, Lcom/sumsub/sns/internal/features/domain/geo/b;->a:Ljava/util/ArrayList;

    .line 191
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_d

    goto :goto_5

    .line 192
    :cond_d
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v9

    move v10, v7

    :cond_e
    if-ge v10, v9, :cond_10

    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    add-int/lit8 v10, v10, 0x1

    check-cast v11, Lcom/sumsub/sns/internal/features/data/model/common/c;

    .line 193
    iget-object v12, v11, Lcom/sumsub/sns/internal/features/data/model/common/c;->a:Lcom/sumsub/sns/internal/features/data/model/common/y;

    .line 194
    iget-object v12, v12, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    .line 195
    sget-object v13, Lcom/sumsub/sns/internal/features/data/model/common/U0;->b:Lcom/sumsub/sns/internal/features/data/model/common/U0;

    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_e

    .line 196
    iget-object v11, v11, Lcom/sumsub/sns/internal/features/data/model/common/c;->b:Ljava/lang/String;

    if-eqz v11, :cond_f

    .line 197
    invoke-static {v11}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v11

    if-eqz v11, :cond_e

    .line 198
    :cond_f
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/geo/k;->a:Lcom/sumsub/sns/internal/features/presentation/geo/k;

    goto :goto_8

    .line 199
    :cond_10
    :goto_5
    iget-boolean v8, v0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->d:Z

    if-eqz v8, :cond_11

    .line 200
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/geo/o;->a:Lcom/sumsub/sns/internal/features/presentation/geo/o;

    goto :goto_8

    .line 201
    :cond_11
    iget-object v8, v5, Lcom/sumsub/sns/internal/features/domain/geo/b;->a:Ljava/util/ArrayList;

    .line 202
    iget-object v9, v0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->m:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v10, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->w:[Lkotlin/reflect/KProperty;

    aget-object v7, v10, v7

    .line 203
    iget-object v7, v9, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 204
    iget-object v9, v9, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v7, v9, v8}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 205
    iput-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/geo/E;->a:Ljava/lang/Object;

    iput-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/geo/E;->b:Lcom/sumsub/sns/internal/features/domain/geo/b;

    iput-object v0, v3, Lcom/sumsub/sns/internal/features/presentation/geo/E;->c:Lcom/sumsub/sns/internal/features/presentation/geo/v0;

    iput v6, v3, Lcom/sumsub/sns/internal/features/presentation/geo/E;->f:I

    invoke-virtual {v0, v3}, Lcom/sumsub/sns/core/presentation/base/p0;->getStrings(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v4, :cond_12

    :goto_6
    return-object v4

    :cond_12
    move-object v4, v2

    move-object v2, v3

    move-object v3, v1

    move-object v1, v0

    .line 206
    :goto_7
    check-cast v2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    .line 207
    check-cast v4, Lcom/sumsub/sns/internal/features/domain/geo/b;

    .line 208
    iget-object v4, v4, Lcom/sumsub/sns/internal/features/domain/geo/b;->a:Ljava/util/ArrayList;

    .line 209
    iget-object v5, v0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->v:Ljava/util/Map;

    .line 210
    invoke-virtual {v1, v2, v4, v3, v5}, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->a(Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)Ljava/util/List;

    move-result-object v1

    .line 211
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/geo/p;

    invoke-direct {v2, v1}, Lcom/sumsub/sns/internal/features/presentation/geo/p;-><init>(Ljava/util/List;)V

    move-object v1, v2

    goto :goto_8

    .line 212
    :cond_13
    instance-of v1, v2, Lcom/sumsub/sns/internal/features/domain/geo/c;

    if-eqz v1, :cond_14

    .line 213
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/geo/l;

    invoke-direct {v1}, Lcom/sumsub/sns/internal/features/presentation/geo/l;-><init>()V

    goto :goto_8

    .line 214
    :cond_14
    instance-of v1, v2, Lcom/sumsub/sns/internal/features/domain/geo/a;

    if-eqz v1, :cond_15

    .line 215
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/geo/m;

    check-cast v2, Lcom/sumsub/sns/internal/features/domain/geo/a;

    .line 216
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/domain/geo/a;->a:Ljava/lang/Throwable;

    .line 217
    invoke-direct {v1, v2}, Lcom/sumsub/sns/internal/features/presentation/geo/m;-><init>(Ljava/lang/Throwable;)V

    .line 218
    :goto_8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v2

    invoke-interface {v2}, Lkotlin/reflect/KClass;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "acquireAddress: result="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/sumsub/sns/internal/features/presentation/geo/a;->a(Ljava/lang/String;)V

    return-object v1

    .line 219
    :cond_15
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    .line 220
    :cond_16
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    .line 221
    :cond_17
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/geo/m;

    new-instance v2, Lcom/sumsub/sns/core/data/model/SNSGeneralException;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const-string v3, "Send address countries data error"

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lcom/sumsub/sns/core/data/model/SNSGeneralException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v1, v2}, Lcom/sumsub/sns/internal/features/presentation/geo/m;-><init>(Ljava/lang/Throwable;)V

    return-object v1
.end method

.method public final a(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/geo/F;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/geo/F;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/geo/F;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/geo/F;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/geo/F;

    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/geo/F;-><init>(Lcom/sumsub/sns/internal/features/presentation/geo/v0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/geo/F;->b:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 96
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/geo/F;->d:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    packed-switch v2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/geo/F;->a:Lcom/sumsub/sns/core/presentation/base/p0;

    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_9

    :catchall_0
    move-exception p1

    goto/16 :goto_a

    :pswitch_1
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/geo/F;->a:Lcom/sumsub/sns/core/presentation/base/p0;

    :try_start_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto/16 :goto_7

    :pswitch_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_6

    :pswitch_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_5

    :pswitch_4
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_4

    :pswitch_5
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_3

    :pswitch_6
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_7
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 97
    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/geo/F;->d:I

    invoke-static {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->b(Lcom/sumsub/sns/internal/features/presentation/geo/v0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_1

    goto/16 :goto_8

    .line 98
    :cond_1
    :goto_1
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->h:Lcom/sumsub/sns/internal/core/presentation/android/location/s;

    const/4 v2, 0x2

    iput v2, v0, Lcom/sumsub/sns/internal/features/presentation/geo/F;->d:I

    .line 99
    iget-object v2, p1, Lcom/sumsub/sns/internal/core/presentation/android/location/s;->e:Lkotlinx/coroutines/w;

    if-eqz v2, :cond_2

    .line 100
    const-string/jumbo v5, "requestLocationEnabled: awaiting in-flight check"

    invoke-virtual {p1, v5}, Lcom/sumsub/sns/internal/core/presentation/android/location/s;->a(Ljava/lang/String;)V

    .line 101
    invoke-interface {v2, v0}, Lkotlinx/coroutines/r0;->h(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_2

    :cond_2
    const/4 v2, 0x0

    .line 102
    invoke-static {v2, v4, v2}, Lkotlinx/coroutines/y;->c(Lkotlinx/coroutines/x1;ILjava/lang/Object;)Lkotlinx/coroutines/w;

    move-result-object v2

    .line 103
    iput-object v2, p1, Lcom/sumsub/sns/internal/core/presentation/android/location/s;->e:Lkotlinx/coroutines/w;

    .line 104
    iget-object v5, p1, Lcom/sumsub/sns/internal/core/presentation/android/location/s;->c:Lkotlinx/coroutines/flow/n;

    sget-object v6, Lcom/sumsub/sns/internal/core/presentation/android/location/LocationServiceController$Phase;->CheckRequested:Lcom/sumsub/sns/internal/core/presentation/android/location/LocationServiceController$Phase;

    invoke-interface {v5, v6}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 105
    const-string/jumbo v5, "requestLocationEnabled -> CheckRequested"

    invoke-virtual {p1, v5}, Lcom/sumsub/sns/internal/core/presentation/android/location/s;->a(Ljava/lang/String;)V

    .line 106
    invoke-interface {v2, v0}, Lkotlinx/coroutines/r0;->h(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    :goto_2
    if-ne p1, v1, :cond_3

    goto/16 :goto_8

    .line 107
    :cond_3
    :goto_3
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_5

    .line 108
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->o:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->w:[Lkotlin/reflect/KProperty;

    aget-object v3, v2, v4

    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    add-int/2addr p1, v4

    .line 109
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->o:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    aget-object v2, v2, v4

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    .line 110
    iget-object v2, v3, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 111
    iget-object v3, v3, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v2, v3, p1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 p1, 0x3

    .line 112
    iput p1, v0, Lcom/sumsub/sns/internal/features/presentation/geo/F;->d:I

    invoke-static {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->a(Lcom/sumsub/sns/internal/features/presentation/geo/v0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto/16 :goto_8

    .line 113
    :cond_4
    :goto_4
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/geo/A;->a:Lcom/sumsub/sns/internal/features/presentation/geo/A;

    return-object p1

    .line 114
    :cond_5
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->i:Lcom/sumsub/sns/internal/core/presentation/android/t;

    const/4 v2, 0x4

    iput v2, v0, Lcom/sumsub/sns/internal/features/presentation/geo/F;->d:I

    invoke-virtual {p1, v0}, Lcom/sumsub/sns/internal/core/presentation/android/t;->a(Lcom/sumsub/sns/internal/features/presentation/geo/F;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto/16 :goto_8

    .line 115
    :cond_6
    :goto_5
    check-cast p1, Lcom/sumsub/sns/internal/core/presentation/android/j;

    .line 116
    sget-object v2, Lcom/sumsub/sns/internal/core/presentation/android/h;->a:Lcom/sumsub/sns/internal/core/presentation/android/h;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    .line 117
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->o:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->w:[Lkotlin/reflect/KProperty;

    aget-object v3, v2, v4

    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    add-int/2addr p1, v4

    .line 118
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->o:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    aget-object v2, v2, v4

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    .line 119
    iget-object v2, v3, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 120
    iget-object v3, v3, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v2, v3, p1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 p1, 0x5

    .line 121
    iput p1, v0, Lcom/sumsub/sns/internal/features/presentation/geo/F;->d:I

    invoke-static {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->a(Lcom/sumsub/sns/internal/features/presentation/geo/v0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    goto :goto_8

    .line 122
    :cond_7
    :goto_6
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/geo/z;->a:Lcom/sumsub/sns/internal/features/presentation/geo/z;

    return-object p1

    .line 123
    :cond_8
    sget-object v2, Lcom/sumsub/sns/internal/core/presentation/android/i;->a:Lcom/sumsub/sns/internal/core/presentation/android/i;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_d

    .line 124
    invoke-virtual {p0, v4}, Lcom/sumsub/sns/core/presentation/base/p0;->showProgress(Z)V

    .line 125
    :try_start_2
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->j:Lcom/sumsub/sns/internal/core/presentation/android/location/l;

    iput-object p0, v0, Lcom/sumsub/sns/internal/features/presentation/geo/F;->a:Lcom/sumsub/sns/core/presentation/base/p0;

    const/4 v2, 0x6

    iput v2, v0, Lcom/sumsub/sns/internal/features/presentation/geo/F;->d:I

    invoke-virtual {p1, v0}, Lcom/sumsub/sns/internal/core/presentation/android/location/l;->a(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-ne p1, v1, :cond_9

    goto :goto_8

    :cond_9
    move-object v2, p0

    .line 126
    :goto_7
    :try_start_3
    check-cast p1, Lcom/sumsub/sns/internal/core/presentation/android/location/f;

    .line 127
    instance-of v5, p1, Lcom/sumsub/sns/internal/core/presentation/android/location/a;

    if-eqz v5, :cond_a

    .line 128
    check-cast p1, Lcom/sumsub/sns/internal/core/presentation/android/location/a;

    .line 129
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/presentation/android/location/a;->a:Lcom/sumsub/sns/internal/features/data/model/geo/e;

    .line 130
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->o:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->w:[Lkotlin/reflect/KProperty;

    aget-object v1, v1, v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 131
    iget-object v4, v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 132
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 133
    invoke-static {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->a(Lcom/sumsub/sns/internal/features/presentation/geo/v0;Lcom/sumsub/sns/internal/features/data/model/geo/e;)V

    .line 134
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/geo/y;

    invoke-direct {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/geo/y;-><init>(Lcom/sumsub/sns/internal/features/data/model/geo/e;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 135
    invoke-virtual {v2, v3}, Lcom/sumsub/sns/core/presentation/base/p0;->showProgress(Z)V

    return-object v0

    :catchall_1
    move-exception p1

    goto :goto_b

    .line 136
    :cond_a
    :try_start_4
    instance-of p1, p1, Lcom/sumsub/sns/internal/core/presentation/android/location/e;

    if-eqz p1, :cond_c

    .line 137
    iput-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/geo/F;->a:Lcom/sumsub/sns/core/presentation/base/p0;

    const/4 p1, 0x7

    iput p1, v0, Lcom/sumsub/sns/internal/features/presentation/geo/F;->d:I

    invoke-static {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->a(Lcom/sumsub/sns/internal/features/presentation/geo/v0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    if-ne p1, v1, :cond_b

    :goto_8
    return-object v1

    :cond_b
    move-object v0, v2

    .line 138
    :goto_9
    :try_start_5
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/geo/B;->a:Lcom/sumsub/sns/internal/features/presentation/geo/B;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 139
    invoke-virtual {v0, v3}, Lcom/sumsub/sns/core/presentation/base/p0;->showProgress(Z)V

    return-object p1

    .line 140
    :cond_c
    :try_start_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :catchall_2
    move-exception p1

    move-object v0, p0

    :goto_a
    move-object v2, v0

    .line 141
    :goto_b
    invoke-virtual {v2, v3}, Lcom/sumsub/sns/core/presentation/base/p0;->showProgress(Z)V

    throw p1

    .line 142
    :cond_d
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final a(Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)Ljava/util/List;
    .locals 30

    move-object/from16 v0, p1

    const/4 v1, 0x1

    .line 228
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 229
    invoke-interface/range {p2 .. p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 230
    check-cast v4, Lcom/sumsub/sns/internal/features/data/model/common/c;

    .line 231
    iget-object v7, v4, Lcom/sumsub/sns/internal/features/data/model/common/c;->a:Lcom/sumsub/sns/internal/features/data/model/common/y;

    .line 232
    iget-object v6, v7, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    if-nez v6, :cond_1

    const/4 v5, 0x0

    goto :goto_2

    .line 233
    :cond_1
    sget-object v8, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    invoke-virtual {v6}, Lcom/sumsub/sns/internal/features/data/model/common/d2;->b()Ljava/lang/String;

    move-result-object v8

    filled-new-array {v8}, [Ljava/lang/Object;

    move-result-object v8

    .line 234
    const-string/jumbo v9, "sns_data_field_%s"

    invoke-static {v8, v1, v9, v0}, Lcom/sumsub/sns/internal/core/presentation/intro/d;->a([Ljava/lang/Object;ILjava/lang/String;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;)Ljava/lang/String;

    move-result-object v8

    .line 235
    invoke-virtual {v6}, Lcom/sumsub/sns/internal/features/data/model/common/d2;->b()Ljava/lang/String;

    move-result-object v6

    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v6

    .line 236
    const-string/jumbo v9, "sns_data_field_%s_placeholder"

    invoke-static {v6, v1, v9, v0}, Lcom/sumsub/sns/internal/core/presentation/intro/d;->a([Ljava/lang/Object;ILjava/lang/String;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;)Ljava/lang/String;

    move-result-object v9

    .line 237
    const-string/jumbo v6, "sns_data_error_fieldIsRequired"

    invoke-virtual {v0, v6}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_3

    .line 238
    iget-object v10, v4, Lcom/sumsub/sns/internal/features/data/model/common/c;->a:Lcom/sumsub/sns/internal/features/data/model/common/y;

    .line 239
    iget-boolean v10, v10, Lcom/sumsub/sns/internal/features/data/model/common/y;->c:Z

    if-eqz v10, :cond_3

    .line 240
    iget-object v10, v4, Lcom/sumsub/sns/internal/features/data/model/common/c;->b:Ljava/lang/String;

    if-eqz v10, :cond_2

    .line 241
    invoke-static {v10}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v10

    if-eqz v10, :cond_3

    :cond_2
    move-object v10, v6

    goto :goto_1

    :cond_3
    const/4 v10, 0x0

    .line 242
    :goto_1
    iget-boolean v11, v4, Lcom/sumsub/sns/internal/features/data/model/common/c;->c:Z

    .line 243
    new-instance v6, Lcom/sumsub/sns/internal/features/data/model/common/v2;

    invoke-direct/range {v6 .. v11}, Lcom/sumsub/sns/internal/features/data/model/common/v2;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/y;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)V

    move-object v5, v6

    :goto_2
    if-eqz v5, :cond_0

    .line 244
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 245
    :cond_4
    invoke-interface/range {p2 .. p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v6, v4

    check-cast v6, Lcom/sumsub/sns/internal/features/data/model/common/c;

    .line 246
    iget-object v6, v6, Lcom/sumsub/sns/internal/features/data/model/common/c;->a:Lcom/sumsub/sns/internal/features/data/model/common/y;

    .line 247
    iget-object v6, v6, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    .line 248
    sget-object v7, Lcom/sumsub/sns/internal/features/data/model/common/U0;->b:Lcom/sumsub/sns/internal/features/data/model/common/U0;

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    goto :goto_3

    :cond_6
    const/4 v4, 0x0

    .line 249
    :goto_3
    check-cast v4, Lcom/sumsub/sns/internal/features/data/model/common/c;

    if-eqz v4, :cond_7

    .line 250
    iget-object v3, v4, Lcom/sumsub/sns/internal/features/data/model/common/c;->b:Ljava/lang/String;

    goto :goto_4

    :cond_7
    const/4 v3, 0x0

    .line 251
    :goto_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v15

    .line 252
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 253
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v6

    const/4 v7, 0x0

    :goto_5
    if-ge v7, v6, :cond_18

    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    add-int/2addr v7, v1

    .line 254
    check-cast v8, Lcom/sumsub/sns/internal/features/data/model/common/v2;

    .line 255
    new-instance v9, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    .line 256
    iget-object v10, v8, Lcom/sumsub/sns/internal/features/data/model/common/v2;->a:Lcom/sumsub/sns/internal/features/data/model/common/y;

    .line 257
    invoke-virtual {v10}, Lcom/sumsub/sns/internal/features/data/model/common/y;->c()Ljava/lang/String;

    move-result-object v17

    .line 258
    iget-object v10, v8, Lcom/sumsub/sns/internal/features/data/model/common/v2;->b:Ljava/lang/CharSequence;

    if-eqz v10, :cond_8

    .line 259
    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v10

    move-object/from16 v18, v10

    goto :goto_6

    :cond_8
    const/16 v18, 0x0

    .line 260
    :goto_6
    iget-object v10, v8, Lcom/sumsub/sns/internal/features/data/model/common/v2;->c:Ljava/lang/CharSequence;

    if-eqz v10, :cond_9

    .line 261
    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v10

    move-object/from16 v19, v10

    goto :goto_7

    :cond_9
    const/16 v19, 0x0

    .line 262
    :goto_7
    iget-object v10, v8, Lcom/sumsub/sns/internal/features/data/model/common/v2;->a:Lcom/sumsub/sns/internal/features/data/model/common/y;

    .line 263
    iget-boolean v10, v10, Lcom/sumsub/sns/internal/features/data/model/common/y;->c:Z

    .line 264
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v21

    const/16 v25, 0x0

    const/16 v26, 0x3c8

    const/16 v20, 0x0

    .line 265
    const-string v22, "android_tetxt_cap_words"

    const/16 v23, 0x0

    const/16 v24, 0x0

    move-object/from16 v16, v9

    invoke-direct/range {v16 .. v26}, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;I)V

    .line 266
    iget-object v10, v8, Lcom/sumsub/sns/internal/features/data/model/common/v2;->a:Lcom/sumsub/sns/internal/features/data/model/common/y;

    .line 267
    iget-object v10, v10, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    .line 268
    sget-object v11, Lcom/sumsub/sns/internal/features/data/model/common/U0;->b:Lcom/sumsub/sns/internal/features/data/model/common/U0;

    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    const-string v9, "geo+poa"

    if-eqz v11, :cond_b

    new-instance v10, Lcom/sumsub/sns/internal/core/presentation/form/model/q;

    if-nez p3, :cond_a

    .line 269
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v11

    goto :goto_8

    :cond_a
    move-object/from16 v11, p3

    .line 270
    :goto_8
    iget-boolean v12, v8, Lcom/sumsub/sns/internal/features/data/model/common/v2;->e:Z

    xor-int/lit8 v13, v12, 0x1

    .line 271
    iget-object v14, v8, Lcom/sumsub/sns/internal/features/data/model/common/v2;->d:Ljava/lang/CharSequence;

    const/4 v12, 0x0

    move-object v8, v10

    move-object/from16 v10, v16

    .line 272
    invoke-direct/range {v8 .. v15}, Lcom/sumsub/sns/internal/core/presentation/form/model/q;-><init>(Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;Ljava/util/Map;Ljava/lang/String;ZLjava/lang/CharSequence;Ljava/lang/String;)V

    :goto_9
    move/from16 v17, v1

    :goto_a
    move-object v10, v8

    goto/16 :goto_13

    :cond_b
    move-object v11, v9

    move-object/from16 v9, v16

    .line 273
    sget-object v12, Lcom/sumsub/sns/internal/features/data/model/common/a2;->b:Lcom/sumsub/sns/internal/features/data/model/common/a2;

    invoke-static {v10, v12}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_c

    .line 274
    iget-boolean v10, v8, Lcom/sumsub/sns/internal/features/data/model/common/v2;->e:Z

    xor-int/lit8 v12, v10, 0x1

    .line 275
    iget-object v13, v8, Lcom/sumsub/sns/internal/features/data/model/common/v2;->d:Ljava/lang/CharSequence;

    .line 276
    new-instance v8, Lcom/sumsub/sns/internal/core/presentation/form/model/Z;

    const/4 v14, 0x0

    const/16 v16, 0x60

    move-object v10, v11

    const/4 v11, 0x0

    invoke-direct/range {v8 .. v16}, Lcom/sumsub/sns/internal/core/presentation/form/model/Z;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/CharSequence;Ljava/util/List;Ljava/lang/String;I)V

    goto :goto_9

    .line 277
    :cond_c
    sget-object v12, Lcom/sumsub/sns/internal/features/data/model/common/M1;->b:Lcom/sumsub/sns/internal/features/data/model/common/M1;

    invoke-static {v10, v12}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_d

    .line 278
    sget-object v12, Lcom/sumsub/sns/internal/features/data/model/common/O1;->b:Lcom/sumsub/sns/internal/features/data/model/common/O1;

    invoke-static {v10, v12}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_d

    .line 279
    sget-object v12, Lcom/sumsub/sns/internal/features/data/model/common/G1;->b:Lcom/sumsub/sns/internal/features/data/model/common/G1;

    invoke-static {v10, v12}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_d

    .line 280
    sget-object v12, Lcom/sumsub/sns/internal/features/data/model/common/e1;->b:Lcom/sumsub/sns/internal/features/data/model/common/e1;

    invoke-static {v10, v12}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_d

    .line 281
    sget-object v12, Lcom/sumsub/sns/internal/features/data/model/common/Q0;->b:Lcom/sumsub/sns/internal/features/data/model/common/Q0;

    invoke-static {v10, v12}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_e

    :cond_d
    move/from16 v17, v1

    move-object v10, v11

    goto/16 :goto_12

    .line 282
    :cond_e
    sget-object v12, Lcom/sumsub/sns/internal/features/data/model/common/I1;->b:Lcom/sumsub/sns/internal/features/data/model/common/I1;

    invoke-static {v10, v12}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_16

    if-nez v3, :cond_f

    .line 283
    const-string v10, ""

    :goto_b
    move-object/from16 v12, p4

    goto :goto_c

    :cond_f
    move-object v10, v3

    goto :goto_b

    :goto_c
    invoke-interface {v12, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/Map;

    if-eqz v10, :cond_11

    invoke-interface {v10}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v10

    if-eqz v10, :cond_11

    .line 284
    new-instance v13, Ljava/util/ArrayList;

    const/16 v14, 0xa

    invoke-static {v10, v14}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v14

    invoke-direct {v13, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 285
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_d
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_10

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    .line 286
    check-cast v14, Ljava/util/Map$Entry;

    move/from16 v17, v1

    .line 287
    new-instance v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/N;

    invoke-interface {v14}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v5, v16

    check-cast v5, Ljava/lang/String;

    invoke-interface {v14}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    invoke-direct {v1, v5, v14}, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/N;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 288
    invoke-virtual {v13, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v1, v17

    goto :goto_d

    :cond_10
    move/from16 v17, v1

    move-object/from16 v28, v13

    goto :goto_e

    :cond_11
    move/from16 v17, v1

    const/16 v28, 0x0

    :goto_e
    if-eqz v28, :cond_12

    .line 289
    invoke-interface/range {v28 .. v28}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_13

    :cond_12
    move-object v10, v11

    goto :goto_11

    .line 290
    :cond_13
    iget-boolean v1, v8, Lcom/sumsub/sns/internal/features/data/model/common/v2;->e:Z

    xor-int/lit8 v1, v1, 0x1

    .line 291
    iget-object v13, v8, Lcom/sumsub/sns/internal/features/data/model/common/v2;->d:Ljava/lang/CharSequence;

    .line 292
    new-instance v19, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    .line 293
    iget-object v5, v8, Lcom/sumsub/sns/internal/features/data/model/common/v2;->a:Lcom/sumsub/sns/internal/features/data/model/common/y;

    .line 294
    iget-object v5, v5, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    .line 295
    invoke-virtual {v5}, Lcom/sumsub/sns/internal/features/data/model/common/d2;->b()Ljava/lang/String;

    move-result-object v20

    .line 296
    iget-object v5, v8, Lcom/sumsub/sns/internal/features/data/model/common/v2;->b:Ljava/lang/CharSequence;

    if-eqz v5, :cond_14

    .line 297
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    move-object/from16 v21, v5

    goto :goto_f

    :cond_14
    const/16 v21, 0x0

    .line 298
    :goto_f
    iget-object v5, v8, Lcom/sumsub/sns/internal/features/data/model/common/v2;->c:Ljava/lang/CharSequence;

    if-eqz v5, :cond_15

    .line 299
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    move-object/from16 v22, v5

    goto :goto_10

    :cond_15
    const/16 v22, 0x0

    .line 300
    :goto_10
    iget-object v5, v8, Lcom/sumsub/sns/internal/features/data/model/common/v2;->a:Lcom/sumsub/sns/internal/features/data/model/common/y;

    .line 301
    iget-boolean v5, v5, Lcom/sumsub/sns/internal/features/data/model/common/y;->c:Z

    .line 302
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v24

    const/16 v27, 0x0

    const/16 v29, 0x2e8

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    .line 303
    invoke-direct/range {v19 .. v29}, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;I)V

    .line 304
    new-instance v8, Lcom/sumsub/sns/internal/core/presentation/form/model/V;

    move-object v10, v11

    const/4 v11, 0x0

    move v12, v1

    move-object v14, v15

    move-object/from16 v9, v19

    invoke-direct/range {v8 .. v14}, Lcom/sumsub/sns/internal/core/presentation/form/model/V;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/CharSequence;Ljava/lang/String;)V

    goto/16 :goto_a

    .line 305
    :goto_11
    iget-boolean v1, v8, Lcom/sumsub/sns/internal/features/data/model/common/v2;->e:Z

    xor-int/lit8 v12, v1, 0x1

    .line 306
    iget-object v13, v8, Lcom/sumsub/sns/internal/features/data/model/common/v2;->d:Ljava/lang/CharSequence;

    .line 307
    new-instance v8, Lcom/sumsub/sns/internal/core/presentation/form/model/Z;

    const/4 v14, 0x0

    const/16 v16, 0x60

    const/4 v11, 0x0

    invoke-direct/range {v8 .. v16}, Lcom/sumsub/sns/internal/core/presentation/form/model/Z;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/CharSequence;Ljava/util/List;Ljava/lang/String;I)V

    goto/16 :goto_a

    :cond_16
    move/from16 v17, v1

    const/4 v10, 0x0

    goto :goto_13

    .line 308
    :goto_12
    iget-object v13, v8, Lcom/sumsub/sns/internal/features/data/model/common/v2;->d:Ljava/lang/CharSequence;

    .line 309
    new-instance v8, Lcom/sumsub/sns/internal/core/presentation/form/model/Z;

    const/4 v14, 0x0

    const/16 v16, 0x68

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v8 .. v16}, Lcom/sumsub/sns/internal/core/presentation/form/model/Z;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/CharSequence;Ljava/util/List;Ljava/lang/String;I)V

    goto/16 :goto_a

    :goto_13
    if-eqz v10, :cond_17

    .line 310
    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_17
    move/from16 v1, v17

    goto/16 :goto_5

    :cond_18
    move/from16 v17, v1

    move-object/from16 v1, p0

    .line 311
    iget-boolean v2, v1, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->s:Z

    if-nez v2, :cond_1b

    .line 312
    new-instance v2, Lcom/sumsub/sns/internal/core/presentation/form/model/I;

    .line 313
    const-string/jumbo v3, "sns_geolocation_form_documentFallback_text"

    invoke-virtual {v0, v3}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 314
    const-string/jumbo v5, "sns_geolocation_form_documentFallback_action_upload"

    invoke-virtual {v0, v5}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 315
    new-instance v5, Lcom/sumsub/sns/internal/core/presentation/form/model/j;

    invoke-direct {v5}, Lcom/sumsub/sns/internal/core/presentation/form/model/j;-><init>()V

    .line 316
    invoke-direct {v2, v3, v0, v5}, Lcom/sumsub/sns/internal/core/presentation/form/model/I;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/core/presentation/form/model/j;)V

    .line 317
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    .line 318
    :cond_19
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v3

    if-eqz v3, :cond_1a

    .line 319
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;

    .line 320
    invoke-virtual {v3}, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->c()Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    move-result-object v3

    .line 321
    iget-object v3, v3, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->e:Ljava/lang/Boolean;

    .line 322
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_19

    .line 323
    invoke-interface {v0}, Ljava/util/ListIterator;->nextIndex()I

    move-result v0

    goto :goto_14

    :cond_1a
    const/4 v0, -0x1

    :goto_14
    add-int/lit8 v3, v0, 0x1

    .line 324
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v4

    .line 325
    invoke-interface {v4, v3, v2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 326
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    if-ge v3, v2, :cond_1b

    add-int/lit8 v0, v0, 0x2

    .line 327
    new-instance v2, Lcom/sumsub/sns/internal/core/presentation/form/model/y;

    const-string v3, "geo+poa"

    invoke-direct {v2, v3}, Lcom/sumsub/sns/internal/core/presentation/form/model/y;-><init>(Ljava/lang/String;)V

    invoke-interface {v4, v0, v2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    :cond_1b
    return-object v4
.end method

.method public final a()V
    .locals 0

    .line 1
    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;)V
    .locals 0

    .line 2
    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;Ljava/lang/String;)V
    .locals 0

    .line 3
    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;Ljava/util/List;)V
    .locals 0

    .line 4
    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/core/presentation/form/model/j;)V
    .locals 3

    .line 91
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "onAction: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/sumsub/sns/internal/features/presentation/geo/a;->a(Ljava/lang/String;)V

    .line 92
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/presentation/form/model/j;->a:Ljava/lang/String;

    .line 93
    const-string/jumbo v0, "upload_document"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 94
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->e()Lcom/sumsub/sns/internal/core/analytics/f;

    move-result-object p1

    sget-object v0, Lcom/sumsub/sns/internal/core/analytics/Control;->SkipButton:Lcom/sumsub/sns/internal/core/analytics/Control;

    const/4 v1, 0x6

    const/4 v2, 0x0

    invoke-static {p1, v0, v2, v2, v1}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/f;Lcom/sumsub/sns/internal/core/analytics/Control;Ljava/util/Map;Lcom/sumsub/sns/internal/core/analytics/Popup;I)V

    .line 95
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/geo/D;->a:Lcom/sumsub/sns/internal/features/presentation/geo/D;

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    :cond_0
    return-void
.end method

.method public final a(Ljava/lang/String;)Z
    .locals 0

    .line 5
    const/4 p1, 0x0

    return p1
.end method

.method public final b()Lcom/sumsub/sns/internal/core/presentation/form/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->l:Lcom/sumsub/sns/internal/features/presentation/geo/Y;

    return-object v0
.end method

.method public final b(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 11

    instance-of v2, p1, Lcom/sumsub/sns/internal/features/presentation/geo/i0;

    if-eqz v2, :cond_0

    move-object v2, p1

    check-cast v2, Lcom/sumsub/sns/internal/features/presentation/geo/i0;

    iget v3, v2, Lcom/sumsub/sns/internal/features/presentation/geo/i0;->d:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/sumsub/sns/internal/features/presentation/geo/i0;->d:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/geo/i0;

    invoke-direct {v2, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/geo/i0;-><init>(Lcom/sumsub/sns/internal/features/presentation/geo/v0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object v0, v2, Lcom/sumsub/sns/internal/features/presentation/geo/i0;->b:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    .line 2
    iget v4, v2, Lcom/sumsub/sns/internal/features/presentation/geo/i0;->d:I

    const/4 v5, 0x2

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v6, 0x1

    if-eqz v4, :cond_3

    if-eq v4, v6, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v2, v2, Lcom/sumsub/sns/internal/features/presentation/geo/i0;->a:Lcom/sumsub/sns/internal/features/presentation/geo/v0;

    :try_start_0
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v10, v2

    goto :goto_3

    :catchall_0
    move-exception v0

    move-object v10, v2

    goto/16 :goto_a

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 3
    iget v0, p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->n:I

    add-int/2addr v0, v6

    iput v0, p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->n:I

    .line 4
    iput v6, v2, Lcom/sumsub/sns/internal/features/presentation/geo/i0;->d:I

    invoke-virtual {p0, v2}, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->a(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_4

    goto :goto_2

    .line 5
    :cond_4
    :goto_1
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/geo/C;

    .line 6
    sget-object v4, Lcom/sumsub/sns/internal/features/presentation/geo/A;->a:Lcom/sumsub/sns/internal/features/presentation/geo/A;

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/geo/t;->a:Lcom/sumsub/sns/internal/features/presentation/geo/t;

    goto/16 :goto_7

    .line 7
    :cond_5
    sget-object v4, Lcom/sumsub/sns/internal/features/presentation/geo/z;->a:Lcom/sumsub/sns/internal/features/presentation/geo/z;

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/geo/u;->a:Lcom/sumsub/sns/internal/features/presentation/geo/u;

    goto/16 :goto_7

    .line 8
    :cond_6
    sget-object v4, Lcom/sumsub/sns/internal/features/presentation/geo/B;->a:Lcom/sumsub/sns/internal/features/presentation/geo/B;

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/geo/v;

    invoke-direct {v0, v9}, Lcom/sumsub/sns/internal/features/presentation/geo/v;-><init>(I)V

    goto/16 :goto_7

    .line 9
    :cond_7
    instance-of v4, v0, Lcom/sumsub/sns/internal/features/presentation/geo/y;

    if-eqz v4, :cond_15

    .line 10
    invoke-virtual {p0, v6}, Lcom/sumsub/sns/core/presentation/base/p0;->showProgress(Z)V

    .line 11
    :try_start_1
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/geo/y;

    .line 12
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/geo/y;->a:Lcom/sumsub/sns/internal/features/data/model/geo/e;

    .line 13
    iput-object p0, v2, Lcom/sumsub/sns/internal/features/presentation/geo/i0;->a:Lcom/sumsub/sns/internal/features/presentation/geo/v0;

    iput v5, v2, Lcom/sumsub/sns/internal/features/presentation/geo/i0;->d:I

    invoke-virtual {p0, v0, v2}, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->a(Lcom/sumsub/sns/internal/features/data/model/geo/e;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    if-ne v0, v3, :cond_8

    :goto_2
    return-object v3

    :cond_8
    move-object v10, p0

    .line 14
    :goto_3
    :try_start_2
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/geo/q;

    .line 15
    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/geo/o;->a:Lcom/sumsub/sns/internal/features/presentation/geo/o;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    .line 16
    new-instance v2, Lcom/sumsub/sns/internal/core/common/t;

    invoke-direct {v2}, Lcom/sumsub/sns/internal/core/common/t;-><init>()V

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v7}, Lcom/sumsub/sns/core/presentation/base/C;->finish$default(Lcom/sumsub/sns/core/presentation/base/C;Lcom/sumsub/sns/internal/core/common/w;Ljava/lang/Object;Ljava/lang/Long;Lcom/sumsub/sns/internal/features/presentation/result/c;ILjava/lang/Object;)V

    goto :goto_5

    :catchall_1
    move-exception v0

    goto/16 :goto_a

    .line 17
    :cond_9
    instance-of v2, v0, Lcom/sumsub/sns/internal/features/presentation/geo/p;

    if-eqz v2, :cond_a

    .line 18
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/geo/r;

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/geo/p;

    .line 19
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/geo/p;->a:Ljava/util/List;

    .line 20
    invoke-direct {v2, v0}, Lcom/sumsub/sns/internal/features/presentation/geo/r;-><init>(Ljava/util/List;)V

    goto :goto_4

    .line 21
    :cond_a
    instance-of v2, v0, Lcom/sumsub/sns/internal/features/presentation/geo/n;

    if-eqz v2, :cond_b

    .line 22
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/geo/w;

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/geo/n;

    .line 23
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/geo/n;->a:Ljava/util/ArrayList;

    .line 24
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {v2, v0}, Lcom/sumsub/sns/internal/features/presentation/geo/w;-><init>(Ljava/lang/String;)V

    :goto_4
    move-object v0, v2

    goto :goto_6

    .line 25
    :cond_b
    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/geo/k;->a:Lcom/sumsub/sns/internal/features/presentation/geo/k;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c

    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/geo/v;

    invoke-direct {v0, v9}, Lcom/sumsub/sns/internal/features/presentation/geo/v;-><init>(I)V

    goto :goto_6

    .line 26
    :cond_c
    instance-of v2, v0, Lcom/sumsub/sns/internal/features/presentation/geo/l;

    if-eqz v2, :cond_d

    .line 27
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/geo/v;

    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/presentation/geo/v;-><init>()V

    goto :goto_6

    .line 28
    :cond_d
    instance-of v2, v0, Lcom/sumsub/sns/internal/features/presentation/geo/m;

    if-eqz v2, :cond_14

    .line 29
    new-instance v2, Lcom/sumsub/sns/internal/features/data/model/common/e0;

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/geo/m;

    .line 30
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/geo/m;->a:Ljava/lang/Throwable;

    const/4 v3, 0x6

    .line 31
    invoke-direct {v2, v0, v8, v8, v3}, Lcom/sumsub/sns/internal/features/data/model/common/e0;-><init>(Ljava/lang/Throwable;Landroid/os/Parcelable;Lcom/sumsub/sns/internal/features/data/model/common/c0;I)V

    .line 32
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->g:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object v0

    .line 33
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    .line 34
    invoke-static/range {v1 .. v7}, Lcom/sumsub/sns/core/presentation/base/C;->throwError$default(Lcom/sumsub/sns/core/presentation/base/C;Lcom/sumsub/sns/internal/features/data/model/common/l0;Ljava/lang/String;ZLjava/lang/String;ILjava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :goto_5
    move-object v0, v8

    .line 35
    :goto_6
    invoke-virtual {v10, v9}, Lcom/sumsub/sns/core/presentation/base/p0;->showProgress(Z)V

    :goto_7
    if-eqz v0, :cond_e

    .line 36
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v2

    invoke-interface {v2}, Lkotlin/reflect/KClass;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_f

    :cond_e
    const-string/jumbo v2, "null"

    .line 37
    :cond_f
    iget v3, p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->n:I

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v5, "sendAddress: attempt="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ", state="

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/sumsub/sns/internal/features/presentation/geo/a;->a(Ljava/lang/String;)V

    if-eqz v0, :cond_13

    .line 38
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->t:Lkotlinx/coroutines/flow/n;

    invoke-interface {v2, v0}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 39
    instance-of v2, v0, Lcom/sumsub/sns/internal/features/presentation/geo/w;

    if-eqz v2, :cond_10

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/geo/w;

    .line 40
    iget-object v8, v0, Lcom/sumsub/sns/internal/features/presentation/geo/w;->a:Ljava/lang/String;

    goto :goto_8

    .line 41
    :cond_10
    instance-of v2, v0, Lcom/sumsub/sns/internal/features/presentation/geo/v;

    if-eqz v2, :cond_11

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/geo/v;

    .line 42
    iget-object v8, v0, Lcom/sumsub/sns/internal/features/presentation/geo/v;->a:Ljava/lang/String;

    :cond_11
    :goto_8
    if-nez v8, :cond_12

    goto :goto_9

    .line 43
    :cond_12
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->e()Lcom/sumsub/sns/internal/core/analytics/f;

    move-result-object v0

    .line 44
    sget-object v2, Lcom/sumsub/sns/internal/core/analytics/Screen;->ProofOfAddressScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 45
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->g:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    invoke-virtual {v3}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object v3

    .line 46
    iget-object v3, v3, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 47
    const-string/jumbo v4, "violation"

    invoke-static {v4, v8}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    invoke-static {v4}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v4

    const/16 v5, 0x8

    .line 48
    invoke-static {v0, v2, v3, v4, v5}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/f;Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Ljava/util/Map;I)V

    .line 49
    :cond_13
    :goto_9
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    .line 50
    :cond_14
    :try_start_3
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_2
    move-exception v0

    move-object v10, p0

    .line 51
    :goto_a
    invoke-virtual {v10, v9}, Lcom/sumsub/sns/core/presentation/base/p0;->showProgress(Z)V

    throw v0

    .line 52
    :cond_15
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method public final b(Lcom/sumsub/sns/internal/core/presentation/form/model/e0;Ljava/lang/String;)V
    .locals 7

    .line 63
    new-instance v0, Ljava/util/ArrayList;

    .line 64
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->m:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->w:[Lkotlin/reflect/KProperty;

    const/4 v3, 0x0

    aget-object v2, v2, v3

    invoke-virtual {v1}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 65
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 66
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    move v2, v3

    move v4, v2

    :goto_0
    if-ge v2, v1, :cond_2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    add-int/lit8 v2, v2, 0x1

    .line 67
    check-cast v5, Lcom/sumsub/sns/internal/features/data/model/common/c;

    .line 68
    iget-object v5, v5, Lcom/sumsub/sns/internal/features/data/model/common/c;->a:Lcom/sumsub/sns/internal/features/data/model/common/y;

    .line 69
    iget-object v5, v5, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    if-eqz v5, :cond_0

    .line 70
    invoke-virtual {v5}, Lcom/sumsub/sns/internal/features/data/model/common/d2;->b()Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    :cond_0
    const/4 v5, 0x0

    :goto_1
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/presentation/form/model/e0;->c()Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;

    move-result-object v6

    .line 71
    iget-object v6, v6, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/F;->a:Ljava/lang/String;

    .line 72
    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_2

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    const/4 v4, -0x1

    :goto_2
    if-gez v4, :cond_3

    return-void

    .line 73
    :cond_3
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/features/data/model/common/c;

    .line 74
    new-instance v1, Lcom/sumsub/sns/internal/features/data/model/common/c;

    .line 75
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/data/model/common/c;->a:Lcom/sumsub/sns/internal/features/data/model/common/y;

    .line 76
    iget-boolean p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/c;->c:Z

    .line 77
    invoke-direct {v1, v2, p2, p1}, Lcom/sumsub/sns/internal/features/data/model/common/c;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/y;Ljava/lang/String;Z)V

    invoke-virtual {v0, v4, v1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 78
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->m:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object p2, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->w:[Lkotlin/reflect/KProperty;

    aget-object p2, p2, v3

    .line 79
    iget-object p2, p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 80
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {p2, p1, v0}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final buildViewStateFlow(Lcom/sumsub/sns/core/presentation/base/O;)Lkotlinx/coroutines/flow/e;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/geo/O;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, p1, p0, v1}, Lcom/sumsub/sns/internal/features/presentation/geo/O;-><init>(Lcom/sumsub/sns/core/presentation/base/O;Lcom/sumsub/sns/internal/features/presentation/geo/v0;Lkotlin/coroutines/Continuation;)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lkotlinx/coroutines/flow/g;->K(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/e;

    .line 10
    move-result-object p1

    .line 11
    return-object p1
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

.method public final d()Lkotlinx/coroutines/flow/w;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->u:Lkotlinx/coroutines/flow/n;

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

.method public final e()Lcom/sumsub/sns/internal/core/analytics/f;
    .locals 4

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/core/analytics/f;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->t:Lkotlinx/coroutines/flow/n;

    .line 5
    .line 6
    .line 7
    invoke-interface {v1}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/geo/x;

    .line 11
    .line 12
    instance-of v1, v1, Lcom/sumsub/sns/internal/features/presentation/geo/r;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    sget-object v1, Lcom/sumsub/sns/internal/core/analytics/Screen;->ProofOfAddressFormScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 17
    goto :goto_0

    .line 18
    .line 19
    :cond_0
    sget-object v1, Lcom/sumsub/sns/internal/core/analytics/Screen;->ProofOfAddressScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 20
    .line 21
    :goto_0
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->g:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 25
    move-result-object v2

    .line 26
    .line 27
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    .line 31
    move-result-object v3

    .line 32
    .line 33
    .line 34
    invoke-direct {v0, v1, v2, v3}, Lcom/sumsub/sns/internal/core/analytics/f;-><init>(Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Ljava/util/Map;)V

    .line 35
    return-object v0
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

.method public final getDocumentType()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->g:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public final intent(Lcom/sumsub/sns/core/presentation/base/Q;)V
    .locals 10

    .line 1
    .line 2
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/geo/G0;

    .line 3
    .line 4
    if-eqz v0, :cond_4

    .line 5
    .line 6
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/geo/G0;

    .line 7
    .line 8
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/geo/E0;->a:Lcom/sumsub/sns/internal/features/presentation/geo/E0;

    .line 9
    .line 10
    .line 11
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x0

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    .line 18
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 19
    move-result-object v2

    .line 20
    .line 21
    new-instance v5, Lcom/sumsub/sns/internal/features/presentation/geo/a0;

    .line 22
    .line 23
    .line 24
    invoke-direct {v5, p0, v1}, Lcom/sumsub/sns/internal/features/presentation/geo/a0;-><init>(Lcom/sumsub/sns/internal/features/presentation/geo/v0;Lkotlin/coroutines/Continuation;)V

    .line 25
    const/4 v6, 0x3

    .line 26
    const/4 v7, 0x0

    .line 27
    const/4 v3, 0x0

    .line 28
    const/4 v4, 0x0

    .line 29
    .line 30
    .line 31
    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 32
    return-void

    .line 33
    .line 34
    :cond_0
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/geo/D0;->a:Lcom/sumsub/sns/internal/features/presentation/geo/D0;

    .line 35
    .line 36
    .line 37
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    move-result v0

    .line 39
    const/4 v2, 0x1

    .line 40
    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, v2}, Lcom/sumsub/sns/core/presentation/base/p0;->showProgress(Z)V

    .line 45
    .line 46
    .line 47
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 48
    move-result-object v3

    .line 49
    .line 50
    .line 51
    invoke-static {}, Lkotlinx/coroutines/z0;->b()Lkotlinx/coroutines/j0;

    .line 52
    move-result-object v4

    .line 53
    .line 54
    new-instance v6, Lcom/sumsub/sns/internal/features/presentation/geo/b0;

    .line 55
    .line 56
    .line 57
    invoke-direct {v6, p0, v1, p0}, Lcom/sumsub/sns/internal/features/presentation/geo/b0;-><init>(Lcom/sumsub/sns/internal/features/presentation/geo/v0;Lkotlin/coroutines/Continuation;Lcom/sumsub/sns/internal/features/presentation/geo/v0;)V

    .line 58
    const/4 v7, 0x2

    .line 59
    const/4 v8, 0x0

    .line 60
    const/4 v5, 0x0

    .line 61
    .line 62
    .line 63
    invoke-static/range {v3 .. v8}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 64
    return-void

    .line 65
    .line 66
    :cond_1
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/geo/F0;->a:Lcom/sumsub/sns/internal/features/presentation/geo/F0;

    .line 67
    .line 68
    .line 69
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    move-result v0

    .line 71
    const/4 v3, 0x6

    .line 72
    .line 73
    if-eqz v0, :cond_2

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->e()Lcom/sumsub/sns/internal/core/analytics/f;

    .line 77
    move-result-object p1

    .line 78
    .line 79
    sget-object v0, Lcom/sumsub/sns/internal/core/analytics/Control;->SkipButton:Lcom/sumsub/sns/internal/core/analytics/Control;

    .line 80
    .line 81
    .line 82
    invoke-static {p1, v0, v1, v1, v3}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/f;Lcom/sumsub/sns/internal/core/analytics/Control;Ljava/util/Map;Lcom/sumsub/sns/internal/core/analytics/Popup;I)V

    .line 83
    .line 84
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/geo/D;->a:Lcom/sumsub/sns/internal/features/presentation/geo/D;

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    .line 88
    return-void

    .line 89
    .line 90
    :cond_2
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/geo/C0;->a:Lcom/sumsub/sns/internal/features/presentation/geo/C0;

    .line 91
    .line 92
    .line 93
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 94
    move-result p1

    .line 95
    .line 96
    if-eqz p1, :cond_3

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->e()Lcom/sumsub/sns/internal/core/analytics/f;

    .line 100
    move-result-object p1

    .line 101
    .line 102
    sget-object v0, Lcom/sumsub/sns/internal/core/analytics/Control;->CannotShareButton:Lcom/sumsub/sns/internal/core/analytics/Control;

    .line 103
    .line 104
    .line 105
    invoke-static {p1, v0, v1, v1, v3}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/f;Lcom/sumsub/sns/internal/core/analytics/Control;Ljava/util/Map;Lcom/sumsub/sns/internal/core/analytics/Popup;I)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0, v2}, Lcom/sumsub/sns/core/presentation/base/p0;->showProgress(Z)V

    .line 109
    .line 110
    .line 111
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 112
    move-result-object v4

    .line 113
    .line 114
    .line 115
    invoke-static {}, Lkotlinx/coroutines/z0;->b()Lkotlinx/coroutines/j0;

    .line 116
    move-result-object v5

    .line 117
    .line 118
    new-instance v7, Lcom/sumsub/sns/internal/features/presentation/geo/Z;

    .line 119
    .line 120
    .line 121
    invoke-direct {v7, p0, v1, p0}, Lcom/sumsub/sns/internal/features/presentation/geo/Z;-><init>(Lcom/sumsub/sns/internal/features/presentation/geo/v0;Lkotlin/coroutines/Continuation;Lcom/sumsub/sns/internal/features/presentation/geo/v0;)V

    .line 122
    const/4 v8, 0x2

    .line 123
    const/4 v9, 0x0

    .line 124
    const/4 v6, 0x0

    .line 125
    .line 126
    .line 127
    invoke-static/range {v4 .. v9}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 128
    return-void

    .line 129
    .line 130
    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 131
    .line 132
    .line 133
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 134
    throw p1

    .line 135
    .line 136
    .line 137
    :cond_4
    invoke-super {p0, p1}, Lcom/sumsub/sns/core/presentation/base/p0;->intent(Lcom/sumsub/sns/core/presentation/base/Q;)V

    .line 138
    return-void
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
