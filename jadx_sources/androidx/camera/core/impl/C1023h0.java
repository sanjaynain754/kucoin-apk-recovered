package androidx.camera.core.impl;

import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.Iterator;

/* JADX INFO: renamed from: androidx.camera.core.impl.h0 */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class C1023h0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m1970a(CharSequence charSequence, Iterable iterable) {
        if (charSequence == null) {
            throw new NullPointerException(TtmlNode.RUBY_DELIMITER);
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            while (true) {
                sb2.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb2.append(charSequence);
            }
        }
        return sb2.toString();
    }
}
