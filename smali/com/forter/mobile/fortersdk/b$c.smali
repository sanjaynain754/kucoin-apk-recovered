.class public final Lcom/forter/mobile/fortersdk/b$c;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/forter/mobile/fortersdk/b;->i(Lcom/forter/mobile/fortersdk/v3;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/forter/mobile/fortersdk/v3;

.field public final synthetic c:Lcom/forter/mobile/fortersdk/b;


# direct methods
.method public constructor <init>(Lcom/forter/mobile/fortersdk/b;Lcom/forter/mobile/fortersdk/v3;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/forter/mobile/fortersdk/b$c;->c:Lcom/forter/mobile/fortersdk/b;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/forter/mobile/fortersdk/b$c;->b:Lcom/forter/mobile/fortersdk/v3;

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
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/forter/mobile/fortersdk/b$c;->c:Lcom/forter/mobile/fortersdk/b;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/forter/mobile/fortersdk/b;->h(Lcom/forter/mobile/fortersdk/b;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lcom/forter/mobile/fortersdk/b;->m()Lcom/forter/mobile/fortersdk/c;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    iget-object v1, p0, Lcom/forter/mobile/fortersdk/b$c;->b:Lcom/forter/mobile/fortersdk/v3;

    .line 15
    const/4 v2, 0x1

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1, v2}, Lcom/forter/mobile/fortersdk/c;->j(Lcom/forter/mobile/fortersdk/v3;Z)Z

    .line 19
    :cond_0
    return-void
    .line 20
    .line 21
    .line 22
.end method
