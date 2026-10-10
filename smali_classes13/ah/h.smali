.class public final Lah/h;
.super Ljava/lang/Object;
.source "ITrialOrderSocketApi.kt"

# interfaces
.implements Lkr/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkr/c<",
        "Lcom/kubi/network/api/subscribe/model/SubscribeMessage;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0008\u0002\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u0016\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\t\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/kubi/futures/classic/common/order/api/TrialAdvanceOrderConverts;",
        "Lcom/kubi/network/restful/core/IConverter;",
        "Lcom/kubi/network/api/subscribe/model/SubscribeMessage;",
        "",
        "<init>",
        "()V",
        "trialOrderSubject",
        "",
        "",
        "[Ljava/lang/String;",
        "convert",
        "value",
        "KumexLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nITrialOrderSocketApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ITrialOrderSocketApi.kt\ncom/kubi/futures/classic/common/order/api/TrialAdvanceOrderConverts\n+ 2 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,107:1\n149#2:108\n149#2:109\n*S KotlinDebug\n*F\n+ 1 ITrialOrderSocketApi.kt\ncom/kubi/futures/classic/common/order/api/TrialAdvanceOrderConverts\n*L\n98#1:108\n100#1:109\n*E\n"
    }
.end annotation


# instance fields
.field public final a:[Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    const-string v0, "trade.stopOrderUpdate"

    .line 6
    .line 7
    const-string v1, "trade.stopOrderCancelled"

    .line 8
    .line 9
    const-string v2, "trade.stopOrderCreated"

    .line 10
    .line 11
    .line 12
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    iput-object v0, p0, Lah/h;->a:[Ljava/lang/String;

    .line 16
    return-void
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
.end method


# virtual methods
.method public a(Lcom/kubi/network/api/subscribe/model/SubscribeMessage;)Ljava/lang/Object;
    .locals 3
    .param p1    # Lcom/kubi/network/api/subscribe/model/SubscribeMessage;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    const-string v0, "value"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/kubi/network/api/subscribe/model/SubscribeMessage;->getTopic()Ljava/lang/String;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    const-string v1, "/futuresTrial/stopOrder"

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    move-result v0

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lah/h;->a:[Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/kubi/network/api/subscribe/model/SubscribeMessage;->getSubject()Ljava/lang/String;

    .line 23
    move-result-object v2

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v2}, Lkotlin/collections/ArraysKt;->contains([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    move-result v0

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/kubi/network/api/subscribe/model/SubscribeMessage;->getData()Ljava/lang/String;

    .line 33
    move-result-object p1

    .line 34
    .line 35
    .line 36
    invoke-static {p1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 37
    move-result-object p1

    .line 38
    .line 39
    sget-object v0, Lcom/kubi/utils/x;->a:Lcom/kubi/utils/x;

    .line 40
    .line 41
    new-instance v0, Lah/h$a;

    .line 42
    .line 43
    .line 44
    invoke-direct {v0}, Lah/h$a;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 48
    move-result-object v0

    .line 49
    .line 50
    .line 51
    invoke-static {p1, v0}, Lcom/kubi/utils/x;->d(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 52
    move-result-object p1

    .line 53
    return-object p1

    .line 54
    .line 55
    .line 56
    :cond_0
    invoke-virtual {p1}, Lcom/kubi/network/api/subscribe/model/SubscribeMessage;->getTopic()Ljava/lang/String;

    .line 57
    move-result-object v0

    .line 58
    .line 59
    .line 60
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 61
    move-result v0

    .line 62
    .line 63
    if-eqz v0, :cond_1

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1}, Lcom/kubi/network/api/subscribe/model/SubscribeMessage;->getSubject()Ljava/lang/String;

    .line 67
    move-result-object v0

    .line 68
    .line 69
    const-string v1, "trade.stopOrderActive"

    .line 70
    .line 71
    .line 72
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    move-result v0

    .line 74
    .line 75
    if-eqz v0, :cond_1

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1}, Lcom/kubi/network/api/subscribe/model/SubscribeMessage;->getData()Ljava/lang/String;

    .line 79
    move-result-object p1

    .line 80
    .line 81
    .line 82
    invoke-static {p1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 83
    move-result-object p1

    .line 84
    .line 85
    sget-object v0, Lcom/kubi/utils/x;->a:Lcom/kubi/utils/x;

    .line 86
    .line 87
    new-instance v0, Lah/h$b;

    .line 88
    .line 89
    .line 90
    invoke-direct {v0}, Lah/h$b;-><init>()V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 94
    move-result-object v0

    .line 95
    .line 96
    .line 97
    invoke-static {p1, v0}, Lcom/kubi/utils/x;->d(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 98
    move-result-object p1

    .line 99
    return-object p1

    .line 100
    :cond_1
    const/4 p1, 0x0

    .line 101
    return-object p1
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
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
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
.end method

.method public bridge synthetic convert(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    check-cast p1, Lcom/kubi/network/api/subscribe/model/SubscribeMessage;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lah/h;->a(Lcom/kubi/network/api/subscribe/model/SubscribeMessage;)Ljava/lang/Object;

    .line 6
    move-result-object p1

    .line 7
    return-object p1
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
.end method
