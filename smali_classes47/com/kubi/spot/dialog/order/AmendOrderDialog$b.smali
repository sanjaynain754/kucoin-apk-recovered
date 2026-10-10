.class public final Lcom/kubi/spot/dialog/order/AmendOrderDialog$b;
.super Ljava/lang/Object;
.source "AmendOrderDialog.kt"

# interfaces
.implements Lcom/kubi/resources/widget/TradeInputLayoutEditor$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/spot/dialog/order/AmendOrderDialog;->Q4()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"
    }
    d2 = {
        "com/kubi/spot/dialog/order/AmendOrderDialog$initListener$1",
        "Lcom/kubi/resources/widget/TradeInputLayoutEditor$OnSubOrAddClickListener;",
        "click",
        "",
        "isSub",
        "",
        "SpotLib_googleRelease"
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
        "SMAP\nAmendOrderDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AmendOrderDialog.kt\ncom/kubi/spot/dialog/order/AmendOrderDialog$initListener$1\n+ 2 SpotIssue.kt\ncom/kubi/spot/exeption/SpotIssueKt\n*L\n1#1,403:1\n43#2,7:404\n*S KotlinDebug\n*F\n+ 1 AmendOrderDialog.kt\ncom/kubi/spot/dialog/order/AmendOrderDialog$initListener$1\n*L\n300#1:404,7\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/kubi/spot/dialog/order/AmendOrderDialog;


# direct methods
.method public constructor <init>(Lcom/kubi/spot/dialog/order/AmendOrderDialog;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/spot/dialog/order/AmendOrderDialog$b;->a:Lcom/kubi/spot/dialog/order/AmendOrderDialog;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    return-void
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
.end method


# virtual methods
.method public a(Z)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/spot/dialog/order/AmendOrderDialog$b;->a:Lcom/kubi/spot/dialog/order/AmendOrderDialog;

    .line 3
    .line 4
    :try_start_0
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 5
    .line 6
    .line 7
    invoke-static {v0, p1}, Lcom/kubi/spot/dialog/order/AmendOrderDialog;->x4(Lcom/kubi/spot/dialog/order/AmendOrderDialog;Z)V

    .line 8
    .line 9
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-exception p1

    .line 16
    .line 17
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 18
    .line 19
    .line 20
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 21
    move-result-object p1

    .line 22
    .line 23
    .line 24
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    move-result-object p1

    .line 26
    .line 27
    .line 28
    :goto_0
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 29
    move-result-object p1

    .line 30
    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    const-string v0, "handleFirstClickAndAdjustNum"

    .line 34
    .line 35
    .line 36
    invoke-static {p1, v0}, Lw20/a;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 37
    :cond_0
    return-void
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
.end method
