.class public final Lshark/internal/HprofInMemoryIndex;
.super Ljava/lang/Object;
.source "HprofInMemoryIndex.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lshark/internal/HprofInMemoryIndex$a;,
        Lshark/internal/HprofInMemoryIndex$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0019\u0008\u0000\u0018\u0000 92\u00020\u0001:\u0002AUB\u0097\u0001\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\u000c\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u001d\u0010!\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e\u00a2\u0006\u0004\u0008!\u0010\"J\u0015\u0010#\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001e\u00a2\u0006\u0004\u0008#\u0010$J\u0017\u0010&\u001a\u0004\u0018\u00010\u001e2\u0006\u0010%\u001a\u00020\u0005\u00a2\u0006\u0004\u0008&\u0010\'J\u0019\u0010+\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020*0)0(\u00a2\u0006\u0004\u0008+\u0010,J\u0019\u0010.\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020-0)0(\u00a2\u0006\u0004\u0008.\u0010,J\u0019\u00100\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020/0)0(\u00a2\u0006\u0004\u00080\u0010,J\u0019\u00102\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002010)0(\u00a2\u0006\u0004\u00082\u0010,J\u0019\u00104\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002030)0(\u00a2\u0006\u0004\u00084\u0010,J\u0013\u00105\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\u0004\u00085\u00106J\u001d\u00109\u001a\n\u0012\u0004\u0012\u000203\u0018\u0001082\u0006\u00107\u001a\u00020\u001e\u00a2\u0006\u0004\u00089\u0010:J\u0015\u0010;\u001a\u00020\u00172\u0006\u00107\u001a\u00020\u001e\u00a2\u0006\u0004\u0008;\u0010<J\u0013\u0010>\u001a\u00020**\u00020=H\u0002\u00a2\u0006\u0004\u0008>\u0010?J\u0017\u0010@\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u001eH\u0002\u00a2\u0006\u0004\u0008@\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008A\u0010BR\u001a\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008C\u0010DR\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008E\u0010FR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008G\u0010HR\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008I\u0010HR\u0014\u0010\u000c\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008&\u0010HR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010HR\u001a\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010JR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00085\u0010KR\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008L\u0010BR\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008M\u0010BR\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008N\u0010BR\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008@\u0010BR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008+\u0010OR\u0017\u0010\u001a\u001a\u00020\u00198\u0006\u00a2\u0006\u000c\n\u0004\u0008.\u0010P\u001a\u0004\u0008M\u0010QR\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00080\u0010BR\u0011\u0010S\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\u0008L\u0010RR\u0011\u0010T\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\u0008N\u0010R\u00a8\u0006V"
    }
    d2 = {
        "Lshark/internal/HprofInMemoryIndex;",
        "",
        "",
        "positionSize",
        "Lshark/internal/hppc/LongObjectScatterMap;",
        "",
        "hprofStringCache",
        "Lshark/internal/hppc/LongLongScatterMap;",
        "classNames",
        "Lshark/internal/SortedBytesMap;",
        "classIndex",
        "instanceIndex",
        "objectArrayIndex",
        "primitiveArrayIndex",
        "",
        "Lshark/d;",
        "gcRoots",
        "Lshark/r;",
        "proguardMapping",
        "bytesForClassSize",
        "bytesForInstanceSize",
        "bytesForObjectArraySize",
        "bytesForPrimitiveArraySize",
        "",
        "useForwardSlashClassPackageSeparator",
        "Lshark/internal/ClassFieldsReader;",
        "classFieldsReader",
        "classFieldsIndexSize",
        "<init>",
        "(ILshark/internal/hppc/LongObjectScatterMap;Lshark/internal/hppc/LongLongScatterMap;Lshark/internal/SortedBytesMap;Lshark/internal/SortedBytesMap;Lshark/internal/SortedBytesMap;Lshark/internal/SortedBytesMap;Ljava/util/List;Lshark/r;IIIIZLshark/internal/ClassFieldsReader;I)V",
        "",
        "classId",
        "id",
        "h",
        "(JJ)Ljava/lang/String;",
        "g",
        "(J)Ljava/lang/String;",
        "className",
        "f",
        "(Ljava/lang/String;)Ljava/lang/Long;",
        "Lkotlin/sequences/Sequence;",
        "Lshark/internal/hppc/d;",
        "Lshark/internal/h$a;",
        "n",
        "()Lkotlin/sequences/Sequence;",
        "Lshark/internal/h$b;",
        "o",
        "Lshark/internal/h$c;",
        "p",
        "Lshark/internal/h$d;",
        "s",
        "Lshark/internal/h;",
        "r",
        "i",
        "()Ljava/util/List;",
        "objectId",
        "Lshark/internal/hppc/b;",
        "q",
        "(J)Lshark/internal/hppc/b;",
        "t",
        "(J)Z",
        "Lshark/internal/b;",
        "u",
        "(Lshark/internal/b;)Lshark/internal/h$a;",
        "m",
        "a",
        "I",
        "b",
        "Lshark/internal/hppc/LongObjectScatterMap;",
        "c",
        "Lshark/internal/hppc/LongLongScatterMap;",
        "d",
        "Lshark/internal/SortedBytesMap;",
        "e",
        "Ljava/util/List;",
        "Lshark/r;",
        "j",
        "k",
        "l",
        "Z",
        "Lshark/internal/ClassFieldsReader;",
        "()Lshark/internal/ClassFieldsReader;",
        "()I",
        "classCount",
        "instanceCount",
        "Companion",
        "shark-graph"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x1
    }
.end annotation


# static fields
.field public static final q:Lshark/internal/HprofInMemoryIndex$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:I

.field public final b:Lshark/internal/hppc/LongObjectScatterMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lshark/internal/hppc/LongObjectScatterMap<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lshark/internal/hppc/LongLongScatterMap;

.field public final d:Lshark/internal/SortedBytesMap;

.field public final e:Lshark/internal/SortedBytesMap;

.field public final f:Lshark/internal/SortedBytesMap;

.field public final g:Lshark/internal/SortedBytesMap;

.field public final h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lshark/d;",
            ">;"
        }
    .end annotation
.end field

.field public final i:Lshark/r;

.field public final j:I

.field public final k:I

.field public final l:I

.field public final m:I

.field public final n:Z

.field public final o:Lshark/internal/ClassFieldsReader;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final p:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lshark/internal/HprofInMemoryIndex$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lshark/internal/HprofInMemoryIndex$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lshark/internal/HprofInMemoryIndex;->q:Lshark/internal/HprofInMemoryIndex$Companion;

    .line 9
    return-void
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

.method public constructor <init>(ILshark/internal/hppc/LongObjectScatterMap;Lshark/internal/hppc/LongLongScatterMap;Lshark/internal/SortedBytesMap;Lshark/internal/SortedBytesMap;Lshark/internal/SortedBytesMap;Lshark/internal/SortedBytesMap;Ljava/util/List;Lshark/r;IIIIZLshark/internal/ClassFieldsReader;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lshark/internal/hppc/LongObjectScatterMap<",
            "Ljava/lang/String;",
            ">;",
            "Lshark/internal/hppc/LongLongScatterMap;",
            "Lshark/internal/SortedBytesMap;",
            "Lshark/internal/SortedBytesMap;",
            "Lshark/internal/SortedBytesMap;",
            "Lshark/internal/SortedBytesMap;",
            "Ljava/util/List<",
            "+",
            "Lshark/d;",
            ">;",
            "Lshark/r;",
            "IIIIZ",
            "Lshark/internal/ClassFieldsReader;",
            "I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lshark/internal/HprofInMemoryIndex;->a:I

    iput-object p2, p0, Lshark/internal/HprofInMemoryIndex;->b:Lshark/internal/hppc/LongObjectScatterMap;

    iput-object p3, p0, Lshark/internal/HprofInMemoryIndex;->c:Lshark/internal/hppc/LongLongScatterMap;

    iput-object p4, p0, Lshark/internal/HprofInMemoryIndex;->d:Lshark/internal/SortedBytesMap;

    iput-object p5, p0, Lshark/internal/HprofInMemoryIndex;->e:Lshark/internal/SortedBytesMap;

    iput-object p6, p0, Lshark/internal/HprofInMemoryIndex;->f:Lshark/internal/SortedBytesMap;

    iput-object p7, p0, Lshark/internal/HprofInMemoryIndex;->g:Lshark/internal/SortedBytesMap;

    iput-object p8, p0, Lshark/internal/HprofInMemoryIndex;->h:Ljava/util/List;

    iput-object p9, p0, Lshark/internal/HprofInMemoryIndex;->i:Lshark/r;

    iput p10, p0, Lshark/internal/HprofInMemoryIndex;->j:I

    iput p11, p0, Lshark/internal/HprofInMemoryIndex;->k:I

    iput p12, p0, Lshark/internal/HprofInMemoryIndex;->l:I

    iput p13, p0, Lshark/internal/HprofInMemoryIndex;->m:I

    iput-boolean p14, p0, Lshark/internal/HprofInMemoryIndex;->n:Z

    iput-object p15, p0, Lshark/internal/HprofInMemoryIndex;->o:Lshark/internal/ClassFieldsReader;

    move/from16 p1, p16

    iput p1, p0, Lshark/internal/HprofInMemoryIndex;->p:I

    return-void
.end method

.method public synthetic constructor <init>(ILshark/internal/hppc/LongObjectScatterMap;Lshark/internal/hppc/LongLongScatterMap;Lshark/internal/SortedBytesMap;Lshark/internal/SortedBytesMap;Lshark/internal/SortedBytesMap;Lshark/internal/SortedBytesMap;Ljava/util/List;Lshark/r;IIIIZLshark/internal/ClassFieldsReader;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct/range {p0 .. p16}, Lshark/internal/HprofInMemoryIndex;-><init>(ILshark/internal/hppc/LongObjectScatterMap;Lshark/internal/hppc/LongLongScatterMap;Lshark/internal/SortedBytesMap;Lshark/internal/SortedBytesMap;Lshark/internal/SortedBytesMap;Lshark/internal/SortedBytesMap;Ljava/util/List;Lshark/r;IIIIZLshark/internal/ClassFieldsReader;I)V

    return-void
.end method

.method public static final synthetic a(Lshark/internal/HprofInMemoryIndex;)I
    .locals 0

    .line 1
    .line 2
    iget p0, p0, Lshark/internal/HprofInMemoryIndex;->k:I

    .line 3
    return p0
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
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public static final synthetic b(Lshark/internal/HprofInMemoryIndex;)I
    .locals 0

    .line 1
    .line 2
    iget p0, p0, Lshark/internal/HprofInMemoryIndex;->l:I

    .line 3
    return p0
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
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public static final synthetic c(Lshark/internal/HprofInMemoryIndex;)I
    .locals 0

    .line 1
    .line 2
    iget p0, p0, Lshark/internal/HprofInMemoryIndex;->m:I

    .line 3
    return p0
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
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public static final synthetic d(Lshark/internal/HprofInMemoryIndex;)I
    .locals 0

    .line 1
    .line 2
    iget p0, p0, Lshark/internal/HprofInMemoryIndex;->a:I

    .line 3
    return p0
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
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public static final synthetic e(Lshark/internal/HprofInMemoryIndex;Lshark/internal/b;)Lshark/internal/h$a;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lshark/internal/HprofInMemoryIndex;->u(Lshark/internal/b;)Lshark/internal/h$a;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.method public final f(Ljava/lang/String;)Ljava/lang/Long;
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-boolean v0, p0, Lshark/internal/HprofInMemoryIndex;->n:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    const/4 v5, 0x4

    .line 6
    const/4 v6, 0x0

    .line 7
    .line 8
    const/16 v2, 0x2e

    .line 9
    .line 10
    const/16 v3, 0x2f

    .line 11
    const/4 v4, 0x0

    .line 12
    move-object v1, p1

    .line 13
    .line 14
    .line 15
    invoke-static/range {v1 .. v6}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;CCZILjava/lang/Object;)Ljava/lang/String;

    .line 16
    move-result-object p1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-object v1, p1

    .line 19
    .line 20
    :goto_0
    iget-object v0, p0, Lshark/internal/HprofInMemoryIndex;->b:Lshark/internal/hppc/LongObjectScatterMap;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Lshark/internal/hppc/LongObjectScatterMap;->g()Lkotlin/sequences/Sequence;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    .line 27
    invoke-interface {v0}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    .line 31
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    move-result v1

    .line 33
    const/4 v2, 0x0

    .line 34
    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    .line 38
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    move-result-object v1

    .line 40
    move-object v3, v1

    .line 41
    .line 42
    check-cast v3, Lshark/internal/hppc/d;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3}, Lshark/internal/hppc/d;->b()Ljava/lang/Object;

    .line 46
    move-result-object v3

    .line 47
    .line 48
    check-cast v3, Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    invoke-static {v3, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    move-result v3

    .line 53
    .line 54
    if-eqz v3, :cond_1

    .line 55
    goto :goto_1

    .line 56
    :cond_2
    move-object v1, v2

    .line 57
    .line 58
    :goto_1
    check-cast v1, Lshark/internal/hppc/d;

    .line 59
    .line 60
    if-eqz v1, :cond_3

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1}, Lshark/internal/hppc/d;->a()J

    .line 64
    move-result-wide v0

    .line 65
    .line 66
    .line 67
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 68
    move-result-object p1

    .line 69
    goto :goto_2

    .line 70
    :cond_3
    move-object p1, v2

    .line 71
    .line 72
    :goto_2
    if-eqz p1, :cond_6

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 76
    move-result-wide v0

    .line 77
    .line 78
    iget-object p1, p0, Lshark/internal/HprofInMemoryIndex;->c:Lshark/internal/hppc/LongLongScatterMap;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1}, Lshark/internal/hppc/LongLongScatterMap;->g()Lkotlin/sequences/Sequence;

    .line 82
    move-result-object p1

    .line 83
    .line 84
    .line 85
    invoke-interface {p1}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    .line 86
    move-result-object p1

    .line 87
    .line 88
    .line 89
    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 90
    move-result v3

    .line 91
    .line 92
    if-eqz v3, :cond_5

    .line 93
    .line 94
    .line 95
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 96
    move-result-object v3

    .line 97
    move-object v4, v3

    .line 98
    .line 99
    check-cast v4, Lshark/internal/hppc/c;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v4}, Lshark/internal/hppc/c;->b()J

    .line 103
    move-result-wide v4

    .line 104
    .line 105
    cmp-long v4, v4, v0

    .line 106
    .line 107
    if-nez v4, :cond_4

    .line 108
    goto :goto_3

    .line 109
    :cond_5
    move-object v3, v2

    .line 110
    .line 111
    :goto_3
    check-cast v3, Lshark/internal/hppc/c;

    .line 112
    .line 113
    if-eqz v3, :cond_6

    .line 114
    .line 115
    .line 116
    invoke-virtual {v3}, Lshark/internal/hppc/c;->a()J

    .line 117
    move-result-wide v0

    .line 118
    .line 119
    .line 120
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 121
    move-result-object p1

    .line 122
    return-object p1

    .line 123
    :cond_6
    return-object v2
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
.end method

.method public final g(J)Ljava/lang/String;
    .locals 6
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lshark/internal/HprofInMemoryIndex;->c:Lshark/internal/hppc/LongLongScatterMap;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lshark/internal/hppc/LongLongScatterMap;->i(J)J

    .line 6
    move-result-wide p1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1, p2}, Lshark/internal/HprofInMemoryIndex;->m(J)Ljava/lang/String;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    iget-boolean p1, p0, Lshark/internal/HprofInMemoryIndex;->n:Z

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    const/4 v4, 0x4

    .line 16
    const/4 v5, 0x0

    .line 17
    .line 18
    const/16 v1, 0x2f

    .line 19
    .line 20
    const/16 v2, 0x2e

    .line 21
    const/4 v3, 0x0

    .line 22
    .line 23
    .line 24
    invoke-static/range {v0 .. v5}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;CCZILjava/lang/Object;)Ljava/lang/String;

    .line 25
    move-result-object p1

    .line 26
    return-object p1

    .line 27
    :cond_0
    return-object v0
    .line 28
    .line 29
    .line 30
.end method

.method public final h(JJ)Ljava/lang/String;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p3, p4}, Lshark/internal/HprofInMemoryIndex;->m(J)Ljava/lang/String;

    .line 4
    move-result-object p1

    .line 5
    return-object p1
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

.method public final i()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lshark/d;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lshark/internal/HprofInMemoryIndex;->h:Ljava/util/List;

    .line 3
    return-object v0
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

.method public final j()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lshark/internal/HprofInMemoryIndex;->d:Lshark/internal/SortedBytesMap;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lshark/internal/SortedBytesMap;->j()I

    .line 6
    move-result v0

    .line 7
    return v0
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

.method public final k()Lshark/internal/ClassFieldsReader;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lshark/internal/HprofInMemoryIndex;->o:Lshark/internal/ClassFieldsReader;

    .line 3
    return-object v0
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

.method public final l()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lshark/internal/HprofInMemoryIndex;->e:Lshark/internal/SortedBytesMap;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lshark/internal/SortedBytesMap;->j()I

    .line 6
    move-result v0

    .line 7
    return v0
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

.method public final m(J)Ljava/lang/String;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lshark/internal/HprofInMemoryIndex;->b:Lshark/internal/hppc/LongObjectScatterMap;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lshark/internal/hppc/LongObjectScatterMap;->h(J)Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Ljava/lang/String;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    return-object v0

    .line 12
    .line 13
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 14
    .line 15
    new-instance v1, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    const-string v2, "Hprof string "

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    const-string p1, " not in cache"

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    move-result-object p1

    .line 36
    .line 37
    .line 38
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 39
    throw v0
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
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
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
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
.end method

.method public final n()Lkotlin/sequences/Sequence;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/sequences/Sequence<",
            "Lshark/internal/hppc/d<",
            "Lshark/internal/h$a;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lshark/internal/HprofInMemoryIndex;->d:Lshark/internal/SortedBytesMap;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lshark/internal/SortedBytesMap;->g()Lkotlin/sequences/Sequence;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    new-instance v1, Lshark/internal/HprofInMemoryIndex$indexedClassSequence$1;

    .line 9
    .line 10
    .line 11
    invoke-direct {v1, p0}, Lshark/internal/HprofInMemoryIndex$indexedClassSequence$1;-><init>(Lshark/internal/HprofInMemoryIndex;)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lkotlin/sequences/SequencesKt;->map(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;

    .line 15
    move-result-object v0

    .line 16
    return-object v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final o()Lkotlin/sequences/Sequence;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/sequences/Sequence<",
            "Lshark/internal/hppc/d<",
            "Lshark/internal/h$b;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lshark/internal/HprofInMemoryIndex;->e:Lshark/internal/SortedBytesMap;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lshark/internal/SortedBytesMap;->g()Lkotlin/sequences/Sequence;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    new-instance v1, Lshark/internal/HprofInMemoryIndex$indexedInstanceSequence$1;

    .line 9
    .line 10
    .line 11
    invoke-direct {v1, p0}, Lshark/internal/HprofInMemoryIndex$indexedInstanceSequence$1;-><init>(Lshark/internal/HprofInMemoryIndex;)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lkotlin/sequences/SequencesKt;->map(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;

    .line 15
    move-result-object v0

    .line 16
    return-object v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final p()Lkotlin/sequences/Sequence;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/sequences/Sequence<",
            "Lshark/internal/hppc/d<",
            "Lshark/internal/h$c;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lshark/internal/HprofInMemoryIndex;->f:Lshark/internal/SortedBytesMap;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lshark/internal/SortedBytesMap;->g()Lkotlin/sequences/Sequence;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    new-instance v1, Lshark/internal/HprofInMemoryIndex$indexedObjectArraySequence$1;

    .line 9
    .line 10
    .line 11
    invoke-direct {v1, p0}, Lshark/internal/HprofInMemoryIndex$indexedObjectArraySequence$1;-><init>(Lshark/internal/HprofInMemoryIndex;)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lkotlin/sequences/SequencesKt;->map(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;

    .line 15
    move-result-object v0

    .line 16
    return-object v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final q(J)Lshark/internal/hppc/b;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Lshark/internal/hppc/b<",
            "Lshark/internal/h;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lshark/internal/HprofInMemoryIndex;->d:Lshark/internal/SortedBytesMap;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lshark/internal/SortedBytesMap;->k(J)I

    .line 6
    move-result v0

    .line 7
    .line 8
    if-ltz v0, :cond_0

    .line 9
    .line 10
    iget-object p1, p0, Lshark/internal/HprofInMemoryIndex;->d:Lshark/internal/SortedBytesMap;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, v0}, Lshark/internal/SortedBytesMap;->i(I)Lshark/internal/b;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lshark/internal/HprofInMemoryIndex;->u(Lshark/internal/b;)Lshark/internal/h$a;

    .line 18
    move-result-object p1

    .line 19
    .line 20
    .line 21
    invoke-static {v0, p1}, Lshark/internal/hppc/f;->a(ILjava/lang/Object;)Lshark/internal/hppc/b;

    .line 22
    move-result-object p1

    .line 23
    return-object p1

    .line 24
    .line 25
    :cond_0
    iget-object v0, p0, Lshark/internal/HprofInMemoryIndex;->e:Lshark/internal/SortedBytesMap;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p1, p2}, Lshark/internal/SortedBytesMap;->k(J)I

    .line 29
    move-result v0

    .line 30
    .line 31
    if-ltz v0, :cond_1

    .line 32
    .line 33
    iget-object p1, p0, Lshark/internal/HprofInMemoryIndex;->e:Lshark/internal/SortedBytesMap;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, v0}, Lshark/internal/SortedBytesMap;->i(I)Lshark/internal/b;

    .line 37
    move-result-object p1

    .line 38
    .line 39
    iget-object p2, p0, Lshark/internal/HprofInMemoryIndex;->d:Lshark/internal/SortedBytesMap;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p2}, Lshark/internal/SortedBytesMap;->j()I

    .line 43
    move-result p2

    .line 44
    add-int/2addr p2, v0

    .line 45
    .line 46
    new-instance v0, Lshark/internal/h$b;

    .line 47
    .line 48
    iget v1, p0, Lshark/internal/HprofInMemoryIndex;->a:I

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, v1}, Lshark/internal/b;->e(I)J

    .line 52
    move-result-wide v1

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1}, Lshark/internal/b;->b()J

    .line 56
    move-result-wide v3

    .line 57
    .line 58
    iget v5, p0, Lshark/internal/HprofInMemoryIndex;->k:I

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, v5}, Lshark/internal/b;->e(I)J

    .line 62
    move-result-wide v5

    .line 63
    .line 64
    .line 65
    invoke-direct/range {v0 .. v6}, Lshark/internal/h$b;-><init>(JJJ)V

    .line 66
    .line 67
    .line 68
    invoke-static {p2, v0}, Lshark/internal/hppc/f;->a(ILjava/lang/Object;)Lshark/internal/hppc/b;

    .line 69
    move-result-object p1

    .line 70
    return-object p1

    .line 71
    .line 72
    :cond_1
    iget-object v0, p0, Lshark/internal/HprofInMemoryIndex;->f:Lshark/internal/SortedBytesMap;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, p1, p2}, Lshark/internal/SortedBytesMap;->k(J)I

    .line 76
    move-result v0

    .line 77
    .line 78
    if-ltz v0, :cond_2

    .line 79
    .line 80
    iget-object p1, p0, Lshark/internal/HprofInMemoryIndex;->f:Lshark/internal/SortedBytesMap;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1, v0}, Lshark/internal/SortedBytesMap;->i(I)Lshark/internal/b;

    .line 84
    move-result-object p1

    .line 85
    .line 86
    iget-object p2, p0, Lshark/internal/HprofInMemoryIndex;->d:Lshark/internal/SortedBytesMap;

    .line 87
    .line 88
    .line 89
    invoke-virtual {p2}, Lshark/internal/SortedBytesMap;->j()I

    .line 90
    move-result p2

    .line 91
    .line 92
    iget-object v1, p0, Lshark/internal/HprofInMemoryIndex;->e:Lshark/internal/SortedBytesMap;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1}, Lshark/internal/SortedBytesMap;->j()I

    .line 96
    move-result v1

    .line 97
    add-int/2addr p2, v1

    .line 98
    add-int/2addr p2, v0

    .line 99
    .line 100
    new-instance v0, Lshark/internal/h$c;

    .line 101
    .line 102
    iget v1, p0, Lshark/internal/HprofInMemoryIndex;->a:I

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1, v1}, Lshark/internal/b;->e(I)J

    .line 106
    move-result-wide v1

    .line 107
    .line 108
    .line 109
    invoke-virtual {p1}, Lshark/internal/b;->b()J

    .line 110
    move-result-wide v3

    .line 111
    .line 112
    iget v5, p0, Lshark/internal/HprofInMemoryIndex;->l:I

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1, v5}, Lshark/internal/b;->e(I)J

    .line 116
    move-result-wide v5

    .line 117
    .line 118
    .line 119
    invoke-direct/range {v0 .. v6}, Lshark/internal/h$c;-><init>(JJJ)V

    .line 120
    .line 121
    .line 122
    invoke-static {p2, v0}, Lshark/internal/hppc/f;->a(ILjava/lang/Object;)Lshark/internal/hppc/b;

    .line 123
    move-result-object p1

    .line 124
    return-object p1

    .line 125
    .line 126
    :cond_2
    iget-object v0, p0, Lshark/internal/HprofInMemoryIndex;->g:Lshark/internal/SortedBytesMap;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0, p1, p2}, Lshark/internal/SortedBytesMap;->k(J)I

    .line 130
    move-result p1

    .line 131
    .line 132
    if-ltz p1, :cond_3

    .line 133
    .line 134
    iget-object p2, p0, Lshark/internal/HprofInMemoryIndex;->g:Lshark/internal/SortedBytesMap;

    .line 135
    .line 136
    .line 137
    invoke-virtual {p2, p1}, Lshark/internal/SortedBytesMap;->i(I)Lshark/internal/b;

    .line 138
    move-result-object p2

    .line 139
    .line 140
    iget-object v0, p0, Lshark/internal/HprofInMemoryIndex;->d:Lshark/internal/SortedBytesMap;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0}, Lshark/internal/SortedBytesMap;->j()I

    .line 144
    move-result v0

    .line 145
    .line 146
    iget-object v1, p0, Lshark/internal/HprofInMemoryIndex;->e:Lshark/internal/SortedBytesMap;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v1}, Lshark/internal/SortedBytesMap;->j()I

    .line 150
    move-result v1

    .line 151
    add-int/2addr v0, v1

    .line 152
    add-int/2addr v0, p1

    .line 153
    .line 154
    iget-object p1, p0, Lshark/internal/HprofInMemoryIndex;->g:Lshark/internal/SortedBytesMap;

    .line 155
    .line 156
    .line 157
    invoke-virtual {p1}, Lshark/internal/SortedBytesMap;->j()I

    .line 158
    move-result p1

    .line 159
    add-int/2addr v0, p1

    .line 160
    .line 161
    new-instance v1, Lshark/internal/h$d;

    .line 162
    .line 163
    iget p1, p0, Lshark/internal/HprofInMemoryIndex;->a:I

    .line 164
    .line 165
    .line 166
    invoke-virtual {p2, p1}, Lshark/internal/b;->e(I)J

    .line 167
    move-result-wide v2

    .line 168
    .line 169
    .line 170
    invoke-static {}, Lshark/PrimitiveType;->values()[Lshark/PrimitiveType;

    .line 171
    move-result-object p1

    .line 172
    .line 173
    .line 174
    invoke-virtual {p2}, Lshark/internal/b;->a()B

    .line 175
    move-result v4

    .line 176
    .line 177
    aget-object v4, p1, v4

    .line 178
    .line 179
    iget p1, p0, Lshark/internal/HprofInMemoryIndex;->m:I

    .line 180
    .line 181
    .line 182
    invoke-virtual {p2, p1}, Lshark/internal/b;->e(I)J

    .line 183
    move-result-wide v5

    .line 184
    .line 185
    .line 186
    invoke-direct/range {v1 .. v6}, Lshark/internal/h$d;-><init>(JLshark/PrimitiveType;J)V

    .line 187
    .line 188
    .line 189
    invoke-static {v0, v1}, Lshark/internal/hppc/f;->a(ILjava/lang/Object;)Lshark/internal/hppc/b;

    .line 190
    move-result-object p1

    .line 191
    return-object p1

    .line 192
    :cond_3
    const/4 p1, 0x0

    .line 193
    return-object p1
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
.end method

.method public final r()Lkotlin/sequences/Sequence;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/sequences/Sequence<",
            "Lshark/internal/hppc/d<",
            "Lshark/internal/h;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lshark/internal/HprofInMemoryIndex;->n()Lkotlin/sequences/Sequence;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lshark/internal/HprofInMemoryIndex;->o()Lkotlin/sequences/Sequence;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/sequences/SequencesKt;->plus(Lkotlin/sequences/Sequence;Lkotlin/sequences/Sequence;)Lkotlin/sequences/Sequence;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lshark/internal/HprofInMemoryIndex;->p()Lkotlin/sequences/Sequence;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v1}, Lkotlin/sequences/SequencesKt;->plus(Lkotlin/sequences/Sequence;Lkotlin/sequences/Sequence;)Lkotlin/sequences/Sequence;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lshark/internal/HprofInMemoryIndex;->s()Lkotlin/sequences/Sequence;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    .line 27
    invoke-static {v0, v1}, Lkotlin/sequences/SequencesKt;->plus(Lkotlin/sequences/Sequence;Lkotlin/sequences/Sequence;)Lkotlin/sequences/Sequence;

    .line 28
    move-result-object v0

    .line 29
    return-object v0
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
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
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
.end method

.method public final s()Lkotlin/sequences/Sequence;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/sequences/Sequence<",
            "Lshark/internal/hppc/d<",
            "Lshark/internal/h$d;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lshark/internal/HprofInMemoryIndex;->g:Lshark/internal/SortedBytesMap;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lshark/internal/SortedBytesMap;->g()Lkotlin/sequences/Sequence;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    new-instance v1, Lshark/internal/HprofInMemoryIndex$indexedPrimitiveArraySequence$1;

    .line 9
    .line 10
    .line 11
    invoke-direct {v1, p0}, Lshark/internal/HprofInMemoryIndex$indexedPrimitiveArraySequence$1;-><init>(Lshark/internal/HprofInMemoryIndex;)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lkotlin/sequences/SequencesKt;->map(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;

    .line 15
    move-result-object v0

    .line 16
    return-object v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final t(J)Z
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lshark/internal/HprofInMemoryIndex;->d:Lshark/internal/SortedBytesMap;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lshark/internal/SortedBytesMap;->h(J)Lshark/internal/b;

    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x1

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    return v1

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lshark/internal/HprofInMemoryIndex;->e:Lshark/internal/SortedBytesMap;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1, p2}, Lshark/internal/SortedBytesMap;->h(J)Lshark/internal/b;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    return v1

    .line 20
    .line 21
    :cond_1
    iget-object v0, p0, Lshark/internal/HprofInMemoryIndex;->f:Lshark/internal/SortedBytesMap;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p1, p2}, Lshark/internal/SortedBytesMap;->h(J)Lshark/internal/b;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    if-eqz v0, :cond_2

    .line 28
    return v1

    .line 29
    .line 30
    :cond_2
    iget-object v0, p0, Lshark/internal/HprofInMemoryIndex;->g:Lshark/internal/SortedBytesMap;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p1, p2}, Lshark/internal/SortedBytesMap;->h(J)Lshark/internal/b;

    .line 34
    move-result-object p1

    .line 35
    .line 36
    if-eqz p1, :cond_3

    .line 37
    return v1

    .line 38
    :cond_3
    const/4 p1, 0x0

    .line 39
    return p1
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
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
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
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
.end method

.method public final u(Lshark/internal/b;)Lshark/internal/h$a;
    .locals 10

    .line 1
    .line 2
    iget v0, p0, Lshark/internal/HprofInMemoryIndex;->a:I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1, v0}, Lshark/internal/b;->e(I)J

    .line 6
    move-result-wide v2

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Lshark/internal/b;->b()J

    .line 10
    move-result-wide v4

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Lshark/internal/b;->c()I

    .line 14
    move-result v6

    .line 15
    .line 16
    iget v0, p0, Lshark/internal/HprofInMemoryIndex;->j:I

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v0}, Lshark/internal/b;->e(I)J

    .line 20
    move-result-wide v7

    .line 21
    .line 22
    iget v0, p0, Lshark/internal/HprofInMemoryIndex;->p:I

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, v0}, Lshark/internal/b;->e(I)J

    .line 26
    move-result-wide v0

    .line 27
    long-to-int v9, v0

    .line 28
    .line 29
    new-instance v1, Lshark/internal/h$a;

    .line 30
    .line 31
    .line 32
    invoke-direct/range {v1 .. v9}, Lshark/internal/h$a;-><init>(JJIJI)V

    .line 33
    return-object v1
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
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
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
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
.end method
