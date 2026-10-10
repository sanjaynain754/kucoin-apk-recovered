.class final Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l1111lI1l$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l1111lI1l;->l1111l111111Il(J)Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field private synthetic l1111l111111Il:Ljava/util/concurrent/CountDownLatch;

.field private synthetic l111l11111lIl:Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l1111lI1l;


# direct methods
.method public constructor <init>(Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l1111lI1l;Ljava/util/concurrent/CountDownLatch;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l1111lI1l$1;->l111l11111lIl:Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l1111lI1l;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l1111lI1l$1;->l1111l111111Il:Ljava/util/concurrent/CountDownLatch;

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
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l1111lI1l$1;->l111l11111lIl:Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l1111lI1l;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l1111lI1l;->l1111l111111Il()Ljava/lang/String;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1}, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l1111lI1l;->l1111l111111Il(Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l1111lI1l;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    :catchall_0
    iget-object v0, p0, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l1111lI1l$1;->l1111l111111Il:Ljava/util/concurrent/CountDownLatch;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method
