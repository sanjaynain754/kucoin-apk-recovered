package cf0;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: cf0.m */
/* JADX INFO: compiled from: MarkwonVisitorFactory.java */
/* JADX INFO: loaded from: classes60.dex */
public abstract class AbstractC4958m {

    /* JADX INFO: renamed from: cf0.m$a */
    /* JADX INFO: compiled from: MarkwonVisitorFactory.java */
    public class a extends AbstractC4958m {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC4957l.b f5528a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C4952g f5529b;

        public a(InterfaceC4957l.b bVar, C4952g c4952g) {
            this.f5528a = bVar;
            this.f5529b = c4952g;
        }

        @Override // cf0.AbstractC4958m
        @NonNull
        /* JADX INFO: renamed from: a */
        public InterfaceC4957l mo5211a() {
            return this.f5528a.mo5206a(this.f5529b, new C4963r());
        }
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public abstract InterfaceC4957l mo5211a();

    @NonNull
    /* JADX INFO: renamed from: b */
    public static AbstractC4958m m5210b(@NonNull InterfaceC4957l.b bVar, @NonNull C4952g c4952g) {
        return new a(bVar, c4952g);
    }
}
