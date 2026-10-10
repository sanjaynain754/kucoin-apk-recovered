package com.revolut.revolutpay.p123ui.picker;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.revolutpay.domain.model.CountryCode;
import com.revolut.revolutpay.p123ui.picker.model.C27572a;
import com.revolut.revolutpay.ui_kit.delegate.C27591a;
import java.util.ArrayList;
import java.util.List;
import ma0.InterfaceC42497a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;
import sa0.AbstractC44371a;
import xa0.C46116b;
import xa0.C46120f;
import xa0.InterfaceC46115a;

/* JADX INFO: renamed from: com.revolut.revolutpay.ui.picker.d */
/* JADX INFO: loaded from: classes59.dex */
public final class C27567d extends AbstractC44371a<InterfaceC27570g> implements InterfaceC27568e {

    /* JADX INFO: renamed from: c */
    @NotNull
    public final InterfaceC42497a f56307c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final C27569f f56308d;

    /* JADX INFO: renamed from: com.revolut.revolutpay.ui.picker.d$a */
    public final class a implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<a> CREATOR = new C46984a();

        /* JADX INFO: renamed from: a */
        @NotNull
        private final C27572a f56309a;

        /* JADX INFO: renamed from: com.revolut.revolutpay.ui.picker.d$a$a, reason: collision with other inner class name */
        public static final class C46984a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i11) {
                return new a[i11];
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new a(C27572a.CREATOR.createFromParcel(parcel));
            }
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ a m68397a(a aVar, C27572a c27572a, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                c27572a = aVar.f56309a;
            }
            return aVar.m68398a(c27572a);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f56309a, ((a) obj).f56309a);
        }

        public a(@NotNull C27572a countryInfo) {
            Intrinsics.checkNotNullParameter(countryInfo, "countryInfo");
            this.f56309a = countryInfo;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final a m68398a(@NotNull C27572a countryInfo) {
            Intrinsics.checkNotNullParameter(countryInfo, "countryInfo");
            return new a(countryInfo);
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final C27572a m68400b() {
            return this.f56309a;
        }

        public int hashCode() {
            return this.f56309a.hashCode();
        }

        @NotNull
        public String toString() {
            return "OutputData(countryInfo=" + this.f56309a + ')';
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final C27572a m68399a() {
            return this.f56309a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel out, int i11) {
            Intrinsics.checkNotNullParameter(out, "out");
            this.f56309a.writeToParcel(out, i11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C27567d(@NotNull InterfaceC42497a countryInteractor) {
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        this.f56307c = countryInteractor;
        this.f56308d = new C27569f(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.revolut.revolutpay.p123ui.picker.InterfaceC27568e
    /* JADX INFO: renamed from: b */
    public void mo68393b(@NotNull String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        C27572a c27572aMo93182a = this.f56307c.mo93182a(CountryCode.INSTANCE.fromValue(listId));
        InterfaceC27570g interfaceC27570gM97872d = m97872d();
        if (interfaceC27570gM97872d != null) {
            interfaceC27570gM97872d.mo68387q(c27572aMo93182a);
        }
    }

    @Override // sa0.AbstractC44371a
    /* JADX INFO: renamed from: e */
    public void mo68337e() {
        if (this.f56308d.m68403a().isEmpty()) {
            m68396i();
            m68395h("");
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m68394g(InterfaceC46115a interfaceC46115a, String str) {
        String strM101628b;
        C46120f c46120f = interfaceC46115a instanceof C46120f ? (C46120f) interfaceC46115a : null;
        if (c46120f == null || (strM101628b = c46120f.m101628b()) == null) {
            return false;
        }
        return StringsKt.contains((CharSequence) strM101628b, (CharSequence) str, true);
    }

    /* JADX INFO: renamed from: i */
    public final void m68396i() {
        List<C27572a> listMo93183a = this.f56307c.mo93183a();
        C27569f c27569f = this.f56308d;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listMo93183a, 10));
        for (C27572a c27572a : listMo93183a) {
            arrayList.add(new C27591a.b(c27572a.m68412d(), new C46120f(c27572a.m68415g(), null, 2, null), new C46120f('+' + c27572a.m68414f(), null, 2, null), new C27591a.a.b(new C46116b(c27572a.m68412d())), null, 16, null));
        }
        c27569f.m68404b(arrayList);
    }

    @Override // com.revolut.revolutpay.p123ui.picker.InterfaceC27568e
    /* JADX INFO: renamed from: a */
    public void mo68392a(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        m68395h(text);
    }

    /* JADX INFO: renamed from: h */
    public final void m68395h(String str) {
        List<C27591a.b> listM68403a;
        if (str.length() == 0) {
            listM68403a = this.f56308d.m68403a();
        } else {
            List<C27591a.b> listM68403a2 = this.f56308d.m68403a();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listM68403a2) {
                C27591a.b bVar = (C27591a.b) obj;
                if (m68394g(bVar.m68507e(), str) || m68394g(bVar.m68506d(), str)) {
                    arrayList.add(obj);
                }
            }
            listM68403a = arrayList;
        }
        InterfaceC27570g interfaceC27570gM97872d = m97872d();
        if (interfaceC27570gM97872d != null) {
            interfaceC27570gM97872d.mo68386a(listM68403a);
        }
    }

    @Override // sa0.AbstractC44371a
    /* JADX INFO: renamed from: f */
    public void mo68338f() {
    }
}
