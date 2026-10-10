package androidx.collection;

/* JADX INFO: Add missing generic type declarations: [E] */
/* JADX INFO: compiled from: ScatterSet.kt */
/* JADX INFO: loaded from: classes23.dex */
@kotlin.Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, m90084d2 = {"<anonymous>", "", "E", "Lkotlin/sequences/SequenceScope;"}, m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "androidx.collection.MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1", m90122f = "ScatterSet.kt", m90123i = {0, 0, 0, 0, 0, 0, 0}, m90124l = {1060}, m90125m = "invokeSuspend", m90126n = {"$this$iterator", "m$iv", "lastIndex$iv", "i$iv", "slot$iv", "bitCount$iv", "j$iv"}, m90127s = {"L$0", "L$3", "I$0", "I$1", "J$0", "I$2", "I$3"})
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1\n+ 2 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1100:1\n237#2,7:1101\n248#2,3:1109\n251#2,9:1113\n1826#3:1108\n1688#3:1112\n*S KotlinDebug\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1\n*L\n1057#1:1101,7\n1057#1:1109,3\n1057#1:1113,9\n1057#1:1108\n1057#1:1112\n*E\n"})
public final class MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1<E> extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super E>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    long J$0;
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    int label;
    final /* synthetic */ androidx.collection.MutableScatterSet<E> this$0;
    final /* synthetic */ androidx.collection.MutableScatterSet$MutableSetWrapper$iterator$1 this$1;

    public MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1(androidx.collection.MutableScatterSet r1, androidx.collection.MutableScatterSet$MutableSetWrapper$iterator$1 r2, kotlin.coroutines.Continuation r3) {
            r0 = this;
            r0.this$0 = r1
            r0.this$1 = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.NotNull
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r5) {
            r3 = this;
            androidx.collection.MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1 r0 = new androidx.collection.MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1
            androidx.collection.MutableScatterSet<E> r1 = r3.this$0
            androidx.collection.MutableScatterSet$MutableSetWrapper$iterator$1 r2 = r3.this$1
            r0.<init>(r1, r2, r5)
            r0.L$0 = r4
            return r0
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            kotlin.sequences.SequenceScope r1 = (kotlin.sequences.SequenceScope) r1
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r1 = r0.invoke(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlin.sequences.SequenceScope<? super E> r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
            androidx.collection.MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1 r1 = (androidx.collection.MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1) r1
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r22) {
            r21 = this;
            r0 = r21
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r4 = 8
            r5 = 1
            if (r2 == 0) goto L36
            if (r2 != r5) goto L2e
            int r2 = r0.I$3
            int r6 = r0.I$2
            long r7 = r0.J$0
            int r9 = r0.I$1
            int r10 = r0.I$0
            java.lang.Object r11 = r0.L$3
            long[] r11 = (long[]) r11
            java.lang.Object r12 = r0.L$2
            androidx.collection.MutableScatterSet r12 = (androidx.collection.MutableScatterSet) r12
            java.lang.Object r13 = r0.L$1
            androidx.collection.MutableScatterSet$MutableSetWrapper$iterator$1 r13 = (androidx.collection.MutableScatterSet$MutableSetWrapper$iterator$1) r13
            java.lang.Object r14 = r0.L$0
            kotlin.sequences.SequenceScope r14 = (kotlin.sequences.SequenceScope) r14
            kotlin.ResultKt.throwOnFailure(r22)
            goto L9d
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L36:
            kotlin.ResultKt.throwOnFailure(r22)
            java.lang.Object r2 = r0.L$0
            kotlin.sequences.SequenceScope r2 = (kotlin.sequences.SequenceScope) r2
            androidx.collection.MutableScatterSet<E> r6 = r0.this$0
            androidx.collection.MutableScatterSet$MutableSetWrapper$iterator$1 r7 = r0.this$1
            long[] r8 = r6.metadata
            int r9 = r8.length
            int r9 = r9 + (-2)
            if (r9 < 0) goto Lae
            r10 = 0
        L49:
            r11 = r8[r10]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto La9
            int r13 = r10 - r9
            int r13 = ~r13
            int r13 = r13 >>> 31
            int r13 = 8 - r13
            r14 = r10
            r10 = r9
            r9 = r14
            r14 = r2
            r2 = 0
            r19 = r11
            r12 = r6
            r11 = r8
            r6 = r13
            r13 = r7
            r7 = r19
        L6d:
            if (r2 >= r6) goto La0
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r7
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L9d
            int r15 = r9 << 3
            int r15 = r15 + r2
            r13.setCurrent(r15)
            java.lang.Object[] r3 = r12.elements
            r3 = r3[r15]
            r0.L$0 = r14
            r0.L$1 = r13
            r0.L$2 = r12
            r0.L$3 = r11
            r0.I$0 = r10
            r0.I$1 = r9
            r0.J$0 = r7
            r0.I$2 = r6
            r0.I$3 = r2
            r0.label = r5
            java.lang.Object r3 = r14.yield(r3, r0)
            if (r3 != r1) goto L9d
            return r1
        L9d:
            long r7 = r7 >> r4
            int r2 = r2 + r5
            goto L6d
        La0:
            if (r6 != r4) goto Lae
            r2 = r10
            r10 = r9
            r9 = r2
            r8 = r11
            r6 = r12
            r7 = r13
            r2 = r14
        La9:
            if (r10 == r9) goto Lae
            int r10 = r10 + 1
            goto L49
        Lae:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }
}
