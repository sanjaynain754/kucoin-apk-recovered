package ob0;

import com.squareup.moshi.AbstractC27800f;
import com.squareup.moshi.AbstractC27807m;
import com.squareup.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: renamed from: ob0.a */
/* JADX INFO: compiled from: NullSafeJsonAdapter.java */
/* JADX INFO: loaded from: classes59.dex */
public final class C43011a<T> extends AbstractC27800f<T> {

    /* JADX INFO: renamed from: a */
    public final AbstractC27800f<T> f95181a;

    @Override // com.squareup.moshi.AbstractC27800f
    /* JADX INFO: renamed from: f */
    public void mo68667f(AbstractC27807m abstractC27807m, T t11) throws IOException {
        if (t11 == null) {
            abstractC27807m.mo68718m();
        } else {
            this.f95181a.mo68667f(abstractC27807m, t11);
        }
    }

    public String toString() {
        return this.f95181a + ".nullSafe()";
    }

    public C43011a(AbstractC27800f<T> abstractC27800f) {
        this.f95181a = abstractC27800f;
    }

    @Override // com.squareup.moshi.AbstractC27800f
    /* JADX INFO: renamed from: b */
    public T mo68666b(JsonReader jsonReader) throws IOException {
        if (jsonReader.mo68644v() == JsonReader.Token.NULL) {
            return (T) jsonReader.mo68642p();
        }
        return this.f95181a.mo68666b(jsonReader);
    }
}
