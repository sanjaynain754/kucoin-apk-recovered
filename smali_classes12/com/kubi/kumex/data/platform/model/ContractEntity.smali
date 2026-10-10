.class public final Lcom/kubi/kumex/data/platform/model/ContractEntity;
.super Ljava/lang/Object;
.source "ContractEntity.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000G\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0010\t\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0017\n\u0002\u0010\u0008\n\u0003\u0008\u00cf\u0001\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u00cf\u0005\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\r\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\r\u0012\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0017\u0012\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0017\u0012\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0017\u0012\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0017\u0012\n\u0008\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0017\u0012\n\u0008\u0002\u0010 \u001a\u0004\u0018\u00010\u0017\u0012\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010\u0017\u0012\n\u0008\u0002\u0010\"\u001a\u0004\u0018\u00010\u0017\u0012\n\u0008\u0002\u0010#\u001a\u0004\u0018\u00010\u0017\u0012\n\u0008\u0002\u0010$\u001a\u0004\u0018\u00010\u0017\u0012\n\u0008\u0002\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010&\u001a\u0004\u0018\u00010\r\u0012\n\u0008\u0002\u0010\'\u001a\u0004\u0018\u00010\u0017\u0012\n\u0008\u0002\u0010(\u001a\u0004\u0018\u00010\u0017\u0012\n\u0008\u0002\u0010)\u001a\u0004\u0018\u00010\u0017\u0012\n\u0008\u0002\u0010*\u001a\u0004\u0018\u00010\u0017\u0012\n\u0008\u0002\u0010+\u001a\u0004\u0018\u00010\u0017\u0012\n\u0008\u0002\u0010,\u001a\u0004\u0018\u00010\u0017\u0012\u0008\u0008\u0002\u0010-\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010.\u001a\u00020/\u0012\u0008\u0008\u0002\u00100\u001a\u00020\u0005\u0012\n\u0008\u0002\u00101\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u00102\u001a\u0004\u0018\u00010\u0017\u0012\n\u0008\u0002\u00103\u001a\u0004\u0018\u00010\u0017\u0012\n\u0008\u0002\u00104\u001a\u0004\u0018\u00010\u0017\u0012\n\u0008\u0002\u00105\u001a\u0004\u0018\u00010\u0017\u0012\n\u0008\u0002\u00106\u001a\u0004\u0018\u00010\u0017\u0012\n\u0008\u0002\u00107\u001a\u0004\u0018\u00010\u0017\u0012\n\u0008\u0002\u00108\u001a\u0004\u0018\u00010\u0017\u0012\n\u0008\u0002\u00109\u001a\u0004\u0018\u00010\u0017\u0012\n\u0008\u0002\u0010:\u001a\u0004\u0018\u00010\u0017\u0012\n\u0008\u0002\u0010;\u001a\u0004\u0018\u00010\r\u0012\n\u0008\u0002\u0010<\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010=\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010>\u001a\u0004\u0018\u00010\r\u0012\n\u0008\u0002\u0010?\u001a\u0004\u0018\u00010\u0017\u0012\n\u0008\u0002\u0010@\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010A\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010B\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010C\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008D\u0010EJ\u0007\u0010\u00b9\u0001\u001a\u00020\u0005J\u0007\u0010\u00ba\u0001\u001a\u00020\u0005J\u0007\u0010\u00bb\u0001\u001a\u00020\u0005J\t\u0010\u00bc\u0001\u001a\u00020\u0005H\u0007J\u000c\u0010\u00bd\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\n\u0010\u00be\u0001\u001a\u00020\u0005H\u00c6\u0003J\u000c\u0010\u00bf\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000c\u0010\u00c0\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000c\u0010\u00c1\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000c\u0010\u00c2\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000c\u0010\u00c3\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000c\u0010\u00c4\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\n\u0010\u00c5\u0001\u001a\u00020\rH\u00c6\u0003J\n\u0010\u00c6\u0001\u001a\u00020\rH\u00c6\u0003J\n\u0010\u00c7\u0001\u001a\u00020\rH\u00c6\u0003J\u000c\u0010\u00c8\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\n\u0010\u00c9\u0001\u001a\u00020\rH\u00c6\u0003J\u000c\u0010\u00ca\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000c\u0010\u00cb\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000c\u0010\u00cc\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000c\u0010\u00cd\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000c\u0010\u00ce\u0001\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003J\n\u0010\u00cf\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u00d0\u0001\u001a\u00020\u0005H\u00c6\u0003J\u000c\u0010\u00d1\u0001\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003J\u000c\u0010\u00d2\u0001\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003J\u000c\u0010\u00d3\u0001\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003J\u000c\u0010\u00d4\u0001\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003J\u000c\u0010\u00d5\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000c\u0010\u00d6\u0001\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003J\u000c\u0010\u00d7\u0001\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003J\u000c\u0010\u00d8\u0001\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003J\u000c\u0010\u00d9\u0001\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003J\u000c\u0010\u00da\u0001\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003J\u000c\u0010\u00db\u0001\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003J\u000c\u0010\u00dc\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0012\u0010\u00dd\u0001\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0003\u0010\u008c\u0001J\u000c\u0010\u00de\u0001\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003J\u000c\u0010\u00df\u0001\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003J\u000c\u0010\u00e0\u0001\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003J\u000c\u0010\u00e1\u0001\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003J\u000c\u0010\u00e2\u0001\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003J\u000c\u0010\u00e3\u0001\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003J\n\u0010\u00e4\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u00e5\u0001\u001a\u00020/H\u00c6\u0003J\n\u0010\u00e6\u0001\u001a\u00020\u0005H\u00c6\u0003J\u000c\u0010\u00e7\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000c\u0010\u00e8\u0001\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003J\u000c\u0010\u00e9\u0001\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003J\u000c\u0010\u00ea\u0001\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003J\u000c\u0010\u00eb\u0001\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003J\u000c\u0010\u00ec\u0001\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003J\u000c\u0010\u00ed\u0001\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003J\u000c\u0010\u00ee\u0001\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003J\u000c\u0010\u00ef\u0001\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003J\u000c\u0010\u00f0\u0001\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003J\u0012\u0010\u00f1\u0001\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0003\u0010\u008c\u0001J\u0012\u0010\u00f2\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0003\u0010\u00b0\u0001J\u000c\u0010\u00f3\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0012\u0010\u00f4\u0001\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0003\u0010\u008c\u0001J\u000c\u0010\u00f5\u0001\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003J\u000c\u0010\u00f6\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000c\u0010\u00f7\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000c\u0010\u00f8\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000c\u0010\u00f9\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u00d8\u0005\u0010\u00fa\u0001\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\u0008\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\r2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0011\u001a\u00020\r2\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u00052\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00172\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00172\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00172\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00172\n\u0008\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00172\n\u0008\u0002\u0010 \u001a\u0004\u0018\u00010\u00172\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010\u00172\n\u0008\u0002\u0010\"\u001a\u0004\u0018\u00010\u00172\n\u0008\u0002\u0010#\u001a\u0004\u0018\u00010\u00172\n\u0008\u0002\u0010$\u001a\u0004\u0018\u00010\u00172\n\u0008\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010&\u001a\u0004\u0018\u00010\r2\n\u0008\u0002\u0010\'\u001a\u0004\u0018\u00010\u00172\n\u0008\u0002\u0010(\u001a\u0004\u0018\u00010\u00172\n\u0008\u0002\u0010)\u001a\u0004\u0018\u00010\u00172\n\u0008\u0002\u0010*\u001a\u0004\u0018\u00010\u00172\n\u0008\u0002\u0010+\u001a\u0004\u0018\u00010\u00172\n\u0008\u0002\u0010,\u001a\u0004\u0018\u00010\u00172\u0008\u0008\u0002\u0010-\u001a\u00020\u00052\u0008\u0008\u0002\u0010.\u001a\u00020/2\u0008\u0008\u0002\u00100\u001a\u00020\u00052\n\u0008\u0002\u00101\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u00102\u001a\u0004\u0018\u00010\u00172\n\u0008\u0002\u00103\u001a\u0004\u0018\u00010\u00172\n\u0008\u0002\u00104\u001a\u0004\u0018\u00010\u00172\n\u0008\u0002\u00105\u001a\u0004\u0018\u00010\u00172\n\u0008\u0002\u00106\u001a\u0004\u0018\u00010\u00172\n\u0008\u0002\u00107\u001a\u0004\u0018\u00010\u00172\n\u0008\u0002\u00108\u001a\u0004\u0018\u00010\u00172\n\u0008\u0002\u00109\u001a\u0004\u0018\u00010\u00172\n\u0008\u0002\u0010:\u001a\u0004\u0018\u00010\u00172\n\u0008\u0002\u0010;\u001a\u0004\u0018\u00010\r2\n\u0008\u0002\u0010<\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010=\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010>\u001a\u0004\u0018\u00010\r2\n\u0008\u0002\u0010?\u001a\u0004\u0018\u00010\u00172\n\u0008\u0002\u0010@\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010A\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010B\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010C\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0003\u0010\u00fb\u0001J\u0007\u0010\u00fc\u0001\u001a\u00020/J\u0016\u0010\u00fd\u0001\u001a\u00020\u00052\n\u0010\u00fe\u0001\u001a\u0005\u0018\u00010\u00ff\u0001H\u00d6\u0003J\n\u0010\u0080\u0002\u001a\u00020/H\u00d6\u0001J\n\u0010\u0081\u0002\u001a\u00020\u0003H\u00d6\u0001J\u001b\u0010\u0082\u0002\u001a\u00030\u0083\u00022\u0008\u0010\u0084\u0002\u001a\u00030\u0085\u00022\u0007\u0010\u0086\u0002\u001a\u00020/R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008F\u0010G\"\u0004\u0008H\u0010IR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0004\u0010J\"\u0004\u0008K\u0010LR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008M\u0010G\"\u0004\u0008N\u0010IR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008O\u0010G\"\u0004\u0008P\u0010IR\u001c\u0010\u0008\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008Q\u0010G\"\u0004\u0008R\u0010IR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008S\u0010G\"\u0004\u0008T\u0010IR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008U\u0010G\"\u0004\u0008V\u0010IR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008W\u0010G\"\u0004\u0008X\u0010IR\u001a\u0010\u000c\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008Y\u0010Z\"\u0004\u0008[\u0010\\R\u001a\u0010\u000e\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008]\u0010Z\"\u0004\u0008^\u0010\\R\u001a\u0010\u000f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008_\u0010Z\"\u0004\u0008`\u0010\\R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008a\u0010G\"\u0004\u0008b\u0010IR\u001a\u0010\u0011\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008c\u0010Z\"\u0004\u0008d\u0010\\R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008e\u0010G\"\u0004\u0008f\u0010IR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008g\u0010G\"\u0004\u0008h\u0010IR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008i\u0010G\"\u0004\u0008j\u0010IR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008k\u0010G\"\u0004\u0008l\u0010IR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008m\u0010n\"\u0004\u0008o\u0010pR\u001a\u0010\u0018\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0018\u0010J\"\u0004\u0008q\u0010LR\u001a\u0010\u0019\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0019\u0010J\"\u0004\u0008r\u0010LR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008s\u0010n\"\u0004\u0008t\u0010pR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008u\u0010n\"\u0004\u0008v\u0010pR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008w\u0010n\"\u0004\u0008x\u0010pR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008y\u0010n\"\u0004\u0008z\u0010pR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008{\u0010G\"\u0004\u0008|\u0010IR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008}\u0010n\"\u0004\u0008~\u0010pR\u001d\u0010 \u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u000f\n\u0000\u001a\u0004\u0008\u007f\u0010n\"\u0005\u0008\u0080\u0001\u0010pR\u001e\u0010!\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\u0008\u0081\u0001\u0010n\"\u0005\u0008\u0082\u0001\u0010pR\u001e\u0010\"\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\u0008\u0083\u0001\u0010n\"\u0005\u0008\u0084\u0001\u0010pR\u001e\u0010#\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\u0008\u0085\u0001\u0010n\"\u0005\u0008\u0086\u0001\u0010pR\u001e\u0010$\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\u0008\u0087\u0001\u0010n\"\u0005\u0008\u0088\u0001\u0010pR\u001e\u0010%\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\u0008\u0089\u0001\u0010G\"\u0005\u0008\u008a\u0001\u0010IR#\u0010&\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u0015\n\u0003\u0010\u008f\u0001\u001a\u0006\u0008\u008b\u0001\u0010\u008c\u0001\"\u0006\u0008\u008d\u0001\u0010\u008e\u0001R\u001e\u0010\'\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\u0008\u0090\u0001\u0010n\"\u0005\u0008\u0091\u0001\u0010pR\u001e\u0010(\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\u0008\u0092\u0001\u0010n\"\u0005\u0008\u0093\u0001\u0010pR\u001e\u0010)\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\u0008\u0094\u0001\u0010n\"\u0005\u0008\u0095\u0001\u0010pR\u001e\u0010*\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\u0008\u0096\u0001\u0010n\"\u0005\u0008\u0097\u0001\u0010pR\u001e\u0010+\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\u0008\u0098\u0001\u0010n\"\u0005\u0008\u0099\u0001\u0010pR\u001e\u0010,\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\u0008\u009a\u0001\u0010n\"\u0005\u0008\u009b\u0001\u0010pR\u001c\u0010-\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\u0008\u009c\u0001\u0010J\"\u0005\u0008\u009d\u0001\u0010LR\u001e\u0010.\u001a\u00020/X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\u0008\u009e\u0001\u0010\u009f\u0001\"\u0006\u0008\u00a0\u0001\u0010\u00a1\u0001R\u001b\u00100\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000f\n\u0000\u001a\u0004\u00080\u0010J\"\u0005\u0008\u00a2\u0001\u0010LR\u001e\u00101\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\u0008\u00a3\u0001\u0010G\"\u0005\u0008\u00a4\u0001\u0010IR\u0014\u00102\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00a5\u0001\u0010nR\u0014\u00103\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00a6\u0001\u0010nR\u0014\u00104\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00a7\u0001\u0010nR\u0014\u00105\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00a8\u0001\u0010nR\u0014\u00106\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00a9\u0001\u0010nR\u0014\u00107\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00aa\u0001\u0010nR\u0014\u00108\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00ab\u0001\u0010nR\u0014\u00109\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00ac\u0001\u0010nR\u0014\u0010:\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00ad\u0001\u0010nR\u0018\u0010;\u001a\u0004\u0018\u00010\r\u00a2\u0006\r\n\u0003\u0010\u008f\u0001\u001a\u0006\u0008\u00ae\u0001\u0010\u008c\u0001R\u0018\u0010<\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\r\n\u0003\u0010\u00b1\u0001\u001a\u0006\u0008\u00af\u0001\u0010\u00b0\u0001R\u0014\u0010=\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00b2\u0001\u0010GR\u0018\u0010>\u001a\u0004\u0018\u00010\r\u00a2\u0006\r\n\u0003\u0010\u008f\u0001\u001a\u0006\u0008\u00b3\u0001\u0010\u008c\u0001R\u0014\u0010?\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00b4\u0001\u0010nR\u0014\u0010@\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00b5\u0001\u0010GR\u0014\u0010A\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00b6\u0001\u0010GR\u0014\u0010B\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00b7\u0001\u0010GR\u0014\u0010C\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u00b8\u0001\u0010G\u00a8\u0006\u0087\u0002"
    }
    d2 = {
        "Lcom/kubi/kumex/data/platform/model/ContractEntity;",
        "Landroid/os/Parcelable;",
        "type",
        "",
        "isInverse",
        "",
        "symbol",
        "rootSymbol",
        "baseCurrency",
        "displayBaseCurrency",
        "quoteCurrency",
        "status",
        "createdAt",
        "",
        "expireDate",
        "updatedAt",
        "fairMethod",
        "firstOpenDate",
        "fundingBaseSymbol",
        "fundingQuoteSymbol",
        "fundingRateSymbol",
        "indexSymbol",
        "initialMargin",
        "Ljava/math/BigDecimal;",
        "isDeleverage",
        "isQuanto",
        "lotSize",
        "maintainMargin",
        "makerFeeRate",
        "makerFixFee",
        "markMethod",
        "maxOrderQty",
        "indexPriceTickSize",
        "maxPrice",
        "maxRiskLimit",
        "minRiskLimit",
        "riskStep",
        "settleCurrency",
        "settleDate",
        "settlementFee",
        "takerFeeRate",
        "takerFixFee",
        "tickSize",
        "multiplier",
        "maxLeverage",
        "supportGridTrading",
        "stepRiskLimitStatus",
        "",
        "isTrialFunds",
        "spotCurrency",
        "k",
        "m",
        "f",
        "mmrLimit",
        "mmrLevConstant",
        "crossRiskLimit",
        "adjustK",
        "adjustM",
        "adjustMmrLevConstant",
        "adjustActiveTime",
        "supportCross",
        "marketStage",
        "preMarketToPerpDate",
        "marketMaxOrderQty",
        "marketType",
        "assetClass",
        "subMarketType",
        "imgUrl",
        "<init>",
        "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;ZZLjava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZIZLjava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "getType",
        "()Ljava/lang/String;",
        "setType",
        "(Ljava/lang/String;)V",
        "()Z",
        "setInverse",
        "(Z)V",
        "getSymbol",
        "setSymbol",
        "getRootSymbol",
        "setRootSymbol",
        "getBaseCurrency",
        "setBaseCurrency",
        "getDisplayBaseCurrency",
        "setDisplayBaseCurrency",
        "getQuoteCurrency",
        "setQuoteCurrency",
        "getStatus",
        "setStatus",
        "getCreatedAt",
        "()J",
        "setCreatedAt",
        "(J)V",
        "getExpireDate",
        "setExpireDate",
        "getUpdatedAt",
        "setUpdatedAt",
        "getFairMethod",
        "setFairMethod",
        "getFirstOpenDate",
        "setFirstOpenDate",
        "getFundingBaseSymbol",
        "setFundingBaseSymbol",
        "getFundingQuoteSymbol",
        "setFundingQuoteSymbol",
        "getFundingRateSymbol",
        "setFundingRateSymbol",
        "getIndexSymbol",
        "setIndexSymbol",
        "getInitialMargin",
        "()Ljava/math/BigDecimal;",
        "setInitialMargin",
        "(Ljava/math/BigDecimal;)V",
        "setDeleverage",
        "setQuanto",
        "getLotSize",
        "setLotSize",
        "getMaintainMargin",
        "setMaintainMargin",
        "getMakerFeeRate",
        "setMakerFeeRate",
        "getMakerFixFee",
        "setMakerFixFee",
        "getMarkMethod",
        "setMarkMethod",
        "getMaxOrderQty",
        "setMaxOrderQty",
        "getIndexPriceTickSize",
        "setIndexPriceTickSize",
        "getMaxPrice",
        "setMaxPrice",
        "getMaxRiskLimit",
        "setMaxRiskLimit",
        "getMinRiskLimit",
        "setMinRiskLimit",
        "getRiskStep",
        "setRiskStep",
        "getSettleCurrency",
        "setSettleCurrency",
        "getSettleDate",
        "()Ljava/lang/Long;",
        "setSettleDate",
        "(Ljava/lang/Long;)V",
        "Ljava/lang/Long;",
        "getSettlementFee",
        "setSettlementFee",
        "getTakerFeeRate",
        "setTakerFeeRate",
        "getTakerFixFee",
        "setTakerFixFee",
        "getTickSize",
        "setTickSize",
        "getMultiplier",
        "setMultiplier",
        "getMaxLeverage",
        "setMaxLeverage",
        "getSupportGridTrading",
        "setSupportGridTrading",
        "getStepRiskLimitStatus",
        "()I",
        "setStepRiskLimitStatus",
        "(I)V",
        "setTrialFunds",
        "getSpotCurrency",
        "setSpotCurrency",
        "getK",
        "getM",
        "getF",
        "getMmrLimit",
        "getMmrLevConstant",
        "getCrossRiskLimit",
        "getAdjustK",
        "getAdjustM",
        "getAdjustMmrLevConstant",
        "getAdjustActiveTime",
        "getSupportCross",
        "()Ljava/lang/Boolean;",
        "Ljava/lang/Boolean;",
        "getMarketStage",
        "getPreMarketToPerpDate",
        "getMarketMaxOrderQty",
        "getMarketType",
        "getAssetClass",
        "getSubMarketType",
        "getImgUrl",
        "isPreMarket",
        "isStock",
        "isUsStock",
        "isUsStockMarket",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "component16",
        "component17",
        "component18",
        "component19",
        "component20",
        "component21",
        "component22",
        "component23",
        "component24",
        "component25",
        "component26",
        "component27",
        "component28",
        "component29",
        "component30",
        "component31",
        "component32",
        "component33",
        "component34",
        "component35",
        "component36",
        "component37",
        "component38",
        "component39",
        "component40",
        "component41",
        "component42",
        "component43",
        "component44",
        "component45",
        "component46",
        "component47",
        "component48",
        "component49",
        "component50",
        "component51",
        "component52",
        "component53",
        "component54",
        "component55",
        "component56",
        "component57",
        "component58",
        "component59",
        "component60",
        "component61",
        "copy",
        "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;ZZLjava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZIZLjava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/kumex/data/platform/model/ContractEntity;",
        "describeContents",
        "equals",
        "other",
        "",
        "hashCode",
        "toString",
        "writeToParcel",
        "",
        "dest",
        "Landroid/os/Parcel;",
        "flags",
        "KumexApi_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/kubi/kumex/data/platform/model/ContractEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private final adjustActiveTime:Ljava/lang/Long;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final adjustK:Ljava/math/BigDecimal;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final adjustM:Ljava/math/BigDecimal;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final adjustMmrLevConstant:Ljava/math/BigDecimal;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final assetClass:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private baseCurrency:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private createdAt:J

.field private final crossRiskLimit:Ljava/math/BigDecimal;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private displayBaseCurrency:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private expireDate:J

.field private final f:Ljava/math/BigDecimal;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private fairMethod:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private firstOpenDate:J

.field private fundingBaseSymbol:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private fundingQuoteSymbol:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private fundingRateSymbol:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final imgUrl:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private indexPriceTickSize:Ljava/math/BigDecimal;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private indexSymbol:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private initialMargin:Ljava/math/BigDecimal;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private isDeleverage:Z

.field private isInverse:Z

.field private isQuanto:Z

.field private isTrialFunds:Z

.field private final k:Ljava/math/BigDecimal;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private lotSize:Ljava/math/BigDecimal;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final m:Ljava/math/BigDecimal;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private maintainMargin:Ljava/math/BigDecimal;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private makerFeeRate:Ljava/math/BigDecimal;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private makerFixFee:Ljava/math/BigDecimal;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private markMethod:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final marketMaxOrderQty:Ljava/math/BigDecimal;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final marketStage:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final marketType:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private maxLeverage:Ljava/math/BigDecimal;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private maxOrderQty:Ljava/math/BigDecimal;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private maxPrice:Ljava/math/BigDecimal;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private maxRiskLimit:Ljava/math/BigDecimal;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private minRiskLimit:Ljava/math/BigDecimal;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final mmrLevConstant:Ljava/math/BigDecimal;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final mmrLimit:Ljava/math/BigDecimal;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private multiplier:Ljava/math/BigDecimal;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final preMarketToPerpDate:Ljava/lang/Long;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private quoteCurrency:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private riskStep:Ljava/math/BigDecimal;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private rootSymbol:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private settleCurrency:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private settleDate:Ljava/lang/Long;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private settlementFee:Ljava/math/BigDecimal;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private spotCurrency:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private status:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private stepRiskLimitStatus:I

.field private final subMarketType:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final supportCross:Ljava/lang/Boolean;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private supportGridTrading:Z

.field private symbol:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private takerFeeRate:Ljava/math/BigDecimal;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private takerFixFee:Ljava/math/BigDecimal;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private tickSize:Ljava/math/BigDecimal;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private type:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private updatedAt:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/kumex/data/platform/model/ContractEntity$a;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/kumex/data/platform/model/ContractEntity$a;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->CREATOR:Landroid/os/Parcelable$Creator;

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

.method public constructor <init>()V
    .locals 69

    .line 1
    const v67, 0x1fffffff

    const/16 v68, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const-wide/16 v11, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const/16 v62, 0x0

    const/16 v63, 0x0

    const/16 v64, 0x0

    const/16 v65, 0x0

    const/16 v66, -0x1

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v68}, Lcom/kubi/kumex/data/platform/model/ContractEntity;-><init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;ZZLjava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZIZLjava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;ZZLjava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZIZLjava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p15    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p18    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p19    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p20    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p21    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p22    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p25    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p26    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p27    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p28    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p29    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p30    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p31    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p32    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p33    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p34    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p35    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p36    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p37    # Ljava/lang/Long;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p38    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p39    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p40    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p41    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p42    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p43    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p47    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p48    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p49    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p50    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p51    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p52    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p53    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p54    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p55    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p56    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p57    # Ljava/lang/Long;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p58    # Ljava/lang/Boolean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p59    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p60    # Ljava/lang/Long;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p61    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p62    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p63    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p64    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p65    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->type:Ljava/lang/String;

    .line 4
    iput-boolean p2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->isInverse:Z

    .line 5
    iput-object p3, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->symbol:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->rootSymbol:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->baseCurrency:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->displayBaseCurrency:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->quoteCurrency:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->status:Ljava/lang/String;

    .line 11
    iput-wide p9, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->createdAt:J

    .line 12
    iput-wide p11, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->expireDate:J

    .line 13
    iput-wide p13, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->updatedAt:J

    .line 14
    iput-object p15, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->fairMethod:Ljava/lang/String;

    move-wide/from16 p1, p16

    .line 15
    iput-wide p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->firstOpenDate:J

    move-object/from16 p1, p18

    .line 16
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->fundingBaseSymbol:Ljava/lang/String;

    move-object/from16 p1, p19

    .line 17
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->fundingQuoteSymbol:Ljava/lang/String;

    move-object/from16 p1, p20

    .line 18
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->fundingRateSymbol:Ljava/lang/String;

    move-object/from16 p1, p21

    .line 19
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->indexSymbol:Ljava/lang/String;

    move-object/from16 p1, p22

    .line 20
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->initialMargin:Ljava/math/BigDecimal;

    move/from16 p1, p23

    .line 21
    iput-boolean p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->isDeleverage:Z

    move/from16 p1, p24

    .line 22
    iput-boolean p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->isQuanto:Z

    move-object/from16 p1, p25

    .line 23
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->lotSize:Ljava/math/BigDecimal;

    move-object/from16 p1, p26

    .line 24
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->maintainMargin:Ljava/math/BigDecimal;

    move-object/from16 p1, p27

    .line 25
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->makerFeeRate:Ljava/math/BigDecimal;

    move-object/from16 p1, p28

    .line 26
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->makerFixFee:Ljava/math/BigDecimal;

    move-object/from16 p1, p29

    .line 27
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->markMethod:Ljava/lang/String;

    move-object/from16 p1, p30

    .line 28
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->maxOrderQty:Ljava/math/BigDecimal;

    move-object/from16 p1, p31

    .line 29
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->indexPriceTickSize:Ljava/math/BigDecimal;

    move-object/from16 p1, p32

    .line 30
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->maxPrice:Ljava/math/BigDecimal;

    move-object/from16 p1, p33

    .line 31
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->maxRiskLimit:Ljava/math/BigDecimal;

    move-object/from16 p1, p34

    .line 32
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->minRiskLimit:Ljava/math/BigDecimal;

    move-object/from16 p1, p35

    .line 33
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->riskStep:Ljava/math/BigDecimal;

    move-object/from16 p1, p36

    .line 34
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->settleCurrency:Ljava/lang/String;

    move-object/from16 p1, p37

    .line 35
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->settleDate:Ljava/lang/Long;

    move-object/from16 p1, p38

    .line 36
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->settlementFee:Ljava/math/BigDecimal;

    move-object/from16 p1, p39

    .line 37
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->takerFeeRate:Ljava/math/BigDecimal;

    move-object/from16 p1, p40

    .line 38
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->takerFixFee:Ljava/math/BigDecimal;

    move-object/from16 p1, p41

    .line 39
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->tickSize:Ljava/math/BigDecimal;

    move-object/from16 p1, p42

    .line 40
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->multiplier:Ljava/math/BigDecimal;

    move-object/from16 p1, p43

    .line 41
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->maxLeverage:Ljava/math/BigDecimal;

    move/from16 p1, p44

    .line 42
    iput-boolean p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->supportGridTrading:Z

    move/from16 p1, p45

    .line 43
    iput p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->stepRiskLimitStatus:I

    move/from16 p1, p46

    .line 44
    iput-boolean p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->isTrialFunds:Z

    move-object/from16 p1, p47

    .line 45
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->spotCurrency:Ljava/lang/String;

    move-object/from16 p1, p48

    .line 46
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->k:Ljava/math/BigDecimal;

    move-object/from16 p1, p49

    .line 47
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->m:Ljava/math/BigDecimal;

    move-object/from16 p1, p50

    .line 48
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->f:Ljava/math/BigDecimal;

    move-object/from16 p1, p51

    .line 49
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->mmrLimit:Ljava/math/BigDecimal;

    move-object/from16 p1, p52

    .line 50
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->mmrLevConstant:Ljava/math/BigDecimal;

    move-object/from16 p1, p53

    .line 51
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->crossRiskLimit:Ljava/math/BigDecimal;

    move-object/from16 p1, p54

    .line 52
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->adjustK:Ljava/math/BigDecimal;

    move-object/from16 p1, p55

    .line 53
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->adjustM:Ljava/math/BigDecimal;

    move-object/from16 p1, p56

    .line 54
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->adjustMmrLevConstant:Ljava/math/BigDecimal;

    move-object/from16 p1, p57

    .line 55
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->adjustActiveTime:Ljava/lang/Long;

    move-object/from16 p1, p58

    .line 56
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->supportCross:Ljava/lang/Boolean;

    move-object/from16 p1, p59

    .line 57
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->marketStage:Ljava/lang/String;

    move-object/from16 p1, p60

    .line 58
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->preMarketToPerpDate:Ljava/lang/Long;

    move-object/from16 p1, p61

    .line 59
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->marketMaxOrderQty:Ljava/math/BigDecimal;

    move-object/from16 p1, p62

    .line 60
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->marketType:Ljava/lang/String;

    move-object/from16 p1, p63

    .line 61
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->assetClass:Ljava/lang/String;

    move-object/from16 p1, p64

    .line 62
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->subMarketType:Ljava/lang/String;

    move-object/from16 p1, p65

    .line 63
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->imgUrl:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;ZZLjava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZIZLjava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 57

    move/from16 v0, p66

    move/from16 v1, p67

    and-int/lit8 v2, v0, 0x1

    if-eqz v2, :cond_0

    .line 64
    const-string v2, "FFWCSX"

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v5, v0, 0x4

    if-eqz v5, :cond_2

    const/4 v5, 0x0

    goto :goto_2

    :cond_2
    move-object/from16 v5, p3

    :goto_2
    and-int/lit8 v7, v0, 0x8

    if-eqz v7, :cond_3

    const/4 v7, 0x0

    goto :goto_3

    :cond_3
    move-object/from16 v7, p4

    :goto_3
    and-int/lit8 v8, v0, 0x10

    if-eqz v8, :cond_4

    const/4 v8, 0x0

    goto :goto_4

    :cond_4
    move-object/from16 v8, p5

    :goto_4
    and-int/lit8 v9, v0, 0x20

    if-eqz v9, :cond_5

    const/4 v9, 0x0

    goto :goto_5

    :cond_5
    move-object/from16 v9, p6

    :goto_5
    and-int/lit8 v10, v0, 0x40

    if-eqz v10, :cond_6

    const/4 v10, 0x0

    goto :goto_6

    :cond_6
    move-object/from16 v10, p7

    :goto_6
    and-int/lit16 v11, v0, 0x80

    if-eqz v11, :cond_7

    const/4 v11, 0x0

    goto :goto_7

    :cond_7
    move-object/from16 v11, p8

    :goto_7
    and-int/lit16 v12, v0, 0x100

    const-wide/16 v13, 0x0

    if-eqz v12, :cond_8

    move-wide v15, v13

    goto :goto_8

    :cond_8
    move-wide/from16 v15, p9

    :goto_8
    and-int/lit16 v12, v0, 0x200

    if-eqz v12, :cond_9

    move-wide/from16 v17, v13

    goto :goto_9

    :cond_9
    move-wide/from16 v17, p11

    :goto_9
    and-int/lit16 v12, v0, 0x400

    if-eqz v12, :cond_a

    move-wide/from16 v19, v13

    goto :goto_a

    :cond_a
    move-wide/from16 v19, p13

    :goto_a
    and-int/lit16 v12, v0, 0x800

    if-eqz v12, :cond_b

    const/4 v12, 0x0

    goto :goto_b

    :cond_b
    move-object/from16 v12, p15

    :goto_b
    and-int/lit16 v4, v0, 0x1000

    if-eqz v4, :cond_c

    goto :goto_c

    :cond_c
    move-wide/from16 v13, p16

    :goto_c
    and-int/lit16 v4, v0, 0x2000

    if-eqz v4, :cond_d

    const/4 v4, 0x0

    goto :goto_d

    :cond_d
    move-object/from16 v4, p18

    :goto_d
    and-int/lit16 v6, v0, 0x4000

    if-eqz v6, :cond_e

    const/4 v6, 0x0

    goto :goto_e

    :cond_e
    move-object/from16 v6, p19

    :goto_e
    const v21, 0x8000

    and-int v22, v0, v21

    if-eqz v22, :cond_f

    const/16 v22, 0x0

    goto :goto_f

    :cond_f
    move-object/from16 v22, p20

    :goto_f
    const/high16 v23, 0x10000

    and-int v24, v0, v23

    if-eqz v24, :cond_10

    const/16 v24, 0x0

    goto :goto_10

    :cond_10
    move-object/from16 v24, p21

    :goto_10
    const/high16 v25, 0x20000

    and-int v26, v0, v25

    if-eqz v26, :cond_11

    const/16 v26, 0x0

    goto :goto_11

    :cond_11
    move-object/from16 v26, p22

    :goto_11
    const/high16 v27, 0x40000

    and-int v28, v0, v27

    if-eqz v28, :cond_12

    const/16 v28, 0x0

    goto :goto_12

    :cond_12
    move/from16 v28, p23

    :goto_12
    const/high16 v29, 0x80000

    and-int v29, v0, v29

    if-eqz v29, :cond_13

    const/16 v29, 0x0

    goto :goto_13

    :cond_13
    move/from16 v29, p24

    :goto_13
    const/high16 v30, 0x100000

    and-int v30, v0, v30

    if-eqz v30, :cond_14

    const/16 v30, 0x0

    goto :goto_14

    :cond_14
    move-object/from16 v30, p25

    :goto_14
    const/high16 v31, 0x200000

    and-int v31, v0, v31

    if-eqz v31, :cond_15

    const/16 v31, 0x0

    goto :goto_15

    :cond_15
    move-object/from16 v31, p26

    :goto_15
    const/high16 v32, 0x400000

    and-int v32, v0, v32

    if-eqz v32, :cond_16

    const/16 v32, 0x0

    goto :goto_16

    :cond_16
    move-object/from16 v32, p27

    :goto_16
    const/high16 v33, 0x800000

    and-int v33, v0, v33

    if-eqz v33, :cond_17

    const/16 v33, 0x0

    goto :goto_17

    :cond_17
    move-object/from16 v33, p28

    :goto_17
    const/high16 v34, 0x1000000

    and-int v34, v0, v34

    if-eqz v34, :cond_18

    const/16 v34, 0x0

    goto :goto_18

    :cond_18
    move-object/from16 v34, p29

    :goto_18
    const/high16 v35, 0x2000000

    and-int v35, v0, v35

    if-eqz v35, :cond_19

    const/16 v35, 0x0

    goto :goto_19

    :cond_19
    move-object/from16 v35, p30

    :goto_19
    const/high16 v36, 0x4000000

    and-int v36, v0, v36

    if-eqz v36, :cond_1a

    .line 65
    new-instance v0, Ljava/math/BigDecimal;

    move-object/from16 p68, v2

    const-string v2, "0.01"

    invoke-direct {v0, v2}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    goto :goto_1a

    :cond_1a
    move-object/from16 p68, v2

    move-object/from16 v0, p31

    :goto_1a
    const/high16 v2, 0x8000000

    and-int v2, p66, v2

    if-eqz v2, :cond_1b

    const/4 v2, 0x0

    goto :goto_1b

    :cond_1b
    move-object/from16 v2, p32

    :goto_1b
    const/high16 v36, 0x10000000

    and-int v36, p66, v36

    if-eqz v36, :cond_1c

    const/16 v36, 0x0

    goto :goto_1c

    :cond_1c
    move-object/from16 v36, p33

    :goto_1c
    const/high16 v37, 0x20000000

    and-int v37, p66, v37

    if-eqz v37, :cond_1d

    const/16 v37, 0x0

    goto :goto_1d

    :cond_1d
    move-object/from16 v37, p34

    :goto_1d
    const/high16 v38, 0x40000000    # 2.0f

    and-int v38, p66, v38

    if-eqz v38, :cond_1e

    const/16 v38, 0x0

    goto :goto_1e

    :cond_1e
    move-object/from16 v38, p35

    :goto_1e
    const/high16 v39, -0x80000000

    and-int v39, p66, v39

    if-eqz v39, :cond_1f

    const/16 v39, 0x0

    goto :goto_1f

    :cond_1f
    move-object/from16 v39, p36

    :goto_1f
    and-int/lit8 v40, v1, 0x1

    if-eqz v40, :cond_20

    const/16 v40, 0x0

    goto :goto_20

    :cond_20
    move-object/from16 v40, p37

    :goto_20
    and-int/lit8 v41, v1, 0x2

    if-eqz v41, :cond_21

    const/16 v41, 0x0

    goto :goto_21

    :cond_21
    move-object/from16 v41, p38

    :goto_21
    and-int/lit8 v42, v1, 0x4

    if-eqz v42, :cond_22

    const/16 v42, 0x0

    goto :goto_22

    :cond_22
    move-object/from16 v42, p39

    :goto_22
    and-int/lit8 v43, v1, 0x8

    if-eqz v43, :cond_23

    const/16 v43, 0x0

    goto :goto_23

    :cond_23
    move-object/from16 v43, p40

    :goto_23
    and-int/lit8 v44, v1, 0x10

    if-eqz v44, :cond_24

    const/16 v44, 0x0

    goto :goto_24

    :cond_24
    move-object/from16 v44, p41

    :goto_24
    and-int/lit8 v45, v1, 0x20

    if-eqz v45, :cond_25

    const/16 v45, 0x0

    goto :goto_25

    :cond_25
    move-object/from16 v45, p42

    :goto_25
    and-int/lit8 v46, v1, 0x40

    if-eqz v46, :cond_26

    const/16 v46, 0x0

    goto :goto_26

    :cond_26
    move-object/from16 v46, p43

    :goto_26
    move-object/from16 p3, v0

    and-int/lit16 v0, v1, 0x80

    if-eqz v0, :cond_27

    const/4 v0, 0x0

    goto :goto_27

    :cond_27
    move/from16 v0, p44

    :goto_27
    move/from16 p4, v0

    and-int/lit16 v0, v1, 0x100

    if-eqz v0, :cond_28

    const/4 v0, 0x0

    goto :goto_28

    :cond_28
    move/from16 v0, p45

    :goto_28
    move/from16 p5, v0

    and-int/lit16 v0, v1, 0x200

    if-eqz v0, :cond_29

    const/4 v0, 0x0

    goto :goto_29

    :cond_29
    move/from16 v0, p46

    :goto_29
    move/from16 p1, v0

    and-int/lit16 v0, v1, 0x400

    if-eqz v0, :cond_2a

    const/4 v0, 0x0

    goto :goto_2a

    :cond_2a
    move-object/from16 v0, p47

    :goto_2a
    move-object/from16 p6, v0

    and-int/lit16 v0, v1, 0x800

    if-eqz v0, :cond_2b

    const/4 v0, 0x0

    goto :goto_2b

    :cond_2b
    move-object/from16 v0, p48

    :goto_2b
    move-object/from16 p7, v0

    and-int/lit16 v0, v1, 0x1000

    if-eqz v0, :cond_2c

    const/4 v0, 0x0

    goto :goto_2c

    :cond_2c
    move-object/from16 v0, p49

    :goto_2c
    move-object/from16 p8, v0

    and-int/lit16 v0, v1, 0x2000

    if-eqz v0, :cond_2d

    const/4 v0, 0x0

    goto :goto_2d

    :cond_2d
    move-object/from16 v0, p50

    :goto_2d
    move-object/from16 p9, v0

    and-int/lit16 v0, v1, 0x4000

    if-eqz v0, :cond_2e

    const/4 v0, 0x0

    goto :goto_2e

    :cond_2e
    move-object/from16 v0, p51

    :goto_2e
    and-int v21, v1, v21

    if-eqz v21, :cond_2f

    const/16 v21, 0x0

    goto :goto_2f

    :cond_2f
    move-object/from16 v21, p52

    :goto_2f
    and-int v23, v1, v23

    if-eqz v23, :cond_30

    const/16 v23, 0x0

    goto :goto_30

    :cond_30
    move-object/from16 v23, p53

    :goto_30
    and-int v25, v1, v25

    if-eqz v25, :cond_31

    const/16 v25, 0x0

    goto :goto_31

    :cond_31
    move-object/from16 v25, p54

    :goto_31
    and-int v27, v1, v27

    if-eqz v27, :cond_32

    const/16 v27, 0x0

    goto :goto_32

    :cond_32
    move-object/from16 v27, p55

    :goto_32
    const/high16 v47, 0x80000

    and-int v47, v1, v47

    if-eqz v47, :cond_33

    const/16 v47, 0x0

    goto :goto_33

    :cond_33
    move-object/from16 v47, p56

    :goto_33
    const/high16 v48, 0x100000

    and-int v48, v1, v48

    if-eqz v48, :cond_34

    const/16 v48, 0x0

    goto :goto_34

    :cond_34
    move-object/from16 v48, p57

    :goto_34
    const/high16 v49, 0x200000

    and-int v49, v1, v49

    if-eqz v49, :cond_35

    const/16 v49, 0x0

    goto :goto_35

    :cond_35
    move-object/from16 v49, p58

    :goto_35
    const/high16 v50, 0x400000

    and-int v50, v1, v50

    if-eqz v50, :cond_36

    const/16 v50, 0x0

    goto :goto_36

    :cond_36
    move-object/from16 v50, p59

    :goto_36
    const/high16 v51, 0x800000

    and-int v51, v1, v51

    if-eqz v51, :cond_37

    const/16 v51, 0x0

    goto :goto_37

    :cond_37
    move-object/from16 v51, p60

    :goto_37
    const/high16 v52, 0x1000000

    and-int v52, v1, v52

    if-eqz v52, :cond_38

    const/16 v52, 0x0

    goto :goto_38

    :cond_38
    move-object/from16 v52, p61

    :goto_38
    const/high16 v53, 0x2000000

    and-int v53, v1, v53

    if-eqz v53, :cond_39

    const/16 v53, 0x0

    goto :goto_39

    :cond_39
    move-object/from16 v53, p62

    :goto_39
    const/high16 v54, 0x4000000

    and-int v54, v1, v54

    if-eqz v54, :cond_3a

    const/16 v54, 0x0

    goto :goto_3a

    :cond_3a
    move-object/from16 v54, p63

    :goto_3a
    const/high16 v55, 0x8000000

    and-int v55, v1, v55

    if-eqz v55, :cond_3b

    const/16 v55, 0x0

    goto :goto_3b

    :cond_3b
    move-object/from16 v55, p64

    :goto_3b
    const/high16 v56, 0x10000000

    and-int v1, v1, v56

    if-eqz v1, :cond_3c

    const/16 p66, 0x0

    :goto_3c
    move/from16 p47, p1

    move-object/from16 p32, p3

    move/from16 p45, p4

    move/from16 p46, p5

    move-object/from16 p48, p6

    move-object/from16 p49, p7

    move-object/from16 p50, p8

    move-object/from16 p51, p9

    move-object/from16 p2, p68

    move-object/from16 p52, v0

    move-object/from16 p33, v2

    move/from16 p3, v3

    move-object/from16 p19, v4

    move-object/from16 p4, v5

    move-object/from16 p20, v6

    move-object/from16 p5, v7

    move-object/from16 p6, v8

    move-object/from16 p7, v9

    move-object/from16 p8, v10

    move-object/from16 p9, v11

    move-object/from16 p16, v12

    move-wide/from16 p17, v13

    move-wide/from16 p10, v15

    move-wide/from16 p12, v17

    move-wide/from16 p14, v19

    move-object/from16 p53, v21

    move-object/from16 p21, v22

    move-object/from16 p54, v23

    move-object/from16 p22, v24

    move-object/from16 p55, v25

    move-object/from16 p23, v26

    move-object/from16 p56, v27

    move/from16 p24, v28

    move/from16 p25, v29

    move-object/from16 p26, v30

    move-object/from16 p27, v31

    move-object/from16 p28, v32

    move-object/from16 p29, v33

    move-object/from16 p30, v34

    move-object/from16 p31, v35

    move-object/from16 p34, v36

    move-object/from16 p35, v37

    move-object/from16 p36, v38

    move-object/from16 p37, v39

    move-object/from16 p38, v40

    move-object/from16 p39, v41

    move-object/from16 p40, v42

    move-object/from16 p41, v43

    move-object/from16 p42, v44

    move-object/from16 p43, v45

    move-object/from16 p44, v46

    move-object/from16 p57, v47

    move-object/from16 p58, v48

    move-object/from16 p59, v49

    move-object/from16 p60, v50

    move-object/from16 p61, v51

    move-object/from16 p62, v52

    move-object/from16 p63, v53

    move-object/from16 p64, v54

    move-object/from16 p65, v55

    move-object/from16 p1, p0

    goto :goto_3d

    :cond_3c
    move-object/from16 p66, p65

    goto :goto_3c

    .line 66
    :goto_3d
    invoke-direct/range {p1 .. p66}, Lcom/kubi/kumex/data/platform/model/ContractEntity;-><init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;ZZLjava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZIZLjava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/kubi/kumex/data/platform/model/ContractEntity;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;ZZLjava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZIZLjava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Object;)Lcom/kubi/kumex/data/platform/model/ContractEntity;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    move/from16 v1, p66

    move/from16 v2, p67

    and-int/lit8 v3, v1, 0x1

    if-eqz v3, :cond_0

    iget-object v3, v0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->type:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v3, p1

    :goto_0
    and-int/lit8 v4, v1, 0x2

    if-eqz v4, :cond_1

    iget-boolean v4, v0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->isInverse:Z

    goto :goto_1

    :cond_1
    move/from16 v4, p2

    :goto_1
    and-int/lit8 v5, v1, 0x4

    if-eqz v5, :cond_2

    iget-object v5, v0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->symbol:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v5, p3

    :goto_2
    and-int/lit8 v6, v1, 0x8

    if-eqz v6, :cond_3

    iget-object v6, v0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->rootSymbol:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v6, p4

    :goto_3
    and-int/lit8 v7, v1, 0x10

    if-eqz v7, :cond_4

    iget-object v7, v0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->baseCurrency:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v7, p5

    :goto_4
    and-int/lit8 v8, v1, 0x20

    if-eqz v8, :cond_5

    iget-object v8, v0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->displayBaseCurrency:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v8, p6

    :goto_5
    and-int/lit8 v9, v1, 0x40

    if-eqz v9, :cond_6

    iget-object v9, v0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->quoteCurrency:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v9, p7

    :goto_6
    and-int/lit16 v10, v1, 0x80

    if-eqz v10, :cond_7

    iget-object v10, v0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->status:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v10, p8

    :goto_7
    and-int/lit16 v11, v1, 0x100

    if-eqz v11, :cond_8

    iget-wide v11, v0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->createdAt:J

    goto :goto_8

    :cond_8
    move-wide/from16 v11, p9

    :goto_8
    and-int/lit16 v13, v1, 0x200

    if-eqz v13, :cond_9

    iget-wide v13, v0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->expireDate:J

    goto :goto_9

    :cond_9
    move-wide/from16 v13, p11

    :goto_9
    and-int/lit16 v15, v1, 0x400

    move-object/from16 p1, v3

    move/from16 p2, v4

    if-eqz v15, :cond_a

    iget-wide v3, v0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->updatedAt:J

    goto :goto_a

    :cond_a
    move-wide/from16 v3, p13

    :goto_a
    and-int/lit16 v15, v1, 0x800

    if-eqz v15, :cond_b

    iget-object v15, v0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->fairMethod:Ljava/lang/String;

    goto :goto_b

    :cond_b
    move-object/from16 v15, p15

    :goto_b
    move-wide/from16 p3, v3

    and-int/lit16 v3, v1, 0x1000

    if-eqz v3, :cond_c

    iget-wide v3, v0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->firstOpenDate:J

    goto :goto_c

    :cond_c
    move-wide/from16 v3, p16

    :goto_c
    move-wide/from16 p5, v3

    and-int/lit16 v3, v1, 0x2000

    if-eqz v3, :cond_d

    iget-object v3, v0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->fundingBaseSymbol:Ljava/lang/String;

    goto :goto_d

    :cond_d
    move-object/from16 v3, p18

    :goto_d
    and-int/lit16 v4, v1, 0x4000

    if-eqz v4, :cond_e

    iget-object v4, v0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->fundingQuoteSymbol:Ljava/lang/String;

    goto :goto_e

    :cond_e
    move-object/from16 v4, p19

    :goto_e
    const v16, 0x8000

    and-int v17, v1, v16

    if-eqz v17, :cond_f

    iget-object v1, v0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->fundingRateSymbol:Ljava/lang/String;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p20

    :goto_f
    const/high16 v17, 0x10000

    and-int v18, p66, v17

    move-object/from16 p7, v1

    if-eqz v18, :cond_10

    iget-object v1, v0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->indexSymbol:Ljava/lang/String;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p21

    :goto_10
    const/high16 v18, 0x20000

    and-int v19, p66, v18

    move-object/from16 p8, v1

    if-eqz v19, :cond_11

    iget-object v1, v0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->initialMargin:Ljava/math/BigDecimal;

    goto :goto_11

    :cond_11
    move-object/from16 v1, p22

    :goto_11
    const/high16 v19, 0x40000

    and-int v20, p66, v19

    move-object/from16 p9, v1

    if-eqz v20, :cond_12

    iget-boolean v1, v0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->isDeleverage:Z

    goto :goto_12

    :cond_12
    move/from16 v1, p23

    :goto_12
    const/high16 v20, 0x80000

    and-int v21, p66, v20

    move/from16 p10, v1

    if-eqz v21, :cond_13

    iget-boolean v1, v0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->isQuanto:Z

    goto :goto_13

    :cond_13
    move/from16 v1, p24

    :goto_13
    const/high16 v21, 0x100000

    and-int v22, p66, v21

    move/from16 p11, v1

    if-eqz v22, :cond_14

    iget-object v1, v0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->lotSize:Ljava/math/BigDecimal;

    goto :goto_14

    :cond_14
    move-object/from16 v1, p25

    :goto_14
    const/high16 v22, 0x200000

    and-int v23, p66, v22

    move-object/from16 p12, v1

    if-eqz v23, :cond_15

    iget-object v1, v0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->maintainMargin:Ljava/math/BigDecimal;

    goto :goto_15

    :cond_15
    move-object/from16 v1, p26

    :goto_15
    const/high16 v23, 0x400000

    and-int v23, p66, v23

    move-object/from16 p13, v1

    if-eqz v23, :cond_16

    iget-object v1, v0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->makerFeeRate:Ljava/math/BigDecimal;

    goto :goto_16

    :cond_16
    move-object/from16 v1, p27

    :goto_16
    const/high16 v23, 0x800000

    and-int v23, p66, v23

    move-object/from16 p14, v1

    if-eqz v23, :cond_17

    iget-object v1, v0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->makerFixFee:Ljava/math/BigDecimal;

    goto :goto_17

    :cond_17
    move-object/from16 v1, p28

    :goto_17
    const/high16 v23, 0x1000000

    and-int v23, p66, v23

    move-object/from16 p15, v1

    if-eqz v23, :cond_18

    iget-object v1, v0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->markMethod:Ljava/lang/String;

    goto :goto_18

    :cond_18
    move-object/from16 v1, p29

    :goto_18
    const/high16 v23, 0x2000000

    and-int v23, p66, v23

    move-object/from16 p16, v1

    if-eqz v23, :cond_19

    iget-object v1, v0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->maxOrderQty:Ljava/math/BigDecimal;

    goto :goto_19

    :cond_19
    move-object/from16 v1, p30

    :goto_19
    const/high16 v23, 0x4000000

    and-int v23, p66, v23

    move-object/from16 p17, v1

    if-eqz v23, :cond_1a

    iget-object v1, v0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->indexPriceTickSize:Ljava/math/BigDecimal;

    goto :goto_1a

    :cond_1a
    move-object/from16 v1, p31

    :goto_1a
    const/high16 v23, 0x8000000

    and-int v23, p66, v23

    move-object/from16 p18, v1

    if-eqz v23, :cond_1b

    iget-object v1, v0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->maxPrice:Ljava/math/BigDecimal;

    goto :goto_1b

    :cond_1b
    move-object/from16 v1, p32

    :goto_1b
    const/high16 v23, 0x10000000

    and-int v23, p66, v23

    move-object/from16 p19, v1

    if-eqz v23, :cond_1c

    iget-object v1, v0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->maxRiskLimit:Ljava/math/BigDecimal;

    goto :goto_1c

    :cond_1c
    move-object/from16 v1, p33

    :goto_1c
    const/high16 v23, 0x20000000

    and-int v23, p66, v23

    move-object/from16 p20, v1

    if-eqz v23, :cond_1d

    iget-object v1, v0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->minRiskLimit:Ljava/math/BigDecimal;

    goto :goto_1d

    :cond_1d
    move-object/from16 v1, p34

    :goto_1d
    const/high16 v23, 0x40000000    # 2.0f

    and-int v23, p66, v23

    move-object/from16 p21, v1

    if-eqz v23, :cond_1e

    iget-object v1, v0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->riskStep:Ljava/math/BigDecimal;

    goto :goto_1e

    :cond_1e
    move-object/from16 v1, p35

    :goto_1e
    const/high16 v23, -0x80000000

    and-int v23, p66, v23

    move-object/from16 p22, v1

    if-eqz v23, :cond_1f

    iget-object v1, v0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->settleCurrency:Ljava/lang/String;

    goto :goto_1f

    :cond_1f
    move-object/from16 v1, p36

    :goto_1f
    and-int/lit8 v23, v2, 0x1

    move-object/from16 p23, v1

    if-eqz v23, :cond_20

    iget-object v1, v0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->settleDate:Ljava/lang/Long;

    goto :goto_20

    :cond_20
    move-object/from16 v1, p37

    :goto_20
    and-int/lit8 v23, v2, 0x2

    move-object/from16 p24, v1

    if-eqz v23, :cond_21

    iget-object v1, v0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->settlementFee:Ljava/math/BigDecimal;

    goto :goto_21

    :cond_21
    move-object/from16 v1, p38

    :goto_21
    and-int/lit8 v23, v2, 0x4

    move-object/from16 p25, v1

    if-eqz v23, :cond_22

    iget-object v1, v0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->takerFeeRate:Ljava/math/BigDecimal;

    goto :goto_22

    :cond_22
    move-object/from16 v1, p39

    :goto_22
    and-int/lit8 v23, v2, 0x8

    move-object/from16 p26, v1

    if-eqz v23, :cond_23

    iget-object v1, v0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->takerFixFee:Ljava/math/BigDecimal;

    goto :goto_23

    :cond_23
    move-object/from16 v1, p40

    :goto_23
    and-int/lit8 v23, v2, 0x10

    move-object/from16 p27, v1

    if-eqz v23, :cond_24

    iget-object v1, v0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->tickSize:Ljava/math/BigDecimal;

    goto :goto_24

    :cond_24
    move-object/from16 v1, p41

    :goto_24
    and-int/lit8 v23, v2, 0x20

    move-object/from16 p28, v1

    if-eqz v23, :cond_25

    iget-object v1, v0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->multiplier:Ljava/math/BigDecimal;

    goto :goto_25

    :cond_25
    move-object/from16 v1, p42

    :goto_25
    and-int/lit8 v23, v2, 0x40

    move-object/from16 p29, v1

    if-eqz v23, :cond_26

    iget-object v1, v0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->maxLeverage:Ljava/math/BigDecimal;

    goto :goto_26

    :cond_26
    move-object/from16 v1, p43

    :goto_26
    move-object/from16 p30, v1

    and-int/lit16 v1, v2, 0x80

    if-eqz v1, :cond_27

    iget-boolean v1, v0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->supportGridTrading:Z

    goto :goto_27

    :cond_27
    move/from16 v1, p44

    :goto_27
    move/from16 p31, v1

    and-int/lit16 v1, v2, 0x100

    if-eqz v1, :cond_28

    iget v1, v0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->stepRiskLimitStatus:I

    goto :goto_28

    :cond_28
    move/from16 v1, p45

    :goto_28
    move/from16 p32, v1

    and-int/lit16 v1, v2, 0x200

    if-eqz v1, :cond_29

    iget-boolean v1, v0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->isTrialFunds:Z

    goto :goto_29

    :cond_29
    move/from16 v1, p46

    :goto_29
    move/from16 p33, v1

    and-int/lit16 v1, v2, 0x400

    if-eqz v1, :cond_2a

    iget-object v1, v0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->spotCurrency:Ljava/lang/String;

    goto :goto_2a

    :cond_2a
    move-object/from16 v1, p47

    :goto_2a
    move-object/from16 p34, v1

    and-int/lit16 v1, v2, 0x800

    if-eqz v1, :cond_2b

    iget-object v1, v0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->k:Ljava/math/BigDecimal;

    goto :goto_2b

    :cond_2b
    move-object/from16 v1, p48

    :goto_2b
    move-object/from16 p35, v1

    and-int/lit16 v1, v2, 0x1000

    if-eqz v1, :cond_2c

    iget-object v1, v0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->m:Ljava/math/BigDecimal;

    goto :goto_2c

    :cond_2c
    move-object/from16 v1, p49

    :goto_2c
    move-object/from16 p36, v1

    and-int/lit16 v1, v2, 0x2000

    if-eqz v1, :cond_2d

    iget-object v1, v0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->f:Ljava/math/BigDecimal;

    goto :goto_2d

    :cond_2d
    move-object/from16 v1, p50

    :goto_2d
    move-object/from16 p37, v1

    and-int/lit16 v1, v2, 0x4000

    if-eqz v1, :cond_2e

    iget-object v1, v0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->mmrLimit:Ljava/math/BigDecimal;

    goto :goto_2e

    :cond_2e
    move-object/from16 v1, p51

    :goto_2e
    and-int v16, v2, v16

    move-object/from16 p38, v1

    if-eqz v16, :cond_2f

    iget-object v1, v0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->mmrLevConstant:Ljava/math/BigDecimal;

    goto :goto_2f

    :cond_2f
    move-object/from16 v1, p52

    :goto_2f
    and-int v16, v2, v17

    move-object/from16 p39, v1

    if-eqz v16, :cond_30

    iget-object v1, v0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->crossRiskLimit:Ljava/math/BigDecimal;

    goto :goto_30

    :cond_30
    move-object/from16 v1, p53

    :goto_30
    and-int v16, v2, v18

    move-object/from16 p40, v1

    if-eqz v16, :cond_31

    iget-object v1, v0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->adjustK:Ljava/math/BigDecimal;

    goto :goto_31

    :cond_31
    move-object/from16 v1, p54

    :goto_31
    and-int v16, v2, v19

    move-object/from16 p41, v1

    if-eqz v16, :cond_32

    iget-object v1, v0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->adjustM:Ljava/math/BigDecimal;

    goto :goto_32

    :cond_32
    move-object/from16 v1, p55

    :goto_32
    and-int v16, v2, v20

    move-object/from16 p42, v1

    if-eqz v16, :cond_33

    iget-object v1, v0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->adjustMmrLevConstant:Ljava/math/BigDecimal;

    goto :goto_33

    :cond_33
    move-object/from16 v1, p56

    :goto_33
    and-int v16, v2, v21

    move-object/from16 p43, v1

    if-eqz v16, :cond_34

    iget-object v1, v0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->adjustActiveTime:Ljava/lang/Long;

    goto :goto_34

    :cond_34
    move-object/from16 v1, p57

    :goto_34
    and-int v16, v2, v22

    move-object/from16 p44, v1

    if-eqz v16, :cond_35

    iget-object v1, v0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->supportCross:Ljava/lang/Boolean;

    goto :goto_35

    :cond_35
    move-object/from16 v1, p58

    :goto_35
    const/high16 v16, 0x400000

    and-int v16, v2, v16

    move-object/from16 p45, v1

    if-eqz v16, :cond_36

    iget-object v1, v0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->marketStage:Ljava/lang/String;

    goto :goto_36

    :cond_36
    move-object/from16 v1, p59

    :goto_36
    const/high16 v16, 0x800000

    and-int v16, v2, v16

    move-object/from16 p46, v1

    if-eqz v16, :cond_37

    iget-object v1, v0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->preMarketToPerpDate:Ljava/lang/Long;

    goto :goto_37

    :cond_37
    move-object/from16 v1, p60

    :goto_37
    const/high16 v16, 0x1000000

    and-int v16, v2, v16

    move-object/from16 p47, v1

    if-eqz v16, :cond_38

    iget-object v1, v0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->marketMaxOrderQty:Ljava/math/BigDecimal;

    goto :goto_38

    :cond_38
    move-object/from16 v1, p61

    :goto_38
    const/high16 v16, 0x2000000

    and-int v16, v2, v16

    move-object/from16 p48, v1

    if-eqz v16, :cond_39

    iget-object v1, v0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->marketType:Ljava/lang/String;

    goto :goto_39

    :cond_39
    move-object/from16 v1, p62

    :goto_39
    const/high16 v16, 0x4000000

    and-int v16, v2, v16

    move-object/from16 p49, v1

    if-eqz v16, :cond_3a

    iget-object v1, v0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->assetClass:Ljava/lang/String;

    goto :goto_3a

    :cond_3a
    move-object/from16 v1, p63

    :goto_3a
    const/high16 v16, 0x8000000

    and-int v16, v2, v16

    move-object/from16 p50, v1

    if-eqz v16, :cond_3b

    iget-object v1, v0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->subMarketType:Ljava/lang/String;

    goto :goto_3b

    :cond_3b
    move-object/from16 v1, p64

    :goto_3b
    const/high16 v16, 0x10000000

    and-int v2, v2, v16

    if-eqz v2, :cond_3c

    iget-object v2, v0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->imgUrl:Ljava/lang/String;

    move-object/from16 p66, v2

    :goto_3c
    move-object/from16 p51, p37

    move-object/from16 p52, p38

    move-object/from16 p53, p39

    move-object/from16 p54, p40

    move-object/from16 p55, p41

    move-object/from16 p56, p42

    move-object/from16 p57, p43

    move-object/from16 p58, p44

    move-object/from16 p59, p45

    move-object/from16 p60, p46

    move-object/from16 p61, p47

    move-object/from16 p62, p48

    move-object/from16 p63, p49

    move-object/from16 p64, p50

    move-object/from16 p65, v1

    move-object/from16 p37, p23

    move-object/from16 p38, p24

    move-object/from16 p39, p25

    move-object/from16 p40, p26

    move-object/from16 p41, p27

    move-object/from16 p42, p28

    move-object/from16 p43, p29

    move-object/from16 p44, p30

    move/from16 p45, p31

    move/from16 p46, p32

    move/from16 p47, p33

    move-object/from16 p48, p34

    move-object/from16 p49, p35

    move-object/from16 p50, p36

    move-object/from16 p23, p9

    move/from16 p24, p10

    move/from16 p25, p11

    move-object/from16 p26, p12

    move-object/from16 p27, p13

    move-object/from16 p28, p14

    move-object/from16 p29, p15

    move-object/from16 p30, p16

    move-object/from16 p31, p17

    move-object/from16 p32, p18

    move-object/from16 p33, p19

    move-object/from16 p34, p20

    move-object/from16 p35, p21

    move-object/from16 p36, p22

    move-object/from16 p19, v3

    move-object/from16 p20, v4

    move-object/from16 p9, v10

    move-wide/from16 p10, v11

    move-wide/from16 p12, v13

    move-object/from16 p16, v15

    move-wide/from16 p14, p3

    move-wide/from16 p17, p5

    move-object/from16 p21, p7

    move-object/from16 p22, p8

    move-object/from16 p4, v5

    move-object/from16 p5, v6

    move-object/from16 p6, v7

    move-object/from16 p7, v8

    move-object/from16 p8, v9

    move/from16 p3, p2

    move-object/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_3d

    :cond_3c
    move-object/from16 p66, p65

    goto :goto_3c

    :goto_3d
    invoke-virtual/range {p1 .. p66}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->copy(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;ZZLjava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZIZLjava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/kumex/data/platform/model/ContractEntity;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->type:Ljava/lang/String;

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

.method public final component10()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->expireDate:J

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

.method public final component11()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->updatedAt:J

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

.method public final component12()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->fairMethod:Ljava/lang/String;

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

.method public final component13()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->firstOpenDate:J

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

.method public final component14()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->fundingBaseSymbol:Ljava/lang/String;

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

.method public final component15()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->fundingQuoteSymbol:Ljava/lang/String;

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

.method public final component16()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->fundingRateSymbol:Ljava/lang/String;

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

.method public final component17()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->indexSymbol:Ljava/lang/String;

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

.method public final component18()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->initialMargin:Ljava/math/BigDecimal;

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

.method public final component19()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->isDeleverage:Z

    .line 3
    return v0
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

.method public final component2()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->isInverse:Z

    .line 3
    return v0
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

.method public final component20()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->isQuanto:Z

    .line 3
    return v0
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

.method public final component21()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->lotSize:Ljava/math/BigDecimal;

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

.method public final component22()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->maintainMargin:Ljava/math/BigDecimal;

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

.method public final component23()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->makerFeeRate:Ljava/math/BigDecimal;

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

.method public final component24()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->makerFixFee:Ljava/math/BigDecimal;

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

.method public final component25()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->markMethod:Ljava/lang/String;

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

.method public final component26()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->maxOrderQty:Ljava/math/BigDecimal;

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

.method public final component27()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->indexPriceTickSize:Ljava/math/BigDecimal;

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

.method public final component28()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->maxPrice:Ljava/math/BigDecimal;

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

.method public final component29()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->maxRiskLimit:Ljava/math/BigDecimal;

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

.method public final component3()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->symbol:Ljava/lang/String;

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

.method public final component30()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->minRiskLimit:Ljava/math/BigDecimal;

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

.method public final component31()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->riskStep:Ljava/math/BigDecimal;

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

.method public final component32()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->settleCurrency:Ljava/lang/String;

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

.method public final component33()Ljava/lang/Long;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->settleDate:Ljava/lang/Long;

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

.method public final component34()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->settlementFee:Ljava/math/BigDecimal;

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

.method public final component35()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->takerFeeRate:Ljava/math/BigDecimal;

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

.method public final component36()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->takerFixFee:Ljava/math/BigDecimal;

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

.method public final component37()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->tickSize:Ljava/math/BigDecimal;

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

.method public final component38()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->multiplier:Ljava/math/BigDecimal;

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

.method public final component39()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->maxLeverage:Ljava/math/BigDecimal;

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

.method public final component4()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->rootSymbol:Ljava/lang/String;

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

.method public final component40()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->supportGridTrading:Z

    .line 3
    return v0
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

.method public final component41()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->stepRiskLimitStatus:I

    .line 3
    return v0
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

.method public final component42()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->isTrialFunds:Z

    .line 3
    return v0
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

.method public final component43()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->spotCurrency:Ljava/lang/String;

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

.method public final component44()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->k:Ljava/math/BigDecimal;

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

.method public final component45()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->m:Ljava/math/BigDecimal;

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

.method public final component46()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->f:Ljava/math/BigDecimal;

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

.method public final component47()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->mmrLimit:Ljava/math/BigDecimal;

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

.method public final component48()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->mmrLevConstant:Ljava/math/BigDecimal;

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

.method public final component49()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->crossRiskLimit:Ljava/math/BigDecimal;

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

.method public final component5()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->baseCurrency:Ljava/lang/String;

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

.method public final component50()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->adjustK:Ljava/math/BigDecimal;

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

.method public final component51()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->adjustM:Ljava/math/BigDecimal;

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

.method public final component52()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->adjustMmrLevConstant:Ljava/math/BigDecimal;

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

.method public final component53()Ljava/lang/Long;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->adjustActiveTime:Ljava/lang/Long;

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

.method public final component54()Ljava/lang/Boolean;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->supportCross:Ljava/lang/Boolean;

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

.method public final component55()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->marketStage:Ljava/lang/String;

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

.method public final component56()Ljava/lang/Long;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->preMarketToPerpDate:Ljava/lang/Long;

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

.method public final component57()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->marketMaxOrderQty:Ljava/math/BigDecimal;

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

.method public final component58()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->marketType:Ljava/lang/String;

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

.method public final component59()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->assetClass:Ljava/lang/String;

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

.method public final component6()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->displayBaseCurrency:Ljava/lang/String;

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

.method public final component60()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->subMarketType:Ljava/lang/String;

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

.method public final component61()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->imgUrl:Ljava/lang/String;

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

.method public final component7()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->quoteCurrency:Ljava/lang/String;

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

.method public final component8()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->status:Ljava/lang/String;

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

.method public final component9()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->createdAt:J

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

.method public final copy(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;ZZLjava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZIZLjava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/kumex/data/platform/model/ContractEntity;
    .locals 66
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p15    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p18    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p19    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p20    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p21    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p22    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p25    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p26    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p27    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p28    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p29    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p30    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p31    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p32    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p33    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p34    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p35    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p36    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p37    # Ljava/lang/Long;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p38    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p39    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p40    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p41    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p42    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p43    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p47    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p48    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p49    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p50    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p51    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p52    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p53    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p54    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p55    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p56    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p57    # Ljava/lang/Long;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p58    # Ljava/lang/Boolean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p59    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p60    # Ljava/lang/Long;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p61    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p62    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p63    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p64    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p65    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    new-instance v0, Lcom/kubi/kumex/data/platform/model/ContractEntity;

    move-object/from16 v1, p1

    move/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-wide/from16 v9, p9

    move-wide/from16 v11, p11

    move-wide/from16 v13, p13

    move-object/from16 v15, p15

    move-wide/from16 v16, p16

    move-object/from16 v18, p18

    move-object/from16 v19, p19

    move-object/from16 v20, p20

    move-object/from16 v21, p21

    move-object/from16 v22, p22

    move/from16 v23, p23

    move/from16 v24, p24

    move-object/from16 v25, p25

    move-object/from16 v26, p26

    move-object/from16 v27, p27

    move-object/from16 v28, p28

    move-object/from16 v29, p29

    move-object/from16 v30, p30

    move-object/from16 v31, p31

    move-object/from16 v32, p32

    move-object/from16 v33, p33

    move-object/from16 v34, p34

    move-object/from16 v35, p35

    move-object/from16 v36, p36

    move-object/from16 v37, p37

    move-object/from16 v38, p38

    move-object/from16 v39, p39

    move-object/from16 v40, p40

    move-object/from16 v41, p41

    move-object/from16 v42, p42

    move-object/from16 v43, p43

    move/from16 v44, p44

    move/from16 v45, p45

    move/from16 v46, p46

    move-object/from16 v47, p47

    move-object/from16 v48, p48

    move-object/from16 v49, p49

    move-object/from16 v50, p50

    move-object/from16 v51, p51

    move-object/from16 v52, p52

    move-object/from16 v53, p53

    move-object/from16 v54, p54

    move-object/from16 v55, p55

    move-object/from16 v56, p56

    move-object/from16 v57, p57

    move-object/from16 v58, p58

    move-object/from16 v59, p59

    move-object/from16 v60, p60

    move-object/from16 v61, p61

    move-object/from16 v62, p62

    move-object/from16 v63, p63

    move-object/from16 v64, p64

    move-object/from16 v65, p65

    invoke-direct/range {v0 .. v65}, Lcom/kubi/kumex/data/platform/model/ContractEntity;-><init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;ZZLjava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZIZLjava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public final describeContents()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
    .line 3
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

.method public equals(Ljava/lang/Object;)Z
    .locals 7
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    if-ne p0, p1, :cond_0

    .line 4
    return v0

    .line 5
    .line 6
    :cond_0
    instance-of v1, p1, Lcom/kubi/kumex/data/platform/model/ContractEntity;

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    return v2

    .line 11
    .line 12
    :cond_1
    check-cast p1, Lcom/kubi/kumex/data/platform/model/ContractEntity;

    .line 13
    .line 14
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->type:Ljava/lang/String;

    .line 15
    .line 16
    iget-object v3, p1, Lcom/kubi/kumex/data/platform/model/ContractEntity;->type:Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    move-result v1

    .line 21
    .line 22
    if-nez v1, :cond_2

    .line 23
    return v2

    .line 24
    .line 25
    :cond_2
    iget-boolean v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->isInverse:Z

    .line 26
    .line 27
    iget-boolean v3, p1, Lcom/kubi/kumex/data/platform/model/ContractEntity;->isInverse:Z

    .line 28
    .line 29
    if-eq v1, v3, :cond_3

    .line 30
    return v2

    .line 31
    .line 32
    :cond_3
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->symbol:Ljava/lang/String;

    .line 33
    .line 34
    iget-object v3, p1, Lcom/kubi/kumex/data/platform/model/ContractEntity;->symbol:Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    move-result v1

    .line 39
    .line 40
    if-nez v1, :cond_4

    .line 41
    return v2

    .line 42
    .line 43
    :cond_4
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->rootSymbol:Ljava/lang/String;

    .line 44
    .line 45
    iget-object v3, p1, Lcom/kubi/kumex/data/platform/model/ContractEntity;->rootSymbol:Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    move-result v1

    .line 50
    .line 51
    if-nez v1, :cond_5

    .line 52
    return v2

    .line 53
    .line 54
    :cond_5
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->baseCurrency:Ljava/lang/String;

    .line 55
    .line 56
    iget-object v3, p1, Lcom/kubi/kumex/data/platform/model/ContractEntity;->baseCurrency:Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    move-result v1

    .line 61
    .line 62
    if-nez v1, :cond_6

    .line 63
    return v2

    .line 64
    .line 65
    :cond_6
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->displayBaseCurrency:Ljava/lang/String;

    .line 66
    .line 67
    iget-object v3, p1, Lcom/kubi/kumex/data/platform/model/ContractEntity;->displayBaseCurrency:Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 71
    move-result v1

    .line 72
    .line 73
    if-nez v1, :cond_7

    .line 74
    return v2

    .line 75
    .line 76
    :cond_7
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->quoteCurrency:Ljava/lang/String;

    .line 77
    .line 78
    iget-object v3, p1, Lcom/kubi/kumex/data/platform/model/ContractEntity;->quoteCurrency:Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    move-result v1

    .line 83
    .line 84
    if-nez v1, :cond_8

    .line 85
    return v2

    .line 86
    .line 87
    :cond_8
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->status:Ljava/lang/String;

    .line 88
    .line 89
    iget-object v3, p1, Lcom/kubi/kumex/data/platform/model/ContractEntity;->status:Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 93
    move-result v1

    .line 94
    .line 95
    if-nez v1, :cond_9

    .line 96
    return v2

    .line 97
    .line 98
    :cond_9
    iget-wide v3, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->createdAt:J

    .line 99
    .line 100
    iget-wide v5, p1, Lcom/kubi/kumex/data/platform/model/ContractEntity;->createdAt:J

    .line 101
    .line 102
    cmp-long v1, v3, v5

    .line 103
    .line 104
    if-eqz v1, :cond_a

    .line 105
    return v2

    .line 106
    .line 107
    :cond_a
    iget-wide v3, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->expireDate:J

    .line 108
    .line 109
    iget-wide v5, p1, Lcom/kubi/kumex/data/platform/model/ContractEntity;->expireDate:J

    .line 110
    .line 111
    cmp-long v1, v3, v5

    .line 112
    .line 113
    if-eqz v1, :cond_b

    .line 114
    return v2

    .line 115
    .line 116
    :cond_b
    iget-wide v3, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->updatedAt:J

    .line 117
    .line 118
    iget-wide v5, p1, Lcom/kubi/kumex/data/platform/model/ContractEntity;->updatedAt:J

    .line 119
    .line 120
    cmp-long v1, v3, v5

    .line 121
    .line 122
    if-eqz v1, :cond_c

    .line 123
    return v2

    .line 124
    .line 125
    :cond_c
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->fairMethod:Ljava/lang/String;

    .line 126
    .line 127
    iget-object v3, p1, Lcom/kubi/kumex/data/platform/model/ContractEntity;->fairMethod:Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 131
    move-result v1

    .line 132
    .line 133
    if-nez v1, :cond_d

    .line 134
    return v2

    .line 135
    .line 136
    :cond_d
    iget-wide v3, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->firstOpenDate:J

    .line 137
    .line 138
    iget-wide v5, p1, Lcom/kubi/kumex/data/platform/model/ContractEntity;->firstOpenDate:J

    .line 139
    .line 140
    cmp-long v1, v3, v5

    .line 141
    .line 142
    if-eqz v1, :cond_e

    .line 143
    return v2

    .line 144
    .line 145
    :cond_e
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->fundingBaseSymbol:Ljava/lang/String;

    .line 146
    .line 147
    iget-object v3, p1, Lcom/kubi/kumex/data/platform/model/ContractEntity;->fundingBaseSymbol:Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 151
    move-result v1

    .line 152
    .line 153
    if-nez v1, :cond_f

    .line 154
    return v2

    .line 155
    .line 156
    :cond_f
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->fundingQuoteSymbol:Ljava/lang/String;

    .line 157
    .line 158
    iget-object v3, p1, Lcom/kubi/kumex/data/platform/model/ContractEntity;->fundingQuoteSymbol:Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 162
    move-result v1

    .line 163
    .line 164
    if-nez v1, :cond_10

    .line 165
    return v2

    .line 166
    .line 167
    :cond_10
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->fundingRateSymbol:Ljava/lang/String;

    .line 168
    .line 169
    iget-object v3, p1, Lcom/kubi/kumex/data/platform/model/ContractEntity;->fundingRateSymbol:Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 173
    move-result v1

    .line 174
    .line 175
    if-nez v1, :cond_11

    .line 176
    return v2

    .line 177
    .line 178
    :cond_11
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->indexSymbol:Ljava/lang/String;

    .line 179
    .line 180
    iget-object v3, p1, Lcom/kubi/kumex/data/platform/model/ContractEntity;->indexSymbol:Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 184
    move-result v1

    .line 185
    .line 186
    if-nez v1, :cond_12

    .line 187
    return v2

    .line 188
    .line 189
    :cond_12
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->initialMargin:Ljava/math/BigDecimal;

    .line 190
    .line 191
    iget-object v3, p1, Lcom/kubi/kumex/data/platform/model/ContractEntity;->initialMargin:Ljava/math/BigDecimal;

    .line 192
    .line 193
    .line 194
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 195
    move-result v1

    .line 196
    .line 197
    if-nez v1, :cond_13

    .line 198
    return v2

    .line 199
    .line 200
    :cond_13
    iget-boolean v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->isDeleverage:Z

    .line 201
    .line 202
    iget-boolean v3, p1, Lcom/kubi/kumex/data/platform/model/ContractEntity;->isDeleverage:Z

    .line 203
    .line 204
    if-eq v1, v3, :cond_14

    .line 205
    return v2

    .line 206
    .line 207
    :cond_14
    iget-boolean v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->isQuanto:Z

    .line 208
    .line 209
    iget-boolean v3, p1, Lcom/kubi/kumex/data/platform/model/ContractEntity;->isQuanto:Z

    .line 210
    .line 211
    if-eq v1, v3, :cond_15

    .line 212
    return v2

    .line 213
    .line 214
    :cond_15
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->lotSize:Ljava/math/BigDecimal;

    .line 215
    .line 216
    iget-object v3, p1, Lcom/kubi/kumex/data/platform/model/ContractEntity;->lotSize:Ljava/math/BigDecimal;

    .line 217
    .line 218
    .line 219
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 220
    move-result v1

    .line 221
    .line 222
    if-nez v1, :cond_16

    .line 223
    return v2

    .line 224
    .line 225
    :cond_16
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->maintainMargin:Ljava/math/BigDecimal;

    .line 226
    .line 227
    iget-object v3, p1, Lcom/kubi/kumex/data/platform/model/ContractEntity;->maintainMargin:Ljava/math/BigDecimal;

    .line 228
    .line 229
    .line 230
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 231
    move-result v1

    .line 232
    .line 233
    if-nez v1, :cond_17

    .line 234
    return v2

    .line 235
    .line 236
    :cond_17
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->makerFeeRate:Ljava/math/BigDecimal;

    .line 237
    .line 238
    iget-object v3, p1, Lcom/kubi/kumex/data/platform/model/ContractEntity;->makerFeeRate:Ljava/math/BigDecimal;

    .line 239
    .line 240
    .line 241
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 242
    move-result v1

    .line 243
    .line 244
    if-nez v1, :cond_18

    .line 245
    return v2

    .line 246
    .line 247
    :cond_18
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->makerFixFee:Ljava/math/BigDecimal;

    .line 248
    .line 249
    iget-object v3, p1, Lcom/kubi/kumex/data/platform/model/ContractEntity;->makerFixFee:Ljava/math/BigDecimal;

    .line 250
    .line 251
    .line 252
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 253
    move-result v1

    .line 254
    .line 255
    if-nez v1, :cond_19

    .line 256
    return v2

    .line 257
    .line 258
    :cond_19
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->markMethod:Ljava/lang/String;

    .line 259
    .line 260
    iget-object v3, p1, Lcom/kubi/kumex/data/platform/model/ContractEntity;->markMethod:Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 264
    move-result v1

    .line 265
    .line 266
    if-nez v1, :cond_1a

    .line 267
    return v2

    .line 268
    .line 269
    :cond_1a
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->maxOrderQty:Ljava/math/BigDecimal;

    .line 270
    .line 271
    iget-object v3, p1, Lcom/kubi/kumex/data/platform/model/ContractEntity;->maxOrderQty:Ljava/math/BigDecimal;

    .line 272
    .line 273
    .line 274
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 275
    move-result v1

    .line 276
    .line 277
    if-nez v1, :cond_1b

    .line 278
    return v2

    .line 279
    .line 280
    :cond_1b
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->indexPriceTickSize:Ljava/math/BigDecimal;

    .line 281
    .line 282
    iget-object v3, p1, Lcom/kubi/kumex/data/platform/model/ContractEntity;->indexPriceTickSize:Ljava/math/BigDecimal;

    .line 283
    .line 284
    .line 285
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 286
    move-result v1

    .line 287
    .line 288
    if-nez v1, :cond_1c

    .line 289
    return v2

    .line 290
    .line 291
    :cond_1c
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->maxPrice:Ljava/math/BigDecimal;

    .line 292
    .line 293
    iget-object v3, p1, Lcom/kubi/kumex/data/platform/model/ContractEntity;->maxPrice:Ljava/math/BigDecimal;

    .line 294
    .line 295
    .line 296
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 297
    move-result v1

    .line 298
    .line 299
    if-nez v1, :cond_1d

    .line 300
    return v2

    .line 301
    .line 302
    :cond_1d
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->maxRiskLimit:Ljava/math/BigDecimal;

    .line 303
    .line 304
    iget-object v3, p1, Lcom/kubi/kumex/data/platform/model/ContractEntity;->maxRiskLimit:Ljava/math/BigDecimal;

    .line 305
    .line 306
    .line 307
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 308
    move-result v1

    .line 309
    .line 310
    if-nez v1, :cond_1e

    .line 311
    return v2

    .line 312
    .line 313
    :cond_1e
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->minRiskLimit:Ljava/math/BigDecimal;

    .line 314
    .line 315
    iget-object v3, p1, Lcom/kubi/kumex/data/platform/model/ContractEntity;->minRiskLimit:Ljava/math/BigDecimal;

    .line 316
    .line 317
    .line 318
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 319
    move-result v1

    .line 320
    .line 321
    if-nez v1, :cond_1f

    .line 322
    return v2

    .line 323
    .line 324
    :cond_1f
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->riskStep:Ljava/math/BigDecimal;

    .line 325
    .line 326
    iget-object v3, p1, Lcom/kubi/kumex/data/platform/model/ContractEntity;->riskStep:Ljava/math/BigDecimal;

    .line 327
    .line 328
    .line 329
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 330
    move-result v1

    .line 331
    .line 332
    if-nez v1, :cond_20

    .line 333
    return v2

    .line 334
    .line 335
    :cond_20
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->settleCurrency:Ljava/lang/String;

    .line 336
    .line 337
    iget-object v3, p1, Lcom/kubi/kumex/data/platform/model/ContractEntity;->settleCurrency:Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 341
    move-result v1

    .line 342
    .line 343
    if-nez v1, :cond_21

    .line 344
    return v2

    .line 345
    .line 346
    :cond_21
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->settleDate:Ljava/lang/Long;

    .line 347
    .line 348
    iget-object v3, p1, Lcom/kubi/kumex/data/platform/model/ContractEntity;->settleDate:Ljava/lang/Long;

    .line 349
    .line 350
    .line 351
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 352
    move-result v1

    .line 353
    .line 354
    if-nez v1, :cond_22

    .line 355
    return v2

    .line 356
    .line 357
    :cond_22
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->settlementFee:Ljava/math/BigDecimal;

    .line 358
    .line 359
    iget-object v3, p1, Lcom/kubi/kumex/data/platform/model/ContractEntity;->settlementFee:Ljava/math/BigDecimal;

    .line 360
    .line 361
    .line 362
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 363
    move-result v1

    .line 364
    .line 365
    if-nez v1, :cond_23

    .line 366
    return v2

    .line 367
    .line 368
    :cond_23
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->takerFeeRate:Ljava/math/BigDecimal;

    .line 369
    .line 370
    iget-object v3, p1, Lcom/kubi/kumex/data/platform/model/ContractEntity;->takerFeeRate:Ljava/math/BigDecimal;

    .line 371
    .line 372
    .line 373
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 374
    move-result v1

    .line 375
    .line 376
    if-nez v1, :cond_24

    .line 377
    return v2

    .line 378
    .line 379
    :cond_24
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->takerFixFee:Ljava/math/BigDecimal;

    .line 380
    .line 381
    iget-object v3, p1, Lcom/kubi/kumex/data/platform/model/ContractEntity;->takerFixFee:Ljava/math/BigDecimal;

    .line 382
    .line 383
    .line 384
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 385
    move-result v1

    .line 386
    .line 387
    if-nez v1, :cond_25

    .line 388
    return v2

    .line 389
    .line 390
    :cond_25
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->tickSize:Ljava/math/BigDecimal;

    .line 391
    .line 392
    iget-object v3, p1, Lcom/kubi/kumex/data/platform/model/ContractEntity;->tickSize:Ljava/math/BigDecimal;

    .line 393
    .line 394
    .line 395
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 396
    move-result v1

    .line 397
    .line 398
    if-nez v1, :cond_26

    .line 399
    return v2

    .line 400
    .line 401
    :cond_26
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->multiplier:Ljava/math/BigDecimal;

    .line 402
    .line 403
    iget-object v3, p1, Lcom/kubi/kumex/data/platform/model/ContractEntity;->multiplier:Ljava/math/BigDecimal;

    .line 404
    .line 405
    .line 406
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 407
    move-result v1

    .line 408
    .line 409
    if-nez v1, :cond_27

    .line 410
    return v2

    .line 411
    .line 412
    :cond_27
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->maxLeverage:Ljava/math/BigDecimal;

    .line 413
    .line 414
    iget-object v3, p1, Lcom/kubi/kumex/data/platform/model/ContractEntity;->maxLeverage:Ljava/math/BigDecimal;

    .line 415
    .line 416
    .line 417
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 418
    move-result v1

    .line 419
    .line 420
    if-nez v1, :cond_28

    .line 421
    return v2

    .line 422
    .line 423
    :cond_28
    iget-boolean v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->supportGridTrading:Z

    .line 424
    .line 425
    iget-boolean v3, p1, Lcom/kubi/kumex/data/platform/model/ContractEntity;->supportGridTrading:Z

    .line 426
    .line 427
    if-eq v1, v3, :cond_29

    .line 428
    return v2

    .line 429
    .line 430
    :cond_29
    iget v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->stepRiskLimitStatus:I

    .line 431
    .line 432
    iget v3, p1, Lcom/kubi/kumex/data/platform/model/ContractEntity;->stepRiskLimitStatus:I

    .line 433
    .line 434
    if-eq v1, v3, :cond_2a

    .line 435
    return v2

    .line 436
    .line 437
    :cond_2a
    iget-boolean v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->isTrialFunds:Z

    .line 438
    .line 439
    iget-boolean v3, p1, Lcom/kubi/kumex/data/platform/model/ContractEntity;->isTrialFunds:Z

    .line 440
    .line 441
    if-eq v1, v3, :cond_2b

    .line 442
    return v2

    .line 443
    .line 444
    :cond_2b
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->spotCurrency:Ljava/lang/String;

    .line 445
    .line 446
    iget-object v3, p1, Lcom/kubi/kumex/data/platform/model/ContractEntity;->spotCurrency:Ljava/lang/String;

    .line 447
    .line 448
    .line 449
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 450
    move-result v1

    .line 451
    .line 452
    if-nez v1, :cond_2c

    .line 453
    return v2

    .line 454
    .line 455
    :cond_2c
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->k:Ljava/math/BigDecimal;

    .line 456
    .line 457
    iget-object v3, p1, Lcom/kubi/kumex/data/platform/model/ContractEntity;->k:Ljava/math/BigDecimal;

    .line 458
    .line 459
    .line 460
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 461
    move-result v1

    .line 462
    .line 463
    if-nez v1, :cond_2d

    .line 464
    return v2

    .line 465
    .line 466
    :cond_2d
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->m:Ljava/math/BigDecimal;

    .line 467
    .line 468
    iget-object v3, p1, Lcom/kubi/kumex/data/platform/model/ContractEntity;->m:Ljava/math/BigDecimal;

    .line 469
    .line 470
    .line 471
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 472
    move-result v1

    .line 473
    .line 474
    if-nez v1, :cond_2e

    .line 475
    return v2

    .line 476
    .line 477
    :cond_2e
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->f:Ljava/math/BigDecimal;

    .line 478
    .line 479
    iget-object v3, p1, Lcom/kubi/kumex/data/platform/model/ContractEntity;->f:Ljava/math/BigDecimal;

    .line 480
    .line 481
    .line 482
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 483
    move-result v1

    .line 484
    .line 485
    if-nez v1, :cond_2f

    .line 486
    return v2

    .line 487
    .line 488
    :cond_2f
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->mmrLimit:Ljava/math/BigDecimal;

    .line 489
    .line 490
    iget-object v3, p1, Lcom/kubi/kumex/data/platform/model/ContractEntity;->mmrLimit:Ljava/math/BigDecimal;

    .line 491
    .line 492
    .line 493
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 494
    move-result v1

    .line 495
    .line 496
    if-nez v1, :cond_30

    .line 497
    return v2

    .line 498
    .line 499
    :cond_30
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->mmrLevConstant:Ljava/math/BigDecimal;

    .line 500
    .line 501
    iget-object v3, p1, Lcom/kubi/kumex/data/platform/model/ContractEntity;->mmrLevConstant:Ljava/math/BigDecimal;

    .line 502
    .line 503
    .line 504
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 505
    move-result v1

    .line 506
    .line 507
    if-nez v1, :cond_31

    .line 508
    return v2

    .line 509
    .line 510
    :cond_31
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->crossRiskLimit:Ljava/math/BigDecimal;

    .line 511
    .line 512
    iget-object v3, p1, Lcom/kubi/kumex/data/platform/model/ContractEntity;->crossRiskLimit:Ljava/math/BigDecimal;

    .line 513
    .line 514
    .line 515
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 516
    move-result v1

    .line 517
    .line 518
    if-nez v1, :cond_32

    .line 519
    return v2

    .line 520
    .line 521
    :cond_32
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->adjustK:Ljava/math/BigDecimal;

    .line 522
    .line 523
    iget-object v3, p1, Lcom/kubi/kumex/data/platform/model/ContractEntity;->adjustK:Ljava/math/BigDecimal;

    .line 524
    .line 525
    .line 526
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 527
    move-result v1

    .line 528
    .line 529
    if-nez v1, :cond_33

    .line 530
    return v2

    .line 531
    .line 532
    :cond_33
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->adjustM:Ljava/math/BigDecimal;

    .line 533
    .line 534
    iget-object v3, p1, Lcom/kubi/kumex/data/platform/model/ContractEntity;->adjustM:Ljava/math/BigDecimal;

    .line 535
    .line 536
    .line 537
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 538
    move-result v1

    .line 539
    .line 540
    if-nez v1, :cond_34

    .line 541
    return v2

    .line 542
    .line 543
    :cond_34
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->adjustMmrLevConstant:Ljava/math/BigDecimal;

    .line 544
    .line 545
    iget-object v3, p1, Lcom/kubi/kumex/data/platform/model/ContractEntity;->adjustMmrLevConstant:Ljava/math/BigDecimal;

    .line 546
    .line 547
    .line 548
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 549
    move-result v1

    .line 550
    .line 551
    if-nez v1, :cond_35

    .line 552
    return v2

    .line 553
    .line 554
    :cond_35
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->adjustActiveTime:Ljava/lang/Long;

    .line 555
    .line 556
    iget-object v3, p1, Lcom/kubi/kumex/data/platform/model/ContractEntity;->adjustActiveTime:Ljava/lang/Long;

    .line 557
    .line 558
    .line 559
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 560
    move-result v1

    .line 561
    .line 562
    if-nez v1, :cond_36

    .line 563
    return v2

    .line 564
    .line 565
    :cond_36
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->supportCross:Ljava/lang/Boolean;

    .line 566
    .line 567
    iget-object v3, p1, Lcom/kubi/kumex/data/platform/model/ContractEntity;->supportCross:Ljava/lang/Boolean;

    .line 568
    .line 569
    .line 570
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 571
    move-result v1

    .line 572
    .line 573
    if-nez v1, :cond_37

    .line 574
    return v2

    .line 575
    .line 576
    :cond_37
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->marketStage:Ljava/lang/String;

    .line 577
    .line 578
    iget-object v3, p1, Lcom/kubi/kumex/data/platform/model/ContractEntity;->marketStage:Ljava/lang/String;

    .line 579
    .line 580
    .line 581
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 582
    move-result v1

    .line 583
    .line 584
    if-nez v1, :cond_38

    .line 585
    return v2

    .line 586
    .line 587
    :cond_38
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->preMarketToPerpDate:Ljava/lang/Long;

    .line 588
    .line 589
    iget-object v3, p1, Lcom/kubi/kumex/data/platform/model/ContractEntity;->preMarketToPerpDate:Ljava/lang/Long;

    .line 590
    .line 591
    .line 592
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 593
    move-result v1

    .line 594
    .line 595
    if-nez v1, :cond_39

    .line 596
    return v2

    .line 597
    .line 598
    :cond_39
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->marketMaxOrderQty:Ljava/math/BigDecimal;

    .line 599
    .line 600
    iget-object v3, p1, Lcom/kubi/kumex/data/platform/model/ContractEntity;->marketMaxOrderQty:Ljava/math/BigDecimal;

    .line 601
    .line 602
    .line 603
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 604
    move-result v1

    .line 605
    .line 606
    if-nez v1, :cond_3a

    .line 607
    return v2

    .line 608
    .line 609
    :cond_3a
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->marketType:Ljava/lang/String;

    .line 610
    .line 611
    iget-object v3, p1, Lcom/kubi/kumex/data/platform/model/ContractEntity;->marketType:Ljava/lang/String;

    .line 612
    .line 613
    .line 614
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 615
    move-result v1

    .line 616
    .line 617
    if-nez v1, :cond_3b

    .line 618
    return v2

    .line 619
    .line 620
    :cond_3b
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->assetClass:Ljava/lang/String;

    .line 621
    .line 622
    iget-object v3, p1, Lcom/kubi/kumex/data/platform/model/ContractEntity;->assetClass:Ljava/lang/String;

    .line 623
    .line 624
    .line 625
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 626
    move-result v1

    .line 627
    .line 628
    if-nez v1, :cond_3c

    .line 629
    return v2

    .line 630
    .line 631
    :cond_3c
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->subMarketType:Ljava/lang/String;

    .line 632
    .line 633
    iget-object v3, p1, Lcom/kubi/kumex/data/platform/model/ContractEntity;->subMarketType:Ljava/lang/String;

    .line 634
    .line 635
    .line 636
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 637
    move-result v1

    .line 638
    .line 639
    if-nez v1, :cond_3d

    .line 640
    return v2

    .line 641
    .line 642
    :cond_3d
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->imgUrl:Ljava/lang/String;

    .line 643
    .line 644
    iget-object p1, p1, Lcom/kubi/kumex/data/platform/model/ContractEntity;->imgUrl:Ljava/lang/String;

    .line 645
    .line 646
    .line 647
    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 648
    move-result p1

    .line 649
    .line 650
    if-nez p1, :cond_3e

    .line 651
    return v2

    .line 652
    :cond_3e
    return v0
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
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
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
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
.end method

.method public final getAdjustActiveTime()Ljava/lang/Long;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->adjustActiveTime:Ljava/lang/Long;

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

.method public final getAdjustK()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->adjustK:Ljava/math/BigDecimal;

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

.method public final getAdjustM()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->adjustM:Ljava/math/BigDecimal;

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

.method public final getAdjustMmrLevConstant()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->adjustMmrLevConstant:Ljava/math/BigDecimal;

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

.method public final getAssetClass()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->assetClass:Ljava/lang/String;

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

.method public final getBaseCurrency()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->baseCurrency:Ljava/lang/String;

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

.method public final getCreatedAt()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->createdAt:J

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

.method public final getCrossRiskLimit()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->crossRiskLimit:Ljava/math/BigDecimal;

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

.method public final getDisplayBaseCurrency()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->displayBaseCurrency:Ljava/lang/String;

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

.method public final getExpireDate()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->expireDate:J

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

.method public final getF()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->f:Ljava/math/BigDecimal;

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

.method public final getFairMethod()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->fairMethod:Ljava/lang/String;

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

.method public final getFirstOpenDate()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->firstOpenDate:J

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

.method public final getFundingBaseSymbol()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->fundingBaseSymbol:Ljava/lang/String;

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

.method public final getFundingQuoteSymbol()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->fundingQuoteSymbol:Ljava/lang/String;

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

.method public final getFundingRateSymbol()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->fundingRateSymbol:Ljava/lang/String;

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

.method public final getImgUrl()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->imgUrl:Ljava/lang/String;

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

.method public final getIndexPriceTickSize()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->indexPriceTickSize:Ljava/math/BigDecimal;

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

.method public final getIndexSymbol()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->indexSymbol:Ljava/lang/String;

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

.method public final getInitialMargin()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->initialMargin:Ljava/math/BigDecimal;

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

.method public final getK()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->k:Ljava/math/BigDecimal;

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

.method public final getLotSize()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->lotSize:Ljava/math/BigDecimal;

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

.method public final getM()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->m:Ljava/math/BigDecimal;

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

.method public final getMaintainMargin()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->maintainMargin:Ljava/math/BigDecimal;

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

.method public final getMakerFeeRate()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->makerFeeRate:Ljava/math/BigDecimal;

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

.method public final getMakerFixFee()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->makerFixFee:Ljava/math/BigDecimal;

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

.method public final getMarkMethod()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->markMethod:Ljava/lang/String;

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

.method public final getMarketMaxOrderQty()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->marketMaxOrderQty:Ljava/math/BigDecimal;

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

.method public final getMarketStage()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->marketStage:Ljava/lang/String;

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

.method public final getMarketType()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->marketType:Ljava/lang/String;

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

.method public final getMaxLeverage()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->maxLeverage:Ljava/math/BigDecimal;

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

.method public final getMaxOrderQty()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->maxOrderQty:Ljava/math/BigDecimal;

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

.method public final getMaxPrice()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->maxPrice:Ljava/math/BigDecimal;

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

.method public final getMaxRiskLimit()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->maxRiskLimit:Ljava/math/BigDecimal;

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

.method public final getMinRiskLimit()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->minRiskLimit:Ljava/math/BigDecimal;

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

.method public final getMmrLevConstant()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->mmrLevConstant:Ljava/math/BigDecimal;

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

.method public final getMmrLimit()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->mmrLimit:Ljava/math/BigDecimal;

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

.method public final getMultiplier()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->multiplier:Ljava/math/BigDecimal;

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

.method public final getPreMarketToPerpDate()Ljava/lang/Long;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->preMarketToPerpDate:Ljava/lang/Long;

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

.method public final getQuoteCurrency()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->quoteCurrency:Ljava/lang/String;

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

.method public final getRiskStep()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->riskStep:Ljava/math/BigDecimal;

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

.method public final getRootSymbol()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->rootSymbol:Ljava/lang/String;

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

.method public final getSettleCurrency()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->settleCurrency:Ljava/lang/String;

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

.method public final getSettleDate()Ljava/lang/Long;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->settleDate:Ljava/lang/Long;

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

.method public final getSettlementFee()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->settlementFee:Ljava/math/BigDecimal;

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

.method public final getSpotCurrency()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->spotCurrency:Ljava/lang/String;

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

.method public final getStatus()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->status:Ljava/lang/String;

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

.method public final getStepRiskLimitStatus()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->stepRiskLimitStatus:I

    .line 3
    return v0
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

.method public final getSubMarketType()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->subMarketType:Ljava/lang/String;

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

.method public final getSupportCross()Ljava/lang/Boolean;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->supportCross:Ljava/lang/Boolean;

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

.method public final getSupportGridTrading()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->supportGridTrading:Z

    .line 3
    return v0
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

.method public final getSymbol()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->symbol:Ljava/lang/String;

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

.method public final getTakerFeeRate()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->takerFeeRate:Ljava/math/BigDecimal;

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

.method public final getTakerFixFee()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->takerFixFee:Ljava/math/BigDecimal;

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

.method public final getTickSize()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->tickSize:Ljava/math/BigDecimal;

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

.method public final getType()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->type:Ljava/lang/String;

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

.method public final getUpdatedAt()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->updatedAt:J

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

.method public hashCode()I
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->type:Ljava/lang/String;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    move v0, v1

    .line 7
    goto :goto_0

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 11
    move-result v0

    .line 12
    .line 13
    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    .line 14
    .line 15
    iget-boolean v2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->isInverse:Z

    .line 16
    .line 17
    .line 18
    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 19
    move-result v2

    .line 20
    add-int/2addr v0, v2

    .line 21
    .line 22
    mul-int/lit8 v0, v0, 0x1f

    .line 23
    .line 24
    iget-object v2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->symbol:Ljava/lang/String;

    .line 25
    .line 26
    if-nez v2, :cond_1

    .line 27
    move v2, v1

    .line 28
    goto :goto_1

    .line 29
    .line 30
    .line 31
    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 32
    move-result v2

    .line 33
    :goto_1
    add-int/2addr v0, v2

    .line 34
    .line 35
    mul-int/lit8 v0, v0, 0x1f

    .line 36
    .line 37
    iget-object v2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->rootSymbol:Ljava/lang/String;

    .line 38
    .line 39
    if-nez v2, :cond_2

    .line 40
    move v2, v1

    .line 41
    goto :goto_2

    .line 42
    .line 43
    .line 44
    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 45
    move-result v2

    .line 46
    :goto_2
    add-int/2addr v0, v2

    .line 47
    .line 48
    mul-int/lit8 v0, v0, 0x1f

    .line 49
    .line 50
    iget-object v2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->baseCurrency:Ljava/lang/String;

    .line 51
    .line 52
    if-nez v2, :cond_3

    .line 53
    move v2, v1

    .line 54
    goto :goto_3

    .line 55
    .line 56
    .line 57
    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 58
    move-result v2

    .line 59
    :goto_3
    add-int/2addr v0, v2

    .line 60
    .line 61
    mul-int/lit8 v0, v0, 0x1f

    .line 62
    .line 63
    iget-object v2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->displayBaseCurrency:Ljava/lang/String;

    .line 64
    .line 65
    if-nez v2, :cond_4

    .line 66
    move v2, v1

    .line 67
    goto :goto_4

    .line 68
    .line 69
    .line 70
    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 71
    move-result v2

    .line 72
    :goto_4
    add-int/2addr v0, v2

    .line 73
    .line 74
    mul-int/lit8 v0, v0, 0x1f

    .line 75
    .line 76
    iget-object v2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->quoteCurrency:Ljava/lang/String;

    .line 77
    .line 78
    if-nez v2, :cond_5

    .line 79
    move v2, v1

    .line 80
    goto :goto_5

    .line 81
    .line 82
    .line 83
    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 84
    move-result v2

    .line 85
    :goto_5
    add-int/2addr v0, v2

    .line 86
    .line 87
    mul-int/lit8 v0, v0, 0x1f

    .line 88
    .line 89
    iget-object v2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->status:Ljava/lang/String;

    .line 90
    .line 91
    if-nez v2, :cond_6

    .line 92
    move v2, v1

    .line 93
    goto :goto_6

    .line 94
    .line 95
    .line 96
    :cond_6
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 97
    move-result v2

    .line 98
    :goto_6
    add-int/2addr v0, v2

    .line 99
    .line 100
    mul-int/lit8 v0, v0, 0x1f

    .line 101
    .line 102
    iget-wide v2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->createdAt:J

    .line 103
    .line 104
    .line 105
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    .line 106
    move-result v2

    .line 107
    add-int/2addr v0, v2

    .line 108
    .line 109
    mul-int/lit8 v0, v0, 0x1f

    .line 110
    .line 111
    iget-wide v2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->expireDate:J

    .line 112
    .line 113
    .line 114
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    .line 115
    move-result v2

    .line 116
    add-int/2addr v0, v2

    .line 117
    .line 118
    mul-int/lit8 v0, v0, 0x1f

    .line 119
    .line 120
    iget-wide v2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->updatedAt:J

    .line 121
    .line 122
    .line 123
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    .line 124
    move-result v2

    .line 125
    add-int/2addr v0, v2

    .line 126
    .line 127
    mul-int/lit8 v0, v0, 0x1f

    .line 128
    .line 129
    iget-object v2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->fairMethod:Ljava/lang/String;

    .line 130
    .line 131
    if-nez v2, :cond_7

    .line 132
    move v2, v1

    .line 133
    goto :goto_7

    .line 134
    .line 135
    .line 136
    :cond_7
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 137
    move-result v2

    .line 138
    :goto_7
    add-int/2addr v0, v2

    .line 139
    .line 140
    mul-int/lit8 v0, v0, 0x1f

    .line 141
    .line 142
    iget-wide v2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->firstOpenDate:J

    .line 143
    .line 144
    .line 145
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    .line 146
    move-result v2

    .line 147
    add-int/2addr v0, v2

    .line 148
    .line 149
    mul-int/lit8 v0, v0, 0x1f

    .line 150
    .line 151
    iget-object v2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->fundingBaseSymbol:Ljava/lang/String;

    .line 152
    .line 153
    if-nez v2, :cond_8

    .line 154
    move v2, v1

    .line 155
    goto :goto_8

    .line 156
    .line 157
    .line 158
    :cond_8
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 159
    move-result v2

    .line 160
    :goto_8
    add-int/2addr v0, v2

    .line 161
    .line 162
    mul-int/lit8 v0, v0, 0x1f

    .line 163
    .line 164
    iget-object v2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->fundingQuoteSymbol:Ljava/lang/String;

    .line 165
    .line 166
    if-nez v2, :cond_9

    .line 167
    move v2, v1

    .line 168
    goto :goto_9

    .line 169
    .line 170
    .line 171
    :cond_9
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 172
    move-result v2

    .line 173
    :goto_9
    add-int/2addr v0, v2

    .line 174
    .line 175
    mul-int/lit8 v0, v0, 0x1f

    .line 176
    .line 177
    iget-object v2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->fundingRateSymbol:Ljava/lang/String;

    .line 178
    .line 179
    if-nez v2, :cond_a

    .line 180
    move v2, v1

    .line 181
    goto :goto_a

    .line 182
    .line 183
    .line 184
    :cond_a
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 185
    move-result v2

    .line 186
    :goto_a
    add-int/2addr v0, v2

    .line 187
    .line 188
    mul-int/lit8 v0, v0, 0x1f

    .line 189
    .line 190
    iget-object v2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->indexSymbol:Ljava/lang/String;

    .line 191
    .line 192
    if-nez v2, :cond_b

    .line 193
    move v2, v1

    .line 194
    goto :goto_b

    .line 195
    .line 196
    .line 197
    :cond_b
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 198
    move-result v2

    .line 199
    :goto_b
    add-int/2addr v0, v2

    .line 200
    .line 201
    mul-int/lit8 v0, v0, 0x1f

    .line 202
    .line 203
    iget-object v2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->initialMargin:Ljava/math/BigDecimal;

    .line 204
    .line 205
    if-nez v2, :cond_c

    .line 206
    move v2, v1

    .line 207
    goto :goto_c

    .line 208
    .line 209
    .line 210
    :cond_c
    invoke-virtual {v2}, Ljava/math/BigDecimal;->hashCode()I

    .line 211
    move-result v2

    .line 212
    :goto_c
    add-int/2addr v0, v2

    .line 213
    .line 214
    mul-int/lit8 v0, v0, 0x1f

    .line 215
    .line 216
    iget-boolean v2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->isDeleverage:Z

    .line 217
    .line 218
    .line 219
    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 220
    move-result v2

    .line 221
    add-int/2addr v0, v2

    .line 222
    .line 223
    mul-int/lit8 v0, v0, 0x1f

    .line 224
    .line 225
    iget-boolean v2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->isQuanto:Z

    .line 226
    .line 227
    .line 228
    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 229
    move-result v2

    .line 230
    add-int/2addr v0, v2

    .line 231
    .line 232
    mul-int/lit8 v0, v0, 0x1f

    .line 233
    .line 234
    iget-object v2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->lotSize:Ljava/math/BigDecimal;

    .line 235
    .line 236
    if-nez v2, :cond_d

    .line 237
    move v2, v1

    .line 238
    goto :goto_d

    .line 239
    .line 240
    .line 241
    :cond_d
    invoke-virtual {v2}, Ljava/math/BigDecimal;->hashCode()I

    .line 242
    move-result v2

    .line 243
    :goto_d
    add-int/2addr v0, v2

    .line 244
    .line 245
    mul-int/lit8 v0, v0, 0x1f

    .line 246
    .line 247
    iget-object v2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->maintainMargin:Ljava/math/BigDecimal;

    .line 248
    .line 249
    if-nez v2, :cond_e

    .line 250
    move v2, v1

    .line 251
    goto :goto_e

    .line 252
    .line 253
    .line 254
    :cond_e
    invoke-virtual {v2}, Ljava/math/BigDecimal;->hashCode()I

    .line 255
    move-result v2

    .line 256
    :goto_e
    add-int/2addr v0, v2

    .line 257
    .line 258
    mul-int/lit8 v0, v0, 0x1f

    .line 259
    .line 260
    iget-object v2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->makerFeeRate:Ljava/math/BigDecimal;

    .line 261
    .line 262
    if-nez v2, :cond_f

    .line 263
    move v2, v1

    .line 264
    goto :goto_f

    .line 265
    .line 266
    .line 267
    :cond_f
    invoke-virtual {v2}, Ljava/math/BigDecimal;->hashCode()I

    .line 268
    move-result v2

    .line 269
    :goto_f
    add-int/2addr v0, v2

    .line 270
    .line 271
    mul-int/lit8 v0, v0, 0x1f

    .line 272
    .line 273
    iget-object v2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->makerFixFee:Ljava/math/BigDecimal;

    .line 274
    .line 275
    if-nez v2, :cond_10

    .line 276
    move v2, v1

    .line 277
    goto :goto_10

    .line 278
    .line 279
    .line 280
    :cond_10
    invoke-virtual {v2}, Ljava/math/BigDecimal;->hashCode()I

    .line 281
    move-result v2

    .line 282
    :goto_10
    add-int/2addr v0, v2

    .line 283
    .line 284
    mul-int/lit8 v0, v0, 0x1f

    .line 285
    .line 286
    iget-object v2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->markMethod:Ljava/lang/String;

    .line 287
    .line 288
    if-nez v2, :cond_11

    .line 289
    move v2, v1

    .line 290
    goto :goto_11

    .line 291
    .line 292
    .line 293
    :cond_11
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 294
    move-result v2

    .line 295
    :goto_11
    add-int/2addr v0, v2

    .line 296
    .line 297
    mul-int/lit8 v0, v0, 0x1f

    .line 298
    .line 299
    iget-object v2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->maxOrderQty:Ljava/math/BigDecimal;

    .line 300
    .line 301
    if-nez v2, :cond_12

    .line 302
    move v2, v1

    .line 303
    goto :goto_12

    .line 304
    .line 305
    .line 306
    :cond_12
    invoke-virtual {v2}, Ljava/math/BigDecimal;->hashCode()I

    .line 307
    move-result v2

    .line 308
    :goto_12
    add-int/2addr v0, v2

    .line 309
    .line 310
    mul-int/lit8 v0, v0, 0x1f

    .line 311
    .line 312
    iget-object v2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->indexPriceTickSize:Ljava/math/BigDecimal;

    .line 313
    .line 314
    if-nez v2, :cond_13

    .line 315
    move v2, v1

    .line 316
    goto :goto_13

    .line 317
    .line 318
    .line 319
    :cond_13
    invoke-virtual {v2}, Ljava/math/BigDecimal;->hashCode()I

    .line 320
    move-result v2

    .line 321
    :goto_13
    add-int/2addr v0, v2

    .line 322
    .line 323
    mul-int/lit8 v0, v0, 0x1f

    .line 324
    .line 325
    iget-object v2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->maxPrice:Ljava/math/BigDecimal;

    .line 326
    .line 327
    if-nez v2, :cond_14

    .line 328
    move v2, v1

    .line 329
    goto :goto_14

    .line 330
    .line 331
    .line 332
    :cond_14
    invoke-virtual {v2}, Ljava/math/BigDecimal;->hashCode()I

    .line 333
    move-result v2

    .line 334
    :goto_14
    add-int/2addr v0, v2

    .line 335
    .line 336
    mul-int/lit8 v0, v0, 0x1f

    .line 337
    .line 338
    iget-object v2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->maxRiskLimit:Ljava/math/BigDecimal;

    .line 339
    .line 340
    if-nez v2, :cond_15

    .line 341
    move v2, v1

    .line 342
    goto :goto_15

    .line 343
    .line 344
    .line 345
    :cond_15
    invoke-virtual {v2}, Ljava/math/BigDecimal;->hashCode()I

    .line 346
    move-result v2

    .line 347
    :goto_15
    add-int/2addr v0, v2

    .line 348
    .line 349
    mul-int/lit8 v0, v0, 0x1f

    .line 350
    .line 351
    iget-object v2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->minRiskLimit:Ljava/math/BigDecimal;

    .line 352
    .line 353
    if-nez v2, :cond_16

    .line 354
    move v2, v1

    .line 355
    goto :goto_16

    .line 356
    .line 357
    .line 358
    :cond_16
    invoke-virtual {v2}, Ljava/math/BigDecimal;->hashCode()I

    .line 359
    move-result v2

    .line 360
    :goto_16
    add-int/2addr v0, v2

    .line 361
    .line 362
    mul-int/lit8 v0, v0, 0x1f

    .line 363
    .line 364
    iget-object v2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->riskStep:Ljava/math/BigDecimal;

    .line 365
    .line 366
    if-nez v2, :cond_17

    .line 367
    move v2, v1

    .line 368
    goto :goto_17

    .line 369
    .line 370
    .line 371
    :cond_17
    invoke-virtual {v2}, Ljava/math/BigDecimal;->hashCode()I

    .line 372
    move-result v2

    .line 373
    :goto_17
    add-int/2addr v0, v2

    .line 374
    .line 375
    mul-int/lit8 v0, v0, 0x1f

    .line 376
    .line 377
    iget-object v2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->settleCurrency:Ljava/lang/String;

    .line 378
    .line 379
    if-nez v2, :cond_18

    .line 380
    move v2, v1

    .line 381
    goto :goto_18

    .line 382
    .line 383
    .line 384
    :cond_18
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 385
    move-result v2

    .line 386
    :goto_18
    add-int/2addr v0, v2

    .line 387
    .line 388
    mul-int/lit8 v0, v0, 0x1f

    .line 389
    .line 390
    iget-object v2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->settleDate:Ljava/lang/Long;

    .line 391
    .line 392
    if-nez v2, :cond_19

    .line 393
    move v2, v1

    .line 394
    goto :goto_19

    .line 395
    .line 396
    .line 397
    :cond_19
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 398
    move-result v2

    .line 399
    :goto_19
    add-int/2addr v0, v2

    .line 400
    .line 401
    mul-int/lit8 v0, v0, 0x1f

    .line 402
    .line 403
    iget-object v2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->settlementFee:Ljava/math/BigDecimal;

    .line 404
    .line 405
    if-nez v2, :cond_1a

    .line 406
    move v2, v1

    .line 407
    goto :goto_1a

    .line 408
    .line 409
    .line 410
    :cond_1a
    invoke-virtual {v2}, Ljava/math/BigDecimal;->hashCode()I

    .line 411
    move-result v2

    .line 412
    :goto_1a
    add-int/2addr v0, v2

    .line 413
    .line 414
    mul-int/lit8 v0, v0, 0x1f

    .line 415
    .line 416
    iget-object v2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->takerFeeRate:Ljava/math/BigDecimal;

    .line 417
    .line 418
    if-nez v2, :cond_1b

    .line 419
    move v2, v1

    .line 420
    goto :goto_1b

    .line 421
    .line 422
    .line 423
    :cond_1b
    invoke-virtual {v2}, Ljava/math/BigDecimal;->hashCode()I

    .line 424
    move-result v2

    .line 425
    :goto_1b
    add-int/2addr v0, v2

    .line 426
    .line 427
    mul-int/lit8 v0, v0, 0x1f

    .line 428
    .line 429
    iget-object v2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->takerFixFee:Ljava/math/BigDecimal;

    .line 430
    .line 431
    if-nez v2, :cond_1c

    .line 432
    move v2, v1

    .line 433
    goto :goto_1c

    .line 434
    .line 435
    .line 436
    :cond_1c
    invoke-virtual {v2}, Ljava/math/BigDecimal;->hashCode()I

    .line 437
    move-result v2

    .line 438
    :goto_1c
    add-int/2addr v0, v2

    .line 439
    .line 440
    mul-int/lit8 v0, v0, 0x1f

    .line 441
    .line 442
    iget-object v2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->tickSize:Ljava/math/BigDecimal;

    .line 443
    .line 444
    if-nez v2, :cond_1d

    .line 445
    move v2, v1

    .line 446
    goto :goto_1d

    .line 447
    .line 448
    .line 449
    :cond_1d
    invoke-virtual {v2}, Ljava/math/BigDecimal;->hashCode()I

    .line 450
    move-result v2

    .line 451
    :goto_1d
    add-int/2addr v0, v2

    .line 452
    .line 453
    mul-int/lit8 v0, v0, 0x1f

    .line 454
    .line 455
    iget-object v2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->multiplier:Ljava/math/BigDecimal;

    .line 456
    .line 457
    if-nez v2, :cond_1e

    .line 458
    move v2, v1

    .line 459
    goto :goto_1e

    .line 460
    .line 461
    .line 462
    :cond_1e
    invoke-virtual {v2}, Ljava/math/BigDecimal;->hashCode()I

    .line 463
    move-result v2

    .line 464
    :goto_1e
    add-int/2addr v0, v2

    .line 465
    .line 466
    mul-int/lit8 v0, v0, 0x1f

    .line 467
    .line 468
    iget-object v2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->maxLeverage:Ljava/math/BigDecimal;

    .line 469
    .line 470
    if-nez v2, :cond_1f

    .line 471
    move v2, v1

    .line 472
    goto :goto_1f

    .line 473
    .line 474
    .line 475
    :cond_1f
    invoke-virtual {v2}, Ljava/math/BigDecimal;->hashCode()I

    .line 476
    move-result v2

    .line 477
    :goto_1f
    add-int/2addr v0, v2

    .line 478
    .line 479
    mul-int/lit8 v0, v0, 0x1f

    .line 480
    .line 481
    iget-boolean v2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->supportGridTrading:Z

    .line 482
    .line 483
    .line 484
    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 485
    move-result v2

    .line 486
    add-int/2addr v0, v2

    .line 487
    .line 488
    mul-int/lit8 v0, v0, 0x1f

    .line 489
    .line 490
    iget v2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->stepRiskLimitStatus:I

    .line 491
    .line 492
    .line 493
    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    .line 494
    move-result v2

    .line 495
    add-int/2addr v0, v2

    .line 496
    .line 497
    mul-int/lit8 v0, v0, 0x1f

    .line 498
    .line 499
    iget-boolean v2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->isTrialFunds:Z

    .line 500
    .line 501
    .line 502
    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 503
    move-result v2

    .line 504
    add-int/2addr v0, v2

    .line 505
    .line 506
    mul-int/lit8 v0, v0, 0x1f

    .line 507
    .line 508
    iget-object v2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->spotCurrency:Ljava/lang/String;

    .line 509
    .line 510
    if-nez v2, :cond_20

    .line 511
    move v2, v1

    .line 512
    goto :goto_20

    .line 513
    .line 514
    .line 515
    :cond_20
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 516
    move-result v2

    .line 517
    :goto_20
    add-int/2addr v0, v2

    .line 518
    .line 519
    mul-int/lit8 v0, v0, 0x1f

    .line 520
    .line 521
    iget-object v2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->k:Ljava/math/BigDecimal;

    .line 522
    .line 523
    if-nez v2, :cond_21

    .line 524
    move v2, v1

    .line 525
    goto :goto_21

    .line 526
    .line 527
    .line 528
    :cond_21
    invoke-virtual {v2}, Ljava/math/BigDecimal;->hashCode()I

    .line 529
    move-result v2

    .line 530
    :goto_21
    add-int/2addr v0, v2

    .line 531
    .line 532
    mul-int/lit8 v0, v0, 0x1f

    .line 533
    .line 534
    iget-object v2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->m:Ljava/math/BigDecimal;

    .line 535
    .line 536
    if-nez v2, :cond_22

    .line 537
    move v2, v1

    .line 538
    goto :goto_22

    .line 539
    .line 540
    .line 541
    :cond_22
    invoke-virtual {v2}, Ljava/math/BigDecimal;->hashCode()I

    .line 542
    move-result v2

    .line 543
    :goto_22
    add-int/2addr v0, v2

    .line 544
    .line 545
    mul-int/lit8 v0, v0, 0x1f

    .line 546
    .line 547
    iget-object v2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->f:Ljava/math/BigDecimal;

    .line 548
    .line 549
    if-nez v2, :cond_23

    .line 550
    move v2, v1

    .line 551
    goto :goto_23

    .line 552
    .line 553
    .line 554
    :cond_23
    invoke-virtual {v2}, Ljava/math/BigDecimal;->hashCode()I

    .line 555
    move-result v2

    .line 556
    :goto_23
    add-int/2addr v0, v2

    .line 557
    .line 558
    mul-int/lit8 v0, v0, 0x1f

    .line 559
    .line 560
    iget-object v2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->mmrLimit:Ljava/math/BigDecimal;

    .line 561
    .line 562
    if-nez v2, :cond_24

    .line 563
    move v2, v1

    .line 564
    goto :goto_24

    .line 565
    .line 566
    .line 567
    :cond_24
    invoke-virtual {v2}, Ljava/math/BigDecimal;->hashCode()I

    .line 568
    move-result v2

    .line 569
    :goto_24
    add-int/2addr v0, v2

    .line 570
    .line 571
    mul-int/lit8 v0, v0, 0x1f

    .line 572
    .line 573
    iget-object v2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->mmrLevConstant:Ljava/math/BigDecimal;

    .line 574
    .line 575
    if-nez v2, :cond_25

    .line 576
    move v2, v1

    .line 577
    goto :goto_25

    .line 578
    .line 579
    .line 580
    :cond_25
    invoke-virtual {v2}, Ljava/math/BigDecimal;->hashCode()I

    .line 581
    move-result v2

    .line 582
    :goto_25
    add-int/2addr v0, v2

    .line 583
    .line 584
    mul-int/lit8 v0, v0, 0x1f

    .line 585
    .line 586
    iget-object v2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->crossRiskLimit:Ljava/math/BigDecimal;

    .line 587
    .line 588
    if-nez v2, :cond_26

    .line 589
    move v2, v1

    .line 590
    goto :goto_26

    .line 591
    .line 592
    .line 593
    :cond_26
    invoke-virtual {v2}, Ljava/math/BigDecimal;->hashCode()I

    .line 594
    move-result v2

    .line 595
    :goto_26
    add-int/2addr v0, v2

    .line 596
    .line 597
    mul-int/lit8 v0, v0, 0x1f

    .line 598
    .line 599
    iget-object v2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->adjustK:Ljava/math/BigDecimal;

    .line 600
    .line 601
    if-nez v2, :cond_27

    .line 602
    move v2, v1

    .line 603
    goto :goto_27

    .line 604
    .line 605
    .line 606
    :cond_27
    invoke-virtual {v2}, Ljava/math/BigDecimal;->hashCode()I

    .line 607
    move-result v2

    .line 608
    :goto_27
    add-int/2addr v0, v2

    .line 609
    .line 610
    mul-int/lit8 v0, v0, 0x1f

    .line 611
    .line 612
    iget-object v2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->adjustM:Ljava/math/BigDecimal;

    .line 613
    .line 614
    if-nez v2, :cond_28

    .line 615
    move v2, v1

    .line 616
    goto :goto_28

    .line 617
    .line 618
    .line 619
    :cond_28
    invoke-virtual {v2}, Ljava/math/BigDecimal;->hashCode()I

    .line 620
    move-result v2

    .line 621
    :goto_28
    add-int/2addr v0, v2

    .line 622
    .line 623
    mul-int/lit8 v0, v0, 0x1f

    .line 624
    .line 625
    iget-object v2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->adjustMmrLevConstant:Ljava/math/BigDecimal;

    .line 626
    .line 627
    if-nez v2, :cond_29

    .line 628
    move v2, v1

    .line 629
    goto :goto_29

    .line 630
    .line 631
    .line 632
    :cond_29
    invoke-virtual {v2}, Ljava/math/BigDecimal;->hashCode()I

    .line 633
    move-result v2

    .line 634
    :goto_29
    add-int/2addr v0, v2

    .line 635
    .line 636
    mul-int/lit8 v0, v0, 0x1f

    .line 637
    .line 638
    iget-object v2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->adjustActiveTime:Ljava/lang/Long;

    .line 639
    .line 640
    if-nez v2, :cond_2a

    .line 641
    move v2, v1

    .line 642
    goto :goto_2a

    .line 643
    .line 644
    .line 645
    :cond_2a
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 646
    move-result v2

    .line 647
    :goto_2a
    add-int/2addr v0, v2

    .line 648
    .line 649
    mul-int/lit8 v0, v0, 0x1f

    .line 650
    .line 651
    iget-object v2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->supportCross:Ljava/lang/Boolean;

    .line 652
    .line 653
    if-nez v2, :cond_2b

    .line 654
    move v2, v1

    .line 655
    goto :goto_2b

    .line 656
    .line 657
    .line 658
    :cond_2b
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 659
    move-result v2

    .line 660
    :goto_2b
    add-int/2addr v0, v2

    .line 661
    .line 662
    mul-int/lit8 v0, v0, 0x1f

    .line 663
    .line 664
    iget-object v2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->marketStage:Ljava/lang/String;

    .line 665
    .line 666
    if-nez v2, :cond_2c

    .line 667
    move v2, v1

    .line 668
    goto :goto_2c

    .line 669
    .line 670
    .line 671
    :cond_2c
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 672
    move-result v2

    .line 673
    :goto_2c
    add-int/2addr v0, v2

    .line 674
    .line 675
    mul-int/lit8 v0, v0, 0x1f

    .line 676
    .line 677
    iget-object v2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->preMarketToPerpDate:Ljava/lang/Long;

    .line 678
    .line 679
    if-nez v2, :cond_2d

    .line 680
    move v2, v1

    .line 681
    goto :goto_2d

    .line 682
    .line 683
    .line 684
    :cond_2d
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 685
    move-result v2

    .line 686
    :goto_2d
    add-int/2addr v0, v2

    .line 687
    .line 688
    mul-int/lit8 v0, v0, 0x1f

    .line 689
    .line 690
    iget-object v2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->marketMaxOrderQty:Ljava/math/BigDecimal;

    .line 691
    .line 692
    if-nez v2, :cond_2e

    .line 693
    move v2, v1

    .line 694
    goto :goto_2e

    .line 695
    .line 696
    .line 697
    :cond_2e
    invoke-virtual {v2}, Ljava/math/BigDecimal;->hashCode()I

    .line 698
    move-result v2

    .line 699
    :goto_2e
    add-int/2addr v0, v2

    .line 700
    .line 701
    mul-int/lit8 v0, v0, 0x1f

    .line 702
    .line 703
    iget-object v2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->marketType:Ljava/lang/String;

    .line 704
    .line 705
    if-nez v2, :cond_2f

    .line 706
    move v2, v1

    .line 707
    goto :goto_2f

    .line 708
    .line 709
    .line 710
    :cond_2f
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 711
    move-result v2

    .line 712
    :goto_2f
    add-int/2addr v0, v2

    .line 713
    .line 714
    mul-int/lit8 v0, v0, 0x1f

    .line 715
    .line 716
    iget-object v2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->assetClass:Ljava/lang/String;

    .line 717
    .line 718
    if-nez v2, :cond_30

    .line 719
    move v2, v1

    .line 720
    goto :goto_30

    .line 721
    .line 722
    .line 723
    :cond_30
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 724
    move-result v2

    .line 725
    :goto_30
    add-int/2addr v0, v2

    .line 726
    .line 727
    mul-int/lit8 v0, v0, 0x1f

    .line 728
    .line 729
    iget-object v2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->subMarketType:Ljava/lang/String;

    .line 730
    .line 731
    if-nez v2, :cond_31

    .line 732
    move v2, v1

    .line 733
    goto :goto_31

    .line 734
    .line 735
    .line 736
    :cond_31
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 737
    move-result v2

    .line 738
    :goto_31
    add-int/2addr v0, v2

    .line 739
    .line 740
    mul-int/lit8 v0, v0, 0x1f

    .line 741
    .line 742
    iget-object v2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->imgUrl:Ljava/lang/String;

    .line 743
    .line 744
    if-nez v2, :cond_32

    .line 745
    goto :goto_32

    .line 746
    .line 747
    .line 748
    :cond_32
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 749
    move-result v1

    .line 750
    :goto_32
    add-int/2addr v0, v1

    .line 751
    return v0
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
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
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
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
.end method

.method public final isDeleverage()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->isDeleverage:Z

    .line 3
    return v0
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

.method public final isInverse()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->isInverse:Z

    .line 3
    return v0
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

.method public final isPreMarket()Z
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->marketStage:Ljava/lang/String;

    .line 3
    .line 4
    const-string v1, "PRE_MARKET"

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    move-result v0

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

.method public final isQuanto()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->isQuanto:Z

    .line 3
    return v0
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

.method public final isStock()Z
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->assetClass:Ljava/lang/String;

    .line 3
    .line 4
    const-string v1, "STOCK"

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    move-result v0

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

.method public final isTrialFunds()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->isTrialFunds:Z

    .line 3
    return v0
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

.method public final isUsStock()Z
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->isStock()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->subMarketType:Ljava/lang/String;

    .line 9
    .line 10
    const-string v1, "US.STOCK"

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

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

.method public final isUsStockMarket()Z
    .locals 1
    .annotation runtime Lkotlin/Deprecated;
        message = "Use isUsStock()"
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->isUsStock()Z

    .line 4
    move-result v0

    .line 5
    return v0
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

.method public final setBaseCurrency(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->baseCurrency:Ljava/lang/String;

    .line 3
    return-void
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
.end method

.method public final setCreatedAt(J)V
    .locals 0

    .line 1
    .line 2
    iput-wide p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->createdAt:J

    .line 3
    return-void
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
.end method

.method public final setDeleverage(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->isDeleverage:Z

    .line 3
    return-void
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
.end method

.method public final setDisplayBaseCurrency(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->displayBaseCurrency:Ljava/lang/String;

    .line 3
    return-void
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
.end method

.method public final setExpireDate(J)V
    .locals 0

    .line 1
    .line 2
    iput-wide p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->expireDate:J

    .line 3
    return-void
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
.end method

.method public final setFairMethod(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->fairMethod:Ljava/lang/String;

    .line 3
    return-void
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
.end method

.method public final setFirstOpenDate(J)V
    .locals 0

    .line 1
    .line 2
    iput-wide p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->firstOpenDate:J

    .line 3
    return-void
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
.end method

.method public final setFundingBaseSymbol(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->fundingBaseSymbol:Ljava/lang/String;

    .line 3
    return-void
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
.end method

.method public final setFundingQuoteSymbol(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->fundingQuoteSymbol:Ljava/lang/String;

    .line 3
    return-void
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
.end method

.method public final setFundingRateSymbol(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->fundingRateSymbol:Ljava/lang/String;

    .line 3
    return-void
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
.end method

.method public final setIndexPriceTickSize(Ljava/math/BigDecimal;)V
    .locals 0
    .param p1    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->indexPriceTickSize:Ljava/math/BigDecimal;

    .line 3
    return-void
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
.end method

.method public final setIndexSymbol(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->indexSymbol:Ljava/lang/String;

    .line 3
    return-void
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
.end method

.method public final setInitialMargin(Ljava/math/BigDecimal;)V
    .locals 0
    .param p1    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->initialMargin:Ljava/math/BigDecimal;

    .line 3
    return-void
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
.end method

.method public final setInverse(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->isInverse:Z

    .line 3
    return-void
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
.end method

.method public final setLotSize(Ljava/math/BigDecimal;)V
    .locals 0
    .param p1    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->lotSize:Ljava/math/BigDecimal;

    .line 3
    return-void
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
.end method

.method public final setMaintainMargin(Ljava/math/BigDecimal;)V
    .locals 0
    .param p1    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->maintainMargin:Ljava/math/BigDecimal;

    .line 3
    return-void
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
.end method

.method public final setMakerFeeRate(Ljava/math/BigDecimal;)V
    .locals 0
    .param p1    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->makerFeeRate:Ljava/math/BigDecimal;

    .line 3
    return-void
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
.end method

.method public final setMakerFixFee(Ljava/math/BigDecimal;)V
    .locals 0
    .param p1    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->makerFixFee:Ljava/math/BigDecimal;

    .line 3
    return-void
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
.end method

.method public final setMarkMethod(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->markMethod:Ljava/lang/String;

    .line 3
    return-void
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
.end method

.method public final setMaxLeverage(Ljava/math/BigDecimal;)V
    .locals 0
    .param p1    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->maxLeverage:Ljava/math/BigDecimal;

    .line 3
    return-void
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
.end method

.method public final setMaxOrderQty(Ljava/math/BigDecimal;)V
    .locals 0
    .param p1    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->maxOrderQty:Ljava/math/BigDecimal;

    .line 3
    return-void
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
.end method

.method public final setMaxPrice(Ljava/math/BigDecimal;)V
    .locals 0
    .param p1    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->maxPrice:Ljava/math/BigDecimal;

    .line 3
    return-void
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
.end method

.method public final setMaxRiskLimit(Ljava/math/BigDecimal;)V
    .locals 0
    .param p1    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->maxRiskLimit:Ljava/math/BigDecimal;

    .line 3
    return-void
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
.end method

.method public final setMinRiskLimit(Ljava/math/BigDecimal;)V
    .locals 0
    .param p1    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->minRiskLimit:Ljava/math/BigDecimal;

    .line 3
    return-void
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
.end method

.method public final setMultiplier(Ljava/math/BigDecimal;)V
    .locals 0
    .param p1    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->multiplier:Ljava/math/BigDecimal;

    .line 3
    return-void
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
.end method

.method public final setQuanto(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->isQuanto:Z

    .line 3
    return-void
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
.end method

.method public final setQuoteCurrency(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->quoteCurrency:Ljava/lang/String;

    .line 3
    return-void
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
.end method

.method public final setRiskStep(Ljava/math/BigDecimal;)V
    .locals 0
    .param p1    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->riskStep:Ljava/math/BigDecimal;

    .line 3
    return-void
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
.end method

.method public final setRootSymbol(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->rootSymbol:Ljava/lang/String;

    .line 3
    return-void
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
.end method

.method public final setSettleCurrency(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->settleCurrency:Ljava/lang/String;

    .line 3
    return-void
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
.end method

.method public final setSettleDate(Ljava/lang/Long;)V
    .locals 0
    .param p1    # Ljava/lang/Long;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->settleDate:Ljava/lang/Long;

    .line 3
    return-void
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
.end method

.method public final setSettlementFee(Ljava/math/BigDecimal;)V
    .locals 0
    .param p1    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->settlementFee:Ljava/math/BigDecimal;

    .line 3
    return-void
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
.end method

.method public final setSpotCurrency(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->spotCurrency:Ljava/lang/String;

    .line 3
    return-void
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
.end method

.method public final setStatus(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->status:Ljava/lang/String;

    .line 3
    return-void
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
.end method

.method public final setStepRiskLimitStatus(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->stepRiskLimitStatus:I

    .line 3
    return-void
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
.end method

.method public final setSupportGridTrading(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->supportGridTrading:Z

    .line 3
    return-void
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
.end method

.method public final setSymbol(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->symbol:Ljava/lang/String;

    .line 3
    return-void
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
.end method

.method public final setTakerFeeRate(Ljava/math/BigDecimal;)V
    .locals 0
    .param p1    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->takerFeeRate:Ljava/math/BigDecimal;

    .line 3
    return-void
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
.end method

.method public final setTakerFixFee(Ljava/math/BigDecimal;)V
    .locals 0
    .param p1    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->takerFixFee:Ljava/math/BigDecimal;

    .line 3
    return-void
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
.end method

.method public final setTickSize(Ljava/math/BigDecimal;)V
    .locals 0
    .param p1    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->tickSize:Ljava/math/BigDecimal;

    .line 3
    return-void
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
.end method

.method public final setTrialFunds(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->isTrialFunds:Z

    .line 3
    return-void
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
.end method

.method public final setType(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->type:Ljava/lang/String;

    .line 3
    return-void
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
.end method

.method public final setUpdatedAt(J)V
    .locals 0

    .line 1
    .line 2
    iput-wide p1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->updatedAt:J

    .line 3
    return-void
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
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    const-string v1, "ContractEntity(type="

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->type:Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v1, ", isInverse="

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    iget-boolean v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->isInverse:Z

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    const-string v1, ", symbol="

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->symbol:Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string v1, ", rootSymbol="

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->rootSymbol:Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    const-string v1, ", baseCurrency="

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->baseCurrency:Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    const-string v1, ", displayBaseCurrency="

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->displayBaseCurrency:Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    const-string v1, ", quoteCurrency="

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->quoteCurrency:Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    const-string v1, ", status="

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->status:Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    const-string v1, ", createdAt="

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    iget-wide v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->createdAt:J

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    const-string v1, ", expireDate="

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    iget-wide v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->expireDate:J

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    const-string v1, ", updatedAt="

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    iget-wide v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->updatedAt:J

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    const-string v1, ", fairMethod="

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->fairMethod:Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    const-string v1, ", firstOpenDate="

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    iget-wide v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->firstOpenDate:J

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    const-string v1, ", fundingBaseSymbol="

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->fundingBaseSymbol:Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    const-string v1, ", fundingQuoteSymbol="

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->fundingQuoteSymbol:Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    const-string v1, ", fundingRateSymbol="

    .line 158
    .line 159
    .line 160
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->fundingRateSymbol:Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    const-string v1, ", indexSymbol="

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->indexSymbol:Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    const-string v1, ", initialMargin="

    .line 178
    .line 179
    .line 180
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->initialMargin:Ljava/math/BigDecimal;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    const-string v1, ", isDeleverage="

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    iget-boolean v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->isDeleverage:Z

    .line 193
    .line 194
    .line 195
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    const-string v1, ", isQuanto="

    .line 198
    .line 199
    .line 200
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    iget-boolean v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->isQuanto:Z

    .line 203
    .line 204
    .line 205
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    const-string v1, ", lotSize="

    .line 208
    .line 209
    .line 210
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->lotSize:Ljava/math/BigDecimal;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    const-string v1, ", maintainMargin="

    .line 218
    .line 219
    .line 220
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->maintainMargin:Ljava/math/BigDecimal;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    const-string v1, ", makerFeeRate="

    .line 228
    .line 229
    .line 230
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->makerFeeRate:Ljava/math/BigDecimal;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    const-string v1, ", makerFixFee="

    .line 238
    .line 239
    .line 240
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->makerFixFee:Ljava/math/BigDecimal;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    const-string v1, ", markMethod="

    .line 248
    .line 249
    .line 250
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->markMethod:Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    const-string v1, ", maxOrderQty="

    .line 258
    .line 259
    .line 260
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->maxOrderQty:Ljava/math/BigDecimal;

    .line 263
    .line 264
    .line 265
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 266
    .line 267
    const-string v1, ", indexPriceTickSize="

    .line 268
    .line 269
    .line 270
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->indexPriceTickSize:Ljava/math/BigDecimal;

    .line 273
    .line 274
    .line 275
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 276
    .line 277
    const-string v1, ", maxPrice="

    .line 278
    .line 279
    .line 280
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 281
    .line 282
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->maxPrice:Ljava/math/BigDecimal;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 286
    .line 287
    const-string v1, ", maxRiskLimit="

    .line 288
    .line 289
    .line 290
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 291
    .line 292
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->maxRiskLimit:Ljava/math/BigDecimal;

    .line 293
    .line 294
    .line 295
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 296
    .line 297
    const-string v1, ", minRiskLimit="

    .line 298
    .line 299
    .line 300
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 301
    .line 302
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->minRiskLimit:Ljava/math/BigDecimal;

    .line 303
    .line 304
    .line 305
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 306
    .line 307
    const-string v1, ", riskStep="

    .line 308
    .line 309
    .line 310
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 311
    .line 312
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->riskStep:Ljava/math/BigDecimal;

    .line 313
    .line 314
    .line 315
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 316
    .line 317
    const-string v1, ", settleCurrency="

    .line 318
    .line 319
    .line 320
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 321
    .line 322
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->settleCurrency:Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 326
    .line 327
    const-string v1, ", settleDate="

    .line 328
    .line 329
    .line 330
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 331
    .line 332
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->settleDate:Ljava/lang/Long;

    .line 333
    .line 334
    .line 335
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 336
    .line 337
    const-string v1, ", settlementFee="

    .line 338
    .line 339
    .line 340
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 341
    .line 342
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->settlementFee:Ljava/math/BigDecimal;

    .line 343
    .line 344
    .line 345
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 346
    .line 347
    const-string v1, ", takerFeeRate="

    .line 348
    .line 349
    .line 350
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 351
    .line 352
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->takerFeeRate:Ljava/math/BigDecimal;

    .line 353
    .line 354
    .line 355
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 356
    .line 357
    const-string v1, ", takerFixFee="

    .line 358
    .line 359
    .line 360
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 361
    .line 362
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->takerFixFee:Ljava/math/BigDecimal;

    .line 363
    .line 364
    .line 365
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 366
    .line 367
    const-string v1, ", tickSize="

    .line 368
    .line 369
    .line 370
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 371
    .line 372
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->tickSize:Ljava/math/BigDecimal;

    .line 373
    .line 374
    .line 375
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 376
    .line 377
    const-string v1, ", multiplier="

    .line 378
    .line 379
    .line 380
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 381
    .line 382
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->multiplier:Ljava/math/BigDecimal;

    .line 383
    .line 384
    .line 385
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 386
    .line 387
    const-string v1, ", maxLeverage="

    .line 388
    .line 389
    .line 390
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 391
    .line 392
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->maxLeverage:Ljava/math/BigDecimal;

    .line 393
    .line 394
    .line 395
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 396
    .line 397
    const-string v1, ", supportGridTrading="

    .line 398
    .line 399
    .line 400
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 401
    .line 402
    iget-boolean v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->supportGridTrading:Z

    .line 403
    .line 404
    .line 405
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 406
    .line 407
    const-string v1, ", stepRiskLimitStatus="

    .line 408
    .line 409
    .line 410
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 411
    .line 412
    iget v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->stepRiskLimitStatus:I

    .line 413
    .line 414
    .line 415
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 416
    .line 417
    const-string v1, ", isTrialFunds="

    .line 418
    .line 419
    .line 420
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 421
    .line 422
    iget-boolean v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->isTrialFunds:Z

    .line 423
    .line 424
    .line 425
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 426
    .line 427
    const-string v1, ", spotCurrency="

    .line 428
    .line 429
    .line 430
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 431
    .line 432
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->spotCurrency:Ljava/lang/String;

    .line 433
    .line 434
    .line 435
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 436
    .line 437
    const-string v1, ", k="

    .line 438
    .line 439
    .line 440
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 441
    .line 442
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->k:Ljava/math/BigDecimal;

    .line 443
    .line 444
    .line 445
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 446
    .line 447
    const-string v1, ", m="

    .line 448
    .line 449
    .line 450
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 451
    .line 452
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->m:Ljava/math/BigDecimal;

    .line 453
    .line 454
    .line 455
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 456
    .line 457
    const-string v1, ", f="

    .line 458
    .line 459
    .line 460
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 461
    .line 462
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->f:Ljava/math/BigDecimal;

    .line 463
    .line 464
    .line 465
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 466
    .line 467
    const-string v1, ", mmrLimit="

    .line 468
    .line 469
    .line 470
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 471
    .line 472
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->mmrLimit:Ljava/math/BigDecimal;

    .line 473
    .line 474
    .line 475
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 476
    .line 477
    const-string v1, ", mmrLevConstant="

    .line 478
    .line 479
    .line 480
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 481
    .line 482
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->mmrLevConstant:Ljava/math/BigDecimal;

    .line 483
    .line 484
    .line 485
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 486
    .line 487
    const-string v1, ", crossRiskLimit="

    .line 488
    .line 489
    .line 490
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 491
    .line 492
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->crossRiskLimit:Ljava/math/BigDecimal;

    .line 493
    .line 494
    .line 495
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 496
    .line 497
    const-string v1, ", adjustK="

    .line 498
    .line 499
    .line 500
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 501
    .line 502
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->adjustK:Ljava/math/BigDecimal;

    .line 503
    .line 504
    .line 505
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 506
    .line 507
    const-string v1, ", adjustM="

    .line 508
    .line 509
    .line 510
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 511
    .line 512
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->adjustM:Ljava/math/BigDecimal;

    .line 513
    .line 514
    .line 515
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 516
    .line 517
    const-string v1, ", adjustMmrLevConstant="

    .line 518
    .line 519
    .line 520
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 521
    .line 522
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->adjustMmrLevConstant:Ljava/math/BigDecimal;

    .line 523
    .line 524
    .line 525
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 526
    .line 527
    const-string v1, ", adjustActiveTime="

    .line 528
    .line 529
    .line 530
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 531
    .line 532
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->adjustActiveTime:Ljava/lang/Long;

    .line 533
    .line 534
    .line 535
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 536
    .line 537
    const-string v1, ", supportCross="

    .line 538
    .line 539
    .line 540
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 541
    .line 542
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->supportCross:Ljava/lang/Boolean;

    .line 543
    .line 544
    .line 545
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 546
    .line 547
    const-string v1, ", marketStage="

    .line 548
    .line 549
    .line 550
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 551
    .line 552
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->marketStage:Ljava/lang/String;

    .line 553
    .line 554
    .line 555
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 556
    .line 557
    const-string v1, ", preMarketToPerpDate="

    .line 558
    .line 559
    .line 560
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 561
    .line 562
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->preMarketToPerpDate:Ljava/lang/Long;

    .line 563
    .line 564
    .line 565
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 566
    .line 567
    const-string v1, ", marketMaxOrderQty="

    .line 568
    .line 569
    .line 570
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 571
    .line 572
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->marketMaxOrderQty:Ljava/math/BigDecimal;

    .line 573
    .line 574
    .line 575
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 576
    .line 577
    const-string v1, ", marketType="

    .line 578
    .line 579
    .line 580
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 581
    .line 582
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->marketType:Ljava/lang/String;

    .line 583
    .line 584
    .line 585
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 586
    .line 587
    const-string v1, ", assetClass="

    .line 588
    .line 589
    .line 590
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 591
    .line 592
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->assetClass:Ljava/lang/String;

    .line 593
    .line 594
    .line 595
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 596
    .line 597
    const-string v1, ", subMarketType="

    .line 598
    .line 599
    .line 600
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 601
    .line 602
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->subMarketType:Ljava/lang/String;

    .line 603
    .line 604
    .line 605
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 606
    .line 607
    const-string v1, ", imgUrl="

    .line 608
    .line 609
    .line 610
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 611
    .line 612
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->imgUrl:Ljava/lang/String;

    .line 613
    .line 614
    .line 615
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 616
    .line 617
    const/16 v1, 0x29

    .line 618
    .line 619
    .line 620
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 621
    .line 622
    .line 623
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 624
    move-result-object v0

    .line 625
    return-object v0
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
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
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
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4
    .param p1    # Landroid/os/Parcel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string p2, "dest"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object p2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->type:Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 11
    .line 12
    iget-boolean p2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->isInverse:Z

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 16
    .line 17
    iget-object p2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->symbol:Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 21
    .line 22
    iget-object p2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->rootSymbol:Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 26
    .line 27
    iget-object p2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->baseCurrency:Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 31
    .line 32
    iget-object p2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->displayBaseCurrency:Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 36
    .line 37
    iget-object p2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->quoteCurrency:Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 41
    .line 42
    iget-object p2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->status:Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 46
    .line 47
    iget-wide v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->createdAt:J

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 51
    .line 52
    iget-wide v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->expireDate:J

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 56
    .line 57
    iget-wide v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->updatedAt:J

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 61
    .line 62
    iget-object p2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->fairMethod:Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 66
    .line 67
    iget-wide v0, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->firstOpenDate:J

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 71
    .line 72
    iget-object p2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->fundingBaseSymbol:Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 76
    .line 77
    iget-object p2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->fundingQuoteSymbol:Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 81
    .line 82
    iget-object p2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->fundingRateSymbol:Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 86
    .line 87
    iget-object p2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->indexSymbol:Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 91
    .line 92
    iget-object p2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->initialMargin:Ljava/math/BigDecimal;

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 96
    .line 97
    iget-boolean p2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->isDeleverage:Z

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 101
    .line 102
    iget-boolean p2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->isQuanto:Z

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 106
    .line 107
    iget-object p2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->lotSize:Ljava/math/BigDecimal;

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 111
    .line 112
    iget-object p2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->maintainMargin:Ljava/math/BigDecimal;

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 116
    .line 117
    iget-object p2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->makerFeeRate:Ljava/math/BigDecimal;

    .line 118
    .line 119
    .line 120
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 121
    .line 122
    iget-object p2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->makerFixFee:Ljava/math/BigDecimal;

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 126
    .line 127
    iget-object p2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->markMethod:Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 131
    .line 132
    iget-object p2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->maxOrderQty:Ljava/math/BigDecimal;

    .line 133
    .line 134
    .line 135
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 136
    .line 137
    iget-object p2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->indexPriceTickSize:Ljava/math/BigDecimal;

    .line 138
    .line 139
    .line 140
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 141
    .line 142
    iget-object p2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->maxPrice:Ljava/math/BigDecimal;

    .line 143
    .line 144
    .line 145
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 146
    .line 147
    iget-object p2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->maxRiskLimit:Ljava/math/BigDecimal;

    .line 148
    .line 149
    .line 150
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 151
    .line 152
    iget-object p2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->minRiskLimit:Ljava/math/BigDecimal;

    .line 153
    .line 154
    .line 155
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 156
    .line 157
    iget-object p2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->riskStep:Ljava/math/BigDecimal;

    .line 158
    .line 159
    .line 160
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 161
    .line 162
    iget-object p2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->settleCurrency:Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 166
    .line 167
    iget-object p2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->settleDate:Ljava/lang/Long;

    .line 168
    const/4 v0, 0x1

    .line 169
    const/4 v1, 0x0

    .line 170
    .line 171
    if-nez p2, :cond_0

    .line 172
    .line 173
    .line 174
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 175
    goto :goto_0

    .line 176
    .line 177
    .line 178
    :cond_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 182
    move-result-wide v2

    .line 183
    .line 184
    .line 185
    invoke-virtual {p1, v2, v3}, Landroid/os/Parcel;->writeLong(J)V

    .line 186
    .line 187
    :goto_0
    iget-object p2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->settlementFee:Ljava/math/BigDecimal;

    .line 188
    .line 189
    .line 190
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 191
    .line 192
    iget-object p2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->takerFeeRate:Ljava/math/BigDecimal;

    .line 193
    .line 194
    .line 195
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 196
    .line 197
    iget-object p2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->takerFixFee:Ljava/math/BigDecimal;

    .line 198
    .line 199
    .line 200
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 201
    .line 202
    iget-object p2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->tickSize:Ljava/math/BigDecimal;

    .line 203
    .line 204
    .line 205
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 206
    .line 207
    iget-object p2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->multiplier:Ljava/math/BigDecimal;

    .line 208
    .line 209
    .line 210
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 211
    .line 212
    iget-object p2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->maxLeverage:Ljava/math/BigDecimal;

    .line 213
    .line 214
    .line 215
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 216
    .line 217
    iget-boolean p2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->supportGridTrading:Z

    .line 218
    .line 219
    .line 220
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 221
    .line 222
    iget p2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->stepRiskLimitStatus:I

    .line 223
    .line 224
    .line 225
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 226
    .line 227
    iget-boolean p2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->isTrialFunds:Z

    .line 228
    .line 229
    .line 230
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 231
    .line 232
    iget-object p2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->spotCurrency:Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 236
    .line 237
    iget-object p2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->k:Ljava/math/BigDecimal;

    .line 238
    .line 239
    .line 240
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 241
    .line 242
    iget-object p2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->m:Ljava/math/BigDecimal;

    .line 243
    .line 244
    .line 245
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 246
    .line 247
    iget-object p2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->f:Ljava/math/BigDecimal;

    .line 248
    .line 249
    .line 250
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 251
    .line 252
    iget-object p2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->mmrLimit:Ljava/math/BigDecimal;

    .line 253
    .line 254
    .line 255
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 256
    .line 257
    iget-object p2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->mmrLevConstant:Ljava/math/BigDecimal;

    .line 258
    .line 259
    .line 260
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 261
    .line 262
    iget-object p2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->crossRiskLimit:Ljava/math/BigDecimal;

    .line 263
    .line 264
    .line 265
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 266
    .line 267
    iget-object p2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->adjustK:Ljava/math/BigDecimal;

    .line 268
    .line 269
    .line 270
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 271
    .line 272
    iget-object p2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->adjustM:Ljava/math/BigDecimal;

    .line 273
    .line 274
    .line 275
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 276
    .line 277
    iget-object p2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->adjustMmrLevConstant:Ljava/math/BigDecimal;

    .line 278
    .line 279
    .line 280
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 281
    .line 282
    iget-object p2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->adjustActiveTime:Ljava/lang/Long;

    .line 283
    .line 284
    if-nez p2, :cond_1

    .line 285
    .line 286
    .line 287
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 288
    goto :goto_1

    .line 289
    .line 290
    .line 291
    :cond_1
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 295
    move-result-wide v2

    .line 296
    .line 297
    .line 298
    invoke-virtual {p1, v2, v3}, Landroid/os/Parcel;->writeLong(J)V

    .line 299
    .line 300
    :goto_1
    iget-object p2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->supportCross:Ljava/lang/Boolean;

    .line 301
    .line 302
    if-nez p2, :cond_2

    .line 303
    .line 304
    .line 305
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 306
    goto :goto_2

    .line 307
    .line 308
    .line 309
    :cond_2
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 313
    move-result p2

    .line 314
    .line 315
    .line 316
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 317
    .line 318
    :goto_2
    iget-object p2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->marketStage:Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 322
    .line 323
    iget-object p2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->preMarketToPerpDate:Ljava/lang/Long;

    .line 324
    .line 325
    if-nez p2, :cond_3

    .line 326
    .line 327
    .line 328
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 329
    goto :goto_3

    .line 330
    .line 331
    .line 332
    :cond_3
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 333
    .line 334
    .line 335
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 336
    move-result-wide v0

    .line 337
    .line 338
    .line 339
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 340
    .line 341
    :goto_3
    iget-object p2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->marketMaxOrderQty:Ljava/math/BigDecimal;

    .line 342
    .line 343
    .line 344
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 345
    .line 346
    iget-object p2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->marketType:Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 350
    .line 351
    iget-object p2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->assetClass:Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 355
    .line 356
    iget-object p2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->subMarketType:Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 360
    .line 361
    iget-object p2, p0, Lcom/kubi/kumex/data/platform/model/ContractEntity;->imgUrl:Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 365
    return-void
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
.end method
