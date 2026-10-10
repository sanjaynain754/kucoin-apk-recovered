package com.sumsub.sentry;

import com.tencent.bugly.proguard.C33820nf;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlinx.serialization.internal.C41790a1;
import kotlinx.serialization.internal.C41813f;
import kotlinx.serialization.internal.C41897w2;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import tg0.C44947b;
import tg0.InterfaceC44951d;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sentry.n0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@SourceDebugExtension({"SMAP\nSentryEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SentryEvent.kt\ncom/sumsub/sentry/SentryEvent\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,133:1\n1869#2,2:134\n*S KotlinDebug\n*F\n+ 1 SentryEvent.kt\ncom/sumsub/sentry/SentryEvent\n*L\n115#1:134,2\n*E\n"})
@InterfaceC44962o
public final class C27973n0 extends AbstractC27910a0 {

    @NotNull
    public static final C27969m0 Companion = new C27969m0();

    /* JADX INFO: renamed from: z */
    public static final Lazy[] f57095z;

    /* JADX INFO: renamed from: o */
    public final String f57096o;

    /* JADX INFO: renamed from: p */
    public final String f57097p;

    /* JADX INFO: renamed from: q */
    public final C27882M f57098q;

    /* JADX INFO: renamed from: r */
    public final String f57099r;

    /* JADX INFO: renamed from: s */
    public C27904X0 f57100s;

    /* JADX INFO: renamed from: t */
    public C27904X0 f57101t;

    /* JADX INFO: renamed from: u */
    public final SentryLevel f57102u;

    /* JADX INFO: renamed from: v */
    public final String f57103v;

    /* JADX INFO: renamed from: w */
    public final List f57104w;

    /* JADX INFO: renamed from: x */
    public final Map f57105x;

    /* JADX INFO: renamed from: y */
    public final C27996t f57106y;

    public C27973n0(int i11, C27968m c27968m, C27903X c27903x, Map map, String str, String str2, String str3, C27950h1 c27950h1, String str4, String str5, List list, Map map2, String str6, String str7, C27882M c27882m, String str8, C27904X0 c27904x0, C27904X0 c27904x1, SentryLevel sentryLevel, String str9, List list2, Map map3, C27996t c27996t) {
        super(i11, c27968m, c27903x, map, str, str2, str3, c27950h1, str4, str5, list, map2);
        if ((i11 & 2048) == 0) {
            C28005v0 c28005v0 = C28009w0.Companion;
            UUID uuidRandomUUID = UUID.randomUUID();
            c28005v0.getClass();
            this.f57096o = StringsKt.replace$default(uuidRandomUUID.toString(), C33820nf.f71144W, "", false, 4, (Object) null);
        } else {
            this.f57096o = str6;
        }
        if ((i11 & 4096) == 0) {
            this.f57097p = AbstractC27972n.f57093a.format(AbstractC27972n.f57094b);
        } else {
            this.f57097p = str7;
        }
        if ((i11 & 8192) == 0) {
            this.f57098q = null;
        } else {
            this.f57098q = c27882m;
        }
        if ((i11 & 16384) == 0) {
            this.f57099r = null;
        } else {
            this.f57099r = str8;
        }
        if ((32768 & i11) == 0) {
            this.f57100s = null;
        } else {
            this.f57100s = c27904x0;
        }
        if ((65536 & i11) == 0) {
            this.f57101t = null;
        } else {
            this.f57101t = c27904x1;
        }
        if ((131072 & i11) == 0) {
            this.f57102u = null;
        } else {
            this.f57102u = sentryLevel;
        }
        if ((262144 & i11) == 0) {
            this.f57103v = null;
        } else {
            this.f57103v = str9;
        }
        if ((524288 & i11) == 0) {
            this.f57104w = null;
        } else {
            this.f57104w = list2;
        }
        if ((1048576 & i11) == 0) {
            this.f57105x = null;
        } else {
            this.f57105x = map3;
        }
        this.f57106y = (i11 & 2097152) == 0 ? new C27996t() : c27996t;
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f57095z = new Lazy[]{null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sentry.l2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C27973n0.m69013a();
            }
        }), null, null, null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sentry.m2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C27973n0.m69014c();
            }
        }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sentry.n2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C27973n0.m69015e();
            }
        }), null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sentry.o2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C27904X0.Companion.serializer(C27892R0.f56970a);
            }
        }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sentry.p2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C27904X0.Companion.serializer(C27977o0.f57108a);
            }
        }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sentry.q2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SentryLevel.Companion.serializer();
            }
        }), null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sentry.r2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C27973n0.m69019i();
            }
        }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sentry.s2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C27973n0.m69020j();
            }
        }), null};
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ InterfaceC44951d m69013a() {
        C41897w2 c41897w2 = C41897w2.f92051a;
        return new C41790a1(c41897w2, c41897w2);
    }

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ InterfaceC44951d m69014c() {
        return new C41813f(C27932d.f57059a);
    }

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ InterfaceC44951d m69015e() {
        return new C41790a1(C41897w2.f92051a, new C44947b(Reflection.getOrCreateKotlinClass(Object.class), null, new InterfaceC44951d[0]));
    }

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ InterfaceC44951d m69019i() {
        return new C41813f(C41897w2.f92051a);
    }

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ InterfaceC44951d m69020j() {
        C41897w2 c41897w2 = C41897w2.f92051a;
        return new C41790a1(c41897w2, c41897w2);
    }

    public C27973n0() {
        C28005v0 c28005v0 = C28009w0.Companion;
        UUID uuidRandomUUID = UUID.randomUUID();
        c28005v0.getClass();
        String strReplace$default = StringsKt.replace$default(uuidRandomUUID.toString(), C33820nf.f71144W, "", false, 4, (Object) null);
        String str = AbstractC27972n.f57093a.format(AbstractC27972n.f57094b);
        C27996t c27996t = new C27996t();
        this.f57096o = strReplace$default;
        this.f57097p = str;
        this.f57098q = null;
        this.f57099r = null;
        this.f57100s = null;
        this.f57101t = null;
        this.f57102u = null;
        this.f57103v = null;
        this.f57104w = null;
        this.f57105x = null;
        this.f57106y = c27996t;
    }
}
