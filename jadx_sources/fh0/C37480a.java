package fh0;

/* JADX INFO: renamed from: fh0.a */
/* JADX INFO: compiled from: BlockContent.java */
/* JADX INFO: loaded from: classes61.dex */
public class C37480a {

    /* JADX INFO: renamed from: b */
    public int f83095b = 0;

    /* JADX INFO: renamed from: a */
    public final StringBuilder f83094a = new StringBuilder();

    /* JADX INFO: renamed from: a */
    public void m84303a(CharSequence charSequence) {
        if (this.f83095b != 0) {
            this.f83094a.append('\n');
        }
        this.f83094a.append(charSequence);
        this.f83095b++;
    }

    /* JADX INFO: renamed from: b */
    public String m84304b() {
        return this.f83094a.toString();
    }
}
