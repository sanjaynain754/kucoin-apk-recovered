.class public final Lshark/OnHprofRecordTagListener$Companion;
.super Ljava/lang/Object;
.source "OnHprofRecordTagListener.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lshark/OnHprofRecordTagListener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J+\u0010\u0003\u001a\u00020\u00042 \u0008\u0004\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0006H\u0086\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lshark/OnHprofRecordTagListener$Companion;",
        "",
        "()V",
        "invoke",
        "Lshark/OnHprofRecordTagListener;",
        "block",
        "Lkotlin/Function3;",
        "Lshark/HprofRecordTag;",
        "",
        "Lshark/HprofRecordReader;",
        "",
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
.field public static final synthetic a:Lshark/OnHprofRecordTagListener$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lshark/OnHprofRecordTagListener$Companion;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lshark/OnHprofRecordTagListener$Companion;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lshark/OnHprofRecordTagListener$Companion;->a:Lshark/OnHprofRecordTagListener$Companion;

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
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    return-void
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


# virtual methods
.method public final invoke(Lkotlin/jvm/functions/Function3;)Lshark/OnHprofRecordTagListener;
    .locals 1
    .param p1    # Lkotlin/jvm/functions/Function3;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Lshark/HprofRecordTag;",
            "-",
            "Ljava/lang/Long;",
            "-",
            "Lshark/HprofRecordReader;",
            "Lkotlin/Unit;",
            ">;)",
            "Lshark/OnHprofRecordTagListener;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lshark/OnHprofRecordTagListener$Companion$a;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p1}, Lshark/OnHprofRecordTagListener$Companion$a;-><init>(Lkotlin/jvm/functions/Function3;)V

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
.end method
