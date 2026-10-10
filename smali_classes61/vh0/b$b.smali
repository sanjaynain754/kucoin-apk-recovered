.class public Lvh0/b$b;
.super Ljava/lang/Object;
.source "PathContainer.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvh0/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# static fields
.field public static final c:Lvh0/b$b;

.field public static final d:Lvh0/b$b;


# instance fields
.field public final a:C

.field public final b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    const/16 v0, 0x2f

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lvh0/b$b;->a(CZ)Lvh0/b$b;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    sput-object v0, Lvh0/b$b;->c:Lvh0/b$b;

    .line 10
    .line 11
    const/16 v0, 0x2e

    .line 12
    const/4 v1, 0x0

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1}, Lvh0/b$b;->a(CZ)Lvh0/b$b;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    sput-object v0, Lvh0/b$b;->d:Lvh0/b$b;

    .line 19
    return-void
    .line 20
    .line 21
.end method

.method public constructor <init>(CZ)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-char p1, p0, Lvh0/b$b;->a:C

    .line 6
    .line 7
    iput-boolean p2, p0, Lvh0/b$b;->b:Z

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
.end method

.method public static a(CZ)Lvh0/b$b;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lvh0/b$b;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, Lvh0/b$b;-><init>(CZ)V

    .line 6
    return-object v0
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
.end method


# virtual methods
.method public b()C
    .locals 1

    .line 1
    .line 2
    iget-char v0, p0, Lvh0/b$b;->a:C

    .line 3
    return v0
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
.end method

.method public c()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lvh0/b$b;->b:Z

    .line 3
    return v0
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
.end method
