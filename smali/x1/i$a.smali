.class public final Lx1/i$a;
.super Ljava/lang/Object;
.source "MemorySizeCalculator.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx1/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final i:I


# instance fields
.field public final a:Landroid/content/Context;

.field public b:Landroid/app/ActivityManager;

.field public c:Lx1/i$c;

.field public d:F

.field public e:F

.field public f:F

.field public g:F

.field public h:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 3
    .line 4
    const/16 v1, 0x1a

    .line 5
    .line 6
    if-ge v0, v1, :cond_0

    .line 7
    const/4 v0, 0x4

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x1

    .line 10
    .line 11
    :goto_0
    sput v0, Lx1/i$a;->i:I

    .line 12
    return-void
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
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    const/high16 v0, 0x40000000    # 2.0f

    .line 6
    .line 7
    iput v0, p0, Lx1/i$a;->d:F

    .line 8
    .line 9
    sget v0, Lx1/i$a;->i:I

    .line 10
    int-to-float v0, v0

    .line 11
    .line 12
    iput v0, p0, Lx1/i$a;->e:F

    .line 13
    .line 14
    .line 15
    const v0, 0x3ecccccd    # 0.4f

    .line 16
    .line 17
    iput v0, p0, Lx1/i$a;->f:F

    .line 18
    .line 19
    .line 20
    const v0, 0x3ea8f5c3    # 0.33f

    .line 21
    .line 22
    iput v0, p0, Lx1/i$a;->g:F

    .line 23
    .line 24
    const/high16 v0, 0x400000

    .line 25
    .line 26
    iput v0, p0, Lx1/i$a;->h:I

    .line 27
    .line 28
    iput-object p1, p0, Lx1/i$a;->a:Landroid/content/Context;

    .line 29
    .line 30
    const-string v0, "activity"

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    check-cast v0, Landroid/app/ActivityManager;

    .line 37
    .line 38
    iput-object v0, p0, Lx1/i$a;->b:Landroid/app/ActivityManager;

    .line 39
    .line 40
    new-instance v0, Lx1/i$b;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 44
    move-result-object p1

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 48
    move-result-object p1

    .line 49
    .line 50
    .line 51
    invoke-direct {v0, p1}, Lx1/i$b;-><init>(Landroid/util/DisplayMetrics;)V

    .line 52
    .line 53
    iput-object v0, p0, Lx1/i$a;->c:Lx1/i$c;

    .line 54
    .line 55
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 56
    .line 57
    const/16 v0, 0x1a

    .line 58
    .line 59
    if-lt p1, v0, :cond_0

    .line 60
    .line 61
    iget-object p1, p0, Lx1/i$a;->b:Landroid/app/ActivityManager;

    .line 62
    .line 63
    .line 64
    invoke-static {p1}, Lx1/i;->e(Landroid/app/ActivityManager;)Z

    .line 65
    move-result p1

    .line 66
    .line 67
    if-eqz p1, :cond_0

    .line 68
    const/4 p1, 0x0

    .line 69
    .line 70
    iput p1, p0, Lx1/i$a;->e:F

    .line 71
    :cond_0
    return-void
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
.end method


# virtual methods
.method public a()Lx1/i;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lx1/i;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lx1/i;-><init>(Lx1/i$a;)V

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
.end method
