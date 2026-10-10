.class public final Lk7/a$a;
.super Ljava/lang/Object;
.source "ByteQuadsCanonicalizer.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk7/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:[I

.field public final e:[Ljava/lang/String;

.field public final f:I

.field public final g:I


# direct methods
.method public constructor <init>(III[I[Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lk7/a$a;->a:I

    .line 3
    iput p2, p0, Lk7/a$a;->b:I

    .line 4
    iput p3, p0, Lk7/a$a;->c:I

    .line 5
    iput-object p4, p0, Lk7/a$a;->d:[I

    .line 6
    iput-object p5, p0, Lk7/a$a;->e:[Ljava/lang/String;

    .line 7
    iput p6, p0, Lk7/a$a;->f:I

    .line 8
    iput p7, p0, Lk7/a$a;->g:I

    return-void
.end method

.method public constructor <init>(Lk7/a;)V
    .locals 1

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iget v0, p1, Lk7/a;->g:I

    iput v0, p0, Lk7/a$a;->a:I

    .line 11
    iget v0, p1, Lk7/a;->k:I

    iput v0, p0, Lk7/a$a;->b:I

    .line 12
    iget v0, p1, Lk7/a;->j:I

    iput v0, p0, Lk7/a$a;->c:I

    .line 13
    iget-object v0, p1, Lk7/a;->f:[I

    iput-object v0, p0, Lk7/a$a;->d:[I

    .line 14
    iget-object v0, p1, Lk7/a;->l:[Ljava/lang/String;

    iput-object v0, p0, Lk7/a$a;->e:[Ljava/lang/String;

    .line 15
    iget v0, p1, Lk7/a;->m:I

    iput v0, p0, Lk7/a$a;->f:I

    .line 16
    iget p1, p1, Lk7/a;->n:I

    iput p1, p0, Lk7/a$a;->g:I

    return-void
.end method

.method public static a(I)Lk7/a$a;
    .locals 8

    .line 1
    .line 2
    shl-int/lit8 v7, p0, 0x3

    .line 3
    .line 4
    .line 5
    invoke-static {p0}, Lk7/a;->c(I)I

    .line 6
    move-result v3

    .line 7
    .line 8
    new-instance v0, Lk7/a$a;

    .line 9
    .line 10
    new-array v4, v7, [I

    .line 11
    .line 12
    shl-int/lit8 v1, p0, 0x1

    .line 13
    .line 14
    new-array v5, v1, [Ljava/lang/String;

    .line 15
    .line 16
    sub-int v6, v7, p0

    .line 17
    const/4 v2, 0x0

    .line 18
    move v1, p0

    .line 19
    .line 20
    .line 21
    invoke-direct/range {v0 .. v7}, Lk7/a$a;-><init>(III[I[Ljava/lang/String;II)V

    .line 22
    return-object v0
    .line 23
.end method
