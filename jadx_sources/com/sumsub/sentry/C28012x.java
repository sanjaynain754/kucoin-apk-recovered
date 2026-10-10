package com.sumsub.sentry;

import android.os.Build;
import java.util.Date;
import kotlinx.serialization.internal.C41866p2;
import kotlinx.serialization.internal.C41897w2;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import tg0.C44947b;
import tg0.InterfaceC44951d;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sentry.x */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@SourceDebugExtension({"SMAP\nDevice.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Device.kt\ncom/sumsub/sentry/Device\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,212:1\n1#2:213\n*E\n"})
@InterfaceC44962o
public final class C28012x {

    @NotNull
    public static final C28004v Companion = new C28004v();

    /* JADX INFO: renamed from: F */
    public static final Lazy[] f57138F;

    /* JADX INFO: renamed from: A */
    public String f57139A;

    /* JADX INFO: renamed from: B */
    public String f57140B;

    /* JADX INFO: renamed from: C */
    public String f57141C;

    /* JADX INFO: renamed from: D */
    public String f57142D;

    /* JADX INFO: renamed from: E */
    public Float f57143E;

    /* JADX INFO: renamed from: a */
    public final String f57144a;

    /* JADX INFO: renamed from: b */
    public final String f57145b;

    /* JADX INFO: renamed from: c */
    public final String f57146c;

    /* JADX INFO: renamed from: d */
    public final String f57147d;

    /* JADX INFO: renamed from: e */
    public final String f57148e;

    /* JADX INFO: renamed from: f */
    public final String f57149f;

    /* JADX INFO: renamed from: g */
    public String[] f57150g;

    /* JADX INFO: renamed from: h */
    public Float f57151h;

    /* JADX INFO: renamed from: i */
    public Boolean f57152i;

    /* JADX INFO: renamed from: j */
    public Boolean f57153j;

    /* JADX INFO: renamed from: k */
    public final Device$DeviceOrientation f57154k;

    /* JADX INFO: renamed from: l */
    public Boolean f57155l;

    /* JADX INFO: renamed from: m */
    public Long f57156m;

    /* JADX INFO: renamed from: n */
    public Long f57157n;

    /* JADX INFO: renamed from: o */
    public final Long f57158o;

    /* JADX INFO: renamed from: p */
    public Boolean f57159p;

    /* JADX INFO: renamed from: q */
    public Long f57160q;

    /* JADX INFO: renamed from: r */
    public Long f57161r;

    /* JADX INFO: renamed from: s */
    public Long f57162s;

    /* JADX INFO: renamed from: t */
    public Long f57163t;

    /* JADX INFO: renamed from: u */
    public Integer f57164u;

    /* JADX INFO: renamed from: v */
    public Integer f57165v;

    /* JADX INFO: renamed from: w */
    public Float f57166w;

    /* JADX INFO: renamed from: x */
    public Integer f57167x;

    /* JADX INFO: renamed from: y */
    public Date f57168y;

    /* JADX INFO: renamed from: z */
    public String f57169z;

    public /* synthetic */ C28012x(int i11, String str, String str2, String str3, String str4, String str5, String str6, String[] strArr, Float f11, Boolean bool, Boolean bool2, Device$DeviceOrientation device$DeviceOrientation, Boolean bool3, Long l11, Long l12, Long l13, Boolean bool4, Long l14, Long l15, Long l16, Long l17, Integer num, Integer num2, Float f12, Integer num3, Date date, String str7, String str8, String str9, String str10, String str11, Float f13) {
        if ((i11 & 1) == 0) {
            this.f57144a = null;
        } else {
            this.f57144a = str;
        }
        if ((i11 & 2) == 0) {
            this.f57145b = null;
        } else {
            this.f57145b = str2;
        }
        if ((i11 & 4) == 0) {
            this.f57146c = null;
        } else {
            this.f57146c = str3;
        }
        if ((i11 & 8) == 0) {
            this.f57147d = null;
        } else {
            this.f57147d = str4;
        }
        if ((i11 & 16) == 0) {
            this.f57148e = null;
        } else {
            this.f57148e = str5;
        }
        if ((i11 & 32) == 0) {
            this.f57149f = null;
        } else {
            this.f57149f = str6;
        }
        if ((i11 & 64) == 0) {
            this.f57150g = null;
        } else {
            this.f57150g = strArr;
        }
        if ((i11 & 128) == 0) {
            this.f57151h = null;
        } else {
            this.f57151h = f11;
        }
        if ((i11 & 256) == 0) {
            this.f57152i = null;
        } else {
            this.f57152i = bool;
        }
        if ((i11 & 512) == 0) {
            this.f57153j = null;
        } else {
            this.f57153j = bool2;
        }
        if ((i11 & 1024) == 0) {
            this.f57154k = null;
        } else {
            this.f57154k = device$DeviceOrientation;
        }
        if ((i11 & 2048) == 0) {
            this.f57155l = null;
        } else {
            this.f57155l = bool3;
        }
        if ((i11 & 4096) == 0) {
            this.f57156m = null;
        } else {
            this.f57156m = l11;
        }
        if ((i11 & 8192) == 0) {
            this.f57157n = null;
        } else {
            this.f57157n = l12;
        }
        if ((i11 & 16384) == 0) {
            this.f57158o = null;
        } else {
            this.f57158o = l13;
        }
        if ((32768 & i11) == 0) {
            this.f57159p = null;
        } else {
            this.f57159p = bool4;
        }
        if ((65536 & i11) == 0) {
            this.f57160q = null;
        } else {
            this.f57160q = l14;
        }
        if ((131072 & i11) == 0) {
            this.f57161r = null;
        } else {
            this.f57161r = l15;
        }
        if ((262144 & i11) == 0) {
            this.f57162s = null;
        } else {
            this.f57162s = l16;
        }
        if ((524288 & i11) == 0) {
            this.f57163t = null;
        } else {
            this.f57163t = l17;
        }
        if ((1048576 & i11) == 0) {
            this.f57164u = null;
        } else {
            this.f57164u = num;
        }
        if ((2097152 & i11) == 0) {
            this.f57165v = null;
        } else {
            this.f57165v = num2;
        }
        if ((4194304 & i11) == 0) {
            this.f57166w = null;
        } else {
            this.f57166w = f12;
        }
        if ((8388608 & i11) == 0) {
            this.f57167x = null;
        } else {
            this.f57167x = num3;
        }
        if ((16777216 & i11) == 0) {
            this.f57168y = null;
        } else {
            this.f57168y = date;
        }
        if ((33554432 & i11) == 0) {
            this.f57169z = null;
        } else {
            this.f57169z = str7;
        }
        if ((67108864 & i11) == 0) {
            this.f57139A = null;
        } else {
            this.f57139A = str8;
        }
        if ((134217728 & i11) == 0) {
            this.f57140B = null;
        } else {
            this.f57140B = str9;
        }
        if ((268435456 & i11) == 0) {
            this.f57141C = null;
        } else {
            this.f57141C = str10;
        }
        if ((536870912 & i11) == 0) {
            this.f57142D = null;
        } else {
            this.f57142D = str11;
        }
        if ((i11 & 1073741824) == 0) {
            this.f57143E = null;
        } else {
            this.f57143E = f13;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f57138F = new Lazy[]{null, null, null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sentry.u2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C28012x.m69024a();
            }
        }), null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sentry.v2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Device$DeviceOrientation.Companion.serializer();
            }
        }), null, null, null, null, null, null, null, null, null, null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sentry.w2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C28012x.m69026c();
            }
        }), null, null, null, null, null, null};
    }

    public C28012x(String str, String str2, String str3, Device$DeviceOrientation device$DeviceOrientation) {
        String str4 = Build.BRAND;
        String str5 = Build.MODEL;
        String str6 = Build.ID;
        this.f57144a = str;
        this.f57145b = str2;
        this.f57146c = str4;
        this.f57147d = str3;
        this.f57148e = str5;
        this.f57149f = str6;
        this.f57150g = null;
        this.f57151h = null;
        this.f57152i = null;
        this.f57153j = null;
        this.f57154k = device$DeviceOrientation;
        this.f57155l = null;
        this.f57156m = null;
        this.f57157n = null;
        this.f57158o = null;
        this.f57159p = null;
        this.f57160q = null;
        this.f57161r = null;
        this.f57162s = null;
        this.f57163t = null;
        this.f57164u = null;
        this.f57165v = null;
        this.f57166w = null;
        this.f57167x = null;
        this.f57168y = null;
        this.f57169z = null;
        this.f57139A = null;
        this.f57140B = null;
        this.f57141C = null;
        this.f57142D = null;
        this.f57143E = null;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ InterfaceC44951d m69024a() {
        return new C41866p2(Reflection.getOrCreateKotlinClass(String.class), C41897w2.f92051a);
    }

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ InterfaceC44951d m69026c() {
        return new C44947b(Reflection.getOrCreateKotlinClass(Date.class), null, new InterfaceC44951d[0]);
    }
}
