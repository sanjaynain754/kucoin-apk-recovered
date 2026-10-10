package p402kf;

import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.kubi.data.DataInitManager;
import com.kubi.data.entity.FiatCurrencyEntity;
import com.kubi.data.rate.CurrencyPrice;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseApplication;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.utils.C27099x;
import com.kubi.utils.C27101y;
import com.kubi.utils.storage.StorageType;
import io.reactivex.functions.Consumer;
import io.reactivex.subjects.PublishSubject;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListMap;
import p340if.C38527a;
import p830zf.InterfaceC46792d;
import ro.C44128b;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: renamed from: kf.c */
/* JADX INFO: compiled from: CurrencyConfig.java */
/* JADX INFO: loaded from: classes.dex */
public class C41016c {

    /* JADX INFO: renamed from: a */
    public static StorageId<String> f91244a;

    /* JADX INFO: renamed from: b */
    public static StorageId<String> f91245b;

    /* JADX INFO: renamed from: c */
    public static StorageId<String> f91246c;

    /* JADX INFO: renamed from: d */
    public static CurrencyPrice f91247d;

    /* JADX INFO: renamed from: e */
    public static String f91248e;

    /* JADX INFO: renamed from: f */
    public static final PublishSubject<Boolean> f91249f;

    /* JADX INFO: renamed from: g */
    public static HashMap<String, Integer> f91250g;

    /* JADX INFO: renamed from: h */
    public static ConcurrentSkipListMap<String, FiatCurrencyEntity> f91251h;

    /* JADX INFO: renamed from: kf.c$a */
    /* JADX INFO: compiled from: CurrencyConfig.java */
    public class a extends TypeToken<List<FiatCurrencyEntity>> {
    }

    static {
        StorageType storageType = StorageType.LocalSite;
        f91244a = new StorageId<>("currency_config", "sp_key_currency_unit_v2", storageType, true);
        f91245b = new StorageId<>("currency_config", "sp_key_currency", storageType, true);
        f91246c = new StorageId<>("currency_config", "sp_key_currency_map", storageType, true);
        f91247d = new CurrencyPrice();
        f91248e = m89970h();
        f91249f = PublishSubject.create();
        f91250g = new HashMap<>();
        f91251h = new ConcurrentSkipListMap<>();
        DataInitManager dataInitManager = DataInitManager.f21486a;
        if (TextUtils.isEmpty(dataInitManager.m23668i().mo23676d())) {
            String strM102326h = C46392a.m102326h(f91245b, "");
            if (!TextUtils.isEmpty(strM102326h)) {
                f91248e = strM102326h;
            }
        } else {
            f91248e = dataInitManager.m23668i().mo23677e();
        }
        String strM102326h2 = C46392a.m102326h(f91244a, "");
        if (TextUtils.isEmpty(strM102326h2)) {
            strM102326h2 = C27101y.m66925a(BaseApplication.get(), "currency_unit.json");
        }
        try {
            List<FiatCurrencyEntity> list = (List) C27099x.m66912b(strM102326h2, new a().getType());
            if (list != null) {
                f91251h.clear();
                for (FiatCurrencyEntity fiatCurrencyEntity : list) {
                    if (fiatCurrencyEntity != null) {
                        f91251h.put(fiatCurrencyEntity.getName(), fiatCurrencyEntity);
                    }
                }
            }
        } catch (Throwable th2) {
            C44128b.m97261e("CurrencyConfig", "json error = " + th2.getMessage());
        }
        String strM102326h3 = C46392a.m102326h(f91246c, "");
        if (TextUtils.isEmpty(strM102326h2)) {
            return;
        }
        try {
            CurrencyPrice currencyPrice = (CurrencyPrice) C27099x.m66912b(strM102326h3, CurrencyPrice.class);
            if (currencyPrice == null || !currencyPrice.getCurrencyUnit().equals(f91248e)) {
                return;
            }
            f91247d = currencyPrice;
        } catch (Exception e11) {
            C44128b.m97264h(e11);
            C38527a.m87142a(e11, "CurrencyConfig");
        }
    }

    /* JADX INFO: renamed from: a */
    public static PublishSubject<Boolean> m89963a() {
        return f91249f;
    }

    /* JADX INFO: renamed from: b */
    public static Set<String> m89964b() {
        return f91251h.keySet();
    }

    /* JADX INFO: renamed from: c */
    public static String m89965c() {
        return f91248e;
    }

    /* JADX INFO: renamed from: d */
    public static String m89966d() {
        return m89967e(f91248e);
    }

    /* JADX INFO: renamed from: e */
    public static String m89967e(String str) {
        try {
            String symbol = f91251h.get(str).getSymbol();
            return symbol == null ? "- -" : symbol;
        } catch (Exception unused) {
            return "- -";
        }
    }

    /* JADX INFO: renamed from: f */
    public static HashMap<String, Double> m89968f() {
        return f91247d.getPrice();
    }

    /* JADX INFO: renamed from: g */
    public static Double m89969g(String str) {
        if (f91248e.equals(f91247d.getCurrencyUnit())) {
            return f91247d.getPrice().get(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static String m89970h() {
        try {
            InterfaceC46792d interfaceC46792d = (InterfaceC46792d) Router.f46192a.m56186h(InterfaceC46792d.class, SiteInfoManager.f47913a.m58109c());
            return interfaceC46792d != null ? interfaceC46792d.mo102960a() : "USD";
        } catch (Exception e11) {
            C38527a.m87142a(e11, "CurrencyConfig-initDefaultCurrency");
            return "USD";
        }
    }

    /* JADX INFO: renamed from: i */
    public static boolean m89971i(String str) {
        if (f91248e.equals(str)) {
            return false;
        }
        C46392a.m102333p(f91245b, str);
        f91248e = str;
        f91247d.getPrice().put("USD", null);
        f91249f.onNext(Boolean.TRUE);
        return true;
    }

    /* JADX INFO: renamed from: k */
    public static void m89973k(List<FiatCurrencyEntity> list, Consumer<String> consumer) {
        f91251h.clear();
        if (list != null && !list.isEmpty()) {
            for (FiatCurrencyEntity fiatCurrencyEntity : list) {
                f91251h.put(fiatCurrencyEntity.getName(), fiatCurrencyEntity);
            }
        }
        C46392a.m102333p(f91244a, C27099x.m66917g(list));
        try {
            if (f91251h.get(f91248e) == null) {
                Map.Entry<String, FiatCurrencyEntity> entryFirstEntry = f91251h.firstEntry();
                if (entryFirstEntry != null) {
                    f91248e = entryFirstEntry.getValue().getName();
                } else {
                    f91248e = m89970h();
                }
                m89971i(f91248e);
                consumer.accept(f91248e);
            }
        } catch (Exception e11) {
            C44128b.m97260d("updateCurrencyUnit:" + e11.getMessage());
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m89972j(CurrencyPrice currencyPrice) {
        if (!currencyPrice.getCurrencyUnit().equals(f91248e)) {
            return;
        }
        C46392a.m102333p(f91246c, C27099x.m66917g(currencyPrice));
        f91247d = currencyPrice;
        f91249f.onNext(Boolean.FALSE);
    }
}
