package p359j5;

import android.icu.util.ULocale;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import com.facebook.hermes.intl.JSRangeErrorException;
import com.facebook.hermes.intl.UnicodeExtensionKeys;
import com.tencent.bugly.proguard.C33820nf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: j5.g */
/* JADX INFO: compiled from: LocaleObjectICU.java */
/* JADX INFO: loaded from: classes34.dex */
public class C40278g implements InterfaceC40273b<ULocale> {

    /* JADX INFO: renamed from: a */
    public ULocale f89513a;

    /* JADX INFO: renamed from: b */
    public ULocale.Builder f89514b;

    /* JADX INFO: renamed from: c */
    public boolean f89515c;

    public C40278g(ULocale uLocale) {
        this.f89514b = null;
        this.f89515c = false;
        this.f89513a = uLocale;
    }

    @RequiresApi(api = 24)
    /* JADX INFO: renamed from: h */
    public static InterfaceC40273b<ULocale> m88691h() {
        return new C40278g(ULocale.getDefault(ULocale.Category.FORMAT));
    }

    @RequiresApi(api = 24)
    /* JADX INFO: renamed from: i */
    public static InterfaceC40273b<ULocale> m88692i(String str) throws JSRangeErrorException {
        return new C40278g(str);
    }

    /* JADX INFO: renamed from: j */
    public static InterfaceC40273b<ULocale> m88693j(ULocale uLocale) {
        return new C40278g(uLocale);
    }

    @RequiresApi(api = 24)
    /* JADX INFO: renamed from: k */
    private void m88694k() throws JSRangeErrorException {
        if (this.f89515c) {
            try {
                this.f89513a = this.f89514b.build();
                this.f89515c = false;
            } catch (RuntimeException e11) {
                throw new JSRangeErrorException(e11.getMessage());
            }
        }
    }

    @Override // p359j5.InterfaceC40273b
    @RequiresApi(api = 24)
    /* JADX INFO: renamed from: b */
    public String mo88659b() throws JSRangeErrorException {
        return mo88658a().toLanguageTag();
    }

    @Override // p359j5.InterfaceC40273b
    @RequiresApi(api = 24)
    /* JADX INFO: renamed from: c */
    public void mo88660c(String str, ArrayList<String> arrayList) throws JSRangeErrorException {
        m88694k();
        if (this.f89514b == null) {
            this.f89514b = new ULocale.Builder().setLocale(this.f89513a);
        }
        try {
            this.f89514b.setUnicodeLocaleKeyword(str, TextUtils.join(C33820nf.f71144W, arrayList));
            this.f89515c = true;
        } catch (RuntimeException e11) {
            throw new JSRangeErrorException(e11.getMessage());
        }
    }

    @Override // p359j5.InterfaceC40273b
    @RequiresApi(api = 24)
    /* JADX INFO: renamed from: d */
    public HashMap<String, String> mo88661d() throws JSRangeErrorException {
        m88694k();
        HashMap<String, String> map = new HashMap<>();
        Iterator<String> keywords = this.f89513a.getKeywords();
        if (keywords != null) {
            while (keywords.hasNext()) {
                String next = keywords.next();
                map.put(UnicodeExtensionKeys.m9042b(next), this.f89513a.getKeywordValue(next));
            }
        }
        return map;
    }

    @Override // p359j5.InterfaceC40273b
    @RequiresApi(api = 24)
    /* JADX INFO: renamed from: e */
    public ArrayList<String> mo88662e(String str) throws JSRangeErrorException {
        m88694k();
        String strM9041a = UnicodeExtensionKeys.m9041a(str);
        ArrayList<String> arrayList = new ArrayList<>();
        String keywordValue = this.f89513a.getKeywordValue(strM9041a);
        if (keywordValue != null && !keywordValue.isEmpty()) {
            Collections.addAll(arrayList, keywordValue.split("-|_"));
        }
        return arrayList;
    }

    @Override // p359j5.InterfaceC40273b
    @RequiresApi(api = 24)
    /* JADX INFO: renamed from: f */
    public InterfaceC40273b<ULocale> mo88663f() throws JSRangeErrorException {
        m88694k();
        return new C40278g(this.f89513a);
    }

    @Override // p359j5.InterfaceC40273b
    @RequiresApi(api = 24)
    /* JADX INFO: renamed from: g */
    public String mo88664g() throws JSRangeErrorException {
        return getLocale().toLanguageTag();
    }

    @Override // p359j5.InterfaceC40273b
    @RequiresApi(api = 24)
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public ULocale getLocale() throws JSRangeErrorException {
        m88694k();
        return this.f89513a;
    }

    @Override // p359j5.InterfaceC40273b
    @RequiresApi(api = 24)
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public ULocale mo88658a() throws JSRangeErrorException {
        m88694k();
        ULocale.Builder builder = new ULocale.Builder();
        builder.setLocale(this.f89513a);
        builder.clearExtensions();
        return builder.build();
    }

    @RequiresApi(api = 24)
    public C40278g(String str) throws JSRangeErrorException {
        this.f89513a = null;
        this.f89514b = null;
        this.f89515c = false;
        ULocale.Builder builder = new ULocale.Builder();
        this.f89514b = builder;
        try {
            builder.setLanguageTag(str);
            this.f89515c = true;
        } catch (RuntimeException e11) {
            throw new JSRangeErrorException(e11.getMessage());
        }
    }
}
