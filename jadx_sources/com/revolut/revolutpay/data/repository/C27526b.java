package com.revolut.revolutpay.data.repository;

import android.content.Context;
import android.util.LruCache;
import cb0.C4929a;
import com.revolut.revolutpay.R$array;
import com.revolut.revolutpay.domain.model.CountryCode;
import com.revolut.revolutpay.p123ui.picker.model.C27572a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;
import p852kotlin.text.StringsKt;
import wa0.C45780a;

/* JADX INFO: renamed from: com.revolut.revolutpay.data.repository.b */
/* JADX INFO: loaded from: classes59.dex */
public final class C27526b implements InterfaceC27525a {

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final a f55951d = new a(null);

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Set<String> f55952e;

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Context f55953a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final LruCache<Locale, List<C27572a>> f55954b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Lazy f55955c;

    /* JADX INFO: renamed from: com.revolut.revolutpay.data.repository.b$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.revolut.revolutpay.data.repository.b$b */
    public static final class b extends Lambda implements Function0<List<? extends Pair<? extends String, ? extends String>>> {
        public b() {
            super(0);
        }

        @Override // p852kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<Pair<String, String>> invoke() {
            String[] stringArray = C27526b.this.f55953a.getResources().getStringArray(R$array.DialingCountryCode);
            Intrinsics.checkNotNullExpressionValue(stringArray, "context.resources.getStr…array.DialingCountryCode)");
            ArrayList arrayList = new ArrayList();
            for (String row : stringArray) {
                Intrinsics.checkNotNullExpressionValue(row, "row");
                List listSplit$default = StringsKt.split$default((CharSequence) row, new String[]{","}, false, 0, 6, (Object) null);
                Pair pairM90091to = TuplesKt.m90091to(listSplit$default.get(0), listSplit$default.get(1));
                String str = (String) pairM90091to.component1();
                String str2 = (String) pairM90091to.component2();
                Pair pairM90091to2 = C27526b.f55952e.contains(str2) ? TuplesKt.m90091to(str, str2) : null;
                if (pairM90091to2 != null) {
                    arrayList.add(pairM90091to2);
                }
            }
            return arrayList;
        }
    }

    static {
        CountryCode.Companion companion = CountryCode.INSTANCE;
        f55952e = SetsKt.setOf((Object[]) new String[]{companion.getAT().getValue(), companion.getAU().getValue(), companion.getBE().getValue(), companion.getBG().getValue(), companion.getBR().getValue(), companion.getCA().getValue(), companion.getCH().getValue(), companion.getCY().getValue(), companion.getCZ().getValue(), companion.getDE().getValue(), companion.getDK().getValue(), companion.getEE().getValue(), companion.getES().getValue(), companion.getFI().getValue(), companion.getFR().getValue(), companion.getGB().getValue(), companion.getGR().getValue(), companion.getHK().getValue(), companion.getHR().getValue(), companion.getHU().getValue(), companion.getIE().getValue(), companion.getIN().getValue(), companion.getIS().getValue(), companion.getIT().getValue(), companion.getJP().getValue(), companion.getKZ().getValue(), companion.getLV().getValue(), companion.getLI().getValue(), companion.getLT().getValue(), companion.getLU().getValue(), companion.getMC().getValue(), companion.getMO().getValue(), companion.getMT().getValue(), companion.getMX().getValue(), companion.getNL().getValue(), companion.getNO().getValue(), companion.getNZ().getValue(), companion.getPL().getValue(), companion.getPT().getValue(), companion.getRO().getValue(), companion.getSE().getValue(), companion.getSG().getValue(), companion.getSI().getValue(), companion.getSK().getValue(), companion.getUA().getValue(), companion.getUS().getValue(), companion.getVA().getValue()});
    }

    public C27526b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f55953a = context;
        this.f55954b = new LruCache<>(3);
        this.f55955c = LazyKt.lazy(new b());
    }

    @Override // com.revolut.revolutpay.data.repository.InterfaceC27525a
    @NotNull
    /* JADX INFO: renamed from: a */
    public List<C27572a> mo68207a() {
        List<C27572a> list = this.f55954b.get(m68213f());
        return list == null ? m68214g() : list;
    }

    /* JADX INFO: renamed from: b */
    public final String m68210b(String str) throws Exception {
        try {
            Context context = this.f55953a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("country_name_with_article.");
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            sb2.append(lowerCase);
            return C45780a.m101103c(context, sb2.toString());
        } catch (Exception e11) {
            System.out.println((Object) ("could not find " + str));
            throw e11;
        }
    }

    /* JADX INFO: renamed from: e */
    public final List<Pair<String, String>> m68212e() {
        return (List) this.f55955c.getValue();
    }

    /* JADX INFO: renamed from: f */
    public final Locale m68213f() {
        return C4929a.f5465a.m5148a(this.f55953a);
    }

    /* JADX INFO: renamed from: d */
    public final List<C27572a> m68211d() {
        List<Pair<String, String>> listM68212e = m68212e();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM68212e, 10));
        Iterator<T> it = listM68212e.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = (String) pair.component1();
            String str2 = (String) pair.component2();
            arrayList.add(new C27572a(str2, m68210b(str2), str));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public final List<C27572a> m68214g() {
        Locale localeM68213f = m68213f();
        List<C27572a> list = this.f55954b.get(localeM68213f);
        if (list == null) {
            List<C27572a> listM68211d = m68211d();
            this.f55954b.put(localeM68213f, listM68211d);
            return listM68211d;
        }
        return list;
    }
}
