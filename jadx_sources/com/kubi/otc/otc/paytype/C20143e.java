package com.kubi.otc.otc.paytype;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import com.google.gson.reflect.TypeToken;
import com.kubi.otc.R$mipmap;
import com.kubi.otc.R$string;
import com.kubi.otc.entity.PayTemplate;
import com.kubi.otc.entity.PayTypeEntity;
import com.kubi.payment.util.PaymentStorageId;
import com.kubi.sdk.base.p113ui.InterfaceC23686g;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24223c1;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27099x;
import com.kubi.utils.extensions.C27041f;
import et.InterfaceC37241c;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p491o8.C42989b;
import p778xy.C46338a;
import p778xy.C46340c;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import y70.C46392a;

/* JADX INFO: renamed from: com.kubi.otc.otc.paytype.e */
/* JADX INFO: compiled from: PayTypeEx.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u001a(\u0010\b\u001a\u00020\u0003*\u00020\t2\u001c\b\u0002\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0018\u00010\u000b\u001a>\u0010\u000f\u001a\u00020\u0003*\u00020\t2(\b\u0002\u0010\n\u001a\"\u0012\u0004\u0012\u00020\f\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\r0\u0010\u0018\u00010\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m90084d2 = {"OTHER_NAME", "", "getPayTypeIcon", "", "Landroid/widget/ImageView;", "context", "Landroid/content/Context;", "url", "getPayTypeList", "Lcom/kubi/sdk/base/ui/IView;", "consumer", "Lio/reactivex/functions/BiConsumer;", "", "", "Lcom/kubi/otc/entity/PayTypeEntity;", "getPayTypeTemplateList", "", "Lcom/kubi/otc/entity/PayTemplate;", "isNet", "PaymentLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPayTypeEx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PayTypeEx.kt\ncom/kubi/otc/otc/paytype/PayTypeExKt\n+ 2 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,103:1\n160#2,4:104\n160#2,4:108\n1869#3:112\n1870#3:114\n1011#3,2:115\n1011#3,2:117\n1#4:113\n*S KotlinDebug\n*F\n+ 1 PayTypeEx.kt\ncom/kubi/otc/otc/paytype/PayTypeExKt\n*L\n54#1:104,4\n91#1:108,4\n62#1:112\n62#1:114\n71#1:115,2\n72#1:117,2\n*E\n"})
public final class C20143e {

    /* JADX INFO: renamed from: com.kubi.otc.otc.paytype.e$a */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJSONOrNull$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJSONOrNull$1\n*L\n1#1,300:1\n*E\n"})
    public static final class a extends TypeToken<List<? extends PayTypeEntity>> {
    }

    /* JADX INFO: renamed from: com.kubi.otc.otc.paytype.e$b */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 PayTypeEx.kt\ncom/kubi/otc/otc/paytype/PayTypeExKt\n*L\n1#1,328:1\n71#2:329\n*E\n"})
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(((PayTypeEntity) t11).getFirstLetter(), ((PayTypeEntity) t12).getFirstLetter());
        }
    }

    /* JADX INFO: renamed from: com.kubi.otc.otc.paytype.e$c */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 PayTypeEx.kt\ncom/kubi/otc/otc/paytype/PayTypeExKt\n*L\n1#1,328:1\n72#2:329\n*E\n"})
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(Boolean.valueOf(!((PayTypeEntity) t11).m103797isCommonlyUsed()), Boolean.valueOf(!((PayTypeEntity) t12).m103797isCommonlyUsed()));
        }
    }

    /* JADX INFO: renamed from: com.kubi.otc.otc.paytype.e$d */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJSONOrNull$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJSONOrNull$1\n*L\n1#1,300:1\n*E\n"})
    public static final class d extends TypeToken<Map<String, ? extends List<? extends PayTemplate>>> {
    }

    /* JADX INFO: renamed from: c */
    public static final void m45237c(@NotNull ImageView imageView, @NotNull Context context, @Nullable String str) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        if (str == null || str.length() == 0) {
            imageView.setImageResource(R$mipmap.botc_ic_pay_method_default);
            return;
        }
        C46340c<Drawable> c46340cMo6634v = C46338a.m102151a(context).mo6634v(C27041f.m66668h(str));
        int i11 = R$mipmap.botc_ic_pay_method_default;
        c46340cMo6634v.mo92188b0(i11).mo92208m(i11).m6594E0(imageView);
    }

    /* JADX INFO: renamed from: d */
    public static final void m45238d(@NotNull InterfaceC23686g interfaceC23686g, @Nullable final BiConsumer<Boolean, List<PayTypeEntity>> biConsumer) {
        Object objM66914d;
        Intrinsics.checkNotNullParameter(interfaceC23686g, "<this>");
        final String strM102326h = C46392a.m102326h(PaymentStorageId.f40364a.m49842t(), "");
        if (!TextUtils.isEmpty(strM102326h)) {
            try {
                C27099x c27099x = C27099x.f54458a;
                objM66914d = C27099x.m66914d(strM102326h, new a().getType());
            } catch (Throwable unused) {
                objM66914d = null;
            }
            List<PayTypeEntity> list = (List) objM66914d;
            if (list != null && biConsumer != null) {
                biConsumer.accept(Boolean.FALSE, list);
            }
        }
        Disposable disposableSubscribe = InterfaceC37241c.m83310o((InterfaceC37241c) C42597a.m93386b().create(InterfaceC37241c.class), "PAYTYPE", null, null, 6, null).compose(C24217a1.m58389m()).subscribe(new Consumer() { // from class: com.kubi.otc.otc.paytype.c
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                C20143e.m45239e(strM102326h, biConsumer, (ArrayList) obj);
            }
        }, new C24223c1(interfaceC23686g));
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        CompositeDisposable compositeDisposable = interfaceC23686g.getCompositeDisposable();
        Intrinsics.checkNotNullExpressionValue(compositeDisposable, "getCompositeDisposable(...)");
        DisposableKt.addTo(disposableSubscribe, compositeDisposable);
    }

    /* JADX INFO: renamed from: f */
    public static final void m45240f(@NotNull InterfaceC23686g interfaceC23686g, @Nullable final BiConsumer<Boolean, Map<String, List<PayTemplate>>> biConsumer, boolean z11) throws Exception {
        Object objM66914d;
        Intrinsics.checkNotNullParameter(interfaceC23686g, "<this>");
        String strM102326h = C46392a.m102326h(PaymentStorageId.f40364a.m49840r(), "");
        if (!TextUtils.isEmpty(strM102326h)) {
            try {
                C27099x c27099x = C27099x.f54458a;
                objM66914d = C27099x.m66914d(strM102326h, new d().getType());
            } catch (Throwable unused) {
                objM66914d = null;
            }
            Map<String, List<PayTemplate>> map = (Map) objM66914d;
            if (map != null && biConsumer != null) {
                biConsumer.accept(Boolean.FALSE, map);
            }
        }
        if (TextUtils.isEmpty(strM102326h) || z11) {
            Disposable disposableSubscribe = ((InterfaceC37241c) C42597a.m93386b().create(InterfaceC37241c.class)).m83311A().compose(C24217a1.m58389m()).subscribe(new Consumer() { // from class: com.kubi.otc.otc.paytype.d
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    C20143e.m45241g(biConsumer, (Map) obj);
                }
            }, new C24223c1(interfaceC23686g));
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
            CompositeDisposable compositeDisposable = interfaceC23686g.getCompositeDisposable();
            Intrinsics.checkNotNullExpressionValue(compositeDisposable, "getCompositeDisposable(...)");
            DisposableKt.addTo(disposableSubscribe, compositeDisposable);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m45241g(BiConsumer biConsumer, Map map) throws Exception {
        C46392a.m102333p(PaymentStorageId.f40364a.m49840r(), C27099x.m66919i(map, false, 2, null));
        if (biConsumer != null) {
            biConsumer.accept(Boolean.TRUE, map);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m45239e(String str, BiConsumer biConsumer, ArrayList arrayList) throws Exception {
        char cFirstOrNull;
        String strValueOf;
        String strM94421d;
        Intrinsics.checkNotNull(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            PayTypeEntity payTypeEntity = (PayTypeEntity) it.next();
            Character chFirstOrNull = StringsKt.firstOrNull(payTypeEntity.getShowTypeName());
            if (chFirstOrNull == null || (strM94421d = C42989b.m94421d(Character.toUpperCase(chFirstOrNull.charValue()))) == null || (cFirstOrNull = StringsKt.firstOrNull(strM94421d)) == null) {
                cFirstOrNull = '#';
            }
            payTypeEntity.setFirstLetter(cFirstOrNull);
            if (payTypeEntity.m103797isCommonlyUsed()) {
                strValueOf = C27017c.f54310a.m66516f(R$string.suggest_gather_way, new Object[0]);
            } else {
                strValueOf = String.valueOf(payTypeEntity.getFirstLetter());
            }
            payTypeEntity.setTitle(strValueOf);
        }
        if (arrayList.size() > 1) {
            CollectionsKt.sortWith(arrayList, new b());
        }
        if (arrayList.size() > 1) {
            CollectionsKt.sortWith(arrayList, new c());
        }
        C46392a.m102333p(PaymentStorageId.f40364a.m49842t(), C27099x.m66919i(arrayList, false, 2, null));
        if (str.length() == 0 && biConsumer != null) {
            biConsumer.accept(Boolean.TRUE, arrayList);
        }
    }
}
