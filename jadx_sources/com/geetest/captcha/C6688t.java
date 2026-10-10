package com.geetest.captcha;

import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;
import p852kotlin.text.Typography;

/* JADX INFO: renamed from: com.geetest.captcha.t */
/* JADX INFO: loaded from: classes45.dex */
public final class C6688t {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f11198a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final Map<String, String> f11199b;

    /* JADX INFO: renamed from: com.geetest.captcha.t$a */
    public static final class a {
        @Nullable
        /* JADX INFO: renamed from: a */
        public static C6688t m12552a(@NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            try {
                if (StringsKt.isBlank(url)) {
                    return null;
                }
                Object[] array = StringsKt.split$default((CharSequence) StringsKt.trim((CharSequence) url).toString(), new String[]{"?"}, false, 0, 6, (Object) null).toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    HashMap map = new HashMap();
                    if (strArr.length == 1) {
                        return new C6688t(strArr[0], map);
                    }
                    if (strArr.length == 2) {
                        Object[] array2 = StringsKt.split$default((CharSequence) strArr[1], new String[]{"&"}, false, 0, 6, (Object) null).toArray(new String[0]);
                        if (array2 != null) {
                            for (String str : (String[]) array2) {
                                Object[] array3 = StringsKt.split$default((CharSequence) str, new String[]{"="}, false, 0, 6, (Object) null).toArray(new String[0]);
                                if (array3 != null) {
                                    String[] strArr2 = (String[]) array3;
                                    if (strArr2.length == 2) {
                                        map.put(strArr2[0], strArr2[1]);
                                    }
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                                }
                            }
                            return new C6688t(strArr[0], map);
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    }
                    return null;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @NotNull
    public final String toString() {
        Map<String, String> map = this.f11199b;
        if (map == null || map.isEmpty()) {
            return this.f11198a;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f11198a);
        stringBuffer.append('?');
        for (Map.Entry<String, String> entry : this.f11199b.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            stringBuffer.append(key);
            stringBuffer.append('=');
            stringBuffer.append(value);
            stringBuffer.append(Typography.amp);
        }
        String string = stringBuffer.deleteCharAt(stringBuffer.length() - 1).toString();
        Intrinsics.checkNotNullExpressionValue(string, "{\n            val sb = S…- 1).toString()\n        }");
        return string;
    }

    public C6688t(String str, Map<String, String> map) {
        this.f11198a = str;
        this.f11199b = map;
    }
}
