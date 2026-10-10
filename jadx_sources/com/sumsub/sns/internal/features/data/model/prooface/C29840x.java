package com.sumsub.sns.internal.features.data.model.prooface;

import java.util.Map;
import kotlinx.serialization.internal.C41790a1;
import kotlinx.serialization.internal.C41897w2;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.jvm.functions.Function0;
import tg0.InterfaceC44951d;
import tg0.InterfaceC44962o;
import ug0.C45236a;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.prooface.x */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29840x {

    @NotNull
    public static final C29839w Companion = new C29839w();

    /* JADX INFO: renamed from: n */
    public static final Lazy[] f59918n = {null, null, null, null, null, null, null, null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.prooface.c0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C29840x.m69930a();
        }
    })};

    /* JADX INFO: renamed from: a */
    public final String f59919a;

    /* JADX INFO: renamed from: b */
    public final String f59920b;

    /* JADX INFO: renamed from: c */
    public final String f59921c;

    /* JADX INFO: renamed from: d */
    public final Integer f59922d;

    /* JADX INFO: renamed from: e */
    public final Integer f59923e;

    /* JADX INFO: renamed from: f */
    public final String f59924f;

    /* JADX INFO: renamed from: g */
    public final Double f59925g;

    /* JADX INFO: renamed from: h */
    public final String f59926h;

    /* JADX INFO: renamed from: i */
    public final Integer f59927i;

    /* JADX INFO: renamed from: j */
    public final Integer f59928j;

    /* JADX INFO: renamed from: k */
    public final C29828l f59929k;

    /* JADX INFO: renamed from: l */
    public final C29818c f59930l;

    /* JADX INFO: renamed from: m */
    public final Map f59931m;

    public /* synthetic */ C29840x(int i11, String str, String str2, String str3, Integer num, Integer num2, String str4, Double d11, String str5, Integer num3, Integer num4, C29828l c29828l, C29818c c29818c, Map map) {
        if ((i11 & 1) == 0) {
            this.f59919a = null;
        } else {
            this.f59919a = str;
        }
        if ((i11 & 2) == 0) {
            this.f59920b = null;
        } else {
            this.f59920b = str2;
        }
        if ((i11 & 4) == 0) {
            this.f59921c = null;
        } else {
            this.f59921c = str3;
        }
        if ((i11 & 8) == 0) {
            this.f59922d = null;
        } else {
            this.f59922d = num;
        }
        if ((i11 & 16) == 0) {
            this.f59923e = null;
        } else {
            this.f59923e = num2;
        }
        if ((i11 & 32) == 0) {
            this.f59924f = null;
        } else {
            this.f59924f = str4;
        }
        if ((i11 & 64) == 0) {
            this.f59925g = null;
        } else {
            this.f59925g = d11;
        }
        if ((i11 & 128) == 0) {
            this.f59926h = null;
        } else {
            this.f59926h = str5;
        }
        if ((i11 & 256) == 0) {
            this.f59927i = null;
        } else {
            this.f59927i = num3;
        }
        if ((i11 & 512) == 0) {
            this.f59928j = null;
        } else {
            this.f59928j = num4;
        }
        if ((i11 & 1024) == 0) {
            this.f59929k = null;
        } else {
            this.f59929k = c29828l;
        }
        if ((i11 & 2048) == 0) {
            this.f59930l = null;
        } else {
            this.f59930l = c29818c;
        }
        if ((i11 & 4096) == 0) {
            this.f59931m = null;
        } else {
            this.f59931m = map;
        }
    }

    public C29840x(String str, String str2, String str3, Integer num, Integer num2, String str4, String str5, Integer num3, Integer num4, C29828l c29828l, C29818c c29818c, Map map) {
        this.f59919a = str;
        this.f59920b = str2;
        this.f59921c = str3;
        this.f59922d = num;
        this.f59923e = num2;
        this.f59924f = str4;
        this.f59925g = null;
        this.f59926h = str5;
        this.f59927i = num3;
        this.f59928j = num4;
        this.f59929k = c29828l;
        this.f59930l = c29818c;
        this.f59931m = map;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ InterfaceC44951d m69930a() {
        C41897w2 c41897w2 = C41897w2.f92051a;
        return new C41790a1(c41897w2, C45236a.m99969u(c41897w2));
    }
}
