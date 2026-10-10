package p011a9;

import android.text.Editable;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: a9.a */
/* JADX INFO: compiled from: AutoValue_TextViewAfterTextChangeEvent.java */
/* JADX INFO: loaded from: classes56.dex */
public final class C0201a extends AbstractC0207g {

    /* JADX INFO: renamed from: a */
    public final TextView f602a;

    /* JADX INFO: renamed from: b */
    public final Editable f603b;

    public boolean equals(Object obj) {
        Editable editable;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0207g) {
            AbstractC0207g abstractC0207g = (AbstractC0207g) obj;
            if (this.f602a.equals(abstractC0207g.mo774c()) && ((editable = this.f603b) != null ? editable.equals(abstractC0207g.mo773b()) : abstractC0207g.mo773b() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // p011a9.AbstractC0207g
    @Nullable
    /* JADX INFO: renamed from: b */
    public Editable mo773b() {
        return this.f603b;
    }

    @Override // p011a9.AbstractC0207g
    @NonNull
    /* JADX INFO: renamed from: c */
    public TextView mo774c() {
        return this.f602a;
    }

    public int hashCode() {
        int iHashCode = (this.f602a.hashCode() ^ 1000003) * 1000003;
        Editable editable = this.f603b;
        return iHashCode ^ (editable == null ? 0 : editable.hashCode());
    }

    public String toString() {
        return "TextViewAfterTextChangeEvent{view=" + this.f602a + ", editable=" + ((Object) this.f603b) + "}";
    }

    public C0201a(TextView textView, @Nullable Editable editable) {
        if (textView != null) {
            this.f602a = textView;
            this.f603b = editable;
            return;
        }
        throw new NullPointerException("Null view");
    }
}
