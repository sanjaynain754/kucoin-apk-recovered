.class public final Lcom/jumio/core/network/DefaultBackendConfig;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jumio/core/network/BackendConfigInterface;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0008\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/jumio/core/network/DefaultBackendConfig;",
        "Lcom/jumio/core/network/BackendConfigInterface;",
        "<init>",
        "()V",
        "euSettings",
        "Lcom/jumio/core/network/BackendSettings;",
        "usSettings",
        "sgSettings",
        "get",
        "dataCenter",
        "Lcom/jumio/sdk/enums/JumioDataCenter;",
        "jumio-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Ljumio/core/k;

.field public final b:Ljumio/core/k;

.field public final c:Ljumio/core/k;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljumio/core/k;

    .line 6
    .line 7
    sget-object v1, Ljumio/core/h;->b:Ljava/lang/String;

    .line 8
    .line 9
    sget-object v2, Ljumio/core/c;->b:Ljava/lang/String;

    .line 10
    .line 11
    sget-object v3, Ljumio/core/c;->e:Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, v1, v2, v3}, Ljumio/core/k;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    iput-object v0, p0, Lcom/jumio/core/network/DefaultBackendConfig;->a:Ljumio/core/k;

    .line 17
    .line 18
    new-instance v0, Ljumio/core/k;

    .line 19
    .line 20
    sget-object v1, Ljumio/core/h;->a:Ljava/lang/String;

    .line 21
    .line 22
    sget-object v2, Ljumio/core/c;->a:Ljava/lang/String;

    .line 23
    .line 24
    sget-object v3, Ljumio/core/c;->d:Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    invoke-direct {v0, v1, v2, v3}, Ljumio/core/k;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    iput-object v0, p0, Lcom/jumio/core/network/DefaultBackendConfig;->b:Ljumio/core/k;

    .line 30
    .line 31
    new-instance v0, Ljumio/core/k;

    .line 32
    .line 33
    sget-object v1, Ljumio/core/h;->c:Ljava/lang/String;

    .line 34
    .line 35
    sget-object v2, Ljumio/core/c;->c:Ljava/lang/String;

    .line 36
    .line 37
    sget-object v3, Ljumio/core/c;->f:Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    invoke-direct {v0, v1, v2, v3}, Ljumio/core/k;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    iput-object v0, p0, Lcom/jumio/core/network/DefaultBackendConfig;->c:Ljumio/core/k;

    .line 43
    return-void
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
.end method


# virtual methods
.method public get(Lcom/jumio/sdk/enums/JumioDataCenter;)Ljumio/core/k;
    .locals 1
    .param p1    # Lcom/jumio/sdk/enums/JumioDataCenter;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "dataCenter"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Ljumio/core/K0;->a:[I

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 11
    move-result p1

    .line 12
    .line 13
    aget p1, v0, p1

    .line 14
    const/4 v0, 0x1

    .line 15
    .line 16
    if-eq p1, v0, :cond_2

    .line 17
    const/4 v0, 0x2

    .line 18
    .line 19
    if-eq p1, v0, :cond_1

    .line 20
    const/4 v0, 0x3

    .line 21
    .line 22
    if-ne p1, v0, :cond_0

    .line 23
    .line 24
    iget-object p1, p0, Lcom/jumio/core/network/DefaultBackendConfig;->c:Ljumio/core/k;

    .line 25
    return-object p1

    .line 26
    .line 27
    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 28
    .line 29
    .line 30
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 31
    throw p1

    .line 32
    .line 33
    :cond_1
    iget-object p1, p0, Lcom/jumio/core/network/DefaultBackendConfig;->b:Ljumio/core/k;

    .line 34
    return-object p1

    .line 35
    .line 36
    :cond_2
    iget-object p1, p0, Lcom/jumio/core/network/DefaultBackendConfig;->a:Ljumio/core/k;

    .line 37
    return-object p1
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
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
.end method
