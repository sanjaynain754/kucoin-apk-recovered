package com.sumsub.sns.internal.features.data.model.esign;

import java.util.List;
import kotlinx.serialization.internal.C41813f;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.jvm.functions.Function0;
import tg0.InterfaceC44951d;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.esign.U */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29748U {

    @NotNull
    public static final C29747T Companion = new C29747T();

    /* JADX INFO: renamed from: f */
    public static final Lazy[] f59817f = {null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.esign.f0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C29748U.m69919a();
        }
    })};

    /* JADX INFO: renamed from: a */
    public final String f59818a;

    /* JADX INFO: renamed from: b */
    public final Integer f59819b;

    /* JADX INFO: renamed from: c */
    public final String f59820c;

    /* JADX INFO: renamed from: d */
    public final String f59821d;

    /* JADX INFO: renamed from: e */
    public final List f59822e;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ InterfaceC44951d m69919a() {
        return new C41813f(C29759d.f59834a);
    }

    public /* synthetic */ C29748U(int i11, String str, Integer num, String str2, String str3, List list) {
        if ((i11 & 1) == 0) {
            this.f59818a = null;
        } else {
            this.f59818a = str;
        }
        if ((i11 & 2) == 0) {
            this.f59819b = null;
        } else {
            this.f59819b = num;
        }
        if ((i11 & 4) == 0) {
            this.f59820c = null;
        } else {
            this.f59820c = str2;
        }
        if ((i11 & 8) == 0) {
            this.f59821d = null;
        } else {
            this.f59821d = str3;
        }
        if ((i11 & 16) == 0) {
            this.f59822e = null;
        } else {
            this.f59822e = list;
        }
    }
}
