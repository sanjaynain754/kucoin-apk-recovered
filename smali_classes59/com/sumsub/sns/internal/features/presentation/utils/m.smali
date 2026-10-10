.class public final Lcom/sumsub/sns/internal/features/presentation/utils/m;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# static fields
.field public static final synthetic e:[Lkotlin/reflect/KProperty;


# instance fields
.field public final a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

.field public final b:Lcom/sumsub/sns/internal/features/presentation/utils/SecondSidePolicy;

.field public final c:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public final d:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    .line 2
    const-class v0, Lcom/sumsub/sns/internal/features/presentation/utils/m;

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "side"

    .line 6
    .line 7
    const-string v2, "getSide()Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;"

    .line 8
    const/4 v3, 0x0

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, v2, v3}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    .line 15
    const-string/jumbo v2, "sideness"

    .line 16
    .line 17
    const-string v4, "getSideness()Lcom/sumsub/sns/internal/features/domain/documents/DocumentSideness;"

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v2, v4, v3}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 21
    move-result-object v0

    .line 22
    const/4 v2, 0x2

    .line 23
    .line 24
    new-array v2, v2, [Lkotlin/reflect/KProperty;

    .line 25
    .line 26
    aput-object v1, v2, v3

    .line 27
    const/4 v1, 0x1

    .line 28
    .line 29
    aput-object v0, v2, v1

    .line 30
    .line 31
    sput-object v2, Lcom/sumsub/sns/internal/features/presentation/utils/m;->e:[Lkotlin/reflect/KProperty;

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
.end method

.method public constructor <init>(Landroidx/lifecycle/SavedStateHandle;Lcom/sumsub/sns/internal/features/data/model/common/Document;Lcom/sumsub/sns/internal/features/presentation/utils/SecondSidePolicy;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/utils/m;->a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 6
    .line 7
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/utils/m;->b:Lcom/sumsub/sns/internal/features/presentation/utils/SecondSidePolicy;

    .line 8
    .line 9
    new-instance p2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 10
    .line 11
    sget-object p3, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;->Front:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 12
    .line 13
    const-string v0, "KEY_IDENTITY_SIDE"

    .line 14
    const/4 v1, 0x0

    .line 15
    .line 16
    .line 17
    invoke-direct {p2, p1, v0, p3, v1}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 18
    .line 19
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/utils/m;->c:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 20
    .line 21
    new-instance p2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 22
    .line 23
    sget-object p3, Lcom/sumsub/sns/internal/features/domain/documents/DocumentSideness;->UNKNOWN:Lcom/sumsub/sns/internal/features/domain/documents/DocumentSideness;

    .line 24
    .line 25
    const-string v0, "KEY_DOCUMENT_SIDENESS"

    .line 26
    .line 27
    .line 28
    invoke-direct {p2, p1, v0, p3, v1}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 29
    .line 30
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/utils/m;->d:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 31
    return-void
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
.end method


# virtual methods
.method public final a()Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/utils/m;->c:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/utils/m;->e:[Lkotlin/reflect/KProperty;

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    check-cast v0, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
.end method
