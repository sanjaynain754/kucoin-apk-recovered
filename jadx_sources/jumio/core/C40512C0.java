package jumio.core;

import com.jumio.core.credentials.CredentialCapability$Companion;
import java.io.Serializable;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.C0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40512C0 implements Serializable {

    /* JADX INFO: renamed from: c */
    public static final CredentialCapability$Companion f89929c = new CredentialCapability$Companion(null);

    /* JADX INFO: renamed from: a */
    public final EnumC40517D0 f89930a;

    /* JADX INFO: renamed from: b */
    public final String f89931b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40512C0)) {
            return false;
        }
        C40512C0 c40512c0 = (C40512C0) obj;
        return this.f89930a == c40512c0.f89930a && Intrinsics.areEqual(this.f89931b, c40512c0.f89931b);
    }

    public final int hashCode() {
        return this.f89931b.hashCode() + (this.f89930a.hashCode() * 31);
    }

    public final String toString() {
        return "CredentialCapability(type=" + this.f89930a + ", id=" + this.f89931b + ')';
    }

    public C40512C0(EnumC40517D0 type, String id2) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(id2, "id");
        this.f89930a = type;
        this.f89931b = id2;
    }
}
