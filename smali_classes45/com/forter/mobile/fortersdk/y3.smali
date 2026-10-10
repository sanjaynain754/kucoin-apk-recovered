.class public final Lcom/forter/mobile/fortersdk/y3;
.super Ljava/lang/Object;


# instance fields
.field public a:I

.field public b:I


# direct methods
.method public constructor <init>(Z)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput v0, p0, Lcom/forter/mobile/fortersdk/y3;->a:I

    .line 7
    .line 8
    iput v0, p0, Lcom/forter/mobile/fortersdk/y3;->b:I

    .line 9
    const/4 v0, 0x1

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iput v0, p0, Lcom/forter/mobile/fortersdk/y3;->b:I

    .line 14
    return-void

    .line 15
    .line 16
    :cond_0
    iput v0, p0, Lcom/forter/mobile/fortersdk/y3;->a:I

    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method
