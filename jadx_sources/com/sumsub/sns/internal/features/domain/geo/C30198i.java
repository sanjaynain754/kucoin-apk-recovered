package com.sumsub.sns.internal.features.domain.geo;

import android.util.Base64;
import com.sumsub.sns.internal.core.common.AbstractC28464j;
import com.sumsub.sns.internal.features.data.model.geo.C29791a;
import com.sumsub.sns.internal.features.data.model.geo.C29795e;
import java.nio.charset.Charset;
import java.util.Map;
import kotlinx.serialization.internal.C41790a1;
import kotlinx.serialization.internal.C41897w2;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.text.Charsets;
import p852kotlin.text.StringsKt;
import ug0.C45236a;
import xg0.AbstractC46162a;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.geo.i */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30198i {

    /* JADX INFO: renamed from: a */
    public final AbstractC46162a f60690a;

    /* JADX INFO: renamed from: a */
    public final C29791a m70134a(String str, C29795e c29795e) {
        C30197h c30197h = new C30197h(c29795e.f59867a, c29795e.f59868b, c29795e.f59869c);
        AbstractC46162a abstractC46162a = this.f60690a;
        abstractC46162a.getSerializersModule();
        String strMo99409b = abstractC46162a.mo99409b(C30197h.Companion.serializer(), c30197h);
        String strTakeLast = StringsKt.takeLast(str, 16);
        Charset charset = Charsets.UTF_8;
        Map mapMapOf = MapsKt.mapOf(TuplesKt.m90091to("data", Base64.encodeToString(AbstractC28464j.m69367a(strMo99409b.getBytes(charset), strTakeLast.getBytes(charset)), 2)));
        AbstractC46162a abstractC46162a2 = this.f60690a;
        abstractC46162a2.getSerializersModule();
        C41897w2 c41897w2 = C41897w2.f92051a;
        return new C29791a(abstractC46162a2.mo99409b(new C41790a1(c41897w2, C45236a.m99969u(c41897w2)), mapMapOf).getBytes(charset));
    }

    public C30198i(AbstractC46162a abstractC46162a) {
        this.f60690a = abstractC46162a;
    }
}
