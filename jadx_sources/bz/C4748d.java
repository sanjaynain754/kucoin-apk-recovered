package bz;

import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.SetsKt;

/* JADX INFO: renamed from: bz.d */
/* JADX INFO: compiled from: GlobalLanguageFlavorImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0016¨\u0006\b"}, m90084d2 = {"Lcom/kubi/sdk/function/language/flavor/GlobalLanguageFlavorImpl;", "Lcom/kubi/sdk/function/language/flavor/IPresetLanguageFlavor;", "<init>", "()V", "defaultLanguage", "", "languageList", "", "LLanguage_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C4748d implements InterfaceC4749e {
    @Override // bz.InterfaceC4749e
    @NotNull
    /* JADX INFO: renamed from: a */
    public Set<String> mo4786a() {
        return SetsKt.setOf((Object[]) new String[]{"en_US", "ru_RU", "ja_JP", "es_ES", "vi_VN", "tr_TR", "pt_PT", "fr_FR", "zh_HK", "id_ID", "th_TH", "hi_IN", "ms_MY", "ar_AE", "bn_BD", "fil_PH", "ur_PK", "uk_UA"});
    }

    @Override // bz.InterfaceC4749e
    @NotNull
    /* JADX INFO: renamed from: b */
    public String mo4787b() {
        return "en_US";
    }
}
