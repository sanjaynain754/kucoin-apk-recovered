.class public interface abstract Lx90/a;
.super Ljava/lang/Object;
.source "AudioResampler.java"


# static fields
.field public static final a:Lx90/a;

.field public static final b:Lx90/a;

.field public static final c:Lx90/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lx90/c;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lx90/c;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lx90/a;->a:Lx90/a;

    .line 8
    .line 9
    new-instance v0, Lx90/e;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Lx90/e;-><init>()V

    .line 13
    .line 14
    sput-object v0, Lx90/a;->b:Lx90/a;

    .line 15
    .line 16
    new-instance v0, Lx90/d;

    .line 17
    .line 18
    .line 19
    invoke-direct {v0}, Lx90/d;-><init>()V

    .line 20
    .line 21
    sput-object v0, Lx90/a;->c:Lx90/a;

    .line 22
    return-void
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
.end method


# virtual methods
.method public abstract a(Ljava/nio/ShortBuffer;ILjava/nio/ShortBuffer;II)V
    .param p1    # Ljava/nio/ShortBuffer;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/nio/ShortBuffer;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
.end method
