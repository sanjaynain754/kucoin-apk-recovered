.class public final Lcom/kubi/assets/autoearn/AutoEarnOpenDialog$initViewModel$1$1$a;
.super Ljava/lang/Object;
.source "AutoEarnOpenDialog.kt"

# interfaces
.implements Lkotlinx/coroutines/flow/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/assets/autoearn/AutoEarnOpenDialog$initViewModel$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lkotlinx/coroutines/flow/f;"
    }
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


# instance fields
.field public final synthetic b:Lcom/kubi/assets/autoearn/AutoEarnOpenDialog;


# direct methods
.method public constructor <init>(Lcom/kubi/assets/autoearn/AutoEarnOpenDialog;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/assets/autoearn/AutoEarnOpenDialog$initViewModel$1$1$a;->b:Lcom/kubi/assets/autoearn/AutoEarnOpenDialog;

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
.end method

.method public static synthetic a(Landroidx/fragment/app/FragmentActivity;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/assets/autoearn/AutoEarnOpenDialog$initViewModel$1$1$a;->f(Landroidx/fragment/app/FragmentActivity;)Lkotlin/Unit;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static final f(Landroidx/fragment/app/FragmentActivity;)Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/kubi/assets/autoearn/AutoEarnOpenSuccDialog;->v0:Lcom/kubi/assets/autoearn/AutoEarnOpenSuccDialog$Companion;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/kubi/assets/autoearn/AutoEarnOpenSuccDialog$Companion;->create()Lcom/kubi/assets/autoearn/AutoEarnOpenSuccDialog;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 15
    move-result-object p0

    .line 16
    .line 17
    const-string v1, "getSupportFragmentManager(...)"

    .line 18
    .line 19
    .line 20
    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    const-string v1, ""

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p0, v1}, Lcom/kubi/resources/dialog/BaseDialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 26
    .line 27
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 28
    return-object p0
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
.end method


# virtual methods
.method public final c(Lcom/kubi/assets/autoearn/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/assets/autoearn/f;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    instance-of p2, p1, Lcom/kubi/assets/autoearn/f$d;

    .line 3
    .line 4
    if-eqz p2, :cond_0

    .line 5
    const/4 v4, 0x4

    .line 6
    const/4 v5, 0x0

    .line 7
    .line 8
    const-string v0, "AUTO_EARN_STATE_REFRESH"

    .line 9
    .line 10
    const-wide/16 v2, 0x0

    .line 11
    move-object v1, p1

    .line 12
    .line 13
    .line 14
    invoke-static/range {v0 .. v5}, Lcom/kubi/event/api/a;->d(Ljava/lang/String;Ljava/lang/Object;JILjava/lang/Object;)V

    .line 15
    .line 16
    iget-object p1, p0, Lcom/kubi/assets/autoearn/AutoEarnOpenDialog$initViewModel$1$1$a;->b:Lcom/kubi/assets/autoearn/AutoEarnOpenDialog;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/kubi/resources/dialog/DialogFragmentHelper;->dismiss()V

    .line 20
    .line 21
    new-instance p1, Lcom/kubi/assets/autoearn/r;

    .line 22
    .line 23
    .line 24
    invoke-direct {p1}, Lcom/kubi/assets/autoearn/r;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-static {p1}, Lny/b;->c(Lkotlin/jvm/functions/Function1;)V

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move-object v1, p1

    .line 30
    nop

    .line 31
    .line 32
    instance-of p1, v1, Lcom/kubi/assets/autoearn/f$c;

    .line 33
    .line 34
    if-eqz p1, :cond_1

    .line 35
    move-object p1, v1

    .line 36
    .line 37
    check-cast p1, Lcom/kubi/assets/autoearn/f$c;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Lcom/kubi/assets/autoearn/f$c;->a()Ljava/lang/String;

    .line 41
    move-result-object p1

    .line 42
    const/4 p2, 0x0

    .line 43
    .line 44
    new-array p2, p2, [Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    invoke-static {p1, p2}, Lcom/kubi/utils/ToastCompat;->G(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 48
    goto :goto_0

    .line 49
    .line 50
    :cond_1
    iget-object p1, p0, Lcom/kubi/assets/autoearn/AutoEarnOpenDialog$initViewModel$1$1$a;->b:Lcom/kubi/assets/autoearn/AutoEarnOpenDialog;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Lcom/kubi/resources/dialog/DialogFragmentHelper;->dismiss()V

    .line 54
    .line 55
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 56
    return-object p1
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    check-cast p1, Lcom/kubi/assets/autoearn/f;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/kubi/assets/autoearn/AutoEarnOpenDialog$initViewModel$1$1$a;->c(Lcom/kubi/assets/autoearn/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
.end method
