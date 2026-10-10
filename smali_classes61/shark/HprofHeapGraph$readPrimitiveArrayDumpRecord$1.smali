.class final Lshark/HprofHeapGraph$readPrimitiveArrayDumpRecord$1;
.super Lkotlin/jvm/internal/Lambda;
.source "HprofHeapGraph.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lshark/HprofHeapGraph;->Q(JLshark/internal/h$d;)Lshark/l$b$c$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lshark/HprofRecordReader;",
        "Lshark/l$b$c$d;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lshark/HprofRecordReader;",
        "Lshark/l$b$c$d;",
        "invoke",
        "(Lshark/HprofRecordReader;)Lshark/l$b$c$d;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x4,
        0x1
    }
.end annotation


# static fields
.field public static final INSTANCE:Lshark/HprofHeapGraph$readPrimitiveArrayDumpRecord$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lshark/HprofHeapGraph$readPrimitiveArrayDumpRecord$1;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lshark/HprofHeapGraph$readPrimitiveArrayDumpRecord$1;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lshark/HprofHeapGraph$readPrimitiveArrayDumpRecord$1;->INSTANCE:Lshark/HprofHeapGraph$readPrimitiveArrayDumpRecord$1;

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
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 5
    return-void
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


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lshark/HprofRecordReader;

    invoke-virtual {p0, p1}, Lshark/HprofHeapGraph$readPrimitiveArrayDumpRecord$1;->invoke(Lshark/HprofRecordReader;)Lshark/l$b$c$d;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lshark/HprofRecordReader;)Lshark/l$b$c$d;
    .locals 0
    .param p1    # Lshark/HprofRecordReader;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 2
    invoke-virtual {p1}, Lshark/HprofRecordReader;->D()Lshark/l$b$c$d;

    move-result-object p1

    return-object p1
.end method
