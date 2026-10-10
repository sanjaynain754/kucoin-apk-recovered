.class public final Lcom/forter/mobile/fortersdk/am$b;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/forter/mobile/fortersdk/w3;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/forter/mobile/fortersdk/am;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/forter/mobile/fortersdk/am;


# direct methods
.method public constructor <init>(Lcom/forter/mobile/fortersdk/am;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/forter/mobile/fortersdk/am$b;->a:Lcom/forter/mobile/fortersdk/am;

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
.end method


# virtual methods
.method public final a(Lcom/forter/mobile/fortersdk/as;Lcom/forter/mobile/fortersdk/r;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/forter/mobile/fortersdk/am$b;->a:Lcom/forter/mobile/fortersdk/am;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/forter/mobile/fortersdk/am;->c(Lcom/forter/mobile/fortersdk/am;)Ljava/util/List;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    move-result v1

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    check-cast v1, Lcom/forter/mobile/fortersdk/w3;

    .line 23
    .line 24
    .line 25
    invoke-interface {v1, p1, p2}, Lcom/forter/mobile/fortersdk/w3;->a(Lcom/forter/mobile/fortersdk/as;Lcom/forter/mobile/fortersdk/r;)V

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-void
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
