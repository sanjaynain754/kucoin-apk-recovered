.class public final synthetic Lcom/kubi/futures/compliance/leverage/EuropeTrialSimulationOrderDialog$a;
.super Ljava/lang/Object;
.source "EuropeTrialSimulationOrderDialog.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/futures/compliance/leverage/EuropeTrialSimulationOrderDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final synthetic $EnumSwitchMapping$0:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/kumex/logic/constant/OrderTradeType;->values()[Lcom/kubi/kumex/logic/constant/OrderTradeType;

    .line 4
    move-result-object v0

    .line 5
    array-length v0, v0

    .line 6
    .line 7
    new-array v0, v0, [I

    .line 8
    .line 9
    :try_start_0
    sget-object v1, Lcom/kubi/kumex/logic/constant/OrderTradeType;->Limit:Lcom/kubi/kumex/logic/constant/OrderTradeType;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x1

    .line 15
    .line 16
    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    .line 18
    :catch_0
    :try_start_1
    sget-object v1, Lcom/kubi/kumex/logic/constant/OrderTradeType;->Market:Lcom/kubi/kumex/logic/constant/OrderTradeType;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 22
    move-result v1

    .line 23
    const/4 v2, 0x2

    .line 24
    .line 25
    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    .line 26
    .line 27
    :catch_1
    sput-object v0, Lcom/kubi/futures/compliance/leverage/EuropeTrialSimulationOrderDialog$a;->$EnumSwitchMapping$0:[I

    .line 28
    return-void
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method
