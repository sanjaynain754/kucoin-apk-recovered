package jumio.core;

import com.jumio.core.constants.ConstantsKt;
import p852kotlin.enums.EnumEntriesKt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 jumio.core.R1[], still in use, count: 1, list:
  (r0v1 jumio.core.R1[]) from 0x002a: INVOKE (r0v1 jumio.core.R1[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m)] (LINE:45)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: jumio.core.R1 */
/* JADX INFO: loaded from: classes61.dex */
public final class EnumC40587R1 {
    JPEG(0, ConstantsKt.FILE_TYPE_JPEG),
    PNG(1, ConstantsKt.FILE_TYPE_PNG),
    WEBP(2, ConstantsKt.FILE_TYPE_WEBP);


    /* JADX INFO: renamed from: a */
    public final String f90107a;

    /* JADX INFO: renamed from: b */
    public final String f90108b;

    static {
        EnumEntriesKt.enumEntries(enumC40587R1Arr);
    }

    public static EnumC40587R1 valueOf(String str) {
        return (EnumC40587R1) Enum.valueOf(EnumC40587R1.class, str);
    }

    public static EnumC40587R1[] values() {
        return (EnumC40587R1[]) f90106f.clone();
    }

    public EnumC40587R1(int i11, String str) {
        super(str, i11);
        this.f90107a = str;
        this.f90108b = str;
    }
}
