.class public final Lcom/kubi/monitor/FinishType$Companion;
.super Ljava/lang/Object;
.source "FinishType.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/monitor/FinishType;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/kubi/monitor/FinishType$Companion;",
        "",
        "()V",
        "fromHttpCode",
        "Lcom/kubi/monitor/FinishType;",
        "code",
        "",
        "Monitor_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kubi/monitor/FinishType$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromHttpCode(I)Lcom/kubi/monitor/FinishType;
    .locals 2
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const/16 v0, 0xc8

    .line 3
    .line 4
    const/16 v1, 0x12c

    .line 5
    .line 6
    if-gt v0, p1, :cond_0

    .line 7
    .line 8
    if-ge p1, v1, :cond_0

    .line 9
    .line 10
    sget-object p1, Lcom/kubi/monitor/FinishType;->OK:Lcom/kubi/monitor/FinishType;

    .line 11
    return-object p1

    .line 12
    .line 13
    :cond_0
    const/16 v0, 0x190

    .line 14
    .line 15
    if-gt v1, p1, :cond_1

    .line 16
    .line 17
    if-ge p1, v0, :cond_1

    .line 18
    .line 19
    sget-object p1, Lcom/kubi/monitor/FinishType;->UNAUTHENTICATED:Lcom/kubi/monitor/FinishType;

    .line 20
    return-object p1

    .line 21
    .line 22
    :cond_1
    const/16 v1, 0x1f4

    .line 23
    .line 24
    if-gt v0, p1, :cond_2

    .line 25
    .line 26
    if-ge p1, v1, :cond_2

    .line 27
    .line 28
    sget-object p1, Lcom/kubi/monitor/FinishType;->NOT_FOUND:Lcom/kubi/monitor/FinishType;

    .line 29
    return-object p1

    .line 30
    .line 31
    :cond_2
    if-gt v1, p1, :cond_3

    .line 32
    .line 33
    const/16 v0, 0x258

    .line 34
    .line 35
    if-ge p1, v0, :cond_3

    .line 36
    .line 37
    sget-object p1, Lcom/kubi/monitor/FinishType;->DATA_LOSS:Lcom/kubi/monitor/FinishType;

    .line 38
    return-object p1

    .line 39
    .line 40
    :cond_3
    sget-object p1, Lcom/kubi/monitor/FinishType;->UNKNOWN:Lcom/kubi/monitor/FinishType;

    .line 41
    return-object p1
    .line 42
    .line 43
    .line 44
    .line 45
.end method
