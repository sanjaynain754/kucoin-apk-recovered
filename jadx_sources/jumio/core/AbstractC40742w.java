package jumio.core;

import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: jumio.core.w */
/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractC40742w {
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX INFO: renamed from: a */
    public static final String m89268a(String str) {
        String str2;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        if (str.length() > 0) {
            str2 = StringsKt.endsWith$default(str, "/", false, 2, (Object) null) ? "" : "/";
        }
        sb2.append(str2);
        return sb2.toString();
    }
}
