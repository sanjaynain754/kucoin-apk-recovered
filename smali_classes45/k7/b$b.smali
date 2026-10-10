.class public final Lk7/b$b;
.super Ljava/lang/Object;
.source "CharsToNameCanonicalizer.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk7/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:I

.field public final b:I

.field public final c:[Ljava/lang/String;

.field public final d:[Lk7/b$a;


# direct methods
.method public constructor <init>(II[Ljava/lang/String;[Lk7/b$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lk7/b$b;->a:I

    .line 3
    iput p2, p0, Lk7/b$b;->b:I

    .line 4
    iput-object p3, p0, Lk7/b$b;->c:[Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lk7/b$b;->d:[Lk7/b$a;

    return-void
.end method

.method public constructor <init>(Lk7/b;)V
    .locals 1

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iget v0, p1, Lk7/b;->h:I

    iput v0, p0, Lk7/b$b;->a:I

    .line 8
    iget v0, p1, Lk7/b;->k:I

    iput v0, p0, Lk7/b$b;->b:I

    .line 9
    iget-object v0, p1, Lk7/b;->f:[Ljava/lang/String;

    iput-object v0, p0, Lk7/b$b;->c:[Ljava/lang/String;

    .line 10
    iget-object p1, p1, Lk7/b;->g:[Lk7/b$a;

    iput-object p1, p0, Lk7/b$b;->d:[Lk7/b$a;

    return-void
.end method

.method public static a(I)Lk7/b$b;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lk7/b$b;

    .line 3
    .line 4
    new-array v1, p0, [Ljava/lang/String;

    .line 5
    .line 6
    shr-int/lit8 p0, p0, 0x1

    .line 7
    .line 8
    new-array p0, p0, [Lk7/b$a;

    .line 9
    const/4 v2, 0x0

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v2, v2, v1, p0}, Lk7/b$b;-><init>(II[Ljava/lang/String;[Lk7/b$a;)V

    .line 13
    return-object v0
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
.end method
