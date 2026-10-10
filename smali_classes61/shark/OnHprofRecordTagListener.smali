.class public interface abstract Lshark/OnHprofRecordTagListener;
.super Ljava/lang/Object;
.source "OnHprofRecordTagListener.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lshark/OnHprofRecordTagListener$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0008f\u0018\u0000 \t2\u00020\u0001:\u0001\u000bJ\'\u0010\t\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000c"
    }
    d2 = {
        "Lshark/OnHprofRecordTagListener;",
        "",
        "Lshark/HprofRecordTag;",
        "tag",
        "",
        "length",
        "Lshark/HprofRecordReader;",
        "reader",
        "",
        "a",
        "(Lshark/HprofRecordTag;JLshark/HprofRecordReader;)V",
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
.field public static final a:Lshark/OnHprofRecordTagListener$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lshark/OnHprofRecordTagListener$Companion;->a:Lshark/OnHprofRecordTagListener$Companion;

    .line 3
    .line 4
    sput-object v0, Lshark/OnHprofRecordTagListener;->a:Lshark/OnHprofRecordTagListener$Companion;

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
.method public abstract a(Lshark/HprofRecordTag;JLshark/HprofRecordReader;)V
    .param p1    # Lshark/HprofRecordTag;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lshark/HprofRecordReader;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method
