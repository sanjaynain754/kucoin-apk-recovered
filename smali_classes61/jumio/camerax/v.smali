.class public abstract Ljumio/camerax/v;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lkotlin/Triple;

.field public static final b:Lkotlin/Triple;

.field public static final c:Lkotlin/Triple;

.field public static final d:Lkotlin/Triple;

.field public static final e:Lkotlin/Triple;

.field public static final f:Lkotlin/Triple;

.field public static final g:Lkotlin/Triple;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    .line 2
    new-instance v0, Lkotlin/Triple;

    .line 3
    .line 4
    const/high16 v1, 0x3f800000    # 1.0f

    .line 5
    .line 6
    .line 7
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v1, v1, v1}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 12
    .line 13
    sput-object v0, Ljumio/camerax/v;->a:Lkotlin/Triple;

    .line 14
    .line 15
    new-instance v0, Lkotlin/Triple;

    .line 16
    .line 17
    const/high16 v1, 0x40800000    # 4.0f

    .line 18
    .line 19
    .line 20
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    .line 24
    const v2, 0x3dcccccd    # 0.1f

    .line 25
    .line 26
    .line 27
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 28
    move-result-object v2

    .line 29
    .line 30
    .line 31
    const v3, 0x3e4ccccd    # 0.2f

    .line 32
    .line 33
    .line 34
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 35
    move-result-object v3

    .line 36
    .line 37
    .line 38
    invoke-direct {v0, v1, v2, v3}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 39
    .line 40
    sput-object v0, Ljumio/camerax/v;->b:Lkotlin/Triple;

    .line 41
    .line 42
    new-instance v0, Lkotlin/Triple;

    .line 43
    .line 44
    const/high16 v4, 0x40000000    # 2.0f

    .line 45
    .line 46
    .line 47
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 48
    move-result-object v4

    .line 49
    .line 50
    .line 51
    invoke-direct {v0, v1, v4, v3}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 52
    .line 53
    sput-object v0, Ljumio/camerax/v;->c:Lkotlin/Triple;

    .line 54
    .line 55
    new-instance v0, Lkotlin/Triple;

    .line 56
    .line 57
    .line 58
    invoke-direct {v0, v3, v1, v3}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 59
    .line 60
    sput-object v0, Ljumio/camerax/v;->d:Lkotlin/Triple;

    .line 61
    .line 62
    new-instance v0, Lkotlin/Triple;

    .line 63
    .line 64
    .line 65
    invoke-direct {v0, v3, v4, v1}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 66
    .line 67
    sput-object v0, Ljumio/camerax/v;->e:Lkotlin/Triple;

    .line 68
    .line 69
    new-instance v0, Lkotlin/Triple;

    .line 70
    .line 71
    .line 72
    invoke-direct {v0, v3, v2, v1}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 73
    .line 74
    sput-object v0, Ljumio/camerax/v;->f:Lkotlin/Triple;

    .line 75
    .line 76
    new-instance v0, Lkotlin/Triple;

    .line 77
    .line 78
    .line 79
    invoke-direct {v0, v1, v2, v1}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 80
    .line 81
    sput-object v0, Ljumio/camerax/v;->g:Lkotlin/Triple;

    .line 82
    return-void
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
.end method

.method public static final a()Ljava/util/List;
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    .line 4
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    move-result-object v0

    .line 6
    const/4 v1, 0x3

    .line 7
    .line 8
    .line 9
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    .line 13
    filled-new-array {v0, v1}, [Ljava/lang/Integer;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 18
    move-result-object v0

    .line 19
    return-object v0
    .line 20
    .line 21
.end method
