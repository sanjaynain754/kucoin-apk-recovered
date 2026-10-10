.class public final Lcom/sumsub/sns/internal/core/data/network/a;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lretrofit2/CallAdapter;


# instance fields
.field public final a:Ljava/lang/reflect/Type;

.field public final b:Lretrofit2/Converter;

.field public final c:Lcom/sumsub/sns/internal/core/common/S0;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Type;Lretrofit2/Converter;Lcom/sumsub/sns/internal/core/common/S0;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/data/network/a;->a:Ljava/lang/reflect/Type;

    .line 6
    .line 7
    iput-object p2, p0, Lcom/sumsub/sns/internal/core/data/network/a;->b:Lretrofit2/Converter;

    .line 8
    .line 9
    iput-object p3, p0, Lcom/sumsub/sns/internal/core/data/network/a;->c:Lcom/sumsub/sns/internal/core/common/S0;

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
    .line 105
.end method


# virtual methods
.method public final adapt(Lretrofit2/Call;)Ljava/lang/Object;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/core/data/network/d;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/data/network/a;->b:Lretrofit2/Converter;

    .line 5
    .line 6
    iget-object v2, p0, Lcom/sumsub/sns/internal/core/data/network/a;->c:Lcom/sumsub/sns/internal/core/common/S0;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, p1, v1, v2}, Lcom/sumsub/sns/internal/core/data/network/d;-><init>(Lretrofit2/Call;Lretrofit2/Converter;Lcom/sumsub/sns/internal/core/common/S0;)V

    .line 10
    return-object v0
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
.end method

.method public final responseType()Ljava/lang/reflect/Type;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/data/network/a;->a:Ljava/lang/reflect/Type;

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
