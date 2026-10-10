.class public Lba0/c$b;
.super Ljava/lang/Object;
.source "DefaultVideoStrategy.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lba0/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public a:Ly90/c;

.field public b:I

.field public c:J

.field public d:F

.field public e:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ly90/c;

    invoke-direct {v0}, Ly90/c;-><init>()V

    iput-object v0, p0, Lba0/c$b;->a:Ly90/c;

    const/16 v0, 0x1e

    .line 3
    iput v0, p0, Lba0/c$b;->b:I

    const-wide/high16 v0, -0x8000000000000000L

    .line 4
    iput-wide v0, p0, Lba0/c$b;->c:J

    const/high16 v0, 0x40400000    # 3.0f

    .line 5
    iput v0, p0, Lba0/c$b;->d:F

    .line 6
    const-string/jumbo v0, "video/avc"

    iput-object v0, p0, Lba0/c$b;->e:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ly90/d;)V
    .locals 3
    .param p1    # Ly90/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    new-instance v0, Ly90/c;

    invoke-direct {v0}, Ly90/c;-><init>()V

    iput-object v0, p0, Lba0/c$b;->a:Ly90/c;

    const/16 v1, 0x1e

    .line 9
    iput v1, p0, Lba0/c$b;->b:I

    const-wide/high16 v1, -0x8000000000000000L

    .line 10
    iput-wide v1, p0, Lba0/c$b;->c:J

    const/high16 v1, 0x40400000    # 3.0f

    .line 11
    iput v1, p0, Lba0/c$b;->d:F

    .line 12
    const-string/jumbo v1, "video/avc"

    iput-object v1, p0, Lba0/c$b;->e:Ljava/lang/String;

    .line 13
    invoke-virtual {v0, p1}, Ly90/c;->b(Ly90/d;)V

    return-void
.end method


# virtual methods
.method public a(J)Lba0/c$b;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    iput-wide p1, p0, Lba0/c$b;->c:J

    .line 3
    return-object p0
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
    .line 25
.end method

.method public b()Lba0/c;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lba0/c;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lba0/c$b;->e()Lba0/c$c;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1}, Lba0/c;-><init>(Lba0/c$c;)V

    .line 10
    return-object v0
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public c(I)Lba0/c$b;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    iput p1, p0, Lba0/c$b;->b:I

    .line 3
    return-object p0
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
    .line 25
.end method

.method public d(F)Lba0/c$b;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    iput p1, p0, Lba0/c$b;->d:F

    .line 3
    return-object p0
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
    .line 25
.end method

.method public e()Lba0/c$c;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lba0/c$c;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lba0/c$c;-><init>(Lba0/c$a;)V

    .line 7
    .line 8
    iget-object v1, p0, Lba0/c$b;->a:Ly90/c;

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Lba0/c$c;->b(Lba0/c$c;Ly90/d;)Ly90/d;

    .line 12
    .line 13
    iget v1, p0, Lba0/c$b;->b:I

    .line 14
    .line 15
    .line 16
    invoke-static {v0, v1}, Lba0/c$c;->d(Lba0/c$c;I)I

    .line 17
    .line 18
    iget-wide v1, p0, Lba0/c$b;->c:J

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v1, v2}, Lba0/c$c;->f(Lba0/c$c;J)J

    .line 22
    .line 23
    iget v1, p0, Lba0/c$b;->d:F

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v1}, Lba0/c$c;->h(Lba0/c$c;F)F

    .line 27
    .line 28
    iget-object v1, p0, Lba0/c$b;->e:Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    invoke-static {v0, v1}, Lba0/c$c;->j(Lba0/c$c;Ljava/lang/String;)Ljava/lang/String;

    .line 32
    return-object v0
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
.end method
