.class public final Lcom/kubi/futures/dialog/twap/TotalTimeSettingDialog$a;
.super Ljava/lang/Object;
.source "TotalTimeSettingDialog.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/futures/dialog/twap/TotalTimeSettingDialog;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0010\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0011\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0096\u0002\u00a8\u0006\u0006"
    }
    d2 = {
        "com/kubi/futures/dialog/twap/TotalTimeSettingDialog$daySelectedListener$1",
        "Lkotlin/Function1;",
        "",
        "",
        "invoke",
        "selectedIndex",
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


# instance fields
.field public final synthetic b:Lcom/kubi/futures/dialog/twap/TotalTimeSettingDialog;


# direct methods
.method public constructor <init>(Lcom/kubi/futures/dialog/twap/TotalTimeSettingDialog;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/futures/dialog/twap/TotalTimeSettingDialog$a;->b:Lcom/kubi/futures/dialog/twap/TotalTimeSettingDialog;

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
.end method


# virtual methods
.method public a(I)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/dialog/twap/TotalTimeSettingDialog$a;->b:Lcom/kubi/futures/dialog/twap/TotalTimeSettingDialog;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/kubi/futures/dialog/twap/TotalTimeSettingDialog;->t4(Lcom/kubi/futures/dialog/twap/TotalTimeSettingDialog;)Lkotlin/ranges/IntRange;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    .line 13
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    check-cast p1, Ljava/lang/Number;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 20
    move-result p1

    .line 21
    int-to-long v1, p1

    .line 22
    .line 23
    .line 24
    invoke-static {v0, v1, v2}, Lcom/kubi/futures/dialog/twap/TotalTimeSettingDialog;->w4(Lcom/kubi/futures/dialog/twap/TotalTimeSettingDialog;J)V

    .line 25
    .line 26
    iget-object p1, p0, Lcom/kubi/futures/dialog/twap/TotalTimeSettingDialog$a;->b:Lcom/kubi/futures/dialog/twap/TotalTimeSettingDialog;

    .line 27
    .line 28
    .line 29
    invoke-static {p1}, Lcom/kubi/futures/dialog/twap/TotalTimeSettingDialog;->s4(Lcom/kubi/futures/dialog/twap/TotalTimeSettingDialog;)V

    .line 30
    return-void
    .line 31
    .line 32
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    check-cast p1, Ljava/lang/Number;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 6
    move-result p1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lcom/kubi/futures/dialog/twap/TotalTimeSettingDialog$a;->a(I)V

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 12
    return-object p1
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
