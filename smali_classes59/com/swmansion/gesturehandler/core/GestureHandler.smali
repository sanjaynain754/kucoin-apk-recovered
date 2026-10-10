.class public Lcom/swmansion/gesturehandler/core/GestureHandler;
.super Ljava/lang/Object;
.source "GestureHandler.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/swmansion/gesturehandler/core/GestureHandler$AdaptEventException;,
        Lcom/swmansion/gesturehandler/core/GestureHandler$Companion;,
        Lcom/swmansion/gesturehandler/core/GestureHandler$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ConcreteGestureHandlerT:",
        "Lcom/swmansion/gesturehandler/core/GestureHandler<",
        "TConcreteGestureHandlerT;>;>",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00b0\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u001d\n\u0002\u0010\u0007\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0015\n\u0002\u0008)\n\u0002\u0010\u0011\n\u0002\u0008\u0005\n\u0002\u0010\u0014\n\u0002\u0008\u0002\n\u0002\u0010\n\n\u0002\u0008.\u0008\u0016\u0018\u0000 \u00e6\u0001*\u000e\u0008\u0000\u0010\u0001*\u0008\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002:\u0006\u00ec\u0001\u00ed\u0001\u008e\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001b\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u0004J\u000f\u0010\u001b\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u0004J\u0017\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001cH\u0002\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001cH\u0002\u00a2\u0006\u0004\u0008 \u0010\u001fJ\u001f\u0010#\u001a\n \"*\u0004\u0018\u00010!0!2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002\u00a2\u0006\u0004\u0008#\u0010$J\u0017\u0010&\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008&\u0010\'J\u0017\u0010)\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008)\u0010*J\u0017\u0010+\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008+\u0010,J\u000f\u0010-\u001a\u00028\u0000H\u0004\u00a2\u0006\u0004\u0008-\u0010.J\u001f\u00100\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\n2\u0006\u0010/\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u00080\u00101J\u0017\u00102\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u00082\u0010,J\u000f\u00103\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\u00083\u0010\u0004J\u000f\u00104\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\u00084\u0010\u0004J\u0019\u00106\u001a\u00020\u000f2\n\u00105\u001a\u0006\u0012\u0002\u0008\u00030\u0000\u00a2\u0006\u0004\u00086\u00107J\u0015\u00109\u001a\u00028\u00002\u0006\u00108\u001a\u00020\u000f\u00a2\u0006\u0004\u00089\u0010:J\u0015\u0010<\u001a\u00028\u00002\u0006\u0010;\u001a\u00020\u000f\u00a2\u0006\u0004\u0008<\u0010:J\u0015\u0010>\u001a\u00028\u00002\u0006\u0010=\u001a\u00020\u000f\u00a2\u0006\u0004\u0008>\u0010:J=\u0010F\u001a\u00028\u00002\u0006\u0010@\u001a\u00020?2\u0006\u0010A\u001a\u00020?2\u0006\u0010B\u001a\u00020?2\u0006\u0010C\u001a\u00020?2\u0006\u0010D\u001a\u00020?2\u0006\u0010E\u001a\u00020?\u00a2\u0006\u0004\u0008F\u0010GJ\u0017\u0010J\u001a\u00028\u00002\u0008\u0010I\u001a\u0004\u0018\u00010H\u00a2\u0006\u0004\u0008J\u0010KJ\u001b\u0010M\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010L\u001a\u00020\n\u00a2\u0006\u0004\u0008M\u0010NJ!\u0010S\u001a\u00020\u00152\u0008\u0010P\u001a\u0004\u0018\u00010O2\u0008\u0010R\u001a\u0004\u0018\u00010Q\u00a2\u0006\u0004\u0008S\u0010TJ\u000f\u0010U\u001a\u00020\u0015H\u0014\u00a2\u0006\u0004\u0008U\u0010\u0004J\u0015\u0010W\u001a\u00020\u00152\u0006\u0010V\u001a\u00020\n\u00a2\u0006\u0004\u0008W\u0010\'J\u0015\u0010X\u001a\u00020\u00152\u0006\u0010V\u001a\u00020\n\u00a2\u0006\u0004\u0008X\u0010\'J\u001d\u0010Z\u001a\u00020\u00152\u0006\u0010Y\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r\u00a2\u0006\u0004\u0008Z\u0010\u0017J\u001d\u0010[\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r\u00a2\u0006\u0004\u0008[\u0010\u0017J\u000f\u0010]\u001a\u0004\u0018\u00010\\\u00a2\u0006\u0004\u0008]\u0010^J\u000f\u0010_\u001a\u0004\u0018\u00010\\\u00a2\u0006\u0004\u0008_\u0010^J\r\u0010`\u001a\u00020\u000f\u00a2\u0006\u0004\u0008`\u0010aJ\u001b\u0010c\u001a\u00020\u000f2\n\u0010b\u001a\u0006\u0012\u0002\u0008\u00030\u0000H\u0016\u00a2\u0006\u0004\u0008c\u00107J\u0019\u0010d\u001a\u00020\u000f2\n\u0010b\u001a\u0006\u0012\u0002\u0008\u00030\u0000\u00a2\u0006\u0004\u0008d\u00107J\u001b\u0010e\u001a\u00020\u000f2\n\u0010b\u001a\u0006\u0012\u0002\u0008\u00030\u0000H\u0016\u00a2\u0006\u0004\u0008e\u00107J\u001b\u0010f\u001a\u00020\u000f2\n\u0010b\u001a\u0006\u0012\u0002\u0008\u00030\u0000H\u0016\u00a2\u0006\u0004\u0008f\u00107J\'\u0010i\u001a\u00020\u000f2\u0008\u0010P\u001a\u0004\u0018\u00010O2\u0006\u0010g\u001a\u00020?2\u0006\u0010h\u001a\u00020?\u00a2\u0006\u0004\u0008i\u0010jJ\r\u0010k\u001a\u00020\u0015\u00a2\u0006\u0004\u0008k\u0010\u0004J\r\u0010l\u001a\u00020\u0015\u00a2\u0006\u0004\u0008l\u0010\u0004J\r\u0010m\u001a\u00020\u0015\u00a2\u0006\u0004\u0008m\u0010\u0004J\u0017\u0010o\u001a\u00020\u00152\u0006\u0010n\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008o\u0010pJ\r\u0010q\u001a\u00020\u0015\u00a2\u0006\u0004\u0008q\u0010\u0004J\r\u0010r\u001a\u00020\u0015\u00a2\u0006\u0004\u0008r\u0010\u0004J\u0019\u0010t\u001a\u00020\u000f2\n\u0010s\u001a\u0006\u0012\u0002\u0008\u00030\u0000\u00a2\u0006\u0004\u0008t\u00107J\u000f\u0010u\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\u0008u\u0010\u0004J\u001f\u0010v\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\rH\u0014\u00a2\u0006\u0004\u0008v\u0010\u0017J\u001f\u0010w\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\rH\u0014\u00a2\u0006\u0004\u0008w\u0010\u0017J\u001f\u0010y\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\n2\u0006\u0010x\u001a\u00020\nH\u0014\u00a2\u0006\u0004\u0008y\u00101J\u000f\u0010z\u001a\u00020\u0015H\u0014\u00a2\u0006\u0004\u0008z\u0010\u0004J\u000f\u0010{\u001a\u00020\u0015H\u0014\u00a2\u0006\u0004\u0008{\u0010\u0004J\u0017\u0010|\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\rH\u0004\u00a2\u0006\u0004\u0008|\u0010\u0011J\u0018\u0010\u007f\u001a\u00020}2\u0006\u0010~\u001a\u00020}H\u0004\u00a2\u0006\u0005\u0008\u007f\u0010\u0080\u0001J\u000f\u0010\u0081\u0001\u001a\u00020\u0015\u00a2\u0006\u0005\u0008\u0081\u0001\u0010\u0004J \u0010\u0084\u0001\u001a\u00020\u00152\u000e\u0010\u0083\u0001\u001a\t\u0012\u0004\u0012\u00020\u00150\u0082\u0001\u00a2\u0006\u0006\u0008\u0084\u0001\u0010\u0085\u0001J \u0010\u0088\u0001\u001a\u0006\u0012\u0002\u0008\u00030\u00002\n\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0086\u0001\u00a2\u0006\u0006\u0008\u0088\u0001\u0010\u0089\u0001J\u0013\u0010\u008b\u0001\u001a\u00030\u008a\u0001H\u0016\u00a2\u0006\u0006\u0008\u008b\u0001\u0010\u008c\u0001R\u0018\u0010\u0090\u0001\u001a\u00030\u008d\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u008e\u0001\u0010\u008f\u0001R\u0019\u0010\u0093\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0091\u0001\u0010\u0092\u0001R\u0018\u0010\u0095\u0001\u001a\u00030\u008d\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0094\u0001\u0010\u008f\u0001R\'\u0010\u0099\u0001\u001a\u00020\n8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0016\n\u0006\u0008\u0096\u0001\u0010\u0092\u0001\u001a\u0005\u0008\u0097\u0001\u0010\u000c\"\u0005\u0008\u0098\u0001\u0010\'R-\u0010P\u001a\u0004\u0018\u00010O2\t\u0010\u009a\u0001\u001a\u0004\u0018\u00010O8\u0006@BX\u0086\u000e\u00a2\u0006\u0010\n\u0006\u0008\u009b\u0001\u0010\u009c\u0001\u001a\u0006\u0008\u009d\u0001\u0010\u009e\u0001R)\u0010\u00a1\u0001\u001a\u00020\n2\u0007\u0010\u009a\u0001\u001a\u00020\n8\u0006@BX\u0086\u000e\u00a2\u0006\u000f\n\u0006\u0008\u009f\u0001\u0010\u0092\u0001\u001a\u0005\u0008\u00a0\u0001\u0010\u000cR(\u0010\u0019\u001a\u00020?2\u0007\u0010\u009a\u0001\u001a\u00020?8\u0006@BX\u0086\u000e\u00a2\u0006\u000f\n\u0005\u0008\u00a2\u0001\u0010\u0008\u001a\u0006\u0008\u00a3\u0001\u0010\u00a4\u0001R(\u0010\u0018\u001a\u00020?2\u0007\u0010\u009a\u0001\u001a\u00020?8\u0006@BX\u0086\u000e\u00a2\u0006\u000f\n\u0005\u0008\u00a5\u0001\u0010\u0008\u001a\u0006\u0008\u00a6\u0001\u0010\u00a4\u0001R\'\u0010\u00a8\u0001\u001a\u00020\u000f2\u0007\u0010\u009a\u0001\u001a\u00020\u000f8\u0006@BX\u0086\u000e\u00a2\u0006\r\n\u0004\u0008m\u0010)\u001a\u0005\u0008\u00a7\u0001\u0010aR\'\u0010\u00aa\u0001\u001a\u00020\u000f2\u0007\u0010\u009a\u0001\u001a\u00020\u000f8\u0006@BX\u0086\u000e\u00a2\u0006\r\n\u0004\u0008o\u0010)\u001a\u0005\u0008\u00a9\u0001\u0010aR&\u0010\u00ad\u0001\u001a\u00020\n8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0015\n\u0005\u0008\u0012\u0010\u0092\u0001\u001a\u0005\u0008\u00ab\u0001\u0010\u000c\"\u0005\u0008\u00ac\u0001\u0010\'R,\u0010\u00b0\u0001\u001a\u0004\u0018\u00010\\2\t\u0010\u009a\u0001\u001a\u0004\u0018\u00010\\8\u0006@BX\u0086\u000e\u00a2\u0006\u000e\n\u0005\u0008\u001e\u0010\u00ae\u0001\u001a\u0005\u0008\u00af\u0001\u0010^R,\u0010\u00b2\u0001\u001a\u0004\u0018\u00010\\2\t\u0010\u009a\u0001\u001a\u0004\u0018\u00010\\8\u0006@BX\u0086\u000e\u00a2\u0006\u000e\n\u0005\u0008 \u0010\u00ae\u0001\u001a\u0005\u0008\u00b1\u0001\u0010^R(\u0010\u00b4\u0001\u001a\u00020\n2\u0007\u0010\u009a\u0001\u001a\u00020\n8\u0006@BX\u0086\u000e\u00a2\u0006\u000e\n\u0005\u0008q\u0010\u0092\u0001\u001a\u0005\u0008\u00b3\u0001\u0010\u000cR(\u0010\u00b6\u0001\u001a\u00020\n2\u0007\u0010\u009a\u0001\u001a\u00020\n8\u0006@BX\u0086\u000e\u00a2\u0006\u000e\n\u0005\u0008k\u0010\u0092\u0001\u001a\u0005\u0008\u00b5\u0001\u0010\u000cR\u001f\u0010\u00b9\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00b7\u00018\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u001b\u0010\u00b8\u0001R%\u0010\u00bc\u0001\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0014\n\u0004\u0008_\u0010)\u001a\u0005\u0008\u00ba\u0001\u0010a\"\u0005\u0008\u00bb\u0001\u0010pR\u001b\u0010\u00bf\u0001\u001a\u0005\u0018\u00010\u00bd\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008]\u0010\u00be\u0001R+\u0010\u00c3\u0001\u001a\u00030\u00c0\u00012\u0008\u0010\u009a\u0001\u001a\u00030\u00c0\u00018\u0006@BX\u0086\u000e\u00a2\u0006\u000f\n\u0005\u0008#\u0010\u00b3\u0001\u001a\u0006\u0008\u00c1\u0001\u0010\u00c2\u0001R(\u0010\u00c5\u0001\u001a\u00020?2\u0007\u0010\u009a\u0001\u001a\u00020?8\u0006@BX\u0086\u000e\u00a2\u0006\u000e\n\u0004\u00082\u0010\u0008\u001a\u0006\u0008\u00c4\u0001\u0010\u00a4\u0001R(\u0010\u00c7\u0001\u001a\u00020?2\u0007\u0010\u009a\u0001\u001a\u00020?8\u0006@BX\u0086\u000e\u00a2\u0006\u000e\n\u0004\u00080\u0010\u0008\u001a\u0006\u0008\u00c6\u0001\u0010\u00a4\u0001R\u0016\u0010=\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010)R\u0017\u0010\u00c8\u0001\u001a\u00020?8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00083\u0010\u0008R\u0017\u0010\u00c9\u0001\u001a\u00020?8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u0008R\u0016\u00108\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010)R(\u0010\u00cb\u0001\u001a\u00020\n2\u0007\u0010\u009a\u0001\u001a\u00020\n8\u0006@BX\u0086\u000e\u00a2\u0006\u000e\n\u0005\u0008r\u0010\u0092\u0001\u001a\u0005\u0008\u00ca\u0001\u0010\u000cR)\u0010R\u001a\u0004\u0018\u00010Q8\u0004@\u0004X\u0084\u000e\u00a2\u0006\u0017\n\u0005\u0008\u001a\u0010\u00cc\u0001\u001a\u0006\u0008\u00cd\u0001\u0010\u00ce\u0001\"\u0006\u0008\u00cf\u0001\u0010\u00d0\u0001R\u001b\u0010\u00d2\u0001\u001a\u0005\u0018\u00010\u0086\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008l\u0010\u00d1\u0001R\u001a\u0010\u00d4\u0001\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008\u000b\u0010\u00d3\u0001R)\u0010\u00d6\u0001\u001a\u00020\n2\u0007\u0010\u009a\u0001\u001a\u00020\n8\u0006@BX\u0086\u000e\u00a2\u0006\u000f\n\u0006\u0008\u00ab\u0001\u0010\u0092\u0001\u001a\u0005\u0008\u00d5\u0001\u0010\u000cR&\u0010L\u001a\u00020\n8\u0004@\u0004X\u0084\u000e\u00a2\u0006\u0016\n\u0006\u0008\u00d7\u0001\u0010\u0092\u0001\u001a\u0005\u0008\u00d8\u0001\u0010\u000c\"\u0005\u0008\u00d9\u0001\u0010\'R&\u0010\u00db\u0001\u001a\u00020\n8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0015\n\u0005\u0008\u0008\u0010\u0092\u0001\u001a\u0005\u0008\u00d7\u0001\u0010\u000c\"\u0005\u0008\u00da\u0001\u0010\'R&\u0010\u00de\u0001\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0015\n\u0005\u0008\u00c1\u0001\u0010)\u001a\u0005\u0008\u00dc\u0001\u0010a\"\u0005\u0008\u00dd\u0001\u0010pR&\u0010\u00e2\u0001\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0015\n\u0005\u0008\u00df\u0001\u0010)\u001a\u0005\u0008\u00e0\u0001\u0010a\"\u0005\u0008\u00e1\u0001\u0010pR&\u0010\u00e5\u0001\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0015\n\u0005\u0008\u0092\u0001\u0010)\u001a\u0005\u0008\u00e3\u0001\u0010a\"\u0005\u0008\u00e4\u0001\u0010pR\u0014\u0010\u00e7\u0001\u001a\u00020?8F\u00a2\u0006\u0008\u001a\u0006\u0008\u00e6\u0001\u0010\u00a4\u0001R\u0014\u0010\u00e9\u0001\u001a\u00020?8F\u00a2\u0006\u0008\u001a\u0006\u0008\u00e8\u0001\u0010\u00a4\u0001R\u0014\u0010\u00ea\u0001\u001a\u00020?8F\u00a2\u0006\u0008\u001a\u0006\u0008\u00df\u0001\u0010\u00a4\u0001R\u0014\u0010\u00eb\u0001\u001a\u00020?8F\u00a2\u0006\u0008\u001a\u0006\u0008\u0092\u0001\u0010\u00a4\u0001\u00a8\u0006\u00ee\u0001"
    }
    d2 = {
        "Lcom/swmansion/gesturehandler/core/GestureHandler;",
        "ConcreteGestureHandlerT",
        "",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "context",
        "Landroid/app/Activity;",
        "F",
        "(Landroid/content/Context;)Landroid/app/Activity;",
        "",
        "C",
        "()I",
        "Landroid/view/MotionEvent;",
        "event",
        "",
        "f0",
        "(Landroid/view/MotionEvent;)Z",
        "k",
        "(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;",
        "sourceEvent",
        "",
        "v",
        "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)V",
        "y",
        "x",
        "A",
        "p",
        "Lcom/swmansion/gesturehandler/core/GestureHandler$a;",
        "pointerData",
        "l",
        "(Lcom/swmansion/gesturehandler/core/GestureHandler$a;)V",
        "m",
        "Lcom/facebook/react/bridge/WritableMap;",
        "kotlin.jvm.PlatformType",
        "s",
        "(Lcom/swmansion/gesturehandler/core/GestureHandler$a;)Lcom/facebook/react/bridge/WritableMap;",
        "newState",
        "e0",
        "(I)V",
        "clickedButton",
        "Z",
        "(I)Z",
        "D0",
        "(Landroid/view/MotionEvent;)V",
        "q0",
        "()Lcom/swmansion/gesturehandler/core/GestureHandler;",
        "prevState",
        "u",
        "(II)V",
        "t",
        "w",
        "o0",
        "other",
        "W",
        "(Lcom/swmansion/gesturehandler/core/GestureHandler;)Z",
        "shouldCancelWhenOutside",
        "E0",
        "(Z)Lcom/swmansion/gesturehandler/core/GestureHandler;",
        "enabled",
        "v0",
        "manualActivation",
        "z0",
        "",
        "leftPad",
        "topPad",
        "rightPad",
        "bottomPad",
        "width",
        "height",
        "x0",
        "(FFFFFF)Lcom/swmansion/gesturehandler/core/GestureHandler;",
        "Lrb0/c;",
        "controller",
        "y0",
        "(Lrb0/c;)Lcom/swmansion/gesturehandler/core/GestureHandler;",
        "mouseButton",
        "A0",
        "(I)Lcom/swmansion/gesturehandler/core/GestureHandler;",
        "Landroid/view/View;",
        "view",
        "Lcom/swmansion/gesturehandler/core/GestureHandlerOrchestrator;",
        "orchestrator",
        "m0",
        "(Landroid/view/View;Lcom/swmansion/gesturehandler/core/GestureHandlerOrchestrator;)V",
        "j0",
        "pointerId",
        "M0",
        "N0",
        "transformedEvent",
        "V",
        "P0",
        "Lcom/facebook/react/bridge/WritableArray;",
        "r",
        "()Lcom/facebook/react/bridge/WritableArray;",
        "q",
        "Q0",
        "()Z",
        "handler",
        "K0",
        "L0",
        "J0",
        "I0",
        "posX",
        "posY",
        "d0",
        "(Landroid/view/View;FF)Z",
        "o",
        "B",
        "i",
        "force",
        "j",
        "(Z)V",
        "n",
        "z",
        "of",
        "a0",
        "p0",
        "h0",
        "i0",
        "previousState",
        "l0",
        "k0",
        "g0",
        "H0",
        "Landroid/graphics/PointF;",
        "point",
        "O0",
        "(Landroid/graphics/PointF;)Landroid/graphics/PointF;",
        "n0",
        "Lkotlin/Function0;",
        "closure",
        "R0",
        "(Lkotlin/jvm/functions/Function0;)V",
        "Lrb0/l;",
        "listener",
        "C0",
        "(Lrb0/l;)Lcom/swmansion/gesturehandler/core/GestureHandler;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "a",
        "[I",
        "trackedPointerIDs",
        "b",
        "I",
        "trackedPointersIDsCount",
        "c",
        "windowOffset",
        "d",
        "R",
        "G0",
        "tag",
        "value",
        "e",
        "Landroid/view/View;",
        "U",
        "()Landroid/view/View;",
        "f",
        "Q",
        "state",
        "g",
        "getX",
        "()F",
        "h",
        "getY",
        "c0",
        "isWithinBounds",
        "b0",
        "isEnabled",
        "D",
        "r0",
        "actionType",
        "Lcom/facebook/react/bridge/WritableArray;",
        "getChangedTouchesPayload",
        "changedTouchesPayload",
        "getAllTouchesPayload",
        "allTouchesPayload",
        "S",
        "touchEventType",
        "T",
        "trackedPointersCount",
        "",
        "[Lcom/swmansion/gesturehandler/core/GestureHandler$a;",
        "trackedPointers",
        "L",
        "B0",
        "needsPointerData",
        "",
        "[F",
        "hitSlop",
        "",
        "G",
        "()S",
        "eventCoalescingKey",
        "getLastAbsolutePositionX",
        "lastAbsolutePositionX",
        "getLastAbsolutePositionY",
        "lastAbsolutePositionY",
        "lastEventOffsetX",
        "lastEventOffsetY",
        "M",
        "numberOfPointers",
        "Lcom/swmansion/gesturehandler/core/GestureHandlerOrchestrator;",
        "N",
        "()Lcom/swmansion/gesturehandler/core/GestureHandlerOrchestrator;",
        "setOrchestrator",
        "(Lcom/swmansion/gesturehandler/core/GestureHandlerOrchestrator;)V",
        "Lrb0/l;",
        "onTouchEventListener",
        "Lrb0/c;",
        "interactionController",
        "O",
        "pointerType",
        "E",
        "getMouseButton",
        "setMouseButton",
        "s0",
        "activationIndex",
        "X",
        "t0",
        "isActive",
        "H",
        "Y",
        "u0",
        "isAwaiting",
        "P",
        "F0",
        "shouldResetProgress",
        "J",
        "lastRelativePositionX",
        "K",
        "lastRelativePositionY",
        "lastPositionInWindowX",
        "lastPositionInWindowY",
        "AdaptEventException",
        "Companion",
        "react-native-gesture-handler_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nGestureHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GestureHandler.kt\ncom/swmansion/gesturehandler/core/GestureHandler\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,893:1\n80#1:895\n80#1:897\n80#1:899\n80#1:901\n80#1:903\n1#2:894\n1#2:896\n1#2:898\n1#2:900\n1#2:902\n1#2:904\n*S KotlinDebug\n*F\n+ 1 GestureHandler.kt\ncom/swmansion/gesturehandler/core/GestureHandler\n*L\n120#1:895\n122#1:897\n135#1:899\n144#1:901\n165#1:903\n120#1:896\n122#1:898\n135#1:900\n144#1:902\n165#1:904\n*E\n"
    }
.end annotation


# static fields
.field public static final J:Lcom/swmansion/gesturehandler/core/GestureHandler$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static K:[Landroid/view/MotionEvent$PointerProperties;

.field public static L:[Landroid/view/MotionEvent$PointerCoords;

.field public static M:S


# instance fields
.field public A:Lcom/swmansion/gesturehandler/core/GestureHandlerOrchestrator;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public B:Lrb0/l;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public C:Lrb0/c;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public D:I

.field public E:I

.field public F:I

.field public G:Z

.field public H:Z

.field public I:Z

.field public final a:[I
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public b:I

.field public final c:[I
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public d:I

.field public e:Landroid/view/View;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public f:I

.field public g:F

.field public h:F

.field public i:Z

.field public j:Z

.field public k:I

.field public l:Lcom/facebook/react/bridge/WritableArray;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public m:Lcom/facebook/react/bridge/WritableArray;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public n:I

.field public o:I

.field public final p:[Lcom/swmansion/gesturehandler/core/GestureHandler$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public q:Z

.field public r:[F
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public s:S

.field public t:F

.field public u:F

.field public v:Z

.field public w:F

.field public x:F

.field public y:Z

.field public z:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/swmansion/gesturehandler/core/GestureHandler$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/swmansion/gesturehandler/core/GestureHandler$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/swmansion/gesturehandler/core/GestureHandler;->J:Lcom/swmansion/gesturehandler/core/GestureHandler$Companion;

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
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    const/16 v0, 0xc

    .line 6
    .line 7
    new-array v1, v0, [I

    .line 8
    .line 9
    iput-object v1, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->a:[I

    .line 10
    const/4 v1, 0x2

    .line 11
    .line 12
    new-array v2, v1, [I

    .line 13
    const/4 v3, 0x0

    .line 14
    move v4, v3

    .line 15
    .line 16
    :goto_0
    if-ge v4, v1, :cond_0

    .line 17
    .line 18
    aput v3, v2, v4

    .line 19
    .line 20
    add-int/lit8 v4, v4, 0x1

    .line 21
    goto :goto_0

    .line 22
    .line 23
    :cond_0
    iput-object v2, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->c:[I

    .line 24
    const/4 v1, 0x1

    .line 25
    .line 26
    iput-boolean v1, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->j:Z

    .line 27
    .line 28
    new-array v1, v0, [Lcom/swmansion/gesturehandler/core/GestureHandler$a;

    .line 29
    .line 30
    :goto_1
    if-ge v3, v0, :cond_1

    .line 31
    const/4 v2, 0x0

    .line 32
    .line 33
    aput-object v2, v1, v3

    .line 34
    .line 35
    add-int/lit8 v3, v3, 0x1

    .line 36
    goto :goto_1

    .line 37
    .line 38
    :cond_1
    iput-object v1, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->p:[Lcom/swmansion/gesturehandler/core/GestureHandler$a;

    .line 39
    const/4 v0, 0x3

    .line 40
    .line 41
    iput v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->D:I

    .line 42
    return-void
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

.method public static synthetic a(Lcom/swmansion/gesturehandler/core/GestureHandler;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/swmansion/gesturehandler/core/GestureHandler;->w0(Lcom/swmansion/gesturehandler/core/GestureHandler;)V

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
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public static final synthetic b()[Landroid/view/MotionEvent$PointerCoords;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/swmansion/gesturehandler/core/GestureHandler;->L:[Landroid/view/MotionEvent$PointerCoords;

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
.end method

.method public static final synthetic c()[Landroid/view/MotionEvent$PointerProperties;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/swmansion/gesturehandler/core/GestureHandler;->K:[Landroid/view/MotionEvent$PointerProperties;

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
.end method

.method public static final synthetic d(Lcom/swmansion/gesturehandler/core/GestureHandler;)[I
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->a:[I

    .line 3
    return-object p0
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
.end method

.method public static final synthetic e(Lcom/swmansion/gesturehandler/core/GestureHandler;)I
    .locals 0

    .line 1
    .line 2
    iget p0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->b:I

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
.end method

.method public static final synthetic f(Lcom/swmansion/gesturehandler/core/GestureHandler;)Lcom/swmansion/gesturehandler/core/GestureHandler;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/swmansion/gesturehandler/core/GestureHandler;->q0()Lcom/swmansion/gesturehandler/core/GestureHandler;

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
.end method

.method public static final synthetic g([Landroid/view/MotionEvent$PointerCoords;)V
    .locals 0

    .line 1
    .line 2
    sput-object p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->L:[Landroid/view/MotionEvent$PointerCoords;

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
.end method

.method public static final synthetic h([Landroid/view/MotionEvent$PointerProperties;)V
    .locals 0

    .line 1
    .line 2
    sput-object p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->K:[Landroid/view/MotionEvent$PointerProperties;

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
.end method

.method public static final w0(Lcom/swmansion/gesturehandler/core/GestureHandler;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/swmansion/gesturehandler/core/GestureHandler;->o()V

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
    .line 22
    .line 23
    .line 24
    .line 25
.end method


# virtual methods
.method public final A()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput-object v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->m:Lcom/facebook/react/bridge/WritableArray;

    .line 4
    .line 5
    iget-object v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->p:[Lcom/swmansion/gesturehandler/core/GestureHandler$a;

    .line 6
    array-length v1, v0

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    :goto_0
    if-ge v2, v1, :cond_1

    .line 10
    .line 11
    aget-object v3, v0, v2

    .line 12
    .line 13
    if-eqz v3, :cond_0

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v3}, Lcom/swmansion/gesturehandler/core/GestureHandler;->m(Lcom/swmansion/gesturehandler/core/GestureHandler$a;)V

    .line 17
    .line 18
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    return-void
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

.method public final A0(I)Lcom/swmansion/gesturehandler/core/GestureHandler;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/swmansion/gesturehandler/core/GestureHandler<",
            "TConcreteGestureHandlerT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iput p1, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->E:I

    .line 3
    return-object p0
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
.end method

.method public final B()V
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->f:I

    .line 3
    const/4 v1, 0x4

    .line 4
    .line 5
    if-eq v0, v1, :cond_1

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    const/4 v1, 0x2

    .line 9
    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    return-void

    .line 13
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lcom/swmansion/gesturehandler/core/GestureHandler;->e0(I)V

    .line 17
    return-void
.end method

.method public final B0(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->q:Z

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
.end method

.method public final C()I
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    .line 4
    :goto_0
    iget v2, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->b:I

    .line 5
    .line 6
    if-ge v1, v2, :cond_3

    .line 7
    move v2, v0

    .line 8
    .line 9
    :goto_1
    iget-object v3, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->a:[I

    .line 10
    array-length v4, v3

    .line 11
    .line 12
    if-ge v2, v4, :cond_1

    .line 13
    .line 14
    aget v4, v3, v2

    .line 15
    .line 16
    if-ne v4, v1, :cond_0

    .line 17
    goto :goto_2

    .line 18
    .line 19
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    :goto_2
    array-length v3, v3

    .line 22
    .line 23
    if-ne v2, v3, :cond_2

    .line 24
    goto :goto_3

    .line 25
    .line 26
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 27
    goto :goto_0

    .line 28
    :cond_3
    :goto_3
    return v1
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

.method public final C0(Lrb0/l;)Lcom/swmansion/gesturehandler/core/GestureHandler;
    .locals 0
    .param p1    # Lrb0/l;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrb0/l;",
            ")",
            "Lcom/swmansion/gesturehandler/core/GestureHandler<",
            "*>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->B:Lrb0/l;

    .line 3
    return-object p0
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
.end method

.method public final D()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->k:I

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
.end method

.method public final D0(Landroid/view/MotionEvent;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 4
    move-result v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getToolType(I)I

    .line 8
    move-result p1

    .line 9
    const/4 v0, 0x1

    .line 10
    .line 11
    if-eq p1, v0, :cond_1

    .line 12
    const/4 v1, 0x2

    .line 13
    .line 14
    if-eq p1, v1, :cond_2

    .line 15
    const/4 v0, 0x3

    .line 16
    .line 17
    if-eq p1, v0, :cond_0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v0, v1

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    const/4 v0, 0x0

    .line 22
    .line 23
    :cond_2
    :goto_0
    iput v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->D:I

    .line 24
    return-void
    .line 25
.end method

.method public final E()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->F:I

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
.end method

.method public final E0(Z)Lcom/swmansion/gesturehandler/core/GestureHandler;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)TConcreteGestureHandlerT;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/swmansion/gesturehandler/core/GestureHandler;->f(Lcom/swmansion/gesturehandler/core/GestureHandler;)Lcom/swmansion/gesturehandler/core/GestureHandler;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iput-boolean p1, v0, Lcom/swmansion/gesturehandler/core/GestureHandler;->y:Z

    .line 7
    return-object v0
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
.end method

.method public final F(Landroid/content/Context;)Landroid/app/Activity;
    .locals 1

    .line 1
    .line 2
    instance-of v0, p1, Lcom/facebook/react/bridge/ReactContext;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p1, Lcom/facebook/react/bridge/ReactContext;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/facebook/react/bridge/ReactContext;->getCurrentActivity()Landroid/app/Activity;

    .line 10
    move-result-object p1

    .line 11
    return-object p1

    .line 12
    .line 13
    :cond_0
    instance-of v0, p1, Landroid/app/Activity;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    check-cast p1, Landroid/app/Activity;

    .line 18
    return-object p1

    .line 19
    .line 20
    :cond_1
    instance-of v0, p1, Landroid/content/ContextWrapper;

    .line 21
    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    check-cast p1, Landroid/content/ContextWrapper;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 28
    move-result-object p1

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, p1}, Lcom/swmansion/gesturehandler/core/GestureHandler;->F(Landroid/content/Context;)Landroid/app/Activity;

    .line 32
    move-result-object p1

    .line 33
    return-object p1

    .line 34
    :cond_2
    const/4 p1, 0x0

    .line 35
    return-object p1
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
.end method

.method public final F0(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->I:Z

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
.end method

.method public final G()S
    .locals 1

    .line 1
    .line 2
    iget-short v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->s:S

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
.end method

.method public final G0(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->d:I

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
.end method

.method public final H()F
    .locals 3

    .line 1
    .line 2
    iget v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->t:F

    .line 3
    .line 4
    iget v1, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->w:F

    .line 5
    add-float/2addr v0, v1

    .line 6
    .line 7
    iget-object v1, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->c:[I

    .line 8
    const/4 v2, 0x0

    .line 9
    .line 10
    aget v1, v1, v2

    .line 11
    int-to-float v1, v1

    .line 12
    sub-float/2addr v0, v1

    .line 13
    return v0
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public final H0(Landroid/view/MotionEvent;)Z
    .locals 4
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "sourceEvent"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    const/4 v0, 0x0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getToolType(I)I

    .line 11
    move-result v1

    .line 12
    const/4 v2, 0x3

    .line 13
    const/4 v3, 0x1

    .line 14
    .line 15
    if-ne v1, v2, :cond_3

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 19
    move-result v1

    .line 20
    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 25
    move-result v1

    .line 26
    .line 27
    if-eq v1, v3, :cond_2

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 31
    move-result v1

    .line 32
    const/4 v2, 0x6

    .line 33
    .line 34
    if-eq v1, v2, :cond_2

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 38
    move-result v1

    .line 39
    const/4 v2, 0x5

    .line 40
    .line 41
    if-ne v1, v2, :cond_0

    .line 42
    goto :goto_0

    .line 43
    .line 44
    .line 45
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 46
    move-result v1

    .line 47
    const/4 v2, 0x2

    .line 48
    .line 49
    if-eq v1, v2, :cond_1

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionButton()I

    .line 53
    move-result v1

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0, v1}, Lcom/swmansion/gesturehandler/core/GestureHandler;->Z(I)Z

    .line 57
    move-result v1

    .line 58
    .line 59
    if-nez v1, :cond_1

    .line 60
    return v0

    .line 61
    .line 62
    .line 63
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 64
    move-result v1

    .line 65
    .line 66
    if-ne v1, v2, :cond_3

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getButtonState()I

    .line 70
    move-result p1

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, p1}, Lcom/swmansion/gesturehandler/core/GestureHandler;->Z(I)Z

    .line 74
    move-result p1

    .line 75
    .line 76
    if-nez p1, :cond_3

    .line 77
    :cond_2
    :goto_0
    return v0

    .line 78
    :cond_3
    return v3
    .line 79
    .line 80
    .line 81
.end method

.method public final I()F
    .locals 3

    .line 1
    .line 2
    iget v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->u:F

    .line 3
    .line 4
    iget v1, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->x:F

    .line 5
    add-float/2addr v0, v1

    .line 6
    .line 7
    iget-object v1, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->c:[I

    .line 8
    const/4 v2, 0x1

    .line 9
    .line 10
    aget v1, v1, v2

    .line 11
    int-to-float v1, v1

    .line 12
    sub-float/2addr v0, v1

    .line 13
    return v0
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public I0(Lcom/swmansion/gesturehandler/core/GestureHandler;)Z
    .locals 2
    .param p1    # Lcom/swmansion/gesturehandler/core/GestureHandler;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/swmansion/gesturehandler/core/GestureHandler<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "handler"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    const/4 v0, 0x0

    .line 7
    .line 8
    if-ne p1, p0, :cond_0

    .line 9
    return v0

    .line 10
    .line 11
    :cond_0
    iget-object v1, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->C:Lrb0/c;

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    .line 16
    invoke-interface {v1, p0, p1}, Lrb0/c;->d(Lcom/swmansion/gesturehandler/core/GestureHandler;Lcom/swmansion/gesturehandler/core/GestureHandler;)Z

    .line 17
    move-result p1

    .line 18
    return p1

    .line 19
    :cond_1
    return v0
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public final J()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->t:F

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
.end method

.method public J0(Lcom/swmansion/gesturehandler/core/GestureHandler;)Z
    .locals 1
    .param p1    # Lcom/swmansion/gesturehandler/core/GestureHandler;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/swmansion/gesturehandler/core/GestureHandler<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "handler"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    if-ne p1, p0, :cond_0

    .line 8
    const/4 p1, 0x1

    .line 9
    return p1

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->C:Lrb0/c;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, p0, p1}, Lrb0/c;->c(Lcom/swmansion/gesturehandler/core/GestureHandler;Lcom/swmansion/gesturehandler/core/GestureHandler;)Z

    .line 17
    move-result p1

    .line 18
    return p1

    .line 19
    :cond_1
    const/4 p1, 0x0

    .line 20
    return p1
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public final K()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->u:F

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
.end method

.method public K0(Lcom/swmansion/gesturehandler/core/GestureHandler;)Z
    .locals 2
    .param p1    # Lcom/swmansion/gesturehandler/core/GestureHandler;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/swmansion/gesturehandler/core/GestureHandler<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "handler"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    const/4 v0, 0x0

    .line 7
    .line 8
    if-ne p1, p0, :cond_0

    .line 9
    return v0

    .line 10
    .line 11
    :cond_0
    iget-object v1, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->C:Lrb0/c;

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    .line 16
    invoke-interface {v1, p0, p1}, Lrb0/c;->b(Lcom/swmansion/gesturehandler/core/GestureHandler;Lcom/swmansion/gesturehandler/core/GestureHandler;)Z

    .line 17
    move-result p1

    .line 18
    return p1

    .line 19
    :cond_1
    return v0
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public final L()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->q:Z

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
.end method

.method public final L0(Lcom/swmansion/gesturehandler/core/GestureHandler;)Z
    .locals 2
    .param p1    # Lcom/swmansion/gesturehandler/core/GestureHandler;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/swmansion/gesturehandler/core/GestureHandler<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "handler"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    const/4 v0, 0x0

    .line 7
    .line 8
    if-ne p1, p0, :cond_0

    .line 9
    return v0

    .line 10
    .line 11
    :cond_0
    iget-object v1, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->C:Lrb0/c;

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    .line 16
    invoke-interface {v1, p0, p1}, Lrb0/c;->a(Lcom/swmansion/gesturehandler/core/GestureHandler;Lcom/swmansion/gesturehandler/core/GestureHandler;)Z

    .line 17
    move-result p1

    .line 18
    return p1

    .line 19
    :cond_1
    return v0
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public final M()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->z:I

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
.end method

.method public final M0(I)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->a:[I

    .line 3
    .line 4
    aget v1, v0, p1

    .line 5
    const/4 v2, -0x1

    .line 6
    .line 7
    if-ne v1, v2, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/swmansion/gesturehandler/core/GestureHandler;->C()I

    .line 11
    move-result v1

    .line 12
    .line 13
    aput v1, v0, p1

    .line 14
    .line 15
    iget p1, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->b:I

    .line 16
    .line 17
    add-int/lit8 p1, p1, 0x1

    .line 18
    .line 19
    iput p1, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->b:I

    .line 20
    :cond_0
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public final N()Lcom/swmansion/gesturehandler/core/GestureHandlerOrchestrator;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->A:Lcom/swmansion/gesturehandler/core/GestureHandlerOrchestrator;

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
.end method

.method public final N0(I)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->a:[I

    .line 3
    .line 4
    aget v1, v0, p1

    .line 5
    const/4 v2, -0x1

    .line 6
    .line 7
    if-eq v1, v2, :cond_0

    .line 8
    .line 9
    aput v2, v0, p1

    .line 10
    .line 11
    iget p1, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->b:I

    .line 12
    add-int/2addr p1, v2

    .line 13
    .line 14
    iput p1, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->b:I

    .line 15
    :cond_0
    return-void
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
.end method

.method public final O()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->D:I

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
.end method

.method public final O0(Landroid/graphics/PointF;)Landroid/graphics/PointF;
    .locals 2
    .param p1    # Landroid/graphics/PointF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "point"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->A:Lcom/swmansion/gesturehandler/core/GestureHandlerOrchestrator;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v1, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->e:Landroid/view/View;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1, p1}, Lcom/swmansion/gesturehandler/core/GestureHandlerOrchestrator;->K(Landroid/view/View;Landroid/graphics/PointF;)Landroid/graphics/PointF;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    return-object v0

    .line 21
    .line 22
    :cond_1
    :goto_0
    const/high16 v0, 0x7fc00000    # Float.NaN

    .line 23
    .line 24
    iput v0, p1, Landroid/graphics/PointF;->x:F

    .line 25
    .line 26
    iput v0, p1, Landroid/graphics/PointF;->y:F

    .line 27
    return-object p1
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
.end method

.method public final P()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->I:Z

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
.end method

.method public final P0(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)V
    .locals 2
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/MotionEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "event"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string/jumbo v0, "sourceEvent"

    .line 9
    .line 10
    .line 11
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 15
    move-result v0

    .line 16
    .line 17
    if-eqz v0, :cond_4

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 21
    move-result v0

    .line 22
    const/4 v1, 0x5

    .line 23
    .line 24
    if-ne v0, v1, :cond_0

    .line 25
    goto :goto_1

    .line 26
    .line 27
    .line 28
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 29
    move-result v0

    .line 30
    const/4 v1, 0x1

    .line 31
    .line 32
    if-eq v0, v1, :cond_3

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 36
    move-result v0

    .line 37
    const/4 v1, 0x6

    .line 38
    .line 39
    if-ne v0, v1, :cond_1

    .line 40
    goto :goto_0

    .line 41
    .line 42
    .line 43
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 44
    move-result v0

    .line 45
    const/4 v1, 0x2

    .line 46
    .line 47
    if-ne v0, v1, :cond_2

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, p1, p2}, Lcom/swmansion/gesturehandler/core/GestureHandler;->x(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)V

    .line 51
    :cond_2
    return-void

    .line 52
    .line 53
    .line 54
    :cond_3
    :goto_0
    invoke-virtual {p0, p1, p2}, Lcom/swmansion/gesturehandler/core/GestureHandler;->x(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, p1, p2}, Lcom/swmansion/gesturehandler/core/GestureHandler;->y(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)V

    .line 58
    return-void

    .line 59
    .line 60
    .line 61
    :cond_4
    :goto_1
    invoke-virtual {p0, p1, p2}, Lcom/swmansion/gesturehandler/core/GestureHandler;->v(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0, p1, p2}, Lcom/swmansion/gesturehandler/core/GestureHandler;->x(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)V

    .line 65
    return-void
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
.end method

.method public final Q()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->f:I

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
.end method

.method public final Q0()Z
    .locals 3

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->j:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->f:I

    .line 7
    const/4 v1, 0x1

    .line 8
    .line 9
    if-eq v0, v1, :cond_0

    .line 10
    const/4 v2, 0x3

    .line 11
    .line 12
    if-eq v0, v2, :cond_0

    .line 13
    const/4 v2, 0x5

    .line 14
    .line 15
    if-eq v0, v2, :cond_0

    .line 16
    .line 17
    iget v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->b:I

    .line 18
    .line 19
    if-lez v0, :cond_0

    .line 20
    return v1

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    return v0
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

.method public final R()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->d:I

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
.end method

.method public final R0(Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .param p1    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "closure"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    const/4 v0, 0x1

    .line 7
    .line 8
    iput-boolean v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->i:Z

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 12
    const/4 p1, 0x0

    .line 13
    .line 14
    iput-boolean p1, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->i:Z

    .line 15
    return-void
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
.end method

.method public final S()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->n:I

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
.end method

.method public final T()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->o:I

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
.end method

.method public final U()Landroid/view/View;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->e:Landroid/view/View;

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
.end method

.method public final V(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)V
    .locals 6
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/MotionEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "transformedEvent"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    const-string/jumbo v0, "sourceEvent"

    .line 10
    .line 11
    .line 12
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    iget-boolean v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->j:Z

    .line 15
    .line 16
    if-eqz v0, :cond_8

    .line 17
    .line 18
    iget v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->f:I

    .line 19
    const/4 v1, 0x3

    .line 20
    .line 21
    if-eq v0, v1, :cond_8

    .line 22
    const/4 v1, 0x1

    .line 23
    .line 24
    if-eq v0, v1, :cond_8

    .line 25
    const/4 v2, 0x5

    .line 26
    .line 27
    if-eq v0, v2, :cond_8

    .line 28
    .line 29
    iget v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->b:I

    .line 30
    .line 31
    if-ge v0, v1, :cond_0

    .line 32
    .line 33
    goto/16 :goto_2

    .line 34
    .line 35
    .line 36
    :cond_0
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/swmansion/gesturehandler/core/GestureHandler;->k(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    .line 37
    move-result-object v0

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, p2}, Lcom/swmansion/gesturehandler/core/GestureHandler;->k(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    .line 41
    move-result-object v2

    .line 42
    .line 43
    .line 44
    filled-new-array {v0, v2}, [Landroid/view/MotionEvent;

    .line 45
    move-result-object v0
    :try_end_0
    .catch Lcom/swmansion/gesturehandler/core/GestureHandler$AdaptEventException; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    const/4 v2, 0x0

    .line 47
    .line 48
    aget-object v2, v0, v2

    .line 49
    .line 50
    aget-object v0, v0, v1

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getX()F

    .line 54
    move-result v3

    .line 55
    .line 56
    iput v3, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->g:F

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getY()F

    .line 60
    move-result v3

    .line 61
    .line 62
    iput v3, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->h:F

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 66
    move-result v3

    .line 67
    .line 68
    iput v3, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->z:I

    .line 69
    .line 70
    iget-object v3, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->e:Landroid/view/View;

    .line 71
    .line 72
    iget v4, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->g:F

    .line 73
    .line 74
    iget v5, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->h:F

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0, v3, v4, v5}, Lcom/swmansion/gesturehandler/core/GestureHandler;->d0(Landroid/view/View;FF)Z

    .line 78
    move-result v3

    .line 79
    .line 80
    iput-boolean v3, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->i:Z

    .line 81
    .line 82
    iget-boolean v4, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->y:Z

    .line 83
    .line 84
    if-eqz v4, :cond_2

    .line 85
    .line 86
    if-nez v3, :cond_2

    .line 87
    .line 88
    iget p1, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->f:I

    .line 89
    const/4 p2, 0x4

    .line 90
    .line 91
    if-ne p1, p2, :cond_1

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0}, Lcom/swmansion/gesturehandler/core/GestureHandler;->o()V

    .line 95
    return-void

    .line 96
    :cond_1
    const/4 p2, 0x2

    .line 97
    .line 98
    if-ne p1, p2, :cond_8

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0}, Lcom/swmansion/gesturehandler/core/GestureHandler;->B()V

    .line 102
    return-void

    .line 103
    .line 104
    :cond_2
    sget-object v3, Lrb0/h;->a:Lrb0/h;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v3, v2, v1}, Lrb0/h;->b(Landroid/view/MotionEvent;Z)F

    .line 108
    move-result v4

    .line 109
    .line 110
    iput v4, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->t:F

    .line 111
    .line 112
    .line 113
    invoke-virtual {v3, v2, v1}, Lrb0/h;->c(Landroid/view/MotionEvent;Z)F

    .line 114
    move-result v1

    .line 115
    .line 116
    iput v1, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->u:F

    .line 117
    .line 118
    .line 119
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getRawX()F

    .line 120
    move-result v1

    .line 121
    .line 122
    .line 123
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getX()F

    .line 124
    move-result v3

    .line 125
    sub-float/2addr v1, v3

    .line 126
    .line 127
    iput v1, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->w:F

    .line 128
    .line 129
    .line 130
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getRawY()F

    .line 131
    move-result v1

    .line 132
    .line 133
    .line 134
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getY()F

    .line 135
    move-result v3

    .line 136
    sub-float/2addr v1, v3

    .line 137
    .line 138
    iput v1, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->x:F

    .line 139
    .line 140
    .line 141
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    .line 142
    move-result v1

    .line 143
    const/4 v3, 0x7

    .line 144
    .line 145
    const/16 v4, 0x9

    .line 146
    .line 147
    if-eqz v1, :cond_3

    .line 148
    .line 149
    .line 150
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    .line 151
    move-result v1

    .line 152
    .line 153
    if-eq v1, v4, :cond_3

    .line 154
    .line 155
    .line 156
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    .line 157
    move-result v1

    .line 158
    .line 159
    if-ne v1, v3, :cond_4

    .line 160
    .line 161
    .line 162
    :cond_3
    invoke-virtual {p0, p2}, Lcom/swmansion/gesturehandler/core/GestureHandler;->D0(Landroid/view/MotionEvent;)V

    .line 163
    .line 164
    .line 165
    :cond_4
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    .line 166
    move-result v1

    .line 167
    .line 168
    if-eq v1, v4, :cond_6

    .line 169
    .line 170
    .line 171
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    .line 172
    move-result v1

    .line 173
    .line 174
    if-eq v1, v3, :cond_6

    .line 175
    .line 176
    .line 177
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    .line 178
    move-result v1

    .line 179
    .line 180
    const/16 v3, 0xa

    .line 181
    .line 182
    if-ne v1, v3, :cond_5

    .line 183
    goto :goto_0

    .line 184
    .line 185
    .line 186
    :cond_5
    invoke-virtual {p0, v2, v0}, Lcom/swmansion/gesturehandler/core/GestureHandler;->h0(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)V

    .line 187
    goto :goto_1

    .line 188
    .line 189
    .line 190
    :cond_6
    :goto_0
    invoke-virtual {p0, v2, v0}, Lcom/swmansion/gesturehandler/core/GestureHandler;->i0(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)V

    .line 191
    .line 192
    .line 193
    :goto_1
    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 194
    move-result p1

    .line 195
    .line 196
    if-nez p1, :cond_7

    .line 197
    .line 198
    .line 199
    invoke-virtual {v2}, Landroid/view/MotionEvent;->recycle()V

    .line 200
    .line 201
    .line 202
    :cond_7
    invoke-static {v0, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 203
    move-result p1

    .line 204
    .line 205
    if-nez p1, :cond_8

    .line 206
    .line 207
    .line 208
    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    .line 209
    return-void

    .line 210
    .line 211
    .line 212
    :catch_0
    invoke-virtual {p0}, Lcom/swmansion/gesturehandler/core/GestureHandler;->B()V

    .line 213
    :cond_8
    :goto_2
    return-void
    .line 214
.end method

.method public final W(Lcom/swmansion/gesturehandler/core/GestureHandler;)Z
    .locals 5
    .param p1    # Lcom/swmansion/gesturehandler/core/GestureHandler;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/swmansion/gesturehandler/core/GestureHandler<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "other"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->a:[I

    .line 9
    array-length v0, v0

    .line 10
    const/4 v1, 0x0

    .line 11
    move v2, v1

    .line 12
    .line 13
    :goto_0
    if-ge v2, v0, :cond_1

    .line 14
    .line 15
    iget-object v3, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->a:[I

    .line 16
    .line 17
    aget v3, v3, v2

    .line 18
    const/4 v4, -0x1

    .line 19
    .line 20
    if-eq v3, v4, :cond_0

    .line 21
    .line 22
    iget-object v3, p1, Lcom/swmansion/gesturehandler/core/GestureHandler;->a:[I

    .line 23
    .line 24
    aget v3, v3, v2

    .line 25
    .line 26
    if-eq v3, v4, :cond_0

    .line 27
    const/4 p1, 0x1

    .line 28
    return p1

    .line 29
    .line 30
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    return v1
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
.end method

.method public final X()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->G:Z

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
.end method

.method public final Y()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->H:Z

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
.end method

.method public final Z(I)Z
    .locals 3

    .line 1
    .line 2
    iget v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->E:I

    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    if-ne p1, v2, :cond_0

    .line 9
    return v2

    .line 10
    :cond_0
    return v1

    .line 11
    :cond_1
    and-int/2addr p1, v0

    .line 12
    .line 13
    if-eqz p1, :cond_2

    .line 14
    return v2

    .line 15
    :cond_2
    return v1
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
.end method

.method public final a0(Lcom/swmansion/gesturehandler/core/GestureHandler;)Z
    .locals 3
    .param p1    # Lcom/swmansion/gesturehandler/core/GestureHandler;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/swmansion/gesturehandler/core/GestureHandler<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "of"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->e:Landroid/view/View;

    .line 9
    const/4 v1, 0x0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 15
    move-result-object v0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object v0, v1

    .line 18
    .line 19
    :goto_0
    instance-of v2, v0, Landroid/view/View;

    .line 20
    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    check-cast v0, Landroid/view/View;

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    move-object v0, v1

    .line 26
    .line 27
    :goto_1
    if-eqz v0, :cond_3

    .line 28
    .line 29
    iget-object v2, p1, Lcom/swmansion/gesturehandler/core/GestureHandler;->e:Landroid/view/View;

    .line 30
    .line 31
    .line 32
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    move-result v2

    .line 34
    .line 35
    if-eqz v2, :cond_2

    .line 36
    const/4 p1, 0x1

    .line 37
    return p1

    .line 38
    .line 39
    .line 40
    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 41
    move-result-object v0

    .line 42
    .line 43
    instance-of v2, v0, Landroid/view/View;

    .line 44
    .line 45
    if-eqz v2, :cond_1

    .line 46
    .line 47
    check-cast v0, Landroid/view/View;

    .line 48
    goto :goto_1

    .line 49
    :cond_3
    const/4 p1, 0x0

    .line 50
    return p1
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
.end method

.method public final b0()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->j:Z

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
.end method

.method public final c0()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->i:Z

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
.end method

.method public final d0(Landroid/view/View;FF)Z
    .locals 17
    .param p1    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    move-object/from16 v0, p1

    .line 3
    .line 4
    move/from16 v1, p2

    .line 5
    .line 6
    move/from16 v2, p3

    .line 7
    .line 8
    sget-object v3, Lcom/swmansion/gesturehandler/RNSVGHitTester;->a:Lcom/swmansion/gesturehandler/RNSVGHitTester$Companion;

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v3, v0}, Lcom/swmansion/gesturehandler/RNSVGHitTester$Companion;->isSvgElement(Ljava/lang/Object;)Z

    .line 15
    move-result v4

    .line 16
    .line 17
    if-eqz v4, :cond_0

    .line 18
    .line 19
    .line 20
    invoke-virtual {v3, v0, v1, v2}, Lcom/swmansion/gesturehandler/RNSVGHitTester$Companion;->hitTest(Landroid/view/View;FF)Z

    .line 21
    move-result v0

    .line 22
    return v0

    .line 23
    .line 24
    .line 25
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 26
    move-result v3

    .line 27
    int-to-float v3, v3

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 31
    move-result v0

    .line 32
    int-to-float v0, v0

    .line 33
    .line 34
    move-object/from16 v4, p0

    .line 35
    .line 36
    iget-object v5, v4, Lcom/swmansion/gesturehandler/core/GestureHandler;->r:[F

    .line 37
    const/4 v6, 0x1

    .line 38
    const/4 v7, 0x0

    .line 39
    const/4 v8, 0x0

    .line 40
    .line 41
    if-eqz v5, :cond_9

    .line 42
    .line 43
    aget v9, v5, v7

    .line 44
    .line 45
    aget v10, v5, v6

    .line 46
    const/4 v11, 0x2

    .line 47
    .line 48
    aget v11, v5, v11

    .line 49
    const/4 v12, 0x3

    .line 50
    .line 51
    aget v12, v5, v12

    .line 52
    .line 53
    sget-object v13, Lcom/swmansion/gesturehandler/core/GestureHandler;->J:Lcom/swmansion/gesturehandler/core/GestureHandler$Companion;

    .line 54
    .line 55
    .line 56
    invoke-static {v13, v9}, Lcom/swmansion/gesturehandler/core/GestureHandler$Companion;->access$hitSlopSet(Lcom/swmansion/gesturehandler/core/GestureHandler$Companion;F)Z

    .line 57
    move-result v14

    .line 58
    .line 59
    if-eqz v14, :cond_1

    .line 60
    .line 61
    sub-float v14, v8, v9

    .line 62
    goto :goto_0

    .line 63
    :cond_1
    move v14, v8

    .line 64
    .line 65
    .line 66
    :goto_0
    invoke-static {v13, v10}, Lcom/swmansion/gesturehandler/core/GestureHandler$Companion;->access$hitSlopSet(Lcom/swmansion/gesturehandler/core/GestureHandler$Companion;F)Z

    .line 67
    move-result v15

    .line 68
    .line 69
    if-eqz v15, :cond_2

    .line 70
    sub-float/2addr v8, v10

    .line 71
    .line 72
    .line 73
    :cond_2
    invoke-static {v13, v11}, Lcom/swmansion/gesturehandler/core/GestureHandler$Companion;->access$hitSlopSet(Lcom/swmansion/gesturehandler/core/GestureHandler$Companion;F)Z

    .line 74
    move-result v15

    .line 75
    .line 76
    if-eqz v15, :cond_3

    .line 77
    add-float/2addr v3, v11

    .line 78
    .line 79
    .line 80
    :cond_3
    invoke-static {v13, v12}, Lcom/swmansion/gesturehandler/core/GestureHandler$Companion;->access$hitSlopSet(Lcom/swmansion/gesturehandler/core/GestureHandler$Companion;F)Z

    .line 81
    move-result v15

    .line 82
    .line 83
    if-eqz v15, :cond_4

    .line 84
    add-float/2addr v0, v12

    .line 85
    :cond_4
    const/4 v15, 0x4

    .line 86
    .line 87
    aget v15, v5, v15

    .line 88
    .line 89
    const/16 v16, 0x5

    .line 90
    .line 91
    aget v5, v5, v16

    .line 92
    .line 93
    .line 94
    invoke-static {v13, v15}, Lcom/swmansion/gesturehandler/core/GestureHandler$Companion;->access$hitSlopSet(Lcom/swmansion/gesturehandler/core/GestureHandler$Companion;F)Z

    .line 95
    move-result v16

    .line 96
    .line 97
    if-eqz v16, :cond_6

    .line 98
    .line 99
    .line 100
    invoke-static {v13, v9}, Lcom/swmansion/gesturehandler/core/GestureHandler$Companion;->access$hitSlopSet(Lcom/swmansion/gesturehandler/core/GestureHandler$Companion;F)Z

    .line 101
    move-result v9

    .line 102
    .line 103
    if-nez v9, :cond_5

    .line 104
    .line 105
    sub-float v9, v3, v15

    .line 106
    move v14, v9

    .line 107
    goto :goto_1

    .line 108
    .line 109
    .line 110
    :cond_5
    invoke-static {v13, v11}, Lcom/swmansion/gesturehandler/core/GestureHandler$Companion;->access$hitSlopSet(Lcom/swmansion/gesturehandler/core/GestureHandler$Companion;F)Z

    .line 111
    move-result v9

    .line 112
    .line 113
    if-nez v9, :cond_6

    .line 114
    add-float/2addr v15, v14

    .line 115
    move v3, v15

    .line 116
    .line 117
    .line 118
    :cond_6
    :goto_1
    invoke-static {v13, v5}, Lcom/swmansion/gesturehandler/core/GestureHandler$Companion;->access$hitSlopSet(Lcom/swmansion/gesturehandler/core/GestureHandler$Companion;F)Z

    .line 119
    move-result v9

    .line 120
    .line 121
    if-eqz v9, :cond_8

    .line 122
    .line 123
    .line 124
    invoke-static {v13, v10}, Lcom/swmansion/gesturehandler/core/GestureHandler$Companion;->access$hitSlopSet(Lcom/swmansion/gesturehandler/core/GestureHandler$Companion;F)Z

    .line 125
    move-result v9

    .line 126
    .line 127
    if-nez v9, :cond_7

    .line 128
    .line 129
    sub-float v5, v0, v5

    .line 130
    move v8, v5

    .line 131
    goto :goto_2

    .line 132
    .line 133
    .line 134
    :cond_7
    invoke-static {v13, v12}, Lcom/swmansion/gesturehandler/core/GestureHandler$Companion;->access$hitSlopSet(Lcom/swmansion/gesturehandler/core/GestureHandler$Companion;F)Z

    .line 135
    move-result v9

    .line 136
    .line 137
    if-nez v9, :cond_8

    .line 138
    add-float/2addr v5, v8

    .line 139
    move v0, v5

    .line 140
    :cond_8
    :goto_2
    move v5, v8

    .line 141
    move v8, v14

    .line 142
    goto :goto_3

    .line 143
    :cond_9
    move v5, v8

    .line 144
    .line 145
    :goto_3
    cmpg-float v8, v8, v1

    .line 146
    .line 147
    if-gtz v8, :cond_a

    .line 148
    .line 149
    cmpg-float v1, v1, v3

    .line 150
    .line 151
    if-gtz v1, :cond_a

    .line 152
    .line 153
    cmpg-float v1, v5, v2

    .line 154
    .line 155
    if-gtz v1, :cond_a

    .line 156
    .line 157
    cmpg-float v0, v2, v0

    .line 158
    .line 159
    if-gtz v0, :cond_a

    .line 160
    return v6

    .line 161
    :cond_a
    return v7
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
.end method

.method public final e0(I)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    .line 4
    .line 5
    iget v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->f:I

    .line 6
    .line 7
    if-ne v0, p1, :cond_0

    .line 8
    return-void

    .line 9
    .line 10
    :cond_0
    iget v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->o:I

    .line 11
    .line 12
    if-lez v0, :cond_2

    .line 13
    const/4 v0, 0x5

    .line 14
    .line 15
    if-eq p1, v0, :cond_1

    .line 16
    const/4 v0, 0x3

    .line 17
    .line 18
    if-eq p1, v0, :cond_1

    .line 19
    const/4 v0, 0x1

    .line 20
    .line 21
    if-ne p1, v0, :cond_2

    .line 22
    .line 23
    .line 24
    :cond_1
    invoke-virtual {p0}, Lcom/swmansion/gesturehandler/core/GestureHandler;->p()V

    .line 25
    .line 26
    :cond_2
    iget v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->f:I

    .line 27
    .line 28
    iput p1, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->f:I

    .line 29
    const/4 v1, 0x4

    .line 30
    .line 31
    if-ne p1, v1, :cond_3

    .line 32
    .line 33
    sget-short v1, Lcom/swmansion/gesturehandler/core/GestureHandler;->M:S

    .line 34
    .line 35
    add-int/lit8 v2, v1, 0x1

    .line 36
    int-to-short v2, v2

    .line 37
    .line 38
    sput-short v2, Lcom/swmansion/gesturehandler/core/GestureHandler;->M:S

    .line 39
    .line 40
    iput-short v1, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->s:S

    .line 41
    .line 42
    :cond_3
    iget-object v1, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->A:Lcom/swmansion/gesturehandler/core/GestureHandlerOrchestrator;

    .line 43
    .line 44
    .line 45
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, p0, p1, v0}, Lcom/swmansion/gesturehandler/core/GestureHandlerOrchestrator;->A(Lcom/swmansion/gesturehandler/core/GestureHandler;II)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, p1, v0}, Lcom/swmansion/gesturehandler/core/GestureHandler;->l0(II)V

    .line 52
    return-void
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
.end method

.method public final f0(Landroid/view/MotionEvent;)Z
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 4
    move-result p1

    .line 5
    .line 6
    iget v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->b:I

    .line 7
    const/4 v1, 0x1

    .line 8
    .line 9
    if-eq p1, v0, :cond_0

    .line 10
    return v1

    .line 11
    .line 12
    :cond_0
    iget-object p1, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->a:[I

    .line 13
    array-length p1, p1

    .line 14
    const/4 v0, 0x0

    .line 15
    move v2, v0

    .line 16
    .line 17
    :goto_0
    if-ge v2, p1, :cond_2

    .line 18
    .line 19
    iget-object v3, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->a:[I

    .line 20
    .line 21
    aget v3, v3, v2

    .line 22
    const/4 v4, -0x1

    .line 23
    .line 24
    if-eq v3, v4, :cond_1

    .line 25
    .line 26
    if-eq v3, v2, :cond_1

    .line 27
    return v1

    .line 28
    .line 29
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 30
    goto :goto_0

    .line 31
    :cond_2
    return v0
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
.end method

.method public g0()V
    .locals 0

    .line 1
    return-void
    .line 2
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
.end method

.method public h0(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)V
    .locals 1
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/MotionEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "event"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string/jumbo p1, "sourceEvent"

    .line 9
    .line 10
    .line 11
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    const/4 p1, 0x1

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lcom/swmansion/gesturehandler/core/GestureHandler;->e0(I)V

    .line 16
    return-void
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
.end method

.method public final i()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Lcom/swmansion/gesturehandler/core/GestureHandler;->j(Z)V

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
.end method

.method public i0(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)V
    .locals 1
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/MotionEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "event"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string/jumbo p1, "sourceEvent"

    .line 9
    .line 10
    .line 11
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

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
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public j(Z)V
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->v:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    if-eqz p1, :cond_1

    .line 7
    .line 8
    :cond_0
    iget p1, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->f:I

    .line 9
    .line 10
    if-eqz p1, :cond_2

    .line 11
    const/4 v0, 0x2

    .line 12
    .line 13
    if-ne p1, v0, :cond_1

    .line 14
    goto :goto_0

    .line 15
    :cond_1
    return-void

    .line 16
    :cond_2
    :goto_0
    const/4 p1, 0x4

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p1}, Lcom/swmansion/gesturehandler/core/GestureHandler;->e0(I)V

    .line 20
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public j0()V
    .locals 0

    .line 1
    return-void
    .line 2
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
.end method

.method public final k(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;
    .locals 25

    .line 1
    .line 2
    move-object/from16 v1, p0

    .line 3
    .line 4
    move-object/from16 v2, p1

    .line 5
    .line 6
    .line 7
    invoke-virtual/range {p0 .. p1}, Lcom/swmansion/gesturehandler/core/GestureHandler;->f0(Landroid/view/MotionEvent;)Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    return-object v2

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 15
    move-result v0

    .line 16
    const/4 v3, 0x2

    .line 17
    const/4 v4, 0x5

    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, -0x1

    .line 20
    const/4 v7, 0x1

    .line 21
    .line 22
    if-eqz v0, :cond_3

    .line 23
    const/4 v8, 0x6

    .line 24
    .line 25
    if-eq v0, v7, :cond_1

    .line 26
    .line 27
    if-eq v0, v4, :cond_3

    .line 28
    .line 29
    if-eq v0, v8, :cond_1

    .line 30
    move v3, v0

    .line 31
    move v0, v6

    .line 32
    goto :goto_0

    .line 33
    .line 34
    .line 35
    :cond_1
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 36
    move-result v0

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 40
    move-result v4

    .line 41
    .line 42
    iget-object v9, v1, Lcom/swmansion/gesturehandler/core/GestureHandler;->a:[I

    .line 43
    .line 44
    aget v4, v9, v4

    .line 45
    .line 46
    if-eq v4, v6, :cond_5

    .line 47
    .line 48
    iget v3, v1, Lcom/swmansion/gesturehandler/core/GestureHandler;->b:I

    .line 49
    .line 50
    if-ne v3, v7, :cond_2

    .line 51
    move v3, v7

    .line 52
    goto :goto_0

    .line 53
    :cond_2
    move v3, v8

    .line 54
    goto :goto_0

    .line 55
    .line 56
    .line 57
    :cond_3
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 58
    move-result v0

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 62
    move-result v8

    .line 63
    .line 64
    iget-object v9, v1, Lcom/swmansion/gesturehandler/core/GestureHandler;->a:[I

    .line 65
    .line 66
    aget v8, v9, v8

    .line 67
    .line 68
    if-eq v8, v6, :cond_5

    .line 69
    .line 70
    iget v3, v1, Lcom/swmansion/gesturehandler/core/GestureHandler;->b:I

    .line 71
    .line 72
    if-ne v3, v7, :cond_4

    .line 73
    move v3, v5

    .line 74
    goto :goto_0

    .line 75
    :cond_4
    move v3, v4

    .line 76
    .line 77
    :cond_5
    :goto_0
    sget-object v4, Lcom/swmansion/gesturehandler/core/GestureHandler;->J:Lcom/swmansion/gesturehandler/core/GestureHandler$Companion;

    .line 78
    .line 79
    iget v7, v1, Lcom/swmansion/gesturehandler/core/GestureHandler;->b:I

    .line 80
    .line 81
    .line 82
    invoke-static {v4, v7}, Lcom/swmansion/gesturehandler/core/GestureHandler$Companion;->access$initPointerProps(Lcom/swmansion/gesturehandler/core/GestureHandler$Companion;I)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getRawX()F

    .line 86
    move-result v4

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getX()F

    .line 90
    move-result v7

    .line 91
    sub-float/2addr v4, v7

    .line 92
    .line 93
    .line 94
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getRawY()F

    .line 95
    move-result v7

    .line 96
    .line 97
    .line 98
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getY()F

    .line 99
    move-result v8

    .line 100
    sub-float/2addr v7, v8

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2, v4, v7}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 107
    move-result v8

    .line 108
    move v13, v3

    .line 109
    move v14, v5

    .line 110
    .line 111
    .line 112
    :goto_1
    const-string/jumbo v3, "pointerCoords"

    .line 113
    .line 114
    .line 115
    const-string/jumbo v9, "pointerProps"

    .line 116
    const/4 v10, 0x0

    .line 117
    .line 118
    if-ge v5, v8, :cond_b

    .line 119
    .line 120
    .line 121
    invoke-virtual {v2, v5}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 122
    move-result v11

    .line 123
    .line 124
    iget-object v12, v1, Lcom/swmansion/gesturehandler/core/GestureHandler;->a:[I

    .line 125
    .line 126
    aget v12, v12, v11

    .line 127
    .line 128
    if-eq v12, v6, :cond_a

    .line 129
    .line 130
    sget-object v12, Lcom/swmansion/gesturehandler/core/GestureHandler;->K:[Landroid/view/MotionEvent$PointerProperties;

    .line 131
    .line 132
    if-nez v12, :cond_6

    .line 133
    .line 134
    .line 135
    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 136
    move-object v12, v10

    .line 137
    .line 138
    :cond_6
    aget-object v12, v12, v14

    .line 139
    .line 140
    .line 141
    invoke-virtual {v2, v5, v12}, Landroid/view/MotionEvent;->getPointerProperties(ILandroid/view/MotionEvent$PointerProperties;)V

    .line 142
    .line 143
    sget-object v12, Lcom/swmansion/gesturehandler/core/GestureHandler;->K:[Landroid/view/MotionEvent$PointerProperties;

    .line 144
    .line 145
    if-nez v12, :cond_7

    .line 146
    .line 147
    .line 148
    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 149
    move-object v12, v10

    .line 150
    .line 151
    :cond_7
    aget-object v9, v12, v14

    .line 152
    .line 153
    .line 154
    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 155
    .line 156
    iget-object v12, v1, Lcom/swmansion/gesturehandler/core/GestureHandler;->a:[I

    .line 157
    .line 158
    aget v11, v12, v11

    .line 159
    .line 160
    iput v11, v9, Landroid/view/MotionEvent$PointerProperties;->id:I

    .line 161
    .line 162
    sget-object v9, Lcom/swmansion/gesturehandler/core/GestureHandler;->L:[Landroid/view/MotionEvent$PointerCoords;

    .line 163
    .line 164
    if-nez v9, :cond_8

    .line 165
    .line 166
    .line 167
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 168
    goto :goto_2

    .line 169
    :cond_8
    move-object v10, v9

    .line 170
    .line 171
    :goto_2
    aget-object v3, v10, v14

    .line 172
    .line 173
    .line 174
    invoke-virtual {v2, v5, v3}, Landroid/view/MotionEvent;->getPointerCoords(ILandroid/view/MotionEvent$PointerCoords;)V

    .line 175
    .line 176
    if-ne v5, v0, :cond_9

    .line 177
    .line 178
    shl-int/lit8 v3, v14, 0x8

    .line 179
    or-int/2addr v13, v3

    .line 180
    .line 181
    :cond_9
    add-int/lit8 v14, v14, 0x1

    .line 182
    .line 183
    :cond_a
    add-int/lit8 v5, v5, 0x1

    .line 184
    goto :goto_1

    .line 185
    .line 186
    :cond_b
    sget-object v0, Lcom/swmansion/gesturehandler/core/GestureHandler;->K:[Landroid/view/MotionEvent$PointerProperties;

    .line 187
    .line 188
    if-nez v0, :cond_c

    .line 189
    .line 190
    .line 191
    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 192
    move-object v0, v10

    .line 193
    :cond_c
    array-length v0, v0

    .line 194
    .line 195
    if-nez v0, :cond_d

    .line 196
    goto :goto_3

    .line 197
    .line 198
    :cond_d
    sget-object v0, Lcom/swmansion/gesturehandler/core/GestureHandler;->L:[Landroid/view/MotionEvent$PointerCoords;

    .line 199
    .line 200
    if-nez v0, :cond_e

    .line 201
    .line 202
    .line 203
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 204
    move-object v0, v10

    .line 205
    :cond_e
    array-length v0, v0

    .line 206
    .line 207
    if-nez v0, :cond_11

    .line 208
    .line 209
    :goto_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 210
    .line 211
    sget-object v2, Lcom/swmansion/gesturehandler/core/GestureHandler;->L:[Landroid/view/MotionEvent$PointerCoords;

    .line 212
    .line 213
    if-nez v2, :cond_f

    .line 214
    .line 215
    .line 216
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 217
    move-object v2, v10

    .line 218
    :cond_f
    array-length v2, v2

    .line 219
    .line 220
    sget-object v3, Lcom/swmansion/gesturehandler/core/GestureHandler;->K:[Landroid/view/MotionEvent$PointerProperties;

    .line 221
    .line 222
    if-nez v3, :cond_10

    .line 223
    .line 224
    .line 225
    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 226
    goto :goto_4

    .line 227
    :cond_10
    move-object v10, v3

    .line 228
    :goto_4
    array-length v3, v10

    .line 229
    .line 230
    new-instance v4, Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 234
    .line 235
    .line 236
    const-string/jumbo v5, "pointerCoords.size="

    .line 237
    .line 238
    .line 239
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    const-string v2, ", pointerProps.size="

    .line 245
    .line 246
    .line 247
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 254
    move-result-object v2

    .line 255
    .line 256
    .line 257
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 258
    throw v0

    .line 259
    :cond_11
    move-object v0, v9

    .line 260
    move-object v5, v10

    .line 261
    .line 262
    .line 263
    :try_start_0
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getDownTime()J

    .line 264
    move-result-wide v9

    .line 265
    .line 266
    .line 267
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getEventTime()J

    .line 268
    move-result-wide v11

    .line 269
    .line 270
    sget-object v6, Lcom/swmansion/gesturehandler/core/GestureHandler;->K:[Landroid/view/MotionEvent$PointerProperties;

    .line 271
    .line 272
    if-nez v6, :cond_12

    .line 273
    .line 274
    .line 275
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 276
    move-object v15, v5

    .line 277
    goto :goto_5

    .line 278
    :catch_0
    move-exception v0

    .line 279
    goto :goto_7

    .line 280
    :cond_12
    move-object v15, v6

    .line 281
    .line 282
    :goto_5
    sget-object v0, Lcom/swmansion/gesturehandler/core/GestureHandler;->L:[Landroid/view/MotionEvent$PointerCoords;

    .line 283
    .line 284
    if-nez v0, :cond_13

    .line 285
    .line 286
    .line 287
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 288
    .line 289
    move-object/from16 v16, v5

    .line 290
    goto :goto_6

    .line 291
    .line 292
    :cond_13
    move-object/from16 v16, v0

    .line 293
    .line 294
    .line 295
    :goto_6
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getMetaState()I

    .line 296
    move-result v17

    .line 297
    .line 298
    .line 299
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getButtonState()I

    .line 300
    move-result v18

    .line 301
    .line 302
    .line 303
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getXPrecision()F

    .line 304
    move-result v19

    .line 305
    .line 306
    .line 307
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getYPrecision()F

    .line 308
    move-result v20

    .line 309
    .line 310
    .line 311
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getDeviceId()I

    .line 312
    move-result v21

    .line 313
    .line 314
    .line 315
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getEdgeFlags()I

    .line 316
    move-result v22

    .line 317
    .line 318
    .line 319
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getSource()I

    .line 320
    move-result v23

    .line 321
    .line 322
    .line 323
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getFlags()I

    .line 324
    move-result v24

    .line 325
    .line 326
    .line 327
    invoke-static/range {v9 .. v24}, Landroid/view/MotionEvent;->obtain(JJII[Landroid/view/MotionEvent$PointerProperties;[Landroid/view/MotionEvent$PointerCoords;IIFFIIII)Landroid/view/MotionEvent;

    .line 328
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 329
    neg-float v3, v4

    .line 330
    neg-float v4, v7

    .line 331
    .line 332
    .line 333
    invoke-virtual {v2, v3, v4}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 334
    .line 335
    .line 336
    invoke-virtual {v0, v3, v4}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 337
    return-object v0

    .line 338
    .line 339
    :goto_7
    new-instance v3, Lcom/swmansion/gesturehandler/core/GestureHandler$AdaptEventException;

    .line 340
    .line 341
    .line 342
    invoke-direct {v3, v1, v2, v0}, Lcom/swmansion/gesturehandler/core/GestureHandler$AdaptEventException;-><init>(Lcom/swmansion/gesturehandler/core/GestureHandler;Landroid/view/MotionEvent;Ljava/lang/IllegalArgumentException;)V

    .line 343
    throw v3
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
.end method

.method public k0()V
    .locals 0

    .line 1
    return-void
    .line 2
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
.end method

.method public final l(Lcom/swmansion/gesturehandler/core/GestureHandler$a;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->l:Lcom/facebook/react/bridge/WritableArray;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createArray()Lcom/facebook/react/bridge/WritableArray;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    iput-object v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->l:Lcom/facebook/react/bridge/WritableArray;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->l:Lcom/facebook/react/bridge/WritableArray;

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lcom/swmansion/gesturehandler/core/GestureHandler;->s(Lcom/swmansion/gesturehandler/core/GestureHandler$a;)Lcom/facebook/react/bridge/WritableMap;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    .line 22
    invoke-interface {v0, p1}, Lcom/facebook/react/bridge/WritableArray;->pushMap(Lcom/facebook/react/bridge/ReadableMap;)V

    .line 23
    return-void
    .line 24
    .line 25
.end method

.method public l0(II)V
    .locals 0

    .line 1
    return-void
    .line 2
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
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final m(Lcom/swmansion/gesturehandler/core/GestureHandler$a;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->m:Lcom/facebook/react/bridge/WritableArray;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createArray()Lcom/facebook/react/bridge/WritableArray;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    iput-object v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->m:Lcom/facebook/react/bridge/WritableArray;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->m:Lcom/facebook/react/bridge/WritableArray;

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lcom/swmansion/gesturehandler/core/GestureHandler;->s(Lcom/swmansion/gesturehandler/core/GestureHandler$a;)Lcom/facebook/react/bridge/WritableMap;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    .line 22
    invoke-interface {v0, p1}, Lcom/facebook/react/bridge/WritableArray;->pushMap(Lcom/facebook/react/bridge/ReadableMap;)V

    .line 23
    return-void
    .line 24
    .line 25
.end method

.method public final m0(Landroid/view/View;Lcom/swmansion/gesturehandler/core/GestureHandlerOrchestrator;)V
    .locals 2
    .param p1    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/swmansion/gesturehandler/core/GestureHandlerOrchestrator;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iget-object v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->e:Landroid/view/View;

    .line 3
    .line 4
    if-nez v0, :cond_3

    .line 5
    .line 6
    iget-object v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->A:Lcom/swmansion/gesturehandler/core/GestureHandlerOrchestrator;

    .line 7
    .line 8
    if-nez v0, :cond_3

    .line 9
    .line 10
    iget-object v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->a:[I

    .line 11
    const/4 v1, -0x1

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    .line 15
    const/4 v0, 0x0

    .line 16
    .line 17
    iput v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->b:I

    .line 18
    .line 19
    iput v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->f:I

    .line 20
    .line 21
    iput-object p1, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->e:Landroid/view/View;

    .line 22
    .line 23
    iput-object p2, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->A:Lcom/swmansion/gesturehandler/core/GestureHandlerOrchestrator;

    .line 24
    const/4 p2, 0x0

    .line 25
    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 30
    move-result-object p1

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move-object p1, p2

    .line 33
    .line 34
    .line 35
    :goto_0
    invoke-virtual {p0, p1}, Lcom/swmansion/gesturehandler/core/GestureHandler;->F(Landroid/content/Context;)Landroid/app/Activity;

    .line 36
    move-result-object p1

    .line 37
    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    .line 41
    const p2, 0x1020002

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, p2}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 45
    move-result-object p2

    .line 46
    .line 47
    :cond_1
    if-eqz p2, :cond_2

    .line 48
    .line 49
    iget-object p1, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->c:[I

    .line 50
    .line 51
    .line 52
    invoke-virtual {p2, p1}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 53
    goto :goto_1

    .line 54
    .line 55
    :cond_2
    iget-object p1, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->c:[I

    .line 56
    .line 57
    aput v0, p1, v0

    .line 58
    const/4 p2, 0x1

    .line 59
    .line 60
    aput v0, p1, p2

    .line 61
    .line 62
    .line 63
    :goto_1
    invoke-virtual {p0}, Lcom/swmansion/gesturehandler/core/GestureHandler;->j0()V

    .line 64
    return-void

    .line 65
    .line 66
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 67
    .line 68
    const-string p2, "Already prepared or hasn\'t been reset"

    .line 69
    .line 70
    .line 71
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 72
    throw p1
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
.end method

.method public final n()V
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->f:I

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    const/4 v0, 0x2

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lcom/swmansion/gesturehandler/core/GestureHandler;->e0(I)V

    .line 9
    :cond_0
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public final n0()V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput-object v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->e:Landroid/view/View;

    .line 4
    .line 5
    iput-object v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->A:Lcom/swmansion/gesturehandler/core/GestureHandlerOrchestrator;

    .line 6
    .line 7
    iget-object v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->a:[I

    .line 8
    const/4 v1, -0x1

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    .line 12
    const/4 v0, 0x0

    .line 13
    .line 14
    iput v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->b:I

    .line 15
    .line 16
    iput v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->o:I

    .line 17
    .line 18
    iget-object v1, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->p:[Lcom/swmansion/gesturehandler/core/GestureHandler$a;

    .line 19
    const/4 v5, 0x6

    .line 20
    const/4 v6, 0x0

    .line 21
    const/4 v2, 0x0

    .line 22
    const/4 v3, 0x0

    .line 23
    const/4 v4, 0x0

    .line 24
    .line 25
    .line 26
    invoke-static/range {v1 .. v6}, Lkotlin/collections/ArraysKt;->fill$default([Ljava/lang/Object;Ljava/lang/Object;IIILjava/lang/Object;)V

    .line 27
    .line 28
    iput v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->n:I

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/swmansion/gesturehandler/core/GestureHandler;->k0()V

    .line 32
    return-void
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

.method public final o()V
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->f:I

    .line 3
    const/4 v1, 0x4

    .line 4
    .line 5
    if-eq v0, v1, :cond_1

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    const/4 v1, 0x2

    .line 9
    .line 10
    if-eq v0, v1, :cond_1

    .line 11
    .line 12
    iget-boolean v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->H:Z

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    return-void

    .line 17
    .line 18
    .line 19
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/swmansion/gesturehandler/core/GestureHandler;->g0()V

    .line 20
    const/4 v0, 0x3

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v0}, Lcom/swmansion/gesturehandler/core/GestureHandler;->e0(I)V

    .line 24
    return-void
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

.method public o0()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput-boolean v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->q:Z

    .line 4
    .line 5
    iput-boolean v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->v:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->y:Z

    .line 8
    const/4 v0, 0x1

    .line 9
    .line 10
    iput-boolean v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->j:Z

    .line 11
    const/4 v0, 0x0

    .line 12
    .line 13
    iput-object v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->r:[F

    .line 14
    return-void
    .line 15
    .line 16
    .line 17
.end method

.method public final p()V
    .locals 10

    .line 1
    const/4 v0, 0x4

    .line 2
    .line 3
    iput v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->n:I

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-object v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->l:Lcom/facebook/react/bridge/WritableArray;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/swmansion/gesturehandler/core/GestureHandler;->A()V

    .line 10
    .line 11
    iget-object v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->p:[Lcom/swmansion/gesturehandler/core/GestureHandler$a;

    .line 12
    array-length v1, v0

    .line 13
    const/4 v2, 0x0

    .line 14
    move v3, v2

    .line 15
    .line 16
    :goto_0
    if-ge v3, v1, :cond_1

    .line 17
    .line 18
    aget-object v4, v0, v3

    .line 19
    .line 20
    if-eqz v4, :cond_0

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v4}, Lcom/swmansion/gesturehandler/core/GestureHandler;->l(Lcom/swmansion/gesturehandler/core/GestureHandler$a;)V

    .line 24
    .line 25
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 26
    goto :goto_0

    .line 27
    .line 28
    :cond_1
    iput v2, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->o:I

    .line 29
    .line 30
    iget-object v4, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->p:[Lcom/swmansion/gesturehandler/core/GestureHandler$a;

    .line 31
    const/4 v8, 0x6

    .line 32
    const/4 v9, 0x0

    .line 33
    const/4 v5, 0x0

    .line 34
    const/4 v6, 0x0

    .line 35
    const/4 v7, 0x0

    .line 36
    .line 37
    .line 38
    invoke-static/range {v4 .. v9}, Lkotlin/collections/ArraysKt;->fill$default([Ljava/lang/Object;Ljava/lang/Object;IIILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/swmansion/gesturehandler/core/GestureHandler;->w()V

    .line 42
    return-void
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

.method public p0()V
    .locals 0

    .line 1
    return-void
    .line 2
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
.end method

.method public final q()Lcom/facebook/react/bridge/WritableArray;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->m:Lcom/facebook/react/bridge/WritableArray;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    iput-object v1, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->m:Lcom/facebook/react/bridge/WritableArray;

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
.end method

.method public final q0()Lcom/swmansion/gesturehandler/core/GestureHandler;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TConcreteGestureHandlerT;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "null cannot be cast to non-null type ConcreteGestureHandlerT of com.swmansion.gesturehandler.core.GestureHandler"

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    return-object p0
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
.end method

.method public final r()Lcom/facebook/react/bridge/WritableArray;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->l:Lcom/facebook/react/bridge/WritableArray;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    iput-object v1, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->l:Lcom/facebook/react/bridge/WritableArray;

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
.end method

.method public final r0(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->k:I

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
.end method

.method public final s(Lcom/swmansion/gesturehandler/core/GestureHandler$a;)Lcom/facebook/react/bridge/WritableMap;
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/swmansion/gesturehandler/core/GestureHandler$a;->c()I

    .line 8
    move-result v1

    .line 9
    .line 10
    const-string v2, "id"

    .line 11
    .line 12
    .line 13
    invoke-interface {v0, v2, v1}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/swmansion/gesturehandler/core/GestureHandler$a;->d()F

    .line 17
    move-result v1

    .line 18
    .line 19
    .line 20
    invoke-static {v1}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 21
    move-result v1

    .line 22
    float-to-double v1, v1

    .line 23
    .line 24
    .line 25
    const-string/jumbo v3, "x"

    .line 26
    .line 27
    .line 28
    invoke-interface {v0, v3, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/swmansion/gesturehandler/core/GestureHandler$a;->e()F

    .line 32
    move-result v1

    .line 33
    .line 34
    .line 35
    invoke-static {v1}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 36
    move-result v1

    .line 37
    float-to-double v1, v1

    .line 38
    .line 39
    .line 40
    const-string/jumbo v3, "y"

    .line 41
    .line 42
    .line 43
    invoke-interface {v0, v3, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, Lcom/swmansion/gesturehandler/core/GestureHandler$a;->a()F

    .line 47
    move-result v1

    .line 48
    .line 49
    .line 50
    invoke-static {v1}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 51
    move-result v1

    .line 52
    float-to-double v1, v1

    .line 53
    .line 54
    const-string v3, "absoluteX"

    .line 55
    .line 56
    .line 57
    invoke-interface {v0, v3, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1}, Lcom/swmansion/gesturehandler/core/GestureHandler$a;->b()F

    .line 61
    move-result p1

    .line 62
    .line 63
    .line 64
    invoke-static {p1}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 65
    move-result p1

    .line 66
    float-to-double v1, p1

    .line 67
    .line 68
    const-string p1, "absoluteY"

    .line 69
    .line 70
    .line 71
    invoke-interface {v0, p1, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 72
    return-object v0
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
.end method

.method public final s0(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->F:I

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
.end method

.method public t(Landroid/view/MotionEvent;)V
    .locals 2
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "event"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->B:Lrb0/l;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/swmansion/gesturehandler/core/GestureHandler;->q0()Lcom/swmansion/gesturehandler/core/GestureHandler;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, v1, p1}, Lrb0/l;->c(Lcom/swmansion/gesturehandler/core/GestureHandler;Landroid/view/MotionEvent;)V

    .line 17
    :cond_0
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public final t0(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->G:Z

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
.end method

.method public toString()Ljava/lang/String;
    .locals 4
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->e:Landroid/view/View;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    const/4 v0, 0x0

    .line 6
    goto :goto_0

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    .line 20
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 25
    move-result-object v1

    .line 26
    .line 27
    iget v2, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->d:I

    .line 28
    .line 29
    new-instance v3, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string v1, "@["

    .line 38
    .line 39
    .line 40
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    const-string v1, "]:"

    .line 46
    .line 47
    .line 48
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    move-result-object v0

    .line 56
    return-object v0
    .line 57
.end method

.method public u(II)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->B:Lrb0/l;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/swmansion/gesturehandler/core/GestureHandler;->q0()Lcom/swmansion/gesturehandler/core/GestureHandler;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, v1, p1, p2}, Lrb0/l;->a(Lcom/swmansion/gesturehandler/core/GestureHandler;II)V

    .line 12
    :cond_0
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
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final u0(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->H:Z

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
.end method

.method public final v(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)V
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput-object v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->l:Lcom/facebook/react/bridge/WritableArray;

    .line 4
    const/4 v0, 0x1

    .line 5
    .line 6
    iput v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->n:I

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 10
    move-result v1

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 14
    move-result v3

    .line 15
    .line 16
    .line 17
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    .line 18
    move-result v1

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    .line 22
    move-result v2

    .line 23
    sub-float/2addr v1, v2

    .line 24
    .line 25
    .line 26
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    .line 27
    move-result v2

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 31
    move-result v4

    .line 32
    sub-float/2addr v2, v4

    .line 33
    .line 34
    iget-object v8, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->p:[Lcom/swmansion/gesturehandler/core/GestureHandler$a;

    .line 35
    move v4, v2

    .line 36
    .line 37
    new-instance v2, Lcom/swmansion/gesturehandler/core/GestureHandler$a;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 41
    move-result v5

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, v5}, Landroid/view/MotionEvent;->getX(I)F

    .line 45
    move-result v5

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 49
    move-result v6

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, v6}, Landroid/view/MotionEvent;->getY(I)F

    .line 53
    move-result v6

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 57
    move-result v7

    .line 58
    .line 59
    .line 60
    invoke-virtual {p2, v7}, Landroid/view/MotionEvent;->getX(I)F

    .line 61
    move-result v7

    .line 62
    add-float/2addr v7, v1

    .line 63
    .line 64
    iget-object v1, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->c:[I

    .line 65
    const/4 v9, 0x0

    .line 66
    .line 67
    aget v1, v1, v9

    .line 68
    int-to-float v1, v1

    .line 69
    sub-float/2addr v7, v1

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 73
    move-result p1

    .line 74
    .line 75
    .line 76
    invoke-virtual {p2, p1}, Landroid/view/MotionEvent;->getY(I)F

    .line 77
    move-result p1

    .line 78
    add-float/2addr p1, v4

    .line 79
    .line 80
    iget-object p2, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->c:[I

    .line 81
    .line 82
    aget p2, p2, v0

    .line 83
    int-to-float p2, p2

    .line 84
    sub-float/2addr p1, p2

    .line 85
    move v4, v5

    .line 86
    move v5, v6

    .line 87
    move v6, v7

    .line 88
    move v7, p1

    .line 89
    .line 90
    .line 91
    invoke-direct/range {v2 .. v7}, Lcom/swmansion/gesturehandler/core/GestureHandler$a;-><init>(IFFFF)V

    .line 92
    .line 93
    aput-object v2, v8, v3

    .line 94
    .line 95
    iget p1, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->o:I

    .line 96
    add-int/2addr p1, v0

    .line 97
    .line 98
    iput p1, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->o:I

    .line 99
    .line 100
    iget-object p1, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->p:[Lcom/swmansion/gesturehandler/core/GestureHandler$a;

    .line 101
    .line 102
    aget-object p1, p1, v3

    .line 103
    .line 104
    .line 105
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0, p1}, Lcom/swmansion/gesturehandler/core/GestureHandler;->l(Lcom/swmansion/gesturehandler/core/GestureHandler$a;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0}, Lcom/swmansion/gesturehandler/core/GestureHandler;->A()V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0}, Lcom/swmansion/gesturehandler/core/GestureHandler;->w()V

    .line 115
    return-void
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
.end method

.method public final v0(Z)Lcom/swmansion/gesturehandler/core/GestureHandler;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)TConcreteGestureHandlerT;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/swmansion/gesturehandler/core/GestureHandler;->f(Lcom/swmansion/gesturehandler/core/GestureHandler;)Lcom/swmansion/gesturehandler/core/GestureHandler;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget-object v1, v0, Lcom/swmansion/gesturehandler/core/GestureHandler;->e:Landroid/view/View;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    iget-boolean v1, v0, Lcom/swmansion/gesturehandler/core/GestureHandler;->j:Z

    .line 11
    .line 12
    if-eq v1, p1, :cond_0

    .line 13
    .line 14
    new-instance v1, Lrb0/b;

    .line 15
    .line 16
    .line 17
    invoke-direct {v1, v0}, Lrb0/b;-><init>(Lcom/swmansion/gesturehandler/core/GestureHandler;)V

    .line 18
    .line 19
    .line 20
    invoke-static {v1}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    .line 21
    .line 22
    :cond_0
    iput-boolean p1, v0, Lcom/swmansion/gesturehandler/core/GestureHandler;->j:Z

    .line 23
    return-object v0
    .line 24
    .line 25
.end method

.method public w()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->l:Lcom/facebook/react/bridge/WritableArray;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->B:Lrb0/l;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/swmansion/gesturehandler/core/GestureHandler;->q0()Lcom/swmansion/gesturehandler/core/GestureHandler;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    .line 15
    invoke-interface {v0, v1}, Lrb0/l;->b(Lcom/swmansion/gesturehandler/core/GestureHandler;)V

    .line 16
    :cond_0
    return-void
    .line 17
.end method

.method public final x(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)V
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput-object v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->l:Lcom/facebook/react/bridge/WritableArray;

    .line 4
    const/4 v0, 0x2

    .line 5
    .line 6
    iput v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->n:I

    .line 7
    .line 8
    .line 9
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    .line 10
    move-result v0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    .line 14
    move-result v1

    .line 15
    sub-float/2addr v0, v1

    .line 16
    .line 17
    .line 18
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    .line 19
    move-result v1

    .line 20
    .line 21
    .line 22
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 23
    move-result v2

    .line 24
    sub-float/2addr v1, v2

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 28
    move-result v2

    .line 29
    const/4 v3, 0x0

    .line 30
    move v4, v3

    .line 31
    move v5, v4

    .line 32
    .line 33
    :goto_0
    if-ge v4, v2, :cond_2

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 37
    move-result v6

    .line 38
    .line 39
    iget-object v7, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->p:[Lcom/swmansion/gesturehandler/core/GestureHandler$a;

    .line 40
    .line 41
    aget-object v6, v7, v6

    .line 42
    .line 43
    if-nez v6, :cond_0

    .line 44
    goto :goto_1

    .line 45
    .line 46
    .line 47
    :cond_0
    invoke-virtual {v6}, Lcom/swmansion/gesturehandler/core/GestureHandler$a;->d()F

    .line 48
    move-result v7

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->getX(I)F

    .line 52
    move-result v8

    .line 53
    .line 54
    cmpg-float v7, v7, v8

    .line 55
    .line 56
    if-nez v7, :cond_1

    .line 57
    .line 58
    .line 59
    invoke-virtual {v6}, Lcom/swmansion/gesturehandler/core/GestureHandler$a;->e()F

    .line 60
    move-result v7

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->getY(I)F

    .line 64
    move-result v8

    .line 65
    .line 66
    cmpg-float v7, v7, v8

    .line 67
    .line 68
    if-nez v7, :cond_1

    .line 69
    goto :goto_1

    .line 70
    .line 71
    .line 72
    :cond_1
    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->getX(I)F

    .line 73
    move-result v7

    .line 74
    .line 75
    .line 76
    invoke-virtual {v6, v7}, Lcom/swmansion/gesturehandler/core/GestureHandler$a;->h(F)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->getY(I)F

    .line 80
    move-result v7

    .line 81
    .line 82
    .line 83
    invoke-virtual {v6, v7}, Lcom/swmansion/gesturehandler/core/GestureHandler$a;->i(F)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p2, v4}, Landroid/view/MotionEvent;->getX(I)F

    .line 87
    move-result v7

    .line 88
    add-float/2addr v7, v0

    .line 89
    .line 90
    iget-object v8, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->c:[I

    .line 91
    .line 92
    aget v8, v8, v3

    .line 93
    int-to-float v8, v8

    .line 94
    sub-float/2addr v7, v8

    .line 95
    .line 96
    .line 97
    invoke-virtual {v6, v7}, Lcom/swmansion/gesturehandler/core/GestureHandler$a;->f(F)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p2, v4}, Landroid/view/MotionEvent;->getY(I)F

    .line 101
    move-result v7

    .line 102
    add-float/2addr v7, v1

    .line 103
    .line 104
    iget-object v8, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->c:[I

    .line 105
    const/4 v9, 0x1

    .line 106
    .line 107
    aget v8, v8, v9

    .line 108
    int-to-float v8, v8

    .line 109
    sub-float/2addr v7, v8

    .line 110
    .line 111
    .line 112
    invoke-virtual {v6, v7}, Lcom/swmansion/gesturehandler/core/GestureHandler$a;->g(F)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0, v6}, Lcom/swmansion/gesturehandler/core/GestureHandler;->l(Lcom/swmansion/gesturehandler/core/GestureHandler$a;)V

    .line 116
    .line 117
    add-int/lit8 v5, v5, 0x1

    .line 118
    .line 119
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 120
    goto :goto_0

    .line 121
    .line 122
    :cond_2
    if-lez v5, :cond_3

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0}, Lcom/swmansion/gesturehandler/core/GestureHandler;->A()V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0}, Lcom/swmansion/gesturehandler/core/GestureHandler;->w()V

    .line 129
    :cond_3
    return-void
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
.end method

.method public final x0(FFFFFF)Lcom/swmansion/gesturehandler/core/GestureHandler;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FFFFFF)TConcreteGestureHandlerT;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/swmansion/gesturehandler/core/GestureHandler;->f(Lcom/swmansion/gesturehandler/core/GestureHandler;)Lcom/swmansion/gesturehandler/core/GestureHandler;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget-object v1, v0, Lcom/swmansion/gesturehandler/core/GestureHandler;->r:[F

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    const/4 v1, 0x6

    .line 10
    .line 11
    new-array v1, v1, [F

    .line 12
    .line 13
    iput-object v1, v0, Lcom/swmansion/gesturehandler/core/GestureHandler;->r:[F

    .line 14
    .line 15
    :cond_0
    iget-object v1, v0, Lcom/swmansion/gesturehandler/core/GestureHandler;->r:[F

    .line 16
    .line 17
    .line 18
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 19
    const/4 v2, 0x0

    .line 20
    .line 21
    aput p1, v1, v2

    .line 22
    .line 23
    iget-object v1, v0, Lcom/swmansion/gesturehandler/core/GestureHandler;->r:[F

    .line 24
    .line 25
    .line 26
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 27
    const/4 v2, 0x1

    .line 28
    .line 29
    aput p2, v1, v2

    .line 30
    .line 31
    iget-object v1, v0, Lcom/swmansion/gesturehandler/core/GestureHandler;->r:[F

    .line 32
    .line 33
    .line 34
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 35
    const/4 v2, 0x2

    .line 36
    .line 37
    aput p3, v1, v2

    .line 38
    .line 39
    iget-object v1, v0, Lcom/swmansion/gesturehandler/core/GestureHandler;->r:[F

    .line 40
    .line 41
    .line 42
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 43
    const/4 v2, 0x3

    .line 44
    .line 45
    aput p4, v1, v2

    .line 46
    .line 47
    iget-object v1, v0, Lcom/swmansion/gesturehandler/core/GestureHandler;->r:[F

    .line 48
    .line 49
    .line 50
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 51
    const/4 v2, 0x4

    .line 52
    .line 53
    aput p5, v1, v2

    .line 54
    .line 55
    iget-object v1, v0, Lcom/swmansion/gesturehandler/core/GestureHandler;->r:[F

    .line 56
    .line 57
    .line 58
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 59
    const/4 v2, 0x5

    .line 60
    .line 61
    aput p6, v1, v2

    .line 62
    .line 63
    sget-object v1, Lcom/swmansion/gesturehandler/core/GestureHandler;->J:Lcom/swmansion/gesturehandler/core/GestureHandler$Companion;

    .line 64
    .line 65
    .line 66
    invoke-static {v1, p5}, Lcom/swmansion/gesturehandler/core/GestureHandler$Companion;->access$hitSlopSet(Lcom/swmansion/gesturehandler/core/GestureHandler$Companion;F)Z

    .line 67
    move-result v2

    .line 68
    .line 69
    if-eqz v2, :cond_2

    .line 70
    .line 71
    .line 72
    invoke-static {v1, p1}, Lcom/swmansion/gesturehandler/core/GestureHandler$Companion;->access$hitSlopSet(Lcom/swmansion/gesturehandler/core/GestureHandler$Companion;F)Z

    .line 73
    move-result v2

    .line 74
    .line 75
    if-eqz v2, :cond_2

    .line 76
    .line 77
    .line 78
    invoke-static {v1, p3}, Lcom/swmansion/gesturehandler/core/GestureHandler$Companion;->access$hitSlopSet(Lcom/swmansion/gesturehandler/core/GestureHandler$Companion;F)Z

    .line 79
    move-result v2

    .line 80
    .line 81
    if-nez v2, :cond_1

    .line 82
    goto :goto_0

    .line 83
    .line 84
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 85
    .line 86
    const-string p2, "Cannot have all of left, right and width defined"

    .line 87
    .line 88
    .line 89
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 90
    throw p1

    .line 91
    .line 92
    .line 93
    :cond_2
    :goto_0
    invoke-static {v1, p5}, Lcom/swmansion/gesturehandler/core/GestureHandler$Companion;->access$hitSlopSet(Lcom/swmansion/gesturehandler/core/GestureHandler$Companion;F)Z

    .line 94
    move-result p5

    .line 95
    .line 96
    if-eqz p5, :cond_4

    .line 97
    .line 98
    .line 99
    invoke-static {v1, p1}, Lcom/swmansion/gesturehandler/core/GestureHandler$Companion;->access$hitSlopSet(Lcom/swmansion/gesturehandler/core/GestureHandler$Companion;F)Z

    .line 100
    move-result p1

    .line 101
    .line 102
    if-nez p1, :cond_4

    .line 103
    .line 104
    .line 105
    invoke-static {v1, p3}, Lcom/swmansion/gesturehandler/core/GestureHandler$Companion;->access$hitSlopSet(Lcom/swmansion/gesturehandler/core/GestureHandler$Companion;F)Z

    .line 106
    move-result p1

    .line 107
    .line 108
    if-eqz p1, :cond_3

    .line 109
    goto :goto_1

    .line 110
    .line 111
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 112
    .line 113
    const-string p2, "When width is set one of left or right pads need to be defined"

    .line 114
    .line 115
    .line 116
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 117
    throw p1

    .line 118
    .line 119
    .line 120
    :cond_4
    :goto_1
    invoke-static {v1, p6}, Lcom/swmansion/gesturehandler/core/GestureHandler$Companion;->access$hitSlopSet(Lcom/swmansion/gesturehandler/core/GestureHandler$Companion;F)Z

    .line 121
    move-result p1

    .line 122
    .line 123
    if-eqz p1, :cond_6

    .line 124
    .line 125
    .line 126
    invoke-static {v1, p4}, Lcom/swmansion/gesturehandler/core/GestureHandler$Companion;->access$hitSlopSet(Lcom/swmansion/gesturehandler/core/GestureHandler$Companion;F)Z

    .line 127
    move-result p1

    .line 128
    .line 129
    if-eqz p1, :cond_6

    .line 130
    .line 131
    .line 132
    invoke-static {v1, p2}, Lcom/swmansion/gesturehandler/core/GestureHandler$Companion;->access$hitSlopSet(Lcom/swmansion/gesturehandler/core/GestureHandler$Companion;F)Z

    .line 133
    move-result p1

    .line 134
    .line 135
    if-nez p1, :cond_5

    .line 136
    goto :goto_2

    .line 137
    .line 138
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 139
    .line 140
    const-string p2, "Cannot have all of top, bottom and height defined"

    .line 141
    .line 142
    .line 143
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 144
    throw p1

    .line 145
    .line 146
    .line 147
    :cond_6
    :goto_2
    invoke-static {v1, p6}, Lcom/swmansion/gesturehandler/core/GestureHandler$Companion;->access$hitSlopSet(Lcom/swmansion/gesturehandler/core/GestureHandler$Companion;F)Z

    .line 148
    move-result p1

    .line 149
    .line 150
    if-eqz p1, :cond_8

    .line 151
    .line 152
    .line 153
    invoke-static {v1, p4}, Lcom/swmansion/gesturehandler/core/GestureHandler$Companion;->access$hitSlopSet(Lcom/swmansion/gesturehandler/core/GestureHandler$Companion;F)Z

    .line 154
    move-result p1

    .line 155
    .line 156
    if-nez p1, :cond_8

    .line 157
    .line 158
    .line 159
    invoke-static {v1, p2}, Lcom/swmansion/gesturehandler/core/GestureHandler$Companion;->access$hitSlopSet(Lcom/swmansion/gesturehandler/core/GestureHandler$Companion;F)Z

    .line 160
    move-result p1

    .line 161
    .line 162
    if-eqz p1, :cond_7

    .line 163
    goto :goto_3

    .line 164
    .line 165
    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 166
    .line 167
    const-string p2, "When height is set one of top or bottom pads need to be defined"

    .line 168
    .line 169
    .line 170
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 171
    throw p1

    .line 172
    :cond_8
    :goto_3
    return-object v0
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
.end method

.method public final y(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)V
    .locals 10

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/swmansion/gesturehandler/core/GestureHandler;->A()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-object v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->l:Lcom/facebook/react/bridge/WritableArray;

    .line 7
    const/4 v1, 0x3

    .line 8
    .line 9
    iput v1, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->n:I

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 13
    move-result v1

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 17
    move-result v3

    .line 18
    .line 19
    .line 20
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    .line 21
    move-result v1

    .line 22
    .line 23
    .line 24
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    .line 25
    move-result v2

    .line 26
    sub-float/2addr v1, v2

    .line 27
    .line 28
    .line 29
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    .line 30
    move-result v2

    .line 31
    .line 32
    .line 33
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 34
    move-result v4

    .line 35
    sub-float/2addr v2, v4

    .line 36
    .line 37
    iget-object v8, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->p:[Lcom/swmansion/gesturehandler/core/GestureHandler$a;

    .line 38
    move v4, v2

    .line 39
    .line 40
    new-instance v2, Lcom/swmansion/gesturehandler/core/GestureHandler$a;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 44
    move-result v5

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, v5}, Landroid/view/MotionEvent;->getX(I)F

    .line 48
    move-result v5

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 52
    move-result v6

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, v6}, Landroid/view/MotionEvent;->getY(I)F

    .line 56
    move-result v6

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 60
    move-result v7

    .line 61
    .line 62
    .line 63
    invoke-virtual {p2, v7}, Landroid/view/MotionEvent;->getX(I)F

    .line 64
    move-result v7

    .line 65
    add-float/2addr v7, v1

    .line 66
    .line 67
    iget-object v1, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->c:[I

    .line 68
    const/4 v9, 0x0

    .line 69
    .line 70
    aget v1, v1, v9

    .line 71
    int-to-float v1, v1

    .line 72
    sub-float/2addr v7, v1

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 76
    move-result p1

    .line 77
    .line 78
    .line 79
    invoke-virtual {p2, p1}, Landroid/view/MotionEvent;->getY(I)F

    .line 80
    move-result p1

    .line 81
    add-float/2addr p1, v4

    .line 82
    .line 83
    iget-object p2, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->c:[I

    .line 84
    const/4 v1, 0x1

    .line 85
    .line 86
    aget p2, p2, v1

    .line 87
    int-to-float p2, p2

    .line 88
    sub-float/2addr p1, p2

    .line 89
    move v4, v5

    .line 90
    move v5, v6

    .line 91
    move v6, v7

    .line 92
    move v7, p1

    .line 93
    .line 94
    .line 95
    invoke-direct/range {v2 .. v7}, Lcom/swmansion/gesturehandler/core/GestureHandler$a;-><init>(IFFFF)V

    .line 96
    .line 97
    aput-object v2, v8, v3

    .line 98
    .line 99
    iget-object p1, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->p:[Lcom/swmansion/gesturehandler/core/GestureHandler$a;

    .line 100
    .line 101
    aget-object p1, p1, v3

    .line 102
    .line 103
    .line 104
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0, p1}, Lcom/swmansion/gesturehandler/core/GestureHandler;->l(Lcom/swmansion/gesturehandler/core/GestureHandler$a;)V

    .line 108
    .line 109
    iget-object p1, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->p:[Lcom/swmansion/gesturehandler/core/GestureHandler$a;

    .line 110
    .line 111
    aput-object v0, p1, v3

    .line 112
    .line 113
    iget p1, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->o:I

    .line 114
    .line 115
    add-int/lit8 p1, p1, -0x1

    .line 116
    .line 117
    iput p1, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->o:I

    .line 118
    .line 119
    .line 120
    invoke-virtual {p0}, Lcom/swmansion/gesturehandler/core/GestureHandler;->w()V

    .line 121
    return-void
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
.end method

.method public final y0(Lrb0/c;)Lcom/swmansion/gesturehandler/core/GestureHandler;
    .locals 1
    .param p1    # Lrb0/c;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrb0/c;",
            ")TConcreteGestureHandlerT;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/swmansion/gesturehandler/core/GestureHandler;->f(Lcom/swmansion/gesturehandler/core/GestureHandler;)Lcom/swmansion/gesturehandler/core/GestureHandler;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iput-object p1, v0, Lcom/swmansion/gesturehandler/core/GestureHandler;->C:Lrb0/c;

    .line 7
    return-object v0
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
.end method

.method public final z()V
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lcom/swmansion/gesturehandler/core/GestureHandler;->f:I

    .line 3
    const/4 v1, 0x2

    .line 4
    .line 5
    if-eq v0, v1, :cond_1

    .line 6
    const/4 v1, 0x4

    .line 7
    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    return-void

    .line 11
    :cond_1
    :goto_0
    const/4 v0, 0x5

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lcom/swmansion/gesturehandler/core/GestureHandler;->e0(I)V

    .line 15
    return-void
    .line 16
    .line 17
.end method

.method public final z0(Z)Lcom/swmansion/gesturehandler/core/GestureHandler;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)TConcreteGestureHandlerT;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/swmansion/gesturehandler/core/GestureHandler;->f(Lcom/swmansion/gesturehandler/core/GestureHandler;)Lcom/swmansion/gesturehandler/core/GestureHandler;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iput-boolean p1, v0, Lcom/swmansion/gesturehandler/core/GestureHandler;->v:Z

    .line 7
    return-object v0
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
.end method
