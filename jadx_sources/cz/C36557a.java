package cz;

import com.kubi.utils.storage.StorageType;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: renamed from: cz.a */
/* JADX INFO: compiled from: LanguageKV.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005J\u000e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/sdk/function/language/helper/LanguageKV;", "", "<init>", "()V", "KV_CATE", "", "KV_ETAG", "Lcom/kubi/utils/storage/StorageId;", "getKV_ETAG", "()Lcom/kubi/utils/storage/StorageId;", "putLangValue", "", "uniqueKey", "value", "getLangValue", "LLanguage_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLanguageKV.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LanguageKV.kt\ncom/kubi/sdk/function/language/helper/LanguageKV\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,28:1\n23#2,2:29\n32#2:31\n*S KotlinDebug\n*F\n+ 1 LanguageKV.kt\ncom/kubi/sdk/function/language/helper/LanguageKV\n*L\n22#1:29,2\n26#1:31\n*E\n"})
public final class C36557a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C36557a f79397a = new C36557a();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final StorageId<String> f79398b = new StorageId<>("KV_CATE_DYNAMIC_LANG", "KEY_LANG_ETAG", StorageType.Shared, false, 8, null);

    @NotNull
    /* JADX INFO: renamed from: a */
    public final StorageId<String> m81828a() {
        return f79398b;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final String m81829b(@NotNull String uniqueKey) {
        Intrinsics.checkNotNullParameter(uniqueKey, "uniqueKey");
        return C46392a.m102326h(new StorageId("KV_CATE_DYNAMIC_LANG", uniqueKey, StorageType.Shared, false, 8, null), "");
    }

    /* JADX INFO: renamed from: c */
    public final void m81830c(@NotNull String uniqueKey, @NotNull String value) {
        Intrinsics.checkNotNullParameter(uniqueKey, "uniqueKey");
        Intrinsics.checkNotNullParameter(value, "value");
        C46392a.m102333p(new StorageId("KV_CATE_DYNAMIC_LANG", uniqueKey, StorageType.Shared, false, 8, null), value);
    }
}
