package com.kubi.margin.market.trade;

import androidx.lifecycle.Observer;
import com.kubi.utils.extensions.DowngradeExKt;
import com.tencent.bugly.proguard.C33556b3;
import java.math.BigDecimal;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42180b;
import p852kotlin.Function;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.margin.market.trade.f1 */
/* JADX INFO: compiled from: MarginOrderBookFragment.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u001a\u001a\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003*\u00020\u0004¨\u0006\u0005"}, m90084d2 = {"getPrecisionList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "", "MarginLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C18031f1 {

    /* JADX INFO: renamed from: com.kubi.margin.market.trade.f1$a */
    /* JADX INFO: compiled from: MarginOrderBookFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f33512b;

        public a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f33512b = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p852kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f33512b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f33512b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final ArrayList<String> m39398a(int i11) {
        ArrayList<String> arrayList = new ArrayList<>();
        int i12 = i11 > 4 ? 4 : i11;
        for (int i13 = 0; i13 < i12; i13++) {
            BigDecimal bigDecimalPow = new BigDecimal("0.1").pow(i11 - i13);
            Intrinsics.checkNotNullExpressionValue(bigDecimalPow, "pow(...)");
            arrayList.add(C42180b.m92640e(bigDecimalPow, null, 20, false, false, false, 0, null, 125, null));
        }
        if (arrayList.size() < 4) {
            arrayList.add("1");
        }
        if (arrayList.size() < 4) {
            arrayList.add("10");
        }
        if (arrayList.size() < 4) {
            arrayList.add(C33556b3.f68995S);
        }
        if (arrayList.size() < 4) {
            BigDecimal bigDecimalM66536f = DowngradeExKt.m66536f("1000");
            String strM92640e = bigDecimalM66536f != null ? C42180b.m92640e(bigDecimalM66536f, null, 20, false, false, false, 0, null, 125, null) : null;
            if (strM92640e == null) {
                strM92640e = "";
            }
            arrayList.add(strM92640e);
        }
        return arrayList;
    }
}
