.class Lcom/datavisorobfus/r$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/datavisorobfus/r;->g0(Landroid/content/Context;)Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:[Lcom/datavisorobfus/o;

.field final synthetic b:Lcom/datavisorobfus/r;


# direct methods
.method public constructor <init>(Lcom/datavisorobfus/r;[Lcom/datavisorobfus/o;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/datavisorobfus/r$d;->b:Lcom/datavisorobfus/r;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/datavisorobfus/r$d;->a:[Lcom/datavisorobfus/o;

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
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/datavisorobfus/r$d;->a:[Lcom/datavisorobfus/o;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    aget-object v0, v0, v1

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/datavisorobfus/o;->a()V

    .line 13
    .line 14
    iget-object v0, p0, Lcom/datavisorobfus/r$d;->a:[Lcom/datavisorobfus/o;

    .line 15
    const/4 v2, 0x0

    .line 16
    .line 17
    aput-object v2, v0, v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    :catchall_0
    :cond_0
    return-void
.end method
