package ma0;

import com.revolut.revolutpay.data.repository.InterfaceC27525a;
import com.revolut.revolutpay.domain.model.CountryCode;
import com.revolut.revolutpay.p123ui.picker.model.C27572a;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ma0.b */
/* JADX INFO: loaded from: classes59.dex */
public final class C42498b implements InterfaceC42497a {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final a f94161b = new a(null);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final CountryCode f94162c = CountryCode.INSTANCE.getGB();

    /* JADX INFO: renamed from: a */
    @NotNull
    public final InterfaceC27525a f94163a;

    /* JADX INFO: renamed from: ma0.b$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // ma0.InterfaceC42497a
    @NotNull
    /* JADX INFO: renamed from: a */
    public C27572a mo93182a(@NotNull CountryCode countryCode) {
        Object next;
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        List<C27572a> listMo68207a = this.f94163a.mo68207a();
        Iterator<T> it = listMo68207a.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((C27572a) next).m68413e(), countryCode));
        C27572a c27572a = (C27572a) next;
        if (c27572a != null) {
            return c27572a;
        }
        for (C27572a c27572a2 : listMo68207a) {
            if (Intrinsics.areEqual(c27572a2.m68413e(), f94162c)) {
                return c27572a2;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public C42498b(@NotNull InterfaceC27525a countryRepository) {
        Intrinsics.checkNotNullParameter(countryRepository, "countryRepository");
        this.f94163a = countryRepository;
    }

    @Override // ma0.InterfaceC42497a
    @NotNull
    /* JADX INFO: renamed from: a */
    public List<C27572a> mo93183a() {
        return this.f94163a.mo68207a();
    }
}
