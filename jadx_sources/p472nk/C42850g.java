package p472nk;

import com.kubi.p110rn.Constants;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: nk.g */
/* JADX INFO: compiled from: StorageNamespace.kt */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0012\u0010\u0002\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0000\u001a\f\u0010\u0004\u001a\u00020\u0001*\u00020\u0001H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m90084d2 = {"DEFAULT_CATEGORY", "", "categoryOf", Constants.BIZ, "sanitizeBiz", "JsBridgeLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nStorageNamespace.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StorageNamespace.kt\ncom/kubi/jsbridge/impl/storage/StorageNamespaceKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,24:1\n1#2:25\n975#3:26\n1046#3,3:27\n*S KotlinDebug\n*F\n+ 1 StorageNamespace.kt\ncom/kubi/jsbridge/impl/storage/StorageNamespaceKt\n*L\n15#1:26\n15#1:27,3\n*E\n"})
public final class C42850g {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m93982a(@Nullable String str) {
        String strM93983b = null;
        if (str != null) {
            if (StringsKt.isBlank(str)) {
                str = null;
            }
            if (str != null) {
                strM93983b = m93983b(str);
            }
        }
        if (strM93983b == null) {
            strM93983b = "";
        }
        if (strM93983b.length() == 0 || Intrinsics.areEqual(strM93983b, "default")) {
            return "kc_jsapi_storage";
        }
        return "kc_jsapi_storage." + strM93983b;
    }

    /* JADX INFO: renamed from: b */
    public static final String m93983b(String str) {
        ArrayList arrayList = new ArrayList(str.length());
        for (int i11 = 0; i11 < str.length(); i11++) {
            char cCharAt = str.charAt(i11);
            if (!Character.isLetterOrDigit(cCharAt) && cCharAt != '.' && cCharAt != '_' && cCharAt != '-') {
                cCharAt = '_';
            }
            arrayList.add(Character.valueOf(cCharAt));
        }
        return CollectionsKt.joinToString$default(arrayList, "", null, null, 0, null, null, 62, null);
    }
}
