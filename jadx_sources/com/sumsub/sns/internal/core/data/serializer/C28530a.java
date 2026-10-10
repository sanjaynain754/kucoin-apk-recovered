package com.sumsub.sns.internal.core.data.serializer;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlinx.serialization.encoding.InterfaceC41787b;
import tg0.InterfaceC44951d;
import vg0.AbstractC45532e;
import vg0.C45540m;
import vg0.InterfaceC45533f;
import wg0.InterfaceC45830c;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.data.serializer.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28530a implements InterfaceC44951d {

    /* JADX INFO: renamed from: a */
    public static final C28530a f58079a = new C28530a();

    /* JADX INFO: renamed from: b */
    public static final InterfaceC45533f f58080b = C45540m.m100542c("DateSerializer", AbstractC45532e.i.f102607a);

    /* JADX INFO: renamed from: c */
    public static final SimpleDateFormat f58081c = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    public final InterfaceC45533f getDescriptor() {
        return f58080b;
    }

    @Override // tg0.InterfaceC44963p
    public final void serialize(InterfaceC45830c interfaceC45830c, Object obj) {
        interfaceC45830c.encodeString(f58081c.format((Date) obj));
    }

    @Override // tg0.InterfaceC44949c
    public final Object deserialize(InterfaceC41787b interfaceC41787b) {
        try {
            Date date = f58081c.parse(interfaceC41787b.decodeString());
            if (date == null) {
                return new Date();
            }
            return date;
        } catch (Throwable unused) {
            return new Date();
        }
    }
}
