.class public final Lshark/internal/HprofInMemoryIndex$a;
.super Ljava/lang/Object;
.source "HprofInMemoryIndex.kt"

# interfaces
.implements Lshark/OnHprofRecordTagListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lshark/internal/HprofInMemoryIndex;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\n\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0012\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u000f\u0008\u0002\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\u000c\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u001f\u0010\u001f\u001a\u00020\u001e2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001d\u001a\u00020\u001c\u00a2\u0006\u0004\u0008\u001f\u0010 J\u001b\u0010\"\u001a\u00020\u0017*\u00020\u00152\u0006\u0010!\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0002\u00a2\u0006\u0004\u0008%\u0010&R\u0014\u0010(\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010\'R\u0014\u0010)\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010\'R\u0014\u0010*\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008%\u0010\'R\u001a\u0010/\u001a\u0008\u0012\u0004\u0012\u00020,0+8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00081\u00102R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00085\u00106R\u0016\u00109\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00088\u0010\'R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008;\u0010<R\u0014\u0010?\u001a\u00020:8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008>\u0010<R\u0014\u0010A\u001a\u00020:8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008@\u0010<R\u0014\u0010C\u001a\u00020:8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008B\u0010<R\u001a\u0010H\u001a\u0008\u0012\u0004\u0012\u00020E0D8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008F\u0010GR\u0017\u0010\u000b\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008I\u0010\'\u001a\u0004\u0008J\u0010KR\u0017\u0010\u000c\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008L\u0010\'\u001a\u0004\u0008M\u0010KR\u0017\u0010\r\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008N\u0010\'\u001a\u0004\u0008O\u0010KR\u0017\u0010\u000e\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008P\u0010\'\u001a\u0004\u0008Q\u0010KR\u0017\u0010\u000f\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008R\u0010\'\u001a\u0004\u0008S\u0010K\u00a8\u0006T"
    }
    d2 = {
        "Lshark/internal/HprofInMemoryIndex$a;",
        "Lshark/OnHprofRecordTagListener;",
        "",
        "longIdentifiers",
        "",
        "maxPosition",
        "",
        "classCount",
        "instanceCount",
        "objectArrayCount",
        "primitiveArrayCount",
        "bytesForClassSize",
        "bytesForInstanceSize",
        "bytesForObjectArraySize",
        "bytesForPrimitiveArraySize",
        "classFieldsTotalBytes",
        "<init>",
        "(ZJIIIIIIIII)V",
        "Lshark/HprofRecordTag;",
        "tag",
        "length",
        "Lshark/HprofRecordReader;",
        "reader",
        "",
        "a",
        "(Lshark/HprofRecordTag;JLshark/HprofRecordReader;)V",
        "Lshark/r;",
        "proguardMapping",
        "Lshark/HprofHeader;",
        "hprofHeader",
        "Lshark/internal/HprofInMemoryIndex;",
        "b",
        "(Lshark/r;Lshark/HprofHeader;)Lshark/internal/HprofInMemoryIndex;",
        "byteCount",
        "c",
        "(Lshark/HprofRecordReader;I)V",
        "",
        "d",
        "()S",
        "I",
        "identifierSize",
        "positionSize",
        "classFieldsIndexSize",
        "Lshark/internal/hppc/LongObjectScatterMap;",
        "",
        "e",
        "Lshark/internal/hppc/LongObjectScatterMap;",
        "hprofStringCache",
        "Lshark/internal/hppc/LongLongScatterMap;",
        "f",
        "Lshark/internal/hppc/LongLongScatterMap;",
        "classNames",
        "",
        "g",
        "[B",
        "classFieldBytes",
        "h",
        "classFieldsIndex",
        "Lshark/internal/m;",
        "i",
        "Lshark/internal/m;",
        "classIndex",
        "j",
        "instanceIndex",
        "k",
        "objectArrayIndex",
        "l",
        "primitiveArrayIndex",
        "",
        "Lshark/d;",
        "m",
        "Ljava/util/List;",
        "gcRoots",
        "n",
        "getBytesForClassSize",
        "()I",
        "o",
        "getBytesForInstanceSize",
        "p",
        "getBytesForObjectArraySize",
        "q",
        "getBytesForPrimitiveArraySize",
        "r",
        "getClassFieldsTotalBytes",
        "shark-graph"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x1
    }
.end annotation


# instance fields
.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:Lshark/internal/hppc/LongObjectScatterMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lshark/internal/hppc/LongObjectScatterMap<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Lshark/internal/hppc/LongLongScatterMap;

.field public final g:[B

.field public h:I

.field public final i:Lshark/internal/m;

.field public final j:Lshark/internal/m;

.field public final k:Lshark/internal/m;

.field public final l:Lshark/internal/m;

.field public final m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lshark/d;",
            ">;"
        }
    .end annotation
.end field

.field public final n:I

.field public final o:I

.field public final p:I

.field public final q:I

.field public final r:I


# direct methods
.method public constructor <init>(ZJIIIIIIIII)V
    .locals 27

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move/from16 v1, p8

    .line 5
    .line 6
    move/from16 v2, p9

    .line 7
    .line 8
    move/from16 v3, p10

    .line 9
    .line 10
    move/from16 v4, p11

    .line 11
    .line 12
    move/from16 v5, p12

    .line 13
    .line 14
    .line 15
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    iput v1, v0, Lshark/internal/HprofInMemoryIndex$a;->n:I

    .line 18
    .line 19
    iput v2, v0, Lshark/internal/HprofInMemoryIndex$a;->o:I

    .line 20
    .line 21
    iput v3, v0, Lshark/internal/HprofInMemoryIndex$a;->p:I

    .line 22
    .line 23
    iput v4, v0, Lshark/internal/HprofInMemoryIndex$a;->q:I

    .line 24
    .line 25
    iput v5, v0, Lshark/internal/HprofInMemoryIndex$a;->r:I

    .line 26
    const/4 v6, 0x4

    .line 27
    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    const/16 v7, 0x8

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move v7, v6

    .line 33
    .line 34
    :goto_0
    iput v7, v0, Lshark/internal/HprofInMemoryIndex$a;->b:I

    .line 35
    .line 36
    sget-object v8, Lshark/internal/HprofInMemoryIndex;->q:Lshark/internal/HprofInMemoryIndex$Companion;

    .line 37
    .line 38
    move-wide/from16 v9, p2

    .line 39
    .line 40
    .line 41
    invoke-static {v8, v9, v10}, Lshark/internal/HprofInMemoryIndex$Companion;->access$byteSizeForUnsigned(Lshark/internal/HprofInMemoryIndex$Companion;J)I

    .line 42
    move-result v9

    .line 43
    .line 44
    iput v9, v0, Lshark/internal/HprofInMemoryIndex$a;->c:I

    .line 45
    int-to-long v10, v5

    .line 46
    .line 47
    .line 48
    invoke-static {v8, v10, v11}, Lshark/internal/HprofInMemoryIndex$Companion;->access$byteSizeForUnsigned(Lshark/internal/HprofInMemoryIndex$Companion;J)I

    .line 49
    move-result v8

    .line 50
    .line 51
    iput v8, v0, Lshark/internal/HprofInMemoryIndex$a;->d:I

    .line 52
    .line 53
    new-instance v10, Lshark/internal/hppc/LongObjectScatterMap;

    .line 54
    .line 55
    .line 56
    invoke-direct {v10}, Lshark/internal/hppc/LongObjectScatterMap;-><init>()V

    .line 57
    .line 58
    iput-object v10, v0, Lshark/internal/HprofInMemoryIndex$a;->e:Lshark/internal/hppc/LongObjectScatterMap;

    .line 59
    .line 60
    new-instance v10, Lshark/internal/hppc/LongLongScatterMap;

    .line 61
    .line 62
    move/from16 v14, p4

    .line 63
    .line 64
    .line 65
    invoke-direct {v10, v14}, Lshark/internal/hppc/LongLongScatterMap;-><init>(I)V

    .line 66
    .line 67
    iput-object v10, v0, Lshark/internal/HprofInMemoryIndex$a;->f:Lshark/internal/hppc/LongLongScatterMap;

    .line 68
    .line 69
    new-array v5, v5, [B

    .line 70
    .line 71
    iput-object v5, v0, Lshark/internal/HprofInMemoryIndex$a;->g:[B

    .line 72
    .line 73
    new-instance v11, Lshark/internal/m;

    .line 74
    .line 75
    add-int v5, v9, v7

    .line 76
    add-int/2addr v5, v6

    .line 77
    add-int/2addr v5, v1

    .line 78
    .line 79
    add-int v12, v5, v8

    .line 80
    .line 81
    const/16 v17, 0x8

    .line 82
    .line 83
    const/16 v18, 0x0

    .line 84
    .line 85
    const-wide/16 v15, 0x0

    .line 86
    .line 87
    move/from16 v13, p1

    .line 88
    .line 89
    .line 90
    invoke-direct/range {v11 .. v18}, Lshark/internal/m;-><init>(IZIDILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 91
    .line 92
    iput-object v11, v0, Lshark/internal/HprofInMemoryIndex$a;->i:Lshark/internal/m;

    .line 93
    .line 94
    new-instance v19, Lshark/internal/m;

    .line 95
    .line 96
    add-int v1, v9, v7

    .line 97
    .line 98
    add-int v20, v1, v2

    .line 99
    .line 100
    const/16 v25, 0x8

    .line 101
    .line 102
    const/16 v26, 0x0

    .line 103
    .line 104
    const-wide/16 v23, 0x0

    .line 105
    .line 106
    move/from16 v21, p1

    .line 107
    .line 108
    move/from16 v22, p5

    .line 109
    .line 110
    .line 111
    invoke-direct/range {v19 .. v26}, Lshark/internal/m;-><init>(IZIDILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 112
    .line 113
    move-object/from16 v1, v19

    .line 114
    .line 115
    iput-object v1, v0, Lshark/internal/HprofInMemoryIndex$a;->j:Lshark/internal/m;

    .line 116
    .line 117
    new-instance v19, Lshark/internal/m;

    .line 118
    add-int/2addr v7, v9

    .line 119
    .line 120
    add-int v20, v7, v3

    .line 121
    .line 122
    move/from16 v22, p6

    .line 123
    .line 124
    .line 125
    invoke-direct/range {v19 .. v26}, Lshark/internal/m;-><init>(IZIDILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 126
    .line 127
    move-object/from16 v1, v19

    .line 128
    .line 129
    iput-object v1, v0, Lshark/internal/HprofInMemoryIndex$a;->k:Lshark/internal/m;

    .line 130
    .line 131
    new-instance v19, Lshark/internal/m;

    .line 132
    .line 133
    add-int/lit8 v9, v9, 0x1

    .line 134
    .line 135
    add-int v20, v9, v4

    .line 136
    .line 137
    move/from16 v22, p7

    .line 138
    .line 139
    .line 140
    invoke-direct/range {v19 .. v26}, Lshark/internal/m;-><init>(IZIDILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 141
    .line 142
    move-object/from16 v1, v19

    .line 143
    .line 144
    iput-object v1, v0, Lshark/internal/HprofInMemoryIndex$a;->l:Lshark/internal/m;

    .line 145
    .line 146
    new-instance v1, Ljava/util/ArrayList;

    .line 147
    .line 148
    .line 149
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 150
    .line 151
    iput-object v1, v0, Lshark/internal/HprofInMemoryIndex$a;->m:Ljava/util/List;

    .line 152
    return-void
.end method


# virtual methods
.method public a(Lshark/HprofRecordTag;JLshark/HprofRecordReader;)V
    .locals 19
    .param p1    # Lshark/HprofRecordTag;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lshark/HprofRecordReader;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p4

    .line 5
    const/4 v2, 0x1

    .line 6
    .line 7
    sget-object v3, Lshark/internal/f;->$EnumSwitchMapping$0:[I

    .line 8
    .line 9
    .line 10
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Enum;->ordinal()I

    .line 11
    move-result v4

    .line 12
    .line 13
    aget v3, v3, v4

    .line 14
    .line 15
    const-wide/16 v4, 0x0

    .line 16
    .line 17
    .line 18
    packed-switch v3, :pswitch_data_0

    .line 19
    .line 20
    goto/16 :goto_4

    .line 21
    .line 22
    .line 23
    :pswitch_0
    invoke-virtual {v1}, Lshark/HprofRecordReader;->a()J

    .line 24
    move-result-wide v2

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Lshark/HprofRecordReader;->o()J

    .line 28
    move-result-wide v4

    .line 29
    .line 30
    sget-object v6, Lshark/PrimitiveType;->INT:Lshark/PrimitiveType;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v6}, Lshark/PrimitiveType;->getByteSize()I

    .line 34
    move-result v6

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, v6}, Lshark/HprofRecordReader;->U(I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Lshark/HprofRecordReader;->r()I

    .line 41
    move-result v6

    .line 42
    .line 43
    sget-object v7, Lshark/PrimitiveType;->Companion:Lshark/PrimitiveType$Companion;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v7}, Lshark/PrimitiveType$Companion;->getPrimitiveTypeByHprofType()Ljava/util/Map;

    .line 47
    move-result-object v7

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1}, Lshark/HprofRecordReader;->N()I

    .line 51
    move-result v8

    .line 52
    .line 53
    .line 54
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 55
    move-result-object v8

    .line 56
    .line 57
    .line 58
    invoke-static {v7, v8}, Lkotlin/collections/MapsKt;->getValue(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    move-result-object v7

    .line 60
    .line 61
    check-cast v7, Lshark/PrimitiveType;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v7}, Lshark/PrimitiveType;->getByteSize()I

    .line 65
    move-result v8

    .line 66
    mul-int/2addr v6, v8

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1, v6}, Lshark/HprofRecordReader;->U(I)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1}, Lshark/HprofRecordReader;->a()J

    .line 73
    move-result-wide v8

    .line 74
    sub-long/2addr v8, v2

    .line 75
    .line 76
    iget-object v1, v0, Lshark/internal/HprofInMemoryIndex$a;->l:Lshark/internal/m;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1, v4, v5}, Lshark/internal/m;->i(J)Lshark/internal/m$a;

    .line 80
    move-result-object v1

    .line 81
    .line 82
    iget v4, v0, Lshark/internal/HprofInMemoryIndex$a;->c:I

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1, v2, v3, v4}, Lshark/internal/m$a;->e(JI)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    .line 89
    move-result v2

    .line 90
    int-to-byte v2, v2

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1, v2}, Lshark/internal/m$a;->a(B)V

    .line 94
    .line 95
    iget v2, v0, Lshark/internal/HprofInMemoryIndex$a;->q:I

    .line 96
    .line 97
    .line 98
    invoke-virtual {v1, v8, v9, v2}, Lshark/internal/m$a;->e(JI)V

    .line 99
    .line 100
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 101
    return-void

    .line 102
    .line 103
    .line 104
    :pswitch_1
    invoke-virtual {v1}, Lshark/HprofRecordReader;->a()J

    .line 105
    move-result-wide v2

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1}, Lshark/HprofRecordReader;->o()J

    .line 109
    move-result-wide v4

    .line 110
    .line 111
    sget-object v6, Lshark/PrimitiveType;->INT:Lshark/PrimitiveType;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v6}, Lshark/PrimitiveType;->getByteSize()I

    .line 115
    move-result v6

    .line 116
    .line 117
    .line 118
    invoke-virtual {v1, v6}, Lshark/HprofRecordReader;->U(I)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v1}, Lshark/HprofRecordReader;->r()I

    .line 122
    move-result v6

    .line 123
    .line 124
    .line 125
    invoke-virtual {v1}, Lshark/HprofRecordReader;->o()J

    .line 126
    move-result-wide v7

    .line 127
    .line 128
    iget v9, v0, Lshark/internal/HprofInMemoryIndex$a;->b:I

    .line 129
    mul-int/2addr v9, v6

    .line 130
    .line 131
    .line 132
    invoke-virtual {v1, v9}, Lshark/HprofRecordReader;->U(I)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v1}, Lshark/HprofRecordReader;->a()J

    .line 136
    move-result-wide v9

    .line 137
    sub-long/2addr v9, v2

    .line 138
    .line 139
    iget-object v1, v0, Lshark/internal/HprofInMemoryIndex$a;->k:Lshark/internal/m;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v1, v4, v5}, Lshark/internal/m;->i(J)Lshark/internal/m$a;

    .line 143
    move-result-object v1

    .line 144
    .line 145
    iget v4, v0, Lshark/internal/HprofInMemoryIndex$a;->c:I

    .line 146
    .line 147
    .line 148
    invoke-virtual {v1, v2, v3, v4}, Lshark/internal/m$a;->e(JI)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v1, v7, v8}, Lshark/internal/m$a;->b(J)V

    .line 152
    .line 153
    iget v2, v0, Lshark/internal/HprofInMemoryIndex$a;->p:I

    .line 154
    .line 155
    .line 156
    invoke-virtual {v1, v9, v10, v2}, Lshark/internal/m$a;->e(JI)V

    .line 157
    .line 158
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 159
    return-void

    .line 160
    .line 161
    .line 162
    :pswitch_2
    invoke-virtual {v1}, Lshark/HprofRecordReader;->a()J

    .line 163
    move-result-wide v2

    .line 164
    .line 165
    .line 166
    invoke-virtual {v1}, Lshark/HprofRecordReader;->o()J

    .line 167
    move-result-wide v4

    .line 168
    .line 169
    sget-object v6, Lshark/PrimitiveType;->INT:Lshark/PrimitiveType;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v6}, Lshark/PrimitiveType;->getByteSize()I

    .line 173
    move-result v6

    .line 174
    .line 175
    .line 176
    invoke-virtual {v1, v6}, Lshark/HprofRecordReader;->U(I)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v1}, Lshark/HprofRecordReader;->o()J

    .line 180
    move-result-wide v6

    .line 181
    .line 182
    .line 183
    invoke-virtual {v1}, Lshark/HprofRecordReader;->r()I

    .line 184
    move-result v8

    .line 185
    .line 186
    .line 187
    invoke-virtual {v1, v8}, Lshark/HprofRecordReader;->U(I)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v1}, Lshark/HprofRecordReader;->a()J

    .line 191
    move-result-wide v8

    .line 192
    sub-long/2addr v8, v2

    .line 193
    .line 194
    iget-object v1, v0, Lshark/internal/HprofInMemoryIndex$a;->j:Lshark/internal/m;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v1, v4, v5}, Lshark/internal/m;->i(J)Lshark/internal/m$a;

    .line 198
    move-result-object v1

    .line 199
    .line 200
    iget v4, v0, Lshark/internal/HprofInMemoryIndex$a;->c:I

    .line 201
    .line 202
    .line 203
    invoke-virtual {v1, v2, v3, v4}, Lshark/internal/m$a;->e(JI)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v1, v6, v7}, Lshark/internal/m$a;->b(J)V

    .line 207
    .line 208
    iget v2, v0, Lshark/internal/HprofInMemoryIndex$a;->o:I

    .line 209
    .line 210
    .line 211
    invoke-virtual {v1, v8, v9, v2}, Lshark/internal/m$a;->e(JI)V

    .line 212
    .line 213
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 214
    return-void

    .line 215
    .line 216
    .line 217
    :pswitch_3
    invoke-virtual {v1}, Lshark/HprofRecordReader;->a()J

    .line 218
    move-result-wide v3

    .line 219
    .line 220
    .line 221
    invoke-virtual {v1}, Lshark/HprofRecordReader;->o()J

    .line 222
    move-result-wide v5

    .line 223
    .line 224
    sget-object v7, Lshark/PrimitiveType;->INT:Lshark/PrimitiveType;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v7}, Lshark/PrimitiveType;->getByteSize()I

    .line 228
    move-result v7

    .line 229
    .line 230
    .line 231
    invoke-virtual {v1, v7}, Lshark/HprofRecordReader;->U(I)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v1}, Lshark/HprofRecordReader;->o()J

    .line 235
    move-result-wide v7

    .line 236
    .line 237
    iget v9, v0, Lshark/internal/HprofInMemoryIndex$a;->b:I

    .line 238
    .line 239
    mul-int/lit8 v9, v9, 0x5

    .line 240
    .line 241
    .line 242
    invoke-virtual {v1, v9}, Lshark/HprofRecordReader;->U(I)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v1}, Lshark/HprofRecordReader;->r()I

    .line 246
    move-result v9

    .line 247
    .line 248
    .line 249
    invoke-virtual {v1}, Lshark/HprofRecordReader;->W()V

    .line 250
    .line 251
    iget v10, v0, Lshark/internal/HprofInMemoryIndex$a;->h:I

    .line 252
    .line 253
    .line 254
    invoke-virtual {v1}, Lshark/HprofRecordReader;->a()J

    .line 255
    move-result-wide v11

    .line 256
    const/4 v13, 0x2

    .line 257
    .line 258
    .line 259
    invoke-virtual {v0, v1, v13}, Lshark/internal/HprofInMemoryIndex$a;->c(Lshark/HprofRecordReader;I)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v0}, Lshark/internal/HprofInMemoryIndex$a;->d()S

    .line 263
    move-result v14

    .line 264
    .line 265
    .line 266
    const v15, 0xffff

    .line 267
    and-int/2addr v14, v15

    .line 268
    .line 269
    const/16 v16, 0x0

    .line 270
    .line 271
    move/from16 p1, v15

    .line 272
    .line 273
    move/from16 v15, v16

    .line 274
    .line 275
    :goto_0
    if-ge v15, v14, :cond_1

    .line 276
    .line 277
    iget v13, v0, Lshark/internal/HprofInMemoryIndex$a;->b:I

    .line 278
    .line 279
    .line 280
    invoke-virtual {v0, v1, v13}, Lshark/internal/HprofInMemoryIndex$a;->c(Lshark/HprofRecordReader;I)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {v0, v1, v2}, Lshark/internal/HprofInMemoryIndex$a;->c(Lshark/HprofRecordReader;I)V

    .line 284
    .line 285
    iget-object v13, v0, Lshark/internal/HprofInMemoryIndex$a;->g:[B

    .line 286
    .line 287
    move/from16 v17, v2

    .line 288
    .line 289
    iget v2, v0, Lshark/internal/HprofInMemoryIndex$a;->h:I

    .line 290
    .line 291
    add-int/lit8 v2, v2, -0x1

    .line 292
    .line 293
    aget-byte v2, v13, v2

    .line 294
    .line 295
    and-int/lit16 v2, v2, 0xff

    .line 296
    const/4 v13, 0x2

    .line 297
    .line 298
    if-ne v2, v13, :cond_0

    .line 299
    .line 300
    iget v2, v0, Lshark/internal/HprofInMemoryIndex$a;->b:I

    .line 301
    .line 302
    .line 303
    invoke-virtual {v0, v1, v2}, Lshark/internal/HprofInMemoryIndex$a;->c(Lshark/HprofRecordReader;I)V

    .line 304
    goto :goto_1

    .line 305
    .line 306
    :cond_0
    sget-object v13, Lshark/PrimitiveType;->Companion:Lshark/PrimitiveType$Companion;

    .line 307
    .line 308
    .line 309
    invoke-virtual {v13}, Lshark/PrimitiveType$Companion;->getByteSizeByHprofType()Ljava/util/Map;

    .line 310
    move-result-object v13

    .line 311
    .line 312
    .line 313
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 314
    move-result-object v2

    .line 315
    .line 316
    .line 317
    invoke-static {v13, v2}, Lkotlin/collections/MapsKt;->getValue(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 318
    move-result-object v2

    .line 319
    .line 320
    check-cast v2, Ljava/lang/Number;

    .line 321
    .line 322
    .line 323
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 324
    move-result v2

    .line 325
    .line 326
    .line 327
    invoke-virtual {v0, v1, v2}, Lshark/internal/HprofInMemoryIndex$a;->c(Lshark/HprofRecordReader;I)V

    .line 328
    .line 329
    :goto_1
    add-int/lit8 v15, v15, 0x1

    .line 330
    .line 331
    move/from16 v2, v17

    .line 332
    const/4 v13, 0x2

    .line 333
    goto :goto_0

    .line 334
    .line 335
    :cond_1
    move/from16 v17, v2

    .line 336
    .line 337
    .line 338
    invoke-virtual {v0, v1, v13}, Lshark/internal/HprofInMemoryIndex$a;->c(Lshark/HprofRecordReader;I)V

    .line 339
    .line 340
    .line 341
    invoke-virtual {v0}, Lshark/internal/HprofInMemoryIndex$a;->d()S

    .line 342
    move-result v2

    .line 343
    .line 344
    and-int v2, v2, p1

    .line 345
    .line 346
    move/from16 v13, v16

    .line 347
    .line 348
    :goto_2
    if-ge v13, v2, :cond_2

    .line 349
    .line 350
    iget v14, v0, Lshark/internal/HprofInMemoryIndex$a;->b:I

    .line 351
    .line 352
    .line 353
    invoke-virtual {v0, v1, v14}, Lshark/internal/HprofInMemoryIndex$a;->c(Lshark/HprofRecordReader;I)V

    .line 354
    .line 355
    move/from16 v14, v17

    .line 356
    .line 357
    .line 358
    invoke-virtual {v0, v1, v14}, Lshark/internal/HprofInMemoryIndex$a;->c(Lshark/HprofRecordReader;I)V

    .line 359
    add-int/2addr v13, v14

    .line 360
    goto :goto_2

    .line 361
    .line 362
    :cond_2
    move/from16 v14, v17

    .line 363
    .line 364
    .line 365
    invoke-virtual {v1}, Lshark/HprofRecordReader;->a()J

    .line 366
    move-result-wide v17

    .line 367
    .line 368
    sub-long v11, v17, v11

    .line 369
    long-to-int v2, v11

    .line 370
    .line 371
    .line 372
    invoke-virtual {v1}, Lshark/HprofRecordReader;->a()J

    .line 373
    move-result-wide v11

    .line 374
    sub-long/2addr v11, v3

    .line 375
    .line 376
    iget-object v1, v0, Lshark/internal/HprofInMemoryIndex$a;->i:Lshark/internal/m;

    .line 377
    .line 378
    .line 379
    invoke-virtual {v1, v5, v6}, Lshark/internal/m;->i(J)Lshark/internal/m$a;

    .line 380
    move-result-object v1

    .line 381
    .line 382
    iget v5, v0, Lshark/internal/HprofInMemoryIndex$a;->c:I

    .line 383
    .line 384
    .line 385
    invoke-virtual {v1, v3, v4, v5}, Lshark/internal/m$a;->e(JI)V

    .line 386
    .line 387
    .line 388
    invoke-virtual {v1, v7, v8}, Lshark/internal/m$a;->b(J)V

    .line 389
    .line 390
    .line 391
    invoke-virtual {v1, v9}, Lshark/internal/m$a;->c(I)V

    .line 392
    .line 393
    iget v3, v0, Lshark/internal/HprofInMemoryIndex$a;->n:I

    .line 394
    .line 395
    .line 396
    invoke-virtual {v1, v11, v12, v3}, Lshark/internal/m$a;->e(JI)V

    .line 397
    int-to-long v3, v10

    .line 398
    .line 399
    iget v5, v0, Lshark/internal/HprofInMemoryIndex$a;->d:I

    .line 400
    .line 401
    .line 402
    invoke-virtual {v1, v3, v4, v5}, Lshark/internal/m$a;->e(JI)V

    .line 403
    .line 404
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 405
    add-int/2addr v10, v2

    .line 406
    .line 407
    iget v1, v0, Lshark/internal/HprofInMemoryIndex$a;->h:I

    .line 408
    .line 409
    if-ne v10, v1, :cond_3

    .line 410
    goto :goto_3

    .line 411
    .line 412
    :cond_3
    move/from16 v14, v16

    .line 413
    .line 414
    :goto_3
    if-eqz v14, :cond_4

    .line 415
    :goto_4
    return-void

    .line 416
    .line 417
    :cond_4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 418
    .line 419
    .line 420
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 421
    .line 422
    const-string v3, "Expected "

    .line 423
    .line 424
    .line 425
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 426
    .line 427
    iget v3, v0, Lshark/internal/HprofInMemoryIndex$a;->h:I

    .line 428
    .line 429
    .line 430
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 431
    .line 432
    const-string v3, " to have moved by "

    .line 433
    .line 434
    .line 435
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 436
    .line 437
    .line 438
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 439
    .line 440
    const-string v2, " and be equal to "

    .line 441
    .line 442
    .line 443
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 444
    .line 445
    .line 446
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 447
    .line 448
    .line 449
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 450
    move-result-object v1

    .line 451
    .line 452
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 453
    .line 454
    .line 455
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 456
    move-result-object v1

    .line 457
    .line 458
    .line 459
    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 460
    throw v2

    .line 461
    .line 462
    .line 463
    :pswitch_4
    invoke-virtual {v1}, Lshark/HprofRecordReader;->M()Lshark/d$o;

    .line 464
    move-result-object v1

    .line 465
    .line 466
    .line 467
    invoke-virtual {v1}, Lshark/d$o;->a()J

    .line 468
    move-result-wide v2

    .line 469
    .line 470
    cmp-long v2, v2, v4

    .line 471
    .line 472
    if-eqz v2, :cond_5

    .line 473
    .line 474
    iget-object v2, v0, Lshark/internal/HprofInMemoryIndex$a;->m:Ljava/util/List;

    .line 475
    .line 476
    .line 477
    invoke-interface {v2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 478
    .line 479
    :cond_5
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 480
    return-void

    .line 481
    .line 482
    .line 483
    :pswitch_5
    invoke-virtual {v1}, Lshark/HprofRecordReader;->x()Lshark/d$g;

    .line 484
    move-result-object v1

    .line 485
    .line 486
    .line 487
    invoke-virtual {v1}, Lshark/d$g;->a()J

    .line 488
    move-result-wide v2

    .line 489
    .line 490
    cmp-long v2, v2, v4

    .line 491
    .line 492
    if-eqz v2, :cond_6

    .line 493
    .line 494
    iget-object v2, v0, Lshark/internal/HprofInMemoryIndex$a;->m:Ljava/util/List;

    .line 495
    .line 496
    .line 497
    invoke-interface {v2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 498
    .line 499
    :cond_6
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 500
    return-void

    .line 501
    .line 502
    .line 503
    :pswitch_6
    invoke-virtual {v1}, Lshark/HprofRecordReader;->S()Lshark/d$p;

    .line 504
    move-result-object v1

    .line 505
    .line 506
    .line 507
    invoke-virtual {v1}, Lshark/d$p;->a()J

    .line 508
    move-result-wide v2

    .line 509
    .line 510
    cmp-long v2, v2, v4

    .line 511
    .line 512
    if-eqz v2, :cond_7

    .line 513
    .line 514
    iget-object v2, v0, Lshark/internal/HprofInMemoryIndex$a;->m:Ljava/util/List;

    .line 515
    .line 516
    .line 517
    invoke-interface {v2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 518
    .line 519
    :cond_7
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 520
    return-void

    .line 521
    .line 522
    .line 523
    :pswitch_7
    invoke-virtual {v1}, Lshark/HprofRecordReader;->E()Lshark/d$j;

    .line 524
    move-result-object v1

    .line 525
    .line 526
    .line 527
    invoke-virtual {v1}, Lshark/d$j;->a()J

    .line 528
    move-result-wide v2

    .line 529
    .line 530
    cmp-long v2, v2, v4

    .line 531
    .line 532
    if-eqz v2, :cond_8

    .line 533
    .line 534
    iget-object v2, v0, Lshark/internal/HprofInMemoryIndex$a;->m:Ljava/util/List;

    .line 535
    .line 536
    .line 537
    invoke-interface {v2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 538
    .line 539
    :cond_8
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 540
    return-void

    .line 541
    .line 542
    .line 543
    :pswitch_8
    invoke-virtual {v1}, Lshark/HprofRecordReader;->i()Lshark/d$a;

    .line 544
    move-result-object v1

    .line 545
    .line 546
    .line 547
    invoke-virtual {v1}, Lshark/d$a;->a()J

    .line 548
    move-result-wide v2

    .line 549
    .line 550
    cmp-long v2, v2, v4

    .line 551
    .line 552
    if-eqz v2, :cond_9

    .line 553
    .line 554
    iget-object v2, v0, Lshark/internal/HprofInMemoryIndex$a;->m:Ljava/util/List;

    .line 555
    .line 556
    .line 557
    invoke-interface {v2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 558
    .line 559
    :cond_9
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 560
    return-void

    .line 561
    .line 562
    .line 563
    :pswitch_9
    invoke-virtual {v1}, Lshark/HprofRecordReader;->l()Lshark/d$b;

    .line 564
    move-result-object v1

    .line 565
    .line 566
    .line 567
    invoke-virtual {v1}, Lshark/d$b;->a()J

    .line 568
    move-result-wide v2

    .line 569
    .line 570
    cmp-long v2, v2, v4

    .line 571
    .line 572
    if-eqz v2, :cond_a

    .line 573
    .line 574
    iget-object v2, v0, Lshark/internal/HprofInMemoryIndex$a;->m:Ljava/util/List;

    .line 575
    .line 576
    .line 577
    invoke-interface {v2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 578
    .line 579
    :cond_a
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 580
    return-void

    .line 581
    .line 582
    .line 583
    :pswitch_a
    invoke-virtual {v1}, Lshark/HprofRecordReader;->t()Lshark/d$c;

    .line 584
    move-result-object v1

    .line 585
    .line 586
    .line 587
    invoke-virtual {v1}, Lshark/d$c;->a()J

    .line 588
    move-result-wide v2

    .line 589
    .line 590
    cmp-long v2, v2, v4

    .line 591
    .line 592
    if-eqz v2, :cond_b

    .line 593
    .line 594
    iget-object v2, v0, Lshark/internal/HprofInMemoryIndex$a;->m:Ljava/util/List;

    .line 595
    .line 596
    .line 597
    invoke-interface {v2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 598
    .line 599
    :cond_b
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 600
    return-void

    .line 601
    .line 602
    .line 603
    :pswitch_b
    invoke-virtual {v1}, Lshark/HprofRecordReader;->K()Lshark/d$m;

    .line 604
    move-result-object v1

    .line 605
    .line 606
    .line 607
    invoke-virtual {v1}, Lshark/d$m;->a()J

    .line 608
    move-result-wide v2

    .line 609
    .line 610
    cmp-long v2, v2, v4

    .line 611
    .line 612
    if-eqz v2, :cond_c

    .line 613
    .line 614
    iget-object v2, v0, Lshark/internal/HprofInMemoryIndex$a;->m:Ljava/util/List;

    .line 615
    .line 616
    .line 617
    invoke-interface {v2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 618
    .line 619
    :cond_c
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 620
    return-void

    .line 621
    .line 622
    .line 623
    :pswitch_c
    invoke-virtual {v1}, Lshark/HprofRecordReader;->A()Lshark/d$h;

    .line 624
    move-result-object v1

    .line 625
    .line 626
    .line 627
    invoke-virtual {v1}, Lshark/d$h;->a()J

    .line 628
    move-result-wide v2

    .line 629
    .line 630
    cmp-long v2, v2, v4

    .line 631
    .line 632
    if-eqz v2, :cond_d

    .line 633
    .line 634
    iget-object v2, v0, Lshark/internal/HprofInMemoryIndex$a;->m:Ljava/util/List;

    .line 635
    .line 636
    .line 637
    invoke-interface {v2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 638
    .line 639
    :cond_d
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 640
    return-void

    .line 641
    .line 642
    .line 643
    :pswitch_d
    invoke-virtual {v1}, Lshark/HprofRecordReader;->J()Lshark/d$l;

    .line 644
    move-result-object v1

    .line 645
    .line 646
    .line 647
    invoke-virtual {v1}, Lshark/d$l;->a()J

    .line 648
    move-result-wide v2

    .line 649
    .line 650
    cmp-long v2, v2, v4

    .line 651
    .line 652
    if-eqz v2, :cond_e

    .line 653
    .line 654
    iget-object v2, v0, Lshark/internal/HprofInMemoryIndex$a;->m:Ljava/util/List;

    .line 655
    .line 656
    .line 657
    invoke-interface {v2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 658
    .line 659
    :cond_e
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 660
    return-void

    .line 661
    .line 662
    .line 663
    :pswitch_e
    invoke-virtual {v1}, Lshark/HprofRecordReader;->H()Lshark/d$k;

    .line 664
    move-result-object v1

    .line 665
    .line 666
    .line 667
    invoke-virtual {v1}, Lshark/d$k;->a()J

    .line 668
    move-result-wide v2

    .line 669
    .line 670
    cmp-long v2, v2, v4

    .line 671
    .line 672
    if-eqz v2, :cond_f

    .line 673
    .line 674
    iget-object v2, v0, Lshark/internal/HprofInMemoryIndex$a;->m:Ljava/util/List;

    .line 675
    .line 676
    .line 677
    invoke-interface {v2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 678
    .line 679
    :cond_f
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 680
    return-void

    .line 681
    .line 682
    .line 683
    :pswitch_f
    invoke-virtual {v1}, Lshark/HprofRecordReader;->B()Lshark/d$i;

    .line 684
    move-result-object v1

    .line 685
    .line 686
    .line 687
    invoke-virtual {v1}, Lshark/d$i;->a()J

    .line 688
    move-result-wide v2

    .line 689
    .line 690
    cmp-long v2, v2, v4

    .line 691
    .line 692
    if-eqz v2, :cond_10

    .line 693
    .line 694
    iget-object v2, v0, Lshark/internal/HprofInMemoryIndex$a;->m:Ljava/util/List;

    .line 695
    .line 696
    .line 697
    invoke-interface {v2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 698
    .line 699
    :cond_10
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 700
    return-void

    .line 701
    .line 702
    .line 703
    :pswitch_10
    invoke-virtual {v1}, Lshark/HprofRecordReader;->u()Lshark/d$d;

    .line 704
    move-result-object v1

    .line 705
    .line 706
    .line 707
    invoke-virtual {v1}, Lshark/d$d;->a()J

    .line 708
    move-result-wide v2

    .line 709
    .line 710
    cmp-long v2, v2, v4

    .line 711
    .line 712
    if-eqz v2, :cond_11

    .line 713
    .line 714
    iget-object v2, v0, Lshark/internal/HprofInMemoryIndex$a;->m:Ljava/util/List;

    .line 715
    .line 716
    .line 717
    invoke-interface {v2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 718
    .line 719
    :cond_11
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 720
    return-void

    .line 721
    .line 722
    .line 723
    :pswitch_11
    invoke-virtual {v1}, Lshark/HprofRecordReader;->w()Lshark/d$f;

    .line 724
    move-result-object v1

    .line 725
    .line 726
    .line 727
    invoke-virtual {v1}, Lshark/d$f;->a()J

    .line 728
    move-result-wide v2

    .line 729
    .line 730
    cmp-long v2, v2, v4

    .line 731
    .line 732
    if-eqz v2, :cond_12

    .line 733
    .line 734
    iget-object v2, v0, Lshark/internal/HprofInMemoryIndex$a;->m:Ljava/util/List;

    .line 735
    .line 736
    .line 737
    invoke-interface {v2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 738
    .line 739
    :cond_12
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 740
    return-void

    .line 741
    .line 742
    .line 743
    :pswitch_12
    invoke-virtual {v1}, Lshark/HprofRecordReader;->v()Lshark/d$e;

    .line 744
    move-result-object v1

    .line 745
    .line 746
    .line 747
    invoke-virtual {v1}, Lshark/d$e;->a()J

    .line 748
    move-result-wide v2

    .line 749
    .line 750
    cmp-long v2, v2, v4

    .line 751
    .line 752
    if-eqz v2, :cond_13

    .line 753
    .line 754
    iget-object v2, v0, Lshark/internal/HprofInMemoryIndex$a;->m:Ljava/util/List;

    .line 755
    .line 756
    .line 757
    invoke-interface {v2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 758
    .line 759
    :cond_13
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 760
    return-void

    .line 761
    .line 762
    .line 763
    :pswitch_13
    invoke-virtual {v1}, Lshark/HprofRecordReader;->L()Lshark/d$n;

    .line 764
    move-result-object v1

    .line 765
    .line 766
    .line 767
    invoke-virtual {v1}, Lshark/d$n;->a()J

    .line 768
    move-result-wide v2

    .line 769
    .line 770
    cmp-long v2, v2, v4

    .line 771
    .line 772
    if-eqz v2, :cond_14

    .line 773
    .line 774
    iget-object v2, v0, Lshark/internal/HprofInMemoryIndex$a;->m:Ljava/util/List;

    .line 775
    .line 776
    .line 777
    invoke-interface {v2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 778
    .line 779
    :cond_14
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 780
    return-void

    .line 781
    .line 782
    :pswitch_14
    sget-object v2, Lshark/PrimitiveType;->INT:Lshark/PrimitiveType;

    .line 783
    .line 784
    .line 785
    invoke-virtual {v2}, Lshark/PrimitiveType;->getByteSize()I

    .line 786
    move-result v3

    .line 787
    .line 788
    .line 789
    invoke-virtual {v1, v3}, Lshark/HprofRecordReader;->U(I)V

    .line 790
    .line 791
    .line 792
    invoke-virtual {v1}, Lshark/HprofRecordReader;->o()J

    .line 793
    move-result-wide v3

    .line 794
    .line 795
    .line 796
    invoke-virtual {v2}, Lshark/PrimitiveType;->getByteSize()I

    .line 797
    move-result v2

    .line 798
    .line 799
    .line 800
    invoke-virtual {v1, v2}, Lshark/HprofRecordReader;->U(I)V

    .line 801
    .line 802
    .line 803
    invoke-virtual {v1}, Lshark/HprofRecordReader;->o()J

    .line 804
    move-result-wide v1

    .line 805
    .line 806
    iget-object v5, v0, Lshark/internal/HprofInMemoryIndex$a;->f:Lshark/internal/hppc/LongLongScatterMap;

    .line 807
    .line 808
    .line 809
    invoke-virtual {v5, v3, v4, v1, v2}, Lshark/internal/hppc/LongLongScatterMap;->q(JJ)J

    .line 810
    return-void

    .line 811
    .line 812
    :pswitch_15
    iget-object v2, v0, Lshark/internal/HprofInMemoryIndex$a;->e:Lshark/internal/hppc/LongObjectScatterMap;

    .line 813
    .line 814
    .line 815
    invoke-virtual {v1}, Lshark/HprofRecordReader;->o()J

    .line 816
    move-result-wide v3

    .line 817
    .line 818
    iget v5, v0, Lshark/internal/HprofInMemoryIndex$a;->b:I

    .line 819
    int-to-long v5, v5

    .line 820
    .line 821
    sub-long v5, p2, v5

    .line 822
    .line 823
    .line 824
    invoke-virtual {v1, v5, v6}, Lshark/HprofRecordReader;->Q(J)Ljava/lang/String;

    .line 825
    move-result-object v1

    .line 826
    .line 827
    .line 828
    invoke-virtual {v2, v3, v4, v1}, Lshark/internal/hppc/LongObjectScatterMap;->m(JLjava/lang/Object;)Ljava/lang/Object;

    .line 829
    return-void

    .line 830
    nop

    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 879
.end method

.method public final b(Lshark/r;Lshark/HprofHeader;)Lshark/internal/HprofInMemoryIndex;
    .locals 23
    .param p1    # Lshark/r;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lshark/HprofHeader;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    iget v1, v0, Lshark/internal/HprofInMemoryIndex$a;->h:I

    .line 5
    .line 6
    iget-object v2, v0, Lshark/internal/HprofInMemoryIndex$a;->g:[B

    .line 7
    array-length v2, v2

    .line 8
    .line 9
    if-ne v1, v2, :cond_0

    .line 10
    const/4 v1, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v1, 0x0

    .line 13
    .line 14
    :goto_0
    if-eqz v1, :cond_2

    .line 15
    .line 16
    iget-object v1, v0, Lshark/internal/HprofInMemoryIndex$a;->j:Lshark/internal/m;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Lshark/internal/m;->k()Lshark/internal/SortedBytesMap;

    .line 20
    move-result-object v10

    .line 21
    .line 22
    iget-object v1, v0, Lshark/internal/HprofInMemoryIndex$a;->k:Lshark/internal/m;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Lshark/internal/m;->k()Lshark/internal/SortedBytesMap;

    .line 26
    move-result-object v11

    .line 27
    .line 28
    iget-object v1, v0, Lshark/internal/HprofInMemoryIndex$a;->l:Lshark/internal/m;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Lshark/internal/m;->k()Lshark/internal/SortedBytesMap;

    .line 32
    move-result-object v12

    .line 33
    .line 34
    iget-object v1, v0, Lshark/internal/HprofInMemoryIndex$a;->i:Lshark/internal/m;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Lshark/internal/m;->k()Lshark/internal/SortedBytesMap;

    .line 38
    move-result-object v9

    .line 39
    .line 40
    new-instance v5, Lshark/internal/HprofInMemoryIndex;

    .line 41
    .line 42
    iget v6, v0, Lshark/internal/HprofInMemoryIndex$a;->c:I

    .line 43
    .line 44
    iget-object v7, v0, Lshark/internal/HprofInMemoryIndex$a;->e:Lshark/internal/hppc/LongObjectScatterMap;

    .line 45
    .line 46
    iget-object v8, v0, Lshark/internal/HprofInMemoryIndex$a;->f:Lshark/internal/hppc/LongLongScatterMap;

    .line 47
    .line 48
    iget-object v13, v0, Lshark/internal/HprofInMemoryIndex$a;->m:Ljava/util/List;

    .line 49
    .line 50
    iget v15, v0, Lshark/internal/HprofInMemoryIndex$a;->n:I

    .line 51
    .line 52
    iget v1, v0, Lshark/internal/HprofInMemoryIndex$a;->o:I

    .line 53
    .line 54
    iget v2, v0, Lshark/internal/HprofInMemoryIndex$a;->p:I

    .line 55
    .line 56
    iget v14, v0, Lshark/internal/HprofInMemoryIndex$a;->q:I

    .line 57
    .line 58
    .line 59
    invoke-virtual/range {p2 .. p2}, Lshark/HprofHeader;->e()Lshark/HprofVersion;

    .line 60
    move-result-object v3

    .line 61
    .line 62
    sget-object v4, Lshark/HprofVersion;->ANDROID:Lshark/HprofVersion;

    .line 63
    .line 64
    if-eq v3, v4, :cond_1

    .line 65
    .line 66
    const/16 v19, 0x1

    .line 67
    goto :goto_1

    .line 68
    .line 69
    :cond_1
    const/16 v19, 0x0

    .line 70
    .line 71
    :goto_1
    new-instance v3, Lshark/internal/ClassFieldsReader;

    .line 72
    .line 73
    iget v4, v0, Lshark/internal/HprofInMemoryIndex$a;->b:I

    .line 74
    .line 75
    move/from16 v16, v1

    .line 76
    .line 77
    iget-object v1, v0, Lshark/internal/HprofInMemoryIndex$a;->g:[B

    .line 78
    .line 79
    .line 80
    invoke-direct {v3, v4, v1}, Lshark/internal/ClassFieldsReader;-><init>(I[B)V

    .line 81
    .line 82
    iget v1, v0, Lshark/internal/HprofInMemoryIndex$a;->d:I

    .line 83
    .line 84
    const/16 v22, 0x0

    .line 85
    .line 86
    move/from16 v21, v1

    .line 87
    .line 88
    move/from16 v17, v2

    .line 89
    .line 90
    move-object/from16 v20, v3

    .line 91
    .line 92
    move/from16 v18, v14

    .line 93
    .line 94
    move-object/from16 v14, p1

    .line 95
    .line 96
    .line 97
    invoke-direct/range {v5 .. v22}, Lshark/internal/HprofInMemoryIndex;-><init>(ILshark/internal/hppc/LongObjectScatterMap;Lshark/internal/hppc/LongLongScatterMap;Lshark/internal/SortedBytesMap;Lshark/internal/SortedBytesMap;Lshark/internal/SortedBytesMap;Lshark/internal/SortedBytesMap;Ljava/util/List;Lshark/r;IIIIZLshark/internal/ClassFieldsReader;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 98
    return-object v5

    .line 99
    .line 100
    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 104
    .line 105
    const-string v2, "Read "

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    iget v2, v0, Lshark/internal/HprofInMemoryIndex$a;->h:I

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    const-string v2, " into fields bytes instead of expected "

    .line 116
    .line 117
    .line 118
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    iget-object v2, v0, Lshark/internal/HprofInMemoryIndex$a;->g:[B

    .line 121
    array-length v2, v2

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 128
    move-result-object v1

    .line 129
    .line 130
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 134
    move-result-object v1

    .line 135
    .line 136
    .line 137
    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 138
    throw v2
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
.end method

.method public final c(Lshark/HprofRecordReader;I)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    if-gt v0, p2, :cond_0

    .line 4
    .line 5
    :goto_0
    iget-object v1, p0, Lshark/internal/HprofInMemoryIndex$a;->g:[B

    .line 6
    .line 7
    iget v2, p0, Lshark/internal/HprofInMemoryIndex$a;->h:I

    .line 8
    .line 9
    add-int/lit8 v3, v2, 0x1

    .line 10
    .line 11
    iput v3, p0, Lshark/internal/HprofInMemoryIndex$a;->h:I

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Lshark/HprofRecordReader;->d()B

    .line 15
    move-result v3

    .line 16
    .line 17
    aput-byte v3, v1, v2

    .line 18
    .line 19
    if-eq v0, p2, :cond_0

    .line 20
    .line 21
    add-int/lit8 v0, v0, 0x1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-void
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

.method public final d()S
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lshark/internal/HprofInMemoryIndex$a;->g:[B

    .line 3
    .line 4
    iget v1, p0, Lshark/internal/HprofInMemoryIndex$a;->h:I

    .line 5
    .line 6
    add-int/lit8 v2, v1, -0x2

    .line 7
    .line 8
    aget-byte v2, v0, v2

    .line 9
    .line 10
    and-int/lit16 v2, v2, 0xff

    .line 11
    .line 12
    shl-int/lit8 v2, v2, 0x8

    .line 13
    .line 14
    add-int/lit8 v1, v1, -0x1

    .line 15
    .line 16
    aget-byte v0, v0, v1

    .line 17
    .line 18
    and-int/lit16 v0, v0, 0xff

    .line 19
    or-int/2addr v0, v2

    .line 20
    int-to-short v0, v0

    .line 21
    return v0
.end method
