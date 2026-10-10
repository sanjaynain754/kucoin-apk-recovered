package p733wp;

import com.tencent.bugly.proguard.C33820nf;
import gp.InterfaceC37979c;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: wp.g */
/* JADX INFO: compiled from: TradingSidebarFlavorImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¨\u0006\b"}, m90084d2 = {"Lcom/kubi/margin/variant/TradingSidebarFlavorImpl;", "Lcom/kubi/margin/flavor/ITradingSidebarFlavor;", "<init>", "()V", "euSidebarSort", "", "", "symbols", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C45915g implements InterfaceC37979c {
    /* JADX INFO: renamed from: d */
    public static final Comparable m101364d(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        int i11 = 2;
        String strSubstringAfterLast$default = StringsKt.substringAfterLast$default(it, C33820nf.f71144W, (String) null, 2, (Object) null);
        if (Intrinsics.areEqual(strSubstringAfterLast$default, "USDC")) {
            i11 = 0;
        } else if (Intrinsics.areEqual(strSubstringAfterLast$default, "USDT")) {
            i11 = 1;
        }
        return Integer.valueOf(i11);
    }

    /* JADX INFO: renamed from: e */
    public static final Comparable m101365e(List list, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Integer.valueOf(list.indexOf(it));
    }

    @Override // gp.InterfaceC37979c
    @NotNull
    /* JADX INFO: renamed from: a */
    public List<String> mo85834a(@NotNull final List<String> symbols) {
        Intrinsics.checkNotNullParameter(symbols, "symbols");
        return CollectionsKt.sortedWith(symbols, ComparisonsKt.compareBy(new Function1() { // from class: wp.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C45915g.m101364d((String) obj);
            }
        }, new Function1() { // from class: wp.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C45915g.m101365e(symbols, (String) obj);
            }
        }));
    }
}
