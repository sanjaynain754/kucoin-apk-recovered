.class public Lxb0/b$a;
.super Ljava/lang/Object;
.source "RxPermissions.java"

# interfaces
.implements Lxb0/b$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxb0/b;->f(Landroidx/fragment/app/FragmentManager;)Lxb0/b$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lxb0/b$d<",
        "Lcom/tbruyelle/rxpermissions2/RxPermissionsFragment;",
        ">;"
    }
.end annotation


# instance fields
.field public a:Lcom/tbruyelle/rxpermissions2/RxPermissionsFragment;

.field public final synthetic b:Landroidx/fragment/app/FragmentManager;

.field public final synthetic c:Lxb0/b;


# direct methods
.method public constructor <init>(Lxb0/b;Landroidx/fragment/app/FragmentManager;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lxb0/b$a;->c:Lxb0/b;

    .line 3
    .line 4
    iput-object p2, p0, Lxb0/b$a;->b:Landroidx/fragment/app/FragmentManager;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    return-void
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
.end method


# virtual methods
.method public declared-synchronized a()Lcom/tbruyelle/rxpermissions2/RxPermissionsFragment;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p0, Lxb0/b$a;->a:Lcom/tbruyelle/rxpermissions2/RxPermissionsFragment;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lxb0/b$a;->c:Lxb0/b;

    .line 8
    .line 9
    iget-object v1, p0, Lxb0/b$a;->b:Landroidx/fragment/app/FragmentManager;

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1}, Lxb0/b;->a(Lxb0/b;Landroidx/fragment/app/FragmentManager;)Lcom/tbruyelle/rxpermissions2/RxPermissionsFragment;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    iput-object v0, p0, Lxb0/b$a;->a:Lcom/tbruyelle/rxpermissions2/RxPermissionsFragment;

    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception v0

    .line 18
    goto :goto_1

    .line 19
    .line 20
    :cond_0
    :goto_0
    iget-object v0, p0, Lxb0/b$a;->a:Lcom/tbruyelle/rxpermissions2/RxPermissionsFragment;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    monitor-exit p0

    .line 22
    return-object v0

    .line 23
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    throw v0
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
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lxb0/b$a;->a()Lcom/tbruyelle/rxpermissions2/RxPermissionsFragment;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method
