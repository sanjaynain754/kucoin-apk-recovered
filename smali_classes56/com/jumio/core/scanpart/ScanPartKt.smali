.class public final Lcom/jumio/core/scanpart/ScanPartKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "pluginModule",
        "Lcom/jumio/core/plugins/PluginModule;",
        "Lcom/jumio/core/data/ScanMode;",
        "getPluginModule",
        "(Lcom/jumio/core/data/ScanMode;)Lcom/jumio/core/plugins/PluginModule;",
        "Lcom/jumio/core/models/ScanPartModel;",
        "(Lcom/jumio/core/models/ScanPartModel;)Lcom/jumio/core/plugins/PluginModule;",
        "jumio-core_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final access$getPluginModule(Lcom/jumio/core/models/ScanPartModel;)Ljumio/core/W2;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/jumio/core/models/ScanPartModel;->getMode()Lcom/jumio/core/data/ScanMode;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    sget-object v1, Lcom/jumio/core/data/ScanMode;->FILE:Lcom/jumio/core/data/ScanMode;

    .line 7
    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    instance-of v0, p0, Lcom/jumio/core/models/DigitalIdScanPartModel;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    sget-object p0, Ljumio/core/W2;->j:Ljumio/core/W2;

    .line 15
    return-object p0

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-virtual {p0}, Lcom/jumio/core/models/ScanPartModel;->getMode()Lcom/jumio/core/data/ScanMode;

    .line 19
    move-result-object p0

    .line 20
    .line 21
    .line 22
    invoke-static {p0}, Lcom/jumio/core/scanpart/ScanPartKt;->getPluginModule(Lcom/jumio/core/data/ScanMode;)Ljumio/core/W2;

    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public static final getPluginModule(Lcom/jumio/core/data/ScanMode;)Ljumio/core/W2;
    .locals 1
    .param p0    # Lcom/jumio/core/data/ScanMode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Ljumio/core/y3;->a:[I

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 11
    move-result p0

    .line 12
    .line 13
    aget p0, v0, p0

    .line 14
    .line 15
    .line 16
    packed-switch p0, :pswitch_data_0

    .line 17
    .line 18
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 22
    throw p0

    .line 23
    .line 24
    :pswitch_0
    sget-object p0, Ljumio/core/W2;->j:Ljumio/core/W2;

    .line 25
    return-object p0

    .line 26
    .line 27
    :pswitch_1
    sget-object p0, Ljumio/core/W2;->h:Ljumio/core/W2;

    .line 28
    return-object p0

    .line 29
    .line 30
    :pswitch_2
    sget-object p0, Ljumio/core/W2;->k:Ljumio/core/W2;

    .line 31
    return-object p0

    .line 32
    .line 33
    :pswitch_3
    sget-object p0, Ljumio/core/W2;->i:Ljumio/core/W2;

    .line 34
    return-object p0

    .line 35
    .line 36
    :pswitch_4
    sget-object p0, Ljumio/core/W2;->h:Ljumio/core/W2;

    .line 37
    return-object p0

    .line 38
    .line 39
    :pswitch_5
    sget-object p0, Ljumio/core/W2;->g:Ljumio/core/W2;

    .line 40
    return-object p0

    .line 41
    .line 42
    :pswitch_6
    sget-object p0, Ljumio/core/W2;->d:Ljumio/core/W2;

    .line 43
    return-object p0

    .line 44
    .line 45
    :pswitch_7
    sget-object p0, Ljumio/core/W2;->e:Ljumio/core/W2;

    .line 46
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
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
