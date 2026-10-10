package com.kubi.home.v2.biz.grid.utils;

import android.widget.ImageView;
import com.kubi.home.R$mipmap;
import com.kubi.sdk.util.C24275u;
import p419l2.C42032f;
import p778xy.C46338a;
import p778xy.C46340c;
import p778xy.C46341d;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.home.v2.biz.grid.utils.l */
/* JADX INFO: compiled from: GridNavigationEx.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 176)
@SourceDebugExtension({"SMAP\nGridNavigationEx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GridNavigationEx.kt\ncom/kubi/home/v2/biz/grid/utils/GridNavigationExKt$loadIconCompat$1\n*L\n1#1,149:1\n*E\n"})
public final class C14965l implements Function0<Unit> {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ImageView f26457b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f26458c;

    public C14965l(ImageView imageView, String str) {
        this.f26457b = imageView;
        this.f26458c = str;
    }

    /* JADX INFO: renamed from: a */
    public final void m30675a() {
        C46341d c46341dM102151a = C46338a.m102151a(this.f26457b.getContext());
        Intrinsics.checkNotNullExpressionValue(c46341dM102151a, "with(...)");
        C46340c<Object> c46340cM58535a = C24275u.m58535a(c46341dM102151a, this.f26458c);
        C42032f c42032f = new C42032f();
        int i11 = R$mipmap.kucoin_icon_default_icon;
        c46340cM58535a.mo6606a(c42032f.mo92188b0(i11).mo92208m(i11)).m6594E0(this.f26457b);
    }

    @Override // p852kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        m30675a();
        return Unit.INSTANCE;
    }
}
