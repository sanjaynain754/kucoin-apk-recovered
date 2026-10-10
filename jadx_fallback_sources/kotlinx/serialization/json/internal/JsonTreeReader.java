package kotlinx.serialization.json.internal;

/* JADX INFO: compiled from: JsonTreeReader.kt */
/* JADX INFO: loaded from: classes61.dex */
@kotlin.Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ \u0010\u000e\u001a\u00020\b*\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\fH\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\nJ\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, m90084d2 = {"Lkotlinx/serialization/json/internal/JsonTreeReader;", "", "Lxg0/f;", "configuration", "Lkotlinx/serialization/json/internal/a;", "lexer", "<init>", "(Lxg0/f;Lkotlinx/serialization/json/internal/a;)V", "Lkotlinx/serialization/json/JsonElement;", "e", "()Lkotlinx/serialization/json/JsonElement;", "i", "Lkotlin/DeepRecursiveScope;", "", "h", "(Lkotlin/DeepRecursiveScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "f", "", "isString", "Lkotlinx/serialization/json/JsonPrimitive;", "j", "(Z)Lkotlinx/serialization/json/JsonPrimitive;", "g", "a", "Lkotlinx/serialization/json/internal/a;", "b", "Z", "isLenient", "c", "trailingCommaAllowed", "", "d", "I", "stackDepth", "kotlinx-serialization-json"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nJsonTreeReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonTreeReader.kt\nkotlinx/serialization/json/internal/JsonTreeReader\n+ 2 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer\n*L\n1#1,121:1\n27#1,25:122\n27#1,25:147\n513#2,3:172\n*S KotlinDebug\n*F\n+ 1 JsonTreeReader.kt\nkotlinx/serialization/json/internal/JsonTreeReader\n*L\n19#1:122,25\n24#1:147,25\n64#1:172,3\n*E\n"})
public final class JsonTreeReader {

    /* JADX INFO: renamed from: a */
    @org.jetbrains.annotations.NotNull
    public final kotlinx.serialization.json.internal.AbstractC41911a f92078a;

    /* JADX INFO: renamed from: b */
    public final boolean f92079b;

    /* JADX INFO: renamed from: c */
    public final boolean f92080c;

    /* JADX INFO: renamed from: d */
    public int f92081d;

    public JsonTreeReader(@org.jetbrains.annotations.NotNull xg0.C46171f r2, @org.jetbrains.annotations.NotNull kotlinx.serialization.json.internal.AbstractC41911a r3) {
            r1 = this;
            java.lang.String r0 = "configuration"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "lexer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>()
            r1.f92078a = r3
            boolean r3 = r2.m101802q()
            r1.f92079b = r3
            boolean r2 = r2.m101789d()
            r1.f92080c = r2
            return
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ kotlinx.serialization.json.internal.AbstractC41911a m91799a(kotlinx.serialization.json.internal.JsonTreeReader r0) {
            kotlinx.serialization.json.internal.a r0 = r0.f92078a
            return r0
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ kotlinx.serialization.json.JsonElement m91800b(kotlinx.serialization.json.internal.JsonTreeReader r0) {
            kotlinx.serialization.json.JsonElement r0 = r0.m91804f()
            return r0
    }

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ java.lang.Object m91801c(kotlinx.serialization.json.internal.JsonTreeReader r0, kotlin.DeepRecursiveScope r1, kotlin.coroutines.Continuation r2) {
            java.lang.Object r0 = r0.m91806h(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ kotlinx.serialization.json.JsonPrimitive m91802d(kotlinx.serialization.json.internal.JsonTreeReader r0, boolean r1) {
            kotlinx.serialization.json.JsonPrimitive r0 = r0.m91808j(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: e */
    public final kotlinx.serialization.json.JsonElement m91803e() {
            r7 = this;
            kotlinx.serialization.json.internal.a r0 = r7.f92078a
            byte r0 = r0.mo91819F()
            r1 = 1
            if (r0 != r1) goto Le
            kotlinx.serialization.json.JsonPrimitive r0 = r7.m91808j(r1)
            return r0
        Le:
            if (r0 != 0) goto L16
            r0 = 0
            kotlinx.serialization.json.JsonPrimitive r0 = r7.m91808j(r0)
            return r0
        L16:
            r2 = 6
            if (r0 != r2) goto L32
            int r0 = r7.f92081d
            int r0 = r0 + r1
            r7.f92081d = r0
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 != r1) goto L27
            kotlinx.serialization.json.JsonElement r0 = r7.m91805g()
            goto L2b
        L27:
            kotlinx.serialization.json.JsonElement r0 = r7.m91807i()
        L2b:
            int r1 = r7.f92081d
            int r1 = r1 + (-1)
            r7.f92081d = r1
            return r0
        L32:
            r1 = 8
            if (r0 != r1) goto L3b
            kotlinx.serialization.json.JsonElement r0 = r7.m91804f()
            return r0
        L3b:
            kotlinx.serialization.json.internal.a r1 = r7.f92078a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Cannot read Json element because of unexpected "
            r2.append(r3)
            java.lang.String r0 = kotlinx.serialization.json.internal.C41914b.m91860c(r0)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            kotlinx.serialization.json.internal.AbstractC41911a.m91812x(r1, r2, r3, r4, r5, r6)
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    /* JADX INFO: renamed from: f */
    public final kotlinx.serialization.json.JsonElement m91804f() {
            r11 = this;
            kotlinx.serialization.json.internal.a r0 = r11.f92078a
            byte r0 = r0.mo91839j()
            kotlinx.serialization.json.internal.a r1 = r11.f92078a
            byte r1 = r1.mo91819F()
            r2 = 4
            if (r1 == r2) goto L70
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L14:
            kotlinx.serialization.json.internal.a r3 = r11.f92078a
            boolean r3 = r3.mo91834e()
            r4 = 9
            if (r3 == 0) goto L47
            kotlinx.serialization.json.JsonElement r0 = r11.m91803e()
            r1.add(r0)
            kotlinx.serialization.json.internal.a r0 = r11.f92078a
            byte r0 = r0.mo91839j()
            if (r0 == r2) goto L14
            kotlinx.serialization.json.internal.a r5 = r11.f92078a
            if (r0 != r4) goto L33
            r3 = 1
            goto L34
        L33:
            r3 = 0
        L34:
            int r7 = r5.f92084a
            if (r3 == 0) goto L39
            goto L14
        L39:
            r9 = 4
            r10 = 0
            java.lang.String r6 = "Expected end of the array or comma"
            r8 = 0
            kotlinx.serialization.json.internal.AbstractC41911a.m91812x(r5, r6, r7, r8, r9, r10)
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        L47:
            r3 = 8
            if (r0 != r3) goto L51
            kotlinx.serialization.json.internal.a r0 = r11.f92078a
            r0.m91840k(r4)
            goto L6a
        L51:
            if (r0 != r2) goto L6a
            boolean r0 = r11.f92080c
            if (r0 == 0) goto L5d
            kotlinx.serialization.json.internal.a r0 = r11.f92078a
            r0.m91840k(r4)
            goto L6a
        L5d:
            kotlinx.serialization.json.internal.a r0 = r11.f92078a
            java.lang.String r1 = "array"
            kotlinx.serialization.json.internal.C41915b0.m91868h(r0, r1)
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        L6a:
            kotlinx.serialization.json.JsonArray r0 = new kotlinx.serialization.json.JsonArray
            r0.<init>(r1)
            return r0
        L70:
            kotlinx.serialization.json.internal.a r2 = r11.f92078a
            r6 = 6
            r7 = 0
            java.lang.String r3 = "Unexpected leading comma"
            r4 = 0
            r5 = 0
            kotlinx.serialization.json.internal.AbstractC41911a.m91812x(r2, r3, r4, r5, r6, r7)
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    /* JADX INFO: renamed from: g */
    public final kotlinx.serialization.json.JsonElement m91805g() {
            r3 = this;
            kotlin.DeepRecursiveFunction r0 = new kotlin.DeepRecursiveFunction
            kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1 r1 = new kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1
            r2 = 0
            r1.<init>(r3, r2)
            r0.<init>(r1)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            java.lang.Object r0 = kotlin.DeepRecursiveKt.invoke(r0, r1)
            kotlinx.serialization.json.JsonElement r0 = (kotlinx.serialization.json.JsonElement) r0
            return r0
    }

    /* JADX INFO: renamed from: h */
    public final java.lang.Object m91806h(kotlin.DeepRecursiveScope<kotlin.Unit, kotlinx.serialization.json.JsonElement> r20, kotlin.coroutines.Continuation<? super kotlinx.serialization.json.JsonElement> r21) {
            r19 = this;
            r0 = r19
            r1 = r21
            boolean r2 = r1 instanceof kotlinx.serialization.json.internal.JsonTreeReader$readObject$2
            if (r2 == 0) goto L17
            r2 = r1
            kotlinx.serialization.json.internal.JsonTreeReader$readObject$2 r2 = (kotlinx.serialization.json.internal.JsonTreeReader$readObject$2) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            kotlinx.serialization.json.internal.JsonTreeReader$readObject$2 r2 = new kotlinx.serialization.json.internal.JsonTreeReader$readObject$2
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.label
            r5 = 6
            r6 = 7
            r7 = 4
            r8 = 1
            if (r4 == 0) goto L48
            if (r4 != r8) goto L40
            java.lang.Object r4 = r2.L$3
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r9 = r2.L$2
            java.util.LinkedHashMap r9 = (java.util.LinkedHashMap) r9
            java.lang.Object r10 = r2.L$1
            kotlinx.serialization.json.internal.JsonTreeReader r10 = (kotlinx.serialization.json.internal.JsonTreeReader) r10
            java.lang.Object r11 = r2.L$0
            kotlin.DeepRecursiveScope r11 = (kotlin.DeepRecursiveScope) r11
            kotlin.ResultKt.throwOnFailure(r1)
            goto La0
        L40:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L48:
            kotlin.ResultKt.throwOnFailure(r1)
            kotlinx.serialization.json.internal.a r1 = r0.f92078a
            byte r1 = r1.m91840k(r5)
            kotlinx.serialization.json.internal.a r4 = r0.f92078a
            byte r4 = r4.mo91819F()
            if (r4 == r7) goto Lee
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            r10 = r0
            r9 = r4
            r4 = r2
            r2 = r1
            r1 = r20
        L64:
            kotlinx.serialization.json.internal.a r11 = r10.f92078a
            boolean r11 = r11.mo91834e()
            if (r11 == 0) goto Lc8
            boolean r2 = r10.f92079b
            if (r2 == 0) goto L77
            kotlinx.serialization.json.internal.a r2 = r10.f92078a
            java.lang.String r2 = r2.m91845q()
            goto L7d
        L77:
            kotlinx.serialization.json.internal.a r2 = r10.f92078a
            java.lang.String r2 = r2.m91843o()
        L7d:
            kotlinx.serialization.json.internal.a r11 = r10.f92078a
            r12 = 5
            r11.m91840k(r12)
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            r4.L$0 = r1
            r4.L$1 = r10
            r4.L$2 = r9
            r4.L$3 = r2
            r4.label = r8
            java.lang.Object r11 = r1.callRecursive(r11, r4)
            if (r11 != r3) goto L96
            return r3
        L96:
            r18 = r11
            r11 = r1
            r1 = r18
            r18 = r4
            r4 = r2
            r2 = r18
        La0:
            kotlinx.serialization.json.JsonElement r1 = (kotlinx.serialization.json.JsonElement) r1
            r9.put(r4, r1)
            kotlinx.serialization.json.internal.a r1 = r10.f92078a
            byte r1 = r1.mo91839j()
            if (r1 == r7) goto Lc4
            if (r1 != r6) goto Lb1
            r2 = r1
            goto Lc8
        Lb1:
            kotlinx.serialization.json.internal.a r12 = r10.f92078a
            r16 = 6
            r17 = 0
            java.lang.String r13 = "Expected end of the object or comma"
            r14 = 0
            r15 = 0
            kotlinx.serialization.json.internal.AbstractC41911a.m91812x(r12, r13, r14, r15, r16, r17)
            kotlin.KotlinNothingValueException r1 = new kotlin.KotlinNothingValueException
            r1.<init>()
            throw r1
        Lc4:
            r4 = r2
            r2 = r1
            r1 = r11
            goto L64
        Lc8:
            if (r2 != r5) goto Ld0
            kotlinx.serialization.json.internal.a r1 = r10.f92078a
            r1.m91840k(r6)
            goto Le8
        Ld0:
            if (r2 != r7) goto Le8
            boolean r1 = r10.f92080c
            if (r1 == 0) goto Ldc
            kotlinx.serialization.json.internal.a r1 = r10.f92078a
            r1.m91840k(r6)
            goto Le8
        Ldc:
            kotlinx.serialization.json.internal.a r1 = r10.f92078a
            r2 = 0
            kotlinx.serialization.json.internal.C41915b0.m91869i(r1, r2, r8, r2)
            kotlin.KotlinNothingValueException r1 = new kotlin.KotlinNothingValueException
            r1.<init>()
            throw r1
        Le8:
            kotlinx.serialization.json.JsonObject r1 = new kotlinx.serialization.json.JsonObject
            r1.<init>(r9)
            return r1
        Lee:
            kotlinx.serialization.json.internal.a r2 = r0.f92078a
            r6 = 6
            r7 = 0
            java.lang.String r3 = "Unexpected leading comma"
            r4 = 0
            r5 = 0
            kotlinx.serialization.json.internal.AbstractC41911a.m91812x(r2, r3, r4, r5, r6, r7)
            kotlin.KotlinNothingValueException r1 = new kotlin.KotlinNothingValueException
            r1.<init>()
            throw r1
    }

    /* JADX INFO: renamed from: i */
    public final kotlinx.serialization.json.JsonElement m91807i() {
            r12 = this;
            kotlinx.serialization.json.internal.a r0 = r12.f92078a
            r1 = 6
            byte r0 = r0.m91840k(r1)
            kotlinx.serialization.json.internal.a r2 = r12.f92078a
            byte r2 = r2.mo91819F()
            r3 = 4
            if (r2 == r3) goto L7f
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
        L15:
            kotlinx.serialization.json.internal.a r4 = r12.f92078a
            boolean r4 = r4.mo91834e()
            r5 = 7
            if (r4 == 0) goto L58
            boolean r0 = r12.f92079b
            if (r0 == 0) goto L29
            kotlinx.serialization.json.internal.a r0 = r12.f92078a
            java.lang.String r0 = r0.m91845q()
            goto L2f
        L29:
            kotlinx.serialization.json.internal.a r0 = r12.f92078a
            java.lang.String r0 = r0.m91843o()
        L2f:
            kotlinx.serialization.json.internal.a r4 = r12.f92078a
            r6 = 5
            r4.m91840k(r6)
            kotlinx.serialization.json.JsonElement r4 = r12.m91803e()
            r2.put(r0, r4)
            kotlinx.serialization.json.internal.a r0 = r12.f92078a
            byte r0 = r0.mo91839j()
            if (r0 == r3) goto L15
            if (r0 != r5) goto L47
            goto L58
        L47:
            kotlinx.serialization.json.internal.a r6 = r12.f92078a
            r10 = 6
            r11 = 0
            java.lang.String r7 = "Expected end of the object or comma"
            r8 = 0
            r9 = 0
            kotlinx.serialization.json.internal.AbstractC41911a.m91812x(r6, r7, r8, r9, r10, r11)
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        L58:
            if (r0 != r1) goto L60
            kotlinx.serialization.json.internal.a r0 = r12.f92078a
            r0.m91840k(r5)
            goto L79
        L60:
            if (r0 != r3) goto L79
            boolean r0 = r12.f92080c
            if (r0 == 0) goto L6c
            kotlinx.serialization.json.internal.a r0 = r12.f92078a
            r0.m91840k(r5)
            goto L79
        L6c:
            kotlinx.serialization.json.internal.a r0 = r12.f92078a
            r1 = 1
            r2 = 0
            kotlinx.serialization.json.internal.C41915b0.m91869i(r0, r2, r1, r2)
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        L79:
            kotlinx.serialization.json.JsonObject r0 = new kotlinx.serialization.json.JsonObject
            r0.<init>(r2)
            return r0
        L7f:
            kotlinx.serialization.json.internal.a r3 = r12.f92078a
            r7 = 6
            r8 = 0
            java.lang.String r4 = "Unexpected leading comma"
            r5 = 0
            r6 = 0
            kotlinx.serialization.json.internal.AbstractC41911a.m91812x(r3, r4, r5, r6, r7, r8)
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    /* JADX INFO: renamed from: j */
    public final kotlinx.serialization.json.JsonPrimitive m91808j(boolean r8) {
            r7 = this;
            boolean r0 = r7.f92079b
            if (r0 != 0) goto Lf
            if (r8 != 0) goto L7
            goto Lf
        L7:
            kotlinx.serialization.json.internal.a r0 = r7.f92078a
            java.lang.String r0 = r0.m91843o()
        Ld:
            r2 = r0
            goto L16
        Lf:
            kotlinx.serialization.json.internal.a r0 = r7.f92078a
            java.lang.String r0 = r0.m91845q()
            goto Ld
        L16:
            if (r8 != 0) goto L23
            java.lang.String r0 = "null"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            if (r0 == 0) goto L23
            kotlinx.serialization.json.a r8 = kotlinx.serialization.json.C41910a.INSTANCE
            return r8
        L23:
            xg0.u r1 = new xg0.u
            r5 = 4
            r6 = 0
            r4 = 0
            r3 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
    }
}
