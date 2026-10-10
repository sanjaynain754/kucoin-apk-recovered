.class public final Lshark/HprofRecordReader;
.super Ljava/lang/Object;
.source "HprofRecordReader.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lshark/HprofRecordReader$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00d4\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\r\n\u0002\u0010\t\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\n\n\u0002\u0008\u0004\n\u0002\u0010\u0016\n\u0002\u0008\u0002\n\u0002\u0010\u0018\n\u0002\u0008\u0002\n\u0002\u0010\u0019\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0014\n\u0002\u0008\u0002\n\u0002\u0010\u0013\n\u0002\u0008\u0002\n\u0002\u0010\u0017\n\u0002\u0008\u0002\n\u0002\u0010\u0015\n\u0002\u0008\u0004\n\u0002\u0010\u0005\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0012\n\u0002\u0008\u0002\n\u0002\u0010\u000c\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0002\u0008\u000f\u0018\u0000 }2\u00020\u0001:\u0002\u009e\u0001B\u0019\u0008\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\r\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e\u00a2\u0006\u0004\u0008\u001f\u0010 J\r\u0010\"\u001a\u00020!\u00a2\u0006\u0004\u0008\"\u0010#J\r\u0010%\u001a\u00020$\u00a2\u0006\u0004\u0008%\u0010&J\r\u0010(\u001a\u00020\'\u00a2\u0006\u0004\u0008(\u0010)J\r\u0010+\u001a\u00020*\u00a2\u0006\u0004\u0008+\u0010,J\r\u0010.\u001a\u00020-\u00a2\u0006\u0004\u0008.\u0010/J\r\u00101\u001a\u000200\u00a2\u0006\u0004\u00081\u00102J\r\u00104\u001a\u000203\u00a2\u0006\u0004\u00084\u00105J\r\u00107\u001a\u000206\u00a2\u0006\u0004\u00087\u00108J\r\u0010:\u001a\u000209\u00a2\u0006\u0004\u0008:\u0010;J\r\u0010=\u001a\u00020<\u00a2\u0006\u0004\u0008=\u0010>J\r\u0010@\u001a\u00020?\u00a2\u0006\u0004\u0008@\u0010AJ\r\u0010C\u001a\u00020B\u00a2\u0006\u0004\u0008C\u0010DJ\r\u0010F\u001a\u00020E\u00a2\u0006\u0004\u0008F\u0010GJ\r\u0010I\u001a\u00020H\u00a2\u0006\u0004\u0008I\u0010JJ\r\u0010K\u001a\u00020H\u00a2\u0006\u0004\u0008K\u0010JJ\r\u0010L\u001a\u00020H\u00a2\u0006\u0004\u0008L\u0010JJ\r\u0010M\u001a\u00020H\u00a2\u0006\u0004\u0008M\u0010JJ\r\u0010N\u001a\u00020H\u00a2\u0006\u0004\u0008N\u0010JJ\r\u0010O\u001a\u00020H\u00a2\u0006\u0004\u0008O\u0010JJ\r\u0010P\u001a\u00020H\u00a2\u0006\u0004\u0008P\u0010JJ\r\u0010Q\u001a\u00020H\u00a2\u0006\u0004\u0008Q\u0010JJ\r\u0010R\u001a\u00020H\u00a2\u0006\u0004\u0008R\u0010JJ\u0015\u0010T\u001a\u00020H2\u0006\u0010S\u001a\u00020\u0008\u00a2\u0006\u0004\u0008T\u0010UJ\u0015\u0010W\u001a\u00020H2\u0006\u0010S\u001a\u00020V\u00a2\u0006\u0004\u0008W\u0010XJ\r\u0010Y\u001a\u00020V\u00a2\u0006\u0004\u0008Y\u0010ZJ\r\u0010[\u001a\u00020\u0008\u00a2\u0006\u0004\u0008[\u0010\\J\u0015\u0010^\u001a\u00020]2\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008^\u0010_J\r\u0010a\u001a\u00020`\u00a2\u0006\u0004\u0008a\u0010bJ\r\u0010c\u001a\u00020\u0008\u00a2\u0006\u0004\u0008c\u0010\\J\u0015\u0010f\u001a\u00020e2\u0006\u0010d\u001a\u00020\u0008\u00a2\u0006\u0004\u0008f\u0010gJ\u0015\u0010i\u001a\u00020h2\u0006\u0010d\u001a\u00020\u0008\u00a2\u0006\u0004\u0008i\u0010jJ\u0015\u0010l\u001a\u00020k2\u0006\u0010d\u001a\u00020\u0008\u00a2\u0006\u0004\u0008l\u0010mJ\u001d\u0010q\u001a\u00020p2\u0006\u0010S\u001a\u00020\u00082\u0006\u0010o\u001a\u00020n\u00a2\u0006\u0004\u0008q\u0010rJ\u0015\u0010t\u001a\u00020s2\u0006\u0010d\u001a\u00020\u0008\u00a2\u0006\u0004\u0008t\u0010uJ\u0015\u0010w\u001a\u00020v2\u0006\u0010d\u001a\u00020\u0008\u00a2\u0006\u0004\u0008w\u0010xJ\u0015\u0010z\u001a\u00020y2\u0006\u0010d\u001a\u00020\u0008\u00a2\u0006\u0004\u0008z\u0010{J\u0015\u0010}\u001a\u00020|2\u0006\u0010d\u001a\u00020\u0008\u00a2\u0006\u0004\u0008}\u0010~J\u0015\u0010\u007f\u001a\u00020e2\u0006\u0010d\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u007f\u0010gJ\u000f\u0010\u0080\u0001\u001a\u00020V\u00a2\u0006\u0005\u0008\u0080\u0001\u0010ZJ\u0011\u0010\u0082\u0001\u001a\u00030\u0081\u0001\u00a2\u0006\u0006\u0008\u0082\u0001\u0010\u0083\u0001J\u0011\u0010\u0085\u0001\u001a\u00030\u0084\u0001\u00a2\u0006\u0006\u0008\u0085\u0001\u0010\u0086\u0001J\u0019\u0010\u0088\u0001\u001a\u00030\u0087\u00012\u0006\u0010S\u001a\u00020\u0008\u00a2\u0006\u0006\u0008\u0088\u0001\u0010\u0089\u0001J\u0011\u0010\u008b\u0001\u001a\u00030\u008a\u0001\u00a2\u0006\u0006\u0008\u008b\u0001\u0010\u008c\u0001J\u0011\u0010\u008e\u0001\u001a\u00030\u008d\u0001\u00a2\u0006\u0006\u0008\u008e\u0001\u0010\u008f\u0001J\u0011\u0010\u0091\u0001\u001a\u00030\u0090\u0001\u00a2\u0006\u0006\u0008\u0091\u0001\u0010\u0092\u0001J\u000f\u0010\u0093\u0001\u001a\u00020V\u00a2\u0006\u0005\u0008\u0093\u0001\u0010ZJ\u0018\u0010\u0094\u0001\u001a\u00020p2\u0006\u0010S\u001a\u00020V\u00a2\u0006\u0006\u0008\u0094\u0001\u0010\u0095\u0001J\u000f\u0010\u0096\u0001\u001a\u00020\u0008\u00a2\u0006\u0005\u0008\u0096\u0001\u0010\\R(\u0010\u0099\u0001\u001a\u00020V2\u0007\u0010\u0097\u0001\u001a\u00020V8\u0006@BX\u0086\u000e\u00a2\u0006\u000e\n\u0005\u0008\u0098\u0001\u0010\u001f\u001a\u0005\u0008\u0098\u0001\u0010ZR\u0016\u0010\u009a\u0001\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0085\u0001\u0010qR\u0016\u0010\u009c\u0001\u001a\u00020|8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008i\u0010\u009b\u0001R\u0016\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0082\u0001\u0010\u009d\u0001\u00a8\u0006\u009f\u0001"
    }
    d2 = {
        "Lshark/HprofRecordReader;",
        "",
        "Lshark/HprofHeader;",
        "header",
        "Lokio/BufferedSource;",
        "source",
        "<init>",
        "(Lshark/HprofHeader;Lokio/BufferedSource;)V",
        "",
        "type",
        "T",
        "(I)I",
        "Lshark/d$n;",
        "L",
        "()Lshark/d$n;",
        "Lshark/d$e;",
        "v",
        "()Lshark/d$e;",
        "Lshark/d$f;",
        "w",
        "()Lshark/d$f;",
        "Lshark/d$d;",
        "u",
        "()Lshark/d$d;",
        "Lshark/d$i;",
        "B",
        "()Lshark/d$i;",
        "Lshark/d$k;",
        "H",
        "()Lshark/d$k;",
        "Lshark/d$l;",
        "J",
        "()Lshark/d$l;",
        "Lshark/d$h;",
        "A",
        "()Lshark/d$h;",
        "Lshark/d$m;",
        "K",
        "()Lshark/d$m;",
        "Lshark/d$c;",
        "t",
        "()Lshark/d$c;",
        "Lshark/d$b;",
        "l",
        "()Lshark/d$b;",
        "Lshark/d$a;",
        "i",
        "()Lshark/d$a;",
        "Lshark/d$j;",
        "E",
        "()Lshark/d$j;",
        "Lshark/d$p;",
        "S",
        "()Lshark/d$p;",
        "Lshark/d$g;",
        "x",
        "()Lshark/d$g;",
        "Lshark/d$o;",
        "M",
        "()Lshark/d$o;",
        "Lshark/l$b$c$b;",
        "q",
        "()Lshark/l$b$c$b;",
        "Lshark/l$b$c$a;",
        "h",
        "()Lshark/l$b$c$a;",
        "Lshark/l$b$c$d;",
        "D",
        "()Lshark/l$b$c$d;",
        "Lshark/l$b$c$c;",
        "C",
        "()Lshark/l$b$c$c;",
        "",
        "Y",
        "()V",
        "W",
        "a0",
        "X",
        "c0",
        "Z",
        "d0",
        "e0",
        "b0",
        "byteCount",
        "U",
        "(I)V",
        "",
        "V",
        "(J)V",
        "O",
        "()J",
        "N",
        "()I",
        "Lshark/ValueHolder;",
        "R",
        "(I)Lshark/ValueHolder;",
        "",
        "F",
        "()S",
        "r",
        "arrayLength",
        "",
        "p",
        "(I)[J",
        "",
        "c",
        "(I)[Z",
        "",
        "g",
        "(I)[C",
        "Ljava/nio/charset/Charset;",
        "charset",
        "",
        "I",
        "(ILjava/nio/charset/Charset;)Ljava/lang/String;",
        "",
        "n",
        "(I)[F",
        "",
        "k",
        "(I)[D",
        "",
        "G",
        "(I)[S",
        "",
        "s",
        "(I)[I",
        "z",
        "y",
        "",
        "d",
        "()B",
        "",
        "b",
        "()Z",
        "",
        "e",
        "(I)[B",
        "",
        "f",
        "()C",
        "",
        "m",
        "()F",
        "",
        "j",
        "()D",
        "o",
        "Q",
        "(J)Ljava/lang/String;",
        "P",
        "<set-?>",
        "a",
        "bytesRead",
        "identifierByteSize",
        "[I",
        "typeSizes",
        "Lokio/BufferedSource;",
        "Companion",
        "shark-hprof"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x1
    }
.end annotation


# static fields
.field public static final e:I

.field public static final f:I

.field public static final g:I

.field public static final h:I

.field public static final i:I

.field public static final j:I

.field public static final k:I

.field public static final l:I

.field public static final m:I

.field public static final n:I

.field public static final o:I

.field public static final p:I

.field public static final q:I

.field public static final r:I

.field public static final s:Lshark/HprofRecordReader$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public a:J

.field public final b:I

.field public final c:[I

.field public final d:Lokio/BufferedSource;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    .line 2
    new-instance v0, Lshark/HprofRecordReader$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lshark/HprofRecordReader$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lshark/HprofRecordReader;->s:Lshark/HprofRecordReader$Companion;

    .line 9
    .line 10
    sget-object v0, Lshark/PrimitiveType;->BOOLEAN:Lshark/PrimitiveType;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lshark/PrimitiveType;->getByteSize()I

    .line 14
    move-result v1

    .line 15
    .line 16
    sput v1, Lshark/HprofRecordReader;->e:I

    .line 17
    .line 18
    sget-object v1, Lshark/PrimitiveType;->CHAR:Lshark/PrimitiveType;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Lshark/PrimitiveType;->getByteSize()I

    .line 22
    move-result v2

    .line 23
    .line 24
    sput v2, Lshark/HprofRecordReader;->f:I

    .line 25
    .line 26
    sget-object v2, Lshark/PrimitiveType;->BYTE:Lshark/PrimitiveType;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2}, Lshark/PrimitiveType;->getByteSize()I

    .line 30
    move-result v3

    .line 31
    .line 32
    sput v3, Lshark/HprofRecordReader;->g:I

    .line 33
    .line 34
    sget-object v3, Lshark/PrimitiveType;->SHORT:Lshark/PrimitiveType;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v3}, Lshark/PrimitiveType;->getByteSize()I

    .line 38
    move-result v4

    .line 39
    .line 40
    sput v4, Lshark/HprofRecordReader;->h:I

    .line 41
    .line 42
    sget-object v4, Lshark/PrimitiveType;->INT:Lshark/PrimitiveType;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v4}, Lshark/PrimitiveType;->getByteSize()I

    .line 46
    move-result v5

    .line 47
    .line 48
    sput v5, Lshark/HprofRecordReader;->i:I

    .line 49
    .line 50
    sget-object v5, Lshark/PrimitiveType;->LONG:Lshark/PrimitiveType;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v5}, Lshark/PrimitiveType;->getByteSize()I

    .line 54
    move-result v6

    .line 55
    .line 56
    sput v6, Lshark/HprofRecordReader;->j:I

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Lshark/PrimitiveType;->getHprofType()I

    .line 60
    move-result v0

    .line 61
    .line 62
    sput v0, Lshark/HprofRecordReader;->k:I

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1}, Lshark/PrimitiveType;->getHprofType()I

    .line 66
    move-result v0

    .line 67
    .line 68
    sput v0, Lshark/HprofRecordReader;->l:I

    .line 69
    .line 70
    sget-object v0, Lshark/PrimitiveType;->FLOAT:Lshark/PrimitiveType;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0}, Lshark/PrimitiveType;->getHprofType()I

    .line 74
    move-result v0

    .line 75
    .line 76
    sput v0, Lshark/HprofRecordReader;->m:I

    .line 77
    .line 78
    sget-object v0, Lshark/PrimitiveType;->DOUBLE:Lshark/PrimitiveType;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0}, Lshark/PrimitiveType;->getHprofType()I

    .line 82
    move-result v0

    .line 83
    .line 84
    sput v0, Lshark/HprofRecordReader;->n:I

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2}, Lshark/PrimitiveType;->getHprofType()I

    .line 88
    move-result v0

    .line 89
    .line 90
    sput v0, Lshark/HprofRecordReader;->o:I

    .line 91
    .line 92
    .line 93
    invoke-virtual {v3}, Lshark/PrimitiveType;->getHprofType()I

    .line 94
    move-result v0

    .line 95
    .line 96
    sput v0, Lshark/HprofRecordReader;->p:I

    .line 97
    .line 98
    .line 99
    invoke-virtual {v4}, Lshark/PrimitiveType;->getHprofType()I

    .line 100
    move-result v0

    .line 101
    .line 102
    sput v0, Lshark/HprofRecordReader;->q:I

    .line 103
    .line 104
    .line 105
    invoke-virtual {v5}, Lshark/PrimitiveType;->getHprofType()I

    .line 106
    move-result v0

    .line 107
    .line 108
    sput v0, Lshark/HprofRecordReader;->r:I

    .line 109
    return-void
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
    .line 121
    .line 122
    .line 123
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
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
.end method

.method public constructor <init>(Lshark/HprofHeader;Lokio/BufferedSource;)V
    .locals 4
    .param p1    # Lshark/HprofHeader;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lokio/BufferedSource;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p2, p0, Lshark/HprofRecordReader;->d:Lokio/BufferedSource;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lshark/HprofHeader;->c()I

    .line 9
    move-result p1

    .line 10
    .line 11
    iput p1, p0, Lshark/HprofRecordReader;->b:I

    .line 12
    .line 13
    sget-object p2, Lshark/PrimitiveType;->Companion:Lshark/PrimitiveType$Companion;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p2}, Lshark/PrimitiveType$Companion;->getByteSizeByHprofType()Ljava/util/Map;

    .line 17
    move-result-object p2

    .line 18
    const/4 v0, 0x2

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    .line 25
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    move-result-object p1

    .line 27
    .line 28
    .line 29
    invoke-static {v0, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 30
    move-result-object p1

    .line 31
    .line 32
    .line 33
    invoke-static {p2, p1}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Lkotlin/Pair;)Ljava/util/Map;

    .line 34
    move-result-object p1

    .line 35
    .line 36
    .line 37
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 38
    move-result-object p2

    .line 39
    .line 40
    .line 41
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->max(Ljava/lang/Iterable;)Ljava/lang/Comparable;

    .line 42
    move-result-object p2

    .line 43
    .line 44
    if-nez p2, :cond_0

    .line 45
    .line 46
    .line 47
    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    .line 48
    .line 49
    :cond_0
    check-cast p2, Ljava/lang/Number;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 53
    move-result p2

    .line 54
    .line 55
    add-int/lit8 p2, p2, 0x1

    .line 56
    .line 57
    new-array v0, p2, [I

    .line 58
    const/4 v1, 0x0

    .line 59
    move v2, v1

    .line 60
    .line 61
    :goto_0
    if-ge v2, p2, :cond_2

    .line 62
    .line 63
    .line 64
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 65
    move-result-object v3

    .line 66
    .line 67
    .line 68
    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    move-result-object v3

    .line 70
    .line 71
    check-cast v3, Ljava/lang/Integer;

    .line 72
    .line 73
    if-eqz v3, :cond_1

    .line 74
    .line 75
    .line 76
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 77
    move-result v3

    .line 78
    goto :goto_1

    .line 79
    :cond_1
    move v3, v1

    .line 80
    .line 81
    :goto_1
    aput v3, v0, v2

    .line 82
    .line 83
    add-int/lit8 v2, v2, 0x1

    .line 84
    goto :goto_0

    .line 85
    .line 86
    :cond_2
    iput-object v0, p0, Lshark/HprofRecordReader;->c:[I

    .line 87
    return-void
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
    .line 121
    .line 122
    .line 123
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
.end method


# virtual methods
.method public final A()Lshark/d$h;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lshark/d$h;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lshark/HprofRecordReader;->o()J

    .line 6
    move-result-wide v1

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1, v2}, Lshark/d$h;-><init>(J)V

    .line 10
    return-object v0
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

.method public final B()Lshark/d$i;
    .locals 4
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lshark/d$i;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lshark/HprofRecordReader;->o()J

    .line 6
    move-result-wide v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lshark/HprofRecordReader;->r()I

    .line 10
    move-result v3

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, v1, v2, v3}, Lshark/d$i;-><init>(JI)V

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final C()Lshark/l$b$c$c;
    .locals 7
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lshark/HprofRecordReader;->o()J

    .line 4
    move-result-wide v1

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lshark/HprofRecordReader;->r()I

    .line 8
    move-result v3

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lshark/HprofRecordReader;->r()I

    .line 12
    move-result v0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lshark/HprofRecordReader;->o()J

    .line 16
    move-result-wide v4

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v0}, Lshark/HprofRecordReader;->p(I)[J

    .line 20
    move-result-object v6

    .line 21
    .line 22
    new-instance v0, Lshark/l$b$c$c;

    .line 23
    .line 24
    .line 25
    invoke-direct/range {v0 .. v6}, Lshark/l$b$c$c;-><init>(JIJ[J)V

    .line 26
    return-object v0
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

.method public final D()Lshark/l$b$c$d;
    .locals 6
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lshark/HprofRecordReader;->o()J

    .line 4
    move-result-wide v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lshark/HprofRecordReader;->r()I

    .line 8
    move-result v2

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lshark/HprofRecordReader;->r()I

    .line 12
    move-result v3

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lshark/HprofRecordReader;->N()I

    .line 16
    move-result v4

    .line 17
    .line 18
    sget v5, Lshark/HprofRecordReader;->k:I

    .line 19
    .line 20
    if-ne v4, v5, :cond_0

    .line 21
    .line 22
    new-instance v4, Lshark/l$b$c$d$a;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v3}, Lshark/HprofRecordReader;->c(I)[Z

    .line 26
    move-result-object v3

    .line 27
    .line 28
    .line 29
    invoke-direct {v4, v0, v1, v2, v3}, Lshark/l$b$c$d$a;-><init>(JI[Z)V

    .line 30
    return-object v4

    .line 31
    .line 32
    :cond_0
    sget v5, Lshark/HprofRecordReader;->l:I

    .line 33
    .line 34
    if-ne v4, v5, :cond_1

    .line 35
    .line 36
    new-instance v4, Lshark/l$b$c$d$c;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, v3}, Lshark/HprofRecordReader;->g(I)[C

    .line 40
    move-result-object v3

    .line 41
    .line 42
    .line 43
    invoke-direct {v4, v0, v1, v2, v3}, Lshark/l$b$c$d$c;-><init>(JI[C)V

    .line 44
    return-object v4

    .line 45
    .line 46
    :cond_1
    sget v5, Lshark/HprofRecordReader;->m:I

    .line 47
    .line 48
    if-ne v4, v5, :cond_2

    .line 49
    .line 50
    new-instance v4, Lshark/l$b$c$d$e;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, v3}, Lshark/HprofRecordReader;->n(I)[F

    .line 54
    move-result-object v3

    .line 55
    .line 56
    .line 57
    invoke-direct {v4, v0, v1, v2, v3}, Lshark/l$b$c$d$e;-><init>(JI[F)V

    .line 58
    return-object v4

    .line 59
    .line 60
    :cond_2
    sget v5, Lshark/HprofRecordReader;->n:I

    .line 61
    .line 62
    if-ne v4, v5, :cond_3

    .line 63
    .line 64
    new-instance v4, Lshark/l$b$c$d$d;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0, v3}, Lshark/HprofRecordReader;->k(I)[D

    .line 68
    move-result-object v3

    .line 69
    .line 70
    .line 71
    invoke-direct {v4, v0, v1, v2, v3}, Lshark/l$b$c$d$d;-><init>(JI[D)V

    .line 72
    return-object v4

    .line 73
    .line 74
    :cond_3
    sget v5, Lshark/HprofRecordReader;->o:I

    .line 75
    .line 76
    if-ne v4, v5, :cond_4

    .line 77
    .line 78
    new-instance v4, Lshark/l$b$c$d$b;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, v3}, Lshark/HprofRecordReader;->e(I)[B

    .line 82
    move-result-object v3

    .line 83
    .line 84
    .line 85
    invoke-direct {v4, v0, v1, v2, v3}, Lshark/l$b$c$d$b;-><init>(JI[B)V

    .line 86
    return-object v4

    .line 87
    .line 88
    :cond_4
    sget v5, Lshark/HprofRecordReader;->p:I

    .line 89
    .line 90
    if-ne v4, v5, :cond_5

    .line 91
    .line 92
    new-instance v4, Lshark/l$b$c$d$h;

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0, v3}, Lshark/HprofRecordReader;->G(I)[S

    .line 96
    move-result-object v3

    .line 97
    .line 98
    .line 99
    invoke-direct {v4, v0, v1, v2, v3}, Lshark/l$b$c$d$h;-><init>(JI[S)V

    .line 100
    return-object v4

    .line 101
    .line 102
    :cond_5
    sget v5, Lshark/HprofRecordReader;->q:I

    .line 103
    .line 104
    if-ne v4, v5, :cond_6

    .line 105
    .line 106
    new-instance v4, Lshark/l$b$c$d$f;

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0, v3}, Lshark/HprofRecordReader;->s(I)[I

    .line 110
    move-result-object v3

    .line 111
    .line 112
    .line 113
    invoke-direct {v4, v0, v1, v2, v3}, Lshark/l$b$c$d$f;-><init>(JI[I)V

    .line 114
    return-object v4

    .line 115
    .line 116
    :cond_6
    sget v5, Lshark/HprofRecordReader;->r:I

    .line 117
    .line 118
    if-ne v4, v5, :cond_7

    .line 119
    .line 120
    new-instance v4, Lshark/l$b$c$d$g;

    .line 121
    .line 122
    .line 123
    invoke-virtual {p0, v3}, Lshark/HprofRecordReader;->z(I)[J

    .line 124
    move-result-object v3

    .line 125
    .line 126
    .line 127
    invoke-direct {v4, v0, v1, v2, v3}, Lshark/l$b$c$d$g;-><init>(JI[J)V

    .line 128
    return-object v4

    .line 129
    .line 130
    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 131
    .line 132
    new-instance v1, Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 136
    .line 137
    const-string v2, "Unexpected type "

    .line 138
    .line 139
    .line 140
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 147
    move-result-object v1

    .line 148
    .line 149
    .line 150
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 151
    throw v0
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
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
.end method

.method public final E()Lshark/d$j;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lshark/d$j;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lshark/HprofRecordReader;->o()J

    .line 6
    move-result-wide v1

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1, v2}, Lshark/d$j;-><init>(J)V

    .line 10
    return-object v0
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

.method public final F()S
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Lshark/HprofRecordReader;->a:J

    .line 3
    .line 4
    sget v2, Lshark/HprofRecordReader;->h:I

    .line 5
    int-to-long v2, v2

    .line 6
    add-long/2addr v0, v2

    .line 7
    .line 8
    iput-wide v0, p0, Lshark/HprofRecordReader;->a:J

    .line 9
    .line 10
    iget-object v0, p0, Lshark/HprofRecordReader;->d:Lokio/BufferedSource;

    .line 11
    .line 12
    .line 13
    invoke-interface {v0}, Lokio/BufferedSource;->readShort()S

    .line 14
    move-result v0

    .line 15
    return v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final G(I)[S
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-array v0, p1, [S

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    :goto_0
    if-ge v1, p1, :cond_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lshark/HprofRecordReader;->F()S

    .line 9
    move-result v2

    .line 10
    .line 11
    aput-short v2, v0, v1

    .line 12
    .line 13
    add-int/lit8 v1, v1, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return-object v0
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

.method public final H()Lshark/d$k;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lshark/d$k;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lshark/HprofRecordReader;->o()J

    .line 6
    move-result-wide v1

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1, v2}, Lshark/d$k;-><init>(J)V

    .line 10
    return-object v0
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

.method public final I(ILjava/nio/charset/Charset;)Ljava/lang/String;
    .locals 4
    .param p2    # Ljava/nio/charset/Charset;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-wide v0, p0, Lshark/HprofRecordReader;->a:J

    .line 3
    int-to-long v2, p1

    .line 4
    add-long/2addr v0, v2

    .line 5
    .line 6
    iput-wide v0, p0, Lshark/HprofRecordReader;->a:J

    .line 7
    .line 8
    iget-object p1, p0, Lshark/HprofRecordReader;->d:Lokio/BufferedSource;

    .line 9
    .line 10
    .line 11
    invoke-interface {p1, v2, v3, p2}, Lokio/BufferedSource;->readString(JLjava/nio/charset/Charset;)Ljava/lang/String;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    .line 15
    const-string/jumbo p2, "source.readString(byteCount.toLong(), charset)"

    .line 16
    .line 17
    .line 18
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    return-object p1
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

.method public final J()Lshark/d$l;
    .locals 4
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lshark/d$l;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lshark/HprofRecordReader;->o()J

    .line 6
    move-result-wide v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lshark/HprofRecordReader;->r()I

    .line 10
    move-result v3

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, v1, v2, v3}, Lshark/d$l;-><init>(JI)V

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final K()Lshark/d$m;
    .locals 5
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lshark/d$m;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lshark/HprofRecordReader;->o()J

    .line 6
    move-result-wide v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lshark/HprofRecordReader;->r()I

    .line 10
    move-result v3

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lshark/HprofRecordReader;->r()I

    .line 14
    move-result v4

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1, v2, v3, v4}, Lshark/d$m;-><init>(JII)V

    .line 18
    return-object v0
    .line 19
    .line 20
    .line 21
.end method

.method public final L()Lshark/d$n;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lshark/d$n;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lshark/HprofRecordReader;->o()J

    .line 6
    move-result-wide v1

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1, v2}, Lshark/d$n;-><init>(J)V

    .line 10
    return-object v0
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

.method public final M()Lshark/d$o;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lshark/d$o;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lshark/HprofRecordReader;->o()J

    .line 6
    move-result-wide v1

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1, v2}, Lshark/d$o;-><init>(J)V

    .line 10
    return-object v0
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

.method public final N()I
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lshark/HprofRecordReader;->d()B

    .line 4
    move-result v0

    .line 5
    .line 6
    and-int/lit16 v0, v0, 0xff

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

.method public final O()J
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lshark/HprofRecordReader;->r()I

    .line 4
    move-result v0

    .line 5
    int-to-long v0, v0

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    const-wide v2, 0xffffffffL

    .line 11
    and-long/2addr v0, v2

    .line 12
    return-wide v0
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

.method public final P()I
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lshark/HprofRecordReader;->F()S

    .line 4
    move-result v0

    .line 5
    .line 6
    .line 7
    const v1, 0xffff

    .line 8
    and-int/2addr v0, v1

    .line 9
    return v0
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

.method public final Q(J)Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-wide v0, p0, Lshark/HprofRecordReader;->a:J

    .line 3
    add-long/2addr v0, p1

    .line 4
    .line 5
    iput-wide v0, p0, Lshark/HprofRecordReader;->a:J

    .line 6
    .line 7
    iget-object v0, p0, Lshark/HprofRecordReader;->d:Lokio/BufferedSource;

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, p1, p2}, Lokio/BufferedSource;->readUtf8(J)Ljava/lang/String;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    .line 14
    const-string/jumbo p2, "source.readUtf8(byteCount)"

    .line 15
    .line 16
    .line 17
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    return-object p1
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

.method public final R(I)Lshark/ValueHolder;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const/4 v0, 0x2

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    new-instance p1, Lshark/ValueHolder$h;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lshark/HprofRecordReader;->o()J

    .line 9
    move-result-wide v0

    .line 10
    .line 11
    .line 12
    invoke-direct {p1, v0, v1}, Lshark/ValueHolder$h;-><init>(J)V

    .line 13
    return-object p1

    .line 14
    .line 15
    :cond_0
    sget v0, Lshark/HprofRecordReader;->k:I

    .line 16
    .line 17
    if-ne p1, v0, :cond_1

    .line 18
    .line 19
    new-instance p1, Lshark/ValueHolder$a;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lshark/HprofRecordReader;->b()Z

    .line 23
    move-result v0

    .line 24
    .line 25
    .line 26
    invoke-direct {p1, v0}, Lshark/ValueHolder$a;-><init>(Z)V

    .line 27
    return-object p1

    .line 28
    .line 29
    :cond_1
    sget v0, Lshark/HprofRecordReader;->l:I

    .line 30
    .line 31
    if-ne p1, v0, :cond_2

    .line 32
    .line 33
    new-instance p1, Lshark/ValueHolder$c;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lshark/HprofRecordReader;->f()C

    .line 37
    move-result v0

    .line 38
    .line 39
    .line 40
    invoke-direct {p1, v0}, Lshark/ValueHolder$c;-><init>(C)V

    .line 41
    return-object p1

    .line 42
    .line 43
    :cond_2
    sget v0, Lshark/HprofRecordReader;->m:I

    .line 44
    .line 45
    if-ne p1, v0, :cond_3

    .line 46
    .line 47
    new-instance p1, Lshark/ValueHolder$e;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Lshark/HprofRecordReader;->m()F

    .line 51
    move-result v0

    .line 52
    .line 53
    .line 54
    invoke-direct {p1, v0}, Lshark/ValueHolder$e;-><init>(F)V

    .line 55
    return-object p1

    .line 56
    .line 57
    :cond_3
    sget v0, Lshark/HprofRecordReader;->n:I

    .line 58
    .line 59
    if-ne p1, v0, :cond_4

    .line 60
    .line 61
    new-instance p1, Lshark/ValueHolder$d;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Lshark/HprofRecordReader;->j()D

    .line 65
    move-result-wide v0

    .line 66
    .line 67
    .line 68
    invoke-direct {p1, v0, v1}, Lshark/ValueHolder$d;-><init>(D)V

    .line 69
    return-object p1

    .line 70
    .line 71
    :cond_4
    sget v0, Lshark/HprofRecordReader;->o:I

    .line 72
    .line 73
    if-ne p1, v0, :cond_5

    .line 74
    .line 75
    new-instance p1, Lshark/ValueHolder$b;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0}, Lshark/HprofRecordReader;->d()B

    .line 79
    move-result v0

    .line 80
    .line 81
    .line 82
    invoke-direct {p1, v0}, Lshark/ValueHolder$b;-><init>(B)V

    .line 83
    return-object p1

    .line 84
    .line 85
    :cond_5
    sget v0, Lshark/HprofRecordReader;->p:I

    .line 86
    .line 87
    if-ne p1, v0, :cond_6

    .line 88
    .line 89
    new-instance p1, Lshark/ValueHolder$i;

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0}, Lshark/HprofRecordReader;->F()S

    .line 93
    move-result v0

    .line 94
    .line 95
    .line 96
    invoke-direct {p1, v0}, Lshark/ValueHolder$i;-><init>(S)V

    .line 97
    return-object p1

    .line 98
    .line 99
    :cond_6
    sget v0, Lshark/HprofRecordReader;->q:I

    .line 100
    .line 101
    if-ne p1, v0, :cond_7

    .line 102
    .line 103
    new-instance p1, Lshark/ValueHolder$f;

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0}, Lshark/HprofRecordReader;->r()I

    .line 107
    move-result v0

    .line 108
    .line 109
    .line 110
    invoke-direct {p1, v0}, Lshark/ValueHolder$f;-><init>(I)V

    .line 111
    return-object p1

    .line 112
    .line 113
    :cond_7
    sget v0, Lshark/HprofRecordReader;->r:I

    .line 114
    .line 115
    if-ne p1, v0, :cond_8

    .line 116
    .line 117
    new-instance p1, Lshark/ValueHolder$g;

    .line 118
    .line 119
    .line 120
    invoke-virtual {p0}, Lshark/HprofRecordReader;->y()J

    .line 121
    move-result-wide v0

    .line 122
    .line 123
    .line 124
    invoke-direct {p1, v0, v1}, Lshark/ValueHolder$g;-><init>(J)V

    .line 125
    return-object p1

    .line 126
    .line 127
    :cond_8
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 128
    .line 129
    new-instance v1, Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 133
    .line 134
    const-string v2, "Unknown type "

    .line 135
    .line 136
    .line 137
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 144
    move-result-object p1

    .line 145
    .line 146
    .line 147
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 148
    throw v0
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

.method public final S()Lshark/d$p;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lshark/d$p;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lshark/HprofRecordReader;->o()J

    .line 6
    move-result-wide v1

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1, v2}, Lshark/d$p;-><init>(J)V

    .line 10
    return-object v0
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

.method public final T(I)I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lshark/HprofRecordReader;->c:[I

    .line 3
    .line 4
    aget p1, v0, p1

    .line 5
    return p1
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

.method public final U(I)V
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Lshark/HprofRecordReader;->a:J

    .line 3
    int-to-long v2, p1

    .line 4
    add-long/2addr v0, v2

    .line 5
    .line 6
    iput-wide v0, p0, Lshark/HprofRecordReader;->a:J

    .line 7
    .line 8
    iget-object p1, p0, Lshark/HprofRecordReader;->d:Lokio/BufferedSource;

    .line 9
    .line 10
    .line 11
    invoke-interface {p1, v2, v3}, Lokio/BufferedSource;->skip(J)V

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
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final V(J)V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lshark/HprofRecordReader;->a:J

    .line 3
    add-long/2addr v0, p1

    .line 4
    .line 5
    iput-wide v0, p0, Lshark/HprofRecordReader;->a:J

    .line 6
    .line 7
    iget-object v0, p0, Lshark/HprofRecordReader;->d:Lokio/BufferedSource;

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, p1, p2}, Lokio/BufferedSource;->skip(J)V

    .line 11
    return-void
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

.method public final W()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lshark/HprofRecordReader;->P()I

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    :goto_0
    if-ge v1, v0, :cond_0

    .line 8
    .line 9
    sget-object v2, Lshark/PrimitiveType;->SHORT:Lshark/PrimitiveType;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v2}, Lshark/PrimitiveType;->getByteSize()I

    .line 13
    move-result v2

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v2}, Lshark/HprofRecordReader;->U(I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lshark/HprofRecordReader;->N()I

    .line 20
    move-result v2

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v2}, Lshark/HprofRecordReader;->T(I)I

    .line 24
    move-result v2

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v2}, Lshark/HprofRecordReader;->U(I)V

    .line 28
    .line 29
    add-int/lit8 v1, v1, 0x1

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    return-void
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

.method public final X()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lshark/HprofRecordReader;->P()I

    .line 4
    move-result v0

    .line 5
    .line 6
    iget v1, p0, Lshark/HprofRecordReader;->b:I

    .line 7
    .line 8
    add-int/lit8 v1, v1, 0x1

    .line 9
    mul-int/2addr v1, v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v1}, Lshark/HprofRecordReader;->U(I)V

    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final Y()V
    .locals 2

    .line 1
    .line 2
    sget v0, Lshark/HprofRecordReader;->i:I

    .line 3
    .line 4
    mul-int/lit8 v0, v0, 0x2

    .line 5
    .line 6
    iget v1, p0, Lshark/HprofRecordReader;->b:I

    .line 7
    .line 8
    mul-int/lit8 v1, v1, 0x7

    .line 9
    add-int/2addr v0, v1

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lshark/HprofRecordReader;->U(I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lshark/HprofRecordReader;->W()V

    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final Z()V
    .locals 5

    .line 1
    .line 2
    iget v0, p0, Lshark/HprofRecordReader;->b:I

    .line 3
    .line 4
    sget v1, Lshark/HprofRecordReader;->i:I

    .line 5
    .line 6
    add-int v2, v0, v1

    .line 7
    add-int/2addr v2, v0

    .line 8
    add-int/2addr v2, v0

    .line 9
    add-int/2addr v2, v0

    .line 10
    add-int/2addr v2, v0

    .line 11
    add-int/2addr v2, v0

    .line 12
    add-int/2addr v2, v0

    .line 13
    add-int/2addr v2, v1

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v2}, Lshark/HprofRecordReader;->U(I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lshark/HprofRecordReader;->P()I

    .line 20
    move-result v0

    .line 21
    const/4 v1, 0x0

    .line 22
    move v2, v1

    .line 23
    .line 24
    :goto_0
    if-ge v2, v0, :cond_0

    .line 25
    .line 26
    sget v3, Lshark/HprofRecordReader;->h:I

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v3}, Lshark/HprofRecordReader;->U(I)V

    .line 30
    .line 31
    iget-object v3, p0, Lshark/HprofRecordReader;->c:[I

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lshark/HprofRecordReader;->N()I

    .line 35
    move-result v4

    .line 36
    .line 37
    aget v3, v3, v4

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v3}, Lshark/HprofRecordReader;->U(I)V

    .line 41
    .line 42
    add-int/lit8 v2, v2, 0x1

    .line 43
    goto :goto_0

    .line 44
    .line 45
    .line 46
    :cond_0
    invoke-virtual {p0}, Lshark/HprofRecordReader;->P()I

    .line 47
    move-result v0

    .line 48
    .line 49
    :goto_1
    if-ge v1, v0, :cond_1

    .line 50
    .line 51
    iget v2, p0, Lshark/HprofRecordReader;->b:I

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, v2}, Lshark/HprofRecordReader;->U(I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Lshark/HprofRecordReader;->N()I

    .line 58
    move-result v2

    .line 59
    .line 60
    iget-object v3, p0, Lshark/HprofRecordReader;->c:[I

    .line 61
    .line 62
    aget v2, v3, v2

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, v2}, Lshark/HprofRecordReader;->U(I)V

    .line 66
    .line 67
    add-int/lit8 v1, v1, 0x1

    .line 68
    goto :goto_1

    .line 69
    .line 70
    .line 71
    :cond_1
    invoke-virtual {p0}, Lshark/HprofRecordReader;->P()I

    .line 72
    move-result v0

    .line 73
    .line 74
    iget v1, p0, Lshark/HprofRecordReader;->b:I

    .line 75
    .line 76
    sget v2, Lshark/HprofRecordReader;->g:I

    .line 77
    add-int/2addr v1, v2

    .line 78
    mul-int/2addr v0, v1

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, v0}, Lshark/HprofRecordReader;->U(I)V

    .line 82
    return-void
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

.method public final a()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lshark/HprofRecordReader;->a:J

    .line 3
    return-wide v0
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

.method public final a0()V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lshark/HprofRecordReader;->P()I

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    :goto_0
    if-ge v1, v0, :cond_1

    .line 8
    .line 9
    iget v2, p0, Lshark/HprofRecordReader;->b:I

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v2}, Lshark/HprofRecordReader;->U(I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lshark/HprofRecordReader;->N()I

    .line 16
    move-result v2

    .line 17
    const/4 v3, 0x2

    .line 18
    .line 19
    if-ne v2, v3, :cond_0

    .line 20
    .line 21
    iget v2, p0, Lshark/HprofRecordReader;->b:I

    .line 22
    goto :goto_1

    .line 23
    .line 24
    :cond_0
    sget-object v3, Lshark/PrimitiveType;->Companion:Lshark/PrimitiveType$Companion;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v3}, Lshark/PrimitiveType$Companion;->getByteSizeByHprofType()Ljava/util/Map;

    .line 28
    move-result-object v3

    .line 29
    .line 30
    .line 31
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    move-result-object v2

    .line 33
    .line 34
    .line 35
    invoke-static {v3, v2}, Lkotlin/collections/MapsKt;->getValue(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    move-result-object v2

    .line 37
    .line 38
    check-cast v2, Ljava/lang/Number;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 42
    move-result v2

    .line 43
    .line 44
    .line 45
    :goto_1
    invoke-virtual {p0, v2}, Lshark/HprofRecordReader;->U(I)V

    .line 46
    .line 47
    add-int/lit8 v1, v1, 0x1

    .line 48
    goto :goto_0

    .line 49
    :cond_1
    return-void
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

.method public final b()Z
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Lshark/HprofRecordReader;->a:J

    .line 3
    .line 4
    sget v2, Lshark/HprofRecordReader;->e:I

    .line 5
    int-to-long v2, v2

    .line 6
    add-long/2addr v0, v2

    .line 7
    .line 8
    iput-wide v0, p0, Lshark/HprofRecordReader;->a:J

    .line 9
    .line 10
    iget-object v0, p0, Lshark/HprofRecordReader;->d:Lokio/BufferedSource;

    .line 11
    .line 12
    .line 13
    invoke-interface {v0}, Lokio/BufferedSource;->readByte()B

    .line 14
    move-result v0

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    return v0
    .line 21
.end method

.method public final b0()V
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lshark/HprofRecordReader;->b:I

    .line 3
    add-int/2addr v0, v0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lshark/HprofRecordReader;->U(I)V

    .line 7
    return-void
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

.method public final c(I)[Z
    .locals 4
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-array v0, p1, [Z

    .line 3
    const/4 v1, 0x0

    .line 4
    move v2, v1

    .line 5
    .line 6
    :goto_0
    if-ge v2, p1, :cond_1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lshark/HprofRecordReader;->d()B

    .line 10
    move-result v3

    .line 11
    .line 12
    if-eqz v3, :cond_0

    .line 13
    const/4 v3, 0x1

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    move v3, v1

    .line 16
    .line 17
    :goto_1
    aput-boolean v3, v0, v2

    .line 18
    .line 19
    add-int/lit8 v2, v2, 0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    return-object v0
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

.method public final c0()V
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lshark/HprofRecordReader;->b:I

    .line 3
    .line 4
    sget v1, Lshark/HprofRecordReader;->i:I

    .line 5
    add-int/2addr v1, v0

    .line 6
    add-int/2addr v1, v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v1}, Lshark/HprofRecordReader;->U(I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lshark/HprofRecordReader;->r()I

    .line 13
    move-result v0

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lshark/HprofRecordReader;->U(I)V

    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final d()B
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Lshark/HprofRecordReader;->a:J

    .line 3
    .line 4
    sget v2, Lshark/HprofRecordReader;->g:I

    .line 5
    int-to-long v2, v2

    .line 6
    add-long/2addr v0, v2

    .line 7
    .line 8
    iput-wide v0, p0, Lshark/HprofRecordReader;->a:J

    .line 9
    .line 10
    iget-object v0, p0, Lshark/HprofRecordReader;->d:Lokio/BufferedSource;

    .line 11
    .line 12
    .line 13
    invoke-interface {v0}, Lokio/BufferedSource;->readByte()B

    .line 14
    move-result v0

    .line 15
    return v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final d0()V
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lshark/HprofRecordReader;->b:I

    .line 3
    .line 4
    sget v1, Lshark/HprofRecordReader;->i:I

    .line 5
    add-int/2addr v0, v1

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lshark/HprofRecordReader;->U(I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lshark/HprofRecordReader;->r()I

    .line 12
    move-result v0

    .line 13
    .line 14
    iget v1, p0, Lshark/HprofRecordReader;->b:I

    .line 15
    mul-int/2addr v0, v1

    .line 16
    add-int/2addr v1, v0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v1}, Lshark/HprofRecordReader;->U(I)V

    .line 20
    return-void
    .line 21
.end method

.method public final e(I)[B
    .locals 4
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-wide v0, p0, Lshark/HprofRecordReader;->a:J

    .line 3
    int-to-long v2, p1

    .line 4
    add-long/2addr v0, v2

    .line 5
    .line 6
    iput-wide v0, p0, Lshark/HprofRecordReader;->a:J

    .line 7
    .line 8
    iget-object p1, p0, Lshark/HprofRecordReader;->d:Lokio/BufferedSource;

    .line 9
    .line 10
    .line 11
    invoke-interface {p1, v2, v3}, Lokio/BufferedSource;->readByteArray(J)[B

    .line 12
    move-result-object p1

    .line 13
    .line 14
    .line 15
    const-string/jumbo v0, "source.readByteArray(byteCount.toLong())"

    .line 16
    .line 17
    .line 18
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    return-object p1
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

.method public final e0()V
    .locals 3

    .line 1
    .line 2
    iget v0, p0, Lshark/HprofRecordReader;->b:I

    .line 3
    .line 4
    sget v1, Lshark/HprofRecordReader;->i:I

    .line 5
    add-int/2addr v0, v1

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lshark/HprofRecordReader;->U(I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lshark/HprofRecordReader;->r()I

    .line 12
    move-result v0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lshark/HprofRecordReader;->N()I

    .line 16
    move-result v1

    .line 17
    .line 18
    iget-object v2, p0, Lshark/HprofRecordReader;->c:[I

    .line 19
    .line 20
    aget v1, v2, v1

    .line 21
    mul-int/2addr v0, v1

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v0}, Lshark/HprofRecordReader;->U(I)V

    .line 25
    return-void
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

.method public final f()C
    .locals 2

    .line 1
    .line 2
    sget v0, Lshark/HprofRecordReader;->f:I

    .line 3
    .line 4
    sget-object v1, Lkotlin/text/Charsets;->UTF_16BE:Ljava/nio/charset/Charset;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0, v1}, Lshark/HprofRecordReader;->I(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    .line 13
    move-result v0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final g(I)[C
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-array v0, p1, [C

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    :goto_0
    if-ge v1, p1, :cond_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lshark/HprofRecordReader;->f()C

    .line 9
    move-result v2

    .line 10
    .line 11
    aput-char v2, v0, v1

    .line 12
    .line 13
    add-int/lit8 v1, v1, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return-object v0
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

.method public final h()Lshark/l$b$c$a;
    .locals 21
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lshark/HprofRecordReader;->o()J

    .line 6
    move-result-wide v2

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lshark/HprofRecordReader;->r()I

    .line 10
    move-result v4

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lshark/HprofRecordReader;->o()J

    .line 14
    move-result-wide v5

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lshark/HprofRecordReader;->o()J

    .line 18
    move-result-wide v7

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lshark/HprofRecordReader;->o()J

    .line 22
    move-result-wide v9

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Lshark/HprofRecordReader;->o()J

    .line 26
    move-result-wide v11

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Lshark/HprofRecordReader;->o()J

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Lshark/HprofRecordReader;->o()J

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Lshark/HprofRecordReader;->r()I

    .line 36
    move-result v13

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Lshark/HprofRecordReader;->P()I

    .line 40
    move-result v1

    .line 41
    const/4 v15, 0x0

    .line 42
    .line 43
    :goto_0
    if-ge v15, v1, :cond_0

    .line 44
    .line 45
    sget v14, Lshark/HprofRecordReader;->h:I

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v14}, Lshark/HprofRecordReader;->U(I)V

    .line 49
    .line 50
    iget-object v14, v0, Lshark/HprofRecordReader;->c:[I

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Lshark/HprofRecordReader;->N()I

    .line 54
    move-result v17

    .line 55
    .line 56
    aget v14, v14, v17

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v14}, Lshark/HprofRecordReader;->U(I)V

    .line 60
    .line 61
    add-int/lit8 v15, v15, 0x1

    .line 62
    goto :goto_0

    .line 63
    .line 64
    .line 65
    :cond_0
    invoke-virtual {v0}, Lshark/HprofRecordReader;->P()I

    .line 66
    move-result v1

    .line 67
    .line 68
    new-instance v14, Ljava/util/ArrayList;

    .line 69
    .line 70
    .line 71
    invoke-direct {v14, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 72
    const/4 v15, 0x0

    .line 73
    .line 74
    :goto_1
    if-ge v15, v1, :cond_1

    .line 75
    .line 76
    move-wide/from16 v17, v2

    .line 77
    move v3, v1

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0}, Lshark/HprofRecordReader;->o()J

    .line 81
    move-result-wide v1

    .line 82
    .line 83
    move/from16 v19, v3

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0}, Lshark/HprofRecordReader;->N()I

    .line 87
    move-result v3

    .line 88
    .line 89
    move/from16 v20, v4

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, v3}, Lshark/HprofRecordReader;->R(I)Lshark/ValueHolder;

    .line 93
    move-result-object v4

    .line 94
    .line 95
    new-instance v0, Lshark/l$b$c$a$b;

    .line 96
    .line 97
    .line 98
    invoke-direct {v0, v1, v2, v3, v4}, Lshark/l$b$c$a$b;-><init>(JILshark/ValueHolder;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v14, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 102
    .line 103
    add-int/lit8 v15, v15, 0x1

    .line 104
    .line 105
    move-object/from16 v0, p0

    .line 106
    .line 107
    move-wide/from16 v2, v17

    .line 108
    .line 109
    move/from16 v1, v19

    .line 110
    .line 111
    move/from16 v4, v20

    .line 112
    goto :goto_1

    .line 113
    .line 114
    :cond_1
    move-wide/from16 v17, v2

    .line 115
    .line 116
    move/from16 v20, v4

    .line 117
    .line 118
    .line 119
    invoke-virtual/range {p0 .. p0}, Lshark/HprofRecordReader;->P()I

    .line 120
    move-result v0

    .line 121
    .line 122
    new-instance v15, Ljava/util/ArrayList;

    .line 123
    .line 124
    .line 125
    invoke-direct {v15, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 126
    const/4 v1, 0x0

    .line 127
    .line 128
    :goto_2
    if-ge v1, v0, :cond_2

    .line 129
    .line 130
    new-instance v2, Lshark/l$b$c$a$a;

    .line 131
    .line 132
    .line 133
    invoke-virtual/range {p0 .. p0}, Lshark/HprofRecordReader;->o()J

    .line 134
    move-result-wide v3

    .line 135
    .line 136
    move/from16 v16, v0

    .line 137
    .line 138
    .line 139
    invoke-virtual/range {p0 .. p0}, Lshark/HprofRecordReader;->N()I

    .line 140
    move-result v0

    .line 141
    .line 142
    .line 143
    invoke-direct {v2, v3, v4, v0}, Lshark/l$b$c$a$a;-><init>(JI)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v15, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 147
    .line 148
    add-int/lit8 v1, v1, 0x1

    .line 149
    .line 150
    move/from16 v0, v16

    .line 151
    goto :goto_2

    .line 152
    .line 153
    :cond_2
    new-instance v1, Lshark/l$b$c$a;

    .line 154
    .line 155
    move-wide/from16 v2, v17

    .line 156
    .line 157
    move/from16 v4, v20

    .line 158
    .line 159
    .line 160
    invoke-direct/range {v1 .. v15}, Lshark/l$b$c$a;-><init>(JIJJJJILjava/util/List;Ljava/util/List;)V

    .line 161
    return-object v1
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
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
.end method

.method public final i()Lshark/d$a;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lshark/d$a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lshark/HprofRecordReader;->o()J

    .line 6
    move-result-wide v1

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1, v2}, Lshark/d$a;-><init>(J)V

    .line 10
    return-object v0
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

.method public final j()D
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lkotlin/jvm/internal/DoubleCompanionObject;->INSTANCE:Lkotlin/jvm/internal/DoubleCompanionObject;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lshark/HprofRecordReader;->y()J

    .line 6
    move-result-wide v0

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 10
    move-result-wide v0

    .line 11
    return-wide v0
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

.method public final k(I)[D
    .locals 4
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-array v0, p1, [D

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    :goto_0
    if-ge v1, p1, :cond_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lshark/HprofRecordReader;->j()D

    .line 9
    move-result-wide v2

    .line 10
    .line 11
    aput-wide v2, v0, v1

    .line 12
    .line 13
    add-int/lit8 v1, v1, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return-object v0
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

.method public final l()Lshark/d$b;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lshark/d$b;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lshark/HprofRecordReader;->o()J

    .line 6
    move-result-wide v1

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1, v2}, Lshark/d$b;-><init>(J)V

    .line 10
    return-object v0
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

.method public final m()F
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lkotlin/jvm/internal/FloatCompanionObject;->INSTANCE:Lkotlin/jvm/internal/FloatCompanionObject;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lshark/HprofRecordReader;->r()I

    .line 6
    move-result v0

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 10
    move-result v0

    .line 11
    return v0
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

.method public final n(I)[F
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-array v0, p1, [F

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    :goto_0
    if-ge v1, p1, :cond_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lshark/HprofRecordReader;->m()F

    .line 9
    move-result v2

    .line 10
    .line 11
    aput v2, v0, v1

    .line 12
    .line 13
    add-int/lit8 v1, v1, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return-object v0
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

.method public final o()J
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lshark/HprofRecordReader;->b:I

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    if-eq v0, v1, :cond_3

    .line 6
    const/4 v1, 0x2

    .line 7
    .line 8
    if-eq v0, v1, :cond_2

    .line 9
    const/4 v1, 0x4

    .line 10
    .line 11
    if-eq v0, v1, :cond_1

    .line 12
    .line 13
    const/16 v1, 0x8

    .line 14
    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lshark/HprofRecordReader;->y()J

    .line 19
    move-result-wide v0

    .line 20
    return-wide v0

    .line 21
    .line 22
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 23
    .line 24
    const-string v1, "ID Length must be 1, 2, 4, or 8"

    .line 25
    .line 26
    .line 27
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 28
    throw v0

    .line 29
    .line 30
    .line 31
    :cond_1
    invoke-virtual {p0}, Lshark/HprofRecordReader;->r()I

    .line 32
    move-result v0

    .line 33
    :goto_0
    int-to-long v0, v0

    .line 34
    return-wide v0

    .line 35
    .line 36
    .line 37
    :cond_2
    invoke-virtual {p0}, Lshark/HprofRecordReader;->F()S

    .line 38
    move-result v0

    .line 39
    goto :goto_0

    .line 40
    .line 41
    .line 42
    :cond_3
    invoke-virtual {p0}, Lshark/HprofRecordReader;->d()B

    .line 43
    move-result v0

    .line 44
    goto :goto_0
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

.method public final p(I)[J
    .locals 4
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-array v0, p1, [J

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    :goto_0
    if-ge v1, p1, :cond_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lshark/HprofRecordReader;->o()J

    .line 9
    move-result-wide v2

    .line 10
    .line 11
    aput-wide v2, v0, v1

    .line 12
    .line 13
    add-int/lit8 v1, v1, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return-object v0
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

.method public final q()Lshark/l$b$c$b;
    .locals 7
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lshark/HprofRecordReader;->o()J

    .line 4
    move-result-wide v1

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lshark/HprofRecordReader;->r()I

    .line 8
    move-result v3

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lshark/HprofRecordReader;->o()J

    .line 12
    move-result-wide v4

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lshark/HprofRecordReader;->r()I

    .line 16
    move-result v0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v0}, Lshark/HprofRecordReader;->e(I)[B

    .line 20
    move-result-object v6

    .line 21
    .line 22
    new-instance v0, Lshark/l$b$c$b;

    .line 23
    .line 24
    .line 25
    invoke-direct/range {v0 .. v6}, Lshark/l$b$c$b;-><init>(JIJ[B)V

    .line 26
    return-object v0
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

.method public final r()I
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Lshark/HprofRecordReader;->a:J

    .line 3
    .line 4
    sget v2, Lshark/HprofRecordReader;->i:I

    .line 5
    int-to-long v2, v2

    .line 6
    add-long/2addr v0, v2

    .line 7
    .line 8
    iput-wide v0, p0, Lshark/HprofRecordReader;->a:J

    .line 9
    .line 10
    iget-object v0, p0, Lshark/HprofRecordReader;->d:Lokio/BufferedSource;

    .line 11
    .line 12
    .line 13
    invoke-interface {v0}, Lokio/BufferedSource;->readInt()I

    .line 14
    move-result v0

    .line 15
    return v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final s(I)[I
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-array v0, p1, [I

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    :goto_0
    if-ge v1, p1, :cond_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lshark/HprofRecordReader;->r()I

    .line 9
    move-result v2

    .line 10
    .line 11
    aput v2, v0, v1

    .line 12
    .line 13
    add-int/lit8 v1, v1, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return-object v0
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

.method public final t()Lshark/d$c;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lshark/d$c;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lshark/HprofRecordReader;->o()J

    .line 6
    move-result-wide v1

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1, v2}, Lshark/d$c;-><init>(J)V

    .line 10
    return-object v0
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

.method public final u()Lshark/d$d;
    .locals 5
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lshark/d$d;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lshark/HprofRecordReader;->o()J

    .line 6
    move-result-wide v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lshark/HprofRecordReader;->r()I

    .line 10
    move-result v3

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lshark/HprofRecordReader;->r()I

    .line 14
    move-result v4

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1, v2, v3, v4}, Lshark/d$d;-><init>(JII)V

    .line 18
    return-object v0
    .line 19
    .line 20
    .line 21
.end method

.method public final v()Lshark/d$e;
    .locals 5
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lshark/d$e;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lshark/HprofRecordReader;->o()J

    .line 6
    move-result-wide v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lshark/HprofRecordReader;->o()J

    .line 10
    move-result-wide v3

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, v1, v2, v3, v4}, Lshark/d$e;-><init>(JJ)V

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final w()Lshark/d$f;
    .locals 5
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lshark/d$f;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lshark/HprofRecordReader;->o()J

    .line 6
    move-result-wide v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lshark/HprofRecordReader;->r()I

    .line 10
    move-result v3

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lshark/HprofRecordReader;->r()I

    .line 14
    move-result v4

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1, v2, v3, v4}, Lshark/d$f;-><init>(JII)V

    .line 18
    return-object v0
    .line 19
    .line 20
    .line 21
.end method

.method public final x()Lshark/d$g;
    .locals 5
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lshark/d$g;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lshark/HprofRecordReader;->o()J

    .line 6
    move-result-wide v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lshark/HprofRecordReader;->r()I

    .line 10
    move-result v3

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lshark/HprofRecordReader;->r()I

    .line 14
    move-result v4

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1, v2, v3, v4}, Lshark/d$g;-><init>(JII)V

    .line 18
    return-object v0
    .line 19
    .line 20
    .line 21
.end method

.method public final y()J
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Lshark/HprofRecordReader;->a:J

    .line 3
    .line 4
    sget v2, Lshark/HprofRecordReader;->j:I

    .line 5
    int-to-long v2, v2

    .line 6
    add-long/2addr v0, v2

    .line 7
    .line 8
    iput-wide v0, p0, Lshark/HprofRecordReader;->a:J

    .line 9
    .line 10
    iget-object v0, p0, Lshark/HprofRecordReader;->d:Lokio/BufferedSource;

    .line 11
    .line 12
    .line 13
    invoke-interface {v0}, Lokio/BufferedSource;->readLong()J

    .line 14
    move-result-wide v0

    .line 15
    return-wide v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final z(I)[J
    .locals 4
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-array v0, p1, [J

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    :goto_0
    if-ge v1, p1, :cond_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lshark/HprofRecordReader;->y()J

    .line 9
    move-result-wide v2

    .line 10
    .line 11
    aput-wide v2, v0, v1

    .line 12
    .line 13
    add-int/lit8 v1, v1, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return-object v0
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
