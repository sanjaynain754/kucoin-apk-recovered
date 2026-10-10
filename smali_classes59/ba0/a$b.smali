.class public Lba0/a$b;
.super Ljava/lang/Object;
.source "DefaultAudioStrategy.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lba0/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public a:I

.field public b:I

.field public c:J

.field public d:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, -0x1

    .line 5
    .line 6
    iput v0, p0, Lba0/a$b;->a:I

    .line 7
    .line 8
    iput v0, p0, Lba0/a$b;->b:I

    .line 9
    .line 10
    const-wide/high16 v0, -0x8000000000000000L

    .line 11
    .line 12
    iput-wide v0, p0, Lba0/a$b;->c:J

    .line 13
    .line 14
    const-string v0, "audio/mp4a-latm"

    .line 15
    .line 16
    iput-object v0, p0, Lba0/a$b;->d:Ljava/lang/String;

    .line 17
    return-void
.end method


# virtual methods
.method public a()Lba0/a;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lba0/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lba0/a$b;->c()Lba0/a$c;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1}, Lba0/a;-><init>(Lba0/a$c;)V

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

.method public b(I)Lba0/a$b;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    iput p1, p0, Lba0/a$b;->a:I

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

.method public c()Lba0/a$c;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lba0/a$c;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lba0/a$c;-><init>(Lba0/a$a;)V

    .line 7
    .line 8
    iget v1, p0, Lba0/a$b;->a:I

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Lba0/a$c;->b(Lba0/a$c;I)I

    .line 12
    .line 13
    iget v1, p0, Lba0/a$b;->b:I

    .line 14
    .line 15
    .line 16
    invoke-static {v0, v1}, Lba0/a$c;->d(Lba0/a$c;I)I

    .line 17
    .line 18
    iget-object v1, p0, Lba0/a$b;->d:Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v1}, Lba0/a$c;->f(Lba0/a$c;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    iget-wide v1, p0, Lba0/a$b;->c:J

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v1, v2}, Lba0/a$c;->h(Lba0/a$c;J)J

    .line 27
    return-object v0
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
.end method

.method public d(I)Lba0/a$b;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    iput p1, p0, Lba0/a$b;->b:I

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
