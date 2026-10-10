.class final Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l11111lIl$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l11111lIl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field private synthetic l1111l111111Il:Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l11111lIl;


# direct methods
.method public constructor <init>(Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l11111lIl;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l11111lIl$1;->l1111l111111Il:Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l11111lIl;

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
.end method


# virtual methods
.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 0

    .line 1
    .line 2
    :try_start_0
    iget-object p1, p0, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l11111lIl$1;->l1111l111111Il:Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l11111lIl;

    .line 3
    .line 4
    .line 5
    invoke-static {p1}, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l11111lIl;->l1111l111111Il(Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l11111lIl;)Ljava/util/concurrent/LinkedBlockingQueue;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1, p2}, Ljava/util/concurrent/LinkedBlockingQueue;->put(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    :catch_0
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
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method
