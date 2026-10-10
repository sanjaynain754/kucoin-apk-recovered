.class public final Lcom/forter/mobile/fortersdk/b$h;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/forter/mobile/fortersdk/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Landroid/location/Location;

.field public final synthetic c:Lcom/forter/mobile/fortersdk/b;


# direct methods
.method public constructor <init>(Lcom/forter/mobile/fortersdk/b;Landroid/location/Location;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/forter/mobile/fortersdk/b$h;->c:Lcom/forter/mobile/fortersdk/b;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/forter/mobile/fortersdk/b$h;->b:Landroid/location/Location;

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
.method public final run()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/forter/mobile/fortersdk/b$h;->c:Lcom/forter/mobile/fortersdk/b;

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
    iget-object v1, p0, Lcom/forter/mobile/fortersdk/b$h;->b:Landroid/location/Location;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lcom/forter/mobile/fortersdk/c;->g(Landroid/location/Location;)Z

    .line 18
    :cond_0
    return-void
.end method
