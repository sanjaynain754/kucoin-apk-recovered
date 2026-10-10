package jumio.core;

import com.jumio.core.data.document.DocumentFormat;
import com.jumio.sdk.document.JumioDocumentType;
import com.jumio.sdk.document.JumioDocumentVariant;
import com.jumio.sdk.enums.JumioCredentialPart;
import java.util.List;
import p852kotlin.collections.CollectionsKt;

/* JADX INFO: renamed from: jumio.core.B0 */
/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractC40507B0 {

    /* JADX INFO: renamed from: a */
    public static final JumioDocumentType f89914a = JumioDocumentType.PASSPORT;

    /* JADX INFO: renamed from: b */
    public static final List f89915b;

    /* JADX INFO: renamed from: c */
    public static final DocumentFormat f89916c;

    /* JADX INFO: renamed from: d */
    public static final JumioDocumentType f89917d;

    /* JADX INFO: renamed from: e */
    public static final List f89918e;

    /* JADX INFO: renamed from: f */
    public static final DocumentFormat f89919f;

    /* JADX INFO: renamed from: g */
    public static final JumioDocumentVariant f89920g;

    static {
        JumioCredentialPart jumioCredentialPart = JumioCredentialPart.FRONT;
        f89915b = CollectionsKt.listOf(jumioCredentialPart);
        f89916c = DocumentFormat.ID3;
        f89917d = JumioDocumentType.DRIVING_LICENSE;
        f89918e = CollectionsKt.listOf((Object[]) new JumioCredentialPart[]{jumioCredentialPart, JumioCredentialPart.BACK});
        f89919f = DocumentFormat.ID1;
        f89920g = JumioDocumentVariant.PLASTIC;
    }
}
