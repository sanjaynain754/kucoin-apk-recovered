.class public final Luf0/q$b;
.super Ljava/lang/Object;
.source "TraceOptions.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Luf0/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:B


# direct methods
.method public constructor <init>(B)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-byte p1, p0, Luf0/q$b;->a:B

    return-void
.end method

.method public synthetic constructor <init>(BLuf0/q$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Luf0/q$b;-><init>(B)V

    return-void
.end method


# virtual methods
.method public a()Luf0/q;
    .locals 1

    .line 1
    .line 2
    iget-byte v0, p0, Luf0/q$b;->a:B

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Luf0/q;->b(B)Luf0/q;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
.end method

.method public b(Z)Luf0/q$b;
    .locals 0

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    iget-byte p1, p0, Luf0/q$b;->a:B

    .line 5
    .line 6
    or-int/lit8 p1, p1, 0x1

    .line 7
    int-to-byte p1, p1

    .line 8
    .line 9
    iput-byte p1, p0, Luf0/q$b;->a:B

    .line 10
    return-object p0

    .line 11
    .line 12
    :cond_0
    iget-byte p1, p0, Luf0/q$b;->a:B

    .line 13
    .line 14
    and-int/lit8 p1, p1, -0x2

    .line 15
    int-to-byte p1, p1

    .line 16
    .line 17
    iput-byte p1, p0, Luf0/q$b;->a:B

    .line 18
    return-object p0
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
.end method
